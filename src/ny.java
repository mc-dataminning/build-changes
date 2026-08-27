import java.util.Optional;
import java.util.stream.IntStream;

public class ny {
   public static final nx a = a("cube", oa.c, oa.j, oa.k, oa.l, oa.m, oa.n, oa.o);
   public static final nx b = a("cube_directional", oa.c, oa.j, oa.k, oa.l, oa.m, oa.n, oa.o);
   public static final nx c = a("cube_all", oa.a);
   public static final nx d = a("cube_all_inner_faces", oa.a);
   public static final nx e = a("cube_mirrored_all", "_mirrored", oa.a);
   public static final nx f = a("cube_north_west_mirrored_all", "_north_west_mirrored", oa.a);
   public static final nx g = a("cube_column_uv_locked_x", "_x", oa.d, oa.i);
   public static final nx h = a("cube_column_uv_locked_y", "_y", oa.d, oa.i);
   public static final nx i = a("cube_column_uv_locked_z", "_z", oa.d, oa.i);
   public static final nx j = a("cube_column", oa.d, oa.i);
   public static final nx k = a("cube_column_horizontal", "_horizontal", oa.d, oa.i);
   public static final nx l = a("cube_column_mirrored", "_mirrored", oa.d, oa.i);
   public static final nx m = a("cube_top", oa.f, oa.i);
   public static final nx n = a("cube_bottom_top", oa.f, oa.e, oa.i);
   public static final nx o = a("cube_bottom_top_inner_faces", oa.f, oa.e, oa.i);
   public static final nx p = a("orientable", oa.f, oa.g, oa.i);
   public static final nx q = a("orientable_with_bottom", oa.f, oa.e, oa.i, oa.g);
   public static final nx r = a("orientable_vertical", "_vertical", oa.g, oa.i);
   public static final nx s = a("button", oa.b);
   public static final nx t = a("button_pressed", "_pressed", oa.b);
   public static final nx u = a("button_inventory", "_inventory", oa.b);
   public static final nx v = a("door_bottom_left", "_bottom_left", oa.f, oa.e);
   public static final nx w = a("door_bottom_left_open", "_bottom_left_open", oa.f, oa.e);
   public static final nx x = a("door_bottom_right", "_bottom_right", oa.f, oa.e);
   public static final nx y = a("door_bottom_right_open", "_bottom_right_open", oa.f, oa.e);
   public static final nx z = a("door_top_left", "_top_left", oa.f, oa.e);
   public static final nx A = a("door_top_left_open", "_top_left_open", oa.f, oa.e);
   public static final nx B = a("door_top_right", "_top_right", oa.f, oa.e);
   public static final nx C = a("door_top_right_open", "_top_right_open", oa.f, oa.e);
   public static final nx D = a("custom_fence_post", "_post", oa.b, oa.c);
   public static final nx E = a("custom_fence_side_north", "_side_north", oa.b);
   public static final nx F = a("custom_fence_side_east", "_side_east", oa.b);
   public static final nx G = a("custom_fence_side_south", "_side_south", oa.b);
   public static final nx H = a("custom_fence_side_west", "_side_west", oa.b);
   public static final nx I = a("custom_fence_inventory", "_inventory", oa.b);
   public static final nx J = a("fence_post", "_post", oa.b);
   public static final nx K = a("fence_side", "_side", oa.b);
   public static final nx L = a("fence_inventory", "_inventory", oa.b);
   public static final nx M = a("template_wall_post", "_post", oa.r);
   public static final nx N = a("template_wall_side", "_side", oa.r);
   public static final nx O = a("template_wall_side_tall", "_side_tall", oa.r);
   public static final nx P = a("wall_inventory", "_inventory", oa.r);
   public static final nx Q = a("template_custom_fence_gate", oa.b, oa.c);
   public static final nx R = a("template_custom_fence_gate_open", "_open", oa.b, oa.c);
   public static final nx S = a("template_custom_fence_gate_wall", "_wall", oa.b, oa.c);
   public static final nx T = a("template_custom_fence_gate_wall_open", "_wall_open", oa.b, oa.c);
   public static final nx U = a("template_fence_gate", oa.b);
   public static final nx V = a("template_fence_gate_open", "_open", oa.b);
   public static final nx W = a("template_fence_gate_wall", "_wall", oa.b);
   public static final nx X = a("template_fence_gate_wall_open", "_wall_open", oa.b);
   public static final nx Y = a("pressure_plate_up", oa.b);
   public static final nx Z = a("pressure_plate_down", "_down", oa.b);
   public static final nx aa = a(oa.c);
   public static final nx ab = a("slab", oa.e, oa.f, oa.i);
   public static final nx ac = a("slab_top", "_top", oa.e, oa.f, oa.i);
   public static final nx ad = a("leaves", oa.a);
   public static final nx ae = a("stairs", oa.e, oa.f, oa.i);
   public static final nx af = a("inner_stairs", "_inner", oa.e, oa.f, oa.i);
   public static final nx ag = a("outer_stairs", "_outer", oa.e, oa.f, oa.i);
   public static final nx ah = a("template_trapdoor_top", "_top", oa.b);
   public static final nx ai = a("template_trapdoor_bottom", "_bottom", oa.b);
   public static final nx aj = a("template_trapdoor_open", "_open", oa.b);
   public static final nx ak = a("template_orientable_trapdoor_top", "_top", oa.b);
   public static final nx al = a("template_orientable_trapdoor_bottom", "_bottom", oa.b);
   public static final nx am = a("template_orientable_trapdoor_open", "_open", oa.b);
   public static final nx an = a("pointed_dripstone", oa.p);
   public static final nx ao = a("cross", oa.p);
   public static final nx ap = a("tinted_cross", oa.p);
   public static final nx aq = a("flower_pot_cross", oa.q);
   public static final nx ar = a("tinted_flower_pot_cross", oa.q);
   public static final nx as = a("rail_flat", oa.s);
   public static final nx at = a("rail_curved", "_corner", oa.s);
   public static final nx au = a("template_rail_raised_ne", "_raised_ne", oa.s);
   public static final nx av = a("template_rail_raised_sw", "_raised_sw", oa.s);
   public static final nx aw = a("carpet", oa.t);
   public static final nx ax = a("flowerbed_1", "_1", oa.Q, oa.y);
   public static final nx ay = a("flowerbed_2", "_2", oa.Q, oa.y);
   public static final nx az = a("flowerbed_3", "_3", oa.Q, oa.y);
   public static final nx aA = a("flowerbed_4", "_4", oa.Q, oa.y);
   public static final nx aB = a("coral_fan", oa.x);
   public static final nx aC = a("coral_wall_fan", oa.x);
   public static final nx aD = a("template_glazed_terracotta", oa.u);
   public static final nx aE = a("template_chorus_flower", oa.b);
   public static final nx aF = a("template_daylight_detector", oa.f, oa.i);
   public static final nx aG = a("template_glass_pane_noside", "_noside", oa.v);
   public static final nx aH = a("template_glass_pane_noside_alt", "_noside_alt", oa.v);
   public static final nx aI = a("template_glass_pane_post", "_post", oa.v, oa.w);
   public static final nx aJ = a("template_glass_pane_side", "_side", oa.v, oa.w);
   public static final nx aK = a("template_glass_pane_side_alt", "_side_alt", oa.v, oa.w);
   public static final nx aL = a("template_command_block", oa.g, oa.h, oa.i);
   public static final nx aM = a("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", oa.b);
   public static final nx aN = a("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", oa.b);
   public static final nx aO = a("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", oa.b);
   public static final nx aP = a("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", oa.b);
   public static final nx aQ = a("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", oa.b);
   public static final nx aR = a("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", oa.b);
   public static final nx aS = a("template_anvil", oa.f);
   public static final nx[] aT = IntStream.range(0, 8).mapToObj($$0 -> a("stem_growth" + $$0, "_stage" + $$0, oa.y)).toArray(nx[]::new);
   public static final nx aU = a("stem_fruit", oa.y, oa.z);
   public static final nx aV = a("crop", oa.A);
   public static final nx aW = a("template_farmland", oa.B, oa.f);
   public static final nx aX = a("template_fire_floor", oa.C);
   public static final nx aY = a("template_fire_side", oa.C);
   public static final nx aZ = a("template_fire_side_alt", oa.C);
   public static final nx ba = a("template_fire_up", oa.C);
   public static final nx bb = a("template_fire_up_alt", oa.C);
   public static final nx bc = a("template_campfire", oa.C, oa.L);
   public static final nx bd = a("frying_table", oa.E);
   public static final nx be = a("template_roots", oa.b);
   public static final nx bf = a("template_roots_noside", "_noside", oa.b);
   public static final nx bg = a("template_roots_side", "_side", oa.b);
   public static final nx bh = a("template_lantern", oa.D);
   public static final nx bi = a("template_hanging_lantern", "_hanging", oa.D);
   public static final nx bj = a("template_torch", oa.H);
   public static final nx bk = a("template_torch_wall", oa.H);
   public static final nx bl = a("template_piston", oa.F, oa.e, oa.i);
   public static final nx bm = a("template_piston_head", oa.F, oa.i, oa.G);
   public static final nx bn = a("template_piston_head_short", oa.F, oa.i, oa.G);
   public static final nx bo = a("template_seagrass", oa.b);
   public static final nx bp = a("template_turtle_egg", oa.a);
   public static final nx bq = a("template_two_turtle_eggs", oa.a);
   public static final nx br = a("template_three_turtle_eggs", oa.a);
   public static final nx bs = a("template_four_turtle_eggs", oa.a);
   public static final nx bt = a("template_single_face", oa.b);
   public static final nx bu = a("template_cauldron_level1", oa.O, oa.N, oa.c, oa.f, oa.e, oa.i);
   public static final nx bv = a("template_cauldron_level2", oa.O, oa.N, oa.c, oa.f, oa.e, oa.i);
   public static final nx bw = a("template_cauldron_full", oa.O, oa.N, oa.c, oa.f, oa.e, oa.i);
   public static final nx bx = a("template_azalea", oa.f, oa.i);
   public static final nx by = a("template_potted_azalea_bush", oa.q, oa.f, oa.i);
   public static final nx bz = a("template_potted_azalea_bush", oa.q, oa.f, oa.i);
   public static final nx bA = a("sniffer_egg", oa.f, oa.e, oa.j, oa.k, oa.l, oa.m);
   public static final nx bB = b("generated", oa.I);
   public static final nx bC = b("template_music_disc", oa.I);
   public static final nx bD = b("handheld", oa.I);
   public static final nx bE = b("handheld_rod", oa.I);
   public static final nx bF = b("generated", oa.I, oa.J);
   public static final nx bG = b("generated", oa.I, oa.J, oa.K);
   public static final nx bH = b("template_shulker_box", oa.c);
   public static final nx bI = b("template_bed", oa.c);
   public static final nx bJ = b("template_banner");
   public static final nx bK = b("template_skull");
   public static final nx bL = a("template_candle", oa.a, oa.c);
   public static final nx bM = a("template_two_candles", oa.a, oa.c);
   public static final nx bN = a("template_three_candles", oa.a, oa.c);
   public static final nx bO = a("template_four_candles", oa.a, oa.c);
   public static final nx bP = a("template_cake_with_candle", oa.M, oa.e, oa.i, oa.f, oa.c);
   public static final nx bQ = a("template_sculk_shrieker", oa.e, oa.i, oa.f, oa.c, oa.P);
   public static final nx bR = a("template_vault", oa.f, oa.e, oa.i, oa.g);
   public static final nx[] bS = new nx[]{
      a("template_layered_height2", oa.b),
      a("template_layered_height4", oa.b),
      a("template_layered_height6", oa.b),
      a("template_layered_height8", oa.b),
      a("template_layered_height10", oa.b),
      a("template_layered_height12", oa.b),
      a("template_layered_height14", oa.b)
   };
   public static final nx bT = b("handheld_mace", oa.I);

   private static nx a(oa... $$0) {
      return new nx(Optional.empty(), Optional.empty(), $$0);
   }

   private static nx a(String $$0, oa... $$1) {
      return new nx(Optional.of(new akt("minecraft", "block/" + $$0)), Optional.empty(), $$1);
   }

   private static nx b(String $$0, oa... $$1) {
      return new nx(Optional.of(new akt("minecraft", "item/" + $$0)), Optional.empty(), $$1);
   }

   private static nx a(String $$0, String $$1, oa... $$2) {
      return new nx(Optional.of(new akt("minecraft", "block/" + $$0)), Optional.of($$1), $$2);
   }
}
