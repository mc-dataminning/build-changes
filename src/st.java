import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class st {
   public static final alk<elf> a = sr.a("bamboo_light");
   public static final alk<elf> b = sr.a("bamboo");
   public static final alk<elf> c = sr.a("vines");
   public static final alk<elf> d = sr.a("patch_sunflower");
   public static final alk<elf> e = sr.a("patch_pumpkin");
   public static final alk<elf> f = sr.a("patch_grass_plain");
   public static final alk<elf> g = sr.a("patch_grass_forest");
   public static final alk<elf> h = sr.a("patch_grass_badlands");
   public static final alk<elf> i = sr.a("patch_grass_savanna");
   public static final alk<elf> j = sr.a("patch_grass_normal");
   public static final alk<elf> k = sr.a("patch_grass_taiga_2");
   public static final alk<elf> l = sr.a("patch_grass_taiga");
   public static final alk<elf> m = sr.a("patch_grass_jungle");
   public static final alk<elf> n = sr.a("grass_bonemeal");
   public static final alk<elf> o = sr.a("patch_dead_bush_2");
   public static final alk<elf> p = sr.a("patch_dead_bush");
   public static final alk<elf> q = sr.a("patch_dead_bush_badlands");
   public static final alk<elf> r = sr.a("patch_melon");
   public static final alk<elf> s = sr.a("patch_melon_sparse");
   public static final alk<elf> t = sr.a("patch_berry_common");
   public static final alk<elf> u = sr.a("patch_berry_rare");
   public static final alk<elf> v = sr.a("patch_waterlily");
   public static final alk<elf> w = sr.a("patch_tall_grass_2");
   public static final alk<elf> x = sr.a("patch_tall_grass");
   public static final alk<elf> y = sr.a("patch_large_fern");
   public static final alk<elf> z = sr.a("patch_cactus_desert");
   public static final alk<elf> A = sr.a("patch_cactus_decorated");
   public static final alk<elf> B = sr.a("patch_sugar_cane_swamp");
   public static final alk<elf> C = sr.a("patch_sugar_cane_desert");
   public static final alk<elf> D = sr.a("patch_sugar_cane_badlands");
   public static final alk<elf> E = sr.a("patch_sugar_cane");
   public static final alk<elf> F = sr.a("brown_mushroom_nether");
   public static final alk<elf> G = sr.a("red_mushroom_nether");
   public static final alk<elf> H = sr.a("brown_mushroom_normal");
   public static final alk<elf> I = sr.a("red_mushroom_normal");
   public static final alk<elf> J = sr.a("brown_mushroom_taiga");
   public static final alk<elf> K = sr.a("red_mushroom_taiga");
   public static final alk<elf> L = sr.a("brown_mushroom_old_growth");
   public static final alk<elf> M = sr.a("red_mushroom_old_growth");
   public static final alk<elf> N = sr.a("brown_mushroom_swamp");
   public static final alk<elf> O = sr.a("red_mushroom_swamp");
   public static final alk<elf> P = sr.a("flower_warm");
   public static final alk<elf> Q = sr.a("flower_default");
   public static final alk<elf> R = sr.a("flower_flower_forest");
   public static final alk<elf> S = sr.a("flower_swamp");
   public static final alk<elf> T = sr.a("flower_plains");
   public static final alk<elf> U = sr.a("flower_meadow");
   public static final alk<elf> V = sr.a("flower_cherry");
   public static final alk<elf> W = sr.a("trees_plains");
   public static final alk<elf> X = sr.a("dark_forest_vegetation");
   public static final alk<elf> Y = sr.a("flower_forest_flowers");
   public static final alk<elf> Z = sr.a("forest_flowers");
   public static final alk<elf> aa = sr.a("trees_flower_forest");
   public static final alk<elf> ab = sr.a("trees_meadow");
   public static final alk<elf> ac = sr.a("trees_cherry");
   public static final alk<elf> ad = sr.a("trees_taiga");
   public static final alk<elf> ae = sr.a("trees_grove");
   public static final alk<elf> af = sr.a("trees_badlands");
   public static final alk<elf> ag = sr.a("trees_snowy");
   public static final alk<elf> ah = sr.a("trees_swamp");
   public static final alk<elf> ai = sr.a("trees_windswept_savanna");
   public static final alk<elf> aj = sr.a("trees_savanna");
   public static final alk<elf> ak = sr.a("birch_tall");
   public static final alk<elf> al = sr.a("trees_birch");
   public static final alk<elf> am = sr.a("trees_windswept_forest");
   public static final alk<elf> an = sr.a("trees_windswept_hills");
   public static final alk<elf> ao = sr.a("trees_water");
   public static final alk<elf> ap = sr.a("trees_birch_and_oak");
   public static final alk<elf> aq = sr.a("trees_sparse_jungle");
   public static final alk<elf> ar = sr.a("trees_old_growth_spruce_taiga");
   public static final alk<elf> as = sr.a("trees_old_growth_pine_taiga");
   public static final alk<elf> at = sr.a("trees_jungle");
   public static final alk<elf> au = sr.a("bamboo_vegetation");
   public static final alk<elf> av = sr.a("mushroom_island_vegetation");
   public static final alk<elf> aw = sr.a("trees_mangrove");
   private static final eli ax = elo.a(0);

   public static List<eli> a(int $$0) {
      return List.of(ekx.a($$0), elc.a(), sr.c, ekt.a());
   }

   private static List<eli> a(int $$0, @Nullable eli $$1) {
      Builder<eli> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ell.a($$0));
      }

      $$2.add(elc.a());
      $$2.add(sr.a);
      $$2.add(ekt.a());
      return $$2.build();
   }

   private static Builder<eli> b(eli $$0) {
      return ImmutableList.builder().add($$0).add(elc.a()).add(ax).add(sr.d).add(ekt.a());
   }

   public static List<eli> a(eli $$0) {
      return b($$0).build();
   }

   public static List<eli> a(eli $$0, dij $$1) {
      return b($$0).add(eku.a(ecq.a($$1.m(), jh.c))).build();
   }

   public static void a(rb<elf> $$0) {
      jr<eeb<?, ?>> $$1 = $$0.a(ma.aJ);
      jq<eeb<?, ?>> $$2 = $$1.b(si.a);
      jq<eeb<?, ?>> $$3 = $$1.b(si.b);
      jq<eeb<?, ?>> $$4 = $$1.b(si.c);
      jq<eeb<?, ?>> $$5 = $$1.b(si.f);
      jq<eeb<?, ?>> $$6 = $$1.b(si.g);
      jq<eeb<?, ?>> $$7 = $$1.b(si.j);
      jq<eeb<?, ?>> $$8 = $$1.b(si.i);
      jq<eeb<?, ?>> $$9 = $$1.b(si.k);
      jq<eeb<?, ?>> $$10 = $$1.b(si.l);
      jq<eeb<?, ?>> $$11 = $$1.b(si.m);
      jq<eeb<?, ?>> $$12 = $$1.b(si.n);
      jq<eeb<?, ?>> $$13 = $$1.b(si.h);
      jq<eeb<?, ?>> $$14 = $$1.b(si.o);
      jq<eeb<?, ?>> $$15 = $$1.b(si.p);
      jq<eeb<?, ?>> $$16 = $$1.b(si.q);
      jq<eeb<?, ?>> $$17 = $$1.b(si.r);
      jq<eeb<?, ?>> $$18 = $$1.b(si.s);
      jq<eeb<?, ?>> $$19 = $$1.b(si.d);
      jq<eeb<?, ?>> $$20 = $$1.b(si.e);
      jq<eeb<?, ?>> $$21 = $$1.b(si.t);
      jq<eeb<?, ?>> $$22 = $$1.b(si.u);
      jq<eeb<?, ?>> $$23 = $$1.b(si.v);
      jq<eeb<?, ?>> $$24 = $$1.b(si.w);
      jq<eeb<?, ?>> $$25 = $$1.b(si.x);
      jq<eeb<?, ?>> $$26 = $$1.b(si.y);
      jq<eeb<?, ?>> $$27 = $$1.b(si.K);
      jq<eeb<?, ?>> $$28 = $$1.b(si.A);
      jq<eeb<?, ?>> $$29 = $$1.b(si.z);
      jq<eeb<?, ?>> $$30 = $$1.b(si.B);
      jq<eeb<?, ?>> $$31 = $$1.b(si.C);
      jq<eeb<?, ?>> $$32 = $$1.b(si.D);
      jq<eeb<?, ?>> $$33 = $$1.b(si.E);
      jq<eeb<?, ?>> $$34 = $$1.b(sh.g);
      jq<eeb<?, ?>> $$35 = $$1.b(sh.k);
      jq<eeb<?, ?>> $$36 = $$1.b(sh.K);
      jq<eeb<?, ?>> $$37 = $$1.b(sh.u);
      jq<eeb<?, ?>> $$38 = $$1.b(si.F);
      jq<eeb<?, ?>> $$39 = $$1.b(si.G);
      jq<eeb<?, ?>> $$40 = $$1.b(sh.D);
      jq<eeb<?, ?>> $$41 = $$1.b(si.H);
      jq<eeb<?, ?>> $$42 = $$1.b(si.I);
      jq<eeb<?, ?>> $$43 = $$1.b(si.J);
      jq<eeb<?, ?>> $$44 = $$1.b(si.L);
      jq<eeb<?, ?>> $$45 = $$1.b(si.M);
      jq<eeb<?, ?>> $$46 = $$1.b(si.N);
      jq<eeb<?, ?>> $$47 = $$1.b(si.O);
      jq<eeb<?, ?>> $$48 = $$1.b(si.P);
      jq<eeb<?, ?>> $$49 = $$1.b(si.Q);
      jq<eeb<?, ?>> $$50 = $$1.b(si.R);
      sr.a($$0, a, $$2, ell.a(4), elc.a(), sr.a, ekt.a());
      sr.a($$0, b, $$3, eld.a(160, 80.0, 0.3), elc.a(), sr.c, ekt.a());
      sr.a($$0, c, $$4, ekx.a(127), elc.a(), ela.a(ecd.a(64), ecd.a(100)), ekt.a());
      sr.a($$0, d, $$5, ell.a(3), elc.a(), sr.a, ekt.a());
      sr.a($$0, e, $$6, ell.a(300), elc.a(), sr.a, ekt.a());
      sr.a($$0, f, $$7, ele.a(-0.8, 5, 10), elc.a(), sr.c, ekt.a());
      sr.a($$0, g, $$7, a(2));
      sr.a($$0, h, $$7, elc.a(), sr.c, ekt.a());
      sr.a($$0, i, $$7, a(20));
      sr.a($$0, j, $$7, a(5));
      sr.a($$0, k, $$8, elc.a(), sr.c, ekt.a());
      sr.a($$0, l, $$8, a(7));
      sr.a($$0, m, $$9, a(25));
      sr.a($$0, n, $$10, sr.a());
      sr.a($$0, o, $$11, a(2));
      sr.a($$0, p, $$11, elc.a(), sr.c, ekt.a());
      sr.a($$0, q, $$11, a(20));
      sr.a($$0, r, $$12, ell.a(6), elc.a(), sr.a, ekt.a());
      sr.a($$0, s, $$12, ell.a(64), elc.a(), sr.a, ekt.a());
      sr.a($$0, t, $$13, ell.a(32), elc.a(), sr.c, ekt.a());
      sr.a($$0, u, $$13, ell.a(384), elc.a(), sr.c, ekt.a());
      sr.a($$0, v, $$14, a(4));
      sr.a($$0, w, $$15, ele.a(-0.8, 0, 7), ell.a(32), elc.a(), sr.a, ekt.a());
      sr.a($$0, x, $$15, ell.a(5), elc.a(), sr.a, ekt.a());
      sr.a($$0, y, $$16, ell.a(5), elc.a(), sr.a, ekt.a());
      sr.a($$0, z, $$17, ell.a(6), elc.a(), sr.a, ekt.a());
      sr.a($$0, A, $$17, ell.a(13), elc.a(), sr.a, ekt.a());
      sr.a($$0, B, $$18, ell.a(3), elc.a(), sr.a, ekt.a());
      sr.a($$0, C, $$18, elc.a(), sr.a, ekt.a());
      sr.a($$0, D, $$18, ell.a(5), elc.a(), sr.a, ekt.a());
      sr.a($$0, E, $$18, ell.a(6), elc.a(), sr.a, ekt.a());
      sr.a($$0, F, $$19, ell.a(2), elc.a(), sr.e, ekt.a());
      sr.a($$0, G, $$20, ell.a(2), elc.a(), sr.e, ekt.a());
      sr.a($$0, H, $$19, a(256, null));
      sr.a($$0, I, $$20, a(512, null));
      sr.a($$0, J, $$19, a(4, null));
      sr.a($$0, K, $$20, a(256, null));
      sr.a($$0, L, $$19, a(4, ekx.a(3)));
      sr.a($$0, M, $$20, a(171, null));
      sr.a($$0, N, $$19, a(0, ekx.a(2)));
      sr.a($$0, O, $$20, a(64, null));
      sr.a($$0, P, $$21, ell.a(16), elc.a(), sr.a, ekt.a());
      sr.a($$0, Q, $$21, ell.a(32), elc.a(), sr.a, ekt.a());
      sr.a($$0, R, $$22, ekx.a(3), ell.a(2), elc.a(), sr.a, ekt.a());
      sr.a($$0, S, $$23, ell.a(32), elc.a(), sr.a, ekt.a());
      sr.a($$0, T, $$24, ele.a(-0.8, 15, 4), ell.a(32), elc.a(), sr.a, ekt.a());
      sr.a($$0, V, $$26, ele.a(-0.8, 5, 10), elc.a(), sr.a, ekt.a());
      sr.a($$0, U, $$25, elc.a(), sr.a, ekt.a());
      eli $$51 = elo.a(0);
      sr.a($$0, W, $$27, sr.a(0, 0.05F, 1), elc.a(), $$51, sr.d, eku.a(ecq.a(dil.x.m(), jh.c)), ekt.a());
      sr.a($$0, X, $$28, ekx.a(16), elc.a(), $$51, sr.d, ekt.a());
      sr.a($$0, Y, $$29, ell.a(7), elc.a(), sr.a, ekx.a(brf.a(brs.a(-1, 3), 0, 3)), ekt.a());
      sr.a($$0, Z, $$29, ell.a(7), elc.a(), sr.a, ekx.a(brf.a(brs.a(-3, 1), 0, 1)), ekt.a());
      sr.a($$0, aa, $$30, a(sr.a(6, 0.1F, 1)));
      sr.a($$0, ab, $$31, a(ell.a(100)));
      sr.a($$0, ac, $$36, a(sr.a(10, 0.1F, 1), dil.C));
      sr.a($$0, ad, $$32, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, ae, $$33, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, af, $$34, a(sr.a(5, 0.1F, 1), dil.x));
      sr.a($$0, ag, $$35, a(sr.a(0, 0.1F, 1), dil.y));
      sr.a($$0, ah, $$37, sr.a(2, 0.1F, 1), elc.a(), elo.a(2), sr.d, ekt.a(), eku.a(ecq.a(dil.x.m(), jh.c)));
      sr.a($$0, ai, $$38, a(sr.a(2, 0.1F, 1)));
      sr.a($$0, aj, $$38, a(sr.a(1, 0.1F, 1)));
      sr.a($$0, ak, $$39, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, al, $$40, a(sr.a(10, 0.1F, 1), dil.z));
      sr.a($$0, am, $$41, a(sr.a(3, 0.1F, 1)));
      sr.a($$0, an, $$41, a(sr.a(0, 0.1F, 1)));
      sr.a($$0, ao, $$42, a(sr.a(0, 0.1F, 1)));
      sr.a($$0, ap, $$43, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, aq, $$44, a(sr.a(2, 0.1F, 1)));
      sr.a($$0, ar, $$45, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, as, $$46, a(sr.a(10, 0.1F, 1)));
      sr.a($$0, at, $$47, a(sr.a(50, 0.1F, 1)));
      sr.a($$0, au, $$48, a(sr.a(30, 0.1F, 1)));
      sr.a($$0, av, $$49, elc.a(), sr.a, ekt.a());
      sr.a($$0, aw, $$50, ekx.a(25), elc.a(), elo.a(5), sr.d, ekt.a(), eku.a(ecq.a(dil.E.m(), jh.c)));
   }
}
