package net.minecraft.world.entity.ai.village.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.DevUtil;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

public class PoiTypes {
   private static final Map<BlockState, Holder<PoiType>> TYPE_BY_STATE = new HashMap<>();
   private static final Set<BlockState> BEDS = Blocks.BED
      .asList()
      .stream()
      .flatMap(block -> block.getStateDefinition().getPossibleStates().stream())
      .filter(state -> state.getValue(BedBlock.PART) == BedPart.HEAD)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<BlockState> CAULDRONS = ImmutableList.of(Blocks.CAULDRON, Blocks.LAVA_CAULDRON, Blocks.WATER_CAULDRON, Blocks.POWDER_SNOW_CAULDRON)
      .stream()
      .flatMap(block -> block.getStateDefinition().getPossibleStates().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<BlockState> LIGHTNING_RODS = Blocks.LIGHTNING_ROD
      .asList()
      .stream()
      .flatMap(block -> block.getStateDefinition().getPossibleStates().stream())
      .collect(ImmutableSet.toImmutableSet());
   public static final Holder<PoiType> ARMORER = register(PoiTypeIds.ARMORER, getBlockStates(Blocks.BLAST_FURNACE), 1, 1);
   public static final Holder<PoiType> BUTCHER = register(PoiTypeIds.BUTCHER, getBlockStates(Blocks.SMOKER), 1, 1);
   public static final Holder<PoiType> CARTOGRAPHER = register(PoiTypeIds.CARTOGRAPHER, getBlockStates(Blocks.CARTOGRAPHY_TABLE), 1, 1);
   public static final Holder<PoiType> CLERIC = register(PoiTypeIds.CLERIC, getBlockStates(Blocks.BREWING_STAND), 1, 1);
   public static final Holder<PoiType> FARMER = register(PoiTypeIds.FARMER, getBlockStates(Blocks.COMPOSTER), 1, 1);
   public static final Holder<PoiType> FISHERMAN = register(PoiTypeIds.FISHERMAN, getBlockStates(Blocks.BARREL), 1, 1);
   public static final Holder<PoiType> FLETCHER = register(PoiTypeIds.FLETCHER, getBlockStates(Blocks.FLETCHING_TABLE), 1, 1);
   public static final Holder<PoiType> LEATHERWORKER = register(PoiTypeIds.LEATHERWORKER, CAULDRONS, 1, 1);
   public static final Holder<PoiType> LIBRARIAN = register(PoiTypeIds.LIBRARIAN, getBlockStates(Blocks.LECTERN), 1, 1);
   public static final Holder<PoiType> MASON = register(PoiTypeIds.MASON, getBlockStates(Blocks.STONECUTTER), 1, 1);
   public static final Holder<PoiType> SHEPHERD = register(PoiTypeIds.SHEPHERD, getBlockStates(Blocks.LOOM), 1, 1);
   public static final Holder<PoiType> TOOLSMITH = register(PoiTypeIds.TOOLSMITH, getBlockStates(Blocks.SMITHING_TABLE), 1, 1);
   public static final Holder<PoiType> WEAPONSMITH = register(PoiTypeIds.WEAPONSMITH, getBlockStates(Blocks.GRINDSTONE), 1, 1);
   public static final Holder<PoiType> HOME = register(PoiTypeIds.HOME, BEDS, 1, 1);
   public static final Holder<PoiType> MEETING = register(PoiTypeIds.MEETING, getBlockStates(Blocks.BELL), 32, 6);
   public static final Holder<PoiType> BEEHIVE = register(PoiTypeIds.BEEHIVE, getBlockStates(Blocks.BEEHIVE), 0, 1);
   public static final Holder<PoiType> BEE_NEST = register(PoiTypeIds.BEE_NEST, getBlockStates(Blocks.BEE_NEST), 0, 1);
   public static final Holder<PoiType> NETHER_PORTAL = register(PoiTypeIds.NETHER_PORTAL, getBlockStates(Blocks.NETHER_PORTAL), 0, 1);
   public static final Holder<PoiType> LODESTONE = register(PoiTypeIds.LODESTONE, getBlockStates(Blocks.LODESTONE), 0, 1);
   public static final Holder<PoiType> LIGHTNING_ROD = register(PoiTypeIds.LIGHTNING_ROD, LIGHTNING_RODS, 0, 1);
   public static final Holder<PoiType> TEST_INSTANCE = register(PoiTypeIds.TEST_INSTANCE, getBlockStates(Blocks.TEST_INSTANCE_BLOCK), 0, 1);

   private static Set<BlockState> getBlockStates(final Block block) {
      return ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates());
   }

   private static Holder<PoiType> register(final ResourceKey<PoiType> key, final Set<BlockState> matchingStates, final int maxTickets, final int validRange) {
      PoiType poiType = new PoiType(matchingStates, maxTickets, validRange);
      Holder.Reference<PoiType> value = Registry.registerForHolder(BuiltInRegistries.POINT_OF_INTEREST_TYPE, key, poiType);
      registerBlockStates(value, matchingStates);
      return value;
   }

   private static void registerBlockStates(final Holder<PoiType> type, final Set<BlockState> matchingStates) {
      matchingStates.forEach(
         blockState -> {
            Holder<PoiType> previous = TYPE_BY_STATE.put(blockState, type);
            if (previous != null) {
               throw (IllegalStateException)DevUtil.pauseInIde(
                  new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", blockState))
               );
            }
         }
      );
   }

   public static Optional<Holder<PoiType>> forState(final BlockState state) {
      return Optional.ofNullable(TYPE_BY_STATE.get(state));
   }

   public static boolean hasPoi(final BlockState state) {
      return TYPE_BY_STATE.containsKey(state);
   }
}
