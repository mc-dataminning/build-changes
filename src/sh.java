import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sh {
   public static final akg<eft> a = sf.a("bamboo_light");
   public static final akg<eft> b = sf.a("bamboo");
   public static final akg<eft> c = sf.a("vines");
   public static final akg<eft> d = sf.a("patch_sunflower");
   public static final akg<eft> e = sf.a("patch_pumpkin");
   public static final akg<eft> f = sf.a("patch_grass_plain");
   public static final akg<eft> g = sf.a("patch_grass_forest");
   public static final akg<eft> h = sf.a("patch_grass_badlands");
   public static final akg<eft> i = sf.a("patch_grass_savanna");
   public static final akg<eft> j = sf.a("patch_grass_normal");
   public static final akg<eft> k = sf.a("patch_grass_taiga_2");
   public static final akg<eft> l = sf.a("patch_grass_taiga");
   public static final akg<eft> m = sf.a("patch_grass_jungle");
   public static final akg<eft> n = sf.a("grass_bonemeal");
   public static final akg<eft> o = sf.a("patch_dead_bush_2");
   public static final akg<eft> p = sf.a("patch_dead_bush");
   public static final akg<eft> q = sf.a("patch_dead_bush_badlands");
   public static final akg<eft> r = sf.a("patch_melon");
   public static final akg<eft> s = sf.a("patch_melon_sparse");
   public static final akg<eft> t = sf.a("patch_berry_common");
   public static final akg<eft> u = sf.a("patch_berry_rare");
   public static final akg<eft> v = sf.a("patch_waterlily");
   public static final akg<eft> w = sf.a("patch_tall_grass_2");
   public static final akg<eft> x = sf.a("patch_tall_grass");
   public static final akg<eft> y = sf.a("patch_large_fern");
   public static final akg<eft> z = sf.a("patch_cactus_desert");
   public static final akg<eft> A = sf.a("patch_cactus_decorated");
   public static final akg<eft> B = sf.a("patch_sugar_cane_swamp");
   public static final akg<eft> C = sf.a("patch_sugar_cane_desert");
   public static final akg<eft> D = sf.a("patch_sugar_cane_badlands");
   public static final akg<eft> E = sf.a("patch_sugar_cane");
   public static final akg<eft> F = sf.a("brown_mushroom_nether");
   public static final akg<eft> G = sf.a("red_mushroom_nether");
   public static final akg<eft> H = sf.a("brown_mushroom_normal");
   public static final akg<eft> I = sf.a("red_mushroom_normal");
   public static final akg<eft> J = sf.a("brown_mushroom_taiga");
   public static final akg<eft> K = sf.a("red_mushroom_taiga");
   public static final akg<eft> L = sf.a("brown_mushroom_old_growth");
   public static final akg<eft> M = sf.a("red_mushroom_old_growth");
   public static final akg<eft> N = sf.a("brown_mushroom_swamp");
   public static final akg<eft> O = sf.a("red_mushroom_swamp");
   public static final akg<eft> P = sf.a("flower_warm");
   public static final akg<eft> Q = sf.a("flower_default");
   public static final akg<eft> R = sf.a("flower_flower_forest");
   public static final akg<eft> S = sf.a("flower_swamp");
   public static final akg<eft> T = sf.a("flower_plains");
   public static final akg<eft> U = sf.a("flower_meadow");
   public static final akg<eft> V = sf.a("flower_cherry");
   public static final akg<eft> W = sf.a("trees_plains");
   public static final akg<eft> X = sf.a("dark_forest_vegetation");
   public static final akg<eft> Y = sf.a("flower_forest_flowers");
   public static final akg<eft> Z = sf.a("forest_flowers");
   public static final akg<eft> aa = sf.a("trees_flower_forest");
   public static final akg<eft> ab = sf.a("trees_meadow");
   public static final akg<eft> ac = sf.a("trees_cherry");
   public static final akg<eft> ad = sf.a("trees_taiga");
   public static final akg<eft> ae = sf.a("trees_grove");
   public static final akg<eft> af = sf.a("trees_badlands");
   public static final akg<eft> ag = sf.a("trees_snowy");
   public static final akg<eft> ah = sf.a("trees_swamp");
   public static final akg<eft> ai = sf.a("trees_windswept_savanna");
   public static final akg<eft> aj = sf.a("trees_savanna");
   public static final akg<eft> ak = sf.a("birch_tall");
   public static final akg<eft> al = sf.a("trees_birch");
   public static final akg<eft> am = sf.a("trees_windswept_forest");
   public static final akg<eft> an = sf.a("trees_windswept_hills");
   public static final akg<eft> ao = sf.a("trees_water");
   public static final akg<eft> ap = sf.a("trees_birch_and_oak");
   public static final akg<eft> aq = sf.a("trees_sparse_jungle");
   public static final akg<eft> ar = sf.a("trees_old_growth_spruce_taiga");
   public static final akg<eft> as = sf.a("trees_old_growth_pine_taiga");
   public static final akg<eft> at = sf.a("trees_jungle");
   public static final akg<eft> au = sf.a("bamboo_vegetation");
   public static final akg<eft> av = sf.a("mushroom_island_vegetation");
   public static final akg<eft> aw = sf.a("trees_mangrove");
   private static final efw ax = egc.a(0);

   public static List<efw> a(int $$0) {
      return List.of(efm.a($$0), efq.a(), sf.c, efh.a());
   }

   private static List<efw> a(int $$0, @Nullable efw $$1) {
      Builder<efw> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(efz.a($$0));
      }

      $$2.add(efq.a());
      $$2.add(sf.a);
      $$2.add(efh.a());
      return $$2.build();
   }

   private static Builder<efw> b(efw $$0) {
      return ImmutableList.builder().add($$0).add(efq.a()).add(ax).add(sf.d).add(efh.a());
   }

   public static List<efw> a(efw $$0) {
      return b($$0).build();
   }

   public static List<efw> a(efw $$0, dde $$1) {
      return b($$0).add(efi.a(dxg.a($$1.n(), in.c))).build();
   }

   public static void a(ql<eft> $$0) {
      ix<dyq<?, ?>> $$1 = $$0.a(le.aC);
      iw<dyq<?, ?>> $$2 = $$1.b(rw.a);
      iw<dyq<?, ?>> $$3 = $$1.b(rw.b);
      iw<dyq<?, ?>> $$4 = $$1.b(rw.c);
      iw<dyq<?, ?>> $$5 = $$1.b(rw.f);
      iw<dyq<?, ?>> $$6 = $$1.b(rw.g);
      iw<dyq<?, ?>> $$7 = $$1.b(rw.j);
      iw<dyq<?, ?>> $$8 = $$1.b(rw.i);
      iw<dyq<?, ?>> $$9 = $$1.b(rw.k);
      iw<dyq<?, ?>> $$10 = $$1.b(rw.l);
      iw<dyq<?, ?>> $$11 = $$1.b(rw.m);
      iw<dyq<?, ?>> $$12 = $$1.b(rw.n);
      iw<dyq<?, ?>> $$13 = $$1.b(rw.h);
      iw<dyq<?, ?>> $$14 = $$1.b(rw.o);
      iw<dyq<?, ?>> $$15 = $$1.b(rw.p);
      iw<dyq<?, ?>> $$16 = $$1.b(rw.q);
      iw<dyq<?, ?>> $$17 = $$1.b(rw.r);
      iw<dyq<?, ?>> $$18 = $$1.b(rw.s);
      iw<dyq<?, ?>> $$19 = $$1.b(rw.d);
      iw<dyq<?, ?>> $$20 = $$1.b(rw.e);
      iw<dyq<?, ?>> $$21 = $$1.b(rw.t);
      iw<dyq<?, ?>> $$22 = $$1.b(rw.u);
      iw<dyq<?, ?>> $$23 = $$1.b(rw.v);
      iw<dyq<?, ?>> $$24 = $$1.b(rw.w);
      iw<dyq<?, ?>> $$25 = $$1.b(rw.x);
      iw<dyq<?, ?>> $$26 = $$1.b(rw.y);
      iw<dyq<?, ?>> $$27 = $$1.b(rw.K);
      iw<dyq<?, ?>> $$28 = $$1.b(rw.A);
      iw<dyq<?, ?>> $$29 = $$1.b(rw.z);
      iw<dyq<?, ?>> $$30 = $$1.b(rw.B);
      iw<dyq<?, ?>> $$31 = $$1.b(rw.C);
      iw<dyq<?, ?>> $$32 = $$1.b(rw.D);
      iw<dyq<?, ?>> $$33 = $$1.b(rw.E);
      iw<dyq<?, ?>> $$34 = $$1.b(rv.g);
      iw<dyq<?, ?>> $$35 = $$1.b(rv.k);
      iw<dyq<?, ?>> $$36 = $$1.b(rv.K);
      iw<dyq<?, ?>> $$37 = $$1.b(rv.u);
      iw<dyq<?, ?>> $$38 = $$1.b(rw.F);
      iw<dyq<?, ?>> $$39 = $$1.b(rw.G);
      iw<dyq<?, ?>> $$40 = $$1.b(rv.D);
      iw<dyq<?, ?>> $$41 = $$1.b(rw.H);
      iw<dyq<?, ?>> $$42 = $$1.b(rw.I);
      iw<dyq<?, ?>> $$43 = $$1.b(rw.J);
      iw<dyq<?, ?>> $$44 = $$1.b(rw.L);
      iw<dyq<?, ?>> $$45 = $$1.b(rw.M);
      iw<dyq<?, ?>> $$46 = $$1.b(rw.N);
      iw<dyq<?, ?>> $$47 = $$1.b(rw.O);
      iw<dyq<?, ?>> $$48 = $$1.b(rw.P);
      iw<dyq<?, ?>> $$49 = $$1.b(rw.Q);
      iw<dyq<?, ?>> $$50 = $$1.b(rw.R);
      sf.a($$0, a, $$2, efz.a(4), efq.a(), sf.a, efh.a());
      sf.a($$0, b, $$3, efr.a(160, 80.0, 0.3), efq.a(), sf.c, efh.a());
      sf.a($$0, c, $$4, efm.a(127), efq.a(), efo.a(dwt.a(64), dwt.a(100)), efh.a());
      sf.a($$0, d, $$5, efz.a(3), efq.a(), sf.a, efh.a());
      sf.a($$0, e, $$6, efz.a(300), efq.a(), sf.a, efh.a());
      sf.a($$0, f, $$7, efs.a(-0.8, 5, 10), efq.a(), sf.c, efh.a());
      sf.a($$0, g, $$7, a(2));
      sf.a($$0, h, $$7, efq.a(), sf.c, efh.a());
      sf.a($$0, i, $$7, a(20));
      sf.a($$0, j, $$7, a(5));
      sf.a($$0, k, $$8, efq.a(), sf.c, efh.a());
      sf.a($$0, l, $$8, a(7));
      sf.a($$0, m, $$9, a(25));
      sf.a($$0, n, $$10, sf.a());
      sf.a($$0, o, $$11, a(2));
      sf.a($$0, p, $$11, efq.a(), sf.c, efh.a());
      sf.a($$0, q, $$11, a(20));
      sf.a($$0, r, $$12, efz.a(6), efq.a(), sf.a, efh.a());
      sf.a($$0, s, $$12, efz.a(64), efq.a(), sf.a, efh.a());
      sf.a($$0, t, $$13, efz.a(32), efq.a(), sf.c, efh.a());
      sf.a($$0, u, $$13, efz.a(384), efq.a(), sf.c, efh.a());
      sf.a($$0, v, $$14, a(4));
      sf.a($$0, w, $$15, efs.a(-0.8, 0, 7), efz.a(32), efq.a(), sf.a, efh.a());
      sf.a($$0, x, $$15, efz.a(5), efq.a(), sf.a, efh.a());
      sf.a($$0, y, $$16, efz.a(5), efq.a(), sf.a, efh.a());
      sf.a($$0, z, $$17, efz.a(6), efq.a(), sf.a, efh.a());
      sf.a($$0, A, $$17, efz.a(13), efq.a(), sf.a, efh.a());
      sf.a($$0, B, $$18, efz.a(3), efq.a(), sf.a, efh.a());
      sf.a($$0, C, $$18, efq.a(), sf.a, efh.a());
      sf.a($$0, D, $$18, efz.a(5), efq.a(), sf.a, efh.a());
      sf.a($$0, E, $$18, efz.a(6), efq.a(), sf.a, efh.a());
      sf.a($$0, F, $$19, efz.a(2), efq.a(), sf.e, efh.a());
      sf.a($$0, G, $$20, efz.a(2), efq.a(), sf.e, efh.a());
      sf.a($$0, H, $$19, a(256, null));
      sf.a($$0, I, $$20, a(512, null));
      sf.a($$0, J, $$19, a(4, null));
      sf.a($$0, K, $$20, a(256, null));
      sf.a($$0, L, $$19, a(4, efm.a(3)));
      sf.a($$0, M, $$20, a(171, null));
      sf.a($$0, N, $$19, a(0, efm.a(2)));
      sf.a($$0, O, $$20, a(64, null));
      sf.a($$0, P, $$21, efz.a(16), efq.a(), sf.a, efh.a());
      sf.a($$0, Q, $$21, efz.a(32), efq.a(), sf.a, efh.a());
      sf.a($$0, R, $$22, efm.a(3), efz.a(2), efq.a(), sf.a, efh.a());
      sf.a($$0, S, $$23, efz.a(32), efq.a(), sf.a, efh.a());
      sf.a($$0, T, $$24, efs.a(-0.8, 15, 4), efz.a(32), efq.a(), sf.a, efh.a());
      sf.a($$0, V, $$26, efs.a(-0.8, 5, 10), efq.a(), sf.a, efh.a());
      sf.a($$0, U, $$25, efq.a(), sf.a, efh.a());
      efw $$51 = egc.a(0);
      sf.a($$0, W, $$27, sf.a(0, 0.05F, 1), efq.a(), $$51, sf.d, efi.a(dxg.a(ddg.x.n(), in.c)), efh.a());
      sf.a($$0, X, $$28, efm.a(16), efq.a(), $$51, sf.d, efh.a());
      sf.a($$0, Y, $$29, efz.a(7), efq.a(), sf.a, efm.a(bok.a(box.a(-1, 3), 0, 3)), efh.a());
      sf.a($$0, Z, $$29, efz.a(7), efq.a(), sf.a, efm.a(bok.a(box.a(-3, 1), 0, 1)), efh.a());
      sf.a($$0, aa, $$30, a(sf.a(6, 0.1F, 1)));
      sf.a($$0, ab, $$31, a(efz.a(100)));
      sf.a($$0, ac, $$36, a(sf.a(10, 0.1F, 1), ddg.C));
      sf.a($$0, ad, $$32, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, ae, $$33, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, af, $$34, a(sf.a(5, 0.1F, 1), ddg.x));
      sf.a($$0, ag, $$35, a(sf.a(0, 0.1F, 1), ddg.y));
      sf.a($$0, ah, $$37, sf.a(2, 0.1F, 1), efq.a(), egc.a(2), sf.d, efh.a(), efi.a(dxg.a(ddg.x.n(), in.c)));
      sf.a($$0, ai, $$38, a(sf.a(2, 0.1F, 1)));
      sf.a($$0, aj, $$38, a(sf.a(1, 0.1F, 1)));
      sf.a($$0, ak, $$39, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, al, $$40, a(sf.a(10, 0.1F, 1), ddg.z));
      sf.a($$0, am, $$41, a(sf.a(3, 0.1F, 1)));
      sf.a($$0, an, $$41, a(sf.a(0, 0.1F, 1)));
      sf.a($$0, ao, $$42, a(sf.a(0, 0.1F, 1)));
      sf.a($$0, ap, $$43, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, aq, $$44, a(sf.a(2, 0.1F, 1)));
      sf.a($$0, ar, $$45, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, as, $$46, a(sf.a(10, 0.1F, 1)));
      sf.a($$0, at, $$47, a(sf.a(50, 0.1F, 1)));
      sf.a($$0, au, $$48, a(sf.a(30, 0.1F, 1)));
      sf.a($$0, av, $$49, efq.a(), sf.a, efh.a());
      sf.a($$0, aw, $$50, efm.a(25), efq.a(), egc.a(5), sf.d, efh.a(), efi.a(dxg.a(ddg.E.n(), in.c)));
   }
}
