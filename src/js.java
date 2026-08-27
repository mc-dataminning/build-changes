import com.mojang.serialization.Codec;
import java.util.function.Function;

public class js {
   public static final jv a = a("ambient_entity_effect", false);
   public static final jv b = a("angry_villager", false);
   public static final jr<jk> c = a("block", false, jk.a, jk::a);
   public static final jr<jk> d = a("block_marker", true, jk.a, jk::a);
   public static final jv e = a("bubble", false);
   public static final jv f = a("cloud", false);
   public static final jv g = a("crit", false);
   public static final jv h = a("damage_indicator", true);
   public static final jv i = a("dragon_breath", false);
   public static final jv j = a("dripping_lava", false);
   public static final jv k = a("falling_lava", false);
   public static final jv l = a("landing_lava", false);
   public static final jv m = a("dripping_water", false);
   public static final jv n = a("falling_water", false);
   public static final jr<jm> o = a("dust", false, jm.d, $$0 -> jm.c);
   public static final jr<jl> p = a("dust_color_transition", false, jl.d, $$0 -> jl.c);
   public static final jv q = a("effect", false);
   public static final jv r = a("elder_guardian", true);
   public static final jv s = a("enchanted_hit", false);
   public static final jv t = a("enchant", false);
   public static final jv u = a("end_rod", false);
   public static final jv v = a("entity_effect", false);
   public static final jv w = a("explosion_emitter", true);
   public static final jv x = a("explosion", true);
   public static final jv y = a("sonic_boom", true);
   public static final jr<jk> z = a("falling_dust", false, jk.a, jk::a);
   public static final jv A = a("firework", false);
   public static final jv B = a("fishing", false);
   public static final jv C = a("flame", false);
   public static final jv D = a("cherry_leaves", false);
   public static final jv E = a("sculk_soul", false);
   public static final jr<jt> F = a("sculk_charge", true, jt.b, $$0 -> jt.a);
   public static final jv G = a("sculk_charge_pop", true);
   public static final jv H = a("soul_fire_flame", false);
   public static final jv I = a("soul", false);
   public static final jv J = a("flash", false);
   public static final jv K = a("happy_villager", false);
   public static final jv L = a("composter", false);
   public static final jv M = a("heart", false);
   public static final jv N = a("instant_effect", false);
   public static final jr<jo> O = a("item", false, jo.a, jo::a);
   public static final jr<jw> P = a("vibration", true, jw.b, $$0 -> jw.a);
   public static final jv Q = a("item_slime", false);
   public static final jv R = a("item_snowball", false);
   public static final jv S = a("large_smoke", false);
   public static final jv T = a("lava", false);
   public static final jv U = a("mycelium", false);
   public static final jv V = a("note", false);
   public static final jv W = a("poof", true);
   public static final jv X = a("portal", false);
   public static final jv Y = a("rain", false);
   public static final jv Z = a("smoke", false);
   public static final jv aa = a("sneeze", false);
   public static final jv ab = a("spit", true);
   public static final jv ac = a("squid_ink", true);
   public static final jv ad = a("sweep_attack", true);
   public static final jv ae = a("totem_of_undying", false);
   public static final jv af = a("underwater", false);
   public static final jv ag = a("splash", false);
   public static final jv ah = a("witch", false);
   public static final jv ai = a("bubble_pop", false);
   public static final jv aj = a("current_down", false);
   public static final jv ak = a("bubble_column_up", false);
   public static final jv al = a("nautilus", false);
   public static final jv am = a("dolphin", false);
   public static final jv an = a("campfire_cosy_smoke", true);
   public static final jv ao = a("campfire_signal_smoke", true);
   public static final jv ap = a("dripping_honey", false);
   public static final jv aq = a("falling_honey", false);
   public static final jv ar = a("landing_honey", false);
   public static final jv as = a("falling_nectar", false);
   public static final jv at = a("falling_spore_blossom", false);
   public static final jv au = a("ash", false);
   public static final jv av = a("crimson_spore", false);
   public static final jv aw = a("warped_spore", false);
   public static final jv ax = a("spore_blossom_air", false);
   public static final jv ay = a("dripping_obsidian_tear", false);
   public static final jv az = a("falling_obsidian_tear", false);
   public static final jv aA = a("landing_obsidian_tear", false);
   public static final jv aB = a("reverse_portal", false);
   public static final jv aC = a("white_ash", false);
   public static final jv aD = a("small_flame", false);
   public static final jv aE = a("snowflake", false);
   public static final jv aF = a("dripping_dripstone_lava", false);
   public static final jv aG = a("falling_dripstone_lava", false);
   public static final jv aH = a("dripping_dripstone_water", false);
   public static final jv aI = a("falling_dripstone_water", false);
   public static final jv aJ = a("glow_squid_ink", true);
   public static final jv aK = a("glow", true);
   public static final jv aL = a("wax_on", true);
   public static final jv aM = a("wax_off", true);
   public static final jv aN = a("electric_spark", true);
   public static final jv aO = a("scrape", true);
   public static final jr<ju> aP = a("shriek", false, ju.b, $$0 -> ju.a);
   public static final jv aQ = a("egg_crack", false);
   public static final jv aR = a("dust_plume", false);
   public static final Codec<jq> aS = jy.k.q().dispatch("type", jq::b, jr::e);

   private static jv a(String $$0, boolean $$1) {
      return io.a(jy.k, $$0, new jv($$1));
   }

   private static <T extends jq> jr<T> a(String $$0, boolean $$1, jq.a<T> $$2, final Function<jr<T>, Codec<T>> $$3) {
      return io.a(jy.k, $$0, new jr<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return $$3.apply(this);
         }
      });
   }
}
