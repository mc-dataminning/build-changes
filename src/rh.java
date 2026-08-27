import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rh {
   public static final ajg<eci> a = rf.a("bamboo_light");
   public static final ajg<eci> b = rf.a("bamboo");
   public static final ajg<eci> c = rf.a("vines");
   public static final ajg<eci> d = rf.a("patch_sunflower");
   public static final ajg<eci> e = rf.a("patch_pumpkin");
   public static final ajg<eci> f = rf.a("patch_grass_plain");
   public static final ajg<eci> g = rf.a("patch_grass_forest");
   public static final ajg<eci> h = rf.a("patch_grass_badlands");
   public static final ajg<eci> i = rf.a("patch_grass_savanna");
   public static final ajg<eci> j = rf.a("patch_grass_normal");
   public static final ajg<eci> k = rf.a("patch_grass_taiga_2");
   public static final ajg<eci> l = rf.a("patch_grass_taiga");
   public static final ajg<eci> m = rf.a("patch_grass_jungle");
   public static final ajg<eci> n = rf.a("grass_bonemeal");
   public static final ajg<eci> o = rf.a("patch_dead_bush_2");
   public static final ajg<eci> p = rf.a("patch_dead_bush");
   public static final ajg<eci> q = rf.a("patch_dead_bush_badlands");
   public static final ajg<eci> r = rf.a("patch_melon");
   public static final ajg<eci> s = rf.a("patch_melon_sparse");
   public static final ajg<eci> t = rf.a("patch_berry_common");
   public static final ajg<eci> u = rf.a("patch_berry_rare");
   public static final ajg<eci> v = rf.a("patch_waterlily");
   public static final ajg<eci> w = rf.a("patch_tall_grass_2");
   public static final ajg<eci> x = rf.a("patch_tall_grass");
   public static final ajg<eci> y = rf.a("patch_large_fern");
   public static final ajg<eci> z = rf.a("patch_cactus_desert");
   public static final ajg<eci> A = rf.a("patch_cactus_decorated");
   public static final ajg<eci> B = rf.a("patch_sugar_cane_swamp");
   public static final ajg<eci> C = rf.a("patch_sugar_cane_desert");
   public static final ajg<eci> D = rf.a("patch_sugar_cane_badlands");
   public static final ajg<eci> E = rf.a("patch_sugar_cane");
   public static final ajg<eci> F = rf.a("brown_mushroom_nether");
   public static final ajg<eci> G = rf.a("red_mushroom_nether");
   public static final ajg<eci> H = rf.a("brown_mushroom_normal");
   public static final ajg<eci> I = rf.a("red_mushroom_normal");
   public static final ajg<eci> J = rf.a("brown_mushroom_taiga");
   public static final ajg<eci> K = rf.a("red_mushroom_taiga");
   public static final ajg<eci> L = rf.a("brown_mushroom_old_growth");
   public static final ajg<eci> M = rf.a("red_mushroom_old_growth");
   public static final ajg<eci> N = rf.a("brown_mushroom_swamp");
   public static final ajg<eci> O = rf.a("red_mushroom_swamp");
   public static final ajg<eci> P = rf.a("flower_warm");
   public static final ajg<eci> Q = rf.a("flower_default");
   public static final ajg<eci> R = rf.a("flower_flower_forest");
   public static final ajg<eci> S = rf.a("flower_swamp");
   public static final ajg<eci> T = rf.a("flower_plains");
   public static final ajg<eci> U = rf.a("flower_meadow");
   public static final ajg<eci> V = rf.a("flower_cherry");
   public static final ajg<eci> W = rf.a("trees_plains");
   public static final ajg<eci> X = rf.a("dark_forest_vegetation");
   public static final ajg<eci> Y = rf.a("flower_forest_flowers");
   public static final ajg<eci> Z = rf.a("forest_flowers");
   public static final ajg<eci> aa = rf.a("trees_flower_forest");
   public static final ajg<eci> ab = rf.a("trees_meadow");
   public static final ajg<eci> ac = rf.a("trees_cherry");
   public static final ajg<eci> ad = rf.a("trees_taiga");
   public static final ajg<eci> ae = rf.a("trees_grove");
   public static final ajg<eci> af = rf.a("trees_badlands");
   public static final ajg<eci> ag = rf.a("trees_snowy");
   public static final ajg<eci> ah = rf.a("trees_swamp");
   public static final ajg<eci> ai = rf.a("trees_windswept_savanna");
   public static final ajg<eci> aj = rf.a("trees_savanna");
   public static final ajg<eci> ak = rf.a("birch_tall");
   public static final ajg<eci> al = rf.a("trees_birch");
   public static final ajg<eci> am = rf.a("trees_windswept_forest");
   public static final ajg<eci> an = rf.a("trees_windswept_hills");
   public static final ajg<eci> ao = rf.a("trees_water");
   public static final ajg<eci> ap = rf.a("trees_birch_and_oak");
   public static final ajg<eci> aq = rf.a("trees_sparse_jungle");
   public static final ajg<eci> ar = rf.a("trees_old_growth_spruce_taiga");
   public static final ajg<eci> as = rf.a("trees_old_growth_pine_taiga");
   public static final ajg<eci> at = rf.a("trees_jungle");
   public static final ajg<eci> au = rf.a("bamboo_vegetation");
   public static final ajg<eci> av = rf.a("mushroom_island_vegetation");
   public static final ajg<eci> aw = rf.a("trees_mangrove");
   private static final ecl ax = ecr.a(0);

   public static List<ecl> a(int $$0) {
      return List.of(ecb.a($$0), ecf.a(), rf.c, ebw.a());
   }

   private static List<ecl> a(int $$0, @Nullable ecl $$1) {
      Builder<ecl> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eco.a($$0));
      }

      $$2.add(ecf.a());
      $$2.add(rf.a);
      $$2.add(ebw.a());
      return $$2.build();
   }

   private static Builder<ecl> b(ecl $$0) {
      return ImmutableList.builder().add($$0).add(ecf.a()).add(ax).add(rf.d).add(ebw.a());
   }

   public static List<ecl> a(ecl $$0) {
      return b($$0).build();
   }

   public static List<ecl> a(ecl $$0, dac $$1) {
      return b($$0).add(ebx.a(dtv.a($$1.o(), ib.c))).build();
   }

   public static void a(pl<eci> $$0) {
      im<dvf<?, ?>> $$1 = $$0.a(kj.ax);
      il<dvf<?, ?>> $$2 = $$1.b(qw.a);
      il<dvf<?, ?>> $$3 = $$1.b(qw.b);
      il<dvf<?, ?>> $$4 = $$1.b(qw.c);
      il<dvf<?, ?>> $$5 = $$1.b(qw.f);
      il<dvf<?, ?>> $$6 = $$1.b(qw.g);
      il<dvf<?, ?>> $$7 = $$1.b(qw.j);
      il<dvf<?, ?>> $$8 = $$1.b(qw.i);
      il<dvf<?, ?>> $$9 = $$1.b(qw.k);
      il<dvf<?, ?>> $$10 = $$1.b(qw.l);
      il<dvf<?, ?>> $$11 = $$1.b(qw.m);
      il<dvf<?, ?>> $$12 = $$1.b(qw.n);
      il<dvf<?, ?>> $$13 = $$1.b(qw.h);
      il<dvf<?, ?>> $$14 = $$1.b(qw.o);
      il<dvf<?, ?>> $$15 = $$1.b(qw.p);
      il<dvf<?, ?>> $$16 = $$1.b(qw.q);
      il<dvf<?, ?>> $$17 = $$1.b(qw.r);
      il<dvf<?, ?>> $$18 = $$1.b(qw.s);
      il<dvf<?, ?>> $$19 = $$1.b(qw.d);
      il<dvf<?, ?>> $$20 = $$1.b(qw.e);
      il<dvf<?, ?>> $$21 = $$1.b(qw.t);
      il<dvf<?, ?>> $$22 = $$1.b(qw.u);
      il<dvf<?, ?>> $$23 = $$1.b(qw.v);
      il<dvf<?, ?>> $$24 = $$1.b(qw.w);
      il<dvf<?, ?>> $$25 = $$1.b(qw.x);
      il<dvf<?, ?>> $$26 = $$1.b(qw.y);
      il<dvf<?, ?>> $$27 = $$1.b(qw.K);
      il<dvf<?, ?>> $$28 = $$1.b(qw.A);
      il<dvf<?, ?>> $$29 = $$1.b(qw.z);
      il<dvf<?, ?>> $$30 = $$1.b(qw.B);
      il<dvf<?, ?>> $$31 = $$1.b(qw.C);
      il<dvf<?, ?>> $$32 = $$1.b(qw.D);
      il<dvf<?, ?>> $$33 = $$1.b(qw.E);
      il<dvf<?, ?>> $$34 = $$1.b(qv.g);
      il<dvf<?, ?>> $$35 = $$1.b(qv.k);
      il<dvf<?, ?>> $$36 = $$1.b(qv.K);
      il<dvf<?, ?>> $$37 = $$1.b(qv.u);
      il<dvf<?, ?>> $$38 = $$1.b(qw.F);
      il<dvf<?, ?>> $$39 = $$1.b(qw.G);
      il<dvf<?, ?>> $$40 = $$1.b(qv.D);
      il<dvf<?, ?>> $$41 = $$1.b(qw.H);
      il<dvf<?, ?>> $$42 = $$1.b(qw.I);
      il<dvf<?, ?>> $$43 = $$1.b(qw.J);
      il<dvf<?, ?>> $$44 = $$1.b(qw.L);
      il<dvf<?, ?>> $$45 = $$1.b(qw.M);
      il<dvf<?, ?>> $$46 = $$1.b(qw.N);
      il<dvf<?, ?>> $$47 = $$1.b(qw.O);
      il<dvf<?, ?>> $$48 = $$1.b(qw.P);
      il<dvf<?, ?>> $$49 = $$1.b(qw.Q);
      il<dvf<?, ?>> $$50 = $$1.b(qw.R);
      rf.a($$0, a, $$2, eco.a(4), ecf.a(), rf.a, ebw.a());
      rf.a($$0, b, $$3, ecg.a(160, 80.0, 0.3), ecf.a(), rf.c, ebw.a());
      rf.a($$0, c, $$4, ecb.a(127), ecf.a(), ecd.a(dti.a(64), dti.a(100)), ebw.a());
      rf.a($$0, d, $$5, eco.a(3), ecf.a(), rf.a, ebw.a());
      rf.a($$0, e, $$6, eco.a(300), ecf.a(), rf.a, ebw.a());
      rf.a($$0, f, $$7, ech.a(-0.8, 5, 10), ecf.a(), rf.c, ebw.a());
      rf.a($$0, g, $$7, a(2));
      rf.a($$0, h, $$7, ecf.a(), rf.c, ebw.a());
      rf.a($$0, i, $$7, a(20));
      rf.a($$0, j, $$7, a(5));
      rf.a($$0, k, $$8, ecf.a(), rf.c, ebw.a());
      rf.a($$0, l, $$8, a(7));
      rf.a($$0, m, $$9, a(25));
      rf.a($$0, n, $$10, rf.a());
      rf.a($$0, o, $$11, a(2));
      rf.a($$0, p, $$11, ecf.a(), rf.c, ebw.a());
      rf.a($$0, q, $$11, a(20));
      rf.a($$0, r, $$12, eco.a(6), ecf.a(), rf.a, ebw.a());
      rf.a($$0, s, $$12, eco.a(64), ecf.a(), rf.a, ebw.a());
      rf.a($$0, t, $$13, eco.a(32), ecf.a(), rf.c, ebw.a());
      rf.a($$0, u, $$13, eco.a(384), ecf.a(), rf.c, ebw.a());
      rf.a($$0, v, $$14, a(4));
      rf.a($$0, w, $$15, ech.a(-0.8, 0, 7), eco.a(32), ecf.a(), rf.a, ebw.a());
      rf.a($$0, x, $$15, eco.a(5), ecf.a(), rf.a, ebw.a());
      rf.a($$0, y, $$16, eco.a(5), ecf.a(), rf.a, ebw.a());
      rf.a($$0, z, $$17, eco.a(6), ecf.a(), rf.a, ebw.a());
      rf.a($$0, A, $$17, eco.a(13), ecf.a(), rf.a, ebw.a());
      rf.a($$0, B, $$18, eco.a(3), ecf.a(), rf.a, ebw.a());
      rf.a($$0, C, $$18, ecf.a(), rf.a, ebw.a());
      rf.a($$0, D, $$18, eco.a(5), ecf.a(), rf.a, ebw.a());
      rf.a($$0, E, $$18, eco.a(6), ecf.a(), rf.a, ebw.a());
      rf.a($$0, F, $$19, eco.a(2), ecf.a(), rf.e, ebw.a());
      rf.a($$0, G, $$20, eco.a(2), ecf.a(), rf.e, ebw.a());
      rf.a($$0, H, $$19, a(256, null));
      rf.a($$0, I, $$20, a(512, null));
      rf.a($$0, J, $$19, a(4, null));
      rf.a($$0, K, $$20, a(256, null));
      rf.a($$0, L, $$19, a(4, ecb.a(3)));
      rf.a($$0, M, $$20, a(171, null));
      rf.a($$0, N, $$19, a(0, ecb.a(2)));
      rf.a($$0, O, $$20, a(64, null));
      rf.a($$0, P, $$21, eco.a(16), ecf.a(), rf.a, ebw.a());
      rf.a($$0, Q, $$21, eco.a(32), ecf.a(), rf.a, ebw.a());
      rf.a($$0, R, $$22, ecb.a(3), eco.a(2), ecf.a(), rf.a, ebw.a());
      rf.a($$0, S, $$23, eco.a(32), ecf.a(), rf.a, ebw.a());
      rf.a($$0, T, $$24, ech.a(-0.8, 15, 4), eco.a(32), ecf.a(), rf.a, ebw.a());
      rf.a($$0, V, $$26, ech.a(-0.8, 5, 10), ecf.a(), rf.a, ebw.a());
      rf.a($$0, U, $$25, ecf.a(), rf.a, ebw.a());
      ecl $$51 = ecr.a(0);
      rf.a($$0, W, $$27, rf.a(0, 0.05F, 1), ecf.a(), $$51, rf.d, ebx.a(dtv.a(dae.x.o(), ib.c)), ebw.a());
      rf.a($$0, X, $$28, ecb.a(16), ecf.a(), $$51, rf.d, ebw.a());
      rf.a($$0, Y, $$29, eco.a(7), ecf.a(), rf.a, ecb.a(bmb.a(bmo.a(-1, 3), 0, 3)), ebw.a());
      rf.a($$0, Z, $$29, eco.a(7), ecf.a(), rf.a, ecb.a(bmb.a(bmo.a(-3, 1), 0, 1)), ebw.a());
      rf.a($$0, aa, $$30, a(rf.a(6, 0.1F, 1)));
      rf.a($$0, ab, $$31, a(eco.a(100)));
      rf.a($$0, ac, $$36, a(rf.a(10, 0.1F, 1), dae.C));
      rf.a($$0, ad, $$32, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, ae, $$33, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, af, $$34, a(rf.a(5, 0.1F, 1), dae.x));
      rf.a($$0, ag, $$35, a(rf.a(0, 0.1F, 1), dae.y));
      rf.a($$0, ah, $$37, rf.a(2, 0.1F, 1), ecf.a(), ecr.a(2), rf.d, ebw.a(), ebx.a(dtv.a(dae.x.o(), ib.c)));
      rf.a($$0, ai, $$38, a(rf.a(2, 0.1F, 1)));
      rf.a($$0, aj, $$38, a(rf.a(1, 0.1F, 1)));
      rf.a($$0, ak, $$39, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, al, $$40, a(rf.a(10, 0.1F, 1), dae.z));
      rf.a($$0, am, $$41, a(rf.a(3, 0.1F, 1)));
      rf.a($$0, an, $$41, a(rf.a(0, 0.1F, 1)));
      rf.a($$0, ao, $$42, a(rf.a(0, 0.1F, 1)));
      rf.a($$0, ap, $$43, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, aq, $$44, a(rf.a(2, 0.1F, 1)));
      rf.a($$0, ar, $$45, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, as, $$46, a(rf.a(10, 0.1F, 1)));
      rf.a($$0, at, $$47, a(rf.a(50, 0.1F, 1)));
      rf.a($$0, au, $$48, a(rf.a(30, 0.1F, 1)));
      rf.a($$0, av, $$49, ecf.a(), rf.a, ebw.a());
      rf.a($$0, aw, $$50, ecb.a(25), ecf.a(), ecr.a(5), rf.d, ebw.a(), ebx.a(dtv.a(dae.E.o(), ib.c)));
   }
}
