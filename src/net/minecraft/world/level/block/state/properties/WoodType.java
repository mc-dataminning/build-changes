package net.minecraft.world.level.block.state.properties;

import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.sounds.BlockSoundSet;
import net.minecraft.world.level.block.sounds.BlockSoundSets;

public record WoodType(
   String name,
   BlockSetType setType,
   ResourceKey<BlockSoundSet> blockSoundSet,
   ResourceKey<BlockSoundSet> hangingSignSoundSet,
   SoundEvent fenceGateClose,
   SoundEvent fenceGateOpen
) {
   public static final WoodType OAK = new WoodType("oak", BlockSetType.DEFAULT_WOOD);
   public static final WoodType SPRUCE = new WoodType("spruce", BlockSetType.DEFAULT_WOOD);
   public static final WoodType BIRCH = new WoodType("birch", BlockSetType.DEFAULT_WOOD);
   public static final WoodType ACACIA = new WoodType("acacia", BlockSetType.DEFAULT_WOOD);
   public static final WoodType CHERRY = new WoodType(
      "cherry",
      BlockSetType.CHERRY,
      BlockSoundSets.CHERRY_WOOD,
      BlockSoundSets.CHERRY_WOOD_HANGING_SIGN,
      SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE,
      SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN
   );
   public static final WoodType JUNGLE = new WoodType("jungle", BlockSetType.DEFAULT_WOOD);
   public static final WoodType DARK_OAK = new WoodType("dark_oak", BlockSetType.DEFAULT_WOOD);
   public static final WoodType PALE_OAK = new WoodType("pale_oak", BlockSetType.DEFAULT_WOOD);
   public static final WoodType POPLAR = new WoodType("poplar", BlockSetType.DEFAULT_WOOD);
   public static final WoodType CRIMSON = new WoodType(
      "crimson",
      BlockSetType.CRIMSON,
      BlockSoundSets.NETHER_WOOD,
      BlockSoundSets.NETHER_WOOD_HANGING_SIGN,
      SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE,
      SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN
   );
   public static final WoodType WARPED = new WoodType(
      "warped",
      BlockSetType.WARPED,
      BlockSoundSets.NETHER_WOOD,
      BlockSoundSets.NETHER_WOOD_HANGING_SIGN,
      SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE,
      SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN
   );
   public static final WoodType MANGROVE = new WoodType("mangrove", BlockSetType.DEFAULT_WOOD);
   public static final WoodType BAMBOO = new WoodType(
      "bamboo",
      BlockSetType.BAMBOO,
      BlockSoundSets.BAMBOO_WOOD,
      BlockSoundSets.BAMBOO_WOOD_HANGING_SIGN,
      SoundEvents.BAMBOO_WOOD_FENCE_GATE_CLOSE,
      SoundEvents.BAMBOO_WOOD_FENCE_GATE_OPEN
   );

   public WoodType(final String name, final BlockSetType setType) {
      this(name, setType, BlockSoundSets.WOOD, BlockSoundSets.HANGING_SIGN, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
   }
}
