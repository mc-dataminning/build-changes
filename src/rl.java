import java.util.List;

public class rl {
   public static final akj<eay<?, ?>> a = rn.a("monster_room");
   public static final akj<eay<?, ?>> b = rn.a("fossil_coal");
   public static final akj<eay<?, ?>> c = rn.a("fossil_diamonds");
   public static final akj<eay<?, ?>> d = rn.a("dripstone_cluster");
   public static final akj<eay<?, ?>> e = rn.a("large_dripstone");
   public static final akj<eay<?, ?>> f = rn.a("pointed_dripstone");
   public static final akj<eay<?, ?>> g = rn.a("underwater_magma");
   public static final akj<eay<?, ?>> h = rn.a("glow_lichen");
   public static final akj<eay<?, ?>> i = rn.a("rooted_azalea_tree");
   public static final akj<eay<?, ?>> j = rn.a("cave_vine");
   public static final akj<eay<?, ?>> k = rn.a("cave_vine_in_moss");
   public static final akj<eay<?, ?>> l = rn.a("moss_vegetation");
   public static final akj<eay<?, ?>> m = rn.a("moss_patch");
   public static final akj<eay<?, ?>> n = rn.a("moss_patch_bonemeal");
   public static final akj<eay<?, ?>> o = rn.a("dripleaf");
   public static final akj<eay<?, ?>> p = rn.a("clay_with_dripleaves");
   public static final akj<eay<?, ?>> q = rn.a("clay_pool_with_dripleaves");
   public static final akj<eay<?, ?>> r = rn.a("lush_caves_clay");
   public static final akj<eay<?, ?>> s = rn.a("moss_patch_ceiling");
   public static final akj<eay<?, ?>> t = rn.a("spore_blossom");
   public static final akj<eay<?, ?>> u = rn.a("amethyst_geode");
   public static final akj<eay<?, ?>> v = rn.a("sculk_patch_deep_dark");
   public static final akj<eay<?, ?>> w = rn.a("sculk_patch_ancient_city");
   public static final akj<eay<?, ?>> x = rn.a("sculk_vein");

   private static jj<eib> a(jf $$0) {
      return sc.a(
         ebl.w,
         new edg(
            List.of(
               edg.a(new bpt(bor.<bpm>a().a(bps.a(0, 4), 2).a(bpj.a(0), 1).a()), efq.a(dfk.sE.o().a(dtb.R, $$0))),
               edg.a(bpj.a(1), efq.a(dfk.sD.o().a(dtb.R, $$0)))
            ),
            jf.b,
            dzn.d,
            true
         )
      );
   }

   private static jj<eib> a() {
      return sc.a(
         ebl.S,
         new eeh(
            new ega(
               bor.<dsl>a().a(dfk.sF.o().a(dmn.d, jf.f), 1).a(dfk.sF.o().a(dmn.d, jf.e), 1).a(dfk.sF.o().a(dmn.d, jf.c), 1).a(dfk.sF.o().a(dmn.d, jf.d), 1)
            )
         )
      );
   }

   public static void a(qm<eay<?, ?>> $$0) {
      jk<eay<?, ?>> $$1 = $$0.a(lr.aH);
      jk<emw> $$2 = $$0.a(lr.aR);
      rn.a($$0, a, ebl.C);
      List<akk> $$3 = List.of(
         new akk("fossil/spine_1"),
         new akk("fossil/spine_2"),
         new akk("fossil/spine_3"),
         new akk("fossil/spine_4"),
         new akk("fossil/skull_1"),
         new akk("fossil/skull_2"),
         new akk("fossil/skull_3"),
         new akk("fossil/skull_4")
      );
      List<akk> $$4 = List.of(
         new akk("fossil/spine_1_coal"),
         new akk("fossil/spine_2_coal"),
         new akk("fossil/spine_3_coal"),
         new akk("fossil/spine_4_coal"),
         new akk("fossil/skull_1_coal"),
         new akk("fossil/skull_2_coal"),
         new akk("fossil/skull_3_coal"),
         new akk("fossil/skull_4_coal")
      );
      jj<emw> $$5 = $$2.b(qu.D);
      rn.a($$0, b, ebl.p, new ebq($$3, $$4, $$5, $$2.b(qu.E), 4));
      rn.a($$0, c, ebl.p, new ebq($$3, $$4, $$5, $$2.b(qu.F), 4));
      rn.a($$0, d, ebl.aj, new edn(12, bps.a(3, 6), bps.a(2, 8), 1, 3, bps.a(2, 4), bpr.b(0.3F, 0.7F), bpg.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rn.a($$0, e, ebl.ak, new eds(30, bps.a(3, 19), bpr.b(0.4F, 2.0F), 0.33F, bpr.b(0.3F, 0.9F), bpr.b(0.4F, 1.0F), bpr.b(0.0F, 0.3F), 4, 0.6F));
      rn.a(
         $$0,
         f,
         ebl.ag,
         new eei(
            jn.a(
               sc.a(ebl.al, new edy(0.2F, 0.7F, 0.5F, 0.5F), ehv.a(jf.a, dzn.c(), dzn.d, 12), eig.a(bpj.a(1))),
               sc.a(ebl.al, new edy(0.2F, 0.7F, 0.5F, 0.5F), ehv.a(jf.b, dzn.c(), dzn.d, 12), eig.a(bpj.a(-1)))
            )
         )
      );
      rn.a($$0, g, ebl.B, new een(5, 1, 0.5F));
      dki $$6 = (dki)dfk.fg;
      rn.a($$0, h, ebl.A, new edu($$6, 20, false, true, true, 0.5F, jn.a(dfi::s, dfk.b, dfk.g, dfk.e, dfk.c, dfk.su, dfk.qN, dfk.qz, dfk.sJ)));
      rn.a(
         $$0,
         i,
         ebl.z,
         new eef(
            sc.a($$1.b(rs.w)),
            3,
            3,
            avw.bw,
            efq.a(dfk.sH),
            20,
            100,
            3,
            2,
            efq.a(dfk.sG),
            20,
            2,
            dzn.a(dzn.b(dzn.c(List.of(dfk.a, dfk.nc, dfk.nb)), dzn.a(avw.cn)), dzn.a(jf.a.q(), avw.ch))
         )
      );
      ega $$7 = new ega(bor.<dsl>a().a(dfk.sw.o(), 4).a(dfk.sw.o().a(dge.r_, Boolean.valueOf(true)), 1));
      efw $$8 = new efw(new ega(bor.<dsl>a().a(dfk.sv.o(), 4).a(dfk.sv.o().a(dge.r_, Boolean.valueOf(true)), 1)), dgf.e, bps.a(23, 25));
      rn.a(
         $$0,
         j,
         ebl.w,
         new edg(
            List.of(edg.a(new bpt(bor.<bpm>a().a(bps.a(0, 19), 2).a(bps.a(0, 2), 3).a(bps.a(0, 6), 10).a()), $$7), edg.a(bpj.a(1), $$8)), jf.a, dzn.c, true
         )
      );
      rn.a($$0, k, ebl.w, new edg(List.of(edg.a(new bpt(bor.<bpm>a().a(bps.a(0, 3), 5).a(bps.a(1, 7), 1).a()), $$7), edg.a(bpj.a(1), $$8)), jf.a, dzn.c, true));
      rn.a($$0, l, ebl.S, new eeh(new ega(bor.<dsl>a().a(dfk.sz.o(), 4).a(dfk.sy.o(), 7).a(dfk.sA.o(), 25).a(dfk.bt.o(), 50).a(dfk.iH.o(), 10))));
      rn.a($$0, m, ebl.x, new eeo(avw.bu, efq.a(dfk.sC), sc.a($$1.b(l)), ehs.b, bpj.a(1), 0.0F, 5, 0.8F, bps.a(4, 7), 0.3F));
      rn.a($$0, n, ebl.x, new eeo(avw.bu, efq.a(dfk.sC), sc.a($$1.b(l)), ehs.b, bpj.a(1), 0.0F, 5, 0.6F, bps.a(1, 2), 0.75F));
      rn.a($$0, o, ebl.ag, new eei(jn.a(a(), a(jf.f), a(jf.e), a(jf.d), a(jf.c))));
      rn.a($$0, p, ebl.x, new eeo(avw.bv, efq.a(dfk.dR), sc.a($$1.b(o)), ehs.b, bpj.a(3), 0.8F, 2, 0.05F, bps.a(4, 7), 0.7F));
      rn.a($$0, q, ebl.y, new eeo(avw.bv, efq.a(dfk.dR), sc.a($$1.b(o)), ehs.b, bpj.a(3), 0.8F, 5, 0.1F, bps.a(4, 7), 0.7F));
      rn.a($$0, r, ebl.ah, new eea(sc.a($$1.b(p)), sc.a($$1.b(q))));
      rn.a($$0, s, ebl.x, new eeo(avw.bu, efq.a(dfk.sC), sc.a($$1.b(k)), ehs.a, bps.a(1, 2), 0.0F, 5, 0.08F, bps.a(4, 7), 0.3F));
      rn.a($$0, t, ebl.S, new eeh(efq.a(dfk.sx)));
      rn.a(
         $$0,
         u,
         ebl.ai,
         new edq(
            new dyd(
               efq.a(dfk.a),
               efq.a(dfk.qt),
               efq.a(dfk.qu),
               efq.a(dfk.qN),
               efq.a(dfk.te),
               List.of(dfk.qy.o(), dfk.qx.o(), dfk.qw.o(), dfk.qv.o()),
               avw.bO,
               avw.bQ
            ),
            new dyf(1.7, 2.2, 3.2, 4.2),
            new dye(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bps.a(4, 6),
            bps.a(3, 4),
            bps.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rn.a($$0, v, ebl.am, new eeg(10, 32, 64, 0, 1, bpj.a(0), 0.5F));
      rn.a($$0, w, ebl.am, new eeg(10, 32, 64, 0, 1, bps.a(1, 3), 0.5F));
      dki $$9 = (dki)dfk.qT;
      rn.a($$0, x, ebl.A, new edu($$9, 20, true, true, true, 1.0F, jn.a(dfi::s, dfk.b, dfk.g, dfk.e, dfk.c, dfk.su, dfk.qN, dfk.qz, dfk.sJ)));
   }
}
