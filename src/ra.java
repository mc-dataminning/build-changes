import java.util.List;

public class ra {
   public static final ajs<dxi<?, ?>> a = rc.a("monster_room");
   public static final ajs<dxi<?, ?>> b = rc.a("fossil_coal");
   public static final ajs<dxi<?, ?>> c = rc.a("fossil_diamonds");
   public static final ajs<dxi<?, ?>> d = rc.a("dripstone_cluster");
   public static final ajs<dxi<?, ?>> e = rc.a("large_dripstone");
   public static final ajs<dxi<?, ?>> f = rc.a("pointed_dripstone");
   public static final ajs<dxi<?, ?>> g = rc.a("underwater_magma");
   public static final ajs<dxi<?, ?>> h = rc.a("glow_lichen");
   public static final ajs<dxi<?, ?>> i = rc.a("rooted_azalea_tree");
   public static final ajs<dxi<?, ?>> j = rc.a("cave_vine");
   public static final ajs<dxi<?, ?>> k = rc.a("cave_vine_in_moss");
   public static final ajs<dxi<?, ?>> l = rc.a("moss_vegetation");
   public static final ajs<dxi<?, ?>> m = rc.a("moss_patch");
   public static final ajs<dxi<?, ?>> n = rc.a("moss_patch_bonemeal");
   public static final ajs<dxi<?, ?>> o = rc.a("dripleaf");
   public static final ajs<dxi<?, ?>> p = rc.a("clay_with_dripleaves");
   public static final ajs<dxi<?, ?>> q = rc.a("clay_pool_with_dripleaves");
   public static final ajs<dxi<?, ?>> r = rc.a("lush_caves_clay");
   public static final ajs<dxi<?, ?>> s = rc.a("moss_patch_ceiling");
   public static final ajs<dxi<?, ?>> t = rc.a("spore_blossom");
   public static final ajs<dxi<?, ?>> u = rc.a("amethyst_geode");
   public static final ajs<dxi<?, ?>> v = rc.a("sculk_patch_deep_dark");
   public static final ajs<dxi<?, ?>> w = rc.a("sculk_patch_ancient_city");
   public static final ajs<dxi<?, ?>> x = rc.a("sculk_vein");

   private static il<eel> a(ih $$0) {
      return rr.a(
         dxv.w,
         new dzq(
            List.of(
               dzq.a(new bnm(bmk.<bnf>a().a(bnl.a(0, 4), 2).a(bnc.a(0), 1).a()), eca.a(dca.sE.n().a(dpp.R, $$0))),
               dzq.a(bnc.a(1), eca.a(dca.sD.n().a(dpp.R, $$0)))
            ),
            ih.b,
            dvy.d,
            true
         )
      );
   }

   private static il<eel> a() {
      return rr.a(
         dxv.S,
         new ear(
            new eck(
               bmk.<doz>a().a(dca.sF.n().a(djc.d, ih.f), 1).a(dca.sF.n().a(djc.d, ih.e), 1).a(dca.sF.n().a(djc.d, ih.c), 1).a(dca.sF.n().a(djc.d, ih.d), 1)
            )
         )
      );
   }

   public static void a(px<dxi<?, ?>> $$0) {
      im<dxi<?, ?>> $$1 = $$0.a(ks.ay);
      im<ejf> $$2 = $$0.a(ks.aG);
      rc.a($$0, a, dxv.C);
      List<ajt> $$3 = List.of(
         new ajt("fossil/spine_1"),
         new ajt("fossil/spine_2"),
         new ajt("fossil/spine_3"),
         new ajt("fossil/spine_4"),
         new ajt("fossil/skull_1"),
         new ajt("fossil/skull_2"),
         new ajt("fossil/skull_3"),
         new ajt("fossil/skull_4")
      );
      List<ajt> $$4 = List.of(
         new ajt("fossil/spine_1_coal"),
         new ajt("fossil/spine_2_coal"),
         new ajt("fossil/spine_3_coal"),
         new ajt("fossil/spine_4_coal"),
         new ajt("fossil/skull_1_coal"),
         new ajt("fossil/skull_2_coal"),
         new ajt("fossil/skull_3_coal"),
         new ajt("fossil/skull_4_coal")
      );
      il<ejf> $$5 = $$2.b(qf.D);
      rc.a($$0, b, dxv.p, new dya($$3, $$4, $$5, $$2.b(qf.E), 4));
      rc.a($$0, c, dxv.p, new dya($$3, $$4, $$5, $$2.b(qf.F), 4));
      rc.a($$0, d, dxv.aj, new dzx(12, bnl.a(3, 6), bnl.a(2, 8), 1, 3, bnl.a(2, 4), bnk.b(0.3F, 0.7F), bmz.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rc.a($$0, e, dxv.ak, new eac(30, bnl.a(3, 19), bnk.b(0.4F, 2.0F), 0.33F, bnk.b(0.3F, 0.9F), bnk.b(0.4F, 1.0F), bnk.b(0.0F, 0.3F), 4, 0.6F));
      rc.a(
         $$0,
         f,
         dxv.ag,
         new eas(
            ip.a(
               rr.a(dxv.al, new eai(0.2F, 0.7F, 0.5F, 0.5F), eef.a(ih.a, dvy.c(), dvy.d, 12), eeq.a(bnc.a(1))),
               rr.a(dxv.al, new eai(0.2F, 0.7F, 0.5F, 0.5F), eef.a(ih.b, dvy.c(), dvy.d, 12), eeq.a(bnc.a(-1)))
            )
         )
      );
      rc.a($$0, g, dxv.B, new eax(5, 1, 0.5F));
      dgx $$6 = (dgx)dca.fg;
      rc.a($$0, h, dxv.A, new eae($$6, 20, false, true, true, 0.5F, ip.a(dby::r, dca.b, dca.g, dca.e, dca.c, dca.su, dca.qN, dca.qz, dca.sJ)));
      rc.a(
         $$0,
         i,
         dxv.z,
         new eap(
            rr.a($$1.b(rh.w)),
            3,
            3,
            avc.bw,
            eca.a(dca.sH),
            20,
            100,
            3,
            2,
            eca.a(dca.sG),
            20,
            2,
            dvy.a(dvy.b(dvy.c(List.of(dca.a, dca.nc, dca.nb)), dvy.a(avc.ch)), dvy.a(ih.a.q(), avc.cb))
         )
      );
      eck $$7 = new eck(bmk.<doz>a().a(dca.sw.n(), 4).a(dca.sw.n().a(dcu.r_, Boolean.valueOf(true)), 1));
      ecg $$8 = new ecg(new eck(bmk.<doz>a().a(dca.sv.n(), 4).a(dca.sv.n().a(dcu.r_, Boolean.valueOf(true)), 1)), dcv.e, bnl.a(23, 25));
      rc.a(
         $$0,
         j,
         dxv.w,
         new dzq(
            List.of(dzq.a(new bnm(bmk.<bnf>a().a(bnl.a(0, 19), 2).a(bnl.a(0, 2), 3).a(bnl.a(0, 6), 10).a()), $$7), dzq.a(bnc.a(1), $$8)), ih.a, dvy.c, true
         )
      );
      rc.a($$0, k, dxv.w, new dzq(List.of(dzq.a(new bnm(bmk.<bnf>a().a(bnl.a(0, 3), 5).a(bnl.a(1, 7), 1).a()), $$7), dzq.a(bnc.a(1), $$8)), ih.a, dvy.c, true));
      rc.a($$0, l, dxv.S, new ear(new eck(bmk.<doz>a().a(dca.sz.n(), 4).a(dca.sy.n(), 7).a(dca.sA.n(), 25).a(dca.bt.n(), 50).a(dca.iH.n(), 10))));
      rc.a($$0, m, dxv.x, new eay(avc.bu, eca.a(dca.sC), rr.a($$1.b(l)), eec.b, bnc.a(1), 0.0F, 5, 0.8F, bnl.a(4, 7), 0.3F));
      rc.a($$0, n, dxv.x, new eay(avc.bu, eca.a(dca.sC), rr.a($$1.b(l)), eec.b, bnc.a(1), 0.0F, 5, 0.6F, bnl.a(1, 2), 0.75F));
      rc.a($$0, o, dxv.ag, new eas(ip.a(a(), a(ih.f), a(ih.e), a(ih.d), a(ih.c))));
      rc.a($$0, p, dxv.x, new eay(avc.bv, eca.a(dca.dR), rr.a($$1.b(o)), eec.b, bnc.a(3), 0.8F, 2, 0.05F, bnl.a(4, 7), 0.7F));
      rc.a($$0, q, dxv.y, new eay(avc.bv, eca.a(dca.dR), rr.a($$1.b(o)), eec.b, bnc.a(3), 0.8F, 5, 0.1F, bnl.a(4, 7), 0.7F));
      rc.a($$0, r, dxv.ah, new eak(rr.a($$1.b(p)), rr.a($$1.b(q))));
      rc.a($$0, s, dxv.x, new eay(avc.bu, eca.a(dca.sC), rr.a($$1.b(k)), eec.a, bnl.a(1, 2), 0.0F, 5, 0.08F, bnl.a(4, 7), 0.3F));
      rc.a($$0, t, dxv.S, new ear(eca.a(dca.sx)));
      rc.a(
         $$0,
         u,
         dxv.ai,
         new eaa(
            new duo(
               eca.a(dca.a),
               eca.a(dca.qt),
               eca.a(dca.qu),
               eca.a(dca.qN),
               eca.a(dca.te),
               List.of(dca.qy.n(), dca.qx.n(), dca.qw.n(), dca.qv.n()),
               avc.bI,
               avc.bK
            ),
            new duq(1.7, 2.2, 3.2, 4.2),
            new dup(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bnl.a(4, 6),
            bnl.a(3, 4),
            bnl.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rc.a($$0, v, dxv.am, new eaq(10, 32, 64, 0, 1, bnc.a(0), 0.5F));
      rc.a($$0, w, dxv.am, new eaq(10, 32, 64, 0, 1, bnl.a(1, 3), 0.5F));
      dgx $$9 = (dgx)dca.qT;
      rc.a($$0, x, dxv.A, new eae($$9, 20, true, true, true, 1.0F, ip.a(dby::r, dca.b, dca.g, dca.e, dca.c, dca.su, dca.qN, dca.qz, dca.sJ)));
   }
}
