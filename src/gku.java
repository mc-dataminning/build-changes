import java.util.ArrayList;
import java.util.List;

public class gku {
   private static final List<gmc> ae = new ArrayList<>();
   public static final gmc a = a("blit_screen", fgp.a);
   public static final gmc b = a("lightmap", fgp.a);
   public static final gmc c = a("particle", fgp.d);
   public static final gmc d = a("position", fgp.e);
   public static final gmc e = a("position_color", fgp.f);
   public static final gmc f = a("position_color_lightmap", fgp.h);
   public static final gmc g = a("position_color_tex_lightmap", fgp.k);
   public static final gmc h = a("position_tex", fgp.i);
   public static final gmc i = a("position_tex_color", fgp.j);
   public static final gmc j = a("rendertype_solid", fgp.b);
   public static final gmc k = a("rendertype_cutout_mipped", fgp.b);
   public static final gmc l = a("rendertype_cutout", fgp.b);
   public static final gmc m = a("rendertype_translucent", fgp.b);
   public static final gmc n = a("rendertype_translucent_moving_block", fgp.b);
   public static final gmc o = a("rendertype_armor_cutout_no_cull", fgp.c);
   public static final gmc p = a("rendertype_armor_translucent", fgp.c);
   public static final gmc q = a("rendertype_entity_solid", fgp.c);
   public static final gmc r = a("rendertype_entity_cutout", fgp.c);
   public static final gmc s = a("rendertype_entity_cutout_no_cull", fgp.c);
   public static final gmc t = a("rendertype_entity_cutout_no_cull_z_offset", fgp.c);
   public static final gmc u = a("rendertype_item_entity_translucent_cull", fgp.c);
   public static final gmc v = a("rendertype_entity_translucent", fgp.c);
   public static final gmc w = a("rendertype_entity_translucent_emissive", fgp.c);
   public static final gmc x = a("rendertype_entity_smooth_cutout", fgp.c);
   public static final gmc y = a("rendertype_beacon_beam", fgp.b);
   public static final gmc z = a("rendertype_entity_decal", fgp.c);
   public static final gmc A = a("rendertype_entity_no_outline", fgp.c);
   public static final gmc B = a("rendertype_entity_shadow", fgp.c);
   public static final gmc C = a("rendertype_entity_alpha", fgp.c);
   public static final gmc D = a("rendertype_eyes", fgp.c);
   public static final gmc E = a("rendertype_energy_swirl", fgp.c);
   public static final gmc F = a("rendertype_leash", fgp.h);
   public static final gmc G = a("rendertype_water_mask", fgp.e);
   public static final gmc H = a("rendertype_outline", fgp.j);
   public static final gmc I = a("rendertype_armor_entity_glint", fgp.i);
   public static final gmc J = a("rendertype_glint_translucent", fgp.i);
   public static final gmc K = a("rendertype_glint", fgp.i);
   public static final gmc L = a("rendertype_entity_glint", fgp.i);
   public static final gmc M = a("rendertype_text", fgp.k);
   public static final gmc N = a("rendertype_text_background", fgp.h);
   public static final gmc O = a("rendertype_text_intensity", fgp.k);
   public static final gmc P = a("rendertype_text_see_through", fgp.k);
   public static final gmc Q = a("rendertype_text_background_see_through", fgp.h);
   public static final gmc R = a("rendertype_text_intensity_see_through", fgp.k);
   public static final gmc S = a("rendertype_lightning", fgp.f);
   public static final gmc T = a("rendertype_tripwire", fgp.b);
   public static final gmc U = a("rendertype_end_portal", fgp.e);
   public static final gmc V = a("rendertype_end_gateway", fgp.e);
   public static final gmc W = a("rendertype_clouds", fgp.f);
   public static final gmc X = a("rendertype_lines", fgp.g);
   public static final gmc Y = a("rendertype_crumbling", fgp.b);
   public static final gmc Z = a("rendertype_gui", fgp.f);
   public static final gmc aa = a("rendertype_gui_overlay", fgp.f);
   public static final gmc ab = a("rendertype_gui_text_highlight", fgp.f);
   public static final gmc ac = a("rendertype_gui_ghost_recipe_overlay", fgp.f);
   public static final gmc ad = a("rendertype_breeze_wind", fgp.c);

   private static gmc a(String $$0, fgw $$1) {
      return a($$0, $$1, gma.a);
   }

   private static gmc a(String $$0, fgw $$1, gma $$2) {
      gmc $$3 = new gmc(alz.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmc> a() {
      return ae;
   }
}
