import java.util.ArrayList;
import java.util.List;

public class gli {
   private static final List<gmp> ae = new ArrayList<>();
   public static final gmp a = a("blit_screen", ffr.a);
   public static final gmp b = a("lightmap", ffr.a);
   public static final gmp c = a("particle", ffr.d);
   public static final gmp d = a("position", ffr.e);
   public static final gmp e = a("position_color", ffr.f);
   public static final gmp f = a("position_color_lightmap", ffr.h);
   public static final gmp g = a("position_color_tex_lightmap", ffr.k);
   public static final gmp h = a("position_tex", ffr.i);
   public static final gmp i = a("position_tex_color", ffr.j);
   public static final gmp j = a("rendertype_solid", ffr.b);
   public static final gmp k = a("rendertype_cutout_mipped", ffr.b);
   public static final gmp l = a("rendertype_cutout", ffr.b);
   public static final gmp m = a("rendertype_translucent", ffr.b);
   public static final gmp n = a("rendertype_translucent_moving_block", ffr.b);
   public static final gmp o = a("rendertype_armor_cutout_no_cull", ffr.c);
   public static final gmp p = a("rendertype_armor_translucent", ffr.c);
   public static final gmp q = a("rendertype_entity_solid", ffr.c);
   public static final gmp r = a("rendertype_entity_cutout", ffr.c);
   public static final gmp s = a("rendertype_entity_cutout_no_cull", ffr.c);
   public static final gmp t = a("rendertype_entity_cutout_no_cull_z_offset", ffr.c);
   public static final gmp u = a("rendertype_item_entity_translucent_cull", ffr.c);
   public static final gmp v = a("rendertype_entity_translucent", ffr.c);
   public static final gmp w = a("rendertype_entity_translucent_emissive", ffr.c);
   public static final gmp x = a("rendertype_entity_smooth_cutout", ffr.c);
   public static final gmp y = a("rendertype_beacon_beam", ffr.b);
   public static final gmp z = a("rendertype_entity_decal", ffr.c);
   public static final gmp A = a("rendertype_entity_no_outline", ffr.c);
   public static final gmp B = a("rendertype_entity_shadow", ffr.c);
   public static final gmp C = a("rendertype_entity_alpha", ffr.c);
   public static final gmp D = a("rendertype_eyes", ffr.c);
   public static final gmp E = a("rendertype_energy_swirl", ffr.c);
   public static final gmp F = a("rendertype_leash", ffr.h);
   public static final gmp G = a("rendertype_water_mask", ffr.e);
   public static final gmp H = a("rendertype_outline", ffr.j);
   public static final gmp I = a("rendertype_armor_entity_glint", ffr.i);
   public static final gmp J = a("rendertype_glint_translucent", ffr.i);
   public static final gmp K = a("rendertype_glint", ffr.i);
   public static final gmp L = a("rendertype_entity_glint", ffr.i);
   public static final gmp M = a("rendertype_text", ffr.k);
   public static final gmp N = a("rendertype_text_background", ffr.h);
   public static final gmp O = a("rendertype_text_intensity", ffr.k);
   public static final gmp P = a("rendertype_text_see_through", ffr.k);
   public static final gmp Q = a("rendertype_text_background_see_through", ffr.h);
   public static final gmp R = a("rendertype_text_intensity_see_through", ffr.k);
   public static final gmp S = a("rendertype_lightning", ffr.f);
   public static final gmp T = a("rendertype_tripwire", ffr.b);
   public static final gmp U = a("rendertype_end_portal", ffr.e);
   public static final gmp V = a("rendertype_end_gateway", ffr.e);
   public static final gmp W = a("rendertype_clouds", ffr.f);
   public static final gmp X = a("rendertype_lines", ffr.g);
   public static final gmp Y = a("rendertype_crumbling", ffr.b);
   public static final gmp Z = a("rendertype_gui", ffr.f);
   public static final gmp aa = a("rendertype_gui_overlay", ffr.f);
   public static final gmp ab = a("rendertype_gui_text_highlight", ffr.f);
   public static final gmp ac = a("rendertype_gui_ghost_recipe_overlay", ffr.f);
   public static final gmp ad = a("rendertype_breeze_wind", ffr.c);

   private static gmp a(String $$0, ffy $$1) {
      return a($$0, $$1, gmn.a);
   }

   private static gmp a(String $$0, ffy $$1, gmn $$2) {
      gmp $$3 = new gmp(akv.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmp> a() {
      return ae;
   }
}
