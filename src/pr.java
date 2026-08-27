import com.google.common.collect.ImmutableList;
import java.util.List;

public class pr {
   private static final ajb<ege> M = a("empty");
   public static final ajb<ege> a = a("zombie_plains");
   public static final ajb<ege> b = a("zombie_savanna");
   public static final ajb<ege> c = a("zombie_snowy");
   public static final ajb<ege> d = a("zombie_taiga");
   public static final ajb<ege> e = a("zombie_desert");
   public static final ajb<ege> f = a("mossify_10_percent");
   public static final ajb<ege> g = a("mossify_20_percent");
   public static final ajb<ege> h = a("mossify_70_percent");
   public static final ajb<ege> i = a("street_plains");
   public static final ajb<ege> j = a("street_savanna");
   public static final ajb<ege> k = a("street_snowy_or_taiga");
   public static final ajb<ege> l = a("farm_plains");
   public static final ajb<ege> m = a("farm_savanna");
   public static final ajb<ege> n = a("farm_snowy");
   public static final ajb<ege> o = a("farm_taiga");
   public static final ajb<ege> p = a("farm_desert");
   public static final ajb<ege> q = a("outpost_rot");
   public static final ajb<ege> r = a("bottom_rampart");
   public static final ajb<ege> s = a("treasure_rooms");
   public static final ajb<ege> t = a("housing");
   public static final ajb<ege> u = a("side_wall_degradation");
   public static final ajb<ege> v = a("stable_degradation");
   public static final ajb<ege> w = a("bastion_generic_degradation");
   public static final ajb<ege> x = a("rampart_degradation");
   public static final ajb<ege> y = a("entrance_replacement");
   public static final ajb<ege> z = a("bridge");
   public static final ajb<ege> A = a("roof");
   public static final ajb<ege> B = a("high_wall");
   public static final ajb<ege> C = a("high_rampart");
   public static final ajb<ege> D = a("fossil_rot");
   public static final ajb<ege> E = a("fossil_coal");
   public static final ajb<ege> F = a("fossil_diamonds");
   public static final ajb<ege> G = a("ancient_city_start_degradation");
   public static final ajb<ege> H = a("ancient_city_generic_degradation");
   public static final ajb<ege> I = a("ancient_city_walls_degradation");
   public static final ajb<ege> J = a("trail_ruins_houses_archaeology");
   public static final ajb<ege> K = a("trail_ruins_roads_archaeology");
   public static final ajb<ege> L = a("trail_ruins_tower_top_archaeology");

   private static ajb<ege> a(String $$0) {
      return ajb.a(ki.aF, new ajc($$0));
   }

   private static void a(pj<ege> $$0, ajb<ege> $$1, List<egd> $$2) {
      $$0.a($$1, new ege($$2));
   }

   public static void a(pj<ege> $$0) {
      im<czf> $$1 = $$0.a(ki.f);
      efv $$2 = new efv(new efx(czh.pr, 0.01F), efe.b, czh.pC.o());
      efv $$3 = new efv(new efx(czh.pC, 0.5F), efe.b, czh.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.m, 0.8F), efe.b, czh.cn.o()),
                  new efv(new egi(aue.p), efe.b, czh.a.o()),
                  new efv(new efj(czh.cp), efe.b, czh.a.o()),
                  new efv(new efj(czh.cq), efe.b, czh.a.o()),
                  new efv(new efx(czh.m, 0.07F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.cn, 0.07F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.hj, 0.07F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.U, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.n, 0.1F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.cu, 0.1F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.al, 0.02F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.eY, 0.5F), efe.b, czh.bs.o()),
                  new efv[]{
                     new efv(
                        new efl(czh.eY.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))),
                        efe.b,
                        czh.hL.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))
                     ),
                     new efv(
                        new efl(czh.eY.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))),
                        efe.b,
                        czh.hL.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))
                     ),
                     new efv(new efx(czh.cB, 0.3F), efe.b, czh.gt.o()),
                     new efv(new efx(czh.cB, 0.2F), efe.b, czh.gu.o()),
                     new efv(new efx(czh.cB, 0.1F), efe.b, czh.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new egi(aue.p), efe.b, czh.a.o()),
                  new efv(new efj(czh.cp), efe.b, czh.a.o()),
                  new efv(new efj(czh.cq), efe.b, czh.a.o()),
                  new efv(new efx(czh.r, 0.2F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.hP, 0.2F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.Y, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.as, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.hk, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.hn, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.hx, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.eY, 0.5F), efe.b, czh.bs.o()),
                  new efv(
                     new efl(czh.eY.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))),
                     efe.b,
                     czh.hL.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))
                  ),
                  new efv[]{
                     new efv(
                        new efl(czh.eY.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))),
                        efe.b,
                        czh.hL.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))
                     ),
                     new efv(new efx(czh.cB, 0.1F), efe.b, czh.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new egi(aue.p), efe.b, czh.a.o()),
                  new efv(new efj(czh.cp), efe.b, czh.a.o()),
                  new efv(new efj(czh.cq), efe.b, czh.a.o()),
                  new efv(new efj(czh.oe), efe.b, czh.a.o()),
                  new efv(new efx(czh.o, 0.2F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.ju, 0.4F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.af, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.ax, 0.05F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.eY, 0.5F), efe.b, czh.bs.o()),
                  new efv(
                     new efl(czh.eY.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))),
                     efe.b,
                     czh.hL.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))
                  ),
                  new efv(
                     new efl(czh.eY.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))),
                     efe.b,
                     czh.hL.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))
                  ),
                  new efv(new efx(czh.cB, 0.1F), efe.b, czh.gt.o()),
                  new efv[]{new efv(new efx(czh.cB, 0.8F), efe.b, czh.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.m, 0.8F), efe.b, czh.cn.o()),
                  new efv(new egi(aue.p), efe.b, czh.a.o()),
                  new efv(new efj(czh.cp), efe.b, czh.a.o()),
                  new efv(new efj(czh.cq), efe.b, czh.a.o()),
                  new efv(new efj(czh.og), efe.b, czh.og.o().a(czt.c, Boolean.valueOf(false))),
                  new efv(new efx(czh.m, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.V, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.eY, 0.5F), efe.b, czh.bs.o()),
                  new efv(
                     new efl(czh.eY.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))),
                     efe.b,
                     czh.hL.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true))
                  ),
                  new efv(
                     new efl(czh.eY.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))),
                     efe.b,
                     czh.hL.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true))
                  ),
                  new efv(new efx(czh.cB, 0.3F), efe.b, czh.fd.o()),
                  new efv(new efx(czh.cB, 0.2F), efe.b, czh.gu.o()),
                  new efv[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new egi(aue.p), efe.b, czh.a.o()),
                  new efv(new efj(czh.cp), efe.b, czh.a.o()),
                  new efv(new efj(czh.cq), efe.b, czh.a.o()),
                  new efv(new efx(czh.jS, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.aX, 0.1F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.iA, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.nl, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.ny, 0.08F), efe.b, czh.bs.o()),
                  new efv(new efx(czh.cB, 0.2F), efe.b, czh.kD.o()),
                  new efv(new efx(czh.cB, 0.1F), efe.b, czh.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.m, 0.1F), efe.b, czh.cn.o())))));
      a($$0, g, ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.m, 0.2F), efe.b, czh.cn.o())))));
      a($$0, h, ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.m, 0.7F), efe.b, czh.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efj(czh.kE), new efj(czh.G), czh.n.o()),
                  new efv(new efx(czh.kE, 0.1F), efe.b, czh.i.o()),
                  new efv(new efj(czh.i), new efj(czh.G), czh.G.o()),
                  new efv(new efj(czh.j), new efj(czh.G), czh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efj(czh.kE), new efj(czh.G), czh.r.o()),
                  new efv(new efx(czh.kE, 0.2F), efe.b, czh.i.o()),
                  new efv(new efj(czh.i), new efj(czh.G), czh.G.o()),
                  new efv(new efj(czh.j), new efj(czh.G), czh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efj(czh.kE), new efj(czh.G), czh.o.o()),
                  new efv(new efj(czh.kE), new efj(czh.dO), czh.o.o()),
                  new efv(new efx(czh.kE, 0.2F), efe.b, czh.i.o()),
                  new efv(new efj(czh.i), new efj(czh.G), czh.G.o()),
                  new efv(new efj(czh.j), new efj(czh.G), czh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.cB, 0.3F), efe.b, czh.gt.o()),
                  new efv(new efx(czh.cB, 0.2F), efe.b, czh.gu.o()),
                  new efv(new efx(czh.cB, 0.1F), efe.b, czh.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.cB, 0.1F), efe.b, czh.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.cB, 0.1F), efe.b, czh.gt.o()), new efv(new efx(czh.cB, 0.8F), efe.b, czh.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.cB, 0.3F), efe.b, czh.fd.o()), new efv(new efx(czh.cB, 0.2F), efe.b, czh.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.cB, 0.2F), efe.b, czh.kD.o()), new efv(new efx(czh.cB, 0.1F), efe.b, czh.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new efk(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new efz(ImmutableList.of(new efv(new efx(czh.kJ, 0.75F), efe.b, czh.px.o()), new efv(new efx(czh.px, 0.15F), efe.b, czh.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new efz(ImmutableList.of(new efv(new efx(czh.pw, 0.35F), efe.b, czh.px.o()), new efv(new efx(czh.py, 0.1F), efe.b, czh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new efz(ImmutableList.of(new efv(new efx(czh.pw, 0.3F), efe.b, czh.px.o()), new efv(new efx(czh.pr, 1.0E-4F), efe.b, czh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new efz(ImmutableList.of(new efv(new efx(czh.py, 0.5F), efe.b, czh.a.o()), new efv(new efx(czh.ch, 0.1F), efe.b, czh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new efz(ImmutableList.of(new efv(new efx(czh.pw, 0.1F), efe.b, czh.px.o()), new efv(new efx(czh.pr, 1.0E-4F), efe.b, czh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.pw, 0.3F), efe.b, czh.px.o()),
                  new efv(new efx(czh.pr, 1.0E-4F), efe.b, czh.a.o()),
                  new efv(new efx(czh.ch, 0.3F), efe.b, czh.px.o()),
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
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.pw, 0.4F), efe.b, czh.px.o()),
                  new efv(new efx(czh.pr, 0.01F), efe.b, czh.px.o()),
                  new efv(new efx(czh.pw, 1.0E-4F), efe.b, czh.a.o()),
                  new efv(new efx(czh.pr, 1.0E-4F), efe.b, czh.a.o()),
                  new efv(new efx(czh.ch, 0.3F), efe.b, czh.px.o()),
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
            new efz(ImmutableList.of(new efv(new efx(czh.py, 0.5F), efe.b, czh.a.o()), new efv(new efx(czh.ch, 0.6F), efe.b, czh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new efz(ImmutableList.of(new efv(new efx(czh.pw, 0.3F), efe.b, czh.px.o()), new efv(new efx(czh.pr, 1.0E-4F), efe.b, czh.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.pw, 0.3F), efe.b, czh.px.o()),
                  new efv(new efx(czh.pw, 0.15F), efe.b, czh.a.o()),
                  new efv(new efx(czh.pw, 0.3F), efe.b, czh.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.pw, 0.01F), efe.b, czh.a.o()),
                  new efv(new efx(czh.pw, 0.5F), efe.b, czh.px.o()),
                  new efv(new efx(czh.pw, 0.3F), efe.b, czh.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new efz(
               ImmutableList.of(new efv(new efx(czh.ch, 0.3F), efe.b, czh.px.o()), new efv(efe.b, efe.b, new eff(0.0F, 0.05F, 0, 100, ih.a.b), czh.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new efk(0.9F), new efw(aue.bH)));
      a($$0, E, ImmutableList.of(new efk(0.1F), new efw(aue.bH)));
      a($$0, F, ImmutableList.of(new efk(0.1F), new efz(ImmutableList.of(new efv(new efj(czh.R), efe.b, czh.cy.o()))), new efw(aue.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.sW, 0.3F), efe.b, czh.tb.o()),
                  new efv(new efx(czh.sS, 0.3F), efe.b, czh.tc.o()),
                  new efv(new efx(czh.of, 0.05F), efe.b, czh.a.o())
               )
            ),
            new efw(aue.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new efk($$1.b(aue.bN), 0.95F),
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.sW, 0.3F), efe.b, czh.tb.o()),
                  new efv(new efx(czh.sS, 0.3F), efe.b, czh.tc.o()),
                  new efv(new efx(czh.of, 0.05F), efe.b, czh.a.o())
               )
            ),
            new efw(aue.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new efk($$1.b(aue.bN), 0.95F),
            new efz(
               ImmutableList.of(
                  new efv(new efx(czh.sW, 0.3F), efe.b, czh.tb.o()),
                  new efv(new efx(czh.sS, 0.3F), efe.b, czh.tc.o()),
                  new efv(new efx(czh.sU, 0.3F), efe.b, czh.a.o()),
                  new efv(new efx(czh.of, 0.05F), efe.b, czh.a.o())
               )
            ),
            new efw(aue.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new efz(
               List.of(
                  new efv(new efx(czh.L, 0.2F), efe.b, czh.j.o()),
                  new efv(new efx(czh.L, 0.1F), efe.b, czh.k.o()),
                  new efv(new efx(czh.eM, 0.1F), efe.b, czh.eL.o())
               )
            ),
            a(ejw.aQ, 6),
            a(ejw.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new efz(
               List.of(
                  new efv(new efx(czh.L, 0.2F), efe.b, czh.j.o()),
                  new efv(new efx(czh.L, 0.1F), efe.b, czh.k.o()),
                  new efv(new efx(czh.eM, 0.1F), efe.b, czh.eL.o())
               )
            ),
            a(ejw.aQ, 2)
         )
      );
      a($$0, L, List.of(a(ejw.aQ, 2)));
   }

   private static efm a(ajc $$0, int $$1) {
      return new efm(new efz(List.of(new efv(new egi(aue.cm), efe.b, efs.b, czh.M.o(), new egk($$0)))), bln.a($$1));
   }
}
