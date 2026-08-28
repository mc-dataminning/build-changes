import java.util.ArrayList;
import java.util.List;

public class ggq {
   private static final List<ghy> ad = new ArrayList<>();
   public static final ghy a = a("blit_screen", fdc.a);
   public static final ghy b = a("lightmap", fdc.a);
   public static final ghy c = a("particle", fdc.d);
   public static final ghy d = a("position", fdc.e);
   public static final ghy e = a("position_color", fdc.f);
   public static final ghy f = a("position_color_lightmap", fdc.h);
   public static final ghy g = a("position_color_tex_lightmap", fdc.k);
   public static final ghy h = a("position_tex", fdc.i);
   public static final ghy i = a("position_tex_color", fdc.j);
   public static final ghy j = a("rendertype_solid", fdc.b);
   public static final ghy k = a("rendertype_cutout_mipped", fdc.b);
   public static final ghy l = a("rendertype_cutout", fdc.b);
   public static final ghy m = a("rendertype_translucent", fdc.b);
   public static final ghy n = a("rendertype_translucent_moving_block", fdc.b);
   public static final ghy o = a("rendertype_armor_cutout_no_cull", fdc.c);
   public static final ghy p = a("rendertype_entity_solid", fdc.c);
   public static final ghy q = a("rendertype_entity_cutout", fdc.c);
   public static final ghy r = a("rendertype_entity_cutout_no_cull", fdc.c);
   public static final ghy s = a("rendertype_entity_cutout_no_cull_z_offset", fdc.c);
   public static final ghy t = a("rendertype_item_entity_translucent_cull", fdc.c);
   public static final ghy u = a("rendertype_entity_translucent", fdc.c);
   public static final ghy v = a("rendertype_entity_translucent_emissive", fdc.c);
   public static final ghy w = a("rendertype_entity_smooth_cutout", fdc.c);
   public static final ghy x = a("rendertype_beacon_beam", fdc.b);
   public static final ghy y = a("rendertype_entity_decal", fdc.c);
   public static final ghy z = a("rendertype_entity_no_outline", fdc.c);
   public static final ghy A = a("rendertype_entity_shadow", fdc.c);
   public static final ghy B = a("rendertype_entity_alpha", fdc.c);
   public static final ghy C = a("rendertype_eyes", fdc.c);
   public static final ghy D = a("rendertype_energy_swirl", fdc.c);
   public static final ghy E = a("rendertype_leash", fdc.h);
   public static final ghy F = a("rendertype_water_mask", fdc.e);
   public static final ghy G = a("rendertype_outline", fdc.j);
   public static final ghy H = a("rendertype_armor_entity_glint", fdc.i);
   public static final ghy I = a("rendertype_glint_translucent", fdc.i);
   public static final ghy J = a("rendertype_glint", fdc.i);
   public static final ghy K = a("rendertype_entity_glint", fdc.i);
   public static final ghy L = a("rendertype_text", fdc.k);
   public static final ghy M = a("rendertype_text_background", fdc.h);
   public static final ghy N = a("rendertype_text_intensity", fdc.k);
   public static final ghy O = a("rendertype_text_see_through", fdc.k);
   public static final ghy P = a("rendertype_text_background_see_through", fdc.h);
   public static final ghy Q = a("rendertype_text_intensity_see_through", fdc.k);
   public static final ghy R = a("rendertype_lightning", fdc.f);
   public static final ghy S = a("rendertype_tripwire", fdc.b);
   public static final ghy T = a("rendertype_end_portal", fdc.e);
   public static final ghy U = a("rendertype_end_gateway", fdc.e);
   public static final ghy V = a("rendertype_clouds", fdc.f);
   public static final ghy W = a("rendertype_lines", fdc.g);
   public static final ghy X = a("rendertype_crumbling", fdc.b);
   public static final ghy Y = a("rendertype_gui", fdc.f);
   public static final ghy Z = a("rendertype_gui_overlay", fdc.f);
   public static final ghy aa = a("rendertype_gui_text_highlight", fdc.f);
   public static final ghy ab = a("rendertype_gui_ghost_recipe_overlay", fdc.f);
   public static final ghy ac = a("rendertype_breeze_wind", fdc.c);

   private static ghy a(String $$0, fdj $$1) {
      return a($$0, $$1, ghw.a);
   }

   private static ghy a(String $$0, fdj $$1, ghw $$2) {
      ghy $$3 = new ghy(alc.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<ghy> a() {
      return ad;
   }
}
