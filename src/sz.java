import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sz {
   public static final ale<eho> a = sx.a("bamboo_light");
   public static final ale<eho> b = sx.a("bamboo");
   public static final ale<eho> c = sx.a("vines");
   public static final ale<eho> d = sx.a("patch_sunflower");
   public static final ale<eho> e = sx.a("patch_pumpkin");
   public static final ale<eho> f = sx.a("patch_grass_plain");
   public static final ale<eho> g = sx.a("patch_grass_forest");
   public static final ale<eho> h = sx.a("patch_grass_badlands");
   public static final ale<eho> i = sx.a("patch_grass_savanna");
   public static final ale<eho> j = sx.a("patch_grass_normal");
   public static final ale<eho> k = sx.a("patch_grass_taiga_2");
   public static final ale<eho> l = sx.a("patch_grass_taiga");
   public static final ale<eho> m = sx.a("patch_grass_jungle");
   public static final ale<eho> n = sx.a("grass_bonemeal");
   public static final ale<eho> o = sx.a("patch_dead_bush_2");
   public static final ale<eho> p = sx.a("patch_dead_bush");
   public static final ale<eho> q = sx.a("patch_dead_bush_badlands");
   public static final ale<eho> r = sx.a("patch_melon");
   public static final ale<eho> s = sx.a("patch_melon_sparse");
   public static final ale<eho> t = sx.a("patch_berry_common");
   public static final ale<eho> u = sx.a("patch_berry_rare");
   public static final ale<eho> v = sx.a("patch_waterlily");
   public static final ale<eho> w = sx.a("patch_tall_grass_2");
   public static final ale<eho> x = sx.a("patch_tall_grass");
   public static final ale<eho> y = sx.a("patch_large_fern");
   public static final ale<eho> z = sx.a("patch_cactus_desert");
   public static final ale<eho> A = sx.a("patch_cactus_decorated");
   public static final ale<eho> B = sx.a("patch_sugar_cane_swamp");
   public static final ale<eho> C = sx.a("patch_sugar_cane_desert");
   public static final ale<eho> D = sx.a("patch_sugar_cane_badlands");
   public static final ale<eho> E = sx.a("patch_sugar_cane");
   public static final ale<eho> F = sx.a("brown_mushroom_nether");
   public static final ale<eho> G = sx.a("red_mushroom_nether");
   public static final ale<eho> H = sx.a("brown_mushroom_normal");
   public static final ale<eho> I = sx.a("red_mushroom_normal");
   public static final ale<eho> J = sx.a("brown_mushroom_taiga");
   public static final ale<eho> K = sx.a("red_mushroom_taiga");
   public static final ale<eho> L = sx.a("brown_mushroom_old_growth");
   public static final ale<eho> M = sx.a("red_mushroom_old_growth");
   public static final ale<eho> N = sx.a("brown_mushroom_swamp");
   public static final ale<eho> O = sx.a("red_mushroom_swamp");
   public static final ale<eho> P = sx.a("flower_warm");
   public static final ale<eho> Q = sx.a("flower_default");
   public static final ale<eho> R = sx.a("flower_flower_forest");
   public static final ale<eho> S = sx.a("flower_swamp");
   public static final ale<eho> T = sx.a("flower_plains");
   public static final ale<eho> U = sx.a("flower_meadow");
   public static final ale<eho> V = sx.a("flower_cherry");
   public static final ale<eho> W = sx.a("trees_plains");
   public static final ale<eho> X = sx.a("dark_forest_vegetation");
   public static final ale<eho> Y = sx.a("flower_forest_flowers");
   public static final ale<eho> Z = sx.a("forest_flowers");
   public static final ale<eho> aa = sx.a("trees_flower_forest");
   public static final ale<eho> ab = sx.a("trees_meadow");
   public static final ale<eho> ac = sx.a("trees_cherry");
   public static final ale<eho> ad = sx.a("trees_taiga");
   public static final ale<eho> ae = sx.a("trees_grove");
   public static final ale<eho> af = sx.a("trees_badlands");
   public static final ale<eho> ag = sx.a("trees_snowy");
   public static final ale<eho> ah = sx.a("trees_swamp");
   public static final ale<eho> ai = sx.a("trees_windswept_savanna");
   public static final ale<eho> aj = sx.a("trees_savanna");
   public static final ale<eho> ak = sx.a("birch_tall");
   public static final ale<eho> al = sx.a("trees_birch");
   public static final ale<eho> am = sx.a("trees_windswept_forest");
   public static final ale<eho> an = sx.a("trees_windswept_hills");
   public static final ale<eho> ao = sx.a("trees_water");
   public static final ale<eho> ap = sx.a("trees_birch_and_oak");
   public static final ale<eho> aq = sx.a("trees_sparse_jungle");
   public static final ale<eho> ar = sx.a("trees_old_growth_spruce_taiga");
   public static final ale<eho> as = sx.a("trees_old_growth_pine_taiga");
   public static final ale<eho> at = sx.a("trees_jungle");
   public static final ale<eho> au = sx.a("bamboo_vegetation");
   public static final ale<eho> av = sx.a("mushroom_island_vegetation");
   public static final ale<eho> aw = sx.a("trees_mangrove");
   private static final ehr ax = ehx.a(0);

   public static List<ehr> a(int $$0) {
      return List.of(ehh.a($$0), ehl.a(), sx.c, ehc.a());
   }

   private static List<ehr> a(int $$0, @Nullable ehr $$1) {
      Builder<ehr> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ehu.a($$0));
      }

      $$2.add(ehl.a());
      $$2.add(sx.a);
      $$2.add(ehc.a());
      return $$2.build();
   }

   private static Builder<ehr> b(ehr $$0) {
      return ImmutableList.builder().add($$0).add(ehl.a()).add(ax).add(sx.d).add(ehc.a());
   }

   public static List<ehr> a(ehr $$0) {
      return b($$0).build();
   }

   public static List<ehr> a(ehr $$0, dez $$1) {
      return b($$0).add(ehd.a(dzb.a($$1.o(), iz.c))).build();
   }

   public static void a(rc<eho> $$0) {
      jj<eal<?, ?>> $$1 = $$0.a(lq.aC);
      ji<eal<?, ?>> $$2 = $$1.b(so.a);
      ji<eal<?, ?>> $$3 = $$1.b(so.b);
      ji<eal<?, ?>> $$4 = $$1.b(so.c);
      ji<eal<?, ?>> $$5 = $$1.b(so.f);
      ji<eal<?, ?>> $$6 = $$1.b(so.g);
      ji<eal<?, ?>> $$7 = $$1.b(so.j);
      ji<eal<?, ?>> $$8 = $$1.b(so.i);
      ji<eal<?, ?>> $$9 = $$1.b(so.k);
      ji<eal<?, ?>> $$10 = $$1.b(so.l);
      ji<eal<?, ?>> $$11 = $$1.b(so.m);
      ji<eal<?, ?>> $$12 = $$1.b(so.n);
      ji<eal<?, ?>> $$13 = $$1.b(so.h);
      ji<eal<?, ?>> $$14 = $$1.b(so.o);
      ji<eal<?, ?>> $$15 = $$1.b(so.p);
      ji<eal<?, ?>> $$16 = $$1.b(so.q);
      ji<eal<?, ?>> $$17 = $$1.b(so.r);
      ji<eal<?, ?>> $$18 = $$1.b(so.s);
      ji<eal<?, ?>> $$19 = $$1.b(so.d);
      ji<eal<?, ?>> $$20 = $$1.b(so.e);
      ji<eal<?, ?>> $$21 = $$1.b(so.t);
      ji<eal<?, ?>> $$22 = $$1.b(so.u);
      ji<eal<?, ?>> $$23 = $$1.b(so.v);
      ji<eal<?, ?>> $$24 = $$1.b(so.w);
      ji<eal<?, ?>> $$25 = $$1.b(so.x);
      ji<eal<?, ?>> $$26 = $$1.b(so.y);
      ji<eal<?, ?>> $$27 = $$1.b(so.K);
      ji<eal<?, ?>> $$28 = $$1.b(so.A);
      ji<eal<?, ?>> $$29 = $$1.b(so.z);
      ji<eal<?, ?>> $$30 = $$1.b(so.B);
      ji<eal<?, ?>> $$31 = $$1.b(so.C);
      ji<eal<?, ?>> $$32 = $$1.b(so.D);
      ji<eal<?, ?>> $$33 = $$1.b(so.E);
      ji<eal<?, ?>> $$34 = $$1.b(sn.g);
      ji<eal<?, ?>> $$35 = $$1.b(sn.k);
      ji<eal<?, ?>> $$36 = $$1.b(sn.K);
      ji<eal<?, ?>> $$37 = $$1.b(sn.u);
      ji<eal<?, ?>> $$38 = $$1.b(so.F);
      ji<eal<?, ?>> $$39 = $$1.b(so.G);
      ji<eal<?, ?>> $$40 = $$1.b(sn.D);
      ji<eal<?, ?>> $$41 = $$1.b(so.H);
      ji<eal<?, ?>> $$42 = $$1.b(so.I);
      ji<eal<?, ?>> $$43 = $$1.b(so.J);
      ji<eal<?, ?>> $$44 = $$1.b(so.L);
      ji<eal<?, ?>> $$45 = $$1.b(so.M);
      ji<eal<?, ?>> $$46 = $$1.b(so.N);
      ji<eal<?, ?>> $$47 = $$1.b(so.O);
      ji<eal<?, ?>> $$48 = $$1.b(so.P);
      ji<eal<?, ?>> $$49 = $$1.b(so.Q);
      ji<eal<?, ?>> $$50 = $$1.b(so.R);
      sx.a($$0, a, $$2, ehu.a(4), ehl.a(), sx.a, ehc.a());
      sx.a($$0, b, $$3, ehm.a(160, 80.0, 0.3), ehl.a(), sx.c, ehc.a());
      sx.a($$0, c, $$4, ehh.a(127), ehl.a(), ehj.a(dyo.a(64), dyo.a(100)), ehc.a());
      sx.a($$0, d, $$5, ehu.a(3), ehl.a(), sx.a, ehc.a());
      sx.a($$0, e, $$6, ehu.a(300), ehl.a(), sx.a, ehc.a());
      sx.a($$0, f, $$7, ehn.a(-0.8, 5, 10), ehl.a(), sx.c, ehc.a());
      sx.a($$0, g, $$7, a(2));
      sx.a($$0, h, $$7, ehl.a(), sx.c, ehc.a());
      sx.a($$0, i, $$7, a(20));
      sx.a($$0, j, $$7, a(5));
      sx.a($$0, k, $$8, ehl.a(), sx.c, ehc.a());
      sx.a($$0, l, $$8, a(7));
      sx.a($$0, m, $$9, a(25));
      sx.a($$0, n, $$10, sx.a());
      sx.a($$0, o, $$11, a(2));
      sx.a($$0, p, $$11, ehl.a(), sx.c, ehc.a());
      sx.a($$0, q, $$11, a(20));
      sx.a($$0, r, $$12, ehu.a(6), ehl.a(), sx.a, ehc.a());
      sx.a($$0, s, $$12, ehu.a(64), ehl.a(), sx.a, ehc.a());
      sx.a($$0, t, $$13, ehu.a(32), ehl.a(), sx.c, ehc.a());
      sx.a($$0, u, $$13, ehu.a(384), ehl.a(), sx.c, ehc.a());
      sx.a($$0, v, $$14, a(4));
      sx.a($$0, w, $$15, ehn.a(-0.8, 0, 7), ehu.a(32), ehl.a(), sx.a, ehc.a());
      sx.a($$0, x, $$15, ehu.a(5), ehl.a(), sx.a, ehc.a());
      sx.a($$0, y, $$16, ehu.a(5), ehl.a(), sx.a, ehc.a());
      sx.a($$0, z, $$17, ehu.a(6), ehl.a(), sx.a, ehc.a());
      sx.a($$0, A, $$17, ehu.a(13), ehl.a(), sx.a, ehc.a());
      sx.a($$0, B, $$18, ehu.a(3), ehl.a(), sx.a, ehc.a());
      sx.a($$0, C, $$18, ehl.a(), sx.a, ehc.a());
      sx.a($$0, D, $$18, ehu.a(5), ehl.a(), sx.a, ehc.a());
      sx.a($$0, E, $$18, ehu.a(6), ehl.a(), sx.a, ehc.a());
      sx.a($$0, F, $$19, ehu.a(2), ehl.a(), sx.e, ehc.a());
      sx.a($$0, G, $$20, ehu.a(2), ehl.a(), sx.e, ehc.a());
      sx.a($$0, H, $$19, a(256, null));
      sx.a($$0, I, $$20, a(512, null));
      sx.a($$0, J, $$19, a(4, null));
      sx.a($$0, K, $$20, a(256, null));
      sx.a($$0, L, $$19, a(4, ehh.a(3)));
      sx.a($$0, M, $$20, a(171, null));
      sx.a($$0, N, $$19, a(0, ehh.a(2)));
      sx.a($$0, O, $$20, a(64, null));
      sx.a($$0, P, $$21, ehu.a(16), ehl.a(), sx.a, ehc.a());
      sx.a($$0, Q, $$21, ehu.a(32), ehl.a(), sx.a, ehc.a());
      sx.a($$0, R, $$22, ehh.a(3), ehu.a(2), ehl.a(), sx.a, ehc.a());
      sx.a($$0, S, $$23, ehu.a(32), ehl.a(), sx.a, ehc.a());
      sx.a($$0, T, $$24, ehn.a(-0.8, 15, 4), ehu.a(32), ehl.a(), sx.a, ehc.a());
      sx.a($$0, V, $$26, ehn.a(-0.8, 5, 10), ehl.a(), sx.a, ehc.a());
      sx.a($$0, U, $$25, ehl.a(), sx.a, ehc.a());
      ehr $$51 = ehx.a(0);
      sx.a($$0, W, $$27, sx.a(0, 0.05F, 1), ehl.a(), $$51, sx.d, ehd.a(dzb.a(dfb.x.o(), iz.c)), ehc.a());
      sx.a($$0, X, $$28, ehh.a(16), ehl.a(), $$51, sx.d, ehc.a());
      sx.a($$0, Y, $$29, ehu.a(7), ehl.a(), sx.a, ehh.a(bps.a(bqf.a(-1, 3), 0, 3)), ehc.a());
      sx.a($$0, Z, $$29, ehu.a(7), ehl.a(), sx.a, ehh.a(bps.a(bqf.a(-3, 1), 0, 1)), ehc.a());
      sx.a($$0, aa, $$30, a(sx.a(6, 0.1F, 1)));
      sx.a($$0, ab, $$31, a(ehu.a(100)));
      sx.a($$0, ac, $$36, a(sx.a(10, 0.1F, 1), dfb.C));
      sx.a($$0, ad, $$32, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, ae, $$33, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, af, $$34, a(sx.a(5, 0.1F, 1), dfb.x));
      sx.a($$0, ag, $$35, a(sx.a(0, 0.1F, 1), dfb.y));
      sx.a($$0, ah, $$37, sx.a(2, 0.1F, 1), ehl.a(), ehx.a(2), sx.d, ehc.a(), ehd.a(dzb.a(dfb.x.o(), iz.c)));
      sx.a($$0, ai, $$38, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, aj, $$38, a(sx.a(1, 0.1F, 1)));
      sx.a($$0, ak, $$39, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, al, $$40, a(sx.a(10, 0.1F, 1), dfb.z));
      sx.a($$0, am, $$41, a(sx.a(3, 0.1F, 1)));
      sx.a($$0, an, $$41, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ao, $$42, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ap, $$43, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, aq, $$44, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, ar, $$45, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, as, $$46, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, at, $$47, a(sx.a(50, 0.1F, 1)));
      sx.a($$0, au, $$48, a(sx.a(30, 0.1F, 1)));
      sx.a($$0, av, $$49, ehl.a(), sx.a, ehc.a());
      sx.a($$0, aw, $$50, ehh.a(25), ehl.a(), ehx.a(5), sx.d, ehc.a(), ehd.a(dzb.a(dfb.E.o(), iz.c)));
   }
}
