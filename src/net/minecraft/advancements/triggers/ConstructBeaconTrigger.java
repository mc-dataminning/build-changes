package net.minecraft.advancements.triggers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class ConstructBeaconTrigger extends SimpleCriterionTrigger<ConstructBeaconTrigger.TriggerInstance> {
   @Override
   public Codec<ConstructBeaconTrigger.TriggerInstance> codec() {
      return ConstructBeaconTrigger.TriggerInstance.CODEC;
   }

   public void trigger(final ServerPlayer player, final int levels) {
      this.trigger(player, t -> t.matches(levels));
   }

   public static record TriggerInstance(Optional<Holder<LootItemCondition>> player, MinMaxBounds.Ints level) implements SimpleCriterionTrigger.SimpleInstance {
      public static final Codec<ConstructBeaconTrigger.TriggerInstance> CODEC = RecordCodecBuilder.create(
         i -> i.group(
                  LootItemCondition.CODEC.optionalFieldOf("player").forGetter(ConstructBeaconTrigger.TriggerInstance::player),
                  MinMaxBounds.Ints.CODEC.optionalFieldOf("level", MinMaxBounds.Ints.ANY).forGetter(ConstructBeaconTrigger.TriggerInstance::level)
               )
               .apply(i, ConstructBeaconTrigger.TriggerInstance::new)
      );

      public static Criterion<ConstructBeaconTrigger.TriggerInstance> constructedBeacon() {
         return CriteriaTriggers.CONSTRUCT_BEACON.createCriterion(new ConstructBeaconTrigger.TriggerInstance(Optional.empty(), MinMaxBounds.Ints.ANY));
      }

      public static Criterion<ConstructBeaconTrigger.TriggerInstance> constructedBeacon(final MinMaxBounds.Ints level) {
         return CriteriaTriggers.CONSTRUCT_BEACON.createCriterion(new ConstructBeaconTrigger.TriggerInstance(Optional.empty(), level));
      }

      public boolean matches(final int levels) {
         return this.level.matches(levels);
      }
   }
}
