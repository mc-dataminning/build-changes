import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rd {
   public static final aix<eap> a = rb.a("bamboo_light");
   public static final aix<eap> b = rb.a("bamboo");
   public static final aix<eap> c = rb.a("vines");
   public static final aix<eap> d = rb.a("patch_sunflower");
   public static final aix<eap> e = rb.a("patch_pumpkin");
   public static final aix<eap> f = rb.a("patch_grass_plain");
   public static final aix<eap> g = rb.a("patch_grass_forest");
   public static final aix<eap> h = rb.a("patch_grass_badlands");
   public static final aix<eap> i = rb.a("patch_grass_savanna");
   public static final aix<eap> j = rb.a("patch_grass_normal");
   public static final aix<eap> k = rb.a("patch_grass_taiga_2");
   public static final aix<eap> l = rb.a("patch_grass_taiga");
   public static final aix<eap> m = rb.a("patch_grass_jungle");
   public static final aix<eap> n = rb.a("grass_bonemeal");
   public static final aix<eap> o = rb.a("patch_dead_bush_2");
   public static final aix<eap> p = rb.a("patch_dead_bush");
   public static final aix<eap> q = rb.a("patch_dead_bush_badlands");
   public static final aix<eap> r = rb.a("patch_melon");
   public static final aix<eap> s = rb.a("patch_melon_sparse");
   public static final aix<eap> t = rb.a("patch_berry_common");
   public static final aix<eap> u = rb.a("patch_berry_rare");
   public static final aix<eap> v = rb.a("patch_waterlily");
   public static final aix<eap> w = rb.a("patch_tall_grass_2");
   public static final aix<eap> x = rb.a("patch_tall_grass");
   public static final aix<eap> y = rb.a("patch_large_fern");
   public static final aix<eap> z = rb.a("patch_cactus_desert");
   public static final aix<eap> A = rb.a("patch_cactus_decorated");
   public static final aix<eap> B = rb.a("patch_sugar_cane_swamp");
   public static final aix<eap> C = rb.a("patch_sugar_cane_desert");
   public static final aix<eap> D = rb.a("patch_sugar_cane_badlands");
   public static final aix<eap> E = rb.a("patch_sugar_cane");
   public static final aix<eap> F = rb.a("brown_mushroom_nether");
   public static final aix<eap> G = rb.a("red_mushroom_nether");
   public static final aix<eap> H = rb.a("brown_mushroom_normal");
   public static final aix<eap> I = rb.a("red_mushroom_normal");
   public static final aix<eap> J = rb.a("brown_mushroom_taiga");
   public static final aix<eap> K = rb.a("red_mushroom_taiga");
   public static final aix<eap> L = rb.a("brown_mushroom_old_growth");
   public static final aix<eap> M = rb.a("red_mushroom_old_growth");
   public static final aix<eap> N = rb.a("brown_mushroom_swamp");
   public static final aix<eap> O = rb.a("red_mushroom_swamp");
   public static final aix<eap> P = rb.a("flower_warm");
   public static final aix<eap> Q = rb.a("flower_default");
   public static final aix<eap> R = rb.a("flower_flower_forest");
   public static final aix<eap> S = rb.a("flower_swamp");
   public static final aix<eap> T = rb.a("flower_plains");
   public static final aix<eap> U = rb.a("flower_meadow");
   public static final aix<eap> V = rb.a("flower_cherry");
   public static final aix<eap> W = rb.a("trees_plains");
   public static final aix<eap> X = rb.a("dark_forest_vegetation");
   public static final aix<eap> Y = rb.a("flower_forest_flowers");
   public static final aix<eap> Z = rb.a("forest_flowers");
   public static final aix<eap> aa = rb.a("trees_flower_forest");
   public static final aix<eap> ab = rb.a("trees_meadow");
   public static final aix<eap> ac = rb.a("trees_cherry");
   public static final aix<eap> ad = rb.a("trees_taiga");
   public static final aix<eap> ae = rb.a("trees_grove");
   public static final aix<eap> af = rb.a("trees_badlands");
   public static final aix<eap> ag = rb.a("trees_snowy");
   public static final aix<eap> ah = rb.a("trees_swamp");
   public static final aix<eap> ai = rb.a("trees_windswept_savanna");
   public static final aix<eap> aj = rb.a("trees_savanna");
   public static final aix<eap> ak = rb.a("birch_tall");
   public static final aix<eap> al = rb.a("trees_birch");
   public static final aix<eap> am = rb.a("trees_windswept_forest");
   public static final aix<eap> an = rb.a("trees_windswept_hills");
   public static final aix<eap> ao = rb.a("trees_water");
   public static final aix<eap> ap = rb.a("trees_birch_and_oak");
   public static final aix<eap> aq = rb.a("trees_sparse_jungle");
   public static final aix<eap> ar = rb.a("trees_old_growth_spruce_taiga");
   public static final aix<eap> as = rb.a("trees_old_growth_pine_taiga");
   public static final aix<eap> at = rb.a("trees_jungle");
   public static final aix<eap> au = rb.a("bamboo_vegetation");
   public static final aix<eap> av = rb.a("mushroom_island_vegetation");
   public static final aix<eap> aw = rb.a("trees_mangrove");
   private static final eas ax = eay.a(0);

   public static List<eas> a(int $$0) {
      return List.of(eai.a($$0), eam.a(), rb.c, ead.a());
   }

   private static List<eas> a(int $$0, @Nullable eas $$1) {
      Builder<eas> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(eav.a($$0));
      }

      $$2.add(eam.a());
      $$2.add(rb.a);
      $$2.add(ead.a());
      return $$2.build();
   }

   private static Builder<eas> b(eas $$0) {
      return ImmutableList.builder().add($$0).add(eam.a()).add(ax).add(rb.d).add(ead.a());
   }

   public static List<eas> a(eas $$0) {
      return b($$0).build();
   }

   public static List<eas> a(eas $$0, cys $$1) {
      return b($$0).add(eae.a(dsc.a($$1.o(), hz.c))).build();
   }

   public static void a(ph<eap> $$0) {
      ik<dtm<?, ?>> $$1 = $$0.a(kg.aw);
      ij<dtm<?, ?>> $$2 = $$1.b(qs.a);
      ij<dtm<?, ?>> $$3 = $$1.b(qs.b);
      ij<dtm<?, ?>> $$4 = $$1.b(qs.c);
      ij<dtm<?, ?>> $$5 = $$1.b(qs.f);
      ij<dtm<?, ?>> $$6 = $$1.b(qs.g);
      ij<dtm<?, ?>> $$7 = $$1.b(qs.j);
      ij<dtm<?, ?>> $$8 = $$1.b(qs.i);
      ij<dtm<?, ?>> $$9 = $$1.b(qs.k);
      ij<dtm<?, ?>> $$10 = $$1.b(qs.l);
      ij<dtm<?, ?>> $$11 = $$1.b(qs.m);
      ij<dtm<?, ?>> $$12 = $$1.b(qs.n);
      ij<dtm<?, ?>> $$13 = $$1.b(qs.h);
      ij<dtm<?, ?>> $$14 = $$1.b(qs.o);
      ij<dtm<?, ?>> $$15 = $$1.b(qs.p);
      ij<dtm<?, ?>> $$16 = $$1.b(qs.q);
      ij<dtm<?, ?>> $$17 = $$1.b(qs.r);
      ij<dtm<?, ?>> $$18 = $$1.b(qs.s);
      ij<dtm<?, ?>> $$19 = $$1.b(qs.d);
      ij<dtm<?, ?>> $$20 = $$1.b(qs.e);
      ij<dtm<?, ?>> $$21 = $$1.b(qs.t);
      ij<dtm<?, ?>> $$22 = $$1.b(qs.u);
      ij<dtm<?, ?>> $$23 = $$1.b(qs.v);
      ij<dtm<?, ?>> $$24 = $$1.b(qs.w);
      ij<dtm<?, ?>> $$25 = $$1.b(qs.x);
      ij<dtm<?, ?>> $$26 = $$1.b(qs.y);
      ij<dtm<?, ?>> $$27 = $$1.b(qs.K);
      ij<dtm<?, ?>> $$28 = $$1.b(qs.A);
      ij<dtm<?, ?>> $$29 = $$1.b(qs.z);
      ij<dtm<?, ?>> $$30 = $$1.b(qs.B);
      ij<dtm<?, ?>> $$31 = $$1.b(qs.C);
      ij<dtm<?, ?>> $$32 = $$1.b(qs.D);
      ij<dtm<?, ?>> $$33 = $$1.b(qs.E);
      ij<dtm<?, ?>> $$34 = $$1.b(qr.g);
      ij<dtm<?, ?>> $$35 = $$1.b(qr.k);
      ij<dtm<?, ?>> $$36 = $$1.b(qr.K);
      ij<dtm<?, ?>> $$37 = $$1.b(qr.u);
      ij<dtm<?, ?>> $$38 = $$1.b(qs.F);
      ij<dtm<?, ?>> $$39 = $$1.b(qs.G);
      ij<dtm<?, ?>> $$40 = $$1.b(qr.D);
      ij<dtm<?, ?>> $$41 = $$1.b(qs.H);
      ij<dtm<?, ?>> $$42 = $$1.b(qs.I);
      ij<dtm<?, ?>> $$43 = $$1.b(qs.J);
      ij<dtm<?, ?>> $$44 = $$1.b(qs.L);
      ij<dtm<?, ?>> $$45 = $$1.b(qs.M);
      ij<dtm<?, ?>> $$46 = $$1.b(qs.N);
      ij<dtm<?, ?>> $$47 = $$1.b(qs.O);
      ij<dtm<?, ?>> $$48 = $$1.b(qs.P);
      ij<dtm<?, ?>> $$49 = $$1.b(qs.Q);
      ij<dtm<?, ?>> $$50 = $$1.b(qs.R);
      rb.a($$0, a, $$2, eav.a(4), eam.a(), rb.a, ead.a());
      rb.a($$0, b, $$3, ean.a(160, 80.0, 0.3), eam.a(), rb.c, ead.a());
      rb.a($$0, c, $$4, eai.a(127), eam.a(), eak.a(drp.a(64), drp.a(100)), ead.a());
      rb.a($$0, d, $$5, eav.a(3), eam.a(), rb.a, ead.a());
      rb.a($$0, e, $$6, eav.a(300), eam.a(), rb.a, ead.a());
      rb.a($$0, f, $$7, eao.a(-0.8, 5, 10), eam.a(), rb.c, ead.a());
      rb.a($$0, g, $$7, a(2));
      rb.a($$0, h, $$7, eam.a(), rb.c, ead.a());
      rb.a($$0, i, $$7, a(20));
      rb.a($$0, j, $$7, a(5));
      rb.a($$0, k, $$8, eam.a(), rb.c, ead.a());
      rb.a($$0, l, $$8, a(7));
      rb.a($$0, m, $$9, a(25));
      rb.a($$0, n, $$10, rb.a());
      rb.a($$0, o, $$11, a(2));
      rb.a($$0, p, $$11, eam.a(), rb.c, ead.a());
      rb.a($$0, q, $$11, a(20));
      rb.a($$0, r, $$12, eav.a(6), eam.a(), rb.a, ead.a());
      rb.a($$0, s, $$12, eav.a(64), eam.a(), rb.a, ead.a());
      rb.a($$0, t, $$13, eav.a(32), eam.a(), rb.c, ead.a());
      rb.a($$0, u, $$13, eav.a(384), eam.a(), rb.c, ead.a());
      rb.a($$0, v, $$14, a(4));
      rb.a($$0, w, $$15, eao.a(-0.8, 0, 7), eav.a(32), eam.a(), rb.a, ead.a());
      rb.a($$0, x, $$15, eav.a(5), eam.a(), rb.a, ead.a());
      rb.a($$0, y, $$16, eav.a(5), eam.a(), rb.a, ead.a());
      rb.a($$0, z, $$17, eav.a(6), eam.a(), rb.a, ead.a());
      rb.a($$0, A, $$17, eav.a(13), eam.a(), rb.a, ead.a());
      rb.a($$0, B, $$18, eav.a(3), eam.a(), rb.a, ead.a());
      rb.a($$0, C, $$18, eam.a(), rb.a, ead.a());
      rb.a($$0, D, $$18, eav.a(5), eam.a(), rb.a, ead.a());
      rb.a($$0, E, $$18, eav.a(6), eam.a(), rb.a, ead.a());
      rb.a($$0, F, $$19, eav.a(2), eam.a(), rb.e, ead.a());
      rb.a($$0, G, $$20, eav.a(2), eam.a(), rb.e, ead.a());
      rb.a($$0, H, $$19, a(256, null));
      rb.a($$0, I, $$20, a(512, null));
      rb.a($$0, J, $$19, a(4, null));
      rb.a($$0, K, $$20, a(256, null));
      rb.a($$0, L, $$19, a(4, eai.a(3)));
      rb.a($$0, M, $$20, a(171, null));
      rb.a($$0, N, $$19, a(0, eai.a(2)));
      rb.a($$0, O, $$20, a(64, null));
      rb.a($$0, P, $$21, eav.a(16), eam.a(), rb.a, ead.a());
      rb.a($$0, Q, $$21, eav.a(32), eam.a(), rb.a, ead.a());
      rb.a($$0, R, $$22, eai.a(3), eav.a(2), eam.a(), rb.a, ead.a());
      rb.a($$0, S, $$23, eav.a(32), eam.a(), rb.a, ead.a());
      rb.a($$0, T, $$24, eao.a(-0.8, 15, 4), eav.a(32), eam.a(), rb.a, ead.a());
      rb.a($$0, V, $$26, eao.a(-0.8, 5, 10), eam.a(), rb.a, ead.a());
      rb.a($$0, U, $$25, eam.a(), rb.a, ead.a());
      eas $$51 = eay.a(0);
      rb.a($$0, W, $$27, rb.a(0, 0.05F, 1), eam.a(), $$51, rb.d, eae.a(dsc.a(cyu.x.o(), hz.c)), ead.a());
      rb.a($$0, X, $$28, eai.a(16), eam.a(), $$51, rb.d, ead.a());
      rb.a($$0, Y, $$29, eav.a(7), eam.a(), rb.a, eai.a(bku.a(blh.a(-1, 3), 0, 3)), ead.a());
      rb.a($$0, Z, $$29, eav.a(7), eam.a(), rb.a, eai.a(bku.a(blh.a(-3, 1), 0, 1)), ead.a());
      rb.a($$0, aa, $$30, a(rb.a(6, 0.1F, 1)));
      rb.a($$0, ab, $$31, a(eav.a(100)));
      rb.a($$0, ac, $$36, a(rb.a(10, 0.1F, 1), cyu.C));
      rb.a($$0, ad, $$32, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, ae, $$33, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, af, $$34, a(rb.a(5, 0.1F, 1), cyu.x));
      rb.a($$0, ag, $$35, a(rb.a(0, 0.1F, 1), cyu.y));
      rb.a($$0, ah, $$37, rb.a(2, 0.1F, 1), eam.a(), eay.a(2), rb.d, ead.a(), eae.a(dsc.a(cyu.x.o(), hz.c)));
      rb.a($$0, ai, $$38, a(rb.a(2, 0.1F, 1)));
      rb.a($$0, aj, $$38, a(rb.a(1, 0.1F, 1)));
      rb.a($$0, ak, $$39, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, al, $$40, a(rb.a(10, 0.1F, 1), cyu.z));
      rb.a($$0, am, $$41, a(rb.a(3, 0.1F, 1)));
      rb.a($$0, an, $$41, a(rb.a(0, 0.1F, 1)));
      rb.a($$0, ao, $$42, a(rb.a(0, 0.1F, 1)));
      rb.a($$0, ap, $$43, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, aq, $$44, a(rb.a(2, 0.1F, 1)));
      rb.a($$0, ar, $$45, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, as, $$46, a(rb.a(10, 0.1F, 1)));
      rb.a($$0, at, $$47, a(rb.a(50, 0.1F, 1)));
      rb.a($$0, au, $$48, a(rb.a(30, 0.1F, 1)));
      rb.a($$0, av, $$49, eam.a(), rb.a, ead.a());
      rb.a($$0, aw, $$50, eai.a(25), eam.a(), eay.a(5), rb.d, ead.a(), eae.a(dsc.a(cyu.E.o(), hz.c)));
   }
}
