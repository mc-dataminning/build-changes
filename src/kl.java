import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kl {
   public static final ko a = a("ambient_entity_effect", false);
   public static final ko b = a("angry_villager", false);
   public static final kk<kd> c = a("block", false, kd.a, kd::a, kd::b);
   public static final kk<kd> d = a("block_marker", true, kd.a, kd::a, kd::b);
   public static final ko e = a("bubble", false);
   public static final ko f = a("cloud", false);
   public static final ko g = a("crit", false);
   public static final ko h = a("damage_indicator", true);
   public static final ko i = a("dragon_breath", false);
   public static final ko j = a("dripping_lava", false);
   public static final ko k = a("falling_lava", false);
   public static final ko l = a("landing_lava", false);
   public static final ko m = a("dripping_water", false);
   public static final ko n = a("falling_water", false);
   public static final kk<kf> o = a("dust", false, kf.e, $$0 -> kf.c, $$0 -> kf.d);
   public static final kk<ke> p = a("dust_color_transition", false, ke.e, $$0 -> ke.c, $$0 -> ke.d);
   public static final ko q = a("effect", false);
   public static final ko r = a("elder_guardian", true);
   public static final ko s = a("enchanted_hit", false);
   public static final ko t = a("enchant", false);
   public static final ko u = a("end_rod", false);
   public static final ko v = a("entity_effect", false);
   public static final ko w = a("explosion_emitter", true);
   public static final ko x = a("explosion", true);
   public static final ko y = a("gust", true);
   public static final ko z = a("gust_emitter_large", true);
   public static final ko A = a("gust_emitter_small", true);
   public static final ko B = a("sonic_boom", true);
   public static final kk<kd> C = a("falling_dust", false, kd.a, kd::a, kd::b);
   public static final ko D = a("firework", false);
   public static final ko E = a("fishing", false);
   public static final ko F = a("flame", false);
   public static final ko G = a("cherry_leaves", false);
   public static final ko H = a("sculk_soul", false);
   public static final kk<km> I = a("sculk_charge", true, km.c, $$0 -> km.a, $$0 -> km.b);
   public static final ko J = a("sculk_charge_pop", true);
   public static final ko K = a("soul_fire_flame", false);
   public static final ko L = a("soul", false);
   public static final ko M = a("flash", false);
   public static final ko N = a("happy_villager", false);
   public static final ko O = a("composter", false);
   public static final ko P = a("heart", false);
   public static final ko Q = a("instant_effect", false);
   public static final kk<kh> R = a("item", false, kh.a, kh::a, kh::b);
   public static final kk<kp> S = a("vibration", true, kp.c, $$0 -> kp.a, $$0 -> kp.b);
   public static final ko T = a("item_slime", false);
   public static final ko U = a("item_snowball", false);
   public static final ko V = a("large_smoke", false);
   public static final ko W = a("lava", false);
   public static final ko X = a("mycelium", false);
   public static final ko Y = a("note", false);
   public static final ko Z = a("poof", true);
   public static final ko aa = a("portal", false);
   public static final ko ab = a("rain", false);
   public static final ko ac = a("smoke", false);
   public static final ko ad = a("white_smoke", false);
   public static final ko ae = a("sneeze", false);
   public static final ko af = a("spit", true);
   public static final ko ag = a("squid_ink", true);
   public static final ko ah = a("sweep_attack", true);
   public static final ko ai = a("totem_of_undying", false);
   public static final ko aj = a("underwater", false);
   public static final ko ak = a("splash", false);
   public static final ko al = a("witch", false);
   public static final ko am = a("bubble_pop", false);
   public static final ko an = a("current_down", false);
   public static final ko ao = a("bubble_column_up", false);
   public static final ko ap = a("nautilus", false);
   public static final ko aq = a("dolphin", false);
   public static final ko ar = a("campfire_cosy_smoke", true);
   public static final ko as = a("campfire_signal_smoke", true);
   public static final ko at = a("dripping_honey", false);
   public static final ko au = a("falling_honey", false);
   public static final ko av = a("landing_honey", false);
   public static final ko aw = a("falling_nectar", false);
   public static final ko ax = a("falling_spore_blossom", false);
   public static final ko ay = a("ash", false);
   public static final ko az = a("crimson_spore", false);
   public static final ko aA = a("warped_spore", false);
   public static final ko aB = a("spore_blossom_air", false);
   public static final ko aC = a("dripping_obsidian_tear", false);
   public static final ko aD = a("falling_obsidian_tear", false);
   public static final ko aE = a("landing_obsidian_tear", false);
   public static final ko aF = a("reverse_portal", false);
   public static final ko aG = a("white_ash", false);
   public static final ko aH = a("small_flame", false);
   public static final ko aI = a("snowflake", false);
   public static final ko aJ = a("dripping_dripstone_lava", false);
   public static final ko aK = a("falling_dripstone_lava", false);
   public static final ko aL = a("dripping_dripstone_water", false);
   public static final ko aM = a("falling_dripstone_water", false);
   public static final ko aN = a("glow_squid_ink", true);
   public static final ko aO = a("glow", true);
   public static final ko aP = a("wax_on", true);
   public static final ko aQ = a("wax_off", true);
   public static final ko aR = a("electric_spark", true);
   public static final ko aS = a("scrape", true);
   public static final kk<kn> aT = a("shriek", false, kn.c, $$0 -> kn.a, $$0 -> kn.b);
   public static final ko aU = a("egg_crack", false);
   public static final ko aV = a("dust_plume", false);
   public static final ko aW = a("trial_spawner_detection", true);
   public static final ko aX = a("vault_connection", true);
   public static final Codec<kj> aY = kr.j.q().dispatch("type", kj::a, kk::d);
   public static final ye<vr, kj> aZ = yc.a(ks.S).b(kj::a, kk::e);

   private static ko a(String $$0, boolean $$1) {
      return iy.a(kr.j, $$0, new ko($$1));
   }

   private static <T extends kj> kk<T> a(
      String $$0, boolean $$1, kj.a<T> $$2, final Function<kk<T>, Codec<T>> $$3, final Function<kk<T>, ye<? super vr, T>> $$4
   ) {
      return iy.a(kr.j, $$0, new kk<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public ye<? super vr, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
