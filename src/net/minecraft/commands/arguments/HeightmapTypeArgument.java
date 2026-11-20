package net.minecraft.commands.arguments;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Locale;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.levelgen.Heightmap;

public class HeightmapTypeArgument extends StringRepresentableArgument<Heightmap.Types> {
   public static final HeightmapTypeArgument INSTANCE = new HeightmapTypeArgument();
   public static final SerializableArgument.Type<HeightmapTypeArgument> TYPE = SerializableArgument.singletonType(INSTANCE);

   private static Heightmap.Types[] keptTypes() {
      return Arrays.stream(Heightmap.Types.values()).filter(Heightmap.Types::keepAfterWorldgen).toArray(Heightmap.Types[]::new);
   }

   private HeightmapTypeArgument() {
      super(StringRepresentable.fromEnumWithMapping(HeightmapTypeArgument::keptTypes, s -> s.toLowerCase(Locale.ROOT)), HeightmapTypeArgument::keptTypes);
   }

   @Override
   public SerializableArgument.Type<HeightmapTypeArgument> type() {
      return TYPE;
   }

   public static ArgumentType<Heightmap.Types> heightmap() {
      return INSTANCE.toBrigadier();
   }

   public static Heightmap.Types getHeightmap(final CommandContext<?> context, final String name) {
      return (Heightmap.Types)context.getArgument(name, Heightmap.Types.class);
   }

   @Override
   protected String convertId(final String id) {
      return id.toLowerCase(Locale.ROOT);
   }
}
