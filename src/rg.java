import java.util.List;

public class rg {
   public static final alf<eiy<?, ?>> a = ri.a("monster_room");
   public static final alf<eiy<?, ?>> b = ri.a("fossil_coal");
   public static final alf<eiy<?, ?>> c = ri.a("fossil_diamonds");
   public static final alf<eiy<?, ?>> d = ri.a("dripstone_cluster");
   public static final alf<eiy<?, ?>> e = ri.a("large_dripstone");
   public static final alf<eiy<?, ?>> f = ri.a("pointed_dripstone");
   public static final alf<eiy<?, ?>> g = ri.a("underwater_magma");
   public static final alf<eiy<?, ?>> h = ri.a("glow_lichen");
   public static final alf<eiy<?, ?>> i = ri.a("rooted_azalea_tree");
   public static final alf<eiy<?, ?>> j = ri.a("cave_vine");
   public static final alf<eiy<?, ?>> k = ri.a("cave_vine_in_moss");
   public static final alf<eiy<?, ?>> l = ri.a("moss_vegetation");
   public static final alf<eiy<?, ?>> m = ri.a("moss_patch");
   public static final alf<eiy<?, ?>> n = ri.a("moss_patch_bonemeal");
   public static final alf<eiy<?, ?>> o = ri.a("dripleaf");
   public static final alf<eiy<?, ?>> p = ri.a("clay_with_dripleaves");
   public static final alf<eiy<?, ?>> q = ri.a("clay_pool_with_dripleaves");
   public static final alf<eiy<?, ?>> r = ri.a("lush_caves_clay");
   public static final alf<eiy<?, ?>> s = ri.a("moss_patch_ceiling");
   public static final alf<eiy<?, ?>> t = ri.a("spore_blossom");
   public static final alf<eiy<?, ?>> u = ri.a("amethyst_geode");
   public static final alf<eiy<?, ?>> v = ri.a("sculk_patch_deep_dark");
   public static final alf<eiy<?, ?>> w = ri.a("sculk_patch_ancient_city");
   public static final alf<eiy<?, ?>> x = ri.a("sculk_vein");

   private static je<eqf> a(ja $$0) {
      return rx.a(
         ejm.w,
         new elh(
            List.of(
               elh.a(new btp(bso.<bti>b().a(bto.a(0, 4), 2).a(btf.a(0), 1).a()), enr.a(dmh.to.m().b(eax.T, $$0))),
               elh.a(btf.a(1), enr.a(dmh.tn.m().b(eax.T, $$0)))
            ),
            ja.b,
            ehn.d,
            true
         )
      );
   }

   private static je<eqf> a() {
      return rx.a(
         ejm.T,
         new emi(
            new eob(
               bso.<eah>b().a(dmh.tp.m().b(dtu.d, ja.f), 1).a(dmh.tp.m().b(dtu.d, ja.e), 1).a(dmh.tp.m().b(dtu.d, ja.c), 1).a(dmh.tp.m().b(dtu.d, ja.d), 1)
            )
         )
      );
   }

   public static void a(qh<eiy<?, ?>> $$0) {
      jf<eiy<?, ?>> $$1 = $$0.a(mg.aL);
      jf<evb> $$2 = $$0.a(mg.bc);
      ri.a($$0, a, ejm.C);
      List<alg> $$3 = List.of(
         alg.b("fossil/spine_1"),
         alg.b("fossil/spine_2"),
         alg.b("fossil/spine_3"),
         alg.b("fossil/spine_4"),
         alg.b("fossil/skull_1"),
         alg.b("fossil/skull_2"),
         alg.b("fossil/skull_3"),
         alg.b("fossil/skull_4")
      );
      List<alg> $$4 = List.of(
         alg.b("fossil/spine_1_coal"),
         alg.b("fossil/spine_2_coal"),
         alg.b("fossil/spine_3_coal"),
         alg.b("fossil/spine_4_coal"),
         alg.b("fossil/skull_1_coal"),
         alg.b("fossil/skull_2_coal"),
         alg.b("fossil/skull_3_coal"),
         alg.b("fossil/skull_4_coal")
      );
      je<evb> $$5 = $$2.b(qp.D);
      ri.a($$0, b, ejm.p, new ejr($$3, $$4, $$5, $$2.b(qp.E), 4));
      ri.a($$0, c, ejm.p, new ejr($$3, $$4, $$5, $$2.b(qp.F), 4));
      ri.a($$0, d, ejm.ak, new elo(12, bto.a(3, 6), bto.a(2, 8), 1, 3, bto.a(2, 4), btn.b(0.3F, 0.7F), btc.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      ri.a($$0, e, ejm.al, new elt(30, bto.a(3, 19), btn.b(0.4F, 2.0F), 0.33F, btn.b(0.3F, 0.9F), btn.b(0.4F, 1.0F), btn.b(0.0F, 0.3F), 4, 0.6F));
      ri.a(
         $$0,
         f,
         ejm.ah,
         new emj(
            ji.a(
               rx.a(ejm.am, new elz(0.2F, 0.7F, 0.5F, 0.5F), epy.a(ja.a, ehn.c(), ehn.d, 12), eqk.a(btf.a(1))),
               rx.a(ejm.am, new elz(0.2F, 0.7F, 0.5F, 0.5F), epy.a(ja.b, ehn.c(), ehn.d, 12), eqk.a(btf.a(-1)))
            )
         )
      );
      ri.a($$0, g, ejm.B, new emo(5, 1, 0.5F));
      drm $$6 = (drm)dmh.fy;
      ri.a($$0, h, ejm.A, new elv($$6, 20, false, true, true, 0.5F, ji.a(dmf::p, dmh.b, dmh.g, dmh.e, dmh.c, dmh.tc, dmh.rv, dmh.rh, dmh.tt)));
      ri.a(
         $$0,
         i,
         ejm.z,
         new emg(
            rx.a($$1.b(rn.z)),
            3,
            3,
            axc.bz,
            enr.a(dmh.tr),
            20,
            100,
            3,
            2,
            enr.a(dmh.tq),
            20,
            2,
            ehn.a(ehn.b(ehn.c(List.of(dmh.a, dmh.nI, dmh.nH)), ehn.a(axc.cs)), ehn.a(ja.a.q(), axc.cm))
         )
      );
      eob $$7 = new eob(bso.<eah>b().a(dmh.te.m(), 4).a(dmh.te.m().b(dnd.t_, Boolean.valueOf(true)), 1));
      enx $$8 = new enx(new eob(bso.<eah>b().a(dmh.td.m(), 4).a(dmh.td.m().b(dnd.t_, Boolean.valueOf(true)), 1)), dne.e, bto.a(23, 25));
      ri.a(
         $$0,
         j,
         ejm.w,
         new elh(
            List.of(elh.a(new btp(bso.<bti>b().a(bto.a(0, 19), 2).a(bto.a(0, 2), 3).a(bto.a(0, 6), 10).a()), $$7), elh.a(btf.a(1), $$8)), ja.a, ehn.c, true
         )
      );
      ri.a($$0, k, ejm.w, new elh(List.of(elh.a(new btp(bso.<bti>b().a(bto.a(0, 3), 5).a(bto.a(1, 7), 1).a()), $$7), elh.a(btf.a(1), $$8)), ja.a, ehn.c, true));
      ri.a($$0, l, ejm.T, new emi(new eob(bso.<eah>b().a(dmh.th.m(), 4).a(dmh.tg.m(), 7).a(dmh.ti.m(), 25).a(dmh.bA.m(), 50).a(dmh.jj.m(), 10))));
      ri.a($$0, m, ejm.x, new emp(axc.bx, enr.a(dmh.tm), rx.a($$1.b(l)), epv.b, btf.a(1), 0.0F, 5, 0.8F, bto.a(4, 7), 0.3F));
      ri.a($$0, n, ejm.x, new emp(axc.bx, enr.a(dmh.tm), rx.a($$1.b(l)), epv.b, btf.a(1), 0.0F, 5, 0.6F, bto.a(1, 2), 0.75F));
      ri.a($$0, o, ejm.ah, new emj(ji.a(a(), a(ja.f), a(ja.e), a(ja.d), a(ja.c))));
      ri.a($$0, p, ejm.x, new emp(axc.by, enr.a(dmh.ei), rx.a($$1.b(o)), epv.b, btf.a(3), 0.8F, 2, 0.05F, bto.a(4, 7), 0.7F));
      ri.a($$0, q, ejm.y, new emp(axc.by, enr.a(dmh.ei), rx.a($$1.b(o)), epv.b, btf.a(3), 0.8F, 5, 0.1F, bto.a(4, 7), 0.7F));
      ri.a($$0, r, ejm.ai, new emb(rx.a($$1.b(p)), rx.a($$1.b(q))));
      ri.a($$0, s, ejm.x, new emp(axc.bx, enr.a(dmh.tm), rx.a($$1.b(k)), epv.a, bto.a(1, 2), 0.0F, 5, 0.08F, bto.a(4, 7), 0.3F));
      ri.a($$0, t, ejm.T, new emi(enr.a(dmh.tf)));
      ri.a(
         $$0,
         u,
         ejm.aj,
         new elr(
            new egd(
               enr.a(dmh.a),
               enr.a(dmh.rb),
               enr.a(dmh.rc),
               enr.a(dmh.rv),
               enr.a(dmh.tO),
               List.of(dmh.rg.m(), dmh.rf.m(), dmh.re.m(), dmh.rd.m()),
               axc.bS,
               axc.bU
            ),
            new egf(1.7, 2.2, 3.2, 4.2),
            new ege(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bto.a(4, 6),
            bto.a(3, 4),
            bto.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      ri.a($$0, v, ejm.an, new emh(10, 32, 64, 0, 1, btf.a(0), 0.5F));
      ri.a($$0, w, ejm.an, new emh(10, 32, 64, 0, 1, bto.a(1, 3), 0.5F));
      drm $$9 = (drm)dmh.rB;
      ri.a($$0, x, ejm.A, new elv($$9, 20, true, true, true, 1.0F, ji.a(dmf::p, dmh.b, dmh.g, dmh.e, dmh.c, dmh.tc, dmh.rv, dmh.rh, dmh.tt)));
   }
}
