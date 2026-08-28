import java.util.List;

public class rg {
   public static final alh<ejv<?, ?>> a = ri.a("monster_room");
   public static final alh<ejv<?, ?>> b = ri.a("fossil_coal");
   public static final alh<ejv<?, ?>> c = ri.a("fossil_diamonds");
   public static final alh<ejv<?, ?>> d = ri.a("dripstone_cluster");
   public static final alh<ejv<?, ?>> e = ri.a("large_dripstone");
   public static final alh<ejv<?, ?>> f = ri.a("pointed_dripstone");
   public static final alh<ejv<?, ?>> g = ri.a("underwater_magma");
   public static final alh<ejv<?, ?>> h = ri.a("glow_lichen");
   public static final alh<ejv<?, ?>> i = ri.a("rooted_azalea_tree");
   public static final alh<ejv<?, ?>> j = ri.a("cave_vine");
   public static final alh<ejv<?, ?>> k = ri.a("cave_vine_in_moss");
   public static final alh<ejv<?, ?>> l = ri.a("moss_vegetation");
   public static final alh<ejv<?, ?>> m = ri.a("moss_patch");
   public static final alh<ejv<?, ?>> n = ri.a("moss_patch_bonemeal");
   public static final alh<ejv<?, ?>> o = ri.a("dripleaf");
   public static final alh<ejv<?, ?>> p = ri.a("clay_with_dripleaves");
   public static final alh<ejv<?, ?>> q = ri.a("clay_pool_with_dripleaves");
   public static final alh<ejv<?, ?>> r = ri.a("lush_caves_clay");
   public static final alh<ejv<?, ?>> s = ri.a("moss_patch_ceiling");
   public static final alh<ejv<?, ?>> t = ri.a("spore_blossom");
   public static final alh<ejv<?, ?>> u = ri.a("amethyst_geode");
   public static final alh<ejv<?, ?>> v = ri.a("sculk_patch_deep_dark");
   public static final alh<ejv<?, ?>> w = ri.a("sculk_patch_ancient_city");
   public static final alh<ejv<?, ?>> x = ri.a("sculk_vein");

   private static jf<erf> a(jb $$0) {
      return rx.a(
         ekk.x,
         new emf(
            List.of(
               emf.a(new bud(btb.<btw>b().a(buc.a(0, 4), 2).a(btt.a(0), 1).a()), eoq.a(dne.to.m().b(ebu.T, $$0))),
               emf.a(btt.a(1), eoq.a(dne.tn.m().b(ebu.T, $$0)))
            ),
            jb.b,
            eik.d,
            true
         )
      );
   }

   private static jf<erf> a() {
      return rx.a(
         ekk.U,
         new enh(
            new epa(
               btb.<ebe>b().a(dne.tp.m().b(dur.d, jb.f), 1).a(dne.tp.m().b(dur.d, jb.e), 1).a(dne.tp.m().b(dur.d, jb.c), 1).a(dne.tp.m().b(dur.d, jb.d), 1)
            )
         )
      );
   }

   public static void a(qh<ejv<?, ?>> $$0) {
      jg<ejv<?, ?>> $$1 = $$0.a(mh.aL);
      jg<ewb> $$2 = $$0.a(mh.bc);
      ri.a($$0, a, ekk.D);
      List<ali> $$3 = List.of(
         ali.b("fossil/spine_1"),
         ali.b("fossil/spine_2"),
         ali.b("fossil/spine_3"),
         ali.b("fossil/spine_4"),
         ali.b("fossil/skull_1"),
         ali.b("fossil/skull_2"),
         ali.b("fossil/skull_3"),
         ali.b("fossil/skull_4")
      );
      List<ali> $$4 = List.of(
         ali.b("fossil/spine_1_coal"),
         ali.b("fossil/spine_2_coal"),
         ali.b("fossil/spine_3_coal"),
         ali.b("fossil/spine_4_coal"),
         ali.b("fossil/skull_1_coal"),
         ali.b("fossil/skull_2_coal"),
         ali.b("fossil/skull_3_coal"),
         ali.b("fossil/skull_4_coal")
      );
      jf<ewb> $$5 = $$2.b(qp.D);
      ri.a($$0, b, ekk.q, new ekp($$3, $$4, $$5, $$2.b(qp.E), 4));
      ri.a($$0, c, ekk.q, new ekp($$3, $$4, $$5, $$2.b(qp.F), 4));
      ri.a($$0, d, ekk.al, new emm(12, buc.a(3, 6), buc.a(2, 8), 1, 3, buc.a(2, 4), bub.b(0.3F, 0.7F), btq.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      ri.a($$0, e, ekk.am, new ems(30, buc.a(3, 19), bub.b(0.4F, 2.0F), 0.33F, bub.b(0.3F, 0.9F), bub.b(0.4F, 1.0F), bub.b(0.0F, 0.3F), 4, 0.6F));
      ri.a(
         $$0,
         f,
         ekk.ai,
         new eni(
            jj.a(
               rx.a(ekk.an, new emy(0.2F, 0.7F, 0.5F, 0.5F), eqy.a(jb.a, eik.c(), eik.d, 12), erk.a(btt.a(1))),
               rx.a(ekk.an, new emy(0.2F, 0.7F, 0.5F, 0.5F), eqy.a(jb.b, eik.c(), eik.d, 12), erk.a(btt.a(-1)))
            )
         )
      );
      ri.a($$0, g, ekk.C, new enn(5, 1, 0.5F));
      dsj $$6 = (dsj)dne.fy;
      ri.a($$0, h, ekk.B, new emu($$6, 20, false, true, true, 0.5F, jj.a(dnc::p, dne.b, dne.g, dne.e, dne.c, dne.tc, dne.rv, dne.rh, dne.tt)));
      ri.a(
         $$0,
         i,
         ekk.A,
         new enf(
            rx.a($$1.b(rn.z)),
            3,
            3,
            axe.bz,
            eoq.a(dne.tr),
            20,
            100,
            3,
            2,
            eoq.a(dne.tq),
            20,
            2,
            eik.a(eik.b(eik.c(List.of(dne.a, dne.nI, dne.nH)), eik.a(axe.ct)), eik.a(jb.a.q(), axe.cn))
         )
      );
      epa $$7 = new epa(btb.<ebe>b().a(dne.te.m(), 4).a(dne.te.m().b(doa.r_, Boolean.valueOf(true)), 1));
      eow $$8 = new eow(new epa(btb.<ebe>b().a(dne.td.m(), 4).a(dne.td.m().b(doa.r_, Boolean.valueOf(true)), 1)), dob.e, buc.a(23, 25));
      ri.a(
         $$0,
         j,
         ekk.x,
         new emf(
            List.of(emf.a(new bud(btb.<btw>b().a(buc.a(0, 19), 2).a(buc.a(0, 2), 3).a(buc.a(0, 6), 10).a()), $$7), emf.a(btt.a(1), $$8)), jb.a, eik.c, true
         )
      );
      ri.a($$0, k, ekk.x, new emf(List.of(emf.a(new bud(btb.<btw>b().a(buc.a(0, 3), 5).a(buc.a(1, 7), 1).a()), $$7), emf.a(btt.a(1), $$8)), jb.a, eik.c, true));
      ri.a($$0, l, ekk.U, new enh(new epa(btb.<ebe>b().a(dne.th.m(), 4).a(dne.tg.m(), 7).a(dne.ti.m(), 25).a(dne.bA.m(), 50).a(dne.jj.m(), 10))));
      ri.a($$0, m, ekk.y, new eno(axe.bx, eoq.a(dne.tm), rx.a($$1.b(l)), eqv.b, btt.a(1), 0.0F, 5, 0.8F, buc.a(4, 7), 0.3F));
      ri.a($$0, n, ekk.y, new eno(axe.bx, eoq.a(dne.tm), rx.a($$1.b(l)), eqv.b, btt.a(1), 0.0F, 5, 0.6F, buc.a(1, 2), 0.75F));
      ri.a($$0, o, ekk.ai, new eni(jj.a(a(), a(jb.f), a(jb.e), a(jb.d), a(jb.c))));
      ri.a($$0, p, ekk.y, new eno(axe.by, eoq.a(dne.ei), rx.a($$1.b(o)), eqv.b, btt.a(3), 0.8F, 2, 0.05F, buc.a(4, 7), 0.7F));
      ri.a($$0, q, ekk.z, new eno(axe.by, eoq.a(dne.ei), rx.a($$1.b(o)), eqv.b, btt.a(3), 0.8F, 5, 0.1F, buc.a(4, 7), 0.7F));
      ri.a($$0, r, ekk.aj, new ena(rx.a($$1.b(p)), rx.a($$1.b(q))));
      ri.a($$0, s, ekk.y, new eno(axe.bx, eoq.a(dne.tm), rx.a($$1.b(k)), eqv.a, buc.a(1, 2), 0.0F, 5, 0.08F, buc.a(4, 7), 0.3F));
      ri.a($$0, t, ekk.U, new enh(eoq.a(dne.tf)));
      ri.a(
         $$0,
         u,
         ekk.ak,
         new emq(
            new eha(
               eoq.a(dne.a),
               eoq.a(dne.rb),
               eoq.a(dne.rc),
               eoq.a(dne.rv),
               eoq.a(dne.tO),
               List.of(dne.rg.m(), dne.rf.m(), dne.re.m(), dne.rd.m()),
               axe.bS,
               axe.bU
            ),
            new ehc(1.7, 2.2, 3.2, 4.2),
            new ehb(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            buc.a(4, 6),
            buc.a(3, 4),
            buc.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      ri.a($$0, v, ekk.ao, new eng(10, 32, 64, 0, 1, btt.a(0), 0.5F));
      ri.a($$0, w, ekk.ao, new eng(10, 32, 64, 0, 1, buc.a(1, 3), 0.5F));
      dsj $$9 = (dsj)dne.rB;
      ri.a($$0, x, ekk.B, new emu($$9, 20, true, true, true, 1.0F, jj.a(dnc::p, dne.b, dne.g, dne.e, dne.c, dne.tc, dne.rv, dne.rh, dne.tt)));
   }
}
