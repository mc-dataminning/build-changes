import java.util.List;

public class pm {
   public static final afv<dob<?, ?>> a = po.a("monster_room");
   public static final afv<dob<?, ?>> b = po.a("fossil_coal");
   public static final afv<dob<?, ?>> c = po.a("fossil_diamonds");
   public static final afv<dob<?, ?>> d = po.a("dripstone_cluster");
   public static final afv<dob<?, ?>> e = po.a("large_dripstone");
   public static final afv<dob<?, ?>> f = po.a("pointed_dripstone");
   public static final afv<dob<?, ?>> g = po.a("underwater_magma");
   public static final afv<dob<?, ?>> h = po.a("glow_lichen");
   public static final afv<dob<?, ?>> i = po.a("rooted_azalea_tree");
   public static final afv<dob<?, ?>> j = po.a("cave_vine");
   public static final afv<dob<?, ?>> k = po.a("cave_vine_in_moss");
   public static final afv<dob<?, ?>> l = po.a("moss_vegetation");
   public static final afv<dob<?, ?>> m = po.a("moss_patch");
   public static final afv<dob<?, ?>> n = po.a("moss_patch_bonemeal");
   public static final afv<dob<?, ?>> o = po.a("dripleaf");
   public static final afv<dob<?, ?>> p = po.a("clay_with_dripleaves");
   public static final afv<dob<?, ?>> q = po.a("clay_pool_with_dripleaves");
   public static final afv<dob<?, ?>> r = po.a("lush_caves_clay");
   public static final afv<dob<?, ?>> s = po.a("moss_patch_ceiling");
   public static final afv<dob<?, ?>> t = po.a("spore_blossom");
   public static final afv<dob<?, ?>> u = po.a("amethyst_geode");
   public static final afv<dob<?, ?>> v = po.a("sculk_patch_deep_dark");
   public static final afv<dob<?, ?>> w = po.a("sculk_patch_ancient_city");
   public static final afv<dob<?, ?>> x = po.a("sculk_vein");

   private static ib<dve> a(hx $$0) {
      return qd.a(
         doo.w,
         new dqj(
            List.of(
               dqj.a(new bhn(bgl.<bhg>a().a(bhm.a(0, 4), 2).a(bhd.a(0), 1).a()), dst.a(cuc.rD.o().a(dgr.R, $$0))),
               dqj.a(bhd.a(1), dst.a(cuc.rC.o().a(dgr.R, $$0)))
            ),
            hx.b,
            dmr.d,
            true
         )
      );
   }

   private static ib<dve> a() {
      return qd.a(
         doo.S,
         new drk(
            new dtd(
               bgl.<dgb>a().a(cuc.rE.o().a(dbd.d, hx.f), 1).a(cuc.rE.o().a(dbd.d, hx.e), 1).a(cuc.rE.o().a(dbd.d, hx.c), 1).a(cuc.rE.o().a(dbd.d, hx.d), 1)
            )
         )
      );
   }

   public static void a(oo<dob<?, ?>> $$0) {
      ic<dob<?, ?>> $$1 = $$0.a(jz.at);
      ic<dzr> $$2 = $$0.a(jz.aB);
      po.a($$0, a, doo.C);
      List<afw> $$3 = List.of(
         new afw("fossil/spine_1"),
         new afw("fossil/spine_2"),
         new afw("fossil/spine_3"),
         new afw("fossil/spine_4"),
         new afw("fossil/skull_1"),
         new afw("fossil/skull_2"),
         new afw("fossil/skull_3"),
         new afw("fossil/skull_4")
      );
      List<afw> $$4 = List.of(
         new afw("fossil/spine_1_coal"),
         new afw("fossil/spine_2_coal"),
         new afw("fossil/spine_3_coal"),
         new afw("fossil/spine_4_coal"),
         new afw("fossil/skull_1_coal"),
         new afw("fossil/skull_2_coal"),
         new afw("fossil/skull_3_coal"),
         new afw("fossil/skull_4_coal")
      );
      ib<dzr> $$5 = $$2.b(ow.D);
      po.a($$0, b, doo.p, new dot($$3, $$4, $$5, $$2.b(ow.E), 4));
      po.a($$0, c, doo.p, new dot($$3, $$4, $$5, $$2.b(ow.F), 4));
      po.a($$0, d, doo.aj, new dqq(12, bhm.a(3, 6), bhm.a(2, 8), 1, 3, bhm.a(2, 4), bhl.b(0.3F, 0.7F), bha.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      po.a($$0, e, doo.ak, new dqv(30, bhm.a(3, 19), bhl.b(0.4F, 2.0F), 0.33F, bhl.b(0.3F, 0.9F), bhl.b(0.4F, 1.0F), bhl.b(0.0F, 0.3F), 4, 0.6F));
      po.a(
         $$0,
         f,
         doo.ag,
         new drl(
            ig.a(
               qd.a(doo.al, new drb(0.2F, 0.7F, 0.5F, 0.5F), duy.a(hx.a, dmr.c(), dmr.d, 12), dvj.a(bhd.a(1))),
               qd.a(doo.al, new drb(0.2F, 0.7F, 0.5F, 0.5F), duy.a(hx.b, dmr.c(), dmr.d, 12), dvj.a(bhd.a(-1)))
            )
         )
      );
      po.a($$0, g, doo.B, new drq(5, 1, 0.5F));
      cyy $$6 = (cyy)cuc.fg;
      po.a($$0, h, doo.A, new dqx($$6, 20, false, true, true, 0.5F, ig.a(cua::r, cuc.b, cuc.g, cuc.e, cuc.c, cuc.rt, cuc.qA, cuc.qz, cuc.rI)));
      po.a(
         $$0,
         i,
         doo.z,
         new dri(
            qd.a($$1.b(pt.w)),
            3,
            3,
            aqs.bv,
            dst.a(cuc.rG),
            20,
            100,
            3,
            2,
            dst.a(cuc.rF),
            20,
            2,
            dmr.a(dmr.b(dmr.c(List.of(cuc.a, cuc.nc, cuc.nb)), dmr.a(aqs.cf)), dmr.a(hx.a.q(), aqs.bZ))
         )
      );
      dtd $$7 = new dtd(bgl.<dgb>a().a(cuc.rv.o(), 4).a(cuc.rv.o().a(cuw.s_, Boolean.valueOf(true)), 1));
      dsz $$8 = new dsz(new dtd(bgl.<dgb>a().a(cuc.ru.o(), 4).a(cuc.ru.o().a(cuw.s_, Boolean.valueOf(true)), 1)), cux.e, bhm.a(23, 25));
      po.a(
         $$0,
         j,
         doo.w,
         new dqj(
            List.of(dqj.a(new bhn(bgl.<bhg>a().a(bhm.a(0, 19), 2).a(bhm.a(0, 2), 3).a(bhm.a(0, 6), 10).a()), $$7), dqj.a(bhd.a(1), $$8)), hx.a, dmr.c, true
         )
      );
      po.a($$0, k, doo.w, new dqj(List.of(dqj.a(new bhn(bgl.<bhg>a().a(bhm.a(0, 3), 5).a(bhm.a(1, 7), 1).a()), $$7), dqj.a(bhd.a(1), $$8)), hx.a, dmr.c, true));
      po.a($$0, l, doo.S, new drk(new dtd(bgl.<dgb>a().a(cuc.ry.o(), 4).a(cuc.rx.o(), 7).a(cuc.rz.o(), 25).a(cuc.bt.o(), 50).a(cuc.iH.o(), 10))));
      po.a($$0, m, doo.x, new drr(aqs.bt, dst.a(cuc.rB), qd.a($$1.b(l)), duv.b, bhd.a(1), 0.0F, 5, 0.8F, bhm.a(4, 7), 0.3F));
      po.a($$0, n, doo.x, new drr(aqs.bt, dst.a(cuc.rB), qd.a($$1.b(l)), duv.b, bhd.a(1), 0.0F, 5, 0.6F, bhm.a(1, 2), 0.75F));
      po.a($$0, o, doo.ag, new drl(ig.a(a(), a(hx.f), a(hx.e), a(hx.d), a(hx.c))));
      po.a($$0, p, doo.x, new drr(aqs.bu, dst.a(cuc.dR), qd.a($$1.b(o)), duv.b, bhd.a(3), 0.8F, 2, 0.05F, bhm.a(4, 7), 0.7F));
      po.a($$0, q, doo.y, new drr(aqs.bu, dst.a(cuc.dR), qd.a($$1.b(o)), duv.b, bhd.a(3), 0.8F, 5, 0.1F, bhm.a(4, 7), 0.7F));
      po.a($$0, r, doo.ah, new drd(qd.a($$1.b(p)), qd.a($$1.b(q))));
      po.a($$0, s, doo.x, new drr(aqs.bt, dst.a(cuc.rB), qd.a($$1.b(k)), duv.a, bhm.a(1, 2), 0.0F, 5, 0.08F, bhm.a(4, 7), 0.3F));
      po.a($$0, t, doo.S, new drk(dst.a(cuc.rw)));
      po.a(
         $$0,
         u,
         doo.ai,
         new dqt(
            new dlh(
               dst.a(cuc.a),
               dst.a(cuc.qt),
               dst.a(cuc.qu),
               dst.a(cuc.qA),
               dst.a(cuc.sd),
               List.of(cuc.qy.o(), cuc.qx.o(), cuc.qw.o(), cuc.qv.o()),
               aqs.bH,
               aqs.bJ
            ),
            new dlj(1.7, 2.2, 3.2, 4.2),
            new dli(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bhm.a(4, 6),
            bhm.a(3, 4),
            bhm.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      po.a($$0, v, doo.am, new drj(10, 32, 64, 0, 1, bhd.a(0), 0.5F));
      po.a($$0, w, doo.am, new drj(10, 32, 64, 0, 1, bhm.a(1, 3), 0.5F));
      cyy $$9 = (cyy)cuc.qG;
      po.a($$0, x, doo.A, new dqx($$9, 20, true, true, true, 1.0F, ig.a(cua::r, cuc.b, cuc.g, cuc.e, cuc.c, cuc.rt, cuc.qA, cuc.qz, cuc.rI)));
   }
}
