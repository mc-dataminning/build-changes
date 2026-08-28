import java.util.ArrayList;
import java.util.List;

public class giq {
   private static final List<gjy> ad = new ArrayList<>();
   public static final gjy a = a("blit_screen", fep.a);
   public static final gjy b = a("lightmap", fep.a);
   public static final gjy c = a("particle", fep.d);
   public static final gjy d = a("position", fep.e);
   public static final gjy e = a("position_color", fep.f);
   public static final gjy f = a("position_color_lightmap", fep.h);
   public static final gjy g = a("position_color_tex_lightmap", fep.k);
   public static final gjy h = a("position_tex", fep.i);
   public static final gjy i = a("position_tex_color", fep.j);
   public static final gjy j = a("rendertype_solid", fep.b);
   public static final gjy k = a("rendertype_cutout_mipped", fep.b);
   public static final gjy l = a("rendertype_cutout", fep.b);
   public static final gjy m = a("rendertype_translucent", fep.b);
   public static final gjy n = a("rendertype_translucent_moving_block", fep.b);
   public static final gjy o = a("rendertype_armor_cutout_no_cull", fep.c);
   public static final gjy p = a("rendertype_entity_solid", fep.c);
   public static final gjy q = a("rendertype_entity_cutout", fep.c);
   public static final gjy r = a("rendertype_entity_cutout_no_cull", fep.c);
   public static final gjy s = a("rendertype_entity_cutout_no_cull_z_offset", fep.c);
   public static final gjy t = a("rendertype_item_entity_translucent_cull", fep.c);
   public static final gjy u = a("rendertype_entity_translucent", fep.c);
   public static final gjy v = a("rendertype_entity_translucent_emissive", fep.c);
   public static final gjy w = a("rendertype_entity_smooth_cutout", fep.c);
   public static final gjy x = a("rendertype_beacon_beam", fep.b);
   public static final gjy y = a("rendertype_entity_decal", fep.c);
   public static final gjy z = a("rendertype_entity_no_outline", fep.c);
   public static final gjy A = a("rendertype_entity_shadow", fep.c);
   public static final gjy B = a("rendertype_entity_alpha", fep.c);
   public static final gjy C = a("rendertype_eyes", fep.c);
   public static final gjy D = a("rendertype_energy_swirl", fep.c);
   public static final gjy E = a("rendertype_leash", fep.h);
   public static final gjy F = a("rendertype_water_mask", fep.e);
   public static final gjy G = a("rendertype_outline", fep.j);
   public static final gjy H = a("rendertype_armor_entity_glint", fep.i);
   public static final gjy I = a("rendertype_glint_translucent", fep.i);
   public static final gjy J = a("rendertype_glint", fep.i);
   public static final gjy K = a("rendertype_entity_glint", fep.i);
   public static final gjy L = a("rendertype_text", fep.k);
   public static final gjy M = a("rendertype_text_background", fep.h);
   public static final gjy N = a("rendertype_text_intensity", fep.k);
   public static final gjy O = a("rendertype_text_see_through", fep.k);
   public static final gjy P = a("rendertype_text_background_see_through", fep.h);
   public static final gjy Q = a("rendertype_text_intensity_see_through", fep.k);
   public static final gjy R = a("rendertype_lightning", fep.f);
   public static final gjy S = a("rendertype_tripwire", fep.b);
   public static final gjy T = a("rendertype_end_portal", fep.e);
   public static final gjy U = a("rendertype_end_gateway", fep.e);
   public static final gjy V = a("rendertype_clouds", fep.f);
   public static final gjy W = a("rendertype_lines", fep.g);
   public static final gjy X = a("rendertype_crumbling", fep.b);
   public static final gjy Y = a("rendertype_gui", fep.f);
   public static final gjy Z = a("rendertype_gui_overlay", fep.f);
   public static final gjy aa = a("rendertype_gui_text_highlight", fep.f);
   public static final gjy ab = a("rendertype_gui_ghost_recipe_overlay", fep.f);
   public static final gjy ac = a("rendertype_breeze_wind", fep.c);

   private static gjy a(String $$0, few $$1) {
      return a($$0, $$1, gjw.a);
   }

   private static gjy a(String $$0, few $$1, gjw $$2) {
      gjy $$3 = new gjy(alj.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<gjy> a() {
      return ad;
   }
}
