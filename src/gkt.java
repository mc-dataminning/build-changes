import java.util.ArrayList;
import java.util.List;

public class gkt {
   private static final List<gmb> ad = new ArrayList<>();
   public static final gmb a = a("blit_screen", fgo.a);
   public static final gmb b = a("lightmap", fgo.a);
   public static final gmb c = a("particle", fgo.d);
   public static final gmb d = a("position", fgo.e);
   public static final gmb e = a("position_color", fgo.f);
   public static final gmb f = a("position_color_lightmap", fgo.h);
   public static final gmb g = a("position_color_tex_lightmap", fgo.k);
   public static final gmb h = a("position_tex", fgo.i);
   public static final gmb i = a("position_tex_color", fgo.j);
   public static final gmb j = a("rendertype_solid", fgo.b);
   public static final gmb k = a("rendertype_cutout_mipped", fgo.b);
   public static final gmb l = a("rendertype_cutout", fgo.b);
   public static final gmb m = a("rendertype_translucent", fgo.b);
   public static final gmb n = a("rendertype_translucent_moving_block", fgo.b);
   public static final gmb o = a("rendertype_armor_cutout_no_cull", fgo.c);
   public static final gmb p = a("rendertype_entity_solid", fgo.c);
   public static final gmb q = a("rendertype_entity_cutout", fgo.c);
   public static final gmb r = a("rendertype_entity_cutout_no_cull", fgo.c);
   public static final gmb s = a("rendertype_entity_cutout_no_cull_z_offset", fgo.c);
   public static final gmb t = a("rendertype_item_entity_translucent_cull", fgo.c);
   public static final gmb u = a("rendertype_entity_translucent", fgo.c);
   public static final gmb v = a("rendertype_entity_translucent_emissive", fgo.c);
   public static final gmb w = a("rendertype_entity_smooth_cutout", fgo.c);
   public static final gmb x = a("rendertype_beacon_beam", fgo.b);
   public static final gmb y = a("rendertype_entity_decal", fgo.c);
   public static final gmb z = a("rendertype_entity_no_outline", fgo.c);
   public static final gmb A = a("rendertype_entity_shadow", fgo.c);
   public static final gmb B = a("rendertype_entity_alpha", fgo.c);
   public static final gmb C = a("rendertype_eyes", fgo.c);
   public static final gmb D = a("rendertype_energy_swirl", fgo.c);
   public static final gmb E = a("rendertype_leash", fgo.h);
   public static final gmb F = a("rendertype_water_mask", fgo.e);
   public static final gmb G = a("rendertype_outline", fgo.j);
   public static final gmb H = a("rendertype_armor_entity_glint", fgo.i);
   public static final gmb I = a("rendertype_glint_translucent", fgo.i);
   public static final gmb J = a("rendertype_glint", fgo.i);
   public static final gmb K = a("rendertype_entity_glint", fgo.i);
   public static final gmb L = a("rendertype_text", fgo.k);
   public static final gmb M = a("rendertype_text_background", fgo.h);
   public static final gmb N = a("rendertype_text_intensity", fgo.k);
   public static final gmb O = a("rendertype_text_see_through", fgo.k);
   public static final gmb P = a("rendertype_text_background_see_through", fgo.h);
   public static final gmb Q = a("rendertype_text_intensity_see_through", fgo.k);
   public static final gmb R = a("rendertype_lightning", fgo.f);
   public static final gmb S = a("rendertype_tripwire", fgo.b);
   public static final gmb T = a("rendertype_end_portal", fgo.e);
   public static final gmb U = a("rendertype_end_gateway", fgo.e);
   public static final gmb V = a("rendertype_clouds", fgo.f);
   public static final gmb W = a("rendertype_lines", fgo.g);
   public static final gmb X = a("rendertype_crumbling", fgo.b);
   public static final gmb Y = a("rendertype_gui", fgo.f);
   public static final gmb Z = a("rendertype_gui_overlay", fgo.f);
   public static final gmb aa = a("rendertype_gui_text_highlight", fgo.f);
   public static final gmb ab = a("rendertype_gui_ghost_recipe_overlay", fgo.f);
   public static final gmb ac = a("rendertype_breeze_wind", fgo.c);

   private static gmb a(String $$0, fgv $$1) {
      return a($$0, $$1, glz.a);
   }

   private static gmb a(String $$0, fgv $$1, glz $$2) {
      gmb $$3 = new gmb(alz.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<gmb> a() {
      return ad;
   }
}
