import java.util.ArrayList;
import java.util.List;

public class gmi {
   private static final List<gnp> ae = new ArrayList<>();
   public static final gnp a = a("blit_screen", fgp.a);
   public static final gnp b = a("lightmap", fgp.a);
   public static final gnp c = a("particle", fgp.d);
   public static final gnp d = a("position", fgp.e);
   public static final gnp e = a("position_color", fgp.f);
   public static final gnp f = a("position_color_lightmap", fgp.h);
   public static final gnp g = a("position_color_tex_lightmap", fgp.k);
   public static final gnp h = a("position_tex", fgp.i);
   public static final gnp i = a("position_tex_color", fgp.j);
   public static final gnp j = a("rendertype_solid", fgp.b);
   public static final gnp k = a("rendertype_cutout_mipped", fgp.b);
   public static final gnp l = a("rendertype_cutout", fgp.b);
   public static final gnp m = a("rendertype_translucent", fgp.b);
   public static final gnp n = a("rendertype_translucent_moving_block", fgp.b);
   public static final gnp o = a("rendertype_armor_cutout_no_cull", fgp.c);
   public static final gnp p = a("rendertype_armor_translucent", fgp.c);
   public static final gnp q = a("rendertype_entity_solid", fgp.c);
   public static final gnp r = a("rendertype_entity_cutout", fgp.c);
   public static final gnp s = a("rendertype_entity_cutout_no_cull", fgp.c);
   public static final gnp t = a("rendertype_entity_cutout_no_cull_z_offset", fgp.c);
   public static final gnp u = a("rendertype_item_entity_translucent_cull", fgp.c);
   public static final gnp v = a("rendertype_entity_translucent", fgp.c);
   public static final gnp w = a("rendertype_entity_translucent_emissive", fgp.c);
   public static final gnp x = a("rendertype_entity_smooth_cutout", fgp.c);
   public static final gnp y = a("rendertype_beacon_beam", fgp.b);
   public static final gnp z = a("rendertype_entity_decal", fgp.c);
   public static final gnp A = a("rendertype_entity_no_outline", fgp.c);
   public static final gnp B = a("rendertype_entity_shadow", fgp.c);
   public static final gnp C = a("rendertype_entity_alpha", fgp.c);
   public static final gnp D = a("rendertype_eyes", fgp.c);
   public static final gnp E = a("rendertype_energy_swirl", fgp.c);
   public static final gnp F = a("rendertype_leash", fgp.h);
   public static final gnp G = a("rendertype_water_mask", fgp.e);
   public static final gnp H = a("rendertype_outline", fgp.j);
   public static final gnp I = a("rendertype_armor_entity_glint", fgp.i);
   public static final gnp J = a("rendertype_glint_translucent", fgp.i);
   public static final gnp K = a("rendertype_glint", fgp.i);
   public static final gnp L = a("rendertype_entity_glint", fgp.i);
   public static final gnp M = a("rendertype_text", fgp.k);
   public static final gnp N = a("rendertype_text_background", fgp.h);
   public static final gnp O = a("rendertype_text_intensity", fgp.k);
   public static final gnp P = a("rendertype_text_see_through", fgp.k);
   public static final gnp Q = a("rendertype_text_background_see_through", fgp.h);
   public static final gnp R = a("rendertype_text_intensity_see_through", fgp.k);
   public static final gnp S = a("rendertype_lightning", fgp.f);
   public static final gnp T = a("rendertype_tripwire", fgp.b);
   public static final gnp U = a("rendertype_end_portal", fgp.e);
   public static final gnp V = a("rendertype_end_gateway", fgp.e);
   public static final gnp W = a("rendertype_clouds", fgp.f);
   public static final gnp X = a("rendertype_lines", fgp.g);
   public static final gnp Y = a("rendertype_crumbling", fgp.b);
   public static final gnp Z = a("rendertype_gui", fgp.f);
   public static final gnp aa = a("rendertype_gui_overlay", fgp.f);
   public static final gnp ab = a("rendertype_gui_text_highlight", fgp.f);
   public static final gnp ac = a("rendertype_gui_ghost_recipe_overlay", fgp.f);
   public static final gnp ad = a("rendertype_breeze_wind", fgp.c);

   private static gnp a(String $$0, fgw $$1) {
      return a($$0, $$1, gnn.a);
   }

   private static gnp a(String $$0, fgw $$1, gnn $$2) {
      gnp $$3 = new gnp(aku.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gnp> a() {
      return ae;
   }
}
