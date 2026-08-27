import com.google.common.collect.ImmutableList;
import java.util.List;

public class nu {
   private static final aeq<dyp> M = a("empty");
   public static final aeq<dyp> a = a("zombie_plains");
   public static final aeq<dyp> b = a("zombie_savanna");
   public static final aeq<dyp> c = a("zombie_snowy");
   public static final aeq<dyp> d = a("zombie_taiga");
   public static final aeq<dyp> e = a("zombie_desert");
   public static final aeq<dyp> f = a("mossify_10_percent");
   public static final aeq<dyp> g = a("mossify_20_percent");
   public static final aeq<dyp> h = a("mossify_70_percent");
   public static final aeq<dyp> i = a("street_plains");
   public static final aeq<dyp> j = a("street_savanna");
   public static final aeq<dyp> k = a("street_snowy_or_taiga");
   public static final aeq<dyp> l = a("farm_plains");
   public static final aeq<dyp> m = a("farm_savanna");
   public static final aeq<dyp> n = a("farm_snowy");
   public static final aeq<dyp> o = a("farm_taiga");
   public static final aeq<dyp> p = a("farm_desert");
   public static final aeq<dyp> q = a("outpost_rot");
   public static final aeq<dyp> r = a("bottom_rampart");
   public static final aeq<dyp> s = a("treasure_rooms");
   public static final aeq<dyp> t = a("housing");
   public static final aeq<dyp> u = a("side_wall_degradation");
   public static final aeq<dyp> v = a("stable_degradation");
   public static final aeq<dyp> w = a("bastion_generic_degradation");
   public static final aeq<dyp> x = a("rampart_degradation");
   public static final aeq<dyp> y = a("entrance_replacement");
   public static final aeq<dyp> z = a("bridge");
   public static final aeq<dyp> A = a("roof");
   public static final aeq<dyp> B = a("high_wall");
   public static final aeq<dyp> C = a("high_rampart");
   public static final aeq<dyp> D = a("fossil_rot");
   public static final aeq<dyp> E = a("fossil_coal");
   public static final aeq<dyp> F = a("fossil_diamonds");
   public static final aeq<dyp> G = a("ancient_city_start_degradation");
   public static final aeq<dyp> H = a("ancient_city_generic_degradation");
   public static final aeq<dyp> I = a("ancient_city_walls_degradation");
   public static final aeq<dyp> J = a("trail_ruins_houses_archaeology");
   public static final aeq<dyp> K = a("trail_ruins_roads_archaeology");
   public static final aeq<dyp> L = a("trail_ruins_tower_top_archaeology");

   private static aeq<dyp> a(String $$0) {
      return aeq.a(jc.aA, new aer($$0));
   }

   private static void a(nm<dyp> $$0, aeq<dyp> $$1, List<dyo> $$2) {
      $$0.a($$1, new dyp($$2));
   }

   public static void a(nm<dyp> $$0) {
      hf<csl> $$1 = $$0.a(jc.e);
      dyg $$2 = new dyg(new dyi(csm.pr, 0.01F), dxp.b, csm.pC.n());
      dyg $$3 = new dyg(new dyi(csm.pC, 0.5F), dxp.b, csm.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.m, 0.8F), dxp.b, csm.cn.n()),
                  new dyg(new dyt(apl.p), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cp), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cq), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.m, 0.07F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.cn, 0.07F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.hj, 0.07F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.U, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.n, 0.1F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.cu, 0.1F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.al, 0.02F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.eZ, 0.5F), dxp.b, csm.bs.n()),
                  new dyg[]{
                     new dyg(
                        new dxw(csm.eZ.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))),
                        dxp.b,
                        csm.hL.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))
                     ),
                     new dyg(
                        new dxw(csm.eZ.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))),
                        dxp.b,
                        csm.hL.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))
                     ),
                     new dyg(new dyi(csm.cB, 0.3F), dxp.b, csm.gt.n()),
                     new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.gu.n()),
                     new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyt(apl.p), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cp), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cq), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.r, 0.2F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.hP, 0.2F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.Y, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.as, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.hk, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.hn, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.hx, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.eZ, 0.5F), dxp.b, csm.bs.n()),
                  new dyg(
                     new dxw(csm.eZ.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))),
                     dxp.b,
                     csm.hL.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))
                  ),
                  new dyg[]{
                     new dyg(
                        new dxw(csm.eZ.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))),
                        dxp.b,
                        csm.hL.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))
                     ),
                     new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyt(apl.p), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cp), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cq), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.oe), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.o, 0.2F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.ju, 0.4F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.af, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.ax, 0.05F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.eZ, 0.5F), dxp.b, csm.bs.n()),
                  new dyg(
                     new dxw(csm.eZ.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))),
                     dxp.b,
                     csm.hL.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))
                  ),
                  new dyg(
                     new dxw(csm.eZ.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))),
                     dxp.b,
                     csm.hL.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))
                  ),
                  new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.gt.n()),
                  new dyg[]{new dyg(new dyi(csm.cB, 0.8F), dxp.b, csm.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.m, 0.8F), dxp.b, csm.cn.n()),
                  new dyg(new dyt(apl.p), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cp), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cq), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.og), dxp.b, csm.og.n().a(csy.b, Boolean.valueOf(false))),
                  new dyg(new dyi(csm.m, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.V, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.eZ, 0.5F), dxp.b, csm.bs.n()),
                  new dyg(
                     new dxw(csm.eZ.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))),
                     dxp.b,
                     csm.hL.n().a(cwj.a, Boolean.valueOf(true)).a(cwj.c, Boolean.valueOf(true))
                  ),
                  new dyg(
                     new dxw(csm.eZ.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))),
                     dxp.b,
                     csm.hL.n().a(cwj.b, Boolean.valueOf(true)).a(cwj.d, Boolean.valueOf(true))
                  ),
                  new dyg(new dyi(csm.cB, 0.3F), dxp.b, csm.fd.n()),
                  new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.gu.n()),
                  new dyg[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyt(apl.p), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cp), dxp.b, csm.a.n()),
                  new dyg(new dxu(csm.cq), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.jS, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.aX, 0.1F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.iA, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.nl, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.ny, 0.08F), dxp.b, csm.bs.n()),
                  new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.kD.n()),
                  new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.m, 0.1F), dxp.b, csm.cn.n())))));
      a($$0, g, ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.m, 0.2F), dxp.b, csm.cn.n())))));
      a($$0, h, ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.m, 0.7F), dxp.b, csm.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dxu(csm.kE), new dxu(csm.G), csm.n.n()),
                  new dyg(new dyi(csm.kE, 0.1F), dxp.b, csm.i.n()),
                  new dyg(new dxu(csm.i), new dxu(csm.G), csm.G.n()),
                  new dyg(new dxu(csm.j), new dxu(csm.G), csm.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dxu(csm.kE), new dxu(csm.G), csm.r.n()),
                  new dyg(new dyi(csm.kE, 0.2F), dxp.b, csm.i.n()),
                  new dyg(new dxu(csm.i), new dxu(csm.G), csm.G.n()),
                  new dyg(new dxu(csm.j), new dxu(csm.G), csm.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dxu(csm.kE), new dxu(csm.G), csm.o.n()),
                  new dyg(new dxu(csm.kE), new dxu(csm.dO), csm.o.n()),
                  new dyg(new dyi(csm.kE, 0.2F), dxp.b, csm.i.n()),
                  new dyg(new dxu(csm.i), new dxu(csm.G), csm.G.n()),
                  new dyg(new dxu(csm.j), new dxu(csm.G), csm.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.cB, 0.3F), dxp.b, csm.gt.n()),
                  new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.gu.n()),
                  new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.gt.n()), new dyg(new dyi(csm.cB, 0.8F), dxp.b, csm.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.cB, 0.3F), dxp.b, csm.fd.n()), new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.cB, 0.2F), dxp.b, csm.kD.n()), new dyg(new dyi(csm.cB, 0.1F), dxp.b, csm.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dxv(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyk(ImmutableList.of(new dyg(new dyi(csm.kJ, 0.75F), dxp.b, csm.px.n()), new dyg(new dyi(csm.px, 0.15F), dxp.b, csm.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyk(ImmutableList.of(new dyg(new dyi(csm.pw, 0.35F), dxp.b, csm.px.n()), new dyg(new dyi(csm.py, 0.1F), dxp.b, csm.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyk(ImmutableList.of(new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.px.n()), new dyg(new dyi(csm.pr, 1.0E-4F), dxp.b, csm.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyk(ImmutableList.of(new dyg(new dyi(csm.py, 0.5F), dxp.b, csm.a.n()), new dyg(new dyi(csm.ch, 0.1F), dxp.b, csm.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyk(ImmutableList.of(new dyg(new dyi(csm.pw, 0.1F), dxp.b, csm.px.n()), new dyg(new dyi(csm.pr, 1.0E-4F), dxp.b, csm.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.px.n()),
                  new dyg(new dyi(csm.pr, 1.0E-4F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.ch, 0.3F), dxp.b, csm.px.n()),
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
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.pw, 0.4F), dxp.b, csm.px.n()),
                  new dyg(new dyi(csm.pr, 0.01F), dxp.b, csm.px.n()),
                  new dyg(new dyi(csm.pw, 1.0E-4F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.pr, 1.0E-4F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.ch, 0.3F), dxp.b, csm.px.n()),
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
            new dyk(ImmutableList.of(new dyg(new dyi(csm.py, 0.5F), dxp.b, csm.a.n()), new dyg(new dyi(csm.ch, 0.6F), dxp.b, csm.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyk(ImmutableList.of(new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.px.n()), new dyg(new dyi(csm.pr, 1.0E-4F), dxp.b, csm.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.px.n()),
                  new dyg(new dyi(csm.pw, 0.15F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.pw, 0.01F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.pw, 0.5F), dxp.b, csm.px.n()),
                  new dyg(new dyi(csm.pw, 0.3F), dxp.b, csm.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(new dyg(new dyi(csm.ch, 0.3F), dxp.b, csm.px.n()), new dyg(dxp.b, dxp.b, new dxq(0.0F, 0.05F, 0, 100, ha.a.b), csm.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dxv(0.9F), new dyh(apl.bH)));
      a($$0, E, ImmutableList.of(new dxv(0.1F), new dyh(apl.bH)));
      a($$0, F, ImmutableList.of(new dxv(0.1F), new dyk(ImmutableList.of(new dyg(new dxu(csm.R), dxp.b, csm.cy.n()))), new dyh(apl.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.rV, 0.3F), dxp.b, csm.sa.n()),
                  new dyg(new dyi(csm.rR, 0.3F), dxp.b, csm.sb.n()),
                  new dyg(new dyi(csm.of, 0.05F), dxp.b, csm.a.n())
               )
            ),
            new dyh(apl.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dxv($$1.b(apl.bN), 0.95F),
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.rV, 0.3F), dxp.b, csm.sa.n()),
                  new dyg(new dyi(csm.rR, 0.3F), dxp.b, csm.sb.n()),
                  new dyg(new dyi(csm.of, 0.05F), dxp.b, csm.a.n())
               )
            ),
            new dyh(apl.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dxv($$1.b(apl.bN), 0.95F),
            new dyk(
               ImmutableList.of(
                  new dyg(new dyi(csm.rV, 0.3F), dxp.b, csm.sa.n()),
                  new dyg(new dyi(csm.rR, 0.3F), dxp.b, csm.sb.n()),
                  new dyg(new dyi(csm.rT, 0.3F), dxp.b, csm.a.n()),
                  new dyg(new dyi(csm.of, 0.05F), dxp.b, csm.a.n())
               )
            ),
            new dyh(apl.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyk(
               List.of(
                  new dyg(new dyi(csm.L, 0.2F), dxp.b, csm.j.n()),
                  new dyg(new dyi(csm.L, 0.1F), dxp.b, csm.k.n()),
                  new dyg(new dyi(csm.eN, 0.1F), dxp.b, csm.eM.n())
               )
            ),
            a(ece.aE, 6),
            a(ece.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyk(
               List.of(
                  new dyg(new dyi(csm.L, 0.2F), dxp.b, csm.j.n()),
                  new dyg(new dyi(csm.L, 0.1F), dxp.b, csm.k.n()),
                  new dyg(new dyi(csm.eN, 0.1F), dxp.b, csm.eM.n())
               )
            ),
            a(ece.aE, 2)
         )
      );
      a($$0, L, List.of(a(ece.aE, 2)));
   }

   private static dxx a(aer $$0, int $$1) {
      return new dxx(new dyk(List.of(new dyg(new dyt(apl.cl), dxp.b, dyd.b, csm.M.n(), new dyv($$0)))), bfs.a($$1));
   }
}
