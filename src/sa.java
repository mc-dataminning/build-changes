import java.util.List;

public class sa {
   public static final alk<eeb<?, ?>> a = sc.a("monster_room");
   public static final alk<eeb<?, ?>> b = sc.a("fossil_coal");
   public static final alk<eeb<?, ?>> c = sc.a("fossil_diamonds");
   public static final alk<eeb<?, ?>> d = sc.a("dripstone_cluster");
   public static final alk<eeb<?, ?>> e = sc.a("large_dripstone");
   public static final alk<eeb<?, ?>> f = sc.a("pointed_dripstone");
   public static final alk<eeb<?, ?>> g = sc.a("underwater_magma");
   public static final alk<eeb<?, ?>> h = sc.a("glow_lichen");
   public static final alk<eeb<?, ?>> i = sc.a("rooted_azalea_tree");
   public static final alk<eeb<?, ?>> j = sc.a("cave_vine");
   public static final alk<eeb<?, ?>> k = sc.a("cave_vine_in_moss");
   public static final alk<eeb<?, ?>> l = sc.a("moss_vegetation");
   public static final alk<eeb<?, ?>> m = sc.a("moss_patch");
   public static final alk<eeb<?, ?>> n = sc.a("moss_patch_bonemeal");
   public static final alk<eeb<?, ?>> o = sc.a("dripleaf");
   public static final alk<eeb<?, ?>> p = sc.a("clay_with_dripleaves");
   public static final alk<eeb<?, ?>> q = sc.a("clay_pool_with_dripleaves");
   public static final alk<eeb<?, ?>> r = sc.a("lush_caves_clay");
   public static final alk<eeb<?, ?>> s = sc.a("moss_patch_ceiling");
   public static final alk<eeb<?, ?>> t = sc.a("spore_blossom");
   public static final alk<eeb<?, ?>> u = sc.a("amethyst_geode");
   public static final alk<eeb<?, ?>> v = sc.a("sculk_patch_deep_dark");
   public static final alk<eeb<?, ?>> w = sc.a("sculk_patch_ancient_city");
   public static final alk<eeb<?, ?>> x = sc.a("sculk_vein");

   private static jq<elf> a(jm $$0) {
      return sr.a(
         eep.w,
         new egk(
            List.of(
               egk.a(new brt(bqp.<brm>a().a(brs.a(0, 4), 2).a(brj.a(0), 1).a()), eiu.a(dil.sE.m().b(dwe.R, $$0))),
               egk.a(brj.a(1), eiu.a(dil.sD.m().b(dwe.R, $$0)))
            ),
            jm.b,
            ecq.d,
            true
         )
      );
   }

   private static jq<elf> a() {
      return sr.a(
         eep.T,
         new ehl(
            new eje(
               bqp.<dvo>a().a(dil.sF.m().b(dpo.d, jm.f), 1).a(dil.sF.m().b(dpo.d, jm.e), 1).a(dil.sF.m().b(dpo.d, jm.c), 1).a(dil.sF.m().b(dpo.d, jm.d), 1)
            )
         )
      );
   }

   public static void a(rb<eeb<?, ?>> $$0) {
      jr<eeb<?, ?>> $$1 = $$0.a(ma.aJ);
      jr<eqb> $$2 = $$0.a(ma.aT);
      sc.a($$0, a, eep.C);
      List<all> $$3 = List.of(
         all.b("fossil/spine_1"),
         all.b("fossil/spine_2"),
         all.b("fossil/spine_3"),
         all.b("fossil/spine_4"),
         all.b("fossil/skull_1"),
         all.b("fossil/skull_2"),
         all.b("fossil/skull_3"),
         all.b("fossil/skull_4")
      );
      List<all> $$4 = List.of(
         all.b("fossil/spine_1_coal"),
         all.b("fossil/spine_2_coal"),
         all.b("fossil/spine_3_coal"),
         all.b("fossil/spine_4_coal"),
         all.b("fossil/skull_1_coal"),
         all.b("fossil/skull_2_coal"),
         all.b("fossil/skull_3_coal"),
         all.b("fossil/skull_4_coal")
      );
      jq<eqb> $$5 = $$2.b(rj.D);
      sc.a($$0, b, eep.p, new eeu($$3, $$4, $$5, $$2.b(rj.E), 4));
      sc.a($$0, c, eep.p, new eeu($$3, $$4, $$5, $$2.b(rj.F), 4));
      sc.a($$0, d, eep.ak, new egr(12, brs.a(3, 6), brs.a(2, 8), 1, 3, brs.a(2, 4), brr.b(0.3F, 0.7F), brg.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sc.a($$0, e, eep.al, new egw(30, brs.a(3, 19), brr.b(0.4F, 2.0F), 0.33F, brr.b(0.3F, 0.9F), brr.b(0.4F, 1.0F), brr.b(0.0F, 0.3F), 4, 0.6F));
      sc.a(
         $$0,
         f,
         eep.ah,
         new ehm(
            ju.a(
               sr.a(eep.am, new ehc(0.2F, 0.7F, 0.5F, 0.5F), eky.a(jm.a, ecq.c(), ecq.d, 12), elk.a(brj.a(1))),
               sr.a(eep.am, new ehc(0.2F, 0.7F, 0.5F, 0.5F), eky.a(jm.b, ecq.c(), ecq.d, 12), elk.a(brj.a(-1)))
            )
         )
      );
      sc.a($$0, g, eep.B, new ehr(5, 1, 0.5F));
      dni $$6 = (dni)dil.fg;
      sc.a($$0, h, eep.A, new egy($$6, 20, false, true, true, 0.5F, ju.a(dij::p, dil.b, dil.g, dil.e, dil.c, dil.su, dil.qN, dil.qz, dil.sJ)));
      sc.a(
         $$0,
         i,
         eep.z,
         new ehj(
            sr.a($$1.b(sh.w)),
            3,
            3,
            axd.bx,
            eiu.a(dil.sH),
            20,
            100,
            3,
            2,
            eiu.a(dil.sG),
            20,
            2,
            ecq.a(ecq.b(ecq.c(List.of(dil.a, dil.nc, dil.nb)), ecq.a(axd.cp)), ecq.a(jm.a.q(), axd.cj))
         )
      );
      eje $$7 = new eje(bqp.<dvo>a().a(dil.sw.m(), 4).a(dil.sw.m().b(djf.v_, Boolean.valueOf(true)), 1));
      eja $$8 = new eja(new eje(bqp.<dvo>a().a(dil.sv.m(), 4).a(dil.sv.m().b(djf.v_, Boolean.valueOf(true)), 1)), djg.e, brs.a(23, 25));
      sc.a(
         $$0,
         j,
         eep.w,
         new egk(
            List.of(egk.a(new brt(bqp.<brm>a().a(brs.a(0, 19), 2).a(brs.a(0, 2), 3).a(brs.a(0, 6), 10).a()), $$7), egk.a(brj.a(1), $$8)), jm.a, ecq.c, true
         )
      );
      sc.a($$0, k, eep.w, new egk(List.of(egk.a(new brt(bqp.<brm>a().a(brs.a(0, 3), 5).a(brs.a(1, 7), 1).a()), $$7), egk.a(brj.a(1), $$8)), jm.a, ecq.c, true));
      sc.a($$0, l, eep.T, new ehl(new eje(bqp.<dvo>a().a(dil.sz.m(), 4).a(dil.sy.m(), 7).a(dil.sA.m(), 25).a(dil.bt.m(), 50).a(dil.iH.m(), 10))));
      sc.a($$0, m, eep.x, new ehs(axd.bv, eiu.a(dil.sC), sr.a($$1.b(l)), ekv.b, brj.a(1), 0.0F, 5, 0.8F, brs.a(4, 7), 0.3F));
      sc.a($$0, n, eep.x, new ehs(axd.bv, eiu.a(dil.sC), sr.a($$1.b(l)), ekv.b, brj.a(1), 0.0F, 5, 0.6F, brs.a(1, 2), 0.75F));
      sc.a($$0, o, eep.ah, new ehm(ju.a(a(), a(jm.f), a(jm.e), a(jm.d), a(jm.c))));
      sc.a($$0, p, eep.x, new ehs(axd.bw, eiu.a(dil.dR), sr.a($$1.b(o)), ekv.b, brj.a(3), 0.8F, 2, 0.05F, brs.a(4, 7), 0.7F));
      sc.a($$0, q, eep.y, new ehs(axd.bw, eiu.a(dil.dR), sr.a($$1.b(o)), ekv.b, brj.a(3), 0.8F, 5, 0.1F, brs.a(4, 7), 0.7F));
      sc.a($$0, r, eep.ai, new ehe(sr.a($$1.b(p)), sr.a($$1.b(q))));
      sc.a($$0, s, eep.x, new ehs(axd.bv, eiu.a(dil.sC), sr.a($$1.b(k)), ekv.a, brs.a(1, 2), 0.0F, 5, 0.08F, brs.a(4, 7), 0.3F));
      sc.a($$0, t, eep.T, new ehl(eiu.a(dil.sx)));
      sc.a(
         $$0,
         u,
         eep.aj,
         new egu(
            new ebg(
               eiu.a(dil.a),
               eiu.a(dil.qt),
               eiu.a(dil.qu),
               eiu.a(dil.qN),
               eiu.a(dil.te),
               List.of(dil.qy.m(), dil.qx.m(), dil.qw.m(), dil.qv.m()),
               axd.bP,
               axd.bR
            ),
            new ebi(1.7, 2.2, 3.2, 4.2),
            new ebh(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            brs.a(4, 6),
            brs.a(3, 4),
            brs.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sc.a($$0, v, eep.an, new ehk(10, 32, 64, 0, 1, brj.a(0), 0.5F));
      sc.a($$0, w, eep.an, new ehk(10, 32, 64, 0, 1, brs.a(1, 3), 0.5F));
      dni $$9 = (dni)dil.qT;
      sc.a($$0, x, eep.A, new egy($$9, 20, true, true, true, 1.0F, ju.a(dij::p, dil.b, dil.g, dil.e, dil.c, dil.su, dil.qN, dil.qz, dil.sJ)));
   }
}
