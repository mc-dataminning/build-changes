import java.util.ArrayList;
import java.util.List;

public class gpc {
   private static final List<gqk> ae = new ArrayList<>();
   public static final gqk a = a("blit_screen", fja.a);
   public static final gqk b = a("lightmap", fja.a);
   public static final gqk c = a("particle", fja.d);
   public static final gqk d = a("position", fja.e);
   public static final gqk e = a("position_color", fja.f);
   public static final gqk f = a("position_color_lightmap", fja.h);
   public static final gqk g = a("position_color_tex_lightmap", fja.k);
   public static final gqk h = a("position_tex", fja.i);
   public static final gqk i = a("position_tex_color", fja.j);
   public static final gqk j = a("rendertype_solid", fja.b);
   public static final gqk k = a("rendertype_cutout_mipped", fja.b);
   public static final gqk l = a("rendertype_cutout", fja.b);
   public static final gqk m = a("rendertype_translucent", fja.b);
   public static final gqk n = a("rendertype_translucent_moving_block", fja.b);
   public static final gqk o = a("rendertype_armor_cutout_no_cull", fja.c);
   public static final gqk p = a("rendertype_armor_translucent", fja.c);
   public static final gqk q = a("rendertype_entity_solid", fja.c);
   public static final gqk r = a("rendertype_entity_cutout", fja.c);
   public static final gqk s = a("rendertype_entity_cutout_no_cull", fja.c);
   public static final gqk t = a("rendertype_entity_cutout_no_cull_z_offset", fja.c);
   public static final gqk u = a("rendertype_item_entity_translucent_cull", fja.c);
   public static final gqk v = a("rendertype_entity_translucent", fja.c);
   public static final gqk w = a("rendertype_entity_translucent_emissive", fja.c);
   public static final gqk x = a("rendertype_entity_smooth_cutout", fja.c);
   public static final gqk y = a("rendertype_beacon_beam", fja.b);
   public static final gqk z = a("rendertype_entity_decal", fja.c);
   public static final gqk A = a("rendertype_entity_no_outline", fja.c);
   public static final gqk B = a("rendertype_entity_shadow", fja.c);
   public static final gqk C = a("rendertype_entity_alpha", fja.c);
   public static final gqk D = a("rendertype_eyes", fja.c);
   public static final gqk E = a("rendertype_energy_swirl", fja.c);
   public static final gqk F = a("rendertype_leash", fja.h);
   public static final gqk G = a("rendertype_water_mask", fja.e);
   public static final gqk H = a("rendertype_outline", fja.j);
   public static final gqk I = a("rendertype_armor_entity_glint", fja.i);
   public static final gqk J = a("rendertype_glint_translucent", fja.i);
   public static final gqk K = a("rendertype_glint", fja.i);
   public static final gqk L = a("rendertype_entity_glint", fja.i);
   public static final gqk M = a("rendertype_text", fja.k);
   public static final gqk N = a("rendertype_text_background", fja.h);
   public static final gqk O = a("rendertype_text_intensity", fja.k);
   public static final gqk P = a("rendertype_text_see_through", fja.k);
   public static final gqk Q = a("rendertype_text_background_see_through", fja.h);
   public static final gqk R = a("rendertype_text_intensity_see_through", fja.k);
   public static final gqk S = a("rendertype_lightning", fja.f);
   public static final gqk T = a("rendertype_tripwire", fja.b);
   public static final gqk U = a("rendertype_end_portal", fja.e);
   public static final gqk V = a("rendertype_end_gateway", fja.e);
   public static final gqk W = a("rendertype_clouds", fja.f);
   public static final gqk X = a("rendertype_lines", fja.g);
   public static final gqk Y = a("rendertype_crumbling", fja.b);
   public static final gqk Z = a("rendertype_gui", fja.f);
   public static final gqk aa = a("rendertype_gui_overlay", fja.f);
   public static final gqk ab = a("rendertype_gui_text_highlight", fja.f);
   public static final gqk ac = a("rendertype_gui_ghost_recipe_overlay", fja.f);
   public static final gqk ad = a("rendertype_breeze_wind", fja.c);

   private static gqk a(String $$0, fjh $$1) {
      return a($$0, $$1, gqi.a);
   }

   private static gqk a(String $$0, fjh $$1, gqi $$2) {
      gqk $$3 = new gqk(alg.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gqk> a() {
      return ae;
   }
}
