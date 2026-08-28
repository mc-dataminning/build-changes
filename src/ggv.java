import java.util.ArrayList;
import java.util.List;

public class ggv {
   private static final List<gid> ad = new ArrayList<>();
   public static final gid a = a("blit_screen", fdg.a);
   public static final gid b = a("lightmap", fdg.a);
   public static final gid c = a("particle", fdg.d);
   public static final gid d = a("position", fdg.e);
   public static final gid e = a("position_color", fdg.f);
   public static final gid f = a("position_color_lightmap", fdg.h);
   public static final gid g = a("position_color_tex_lightmap", fdg.k);
   public static final gid h = a("position_tex", fdg.i);
   public static final gid i = a("position_tex_color", fdg.j);
   public static final gid j = a("rendertype_solid", fdg.b);
   public static final gid k = a("rendertype_cutout_mipped", fdg.b);
   public static final gid l = a("rendertype_cutout", fdg.b);
   public static final gid m = a("rendertype_translucent", fdg.b);
   public static final gid n = a("rendertype_translucent_moving_block", fdg.b);
   public static final gid o = a("rendertype_armor_cutout_no_cull", fdg.c);
   public static final gid p = a("rendertype_entity_solid", fdg.c);
   public static final gid q = a("rendertype_entity_cutout", fdg.c);
   public static final gid r = a("rendertype_entity_cutout_no_cull", fdg.c);
   public static final gid s = a("rendertype_entity_cutout_no_cull_z_offset", fdg.c);
   public static final gid t = a("rendertype_item_entity_translucent_cull", fdg.c);
   public static final gid u = a("rendertype_entity_translucent", fdg.c);
   public static final gid v = a("rendertype_entity_translucent_emissive", fdg.c);
   public static final gid w = a("rendertype_entity_smooth_cutout", fdg.c);
   public static final gid x = a("rendertype_beacon_beam", fdg.b);
   public static final gid y = a("rendertype_entity_decal", fdg.c);
   public static final gid z = a("rendertype_entity_no_outline", fdg.c);
   public static final gid A = a("rendertype_entity_shadow", fdg.c);
   public static final gid B = a("rendertype_entity_alpha", fdg.c);
   public static final gid C = a("rendertype_eyes", fdg.c);
   public static final gid D = a("rendertype_energy_swirl", fdg.c);
   public static final gid E = a("rendertype_leash", fdg.h);
   public static final gid F = a("rendertype_water_mask", fdg.e);
   public static final gid G = a("rendertype_outline", fdg.j);
   public static final gid H = a("rendertype_armor_entity_glint", fdg.i);
   public static final gid I = a("rendertype_glint_translucent", fdg.i);
   public static final gid J = a("rendertype_glint", fdg.i);
   public static final gid K = a("rendertype_entity_glint", fdg.i);
   public static final gid L = a("rendertype_text", fdg.k);
   public static final gid M = a("rendertype_text_background", fdg.h);
   public static final gid N = a("rendertype_text_intensity", fdg.k);
   public static final gid O = a("rendertype_text_see_through", fdg.k);
   public static final gid P = a("rendertype_text_background_see_through", fdg.h);
   public static final gid Q = a("rendertype_text_intensity_see_through", fdg.k);
   public static final gid R = a("rendertype_lightning", fdg.f);
   public static final gid S = a("rendertype_tripwire", fdg.b);
   public static final gid T = a("rendertype_end_portal", fdg.e);
   public static final gid U = a("rendertype_end_gateway", fdg.e);
   public static final gid V = a("rendertype_clouds", fdg.f);
   public static final gid W = a("rendertype_lines", fdg.g);
   public static final gid X = a("rendertype_crumbling", fdg.b);
   public static final gid Y = a("rendertype_gui", fdg.f);
   public static final gid Z = a("rendertype_gui_overlay", fdg.f);
   public static final gid aa = a("rendertype_gui_text_highlight", fdg.f);
   public static final gid ab = a("rendertype_gui_ghost_recipe_overlay", fdg.f);
   public static final gid ac = a("rendertype_breeze_wind", fdg.c);

   private static gid a(String $$0, fdn $$1) {
      return a($$0, $$1, gib.a);
   }

   private static gid a(String $$0, fdn $$1, gib $$2) {
      gid $$3 = new gid(ale.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<gid> a() {
      return ad;
   }
}
