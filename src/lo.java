import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lo {
   public static final ls a = a("angry_villager", false);
   public static final ln<lg> b = a("block", false, lg::a, lg::b);
   public static final ln<lg> c = a("block_marker", true, lg::a, lg::b);
   public static final ls d = a("bubble", false);
   public static final ls e = a("cloud", false);
   public static final ls f = a("crit", false);
   public static final ls g = a("damage_indicator", true);
   public static final ls h = a("dragon_breath", false);
   public static final ls i = a("dripping_lava", false);
   public static final ls j = a("falling_lava", false);
   public static final ls k = a("landing_lava", false);
   public static final ls l = a("dripping_water", false);
   public static final ls m = a("falling_water", false);
   public static final ln<lj> n = a("dust", false, $$0 -> lj.c, $$0 -> lj.d);
   public static final ln<li> o = a("dust_color_transition", false, $$0 -> li.c, $$0 -> li.d);
   public static final ls p = a("effect", false);
   public static final ls q = a("elder_guardian", true);
   public static final ls r = a("enchanted_hit", false);
   public static final ls s = a("enchant", false);
   public static final ls t = a("end_rod", false);
   public static final ln<lh> u = a("entity_effect", false, lh::a, lh::b);
   public static final ls v = a("explosion_emitter", true);
   public static final ls w = a("explosion", true);
   public static final ls x = a("gust", true);
   public static final ls y = a("small_gust", false);
   public static final ls z = a("gust_emitter_large", true);
   public static final ls A = a("gust_emitter_small", true);
   public static final ls B = a("sonic_boom", true);
   public static final ln<lg> C = a("falling_dust", false, lg::a, lg::b);
   public static final ls D = a("firework", false);
   public static final ls E = a("fishing", false);
   public static final ls F = a("flame", false);
   public static final ls G = a("infested", false);
   public static final ls H = a("cherry_leaves", false);
   public static final ls I = a("sculk_soul", false);
   public static final ln<lq> J = a("sculk_charge", true, $$0 -> lq.a, $$0 -> lq.b);
   public static final ls K = a("sculk_charge_pop", true);
   public static final ls L = a("soul_fire_flame", false);
   public static final ls M = a("soul", false);
   public static final ls N = a("flash", false);
   public static final ls O = a("happy_villager", false);
   public static final ls P = a("composter", false);
   public static final ls Q = a("heart", false);
   public static final ls R = a("instant_effect", false);
   public static final ln<lk> S = a("item", false, lk::a, lk::b);
   public static final ln<lt> T = a("vibration", true, $$0 -> lt.a, $$0 -> lt.b);
   public static final ls U = a("item_slime", false);
   public static final ls V = a("item_cobweb", false);
   public static final ls W = a("item_snowball", false);
   public static final ls X = a("large_smoke", false);
   public static final ls Y = a("lava", false);
   public static final ls Z = a("mycelium", false);
   public static final ls aa = a("note", false);
   public static final ls ab = a("poof", true);
   public static final ls ac = a("portal", false);
   public static final ls ad = a("rain", false);
   public static final ls ae = a("smoke", false);
   public static final ls af = a("white_smoke", false);
   public static final ls ag = a("sneeze", false);
   public static final ls ah = a("spit", true);
   public static final ls ai = a("squid_ink", true);
   public static final ls aj = a("sweep_attack", true);
   public static final ls ak = a("totem_of_undying", false);
   public static final ls al = a("underwater", false);
   public static final ls am = a("splash", false);
   public static final ls an = a("witch", false);
   public static final ls ao = a("bubble_pop", false);
   public static final ls ap = a("current_down", false);
   public static final ls aq = a("bubble_column_up", false);
   public static final ls ar = a("nautilus", false);
   public static final ls as = a("dolphin", false);
   public static final ls at = a("campfire_cosy_smoke", true);
   public static final ls au = a("campfire_signal_smoke", true);
   public static final ls av = a("dripping_honey", false);
   public static final ls aw = a("falling_honey", false);
   public static final ls ax = a("landing_honey", false);
   public static final ls ay = a("falling_nectar", false);
   public static final ls az = a("falling_spore_blossom", false);
   public static final ls aA = a("ash", false);
   public static final ls aB = a("crimson_spore", false);
   public static final ls aC = a("warped_spore", false);
   public static final ls aD = a("spore_blossom_air", false);
   public static final ls aE = a("dripping_obsidian_tear", false);
   public static final ls aF = a("falling_obsidian_tear", false);
   public static final ls aG = a("landing_obsidian_tear", false);
   public static final ls aH = a("reverse_portal", false);
   public static final ls aI = a("white_ash", false);
   public static final ls aJ = a("small_flame", false);
   public static final ls aK = a("snowflake", false);
   public static final ls aL = a("dripping_dripstone_lava", false);
   public static final ls aM = a("falling_dripstone_lava", false);
   public static final ls aN = a("dripping_dripstone_water", false);
   public static final ls aO = a("falling_dripstone_water", false);
   public static final ls aP = a("glow_squid_ink", true);
   public static final ls aQ = a("glow", true);
   public static final ls aR = a("wax_on", true);
   public static final ls aS = a("wax_off", true);
   public static final ls aT = a("electric_spark", true);
   public static final ls aU = a("scrape", true);
   public static final ln<lr> aV = a("shriek", false, $$0 -> lr.a, $$0 -> lr.b);
   public static final ls aW = a("egg_crack", false);
   public static final ls aX = a("dust_plume", false);
   public static final ls aY = a("trial_spawner_detection", true);
   public static final ls aZ = a("trial_spawner_detection_ominous", true);
   public static final ls ba = a("vault_connection", true);
   public static final ln<lg> bb = a("dust_pillar", false, lg::a, lg::b);
   public static final ls bc = a("ominous_spawning", true);
   public static final ls bd = a("raid_omen", false);
   public static final ls be = a("trial_omen", false);
   public static final Codec<lm> bf = lv.i.q().dispatch("type", lm::a, ln::c);
   public static final zc<wp, lm> bg = za.a(lw.Y).b(lm::a, ln::d);

   private static ls a(String $$0, boolean $$1) {
      return kb.a(lv.i, $$0, new ls($$1));
   }

   private static <T extends lm> ln<T> a(String $$0, boolean $$1, final Function<ln<T>, MapCodec<T>> $$2, final Function<ln<T>, zc<? super wp, T>> $$3) {
      return kb.a(lv.i, $$0, new ln<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zc<? super wp, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
