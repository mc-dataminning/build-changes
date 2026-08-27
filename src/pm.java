import com.google.common.collect.ImmutableList;
import java.util.List;

public class pm {
   private static final ahf<edd> M = a("empty");
   public static final ahf<edd> a = a("zombie_plains");
   public static final ahf<edd> b = a("zombie_savanna");
   public static final ahf<edd> c = a("zombie_snowy");
   public static final ahf<edd> d = a("zombie_taiga");
   public static final ahf<edd> e = a("zombie_desert");
   public static final ahf<edd> f = a("mossify_10_percent");
   public static final ahf<edd> g = a("mossify_20_percent");
   public static final ahf<edd> h = a("mossify_70_percent");
   public static final ahf<edd> i = a("street_plains");
   public static final ahf<edd> j = a("street_savanna");
   public static final ahf<edd> k = a("street_snowy_or_taiga");
   public static final ahf<edd> l = a("farm_plains");
   public static final ahf<edd> m = a("farm_savanna");
   public static final ahf<edd> n = a("farm_snowy");
   public static final ahf<edd> o = a("farm_taiga");
   public static final ahf<edd> p = a("farm_desert");
   public static final ahf<edd> q = a("outpost_rot");
   public static final ahf<edd> r = a("bottom_rampart");
   public static final ahf<edd> s = a("treasure_rooms");
   public static final ahf<edd> t = a("housing");
   public static final ahf<edd> u = a("side_wall_degradation");
   public static final ahf<edd> v = a("stable_degradation");
   public static final ahf<edd> w = a("bastion_generic_degradation");
   public static final ahf<edd> x = a("rampart_degradation");
   public static final ahf<edd> y = a("entrance_replacement");
   public static final ahf<edd> z = a("bridge");
   public static final ahf<edd> A = a("roof");
   public static final ahf<edd> B = a("high_wall");
   public static final ahf<edd> C = a("high_rampart");
   public static final ahf<edd> D = a("fossil_rot");
   public static final ahf<edd> E = a("fossil_coal");
   public static final ahf<edd> F = a("fossil_diamonds");
   public static final ahf<edd> G = a("ancient_city_start_degradation");
   public static final ahf<edd> H = a("ancient_city_generic_degradation");
   public static final ahf<edd> I = a("ancient_city_walls_degradation");
   public static final ahf<edd> J = a("trail_ruins_houses_archaeology");
   public static final ahf<edd> K = a("trail_ruins_roads_archaeology");
   public static final ahf<edd> L = a("trail_ruins_tower_top_archaeology");

   private static ahf<edd> a(String $$0) {
      return ahf.a(ke.aE, new ahg($$0));
   }

   private static void a(pe<edd> $$0, ahf<edd> $$1, List<edc> $$2) {
      $$0.a($$1, new edd($$2));
   }

   public static void a(pe<edd> $$0) {
      ii<cwp> $$1 = $$0.a(ke.f);
      ecu $$2 = new ecu(new ecw(cwr.pr, 0.01F), ecd.b, cwr.pC.o());
      ecu $$3 = new ecu(new ecw(cwr.pC, 0.5F), ecd.b, cwr.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.m, 0.8F), ecd.b, cwr.cn.o()),
                  new ecu(new edh(asg.p), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cp), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cq), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.m, 0.07F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.cn, 0.07F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.hj, 0.07F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.U, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.n, 0.1F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.cu, 0.1F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.al, 0.02F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.eY, 0.5F), ecd.b, cwr.bs.o()),
                  new ecu[]{
                     new ecu(
                        new eck(cwr.eY.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))),
                        ecd.b,
                        cwr.hL.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))
                     ),
                     new ecu(
                        new eck(cwr.eY.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))),
                        ecd.b,
                        cwr.hL.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))
                     ),
                     new ecu(new ecw(cwr.cB, 0.3F), ecd.b, cwr.gt.o()),
                     new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.gu.o()),
                     new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new edh(asg.p), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cp), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cq), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.r, 0.2F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.hP, 0.2F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.Y, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.as, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.hk, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.hn, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.hx, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.eY, 0.5F), ecd.b, cwr.bs.o()),
                  new ecu(
                     new eck(cwr.eY.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))),
                     ecd.b,
                     cwr.hL.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))
                  ),
                  new ecu[]{
                     new ecu(
                        new eck(cwr.eY.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))),
                        ecd.b,
                        cwr.hL.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))
                     ),
                     new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new edh(asg.p), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cp), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cq), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.oe), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.o, 0.2F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.ju, 0.4F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.af, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.ax, 0.05F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.eY, 0.5F), ecd.b, cwr.bs.o()),
                  new ecu(
                     new eck(cwr.eY.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))),
                     ecd.b,
                     cwr.hL.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))
                  ),
                  new ecu(
                     new eck(cwr.eY.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))),
                     ecd.b,
                     cwr.hL.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))
                  ),
                  new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.gt.o()),
                  new ecu[]{new ecu(new ecw(cwr.cB, 0.8F), ecd.b, cwr.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.m, 0.8F), ecd.b, cwr.cn.o()),
                  new ecu(new edh(asg.p), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cp), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cq), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.og), ecd.b, cwr.og.o().a(cxd.c, Boolean.valueOf(false))),
                  new ecu(new ecw(cwr.m, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.V, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.eY, 0.5F), ecd.b, cwr.bs.o()),
                  new ecu(
                     new eck(cwr.eY.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))),
                     ecd.b,
                     cwr.hL.o().a(dap.a, Boolean.valueOf(true)).a(dap.c, Boolean.valueOf(true))
                  ),
                  new ecu(
                     new eck(cwr.eY.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))),
                     ecd.b,
                     cwr.hL.o().a(dap.b, Boolean.valueOf(true)).a(dap.d, Boolean.valueOf(true))
                  ),
                  new ecu(new ecw(cwr.cB, 0.3F), ecd.b, cwr.fd.o()),
                  new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.gu.o()),
                  new ecu[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new edh(asg.p), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cp), ecd.b, cwr.a.o()),
                  new ecu(new eci(cwr.cq), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.jS, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.aX, 0.1F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.iA, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.nl, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.ny, 0.08F), ecd.b, cwr.bs.o()),
                  new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.kD.o()),
                  new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.m, 0.1F), ecd.b, cwr.cn.o())))));
      a($$0, g, ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.m, 0.2F), ecd.b, cwr.cn.o())))));
      a($$0, h, ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.m, 0.7F), ecd.b, cwr.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new eci(cwr.kE), new eci(cwr.G), cwr.n.o()),
                  new ecu(new ecw(cwr.kE, 0.1F), ecd.b, cwr.i.o()),
                  new ecu(new eci(cwr.i), new eci(cwr.G), cwr.G.o()),
                  new ecu(new eci(cwr.j), new eci(cwr.G), cwr.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new eci(cwr.kE), new eci(cwr.G), cwr.r.o()),
                  new ecu(new ecw(cwr.kE, 0.2F), ecd.b, cwr.i.o()),
                  new ecu(new eci(cwr.i), new eci(cwr.G), cwr.G.o()),
                  new ecu(new eci(cwr.j), new eci(cwr.G), cwr.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new eci(cwr.kE), new eci(cwr.G), cwr.o.o()),
                  new ecu(new eci(cwr.kE), new eci(cwr.dO), cwr.o.o()),
                  new ecu(new ecw(cwr.kE, 0.2F), ecd.b, cwr.i.o()),
                  new ecu(new eci(cwr.i), new eci(cwr.G), cwr.G.o()),
                  new ecu(new eci(cwr.j), new eci(cwr.G), cwr.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.cB, 0.3F), ecd.b, cwr.gt.o()),
                  new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.gu.o()),
                  new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.gt.o()), new ecu(new ecw(cwr.cB, 0.8F), ecd.b, cwr.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.cB, 0.3F), ecd.b, cwr.fd.o()), new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.cB, 0.2F), ecd.b, cwr.kD.o()), new ecu(new ecw(cwr.cB, 0.1F), ecd.b, cwr.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ecj(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.kJ, 0.75F), ecd.b, cwr.px.o()), new ecu(new ecw(cwr.px, 0.15F), ecd.b, cwr.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.pw, 0.35F), ecd.b, cwr.px.o()), new ecu(new ecw(cwr.py, 0.1F), ecd.b, cwr.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.px.o()), new ecu(new ecw(cwr.pr, 1.0E-4F), ecd.b, cwr.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.py, 0.5F), ecd.b, cwr.a.o()), new ecu(new ecw(cwr.ch, 0.1F), ecd.b, cwr.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.pw, 0.1F), ecd.b, cwr.px.o()), new ecu(new ecw(cwr.pr, 1.0E-4F), ecd.b, cwr.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.px.o()),
                  new ecu(new ecw(cwr.pr, 1.0E-4F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.ch, 0.3F), ecd.b, cwr.px.o()),
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
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.pw, 0.4F), ecd.b, cwr.px.o()),
                  new ecu(new ecw(cwr.pr, 0.01F), ecd.b, cwr.px.o()),
                  new ecu(new ecw(cwr.pw, 1.0E-4F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.pr, 1.0E-4F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.ch, 0.3F), ecd.b, cwr.px.o()),
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
            new ecy(ImmutableList.of(new ecu(new ecw(cwr.py, 0.5F), ecd.b, cwr.a.o()), new ecu(new ecw(cwr.ch, 0.6F), ecd.b, cwr.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ecy(ImmutableList.of(new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.px.o()), new ecu(new ecw(cwr.pr, 1.0E-4F), ecd.b, cwr.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.px.o()),
                  new ecu(new ecw(cwr.pw, 0.15F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.pw, 0.01F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.pw, 0.5F), ecd.b, cwr.px.o()),
                  new ecu(new ecw(cwr.pw, 0.3F), ecd.b, cwr.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(new ecu(new ecw(cwr.ch, 0.3F), ecd.b, cwr.px.o()), new ecu(ecd.b, ecd.b, new ece(0.0F, 0.05F, 0, 100, ic.a.b), cwr.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ecj(0.9F), new ecv(asg.bH)));
      a($$0, E, ImmutableList.of(new ecj(0.1F), new ecv(asg.bH)));
      a($$0, F, ImmutableList.of(new ecj(0.1F), new ecy(ImmutableList.of(new ecu(new eci(cwr.R), ecd.b, cwr.cy.o()))), new ecv(asg.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.sW, 0.3F), ecd.b, cwr.tb.o()),
                  new ecu(new ecw(cwr.sS, 0.3F), ecd.b, cwr.tc.o()),
                  new ecu(new ecw(cwr.of, 0.05F), ecd.b, cwr.a.o())
               )
            ),
            new ecv(asg.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ecj($$1.b(asg.bN), 0.95F),
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.sW, 0.3F), ecd.b, cwr.tb.o()),
                  new ecu(new ecw(cwr.sS, 0.3F), ecd.b, cwr.tc.o()),
                  new ecu(new ecw(cwr.of, 0.05F), ecd.b, cwr.a.o())
               )
            ),
            new ecv(asg.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ecj($$1.b(asg.bN), 0.95F),
            new ecy(
               ImmutableList.of(
                  new ecu(new ecw(cwr.sW, 0.3F), ecd.b, cwr.tb.o()),
                  new ecu(new ecw(cwr.sS, 0.3F), ecd.b, cwr.tc.o()),
                  new ecu(new ecw(cwr.sU, 0.3F), ecd.b, cwr.a.o()),
                  new ecu(new ecw(cwr.of, 0.05F), ecd.b, cwr.a.o())
               )
            ),
            new ecv(asg.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ecy(
               List.of(
                  new ecu(new ecw(cwr.L, 0.2F), ecd.b, cwr.j.o()),
                  new ecu(new ecw(cwr.L, 0.1F), ecd.b, cwr.k.o()),
                  new ecu(new ecw(cwr.eM, 0.1F), ecd.b, cwr.eL.o())
               )
            ),
            a(egt.aQ, 6),
            a(egt.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ecy(
               List.of(
                  new ecu(new ecw(cwr.L, 0.2F), ecd.b, cwr.j.o()),
                  new ecu(new ecw(cwr.L, 0.1F), ecd.b, cwr.k.o()),
                  new ecu(new ecw(cwr.eM, 0.1F), ecd.b, cwr.eL.o())
               )
            ),
            a(egt.aQ, 2)
         )
      );
      a($$0, L, List.of(a(egt.aQ, 2)));
   }

   private static ecl a(ahg $$0, int $$1) {
      return new ecl(new ecy(List.of(new ecu(new edh(asg.cl), ecd.b, ecr.b, cwr.M.o(), new edj($$0)))), bjc.a($$1));
   }
}
