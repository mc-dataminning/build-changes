package net.minecraft.client.renderer.oit;

import com.mojang.renderpearl.api.pipeline.RenderPassLayout;
import net.minecraft.client.renderer.RenderPassLayouts;

public enum OitStage {
   DEPTH_BOUNDS,
   TRANSMITTANCE,
   ACCUMULATE;

   public RenderPassLayout.Subpass subpass() {
      return switch (this) {
         case DEPTH_BOUNDS -> RenderPassLayouts.OIT_DEPTH_BOUNDS.subpass(0);
         case TRANSMITTANCE -> RenderPassLayouts.OIT_TRANSMITTANCE.subpass(0);
         case ACCUMULATE -> RenderPassLayouts.OIT_ACCUMULATE.subpass(0);
      };
   }
}
