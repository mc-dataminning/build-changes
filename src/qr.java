import com.google.common.collect.ImmutableList;
import java.util.List;

public class qr {
   private static final ake<eke> M = a("empty");
   public static final ake<eke> a = a("zombie_plains");
   public static final ake<eke> b = a("zombie_savanna");
   public static final ake<eke> c = a("zombie_snowy");
   public static final ake<eke> d = a("zombie_taiga");
   public static final ake<eke> e = a("zombie_desert");
   public static final ake<eke> f = a("mossify_10_percent");
   public static final ake<eke> g = a("mossify_20_percent");
   public static final ake<eke> h = a("mossify_70_percent");
   public static final ake<eke> i = a("street_plains");
   public static final ake<eke> j = a("street_savanna");
   public static final ake<eke> k = a("street_snowy_or_taiga");
   public static final ake<eke> l = a("farm_plains");
   public static final ake<eke> m = a("farm_savanna");
   public static final ake<eke> n = a("farm_snowy");
   public static final ake<eke> o = a("farm_taiga");
   public static final ake<eke> p = a("farm_desert");
   public static final ake<eke> q = a("outpost_rot");
   public static final ake<eke> r = a("bottom_rampart");
   public static final ake<eke> s = a("treasure_rooms");
   public static final ake<eke> t = a("housing");
   public static final ake<eke> u = a("side_wall_degradation");
   public static final ake<eke> v = a("stable_degradation");
   public static final ake<eke> w = a("bastion_generic_degradation");
   public static final ake<eke> x = a("rampart_degradation");
   public static final ake<eke> y = a("entrance_replacement");
   public static final ake<eke> z = a("bridge");
   public static final ake<eke> A = a("roof");
   public static final ake<eke> B = a("high_wall");
   public static final ake<eke> C = a("high_rampart");
   public static final ake<eke> D = a("fossil_rot");
   public static final ake<eke> E = a("fossil_coal");
   public static final ake<eke> F = a("fossil_diamonds");
   public static final ake<eke> G = a("ancient_city_start_degradation");
   public static final ake<eke> H = a("ancient_city_generic_degradation");
   public static final ake<eke> I = a("ancient_city_walls_degradation");
   public static final ake<eke> J = a("trail_ruins_houses_archaeology");
   public static final ake<eke> K = a("trail_ruins_roads_archaeology");
   public static final ake<eke> L = a("trail_ruins_tower_top_archaeology");

   private static ake<eke> a(String $$0) {
      return ake.a(ld.aJ, new akf($$0));
   }

   private static void a(qj<eke> $$0, ake<eke> $$1, List<ekd> $$2) {
      $$0.a($$1, new eke($$2));
   }

   public static void a(qj<eke> $$0) {
      iw<dcv> $$1 = $$0.a(ld.f);
      ejv $$2 = new ejv(new ejx(dcx.pr, 0.01F), eje.b, dcx.pC.n());
      ejv $$3 = new ejv(new ejx(dcx.pC, 0.5F), eje.b, dcx.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.m, 0.8F), eje.b, dcx.cn.n()),
                  new ejv(new eki(avo.p), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cp), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cq), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.m, 0.07F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.cn, 0.07F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.hj, 0.07F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.U, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.n, 0.1F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.cu, 0.1F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.al, 0.02F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.eY, 0.5F), eje.b, dcx.bs.n()),
                  new ejv[]{
                     new ejv(
                        new ejl(dcx.eY.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))),
                        eje.b,
                        dcx.hL.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))
                     ),
                     new ejv(
                        new ejl(dcx.eY.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))),
                        eje.b,
                        dcx.hL.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))
                     ),
                     new ejv(new ejx(dcx.cB, 0.3F), eje.b, dcx.gt.n()),
                     new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.gu.n()),
                     new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new eki(avo.p), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cp), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cq), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.r, 0.2F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.hP, 0.2F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.Y, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.as, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.hk, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.hn, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.hx, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.eY, 0.5F), eje.b, dcx.bs.n()),
                  new ejv(
                     new ejl(dcx.eY.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))),
                     eje.b,
                     dcx.hL.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))
                  ),
                  new ejv[]{
                     new ejv(
                        new ejl(dcx.eY.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))),
                        eje.b,
                        dcx.hL.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))
                     ),
                     new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new eki(avo.p), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cp), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cq), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.oe), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.o, 0.2F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.ju, 0.4F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.af, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.ax, 0.05F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.eY, 0.5F), eje.b, dcx.bs.n()),
                  new ejv(
                     new ejl(dcx.eY.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))),
                     eje.b,
                     dcx.hL.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))
                  ),
                  new ejv(
                     new ejl(dcx.eY.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))),
                     eje.b,
                     dcx.hL.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))
                  ),
                  new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.gt.n()),
                  new ejv[]{new ejv(new ejx(dcx.cB, 0.8F), eje.b, dcx.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.m, 0.8F), eje.b, dcx.cn.n()),
                  new ejv(new eki(avo.p), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cp), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cq), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.og), eje.b, dcx.og.n().a(ddj.c, Boolean.valueOf(false))),
                  new ejv(new ejx(dcx.m, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.V, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.eY, 0.5F), eje.b, dcx.bs.n()),
                  new ejv(
                     new ejl(dcx.eY.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))),
                     eje.b,
                     dcx.hL.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true))
                  ),
                  new ejv(
                     new ejl(dcx.eY.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))),
                     eje.b,
                     dcx.hL.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true))
                  ),
                  new ejv(new ejx(dcx.cB, 0.3F), eje.b, dcx.fd.n()),
                  new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.gu.n()),
                  new ejv[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new eki(avo.p), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cp), eje.b, dcx.a.n()),
                  new ejv(new ejj(dcx.cq), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.jS, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.aX, 0.1F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.iA, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.nl, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.ny, 0.08F), eje.b, dcx.bs.n()),
                  new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.kD.n()),
                  new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.m, 0.1F), eje.b, dcx.cn.n())))));
      a($$0, g, ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.m, 0.2F), eje.b, dcx.cn.n())))));
      a($$0, h, ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.m, 0.7F), eje.b, dcx.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejj(dcx.kE), new ejj(dcx.G), dcx.n.n()),
                  new ejv(new ejx(dcx.kE, 0.1F), eje.b, dcx.i.n()),
                  new ejv(new ejj(dcx.i), new ejj(dcx.G), dcx.G.n()),
                  new ejv(new ejj(dcx.j), new ejj(dcx.G), dcx.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejj(dcx.kE), new ejj(dcx.G), dcx.r.n()),
                  new ejv(new ejx(dcx.kE, 0.2F), eje.b, dcx.i.n()),
                  new ejv(new ejj(dcx.i), new ejj(dcx.G), dcx.G.n()),
                  new ejv(new ejj(dcx.j), new ejj(dcx.G), dcx.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejj(dcx.kE), new ejj(dcx.G), dcx.o.n()),
                  new ejv(new ejj(dcx.kE), new ejj(dcx.dO), dcx.o.n()),
                  new ejv(new ejx(dcx.kE, 0.2F), eje.b, dcx.i.n()),
                  new ejv(new ejj(dcx.i), new ejj(dcx.G), dcx.G.n()),
                  new ejv(new ejj(dcx.j), new ejj(dcx.G), dcx.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.cB, 0.3F), eje.b, dcx.gt.n()),
                  new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.gu.n()),
                  new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.gt.n()), new ejv(new ejx(dcx.cB, 0.8F), eje.b, dcx.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.cB, 0.3F), eje.b, dcx.fd.n()), new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.cB, 0.2F), eje.b, dcx.kD.n()), new ejv(new ejx(dcx.cB, 0.1F), eje.b, dcx.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new ejk(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.kJ, 0.75F), eje.b, dcx.px.n()), new ejv(new ejx(dcx.px, 0.15F), eje.b, dcx.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.pw, 0.35F), eje.b, dcx.px.n()), new ejv(new ejx(dcx.py, 0.1F), eje.b, dcx.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.px.n()), new ejv(new ejx(dcx.pr, 1.0E-4F), eje.b, dcx.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.py, 0.5F), eje.b, dcx.a.n()), new ejv(new ejx(dcx.ch, 0.1F), eje.b, dcx.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.pw, 0.1F), eje.b, dcx.px.n()), new ejv(new ejx(dcx.pr, 1.0E-4F), eje.b, dcx.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.px.n()),
                  new ejv(new ejx(dcx.pr, 1.0E-4F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.ch, 0.3F), eje.b, dcx.px.n()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         x,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.pw, 0.4F), eje.b, dcx.px.n()),
                  new ejv(new ejx(dcx.pr, 0.01F), eje.b, dcx.px.n()),
                  new ejv(new ejx(dcx.pw, 1.0E-4F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.pr, 1.0E-4F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.ch, 0.3F), eje.b, dcx.px.n()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         y,
         ImmutableList.of(
            new ejz(ImmutableList.of(new ejv(new ejx(dcx.py, 0.5F), eje.b, dcx.a.n()), new ejv(new ejx(dcx.ch, 0.6F), eje.b, dcx.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ejz(ImmutableList.of(new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.px.n()), new ejv(new ejx(dcx.pr, 1.0E-4F), eje.b, dcx.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.px.n()),
                  new ejv(new ejx(dcx.pw, 0.15F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.pw, 0.01F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.pw, 0.5F), eje.b, dcx.px.n()),
                  new ejv(new ejx(dcx.pw, 0.3F), eje.b, dcx.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(new ejv(new ejx(dcx.ch, 0.3F), eje.b, dcx.px.n()), new ejv(eje.b, eje.b, new ejf(0.0F, 0.05F, 0, 100, ir.a.b), dcx.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ejk(0.9F), new ejw(avo.bI)));
      a($$0, E, ImmutableList.of(new ejk(0.1F), new ejw(avo.bI)));
      a($$0, F, ImmutableList.of(new ejk(0.1F), new ejz(ImmutableList.of(new ejv(new ejj(dcx.R), eje.b, dcx.cy.n()))), new ejw(avo.bI)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.sW, 0.3F), eje.b, dcx.tb.n()),
                  new ejv(new ejx(dcx.sS, 0.3F), eje.b, dcx.tc.n()),
                  new ejv(new ejx(dcx.of, 0.05F), eje.b, dcx.a.n())
               )
            ),
            new ejw(avo.bI)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ejk($$1.b(avo.bO), 0.95F),
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.sW, 0.3F), eje.b, dcx.tb.n()),
                  new ejv(new ejx(dcx.sS, 0.3F), eje.b, dcx.tc.n()),
                  new ejv(new ejx(dcx.of, 0.05F), eje.b, dcx.a.n())
               )
            ),
            new ejw(avo.bI)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ejk($$1.b(avo.bO), 0.95F),
            new ejz(
               ImmutableList.of(
                  new ejv(new ejx(dcx.sW, 0.3F), eje.b, dcx.tb.n()),
                  new ejv(new ejx(dcx.sS, 0.3F), eje.b, dcx.tc.n()),
                  new ejv(new ejx(dcx.sU, 0.3F), eje.b, dcx.a.n()),
                  new ejv(new ejx(dcx.of, 0.05F), eje.b, dcx.a.n())
               )
            ),
            new ejw(avo.bI)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ejz(
               List.of(
                  new ejv(new ejx(dcx.L, 0.2F), eje.b, dcx.j.n()),
                  new ejv(new ejx(dcx.L, 0.1F), eje.b, dcx.k.n()),
                  new ejv(new ejx(dcx.eM, 0.1F), eje.b, dcx.eL.n())
               )
            ),
            a(eny.aV, 6),
            a(eny.aW, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ejz(
               List.of(
                  new ejv(new ejx(dcx.L, 0.2F), eje.b, dcx.j.n()),
                  new ejv(new ejx(dcx.L, 0.1F), eje.b, dcx.k.n()),
                  new ejv(new ejx(dcx.eM, 0.1F), eje.b, dcx.eL.n())
               )
            ),
            a(eny.aV, 2)
         )
      );
      a($$0, L, List.of(a(eny.aV, 2)));
   }

   private static ejm a(akf $$0, int $$1) {
      return new ejm(new ejz(List.of(new ejv(new eki(avo.cn), eje.b, ejs.b, dcx.M.n(), new ekk($$0)))), bns.a($$1));
   }
}
