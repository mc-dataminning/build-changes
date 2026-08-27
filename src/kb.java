import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kb {
   public static final ke a = a("ambient_entity_effect", false);
   public static final ke b = a("angry_villager", false);
   public static final ka<jt> c = a("block", false, jt.a, jt::a, jt::b);
   public static final ka<jt> d = a("block_marker", true, jt.a, jt::a, jt::b);
   public static final ke e = a("bubble", false);
   public static final ke f = a("cloud", false);
   public static final ke g = a("crit", false);
   public static final ke h = a("damage_indicator", true);
   public static final ke i = a("dragon_breath", false);
   public static final ke j = a("dripping_lava", false);
   public static final ke k = a("falling_lava", false);
   public static final ke l = a("landing_lava", false);
   public static final ke m = a("dripping_water", false);
   public static final ke n = a("falling_water", false);
   public static final ka<jv> o = a("dust", false, jv.e, $$0 -> jv.c, $$0 -> jv.d);
   public static final ka<ju> p = a("dust_color_transition", false, ju.e, $$0 -> ju.c, $$0 -> ju.d);
   public static final ke q = a("effect", false);
   public static final ke r = a("elder_guardian", true);
   public static final ke s = a("enchanted_hit", false);
   public static final ke t = a("enchant", false);
   public static final ke u = a("end_rod", false);
   public static final ke v = a("entity_effect", false);
   public static final ke w = a("explosion_emitter", true);
   public static final ke x = a("explosion", true);
   public static final ke y = a("gust", true);
   public static final ke z = a("gust_emitter", true);
   public static final ke A = a("sonic_boom", true);
   public static final ka<jt> B = a("falling_dust", false, jt.a, jt::a, jt::b);
   public static final ke C = a("firework", false);
   public static final ke D = a("fishing", false);
   public static final ke E = a("flame", false);
   public static final ke F = a("cherry_leaves", false);
   public static final ke G = a("sculk_soul", false);
   public static final ka<kc> H = a("sculk_charge", true, kc.c, $$0 -> kc.a, $$0 -> kc.b);
   public static final ke I = a("sculk_charge_pop", true);
   public static final ke J = a("soul_fire_flame", false);
   public static final ke K = a("soul", false);
   public static final ke L = a("flash", false);
   public static final ke M = a("happy_villager", false);
   public static final ke N = a("composter", false);
   public static final ke O = a("heart", false);
   public static final ke P = a("instant_effect", false);
   public static final ka<jx> Q = a("item", false, jx.a, jx::a, jx::b);
   public static final ka<kf> R = a("vibration", true, kf.c, $$0 -> kf.a, $$0 -> kf.b);
   public static final ke S = a("item_slime", false);
   public static final ke T = a("item_snowball", false);
   public static final ke U = a("large_smoke", false);
   public static final ke V = a("lava", false);
   public static final ke W = a("mycelium", false);
   public static final ke X = a("note", false);
   public static final ke Y = a("poof", true);
   public static final ke Z = a("portal", false);
   public static final ke aa = a("rain", false);
   public static final ke ab = a("smoke", false);
   public static final ke ac = a("white_smoke", false);
   public static final ke ad = a("sneeze", false);
   public static final ke ae = a("spit", true);
   public static final ke af = a("squid_ink", true);
   public static final ke ag = a("sweep_attack", true);
   public static final ke ah = a("totem_of_undying", false);
   public static final ke ai = a("underwater", false);
   public static final ke aj = a("splash", false);
   public static final ke ak = a("witch", false);
   public static final ke al = a("bubble_pop", false);
   public static final ke am = a("current_down", false);
   public static final ke an = a("bubble_column_up", false);
   public static final ke ao = a("nautilus", false);
   public static final ke ap = a("dolphin", false);
   public static final ke aq = a("campfire_cosy_smoke", true);
   public static final ke ar = a("campfire_signal_smoke", true);
   public static final ke as = a("dripping_honey", false);
   public static final ke at = a("falling_honey", false);
   public static final ke au = a("landing_honey", false);
   public static final ke av = a("falling_nectar", false);
   public static final ke aw = a("falling_spore_blossom", false);
   public static final ke ax = a("ash", false);
   public static final ke ay = a("crimson_spore", false);
   public static final ke az = a("warped_spore", false);
   public static final ke aA = a("spore_blossom_air", false);
   public static final ke aB = a("dripping_obsidian_tear", false);
   public static final ke aC = a("falling_obsidian_tear", false);
   public static final ke aD = a("landing_obsidian_tear", false);
   public static final ke aE = a("reverse_portal", false);
   public static final ke aF = a("white_ash", false);
   public static final ke aG = a("small_flame", false);
   public static final ke aH = a("snowflake", false);
   public static final ke aI = a("dripping_dripstone_lava", false);
   public static final ke aJ = a("falling_dripstone_lava", false);
   public static final ke aK = a("dripping_dripstone_water", false);
   public static final ke aL = a("falling_dripstone_water", false);
   public static final ke aM = a("glow_squid_ink", true);
   public static final ke aN = a("glow", true);
   public static final ke aO = a("wax_on", true);
   public static final ke aP = a("wax_off", true);
   public static final ke aQ = a("electric_spark", true);
   public static final ke aR = a("scrape", true);
   public static final ka<kd> aS = a("shriek", false, kd.c, $$0 -> kd.a, $$0 -> kd.b);
   public static final ke aT = a("egg_crack", false);
   public static final ke aU = a("dust_plume", false);
   public static final ke aV = a("trial_spawner_detection", true);
   public static final ke aW = a("vault_connection", true);
   public static final Codec<jz> aX = kh.j.q().dispatch("type", jz::a, ka::d);
   public static final xq<vd, jz> aY = xo.a(ki.S).b(jz::a, ka::e);

   private static ke a(String $$0, boolean $$1) {
      return ix.a(kh.j, $$0, new ke($$1));
   }

   private static <T extends jz> ka<T> a(
      String $$0, boolean $$1, jz.a<T> $$2, final Function<ka<T>, Codec<T>> $$3, final Function<ka<T>, xq<? super vd, T>> $$4
   ) {
      return ix.a(kh.j, $$0, new ka<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public xq<? super vd, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
