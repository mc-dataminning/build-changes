import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class li {
   public static final lm a = a("angry_villager", false);
   public static final lh<la> b = a("block", false, la::a, la::b);
   public static final lh<la> c = a("block_marker", true, la::a, la::b);
   public static final lm d = a("bubble", false);
   public static final lm e = a("cloud", false);
   public static final lm f = a("crit", false);
   public static final lm g = a("damage_indicator", true);
   public static final lm h = a("dragon_breath", false);
   public static final lm i = a("dripping_lava", false);
   public static final lm j = a("falling_lava", false);
   public static final lm k = a("landing_lava", false);
   public static final lm l = a("dripping_water", false);
   public static final lm m = a("falling_water", false);
   public static final lh<ld> n = a("dust", false, $$0 -> ld.c, $$0 -> ld.d);
   public static final lh<lc> o = a("dust_color_transition", false, $$0 -> lc.c, $$0 -> lc.d);
   public static final lm p = a("effect", false);
   public static final lm q = a("elder_guardian", true);
   public static final lm r = a("enchanted_hit", false);
   public static final lm s = a("enchant", false);
   public static final lm t = a("end_rod", false);
   public static final lh<lb> u = a("entity_effect", false, lb::a, lb::b);
   public static final lm v = a("explosion_emitter", true);
   public static final lm w = a("explosion", true);
   public static final lm x = a("gust", true);
   public static final lm y = a("small_gust", false);
   public static final lm z = a("gust_emitter_large", true);
   public static final lm A = a("gust_emitter_small", true);
   public static final lm B = a("sonic_boom", true);
   public static final lh<la> C = a("falling_dust", false, la::a, la::b);
   public static final lm D = a("firework", false);
   public static final lm E = a("fishing", false);
   public static final lm F = a("flame", false);
   public static final lm G = a("infested", false);
   public static final lm H = a("cherry_leaves", false);
   public static final lm I = a("sculk_soul", false);
   public static final lh<lk> J = a("sculk_charge", true, $$0 -> lk.a, $$0 -> lk.b);
   public static final lm K = a("sculk_charge_pop", true);
   public static final lm L = a("soul_fire_flame", false);
   public static final lm M = a("soul", false);
   public static final lm N = a("flash", false);
   public static final lm O = a("happy_villager", false);
   public static final lm P = a("composter", false);
   public static final lm Q = a("heart", false);
   public static final lm R = a("instant_effect", false);
   public static final lh<le> S = a("item", false, le::a, le::b);
   public static final lh<ln> T = a("vibration", true, $$0 -> ln.a, $$0 -> ln.b);
   public static final lm U = a("item_slime", false);
   public static final lm V = a("item_cobweb", false);
   public static final lm W = a("item_snowball", false);
   public static final lm X = a("large_smoke", false);
   public static final lm Y = a("lava", false);
   public static final lm Z = a("mycelium", false);
   public static final lm aa = a("note", false);
   public static final lm ab = a("poof", true);
   public static final lm ac = a("portal", false);
   public static final lm ad = a("rain", false);
   public static final lm ae = a("smoke", false);
   public static final lm af = a("white_smoke", false);
   public static final lm ag = a("sneeze", false);
   public static final lm ah = a("spit", true);
   public static final lm ai = a("squid_ink", true);
   public static final lm aj = a("sweep_attack", true);
   public static final lm ak = a("totem_of_undying", false);
   public static final lm al = a("underwater", false);
   public static final lm am = a("splash", false);
   public static final lm an = a("witch", false);
   public static final lm ao = a("bubble_pop", false);
   public static final lm ap = a("current_down", false);
   public static final lm aq = a("bubble_column_up", false);
   public static final lm ar = a("nautilus", false);
   public static final lm as = a("dolphin", false);
   public static final lm at = a("campfire_cosy_smoke", true);
   public static final lm au = a("campfire_signal_smoke", true);
   public static final lm av = a("dripping_honey", false);
   public static final lm aw = a("falling_honey", false);
   public static final lm ax = a("landing_honey", false);
   public static final lm ay = a("falling_nectar", false);
   public static final lm az = a("falling_spore_blossom", false);
   public static final lm aA = a("ash", false);
   public static final lm aB = a("crimson_spore", false);
   public static final lm aC = a("warped_spore", false);
   public static final lm aD = a("spore_blossom_air", false);
   public static final lm aE = a("dripping_obsidian_tear", false);
   public static final lm aF = a("falling_obsidian_tear", false);
   public static final lm aG = a("landing_obsidian_tear", false);
   public static final lm aH = a("reverse_portal", false);
   public static final lm aI = a("white_ash", false);
   public static final lm aJ = a("small_flame", false);
   public static final lm aK = a("snowflake", false);
   public static final lm aL = a("dripping_dripstone_lava", false);
   public static final lm aM = a("falling_dripstone_lava", false);
   public static final lm aN = a("dripping_dripstone_water", false);
   public static final lm aO = a("falling_dripstone_water", false);
   public static final lm aP = a("glow_squid_ink", true);
   public static final lm aQ = a("glow", true);
   public static final lm aR = a("wax_on", true);
   public static final lm aS = a("wax_off", true);
   public static final lm aT = a("electric_spark", true);
   public static final lm aU = a("scrape", true);
   public static final lh<ll> aV = a("shriek", false, $$0 -> ll.a, $$0 -> ll.b);
   public static final lm aW = a("egg_crack", false);
   public static final lm aX = a("dust_plume", false);
   public static final lm aY = a("trial_spawner_detection", true);
   public static final lm aZ = a("trial_spawner_detection_ominous", true);
   public static final lm ba = a("vault_connection", true);
   public static final lh<la> bb = a("dust_pillar", true, la::a, la::b);
   public static final lm bc = a("ominous_spawning", true);
   public static final lm bd = a("raid_omen", false);
   public static final lm be = a("trial_omen", false);
   public static final Codec<lg> bf = lp.j.q().dispatch("type", lg::a, lh::c);
   public static final zm<wz, lg> bg = zk.a(lq.T).b(lg::a, lh::d);

   private static lm a(String $$0, boolean $$1) {
      return jv.a(lp.j, $$0, new lm($$1));
   }

   private static <T extends lg> lh<T> a(String $$0, boolean $$1, final Function<lh<T>, MapCodec<T>> $$2, final Function<lh<T>, zm<? super wz, T>> $$3) {
      return jv.a(lp.j, $$0, new lh<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zm<? super wz, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
