import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ln {
   public static final lr a = a("angry_villager", false);
   public static final lm<lf> b = a("block", false, lf::a, lf::b);
   public static final lm<lf> c = a("block_marker", true, lf::a, lf::b);
   public static final lr d = a("bubble", false);
   public static final lr e = a("cloud", false);
   public static final lr f = a("crit", false);
   public static final lr g = a("damage_indicator", true);
   public static final lr h = a("dragon_breath", false);
   public static final lr i = a("dripping_lava", false);
   public static final lr j = a("falling_lava", false);
   public static final lr k = a("landing_lava", false);
   public static final lr l = a("dripping_water", false);
   public static final lr m = a("falling_water", false);
   public static final lm<li> n = a("dust", false, $$0 -> li.c, $$0 -> li.d);
   public static final lm<lh> o = a("dust_color_transition", false, $$0 -> lh.c, $$0 -> lh.d);
   public static final lr p = a("effect", false);
   public static final lr q = a("elder_guardian", true);
   public static final lr r = a("enchanted_hit", false);
   public static final lr s = a("enchant", false);
   public static final lr t = a("end_rod", false);
   public static final lm<lg> u = a("entity_effect", false, lg::a, lg::b);
   public static final lr v = a("explosion_emitter", true);
   public static final lr w = a("explosion", true);
   public static final lr x = a("gust", true);
   public static final lr y = a("small_gust", false);
   public static final lr z = a("gust_emitter_large", true);
   public static final lr A = a("gust_emitter_small", true);
   public static final lr B = a("sonic_boom", true);
   public static final lm<lf> C = a("falling_dust", false, lf::a, lf::b);
   public static final lr D = a("firework", false);
   public static final lr E = a("fishing", false);
   public static final lr F = a("flame", false);
   public static final lr G = a("infested", false);
   public static final lr H = a("cherry_leaves", false);
   public static final lr I = a("sculk_soul", false);
   public static final lm<lp> J = a("sculk_charge", true, $$0 -> lp.a, $$0 -> lp.b);
   public static final lr K = a("sculk_charge_pop", true);
   public static final lr L = a("soul_fire_flame", false);
   public static final lr M = a("soul", false);
   public static final lr N = a("flash", false);
   public static final lr O = a("happy_villager", false);
   public static final lr P = a("composter", false);
   public static final lr Q = a("heart", false);
   public static final lr R = a("instant_effect", false);
   public static final lm<lj> S = a("item", false, lj::a, lj::b);
   public static final lm<ls> T = a("vibration", true, $$0 -> ls.a, $$0 -> ls.b);
   public static final lr U = a("item_slime", false);
   public static final lr V = a("item_cobweb", false);
   public static final lr W = a("item_snowball", false);
   public static final lr X = a("large_smoke", false);
   public static final lr Y = a("lava", false);
   public static final lr Z = a("mycelium", false);
   public static final lr aa = a("note", false);
   public static final lr ab = a("poof", true);
   public static final lr ac = a("portal", false);
   public static final lr ad = a("rain", false);
   public static final lr ae = a("smoke", false);
   public static final lr af = a("white_smoke", false);
   public static final lr ag = a("sneeze", false);
   public static final lr ah = a("spit", true);
   public static final lr ai = a("squid_ink", true);
   public static final lr aj = a("sweep_attack", true);
   public static final lr ak = a("totem_of_undying", false);
   public static final lr al = a("underwater", false);
   public static final lr am = a("splash", false);
   public static final lr an = a("witch", false);
   public static final lr ao = a("bubble_pop", false);
   public static final lr ap = a("current_down", false);
   public static final lr aq = a("bubble_column_up", false);
   public static final lr ar = a("nautilus", false);
   public static final lr as = a("dolphin", false);
   public static final lr at = a("campfire_cosy_smoke", true);
   public static final lr au = a("campfire_signal_smoke", true);
   public static final lr av = a("dripping_honey", false);
   public static final lr aw = a("falling_honey", false);
   public static final lr ax = a("landing_honey", false);
   public static final lr ay = a("falling_nectar", false);
   public static final lr az = a("falling_spore_blossom", false);
   public static final lr aA = a("ash", false);
   public static final lr aB = a("crimson_spore", false);
   public static final lr aC = a("warped_spore", false);
   public static final lr aD = a("spore_blossom_air", false);
   public static final lr aE = a("dripping_obsidian_tear", false);
   public static final lr aF = a("falling_obsidian_tear", false);
   public static final lr aG = a("landing_obsidian_tear", false);
   public static final lr aH = a("reverse_portal", false);
   public static final lr aI = a("white_ash", false);
   public static final lr aJ = a("small_flame", false);
   public static final lr aK = a("snowflake", false);
   public static final lr aL = a("dripping_dripstone_lava", false);
   public static final lr aM = a("falling_dripstone_lava", false);
   public static final lr aN = a("dripping_dripstone_water", false);
   public static final lr aO = a("falling_dripstone_water", false);
   public static final lr aP = a("glow_squid_ink", true);
   public static final lr aQ = a("glow", true);
   public static final lr aR = a("wax_on", true);
   public static final lr aS = a("wax_off", true);
   public static final lr aT = a("electric_spark", true);
   public static final lr aU = a("scrape", true);
   public static final lm<lq> aV = a("shriek", false, $$0 -> lq.a, $$0 -> lq.b);
   public static final lr aW = a("egg_crack", false);
   public static final lr aX = a("dust_plume", false);
   public static final lr aY = a("trial_spawner_detection", true);
   public static final lr aZ = a("trial_spawner_detection_ominous", true);
   public static final lr ba = a("vault_connection", true);
   public static final lm<lf> bb = a("dust_pillar", false, lf::a, lf::b);
   public static final lr bc = a("ominous_spawning", true);
   public static final lr bd = a("raid_omen", false);
   public static final lr be = a("trial_omen", false);
   public static final Codec<ll> bf = lu.i.q().dispatch("type", ll::a, lm::c);
   public static final zb<wo, ll> bg = yz.a(lv.Y).b(ll::a, lm::d);

   private static lr a(String $$0, boolean $$1) {
      return ka.a(lu.i, $$0, new lr($$1));
   }

   private static <T extends ll> lm<T> a(String $$0, boolean $$1, final Function<lm<T>, MapCodec<T>> $$2, final Function<lm<T>, zb<? super wo, T>> $$3) {
      return ka.a(lu.i, $$0, new lm<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zb<? super wo, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
