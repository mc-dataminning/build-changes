import com.mojang.serialization.Codec;
import java.util.function.Function;

public class jw {
   public static final jz a = a("ambient_entity_effect", false);
   public static final jz b = a("angry_villager", false);
   public static final jv<jo> c = a("block", false, jo.a, jo::a);
   public static final jv<jo> d = a("block_marker", true, jo.a, jo::a);
   public static final jz e = a("bubble", false);
   public static final jz f = a("cloud", false);
   public static final jz g = a("crit", false);
   public static final jz h = a("damage_indicator", true);
   public static final jz i = a("dragon_breath", false);
   public static final jz j = a("dripping_lava", false);
   public static final jz k = a("falling_lava", false);
   public static final jz l = a("landing_lava", false);
   public static final jz m = a("dripping_water", false);
   public static final jz n = a("falling_water", false);
   public static final jv<jq> o = a("dust", false, jq.d, $$0 -> jq.c);
   public static final jv<jp> p = a("dust_color_transition", false, jp.d, $$0 -> jp.c);
   public static final jz q = a("effect", false);
   public static final jz r = a("elder_guardian", true);
   public static final jz s = a("enchanted_hit", false);
   public static final jz t = a("enchant", false);
   public static final jz u = a("end_rod", false);
   public static final jz v = a("entity_effect", false);
   public static final jz w = a("explosion_emitter", true);
   public static final jz x = a("explosion", true);
   public static final jz y = a("sonic_boom", true);
   public static final jv<jo> z = a("falling_dust", false, jo.a, jo::a);
   public static final jz A = a("firework", false);
   public static final jz B = a("fishing", false);
   public static final jz C = a("flame", false);
   public static final jz D = a("cherry_leaves", false);
   public static final jz E = a("sculk_soul", false);
   public static final jv<jx> F = a("sculk_charge", true, jx.b, $$0 -> jx.a);
   public static final jz G = a("sculk_charge_pop", true);
   public static final jz H = a("soul_fire_flame", false);
   public static final jz I = a("soul", false);
   public static final jz J = a("flash", false);
   public static final jz K = a("happy_villager", false);
   public static final jz L = a("composter", false);
   public static final jz M = a("heart", false);
   public static final jz N = a("instant_effect", false);
   public static final jv<js> O = a("item", false, js.a, js::a);
   public static final jv<ka> P = a("vibration", true, ka.b, $$0 -> ka.a);
   public static final jz Q = a("item_slime", false);
   public static final jz R = a("item_snowball", false);
   public static final jz S = a("large_smoke", false);
   public static final jz T = a("lava", false);
   public static final jz U = a("mycelium", false);
   public static final jz V = a("note", false);
   public static final jz W = a("poof", true);
   public static final jz X = a("portal", false);
   public static final jz Y = a("rain", false);
   public static final jz Z = a("smoke", false);
   public static final jz aa = a("white_smoke", false);
   public static final jz ab = a("sneeze", false);
   public static final jz ac = a("spit", true);
   public static final jz ad = a("squid_ink", true);
   public static final jz ae = a("sweep_attack", true);
   public static final jz af = a("totem_of_undying", false);
   public static final jz ag = a("underwater", false);
   public static final jz ah = a("splash", false);
   public static final jz ai = a("witch", false);
   public static final jz aj = a("bubble_pop", false);
   public static final jz ak = a("current_down", false);
   public static final jz al = a("bubble_column_up", false);
   public static final jz am = a("nautilus", false);
   public static final jz an = a("dolphin", false);
   public static final jz ao = a("campfire_cosy_smoke", true);
   public static final jz ap = a("campfire_signal_smoke", true);
   public static final jz aq = a("dripping_honey", false);
   public static final jz ar = a("falling_honey", false);
   public static final jz as = a("landing_honey", false);
   public static final jz at = a("falling_nectar", false);
   public static final jz au = a("falling_spore_blossom", false);
   public static final jz av = a("ash", false);
   public static final jz aw = a("crimson_spore", false);
   public static final jz ax = a("warped_spore", false);
   public static final jz ay = a("spore_blossom_air", false);
   public static final jz az = a("dripping_obsidian_tear", false);
   public static final jz aA = a("falling_obsidian_tear", false);
   public static final jz aB = a("landing_obsidian_tear", false);
   public static final jz aC = a("reverse_portal", false);
   public static final jz aD = a("white_ash", false);
   public static final jz aE = a("small_flame", false);
   public static final jz aF = a("snowflake", false);
   public static final jz aG = a("dripping_dripstone_lava", false);
   public static final jz aH = a("falling_dripstone_lava", false);
   public static final jz aI = a("dripping_dripstone_water", false);
   public static final jz aJ = a("falling_dripstone_water", false);
   public static final jz aK = a("glow_squid_ink", true);
   public static final jz aL = a("glow", true);
   public static final jz aM = a("wax_on", true);
   public static final jz aN = a("wax_off", true);
   public static final jz aO = a("electric_spark", true);
   public static final jz aP = a("scrape", true);
   public static final jv<jy> aQ = a("shriek", false, jy.b, $$0 -> jy.a);
   public static final jz aR = a("egg_crack", false);
   public static final jz aS = a("dust_plume", false);
   public static final Codec<ju> aT = kc.k.q().dispatch("type", ju::b, jv::e);

   private static jz a(String $$0, boolean $$1) {
      return is.a(kc.k, $$0, new jz($$1));
   }

   private static <T extends ju> jv<T> a(String $$0, boolean $$1, ju.a<T> $$2, final Function<jv<T>, Codec<T>> $$3) {
      return is.a(kc.k, $$0, new jv<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
