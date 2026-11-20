package net.minecraft.client.gui.components.debug;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.util.ARGB;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.EnvironmentAttributeDebugFormat;
import net.minecraft.world.attribute.EnvironmentAttributeDebugger;
import net.minecraft.world.attribute.EnvironmentAttributeLayerValues;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public class DebugEntryEnvironmentAttribute implements DebugScreenEntry {
   private static final DebugGroup GROUP = DebugGroup.Builder.titled("Environment Attribute").build();
   private static final int MAX_LENGTH = 100;
   private static @Nullable EnvironmentAttribute<?> attribute;

   public static @Nullable EnvironmentAttribute<?> getAttribute() {
      return attribute;
   }

   public static void setAttribute(final @Nullable EnvironmentAttribute<?> attribute) {
      DebugEntryEnvironmentAttribute.attribute = attribute;
   }

   @Override
   public boolean isAllowed(final boolean reducedDebugInfo) {
      return !reducedDebugInfo && Minecraft.getInstance().canUseRestrictedDebugFeatures();
   }

   @Override
   public void display(
      final DebugScreenDisplayer displayer,
      final @Nullable Level serverOrClientLevel,
      final @Nullable LevelChunk clientChunk,
      final @Nullable LevelChunk serverChunk
   ) {
      EnvironmentAttribute<?> attribute = DebugEntryEnvironmentAttribute.attribute;
      Minecraft minecraft = Minecraft.getInstance();
      if (attribute != null && minecraft.level != null) {
         displayer.addFactToGroup(
            GROUP,
            "Attribute",
            fact -> fact.value(attribute.toString())
               .text(" (")
               .value(attribute.type().toString())
               .text(", ")
               .value(attribute.isPositional() ? "positional" : "global")
               .text(")")
         );
         Vec3 pos = minecraft.gameRenderer.mainCamera().position();
         EnvironmentAttributeLayerValues layerValues = EnvironmentAttributeDebugger.getValuePerLayer(minecraft.level, attribute, pos);

         for (EnvironmentAttributeLayerValues.LayerValue layer : layerValues.layers()) {
            if (layer.layerIndex() < 0) {
               addToGroup(displayer, minecraft.font, "Default", layer.value(), 100);
            } else {
               addTextToGroup(displayer, minecraft.font, "Layer " + layer.layerIndex(), layer.kind() + (layer.disabled() ? " [disabled]" : ""));
               if (layer.modifier() != null) {
                  addTextToGroup(displayer, minecraft.font, "  Modifier", layer.modifier());
               }

               addToGroup(displayer, minecraft.font, "  After layer", layer.value(), 100);
            }
         }

         addToGroup(displayer, minecraft.font, "Result", layerValues.finalValue(), 100);
         if (!attribute.isSyncable() && minecraft.getSingleplayerServer() == null) {
            addTextToGroup(displayer, minecraft.font, "Non-syncable", "Use /environmentattribute for accurate server sample");
         }
      }
   }

   private static void addTextToGroup(final DebugScreenDisplayer displayer, final Font font, final String name, final String value) {
      displayer.addToGroup(GROUP, new DebugLineWithColorSwatchRenderer(font, formatLine(name, value, 100).result(), null));
   }

   private static void addToGroup(final DebugScreenDisplayer displayer, final Font font, final String name, final Object value, final int maxCharacters) {
      String formattedValue = EnvironmentAttributeDebugFormat.describeValue(value);
      DebugFact fact = formatLine(name, formattedValue, maxCharacters);

      Integer color = switch (value) {
         case Vector3fc rgb -> ARGB.colorFromVector3f(rgb);
         case Vector4fc argb -> ARGB.colorFromVector4f(argb);
         default -> null;
      };
      displayer.addToGroup(GROUP, new DebugLineWithColorSwatchRenderer(font, fact.result(), color));
   }

   static DebugFact formatLine(final String name, final String value, final int maxCharacters) {
      String label = name.replace('\n', ' ').replace('\r', ' ') + ": ";
      String singleLineValue = value.replace('\n', ' ').replace('\r', ' ');
      int labelLength = label.codePointCount(0, label.length());
      int valueLength = singleLineValue.codePointCount(0, singleLineValue.length());
      if ((long)labelLength + valueLength <= maxCharacters) {
         return new DebugFact().text(label).value(singleLineValue);
      }

      int available = maxCharacters - 3;
      return labelLength > available
         ? new DebugFact().text(label.substring(0, label.offsetByCodePoints(0, available))).text("...")
         : new DebugFact().text(label).value(singleLineValue.substring(0, singleLineValue.offsetByCodePoints(0, available - labelLength))).text("...");
   }
}
