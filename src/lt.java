import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lt {
   public static final lx a = a("angry_villager", false);
   public static final ls<ll> b = a("block", false, ll::a, ll::b);
   public static final ls<ll> c = a("block_marker", true, ll::a, ll::b);
   public static final lx d = a("bubble", false);
   public static final lx e = a("cloud", false);
   public static final lx f = a("crit", false);
   public static final lx g = a("damage_indicator", true);
   public static final lx h = a("dragon_breath", false);
   public static final lx i = a("dripping_lava", false);
   public static final lx j = a("falling_lava", false);
   public static final lx k = a("landing_lava", false);
   public static final lx l = a("dripping_water", false);
   public static final lx m = a("falling_water", false);
   public static final ls<lo> n = a("dust", false, $$0 -> lo.c, $$0 -> lo.d);
   public static final ls<ln> o = a("dust_color_transition", false, $$0 -> ln.c, $$0 -> ln.d);
   public static final lx p = a("effect", false);
   public static final lx q = a("elder_guardian", true);
   public static final lx r = a("enchanted_hit", false);
   public static final lx s = a("enchant", false);
   public static final lx t = a("end_rod", false);
   public static final ls<lm> u = a("entity_effect", false, lm::a, lm::b);
   public static final lx v = a("explosion_emitter", true);
   public static final lx w = a("explosion", true);
   public static final lx x = a("gust", true);
   public static final lx y = a("small_gust", false);
   public static final lx z = a("gust_emitter_large", true);
   public static final lx A = a("gust_emitter_small", true);
   public static final lx B = a("sonic_boom", true);
   public static final ls<ll> C = a("falling_dust", false, ll::a, ll::b);
   public static final lx D = a("firework", false);
   public static final lx E = a("fishing", false);
   public static final lx F = a("flame", false);
   public static final lx G = a("infested", false);
   public static final lx H = a("cherry_leaves", false);
   public static final lx I = a("pale_oak_leaves", false);
   public static final lx J = a("sculk_soul", false);
   public static final ls<lv> K = a("sculk_charge", true, $$0 -> lv.a, $$0 -> lv.b);
   public static final lx L = a("sculk_charge_pop", true);
   public static final lx M = a("soul_fire_flame", false);
   public static final lx N = a("soul", false);
   public static final lx O = a("flash", false);
   public static final lx P = a("happy_villager", false);
   public static final lx Q = a("composter", false);
   public static final lx R = a("heart", false);
   public static final lx S = a("instant_effect", false);
   public static final ls<lp> T = a("item", false, lp::a, lp::b);
   public static final ls<lz> U = a("vibration", true, $$0 -> lz.a, $$0 -> lz.b);
   public static final ls<ly> V = a("trail", false, $$0 -> ly.a, $$0 -> ly.b);
   public static final lx W = a("item_slime", false);
   public static final lx X = a("item_cobweb", false);
   public static final lx Y = a("item_snowball", false);
   public static final lx Z = a("large_smoke", false);
   public static final lx aa = a("lava", false);
   public static final lx ab = a("mycelium", false);
   public static final lx ac = a("note", false);
   public static final lx ad = a("poof", true);
   public static final lx ae = a("portal", false);
   public static final lx af = a("rain", false);
   public static final lx ag = a("smoke", false);
   public static final lx ah = a("white_smoke", false);
   public static final lx ai = a("sneeze", false);
   public static final lx aj = a("spit", true);
   public static final lx ak = a("squid_ink", true);
   public static final lx al = a("sweep_attack", true);
   public static final lx am = a("totem_of_undying", false);
   public static final lx an = a("underwater", false);
   public static final lx ao = a("splash", false);
   public static final lx ap = a("witch", false);
   public static final lx aq = a("bubble_pop", false);
   public static final lx ar = a("current_down", false);
   public static final lx as = a("bubble_column_up", false);
   public static final lx at = a("nautilus", false);
   public static final lx au = a("dolphin", false);
   public static final lx av = a("campfire_cosy_smoke", true);
   public static final lx aw = a("campfire_signal_smoke", true);
   public static final lx ax = a("dripping_honey", false);
   public static final lx ay = a("falling_honey", false);
   public static final lx az = a("landing_honey", false);
   public static final lx aA = a("falling_nectar", false);
   public static final lx aB = a("falling_spore_blossom", false);
   public static final lx aC = a("ash", false);
   public static final lx aD = a("crimson_spore", false);
   public static final lx aE = a("warped_spore", false);
   public static final lx aF = a("spore_blossom_air", false);
   public static final lx aG = a("dripping_obsidian_tear", false);
   public static final lx aH = a("falling_obsidian_tear", false);
   public static final lx aI = a("landing_obsidian_tear", false);
   public static final lx aJ = a("reverse_portal", false);
   public static final lx aK = a("white_ash", false);
   public static final lx aL = a("small_flame", false);
   public static final lx aM = a("snowflake", false);
   public static final lx aN = a("dripping_dripstone_lava", false);
   public static final lx aO = a("falling_dripstone_lava", false);
   public static final lx aP = a("dripping_dripstone_water", false);
   public static final lx aQ = a("falling_dripstone_water", false);
   public static final lx aR = a("glow_squid_ink", true);
   public static final lx aS = a("glow", true);
   public static final lx aT = a("wax_on", true);
   public static final lx aU = a("wax_off", true);
   public static final lx aV = a("electric_spark", true);
   public static final lx aW = a("scrape", true);
   public static final ls<lw> aX = a("shriek", false, $$0 -> lw.a, $$0 -> lw.b);
   public static final lx aY = a("egg_crack", false);
   public static final lx aZ = a("dust_plume", false);
   public static final lx ba = a("trial_spawner_detection", true);
   public static final lx bb = a("trial_spawner_detection_ominous", true);
   public static final lx bc = a("vault_connection", true);
   public static final ls<ll> bd = a("dust_pillar", false, ll::a, ll::b);
   public static final lx be = a("ominous_spawning", true);
   public static final lx bf = a("raid_omen", false);
   public static final lx bg = a("trial_omen", false);
   public static final ls<ll> bh = a("block_crumble", false, ll::a, ll::b);
   public static final Codec<lr> bi = mb.i.q().dispatch("type", lr::a, ls::c);
   public static final ym<vz, lr> bj = yk.a(mc.Y).b(lr::a, ls::d);

   private static lx a(String $$0, boolean $$1) {
      return ke.a(mb.i, $$0, new lx($$1));
   }

   private static <T extends lr> ls<T> a(String $$0, boolean $$1, final Function<ls<T>, MapCodec<T>> $$2, final Function<ls<T>, ym<? super vz, T>> $$3) {
      return ke.a(mb.i, $$0, new ls<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public ym<? super vz, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
