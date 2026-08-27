import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kw {
   public static final kz a = a("angry_villager", false);
   public static final kv<kn> b = a("block", false, kn.a, kn::a, kn::b);
   public static final kv<kn> c = a("block_marker", true, kn.a, kn::a, kn::b);
   public static final kz d = a("bubble", false);
   public static final kz e = a("cloud", false);
   public static final kz f = a("crit", false);
   public static final kz g = a("damage_indicator", true);
   public static final kz h = a("dragon_breath", false);
   public static final kz i = a("dripping_lava", false);
   public static final kz j = a("falling_lava", false);
   public static final kz k = a("landing_lava", false);
   public static final kz l = a("dripping_water", false);
   public static final kz m = a("falling_water", false);
   public static final kv<kq> n = a("dust", false, kq.e, $$0 -> kq.c, $$0 -> kq.d);
   public static final kv<kp> o = a("dust_color_transition", false, kp.e, $$0 -> kp.c, $$0 -> kp.d);
   public static final kz p = a("effect", false);
   public static final kz q = a("elder_guardian", true);
   public static final kz r = a("enchanted_hit", false);
   public static final kz s = a("enchant", false);
   public static final kz t = a("end_rod", false);
   public static final kv<ko> u = a("entity_effect", false, ko.a, ko::a, ko::b);
   public static final kz v = a("explosion_emitter", true);
   public static final kz w = a("explosion", true);
   public static final kz x = a("gust", true);
   public static final kz y = a("gust_emitter_large", true);
   public static final kz z = a("gust_emitter_small", true);
   public static final kz A = a("sonic_boom", true);
   public static final kv<kn> B = a("falling_dust", false, kn.a, kn::a, kn::b);
   public static final kz C = a("firework", false);
   public static final kz D = a("fishing", false);
   public static final kz E = a("flame", false);
   public static final kz F = a("cherry_leaves", false);
   public static final kz G = a("sculk_soul", false);
   public static final kv<kx> H = a("sculk_charge", true, kx.c, $$0 -> kx.a, $$0 -> kx.b);
   public static final kz I = a("sculk_charge_pop", true);
   public static final kz J = a("soul_fire_flame", false);
   public static final kz K = a("soul", false);
   public static final kz L = a("flash", false);
   public static final kz M = a("happy_villager", false);
   public static final kz N = a("composter", false);
   public static final kz O = a("heart", false);
   public static final kz P = a("instant_effect", false);
   public static final kv<ks> Q = a("item", false, ks.a, ks::a, ks::b);
   public static final kv<la> R = a("vibration", true, la.c, $$0 -> la.a, $$0 -> la.b);
   public static final kz S = a("item_slime", false);
   public static final kz T = a("item_snowball", false);
   public static final kz U = a("large_smoke", false);
   public static final kz V = a("lava", false);
   public static final kz W = a("mycelium", false);
   public static final kz X = a("note", false);
   public static final kz Y = a("poof", true);
   public static final kz Z = a("portal", false);
   public static final kz aa = a("rain", false);
   public static final kz ab = a("smoke", false);
   public static final kz ac = a("white_smoke", false);
   public static final kz ad = a("sneeze", false);
   public static final kz ae = a("spit", true);
   public static final kz af = a("squid_ink", true);
   public static final kz ag = a("sweep_attack", true);
   public static final kz ah = a("totem_of_undying", false);
   public static final kz ai = a("underwater", false);
   public static final kz aj = a("splash", false);
   public static final kz ak = a("witch", false);
   public static final kz al = a("bubble_pop", false);
   public static final kz am = a("current_down", false);
   public static final kz an = a("bubble_column_up", false);
   public static final kz ao = a("nautilus", false);
   public static final kz ap = a("dolphin", false);
   public static final kz aq = a("campfire_cosy_smoke", true);
   public static final kz ar = a("campfire_signal_smoke", true);
   public static final kz as = a("dripping_honey", false);
   public static final kz at = a("falling_honey", false);
   public static final kz au = a("landing_honey", false);
   public static final kz av = a("falling_nectar", false);
   public static final kz aw = a("falling_spore_blossom", false);
   public static final kz ax = a("ash", false);
   public static final kz ay = a("crimson_spore", false);
   public static final kz az = a("warped_spore", false);
   public static final kz aA = a("spore_blossom_air", false);
   public static final kz aB = a("dripping_obsidian_tear", false);
   public static final kz aC = a("falling_obsidian_tear", false);
   public static final kz aD = a("landing_obsidian_tear", false);
   public static final kz aE = a("reverse_portal", false);
   public static final kz aF = a("white_ash", false);
   public static final kz aG = a("small_flame", false);
   public static final kz aH = a("snowflake", false);
   public static final kz aI = a("dripping_dripstone_lava", false);
   public static final kz aJ = a("falling_dripstone_lava", false);
   public static final kz aK = a("dripping_dripstone_water", false);
   public static final kz aL = a("falling_dripstone_water", false);
   public static final kz aM = a("glow_squid_ink", true);
   public static final kz aN = a("glow", true);
   public static final kz aO = a("wax_on", true);
   public static final kz aP = a("wax_off", true);
   public static final kz aQ = a("electric_spark", true);
   public static final kz aR = a("scrape", true);
   public static final kv<ky> aS = a("shriek", false, ky.c, $$0 -> ky.a, $$0 -> ky.b);
   public static final kz aT = a("egg_crack", false);
   public static final kz aU = a("dust_plume", false);
   public static final kz aV = a("trial_spawner_detection", true);
   public static final kz aW = a("vault_connection", true);
   public static final Codec<ku> aX = lc.j.q().dispatch("type", ku::a, kv::d);
   public static final yq<wd, ku> aY = yo.a(ld.T).b(ku::a, kv::e);

   private static kz a(String $$0, boolean $$1) {
      return ji.a(lc.j, $$0, new kz($$1));
   }

   private static <T extends ku> kv<T> a(
      String $$0, boolean $$1, ku.a<T> $$2, final Function<kv<T>, Codec<T>> $$3, final Function<kv<T>, yq<? super wd, T>> $$4
   ) {
      return ji.a(lc.j, $$0, new kv<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public yq<? super wd, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
