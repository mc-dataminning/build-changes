package net.minecraft.world.level.levelgen;

import com.mojang.serialization.Codec;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.Util;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.DimensionType;

public record VerticalAnchor(VerticalAnchor.Type type, int offset) {
   private static final Codec<Integer> OFFSET_CODEC = Codec.intRange(DimensionType.MIN_Y, DimensionType.MAX_Y);
   public static final Codec<VerticalAnchor> CODEC = ExtraCodecs.singleKeyDispatch(
      VerticalAnchor.Type.CODEC,
      VerticalAnchor::type,
      Util.memoize(type -> OFFSET_CODEC.xmap(offset -> new VerticalAnchor(type, offset), VerticalAnchor::offset))
   );
   private static final VerticalAnchor BOTTOM = aboveBottom(0);
   private static final VerticalAnchor TOP = belowTop(0);

   public static VerticalAnchor absolute(final int value) {
      return new VerticalAnchor(VerticalAnchor.Type.ABSOLUTE, value);
   }

   public static VerticalAnchor aboveBottom(final int offset) {
      return new VerticalAnchor(VerticalAnchor.Type.ABOVE_BOTTOM, offset);
   }

   public static VerticalAnchor belowTop(final int offset) {
      return new VerticalAnchor(VerticalAnchor.Type.BELOW_TOP, offset);
   }

   public static VerticalAnchor bottom() {
      return BOTTOM;
   }

   public static VerticalAnchor top() {
      return TOP;
   }

   public static VerticalAnchor relativeToSeaLevel(final int offset) {
      return new VerticalAnchor(VerticalAnchor.Type.RELATIVE_TO_SEA_LEVEL, offset);
   }

   public static VerticalAnchor seaLevel() {
      return relativeToSeaLevel(0);
   }

   public int resolveY(final VerticalAnchor.Context context) {
      return switch (this.type) {
         case ABSOLUTE -> this.offset;
         case ABOVE_BOTTOM -> context.minY() + this.offset;
         case BELOW_TOP -> context.maxY() - this.offset;
         case RELATIVE_TO_SEA_LEVEL -> context.seaLevel() + this.offset;
      };
   }

   @Override
   public String toString() {
      return this.offset + " " + this.type.getSerializedName();
   }

   public record Context(int minY, int height, int seaLevel) {
      public static VerticalAnchor.Context from(final LevelAccessor level) {
         return level instanceof WorldGenLevel worldGenLevel
            ? from(worldGenLevel.getLevel().getChunkSource().getGenerator(), level)
            : new VerticalAnchor.Context(level.getMinY(), level.getHeight(), level.getSeaLevel());
      }

      public static VerticalAnchor.Context from(final ChunkGenerator generator, final LevelHeightAccessor heightAccessor) {
         return new VerticalAnchor.Context(
            Math.max(heightAccessor.getMinY(), generator.getMinY()), Math.min(heightAccessor.getHeight(), generator.getGenDepth()), generator.getSeaLevel()
         );
      }

      public int maxY() {
         return this.minY + this.height - 1;
      }
   }

   public enum Type implements StringRepresentable {
      ABSOLUTE("absolute"),
      ABOVE_BOTTOM("above_bottom"),
      BELOW_TOP("below_top"),
      RELATIVE_TO_SEA_LEVEL("relative_to_sea_level");

      public static final Codec<VerticalAnchor.Type> CODEC = StringRepresentable.fromEnum(VerticalAnchor.Type::values);
      private final String name;

      Type(final String name) {
         this.name = name;
      }

      @Override
      public String getSerializedName() {
         return this.name;
      }
   }
}
