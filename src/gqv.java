import com.mojang.blaze3d.platform.GlStateManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gqv {
   private static final Map<alg, fid> aG = new HashMap<>();
   private static final fid.b aH = fid.a().a("ModelViewMat", fjl.a.g).a("ProjMat", fjl.a.g).b();
   private static final fid.b aI = fid.a().a("FogStart", fjl.a.c).a("FogEnd", fjl.a.c).a("FogShape", fjl.a.a).b();
   private static final fid.b aJ = fid.a(aI).a("FogColor", fjl.a.f).b();
   private static final fid.b aK = fid.a(aH).a("ColorModulator", fjl.a.f).b();
   private static final fid.b aL = fid.a(aK, aJ).b();
   private static final fid.b aM = fid.a(aL).a("ModelOffset", fjl.a.e).b();
   private static final fid.b aN = fid.a(aK, aJ).a("Light0_Direction", fjl.a.e).a("Light1_Direction", fjl.a.e).b();
   private static final fid.b aO = fid.a(aM).c("core/terrain").b("core/terrain").e("Sampler0").e("Sampler2").a(fjw.b, fkd.c.h).b();
   private static final fid.b aP = fid.a(aN).c("core/entity").b("core/entity").e("Sampler0").e("Sampler2").a(fjw.c, fkd.c.h).b();
   private static final fid.b aQ = fid.a(aL).c("core/rendertype_beacon_beam").b("core/rendertype_beacon_beam").e("Sampler0").a(fjw.b, fkd.c.h).b();
   private static final fid.b aR = fid.a(aK).a(fia.d).a(fjw.k, fkd.c.h).b();
   private static final fid.b aS = fid.a(aH, aJ)
      .c("core/rendertype_end_portal")
      .b("core/rendertype_end_portal")
      .e("Sampler0")
      .e("Sampler1")
      .a("GameTime", fjl.a.c)
      .a(fjw.e, fkd.c.h)
      .b();
   private static final fid.b aT = fid.a(aM).c("core/rendertype_clouds").b("core/rendertype_clouds").a(fia.d).a(fjw.f, fkd.c.h).b();
   private static final fid.b aU = fid.a(aL)
      .c("core/rendertype_lines")
      .b("core/rendertype_lines")
      .a("LineWidth", fjl.a.c)
      .a("ScreenSize", fjl.a.d)
      .a(fia.d)
      .a(false)
      .a(fjw.g, fkd.c.a)
      .b();
   private static final fid.b aV = fid.a(aK).c("core/position_color").b("core/position_color").a(fia.d).a(fjw.f, fkd.c.h).b();
   private static final fid.b aW = fid.a(aL).c("core/particle").b("core/particle").e("Sampler0").e("Sampler2").a(fjw.d, fkd.c.h).b();
   private static final fid.b aX = fid.a(aW).a(fia.d).a(false).b();
   private static final fid.b aY = fid.a(aK).c("core/gui").b("core/gui").a(fia.d).a(fjw.f, fkd.c.h).b();
   private static final fid.b aZ = fid.a(aK).c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fia.d).a(fjw.j, fkd.c.h).b();
   private static final fid.b ba = fid.a(aK).c("core/rendertype_outline").b("core/rendertype_outline").e("Sampler0").a(gpx.a).a(fjw.j, fkd.c.h).b();
   public static final fid.b a = fid.a().a(gpx.a).a(fjw.e, fkd.c.h).a("ProjMat", fjl.a.g).a("OutSize", fjl.a.d).b();
   public static final fid b = a(fid.a(aO).a("pipeline/solid").c());
   public static final fid c = a(fid.a(aO).a("pipeline/cutout_mipped").a("ALPHA_CUTOUT", 0.5F).c());
   public static final fid d = a(fid.a(aO).a("pipeline/cutout").a("ALPHA_CUTOUT", 0.1F).c());
   public static final fid e = a(fid.a(aO).a("pipeline/translucent").a(fia.d).c());
   public static final fid f = a(fid.a(aO).a("pipeline/tripwire").a("ALPHA_CUTOUT", 0.1F).a(fia.d).c());
   public static final fid g = a(
      fid.a(aK)
         .a("pipeline/translucent_moving_block")
         .c("core/rendertype_translucent_moving_block")
         .b("core/rendertype_translucent_moving_block")
         .e("Sampler0")
         .e("Sampler2")
         .a(fia.d)
         .a(fjw.b, fkd.c.h)
         .c()
   );
   public static final fid h = a(fid.a(aP).a("pipeline/armor_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).c());
   public static final fid i = a(fid.a(aP).a("pipeline/armor_decal_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(false).a(gpx.b).c());
   public static final fid j = a(fid.a(aP).a("pipeline/armor_translucent").a("ALPHA_CUTOUT", 0.1F).d("NO_OVERLAY").a(fia.d).a(false).c());
   public static final fid k = a(fid.a(aP).a("pipeline/entity_solid").e("Sampler1").c());
   public static final fid l = a(fid.a(aP).a("pipeline/entity_solid_offset_forward").e("Sampler1").c());
   public static final fid m = a(fid.a(aP).a("pipeline/entity_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").c());
   public static final fid n = a(fid.a(aP).a("pipeline/entity_cutout_no_cull").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fid o = a(fid.a(aP).a("pipeline/entity_cutout_no_cull_z_offset").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fid p = a(fid.a(aP).a("pipeline/entity_translucent").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(fia.d).a(false).c());
   public static final fid q = a(
      fid.a(aP).a("pipeline/entity_translucent_emissive").a("ALPHA_CUTOUT", 0.1F).d("EMISSIVE").e("Sampler1").a(fia.d).a(false).c(false).c()
   );
   public static final fid r = a(fid.a(aP).a("pipeline/entity_smooth_cutout").a("ALPHA_CUTOUT", 0.1F).e("Sampler1").a(false).c());
   public static final fid s = a(fid.a(aP).a("pipeline/entity_no_outline").d("NO_OVERLAY").a(fia.d).a(false).c(false).c());
   public static final fid t = a(
      fid.a(aP)
         .a("pipeline/breeze_wind")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("APPLY_TEXTURE_MATRIX")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .a("TextureMat", fjl.a.g)
         .a(fia.d)
         .a(false)
         .c()
   );
   public static final fid u = a(
      fid.a(aL)
         .a("pipeline/energy_swirl")
         .c("core/entity")
         .b("core/entity")
         .a("ALPHA_CUTOUT", 0.1F)
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .d("APPLY_TEXTURE_MATRIX")
         .e("Sampler0")
         .a("TextureMat", fjl.a.g)
         .a(fia.e)
         .a(false)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid v = a(
      fid.a(aL)
         .a("pipeline/eyes")
         .c("core/entity")
         .b("core/entity")
         .d("EMISSIVE")
         .d("NO_OVERLAY")
         .d("NO_CARDINAL_LIGHTING")
         .e("Sampler0")
         .a(fia.d)
         .c(false)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid w = a(
      fid.a(aN)
         .a("pipeline/entity_decal")
         .c("core/rendertype_entity_decal")
         .b("core/rendertype_entity_decal")
         .e("Sampler0")
         .e("Sampler1")
         .e("Sampler2")
         .a(gpx.b)
         .a(false)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid x = a(
      fid.a(aL)
         .a("pipeline/entity_shadow")
         .c("core/rendertype_entity_shadow")
         .b("core/rendertype_entity_shadow")
         .e("Sampler0")
         .a(fia.d)
         .c(false)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid y = a(
      fid.a(aN)
         .a("pipeline/item_entity_translucent_cull")
         .c("core/rendertype_item_entity_translucent_cull")
         .b("core/rendertype_item_entity_translucent_cull")
         .e("Sampler0")
         .e("Sampler2")
         .a(fia.d)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid z = a(fid.a(aQ).a("pipeline/beacon_beam_opaque").c());
   public static final fid A = a(fid.a(aQ).a("pipeline/beacon_beam_translucent").c(false).a(fia.d).c());
   public static final fid B = a(
      fid.a(aH)
         .a("pipeline/dragon_explosion_alpha")
         .c("core/rendertype_entity_alpha")
         .b("core/rendertype_entity_alpha")
         .e("Sampler0")
         .a(false)
         .a(fjw.c, fkd.c.h)
         .c()
   );
   public static final fid C = a(
      fid.a(aL).a("pipeline/leash").c("core/rendertype_leash").b("core/rendertype_leash").e("Sampler2").a(false).a(fjw.h, fkd.c.f).c()
   );
   public static final fid D = a(
      fid.a(aK).a("pipeline/water_mask").c("core/rendertype_water_mask").b("core/rendertype_water_mask").b(false).a(fjw.e, fkd.c.h).c()
   );
   public static final fid E = a(
      fid.a(aK, aI)
         .a("pipeline/glint")
         .c("core/glint")
         .b("core/glint")
         .e("Sampler0")
         .a("TextureMat", fjl.a.g)
         .a("GlintAlpha", fjl.a.c)
         .c(false)
         .a(false)
         .a(gpx.b)
         .a(fia.b)
         .a(fjw.i, fkd.c.h)
         .c()
   );
   public static final fid F = a(
      fid.a(aK)
         .a("pipeline/crumbling")
         .c("core/rendertype_crumbling")
         .b("core/rendertype_crumbling")
         .e("Sampler0")
         .a(
            new fia(GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO)
         )
         .c(false)
         .a(fjw.b, fkd.c.h)
         .c()
   );
   public static final fid G = a(fid.a(aR, aJ).a("pipeline/text").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c());
   public static final fid H = a(
      fid.a(aR, aJ).a("pipeline/text_background").c("core/rendertype_text_background").b("core/rendertype_text_background").e("Sampler2").a(fjw.h, fkd.c.h).c()
   );
   public static final fid I = a(
      fid.a(aR, aJ).a("pipeline/text_intensity").c("core/rendertype_text_intensity").b("core/rendertype_text_intensity").e("Sampler0").e("Sampler2").c()
   );
   public static final fid J = a(
      fid.a(aR, aJ).a("pipeline/text_polygon_offset").c("core/rendertype_text").b("core/rendertype_text").e("Sampler0").e("Sampler2").c()
   );
   public static final fid K = a(
      fid.a(aR).a("pipeline/text_see_through").c("core/rendertype_text_see_through").b("core/rendertype_text_see_through").e("Sampler0").c(false).a(gpx.a).c()
   );
   public static final fid L = a(
      fid.a(aR)
         .a("pipeline/text_background_see_through")
         .c("core/rendertype_text_background_see_through")
         .b("core/rendertype_text_background_see_through")
         .c(false)
         .a(gpx.a)
         .a(fjw.h, fkd.c.h)
         .c()
   );
   public static final fid M = a(
      fid.a(aR)
         .a("pipeline/text_intensity_see_through")
         .c("core/rendertype_text_intensity_see_through")
         .b("core/rendertype_text_intensity_see_through")
         .e("Sampler0")
         .c(false)
         .a(gpx.a)
         .c()
   );
   public static final fid N = a(fid.a(aL).a("pipeline/lightning").c("core/rendertype_lightning").b("core/rendertype_lightning").a(fia.a).a(fjw.f, fkd.c.h).c());
   public static final fid O = a(
      fid.a(aL).a("pipeline/dragon_rays").c("core/rendertype_lightning").b("core/rendertype_lightning").c(false).a(fia.a).a(fjw.f, fkd.c.e).c()
   );
   public static final fid P = a(fid.a(aL).a("pipeline/dragon_rays_depth").c("core/position").b("core/position").b(false).a(fjw.e, fkd.c.e).c());
   public static final fid Q = a(fid.a(aS).a("pipeline/end_portal").a("PORTAL_LAYERS", 15).c());
   public static final fid R = a(fid.a(aS).a("pipeline/end_gateway").a("PORTAL_LAYERS", 16).c());
   public static final fid S = a(fid.a(aT).a("pipeline/flat_clouds").a(false).c());
   public static final fid T = a(fid.a(aT).a("pipeline/clouds").c());
   public static final fid U = a(fid.a(aT).a("pipeline/clouds_depth_only").b(false).c());
   public static final fid V = a(fid.a(aU).a("pipeline/lines").c());
   public static final fid W = a(fid.a(aU).a("pipeline/secondary_block_outline").c(false).c());
   public static final fid X = a(fid.a(aU).a("pipeline/line_strip").a(fjw.g, fkd.c.b).c());
   public static final fid Y = a(fid.a(aK).a("pipeline/debug_line_strip").c("core/position_color").b("core/position_color").a(false).a(fjw.f, fkd.c.d).c());
   public static final fid Z = a(fid.a(aV).a("pipeline/debug_filled_box").a(fjw.f, fkd.c.f).c());
   public static final fid aa = a(fid.a(aV).a("pipeline/debug_quads").a(false).c());
   public static final fid ab = a(fid.a(aV).a("pipeline/debug_triangle_fan").a(false).a(fjw.f, fkd.c.g).c());
   public static final fid ac = a(fid.a(aV).a("pipeline/debug_structure_quads").a(false).c(false).c());
   public static final fid ad = a(fid.a(aV).a("pipeline/debug_section_quads").c());
   public static final fid ae = a(
      fid.a(aK)
         .a("pipeline/world_border")
         .c("core/rendertype_world_border")
         .b("core/rendertype_world_border")
         .e("Sampler0")
         .a("TextureMat", fjl.a.g)
         .a("ModelOffset", fjl.a.e)
         .a(fia.c)
         .a(false)
         .a(fjw.i, fkd.c.h)
         .c()
   );
   public static final fid af = a(fid.a(aW).a("pipeline/opaque_particle").c());
   public static final fid ag = a(fid.a(aW).a("pipeline/translucent_particle").a(fia.d).c());
   public static final fid ah = a(fid.a(aX).a("pipeline/weather_depth_write").c());
   public static final fid ai = a(fid.a(aX).a("pipeline/weather_no_depth_write").c(false).c());
   public static final fid aj = a(fid.a(aL).a("pipeline/sky").c("core/position").b("core/position").c(false).a(fjw.e, fkd.c.h).c());
   public static final fid ak = a(
      fid.a(aK).a("pipeline/end_sky").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fia.d).c(false).a(fjw.j, fkd.c.h).c()
   );
   public static final fid al = a(
      fid.a(aK).a("pipeline/sunrise_sunset").c("core/position_color").b("core/position_color").a(fia.d).c(false).a(fjw.f, fkd.c.g).c()
   );
   public static final fid am = a(fid.a(aL).a("pipeline/stars").c("core/position").b("core/position").a(fia.c).c(false).a(fjw.e, fkd.c.h).c());
   public static final fid an = a(
      fid.a(aK).a("pipeline/celestial").c("core/position_tex_color").b("core/position_tex_color").e("Sampler0").a(fia.c).c(false).a(fjw.j, fkd.c.h).c()
   );
   public static final fid ao = a(fid.a(aY).a("pipeline/gui").c());
   public static final fid ap = a(fid.a(aY).a("pipeline/gui_overlay").a(gpx.a).c(false).c());
   public static final fid aq = a(fid.a(aY).a("pipeline/gui_text_highlight").a(gpx.a).a(GlStateManager.h.o).c());
   public static final fid ar = a(fid.a(aY).a("pipeline/gui_ghost_recipe_overlay").a(gpx.d).c(false).c());
   public static final fid as = a(fid.a(aZ).a("pipeline/gui_textured").c());
   public static final fid at = a(fid.a(aZ).a("pipeline/gui_textured_overlay").a(gpx.a).c(false).c());
   public static final fid au = a(fid.a(aZ).a("pipeline/block_screen_effect").a(gpx.a).c(false).c());
   public static final fid av = a(fid.a(aZ).a("pipeline/fire_screen_effect").a(gpx.a).c(false).c());
   public static final fid aw = a(fid.a(aZ).a("pipeline/gui_opaque_textured_background").a().c());
   public static final fid ax = a(fid.a(aZ).a("pipeline/gui_nausea_overlay").a(fia.e).a(gpx.a).c(false).c());
   public static final fid ay = a(
      fid.a(aZ).a("pipeline/vignette").a(new fia(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR)).a(gpx.a).c(false).c()
   );
   public static final fid az = a(
      fid.a(aZ)
         .a("pipeline/crosshair")
         .a(
            new fia(
               GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
               GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
               GlStateManager.SourceFactor.ONE,
               GlStateManager.DestFactor.ZERO
            )
         )
         .c()
   );
   public static final fid aA = a(
      fid.a(aZ).a("pipeline/mojang_logo").a(new fia(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE)).a(gpx.a).c(false).c()
   );
   public static final fid aB = a(
      fid.a()
         .a("pipeline/entity_outline_blit")
         .c("core/blit_screen")
         .b("core/blit_screen")
         .e("InSampler")
         .a(fia.g)
         .c(false)
         .a(gpx.a)
         .a(true, false)
         .a(fjw.e, fkd.c.h)
         .c()
   );
   public static final fid aC = a(
      fid.a(aK).a("pipeline/panorama").c("core/position_tex").b("core/position_tex").e("Sampler0").c(false).a(true, false).a(fia.f).a(fjw.i, fkd.c.h).c()
   );
   public static final fid aD = a(fid.a(ba).a("pipeline/outline_cull").c());
   public static final fid aE = a(fid.a(ba).a("pipeline/outline_no_cull").a(false).c());
   public static final fid aF = a(
      fid.a()
         .a("pipeline/lightmap")
         .c("core/blit_screen")
         .b("core/lightmap")
         .a("AmbientLightFactor", fjl.a.c)
         .a("SkyFactor", fjl.a.c)
         .a("BlockFactor", fjl.a.c)
         .a("UseBrightLightmap", fjl.a.a)
         .a("SkyLightColor", fjl.a.e)
         .a("NightVisionFactor", fjl.a.c)
         .a("DarknessScale", fjl.a.c)
         .a("DarkenWorldFactor", fjl.a.c)
         .a("BrightnessFactor", fjl.a.c)
         .a(fjw.e, fkd.c.h)
         .c()
   );

   private static fid a(fid $$0) {
      aG.put($$0.d(), $$0);
      return $$0;
   }

   public static List<fid> a() {
      return aG.values().stream().toList();
   }
}
