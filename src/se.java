import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class se {
   public static final akj<eib> a = sc.a("bamboo_light");
   public static final akj<eib> b = sc.a("bamboo");
   public static final akj<eib> c = sc.a("vines");
   public static final akj<eib> d = sc.a("patch_sunflower");
   public static final akj<eib> e = sc.a("patch_pumpkin");
   public static final akj<eib> f = sc.a("patch_grass_plain");
   public static final akj<eib> g = sc.a("patch_grass_forest");
   public static final akj<eib> h = sc.a("patch_grass_badlands");
   public static final akj<eib> i = sc.a("patch_grass_savanna");
   public static final akj<eib> j = sc.a("patch_grass_normal");
   public static final akj<eib> k = sc.a("patch_grass_taiga_2");
   public static final akj<eib> l = sc.a("patch_grass_taiga");
   public static final akj<eib> m = sc.a("patch_grass_jungle");
   public static final akj<eib> n = sc.a("grass_bonemeal");
   public static final akj<eib> o = sc.a("patch_dead_bush_2");
   public static final akj<eib> p = sc.a("patch_dead_bush");
   public static final akj<eib> q = sc.a("patch_dead_bush_badlands");
   public static final akj<eib> r = sc.a("patch_melon");
   public static final akj<eib> s = sc.a("patch_melon_sparse");
   public static final akj<eib> t = sc.a("patch_berry_common");
   public static final akj<eib> u = sc.a("patch_berry_rare");
   public static final akj<eib> v = sc.a("patch_waterlily");
   public static final akj<eib> w = sc.a("patch_tall_grass_2");
   public static final akj<eib> x = sc.a("patch_tall_grass");
   public static final akj<eib> y = sc.a("patch_large_fern");
   public static final akj<eib> z = sc.a("patch_cactus_desert");
   public static final akj<eib> A = sc.a("patch_cactus_decorated");
   public static final akj<eib> B = sc.a("patch_sugar_cane_swamp");
   public static final akj<eib> C = sc.a("patch_sugar_cane_desert");
   public static final akj<eib> D = sc.a("patch_sugar_cane_badlands");
   public static final akj<eib> E = sc.a("patch_sugar_cane");
   public static final akj<eib> F = sc.a("brown_mushroom_nether");
   public static final akj<eib> G = sc.a("red_mushroom_nether");
   public static final akj<eib> H = sc.a("brown_mushroom_normal");
   public static final akj<eib> I = sc.a("red_mushroom_normal");
   public static final akj<eib> J = sc.a("brown_mushroom_taiga");
   public static final akj<eib> K = sc.a("red_mushroom_taiga");
   public static final akj<eib> L = sc.a("brown_mushroom_old_growth");
   public static final akj<eib> M = sc.a("red_mushroom_old_growth");
   public static final akj<eib> N = sc.a("brown_mushroom_swamp");
   public static final akj<eib> O = sc.a("red_mushroom_swamp");
   public static final akj<eib> P = sc.a("flower_warm");
   public static final akj<eib> Q = sc.a("flower_default");
   public static final akj<eib> R = sc.a("flower_flower_forest");
   public static final akj<eib> S = sc.a("flower_swamp");
   public static final akj<eib> T = sc.a("flower_plains");
   public static final akj<eib> U = sc.a("flower_meadow");
   public static final akj<eib> V = sc.a("flower_cherry");
   public static final akj<eib> W = sc.a("trees_plains");
   public static final akj<eib> X = sc.a("dark_forest_vegetation");
   public static final akj<eib> Y = sc.a("flower_forest_flowers");
   public static final akj<eib> Z = sc.a("forest_flowers");
   public static final akj<eib> aa = sc.a("trees_flower_forest");
   public static final akj<eib> ab = sc.a("trees_meadow");
   public static final akj<eib> ac = sc.a("trees_cherry");
   public static final akj<eib> ad = sc.a("trees_taiga");
   public static final akj<eib> ae = sc.a("trees_grove");
   public static final akj<eib> af = sc.a("trees_badlands");
   public static final akj<eib> ag = sc.a("trees_snowy");
   public static final akj<eib> ah = sc.a("trees_swamp");
   public static final akj<eib> ai = sc.a("trees_windswept_savanna");
   public static final akj<eib> aj = sc.a("trees_savanna");
   public static final akj<eib> ak = sc.a("birch_tall");
   public static final akj<eib> al = sc.a("trees_birch");
   public static final akj<eib> am = sc.a("trees_windswept_forest");
   public static final akj<eib> an = sc.a("trees_windswept_hills");
   public static final akj<eib> ao = sc.a("trees_water");
   public static final akj<eib> ap = sc.a("trees_birch_and_oak");
   public static final akj<eib> aq = sc.a("trees_sparse_jungle");
   public static final akj<eib> ar = sc.a("trees_old_growth_spruce_taiga");
   public static final akj<eib> as = sc.a("trees_old_growth_pine_taiga");
   public static final akj<eib> at = sc.a("trees_jungle");
   public static final akj<eib> au = sc.a("bamboo_vegetation");
   public static final akj<eib> av = sc.a("mushroom_island_vegetation");
   public static final akj<eib> aw = sc.a("trees_mangrove");
   private static final eie ax = eik.a(0);

   public static List<eie> a(int $$0) {
      return List.of(ehu.a($$0), ehy.a(), sc.c, ehp.a());
   }

   private static List<eie> a(int $$0, @Nullable eie $$1) {
      Builder<eie> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eih.a($$0));
      }

      $$2.add(ehy.a());
      $$2.add(sc.a);
      $$2.add(ehp.a());
      return $$2.build();
   }

   private static Builder<eie> b(eie $$0) {
      return ImmutableList.builder().add($$0).add(ehy.a()).add(ax).add(sc.d).add(ehp.a());
   }

   public static List<eie> a(eie $$0) {
      return b($$0).build();
   }

   public static List<eie> a(eie $$0, dfi $$1) {
      return b($$0).add(ehq.a(dzn.a($$1.o(), ja.c))).build();
   }

   public static void a(qm<eib> $$0) {
      jk<eay<?, ?>> $$1 = $$0.a(lr.aH);
      jj<eay<?, ?>> $$2 = $$1.b(rt.a);
      jj<eay<?, ?>> $$3 = $$1.b(rt.b);
      jj<eay<?, ?>> $$4 = $$1.b(rt.c);
      jj<eay<?, ?>> $$5 = $$1.b(rt.f);
      jj<eay<?, ?>> $$6 = $$1.b(rt.g);
      jj<eay<?, ?>> $$7 = $$1.b(rt.j);
      jj<eay<?, ?>> $$8 = $$1.b(rt.i);
      jj<eay<?, ?>> $$9 = $$1.b(rt.k);
      jj<eay<?, ?>> $$10 = $$1.b(rt.l);
      jj<eay<?, ?>> $$11 = $$1.b(rt.m);
      jj<eay<?, ?>> $$12 = $$1.b(rt.n);
      jj<eay<?, ?>> $$13 = $$1.b(rt.h);
      jj<eay<?, ?>> $$14 = $$1.b(rt.o);
      jj<eay<?, ?>> $$15 = $$1.b(rt.p);
      jj<eay<?, ?>> $$16 = $$1.b(rt.q);
      jj<eay<?, ?>> $$17 = $$1.b(rt.r);
      jj<eay<?, ?>> $$18 = $$1.b(rt.s);
      jj<eay<?, ?>> $$19 = $$1.b(rt.d);
      jj<eay<?, ?>> $$20 = $$1.b(rt.e);
      jj<eay<?, ?>> $$21 = $$1.b(rt.t);
      jj<eay<?, ?>> $$22 = $$1.b(rt.u);
      jj<eay<?, ?>> $$23 = $$1.b(rt.v);
      jj<eay<?, ?>> $$24 = $$1.b(rt.w);
      jj<eay<?, ?>> $$25 = $$1.b(rt.x);
      jj<eay<?, ?>> $$26 = $$1.b(rt.y);
      jj<eay<?, ?>> $$27 = $$1.b(rt.K);
      jj<eay<?, ?>> $$28 = $$1.b(rt.A);
      jj<eay<?, ?>> $$29 = $$1.b(rt.z);
      jj<eay<?, ?>> $$30 = $$1.b(rt.B);
      jj<eay<?, ?>> $$31 = $$1.b(rt.C);
      jj<eay<?, ?>> $$32 = $$1.b(rt.D);
      jj<eay<?, ?>> $$33 = $$1.b(rt.E);
      jj<eay<?, ?>> $$34 = $$1.b(rs.g);
      jj<eay<?, ?>> $$35 = $$1.b(rs.k);
      jj<eay<?, ?>> $$36 = $$1.b(rs.K);
      jj<eay<?, ?>> $$37 = $$1.b(rs.u);
      jj<eay<?, ?>> $$38 = $$1.b(rt.F);
      jj<eay<?, ?>> $$39 = $$1.b(rt.G);
      jj<eay<?, ?>> $$40 = $$1.b(rs.D);
      jj<eay<?, ?>> $$41 = $$1.b(rt.H);
      jj<eay<?, ?>> $$42 = $$1.b(rt.I);
      jj<eay<?, ?>> $$43 = $$1.b(rt.J);
      jj<eay<?, ?>> $$44 = $$1.b(rt.L);
      jj<eay<?, ?>> $$45 = $$1.b(rt.M);
      jj<eay<?, ?>> $$46 = $$1.b(rt.N);
      jj<eay<?, ?>> $$47 = $$1.b(rt.O);
      jj<eay<?, ?>> $$48 = $$1.b(rt.P);
      jj<eay<?, ?>> $$49 = $$1.b(rt.Q);
      jj<eay<?, ?>> $$50 = $$1.b(rt.R);
      sc.a($$0, a, $$2, eih.a(4), ehy.a(), sc.a, ehp.a());
      sc.a($$0, b, $$3, ehz.a(160, 80.0, 0.3), ehy.a(), sc.c, ehp.a());
      sc.a($$0, c, $$4, ehu.a(127), ehy.a(), ehw.a(dza.a(64), dza.a(100)), ehp.a());
      sc.a($$0, d, $$5, eih.a(3), ehy.a(), sc.a, ehp.a());
      sc.a($$0, e, $$6, eih.a(300), ehy.a(), sc.a, ehp.a());
      sc.a($$0, f, $$7, eia.a(-0.8, 5, 10), ehy.a(), sc.c, ehp.a());
      sc.a($$0, g, $$7, a(2));
      sc.a($$0, h, $$7, ehy.a(), sc.c, ehp.a());
      sc.a($$0, i, $$7, a(20));
      sc.a($$0, j, $$7, a(5));
      sc.a($$0, k, $$8, ehy.a(), sc.c, ehp.a());
      sc.a($$0, l, $$8, a(7));
      sc.a($$0, m, $$9, a(25));
      sc.a($$0, n, $$10, sc.a());
      sc.a($$0, o, $$11, a(2));
      sc.a($$0, p, $$11, ehy.a(), sc.c, ehp.a());
      sc.a($$0, q, $$11, a(20));
      sc.a($$0, r, $$12, eih.a(6), ehy.a(), sc.a, ehp.a());
      sc.a($$0, s, $$12, eih.a(64), ehy.a(), sc.a, ehp.a());
      sc.a($$0, t, $$13, eih.a(32), ehy.a(), sc.c, ehp.a());
      sc.a($$0, u, $$13, eih.a(384), ehy.a(), sc.c, ehp.a());
      sc.a($$0, v, $$14, a(4));
      sc.a($$0, w, $$15, eia.a(-0.8, 0, 7), eih.a(32), ehy.a(), sc.a, ehp.a());
      sc.a($$0, x, $$15, eih.a(5), ehy.a(), sc.a, ehp.a());
      sc.a($$0, y, $$16, eih.a(5), ehy.a(), sc.a, ehp.a());
      sc.a($$0, z, $$17, eih.a(6), ehy.a(), sc.a, ehp.a());
      sc.a($$0, A, $$17, eih.a(13), ehy.a(), sc.a, ehp.a());
      sc.a($$0, B, $$18, eih.a(3), ehy.a(), sc.a, ehp.a());
      sc.a($$0, C, $$18, ehy.a(), sc.a, ehp.a());
      sc.a($$0, D, $$18, eih.a(5), ehy.a(), sc.a, ehp.a());
      sc.a($$0, E, $$18, eih.a(6), ehy.a(), sc.a, ehp.a());
      sc.a($$0, F, $$19, eih.a(2), ehy.a(), sc.e, ehp.a());
      sc.a($$0, G, $$20, eih.a(2), ehy.a(), sc.e, ehp.a());
      sc.a($$0, H, $$19, a(256, null));
      sc.a($$0, I, $$20, a(512, null));
      sc.a($$0, J, $$19, a(4, null));
      sc.a($$0, K, $$20, a(256, null));
      sc.a($$0, L, $$19, a(4, ehu.a(3)));
      sc.a($$0, M, $$20, a(171, null));
      sc.a($$0, N, $$19, a(0, ehu.a(2)));
      sc.a($$0, O, $$20, a(64, null));
      sc.a($$0, P, $$21, eih.a(16), ehy.a(), sc.a, ehp.a());
      sc.a($$0, Q, $$21, eih.a(32), ehy.a(), sc.a, ehp.a());
      sc.a($$0, R, $$22, ehu.a(3), eih.a(2), ehy.a(), sc.a, ehp.a());
      sc.a($$0, S, $$23, eih.a(32), ehy.a(), sc.a, ehp.a());
      sc.a($$0, T, $$24, eia.a(-0.8, 15, 4), eih.a(32), ehy.a(), sc.a, ehp.a());
      sc.a($$0, V, $$26, eia.a(-0.8, 5, 10), ehy.a(), sc.a, ehp.a());
      sc.a($$0, U, $$25, ehy.a(), sc.a, ehp.a());
      eie $$51 = eik.a(0);
      sc.a($$0, W, $$27, sc.a(0, 0.05F, 1), ehy.a(), $$51, sc.d, ehq.a(dzn.a(dfk.x.o(), ja.c)), ehp.a());
      sc.a($$0, X, $$28, ehu.a(16), ehy.a(), $$51, sc.d, ehp.a());
      sc.a($$0, Y, $$29, eih.a(7), ehy.a(), sc.a, ehu.a(bpf.a(bps.a(-1, 3), 0, 3)), ehp.a());
      sc.a($$0, Z, $$29, eih.a(7), ehy.a(), sc.a, ehu.a(bpf.a(bps.a(-3, 1), 0, 1)), ehp.a());
      sc.a($$0, aa, $$30, a(sc.a(6, 0.1F, 1)));
      sc.a($$0, ab, $$31, a(eih.a(100)));
      sc.a($$0, ac, $$36, a(sc.a(10, 0.1F, 1), dfk.C));
      sc.a($$0, ad, $$32, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, ae, $$33, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, af, $$34, a(sc.a(5, 0.1F, 1), dfk.x));
      sc.a($$0, ag, $$35, a(sc.a(0, 0.1F, 1), dfk.y));
      sc.a($$0, ah, $$37, sc.a(2, 0.1F, 1), ehy.a(), eik.a(2), sc.d, ehp.a(), ehq.a(dzn.a(dfk.x.o(), ja.c)));
      sc.a($$0, ai, $$38, a(sc.a(2, 0.1F, 1)));
      sc.a($$0, aj, $$38, a(sc.a(1, 0.1F, 1)));
      sc.a($$0, ak, $$39, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, al, $$40, a(sc.a(10, 0.1F, 1), dfk.z));
      sc.a($$0, am, $$41, a(sc.a(3, 0.1F, 1)));
      sc.a($$0, an, $$41, a(sc.a(0, 0.1F, 1)));
      sc.a($$0, ao, $$42, a(sc.a(0, 0.1F, 1)));
      sc.a($$0, ap, $$43, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, aq, $$44, a(sc.a(2, 0.1F, 1)));
      sc.a($$0, ar, $$45, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, as, $$46, a(sc.a(10, 0.1F, 1)));
      sc.a($$0, at, $$47, a(sc.a(50, 0.1F, 1)));
      sc.a($$0, au, $$48, a(sc.a(30, 0.1F, 1)));
      sc.a($$0, av, $$49, ehy.a(), sc.a, ehp.a());
      sc.a($$0, aw, $$50, ehu.a(25), ehy.a(), eik.a(5), sc.d, ehp.a(), ehq.a(dzn.a(dfk.E.o(), ja.c)));
   }
}
