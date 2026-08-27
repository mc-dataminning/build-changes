import com.google.common.collect.ImmutableList;
import java.util.List;

public class pk {
   private static final ahc<ecx> M = a("empty");
   public static final ahc<ecx> a = a("zombie_plains");
   public static final ahc<ecx> b = a("zombie_savanna");
   public static final ahc<ecx> c = a("zombie_snowy");
   public static final ahc<ecx> d = a("zombie_taiga");
   public static final ahc<ecx> e = a("zombie_desert");
   public static final ahc<ecx> f = a("mossify_10_percent");
   public static final ahc<ecx> g = a("mossify_20_percent");
   public static final ahc<ecx> h = a("mossify_70_percent");
   public static final ahc<ecx> i = a("street_plains");
   public static final ahc<ecx> j = a("street_savanna");
   public static final ahc<ecx> k = a("street_snowy_or_taiga");
   public static final ahc<ecx> l = a("farm_plains");
   public static final ahc<ecx> m = a("farm_savanna");
   public static final ahc<ecx> n = a("farm_snowy");
   public static final ahc<ecx> o = a("farm_taiga");
   public static final ahc<ecx> p = a("farm_desert");
   public static final ahc<ecx> q = a("outpost_rot");
   public static final ahc<ecx> r = a("bottom_rampart");
   public static final ahc<ecx> s = a("treasure_rooms");
   public static final ahc<ecx> t = a("housing");
   public static final ahc<ecx> u = a("side_wall_degradation");
   public static final ahc<ecx> v = a("stable_degradation");
   public static final ahc<ecx> w = a("bastion_generic_degradation");
   public static final ahc<ecx> x = a("rampart_degradation");
   public static final ahc<ecx> y = a("entrance_replacement");
   public static final ahc<ecx> z = a("bridge");
   public static final ahc<ecx> A = a("roof");
   public static final ahc<ecx> B = a("high_wall");
   public static final ahc<ecx> C = a("high_rampart");
   public static final ahc<ecx> D = a("fossil_rot");
   public static final ahc<ecx> E = a("fossil_coal");
   public static final ahc<ecx> F = a("fossil_diamonds");
   public static final ahc<ecx> G = a("ancient_city_start_degradation");
   public static final ahc<ecx> H = a("ancient_city_generic_degradation");
   public static final ahc<ecx> I = a("ancient_city_walls_degradation");
   public static final ahc<ecx> J = a("trail_ruins_houses_archaeology");
   public static final ahc<ecx> K = a("trail_ruins_roads_archaeology");
   public static final ahc<ecx> L = a("trail_ruins_tower_top_archaeology");

   private static ahc<ecx> a(String $$0) {
      return ahc.a(ke.aE, new ahd($$0));
   }

   private static void a(pc<ecx> $$0, ahc<ecx> $$1, List<ecw> $$2) {
      $$0.a($$1, new ecx($$2));
   }

   public static void a(pc<ecx> $$0) {
      ii<cwj> $$1 = $$0.a(ke.f);
      eco $$2 = new eco(new ecq(cwl.pr, 0.01F), ebx.b, cwl.pC.o());
      eco $$3 = new eco(new ecq(cwl.pC, 0.5F), ebx.b, cwl.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.m, 0.8F), ebx.b, cwl.cn.o()),
                  new eco(new edb(asb.p), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cp), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cq), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.m, 0.07F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.cn, 0.07F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.hj, 0.07F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.U, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.n, 0.1F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.cu, 0.1F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.al, 0.02F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.eY, 0.5F), ebx.b, cwl.bs.o()),
                  new eco[]{
                     new eco(
                        new ece(cwl.eY.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))),
                        ebx.b,
                        cwl.hL.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))
                     ),
                     new eco(
                        new ece(cwl.eY.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))),
                        ebx.b,
                        cwl.hL.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))
                     ),
                     new eco(new ecq(cwl.cB, 0.3F), ebx.b, cwl.gt.o()),
                     new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.gu.o()),
                     new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new edb(asb.p), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cp), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cq), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.r, 0.2F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.hP, 0.2F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.Y, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.as, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.hk, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.hn, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.hx, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.eY, 0.5F), ebx.b, cwl.bs.o()),
                  new eco(
                     new ece(cwl.eY.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))),
                     ebx.b,
                     cwl.hL.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))
                  ),
                  new eco[]{
                     new eco(
                        new ece(cwl.eY.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))),
                        ebx.b,
                        cwl.hL.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))
                     ),
                     new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new edb(asb.p), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cp), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cq), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.oe), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.o, 0.2F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.ju, 0.4F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.af, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.ax, 0.05F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.eY, 0.5F), ebx.b, cwl.bs.o()),
                  new eco(
                     new ece(cwl.eY.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))),
                     ebx.b,
                     cwl.hL.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))
                  ),
                  new eco(
                     new ece(cwl.eY.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))),
                     ebx.b,
                     cwl.hL.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))
                  ),
                  new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.gt.o()),
                  new eco[]{new eco(new ecq(cwl.cB, 0.8F), ebx.b, cwl.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.m, 0.8F), ebx.b, cwl.cn.o()),
                  new eco(new edb(asb.p), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cp), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cq), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.og), ebx.b, cwl.og.o().a(cwx.c, Boolean.valueOf(false))),
                  new eco(new ecq(cwl.m, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.V, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.eY, 0.5F), ebx.b, cwl.bs.o()),
                  new eco(
                     new ece(cwl.eY.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))),
                     ebx.b,
                     cwl.hL.o().a(daj.a, Boolean.valueOf(true)).a(daj.c, Boolean.valueOf(true))
                  ),
                  new eco(
                     new ece(cwl.eY.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))),
                     ebx.b,
                     cwl.hL.o().a(daj.b, Boolean.valueOf(true)).a(daj.d, Boolean.valueOf(true))
                  ),
                  new eco(new ecq(cwl.cB, 0.3F), ebx.b, cwl.fd.o()),
                  new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.gu.o()),
                  new eco[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new edb(asb.p), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cp), ebx.b, cwl.a.o()),
                  new eco(new ecc(cwl.cq), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.jS, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.aX, 0.1F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.iA, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.nl, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.ny, 0.08F), ebx.b, cwl.bs.o()),
                  new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.kD.o()),
                  new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.m, 0.1F), ebx.b, cwl.cn.o())))));
      a($$0, g, ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.m, 0.2F), ebx.b, cwl.cn.o())))));
      a($$0, h, ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.m, 0.7F), ebx.b, cwl.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecc(cwl.kE), new ecc(cwl.G), cwl.n.o()),
                  new eco(new ecq(cwl.kE, 0.1F), ebx.b, cwl.i.o()),
                  new eco(new ecc(cwl.i), new ecc(cwl.G), cwl.G.o()),
                  new eco(new ecc(cwl.j), new ecc(cwl.G), cwl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecc(cwl.kE), new ecc(cwl.G), cwl.r.o()),
                  new eco(new ecq(cwl.kE, 0.2F), ebx.b, cwl.i.o()),
                  new eco(new ecc(cwl.i), new ecc(cwl.G), cwl.G.o()),
                  new eco(new ecc(cwl.j), new ecc(cwl.G), cwl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecc(cwl.kE), new ecc(cwl.G), cwl.o.o()),
                  new eco(new ecc(cwl.kE), new ecc(cwl.dO), cwl.o.o()),
                  new eco(new ecq(cwl.kE, 0.2F), ebx.b, cwl.i.o()),
                  new eco(new ecc(cwl.i), new ecc(cwl.G), cwl.G.o()),
                  new eco(new ecc(cwl.j), new ecc(cwl.G), cwl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.cB, 0.3F), ebx.b, cwl.gt.o()),
                  new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.gu.o()),
                  new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.gt.o()), new eco(new ecq(cwl.cB, 0.8F), ebx.b, cwl.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.cB, 0.3F), ebx.b, cwl.fd.o()), new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.cB, 0.2F), ebx.b, cwl.kD.o()), new eco(new ecq(cwl.cB, 0.1F), ebx.b, cwl.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ecd(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ecs(ImmutableList.of(new eco(new ecq(cwl.kJ, 0.75F), ebx.b, cwl.px.o()), new eco(new ecq(cwl.px, 0.15F), ebx.b, cwl.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ecs(ImmutableList.of(new eco(new ecq(cwl.pw, 0.35F), ebx.b, cwl.px.o()), new eco(new ecq(cwl.py, 0.1F), ebx.b, cwl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ecs(ImmutableList.of(new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.px.o()), new eco(new ecq(cwl.pr, 1.0E-4F), ebx.b, cwl.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ecs(ImmutableList.of(new eco(new ecq(cwl.py, 0.5F), ebx.b, cwl.a.o()), new eco(new ecq(cwl.ch, 0.1F), ebx.b, cwl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ecs(ImmutableList.of(new eco(new ecq(cwl.pw, 0.1F), ebx.b, cwl.px.o()), new eco(new ecq(cwl.pr, 1.0E-4F), ebx.b, cwl.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.px.o()),
                  new eco(new ecq(cwl.pr, 1.0E-4F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.ch, 0.3F), ebx.b, cwl.px.o()),
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
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.pw, 0.4F), ebx.b, cwl.px.o()),
                  new eco(new ecq(cwl.pr, 0.01F), ebx.b, cwl.px.o()),
                  new eco(new ecq(cwl.pw, 1.0E-4F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.pr, 1.0E-4F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.ch, 0.3F), ebx.b, cwl.px.o()),
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
            new ecs(ImmutableList.of(new eco(new ecq(cwl.py, 0.5F), ebx.b, cwl.a.o()), new eco(new ecq(cwl.ch, 0.6F), ebx.b, cwl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ecs(ImmutableList.of(new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.px.o()), new eco(new ecq(cwl.pr, 1.0E-4F), ebx.b, cwl.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.px.o()),
                  new eco(new ecq(cwl.pw, 0.15F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.pw, 0.01F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.pw, 0.5F), ebx.b, cwl.px.o()),
                  new eco(new ecq(cwl.pw, 0.3F), ebx.b, cwl.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(new eco(new ecq(cwl.ch, 0.3F), ebx.b, cwl.px.o()), new eco(ebx.b, ebx.b, new eby(0.0F, 0.05F, 0, 100, ic.a.b), cwl.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ecd(0.9F), new ecp(asb.bH)));
      a($$0, E, ImmutableList.of(new ecd(0.1F), new ecp(asb.bH)));
      a($$0, F, ImmutableList.of(new ecd(0.1F), new ecs(ImmutableList.of(new eco(new ecc(cwl.R), ebx.b, cwl.cy.o()))), new ecp(asb.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.sW, 0.3F), ebx.b, cwl.tb.o()),
                  new eco(new ecq(cwl.sS, 0.3F), ebx.b, cwl.tc.o()),
                  new eco(new ecq(cwl.of, 0.05F), ebx.b, cwl.a.o())
               )
            ),
            new ecp(asb.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ecd($$1.b(asb.bN), 0.95F),
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.sW, 0.3F), ebx.b, cwl.tb.o()),
                  new eco(new ecq(cwl.sS, 0.3F), ebx.b, cwl.tc.o()),
                  new eco(new ecq(cwl.of, 0.05F), ebx.b, cwl.a.o())
               )
            ),
            new ecp(asb.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ecd($$1.b(asb.bN), 0.95F),
            new ecs(
               ImmutableList.of(
                  new eco(new ecq(cwl.sW, 0.3F), ebx.b, cwl.tb.o()),
                  new eco(new ecq(cwl.sS, 0.3F), ebx.b, cwl.tc.o()),
                  new eco(new ecq(cwl.sU, 0.3F), ebx.b, cwl.a.o()),
                  new eco(new ecq(cwl.of, 0.05F), ebx.b, cwl.a.o())
               )
            ),
            new ecp(asb.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ecs(
               List.of(
                  new eco(new ecq(cwl.L, 0.2F), ebx.b, cwl.j.o()),
                  new eco(new ecq(cwl.L, 0.1F), ebx.b, cwl.k.o()),
                  new eco(new ecq(cwl.eM, 0.1F), ebx.b, cwl.eL.o())
               )
            ),
            a(egn.aQ, 6),
            a(egn.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ecs(
               List.of(
                  new eco(new ecq(cwl.L, 0.2F), ebx.b, cwl.j.o()),
                  new eco(new ecq(cwl.L, 0.1F), ebx.b, cwl.k.o()),
                  new eco(new ecq(cwl.eM, 0.1F), ebx.b, cwl.eL.o())
               )
            ),
            a(egn.aQ, 2)
         )
      );
      a($$0, L, List.of(a(egn.aQ, 2)));
   }

   private static ecf a(ahd $$0, int $$1) {
      return new ecf(new ecs(List.of(new eco(new edb(asb.cl), ebx.b, ecl.b, cwl.M.o(), new edd($$0)))), bix.a($$1));
   }
}
