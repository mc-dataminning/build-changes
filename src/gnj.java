import java.util.ArrayList;
import java.util.List;

public class gnj {
   private static final List<goq> ae = new ArrayList<>();
   public static final goq a = a("blit_screen", fhm.a);
   public static final goq b = a("lightmap", fhm.a);
   public static final goq c = a("particle", fhm.d);
   public static final goq d = a("position", fhm.e);
   public static final goq e = a("position_color", fhm.f);
   public static final goq f = a("position_color_lightmap", fhm.h);
   public static final goq g = a("position_color_tex_lightmap", fhm.k);
   public static final goq h = a("position_tex", fhm.i);
   public static final goq i = a("position_tex_color", fhm.j);
   public static final goq j = a("rendertype_solid", fhm.b);
   public static final goq k = a("rendertype_cutout_mipped", fhm.b);
   public static final goq l = a("rendertype_cutout", fhm.b);
   public static final goq m = a("rendertype_translucent", fhm.b);
   public static final goq n = a("rendertype_translucent_moving_block", fhm.b);
   public static final goq o = a("rendertype_armor_cutout_no_cull", fhm.c);
   public static final goq p = a("rendertype_armor_translucent", fhm.c);
   public static final goq q = a("rendertype_entity_solid", fhm.c);
   public static final goq r = a("rendertype_entity_cutout", fhm.c);
   public static final goq s = a("rendertype_entity_cutout_no_cull", fhm.c);
   public static final goq t = a("rendertype_entity_cutout_no_cull_z_offset", fhm.c);
   public static final goq u = a("rendertype_item_entity_translucent_cull", fhm.c);
   public static final goq v = a("rendertype_entity_translucent", fhm.c);
   public static final goq w = a("rendertype_entity_translucent_emissive", fhm.c);
   public static final goq x = a("rendertype_entity_smooth_cutout", fhm.c);
   public static final goq y = a("rendertype_beacon_beam", fhm.b);
   public static final goq z = a("rendertype_entity_decal", fhm.c);
   public static final goq A = a("rendertype_entity_no_outline", fhm.c);
   public static final goq B = a("rendertype_entity_shadow", fhm.c);
   public static final goq C = a("rendertype_entity_alpha", fhm.c);
   public static final goq D = a("rendertype_eyes", fhm.c);
   public static final goq E = a("rendertype_energy_swirl", fhm.c);
   public static final goq F = a("rendertype_leash", fhm.h);
   public static final goq G = a("rendertype_water_mask", fhm.e);
   public static final goq H = a("rendertype_outline", fhm.j);
   public static final goq I = a("rendertype_armor_entity_glint", fhm.i);
   public static final goq J = a("rendertype_glint_translucent", fhm.i);
   public static final goq K = a("rendertype_glint", fhm.i);
   public static final goq L = a("rendertype_entity_glint", fhm.i);
   public static final goq M = a("rendertype_text", fhm.k);
   public static final goq N = a("rendertype_text_background", fhm.h);
   public static final goq O = a("rendertype_text_intensity", fhm.k);
   public static final goq P = a("rendertype_text_see_through", fhm.k);
   public static final goq Q = a("rendertype_text_background_see_through", fhm.h);
   public static final goq R = a("rendertype_text_intensity_see_through", fhm.k);
   public static final goq S = a("rendertype_lightning", fhm.f);
   public static final goq T = a("rendertype_tripwire", fhm.b);
   public static final goq U = a("rendertype_end_portal", fhm.e);
   public static final goq V = a("rendertype_end_gateway", fhm.e);
   public static final goq W = a("rendertype_clouds", fhm.f);
   public static final goq X = a("rendertype_lines", fhm.g);
   public static final goq Y = a("rendertype_crumbling", fhm.b);
   public static final goq Z = a("rendertype_gui", fhm.f);
   public static final goq aa = a("rendertype_gui_overlay", fhm.f);
   public static final goq ab = a("rendertype_gui_text_highlight", fhm.f);
   public static final goq ac = a("rendertype_gui_ghost_recipe_overlay", fhm.f);
   public static final goq ad = a("rendertype_breeze_wind", fhm.c);

   private static goq a(String $$0, fht $$1) {
      return a($$0, $$1, goo.a);
   }

   private static goq a(String $$0, fht $$1, goo $$2) {
      goq $$3 = new goq(ald.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<goq> a() {
      return ae;
   }
}
