import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kn {
   public static final kq a = a("ambient_entity_effect", false);
   public static final kq b = a("angry_villager", false);
   public static final km<kf> c = a("block", false, kf.a, kf::a, kf::b);
   public static final km<kf> d = a("block_marker", true, kf.a, kf::a, kf::b);
   public static final kq e = a("bubble", false);
   public static final kq f = a("cloud", false);
   public static final kq g = a("crit", false);
   public static final kq h = a("damage_indicator", true);
   public static final kq i = a("dragon_breath", false);
   public static final kq j = a("dripping_lava", false);
   public static final kq k = a("falling_lava", false);
   public static final kq l = a("landing_lava", false);
   public static final kq m = a("dripping_water", false);
   public static final kq n = a("falling_water", false);
   public static final km<kh> o = a("dust", false, kh.e, $$0 -> kh.c, $$0 -> kh.d);
   public static final km<kg> p = a("dust_color_transition", false, kg.e, $$0 -> kg.c, $$0 -> kg.d);
   public static final kq q = a("effect", false);
   public static final kq r = a("elder_guardian", true);
   public static final kq s = a("enchanted_hit", false);
   public static final kq t = a("enchant", false);
   public static final kq u = a("end_rod", false);
   public static final kq v = a("entity_effect", false);
   public static final kq w = a("explosion_emitter", true);
   public static final kq x = a("explosion", true);
   public static final kq y = a("gust", true);
   public static final kq z = a("gust_emitter_large", true);
   public static final kq A = a("gust_emitter_small", true);
   public static final kq B = a("sonic_boom", true);
   public static final km<kf> C = a("falling_dust", false, kf.a, kf::a, kf::b);
   public static final kq D = a("firework", false);
   public static final kq E = a("fishing", false);
   public static final kq F = a("flame", false);
   public static final kq G = a("cherry_leaves", false);
   public static final kq H = a("sculk_soul", false);
   public static final km<ko> I = a("sculk_charge", true, ko.c, $$0 -> ko.a, $$0 -> ko.b);
   public static final kq J = a("sculk_charge_pop", true);
   public static final kq K = a("soul_fire_flame", false);
   public static final kq L = a("soul", false);
   public static final kq M = a("flash", false);
   public static final kq N = a("happy_villager", false);
   public static final kq O = a("composter", false);
   public static final kq P = a("heart", false);
   public static final kq Q = a("instant_effect", false);
   public static final km<kj> R = a("item", false, kj.a, kj::a, kj::b);
   public static final km<kr> S = a("vibration", true, kr.c, $$0 -> kr.a, $$0 -> kr.b);
   public static final kq T = a("item_slime", false);
   public static final kq U = a("item_snowball", false);
   public static final kq V = a("large_smoke", false);
   public static final kq W = a("lava", false);
   public static final kq X = a("mycelium", false);
   public static final kq Y = a("note", false);
   public static final kq Z = a("poof", true);
   public static final kq aa = a("portal", false);
   public static final kq ab = a("rain", false);
   public static final kq ac = a("smoke", false);
   public static final kq ad = a("white_smoke", false);
   public static final kq ae = a("sneeze", false);
   public static final kq af = a("spit", true);
   public static final kq ag = a("squid_ink", true);
   public static final kq ah = a("sweep_attack", true);
   public static final kq ai = a("totem_of_undying", false);
   public static final kq aj = a("underwater", false);
   public static final kq ak = a("splash", false);
   public static final kq al = a("witch", false);
   public static final kq am = a("bubble_pop", false);
   public static final kq an = a("current_down", false);
   public static final kq ao = a("bubble_column_up", false);
   public static final kq ap = a("nautilus", false);
   public static final kq aq = a("dolphin", false);
   public static final kq ar = a("campfire_cosy_smoke", true);
   public static final kq as = a("campfire_signal_smoke", true);
   public static final kq at = a("dripping_honey", false);
   public static final kq au = a("falling_honey", false);
   public static final kq av = a("landing_honey", false);
   public static final kq aw = a("falling_nectar", false);
   public static final kq ax = a("falling_spore_blossom", false);
   public static final kq ay = a("ash", false);
   public static final kq az = a("crimson_spore", false);
   public static final kq aA = a("warped_spore", false);
   public static final kq aB = a("spore_blossom_air", false);
   public static final kq aC = a("dripping_obsidian_tear", false);
   public static final kq aD = a("falling_obsidian_tear", false);
   public static final kq aE = a("landing_obsidian_tear", false);
   public static final kq aF = a("reverse_portal", false);
   public static final kq aG = a("white_ash", false);
   public static final kq aH = a("small_flame", false);
   public static final kq aI = a("snowflake", false);
   public static final kq aJ = a("dripping_dripstone_lava", false);
   public static final kq aK = a("falling_dripstone_lava", false);
   public static final kq aL = a("dripping_dripstone_water", false);
   public static final kq aM = a("falling_dripstone_water", false);
   public static final kq aN = a("glow_squid_ink", true);
   public static final kq aO = a("glow", true);
   public static final kq aP = a("wax_on", true);
   public static final kq aQ = a("wax_off", true);
   public static final kq aR = a("electric_spark", true);
   public static final kq aS = a("scrape", true);
   public static final km<kp> aT = a("shriek", false, kp.c, $$0 -> kp.a, $$0 -> kp.b);
   public static final kq aU = a("egg_crack", false);
   public static final kq aV = a("dust_plume", false);
   public static final kq aW = a("trial_spawner_detection", true);
   public static final kq aX = a("vault_connection", true);
   public static final Codec<kl> aY = kt.j.q().dispatch("type", kl::a, km::d);
   public static final yg<vt, kl> aZ = ye.a(ku.T).b(kl::a, km::e);

   private static kq a(String $$0, boolean $$1) {
      return ja.a(kt.j, $$0, new kq($$1));
   }

   private static <T extends kl> km<T> a(
      String $$0, boolean $$1, kl.a<T> $$2, final Function<km<T>, Codec<T>> $$3, final Function<km<T>, yg<? super vt, T>> $$4
   ) {
      return ja.a(kt.j, $$0, new km<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public yg<? super vt, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
