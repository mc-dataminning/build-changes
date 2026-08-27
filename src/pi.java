import com.google.common.collect.ImmutableList;
import java.util.List;

public class pi {
   private static final ags<ecm> M = a("empty");
   public static final ags<ecm> a = a("zombie_plains");
   public static final ags<ecm> b = a("zombie_savanna");
   public static final ags<ecm> c = a("zombie_snowy");
   public static final ags<ecm> d = a("zombie_taiga");
   public static final ags<ecm> e = a("zombie_desert");
   public static final ags<ecm> f = a("mossify_10_percent");
   public static final ags<ecm> g = a("mossify_20_percent");
   public static final ags<ecm> h = a("mossify_70_percent");
   public static final ags<ecm> i = a("street_plains");
   public static final ags<ecm> j = a("street_savanna");
   public static final ags<ecm> k = a("street_snowy_or_taiga");
   public static final ags<ecm> l = a("farm_plains");
   public static final ags<ecm> m = a("farm_savanna");
   public static final ags<ecm> n = a("farm_snowy");
   public static final ags<ecm> o = a("farm_taiga");
   public static final ags<ecm> p = a("farm_desert");
   public static final ags<ecm> q = a("outpost_rot");
   public static final ags<ecm> r = a("bottom_rampart");
   public static final ags<ecm> s = a("treasure_rooms");
   public static final ags<ecm> t = a("housing");
   public static final ags<ecm> u = a("side_wall_degradation");
   public static final ags<ecm> v = a("stable_degradation");
   public static final ags<ecm> w = a("bastion_generic_degradation");
   public static final ags<ecm> x = a("rampart_degradation");
   public static final ags<ecm> y = a("entrance_replacement");
   public static final ags<ecm> z = a("bridge");
   public static final ags<ecm> A = a("roof");
   public static final ags<ecm> B = a("high_wall");
   public static final ags<ecm> C = a("high_rampart");
   public static final ags<ecm> D = a("fossil_rot");
   public static final ags<ecm> E = a("fossil_coal");
   public static final ags<ecm> F = a("fossil_diamonds");
   public static final ags<ecm> G = a("ancient_city_start_degradation");
   public static final ags<ecm> H = a("ancient_city_generic_degradation");
   public static final ags<ecm> I = a("ancient_city_walls_degradation");
   public static final ags<ecm> J = a("trail_ruins_houses_archaeology");
   public static final ags<ecm> K = a("trail_ruins_roads_archaeology");
   public static final ags<ecm> L = a("trail_ruins_tower_top_archaeology");

   private static ags<ecm> a(String $$0) {
      return ags.a(kc.aD, new agt($$0));
   }

   private static void a(pa<ecm> $$0, ags<ecm> $$1, List<ecl> $$2) {
      $$0.a($$1, new ecm($$2));
   }

   public static void a(pa<ecm> $$0) {
      ig<cvz> $$1 = $$0.a(kc.f);
      ecd $$2 = new ecd(new ecf(cwb.pr, 0.01F), ebm.b, cwb.pC.o());
      ecd $$3 = new ecd(new ecf(cwb.pC, 0.5F), ebm.b, cwb.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.m, 0.8F), ebm.b, cwb.cn.o()),
                  new ecd(new ecq(arr.p), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cp), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cq), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.m, 0.07F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.cn, 0.07F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.hj, 0.07F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.U, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.n, 0.1F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.cu, 0.1F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.al, 0.02F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.eY, 0.5F), ebm.b, cwb.bs.o()),
                  new ecd[]{
                     new ecd(
                        new ebt(cwb.eY.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))),
                        ebm.b,
                        cwb.hL.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))
                     ),
                     new ecd(
                        new ebt(cwb.eY.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))),
                        ebm.b,
                        cwb.hL.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))
                     ),
                     new ecd(new ecf(cwb.cB, 0.3F), ebm.b, cwb.gt.o()),
                     new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.gu.o()),
                     new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecq(arr.p), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cp), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cq), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.r, 0.2F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.hP, 0.2F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.Y, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.as, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.hk, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.hn, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.hx, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.eY, 0.5F), ebm.b, cwb.bs.o()),
                  new ecd(
                     new ebt(cwb.eY.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))),
                     ebm.b,
                     cwb.hL.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))
                  ),
                  new ecd[]{
                     new ecd(
                        new ebt(cwb.eY.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))),
                        ebm.b,
                        cwb.hL.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))
                     ),
                     new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecq(arr.p), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cp), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cq), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.oe), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.o, 0.2F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.ju, 0.4F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.af, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.ax, 0.05F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.eY, 0.5F), ebm.b, cwb.bs.o()),
                  new ecd(
                     new ebt(cwb.eY.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))),
                     ebm.b,
                     cwb.hL.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))
                  ),
                  new ecd(
                     new ebt(cwb.eY.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))),
                     ebm.b,
                     cwb.hL.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))
                  ),
                  new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.gt.o()),
                  new ecd[]{new ecd(new ecf(cwb.cB, 0.8F), ebm.b, cwb.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.m, 0.8F), ebm.b, cwb.cn.o()),
                  new ecd(new ecq(arr.p), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cp), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cq), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.og), ebm.b, cwb.og.o().a(cwn.c, Boolean.valueOf(false))),
                  new ecd(new ecf(cwb.m, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.V, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.eY, 0.5F), ebm.b, cwb.bs.o()),
                  new ecd(
                     new ebt(cwb.eY.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))),
                     ebm.b,
                     cwb.hL.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true))
                  ),
                  new ecd(
                     new ebt(cwb.eY.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))),
                     ebm.b,
                     cwb.hL.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true))
                  ),
                  new ecd(new ecf(cwb.cB, 0.3F), ebm.b, cwb.fd.o()),
                  new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.gu.o()),
                  new ecd[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecq(arr.p), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cp), ebm.b, cwb.a.o()),
                  new ecd(new ebr(cwb.cq), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.jS, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.aX, 0.1F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.iA, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.nl, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.ny, 0.08F), ebm.b, cwb.bs.o()),
                  new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.kD.o()),
                  new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.m, 0.1F), ebm.b, cwb.cn.o())))));
      a($$0, g, ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.m, 0.2F), ebm.b, cwb.cn.o())))));
      a($$0, h, ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.m, 0.7F), ebm.b, cwb.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ebr(cwb.kE), new ebr(cwb.G), cwb.n.o()),
                  new ecd(new ecf(cwb.kE, 0.1F), ebm.b, cwb.i.o()),
                  new ecd(new ebr(cwb.i), new ebr(cwb.G), cwb.G.o()),
                  new ecd(new ebr(cwb.j), new ebr(cwb.G), cwb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ebr(cwb.kE), new ebr(cwb.G), cwb.r.o()),
                  new ecd(new ecf(cwb.kE, 0.2F), ebm.b, cwb.i.o()),
                  new ecd(new ebr(cwb.i), new ebr(cwb.G), cwb.G.o()),
                  new ecd(new ebr(cwb.j), new ebr(cwb.G), cwb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ebr(cwb.kE), new ebr(cwb.G), cwb.o.o()),
                  new ecd(new ebr(cwb.kE), new ebr(cwb.dO), cwb.o.o()),
                  new ecd(new ecf(cwb.kE, 0.2F), ebm.b, cwb.i.o()),
                  new ecd(new ebr(cwb.i), new ebr(cwb.G), cwb.G.o()),
                  new ecd(new ebr(cwb.j), new ebr(cwb.G), cwb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.cB, 0.3F), ebm.b, cwb.gt.o()),
                  new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.gu.o()),
                  new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.gt.o()), new ecd(new ecf(cwb.cB, 0.8F), ebm.b, cwb.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.cB, 0.3F), ebm.b, cwb.fd.o()), new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.cB, 0.2F), ebm.b, cwb.kD.o()), new ecd(new ecf(cwb.cB, 0.1F), ebm.b, cwb.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ebs(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ech(ImmutableList.of(new ecd(new ecf(cwb.kJ, 0.75F), ebm.b, cwb.px.o()), new ecd(new ecf(cwb.px, 0.15F), ebm.b, cwb.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ech(ImmutableList.of(new ecd(new ecf(cwb.pw, 0.35F), ebm.b, cwb.px.o()), new ecd(new ecf(cwb.py, 0.1F), ebm.b, cwb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ech(ImmutableList.of(new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.px.o()), new ecd(new ecf(cwb.pr, 1.0E-4F), ebm.b, cwb.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ech(ImmutableList.of(new ecd(new ecf(cwb.py, 0.5F), ebm.b, cwb.a.o()), new ecd(new ecf(cwb.ch, 0.1F), ebm.b, cwb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ech(ImmutableList.of(new ecd(new ecf(cwb.pw, 0.1F), ebm.b, cwb.px.o()), new ecd(new ecf(cwb.pr, 1.0E-4F), ebm.b, cwb.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.px.o()),
                  new ecd(new ecf(cwb.pr, 1.0E-4F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.ch, 0.3F), ebm.b, cwb.px.o()),
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
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.pw, 0.4F), ebm.b, cwb.px.o()),
                  new ecd(new ecf(cwb.pr, 0.01F), ebm.b, cwb.px.o()),
                  new ecd(new ecf(cwb.pw, 1.0E-4F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.pr, 1.0E-4F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.ch, 0.3F), ebm.b, cwb.px.o()),
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
            new ech(ImmutableList.of(new ecd(new ecf(cwb.py, 0.5F), ebm.b, cwb.a.o()), new ecd(new ecf(cwb.ch, 0.6F), ebm.b, cwb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ech(ImmutableList.of(new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.px.o()), new ecd(new ecf(cwb.pr, 1.0E-4F), ebm.b, cwb.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.px.o()),
                  new ecd(new ecf(cwb.pw, 0.15F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.pw, 0.01F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.pw, 0.5F), ebm.b, cwb.px.o()),
                  new ecd(new ecf(cwb.pw, 0.3F), ebm.b, cwb.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ech(
               ImmutableList.of(new ecd(new ecf(cwb.ch, 0.3F), ebm.b, cwb.px.o()), new ecd(ebm.b, ebm.b, new ebn(0.0F, 0.05F, 0, 100, ia.a.b), cwb.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ebs(0.9F), new ece(arr.bH)));
      a($$0, E, ImmutableList.of(new ebs(0.1F), new ece(arr.bH)));
      a($$0, F, ImmutableList.of(new ebs(0.1F), new ech(ImmutableList.of(new ecd(new ebr(cwb.R), ebm.b, cwb.cy.o()))), new ece(arr.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.sW, 0.3F), ebm.b, cwb.tb.o()),
                  new ecd(new ecf(cwb.sS, 0.3F), ebm.b, cwb.tc.o()),
                  new ecd(new ecf(cwb.of, 0.05F), ebm.b, cwb.a.o())
               )
            ),
            new ece(arr.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ebs($$1.b(arr.bN), 0.95F),
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.sW, 0.3F), ebm.b, cwb.tb.o()),
                  new ecd(new ecf(cwb.sS, 0.3F), ebm.b, cwb.tc.o()),
                  new ecd(new ecf(cwb.of, 0.05F), ebm.b, cwb.a.o())
               )
            ),
            new ece(arr.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ebs($$1.b(arr.bN), 0.95F),
            new ech(
               ImmutableList.of(
                  new ecd(new ecf(cwb.sW, 0.3F), ebm.b, cwb.tb.o()),
                  new ecd(new ecf(cwb.sS, 0.3F), ebm.b, cwb.tc.o()),
                  new ecd(new ecf(cwb.sU, 0.3F), ebm.b, cwb.a.o()),
                  new ecd(new ecf(cwb.of, 0.05F), ebm.b, cwb.a.o())
               )
            ),
            new ece(arr.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ech(
               List.of(
                  new ecd(new ecf(cwb.L, 0.2F), ebm.b, cwb.j.o()),
                  new ecd(new ecf(cwb.L, 0.1F), ebm.b, cwb.k.o()),
                  new ecd(new ecf(cwb.eM, 0.1F), ebm.b, cwb.eL.o())
               )
            ),
            a(egc.aQ, 6),
            a(egc.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ech(
               List.of(
                  new ecd(new ecf(cwb.L, 0.2F), ebm.b, cwb.j.o()),
                  new ecd(new ecf(cwb.L, 0.1F), ebm.b, cwb.k.o()),
                  new ecd(new ecf(cwb.eM, 0.1F), ebm.b, cwb.eL.o())
               )
            ),
            a(egc.aQ, 2)
         )
      );
      a($$0, L, List.of(a(egc.aQ, 2)));
   }

   private static ebu a(agt $$0, int $$1) {
      return new ebu(new ech(List.of(new ecd(new ecq(arr.cl), ebm.b, eca.b, cwb.M.o(), new ecs($$0)))), bin.a($$1));
   }
}
