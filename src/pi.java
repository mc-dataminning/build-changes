import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pi {
   public static final aev<dum> a = pg.a("bamboo_light");
   public static final aev<dum> b = pg.a("bamboo");
   public static final aev<dum> c = pg.a("vines");
   public static final aev<dum> d = pg.a("patch_sunflower");
   public static final aev<dum> e = pg.a("patch_pumpkin");
   public static final aev<dum> f = pg.a("patch_grass_plain");
   public static final aev<dum> g = pg.a("patch_grass_forest");
   public static final aev<dum> h = pg.a("patch_grass_badlands");
   public static final aev<dum> i = pg.a("patch_grass_savanna");
   public static final aev<dum> j = pg.a("patch_grass_normal");
   public static final aev<dum> k = pg.a("patch_grass_taiga_2");
   public static final aev<dum> l = pg.a("patch_grass_taiga");
   public static final aev<dum> m = pg.a("patch_grass_jungle");
   public static final aev<dum> n = pg.a("grass_bonemeal");
   public static final aev<dum> o = pg.a("patch_dead_bush_2");
   public static final aev<dum> p = pg.a("patch_dead_bush");
   public static final aev<dum> q = pg.a("patch_dead_bush_badlands");
   public static final aev<dum> r = pg.a("patch_melon");
   public static final aev<dum> s = pg.a("patch_melon_sparse");
   public static final aev<dum> t = pg.a("patch_berry_common");
   public static final aev<dum> u = pg.a("patch_berry_rare");
   public static final aev<dum> v = pg.a("patch_waterlily");
   public static final aev<dum> w = pg.a("patch_tall_grass_2");
   public static final aev<dum> x = pg.a("patch_tall_grass");
   public static final aev<dum> y = pg.a("patch_large_fern");
   public static final aev<dum> z = pg.a("patch_cactus_desert");
   public static final aev<dum> A = pg.a("patch_cactus_decorated");
   public static final aev<dum> B = pg.a("patch_sugar_cane_swamp");
   public static final aev<dum> C = pg.a("patch_sugar_cane_desert");
   public static final aev<dum> D = pg.a("patch_sugar_cane_badlands");
   public static final aev<dum> E = pg.a("patch_sugar_cane");
   public static final aev<dum> F = pg.a("brown_mushroom_nether");
   public static final aev<dum> G = pg.a("red_mushroom_nether");
   public static final aev<dum> H = pg.a("brown_mushroom_normal");
   public static final aev<dum> I = pg.a("red_mushroom_normal");
   public static final aev<dum> J = pg.a("brown_mushroom_taiga");
   public static final aev<dum> K = pg.a("red_mushroom_taiga");
   public static final aev<dum> L = pg.a("brown_mushroom_old_growth");
   public static final aev<dum> M = pg.a("red_mushroom_old_growth");
   public static final aev<dum> N = pg.a("brown_mushroom_swamp");
   public static final aev<dum> O = pg.a("red_mushroom_swamp");
   public static final aev<dum> P = pg.a("flower_warm");
   public static final aev<dum> Q = pg.a("flower_default");
   public static final aev<dum> R = pg.a("flower_flower_forest");
   public static final aev<dum> S = pg.a("flower_swamp");
   public static final aev<dum> T = pg.a("flower_plains");
   public static final aev<dum> U = pg.a("flower_meadow");
   public static final aev<dum> V = pg.a("flower_cherry");
   public static final aev<dum> W = pg.a("trees_plains");
   public static final aev<dum> X = pg.a("dark_forest_vegetation");
   public static final aev<dum> Y = pg.a("flower_forest_flowers");
   public static final aev<dum> Z = pg.a("forest_flowers");
   public static final aev<dum> aa = pg.a("trees_flower_forest");
   public static final aev<dum> ab = pg.a("trees_meadow");
   public static final aev<dum> ac = pg.a("trees_cherry");
   public static final aev<dum> ad = pg.a("trees_taiga");
   public static final aev<dum> ae = pg.a("trees_grove");
   public static final aev<dum> af = pg.a("trees_badlands");
   public static final aev<dum> ag = pg.a("trees_snowy");
   public static final aev<dum> ah = pg.a("trees_swamp");
   public static final aev<dum> ai = pg.a("trees_windswept_savanna");
   public static final aev<dum> aj = pg.a("trees_savanna");
   public static final aev<dum> ak = pg.a("birch_tall");
   public static final aev<dum> al = pg.a("trees_birch");
   public static final aev<dum> am = pg.a("trees_windswept_forest");
   public static final aev<dum> an = pg.a("trees_windswept_hills");
   public static final aev<dum> ao = pg.a("trees_water");
   public static final aev<dum> ap = pg.a("trees_birch_and_oak");
   public static final aev<dum> aq = pg.a("trees_sparse_jungle");
   public static final aev<dum> ar = pg.a("trees_old_growth_spruce_taiga");
   public static final aev<dum> as = pg.a("trees_old_growth_pine_taiga");
   public static final aev<dum> at = pg.a("trees_jungle");
   public static final aev<dum> au = pg.a("bamboo_vegetation");
   public static final aev<dum> av = pg.a("mushroom_island_vegetation");
   public static final aev<dum> aw = pg.a("trees_mangrove");
   private static final dup ax = duv.a(0);

   public static List<dup> a(int $$0) {
      return List.of(duf.a($$0), duj.a(), pg.c, dua.a());
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
      $$2.add(pg.a);
      $$2.add(dua.a());
      return $$2.build();
   }

   private static Builder<dup> b(dup $$0) {
      return ImmutableList.builder().add($$0).add(duj.a()).add(ax).add(pg.d).add(dua.a());
   }

   public static List<dup> a(dup $$0) {
      return b($$0).build();
   }

   public static List<dup> a(dup $$0, csv $$1) {
      return b($$0).add(dub.a(dlz.a($$1.n(), gw.b))).build();
   }

   public static void a(nr<dum> $$0) {
      hf<dnj<?, ?>> $$1 = $$0.a(jc.as);
      he<dnj<?, ?>> $$2 = $$1.b(ox.a);
      he<dnj<?, ?>> $$3 = $$1.b(ox.b);
      he<dnj<?, ?>> $$4 = $$1.b(ox.c);
      he<dnj<?, ?>> $$5 = $$1.b(ox.f);
      he<dnj<?, ?>> $$6 = $$1.b(ox.g);
      he<dnj<?, ?>> $$7 = $$1.b(ox.j);
      he<dnj<?, ?>> $$8 = $$1.b(ox.i);
      he<dnj<?, ?>> $$9 = $$1.b(ox.k);
      he<dnj<?, ?>> $$10 = $$1.b(ox.l);
      he<dnj<?, ?>> $$11 = $$1.b(ox.m);
      he<dnj<?, ?>> $$12 = $$1.b(ox.n);
      he<dnj<?, ?>> $$13 = $$1.b(ox.h);
      he<dnj<?, ?>> $$14 = $$1.b(ox.o);
      he<dnj<?, ?>> $$15 = $$1.b(ox.p);
      he<dnj<?, ?>> $$16 = $$1.b(ox.q);
      he<dnj<?, ?>> $$17 = $$1.b(ox.r);
      he<dnj<?, ?>> $$18 = $$1.b(ox.s);
      he<dnj<?, ?>> $$19 = $$1.b(ox.d);
      he<dnj<?, ?>> $$20 = $$1.b(ox.e);
      he<dnj<?, ?>> $$21 = $$1.b(ox.t);
      he<dnj<?, ?>> $$22 = $$1.b(ox.u);
      he<dnj<?, ?>> $$23 = $$1.b(ox.v);
      he<dnj<?, ?>> $$24 = $$1.b(ox.w);
      he<dnj<?, ?>> $$25 = $$1.b(ox.x);
      he<dnj<?, ?>> $$26 = $$1.b(ox.y);
      he<dnj<?, ?>> $$27 = $$1.b(ox.K);
      he<dnj<?, ?>> $$28 = $$1.b(ox.A);
      he<dnj<?, ?>> $$29 = $$1.b(ox.z);
      he<dnj<?, ?>> $$30 = $$1.b(ox.B);
      he<dnj<?, ?>> $$31 = $$1.b(ox.C);
      he<dnj<?, ?>> $$32 = $$1.b(ox.D);
      he<dnj<?, ?>> $$33 = $$1.b(ox.E);
      he<dnj<?, ?>> $$34 = $$1.b(ow.g);
      he<dnj<?, ?>> $$35 = $$1.b(ow.k);
      he<dnj<?, ?>> $$36 = $$1.b(ow.K);
      he<dnj<?, ?>> $$37 = $$1.b(ow.u);
      he<dnj<?, ?>> $$38 = $$1.b(ox.F);
      he<dnj<?, ?>> $$39 = $$1.b(ox.G);
      he<dnj<?, ?>> $$40 = $$1.b(ow.D);
      he<dnj<?, ?>> $$41 = $$1.b(ox.H);
      he<dnj<?, ?>> $$42 = $$1.b(ox.I);
      he<dnj<?, ?>> $$43 = $$1.b(ox.J);
      he<dnj<?, ?>> $$44 = $$1.b(ox.L);
      he<dnj<?, ?>> $$45 = $$1.b(ox.M);
      he<dnj<?, ?>> $$46 = $$1.b(ox.N);
      he<dnj<?, ?>> $$47 = $$1.b(ox.O);
      he<dnj<?, ?>> $$48 = $$1.b(ox.P);
      he<dnj<?, ?>> $$49 = $$1.b(ox.Q);
      he<dnj<?, ?>> $$50 = $$1.b(ox.R);
      pg.a($$0, a, $$2, dus.a(4), duj.a(), pg.a, dua.a());
      pg.a($$0, b, $$3, duk.a(160, 80.0, 0.3), duj.a(), pg.c, dua.a());
      pg.a($$0, c, $$4, duf.a(127), duj.a(), duh.a(dlm.a(64), dlm.a(100)), dua.a());
      pg.a($$0, d, $$5, dus.a(3), duj.a(), pg.a, dua.a());
      pg.a($$0, e, $$6, dus.a(300), duj.a(), pg.a, dua.a());
      pg.a($$0, f, $$7, dul.a(-0.8, 5, 10), duj.a(), pg.c, dua.a());
      pg.a($$0, g, $$7, a(2));
      pg.a($$0, h, $$7, duj.a(), pg.c, dua.a());
      pg.a($$0, i, $$7, a(20));
      pg.a($$0, j, $$7, a(5));
      pg.a($$0, k, $$8, duj.a(), pg.c, dua.a());
      pg.a($$0, l, $$8, a(7));
      pg.a($$0, m, $$9, a(25));
      pg.a($$0, n, $$10, pg.a());
      pg.a($$0, o, $$11, a(2));
      pg.a($$0, p, $$11, duj.a(), pg.c, dua.a());
      pg.a($$0, q, $$11, a(20));
      pg.a($$0, r, $$12, dus.a(6), duj.a(), pg.a, dua.a());
      pg.a($$0, s, $$12, dus.a(64), duj.a(), pg.a, dua.a());
      pg.a($$0, t, $$13, dus.a(32), duj.a(), pg.c, dua.a());
      pg.a($$0, u, $$13, dus.a(384), duj.a(), pg.c, dua.a());
      pg.a($$0, v, $$14, a(4));
      pg.a($$0, w, $$15, dul.a(-0.8, 0, 7), dus.a(32), duj.a(), pg.a, dua.a());
      pg.a($$0, x, $$15, dus.a(5), duj.a(), pg.a, dua.a());
      pg.a($$0, y, $$16, dus.a(5), duj.a(), pg.a, dua.a());
      pg.a($$0, z, $$17, dus.a(6), duj.a(), pg.a, dua.a());
      pg.a($$0, A, $$17, dus.a(13), duj.a(), pg.a, dua.a());
      pg.a($$0, B, $$18, dus.a(3), duj.a(), pg.a, dua.a());
      pg.a($$0, C, $$18, duj.a(), pg.a, dua.a());
      pg.a($$0, D, $$18, dus.a(5), duj.a(), pg.a, dua.a());
      pg.a($$0, E, $$18, dus.a(6), duj.a(), pg.a, dua.a());
      pg.a($$0, F, $$19, dus.a(2), duj.a(), pg.e, dua.a());
      pg.a($$0, G, $$20, dus.a(2), duj.a(), pg.e, dua.a());
      pg.a($$0, H, $$19, a(256, null));
      pg.a($$0, I, $$20, a(512, null));
      pg.a($$0, J, $$19, a(4, null));
      pg.a($$0, K, $$20, a(256, null));
      pg.a($$0, L, $$19, a(4, duf.a(3)));
      pg.a($$0, M, $$20, a(171, null));
      pg.a($$0, N, $$19, a(0, duf.a(2)));
      pg.a($$0, O, $$20, a(64, null));
      pg.a($$0, P, $$21, dus.a(16), duj.a(), pg.a, dua.a());
      pg.a($$0, Q, $$21, dus.a(32), duj.a(), pg.a, dua.a());
      pg.a($$0, R, $$22, duf.a(3), dus.a(2), duj.a(), pg.a, dua.a());
      pg.a($$0, S, $$23, dus.a(32), duj.a(), pg.a, dua.a());
      pg.a($$0, T, $$24, dul.a(-0.8, 15, 4), dus.a(32), duj.a(), pg.a, dua.a());
      pg.a($$0, V, $$26, dul.a(-0.8, 5, 10), duj.a(), pg.a, dua.a());
      pg.a($$0, U, $$25, duj.a(), pg.a, dua.a());
      dup $$51 = duv.a(0);
      pg.a($$0, W, $$27, pg.a(0, 0.05F, 1), duj.a(), $$51, pg.d, dub.a(dlz.a(csw.x.n(), gw.b)), dua.a());
      pg.a($$0, X, $$28, duf.a(16), duj.a(), $$51, pg.d, dua.a());
      pg.a($$0, Y, $$29, dus.a(7), duj.a(), pg.a, duf.a(bfw.a(bgj.a(-1, 3), 0, 3)), dua.a());
      pg.a($$0, Z, $$29, dus.a(7), duj.a(), pg.a, duf.a(bfw.a(bgj.a(-3, 1), 0, 1)), dua.a());
      pg.a($$0, aa, $$30, a(pg.a(6, 0.1F, 1)));
      pg.a($$0, ab, $$31, a(dus.a(100)));
      pg.a($$0, ac, $$36, a(pg.a(10, 0.1F, 1), csw.C));
      pg.a($$0, ad, $$32, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, ae, $$33, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, af, $$34, a(pg.a(5, 0.1F, 1), csw.x));
      pg.a($$0, ag, $$35, a(pg.a(0, 0.1F, 1), csw.y));
      pg.a($$0, ah, $$37, pg.a(2, 0.1F, 1), duj.a(), duv.a(2), pg.d, dua.a(), dub.a(dlz.a(csw.x.n(), gw.b)));
      pg.a($$0, ai, $$38, a(pg.a(2, 0.1F, 1)));
      pg.a($$0, aj, $$38, a(pg.a(1, 0.1F, 1)));
      pg.a($$0, ak, $$39, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, al, $$40, a(pg.a(10, 0.1F, 1), csw.z));
      pg.a($$0, am, $$41, a(pg.a(3, 0.1F, 1)));
      pg.a($$0, an, $$41, a(pg.a(0, 0.1F, 1)));
      pg.a($$0, ao, $$42, a(pg.a(0, 0.1F, 1)));
      pg.a($$0, ap, $$43, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, aq, $$44, a(pg.a(2, 0.1F, 1)));
      pg.a($$0, ar, $$45, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, as, $$46, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, at, $$47, a(pg.a(50, 0.1F, 1)));
      pg.a($$0, au, $$48, a(pg.a(30, 0.1F, 1)));
      pg.a($$0, av, $$49, duj.a(), pg.a, dua.a());
      pg.a($$0, aw, $$50, duf.a(25), duj.a(), duv.a(5), pg.d, dua.a(), dub.a(dlz.a(csw.E.n(), gw.b)));
   }
}
