import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sy {
   public static final ald<ehn> a = sw.a("bamboo_light");
   public static final ald<ehn> b = sw.a("bamboo");
   public static final ald<ehn> c = sw.a("vines");
   public static final ald<ehn> d = sw.a("patch_sunflower");
   public static final ald<ehn> e = sw.a("patch_pumpkin");
   public static final ald<ehn> f = sw.a("patch_grass_plain");
   public static final ald<ehn> g = sw.a("patch_grass_forest");
   public static final ald<ehn> h = sw.a("patch_grass_badlands");
   public static final ald<ehn> i = sw.a("patch_grass_savanna");
   public static final ald<ehn> j = sw.a("patch_grass_normal");
   public static final ald<ehn> k = sw.a("patch_grass_taiga_2");
   public static final ald<ehn> l = sw.a("patch_grass_taiga");
   public static final ald<ehn> m = sw.a("patch_grass_jungle");
   public static final ald<ehn> n = sw.a("grass_bonemeal");
   public static final ald<ehn> o = sw.a("patch_dead_bush_2");
   public static final ald<ehn> p = sw.a("patch_dead_bush");
   public static final ald<ehn> q = sw.a("patch_dead_bush_badlands");
   public static final ald<ehn> r = sw.a("patch_melon");
   public static final ald<ehn> s = sw.a("patch_melon_sparse");
   public static final ald<ehn> t = sw.a("patch_berry_common");
   public static final ald<ehn> u = sw.a("patch_berry_rare");
   public static final ald<ehn> v = sw.a("patch_waterlily");
   public static final ald<ehn> w = sw.a("patch_tall_grass_2");
   public static final ald<ehn> x = sw.a("patch_tall_grass");
   public static final ald<ehn> y = sw.a("patch_large_fern");
   public static final ald<ehn> z = sw.a("patch_cactus_desert");
   public static final ald<ehn> A = sw.a("patch_cactus_decorated");
   public static final ald<ehn> B = sw.a("patch_sugar_cane_swamp");
   public static final ald<ehn> C = sw.a("patch_sugar_cane_desert");
   public static final ald<ehn> D = sw.a("patch_sugar_cane_badlands");
   public static final ald<ehn> E = sw.a("patch_sugar_cane");
   public static final ald<ehn> F = sw.a("brown_mushroom_nether");
   public static final ald<ehn> G = sw.a("red_mushroom_nether");
   public static final ald<ehn> H = sw.a("brown_mushroom_normal");
   public static final ald<ehn> I = sw.a("red_mushroom_normal");
   public static final ald<ehn> J = sw.a("brown_mushroom_taiga");
   public static final ald<ehn> K = sw.a("red_mushroom_taiga");
   public static final ald<ehn> L = sw.a("brown_mushroom_old_growth");
   public static final ald<ehn> M = sw.a("red_mushroom_old_growth");
   public static final ald<ehn> N = sw.a("brown_mushroom_swamp");
   public static final ald<ehn> O = sw.a("red_mushroom_swamp");
   public static final ald<ehn> P = sw.a("flower_warm");
   public static final ald<ehn> Q = sw.a("flower_default");
   public static final ald<ehn> R = sw.a("flower_flower_forest");
   public static final ald<ehn> S = sw.a("flower_swamp");
   public static final ald<ehn> T = sw.a("flower_plains");
   public static final ald<ehn> U = sw.a("flower_meadow");
   public static final ald<ehn> V = sw.a("flower_cherry");
   public static final ald<ehn> W = sw.a("trees_plains");
   public static final ald<ehn> X = sw.a("dark_forest_vegetation");
   public static final ald<ehn> Y = sw.a("flower_forest_flowers");
   public static final ald<ehn> Z = sw.a("forest_flowers");
   public static final ald<ehn> aa = sw.a("trees_flower_forest");
   public static final ald<ehn> ab = sw.a("trees_meadow");
   public static final ald<ehn> ac = sw.a("trees_cherry");
   public static final ald<ehn> ad = sw.a("trees_taiga");
   public static final ald<ehn> ae = sw.a("trees_grove");
   public static final ald<ehn> af = sw.a("trees_badlands");
   public static final ald<ehn> ag = sw.a("trees_snowy");
   public static final ald<ehn> ah = sw.a("trees_swamp");
   public static final ald<ehn> ai = sw.a("trees_windswept_savanna");
   public static final ald<ehn> aj = sw.a("trees_savanna");
   public static final ald<ehn> ak = sw.a("birch_tall");
   public static final ald<ehn> al = sw.a("trees_birch");
   public static final ald<ehn> am = sw.a("trees_windswept_forest");
   public static final ald<ehn> an = sw.a("trees_windswept_hills");
   public static final ald<ehn> ao = sw.a("trees_water");
   public static final ald<ehn> ap = sw.a("trees_birch_and_oak");
   public static final ald<ehn> aq = sw.a("trees_sparse_jungle");
   public static final ald<ehn> ar = sw.a("trees_old_growth_spruce_taiga");
   public static final ald<ehn> as = sw.a("trees_old_growth_pine_taiga");
   public static final ald<ehn> at = sw.a("trees_jungle");
   public static final ald<ehn> au = sw.a("bamboo_vegetation");
   public static final ald<ehn> av = sw.a("mushroom_island_vegetation");
   public static final ald<ehn> aw = sw.a("trees_mangrove");
   private static final ehq ax = ehw.a(0);

   public static List<ehq> a(int $$0) {
      return List.of(ehg.a($$0), ehk.a(), sw.c, ehb.a());
   }

   private static List<ehq> a(int $$0, @Nullable ehq $$1) {
      Builder<ehq> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eht.a($$0));
      }

      $$2.add(ehk.a());
      $$2.add(sw.a);
      $$2.add(ehb.a());
      return $$2.build();
   }

   private static Builder<ehq> b(ehq $$0) {
      return ImmutableList.builder().add($$0).add(ehk.a()).add(ax).add(sw.d).add(ehb.a());
   }

   public static List<ehq> a(ehq $$0) {
      return b($$0).build();
   }

   public static List<ehq> a(ehq $$0, dey $$1) {
      return b($$0).add(ehc.a(dza.a($$1.o(), iz.c))).build();
   }

   public static void a(rc<ehn> $$0) {
      jj<eak<?, ?>> $$1 = $$0.a(lq.aC);
      ji<eak<?, ?>> $$2 = $$1.b(sn.a);
      ji<eak<?, ?>> $$3 = $$1.b(sn.b);
      ji<eak<?, ?>> $$4 = $$1.b(sn.c);
      ji<eak<?, ?>> $$5 = $$1.b(sn.f);
      ji<eak<?, ?>> $$6 = $$1.b(sn.g);
      ji<eak<?, ?>> $$7 = $$1.b(sn.j);
      ji<eak<?, ?>> $$8 = $$1.b(sn.i);
      ji<eak<?, ?>> $$9 = $$1.b(sn.k);
      ji<eak<?, ?>> $$10 = $$1.b(sn.l);
      ji<eak<?, ?>> $$11 = $$1.b(sn.m);
      ji<eak<?, ?>> $$12 = $$1.b(sn.n);
      ji<eak<?, ?>> $$13 = $$1.b(sn.h);
      ji<eak<?, ?>> $$14 = $$1.b(sn.o);
      ji<eak<?, ?>> $$15 = $$1.b(sn.p);
      ji<eak<?, ?>> $$16 = $$1.b(sn.q);
      ji<eak<?, ?>> $$17 = $$1.b(sn.r);
      ji<eak<?, ?>> $$18 = $$1.b(sn.s);
      ji<eak<?, ?>> $$19 = $$1.b(sn.d);
      ji<eak<?, ?>> $$20 = $$1.b(sn.e);
      ji<eak<?, ?>> $$21 = $$1.b(sn.t);
      ji<eak<?, ?>> $$22 = $$1.b(sn.u);
      ji<eak<?, ?>> $$23 = $$1.b(sn.v);
      ji<eak<?, ?>> $$24 = $$1.b(sn.w);
      ji<eak<?, ?>> $$25 = $$1.b(sn.x);
      ji<eak<?, ?>> $$26 = $$1.b(sn.y);
      ji<eak<?, ?>> $$27 = $$1.b(sn.K);
      ji<eak<?, ?>> $$28 = $$1.b(sn.A);
      ji<eak<?, ?>> $$29 = $$1.b(sn.z);
      ji<eak<?, ?>> $$30 = $$1.b(sn.B);
      ji<eak<?, ?>> $$31 = $$1.b(sn.C);
      ji<eak<?, ?>> $$32 = $$1.b(sn.D);
      ji<eak<?, ?>> $$33 = $$1.b(sn.E);
      ji<eak<?, ?>> $$34 = $$1.b(sm.g);
      ji<eak<?, ?>> $$35 = $$1.b(sm.k);
      ji<eak<?, ?>> $$36 = $$1.b(sm.K);
      ji<eak<?, ?>> $$37 = $$1.b(sm.u);
      ji<eak<?, ?>> $$38 = $$1.b(sn.F);
      ji<eak<?, ?>> $$39 = $$1.b(sn.G);
      ji<eak<?, ?>> $$40 = $$1.b(sm.D);
      ji<eak<?, ?>> $$41 = $$1.b(sn.H);
      ji<eak<?, ?>> $$42 = $$1.b(sn.I);
      ji<eak<?, ?>> $$43 = $$1.b(sn.J);
      ji<eak<?, ?>> $$44 = $$1.b(sn.L);
      ji<eak<?, ?>> $$45 = $$1.b(sn.M);
      ji<eak<?, ?>> $$46 = $$1.b(sn.N);
      ji<eak<?, ?>> $$47 = $$1.b(sn.O);
      ji<eak<?, ?>> $$48 = $$1.b(sn.P);
      ji<eak<?, ?>> $$49 = $$1.b(sn.Q);
      ji<eak<?, ?>> $$50 = $$1.b(sn.R);
      sw.a($$0, a, $$2, eht.a(4), ehk.a(), sw.a, ehb.a());
      sw.a($$0, b, $$3, ehl.a(160, 80.0, 0.3), ehk.a(), sw.c, ehb.a());
      sw.a($$0, c, $$4, ehg.a(127), ehk.a(), ehi.a(dyn.a(64), dyn.a(100)), ehb.a());
      sw.a($$0, d, $$5, eht.a(3), ehk.a(), sw.a, ehb.a());
      sw.a($$0, e, $$6, eht.a(300), ehk.a(), sw.a, ehb.a());
      sw.a($$0, f, $$7, ehm.a(-0.8, 5, 10), ehk.a(), sw.c, ehb.a());
      sw.a($$0, g, $$7, a(2));
      sw.a($$0, h, $$7, ehk.a(), sw.c, ehb.a());
      sw.a($$0, i, $$7, a(20));
      sw.a($$0, j, $$7, a(5));
      sw.a($$0, k, $$8, ehk.a(), sw.c, ehb.a());
      sw.a($$0, l, $$8, a(7));
      sw.a($$0, m, $$9, a(25));
      sw.a($$0, n, $$10, sw.a());
      sw.a($$0, o, $$11, a(2));
      sw.a($$0, p, $$11, ehk.a(), sw.c, ehb.a());
      sw.a($$0, q, $$11, a(20));
      sw.a($$0, r, $$12, eht.a(6), ehk.a(), sw.a, ehb.a());
      sw.a($$0, s, $$12, eht.a(64), ehk.a(), sw.a, ehb.a());
      sw.a($$0, t, $$13, eht.a(32), ehk.a(), sw.c, ehb.a());
      sw.a($$0, u, $$13, eht.a(384), ehk.a(), sw.c, ehb.a());
      sw.a($$0, v, $$14, a(4));
      sw.a($$0, w, $$15, ehm.a(-0.8, 0, 7), eht.a(32), ehk.a(), sw.a, ehb.a());
      sw.a($$0, x, $$15, eht.a(5), ehk.a(), sw.a, ehb.a());
      sw.a($$0, y, $$16, eht.a(5), ehk.a(), sw.a, ehb.a());
      sw.a($$0, z, $$17, eht.a(6), ehk.a(), sw.a, ehb.a());
      sw.a($$0, A, $$17, eht.a(13), ehk.a(), sw.a, ehb.a());
      sw.a($$0, B, $$18, eht.a(3), ehk.a(), sw.a, ehb.a());
      sw.a($$0, C, $$18, ehk.a(), sw.a, ehb.a());
      sw.a($$0, D, $$18, eht.a(5), ehk.a(), sw.a, ehb.a());
      sw.a($$0, E, $$18, eht.a(6), ehk.a(), sw.a, ehb.a());
      sw.a($$0, F, $$19, eht.a(2), ehk.a(), sw.e, ehb.a());
      sw.a($$0, G, $$20, eht.a(2), ehk.a(), sw.e, ehb.a());
      sw.a($$0, H, $$19, a(256, null));
      sw.a($$0, I, $$20, a(512, null));
      sw.a($$0, J, $$19, a(4, null));
      sw.a($$0, K, $$20, a(256, null));
      sw.a($$0, L, $$19, a(4, ehg.a(3)));
      sw.a($$0, M, $$20, a(171, null));
      sw.a($$0, N, $$19, a(0, ehg.a(2)));
      sw.a($$0, O, $$20, a(64, null));
      sw.a($$0, P, $$21, eht.a(16), ehk.a(), sw.a, ehb.a());
      sw.a($$0, Q, $$21, eht.a(32), ehk.a(), sw.a, ehb.a());
      sw.a($$0, R, $$22, ehg.a(3), eht.a(2), ehk.a(), sw.a, ehb.a());
      sw.a($$0, S, $$23, eht.a(32), ehk.a(), sw.a, ehb.a());
      sw.a($$0, T, $$24, ehm.a(-0.8, 15, 4), eht.a(32), ehk.a(), sw.a, ehb.a());
      sw.a($$0, V, $$26, ehm.a(-0.8, 5, 10), ehk.a(), sw.a, ehb.a());
      sw.a($$0, U, $$25, ehk.a(), sw.a, ehb.a());
      ehq $$51 = ehw.a(0);
      sw.a($$0, W, $$27, sw.a(0, 0.05F, 1), ehk.a(), $$51, sw.d, ehc.a(dza.a(dfa.x.o(), iz.c)), ehb.a());
      sw.a($$0, X, $$28, ehg.a(16), ehk.a(), $$51, sw.d, ehb.a());
      sw.a($$0, Y, $$29, eht.a(7), ehk.a(), sw.a, ehg.a(bpr.a(bqe.a(-1, 3), 0, 3)), ehb.a());
      sw.a($$0, Z, $$29, eht.a(7), ehk.a(), sw.a, ehg.a(bpr.a(bqe.a(-3, 1), 0, 1)), ehb.a());
      sw.a($$0, aa, $$30, a(sw.a(6, 0.1F, 1)));
      sw.a($$0, ab, $$31, a(eht.a(100)));
      sw.a($$0, ac, $$36, a(sw.a(10, 0.1F, 1), dfa.C));
      sw.a($$0, ad, $$32, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, ae, $$33, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, af, $$34, a(sw.a(5, 0.1F, 1), dfa.x));
      sw.a($$0, ag, $$35, a(sw.a(0, 0.1F, 1), dfa.y));
      sw.a($$0, ah, $$37, sw.a(2, 0.1F, 1), ehk.a(), ehw.a(2), sw.d, ehb.a(), ehc.a(dza.a(dfa.x.o(), iz.c)));
      sw.a($$0, ai, $$38, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, aj, $$38, a(sw.a(1, 0.1F, 1)));
      sw.a($$0, ak, $$39, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, al, $$40, a(sw.a(10, 0.1F, 1), dfa.z));
      sw.a($$0, am, $$41, a(sw.a(3, 0.1F, 1)));
      sw.a($$0, an, $$41, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ao, $$42, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ap, $$43, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, aq, $$44, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, ar, $$45, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, as, $$46, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, at, $$47, a(sw.a(50, 0.1F, 1)));
      sw.a($$0, au, $$48, a(sw.a(30, 0.1F, 1)));
      sw.a($$0, av, $$49, ehk.a(), sw.a, ehb.a());
      sw.a($$0, aw, $$50, ehg.a(25), ehk.a(), ehw.a(5), sw.d, ehb.a(), ehc.a(dza.a(dfa.E.o(), iz.c)));
   }
}
