import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sr {
   public static final ali<elm> a = sp.a("bamboo_light");
   public static final ali<elm> b = sp.a("bamboo");
   public static final ali<elm> c = sp.a("vines");
   public static final ali<elm> d = sp.a("patch_sunflower");
   public static final ali<elm> e = sp.a("patch_pumpkin");
   public static final ali<elm> f = sp.a("patch_grass_plain");
   public static final ali<elm> g = sp.a("patch_grass_forest");
   public static final ali<elm> h = sp.a("patch_grass_badlands");
   public static final ali<elm> i = sp.a("patch_grass_savanna");
   public static final ali<elm> j = sp.a("patch_grass_normal");
   public static final ali<elm> k = sp.a("patch_grass_taiga_2");
   public static final ali<elm> l = sp.a("patch_grass_taiga");
   public static final ali<elm> m = sp.a("patch_grass_jungle");
   public static final ali<elm> n = sp.a("grass_bonemeal");
   public static final ali<elm> o = sp.a("patch_dead_bush_2");
   public static final ali<elm> p = sp.a("patch_dead_bush");
   public static final ali<elm> q = sp.a("patch_dead_bush_badlands");
   public static final ali<elm> r = sp.a("patch_melon");
   public static final ali<elm> s = sp.a("patch_melon_sparse");
   public static final ali<elm> t = sp.a("patch_berry_common");
   public static final ali<elm> u = sp.a("patch_berry_rare");
   public static final ali<elm> v = sp.a("patch_waterlily");
   public static final ali<elm> w = sp.a("patch_tall_grass_2");
   public static final ali<elm> x = sp.a("patch_tall_grass");
   public static final ali<elm> y = sp.a("patch_large_fern");
   public static final ali<elm> z = sp.a("patch_cactus_desert");
   public static final ali<elm> A = sp.a("patch_cactus_decorated");
   public static final ali<elm> B = sp.a("patch_sugar_cane_swamp");
   public static final ali<elm> C = sp.a("patch_sugar_cane_desert");
   public static final ali<elm> D = sp.a("patch_sugar_cane_badlands");
   public static final ali<elm> E = sp.a("patch_sugar_cane");
   public static final ali<elm> F = sp.a("brown_mushroom_nether");
   public static final ali<elm> G = sp.a("red_mushroom_nether");
   public static final ali<elm> H = sp.a("brown_mushroom_normal");
   public static final ali<elm> I = sp.a("red_mushroom_normal");
   public static final ali<elm> J = sp.a("brown_mushroom_taiga");
   public static final ali<elm> K = sp.a("red_mushroom_taiga");
   public static final ali<elm> L = sp.a("brown_mushroom_old_growth");
   public static final ali<elm> M = sp.a("red_mushroom_old_growth");
   public static final ali<elm> N = sp.a("brown_mushroom_swamp");
   public static final ali<elm> O = sp.a("red_mushroom_swamp");
   public static final ali<elm> P = sp.a("flower_warm");
   public static final ali<elm> Q = sp.a("flower_default");
   public static final ali<elm> R = sp.a("flower_flower_forest");
   public static final ali<elm> S = sp.a("flower_swamp");
   public static final ali<elm> T = sp.a("flower_plains");
   public static final ali<elm> U = sp.a("flower_meadow");
   public static final ali<elm> V = sp.a("flower_cherry");
   public static final ali<elm> W = sp.a("trees_plains");
   public static final ali<elm> X = sp.a("dark_forest_vegetation");
   public static final ali<elm> Y = sp.a("flower_forest_flowers");
   public static final ali<elm> Z = sp.a("forest_flowers");
   public static final ali<elm> aa = sp.a("trees_flower_forest");
   public static final ali<elm> ab = sp.a("trees_meadow");
   public static final ali<elm> ac = sp.a("trees_cherry");
   public static final ali<elm> ad = sp.a("trees_taiga");
   public static final ali<elm> ae = sp.a("trees_grove");
   public static final ali<elm> af = sp.a("trees_badlands");
   public static final ali<elm> ag = sp.a("trees_snowy");
   public static final ali<elm> ah = sp.a("trees_swamp");
   public static final ali<elm> ai = sp.a("trees_windswept_savanna");
   public static final ali<elm> aj = sp.a("trees_savanna");
   public static final ali<elm> ak = sp.a("birch_tall");
   public static final ali<elm> al = sp.a("trees_birch");
   public static final ali<elm> am = sp.a("trees_windswept_forest");
   public static final ali<elm> an = sp.a("trees_windswept_hills");
   public static final ali<elm> ao = sp.a("trees_water");
   public static final ali<elm> ap = sp.a("trees_birch_and_oak");
   public static final ali<elm> aq = sp.a("trees_sparse_jungle");
   public static final ali<elm> ar = sp.a("trees_old_growth_spruce_taiga");
   public static final ali<elm> as = sp.a("trees_old_growth_pine_taiga");
   public static final ali<elm> at = sp.a("trees_jungle");
   public static final ali<elm> au = sp.a("bamboo_vegetation");
   public static final ali<elm> av = sp.a("mushroom_island_vegetation");
   public static final ali<elm> aw = sp.a("trees_mangrove");
   private static final elp ax = elv.a(0);

   public static List<elp> a(int $$0) {
      return List.of(ele.a($$0), elj.a(), sp.c, ela.a());
   }

   private static List<elp> a(int $$0, @Nullable elp $$1) {
      Builder<elp> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(els.a($$0));
      }

      $$2.add(elj.a());
      $$2.add(sp.a);
      $$2.add(ela.a());
      return $$2.build();
   }

   private static Builder<elp> b(elp $$0) {
      return ImmutableList.builder().add($$0).add(elj.a()).add(ax).add(sp.d).add(ela.a());
   }

   public static List<elp> a(elp $$0) {
      return b($$0).build();
   }

   public static List<elp> a(elp $$0, diq $$1) {
      return b($$0).add(elb.a(ecx.a($$1.m(), jh.c))).build();
   }

   public static void a(qz<elm> $$0) {
      jr<eei<?, ?>> $$1 = $$0.a(ma.aJ);
      jq<eei<?, ?>> $$2 = $$1.b(sg.a);
      jq<eei<?, ?>> $$3 = $$1.b(sg.b);
      jq<eei<?, ?>> $$4 = $$1.b(sg.c);
      jq<eei<?, ?>> $$5 = $$1.b(sg.f);
      jq<eei<?, ?>> $$6 = $$1.b(sg.g);
      jq<eei<?, ?>> $$7 = $$1.b(sg.j);
      jq<eei<?, ?>> $$8 = $$1.b(sg.i);
      jq<eei<?, ?>> $$9 = $$1.b(sg.k);
      jq<eei<?, ?>> $$10 = $$1.b(sg.l);
      jq<eei<?, ?>> $$11 = $$1.b(sg.m);
      jq<eei<?, ?>> $$12 = $$1.b(sg.n);
      jq<eei<?, ?>> $$13 = $$1.b(sg.h);
      jq<eei<?, ?>> $$14 = $$1.b(sg.o);
      jq<eei<?, ?>> $$15 = $$1.b(sg.p);
      jq<eei<?, ?>> $$16 = $$1.b(sg.q);
      jq<eei<?, ?>> $$17 = $$1.b(sg.r);
      jq<eei<?, ?>> $$18 = $$1.b(sg.s);
      jq<eei<?, ?>> $$19 = $$1.b(sg.d);
      jq<eei<?, ?>> $$20 = $$1.b(sg.e);
      jq<eei<?, ?>> $$21 = $$1.b(sg.t);
      jq<eei<?, ?>> $$22 = $$1.b(sg.u);
      jq<eei<?, ?>> $$23 = $$1.b(sg.v);
      jq<eei<?, ?>> $$24 = $$1.b(sg.w);
      jq<eei<?, ?>> $$25 = $$1.b(sg.x);
      jq<eei<?, ?>> $$26 = $$1.b(sg.y);
      jq<eei<?, ?>> $$27 = $$1.b(sg.K);
      jq<eei<?, ?>> $$28 = $$1.b(sg.A);
      jq<eei<?, ?>> $$29 = $$1.b(sg.z);
      jq<eei<?, ?>> $$30 = $$1.b(sg.B);
      jq<eei<?, ?>> $$31 = $$1.b(sg.C);
      jq<eei<?, ?>> $$32 = $$1.b(sg.D);
      jq<eei<?, ?>> $$33 = $$1.b(sg.E);
      jq<eei<?, ?>> $$34 = $$1.b(sf.g);
      jq<eei<?, ?>> $$35 = $$1.b(sf.k);
      jq<eei<?, ?>> $$36 = $$1.b(sf.K);
      jq<eei<?, ?>> $$37 = $$1.b(sf.u);
      jq<eei<?, ?>> $$38 = $$1.b(sg.F);
      jq<eei<?, ?>> $$39 = $$1.b(sg.G);
      jq<eei<?, ?>> $$40 = $$1.b(sf.D);
      jq<eei<?, ?>> $$41 = $$1.b(sg.H);
      jq<eei<?, ?>> $$42 = $$1.b(sg.I);
      jq<eei<?, ?>> $$43 = $$1.b(sg.J);
      jq<eei<?, ?>> $$44 = $$1.b(sg.L);
      jq<eei<?, ?>> $$45 = $$1.b(sg.M);
      jq<eei<?, ?>> $$46 = $$1.b(sg.N);
      jq<eei<?, ?>> $$47 = $$1.b(sg.O);
      jq<eei<?, ?>> $$48 = $$1.b(sg.P);
      jq<eei<?, ?>> $$49 = $$1.b(sg.Q);
      jq<eei<?, ?>> $$50 = $$1.b(sg.R);
      sp.a($$0, a, $$2, els.a(4), elj.a(), sp.a, ela.a());
      sp.a($$0, b, $$3, elk.a(160, 80.0, 0.3), elj.a(), sp.c, ela.a());
      sp.a($$0, c, $$4, ele.a(127), elj.a(), elh.a(eck.a(64), eck.a(100)), ela.a());
      sp.a($$0, d, $$5, els.a(3), elj.a(), sp.a, ela.a());
      sp.a($$0, e, $$6, els.a(300), elj.a(), sp.a, ela.a());
      sp.a($$0, f, $$7, ell.a(-0.8, 5, 10), elj.a(), sp.c, ela.a());
      sp.a($$0, g, $$7, a(2));
      sp.a($$0, h, $$7, elj.a(), sp.c, ela.a());
      sp.a($$0, i, $$7, a(20));
      sp.a($$0, j, $$7, a(5));
      sp.a($$0, k, $$8, elj.a(), sp.c, ela.a());
      sp.a($$0, l, $$8, a(7));
      sp.a($$0, m, $$9, a(25));
      sp.a($$0, n, $$10, sp.a());
      sp.a($$0, o, $$11, a(2));
      sp.a($$0, p, $$11, elj.a(), sp.c, ela.a());
      sp.a($$0, q, $$11, a(20));
      sp.a($$0, r, $$12, els.a(6), elj.a(), sp.a, ela.a());
      sp.a($$0, s, $$12, els.a(64), elj.a(), sp.a, ela.a());
      sp.a($$0, t, $$13, els.a(32), elj.a(), sp.c, ela.a());
      sp.a($$0, u, $$13, els.a(384), elj.a(), sp.c, ela.a());
      sp.a($$0, v, $$14, a(4));
      sp.a($$0, w, $$15, ell.a(-0.8, 0, 7), els.a(32), elj.a(), sp.a, ela.a());
      sp.a($$0, x, $$15, els.a(5), elj.a(), sp.a, ela.a());
      sp.a($$0, y, $$16, els.a(5), elj.a(), sp.a, ela.a());
      sp.a($$0, z, $$17, els.a(6), elj.a(), sp.a, ela.a());
      sp.a($$0, A, $$17, els.a(13), elj.a(), sp.a, ela.a());
      sp.a($$0, B, $$18, els.a(3), elj.a(), sp.a, ela.a());
      sp.a($$0, C, $$18, elj.a(), sp.a, ela.a());
      sp.a($$0, D, $$18, els.a(5), elj.a(), sp.a, ela.a());
      sp.a($$0, E, $$18, els.a(6), elj.a(), sp.a, ela.a());
      sp.a($$0, F, $$19, els.a(2), elj.a(), sp.e, ela.a());
      sp.a($$0, G, $$20, els.a(2), elj.a(), sp.e, ela.a());
      sp.a($$0, H, $$19, a(256, null));
      sp.a($$0, I, $$20, a(512, null));
      sp.a($$0, J, $$19, a(4, null));
      sp.a($$0, K, $$20, a(256, null));
      sp.a($$0, L, $$19, a(4, ele.a(3)));
      sp.a($$0, M, $$20, a(171, null));
      sp.a($$0, N, $$19, a(0, ele.a(2)));
      sp.a($$0, O, $$20, a(64, null));
      sp.a($$0, P, $$21, els.a(16), elj.a(), sp.a, ela.a());
      sp.a($$0, Q, $$21, els.a(32), elj.a(), sp.a, ela.a());
      sp.a($$0, R, $$22, ele.a(3), els.a(2), elj.a(), sp.a, ela.a());
      sp.a($$0, S, $$23, els.a(32), elj.a(), sp.a, ela.a());
      sp.a($$0, T, $$24, ell.a(-0.8, 15, 4), els.a(32), elj.a(), sp.a, ela.a());
      sp.a($$0, V, $$26, ell.a(-0.8, 5, 10), elj.a(), sp.a, ela.a());
      sp.a($$0, U, $$25, elj.a(), sp.a, ela.a());
      elp $$51 = elv.a(0);
      sp.a($$0, W, $$27, sp.a(0, 0.05F, 1), elj.a(), $$51, sp.d, elb.a(ecx.a(dis.x.m(), jh.c)), ela.a());
      sp.a($$0, X, $$28, ele.a(16), elj.a(), $$51, sp.d, ela.a());
      sp.a($$0, Y, $$29, els.a(7), elj.a(), sp.a, ele.a(bri.a(brv.a(-1, 3), 0, 3)), ela.a());
      sp.a($$0, Z, $$29, els.a(7), elj.a(), sp.a, ele.a(bri.a(brv.a(-3, 1), 0, 1)), ela.a());
      sp.a($$0, aa, $$30, a(sp.a(6, 0.1F, 1)));
      sp.a($$0, ab, $$31, a(els.a(100)));
      sp.a($$0, ac, $$36, a(sp.a(10, 0.1F, 1), dis.C));
      sp.a($$0, ad, $$32, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, ae, $$33, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, af, $$34, a(sp.a(5, 0.1F, 1), dis.x));
      sp.a($$0, ag, $$35, a(sp.a(0, 0.1F, 1), dis.y));
      sp.a($$0, ah, $$37, sp.a(2, 0.1F, 1), elj.a(), elv.a(2), sp.d, ela.a(), elb.a(ecx.a(dis.x.m(), jh.c)));
      sp.a($$0, ai, $$38, a(sp.a(2, 0.1F, 1)));
      sp.a($$0, aj, $$38, a(sp.a(1, 0.1F, 1)));
      sp.a($$0, ak, $$39, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, al, $$40, a(sp.a(10, 0.1F, 1), dis.z));
      sp.a($$0, am, $$41, a(sp.a(3, 0.1F, 1)));
      sp.a($$0, an, $$41, a(sp.a(0, 0.1F, 1)));
      sp.a($$0, ao, $$42, a(sp.a(0, 0.1F, 1)));
      sp.a($$0, ap, $$43, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, aq, $$44, a(sp.a(2, 0.1F, 1)));
      sp.a($$0, ar, $$45, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, as, $$46, a(sp.a(10, 0.1F, 1)));
      sp.a($$0, at, $$47, a(sp.a(50, 0.1F, 1)));
      sp.a($$0, au, $$48, a(sp.a(30, 0.1F, 1)));
      sp.a($$0, av, $$49, elj.a(), sp.a, ela.a());
      sp.a($$0, aw, $$50, ele.a(25), elj.a(), elv.a(5), sp.d, ela.a(), elb.a(ecx.a(dis.E.m(), jh.c)));
   }
}
