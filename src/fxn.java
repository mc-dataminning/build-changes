import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fxn {
   private static final String cq = "main";
   private static final Set<fxm> cr = Sets.newHashSet();
   public static final fxm a = a("allay");
   public static final fxm b = a("armadillo");
   public static final fxm c = a("armor_stand");
   public static final fxm d = b("armor_stand");
   public static final fxm e = c("armor_stand");
   public static final fxm f = a("axolotl");
   public static final fxm g = a("banner");
   public static final fxm h = a("bat");
   public static final fxm i = a("bed_foot");
   public static final fxm j = a("bed_head");
   public static final fxm k = a("bee");
   public static final fxm l = a("bell");
   public static final fxm m = a("blaze");
   public static final fxm n = a("bogged");
   public static final fxm o = b("bogged");
   public static final fxm p = c("bogged");
   public static final fxm q = a("bogged", "outer");
   public static final fxm r = a("book");
   public static final fxm s = a("breeze");
   public static final fxm t = a("cat");
   public static final fxm u = a("cat", "collar");
   public static final fxm v = a("camel");
   public static final fxm w = a("cave_spider");
   public static final fxm x = a("chest");
   public static final fxm y = a("chest_minecart");
   public static final fxm z = a("chicken");
   public static final fxm A = a("cod");
   public static final fxm B = a("command_block_minecart");
   public static final fxm C = a("conduit", "cage");
   public static final fxm D = a("conduit", "eye");
   public static final fxm E = a("conduit", "shell");
   public static final fxm F = a("conduit", "wind");
   public static final fxm G = a("cow");
   public static final fxm H = a("creeper");
   public static final fxm I = a("creeper", "armor");
   public static final fxm J = a("creeper_head");
   public static final fxm K = a("decorated_pot_base");
   public static final fxm L = a("decorated_pot_sides");
   public static final fxm M = a("dolphin");
   public static final fxm N = a("donkey");
   public static final fxm O = a("double_chest_left");
   public static final fxm P = a("double_chest_right");
   public static final fxm Q = a("dragon_skull");
   public static final fxm R = a("drowned");
   public static final fxm S = b("drowned");
   public static final fxm T = c("drowned");
   public static final fxm U = a("drowned", "outer");
   public static final fxm V = a("elder_guardian");
   public static final fxm W = a("elytra");
   public static final fxm X = a("enderman");
   public static final fxm Y = a("endermite");
   public static final fxm Z = a("ender_dragon");
   public static final fxm aa = a("end_crystal");
   public static final fxm ab = a("evoker");
   public static final fxm ac = a("evoker_fangs");
   public static final fxm ad = a("fox");
   public static final fxm ae = a("frog");
   public static final fxm af = a("furnace_minecart");
   public static final fxm ag = a("ghast");
   public static final fxm ah = a("giant");
   public static final fxm ai = b("giant");
   public static final fxm aj = c("giant");
   public static final fxm ak = a("glow_squid");
   public static final fxm al = a("goat");
   public static final fxm am = a("guardian");
   public static final fxm an = a("hoglin");
   public static final fxm ao = a("hopper_minecart");
   public static final fxm ap = a("horse");
   public static final fxm aq = a("horse_armor");
   public static final fxm ar = a("husk");
   public static final fxm as = b("husk");
   public static final fxm at = c("husk");
   public static final fxm au = a("illusioner");
   public static final fxm av = a("iron_golem");
   public static final fxm aw = a("leash_knot");
   public static final fxm ax = a("llama");
   public static final fxm ay = a("llama", "decor");
   public static final fxm az = a("llama_spit");
   public static final fxm aA = a("magma_cube");
   public static final fxm aB = a("minecart");
   public static final fxm aC = a("mooshroom");
   public static final fxm aD = a("mule");
   public static final fxm aE = a("ocelot");
   public static final fxm aF = a("panda");
   public static final fxm aG = a("parrot");
   public static final fxm aH = a("phantom");
   public static final fxm aI = a("pig");
   public static final fxm aJ = a("piglin");
   public static final fxm aK = a("piglin_brute");
   public static final fxm aL = b("piglin_brute");
   public static final fxm aM = c("piglin_brute");
   public static final fxm aN = a("piglin_head");
   public static final fxm aO = b("piglin");
   public static final fxm aP = c("piglin");
   public static final fxm aQ = a("pig", "saddle");
   public static final fxm aR = a("pillager");
   public static final fxm aS = a("player");
   public static final fxm aT = a("player_head");
   public static final fxm aU = b("player");
   public static final fxm aV = c("player");
   public static final fxm aW = a("player_slim");
   public static final fxm aX = b("player_slim");
   public static final fxm aY = c("player_slim");
   public static final fxm aZ = a("spin_attack");
   public static final fxm ba = a("polar_bear");
   public static final fxm bb = a("pufferfish_big");
   public static final fxm bc = a("pufferfish_medium");
   public static final fxm bd = a("pufferfish_small");
   public static final fxm be = a("rabbit");
   public static final fxm bf = a("ravager");
   public static final fxm bg = a("salmon");
   public static final fxm bh = a("sheep");
   public static final fxm bi = a("sheep", "fur");
   public static final fxm bj = a("shield");
   public static final fxm bk = a("shulker");
   public static final fxm bl = a("shulker_bullet");
   public static final fxm bm = a("silverfish");
   public static final fxm bn = a("skeleton");
   public static final fxm bo = a("skeleton_horse");
   public static final fxm bp = b("skeleton");
   public static final fxm bq = c("skeleton");
   public static final fxm br = a("skeleton_skull");
   public static final fxm bs = a("slime");
   public static final fxm bt = a("slime", "outer");
   public static final fxm bu = a("sniffer");
   public static final fxm bv = a("snow_golem");
   public static final fxm bw = a("spawner_minecart");
   public static final fxm bx = a("spider");
   public static final fxm by = a("squid");
   public static final fxm bz = a("stray");
   public static final fxm bA = b("stray");
   public static final fxm bB = c("stray");
   public static final fxm bC = a("stray", "outer");
   public static final fxm bD = a("strider");
   public static final fxm bE = a("strider", "saddle");
   public static final fxm bF = a("tadpole");
   public static final fxm bG = a("tnt_minecart");
   public static final fxm bH = a("trader_llama");
   public static final fxm bI = a("trident");
   public static final fxm bJ = a("tropical_fish_large");
   public static final fxm bK = a("tropical_fish_large", "pattern");
   public static final fxm bL = a("tropical_fish_small");
   public static final fxm bM = a("tropical_fish_small", "pattern");
   public static final fxm bN = a("turtle");
   public static final fxm bO = a("vex");
   public static final fxm bP = a("villager");
   public static final fxm bQ = a("vindicator");
   public static final fxm bR = a("warden");
   public static final fxm bS = a("wandering_trader");
   public static final fxm bT = a("wind_charge");
   public static final fxm bU = a("witch");
   public static final fxm bV = a("wither");
   public static final fxm bW = a("wither", "armor");
   public static final fxm bX = a("wither_skeleton");
   public static final fxm bY = b("wither_skeleton");
   public static final fxm bZ = c("wither_skeleton");
   public static final fxm ca = a("wither_skeleton_skull");
   public static final fxm cb = a("wither_skull");
   public static final fxm cc = a("wolf");
   public static final fxm cd = a("wolf_armor");
   public static final fxm ce = a("zoglin");
   public static final fxm cf = a("zombie");
   public static final fxm cg = a("zombie_head");
   public static final fxm ch = a("zombie_horse");
   public static final fxm ci = b("zombie");
   public static final fxm cj = c("zombie");
   public static final fxm ck = a("zombie_villager");
   public static final fxm cl = b("zombie_villager");
   public static final fxm cm = c("zombie_villager");
   public static final fxm cn = a("zombified_piglin");
   public static final fxm co = b("zombified_piglin");
   public static final fxm cp = c("zombified_piglin");

   private static fxm a(String $$0) {
      return a($$0, "main");
   }

   private static fxm a(String $$0, String $$1) {
      fxm $$2 = b($$0, $$1);
      if (!cr.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fxm b(String $$0, String $$1) {
      return new fxm(new akk("minecraft", $$0), $$1);
   }

   private static fxm b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fxm c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fxm a(coh.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fxm b(coh.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fxm c(coh.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fxm d(coh.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fxm a(dtx $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fxm b(dtx $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fxm> a() {
      return cr.stream();
   }
}
