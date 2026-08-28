import java.util.List;

public class rt {
   public static final ald<edg<?, ?>> a = rv.a("monster_room");
   public static final ald<edg<?, ?>> b = rv.a("fossil_coal");
   public static final ald<edg<?, ?>> c = rv.a("fossil_diamonds");
   public static final ald<edg<?, ?>> d = rv.a("dripstone_cluster");
   public static final ald<edg<?, ?>> e = rv.a("large_dripstone");
   public static final ald<edg<?, ?>> f = rv.a("pointed_dripstone");
   public static final ald<edg<?, ?>> g = rv.a("underwater_magma");
   public static final ald<edg<?, ?>> h = rv.a("glow_lichen");
   public static final ald<edg<?, ?>> i = rv.a("rooted_azalea_tree");
   public static final ald<edg<?, ?>> j = rv.a("cave_vine");
   public static final ald<edg<?, ?>> k = rv.a("cave_vine_in_moss");
   public static final ald<edg<?, ?>> l = rv.a("moss_vegetation");
   public static final ald<edg<?, ?>> m = rv.a("moss_patch");
   public static final ald<edg<?, ?>> n = rv.a("moss_patch_bonemeal");
   public static final ald<edg<?, ?>> o = rv.a("dripleaf");
   public static final ald<edg<?, ?>> p = rv.a("clay_with_dripleaves");
   public static final ald<edg<?, ?>> q = rv.a("clay_pool_with_dripleaves");
   public static final ald<edg<?, ?>> r = rv.a("lush_caves_clay");
   public static final ald<edg<?, ?>> s = rv.a("moss_patch_ceiling");
   public static final ald<edg<?, ?>> t = rv.a("spore_blossom");
   public static final ald<edg<?, ?>> u = rv.a("amethyst_geode");
   public static final ald<edg<?, ?>> v = rv.a("sculk_patch_deep_dark");
   public static final ald<edg<?, ?>> w = rv.a("sculk_patch_ancient_city");
   public static final ald<edg<?, ?>> x = rv.a("sculk_vein");

   private static jo<ekk> a(jk $$0) {
      return sk.a(
         edu.w,
         new efp(
            List.of(
               efp.a(new bre(bqc.<bqx>a().a(brd.a(0, 4), 2).a(bqu.a(0), 1).a()), ehz.a(dho.sE.n().b(dvi.R, $$0))),
               efp.a(bqu.a(1), ehz.a(dho.sD.n().b(dvi.R, $$0)))
            ),
            jk.b,
            ebv.d,
            true
         )
      );
   }

   private static jo<ekk> a() {
      return sk.a(
         edu.T,
         new egq(
            new eij(
               bqc.<dus>a().a(dho.sF.n().b(dos.d, jk.f), 1).a(dho.sF.n().b(dos.d, jk.e), 1).a(dho.sF.n().b(dos.d, jk.c), 1).a(dho.sF.n().b(dos.d, jk.d), 1)
            )
         )
      );
   }

   public static void a(qu<edg<?, ?>> $$0) {
      jp<edg<?, ?>> $$1 = $$0.a(lw.aK);
      jp<epg> $$2 = $$0.a(lw.aU);
      rv.a($$0, a, edu.C);
      List<ale> $$3 = List.of(
         ale.b("fossil/spine_1"),
         ale.b("fossil/spine_2"),
         ale.b("fossil/spine_3"),
         ale.b("fossil/spine_4"),
         ale.b("fossil/skull_1"),
         ale.b("fossil/skull_2"),
         ale.b("fossil/skull_3"),
         ale.b("fossil/skull_4")
      );
      List<ale> $$4 = List.of(
         ale.b("fossil/spine_1_coal"),
         ale.b("fossil/spine_2_coal"),
         ale.b("fossil/spine_3_coal"),
         ale.b("fossil/spine_4_coal"),
         ale.b("fossil/skull_1_coal"),
         ale.b("fossil/skull_2_coal"),
         ale.b("fossil/skull_3_coal"),
         ale.b("fossil/skull_4_coal")
      );
      jo<epg> $$5 = $$2.b(rc.D);
      rv.a($$0, b, edu.p, new edz($$3, $$4, $$5, $$2.b(rc.E), 4));
      rv.a($$0, c, edu.p, new edz($$3, $$4, $$5, $$2.b(rc.F), 4));
      rv.a($$0, d, edu.ak, new efw(12, brd.a(3, 6), brd.a(2, 8), 1, 3, brd.a(2, 4), brc.b(0.3F, 0.7F), bqr.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rv.a($$0, e, edu.al, new egb(30, brd.a(3, 19), brc.b(0.4F, 2.0F), 0.33F, brc.b(0.3F, 0.9F), brc.b(0.4F, 1.0F), brc.b(0.0F, 0.3F), 4, 0.6F));
      rv.a(
         $$0,
         f,
         edu.ah,
         new egr(
            js.a(
               sk.a(edu.am, new egh(0.2F, 0.7F, 0.5F, 0.5F), ekd.a(jk.a, ebv.c(), ebv.d, 12), ekp.a(bqu.a(1))),
               sk.a(edu.am, new egh(0.2F, 0.7F, 0.5F, 0.5F), ekd.a(jk.b, ebv.c(), ebv.d, 12), ekp.a(bqu.a(-1)))
            )
         )
      );
      rv.a($$0, g, edu.B, new egw(5, 1, 0.5F));
      dmm $$6 = (dmm)dho.fg;
      rv.a($$0, h, edu.A, new egd($$6, 20, false, true, true, 0.5F, js.a(dhm::r, dho.b, dho.g, dho.e, dho.c, dho.su, dho.qN, dho.qz, dho.sJ)));
      rv.a(
         $$0,
         i,
         edu.z,
         new ego(
            sk.a($$1.b(sa.w)),
            3,
            3,
            awv.bx,
            ehz.a(dho.sH),
            20,
            100,
            3,
            2,
            ehz.a(dho.sG),
            20,
            2,
            ebv.a(ebv.b(ebv.c(List.of(dho.a, dho.nc, dho.nb)), ebv.a(awv.co)), ebv.a(jk.a.q(), awv.ci))
         )
      );
      eij $$7 = new eij(bqc.<dus>a().a(dho.sw.n(), 4).a(dho.sw.n().b(dii.v_, Boolean.valueOf(true)), 1));
      eif $$8 = new eif(new eij(bqc.<dus>a().a(dho.sv.n(), 4).a(dho.sv.n().b(dii.v_, Boolean.valueOf(true)), 1)), dij.e, brd.a(23, 25));
      rv.a(
         $$0,
         j,
         edu.w,
         new efp(
            List.of(efp.a(new bre(bqc.<bqx>a().a(brd.a(0, 19), 2).a(brd.a(0, 2), 3).a(brd.a(0, 6), 10).a()), $$7), efp.a(bqu.a(1), $$8)), jk.a, ebv.c, true
         )
      );
      rv.a($$0, k, edu.w, new efp(List.of(efp.a(new bre(bqc.<bqx>a().a(brd.a(0, 3), 5).a(brd.a(1, 7), 1).a()), $$7), efp.a(bqu.a(1), $$8)), jk.a, ebv.c, true));
      rv.a($$0, l, edu.T, new egq(new eij(bqc.<dus>a().a(dho.sz.n(), 4).a(dho.sy.n(), 7).a(dho.sA.n(), 25).a(dho.bt.n(), 50).a(dho.iH.n(), 10))));
      rv.a($$0, m, edu.x, new egx(awv.bv, ehz.a(dho.sC), sk.a($$1.b(l)), eka.b, bqu.a(1), 0.0F, 5, 0.8F, brd.a(4, 7), 0.3F));
      rv.a($$0, n, edu.x, new egx(awv.bv, ehz.a(dho.sC), sk.a($$1.b(l)), eka.b, bqu.a(1), 0.0F, 5, 0.6F, brd.a(1, 2), 0.75F));
      rv.a($$0, o, edu.ah, new egr(js.a(a(), a(jk.f), a(jk.e), a(jk.d), a(jk.c))));
      rv.a($$0, p, edu.x, new egx(awv.bw, ehz.a(dho.dR), sk.a($$1.b(o)), eka.b, bqu.a(3), 0.8F, 2, 0.05F, brd.a(4, 7), 0.7F));
      rv.a($$0, q, edu.y, new egx(awv.bw, ehz.a(dho.dR), sk.a($$1.b(o)), eka.b, bqu.a(3), 0.8F, 5, 0.1F, brd.a(4, 7), 0.7F));
      rv.a($$0, r, edu.ai, new egj(sk.a($$1.b(p)), sk.a($$1.b(q))));
      rv.a($$0, s, edu.x, new egx(awv.bv, ehz.a(dho.sC), sk.a($$1.b(k)), eka.a, brd.a(1, 2), 0.0F, 5, 0.08F, brd.a(4, 7), 0.3F));
      rv.a($$0, t, edu.T, new egq(ehz.a(dho.sx)));
      rv.a(
         $$0,
         u,
         edu.aj,
         new efz(
            new eal(
               ehz.a(dho.a),
               ehz.a(dho.qt),
               ehz.a(dho.qu),
               ehz.a(dho.qN),
               ehz.a(dho.te),
               List.of(dho.qy.n(), dho.qx.n(), dho.qw.n(), dho.qv.n()),
               awv.bP,
               awv.bR
            ),
            new ean(1.7, 2.2, 3.2, 4.2),
            new eam(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            brd.a(4, 6),
            brd.a(3, 4),
            brd.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rv.a($$0, v, edu.an, new egp(10, 32, 64, 0, 1, bqu.a(0), 0.5F));
      rv.a($$0, w, edu.an, new egp(10, 32, 64, 0, 1, brd.a(1, 3), 0.5F));
      dmm $$9 = (dmm)dho.qT;
      rv.a($$0, x, edu.A, new egd($$9, 20, true, true, true, 1.0F, js.a(dhm::r, dho.b, dho.g, dho.e, dho.c, dho.su, dho.qN, dho.qz, dho.sJ)));
   }
}
