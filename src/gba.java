import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class gba {
   private static final String dH = "main";
   private static final Set<gaz> dI = Sets.newHashSet();
   public static final gaz a = a("allay");
   public static final gaz b = a("armadillo");
   public static final gaz c = a("armadillo_baby");
   public static final gaz d = a("armor_stand");
   public static final gaz e = b("armor_stand");
   public static final gaz f = c("armor_stand");
   public static final gaz g = a("armor_stand_small");
   public static final gaz h = b("armor_stand_small");
   public static final gaz i = c("armor_stand_small");
   public static final gaz j = a("arrow");
   public static final gaz k = a("axolotl");
   public static final gaz l = a("axolotl_baby");
   public static final gaz m = a("banner");
   public static final gaz n = a("bat");
   public static final gaz o = a("bed_foot");
   public static final gaz p = a("bed_head");
   public static final gaz q = a("bee");
   public static final gaz r = a("bee_baby");
   public static final gaz s = a("bee_stinger");
   public static final gaz t = a("bell");
   public static final gaz u = a("blaze");
   public static final gaz v = a("boat", "water_patch");
   public static final gaz w = a("bogged");
   public static final gaz x = b("bogged");
   public static final gaz y = c("bogged");
   public static final gaz z = a("bogged", "outer");
   public static final gaz A = a("book");
   public static final gaz B = a("breeze");
   public static final gaz C = a("breeze_wind");
   public static final gaz D = a("cat");
   public static final gaz E = a("cat_baby");
   public static final gaz F = a("cat", "collar");
   public static final gaz G = a("cat_baby", "collar");
   public static final gaz H = a("camel");
   public static final gaz I = a("camel_baby");
   public static final gaz J = a("cave_spider");
   public static final gaz K = a("chest");
   public static final gaz L = a("chest_minecart");
   public static final gaz M = a("chicken");
   public static final gaz N = a("chicken_baby");
   public static final gaz O = a("cod");
   public static final gaz P = a("command_block_minecart");
   public static final gaz Q = a("conduit", "cage");
   public static final gaz R = a("conduit", "eye");
   public static final gaz S = a("conduit", "shell");
   public static final gaz T = a("conduit", "wind");
   public static final gaz U = a("cow");
   public static final gaz V = a("cow_baby");
   public static final gaz W = a("creeper");
   public static final gaz X = a("creeper", "armor");
   public static final gaz Y = a("creeper_head");
   public static final gaz Z = a("decorated_pot_base");
   public static final gaz aa = a("decorated_pot_sides");
   public static final gaz ab = a("dolphin");
   public static final gaz ac = a("dolphin_baby");
   public static final gaz ad = a("donkey");
   public static final gaz ae = a("donkey_baby");
   public static final gaz af = a("double_chest_left");
   public static final gaz ag = a("double_chest_right");
   public static final gaz ah = a("dragon_skull");
   public static final gaz ai = a("drowned");
   public static final gaz aj = b("drowned");
   public static final gaz ak = c("drowned");
   public static final gaz al = a("drowned", "outer");
   public static final gaz am = a("drowned_baby");
   public static final gaz an = b("drowned_baby");
   public static final gaz ao = c("drowned_baby");
   public static final gaz ap = a("drowned_baby", "outer");
   public static final gaz aq = a("elder_guardian");
   public static final gaz ar = a("elytra");
   public static final gaz as = a("elytra_baby");
   public static final gaz at = a("enderman");
   public static final gaz au = a("endermite");
   public static final gaz av = a("ender_dragon");
   public static final gaz aw = a("end_crystal");
   public static final gaz ax = a("evoker");
   public static final gaz ay = a("evoker_fangs");
   public static final gaz az = a("fox");
   public static final gaz aA = a("fox_baby");
   public static final gaz aB = a("frog");
   public static final gaz aC = a("furnace_minecart");
   public static final gaz aD = a("ghast");
   public static final gaz aE = a("giant");
   public static final gaz aF = b("giant");
   public static final gaz aG = c("giant");
   public static final gaz aH = a("glow_squid");
   public static final gaz aI = a("glow_squid_baby");
   public static final gaz aJ = a("goat");
   public static final gaz aK = a("goat_baby");
   public static final gaz aL = a("guardian");
   public static final gaz aM = a("hoglin");
   public static final gaz aN = a("hoglin_baby");
   public static final gaz aO = a("hopper_minecart");
   public static final gaz aP = a("horse");
   public static final gaz aQ = a("horse_baby");
   public static final gaz aR = a("horse_armor");
   public static final gaz aS = a("horse_armor_baby");
   public static final gaz aT = a("husk");
   public static final gaz aU = b("husk");
   public static final gaz aV = c("husk");
   public static final gaz aW = a("husk_baby");
   public static final gaz aX = b("husk_baby");
   public static final gaz aY = c("husk_baby");
   public static final gaz aZ = a("illusioner");
   public static final gaz ba = a("iron_golem");
   public static final gaz bb = a("leash_knot");
   public static final gaz bc = a("llama");
   public static final gaz bd = a("llama_baby");
   public static final gaz be = a("llama", "decor");
   public static final gaz bf = a("llama_baby", "decor");
   public static final gaz bg = a("llama_spit");
   public static final gaz bh = a("magma_cube");
   public static final gaz bi = a("minecart");
   public static final gaz bj = a("mooshroom");
   public static final gaz bk = a("mooshroom_baby");
   public static final gaz bl = a("mule");
   public static final gaz bm = a("mule_baby");
   public static final gaz bn = a("ocelot");
   public static final gaz bo = a("ocelot_baby");
   public static final gaz bp = a("panda");
   public static final gaz bq = a("panda_baby");
   public static final gaz br = a("parrot");
   public static final gaz bs = a("phantom");
   public static final gaz bt = a("pig");
   public static final gaz bu = a("pig_baby");
   public static final gaz bv = a("pig", "saddle");
   public static final gaz bw = a("pig_baby", "saddle");
   public static final gaz bx = a("piglin");
   public static final gaz by = a("piglin_brute");
   public static final gaz bz = b("piglin_brute");
   public static final gaz bA = c("piglin_brute");
   public static final gaz bB = a("piglin_head");
   public static final gaz bC = b("piglin");
   public static final gaz bD = c("piglin");
   public static final gaz bE = a("piglin_baby");
   public static final gaz bF = b("piglin_baby");
   public static final gaz bG = c("piglin_baby");
   public static final gaz bH = a("pillager");
   public static final gaz bI = a("player");
   public static final gaz bJ = a("player", "ears");
   public static final gaz bK = a("player", "cape");
   public static final gaz bL = a("player_head");
   public static final gaz bM = b("player");
   public static final gaz bN = c("player");
   public static final gaz bO = a("player_slim");
   public static final gaz bP = b("player_slim");
   public static final gaz bQ = c("player_slim");
   public static final gaz bR = a("spin_attack");
   public static final gaz bS = a("polar_bear");
   public static final gaz bT = a("polar_bear_baby");
   public static final gaz bU = a("pufferfish_big");
   public static final gaz bV = a("pufferfish_medium");
   public static final gaz bW = a("pufferfish_small");
   public static final gaz bX = a("rabbit");
   public static final gaz bY = a("rabbit_baby");
   public static final gaz bZ = a("ravager");
   public static final gaz ca = a("salmon");
   public static final gaz cb = a("salmon_small");
   public static final gaz cc = a("salmon_large");
   public static final gaz cd = a("sheep");
   public static final gaz ce = a("sheep_baby");
   public static final gaz cf = a("sheep", "wool");
   public static final gaz cg = a("sheep_baby", "wool");
   public static final gaz ch = a("shield");
   public static final gaz ci = a("shulker");
   public static final gaz cj = a("shulker_box");
   public static final gaz ck = a("shulker_bullet");
   public static final gaz cl = a("silverfish");
   public static final gaz cm = a("skeleton");
   public static final gaz cn = a("skeleton_horse");
   public static final gaz co = a("skeleton_horse_baby");
   public static final gaz cp = b("skeleton");
   public static final gaz cq = c("skeleton");
   public static final gaz cr = a("skeleton_skull");
   public static final gaz cs = a("slime");
   public static final gaz ct = a("slime", "outer");
   public static final gaz cu = a("sniffer");
   public static final gaz cv = a("sniffer_baby");
   public static final gaz cw = a("snow_golem");
   public static final gaz cx = a("spawner_minecart");
   public static final gaz cy = a("spider");
   public static final gaz cz = a("squid");
   public static final gaz cA = a("squid_baby");
   public static final gaz cB = a("stray");
   public static final gaz cC = b("stray");
   public static final gaz cD = c("stray");
   public static final gaz cE = a("stray", "outer");
   public static final gaz cF = a("strider");
   public static final gaz cG = a("strider", "saddle");
   public static final gaz cH = a("tadpole");
   public static final gaz cI = a("tnt_minecart");
   public static final gaz cJ = a("trader_llama");
   public static final gaz cK = a("trader_llama_baby");
   public static final gaz cL = a("trident");
   public static final gaz cM = a("tropical_fish_large");
   public static final gaz cN = a("tropical_fish_large", "pattern");
   public static final gaz cO = a("tropical_fish_small");
   public static final gaz cP = a("tropical_fish_small", "pattern");
   public static final gaz cQ = a("turtle");
   public static final gaz cR = a("turtle_baby");
   public static final gaz cS = a("vex");
   public static final gaz cT = a("villager");
   public static final gaz cU = a("vindicator");
   public static final gaz cV = a("warden");
   public static final gaz cW = a("wandering_trader");
   public static final gaz cX = a("wind_charge");
   public static final gaz cY = a("witch");
   public static final gaz cZ = a("wither");
   public static final gaz da = a("wither", "armor");
   public static final gaz db = a("wither_skeleton");
   public static final gaz dc = b("wither_skeleton");
   public static final gaz dd = c("wither_skeleton");
   public static final gaz de = a("wither_skeleton_skull");
   public static final gaz df = a("wither_skull");
   public static final gaz dg = a("wolf");
   public static final gaz dh = a("wolf_armor");
   public static final gaz di = a("wolf_baby");
   public static final gaz dj = a("wolf_baby_armor");
   public static final gaz dk = a("zoglin");
   public static final gaz dl = a("zoglin_baby");
   public static final gaz dm = a("zombie");
   public static final gaz dn = a("zombie_head");
   public static final gaz do = a("zombie_horse");
   public static final gaz dp = a("zombie_horse_baby");
   public static final gaz dq = b("zombie");
   public static final gaz dr = c("zombie");
   public static final gaz ds = a("zombie_baby");
   public static final gaz dt = b("zombie_baby");
   public static final gaz du = c("zombie_baby");
   public static final gaz dv = a("zombie_villager");
   public static final gaz dw = b("zombie_villager");
   public static final gaz dx = c("zombie_villager");
   public static final gaz dy = a("zombie_villager_baby");
   public static final gaz dz = b("zombie_villager_baby");
   public static final gaz dA = c("zombie_villager_baby");
   public static final gaz dB = a("zombified_piglin");
   public static final gaz dC = b("zombified_piglin");
   public static final gaz dD = c("zombified_piglin");
   public static final gaz dE = a("zombified_piglin_baby");
   public static final gaz dF = b("zombified_piglin_baby");
   public static final gaz dG = c("zombified_piglin_baby");

   private static gaz a(String $$0) {
      return a($$0, "main");
   }

   private static gaz a(String $$0, String $$1) {
      gaz $$2 = b($$0, $$1);
      if (!dI.add($$2)) {
         throw new IllegalStateException("Duplicate registration for " + $$2);
      } else {
         return $$2;
      }
   }

   private static gaz b(String $$0, String $$1) {
      return new gaz(alh.b($$0), $$1);
   }

   private static gaz b(String $$0) {
      return a($$0, "inner_armor");
   }

   private static gaz c(String $$0) {
      return a($$0, "outer_armor");
   }

   public static gaz a(cqh.b $$0) {
      return b("boat/" + $$0.a(), "main");
   }

   public static gaz b(cqh.b $$0) {
      return b("chest_boat/" + $$0.a(), "main");
   }

   public static gaz a(dwq $$0) {
      return b("sign/standing/" + $$0.b(), "main");
   }

   public static gaz b(dwq $$0) {
      return b("sign/wall/" + $$0.b(), "main");
   }

   public static gaz c(dwq $$0) {
      return b("hanging_sign/" + $$0.b(), "main");
   }

   public static Stream<gaz> a() {
      return dI.stream();
   }
}
