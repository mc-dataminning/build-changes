import java.util.ArrayList;
import java.util.List;

public class ghr {
   private static final List<giz> ad = new ArrayList<>();
   public static final giz a = a("blit_screen", fdz.a);
   public static final giz b = a("lightmap", fdz.a);
   public static final giz c = a("particle", fdz.d);
   public static final giz d = a("position", fdz.e);
   public static final giz e = a("position_color", fdz.f);
   public static final giz f = a("position_color_lightmap", fdz.h);
   public static final giz g = a("position_color_tex_lightmap", fdz.k);
   public static final giz h = a("position_tex", fdz.i);
   public static final giz i = a("position_tex_color", fdz.j);
   public static final giz j = a("rendertype_solid", fdz.b);
   public static final giz k = a("rendertype_cutout_mipped", fdz.b);
   public static final giz l = a("rendertype_cutout", fdz.b);
   public static final giz m = a("rendertype_translucent", fdz.b);
   public static final giz n = a("rendertype_translucent_moving_block", fdz.b);
   public static final giz o = a("rendertype_armor_cutout_no_cull", fdz.c);
   public static final giz p = a("rendertype_entity_solid", fdz.c);
   public static final giz q = a("rendertype_entity_cutout", fdz.c);
   public static final giz r = a("rendertype_entity_cutout_no_cull", fdz.c);
   public static final giz s = a("rendertype_entity_cutout_no_cull_z_offset", fdz.c);
   public static final giz t = a("rendertype_item_entity_translucent_cull", fdz.c);
   public static final giz u = a("rendertype_entity_translucent", fdz.c);
   public static final giz v = a("rendertype_entity_translucent_emissive", fdz.c);
   public static final giz w = a("rendertype_entity_smooth_cutout", fdz.c);
   public static final giz x = a("rendertype_beacon_beam", fdz.b);
   public static final giz y = a("rendertype_entity_decal", fdz.c);
   public static final giz z = a("rendertype_entity_no_outline", fdz.c);
   public static final giz A = a("rendertype_entity_shadow", fdz.c);
   public static final giz B = a("rendertype_entity_alpha", fdz.c);
   public static final giz C = a("rendertype_eyes", fdz.c);
   public static final giz D = a("rendertype_energy_swirl", fdz.c);
   public static final giz E = a("rendertype_leash", fdz.h);
   public static final giz F = a("rendertype_water_mask", fdz.e);
   public static final giz G = a("rendertype_outline", fdz.j);
   public static final giz H = a("rendertype_armor_entity_glint", fdz.i);
   public static final giz I = a("rendertype_glint_translucent", fdz.i);
   public static final giz J = a("rendertype_glint", fdz.i);
   public static final giz K = a("rendertype_entity_glint", fdz.i);
   public static final giz L = a("rendertype_text", fdz.k);
   public static final giz M = a("rendertype_text_background", fdz.h);
   public static final giz N = a("rendertype_text_intensity", fdz.k);
   public static final giz O = a("rendertype_text_see_through", fdz.k);
   public static final giz P = a("rendertype_text_background_see_through", fdz.h);
   public static final giz Q = a("rendertype_text_intensity_see_through", fdz.k);
   public static final giz R = a("rendertype_lightning", fdz.f);
   public static final giz S = a("rendertype_tripwire", fdz.b);
   public static final giz T = a("rendertype_end_portal", fdz.e);
   public static final giz U = a("rendertype_end_gateway", fdz.e);
   public static final giz V = a("rendertype_clouds", fdz.f);
   public static final giz W = a("rendertype_lines", fdz.g);
   public static final giz X = a("rendertype_crumbling", fdz.b);
   public static final giz Y = a("rendertype_gui", fdz.f);
   public static final giz Z = a("rendertype_gui_overlay", fdz.f);
   public static final giz aa = a("rendertype_gui_text_highlight", fdz.f);
   public static final giz ab = a("rendertype_gui_ghost_recipe_overlay", fdz.f);
   public static final giz ac = a("rendertype_breeze_wind", fdz.c);

   private static giz a(String $$0, feg $$1) {
      return a($$0, $$1, gix.a);
   }

   private static giz a(String $$0, feg $$1, gix $$2) {
      giz $$3 = new giz(ali.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<giz> a() {
      return ad;
   }
}
