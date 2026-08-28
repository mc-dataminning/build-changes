import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class sq {
   public static final alh<elb> a = so.a("bamboo_light");
   public static final alh<elb> b = so.a("bamboo");
   public static final alh<elb> c = so.a("vines");
   public static final alh<elb> d = so.a("patch_sunflower");
   public static final alh<elb> e = so.a("patch_pumpkin");
   public static final alh<elb> f = so.a("patch_grass_plain");
   public static final alh<elb> g = so.a("patch_grass_forest");
   public static final alh<elb> h = so.a("patch_grass_badlands");
   public static final alh<elb> i = so.a("patch_grass_savanna");
   public static final alh<elb> j = so.a("patch_grass_normal");
   public static final alh<elb> k = so.a("patch_grass_taiga_2");
   public static final alh<elb> l = so.a("patch_grass_taiga");
   public static final alh<elb> m = so.a("patch_grass_jungle");
   public static final alh<elb> n = so.a("grass_bonemeal");
   public static final alh<elb> o = so.a("patch_dead_bush_2");
   public static final alh<elb> p = so.a("patch_dead_bush");
   public static final alh<elb> q = so.a("patch_dead_bush_badlands");
   public static final alh<elb> r = so.a("patch_melon");
   public static final alh<elb> s = so.a("patch_melon_sparse");
   public static final alh<elb> t = so.a("patch_berry_common");
   public static final alh<elb> u = so.a("patch_berry_rare");
   public static final alh<elb> v = so.a("patch_waterlily");
   public static final alh<elb> w = so.a("patch_tall_grass_2");
   public static final alh<elb> x = so.a("patch_tall_grass");
   public static final alh<elb> y = so.a("patch_large_fern");
   public static final alh<elb> z = so.a("patch_cactus_desert");
   public static final alh<elb> A = so.a("patch_cactus_decorated");
   public static final alh<elb> B = so.a("patch_sugar_cane_swamp");
   public static final alh<elb> C = so.a("patch_sugar_cane_desert");
   public static final alh<elb> D = so.a("patch_sugar_cane_badlands");
   public static final alh<elb> E = so.a("patch_sugar_cane");
   public static final alh<elb> F = so.a("brown_mushroom_nether");
   public static final alh<elb> G = so.a("red_mushroom_nether");
   public static final alh<elb> H = so.a("brown_mushroom_normal");
   public static final alh<elb> I = so.a("red_mushroom_normal");
   public static final alh<elb> J = so.a("brown_mushroom_taiga");
   public static final alh<elb> K = so.a("red_mushroom_taiga");
   public static final alh<elb> L = so.a("brown_mushroom_old_growth");
   public static final alh<elb> M = so.a("red_mushroom_old_growth");
   public static final alh<elb> N = so.a("brown_mushroom_swamp");
   public static final alh<elb> O = so.a("red_mushroom_swamp");
   public static final alh<elb> P = so.a("flower_warm");
   public static final alh<elb> Q = so.a("flower_default");
   public static final alh<elb> R = so.a("flower_flower_forest");
   public static final alh<elb> S = so.a("flower_swamp");
   public static final alh<elb> T = so.a("flower_plains");
   public static final alh<elb> U = so.a("flower_meadow");
   public static final alh<elb> V = so.a("flower_cherry");
   public static final alh<elb> W = so.a("trees_plains");
   public static final alh<elb> X = so.a("dark_forest_vegetation");
   public static final alh<elb> Y = so.a("flower_forest_flowers");
   public static final alh<elb> Z = so.a("forest_flowers");
   public static final alh<elb> aa = so.a("trees_flower_forest");
   public static final alh<elb> ab = so.a("trees_meadow");
   public static final alh<elb> ac = so.a("trees_cherry");
   public static final alh<elb> ad = so.a("trees_taiga");
   public static final alh<elb> ae = so.a("trees_grove");
   public static final alh<elb> af = so.a("trees_badlands");
   public static final alh<elb> ag = so.a("trees_snowy");
   public static final alh<elb> ah = so.a("trees_swamp");
   public static final alh<elb> ai = so.a("trees_windswept_savanna");
   public static final alh<elb> aj = so.a("trees_savanna");
   public static final alh<elb> ak = so.a("birch_tall");
   public static final alh<elb> al = so.a("trees_birch");
   public static final alh<elb> am = so.a("trees_windswept_forest");
   public static final alh<elb> an = so.a("trees_windswept_hills");
   public static final alh<elb> ao = so.a("trees_water");
   public static final alh<elb> ap = so.a("trees_birch_and_oak");
   public static final alh<elb> aq = so.a("trees_sparse_jungle");
   public static final alh<elb> ar = so.a("trees_old_growth_spruce_taiga");
   public static final alh<elb> as = so.a("trees_old_growth_pine_taiga");
   public static final alh<elb> at = so.a("trees_jungle");
   public static final alh<elb> au = so.a("bamboo_vegetation");
   public static final alh<elb> av = so.a("mushroom_island_vegetation");
   public static final alh<elb> aw = so.a("trees_mangrove");
   private static final ele ax = elk.a(0);

   public static List<ele> a(int $$0) {
      return List.of(ekt.a($$0), eky.a(), so.c, ekp.a());
   }

   private static List<ele> a(int $$0, @Nullable ele $$1) {
      Builder<ele> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(elh.a($$0));
      }

      $$2.add(eky.a());
      $$2.add(so.a);
      $$2.add(ekp.a());
      return $$2.build();
   }

   private static Builder<ele> b(ele $$0) {
      return ImmutableList.builder().add($$0).add(eky.a()).add(ax).add(so.d).add(ekp.a());
   }

   public static List<ele> a(ele $$0) {
      return b($$0).build();
   }

   public static List<ele> a(ele $$0, die $$1) {
      return b($$0).add(ekq.a(ecm.a($$1.m(), jh.c))).build();
   }

   public static void a(qy<elb> $$0) {
      jr<edx<?, ?>> $$1 = $$0.a(lz.aJ);
      jq<edx<?, ?>> $$2 = $$1.b(sf.a);
      jq<edx<?, ?>> $$3 = $$1.b(sf.b);
      jq<edx<?, ?>> $$4 = $$1.b(sf.c);
      jq<edx<?, ?>> $$5 = $$1.b(sf.f);
      jq<edx<?, ?>> $$6 = $$1.b(sf.g);
      jq<edx<?, ?>> $$7 = $$1.b(sf.j);
      jq<edx<?, ?>> $$8 = $$1.b(sf.i);
      jq<edx<?, ?>> $$9 = $$1.b(sf.k);
      jq<edx<?, ?>> $$10 = $$1.b(sf.l);
      jq<edx<?, ?>> $$11 = $$1.b(sf.m);
      jq<edx<?, ?>> $$12 = $$1.b(sf.n);
      jq<edx<?, ?>> $$13 = $$1.b(sf.h);
      jq<edx<?, ?>> $$14 = $$1.b(sf.o);
      jq<edx<?, ?>> $$15 = $$1.b(sf.p);
      jq<edx<?, ?>> $$16 = $$1.b(sf.q);
      jq<edx<?, ?>> $$17 = $$1.b(sf.r);
      jq<edx<?, ?>> $$18 = $$1.b(sf.s);
      jq<edx<?, ?>> $$19 = $$1.b(sf.d);
      jq<edx<?, ?>> $$20 = $$1.b(sf.e);
      jq<edx<?, ?>> $$21 = $$1.b(sf.t);
      jq<edx<?, ?>> $$22 = $$1.b(sf.u);
      jq<edx<?, ?>> $$23 = $$1.b(sf.v);
      jq<edx<?, ?>> $$24 = $$1.b(sf.w);
      jq<edx<?, ?>> $$25 = $$1.b(sf.x);
      jq<edx<?, ?>> $$26 = $$1.b(sf.y);
      jq<edx<?, ?>> $$27 = $$1.b(sf.K);
      jq<edx<?, ?>> $$28 = $$1.b(sf.A);
      jq<edx<?, ?>> $$29 = $$1.b(sf.z);
      jq<edx<?, ?>> $$30 = $$1.b(sf.B);
      jq<edx<?, ?>> $$31 = $$1.b(sf.C);
      jq<edx<?, ?>> $$32 = $$1.b(sf.D);
      jq<edx<?, ?>> $$33 = $$1.b(sf.E);
      jq<edx<?, ?>> $$34 = $$1.b(se.g);
      jq<edx<?, ?>> $$35 = $$1.b(se.k);
      jq<edx<?, ?>> $$36 = $$1.b(se.K);
      jq<edx<?, ?>> $$37 = $$1.b(se.u);
      jq<edx<?, ?>> $$38 = $$1.b(sf.F);
      jq<edx<?, ?>> $$39 = $$1.b(sf.G);
      jq<edx<?, ?>> $$40 = $$1.b(se.D);
      jq<edx<?, ?>> $$41 = $$1.b(sf.H);
      jq<edx<?, ?>> $$42 = $$1.b(sf.I);
      jq<edx<?, ?>> $$43 = $$1.b(sf.J);
      jq<edx<?, ?>> $$44 = $$1.b(sf.L);
      jq<edx<?, ?>> $$45 = $$1.b(sf.M);
      jq<edx<?, ?>> $$46 = $$1.b(sf.N);
      jq<edx<?, ?>> $$47 = $$1.b(sf.O);
      jq<edx<?, ?>> $$48 = $$1.b(sf.P);
      jq<edx<?, ?>> $$49 = $$1.b(sf.Q);
      jq<edx<?, ?>> $$50 = $$1.b(sf.R);
      so.a($$0, a, $$2, elh.a(4), eky.a(), so.a, ekp.a());
      so.a($$0, b, $$3, ekz.a(160, 80.0, 0.3), eky.a(), so.c, ekp.a());
      so.a($$0, c, $$4, ekt.a(127), eky.a(), ekw.a(ebz.a(64), ebz.a(100)), ekp.a());
      so.a($$0, d, $$5, elh.a(3), eky.a(), so.a, ekp.a());
      so.a($$0, e, $$6, elh.a(300), eky.a(), so.a, ekp.a());
      so.a($$0, f, $$7, ela.a(-0.8, 5, 10), eky.a(), so.c, ekp.a());
      so.a($$0, g, $$7, a(2));
      so.a($$0, h, $$7, eky.a(), so.c, ekp.a());
      so.a($$0, i, $$7, a(20));
      so.a($$0, j, $$7, a(5));
      so.a($$0, k, $$8, eky.a(), so.c, ekp.a());
      so.a($$0, l, $$8, a(7));
      so.a($$0, m, $$9, a(25));
      so.a($$0, n, $$10, so.a());
      so.a($$0, o, $$11, a(2));
      so.a($$0, p, $$11, eky.a(), so.c, ekp.a());
      so.a($$0, q, $$11, a(20));
      so.a($$0, r, $$12, elh.a(6), eky.a(), so.a, ekp.a());
      so.a($$0, s, $$12, elh.a(64), eky.a(), so.a, ekp.a());
      so.a($$0, t, $$13, elh.a(32), eky.a(), so.c, ekp.a());
      so.a($$0, u, $$13, elh.a(384), eky.a(), so.c, ekp.a());
      so.a($$0, v, $$14, a(4));
      so.a($$0, w, $$15, ela.a(-0.8, 0, 7), elh.a(32), eky.a(), so.a, ekp.a());
      so.a($$0, x, $$15, elh.a(5), eky.a(), so.a, ekp.a());
      so.a($$0, y, $$16, elh.a(5), eky.a(), so.a, ekp.a());
      so.a($$0, z, $$17, elh.a(6), eky.a(), so.a, ekp.a());
      so.a($$0, A, $$17, elh.a(13), eky.a(), so.a, ekp.a());
      so.a($$0, B, $$18, elh.a(3), eky.a(), so.a, ekp.a());
      so.a($$0, C, $$18, eky.a(), so.a, ekp.a());
      so.a($$0, D, $$18, elh.a(5), eky.a(), so.a, ekp.a());
      so.a($$0, E, $$18, elh.a(6), eky.a(), so.a, ekp.a());
      so.a($$0, F, $$19, elh.a(2), eky.a(), so.e, ekp.a());
      so.a($$0, G, $$20, elh.a(2), eky.a(), so.e, ekp.a());
      so.a($$0, H, $$19, a(256, null));
      so.a($$0, I, $$20, a(512, null));
      so.a($$0, J, $$19, a(4, null));
      so.a($$0, K, $$20, a(256, null));
      so.a($$0, L, $$19, a(4, ekt.a(3)));
      so.a($$0, M, $$20, a(171, null));
      so.a($$0, N, $$19, a(0, ekt.a(2)));
      so.a($$0, O, $$20, a(64, null));
      so.a($$0, P, $$21, elh.a(16), eky.a(), so.a, ekp.a());
      so.a($$0, Q, $$21, elh.a(32), eky.a(), so.a, ekp.a());
      so.a($$0, R, $$22, ekt.a(3), elh.a(2), eky.a(), so.a, ekp.a());
      so.a($$0, S, $$23, elh.a(32), eky.a(), so.a, ekp.a());
      so.a($$0, T, $$24, ela.a(-0.8, 15, 4), elh.a(32), eky.a(), so.a, ekp.a());
      so.a($$0, V, $$26, ela.a(-0.8, 5, 10), eky.a(), so.a, ekp.a());
      so.a($$0, U, $$25, eky.a(), so.a, ekp.a());
      ele $$51 = elk.a(0);
      so.a($$0, W, $$27, so.a(0, 0.05F, 1), eky.a(), $$51, so.d, ekq.a(ecm.a(dig.x.m(), jh.c)), ekp.a());
      so.a($$0, X, $$28, ekt.a(16), eky.a(), $$51, so.d, ekp.a());
      so.a($$0, Y, $$29, elh.a(7), eky.a(), so.a, ekt.a(brb.a(bro.a(-1, 3), 0, 3)), ekp.a());
      so.a($$0, Z, $$29, elh.a(7), eky.a(), so.a, ekt.a(brb.a(bro.a(-3, 1), 0, 1)), ekp.a());
      so.a($$0, aa, $$30, a(so.a(6, 0.1F, 1)));
      so.a($$0, ab, $$31, a(elh.a(100)));
      so.a($$0, ac, $$36, a(so.a(10, 0.1F, 1), dig.C));
      so.a($$0, ad, $$32, a(so.a(10, 0.1F, 1)));
      so.a($$0, ae, $$33, a(so.a(10, 0.1F, 1)));
      so.a($$0, af, $$34, a(so.a(5, 0.1F, 1), dig.x));
      so.a($$0, ag, $$35, a(so.a(0, 0.1F, 1), dig.y));
      so.a($$0, ah, $$37, so.a(2, 0.1F, 1), eky.a(), elk.a(2), so.d, ekp.a(), ekq.a(ecm.a(dig.x.m(), jh.c)));
      so.a($$0, ai, $$38, a(so.a(2, 0.1F, 1)));
      so.a($$0, aj, $$38, a(so.a(1, 0.1F, 1)));
      so.a($$0, ak, $$39, a(so.a(10, 0.1F, 1)));
      so.a($$0, al, $$40, a(so.a(10, 0.1F, 1), dig.z));
      so.a($$0, am, $$41, a(so.a(3, 0.1F, 1)));
      so.a($$0, an, $$41, a(so.a(0, 0.1F, 1)));
      so.a($$0, ao, $$42, a(so.a(0, 0.1F, 1)));
      so.a($$0, ap, $$43, a(so.a(10, 0.1F, 1)));
      so.a($$0, aq, $$44, a(so.a(2, 0.1F, 1)));
      so.a($$0, ar, $$45, a(so.a(10, 0.1F, 1)));
      so.a($$0, as, $$46, a(so.a(10, 0.1F, 1)));
      so.a($$0, at, $$47, a(so.a(50, 0.1F, 1)));
      so.a($$0, au, $$48, a(so.a(30, 0.1F, 1)));
      so.a($$0, av, $$49, eky.a(), so.a, ekp.a());
      so.a($$0, aw, $$50, ekt.a(25), eky.a(), elk.a(5), so.d, ekp.a(), ekq.a(ecm.a(dig.E.m(), jh.c)));
   }
}
