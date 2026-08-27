import com.mojang.serialization.Codec;
import java.util.function.Function;

public class iv {
   public static final iy a = a("ambient_entity_effect", false);
   public static final iy b = a("angry_villager", false);
   public static final iu<in> c = a("block", false, in.a, in::a);
   public static final iu<in> d = a("block_marker", false, in.a, in::a);
   public static final iy e = a("bubble", false);
   public static final iy f = a("cloud", false);
   public static final iy g = a("crit", false);
   public static final iy h = a("damage_indicator", true);
   public static final iy i = a("dragon_breath", false);
   public static final iy j = a("dripping_lava", false);
   public static final iy k = a("falling_lava", false);
   public static final iy l = a("landing_lava", false);
   public static final iy m = a("dripping_water", false);
   public static final iy n = a("falling_water", false);
   public static final iu<ip> o = a("dust", false, ip.d, $$0 -> ip.c);
   public static final iu<io> p = a("dust_color_transition", false, io.d, $$0 -> io.c);
   public static final iy q = a("effect", false);
   public static final iy r = a("elder_guardian", true);
   public static final iy s = a("enchanted_hit", false);
   public static final iy t = a("enchant", false);
   public static final iy u = a("end_rod", false);
   public static final iy v = a("entity_effect", false);
   public static final iy w = a("explosion_emitter", true);
   public static final iy x = a("explosion", true);
   public static final iy y = a("sonic_boom", true);
   public static final iu<in> z = a("falling_dust", false, in.a, in::a);
   public static final iy A = a("firework", false);
   public static final iy B = a("fishing", false);
   public static final iy C = a("flame", false);
   public static final iy D = a("cherry_leaves", false);
   public static final iy E = a("sculk_soul", false);
   public static final iu<iw> F = a("sculk_charge", true, iw.b, $$0 -> iw.a);
   public static final iy G = a("sculk_charge_pop", true);
   public static final iy H = a("soul_fire_flame", false);
   public static final iy I = a("soul", false);
   public static final iy J = a("flash", false);
   public static final iy K = a("happy_villager", false);
   public static final iy L = a("composter", false);
   public static final iy M = a("heart", false);
   public static final iy N = a("instant_effect", false);
   public static final iu<ir> O = a("item", false, ir.a, ir::a);
   public static final iu<iz> P = a("vibration", true, iz.b, $$0 -> iz.a);
   public static final iy Q = a("item_slime", false);
   public static final iy R = a("item_snowball", false);
   public static final iy S = a("large_smoke", false);
   public static final iy T = a("lava", false);
   public static final iy U = a("mycelium", false);
   public static final iy V = a("note", false);
   public static final iy W = a("poof", true);
   public static final iy X = a("portal", false);
   public static final iy Y = a("rain", false);
   public static final iy Z = a("smoke", false);
   public static final iy aa = a("sneeze", false);
   public static final iy ab = a("spit", true);
   public static final iy ac = a("squid_ink", true);
   public static final iy ad = a("sweep_attack", true);
   public static final iy ae = a("totem_of_undying", false);
   public static final iy af = a("underwater", false);
   public static final iy ag = a("splash", false);
   public static final iy ah = a("witch", false);
   public static final iy ai = a("bubble_pop", false);
   public static final iy aj = a("current_down", false);
   public static final iy ak = a("bubble_column_up", false);
   public static final iy al = a("nautilus", false);
   public static final iy am = a("dolphin", false);
   public static final iy an = a("campfire_cosy_smoke", true);
   public static final iy ao = a("campfire_signal_smoke", true);
   public static final iy ap = a("dripping_honey", false);
   public static final iy aq = a("falling_honey", false);
   public static final iy ar = a("landing_honey", false);
   public static final iy as = a("falling_nectar", false);
   public static final iy at = a("falling_spore_blossom", false);
   public static final iy au = a("ash", false);
   public static final iy av = a("crimson_spore", false);
   public static final iy aw = a("warped_spore", false);
   public static final iy ax = a("spore_blossom_air", false);
   public static final iy ay = a("dripping_obsidian_tear", false);
   public static final iy az = a("falling_obsidian_tear", false);
   public static final iy aA = a("landing_obsidian_tear", false);
   public static final iy aB = a("reverse_portal", false);
   public static final iy aC = a("white_ash", false);
   public static final iy aD = a("small_flame", false);
   public static final iy aE = a("snowflake", false);
   public static final iy aF = a("dripping_dripstone_lava", false);
   public static final iy aG = a("falling_dripstone_lava", false);
   public static final iy aH = a("dripping_dripstone_water", false);
   public static final iy aI = a("falling_dripstone_water", false);
   public static final iy aJ = a("glow_squid_ink", true);
   public static final iy aK = a("glow", true);
   public static final iy aL = a("wax_on", true);
   public static final iy aM = a("wax_off", true);
   public static final iy aN = a("electric_spark", true);
   public static final iy aO = a("scrape", true);
   public static final iu<ix> aP = a("shriek", false, ix.b, $$0 -> ix.a);
   public static final iy aQ = a("egg_crack", false);
   public static final Codec<it> aR = jb.k.q().dispatch("type", it::b, iu::e);

   private static iy a(String $$0, boolean $$1) {
      return hr.a(jb.k, $$0, new iy($$1));
   }

   private static <T extends it> iu<T> a(String $$0, boolean $$1, it.a<T> $$2, final Function<iu<T>, Codec<T>> $$3) {
      return hr.a(jb.k, $$0, new iu<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
