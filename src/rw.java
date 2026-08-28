import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public class rw {
   public static final akt<emo> a = ru.a("bamboo_light");
   public static final akt<emo> b = ru.a("bamboo");
   public static final akt<emo> c = ru.a("vines");
   public static final akt<emo> d = ru.a("patch_sunflower");
   public static final akt<emo> e = ru.a("patch_pumpkin");
   public static final akt<emo> f = ru.a("patch_grass_plain");
   public static final akt<emo> g = ru.a("patch_grass_forest");
   public static final akt<emo> h = ru.a("patch_grass_badlands");
   public static final akt<emo> i = ru.a("patch_grass_savanna");
   public static final akt<emo> j = ru.a("patch_grass_normal");
   public static final akt<emo> k = ru.a("patch_grass_taiga_2");
   public static final akt<emo> l = ru.a("patch_grass_taiga");
   public static final akt<emo> m = ru.a("patch_grass_jungle");
   public static final akt<emo> n = ru.a("grass_bonemeal");
   public static final akt<emo> o = ru.a("patch_dead_bush_2");
   public static final akt<emo> p = ru.a("patch_dead_bush");
   public static final akt<emo> q = ru.a("patch_dead_bush_badlands");
   public static final akt<emo> r = ru.a("patch_melon");
   public static final akt<emo> s = ru.a("patch_melon_sparse");
   public static final akt<emo> t = ru.a("patch_berry_common");
   public static final akt<emo> u = ru.a("patch_berry_rare");
   public static final akt<emo> v = ru.a("patch_waterlily");
   public static final akt<emo> w = ru.a("patch_tall_grass_2");
   public static final akt<emo> x = ru.a("patch_tall_grass");
   public static final akt<emo> y = ru.a("patch_large_fern");
   public static final akt<emo> z = ru.a("patch_cactus_desert");
   public static final akt<emo> A = ru.a("patch_cactus_decorated");
   public static final akt<emo> B = ru.a("patch_sugar_cane_swamp");
   public static final akt<emo> C = ru.a("patch_sugar_cane_desert");
   public static final akt<emo> D = ru.a("patch_sugar_cane_badlands");
   public static final akt<emo> E = ru.a("patch_sugar_cane");
   public static final akt<emo> F = ru.a("brown_mushroom_nether");
   public static final akt<emo> G = ru.a("red_mushroom_nether");
   public static final akt<emo> H = ru.a("brown_mushroom_normal");
   public static final akt<emo> I = ru.a("red_mushroom_normal");
   public static final akt<emo> J = ru.a("brown_mushroom_taiga");
   public static final akt<emo> K = ru.a("red_mushroom_taiga");
   public static final akt<emo> L = ru.a("brown_mushroom_old_growth");
   public static final akt<emo> M = ru.a("red_mushroom_old_growth");
   public static final akt<emo> N = ru.a("brown_mushroom_swamp");
   public static final akt<emo> O = ru.a("red_mushroom_swamp");
   public static final akt<emo> P = ru.a("flower_warm");
   public static final akt<emo> Q = ru.a("flower_default");
   public static final akt<emo> R = ru.a("flower_flower_forest");
   public static final akt<emo> S = ru.a("flower_swamp");
   public static final akt<emo> T = ru.a("flower_plains");
   public static final akt<emo> U = ru.a("flower_meadow");
   public static final akt<emo> V = ru.a("flower_cherry");
   public static final akt<emo> W = ru.a("flower_pale_garden");
   public static final akt<emo> X = ru.a("trees_plains");
   public static final akt<emo> Y = ru.a("dark_forest_vegetation");
   public static final akt<emo> Z = ru.a("pale_garden_vegetation");
   public static final akt<emo> aa = ru.a("flower_forest_flowers");
   public static final akt<emo> ab = ru.a("forest_flowers");
   public static final akt<emo> ac = ru.a("pale_garden_flowers");
   public static final akt<emo> ad = ru.a("pale_moss_patch");
   public static final akt<emo> ae = ru.a("trees_flower_forest");
   public static final akt<emo> af = ru.a("trees_meadow");
   public static final akt<emo> ag = ru.a("trees_cherry");
   public static final akt<emo> ah = ru.a("trees_taiga");
   public static final akt<emo> ai = ru.a("trees_grove");
   public static final akt<emo> aj = ru.a("trees_badlands");
   public static final akt<emo> ak = ru.a("trees_snowy");
   public static final akt<emo> al = ru.a("trees_swamp");
   public static final akt<emo> am = ru.a("trees_windswept_savanna");
   public static final akt<emo> an = ru.a("trees_savanna");
   public static final akt<emo> ao = ru.a("birch_tall");
   public static final akt<emo> ap = ru.a("trees_birch");
   public static final akt<emo> aq = ru.a("trees_windswept_forest");
   public static final akt<emo> ar = ru.a("trees_windswept_hills");
   public static final akt<emo> as = ru.a("trees_water");
   public static final akt<emo> at = ru.a("trees_birch_and_oak");
   public static final akt<emo> au = ru.a("trees_sparse_jungle");
   public static final akt<emo> av = ru.a("trees_old_growth_spruce_taiga");
   public static final akt<emo> aw = ru.a("trees_old_growth_pine_taiga");
   public static final akt<emo> ax = ru.a("trees_jungle");
   public static final akt<emo> ay = ru.a("bamboo_vegetation");
   public static final akt<emo> az = ru.a("mushroom_island_vegetation");
   public static final akt<emo> aA = ru.a("trees_mangrove");
   private static final emr aB = emx.a(0);

   public static List<emr> a(int $$0) {
      return List.of(emg.a($$0), eml.a(), ru.d, emc.a());
   }

   private static List<emr> a(int $$0, @Nullable emr $$1) {
      Builder<emr> $$2 = ImmutableList.builder();
      if ($$1 != null) {
         $$2.add($$1);
      }

      if ($$0 != 0) {
         $$2.add(emu.a($$0));
      }

      $$2.add(eml.a());
      $$2.add(ru.a);
      $$2.add(emc.a());
      return $$2.build();
   }

   private static Builder<emr> b(emr $$0) {
      return ImmutableList.builder().add($$0).add(eml.a()).add(aB).add(ru.e).add(emc.a());
   }

   public static List<emr> a(emr $$0) {
      return b($$0).build();
   }

   public static List<emr> a(emr $$0, djk $$1) {
      return b($$0).add(emd.a(edx.a($$1.m(), ji.c))).build();
   }

   public static void a(qe<emo> $$0) {
      js<efi<?, ?>> $$1 = $$0.a(mc.aL);
      jr<efi<?, ?>> $$2 = $$1.b(rl.a);
      jr<efi<?, ?>> $$3 = $$1.b(rl.b);
      jr<efi<?, ?>> $$4 = $$1.b(rl.c);
      jr<efi<?, ?>> $$5 = $$1.b(rl.f);
      jr<efi<?, ?>> $$6 = $$1.b(rl.g);
      jr<efi<?, ?>> $$7 = $$1.b(rl.j);
      jr<efi<?, ?>> $$8 = $$1.b(rl.i);
      jr<efi<?, ?>> $$9 = $$1.b(rl.k);
      jr<efi<?, ?>> $$10 = $$1.b(rl.l);
      jr<efi<?, ?>> $$11 = $$1.b(rl.m);
      jr<efi<?, ?>> $$12 = $$1.b(rl.n);
      jr<efi<?, ?>> $$13 = $$1.b(rl.h);
      jr<efi<?, ?>> $$14 = $$1.b(rl.o);
      jr<efi<?, ?>> $$15 = $$1.b(rl.p);
      jr<efi<?, ?>> $$16 = $$1.b(rl.q);
      jr<efi<?, ?>> $$17 = $$1.b(rl.r);
      jr<efi<?, ?>> $$18 = $$1.b(rl.s);
      jr<efi<?, ?>> $$19 = $$1.b(rl.d);
      jr<efi<?, ?>> $$20 = $$1.b(rl.e);
      jr<efi<?, ?>> $$21 = $$1.b(rl.t);
      jr<efi<?, ?>> $$22 = $$1.b(rl.u);
      jr<efi<?, ?>> $$23 = $$1.b(rl.v);
      jr<efi<?, ?>> $$24 = $$1.b(rl.w);
      jr<efi<?, ?>> $$25 = $$1.b(rl.x);
      jr<efi<?, ?>> $$26 = $$1.b(rl.y);
      jr<efi<?, ?>> $$27 = $$1.b(rl.z);
      jr<efi<?, ?>> $$28 = $$1.b(rl.Q);
      jr<efi<?, ?>> $$29 = $$1.b(rl.C);
      jr<efi<?, ?>> $$30 = $$1.b(rl.D);
      jr<efi<?, ?>> $$31 = $$1.b(rl.A);
      jr<efi<?, ?>> $$32 = $$1.b(rl.B);
      jr<efi<?, ?>> $$33 = $$1.b(rl.F);
      jr<efi<?, ?>> $$34 = $$1.b(rl.H);
      jr<efi<?, ?>> $$35 = $$1.b(rl.I);
      jr<efi<?, ?>> $$36 = $$1.b(rl.J);
      jr<efi<?, ?>> $$37 = $$1.b(rl.K);
      jr<efi<?, ?>> $$38 = $$1.b(rk.g);
      jr<efi<?, ?>> $$39 = $$1.b(rk.n);
      jr<efi<?, ?>> $$40 = $$1.b(rk.N);
      jr<efi<?, ?>> $$41 = $$1.b(rk.x);
      jr<efi<?, ?>> $$42 = $$1.b(rl.L);
      jr<efi<?, ?>> $$43 = $$1.b(rl.M);
      jr<efi<?, ?>> $$44 = $$1.b(rk.G);
      jr<efi<?, ?>> $$45 = $$1.b(rl.N);
      jr<efi<?, ?>> $$46 = $$1.b(rl.O);
      jr<efi<?, ?>> $$47 = $$1.b(rl.P);
      jr<efi<?, ?>> $$48 = $$1.b(rl.R);
      jr<efi<?, ?>> $$49 = $$1.b(rl.S);
      jr<efi<?, ?>> $$50 = $$1.b(rl.T);
      jr<efi<?, ?>> $$51 = $$1.b(rl.U);
      jr<efi<?, ?>> $$52 = $$1.b(rl.V);
      jr<efi<?, ?>> $$53 = $$1.b(rl.W);
      jr<efi<?, ?>> $$54 = $$1.b(rl.X);
      ru.a($$0, a, $$2, emu.a(4), eml.a(), ru.a, emc.a());
      ru.a($$0, b, $$3, emm.a(160, 80.0, 0.3), eml.a(), ru.d, emc.a());
      ru.a($$0, c, $$4, emg.a(127), eml.a(), emj.a(edk.a(64), edk.a(100)), emc.a());
      ru.a($$0, d, $$5, emu.a(3), eml.a(), ru.a, emc.a());
      ru.a($$0, e, $$6, emu.a(300), eml.a(), ru.a, emc.a());
      ru.a($$0, f, $$7, emn.a(-0.8, 5, 10), eml.a(), ru.d, emc.a());
      ru.a($$0, g, $$7, a(2));
      ru.a($$0, h, $$7, eml.a(), ru.d, emc.a());
      ru.a($$0, i, $$7, a(20));
      ru.a($$0, j, $$7, a(5));
      ru.a($$0, k, $$8, eml.a(), ru.d, emc.a());
      ru.a($$0, l, $$8, a(7));
      ru.a($$0, m, $$9, a(25));
      ru.a($$0, n, $$10, ru.a());
      ru.a($$0, o, $$11, a(2));
      ru.a($$0, p, $$11, eml.a(), ru.d, emc.a());
      ru.a($$0, q, $$11, a(20));
      ru.a($$0, r, $$12, emu.a(6), eml.a(), ru.a, emc.a());
      ru.a($$0, s, $$12, emu.a(64), eml.a(), ru.a, emc.a());
      ru.a($$0, t, $$13, emu.a(32), eml.a(), ru.d, emc.a());
      ru.a($$0, u, $$13, emu.a(384), eml.a(), ru.d, emc.a());
      ru.a($$0, v, $$14, a(4));
      ru.a($$0, w, $$15, emn.a(-0.8, 0, 7), emu.a(32), eml.a(), ru.a, emc.a());
      ru.a($$0, x, $$15, emu.a(5), eml.a(), ru.a, emc.a());
      ru.a($$0, y, $$16, emu.a(5), eml.a(), ru.a, emc.a());
      ru.a($$0, z, $$17, emu.a(6), eml.a(), ru.a, emc.a());
      ru.a($$0, A, $$17, emu.a(13), eml.a(), ru.a, emc.a());
      ru.a($$0, B, $$18, emu.a(3), eml.a(), ru.a, emc.a());
      ru.a($$0, C, $$18, eml.a(), ru.a, emc.a());
      ru.a($$0, D, $$18, emu.a(5), eml.a(), ru.a, emc.a());
      ru.a($$0, E, $$18, emu.a(6), eml.a(), ru.a, emc.a());
      ru.a($$0, F, $$19, emu.a(2), eml.a(), ru.f, emc.a());
      ru.a($$0, G, $$20, emu.a(2), eml.a(), ru.f, emc.a());
      ru.a($$0, H, $$19, a(256, null));
      ru.a($$0, I, $$20, a(512, null));
      ru.a($$0, J, $$19, a(4, null));
      ru.a($$0, K, $$20, a(256, null));
      ru.a($$0, L, $$19, a(4, emg.a(3)));
      ru.a($$0, M, $$20, a(171, null));
      ru.a($$0, N, $$19, a(0, emg.a(2)));
      ru.a($$0, O, $$20, a(64, null));
      ru.a($$0, P, $$21, emu.a(16), eml.a(), ru.a, emc.a());
      ru.a($$0, Q, $$21, emu.a(32), eml.a(), ru.a, emc.a());
      ru.a($$0, R, $$22, emg.a(3), emu.a(2), eml.a(), ru.a, emc.a());
      ru.a($$0, S, $$23, emu.a(32), eml.a(), ru.a, emc.a());
      ru.a($$0, T, $$24, emn.a(-0.8, 15, 4), emu.a(32), eml.a(), ru.a, emc.a());
      ru.a($$0, V, $$26, emn.a(-0.8, 5, 10), eml.a(), ru.a, emc.a());
      ru.a($$0, U, $$25, eml.a(), ru.a, emc.a());
      ru.a($$0, W, $$27, emu.a(32), eml.a(), ru.a, emc.a());
      emr $$55 = emx.a(0);
      ru.a($$0, X, $$28, ru.a(0, 0.05F, 1), eml.a(), $$55, ru.e, emd.a(edx.a(djm.z.m(), ji.c)), emc.a());
      ru.a($$0, Y, $$29, emg.a(16), eml.a(), $$55, ru.e, emc.a());
      ru.a($$0, Z, $$30, emg.a(16), eml.a(), $$55, ru.e, emc.a());
      ru.a($$0, aa, $$31, emu.a(7), eml.a(), ru.a, emg.a(brg.a(brt.a(-1, 3), 0, 3)), emc.a());
      ru.a($$0, ab, $$31, emu.a(7), eml.a(), ru.a, emg.a(brg.a(brt.a(-3, 1), 0, 1)), emc.a());
      ru.a($$0, ac, $$32, emu.a(8), eml.a(), ru.b, emc.a());
      ru.a($$0, ad, $$33, emg.a(1), eml.a(), ru.b, emc.a());
      ru.a($$0, ae, $$34, a(ru.a(6, 0.1F, 1)));
      ru.a($$0, af, $$35, a(emu.a(100)));
      ru.a($$0, ag, $$40, a(ru.a(10, 0.1F, 1), djm.E));
      ru.a($$0, ah, $$36, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ai, $$37, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, aj, $$38, a(ru.a(5, 0.1F, 1), djm.z));
      ru.a($$0, ak, $$39, a(ru.a(0, 0.1F, 1), djm.A));
      ru.a($$0, al, $$41, ru.a(2, 0.1F, 1), eml.a(), emx.a(2), ru.e, emc.a(), emd.a(edx.a(djm.z.m(), ji.c)));
      ru.a($$0, am, $$42, a(ru.a(2, 0.1F, 1)));
      ru.a($$0, an, $$42, a(ru.a(1, 0.1F, 1)));
      ru.a($$0, ao, $$43, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ap, $$44, a(ru.a(10, 0.1F, 1), djm.B));
      ru.a($$0, aq, $$45, a(ru.a(3, 0.1F, 1)));
      ru.a($$0, ar, $$45, a(ru.a(0, 0.1F, 1)));
      ru.a($$0, as, $$46, a(ru.a(0, 0.1F, 1)));
      ru.a($$0, at, $$47, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, au, $$48, a(ru.a(2, 0.1F, 1)));
      ru.a($$0, av, $$49, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, aw, $$50, a(ru.a(10, 0.1F, 1)));
      ru.a($$0, ax, $$51, a(ru.a(50, 0.1F, 1)));
      ru.a($$0, ay, $$52, a(ru.a(30, 0.1F, 1)));
      ru.a($$0, az, $$53, eml.a(), ru.a, emc.a());
      ru.a($$0, aA, $$54, emg.a(25), eml.a(), emx.a(5), ru.e, emc.a(), emd.a(edx.a(djm.H.m(), ji.c)));
   }
}
