import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class si {
   public static final akq<eiv> a = sg.a("bamboo_light");
   public static final akq<eiv> b = sg.a("bamboo");
   public static final akq<eiv> c = sg.a("vines");
   public static final akq<eiv> d = sg.a("patch_sunflower");
   public static final akq<eiv> e = sg.a("patch_pumpkin");
   public static final akq<eiv> f = sg.a("patch_grass_plain");
   public static final akq<eiv> g = sg.a("patch_grass_forest");
   public static final akq<eiv> h = sg.a("patch_grass_badlands");
   public static final akq<eiv> i = sg.a("patch_grass_savanna");
   public static final akq<eiv> j = sg.a("patch_grass_normal");
   public static final akq<eiv> k = sg.a("patch_grass_taiga_2");
   public static final akq<eiv> l = sg.a("patch_grass_taiga");
   public static final akq<eiv> m = sg.a("patch_grass_jungle");
   public static final akq<eiv> n = sg.a("grass_bonemeal");
   public static final akq<eiv> o = sg.a("patch_dead_bush_2");
   public static final akq<eiv> p = sg.a("patch_dead_bush");
   public static final akq<eiv> q = sg.a("patch_dead_bush_badlands");
   public static final akq<eiv> r = sg.a("patch_melon");
   public static final akq<eiv> s = sg.a("patch_melon_sparse");
   public static final akq<eiv> t = sg.a("patch_berry_common");
   public static final akq<eiv> u = sg.a("patch_berry_rare");
   public static final akq<eiv> v = sg.a("patch_waterlily");
   public static final akq<eiv> w = sg.a("patch_tall_grass_2");
   public static final akq<eiv> x = sg.a("patch_tall_grass");
   public static final akq<eiv> y = sg.a("patch_large_fern");
   public static final akq<eiv> z = sg.a("patch_cactus_desert");
   public static final akq<eiv> A = sg.a("patch_cactus_decorated");
   public static final akq<eiv> B = sg.a("patch_sugar_cane_swamp");
   public static final akq<eiv> C = sg.a("patch_sugar_cane_desert");
   public static final akq<eiv> D = sg.a("patch_sugar_cane_badlands");
   public static final akq<eiv> E = sg.a("patch_sugar_cane");
   public static final akq<eiv> F = sg.a("brown_mushroom_nether");
   public static final akq<eiv> G = sg.a("red_mushroom_nether");
   public static final akq<eiv> H = sg.a("brown_mushroom_normal");
   public static final akq<eiv> I = sg.a("red_mushroom_normal");
   public static final akq<eiv> J = sg.a("brown_mushroom_taiga");
   public static final akq<eiv> K = sg.a("red_mushroom_taiga");
   public static final akq<eiv> L = sg.a("brown_mushroom_old_growth");
   public static final akq<eiv> M = sg.a("red_mushroom_old_growth");
   public static final akq<eiv> N = sg.a("brown_mushroom_swamp");
   public static final akq<eiv> O = sg.a("red_mushroom_swamp");
   public static final akq<eiv> P = sg.a("flower_warm");
   public static final akq<eiv> Q = sg.a("flower_default");
   public static final akq<eiv> R = sg.a("flower_flower_forest");
   public static final akq<eiv> S = sg.a("flower_swamp");
   public static final akq<eiv> T = sg.a("flower_plains");
   public static final akq<eiv> U = sg.a("flower_meadow");
   public static final akq<eiv> V = sg.a("flower_cherry");
   public static final akq<eiv> W = sg.a("trees_plains");
   public static final akq<eiv> X = sg.a("dark_forest_vegetation");
   public static final akq<eiv> Y = sg.a("flower_forest_flowers");
   public static final akq<eiv> Z = sg.a("forest_flowers");
   public static final akq<eiv> aa = sg.a("trees_flower_forest");
   public static final akq<eiv> ab = sg.a("trees_meadow");
   public static final akq<eiv> ac = sg.a("trees_cherry");
   public static final akq<eiv> ad = sg.a("trees_taiga");
   public static final akq<eiv> ae = sg.a("trees_grove");
   public static final akq<eiv> af = sg.a("trees_badlands");
   public static final akq<eiv> ag = sg.a("trees_snowy");
   public static final akq<eiv> ah = sg.a("trees_swamp");
   public static final akq<eiv> ai = sg.a("trees_windswept_savanna");
   public static final akq<eiv> aj = sg.a("trees_savanna");
   public static final akq<eiv> ak = sg.a("birch_tall");
   public static final akq<eiv> al = sg.a("trees_birch");
   public static final akq<eiv> am = sg.a("trees_windswept_forest");
   public static final akq<eiv> an = sg.a("trees_windswept_hills");
   public static final akq<eiv> ao = sg.a("trees_water");
   public static final akq<eiv> ap = sg.a("trees_birch_and_oak");
   public static final akq<eiv> aq = sg.a("trees_sparse_jungle");
   public static final akq<eiv> ar = sg.a("trees_old_growth_spruce_taiga");
   public static final akq<eiv> as = sg.a("trees_old_growth_pine_taiga");
   public static final akq<eiv> at = sg.a("trees_jungle");
   public static final akq<eiv> au = sg.a("bamboo_vegetation");
   public static final akq<eiv> av = sg.a("mushroom_island_vegetation");
   public static final akq<eiv> aw = sg.a("trees_mangrove");
   private static final eiy ax = eje.a(0);

   public static List<eiy> a(int $$0) {
      return List.of(ein.a($$0), eis.a(), sg.c, eii.a());
   }

   private static List<eiy> a(int $$0, @Nullable eiy $$1) {
      Builder<eiy> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ejb.a($$0));
      }

      $$2.add(eis.a());
      $$2.add(sg.a);
      $$2.add(eii.a());
      return $$2.build();
   }

   private static Builder<eiy> b(eiy $$0) {
      return ImmutableList.builder().add($$0).add(eis.a()).add(ax).add(sg.d).add(eii.a());
   }

   public static List<eiy> a(eiy $$0) {
      return b($$0).build();
   }

   public static List<eiy> a(eiy $$0, dfy $$1) {
      return b($$0).add(eij.a(eaf.a($$1.o(), jd.c))).build();
   }

   public static void a(qq<eiv> $$0) {
      jn<ebq<?, ?>> $$1 = $$0.a(lu.aI);
      jm<ebq<?, ?>> $$2 = $$1.b(rx.a);
      jm<ebq<?, ?>> $$3 = $$1.b(rx.b);
      jm<ebq<?, ?>> $$4 = $$1.b(rx.c);
      jm<ebq<?, ?>> $$5 = $$1.b(rx.f);
      jm<ebq<?, ?>> $$6 = $$1.b(rx.g);
      jm<ebq<?, ?>> $$7 = $$1.b(rx.j);
      jm<ebq<?, ?>> $$8 = $$1.b(rx.i);
      jm<ebq<?, ?>> $$9 = $$1.b(rx.k);
      jm<ebq<?, ?>> $$10 = $$1.b(rx.l);
      jm<ebq<?, ?>> $$11 = $$1.b(rx.m);
      jm<ebq<?, ?>> $$12 = $$1.b(rx.n);
      jm<ebq<?, ?>> $$13 = $$1.b(rx.h);
      jm<ebq<?, ?>> $$14 = $$1.b(rx.o);
      jm<ebq<?, ?>> $$15 = $$1.b(rx.p);
      jm<ebq<?, ?>> $$16 = $$1.b(rx.q);
      jm<ebq<?, ?>> $$17 = $$1.b(rx.r);
      jm<ebq<?, ?>> $$18 = $$1.b(rx.s);
      jm<ebq<?, ?>> $$19 = $$1.b(rx.d);
      jm<ebq<?, ?>> $$20 = $$1.b(rx.e);
      jm<ebq<?, ?>> $$21 = $$1.b(rx.t);
      jm<ebq<?, ?>> $$22 = $$1.b(rx.u);
      jm<ebq<?, ?>> $$23 = $$1.b(rx.v);
      jm<ebq<?, ?>> $$24 = $$1.b(rx.w);
      jm<ebq<?, ?>> $$25 = $$1.b(rx.x);
      jm<ebq<?, ?>> $$26 = $$1.b(rx.y);
      jm<ebq<?, ?>> $$27 = $$1.b(rx.K);
      jm<ebq<?, ?>> $$28 = $$1.b(rx.A);
      jm<ebq<?, ?>> $$29 = $$1.b(rx.z);
      jm<ebq<?, ?>> $$30 = $$1.b(rx.B);
      jm<ebq<?, ?>> $$31 = $$1.b(rx.C);
      jm<ebq<?, ?>> $$32 = $$1.b(rx.D);
      jm<ebq<?, ?>> $$33 = $$1.b(rx.E);
      jm<ebq<?, ?>> $$34 = $$1.b(rw.g);
      jm<ebq<?, ?>> $$35 = $$1.b(rw.k);
      jm<ebq<?, ?>> $$36 = $$1.b(rw.K);
      jm<ebq<?, ?>> $$37 = $$1.b(rw.u);
      jm<ebq<?, ?>> $$38 = $$1.b(rx.F);
      jm<ebq<?, ?>> $$39 = $$1.b(rx.G);
      jm<ebq<?, ?>> $$40 = $$1.b(rw.D);
      jm<ebq<?, ?>> $$41 = $$1.b(rx.H);
      jm<ebq<?, ?>> $$42 = $$1.b(rx.I);
      jm<ebq<?, ?>> $$43 = $$1.b(rx.J);
      jm<ebq<?, ?>> $$44 = $$1.b(rx.L);
      jm<ebq<?, ?>> $$45 = $$1.b(rx.M);
      jm<ebq<?, ?>> $$46 = $$1.b(rx.N);
      jm<ebq<?, ?>> $$47 = $$1.b(rx.O);
      jm<ebq<?, ?>> $$48 = $$1.b(rx.P);
      jm<ebq<?, ?>> $$49 = $$1.b(rx.Q);
      jm<ebq<?, ?>> $$50 = $$1.b(rx.R);
      sg.a($$0, a, $$2, ejb.a(4), eis.a(), sg.a, eii.a());
      sg.a($$0, b, $$3, eit.a(160, 80.0, 0.3), eis.a(), sg.c, eii.a());
      sg.a($$0, c, $$4, ein.a(127), eis.a(), eiq.a(dzs.a(64), dzs.a(100)), eii.a());
      sg.a($$0, d, $$5, ejb.a(3), eis.a(), sg.a, eii.a());
      sg.a($$0, e, $$6, ejb.a(300), eis.a(), sg.a, eii.a());
      sg.a($$0, f, $$7, eiu.a(-0.8, 5, 10), eis.a(), sg.c, eii.a());
      sg.a($$0, g, $$7, a(2));
      sg.a($$0, h, $$7, eis.a(), sg.c, eii.a());
      sg.a($$0, i, $$7, a(20));
      sg.a($$0, j, $$7, a(5));
      sg.a($$0, k, $$8, eis.a(), sg.c, eii.a());
      sg.a($$0, l, $$8, a(7));
      sg.a($$0, m, $$9, a(25));
      sg.a($$0, n, $$10, sg.a());
      sg.a($$0, o, $$11, a(2));
      sg.a($$0, p, $$11, eis.a(), sg.c, eii.a());
      sg.a($$0, q, $$11, a(20));
      sg.a($$0, r, $$12, ejb.a(6), eis.a(), sg.a, eii.a());
      sg.a($$0, s, $$12, ejb.a(64), eis.a(), sg.a, eii.a());
      sg.a($$0, t, $$13, ejb.a(32), eis.a(), sg.c, eii.a());
      sg.a($$0, u, $$13, ejb.a(384), eis.a(), sg.c, eii.a());
      sg.a($$0, v, $$14, a(4));
      sg.a($$0, w, $$15, eiu.a(-0.8, 0, 7), ejb.a(32), eis.a(), sg.a, eii.a());
      sg.a($$0, x, $$15, ejb.a(5), eis.a(), sg.a, eii.a());
      sg.a($$0, y, $$16, ejb.a(5), eis.a(), sg.a, eii.a());
      sg.a($$0, z, $$17, ejb.a(6), eis.a(), sg.a, eii.a());
      sg.a($$0, A, $$17, ejb.a(13), eis.a(), sg.a, eii.a());
      sg.a($$0, B, $$18, ejb.a(3), eis.a(), sg.a, eii.a());
      sg.a($$0, C, $$18, eis.a(), sg.a, eii.a());
      sg.a($$0, D, $$18, ejb.a(5), eis.a(), sg.a, eii.a());
      sg.a($$0, E, $$18, ejb.a(6), eis.a(), sg.a, eii.a());
      sg.a($$0, F, $$19, ejb.a(2), eis.a(), sg.e, eii.a());
      sg.a($$0, G, $$20, ejb.a(2), eis.a(), sg.e, eii.a());
      sg.a($$0, H, $$19, a(256, null));
      sg.a($$0, I, $$20, a(512, null));
      sg.a($$0, J, $$19, a(4, null));
      sg.a($$0, K, $$20, a(256, null));
      sg.a($$0, L, $$19, a(4, ein.a(3)));
      sg.a($$0, M, $$20, a(171, null));
      sg.a($$0, N, $$19, a(0, ein.a(2)));
      sg.a($$0, O, $$20, a(64, null));
      sg.a($$0, P, $$21, ejb.a(16), eis.a(), sg.a, eii.a());
      sg.a($$0, Q, $$21, ejb.a(32), eis.a(), sg.a, eii.a());
      sg.a($$0, R, $$22, ein.a(3), ejb.a(2), eis.a(), sg.a, eii.a());
      sg.a($$0, S, $$23, ejb.a(32), eis.a(), sg.a, eii.a());
      sg.a($$0, T, $$24, eiu.a(-0.8, 15, 4), ejb.a(32), eis.a(), sg.a, eii.a());
      sg.a($$0, V, $$26, eiu.a(-0.8, 5, 10), eis.a(), sg.a, eii.a());
      sg.a($$0, U, $$25, eis.a(), sg.a, eii.a());
      eiy $$51 = eje.a(0);
      sg.a($$0, W, $$27, sg.a(0, 0.05F, 1), eis.a(), $$51, sg.d, eij.a(eaf.a(dga.x.o(), jd.c)), eii.a());
      sg.a($$0, X, $$28, ein.a(16), eis.a(), $$51, sg.d, eii.a());
      sg.a($$0, Y, $$29, ejb.a(7), eis.a(), sg.a, ein.a(bpp.a(bqc.a(-1, 3), 0, 3)), eii.a());
      sg.a($$0, Z, $$29, ejb.a(7), eis.a(), sg.a, ein.a(bpp.a(bqc.a(-3, 1), 0, 1)), eii.a());
      sg.a($$0, aa, $$30, a(sg.a(6, 0.1F, 1)));
      sg.a($$0, ab, $$31, a(ejb.a(100)));
      sg.a($$0, ac, $$36, a(sg.a(10, 0.1F, 1), dga.C));
      sg.a($$0, ad, $$32, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, ae, $$33, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, af, $$34, a(sg.a(5, 0.1F, 1), dga.x));
      sg.a($$0, ag, $$35, a(sg.a(0, 0.1F, 1), dga.y));
      sg.a($$0, ah, $$37, sg.a(2, 0.1F, 1), eis.a(), eje.a(2), sg.d, eii.a(), eij.a(eaf.a(dga.x.o(), jd.c)));
      sg.a($$0, ai, $$38, a(sg.a(2, 0.1F, 1)));
      sg.a($$0, aj, $$38, a(sg.a(1, 0.1F, 1)));
      sg.a($$0, ak, $$39, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, al, $$40, a(sg.a(10, 0.1F, 1), dga.z));
      sg.a($$0, am, $$41, a(sg.a(3, 0.1F, 1)));
      sg.a($$0, an, $$41, a(sg.a(0, 0.1F, 1)));
      sg.a($$0, ao, $$42, a(sg.a(0, 0.1F, 1)));
      sg.a($$0, ap, $$43, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, aq, $$44, a(sg.a(2, 0.1F, 1)));
      sg.a($$0, ar, $$45, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, as, $$46, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, at, $$47, a(sg.a(50, 0.1F, 1)));
      sg.a($$0, au, $$48, a(sg.a(30, 0.1F, 1)));
      sg.a($$0, av, $$49, eis.a(), sg.a, eii.a());
      sg.a($$0, aw, $$50, ein.a(25), eis.a(), eje.a(5), sg.d, eii.a(), eij.a(eaf.a(dga.E.o(), jd.c)));
   }
}
