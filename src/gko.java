import java.util.ArrayList;
import java.util.List;

public class gko {
   private static final List<glw> ad = new ArrayList<>();
   public static final glw a = a("blit_screen", fgj.a);
   public static final glw b = a("lightmap", fgj.a);
   public static final glw c = a("particle", fgj.d);
   public static final glw d = a("position", fgj.e);
   public static final glw e = a("position_color", fgj.f);
   public static final glw f = a("position_color_lightmap", fgj.h);
   public static final glw g = a("position_color_tex_lightmap", fgj.k);
   public static final glw h = a("position_tex", fgj.i);
   public static final glw i = a("position_tex_color", fgj.j);
   public static final glw j = a("rendertype_solid", fgj.b);
   public static final glw k = a("rendertype_cutout_mipped", fgj.b);
   public static final glw l = a("rendertype_cutout", fgj.b);
   public static final glw m = a("rendertype_translucent", fgj.b);
   public static final glw n = a("rendertype_translucent_moving_block", fgj.b);
   public static final glw o = a("rendertype_armor_cutout_no_cull", fgj.c);
   public static final glw p = a("rendertype_entity_solid", fgj.c);
   public static final glw q = a("rendertype_entity_cutout", fgj.c);
   public static final glw r = a("rendertype_entity_cutout_no_cull", fgj.c);
   public static final glw s = a("rendertype_entity_cutout_no_cull_z_offset", fgj.c);
   public static final glw t = a("rendertype_item_entity_translucent_cull", fgj.c);
   public static final glw u = a("rendertype_entity_translucent", fgj.c);
   public static final glw v = a("rendertype_entity_translucent_emissive", fgj.c);
   public static final glw w = a("rendertype_entity_smooth_cutout", fgj.c);
   public static final glw x = a("rendertype_beacon_beam", fgj.b);
   public static final glw y = a("rendertype_entity_decal", fgj.c);
   public static final glw z = a("rendertype_entity_no_outline", fgj.c);
   public static final glw A = a("rendertype_entity_shadow", fgj.c);
   public static final glw B = a("rendertype_entity_alpha", fgj.c);
   public static final glw C = a("rendertype_eyes", fgj.c);
   public static final glw D = a("rendertype_energy_swirl", fgj.c);
   public static final glw E = a("rendertype_leash", fgj.h);
   public static final glw F = a("rendertype_water_mask", fgj.e);
   public static final glw G = a("rendertype_outline", fgj.j);
   public static final glw H = a("rendertype_armor_entity_glint", fgj.i);
   public static final glw I = a("rendertype_glint_translucent", fgj.i);
   public static final glw J = a("rendertype_glint", fgj.i);
   public static final glw K = a("rendertype_entity_glint", fgj.i);
   public static final glw L = a("rendertype_text", fgj.k);
   public static final glw M = a("rendertype_text_background", fgj.h);
   public static final glw N = a("rendertype_text_intensity", fgj.k);
   public static final glw O = a("rendertype_text_see_through", fgj.k);
   public static final glw P = a("rendertype_text_background_see_through", fgj.h);
   public static final glw Q = a("rendertype_text_intensity_see_through", fgj.k);
   public static final glw R = a("rendertype_lightning", fgj.f);
   public static final glw S = a("rendertype_tripwire", fgj.b);
   public static final glw T = a("rendertype_end_portal", fgj.e);
   public static final glw U = a("rendertype_end_gateway", fgj.e);
   public static final glw V = a("rendertype_clouds", fgj.f);
   public static final glw W = a("rendertype_lines", fgj.g);
   public static final glw X = a("rendertype_crumbling", fgj.b);
   public static final glw Y = a("rendertype_gui", fgj.f);
   public static final glw Z = a("rendertype_gui_overlay", fgj.f);
   public static final glw aa = a("rendertype_gui_text_highlight", fgj.f);
   public static final glw ab = a("rendertype_gui_ghost_recipe_overlay", fgj.f);
   public static final glw ac = a("rendertype_breeze_wind", fgj.c);

   private static glw a(String $$0, fgq $$1) {
      return a($$0, $$1, glu.a);
   }

   private static glw a(String $$0, fgq $$1, glu $$2) {
      glw $$3 = new glw(alz.b("core/" + $$0), $$1, $$2);
      ad.add($$3);
      return $$3;
   }

   public static List<glw> a() {
      return ad;
   }
}
