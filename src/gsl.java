import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gsl {
   private static final Map<alk, fjr> aI = new HashMap<>();
   private static final fjr.b aJ = fjr.a().a("ModelViewMat", fkz.g).a("ProjMat", fkz.g).b();
   private static final fjr.b aK = fjr.a().a("FogStart", fkz.c).a("FogEnd", fkz.c).a("FogShape", fkz.a).b();
   private static final fjr.b aL = fjr.a(aK).a("FogColor", fkz.f).b();
   private static final fjr.b aM = fjr.a(aJ).a("ColorModulator", fkz.f).b();
   private static final fjr.b aN = fjr.a(aM, aL).b();
   private static final fjr.b aO = fjr.a(aN).a("ModelOffset", fkz.e).b();
   private static final fjr.b aP = fjr.a(aM, aL).a("Light0_Direction", fkz.e).a("Light1_Direction", fkz.e).b();
   private static final fjr.b aQ = fjr.a(aO).c("core/terrain").b("core/terrain").e("Sampler0").e("Sampler2").a(flo.b, flu.c.h).b();
   private static final fjr.b aR = fjr.a(aP).c("core/entity").b("core/entity").e("Sampler0").e("Sampler2").a(flo.c, flu.c.h).b();
   private static final fjr.b aS = fjr.a(aN).c("core/rendertype_beacon_beam").b("core/rendertype_beacon_beam").e("Sampler0").a(flo.b, flu.c.h).b();
   private static final fjr.b aT = fjr.a(aM).a(fjn.d).a(flo.k, flu.c.h).b();
   private static final fjr.b aU = fjr.a(aJ, aL)
      .c("core/rendertype_end_portal")
      .b("core/rendertype_end_portal")
      .e("Sampler0")
      .e("Sampler1")
      .a("GameTime", fkz.c)
      .a(flo.e, flu.c.h)
      .b();
   private static final fjr.b aV = fjr.a(aO).c("core/rendertype_clouds").b("core/rendertype_clouds").a(fjn.d).a(flo.f, flu.c.h).b();
   private static final fjr.b aW = fjr.a(aN)
      .c("core/rendertype_lines")
      .b("core/rendertype_lines")
      .a("LineWidth", fkz.c)
      .a("ScreenSize", fkz.d)
      .a(fjn.d)
      .a(false)
      .a(flo.g, flu.c.a)
      .b();
   private static final fjr.b aX = fjr.a(aM).c("core/position_color").b("core/position_color").a(fjn.d).a(flo.f, flu.c.h).b();
   private static final fjr.b aY = fjr.a(aN).c("core/particle").b("core/particle").e("Sampler0").e("Sampler2").a(flo.d, flu.c.h).b();
   private static final fjr.b aZ = fjr.a(aY).a(fjn.d).a(false).b();
   private static final fjr.b ba = fjr.a(aM).c("core/gui").b("core/gui").a(fjn.d).a(flo.f, flu.c.h).b();
   private static final fjr.b bb = fjr.a(aM).c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjn.d).a(flo.j, flu.c.h).b();
   private static final fjr.b bc = fjr.a(aM).c("core/rendertype_outline").b("core/rendertype_outline").e("Sampler0").a(fjy.a).c(false).a(flo.j, flu.c.h).b();
   public static final fjr.b a = fjr.a().a(fjy.a).c(false).a(flo.e, flu.c.h).a("ProjMat", fkz.g).a("OutSize", fkz.d).b();
   public static final fjr b = a(fjr.a(aQ).a("pipeline/solid").c());
   public static final fjr c = a(fjr.a(aQ).a("pipeline/wireframe").a(fkj.b).c());
   public static final fjr d = a(fjr.a(aQ).a("pipeline/cutout_mipped").a("ALPHA_CUTOUT", 0.5F).c());
   public static final fjr e = a(fjr.a(aQ).a("pipeline/cutout").a("ALPHA_CUTOUT", 0.1F).c());
   public static final fjr f = a(fjr.a(aQ).a("pipeline/translucent").a(fjn.d).c());
   public static final fjr g = a(fjr.a(aQ).a("pipeline/tripwire").a("ALPHA_CUTOUT", 0.1F).a(fjn.d).c());
   public static final fjr h = a(
      fjr.a(aM)
         .a("pipeline/translucent_moving_block")
         .c("core/rendertype_translucent_moving_block")
         .b("core/rendertype_translucent_moving_block")
         .e("Sampler0")
         .e("Sampler2")
         .a(fjn.d)
         .a(flo.b, flu.c.h)
         .c()
   );
   public static final fjr i = a(fjr.a(aR).a("pipeline/armor_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).c());
   public static final fjr j = a(fjr.a(aR).a("pipeline/armor_decal_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).a(fjy.b).c());
   public static final fjr k = a(fjr.a(aR).a("pipeline/armor_translucent").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(fjn.d).a(false).c());
   public static final fjr l = a(fjr.a(aR).a("pipeline/entity_solid").e("Sampler1").c());
   public static final fjr m = a(fjr.a(aR).a("pipeline/entity_solid_offset_forward").e("Sampler1").c());
   public static final fjr n = a(fjr.a(aR).a("pipeline/entity_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").c());
   public static final fjr o = a(fjr.a(aR).a("pipeline/entity_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjr p = a(fjr.a(aR).a("pipeline/entity_cutout_no_cull_z_offset").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjr q = a(fjr.a(aR).a("pipeline/entity_translucent").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(fjn.d).a(false).c());
   public static final fjr r = a(
      fjr.a(aR).a("pipeline/entity_translucent_emissive").a("ALPHA_CUTOUT", 0.1F).d("EMISSIVE").e("Sampler1").a(fjn.d).a(false).c(false).c()
   );
   public static final fjr s = a(fjr.a(aR).a("pipeline/entity_smooth_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjr t = a(fjr.a(aR).a("pipeline/entity_no_outline").d("NO_OVERLAY").a(fjn.d).a(false).c(false).c());
   public static final fjr u = a(
      fjr.a(aR)
         .a("pipeline/breeze_wind")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("APPLY_TEXTURE_MATRIX")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .a("TextureMat", fkz.g)
         .a(fjn.d)
         .a(false)
         .c()
   );
   public static final fjr v = a(
      fjr.a(aN)
         .a("pipeline/energy_swirl")
         .c("core/entity")
         .b("core/entity")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .d("APPLY_TEXTURE_MATRIX")
         .e("Sampler0")
         .a("TextureMat", fkz.g)
         .a(fjn.e)
         .a(false)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr w = a(
      fjr.a(aN)
         .a("pipeline/eyes")
         .c("core/entity")
         .b("core/entity")
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .e("Sampler0")
         .a(fjn.d)
         .c(false)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr x = a(
      fjr.a(aP)
         .a("pipeline/entity_decal")
         .c("core/rendertype_entity_decal")
         .b("core/rendertype_entity_decal")
         .e("Sampler0")
         .e("Sampler1")
         .e("Sampler2")
         .a(fjy.b)
         .a(false)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr y = a(
      fjr.a(aN)
         .a("pipeline/entity_shadow")
         .c("core/rendertype_entity_shadow")
         .b("core/rendertype_entity_shadow")
         .e("Sampler0")
         .a(fjn.d)
         .c(false)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr z = a(
      fjr.a(aP)
         .a("pipeline/item_entity_translucent_cull")
         .c("core/rendertype_item_entity_translucent_cull")
         .b("core/rendertype_item_entity_translucent_cull")
         .e("Sampler0")
         .e("Sampler2")
         .a(fjn.d)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr A = a(fjr.a(aS).a("pipeline/beacon_beam_opaque").c());
   public static final fjr B = a(fjr.a(aS).a("pipeline/beacon_beam_translucent").c(false).a(fjn.d).c());
   public static final fjr C = a(
      fjr.a(aJ)
         .a("pipeline/dragon_explosion_alpha")
         .c("core/rendertype_entity_alpha")
         .b("core/rendertype_entity_alpha")
         .e("Sampler0")
         .a(false)
         .a(flo.c, flu.c.h)
         .c()
   );
   public static final fjr D = a(
      fjr.a(aN).a("pipeline/leash").c("core/rendertype_leash").b("core/rendertype_leash").e("Sampler2").a(false).a(flo.h, flu.c.f).c()
   );
   public static final fjr E = a(
      fjr.a(aM).a("pipeline/water_mask").c("core/rendertype_water_mask").b("core/rendertype_water_mask").b(false).a(flo.e, flu.c.h).c()
   );
   public static final fjr F = a(
      fjr.a(aM, aK)
         .a("pipeline/glint")
         .c("core/glint")
         .b("core/glint")
         .e("Sampler0")
         .a("TextureMat", fkz.g)
         .a("GlintAlpha", fkz.c)
         .c(false)
         .a(false)
         .a(fjy.b)
         .a(fjn.b)
         .a(flo.i, flu.c.h)
         .c()
   );
   public static final fjr G = a(
      fjr.a(aM)
         .a("pipeline/crumbling")
         .c("core/rendertype_crumbling")
         .b("core/rendertype_crumbling")
         .e("Sampler0")
         .a(new fjn(SourceFactor.DST_COLOR, DestFactor.SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO))
         .c(false)
         .a(flo.b, flu.c.h)
         .a(-1.0F, -10.0F)
         .c()
   );
   public static final fjr H = a(fjr.a(aT, aL).a("pipeline/text").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c());
   public static final fjr I = a(
      fjr.a(aT, aL).a("pipeline/text_background").c("core/rendertype_text_background").b("core/rendertype_text_background").e("Sampler2").a(flo.h, flu.c.h).c()
   );
   public static final fjr J = a(
      fjr.a(aT, aL)
         .a("pipeline/text_intensity")
         .c("core/rendertype_text_intensity")
         .b("core/rendertype_text_intensity")
         .e("Sampler0")
         .e("Sampler2")
         .a(-1.0F, -10.0F)
         .c()
   );
   public static final fjr K = a(
      fjr.a(aT, aL).a("pipeline/text_polygon_offset").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").a(-1.0F, -10.0F).c()
   );
   public static final fjr L = a(
      fjr.a(aT).a("pipeline/text_see_through").c("core/rendertype_text_see_through").b("core/rendertype_text_see_through").e("Sampler0").c(false).a(fjy.a).c()
   );
   public static final fjr M = a(
      fjr.a(aT)
         .a("pipeline/text_background_see_through")
         .c("core/rendertype_text_background_see_through")
         .b("core/rendertype_text_background_see_through")
         .c(false)
         .a(fjy.a)
         .a(flo.h, flu.c.h)
         .c()
   );
   public static final fjr N = a(
      fjr.a(aT)
         .a("pipeline/text_intensity_see_through")
         .c("core/rendertype_text_intensity_see_through")
         .b("core/rendertype_text_intensity_see_through")
         .e("Sampler0")
         .c(false)
         .a(fjy.a)
         .c()
   );
   public static final fjr O = a(fjr.a(aN).a("pipeline/lightning").c("core/rendertype_lightning").b("core/rendertype_lightning").a(fjn.a).a(flo.f, flu.c.h).c());
   public static final fjr P = a(
      fjr.a(aN).a("pipeline/dragon_rays").c("core/rendertype_lightning").b("core/rendertype_lightning").c(false).a(fjn.a).a(flo.f, flu.c.e).c()
   );
   public static final fjr Q = a(fjr.a(aN).a("pipeline/dragon_rays_depth").c("core/position").b("core/position").b(false).a(flo.e, flu.c.e).c());
   public static final fjr R = a(fjr.a(aU).a("pipeline/end_portal").a("PORTAL_LAYERS", 15).c());
   public static final fjr S = a(fjr.a(aU).a("pipeline/end_gateway").a("PORTAL_LAYERS", 16).c());
   public static final fjr T = a(fjr.a(aV).a("pipeline/flat_clouds").a(false).c());
   public static final fjr U = a(fjr.a(aV).a("pipeline/clouds").c());
   public static final fjr V = a(fjr.a(aV).a("pipeline/clouds_depth_only").b(false).c());
   public static final fjr W = a(fjr.a(aW).a("pipeline/lines").c());
   public static final fjr X = a(fjr.a(aW).a("pipeline/secondary_block_outline").c(false).c());
   public static final fjr Y = a(fjr.a(aW).a("pipeline/line_strip").a(flo.g, flu.c.b).c());
   public static final fjr Z = a(fjr.a(aM).a("pipeline/debug_line_strip").c("core/position_color").b("core/position_color").a(false).a(flo.f, flu.c.d).c());
   public static final fjr aa = a(fjr.a(aX).a("pipeline/debug_filled_box").a(flo.f, flu.c.f).c());
   public static final fjr ab = a(fjr.a(aX).a("pipeline/debug_quads").a(false).c());
   public static final fjr ac = a(fjr.a(aX).a("pipeline/debug_triangle_fan").a(false).a(flo.f, flu.c.g).c());
   public static final fjr ad = a(fjr.a(aX).a("pipeline/debug_structure_quads").a(false).c(false).c());
   public static final fjr ae = a(fjr.a(aX).a("pipeline/debug_section_quads").c());
   public static final fjr af = a(
      fjr.a(aM)
         .a("pipeline/world_border")
         .c("core/rendertype_world_border")
         .b("core/rendertype_world_border")
         .e("Sampler0")
         .a("TextureMat", fkz.g)
         .a("ModelOffset", fkz.e)
         .a(fjn.c)
         .a(false)
         .a(flo.i, flu.c.h)
         .a(-3.0F, -3.0F)
         .c()
   );
   public static final fjr ag = a(fjr.a(aY).a("pipeline/opaque_particle").c());
   public static final fjr ah = a(fjr.a(aY).a("pipeline/translucent_particle").a(fjn.d).c());
   public static final fjr ai = a(fjr.a(aZ).a("pipeline/weather_depth_write").c());
   public static final fjr aj = a(fjr.a(aZ).a("pipeline/weather_no_depth_write").c(false).c());
   public static final fjr ak = a(fjr.a(aN).a("pipeline/sky").c("core/position").b("core/position").c(false).a(flo.e, flu.c.g).c());
   public static final fjr al = a(
      fjr.a(aM).a("pipeline/end_sky").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjn.d).c(false).a(flo.j, flu.c.h).c()
   );
   public static final fjr am = a(
      fjr.a(aM).a("pipeline/sunrise_sunset").c("core/position_color").b("core/position_color").a(fjn.d).c(false).a(flo.f, flu.c.g).c()
   );
   public static final fjr an = a(fjr.a(aN).a("pipeline/stars").c("core/position").b("core/position").a(fjn.c).c(false).a(flo.e, flu.c.h).c());
   public static final fjr ao = a(
      fjr.a(aM).a("pipeline/celestial").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjn.c).c(false).a(flo.j, flu.c.h).c()
   );
   public static final fjr ap = a(fjr.a(ba).a("pipeline/gui").c());
   public static final fjr aq = a(fjr.a(ba).a("pipeline/gui_overlay").a(fjy.a).c(false).c());
   public static final fjr ar = a(fjr.a(ba).a("pipeline/gui_text_highlight").a(fjy.a).a(fke.b).c());
   public static final fjr as = a(fjr.a(ba).a("pipeline/gui_ghost_recipe_overlay").a(fjy.e).c(false).c());
   public static final fjr at = a(fjr.a(bb).a("pipeline/gui_textured").c());
   public static final fjr au = a(fjr.a(bb).a("pipeline/gui_textured_overlay").a(fjy.a).c(false).c());
   public static final fjr av = a(fjr.a(bb).a("pipeline/block_screen_effect").a(fjy.a).c(false).c());
   public static final fjr aw = a(fjr.a(bb).a("pipeline/fire_screen_effect").a(fjy.a).c(false).c());
   public static final fjr ax = a(fjr.a(bb).a("pipeline/gui_opaque_textured_background").a().c());
   public static final fjr ay = a(fjr.a(bb).a("pipeline/gui_nausea_overlay").a(fjn.e).a(fjy.a).c(false).c());
   public static final fjr az = a(fjr.a(bb).a("pipeline/vignette").a(new fjn(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR)).a(fjy.a).c(false).c());
   public static final fjr aA = a(
      fjr.a(bb).a("pipeline/crosshair").a(new fjn(SourceFactor.ONE_MINUS_DST_COLOR, DestFactor.ONE_MINUS_SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO)).c()
   );
   public static final fjr aB = a(fjr.a(bb).a("pipeline/mojang_logo").a(new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE)).a(fjy.a).c(false).c());
   public static final fjr aC = a(
      fjr.a()
         .a("pipeline/entity_outline_blit")
         .c("core/blit_screen")
         .b("core/blit_screen")
         .e("InSampler")
         .a(fjn.g)
         .c(false)
         .a(fjy.a)
         .a(true, false)
         .a(flo.e, flu.c.h)
         .c()
   );
   public static final fjr aD = a(
      fjr.a().a("pipeline/tracy_blit").c("core/blit_screen").b("core/blit_screen").e("InSampler").c(false).a(fjy.a).a(flo.e, flu.c.h).c()
   );
   public static final fjr aE = a(
      fjr.a(aM).a("pipeline/panorama").c("core/position_tex").b("core/position_tex").e("Sampler0").c(false).a(true, false).a(fjn.f).a(flo.i, flu.c.h).c()
   );
   public static final fjr aF = a(fjr.a(bc).a("pipeline/outline_cull").c());
   public static final fjr aG = a(fjr.a(bc).a("pipeline/outline_no_cull").a(false).c());
   public static final fjr aH = a(
      fjr.a()
         .a("pipeline/lightmap")
         .c("core/blit_screen")
         .b("core/lightmap")
         .a("AmbientLightFactor", fkz.c)
         .a("SkyFactor", fkz.c)
         .a("BlockFactor", fkz.c)
         .a("UseBrightLightmap", fkz.a)
         .a("SkyLightColor", fkz.e)
         .a("NightVisionFactor", fkz.c)
         .a("DarknessScale", fkz.c)
         .a("DarkenWorldFactor", fkz.c)
         .a("BrightnessFactor", fkz.c)
         .a(flo.e, flu.c.h)
         .c(false)
         .a(fjy.a)
         .c()
   );

   private static fjr a(fjr $$0) {
      aI.put($$0.k(), $$0);
      return $$0;
   }

   public static List<fjr> a() {
      return aI.values().stream().toList();
   }
}
