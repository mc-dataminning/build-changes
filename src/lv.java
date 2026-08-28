import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class lv {
   public static final lz a = a("angry_villager", false);
   public static final lu<ln> b = a("block", false, ln::a, ln::b);
   public static final lu<ln> c = a("block_marker", true, ln::a, ln::b);
   public static final lz d = a("bubble", false);
   public static final lz e = a("cloud", false);
   public static final lz f = a("crit", false);
   public static final lz g = a("damage_indicator", true);
   public static final lz h = a("dragon_breath", false);
   public static final lz i = a("dripping_lava", false);
   public static final lz j = a("falling_lava", false);
   public static final lz k = a("landing_lava", false);
   public static final lz l = a("dripping_water", false);
   public static final lz m = a("falling_water", false);
   public static final lu<lq> n = a("dust", false, $$0 -> lq.c, $$0 -> lq.d);
   public static final lu<lp> o = a("dust_color_transition", false, $$0 -> lp.c, $$0 -> lp.d);
   public static final lz p = a("effect", false);
   public static final lz q = a("elder_guardian", true);
   public static final lz r = a("enchanted_hit", false);
   public static final lz s = a("enchant", false);
   public static final lz t = a("end_rod", false);
   public static final lu<lo> u = a("entity_effect", false, lo::a, lo::b);
   public static final lz v = a("explosion_emitter", true);
   public static final lz w = a("explosion", true);
   public static final lz x = a("gust", true);
   public static final lz y = a("small_gust", false);
   public static final lz z = a("gust_emitter_large", true);
   public static final lz A = a("gust_emitter_small", true);
   public static final lz B = a("sonic_boom", true);
   public static final lu<ln> C = a("falling_dust", false, ln::a, ln::b);
   public static final lz D = a("firework", false);
   public static final lz E = a("fishing", false);
   public static final lz F = a("flame", false);
   public static final lz G = a("infested", false);
   public static final lz H = a("cherry_leaves", false);
   public static final lz I = a("pale_oak_leaves", false);
   public static final lz J = a("tinted_leaves", false);
   public static final lz K = a("sculk_soul", false);
   public static final lu<lx> L = a("sculk_charge", true, $$0 -> lx.a, $$0 -> lx.b);
   public static final lz M = a("sculk_charge_pop", true);
   public static final lz N = a("soul_fire_flame", false);
   public static final lz O = a("soul", false);
   public static final lz P = a("flash", false);
   public static final lz Q = a("happy_villager", false);
   public static final lz R = a("composter", false);
   public static final lz S = a("heart", false);
   public static final lz T = a("instant_effect", false);
   public static final lu<lr> U = a("item", false, lr::a, lr::b);
   public static final lu<mb> V = a("vibration", true, $$0 -> mb.a, $$0 -> mb.b);
   public static final lu<ma> W = a("trail", false, $$0 -> ma.a, $$0 -> ma.b);
   public static final lz X = a("item_slime", false);
   public static final lz Y = a("item_cobweb", false);
   public static final lz Z = a("item_snowball", false);
   public static final lz aa = a("large_smoke", false);
   public static final lz ab = a("lava", false);
   public static final lz ac = a("mycelium", false);
   public static final lz ad = a("note", false);
   public static final lz ae = a("poof", true);
   public static final lz af = a("portal", false);
   public static final lz ag = a("rain", false);
   public static final lz ah = a("smoke", false);
   public static final lz ai = a("white_smoke", false);
   public static final lz aj = a("sneeze", false);
   public static final lz ak = a("spit", true);
   public static final lz al = a("squid_ink", true);
   public static final lz am = a("sweep_attack", true);
   public static final lz an = a("totem_of_undying", false);
   public static final lz ao = a("underwater", false);
   public static final lz ap = a("splash", false);
   public static final lz aq = a("witch", false);
   public static final lz ar = a("bubble_pop", false);
   public static final lz as = a("current_down", false);
   public static final lz at = a("bubble_column_up", false);
   public static final lz au = a("nautilus", false);
   public static final lz av = a("dolphin", false);
   public static final lz aw = a("campfire_cosy_smoke", true);
   public static final lz ax = a("campfire_signal_smoke", true);
   public static final lz ay = a("dripping_honey", false);
   public static final lz az = a("falling_honey", false);
   public static final lz aA = a("landing_honey", false);
   public static final lz aB = a("falling_nectar", false);
   public static final lz aC = a("falling_spore_blossom", false);
   public static final lz aD = a("ash", false);
   public static final lz aE = a("crimson_spore", false);
   public static final lz aF = a("warped_spore", false);
   public static final lz aG = a("spore_blossom_air", false);
   public static final lz aH = a("dripping_obsidian_tear", false);
   public static final lz aI = a("falling_obsidian_tear", false);
   public static final lz aJ = a("landing_obsidian_tear", false);
   public static final lz aK = a("reverse_portal", false);
   public static final lz aL = a("white_ash", false);
   public static final lz aM = a("small_flame", false);
   public static final lz aN = a("snowflake", false);
   public static final lz aO = a("dripping_dripstone_lava", false);
   public static final lz aP = a("falling_dripstone_lava", false);
   public static final lz aQ = a("dripping_dripstone_water", false);
   public static final lz aR = a("falling_dripstone_water", false);
   public static final lz aS = a("glow_squid_ink", true);
   public static final lz aT = a("glow", true);
   public static final lz aU = a("wax_on", true);
   public static final lz aV = a("wax_off", true);
   public static final lz aW = a("electric_spark", true);
   public static final lz aX = a("scrape", true);
   public static final lu<ly> aY = a("shriek", false, $$0 -> ly.a, $$0 -> ly.b);
   public static final lz aZ = a("egg_crack", false);
   public static final lz ba = a("dust_plume", false);
   public static final lz bb = a("trial_spawner_detection", true);
   public static final lz bc = a("trial_spawner_detection_ominous", true);
   public static final lz bd = a("vault_connection", true);
   public static final lu<ln> be = a("dust_pillar", false, ln::a, ln::b);
   public static final lz bf = a("ominous_spawning", true);
   public static final lz bg = a("raid_omen", false);
   public static final lz bh = a("trial_omen", false);
   public static final lu<ln> bi = a("block_crumble", false, ln::a, ln::b);
   public static final Codec<lt> bj = md.i.q().dispatch("type", lt::a, lu::c);
   public static final yt<wg, lt> bk = yr.a(me.Y).b(lt::a, lu::d);

   private static lz a(String $$0, boolean $$1) {
      return kf.a(md.i, $$0, new lz($$1));
   }

   private static <T extends lt> lu<T> a(String $$0, boolean $$1, final Function<lu<T>, MapCodec<T>> $$2, final Function<lu<T>, yt<? super wg, T>> $$3) {
      return kf.a(md.i, $$0, new lu<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public yt<? super wg, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
