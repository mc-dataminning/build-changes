import java.util.List;

public class rs {
   public static final ala<eco<?, ?>> a = ru.a("monster_room");
   public static final ala<eco<?, ?>> b = ru.a("fossil_coal");
   public static final ala<eco<?, ?>> c = ru.a("fossil_diamonds");
   public static final ala<eco<?, ?>> d = ru.a("dripstone_cluster");
   public static final ala<eco<?, ?>> e = ru.a("large_dripstone");
   public static final ala<eco<?, ?>> f = ru.a("pointed_dripstone");
   public static final ala<eco<?, ?>> g = ru.a("underwater_magma");
   public static final ala<eco<?, ?>> h = ru.a("glow_lichen");
   public static final ala<eco<?, ?>> i = ru.a("rooted_azalea_tree");
   public static final ala<eco<?, ?>> j = ru.a("cave_vine");
   public static final ala<eco<?, ?>> k = ru.a("cave_vine_in_moss");
   public static final ala<eco<?, ?>> l = ru.a("moss_vegetation");
   public static final ala<eco<?, ?>> m = ru.a("moss_patch");
   public static final ala<eco<?, ?>> n = ru.a("moss_patch_bonemeal");
   public static final ala<eco<?, ?>> o = ru.a("dripleaf");
   public static final ala<eco<?, ?>> p = ru.a("clay_with_dripleaves");
   public static final ala<eco<?, ?>> q = ru.a("clay_pool_with_dripleaves");
   public static final ala<eco<?, ?>> r = ru.a("lush_caves_clay");
   public static final ala<eco<?, ?>> s = ru.a("moss_patch_ceiling");
   public static final ala<eco<?, ?>> t = ru.a("spore_blossom");
   public static final ala<eco<?, ?>> u = ru.a("amethyst_geode");
   public static final ala<eco<?, ?>> v = ru.a("sculk_patch_deep_dark");
   public static final ala<eco<?, ?>> w = ru.a("sculk_patch_ancient_city");
   public static final ala<eco<?, ?>> x = ru.a("sculk_vein");

   private static jn<ejs> a(jj $$0) {
      return sj.a(
         edc.w,
         new eex(
            List.of(
               eex.a(new bqw(bpu.<bqp>a().a(bqv.a(0, 4), 2).a(bqm.a(0), 1).a()), ehh.a(dgx.sE.o().b(duq.R, $$0))),
               eex.a(bqm.a(1), ehh.a(dgx.sD.o().b(duq.R, $$0)))
            ),
            jj.b,
            ebd.d,
            true
         )
      );
   }

   private static jn<ejs> a() {
      return sj.a(
         edc.T,
         new efy(
            new ehr(
               bpu.<dua>a().a(dgx.sF.o().b(dob.d, jj.f), 1).a(dgx.sF.o().b(dob.d, jj.e), 1).a(dgx.sF.o().b(dob.d, jj.c), 1).a(dgx.sF.o().b(dob.d, jj.d), 1)
            )
         )
      );
   }

   public static void a(qt<eco<?, ?>> $$0) {
      jo<eco<?, ?>> $$1 = $$0.a(lv.aI);
      jo<eoo> $$2 = $$0.a(lv.aS);
      ru.a($$0, a, edc.C);
      List<alb> $$3 = List.of(
         alb.b("fossil/spine_1"),
         alb.b("fossil/spine_2"),
         alb.b("fossil/spine_3"),
         alb.b("fossil/spine_4"),
         alb.b("fossil/skull_1"),
         alb.b("fossil/skull_2"),
         alb.b("fossil/skull_3"),
         alb.b("fossil/skull_4")
      );
      List<alb> $$4 = List.of(
         alb.b("fossil/spine_1_coal"),
         alb.b("fossil/spine_2_coal"),
         alb.b("fossil/spine_3_coal"),
         alb.b("fossil/spine_4_coal"),
         alb.b("fossil/skull_1_coal"),
         alb.b("fossil/skull_2_coal"),
         alb.b("fossil/skull_3_coal"),
         alb.b("fossil/skull_4_coal")
      );
      jn<eoo> $$5 = $$2.b(rb.D);
      ru.a($$0, b, edc.p, new edh($$3, $$4, $$5, $$2.b(rb.E), 4));
      ru.a($$0, c, edc.p, new edh($$3, $$4, $$5, $$2.b(rb.F), 4));
      ru.a($$0, d, edc.ak, new efe(12, bqv.a(3, 6), bqv.a(2, 8), 1, 3, bqv.a(2, 4), bqu.b(0.3F, 0.7F), bqj.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      ru.a($$0, e, edc.al, new efj(30, bqv.a(3, 19), bqu.b(0.4F, 2.0F), 0.33F, bqu.b(0.3F, 0.9F), bqu.b(0.4F, 1.0F), bqu.b(0.0F, 0.3F), 4, 0.6F));
      ru.a(
         $$0,
         f,
         edc.ah,
         new efz(
            jr.a(
               sj.a(edc.am, new efp(0.2F, 0.7F, 0.5F, 0.5F), ejl.a(jj.a, ebd.c(), ebd.d, 12), ejx.a(bqm.a(1))),
               sj.a(edc.am, new efp(0.2F, 0.7F, 0.5F, 0.5F), ejl.a(jj.b, ebd.c(), ebd.d, 12), ejx.a(bqm.a(-1)))
            )
         )
      );
      ru.a($$0, g, edc.B, new ege(5, 1, 0.5F));
      dlv $$6 = (dlv)dgx.fg;
      ru.a($$0, h, edc.A, new efl($$6, 20, false, true, true, 0.5F, jr.a(dgv::s, dgx.b, dgx.g, dgx.e, dgx.c, dgx.su, dgx.qN, dgx.qz, dgx.sJ)));
      ru.a(
         $$0,
         i,
         edc.z,
         new efw(
            sj.a($$1.b(rz.w)),
            3,
            3,
            aws.bx,
            ehh.a(dgx.sH),
            20,
            100,
            3,
            2,
            ehh.a(dgx.sG),
            20,
            2,
            ebd.a(ebd.b(ebd.c(List.of(dgx.a, dgx.nc, dgx.nb)), ebd.a(aws.co)), ebd.a(jj.a.q(), aws.ci))
         )
      );
      ehr $$7 = new ehr(bpu.<dua>a().a(dgx.sw.o(), 4).a(dgx.sw.o().b(dhr.v_, Boolean.valueOf(true)), 1));
      ehn $$8 = new ehn(new ehr(bpu.<dua>a().a(dgx.sv.o(), 4).a(dgx.sv.o().b(dhr.v_, Boolean.valueOf(true)), 1)), dhs.e, bqv.a(23, 25));
      ru.a(
         $$0,
         j,
         edc.w,
         new eex(
            List.of(eex.a(new bqw(bpu.<bqp>a().a(bqv.a(0, 19), 2).a(bqv.a(0, 2), 3).a(bqv.a(0, 6), 10).a()), $$7), eex.a(bqm.a(1), $$8)), jj.a, ebd.c, true
         )
      );
      ru.a($$0, k, edc.w, new eex(List.of(eex.a(new bqw(bpu.<bqp>a().a(bqv.a(0, 3), 5).a(bqv.a(1, 7), 1).a()), $$7), eex.a(bqm.a(1), $$8)), jj.a, ebd.c, true));
      ru.a($$0, l, edc.T, new efy(new ehr(bpu.<dua>a().a(dgx.sz.o(), 4).a(dgx.sy.o(), 7).a(dgx.sA.o(), 25).a(dgx.bt.o(), 50).a(dgx.iH.o(), 10))));
      ru.a($$0, m, edc.x, new egf(aws.bv, ehh.a(dgx.sC), sj.a($$1.b(l)), eji.b, bqm.a(1), 0.0F, 5, 0.8F, bqv.a(4, 7), 0.3F));
      ru.a($$0, n, edc.x, new egf(aws.bv, ehh.a(dgx.sC), sj.a($$1.b(l)), eji.b, bqm.a(1), 0.0F, 5, 0.6F, bqv.a(1, 2), 0.75F));
      ru.a($$0, o, edc.ah, new efz(jr.a(a(), a(jj.f), a(jj.e), a(jj.d), a(jj.c))));
      ru.a($$0, p, edc.x, new egf(aws.bw, ehh.a(dgx.dR), sj.a($$1.b(o)), eji.b, bqm.a(3), 0.8F, 2, 0.05F, bqv.a(4, 7), 0.7F));
      ru.a($$0, q, edc.y, new egf(aws.bw, ehh.a(dgx.dR), sj.a($$1.b(o)), eji.b, bqm.a(3), 0.8F, 5, 0.1F, bqv.a(4, 7), 0.7F));
      ru.a($$0, r, edc.ai, new efr(sj.a($$1.b(p)), sj.a($$1.b(q))));
      ru.a($$0, s, edc.x, new egf(aws.bv, ehh.a(dgx.sC), sj.a($$1.b(k)), eji.a, bqv.a(1, 2), 0.0F, 5, 0.08F, bqv.a(4, 7), 0.3F));
      ru.a($$0, t, edc.T, new efy(ehh.a(dgx.sx)));
      ru.a(
         $$0,
         u,
         edc.aj,
         new efh(
            new dzt(
               ehh.a(dgx.a),
               ehh.a(dgx.qt),
               ehh.a(dgx.qu),
               ehh.a(dgx.qN),
               ehh.a(dgx.te),
               List.of(dgx.qy.o(), dgx.qx.o(), dgx.qw.o(), dgx.qv.o()),
               aws.bP,
               aws.bR
            ),
            new dzv(1.7, 2.2, 3.2, 4.2),
            new dzu(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqv.a(4, 6),
            bqv.a(3, 4),
            bqv.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      ru.a($$0, v, edc.an, new efx(10, 32, 64, 0, 1, bqm.a(0), 0.5F));
      ru.a($$0, w, edc.an, new efx(10, 32, 64, 0, 1, bqv.a(1, 3), 0.5F));
      dlv $$9 = (dlv)dgx.qT;
      ru.a($$0, x, edc.A, new efl($$9, 20, true, true, true, 1.0F, jr.a(dgv::s, dgx.b, dgx.g, dgx.e, dgx.c, dgx.su, dgx.qN, dgx.qz, dgx.sJ)));
   }
}
