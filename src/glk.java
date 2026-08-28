import java.util.ArrayList;
import java.util.List;

public class glk {
   private static final List<gmr> ae = new ArrayList<>();
   public static final gmr a = a("blit_screen", fft.a);
   public static final gmr b = a("lightmap", fft.a);
   public static final gmr c = a("particle", fft.d);
   public static final gmr d = a("position", fft.e);
   public static final gmr e = a("position_color", fft.f);
   public static final gmr f = a("position_color_lightmap", fft.h);
   public static final gmr g = a("position_color_tex_lightmap", fft.k);
   public static final gmr h = a("position_tex", fft.i);
   public static final gmr i = a("position_tex_color", fft.j);
   public static final gmr j = a("rendertype_solid", fft.b);
   public static final gmr k = a("rendertype_cutout_mipped", fft.b);
   public static final gmr l = a("rendertype_cutout", fft.b);
   public static final gmr m = a("rendertype_translucent", fft.b);
   public static final gmr n = a("rendertype_translucent_moving_block", fft.b);
   public static final gmr o = a("rendertype_armor_cutout_no_cull", fft.c);
   public static final gmr p = a("rendertype_armor_translucent", fft.c);
   public static final gmr q = a("rendertype_entity_solid", fft.c);
   public static final gmr r = a("rendertype_entity_cutout", fft.c);
   public static final gmr s = a("rendertype_entity_cutout_no_cull", fft.c);
   public static final gmr t = a("rendertype_entity_cutout_no_cull_z_offset", fft.c);
   public static final gmr u = a("rendertype_item_entity_translucent_cull", fft.c);
   public static final gmr v = a("rendertype_entity_translucent", fft.c);
   public static final gmr w = a("rendertype_entity_translucent_emissive", fft.c);
   public static final gmr x = a("rendertype_entity_smooth_cutout", fft.c);
   public static final gmr y = a("rendertype_beacon_beam", fft.b);
   public static final gmr z = a("rendertype_entity_decal", fft.c);
   public static final gmr A = a("rendertype_entity_no_outline", fft.c);
   public static final gmr B = a("rendertype_entity_shadow", fft.c);
   public static final gmr C = a("rendertype_entity_alpha", fft.c);
   public static final gmr D = a("rendertype_eyes", fft.c);
   public static final gmr E = a("rendertype_energy_swirl", fft.c);
   public static final gmr F = a("rendertype_leash", fft.h);
   public static final gmr G = a("rendertype_water_mask", fft.e);
   public static final gmr H = a("rendertype_outline", fft.j);
   public static final gmr I = a("rendertype_armor_entity_glint", fft.i);
   public static final gmr J = a("rendertype_glint_translucent", fft.i);
   public static final gmr K = a("rendertype_glint", fft.i);
   public static final gmr L = a("rendertype_entity_glint", fft.i);
   public static final gmr M = a("rendertype_text", fft.k);
   public static final gmr N = a("rendertype_text_background", fft.h);
   public static final gmr O = a("rendertype_text_intensity", fft.k);
   public static final gmr P = a("rendertype_text_see_through", fft.k);
   public static final gmr Q = a("rendertype_text_background_see_through", fft.h);
   public static final gmr R = a("rendertype_text_intensity_see_through", fft.k);
   public static final gmr S = a("rendertype_lightning", fft.f);
   public static final gmr T = a("rendertype_tripwire", fft.b);
   public static final gmr U = a("rendertype_end_portal", fft.e);
   public static final gmr V = a("rendertype_end_gateway", fft.e);
   public static final gmr W = a("rendertype_clouds", fft.f);
   public static final gmr X = a("rendertype_lines", fft.g);
   public static final gmr Y = a("rendertype_crumbling", fft.b);
   public static final gmr Z = a("rendertype_gui", fft.f);
   public static final gmr aa = a("rendertype_gui_overlay", fft.f);
   public static final gmr ab = a("rendertype_gui_text_highlight", fft.f);
   public static final gmr ac = a("rendertype_gui_ghost_recipe_overlay", fft.f);
   public static final gmr ad = a("rendertype_breeze_wind", fft.c);

   private static gmr a(String $$0, fga $$1) {
      return a($$0, $$1, gmp.a);
   }

   private static gmr a(String $$0, fga $$1, gmp $$2) {
      gmr $$3 = new gmr(akv.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmr> a() {
      return ae;
   }
}
