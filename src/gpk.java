import java.util.ArrayList;
import java.util.List;

public class gpk {
   private static final List<gqs> af = new ArrayList<>();
   public static final gqs a = a("blit_screen", fjh.a);
   public static final gqs b = a("lightmap", fjh.a);
   public static final gqs c = a("particle", fjh.d);
   public static final gqs d = a("position", fjh.e);
   public static final gqs e = a("position_color", fjh.f);
   public static final gqs f = a("position_color_lightmap", fjh.h);
   public static final gqs g = a("position_color_tex_lightmap", fjh.k);
   public static final gqs h = a("position_tex", fjh.i);
   public static final gqs i = a("position_tex_color", fjh.j);
   public static final gqs j = a("rendertype_solid", fjh.b);
   public static final gqs k = a("rendertype_cutout_mipped", fjh.b);
   public static final gqs l = a("rendertype_cutout", fjh.b);
   public static final gqs m = a("rendertype_translucent", fjh.b);
   public static final gqs n = a("rendertype_translucent_moving_block", fjh.b);
   public static final gqs o = a("rendertype_armor_cutout_no_cull", fjh.c);
   public static final gqs p = a("rendertype_armor_translucent", fjh.c);
   public static final gqs q = a("rendertype_entity_solid", fjh.c);
   public static final gqs r = a("rendertype_entity_cutout", fjh.c);
   public static final gqs s = a("rendertype_entity_cutout_no_cull", fjh.c);
   public static final gqs t = a("rendertype_entity_cutout_no_cull_z_offset", fjh.c);
   public static final gqs u = a("rendertype_item_entity_translucent_cull", fjh.c);
   public static final gqs v = a("rendertype_entity_translucent", fjh.c);
   public static final gqs w = a("rendertype_entity_translucent_emissive", fjh.c);
   public static final gqs x = a("rendertype_entity_smooth_cutout", fjh.c);
   public static final gqs y = a("rendertype_beacon_beam", fjh.b);
   public static final gqs z = a("rendertype_entity_decal", fjh.c);
   public static final gqs A = a("rendertype_entity_no_outline", fjh.c);
   public static final gqs B = a("rendertype_entity_shadow", fjh.c);
   public static final gqs C = a("rendertype_entity_alpha", fjh.c);
   public static final gqs D = a("rendertype_eyes", fjh.c);
   public static final gqs E = a("rendertype_energy_swirl", fjh.c);
   public static final gqs F = a("rendertype_leash", fjh.h);
   public static final gqs G = a("rendertype_water_mask", fjh.e);
   public static final gqs H = a("rendertype_outline", fjh.j);
   public static final gqs I = a("rendertype_armor_entity_glint", fjh.i);
   public static final gqs J = a("rendertype_glint_translucent", fjh.i);
   public static final gqs K = a("rendertype_glint", fjh.i);
   public static final gqs L = a("rendertype_entity_glint", fjh.i);
   public static final gqs M = a("rendertype_text", fjh.k);
   public static final gqs N = a("rendertype_text_background", fjh.h);
   public static final gqs O = a("rendertype_text_intensity", fjh.k);
   public static final gqs P = a("rendertype_text_see_through", fjh.k);
   public static final gqs Q = a("rendertype_text_background_see_through", fjh.h);
   public static final gqs R = a("rendertype_text_intensity_see_through", fjh.k);
   public static final gqs S = a("rendertype_lightning", fjh.f);
   public static final gqs T = a("rendertype_tripwire", fjh.b);
   public static final gqs U = a("rendertype_end_portal", fjh.e);
   public static final gqs V = a("rendertype_end_gateway", fjh.e);
   public static final gqs W = a("rendertype_world_border", fjh.i);
   public static final gqs X = a("rendertype_clouds", fjh.f);
   public static final gqs Y = a("rendertype_lines", fjh.g);
   public static final gqs Z = a("rendertype_crumbling", fjh.b);
   public static final gqs aa = a("rendertype_gui", fjh.f);
   public static final gqs ab = a("rendertype_gui_overlay", fjh.f);
   public static final gqs ac = a("rendertype_gui_text_highlight", fjh.f);
   public static final gqs ad = a("rendertype_gui_ghost_recipe_overlay", fjh.f);
   public static final gqs ae = a("rendertype_breeze_wind", fjh.c);

   private static gqs a(String $$0, fjo $$1) {
      return a($$0, $$1, gqq.a);
   }

   private static gqs a(String $$0, fjo $$1, gqq $$2) {
      gqs $$3 = new gqs(alg.b("core/" + $$0), $$1, $$2);
      af.add($$3);
      return $$3;
   }

   public static List<gqs> a() {
      return af;
   }
}
