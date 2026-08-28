import java.util.List;

public class rg {
   public static final ald<eif<?, ?>> a = ri.a("monster_room");
   public static final ald<eif<?, ?>> b = ri.a("fossil_coal");
   public static final ald<eif<?, ?>> c = ri.a("fossil_diamonds");
   public static final ald<eif<?, ?>> d = ri.a("dripstone_cluster");
   public static final ald<eif<?, ?>> e = ri.a("large_dripstone");
   public static final ald<eif<?, ?>> f = ri.a("pointed_dripstone");
   public static final ald<eif<?, ?>> g = ri.a("underwater_magma");
   public static final ald<eif<?, ?>> h = ri.a("glow_lichen");
   public static final ald<eif<?, ?>> i = ri.a("rooted_azalea_tree");
   public static final ald<eif<?, ?>> j = ri.a("cave_vine");
   public static final ald<eif<?, ?>> k = ri.a("cave_vine_in_moss");
   public static final ald<eif<?, ?>> l = ri.a("moss_vegetation");
   public static final ald<eif<?, ?>> m = ri.a("moss_patch");
   public static final ald<eif<?, ?>> n = ri.a("moss_patch_bonemeal");
   public static final ald<eif<?, ?>> o = ri.a("dripleaf");
   public static final ald<eif<?, ?>> p = ri.a("clay_with_dripleaves");
   public static final ald<eif<?, ?>> q = ri.a("clay_pool_with_dripleaves");
   public static final ald<eif<?, ?>> r = ri.a("lush_caves_clay");
   public static final ald<eif<?, ?>> s = ri.a("moss_patch_ceiling");
   public static final ald<eif<?, ?>> t = ri.a("spore_blossom");
   public static final ald<eif<?, ?>> u = ri.a("amethyst_geode");
   public static final ald<eif<?, ?>> v = ri.a("sculk_patch_deep_dark");
   public static final ald<eif<?, ?>> w = ri.a("sculk_patch_ancient_city");
   public static final ald<eif<?, ?>> x = ri.a("sculk_vein");

   private static je<epm> a(ja $$0) {
      return rx.a(
         eit.w,
         new eko(
            List.of(
               eko.a(new btk(bsj.<btd>b().a(btj.a(0, 4), 2).a(bta.a(0), 1).a()), emy.a(dlw.tk.m().b(eae.T, $$0))),
               eko.a(bta.a(1), emy.a(dlw.tj.m().b(eae.T, $$0)))
            ),
            ja.b,
            egu.d,
            true
         )
      );
   }

   private static je<epm> a() {
      return rx.a(
         eit.T,
         new elp(
            new eni(
               bsj.<dzo>b().a(dlw.tl.m().b(dtf.d, ja.f), 1).a(dlw.tl.m().b(dtf.d, ja.e), 1).a(dlw.tl.m().b(dtf.d, ja.c), 1).a(dlw.tl.m().b(dtf.d, ja.d), 1)
            )
         )
      );
   }

   public static void a(qh<eif<?, ?>> $$0) {
      jf<eif<?, ?>> $$1 = $$0.a(mg.aK);
      jf<eui> $$2 = $$0.a(mg.ba);
      ri.a($$0, a, eit.C);
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
      je<eui> $$5 = $$2.b(qp.D);
      ri.a($$0, b, eit.p, new eiy($$3, $$4, $$5, $$2.b(qp.E), 4));
      ri.a($$0, c, eit.p, new eiy($$3, $$4, $$5, $$2.b(qp.F), 4));
      ri.a($$0, d, eit.ak, new ekv(12, btj.a(3, 6), btj.a(2, 8), 1, 3, btj.a(2, 4), bti.b(0.3F, 0.7F), bsx.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      ri.a($$0, e, eit.al, new ela(30, btj.a(3, 19), bti.b(0.4F, 2.0F), 0.33F, bti.b(0.3F, 0.9F), bti.b(0.4F, 1.0F), bti.b(0.0F, 0.3F), 4, 0.6F));
      ri.a(
         $$0,
         f,
         eit.ah,
         new elq(
            ji.a(
               rx.a(eit.am, new elg(0.2F, 0.7F, 0.5F, 0.5F), epf.a(ja.a, egu.c(), egu.d, 12), epr.a(bta.a(1))),
               rx.a(eit.am, new elg(0.2F, 0.7F, 0.5F, 0.5F), epf.a(ja.b, egu.c(), egu.d, 12), epr.a(bta.a(-1)))
            )
         )
      );
      ri.a($$0, g, eit.B, new elv(5, 1, 0.5F));
      dqz $$6 = (dqz)dlw.fu;
      ri.a($$0, h, eit.A, new elc($$6, 20, false, true, true, 0.5F, ji.a(dlu::p, dlw.b, dlw.g, dlw.e, dlw.c, dlw.sY, dlw.rr, dlw.rd, dlw.tp)));
      ri.a(
         $$0,
         i,
         eit.z,
         new eln(
            rx.a($$1.b(rn.z)),
            3,
            3,
            axa.by,
            emy.a(dlw.tn),
            20,
            100,
            3,
            2,
            emy.a(dlw.tm),
            20,
            2,
            egu.a(egu.b(egu.c(List.of(dlw.a, dlw.nE, dlw.nD)), egu.a(axa.cr)), egu.a(ja.a.q(), axa.cl))
         )
      );
      eni $$7 = new eni(bsj.<dzo>b().a(dlw.ta.m(), 4).a(dlw.ta.m().b(dmr.t_, Boolean.valueOf(true)), 1));
      ene $$8 = new ene(new eni(bsj.<dzo>b().a(dlw.sZ.m(), 4).a(dlw.sZ.m().b(dmr.t_, Boolean.valueOf(true)), 1)), dms.e, btj.a(23, 25));
      ri.a(
         $$0,
         j,
         eit.w,
         new eko(
            List.of(eko.a(new btk(bsj.<btd>b().a(btj.a(0, 19), 2).a(btj.a(0, 2), 3).a(btj.a(0, 6), 10).a()), $$7), eko.a(bta.a(1), $$8)), ja.a, egu.c, true
         )
      );
      ri.a($$0, k, eit.w, new eko(List.of(eko.a(new btk(bsj.<btd>b().a(btj.a(0, 3), 5).a(btj.a(1, 7), 1).a()), $$7), eko.a(bta.a(1), $$8)), ja.a, egu.c, true));
      ri.a($$0, l, eit.T, new elp(new eni(bsj.<dzo>b().a(dlw.td.m(), 4).a(dlw.tc.m(), 7).a(dlw.te.m(), 25).a(dlw.bA.m(), 50).a(dlw.jf.m(), 10))));
      ri.a($$0, m, eit.x, new elw(axa.bw, emy.a(dlw.ti), rx.a($$1.b(l)), epc.b, bta.a(1), 0.0F, 5, 0.8F, btj.a(4, 7), 0.3F));
      ri.a($$0, n, eit.x, new elw(axa.bw, emy.a(dlw.ti), rx.a($$1.b(l)), epc.b, bta.a(1), 0.0F, 5, 0.6F, btj.a(1, 2), 0.75F));
      ri.a($$0, o, eit.ah, new elq(ji.a(a(), a(ja.f), a(ja.e), a(ja.d), a(ja.c))));
      ri.a($$0, p, eit.x, new elw(axa.bx, emy.a(dlw.ee), rx.a($$1.b(o)), epc.b, bta.a(3), 0.8F, 2, 0.05F, btj.a(4, 7), 0.7F));
      ri.a($$0, q, eit.y, new elw(axa.bx, emy.a(dlw.ee), rx.a($$1.b(o)), epc.b, bta.a(3), 0.8F, 5, 0.1F, btj.a(4, 7), 0.7F));
      ri.a($$0, r, eit.ai, new eli(rx.a($$1.b(p)), rx.a($$1.b(q))));
      ri.a($$0, s, eit.x, new elw(axa.bw, emy.a(dlw.ti), rx.a($$1.b(k)), epc.a, btj.a(1, 2), 0.0F, 5, 0.08F, btj.a(4, 7), 0.3F));
      ri.a($$0, t, eit.T, new elp(emy.a(dlw.tb)));
      ri.a(
         $$0,
         u,
         eit.aj,
         new eky(
            new efk(
               emy.a(dlw.a),
               emy.a(dlw.qX),
               emy.a(dlw.qY),
               emy.a(dlw.rr),
               emy.a(dlw.tK),
               List.of(dlw.rc.m(), dlw.rb.m(), dlw.ra.m(), dlw.qZ.m()),
               axa.bR,
               axa.bT
            ),
            new efm(1.7, 2.2, 3.2, 4.2),
            new efl(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            btj.a(4, 6),
            btj.a(3, 4),
            btj.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      ri.a($$0, v, eit.an, new elo(10, 32, 64, 0, 1, bta.a(0), 0.5F));
      ri.a($$0, w, eit.an, new elo(10, 32, 64, 0, 1, btj.a(1, 3), 0.5F));
      dqz $$9 = (dqz)dlw.rx;
      ri.a($$0, x, eit.A, new elc($$9, 20, true, true, true, 1.0F, ji.a(dlu::p, dlw.b, dlw.g, dlw.e, dlw.c, dlw.sY, dlw.rr, dlw.rd, dlw.tp)));
   }
}
