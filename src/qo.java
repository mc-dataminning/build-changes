import java.util.List;

public class qo {
   public static final ajg<dvf<?, ?>> a = qq.a("monster_room");
   public static final ajg<dvf<?, ?>> b = qq.a("fossil_coal");
   public static final ajg<dvf<?, ?>> c = qq.a("fossil_diamonds");
   public static final ajg<dvf<?, ?>> d = qq.a("dripstone_cluster");
   public static final ajg<dvf<?, ?>> e = qq.a("large_dripstone");
   public static final ajg<dvf<?, ?>> f = qq.a("pointed_dripstone");
   public static final ajg<dvf<?, ?>> g = qq.a("underwater_magma");
   public static final ajg<dvf<?, ?>> h = qq.a("glow_lichen");
   public static final ajg<dvf<?, ?>> i = qq.a("rooted_azalea_tree");
   public static final ajg<dvf<?, ?>> j = qq.a("cave_vine");
   public static final ajg<dvf<?, ?>> k = qq.a("cave_vine_in_moss");
   public static final ajg<dvf<?, ?>> l = qq.a("moss_vegetation");
   public static final ajg<dvf<?, ?>> m = qq.a("moss_patch");
   public static final ajg<dvf<?, ?>> n = qq.a("moss_patch_bonemeal");
   public static final ajg<dvf<?, ?>> o = qq.a("dripleaf");
   public static final ajg<dvf<?, ?>> p = qq.a("clay_with_dripleaves");
   public static final ajg<dvf<?, ?>> q = qq.a("clay_pool_with_dripleaves");
   public static final ajg<dvf<?, ?>> r = qq.a("lush_caves_clay");
   public static final ajg<dvf<?, ?>> s = qq.a("moss_patch_ceiling");
   public static final ajg<dvf<?, ?>> t = qq.a("spore_blossom");
   public static final ajg<dvf<?, ?>> u = qq.a("amethyst_geode");
   public static final ajg<dvf<?, ?>> v = qq.a("sculk_patch_deep_dark");
   public static final ajg<dvf<?, ?>> w = qq.a("sculk_patch_ancient_city");
   public static final ajg<dvf<?, ?>> x = qq.a("sculk_vein");

   private static il<eci> a(ih $$0) {
      return rf.a(
         dvs.w,
         new dxn(
            List.of(
               dxn.a(new bmp(bln.<bmi>a().a(bmo.a(0, 4), 2).a(bmf.a(0), 1).a()), dzx.a(dae.sE.o().a(dnr.R, $$0))),
               dxn.a(bmf.a(1), dzx.a(dae.sD.o().a(dnr.R, $$0)))
            ),
            ih.b,
            dtv.d,
            true
         )
      );
   }

   private static il<eci> a() {
      return rf.a(
         dvs.S,
         new dyo(
            new eah(
               bln.<dnb>a().a(dae.sF.o().a(dhg.d, ih.f), 1).a(dae.sF.o().a(dhg.d, ih.e), 1).a(dae.sF.o().a(dhg.d, ih.c), 1).a(dae.sF.o().a(dhg.d, ih.d), 1)
            )
         )
      );
   }

   public static void a(pl<dvf<?, ?>> $$0) {
      im<dvf<?, ?>> $$1 = $$0.a(kj.ax);
      im<ehc> $$2 = $$0.a(kj.aF);
      qq.a($$0, a, dvs.C);
      List<ajh> $$3 = List.of(
         new ajh("fossil/spine_1"),
         new ajh("fossil/spine_2"),
         new ajh("fossil/spine_3"),
         new ajh("fossil/spine_4"),
         new ajh("fossil/skull_1"),
         new ajh("fossil/skull_2"),
         new ajh("fossil/skull_3"),
         new ajh("fossil/skull_4")
      );
      List<ajh> $$4 = List.of(
         new ajh("fossil/spine_1_coal"),
         new ajh("fossil/spine_2_coal"),
         new ajh("fossil/spine_3_coal"),
         new ajh("fossil/spine_4_coal"),
         new ajh("fossil/skull_1_coal"),
         new ajh("fossil/skull_2_coal"),
         new ajh("fossil/skull_3_coal"),
         new ajh("fossil/skull_4_coal")
      );
      il<ehc> $$5 = $$2.b(pt.D);
      qq.a($$0, b, dvs.p, new dvx($$3, $$4, $$5, $$2.b(pt.E), 4));
      qq.a($$0, c, dvs.p, new dvx($$3, $$4, $$5, $$2.b(pt.F), 4));
      qq.a($$0, d, dvs.aj, new dxu(12, bmo.a(3, 6), bmo.a(2, 8), 1, 3, bmo.a(2, 4), bmn.b(0.3F, 0.7F), bmc.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      qq.a($$0, e, dvs.ak, new dxz(30, bmo.a(3, 19), bmn.b(0.4F, 2.0F), 0.33F, bmn.b(0.3F, 0.9F), bmn.b(0.4F, 1.0F), bmn.b(0.0F, 0.3F), 4, 0.6F));
      qq.a(
         $$0,
         f,
         dvs.ag,
         new dyp(
            ip.a(
               rf.a(dvs.al, new dyf(0.2F, 0.7F, 0.5F, 0.5F), ecc.a(ih.a, dtv.c(), dtv.d, 12), ecn.a(bmf.a(1))),
               rf.a(dvs.al, new dyf(0.2F, 0.7F, 0.5F, 0.5F), ecc.a(ih.b, dtv.c(), dtv.d, 12), ecn.a(bmf.a(-1)))
            )
         )
      );
      qq.a($$0, g, dvs.B, new dyu(5, 1, 0.5F));
      dfb $$6 = (dfb)dae.fg;
      qq.a($$0, h, dvs.A, new dyb($$6, 20, false, true, true, 0.5F, ip.a(dac::r, dae.b, dae.g, dae.e, dae.c, dae.su, dae.qN, dae.qz, dae.sJ)));
      qq.a(
         $$0,
         i,
         dvs.z,
         new dym(
            rf.a($$1.b(qv.w)),
            3,
            3,
            aun.bw,
            dzx.a(dae.sH),
            20,
            100,
            3,
            2,
            dzx.a(dae.sG),
            20,
            2,
            dtv.a(dtv.b(dtv.c(List.of(dae.a, dae.nc, dae.nb)), dtv.a(aun.ch)), dtv.a(ih.a.q(), aun.cb))
         )
      );
      eah $$7 = new eah(bln.<dnb>a().a(dae.sw.o(), 4).a(dae.sw.o().a(day.r_, Boolean.valueOf(true)), 1));
      ead $$8 = new ead(new eah(bln.<dnb>a().a(dae.sv.o(), 4).a(dae.sv.o().a(day.r_, Boolean.valueOf(true)), 1)), daz.e, bmo.a(23, 25));
      qq.a(
         $$0,
         j,
         dvs.w,
         new dxn(
            List.of(dxn.a(new bmp(bln.<bmi>a().a(bmo.a(0, 19), 2).a(bmo.a(0, 2), 3).a(bmo.a(0, 6), 10).a()), $$7), dxn.a(bmf.a(1), $$8)), ih.a, dtv.c, true
         )
      );
      qq.a($$0, k, dvs.w, new dxn(List.of(dxn.a(new bmp(bln.<bmi>a().a(bmo.a(0, 3), 5).a(bmo.a(1, 7), 1).a()), $$7), dxn.a(bmf.a(1), $$8)), ih.a, dtv.c, true));
      qq.a($$0, l, dvs.S, new dyo(new eah(bln.<dnb>a().a(dae.sz.o(), 4).a(dae.sy.o(), 7).a(dae.sA.o(), 25).a(dae.bt.o(), 50).a(dae.iH.o(), 10))));
      qq.a($$0, m, dvs.x, new dyv(aun.bu, dzx.a(dae.sC), rf.a($$1.b(l)), ebz.b, bmf.a(1), 0.0F, 5, 0.8F, bmo.a(4, 7), 0.3F));
      qq.a($$0, n, dvs.x, new dyv(aun.bu, dzx.a(dae.sC), rf.a($$1.b(l)), ebz.b, bmf.a(1), 0.0F, 5, 0.6F, bmo.a(1, 2), 0.75F));
      qq.a($$0, o, dvs.ag, new dyp(ip.a(a(), a(ih.f), a(ih.e), a(ih.d), a(ih.c))));
      qq.a($$0, p, dvs.x, new dyv(aun.bv, dzx.a(dae.dR), rf.a($$1.b(o)), ebz.b, bmf.a(3), 0.8F, 2, 0.05F, bmo.a(4, 7), 0.7F));
      qq.a($$0, q, dvs.y, new dyv(aun.bv, dzx.a(dae.dR), rf.a($$1.b(o)), ebz.b, bmf.a(3), 0.8F, 5, 0.1F, bmo.a(4, 7), 0.7F));
      qq.a($$0, r, dvs.ah, new dyh(rf.a($$1.b(p)), rf.a($$1.b(q))));
      qq.a($$0, s, dvs.x, new dyv(aun.bu, dzx.a(dae.sC), rf.a($$1.b(k)), ebz.a, bmo.a(1, 2), 0.0F, 5, 0.08F, bmo.a(4, 7), 0.3F));
      qq.a($$0, t, dvs.S, new dyo(dzx.a(dae.sx)));
      qq.a(
         $$0,
         u,
         dvs.ai,
         new dxx(
            new dsl(
               dzx.a(dae.a),
               dzx.a(dae.qt),
               dzx.a(dae.qu),
               dzx.a(dae.qN),
               dzx.a(dae.te),
               List.of(dae.qy.o(), dae.qx.o(), dae.qw.o(), dae.qv.o()),
               aun.bI,
               aun.bK
            ),
            new dsn(1.7, 2.2, 3.2, 4.2),
            new dsm(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bmo.a(4, 6),
            bmo.a(3, 4),
            bmo.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      qq.a($$0, v, dvs.am, new dyn(10, 32, 64, 0, 1, bmf.a(0), 0.5F));
      qq.a($$0, w, dvs.am, new dyn(10, 32, 64, 0, 1, bmo.a(1, 3), 0.5F));
      dfb $$9 = (dfb)dae.qT;
      qq.a($$0, x, dvs.A, new dyb($$9, 20, true, true, true, 1.0F, ip.a(dac::r, dae.b, dae.g, dae.e, dae.c, dae.su, dae.qN, dae.qz, dae.sJ)));
   }
}
