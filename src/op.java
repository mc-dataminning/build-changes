import java.util.List;

public class op {
   public static final aev<dnj<?, ?>> a = or.a("monster_room");
   public static final aev<dnj<?, ?>> b = or.a("fossil_coal");
   public static final aev<dnj<?, ?>> c = or.a("fossil_diamonds");
   public static final aev<dnj<?, ?>> d = or.a("dripstone_cluster");
   public static final aev<dnj<?, ?>> e = or.a("large_dripstone");
   public static final aev<dnj<?, ?>> f = or.a("pointed_dripstone");
   public static final aev<dnj<?, ?>> g = or.a("underwater_magma");
   public static final aev<dnj<?, ?>> h = or.a("glow_lichen");
   public static final aev<dnj<?, ?>> i = or.a("rooted_azalea_tree");
   public static final aev<dnj<?, ?>> j = or.a("cave_vine");
   public static final aev<dnj<?, ?>> k = or.a("cave_vine_in_moss");
   public static final aev<dnj<?, ?>> l = or.a("moss_vegetation");
   public static final aev<dnj<?, ?>> m = or.a("moss_patch");
   public static final aev<dnj<?, ?>> n = or.a("moss_patch_bonemeal");
   public static final aev<dnj<?, ?>> o = or.a("dripleaf");
   public static final aev<dnj<?, ?>> p = or.a("clay_with_dripleaves");
   public static final aev<dnj<?, ?>> q = or.a("clay_pool_with_dripleaves");
   public static final aev<dnj<?, ?>> r = or.a("lush_caves_clay");
   public static final aev<dnj<?, ?>> s = or.a("moss_patch_ceiling");
   public static final aev<dnj<?, ?>> t = or.a("spore_blossom");
   public static final aev<dnj<?, ?>> u = or.a("amethyst_geode");
   public static final aev<dnj<?, ?>> v = or.a("sculk_patch_deep_dark");
   public static final aev<dnj<?, ?>> w = or.a("sculk_patch_ancient_city");
   public static final aev<dnj<?, ?>> x = or.a("sculk_vein");

   private static he<dum> a(ha $$0) {
      return pg.a(
         dnw.w,
         new dpr(
            List.of(
               dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 4), 2).a(bga.a(0), 1).a()), dsb.a(csw.rD.n().a(dfz.R, $$0))),
               dpr.a(bga.a(1), dsb.a(csw.rC.n().a(dfz.R, $$0)))
            ),
            ha.b,
            dlz.d,
            true
         )
      );
   }

   private static he<dum> a() {
      return pg.a(
         dnw.S,
         new dqs(
            new dsl(
               bfi.<dfj>a().a(csw.rE.n().a(daa.b, ha.f), 1).a(csw.rE.n().a(daa.b, ha.e), 1).a(csw.rE.n().a(daa.b, ha.c), 1).a(csw.rE.n().a(daa.b, ha.d), 1)
            )
         )
      );
   }

   public static void a(nr<dnj<?, ?>> $$0) {
      hf<dnj<?, ?>> $$1 = $$0.a(jc.as);
      hf<dyz> $$2 = $$0.a(jc.aA);
      or.a($$0, a, dnw.C);
      List<aew> $$3 = List.of(
         new aew("fossil/spine_1"),
         new aew("fossil/spine_2"),
         new aew("fossil/spine_3"),
         new aew("fossil/spine_4"),
         new aew("fossil/skull_1"),
         new aew("fossil/skull_2"),
         new aew("fossil/skull_3"),
         new aew("fossil/skull_4")
      );
      List<aew> $$4 = List.of(
         new aew("fossil/spine_1_coal"),
         new aew("fossil/spine_2_coal"),
         new aew("fossil/spine_3_coal"),
         new aew("fossil/spine_4_coal"),
         new aew("fossil/skull_1_coal"),
         new aew("fossil/skull_2_coal"),
         new aew("fossil/skull_3_coal"),
         new aew("fossil/skull_4_coal")
      );
      he<dyz> $$5 = $$2.b(nz.D);
      or.a($$0, b, dnw.p, new dob($$3, $$4, $$5, $$2.b(nz.E), 4));
      or.a($$0, c, dnw.p, new dob($$3, $$4, $$5, $$2.b(nz.F), 4));
      or.a($$0, d, dnw.aj, new dpy(12, bgj.a(3, 6), bgj.a(2, 8), 1, 3, bgj.a(2, 4), bgi.b(0.3F, 0.7F), bfx.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      or.a($$0, e, dnw.ak, new dqd(30, bgj.a(3, 19), bgi.b(0.4F, 2.0F), 0.33F, bgi.b(0.3F, 0.9F), bgi.b(0.4F, 1.0F), bgi.b(0.0F, 0.3F), 4, 0.6F));
      or.a(
         $$0,
         f,
         dnw.ag,
         new dqt(
            hi.a(
               pg.a(dnw.al, new dqj(0.2F, 0.7F, 0.5F, 0.5F), dug.a(ha.a, dlz.c(), dlz.d, 12), dur.a(bga.a(1))),
               pg.a(dnw.al, new dqj(0.2F, 0.7F, 0.5F, 0.5F), dug.a(ha.b, dlz.c(), dlz.d, 12), dur.a(bga.a(-1)))
            )
         )
      );
      or.a($$0, g, dnw.B, new dqy(5, 1, 0.5F));
      cxt $$6 = (cxt)csw.fg;
      or.a($$0, h, dnw.A, new dqf($$6, 20, false, true, true, 0.5F, hi.a(csv::q, csw.b, csw.g, csw.e, csw.c, csw.rt, csw.qA, csw.qz, csw.rI)));
      or.a(
         $$0,
         i,
         dnw.z,
         new dqq(
            pg.a($$1.b(ow.w)),
            3,
            3,
            aps.bv,
            dsb.a(csw.rG),
            20,
            100,
            3,
            2,
            dsb.a(csw.rF),
            20,
            2,
            dlz.a(dlz.b(dlz.c(List.of(csw.a, csw.nc, csw.nb)), dlz.a(aps.cf)), dlz.a(ha.a.q(), aps.bZ))
         )
      );
      dsl $$7 = new dsl(bfi.<dfj>a().a(csw.rv.n(), 4).a(csw.rv.n().a(ctq.s_, Boolean.valueOf(true)), 1));
      dsh $$8 = new dsh(new dsl(bfi.<dfj>a().a(csw.ru.n(), 4).a(csw.ru.n().a(ctq.s_, Boolean.valueOf(true)), 1)), ctr.d, bgj.a(23, 25));
      or.a(
         $$0,
         j,
         dnw.w,
         new dpr(
            List.of(dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 19), 2).a(bgj.a(0, 2), 3).a(bgj.a(0, 6), 10).a()), $$7), dpr.a(bga.a(1), $$8)), ha.a, dlz.c, true
         )
      );
      or.a($$0, k, dnw.w, new dpr(List.of(dpr.a(new bgk(bfi.<bgd>a().a(bgj.a(0, 3), 5).a(bgj.a(1, 7), 1).a()), $$7), dpr.a(bga.a(1), $$8)), ha.a, dlz.c, true));
      or.a($$0, l, dnw.S, new dqs(new dsl(bfi.<dfj>a().a(csw.ry.n(), 4).a(csw.rx.n(), 7).a(csw.rz.n(), 25).a(csw.bt.n(), 50).a(csw.iH.n(), 10))));
      or.a($$0, m, dnw.x, new dqz(aps.bt, dsb.a(csw.rB), pg.a($$1.b(l)), dud.b, bga.a(1), 0.0F, 5, 0.8F, bgj.a(4, 7), 0.3F));
      or.a($$0, n, dnw.x, new dqz(aps.bt, dsb.a(csw.rB), pg.a($$1.b(l)), dud.b, bga.a(1), 0.0F, 5, 0.6F, bgj.a(1, 2), 0.75F));
      or.a($$0, o, dnw.ag, new dqt(hi.a(a(), a(ha.f), a(ha.e), a(ha.d), a(ha.c))));
      or.a($$0, p, dnw.x, new dqz(aps.bu, dsb.a(csw.dR), pg.a($$1.b(o)), dud.b, bga.a(3), 0.8F, 2, 0.05F, bgj.a(4, 7), 0.7F));
      or.a($$0, q, dnw.y, new dqz(aps.bu, dsb.a(csw.dR), pg.a($$1.b(o)), dud.b, bga.a(3), 0.8F, 5, 0.1F, bgj.a(4, 7), 0.7F));
      or.a($$0, r, dnw.ah, new dql(pg.a($$1.b(p)), pg.a($$1.b(q))));
      or.a($$0, s, dnw.x, new dqz(aps.bt, dsb.a(csw.rB), pg.a($$1.b(k)), dud.a, bgj.a(1, 2), 0.0F, 5, 0.08F, bgj.a(4, 7), 0.3F));
      or.a($$0, t, dnw.S, new dqs(dsb.a(csw.rw)));
      or.a(
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
               aps.bH,
               aps.bJ
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
      or.a($$0, v, dnw.am, new dqr(10, 32, 64, 0, 1, bga.a(0), 0.5F));
      or.a($$0, w, dnw.am, new dqr(10, 32, 64, 0, 1, bgj.a(1, 3), 0.5F));
      cxt $$9 = (cxt)csw.qG;
      or.a($$0, x, dnw.A, new dqf($$9, 20, true, true, true, 1.0F, hi.a(csv::q, csw.b, csw.g, csw.e, csw.c, csw.rt, csw.qA, csw.qz, csw.rI)));
   }
}
