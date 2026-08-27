import com.mojang.serialization.Codec;
import java.util.function.Function;

public class iw {
   public static final iz a = a("ambient_entity_effect", false);
   public static final iz b = a("angry_villager", false);
   public static final iv<io> c = a("block", false, io.a, io::a);
   public static final iv<io> d = a("block_marker", false, io.a, io::a);
   public static final iz e = a("bubble", false);
   public static final iz f = a("cloud", false);
   public static final iz g = a("crit", false);
   public static final iz h = a("damage_indicator", true);
   public static final iz i = a("dragon_breath", false);
   public static final iz j = a("dripping_lava", false);
   public static final iz k = a("falling_lava", false);
   public static final iz l = a("landing_lava", false);
   public static final iz m = a("dripping_water", false);
   public static final iz n = a("falling_water", false);
   public static final iv<iq> o = a("dust", false, iq.d, $$0 -> iq.c);
   public static final iv<ip> p = a("dust_color_transition", false, ip.d, $$0 -> ip.c);
   public static final iz q = a("effect", false);
   public static final iz r = a("elder_guardian", true);
   public static final iz s = a("enchanted_hit", false);
   public static final iz t = a("enchant", false);
   public static final iz u = a("end_rod", false);
   public static final iz v = a("entity_effect", false);
   public static final iz w = a("explosion_emitter", true);
   public static final iz x = a("explosion", true);
   public static final iz y = a("sonic_boom", true);
   public static final iv<io> z = a("falling_dust", false, io.a, io::a);
   public static final iz A = a("firework", false);
   public static final iz B = a("fishing", false);
   public static final iz C = a("flame", false);
   public static final iz D = a("cherry_leaves", false);
   public static final iz E = a("sculk_soul", false);
   public static final iv<ix> F = a("sculk_charge", true, ix.b, $$0 -> ix.a);
   public static final iz G = a("sculk_charge_pop", true);
   public static final iz H = a("soul_fire_flame", false);
   public static final iz I = a("soul", false);
   public static final iz J = a("flash", false);
   public static final iz K = a("happy_villager", false);
   public static final iz L = a("composter", false);
   public static final iz M = a("heart", false);
   public static final iz N = a("instant_effect", false);
   public static final iv<is> O = a("item", false, is.a, is::a);
   public static final iv<ja> P = a("vibration", true, ja.b, $$0 -> ja.a);
   public static final iz Q = a("item_slime", false);
   public static final iz R = a("item_snowball", false);
   public static final iz S = a("large_smoke", false);
   public static final iz T = a("lava", false);
   public static final iz U = a("mycelium", false);
   public static final iz V = a("note", false);
   public static final iz W = a("poof", true);
   public static final iz X = a("portal", false);
   public static final iz Y = a("rain", false);
   public static final iz Z = a("smoke", false);
   public static final iz aa = a("sneeze", false);
   public static final iz ab = a("spit", true);
   public static final iz ac = a("squid_ink", true);
   public static final iz ad = a("sweep_attack", true);
   public static final iz ae = a("totem_of_undying", false);
   public static final iz af = a("underwater", false);
   public static final iz ag = a("splash", false);
   public static final iz ah = a("witch", false);
   public static final iz ai = a("bubble_pop", false);
   public static final iz aj = a("current_down", false);
   public static final iz ak = a("bubble_column_up", false);
   public static final iz al = a("nautilus", false);
   public static final iz am = a("dolphin", false);
   public static final iz an = a("campfire_cosy_smoke", true);
   public static final iz ao = a("campfire_signal_smoke", true);
   public static final iz ap = a("dripping_honey", false);
   public static final iz aq = a("falling_honey", false);
   public static final iz ar = a("landing_honey", false);
   public static final iz as = a("falling_nectar", false);
   public static final iz at = a("falling_spore_blossom", false);
   public static final iz au = a("ash", false);
   public static final iz av = a("crimson_spore", false);
   public static final iz aw = a("warped_spore", false);
   public static final iz ax = a("spore_blossom_air", false);
   public static final iz ay = a("dripping_obsidian_tear", false);
   public static final iz az = a("falling_obsidian_tear", false);
   public static final iz aA = a("landing_obsidian_tear", false);
   public static final iz aB = a("reverse_portal", false);
   public static final iz aC = a("white_ash", false);
   public static final iz aD = a("small_flame", false);
   public static final iz aE = a("snowflake", false);
   public static final iz aF = a("dripping_dripstone_lava", false);
   public static final iz aG = a("falling_dripstone_lava", false);
   public static final iz aH = a("dripping_dripstone_water", false);
   public static final iz aI = a("falling_dripstone_water", false);
   public static final iz aJ = a("glow_squid_ink", true);
   public static final iz aK = a("glow", true);
   public static final iz aL = a("wax_on", true);
   public static final iz aM = a("wax_off", true);
   public static final iz aN = a("electric_spark", true);
   public static final iz aO = a("scrape", true);
   public static final iv<iy> aP = a("shriek", false, iy.b, $$0 -> iy.a);
   public static final iz aQ = a("egg_crack", false);
   public static final Codec<iu> aR = jc.k.q().dispatch("type", iu::b, iv::e);

   private static iz a(String $$0, boolean $$1) {
      return hs.a(jc.k, $$0, new iz($$1));
   }

   private static <T extends iu> iv<T> a(String $$0, boolean $$1, iu.a<T> $$2, final Function<iv<T>, Codec<T>> $$3) {
      return hs.a(jc.k, $$0, new iv<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
