package net.minecraft.client.gui.screens;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.Updatable;

public abstract class Overlay implements Renderable, Updatable {
   public boolean isPausing() {
      return true;
   }

   public void tick() {
   }

   @Override
   public void update(final DeltaTracker deltaTracker) {
   }
}
