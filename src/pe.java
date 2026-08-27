import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class pe {
   public static final aeo<dub> a = pc.a("bamboo_light");
   public static final aeo<dub> b = pc.a("bamboo");
   public static final aeo<dub> c = pc.a("vines");
   public static final aeo<dub> d = pc.a("patch_sunflower");
   public static final aeo<dub> e = pc.a("patch_pumpkin");
   public static final aeo<dub> f = pc.a("patch_grass_plain");
   public static final aeo<dub> g = pc.a("patch_grass_forest");
   public static final aeo<dub> h = pc.a("patch_grass_badlands");
   public static final aeo<dub> i = pc.a("patch_grass_savanna");
   public static final aeo<dub> j = pc.a("patch_grass_normal");
   public static final aeo<dub> k = pc.a("patch_grass_taiga_2");
   public static final aeo<dub> l = pc.a("patch_grass_taiga");
   public static final aeo<dub> m = pc.a("patch_grass_jungle");
   public static final aeo<dub> n = pc.a("grass_bonemeal");
   public static final aeo<dub> o = pc.a("patch_dead_bush_2");
   public static final aeo<dub> p = pc.a("patch_dead_bush");
   public static final aeo<dub> q = pc.a("patch_dead_bush_badlands");
   public static final aeo<dub> r = pc.a("patch_melon");
   public static final aeo<dub> s = pc.a("patch_melon_sparse");
   public static final aeo<dub> t = pc.a("patch_berry_common");
   public static final aeo<dub> u = pc.a("patch_berry_rare");
   public static final aeo<dub> v = pc.a("patch_waterlily");
   public static final aeo<dub> w = pc.a("patch_tall_grass_2");
   public static final aeo<dub> x = pc.a("patch_tall_grass");
   public static final aeo<dub> y = pc.a("patch_large_fern");
   public static final aeo<dub> z = pc.a("patch_cactus_desert");
   public static final aeo<dub> A = pc.a("patch_cactus_decorated");
   public static final aeo<dub> B = pc.a("patch_sugar_cane_swamp");
   public static final aeo<dub> C = pc.a("patch_sugar_cane_desert");
   public static final aeo<dub> D = pc.a("patch_sugar_cane_badlands");
   public static final aeo<dub> E = pc.a("patch_sugar_cane");
   public static final aeo<dub> F = pc.a("brown_mushroom_nether");
   public static final aeo<dub> G = pc.a("red_mushroom_nether");
   public static final aeo<dub> H = pc.a("brown_mushroom_normal");
   public static final aeo<dub> I = pc.a("red_mushroom_normal");
   public static final aeo<dub> J = pc.a("brown_mushroom_taiga");
   public static final aeo<dub> K = pc.a("red_mushroom_taiga");
   public static final aeo<dub> L = pc.a("brown_mushroom_old_growth");
   public static final aeo<dub> M = pc.a("red_mushroom_old_growth");
   public static final aeo<dub> N = pc.a("brown_mushroom_swamp");
   public static final aeo<dub> O = pc.a("red_mushroom_swamp");
   public static final aeo<dub> P = pc.a("flower_warm");
   public static final aeo<dub> Q = pc.a("flower_default");
   public static final aeo<dub> R = pc.a("flower_flower_forest");
   public static final aeo<dub> S = pc.a("flower_swamp");
   public static final aeo<dub> T = pc.a("flower_plains");
   public static final aeo<dub> U = pc.a("flower_meadow");
   public static final aeo<dub> V = pc.a("flower_cherry");
   public static final aeo<dub> W = pc.a("trees_plains");
   public static final aeo<dub> X = pc.a("dark_forest_vegetation");
   public static final aeo<dub> Y = pc.a("flower_forest_flowers");
   public static final aeo<dub> Z = pc.a("forest_flowers");
   public static final aeo<dub> aa = pc.a("trees_flower_forest");
   public static final aeo<dub> ab = pc.a("trees_meadow");
   public static final aeo<dub> ac = pc.a("trees_cherry");
   public static final aeo<dub> ad = pc.a("trees_taiga");
   public static final aeo<dub> ae = pc.a("trees_grove");
   public static final aeo<dub> af = pc.a("trees_badlands");
   public static final aeo<dub> ag = pc.a("trees_snowy");
   public static final aeo<dub> ah = pc.a("trees_swamp");
   public static final aeo<dub> ai = pc.a("trees_windswept_savanna");
   public static final aeo<dub> aj = pc.a("trees_savanna");
   public static final aeo<dub> ak = pc.a("birch_tall");
   public static final aeo<dub> al = pc.a("trees_birch");
   public static final aeo<dub> am = pc.a("trees_windswept_forest");
   public static final aeo<dub> an = pc.a("trees_windswept_hills");
   public static final aeo<dub> ao = pc.a("trees_water");
   public static final aeo<dub> ap = pc.a("trees_birch_and_oak");
   public static final aeo<dub> aq = pc.a("trees_sparse_jungle");
   public static final aeo<dub> ar = pc.a("trees_old_growth_spruce_taiga");
   public static final aeo<dub> as = pc.a("trees_old_growth_pine_taiga");
   public static final aeo<dub> at = pc.a("trees_jungle");
   public static final aeo<dub> au = pc.a("bamboo_vegetation");
   public static final aeo<dub> av = pc.a("mushroom_island_vegetation");
   public static final aeo<dub> aw = pc.a("trees_mangrove");
   private static final due ax = duk.a(0);

   public static List<due> a(int $$0) {
      return List.of(dtu.a($$0), dty.a(), pc.c, dtp.a());
   }

   private static List<due> a(int $$0, @Nullable due $$1) {
      Builder<due> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(duh.a($$0));
      }

      $$2.add(dty.a());
      $$2.add(pc.a);
      $$2.add(dtp.a());
      return $$2.build();
   }

   private static Builder<due> b(due $$0) {
      return ImmutableList.builder().add($$0).add(dty.a()).add(ax).add(pc.d).add(dtp.a());
   }

   public static List<due> a(due $$0) {
      return b($$0).build();
   }

   public static List<due> a(due $$0, csk $$1) {
      return b($$0).add(dtq.a(dlo.a($$1.n(), gv.b))).build();
   }

   public static void a(nn<dub> $$0) {
      hg<dmy<?, ?>> $$1 = $$0.a(jd.as);
      hf<dmy<?, ?>> $$2 = $$1.b(ot.a);
      hf<dmy<?, ?>> $$3 = $$1.b(ot.b);
      hf<dmy<?, ?>> $$4 = $$1.b(ot.c);
      hf<dmy<?, ?>> $$5 = $$1.b(ot.f);
      hf<dmy<?, ?>> $$6 = $$1.b(ot.g);
      hf<dmy<?, ?>> $$7 = $$1.b(ot.j);
      hf<dmy<?, ?>> $$8 = $$1.b(ot.i);
      hf<dmy<?, ?>> $$9 = $$1.b(ot.k);
      hf<dmy<?, ?>> $$10 = $$1.b(ot.l);
      hf<dmy<?, ?>> $$11 = $$1.b(ot.m);
      hf<dmy<?, ?>> $$12 = $$1.b(ot.n);
      hf<dmy<?, ?>> $$13 = $$1.b(ot.h);
      hf<dmy<?, ?>> $$14 = $$1.b(ot.o);
      hf<dmy<?, ?>> $$15 = $$1.b(ot.p);
      hf<dmy<?, ?>> $$16 = $$1.b(ot.q);
      hf<dmy<?, ?>> $$17 = $$1.b(ot.r);
      hf<dmy<?, ?>> $$18 = $$1.b(ot.s);
      hf<dmy<?, ?>> $$19 = $$1.b(ot.d);
      hf<dmy<?, ?>> $$20 = $$1.b(ot.e);
      hf<dmy<?, ?>> $$21 = $$1.b(ot.t);
      hf<dmy<?, ?>> $$22 = $$1.b(ot.u);
      hf<dmy<?, ?>> $$23 = $$1.b(ot.v);
      hf<dmy<?, ?>> $$24 = $$1.b(ot.w);
      hf<dmy<?, ?>> $$25 = $$1.b(ot.x);
      hf<dmy<?, ?>> $$26 = $$1.b(ot.y);
      hf<dmy<?, ?>> $$27 = $$1.b(ot.K);
      hf<dmy<?, ?>> $$28 = $$1.b(ot.A);
      hf<dmy<?, ?>> $$29 = $$1.b(ot.z);
      hf<dmy<?, ?>> $$30 = $$1.b(ot.B);
      hf<dmy<?, ?>> $$31 = $$1.b(ot.C);
      hf<dmy<?, ?>> $$32 = $$1.b(ot.D);
      hf<dmy<?, ?>> $$33 = $$1.b(ot.E);
      hf<dmy<?, ?>> $$34 = $$1.b(os.g);
      hf<dmy<?, ?>> $$35 = $$1.b(os.k);
      hf<dmy<?, ?>> $$36 = $$1.b(os.K);
      hf<dmy<?, ?>> $$37 = $$1.b(os.u);
      hf<dmy<?, ?>> $$38 = $$1.b(ot.F);
      hf<dmy<?, ?>> $$39 = $$1.b(ot.G);
      hf<dmy<?, ?>> $$40 = $$1.b(os.D);
      hf<dmy<?, ?>> $$41 = $$1.b(ot.H);
      hf<dmy<?, ?>> $$42 = $$1.b(ot.I);
      hf<dmy<?, ?>> $$43 = $$1.b(ot.J);
      hf<dmy<?, ?>> $$44 = $$1.b(ot.L);
      hf<dmy<?, ?>> $$45 = $$1.b(ot.M);
      hf<dmy<?, ?>> $$46 = $$1.b(ot.N);
      hf<dmy<?, ?>> $$47 = $$1.b(ot.O);
      hf<dmy<?, ?>> $$48 = $$1.b(ot.P);
      hf<dmy<?, ?>> $$49 = $$1.b(ot.Q);
      hf<dmy<?, ?>> $$50 = $$1.b(ot.R);
      pc.a($$0, a, $$2, duh.a(4), dty.a(), pc.a, dtp.a());
      pc.a($$0, b, $$3, dtz.a(160, 80.0, 0.3), dty.a(), pc.c, dtp.a());
      pc.a($$0, c, $$4, dtu.a(127), dty.a(), dtw.a(dlb.a(64), dlb.a(100)), dtp.a());
      pc.a($$0, d, $$5, duh.a(3), dty.a(), pc.a, dtp.a());
      pc.a($$0, e, $$6, duh.a(300), dty.a(), pc.a, dtp.a());
      pc.a($$0, f, $$7, dua.a(-0.8, 5, 10), dty.a(), pc.c, dtp.a());
      pc.a($$0, g, $$7, a(2));
      pc.a($$0, h, $$7, dty.a(), pc.c, dtp.a());
      pc.a($$0, i, $$7, a(20));
      pc.a($$0, j, $$7, a(5));
      pc.a($$0, k, $$8, dty.a(), pc.c, dtp.a());
      pc.a($$0, l, $$8, a(7));
      pc.a($$0, m, $$9, a(25));
      pc.a($$0, n, $$10, pc.a());
      pc.a($$0, o, $$11, a(2));
      pc.a($$0, p, $$11, dty.a(), pc.c, dtp.a());
      pc.a($$0, q, $$11, a(20));
      pc.a($$0, r, $$12, duh.a(6), dty.a(), pc.a, dtp.a());
      pc.a($$0, s, $$12, duh.a(64), dty.a(), pc.a, dtp.a());
      pc.a($$0, t, $$13, duh.a(32), dty.a(), pc.c, dtp.a());
      pc.a($$0, u, $$13, duh.a(384), dty.a(), pc.c, dtp.a());
      pc.a($$0, v, $$14, a(4));
      pc.a($$0, w, $$15, dua.a(-0.8, 0, 7), duh.a(32), dty.a(), pc.a, dtp.a());
      pc.a($$0, x, $$15, duh.a(5), dty.a(), pc.a, dtp.a());
      pc.a($$0, y, $$16, duh.a(5), dty.a(), pc.a, dtp.a());
      pc.a($$0, z, $$17, duh.a(6), dty.a(), pc.a, dtp.a());
      pc.a($$0, A, $$17, duh.a(13), dty.a(), pc.a, dtp.a());
      pc.a($$0, B, $$18, duh.a(3), dty.a(), pc.a, dtp.a());
      pc.a($$0, C, $$18, dty.a(), pc.a, dtp.a());
      pc.a($$0, D, $$18, duh.a(5), dty.a(), pc.a, dtp.a());
      pc.a($$0, E, $$18, duh.a(6), dty.a(), pc.a, dtp.a());
      pc.a($$0, F, $$19, duh.a(2), dty.a(), pc.e, dtp.a());
      pc.a($$0, G, $$20, duh.a(2), dty.a(), pc.e, dtp.a());
      pc.a($$0, H, $$19, a(256, null));
      pc.a($$0, I, $$20, a(512, null));
      pc.a($$0, J, $$19, a(4, null));
      pc.a($$0, K, $$20, a(256, null));
      pc.a($$0, L, $$19, a(4, dtu.a(3)));
      pc.a($$0, M, $$20, a(171, null));
      pc.a($$0, N, $$19, a(0, dtu.a(2)));
      pc.a($$0, O, $$20, a(64, null));
      pc.a($$0, P, $$21, duh.a(16), dty.a(), pc.a, dtp.a());
      pc.a($$0, Q, $$21, duh.a(32), dty.a(), pc.a, dtp.a());
      pc.a($$0, R, $$22, dtu.a(3), duh.a(2), dty.a(), pc.a, dtp.a());
      pc.a($$0, S, $$23, duh.a(32), dty.a(), pc.a, dtp.a());
      pc.a($$0, T, $$24, dua.a(-0.8, 15, 4), duh.a(32), dty.a(), pc.a, dtp.a());
      pc.a($$0, V, $$26, dua.a(-0.8, 5, 10), dty.a(), pc.a, dtp.a());
      pc.a($$0, U, $$25, dty.a(), pc.a, dtp.a());
      due $$51 = duk.a(0);
      pc.a($$0, W, $$27, pc.a(0, 0.05F, 1), dty.a(), $$51, pc.d, dtq.a(dlo.a(csl.x.n(), gv.b)), dtp.a());
      pc.a($$0, X, $$28, dtu.a(16), dty.a(), $$51, pc.d, dtp.a());
      pc.a($$0, Y, $$29, duh.a(7), dty.a(), pc.a, dtu.a(bfm.a(bfz.a(-1, 3), 0, 3)), dtp.a());
      pc.a($$0, Z, $$29, duh.a(7), dty.a(), pc.a, dtu.a(bfm.a(bfz.a(-3, 1), 0, 1)), dtp.a());
      pc.a($$0, aa, $$30, a(pc.a(6, 0.1F, 1)));
      pc.a($$0, ab, $$31, a(duh.a(100)));
      pc.a($$0, ac, $$36, a(pc.a(10, 0.1F, 1), csl.C));
      pc.a($$0, ad, $$32, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, ae, $$33, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, af, $$34, a(pc.a(5, 0.1F, 1), csl.x));
      pc.a($$0, ag, $$35, a(pc.a(0, 0.1F, 1), csl.y));
      pc.a($$0, ah, $$37, pc.a(2, 0.1F, 1), dty.a(), duk.a(2), pc.d, dtp.a(), dtq.a(dlo.a(csl.x.n(), gv.b)));
      pc.a($$0, ai, $$38, a(pc.a(2, 0.1F, 1)));
      pc.a($$0, aj, $$38, a(pc.a(1, 0.1F, 1)));
      pc.a($$0, ak, $$39, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, al, $$40, a(pc.a(10, 0.1F, 1), csl.z));
      pc.a($$0, am, $$41, a(pc.a(3, 0.1F, 1)));
      pc.a($$0, an, $$41, a(pc.a(0, 0.1F, 1)));
      pc.a($$0, ao, $$42, a(pc.a(0, 0.1F, 1)));
      pc.a($$0, ap, $$43, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, aq, $$44, a(pc.a(2, 0.1F, 1)));
      pc.a($$0, ar, $$45, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, as, $$46, a(pc.a(10, 0.1F, 1)));
      pc.a($$0, at, $$47, a(pc.a(50, 0.1F, 1)));
      pc.a($$0, au, $$48, a(pc.a(30, 0.1F, 1)));
      pc.a($$0, av, $$49, dty.a(), pc.a, dtp.a());
      pc.a($$0, aw, $$50, dtu.a(25), dty.a(), duk.a(5), pc.d, dtp.a(), dtq.a(dlo.a(csl.E.n(), gv.b)));
   }
}
