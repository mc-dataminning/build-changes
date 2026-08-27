import com.mojang.serialization.Codec;
import java.util.function.Function;

public class jx {
   public static final ka a = a("ambient_entity_effect", false);
   public static final ka b = a("angry_villager", false);
   public static final jw<jp> c = a("block", false, jp.a, jp::a);
   public static final jw<jp> d = a("block_marker", true, jp.a, jp::a);
   public static final ka e = a("bubble", false);
   public static final ka f = a("cloud", false);
   public static final ka g = a("crit", false);
   public static final ka h = a("damage_indicator", true);
   public static final ka i = a("dragon_breath", false);
   public static final ka j = a("dripping_lava", false);
   public static final ka k = a("falling_lava", false);
   public static final ka l = a("landing_lava", false);
   public static final ka m = a("dripping_water", false);
   public static final ka n = a("falling_water", false);
   public static final jw<jr> o = a("dust", false, jr.d, $$0 -> jr.c);
   public static final jw<jq> p = a("dust_color_transition", false, jq.d, $$0 -> jq.c);
   public static final ka q = a("effect", false);
   public static final ka r = a("elder_guardian", true);
   public static final ka s = a("enchanted_hit", false);
   public static final ka t = a("enchant", false);
   public static final ka u = a("end_rod", false);
   public static final ka v = a("entity_effect", false);
   public static final ka w = a("explosion_emitter", true);
   public static final ka x = a("explosion", true);
   public static final ka y = a("gust", true);
   public static final ka z = a("gust_emitter", true);
   public static final ka A = a("sonic_boom", true);
   public static final jw<jp> B = a("falling_dust", false, jp.a, jp::a);
   public static final ka C = a("firework", false);
   public static final ka D = a("fishing", false);
   public static final ka E = a("flame", false);
   public static final ka F = a("cherry_leaves", false);
   public static final ka G = a("sculk_soul", false);
   public static final jw<jy> H = a("sculk_charge", true, jy.b, $$0 -> jy.a);
   public static final ka I = a("sculk_charge_pop", true);
   public static final ka J = a("soul_fire_flame", false);
   public static final ka K = a("soul", false);
   public static final ka L = a("flash", false);
   public static final ka M = a("happy_villager", false);
   public static final ka N = a("composter", false);
   public static final ka O = a("heart", false);
   public static final ka P = a("instant_effect", false);
   public static final jw<jt> Q = a("item", false, jt.a, jt::a);
   public static final jw<kb> R = a("vibration", true, kb.b, $$0 -> kb.a);
   public static final ka S = a("item_slime", false);
   public static final ka T = a("item_snowball", false);
   public static final ka U = a("large_smoke", false);
   public static final ka V = a("lava", false);
   public static final ka W = a("mycelium", false);
   public static final ka X = a("note", false);
   public static final ka Y = a("poof", true);
   public static final ka Z = a("portal", false);
   public static final ka aa = a("rain", false);
   public static final ka ab = a("smoke", false);
   public static final ka ac = a("white_smoke", false);
   public static final ka ad = a("sneeze", false);
   public static final ka ae = a("spit", true);
   public static final ka af = a("squid_ink", true);
   public static final ka ag = a("sweep_attack", true);
   public static final ka ah = a("totem_of_undying", false);
   public static final ka ai = a("underwater", false);
   public static final ka aj = a("splash", false);
   public static final ka ak = a("witch", false);
   public static final ka al = a("bubble_pop", false);
   public static final ka am = a("current_down", false);
   public static final ka an = a("bubble_column_up", false);
   public static final ka ao = a("nautilus", false);
   public static final ka ap = a("dolphin", false);
   public static final ka aq = a("campfire_cosy_smoke", true);
   public static final ka ar = a("campfire_signal_smoke", true);
   public static final ka as = a("dripping_honey", false);
   public static final ka at = a("falling_honey", false);
   public static final ka au = a("landing_honey", false);
   public static final ka av = a("falling_nectar", false);
   public static final ka aw = a("falling_spore_blossom", false);
   public static final ka ax = a("ash", false);
   public static final ka ay = a("crimson_spore", false);
   public static final ka az = a("warped_spore", false);
   public static final ka aA = a("spore_blossom_air", false);
   public static final ka aB = a("dripping_obsidian_tear", false);
   public static final ka aC = a("falling_obsidian_tear", false);
   public static final ka aD = a("landing_obsidian_tear", false);
   public static final ka aE = a("reverse_portal", false);
   public static final ka aF = a("white_ash", false);
   public static final ka aG = a("small_flame", false);
   public static final ka aH = a("snowflake", false);
   public static final ka aI = a("dripping_dripstone_lava", false);
   public static final ka aJ = a("falling_dripstone_lava", false);
   public static final ka aK = a("dripping_dripstone_water", false);
   public static final ka aL = a("falling_dripstone_water", false);
   public static final ka aM = a("glow_squid_ink", true);
   public static final ka aN = a("glow", true);
   public static final ka aO = a("wax_on", true);
   public static final ka aP = a("wax_off", true);
   public static final ka aQ = a("electric_spark", true);
   public static final ka aR = a("scrape", true);
   public static final jw<jz> aS = a("shriek", false, jz.b, $$0 -> jz.a);
   public static final ka aT = a("egg_crack", false);
   public static final ka aU = a("dust_plume", false);
   public static final ka aV = a("gust_dust", false);
   public static final ka aW = a("trial_spawner_detection", true);
   public static final Codec<jv> aX = kd.j.q().dispatch("type", jv::b, jw::e);

   private static ka a(String $$0, boolean $$1) {
      return it.a(kd.j, $$0, new ka($$1));
   }

   private static <T extends jv> jw<T> a(String $$0, boolean $$1, jv.a<T> $$2, final Function<jw<T>, Codec<T>> $$3) {
      return it.a(kd.j, $$0, new jw<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
