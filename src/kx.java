import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kx {
   public static final la a = a("angry_villager", false);
   public static final kw<ko> b = a("block", false, ko.a, ko::a, ko::b);
   public static final kw<ko> c = a("block_marker", true, ko.a, ko::a, ko::b);
   public static final la d = a("bubble", false);
   public static final la e = a("cloud", false);
   public static final la f = a("crit", false);
   public static final la g = a("damage_indicator", true);
   public static final la h = a("dragon_breath", false);
   public static final la i = a("dripping_lava", false);
   public static final la j = a("falling_lava", false);
   public static final la k = a("landing_lava", false);
   public static final la l = a("dripping_water", false);
   public static final la m = a("falling_water", false);
   public static final kw<kr> n = a("dust", false, kr.e, $$0 -> kr.c, $$0 -> kr.d);
   public static final kw<kq> o = a("dust_color_transition", false, kq.e, $$0 -> kq.c, $$0 -> kq.d);
   public static final la p = a("effect", false);
   public static final la q = a("elder_guardian", true);
   public static final la r = a("enchanted_hit", false);
   public static final la s = a("enchant", false);
   public static final la t = a("end_rod", false);
   public static final kw<kp> u = a("entity_effect", false, kp.a, kp::a, kp::b);
   public static final la v = a("explosion_emitter", true);
   public static final la w = a("explosion", true);
   public static final la x = a("gust", true);
   public static final la y = a("gust_emitter_large", true);
   public static final la z = a("gust_emitter_small", true);
   public static final la A = a("sonic_boom", true);
   public static final kw<ko> B = a("falling_dust", false, ko.a, ko::a, ko::b);
   public static final la C = a("firework", false);
   public static final la D = a("fishing", false);
   public static final la E = a("flame", false);
   public static final la F = a("cherry_leaves", false);
   public static final la G = a("sculk_soul", false);
   public static final kw<ky> H = a("sculk_charge", true, ky.c, $$0 -> ky.a, $$0 -> ky.b);
   public static final la I = a("sculk_charge_pop", true);
   public static final la J = a("soul_fire_flame", false);
   public static final la K = a("soul", false);
   public static final la L = a("flash", false);
   public static final la M = a("happy_villager", false);
   public static final la N = a("composter", false);
   public static final la O = a("heart", false);
   public static final la P = a("instant_effect", false);
   public static final kw<kt> Q = a("item", false, kt.a, kt::a, kt::b);
   public static final kw<lb> R = a("vibration", true, lb.c, $$0 -> lb.a, $$0 -> lb.b);
   public static final la S = a("item_slime", false);
   public static final la T = a("item_snowball", false);
   public static final la U = a("large_smoke", false);
   public static final la V = a("lava", false);
   public static final la W = a("mycelium", false);
   public static final la X = a("note", false);
   public static final la Y = a("poof", true);
   public static final la Z = a("portal", false);
   public static final la aa = a("rain", false);
   public static final la ab = a("smoke", false);
   public static final la ac = a("white_smoke", false);
   public static final la ad = a("sneeze", false);
   public static final la ae = a("spit", true);
   public static final la af = a("squid_ink", true);
   public static final la ag = a("sweep_attack", true);
   public static final la ah = a("totem_of_undying", false);
   public static final la ai = a("underwater", false);
   public static final la aj = a("splash", false);
   public static final la ak = a("witch", false);
   public static final la al = a("bubble_pop", false);
   public static final la am = a("current_down", false);
   public static final la an = a("bubble_column_up", false);
   public static final la ao = a("nautilus", false);
   public static final la ap = a("dolphin", false);
   public static final la aq = a("campfire_cosy_smoke", true);
   public static final la ar = a("campfire_signal_smoke", true);
   public static final la as = a("dripping_honey", false);
   public static final la at = a("falling_honey", false);
   public static final la au = a("landing_honey", false);
   public static final la av = a("falling_nectar", false);
   public static final la aw = a("falling_spore_blossom", false);
   public static final la ax = a("ash", false);
   public static final la ay = a("crimson_spore", false);
   public static final la az = a("warped_spore", false);
   public static final la aA = a("spore_blossom_air", false);
   public static final la aB = a("dripping_obsidian_tear", false);
   public static final la aC = a("falling_obsidian_tear", false);
   public static final la aD = a("landing_obsidian_tear", false);
   public static final la aE = a("reverse_portal", false);
   public static final la aF = a("white_ash", false);
   public static final la aG = a("small_flame", false);
   public static final la aH = a("snowflake", false);
   public static final la aI = a("dripping_dripstone_lava", false);
   public static final la aJ = a("falling_dripstone_lava", false);
   public static final la aK = a("dripping_dripstone_water", false);
   public static final la aL = a("falling_dripstone_water", false);
   public static final la aM = a("glow_squid_ink", true);
   public static final la aN = a("glow", true);
   public static final la aO = a("wax_on", true);
   public static final la aP = a("wax_off", true);
   public static final la aQ = a("electric_spark", true);
   public static final la aR = a("scrape", true);
   public static final kw<kz> aS = a("shriek", false, kz.c, $$0 -> kz.a, $$0 -> kz.b);
   public static final la aT = a("egg_crack", false);
   public static final la aU = a("dust_plume", false);
   public static final la aV = a("trial_spawner_detection", true);
   public static final la aW = a("vault_connection", true);
   public static final Codec<kv> aX = ld.j.q().dispatch("type", kv::a, kw::d);
   public static final ys<wf, kv> aY = yq.a(le.T).b(kv::a, kw::e);

   private static la a(String $$0, boolean $$1) {
      return jj.a(ld.j, $$0, new la($$1));
   }

   private static <T extends kv> kw<T> a(
      String $$0, boolean $$1, kv.a<T> $$2, final Function<kw<T>, Codec<T>> $$3, final Function<kw<T>, ys<? super wf, T>> $$4
   ) {
      return jj.a(ld.j, $$0, new kw<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public ys<? super wf, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
