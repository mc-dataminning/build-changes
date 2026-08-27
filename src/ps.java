import java.util.List;

public class ps {
   public static final agf<dow<?, ?>> a = pu.a("monster_room");
   public static final agf<dow<?, ?>> b = pu.a("fossil_coal");
   public static final agf<dow<?, ?>> c = pu.a("fossil_diamonds");
   public static final agf<dow<?, ?>> d = pu.a("dripstone_cluster");
   public static final agf<dow<?, ?>> e = pu.a("large_dripstone");
   public static final agf<dow<?, ?>> f = pu.a("pointed_dripstone");
   public static final agf<dow<?, ?>> g = pu.a("underwater_magma");
   public static final agf<dow<?, ?>> h = pu.a("glow_lichen");
   public static final agf<dow<?, ?>> i = pu.a("rooted_azalea_tree");
   public static final agf<dow<?, ?>> j = pu.a("cave_vine");
   public static final agf<dow<?, ?>> k = pu.a("cave_vine_in_moss");
   public static final agf<dow<?, ?>> l = pu.a("moss_vegetation");
   public static final agf<dow<?, ?>> m = pu.a("moss_patch");
   public static final agf<dow<?, ?>> n = pu.a("moss_patch_bonemeal");
   public static final agf<dow<?, ?>> o = pu.a("dripleaf");
   public static final agf<dow<?, ?>> p = pu.a("clay_with_dripleaves");
   public static final agf<dow<?, ?>> q = pu.a("clay_pool_with_dripleaves");
   public static final agf<dow<?, ?>> r = pu.a("lush_caves_clay");
   public static final agf<dow<?, ?>> s = pu.a("moss_patch_ceiling");
   public static final agf<dow<?, ?>> t = pu.a("spore_blossom");
   public static final agf<dow<?, ?>> u = pu.a("amethyst_geode");
   public static final agf<dow<?, ?>> v = pu.a("sculk_patch_deep_dark");
   public static final agf<dow<?, ?>> w = pu.a("sculk_patch_ancient_city");
   public static final agf<dow<?, ?>> x = pu.a("sculk_vein");

   private static ib<dvz> a(hx $$0) {
      return qj.a(
         dpj.w,
         new dre(
            List.of(
               dre.a(new bic(bha.<bhv>a().a(bib.a(0, 4), 2).a(bhs.a(0), 1).a()), dto.a(cuv.rD.o().a(dhm.R, $$0))),
               dre.a(bhs.a(1), dto.a(cuv.rC.o().a(dhm.R, $$0)))
            ),
            hx.b,
            dnm.d,
            true
         )
      );
   }

   private static ib<dvz> a() {
      return qj.a(
         dpj.S,
         new dsf(
            new dty(
               bha.<dgw>a().a(cuv.rE.o().a(dbx.d, hx.f), 1).a(cuv.rE.o().a(dbx.d, hx.e), 1).a(cuv.rE.o().a(dbx.d, hx.c), 1).a(cuv.rE.o().a(dbx.d, hx.d), 1)
            )
         )
      );
   }

   public static void a(ou<dow<?, ?>> $$0) {
      ic<dow<?, ?>> $$1 = $$0.a(jz.au);
      ic<eat> $$2 = $$0.a(jz.aC);
      pu.a($$0, a, dpj.C);
      List<agg> $$3 = List.of(
         new agg("fossil/spine_1"),
         new agg("fossil/spine_2"),
         new agg("fossil/spine_3"),
         new agg("fossil/spine_4"),
         new agg("fossil/skull_1"),
         new agg("fossil/skull_2"),
         new agg("fossil/skull_3"),
         new agg("fossil/skull_4")
      );
      List<agg> $$4 = List.of(
         new agg("fossil/spine_1_coal"),
         new agg("fossil/spine_2_coal"),
         new agg("fossil/spine_3_coal"),
         new agg("fossil/spine_4_coal"),
         new agg("fossil/skull_1_coal"),
         new agg("fossil/skull_2_coal"),
         new agg("fossil/skull_3_coal"),
         new agg("fossil/skull_4_coal")
      );
      ib<eat> $$5 = $$2.b(pc.D);
      pu.a($$0, b, dpj.p, new dpo($$3, $$4, $$5, $$2.b(pc.E), 4));
      pu.a($$0, c, dpj.p, new dpo($$3, $$4, $$5, $$2.b(pc.F), 4));
      pu.a($$0, d, dpj.aj, new drl(12, bib.a(3, 6), bib.a(2, 8), 1, 3, bib.a(2, 4), bia.b(0.3F, 0.7F), bhp.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      pu.a($$0, e, dpj.ak, new drq(30, bib.a(3, 19), bia.b(0.4F, 2.0F), 0.33F, bia.b(0.3F, 0.9F), bia.b(0.4F, 1.0F), bia.b(0.0F, 0.3F), 4, 0.6F));
      pu.a(
         $$0,
         f,
         dpj.ag,
         new dsg(
            ig.a(
               qj.a(dpj.al, new drw(0.2F, 0.7F, 0.5F, 0.5F), dvt.a(hx.a, dnm.c(), dnm.d, 12), dwe.a(bhs.a(1))),
               qj.a(dpj.al, new drw(0.2F, 0.7F, 0.5F, 0.5F), dvt.a(hx.b, dnm.c(), dnm.d, 12), dwe.a(bhs.a(-1)))
            )
         )
      );
      pu.a($$0, g, dpj.B, new dsl(5, 1, 0.5F));
      czs $$6 = (czs)cuv.fg;
      pu.a($$0, h, dpj.A, new drs($$6, 20, false, true, true, 0.5F, ig.a(cut::r, cuv.b, cuv.g, cuv.e, cuv.c, cuv.rt, cuv.qA, cuv.qz, cuv.rI)));
      pu.a(
         $$0,
         i,
         dpj.z,
         new dsd(
            qj.a($$1.b(pz.w)),
            3,
            3,
            arc.bv,
            dto.a(cuv.rG),
            20,
            100,
            3,
            2,
            dto.a(cuv.rF),
            20,
            2,
            dnm.a(dnm.b(dnm.c(List.of(cuv.a, cuv.nc, cuv.nb)), dnm.a(arc.cf)), dnm.a(hx.a.q(), arc.bZ))
         )
      );
      dty $$7 = new dty(bha.<dgw>a().a(cuv.rv.o(), 4).a(cuv.rv.o().a(cvp.s_, Boolean.valueOf(true)), 1));
      dtu $$8 = new dtu(new dty(bha.<dgw>a().a(cuv.ru.o(), 4).a(cuv.ru.o().a(cvp.s_, Boolean.valueOf(true)), 1)), cvq.e, bib.a(23, 25));
      pu.a(
         $$0,
         j,
         dpj.w,
         new dre(
            List.of(dre.a(new bic(bha.<bhv>a().a(bib.a(0, 19), 2).a(bib.a(0, 2), 3).a(bib.a(0, 6), 10).a()), $$7), dre.a(bhs.a(1), $$8)), hx.a, dnm.c, true
         )
      );
      pu.a($$0, k, dpj.w, new dre(List.of(dre.a(new bic(bha.<bhv>a().a(bib.a(0, 3), 5).a(bib.a(1, 7), 1).a()), $$7), dre.a(bhs.a(1), $$8)), hx.a, dnm.c, true));
      pu.a($$0, l, dpj.S, new dsf(new dty(bha.<dgw>a().a(cuv.ry.o(), 4).a(cuv.rx.o(), 7).a(cuv.rz.o(), 25).a(cuv.bt.o(), 50).a(cuv.iH.o(), 10))));
      pu.a($$0, m, dpj.x, new dsm(arc.bt, dto.a(cuv.rB), qj.a($$1.b(l)), dvq.b, bhs.a(1), 0.0F, 5, 0.8F, bib.a(4, 7), 0.3F));
      pu.a($$0, n, dpj.x, new dsm(arc.bt, dto.a(cuv.rB), qj.a($$1.b(l)), dvq.b, bhs.a(1), 0.0F, 5, 0.6F, bib.a(1, 2), 0.75F));
      pu.a($$0, o, dpj.ag, new dsg(ig.a(a(), a(hx.f), a(hx.e), a(hx.d), a(hx.c))));
      pu.a($$0, p, dpj.x, new dsm(arc.bu, dto.a(cuv.dR), qj.a($$1.b(o)), dvq.b, bhs.a(3), 0.8F, 2, 0.05F, bib.a(4, 7), 0.7F));
      pu.a($$0, q, dpj.y, new dsm(arc.bu, dto.a(cuv.dR), qj.a($$1.b(o)), dvq.b, bhs.a(3), 0.8F, 5, 0.1F, bib.a(4, 7), 0.7F));
      pu.a($$0, r, dpj.ah, new dry(qj.a($$1.b(p)), qj.a($$1.b(q))));
      pu.a($$0, s, dpj.x, new dsm(arc.bt, dto.a(cuv.rB), qj.a($$1.b(k)), dvq.a, bib.a(1, 2), 0.0F, 5, 0.08F, bib.a(4, 7), 0.3F));
      pu.a($$0, t, dpj.S, new dsf(dto.a(cuv.rw)));
      pu.a(
         $$0,
         u,
         dpj.ai,
         new dro(
            new dmc(
               dto.a(cuv.a),
               dto.a(cuv.qt),
               dto.a(cuv.qu),
               dto.a(cuv.qA),
               dto.a(cuv.sd),
               List.of(cuv.qy.o(), cuv.qx.o(), cuv.qw.o(), cuv.qv.o()),
               arc.bH,
               arc.bJ
            ),
            new dme(1.7, 2.2, 3.2, 4.2),
            new dmd(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bib.a(4, 6),
            bib.a(3, 4),
            bib.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      pu.a($$0, v, dpj.am, new dse(10, 32, 64, 0, 1, bhs.a(0), 0.5F));
      pu.a($$0, w, dpj.am, new dse(10, 32, 64, 0, 1, bib.a(1, 3), 0.5F));
      czs $$9 = (czs)cuv.qG;
      pu.a($$0, x, dpj.A, new drs($$9, 20, true, true, true, 1.0F, ig.a(cut::r, cuv.b, cuv.g, cuv.e, cuv.c, cuv.rt, cuv.qA, cuv.qz, cuv.rI)));
   }
}
