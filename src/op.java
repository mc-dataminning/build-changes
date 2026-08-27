import java.util.List;

public class op {
   public static final aey<dnd<?, ?>> a = or.a("monster_room");
   public static final aey<dnd<?, ?>> b = or.a("fossil_coal");
   public static final aey<dnd<?, ?>> c = or.a("fossil_diamonds");
   public static final aey<dnd<?, ?>> d = or.a("dripstone_cluster");
   public static final aey<dnd<?, ?>> e = or.a("large_dripstone");
   public static final aey<dnd<?, ?>> f = or.a("pointed_dripstone");
   public static final aey<dnd<?, ?>> g = or.a("underwater_magma");
   public static final aey<dnd<?, ?>> h = or.a("glow_lichen");
   public static final aey<dnd<?, ?>> i = or.a("rooted_azalea_tree");
   public static final aey<dnd<?, ?>> j = or.a("cave_vine");
   public static final aey<dnd<?, ?>> k = or.a("cave_vine_in_moss");
   public static final aey<dnd<?, ?>> l = or.a("moss_vegetation");
   public static final aey<dnd<?, ?>> m = or.a("moss_patch");
   public static final aey<dnd<?, ?>> n = or.a("moss_patch_bonemeal");
   public static final aey<dnd<?, ?>> o = or.a("dripleaf");
   public static final aey<dnd<?, ?>> p = or.a("clay_with_dripleaves");
   public static final aey<dnd<?, ?>> q = or.a("clay_pool_with_dripleaves");
   public static final aey<dnd<?, ?>> r = or.a("lush_caves_clay");
   public static final aey<dnd<?, ?>> s = or.a("moss_patch_ceiling");
   public static final aey<dnd<?, ?>> t = or.a("spore_blossom");
   public static final aey<dnd<?, ?>> u = or.a("amethyst_geode");
   public static final aey<dnd<?, ?>> v = or.a("sculk_patch_deep_dark");
   public static final aey<dnd<?, ?>> w = or.a("sculk_patch_ancient_city");
   public static final aey<dnd<?, ?>> x = or.a("sculk_vein");

   private static he<dug> a(ha $$0) {
      return pg.a(
         dnq.w,
         new dpl(
            List.of(
               dpl.a(new bgq(bfo.<bgj>a().a(bgp.a(0, 4), 2).a(bgg.a(0), 1).a()), drv.a(cte.rD.o().a(dft.R, $$0))),
               dpl.a(bgg.a(1), drv.a(cte.rC.o().a(dft.R, $$0)))
            ),
            ha.b,
            dlt.d,
            true
         )
      );
   }

   private static he<dug> a() {
      return pg.a(
         dnq.S,
         new dqm(
            new dsf(
               bfo.<dfd>a().a(cte.rE.o().a(daf.d, ha.f), 1).a(cte.rE.o().a(daf.d, ha.e), 1).a(cte.rE.o().a(daf.d, ha.c), 1).a(cte.rE.o().a(daf.d, ha.d), 1)
            )
         )
      );
   }

   public static void a(nr<dnd<?, ?>> $$0) {
      hf<dnd<?, ?>> $$1 = $$0.a(jc.at);
      hf<dyt> $$2 = $$0.a(jc.aB);
      or.a($$0, a, dnq.C);
      List<aez> $$3 = List.of(
         new aez("fossil/spine_1"),
         new aez("fossil/spine_2"),
         new aez("fossil/spine_3"),
         new aez("fossil/spine_4"),
         new aez("fossil/skull_1"),
         new aez("fossil/skull_2"),
         new aez("fossil/skull_3"),
         new aez("fossil/skull_4")
      );
      List<aez> $$4 = List.of(
         new aez("fossil/spine_1_coal"),
         new aez("fossil/spine_2_coal"),
         new aez("fossil/spine_3_coal"),
         new aez("fossil/spine_4_coal"),
         new aez("fossil/skull_1_coal"),
         new aez("fossil/skull_2_coal"),
         new aez("fossil/skull_3_coal"),
         new aez("fossil/skull_4_coal")
      );
      he<dyt> $$5 = $$2.b(nz.D);
      or.a($$0, b, dnq.p, new dnv($$3, $$4, $$5, $$2.b(nz.E), 4));
      or.a($$0, c, dnq.p, new dnv($$3, $$4, $$5, $$2.b(nz.F), 4));
      or.a($$0, d, dnq.aj, new dps(12, bgp.a(3, 6), bgp.a(2, 8), 1, 3, bgp.a(2, 4), bgo.b(0.3F, 0.7F), bgd.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      or.a($$0, e, dnq.ak, new dpx(30, bgp.a(3, 19), bgo.b(0.4F, 2.0F), 0.33F, bgo.b(0.3F, 0.9F), bgo.b(0.4F, 1.0F), bgo.b(0.0F, 0.3F), 4, 0.6F));
      or.a(
         $$0,
         f,
         dnq.ag,
         new dqn(
            hi.a(
               pg.a(dnq.al, new dqd(0.2F, 0.7F, 0.5F, 0.5F), dua.a(ha.a, dlt.c(), dlt.d, 12), dul.a(bgg.a(1))),
               pg.a(dnq.al, new dqd(0.2F, 0.7F, 0.5F, 0.5F), dua.a(ha.b, dlt.c(), dlt.d, 12), dul.a(bgg.a(-1)))
            )
         )
      );
      or.a($$0, g, dnq.B, new dqs(5, 1, 0.5F));
      cya $$6 = (cya)cte.fg;
      or.a($$0, h, dnq.A, new dpz($$6, 20, false, true, true, 0.5F, hi.a(ctc::r, cte.b, cte.g, cte.e, cte.c, cte.rt, cte.qA, cte.qz, cte.rI)));
      or.a(
         $$0,
         i,
         dnq.z,
         new dqk(
            pg.a($$1.b(ow.w)),
            3,
            3,
            apv.bv,
            drv.a(cte.rG),
            20,
            100,
            3,
            2,
            drv.a(cte.rF),
            20,
            2,
            dlt.a(dlt.b(dlt.c(List.of(cte.a, cte.nc, cte.nb)), dlt.a(apv.cf)), dlt.a(ha.a.q(), apv.bZ))
         )
      );
      dsf $$7 = new dsf(bfo.<dfd>a().a(cte.rv.o(), 4).a(cte.rv.o().a(cty.s_, Boolean.valueOf(true)), 1));
      dsb $$8 = new dsb(new dsf(bfo.<dfd>a().a(cte.ru.o(), 4).a(cte.ru.o().a(cty.s_, Boolean.valueOf(true)), 1)), ctz.e, bgp.a(23, 25));
      or.a(
         $$0,
         j,
         dnq.w,
         new dpl(
            List.of(dpl.a(new bgq(bfo.<bgj>a().a(bgp.a(0, 19), 2).a(bgp.a(0, 2), 3).a(bgp.a(0, 6), 10).a()), $$7), dpl.a(bgg.a(1), $$8)), ha.a, dlt.c, true
         )
      );
      or.a($$0, k, dnq.w, new dpl(List.of(dpl.a(new bgq(bfo.<bgj>a().a(bgp.a(0, 3), 5).a(bgp.a(1, 7), 1).a()), $$7), dpl.a(bgg.a(1), $$8)), ha.a, dlt.c, true));
      or.a($$0, l, dnq.S, new dqm(new dsf(bfo.<dfd>a().a(cte.ry.o(), 4).a(cte.rx.o(), 7).a(cte.rz.o(), 25).a(cte.bt.o(), 50).a(cte.iH.o(), 10))));
      or.a($$0, m, dnq.x, new dqt(apv.bt, drv.a(cte.rB), pg.a($$1.b(l)), dtx.b, bgg.a(1), 0.0F, 5, 0.8F, bgp.a(4, 7), 0.3F));
      or.a($$0, n, dnq.x, new dqt(apv.bt, drv.a(cte.rB), pg.a($$1.b(l)), dtx.b, bgg.a(1), 0.0F, 5, 0.6F, bgp.a(1, 2), 0.75F));
      or.a($$0, o, dnq.ag, new dqn(hi.a(a(), a(ha.f), a(ha.e), a(ha.d), a(ha.c))));
      or.a($$0, p, dnq.x, new dqt(apv.bu, drv.a(cte.dR), pg.a($$1.b(o)), dtx.b, bgg.a(3), 0.8F, 2, 0.05F, bgp.a(4, 7), 0.7F));
      or.a($$0, q, dnq.y, new dqt(apv.bu, drv.a(cte.dR), pg.a($$1.b(o)), dtx.b, bgg.a(3), 0.8F, 5, 0.1F, bgp.a(4, 7), 0.7F));
      or.a($$0, r, dnq.ah, new dqf(pg.a($$1.b(p)), pg.a($$1.b(q))));
      or.a($$0, s, dnq.x, new dqt(apv.bt, drv.a(cte.rB), pg.a($$1.b(k)), dtx.a, bgp.a(1, 2), 0.0F, 5, 0.08F, bgp.a(4, 7), 0.3F));
      or.a($$0, t, dnq.S, new dqm(drv.a(cte.rw)));
      or.a(
         $$0,
         u,
         dnq.ai,
         new dpv(
            new dkj(
               drv.a(cte.a),
               drv.a(cte.qt),
               drv.a(cte.qu),
               drv.a(cte.qA),
               drv.a(cte.sd),
               List.of(cte.qy.o(), cte.qx.o(), cte.qw.o(), cte.qv.o()),
               apv.bH,
               apv.bJ
            ),
            new dkl(1.7, 2.2, 3.2, 4.2),
            new dkk(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bgp.a(4, 6),
            bgp.a(3, 4),
            bgp.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      or.a($$0, v, dnq.am, new dql(10, 32, 64, 0, 1, bgg.a(0), 0.5F));
      or.a($$0, w, dnq.am, new dql(10, 32, 64, 0, 1, bgp.a(1, 3), 0.5F));
      cya $$9 = (cya)cte.qG;
      or.a($$0, x, dnq.A, new dpz($$9, 20, true, true, true, 1.0F, hi.a(ctc::r, cte.b, cte.g, cte.e, cte.c, cte.rt, cte.qA, cte.qz, cte.rI)));
   }
}
