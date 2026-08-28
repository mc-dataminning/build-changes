import java.util.ArrayList;
import java.util.List;

public class gon {
   private static final List<gpv> ae = new ArrayList<>();
   public static final gpv a = a("blit_screen", fio.a);
   public static final gpv b = a("lightmap", fio.a);
   public static final gpv c = a("particle", fio.d);
   public static final gpv d = a("position", fio.e);
   public static final gpv e = a("position_color", fio.f);
   public static final gpv f = a("position_color_lightmap", fio.h);
   public static final gpv g = a("position_color_tex_lightmap", fio.k);
   public static final gpv h = a("position_tex", fio.i);
   public static final gpv i = a("position_tex_color", fio.j);
   public static final gpv j = a("rendertype_solid", fio.b);
   public static final gpv k = a("rendertype_cutout_mipped", fio.b);
   public static final gpv l = a("rendertype_cutout", fio.b);
   public static final gpv m = a("rendertype_translucent", fio.b);
   public static final gpv n = a("rendertype_translucent_moving_block", fio.b);
   public static final gpv o = a("rendertype_armor_cutout_no_cull", fio.c);
   public static final gpv p = a("rendertype_armor_translucent", fio.c);
   public static final gpv q = a("rendertype_entity_solid", fio.c);
   public static final gpv r = a("rendertype_entity_cutout", fio.c);
   public static final gpv s = a("rendertype_entity_cutout_no_cull", fio.c);
   public static final gpv t = a("rendertype_entity_cutout_no_cull_z_offset", fio.c);
   public static final gpv u = a("rendertype_item_entity_translucent_cull", fio.c);
   public static final gpv v = a("rendertype_entity_translucent", fio.c);
   public static final gpv w = a("rendertype_entity_translucent_emissive", fio.c);
   public static final gpv x = a("rendertype_entity_smooth_cutout", fio.c);
   public static final gpv y = a("rendertype_beacon_beam", fio.b);
   public static final gpv z = a("rendertype_entity_decal", fio.c);
   public static final gpv A = a("rendertype_entity_no_outline", fio.c);
   public static final gpv B = a("rendertype_entity_shadow", fio.c);
   public static final gpv C = a("rendertype_entity_alpha", fio.c);
   public static final gpv D = a("rendertype_eyes", fio.c);
   public static final gpv E = a("rendertype_energy_swirl", fio.c);
   public static final gpv F = a("rendertype_leash", fio.h);
   public static final gpv G = a("rendertype_water_mask", fio.e);
   public static final gpv H = a("rendertype_outline", fio.j);
   public static final gpv I = a("rendertype_armor_entity_glint", fio.i);
   public static final gpv J = a("rendertype_glint_translucent", fio.i);
   public static final gpv K = a("rendertype_glint", fio.i);
   public static final gpv L = a("rendertype_entity_glint", fio.i);
   public static final gpv M = a("rendertype_text", fio.k);
   public static final gpv N = a("rendertype_text_background", fio.h);
   public static final gpv O = a("rendertype_text_intensity", fio.k);
   public static final gpv P = a("rendertype_text_see_through", fio.k);
   public static final gpv Q = a("rendertype_text_background_see_through", fio.h);
   public static final gpv R = a("rendertype_text_intensity_see_through", fio.k);
   public static final gpv S = a("rendertype_lightning", fio.f);
   public static final gpv T = a("rendertype_tripwire", fio.b);
   public static final gpv U = a("rendertype_end_portal", fio.e);
   public static final gpv V = a("rendertype_end_gateway", fio.e);
   public static final gpv W = a("rendertype_clouds", fio.f);
   public static final gpv X = a("rendertype_lines", fio.g);
   public static final gpv Y = a("rendertype_crumbling", fio.b);
   public static final gpv Z = a("rendertype_gui", fio.f);
   public static final gpv aa = a("rendertype_gui_overlay", fio.f);
   public static final gpv ab = a("rendertype_gui_text_highlight", fio.f);
   public static final gpv ac = a("rendertype_gui_ghost_recipe_overlay", fio.f);
   public static final gpv ad = a("rendertype_breeze_wind", fio.c);

   private static gpv a(String $$0, fiv $$1) {
      return a($$0, $$1, gpt.a);
   }

   private static gpv a(String $$0, fiv $$1, gpt $$2) {
      gpv $$3 = new gpv(ale.b("core/" + $$0), $$1, $$2);
      ae.add($$3);
      return $$3;
   }

   public static List<gpv> a() {
      return ae;
   }
}
