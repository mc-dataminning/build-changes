import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class td {
   public static final aly<eno> a = tb.a("bamboo_light");
   public static final aly<eno> b = tb.a("bamboo");
   public static final aly<eno> c = tb.a("vines");
   public static final aly<eno> d = tb.a("patch_sunflower");
   public static final aly<eno> e = tb.a("patch_pumpkin");
   public static final aly<eno> f = tb.a("patch_grass_plain");
   public static final aly<eno> g = tb.a("patch_grass_forest");
   public static final aly<eno> h = tb.a("patch_grass_badlands");
   public static final aly<eno> i = tb.a("patch_grass_savanna");
   public static final aly<eno> j = tb.a("patch_grass_normal");
   public static final aly<eno> k = tb.a("patch_grass_taiga_2");
   public static final aly<eno> l = tb.a("patch_grass_taiga");
   public static final aly<eno> m = tb.a("patch_grass_jungle");
   public static final aly<eno> n = tb.a("grass_bonemeal");
   public static final aly<eno> o = tb.a("patch_dead_bush_2");
   public static final aly<eno> p = tb.a("patch_dead_bush");
   public static final aly<eno> q = tb.a("patch_dead_bush_badlands");
   public static final aly<eno> r = tb.a("patch_melon");
   public static final aly<eno> s = tb.a("patch_melon_sparse");
   public static final aly<eno> t = tb.a("patch_berry_common");
   public static final aly<eno> u = tb.a("patch_berry_rare");
   public static final aly<eno> v = tb.a("patch_waterlily");
   public static final aly<eno> w = tb.a("patch_tall_grass_2");
   public static final aly<eno> x = tb.a("patch_tall_grass");
   public static final aly<eno> y = tb.a("patch_large_fern");
   public static final aly<eno> z = tb.a("patch_cactus_desert");
   public static final aly<eno> A = tb.a("patch_cactus_decorated");
   public static final aly<eno> B = tb.a("patch_sugar_cane_swamp");
   public static final aly<eno> C = tb.a("patch_sugar_cane_desert");
   public static final aly<eno> D = tb.a("patch_sugar_cane_badlands");
   public static final aly<eno> E = tb.a("patch_sugar_cane");
   public static final aly<eno> F = tb.a("brown_mushroom_nether");
   public static final aly<eno> G = tb.a("red_mushroom_nether");
   public static final aly<eno> H = tb.a("brown_mushroom_normal");
   public static final aly<eno> I = tb.a("red_mushroom_normal");
   public static final aly<eno> J = tb.a("brown_mushroom_taiga");
   public static final aly<eno> K = tb.a("red_mushroom_taiga");
   public static final aly<eno> L = tb.a("brown_mushroom_old_growth");
   public static final aly<eno> M = tb.a("red_mushroom_old_growth");
   public static final aly<eno> N = tb.a("brown_mushroom_swamp");
   public static final aly<eno> O = tb.a("red_mushroom_swamp");
   public static final aly<eno> P = tb.a("flower_warm");
   public static final aly<eno> Q = tb.a("flower_default");
   public static final aly<eno> R = tb.a("flower_flower_forest");
   public static final aly<eno> S = tb.a("flower_swamp");
   public static final aly<eno> T = tb.a("flower_plains");
   public static final aly<eno> U = tb.a("flower_meadow");
   public static final aly<eno> V = tb.a("flower_cherry");
   public static final aly<eno> W = tb.a("trees_plains");
   public static final aly<eno> X = tb.a("dark_forest_vegetation");
   public static final aly<eno> Y = tb.a("pale_garden_vegetation");
   public static final aly<eno> Z = tb.a("flower_forest_flowers");
   public static final aly<eno> aa = tb.a("forest_flowers");
   public static final aly<eno> ab = tb.a("trees_flower_forest");
   public static final aly<eno> ac = tb.a("trees_meadow");
   public static final aly<eno> ad = tb.a("trees_cherry");
   public static final aly<eno> ae = tb.a("trees_taiga");
   public static final aly<eno> af = tb.a("trees_grove");
   public static final aly<eno> ag = tb.a("trees_badlands");
   public static final aly<eno> ah = tb.a("trees_snowy");
   public static final aly<eno> ai = tb.a("trees_swamp");
   public static final aly<eno> aj = tb.a("trees_windswept_savanna");
   public static final aly<eno> ak = tb.a("trees_savanna");
   public static final aly<eno> al = tb.a("birch_tall");
   public static final aly<eno> am = tb.a("trees_birch");
   public static final aly<eno> an = tb.a("trees_windswept_forest");
   public static final aly<eno> ao = tb.a("trees_windswept_hills");
   public static final aly<eno> ap = tb.a("trees_water");
   public static final aly<eno> aq = tb.a("trees_birch_and_oak");
   public static final aly<eno> ar = tb.a("trees_sparse_jungle");
   public static final aly<eno> as = tb.a("trees_old_growth_spruce_taiga");
   public static final aly<eno> at = tb.a("trees_old_growth_pine_taiga");
   public static final aly<eno> au = tb.a("trees_jungle");
   public static final aly<eno> av = tb.a("bamboo_vegetation");
   public static final aly<eno> aw = tb.a("mushroom_island_vegetation");
   public static final aly<eno> ax = tb.a("trees_mangrove");
   private static final enr ay = enx.a(0);

   public static List<enr> a(int $$0) {
      return List.of(eng.a($$0), enl.a(), tb.c, enc.a());
   }

   private static List<enr> a(int $$0, @Nullable enr $$1) {
      Builder<enr> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(enu.a($$0));
      }

      $$2.add(enl.a());
      $$2.add(tb.a);
      $$2.add(enc.a());
      return $$2.build();
   }

   private static Builder<enr> b(enr $$0) {
      return ImmutableList.builder().add($$0).add(enl.a()).add(ay).add(tb.d).add(enc.a());
   }

   public static List<enr> a(enr $$0) {
      return b($$0).build();
   }

   public static List<enr> a(enr $$0, dkm $$1) {
      return b($$0).add(end.a(eex.a($$1.m(), jh.c))).build();
   }

   public static void a(rk<eno> $$0) {
      jr<egi<?, ?>> $$1 = $$0.a(mb.aL);
      jq<egi<?, ?>> $$2 = $$1.b(ss.a);
      jq<egi<?, ?>> $$3 = $$1.b(ss.b);
      jq<egi<?, ?>> $$4 = $$1.b(ss.c);
      jq<egi<?, ?>> $$5 = $$1.b(ss.f);
      jq<egi<?, ?>> $$6 = $$1.b(ss.g);
      jq<egi<?, ?>> $$7 = $$1.b(ss.j);
      jq<egi<?, ?>> $$8 = $$1.b(ss.i);
      jq<egi<?, ?>> $$9 = $$1.b(ss.k);
      jq<egi<?, ?>> $$10 = $$1.b(ss.l);
      jq<egi<?, ?>> $$11 = $$1.b(ss.m);
      jq<egi<?, ?>> $$12 = $$1.b(ss.n);
      jq<egi<?, ?>> $$13 = $$1.b(ss.h);
      jq<egi<?, ?>> $$14 = $$1.b(ss.o);
      jq<egi<?, ?>> $$15 = $$1.b(ss.p);
      jq<egi<?, ?>> $$16 = $$1.b(ss.q);
      jq<egi<?, ?>> $$17 = $$1.b(ss.r);
      jq<egi<?, ?>> $$18 = $$1.b(ss.s);
      jq<egi<?, ?>> $$19 = $$1.b(ss.d);
      jq<egi<?, ?>> $$20 = $$1.b(ss.e);
      jq<egi<?, ?>> $$21 = $$1.b(ss.t);
      jq<egi<?, ?>> $$22 = $$1.b(ss.u);
      jq<egi<?, ?>> $$23 = $$1.b(ss.v);
      jq<egi<?, ?>> $$24 = $$1.b(ss.w);
      jq<egi<?, ?>> $$25 = $$1.b(ss.x);
      jq<egi<?, ?>> $$26 = $$1.b(ss.y);
      jq<egi<?, ?>> $$27 = $$1.b(ss.N);
      jq<egi<?, ?>> $$28 = $$1.b(ss.A);
      jq<egi<?, ?>> $$29 = $$1.b(ss.B);
      jq<egi<?, ?>> $$30 = $$1.b(ss.z);
      jq<egi<?, ?>> $$31 = $$1.b(ss.E);
      jq<egi<?, ?>> $$32 = $$1.b(ss.F);
      jq<egi<?, ?>> $$33 = $$1.b(ss.G);
      jq<egi<?, ?>> $$34 = $$1.b(ss.H);
      jq<egi<?, ?>> $$35 = $$1.b(sr.g);
      jq<egi<?, ?>> $$36 = $$1.b(sr.m);
      jq<egi<?, ?>> $$37 = $$1.b(sr.M);
      jq<egi<?, ?>> $$38 = $$1.b(sr.w);
      jq<egi<?, ?>> $$39 = $$1.b(ss.I);
      jq<egi<?, ?>> $$40 = $$1.b(ss.J);
      jq<egi<?, ?>> $$41 = $$1.b(sr.F);
      jq<egi<?, ?>> $$42 = $$1.b(ss.K);
      jq<egi<?, ?>> $$43 = $$1.b(ss.L);
      jq<egi<?, ?>> $$44 = $$1.b(ss.M);
      jq<egi<?, ?>> $$45 = $$1.b(ss.O);
      jq<egi<?, ?>> $$46 = $$1.b(ss.P);
      jq<egi<?, ?>> $$47 = $$1.b(ss.Q);
      jq<egi<?, ?>> $$48 = $$1.b(ss.R);
      jq<egi<?, ?>> $$49 = $$1.b(ss.S);
      jq<egi<?, ?>> $$50 = $$1.b(ss.T);
      jq<egi<?, ?>> $$51 = $$1.b(ss.U);
      tb.a($$0, a, $$2, enu.a(4), enl.a(), tb.a, enc.a());
      tb.a($$0, b, $$3, enm.a(160, 80.0, 0.3), enl.a(), tb.c, enc.a());
      tb.a($$0, c, $$4, eng.a(127), enl.a(), enj.a(eek.a(64), eek.a(100)), enc.a());
      tb.a($$0, d, $$5, enu.a(3), enl.a(), tb.a, enc.a());
      tb.a($$0, e, $$6, enu.a(300), enl.a(), tb.a, enc.a());
      tb.a($$0, f, $$7, enn.a(-0.8, 5, 10), enl.a(), tb.c, enc.a());
      tb.a($$0, g, $$7, a(2));
      tb.a($$0, h, $$7, enl.a(), tb.c, enc.a());
      tb.a($$0, i, $$7, a(20));
      tb.a($$0, j, $$7, a(5));
      tb.a($$0, k, $$8, enl.a(), tb.c, enc.a());
      tb.a($$0, l, $$8, a(7));
      tb.a($$0, m, $$9, a(25));
      tb.a($$0, n, $$10, tb.a());
      tb.a($$0, o, $$11, a(2));
      tb.a($$0, p, $$11, enl.a(), tb.c, enc.a());
      tb.a($$0, q, $$11, a(20));
      tb.a($$0, r, $$12, enu.a(6), enl.a(), tb.a, enc.a());
      tb.a($$0, s, $$12, enu.a(64), enl.a(), tb.a, enc.a());
      tb.a($$0, t, $$13, enu.a(32), enl.a(), tb.c, enc.a());
      tb.a($$0, u, $$13, enu.a(384), enl.a(), tb.c, enc.a());
      tb.a($$0, v, $$14, a(4));
      tb.a($$0, w, $$15, enn.a(-0.8, 0, 7), enu.a(32), enl.a(), tb.a, enc.a());
      tb.a($$0, x, $$15, enu.a(5), enl.a(), tb.a, enc.a());
      tb.a($$0, y, $$16, enu.a(5), enl.a(), tb.a, enc.a());
      tb.a($$0, z, $$17, enu.a(6), enl.a(), tb.a, enc.a());
      tb.a($$0, A, $$17, enu.a(13), enl.a(), tb.a, enc.a());
      tb.a($$0, B, $$18, enu.a(3), enl.a(), tb.a, enc.a());
      tb.a($$0, C, $$18, enl.a(), tb.a, enc.a());
      tb.a($$0, D, $$18, enu.a(5), enl.a(), tb.a, enc.a());
      tb.a($$0, E, $$18, enu.a(6), enl.a(), tb.a, enc.a());
      tb.a($$0, F, $$19, enu.a(2), enl.a(), tb.e, enc.a());
      tb.a($$0, G, $$20, enu.a(2), enl.a(), tb.e, enc.a());
      tb.a($$0, H, $$19, a(256, null));
      tb.a($$0, I, $$20, a(512, null));
      tb.a($$0, J, $$19, a(4, null));
      tb.a($$0, K, $$20, a(256, null));
      tb.a($$0, L, $$19, a(4, eng.a(3)));
      tb.a($$0, M, $$20, a(171, null));
      tb.a($$0, N, $$19, a(0, eng.a(2)));
      tb.a($$0, O, $$20, a(64, null));
      tb.a($$0, P, $$21, enu.a(16), enl.a(), tb.a, enc.a());
      tb.a($$0, Q, $$21, enu.a(32), enl.a(), tb.a, enc.a());
      tb.a($$0, R, $$22, eng.a(3), enu.a(2), enl.a(), tb.a, enc.a());
      tb.a($$0, S, $$23, enu.a(32), enl.a(), tb.a, enc.a());
      tb.a($$0, T, $$24, enn.a(-0.8, 15, 4), enu.a(32), enl.a(), tb.a, enc.a());
      tb.a($$0, V, $$26, enn.a(-0.8, 5, 10), enl.a(), tb.a, enc.a());
      tb.a($$0, U, $$25, enl.a(), tb.a, enc.a());
      enr $$52 = enx.a(0);
      tb.a($$0, W, $$27, tb.a(0, 0.05F, 1), enl.a(), $$52, tb.d, end.a(eex.a(dko.z.m(), jh.c)), enc.a());
      tb.a($$0, X, $$28, eng.a(16), enl.a(), $$52, tb.d, enc.a());
      tb.a($$0, Y, $$29, eng.a(16), enl.a(), $$52, tb.d, enc.a());
      tb.a($$0, Z, $$30, enu.a(7), enl.a(), tb.a, eng.a(bsh.a(bsu.a(-1, 3), 0, 3)), enc.a());
      tb.a($$0, aa, $$30, enu.a(7), enl.a(), tb.a, eng.a(bsh.a(bsu.a(-3, 1), 0, 1)), enc.a());
      tb.a($$0, ab, $$31, a(tb.a(6, 0.1F, 1)));
      tb.a($$0, ac, $$32, a(enu.a(100)));
      tb.a($$0, ad, $$37, a(tb.a(10, 0.1F, 1), dko.E));
      tb.a($$0, ae, $$33, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, af, $$34, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, ag, $$35, a(tb.a(5, 0.1F, 1), dko.z));
      tb.a($$0, ah, $$36, a(tb.a(0, 0.1F, 1), dko.A));
      tb.a($$0, ai, $$38, tb.a(2, 0.1F, 1), enl.a(), enx.a(2), tb.d, enc.a(), end.a(eex.a(dko.z.m(), jh.c)));
      tb.a($$0, aj, $$39, a(tb.a(2, 0.1F, 1)));
      tb.a($$0, ak, $$39, a(tb.a(1, 0.1F, 1)));
      tb.a($$0, al, $$40, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, am, $$41, a(tb.a(10, 0.1F, 1), dko.B));
      tb.a($$0, an, $$42, a(tb.a(3, 0.1F, 1)));
      tb.a($$0, ao, $$42, a(tb.a(0, 0.1F, 1)));
      tb.a($$0, ap, $$43, a(tb.a(0, 0.1F, 1)));
      tb.a($$0, aq, $$44, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, ar, $$45, a(tb.a(2, 0.1F, 1)));
      tb.a($$0, as, $$46, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, at, $$47, a(tb.a(10, 0.1F, 1)));
      tb.a($$0, au, $$48, a(tb.a(50, 0.1F, 1)));
      tb.a($$0, av, $$49, a(tb.a(30, 0.1F, 1)));
      tb.a($$0, aw, $$50, enl.a(), tb.a, enc.a());
      tb.a($$0, ax, $$51, eng.a(25), enl.a(), enx.a(5), tb.d, enc.a(), end.a(eex.a(dko.H.m(), jh.c)));
   }
}
