import com.mojang.blaze3d.platform.GlStateManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gra {
   private static final Map<alg, fii> aG = new HashMap<>();
   private static final fii.b aH = fii.a().a("ModelViewMat", fjq.a.g).a("ProjMat", fjq.a.g).b();
   private static final fii.b aI = fii.a().a("FogStart", fjq.a.c).a("FogEnd", fjq.a.c).a("FogShape", fjq.a.a).b();
   private static final fii.b aJ = fii.a(aI).a("FogColor", fjq.a.f).b();
   private static final fii.b aK = fii.a(aH).a("ColorModulator", fjq.a.f).b();
   private static final fii.b aL = fii.a(aK, aJ).b();
   private static final fii.b aM = fii.a(aL).a("ModelOffset", fjq.a.e).b();
   private static final fii.b aN = fii.a(aK, aJ).a("Light0_Direction", fjq.a.e).a("Light1_Direction", fjq.a.e).b();
   private static final fii.b aO = fii.a(aM).c("core/terrain").b("core/terrain").e("Sampler0").e("Sampler2").a(fkb.b, fki.c.h).b();
   private static final fii.b aP = fii.a(aN).c("core/entity").b("core/entity").e("Sampler0").e("Sampler2").a(fkb.c, fki.c.h).b();
   private static final fii.b aQ = fii.a(aL).c("core/rendertype_beacon_beam").b("core/rendertype_beacon_beam").e("Sampler0").a(fkb.b, fki.c.h).b();
   private static final fii.b aR = fii.a(aK).a(fif.d).a(fkb.k, fki.c.h).b();
   private static final fii.b aS = fii.a(aH, aJ)
      .c("core/rendertype_end_portal")
      .b("core/rendertype_end_portal")
      .e("Sampler0")
      .e("Sampler1")
      .a("GameTime", fjq.a.c)
      .a(fkb.e, fki.c.h)
      .b();
   private static final fii.b aT = fii.a(aM).c("core/rendertype_clouds").b("core/rendertype_clouds").a(fif.d).a(fkb.f, fki.c.h).b();
   private static final fii.b aU = fii.a(aL)
      .c("core/rendertype_lines")
      .b("core/rendertype_lines")
      .a("LineWidth", fjq.a.c)
      .a("ScreenSize", fjq.a.d)
      .a(fif.d)
      .a(false)
      .a(fkb.g, fki.c.a)
      .b();
   private static final fii.b aV = fii.a(aK).c("core/position_color").b("core/position_color").a(fif.d).a(fkb.f, fki.c.h).b();
   private static final fii.b aW = fii.a(aL).c("core/particle").b("core/particle").e("Sampler0").e("Sampler2").a(fkb.d, fki.c.h).b();
   private static final fii.b aX = fii.a(aW).a(fif.d).a(false).b();
   private static final fii.b aY = fii.a(aK).c("core/gui").b("core/gui").a(fif.d).a(fkb.f, fki.c.h).b();
   private static final fii.b aZ = fii.a(aK).c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fif.d).a(fkb.j, fki.c.h).b();
   private static final fii.b ba = fii.a(aK).c("core/rendertype_outline").b("core/rendertype_outline").e("Sampler0").a(gqc.a).c(false).a(fkb.j, fki.c.h).b();
   public static final fii.b a = fii.a().a(gqc.a).c(false).a(fkb.e, fki.c.h).a("ProjMat", fjq.a.g).a("OutSize", fjq.a.d).b();
   public static final fii b = a(fii.a(aO).a("pipeline/solid").c());
   public static final fii c = a(fii.a(aO).a("pipeline/cutout_mipped").a("ALPHA_CUTOUT", 0.5F).c());
   public static final fii d = a(fii.a(aO).a("pipeline/cutout").a("ALPHA_CUTOUT", 0.1F).c());
   public static final fii e = a(fii.a(aO).a("pipeline/translucent").a(fif.d).c());
   public static final fii f = a(fii.a(aO).a("pipeline/tripwire").a("ALPHA_CUTOUT", 0.1F).a(fif.d).c());
   public static final fii g = a(
      fii.a(aK)
         .a("pipeline/translucent_moving_block")
         .c("core/rendertype_translucent_moving_block")
         .b("core/rendertype_translucent_moving_block")
         .e("Sampler0")
         .e("Sampler2")
         .a(fif.d)
         .a(fkb.b, fki.c.h)
         .c()
   );
   public static final fii h = a(fii.a(aP).a("pipeline/armor_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).c());
   public static final fii i = a(fii.a(aP).a("pipeline/armor_decal_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).a(gqc.b).c());
   public static final fii j = a(fii.a(aP).a("pipeline/armor_translucent").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(fif.d).a(false).c());
   public static final fii k = a(fii.a(aP).a("pipeline/entity_solid").e("Sampler1").c());
   public static final fii l = a(fii.a(aP).a("pipeline/entity_solid_offset_forward").e("Sampler1").c());
   public static final fii m = a(fii.a(aP).a("pipeline/entity_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").c());
   public static final fii n = a(fii.a(aP).a("pipeline/entity_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fii o = a(fii.a(aP).a("pipeline/entity_cutout_no_cull_z_offset").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fii p = a(fii.a(aP).a("pipeline/entity_translucent").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(fif.d).a(false).c());
   public static final fii q = a(
      fii.a(aP).a("pipeline/entity_translucent_emissive").a("ALPHA_CUTOUT", 0.1F).d("EMISSIVE").e("Sampler1").a(fif.d).a(false).c(false).c()
   );
   public static final fii r = a(fii.a(aP).a("pipeline/entity_smooth_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fii s = a(fii.a(aP).a("pipeline/entity_no_outline").d("NO_OVERLAY").a(fif.d).a(false).c(false).c());
   public static final fii t = a(
      fii.a(aP)
         .a("pipeline/breeze_wind")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("APPLY_TEXTURE_MATRIX")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .a("TextureMat", fjq.a.g)
         .a(fif.d)
         .a(false)
         .c()
   );
   public static final fii u = a(
      fii.a(aL)
         .a("pipeline/energy_swirl")
         .c("core/entity")
         .b("core/entity")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .d("APPLY_TEXTURE_MATRIX")
         .e("Sampler0")
         .a("TextureMat", fjq.a.g)
         .a(fif.e)
         .a(false)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii v = a(
      fii.a(aL)
         .a("pipeline/eyes")
         .c("core/entity")
         .b("core/entity")
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .e("Sampler0")
         .a(fif.d)
         .c(false)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii w = a(
      fii.a(aN)
         .a("pipeline/entity_decal")
         .c("core/rendertype_entity_decal")
         .b("core/rendertype_entity_decal")
         .e("Sampler0")
         .e("Sampler1")
         .e("Sampler2")
         .a(gqc.b)
         .a(false)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii x = a(
      fii.a(aL)
         .a("pipeline/entity_shadow")
         .c("core/rendertype_entity_shadow")
         .b("core/rendertype_entity_shadow")
         .e("Sampler0")
         .a(fif.d)
         .c(false)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii y = a(
      fii.a(aN)
         .a("pipeline/item_entity_translucent_cull")
         .c("core/rendertype_item_entity_translucent_cull")
         .b("core/rendertype_item_entity_translucent_cull")
         .e("Sampler0")
         .e("Sampler2")
         .a(fif.d)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii z = a(fii.a(aQ).a("pipeline/beacon_beam_opaque").c());
   public static final fii A = a(fii.a(aQ).a("pipeline/beacon_beam_translucent").c(false).a(fif.d).c());
   public static final fii B = a(
      fii.a(aH)
         .a("pipeline/dragon_explosion_alpha")
         .c("core/rendertype_entity_alpha")
         .b("core/rendertype_entity_alpha")
         .e("Sampler0")
         .a(false)
         .a(fkb.c, fki.c.h)
         .c()
   );
   public static final fii C = a(
      fii.a(aL).a("pipeline/leash").c("core/rendertype_leash").b("core/rendertype_leash").e("Sampler2").a(false).a(fkb.h, fki.c.f).c()
   );
   public static final fii D = a(
      fii.a(aK).a("pipeline/water_mask").c("core/rendertype_water_mask").b("core/rendertype_water_mask").b(false).a(fkb.e, fki.c.h).c()
   );
   public static final fii E = a(
      fii.a(aK, aI)
         .a("pipeline/glint")
         .c("core/glint")
         .b("core/glint")
         .e("Sampler0")
         .a("TextureMat", fjq.a.g)
         .a("GlintAlpha", fjq.a.c)
         .c(false)
         .a(false)
         .a(gqc.b)
         .a(fif.b)
         .a(fkb.i, fki.c.h)
         .c()
   );
   public static final fii F = a(
      fii.a(aK)
         .a("pipeline/crumbling")
         .c("core/rendertype_crumbling")
         .b("core/rendertype_crumbling")
         .e("Sampler0")
         .a(
            new fif(GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO)
         )
         .c(false)
         .a(fkb.b, fki.c.h)
         .c()
   );
   public static final fii G = a(fii.a(aR, aJ).a("pipeline/text").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c());
   public static final fii H = a(
      fii.a(aR, aJ).a("pipeline/text_background").c("core/rendertype_text_background").b("core/rendertype_text_background").e("Sampler2").a(fkb.h, fki.c.h).c()
   );
   public static final fii I = a(
      fii.a(aR, aJ).a("pipeline/text_intensity").c("core/rendertype_text_intensity").b("core/rendertype_text_intensity").e("Sampler0").e("Sampler2").c()
   );
   public static final fii J = a(
      fii.a(aR, aJ).a("pipeline/text_polygon_offset").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c()
   );
   public static final fii K = a(
      fii.a(aR).a("pipeline/text_see_through").c("core/rendertype_text_see_through").b("core/rendertype_text_see_through").e("Sampler0").c(false).a(gqc.a).c()
   );
   public static final fii L = a(
      fii.a(aR)
         .a("pipeline/text_background_see_through")
         .c("core/rendertype_text_background_see_through")
         .b("core/rendertype_text_background_see_through")
         .c(false)
         .a(gqc.a)
         .a(fkb.h, fki.c.h)
         .c()
   );
   public static final fii M = a(
      fii.a(aR)
         .a("pipeline/text_intensity_see_through")
         .c("core/rendertype_text_intensity_see_through")
         .b("core/rendertype_text_intensity_see_through")
         .e("Sampler0")
         .c(false)
         .a(gqc.a)
         .c()
   );
   public static final fii N = a(fii.a(aL).a("pipeline/lightning").c("core/rendertype_lightning").b("core/rendertype_lightning").a(fif.a).a(fkb.f, fki.c.h).c());
   public static final fii O = a(
      fii.a(aL).a("pipeline/dragon_rays").c("core/rendertype_lightning").b("core/rendertype_lightning").c(false).a(fif.a).a(fkb.f, fki.c.e).c()
   );
   public static final fii P = a(fii.a(aL).a("pipeline/dragon_rays_depth").c("core/position").b("core/position").b(false).a(fkb.e, fki.c.e).c());
   public static final fii Q = a(fii.a(aS).a("pipeline/end_portal").a("PORTAL_LAYERS", 15).c());
   public static final fii R = a(fii.a(aS).a("pipeline/end_gateway").a("PORTAL_LAYERS", 16).c());
   public static final fii S = a(fii.a(aT).a("pipeline/flat_clouds").a(false).c());
   public static final fii T = a(fii.a(aT).a("pipeline/clouds").c());
   public static final fii U = a(fii.a(aT).a("pipeline/clouds_depth_only").b(false).c());
   public static final fii V = a(fii.a(aU).a("pipeline/lines").c());
   public static final fii W = a(fii.a(aU).a("pipeline/secondary_block_outline").c(false).c());
   public static final fii X = a(fii.a(aU).a("pipeline/line_strip").a(fkb.g, fki.c.b).c());
   public static final fii Y = a(fii.a(aK).a("pipeline/debug_line_strip").c("core/position_color").b("core/position_color").a(false).a(fkb.f, fki.c.d).c());
   public static final fii Z = a(fii.a(aV).a("pipeline/debug_filled_box").a(fkb.f, fki.c.f).c());
   public static final fii aa = a(fii.a(aV).a("pipeline/debug_quads").a(false).c());
   public static final fii ab = a(fii.a(aV).a("pipeline/debug_triangle_fan").a(false).a(fkb.f, fki.c.g).c());
   public static final fii ac = a(fii.a(aV).a("pipeline/debug_structure_quads").a(false).c(false).c());
   public static final fii ad = a(fii.a(aV).a("pipeline/debug_section_quads").c());
   public static final fii ae = a(
      fii.a(aK)
         .a("pipeline/world_border")
         .c("core/rendertype_world_border")
         .b("core/rendertype_world_border")
         .e("Sampler0")
         .a("TextureMat", fjq.a.g)
         .a("ModelOffset", fjq.a.e)
         .a(fif.c)
         .a(false)
         .a(fkb.i, fki.c.h)
         .c()
   );
   public static final fii af = a(fii.a(aW).a("pipeline/opaque_particle").c());
   public static final fii ag = a(fii.a(aW).a("pipeline/translucent_particle").a(fif.d).c());
   public static final fii ah = a(fii.a(aX).a("pipeline/weather_depth_write").c());
   public static final fii ai = a(fii.a(aX).a("pipeline/weather_no_depth_write").c(false).c());
   public static final fii aj = a(fii.a(aL).a("pipeline/sky").c("core/position").b("core/position").c(false).a(fkb.e, fki.c.h).c());
   public static final fii ak = a(
      fii.a(aK).a("pipeline/end_sky").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fif.d).c(false).a(fkb.j, fki.c.h).c()
   );
   public static final fii al = a(
      fii.a(aK).a("pipeline/sunrise_sunset").c("core/position_color").b("core/position_color").a(fif.d).c(false).a(fkb.f, fki.c.g).c()
   );
   public static final fii am = a(fii.a(aL).a("pipeline/stars").c("core/position").b("core/position").a(fif.c).c(false).a(fkb.e, fki.c.h).c());
   public static final fii an = a(
      fii.a(aK).a("pipeline/celestial").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fif.c).c(false).a(fkb.j, fki.c.h).c()
   );
   public static final fii ao = a(fii.a(aY).a("pipeline/gui").c());
   public static final fii ap = a(fii.a(aY).a("pipeline/gui_overlay").a(gqc.a).c(false).c());
   public static final fii aq = a(fii.a(aY).a("pipeline/gui_text_highlight").a(gqc.a).a(GlStateManager.h.o).c());
   public static final fii ar = a(fii.a(aY).a("pipeline/gui_ghost_recipe_overlay").a(gqc.d).c(false).c());
   public static final fii as = a(fii.a(aZ).a("pipeline/gui_textured").c());
   public static final fii at = a(fii.a(aZ).a("pipeline/gui_textured_overlay").a(gqc.a).c(false).c());
   public static final fii au = a(fii.a(aZ).a("pipeline/block_screen_effect").a(gqc.a).c(false).c());
   public static final fii av = a(fii.a(aZ).a("pipeline/fire_screen_effect").a(gqc.a).c(false).c());
   public static final fii aw = a(fii.a(aZ).a("pipeline/gui_opaque_textured_background").a().c());
   public static final fii ax = a(fii.a(aZ).a("pipeline/gui_nausea_overlay").a(fif.e).a(gqc.a).c(false).c());
   public static final fii ay = a(
      fii.a(aZ).a("pipeline/vignette").a(new fif(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR)).a(gqc.a).c(false).c()
   );
   public static final fii az = a(
      fii.a(aZ)
         .a("pipeline/crosshair")
         .a(
            new fif(
               GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
               GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
               GlStateManager.SourceFactor.ONE,
               GlStateManager.DestFactor.ZERO
            )
         )
         .c()
   );
   public static final fii aA = a(
      fii.a(aZ).a("pipeline/mojang_logo").a(new fif(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE)).a(gqc.a).c(false).c()
   );
   public static final fii aB = a(
      fii.a()
         .a("pipeline/entity_outline_blit")
         .c("core/blit_screen")
         .b("core/blit_screen")
         .e("InSampler")
         .a(fif.g)
         .c(false)
         .a(gqc.a)
         .a(true, false)
         .a(fkb.e, fki.c.h)
         .c()
   );
   public static final fii aC = a(
      fii.a(aK).a("pipeline/panorama").c("core/position_tex").b("core/position_tex").e("Sampler0").c(false).a(true, false).a(fif.f).a(fkb.i, fki.c.h).c()
   );
   public static final fii aD = a(fii.a(ba).a("pipeline/outline_cull").c());
   public static final fii aE = a(fii.a(ba).a("pipeline/outline_no_cull").a(false).c());
   public static final fii aF = a(
      fii.a()
         .a("pipeline/lightmap")
         .c("core/blit_screen")
         .b("core/lightmap")
         .a("AmbientLightFactor", fjq.a.c)
         .a("SkyFactor", fjq.a.c)
         .a("BlockFactor", fjq.a.c)
         .a("UseBrightLightmap", fjq.a.a)
         .a("SkyLightColor", fjq.a.e)
         .a("NightVisionFactor", fjq.a.c)
         .a("DarknessScale", fjq.a.c)
         .a("DarkenWorldFactor", fjq.a.c)
         .a("BrightnessFactor", fjq.a.c)
         .a(fkb.e, fki.c.h)
         .c()
   );

   private static fii a(fii $$0) {
      aG.put($$0.d(), $$0);
      return $$0;
   }

   public static List<fii> a() {
      return aG.values().stream().toList();
   }
}
