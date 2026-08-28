import java.util.ArrayList;
import java.util.List;

public class ghg {
   private static final List<gio> ad = new ArrayList<>();
   public static final gio a = a("blit_screen", fdr.a);
   public static final gio b = a("lightmap", fdr.a);
   public static final gio c = a("particle", fdr.d);
   public static final gio d = a("position", fdr.e);
   public static final gio e = a("position_color", fdr.f);
   public static final gio f = a("position_color_lightmap", fdr.h);
   public static final gio g = a("position_color_tex_lightmap", fdr.k);
   public static final gio h = a("position_tex", fdr.i);
   public static final gio i = a("position_tex_color", fdr.j);
   public static final gio j = a("rendertype_solid", fdr.b);
   public static final gio k = a("rendertype_cutout_mipped", fdr.b);
   public static final gio l = a("rendertype_cutout", fdr.b);
   public static final gio m = a("rendertype_translucent", fdr.b);
   public static final gio n = a("rendertype_translucent_moving_block", fdr.b);
   public static final gio o = a("rendertype_armor_cutout_no_cull", fdr.c);
   public static final gio p = a("rendertype_entity_solid", fdr.c);
   public static final gio q = a("rendertype_entity_cutout", fdr.c);
   public static final gio r = a("rendertype_entity_cutout_no_cull", fdr.c);
   public static final gio s = a("rendertype_entity_cutout_no_cull_z_offset", fdr.c);
   public static final gio t = a("rendertype_item_entity_translucent_cull", fdr.c);
   public static final gio u = a("rendertype_entity_translucent", fdr.c);
   public static final gio v = a("rendertype_entity_translucent_emissive", fdr.c);
   public static final gio w = a("rendertype_entity_smooth_cutout", fdr.c);
   public static final gio x = a("rendertype_beacon_beam", fdr.b);
   public static final gio y = a("rendertype_entity_decal", fdr.c);
   public static final gio z = a("rendertype_entity_no_outline", fdr.c);
   public static final gio A = a("rendertype_entity_shadow", fdr.c);
   public static final gio B = a("rendertype_entity_alpha", fdr.c);
   public static final gio C = a("rendertype_eyes", fdr.c);
   public static final gio D = a("rendertype_energy_swirl", fdr.c);
   public static final gio E = a("rendertype_leash", fdr.h);
   public static final gio F = a("rendertype_water_mask", fdr.e);
   public static final gio G = a("rendertype_outline", fdr.j);
   public static final gio H = a("rendertype_armor_entity_glint", fdr.i);
   public static final gio I = a("rendertype_glint_translucent", fdr.i);
   public static final gio J = a("rendertype_glint", fdr.i);
   public static final gio K = a("rendertype_entity_glint", fdr.i);
   public static final gio L = a("rendertype_text", fdr.k);
   public static final gio M = a("rendertype_text_background", fdr.h);
   public static final gio N = a("rendertype_text_intensity", fdr.k);
   public static final gio O = a("rendertype_text_see_through", fdr.k);
   public static final gio P = a("rendertype_text_background_see_through", fdr.h);
   public static final gio Q = a("rendertype_text_intensity_see_through", fdr.k);
   public static final gio R = a("rendertype_lightning", fdr.f);
   public static final gio S = a("rendertype_tripwire", fdr.b);
   public static final gio T = a("rendertype_end_portal", fdr.e);
   public static final gio U = a("rendertype_end_gateway", fdr.e);
   public static final gio V = a("rendertype_clouds", fdr.f);
   public static final gio W = a("rendertype_lines", fdr.g);
   public static final gio X = a("rendertype_crumbling", fdr.b);
   public static final gio Y = a("rendertype_gui", fdr.f);
   public static final gio Z = a("rendertype_gui_overlay", fdr.f);
   public static final gio aa = a("rendertype_gui_text_highlight", fdr.f);
   public static final gio ab = a("rendertype_gui_ghost_recipe_overlay", fdr.f);
   public static final gio ac = a("rendertype_breeze_wind", fdr.c);

   private static gio a(String $$0, fdy $$1) {
      return a($$0, $$1, gim.a);
   }

   private static gio a(String $$0, fdy $$1, gim $$2) {
      gio $$3 = new gio(alh.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<gio> a() {
      return ad;
   }
}
