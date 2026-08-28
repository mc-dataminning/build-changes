import java.util.ArrayList;
import java.util.List;

public class gih {
   private static final List<gjp> ad = new ArrayList<>();
   public static final gjp a = a("blit_screen", fei.a);
   public static final gjp b = a("lightmap", fei.a);
   public static final gjp c = a("particle", fei.d);
   public static final gjp d = a("position", fei.e);
   public static final gjp e = a("position_color", fei.f);
   public static final gjp f = a("position_color_lightmap", fei.h);
   public static final gjp g = a("position_color_tex_lightmap", fei.k);
   public static final gjp h = a("position_tex", fei.i);
   public static final gjp i = a("position_tex_color", fei.j);
   public static final gjp j = a("rendertype_solid", fei.b);
   public static final gjp k = a("rendertype_cutout_mipped", fei.b);
   public static final gjp l = a("rendertype_cutout", fei.b);
   public static final gjp m = a("rendertype_translucent", fei.b);
   public static final gjp n = a("rendertype_translucent_moving_block", fei.b);
   public static final gjp o = a("rendertype_armor_cutout_no_cull", fei.c);
   public static final gjp p = a("rendertype_entity_solid", fei.c);
   public static final gjp q = a("rendertype_entity_cutout", fei.c);
   public static final gjp r = a("rendertype_entity_cutout_no_cull", fei.c);
   public static final gjp s = a("rendertype_entity_cutout_no_cull_z_offset", fei.c);
   public static final gjp t = a("rendertype_item_entity_translucent_cull", fei.c);
   public static final gjp u = a("rendertype_entity_translucent", fei.c);
   public static final gjp v = a("rendertype_entity_translucent_emissive", fei.c);
   public static final gjp w = a("rendertype_entity_smooth_cutout", fei.c);
   public static final gjp x = a("rendertype_beacon_beam", fei.b);
   public static final gjp y = a("rendertype_entity_decal", fei.c);
   public static final gjp z = a("rendertype_entity_no_outline", fei.c);
   public static final gjp A = a("rendertype_entity_shadow", fei.c);
   public static final gjp B = a("rendertype_entity_alpha", fei.c);
   public static final gjp C = a("rendertype_eyes", fei.c);
   public static final gjp D = a("rendertype_energy_swirl", fei.c);
   public static final gjp E = a("rendertype_leash", fei.h);
   public static final gjp F = a("rendertype_water_mask", fei.e);
   public static final gjp G = a("rendertype_outline", fei.j);
   public static final gjp H = a("rendertype_armor_entity_glint", fei.i);
   public static final gjp I = a("rendertype_glint_translucent", fei.i);
   public static final gjp J = a("rendertype_glint", fei.i);
   public static final gjp K = a("rendertype_entity_glint", fei.i);
   public static final gjp L = a("rendertype_text", fei.k);
   public static final gjp M = a("rendertype_text_background", fei.h);
   public static final gjp N = a("rendertype_text_intensity", fei.k);
   public static final gjp O = a("rendertype_text_see_through", fei.k);
   public static final gjp P = a("rendertype_text_background_see_through", fei.h);
   public static final gjp Q = a("rendertype_text_intensity_see_through", fei.k);
   public static final gjp R = a("rendertype_lightning", fei.f);
   public static final gjp S = a("rendertype_tripwire", fei.b);
   public static final gjp T = a("rendertype_end_portal", fei.e);
   public static final gjp U = a("rendertype_end_gateway", fei.e);
   public static final gjp V = a("rendertype_clouds", fei.f);
   public static final gjp W = a("rendertype_lines", fei.g);
   public static final gjp X = a("rendertype_crumbling", fei.b);
   public static final gjp Y = a("rendertype_gui", fei.f);
   public static final gjp Z = a("rendertype_gui_overlay", fei.f);
   public static final gjp aa = a("rendertype_gui_text_highlight", fei.f);
   public static final gjp ab = a("rendertype_gui_ghost_recipe_overlay", fei.f);
   public static final gjp ac = a("rendertype_breeze_wind", fei.c);

   private static gjp a(String $$0, fep $$1) {
      return a($$0, $$1, gjn.a);
   }

   private static gjp a(String $$0, fep $$1, gjn $$2) {
      gjp $$3 = new gjp(all.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<gjp> a() {
      return ad;
   }
}
