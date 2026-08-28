import java.util.ArrayList;
import java.util.List;

public class glg {
   private static final List<gmn> ae = new ArrayList<>();
   public static final gmn a = a("blit_screen", ffq.a);
   public static final gmn b = a("lightmap", ffq.a);
   public static final gmn c = a("particle", ffq.d);
   public static final gmn d = a("position", ffq.e);
   public static final gmn e = a("position_color", ffq.f);
   public static final gmn f = a("position_color_lightmap", ffq.h);
   public static final gmn g = a("position_color_tex_lightmap", ffq.k);
   public static final gmn h = a("position_tex", ffq.i);
   public static final gmn i = a("position_tex_color", ffq.j);
   public static final gmn j = a("rendertype_solid", ffq.b);
   public static final gmn k = a("rendertype_cutout_mipped", ffq.b);
   public static final gmn l = a("rendertype_cutout", ffq.b);
   public static final gmn m = a("rendertype_translucent", ffq.b);
   public static final gmn n = a("rendertype_translucent_moving_block", ffq.b);
   public static final gmn o = a("rendertype_armor_cutout_no_cull", ffq.c);
   public static final gmn p = a("rendertype_armor_translucent", ffq.c);
   public static final gmn q = a("rendertype_entity_solid", ffq.c);
   public static final gmn r = a("rendertype_entity_cutout", ffq.c);
   public static final gmn s = a("rendertype_entity_cutout_no_cull", ffq.c);
   public static final gmn t = a("rendertype_entity_cutout_no_cull_z_offset", ffq.c);
   public static final gmn u = a("rendertype_item_entity_translucent_cull", ffq.c);
   public static final gmn v = a("rendertype_entity_translucent", ffq.c);
   public static final gmn w = a("rendertype_entity_translucent_emissive", ffq.c);
   public static final gmn x = a("rendertype_entity_smooth_cutout", ffq.c);
   public static final gmn y = a("rendertype_beacon_beam", ffq.b);
   public static final gmn z = a("rendertype_entity_decal", ffq.c);
   public static final gmn A = a("rendertype_entity_no_outline", ffq.c);
   public static final gmn B = a("rendertype_entity_shadow", ffq.c);
   public static final gmn C = a("rendertype_entity_alpha", ffq.c);
   public static final gmn D = a("rendertype_eyes", ffq.c);
   public static final gmn E = a("rendertype_energy_swirl", ffq.c);
   public static final gmn F = a("rendertype_leash", ffq.h);
   public static final gmn G = a("rendertype_water_mask", ffq.e);
   public static final gmn H = a("rendertype_outline", ffq.j);
   public static final gmn I = a("rendertype_armor_entity_glint", ffq.i);
   public static final gmn J = a("rendertype_glint_translucent", ffq.i);
   public static final gmn K = a("rendertype_glint", ffq.i);
   public static final gmn L = a("rendertype_entity_glint", ffq.i);
   public static final gmn M = a("rendertype_text", ffq.k);
   public static final gmn N = a("rendertype_text_background", ffq.h);
   public static final gmn O = a("rendertype_text_intensity", ffq.k);
   public static final gmn P = a("rendertype_text_see_through", ffq.k);
   public static final gmn Q = a("rendertype_text_background_see_through", ffq.h);
   public static final gmn R = a("rendertype_text_intensity_see_through", ffq.k);
   public static final gmn S = a("rendertype_lightning", ffq.f);
   public static final gmn T = a("rendertype_tripwire", ffq.b);
   public static final gmn U = a("rendertype_end_portal", ffq.e);
   public static final gmn V = a("rendertype_end_gateway", ffq.e);
   public static final gmn W = a("rendertype_clouds", ffq.f);
   public static final gmn X = a("rendertype_lines", ffq.g);
   public static final gmn Y = a("rendertype_crumbling", ffq.b);
   public static final gmn Z = a("rendertype_gui", ffq.f);
   public static final gmn aa = a("rendertype_gui_overlay", ffq.f);
   public static final gmn ab = a("rendertype_gui_text_highlight", ffq.f);
   public static final gmn ac = a("rendertype_gui_ghost_recipe_overlay", ffq.f);
   public static final gmn ad = a("rendertype_breeze_wind", ffq.c);

   private static gmn a(String $$0, ffx $$1) {
      return a($$0, $$1, gml.a);
   }

   private static gmn a(String $$0, ffx $$1, gml $$2) {
      gmn $$3 = new gmn(aku.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gmn> a() {
      return ae;
   }
}
