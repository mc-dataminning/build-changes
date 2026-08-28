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
   public static final lw I = a("pale_oak_leaves", false);
   public static final lw J = a("sculk_soul", false);
   public static final lr<lu> K = a("sculk_charge", true, $$0 -> lu.a, $$0 -> lu.b);
   public static final lw L = a("sculk_charge_pop", true);
   public static final lw M = a("soul_fire_flame", false);
   public static final lw N = a("soul", false);
   public static final lw O = a("flash", false);
   public static final lw P = a("happy_villager", false);
   public static final lw Q = a("composter", false);
   public static final lw R = a("heart", false);
   public static final lw S = a("instant_effect", false);
   public static final lr<lo> T = a("item", false, lo::a, lo::b);
   public static final lr<ly> U = a("vibration", true, $$0 -> ly.a, $$0 -> ly.b);
   public static final lr<lx> V = a("trail", false, $$0 -> lx.a, $$0 -> lx.b);
   public static final lw W = a("item_slime", false);
   public static final lw X = a("item_cobweb", false);
   public static final lw Y = a("item_snowball", false);
   public static final lw Z = a("large_smoke", false);
   public static final lw aa = a("lava", false);
   public static final lw ab = a("mycelium", false);
   public static final lw ac = a("note", false);
   public static final lw ad = a("poof", true);
   public static final lw ae = a("portal", false);
   public static final lw af = a("rain", false);
   public static final lw ag = a("smoke", false);
   public static final lw ah = a("white_smoke", false);
   public static final lw ai = a("sneeze", false);
   public static final lw aj = a("spit", true);
   public static final lw ak = a("squid_ink", true);
   public static final lw al = a("sweep_attack", true);
   public static final lw am = a("totem_of_undying", false);
   public static final lw an = a("underwater", false);
   public static final lw ao = a("splash", false);
   public static final lw ap = a("witch", false);
   public static final lw aq = a("bubble_pop", false);
   public static final lw ar = a("current_down", false);
   public static final lw as = a("bubble_column_up", false);
   public static final lw at = a("nautilus", false);
   public static final lw au = a("dolphin", false);
   public static final lw av = a("campfire_cosy_smoke", true);
   public static final lw aw = a("campfire_signal_smoke", true);
   public static final lw ax = a("dripping_honey", false);
   public static final lw ay = a("falling_honey", false);
   public static final lw az = a("landing_honey", false);
   public static final lw aA = a("falling_nectar", false);
   public static final lw aB = a("falling_spore_blossom", false);
   public static final lw aC = a("ash", false);
   public static final lw aD = a("crimson_spore", false);
   public static final lw aE = a("warped_spore", false);
   public static final lw aF = a("spore_blossom_air", false);
   public static final lw aG = a("dripping_obsidian_tear", false);
   public static final lw aH = a("falling_obsidian_tear", false);
   public static final lw aI = a("landing_obsidian_tear", false);
   public static final lw aJ = a("reverse_portal", false);
   public static final lw aK = a("white_ash", false);
   public static final lw aL = a("small_flame", false);
   public static final lw aM = a("snowflake", false);
   public static final lw aN = a("dripping_dripstone_lava", false);
   public static final lw aO = a("falling_dripstone_lava", false);
   public static final lw aP = a("dripping_dripstone_water", false);
   public static final lw aQ = a("falling_dripstone_water", false);
   public static final lw aR = a("glow_squid_ink", true);
   public static final lw aS = a("glow", true);
   public static final lw aT = a("wax_on", true);
   public static final lw aU = a("wax_off", true);
   public static final lw aV = a("electric_spark", true);
   public static final lw aW = a("scrape", true);
   public static final lr<lv> aX = a("shriek", false, $$0 -> lv.a, $$0 -> lv.b);
   public static final lw aY = a("egg_crack", false);
   public static final lw aZ = a("dust_plume", false);
   public static final lw ba = a("trial_spawner_detection", true);
   public static final lw bb = a("trial_spawner_detection_ominous", true);
   public static final lw bc = a("vault_connection", true);
   public static final lr<lk> bd = a("dust_pillar", false, lk::a, lk::b);
   public static final lw be = a("ominous_spawning", true);
   public static final lw bf = a("raid_omen", false);
   public static final lw bg = a("trial_omen", false);
   public static final lr<lk> bh = a("block_crumble", false, lk::a, lk::b);
   public static final Codec<lq> bi = ma.i.q().dispatch("type", lq::a, lr::c);
   public static final zi<wv, lq> bj = zg.a(mb.Y).b(lq::a, lr::d);

   private static lw a(String $$0, boolean $$1) {
      return kd.a(ma.i, $$0, new lw($$1));
   }

   private static <T extends lq> lr<T> a(String $$0, boolean $$1, final Function<lr<T>, MapCodec<T>> $$2, final Function<lr<T>, zi<? super wv, T>> $$3) {
      return kd.a(ma.i, $$0, new lr<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zi<? super wv, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
