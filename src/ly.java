import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ly {
   public static final mc a = a("angry_villager", false);
   public static final lx<lq> b = a("block", false, lq::a, lq::b);
   public static final lx<lq> c = a("block_marker", true, lq::a, lq::b);
   public static final mc d = a("bubble", false);
   public static final mc e = a("cloud", false);
   public static final mc f = a("crit", false);
   public static final mc g = a("damage_indicator", true);
   public static final mc h = a("dragon_breath", false);
   public static final mc i = a("dripping_lava", false);
   public static final mc j = a("falling_lava", false);
   public static final mc k = a("landing_lava", false);
   public static final mc l = a("dripping_water", false);
   public static final mc m = a("falling_water", false);
   public static final lx<lt> n = a("dust", false, $$0 -> lt.c, $$0 -> lt.d);
   public static final lx<ls> o = a("dust_color_transition", false, $$0 -> ls.c, $$0 -> ls.d);
   public static final mc p = a("effect", false);
   public static final mc q = a("elder_guardian", true);
   public static final mc r = a("enchanted_hit", false);
   public static final mc s = a("enchant", false);
   public static final mc t = a("end_rod", false);
   public static final lx<lr> u = a("entity_effect", false, lr::a, lr::b);
   public static final mc v = a("explosion_emitter", true);
   public static final mc w = a("explosion", true);
   public static final mc x = a("gust", true);
   public static final mc y = a("small_gust", false);
   public static final mc z = a("gust_emitter_large", true);
   public static final mc A = a("gust_emitter_small", true);
   public static final mc B = a("sonic_boom", true);
   public static final lx<lq> C = a("falling_dust", false, lq::a, lq::b);
   public static final mc D = a("firework", false);
   public static final mc E = a("fishing", false);
   public static final mc F = a("flame", false);
   public static final mc G = a("infested", false);
   public static final mc H = a("cherry_leaves", false);
   public static final mc I = a("pale_oak_leaves", false);
   public static final lx<lr> J = a("tinted_leaves", false, lr::a, lr::b);
   public static final mc K = a("sculk_soul", false);
   public static final lx<ma> L = a("sculk_charge", true, $$0 -> ma.a, $$0 -> ma.b);
   public static final mc M = a("sculk_charge_pop", true);
   public static final mc N = a("soul_fire_flame", false);
   public static final mc O = a("soul", false);
   public static final mc P = a("flash", false);
   public static final mc Q = a("happy_villager", false);
   public static final mc R = a("composter", false);
   public static final mc S = a("heart", false);
   public static final mc T = a("instant_effect", false);
   public static final lx<lu> U = a("item", false, lu::a, lu::b);
   public static final lx<me> V = a("vibration", true, $$0 -> me.a, $$0 -> me.b);
   public static final lx<md> W = a("trail", false, $$0 -> md.a, $$0 -> md.b);
   public static final mc X = a("item_slime", false);
   public static final mc Y = a("item_cobweb", false);
   public static final mc Z = a("item_snowball", false);
   public static final mc aa = a("large_smoke", false);
   public static final mc ab = a("lava", false);
   public static final mc ac = a("mycelium", false);
   public static final mc ad = a("note", false);
   public static final mc ae = a("poof", true);
   public static final mc af = a("portal", false);
   public static final mc ag = a("rain", false);
   public static final mc ah = a("smoke", false);
   public static final mc ai = a("white_smoke", false);
   public static final mc aj = a("sneeze", false);
   public static final mc ak = a("spit", true);
   public static final mc al = a("squid_ink", true);
   public static final mc am = a("sweep_attack", true);
   public static final mc an = a("totem_of_undying", false);
   public static final mc ao = a("underwater", false);
   public static final mc ap = a("splash", false);
   public static final mc aq = a("witch", false);
   public static final mc ar = a("bubble_pop", false);
   public static final mc as = a("current_down", false);
   public static final mc at = a("bubble_column_up", false);
   public static final mc au = a("nautilus", false);
   public static final mc av = a("dolphin", false);
   public static final mc aw = a("campfire_cosy_smoke", true);
   public static final mc ax = a("campfire_signal_smoke", true);
   public static final mc ay = a("dripping_honey", false);
   public static final mc az = a("falling_honey", false);
   public static final mc aA = a("landing_honey", false);
   public static final mc aB = a("falling_nectar", false);
   public static final mc aC = a("falling_spore_blossom", false);
   public static final mc aD = a("ash", false);
   public static final mc aE = a("crimson_spore", false);
   public static final mc aF = a("warped_spore", false);
   public static final mc aG = a("spore_blossom_air", false);
   public static final mc aH = a("dripping_obsidian_tear", false);
   public static final mc aI = a("falling_obsidian_tear", false);
   public static final mc aJ = a("landing_obsidian_tear", false);
   public static final mc aK = a("reverse_portal", false);
   public static final mc aL = a("white_ash", false);
   public static final mc aM = a("small_flame", false);
   public static final mc aN = a("snowflake", false);
   public static final mc aO = a("dripping_dripstone_lava", false);
   public static final mc aP = a("falling_dripstone_lava", false);
   public static final mc aQ = a("dripping_dripstone_water", false);
   public static final mc aR = a("falling_dripstone_water", false);
   public static final mc aS = a("glow_squid_ink", true);
   public static final mc aT = a("glow", true);
   public static final mc aU = a("wax_on", true);
   public static final mc aV = a("wax_off", true);
   public static final mc aW = a("electric_spark", true);
   public static final mc aX = a("scrape", true);
   public static final lx<mb> aY = a("shriek", false, $$0 -> mb.a, $$0 -> mb.b);
   public static final mc aZ = a("egg_crack", false);
   public static final mc ba = a("dust_plume", false);
   public static final mc bb = a("trial_spawner_detection", true);
   public static final mc bc = a("trial_spawner_detection_ominous", true);
   public static final mc bd = a("vault_connection", true);
   public static final lx<lq> be = a("dust_pillar", false, lq::a, lq::b);
   public static final mc bf = a("ominous_spawning", true);
   public static final mc bg = a("raid_omen", false);
   public static final mc bh = a("trial_omen", false);
   public static final lx<lq> bi = a("block_crumble", false, lq::a, lq::b);
   public static final mc bj = a("firefly", false);
   public static final Codec<lw> bk = mg.i.q().dispatch("type", lw::a, lx::c);
   public static final yy<wl, lw> bl = yw.a(mh.Y).b(lw::a, lx::d);

   private static mc a(String $$0, boolean $$1) {
      return js.a(mg.i, $$0, new mc($$1));
   }

   private static <T extends lw> lx<T> a(String $$0, boolean $$1, final Function<lx<T>, MapCodec<T>> $$2, final Function<lx<T>, yy<? super wl, T>> $$3) {
      return js.a(mg.i, $$0, new lx<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public yy<? super wl, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
