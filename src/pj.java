import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pj {
   public static final aew<dum> a = ph.a("bamboo_light");
   public static final aew<dum> b = ph.a("bamboo");
   public static final aew<dum> c = ph.a("vines");
   public static final aew<dum> d = ph.a("patch_sunflower");
   public static final aew<dum> e = ph.a("patch_pumpkin");
   public static final aew<dum> f = ph.a("patch_grass_plain");
   public static final aew<dum> g = ph.a("patch_grass_forest");
   public static final aew<dum> h = ph.a("patch_grass_badlands");
   public static final aew<dum> i = ph.a("patch_grass_savanna");
   public static final aew<dum> j = ph.a("patch_grass_normal");
   public static final aew<dum> k = ph.a("patch_grass_taiga_2");
   public static final aew<dum> l = ph.a("patch_grass_taiga");
   public static final aew<dum> m = ph.a("patch_grass_jungle");
   public static final aew<dum> n = ph.a("grass_bonemeal");
   public static final aew<dum> o = ph.a("patch_dead_bush_2");
   public static final aew<dum> p = ph.a("patch_dead_bush");
   public static final aew<dum> q = ph.a("patch_dead_bush_badlands");
   public static final aew<dum> r = ph.a("patch_melon");
   public static final aew<dum> s = ph.a("patch_melon_sparse");
   public static final aew<dum> t = ph.a("patch_berry_common");
   public static final aew<dum> u = ph.a("patch_berry_rare");
   public static final aew<dum> v = ph.a("patch_waterlily");
   public static final aew<dum> w = ph.a("patch_tall_grass_2");
   public static final aew<dum> x = ph.a("patch_tall_grass");
   public static final aew<dum> y = ph.a("patch_large_fern");
   public static final aew<dum> z = ph.a("patch_cactus_desert");
   public static final aew<dum> A = ph.a("patch_cactus_decorated");
   public static final aew<dum> B = ph.a("patch_sugar_cane_swamp");
   public static final aew<dum> C = ph.a("patch_sugar_cane_desert");
   public static final aew<dum> D = ph.a("patch_sugar_cane_badlands");
   public static final aew<dum> E = ph.a("patch_sugar_cane");
   public static final aew<dum> F = ph.a("brown_mushroom_nether");
   public static final aew<dum> G = ph.a("red_mushroom_nether");
   public static final aew<dum> H = ph.a("brown_mushroom_normal");
   public static final aew<dum> I = ph.a("red_mushroom_normal");
   public static final aew<dum> J = ph.a("brown_mushroom_taiga");
   public static final aew<dum> K = ph.a("red_mushroom_taiga");
   public static final aew<dum> L = ph.a("brown_mushroom_old_growth");
   public static final aew<dum> M = ph.a("red_mushroom_old_growth");
   public static final aew<dum> N = ph.a("brown_mushroom_swamp");
   public static final aew<dum> O = ph.a("red_mushroom_swamp");
   public static final aew<dum> P = ph.a("flower_warm");
   public static final aew<dum> Q = ph.a("flower_default");
   public static final aew<dum> R = ph.a("flower_flower_forest");
   public static final aew<dum> S = ph.a("flower_swamp");
   public static final aew<dum> T = ph.a("flower_plains");
   public static final aew<dum> U = ph.a("flower_meadow");
   public static final aew<dum> V = ph.a("flower_cherry");
   public static final aew<dum> W = ph.a("trees_plains");
   public static final aew<dum> X = ph.a("dark_forest_vegetation");
   public static final aew<dum> Y = ph.a("flower_forest_flowers");
   public static final aew<dum> Z = ph.a("forest_flowers");
   public static final aew<dum> aa = ph.a("trees_flower_forest");
   public static final aew<dum> ab = ph.a("trees_meadow");
   public static final aew<dum> ac = ph.a("trees_cherry");
   public static final aew<dum> ad = ph.a("trees_taiga");
   public static final aew<dum> ae = ph.a("trees_grove");
   public static final aew<dum> af = ph.a("trees_badlands");
   public static final aew<dum> ag = ph.a("trees_snowy");
   public static final aew<dum> ah = ph.a("trees_swamp");
   public static final aew<dum> ai = ph.a("trees_windswept_savanna");
   public static final aew<dum> aj = ph.a("trees_savanna");
   public static final aew<dum> ak = ph.a("birch_tall");
   public static final aew<dum> al = ph.a("trees_birch");
   public static final aew<dum> am = ph.a("trees_windswept_forest");
   public static final aew<dum> an = ph.a("trees_windswept_hills");
   public static final aew<dum> ao = ph.a("trees_water");
   public static final aew<dum> ap = ph.a("trees_birch_and_oak");
   public static final aew<dum> aq = ph.a("trees_sparse_jungle");
   public static final aew<dum> ar = ph.a("trees_old_growth_spruce_taiga");
   public static final aew<dum> as = ph.a("trees_old_growth_pine_taiga");
   public static final aew<dum> at = ph.a("trees_jungle");
   public static final aew<dum> au = ph.a("bamboo_vegetation");
   public static final aew<dum> av = ph.a("mushroom_island_vegetation");
   public static final aew<dum> aw = ph.a("trees_mangrove");
   private static final dup ax = duv.a(0);

   public static List<dup> a(int $$0) {
      return List.of(duf.a($$0), duj.a(), ph.c, dua.a());
   }

   private static List<dup> a(int $$0, @Nullable dup $$1) {
      Builder<dup> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(dus.a($$0));
      }

      $$2.add(duj.a());
      $$2.add(ph.a);
      $$2.add(dua.a());
      return $$2.build();
   }

   private static Builder<dup> b(dup $$0) {
      return ImmutableList.builder().add($$0).add(duj.a()).add(ax).add(ph.d).add(dua.a());
   }

   public static List<dup> a(dup $$0) {
      return b($$0).build();
   }

   public static List<dup> a(dup $$0, csv $$1) {
      return b($$0).add(dub.a(dlz.a($$1.n(), gw.b))).build();
   }

   public static void a(ns<dum> $$0) {
      hh<dnj<?, ?>> $$1 = $$0.a(je.as);
      hg<dnj<?, ?>> $$2 = $$1.b(oy.a);
      hg<dnj<?, ?>> $$3 = $$1.b(oy.b);
      hg<dnj<?, ?>> $$4 = $$1.b(oy.c);
      hg<dnj<?, ?>> $$5 = $$1.b(oy.f);
      hg<dnj<?, ?>> $$6 = $$1.b(oy.g);
      hg<dnj<?, ?>> $$7 = $$1.b(oy.j);
      hg<dnj<?, ?>> $$8 = $$1.b(oy.i);
      hg<dnj<?, ?>> $$9 = $$1.b(oy.k);
      hg<dnj<?, ?>> $$10 = $$1.b(oy.l);
      hg<dnj<?, ?>> $$11 = $$1.b(oy.m);
      hg<dnj<?, ?>> $$12 = $$1.b(oy.n);
      hg<dnj<?, ?>> $$13 = $$1.b(oy.h);
      hg<dnj<?, ?>> $$14 = $$1.b(oy.o);
      hg<dnj<?, ?>> $$15 = $$1.b(oy.p);
      hg<dnj<?, ?>> $$16 = $$1.b(oy.q);
      hg<dnj<?, ?>> $$17 = $$1.b(oy.r);
      hg<dnj<?, ?>> $$18 = $$1.b(oy.s);
      hg<dnj<?, ?>> $$19 = $$1.b(oy.d);
      hg<dnj<?, ?>> $$20 = $$1.b(oy.e);
      hg<dnj<?, ?>> $$21 = $$1.b(oy.t);
      hg<dnj<?, ?>> $$22 = $$1.b(oy.u);
      hg<dnj<?, ?>> $$23 = $$1.b(oy.v);
      hg<dnj<?, ?>> $$24 = $$1.b(oy.w);
      hg<dnj<?, ?>> $$25 = $$1.b(oy.x);
      hg<dnj<?, ?>> $$26 = $$1.b(oy.y);
      hg<dnj<?, ?>> $$27 = $$1.b(oy.K);
      hg<dnj<?, ?>> $$28 = $$1.b(oy.A);
      hg<dnj<?, ?>> $$29 = $$1.b(oy.z);
      hg<dnj<?, ?>> $$30 = $$1.b(oy.B);
      hg<dnj<?, ?>> $$31 = $$1.b(oy.C);
      hg<dnj<?, ?>> $$32 = $$1.b(oy.D);
      hg<dnj<?, ?>> $$33 = $$1.b(oy.E);
      hg<dnj<?, ?>> $$34 = $$1.b(ox.g);
      hg<dnj<?, ?>> $$35 = $$1.b(ox.k);
      hg<dnj<?, ?>> $$36 = $$1.b(ox.K);
      hg<dnj<?, ?>> $$37 = $$1.b(ox.u);
      hg<dnj<?, ?>> $$38 = $$1.b(oy.F);
      hg<dnj<?, ?>> $$39 = $$1.b(oy.G);
      hg<dnj<?, ?>> $$40 = $$1.b(ox.D);
      hg<dnj<?, ?>> $$41 = $$1.b(oy.H);
      hg<dnj<?, ?>> $$42 = $$1.b(oy.I);
      hg<dnj<?, ?>> $$43 = $$1.b(oy.J);
      hg<dnj<?, ?>> $$44 = $$1.b(oy.L);
      hg<dnj<?, ?>> $$45 = $$1.b(oy.M);
      hg<dnj<?, ?>> $$46 = $$1.b(oy.N);
      hg<dnj<?, ?>> $$47 = $$1.b(oy.O);
      hg<dnj<?, ?>> $$48 = $$1.b(oy.P);
      hg<dnj<?, ?>> $$49 = $$1.b(oy.Q);
      hg<dnj<?, ?>> $$50 = $$1.b(oy.R);
      ph.a($$0, a, $$2, dus.a(4), duj.a(), ph.a, dua.a());
      ph.a($$0, b, $$3, duk.a(160, 80.0, 0.3), duj.a(), ph.c, dua.a());
      ph.a($$0, c, $$4, duf.a(127), duj.a(), duh.a(dlm.a(64), dlm.a(100)), dua.a());
      ph.a($$0, d, $$5, dus.a(3), duj.a(), ph.a, dua.a());
      ph.a($$0, e, $$6, dus.a(300), duj.a(), ph.a, dua.a());
      ph.a($$0, f, $$7, dul.a(-0.8, 5, 10), duj.a(), ph.c, dua.a());
      ph.a($$0, g, $$7, a(2));
      ph.a($$0, h, $$7, duj.a(), ph.c, dua.a());
      ph.a($$0, i, $$7, a(20));
      ph.a($$0, j, $$7, a(5));
      ph.a($$0, k, $$8, duj.a(), ph.c, dua.a());
      ph.a($$0, l, $$8, a(7));
      ph.a($$0, m, $$9, a(25));
      ph.a($$0, n, $$10, ph.a());
      ph.a($$0, o, $$11, a(2));
      ph.a($$0, p, $$11, duj.a(), ph.c, dua.a());
      ph.a($$0, q, $$11, a(20));
      ph.a($$0, r, $$12, dus.a(6), duj.a(), ph.a, dua.a());
      ph.a($$0, s, $$12, dus.a(64), duj.a(), ph.a, dua.a());
      ph.a($$0, t, $$13, dus.a(32), duj.a(), ph.c, dua.a());
      ph.a($$0, u, $$13, dus.a(384), duj.a(), ph.c, dua.a());
      ph.a($$0, v, $$14, a(4));
      ph.a($$0, w, $$15, dul.a(-0.8, 0, 7), dus.a(32), duj.a(), ph.a, dua.a());
      ph.a($$0, x, $$15, dus.a(5), duj.a(), ph.a, dua.a());
      ph.a($$0, y, $$16, dus.a(5), duj.a(), ph.a, dua.a());
      ph.a($$0, z, $$17, dus.a(6), duj.a(), ph.a, dua.a());
      ph.a($$0, A, $$17, dus.a(13), duj.a(), ph.a, dua.a());
      ph.a($$0, B, $$18, dus.a(3), duj.a(), ph.a, dua.a());
      ph.a($$0, C, $$18, duj.a(), ph.a, dua.a());
      ph.a($$0, D, $$18, dus.a(5), duj.a(), ph.a, dua.a());
      ph.a($$0, E, $$18, dus.a(6), duj.a(), ph.a, dua.a());
      ph.a($$0, F, $$19, dus.a(2), duj.a(), ph.e, dua.a());
      ph.a($$0, G, $$20, dus.a(2), duj.a(), ph.e, dua.a());
      ph.a($$0, H, $$19, a(256, null));
      ph.a($$0, I, $$20, a(512, null));
      ph.a($$0, J, $$19, a(4, null));
      ph.a($$0, K, $$20, a(256, null));
      ph.a($$0, L, $$19, a(4, duf.a(3)));
      ph.a($$0, M, $$20, a(171, null));
      ph.a($$0, N, $$19, a(0, duf.a(2)));
      ph.a($$0, O, $$20, a(64, null));
      ph.a($$0, P, $$21, dus.a(16), duj.a(), ph.a, dua.a());
      ph.a($$0, Q, $$21, dus.a(32), duj.a(), ph.a, dua.a());
      ph.a($$0, R, $$22, duf.a(3), dus.a(2), duj.a(), ph.a, dua.a());
      ph.a($$0, S, $$23, dus.a(32), duj.a(), ph.a, dua.a());
      ph.a($$0, T, $$24, dul.a(-0.8, 15, 4), dus.a(32), duj.a(), ph.a, dua.a());
      ph.a($$0, V, $$26, dul.a(-0.8, 5, 10), duj.a(), ph.a, dua.a());
      ph.a($$0, U, $$25, duj.a(), ph.a, dua.a());
      dup $$51 = duv.a(0);
      ph.a($$0, W, $$27, ph.a(0, 0.05F, 1), duj.a(), $$51, ph.d, dub.a(dlz.a(csw.x.n(), gw.b)), dua.a());
      ph.a($$0, X, $$28, duf.a(16), duj.a(), $$51, ph.d, dua.a());
      ph.a($$0, Y, $$29, dus.a(7), duj.a(), ph.a, duf.a(bfw.a(bgj.a(-1, 3), 0, 3)), dua.a());
      ph.a($$0, Z, $$29, dus.a(7), duj.a(), ph.a, duf.a(bfw.a(bgj.a(-3, 1), 0, 1)), dua.a());
      ph.a($$0, aa, $$30, a(ph.a(6, 0.1F, 1)));
      ph.a($$0, ab, $$31, a(dus.a(100)));
      ph.a($$0, ac, $$36, a(ph.a(10, 0.1F, 1), csw.C));
      ph.a($$0, ad, $$32, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, ae, $$33, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, af, $$34, a(ph.a(5, 0.1F, 1), csw.x));
      ph.a($$0, ag, $$35, a(ph.a(0, 0.1F, 1), csw.y));
      ph.a($$0, ah, $$37, ph.a(2, 0.1F, 1), duj.a(), duv.a(2), ph.d, dua.a(), dub.a(dlz.a(csw.x.n(), gw.b)));
      ph.a($$0, ai, $$38, a(ph.a(2, 0.1F, 1)));
      ph.a($$0, aj, $$38, a(ph.a(1, 0.1F, 1)));
      ph.a($$0, ak, $$39, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, al, $$40, a(ph.a(10, 0.1F, 1), csw.z));
      ph.a($$0, am, $$41, a(ph.a(3, 0.1F, 1)));
      ph.a($$0, an, $$41, a(ph.a(0, 0.1F, 1)));
      ph.a($$0, ao, $$42, a(ph.a(0, 0.1F, 1)));
      ph.a($$0, ap, $$43, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, aq, $$44, a(ph.a(2, 0.1F, 1)));
      ph.a($$0, ar, $$45, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, as, $$46, a(ph.a(10, 0.1F, 1)));
      ph.a($$0, at, $$47, a(ph.a(50, 0.1F, 1)));
      ph.a($$0, au, $$48, a(ph.a(30, 0.1F, 1)));
      ph.a($$0, av, $$49, duj.a(), ph.a, dua.a());
      ph.a($$0, aw, $$50, duf.a(25), duj.a(), duv.a(5), ph.d, dua.a(), dub.a(dlz.a(csw.E.n(), gw.b)));
   }
}
