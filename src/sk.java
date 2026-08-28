import java.util.List;

public class sk {
   public static final aly<egi<?, ?>> a = sm.a("monster_room");
   public static final aly<egi<?, ?>> b = sm.a("fossil_coal");
   public static final aly<egi<?, ?>> c = sm.a("fossil_diamonds");
   public static final aly<egi<?, ?>> d = sm.a("dripstone_cluster");
   public static final aly<egi<?, ?>> e = sm.a("large_dripstone");
   public static final aly<egi<?, ?>> f = sm.a("pointed_dripstone");
   public static final aly<egi<?, ?>> g = sm.a("underwater_magma");
   public static final aly<egi<?, ?>> h = sm.a("glow_lichen");
   public static final aly<egi<?, ?>> i = sm.a("rooted_azalea_tree");
   public static final aly<egi<?, ?>> j = sm.a("cave_vine");
   public static final aly<egi<?, ?>> k = sm.a("cave_vine_in_moss");
   public static final aly<egi<?, ?>> l = sm.a("moss_vegetation");
   public static final aly<egi<?, ?>> m = sm.a("moss_patch");
   public static final aly<egi<?, ?>> n = sm.a("moss_patch_bonemeal");
   public static final aly<egi<?, ?>> o = sm.a("dripleaf");
   public static final aly<egi<?, ?>> p = sm.a("clay_with_dripleaves");
   public static final aly<egi<?, ?>> q = sm.a("clay_pool_with_dripleaves");
   public static final aly<egi<?, ?>> r = sm.a("lush_caves_clay");
   public static final aly<egi<?, ?>> s = sm.a("moss_patch_ceiling");
   public static final aly<egi<?, ?>> t = sm.a("spore_blossom");
   public static final aly<egi<?, ?>> u = sm.a("amethyst_geode");
   public static final aly<egi<?, ?>> v = sm.a("sculk_patch_deep_dark");
   public static final aly<egi<?, ?>> w = sm.a("sculk_patch_ancient_city");
   public static final aly<egi<?, ?>> x = sm.a("sculk_vein");

   private static jq<eno> a(jm $$0) {
      return tb.a(
         egw.w,
         new eir(
            List.of(
               eir.a(new bsv(brr.<bso>a().a(bsu.a(0, 4), 2).a(bsl.a(0), 1).a()), elb.a(dko.sZ.m().b(dyl.S, $$0))),
               eir.a(bsl.a(1), elb.a(dko.sY.m().b(dyl.S, $$0)))
            ),
            jm.b,
            eex.d,
            true
         )
      );
   }

   private static jq<eno> a() {
      return tb.a(
         egw.T,
         new ejs(
            new ell(
               brr.<dxv>a().a(dko.ta.m().b(dru.d, jm.f), 1).a(dko.ta.m().b(dru.d, jm.e), 1).a(dko.ta.m().b(dru.d, jm.c), 1).a(dko.ta.m().b(dru.d, jm.d), 1)
            )
         )
      );
   }

   public static void a(rk<egi<?, ?>> $$0) {
      jr<egi<?, ?>> $$1 = $$0.a(mb.aL);
      jr<esk> $$2 = $$0.a(mb.aV);
      sm.a($$0, a, egw.C);
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
      jq<esk> $$5 = $$2.b(rs.D);
      sm.a($$0, b, egw.p, new ehb($$3, $$4, $$5, $$2.b(rs.E), 4));
      sm.a($$0, c, egw.p, new ehb($$3, $$4, $$5, $$2.b(rs.F), 4));
      sm.a($$0, d, egw.ak, new eiy(12, bsu.a(3, 6), bsu.a(2, 8), 1, 3, bsu.a(2, 4), bst.b(0.3F, 0.7F), bsi.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sm.a($$0, e, egw.al, new ejd(30, bsu.a(3, 19), bst.b(0.4F, 2.0F), 0.33F, bst.b(0.3F, 0.9F), bst.b(0.4F, 1.0F), bst.b(0.0F, 0.3F), 4, 0.6F));
      sm.a(
         $$0,
         f,
         egw.ah,
         new ejt(
            ju.a(
               tb.a(egw.am, new ejj(0.2F, 0.7F, 0.5F, 0.5F), enh.a(jm.a, eex.c(), eex.d, 12), ent.a(bsl.a(1))),
               tb.a(egw.am, new ejj(0.2F, 0.7F, 0.5F, 0.5F), enh.a(jm.b, eex.c(), eex.d, 12), ent.a(bsl.a(-1)))
            )
         )
      );
      sm.a($$0, g, egw.B, new ejy(5, 1, 0.5F));
      dpo $$6 = (dpo)dko.fu;
      sm.a($$0, h, egw.A, new ejf($$6, 20, false, true, true, 0.5F, ju.a(dkm::p, dko.b, dko.g, dko.e, dko.c, dko.sP, dko.ri, dko.qU, dko.te)));
      sm.a(
         $$0,
         i,
         egw.z,
         new ejq(
            tb.a($$1.b(sr.y)),
            3,
            3,
            axu.by,
            elb.a(dko.tc),
            20,
            100,
            3,
            2,
            elb.a(dko.tb),
            20,
            2,
            eex.a(eex.b(eex.c(List.of(dko.a, dko.nx, dko.nw)), eex.a(axu.cq)), eex.a(jm.a.q(), axu.ck))
         )
      );
      ell $$7 = new ell(brr.<dxv>a().a(dko.sR.m(), 4).a(dko.sR.m().b(dlj.t_, Boolean.valueOf(true)), 1));
      elh $$8 = new elh(new ell(brr.<dxv>a().a(dko.sQ.m(), 4).a(dko.sQ.m().b(dlj.t_, Boolean.valueOf(true)), 1)), dlk.e, bsu.a(23, 25));
      sm.a(
         $$0,
         j,
         egw.w,
         new eir(
            List.of(eir.a(new bsv(brr.<bso>a().a(bsu.a(0, 19), 2).a(bsu.a(0, 2), 3).a(bsu.a(0, 6), 10).a()), $$7), eir.a(bsl.a(1), $$8)), jm.a, eex.c, true
         )
      );
      sm.a($$0, k, egw.w, new eir(List.of(eir.a(new bsv(brr.<bso>a().a(bsu.a(0, 3), 5).a(bsu.a(1, 7), 1).a()), $$7), eir.a(bsl.a(1), $$8)), jm.a, eex.c, true));
      sm.a($$0, l, egw.T, new ejs(new ell(brr.<dxv>a().a(dko.sU.m(), 4).a(dko.sT.m(), 7).a(dko.sV.m(), 25).a(dko.bA.m(), 50).a(dko.iY.m(), 10))));
      sm.a($$0, m, egw.x, new ejz(axu.bw, elb.a(dko.sX), tb.a($$1.b(l)), ene.b, bsl.a(1), 0.0F, 5, 0.8F, bsu.a(4, 7), 0.3F));
      sm.a($$0, n, egw.x, new ejz(axu.bw, elb.a(dko.sX), tb.a($$1.b(l)), ene.b, bsl.a(1), 0.0F, 5, 0.6F, bsu.a(1, 2), 0.75F));
      sm.a($$0, o, egw.ah, new ejt(ju.a(a(), a(jm.f), a(jm.e), a(jm.d), a(jm.c))));
      sm.a($$0, p, egw.x, new ejz(axu.bx, elb.a(dko.ee), tb.a($$1.b(o)), ene.b, bsl.a(3), 0.8F, 2, 0.05F, bsu.a(4, 7), 0.7F));
      sm.a($$0, q, egw.y, new ejz(axu.bx, elb.a(dko.ee), tb.a($$1.b(o)), ene.b, bsl.a(3), 0.8F, 5, 0.1F, bsu.a(4, 7), 0.7F));
      sm.a($$0, r, egw.ai, new ejl(tb.a($$1.b(p)), tb.a($$1.b(q))));
      sm.a($$0, s, egw.x, new ejz(axu.bw, elb.a(dko.sX), tb.a($$1.b(k)), ene.a, bsu.a(1, 2), 0.0F, 5, 0.08F, bsu.a(4, 7), 0.3F));
      sm.a($$0, t, egw.T, new ejs(elb.a(dko.sS)));
      sm.a(
         $$0,
         u,
         egw.aj,
         new ejb(
            new edn(
               elb.a(dko.a),
               elb.a(dko.qO),
               elb.a(dko.qP),
               elb.a(dko.ri),
               elb.a(dko.tz),
               List.of(dko.qT.m(), dko.qS.m(), dko.qR.m(), dko.qQ.m()),
               axu.bQ,
               axu.bS
            ),
            new edp(1.7, 2.2, 3.2, 4.2),
            new edo(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bsu.a(4, 6),
            bsu.a(3, 4),
            bsu.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sm.a($$0, v, egw.an, new ejr(10, 32, 64, 0, 1, bsl.a(0), 0.5F));
      sm.a($$0, w, egw.an, new ejr(10, 32, 64, 0, 1, bsu.a(1, 3), 0.5F));
      dpo $$9 = (dpo)dko.ro;
      sm.a($$0, x, egw.A, new ejf($$9, 20, true, true, true, 1.0F, ju.a(dkm::p, dko.b, dko.g, dko.e, dko.c, dko.sP, dko.ri, dko.qU, dko.te)));
   }
}
