import java.util.List;

public class rl {
   public static final akj<eax<?, ?>> a = rn.a("monster_room");
   public static final akj<eax<?, ?>> b = rn.a("fossil_coal");
   public static final akj<eax<?, ?>> c = rn.a("fossil_diamonds");
   public static final akj<eax<?, ?>> d = rn.a("dripstone_cluster");
   public static final akj<eax<?, ?>> e = rn.a("large_dripstone");
   public static final akj<eax<?, ?>> f = rn.a("pointed_dripstone");
   public static final akj<eax<?, ?>> g = rn.a("underwater_magma");
   public static final akj<eax<?, ?>> h = rn.a("glow_lichen");
   public static final akj<eax<?, ?>> i = rn.a("rooted_azalea_tree");
   public static final akj<eax<?, ?>> j = rn.a("cave_vine");
   public static final akj<eax<?, ?>> k = rn.a("cave_vine_in_moss");
   public static final akj<eax<?, ?>> l = rn.a("moss_vegetation");
   public static final akj<eax<?, ?>> m = rn.a("moss_patch");
   public static final akj<eax<?, ?>> n = rn.a("moss_patch_bonemeal");
   public static final akj<eax<?, ?>> o = rn.a("dripleaf");
   public static final akj<eax<?, ?>> p = rn.a("clay_with_dripleaves");
   public static final akj<eax<?, ?>> q = rn.a("clay_pool_with_dripleaves");
   public static final akj<eax<?, ?>> r = rn.a("lush_caves_clay");
   public static final akj<eax<?, ?>> s = rn.a("moss_patch_ceiling");
   public static final akj<eax<?, ?>> t = rn.a("spore_blossom");
   public static final akj<eax<?, ?>> u = rn.a("amethyst_geode");
   public static final akj<eax<?, ?>> v = rn.a("sculk_patch_deep_dark");
   public static final akj<eax<?, ?>> w = rn.a("sculk_patch_ancient_city");
   public static final akj<eax<?, ?>> x = rn.a("sculk_vein");

   private static jj<eia> a(jf $$0) {
      return sc.a(
         ebk.w,
         new edf(
            List.of(
               edf.a(new bps(boq.<bpl>a().a(bpr.a(0, 4), 2).a(bpi.a(0), 1).a()), efp.a(dfj.sE.o().a(dta.R, $$0))),
               edf.a(bpi.a(1), efp.a(dfj.sD.o().a(dta.R, $$0)))
            ),
            jf.b,
            dzm.d,
            true
         )
      );
   }

   private static jj<eia> a() {
      return sc.a(
         ebk.S,
         new eeg(
            new efz(
               boq.<dsk>a().a(dfj.sF.o().a(dmm.d, jf.f), 1).a(dfj.sF.o().a(dmm.d, jf.e), 1).a(dfj.sF.o().a(dmm.d, jf.c), 1).a(dfj.sF.o().a(dmm.d, jf.d), 1)
            )
         )
      );
   }

   public static void a(qm<eax<?, ?>> $$0) {
      jk<eax<?, ?>> $$1 = $$0.a(lr.aH);
      jk<emu> $$2 = $$0.a(lr.aR);
      rn.a($$0, a, ebk.C);
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
      jj<emu> $$5 = $$2.b(qu.D);
      rn.a($$0, b, ebk.p, new ebp($$3, $$4, $$5, $$2.b(qu.E), 4));
      rn.a($$0, c, ebk.p, new ebp($$3, $$4, $$5, $$2.b(qu.F), 4));
      rn.a($$0, d, ebk.aj, new edm(12, bpr.a(3, 6), bpr.a(2, 8), 1, 3, bpr.a(2, 4), bpq.b(0.3F, 0.7F), bpf.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rn.a($$0, e, ebk.ak, new edr(30, bpr.a(3, 19), bpq.b(0.4F, 2.0F), 0.33F, bpq.b(0.3F, 0.9F), bpq.b(0.4F, 1.0F), bpq.b(0.0F, 0.3F), 4, 0.6F));
      rn.a(
         $$0,
         f,
         ebk.ag,
         new eeh(
            jn.a(
               sc.a(ebk.al, new edx(0.2F, 0.7F, 0.5F, 0.5F), ehu.a(jf.a, dzm.c(), dzm.d, 12), eif.a(bpi.a(1))),
               sc.a(ebk.al, new edx(0.2F, 0.7F, 0.5F, 0.5F), ehu.a(jf.b, dzm.c(), dzm.d, 12), eif.a(bpi.a(-1)))
            )
         )
      );
      rn.a($$0, g, ebk.B, new eem(5, 1, 0.5F));
      dkh $$6 = (dkh)dfj.fg;
      rn.a($$0, h, ebk.A, new edt($$6, 20, false, true, true, 0.5F, jn.a(dfh::s, dfj.b, dfj.g, dfj.e, dfj.c, dfj.su, dfj.qN, dfj.qz, dfj.sJ)));
      rn.a(
         $$0,
         i,
         ebk.z,
         new eee(
            sc.a($$1.b(rs.w)),
            3,
            3,
            avw.bw,
            efp.a(dfj.sH),
            20,
            100,
            3,
            2,
            efp.a(dfj.sG),
            20,
            2,
            dzm.a(dzm.b(dzm.c(List.of(dfj.a, dfj.nc, dfj.nb)), dzm.a(avw.cn)), dzm.a(jf.a.q(), avw.ch))
         )
      );
      efz $$7 = new efz(boq.<dsk>a().a(dfj.sw.o(), 4).a(dfj.sw.o().a(dgd.r_, Boolean.valueOf(true)), 1));
      efv $$8 = new efv(new efz(boq.<dsk>a().a(dfj.sv.o(), 4).a(dfj.sv.o().a(dgd.r_, Boolean.valueOf(true)), 1)), dge.e, bpr.a(23, 25));
      rn.a(
         $$0,
         j,
         ebk.w,
         new edf(
            List.of(edf.a(new bps(boq.<bpl>a().a(bpr.a(0, 19), 2).a(bpr.a(0, 2), 3).a(bpr.a(0, 6), 10).a()), $$7), edf.a(bpi.a(1), $$8)), jf.a, dzm.c, true
         )
      );
      rn.a($$0, k, ebk.w, new edf(List.of(edf.a(new bps(boq.<bpl>a().a(bpr.a(0, 3), 5).a(bpr.a(1, 7), 1).a()), $$7), edf.a(bpi.a(1), $$8)), jf.a, dzm.c, true));
      rn.a($$0, l, ebk.S, new eeg(new efz(boq.<dsk>a().a(dfj.sz.o(), 4).a(dfj.sy.o(), 7).a(dfj.sA.o(), 25).a(dfj.bt.o(), 50).a(dfj.iH.o(), 10))));
      rn.a($$0, m, ebk.x, new een(avw.bu, efp.a(dfj.sC), sc.a($$1.b(l)), ehr.b, bpi.a(1), 0.0F, 5, 0.8F, bpr.a(4, 7), 0.3F));
      rn.a($$0, n, ebk.x, new een(avw.bu, efp.a(dfj.sC), sc.a($$1.b(l)), ehr.b, bpi.a(1), 0.0F, 5, 0.6F, bpr.a(1, 2), 0.75F));
      rn.a($$0, o, ebk.ag, new eeh(jn.a(a(), a(jf.f), a(jf.e), a(jf.d), a(jf.c))));
      rn.a($$0, p, ebk.x, new een(avw.bv, efp.a(dfj.dR), sc.a($$1.b(o)), ehr.b, bpi.a(3), 0.8F, 2, 0.05F, bpr.a(4, 7), 0.7F));
      rn.a($$0, q, ebk.y, new een(avw.bv, efp.a(dfj.dR), sc.a($$1.b(o)), ehr.b, bpi.a(3), 0.8F, 5, 0.1F, bpr.a(4, 7), 0.7F));
      rn.a($$0, r, ebk.ah, new edz(sc.a($$1.b(p)), sc.a($$1.b(q))));
      rn.a($$0, s, ebk.x, new een(avw.bu, efp.a(dfj.sC), sc.a($$1.b(k)), ehr.a, bpr.a(1, 2), 0.0F, 5, 0.08F, bpr.a(4, 7), 0.3F));
      rn.a($$0, t, ebk.S, new eeg(efp.a(dfj.sx)));
      rn.a(
         $$0,
         u,
         ebk.ai,
         new edp(
            new dyc(
               efp.a(dfj.a),
               efp.a(dfj.qt),
               efp.a(dfj.qu),
               efp.a(dfj.qN),
               efp.a(dfj.te),
               List.of(dfj.qy.o(), dfj.qx.o(), dfj.qw.o(), dfj.qv.o()),
               avw.bO,
               avw.bQ
            ),
            new dye(1.7, 2.2, 3.2, 4.2),
            new dyd(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bpr.a(4, 6),
            bpr.a(3, 4),
            bpr.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rn.a($$0, v, ebk.am, new eef(10, 32, 64, 0, 1, bpi.a(0), 0.5F));
      rn.a($$0, w, ebk.am, new eef(10, 32, 64, 0, 1, bpr.a(1, 3), 0.5F));
      dkh $$9 = (dkh)dfj.qT;
      rn.a($$0, x, ebk.A, new edt($$9, 20, true, true, true, 1.0F, jn.a(dfh::s, dfj.b, dfj.g, dfj.e, dfj.c, dfj.su, dfj.qN, dfj.qz, dfj.sJ)));
   }
}
