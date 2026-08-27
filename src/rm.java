import java.util.List;

public class rm {
   public static final ake<dyh<?, ?>> a = ro.a("monster_room");
   public static final ake<dyh<?, ?>> b = ro.a("fossil_coal");
   public static final ake<dyh<?, ?>> c = ro.a("fossil_diamonds");
   public static final ake<dyh<?, ?>> d = ro.a("dripstone_cluster");
   public static final ake<dyh<?, ?>> e = ro.a("large_dripstone");
   public static final ake<dyh<?, ?>> f = ro.a("pointed_dripstone");
   public static final ake<dyh<?, ?>> g = ro.a("underwater_magma");
   public static final ake<dyh<?, ?>> h = ro.a("glow_lichen");
   public static final ake<dyh<?, ?>> i = ro.a("rooted_azalea_tree");
   public static final ake<dyh<?, ?>> j = ro.a("cave_vine");
   public static final ake<dyh<?, ?>> k = ro.a("cave_vine_in_moss");
   public static final ake<dyh<?, ?>> l = ro.a("moss_vegetation");
   public static final ake<dyh<?, ?>> m = ro.a("moss_patch");
   public static final ake<dyh<?, ?>> n = ro.a("moss_patch_bonemeal");
   public static final ake<dyh<?, ?>> o = ro.a("dripleaf");
   public static final ake<dyh<?, ?>> p = ro.a("clay_with_dripleaves");
   public static final ake<dyh<?, ?>> q = ro.a("clay_pool_with_dripleaves");
   public static final ake<dyh<?, ?>> r = ro.a("lush_caves_clay");
   public static final ake<dyh<?, ?>> s = ro.a("moss_patch_ceiling");
   public static final ake<dyh<?, ?>> t = ro.a("spore_blossom");
   public static final ake<dyh<?, ?>> u = ro.a("amethyst_geode");
   public static final ake<dyh<?, ?>> v = ro.a("sculk_patch_deep_dark");
   public static final ake<dyh<?, ?>> w = ro.a("sculk_patch_ancient_city");
   public static final ake<dyh<?, ?>> x = ro.a("sculk_vein");

   private static iv<efk> a(ir $$0) {
      return sd.a(
         dyu.w,
         new eap(
            List.of(
               eap.a(new boc(bna.<bnv>a().a(bob.a(0, 4), 2).a(bns.a(0), 1).a()), ecz.a(dcx.sE.n().a(dqo.R, $$0))),
               eap.a(bns.a(1), ecz.a(dcx.sD.n().a(dqo.R, $$0)))
            ),
            ir.b,
            dwx.d,
            true
         )
      );
   }

   private static iv<efk> a() {
      return sd.a(
         dyu.S,
         new ebq(
            new edj(
               bna.<dpy>a().a(dcx.sF.n().a(dka.d, ir.f), 1).a(dcx.sF.n().a(dka.d, ir.e), 1).a(dcx.sF.n().a(dka.d, ir.c), 1).a(dcx.sF.n().a(dka.d, ir.d), 1)
            )
         )
      );
   }

   public static void a(qj<dyh<?, ?>> $$0) {
      iw<dyh<?, ?>> $$1 = $$0.a(ld.aB);
      iw<eke> $$2 = $$0.a(ld.aJ);
      ro.a($$0, a, dyu.C);
      List<akf> $$3 = List.of(
         new akf("fossil/spine_1"),
         new akf("fossil/spine_2"),
         new akf("fossil/spine_3"),
         new akf("fossil/spine_4"),
         new akf("fossil/skull_1"),
         new akf("fossil/skull_2"),
         new akf("fossil/skull_3"),
         new akf("fossil/skull_4")
      );
      List<akf> $$4 = List.of(
         new akf("fossil/spine_1_coal"),
         new akf("fossil/spine_2_coal"),
         new akf("fossil/spine_3_coal"),
         new akf("fossil/spine_4_coal"),
         new akf("fossil/skull_1_coal"),
         new akf("fossil/skull_2_coal"),
         new akf("fossil/skull_3_coal"),
         new akf("fossil/skull_4_coal")
      );
      iv<eke> $$5 = $$2.b(qr.D);
      ro.a($$0, b, dyu.p, new dyz($$3, $$4, $$5, $$2.b(qr.E), 4));
      ro.a($$0, c, dyu.p, new dyz($$3, $$4, $$5, $$2.b(qr.F), 4));
      ro.a($$0, d, dyu.aj, new eaw(12, bob.a(3, 6), bob.a(2, 8), 1, 3, bob.a(2, 4), boa.b(0.3F, 0.7F), bnp.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      ro.a($$0, e, dyu.ak, new ebb(30, bob.a(3, 19), boa.b(0.4F, 2.0F), 0.33F, boa.b(0.3F, 0.9F), boa.b(0.4F, 1.0F), boa.b(0.0F, 0.3F), 4, 0.6F));
      ro.a(
         $$0,
         f,
         dyu.ag,
         new ebr(
            iz.a(
               sd.a(dyu.al, new ebh(0.2F, 0.7F, 0.5F, 0.5F), efe.a(ir.a, dwx.c(), dwx.d, 12), efp.a(bns.a(1))),
               sd.a(dyu.al, new ebh(0.2F, 0.7F, 0.5F, 0.5F), efe.a(ir.b, dwx.c(), dwx.d, 12), efp.a(bns.a(-1)))
            )
         )
      );
      ro.a($$0, g, dyu.B, new ebw(5, 1, 0.5F));
      dhv $$6 = (dhv)dcx.fg;
      ro.a($$0, h, dyu.A, new ebd($$6, 20, false, true, true, 0.5F, iz.a(dcv::r, dcx.b, dcx.g, dcx.e, dcx.c, dcx.su, dcx.qN, dcx.qz, dcx.sJ)));
      ro.a(
         $$0,
         i,
         dyu.z,
         new ebo(
            sd.a($$1.b(rt.w)),
            3,
            3,
            avo.bw,
            ecz.a(dcx.sH),
            20,
            100,
            3,
            2,
            ecz.a(dcx.sG),
            20,
            2,
            dwx.a(dwx.b(dwx.c(List.of(dcx.a, dcx.nc, dcx.nb)), dwx.a(avo.ch)), dwx.a(ir.a.q(), avo.cb))
         )
      );
      edj $$7 = new edj(bna.<dpy>a().a(dcx.sw.n(), 4).a(dcx.sw.n().a(ddr.r_, Boolean.valueOf(true)), 1));
      edf $$8 = new edf(new edj(bna.<dpy>a().a(dcx.sv.n(), 4).a(dcx.sv.n().a(ddr.r_, Boolean.valueOf(true)), 1)), dds.e, bob.a(23, 25));
      ro.a(
         $$0,
         j,
         dyu.w,
         new eap(
            List.of(eap.a(new boc(bna.<bnv>a().a(bob.a(0, 19), 2).a(bob.a(0, 2), 3).a(bob.a(0, 6), 10).a()), $$7), eap.a(bns.a(1), $$8)), ir.a, dwx.c, true
         )
      );
      ro.a($$0, k, dyu.w, new eap(List.of(eap.a(new boc(bna.<bnv>a().a(bob.a(0, 3), 5).a(bob.a(1, 7), 1).a()), $$7), eap.a(bns.a(1), $$8)), ir.a, dwx.c, true));
      ro.a($$0, l, dyu.S, new ebq(new edj(bna.<dpy>a().a(dcx.sz.n(), 4).a(dcx.sy.n(), 7).a(dcx.sA.n(), 25).a(dcx.bt.n(), 50).a(dcx.iH.n(), 10))));
      ro.a($$0, m, dyu.x, new ebx(avo.bu, ecz.a(dcx.sC), sd.a($$1.b(l)), efb.b, bns.a(1), 0.0F, 5, 0.8F, bob.a(4, 7), 0.3F));
      ro.a($$0, n, dyu.x, new ebx(avo.bu, ecz.a(dcx.sC), sd.a($$1.b(l)), efb.b, bns.a(1), 0.0F, 5, 0.6F, bob.a(1, 2), 0.75F));
      ro.a($$0, o, dyu.ag, new ebr(iz.a(a(), a(ir.f), a(ir.e), a(ir.d), a(ir.c))));
      ro.a($$0, p, dyu.x, new ebx(avo.bv, ecz.a(dcx.dR), sd.a($$1.b(o)), efb.b, bns.a(3), 0.8F, 2, 0.05F, bob.a(4, 7), 0.7F));
      ro.a($$0, q, dyu.y, new ebx(avo.bv, ecz.a(dcx.dR), sd.a($$1.b(o)), efb.b, bns.a(3), 0.8F, 5, 0.1F, bob.a(4, 7), 0.7F));
      ro.a($$0, r, dyu.ah, new ebj(sd.a($$1.b(p)), sd.a($$1.b(q))));
      ro.a($$0, s, dyu.x, new ebx(avo.bu, ecz.a(dcx.sC), sd.a($$1.b(k)), efb.a, bob.a(1, 2), 0.0F, 5, 0.08F, bob.a(4, 7), 0.3F));
      ro.a($$0, t, dyu.S, new ebq(ecz.a(dcx.sx)));
      ro.a(
         $$0,
         u,
         dyu.ai,
         new eaz(
            new dvn(
               ecz.a(dcx.a),
               ecz.a(dcx.qt),
               ecz.a(dcx.qu),
               ecz.a(dcx.qN),
               ecz.a(dcx.te),
               List.of(dcx.qy.n(), dcx.qx.n(), dcx.qw.n(), dcx.qv.n()),
               avo.bI,
               avo.bK
            ),
            new dvp(1.7, 2.2, 3.2, 4.2),
            new dvo(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bob.a(4, 6),
            bob.a(3, 4),
            bob.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      ro.a($$0, v, dyu.am, new ebp(10, 32, 64, 0, 1, bns.a(0), 0.5F));
      ro.a($$0, w, dyu.am, new ebp(10, 32, 64, 0, 1, bob.a(1, 3), 0.5F));
      dhv $$9 = (dhv)dcx.qT;
      ro.a($$0, x, dyu.A, new ebd($$9, 20, true, true, true, 1.0F, iz.a(dcv::r, dcx.b, dcx.g, dcx.e, dcx.c, dcx.su, dcx.qN, dcx.qz, dcx.sJ)));
   }
}
