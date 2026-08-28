import java.util.ArrayList;
import java.util.List;

public class gkv {
   private static final List<gmd> ae = new ArrayList<>();
   public static final gmd a = a("blit_screen", fgq.a);
   public static final gmd b = a("lightmap", fgq.a);
   public static final gmd c = a("particle", fgq.d);
   public static final gmd d = a("position", fgq.e);
   public static final gmd e = a("position_color", fgq.f);
   public static final gmd f = a("position_color_lightmap", fgq.h);
   public static final gmd g = a("position_color_tex_lightmap", fgq.k);
   public static final gmd h = a("position_tex", fgq.i);
   public static final gmd i = a("position_tex_color", fgq.j);
   public static final gmd j = a("rendertype_solid", fgq.b);
   public static final gmd k = a("rendertype_cutout_mipped", fgq.b);
   public static final gmd l = a("rendertype_cutout", fgq.b);
   public static final gmd m = a("rendertype_translucent", fgq.b);
   public static final gmd n = a("rendertype_translucent_moving_block", fgq.b);
   public static final gmd o = a("rendertype_armor_cutout_no_cull", fgq.c);
   public static final gmd p = a("rendertype_armor_translucent", fgq.c);
   public static final gmd q = a("rendertype_entity_solid", fgq.c);
   public static final gmd r = a("rendertype_entity_cutout", fgq.c);
   public static final gmd s = a("rendertype_entity_cutout_no_cull", fgq.c);
   public static final gmd t = a("rendertype_entity_cutout_no_cull_z_offset", fgq.c);
   public static final gmd u = a("rendertype_item_entity_translucent_cull", fgq.c);
   public static final gmd v = a("rendertype_entity_translucent", fgq.c);
   public static final gmd w = a("rendertype_entity_translucent_emissive", fgq.c);
   public static final gmd x = a("rendertype_entity_smooth_cutout", fgq.c);
   public static final gmd y = a("rendertype_beacon_beam", fgq.b);
   public static final gmd z = a("rendertype_entity_decal", fgq.c);
   public static final gmd A = a("rendertype_entity_no_outline", fgq.c);
   public static final gmd B = a("rendertype_entity_shadow", fgq.c);
   public static final gmd C = a("rendertype_entity_alpha", fgq.c);
   public static final gmd D = a("rendertype_eyes", fgq.c);
   public static final gmd E = a("rendertype_energy_swirl", fgq.c);
   public static final gmd F = a("rendertype_leash", fgq.h);
   public static final gmd G = a("rendertype_water_mask", fgq.e);
   public static final gmd H = a("rendertype_outline", fgq.j);
   public static final gmd I = a("rendertype_armor_entity_glint", fgq.i);
   public static final gmd J = a("rendertype_glint_translucent", fgq.i);
   public static final gmd K = a("rendertype_glint", fgq.i);
   public static final gmd L = a("rendertype_entity_glint", fgq.i);
   public static final gmd M = a("rendertype_text", fgq.k);
   public static final gmd N = a("rendertype_text_background", fgq.h);
   public static final gmd O = a("rendertype_text_intensity", fgq.k);
   public static final gmd P = a("rendertype_text_see_through", fgq.k);
   public static final gmd Q = a("rendertype_text_background_see_through", fgq.h);
   public static final gmd R = a("rendertype_text_intensity_see_through", fgq.k);
   public static final gmd S = a("rendertype_lightning", fgq.f);
   public static final gmd T = a("rendertype_tripwire", fgq.b);
   public static final gmd U = a("rendertype_end_portal", fgq.e);
   public static final gmd V = a("rendertype_end_gateway", fgq.e);
   public static final gmd W = a("rendertype_clouds", fgq.f);
   public static final gmd X = a("rendertype_lines", fgq.g);
   public static final gmd Y = a("rendertype_crumbling", fgq.b);
   public static final gmd Z = a("rendertype_gui", fgq.f);
   public static final gmd aa = a("rendertype_gui_overlay", fgq.f);
   public static final gmd ab = a("rendertype_gui_text_highlight", fgq.f);
   public static final gmd ac = a("rendertype_gui_ghost_recipe_overlay", fgq.f);
   public static final gmd ad = a("rendertype_breeze_wind", fgq.c);

   private static gmd a(String $$0, fgx $$1) {
      return a($$0, $$1, gmb.a);
   }

   private static gmd a(String $$0, fgx $$1, gmb $$2) {
      gmd $$3 = new gmd(alz.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmd> a() {
      return ae;
   }
}
