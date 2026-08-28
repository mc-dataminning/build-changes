import java.util.List;

public class sk {
   public static final aly<ega<?, ?>> a = sm.a("monster_room");
   public static final aly<ega<?, ?>> b = sm.a("fossil_coal");
   public static final aly<ega<?, ?>> c = sm.a("fossil_diamonds");
   public static final aly<ega<?, ?>> d = sm.a("dripstone_cluster");
   public static final aly<ega<?, ?>> e = sm.a("large_dripstone");
   public static final aly<ega<?, ?>> f = sm.a("pointed_dripstone");
   public static final aly<ega<?, ?>> g = sm.a("underwater_magma");
   public static final aly<ega<?, ?>> h = sm.a("glow_lichen");
   public static final aly<ega<?, ?>> i = sm.a("rooted_azalea_tree");
   public static final aly<ega<?, ?>> j = sm.a("cave_vine");
   public static final aly<ega<?, ?>> k = sm.a("cave_vine_in_moss");
   public static final aly<ega<?, ?>> l = sm.a("moss_vegetation");
   public static final aly<ega<?, ?>> m = sm.a("moss_patch");
   public static final aly<ega<?, ?>> n = sm.a("moss_patch_bonemeal");
   public static final aly<ega<?, ?>> o = sm.a("dripleaf");
   public static final aly<ega<?, ?>> p = sm.a("clay_with_dripleaves");
   public static final aly<ega<?, ?>> q = sm.a("clay_pool_with_dripleaves");
   public static final aly<ega<?, ?>> r = sm.a("lush_caves_clay");
   public static final aly<ega<?, ?>> s = sm.a("moss_patch_ceiling");
   public static final aly<ega<?, ?>> t = sm.a("spore_blossom");
   public static final aly<ega<?, ?>> u = sm.a("amethyst_geode");
   public static final aly<ega<?, ?>> v = sm.a("sculk_patch_deep_dark");
   public static final aly<ega<?, ?>> w = sm.a("sculk_patch_ancient_city");
   public static final aly<ega<?, ?>> x = sm.a("sculk_vein");

   private static jq<eng> a(jm $$0) {
      return tb.a(
         ego.w,
         new eij(
            List.of(
               eij.a(new bsq(brm.<bsj>a().a(bsp.a(0, 4), 2).a(bsg.a(0), 1).a()), ekt.a(dkg.sZ.m().b(dyd.S, $$0))),
               eij.a(bsg.a(1), ekt.a(dkg.sY.m().b(dyd.S, $$0)))
            ),
            jm.b,
            eep.d,
            true
         )
      );
   }

   private static jq<eng> a() {
      return tb.a(
         ego.T,
         new ejk(
            new eld(
               brm.<dxn>a().a(dkg.ta.m().b(drm.d, jm.f), 1).a(dkg.ta.m().b(drm.d, jm.e), 1).a(dkg.ta.m().b(drm.d, jm.c), 1).a(dkg.ta.m().b(drm.d, jm.d), 1)
            )
         )
      );
   }

   public static void a(rk<ega<?, ?>> $$0) {
      jr<ega<?, ?>> $$1 = $$0.a(mb.aK);
      jr<esc> $$2 = $$0.a(mb.aU);
      sm.a($$0, a, ego.C);
      List<alz> $$3 = List.of(
         alz.b("fossil/spine_1"),
         alz.b("fossil/spine_2"),
         alz.b("fossil/spine_3"),
         alz.b("fossil/spine_4"),
         alz.b("fossil/skull_1"),
         alz.b("fossil/skull_2"),
         alz.b("fossil/skull_3"),
         alz.b("fossil/skull_4")
      );
      List<alz> $$4 = List.of(
         alz.b("fossil/spine_1_coal"),
         alz.b("fossil/spine_2_coal"),
         alz.b("fossil/spine_3_coal"),
         alz.b("fossil/spine_4_coal"),
         alz.b("fossil/skull_1_coal"),
         alz.b("fossil/skull_2_coal"),
         alz.b("fossil/skull_3_coal"),
         alz.b("fossil/skull_4_coal")
      );
      jq<esc> $$5 = $$2.b(rs.D);
      sm.a($$0, b, ego.p, new egt($$3, $$4, $$5, $$2.b(rs.E), 4));
      sm.a($$0, c, ego.p, new egt($$3, $$4, $$5, $$2.b(rs.F), 4));
      sm.a($$0, d, ego.ak, new eiq(12, bsp.a(3, 6), bsp.a(2, 8), 1, 3, bsp.a(2, 4), bso.b(0.3F, 0.7F), bsd.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sm.a($$0, e, ego.al, new eiv(30, bsp.a(3, 19), bso.b(0.4F, 2.0F), 0.33F, bso.b(0.3F, 0.9F), bso.b(0.4F, 1.0F), bso.b(0.0F, 0.3F), 4, 0.6F));
      sm.a(
         $$0,
         f,
         ego.ah,
         new ejl(
            ju.a(
               tb.a(ego.am, new ejb(0.2F, 0.7F, 0.5F, 0.5F), emz.a(jm.a, eep.c(), eep.d, 12), enl.a(bsg.a(1))),
               tb.a(ego.am, new ejb(0.2F, 0.7F, 0.5F, 0.5F), emz.a(jm.b, eep.c(), eep.d, 12), enl.a(bsg.a(-1)))
            )
         )
      );
      sm.a($$0, g, ego.B, new ejq(5, 1, 0.5F));
      dpg $$6 = (dpg)dkg.fu;
      sm.a($$0, h, ego.A, new eix($$6, 20, false, true, true, 0.5F, ju.a(dke::p, dkg.b, dkg.g, dkg.e, dkg.c, dkg.sP, dkg.ri, dkg.qU, dkg.te)));
      sm.a(
         $$0,
         i,
         ego.z,
         new eji(
            tb.a($$1.b(sr.y)),
            3,
            3,
            axu.by,
            ekt.a(dkg.tc),
            20,
            100,
            3,
            2,
            ekt.a(dkg.tb),
            20,
            2,
            eep.a(eep.b(eep.c(List.of(dkg.a, dkg.nx, dkg.nw)), eep.a(axu.cq)), eep.a(jm.a.q(), axu.ck))
         )
      );
      eld $$7 = new eld(brm.<dxn>a().a(dkg.sR.m(), 4).a(dkg.sR.m().b(dlb.t_, Boolean.valueOf(true)), 1));
      ekz $$8 = new ekz(new eld(brm.<dxn>a().a(dkg.sQ.m(), 4).a(dkg.sQ.m().b(dlb.t_, Boolean.valueOf(true)), 1)), dlc.e, bsp.a(23, 25));
      sm.a(
         $$0,
         j,
         ego.w,
         new eij(
            List.of(eij.a(new bsq(brm.<bsj>a().a(bsp.a(0, 19), 2).a(bsp.a(0, 2), 3).a(bsp.a(0, 6), 10).a()), $$7), eij.a(bsg.a(1), $$8)), jm.a, eep.c, true
         )
      );
      sm.a($$0, k, ego.w, new eij(List.of(eij.a(new bsq(brm.<bsj>a().a(bsp.a(0, 3), 5).a(bsp.a(1, 7), 1).a()), $$7), eij.a(bsg.a(1), $$8)), jm.a, eep.c, true));
      sm.a($$0, l, ego.T, new ejk(new eld(brm.<dxn>a().a(dkg.sU.m(), 4).a(dkg.sT.m(), 7).a(dkg.sV.m(), 25).a(dkg.bA.m(), 50).a(dkg.iY.m(), 10))));
      sm.a($$0, m, ego.x, new ejr(axu.bw, ekt.a(dkg.sX), tb.a($$1.b(l)), emw.b, bsg.a(1), 0.0F, 5, 0.8F, bsp.a(4, 7), 0.3F));
      sm.a($$0, n, ego.x, new ejr(axu.bw, ekt.a(dkg.sX), tb.a($$1.b(l)), emw.b, bsg.a(1), 0.0F, 5, 0.6F, bsp.a(1, 2), 0.75F));
      sm.a($$0, o, ego.ah, new ejl(ju.a(a(), a(jm.f), a(jm.e), a(jm.d), a(jm.c))));
      sm.a($$0, p, ego.x, new ejr(axu.bx, ekt.a(dkg.ee), tb.a($$1.b(o)), emw.b, bsg.a(3), 0.8F, 2, 0.05F, bsp.a(4, 7), 0.7F));
      sm.a($$0, q, ego.y, new ejr(axu.bx, ekt.a(dkg.ee), tb.a($$1.b(o)), emw.b, bsg.a(3), 0.8F, 5, 0.1F, bsp.a(4, 7), 0.7F));
      sm.a($$0, r, ego.ai, new ejd(tb.a($$1.b(p)), tb.a($$1.b(q))));
      sm.a($$0, s, ego.x, new ejr(axu.bw, ekt.a(dkg.sX), tb.a($$1.b(k)), emw.a, bsp.a(1, 2), 0.0F, 5, 0.08F, bsp.a(4, 7), 0.3F));
      sm.a($$0, t, ego.T, new ejk(ekt.a(dkg.sS)));
      sm.a(
         $$0,
         u,
         ego.aj,
         new eit(
            new edf(
               ekt.a(dkg.a),
               ekt.a(dkg.qO),
               ekt.a(dkg.qP),
               ekt.a(dkg.ri),
               ekt.a(dkg.tz),
               List.of(dkg.qT.m(), dkg.qS.m(), dkg.qR.m(), dkg.qQ.m()),
               axu.bQ,
               axu.bS
            ),
            new edh(1.7, 2.2, 3.2, 4.2),
            new edg(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bsp.a(4, 6),
            bsp.a(3, 4),
            bsp.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sm.a($$0, v, ego.an, new ejj(10, 32, 64, 0, 1, bsg.a(0), 0.5F));
      sm.a($$0, w, ego.an, new ejj(10, 32, 64, 0, 1, bsp.a(1, 3), 0.5F));
      dpg $$9 = (dpg)dkg.ro;
      sm.a($$0, x, ego.A, new eix($$9, 20, true, true, true, 1.0F, ju.a(dke::p, dkg.b, dkg.g, dkg.e, dkg.c, dkg.sP, dkg.ri, dkg.qU, dkg.te)));
   }
}
