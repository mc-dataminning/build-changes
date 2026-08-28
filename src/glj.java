import java.util.ArrayList;
import java.util.List;

public class glj {
   private static final List<gmq> ae = new ArrayList<>();
   public static final gmq a = a("blit_screen", ffs.a);
   public static final gmq b = a("lightmap", ffs.a);
   public static final gmq c = a("particle", ffs.d);
   public static final gmq d = a("position", ffs.e);
   public static final gmq e = a("position_color", ffs.f);
   public static final gmq f = a("position_color_lightmap", ffs.h);
   public static final gmq g = a("position_color_tex_lightmap", ffs.k);
   public static final gmq h = a("position_tex", ffs.i);
   public static final gmq i = a("position_tex_color", ffs.j);
   public static final gmq j = a("rendertype_solid", ffs.b);
   public static final gmq k = a("rendertype_cutout_mipped", ffs.b);
   public static final gmq l = a("rendertype_cutout", ffs.b);
   public static final gmq m = a("rendertype_translucent", ffs.b);
   public static final gmq n = a("rendertype_translucent_moving_block", ffs.b);
   public static final gmq o = a("rendertype_armor_cutout_no_cull", ffs.c);
   public static final gmq p = a("rendertype_armor_translucent", ffs.c);
   public static final gmq q = a("rendertype_entity_solid", ffs.c);
   public static final gmq r = a("rendertype_entity_cutout", ffs.c);
   public static final gmq s = a("rendertype_entity_cutout_no_cull", ffs.c);
   public static final gmq t = a("rendertype_entity_cutout_no_cull_z_offset", ffs.c);
   public static final gmq u = a("rendertype_item_entity_translucent_cull", ffs.c);
   public static final gmq v = a("rendertype_entity_translucent", ffs.c);
   public static final gmq w = a("rendertype_entity_translucent_emissive", ffs.c);
   public static final gmq x = a("rendertype_entity_smooth_cutout", ffs.c);
   public static final gmq y = a("rendertype_beacon_beam", ffs.b);
   public static final gmq z = a("rendertype_entity_decal", ffs.c);
   public static final gmq A = a("rendertype_entity_no_outline", ffs.c);
   public static final gmq B = a("rendertype_entity_shadow", ffs.c);
   public static final gmq C = a("rendertype_entity_alpha", ffs.c);
   public static final gmq D = a("rendertype_eyes", ffs.c);
   public static final gmq E = a("rendertype_energy_swirl", ffs.c);
   public static final gmq F = a("rendertype_leash", ffs.h);
   public static final gmq G = a("rendertype_water_mask", ffs.e);
   public static final gmq H = a("rendertype_outline", ffs.j);
   public static final gmq I = a("rendertype_armor_entity_glint", ffs.i);
   public static final gmq J = a("rendertype_glint_translucent", ffs.i);
   public static final gmq K = a("rendertype_glint", ffs.i);
   public static final gmq L = a("rendertype_entity_glint", ffs.i);
   public static final gmq M = a("rendertype_text", ffs.k);
   public static final gmq N = a("rendertype_text_background", ffs.h);
   public static final gmq O = a("rendertype_text_intensity", ffs.k);
   public static final gmq P = a("rendertype_text_see_through", ffs.k);
   public static final gmq Q = a("rendertype_text_background_see_through", ffs.h);
   public static final gmq R = a("rendertype_text_intensity_see_through", ffs.k);
   public static final gmq S = a("rendertype_lightning", ffs.f);
   public static final gmq T = a("rendertype_tripwire", ffs.b);
   public static final gmq U = a("rendertype_end_portal", ffs.e);
   public static final gmq V = a("rendertype_end_gateway", ffs.e);
   public static final gmq W = a("rendertype_clouds", ffs.f);
   public static final gmq X = a("rendertype_lines", ffs.g);
   public static final gmq Y = a("rendertype_crumbling", ffs.b);
   public static final gmq Z = a("rendertype_gui", ffs.f);
   public static final gmq aa = a("rendertype_gui_overlay", ffs.f);
   public static final gmq ab = a("rendertype_gui_text_highlight", ffs.f);
   public static final gmq ac = a("rendertype_gui_ghost_recipe_overlay", ffs.f);
   public static final gmq ad = a("rendertype_breeze_wind", ffs.c);

   private static gmq a(String $$0, ffz $$1) {
      return a($$0, $$1, gmo.a);
   }

   private static gmq a(String $$0, ffz $$1, gmo $$2) {
      gmq $$3 = new gmq(akv.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmq> a() {
      return ae;
   }
}
