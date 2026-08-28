import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class si {
   public static final akq<eit> a = sg.a("bamboo_light");
   public static final akq<eit> b = sg.a("bamboo");
   public static final akq<eit> c = sg.a("vines");
   public static final akq<eit> d = sg.a("patch_sunflower");
   public static final akq<eit> e = sg.a("patch_pumpkin");
   public static final akq<eit> f = sg.a("patch_grass_plain");
   public static final akq<eit> g = sg.a("patch_grass_forest");
   public static final akq<eit> h = sg.a("patch_grass_badlands");
   public static final akq<eit> i = sg.a("patch_grass_savanna");
   public static final akq<eit> j = sg.a("patch_grass_normal");
   public static final akq<eit> k = sg.a("patch_grass_taiga_2");
   public static final akq<eit> l = sg.a("patch_grass_taiga");
   public static final akq<eit> m = sg.a("patch_grass_jungle");
   public static final akq<eit> n = sg.a("grass_bonemeal");
   public static final akq<eit> o = sg.a("patch_dead_bush_2");
   public static final akq<eit> p = sg.a("patch_dead_bush");
   public static final akq<eit> q = sg.a("patch_dead_bush_badlands");
   public static final akq<eit> r = sg.a("patch_melon");
   public static final akq<eit> s = sg.a("patch_melon_sparse");
   public static final akq<eit> t = sg.a("patch_berry_common");
   public static final akq<eit> u = sg.a("patch_berry_rare");
   public static final akq<eit> v = sg.a("patch_waterlily");
   public static final akq<eit> w = sg.a("patch_tall_grass_2");
   public static final akq<eit> x = sg.a("patch_tall_grass");
   public static final akq<eit> y = sg.a("patch_large_fern");
   public static final akq<eit> z = sg.a("patch_cactus_desert");
   public static final akq<eit> A = sg.a("patch_cactus_decorated");
   public static final akq<eit> B = sg.a("patch_sugar_cane_swamp");
   public static final akq<eit> C = sg.a("patch_sugar_cane_desert");
   public static final akq<eit> D = sg.a("patch_sugar_cane_badlands");
   public static final akq<eit> E = sg.a("patch_sugar_cane");
   public static final akq<eit> F = sg.a("brown_mushroom_nether");
   public static final akq<eit> G = sg.a("red_mushroom_nether");
   public static final akq<eit> H = sg.a("brown_mushroom_normal");
   public static final akq<eit> I = sg.a("red_mushroom_normal");
   public static final akq<eit> J = sg.a("brown_mushroom_taiga");
   public static final akq<eit> K = sg.a("red_mushroom_taiga");
   public static final akq<eit> L = sg.a("brown_mushroom_old_growth");
   public static final akq<eit> M = sg.a("red_mushroom_old_growth");
   public static final akq<eit> N = sg.a("brown_mushroom_swamp");
   public static final akq<eit> O = sg.a("red_mushroom_swamp");
   public static final akq<eit> P = sg.a("flower_warm");
   public static final akq<eit> Q = sg.a("flower_default");
   public static final akq<eit> R = sg.a("flower_flower_forest");
   public static final akq<eit> S = sg.a("flower_swamp");
   public static final akq<eit> T = sg.a("flower_plains");
   public static final akq<eit> U = sg.a("flower_meadow");
   public static final akq<eit> V = sg.a("flower_cherry");
   public static final akq<eit> W = sg.a("trees_plains");
   public static final akq<eit> X = sg.a("dark_forest_vegetation");
   public static final akq<eit> Y = sg.a("flower_forest_flowers");
   public static final akq<eit> Z = sg.a("forest_flowers");
   public static final akq<eit> aa = sg.a("trees_flower_forest");
   public static final akq<eit> ab = sg.a("trees_meadow");
   public static final akq<eit> ac = sg.a("trees_cherry");
   public static final akq<eit> ad = sg.a("trees_taiga");
   public static final akq<eit> ae = sg.a("trees_grove");
   public static final akq<eit> af = sg.a("trees_badlands");
   public static final akq<eit> ag = sg.a("trees_snowy");
   public static final akq<eit> ah = sg.a("trees_swamp");
   public static final akq<eit> ai = sg.a("trees_windswept_savanna");
   public static final akq<eit> aj = sg.a("trees_savanna");
   public static final akq<eit> ak = sg.a("birch_tall");
   public static final akq<eit> al = sg.a("trees_birch");
   public static final akq<eit> am = sg.a("trees_windswept_forest");
   public static final akq<eit> an = sg.a("trees_windswept_hills");
   public static final akq<eit> ao = sg.a("trees_water");
   public static final akq<eit> ap = sg.a("trees_birch_and_oak");
   public static final akq<eit> aq = sg.a("trees_sparse_jungle");
   public static final akq<eit> ar = sg.a("trees_old_growth_spruce_taiga");
   public static final akq<eit> as = sg.a("trees_old_growth_pine_taiga");
   public static final akq<eit> at = sg.a("trees_jungle");
   public static final akq<eit> au = sg.a("bamboo_vegetation");
   public static final akq<eit> av = sg.a("mushroom_island_vegetation");
   public static final akq<eit> aw = sg.a("trees_mangrove");
   private static final eiw ax = ejc.a(0);

   public static List<eiw> a(int $$0) {
      return List.of(eim.a($$0), eiq.a(), sg.c, eih.a());
   }

   private static List<eiw> a(int $$0, @Nullable eiw $$1) {
      Builder<eiw> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eiz.a($$0));
      }

      $$2.add(eiq.a());
      $$2.add(sg.a);
      $$2.add(eih.a());
      return $$2.build();
   }

   private static Builder<eiw> b(eiw $$0) {
      return ImmutableList.builder().add($$0).add(eiq.a()).add(ax).add(sg.d).add(eih.a());
   }

   public static List<eiw> a(eiw $$0) {
      return b($$0).build();
   }

   public static List<eiw> a(eiw $$0, dfy $$1) {
      return b($$0).add(eii.a(eaf.a($$1.o(), jd.c))).build();
   }

   public static void a(qq<eit> $$0) {
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
      sg.a($$0, a, $$2, eiz.a(4), eiq.a(), sg.a, eih.a());
      sg.a($$0, b, $$3, eir.a(160, 80.0, 0.3), eiq.a(), sg.c, eih.a());
      sg.a($$0, c, $$4, eim.a(127), eiq.a(), eio.a(dzs.a(64), dzs.a(100)), eih.a());
      sg.a($$0, d, $$5, eiz.a(3), eiq.a(), sg.a, eih.a());
      sg.a($$0, e, $$6, eiz.a(300), eiq.a(), sg.a, eih.a());
      sg.a($$0, f, $$7, eis.a(-0.8, 5, 10), eiq.a(), sg.c, eih.a());
      sg.a($$0, g, $$7, a(2));
      sg.a($$0, h, $$7, eiq.a(), sg.c, eih.a());
      sg.a($$0, i, $$7, a(20));
      sg.a($$0, j, $$7, a(5));
      sg.a($$0, k, $$8, eiq.a(), sg.c, eih.a());
      sg.a($$0, l, $$8, a(7));
      sg.a($$0, m, $$9, a(25));
      sg.a($$0, n, $$10, sg.a());
      sg.a($$0, o, $$11, a(2));
      sg.a($$0, p, $$11, eiq.a(), sg.c, eih.a());
      sg.a($$0, q, $$11, a(20));
      sg.a($$0, r, $$12, eiz.a(6), eiq.a(), sg.a, eih.a());
      sg.a($$0, s, $$12, eiz.a(64), eiq.a(), sg.a, eih.a());
      sg.a($$0, t, $$13, eiz.a(32), eiq.a(), sg.c, eih.a());
      sg.a($$0, u, $$13, eiz.a(384), eiq.a(), sg.c, eih.a());
      sg.a($$0, v, $$14, a(4));
      sg.a($$0, w, $$15, eis.a(-0.8, 0, 7), eiz.a(32), eiq.a(), sg.a, eih.a());
      sg.a($$0, x, $$15, eiz.a(5), eiq.a(), sg.a, eih.a());
      sg.a($$0, y, $$16, eiz.a(5), eiq.a(), sg.a, eih.a());
      sg.a($$0, z, $$17, eiz.a(6), eiq.a(), sg.a, eih.a());
      sg.a($$0, A, $$17, eiz.a(13), eiq.a(), sg.a, eih.a());
      sg.a($$0, B, $$18, eiz.a(3), eiq.a(), sg.a, eih.a());
      sg.a($$0, C, $$18, eiq.a(), sg.a, eih.a());
      sg.a($$0, D, $$18, eiz.a(5), eiq.a(), sg.a, eih.a());
      sg.a($$0, E, $$18, eiz.a(6), eiq.a(), sg.a, eih.a());
      sg.a($$0, F, $$19, eiz.a(2), eiq.a(), sg.e, eih.a());
      sg.a($$0, G, $$20, eiz.a(2), eiq.a(), sg.e, eih.a());
      sg.a($$0, H, $$19, a(256, null));
      sg.a($$0, I, $$20, a(512, null));
      sg.a($$0, J, $$19, a(4, null));
      sg.a($$0, K, $$20, a(256, null));
      sg.a($$0, L, $$19, a(4, eim.a(3)));
      sg.a($$0, M, $$20, a(171, null));
      sg.a($$0, N, $$19, a(0, eim.a(2)));
      sg.a($$0, O, $$20, a(64, null));
      sg.a($$0, P, $$21, eiz.a(16), eiq.a(), sg.a, eih.a());
      sg.a($$0, Q, $$21, eiz.a(32), eiq.a(), sg.a, eih.a());
      sg.a($$0, R, $$22, eim.a(3), eiz.a(2), eiq.a(), sg.a, eih.a());
      sg.a($$0, S, $$23, eiz.a(32), eiq.a(), sg.a, eih.a());
      sg.a($$0, T, $$24, eis.a(-0.8, 15, 4), eiz.a(32), eiq.a(), sg.a, eih.a());
      sg.a($$0, V, $$26, eis.a(-0.8, 5, 10), eiq.a(), sg.a, eih.a());
      sg.a($$0, U, $$25, eiq.a(), sg.a, eih.a());
      eiw $$51 = ejc.a(0);
      sg.a($$0, W, $$27, sg.a(0, 0.05F, 1), eiq.a(), $$51, sg.d, eii.a(eaf.a(dga.x.o(), jd.c)), eih.a());
      sg.a($$0, X, $$28, eim.a(16), eiq.a(), $$51, sg.d, eih.a());
      sg.a($$0, Y, $$29, eiz.a(7), eiq.a(), sg.a, eim.a(bpp.a(bqc.a(-1, 3), 0, 3)), eih.a());
      sg.a($$0, Z, $$29, eiz.a(7), eiq.a(), sg.a, eim.a(bpp.a(bqc.a(-3, 1), 0, 1)), eih.a());
      sg.a($$0, aa, $$30, a(sg.a(6, 0.1F, 1)));
      sg.a($$0, ab, $$31, a(eiz.a(100)));
      sg.a($$0, ac, $$36, a(sg.a(10, 0.1F, 1), dga.C));
      sg.a($$0, ad, $$32, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, ae, $$33, a(sg.a(10, 0.1F, 1)));
      sg.a($$0, af, $$34, a(sg.a(5, 0.1F, 1), dga.x));
      sg.a($$0, ag, $$35, a(sg.a(0, 0.1F, 1), dga.y));
      sg.a($$0, ah, $$37, sg.a(2, 0.1F, 1), eiq.a(), ejc.a(2), sg.d, eih.a(), eii.a(eaf.a(dga.x.o(), jd.c)));
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
      sg.a($$0, av, $$49, eiq.a(), sg.a, eih.a());
      sg.a($$0, aw, $$50, eim.a(25), eiq.a(), ejc.a(5), sg.d, eih.a(), eii.a(eaf.a(dga.E.o(), jd.c)));
   }
}
