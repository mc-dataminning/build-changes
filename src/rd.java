import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rd {
   public static final aix<eai> a = rb.a("bamboo_light");
   public static final aix<eai> b = rb.a("bamboo");
   public static final aix<eai> c = rb.a("vines");
   public static final aix<eai> d = rb.a("patch_sunflower");
   public static final aix<eai> e = rb.a("patch_pumpkin");
   public static final aix<eai> f = rb.a("patch_grass_plain");
   public static final aix<eai> g = rb.a("patch_grass_forest");
   public static final aix<eai> h = rb.a("patch_grass_badlands");
   public static final aix<eai> i = rb.a("patch_grass_savanna");
   public static final aix<eai> j = rb.a("patch_grass_normal");
   public static final aix<eai> k = rb.a("patch_grass_taiga_2");
   public static final aix<eai> l = rb.a("patch_grass_taiga");
   public static final aix<eai> m = rb.a("patch_grass_jungle");
   public static final aix<eai> n = rb.a("grass_bonemeal");
   public static final aix<eai> o = rb.a("patch_dead_bush_2");
   public static final aix<eai> p = rb.a("patch_dead_bush");
   public static final aix<eai> q = rb.a("patch_dead_bush_badlands");
   public static final aix<eai> r = rb.a("patch_melon");
   public static final aix<eai> s = rb.a("patch_melon_sparse");
   public static final aix<eai> t = rb.a("patch_berry_common");
   public static final aix<eai> u = rb.a("patch_berry_rare");
   public static final aix<eai> v = rb.a("patch_waterlily");
   public static final aix<eai> w = rb.a("patch_tall_grass_2");
   public static final aix<eai> x = rb.a("patch_tall_grass");
   public static final aix<eai> y = rb.a("patch_large_fern");
   public static final aix<eai> z = rb.a("patch_cactus_desert");
   public static final aix<eai> A = rb.a("patch_cactus_decorated");
   public static final aix<eai> B = rb.a("patch_sugar_cane_swamp");
   public static final aix<eai> C = rb.a("patch_sugar_cane_desert");
   public static final aix<eai> D = rb.a("patch_sugar_cane_badlands");
   public static final aix<eai> E = rb.a("patch_sugar_cane");
   public static final aix<eai> F = rb.a("brown_mushroom_nether");
   public static final aix<eai> G = rb.a("red_mushroom_nether");
   public static final aix<eai> H = rb.a("brown_mushroom_normal");
   public static final aix<eai> I = rb.a("red_mushroom_normal");
   public static final aix<eai> J = rb.a("brown_mushroom_taiga");
   public static final aix<eai> K = rb.a("red_mushroom_taiga");
   public static final aix<eai> L = rb.a("brown_mushroom_old_growth");
   public static final aix<eai> M = rb.a("red_mushroom_old_growth");
   public static final aix<eai> N = rb.a("brown_mushroom_swamp");
   public static final aix<eai> O = rb.a("red_mushroom_swamp");
   public static final aix<eai> P = rb.a("flower_warm");
   public static final aix<eai> Q = rb.a("flower_default");
   public static final aix<eai> R = rb.a("flower_flower_forest");
   public static final aix<eai> S = rb.a("flower_swamp");
   public static final aix<eai> T = rb.a("flower_plains");
   public static final aix<eai> U = rb.a("flower_meadow");
   public static final aix<eai> V = rb.a("flower_cherry");
   public static final aix<eai> W = rb.a("trees_plains");
   public static final aix<eai> X = rb.a("dark_forest_vegetation");
   public static final aix<eai> Y = rb.a("flower_forest_flowers");
   public static final aix<eai> Z = rb.a("forest_flowers");
   public static final aix<eai> aa = rb.a("trees_flower_forest");
   public static final aix<eai> ab = rb.a("trees_meadow");
   public static final aix<eai> ac = rb.a("trees_cherry");
   public static final aix<eai> ad = rb.a("trees_taiga");
   public static final aix<eai> ae = rb.a("trees_grove");
   public static final aix<eai> af = rb.a("trees_badlands");
   public static final aix<eai> ag = rb.a("trees_snowy");
   public static final aix<eai> ah = rb.a("trees_swamp");
   public static final aix<eai> ai = rb.a("trees_windswept_savanna");
   public static final aix<eai> aj = rb.a("trees_savanna");
   public static final aix<eai> ak = rb.a("birch_tall");
   public static final aix<eai> al = rb.a("trees_birch");
   public static final aix<eai> am = rb.a("trees_windswept_forest");
   public static final aix<eai> an = rb.a("trees_windswept_hills");
   public static final aix<eai> ao = rb.a("trees_water");
   public static final aix<eai> ap = rb.a("trees_birch_and_oak");
   public static final aix<eai> aq = rb.a("trees_sparse_jungle");
   public static final aix<eai> ar = rb.a("trees_old_growth_spruce_taiga");
   public static final aix<eai> as = rb.a("trees_old_growth_pine_taiga");
   public static final aix<eai> at = rb.a("trees_jungle");
   public static final aix<eai> au = rb.a("bamboo_vegetation");
   public static final aix<eai> av = rb.a("mushroom_island_vegetation");
   public static final aix<eai> aw = rb.a("trees_mangrove");
   private static final eal ax = ear.a(0);

   public static List<eal> a(int $$0) {
      return List.of(eab.a($$0), eaf.a(), rb.c, dzw.a());
   }

   private static List<eal> a(int $$0, @Nullable eal $$1) {
      Builder<eal> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eao.a($$0));
      }

      $$2.add(eaf.a());
      $$2.add(rb.a);
      $$2.add(dzw.a());
      return $$2.build();
   }

   private static Builder<eal> b(eal $$0) {
      return ImmutableList.builder().add($$0).add(eaf.a()).add(ax).add(rb.d).add(dzw.a());
   }

   public static List<eal> a(eal $$0) {
      return b($$0).build();
   }

   public static List<eal> a(eal $$0, cyo $$1) {
      return b($$0).add(dzx.a(drv.a($$1.o(), hz.c))).build();
   }

   public static void a(ph<eai> $$0) {
      ik<dtf<?, ?>> $$1 = $$0.a(kg.aw);
      ij<dtf<?, ?>> $$2 = $$1.b(qs.a);
      ij<dtf<?, ?>> $$3 = $$1.b(qs.b);
      ij<dtf<?, ?>> $$4 = $$1.b(qs.c);
      ij<dtf<?, ?>> $$5 = $$1.b(qs.f);
      ij<dtf<?, ?>> $$6 = $$1.b(qs.g);
      ij<dtf<?, ?>> $$7 = $$1.b(qs.j);
      ij<dtf<?, ?>> $$8 = $$1.b(qs.i);
      ij<dtf<?, ?>> $$9 = $$1.b(qs.k);
      ij<dtf<?, ?>> $$10 = $$1.b(qs.l);
      ij<dtf<?, ?>> $$11 = $$1.b(qs.m);
      ij<dtf<?, ?>> $$12 = $$1.b(qs.n);
      ij<dtf<?, ?>> $$13 = $$1.b(qs.h);
      ij<dtf<?, ?>> $$14 = $$1.b(qs.o);
      ij<dtf<?, ?>> $$15 = $$1.b(qs.p);
      ij<dtf<?, ?>> $$16 = $$1.b(qs.q);
      ij<dtf<?, ?>> $$17 = $$1.b(qs.r);
      ij<dtf<?, ?>> $$18 = $$1.b(qs.s);
      ij<dtf<?, ?>> $$19 = $$1.b(qs.d);
      ij<dtf<?, ?>> $$20 = $$1.b(qs.e);
      ij<dtf<?, ?>> $$21 = $$1.b(qs.t);
      ij<dtf<?, ?>> $$22 = $$1.b(qs.u);
      ij<dtf<?, ?>> $$23 = $$1.b(qs.v);
      ij<dtf<?, ?>> $$24 = $$1.b(qs.w);
      ij<dtf<?, ?>> $$25 = $$1.b(qs.x);
      ij<dtf<?, ?>> $$26 = $$1.b(qs.y);
      ij<dtf<?, ?>> $$27 = $$1.b(qs.K);
      ij<dtf<?, ?>> $$28 = $$1.b(qs.A);
      ij<dtf<?, ?>> $$29 = $$1.b(qs.z);
      ij<dtf<?, ?>> $$30 = $$1.b(qs.B);
      ij<dtf<?, ?>> $$31 = $$1.b(qs.C);
      ij<dtf<?, ?>> $$32 = $$1.b(qs.D);
      ij<dtf<?, ?>> $$33 = $$1.b(qs.E);
      ij<dtf<?, ?>> $$34 = $$1.b(qr.g);
      ij<dtf<?, ?>> $$35 = $$1.b(qr.k);
      ij<dtf<?, ?>> $$36 = $$1.b(qr.K);
      ij<dtf<?, ?>> $$37 = $$1.b(qr.u);
      ij<dtf<?, ?>> $$38 = $$1.b(qs.F);
      ij<dtf<?, ?>> $$39 = $$1.b(qs.G);
      ij<dtf<?, ?>> $$40 = $$1.b(qr.D);
      ij<dtf<?, ?>> $$41 = $$1.b(qs.H);
      ij<dtf<?, ?>> $$42 = $$1.b(qs.I);
      ij<dtf<?, ?>> $$43 = $$1.b(qs.J);
      ij<dtf<?, ?>> $$44 = $$1.b(qs.L);
      ij<dtf<?, ?>> $$45 = $$1.b(qs.M);
      ij<dtf<?, ?>> $$46 = $$1.b(qs.N);
      ij<dtf<?, ?>> $$47 = $$1.b(qs.O);
      ij<dtf<?, ?>> $$48 = $$1.b(qs.P);
      ij<dtf<?, ?>> $$49 = $$1.b(qs.Q);
      ij<dtf<?, ?>> $$50 = $$1.b(qs.R);
      rb.a($$0, a, $$2, eao.a(4), eaf.a(), rb.a, dzw.a());
      rb.a($$0, b, $$3, eag.a(160, 80.0, 0.3), eaf.a(), rb.c, dzw.a());
      rb.a($$0, c, $$4, eab.a(127), eaf.a(), ead.a(dri.a(64), dri.a(100)), dzw.a());
      rb.a($$0, d, $$5, eao.a(3), eaf.a(), rb.a, dzw.a());
      rb.a($$0, e, $$6, eao.a(300), eaf.a(), rb.a, dzw.a());
      rb.a($$0, f, $$7, eah.a(-0.8, 5, 10), eaf.a(), rb.c, dzw.a());
      rb.a($$0, g, $$7, a(2));
      rb.a($$0, h, $$7, eaf.a(), rb.c, dzw.a());
      rb.a($$0, i, $$7, a(20));
      rb.a($$0, j, $$7, a(5));
      rb.a($$0, k, $$8, eaf.a(), rb.c, dzw.a());
      rb.a($$0, l, $$8, a(7));
      rb.a($$0, m, $$9, a(25));
      rb.a($$0, n, $$10, rb.a());
      rb.a($$0, o, $$11, a(2));
      rb.a($$0, p, $$11, eaf.a(), rb.c, dzw.a());
      rb.a($$0, q, $$11, a(20));
      rb.a($$0, r, $$12, eao.a(6), eaf.a(), rb.a, dzw.a());
      rb.a($$0, s, $$12, eao.a(64), eaf.a(), rb.a, dzw.a());
      rb.a($$0, t, $$13, eao.a(32), eaf.a(), rb.c, dzw.a());
      rb.a($$0, u, $$13, eao.a(384), eaf.a(), rb.c, dzw.a());
      rb.a($$0, v, $$14, a(4));
      rb.a($$0, w, $$15, eah.a(-0.8, 0, 7), eao.a(32), eaf.a(), rb.a, dzw.a());
      rb.a($$0, x, $$15, eao.a(5), eaf.a(), rb.a, dzw.a());
      rb.a($$0, y, $$16, eao.a(5), eaf.a(), rb.a, dzw.a());
      rb.a($$0, z, $$17, eao.a(6), eaf.a(), rb.a, dzw.a());
      rb.a($$0, A, $$17, eao.a(13), eaf.a(), rb.a, dzw.a());
      rb.a($$0, B, $$18, eao.a(3), eaf.a(), rb.a, dzw.a());
      rb.a($$0, C, $$18, eaf.a(), rb.a, dzw.a());
      rb.a($$0, D, $$18, eao.a(5), eaf.a(), rb.a, dzw.a());
      rb.a($$0, E, $$18, eao.a(6), eaf.a(), rb.a, dzw.a());
      rb.a($$0, F, $$19, eao.a(2), eaf.a(), rb.e, dzw.a());
      rb.a($$0, G, $$20, eao.a(2), eaf.a(), rb.e, dzw.a());
      rb.a($$0, H, $$19, a(256, null));
      rb.a($$0, I, $$20, a(512, null));
      rb.a($$0, J, $$19, a(4, null));
      rb.a($$0, K, $$20, a(256, null));
      rb.a($$0, L, $$19, a(4, eab.a(3)));
      rb.a($$0, M, $$20, a(171, null));
      rb.a($$0, N, $$19, a(0, eab.a(2)));
      rb.a($$0, O, $$20, a(64, null));
      rb.a($$0, P, $$21, eao.a(16), eaf.a(), rb.a, dzw.a());
      rb.a($$0, Q, $$21, eao.a(32), eaf.a(), rb.a, dzw.a());
      rb.a($$0, R, $$22, eab.a(3), eao.a(2), eaf.a(), rb.a, dzw.a());
      rb.a($$0, S, $$23, eao.a(32), eaf.a(), rb.a, dzw.a());
      rb.a($$0, T, $$24, eah.a(-0.8, 15, 4), eao.a(32), eaf.a(), rb.a, dzw.a());
      rb.a($$0, V, $$26, eah.a(-0.8, 5, 10), eaf.a(), rb.a, dzw.a());
      rb.a($$0, U, $$25, eaf.a(), rb.a, dzw.a());
      eal $$51 = ear.a(0);
      rb.a($$0, W, $$27, rb.a(0, 0.05F, 1), eaf.a(), $$51, rb.d, dzx.a(drv.a(cyq.x.o(), hz.c)), dzw.a());
      rb.a($$0, X, $$28, eab.a(16), eaf.a(), $$51, rb.d, dzw.a());
      rb.a($$0, Y, $$29, eao.a(7), eaf.a(), rb.a, eab.a(bks.a(blf.a(-1, 3), 0, 3)), dzw.a());
      rb.a($$0, Z, $$29, eao.a(7), eaf.a(), rb.a, eab.a(bks.a(blf.a(-3, 1), 0, 1)), dzw.a());
      rb.a($$0, aa, $$30, a(rb.a(6, 0.1F, 1)));
      rb.a($$0, ab, $$31, a(eao.a(100)));
      rb.a($$0, ac, $$36, a(rb.a(10, 0.1F, 1), cyq.C));
      rb.a($$0, ad, $$32, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, ae, $$33, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, af, $$34, a(rb.a(5, 0.1F, 1), cyq.x));
      rb.a($$0, ag, $$35, a(rb.a(0, 0.1F, 1), cyq.y));
      rb.a($$0, ah, $$37, rb.a(2, 0.1F, 1), eaf.a(), ear.a(2), rb.d, dzw.a(), dzx.a(drv.a(cyq.x.o(), hz.c)));
      rb.a($$0, ai, $$38, a(rb.a(2, 0.1F, 1)));
      rb.a($$0, aj, $$38, a(rb.a(1, 0.1F, 1)));
      rb.a($$0, ak, $$39, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, al, $$40, a(rb.a(10, 0.1F, 1), cyq.z));
      rb.a($$0, am, $$41, a(rb.a(3, 0.1F, 1)));
      rb.a($$0, an, $$41, a(rb.a(0, 0.1F, 1)));
      rb.a($$0, ao, $$42, a(rb.a(0, 0.1F, 1)));
      rb.a($$0, ap, $$43, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, aq, $$44, a(rb.a(2, 0.1F, 1)));
      rb.a($$0, ar, $$45, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, as, $$46, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, at, $$47, a(rb.a(50, 0.1F, 1)));
      rb.a($$0, au, $$48, a(rb.a(30, 0.1F, 1)));
      rb.a($$0, av, $$49, eaf.a(), rb.a, dzw.a());
      rb.a($$0, aw, $$50, eab.a(25), eaf.a(), ear.a(5), rb.d, dzw.a(), dzx.a(drv.a(cyq.E.o(), hz.c)));
   }
}
