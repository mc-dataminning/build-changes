import com.google.common.collect.ImmutableList;
import java.util.List;

public class nz {
   private static final aey<dyt> M = a("empty");
   public static final aey<dyt> a = a("zombie_plains");
   public static final aey<dyt> b = a("zombie_savanna");
   public static final aey<dyt> c = a("zombie_snowy");
   public static final aey<dyt> d = a("zombie_taiga");
   public static final aey<dyt> e = a("zombie_desert");
   public static final aey<dyt> f = a("mossify_10_percent");
   public static final aey<dyt> g = a("mossify_20_percent");
   public static final aey<dyt> h = a("mossify_70_percent");
   public static final aey<dyt> i = a("street_plains");
   public static final aey<dyt> j = a("street_savanna");
   public static final aey<dyt> k = a("street_snowy_or_taiga");
   public static final aey<dyt> l = a("farm_plains");
   public static final aey<dyt> m = a("farm_savanna");
   public static final aey<dyt> n = a("farm_snowy");
   public static final aey<dyt> o = a("farm_taiga");
   public static final aey<dyt> p = a("farm_desert");
   public static final aey<dyt> q = a("outpost_rot");
   public static final aey<dyt> r = a("bottom_rampart");
   public static final aey<dyt> s = a("treasure_rooms");
   public static final aey<dyt> t = a("housing");
   public static final aey<dyt> u = a("side_wall_degradation");
   public static final aey<dyt> v = a("stable_degradation");
   public static final aey<dyt> w = a("bastion_generic_degradation");
   public static final aey<dyt> x = a("rampart_degradation");
   public static final aey<dyt> y = a("entrance_replacement");
   public static final aey<dyt> z = a("bridge");
   public static final aey<dyt> A = a("roof");
   public static final aey<dyt> B = a("high_wall");
   public static final aey<dyt> C = a("high_rampart");
   public static final aey<dyt> D = a("fossil_rot");
   public static final aey<dyt> E = a("fossil_coal");
   public static final aey<dyt> F = a("fossil_diamonds");
   public static final aey<dyt> G = a("ancient_city_start_degradation");
   public static final aey<dyt> H = a("ancient_city_generic_degradation");
   public static final aey<dyt> I = a("ancient_city_walls_degradation");
   public static final aey<dyt> J = a("trail_ruins_houses_archaeology");
   public static final aey<dyt> K = a("trail_ruins_roads_archaeology");
   public static final aey<dyt> L = a("trail_ruins_tower_top_archaeology");

   private static aey<dyt> a(String $$0) {
      return aey.a(jc.aB, new aez($$0));
   }

   private static void a(nr<dyt> $$0, aey<dyt> $$1, List<dys> $$2) {
      $$0.a($$1, new dyt($$2));
   }

   public static void a(nr<dyt> $$0) {
      hf<ctc> $$1 = $$0.a(jc.e);
      dyk $$2 = new dyk(new dym(cte.pr, 0.01F), dxt.b, cte.pC.o());
      dyk $$3 = new dyk(new dym(cte.pC, 0.5F), dxt.b, cte.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.m, 0.8F), dxt.b, cte.cn.o()),
                  new dyk(new dyx(apv.p), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cp), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cq), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.m, 0.07F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.cn, 0.07F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.hj, 0.07F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.U, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.n, 0.1F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.cu, 0.1F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.al, 0.02F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.eY, 0.5F), dxt.b, cte.bs.o()),
                  new dyk[]{
                     new dyk(
                        new dya(cte.eY.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))),
                        dxt.b,
                        cte.hL.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))
                     ),
                     new dyk(
                        new dya(cte.eY.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))),
                        dxt.b,
                        cte.hL.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))
                     ),
                     new dyk(new dym(cte.cB, 0.3F), dxt.b, cte.gt.o()),
                     new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.gu.o()),
                     new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dyx(apv.p), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cp), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cq), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.r, 0.2F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.hP, 0.2F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.Y, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.as, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.hk, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.hn, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.hx, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.eY, 0.5F), dxt.b, cte.bs.o()),
                  new dyk(
                     new dya(cte.eY.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))),
                     dxt.b,
                     cte.hL.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))
                  ),
                  new dyk[]{
                     new dyk(
                        new dya(cte.eY.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))),
                        dxt.b,
                        cte.hL.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))
                     ),
                     new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dyx(apv.p), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cp), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cq), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.oe), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.o, 0.2F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.ju, 0.4F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.af, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.ax, 0.05F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.eY, 0.5F), dxt.b, cte.bs.o()),
                  new dyk(
                     new dya(cte.eY.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))),
                     dxt.b,
                     cte.hL.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))
                  ),
                  new dyk(
                     new dya(cte.eY.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))),
                     dxt.b,
                     cte.hL.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))
                  ),
                  new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.gt.o()),
                  new dyk[]{new dyk(new dym(cte.cB, 0.8F), dxt.b, cte.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.m, 0.8F), dxt.b, cte.cn.o()),
                  new dyk(new dyx(apv.p), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cp), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cq), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.og), dxt.b, cte.og.o().a(ctq.c, Boolean.valueOf(false))),
                  new dyk(new dym(cte.m, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.V, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.eY, 0.5F), dxt.b, cte.bs.o()),
                  new dyk(
                     new dya(cte.eY.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))),
                     dxt.b,
                     cte.hL.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true))
                  ),
                  new dyk(
                     new dya(cte.eY.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))),
                     dxt.b,
                     cte.hL.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true))
                  ),
                  new dyk(new dym(cte.cB, 0.3F), dxt.b, cte.fd.o()),
                  new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.gu.o()),
                  new dyk[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dyx(apv.p), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cp), dxt.b, cte.a.o()),
                  new dyk(new dxy(cte.cq), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.jS, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.aX, 0.1F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.iA, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.nl, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.ny, 0.08F), dxt.b, cte.bs.o()),
                  new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.kD.o()),
                  new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.m, 0.1F), dxt.b, cte.cn.o())))));
      a($$0, g, ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.m, 0.2F), dxt.b, cte.cn.o())))));
      a($$0, h, ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.m, 0.7F), dxt.b, cte.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dxy(cte.kE), new dxy(cte.G), cte.n.o()),
                  new dyk(new dym(cte.kE, 0.1F), dxt.b, cte.i.o()),
                  new dyk(new dxy(cte.i), new dxy(cte.G), cte.G.o()),
                  new dyk(new dxy(cte.j), new dxy(cte.G), cte.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dxy(cte.kE), new dxy(cte.G), cte.r.o()),
                  new dyk(new dym(cte.kE, 0.2F), dxt.b, cte.i.o()),
                  new dyk(new dxy(cte.i), new dxy(cte.G), cte.G.o()),
                  new dyk(new dxy(cte.j), new dxy(cte.G), cte.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dxy(cte.kE), new dxy(cte.G), cte.o.o()),
                  new dyk(new dxy(cte.kE), new dxy(cte.dO), cte.o.o()),
                  new dyk(new dym(cte.kE, 0.2F), dxt.b, cte.i.o()),
                  new dyk(new dxy(cte.i), new dxy(cte.G), cte.G.o()),
                  new dyk(new dxy(cte.j), new dxy(cte.G), cte.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.cB, 0.3F), dxt.b, cte.gt.o()),
                  new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.gu.o()),
                  new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.gt.o()), new dyk(new dym(cte.cB, 0.8F), dxt.b, cte.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.cB, 0.3F), dxt.b, cte.fd.o()), new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.cB, 0.2F), dxt.b, cte.kD.o()), new dyk(new dym(cte.cB, 0.1F), dxt.b, cte.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new dxz(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyo(ImmutableList.of(new dyk(new dym(cte.kJ, 0.75F), dxt.b, cte.px.o()), new dyk(new dym(cte.px, 0.15F), dxt.b, cte.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyo(ImmutableList.of(new dyk(new dym(cte.pw, 0.35F), dxt.b, cte.px.o()), new dyk(new dym(cte.py, 0.1F), dxt.b, cte.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyo(ImmutableList.of(new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.px.o()), new dyk(new dym(cte.pr, 1.0E-4F), dxt.b, cte.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyo(ImmutableList.of(new dyk(new dym(cte.py, 0.5F), dxt.b, cte.a.o()), new dyk(new dym(cte.ch, 0.1F), dxt.b, cte.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyo(ImmutableList.of(new dyk(new dym(cte.pw, 0.1F), dxt.b, cte.px.o()), new dyk(new dym(cte.pr, 1.0E-4F), dxt.b, cte.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.px.o()),
                  new dyk(new dym(cte.pr, 1.0E-4F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.ch, 0.3F), dxt.b, cte.px.o()),
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
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.pw, 0.4F), dxt.b, cte.px.o()),
                  new dyk(new dym(cte.pr, 0.01F), dxt.b, cte.px.o()),
                  new dyk(new dym(cte.pw, 1.0E-4F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.pr, 1.0E-4F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.ch, 0.3F), dxt.b, cte.px.o()),
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
            new dyo(ImmutableList.of(new dyk(new dym(cte.py, 0.5F), dxt.b, cte.a.o()), new dyk(new dym(cte.ch, 0.6F), dxt.b, cte.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyo(ImmutableList.of(new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.px.o()), new dyk(new dym(cte.pr, 1.0E-4F), dxt.b, cte.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.px.o()),
                  new dyk(new dym(cte.pw, 0.15F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.pw, 0.01F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.pw, 0.5F), dxt.b, cte.px.o()),
                  new dyk(new dym(cte.pw, 0.3F), dxt.b, cte.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(new dyk(new dym(cte.ch, 0.3F), dxt.b, cte.px.o()), new dyk(dxt.b, dxt.b, new dxu(0.0F, 0.05F, 0, 100, ha.a.b), cte.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dxz(0.9F), new dyl(apv.bH)));
      a($$0, E, ImmutableList.of(new dxz(0.1F), new dyl(apv.bH)));
      a($$0, F, ImmutableList.of(new dxz(0.1F), new dyo(ImmutableList.of(new dyk(new dxy(cte.R), dxt.b, cte.cy.o()))), new dyl(apv.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.rV, 0.3F), dxt.b, cte.sa.o()),
                  new dyk(new dym(cte.rR, 0.3F), dxt.b, cte.sb.o()),
                  new dyk(new dym(cte.of, 0.05F), dxt.b, cte.a.o())
               )
            ),
            new dyl(apv.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dxz($$1.b(apv.bN), 0.95F),
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.rV, 0.3F), dxt.b, cte.sa.o()),
                  new dyk(new dym(cte.rR, 0.3F), dxt.b, cte.sb.o()),
                  new dyk(new dym(cte.of, 0.05F), dxt.b, cte.a.o())
               )
            ),
            new dyl(apv.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dxz($$1.b(apv.bN), 0.95F),
            new dyo(
               ImmutableList.of(
                  new dyk(new dym(cte.rV, 0.3F), dxt.b, cte.sa.o()),
                  new dyk(new dym(cte.rR, 0.3F), dxt.b, cte.sb.o()),
                  new dyk(new dym(cte.rT, 0.3F), dxt.b, cte.a.o()),
                  new dyk(new dym(cte.of, 0.05F), dxt.b, cte.a.o())
               )
            ),
            new dyl(apv.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyo(
               List.of(
                  new dyk(new dym(cte.L, 0.2F), dxt.b, cte.j.o()),
                  new dyk(new dym(cte.L, 0.1F), dxt.b, cte.k.o()),
                  new dyk(new dym(cte.eM, 0.1F), dxt.b, cte.eL.o())
               )
            ),
            a(eci.aE, 6),
            a(eci.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyo(
               List.of(
                  new dyk(new dym(cte.L, 0.2F), dxt.b, cte.j.o()),
                  new dyk(new dym(cte.L, 0.1F), dxt.b, cte.k.o()),
                  new dyk(new dym(cte.eM, 0.1F), dxt.b, cte.eL.o())
               )
            ),
            a(eci.aE, 2)
         )
      );
      a($$0, L, List.of(a(eci.aE, 2)));
   }

   private static dyb a(aez $$0, int $$1) {
      return new dyb(new dyo(List.of(new dyk(new dyx(apv.cl), dxt.b, dyh.b, cte.M.o(), new dyz($$0)))), bgg.a($$1));
   }
}
