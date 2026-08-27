import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rf {
   public static final ajb<ebk> a = rd.a("bamboo_light");
   public static final ajb<ebk> b = rd.a("bamboo");
   public static final ajb<ebk> c = rd.a("vines");
   public static final ajb<ebk> d = rd.a("patch_sunflower");
   public static final ajb<ebk> e = rd.a("patch_pumpkin");
   public static final ajb<ebk> f = rd.a("patch_grass_plain");
   public static final ajb<ebk> g = rd.a("patch_grass_forest");
   public static final ajb<ebk> h = rd.a("patch_grass_badlands");
   public static final ajb<ebk> i = rd.a("patch_grass_savanna");
   public static final ajb<ebk> j = rd.a("patch_grass_normal");
   public static final ajb<ebk> k = rd.a("patch_grass_taiga_2");
   public static final ajb<ebk> l = rd.a("patch_grass_taiga");
   public static final ajb<ebk> m = rd.a("patch_grass_jungle");
   public static final ajb<ebk> n = rd.a("grass_bonemeal");
   public static final ajb<ebk> o = rd.a("patch_dead_bush_2");
   public static final ajb<ebk> p = rd.a("patch_dead_bush");
   public static final ajb<ebk> q = rd.a("patch_dead_bush_badlands");
   public static final ajb<ebk> r = rd.a("patch_melon");
   public static final ajb<ebk> s = rd.a("patch_melon_sparse");
   public static final ajb<ebk> t = rd.a("patch_berry_common");
   public static final ajb<ebk> u = rd.a("patch_berry_rare");
   public static final ajb<ebk> v = rd.a("patch_waterlily");
   public static final ajb<ebk> w = rd.a("patch_tall_grass_2");
   public static final ajb<ebk> x = rd.a("patch_tall_grass");
   public static final ajb<ebk> y = rd.a("patch_large_fern");
   public static final ajb<ebk> z = rd.a("patch_cactus_desert");
   public static final ajb<ebk> A = rd.a("patch_cactus_decorated");
   public static final ajb<ebk> B = rd.a("patch_sugar_cane_swamp");
   public static final ajb<ebk> C = rd.a("patch_sugar_cane_desert");
   public static final ajb<ebk> D = rd.a("patch_sugar_cane_badlands");
   public static final ajb<ebk> E = rd.a("patch_sugar_cane");
   public static final ajb<ebk> F = rd.a("brown_mushroom_nether");
   public static final ajb<ebk> G = rd.a("red_mushroom_nether");
   public static final ajb<ebk> H = rd.a("brown_mushroom_normal");
   public static final ajb<ebk> I = rd.a("red_mushroom_normal");
   public static final ajb<ebk> J = rd.a("brown_mushroom_taiga");
   public static final ajb<ebk> K = rd.a("red_mushroom_taiga");
   public static final ajb<ebk> L = rd.a("brown_mushroom_old_growth");
   public static final ajb<ebk> M = rd.a("red_mushroom_old_growth");
   public static final ajb<ebk> N = rd.a("brown_mushroom_swamp");
   public static final ajb<ebk> O = rd.a("red_mushroom_swamp");
   public static final ajb<ebk> P = rd.a("flower_warm");
   public static final ajb<ebk> Q = rd.a("flower_default");
   public static final ajb<ebk> R = rd.a("flower_flower_forest");
   public static final ajb<ebk> S = rd.a("flower_swamp");
   public static final ajb<ebk> T = rd.a("flower_plains");
   public static final ajb<ebk> U = rd.a("flower_meadow");
   public static final ajb<ebk> V = rd.a("flower_cherry");
   public static final ajb<ebk> W = rd.a("trees_plains");
   public static final ajb<ebk> X = rd.a("dark_forest_vegetation");
   public static final ajb<ebk> Y = rd.a("flower_forest_flowers");
   public static final ajb<ebk> Z = rd.a("forest_flowers");
   public static final ajb<ebk> aa = rd.a("trees_flower_forest");
   public static final ajb<ebk> ab = rd.a("trees_meadow");
   public static final ajb<ebk> ac = rd.a("trees_cherry");
   public static final ajb<ebk> ad = rd.a("trees_taiga");
   public static final ajb<ebk> ae = rd.a("trees_grove");
   public static final ajb<ebk> af = rd.a("trees_badlands");
   public static final ajb<ebk> ag = rd.a("trees_snowy");
   public static final ajb<ebk> ah = rd.a("trees_swamp");
   public static final ajb<ebk> ai = rd.a("trees_windswept_savanna");
   public static final ajb<ebk> aj = rd.a("trees_savanna");
   public static final ajb<ebk> ak = rd.a("birch_tall");
   public static final ajb<ebk> al = rd.a("trees_birch");
   public static final ajb<ebk> am = rd.a("trees_windswept_forest");
   public static final ajb<ebk> an = rd.a("trees_windswept_hills");
   public static final ajb<ebk> ao = rd.a("trees_water");
   public static final ajb<ebk> ap = rd.a("trees_birch_and_oak");
   public static final ajb<ebk> aq = rd.a("trees_sparse_jungle");
   public static final ajb<ebk> ar = rd.a("trees_old_growth_spruce_taiga");
   public static final ajb<ebk> as = rd.a("trees_old_growth_pine_taiga");
   public static final ajb<ebk> at = rd.a("trees_jungle");
   public static final ajb<ebk> au = rd.a("bamboo_vegetation");
   public static final ajb<ebk> av = rd.a("mushroom_island_vegetation");
   public static final ajb<ebk> aw = rd.a("trees_mangrove");
   private static final ebn ax = ebt.a(0);

   public static List<ebn> a(int $$0) {
      return List.of(ebd.a($$0), ebh.a(), rd.c, eay.a());
   }

   private static List<ebn> a(int $$0, @Nullable ebn $$1) {
      Builder<ebn> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ebq.a($$0));
      }

      $$2.add(ebh.a());
      $$2.add(rd.a);
      $$2.add(eay.a());
      return $$2.build();
   }

   private static Builder<ebn> b(ebn $$0) {
      return ImmutableList.builder().add($$0).add(ebh.a()).add(ax).add(rd.d).add(eay.a());
   }

   public static List<ebn> a(ebn $$0) {
      return b($$0).build();
   }

   public static List<ebn> a(ebn $$0, czf $$1) {
      return b($$0).add(eaz.a(dsx.a($$1.o(), ib.c))).build();
   }

   public static void a(pj<ebk> $$0) {
      im<duh<?, ?>> $$1 = $$0.a(ki.ax);
      il<duh<?, ?>> $$2 = $$1.b(qu.a);
      il<duh<?, ?>> $$3 = $$1.b(qu.b);
      il<duh<?, ?>> $$4 = $$1.b(qu.c);
      il<duh<?, ?>> $$5 = $$1.b(qu.f);
      il<duh<?, ?>> $$6 = $$1.b(qu.g);
      il<duh<?, ?>> $$7 = $$1.b(qu.j);
      il<duh<?, ?>> $$8 = $$1.b(qu.i);
      il<duh<?, ?>> $$9 = $$1.b(qu.k);
      il<duh<?, ?>> $$10 = $$1.b(qu.l);
      il<duh<?, ?>> $$11 = $$1.b(qu.m);
      il<duh<?, ?>> $$12 = $$1.b(qu.n);
      il<duh<?, ?>> $$13 = $$1.b(qu.h);
      il<duh<?, ?>> $$14 = $$1.b(qu.o);
      il<duh<?, ?>> $$15 = $$1.b(qu.p);
      il<duh<?, ?>> $$16 = $$1.b(qu.q);
      il<duh<?, ?>> $$17 = $$1.b(qu.r);
      il<duh<?, ?>> $$18 = $$1.b(qu.s);
      il<duh<?, ?>> $$19 = $$1.b(qu.d);
      il<duh<?, ?>> $$20 = $$1.b(qu.e);
      il<duh<?, ?>> $$21 = $$1.b(qu.t);
      il<duh<?, ?>> $$22 = $$1.b(qu.u);
      il<duh<?, ?>> $$23 = $$1.b(qu.v);
      il<duh<?, ?>> $$24 = $$1.b(qu.w);
      il<duh<?, ?>> $$25 = $$1.b(qu.x);
      il<duh<?, ?>> $$26 = $$1.b(qu.y);
      il<duh<?, ?>> $$27 = $$1.b(qu.K);
      il<duh<?, ?>> $$28 = $$1.b(qu.A);
      il<duh<?, ?>> $$29 = $$1.b(qu.z);
      il<duh<?, ?>> $$30 = $$1.b(qu.B);
      il<duh<?, ?>> $$31 = $$1.b(qu.C);
      il<duh<?, ?>> $$32 = $$1.b(qu.D);
      il<duh<?, ?>> $$33 = $$1.b(qu.E);
      il<duh<?, ?>> $$34 = $$1.b(qt.g);
      il<duh<?, ?>> $$35 = $$1.b(qt.k);
      il<duh<?, ?>> $$36 = $$1.b(qt.K);
      il<duh<?, ?>> $$37 = $$1.b(qt.u);
      il<duh<?, ?>> $$38 = $$1.b(qu.F);
      il<duh<?, ?>> $$39 = $$1.b(qu.G);
      il<duh<?, ?>> $$40 = $$1.b(qt.D);
      il<duh<?, ?>> $$41 = $$1.b(qu.H);
      il<duh<?, ?>> $$42 = $$1.b(qu.I);
      il<duh<?, ?>> $$43 = $$1.b(qu.J);
      il<duh<?, ?>> $$44 = $$1.b(qu.L);
      il<duh<?, ?>> $$45 = $$1.b(qu.M);
      il<duh<?, ?>> $$46 = $$1.b(qu.N);
      il<duh<?, ?>> $$47 = $$1.b(qu.O);
      il<duh<?, ?>> $$48 = $$1.b(qu.P);
      il<duh<?, ?>> $$49 = $$1.b(qu.Q);
      il<duh<?, ?>> $$50 = $$1.b(qu.R);
      rd.a($$0, a, $$2, ebq.a(4), ebh.a(), rd.a, eay.a());
      rd.a($$0, b, $$3, ebi.a(160, 80.0, 0.3), ebh.a(), rd.c, eay.a());
      rd.a($$0, c, $$4, ebd.a(127), ebh.a(), ebf.a(dsk.a(64), dsk.a(100)), eay.a());
      rd.a($$0, d, $$5, ebq.a(3), ebh.a(), rd.a, eay.a());
      rd.a($$0, e, $$6, ebq.a(300), ebh.a(), rd.a, eay.a());
      rd.a($$0, f, $$7, ebj.a(-0.8, 5, 10), ebh.a(), rd.c, eay.a());
      rd.a($$0, g, $$7, a(2));
      rd.a($$0, h, $$7, ebh.a(), rd.c, eay.a());
      rd.a($$0, i, $$7, a(20));
      rd.a($$0, j, $$7, a(5));
      rd.a($$0, k, $$8, ebh.a(), rd.c, eay.a());
      rd.a($$0, l, $$8, a(7));
      rd.a($$0, m, $$9, a(25));
      rd.a($$0, n, $$10, rd.a());
      rd.a($$0, o, $$11, a(2));
      rd.a($$0, p, $$11, ebh.a(), rd.c, eay.a());
      rd.a($$0, q, $$11, a(20));
      rd.a($$0, r, $$12, ebq.a(6), ebh.a(), rd.a, eay.a());
      rd.a($$0, s, $$12, ebq.a(64), ebh.a(), rd.a, eay.a());
      rd.a($$0, t, $$13, ebq.a(32), ebh.a(), rd.c, eay.a());
      rd.a($$0, u, $$13, ebq.a(384), ebh.a(), rd.c, eay.a());
      rd.a($$0, v, $$14, a(4));
      rd.a($$0, w, $$15, ebj.a(-0.8, 0, 7), ebq.a(32), ebh.a(), rd.a, eay.a());
      rd.a($$0, x, $$15, ebq.a(5), ebh.a(), rd.a, eay.a());
      rd.a($$0, y, $$16, ebq.a(5), ebh.a(), rd.a, eay.a());
      rd.a($$0, z, $$17, ebq.a(6), ebh.a(), rd.a, eay.a());
      rd.a($$0, A, $$17, ebq.a(13), ebh.a(), rd.a, eay.a());
      rd.a($$0, B, $$18, ebq.a(3), ebh.a(), rd.a, eay.a());
      rd.a($$0, C, $$18, ebh.a(), rd.a, eay.a());
      rd.a($$0, D, $$18, ebq.a(5), ebh.a(), rd.a, eay.a());
      rd.a($$0, E, $$18, ebq.a(6), ebh.a(), rd.a, eay.a());
      rd.a($$0, F, $$19, ebq.a(2), ebh.a(), rd.e, eay.a());
      rd.a($$0, G, $$20, ebq.a(2), ebh.a(), rd.e, eay.a());
      rd.a($$0, H, $$19, a(256, null));
      rd.a($$0, I, $$20, a(512, null));
      rd.a($$0, J, $$19, a(4, null));
      rd.a($$0, K, $$20, a(256, null));
      rd.a($$0, L, $$19, a(4, ebd.a(3)));
      rd.a($$0, M, $$20, a(171, null));
      rd.a($$0, N, $$19, a(0, ebd.a(2)));
      rd.a($$0, O, $$20, a(64, null));
      rd.a($$0, P, $$21, ebq.a(16), ebh.a(), rd.a, eay.a());
      rd.a($$0, Q, $$21, ebq.a(32), ebh.a(), rd.a, eay.a());
      rd.a($$0, R, $$22, ebd.a(3), ebq.a(2), ebh.a(), rd.a, eay.a());
      rd.a($$0, S, $$23, ebq.a(32), ebh.a(), rd.a, eay.a());
      rd.a($$0, T, $$24, ebj.a(-0.8, 15, 4), ebq.a(32), ebh.a(), rd.a, eay.a());
      rd.a($$0, V, $$26, ebj.a(-0.8, 5, 10), ebh.a(), rd.a, eay.a());
      rd.a($$0, U, $$25, ebh.a(), rd.a, eay.a());
      ebn $$51 = ebt.a(0);
      rd.a($$0, W, $$27, rd.a(0, 0.05F, 1), ebh.a(), $$51, rd.d, eaz.a(dsx.a(czh.x.o(), ib.c)), eay.a());
      rd.a($$0, X, $$28, ebd.a(16), ebh.a(), $$51, rd.d, eay.a());
      rd.a($$0, Y, $$29, ebq.a(7), ebh.a(), rd.a, ebd.a(blj.a(blw.a(-1, 3), 0, 3)), eay.a());
      rd.a($$0, Z, $$29, ebq.a(7), ebh.a(), rd.a, ebd.a(blj.a(blw.a(-3, 1), 0, 1)), eay.a());
      rd.a($$0, aa, $$30, a(rd.a(6, 0.1F, 1)));
      rd.a($$0, ab, $$31, a(ebq.a(100)));
      rd.a($$0, ac, $$36, a(rd.a(10, 0.1F, 1), czh.C));
      rd.a($$0, ad, $$32, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, ae, $$33, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, af, $$34, a(rd.a(5, 0.1F, 1), czh.x));
      rd.a($$0, ag, $$35, a(rd.a(0, 0.1F, 1), czh.y));
      rd.a($$0, ah, $$37, rd.a(2, 0.1F, 1), ebh.a(), ebt.a(2), rd.d, eay.a(), eaz.a(dsx.a(czh.x.o(), ib.c)));
      rd.a($$0, ai, $$38, a(rd.a(2, 0.1F, 1)));
      rd.a($$0, aj, $$38, a(rd.a(1, 0.1F, 1)));
      rd.a($$0, ak, $$39, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, al, $$40, a(rd.a(10, 0.1F, 1), czh.z));
      rd.a($$0, am, $$41, a(rd.a(3, 0.1F, 1)));
      rd.a($$0, an, $$41, a(rd.a(0, 0.1F, 1)));
      rd.a($$0, ao, $$42, a(rd.a(0, 0.1F, 1)));
      rd.a($$0, ap, $$43, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, aq, $$44, a(rd.a(2, 0.1F, 1)));
      rd.a($$0, ar, $$45, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, as, $$46, a(rd.a(10, 0.1F, 1)));
      rd.a($$0, at, $$47, a(rd.a(50, 0.1F, 1)));
      rd.a($$0, au, $$48, a(rd.a(30, 0.1F, 1)));
      rd.a($$0, av, $$49, ebh.a(), rd.a, eay.a());
      rd.a($$0, aw, $$50, ebd.a(25), ebh.a(), ebt.a(5), rd.d, eay.a(), eaz.a(dsx.a(czh.E.o(), ib.c)));
   }
}
