import java.util.List;

public class ro {
   public static final akp<ebn<?, ?>> a = rq.a("monster_room");
   public static final akp<ebn<?, ?>> b = rq.a("fossil_coal");
   public static final akp<ebn<?, ?>> c = rq.a("fossil_diamonds");
   public static final akp<ebn<?, ?>> d = rq.a("dripstone_cluster");
   public static final akp<ebn<?, ?>> e = rq.a("large_dripstone");
   public static final akp<ebn<?, ?>> f = rq.a("pointed_dripstone");
   public static final akp<ebn<?, ?>> g = rq.a("underwater_magma");
   public static final akp<ebn<?, ?>> h = rq.a("glow_lichen");
   public static final akp<ebn<?, ?>> i = rq.a("rooted_azalea_tree");
   public static final akp<ebn<?, ?>> j = rq.a("cave_vine");
   public static final akp<ebn<?, ?>> k = rq.a("cave_vine_in_moss");
   public static final akp<ebn<?, ?>> l = rq.a("moss_vegetation");
   public static final akp<ebn<?, ?>> m = rq.a("moss_patch");
   public static final akp<ebn<?, ?>> n = rq.a("moss_patch_bonemeal");
   public static final akp<ebn<?, ?>> o = rq.a("dripleaf");
   public static final akp<ebn<?, ?>> p = rq.a("clay_with_dripleaves");
   public static final akp<ebn<?, ?>> q = rq.a("clay_pool_with_dripleaves");
   public static final akp<ebn<?, ?>> r = rq.a("lush_caves_clay");
   public static final akp<ebn<?, ?>> s = rq.a("moss_patch_ceiling");
   public static final akp<ebn<?, ?>> t = rq.a("spore_blossom");
   public static final akp<ebn<?, ?>> u = rq.a("amethyst_geode");
   public static final akp<ebn<?, ?>> v = rq.a("sculk_patch_deep_dark");
   public static final akp<ebn<?, ?>> w = rq.a("sculk_patch_ancient_city");
   public static final akp<ebn<?, ?>> x = rq.a("sculk_vein");

   private static jm<eiq> a(ji $$0) {
      return sf.a(
         eca.w,
         new edv(
            List.of(
               edv.a(new bqc(bpa.<bpv>a().a(bqb.a(0, 4), 2).a(bps.a(0), 1).a()), egf.a(dfy.sE.o().a(dtq.R, $$0))),
               edv.a(bps.a(1), egf.a(dfy.sD.o().a(dtq.R, $$0)))
            ),
            ji.b,
            eac.d,
            true
         )
      );
   }

   private static jm<eiq> a() {
      return sf.a(
         eca.S,
         new eew(
            new egp(
               bpa.<dta>a().a(dfy.sF.o().a(dnc.d, ji.f), 1).a(dfy.sF.o().a(dnc.d, ji.e), 1).a(dfy.sF.o().a(dnc.d, ji.c), 1).a(dfy.sF.o().a(dnc.d, ji.d), 1)
            )
         )
      );
   }

   public static void a(qp<ebn<?, ?>> $$0) {
      jn<ebn<?, ?>> $$1 = $$0.a(lu.aI);
      jn<enl> $$2 = $$0.a(lu.aS);
      rq.a($$0, a, eca.C);
      List<akq> $$3 = List.of(
         akq.b("fossil/spine_1"),
         akq.b("fossil/spine_2"),
         akq.b("fossil/spine_3"),
         akq.b("fossil/spine_4"),
         akq.b("fossil/skull_1"),
         akq.b("fossil/skull_2"),
         akq.b("fossil/skull_3"),
         akq.b("fossil/skull_4")
      );
      List<akq> $$4 = List.of(
         akq.b("fossil/spine_1_coal"),
         akq.b("fossil/spine_2_coal"),
         akq.b("fossil/spine_3_coal"),
         akq.b("fossil/spine_4_coal"),
         akq.b("fossil/skull_1_coal"),
         akq.b("fossil/skull_2_coal"),
         akq.b("fossil/skull_3_coal"),
         akq.b("fossil/skull_4_coal")
      );
      jm<enl> $$5 = $$2.b(qx.D);
      rq.a($$0, b, eca.p, new ecf($$3, $$4, $$5, $$2.b(qx.E), 4));
      rq.a($$0, c, eca.p, new ecf($$3, $$4, $$5, $$2.b(qx.F), 4));
      rq.a($$0, d, eca.aj, new eec(12, bqb.a(3, 6), bqb.a(2, 8), 1, 3, bqb.a(2, 4), bqa.b(0.3F, 0.7F), bpp.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rq.a($$0, e, eca.ak, new eeh(30, bqb.a(3, 19), bqa.b(0.4F, 2.0F), 0.33F, bqa.b(0.3F, 0.9F), bqa.b(0.4F, 1.0F), bqa.b(0.0F, 0.3F), 4, 0.6F));
      rq.a(
         $$0,
         f,
         eca.ag,
         new eex(
            jq.a(
               sf.a(eca.al, new een(0.2F, 0.7F, 0.5F, 0.5F), eik.a(ji.a, eac.c(), eac.d, 12), eiv.a(bps.a(1))),
               sf.a(eca.al, new een(0.2F, 0.7F, 0.5F, 0.5F), eik.a(ji.b, eac.c(), eac.d, 12), eiv.a(bps.a(-1)))
            )
         )
      );
      rq.a($$0, g, eca.B, new efc(5, 1, 0.5F));
      dkw $$6 = (dkw)dfy.fg;
      rq.a($$0, h, eca.A, new eej($$6, 20, false, true, true, 0.5F, jq.a(dfw::s, dfy.b, dfy.g, dfy.e, dfy.c, dfy.su, dfy.qN, dfy.qz, dfy.sJ)));
      rq.a(
         $$0,
         i,
         eca.z,
         new eeu(
            sf.a($$1.b(rv.w)),
            3,
            3,
            awd.bw,
            egf.a(dfy.sH),
            20,
            100,
            3,
            2,
            egf.a(dfy.sG),
            20,
            2,
            eac.a(eac.b(eac.c(List.of(dfy.a, dfy.nc, dfy.nb)), eac.a(awd.cn)), eac.a(ji.a.q(), awd.ch))
         )
      );
      egp $$7 = new egp(bpa.<dta>a().a(dfy.sw.o(), 4).a(dfy.sw.o().a(dgs.r_, Boolean.valueOf(true)), 1));
      egl $$8 = new egl(new egp(bpa.<dta>a().a(dfy.sv.o(), 4).a(dfy.sv.o().a(dgs.r_, Boolean.valueOf(true)), 1)), dgt.e, bqb.a(23, 25));
      rq.a(
         $$0,
         j,
         eca.w,
         new edv(
            List.of(edv.a(new bqc(bpa.<bpv>a().a(bqb.a(0, 19), 2).a(bqb.a(0, 2), 3).a(bqb.a(0, 6), 10).a()), $$7), edv.a(bps.a(1), $$8)), ji.a, eac.c, true
         )
      );
      rq.a($$0, k, eca.w, new edv(List.of(edv.a(new bqc(bpa.<bpv>a().a(bqb.a(0, 3), 5).a(bqb.a(1, 7), 1).a()), $$7), edv.a(bps.a(1), $$8)), ji.a, eac.c, true));
      rq.a($$0, l, eca.S, new eew(new egp(bpa.<dta>a().a(dfy.sz.o(), 4).a(dfy.sy.o(), 7).a(dfy.sA.o(), 25).a(dfy.bt.o(), 50).a(dfy.iH.o(), 10))));
      rq.a($$0, m, eca.x, new efd(awd.bu, egf.a(dfy.sC), sf.a($$1.b(l)), eih.b, bps.a(1), 0.0F, 5, 0.8F, bqb.a(4, 7), 0.3F));
      rq.a($$0, n, eca.x, new efd(awd.bu, egf.a(dfy.sC), sf.a($$1.b(l)), eih.b, bps.a(1), 0.0F, 5, 0.6F, bqb.a(1, 2), 0.75F));
      rq.a($$0, o, eca.ag, new eex(jq.a(a(), a(ji.f), a(ji.e), a(ji.d), a(ji.c))));
      rq.a($$0, p, eca.x, new efd(awd.bv, egf.a(dfy.dR), sf.a($$1.b(o)), eih.b, bps.a(3), 0.8F, 2, 0.05F, bqb.a(4, 7), 0.7F));
      rq.a($$0, q, eca.y, new efd(awd.bv, egf.a(dfy.dR), sf.a($$1.b(o)), eih.b, bps.a(3), 0.8F, 5, 0.1F, bqb.a(4, 7), 0.7F));
      rq.a($$0, r, eca.ah, new eep(sf.a($$1.b(p)), sf.a($$1.b(q))));
      rq.a($$0, s, eca.x, new efd(awd.bu, egf.a(dfy.sC), sf.a($$1.b(k)), eih.a, bqb.a(1, 2), 0.0F, 5, 0.08F, bqb.a(4, 7), 0.3F));
      rq.a($$0, t, eca.S, new eew(egf.a(dfy.sx)));
      rq.a(
         $$0,
         u,
         eca.ai,
         new eef(
            new dys(
               egf.a(dfy.a),
               egf.a(dfy.qt),
               egf.a(dfy.qu),
               egf.a(dfy.qN),
               egf.a(dfy.te),
               List.of(dfy.qy.o(), dfy.qx.o(), dfy.qw.o(), dfy.qv.o()),
               awd.bO,
               awd.bQ
            ),
            new dyu(1.7, 2.2, 3.2, 4.2),
            new dyt(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqb.a(4, 6),
            bqb.a(3, 4),
            bqb.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rq.a($$0, v, eca.am, new eev(10, 32, 64, 0, 1, bps.a(0), 0.5F));
      rq.a($$0, w, eca.am, new eev(10, 32, 64, 0, 1, bqb.a(1, 3), 0.5F));
      dkw $$9 = (dkw)dfy.qT;
      rq.a($$0, x, eca.A, new eej($$9, 20, true, true, true, 1.0F, jq.a(dfw::s, dfy.b, dfy.g, dfy.e, dfy.c, dfy.su, dfy.qN, dfy.qz, dfy.sJ)));
   }
}
