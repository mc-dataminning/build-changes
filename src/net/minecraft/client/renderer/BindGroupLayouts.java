package net.minecraft.client.renderer;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.pipeline.BindGroupLayout;
import com.mojang.renderpearl.api.pipeline.UniformType;

public class BindGroupLayouts {
   public static final BindGroupLayout DYNAMIC_TRANSFORMS = BindGroupLayout.builder().withUniform("DynamicTransforms", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout PROJECTION = BindGroupLayout.builder().withUniform("Projection", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout CHUNK_SECTION = BindGroupLayout.builder().withUniform("ChunkSection", UniformType.UNIFORM_BUFFER).build();
   public static final GpuFormat TERRAIN_VERTEX_TEXEL_FORMAT = GpuFormat.RGBA32_UINT;
   public static final BindGroupLayout TERRAIN_INFO = BindGroupLayout.builder()
      .withUniform("TerrainUniform", UniformType.UNIFORM_BUFFER)
      .withUniform("TerrainVertexBuffer", UniformType.TEXEL_BUFFER, TERRAIN_VERTEX_TEXEL_FORMAT)
      .build();
   public static final BindGroupLayout FOG = BindGroupLayout.builder().withUniform("Fog", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout GLOBALS = BindGroupLayout.builder().withUniform("Globals", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout LIGHTING = BindGroupLayout.builder().withUniform("Lighting", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout SAMPLER0 = BindGroupLayout.builder().withUniform("Sampler0", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout SAMPLER1 = BindGroupLayout.builder().withUniform("Sampler1", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout SAMPLER2 = BindGroupLayout.builder().withUniform("Sampler2", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout SKY_SAMPLER = BindGroupLayout.builder().withUniform("SkySampler", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout CLOUDS_SAMPLER = BindGroupLayout.builder()
      .withUniform("CloudsSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("CloudsDepthSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout SAMPLER0_SAMPLER2 = BindGroupLayout.builder()
      .withUniform("Sampler0", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("Sampler2", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout SAMPLER0_SAMPLER1 = BindGroupLayout.builder()
      .withUniform("Sampler0", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("Sampler1", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout SAMPLER0_SAMPLER1_SAMPLER2 = BindGroupLayout.builder()
      .withUniform("Sampler0", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("Sampler1", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("Sampler2", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout CLOUD_INFO = BindGroupLayout.builder()
      .withUniform("CloudInfo", UniformType.UNIFORM_BUFFER)
      .withUniform("CloudFaces", UniformType.TEXEL_BUFFER, GpuFormat.R8_SINT)
      .build();
   public static final BindGroupLayout DISSOLVE_MASK_SAMPLER = BindGroupLayout.builder()
      .withUniform("DissolveMaskSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout IN_SAMPLER = BindGroupLayout.builder().withUniform("InSampler", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout IN_SAMPLER_IN_DEPTH_SAMPLER = BindGroupLayout.builder()
      .withUniform("InSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("InDepthSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout SKY_OCCLUDER_INFO = BindGroupLayout.builder().withUniform("SkyOccluderInfo", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout LIGHTMAP_INFO = BindGroupLayout.builder().withUniform("LightmapInfo", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout SPRITE_ANIMATION_INFO = BindGroupLayout.builder().withUniform("SpriteAnimationInfo", UniformType.UNIFORM_BUFFER).build();
   public static final BindGroupLayout SPRITE = BindGroupLayout.builder().withUniform("Sprite", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout CURRENT_SPRITE_NEXT_SPRITE = BindGroupLayout.builder()
      .withUniform("CurrentSprite", UniformType.COMBINED_IMAGE_SAMPLER)
      .withUniform("NextSprite", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout GLINT_SAMPLER = BindGroupLayout.builder().withUniform("GlintSampler", UniformType.COMBINED_IMAGE_SAMPLER).build();
   public static final BindGroupLayout DEPTH_BOUNDS_SAMPLER = BindGroupLayout.builder().withUniform("DepthBoundsSampler", UniformType.INPUT_ATTACHMENT).build();
   public static final BindGroupLayout WATER_MASK_SAMPLER = BindGroupLayout.builder()
      .withUniform("WaterMaskSampler", UniformType.COMBINED_IMAGE_SAMPLER)
      .build();
   public static final BindGroupLayout OIT_COEFFS_DEPTH_BOUNDS_SAMPLER;
   public static final BindGroupLayout ACCUMULATE_OIT_COEFFS_DEPTH_BOUNDS_SAMPLER;

   private BindGroupLayouts() {
   }

   static {
      BindGroupLayout.Builder builder = BindGroupLayout.builder().withUniform("DepthBoundsSampler", UniformType.INPUT_ATTACHMENT);

      for (int i = 0; i < 2; i++) {
         builder.withUniform("Bins" + i, UniformType.INPUT_ATTACHMENT);
      }

      OIT_COEFFS_DEPTH_BOUNDS_SAMPLER = builder.build();
      builder = BindGroupLayout.builder()
         .withUniform("AccumulateSampler", UniformType.INPUT_ATTACHMENT)
         .withUniform("DepthBoundsSampler", UniformType.INPUT_ATTACHMENT);

      for (int i = 0; i < 2; i++) {
         builder.withUniform("Bins" + i, UniformType.INPUT_ATTACHMENT);
      }

      ACCUMULATE_OIT_COEFFS_DEPTH_BOUNDS_SAMPLER = builder.build();
   }
}
