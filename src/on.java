import java.util.List;

public class on {
   public static final aet<dne<?, ?>> a = op.a("monster_room");
   public static final aet<dne<?, ?>> b = op.a("fossil_coal");
   public static final aet<dne<?, ?>> c = op.a("fossil_diamonds");
   public static final aet<dne<?, ?>> d = op.a("dripstone_cluster");
   public static final aet<dne<?, ?>> e = op.a("large_dripstone");
   public static final aet<dne<?, ?>> f = op.a("pointed_dripstone");
   public static final aet<dne<?, ?>> g = op.a("underwater_magma");
   public static final aet<dne<?, ?>> h = op.a("glow_lichen");
   public static final aet<dne<?, ?>> i = op.a("rooted_azalea_tree");
   public static final aet<dne<?, ?>> j = op.a("cave_vine");
   public static final aet<dne<?, ?>> k = op.a("cave_vine_in_moss");
   public static final aet<dne<?, ?>> l = op.a("moss_vegetation");
   public static final aet<dne<?, ?>> m = op.a("moss_patch");
   public static final aet<dne<?, ?>> n = op.a("moss_patch_bonemeal");
   public static final aet<dne<?, ?>> o = op.a("dripleaf");
   public static final aet<dne<?, ?>> p = op.a("clay_with_dripleaves");
   public static final aet<dne<?, ?>> q = op.a("clay_pool_with_dripleaves");
   public static final aet<dne<?, ?>> r = op.a("lush_caves_clay");
   public static final aet<dne<?, ?>> s = op.a("moss_patch_ceiling");
   public static final aet<dne<?, ?>> t = op.a("spore_blossom");
   public static final aet<dne<?, ?>> u = op.a("amethyst_geode");
   public static final aet<dne<?, ?>> v = op.a("sculk_patch_deep_dark");
   public static final aet<dne<?, ?>> w = op.a("sculk_patch_ancient_city");
   public static final aet<dne<?, ?>> x = op.a("sculk_vein");

   private static hg<duh> a(hc $$0) {
      return pe.a(
         dnr.w,
         new dpm(
            List.of(
               dpm.a(new bgf(bfd.<bfy>a().a(bge.a(0, 4), 2).a(bfv.a(0), 1).a()), drw.a(csr.rD.n().a(dfu.R, $$0))),
               dpm.a(bfv.a(1), drw.a(csr.rC.n().a(dfu.R, $$0)))
            ),
            hc.b,
            dlu.d,
            true
         )
      );
   }

   private static hg<duh> a() {
      return pe.a(
         dnr.S,
         new dqn(
            new dsg(
               bfd.<dfe>a().a(csr.rE.n().a(czv.b, hc.f), 1).a(csr.rE.n().a(czv.b, hc.e), 1).a(csr.rE.n().a(czv.b, hc.c), 1).a(csr.rE.n().a(czv.b, hc.d), 1)
            )
         )
      );
   }

   public static void a(np<dne<?, ?>> $$0) {
      hh<dne<?, ?>> $$1 = $$0.a(je.as);
      hh<dyu> $$2 = $$0.a(je.aA);
      op.a($$0, a, dnr.C);
      List<aeu> $$3 = List.of(
         new aeu("fossil/spine_1"),
         new aeu("fossil/spine_2"),
         new aeu("fossil/spine_3"),
         new aeu("fossil/spine_4"),
         new aeu("fossil/skull_1"),
         new aeu("fossil/skull_2"),
         new aeu("fossil/skull_3"),
         new aeu("fossil/skull_4")
      );
      List<aeu> $$4 = List.of(
         new aeu("fossil/spine_1_coal"),
         new aeu("fossil/spine_2_coal"),
         new aeu("fossil/spine_3_coal"),
         new aeu("fossil/spine_4_coal"),
         new aeu("fossil/skull_1_coal"),
         new aeu("fossil/skull_2_coal"),
         new aeu("fossil/skull_3_coal"),
         new aeu("fossil/skull_4_coal")
      );
      hg<dyu> $$5 = $$2.b(nx.D);
      op.a($$0, b, dnr.p, new dnw($$3, $$4, $$5, $$2.b(nx.E), 4));
      op.a($$0, c, dnr.p, new dnw($$3, $$4, $$5, $$2.b(nx.F), 4));
      op.a($$0, d, dnr.aj, new dpt(12, bge.a(3, 6), bge.a(2, 8), 1, 3, bge.a(2, 4), bgd.b(0.3F, 0.7F), bfs.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      op.a($$0, e, dnr.ak, new dpy(30, bge.a(3, 19), bgd.b(0.4F, 2.0F), 0.33F, bgd.b(0.3F, 0.9F), bgd.b(0.4F, 1.0F), bgd.b(0.0F, 0.3F), 4, 0.6F));
      op.a(
         $$0,
         f,
         dnr.ag,
         new dqo(
            hk.a(
               pe.a(dnr.al, new dqe(0.2F, 0.7F, 0.5F, 0.5F), dub.a(hc.a, dlu.c(), dlu.d, 12), dum.a(bfv.a(1))),
               pe.a(dnr.al, new dqe(0.2F, 0.7F, 0.5F, 0.5F), dub.a(hc.b, dlu.c(), dlu.d, 12), dum.a(bfv.a(-1)))
            )
         )
      );
      op.a($$0, g, dnr.B, new dqt(5, 1, 0.5F));
      cxo $$6 = (cxo)csr.fg;
      op.a($$0, h, dnr.A, new dqa($$6, 20, false, true, true, 0.5F, hk.a(csq::q, csr.b, csr.g, csr.e, csr.c, csr.rt, csr.qA, csr.qz, csr.rI)));
      op.a(
         $$0,
         i,
         dnr.z,
         new dql(
            pe.a($$1.b(ou.w)),
            3,
            3,
            apo.bv,
            drw.a(csr.rG),
            20,
            100,
            3,
            2,
            drw.a(csr.rF),
            20,
            2,
            dlu.a(dlu.b(dlu.c(List.of(csr.a, csr.nc, csr.nb)), dlu.a(apo.cf)), dlu.a(hc.a.q(), apo.bZ))
         )
      );
      dsg $$7 = new dsg(bfd.<dfe>a().a(csr.rv.n(), 4).a(csr.rv.n().a(ctl.s_, Boolean.valueOf(true)), 1));
      dsc $$8 = new dsc(new dsg(bfd.<dfe>a().a(csr.ru.n(), 4).a(csr.ru.n().a(ctl.s_, Boolean.valueOf(true)), 1)), ctm.d, bge.a(23, 25));
      op.a(
         $$0,
         j,
         dnr.w,
         new dpm(
            List.of(dpm.a(new bgf(bfd.<bfy>a().a(bge.a(0, 19), 2).a(bge.a(0, 2), 3).a(bge.a(0, 6), 10).a()), $$7), dpm.a(bfv.a(1), $$8)), hc.a, dlu.c, true
         )
      );
      op.a($$0, k, dnr.w, new dpm(List.of(dpm.a(new bgf(bfd.<bfy>a().a(bge.a(0, 3), 5).a(bge.a(1, 7), 1).a()), $$7), dpm.a(bfv.a(1), $$8)), hc.a, dlu.c, true));
      op.a($$0, l, dnr.S, new dqn(new dsg(bfd.<dfe>a().a(csr.ry.n(), 4).a(csr.rx.n(), 7).a(csr.rz.n(), 25).a(csr.bt.n(), 50).a(csr.iH.n(), 10))));
      op.a($$0, m, dnr.x, new dqu(apo.bt, drw.a(csr.rB), pe.a($$1.b(l)), dty.b, bfv.a(1), 0.0F, 5, 0.8F, bge.a(4, 7), 0.3F));
      op.a($$0, n, dnr.x, new dqu(apo.bt, drw.a(csr.rB), pe.a($$1.b(l)), dty.b, bfv.a(1), 0.0F, 5, 0.6F, bge.a(1, 2), 0.75F));
      op.a($$0, o, dnr.ag, new dqo(hk.a(a(), a(hc.f), a(hc.e), a(hc.d), a(hc.c))));
      op.a($$0, p, dnr.x, new dqu(apo.bu, drw.a(csr.dR), pe.a($$1.b(o)), dty.b, bfv.a(3), 0.8F, 2, 0.05F, bge.a(4, 7), 0.7F));
      op.a($$0, q, dnr.y, new dqu(apo.bu, drw.a(csr.dR), pe.a($$1.b(o)), dty.b, bfv.a(3), 0.8F, 5, 0.1F, bge.a(4, 7), 0.7F));
      op.a($$0, r, dnr.ah, new dqg(pe.a($$1.b(p)), pe.a($$1.b(q))));
      op.a($$0, s, dnr.x, new dqu(apo.bt, drw.a(csr.rB), pe.a($$1.b(k)), dty.a, bge.a(1, 2), 0.0F, 5, 0.08F, bge.a(4, 7), 0.3F));
      op.a($$0, t, dnr.S, new dqn(drw.a(csr.rw)));
      op.a(
         $$0,
         u,
         dnr.ai,
         new dpw(
            new dkk(
               drw.a(csr.a),
               drw.a(csr.qt),
               drw.a(csr.qu),
               drw.a(csr.qA),
               drw.a(csr.sd),
               List.of(csr.qy.n(), csr.qx.n(), csr.qw.n(), csr.qv.n()),
               apo.bH,
               apo.bJ
            ),
            new dkm(1.7, 2.2, 3.2, 4.2),
            new dkl(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bge.a(4, 6),
            bge.a(3, 4),
            bge.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      op.a($$0, v, dnr.am, new dqm(10, 32, 64, 0, 1, bfv.a(0), 0.5F));
      op.a($$0, w, dnr.am, new dqm(10, 32, 64, 0, 1, bge.a(1, 3), 0.5F));
      cxo $$9 = (cxo)csr.qG;
      op.a($$0, x, dnr.A, new dqa($$9, 20, true, true, true, 1.0F, hk.a(csq::q, csr.b, csr.g, csr.e, csr.c, csr.rt, csr.qA, csr.qz, csr.rI)));
   }
}
