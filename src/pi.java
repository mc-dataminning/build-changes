import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pi {
   public static final aey<dug> a = pg.a("bamboo_light");
   public static final aey<dug> b = pg.a("bamboo");
   public static final aey<dug> c = pg.a("vines");
   public static final aey<dug> d = pg.a("patch_sunflower");
   public static final aey<dug> e = pg.a("patch_pumpkin");
   public static final aey<dug> f = pg.a("patch_grass_plain");
   public static final aey<dug> g = pg.a("patch_grass_forest");
   public static final aey<dug> h = pg.a("patch_grass_badlands");
   public static final aey<dug> i = pg.a("patch_grass_savanna");
   public static final aey<dug> j = pg.a("patch_grass_normal");
   public static final aey<dug> k = pg.a("patch_grass_taiga_2");
   public static final aey<dug> l = pg.a("patch_grass_taiga");
   public static final aey<dug> m = pg.a("patch_grass_jungle");
   public static final aey<dug> n = pg.a("grass_bonemeal");
   public static final aey<dug> o = pg.a("patch_dead_bush_2");
   public static final aey<dug> p = pg.a("patch_dead_bush");
   public static final aey<dug> q = pg.a("patch_dead_bush_badlands");
   public static final aey<dug> r = pg.a("patch_melon");
   public static final aey<dug> s = pg.a("patch_melon_sparse");
   public static final aey<dug> t = pg.a("patch_berry_common");
   public static final aey<dug> u = pg.a("patch_berry_rare");
   public static final aey<dug> v = pg.a("patch_waterlily");
   public static final aey<dug> w = pg.a("patch_tall_grass_2");
   public static final aey<dug> x = pg.a("patch_tall_grass");
   public static final aey<dug> y = pg.a("patch_large_fern");
   public static final aey<dug> z = pg.a("patch_cactus_desert");
   public static final aey<dug> A = pg.a("patch_cactus_decorated");
   public static final aey<dug> B = pg.a("patch_sugar_cane_swamp");
   public static final aey<dug> C = pg.a("patch_sugar_cane_desert");
   public static final aey<dug> D = pg.a("patch_sugar_cane_badlands");
   public static final aey<dug> E = pg.a("patch_sugar_cane");
   public static final aey<dug> F = pg.a("brown_mushroom_nether");
   public static final aey<dug> G = pg.a("red_mushroom_nether");
   public static final aey<dug> H = pg.a("brown_mushroom_normal");
   public static final aey<dug> I = pg.a("red_mushroom_normal");
   public static final aey<dug> J = pg.a("brown_mushroom_taiga");
   public static final aey<dug> K = pg.a("red_mushroom_taiga");
   public static final aey<dug> L = pg.a("brown_mushroom_old_growth");
   public static final aey<dug> M = pg.a("red_mushroom_old_growth");
   public static final aey<dug> N = pg.a("brown_mushroom_swamp");
   public static final aey<dug> O = pg.a("red_mushroom_swamp");
   public static final aey<dug> P = pg.a("flower_warm");
   public static final aey<dug> Q = pg.a("flower_default");
   public static final aey<dug> R = pg.a("flower_flower_forest");
   public static final aey<dug> S = pg.a("flower_swamp");
   public static final aey<dug> T = pg.a("flower_plains");
   public static final aey<dug> U = pg.a("flower_meadow");
   public static final aey<dug> V = pg.a("flower_cherry");
   public static final aey<dug> W = pg.a("trees_plains");
   public static final aey<dug> X = pg.a("dark_forest_vegetation");
   public static final aey<dug> Y = pg.a("flower_forest_flowers");
   public static final aey<dug> Z = pg.a("forest_flowers");
   public static final aey<dug> aa = pg.a("trees_flower_forest");
   public static final aey<dug> ab = pg.a("trees_meadow");
   public static final aey<dug> ac = pg.a("trees_cherry");
   public static final aey<dug> ad = pg.a("trees_taiga");
   public static final aey<dug> ae = pg.a("trees_grove");
   public static final aey<dug> af = pg.a("trees_badlands");
   public static final aey<dug> ag = pg.a("trees_snowy");
   public static final aey<dug> ah = pg.a("trees_swamp");
   public static final aey<dug> ai = pg.a("trees_windswept_savanna");
   public static final aey<dug> aj = pg.a("trees_savanna");
   public static final aey<dug> ak = pg.a("birch_tall");
   public static final aey<dug> al = pg.a("trees_birch");
   public static final aey<dug> am = pg.a("trees_windswept_forest");
   public static final aey<dug> an = pg.a("trees_windswept_hills");
   public static final aey<dug> ao = pg.a("trees_water");
   public static final aey<dug> ap = pg.a("trees_birch_and_oak");
   public static final aey<dug> aq = pg.a("trees_sparse_jungle");
   public static final aey<dug> ar = pg.a("trees_old_growth_spruce_taiga");
   public static final aey<dug> as = pg.a("trees_old_growth_pine_taiga");
   public static final aey<dug> at = pg.a("trees_jungle");
   public static final aey<dug> au = pg.a("bamboo_vegetation");
   public static final aey<dug> av = pg.a("mushroom_island_vegetation");
   public static final aey<dug> aw = pg.a("trees_mangrove");
   private static final duj ax = dup.a(0);

   public static List<duj> a(int $$0) {
      return List.of(dtz.a($$0), dud.a(), pg.c, dtu.a());
   }

   private static List<duj> a(int $$0, @Nullable duj $$1) {
      Builder<duj> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(dum.a($$0));
      }

      $$2.add(dud.a());
      $$2.add(pg.a);
      $$2.add(dtu.a());
      return $$2.build();
   }

   private static Builder<duj> b(duj $$0) {
      return ImmutableList.builder().add($$0).add(dud.a()).add(ax).add(pg.d).add(dtu.a());
   }

   public static List<duj> a(duj $$0) {
      return b($$0).build();
   }

   public static List<duj> a(duj $$0, ctc $$1) {
      return b($$0).add(dtv.a(dlt.a($$1.o(), gw.b))).build();
   }

   public static void a(nr<dug> $$0) {
      hf<dnd<?, ?>> $$1 = $$0.a(jc.at);
      he<dnd<?, ?>> $$2 = $$1.b(ox.a);
      he<dnd<?, ?>> $$3 = $$1.b(ox.b);
      he<dnd<?, ?>> $$4 = $$1.b(ox.c);
      he<dnd<?, ?>> $$5 = $$1.b(ox.f);
      he<dnd<?, ?>> $$6 = $$1.b(ox.g);
      he<dnd<?, ?>> $$7 = $$1.b(ox.j);
      he<dnd<?, ?>> $$8 = $$1.b(ox.i);
      he<dnd<?, ?>> $$9 = $$1.b(ox.k);
      he<dnd<?, ?>> $$10 = $$1.b(ox.l);
      he<dnd<?, ?>> $$11 = $$1.b(ox.m);
      he<dnd<?, ?>> $$12 = $$1.b(ox.n);
      he<dnd<?, ?>> $$13 = $$1.b(ox.h);
      he<dnd<?, ?>> $$14 = $$1.b(ox.o);
      he<dnd<?, ?>> $$15 = $$1.b(ox.p);
      he<dnd<?, ?>> $$16 = $$1.b(ox.q);
      he<dnd<?, ?>> $$17 = $$1.b(ox.r);
      he<dnd<?, ?>> $$18 = $$1.b(ox.s);
      he<dnd<?, ?>> $$19 = $$1.b(ox.d);
      he<dnd<?, ?>> $$20 = $$1.b(ox.e);
      he<dnd<?, ?>> $$21 = $$1.b(ox.t);
      he<dnd<?, ?>> $$22 = $$1.b(ox.u);
      he<dnd<?, ?>> $$23 = $$1.b(ox.v);
      he<dnd<?, ?>> $$24 = $$1.b(ox.w);
      he<dnd<?, ?>> $$25 = $$1.b(ox.x);
      he<dnd<?, ?>> $$26 = $$1.b(ox.y);
      he<dnd<?, ?>> $$27 = $$1.b(ox.K);
      he<dnd<?, ?>> $$28 = $$1.b(ox.A);
      he<dnd<?, ?>> $$29 = $$1.b(ox.z);
      he<dnd<?, ?>> $$30 = $$1.b(ox.B);
      he<dnd<?, ?>> $$31 = $$1.b(ox.C);
      he<dnd<?, ?>> $$32 = $$1.b(ox.D);
      he<dnd<?, ?>> $$33 = $$1.b(ox.E);
      he<dnd<?, ?>> $$34 = $$1.b(ow.g);
      he<dnd<?, ?>> $$35 = $$1.b(ow.k);
      he<dnd<?, ?>> $$36 = $$1.b(ow.K);
      he<dnd<?, ?>> $$37 = $$1.b(ow.u);
      he<dnd<?, ?>> $$38 = $$1.b(ox.F);
      he<dnd<?, ?>> $$39 = $$1.b(ox.G);
      he<dnd<?, ?>> $$40 = $$1.b(ow.D);
      he<dnd<?, ?>> $$41 = $$1.b(ox.H);
      he<dnd<?, ?>> $$42 = $$1.b(ox.I);
      he<dnd<?, ?>> $$43 = $$1.b(ox.J);
      he<dnd<?, ?>> $$44 = $$1.b(ox.L);
      he<dnd<?, ?>> $$45 = $$1.b(ox.M);
      he<dnd<?, ?>> $$46 = $$1.b(ox.N);
      he<dnd<?, ?>> $$47 = $$1.b(ox.O);
      he<dnd<?, ?>> $$48 = $$1.b(ox.P);
      he<dnd<?, ?>> $$49 = $$1.b(ox.Q);
      he<dnd<?, ?>> $$50 = $$1.b(ox.R);
      pg.a($$0, a, $$2, dum.a(4), dud.a(), pg.a, dtu.a());
      pg.a($$0, b, $$3, due.a(160, 80.0, 0.3), dud.a(), pg.c, dtu.a());
      pg.a($$0, c, $$4, dtz.a(127), dud.a(), dub.a(dlg.a(64), dlg.a(100)), dtu.a());
      pg.a($$0, d, $$5, dum.a(3), dud.a(), pg.a, dtu.a());
      pg.a($$0, e, $$6, dum.a(300), dud.a(), pg.a, dtu.a());
      pg.a($$0, f, $$7, duf.a(-0.8, 5, 10), dud.a(), pg.c, dtu.a());
      pg.a($$0, g, $$7, a(2));
      pg.a($$0, h, $$7, dud.a(), pg.c, dtu.a());
      pg.a($$0, i, $$7, a(20));
      pg.a($$0, j, $$7, a(5));
      pg.a($$0, k, $$8, dud.a(), pg.c, dtu.a());
      pg.a($$0, l, $$8, a(7));
      pg.a($$0, m, $$9, a(25));
      pg.a($$0, n, $$10, pg.a());
      pg.a($$0, o, $$11, a(2));
      pg.a($$0, p, $$11, dud.a(), pg.c, dtu.a());
      pg.a($$0, q, $$11, a(20));
      pg.a($$0, r, $$12, dum.a(6), dud.a(), pg.a, dtu.a());
      pg.a($$0, s, $$12, dum.a(64), dud.a(), pg.a, dtu.a());
      pg.a($$0, t, $$13, dum.a(32), dud.a(), pg.c, dtu.a());
      pg.a($$0, u, $$13, dum.a(384), dud.a(), pg.c, dtu.a());
      pg.a($$0, v, $$14, a(4));
      pg.a($$0, w, $$15, duf.a(-0.8, 0, 7), dum.a(32), dud.a(), pg.a, dtu.a());
      pg.a($$0, x, $$15, dum.a(5), dud.a(), pg.a, dtu.a());
      pg.a($$0, y, $$16, dum.a(5), dud.a(), pg.a, dtu.a());
      pg.a($$0, z, $$17, dum.a(6), dud.a(), pg.a, dtu.a());
      pg.a($$0, A, $$17, dum.a(13), dud.a(), pg.a, dtu.a());
      pg.a($$0, B, $$18, dum.a(3), dud.a(), pg.a, dtu.a());
      pg.a($$0, C, $$18, dud.a(), pg.a, dtu.a());
      pg.a($$0, D, $$18, dum.a(5), dud.a(), pg.a, dtu.a());
      pg.a($$0, E, $$18, dum.a(6), dud.a(), pg.a, dtu.a());
      pg.a($$0, F, $$19, dum.a(2), dud.a(), pg.e, dtu.a());
      pg.a($$0, G, $$20, dum.a(2), dud.a(), pg.e, dtu.a());
      pg.a($$0, H, $$19, a(256, null));
      pg.a($$0, I, $$20, a(512, null));
      pg.a($$0, J, $$19, a(4, null));
      pg.a($$0, K, $$20, a(256, null));
      pg.a($$0, L, $$19, a(4, dtz.a(3)));
      pg.a($$0, M, $$20, a(171, null));
      pg.a($$0, N, $$19, a(0, dtz.a(2)));
      pg.a($$0, O, $$20, a(64, null));
      pg.a($$0, P, $$21, dum.a(16), dud.a(), pg.a, dtu.a());
      pg.a($$0, Q, $$21, dum.a(32), dud.a(), pg.a, dtu.a());
      pg.a($$0, R, $$22, dtz.a(3), dum.a(2), dud.a(), pg.a, dtu.a());
      pg.a($$0, S, $$23, dum.a(32), dud.a(), pg.a, dtu.a());
      pg.a($$0, T, $$24, duf.a(-0.8, 15, 4), dum.a(32), dud.a(), pg.a, dtu.a());
      pg.a($$0, V, $$26, duf.a(-0.8, 5, 10), dud.a(), pg.a, dtu.a());
      pg.a($$0, U, $$25, dud.a(), pg.a, dtu.a());
      duj $$51 = dup.a(0);
      pg.a($$0, W, $$27, pg.a(0, 0.05F, 1), dud.a(), $$51, pg.d, dtv.a(dlt.a(cte.x.o(), gw.b)), dtu.a());
      pg.a($$0, X, $$28, dtz.a(16), dud.a(), $$51, pg.d, dtu.a());
      pg.a($$0, Y, $$29, dum.a(7), dud.a(), pg.a, dtz.a(bgc.a(bgp.a(-1, 3), 0, 3)), dtu.a());
      pg.a($$0, Z, $$29, dum.a(7), dud.a(), pg.a, dtz.a(bgc.a(bgp.a(-3, 1), 0, 1)), dtu.a());
      pg.a($$0, aa, $$30, a(pg.a(6, 0.1F, 1)));
      pg.a($$0, ab, $$31, a(dum.a(100)));
      pg.a($$0, ac, $$36, a(pg.a(10, 0.1F, 1), cte.C));
      pg.a($$0, ad, $$32, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, ae, $$33, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, af, $$34, a(pg.a(5, 0.1F, 1), cte.x));
      pg.a($$0, ag, $$35, a(pg.a(0, 0.1F, 1), cte.y));
      pg.a($$0, ah, $$37, pg.a(2, 0.1F, 1), dud.a(), dup.a(2), pg.d, dtu.a(), dtv.a(dlt.a(cte.x.o(), gw.b)));
      pg.a($$0, ai, $$38, a(pg.a(2, 0.1F, 1)));
      pg.a($$0, aj, $$38, a(pg.a(1, 0.1F, 1)));
      pg.a($$0, ak, $$39, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, al, $$40, a(pg.a(10, 0.1F, 1), cte.z));
      pg.a($$0, am, $$41, a(pg.a(3, 0.1F, 1)));
      pg.a($$0, an, $$41, a(pg.a(0, 0.1F, 1)));
      pg.a($$0, ao, $$42, a(pg.a(0, 0.1F, 1)));
      pg.a($$0, ap, $$43, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, aq, $$44, a(pg.a(2, 0.1F, 1)));
      pg.a($$0, ar, $$45, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, as, $$46, a(pg.a(10, 0.1F, 1)));
      pg.a($$0, at, $$47, a(pg.a(50, 0.1F, 1)));
      pg.a($$0, au, $$48, a(pg.a(30, 0.1F, 1)));
      pg.a($$0, av, $$49, dud.a(), pg.a, dtu.a());
      pg.a($$0, aw, $$50, dtz.a(25), dud.a(), dup.a(5), pg.d, dtu.a(), dtv.a(dlt.a(cte.E.o(), gw.b)));
   }
}
