package net.minecraft.client.renderer;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.pipeline.RenderPassLayout;

public class RenderPassLayouts {
   public static final RenderPassLayout COLOR_ONLY = RenderPassLayout.simple("Color Only", GpuFormat.RGBA8_UNORM);
   public static final RenderPassLayout DEPTH_ONLY = RenderPassLayout.simple("Depth Only", GpuFormat.D32_FLOAT);
   public static final RenderPassLayout COLOR_DEPTH = RenderPassLayout.simple("Color + Depth", GpuFormat.RGBA8_UNORM, GpuFormat.D32_FLOAT);
   public static final RenderPassLayout OIT_DEPTH_BOUNDS = RenderPassLayout.simple("OIT Depth Bounds", GpuFormat.RGBA32_FLOAT, GpuFormat.D32_FLOAT);
   public static final RenderPassLayout OIT_TRANSMITTANCE = RenderPassLayout.simple("OIT Transmittance", GpuFormat.RGBA16_FLOAT, 2, GpuFormat.D32_FLOAT);
   public static final RenderPassLayout OIT_ACCUMULATE = RenderPassLayout.simple("OIT Accumulate", GpuFormat.RGBA16_FLOAT, GpuFormat.D32_FLOAT);
}
