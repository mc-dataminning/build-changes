import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lj {
   public static final ln a = a("angry_villager", false);
   public static final li<lb> b = a("block", false, lb::a, lb::b);
   public static final li<lb> c = a("block_marker", true, lb::a, lb::b);
   public static final ln d = a("bubble", false);
   public static final ln e = a("cloud", false);
   public static final ln f = a("crit", false);
   public static final ln g = a("damage_indicator", true);
   public static final ln h = a("dragon_breath", false);
   public static final ln i = a("dripping_lava", false);
   public static final ln j = a("falling_lava", false);
   public static final ln k = a("landing_lava", false);
   public static final ln l = a("dripping_water", false);
   public static final ln m = a("falling_water", false);
   public static final li<le> n = a("dust", false, $$0 -> le.c, $$0 -> le.d);
   public static final li<ld> o = a("dust_color_transition", false, $$0 -> ld.c, $$0 -> ld.d);
   public static final ln p = a("effect", false);
   public static final ln q = a("elder_guardian", true);
   public static final ln r = a("enchanted_hit", false);
   public static final ln s = a("enchant", false);
   public static final ln t = a("end_rod", false);
   public static final li<lc> u = a("entity_effect", false, lc::a, lc::b);
   public static final ln v = a("explosion_emitter", true);
   public static final ln w = a("explosion", true);
   public static final ln x = a("gust", true);
   public static final ln y = a("small_gust", false);
   public static final ln z = a("gust_emitter_large", true);
   public static final ln A = a("gust_emitter_small", true);
   public static final ln B = a("sonic_boom", true);
   public static final li<lb> C = a("falling_dust", false, lb::a, lb::b);
   public static final ln D = a("firework", false);
   public static final ln E = a("fishing", false);
   public static final ln F = a("flame", false);
   public static final ln G = a("infested", false);
   public static final ln H = a("cherry_leaves", false);
   public static final ln I = a("sculk_soul", false);
   public static final li<ll> J = a("sculk_charge", true, $$0 -> ll.a, $$0 -> ll.b);
   public static final ln K = a("sculk_charge_pop", true);
   public static final ln L = a("soul_fire_flame", false);
   public static final ln M = a("soul", false);
   public static final ln N = a("flash", false);
   public static final ln O = a("happy_villager", false);
   public static final ln P = a("composter", false);
   public static final ln Q = a("heart", false);
   public static final ln R = a("instant_effect", false);
   public static final li<lf> S = a("item", false, lf::a, lf::b);
   public static final li<lo> T = a("vibration", true, $$0 -> lo.a, $$0 -> lo.b);
   public static final ln U = a("item_slime", false);
   public static final ln V = a("item_cobweb", false);
   public static final ln W = a("item_snowball", false);
   public static final ln X = a("large_smoke", false);
   public static final ln Y = a("lava", false);
   public static final ln Z = a("mycelium", false);
   public static final ln aa = a("note", false);
   public static final ln ab = a("poof", true);
   public static final ln ac = a("portal", false);
   public static final ln ad = a("rain", false);
   public static final ln ae = a("smoke", false);
   public static final ln af = a("white_smoke", false);
   public static final ln ag = a("sneeze", false);
   public static final ln ah = a("spit", true);
   public static final ln ai = a("squid_ink", true);
   public static final ln aj = a("sweep_attack", true);
   public static final ln ak = a("totem_of_undying", false);
   public static final ln al = a("underwater", false);
   public static final ln am = a("splash", false);
   public static final ln an = a("witch", false);
   public static final ln ao = a("bubble_pop", false);
   public static final ln ap = a("current_down", false);
   public static final ln aq = a("bubble_column_up", false);
   public static final ln ar = a("nautilus", false);
   public static final ln as = a("dolphin", false);
   public static final ln at = a("campfire_cosy_smoke", true);
   public static final ln au = a("campfire_signal_smoke", true);
   public static final ln av = a("dripping_honey", false);
   public static final ln aw = a("falling_honey", false);
   public static final ln ax = a("landing_honey", false);
   public static final ln ay = a("falling_nectar", false);
   public static final ln az = a("falling_spore_blossom", false);
   public static final ln aA = a("ash", false);
   public static final ln aB = a("crimson_spore", false);
   public static final ln aC = a("warped_spore", false);
   public static final ln aD = a("spore_blossom_air", false);
   public static final ln aE = a("dripping_obsidian_tear", false);
   public static final ln aF = a("falling_obsidian_tear", false);
   public static final ln aG = a("landing_obsidian_tear", false);
   public static final ln aH = a("reverse_portal", false);
   public static final ln aI = a("white_ash", false);
   public static final ln aJ = a("small_flame", false);
   public static final ln aK = a("snowflake", false);
   public static final ln aL = a("dripping_dripstone_lava", false);
   public static final ln aM = a("falling_dripstone_lava", false);
   public static final ln aN = a("dripping_dripstone_water", false);
   public static final ln aO = a("falling_dripstone_water", false);
   public static final ln aP = a("glow_squid_ink", true);
   public static final ln aQ = a("glow", true);
   public static final ln aR = a("wax_on", true);
   public static final ln aS = a("wax_off", true);
   public static final ln aT = a("electric_spark", true);
   public static final ln aU = a("scrape", true);
   public static final li<lm> aV = a("shriek", false, $$0 -> lm.a, $$0 -> lm.b);
   public static final ln aW = a("egg_crack", false);
   public static final ln aX = a("dust_plume", false);
   public static final ln aY = a("trial_spawner_detection", true);
   public static final ln aZ = a("trial_spawner_detection_ominous", true);
   public static final ln ba = a("vault_connection", true);
   public static final li<lb> bb = a("dust_pillar", false, lb::a, lb::b);
   public static final ln bc = a("ominous_spawning", true);
   public static final ln bd = a("raid_omen", false);
   public static final ln be = a("trial_omen", false);
   public static final Codec<lh> bf = lq.i.r().dispatch("type", lh::a, li::c);
   public static final ys<wf, lh> bg = yq.a(lr.X).b(lh::a, li::d);

   private static ln a(String $$0, boolean $$1) {
      return jw.a(lq.i, $$0, new ln($$1));
   }

   private static <T extends lh> li<T> a(String $$0, boolean $$1, final Function<li<T>, MapCodec<T>> $$2, final Function<li<T>, ys<? super wf, T>> $$3) {
      return jw.a(lq.i, $$0, new li<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public ys<? super wf, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
