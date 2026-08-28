import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lx {
   public static final mb a = a("angry_villager", false);
   public static final lw<lp> b = a("block", false, lp::a, lp::b);
   public static final lw<lp> c = a("block_marker", true, lp::a, lp::b);
   public static final mb d = a("bubble", false);
   public static final mb e = a("cloud", false);
   public static final mb f = a("crit", false);
   public static final mb g = a("damage_indicator", true);
   public static final mb h = a("dragon_breath", false);
   public static final mb i = a("dripping_lava", false);
   public static final mb j = a("falling_lava", false);
   public static final mb k = a("landing_lava", false);
   public static final mb l = a("dripping_water", false);
   public static final mb m = a("falling_water", false);
   public static final lw<ls> n = a("dust", false, $$0 -> ls.c, $$0 -> ls.d);
   public static final lw<lr> o = a("dust_color_transition", false, $$0 -> lr.c, $$0 -> lr.d);
   public static final mb p = a("effect", false);
   public static final mb q = a("elder_guardian", true);
   public static final mb r = a("enchanted_hit", false);
   public static final mb s = a("enchant", false);
   public static final mb t = a("end_rod", false);
   public static final lw<lq> u = a("entity_effect", false, lq::a, lq::b);
   public static final mb v = a("explosion_emitter", true);
   public static final mb w = a("explosion", true);
   public static final mb x = a("gust", true);
   public static final mb y = a("small_gust", false);
   public static final mb z = a("gust_emitter_large", true);
   public static final mb A = a("gust_emitter_small", true);
   public static final mb B = a("sonic_boom", true);
   public static final lw<lp> C = a("falling_dust", false, lp::a, lp::b);
   public static final mb D = a("firework", false);
   public static final mb E = a("fishing", false);
   public static final mb F = a("flame", false);
   public static final mb G = a("infested", false);
   public static final mb H = a("cherry_leaves", false);
   public static final mb I = a("pale_oak_leaves", false);
   public static final lw<lq> J = a("tinted_leaves", false, lq::a, lq::b);
   public static final mb K = a("sculk_soul", false);
   public static final lw<lz> L = a("sculk_charge", true, $$0 -> lz.a, $$0 -> lz.b);
   public static final mb M = a("sculk_charge_pop", true);
   public static final mb N = a("soul_fire_flame", false);
   public static final mb O = a("soul", false);
   public static final mb P = a("flash", false);
   public static final mb Q = a("happy_villager", false);
   public static final mb R = a("composter", false);
   public static final mb S = a("heart", false);
   public static final mb T = a("instant_effect", false);
   public static final lw<lt> U = a("item", false, lt::a, lt::b);
   public static final lw<md> V = a("vibration", true, $$0 -> md.a, $$0 -> md.b);
   public static final lw<mc> W = a("trail", false, $$0 -> mc.a, $$0 -> mc.b);
   public static final mb X = a("item_slime", false);
   public static final mb Y = a("item_cobweb", false);
   public static final mb Z = a("item_snowball", false);
   public static final mb aa = a("large_smoke", false);
   public static final mb ab = a("lava", false);
   public static final mb ac = a("mycelium", false);
   public static final mb ad = a("note", false);
   public static final mb ae = a("poof", true);
   public static final mb af = a("portal", false);
   public static final mb ag = a("rain", false);
   public static final mb ah = a("smoke", false);
   public static final mb ai = a("white_smoke", false);
   public static final mb aj = a("sneeze", false);
   public static final mb ak = a("spit", true);
   public static final mb al = a("squid_ink", true);
   public static final mb am = a("sweep_attack", true);
   public static final mb an = a("totem_of_undying", false);
   public static final mb ao = a("underwater", false);
   public static final mb ap = a("splash", false);
   public static final mb aq = a("witch", false);
   public static final mb ar = a("bubble_pop", false);
   public static final mb as = a("current_down", false);
   public static final mb at = a("bubble_column_up", false);
   public static final mb au = a("nautilus", false);
   public static final mb av = a("dolphin", false);
   public static final mb aw = a("campfire_cosy_smoke", true);
   public static final mb ax = a("campfire_signal_smoke", true);
   public static final mb ay = a("dripping_honey", false);
   public static final mb az = a("falling_honey", false);
   public static final mb aA = a("landing_honey", false);
   public static final mb aB = a("falling_nectar", false);
   public static final mb aC = a("falling_spore_blossom", false);
   public static final mb aD = a("ash", false);
   public static final mb aE = a("crimson_spore", false);
   public static final mb aF = a("warped_spore", false);
   public static final mb aG = a("spore_blossom_air", false);
   public static final mb aH = a("dripping_obsidian_tear", false);
   public static final mb aI = a("falling_obsidian_tear", false);
   public static final mb aJ = a("landing_obsidian_tear", false);
   public static final mb aK = a("reverse_portal", false);
   public static final mb aL = a("white_ash", false);
   public static final mb aM = a("small_flame", false);
   public static final mb aN = a("snowflake", false);
   public static final mb aO = a("dripping_dripstone_lava", false);
   public static final mb aP = a("falling_dripstone_lava", false);
   public static final mb aQ = a("dripping_dripstone_water", false);
   public static final mb aR = a("falling_dripstone_water", false);
   public static final mb aS = a("glow_squid_ink", true);
   public static final mb aT = a("glow", true);
   public static final mb aU = a("wax_on", true);
   public static final mb aV = a("wax_off", true);
   public static final mb aW = a("electric_spark", true);
   public static final mb aX = a("scrape", true);
   public static final lw<ma> aY = a("shriek", false, $$0 -> ma.a, $$0 -> ma.b);
   public static final mb aZ = a("egg_crack", false);
   public static final mb ba = a("dust_plume", false);
   public static final mb bb = a("trial_spawner_detection", true);
   public static final mb bc = a("trial_spawner_detection_ominous", true);
   public static final mb bd = a("vault_connection", true);
   public static final lw<lp> be = a("dust_pillar", false, lp::a, lp::b);
   public static final mb bf = a("ominous_spawning", true);
   public static final mb bg = a("raid_omen", false);
   public static final mb bh = a("trial_omen", false);
   public static final lw<lp> bi = a("block_crumble", false, lp::a, lp::b);
   public static final mb bj = a("firefly", false);
   public static final Codec<lv> bk = mf.i.q().dispatch("type", lv::a, lw::c);
   public static final yw<wj, lv> bl = yu.a(mg.Y).b(lv::a, lw::d);

   private static mb a(String $$0, boolean $$1) {
      return jr.a(mf.i, $$0, new mb($$1));
   }

   private static <T extends lv> lw<T> a(String $$0, boolean $$1, final Function<lw<T>, MapCodec<T>> $$2, final Function<lw<T>, yw<? super wj, T>> $$3) {
      return jr.a(mf.i, $$0, new lw<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public yw<? super wj, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
