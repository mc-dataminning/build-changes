import com.mojang.serialization.Codec;
import java.util.function.Function;

public class ix {
   public static final ja a = a("ambient_entity_effect", false);
   public static final ja b = a("angry_villager", false);
   public static final iw<ip> c = a("block", false, ip.a, ip::a);
   public static final iw<ip> d = a("block_marker", false, ip.a, ip::a);
   public static final ja e = a("bubble", false);
   public static final ja f = a("cloud", false);
   public static final ja g = a("crit", false);
   public static final ja h = a("damage_indicator", true);
   public static final ja i = a("dragon_breath", false);
   public static final ja j = a("dripping_lava", false);
   public static final ja k = a("falling_lava", false);
   public static final ja l = a("landing_lava", false);
   public static final ja m = a("dripping_water", false);
   public static final ja n = a("falling_water", false);
   public static final iw<ir> o = a("dust", false, ir.d, $$0 -> ir.c);
   public static final iw<iq> p = a("dust_color_transition", false, iq.d, $$0 -> iq.c);
   public static final ja q = a("effect", false);
   public static final ja r = a("elder_guardian", true);
   public static final ja s = a("enchanted_hit", false);
   public static final ja t = a("enchant", false);
   public static final ja u = a("end_rod", false);
   public static final ja v = a("entity_effect", false);
   public static final ja w = a("explosion_emitter", true);
   public static final ja x = a("explosion", true);
   public static final ja y = a("sonic_boom", true);
   public static final iw<ip> z = a("falling_dust", false, ip.a, ip::a);
   public static final ja A = a("firework", false);
   public static final ja B = a("fishing", false);
   public static final ja C = a("flame", false);
   public static final ja D = a("cherry_leaves", false);
   public static final ja E = a("sculk_soul", false);
   public static final iw<iy> F = a("sculk_charge", true, iy.b, $$0 -> iy.a);
   public static final ja G = a("sculk_charge_pop", true);
   public static final ja H = a("soul_fire_flame", false);
   public static final ja I = a("soul", false);
   public static final ja J = a("flash", false);
   public static final ja K = a("happy_villager", false);
   public static final ja L = a("composter", false);
   public static final ja M = a("heart", false);
   public static final ja N = a("instant_effect", false);
   public static final iw<it> O = a("item", false, it.a, it::a);
   public static final iw<jb> P = a("vibration", true, jb.b, $$0 -> jb.a);
   public static final ja Q = a("item_slime", false);
   public static final ja R = a("item_snowball", false);
   public static final ja S = a("large_smoke", false);
   public static final ja T = a("lava", false);
   public static final ja U = a("mycelium", false);
   public static final ja V = a("note", false);
   public static final ja W = a("poof", true);
   public static final ja X = a("portal", false);
   public static final ja Y = a("rain", false);
   public static final ja Z = a("smoke", false);
   public static final ja aa = a("sneeze", false);
   public static final ja ab = a("spit", true);
   public static final ja ac = a("squid_ink", true);
   public static final ja ad = a("sweep_attack", true);
   public static final ja ae = a("totem_of_undying", false);
   public static final ja af = a("underwater", false);
   public static final ja ag = a("splash", false);
   public static final ja ah = a("witch", false);
   public static final ja ai = a("bubble_pop", false);
   public static final ja aj = a("current_down", false);
   public static final ja ak = a("bubble_column_up", false);
   public static final ja al = a("nautilus", false);
   public static final ja am = a("dolphin", false);
   public static final ja an = a("campfire_cosy_smoke", true);
   public static final ja ao = a("campfire_signal_smoke", true);
   public static final ja ap = a("dripping_honey", false);
   public static final ja aq = a("falling_honey", false);
   public static final ja ar = a("landing_honey", false);
   public static final ja as = a("falling_nectar", false);
   public static final ja at = a("falling_spore_blossom", false);
   public static final ja au = a("ash", false);
   public static final ja av = a("crimson_spore", false);
   public static final ja aw = a("warped_spore", false);
   public static final ja ax = a("spore_blossom_air", false);
   public static final ja ay = a("dripping_obsidian_tear", false);
   public static final ja az = a("falling_obsidian_tear", false);
   public static final ja aA = a("landing_obsidian_tear", false);
   public static final ja aB = a("reverse_portal", false);
   public static final ja aC = a("white_ash", false);
   public static final ja aD = a("small_flame", false);
   public static final ja aE = a("snowflake", false);
   public static final ja aF = a("dripping_dripstone_lava", false);
   public static final ja aG = a("falling_dripstone_lava", false);
   public static final ja aH = a("dripping_dripstone_water", false);
   public static final ja aI = a("falling_dripstone_water", false);
   public static final ja aJ = a("glow_squid_ink", true);
   public static final ja aK = a("glow", true);
   public static final ja aL = a("wax_on", true);
   public static final ja aM = a("wax_off", true);
   public static final ja aN = a("electric_spark", true);
   public static final ja aO = a("scrape", true);
   public static final iw<iz> aP = a("shriek", false, iz.b, $$0 -> iz.a);
   public static final ja aQ = a("egg_crack", false);
   public static final Codec<iv> aR = jd.k.q().dispatch("type", iv::b, iw::e);

   private static ja a(String $$0, boolean $$1) {
      return ht.a(jd.k, $$0, new ja($$1));
   }

   private static <T extends iv> iw<T> a(String $$0, boolean $$1, iv.a<T> $$2, final Function<iw<T>, Codec<T>> $$3) {
      return ht.a(jd.k, $$0, new iw<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
