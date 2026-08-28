package net.minecraft.client.renderer.entity.state;

import net.minecraft.world.entity.npc.villager.VillagerData;
import org.jspecify.annotations.Nullable;

public class ZombieVillagerRenderState extends ZombieRenderState implements VillagerDataHolderRenderState {
   @Nullable
   public VillagerData villagerData;

   @Nullable
   @Override
   public VillagerData getVillagerData() {
      return this.villagerData;
   }
}
