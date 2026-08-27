import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pg {
   public static final aet<duh> a = pe.a("bamboo_light");
   public static final aet<duh> b = pe.a("bamboo");
   public static final aet<duh> c = pe.a("vines");
   public static final aet<duh> d = pe.a("patch_sunflower");
   public static final aet<duh> e = pe.a("patch_pumpkin");
   public static final aet<duh> f = pe.a("patch_grass_plain");
   public static final aet<duh> g = pe.a("patch_grass_forest");
   public static final aet<duh> h = pe.a("patch_grass_badlands");
   public static final aet<duh> i = pe.a("patch_grass_savanna");
   public static final aet<duh> j = pe.a("patch_grass_normal");
   public static final aet<duh> k = pe.a("patch_grass_taiga_2");
   public static final aet<duh> l = pe.a("patch_grass_taiga");
   public static final aet<duh> m = pe.a("patch_grass_jungle");
   public static final aet<duh> n = pe.a("grass_bonemeal");
   public static final aet<duh> o = pe.a("patch_dead_bush_2");
   public static final aet<duh> p = pe.a("patch_dead_bush");
   public static final aet<duh> q = pe.a("patch_dead_bush_badlands");
   public static final aet<duh> r = pe.a("patch_melon");
   public static final aet<duh> s = pe.a("patch_melon_sparse");
   public static final aet<duh> t = pe.a("patch_berry_common");
   public static final aet<duh> u = pe.a("patch_berry_rare");
   public static final aet<duh> v = pe.a("patch_waterlily");
   public static final aet<duh> w = pe.a("patch_tall_grass_2");
   public static final aet<duh> x = pe.a("patch_tall_grass");
   public static final aet<duh> y = pe.a("patch_large_fern");
   public static final aet<duh> z = pe.a("patch_cactus_desert");
   public static final aet<duh> A = pe.a("patch_cactus_decorated");
   public static final aet<duh> B = pe.a("patch_sugar_cane_swamp");
   public static final aet<duh> C = pe.a("patch_sugar_cane_desert");
   public static final aet<duh> D = pe.a("patch_sugar_cane_badlands");
   public static final aet<duh> E = pe.a("patch_sugar_cane");
   public static final aet<duh> F = pe.a("brown_mushroom_nether");
   public static final aet<duh> G = pe.a("red_mushroom_nether");
   public static final aet<duh> H = pe.a("brown_mushroom_normal");
   public static final aet<duh> I = pe.a("red_mushroom_normal");
   public static final aet<duh> J = pe.a("brown_mushroom_taiga");
   public static final aet<duh> K = pe.a("red_mushroom_taiga");
   public static final aet<duh> L = pe.a("brown_mushroom_old_growth");
   public static final aet<duh> M = pe.a("red_mushroom_old_growth");
   public static final aet<duh> N = pe.a("brown_mushroom_swamp");
   public static final aet<duh> O = pe.a("red_mushroom_swamp");
   public static final aet<duh> P = pe.a("flower_warm");
   public static final aet<duh> Q = pe.a("flower_default");
   public static final aet<duh> R = pe.a("flower_flower_forest");
   public static final aet<duh> S = pe.a("flower_swamp");
   public static final aet<duh> T = pe.a("flower_plains");
   public static final aet<duh> U = pe.a("flower_meadow");
   public static final aet<duh> V = pe.a("flower_cherry");
   public static final aet<duh> W = pe.a("trees_plains");
   public static final aet<duh> X = pe.a("dark_forest_vegetation");
   public static final aet<duh> Y = pe.a("flower_forest_flowers");
   public static final aet<duh> Z = pe.a("forest_flowers");
   public static final aet<duh> aa = pe.a("trees_flower_forest");
   public static final aet<duh> ab = pe.a("trees_meadow");
   public static final aet<duh> ac = pe.a("trees_cherry");
   public static final aet<duh> ad = pe.a("trees_taiga");
   public static final aet<duh> ae = pe.a("trees_grove");
   public static final aet<duh> af = pe.a("trees_badlands");
   public static final aet<duh> ag = pe.a("trees_snowy");
   public static final aet<duh> ah = pe.a("trees_swamp");
   public static final aet<duh> ai = pe.a("trees_windswept_savanna");
   public static final aet<duh> aj = pe.a("trees_savanna");
   public static final aet<duh> ak = pe.a("birch_tall");
   public static final aet<duh> al = pe.a("trees_birch");
   public static final aet<duh> am = pe.a("trees_windswept_forest");
   public static final aet<duh> an = pe.a("trees_windswept_hills");
   public static final aet<duh> ao = pe.a("trees_water");
   public static final aet<duh> ap = pe.a("trees_birch_and_oak");
   public static final aet<duh> aq = pe.a("trees_sparse_jungle");
   public static final aet<duh> ar = pe.a("trees_old_growth_spruce_taiga");
   public static final aet<duh> as = pe.a("trees_old_growth_pine_taiga");
   public static final aet<duh> at = pe.a("trees_jungle");
   public static final aet<duh> au = pe.a("bamboo_vegetation");
   public static final aet<duh> av = pe.a("mushroom_island_vegetation");
   public static final aet<duh> aw = pe.a("trees_mangrove");
   private static final duk ax = duq.a(0);

   public static List<duk> a(int $$0) {
      return List.of(dua.a($$0), due.a(), pe.c, dtv.a());
   }

   private static List<duk> a(int $$0, @Nullable duk $$1) {
      Builder<duk> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(dun.a($$0));
      }

      $$2.add(due.a());
      $$2.add(pe.a);
      $$2.add(dtv.a());
      return $$2.build();
   }

   private static Builder<duk> b(duk $$0) {
      return ImmutableList.builder().add($$0).add(due.a()).add(ax).add(pe.d).add(dtv.a());
   }

   public static List<duk> a(duk $$0) {
      return b($$0).build();
   }

   public static List<duk> a(duk $$0, csq $$1) {
      return b($$0).add(dtw.a(dlu.a($$1.n(), gw.b))).build();
   }

   public static void a(np<duh> $$0) {
      hh<dne<?, ?>> $$1 = $$0.a(je.as);
      hg<dne<?, ?>> $$2 = $$1.b(ov.a);
      hg<dne<?, ?>> $$3 = $$1.b(ov.b);
      hg<dne<?, ?>> $$4 = $$1.b(ov.c);
      hg<dne<?, ?>> $$5 = $$1.b(ov.f);
      hg<dne<?, ?>> $$6 = $$1.b(ov.g);
      hg<dne<?, ?>> $$7 = $$1.b(ov.j);
      hg<dne<?, ?>> $$8 = $$1.b(ov.i);
      hg<dne<?, ?>> $$9 = $$1.b(ov.k);
      hg<dne<?, ?>> $$10 = $$1.b(ov.l);
      hg<dne<?, ?>> $$11 = $$1.b(ov.m);
      hg<dne<?, ?>> $$12 = $$1.b(ov.n);
      hg<dne<?, ?>> $$13 = $$1.b(ov.h);
      hg<dne<?, ?>> $$14 = $$1.b(ov.o);
      hg<dne<?, ?>> $$15 = $$1.b(ov.p);
      hg<dne<?, ?>> $$16 = $$1.b(ov.q);
      hg<dne<?, ?>> $$17 = $$1.b(ov.r);
      hg<dne<?, ?>> $$18 = $$1.b(ov.s);
      hg<dne<?, ?>> $$19 = $$1.b(ov.d);
      hg<dne<?, ?>> $$20 = $$1.b(ov.e);
      hg<dne<?, ?>> $$21 = $$1.b(ov.t);
      hg<dne<?, ?>> $$22 = $$1.b(ov.u);
      hg<dne<?, ?>> $$23 = $$1.b(ov.v);
      hg<dne<?, ?>> $$24 = $$1.b(ov.w);
      hg<dne<?, ?>> $$25 = $$1.b(ov.x);
      hg<dne<?, ?>> $$26 = $$1.b(ov.y);
      hg<dne<?, ?>> $$27 = $$1.b(ov.K);
      hg<dne<?, ?>> $$28 = $$1.b(ov.A);
      hg<dne<?, ?>> $$29 = $$1.b(ov.z);
      hg<dne<?, ?>> $$30 = $$1.b(ov.B);
      hg<dne<?, ?>> $$31 = $$1.b(ov.C);
      hg<dne<?, ?>> $$32 = $$1.b(ov.D);
      hg<dne<?, ?>> $$33 = $$1.b(ov.E);
      hg<dne<?, ?>> $$34 = $$1.b(ou.g);
      hg<dne<?, ?>> $$35 = $$1.b(ou.k);
      hg<dne<?, ?>> $$36 = $$1.b(ou.K);
      hg<dne<?, ?>> $$37 = $$1.b(ou.u);
      hg<dne<?, ?>> $$38 = $$1.b(ov.F);
      hg<dne<?, ?>> $$39 = $$1.b(ov.G);
      hg<dne<?, ?>> $$40 = $$1.b(ou.D);
      hg<dne<?, ?>> $$41 = $$1.b(ov.H);
      hg<dne<?, ?>> $$42 = $$1.b(ov.I);
      hg<dne<?, ?>> $$43 = $$1.b(ov.J);
      hg<dne<?, ?>> $$44 = $$1.b(ov.L);
      hg<dne<?, ?>> $$45 = $$1.b(ov.M);
      hg<dne<?, ?>> $$46 = $$1.b(ov.N);
      hg<dne<?, ?>> $$47 = $$1.b(ov.O);
      hg<dne<?, ?>> $$48 = $$1.b(ov.P);
      hg<dne<?, ?>> $$49 = $$1.b(ov.Q);
      hg<dne<?, ?>> $$50 = $$1.b(ov.R);
      pe.a($$0, a, $$2, dun.a(4), due.a(), pe.a, dtv.a());
      pe.a($$0, b, $$3, duf.a(160, 80.0, 0.3), due.a(), pe.c, dtv.a());
      pe.a($$0, c, $$4, dua.a(127), due.a(), duc.a(dlh.a(64), dlh.a(100)), dtv.a());
      pe.a($$0, d, $$5, dun.a(3), due.a(), pe.a, dtv.a());
      pe.a($$0, e, $$6, dun.a(300), due.a(), pe.a, dtv.a());
      pe.a($$0, f, $$7, dug.a(-0.8, 5, 10), due.a(), pe.c, dtv.a());
      pe.a($$0, g, $$7, a(2));
      pe.a($$0, h, $$7, due.a(), pe.c, dtv.a());
      pe.a($$0, i, $$7, a(20));
      pe.a($$0, j, $$7, a(5));
      pe.a($$0, k, $$8, due.a(), pe.c, dtv.a());
      pe.a($$0, l, $$8, a(7));
      pe.a($$0, m, $$9, a(25));
      pe.a($$0, n, $$10, pe.a());
      pe.a($$0, o, $$11, a(2));
      pe.a($$0, p, $$11, due.a(), pe.c, dtv.a());
      pe.a($$0, q, $$11, a(20));
      pe.a($$0, r, $$12, dun.a(6), due.a(), pe.a, dtv.a());
      pe.a($$0, s, $$12, dun.a(64), due.a(), pe.a, dtv.a());
      pe.a($$0, t, $$13, dun.a(32), due.a(), pe.c, dtv.a());
      pe.a($$0, u, $$13, dun.a(384), due.a(), pe.c, dtv.a());
      pe.a($$0, v, $$14, a(4));
      pe.a($$0, w, $$15, dug.a(-0.8, 0, 7), dun.a(32), due.a(), pe.a, dtv.a());
      pe.a($$0, x, $$15, dun.a(5), due.a(), pe.a, dtv.a());
      pe.a($$0, y, $$16, dun.a(5), due.a(), pe.a, dtv.a());
      pe.a($$0, z, $$17, dun.a(6), due.a(), pe.a, dtv.a());
      pe.a($$0, A, $$17, dun.a(13), due.a(), pe.a, dtv.a());
      pe.a($$0, B, $$18, dun.a(3), due.a(), pe.a, dtv.a());
      pe.a($$0, C, $$18, due.a(), pe.a, dtv.a());
      pe.a($$0, D, $$18, dun.a(5), due.a(), pe.a, dtv.a());
      pe.a($$0, E, $$18, dun.a(6), due.a(), pe.a, dtv.a());
      pe.a($$0, F, $$19, dun.a(2), due.a(), pe.e, dtv.a());
      pe.a($$0, G, $$20, dun.a(2), due.a(), pe.e, dtv.a());
      pe.a($$0, H, $$19, a(256, null));
      pe.a($$0, I, $$20, a(512, null));
      pe.a($$0, J, $$19, a(4, null));
      pe.a($$0, K, $$20, a(256, null));
      pe.a($$0, L, $$19, a(4, dua.a(3)));
      pe.a($$0, M, $$20, a(171, null));
      pe.a($$0, N, $$19, a(0, dua.a(2)));
      pe.a($$0, O, $$20, a(64, null));
      pe.a($$0, P, $$21, dun.a(16), due.a(), pe.a, dtv.a());
      pe.a($$0, Q, $$21, dun.a(32), due.a(), pe.a, dtv.a());
      pe.a($$0, R, $$22, dua.a(3), dun.a(2), due.a(), pe.a, dtv.a());
      pe.a($$0, S, $$23, dun.a(32), due.a(), pe.a, dtv.a());
      pe.a($$0, T, $$24, dug.a(-0.8, 15, 4), dun.a(32), due.a(), pe.a, dtv.a());
      pe.a($$0, V, $$26, dug.a(-0.8, 5, 10), due.a(), pe.a, dtv.a());
      pe.a($$0, U, $$25, due.a(), pe.a, dtv.a());
      duk $$51 = duq.a(0);
      pe.a($$0, W, $$27, pe.a(0, 0.05F, 1), due.a(), $$51, pe.d, dtw.a(dlu.a(csr.x.n(), gw.b)), dtv.a());
      pe.a($$0, X, $$28, dua.a(16), due.a(), $$51, pe.d, dtv.a());
      pe.a($$0, Y, $$29, dun.a(7), due.a(), pe.a, dua.a(bfr.a(bge.a(-1, 3), 0, 3)), dtv.a());
      pe.a($$0, Z, $$29, dun.a(7), due.a(), pe.a, dua.a(bfr.a(bge.a(-3, 1), 0, 1)), dtv.a());
      pe.a($$0, aa, $$30, a(pe.a(6, 0.1F, 1)));
      pe.a($$0, ab, $$31, a(dun.a(100)));
      pe.a($$0, ac, $$36, a(pe.a(10, 0.1F, 1), csr.C));
      pe.a($$0, ad, $$32, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, ae, $$33, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, af, $$34, a(pe.a(5, 0.1F, 1), csr.x));
      pe.a($$0, ag, $$35, a(pe.a(0, 0.1F, 1), csr.y));
      pe.a($$0, ah, $$37, pe.a(2, 0.1F, 1), due.a(), duq.a(2), pe.d, dtv.a(), dtw.a(dlu.a(csr.x.n(), gw.b)));
      pe.a($$0, ai, $$38, a(pe.a(2, 0.1F, 1)));
      pe.a($$0, aj, $$38, a(pe.a(1, 0.1F, 1)));
      pe.a($$0, ak, $$39, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, al, $$40, a(pe.a(10, 0.1F, 1), csr.z));
      pe.a($$0, am, $$41, a(pe.a(3, 0.1F, 1)));
      pe.a($$0, an, $$41, a(pe.a(0, 0.1F, 1)));
      pe.a($$0, ao, $$42, a(pe.a(0, 0.1F, 1)));
      pe.a($$0, ap, $$43, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, aq, $$44, a(pe.a(2, 0.1F, 1)));
      pe.a($$0, ar, $$45, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, as, $$46, a(pe.a(10, 0.1F, 1)));
      pe.a($$0, at, $$47, a(pe.a(50, 0.1F, 1)));
      pe.a($$0, au, $$48, a(pe.a(30, 0.1F, 1)));
      pe.a($$0, av, $$49, due.a(), pe.a, dtv.a());
      pe.a($$0, aw, $$50, dua.a(25), due.a(), duq.a(5), pe.d, dtv.a(), dtw.a(dlu.a(csr.E.n(), gw.b)));
   }
}
