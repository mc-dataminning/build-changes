import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sy {
   public static final ald<ehm> a = sw.a("bamboo_light");
   public static final ald<ehm> b = sw.a("bamboo");
   public static final ald<ehm> c = sw.a("vines");
   public static final ald<ehm> d = sw.a("patch_sunflower");
   public static final ald<ehm> e = sw.a("patch_pumpkin");
   public static final ald<ehm> f = sw.a("patch_grass_plain");
   public static final ald<ehm> g = sw.a("patch_grass_forest");
   public static final ald<ehm> h = sw.a("patch_grass_badlands");
   public static final ald<ehm> i = sw.a("patch_grass_savanna");
   public static final ald<ehm> j = sw.a("patch_grass_normal");
   public static final ald<ehm> k = sw.a("patch_grass_taiga_2");
   public static final ald<ehm> l = sw.a("patch_grass_taiga");
   public static final ald<ehm> m = sw.a("patch_grass_jungle");
   public static final ald<ehm> n = sw.a("grass_bonemeal");
   public static final ald<ehm> o = sw.a("patch_dead_bush_2");
   public static final ald<ehm> p = sw.a("patch_dead_bush");
   public static final ald<ehm> q = sw.a("patch_dead_bush_badlands");
   public static final ald<ehm> r = sw.a("patch_melon");
   public static final ald<ehm> s = sw.a("patch_melon_sparse");
   public static final ald<ehm> t = sw.a("patch_berry_common");
   public static final ald<ehm> u = sw.a("patch_berry_rare");
   public static final ald<ehm> v = sw.a("patch_waterlily");
   public static final ald<ehm> w = sw.a("patch_tall_grass_2");
   public static final ald<ehm> x = sw.a("patch_tall_grass");
   public static final ald<ehm> y = sw.a("patch_large_fern");
   public static final ald<ehm> z = sw.a("patch_cactus_desert");
   public static final ald<ehm> A = sw.a("patch_cactus_decorated");
   public static final ald<ehm> B = sw.a("patch_sugar_cane_swamp");
   public static final ald<ehm> C = sw.a("patch_sugar_cane_desert");
   public static final ald<ehm> D = sw.a("patch_sugar_cane_badlands");
   public static final ald<ehm> E = sw.a("patch_sugar_cane");
   public static final ald<ehm> F = sw.a("brown_mushroom_nether");
   public static final ald<ehm> G = sw.a("red_mushroom_nether");
   public static final ald<ehm> H = sw.a("brown_mushroom_normal");
   public static final ald<ehm> I = sw.a("red_mushroom_normal");
   public static final ald<ehm> J = sw.a("brown_mushroom_taiga");
   public static final ald<ehm> K = sw.a("red_mushroom_taiga");
   public static final ald<ehm> L = sw.a("brown_mushroom_old_growth");
   public static final ald<ehm> M = sw.a("red_mushroom_old_growth");
   public static final ald<ehm> N = sw.a("brown_mushroom_swamp");
   public static final ald<ehm> O = sw.a("red_mushroom_swamp");
   public static final ald<ehm> P = sw.a("flower_warm");
   public static final ald<ehm> Q = sw.a("flower_default");
   public static final ald<ehm> R = sw.a("flower_flower_forest");
   public static final ald<ehm> S = sw.a("flower_swamp");
   public static final ald<ehm> T = sw.a("flower_plains");
   public static final ald<ehm> U = sw.a("flower_meadow");
   public static final ald<ehm> V = sw.a("flower_cherry");
   public static final ald<ehm> W = sw.a("trees_plains");
   public static final ald<ehm> X = sw.a("dark_forest_vegetation");
   public static final ald<ehm> Y = sw.a("flower_forest_flowers");
   public static final ald<ehm> Z = sw.a("forest_flowers");
   public static final ald<ehm> aa = sw.a("trees_flower_forest");
   public static final ald<ehm> ab = sw.a("trees_meadow");
   public static final ald<ehm> ac = sw.a("trees_cherry");
   public static final ald<ehm> ad = sw.a("trees_taiga");
   public static final ald<ehm> ae = sw.a("trees_grove");
   public static final ald<ehm> af = sw.a("trees_badlands");
   public static final ald<ehm> ag = sw.a("trees_snowy");
   public static final ald<ehm> ah = sw.a("trees_swamp");
   public static final ald<ehm> ai = sw.a("trees_windswept_savanna");
   public static final ald<ehm> aj = sw.a("trees_savanna");
   public static final ald<ehm> ak = sw.a("birch_tall");
   public static final ald<ehm> al = sw.a("trees_birch");
   public static final ald<ehm> am = sw.a("trees_windswept_forest");
   public static final ald<ehm> an = sw.a("trees_windswept_hills");
   public static final ald<ehm> ao = sw.a("trees_water");
   public static final ald<ehm> ap = sw.a("trees_birch_and_oak");
   public static final ald<ehm> aq = sw.a("trees_sparse_jungle");
   public static final ald<ehm> ar = sw.a("trees_old_growth_spruce_taiga");
   public static final ald<ehm> as = sw.a("trees_old_growth_pine_taiga");
   public static final ald<ehm> at = sw.a("trees_jungle");
   public static final ald<ehm> au = sw.a("bamboo_vegetation");
   public static final ald<ehm> av = sw.a("mushroom_island_vegetation");
   public static final ald<ehm> aw = sw.a("trees_mangrove");
   private static final ehp ax = ehv.a(0);

   public static List<ehp> a(int $$0) {
      return List.of(ehf.a($$0), ehj.a(), sw.c, eha.a());
   }

   private static List<ehp> a(int $$0, @Nullable ehp $$1) {
      Builder<ehp> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ehs.a($$0));
      }

      $$2.add(ehj.a());
      $$2.add(sw.a);
      $$2.add(eha.a());
      return $$2.build();
   }

   private static Builder<ehp> b(ehp $$0) {
      return ImmutableList.builder().add($$0).add(ehj.a()).add(ax).add(sw.d).add(eha.a());
   }

   public static List<ehp> a(ehp $$0) {
      return b($$0).build();
   }

   public static List<ehp> a(ehp $$0, dex $$1) {
      return b($$0).add(ehb.a(dyz.a($$1.o(), iz.c))).build();
   }

   public static void a(rc<ehm> $$0) {
      jj<eaj<?, ?>> $$1 = $$0.a(lq.aC);
      ji<eaj<?, ?>> $$2 = $$1.b(sn.a);
      ji<eaj<?, ?>> $$3 = $$1.b(sn.b);
      ji<eaj<?, ?>> $$4 = $$1.b(sn.c);
      ji<eaj<?, ?>> $$5 = $$1.b(sn.f);
      ji<eaj<?, ?>> $$6 = $$1.b(sn.g);
      ji<eaj<?, ?>> $$7 = $$1.b(sn.j);
      ji<eaj<?, ?>> $$8 = $$1.b(sn.i);
      ji<eaj<?, ?>> $$9 = $$1.b(sn.k);
      ji<eaj<?, ?>> $$10 = $$1.b(sn.l);
      ji<eaj<?, ?>> $$11 = $$1.b(sn.m);
      ji<eaj<?, ?>> $$12 = $$1.b(sn.n);
      ji<eaj<?, ?>> $$13 = $$1.b(sn.h);
      ji<eaj<?, ?>> $$14 = $$1.b(sn.o);
      ji<eaj<?, ?>> $$15 = $$1.b(sn.p);
      ji<eaj<?, ?>> $$16 = $$1.b(sn.q);
      ji<eaj<?, ?>> $$17 = $$1.b(sn.r);
      ji<eaj<?, ?>> $$18 = $$1.b(sn.s);
      ji<eaj<?, ?>> $$19 = $$1.b(sn.d);
      ji<eaj<?, ?>> $$20 = $$1.b(sn.e);
      ji<eaj<?, ?>> $$21 = $$1.b(sn.t);
      ji<eaj<?, ?>> $$22 = $$1.b(sn.u);
      ji<eaj<?, ?>> $$23 = $$1.b(sn.v);
      ji<eaj<?, ?>> $$24 = $$1.b(sn.w);
      ji<eaj<?, ?>> $$25 = $$1.b(sn.x);
      ji<eaj<?, ?>> $$26 = $$1.b(sn.y);
      ji<eaj<?, ?>> $$27 = $$1.b(sn.K);
      ji<eaj<?, ?>> $$28 = $$1.b(sn.A);
      ji<eaj<?, ?>> $$29 = $$1.b(sn.z);
      ji<eaj<?, ?>> $$30 = $$1.b(sn.B);
      ji<eaj<?, ?>> $$31 = $$1.b(sn.C);
      ji<eaj<?, ?>> $$32 = $$1.b(sn.D);
      ji<eaj<?, ?>> $$33 = $$1.b(sn.E);
      ji<eaj<?, ?>> $$34 = $$1.b(sm.g);
      ji<eaj<?, ?>> $$35 = $$1.b(sm.k);
      ji<eaj<?, ?>> $$36 = $$1.b(sm.K);
      ji<eaj<?, ?>> $$37 = $$1.b(sm.u);
      ji<eaj<?, ?>> $$38 = $$1.b(sn.F);
      ji<eaj<?, ?>> $$39 = $$1.b(sn.G);
      ji<eaj<?, ?>> $$40 = $$1.b(sm.D);
      ji<eaj<?, ?>> $$41 = $$1.b(sn.H);
      ji<eaj<?, ?>> $$42 = $$1.b(sn.I);
      ji<eaj<?, ?>> $$43 = $$1.b(sn.J);
      ji<eaj<?, ?>> $$44 = $$1.b(sn.L);
      ji<eaj<?, ?>> $$45 = $$1.b(sn.M);
      ji<eaj<?, ?>> $$46 = $$1.b(sn.N);
      ji<eaj<?, ?>> $$47 = $$1.b(sn.O);
      ji<eaj<?, ?>> $$48 = $$1.b(sn.P);
      ji<eaj<?, ?>> $$49 = $$1.b(sn.Q);
      ji<eaj<?, ?>> $$50 = $$1.b(sn.R);
      sw.a($$0, a, $$2, ehs.a(4), ehj.a(), sw.a, eha.a());
      sw.a($$0, b, $$3, ehk.a(160, 80.0, 0.3), ehj.a(), sw.c, eha.a());
      sw.a($$0, c, $$4, ehf.a(127), ehj.a(), ehh.a(dym.a(64), dym.a(100)), eha.a());
      sw.a($$0, d, $$5, ehs.a(3), ehj.a(), sw.a, eha.a());
      sw.a($$0, e, $$6, ehs.a(300), ehj.a(), sw.a, eha.a());
      sw.a($$0, f, $$7, ehl.a(-0.8, 5, 10), ehj.a(), sw.c, eha.a());
      sw.a($$0, g, $$7, a(2));
      sw.a($$0, h, $$7, ehj.a(), sw.c, eha.a());
      sw.a($$0, i, $$7, a(20));
      sw.a($$0, j, $$7, a(5));
      sw.a($$0, k, $$8, ehj.a(), sw.c, eha.a());
      sw.a($$0, l, $$8, a(7));
      sw.a($$0, m, $$9, a(25));
      sw.a($$0, n, $$10, sw.a());
      sw.a($$0, o, $$11, a(2));
      sw.a($$0, p, $$11, ehj.a(), sw.c, eha.a());
      sw.a($$0, q, $$11, a(20));
      sw.a($$0, r, $$12, ehs.a(6), ehj.a(), sw.a, eha.a());
      sw.a($$0, s, $$12, ehs.a(64), ehj.a(), sw.a, eha.a());
      sw.a($$0, t, $$13, ehs.a(32), ehj.a(), sw.c, eha.a());
      sw.a($$0, u, $$13, ehs.a(384), ehj.a(), sw.c, eha.a());
      sw.a($$0, v, $$14, a(4));
      sw.a($$0, w, $$15, ehl.a(-0.8, 0, 7), ehs.a(32), ehj.a(), sw.a, eha.a());
      sw.a($$0, x, $$15, ehs.a(5), ehj.a(), sw.a, eha.a());
      sw.a($$0, y, $$16, ehs.a(5), ehj.a(), sw.a, eha.a());
      sw.a($$0, z, $$17, ehs.a(6), ehj.a(), sw.a, eha.a());
      sw.a($$0, A, $$17, ehs.a(13), ehj.a(), sw.a, eha.a());
      sw.a($$0, B, $$18, ehs.a(3), ehj.a(), sw.a, eha.a());
      sw.a($$0, C, $$18, ehj.a(), sw.a, eha.a());
      sw.a($$0, D, $$18, ehs.a(5), ehj.a(), sw.a, eha.a());
      sw.a($$0, E, $$18, ehs.a(6), ehj.a(), sw.a, eha.a());
      sw.a($$0, F, $$19, ehs.a(2), ehj.a(), sw.e, eha.a());
      sw.a($$0, G, $$20, ehs.a(2), ehj.a(), sw.e, eha.a());
      sw.a($$0, H, $$19, a(256, null));
      sw.a($$0, I, $$20, a(512, null));
      sw.a($$0, J, $$19, a(4, null));
      sw.a($$0, K, $$20, a(256, null));
      sw.a($$0, L, $$19, a(4, ehf.a(3)));
      sw.a($$0, M, $$20, a(171, null));
      sw.a($$0, N, $$19, a(0, ehf.a(2)));
      sw.a($$0, O, $$20, a(64, null));
      sw.a($$0, P, $$21, ehs.a(16), ehj.a(), sw.a, eha.a());
      sw.a($$0, Q, $$21, ehs.a(32), ehj.a(), sw.a, eha.a());
      sw.a($$0, R, $$22, ehf.a(3), ehs.a(2), ehj.a(), sw.a, eha.a());
      sw.a($$0, S, $$23, ehs.a(32), ehj.a(), sw.a, eha.a());
      sw.a($$0, T, $$24, ehl.a(-0.8, 15, 4), ehs.a(32), ehj.a(), sw.a, eha.a());
      sw.a($$0, V, $$26, ehl.a(-0.8, 5, 10), ehj.a(), sw.a, eha.a());
      sw.a($$0, U, $$25, ehj.a(), sw.a, eha.a());
      ehp $$51 = ehv.a(0);
      sw.a($$0, W, $$27, sw.a(0, 0.05F, 1), ehj.a(), $$51, sw.d, ehb.a(dyz.a(dez.x.o(), iz.c)), eha.a());
      sw.a($$0, X, $$28, ehf.a(16), ehj.a(), $$51, sw.d, eha.a());
      sw.a($$0, Y, $$29, ehs.a(7), ehj.a(), sw.a, ehf.a(bpq.a(bqd.a(-1, 3), 0, 3)), eha.a());
      sw.a($$0, Z, $$29, ehs.a(7), ehj.a(), sw.a, ehf.a(bpq.a(bqd.a(-3, 1), 0, 1)), eha.a());
      sw.a($$0, aa, $$30, a(sw.a(6, 0.1F, 1)));
      sw.a($$0, ab, $$31, a(ehs.a(100)));
      sw.a($$0, ac, $$36, a(sw.a(10, 0.1F, 1), dez.C));
      sw.a($$0, ad, $$32, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, ae, $$33, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, af, $$34, a(sw.a(5, 0.1F, 1), dez.x));
      sw.a($$0, ag, $$35, a(sw.a(0, 0.1F, 1), dez.y));
      sw.a($$0, ah, $$37, sw.a(2, 0.1F, 1), ehj.a(), ehv.a(2), sw.d, eha.a(), ehb.a(dyz.a(dez.x.o(), iz.c)));
      sw.a($$0, ai, $$38, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, aj, $$38, a(sw.a(1, 0.1F, 1)));
      sw.a($$0, ak, $$39, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, al, $$40, a(sw.a(10, 0.1F, 1), dez.z));
      sw.a($$0, am, $$41, a(sw.a(3, 0.1F, 1)));
      sw.a($$0, an, $$41, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ao, $$42, a(sw.a(0, 0.1F, 1)));
      sw.a($$0, ap, $$43, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, aq, $$44, a(sw.a(2, 0.1F, 1)));
      sw.a($$0, ar, $$45, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, as, $$46, a(sw.a(10, 0.1F, 1)));
      sw.a($$0, at, $$47, a(sw.a(50, 0.1F, 1)));
      sw.a($$0, au, $$48, a(sw.a(30, 0.1F, 1)));
      sw.a($$0, av, $$49, ehj.a(), sw.a, eha.a());
      sw.a($$0, aw, $$50, ehf.a(25), ehj.a(), ehv.a(5), sw.d, eha.a(), ehb.a(dyz.a(dez.E.o(), iz.c)));
   }
}
