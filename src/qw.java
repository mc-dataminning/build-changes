import com.google.common.collect.ImmutableList;
import java.util.List;

public class qw {
   private static final akl<elh> M = a("empty");
   public static final akl<elh> a = a("zombie_plains");
   public static final akl<elh> b = a("zombie_savanna");
   public static final akl<elh> c = a("zombie_snowy");
   public static final akl<elh> d = a("zombie_taiga");
   public static final akl<elh> e = a("zombie_desert");
   public static final akl<elh> f = a("mossify_10_percent");
   public static final akl<elh> g = a("mossify_20_percent");
   public static final akl<elh> h = a("mossify_70_percent");
   public static final akl<elh> i = a("street_plains");
   public static final akl<elh> j = a("street_savanna");
   public static final akl<elh> k = a("street_snowy_or_taiga");
   public static final akl<elh> l = a("farm_plains");
   public static final akl<elh> m = a("farm_savanna");
   public static final akl<elh> n = a("farm_snowy");
   public static final akl<elh> o = a("farm_taiga");
   public static final akl<elh> p = a("farm_desert");
   public static final akl<elh> q = a("outpost_rot");
   public static final akl<elh> r = a("bottom_rampart");
   public static final akl<elh> s = a("treasure_rooms");
   public static final akl<elh> t = a("housing");
   public static final akl<elh> u = a("side_wall_degradation");
   public static final akl<elh> v = a("stable_degradation");
   public static final akl<elh> w = a("bastion_generic_degradation");
   public static final akl<elh> x = a("rampart_degradation");
   public static final akl<elh> y = a("entrance_replacement");
   public static final akl<elh> z = a("bridge");
   public static final akl<elh> A = a("roof");
   public static final akl<elh> B = a("high_wall");
   public static final akl<elh> C = a("high_rampart");
   public static final akl<elh> D = a("fossil_rot");
   public static final akl<elh> E = a("fossil_coal");
   public static final akl<elh> F = a("fossil_diamonds");
   public static final akl<elh> G = a("ancient_city_start_degradation");
   public static final akl<elh> H = a("ancient_city_generic_degradation");
   public static final akl<elh> I = a("ancient_city_walls_degradation");
   public static final akl<elh> J = a("trail_ruins_houses_archaeology");
   public static final akl<elh> K = a("trail_ruins_roads_archaeology");
   public static final akl<elh> L = a("trail_ruins_tower_top_archaeology");

   private static akl<elh> a(String $$0) {
      return akl.a(lf.aK, new akm($$0));
   }

   private static void a(qo<elh> $$0, akl<elh> $$1, List<elg> $$2) {
      $$0.a($$1, new elh($$2));
   }

   public static void a(qo<elh> $$0) {
      iy<ddy> $$1 = $$0.a(lf.f);
      eky $$2 = new eky(new ela(dea.pr, 0.01F), ekh.b, dea.pC.n());
      eky $$3 = new eky(new ela(dea.pC, 0.5F), ekh.b, dea.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.m, 0.8F), ekh.b, dea.cn.n()),
                  new eky(new ell(avw.p), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cp), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cq), ekh.b, dea.a.n()),
                  new eky(new ela(dea.m, 0.07F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.cn, 0.07F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.hj, 0.07F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.U, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.n, 0.1F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.cu, 0.1F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.al, 0.02F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.eY, 0.5F), ekh.b, dea.bs.n()),
                  new eky[]{
                     new eky(
                        new eko(dea.eY.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))),
                        ekh.b,
                        dea.hL.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))
                     ),
                     new eky(
                        new eko(dea.eY.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))),
                        ekh.b,
                        dea.hL.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))
                     ),
                     new eky(new ela(dea.cB, 0.3F), ekh.b, dea.gt.n()),
                     new eky(new ela(dea.cB, 0.2F), ekh.b, dea.gu.n()),
                     new eky(new ela(dea.cB, 0.1F), ekh.b, dea.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ell(avw.p), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cp), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cq), ekh.b, dea.a.n()),
                  new eky(new ela(dea.r, 0.2F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.hP, 0.2F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.Y, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.as, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.hk, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.hn, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.hx, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.eY, 0.5F), ekh.b, dea.bs.n()),
                  new eky(
                     new eko(dea.eY.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))),
                     ekh.b,
                     dea.hL.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))
                  ),
                  new eky[]{
                     new eky(
                        new eko(dea.eY.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))),
                        ekh.b,
                        dea.hL.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))
                     ),
                     new eky(new ela(dea.cB, 0.1F), ekh.b, dea.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ell(avw.p), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cp), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cq), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.oe), ekh.b, dea.a.n()),
                  new eky(new ela(dea.o, 0.2F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.ju, 0.4F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.af, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.ax, 0.05F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.eY, 0.5F), ekh.b, dea.bs.n()),
                  new eky(
                     new eko(dea.eY.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))),
                     ekh.b,
                     dea.hL.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))
                  ),
                  new eky(
                     new eko(dea.eY.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))),
                     ekh.b,
                     dea.hL.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))
                  ),
                  new eky(new ela(dea.cB, 0.1F), ekh.b, dea.gt.n()),
                  new eky[]{new eky(new ela(dea.cB, 0.8F), ekh.b, dea.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.m, 0.8F), ekh.b, dea.cn.n()),
                  new eky(new ell(avw.p), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cp), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cq), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.og), ekh.b, dea.og.n().a(dem.c, Boolean.valueOf(false))),
                  new eky(new ela(dea.m, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.V, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.eY, 0.5F), ekh.b, dea.bs.n()),
                  new eky(
                     new eko(dea.eY.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))),
                     ekh.b,
                     dea.hL.n().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true))
                  ),
                  new eky(
                     new eko(dea.eY.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))),
                     ekh.b,
                     dea.hL.n().a(dhz.b, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true))
                  ),
                  new eky(new ela(dea.cB, 0.3F), ekh.b, dea.fd.n()),
                  new eky(new ela(dea.cB, 0.2F), ekh.b, dea.gu.n()),
                  new eky[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ell(avw.p), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cp), ekh.b, dea.a.n()),
                  new eky(new ekm(dea.cq), ekh.b, dea.a.n()),
                  new eky(new ela(dea.jS, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.aX, 0.1F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.iA, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.nl, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.ny, 0.08F), ekh.b, dea.bs.n()),
                  new eky(new ela(dea.cB, 0.2F), ekh.b, dea.kD.n()),
                  new eky(new ela(dea.cB, 0.1F), ekh.b, dea.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.m, 0.1F), ekh.b, dea.cn.n())))));
      a($$0, g, ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.m, 0.2F), ekh.b, dea.cn.n())))));
      a($$0, h, ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.m, 0.7F), ekh.b, dea.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ekm(dea.kE), new ekm(dea.G), dea.n.n()),
                  new eky(new ela(dea.kE, 0.1F), ekh.b, dea.i.n()),
                  new eky(new ekm(dea.i), new ekm(dea.G), dea.G.n()),
                  new eky(new ekm(dea.j), new ekm(dea.G), dea.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ekm(dea.kE), new ekm(dea.G), dea.r.n()),
                  new eky(new ela(dea.kE, 0.2F), ekh.b, dea.i.n()),
                  new eky(new ekm(dea.i), new ekm(dea.G), dea.G.n()),
                  new eky(new ekm(dea.j), new ekm(dea.G), dea.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ekm(dea.kE), new ekm(dea.G), dea.o.n()),
                  new eky(new ekm(dea.kE), new ekm(dea.dO), dea.o.n()),
                  new eky(new ela(dea.kE, 0.2F), ekh.b, dea.i.n()),
                  new eky(new ekm(dea.i), new ekm(dea.G), dea.G.n()),
                  new eky(new ekm(dea.j), new ekm(dea.G), dea.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.cB, 0.3F), ekh.b, dea.gt.n()),
                  new eky(new ela(dea.cB, 0.2F), ekh.b, dea.gu.n()),
                  new eky(new ela(dea.cB, 0.1F), ekh.b, dea.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.cB, 0.1F), ekh.b, dea.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.cB, 0.1F), ekh.b, dea.gt.n()), new eky(new ela(dea.cB, 0.8F), ekh.b, dea.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.cB, 0.3F), ekh.b, dea.fd.n()), new eky(new ela(dea.cB, 0.2F), ekh.b, dea.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.cB, 0.2F), ekh.b, dea.kD.n()), new eky(new ela(dea.cB, 0.1F), ekh.b, dea.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new ekn(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new elc(ImmutableList.of(new eky(new ela(dea.kJ, 0.75F), ekh.b, dea.px.n()), new eky(new ela(dea.px, 0.15F), ekh.b, dea.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new elc(ImmutableList.of(new eky(new ela(dea.pw, 0.35F), ekh.b, dea.px.n()), new eky(new ela(dea.py, 0.1F), ekh.b, dea.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new elc(ImmutableList.of(new eky(new ela(dea.pw, 0.3F), ekh.b, dea.px.n()), new eky(new ela(dea.pr, 1.0E-4F), ekh.b, dea.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new elc(ImmutableList.of(new eky(new ela(dea.py, 0.5F), ekh.b, dea.a.n()), new eky(new ela(dea.ch, 0.1F), ekh.b, dea.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new elc(ImmutableList.of(new eky(new ela(dea.pw, 0.1F), ekh.b, dea.px.n()), new eky(new ela(dea.pr, 1.0E-4F), ekh.b, dea.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.pw, 0.3F), ekh.b, dea.px.n()),
                  new eky(new ela(dea.pr, 1.0E-4F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.ch, 0.3F), ekh.b, dea.px.n()),
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
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.pw, 0.4F), ekh.b, dea.px.n()),
                  new eky(new ela(dea.pr, 0.01F), ekh.b, dea.px.n()),
                  new eky(new ela(dea.pw, 1.0E-4F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.pr, 1.0E-4F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.ch, 0.3F), ekh.b, dea.px.n()),
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
            new elc(ImmutableList.of(new eky(new ela(dea.py, 0.5F), ekh.b, dea.a.n()), new eky(new ela(dea.ch, 0.6F), ekh.b, dea.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new elc(ImmutableList.of(new eky(new ela(dea.pw, 0.3F), ekh.b, dea.px.n()), new eky(new ela(dea.pr, 1.0E-4F), ekh.b, dea.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.pw, 0.3F), ekh.b, dea.px.n()),
                  new eky(new ela(dea.pw, 0.15F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.pw, 0.3F), ekh.b, dea.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.pw, 0.01F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.pw, 0.5F), ekh.b, dea.px.n()),
                  new eky(new ela(dea.pw, 0.3F), ekh.b, dea.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new elc(
               ImmutableList.of(new eky(new ela(dea.ch, 0.3F), ekh.b, dea.px.n()), new eky(ekh.b, ekh.b, new eki(0.0F, 0.05F, 0, 100, it.a.b), dea.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ekn(0.9F), new ekz(avw.bO)));
      a($$0, E, ImmutableList.of(new ekn(0.1F), new ekz(avw.bO)));
      a($$0, F, ImmutableList.of(new ekn(0.1F), new elc(ImmutableList.of(new eky(new ekm(dea.R), ekh.b, dea.cy.n()))), new ekz(avw.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.sW, 0.3F), ekh.b, dea.tb.n()),
                  new eky(new ela(dea.sS, 0.3F), ekh.b, dea.tc.n()),
                  new eky(new ela(dea.of, 0.05F), ekh.b, dea.a.n())
               )
            ),
            new ekz(avw.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ekn($$1.b(avw.bU), 0.95F),
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.sW, 0.3F), ekh.b, dea.tb.n()),
                  new eky(new ela(dea.sS, 0.3F), ekh.b, dea.tc.n()),
                  new eky(new ela(dea.of, 0.05F), ekh.b, dea.a.n())
               )
            ),
            new ekz(avw.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ekn($$1.b(avw.bU), 0.95F),
            new elc(
               ImmutableList.of(
                  new eky(new ela(dea.sW, 0.3F), ekh.b, dea.tb.n()),
                  new eky(new ela(dea.sS, 0.3F), ekh.b, dea.tc.n()),
                  new eky(new ela(dea.sU, 0.3F), ekh.b, dea.a.n()),
                  new eky(new ela(dea.of, 0.05F), ekh.b, dea.a.n())
               )
            ),
            new ekz(avw.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new elc(
               List.of(
                  new eky(new ela(dea.L, 0.2F), ekh.b, dea.j.n()),
                  new eky(new ela(dea.L, 0.1F), ekh.b, dea.k.n()),
                  new eky(new ela(dea.eM, 0.1F), ekh.b, dea.eL.n())
               )
            ),
            a(epd.bd, 6),
            a(epd.be, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new elc(
               List.of(
                  new eky(new ela(dea.L, 0.2F), ekh.b, dea.j.n()),
                  new eky(new ela(dea.L, 0.1F), ekh.b, dea.k.n()),
                  new eky(new ela(dea.eM, 0.1F), ekh.b, dea.eL.n())
               )
            ),
            a(epd.bd, 2)
         )
      );
      a($$0, L, List.of(a(epd.bd, 2)));
   }

   private static ekp a(akl<epk> $$0, int $$1) {
      return new ekp(new elc(List.of(new eky(new ell(avw.ct), ekh.b, ekv.b, dea.M.n(), new eln($$0)))), bow.a($$1));
   }
}
