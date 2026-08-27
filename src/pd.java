import com.google.common.collect.ImmutableList;
import java.util.List;

public class pd {
   private static final agh<ebf> M = a("empty");
   public static final agh<ebf> a = a("zombie_plains");
   public static final agh<ebf> b = a("zombie_savanna");
   public static final agh<ebf> c = a("zombie_snowy");
   public static final agh<ebf> d = a("zombie_taiga");
   public static final agh<ebf> e = a("zombie_desert");
   public static final agh<ebf> f = a("mossify_10_percent");
   public static final agh<ebf> g = a("mossify_20_percent");
   public static final agh<ebf> h = a("mossify_70_percent");
   public static final agh<ebf> i = a("street_plains");
   public static final agh<ebf> j = a("street_savanna");
   public static final agh<ebf> k = a("street_snowy_or_taiga");
   public static final agh<ebf> l = a("farm_plains");
   public static final agh<ebf> m = a("farm_savanna");
   public static final agh<ebf> n = a("farm_snowy");
   public static final agh<ebf> o = a("farm_taiga");
   public static final agh<ebf> p = a("farm_desert");
   public static final agh<ebf> q = a("outpost_rot");
   public static final agh<ebf> r = a("bottom_rampart");
   public static final agh<ebf> s = a("treasure_rooms");
   public static final agh<ebf> t = a("housing");
   public static final agh<ebf> u = a("side_wall_degradation");
   public static final agh<ebf> v = a("stable_degradation");
   public static final agh<ebf> w = a("bastion_generic_degradation");
   public static final agh<ebf> x = a("rampart_degradation");
   public static final agh<ebf> y = a("entrance_replacement");
   public static final agh<ebf> z = a("bridge");
   public static final agh<ebf> A = a("roof");
   public static final agh<ebf> B = a("high_wall");
   public static final agh<ebf> C = a("high_rampart");
   public static final agh<ebf> D = a("fossil_rot");
   public static final agh<ebf> E = a("fossil_coal");
   public static final agh<ebf> F = a("fossil_diamonds");
   public static final agh<ebf> G = a("ancient_city_start_degradation");
   public static final agh<ebf> H = a("ancient_city_generic_degradation");
   public static final agh<ebf> I = a("ancient_city_walls_degradation");
   public static final agh<ebf> J = a("trail_ruins_houses_archaeology");
   public static final agh<ebf> K = a("trail_ruins_roads_archaeology");
   public static final agh<ebf> L = a("trail_ruins_tower_top_archaeology");

   private static agh<ebf> a(String $$0) {
      return agh.a(jz.aC, new agi($$0));
   }

   private static void a(ov<ebf> $$0, agh<ebf> $$1, List<ebe> $$2) {
      $$0.a($$1, new ebf($$2));
   }

   public static void a(ov<ebf> $$0) {
      ic<cva> $$1 = $$0.a(jz.e);
      eaw $$2 = new eaw(new eay(cvc.pr, 0.01F), eaf.b, cvc.pC.o());
      eaw $$3 = new eaw(new eay(cvc.pC, 0.5F), eaf.b, cvc.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.m, 0.8F), eaf.b, cvc.cn.o()),
                  new eaw(new ebj(arg.p), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cp), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cq), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.m, 0.07F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.cn, 0.07F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.hj, 0.07F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.U, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.n, 0.1F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.cu, 0.1F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.al, 0.02F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.eY, 0.5F), eaf.b, cvc.bs.o()),
                  new eaw[]{
                     new eaw(
                        new eam(cvc.eY.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))),
                        eaf.b,
                        cvc.hL.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))
                     ),
                     new eaw(
                        new eam(cvc.eY.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))),
                        eaf.b,
                        cvc.hL.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))
                     ),
                     new eaw(new eay(cvc.cB, 0.3F), eaf.b, cvc.gt.o()),
                     new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.gu.o()),
                     new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new ebj(arg.p), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cp), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cq), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.r, 0.2F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.hP, 0.2F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.Y, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.as, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.hk, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.hn, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.hx, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.eY, 0.5F), eaf.b, cvc.bs.o()),
                  new eaw(
                     new eam(cvc.eY.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))),
                     eaf.b,
                     cvc.hL.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))
                  ),
                  new eaw[]{
                     new eaw(
                        new eam(cvc.eY.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))),
                        eaf.b,
                        cvc.hL.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))
                     ),
                     new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new ebj(arg.p), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cp), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cq), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.oe), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.o, 0.2F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.ju, 0.4F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.af, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.ax, 0.05F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.eY, 0.5F), eaf.b, cvc.bs.o()),
                  new eaw(
                     new eam(cvc.eY.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))),
                     eaf.b,
                     cvc.hL.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))
                  ),
                  new eaw(
                     new eam(cvc.eY.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))),
                     eaf.b,
                     cvc.hL.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))
                  ),
                  new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.gt.o()),
                  new eaw[]{new eaw(new eay(cvc.cB, 0.8F), eaf.b, cvc.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.m, 0.8F), eaf.b, cvc.cn.o()),
                  new eaw(new ebj(arg.p), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cp), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cq), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.og), eaf.b, cvc.og.o().a(cvo.c, Boolean.valueOf(false))),
                  new eaw(new eay(cvc.m, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.V, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.eY, 0.5F), eaf.b, cvc.bs.o()),
                  new eaw(
                     new eam(cvc.eY.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))),
                     eaf.b,
                     cvc.hL.o().a(cza.a, Boolean.valueOf(true)).a(cza.c, Boolean.valueOf(true))
                  ),
                  new eaw(
                     new eam(cvc.eY.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))),
                     eaf.b,
                     cvc.hL.o().a(cza.b, Boolean.valueOf(true)).a(cza.d, Boolean.valueOf(true))
                  ),
                  new eaw(new eay(cvc.cB, 0.3F), eaf.b, cvc.fd.o()),
                  new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.gu.o()),
                  new eaw[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new ebj(arg.p), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cp), eaf.b, cvc.a.o()),
                  new eaw(new eak(cvc.cq), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.jS, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.aX, 0.1F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.iA, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.nl, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.ny, 0.08F), eaf.b, cvc.bs.o()),
                  new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.kD.o()),
                  new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.m, 0.1F), eaf.b, cvc.cn.o())))));
      a($$0, g, ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.m, 0.2F), eaf.b, cvc.cn.o())))));
      a($$0, h, ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.m, 0.7F), eaf.b, cvc.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eak(cvc.kE), new eak(cvc.G), cvc.n.o()),
                  new eaw(new eay(cvc.kE, 0.1F), eaf.b, cvc.i.o()),
                  new eaw(new eak(cvc.i), new eak(cvc.G), cvc.G.o()),
                  new eaw(new eak(cvc.j), new eak(cvc.G), cvc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eak(cvc.kE), new eak(cvc.G), cvc.r.o()),
                  new eaw(new eay(cvc.kE, 0.2F), eaf.b, cvc.i.o()),
                  new eaw(new eak(cvc.i), new eak(cvc.G), cvc.G.o()),
                  new eaw(new eak(cvc.j), new eak(cvc.G), cvc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eak(cvc.kE), new eak(cvc.G), cvc.o.o()),
                  new eaw(new eak(cvc.kE), new eak(cvc.dO), cvc.o.o()),
                  new eaw(new eay(cvc.kE, 0.2F), eaf.b, cvc.i.o()),
                  new eaw(new eak(cvc.i), new eak(cvc.G), cvc.G.o()),
                  new eaw(new eak(cvc.j), new eak(cvc.G), cvc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.cB, 0.3F), eaf.b, cvc.gt.o()),
                  new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.gu.o()),
                  new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.gt.o()), new eaw(new eay(cvc.cB, 0.8F), eaf.b, cvc.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.cB, 0.3F), eaf.b, cvc.fd.o()), new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.cB, 0.2F), eaf.b, cvc.kD.o()), new eaw(new eay(cvc.cB, 0.1F), eaf.b, cvc.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eal(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eba(ImmutableList.of(new eaw(new eay(cvc.kJ, 0.75F), eaf.b, cvc.px.o()), new eaw(new eay(cvc.px, 0.15F), eaf.b, cvc.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eba(ImmutableList.of(new eaw(new eay(cvc.pw, 0.35F), eaf.b, cvc.px.o()), new eaw(new eay(cvc.py, 0.1F), eaf.b, cvc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eba(ImmutableList.of(new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.px.o()), new eaw(new eay(cvc.pr, 1.0E-4F), eaf.b, cvc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eba(ImmutableList.of(new eaw(new eay(cvc.py, 0.5F), eaf.b, cvc.a.o()), new eaw(new eay(cvc.ch, 0.1F), eaf.b, cvc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eba(ImmutableList.of(new eaw(new eay(cvc.pw, 0.1F), eaf.b, cvc.px.o()), new eaw(new eay(cvc.pr, 1.0E-4F), eaf.b, cvc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.px.o()),
                  new eaw(new eay(cvc.pr, 1.0E-4F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.ch, 0.3F), eaf.b, cvc.px.o()),
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
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.pw, 0.4F), eaf.b, cvc.px.o()),
                  new eaw(new eay(cvc.pr, 0.01F), eaf.b, cvc.px.o()),
                  new eaw(new eay(cvc.pw, 1.0E-4F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.pr, 1.0E-4F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.ch, 0.3F), eaf.b, cvc.px.o()),
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
            new eba(ImmutableList.of(new eaw(new eay(cvc.py, 0.5F), eaf.b, cvc.a.o()), new eaw(new eay(cvc.ch, 0.6F), eaf.b, cvc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eba(ImmutableList.of(new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.px.o()), new eaw(new eay(cvc.pr, 1.0E-4F), eaf.b, cvc.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.px.o()),
                  new eaw(new eay(cvc.pw, 0.15F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.pw, 0.01F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.pw, 0.5F), eaf.b, cvc.px.o()),
                  new eaw(new eay(cvc.pw, 0.3F), eaf.b, cvc.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eba(
               ImmutableList.of(new eaw(new eay(cvc.ch, 0.3F), eaf.b, cvc.px.o()), new eaw(eaf.b, eaf.b, new eag(0.0F, 0.05F, 0, 100, hx.a.b), cvc.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eal(0.9F), new eax(arg.bH)));
      a($$0, E, ImmutableList.of(new eal(0.1F), new eax(arg.bH)));
      a($$0, F, ImmutableList.of(new eal(0.1F), new eba(ImmutableList.of(new eaw(new eak(cvc.R), eaf.b, cvc.cy.o()))), new eax(arg.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.sW, 0.3F), eaf.b, cvc.tb.o()),
                  new eaw(new eay(cvc.sS, 0.3F), eaf.b, cvc.tc.o()),
                  new eaw(new eay(cvc.of, 0.05F), eaf.b, cvc.a.o())
               )
            ),
            new eax(arg.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eal($$1.b(arg.bN), 0.95F),
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.sW, 0.3F), eaf.b, cvc.tb.o()),
                  new eaw(new eay(cvc.sS, 0.3F), eaf.b, cvc.tc.o()),
                  new eaw(new eay(cvc.of, 0.05F), eaf.b, cvc.a.o())
               )
            ),
            new eax(arg.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eal($$1.b(arg.bN), 0.95F),
            new eba(
               ImmutableList.of(
                  new eaw(new eay(cvc.sW, 0.3F), eaf.b, cvc.tb.o()),
                  new eaw(new eay(cvc.sS, 0.3F), eaf.b, cvc.tc.o()),
                  new eaw(new eay(cvc.sU, 0.3F), eaf.b, cvc.a.o()),
                  new eaw(new eay(cvc.of, 0.05F), eaf.b, cvc.a.o())
               )
            ),
            new eax(arg.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eba(
               List.of(
                  new eaw(new eay(cvc.L, 0.2F), eaf.b, cvc.j.o()),
                  new eaw(new eay(cvc.L, 0.1F), eaf.b, cvc.k.o()),
                  new eaw(new eay(cvc.eM, 0.1F), eaf.b, cvc.eL.o())
               )
            ),
            a(eev.aE, 6),
            a(eev.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eba(
               List.of(
                  new eaw(new eay(cvc.L, 0.2F), eaf.b, cvc.j.o()),
                  new eaw(new eay(cvc.L, 0.1F), eaf.b, cvc.k.o()),
                  new eaw(new eay(cvc.eM, 0.1F), eaf.b, cvc.eL.o())
               )
            ),
            a(eev.aE, 2)
         )
      );
      a($$0, L, List.of(a(eev.aE, 2)));
   }

   private static ean a(agi $$0, int $$1) {
      return new ean(new eba(List.of(new eaw(new ebj(arg.cl), eaf.b, eat.b, cvc.M.o(), new ebl($$0)))), bhz.a($$1));
   }
}
