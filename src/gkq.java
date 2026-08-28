import java.util.ArrayList;
import java.util.List;

public class gkq {
   private static final List<gly> ae = new ArrayList<>();
   public static final gly a = a("blit_screen", fgj.a);
   public static final gly b = a("lightmap", fgj.a);
   public static final gly c = a("particle", fgj.d);
   public static final gly d = a("position", fgj.e);
   public static final gly e = a("position_color", fgj.f);
   public static final gly f = a("position_color_lightmap", fgj.h);
   public static final gly g = a("position_color_tex_lightmap", fgj.k);
   public static final gly h = a("position_tex", fgj.i);
   public static final gly i = a("position_tex_color", fgj.j);
   public static final gly j = a("rendertype_solid", fgj.b);
   public static final gly k = a("rendertype_cutout_mipped", fgj.b);
   public static final gly l = a("rendertype_cutout", fgj.b);
   public static final gly m = a("rendertype_translucent", fgj.b);
   public static final gly n = a("rendertype_translucent_moving_block", fgj.b);
   public static final gly o = a("rendertype_armor_cutout_no_cull", fgj.c);
   public static final gly p = a("rendertype_armor_translucent", fgj.c);
   public static final gly q = a("rendertype_entity_solid", fgj.c);
   public static final gly r = a("rendertype_entity_cutout", fgj.c);
   public static final gly s = a("rendertype_entity_cutout_no_cull", fgj.c);
   public static final gly t = a("rendertype_entity_cutout_no_cull_z_offset", fgj.c);
   public static final gly u = a("rendertype_item_entity_translucent_cull", fgj.c);
   public static final gly v = a("rendertype_entity_translucent", fgj.c);
   public static final gly w = a("rendertype_entity_translucent_emissive", fgj.c);
   public static final gly x = a("rendertype_entity_smooth_cutout", fgj.c);
   public static final gly y = a("rendertype_beacon_beam", fgj.b);
   public static final gly z = a("rendertype_entity_decal", fgj.c);
   public static final gly A = a("rendertype_entity_no_outline", fgj.c);
   public static final gly B = a("rendertype_entity_shadow", fgj.c);
   public static final gly C = a("rendertype_entity_alpha", fgj.c);
   public static final gly D = a("rendertype_eyes", fgj.c);
   public static final gly E = a("rendertype_energy_swirl", fgj.c);
   public static final gly F = a("rendertype_leash", fgj.h);
   public static final gly G = a("rendertype_water_mask", fgj.e);
   public static final gly H = a("rendertype_outline", fgj.j);
   public static final gly I = a("rendertype_armor_entity_glint", fgj.i);
   public static final gly J = a("rendertype_glint_translucent", fgj.i);
   public static final gly K = a("rendertype_glint", fgj.i);
   public static final gly L = a("rendertype_entity_glint", fgj.i);
   public static final gly M = a("rendertype_text", fgj.k);
   public static final gly N = a("rendertype_text_background", fgj.h);
   public static final gly O = a("rendertype_text_intensity", fgj.k);
   public static final gly P = a("rendertype_text_see_through", fgj.k);
   public static final gly Q = a("rendertype_text_background_see_through", fgj.h);
   public static final gly R = a("rendertype_text_intensity_see_through", fgj.k);
   public static final gly S = a("rendertype_lightning", fgj.f);
   public static final gly T = a("rendertype_tripwire", fgj.b);
   public static final gly U = a("rendertype_end_portal", fgj.e);
   public static final gly V = a("rendertype_end_gateway", fgj.e);
   public static final gly W = a("rendertype_clouds", fgj.f);
   public static final gly X = a("rendertype_lines", fgj.g);
   public static final gly Y = a("rendertype_crumbling", fgj.b);
   public static final gly Z = a("rendertype_gui", fgj.f);
   public static final gly aa = a("rendertype_gui_overlay", fgj.f);
   public static final gly ab = a("rendertype_gui_text_highlight", fgj.f);
   public static final gly ac = a("rendertype_gui_ghost_recipe_overlay", fgj.f);
   public static final gly ad = a("rendertype_breeze_wind", fgj.c);

   private static gly a(String $$0, fgq $$1) {
      return a($$0, $$1, glw.a);
   }

   private static gly a(String $$0, fgq $$1, glw $$2) {
      gly $$3 = new gly(alp.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gly> a() {
      return ae;
   }
}
