import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sf {
   public static final ake<efk> a = sd.a("bamboo_light");
   public static final ake<efk> b = sd.a("bamboo");
   public static final ake<efk> c = sd.a("vines");
   public static final ake<efk> d = sd.a("patch_sunflower");
   public static final ake<efk> e = sd.a("patch_pumpkin");
   public static final ake<efk> f = sd.a("patch_grass_plain");
   public static final ake<efk> g = sd.a("patch_grass_forest");
   public static final ake<efk> h = sd.a("patch_grass_badlands");
   public static final ake<efk> i = sd.a("patch_grass_savanna");
   public static final ake<efk> j = sd.a("patch_grass_normal");
   public static final ake<efk> k = sd.a("patch_grass_taiga_2");
   public static final ake<efk> l = sd.a("patch_grass_taiga");
   public static final ake<efk> m = sd.a("patch_grass_jungle");
   public static final ake<efk> n = sd.a("grass_bonemeal");
   public static final ake<efk> o = sd.a("patch_dead_bush_2");
   public static final ake<efk> p = sd.a("patch_dead_bush");
   public static final ake<efk> q = sd.a("patch_dead_bush_badlands");
   public static final ake<efk> r = sd.a("patch_melon");
   public static final ake<efk> s = sd.a("patch_melon_sparse");
   public static final ake<efk> t = sd.a("patch_berry_common");
   public static final ake<efk> u = sd.a("patch_berry_rare");
   public static final ake<efk> v = sd.a("patch_waterlily");
   public static final ake<efk> w = sd.a("patch_tall_grass_2");
   public static final ake<efk> x = sd.a("patch_tall_grass");
   public static final ake<efk> y = sd.a("patch_large_fern");
   public static final ake<efk> z = sd.a("patch_cactus_desert");
   public static final ake<efk> A = sd.a("patch_cactus_decorated");
   public static final ake<efk> B = sd.a("patch_sugar_cane_swamp");
   public static final ake<efk> C = sd.a("patch_sugar_cane_desert");
   public static final ake<efk> D = sd.a("patch_sugar_cane_badlands");
   public static final ake<efk> E = sd.a("patch_sugar_cane");
   public static final ake<efk> F = sd.a("brown_mushroom_nether");
   public static final ake<efk> G = sd.a("red_mushroom_nether");
   public static final ake<efk> H = sd.a("brown_mushroom_normal");
   public static final ake<efk> I = sd.a("red_mushroom_normal");
   public static final ake<efk> J = sd.a("brown_mushroom_taiga");
   public static final ake<efk> K = sd.a("red_mushroom_taiga");
   public static final ake<efk> L = sd.a("brown_mushroom_old_growth");
   public static final ake<efk> M = sd.a("red_mushroom_old_growth");
   public static final ake<efk> N = sd.a("brown_mushroom_swamp");
   public static final ake<efk> O = sd.a("red_mushroom_swamp");
   public static final ake<efk> P = sd.a("flower_warm");
   public static final ake<efk> Q = sd.a("flower_default");
   public static final ake<efk> R = sd.a("flower_flower_forest");
   public static final ake<efk> S = sd.a("flower_swamp");
   public static final ake<efk> T = sd.a("flower_plains");
   public static final ake<efk> U = sd.a("flower_meadow");
   public static final ake<efk> V = sd.a("flower_cherry");
   public static final ake<efk> W = sd.a("trees_plains");
   public static final ake<efk> X = sd.a("dark_forest_vegetation");
   public static final ake<efk> Y = sd.a("flower_forest_flowers");
   public static final ake<efk> Z = sd.a("forest_flowers");
   public static final ake<efk> aa = sd.a("trees_flower_forest");
   public static final ake<efk> ab = sd.a("trees_meadow");
   public static final ake<efk> ac = sd.a("trees_cherry");
   public static final ake<efk> ad = sd.a("trees_taiga");
   public static final ake<efk> ae = sd.a("trees_grove");
   public static final ake<efk> af = sd.a("trees_badlands");
   public static final ake<efk> ag = sd.a("trees_snowy");
   public static final ake<efk> ah = sd.a("trees_swamp");
   public static final ake<efk> ai = sd.a("trees_windswept_savanna");
   public static final ake<efk> aj = sd.a("trees_savanna");
   public static final ake<efk> ak = sd.a("birch_tall");
   public static final ake<efk> al = sd.a("trees_birch");
   public static final ake<efk> am = sd.a("trees_windswept_forest");
   public static final ake<efk> an = sd.a("trees_windswept_hills");
   public static final ake<efk> ao = sd.a("trees_water");
   public static final ake<efk> ap = sd.a("trees_birch_and_oak");
   public static final ake<efk> aq = sd.a("trees_sparse_jungle");
   public static final ake<efk> ar = sd.a("trees_old_growth_spruce_taiga");
   public static final ake<efk> as = sd.a("trees_old_growth_pine_taiga");
   public static final ake<efk> at = sd.a("trees_jungle");
   public static final ake<efk> au = sd.a("bamboo_vegetation");
   public static final ake<efk> av = sd.a("mushroom_island_vegetation");
   public static final ake<efk> aw = sd.a("trees_mangrove");
   private static final efn ax = eft.a(0);

   public static List<efn> a(int $$0) {
      return List.of(efd.a($$0), efh.a(), sd.c, eey.a());
   }

   private static List<efn> a(int $$0, @Nullable efn $$1) {
      Builder<efn> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(efq.a($$0));
      }

      $$2.add(efh.a());
      $$2.add(sd.a);
      $$2.add(eey.a());
      return $$2.build();
   }

   private static Builder<efn> b(efn $$0) {
      return ImmutableList.builder().add($$0).add(efh.a()).add(ax).add(sd.d).add(eey.a());
   }

   public static List<efn> a(efn $$0) {
      return b($$0).build();
   }

   public static List<efn> a(efn $$0, dcv $$1) {
      return b($$0).add(eez.a(dwx.a($$1.n(), im.c))).build();
   }

   public static void a(qj<efk> $$0) {
      iw<dyh<?, ?>> $$1 = $$0.a(ld.aB);
      iv<dyh<?, ?>> $$2 = $$1.b(ru.a);
      iv<dyh<?, ?>> $$3 = $$1.b(ru.b);
      iv<dyh<?, ?>> $$4 = $$1.b(ru.c);
      iv<dyh<?, ?>> $$5 = $$1.b(ru.f);
      iv<dyh<?, ?>> $$6 = $$1.b(ru.g);
      iv<dyh<?, ?>> $$7 = $$1.b(ru.j);
      iv<dyh<?, ?>> $$8 = $$1.b(ru.i);
      iv<dyh<?, ?>> $$9 = $$1.b(ru.k);
      iv<dyh<?, ?>> $$10 = $$1.b(ru.l);
      iv<dyh<?, ?>> $$11 = $$1.b(ru.m);
      iv<dyh<?, ?>> $$12 = $$1.b(ru.n);
      iv<dyh<?, ?>> $$13 = $$1.b(ru.h);
      iv<dyh<?, ?>> $$14 = $$1.b(ru.o);
      iv<dyh<?, ?>> $$15 = $$1.b(ru.p);
      iv<dyh<?, ?>> $$16 = $$1.b(ru.q);
      iv<dyh<?, ?>> $$17 = $$1.b(ru.r);
      iv<dyh<?, ?>> $$18 = $$1.b(ru.s);
      iv<dyh<?, ?>> $$19 = $$1.b(ru.d);
      iv<dyh<?, ?>> $$20 = $$1.b(ru.e);
      iv<dyh<?, ?>> $$21 = $$1.b(ru.t);
      iv<dyh<?, ?>> $$22 = $$1.b(ru.u);
      iv<dyh<?, ?>> $$23 = $$1.b(ru.v);
      iv<dyh<?, ?>> $$24 = $$1.b(ru.w);
      iv<dyh<?, ?>> $$25 = $$1.b(ru.x);
      iv<dyh<?, ?>> $$26 = $$1.b(ru.y);
      iv<dyh<?, ?>> $$27 = $$1.b(ru.K);
      iv<dyh<?, ?>> $$28 = $$1.b(ru.A);
      iv<dyh<?, ?>> $$29 = $$1.b(ru.z);
      iv<dyh<?, ?>> $$30 = $$1.b(ru.B);
      iv<dyh<?, ?>> $$31 = $$1.b(ru.C);
      iv<dyh<?, ?>> $$32 = $$1.b(ru.D);
      iv<dyh<?, ?>> $$33 = $$1.b(ru.E);
      iv<dyh<?, ?>> $$34 = $$1.b(rt.g);
      iv<dyh<?, ?>> $$35 = $$1.b(rt.k);
      iv<dyh<?, ?>> $$36 = $$1.b(rt.K);
      iv<dyh<?, ?>> $$37 = $$1.b(rt.u);
      iv<dyh<?, ?>> $$38 = $$1.b(ru.F);
      iv<dyh<?, ?>> $$39 = $$1.b(ru.G);
      iv<dyh<?, ?>> $$40 = $$1.b(rt.D);
      iv<dyh<?, ?>> $$41 = $$1.b(ru.H);
      iv<dyh<?, ?>> $$42 = $$1.b(ru.I);
      iv<dyh<?, ?>> $$43 = $$1.b(ru.J);
      iv<dyh<?, ?>> $$44 = $$1.b(ru.L);
      iv<dyh<?, ?>> $$45 = $$1.b(ru.M);
      iv<dyh<?, ?>> $$46 = $$1.b(ru.N);
      iv<dyh<?, ?>> $$47 = $$1.b(ru.O);
      iv<dyh<?, ?>> $$48 = $$1.b(ru.P);
      iv<dyh<?, ?>> $$49 = $$1.b(ru.Q);
      iv<dyh<?, ?>> $$50 = $$1.b(ru.R);
      sd.a($$0, a, $$2, efq.a(4), efh.a(), sd.a, eey.a());
      sd.a($$0, b, $$3, efi.a(160, 80.0, 0.3), efh.a(), sd.c, eey.a());
      sd.a($$0, c, $$4, efd.a(127), efh.a(), eff.a(dwk.a(64), dwk.a(100)), eey.a());
      sd.a($$0, d, $$5, efq.a(3), efh.a(), sd.a, eey.a());
      sd.a($$0, e, $$6, efq.a(300), efh.a(), sd.a, eey.a());
      sd.a($$0, f, $$7, efj.a(-0.8, 5, 10), efh.a(), sd.c, eey.a());
      sd.a($$0, g, $$7, a(2));
      sd.a($$0, h, $$7, efh.a(), sd.c, eey.a());
      sd.a($$0, i, $$7, a(20));
      sd.a($$0, j, $$7, a(5));
      sd.a($$0, k, $$8, efh.a(), sd.c, eey.a());
      sd.a($$0, l, $$8, a(7));
      sd.a($$0, m, $$9, a(25));
      sd.a($$0, n, $$10, sd.a());
      sd.a($$0, o, $$11, a(2));
      sd.a($$0, p, $$11, efh.a(), sd.c, eey.a());
      sd.a($$0, q, $$11, a(20));
      sd.a($$0, r, $$12, efq.a(6), efh.a(), sd.a, eey.a());
      sd.a($$0, s, $$12, efq.a(64), efh.a(), sd.a, eey.a());
      sd.a($$0, t, $$13, efq.a(32), efh.a(), sd.c, eey.a());
      sd.a($$0, u, $$13, efq.a(384), efh.a(), sd.c, eey.a());
      sd.a($$0, v, $$14, a(4));
      sd.a($$0, w, $$15, efj.a(-0.8, 0, 7), efq.a(32), efh.a(), sd.a, eey.a());
      sd.a($$0, x, $$15, efq.a(5), efh.a(), sd.a, eey.a());
      sd.a($$0, y, $$16, efq.a(5), efh.a(), sd.a, eey.a());
      sd.a($$0, z, $$17, efq.a(6), efh.a(), sd.a, eey.a());
      sd.a($$0, A, $$17, efq.a(13), efh.a(), sd.a, eey.a());
      sd.a($$0, B, $$18, efq.a(3), efh.a(), sd.a, eey.a());
      sd.a($$0, C, $$18, efh.a(), sd.a, eey.a());
      sd.a($$0, D, $$18, efq.a(5), efh.a(), sd.a, eey.a());
      sd.a($$0, E, $$18, efq.a(6), efh.a(), sd.a, eey.a());
      sd.a($$0, F, $$19, efq.a(2), efh.a(), sd.e, eey.a());
      sd.a($$0, G, $$20, efq.a(2), efh.a(), sd.e, eey.a());
      sd.a($$0, H, $$19, a(256, null));
      sd.a($$0, I, $$20, a(512, null));
      sd.a($$0, J, $$19, a(4, null));
      sd.a($$0, K, $$20, a(256, null));
      sd.a($$0, L, $$19, a(4, efd.a(3)));
      sd.a($$0, M, $$20, a(171, null));
      sd.a($$0, N, $$19, a(0, efd.a(2)));
      sd.a($$0, O, $$20, a(64, null));
      sd.a($$0, P, $$21, efq.a(16), efh.a(), sd.a, eey.a());
      sd.a($$0, Q, $$21, efq.a(32), efh.a(), sd.a, eey.a());
      sd.a($$0, R, $$22, efd.a(3), efq.a(2), efh.a(), sd.a, eey.a());
      sd.a($$0, S, $$23, efq.a(32), efh.a(), sd.a, eey.a());
      sd.a($$0, T, $$24, efj.a(-0.8, 15, 4), efq.a(32), efh.a(), sd.a, eey.a());
      sd.a($$0, V, $$26, efj.a(-0.8, 5, 10), efh.a(), sd.a, eey.a());
      sd.a($$0, U, $$25, efh.a(), sd.a, eey.a());
      efn $$51 = eft.a(0);
      sd.a($$0, W, $$27, sd.a(0, 0.05F, 1), efh.a(), $$51, sd.d, eez.a(dwx.a(dcx.x.n(), im.c)), eey.a());
      sd.a($$0, X, $$28, efd.a(16), efh.a(), $$51, sd.d, eey.a());
      sd.a($$0, Y, $$29, efq.a(7), efh.a(), sd.a, efd.a(bno.a(bob.a(-1, 3), 0, 3)), eey.a());
      sd.a($$0, Z, $$29, efq.a(7), efh.a(), sd.a, efd.a(bno.a(bob.a(-3, 1), 0, 1)), eey.a());
      sd.a($$0, aa, $$30, a(sd.a(6, 0.1F, 1)));
      sd.a($$0, ab, $$31, a(efq.a(100)));
      sd.a($$0, ac, $$36, a(sd.a(10, 0.1F, 1), dcx.C));
      sd.a($$0, ad, $$32, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, ae, $$33, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, af, $$34, a(sd.a(5, 0.1F, 1), dcx.x));
      sd.a($$0, ag, $$35, a(sd.a(0, 0.1F, 1), dcx.y));
      sd.a($$0, ah, $$37, sd.a(2, 0.1F, 1), efh.a(), eft.a(2), sd.d, eey.a(), eez.a(dwx.a(dcx.x.n(), im.c)));
      sd.a($$0, ai, $$38, a(sd.a(2, 0.1F, 1)));
      sd.a($$0, aj, $$38, a(sd.a(1, 0.1F, 1)));
      sd.a($$0, ak, $$39, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, al, $$40, a(sd.a(10, 0.1F, 1), dcx.z));
      sd.a($$0, am, $$41, a(sd.a(3, 0.1F, 1)));
      sd.a($$0, an, $$41, a(sd.a(0, 0.1F, 1)));
      sd.a($$0, ao, $$42, a(sd.a(0, 0.1F, 1)));
      sd.a($$0, ap, $$43, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, aq, $$44, a(sd.a(2, 0.1F, 1)));
      sd.a($$0, ar, $$45, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, as, $$46, a(sd.a(10, 0.1F, 1)));
      sd.a($$0, at, $$47, a(sd.a(50, 0.1F, 1)));
      sd.a($$0, au, $$48, a(sd.a(30, 0.1F, 1)));
      sd.a($$0, av, $$49, efh.a(), sd.a, eey.a());
      sd.a($$0, aw, $$50, efd.a(25), efh.a(), eft.a(5), sd.d, eey.a(), eez.a(dwx.a(dcx.E.n(), im.c)));
   }
}
