import java.util.List;

public class ol {
   public static final aeo<dmy<?, ?>> a = on.a("monster_room");
   public static final aeo<dmy<?, ?>> b = on.a("fossil_coal");
   public static final aeo<dmy<?, ?>> c = on.a("fossil_diamonds");
   public static final aeo<dmy<?, ?>> d = on.a("dripstone_cluster");
   public static final aeo<dmy<?, ?>> e = on.a("large_dripstone");
   public static final aeo<dmy<?, ?>> f = on.a("pointed_dripstone");
   public static final aeo<dmy<?, ?>> g = on.a("underwater_magma");
   public static final aeo<dmy<?, ?>> h = on.a("glow_lichen");
   public static final aeo<dmy<?, ?>> i = on.a("rooted_azalea_tree");
   public static final aeo<dmy<?, ?>> j = on.a("cave_vine");
   public static final aeo<dmy<?, ?>> k = on.a("cave_vine_in_moss");
   public static final aeo<dmy<?, ?>> l = on.a("moss_vegetation");
   public static final aeo<dmy<?, ?>> m = on.a("moss_patch");
   public static final aeo<dmy<?, ?>> n = on.a("moss_patch_bonemeal");
   public static final aeo<dmy<?, ?>> o = on.a("dripleaf");
   public static final aeo<dmy<?, ?>> p = on.a("clay_with_dripleaves");
   public static final aeo<dmy<?, ?>> q = on.a("clay_pool_with_dripleaves");
   public static final aeo<dmy<?, ?>> r = on.a("lush_caves_clay");
   public static final aeo<dmy<?, ?>> s = on.a("moss_patch_ceiling");
   public static final aeo<dmy<?, ?>> t = on.a("spore_blossom");
   public static final aeo<dmy<?, ?>> u = on.a("amethyst_geode");
   public static final aeo<dmy<?, ?>> v = on.a("sculk_patch_deep_dark");
   public static final aeo<dmy<?, ?>> w = on.a("sculk_patch_ancient_city");
   public static final aeo<dmy<?, ?>> x = on.a("sculk_vein");

   private static hf<dub> a(hb $$0) {
      return pc.a(
         dnl.w,
         new dpg(
            List.of(
               dpg.a(new bga(bey.<bft>a().a(bfz.a(0, 4), 2).a(bfq.a(0), 1).a()), drq.a(csl.rD.n().a(dfo.R, $$0))),
               dpg.a(bfq.a(1), drq.a(csl.rC.n().a(dfo.R, $$0)))
            ),
            hb.b,
            dlo.d,
            true
         )
      );
   }

   private static hf<dub> a() {
      return pc.a(
         dnl.S,
         new dqh(
            new dsa(
               bey.<dey>a().a(csl.rE.n().a(czp.b, hb.f), 1).a(csl.rE.n().a(czp.b, hb.e), 1).a(csl.rE.n().a(czp.b, hb.c), 1).a(csl.rE.n().a(czp.b, hb.d), 1)
            )
         )
      );
   }

   public static void a(nn<dmy<?, ?>> $$0) {
      hg<dmy<?, ?>> $$1 = $$0.a(jd.as);
      hg<dyo> $$2 = $$0.a(jd.aA);
      on.a($$0, a, dnl.C);
      List<aep> $$3 = List.of(
         new aep("fossil/spine_1"),
         new aep("fossil/spine_2"),
         new aep("fossil/spine_3"),
         new aep("fossil/spine_4"),
         new aep("fossil/skull_1"),
         new aep("fossil/skull_2"),
         new aep("fossil/skull_3"),
         new aep("fossil/skull_4")
      );
      List<aep> $$4 = List.of(
         new aep("fossil/spine_1_coal"),
         new aep("fossil/spine_2_coal"),
         new aep("fossil/spine_3_coal"),
         new aep("fossil/spine_4_coal"),
         new aep("fossil/skull_1_coal"),
         new aep("fossil/skull_2_coal"),
         new aep("fossil/skull_3_coal"),
         new aep("fossil/skull_4_coal")
      );
      hf<dyo> $$5 = $$2.b(nv.D);
      on.a($$0, b, dnl.p, new dnq($$3, $$4, $$5, $$2.b(nv.E), 4));
      on.a($$0, c, dnl.p, new dnq($$3, $$4, $$5, $$2.b(nv.F), 4));
      on.a($$0, d, dnl.aj, new dpn(12, bfz.a(3, 6), bfz.a(2, 8), 1, 3, bfz.a(2, 4), bfy.b(0.3F, 0.7F), bfn.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      on.a($$0, e, dnl.ak, new dps(30, bfz.a(3, 19), bfy.b(0.4F, 2.0F), 0.33F, bfy.b(0.3F, 0.9F), bfy.b(0.4F, 1.0F), bfy.b(0.0F, 0.3F), 4, 0.6F));
      on.a(
         $$0,
         f,
         dnl.ag,
         new dqi(
            hj.a(
               pc.a(dnl.al, new dpy(0.2F, 0.7F, 0.5F, 0.5F), dtv.a(hb.a, dlo.c(), dlo.d, 12), dug.a(bfq.a(1))),
               pc.a(dnl.al, new dpy(0.2F, 0.7F, 0.5F, 0.5F), dtv.a(hb.b, dlo.c(), dlo.d, 12), dug.a(bfq.a(-1)))
            )
         )
      );
      on.a($$0, g, dnl.B, new dqn(5, 1, 0.5F));
      cxi $$6 = (cxi)csl.fg;
      on.a($$0, h, dnl.A, new dpu($$6, 20, false, true, true, 0.5F, hj.a(csk::q, csl.b, csl.g, csl.e, csl.c, csl.rt, csl.qA, csl.qz, csl.rI)));
      on.a(
         $$0,
         i,
         dnl.z,
         new dqf(
            pc.a($$1.b(os.w)),
            3,
            3,
            apj.bv,
            drq.a(csl.rG),
            20,
            100,
            3,
            2,
            drq.a(csl.rF),
            20,
            2,
            dlo.a(dlo.b(dlo.c(List.of(csl.a, csl.nc, csl.nb)), dlo.a(apj.cf)), dlo.a(hb.a.q(), apj.bZ))
         )
      );
      dsa $$7 = new dsa(bey.<dey>a().a(csl.rv.n(), 4).a(csl.rv.n().a(ctf.s_, Boolean.valueOf(true)), 1));
      drw $$8 = new drw(new dsa(bey.<dey>a().a(csl.ru.n(), 4).a(csl.ru.n().a(ctf.s_, Boolean.valueOf(true)), 1)), ctg.d, bfz.a(23, 25));
      on.a(
         $$0,
         j,
         dnl.w,
         new dpg(
            List.of(dpg.a(new bga(bey.<bft>a().a(bfz.a(0, 19), 2).a(bfz.a(0, 2), 3).a(bfz.a(0, 6), 10).a()), $$7), dpg.a(bfq.a(1), $$8)), hb.a, dlo.c, true
         )
      );
      on.a($$0, k, dnl.w, new dpg(List.of(dpg.a(new bga(bey.<bft>a().a(bfz.a(0, 3), 5).a(bfz.a(1, 7), 1).a()), $$7), dpg.a(bfq.a(1), $$8)), hb.a, dlo.c, true));
      on.a($$0, l, dnl.S, new dqh(new dsa(bey.<dey>a().a(csl.ry.n(), 4).a(csl.rx.n(), 7).a(csl.rz.n(), 25).a(csl.bt.n(), 50).a(csl.iH.n(), 10))));
      on.a($$0, m, dnl.x, new dqo(apj.bt, drq.a(csl.rB), pc.a($$1.b(l)), dts.b, bfq.a(1), 0.0F, 5, 0.8F, bfz.a(4, 7), 0.3F));
      on.a($$0, n, dnl.x, new dqo(apj.bt, drq.a(csl.rB), pc.a($$1.b(l)), dts.b, bfq.a(1), 0.0F, 5, 0.6F, bfz.a(1, 2), 0.75F));
      on.a($$0, o, dnl.ag, new dqi(hj.a(a(), a(hb.f), a(hb.e), a(hb.d), a(hb.c))));
      on.a($$0, p, dnl.x, new dqo(apj.bu, drq.a(csl.dR), pc.a($$1.b(o)), dts.b, bfq.a(3), 0.8F, 2, 0.05F, bfz.a(4, 7), 0.7F));
      on.a($$0, q, dnl.y, new dqo(apj.bu, drq.a(csl.dR), pc.a($$1.b(o)), dts.b, bfq.a(3), 0.8F, 5, 0.1F, bfz.a(4, 7), 0.7F));
      on.a($$0, r, dnl.ah, new dqa(pc.a($$1.b(p)), pc.a($$1.b(q))));
      on.a($$0, s, dnl.x, new dqo(apj.bt, drq.a(csl.rB), pc.a($$1.b(k)), dts.a, bfz.a(1, 2), 0.0F, 5, 0.08F, bfz.a(4, 7), 0.3F));
      on.a($$0, t, dnl.S, new dqh(drq.a(csl.rw)));
      on.a(
         $$0,
         u,
         dnl.ai,
         new dpq(
            new dke(
               drq.a(csl.a),
               drq.a(csl.qt),
               drq.a(csl.qu),
               drq.a(csl.qA),
               drq.a(csl.sd),
               List.of(csl.qy.n(), csl.qx.n(), csl.qw.n(), csl.qv.n()),
               apj.bH,
               apj.bJ
            ),
            new dkg(1.7, 2.2, 3.2, 4.2),
            new dkf(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bfz.a(4, 6),
            bfz.a(3, 4),
            bfz.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      on.a($$0, v, dnl.am, new dqg(10, 32, 64, 0, 1, bfq.a(0), 0.5F));
      on.a($$0, w, dnl.am, new dqg(10, 32, 64, 0, 1, bfz.a(1, 3), 0.5F));
      cxi $$9 = (cxi)csl.qG;
      on.a($$0, x, dnl.A, new dpu($$9, 20, true, true, true, 1.0F, hj.a(csk::q, csl.b, csl.g, csl.e, csl.c, csl.rt, csl.qA, csl.qz, csl.rI)));
   }
}
