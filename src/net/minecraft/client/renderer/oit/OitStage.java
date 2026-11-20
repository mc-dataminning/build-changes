package net.minecraft.client.renderer.oit;

import com.mojang.renderpearl.api.pipeline.RenderPassLayout;
import net.minecraft.client.renderer.RenderPassLayouts;

public enum OitStage {
   DEPTH_BOUNDS,
   TRANSMITTANCE,
   ACCUMULATE;

   public RenderPassLayout.Subpass subpass() {
      return switch (this) {
         case DEPTH_BOUNDS -> RenderPassLayouts.OIT_DEPTH_BOUNDS_SUBPASS;
         case TRANSMITTANCE -> RenderPassLayouts.OIT_TRANSMITTANCE_SUBPASS;
         case ACCUMULATE -> RenderPassLayouts.OIT_ACCUMULATE_SUBPASS;
      };
   }
}
