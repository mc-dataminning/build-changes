import java.util.List;

public class sf {
   public static final ald<eaj<?, ?>> a = sh.a("monster_room");
   public static final ald<eaj<?, ?>> b = sh.a("fossil_coal");
   public static final ald<eaj<?, ?>> c = sh.a("fossil_diamonds");
   public static final ald<eaj<?, ?>> d = sh.a("dripstone_cluster");
   public static final ald<eaj<?, ?>> e = sh.a("large_dripstone");
   public static final ald<eaj<?, ?>> f = sh.a("pointed_dripstone");
   public static final ald<eaj<?, ?>> g = sh.a("underwater_magma");
   public static final ald<eaj<?, ?>> h = sh.a("glow_lichen");
   public static final ald<eaj<?, ?>> i = sh.a("rooted_azalea_tree");
   public static final ald<eaj<?, ?>> j = sh.a("cave_vine");
   public static final ald<eaj<?, ?>> k = sh.a("cave_vine_in_moss");
   public static final ald<eaj<?, ?>> l = sh.a("moss_vegetation");
   public static final ald<eaj<?, ?>> m = sh.a("moss_patch");
   public static final ald<eaj<?, ?>> n = sh.a("moss_patch_bonemeal");
   public static final ald<eaj<?, ?>> o = sh.a("dripleaf");
   public static final ald<eaj<?, ?>> p = sh.a("clay_with_dripleaves");
   public static final ald<eaj<?, ?>> q = sh.a("clay_pool_with_dripleaves");
   public static final ald<eaj<?, ?>> r = sh.a("lush_caves_clay");
   public static final ald<eaj<?, ?>> s = sh.a("moss_patch_ceiling");
   public static final ald<eaj<?, ?>> t = sh.a("spore_blossom");
   public static final ald<eaj<?, ?>> u = sh.a("amethyst_geode");
   public static final ald<eaj<?, ?>> v = sh.a("sculk_patch_deep_dark");
   public static final ald<eaj<?, ?>> w = sh.a("sculk_patch_ancient_city");
   public static final ald<eaj<?, ?>> x = sh.a("sculk_vein");

   private static ji<ehm> a(je $$0) {
      return sw.a(
         eaw.w,
         new ecr(
            List.of(
               ecr.a(new bqe(bpc.<bpx>a().a(bqd.a(0, 4), 2).a(bpu.a(0), 1).a()), efb.a(dez.sE.o().a(dsq.R, $$0))),
               ecr.a(bpu.a(1), efb.a(dez.sD.o().a(dsq.R, $$0)))
            ),
            je.b,
            dyz.d,
            true
         )
      );
   }

   private static ji<ehm> a() {
      return sw.a(
         eaw.S,
         new eds(
            new efl(
               bpc.<dsa>a().a(dez.sF.o().a(dmc.d, je.f), 1).a(dez.sF.o().a(dmc.d, je.e), 1).a(dez.sF.o().a(dmc.d, je.c), 1).a(dez.sF.o().a(dmc.d, je.d), 1)
            )
         )
      );
   }

   public static void a(rc<eaj<?, ?>> $$0) {
      jj<eaj<?, ?>> $$1 = $$0.a(lq.aC);
      jj<emg> $$2 = $$0.a(lq.aK);
      sh.a($$0, a, eaw.C);
      List<ale> $$3 = List.of(
         new ale("fossil/spine_1"),
         new ale("fossil/spine_2"),
         new ale("fossil/spine_3"),
         new ale("fossil/spine_4"),
         new ale("fossil/skull_1"),
         new ale("fossil/skull_2"),
         new ale("fossil/skull_3"),
         new ale("fossil/skull_4")
      );
      List<ale> $$4 = List.of(
         new ale("fossil/spine_1_coal"),
         new ale("fossil/spine_2_coal"),
         new ale("fossil/spine_3_coal"),
         new ale("fossil/spine_4_coal"),
         new ale("fossil/skull_1_coal"),
         new ale("fossil/skull_2_coal"),
         new ale("fossil/skull_3_coal"),
         new ale("fossil/skull_4_coal")
      );
      ji<emg> $$5 = $$2.b(rk.D);
      sh.a($$0, b, eaw.p, new ebb($$3, $$4, $$5, $$2.b(rk.E), 4));
      sh.a($$0, c, eaw.p, new ebb($$3, $$4, $$5, $$2.b(rk.F), 4));
      sh.a($$0, d, eaw.aj, new ecy(12, bqd.a(3, 6), bqd.a(2, 8), 1, 3, bqd.a(2, 4), bqc.b(0.3F, 0.7F), bpr.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sh.a($$0, e, eaw.ak, new edd(30, bqd.a(3, 19), bqc.b(0.4F, 2.0F), 0.33F, bqc.b(0.3F, 0.9F), bqc.b(0.4F, 1.0F), bqc.b(0.0F, 0.3F), 4, 0.6F));
      sh.a(
         $$0,
         f,
         eaw.ag,
         new edt(
            jm.a(
               sw.a(eaw.al, new edj(0.2F, 0.7F, 0.5F, 0.5F), ehg.a(je.a, dyz.c(), dyz.d, 12), ehr.a(bpu.a(1))),
               sw.a(eaw.al, new edj(0.2F, 0.7F, 0.5F, 0.5F), ehg.a(je.b, dyz.c(), dyz.d, 12), ehr.a(bpu.a(-1)))
            )
         )
      );
      sh.a($$0, g, eaw.B, new edy(5, 1, 0.5F));
      djx $$6 = (djx)dez.fg;
      sh.a($$0, h, eaw.A, new edf($$6, 20, false, true, true, 0.5F, jm.a(dex::s, dez.b, dez.g, dez.e, dez.c, dez.su, dez.qN, dez.qz, dez.sJ)));
      sh.a(
         $$0,
         i,
         eaw.z,
         new edq(
            sw.a($$1.b(sm.w)),
            3,
            3,
            awo.bw,
            efb.a(dez.sH),
            20,
            100,
            3,
            2,
            efb.a(dez.sG),
            20,
            2,
            dyz.a(dyz.b(dyz.c(List.of(dez.a, dez.nc, dez.nb)), dyz.a(awo.cn)), dyz.a(je.a.q(), awo.ch))
         )
      );
      efl $$7 = new efl(bpc.<dsa>a().a(dez.sw.o(), 4).a(dez.sw.o().a(dft.r_, Boolean.valueOf(true)), 1));
      efh $$8 = new efh(new efl(bpc.<dsa>a().a(dez.sv.o(), 4).a(dez.sv.o().a(dft.r_, Boolean.valueOf(true)), 1)), dfu.e, bqd.a(23, 25));
      sh.a(
         $$0,
         j,
         eaw.w,
         new ecr(
            List.of(ecr.a(new bqe(bpc.<bpx>a().a(bqd.a(0, 19), 2).a(bqd.a(0, 2), 3).a(bqd.a(0, 6), 10).a()), $$7), ecr.a(bpu.a(1), $$8)), je.a, dyz.c, true
         )
      );
      sh.a($$0, k, eaw.w, new ecr(List.of(ecr.a(new bqe(bpc.<bpx>a().a(bqd.a(0, 3), 5).a(bqd.a(1, 7), 1).a()), $$7), ecr.a(bpu.a(1), $$8)), je.a, dyz.c, true));
      sh.a($$0, l, eaw.S, new eds(new efl(bpc.<dsa>a().a(dez.sz.o(), 4).a(dez.sy.o(), 7).a(dez.sA.o(), 25).a(dez.bt.o(), 50).a(dez.iH.o(), 10))));
      sh.a($$0, m, eaw.x, new edz(awo.bu, efb.a(dez.sC), sw.a($$1.b(l)), ehd.b, bpu.a(1), 0.0F, 5, 0.8F, bqd.a(4, 7), 0.3F));
      sh.a($$0, n, eaw.x, new edz(awo.bu, efb.a(dez.sC), sw.a($$1.b(l)), ehd.b, bpu.a(1), 0.0F, 5, 0.6F, bqd.a(1, 2), 0.75F));
      sh.a($$0, o, eaw.ag, new edt(jm.a(a(), a(je.f), a(je.e), a(je.d), a(je.c))));
      sh.a($$0, p, eaw.x, new edz(awo.bv, efb.a(dez.dR), sw.a($$1.b(o)), ehd.b, bpu.a(3), 0.8F, 2, 0.05F, bqd.a(4, 7), 0.7F));
      sh.a($$0, q, eaw.y, new edz(awo.bv, efb.a(dez.dR), sw.a($$1.b(o)), ehd.b, bpu.a(3), 0.8F, 5, 0.1F, bqd.a(4, 7), 0.7F));
      sh.a($$0, r, eaw.ah, new edl(sw.a($$1.b(p)), sw.a($$1.b(q))));
      sh.a($$0, s, eaw.x, new edz(awo.bu, efb.a(dez.sC), sw.a($$1.b(k)), ehd.a, bqd.a(1, 2), 0.0F, 5, 0.08F, bqd.a(4, 7), 0.3F));
      sh.a($$0, t, eaw.S, new eds(efb.a(dez.sx)));
      sh.a(
         $$0,
         u,
         eaw.ai,
         new edb(
            new dxp(
               efb.a(dez.a),
               efb.a(dez.qt),
               efb.a(dez.qu),
               efb.a(dez.qN),
               efb.a(dez.te),
               List.of(dez.qy.o(), dez.qx.o(), dez.qw.o(), dez.qv.o()),
               awo.bO,
               awo.bQ
            ),
            new dxr(1.7, 2.2, 3.2, 4.2),
            new dxq(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqd.a(4, 6),
            bqd.a(3, 4),
            bqd.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sh.a($$0, v, eaw.am, new edr(10, 32, 64, 0, 1, bpu.a(0), 0.5F));
      sh.a($$0, w, eaw.am, new edr(10, 32, 64, 0, 1, bqd.a(1, 3), 0.5F));
      djx $$9 = (djx)dez.qT;
      sh.a($$0, x, eaw.A, new edf($$9, 20, true, true, true, 1.0F, jm.a(dex::s, dez.b, dez.g, dez.e, dez.c, dez.su, dez.qN, dez.qz, dez.sJ)));
   }
}
