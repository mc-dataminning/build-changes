import com.mojang.serialization.Codec;
import java.util.function.Function;

public class jv {
   public static final jy a = a("ambient_entity_effect", false);
   public static final jy b = a("angry_villager", false);
   public static final ju<jn> c = a("block", false, jn.a, jn::a);
   public static final ju<jn> d = a("block_marker", true, jn.a, jn::a);
   public static final jy e = a("bubble", false);
   public static final jy f = a("cloud", false);
   public static final jy g = a("crit", false);
   public static final jy h = a("damage_indicator", true);
   public static final jy i = a("dragon_breath", false);
   public static final jy j = a("dripping_lava", false);
   public static final jy k = a("falling_lava", false);
   public static final jy l = a("landing_lava", false);
   public static final jy m = a("dripping_water", false);
   public static final jy n = a("falling_water", false);
   public static final ju<jp> o = a("dust", false, jp.d, $$0 -> jp.c);
   public static final ju<jo> p = a("dust_color_transition", false, jo.d, $$0 -> jo.c);
   public static final jy q = a("effect", false);
   public static final jy r = a("elder_guardian", true);
   public static final jy s = a("enchanted_hit", false);
   public static final jy t = a("enchant", false);
   public static final jy u = a("end_rod", false);
   public static final jy v = a("entity_effect", false);
   public static final jy w = a("explosion_emitter", true);
   public static final jy x = a("explosion", true);
   public static final jy y = a("gust", true);
   public static final jy z = a("gust_emitter", true);
   public static final jy A = a("sonic_boom", true);
   public static final ju<jn> B = a("falling_dust", false, jn.a, jn::a);
   public static final jy C = a("firework", false);
   public static final jy D = a("fishing", false);
   public static final jy E = a("flame", false);
   public static final jy F = a("cherry_leaves", false);
   public static final jy G = a("sculk_soul", false);
   public static final ju<jw> H = a("sculk_charge", true, jw.b, $$0 -> jw.a);
   public static final jy I = a("sculk_charge_pop", true);
   public static final jy J = a("soul_fire_flame", false);
   public static final jy K = a("soul", false);
   public static final jy L = a("flash", false);
   public static final jy M = a("happy_villager", false);
   public static final jy N = a("composter", false);
   public static final jy O = a("heart", false);
   public static final jy P = a("instant_effect", false);
   public static final ju<jr> Q = a("item", false, jr.a, jr::a);
   public static final ju<jz> R = a("vibration", true, jz.b, $$0 -> jz.a);
   public static final jy S = a("item_slime", false);
   public static final jy T = a("item_snowball", false);
   public static final jy U = a("large_smoke", false);
   public static final jy V = a("lava", false);
   public static final jy W = a("mycelium", false);
   public static final jy X = a("note", false);
   public static final jy Y = a("poof", true);
   public static final jy Z = a("portal", false);
   public static final jy aa = a("rain", false);
   public static final jy ab = a("smoke", false);
   public static final jy ac = a("white_smoke", false);
   public static final jy ad = a("sneeze", false);
   public static final jy ae = a("spit", true);
   public static final jy af = a("squid_ink", true);
   public static final jy ag = a("sweep_attack", true);
   public static final jy ah = a("totem_of_undying", false);
   public static final jy ai = a("underwater", false);
   public static final jy aj = a("splash", false);
   public static final jy ak = a("witch", false);
   public static final jy al = a("bubble_pop", false);
   public static final jy am = a("current_down", false);
   public static final jy an = a("bubble_column_up", false);
   public static final jy ao = a("nautilus", false);
   public static final jy ap = a("dolphin", false);
   public static final jy aq = a("campfire_cosy_smoke", true);
   public static final jy ar = a("campfire_signal_smoke", true);
   public static final jy as = a("dripping_honey", false);
   public static final jy at = a("falling_honey", false);
   public static final jy au = a("landing_honey", false);
   public static final jy av = a("falling_nectar", false);
   public static final jy aw = a("falling_spore_blossom", false);
   public static final jy ax = a("ash", false);
   public static final jy ay = a("crimson_spore", false);
   public static final jy az = a("warped_spore", false);
   public static final jy aA = a("spore_blossom_air", false);
   public static final jy aB = a("dripping_obsidian_tear", false);
   public static final jy aC = a("falling_obsidian_tear", false);
   public static final jy aD = a("landing_obsidian_tear", false);
   public static final jy aE = a("reverse_portal", false);
   public static final jy aF = a("white_ash", false);
   public static final jy aG = a("small_flame", false);
   public static final jy aH = a("snowflake", false);
   public static final jy aI = a("dripping_dripstone_lava", false);
   public static final jy aJ = a("falling_dripstone_lava", false);
   public static final jy aK = a("dripping_dripstone_water", false);
   public static final jy aL = a("falling_dripstone_water", false);
   public static final jy aM = a("glow_squid_ink", true);
   public static final jy aN = a("glow", true);
   public static final jy aO = a("wax_on", true);
   public static final jy aP = a("wax_off", true);
   public static final jy aQ = a("electric_spark", true);
   public static final jy aR = a("scrape", true);
   public static final ju<jx> aS = a("shriek", false, jx.b, $$0 -> jx.a);
   public static final jy aT = a("egg_crack", false);
   public static final jy aU = a("dust_plume", false);
   public static final jy aV = a("gust_dust", false);
   public static final jy aW = a("trial_spawner_detection", true);
   public static final Codec<jt> aX = kb.j.q().dispatch("type", jt::b, ju::e);

   private static jy a(String $$0, boolean $$1) {
      return ir.a(kb.j, $$0, new jy($$1));
   }

   private static <T extends jt> ju<T> a(String $$0, boolean $$1, jt.a<T> $$2, final Function<ju<T>, Codec<T>> $$3) {
      return ir.a(kb.j, $$0, new ju<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
