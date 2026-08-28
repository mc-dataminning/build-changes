import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ls {
   public static final lw a = a("angry_villager", false);
   public static final lr<lk> b = a("block", false, lk::a, lk::b);
   public static final lr<lk> c = a("block_marker", true, lk::a, lk::b);
   public static final lw d = a("bubble", false);
   public static final lw e = a("cloud", false);
   public static final lw f = a("crit", false);
   public static final lw g = a("damage_indicator", true);
   public static final lw h = a("dragon_breath", false);
   public static final lw i = a("dripping_lava", false);
   public static final lw j = a("falling_lava", false);
   public static final lw k = a("landing_lava", false);
   public static final lw l = a("dripping_water", false);
   public static final lw m = a("falling_water", false);
   public static final lr<ln> n = a("dust", false, $$0 -> ln.c, $$0 -> ln.d);
   public static final lr<lm> o = a("dust_color_transition", false, $$0 -> lm.c, $$0 -> lm.d);
   public static final lw p = a("effect", false);
   public static final lw q = a("elder_guardian", true);
   public static final lw r = a("enchanted_hit", false);
   public static final lw s = a("enchant", false);
   public static final lw t = a("end_rod", false);
   public static final lr<ll> u = a("entity_effect", false, ll::a, ll::b);
   public static final lw v = a("explosion_emitter", true);
   public static final lw w = a("explosion", true);
   public static final lw x = a("gust", true);
   public static final lw y = a("small_gust", false);
   public static final lw z = a("gust_emitter_large", true);
   public static final lw A = a("gust_emitter_small", true);
   public static final lw B = a("sonic_boom", true);
   public static final lr<lk> C = a("falling_dust", false, lk::a, lk::b);
   public static final lw D = a("firework", false);
   public static final lw E = a("fishing", false);
   public static final lw F = a("flame", false);
   public static final lw G = a("infested", false);
   public static final lw H = a("cherry_leaves", false);
   public static final lw I = a("sculk_soul", false);
   public static final lr<lu> J = a("sculk_charge", true, $$0 -> lu.a, $$0 -> lu.b);
   public static final lw K = a("sculk_charge_pop", true);
   public static final lw L = a("soul_fire_flame", false);
   public static final lw M = a("soul", false);
   public static final lw N = a("flash", false);
   public static final lw O = a("happy_villager", false);
   public static final lw P = a("composter", false);
   public static final lw Q = a("heart", false);
   public static final lw R = a("instant_effect", false);
   public static final lr<lo> S = a("item", false, lo::a, lo::b);
   public static final lr<lx> T = a("vibration", true, $$0 -> lx.a, $$0 -> lx.b);
   public static final lw U = a("item_slime", false);
   public static final lw V = a("item_cobweb", false);
   public static final lw W = a("item_snowball", false);
   public static final lw X = a("large_smoke", false);
   public static final lw Y = a("lava", false);
   public static final lw Z = a("mycelium", false);
   public static final lw aa = a("note", false);
   public static final lw ab = a("poof", true);
   public static final lw ac = a("portal", false);
   public static final lw ad = a("rain", false);
   public static final lw ae = a("smoke", false);
   public static final lw af = a("white_smoke", false);
   public static final lw ag = a("sneeze", false);
   public static final lw ah = a("spit", true);
   public static final lw ai = a("squid_ink", true);
   public static final lw aj = a("sweep_attack", true);
   public static final lw ak = a("totem_of_undying", false);
   public static final lw al = a("underwater", false);
   public static final lw am = a("splash", false);
   public static final lw an = a("witch", false);
   public static final lw ao = a("bubble_pop", false);
   public static final lw ap = a("current_down", false);
   public static final lw aq = a("bubble_column_up", false);
   public static final lw ar = a("nautilus", false);
   public static final lw as = a("dolphin", false);
   public static final lw at = a("campfire_cosy_smoke", true);
   public static final lw au = a("campfire_signal_smoke", true);
   public static final lw av = a("dripping_honey", false);
   public static final lw aw = a("falling_honey", false);
   public static final lw ax = a("landing_honey", false);
   public static final lw ay = a("falling_nectar", false);
   public static final lw az = a("falling_spore_blossom", false);
   public static final lw aA = a("ash", false);
   public static final lw aB = a("crimson_spore", false);
   public static final lw aC = a("warped_spore", false);
   public static final lw aD = a("spore_blossom_air", false);
   public static final lw aE = a("dripping_obsidian_tear", false);
   public static final lw aF = a("falling_obsidian_tear", false);
   public static final lw aG = a("landing_obsidian_tear", false);
   public static final lw aH = a("reverse_portal", false);
   public static final lw aI = a("white_ash", false);
   public static final lw aJ = a("small_flame", false);
   public static final lw aK = a("snowflake", false);
   public static final lw aL = a("dripping_dripstone_lava", false);
   public static final lw aM = a("falling_dripstone_lava", false);
   public static final lw aN = a("dripping_dripstone_water", false);
   public static final lw aO = a("falling_dripstone_water", false);
   public static final lw aP = a("glow_squid_ink", true);
   public static final lw aQ = a("glow", true);
   public static final lw aR = a("wax_on", true);
   public static final lw aS = a("wax_off", true);
   public static final lw aT = a("electric_spark", true);
   public static final lw aU = a("scrape", true);
   public static final lr<lv> aV = a("shriek", false, $$0 -> lv.a, $$0 -> lv.b);
   public static final lw aW = a("egg_crack", false);
   public static final lw aX = a("dust_plume", false);
   public static final lw aY = a("trial_spawner_detection", true);
   public static final lw aZ = a("trial_spawner_detection_ominous", true);
   public static final lw ba = a("vault_connection", true);
   public static final lr<lk> bb = a("dust_pillar", false, lk::a, lk::b);
   public static final lw bc = a("ominous_spawning", true);
   public static final lw bd = a("raid_omen", false);
   public static final lw be = a("trial_omen", false);
   public static final Codec<lq> bf = lz.i.q().dispatch("type", lq::a, lr::c);
   public static final zh<wu, lq> bg = zf.a(ma.Y).b(lq::a, lr::d);

   private static lw a(String $$0, boolean $$1) {
      return kd.a(lz.i, $$0, new lw($$1));
   }

   private static <T extends lq> lr<T> a(String $$0, boolean $$1, final Function<lr<T>, MapCodec<T>> $$2, final Function<lr<T>, zh<? super wu, T>> $$3) {
      return kd.a(lz.i, $$0, new lr<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zh<? super wu, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
