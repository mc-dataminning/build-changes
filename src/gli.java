import java.util.ArrayList;
import java.util.List;

public class gli {
   private static final List<gmp> ae = new ArrayList<>();
   public static final gmp a = a("blit_screen", ffs.a);
   public static final gmp b = a("lightmap", ffs.a);
   public static final gmp c = a("particle", ffs.d);
   public static final gmp d = a("position", ffs.e);
   public static final gmp e = a("position_color", ffs.f);
   public static final gmp f = a("position_color_lightmap", ffs.h);
   public static final gmp g = a("position_color_tex_lightmap", ffs.k);
   public static final gmp h = a("position_tex", ffs.i);
   public static final gmp i = a("position_tex_color", ffs.j);
   public static final gmp j = a("rendertype_solid", ffs.b);
   public static final gmp k = a("rendertype_cutout_mipped", ffs.b);
   public static final gmp l = a("rendertype_cutout", ffs.b);
   public static final gmp m = a("rendertype_translucent", ffs.b);
   public static final gmp n = a("rendertype_translucent_moving_block", ffs.b);
   public static final gmp o = a("rendertype_armor_cutout_no_cull", ffs.c);
   public static final gmp p = a("rendertype_armor_translucent", ffs.c);
   public static final gmp q = a("rendertype_entity_solid", ffs.c);
   public static final gmp r = a("rendertype_entity_cutout", ffs.c);
   public static final gmp s = a("rendertype_entity_cutout_no_cull", ffs.c);
   public static final gmp t = a("rendertype_entity_cutout_no_cull_z_offset", ffs.c);
   public static final gmp u = a("rendertype_item_entity_translucent_cull", ffs.c);
   public static final gmp v = a("rendertype_entity_translucent", ffs.c);
   public static final gmp w = a("rendertype_entity_translucent_emissive", ffs.c);
   public static final gmp x = a("rendertype_entity_smooth_cutout", ffs.c);
   public static final gmp y = a("rendertype_beacon_beam", ffs.b);
   public static final gmp z = a("rendertype_entity_decal", ffs.c);
   public static final gmp A = a("rendertype_entity_no_outline", ffs.c);
   public static final gmp B = a("rendertype_entity_shadow", ffs.c);
   public static final gmp C = a("rendertype_entity_alpha", ffs.c);
   public static final gmp D = a("rendertype_eyes", ffs.c);
   public static final gmp E = a("rendertype_energy_swirl", ffs.c);
   public static final gmp F = a("rendertype_leash", ffs.h);
   public static final gmp G = a("rendertype_water_mask", ffs.e);
   public static final gmp H = a("rendertype_outline", ffs.j);
   public static final gmp I = a("rendertype_armor_entity_glint", ffs.i);
   public static final gmp J = a("rendertype_glint_translucent", ffs.i);
   public static final gmp K = a("rendertype_glint", ffs.i);
   public static final gmp L = a("rendertype_entity_glint", ffs.i);
   public static final gmp M = a("rendertype_text", ffs.k);
   public static final gmp N = a("rendertype_text_background", ffs.h);
   public static final gmp O = a("rendertype_text_intensity", ffs.k);
   public static final gmp P = a("rendertype_text_see_through", ffs.k);
   public static final gmp Q = a("rendertype_text_background_see_through", ffs.h);
   public static final gmp R = a("rendertype_text_intensity_see_through", ffs.k);
   public static final gmp S = a("rendertype_lightning", ffs.f);
   public static final gmp T = a("rendertype_tripwire", ffs.b);
   public static final gmp U = a("rendertype_end_portal", ffs.e);
   public static final gmp V = a("rendertype_end_gateway", ffs.e);
   public static final gmp W = a("rendertype_clouds", ffs.f);
   public static final gmp X = a("rendertype_lines", ffs.g);
   public static final gmp Y = a("rendertype_crumbling", ffs.b);
   public static final gmp Z = a("rendertype_gui", ffs.f);
   public static final gmp aa = a("rendertype_gui_overlay", ffs.f);
   public static final gmp ab = a("rendertype_gui_text_highlight", ffs.f);
   public static final gmp ac = a("rendertype_gui_ghost_recipe_overlay", ffs.f);
   public static final gmp ad = a("rendertype_breeze_wind", ffs.c);

   private static gmp a(String $$0, ffz $$1) {
      return a($$0, $$1, gmn.a);
   }

   private static gmp a(String $$0, ffz $$1, gmn $$2) {
      gmp $$3 = new gmp(aku.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmp> a() {
      return ae;
   }
}
