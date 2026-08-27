import java.util.List;

public class oq {
   public static final aew<dnj<?, ?>> a = os.a("monster_room");
   public static final aew<dnj<?, ?>> b = os.a("fossil_coal");
   public static final aew<dnj<?, ?>> c = os.a("fossil_diamonds");
   public static final aew<dnj<?, ?>> d = os.a("dripstone_cluster");
   public static final aew<dnj<?, ?>> e = os.a("large_dripstone");
   public static final aew<dnj<?, ?>> f = os.a("pointed_dripstone");
   public static final aew<dnj<?, ?>> g = os.a("underwater_magma");
   public static final aew<dnj<?, ?>> h = os.a("glow_lichen");
   public static final aew<dnj<?, ?>> i = os.a("rooted_azalea_tree");
   public static final aew<dnj<?, ?>> j = os.a("cave_vine");
   public static final aew<dnj<?, ?>> k = os.a("cave_vine_in_moss");
   public static final aew<dnj<?, ?>> l = os.a("moss_vegetation");
   public static final aew<dnj<?, ?>> m = os.a("moss_patch");
   public static final aew<dnj<?, ?>> n = os.a("moss_patch_bonemeal");
   public static final aew<dnj<?, ?>> o = os.a("dripleaf");
   public static final aew<dnj<?, ?>> p = os.a("clay_with_dripleaves");
   public static final aew<dnj<?, ?>> q = os.a("clay_pool_with_dripleaves");
   public static final aew<dnj<?, ?>> r = os.a("lush_caves_clay");
   public static final aew<dnj<?, ?>> s = os.a("moss_patch_ceiling");
   public static final aew<dnj<?, ?>> t = os.a("spore_blossom");
   public static final aew<dnj<?, ?>> u = os.a("amethyst_geode");
   public static final aew<dnj<?, ?>> v = os.a("sculk_patch_deep_dark");
   public static final aew<dnj<?, ?>> w = os.a("sculk_patch_ancient_city");
   public static final aew<dnj<?, ?>> x = os.a("sculk_vein");

   private static hg<dum> a(hc $$0) {
      return ph.a(
         dnw.w,
         new dpr(
            List.of(
               dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 4), 2).a(bga.a(0), 1).a()), dsb.a(csw.rD.n().a(dfz.R, $$0))),
               dpr.a(bga.a(1), dsb.a(csw.rC.n().a(dfz.R, $$0)))
            ),
            hc.b,
            dlz.d,
            true
         )
      );
   }

   private static hg<dum> a() {
      return ph.a(
         dnw.S,
         new dqs(
            new dsl(
               bfi.<dfj>a().a(csw.rE.n().a(daa.b, hc.f), 1).a(csw.rE.n().a(daa.b, hc.e), 1).a(csw.rE.n().a(daa.b, hc.c), 1).a(csw.rE.n().a(daa.b, hc.d), 1)
            )
         )
      );
   }

   public static void a(ns<dnj<?, ?>> $$0) {
      hh<dnj<?, ?>> $$1 = $$0.a(je.as);
      hh<dyz> $$2 = $$0.a(je.aA);
      os.a($$0, a, dnw.C);
      List<aex> $$3 = List.of(
         new aex("fossil/spine_1"),
         new aex("fossil/spine_2"),
         new aex("fossil/spine_3"),
         new aex("fossil/spine_4"),
         new aex("fossil/skull_1"),
         new aex("fossil/skull_2"),
         new aex("fossil/skull_3"),
         new aex("fossil/skull_4")
      );
      List<aex> $$4 = List.of(
         new aex("fossil/spine_1_coal"),
         new aex("fossil/spine_2_coal"),
         new aex("fossil/spine_3_coal"),
         new aex("fossil/spine_4_coal"),
         new aex("fossil/skull_1_coal"),
         new aex("fossil/skull_2_coal"),
         new aex("fossil/skull_3_coal"),
         new aex("fossil/skull_4_coal")
      );
      hg<dyz> $$5 = $$2.b(oa.D);
      os.a($$0, b, dnw.p, new dob($$3, $$4, $$5, $$2.b(oa.E), 4));
      os.a($$0, c, dnw.p, new dob($$3, $$4, $$5, $$2.b(oa.F), 4));
      os.a($$0, d, dnw.aj, new dpy(12, bgj.a(3, 6), bgj.a(2, 8), 1, 3, bgj.a(2, 4), bgi.b(0.3F, 0.7F), bfx.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      os.a($$0, e, dnw.ak, new dqd(30, bgj.a(3, 19), bgi.b(0.4F, 2.0F), 0.33F, bgi.b(0.3F, 0.9F), bgi.b(0.4F, 1.0F), bgi.b(0.0F, 0.3F), 4, 0.6F));
      os.a(
         $$0,
         f,
         dnw.ag,
         new dqt(
            hk.a(
               ph.a(dnw.al, new dqj(0.2F, 0.7F, 0.5F, 0.5F), dug.a(hc.a, dlz.c(), dlz.d, 12), dur.a(bga.a(1))),
               ph.a(dnw.al, new dqj(0.2F, 0.7F, 0.5F, 0.5F), dug.a(hc.b, dlz.c(), dlz.d, 12), dur.a(bga.a(-1)))
            )
         )
      );
      os.a($$0, g, dnw.B, new dqy(5, 1, 0.5F));
      cxt $$6 = (cxt)csw.fg;
      os.a($$0, h, dnw.A, new dqf($$6, 20, false, true, true, 0.5F, hk.a(csv::q, csw.b, csw.g, csw.e, csw.c, csw.rt, csw.qA, csw.qz, csw.rI)));
      os.a(
         $$0,
         i,
         dnw.z,
         new dqq(
            ph.a($$1.b(ox.w)),
            3,
            3,
            apt.bv,
            dsb.a(csw.rG),
            20,
            100,
            3,
            2,
            dsb.a(csw.rF),
            20,
            2,
            dlz.a(dlz.b(dlz.c(List.of(csw.a, csw.nc, csw.nb)), dlz.a(apt.cf)), dlz.a(hc.a.q(), apt.bZ))
         )
      );
      dsl $$7 = new dsl(bfi.<dfj>a().a(csw.rv.n(), 4).a(csw.rv.n().a(ctq.s_, Boolean.valueOf(true)), 1));
      dsh $$8 = new dsh(new dsl(bfi.<dfj>a().a(csw.ru.n(), 4).a(csw.ru.n().a(ctq.s_, Boolean.valueOf(true)), 1)), ctr.d, bgj.a(23, 25));
      os.a(
         $$0,
         j,
         dnw.w,
         new dpr(
            List.of(dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 19), 2).a(bgj.a(0, 2), 3).a(bgj.a(0, 6), 10).a()), $$7), dpr.a(bga.a(1), $$8)), hc.a, dlz.c, true
         )
      );
      os.a($$0, k, dnw.w, new dpr(List.of(dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 3), 5).a(bgj.a(1, 7), 1).a()), $$7), dpr.a(bga.a(1), $$8)), hc.a, dlz.c, true));
      os.a($$0, l, dnw.S, new dqs(new dsl(bfi.<dfj>a().a(csw.ry.n(), 4).a(csw.rx.n(), 7).a(csw.rz.n(), 25).a(csw.bt.n(), 50).a(csw.iH.n(), 10))));
      os.a($$0, m, dnw.x, new dqz(apt.bt, dsb.a(csw.rB), ph.a($$1.b(l)), dud.b, bga.a(1), 0.0F, 5, 0.8F, bgj.a(4, 7), 0.3F));
      os.a($$0, n, dnw.x, new dqz(apt.bt, dsb.a(csw.rB), ph.a($$1.b(l)), dud.b, bga.a(1), 0.0F, 5, 0.6F, bgj.a(1, 2), 0.75F));
      os.a($$0, o, dnw.ag, new dqt(hk.a(a(), a(hc.f), a(hc.e), a(hc.d), a(hc.c))));
      os.a($$0, p, dnw.x, new dqz(apt.bu, dsb.a(csw.dR), ph.a($$1.b(o)), dud.b, bga.a(3), 0.8F, 2, 0.05F, bgj.a(4, 7), 0.7F));
      os.a($$0, q, dnw.y, new dqz(apt.bu, dsb.a(csw.dR), ph.a($$1.b(o)), dud.b, bga.a(3), 0.8F, 5, 0.1F, bgj.a(4, 7), 0.7F));
      os.a($$0, r, dnw.ah, new dql(ph.a($$1.b(p)), ph.a($$1.b(q))));
      os.a($$0, s, dnw.x, new dqz(apt.bt, dsb.a(csw.rB), ph.a($$1.b(k)), dud.a, bgj.a(1, 2), 0.0F, 5, 0.08F, bgj.a(4, 7), 0.3F));
      os.a($$0, t, dnw.S, new dqs(dsb.a(csw.rw)));
      os.a(
         $$0,
         u,
         dnw.ai,
         new dqb(
            new dkp(
               dsb.a(csw.a),
               dsb.a(csw.qt),
               dsb.a(csw.qu),
               dsb.a(csw.qA),
               dsb.a(csw.sd),
               List.of(csw.qy.n(), csw.qx.n(), csw.qw.n(), csw.qv.n()),
               apt.bH,
               apt.bJ
            ),
            new dkr(1.7, 2.2, 3.2, 4.2),
            new dkq(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bgj.a(4, 6),
            bgj.a(3, 4),
            bgj.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      os.a($$0, v, dnw.am, new dqr(10, 32, 64, 0, 1, bga.a(0), 0.5F));
      os.a($$0, w, dnw.am, new dqr(10, 32, 64, 0, 1, bgj.a(1, 3), 0.5F));
      cxt $$9 = (cxt)csw.qG;
      os.a($$0, x, dnw.A, new dqf($$9, 20, true, true, true, 1.0F, hk.a(csv::q, csw.b, csw.g, csw.e, csw.c, csw.rt, csw.qA, csw.qz, csw.rI)));
   }
}
