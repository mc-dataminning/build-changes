import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ky {
   public static final lb a = a("angry_villager", false);
   public static final kx<kp> b = a("block", false, kp.a, kp::a, kp::b);
   public static final kx<kp> c = a("block_marker", true, kp.a, kp::a, kp::b);
   public static final lb d = a("bubble", false);
   public static final lb e = a("cloud", false);
   public static final lb f = a("crit", false);
   public static final lb g = a("damage_indicator", true);
   public static final lb h = a("dragon_breath", false);
   public static final lb i = a("dripping_lava", false);
   public static final lb j = a("falling_lava", false);
   public static final lb k = a("landing_lava", false);
   public static final lb l = a("dripping_water", false);
   public static final lb m = a("falling_water", false);
   public static final kx<ks> n = a("dust", false, ks.e, $$0 -> ks.c, $$0 -> ks.d);
   public static final kx<kr> o = a("dust_color_transition", false, kr.e, $$0 -> kr.c, $$0 -> kr.d);
   public static final lb p = a("effect", false);
   public static final lb q = a("elder_guardian", true);
   public static final lb r = a("enchanted_hit", false);
   public static final lb s = a("enchant", false);
   public static final lb t = a("end_rod", false);
   public static final kx<kq> u = a("entity_effect", false, kq.a, kq::a, kq::b);
   public static final lb v = a("explosion_emitter", true);
   public static final lb w = a("explosion", true);
   public static final lb x = a("gust", true);
   public static final lb y = a("small_gust", false);
   public static final lb z = a("gust_emitter_large", true);
   public static final lb A = a("gust_emitter_small", true);
   public static final lb B = a("sonic_boom", true);
   public static final kx<kp> C = a("falling_dust", false, kp.a, kp::a, kp::b);
   public static final lb D = a("firework", false);
   public static final lb E = a("fishing", false);
   public static final lb F = a("flame", false);
   public static final lb G = a("infested", false);
   public static final lb H = a("cherry_leaves", false);
   public static final lb I = a("sculk_soul", false);
   public static final kx<kz> J = a("sculk_charge", true, kz.c, $$0 -> kz.a, $$0 -> kz.b);
   public static final lb K = a("sculk_charge_pop", true);
   public static final lb L = a("soul_fire_flame", false);
   public static final lb M = a("soul", false);
   public static final lb N = a("flash", false);
   public static final lb O = a("happy_villager", false);
   public static final lb P = a("composter", false);
   public static final lb Q = a("heart", false);
   public static final lb R = a("instant_effect", false);
   public static final kx<ku> S = a("item", false, ku.a, ku::a, ku::b);
   public static final kx<lc> T = a("vibration", true, lc.c, $$0 -> lc.a, $$0 -> lc.b);
   public static final lb U = a("item_slime", false);
   public static final lb V = a("item_cobweb", false);
   public static final lb W = a("item_snowball", false);
   public static final lb X = a("large_smoke", false);
   public static final lb Y = a("lava", false);
   public static final lb Z = a("mycelium", false);
   public static final lb aa = a("note", false);
   public static final lb ab = a("poof", true);
   public static final lb ac = a("portal", false);
   public static final lb ad = a("rain", false);
   public static final lb ae = a("smoke", false);
   public static final lb af = a("white_smoke", false);
   public static final lb ag = a("sneeze", false);
   public static final lb ah = a("spit", true);
   public static final lb ai = a("squid_ink", true);
   public static final lb aj = a("sweep_attack", true);
   public static final lb ak = a("totem_of_undying", false);
   public static final lb al = a("underwater", false);
   public static final lb am = a("splash", false);
   public static final lb an = a("witch", false);
   public static final lb ao = a("bubble_pop", false);
   public static final lb ap = a("current_down", false);
   public static final lb aq = a("bubble_column_up", false);
   public static final lb ar = a("nautilus", false);
   public static final lb as = a("dolphin", false);
   public static final lb at = a("campfire_cosy_smoke", true);
   public static final lb au = a("campfire_signal_smoke", true);
   public static final lb av = a("dripping_honey", false);
   public static final lb aw = a("falling_honey", false);
   public static final lb ax = a("landing_honey", false);
   public static final lb ay = a("falling_nectar", false);
   public static final lb az = a("falling_spore_blossom", false);
   public static final lb aA = a("ash", false);
   public static final lb aB = a("crimson_spore", false);
   public static final lb aC = a("warped_spore", false);
   public static final lb aD = a("spore_blossom_air", false);
   public static final lb aE = a("dripping_obsidian_tear", false);
   public static final lb aF = a("falling_obsidian_tear", false);
   public static final lb aG = a("landing_obsidian_tear", false);
   public static final lb aH = a("reverse_portal", false);
   public static final lb aI = a("white_ash", false);
   public static final lb aJ = a("small_flame", false);
   public static final lb aK = a("snowflake", false);
   public static final lb aL = a("dripping_dripstone_lava", false);
   public static final lb aM = a("falling_dripstone_lava", false);
   public static final lb aN = a("dripping_dripstone_water", false);
   public static final lb aO = a("falling_dripstone_water", false);
   public static final lb aP = a("glow_squid_ink", true);
   public static final lb aQ = a("glow", true);
   public static final lb aR = a("wax_on", true);
   public static final lb aS = a("wax_off", true);
   public static final lb aT = a("electric_spark", true);
   public static final lb aU = a("scrape", true);
   public static final kx<la> aV = a("shriek", false, la.c, $$0 -> la.a, $$0 -> la.b);
   public static final lb aW = a("egg_crack", false);
   public static final lb aX = a("dust_plume", false);
   public static final lb aY = a("trial_spawner_detection", true);
   public static final lb aZ = a("trial_spawner_detection_ominous", true);
   public static final lb ba = a("vault_connection", true);
   public static final kx<kp> bb = a("dust_pillar", true, kp.a, kp::a, kp::b);
   public static final lb bc = a("ominous_spawning", true);
   public static final lb bd = a("raid_omen", false);
   public static final lb be = a("trial_omen", false);
   public static final Codec<kw> bf = le.j.q().dispatch("type", kw::a, kx::d);
   public static final yv<wi, kw> bg = yt.a(lf.T).b(kw::a, kx::e);

   private static lb a(String $$0, boolean $$1) {
      return jk.a(le.j, $$0, new lb($$1));
   }

   private static <T extends kw> kx<T> a(
      String $$0, boolean $$1, kw.a<T> $$2, final Function<kx<T>, MapCodec<T>> $$3, final Function<kx<T>, yv<? super wi, T>> $$4
   ) {
      return jk.a(le.j, $$0, new kx<T>($$1, $$2) {
         @Override
         public MapCodec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public yv<? super wi, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
