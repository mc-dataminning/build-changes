import java.util.List;

public class sg {
   public static final ale<ean<?, ?>> a = si.a("monster_room");
   public static final ale<ean<?, ?>> b = si.a("fossil_coal");
   public static final ale<ean<?, ?>> c = si.a("fossil_diamonds");
   public static final ale<ean<?, ?>> d = si.a("dripstone_cluster");
   public static final ale<ean<?, ?>> e = si.a("large_dripstone");
   public static final ale<ean<?, ?>> f = si.a("pointed_dripstone");
   public static final ale<ean<?, ?>> g = si.a("underwater_magma");
   public static final ale<ean<?, ?>> h = si.a("glow_lichen");
   public static final ale<ean<?, ?>> i = si.a("rooted_azalea_tree");
   public static final ale<ean<?, ?>> j = si.a("cave_vine");
   public static final ale<ean<?, ?>> k = si.a("cave_vine_in_moss");
   public static final ale<ean<?, ?>> l = si.a("moss_vegetation");
   public static final ale<ean<?, ?>> m = si.a("moss_patch");
   public static final ale<ean<?, ?>> n = si.a("moss_patch_bonemeal");
   public static final ale<ean<?, ?>> o = si.a("dripleaf");
   public static final ale<ean<?, ?>> p = si.a("clay_with_dripleaves");
   public static final ale<ean<?, ?>> q = si.a("clay_pool_with_dripleaves");
   public static final ale<ean<?, ?>> r = si.a("lush_caves_clay");
   public static final ale<ean<?, ?>> s = si.a("moss_patch_ceiling");
   public static final ale<ean<?, ?>> t = si.a("spore_blossom");
   public static final ale<ean<?, ?>> u = si.a("amethyst_geode");
   public static final ale<ean<?, ?>> v = si.a("sculk_patch_deep_dark");
   public static final ale<ean<?, ?>> w = si.a("sculk_patch_ancient_city");
   public static final ale<ean<?, ?>> x = si.a("sculk_vein");

   private static ji<ehq> a(je $$0) {
      return sx.a(
         eba.w,
         new ecv(
            List.of(
               ecv.a(new bqi(bpg.<bqb>a().a(bqh.a(0, 4), 2).a(bpy.a(0), 1).a()), eff.a(dfd.sE.o().a(dsu.R, $$0))),
               ecv.a(bpy.a(1), eff.a(dfd.sD.o().a(dsu.R, $$0)))
            ),
            je.b,
            dzd.d,
            true
         )
      );
   }

   private static ji<ehq> a() {
      return sx.a(
         eba.S,
         new edw(
            new efp(
               bpg.<dse>a().a(dfd.sF.o().a(dmg.d, je.f), 1).a(dfd.sF.o().a(dmg.d, je.e), 1).a(dfd.sF.o().a(dmg.d, je.c), 1).a(dfd.sF.o().a(dmg.d, je.d), 1)
            )
         )
      );
   }

   public static void a(rc<ean<?, ?>> $$0) {
      jj<ean<?, ?>> $$1 = $$0.a(lq.aC);
      jj<emk> $$2 = $$0.a(lq.aK);
      si.a($$0, a, eba.C);
      List<alf> $$3 = List.of(
         new alf("fossil/spine_1"),
         new alf("fossil/spine_2"),
         new alf("fossil/spine_3"),
         new alf("fossil/spine_4"),
         new alf("fossil/skull_1"),
         new alf("fossil/skull_2"),
         new alf("fossil/skull_3"),
         new alf("fossil/skull_4")
      );
      List<alf> $$4 = List.of(
         new alf("fossil/spine_1_coal"),
         new alf("fossil/spine_2_coal"),
         new alf("fossil/spine_3_coal"),
         new alf("fossil/spine_4_coal"),
         new alf("fossil/skull_1_coal"),
         new alf("fossil/skull_2_coal"),
         new alf("fossil/skull_3_coal"),
         new alf("fossil/skull_4_coal")
      );
      ji<emk> $$5 = $$2.b(rk.D);
      si.a($$0, b, eba.p, new ebf($$3, $$4, $$5, $$2.b(rk.E), 4));
      si.a($$0, c, eba.p, new ebf($$3, $$4, $$5, $$2.b(rk.F), 4));
      si.a($$0, d, eba.aj, new edc(12, bqh.a(3, 6), bqh.a(2, 8), 1, 3, bqh.a(2, 4), bqg.b(0.3F, 0.7F), bpv.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      si.a($$0, e, eba.ak, new edh(30, bqh.a(3, 19), bqg.b(0.4F, 2.0F), 0.33F, bqg.b(0.3F, 0.9F), bqg.b(0.4F, 1.0F), bqg.b(0.0F, 0.3F), 4, 0.6F));
      si.a(
         $$0,
         f,
         eba.ag,
         new edx(
            jm.a(
               sx.a(eba.al, new edn(0.2F, 0.7F, 0.5F, 0.5F), ehk.a(je.a, dzd.c(), dzd.d, 12), ehv.a(bpy.a(1))),
               sx.a(eba.al, new edn(0.2F, 0.7F, 0.5F, 0.5F), ehk.a(je.b, dzd.c(), dzd.d, 12), ehv.a(bpy.a(-1)))
            )
         )
      );
      si.a($$0, g, eba.B, new eec(5, 1, 0.5F));
      dkb $$6 = (dkb)dfd.fg;
      si.a($$0, h, eba.A, new edj($$6, 20, false, true, true, 0.5F, jm.a(dfb::s, dfd.b, dfd.g, dfd.e, dfd.c, dfd.su, dfd.qN, dfd.qz, dfd.sJ)));
      si.a(
         $$0,
         i,
         eba.z,
         new edu(
            sx.a($$1.b(sn.w)),
            3,
            3,
            awp.bw,
            eff.a(dfd.sH),
            20,
            100,
            3,
            2,
            eff.a(dfd.sG),
            20,
            2,
            dzd.a(dzd.b(dzd.c(List.of(dfd.a, dfd.nc, dfd.nb)), dzd.a(awp.cn)), dzd.a(je.a.q(), awp.ch))
         )
      );
      efp $$7 = new efp(bpg.<dse>a().a(dfd.sw.o(), 4).a(dfd.sw.o().a(dfx.r_, Boolean.valueOf(true)), 1));
      efl $$8 = new efl(new efp(bpg.<dse>a().a(dfd.sv.o(), 4).a(dfd.sv.o().a(dfx.r_, Boolean.valueOf(true)), 1)), dfy.e, bqh.a(23, 25));
      si.a(
         $$0,
         j,
         eba.w,
         new ecv(
            List.of(ecv.a(new bqi(bpg.<bqb>a().a(bqh.a(0, 19), 2).a(bqh.a(0, 2), 3).a(bqh.a(0, 6), 10).a()), $$7), ecv.a(bpy.a(1), $$8)), je.a, dzd.c, true
         )
      );
      si.a($$0, k, eba.w, new ecv(List.of(ecv.a(new bqi(bpg.<bqb>a().a(bqh.a(0, 3), 5).a(bqh.a(1, 7), 1).a()), $$7), ecv.a(bpy.a(1), $$8)), je.a, dzd.c, true));
      si.a($$0, l, eba.S, new edw(new efp(bpg.<dse>a().a(dfd.sz.o(), 4).a(dfd.sy.o(), 7).a(dfd.sA.o(), 25).a(dfd.bt.o(), 50).a(dfd.iH.o(), 10))));
      si.a($$0, m, eba.x, new eed(awp.bu, eff.a(dfd.sC), sx.a($$1.b(l)), ehh.b, bpy.a(1), 0.0F, 5, 0.8F, bqh.a(4, 7), 0.3F));
      si.a($$0, n, eba.x, new eed(awp.bu, eff.a(dfd.sC), sx.a($$1.b(l)), ehh.b, bpy.a(1), 0.0F, 5, 0.6F, bqh.a(1, 2), 0.75F));
      si.a($$0, o, eba.ag, new edx(jm.a(a(), a(je.f), a(je.e), a(je.d), a(je.c))));
      si.a($$0, p, eba.x, new eed(awp.bv, eff.a(dfd.dR), sx.a($$1.b(o)), ehh.b, bpy.a(3), 0.8F, 2, 0.05F, bqh.a(4, 7), 0.7F));
      si.a($$0, q, eba.y, new eed(awp.bv, eff.a(dfd.dR), sx.a($$1.b(o)), ehh.b, bpy.a(3), 0.8F, 5, 0.1F, bqh.a(4, 7), 0.7F));
      si.a($$0, r, eba.ah, new edp(sx.a($$1.b(p)), sx.a($$1.b(q))));
      si.a($$0, s, eba.x, new eed(awp.bu, eff.a(dfd.sC), sx.a($$1.b(k)), ehh.a, bqh.a(1, 2), 0.0F, 5, 0.08F, bqh.a(4, 7), 0.3F));
      si.a($$0, t, eba.S, new edw(eff.a(dfd.sx)));
      si.a(
         $$0,
         u,
         eba.ai,
         new edf(
            new dxt(
               eff.a(dfd.a),
               eff.a(dfd.qt),
               eff.a(dfd.qu),
               eff.a(dfd.qN),
               eff.a(dfd.te),
               List.of(dfd.qy.o(), dfd.qx.o(), dfd.qw.o(), dfd.qv.o()),
               awp.bO,
               awp.bQ
            ),
            new dxv(1.7, 2.2, 3.2, 4.2),
            new dxu(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqh.a(4, 6),
            bqh.a(3, 4),
            bqh.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      si.a($$0, v, eba.am, new edv(10, 32, 64, 0, 1, bpy.a(0), 0.5F));
      si.a($$0, w, eba.am, new edv(10, 32, 64, 0, 1, bqh.a(1, 3), 0.5F));
      dkb $$9 = (dkb)dfd.qT;
      si.a($$0, x, eba.A, new edj($$9, 20, true, true, true, 1.0F, jm.a(dfb::s, dfd.b, dfd.g, dfd.e, dfd.c, dfd.su, dfd.qN, dfd.qz, dfd.sJ)));
   }
}
