import com.google.common.collect.ImmutableList;
import java.util.List;

public class qh {
   private static final aju<ejo> M = a("empty");
   public static final aju<ejo> a = a("zombie_plains");
   public static final aju<ejo> b = a("zombie_savanna");
   public static final aju<ejo> c = a("zombie_snowy");
   public static final aju<ejo> d = a("zombie_taiga");
   public static final aju<ejo> e = a("zombie_desert");
   public static final aju<ejo> f = a("mossify_10_percent");
   public static final aju<ejo> g = a("mossify_20_percent");
   public static final aju<ejo> h = a("mossify_70_percent");
   public static final aju<ejo> i = a("street_plains");
   public static final aju<ejo> j = a("street_savanna");
   public static final aju<ejo> k = a("street_snowy_or_taiga");
   public static final aju<ejo> l = a("farm_plains");
   public static final aju<ejo> m = a("farm_savanna");
   public static final aju<ejo> n = a("farm_snowy");
   public static final aju<ejo> o = a("farm_taiga");
   public static final aju<ejo> p = a("farm_desert");
   public static final aju<ejo> q = a("outpost_rot");
   public static final aju<ejo> r = a("bottom_rampart");
   public static final aju<ejo> s = a("treasure_rooms");
   public static final aju<ejo> t = a("housing");
   public static final aju<ejo> u = a("side_wall_degradation");
   public static final aju<ejo> v = a("stable_degradation");
   public static final aju<ejo> w = a("bastion_generic_degradation");
   public static final aju<ejo> x = a("rampart_degradation");
   public static final aju<ejo> y = a("entrance_replacement");
   public static final aju<ejo> z = a("bridge");
   public static final aju<ejo> A = a("roof");
   public static final aju<ejo> B = a("high_wall");
   public static final aju<ejo> C = a("high_rampart");
   public static final aju<ejo> D = a("fossil_rot");
   public static final aju<ejo> E = a("fossil_coal");
   public static final aju<ejo> F = a("fossil_diamonds");
   public static final aju<ejo> G = a("ancient_city_start_degradation");
   public static final aju<ejo> H = a("ancient_city_generic_degradation");
   public static final aju<ejo> I = a("ancient_city_walls_degradation");
   public static final aju<ejo> J = a("trail_ruins_houses_archaeology");
   public static final aju<ejo> K = a("trail_ruins_roads_archaeology");
   public static final aju<ejo> L = a("trail_ruins_tower_top_archaeology");

   private static aju<ejo> a(String $$0) {
      return aju.a(ku.aH, new ajv($$0));
   }

   private static void a(pz<ejo> $$0, aju<ejo> $$1, List<ejn> $$2) {
      $$0.a($$1, new ejo($$2));
   }

   public static void a(pz<ejo> $$0) {
      io<dch> $$1 = $$0.a(ku.f);
      ejf $$2 = new ejf(new ejh(dcj.pr, 0.01F), eio.b, dcj.pC.n());
      ejf $$3 = new ejf(new ejh(dcj.pC, 0.5F), eio.b, dcj.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.m, 0.8F), eio.b, dcj.cn.n()),
                  new ejf(new ejs(ave.p), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cp), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cq), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.m, 0.07F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.cn, 0.07F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.hj, 0.07F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.U, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.n, 0.1F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.cu, 0.1F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.al, 0.02F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.eY, 0.5F), eio.b, dcj.bs.n()),
                  new ejf[]{
                     new ejf(
                        new eiv(dcj.eY.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))),
                        eio.b,
                        dcj.hL.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))
                     ),
                     new ejf(
                        new eiv(dcj.eY.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))),
                        eio.b,
                        dcj.hL.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))
                     ),
                     new ejf(new ejh(dcj.cB, 0.3F), eio.b, dcj.gt.n()),
                     new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.gu.n()),
                     new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejs(ave.p), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cp), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cq), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.r, 0.2F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.hP, 0.2F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.Y, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.as, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.hk, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.hn, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.hx, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.eY, 0.5F), eio.b, dcj.bs.n()),
                  new ejf(
                     new eiv(dcj.eY.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))),
                     eio.b,
                     dcj.hL.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))
                  ),
                  new ejf[]{
                     new ejf(
                        new eiv(dcj.eY.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))),
                        eio.b,
                        dcj.hL.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))
                     ),
                     new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejs(ave.p), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cp), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cq), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.oe), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.o, 0.2F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.ju, 0.4F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.af, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.ax, 0.05F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.eY, 0.5F), eio.b, dcj.bs.n()),
                  new ejf(
                     new eiv(dcj.eY.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))),
                     eio.b,
                     dcj.hL.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))
                  ),
                  new ejf(
                     new eiv(dcj.eY.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))),
                     eio.b,
                     dcj.hL.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))
                  ),
                  new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.gt.n()),
                  new ejf[]{new ejf(new ejh(dcj.cB, 0.8F), eio.b, dcj.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.m, 0.8F), eio.b, dcj.cn.n()),
                  new ejf(new ejs(ave.p), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cp), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cq), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.og), eio.b, dcj.og.n().a(dcv.c, Boolean.valueOf(false))),
                  new ejf(new ejh(dcj.m, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.V, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.eY, 0.5F), eio.b, dcj.bs.n()),
                  new ejf(
                     new eiv(dcj.eY.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))),
                     eio.b,
                     dcj.hL.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true))
                  ),
                  new ejf(
                     new eiv(dcj.eY.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))),
                     eio.b,
                     dcj.hL.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true))
                  ),
                  new ejf(new ejh(dcj.cB, 0.3F), eio.b, dcj.fd.n()),
                  new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.gu.n()),
                  new ejf[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejs(ave.p), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cp), eio.b, dcj.a.n()),
                  new ejf(new eit(dcj.cq), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.jS, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.aX, 0.1F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.iA, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.nl, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.ny, 0.08F), eio.b, dcj.bs.n()),
                  new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.kD.n()),
                  new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.m, 0.1F), eio.b, dcj.cn.n())))));
      a($$0, g, ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.m, 0.2F), eio.b, dcj.cn.n())))));
      a($$0, h, ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.m, 0.7F), eio.b, dcj.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new eit(dcj.kE), new eit(dcj.G), dcj.n.n()),
                  new ejf(new ejh(dcj.kE, 0.1F), eio.b, dcj.i.n()),
                  new ejf(new eit(dcj.i), new eit(dcj.G), dcj.G.n()),
                  new ejf(new eit(dcj.j), new eit(dcj.G), dcj.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new eit(dcj.kE), new eit(dcj.G), dcj.r.n()),
                  new ejf(new ejh(dcj.kE, 0.2F), eio.b, dcj.i.n()),
                  new ejf(new eit(dcj.i), new eit(dcj.G), dcj.G.n()),
                  new ejf(new eit(dcj.j), new eit(dcj.G), dcj.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new eit(dcj.kE), new eit(dcj.G), dcj.o.n()),
                  new ejf(new eit(dcj.kE), new eit(dcj.dO), dcj.o.n()),
                  new ejf(new ejh(dcj.kE, 0.2F), eio.b, dcj.i.n()),
                  new ejf(new eit(dcj.i), new eit(dcj.G), dcj.G.n()),
                  new ejf(new eit(dcj.j), new eit(dcj.G), dcj.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.cB, 0.3F), eio.b, dcj.gt.n()),
                  new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.gu.n()),
                  new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.gt.n()), new ejf(new ejh(dcj.cB, 0.8F), eio.b, dcj.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.cB, 0.3F), eio.b, dcj.fd.n()), new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.cB, 0.2F), eio.b, dcj.kD.n()), new ejf(new ejh(dcj.cB, 0.1F), eio.b, dcj.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new eiu(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.kJ, 0.75F), eio.b, dcj.px.n()), new ejf(new ejh(dcj.px, 0.15F), eio.b, dcj.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.pw, 0.35F), eio.b, dcj.px.n()), new ejf(new ejh(dcj.py, 0.1F), eio.b, dcj.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.px.n()), new ejf(new ejh(dcj.pr, 1.0E-4F), eio.b, dcj.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.py, 0.5F), eio.b, dcj.a.n()), new ejf(new ejh(dcj.ch, 0.1F), eio.b, dcj.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.pw, 0.1F), eio.b, dcj.px.n()), new ejf(new ejh(dcj.pr, 1.0E-4F), eio.b, dcj.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.px.n()),
                  new ejf(new ejh(dcj.pr, 1.0E-4F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.ch, 0.3F), eio.b, dcj.px.n()),
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
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.pw, 0.4F), eio.b, dcj.px.n()),
                  new ejf(new ejh(dcj.pr, 0.01F), eio.b, dcj.px.n()),
                  new ejf(new ejh(dcj.pw, 1.0E-4F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.pr, 1.0E-4F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.ch, 0.3F), eio.b, dcj.px.n()),
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
            new ejj(ImmutableList.of(new ejf(new ejh(dcj.py, 0.5F), eio.b, dcj.a.n()), new ejf(new ejh(dcj.ch, 0.6F), eio.b, dcj.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ejj(ImmutableList.of(new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.px.n()), new ejf(new ejh(dcj.pr, 1.0E-4F), eio.b, dcj.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.px.n()),
                  new ejf(new ejh(dcj.pw, 0.15F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.pw, 0.01F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.pw, 0.5F), eio.b, dcj.px.n()),
                  new ejf(new ejh(dcj.pw, 0.3F), eio.b, dcj.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(new ejf(new ejh(dcj.ch, 0.3F), eio.b, dcj.px.n()), new ejf(eio.b, eio.b, new eip(0.0F, 0.05F, 0, 100, ij.a.b), dcj.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eiu(0.9F), new ejg(ave.bI)));
      a($$0, E, ImmutableList.of(new eiu(0.1F), new ejg(ave.bI)));
      a($$0, F, ImmutableList.of(new eiu(0.1F), new ejj(ImmutableList.of(new ejf(new eit(dcj.R), eio.b, dcj.cy.n()))), new ejg(ave.bI)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.sW, 0.3F), eio.b, dcj.tb.n()),
                  new ejf(new ejh(dcj.sS, 0.3F), eio.b, dcj.tc.n()),
                  new ejf(new ejh(dcj.of, 0.05F), eio.b, dcj.a.n())
               )
            ),
            new ejg(ave.bI)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eiu($$1.b(ave.bO), 0.95F),
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.sW, 0.3F), eio.b, dcj.tb.n()),
                  new ejf(new ejh(dcj.sS, 0.3F), eio.b, dcj.tc.n()),
                  new ejf(new ejh(dcj.of, 0.05F), eio.b, dcj.a.n())
               )
            ),
            new ejg(ave.bI)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eiu($$1.b(ave.bO), 0.95F),
            new ejj(
               ImmutableList.of(
                  new ejf(new ejh(dcj.sW, 0.3F), eio.b, dcj.tb.n()),
                  new ejf(new ejh(dcj.sS, 0.3F), eio.b, dcj.tc.n()),
                  new ejf(new ejh(dcj.sU, 0.3F), eio.b, dcj.a.n()),
                  new ejf(new ejh(dcj.of, 0.05F), eio.b, dcj.a.n())
               )
            ),
            new ejg(ave.bI)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ejj(
               List.of(
                  new ejf(new ejh(dcj.L, 0.2F), eio.b, dcj.j.n()),
                  new ejf(new ejh(dcj.L, 0.1F), eio.b, dcj.k.n()),
                  new ejf(new ejh(dcj.eM, 0.1F), eio.b, dcj.eL.n())
               )
            ),
            a(eni.aS, 6),
            a(eni.aT, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ejj(
               List.of(
                  new ejf(new ejh(dcj.L, 0.2F), eio.b, dcj.j.n()),
                  new ejf(new ejh(dcj.L, 0.1F), eio.b, dcj.k.n()),
                  new ejf(new ejh(dcj.eM, 0.1F), eio.b, dcj.eL.n())
               )
            ),
            a(eni.aS, 2)
         )
      );
      a($$0, L, List.of(a(eni.aS, 2)));
   }

   private static eiw a(ajv $$0, int $$1) {
      return new eiw(new ejj(List.of(new ejf(new ejs(ave.cn), eio.b, ejc.b, dcj.M.n(), new eju($$0)))), bnh.a($$1));
   }
}
