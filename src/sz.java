import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sz {
   public static final ale<ehp> a = sx.a("bamboo_light");
   public static final ale<ehp> b = sx.a("bamboo");
   public static final ale<ehp> c = sx.a("vines");
   public static final ale<ehp> d = sx.a("patch_sunflower");
   public static final ale<ehp> e = sx.a("patch_pumpkin");
   public static final ale<ehp> f = sx.a("patch_grass_plain");
   public static final ale<ehp> g = sx.a("patch_grass_forest");
   public static final ale<ehp> h = sx.a("patch_grass_badlands");
   public static final ale<ehp> i = sx.a("patch_grass_savanna");
   public static final ale<ehp> j = sx.a("patch_grass_normal");
   public static final ale<ehp> k = sx.a("patch_grass_taiga_2");
   public static final ale<ehp> l = sx.a("patch_grass_taiga");
   public static final ale<ehp> m = sx.a("patch_grass_jungle");
   public static final ale<ehp> n = sx.a("grass_bonemeal");
   public static final ale<ehp> o = sx.a("patch_dead_bush_2");
   public static final ale<ehp> p = sx.a("patch_dead_bush");
   public static final ale<ehp> q = sx.a("patch_dead_bush_badlands");
   public static final ale<ehp> r = sx.a("patch_melon");
   public static final ale<ehp> s = sx.a("patch_melon_sparse");
   public static final ale<ehp> t = sx.a("patch_berry_common");
   public static final ale<ehp> u = sx.a("patch_berry_rare");
   public static final ale<ehp> v = sx.a("patch_waterlily");
   public static final ale<ehp> w = sx.a("patch_tall_grass_2");
   public static final ale<ehp> x = sx.a("patch_tall_grass");
   public static final ale<ehp> y = sx.a("patch_large_fern");
   public static final ale<ehp> z = sx.a("patch_cactus_desert");
   public static final ale<ehp> A = sx.a("patch_cactus_decorated");
   public static final ale<ehp> B = sx.a("patch_sugar_cane_swamp");
   public static final ale<ehp> C = sx.a("patch_sugar_cane_desert");
   public static final ale<ehp> D = sx.a("patch_sugar_cane_badlands");
   public static final ale<ehp> E = sx.a("patch_sugar_cane");
   public static final ale<ehp> F = sx.a("brown_mushroom_nether");
   public static final ale<ehp> G = sx.a("red_mushroom_nether");
   public static final ale<ehp> H = sx.a("brown_mushroom_normal");
   public static final ale<ehp> I = sx.a("red_mushroom_normal");
   public static final ale<ehp> J = sx.a("brown_mushroom_taiga");
   public static final ale<ehp> K = sx.a("red_mushroom_taiga");
   public static final ale<ehp> L = sx.a("brown_mushroom_old_growth");
   public static final ale<ehp> M = sx.a("red_mushroom_old_growth");
   public static final ale<ehp> N = sx.a("brown_mushroom_swamp");
   public static final ale<ehp> O = sx.a("red_mushroom_swamp");
   public static final ale<ehp> P = sx.a("flower_warm");
   public static final ale<ehp> Q = sx.a("flower_default");
   public static final ale<ehp> R = sx.a("flower_flower_forest");
   public static final ale<ehp> S = sx.a("flower_swamp");
   public static final ale<ehp> T = sx.a("flower_plains");
   public static final ale<ehp> U = sx.a("flower_meadow");
   public static final ale<ehp> V = sx.a("flower_cherry");
   public static final ale<ehp> W = sx.a("trees_plains");
   public static final ale<ehp> X = sx.a("dark_forest_vegetation");
   public static final ale<ehp> Y = sx.a("flower_forest_flowers");
   public static final ale<ehp> Z = sx.a("forest_flowers");
   public static final ale<ehp> aa = sx.a("trees_flower_forest");
   public static final ale<ehp> ab = sx.a("trees_meadow");
   public static final ale<ehp> ac = sx.a("trees_cherry");
   public static final ale<ehp> ad = sx.a("trees_taiga");
   public static final ale<ehp> ae = sx.a("trees_grove");
   public static final ale<ehp> af = sx.a("trees_badlands");
   public static final ale<ehp> ag = sx.a("trees_snowy");
   public static final ale<ehp> ah = sx.a("trees_swamp");
   public static final ale<ehp> ai = sx.a("trees_windswept_savanna");
   public static final ale<ehp> aj = sx.a("trees_savanna");
   public static final ale<ehp> ak = sx.a("birch_tall");
   public static final ale<ehp> al = sx.a("trees_birch");
   public static final ale<ehp> am = sx.a("trees_windswept_forest");
   public static final ale<ehp> an = sx.a("trees_windswept_hills");
   public static final ale<ehp> ao = sx.a("trees_water");
   public static final ale<ehp> ap = sx.a("trees_birch_and_oak");
   public static final ale<ehp> aq = sx.a("trees_sparse_jungle");
   public static final ale<ehp> ar = sx.a("trees_old_growth_spruce_taiga");
   public static final ale<ehp> as = sx.a("trees_old_growth_pine_taiga");
   public static final ale<ehp> at = sx.a("trees_jungle");
   public static final ale<ehp> au = sx.a("bamboo_vegetation");
   public static final ale<ehp> av = sx.a("mushroom_island_vegetation");
   public static final ale<ehp> aw = sx.a("trees_mangrove");
   private static final ehs ax = ehy.a(0);

   public static List<ehs> a(int $$0) {
      return List.of(ehi.a($$0), ehm.a(), sx.c, ehd.a());
   }

   private static List<ehs> a(int $$0, @Nullable ehs $$1) {
      Builder<ehs> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ehv.a($$0));
      }

      $$2.add(ehm.a());
      $$2.add(sx.a);
      $$2.add(ehd.a());
      return $$2.build();
   }

   private static Builder<ehs> b(ehs $$0) {
      return ImmutableList.builder().add($$0).add(ehm.a()).add(ax).add(sx.d).add(ehd.a());
   }

   public static List<ehs> a(ehs $$0) {
      return b($$0).build();
   }

   public static List<ehs> a(ehs $$0, dfa $$1) {
      return b($$0).add(ehe.a(dzc.a($$1.o(), iz.c))).build();
   }

   public static void a(rc<ehp> $$0) {
      jj<eam<?, ?>> $$1 = $$0.a(lq.aC);
      ji<eam<?, ?>> $$2 = $$1.b(so.a);
      ji<eam<?, ?>> $$3 = $$1.b(so.b);
      ji<eam<?, ?>> $$4 = $$1.b(so.c);
      ji<eam<?, ?>> $$5 = $$1.b(so.f);
      ji<eam<?, ?>> $$6 = $$1.b(so.g);
      ji<eam<?, ?>> $$7 = $$1.b(so.j);
      ji<eam<?, ?>> $$8 = $$1.b(so.i);
      ji<eam<?, ?>> $$9 = $$1.b(so.k);
      ji<eam<?, ?>> $$10 = $$1.b(so.l);
      ji<eam<?, ?>> $$11 = $$1.b(so.m);
      ji<eam<?, ?>> $$12 = $$1.b(so.n);
      ji<eam<?, ?>> $$13 = $$1.b(so.h);
      ji<eam<?, ?>> $$14 = $$1.b(so.o);
      ji<eam<?, ?>> $$15 = $$1.b(so.p);
      ji<eam<?, ?>> $$16 = $$1.b(so.q);
      ji<eam<?, ?>> $$17 = $$1.b(so.r);
      ji<eam<?, ?>> $$18 = $$1.b(so.s);
      ji<eam<?, ?>> $$19 = $$1.b(so.d);
      ji<eam<?, ?>> $$20 = $$1.b(so.e);
      ji<eam<?, ?>> $$21 = $$1.b(so.t);
      ji<eam<?, ?>> $$22 = $$1.b(so.u);
      ji<eam<?, ?>> $$23 = $$1.b(so.v);
      ji<eam<?, ?>> $$24 = $$1.b(so.w);
      ji<eam<?, ?>> $$25 = $$1.b(so.x);
      ji<eam<?, ?>> $$26 = $$1.b(so.y);
      ji<eam<?, ?>> $$27 = $$1.b(so.K);
      ji<eam<?, ?>> $$28 = $$1.b(so.A);
      ji<eam<?, ?>> $$29 = $$1.b(so.z);
      ji<eam<?, ?>> $$30 = $$1.b(so.B);
      ji<eam<?, ?>> $$31 = $$1.b(so.C);
      ji<eam<?, ?>> $$32 = $$1.b(so.D);
      ji<eam<?, ?>> $$33 = $$1.b(so.E);
      ji<eam<?, ?>> $$34 = $$1.b(sn.g);
      ji<eam<?, ?>> $$35 = $$1.b(sn.k);
      ji<eam<?, ?>> $$36 = $$1.b(sn.K);
      ji<eam<?, ?>> $$37 = $$1.b(sn.u);
      ji<eam<?, ?>> $$38 = $$1.b(so.F);
      ji<eam<?, ?>> $$39 = $$1.b(so.G);
      ji<eam<?, ?>> $$40 = $$1.b(sn.D);
      ji<eam<?, ?>> $$41 = $$1.b(so.H);
      ji<eam<?, ?>> $$42 = $$1.b(so.I);
      ji<eam<?, ?>> $$43 = $$1.b(so.J);
      ji<eam<?, ?>> $$44 = $$1.b(so.L);
      ji<eam<?, ?>> $$45 = $$1.b(so.M);
      ji<eam<?, ?>> $$46 = $$1.b(so.N);
      ji<eam<?, ?>> $$47 = $$1.b(so.O);
      ji<eam<?, ?>> $$48 = $$1.b(so.P);
      ji<eam<?, ?>> $$49 = $$1.b(so.Q);
      ji<eam<?, ?>> $$50 = $$1.b(so.R);
      sx.a($$0, a, $$2, ehv.a(4), ehm.a(), sx.a, ehd.a());
      sx.a($$0, b, $$3, ehn.a(160, 80.0, 0.3), ehm.a(), sx.c, ehd.a());
      sx.a($$0, c, $$4, ehi.a(127), ehm.a(), ehk.a(dyp.a(64), dyp.a(100)), ehd.a());
      sx.a($$0, d, $$5, ehv.a(3), ehm.a(), sx.a, ehd.a());
      sx.a($$0, e, $$6, ehv.a(300), ehm.a(), sx.a, ehd.a());
      sx.a($$0, f, $$7, eho.a(-0.8, 5, 10), ehm.a(), sx.c, ehd.a());
      sx.a($$0, g, $$7, a(2));
      sx.a($$0, h, $$7, ehm.a(), sx.c, ehd.a());
      sx.a($$0, i, $$7, a(20));
      sx.a($$0, j, $$7, a(5));
      sx.a($$0, k, $$8, ehm.a(), sx.c, ehd.a());
      sx.a($$0, l, $$8, a(7));
      sx.a($$0, m, $$9, a(25));
      sx.a($$0, n, $$10, sx.a());
      sx.a($$0, o, $$11, a(2));
      sx.a($$0, p, $$11, ehm.a(), sx.c, ehd.a());
      sx.a($$0, q, $$11, a(20));
      sx.a($$0, r, $$12, ehv.a(6), ehm.a(), sx.a, ehd.a());
      sx.a($$0, s, $$12, ehv.a(64), ehm.a(), sx.a, ehd.a());
      sx.a($$0, t, $$13, ehv.a(32), ehm.a(), sx.c, ehd.a());
      sx.a($$0, u, $$13, ehv.a(384), ehm.a(), sx.c, ehd.a());
      sx.a($$0, v, $$14, a(4));
      sx.a($$0, w, $$15, eho.a(-0.8, 0, 7), ehv.a(32), ehm.a(), sx.a, ehd.a());
      sx.a($$0, x, $$15, ehv.a(5), ehm.a(), sx.a, ehd.a());
      sx.a($$0, y, $$16, ehv.a(5), ehm.a(), sx.a, ehd.a());
      sx.a($$0, z, $$17, ehv.a(6), ehm.a(), sx.a, ehd.a());
      sx.a($$0, A, $$17, ehv.a(13), ehm.a(), sx.a, ehd.a());
      sx.a($$0, B, $$18, ehv.a(3), ehm.a(), sx.a, ehd.a());
      sx.a($$0, C, $$18, ehm.a(), sx.a, ehd.a());
      sx.a($$0, D, $$18, ehv.a(5), ehm.a(), sx.a, ehd.a());
      sx.a($$0, E, $$18, ehv.a(6), ehm.a(), sx.a, ehd.a());
      sx.a($$0, F, $$19, ehv.a(2), ehm.a(), sx.e, ehd.a());
      sx.a($$0, G, $$20, ehv.a(2), ehm.a(), sx.e, ehd.a());
      sx.a($$0, H, $$19, a(256, null));
      sx.a($$0, I, $$20, a(512, null));
      sx.a($$0, J, $$19, a(4, null));
      sx.a($$0, K, $$20, a(256, null));
      sx.a($$0, L, $$19, a(4, ehi.a(3)));
      sx.a($$0, M, $$20, a(171, null));
      sx.a($$0, N, $$19, a(0, ehi.a(2)));
      sx.a($$0, O, $$20, a(64, null));
      sx.a($$0, P, $$21, ehv.a(16), ehm.a(), sx.a, ehd.a());
      sx.a($$0, Q, $$21, ehv.a(32), ehm.a(), sx.a, ehd.a());
      sx.a($$0, R, $$22, ehi.a(3), ehv.a(2), ehm.a(), sx.a, ehd.a());
      sx.a($$0, S, $$23, ehv.a(32), ehm.a(), sx.a, ehd.a());
      sx.a($$0, T, $$24, eho.a(-0.8, 15, 4), ehv.a(32), ehm.a(), sx.a, ehd.a());
      sx.a($$0, V, $$26, eho.a(-0.8, 5, 10), ehm.a(), sx.a, ehd.a());
      sx.a($$0, U, $$25, ehm.a(), sx.a, ehd.a());
      ehs $$51 = ehy.a(0);
      sx.a($$0, W, $$27, sx.a(0, 0.05F, 1), ehm.a(), $$51, sx.d, ehe.a(dzc.a(dfc.x.o(), iz.c)), ehd.a());
      sx.a($$0, X, $$28, ehi.a(16), ehm.a(), $$51, sx.d, ehd.a());
      sx.a($$0, Y, $$29, ehv.a(7), ehm.a(), sx.a, ehi.a(bpt.a(bqg.a(-1, 3), 0, 3)), ehd.a());
      sx.a($$0, Z, $$29, ehv.a(7), ehm.a(), sx.a, ehi.a(bpt.a(bqg.a(-3, 1), 0, 1)), ehd.a());
      sx.a($$0, aa, $$30, a(sx.a(6, 0.1F, 1)));
      sx.a($$0, ab, $$31, a(ehv.a(100)));
      sx.a($$0, ac, $$36, a(sx.a(10, 0.1F, 1), dfc.C));
      sx.a($$0, ad, $$32, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, ae, $$33, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, af, $$34, a(sx.a(5, 0.1F, 1), dfc.x));
      sx.a($$0, ag, $$35, a(sx.a(0, 0.1F, 1), dfc.y));
      sx.a($$0, ah, $$37, sx.a(2, 0.1F, 1), ehm.a(), ehy.a(2), sx.d, ehd.a(), ehe.a(dzc.a(dfc.x.o(), iz.c)));
      sx.a($$0, ai, $$38, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, aj, $$38, a(sx.a(1, 0.1F, 1)));
      sx.a($$0, ak, $$39, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, al, $$40, a(sx.a(10, 0.1F, 1), dfc.z));
      sx.a($$0, am, $$41, a(sx.a(3, 0.1F, 1)));
      sx.a($$0, an, $$41, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ao, $$42, a(sx.a(0, 0.1F, 1)));
      sx.a($$0, ap, $$43, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, aq, $$44, a(sx.a(2, 0.1F, 1)));
      sx.a($$0, ar, $$45, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, as, $$46, a(sx.a(10, 0.1F, 1)));
      sx.a($$0, at, $$47, a(sx.a(50, 0.1F, 1)));
      sx.a($$0, au, $$48, a(sx.a(30, 0.1F, 1)));
      sx.a($$0, av, $$49, ehm.a(), sx.a, ehd.a());
      sx.a($$0, aw, $$50, ehi.a(25), ehm.a(), ehy.a(5), sx.d, ehd.a(), ehe.a(dzc.a(dfc.E.o(), iz.c)));
   }
}
