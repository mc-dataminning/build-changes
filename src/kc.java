import com.mojang.serialization.Codec;
import java.util.function.Function;

public class kc {
   public static final kf a = a("ambient_entity_effect", false);
   public static final kf b = a("angry_villager", false);
   public static final kb<ju> c = a("block", false, ju.a, ju::a, ju::b);
   public static final kb<ju> d = a("block_marker", true, ju.a, ju::a, ju::b);
   public static final kf e = a("bubble", false);
   public static final kf f = a("cloud", false);
   public static final kf g = a("crit", false);
   public static final kf h = a("damage_indicator", true);
   public static final kf i = a("dragon_breath", false);
   public static final kf j = a("dripping_lava", false);
   public static final kf k = a("falling_lava", false);
   public static final kf l = a("landing_lava", false);
   public static final kf m = a("dripping_water", false);
   public static final kf n = a("falling_water", false);
   public static final kb<jw> o = a("dust", false, jw.e, $$0 -> jw.c, $$0 -> jw.d);
   public static final kb<jv> p = a("dust_color_transition", false, jv.e, $$0 -> jv.c, $$0 -> jv.d);
   public static final kf q = a("effect", false);
   public static final kf r = a("elder_guardian", true);
   public static final kf s = a("enchanted_hit", false);
   public static final kf t = a("enchant", false);
   public static final kf u = a("end_rod", false);
   public static final kf v = a("entity_effect", false);
   public static final kf w = a("explosion_emitter", true);
   public static final kf x = a("explosion", true);
   public static final kf y = a("gust", true);
   public static final kf z = a("gust_emitter_large", true);
   public static final kf A = a("gust_emitter_small", true);
   public static final kf B = a("sonic_boom", true);
   public static final kb<ju> C = a("falling_dust", false, ju.a, ju::a, ju::b);
   public static final kf D = a("firework", false);
   public static final kf E = a("fishing", false);
   public static final kf F = a("flame", false);
   public static final kf G = a("cherry_leaves", false);
   public static final kf H = a("sculk_soul", false);
   public static final kb<kd> I = a("sculk_charge", true, kd.c, $$0 -> kd.a, $$0 -> kd.b);
   public static final kf J = a("sculk_charge_pop", true);
   public static final kf K = a("soul_fire_flame", false);
   public static final kf L = a("soul", false);
   public static final kf M = a("flash", false);
   public static final kf N = a("happy_villager", false);
   public static final kf O = a("composter", false);
   public static final kf P = a("heart", false);
   public static final kf Q = a("instant_effect", false);
   public static final kb<jy> R = a("item", false, jy.a, jy::a, jy::b);
   public static final kb<kg> S = a("vibration", true, kg.c, $$0 -> kg.a, $$0 -> kg.b);
   public static final kf T = a("item_slime", false);
   public static final kf U = a("item_snowball", false);
   public static final kf V = a("large_smoke", false);
   public static final kf W = a("lava", false);
   public static final kf X = a("mycelium", false);
   public static final kf Y = a("note", false);
   public static final kf Z = a("poof", true);
   public static final kf aa = a("portal", false);
   public static final kf ab = a("rain", false);
   public static final kf ac = a("smoke", false);
   public static final kf ad = a("white_smoke", false);
   public static final kf ae = a("sneeze", false);
   public static final kf af = a("spit", true);
   public static final kf ag = a("squid_ink", true);
   public static final kf ah = a("sweep_attack", true);
   public static final kf ai = a("totem_of_undying", false);
   public static final kf aj = a("underwater", false);
   public static final kf ak = a("splash", false);
   public static final kf al = a("witch", false);
   public static final kf am = a("bubble_pop", false);
   public static final kf an = a("current_down", false);
   public static final kf ao = a("bubble_column_up", false);
   public static final kf ap = a("nautilus", false);
   public static final kf aq = a("dolphin", false);
   public static final kf ar = a("campfire_cosy_smoke", true);
   public static final kf as = a("campfire_signal_smoke", true);
   public static final kf at = a("dripping_honey", false);
   public static final kf au = a("falling_honey", false);
   public static final kf av = a("landing_honey", false);
   public static final kf aw = a("falling_nectar", false);
   public static final kf ax = a("falling_spore_blossom", false);
   public static final kf ay = a("ash", false);
   public static final kf az = a("crimson_spore", false);
   public static final kf aA = a("warped_spore", false);
   public static final kf aB = a("spore_blossom_air", false);
   public static final kf aC = a("dripping_obsidian_tear", false);
   public static final kf aD = a("falling_obsidian_tear", false);
   public static final kf aE = a("landing_obsidian_tear", false);
   public static final kf aF = a("reverse_portal", false);
   public static final kf aG = a("white_ash", false);
   public static final kf aH = a("small_flame", false);
   public static final kf aI = a("snowflake", false);
   public static final kf aJ = a("dripping_dripstone_lava", false);
   public static final kf aK = a("falling_dripstone_lava", false);
   public static final kf aL = a("dripping_dripstone_water", false);
   public static final kf aM = a("falling_dripstone_water", false);
   public static final kf aN = a("glow_squid_ink", true);
   public static final kf aO = a("glow", true);
   public static final kf aP = a("wax_on", true);
   public static final kf aQ = a("wax_off", true);
   public static final kf aR = a("electric_spark", true);
   public static final kf aS = a("scrape", true);
   public static final kb<ke> aT = a("shriek", false, ke.c, $$0 -> ke.a, $$0 -> ke.b);
   public static final kf aU = a("egg_crack", false);
   public static final kf aV = a("dust_plume", false);
   public static final kf aW = a("trial_spawner_detection", true);
   public static final kf aX = a("vault_connection", true);
   public static final Codec<ka> aY = ki.j.q().dispatch("type", ka::a, kb::d);
   public static final xs<vf, ka> aZ = xq.a(kj.S).b(ka::a, kb::e);

   private static kf a(String $$0, boolean $$1) {
      return iy.a(ki.j, $$0, new kf($$1));
   }

   private static <T extends ka> kb<T> a(
      String $$0, boolean $$1, ka.a<T> $$2, final Function<kb<T>, Codec<T>> $$3, final Function<kb<T>, xs<? super vf, T>> $$4
   ) {
      return iy.a(ki.j, $$0, new kb<T>($$1, $$2) {
         @Override
         public Codec<T> d() {
            return $$3.apply(this);
         }

         @Override
         public xs<? super vf, T> e() {
            return $$4.apply(this);
         }
      });
   }
}
