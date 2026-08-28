import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rw {
   public static final aku<emp> a = ru.a("bamboo_light");
   public static final aku<emp> b = ru.a("bamboo");
   public static final aku<emp> c = ru.a("vines");
   public static final aku<emp> d = ru.a("patch_sunflower");
   public static final aku<emp> e = ru.a("patch_pumpkin");
   public static final aku<emp> f = ru.a("patch_grass_plain");
   public static final aku<emp> g = ru.a("patch_grass_forest");
   public static final aku<emp> h = ru.a("patch_grass_badlands");
   public static final aku<emp> i = ru.a("patch_grass_savanna");
   public static final aku<emp> j = ru.a("patch_grass_normal");
   public static final aku<emp> k = ru.a("patch_grass_taiga_2");
   public static final aku<emp> l = ru.a("patch_grass_taiga");
   public static final aku<emp> m = ru.a("patch_grass_jungle");
   public static final aku<emp> n = ru.a("grass_bonemeal");
   public static final aku<emp> o = ru.a("patch_dead_bush_2");
   public static final aku<emp> p = ru.a("patch_dead_bush");
   public static final aku<emp> q = ru.a("patch_dead_bush_badlands");
   public static final aku<emp> r = ru.a("patch_melon");
   public static final aku<emp> s = ru.a("patch_melon_sparse");
   public static final aku<emp> t = ru.a("patch_berry_common");
   public static final aku<emp> u = ru.a("patch_berry_rare");
   public static final aku<emp> v = ru.a("patch_waterlily");
   public static final aku<emp> w = ru.a("patch_tall_grass_2");
   public static final aku<emp> x = ru.a("patch_tall_grass");
   public static final aku<emp> y = ru.a("patch_large_fern");
   public static final aku<emp> z = ru.a("patch_cactus_desert");
   public static final aku<emp> A = ru.a("patch_cactus_decorated");
   public static final aku<emp> B = ru.a("patch_sugar_cane_swamp");
   public static final aku<emp> C = ru.a("patch_sugar_cane_desert");
   public static final aku<emp> D = ru.a("patch_sugar_cane_badlands");
   public static final aku<emp> E = ru.a("patch_sugar_cane");
   public static final aku<emp> F = ru.a("brown_mushroom_nether");
   public static final aku<emp> G = ru.a("red_mushroom_nether");
   public static final aku<emp> H = ru.a("brown_mushroom_normal");
   public static final aku<emp> I = ru.a("red_mushroom_normal");
   public static final aku<emp> J = ru.a("brown_mushroom_taiga");
   public static final aku<emp> K = ru.a("red_mushroom_taiga");
   public static final aku<emp> L = ru.a("brown_mushroom_old_growth");
   public static final aku<emp> M = ru.a("red_mushroom_old_growth");
   public static final aku<emp> N = ru.a("brown_mushroom_swamp");
   public static final aku<emp> O = ru.a("red_mushroom_swamp");
   public static final aku<emp> P = ru.a("flower_warm");
   public static final aku<emp> Q = ru.a("flower_default");
   public static final aku<emp> R = ru.a("flower_flower_forest");
   public static final aku<emp> S = ru.a("flower_swamp");
   public static final aku<emp> T = ru.a("flower_plains");
   public static final aku<emp> U = ru.a("flower_meadow");
   public static final aku<emp> V = ru.a("flower_cherry");
   public static final aku<emp> W = ru.a("flower_pale_garden");
   public static final aku<emp> X = ru.a("trees_plains");
   public static final aku<emp> Y = ru.a("dark_forest_vegetation");
   public static final aku<emp> Z = ru.a("pale_garden_vegetation");
   public static final aku<emp> aa = ru.a("flower_forest_flowers");
   public static final aku<emp> ab = ru.a("forest_flowers");
   public static final aku<emp> ac = ru.a("pale_garden_flowers");
   public static final aku<emp> ad = ru.a("pale_moss_patch");
   public static final aku<emp> ae = ru.a("trees_flower_forest");
   public static final aku<emp> af = ru.a("trees_meadow");
   public static final aku<emp> ag = ru.a("trees_cherry");
   public static final aku<emp> ah = ru.a("trees_taiga");
   public static final aku<emp> ai = ru.a("trees_grove");
   public static final aku<emp> aj = ru.a("trees_badlands");
   public static final aku<emp> ak = ru.a("trees_snowy");
   public static final aku<emp> al = ru.a("trees_swamp");
   public static final aku<emp> am = ru.a("trees_windswept_savanna");
   public static final aku<emp> an = ru.a("trees_savanna");
   public static final aku<emp> ao = ru.a("birch_tall");
   public static final aku<emp> ap = ru.a("trees_birch");
   public static final aku<emp> aq = ru.a("trees_windswept_forest");
   public static final aku<emp> ar = ru.a("trees_windswept_hills");
   public static final aku<emp> as = ru.a("trees_water");
   public static final aku<emp> at = ru.a("trees_birch_and_oak");
   public static final aku<emp> au = ru.a("trees_sparse_jungle");
   public static final aku<emp> av = ru.a("trees_old_growth_spruce_taiga");
   public static final aku<emp> aw = ru.a("trees_old_growth_pine_taiga");
   public static final aku<emp> ax = ru.a("trees_jungle");
   public static final aku<emp> ay = ru.a("bamboo_vegetation");
   public static final aku<emp> az = ru.a("mushroom_island_vegetation");
   public static final aku<emp> aA = ru.a("trees_mangrove");
   private static final ems aB = emy.a(0);

   public static List<ems> a(int $$0) {
      return List.of(emh.a($$0), emm.a(), ru.d, emd.a());
   }

   private static List<ems> a(int $$0, @Nullable ems $$1) {
      Builder<ems> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(emv.a($$0));
      }

      $$2.add(emm.a());
      $$2.add(ru.a);
      $$2.add(emd.a());
      return $$2.build();
   }

   private static Builder<ems> b(ems $$0) {
      return ImmutableList.builder().add($$0).add(emm.a()).add(aB).add(ru.e).add(emd.a());
   }

   public static List<ems> a(ems $$0) {
      return b($$0).build();
   }

   public static List<ems> a(ems $$0, djl $$1) {
      return b($$0).add(eme.a(edy.a($$1.m(), ji.c))).build();
   }

   public static void a(qe<emp> $$0) {
      js<efj<?, ?>> $$1 = $$0.a(mc.aL);
      jr<efj<?, ?>> $$2 = $$1.b(rl.a);
      jr<efj<?, ?>> $$3 = $$1.b(rl.b);
      jr<efj<?, ?>> $$4 = $$1.b(rl.c);
      jr<efj<?, ?>> $$5 = $$1.b(rl.f);
      jr<efj<?, ?>> $$6 = $$1.b(rl.g);
      jr<efj<?, ?>> $$7 = $$1.b(rl.j);
      jr<efj<?, ?>> $$8 = $$1.b(rl.i);
      jr<efj<?, ?>> $$9 = $$1.b(rl.k);
      jr<efj<?, ?>> $$10 = $$1.b(rl.l);
      jr<efj<?, ?>> $$11 = $$1.b(rl.m);
      jr<efj<?, ?>> $$12 = $$1.b(rl.n);
      jr<efj<?, ?>> $$13 = $$1.b(rl.h);
      jr<efj<?, ?>> $$14 = $$1.b(rl.o);
      jr<efj<?, ?>> $$15 = $$1.b(rl.p);
      jr<efj<?, ?>> $$16 = $$1.b(rl.q);
      jr<efj<?, ?>> $$17 = $$1.b(rl.r);
      jr<efj<?, ?>> $$18 = $$1.b(rl.s);
      jr<efj<?, ?>> $$19 = $$1.b(rl.d);
      jr<efj<?, ?>> $$20 = $$1.b(rl.e);
      jr<efj<?, ?>> $$21 = $$1.b(rl.t);
      jr<efj<?, ?>> $$22 = $$1.b(rl.u);
      jr<efj<?, ?>> $$23 = $$1.b(rl.v);
      jr<efj<?, ?>> $$24 = $$1.b(rl.w);
      jr<efj<?, ?>> $$25 = $$1.b(rl.x);
      jr<efj<?, ?>> $$26 = $$1.b(rl.y);
      jr<efj<?, ?>> $$27 = $$1.b(rl.z);
      jr<efj<?, ?>> $$28 = $$1.b(rl.Q);
      jr<efj<?, ?>> $$29 = $$1.b(rl.C);
      jr<efj<?, ?>> $$30 = $$1.b(rl.D);
      jr<efj<?, ?>> $$31 = $$1.b(rl.A);
      jr<efj<?, ?>> $$32 = $$1.b(rl.B);
      jr<efj<?, ?>> $$33 = $$1.b(rl.F);
      jr<efj<?, ?>> $$34 = $$1.b(rl.H);
      jr<efj<?, ?>> $$35 = $$1.b(rl.I);
      jr<efj<?, ?>> $$36 = $$1.b(rl.J);
      jr<efj<?, ?>> $$37 = $$1.b(rl.K);
      jr<efj<?, ?>> $$38 = $$1.b(rk.g);
      jr<efj<?, ?>> $$39 = $$1.b(rk.n);
      jr<efj<?, ?>> $$40 = $$1.b(rk.N);
      jr<efj<?, ?>> $$41 = $$1.b(rk.x);
      jr<efj<?, ?>> $$42 = $$1.b(rl.L);
      jr<efj<?, ?>> $$43 = $$1.b(rl.M);
      jr<efj<?, ?>> $$44 = $$1.b(rk.G);
      jr<efj<?, ?>> $$45 = $$1.b(rl.N);
      jr<efj<?, ?>> $$46 = $$1.b(rl.O);
      jr<efj<?, ?>> $$47 = $$1.b(rl.P);
      jr<efj<?, ?>> $$48 = $$1.b(rl.R);
      jr<efj<?, ?>> $$49 = $$1.b(rl.S);
      jr<efj<?, ?>> $$50 = $$1.b(rl.T);
      jr<efj<?, ?>> $$51 = $$1.b(rl.U);
      jr<efj<?, ?>> $$52 = $$1.b(rl.V);
      jr<efj<?, ?>> $$53 = $$1.b(rl.W);
      jr<efj<?, ?>> $$54 = $$1.b(rl.X);
      ru.a($$0, a, $$2, emv.a(4), emm.a(), ru.a, emd.a());
      ru.a($$0, b, $$3, emn.a(160, 80.0, 0.3), emm.a(), ru.d, emd.a());
      ru.a($$0, c, $$4, emh.a(127), emm.a(), emk.a(edl.a(64), edl.a(100)), emd.a());
      ru.a($$0, d, $$5, emv.a(3), emm.a(), ru.a, emd.a());
      ru.a($$0, e, $$6, emv.a(300), emm.a(), ru.a, emd.a());
      ru.a($$0, f, $$7, emo.a(-0.8, 5, 10), emm.a(), ru.d, emd.a());
      ru.a($$0, g, $$7, a(2));
      ru.a($$0, h, $$7, emm.a(), ru.d, emd.a());
      ru.a($$0, i, $$7, a(20));
      ru.a($$0, j, $$7, a(5));
      ru.a($$0, k, $$8, emm.a(), ru.d, emd.a());
      ru.a($$0, l, $$8, a(7));
      ru.a($$0, m, $$9, a(25));
      ru.a($$0, n, $$10, ru.a());
      ru.a($$0, o, $$11, a(2));
      ru.a($$0, p, $$11, emm.a(), ru.d, emd.a());
      ru.a($$0, q, $$11, a(20));
      ru.a($$0, r, $$12, emv.a(6), emm.a(), ru.a, emd.a());
      ru.a($$0, s, $$12, emv.a(64), emm.a(), ru.a, emd.a());
      ru.a($$0, t, $$13, emv.a(32), emm.a(), ru.d, emd.a());
      ru.a($$0, u, $$13, emv.a(384), emm.a(), ru.d, emd.a());
      ru.a($$0, v, $$14, a(4));
      ru.a($$0, w, $$15, emo.a(-0.8, 0, 7), emv.a(32), emm.a(), ru.a, emd.a());
      ru.a($$0, x, $$15, emv.a(5), emm.a(), ru.a, emd.a());
      ru.a($$0, y, $$16, emv.a(5), emm.a(), ru.a, emd.a());
      ru.a($$0, z, $$17, emv.a(6), emm.a(), ru.a, emd.a());
      ru.a($$0, A, $$17, emv.a(13), emm.a(), ru.a, emd.a());
      ru.a($$0, B, $$18, emv.a(3), emm.a(), ru.a, emd.a());
      ru.a($$0, C, $$18, emm.a(), ru.a, emd.a());
      ru.a($$0, D, $$18, emv.a(5), emm.a(), ru.a, emd.a());
      ru.a($$0, E, $$18, emv.a(6), emm.a(), ru.a, emd.a());
      ru.a($$0, F, $$19, emv.a(2), emm.a(), ru.f, emd.a());
      ru.a($$0, G, $$20, emv.a(2), emm.a(), ru.f, emd.a());
      ru.a($$0, H, $$19, a(256, null));
      ru.a($$0, I, $$20, a(512, null));
      ru.a($$0, J, $$19, a(4, null));
      ru.a($$0, K, $$20, a(256, null));
      ru.a($$0, L, $$19, a(4, emh.a(3)));
      ru.a($$0, M, $$20, a(171, null));
      ru.a($$0, N, $$19, a(0, emh.a(2)));
      ru.a($$0, O, $$20, a(64, null));
      ru.a($$0, P, $$21, emv.a(16), emm.a(), ru.a, emd.a());
      ru.a($$0, Q, $$21, emv.a(32), emm.a(), ru.a, emd.a());
      ru.a($$0, R, $$22, emh.a(3), emv.a(2), emm.a(), ru.a, emd.a());
      ru.a($$0, S, $$23, emv.a(32), emm.a(), ru.a, emd.a());
      ru.a($$0, T, $$24, emo.a(-0.8, 15, 4), emv.a(32), emm.a(), ru.a, emd.a());
      ru.a($$0, V, $$26, emo.a(-0.8, 5, 10), emm.a(), ru.a, emd.a());
      ru.a($$0, U, $$25, emm.a(), ru.a, emd.a());
      ru.a($$0, W, $$27, emv.a(32), emm.a(), ru.a, emd.a());
      ems $$55 = emy.a(0);
      ru.a($$0, X, $$28, ru.a(0, 0.05F, 1), emm.a(), $$55, ru.e, eme.a(edy.a(djn.z.m(), ji.c)), emd.a());
      ru.a($$0, Y, $$29, emh.a(16), emm.a(), $$55, ru.e, emd.a());
      ru.a($$0, Z, $$30, emh.a(16), emm.a(), $$55, ru.e, emd.a());
      ru.a($$0, aa, $$31, emv.a(7), emm.a(), ru.a, emh.a(brh.a(bru.a(-1, 3), 0, 3)), emd.a());
      ru.a($$0, ab, $$31, emv.a(7), emm.a(), ru.a, emh.a(brh.a(bru.a(-3, 1), 0, 1)), emd.a());
      ru.a($$0, ac, $$32, emv.a(8), emm.a(), ru.b, emd.a());
      ru.a($$0, ad, $$33, emh.a(1), emm.a(), ru.b, emd.a());
      ru.a($$0, ae, $$34, a(ru.a(6, 0.1F, 1)));
      ru.a($$0, af, $$35, a(emv.a(100)));
      ru.a($$0, ag, $$40, a(ru.a(10, 0.1F, 1), djn.E));
      ru.a($$0, ah, $$36, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ai, $$37, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, aj, $$38, a(ru.a(5, 0.1F, 1), djn.z));
      ru.a($$0, ak, $$39, a(ru.a(0, 0.1F, 1), djn.A));
      ru.a($$0, al, $$41, ru.a(2, 0.1F, 1), emm.a(), emy.a(2), ru.e, emd.a(), eme.a(edy.a(djn.z.m(), ji.c)));
      ru.a($$0, am, $$42, a(ru.a(2, 0.1F, 1)));
      ru.a($$0, an, $$42, a(ru.a(1, 0.1F, 1)));
      ru.a($$0, ao, $$43, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ap, $$44, a(ru.a(10, 0.1F, 1), djn.B));
      ru.a($$0, aq, $$45, a(ru.a(3, 0.1F, 1)));
      ru.a($$0, ar, $$45, a(ru.a(0, 0.1F, 1)));
      ru.a($$0, as, $$46, a(ru.a(0, 0.1F, 1)));
      ru.a($$0, at, $$47, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, au, $$48, a(ru.a(2, 0.1F, 1)));
      ru.a($$0, av, $$49, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, aw, $$50, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ax, $$51, a(ru.a(50, 0.1F, 1)));
      ru.a($$0, ay, $$52, a(ru.a(30, 0.1F, 1)));
      ru.a($$0, az, $$53, emm.a(), ru.a, emd.a());
      ru.a($$0, aA, $$54, emh.a(25), emm.a(), emy.a(5), ru.e, emd.a(), eme.a(edy.a(djn.H.m(), ji.c)));
   }
}
