import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lr {
   public static final lv a = a("angry_villager", false);
   public static final lq<lj> b = a("block", false, lj::a, lj::b);
   public static final lq<lj> c = a("block_marker", true, lj::a, lj::b);
   public static final lv d = a("bubble", false);
   public static final lv e = a("cloud", false);
   public static final lv f = a("crit", false);
   public static final lv g = a("damage_indicator", true);
   public static final lv h = a("dragon_breath", false);
   public static final lv i = a("dripping_lava", false);
   public static final lv j = a("falling_lava", false);
   public static final lv k = a("landing_lava", false);
   public static final lv l = a("dripping_water", false);
   public static final lv m = a("falling_water", false);
   public static final lq<lm> n = a("dust", false, $$0 -> lm.c, $$0 -> lm.d);
   public static final lq<ll> o = a("dust_color_transition", false, $$0 -> ll.c, $$0 -> ll.d);
   public static final lv p = a("effect", false);
   public static final lv q = a("elder_guardian", true);
   public static final lv r = a("enchanted_hit", false);
   public static final lv s = a("enchant", false);
   public static final lv t = a("end_rod", false);
   public static final lq<lk> u = a("entity_effect", false, lk::a, lk::b);
   public static final lv v = a("explosion_emitter", true);
   public static final lv w = a("explosion", true);
   public static final lv x = a("gust", true);
   public static final lv y = a("small_gust", false);
   public static final lv z = a("gust_emitter_large", true);
   public static final lv A = a("gust_emitter_small", true);
   public static final lv B = a("sonic_boom", true);
   public static final lq<lj> C = a("falling_dust", false, lj::a, lj::b);
   public static final lv D = a("firework", false);
   public static final lv E = a("fishing", false);
   public static final lv F = a("flame", false);
   public static final lv G = a("infested", false);
   public static final lv H = a("cherry_leaves", false);
   public static final lv I = a("sculk_soul", false);
   public static final lq<lt> J = a("sculk_charge", true, $$0 -> lt.a, $$0 -> lt.b);
   public static final lv K = a("sculk_charge_pop", true);
   public static final lv L = a("soul_fire_flame", false);
   public static final lv M = a("soul", false);
   public static final lv N = a("flash", false);
   public static final lv O = a("happy_villager", false);
   public static final lv P = a("composter", false);
   public static final lv Q = a("heart", false);
   public static final lv R = a("instant_effect", false);
   public static final lq<ln> S = a("item", false, ln::a, ln::b);
   public static final lq<lw> T = a("vibration", true, $$0 -> lw.a, $$0 -> lw.b);
   public static final lv U = a("item_slime", false);
   public static final lv V = a("item_cobweb", false);
   public static final lv W = a("item_snowball", false);
   public static final lv X = a("large_smoke", false);
   public static final lv Y = a("lava", false);
   public static final lv Z = a("mycelium", false);
   public static final lv aa = a("note", false);
   public static final lv ab = a("poof", true);
   public static final lv ac = a("portal", false);
   public static final lv ad = a("rain", false);
   public static final lv ae = a("smoke", false);
   public static final lv af = a("white_smoke", false);
   public static final lv ag = a("sneeze", false);
   public static final lv ah = a("spit", true);
   public static final lv ai = a("squid_ink", true);
   public static final lv aj = a("sweep_attack", true);
   public static final lv ak = a("totem_of_undying", false);
   public static final lv al = a("underwater", false);
   public static final lv am = a("splash", false);
   public static final lv an = a("witch", false);
   public static final lv ao = a("bubble_pop", false);
   public static final lv ap = a("current_down", false);
   public static final lv aq = a("bubble_column_up", false);
   public static final lv ar = a("nautilus", false);
   public static final lv as = a("dolphin", false);
   public static final lv at = a("campfire_cosy_smoke", true);
   public static final lv au = a("campfire_signal_smoke", true);
   public static final lv av = a("dripping_honey", false);
   public static final lv aw = a("falling_honey", false);
   public static final lv ax = a("landing_honey", false);
   public static final lv ay = a("falling_nectar", false);
   public static final lv az = a("falling_spore_blossom", false);
   public static final lv aA = a("ash", false);
   public static final lv aB = a("crimson_spore", false);
   public static final lv aC = a("warped_spore", false);
   public static final lv aD = a("spore_blossom_air", false);
   public static final lv aE = a("dripping_obsidian_tear", false);
   public static final lv aF = a("falling_obsidian_tear", false);
   public static final lv aG = a("landing_obsidian_tear", false);
   public static final lv aH = a("reverse_portal", false);
   public static final lv aI = a("white_ash", false);
   public static final lv aJ = a("small_flame", false);
   public static final lv aK = a("snowflake", false);
   public static final lv aL = a("dripping_dripstone_lava", false);
   public static final lv aM = a("falling_dripstone_lava", false);
   public static final lv aN = a("dripping_dripstone_water", false);
   public static final lv aO = a("falling_dripstone_water", false);
   public static final lv aP = a("glow_squid_ink", true);
   public static final lv aQ = a("glow", true);
   public static final lv aR = a("wax_on", true);
   public static final lv aS = a("wax_off", true);
   public static final lv aT = a("electric_spark", true);
   public static final lv aU = a("scrape", true);
   public static final lq<lu> aV = a("shriek", false, $$0 -> lu.a, $$0 -> lu.b);
   public static final lv aW = a("egg_crack", false);
   public static final lv aX = a("dust_plume", false);
   public static final lv aY = a("trial_spawner_detection", true);
   public static final lv aZ = a("trial_spawner_detection_ominous", true);
   public static final lv ba = a("vault_connection", true);
   public static final lq<lj> bb = a("dust_pillar", false, lj::a, lj::b);
   public static final lv bc = a("ominous_spawning", true);
   public static final lv bd = a("raid_omen", false);
   public static final lv be = a("trial_omen", false);
   public static final Codec<lp> bf = ly.i.q().dispatch("type", lp::a, lq::c);
   public static final zg<wt, lp> bg = ze.a(lz.Y).b(lp::a, lq::d);

   private static lv a(String $$0, boolean $$1) {
      return kd.a(ly.i, $$0, new lv($$1));
   }

   private static <T extends lp> lq<T> a(String $$0, boolean $$1, final Function<lq<T>, MapCodec<T>> $$2, final Function<lq<T>, zg<? super wt, T>> $$3) {
      return kd.a(ly.i, $$0, new lq<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zg<? super wt, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
