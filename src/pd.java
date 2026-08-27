import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pd {
   public static final acp<dre> a = pb.a("bamboo_light");
   public static final acp<dre> b = pb.a("bamboo");
   public static final acp<dre> c = pb.a("vines");
   public static final acp<dre> d = pb.a("patch_sunflower");
   public static final acp<dre> e = pb.a("patch_pumpkin");
   public static final acp<dre> f = pb.a("patch_grass_plain");
   public static final acp<dre> g = pb.a("patch_grass_forest");
   public static final acp<dre> h = pb.a("patch_grass_badlands");
   public static final acp<dre> i = pb.a("patch_grass_savanna");
   public static final acp<dre> j = pb.a("patch_grass_normal");
   public static final acp<dre> k = pb.a("patch_grass_taiga_2");
   public static final acp<dre> l = pb.a("patch_grass_taiga");
   public static final acp<dre> m = pb.a("patch_grass_jungle");
   public static final acp<dre> n = pb.a("grass_bonemeal");
   public static final acp<dre> o = pb.a("patch_dead_bush_2");
   public static final acp<dre> p = pb.a("patch_dead_bush");
   public static final acp<dre> q = pb.a("patch_dead_bush_badlands");
   public static final acp<dre> r = pb.a("patch_melon");
   public static final acp<dre> s = pb.a("patch_melon_sparse");
   public static final acp<dre> t = pb.a("patch_berry_common");
   public static final acp<dre> u = pb.a("patch_berry_rare");
   public static final acp<dre> v = pb.a("patch_waterlily");
   public static final acp<dre> w = pb.a("patch_tall_grass_2");
   public static final acp<dre> x = pb.a("patch_tall_grass");
   public static final acp<dre> y = pb.a("patch_large_fern");
   public static final acp<dre> z = pb.a("patch_cactus_desert");
   public static final acp<dre> A = pb.a("patch_cactus_decorated");
   public static final acp<dre> B = pb.a("patch_sugar_cane_swamp");
   public static final acp<dre> C = pb.a("patch_sugar_cane_desert");
   public static final acp<dre> D = pb.a("patch_sugar_cane_badlands");
   public static final acp<dre> E = pb.a("patch_sugar_cane");
   public static final acp<dre> F = pb.a("brown_mushroom_nether");
   public static final acp<dre> G = pb.a("red_mushroom_nether");
   public static final acp<dre> H = pb.a("brown_mushroom_normal");
   public static final acp<dre> I = pb.a("red_mushroom_normal");
   public static final acp<dre> J = pb.a("brown_mushroom_taiga");
   public static final acp<dre> K = pb.a("red_mushroom_taiga");
   public static final acp<dre> L = pb.a("brown_mushroom_old_growth");
   public static final acp<dre> M = pb.a("red_mushroom_old_growth");
   public static final acp<dre> N = pb.a("brown_mushroom_swamp");
   public static final acp<dre> O = pb.a("red_mushroom_swamp");
   public static final acp<dre> P = pb.a("flower_warm");
   public static final acp<dre> Q = pb.a("flower_default");
   public static final acp<dre> R = pb.a("flower_flower_forest");
   public static final acp<dre> S = pb.a("flower_swamp");
   public static final acp<dre> T = pb.a("flower_plains");
   public static final acp<dre> U = pb.a("flower_meadow");
   public static final acp<dre> V = pb.a("flower_cherry");
   public static final acp<dre> W = pb.a("trees_plains");
   public static final acp<dre> X = pb.a("dark_forest_vegetation");
   public static final acp<dre> Y = pb.a("flower_forest_flowers");
   public static final acp<dre> Z = pb.a("forest_flowers");
   public static final acp<dre> aa = pb.a("trees_flower_forest");
   public static final acp<dre> ab = pb.a("trees_meadow");
   public static final acp<dre> ac = pb.a("trees_cherry");
   public static final acp<dre> ad = pb.a("trees_taiga");
   public static final acp<dre> ae = pb.a("trees_grove");
   public static final acp<dre> af = pb.a("trees_badlands");
   public static final acp<dre> ag = pb.a("trees_snowy");
   public static final acp<dre> ah = pb.a("trees_swamp");
   public static final acp<dre> ai = pb.a("trees_windswept_savanna");
   public static final acp<dre> aj = pb.a("trees_savanna");
   public static final acp<dre> ak = pb.a("birch_tall");
   public static final acp<dre> al = pb.a("trees_birch");
   public static final acp<dre> am = pb.a("trees_windswept_forest");
   public static final acp<dre> an = pb.a("trees_windswept_hills");
   public static final acp<dre> ao = pb.a("trees_water");
   public static final acp<dre> ap = pb.a("trees_birch_and_oak");
   public static final acp<dre> aq = pb.a("trees_sparse_jungle");
   public static final acp<dre> ar = pb.a("trees_old_growth_spruce_taiga");
   public static final acp<dre> as = pb.a("trees_old_growth_pine_taiga");
   public static final acp<dre> at = pb.a("trees_jungle");
   public static final acp<dre> au = pb.a("bamboo_vegetation");
   public static final acp<dre> av = pb.a("mushroom_island_vegetation");
   public static final acp<dre> aw = pb.a("trees_mangrove");
   private static final drh ax = drn.a(0);

   public static List<drh> a(int $$0) {
      return List.of(dqx.a($$0), drb.a(), pb.c, dqs.a());
   }

   private static List<drh> a(int $$0, @Nullable drh $$1) {
      Builder<drh> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(drk.a($$0));
      }

      $$2.add(drb.a());
      $$2.add(pb.a);
      $$2.add(dqs.a());
      return $$2.build();
   }

   private static Builder<drh> b(drh $$0) {
      return ImmutableList.builder().add($$0).add(drb.a()).add(ax).add(pb.d).add(dqs.a());
   }

   public static List<drh> a(drh $$0) {
      return b($$0).build();
   }

   public static List<drh> a(drh $$0, cpn $$1) {
      return b($$0).add(dqt.a(dir.a($$1.n(), gu.b))).build();
   }

   public static void a(nm<dre> $$0) {
      hf<dkb<?, ?>> $$1 = $$0.a(jc.as);
      he<dkb<?, ?>> $$2 = $$1.b(os.a);
      he<dkb<?, ?>> $$3 = $$1.b(os.b);
      he<dkb<?, ?>> $$4 = $$1.b(os.c);
      he<dkb<?, ?>> $$5 = $$1.b(os.f);
      he<dkb<?, ?>> $$6 = $$1.b(os.g);
      he<dkb<?, ?>> $$7 = $$1.b(os.j);
      he<dkb<?, ?>> $$8 = $$1.b(os.i);
      he<dkb<?, ?>> $$9 = $$1.b(os.k);
      he<dkb<?, ?>> $$10 = $$1.b(os.l);
      he<dkb<?, ?>> $$11 = $$1.b(os.m);
      he<dkb<?, ?>> $$12 = $$1.b(os.n);
      he<dkb<?, ?>> $$13 = $$1.b(os.h);
      he<dkb<?, ?>> $$14 = $$1.b(os.o);
      he<dkb<?, ?>> $$15 = $$1.b(os.p);
      he<dkb<?, ?>> $$16 = $$1.b(os.q);
      he<dkb<?, ?>> $$17 = $$1.b(os.r);
      he<dkb<?, ?>> $$18 = $$1.b(os.s);
      he<dkb<?, ?>> $$19 = $$1.b(os.d);
      he<dkb<?, ?>> $$20 = $$1.b(os.e);
      he<dkb<?, ?>> $$21 = $$1.b(os.t);
      he<dkb<?, ?>> $$22 = $$1.b(os.u);
      he<dkb<?, ?>> $$23 = $$1.b(os.v);
      he<dkb<?, ?>> $$24 = $$1.b(os.w);
      he<dkb<?, ?>> $$25 = $$1.b(os.x);
      he<dkb<?, ?>> $$26 = $$1.b(os.y);
      he<dkb<?, ?>> $$27 = $$1.b(os.K);
      he<dkb<?, ?>> $$28 = $$1.b(os.A);
      he<dkb<?, ?>> $$29 = $$1.b(os.z);
      he<dkb<?, ?>> $$30 = $$1.b(os.B);
      he<dkb<?, ?>> $$31 = $$1.b(os.C);
      he<dkb<?, ?>> $$32 = $$1.b(os.D);
      he<dkb<?, ?>> $$33 = $$1.b(os.E);
      he<dkb<?, ?>> $$34 = $$1.b(or.g);
      he<dkb<?, ?>> $$35 = $$1.b(or.k);
      he<dkb<?, ?>> $$36 = $$1.b(or.K);
      he<dkb<?, ?>> $$37 = $$1.b(or.u);
      he<dkb<?, ?>> $$38 = $$1.b(os.F);
      he<dkb<?, ?>> $$39 = $$1.b(os.G);
      he<dkb<?, ?>> $$40 = $$1.b(or.D);
      he<dkb<?, ?>> $$41 = $$1.b(os.H);
      he<dkb<?, ?>> $$42 = $$1.b(os.I);
      he<dkb<?, ?>> $$43 = $$1.b(os.J);
      he<dkb<?, ?>> $$44 = $$1.b(os.L);
      he<dkb<?, ?>> $$45 = $$1.b(os.M);
      he<dkb<?, ?>> $$46 = $$1.b(os.N);
      he<dkb<?, ?>> $$47 = $$1.b(os.O);
      he<dkb<?, ?>> $$48 = $$1.b(os.P);
      he<dkb<?, ?>> $$49 = $$1.b(os.Q);
      he<dkb<?, ?>> $$50 = $$1.b(os.R);
      pb.a($$0, a, $$2, drk.a(4), drb.a(), pb.a, dqs.a());
      pb.a($$0, b, $$3, drc.a(160, 80.0, 0.3), drb.a(), pb.c, dqs.a());
      pb.a($$0, c, $$4, dqx.a(127), drb.a(), dqz.a(die.a(64), die.a(100)), dqs.a());
      pb.a($$0, d, $$5, drk.a(3), drb.a(), pb.a, dqs.a());
      pb.a($$0, e, $$6, drk.a(300), drb.a(), pb.a, dqs.a());
      pb.a($$0, f, $$7, drd.a(-0.8, 5, 10), drb.a(), pb.c, dqs.a());
      pb.a($$0, g, $$7, a(2));
      pb.a($$0, h, $$7, drb.a(), pb.c, dqs.a());
      pb.a($$0, i, $$7, a(20));
      pb.a($$0, j, $$7, a(5));
      pb.a($$0, k, $$8, drb.a(), pb.c, dqs.a());
      pb.a($$0, l, $$8, a(7));
      pb.a($$0, m, $$9, a(25));
      pb.a($$0, n, $$10, pb.a());
      pb.a($$0, o, $$11, a(2));
      pb.a($$0, p, $$11, drb.a(), pb.c, dqs.a());
      pb.a($$0, q, $$11, a(20));
      pb.a($$0, r, $$12, drk.a(6), drb.a(), pb.a, dqs.a());
      pb.a($$0, s, $$12, drk.a(64), drb.a(), pb.a, dqs.a());
      pb.a($$0, t, $$13, drk.a(32), drb.a(), pb.c, dqs.a());
      pb.a($$0, u, $$13, drk.a(384), drb.a(), pb.c, dqs.a());
      pb.a($$0, v, $$14, a(4));
      pb.a($$0, w, $$15, drd.a(-0.8, 0, 7), drk.a(32), drb.a(), pb.a, dqs.a());
      pb.a($$0, x, $$15, drk.a(5), drb.a(), pb.a, dqs.a());
      pb.a($$0, y, $$16, drk.a(5), drb.a(), pb.a, dqs.a());
      pb.a($$0, z, $$17, drk.a(6), drb.a(), pb.a, dqs.a());
      pb.a($$0, A, $$17, drk.a(13), drb.a(), pb.a, dqs.a());
      pb.a($$0, B, $$18, drk.a(3), drb.a(), pb.a, dqs.a());
      pb.a($$0, C, $$18, drb.a(), pb.a, dqs.a());
      pb.a($$0, D, $$18, drk.a(5), drb.a(), pb.a, dqs.a());
      pb.a($$0, E, $$18, drk.a(6), drb.a(), pb.a, dqs.a());
      pb.a($$0, F, $$19, drk.a(2), drb.a(), pb.e, dqs.a());
      pb.a($$0, G, $$20, drk.a(2), drb.a(), pb.e, dqs.a());
      pb.a($$0, H, $$19, a(256, null));
      pb.a($$0, I, $$20, a(512, null));
      pb.a($$0, J, $$19, a(4, null));
      pb.a($$0, K, $$20, a(256, null));
      pb.a($$0, L, $$19, a(4, dqx.a(3)));
      pb.a($$0, M, $$20, a(171, null));
      pb.a($$0, N, $$19, a(0, dqx.a(2)));
      pb.a($$0, O, $$20, a(64, null));
      pb.a($$0, P, $$21, drk.a(16), drb.a(), pb.a, dqs.a());
      pb.a($$0, Q, $$21, drk.a(32), drb.a(), pb.a, dqs.a());
      pb.a($$0, R, $$22, dqx.a(3), drk.a(2), drb.a(), pb.a, dqs.a());
      pb.a($$0, S, $$23, drk.a(32), drb.a(), pb.a, dqs.a());
      pb.a($$0, T, $$24, drd.a(-0.8, 15, 4), drk.a(32), drb.a(), pb.a, dqs.a());
      pb.a($$0, V, $$26, drd.a(-0.8, 5, 10), drb.a(), pb.a, dqs.a());
      pb.a($$0, U, $$25, drb.a(), pb.a, dqs.a());
      drh $$51 = drn.a(0);
      pb.a($$0, W, $$27, pb.a(0, 0.05F, 1), drb.a(), $$51, pb.d, dqt.a(dir.a(cpo.x.n(), gu.b)), dqs.a());
      pb.a($$0, X, $$28, dqx.a(16), drb.a(), $$51, pb.d, dqs.a());
      pb.a($$0, Y, $$29, drk.a(7), drb.a(), pb.a, dqx.a(bcv.a(bdi.a(-1, 3), 0, 3)), dqs.a());
      pb.a($$0, Z, $$29, drk.a(7), drb.a(), pb.a, dqx.a(bcv.a(bdi.a(-3, 1), 0, 1)), dqs.a());
      pb.a($$0, aa, $$30, a(pb.a(6, 0.1F, 1)));
      pb.a($$0, ab, $$31, a(drk.a(100)));
      pb.a($$0, ac, $$36, a(pb.a(10, 0.1F, 1), cpo.C));
      pb.a($$0, ad, $$32, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, ae, $$33, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, af, $$34, a(pb.a(5, 0.1F, 1), cpo.x));
      pb.a($$0, ag, $$35, a(pb.a(0, 0.1F, 1), cpo.y));
      pb.a($$0, ah, $$37, pb.a(2, 0.1F, 1), drb.a(), drn.a(2), pb.d, dqs.a(), dqt.a(dir.a(cpo.x.n(), gu.b)));
      pb.a($$0, ai, $$38, a(pb.a(2, 0.1F, 1)));
      pb.a($$0, aj, $$38, a(pb.a(1, 0.1F, 1)));
      pb.a($$0, ak, $$39, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, al, $$40, a(pb.a(10, 0.1F, 1), cpo.z));
      pb.a($$0, am, $$41, a(pb.a(3, 0.1F, 1)));
      pb.a($$0, an, $$41, a(pb.a(0, 0.1F, 1)));
      pb.a($$0, ao, $$42, a(pb.a(0, 0.1F, 1)));
      pb.a($$0, ap, $$43, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, aq, $$44, a(pb.a(2, 0.1F, 1)));
      pb.a($$0, ar, $$45, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, as, $$46, a(pb.a(10, 0.1F, 1)));
      pb.a($$0, at, $$47, a(pb.a(50, 0.1F, 1)));
      pb.a($$0, au, $$48, a(pb.a(30, 0.1F, 1)));
      pb.a($$0, av, $$49, drb.a(), pb.a, dqs.a());
      pb.a($$0, aw, $$50, dqx.a(25), drb.a(), drn.a(5), pb.d, dqs.a(), dqt.a(dir.a(cpo.E.n(), gu.b)));
   }
}
