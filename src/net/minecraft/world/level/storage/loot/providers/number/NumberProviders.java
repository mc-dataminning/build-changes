package net.minecraft.world.level.storage.loot.providers.number;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.List;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootPredicates;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;

public class NumberProviders {
   public static final Codec<NumberProvider> DIRECT_CODEC = Codec.lazyInitialized(
      () -> {
         Codec<NumberProvider> typedCodec = BuiltInRegistries.LOOT_NUMBER_PROVIDER_TYPE.byNameCodec().dispatch(NumberProvider::codec, c -> c);
         return Codec.either(ConstantValue.INLINE_CODEC, typedCodec)
            .xmap(Either::unwrap, provider -> provider instanceof ConstantValue constant ? Either.left(constant) : Either.right(provider));
      }
   );
   public static final Codec<Holder<NumberProvider>> CODEC = RegistryCodecs.holder(Registries.NUMBER_PROVIDER, DIRECT_CODEC);
   public static final Codec<HolderSet<NumberProvider>> LIST_CODEC = RegistryCodecs.holderSet(Registries.NUMBER_PROVIDER, DIRECT_CODEC);
   public static final ResourceKey<NumberProvider> COMPOSTABLE_LOW = createKey("compostable/low");
   public static final ResourceKey<NumberProvider> COMPOSTABLE_LOW_MEDIUM = createKey("compostable/low_medium");
   public static final ResourceKey<NumberProvider> COMPOSTABLE_MEDIUM = createKey("compostable/medium");
   public static final ResourceKey<NumberProvider> COMPOSTABLE_MEDIUM_HIGH = createKey("compostable/medium_high");
   public static final ResourceKey<NumberProvider> COMPOSTABLE_ALWAYS_ADD_ONE = createKey("compostable/always_add_one");
   public static final ResourceKey<NumberProvider> COOKING_TIME_BAMBOO = createKey("cooking/time_bamboo");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOL_SLABS = createKey("cooking/time_wool_slabs");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOL_CARPETS = createKey("cooking/time_wool_carpets");
   public static final ResourceKey<NumberProvider> COOKING_TIME_DRY_PLANTS = createKey("cooking/time_dry_plants");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL = createKey("cooking/time_wood_items_extra_small");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOL = createKey("cooking/time_wool");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOD_SLABS = createKey("cooking/time_wood_slabs");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOD_ITEMS_LARGE = createKey("cooking/time_wood_items_large");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOD_ITEMS_SMALL = createKey("cooking/time_wood_items_small");
   public static final ResourceKey<NumberProvider> COOKING_TIME_ROOTS = createKey("cooking/time_roots");
   public static final ResourceKey<NumberProvider> COOKING_TIME_WOOD_BLOCKS = createKey("cooking/time_wood_blocks");
   public static final ResourceKey<NumberProvider> COOKING_TIME_HANGING_SIGNS = createKey("cooking/time_hanging_signs");
   public static final ResourceKey<NumberProvider> COOKING_TIME_BOATS = createKey("cooking/time_boats");
   public static final ResourceKey<NumberProvider> COOKING_TIME_COAL = createKey("cooking/time_coal");
   public static final ResourceKey<NumberProvider> COOKING_TIME_BLAZE_ROD = createKey("cooking/time_blaze_rod");
   public static final ResourceKey<NumberProvider> COOKING_TIME_DRIED_KELP_BLOCK = createKey("cooking/time_dried_kelp_block");
   public static final ResourceKey<NumberProvider> COOKING_TIME_COAL_BLOCK = createKey("cooking/time_coal_block");
   public static final ResourceKey<NumberProvider> COOKING_TIME_LAVA_BUCKET = createKey("cooking/time_lava_bucket");
   public static final ResourceKey<NumberProvider> COOKING_DEFAULT_SPEED_MULTIPLIER = createKey("cooking/speed_default");
   public static final ResourceKey<NumberProvider> COOKING_NORMAL_SPEED_MULTIPLIER = createKey("cooking/normal_speed_multiplier");
   public static final ResourceKey<NumberProvider> COOKING_FAST_SPEED_MULTIPLIER = createKey("cooking/fast_speed_multiplier");
   public static final ResourceKey<NumberProvider> COOKING_NORMAL_BURN_TIME_MULTIPLIER = createKey("cooking/normal_burn_time_multiplier");
   public static final ResourceKey<NumberProvider> COOKING_FAST_BURN_TIME_MULTIPLIER = createKey("cooking/fast_burn_time_multiplier");
   public static final ResourceKey<NumberProvider> BREWING_DEFAULT_SPEED_MULTIPLIER = createKey("brewing/speed_default");
   public static final ResourceKey<NumberProvider> BREWING_DEFAULT_USES = createKey("brewing/uses_default");

   private static ResourceKey<NumberProvider> createKey(final String location) {
      return ResourceKey.create(Registries.NUMBER_PROVIDER, Identifier.withDefaultNamespace(location));
   }

   public static void bootstrap(final BootstrapContext<NumberProvider> context) {
      HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);
      HolderGetter<LootItemCondition> predicates = context.lookup(Registries.PREDICATE);
      Holder.Reference<NumberProvider> normalSpeed = context.register(COOKING_NORMAL_SPEED_MULTIPLIER, new ConstantValue(1.0F));
      Holder.Reference<NumberProvider> fastSpeed = context.register(COOKING_FAST_SPEED_MULTIPLIER, new ConstantValue(2.0F));
      Holder.Reference<NumberProvider> normalBurnTime = context.register(COOKING_NORMAL_BURN_TIME_MULTIPLIER, new ConstantValue(1.0F));
      Holder.Reference<NumberProvider> fastBurnTime = context.register(COOKING_FAST_BURN_TIME_MULTIPLIER, new ConstantValue(0.5F));
      context.register(COMPOSTABLE_LOW, compostable(blocks, 30));
      context.register(COMPOSTABLE_LOW_MEDIUM, compostable(blocks, 50));
      context.register(COMPOSTABLE_MEDIUM, compostable(blocks, 65));
      context.register(COMPOSTABLE_MEDIUM_HIGH, compostable(blocks, 85));
      context.register(COMPOSTABLE_ALWAYS_ADD_ONE, compostable(blocks, 100));
      context.register(COOKING_TIME_BAMBOO, cooking(predicates, normalBurnTime, fastBurnTime, 50));
      context.register(COOKING_TIME_WOOL_SLABS, cooking(predicates, normalBurnTime, fastBurnTime, 50));
      context.register(COOKING_TIME_WOOL_CARPETS, cooking(predicates, normalBurnTime, fastBurnTime, 67));
      context.register(COOKING_TIME_DRY_PLANTS, cooking(predicates, normalBurnTime, fastBurnTime, 100));
      context.register(COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL, cooking(predicates, normalBurnTime, fastBurnTime, 100));
      context.register(COOKING_TIME_WOOL, cooking(predicates, normalBurnTime, fastBurnTime, 100));
      context.register(COOKING_TIME_WOOD_SLABS, cooking(predicates, normalBurnTime, fastBurnTime, 150));
      context.register(COOKING_TIME_WOOD_ITEMS_LARGE, cooking(predicates, normalBurnTime, fastBurnTime, 200));
      context.register(COOKING_TIME_ROOTS, cooking(predicates, normalBurnTime, fastBurnTime, 300));
      context.register(COOKING_TIME_WOOD_BLOCKS, cooking(predicates, normalBurnTime, fastBurnTime, 300));
      context.register(COOKING_TIME_WOOD_ITEMS_SMALL, cooking(predicates, normalBurnTime, fastBurnTime, 300));
      context.register(COOKING_TIME_HANGING_SIGNS, cooking(predicates, normalBurnTime, fastBurnTime, 800));
      context.register(COOKING_TIME_BOATS, cooking(predicates, normalBurnTime, fastBurnTime, 1200));
      context.register(COOKING_TIME_COAL, cooking(predicates, normalBurnTime, fastBurnTime, 1600));
      context.register(COOKING_TIME_BLAZE_ROD, cooking(predicates, normalBurnTime, fastBurnTime, 2400));
      context.register(COOKING_TIME_DRIED_KELP_BLOCK, cooking(predicates, normalBurnTime, fastBurnTime, 4001));
      context.register(COOKING_TIME_COAL_BLOCK, cooking(predicates, normalBurnTime, fastBurnTime, 16000));
      context.register(COOKING_TIME_LAVA_BUCKET, cooking(predicates, normalBurnTime, fastBurnTime, 20000));
      context.register(BREWING_DEFAULT_SPEED_MULTIPLIER, new ConstantValue(1.0F));
      context.register(BREWING_DEFAULT_USES, new ConstantValue(20.0F));
      Holder<LootItemCondition> fasterCookingBlocks = predicates.getOrThrow(LootPredicates.FAST_FURNACE);
      ConditionalValue cookingSpeed = new ConditionalValue(fasterCookingBlocks, fastSpeed, normalSpeed);
      context.register(COOKING_DEFAULT_SPEED_MULTIPLIER, cookingSpeed);
   }

   private static NumberProvider compostable(final HolderGetter<Block> blocks, final int layerIncreaseChance) {
      if (layerIncreaseChance >= 100) {
         return new ConstantValue(1.0F);
      } else {
         NumberDispatcher.Case emptyCase = new NumberDispatcher.Case(
            Holder.direct(
               MatchBlock.blockMatches(blocks, Blocks.COMPOSTER, StatePropertiesPredicate.Builder.properties().hasProperty(ComposterBlock.LEVEL, 0)).build()
            ),
            ConstantValue.exactly(1.0F)
         );
         return new NumberDispatcher(
            List.of(emptyCase),
            Holder.direct(
               new WeightedListValue(
                  WeightedList.<Holder<NumberProvider>>builder()
                     .add(ConstantValue.exactly(1.0F), layerIncreaseChance)
                     .add(ConstantValue.exactly(0.0F), 100 - layerIncreaseChance)
                     .build()
               )
            )
         );
      }
   }

   private static NumberProvider cooking(
      final HolderGetter<LootItemCondition> predicates,
      final Holder.Reference<NumberProvider> normalBurnTime,
      final Holder.Reference<NumberProvider> fastBurnTime,
      final int timeSeconds
   ) {
      Holder<LootItemCondition> fasterCookingBlocks = predicates.getOrThrow(LootPredicates.FAST_FURNACE);
      return new ConditionalValue(
         fasterCookingBlocks,
         Product.product(ConstantValue.exactly((float)timeSeconds), fastBurnTime),
         Product.product(ConstantValue.exactly((float)timeSeconds), normalBurnTime)
      );
   }
}
