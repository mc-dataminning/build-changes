import java.util.List;

public class ry {
   public static final ali<eei<?, ?>> a = sa.a("monster_room");
   public static final ali<eei<?, ?>> b = sa.a("fossil_coal");
   public static final ali<eei<?, ?>> c = sa.a("fossil_diamonds");
   public static final ali<eei<?, ?>> d = sa.a("dripstone_cluster");
   public static final ali<eei<?, ?>> e = sa.a("large_dripstone");
   public static final ali<eei<?, ?>> f = sa.a("pointed_dripstone");
   public static final ali<eei<?, ?>> g = sa.a("underwater_magma");
   public static final ali<eei<?, ?>> h = sa.a("glow_lichen");
   public static final ali<eei<?, ?>> i = sa.a("rooted_azalea_tree");
   public static final ali<eei<?, ?>> j = sa.a("cave_vine");
   public static final ali<eei<?, ?>> k = sa.a("cave_vine_in_moss");
   public static final ali<eei<?, ?>> l = sa.a("moss_vegetation");
   public static final ali<eei<?, ?>> m = sa.a("moss_patch");
   public static final ali<eei<?, ?>> n = sa.a("moss_patch_bonemeal");
   public static final ali<eei<?, ?>> o = sa.a("dripleaf");
   public static final ali<eei<?, ?>> p = sa.a("clay_with_dripleaves");
   public static final ali<eei<?, ?>> q = sa.a("clay_pool_with_dripleaves");
   public static final ali<eei<?, ?>> r = sa.a("lush_caves_clay");
   public static final ali<eei<?, ?>> s = sa.a("moss_patch_ceiling");
   public static final ali<eei<?, ?>> t = sa.a("spore_blossom");
   public static final ali<eei<?, ?>> u = sa.a("amethyst_geode");
   public static final ali<eei<?, ?>> v = sa.a("sculk_patch_deep_dark");
   public static final ali<eei<?, ?>> w = sa.a("sculk_patch_ancient_city");
   public static final ali<eei<?, ?>> x = sa.a("sculk_vein");

   private static jq<elm> a(jm $$0) {
      return sp.a(
         eew.w,
         new egr(
            List.of(
               egr.a(new brw(bqs.<brp>a().a(brv.a(0, 4), 2).a(brm.a(0), 1).a()), ejb.a(dis.sE.m().b(dwl.R, $$0))),
               egr.a(brm.a(1), ejb.a(dis.sD.m().b(dwl.R, $$0)))
            ),
            jm.b,
            ecx.d,
            true
         )
      );
   }

   private static jq<elm> a() {
      return sp.a(
         eew.T,
         new ehs(
            new ejl(
               bqs.<dvv>a().a(dis.sF.m().b(dpv.d, jm.f), 1).a(dis.sF.m().b(dpv.d, jm.e), 1).a(dis.sF.m().b(dpv.d, jm.c), 1).a(dis.sF.m().b(dpv.d, jm.d), 1)
            )
         )
      );
   }

   public static void a(qz<eei<?, ?>> $$0) {
      jr<eei<?, ?>> $$1 = $$0.a(ma.aJ);
      jr<eqi> $$2 = $$0.a(ma.aT);
      sa.a($$0, a, eew.C);
      List<alj> $$3 = List.of(
         alj.b("fossil/spine_1"),
         alj.b("fossil/spine_2"),
         alj.b("fossil/spine_3"),
         alj.b("fossil/spine_4"),
         alj.b("fossil/skull_1"),
         alj.b("fossil/skull_2"),
         alj.b("fossil/skull_3"),
         alj.b("fossil/skull_4")
      );
      List<alj> $$4 = List.of(
         alj.b("fossil/spine_1_coal"),
         alj.b("fossil/spine_2_coal"),
         alj.b("fossil/spine_3_coal"),
         alj.b("fossil/spine_4_coal"),
         alj.b("fossil/skull_1_coal"),
         alj.b("fossil/skull_2_coal"),
         alj.b("fossil/skull_3_coal"),
         alj.b("fossil/skull_4_coal")
      );
      jq<eqi> $$5 = $$2.b(rh.D);
      sa.a($$0, b, eew.p, new efb($$3, $$4, $$5, $$2.b(rh.E), 4));
      sa.a($$0, c, eew.p, new efb($$3, $$4, $$5, $$2.b(rh.F), 4));
      sa.a($$0, d, eew.ak, new egy(12, brv.a(3, 6), brv.a(2, 8), 1, 3, brv.a(2, 4), bru.b(0.3F, 0.7F), brj.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sa.a($$0, e, eew.al, new ehd(30, brv.a(3, 19), bru.b(0.4F, 2.0F), 0.33F, bru.b(0.3F, 0.9F), bru.b(0.4F, 1.0F), bru.b(0.0F, 0.3F), 4, 0.6F));
      sa.a(
         $$0,
         f,
         eew.ah,
         new eht(
            ju.a(
               sp.a(eew.am, new ehj(0.2F, 0.7F, 0.5F, 0.5F), elf.a(jm.a, ecx.c(), ecx.d, 12), elr.a(brm.a(1))),
               sp.a(eew.am, new ehj(0.2F, 0.7F, 0.5F, 0.5F), elf.a(jm.b, ecx.c(), ecx.d, 12), elr.a(brm.a(-1)))
            )
         )
      );
      sa.a($$0, g, eew.B, new ehy(5, 1, 0.5F));
      dnp $$6 = (dnp)dis.fg;
      sa.a($$0, h, eew.A, new ehf($$6, 20, false, true, true, 0.5F, ju.a(diq::p, dis.b, dis.g, dis.e, dis.c, dis.su, dis.qN, dis.qz, dis.sJ)));
      sa.a(
         $$0,
         i,
         eew.z,
         new ehq(
            sp.a($$1.b(sf.w)),
            3,
            3,
            axc.bx,
            ejb.a(dis.sH),
            20,
            100,
            3,
            2,
            ejb.a(dis.sG),
            20,
            2,
            ecx.a(ecx.b(ecx.c(List.of(dis.a, dis.nc, dis.nb)), ecx.a(axc.cp)), ecx.a(jm.a.q(), axc.cj))
         )
      );
      ejl $$7 = new ejl(bqs.<dvv>a().a(dis.sw.m(), 4).a(dis.sw.m().b(djm.t_, Boolean.valueOf(true)), 1));
      ejh $$8 = new ejh(new ejl(bqs.<dvv>a().a(dis.sv.m(), 4).a(dis.sv.m().b(djm.t_, Boolean.valueOf(true)), 1)), djn.e, brv.a(23, 25));
      sa.a(
         $$0,
         j,
         eew.w,
         new egr(
            List.of(egr.a(new brw(bqs.<brp>a().a(brv.a(0, 19), 2).a(brv.a(0, 2), 3).a(brv.a(0, 6), 10).a()), $$7), egr.a(brm.a(1), $$8)), jm.a, ecx.c, true
         )
      );
      sa.a($$0, k, eew.w, new egr(List.of(egr.a(new brw(bqs.<brp>a().a(brv.a(0, 3), 5).a(brv.a(1, 7), 1).a()), $$7), egr.a(brm.a(1), $$8)), jm.a, ecx.c, true));
      sa.a($$0, l, eew.T, new ehs(new ejl(bqs.<dvv>a().a(dis.sz.m(), 4).a(dis.sy.m(), 7).a(dis.sA.m(), 25).a(dis.bt.m(), 50).a(dis.iH.m(), 10))));
      sa.a($$0, m, eew.x, new ehz(axc.bv, ejb.a(dis.sC), sp.a($$1.b(l)), elc.b, brm.a(1), 0.0F, 5, 0.8F, brv.a(4, 7), 0.3F));
      sa.a($$0, n, eew.x, new ehz(axc.bv, ejb.a(dis.sC), sp.a($$1.b(l)), elc.b, brm.a(1), 0.0F, 5, 0.6F, brv.a(1, 2), 0.75F));
      sa.a($$0, o, eew.ah, new eht(ju.a(a(), a(jm.f), a(jm.e), a(jm.d), a(jm.c))));
      sa.a($$0, p, eew.x, new ehz(axc.bw, ejb.a(dis.dR), sp.a($$1.b(o)), elc.b, brm.a(3), 0.8F, 2, 0.05F, brv.a(4, 7), 0.7F));
      sa.a($$0, q, eew.y, new ehz(axc.bw, ejb.a(dis.dR), sp.a($$1.b(o)), elc.b, brm.a(3), 0.8F, 5, 0.1F, brv.a(4, 7), 0.7F));
      sa.a($$0, r, eew.ai, new ehl(sp.a($$1.b(p)), sp.a($$1.b(q))));
      sa.a($$0, s, eew.x, new ehz(axc.bv, ejb.a(dis.sC), sp.a($$1.b(k)), elc.a, brv.a(1, 2), 0.0F, 5, 0.08F, brv.a(4, 7), 0.3F));
      sa.a($$0, t, eew.T, new ehs(ejb.a(dis.sx)));
      sa.a(
         $$0,
         u,
         eew.aj,
         new ehb(
            new ebn(
               ejb.a(dis.a),
               ejb.a(dis.qt),
               ejb.a(dis.qu),
               ejb.a(dis.qN),
               ejb.a(dis.te),
               List.of(dis.qy.m(), dis.qx.m(), dis.qw.m(), dis.qv.m()),
               axc.bP,
               axc.bR
            ),
            new ebp(1.7, 2.2, 3.2, 4.2),
            new ebo(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            brv.a(4, 6),
            brv.a(3, 4),
            brv.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sa.a($$0, v, eew.an, new ehr(10, 32, 64, 0, 1, brm.a(0), 0.5F));
      sa.a($$0, w, eew.an, new ehr(10, 32, 64, 0, 1, brv.a(1, 3), 0.5F));
      dnp $$9 = (dnp)dis.qT;
      sa.a($$0, x, eew.A, new ehf($$9, 20, true, true, true, 1.0F, ju.a(diq::p, dis.b, dis.g, dis.e, dis.c, dis.su, dis.qN, dis.qz, dis.sJ)));
   }
}
