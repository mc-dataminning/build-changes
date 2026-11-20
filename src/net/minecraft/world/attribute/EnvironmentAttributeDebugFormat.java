package net.minecraft.world.attribute;

import com.mojang.serialization.JavaOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.Music;
import net.minecraft.util.random.Weighted;
import net.minecraft.world.attribute.modifier.AttributeModifier;
import net.minecraft.world.attribute.modifier.FloatWithAlpha;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public final class EnvironmentAttributeDebugFormat {
   private EnvironmentAttributeDebugFormat() {
   }

   public static <Value> String describeModifier(final AttributeType<Value> type, final AttributeModifier<?, ?> modifier, final Object argument) {
      Object operation = type.modifierCodec().encodeStart(JavaOps.INSTANCE, modifier).getOrThrow();
      return operation + "(" + describeValue(argument) + ")";
   }

   public static String describeValue(final Object value) {
      return switch (value) {
         case Float f -> formatFixed(f.floatValue());
         case Double d -> formatFixed(d);
         case FloatWithAlpha v -> "(" + formatFixed(v.value()) + ", alpha=" + formatFixed(v.alpha()) + ")";
         case Vector3fc v -> "(" + formatFixed(v.x()) + ", " + formatFixed(v.y()) + ", " + formatFixed(v.z()) + ")";
         case Vector4fc v -> "(" + formatFixed(v.x()) + ", " + formatFixed(v.y()) + ", " + formatFixed(v.z()) + ", " + formatFixed(v.w()) + ")";
         case AmbientParticle particle -> describeAmbientParticle(particle);
         case AmbientSounds sounds -> describeAmbientSounds(sounds);
         case BackgroundMusic music -> describeBackgroundMusic(music);
         case BedRule bedRule -> describeBedRule(bedRule);
         case MobSpawnSettings spawnSettings -> describeMobSpawnSettings(spawnSettings);
         case List<?> list -> list.isEmpty()
            ? "none"
            : (String)list.stream().map(EnvironmentAttributeDebugFormat::describeValue).collect(Collectors.joining("; "));
         default -> String.valueOf(value);
      };
   }

   private static String formatFixed(final double value) {
      return String.format(Locale.ROOT, "%.4f", value);
   }

   private static String describeAmbientParticle(final AmbientParticle particle) {
      return BuiltInRegistries.PARTICLE_TYPE.getKey(particle.particle().getType()) + ", " + particle.probability();
   }

   private static String describeAmbientSounds(final AmbientSounds sounds) {
      List<String> values = new ArrayList<>();
      sounds.loop().ifPresent(sound -> values.add("loop: " + sound.getRegisteredName()));
      sounds.mood()
         .ifPresent(
            settingsx -> values.add(
               "mood: "
                  + settingsx.soundEvent().getRegisteredName()
                  + " (delay: "
                  + settingsx.tickDelay()
                  + ", search: "
                  + settingsx.blockSearchExtent()
                  + ", offset: "
                  + settingsx.soundPositionOffset()
                  + ")"
            )
         );

      for (AmbientAdditionsSettings settings : sounds.additions()) {
         values.add("addition: " + settings.soundEvent().getRegisteredName() + " (chance: " + settings.tickChance() + ")");
      }

      return values.isEmpty() ? "none" : String.join("; ", values);
   }

   private static String describeBackgroundMusic(final BackgroundMusic music) {
      List<String> values = new ArrayList<>();
      music.defaultMusic().ifPresent(value -> values.add(describeMusic("default", value)));
      music.creativeMusic().ifPresent(value -> values.add(describeMusic("creative", value)));
      music.underwaterMusic().ifPresent(value -> values.add(describeMusic("underwater", value)));
      return values.isEmpty() ? "none" : String.join("; ", values);
   }

   private static String describeMusic(final String label, final Music music) {
      return label
         + ": "
         + music.sound().getRegisteredName()
         + " (delay: "
         + music.minDelay()
         + "-"
         + music.maxDelay()
         + ", replace: "
         + music.replaceCurrentMusic()
         + ")";
   }

   private static String describeBedRule(final BedRule bedRule) {
      StringBuilder value = new StringBuilder()
         .append("sleep: ")
         .append(bedRule.canSleep().getSerializedName())
         .append(", set spawn: ")
         .append(bedRule.canSetSpawn().getSerializedName())
         .append(", destroy on use: ")
         .append(bedRule.destroyOnUse())
         .append(", destroy on leave: ")
         .append(bedRule.destroyOnLeave());
      bedRule.errorMessage().ifPresent(message -> value.append(", error: ").append(message.getString()));
      return value.toString();
   }

   private static String describeMobSpawnSettings(final MobSpawnSettings spawnSettings) {
      if (spawnSettings.definedCategories().isEmpty()) {
         return "no spawns";
      }

      StringBuilder builder = new StringBuilder();

      for (MobCategory category : spawnSettings.definedCategories()) {
         if (!builder.isEmpty()) {
            builder.append("; ");
         }

         List<Weighted<MobSpawnSettings.SpawnerData>> entries = spawnSettings.getMobsToSpawn(category).unwrap();
         int totalWeight = entries.stream().mapToInt(Weighted::weight).sum();
         builder.append(category.getSerializedName()).append(": [");
         boolean first = true;

         for (Weighted<MobSpawnSettings.SpawnerData> weighted : entries) {
            if (!first) {
               builder.append(", ");
            }

            int share = totalWeight == 0 ? 0 : Math.round(100.0F * weighted.weight() / totalWeight);
            builder.append(weighted.value()).append(" x").append(weighted.weight()).append(" (").append(share).append("%)");
            first = false;
         }

         builder.append(']');
      }

      spawnSettings.allSpawnCosts()
         .forEach(
            (type, cost) -> builder.append("; cost/")
               .append(EntityType.getKey((EntityType<?>)type))
               .append(": energy ")
               .append(cost.energyBudget())
               .append(", charge ")
               .append(cost.charge())
         );
      return builder.toString();
   }
}
