package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;

public enum CornersToCheck implements StringRepresentable {
   TOP("top"),
   BOTTOM("bottom"),
   ALL("all");

   private final String name;
   public static final Codec<CornersToCheck> CODEC = StringRepresentable.fromEnum(CornersToCheck::values);

   CornersToCheck(final String name) {
      this.name = name;
   }

   @Override
   public String getSerializedName() {
      return this.name;
   }
}
