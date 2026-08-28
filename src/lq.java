import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lq {
   public static final lu a = a("angry_villager", false);
   public static final lp<li> b = a("block", false, li::a, li::b);
   public static final lp<li> c = a("block_marker", true, li::a, li::b);
   public static final lu d = a("bubble", false);
   public static final lu e = a("cloud", false);
   public static final lu f = a("crit", false);
   public static final lu g = a("damage_indicator", true);
   public static final lu h = a("dragon_breath", false);
   public static final lu i = a("dripping_lava", false);
   public static final lu j = a("falling_lava", false);
   public static final lu k = a("landing_lava", false);
   public static final lu l = a("dripping_water", false);
   public static final lu m = a("falling_water", false);
   public static final lp<ll> n = a("dust", false, $$0 -> ll.c, $$0 -> ll.d);
   public static final lp<lk> o = a("dust_color_transition", false, $$0 -> lk.c, $$0 -> lk.d);
   public static final lu p = a("effect", false);
   public static final lu q = a("elder_guardian", true);
   public static final lu r = a("enchanted_hit", false);
   public static final lu s = a("enchant", false);
   public static final lu t = a("end_rod", false);
   public static final lp<lj> u = a("entity_effect", false, lj::a, lj::b);
   public static final lu v = a("explosion_emitter", true);
   public static final lu w = a("explosion", true);
   public static final lu x = a("gust", true);
   public static final lu y = a("small_gust", false);
   public static final lu z = a("gust_emitter_large", true);
   public static final lu A = a("gust_emitter_small", true);
   public static final lu B = a("sonic_boom", true);
   public static final lp<li> C = a("falling_dust", false, li::a, li::b);
   public static final lu D = a("firework", false);
   public static final lu E = a("fishing", false);
   public static final lu F = a("flame", false);
   public static final lu G = a("infested", false);
   public static final lu H = a("cherry_leaves", false);
   public static final lu I = a("sculk_soul", false);
   public static final lp<ls> J = a("sculk_charge", true, $$0 -> ls.a, $$0 -> ls.b);
   public static final lu K = a("sculk_charge_pop", true);
   public static final lu L = a("soul_fire_flame", false);
   public static final lu M = a("soul", false);
   public static final lu N = a("flash", false);
   public static final lu O = a("happy_villager", false);
   public static final lu P = a("composter", false);
   public static final lu Q = a("heart", false);
   public static final lu R = a("instant_effect", false);
   public static final lp<lm> S = a("item", false, lm::a, lm::b);
   public static final lp<lv> T = a("vibration", true, $$0 -> lv.a, $$0 -> lv.b);
   public static final lu U = a("item_slime", false);
   public static final lu V = a("item_cobweb", false);
   public static final lu W = a("item_snowball", false);
   public static final lu X = a("large_smoke", false);
   public static final lu Y = a("lava", false);
   public static final lu Z = a("mycelium", false);
   public static final lu aa = a("note", false);
   public static final lu ab = a("poof", true);
   public static final lu ac = a("portal", false);
   public static final lu ad = a("rain", false);
   public static final lu ae = a("smoke", false);
   public static final lu af = a("white_smoke", false);
   public static final lu ag = a("sneeze", false);
   public static final lu ah = a("spit", true);
   public static final lu ai = a("squid_ink", true);
   public static final lu aj = a("sweep_attack", true);
   public static final lu ak = a("totem_of_undying", false);
   public static final lu al = a("underwater", false);
   public static final lu am = a("splash", false);
   public static final lu an = a("witch", false);
   public static final lu ao = a("bubble_pop", false);
   public static final lu ap = a("current_down", false);
   public static final lu aq = a("bubble_column_up", false);
   public static final lu ar = a("nautilus", false);
   public static final lu as = a("dolphin", false);
   public static final lu at = a("campfire_cosy_smoke", true);
   public static final lu au = a("campfire_signal_smoke", true);
   public static final lu av = a("dripping_honey", false);
   public static final lu aw = a("falling_honey", false);
   public static final lu ax = a("landing_honey", false);
   public static final lu ay = a("falling_nectar", false);
   public static final lu az = a("falling_spore_blossom", false);
   public static final lu aA = a("ash", false);
   public static final lu aB = a("crimson_spore", false);
   public static final lu aC = a("warped_spore", false);
   public static final lu aD = a("spore_blossom_air", false);
   public static final lu aE = a("dripping_obsidian_tear", false);
   public static final lu aF = a("falling_obsidian_tear", false);
   public static final lu aG = a("landing_obsidian_tear", false);
   public static final lu aH = a("reverse_portal", false);
   public static final lu aI = a("white_ash", false);
   public static final lu aJ = a("small_flame", false);
   public static final lu aK = a("snowflake", false);
   public static final lu aL = a("dripping_dripstone_lava", false);
   public static final lu aM = a("falling_dripstone_lava", false);
   public static final lu aN = a("dripping_dripstone_water", false);
   public static final lu aO = a("falling_dripstone_water", false);
   public static final lu aP = a("glow_squid_ink", true);
   public static final lu aQ = a("glow", true);
   public static final lu aR = a("wax_on", true);
   public static final lu aS = a("wax_off", true);
   public static final lu aT = a("electric_spark", true);
   public static final lu aU = a("scrape", true);
   public static final lp<lt> aV = a("shriek", false, $$0 -> lt.a, $$0 -> lt.b);
   public static final lu aW = a("egg_crack", false);
   public static final lu aX = a("dust_plume", false);
   public static final lu aY = a("trial_spawner_detection", true);
   public static final lu aZ = a("trial_spawner_detection_ominous", true);
   public static final lu ba = a("vault_connection", true);
   public static final lp<li> bb = a("dust_pillar", false, li::a, li::b);
   public static final lu bc = a("ominous_spawning", true);
   public static final lu bd = a("raid_omen", false);
   public static final lu be = a("trial_omen", false);
   public static final Codec<lo> bf = lx.i.q().dispatch("type", lo::a, lp::c);
   public static final zf<ws, lo> bg = zd.a(ly.Y).b(lo::a, lp::d);

   private static lu a(String $$0, boolean $$1) {
      return kc.a(lx.i, $$0, new lu($$1));
   }

   private static <T extends lo> lp<T> a(String $$0, boolean $$1, final Function<lp<T>, MapCodec<T>> $$2, final Function<lp<T>, zf<? super ws, T>> $$3) {
      return kc.a(lx.i, $$0, new lp<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zf<? super ws, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
