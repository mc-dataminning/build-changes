import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sh {
   public static final akp<eiq> a = sf.a("bamboo_light");
   public static final akp<eiq> b = sf.a("bamboo");
   public static final akp<eiq> c = sf.a("vines");
   public static final akp<eiq> d = sf.a("patch_sunflower");
   public static final akp<eiq> e = sf.a("patch_pumpkin");
   public static final akp<eiq> f = sf.a("patch_grass_plain");
   public static final akp<eiq> g = sf.a("patch_grass_forest");
   public static final akp<eiq> h = sf.a("patch_grass_badlands");
   public static final akp<eiq> i = sf.a("patch_grass_savanna");
   public static final akp<eiq> j = sf.a("patch_grass_normal");
   public static final akp<eiq> k = sf.a("patch_grass_taiga_2");
   public static final akp<eiq> l = sf.a("patch_grass_taiga");
   public static final akp<eiq> m = sf.a("patch_grass_jungle");
   public static final akp<eiq> n = sf.a("grass_bonemeal");
   public static final akp<eiq> o = sf.a("patch_dead_bush_2");
   public static final akp<eiq> p = sf.a("patch_dead_bush");
   public static final akp<eiq> q = sf.a("patch_dead_bush_badlands");
   public static final akp<eiq> r = sf.a("patch_melon");
   public static final akp<eiq> s = sf.a("patch_melon_sparse");
   public static final akp<eiq> t = sf.a("patch_berry_common");
   public static final akp<eiq> u = sf.a("patch_berry_rare");
   public static final akp<eiq> v = sf.a("patch_waterlily");
   public static final akp<eiq> w = sf.a("patch_tall_grass_2");
   public static final akp<eiq> x = sf.a("patch_tall_grass");
   public static final akp<eiq> y = sf.a("patch_large_fern");
   public static final akp<eiq> z = sf.a("patch_cactus_desert");
   public static final akp<eiq> A = sf.a("patch_cactus_decorated");
   public static final akp<eiq> B = sf.a("patch_sugar_cane_swamp");
   public static final akp<eiq> C = sf.a("patch_sugar_cane_desert");
   public static final akp<eiq> D = sf.a("patch_sugar_cane_badlands");
   public static final akp<eiq> E = sf.a("patch_sugar_cane");
   public static final akp<eiq> F = sf.a("brown_mushroom_nether");
   public static final akp<eiq> G = sf.a("red_mushroom_nether");
   public static final akp<eiq> H = sf.a("brown_mushroom_normal");
   public static final akp<eiq> I = sf.a("red_mushroom_normal");
   public static final akp<eiq> J = sf.a("brown_mushroom_taiga");
   public static final akp<eiq> K = sf.a("red_mushroom_taiga");
   public static final akp<eiq> L = sf.a("brown_mushroom_old_growth");
   public static final akp<eiq> M = sf.a("red_mushroom_old_growth");
   public static final akp<eiq> N = sf.a("brown_mushroom_swamp");
   public static final akp<eiq> O = sf.a("red_mushroom_swamp");
   public static final akp<eiq> P = sf.a("flower_warm");
   public static final akp<eiq> Q = sf.a("flower_default");
   public static final akp<eiq> R = sf.a("flower_flower_forest");
   public static final akp<eiq> S = sf.a("flower_swamp");
   public static final akp<eiq> T = sf.a("flower_plains");
   public static final akp<eiq> U = sf.a("flower_meadow");
   public static final akp<eiq> V = sf.a("flower_cherry");
   public static final akp<eiq> W = sf.a("trees_plains");
   public static final akp<eiq> X = sf.a("dark_forest_vegetation");
   public static final akp<eiq> Y = sf.a("flower_forest_flowers");
   public static final akp<eiq> Z = sf.a("forest_flowers");
   public static final akp<eiq> aa = sf.a("trees_flower_forest");
   public static final akp<eiq> ab = sf.a("trees_meadow");
   public static final akp<eiq> ac = sf.a("trees_cherry");
   public static final akp<eiq> ad = sf.a("trees_taiga");
   public static final akp<eiq> ae = sf.a("trees_grove");
   public static final akp<eiq> af = sf.a("trees_badlands");
   public static final akp<eiq> ag = sf.a("trees_snowy");
   public static final akp<eiq> ah = sf.a("trees_swamp");
   public static final akp<eiq> ai = sf.a("trees_windswept_savanna");
   public static final akp<eiq> aj = sf.a("trees_savanna");
   public static final akp<eiq> ak = sf.a("birch_tall");
   public static final akp<eiq> al = sf.a("trees_birch");
   public static final akp<eiq> am = sf.a("trees_windswept_forest");
   public static final akp<eiq> an = sf.a("trees_windswept_hills");
   public static final akp<eiq> ao = sf.a("trees_water");
   public static final akp<eiq> ap = sf.a("trees_birch_and_oak");
   public static final akp<eiq> aq = sf.a("trees_sparse_jungle");
   public static final akp<eiq> ar = sf.a("trees_old_growth_spruce_taiga");
   public static final akp<eiq> as = sf.a("trees_old_growth_pine_taiga");
   public static final akp<eiq> at = sf.a("trees_jungle");
   public static final akp<eiq> au = sf.a("bamboo_vegetation");
   public static final akp<eiq> av = sf.a("mushroom_island_vegetation");
   public static final akp<eiq> aw = sf.a("trees_mangrove");
   private static final eit ax = eiz.a(0);

   public static List<eit> a(int $$0) {
      return List.of(eij.a($$0), ein.a(), sf.c, eie.a());
   }

   private static List<eit> a(int $$0, @Nullable eit $$1) {
      Builder<eit> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eiw.a($$0));
      }

      $$2.add(ein.a());
      $$2.add(sf.a);
      $$2.add(eie.a());
      return $$2.build();
   }

   private static Builder<eit> b(eit $$0) {
      return ImmutableList.builder().add($$0).add(ein.a()).add(ax).add(sf.d).add(eie.a());
   }

   public static List<eit> a(eit $$0) {
      return b($$0).build();
   }

   public static List<eit> a(eit $$0, dfw $$1) {
      return b($$0).add(eif.a(eac.a($$1.o(), jd.c))).build();
   }

   public static void a(qp<eiq> $$0) {
      jn<ebn<?, ?>> $$1 = $$0.a(lu.aI);
      jm<ebn<?, ?>> $$2 = $$1.b(rw.a);
      jm<ebn<?, ?>> $$3 = $$1.b(rw.b);
      jm<ebn<?, ?>> $$4 = $$1.b(rw.c);
      jm<ebn<?, ?>> $$5 = $$1.b(rw.f);
      jm<ebn<?, ?>> $$6 = $$1.b(rw.g);
      jm<ebn<?, ?>> $$7 = $$1.b(rw.j);
      jm<ebn<?, ?>> $$8 = $$1.b(rw.i);
      jm<ebn<?, ?>> $$9 = $$1.b(rw.k);
      jm<ebn<?, ?>> $$10 = $$1.b(rw.l);
      jm<ebn<?, ?>> $$11 = $$1.b(rw.m);
      jm<ebn<?, ?>> $$12 = $$1.b(rw.n);
      jm<ebn<?, ?>> $$13 = $$1.b(rw.h);
      jm<ebn<?, ?>> $$14 = $$1.b(rw.o);
      jm<ebn<?, ?>> $$15 = $$1.b(rw.p);
      jm<ebn<?, ?>> $$16 = $$1.b(rw.q);
      jm<ebn<?, ?>> $$17 = $$1.b(rw.r);
      jm<ebn<?, ?>> $$18 = $$1.b(rw.s);
      jm<ebn<?, ?>> $$19 = $$1.b(rw.d);
      jm<ebn<?, ?>> $$20 = $$1.b(rw.e);
      jm<ebn<?, ?>> $$21 = $$1.b(rw.t);
      jm<ebn<?, ?>> $$22 = $$1.b(rw.u);
      jm<ebn<?, ?>> $$23 = $$1.b(rw.v);
      jm<ebn<?, ?>> $$24 = $$1.b(rw.w);
      jm<ebn<?, ?>> $$25 = $$1.b(rw.x);
      jm<ebn<?, ?>> $$26 = $$1.b(rw.y);
      jm<ebn<?, ?>> $$27 = $$1.b(rw.K);
      jm<ebn<?, ?>> $$28 = $$1.b(rw.A);
      jm<ebn<?, ?>> $$29 = $$1.b(rw.z);
      jm<ebn<?, ?>> $$30 = $$1.b(rw.B);
      jm<ebn<?, ?>> $$31 = $$1.b(rw.C);
      jm<ebn<?, ?>> $$32 = $$1.b(rw.D);
      jm<ebn<?, ?>> $$33 = $$1.b(rw.E);
      jm<ebn<?, ?>> $$34 = $$1.b(rv.g);
      jm<ebn<?, ?>> $$35 = $$1.b(rv.k);
      jm<ebn<?, ?>> $$36 = $$1.b(rv.K);
      jm<ebn<?, ?>> $$37 = $$1.b(rv.u);
      jm<ebn<?, ?>> $$38 = $$1.b(rw.F);
      jm<ebn<?, ?>> $$39 = $$1.b(rw.G);
      jm<ebn<?, ?>> $$40 = $$1.b(rv.D);
      jm<ebn<?, ?>> $$41 = $$1.b(rw.H);
      jm<ebn<?, ?>> $$42 = $$1.b(rw.I);
      jm<ebn<?, ?>> $$43 = $$1.b(rw.J);
      jm<ebn<?, ?>> $$44 = $$1.b(rw.L);
      jm<ebn<?, ?>> $$45 = $$1.b(rw.M);
      jm<ebn<?, ?>> $$46 = $$1.b(rw.N);
      jm<ebn<?, ?>> $$47 = $$1.b(rw.O);
      jm<ebn<?, ?>> $$48 = $$1.b(rw.P);
      jm<ebn<?, ?>> $$49 = $$1.b(rw.Q);
      jm<ebn<?, ?>> $$50 = $$1.b(rw.R);
      sf.a($$0, a, $$2, eiw.a(4), ein.a(), sf.a, eie.a());
      sf.a($$0, b, $$3, eio.a(160, 80.0, 0.3), ein.a(), sf.c, eie.a());
      sf.a($$0, c, $$4, eij.a(127), ein.a(), eil.a(dzp.a(64), dzp.a(100)), eie.a());
      sf.a($$0, d, $$5, eiw.a(3), ein.a(), sf.a, eie.a());
      sf.a($$0, e, $$6, eiw.a(300), ein.a(), sf.a, eie.a());
      sf.a($$0, f, $$7, eip.a(-0.8, 5, 10), ein.a(), sf.c, eie.a());
      sf.a($$0, g, $$7, a(2));
      sf.a($$0, h, $$7, ein.a(), sf.c, eie.a());
      sf.a($$0, i, $$7, a(20));
      sf.a($$0, j, $$7, a(5));
      sf.a($$0, k, $$8, ein.a(), sf.c, eie.a());
      sf.a($$0, l, $$8, a(7));
      sf.a($$0, m, $$9, a(25));
      sf.a($$0, n, $$10, sf.a());
      sf.a($$0, o, $$11, a(2));
      sf.a($$0, p, $$11, ein.a(), sf.c, eie.a());
      sf.a($$0, q, $$11, a(20));
      sf.a($$0, r, $$12, eiw.a(6), ein.a(), sf.a, eie.a());
      sf.a($$0, s, $$12, eiw.a(64), ein.a(), sf.a, eie.a());
      sf.a($$0, t, $$13, eiw.a(32), ein.a(), sf.c, eie.a());
      sf.a($$0, u, $$13, eiw.a(384), ein.a(), sf.c, eie.a());
      sf.a($$0, v, $$14, a(4));
      sf.a($$0, w, $$15, eip.a(-0.8, 0, 7), eiw.a(32), ein.a(), sf.a, eie.a());
      sf.a($$0, x, $$15, eiw.a(5), ein.a(), sf.a, eie.a());
      sf.a($$0, y, $$16, eiw.a(5), ein.a(), sf.a, eie.a());
      sf.a($$0, z, $$17, eiw.a(6), ein.a(), sf.a, eie.a());
      sf.a($$0, A, $$17, eiw.a(13), ein.a(), sf.a, eie.a());
      sf.a($$0, B, $$18, eiw.a(3), ein.a(), sf.a, eie.a());
      sf.a($$0, C, $$18, ein.a(), sf.a, eie.a());
      sf.a($$0, D, $$18, eiw.a(5), ein.a(), sf.a, eie.a());
      sf.a($$0, E, $$18, eiw.a(6), ein.a(), sf.a, eie.a());
      sf.a($$0, F, $$19, eiw.a(2), ein.a(), sf.e, eie.a());
      sf.a($$0, G, $$20, eiw.a(2), ein.a(), sf.e, eie.a());
      sf.a($$0, H, $$19, a(256, null));
      sf.a($$0, I, $$20, a(512, null));
      sf.a($$0, J, $$19, a(4, null));
      sf.a($$0, K, $$20, a(256, null));
      sf.a($$0, L, $$19, a(4, eij.a(3)));
      sf.a($$0, M, $$20, a(171, null));
      sf.a($$0, N, $$19, a(0, eij.a(2)));
      sf.a($$0, O, $$20, a(64, null));
      sf.a($$0, P, $$21, eiw.a(16), ein.a(), sf.a, eie.a());
      sf.a($$0, Q, $$21, eiw.a(32), ein.a(), sf.a, eie.a());
      sf.a($$0, R, $$22, eij.a(3), eiw.a(2), ein.a(), sf.a, eie.a());
      sf.a($$0, S, $$23, eiw.a(32), ein.a(), sf.a, eie.a());
      sf.a($$0, T, $$24, eip.a(-0.8, 15, 4), eiw.a(32), ein.a(), sf.a, eie.a());
      sf.a($$0, V, $$26, eip.a(-0.8, 5, 10), ein.a(), sf.a, eie.a());
      sf.a($$0, U, $$25, ein.a(), sf.a, eie.a());
      eit $$51 = eiz.a(0);
      sf.a($$0, W, $$27, sf.a(0, 0.05F, 1), ein.a(), $$51, sf.d, eif.a(eac.a(dfy.x.o(), jd.c)), eie.a());
      sf.a($$0, X, $$28, eij.a(16), ein.a(), $$51, sf.d, eie.a());
      sf.a($$0, Y, $$29, eiw.a(7), ein.a(), sf.a, eij.a(bpo.a(bqb.a(-1, 3), 0, 3)), eie.a());
      sf.a($$0, Z, $$29, eiw.a(7), ein.a(), sf.a, eij.a(bpo.a(bqb.a(-3, 1), 0, 1)), eie.a());
      sf.a($$0, aa, $$30, a(sf.a(6, 0.1F, 1)));
      sf.a($$0, ab, $$31, a(eiw.a(100)));
      sf.a($$0, ac, $$36, a(sf.a(10, 0.1F, 1), dfy.C));
      sf.a($$0, ad, $$32, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, ae, $$33, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, af, $$34, a(sf.a(5, 0.1F, 1), dfy.x));
      sf.a($$0, ag, $$35, a(sf.a(0, 0.1F, 1), dfy.y));
      sf.a($$0, ah, $$37, sf.a(2, 0.1F, 1), ein.a(), eiz.a(2), sf.d, eie.a(), eif.a(eac.a(dfy.x.o(), jd.c)));
      sf.a($$0, ai, $$38, a(sf.a(2, 0.1F, 1)));
      sf.a($$0, aj, $$38, a(sf.a(1, 0.1F, 1)));
      sf.a($$0, ak, $$39, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, al, $$40, a(sf.a(10, 0.1F, 1), dfy.z));
      sf.a($$0, am, $$41, a(sf.a(3, 0.1F, 1)));
      sf.a($$0, an, $$41, a(sf.a(0, 0.1F, 1)));
      sf.a($$0, ao, $$42, a(sf.a(0, 0.1F, 1)));
      sf.a($$0, ap, $$43, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, aq, $$44, a(sf.a(2, 0.1F, 1)));
      sf.a($$0, ar, $$45, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, as, $$46, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, at, $$47, a(sf.a(50, 0.1F, 1)));
      sf.a($$0, au, $$48, a(sf.a(30, 0.1F, 1)));
      sf.a($$0, av, $$49, ein.a(), sf.a, eie.a());
      sf.a($$0, aw, $$50, eij.a(25), ein.a(), eiz.a(5), sf.d, eie.a(), eif.a(eac.a(dfy.E.o(), jd.c)));
   }
}
