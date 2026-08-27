import com.mojang.serialization.Codec;
import java.util.function.Function;

public class lb {
   public static final le a = a("angry_villager", false);
   public static final la<ks> b = a("block", false, ks.a, ks::a, ks::b);
   public static final la<ks> c = a("block_marker", true, ks.a, ks::a, ks::b);
   public static final le d = a("bubble", false);
   public static final le e = a("cloud", false);
   public static final le f = a("crit", false);
   public static final le g = a("damage_indicator", true);
   public static final le h = a("dragon_breath", false);
   public static final le i = a("dripping_lava", false);
   public static final le j = a("falling_lava", false);
   public static final le k = a("landing_lava", false);
   public static final le l = a("dripping_water", false);
   public static final le m = a("falling_water", false);
   public static final la<kv> n = a("dust", false, kv.e, $$0 -> kv.c, $$0 -> kv.d);
   public static final la<ku> o = a("dust_color_transition", false, ku.e, $$0 -> ku.c, $$0 -> ku.d);
   public static final le p = a("effect", false);
   public static final le q = a("elder_guardian", true);
   public static final le r = a("enchanted_hit", false);
   public static final le s = a("enchant", false);
   public static final le t = a("end_rod", false);
   public static final la<kt> u = a("entity_effect", false, kt.a, kt::a, kt::b);
   public static final le v = a("explosion_emitter", true);
   public static final le w = a("explosion", true);
   public static final le x = a("gust", true);
   public static final le y = a("gust_emitter_large", true);
   public static final le z = a("gust_emitter_small", true);
   public static final le A = a("sonic_boom", true);
   public static final la<ks> B = a("falling_dust", false, ks.a, ks::a, ks::b);
   public static final le C = a("firework", false);
   public static final le D = a("fishing", false);
   public static final le E = a("flame", false);
   public static final le F = a("cherry_leaves", false);
   public static final le G = a("sculk_soul", false);
   public static final la<lc> H = a("sculk_charge", true, lc.c, $$0 -> lc.a, $$0 -> lc.b);
   public static final le I = a("sculk_charge_pop", true);
   public static final le J = a("soul_fire_flame", false);
   public static final le K = a("soul", false);
   public static final le L = a("flash", false);
   public static final le M = a("happy_villager", false);
   public static final le N = a("composter", false);
   public static final le O = a("heart", false);
   public static final le P = a("instant_effect", false);
   public static final la<kx> Q = a("item", false, kx.a, kx::a, kx::b);
   public static final la<lf> R = a("vibration", true, lf.c, $$0 -> lf.a, $$0 -> lf.b);
   public static final le S = a("footstep", true);
   public static final le T = a("item_slime", false);
   public static final le U = a("item_snowball", false);
   public static final le V = a("large_smoke", false);
   public static final le W = a("lava", false);
   public static final le X = a("mycelium", false);
   public static final le Y = a("note", false);
   public static final le Z = a("poof", true);
   public static final le aa = a("portal", false);
   public static final le ab = a("rain", false);
   public static final le ac = a("smoke", false);
   public static final le ad = a("white_smoke", false);
   public static final le ae = a("sneeze", false);
   public static final le af = a("spit", true);
   public static final le ag = a("squid_ink", true);
   public static final le ah = a("sweep_attack", true);
   public static final le ai = a("totem_of_undying", false);
   public static final le aj = a("underwater", false);
   public static final le ak = a("splash", false);
   public static final le al = a("witch", false);
   public static final le am = a("bubble_pop", false);
   public static final le an = a("current_down", false);
   public static final le ao = a("bubble_column_up", false);
   public static final le ap = a("nautilus", false);
   public static final le aq = a("dolphin", false);
   public static final le ar = a("campfire_cosy_smoke", true);
   public static final le as = a("campfire_signal_smoke", true);
   public static final le at = a("dripping_honey", false);
   public static final le au = a("falling_honey", false);
   public static final le av = a("landing_honey", false);
   public static final le aw = a("falling_nectar", false);
   public static final le ax = a("falling_poison", false);
   public static final le ay = a("falling_spore_blossom", false);
   public static final le az = a("ash", false);
   public static final le aA = a("crimson_spore", false);
   public static final le aB = a("warped_spore", false);
   public static final le aC = a("spore_blossom_air", false);
   public static final le aD = a("dripping_obsidian_tear", false);
   public static final le aE = a("falling_obsidian_tear", false);
   public static final le aF = a("landing_obsidian_tear", false);
   public static final le aG = a("reverse_portal", false);
   public static final le aH = a("lightning", false);
   public static final le aI = a("reverse_lightning", false);
   public static final le aJ = a("white_ash", false);
   public static final le aK = a("small_flame", false);
   public static final le aL = a("snowflake", false);
   public static final le aM = a("dripping_dripstone_lava", false);
   public static final le aN = a("falling_dripstone_lava", false);
   public static final le aO = a("dripping_dripstone_water", false);
   public static final le aP = a("falling_dripstone_water", false);
   public static final le aQ = a("glow_squid_ink", true);
   public static final le aR = a("glow", true);
   public static final le aS = a("wax_on", true);
   public static final le aT = a("wax_off", true);
   public static final le aU = a("electric_spark", true);
   public static final le aV = a("scrape", true);
   public static final la<ld> aW = a("shriek", false, ld.c, $$0 -> ld.a, $$0 -> ld.b);
   public static final le aX = a("egg_crack", false);
   public static final le aY = a("dust_plume", false);
   public static final le aZ = a("trial_spawner_detection", true);
   public static final le ba = a("vault_connection", true);
   public static final Codec<kz> bb = lh.j.q().dispatch("type", kz::a, la::d);
   public static final zc<wp, kz> bc = za.a(li.T).b(kz::a, la::e);

   private static le a(String $$0, boolean $$1) {
      return jn.a(lh.j, $$0, new le($$1));
   }

   private static <T extends kz> la<T> a(
      String $$0, boolean $$1, kz.a<T> $$2, final Function<la<T>, Codec<T>> $$3, final Function<la<T>, zc<? super wp, T>> $$4
   ) {
      return jn.a(lh.j, $$0, new la<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public zc<? super wp, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
