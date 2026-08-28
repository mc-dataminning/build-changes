import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lz {
   public static final md a = a("angry_villager", false);
   public static final ly<lr> b = a("block", false, lr::a, lr::b);
   public static final ly<lr> c = a("block_marker", true, lr::a, lr::b);
   public static final md d = a("bubble", false);
   public static final md e = a("cloud", false);
   public static final md f = a("crit", false);
   public static final md g = a("damage_indicator", true);
   public static final md h = a("dragon_breath", false);
   public static final md i = a("dripping_lava", false);
   public static final md j = a("falling_lava", false);
   public static final md k = a("landing_lava", false);
   public static final md l = a("dripping_water", false);
   public static final md m = a("falling_water", false);
   public static final ly<lu> n = a("dust", false, $$0 -> lu.c, $$0 -> lu.d);
   public static final ly<lt> o = a("dust_color_transition", false, $$0 -> lt.c, $$0 -> lt.d);
   public static final md p = a("effect", false);
   public static final md q = a("elder_guardian", true);
   public static final md r = a("enchanted_hit", false);
   public static final md s = a("enchant", false);
   public static final md t = a("end_rod", false);
   public static final ly<ls> u = a("entity_effect", false, ls::a, ls::b);
   public static final md v = a("explosion_emitter", true);
   public static final md w = a("explosion", true);
   public static final md x = a("gust", true);
   public static final md y = a("small_gust", false);
   public static final md z = a("gust_emitter_large", true);
   public static final md A = a("gust_emitter_small", true);
   public static final md B = a("sonic_boom", true);
   public static final ly<lr> C = a("falling_dust", false, lr::a, lr::b);
   public static final md D = a("firework", false);
   public static final md E = a("fishing", false);
   public static final md F = a("flame", false);
   public static final md G = a("infested", false);
   public static final md H = a("cherry_leaves", false);
   public static final md I = a("pale_oak_leaves", false);
   public static final ly<ls> J = a("tinted_leaves", false, ls::a, ls::b);
   public static final md K = a("sculk_soul", false);
   public static final ly<mb> L = a("sculk_charge", true, $$0 -> mb.a, $$0 -> mb.b);
   public static final md M = a("sculk_charge_pop", true);
   public static final md N = a("soul_fire_flame", false);
   public static final md O = a("soul", false);
   public static final md P = a("flash", false);
   public static final md Q = a("happy_villager", false);
   public static final md R = a("composter", false);
   public static final md S = a("heart", false);
   public static final md T = a("instant_effect", false);
   public static final ly<lv> U = a("item", false, lv::a, lv::b);
   public static final ly<mf> V = a("vibration", true, $$0 -> mf.a, $$0 -> mf.b);
   public static final ly<me> W = a("trail", false, $$0 -> me.a, $$0 -> me.b);
   public static final md X = a("item_slime", false);
   public static final md Y = a("item_cobweb", false);
   public static final md Z = a("item_snowball", false);
   public static final md aa = a("large_smoke", false);
   public static final md ab = a("lava", false);
   public static final md ac = a("mycelium", false);
   public static final md ad = a("note", false);
   public static final md ae = a("poof", true);
   public static final md af = a("portal", false);
   public static final md ag = a("rain", false);
   public static final md ah = a("smoke", false);
   public static final md ai = a("white_smoke", false);
   public static final md aj = a("sneeze", false);
   public static final md ak = a("spit", true);
   public static final md al = a("squid_ink", true);
   public static final md am = a("sweep_attack", true);
   public static final md an = a("totem_of_undying", false);
   public static final md ao = a("underwater", false);
   public static final md ap = a("splash", false);
   public static final md aq = a("witch", false);
   public static final md ar = a("bubble_pop", false);
   public static final md as = a("current_down", false);
   public static final md at = a("bubble_column_up", false);
   public static final md au = a("nautilus", false);
   public static final md av = a("dolphin", false);
   public static final md aw = a("campfire_cosy_smoke", true);
   public static final md ax = a("campfire_signal_smoke", true);
   public static final md ay = a("dripping_honey", false);
   public static final md az = a("falling_honey", false);
   public static final md aA = a("landing_honey", false);
   public static final md aB = a("falling_nectar", false);
   public static final md aC = a("falling_spore_blossom", false);
   public static final md aD = a("ash", false);
   public static final md aE = a("crimson_spore", false);
   public static final md aF = a("warped_spore", false);
   public static final md aG = a("spore_blossom_air", false);
   public static final md aH = a("dripping_obsidian_tear", false);
   public static final md aI = a("falling_obsidian_tear", false);
   public static final md aJ = a("landing_obsidian_tear", false);
   public static final md aK = a("reverse_portal", false);
   public static final md aL = a("white_ash", false);
   public static final md aM = a("small_flame", false);
   public static final md aN = a("snowflake", false);
   public static final md aO = a("dripping_dripstone_lava", false);
   public static final md aP = a("falling_dripstone_lava", false);
   public static final md aQ = a("dripping_dripstone_water", false);
   public static final md aR = a("falling_dripstone_water", false);
   public static final md aS = a("glow_squid_ink", true);
   public static final md aT = a("glow", true);
   public static final md aU = a("wax_on", true);
   public static final md aV = a("wax_off", true);
   public static final md aW = a("electric_spark", true);
   public static final md aX = a("scrape", true);
   public static final ly<mc> aY = a("shriek", false, $$0 -> mc.a, $$0 -> mc.b);
   public static final md aZ = a("egg_crack", false);
   public static final md ba = a("dust_plume", false);
   public static final md bb = a("trial_spawner_detection", true);
   public static final md bc = a("trial_spawner_detection_ominous", true);
   public static final md bd = a("vault_connection", true);
   public static final ly<lr> be = a("dust_pillar", false, lr::a, lr::b);
   public static final md bf = a("ominous_spawning", true);
   public static final md bg = a("raid_omen", false);
   public static final md bh = a("trial_omen", false);
   public static final ly<lr> bi = a("block_crumble", false, lr::a, lr::b);
   public static final md bj = a("firefly", false);
   public static final Codec<lx> bk = mh.i.q().dispatch("type", lx::a, ly::c);
   public static final za<wn, lx> bl = yy.a(mi.Y).b(lx::a, ly::d);

   private static md a(String $$0, boolean $$1) {
      return jt.a(mh.i, $$0, new md($$1));
   }

   private static <T extends lx> ly<T> a(String $$0, boolean $$1, final Function<ly<T>, MapCodec<T>> $$2, final Function<ly<T>, za<? super wn, T>> $$3) {
      return jt.a(mh.i, $$0, new ly<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public za<? super wn, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
