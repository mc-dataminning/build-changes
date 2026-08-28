import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sz {
   public static final ale<ehq> a = sx.a("bamboo_light");
   public static final ale<ehq> b = sx.a("bamboo");
   public static final ale<ehq> c = sx.a("vines");
   public static final ale<ehq> d = sx.a("patch_sunflower");
   public static final ale<ehq> e = sx.a("patch_pumpkin");
   public static final ale<ehq> f = sx.a("patch_grass_plain");
   public static final ale<ehq> g = sx.a("patch_grass_forest");
   public static final ale<ehq> h = sx.a("patch_grass_badlands");
   public static final ale<ehq> i = sx.a("patch_grass_savanna");
   public static final ale<ehq> j = sx.a("patch_grass_normal");
   public static final ale<ehq> k = sx.a("patch_grass_taiga_2");
   public static final ale<ehq> l = sx.a("patch_grass_taiga");
   public static final ale<ehq> m = sx.a("patch_grass_jungle");
   public static final ale<ehq> n = sx.a("grass_bonemeal");
   public static final ale<ehq> o = sx.a("patch_dead_bush_2");
   public static final ale<ehq> p = sx.a("patch_dead_bush");
   public static final ale<ehq> q = sx.a("patch_dead_bush_badlands");
   public static final ale<ehq> r = sx.a("patch_melon");
   public static final ale<ehq> s = sx.a("patch_melon_sparse");
   public static final ale<ehq> t = sx.a("patch_berry_common");
   public static final ale<ehq> u = sx.a("patch_berry_rare");
   public static final ale<ehq> v = sx.a("patch_waterlily");
   public static final ale<ehq> w = sx.a("patch_tall_grass_2");
   public static final ale<ehq> x = sx.a("patch_tall_grass");
   public static final ale<ehq> y = sx.a("patch_large_fern");
   public static final ale<ehq> z = sx.a("patch_cactus_desert");
   public static final ale<ehq> A = sx.a("patch_cactus_decorated");
   public static final ale<ehq> B = sx.a("patch_sugar_cane_swamp");
   public static final ale<ehq> C = sx.a("patch_sugar_cane_desert");
   public static final ale<ehq> D = sx.a("patch_sugar_cane_badlands");
   public static final ale<ehq> E = sx.a("patch_sugar_cane");
   public static final ale<ehq> F = sx.a("brown_mushroom_nether");
   public static final ale<ehq> G = sx.a("red_mushroom_nether");
   public static final ale<ehq> H = sx.a("brown_mushroom_normal");
   public static final ale<ehq> I = sx.a("red_mushroom_normal");
   public static final ale<ehq> J = sx.a("brown_mushroom_taiga");
   public static final ale<ehq> K = sx.a("red_mushroom_taiga");
   public static final ale<ehq> L = sx.a("brown_mushroom_old_growth");
   public static final ale<ehq> M = sx.a("red_mushroom_old_growth");
   public static final ale<ehq> N = sx.a("brown_mushroom_swamp");
   public static final ale<ehq> O = sx.a("red_mushroom_swamp");
   public static final ale<ehq> P = sx.a("flower_warm");
   public static final ale<ehq> Q = sx.a("flower_default");
   public static final ale<ehq> R = sx.a("flower_flower_forest");
   public static final ale<ehq> S = sx.a("flower_swamp");
   public static final ale<ehq> T = sx.a("flower_plains");
   public static final ale<ehq> U = sx.a("flower_meadow");
   public static final ale<ehq> V = sx.a("flower_cherry");
   public static final ale<ehq> W = sx.a("trees_plains");
   public static final ale<ehq> X = sx.a("dark_forest_vegetation");
   public static final ale<ehq> Y = sx.a("flower_forest_flowers");
   public static final ale<ehq> Z = sx.a("forest_flowers");
   public static final ale<ehq> aa = sx.a("trees_flower_forest");
   public static final ale<ehq> ab = sx.a("trees_meadow");
   public static final ale<ehq> ac = sx.a("trees_cherry");
   public static final ale<ehq> ad = sx.a("trees_taiga");
   public static final ale<ehq> ae = sx.a("trees_grove");
   public static final ale<ehq> af = sx.a("trees_badlands");
   public static final ale<ehq> ag = sx.a("trees_snowy");
   public static final ale<ehq> ah = sx.a("trees_swamp");
   public static final ale<ehq> ai = sx.a("trees_windswept_savanna");
   public static final ale<ehq> aj = sx.a("trees_savanna");
   public static final ale<ehq> ak = sx.a("birch_tall");
   public static final ale<ehq> al = sx.a("trees_birch");
   public static final ale<ehq> am = sx.a("trees_windswept_forest");
   public static final ale<ehq> an = sx.a("trees_windswept_hills");
   public static final ale<ehq> ao = sx.a("trees_water");
   public static final ale<ehq> ap = sx.a("trees_birch_and_oak");
   public static final ale<ehq> aq = sx.a("trees_sparse_jungle");
   public static final ale<ehq> ar = sx.a("trees_old_growth_spruce_taiga");
   public static final ale<ehq> as = sx.a("trees_old_growth_pine_taiga");
   public static final ale<ehq> at = sx.a("trees_jungle");
   public static final ale<ehq> au = sx.a("bamboo_vegetation");
   public static final ale<ehq> av = sx.a("mushroom_island_vegetation");
   public static final ale<ehq> aw = sx.a("trees_mangrove");
   private static final eht ax = ehz.a(0);

   public static List<eht> a(int $$0) {
      return List.of(ehj.a($$0), ehn.a(), sx.c, ehe.a());
   }

   private static List<eht> a(int $$0, @Nullable eht $$1) {
      Builder<eht> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ehw.a($$0));
      }

      $$2.add(ehn.a());
      $$2.add(sx.a);
      $$2.add(ehe.a());
      return $$2.build();
   }

   private static Builder<eht> b(eht $$0) {
      return ImmutableList.builder().add($$0).add(ehn.a()).add(ax).add(sx.d).add(ehe.a());
   }

   public static List<eht> a(eht $$0) {
      return b($$0).build();
   }

   public static List<eht> a(eht $$0, dfb $$1) {
      return b($$0).add(ehf.a(dzd.a($$1.o(), iz.c))).build();
   }

   public static void a(rc<ehq> $$0) {
      jj<ean<?, ?>> $$1 = $$0.a(lq.aC);
      ji<ean<?, ?>> $$2 = $$1.b(so.a);
      ji<ean<?, ?>> $$3 = $$1.b(so.b);
      ji<ean<?, ?>> $$4 = $$1.b(so.c);
      ji<ean<?, ?>> $$5 = $$1.b(so.f);
      ji<ean<?, ?>> $$6 = $$1.b(so.g);
      ji<ean<?, ?>> $$7 = $$1.b(so.j);
      ji<ean<?, ?>> $$8 = $$1.b(so.i);
      ji<ean<?, ?>> $$9 = $$1.b(so.k);
      ji<ean<?, ?>> $$10 = $$1.b(so.l);
      ji<ean<?, ?>> $$11 = $$1.b(so.m);
      ji<ean<?, ?>> $$12 = $$1.b(so.n);
      ji<ean<?, ?>> $$13 = $$1.b(so.h);
      ji<ean<?, ?>> $$14 = $$1.b(so.o);
      ji<ean<?, ?>> $$15 = $$1.b(so.p);
      ji<ean<?, ?>> $$16 = $$1.b(so.q);
      ji<ean<?, ?>> $$17 = $$1.b(so.r);
      ji<ean<?, ?>> $$18 = $$1.b(so.s);
      ji<ean<?, ?>> $$19 = $$1.b(so.d);
      ji<ean<?, ?>> $$20 = $$1.b(so.e);
      ji<ean<?, ?>> $$21 = $$1.b(so.t);
      ji<ean<?, ?>> $$22 = $$1.b(so.u);
      ji<ean<?, ?>> $$23 = $$1.b(so.v);
      ji<ean<?, ?>> $$24 = $$1.b(so.w);
      ji<ean<?, ?>> $$25 = $$1.b(so.x);
      ji<ean<?, ?>> $$26 = $$1.b(so.y);
      ji<ean<?, ?>> $$27 = $$1.b(so.K);
      ji<ean<?, ?>> $$28 = $$1.b(so.A);
      ji<ean<?, ?>> $$29 = $$1.b(so.z);
      ji<ean<?, ?>> $$30 = $$1.b(so.B);
      ji<ean<?, ?>> $$31 = $$1.b(so.C);
      ji<ean<?, ?>> $$32 = $$1.b(so.D);
      ji<ean<?, ?>> $$33 = $$1.b(so.E);
      ji<ean<?, ?>> $$34 = $$1.b(sn.g);
      ji<ean<?, ?>> $$35 = $$1.b(sn.k);
      ji<ean<?, ?>> $$36 = $$1.b(sn.K);
      ji<ean<?, ?>> $$37 = $$1.b(sn.u);
      ji<ean<?, ?>> $$38 = $$1.b(so.F);
      ji<ean<?, ?>> $$39 = $$1.b(so.G);
      ji<ean<?, ?>> $$40 = $$1.b(sn.D);
      ji<ean<?, ?>> $$41 = $$1.b(so.H);
      ji<ean<?, ?>> $$42 = $$1.b(so.I);
      ji<ean<?, ?>> $$43 = $$1.b(so.J);
      ji<ean<?, ?>> $$44 = $$1.b(so.L);
      ji<ean<?, ?>> $$45 = $$1.b(so.M);
      ji<ean<?, ?>> $$46 = $$1.b(so.N);
      ji<ean<?, ?>> $$47 = $$1.b(so.O);
      ji<ean<?, ?>> $$48 = $$1.b(so.P);
      ji<ean<?, ?>> $$49 = $$1.b(so.Q);
      ji<ean<?, ?>> $$50 = $$1.b(so.R);
      sx.a($$0, a, $$2, ehw.a(4), ehn.a(), sx.a, ehe.a());
      sx.a($$0, b, $$3, eho.a(160, 80.0, 0.3), ehn.a(), sx.c, ehe.a());
      sx.a($$0, c, $$4, ehj.a(127), ehn.a(), ehl.a(dyq.a(64), dyq.a(100)), ehe.a());
      sx.a($$0, d, $$5, ehw.a(3), ehn.a(), sx.a, ehe.a());
      sx.a($$0, e, $$6, ehw.a(300), ehn.a(), sx.a, ehe.a());
      sx.a($$0, f, $$7, ehp.a(-0.8, 5, 10), ehn.a(), sx.c, ehe.a());
      sx.a($$0, g, $$7, a(2));
      sx.a($$0, h, $$7, ehn.a(), sx.c, ehe.a());
      sx.a($$0, i, $$7, a(20));
      sx.a($$0, j, $$7, a(5));
      sx.a($$0, k, $$8, ehn.a(), sx.c, ehe.a());
      sx.a($$0, l, $$8, a(7));
      sx.a($$0, m, $$9, a(25));
      sx.a($$0, n, $$10, sx.a());
      sx.a($$0, o, $$11, a(2));
      sx.a($$0, p, $$11, ehn.a(), sx.c, ehe.a());
      sx.a($$0, q, $$11, a(20));
      sx.a($$0, r, $$12, ehw.a(6), ehn.a(), sx.a, ehe.a());
      sx.a($$0, s, $$12, ehw.a(64), ehn.a(), sx.a, ehe.a());
      sx.a($$0, t, $$13, ehw.a(32), ehn.a(), sx.c, ehe.a());
      sx.a($$0, u, $$13, ehw.a(384), ehn.a(), sx.c, ehe.a());
      sx.a($$0, v, $$14, a(4));
      sx.a($$0, w, $$15, ehp.a(-0.8, 0, 7), ehw.a(32), ehn.a(), sx.a, ehe.a());
      sx.a($$0, x, $$15, ehw.a(5), ehn.a(), sx.a, ehe.a());
      sx.a($$0, y, $$16, ehw.a(5), ehn.a(), sx.a, ehe.a());
      sx.a($$0, z, $$17, ehw.a(6), ehn.a(), sx.a, ehe.a());
      sx.a($$0, A, $$17, ehw.a(13), ehn.a(), sx.a, ehe.a());
      sx.a($$0, B, $$18, ehw.a(3), ehn.a(), sx.a, ehe.a());
      sx.a($$0, C, $$18, ehn.a(), sx.a, ehe.a());
      sx.a($$0, D, $$18, ehw.a(5), ehn.a(), sx.a, ehe.a());
      sx.a($$0, E, $$18, ehw.a(6), ehn.a(), sx.a, ehe.a());
      sx.a($$0, F, $$19, ehw.a(2), ehn.a(), sx.e, ehe.a());
      sx.a($$0, G, $$20, ehw.a(2), ehn.a(), sx.e, ehe.a());
      sx.a($$0, H, $$19, a(256, null));
      sx.a($$0, I, $$20, a(512, null));
      sx.a($$0, J, $$19, a(4, null));
      sx.a($$0, K, $$20, a(256, null));
      sx.a($$0, L, $$19, a(4, ehj.a(3)));
      sx.a($$0, M, $$20, a(171, null));
      sx.a($$0, N, $$19, a(0, ehj.a(2)));
      sx.a($$0, O, $$20, a(64, null));
      sx.a($$0, P, $$21, ehw.a(16), ehn.a(), sx.a, ehe.a());
      sx.a($$0, Q, $$21, ehw.a(32), ehn.a(), sx.a, ehe.a());
      sx.a($$0, R, $$22, ehj.a(3), ehw.a(2), ehn.a(), sx.a, ehe.a());
      sx.a($$0, S, $$23, ehw.a(32), ehn.a(), sx.a, ehe.a());
      sx.a($$0, T, $$24, ehp.a(-0.8, 15, 4), ehw.a(32), ehn.a(), sx.a, ehe.a());
      sx.a($$0, V, $$26, ehp.a(-0.8, 5, 10), ehn.a(), sx.a, ehe.a());
      sx.a($$0, U, $$25, ehn.a(), sx.a, ehe.a());
      eht $$51 = ehz.a(0);
      sx.a($$0, W, $$27, sx.a(0, 0.05F, 1), ehn.a(), $$51, sx.d, ehf.a(dzd.a(dfd.x.o(), iz.c)), ehe.a());
      sx.a($$0, X, $$28, ehj.a(16), ehn.a(), $$51, sx.d, ehe.a());
      sx.a($$0, Y, $$29, ehw.a(7), ehn.a(), sx.a, ehj.a(bpu.a(bqh.a(-1, 3), 0, 3)), ehe.a());
      sx.a($$0, Z, $$29, ehw.a(7), ehn.a(), sx.a, ehj.a(bpu.a(bqh.a(-3, 1), 0, 1)), ehe.a());
      sx.a($$0, aa, $$30, a(sx.a(6, 0.1F, 1)));
      sx.a($$0, ab, $$31, a(ehw.a(100)));
      sx.a($$0, ac, $$36, a(sx.a(10, 0.1F, 1), dfd.C));
      sx.a($$0, ad, $$32, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, ae, $$33, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, af, $$34, a(sx.a(5, 0.1F, 1), dfd.x));
      sx.a($$0, ag, $$35, a(sx.a(0, 0.1F, 1), dfd.y));
      sx.a($$0, ah, $$37, sx.a(2, 0.1F, 1), ehn.a(), ehz.a(2), sx.d, ehe.a(), ehf.a(dzd.a(dfd.x.o(), iz.c)));
      sx.a($$0, ai, $$38, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, aj, $$38, a(sx.a(1, 0.1F, 1)));
      sx.a($$0, ak, $$39, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, al, $$40, a(sx.a(10, 0.1F, 1), dfd.z));
      sx.a($$0, am, $$41, a(sx.a(3, 0.1F, 1)));
      sx.a($$0, an, $$41, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ao, $$42, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ap, $$43, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, aq, $$44, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, ar, $$45, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, as, $$46, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, at, $$47, a(sx.a(50, 0.1F, 1)));
      sx.a($$0, au, $$48, a(sx.a(30, 0.1F, 1)));
      sx.a($$0, av, $$49, ehn.a(), sx.a, ehe.a());
      sx.a($$0, aw, $$50, ehj.a(25), ehn.a(), ehz.a(5), sx.d, ehe.a(), ehf.a(dzd.a(dfd.E.o(), iz.c)));
   }
}
