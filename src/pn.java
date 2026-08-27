import com.google.common.collect.ImmutableList;
import java.util.List;

public class pn {
   private static final ahg<edm> M = a("empty");
   public static final ahg<edm> a = a("zombie_plains");
   public static final ahg<edm> b = a("zombie_savanna");
   public static final ahg<edm> c = a("zombie_snowy");
   public static final ahg<edm> d = a("zombie_taiga");
   public static final ahg<edm> e = a("zombie_desert");
   public static final ahg<edm> f = a("mossify_10_percent");
   public static final ahg<edm> g = a("mossify_20_percent");
   public static final ahg<edm> h = a("mossify_70_percent");
   public static final ahg<edm> i = a("street_plains");
   public static final ahg<edm> j = a("street_savanna");
   public static final ahg<edm> k = a("street_snowy_or_taiga");
   public static final ahg<edm> l = a("farm_plains");
   public static final ahg<edm> m = a("farm_savanna");
   public static final ahg<edm> n = a("farm_snowy");
   public static final ahg<edm> o = a("farm_taiga");
   public static final ahg<edm> p = a("farm_desert");
   public static final ahg<edm> q = a("outpost_rot");
   public static final ahg<edm> r = a("bottom_rampart");
   public static final ahg<edm> s = a("treasure_rooms");
   public static final ahg<edm> t = a("housing");
   public static final ahg<edm> u = a("side_wall_degradation");
   public static final ahg<edm> v = a("stable_degradation");
   public static final ahg<edm> w = a("bastion_generic_degradation");
   public static final ahg<edm> x = a("rampart_degradation");
   public static final ahg<edm> y = a("entrance_replacement");
   public static final ahg<edm> z = a("bridge");
   public static final ahg<edm> A = a("roof");
   public static final ahg<edm> B = a("high_wall");
   public static final ahg<edm> C = a("high_rampart");
   public static final ahg<edm> D = a("fossil_rot");
   public static final ahg<edm> E = a("fossil_coal");
   public static final ahg<edm> F = a("fossil_diamonds");
   public static final ahg<edm> G = a("ancient_city_start_degradation");
   public static final ahg<edm> H = a("ancient_city_generic_degradation");
   public static final ahg<edm> I = a("ancient_city_walls_degradation");
   public static final ahg<edm> J = a("trail_ruins_houses_archaeology");
   public static final ahg<edm> K = a("trail_ruins_roads_archaeology");
   public static final ahg<edm> L = a("trail_ruins_tower_top_archaeology");

   private static ahg<edm> a(String $$0) {
      return ahg.a(ke.aE, new ahh($$0));
   }

   private static void a(pf<edm> $$0, ahg<edm> $$1, List<edl> $$2) {
      $$0.a($$1, new edm($$2));
   }

   public static void a(pf<edm> $$0) {
      ii<cwy> $$1 = $$0.a(ke.f);
      edd $$2 = new edd(new edf(cxa.pr, 0.01F), ecm.b, cxa.pC.o());
      edd $$3 = new edd(new edf(cxa.pC, 0.5F), ecm.b, cxa.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.m, 0.8F), ecm.b, cxa.cn.o()),
                  new edd(new edq(asi.p), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cp), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cq), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.m, 0.07F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.cn, 0.07F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.hj, 0.07F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.U, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.n, 0.1F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.cu, 0.1F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.al, 0.02F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.eY, 0.5F), ecm.b, cxa.bs.o()),
                  new edd[]{
                     new edd(
                        new ect(cxa.eY.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))),
                        ecm.b,
                        cxa.hL.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))
                     ),
                     new edd(
                        new ect(cxa.eY.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))),
                        ecm.b,
                        cxa.hL.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))
                     ),
                     new edd(new edf(cxa.cB, 0.3F), ecm.b, cxa.gt.o()),
                     new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.gu.o()),
                     new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edq(asi.p), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cp), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cq), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.r, 0.2F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.hP, 0.2F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.Y, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.as, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.hk, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.hn, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.hx, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.eY, 0.5F), ecm.b, cxa.bs.o()),
                  new edd(
                     new ect(cxa.eY.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))),
                     ecm.b,
                     cxa.hL.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))
                  ),
                  new edd[]{
                     new edd(
                        new ect(cxa.eY.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))),
                        ecm.b,
                        cxa.hL.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))
                     ),
                     new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edq(asi.p), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cp), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cq), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.oe), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.o, 0.2F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.ju, 0.4F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.af, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.ax, 0.05F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.eY, 0.5F), ecm.b, cxa.bs.o()),
                  new edd(
                     new ect(cxa.eY.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))),
                     ecm.b,
                     cxa.hL.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))
                  ),
                  new edd(
                     new ect(cxa.eY.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))),
                     ecm.b,
                     cxa.hL.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))
                  ),
                  new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.gt.o()),
                  new edd[]{new edd(new edf(cxa.cB, 0.8F), ecm.b, cxa.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.m, 0.8F), ecm.b, cxa.cn.o()),
                  new edd(new edq(asi.p), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cp), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cq), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.og), ecm.b, cxa.og.o().a(cxm.c, Boolean.valueOf(false))),
                  new edd(new edf(cxa.m, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.V, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.eY, 0.5F), ecm.b, cxa.bs.o()),
                  new edd(
                     new ect(cxa.eY.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))),
                     ecm.b,
                     cxa.hL.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true))
                  ),
                  new edd(
                     new ect(cxa.eY.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))),
                     ecm.b,
                     cxa.hL.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true))
                  ),
                  new edd(new edf(cxa.cB, 0.3F), ecm.b, cxa.fd.o()),
                  new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.gu.o()),
                  new edd[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edq(asi.p), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cp), ecm.b, cxa.a.o()),
                  new edd(new ecr(cxa.cq), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.jS, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.aX, 0.1F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.iA, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.nl, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.ny, 0.08F), ecm.b, cxa.bs.o()),
                  new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.kD.o()),
                  new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.m, 0.1F), ecm.b, cxa.cn.o())))));
      a($$0, g, ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.m, 0.2F), ecm.b, cxa.cn.o())))));
      a($$0, h, ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.m, 0.7F), ecm.b, cxa.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new ecr(cxa.kE), new ecr(cxa.G), cxa.n.o()),
                  new edd(new edf(cxa.kE, 0.1F), ecm.b, cxa.i.o()),
                  new edd(new ecr(cxa.i), new ecr(cxa.G), cxa.G.o()),
                  new edd(new ecr(cxa.j), new ecr(cxa.G), cxa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new ecr(cxa.kE), new ecr(cxa.G), cxa.r.o()),
                  new edd(new edf(cxa.kE, 0.2F), ecm.b, cxa.i.o()),
                  new edd(new ecr(cxa.i), new ecr(cxa.G), cxa.G.o()),
                  new edd(new ecr(cxa.j), new ecr(cxa.G), cxa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new ecr(cxa.kE), new ecr(cxa.G), cxa.o.o()),
                  new edd(new ecr(cxa.kE), new ecr(cxa.dO), cxa.o.o()),
                  new edd(new edf(cxa.kE, 0.2F), ecm.b, cxa.i.o()),
                  new edd(new ecr(cxa.i), new ecr(cxa.G), cxa.G.o()),
                  new edd(new ecr(cxa.j), new ecr(cxa.G), cxa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.cB, 0.3F), ecm.b, cxa.gt.o()),
                  new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.gu.o()),
                  new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.gt.o()), new edd(new edf(cxa.cB, 0.8F), ecm.b, cxa.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.cB, 0.3F), ecm.b, cxa.fd.o()), new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.cB, 0.2F), ecm.b, cxa.kD.o()), new edd(new edf(cxa.cB, 0.1F), ecm.b, cxa.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ecs(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new edh(ImmutableList.of(new edd(new edf(cxa.kJ, 0.75F), ecm.b, cxa.px.o()), new edd(new edf(cxa.px, 0.15F), ecm.b, cxa.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new edh(ImmutableList.of(new edd(new edf(cxa.pw, 0.35F), ecm.b, cxa.px.o()), new edd(new edf(cxa.py, 0.1F), ecm.b, cxa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new edh(ImmutableList.of(new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.px.o()), new edd(new edf(cxa.pr, 1.0E-4F), ecm.b, cxa.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new edh(ImmutableList.of(new edd(new edf(cxa.py, 0.5F), ecm.b, cxa.a.o()), new edd(new edf(cxa.ch, 0.1F), ecm.b, cxa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new edh(ImmutableList.of(new edd(new edf(cxa.pw, 0.1F), ecm.b, cxa.px.o()), new edd(new edf(cxa.pr, 1.0E-4F), ecm.b, cxa.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.px.o()),
                  new edd(new edf(cxa.pr, 1.0E-4F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.ch, 0.3F), ecm.b, cxa.px.o()),
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
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.pw, 0.4F), ecm.b, cxa.px.o()),
                  new edd(new edf(cxa.pr, 0.01F), ecm.b, cxa.px.o()),
                  new edd(new edf(cxa.pw, 1.0E-4F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.pr, 1.0E-4F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.ch, 0.3F), ecm.b, cxa.px.o()),
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
            new edh(ImmutableList.of(new edd(new edf(cxa.py, 0.5F), ecm.b, cxa.a.o()), new edd(new edf(cxa.ch, 0.6F), ecm.b, cxa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new edh(ImmutableList.of(new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.px.o()), new edd(new edf(cxa.pr, 1.0E-4F), ecm.b, cxa.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.px.o()),
                  new edd(new edf(cxa.pw, 0.15F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.pw, 0.01F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.pw, 0.5F), ecm.b, cxa.px.o()),
                  new edd(new edf(cxa.pw, 0.3F), ecm.b, cxa.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new edh(
               ImmutableList.of(new edd(new edf(cxa.ch, 0.3F), ecm.b, cxa.px.o()), new edd(ecm.b, ecm.b, new ecn(0.0F, 0.05F, 0, 100, ic.a.b), cxa.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ecs(0.9F), new ede(asi.bH)));
      a($$0, E, ImmutableList.of(new ecs(0.1F), new ede(asi.bH)));
      a($$0, F, ImmutableList.of(new ecs(0.1F), new edh(ImmutableList.of(new edd(new ecr(cxa.R), ecm.b, cxa.cy.o()))), new ede(asi.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.sW, 0.3F), ecm.b, cxa.tb.o()),
                  new edd(new edf(cxa.sS, 0.3F), ecm.b, cxa.tc.o()),
                  new edd(new edf(cxa.of, 0.05F), ecm.b, cxa.a.o())
               )
            ),
            new ede(asi.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ecs($$1.b(asi.bN), 0.95F),
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.sW, 0.3F), ecm.b, cxa.tb.o()),
                  new edd(new edf(cxa.sS, 0.3F), ecm.b, cxa.tc.o()),
                  new edd(new edf(cxa.of, 0.05F), ecm.b, cxa.a.o())
               )
            ),
            new ede(asi.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ecs($$1.b(asi.bN), 0.95F),
            new edh(
               ImmutableList.of(
                  new edd(new edf(cxa.sW, 0.3F), ecm.b, cxa.tb.o()),
                  new edd(new edf(cxa.sS, 0.3F), ecm.b, cxa.tc.o()),
                  new edd(new edf(cxa.sU, 0.3F), ecm.b, cxa.a.o()),
                  new edd(new edf(cxa.of, 0.05F), ecm.b, cxa.a.o())
               )
            ),
            new ede(asi.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new edh(
               List.of(
                  new edd(new edf(cxa.L, 0.2F), ecm.b, cxa.j.o()),
                  new edd(new edf(cxa.L, 0.1F), ecm.b, cxa.k.o()),
                  new edd(new edf(cxa.eM, 0.1F), ecm.b, cxa.eL.o())
               )
            ),
            a(ehd.aQ, 6),
            a(ehd.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new edh(
               List.of(
                  new edd(new edf(cxa.L, 0.2F), ecm.b, cxa.j.o()),
                  new edd(new edf(cxa.L, 0.1F), ecm.b, cxa.k.o()),
                  new edd(new edf(cxa.eM, 0.1F), ecm.b, cxa.eL.o())
               )
            ),
            a(ehd.aQ, 2)
         )
      );
      a($$0, L, List.of(a(ehd.aQ, 2)));
   }

   private static ecu a(ahh $$0, int $$1) {
      return new ecu(new edh(List.of(new edd(new edq(asi.cl), ecm.b, eda.b, cxa.M.o(), new eds($$0)))), bje.a($$1));
   }
}
