import com.google.common.collect.ImmutableList;
import java.util.List;

public class pm {
   private static final ahf<ede> M = a("empty");
   public static final ahf<ede> a = a("zombie_plains");
   public static final ahf<ede> b = a("zombie_savanna");
   public static final ahf<ede> c = a("zombie_snowy");
   public static final ahf<ede> d = a("zombie_taiga");
   public static final ahf<ede> e = a("zombie_desert");
   public static final ahf<ede> f = a("mossify_10_percent");
   public static final ahf<ede> g = a("mossify_20_percent");
   public static final ahf<ede> h = a("mossify_70_percent");
   public static final ahf<ede> i = a("street_plains");
   public static final ahf<ede> j = a("street_savanna");
   public static final ahf<ede> k = a("street_snowy_or_taiga");
   public static final ahf<ede> l = a("farm_plains");
   public static final ahf<ede> m = a("farm_savanna");
   public static final ahf<ede> n = a("farm_snowy");
   public static final ahf<ede> o = a("farm_taiga");
   public static final ahf<ede> p = a("farm_desert");
   public static final ahf<ede> q = a("outpost_rot");
   public static final ahf<ede> r = a("bottom_rampart");
   public static final ahf<ede> s = a("treasure_rooms");
   public static final ahf<ede> t = a("housing");
   public static final ahf<ede> u = a("side_wall_degradation");
   public static final ahf<ede> v = a("stable_degradation");
   public static final ahf<ede> w = a("bastion_generic_degradation");
   public static final ahf<ede> x = a("rampart_degradation");
   public static final ahf<ede> y = a("entrance_replacement");
   public static final ahf<ede> z = a("bridge");
   public static final ahf<ede> A = a("roof");
   public static final ahf<ede> B = a("high_wall");
   public static final ahf<ede> C = a("high_rampart");
   public static final ahf<ede> D = a("fossil_rot");
   public static final ahf<ede> E = a("fossil_coal");
   public static final ahf<ede> F = a("fossil_diamonds");
   public static final ahf<ede> G = a("ancient_city_start_degradation");
   public static final ahf<ede> H = a("ancient_city_generic_degradation");
   public static final ahf<ede> I = a("ancient_city_walls_degradation");
   public static final ahf<ede> J = a("trail_ruins_houses_archaeology");
   public static final ahf<ede> K = a("trail_ruins_roads_archaeology");
   public static final ahf<ede> L = a("trail_ruins_tower_top_archaeology");

   private static ahf<ede> a(String $$0) {
      return ahf.a(ke.aE, new ahg($$0));
   }

   private static void a(pe<ede> $$0, ahf<ede> $$1, List<edd> $$2) {
      $$0.a($$1, new ede($$2));
   }

   public static void a(pe<ede> $$0) {
      ii<cwq> $$1 = $$0.a(ke.f);
      ecv $$2 = new ecv(new ecx(cws.pr, 0.01F), ece.b, cws.pC.o());
      ecv $$3 = new ecv(new ecx(cws.pC, 0.5F), ece.b, cws.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.m, 0.8F), ece.b, cws.cn.o()),
                  new ecv(new edi(ash.p), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cp), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cq), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.m, 0.07F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.cn, 0.07F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.hj, 0.07F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.U, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.n, 0.1F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.cu, 0.1F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.al, 0.02F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.eY, 0.5F), ece.b, cws.bs.o()),
                  new ecv[]{
                     new ecv(
                        new ecl(cws.eY.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))),
                        ece.b,
                        cws.hL.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))
                     ),
                     new ecv(
                        new ecl(cws.eY.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))),
                        ece.b,
                        cws.hL.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))
                     ),
                     new ecv(new ecx(cws.cB, 0.3F), ece.b, cws.gt.o()),
                     new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.gu.o()),
                     new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new edi(ash.p), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cp), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cq), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.r, 0.2F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.hP, 0.2F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.Y, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.as, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.hk, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.hn, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.hx, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.eY, 0.5F), ece.b, cws.bs.o()),
                  new ecv(
                     new ecl(cws.eY.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))),
                     ece.b,
                     cws.hL.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))
                  ),
                  new ecv[]{
                     new ecv(
                        new ecl(cws.eY.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))),
                        ece.b,
                        cws.hL.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))
                     ),
                     new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new edi(ash.p), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cp), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cq), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.oe), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.o, 0.2F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.ju, 0.4F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.af, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.ax, 0.05F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.eY, 0.5F), ece.b, cws.bs.o()),
                  new ecv(
                     new ecl(cws.eY.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))),
                     ece.b,
                     cws.hL.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))
                  ),
                  new ecv(
                     new ecl(cws.eY.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))),
                     ece.b,
                     cws.hL.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))
                  ),
                  new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.gt.o()),
                  new ecv[]{new ecv(new ecx(cws.cB, 0.8F), ece.b, cws.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.m, 0.8F), ece.b, cws.cn.o()),
                  new ecv(new edi(ash.p), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cp), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cq), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.og), ece.b, cws.og.o().a(cxe.c, Boolean.valueOf(false))),
                  new ecv(new ecx(cws.m, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.V, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.eY, 0.5F), ece.b, cws.bs.o()),
                  new ecv(
                     new ecl(cws.eY.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))),
                     ece.b,
                     cws.hL.o().a(daq.a, Boolean.valueOf(true)).a(daq.c, Boolean.valueOf(true))
                  ),
                  new ecv(
                     new ecl(cws.eY.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))),
                     ece.b,
                     cws.hL.o().a(daq.b, Boolean.valueOf(true)).a(daq.d, Boolean.valueOf(true))
                  ),
                  new ecv(new ecx(cws.cB, 0.3F), ece.b, cws.fd.o()),
                  new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.gu.o()),
                  new ecv[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new edi(ash.p), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cp), ece.b, cws.a.o()),
                  new ecv(new ecj(cws.cq), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.jS, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.aX, 0.1F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.iA, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.nl, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.ny, 0.08F), ece.b, cws.bs.o()),
                  new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.kD.o()),
                  new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.m, 0.1F), ece.b, cws.cn.o())))));
      a($$0, g, ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.m, 0.2F), ece.b, cws.cn.o())))));
      a($$0, h, ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.m, 0.7F), ece.b, cws.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecj(cws.kE), new ecj(cws.G), cws.n.o()),
                  new ecv(new ecx(cws.kE, 0.1F), ece.b, cws.i.o()),
                  new ecv(new ecj(cws.i), new ecj(cws.G), cws.G.o()),
                  new ecv(new ecj(cws.j), new ecj(cws.G), cws.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecj(cws.kE), new ecj(cws.G), cws.r.o()),
                  new ecv(new ecx(cws.kE, 0.2F), ece.b, cws.i.o()),
                  new ecv(new ecj(cws.i), new ecj(cws.G), cws.G.o()),
                  new ecv(new ecj(cws.j), new ecj(cws.G), cws.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecj(cws.kE), new ecj(cws.G), cws.o.o()),
                  new ecv(new ecj(cws.kE), new ecj(cws.dO), cws.o.o()),
                  new ecv(new ecx(cws.kE, 0.2F), ece.b, cws.i.o()),
                  new ecv(new ecj(cws.i), new ecj(cws.G), cws.G.o()),
                  new ecv(new ecj(cws.j), new ecj(cws.G), cws.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.cB, 0.3F), ece.b, cws.gt.o()),
                  new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.gu.o()),
                  new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.gt.o()), new ecv(new ecx(cws.cB, 0.8F), ece.b, cws.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.cB, 0.3F), ece.b, cws.fd.o()), new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.cB, 0.2F), ece.b, cws.kD.o()), new ecv(new ecx(cws.cB, 0.1F), ece.b, cws.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eck(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ecz(ImmutableList.of(new ecv(new ecx(cws.kJ, 0.75F), ece.b, cws.px.o()), new ecv(new ecx(cws.px, 0.15F), ece.b, cws.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ecz(ImmutableList.of(new ecv(new ecx(cws.pw, 0.35F), ece.b, cws.px.o()), new ecv(new ecx(cws.py, 0.1F), ece.b, cws.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ecz(ImmutableList.of(new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.px.o()), new ecv(new ecx(cws.pr, 1.0E-4F), ece.b, cws.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ecz(ImmutableList.of(new ecv(new ecx(cws.py, 0.5F), ece.b, cws.a.o()), new ecv(new ecx(cws.ch, 0.1F), ece.b, cws.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ecz(ImmutableList.of(new ecv(new ecx(cws.pw, 0.1F), ece.b, cws.px.o()), new ecv(new ecx(cws.pr, 1.0E-4F), ece.b, cws.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.px.o()),
                  new ecv(new ecx(cws.pr, 1.0E-4F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.ch, 0.3F), ece.b, cws.px.o()),
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
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.pw, 0.4F), ece.b, cws.px.o()),
                  new ecv(new ecx(cws.pr, 0.01F), ece.b, cws.px.o()),
                  new ecv(new ecx(cws.pw, 1.0E-4F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.pr, 1.0E-4F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.ch, 0.3F), ece.b, cws.px.o()),
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
            new ecz(ImmutableList.of(new ecv(new ecx(cws.py, 0.5F), ece.b, cws.a.o()), new ecv(new ecx(cws.ch, 0.6F), ece.b, cws.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ecz(ImmutableList.of(new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.px.o()), new ecv(new ecx(cws.pr, 1.0E-4F), ece.b, cws.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.px.o()),
                  new ecv(new ecx(cws.pw, 0.15F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.pw, 0.01F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.pw, 0.5F), ece.b, cws.px.o()),
                  new ecv(new ecx(cws.pw, 0.3F), ece.b, cws.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(new ecv(new ecx(cws.ch, 0.3F), ece.b, cws.px.o()), new ecv(ece.b, ece.b, new ecf(0.0F, 0.05F, 0, 100, ic.a.b), cws.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eck(0.9F), new ecw(ash.bH)));
      a($$0, E, ImmutableList.of(new eck(0.1F), new ecw(ash.bH)));
      a($$0, F, ImmutableList.of(new eck(0.1F), new ecz(ImmutableList.of(new ecv(new ecj(cws.R), ece.b, cws.cy.o()))), new ecw(ash.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.sW, 0.3F), ece.b, cws.tb.o()),
                  new ecv(new ecx(cws.sS, 0.3F), ece.b, cws.tc.o()),
                  new ecv(new ecx(cws.of, 0.05F), ece.b, cws.a.o())
               )
            ),
            new ecw(ash.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eck($$1.b(ash.bN), 0.95F),
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.sW, 0.3F), ece.b, cws.tb.o()),
                  new ecv(new ecx(cws.sS, 0.3F), ece.b, cws.tc.o()),
                  new ecv(new ecx(cws.of, 0.05F), ece.b, cws.a.o())
               )
            ),
            new ecw(ash.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eck($$1.b(ash.bN), 0.95F),
            new ecz(
               ImmutableList.of(
                  new ecv(new ecx(cws.sW, 0.3F), ece.b, cws.tb.o()),
                  new ecv(new ecx(cws.sS, 0.3F), ece.b, cws.tc.o()),
                  new ecv(new ecx(cws.sU, 0.3F), ece.b, cws.a.o()),
                  new ecv(new ecx(cws.of, 0.05F), ece.b, cws.a.o())
               )
            ),
            new ecw(ash.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ecz(
               List.of(
                  new ecv(new ecx(cws.L, 0.2F), ece.b, cws.j.o()),
                  new ecv(new ecx(cws.L, 0.1F), ece.b, cws.k.o()),
                  new ecv(new ecx(cws.eM, 0.1F), ece.b, cws.eL.o())
               )
            ),
            a(egu.aQ, 6),
            a(egu.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ecz(
               List.of(
                  new ecv(new ecx(cws.L, 0.2F), ece.b, cws.j.o()),
                  new ecv(new ecx(cws.L, 0.1F), ece.b, cws.k.o()),
                  new ecv(new ecx(cws.eM, 0.1F), ece.b, cws.eL.o())
               )
            ),
            a(egu.aQ, 2)
         )
      );
      a($$0, L, List.of(a(egu.aQ, 2)));
   }

   private static ecm a(ahg $$0, int $$1) {
      return new ecm(new ecz(List.of(new ecv(new edi(ash.cl), ece.b, ecs.b, cws.M.o(), new edk($$0)))), bjd.a($$1));
   }
}
