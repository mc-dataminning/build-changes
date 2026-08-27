import com.mojang.serialization.Codec;
import java.util.function.Function;

public class jz {
   public static final kc a = a("ambient_entity_effect", false);
   public static final kc b = a("angry_villager", false);
   public static final jy<jr> c = a("block", false, jr.a, jr::a, jr::b);
   public static final jy<jr> d = a("block_marker", true, jr.a, jr::a, jr::b);
   public static final kc e = a("bubble", false);
   public static final kc f = a("cloud", false);
   public static final kc g = a("crit", false);
   public static final kc h = a("damage_indicator", true);
   public static final kc i = a("dragon_breath", false);
   public static final kc j = a("dripping_lava", false);
   public static final kc k = a("falling_lava", false);
   public static final kc l = a("landing_lava", false);
   public static final kc m = a("dripping_water", false);
   public static final kc n = a("falling_water", false);
   public static final jy<jt> o = a("dust", false, jt.e, $$0 -> jt.c, $$0 -> jt.d);
   public static final jy<js> p = a("dust_color_transition", false, js.e, $$0 -> js.c, $$0 -> js.d);
   public static final kc q = a("effect", false);
   public static final kc r = a("elder_guardian", true);
   public static final kc s = a("enchanted_hit", false);
   public static final kc t = a("enchant", false);
   public static final kc u = a("end_rod", false);
   public static final kc v = a("entity_effect", false);
   public static final kc w = a("explosion_emitter", true);
   public static final kc x = a("explosion", true);
   public static final kc y = a("gust", true);
   public static final kc z = a("gust_emitter", true);
   public static final kc A = a("sonic_boom", true);
   public static final jy<jr> B = a("falling_dust", false, jr.a, jr::a, jr::b);
   public static final kc C = a("firework", false);
   public static final kc D = a("fishing", false);
   public static final kc E = a("flame", false);
   public static final kc F = a("cherry_leaves", false);
   public static final kc G = a("sculk_soul", false);
   public static final jy<ka> H = a("sculk_charge", true, ka.c, $$0 -> ka.a, $$0 -> ka.b);
   public static final kc I = a("sculk_charge_pop", true);
   public static final kc J = a("soul_fire_flame", false);
   public static final kc K = a("soul", false);
   public static final kc L = a("flash", false);
   public static final kc M = a("happy_villager", false);
   public static final kc N = a("composter", false);
   public static final kc O = a("heart", false);
   public static final kc P = a("instant_effect", false);
   public static final jy<jv> Q = a("item", false, jv.a, jv::a, jv::b);
   public static final jy<kd> R = a("vibration", true, kd.c, $$0 -> kd.a, $$0 -> kd.b);
   public static final kc S = a("item_slime", false);
   public static final kc T = a("item_snowball", false);
   public static final kc U = a("large_smoke", false);
   public static final kc V = a("lava", false);
   public static final kc W = a("mycelium", false);
   public static final kc X = a("note", false);
   public static final kc Y = a("poof", true);
   public static final kc Z = a("portal", false);
   public static final kc aa = a("rain", false);
   public static final kc ab = a("smoke", false);
   public static final kc ac = a("white_smoke", false);
   public static final kc ad = a("sneeze", false);
   public static final kc ae = a("spit", true);
   public static final kc af = a("squid_ink", true);
   public static final kc ag = a("sweep_attack", true);
   public static final kc ah = a("totem_of_undying", false);
   public static final kc ai = a("underwater", false);
   public static final kc aj = a("splash", false);
   public static final kc ak = a("witch", false);
   public static final kc al = a("bubble_pop", false);
   public static final kc am = a("current_down", false);
   public static final kc an = a("bubble_column_up", false);
   public static final kc ao = a("nautilus", false);
   public static final kc ap = a("dolphin", false);
   public static final kc aq = a("campfire_cosy_smoke", true);
   public static final kc ar = a("campfire_signal_smoke", true);
   public static final kc as = a("dripping_honey", false);
   public static final kc at = a("falling_honey", false);
   public static final kc au = a("landing_honey", false);
   public static final kc av = a("falling_nectar", false);
   public static final kc aw = a("falling_spore_blossom", false);
   public static final kc ax = a("ash", false);
   public static final kc ay = a("crimson_spore", false);
   public static final kc az = a("warped_spore", false);
   public static final kc aA = a("spore_blossom_air", false);
   public static final kc aB = a("dripping_obsidian_tear", false);
   public static final kc aC = a("falling_obsidian_tear", false);
   public static final kc aD = a("landing_obsidian_tear", false);
   public static final kc aE = a("reverse_portal", false);
   public static final kc aF = a("white_ash", false);
   public static final kc aG = a("small_flame", false);
   public static final kc aH = a("snowflake", false);
   public static final kc aI = a("dripping_dripstone_lava", false);
   public static final kc aJ = a("falling_dripstone_lava", false);
   public static final kc aK = a("dripping_dripstone_water", false);
   public static final kc aL = a("falling_dripstone_water", false);
   public static final kc aM = a("glow_squid_ink", true);
   public static final kc aN = a("glow", true);
   public static final kc aO = a("wax_on", true);
   public static final kc aP = a("wax_off", true);
   public static final kc aQ = a("electric_spark", true);
   public static final kc aR = a("scrape", true);
   public static final jy<kb> aS = a("shriek", false, kb.c, $$0 -> kb.a, $$0 -> kb.b);
   public static final kc aT = a("egg_crack", false);
   public static final kc aU = a("dust_plume", false);
   public static final kc aV = a("trial_spawner_detection", true);
   public static final Codec<jx> aW = kf.j.q().dispatch("type", jx::b, jy::e);
   public static final xo<vb, jx> aX = xm.a(kg.S).b(jx::b, jy::f);

   private static kc a(String $$0, boolean $$1) {
      return iv.a(kf.j, $$0, new kc($$1));
   }

   private static <T extends jx> jy<T> a(
      String $$0, boolean $$1, jx.a<T> $$2, final Function<jy<T>, Codec<T>> $$3, final Function<jy<T>, xo<? super vb, T>> $$4
   ) {
      return iv.a(kf.j, $$0, new jy<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }

         @Override
         public xo<? super vb, T> f() {
            return $$4.apply(this);
         }
      });
   }
}
