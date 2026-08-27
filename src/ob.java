import com.google.common.collect.ImmutableList;
import java.util.List;

public class ob {
   private static final aex<dzb> M = a("empty");
   public static final aex<dzb> a = a("zombie_plains");
   public static final aex<dzb> b = a("zombie_savanna");
   public static final aex<dzb> c = a("zombie_snowy");
   public static final aex<dzb> d = a("zombie_taiga");
   public static final aex<dzb> e = a("zombie_desert");
   public static final aex<dzb> f = a("mossify_10_percent");
   public static final aex<dzb> g = a("mossify_20_percent");
   public static final aex<dzb> h = a("mossify_70_percent");
   public static final aex<dzb> i = a("street_plains");
   public static final aex<dzb> j = a("street_savanna");
   public static final aex<dzb> k = a("street_snowy_or_taiga");
   public static final aex<dzb> l = a("farm_plains");
   public static final aex<dzb> m = a("farm_savanna");
   public static final aex<dzb> n = a("farm_snowy");
   public static final aex<dzb> o = a("farm_taiga");
   public static final aex<dzb> p = a("farm_desert");
   public static final aex<dzb> q = a("outpost_rot");
   public static final aex<dzb> r = a("bottom_rampart");
   public static final aex<dzb> s = a("treasure_rooms");
   public static final aex<dzb> t = a("housing");
   public static final aex<dzb> u = a("side_wall_degradation");
   public static final aex<dzb> v = a("stable_degradation");
   public static final aex<dzb> w = a("bastion_generic_degradation");
   public static final aex<dzb> x = a("rampart_degradation");
   public static final aex<dzb> y = a("entrance_replacement");
   public static final aex<dzb> z = a("bridge");
   public static final aex<dzb> A = a("roof");
   public static final aex<dzb> B = a("high_wall");
   public static final aex<dzb> C = a("high_rampart");
   public static final aex<dzb> D = a("fossil_rot");
   public static final aex<dzb> E = a("fossil_coal");
   public static final aex<dzb> F = a("fossil_diamonds");
   public static final aex<dzb> G = a("ancient_city_start_degradation");
   public static final aex<dzb> H = a("ancient_city_generic_degradation");
   public static final aex<dzb> I = a("ancient_city_walls_degradation");
   public static final aex<dzb> J = a("trail_ruins_houses_archaeology");
   public static final aex<dzb> K = a("trail_ruins_roads_archaeology");
   public static final aex<dzb> L = a("trail_ruins_tower_top_archaeology");

   private static aex<dzb> a(String $$0) {
      return aex.a(je.aA, new aey($$0));
   }

   private static void a(nt<dzb> $$0, aex<dzb> $$1, List<dza> $$2) {
      $$0.a($$1, new dzb($$2));
   }

   public static void a(nt<dzb> $$0) {
      hh<csx> $$1 = $$0.a(je.e);
      dys $$2 = new dys(new dyu(csy.pr, 0.01F), dyb.b, csy.pC.n());
      dys $$3 = new dys(new dyu(csy.pC, 0.5F), dyb.b, csy.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.m, 0.8F), dyb.b, csy.cn.n()),
                  new dys(new dzf(apu.p), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cp), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cq), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.m, 0.07F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.cn, 0.07F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.hj, 0.07F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.U, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.n, 0.1F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.cu, 0.1F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.al, 0.02F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.eZ, 0.5F), dyb.b, csy.bs.n()),
                  new dys[]{
                     new dys(
                        new dyi(csy.eZ.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))),
                        dyb.b,
                        csy.hL.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))
                     ),
                     new dys(
                        new dyi(csy.eZ.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))),
                        dyb.b,
                        csy.hL.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))
                     ),
                     new dys(new dyu(csy.cB, 0.3F), dyb.b, csy.gt.n()),
                     new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.gu.n()),
                     new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dzf(apu.p), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cp), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cq), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.r, 0.2F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.hP, 0.2F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.Y, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.as, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.hk, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.hn, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.hx, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.eZ, 0.5F), dyb.b, csy.bs.n()),
                  new dys(
                     new dyi(csy.eZ.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))),
                     dyb.b,
                     csy.hL.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))
                  ),
                  new dys[]{
                     new dys(
                        new dyi(csy.eZ.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))),
                        dyb.b,
                        csy.hL.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))
                     ),
                     new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dzf(apu.p), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cp), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cq), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.oe), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.o, 0.2F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.ju, 0.4F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.af, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.ax, 0.05F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.eZ, 0.5F), dyb.b, csy.bs.n()),
                  new dys(
                     new dyi(csy.eZ.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))),
                     dyb.b,
                     csy.hL.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))
                  ),
                  new dys(
                     new dyi(csy.eZ.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))),
                     dyb.b,
                     csy.hL.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))
                  ),
                  new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.gt.n()),
                  new dys[]{new dys(new dyu(csy.cB, 0.8F), dyb.b, csy.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.m, 0.8F), dyb.b, csy.cn.n()),
                  new dys(new dzf(apu.p), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cp), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cq), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.og), dyb.b, csy.og.n().a(ctk.b, Boolean.valueOf(false))),
                  new dys(new dyu(csy.m, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.V, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.eZ, 0.5F), dyb.b, csy.bs.n()),
                  new dys(
                     new dyi(csy.eZ.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))),
                     dyb.b,
                     csy.hL.n().a(cwv.a, Boolean.valueOf(true)).a(cwv.c, Boolean.valueOf(true))
                  ),
                  new dys(
                     new dyi(csy.eZ.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))),
                     dyb.b,
                     csy.hL.n().a(cwv.b, Boolean.valueOf(true)).a(cwv.d, Boolean.valueOf(true))
                  ),
                  new dys(new dyu(csy.cB, 0.3F), dyb.b, csy.fd.n()),
                  new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.gu.n()),
                  new dys[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dzf(apu.p), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cp), dyb.b, csy.a.n()),
                  new dys(new dyg(csy.cq), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.jS, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.aX, 0.1F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.iA, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.nl, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.ny, 0.08F), dyb.b, csy.bs.n()),
                  new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.kD.n()),
                  new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.m, 0.1F), dyb.b, csy.cn.n())))));
      a($$0, g, ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.m, 0.2F), dyb.b, csy.cn.n())))));
      a($$0, h, ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.m, 0.7F), dyb.b, csy.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyg(csy.kE), new dyg(csy.G), csy.n.n()),
                  new dys(new dyu(csy.kE, 0.1F), dyb.b, csy.i.n()),
                  new dys(new dyg(csy.i), new dyg(csy.G), csy.G.n()),
                  new dys(new dyg(csy.j), new dyg(csy.G), csy.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyg(csy.kE), new dyg(csy.G), csy.r.n()),
                  new dys(new dyu(csy.kE, 0.2F), dyb.b, csy.i.n()),
                  new dys(new dyg(csy.i), new dyg(csy.G), csy.G.n()),
                  new dys(new dyg(csy.j), new dyg(csy.G), csy.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyg(csy.kE), new dyg(csy.G), csy.o.n()),
                  new dys(new dyg(csy.kE), new dyg(csy.dO), csy.o.n()),
                  new dys(new dyu(csy.kE, 0.2F), dyb.b, csy.i.n()),
                  new dys(new dyg(csy.i), new dyg(csy.G), csy.G.n()),
                  new dys(new dyg(csy.j), new dyg(csy.G), csy.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.cB, 0.3F), dyb.b, csy.gt.n()),
                  new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.gu.n()),
                  new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.gt.n()), new dys(new dyu(csy.cB, 0.8F), dyb.b, csy.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.cB, 0.3F), dyb.b, csy.fd.n()), new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.cB, 0.2F), dyb.b, csy.kD.n()), new dys(new dyu(csy.cB, 0.1F), dyb.b, csy.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dyh(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyw(ImmutableList.of(new dys(new dyu(csy.kJ, 0.75F), dyb.b, csy.px.n()), new dys(new dyu(csy.px, 0.15F), dyb.b, csy.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyw(ImmutableList.of(new dys(new dyu(csy.pw, 0.35F), dyb.b, csy.px.n()), new dys(new dyu(csy.py, 0.1F), dyb.b, csy.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyw(ImmutableList.of(new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.px.n()), new dys(new dyu(csy.pr, 1.0E-4F), dyb.b, csy.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyw(ImmutableList.of(new dys(new dyu(csy.py, 0.5F), dyb.b, csy.a.n()), new dys(new dyu(csy.ch, 0.1F), dyb.b, csy.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyw(ImmutableList.of(new dys(new dyu(csy.pw, 0.1F), dyb.b, csy.px.n()), new dys(new dyu(csy.pr, 1.0E-4F), dyb.b, csy.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.px.n()),
                  new dys(new dyu(csy.pr, 1.0E-4F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.ch, 0.3F), dyb.b, csy.px.n()),
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
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.pw, 0.4F), dyb.b, csy.px.n()),
                  new dys(new dyu(csy.pr, 0.01F), dyb.b, csy.px.n()),
                  new dys(new dyu(csy.pw, 1.0E-4F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.pr, 1.0E-4F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.ch, 0.3F), dyb.b, csy.px.n()),
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
            new dyw(ImmutableList.of(new dys(new dyu(csy.py, 0.5F), dyb.b, csy.a.n()), new dys(new dyu(csy.ch, 0.6F), dyb.b, csy.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyw(ImmutableList.of(new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.px.n()), new dys(new dyu(csy.pr, 1.0E-4F), dyb.b, csy.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.px.n()),
                  new dys(new dyu(csy.pw, 0.15F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.pw, 0.01F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.pw, 0.5F), dyb.b, csy.px.n()),
                  new dys(new dyu(csy.pw, 0.3F), dyb.b, csy.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(new dys(new dyu(csy.ch, 0.3F), dyb.b, csy.px.n()), new dys(dyb.b, dyb.b, new dyc(0.0F, 0.05F, 0, 100, hc.a.b), csy.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dyh(0.9F), new dyt(apu.bH)));
      a($$0, E, ImmutableList.of(new dyh(0.1F), new dyt(apu.bH)));
      a($$0, F, ImmutableList.of(new dyh(0.1F), new dyw(ImmutableList.of(new dys(new dyg(csy.R), dyb.b, csy.cy.n()))), new dyt(apu.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.rV, 0.3F), dyb.b, csy.sa.n()),
                  new dys(new dyu(csy.rR, 0.3F), dyb.b, csy.sb.n()),
                  new dys(new dyu(csy.of, 0.05F), dyb.b, csy.a.n())
               )
            ),
            new dyt(apu.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dyh($$1.b(apu.bN), 0.95F),
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.rV, 0.3F), dyb.b, csy.sa.n()),
                  new dys(new dyu(csy.rR, 0.3F), dyb.b, csy.sb.n()),
                  new dys(new dyu(csy.of, 0.05F), dyb.b, csy.a.n())
               )
            ),
            new dyt(apu.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dyh($$1.b(apu.bN), 0.95F),
            new dyw(
               ImmutableList.of(
                  new dys(new dyu(csy.rV, 0.3F), dyb.b, csy.sa.n()),
                  new dys(new dyu(csy.rR, 0.3F), dyb.b, csy.sb.n()),
                  new dys(new dyu(csy.rT, 0.3F), dyb.b, csy.a.n()),
                  new dys(new dyu(csy.of, 0.05F), dyb.b, csy.a.n())
               )
            ),
            new dyt(apu.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyw(
               List.of(
                  new dys(new dyu(csy.L, 0.2F), dyb.b, csy.j.n()),
                  new dys(new dyu(csy.L, 0.1F), dyb.b, csy.k.n()),
                  new dys(new dyu(csy.eN, 0.1F), dyb.b, csy.eM.n())
               )
            ),
            a(ecq.aE, 6),
            a(ecq.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyw(
               List.of(
                  new dys(new dyu(csy.L, 0.2F), dyb.b, csy.j.n()),
                  new dys(new dyu(csy.L, 0.1F), dyb.b, csy.k.n()),
                  new dys(new dyu(csy.eN, 0.1F), dyb.b, csy.eM.n())
               )
            ),
            a(ecq.aE, 2)
         )
      );
      a($$0, L, List.of(a(ecq.aE, 2)));
   }

   private static dyj a(aey $$0, int $$1) {
      return new dyj(new dyw(List.of(new dys(new dzf(apu.cl), dyb.b, dyp.b, csy.M.n(), new dzh($$0)))), bgc.a($$1));
   }
}
