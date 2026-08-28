import java.util.List;

public class sg {
   public static final ale<eam<?, ?>> a = si.a("monster_room");
   public static final ale<eam<?, ?>> b = si.a("fossil_coal");
   public static final ale<eam<?, ?>> c = si.a("fossil_diamonds");
   public static final ale<eam<?, ?>> d = si.a("dripstone_cluster");
   public static final ale<eam<?, ?>> e = si.a("large_dripstone");
   public static final ale<eam<?, ?>> f = si.a("pointed_dripstone");
   public static final ale<eam<?, ?>> g = si.a("underwater_magma");
   public static final ale<eam<?, ?>> h = si.a("glow_lichen");
   public static final ale<eam<?, ?>> i = si.a("rooted_azalea_tree");
   public static final ale<eam<?, ?>> j = si.a("cave_vine");
   public static final ale<eam<?, ?>> k = si.a("cave_vine_in_moss");
   public static final ale<eam<?, ?>> l = si.a("moss_vegetation");
   public static final ale<eam<?, ?>> m = si.a("moss_patch");
   public static final ale<eam<?, ?>> n = si.a("moss_patch_bonemeal");
   public static final ale<eam<?, ?>> o = si.a("dripleaf");
   public static final ale<eam<?, ?>> p = si.a("clay_with_dripleaves");
   public static final ale<eam<?, ?>> q = si.a("clay_pool_with_dripleaves");
   public static final ale<eam<?, ?>> r = si.a("lush_caves_clay");
   public static final ale<eam<?, ?>> s = si.a("moss_patch_ceiling");
   public static final ale<eam<?, ?>> t = si.a("spore_blossom");
   public static final ale<eam<?, ?>> u = si.a("amethyst_geode");
   public static final ale<eam<?, ?>> v = si.a("sculk_patch_deep_dark");
   public static final ale<eam<?, ?>> w = si.a("sculk_patch_ancient_city");
   public static final ale<eam<?, ?>> x = si.a("sculk_vein");

   private static ji<ehp> a(je $$0) {
      return sx.a(
         eaz.w,
         new ecu(
            List.of(
               ecu.a(new bqh(bpf.<bqa>a().a(bqg.a(0, 4), 2).a(bpx.a(0), 1).a()), efe.a(dfc.sE.o().a(dst.R, $$0))),
               ecu.a(bpx.a(1), efe.a(dfc.sD.o().a(dst.R, $$0)))
            ),
            je.b,
            dzc.d,
            true
         )
      );
   }

   private static ji<ehp> a() {
      return sx.a(
         eaz.S,
         new edv(
            new efo(
               bpf.<dsd>a().a(dfc.sF.o().a(dmf.d, je.f), 1).a(dfc.sF.o().a(dmf.d, je.e), 1).a(dfc.sF.o().a(dmf.d, je.c), 1).a(dfc.sF.o().a(dmf.d, je.d), 1)
            )
         )
      );
   }

   public static void a(rc<eam<?, ?>> $$0) {
      jj<eam<?, ?>> $$1 = $$0.a(lq.aC);
      jj<emj> $$2 = $$0.a(lq.aK);
      si.a($$0, a, eaz.C);
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
      ji<emj> $$5 = $$2.b(rk.D);
      si.a($$0, b, eaz.p, new ebe($$3, $$4, $$5, $$2.b(rk.E), 4));
      si.a($$0, c, eaz.p, new ebe($$3, $$4, $$5, $$2.b(rk.F), 4));
      si.a($$0, d, eaz.aj, new edb(12, bqg.a(3, 6), bqg.a(2, 8), 1, 3, bqg.a(2, 4), bqf.b(0.3F, 0.7F), bpu.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      si.a($$0, e, eaz.ak, new edg(30, bqg.a(3, 19), bqf.b(0.4F, 2.0F), 0.33F, bqf.b(0.3F, 0.9F), bqf.b(0.4F, 1.0F), bqf.b(0.0F, 0.3F), 4, 0.6F));
      si.a(
         $$0,
         f,
         eaz.ag,
         new edw(
            jm.a(
               sx.a(eaz.al, new edm(0.2F, 0.7F, 0.5F, 0.5F), ehj.a(je.a, dzc.c(), dzc.d, 12), ehu.a(bpx.a(1))),
               sx.a(eaz.al, new edm(0.2F, 0.7F, 0.5F, 0.5F), ehj.a(je.b, dzc.c(), dzc.d, 12), ehu.a(bpx.a(-1)))
            )
         )
      );
      si.a($$0, g, eaz.B, new eeb(5, 1, 0.5F));
      dka $$6 = (dka)dfc.fg;
      si.a($$0, h, eaz.A, new edi($$6, 20, false, true, true, 0.5F, jm.a(dfa::s, dfc.b, dfc.g, dfc.e, dfc.c, dfc.su, dfc.qN, dfc.qz, dfc.sJ)));
      si.a(
         $$0,
         i,
         eaz.z,
         new edt(
            sx.a($$1.b(sn.w)),
            3,
            3,
            awp.bw,
            efe.a(dfc.sH),
            20,
            100,
            3,
            2,
            efe.a(dfc.sG),
            20,
            2,
            dzc.a(dzc.b(dzc.c(List.of(dfc.a, dfc.nc, dfc.nb)), dzc.a(awp.cn)), dzc.a(je.a.q(), awp.ch))
         )
      );
      efo $$7 = new efo(bpf.<dsd>a().a(dfc.sw.o(), 4).a(dfc.sw.o().a(dfw.r_, Boolean.valueOf(true)), 1));
      efk $$8 = new efk(new efo(bpf.<dsd>a().a(dfc.sv.o(), 4).a(dfc.sv.o().a(dfw.r_, Boolean.valueOf(true)), 1)), dfx.e, bqg.a(23, 25));
      si.a(
         $$0,
         j,
         eaz.w,
         new ecu(
            List.of(ecu.a(new bqh(bpf.<bqa>a().a(bqg.a(0, 19), 2).a(bqg.a(0, 2), 3).a(bqg.a(0, 6), 10).a()), $$7), ecu.a(bpx.a(1), $$8)), je.a, dzc.c, true
         )
      );
      si.a($$0, k, eaz.w, new ecu(List.of(ecu.a(new bqh(bpf.<bqa>a().a(bqg.a(0, 3), 5).a(bqg.a(1, 7), 1).a()), $$7), ecu.a(bpx.a(1), $$8)), je.a, dzc.c, true));
      si.a($$0, l, eaz.S, new edv(new efo(bpf.<dsd>a().a(dfc.sz.o(), 4).a(dfc.sy.o(), 7).a(dfc.sA.o(), 25).a(dfc.bt.o(), 50).a(dfc.iH.o(), 10))));
      si.a($$0, m, eaz.x, new eec(awp.bu, efe.a(dfc.sC), sx.a($$1.b(l)), ehg.b, bpx.a(1), 0.0F, 5, 0.8F, bqg.a(4, 7), 0.3F));
      si.a($$0, n, eaz.x, new eec(awp.bu, efe.a(dfc.sC), sx.a($$1.b(l)), ehg.b, bpx.a(1), 0.0F, 5, 0.6F, bqg.a(1, 2), 0.75F));
      si.a($$0, o, eaz.ag, new edw(jm.a(a(), a(je.f), a(je.e), a(je.d), a(je.c))));
      si.a($$0, p, eaz.x, new eec(awp.bv, efe.a(dfc.dR), sx.a($$1.b(o)), ehg.b, bpx.a(3), 0.8F, 2, 0.05F, bqg.a(4, 7), 0.7F));
      si.a($$0, q, eaz.y, new eec(awp.bv, efe.a(dfc.dR), sx.a($$1.b(o)), ehg.b, bpx.a(3), 0.8F, 5, 0.1F, bqg.a(4, 7), 0.7F));
      si.a($$0, r, eaz.ah, new edo(sx.a($$1.b(p)), sx.a($$1.b(q))));
      si.a($$0, s, eaz.x, new eec(awp.bu, efe.a(dfc.sC), sx.a($$1.b(k)), ehg.a, bqg.a(1, 2), 0.0F, 5, 0.08F, bqg.a(4, 7), 0.3F));
      si.a($$0, t, eaz.S, new edv(efe.a(dfc.sx)));
      si.a(
         $$0,
         u,
         eaz.ai,
         new ede(
            new dxs(
               efe.a(dfc.a),
               efe.a(dfc.qt),
               efe.a(dfc.qu),
               efe.a(dfc.qN),
               efe.a(dfc.te),
               List.of(dfc.qy.o(), dfc.qx.o(), dfc.qw.o(), dfc.qv.o()),
               awp.bO,
               awp.bQ
            ),
            new dxu(1.7, 2.2, 3.2, 4.2),
            new dxt(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqg.a(4, 6),
            bqg.a(3, 4),
            bqg.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      si.a($$0, v, eaz.am, new edu(10, 32, 64, 0, 1, bpx.a(0), 0.5F));
      si.a($$0, w, eaz.am, new edu(10, 32, 64, 0, 1, bqg.a(1, 3), 0.5F));
      dka $$9 = (dka)dfc.qT;
      si.a($$0, x, eaz.A, new edi($$9, 20, true, true, true, 1.0F, jm.a(dfa::s, dfc.b, dfc.g, dfc.e, dfc.c, dfc.su, dfc.qN, dfc.qz, dfc.sJ)));
   }
}
