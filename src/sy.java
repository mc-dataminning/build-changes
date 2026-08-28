import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sy {
   public static final ala<ehj> a = sw.a("bamboo_light");
   public static final ala<ehj> b = sw.a("bamboo");
   public static final ala<ehj> c = sw.a("vines");
   public static final ala<ehj> d = sw.a("patch_sunflower");
   public static final ala<ehj> e = sw.a("patch_pumpkin");
   public static final ala<ehj> f = sw.a("patch_grass_plain");
   public static final ala<ehj> g = sw.a("patch_grass_forest");
   public static final ala<ehj> h = sw.a("patch_grass_badlands");
   public static final ala<ehj> i = sw.a("patch_grass_savanna");
   public static final ala<ehj> j = sw.a("patch_grass_normal");
   public static final ala<ehj> k = sw.a("patch_grass_taiga_2");
   public static final ala<ehj> l = sw.a("patch_grass_taiga");
   public static final ala<ehj> m = sw.a("patch_grass_jungle");
   public static final ala<ehj> n = sw.a("grass_bonemeal");
   public static final ala<ehj> o = sw.a("patch_dead_bush_2");
   public static final ala<ehj> p = sw.a("patch_dead_bush");
   public static final ala<ehj> q = sw.a("patch_dead_bush_badlands");
   public static final ala<ehj> r = sw.a("patch_melon");
   public static final ala<ehj> s = sw.a("patch_melon_sparse");
   public static final ala<ehj> t = sw.a("patch_berry_common");
   public static final ala<ehj> u = sw.a("patch_berry_rare");
   public static final ala<ehj> v = sw.a("patch_waterlily");
   public static final ala<ehj> w = sw.a("patch_tall_grass_2");
   public static final ala<ehj> x = sw.a("patch_tall_grass");
   public static final ala<ehj> y = sw.a("patch_large_fern");
   public static final ala<ehj> z = sw.a("patch_cactus_desert");
   public static final ala<ehj> A = sw.a("patch_cactus_decorated");
   public static final ala<ehj> B = sw.a("patch_sugar_cane_swamp");
   public static final ala<ehj> C = sw.a("patch_sugar_cane_desert");
   public static final ala<ehj> D = sw.a("patch_sugar_cane_badlands");
   public static final ala<ehj> E = sw.a("patch_sugar_cane");
   public static final ala<ehj> F = sw.a("brown_mushroom_nether");
   public static final ala<ehj> G = sw.a("red_mushroom_nether");
   public static final ala<ehj> H = sw.a("brown_mushroom_normal");
   public static final ala<ehj> I = sw.a("red_mushroom_normal");
   public static final ala<ehj> J = sw.a("brown_mushroom_taiga");
   public static final ala<ehj> K = sw.a("red_mushroom_taiga");
   public static final ala<ehj> L = sw.a("brown_mushroom_old_growth");
   public static final ala<ehj> M = sw.a("red_mushroom_old_growth");
   public static final ala<ehj> N = sw.a("brown_mushroom_swamp");
   public static final ala<ehj> O = sw.a("red_mushroom_swamp");
   public static final ala<ehj> P = sw.a("flower_warm");
   public static final ala<ehj> Q = sw.a("flower_default");
   public static final ala<ehj> R = sw.a("flower_flower_forest");
   public static final ala<ehj> S = sw.a("flower_swamp");
   public static final ala<ehj> T = sw.a("flower_plains");
   public static final ala<ehj> U = sw.a("flower_meadow");
   public static final ala<ehj> V = sw.a("flower_cherry");
   public static final ala<ehj> W = sw.a("trees_plains");
   public static final ala<ehj> X = sw.a("dark_forest_vegetation");
   public static final ala<ehj> Y = sw.a("flower_forest_flowers");
   public static final ala<ehj> Z = sw.a("forest_flowers");
   public static final ala<ehj> aa = sw.a("trees_flower_forest");
   public static final ala<ehj> ab = sw.a("trees_meadow");
   public static final ala<ehj> ac = sw.a("trees_cherry");
   public static final ala<ehj> ad = sw.a("trees_taiga");
   public static final ala<ehj> ae = sw.a("trees_grove");
   public static final ala<ehj> af = sw.a("trees_badlands");
   public static final ala<ehj> ag = sw.a("trees_snowy");
   public static final ala<ehj> ah = sw.a("trees_swamp");
   public static final ala<ehj> ai = sw.a("trees_windswept_savanna");
   public static final ala<ehj> aj = sw.a("trees_savanna");
   public static final ala<ehj> ak = sw.a("birch_tall");
   public static final ala<ehj> al = sw.a("trees_birch");
   public static final ala<ehj> am = sw.a("trees_windswept_forest");
   public static final ala<ehj> an = sw.a("trees_windswept_hills");
   public static final ala<ehj> ao = sw.a("trees_water");
   public static final ala<ehj> ap = sw.a("trees_birch_and_oak");
   public static final ala<ehj> aq = sw.a("trees_sparse_jungle");
   public static final ala<ehj> ar = sw.a("trees_old_growth_spruce_taiga");
   public static final ala<ehj> as = sw.a("trees_old_growth_pine_taiga");
   public static final ala<ehj> at = sw.a("trees_jungle");
   public static final ala<ehj> au = sw.a("bamboo_vegetation");
   public static final ala<ehj> av = sw.a("mushroom_island_vegetation");
   public static final ala<ehj> aw = sw.a("trees_mangrove");
   private static final ehm ax = ehs.a(0);

   public static List<ehm> a(int $$0) {
      return List.of(ehc.a($$0), ehg.a(), sw.c, egx.a());
   }

   private static List<ehm> a(int $$0, @Nullable ehm $$1) {
      Builder<ehm> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ehp.a($$0));
      }

      $$2.add(ehg.a());
      $$2.add(sw.a);
      $$2.add(egx.a());
      return $$2.build();
   }

   private static Builder<ehm> b(ehm $$0) {
      return ImmutableList.builder().add($$0).add(ehg.a()).add(ax).add(sw.d).add(egx.a());
   }

   public static List<ehm> a(ehm $$0) {
      return b($$0).build();
   }

   public static List<ehm> a(ehm $$0, deu $$1) {
      return b($$0).add(egy.a(dyw.a($$1.n(), iz.c))).build();
   }

   public static void a(rc<ehj> $$0) {
      jj<eag<?, ?>> $$1 = $$0.a(lq.aC);
      ji<eag<?, ?>> $$2 = $$1.b(sn.a);
      ji<eag<?, ?>> $$3 = $$1.b(sn.b);
      ji<eag<?, ?>> $$4 = $$1.b(sn.c);
      ji<eag<?, ?>> $$5 = $$1.b(sn.f);
      ji<eag<?, ?>> $$6 = $$1.b(sn.g);
      ji<eag<?, ?>> $$7 = $$1.b(sn.j);
      ji<eag<?, ?>> $$8 = $$1.b(sn.i);
      ji<eag<?, ?>> $$9 = $$1.b(sn.k);
      ji<eag<?, ?>> $$10 = $$1.b(sn.l);
      ji<eag<?, ?>> $$11 = $$1.b(sn.m);
      ji<eag<?, ?>> $$12 = $$1.b(sn.n);
      ji<eag<?, ?>> $$13 = $$1.b(sn.h);
      ji<eag<?, ?>> $$14 = $$1.b(sn.o);
      ji<eag<?, ?>> $$15 = $$1.b(sn.p);
      ji<eag<?, ?>> $$16 = $$1.b(sn.q);
      ji<eag<?, ?>> $$17 = $$1.b(sn.r);
      ji<eag<?, ?>> $$18 = $$1.b(sn.s);
      ji<eag<?, ?>> $$19 = $$1.b(sn.d);
      ji<eag<?, ?>> $$20 = $$1.b(sn.e);
      ji<eag<?, ?>> $$21 = $$1.b(sn.t);
      ji<eag<?, ?>> $$22 = $$1.b(sn.u);
      ji<eag<?, ?>> $$23 = $$1.b(sn.v);
      ji<eag<?, ?>> $$24 = $$1.b(sn.w);
      ji<eag<?, ?>> $$25 = $$1.b(sn.x);
      ji<eag<?, ?>> $$26 = $$1.b(sn.y);
      ji<eag<?, ?>> $$27 = $$1.b(sn.K);
      ji<eag<?, ?>> $$28 = $$1.b(sn.A);
      ji<eag<?, ?>> $$29 = $$1.b(sn.z);
      ji<eag<?, ?>> $$30 = $$1.b(sn.B);
      ji<eag<?, ?>> $$31 = $$1.b(sn.C);
      ji<eag<?, ?>> $$32 = $$1.b(sn.D);
      ji<eag<?, ?>> $$33 = $$1.b(sn.E);
      ji<eag<?, ?>> $$34 = $$1.b(sm.g);
      ji<eag<?, ?>> $$35 = $$1.b(sm.k);
      ji<eag<?, ?>> $$36 = $$1.b(sm.K);
      ji<eag<?, ?>> $$37 = $$1.b(sm.u);
      ji<eag<?, ?>> $$38 = $$1.b(sn.F);
      ji<eag<?, ?>> $$39 = $$1.b(sn.G);
      ji<eag<?, ?>> $$40 = $$1.b(sm.D);
      ji<eag<?, ?>> $$41 = $$1.b(sn.H);
      ji<eag<?, ?>> $$42 = $$1.b(sn.I);
      ji<eag<?, ?>> $$43 = $$1.b(sn.J);
      ji<eag<?, ?>> $$44 = $$1.b(sn.L);
      ji<eag<?, ?>> $$45 = $$1.b(sn.M);
      ji<eag<?, ?>> $$46 = $$1.b(sn.N);
      ji<eag<?, ?>> $$47 = $$1.b(sn.O);
      ji<eag<?, ?>> $$48 = $$1.b(sn.P);
      ji<eag<?, ?>> $$49 = $$1.b(sn.Q);
      ji<eag<?, ?>> $$50 = $$1.b(sn.R);
      sw.a($$0, a, $$2, ehp.a(4), ehg.a(), sw.a, egx.a());
      sw.a($$0, b, $$3, ehh.a(160, 80.0, 0.3), ehg.a(), sw.c, egx.a());
      sw.a($$0, c, $$4, ehc.a(127), ehg.a(), ehe.a(dyj.a(64), dyj.a(100)), egx.a());
      sw.a($$0, d, $$5, ehp.a(3), ehg.a(), sw.a, egx.a());
      sw.a($$0, e, $$6, ehp.a(300), ehg.a(), sw.a, egx.a());
      sw.a($$0, f, $$7, ehi.a(-0.8, 5, 10), ehg.a(), sw.c, egx.a());
      sw.a($$0, g, $$7, a(2));
      sw.a($$0, h, $$7, ehg.a(), sw.c, egx.a());
      sw.a($$0, i, $$7, a(20));
      sw.a($$0, j, $$7, a(5));
      sw.a($$0, k, $$8, ehg.a(), sw.c, egx.a());
      sw.a($$0, l, $$8, a(7));
      sw.a($$0, m, $$9, a(25));
      sw.a($$0, n, $$10, sw.a());
      sw.a($$0, o, $$11, a(2));
      sw.a($$0, p, $$11, ehg.a(), sw.c, egx.a());
      sw.a($$0, q, $$11, a(20));
      sw.a($$0, r, $$12, ehp.a(6), ehg.a(), sw.a, egx.a());
      sw.a($$0, s, $$12, ehp.a(64), ehg.a(), sw.a, egx.a());
      sw.a($$0, t, $$13, ehp.a(32), ehg.a(), sw.c, egx.a());
      sw.a($$0, u, $$13, ehp.a(384), ehg.a(), sw.c, egx.a());
      sw.a($$0, v, $$14, a(4));
      sw.a($$0, w, $$15, ehi.a(-0.8, 0, 7), ehp.a(32), ehg.a(), sw.a, egx.a());
      sw.a($$0, x, $$15, ehp.a(5), ehg.a(), sw.a, egx.a());
      sw.a($$0, y, $$16, ehp.a(5), ehg.a(), sw.a, egx.a());
      sw.a($$0, z, $$17, ehp.a(6), ehg.a(), sw.a, egx.a());
      sw.a($$0, A, $$17, ehp.a(13), ehg.a(), sw.a, egx.a());
      sw.a($$0, B, $$18, ehp.a(3), ehg.a(), sw.a, egx.a());
      sw.a($$0, C, $$18, ehg.a(), sw.a, egx.a());
      sw.a($$0, D, $$18, ehp.a(5), ehg.a(), sw.a, egx.a());
      sw.a($$0, E, $$18, ehp.a(6), ehg.a(), sw.a, egx.a());
      sw.a($$0, F, $$19, ehp.a(2), ehg.a(), sw.e, egx.a());
      sw.a($$0, G, $$20, ehp.a(2), ehg.a(), sw.e, egx.a());
      sw.a($$0, H, $$19, a(256, null));
      sw.a($$0, I, $$20, a(512, null));
      sw.a($$0, J, $$19, a(4, null));
      sw.a($$0, K, $$20, a(256, null));
      sw.a($$0, L, $$19, a(4, ehc.a(3)));
      sw.a($$0, M, $$20, a(171, null));
      sw.a($$0, N, $$19, a(0, ehc.a(2)));
      sw.a($$0, O, $$20, a(64, null));
      sw.a($$0, P, $$21, ehp.a(16), ehg.a(), sw.a, egx.a());
      sw.a($$0, Q, $$21, ehp.a(32), ehg.a(), sw.a, egx.a());
      sw.a($$0, R, $$22, ehc.a(3), ehp.a(2), ehg.a(), sw.a, egx.a());
      sw.a($$0, S, $$23, ehp.a(32), ehg.a(), sw.a, egx.a());
      sw.a($$0, T, $$24, ehi.a(-0.8, 15, 4), ehp.a(32), ehg.a(), sw.a, egx.a());
      sw.a($$0, V, $$26, ehi.a(-0.8, 5, 10), ehg.a(), sw.a, egx.a());
      sw.a($$0, U, $$25, ehg.a(), sw.a, egx.a());
      ehm $$51 = ehs.a(0);
      sw.a($$0, W, $$27, sw.a(0, 0.05F, 1), ehg.a(), $$51, sw.d, egy.a(dyw.a(dew.x.n(), iz.c)), egx.a());
      sw.a($$0, X, $$28, ehc.a(16), ehg.a(), $$51, sw.d, egx.a());
      sw.a($$0, Y, $$29, ehp.a(7), ehg.a(), sw.a, ehc.a(bpn.a(bqa.a(-1, 3), 0, 3)), egx.a());
      sw.a($$0, Z, $$29, ehp.a(7), ehg.a(), sw.a, ehc.a(bpn.a(bqa.a(-3, 1), 0, 1)), egx.a());
      sw.a($$0, aa, $$30, a(sw.a(6, 0.1F, 1)));
      sw.a($$0, ab, $$31, a(ehp.a(100)));
      sw.a($$0, ac, $$36, a(sw.a(10, 0.1F, 1), dew.C));
      sw.a($$0, ad, $$32, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, ae, $$33, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, af, $$34, a(sw.a(5, 0.1F, 1), dew.x));
      sw.a($$0, ag, $$35, a(sw.a(0, 0.1F, 1), dew.y));
      sw.a($$0, ah, $$37, sw.a(2, 0.1F, 1), ehg.a(), ehs.a(2), sw.d, egx.a(), egy.a(dyw.a(dew.x.n(), iz.c)));
      sw.a($$0, ai, $$38, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, aj, $$38, a(sw.a(1, 0.1F, 1)));
      sw.a($$0, ak, $$39, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, al, $$40, a(sw.a(10, 0.1F, 1), dew.z));
      sw.a($$0, am, $$41, a(sw.a(3, 0.1F, 1)));
      sw.a($$0, an, $$41, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ao, $$42, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ap, $$43, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, aq, $$44, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, ar, $$45, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, as, $$46, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, at, $$47, a(sw.a(50, 0.1F, 1)));
      sw.a($$0, au, $$48, a(sw.a(30, 0.1F, 1)));
      sw.a($$0, av, $$49, ehg.a(), sw.a, egx.a());
      sw.a($$0, aw, $$50, ehc.a(25), ehg.a(), ehs.a(5), sw.d, egx.a(), egy.a(dyw.a(dew.E.n(), iz.c)));
   }
}
