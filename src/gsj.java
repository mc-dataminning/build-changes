import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gsj {
   private static final Map<ali, fjp> aI = new HashMap<>();
   private static final fjp.b aJ = fjp.a().a("ModelViewMat", fkx.g).a("ProjMat", fkx.g).b();
   private static final fjp.b aK = fjp.a().a("FogStart", fkx.c).a("FogEnd", fkx.c).a("FogShape", fkx.a).b();
   private static final fjp.b aL = fjp.a(aK).a("FogColor", fkx.f).b();
   private static final fjp.b aM = fjp.a(aJ).a("ColorModulator", fkx.f).b();
   private static final fjp.b aN = fjp.a(aM, aL).b();
   private static final fjp.b aO = fjp.a(aN).a("ModelOffset", fkx.e).b();
   private static final fjp.b aP = fjp.a(aM, aL).a("Light0_Direction", fkx.e).a("Light1_Direction", fkx.e).b();
   private static final fjp.b aQ = fjp.a(aO).c("core/terrain").b("core/terrain").e("Sampler0").e("Sampler2").a(flm.b, fls.c.h).b();
   private static final fjp.b aR = fjp.a(aP).c("core/entity").b("core/entity").e("Sampler0").e("Sampler2").a(flm.c, fls.c.h).b();
   private static final fjp.b aS = fjp.a(aN).c("core/rendertype_beacon_beam").b("core/rendertype_beacon_beam").e("Sampler0").a(flm.b, fls.c.h).b();
   private static final fjp.b aT = fjp.a(aM).a(fjl.d).a(flm.k, fls.c.h).b();
   private static final fjp.b aU = fjp.a(aJ, aL)
      .c("core/rendertype_end_portal")
      .b("core/rendertype_end_portal")
      .e("Sampler0")
      .e("Sampler1")
      .a("GameTime", fkx.c)
      .a(flm.e, fls.c.h)
      .b();
   private static final fjp.b aV = fjp.a(aO).c("core/rendertype_clouds").b("core/rendertype_clouds").a(fjl.d).a(flm.f, fls.c.h).b();
   private static final fjp.b aW = fjp.a(aN)
      .c("core/rendertype_lines")
      .b("core/rendertype_lines")
      .a("LineWidth", fkx.c)
      .a("ScreenSize", fkx.d)
      .a(fjl.d)
      .a(false)
      .a(flm.g, fls.c.a)
      .b();
   private static final fjp.b aX = fjp.a(aM).c("core/position_color").b("core/position_color").a(fjl.d).a(flm.f, fls.c.h).b();
   private static final fjp.b aY = fjp.a(aN).c("core/particle").b("core/particle").e("Sampler0").e("Sampler2").a(flm.d, fls.c.h).b();
   private static final fjp.b aZ = fjp.a(aY).a(fjl.d).a(false).b();
   private static final fjp.b ba = fjp.a(aM).c("core/gui").b("core/gui").a(fjl.d).a(flm.f, fls.c.h).b();
   private static final fjp.b bb = fjp.a(aM).c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjl.d).a(flm.j, fls.c.h).b();
   private static final fjp.b bc = fjp.a(aM).c("core/rendertype_outline").b("core/rendertype_outline").e("Sampler0").a(fjw.a).c(false).a(flm.j, fls.c.h).b();
   public static final fjp.b a = fjp.a().a(fjw.a).c(false).a(flm.e, fls.c.h).a("ProjMat", fkx.g).a("OutSize", fkx.d).b();
   public static final fjp b = a(fjp.a(aQ).a("pipeline/solid").c());
   public static final fjp c = a(fjp.a(aQ).a("pipeline/wireframe").a(fkh.b).c());
   public static final fjp d = a(fjp.a(aQ).a("pipeline/cutout_mipped").a("ALPHA_CUTOUT", 0.5F).c());
   public static final fjp e = a(fjp.a(aQ).a("pipeline/cutout").a("ALPHA_CUTOUT", 0.1F).c());
   public static final fjp f = a(fjp.a(aQ).a("pipeline/translucent").a(fjl.d).c());
   public static final fjp g = a(fjp.a(aQ).a("pipeline/tripwire").a("ALPHA_CUTOUT", 0.1F).a(fjl.d).c());
   public static final fjp h = a(
      fjp.a(aM)
         .a("pipeline/translucent_moving_block")
         .c("core/rendertype_translucent_moving_block")
         .b("core/rendertype_translucent_moving_block")
         .e("Sampler0")
         .e("Sampler2")
         .a(fjl.d)
         .a(flm.b, fls.c.h)
         .c()
   );
   public static final fjp i = a(fjp.a(aR).a("pipeline/armor_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).c());
   public static final fjp j = a(fjp.a(aR).a("pipeline/armor_decal_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).a(fjw.b).c());
   public static final fjp k = a(fjp.a(aR).a("pipeline/armor_translucent").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(fjl.d).a(false).c());
   public static final fjp l = a(fjp.a(aR).a("pipeline/entity_solid").e("Sampler1").c());
   public static final fjp m = a(fjp.a(aR).a("pipeline/entity_solid_offset_forward").e("Sampler1").c());
   public static final fjp n = a(fjp.a(aR).a("pipeline/entity_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").c());
   public static final fjp o = a(fjp.a(aR).a("pipeline/entity_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjp p = a(fjp.a(aR).a("pipeline/entity_cutout_no_cull_z_offset").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjp q = a(fjp.a(aR).a("pipeline/entity_translucent").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(fjl.d).a(false).c());
   public static final fjp r = a(
      fjp.a(aR).a("pipeline/entity_translucent_emissive").a("ALPHA_CUTOUT", 0.1F).d("EMISSIVE").e("Sampler1").a(fjl.d).a(false).c(false).c()
   );
   public static final fjp s = a(fjp.a(aR).a("pipeline/entity_smooth_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fjp t = a(fjp.a(aR).a("pipeline/entity_no_outline").d("NO_OVERLAY").a(fjl.d).a(false).c(false).c());
   public static final fjp u = a(
      fjp.a(aR)
         .a("pipeline/breeze_wind")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("APPLY_TEXTURE_MATRIX")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .a("TextureMat", fkx.g)
         .a(fjl.d)
         .a(false)
         .c()
   );
   public static final fjp v = a(
      fjp.a(aN)
         .a("pipeline/energy_swirl")
         .c("core/entity")
         .b("core/entity")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .d("APPLY_TEXTURE_MATRIX")
         .e("Sampler0")
         .a("TextureMat", fkx.g)
         .a(fjl.e)
         .a(false)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp w = a(
      fjp.a(aN)
         .a("pipeline/eyes")
         .c("core/entity")
         .b("core/entity")
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .e("Sampler0")
         .a(fjl.d)
         .c(false)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp x = a(
      fjp.a(aP)
         .a("pipeline/entity_decal")
         .c("core/rendertype_entity_decal")
         .b("core/rendertype_entity_decal")
         .e("Sampler0")
         .e("Sampler1")
         .e("Sampler2")
         .a(fjw.b)
         .a(false)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp y = a(
      fjp.a(aN)
         .a("pipeline/entity_shadow")
         .c("core/rendertype_entity_shadow")
         .b("core/rendertype_entity_shadow")
         .e("Sampler0")
         .a(fjl.d)
         .c(false)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp z = a(
      fjp.a(aP)
         .a("pipeline/item_entity_translucent_cull")
         .c("core/rendertype_item_entity_translucent_cull")
         .b("core/rendertype_item_entity_translucent_cull")
         .e("Sampler0")
         .e("Sampler2")
         .a(fjl.d)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp A = a(fjp.a(aS).a("pipeline/beacon_beam_opaque").c());
   public static final fjp B = a(fjp.a(aS).a("pipeline/beacon_beam_translucent").c(false).a(fjl.d).c());
   public static final fjp C = a(
      fjp.a(aJ)
         .a("pipeline/dragon_explosion_alpha")
         .c("core/rendertype_entity_alpha")
         .b("core/rendertype_entity_alpha")
         .e("Sampler0")
         .a(false)
         .a(flm.c, fls.c.h)
         .c()
   );
   public static final fjp D = a(
      fjp.a(aN).a("pipeline/leash").c("core/rendertype_leash").b("core/rendertype_leash").e("Sampler2").a(false).a(flm.h, fls.c.f).c()
   );
   public static final fjp E = a(
      fjp.a(aM).a("pipeline/water_mask").c("core/rendertype_water_mask").b("core/rendertype_water_mask").b(false).a(flm.e, fls.c.h).c()
   );
   public static final fjp F = a(
      fjp.a(aM, aK)
         .a("pipeline/glint")
         .c("core/glint")
         .b("core/glint")
         .e("Sampler0")
         .a("TextureMat", fkx.g)
         .a("GlintAlpha", fkx.c)
         .c(false)
         .a(false)
         .a(fjw.b)
         .a(fjl.b)
         .a(flm.i, fls.c.h)
         .c()
   );
   public static final fjp G = a(
      fjp.a(aM)
         .a("pipeline/crumbling")
         .c("core/rendertype_crumbling")
         .b("core/rendertype_crumbling")
         .e("Sampler0")
         .a(new fjl(SourceFactor.DST_COLOR, DestFactor.SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO))
         .c(false)
         .a(flm.b, fls.c.h)
         .a(-1.0F, -10.0F)
         .c()
   );
   public static final fjp H = a(fjp.a(aT, aL).a("pipeline/text").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c());
   public static final fjp I = a(
      fjp.a(aT, aL).a("pipeline/text_background").c("core/rendertype_text_background").b("core/rendertype_text_background").e("Sampler2").a(flm.h, fls.c.h).c()
   );
   public static final fjp J = a(
      fjp.a(aT, aL)
         .a("pipeline/text_intensity")
         .c("core/rendertype_text_intensity")
         .b("core/rendertype_text_intensity")
         .e("Sampler0")
         .e("Sampler2")
         .a(-1.0F, -10.0F)
         .c()
   );
   public static final fjp K = a(
      fjp.a(aT, aL).a("pipeline/text_polygon_offset").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").a(-1.0F, -10.0F).c()
   );
   public static final fjp L = a(
      fjp.a(aT).a("pipeline/text_see_through").c("core/rendertype_text_see_through").b("core/rendertype_text_see_through").e("Sampler0").c(false).a(fjw.a).c()
   );
   public static final fjp M = a(
      fjp.a(aT)
         .a("pipeline/text_background_see_through")
         .c("core/rendertype_text_background_see_through")
         .b("core/rendertype_text_background_see_through")
         .c(false)
         .a(fjw.a)
         .a(flm.h, fls.c.h)
         .c()
   );
   public static final fjp N = a(
      fjp.a(aT)
         .a("pipeline/text_intensity_see_through")
         .c("core/rendertype_text_intensity_see_through")
         .b("core/rendertype_text_intensity_see_through")
         .e("Sampler0")
         .c(false)
         .a(fjw.a)
         .c()
   );
   public static final fjp O = a(fjp.a(aN).a("pipeline/lightning").c("core/rendertype_lightning").b("core/rendertype_lightning").a(fjl.a).a(flm.f, fls.c.h).c());
   public static final fjp P = a(
      fjp.a(aN).a("pipeline/dragon_rays").c("core/rendertype_lightning").b("core/rendertype_lightning").c(false).a(fjl.a).a(flm.f, fls.c.e).c()
   );
   public static final fjp Q = a(fjp.a(aN).a("pipeline/dragon_rays_depth").c("core/position").b("core/position").b(false).a(flm.e, fls.c.e).c());
   public static final fjp R = a(fjp.a(aU).a("pipeline/end_portal").a("PORTAL_LAYERS", 15).c());
   public static final fjp S = a(fjp.a(aU).a("pipeline/end_gateway").a("PORTAL_LAYERS", 16).c());
   public static final fjp T = a(fjp.a(aV).a("pipeline/flat_clouds").a(false).c());
   public static final fjp U = a(fjp.a(aV).a("pipeline/clouds").c());
   public static final fjp V = a(fjp.a(aV).a("pipeline/clouds_depth_only").b(false).c());
   public static final fjp W = a(fjp.a(aW).a("pipeline/lines").c());
   public static final fjp X = a(fjp.a(aW).a("pipeline/secondary_block_outline").c(false).c());
   public static final fjp Y = a(fjp.a(aW).a("pipeline/line_strip").a(flm.g, fls.c.b).c());
   public static final fjp Z = a(fjp.a(aM).a("pipeline/debug_line_strip").c("core/position_color").b("core/position_color").a(false).a(flm.f, fls.c.d).c());
   public static final fjp aa = a(fjp.a(aX).a("pipeline/debug_filled_box").a(flm.f, fls.c.f).c());
   public static final fjp ab = a(fjp.a(aX).a("pipeline/debug_quads").a(false).c());
   public static final fjp ac = a(fjp.a(aX).a("pipeline/debug_triangle_fan").a(false).a(flm.f, fls.c.g).c());
   public static final fjp ad = a(fjp.a(aX).a("pipeline/debug_structure_quads").a(false).c(false).c());
   public static final fjp ae = a(fjp.a(aX).a("pipeline/debug_section_quads").c());
   public static final fjp af = a(
      fjp.a(aM)
         .a("pipeline/world_border")
         .c("core/rendertype_world_border")
         .b("core/rendertype_world_border")
         .e("Sampler0")
         .a("TextureMat", fkx.g)
         .a("ModelOffset", fkx.e)
         .a(fjl.c)
         .a(false)
         .a(flm.i, fls.c.h)
         .a(-3.0F, -3.0F)
         .c()
   );
   public static final fjp ag = a(fjp.a(aY).a("pipeline/opaque_particle").c());
   public static final fjp ah = a(fjp.a(aY).a("pipeline/translucent_particle").a(fjl.d).c());
   public static final fjp ai = a(fjp.a(aZ).a("pipeline/weather_depth_write").c());
   public static final fjp aj = a(fjp.a(aZ).a("pipeline/weather_no_depth_write").c(false).c());
   public static final fjp ak = a(fjp.a(aN).a("pipeline/sky").c("core/position").b("core/position").c(false).a(flm.e, fls.c.g).c());
   public static final fjp al = a(
      fjp.a(aM).a("pipeline/end_sky").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjl.d).c(false).a(flm.j, fls.c.h).c()
   );
   public static final fjp am = a(
      fjp.a(aM).a("pipeline/sunrise_sunset").c("core/position_color").b("core/position_color").a(fjl.d).c(false).a(flm.f, fls.c.g).c()
   );
   public static final fjp an = a(fjp.a(aN).a("pipeline/stars").c("core/position").b("core/position").a(fjl.c).c(false).a(flm.e, fls.c.h).c());
   public static final fjp ao = a(
      fjp.a(aM).a("pipeline/celestial").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fjl.c).c(false).a(flm.j, fls.c.h).c()
   );
   public static final fjp ap = a(fjp.a(ba).a("pipeline/gui").c());
   public static final fjp aq = a(fjp.a(ba).a("pipeline/gui_overlay").a(fjw.a).c(false).c());
   public static final fjp ar = a(fjp.a(ba).a("pipeline/gui_text_highlight").a(fjw.a).a(fkc.b).c());
   public static final fjp as = a(fjp.a(ba).a("pipeline/gui_ghost_recipe_overlay").a(fjw.e).c(false).c());
   public static final fjp at = a(fjp.a(bb).a("pipeline/gui_textured").c());
   public static final fjp au = a(fjp.a(bb).a("pipeline/gui_textured_overlay").a(fjw.a).c(false).c());
   public static final fjp av = a(fjp.a(bb).a("pipeline/block_screen_effect").a(fjw.a).c(false).c());
   public static final fjp aw = a(fjp.a(bb).a("pipeline/fire_screen_effect").a(fjw.a).c(false).c());
   public static final fjp ax = a(fjp.a(bb).a("pipeline/gui_opaque_textured_background").a().c());
   public static final fjp ay = a(fjp.a(bb).a("pipeline/gui_nausea_overlay").a(fjl.e).a(fjw.a).c(false).c());
   public static final fjp az = a(fjp.a(bb).a("pipeline/vignette").a(new fjl(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR)).a(fjw.a).c(false).c());
   public static final fjp aA = a(
      fjp.a(bb).a("pipeline/crosshair").a(new fjl(SourceFactor.ONE_MINUS_DST_COLOR, DestFactor.ONE_MINUS_SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO)).c()
   );
   public static final fjp aB = a(fjp.a(bb).a("pipeline/mojang_logo").a(new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE)).a(fjw.a).c(false).c());
   public static final fjp aC = a(
      fjp.a()
         .a("pipeline/entity_outline_blit")
         .c("core/blit_screen")
         .b("core/blit_screen")
         .e("InSampler")
         .a(fjl.g)
         .c(false)
         .a(fjw.a)
         .a(true, false)
         .a(flm.e, fls.c.h)
         .c()
   );
   public static final fjp aD = a(
      fjp.a().a("pipeline/tracy_blit").c("core/blit_screen").b("core/blit_screen").e("InSampler").c(false).a(fjw.a).a(flm.e, fls.c.h).c()
   );
   public static final fjp aE = a(
      fjp.a(aM).a("pipeline/panorama").c("core/position_tex").b("core/position_tex").e("Sampler0").c(false).a(true, false).a(fjl.f).a(flm.i, fls.c.h).c()
   );
   public static final fjp aF = a(fjp.a(bc).a("pipeline/outline_cull").c());
   public static final fjp aG = a(fjp.a(bc).a("pipeline/outline_no_cull").a(false).c());
   public static final fjp aH = a(
      fjp.a()
         .a("pipeline/lightmap")
         .c("core/blit_screen")
         .b("core/lightmap")
         .a("AmbientLightFactor", fkx.c)
         .a("SkyFactor", fkx.c)
         .a("BlockFactor", fkx.c)
         .a("UseBrightLightmap", fkx.a)
         .a("SkyLightColor", fkx.e)
         .a("NightVisionFactor", fkx.c)
         .a("DarknessScale", fkx.c)
         .a("DarkenWorldFactor", fkx.c)
         .a("BrightnessFactor", fkx.c)
         .a(flm.e, fls.c.h)
         .c(false)
         .a(fjw.a)
         .c()
   );

   private static fjp a(fjp $$0) {
      aI.put($$0.k(), $$0);
      return $$0;
   }

   public static List<fjp> a() {
      return aI.values().stream().toList();
   }
}
