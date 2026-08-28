import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lm {
   public static final lq a = a("angry_villager", false);
   public static final ll<le> b = a("block", false, le::a, le::b);
   public static final ll<le> c = a("block_marker", true, le::a, le::b);
   public static final lq d = a("bubble", false);
   public static final lq e = a("cloud", false);
   public static final lq f = a("crit", false);
   public static final lq g = a("damage_indicator", true);
   public static final lq h = a("dragon_breath", false);
   public static final lq i = a("dripping_lava", false);
   public static final lq j = a("falling_lava", false);
   public static final lq k = a("landing_lava", false);
   public static final lq l = a("dripping_water", false);
   public static final lq m = a("falling_water", false);
   public static final ll<lh> n = a("dust", false, $$0 -> lh.c, $$0 -> lh.d);
   public static final ll<lg> o = a("dust_color_transition", false, $$0 -> lg.c, $$0 -> lg.d);
   public static final lq p = a("effect", false);
   public static final lq q = a("elder_guardian", true);
   public static final lq r = a("enchanted_hit", false);
   public static final lq s = a("enchant", false);
   public static final lq t = a("end_rod", false);
   public static final ll<lf> u = a("entity_effect", false, lf::a, lf::b);
   public static final lq v = a("explosion_emitter", true);
   public static final lq w = a("explosion", true);
   public static final lq x = a("gust", true);
   public static final lq y = a("small_gust", false);
   public static final lq z = a("gust_emitter_large", true);
   public static final lq A = a("gust_emitter_small", true);
   public static final lq B = a("sonic_boom", true);
   public static final ll<le> C = a("falling_dust", false, le::a, le::b);
   public static final lq D = a("firework", false);
   public static final lq E = a("fishing", false);
   public static final lq F = a("flame", false);
   public static final lq G = a("infested", false);
   public static final lq H = a("cherry_leaves", false);
   public static final lq I = a("sculk_soul", false);
   public static final ll<lo> J = a("sculk_charge", true, $$0 -> lo.a, $$0 -> lo.b);
   public static final lq K = a("sculk_charge_pop", true);
   public static final lq L = a("soul_fire_flame", false);
   public static final lq M = a("soul", false);
   public static final lq N = a("flash", false);
   public static final lq O = a("happy_villager", false);
   public static final lq P = a("composter", false);
   public static final lq Q = a("heart", false);
   public static final lq R = a("instant_effect", false);
   public static final ll<li> S = a("item", false, li::a, li::b);
   public static final ll<lr> T = a("vibration", true, $$0 -> lr.a, $$0 -> lr.b);
   public static final lq U = a("item_slime", false);
   public static final lq V = a("item_cobweb", false);
   public static final lq W = a("item_snowball", false);
   public static final lq X = a("large_smoke", false);
   public static final lq Y = a("lava", false);
   public static final lq Z = a("mycelium", false);
   public static final lq aa = a("note", false);
   public static final lq ab = a("poof", true);
   public static final lq ac = a("portal", false);
   public static final lq ad = a("rain", false);
   public static final lq ae = a("smoke", false);
   public static final lq af = a("white_smoke", false);
   public static final lq ag = a("sneeze", false);
   public static final lq ah = a("spit", true);
   public static final lq ai = a("squid_ink", true);
   public static final lq aj = a("sweep_attack", true);
   public static final lq ak = a("totem_of_undying", false);
   public static final lq al = a("underwater", false);
   public static final lq am = a("splash", false);
   public static final lq an = a("witch", false);
   public static final lq ao = a("bubble_pop", false);
   public static final lq ap = a("current_down", false);
   public static final lq aq = a("bubble_column_up", false);
   public static final lq ar = a("nautilus", false);
   public static final lq as = a("dolphin", false);
   public static final lq at = a("campfire_cosy_smoke", true);
   public static final lq au = a("campfire_signal_smoke", true);
   public static final lq av = a("dripping_honey", false);
   public static final lq aw = a("falling_honey", false);
   public static final lq ax = a("landing_honey", false);
   public static final lq ay = a("falling_nectar", false);
   public static final lq az = a("falling_spore_blossom", false);
   public static final lq aA = a("ash", false);
   public static final lq aB = a("crimson_spore", false);
   public static final lq aC = a("warped_spore", false);
   public static final lq aD = a("spore_blossom_air", false);
   public static final lq aE = a("dripping_obsidian_tear", false);
   public static final lq aF = a("falling_obsidian_tear", false);
   public static final lq aG = a("landing_obsidian_tear", false);
   public static final lq aH = a("reverse_portal", false);
   public static final lq aI = a("white_ash", false);
   public static final lq aJ = a("small_flame", false);
   public static final lq aK = a("snowflake", false);
   public static final lq aL = a("dripping_dripstone_lava", false);
   public static final lq aM = a("falling_dripstone_lava", false);
   public static final lq aN = a("dripping_dripstone_water", false);
   public static final lq aO = a("falling_dripstone_water", false);
   public static final lq aP = a("glow_squid_ink", true);
   public static final lq aQ = a("glow", true);
   public static final lq aR = a("wax_on", true);
   public static final lq aS = a("wax_off", true);
   public static final lq aT = a("electric_spark", true);
   public static final lq aU = a("scrape", true);
   public static final ll<lp> aV = a("shriek", false, $$0 -> lp.a, $$0 -> lp.b);
   public static final lq aW = a("egg_crack", false);
   public static final lq aX = a("dust_plume", false);
   public static final lq aY = a("trial_spawner_detection", true);
   public static final lq aZ = a("trial_spawner_detection_ominous", true);
   public static final lq ba = a("vault_connection", true);
   public static final ll<le> bb = a("dust_pillar", false, le::a, le::b);
   public static final lq bc = a("ominous_spawning", true);
   public static final lq bd = a("raid_omen", false);
   public static final lq be = a("trial_omen", false);
   public static final Codec<lk> bf = lt.i.r().dispatch("type", lk::a, ll::c);
   public static final yx<wk, lk> bg = yv.a(lu.Y).b(lk::a, ll::d);

   private static lq a(String $$0, boolean $$1) {
      return jz.a(lt.i, $$0, new lq($$1));
   }

   private static <T extends lk> ll<T> a(String $$0, boolean $$1, final Function<ll<T>, MapCodec<T>> $$2, final Function<ll<T>, yx<? super wk, T>> $$3) {
      return jz.a(lt.i, $$0, new ll<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public yx<? super wk, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
