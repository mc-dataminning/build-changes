import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sm {
   public static final ald<ekk> a = sk.a("bamboo_light");
   public static final ald<ekk> b = sk.a("bamboo");
   public static final ald<ekk> c = sk.a("vines");
   public static final ald<ekk> d = sk.a("patch_sunflower");
   public static final ald<ekk> e = sk.a("patch_pumpkin");
   public static final ald<ekk> f = sk.a("patch_grass_plain");
   public static final ald<ekk> g = sk.a("patch_grass_forest");
   public static final ald<ekk> h = sk.a("patch_grass_badlands");
   public static final ald<ekk> i = sk.a("patch_grass_savanna");
   public static final ald<ekk> j = sk.a("patch_grass_normal");
   public static final ald<ekk> k = sk.a("patch_grass_taiga_2");
   public static final ald<ekk> l = sk.a("patch_grass_taiga");
   public static final ald<ekk> m = sk.a("patch_grass_jungle");
   public static final ald<ekk> n = sk.a("grass_bonemeal");
   public static final ald<ekk> o = sk.a("patch_dead_bush_2");
   public static final ald<ekk> p = sk.a("patch_dead_bush");
   public static final ald<ekk> q = sk.a("patch_dead_bush_badlands");
   public static final ald<ekk> r = sk.a("patch_melon");
   public static final ald<ekk> s = sk.a("patch_melon_sparse");
   public static final ald<ekk> t = sk.a("patch_berry_common");
   public static final ald<ekk> u = sk.a("patch_berry_rare");
   public static final ald<ekk> v = sk.a("patch_waterlily");
   public static final ald<ekk> w = sk.a("patch_tall_grass_2");
   public static final ald<ekk> x = sk.a("patch_tall_grass");
   public static final ald<ekk> y = sk.a("patch_large_fern");
   public static final ald<ekk> z = sk.a("patch_cactus_desert");
   public static final ald<ekk> A = sk.a("patch_cactus_decorated");
   public static final ald<ekk> B = sk.a("patch_sugar_cane_swamp");
   public static final ald<ekk> C = sk.a("patch_sugar_cane_desert");
   public static final ald<ekk> D = sk.a("patch_sugar_cane_badlands");
   public static final ald<ekk> E = sk.a("patch_sugar_cane");
   public static final ald<ekk> F = sk.a("brown_mushroom_nether");
   public static final ald<ekk> G = sk.a("red_mushroom_nether");
   public static final ald<ekk> H = sk.a("brown_mushroom_normal");
   public static final ald<ekk> I = sk.a("red_mushroom_normal");
   public static final ald<ekk> J = sk.a("brown_mushroom_taiga");
   public static final ald<ekk> K = sk.a("red_mushroom_taiga");
   public static final ald<ekk> L = sk.a("brown_mushroom_old_growth");
   public static final ald<ekk> M = sk.a("red_mushroom_old_growth");
   public static final ald<ekk> N = sk.a("brown_mushroom_swamp");
   public static final ald<ekk> O = sk.a("red_mushroom_swamp");
   public static final ald<ekk> P = sk.a("flower_warm");
   public static final ald<ekk> Q = sk.a("flower_default");
   public static final ald<ekk> R = sk.a("flower_flower_forest");
   public static final ald<ekk> S = sk.a("flower_swamp");
   public static final ald<ekk> T = sk.a("flower_plains");
   public static final ald<ekk> U = sk.a("flower_meadow");
   public static final ald<ekk> V = sk.a("flower_cherry");
   public static final ald<ekk> W = sk.a("trees_plains");
   public static final ald<ekk> X = sk.a("dark_forest_vegetation");
   public static final ald<ekk> Y = sk.a("flower_forest_flowers");
   public static final ald<ekk> Z = sk.a("forest_flowers");
   public static final ald<ekk> aa = sk.a("trees_flower_forest");
   public static final ald<ekk> ab = sk.a("trees_meadow");
   public static final ald<ekk> ac = sk.a("trees_cherry");
   public static final ald<ekk> ad = sk.a("trees_taiga");
   public static final ald<ekk> ae = sk.a("trees_grove");
   public static final ald<ekk> af = sk.a("trees_badlands");
   public static final ald<ekk> ag = sk.a("trees_snowy");
   public static final ald<ekk> ah = sk.a("trees_swamp");
   public static final ald<ekk> ai = sk.a("trees_windswept_savanna");
   public static final ald<ekk> aj = sk.a("trees_savanna");
   public static final ald<ekk> ak = sk.a("birch_tall");
   public static final ald<ekk> al = sk.a("trees_birch");
   public static final ald<ekk> am = sk.a("trees_windswept_forest");
   public static final ald<ekk> an = sk.a("trees_windswept_hills");
   public static final ald<ekk> ao = sk.a("trees_water");
   public static final ald<ekk> ap = sk.a("trees_birch_and_oak");
   public static final ald<ekk> aq = sk.a("trees_sparse_jungle");
   public static final ald<ekk> ar = sk.a("trees_old_growth_spruce_taiga");
   public static final ald<ekk> as = sk.a("trees_old_growth_pine_taiga");
   public static final ald<ekk> at = sk.a("trees_jungle");
   public static final ald<ekk> au = sk.a("bamboo_vegetation");
   public static final ald<ekk> av = sk.a("mushroom_island_vegetation");
   public static final ald<ekk> aw = sk.a("trees_mangrove");
   private static final ekn ax = ekt.a(0);

   public static List<ekn> a(int $$0) {
      return List.of(ekc.a($$0), ekh.a(), sk.c, ejy.a());
   }

   private static List<ekn> a(int $$0, @Nullable ekn $$1) {
      Builder<ekn> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(ekq.a($$0));
      }

      $$2.add(ekh.a());
      $$2.add(sk.a);
      $$2.add(ejy.a());
      return $$2.build();
   }

   private static Builder<ekn> b(ekn $$0) {
      return ImmutableList.builder().add($$0).add(ekh.a()).add(ax).add(sk.d).add(ejy.a());
   }

   public static List<ekn> a(ekn $$0) {
      return b($$0).build();
   }

   public static List<ekn> a(ekn $$0, dhm $$1) {
      return b($$0).add(ejz.a(ebv.a($$1.n(), jf.c))).build();
   }

   public static void a(qu<ekk> $$0) {
      jp<edg<?, ?>> $$1 = $$0.a(lw.aK);
      jo<edg<?, ?>> $$2 = $$1.b(sb.a);
      jo<edg<?, ?>> $$3 = $$1.b(sb.b);
      jo<edg<?, ?>> $$4 = $$1.b(sb.c);
      jo<edg<?, ?>> $$5 = $$1.b(sb.f);
      jo<edg<?, ?>> $$6 = $$1.b(sb.g);
      jo<edg<?, ?>> $$7 = $$1.b(sb.j);
      jo<edg<?, ?>> $$8 = $$1.b(sb.i);
      jo<edg<?, ?>> $$9 = $$1.b(sb.k);
      jo<edg<?, ?>> $$10 = $$1.b(sb.l);
      jo<edg<?, ?>> $$11 = $$1.b(sb.m);
      jo<edg<?, ?>> $$12 = $$1.b(sb.n);
      jo<edg<?, ?>> $$13 = $$1.b(sb.h);
      jo<edg<?, ?>> $$14 = $$1.b(sb.o);
      jo<edg<?, ?>> $$15 = $$1.b(sb.p);
      jo<edg<?, ?>> $$16 = $$1.b(sb.q);
      jo<edg<?, ?>> $$17 = $$1.b(sb.r);
      jo<edg<?, ?>> $$18 = $$1.b(sb.s);
      jo<edg<?, ?>> $$19 = $$1.b(sb.d);
      jo<edg<?, ?>> $$20 = $$1.b(sb.e);
      jo<edg<?, ?>> $$21 = $$1.b(sb.t);
      jo<edg<?, ?>> $$22 = $$1.b(sb.u);
      jo<edg<?, ?>> $$23 = $$1.b(sb.v);
      jo<edg<?, ?>> $$24 = $$1.b(sb.w);
      jo<edg<?, ?>> $$25 = $$1.b(sb.x);
      jo<edg<?, ?>> $$26 = $$1.b(sb.y);
      jo<edg<?, ?>> $$27 = $$1.b(sb.K);
      jo<edg<?, ?>> $$28 = $$1.b(sb.A);
      jo<edg<?, ?>> $$29 = $$1.b(sb.z);
      jo<edg<?, ?>> $$30 = $$1.b(sb.B);
      jo<edg<?, ?>> $$31 = $$1.b(sb.C);
      jo<edg<?, ?>> $$32 = $$1.b(sb.D);
      jo<edg<?, ?>> $$33 = $$1.b(sb.E);
      jo<edg<?, ?>> $$34 = $$1.b(sa.g);
      jo<edg<?, ?>> $$35 = $$1.b(sa.k);
      jo<edg<?, ?>> $$36 = $$1.b(sa.K);
      jo<edg<?, ?>> $$37 = $$1.b(sa.u);
      jo<edg<?, ?>> $$38 = $$1.b(sb.F);
      jo<edg<?, ?>> $$39 = $$1.b(sb.G);
      jo<edg<?, ?>> $$40 = $$1.b(sa.D);
      jo<edg<?, ?>> $$41 = $$1.b(sb.H);
      jo<edg<?, ?>> $$42 = $$1.b(sb.I);
      jo<edg<?, ?>> $$43 = $$1.b(sb.J);
      jo<edg<?, ?>> $$44 = $$1.b(sb.L);
      jo<edg<?, ?>> $$45 = $$1.b(sb.M);
      jo<edg<?, ?>> $$46 = $$1.b(sb.N);
      jo<edg<?, ?>> $$47 = $$1.b(sb.O);
      jo<edg<?, ?>> $$48 = $$1.b(sb.P);
      jo<edg<?, ?>> $$49 = $$1.b(sb.Q);
      jo<edg<?, ?>> $$50 = $$1.b(sb.R);
      sk.a($$0, a, $$2, ekq.a(4), ekh.a(), sk.a, ejy.a());
      sk.a($$0, b, $$3, eki.a(160, 80.0, 0.3), ekh.a(), sk.c, ejy.a());
      sk.a($$0, c, $$4, ekc.a(127), ekh.a(), ekf.a(ebi.a(64), ebi.a(100)), ejy.a());
      sk.a($$0, d, $$5, ekq.a(3), ekh.a(), sk.a, ejy.a());
      sk.a($$0, e, $$6, ekq.a(300), ekh.a(), sk.a, ejy.a());
      sk.a($$0, f, $$7, ekj.a(-0.8, 5, 10), ekh.a(), sk.c, ejy.a());
      sk.a($$0, g, $$7, a(2));
      sk.a($$0, h, $$7, ekh.a(), sk.c, ejy.a());
      sk.a($$0, i, $$7, a(20));
      sk.a($$0, j, $$7, a(5));
      sk.a($$0, k, $$8, ekh.a(), sk.c, ejy.a());
      sk.a($$0, l, $$8, a(7));
      sk.a($$0, m, $$9, a(25));
      sk.a($$0, n, $$10, sk.a());
      sk.a($$0, o, $$11, a(2));
      sk.a($$0, p, $$11, ekh.a(), sk.c, ejy.a());
      sk.a($$0, q, $$11, a(20));
      sk.a($$0, r, $$12, ekq.a(6), ekh.a(), sk.a, ejy.a());
      sk.a($$0, s, $$12, ekq.a(64), ekh.a(), sk.a, ejy.a());
      sk.a($$0, t, $$13, ekq.a(32), ekh.a(), sk.c, ejy.a());
      sk.a($$0, u, $$13, ekq.a(384), ekh.a(), sk.c, ejy.a());
      sk.a($$0, v, $$14, a(4));
      sk.a($$0, w, $$15, ekj.a(-0.8, 0, 7), ekq.a(32), ekh.a(), sk.a, ejy.a());
      sk.a($$0, x, $$15, ekq.a(5), ekh.a(), sk.a, ejy.a());
      sk.a($$0, y, $$16, ekq.a(5), ekh.a(), sk.a, ejy.a());
      sk.a($$0, z, $$17, ekq.a(6), ekh.a(), sk.a, ejy.a());
      sk.a($$0, A, $$17, ekq.a(13), ekh.a(), sk.a, ejy.a());
      sk.a($$0, B, $$18, ekq.a(3), ekh.a(), sk.a, ejy.a());
      sk.a($$0, C, $$18, ekh.a(), sk.a, ejy.a());
      sk.a($$0, D, $$18, ekq.a(5), ekh.a(), sk.a, ejy.a());
      sk.a($$0, E, $$18, ekq.a(6), ekh.a(), sk.a, ejy.a());
      sk.a($$0, F, $$19, ekq.a(2), ekh.a(), sk.e, ejy.a());
      sk.a($$0, G, $$20, ekq.a(2), ekh.a(), sk.e, ejy.a());
      sk.a($$0, H, $$19, a(256, null));
      sk.a($$0, I, $$20, a(512, null));
      sk.a($$0, J, $$19, a(4, null));
      sk.a($$0, K, $$20, a(256, null));
      sk.a($$0, L, $$19, a(4, ekc.a(3)));
      sk.a($$0, M, $$20, a(171, null));
      sk.a($$0, N, $$19, a(0, ekc.a(2)));
      sk.a($$0, O, $$20, a(64, null));
      sk.a($$0, P, $$21, ekq.a(16), ekh.a(), sk.a, ejy.a());
      sk.a($$0, Q, $$21, ekq.a(32), ekh.a(), sk.a, ejy.a());
      sk.a($$0, R, $$22, ekc.a(3), ekq.a(2), ekh.a(), sk.a, ejy.a());
      sk.a($$0, S, $$23, ekq.a(32), ekh.a(), sk.a, ejy.a());
      sk.a($$0, T, $$24, ekj.a(-0.8, 15, 4), ekq.a(32), ekh.a(), sk.a, ejy.a());
      sk.a($$0, V, $$26, ekj.a(-0.8, 5, 10), ekh.a(), sk.a, ejy.a());
      sk.a($$0, U, $$25, ekh.a(), sk.a, ejy.a());
      ekn $$51 = ekt.a(0);
      sk.a($$0, W, $$27, sk.a(0, 0.05F, 1), ekh.a(), $$51, sk.d, ejz.a(ebv.a(dho.x.n(), jf.c)), ejy.a());
      sk.a($$0, X, $$28, ekc.a(16), ekh.a(), $$51, sk.d, ejy.a());
      sk.a($$0, Y, $$29, ekq.a(7), ekh.a(), sk.a, ekc.a(bqq.a(brd.a(-1, 3), 0, 3)), ejy.a());
      sk.a($$0, Z, $$29, ekq.a(7), ekh.a(), sk.a, ekc.a(bqq.a(brd.a(-3, 1), 0, 1)), ejy.a());
      sk.a($$0, aa, $$30, a(sk.a(6, 0.1F, 1)));
      sk.a($$0, ab, $$31, a(ekq.a(100)));
      sk.a($$0, ac, $$36, a(sk.a(10, 0.1F, 1), dho.C));
      sk.a($$0, ad, $$32, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, ae, $$33, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, af, $$34, a(sk.a(5, 0.1F, 1), dho.x));
      sk.a($$0, ag, $$35, a(sk.a(0, 0.1F, 1), dho.y));
      sk.a($$0, ah, $$37, sk.a(2, 0.1F, 1), ekh.a(), ekt.a(2), sk.d, ejy.a(), ejz.a(ebv.a(dho.x.n(), jf.c)));
      sk.a($$0, ai, $$38, a(sk.a(2, 0.1F, 1)));
      sk.a($$0, aj, $$38, a(sk.a(1, 0.1F, 1)));
      sk.a($$0, ak, $$39, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, al, $$40, a(sk.a(10, 0.1F, 1), dho.z));
      sk.a($$0, am, $$41, a(sk.a(3, 0.1F, 1)));
      sk.a($$0, an, $$41, a(sk.a(0, 0.1F, 1)));
      sk.a($$0, ao, $$42, a(sk.a(0, 0.1F, 1)));
      sk.a($$0, ap, $$43, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, aq, $$44, a(sk.a(2, 0.1F, 1)));
      sk.a($$0, ar, $$45, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, as, $$46, a(sk.a(10, 0.1F, 1)));
      sk.a($$0, at, $$47, a(sk.a(50, 0.1F, 1)));
      sk.a($$0, au, $$48, a(sk.a(30, 0.1F, 1)));
      sk.a($$0, av, $$49, ekh.a(), sk.a, ejy.a());
      sk.a($$0, aw, $$50, ekc.a(25), ekh.a(), ekt.a(5), sk.d, ejy.a(), ejz.a(ebv.a(dho.E.n(), jf.c)));
   }
}
