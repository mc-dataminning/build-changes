package net.minecraft.client.renderer.entity.state;

import net.minecraft.world.entity.npc.villager.VillagerData;
import org.jspecify.annotations.Nullable;

public class VillagerRenderState extends HoldingEntityRenderState implements VillagerDataHolderRenderState {
   public boolean isUnhappy;
   @Nullable
   public VillagerData villagerData;

   @Nullable
   @Override
   public VillagerData getVillagerData() {
      return this.villagerData;
   }
}
