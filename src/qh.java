import java.util.List;

public class qh {
   public static final ahf<drg<?, ?>> a = qj.a("monster_room");
   public static final ahf<drg<?, ?>> b = qj.a("fossil_coal");
   public static final ahf<drg<?, ?>> c = qj.a("fossil_diamonds");
   public static final ahf<drg<?, ?>> d = qj.a("dripstone_cluster");
   public static final ahf<drg<?, ?>> e = qj.a("large_dripstone");
   public static final ahf<drg<?, ?>> f = qj.a("pointed_dripstone");
   public static final ahf<drg<?, ?>> g = qj.a("underwater_magma");
   public static final ahf<drg<?, ?>> h = qj.a("glow_lichen");
   public static final ahf<drg<?, ?>> i = qj.a("rooted_azalea_tree");
   public static final ahf<drg<?, ?>> j = qj.a("cave_vine");
   public static final ahf<drg<?, ?>> k = qj.a("cave_vine_in_moss");
   public static final ahf<drg<?, ?>> l = qj.a("moss_vegetation");
   public static final ahf<drg<?, ?>> m = qj.a("moss_patch");
   public static final ahf<drg<?, ?>> n = qj.a("moss_patch_bonemeal");
   public static final ahf<drg<?, ?>> o = qj.a("dripleaf");
   public static final ahf<drg<?, ?>> p = qj.a("clay_with_dripleaves");
   public static final ahf<drg<?, ?>> q = qj.a("clay_pool_with_dripleaves");
   public static final ahf<drg<?, ?>> r = qj.a("lush_caves_clay");
   public static final ahf<drg<?, ?>> s = qj.a("moss_patch_ceiling");
   public static final ahf<drg<?, ?>> t = qj.a("spore_blossom");
   public static final ahf<drg<?, ?>> u = qj.a("amethyst_geode");
   public static final ahf<drg<?, ?>> v = qj.a("sculk_patch_deep_dark");
   public static final ahf<drg<?, ?>> w = qj.a("sculk_patch_ancient_city");
   public static final ahf<drg<?, ?>> x = qj.a("sculk_vein");

   private static ih<dyj> a(ic $$0) {
      return qy.a(
         drt.w,
         new dto(
            List.of(
               dto.a(new bjm(bik.<bjf>a().a(bjl.a(0, 4), 2).a(bjc.a(0), 1).a()), dvy.a(cwr.sE.o().a(djw.R, $$0))),
               dto.a(bjc.a(1), dvy.a(cwr.sD.o().a(djw.R, $$0)))
            ),
            ic.b,
            dpw.d,
            true
         )
      );
   }

   private static ih<dyj> a() {
      return qy.a(
         drt.S,
         new dup(
            new dwi(
               bik.<djg>a().a(cwr.sF.o().a(ddt.d, ic.f), 1).a(cwr.sF.o().a(ddt.d, ic.e), 1).a(cwr.sF.o().a(ddt.d, ic.c), 1).a(cwr.sF.o().a(ddt.d, ic.d), 1)
            )
         )
      );
   }

   public static void a(pe<drg<?, ?>> $$0) {
      ii<drg<?, ?>> $$1 = $$0.a(ke.aw);
      ii<edd> $$2 = $$0.a(ke.aE);
      qj.a($$0, a, drt.C);
      List<ahg> $$3 = List.of(
         new ahg("fossil/spine_1"),
         new ahg("fossil/spine_2"),
         new ahg("fossil/spine_3"),
         new ahg("fossil/spine_4"),
         new ahg("fossil/skull_1"),
         new ahg("fossil/skull_2"),
         new ahg("fossil/skull_3"),
         new ahg("fossil/skull_4")
      );
      List<ahg> $$4 = List.of(
         new ahg("fossil/spine_1_coal"),
         new ahg("fossil/spine_2_coal"),
         new ahg("fossil/spine_3_coal"),
         new ahg("fossil/spine_4_coal"),
         new ahg("fossil/skull_1_coal"),
         new ahg("fossil/skull_2_coal"),
         new ahg("fossil/skull_3_coal"),
         new ahg("fossil/skull_4_coal")
      );
      ih<edd> $$5 = $$2.b(pm.D);
      qj.a($$0, b, drt.p, new dry($$3, $$4, $$5, $$2.b(pm.E), 4));
      qj.a($$0, c, drt.p, new dry($$3, $$4, $$5, $$2.b(pm.F), 4));
      qj.a($$0, d, drt.aj, new dtv(12, bjl.a(3, 6), bjl.a(2, 8), 1, 3, bjl.a(2, 4), bjk.b(0.3F, 0.7F), biz.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      qj.a($$0, e, drt.ak, new dua(30, bjl.a(3, 19), bjk.b(0.4F, 2.0F), 0.33F, bjk.b(0.3F, 0.9F), bjk.b(0.4F, 1.0F), bjk.b(0.0F, 0.3F), 4, 0.6F));
      qj.a(
         $$0,
         f,
         drt.ag,
         new duq(
            il.a(
               qy.a(drt.al, new dug(0.2F, 0.7F, 0.5F, 0.5F), dyd.a(ic.a, dpw.c(), dpw.d, 12), dyo.a(bjc.a(1))),
               qy.a(drt.al, new dug(0.2F, 0.7F, 0.5F, 0.5F), dyd.a(ic.b, dpw.c(), dpw.d, 12), dyo.a(bjc.a(-1)))
            )
         )
      );
      qj.a($$0, g, drt.B, new duv(5, 1, 0.5F));
      dbo $$6 = (dbo)cwr.fg;
      qj.a($$0, h, drt.A, new duc($$6, 20, false, true, true, 0.5F, il.a(cwp::r, cwr.b, cwr.g, cwr.e, cwr.c, cwr.su, cwr.qN, cwr.qz, cwr.sJ)));
      qj.a(
         $$0,
         i,
         drt.z,
         new dun(
            qy.a($$1.b(qo.w)),
            3,
            3,
            asg.bv,
            dvy.a(cwr.sH),
            20,
            100,
            3,
            2,
            dvy.a(cwr.sG),
            20,
            2,
            dpw.a(dpw.b(dpw.c(List.of(cwr.a, cwr.nc, cwr.nb)), dpw.a(asg.cf)), dpw.a(ic.a.q(), asg.bZ))
         )
      );
      dwi $$7 = new dwi(bik.<djg>a().a(cwr.sw.o(), 4).a(cwr.sw.o().a(cxl.t_, Boolean.valueOf(true)), 1));
      dwe $$8 = new dwe(new dwi(bik.<djg>a().a(cwr.sv.o(), 4).a(cwr.sv.o().a(cxl.t_, Boolean.valueOf(true)), 1)), cxm.e, bjl.a(23, 25));
      qj.a(
         $$0,
         j,
         drt.w,
         new dto(
            List.of(dto.a(new bjm(bik.<bjf>a().a(bjl.a(0, 19), 2).a(bjl.a(0, 2), 3).a(bjl.a(0, 6), 10).a()), $$7), dto.a(bjc.a(1), $$8)), ic.a, dpw.c, true
         )
      );
      qj.a($$0, k, drt.w, new dto(List.of(dto.a(new bjm(bik.<bjf>a().a(bjl.a(0, 3), 5).a(bjl.a(1, 7), 1).a()), $$7), dto.a(bjc.a(1), $$8)), ic.a, dpw.c, true));
      qj.a($$0, l, drt.S, new dup(new dwi(bik.<djg>a().a(cwr.sz.o(), 4).a(cwr.sy.o(), 7).a(cwr.sA.o(), 25).a(cwr.bt.o(), 50).a(cwr.iH.o(), 10))));
      qj.a($$0, m, drt.x, new duw(asg.bt, dvy.a(cwr.sC), qy.a($$1.b(l)), dya.b, bjc.a(1), 0.0F, 5, 0.8F, bjl.a(4, 7), 0.3F));
      qj.a($$0, n, drt.x, new duw(asg.bt, dvy.a(cwr.sC), qy.a($$1.b(l)), dya.b, bjc.a(1), 0.0F, 5, 0.6F, bjl.a(1, 2), 0.75F));
      qj.a($$0, o, drt.ag, new duq(il.a(a(), a(ic.f), a(ic.e), a(ic.d), a(ic.c))));
      qj.a($$0, p, drt.x, new duw(asg.bu, dvy.a(cwr.dR), qy.a($$1.b(o)), dya.b, bjc.a(3), 0.8F, 2, 0.05F, bjl.a(4, 7), 0.7F));
      qj.a($$0, q, drt.y, new duw(asg.bu, dvy.a(cwr.dR), qy.a($$1.b(o)), dya.b, bjc.a(3), 0.8F, 5, 0.1F, bjl.a(4, 7), 0.7F));
      qj.a($$0, r, drt.ah, new dui(qy.a($$1.b(p)), qy.a($$1.b(q))));
      qj.a($$0, s, drt.x, new duw(asg.bt, dvy.a(cwr.sC), qy.a($$1.b(k)), dya.a, bjl.a(1, 2), 0.0F, 5, 0.08F, bjl.a(4, 7), 0.3F));
      qj.a($$0, t, drt.S, new dup(dvy.a(cwr.sx)));
      qj.a(
         $$0,
         u,
         drt.ai,
         new dty(
            new dom(
               dvy.a(cwr.a),
               dvy.a(cwr.qt),
               dvy.a(cwr.qu),
               dvy.a(cwr.qN),
               dvy.a(cwr.te),
               List.of(cwr.qy.o(), cwr.qx.o(), cwr.qw.o(), cwr.qv.o()),
               asg.bH,
               asg.bJ
            ),
            new doo(1.7, 2.2, 3.2, 4.2),
            new don(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bjl.a(4, 6),
            bjl.a(3, 4),
            bjl.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      qj.a($$0, v, drt.am, new duo(10, 32, 64, 0, 1, bjc.a(0), 0.5F));
      qj.a($$0, w, drt.am, new duo(10, 32, 64, 0, 1, bjl.a(1, 3), 0.5F));
      dbo $$9 = (dbo)cwr.qT;
      qj.a($$0, x, drt.A, new duc($$9, 20, true, true, true, 1.0F, il.a(cwp::r, cwr.b, cwr.g, cwr.e, cwr.c, cwr.su, cwr.qN, cwr.qz, cwr.sJ)));
   }
}
