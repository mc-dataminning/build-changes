import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sk {
   public static final akm<egp> a = si.a("bamboo_light");
   public static final akm<egp> b = si.a("bamboo");
   public static final akm<egp> c = si.a("vines");
   public static final akm<egp> d = si.a("patch_sunflower");
   public static final akm<egp> e = si.a("patch_pumpkin");
   public static final akm<egp> f = si.a("patch_grass_plain");
   public static final akm<egp> g = si.a("patch_grass_forest");
   public static final akm<egp> h = si.a("patch_grass_badlands");
   public static final akm<egp> i = si.a("patch_grass_savanna");
   public static final akm<egp> j = si.a("patch_grass_normal");
   public static final akm<egp> k = si.a("patch_grass_taiga_2");
   public static final akm<egp> l = si.a("patch_grass_taiga");
   public static final akm<egp> m = si.a("patch_grass_jungle");
   public static final akm<egp> n = si.a("grass_bonemeal");
   public static final akm<egp> o = si.a("patch_dead_bush_2");
   public static final akm<egp> p = si.a("patch_dead_bush");
   public static final akm<egp> q = si.a("patch_dead_bush_badlands");
   public static final akm<egp> r = si.a("patch_melon");
   public static final akm<egp> s = si.a("patch_melon_sparse");
   public static final akm<egp> t = si.a("patch_berry_common");
   public static final akm<egp> u = si.a("patch_berry_rare");
   public static final akm<egp> v = si.a("patch_waterlily");
   public static final akm<egp> w = si.a("patch_tall_grass_2");
   public static final akm<egp> x = si.a("patch_tall_grass");
   public static final akm<egp> y = si.a("patch_large_fern");
   public static final akm<egp> z = si.a("patch_cactus_desert");
   public static final akm<egp> A = si.a("patch_cactus_decorated");
   public static final akm<egp> B = si.a("patch_sugar_cane_swamp");
   public static final akm<egp> C = si.a("patch_sugar_cane_desert");
   public static final akm<egp> D = si.a("patch_sugar_cane_badlands");
   public static final akm<egp> E = si.a("patch_sugar_cane");
   public static final akm<egp> F = si.a("brown_mushroom_nether");
   public static final akm<egp> G = si.a("red_mushroom_nether");
   public static final akm<egp> H = si.a("brown_mushroom_normal");
   public static final akm<egp> I = si.a("red_mushroom_normal");
   public static final akm<egp> J = si.a("brown_mushroom_taiga");
   public static final akm<egp> K = si.a("red_mushroom_taiga");
   public static final akm<egp> L = si.a("brown_mushroom_old_growth");
   public static final akm<egp> M = si.a("red_mushroom_old_growth");
   public static final akm<egp> N = si.a("brown_mushroom_swamp");
   public static final akm<egp> O = si.a("red_mushroom_swamp");
   public static final akm<egp> P = si.a("flower_warm");
   public static final akm<egp> Q = si.a("flower_default");
   public static final akm<egp> R = si.a("flower_flower_forest");
   public static final akm<egp> S = si.a("flower_swamp");
   public static final akm<egp> T = si.a("flower_plains");
   public static final akm<egp> U = si.a("flower_meadow");
   public static final akm<egp> V = si.a("flower_cherry");
   public static final akm<egp> W = si.a("trees_plains");
   public static final akm<egp> X = si.a("dark_forest_vegetation");
   public static final akm<egp> Y = si.a("flower_forest_flowers");
   public static final akm<egp> Z = si.a("forest_flowers");
   public static final akm<egp> aa = si.a("trees_flower_forest");
   public static final akm<egp> ab = si.a("trees_meadow");
   public static final akm<egp> ac = si.a("trees_cherry");
   public static final akm<egp> ad = si.a("trees_taiga");
   public static final akm<egp> ae = si.a("trees_grove");
   public static final akm<egp> af = si.a("trees_badlands");
   public static final akm<egp> ag = si.a("trees_snowy");
   public static final akm<egp> ah = si.a("trees_swamp");
   public static final akm<egp> ai = si.a("trees_windswept_savanna");
   public static final akm<egp> aj = si.a("trees_savanna");
   public static final akm<egp> ak = si.a("birch_tall");
   public static final akm<egp> al = si.a("trees_birch");
   public static final akm<egp> am = si.a("trees_windswept_forest");
   public static final akm<egp> an = si.a("trees_windswept_hills");
   public static final akm<egp> ao = si.a("trees_water");
   public static final akm<egp> ap = si.a("trees_birch_and_oak");
   public static final akm<egp> aq = si.a("trees_sparse_jungle");
   public static final akm<egp> ar = si.a("trees_old_growth_spruce_taiga");
   public static final akm<egp> as = si.a("trees_old_growth_pine_taiga");
   public static final akm<egp> at = si.a("trees_jungle");
   public static final akm<egp> au = si.a("bamboo_vegetation");
   public static final akm<egp> av = si.a("mushroom_island_vegetation");
   public static final akm<egp> aw = si.a("trees_mangrove");
   private static final egs ax = egy.a(0);

   public static List<egs> a(int $$0) {
      return List.of(egi.a($$0), egm.a(), si.c, egd.a());
   }

   private static List<egs> a(int $$0, @Nullable egs $$1) {
      Builder<egs> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(egv.a($$0));
      }

      $$2.add(egm.a());
      $$2.add(si.a);
      $$2.add(egd.a());
      return $$2.build();
   }

   private static Builder<egs> b(egs $$0) {
      return ImmutableList.builder().add($$0).add(egm.a()).add(ax).add(si.d).add(egd.a());
   }

   public static List<egs> a(egs $$0) {
      return b($$0).build();
   }

   public static List<egs> a(egs $$0, dea $$1) {
      return b($$0).add(ege.a(dyc.a($$1.n(), io.c))).build();
   }

   public static void a(qo<egp> $$0) {
      iy<dzm<?, ?>> $$1 = $$0.a(lf.aC);
      ix<dzm<?, ?>> $$2 = $$1.b(rz.a);
      ix<dzm<?, ?>> $$3 = $$1.b(rz.b);
      ix<dzm<?, ?>> $$4 = $$1.b(rz.c);
      ix<dzm<?, ?>> $$5 = $$1.b(rz.f);
      ix<dzm<?, ?>> $$6 = $$1.b(rz.g);
      ix<dzm<?, ?>> $$7 = $$1.b(rz.j);
      ix<dzm<?, ?>> $$8 = $$1.b(rz.i);
      ix<dzm<?, ?>> $$9 = $$1.b(rz.k);
      ix<dzm<?, ?>> $$10 = $$1.b(rz.l);
      ix<dzm<?, ?>> $$11 = $$1.b(rz.m);
      ix<dzm<?, ?>> $$12 = $$1.b(rz.n);
      ix<dzm<?, ?>> $$13 = $$1.b(rz.h);
      ix<dzm<?, ?>> $$14 = $$1.b(rz.o);
      ix<dzm<?, ?>> $$15 = $$1.b(rz.p);
      ix<dzm<?, ?>> $$16 = $$1.b(rz.q);
      ix<dzm<?, ?>> $$17 = $$1.b(rz.r);
      ix<dzm<?, ?>> $$18 = $$1.b(rz.s);
      ix<dzm<?, ?>> $$19 = $$1.b(rz.d);
      ix<dzm<?, ?>> $$20 = $$1.b(rz.e);
      ix<dzm<?, ?>> $$21 = $$1.b(rz.t);
      ix<dzm<?, ?>> $$22 = $$1.b(rz.u);
      ix<dzm<?, ?>> $$23 = $$1.b(rz.v);
      ix<dzm<?, ?>> $$24 = $$1.b(rz.w);
      ix<dzm<?, ?>> $$25 = $$1.b(rz.x);
      ix<dzm<?, ?>> $$26 = $$1.b(rz.y);
      ix<dzm<?, ?>> $$27 = $$1.b(rz.K);
      ix<dzm<?, ?>> $$28 = $$1.b(rz.A);
      ix<dzm<?, ?>> $$29 = $$1.b(rz.z);
      ix<dzm<?, ?>> $$30 = $$1.b(rz.B);
      ix<dzm<?, ?>> $$31 = $$1.b(rz.C);
      ix<dzm<?, ?>> $$32 = $$1.b(rz.D);
      ix<dzm<?, ?>> $$33 = $$1.b(rz.E);
      ix<dzm<?, ?>> $$34 = $$1.b(ry.g);
      ix<dzm<?, ?>> $$35 = $$1.b(ry.k);
      ix<dzm<?, ?>> $$36 = $$1.b(ry.K);
      ix<dzm<?, ?>> $$37 = $$1.b(ry.u);
      ix<dzm<?, ?>> $$38 = $$1.b(rz.F);
      ix<dzm<?, ?>> $$39 = $$1.b(rz.G);
      ix<dzm<?, ?>> $$40 = $$1.b(ry.D);
      ix<dzm<?, ?>> $$41 = $$1.b(rz.H);
      ix<dzm<?, ?>> $$42 = $$1.b(rz.I);
      ix<dzm<?, ?>> $$43 = $$1.b(rz.J);
      ix<dzm<?, ?>> $$44 = $$1.b(rz.L);
      ix<dzm<?, ?>> $$45 = $$1.b(rz.M);
      ix<dzm<?, ?>> $$46 = $$1.b(rz.N);
      ix<dzm<?, ?>> $$47 = $$1.b(rz.O);
      ix<dzm<?, ?>> $$48 = $$1.b(rz.P);
      ix<dzm<?, ?>> $$49 = $$1.b(rz.Q);
      ix<dzm<?, ?>> $$50 = $$1.b(rz.R);
      si.a($$0, a, $$2, egv.a(4), egm.a(), si.a, egd.a());
      si.a($$0, b, $$3, egn.a(160, 80.0, 0.3), egm.a(), si.c, egd.a());
      si.a($$0, c, $$4, egi.a(127), egm.a(), egk.a(dxp.a(64), dxp.a(100)), egd.a());
      si.a($$0, d, $$5, egv.a(3), egm.a(), si.a, egd.a());
      si.a($$0, e, $$6, egv.a(300), egm.a(), si.a, egd.a());
      si.a($$0, f, $$7, ego.a(-0.8, 5, 10), egm.a(), si.c, egd.a());
      si.a($$0, g, $$7, a(2));
      si.a($$0, h, $$7, egm.a(), si.c, egd.a());
      si.a($$0, i, $$7, a(20));
      si.a($$0, j, $$7, a(5));
      si.a($$0, k, $$8, egm.a(), si.c, egd.a());
      si.a($$0, l, $$8, a(7));
      si.a($$0, m, $$9, a(25));
      si.a($$0, n, $$10, si.a());
      si.a($$0, o, $$11, a(2));
      si.a($$0, p, $$11, egm.a(), si.c, egd.a());
      si.a($$0, q, $$11, a(20));
      si.a($$0, r, $$12, egv.a(6), egm.a(), si.a, egd.a());
      si.a($$0, s, $$12, egv.a(64), egm.a(), si.a, egd.a());
      si.a($$0, t, $$13, egv.a(32), egm.a(), si.c, egd.a());
      si.a($$0, u, $$13, egv.a(384), egm.a(), si.c, egd.a());
      si.a($$0, v, $$14, a(4));
      si.a($$0, w, $$15, ego.a(-0.8, 0, 7), egv.a(32), egm.a(), si.a, egd.a());
      si.a($$0, x, $$15, egv.a(5), egm.a(), si.a, egd.a());
      si.a($$0, y, $$16, egv.a(5), egm.a(), si.a, egd.a());
      si.a($$0, z, $$17, egv.a(6), egm.a(), si.a, egd.a());
      si.a($$0, A, $$17, egv.a(13), egm.a(), si.a, egd.a());
      si.a($$0, B, $$18, egv.a(3), egm.a(), si.a, egd.a());
      si.a($$0, C, $$18, egm.a(), si.a, egd.a());
      si.a($$0, D, $$18, egv.a(5), egm.a(), si.a, egd.a());
      si.a($$0, E, $$18, egv.a(6), egm.a(), si.a, egd.a());
      si.a($$0, F, $$19, egv.a(2), egm.a(), si.e, egd.a());
      si.a($$0, G, $$20, egv.a(2), egm.a(), si.e, egd.a());
      si.a($$0, H, $$19, a(256, null));
      si.a($$0, I, $$20, a(512, null));
      si.a($$0, J, $$19, a(4, null));
      si.a($$0, K, $$20, a(256, null));
      si.a($$0, L, $$19, a(4, egi.a(3)));
      si.a($$0, M, $$20, a(171, null));
      si.a($$0, N, $$19, a(0, egi.a(2)));
      si.a($$0, O, $$20, a(64, null));
      si.a($$0, P, $$21, egv.a(16), egm.a(), si.a, egd.a());
      si.a($$0, Q, $$21, egv.a(32), egm.a(), si.a, egd.a());
      si.a($$0, R, $$22, egi.a(3), egv.a(2), egm.a(), si.a, egd.a());
      si.a($$0, S, $$23, egv.a(32), egm.a(), si.a, egd.a());
      si.a($$0, T, $$24, ego.a(-0.8, 15, 4), egv.a(32), egm.a(), si.a, egd.a());
      si.a($$0, V, $$26, ego.a(-0.8, 5, 10), egm.a(), si.a, egd.a());
      si.a($$0, U, $$25, egm.a(), si.a, egd.a());
      egs $$51 = egy.a(0);
      si.a($$0, W, $$27, si.a(0, 0.05F, 1), egm.a(), $$51, si.d, ege.a(dyc.a(dec.x.n(), io.c)), egd.a());
      si.a($$0, X, $$28, egi.a(16), egm.a(), $$51, si.d, egd.a());
      si.a($$0, Y, $$29, egv.a(7), egm.a(), si.a, egi.a(bou.a(bph.a(-1, 3), 0, 3)), egd.a());
      si.a($$0, Z, $$29, egv.a(7), egm.a(), si.a, egi.a(bou.a(bph.a(-3, 1), 0, 1)), egd.a());
      si.a($$0, aa, $$30, a(si.a(6, 0.1F, 1)));
      si.a($$0, ab, $$31, a(egv.a(100)));
      si.a($$0, ac, $$36, a(si.a(10, 0.1F, 1), dec.C));
      si.a($$0, ad, $$32, a(si.a(10, 0.1F, 1)));
      si.a($$0, ae, $$33, a(si.a(10, 0.1F, 1)));
      si.a($$0, af, $$34, a(si.a(5, 0.1F, 1), dec.x));
      si.a($$0, ag, $$35, a(si.a(0, 0.1F, 1), dec.y));
      si.a($$0, ah, $$37, si.a(2, 0.1F, 1), egm.a(), egy.a(2), si.d, egd.a(), ege.a(dyc.a(dec.x.n(), io.c)));
      si.a($$0, ai, $$38, a(si.a(2, 0.1F, 1)));
      si.a($$0, aj, $$38, a(si.a(1, 0.1F, 1)));
      si.a($$0, ak, $$39, a(si.a(10, 0.1F, 1)));
      si.a($$0, al, $$40, a(si.a(10, 0.1F, 1), dec.z));
      si.a($$0, am, $$41, a(si.a(3, 0.1F, 1)));
      si.a($$0, an, $$41, a(si.a(0, 0.1F, 1)));
      si.a($$0, ao, $$42, a(si.a(0, 0.1F, 1)));
      si.a($$0, ap, $$43, a(si.a(10, 0.1F, 1)));
      si.a($$0, aq, $$44, a(si.a(2, 0.1F, 1)));
      si.a($$0, ar, $$45, a(si.a(10, 0.1F, 1)));
      si.a($$0, as, $$46, a(si.a(10, 0.1F, 1)));
      si.a($$0, at, $$47, a(si.a(50, 0.1F, 1)));
      si.a($$0, au, $$48, a(si.a(30, 0.1F, 1)));
      si.a($$0, av, $$49, egm.a(), si.a, egd.a());
      si.a($$0, aw, $$50, egi.a(25), egm.a(), egy.a(5), si.d, egd.a(), ege.a(dyc.a(dec.E.n(), io.c)));
   }
}
