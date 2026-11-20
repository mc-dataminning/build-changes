package net.minecraft.world.level.block.state.properties;

import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.sounds.BlockSoundSet;
import net.minecraft.world.level.block.sounds.BlockSoundSets;

public record BlockSetType(
   boolean canOpenByHand,
   boolean canOpenByWindCharge,
   boolean canButtonBeActivatedByArrows,
   BlockSetType.PressurePlateSensitivity pressurePlateSensitivity,
   ResourceKey<BlockSoundSet> blockSoundSet,
   SoundEvent doorClose,
   SoundEvent doorOpen,
   SoundEvent trapdoorClose,
   SoundEvent trapdoorOpen,
   SoundEvent pressurePlateClickOff,
   SoundEvent pressurePlateClickOn,
   SoundEvent buttonClickOff,
   SoundEvent buttonClickOn
) {
   public static final BlockSetType DEFAULT_WOOD = new BlockSetType(
      true,
      true,
      true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.WOOD,
      SoundEvents.WOODEN_DOOR_CLOSE,
      SoundEvents.WOODEN_DOOR_OPEN,
      SoundEvents.WOODEN_TRAPDOOR_CLOSE,
      SoundEvents.WOODEN_TRAPDOOR_OPEN,
      SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.WOODEN_BUTTON_CLICK_OFF,
      SoundEvents.WOODEN_BUTTON_CLICK_ON
   );
   public static final BlockSetType IRON = new BlockSetType(
      false,
      false,
      false,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.IRON,
      SoundEvents.IRON_DOOR_CLOSE,
      SoundEvents.IRON_DOOR_OPEN,
      SoundEvents.IRON_TRAPDOOR_CLOSE,
      SoundEvents.IRON_TRAPDOOR_OPEN,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.STONE_BUTTON_CLICK_OFF,
      SoundEvents.STONE_BUTTON_CLICK_ON
   );
   public static final BlockSetType COPPER = new BlockSetType(
      true,
      true,
      false,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.COPPER,
      SoundEvents.COPPER_DOOR_CLOSE,
      SoundEvents.COPPER_DOOR_OPEN,
      SoundEvents.COPPER_TRAPDOOR_CLOSE,
      SoundEvents.COPPER_TRAPDOOR_OPEN,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.STONE_BUTTON_CLICK_OFF,
      SoundEvents.STONE_BUTTON_CLICK_ON
   );
   public static final BlockSetType GOLD = new BlockSetType(
      false,
      true,
      false,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.METAL,
      SoundEvents.IRON_DOOR_CLOSE,
      SoundEvents.IRON_DOOR_OPEN,
      SoundEvents.IRON_TRAPDOOR_CLOSE,
      SoundEvents.IRON_TRAPDOOR_OPEN,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.STONE_BUTTON_CLICK_OFF,
      SoundEvents.STONE_BUTTON_CLICK_ON
   );
   public static final BlockSetType STONE = new BlockSetType(
      true,
      true,
      false,
      BlockSetType.PressurePlateSensitivity.MOBS,
      BlockSoundSets.STONE,
      SoundEvents.IRON_DOOR_CLOSE,
      SoundEvents.IRON_DOOR_OPEN,
      SoundEvents.IRON_TRAPDOOR_CLOSE,
      SoundEvents.IRON_TRAPDOOR_OPEN,
      SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.STONE_BUTTON_CLICK_OFF,
      SoundEvents.STONE_BUTTON_CLICK_ON
   );
   public static final BlockSetType POLISHED_BLACKSTONE = new BlockSetType(
      true,
      true,
      false,
      BlockSetType.PressurePlateSensitivity.MOBS,
      BlockSoundSets.STONE,
      SoundEvents.IRON_DOOR_CLOSE,
      SoundEvents.IRON_DOOR_OPEN,
      SoundEvents.IRON_TRAPDOOR_CLOSE,
      SoundEvents.IRON_TRAPDOOR_OPEN,
      SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.STONE_BUTTON_CLICK_OFF,
      SoundEvents.STONE_BUTTON_CLICK_ON
   );
   public static final BlockSetType CHERRY = new BlockSetType(
      true,
      true,
      true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.CHERRY_WOOD,
      SoundEvents.CHERRY_WOOD_DOOR_CLOSE,
      SoundEvents.CHERRY_WOOD_DOOR_OPEN,
      SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE,
      SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
      SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF,
      SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON
   );
   public static final BlockSetType CRIMSON = new BlockSetType(
      true,
      true,
      true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.NETHER_WOOD,
      SoundEvents.NETHER_WOOD_DOOR_CLOSE,
      SoundEvents.NETHER_WOOD_DOOR_OPEN,
      SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE,
      SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON
   );
   public static final BlockSetType WARPED = new BlockSetType(
      true,
      true,
      true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.NETHER_WOOD,
      SoundEvents.NETHER_WOOD_DOOR_CLOSE,
      SoundEvents.NETHER_WOOD_DOOR_OPEN,
      SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE,
      SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON
   );
   public static final BlockSetType BAMBOO = new BlockSetType(
      true,
      true,
      true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      BlockSoundSets.BAMBOO_WOOD,
      SoundEvents.BAMBOO_WOOD_DOOR_CLOSE,
      SoundEvents.BAMBOO_WOOD_DOOR_OPEN,
      SoundEvents.BAMBOO_WOOD_TRAPDOOR_CLOSE,
      SoundEvents.BAMBOO_WOOD_TRAPDOOR_OPEN,
      SoundEvents.BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF,
      SoundEvents.BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.BAMBOO_WOOD_BUTTON_CLICK_OFF,
      SoundEvents.BAMBOO_WOOD_BUTTON_CLICK_ON
   );

   public enum PressurePlateSensitivity {
      EVERYTHING,
      MOBS;
   }
}
