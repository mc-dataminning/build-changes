import com.google.common.collect.ImmutableList;
import java.util.List;

public class oa {
   private static final aew<dyz> M = a("empty");
   public static final aew<dyz> a = a("zombie_plains");
   public static final aew<dyz> b = a("zombie_savanna");
   public static final aew<dyz> c = a("zombie_snowy");
   public static final aew<dyz> d = a("zombie_taiga");
   public static final aew<dyz> e = a("zombie_desert");
   public static final aew<dyz> f = a("mossify_10_percent");
   public static final aew<dyz> g = a("mossify_20_percent");
   public static final aew<dyz> h = a("mossify_70_percent");
   public static final aew<dyz> i = a("street_plains");
   public static final aew<dyz> j = a("street_savanna");
   public static final aew<dyz> k = a("street_snowy_or_taiga");
   public static final aew<dyz> l = a("farm_plains");
   public static final aew<dyz> m = a("farm_savanna");
   public static final aew<dyz> n = a("farm_snowy");
   public static final aew<dyz> o = a("farm_taiga");
   public static final aew<dyz> p = a("farm_desert");
   public static final aew<dyz> q = a("outpost_rot");
   public static final aew<dyz> r = a("bottom_rampart");
   public static final aew<dyz> s = a("treasure_rooms");
   public static final aew<dyz> t = a("housing");
   public static final aew<dyz> u = a("side_wall_degradation");
   public static final aew<dyz> v = a("stable_degradation");
   public static final aew<dyz> w = a("bastion_generic_degradation");
   public static final aew<dyz> x = a("rampart_degradation");
   public static final aew<dyz> y = a("entrance_replacement");
   public static final aew<dyz> z = a("bridge");
   public static final aew<dyz> A = a("roof");
   public static final aew<dyz> B = a("high_wall");
   public static final aew<dyz> C = a("high_rampart");
   public static final aew<dyz> D = a("fossil_rot");
   public static final aew<dyz> E = a("fossil_coal");
   public static final aew<dyz> F = a("fossil_diamonds");
   public static final aew<dyz> G = a("ancient_city_start_degradation");
   public static final aew<dyz> H = a("ancient_city_generic_degradation");
   public static final aew<dyz> I = a("ancient_city_walls_degradation");
   public static final aew<dyz> J = a("trail_ruins_houses_archaeology");
   public static final aew<dyz> K = a("trail_ruins_roads_archaeology");
   public static final aew<dyz> L = a("trail_ruins_tower_top_archaeology");

   private static aew<dyz> a(String $$0) {
      return aew.a(je.aA, new aex($$0));
   }

   private static void a(ns<dyz> $$0, aew<dyz> $$1, List<dyy> $$2) {
      $$0.a($$1, new dyz($$2));
   }

   public static void a(ns<dyz> $$0) {
      hh<csv> $$1 = $$0.a(je.e);
      dyq $$2 = new dyq(new dys(csw.pr, 0.01F), dxz.b, csw.pC.n());
      dyq $$3 = new dyq(new dys(csw.pC, 0.5F), dxz.b, csw.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.m, 0.8F), dxz.b, csw.cn.n()),
                  new dyq(new dzd(apt.p), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cp), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cq), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.m, 0.07F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.cn, 0.07F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.hj, 0.07F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.U, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.n, 0.1F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.cu, 0.1F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.al, 0.02F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.eZ, 0.5F), dxz.b, csw.bs.n()),
                  new dyq[]{
                     new dyq(
                        new dyg(csw.eZ.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))),
                        dxz.b,
                        csw.hL.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))
                     ),
                     new dyq(
                        new dyg(csw.eZ.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))),
                        dxz.b,
                        csw.hL.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))
                     ),
                     new dyq(new dys(csw.cB, 0.3F), dxz.b, csw.gt.n()),
                     new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.gu.n()),
                     new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dzd(apt.p), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cp), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cq), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.r, 0.2F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.hP, 0.2F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.Y, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.as, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.hk, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.hn, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.hx, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.eZ, 0.5F), dxz.b, csw.bs.n()),
                  new dyq(
                     new dyg(csw.eZ.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))),
                     dxz.b,
                     csw.hL.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))
                  ),
                  new dyq[]{
                     new dyq(
                        new dyg(csw.eZ.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))),
                        dxz.b,
                        csw.hL.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))
                     ),
                     new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dzd(apt.p), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cp), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cq), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.oe), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.o, 0.2F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.ju, 0.4F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.af, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.ax, 0.05F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.eZ, 0.5F), dxz.b, csw.bs.n()),
                  new dyq(
                     new dyg(csw.eZ.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))),
                     dxz.b,
                     csw.hL.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))
                  ),
                  new dyq(
                     new dyg(csw.eZ.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))),
                     dxz.b,
                     csw.hL.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))
                  ),
                  new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.gt.n()),
                  new dyq[]{new dyq(new dys(csw.cB, 0.8F), dxz.b, csw.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.m, 0.8F), dxz.b, csw.cn.n()),
                  new dyq(new dzd(apt.p), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cp), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cq), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.og), dxz.b, csw.og.n().a(cti.b, Boolean.valueOf(false))),
                  new dyq(new dys(csw.m, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.V, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.eZ, 0.5F), dxz.b, csw.bs.n()),
                  new dyq(
                     new dyg(csw.eZ.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))),
                     dxz.b,
                     csw.hL.n().a(cwt.a, Boolean.valueOf(true)).a(cwt.c, Boolean.valueOf(true))
                  ),
                  new dyq(
                     new dyg(csw.eZ.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))),
                     dxz.b,
                     csw.hL.n().a(cwt.b, Boolean.valueOf(true)).a(cwt.d, Boolean.valueOf(true))
                  ),
                  new dyq(new dys(csw.cB, 0.3F), dxz.b, csw.fd.n()),
                  new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.gu.n()),
                  new dyq[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dzd(apt.p), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cp), dxz.b, csw.a.n()),
                  new dyq(new dye(csw.cq), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.jS, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.aX, 0.1F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.iA, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.nl, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.ny, 0.08F), dxz.b, csw.bs.n()),
                  new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.kD.n()),
                  new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.m, 0.1F), dxz.b, csw.cn.n())))));
      a($$0, g, ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.m, 0.2F), dxz.b, csw.cn.n())))));
      a($$0, h, ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.m, 0.7F), dxz.b, csw.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dye(csw.kE), new dye(csw.G), csw.n.n()),
                  new dyq(new dys(csw.kE, 0.1F), dxz.b, csw.i.n()),
                  new dyq(new dye(csw.i), new dye(csw.G), csw.G.n()),
                  new dyq(new dye(csw.j), new dye(csw.G), csw.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dye(csw.kE), new dye(csw.G), csw.r.n()),
                  new dyq(new dys(csw.kE, 0.2F), dxz.b, csw.i.n()),
                  new dyq(new dye(csw.i), new dye(csw.G), csw.G.n()),
                  new dyq(new dye(csw.j), new dye(csw.G), csw.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dye(csw.kE), new dye(csw.G), csw.o.n()),
                  new dyq(new dye(csw.kE), new dye(csw.dO), csw.o.n()),
                  new dyq(new dys(csw.kE, 0.2F), dxz.b, csw.i.n()),
                  new dyq(new dye(csw.i), new dye(csw.G), csw.G.n()),
                  new dyq(new dye(csw.j), new dye(csw.G), csw.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.cB, 0.3F), dxz.b, csw.gt.n()),
                  new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.gu.n()),
                  new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.gt.n()), new dyq(new dys(csw.cB, 0.8F), dxz.b, csw.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.cB, 0.3F), dxz.b, csw.fd.n()), new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.cB, 0.2F), dxz.b, csw.kD.n()), new dyq(new dys(csw.cB, 0.1F), dxz.b, csw.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dyf(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyu(ImmutableList.of(new dyq(new dys(csw.kJ, 0.75F), dxz.b, csw.px.n()), new dyq(new dys(csw.px, 0.15F), dxz.b, csw.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyu(ImmutableList.of(new dyq(new dys(csw.pw, 0.35F), dxz.b, csw.px.n()), new dyq(new dys(csw.py, 0.1F), dxz.b, csw.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyu(ImmutableList.of(new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.px.n()), new dyq(new dys(csw.pr, 1.0E-4F), dxz.b, csw.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyu(ImmutableList.of(new dyq(new dys(csw.py, 0.5F), dxz.b, csw.a.n()), new dyq(new dys(csw.ch, 0.1F), dxz.b, csw.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyu(ImmutableList.of(new dyq(new dys(csw.pw, 0.1F), dxz.b, csw.px.n()), new dyq(new dys(csw.pr, 1.0E-4F), dxz.b, csw.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.px.n()),
                  new dyq(new dys(csw.pr, 1.0E-4F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.ch, 0.3F), dxz.b, csw.px.n()),
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
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.pw, 0.4F), dxz.b, csw.px.n()),
                  new dyq(new dys(csw.pr, 0.01F), dxz.b, csw.px.n()),
                  new dyq(new dys(csw.pw, 1.0E-4F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.pr, 1.0E-4F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.ch, 0.3F), dxz.b, csw.px.n()),
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
            new dyu(ImmutableList.of(new dyq(new dys(csw.py, 0.5F), dxz.b, csw.a.n()), new dyq(new dys(csw.ch, 0.6F), dxz.b, csw.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyu(ImmutableList.of(new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.px.n()), new dyq(new dys(csw.pr, 1.0E-4F), dxz.b, csw.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.px.n()),
                  new dyq(new dys(csw.pw, 0.15F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.pw, 0.01F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.pw, 0.5F), dxz.b, csw.px.n()),
                  new dyq(new dys(csw.pw, 0.3F), dxz.b, csw.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(new dyq(new dys(csw.ch, 0.3F), dxz.b, csw.px.n()), new dyq(dxz.b, dxz.b, new dya(0.0F, 0.05F, 0, 100, hc.a.b), csw.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dyf(0.9F), new dyr(apt.bH)));
      a($$0, E, ImmutableList.of(new dyf(0.1F), new dyr(apt.bH)));
      a($$0, F, ImmutableList.of(new dyf(0.1F), new dyu(ImmutableList.of(new dyq(new dye(csw.R), dxz.b, csw.cy.n()))), new dyr(apt.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.rV, 0.3F), dxz.b, csw.sa.n()),
                  new dyq(new dys(csw.rR, 0.3F), dxz.b, csw.sb.n()),
                  new dyq(new dys(csw.of, 0.05F), dxz.b, csw.a.n())
               )
            ),
            new dyr(apt.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dyf($$1.b(apt.bN), 0.95F),
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.rV, 0.3F), dxz.b, csw.sa.n()),
                  new dyq(new dys(csw.rR, 0.3F), dxz.b, csw.sb.n()),
                  new dyq(new dys(csw.of, 0.05F), dxz.b, csw.a.n())
               )
            ),
            new dyr(apt.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dyf($$1.b(apt.bN), 0.95F),
            new dyu(
               ImmutableList.of(
                  new dyq(new dys(csw.rV, 0.3F), dxz.b, csw.sa.n()),
                  new dyq(new dys(csw.rR, 0.3F), dxz.b, csw.sb.n()),
                  new dyq(new dys(csw.rT, 0.3F), dxz.b, csw.a.n()),
                  new dyq(new dys(csw.of, 0.05F), dxz.b, csw.a.n())
               )
            ),
            new dyr(apt.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyu(
               List.of(
                  new dyq(new dys(csw.L, 0.2F), dxz.b, csw.j.n()),
                  new dyq(new dys(csw.L, 0.1F), dxz.b, csw.k.n()),
                  new dyq(new dys(csw.eN, 0.1F), dxz.b, csw.eM.n())
               )
            ),
            a(eco.aE, 6),
            a(eco.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyu(
               List.of(
                  new dyq(new dys(csw.L, 0.2F), dxz.b, csw.j.n()),
                  new dyq(new dys(csw.L, 0.1F), dxz.b, csw.k.n()),
                  new dyq(new dys(csw.eN, 0.1F), dxz.b, csw.eM.n())
               )
            ),
            a(eco.aE, 2)
         )
      );
      a($$0, L, List.of(a(eco.aE, 2)));
   }

   private static dyh a(aex $$0, int $$1) {
      return new dyh(new dyu(List.of(new dyq(new dzd(apt.cl), dxz.b, dyn.b, csw.M.n(), new dzf($$0)))), bga.a($$1));
   }
}
