import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class fyj {
   private static final String cr = "main";
   private static final Set<fyi> cs = Sets.newHashSet();
   public static final fyi a = a("allay");
   public static final fyi b = a("armadillo");
   public static final fyi c = a("armor_stand");
   public static final fyi d = b("armor_stand");
   public static final fyi e = c("armor_stand");
   public static final fyi f = a("axolotl");
   public static final fyi g = a("banner");
   public static final fyi h = a("bat");
   public static final fyi i = a("bed_foot");
   public static final fyi j = a("bed_head");
   public static final fyi k = a("bee");
   public static final fyi l = a("bell");
   public static final fyi m = a("blaze");
   public static final fyi n = a("bogged");
   public static final fyi o = b("bogged");
   public static final fyi p = c("bogged");
   public static final fyi q = a("bogged", "outer");
   public static final fyi r = a("book");
   public static final fyi s = a("breeze");
   public static final fyi t = a("breeze_wind");
   public static final fyi u = a("cat");
   public static final fyi v = a("cat", "collar");
   public static final fyi w = a("camel");
   public static final fyi x = a("cave_spider");
   public static final fyi y = a("chest");
   public static final fyi z = a("chest_minecart");
   public static final fyi A = a("chicken");
   public static final fyi B = a("cod");
   public static final fyi C = a("command_block_minecart");
   public static final fyi D = a("conduit", "cage");
   public static final fyi E = a("conduit", "eye");
   public static final fyi F = a("conduit", "shell");
   public static final fyi G = a("conduit", "wind");
   public static final fyi H = a("cow");
   public static final fyi I = a("creeper");
   public static final fyi J = a("creeper", "armor");
   public static final fyi K = a("creeper_head");
   public static final fyi L = a("decorated_pot_base");
   public static final fyi M = a("decorated_pot_sides");
   public static final fyi N = a("dolphin");
   public static final fyi O = a("donkey");
   public static final fyi P = a("double_chest_left");
   public static final fyi Q = a("double_chest_right");
   public static final fyi R = a("dragon_skull");
   public static final fyi S = a("drowned");
   public static final fyi T = b("drowned");
   public static final fyi U = c("drowned");
   public static final fyi V = a("drowned", "outer");
   public static final fyi W = a("elder_guardian");
   public static final fyi X = a("elytra");
   public static final fyi Y = a("enderman");
   public static final fyi Z = a("endermite");
   public static final fyi aa = a("ender_dragon");
   public static final fyi ab = a("end_crystal");
   public static final fyi ac = a("evoker");
   public static final fyi ad = a("evoker_fangs");
   public static final fyi ae = a("fox");
   public static final fyi af = a("frog");
   public static final fyi ag = a("furnace_minecart");
   public static final fyi ah = a("ghast");
   public static final fyi ai = a("giant");
   public static final fyi aj = b("giant");
   public static final fyi ak = c("giant");
   public static final fyi al = a("glow_squid");
   public static final fyi am = a("goat");
   public static final fyi an = a("guardian");
   public static final fyi ao = a("hoglin");
   public static final fyi ap = a("hopper_minecart");
   public static final fyi aq = a("horse");
   public static final fyi ar = a("horse_armor");
   public static final fyi as = a("husk");
   public static final fyi at = b("husk");
   public static final fyi au = c("husk");
   public static final fyi av = a("illusioner");
   public static final fyi aw = a("iron_golem");
   public static final fyi ax = a("leash_knot");
   public static final fyi ay = a("llama");
   public static final fyi az = a("llama", "decor");
   public static final fyi aA = a("llama_spit");
   public static final fyi aB = a("magma_cube");
   public static final fyi aC = a("minecart");
   public static final fyi aD = a("mooshroom");
   public static final fyi aE = a("mule");
   public static final fyi aF = a("ocelot");
   public static final fyi aG = a("panda");
   public static final fyi aH = a("parrot");
   public static final fyi aI = a("phantom");
   public static final fyi aJ = a("pig");
   public static final fyi aK = a("piglin");
   public static final fyi aL = a("piglin_brute");
   public static final fyi aM = b("piglin_brute");
   public static final fyi aN = c("piglin_brute");
   public static final fyi aO = a("piglin_head");
   public static final fyi aP = b("piglin");
   public static final fyi aQ = c("piglin");
   public static final fyi aR = a("pig", "saddle");
   public static final fyi aS = a("pillager");
   public static final fyi aT = a("player");
   public static final fyi aU = a("player_head");
   public static final fyi aV = b("player");
   public static final fyi aW = c("player");
   public static final fyi aX = a("player_slim");
   public static final fyi aY = b("player_slim");
   public static final fyi aZ = c("player_slim");
   public static final fyi ba = a("spin_attack");
   public static final fyi bb = a("polar_bear");
   public static final fyi bc = a("pufferfish_big");
   public static final fyi bd = a("pufferfish_medium");
   public static final fyi be = a("pufferfish_small");
   public static final fyi bf = a("rabbit");
   public static final fyi bg = a("ravager");
   public static final fyi bh = a("salmon");
   public static final fyi bi = a("sheep");
   public static final fyi bj = a("sheep", "fur");
   public static final fyi bk = a("shield");
   public static final fyi bl = a("shulker");
   public static final fyi bm = a("shulker_bullet");
   public static final fyi bn = a("silverfish");
   public static final fyi bo = a("skeleton");
   public static final fyi bp = a("skeleton_horse");
   public static final fyi bq = b("skeleton");
   public static final fyi br = c("skeleton");
   public static final fyi bs = a("skeleton_skull");
   public static final fyi bt = a("slime");
   public static final fyi bu = a("slime", "outer");
   public static final fyi bv = a("sniffer");
   public static final fyi bw = a("snow_golem");
   public static final fyi bx = a("spawner_minecart");
   public static final fyi by = a("spider");
   public static final fyi bz = a("squid");
   public static final fyi bA = a("stray");
   public static final fyi bB = b("stray");
   public static final fyi bC = c("stray");
   public static final fyi bD = a("stray", "outer");
   public static final fyi bE = a("strider");
   public static final fyi bF = a("strider", "saddle");
   public static final fyi bG = a("tadpole");
   public static final fyi bH = a("tnt_minecart");
   public static final fyi bI = a("trader_llama");
   public static final fyi bJ = a("trident");
   public static final fyi bK = a("tropical_fish_large");
   public static final fyi bL = a("tropical_fish_large", "pattern");
   public static final fyi bM = a("tropical_fish_small");
   public static final fyi bN = a("tropical_fish_small", "pattern");
   public static final fyi bO = a("turtle");
   public static final fyi bP = a("vex");
   public static final fyi bQ = a("villager");
   public static final fyi bR = a("vindicator");
   public static final fyi bS = a("warden");
   public static final fyi bT = a("wandering_trader");
   public static final fyi bU = a("wind_charge");
   public static final fyi bV = a("witch");
   public static final fyi bW = a("wither");
   public static final fyi bX = a("wither", "armor");
   public static final fyi bY = a("wither_skeleton");
   public static final fyi bZ = b("wither_skeleton");
   public static final fyi ca = c("wither_skeleton");
   public static final fyi cb = a("wither_skeleton_skull");
   public static final fyi cc = a("wither_skull");
   public static final fyi cd = a("wolf");
   public static final fyi ce = a("wolf_armor");
   public static final fyi cf = a("zoglin");
   public static final fyi cg = a("zombie");
   public static final fyi ch = a("zombie_head");
   public static final fyi ci = a("zombie_horse");
   public static final fyi cj = b("zombie");
   public static final fyi ck = c("zombie");
   public static final fyi cl = a("zombie_villager");
   public static final fyi cm = b("zombie_villager");
   public static final fyi cn = c("zombie_villager");
   public static final fyi co = a("zombified_piglin");
   public static final fyi cp = b("zombified_piglin");
   public static final fyi cq = c("zombified_piglin");

   private static fyi a(String $$0) {
      return a($$0, "main");
   }

   private static fyi a(String $$0, String $$1) {
      fyi $$2 = b($$0, $$1);
      if (!cs.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static fyi b(String $$0, String $$1) {
      return new fyi(akr.b($$0), $$1);
   }

   private static fyi b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static fyi c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static fyi a(cov.b $$0) {
      return b("raft/" + $$0.a(), "main");
   }

   public static fyi b(cov.b $$0) {
      return b("chest_raft/" + $$0.a(), "main");
   }

   public static fyi c(cov.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static fyi d(cov.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static fyi a(dup $$0) {
      return b("sign/" + $$0.b(), "main");
   }

   public static fyi b(dup $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<fyi> a() {
      return cs.stream();
   }
}
