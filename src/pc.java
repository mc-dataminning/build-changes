import com.google.common.collect.ImmutableList;
import java.util.List;

public class pc {
   private static final agf<eat> M = a("empty");
   public static final agf<eat> a = a("zombie_plains");
   public static final agf<eat> b = a("zombie_savanna");
   public static final agf<eat> c = a("zombie_snowy");
   public static final agf<eat> d = a("zombie_taiga");
   public static final agf<eat> e = a("zombie_desert");
   public static final agf<eat> f = a("mossify_10_percent");
   public static final agf<eat> g = a("mossify_20_percent");
   public static final agf<eat> h = a("mossify_70_percent");
   public static final agf<eat> i = a("street_plains");
   public static final agf<eat> j = a("street_savanna");
   public static final agf<eat> k = a("street_snowy_or_taiga");
   public static final agf<eat> l = a("farm_plains");
   public static final agf<eat> m = a("farm_savanna");
   public static final agf<eat> n = a("farm_snowy");
   public static final agf<eat> o = a("farm_taiga");
   public static final agf<eat> p = a("farm_desert");
   public static final agf<eat> q = a("outpost_rot");
   public static final agf<eat> r = a("bottom_rampart");
   public static final agf<eat> s = a("treasure_rooms");
   public static final agf<eat> t = a("housing");
   public static final agf<eat> u = a("side_wall_degradation");
   public static final agf<eat> v = a("stable_degradation");
   public static final agf<eat> w = a("bastion_generic_degradation");
   public static final agf<eat> x = a("rampart_degradation");
   public static final agf<eat> y = a("entrance_replacement");
   public static final agf<eat> z = a("bridge");
   public static final agf<eat> A = a("roof");
   public static final agf<eat> B = a("high_wall");
   public static final agf<eat> C = a("high_rampart");
   public static final agf<eat> D = a("fossil_rot");
   public static final agf<eat> E = a("fossil_coal");
   public static final agf<eat> F = a("fossil_diamonds");
   public static final agf<eat> G = a("ancient_city_start_degradation");
   public static final agf<eat> H = a("ancient_city_generic_degradation");
   public static final agf<eat> I = a("ancient_city_walls_degradation");
   public static final agf<eat> J = a("trail_ruins_houses_archaeology");
   public static final agf<eat> K = a("trail_ruins_roads_archaeology");
   public static final agf<eat> L = a("trail_ruins_tower_top_archaeology");

   private static agf<eat> a(String $$0) {
      return agf.a(jz.aC, new agg($$0));
   }

   private static void a(ou<eat> $$0, agf<eat> $$1, List<eas> $$2) {
      $$0.a($$1, new eat($$2));
   }

   public static void a(ou<eat> $$0) {
      ic<cut> $$1 = $$0.a(jz.e);
      eak $$2 = new eak(new eam(cuv.pr, 0.01F), dzt.b, cuv.pC.o());
      eak $$3 = new eak(new eam(cuv.pC, 0.5F), dzt.b, cuv.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.m, 0.8F), dzt.b, cuv.cn.o()),
                  new eak(new eax(arc.p), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cp), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cq), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.m, 0.07F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.cn, 0.07F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.hj, 0.07F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.U, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.n, 0.1F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.cu, 0.1F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.al, 0.02F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.eY, 0.5F), dzt.b, cuv.bs.o()),
                  new eak[]{
                     new eak(
                        new eaa(cuv.eY.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))),
                        dzt.b,
                        cuv.hL.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))
                     ),
                     new eak(
                        new eaa(cuv.eY.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))),
                        dzt.b,
                        cuv.hL.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))
                     ),
                     new eak(new eam(cuv.cB, 0.3F), dzt.b, cuv.gt.o()),
                     new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.gu.o()),
                     new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eax(arc.p), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cp), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cq), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.r, 0.2F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.hP, 0.2F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.Y, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.as, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.hk, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.hn, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.hx, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.eY, 0.5F), dzt.b, cuv.bs.o()),
                  new eak(
                     new eaa(cuv.eY.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))),
                     dzt.b,
                     cuv.hL.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))
                  ),
                  new eak[]{
                     new eak(
                        new eaa(cuv.eY.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))),
                        dzt.b,
                        cuv.hL.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))
                     ),
                     new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eax(arc.p), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cp), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cq), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.oe), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.o, 0.2F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.ju, 0.4F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.af, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.ax, 0.05F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.eY, 0.5F), dzt.b, cuv.bs.o()),
                  new eak(
                     new eaa(cuv.eY.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))),
                     dzt.b,
                     cuv.hL.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))
                  ),
                  new eak(
                     new eaa(cuv.eY.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))),
                     dzt.b,
                     cuv.hL.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))
                  ),
                  new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.gt.o()),
                  new eak[]{new eak(new eam(cuv.cB, 0.8F), dzt.b, cuv.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.m, 0.8F), dzt.b, cuv.cn.o()),
                  new eak(new eax(arc.p), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cp), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cq), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.og), dzt.b, cuv.og.o().a(cvh.c, Boolean.valueOf(false))),
                  new eak(new eam(cuv.m, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.V, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.eY, 0.5F), dzt.b, cuv.bs.o()),
                  new eak(
                     new eaa(cuv.eY.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))),
                     dzt.b,
                     cuv.hL.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true))
                  ),
                  new eak(
                     new eaa(cuv.eY.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))),
                     dzt.b,
                     cuv.hL.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true))
                  ),
                  new eak(new eam(cuv.cB, 0.3F), dzt.b, cuv.fd.o()),
                  new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.gu.o()),
                  new eak[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eax(arc.p), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cp), dzt.b, cuv.a.o()),
                  new eak(new dzy(cuv.cq), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.jS, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.aX, 0.1F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.iA, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.nl, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.ny, 0.08F), dzt.b, cuv.bs.o()),
                  new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.kD.o()),
                  new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.m, 0.1F), dzt.b, cuv.cn.o())))));
      a($$0, g, ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.m, 0.2F), dzt.b, cuv.cn.o())))));
      a($$0, h, ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.m, 0.7F), dzt.b, cuv.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new dzy(cuv.kE), new dzy(cuv.G), cuv.n.o()),
                  new eak(new eam(cuv.kE, 0.1F), dzt.b, cuv.i.o()),
                  new eak(new dzy(cuv.i), new dzy(cuv.G), cuv.G.o()),
                  new eak(new dzy(cuv.j), new dzy(cuv.G), cuv.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new dzy(cuv.kE), new dzy(cuv.G), cuv.r.o()),
                  new eak(new eam(cuv.kE, 0.2F), dzt.b, cuv.i.o()),
                  new eak(new dzy(cuv.i), new dzy(cuv.G), cuv.G.o()),
                  new eak(new dzy(cuv.j), new dzy(cuv.G), cuv.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new dzy(cuv.kE), new dzy(cuv.G), cuv.o.o()),
                  new eak(new dzy(cuv.kE), new dzy(cuv.dO), cuv.o.o()),
                  new eak(new eam(cuv.kE, 0.2F), dzt.b, cuv.i.o()),
                  new eak(new dzy(cuv.i), new dzy(cuv.G), cuv.G.o()),
                  new eak(new dzy(cuv.j), new dzy(cuv.G), cuv.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.cB, 0.3F), dzt.b, cuv.gt.o()),
                  new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.gu.o()),
                  new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.gt.o()), new eak(new eam(cuv.cB, 0.8F), dzt.b, cuv.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.cB, 0.3F), dzt.b, cuv.fd.o()), new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.cB, 0.2F), dzt.b, cuv.kD.o()), new eak(new eam(cuv.cB, 0.1F), dzt.b, cuv.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new dzz(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eao(ImmutableList.of(new eak(new eam(cuv.kJ, 0.75F), dzt.b, cuv.px.o()), new eak(new eam(cuv.px, 0.15F), dzt.b, cuv.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eao(ImmutableList.of(new eak(new eam(cuv.pw, 0.35F), dzt.b, cuv.px.o()), new eak(new eam(cuv.py, 0.1F), dzt.b, cuv.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eao(ImmutableList.of(new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.px.o()), new eak(new eam(cuv.pr, 1.0E-4F), dzt.b, cuv.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eao(ImmutableList.of(new eak(new eam(cuv.py, 0.5F), dzt.b, cuv.a.o()), new eak(new eam(cuv.ch, 0.1F), dzt.b, cuv.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eao(ImmutableList.of(new eak(new eam(cuv.pw, 0.1F), dzt.b, cuv.px.o()), new eak(new eam(cuv.pr, 1.0E-4F), dzt.b, cuv.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.px.o()),
                  new eak(new eam(cuv.pr, 1.0E-4F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.ch, 0.3F), dzt.b, cuv.px.o()),
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
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.pw, 0.4F), dzt.b, cuv.px.o()),
                  new eak(new eam(cuv.pr, 0.01F), dzt.b, cuv.px.o()),
                  new eak(new eam(cuv.pw, 1.0E-4F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.pr, 1.0E-4F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.ch, 0.3F), dzt.b, cuv.px.o()),
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
            new eao(ImmutableList.of(new eak(new eam(cuv.py, 0.5F), dzt.b, cuv.a.o()), new eak(new eam(cuv.ch, 0.6F), dzt.b, cuv.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eao(ImmutableList.of(new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.px.o()), new eak(new eam(cuv.pr, 1.0E-4F), dzt.b, cuv.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.px.o()),
                  new eak(new eam(cuv.pw, 0.15F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.pw, 0.01F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.pw, 0.5F), dzt.b, cuv.px.o()),
                  new eak(new eam(cuv.pw, 0.3F), dzt.b, cuv.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eao(
               ImmutableList.of(new eak(new eam(cuv.ch, 0.3F), dzt.b, cuv.px.o()), new eak(dzt.b, dzt.b, new dzu(0.0F, 0.05F, 0, 100, hx.a.b), cuv.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dzz(0.9F), new eal(arc.bH)));
      a($$0, E, ImmutableList.of(new dzz(0.1F), new eal(arc.bH)));
      a($$0, F, ImmutableList.of(new dzz(0.1F), new eao(ImmutableList.of(new eak(new dzy(cuv.R), dzt.b, cuv.cy.o()))), new eal(arc.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.rV, 0.3F), dzt.b, cuv.sa.o()),
                  new eak(new eam(cuv.rR, 0.3F), dzt.b, cuv.sb.o()),
                  new eak(new eam(cuv.of, 0.05F), dzt.b, cuv.a.o())
               )
            ),
            new eal(arc.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dzz($$1.b(arc.bN), 0.95F),
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.rV, 0.3F), dzt.b, cuv.sa.o()),
                  new eak(new eam(cuv.rR, 0.3F), dzt.b, cuv.sb.o()),
                  new eak(new eam(cuv.of, 0.05F), dzt.b, cuv.a.o())
               )
            ),
            new eal(arc.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dzz($$1.b(arc.bN), 0.95F),
            new eao(
               ImmutableList.of(
                  new eak(new eam(cuv.rV, 0.3F), dzt.b, cuv.sa.o()),
                  new eak(new eam(cuv.rR, 0.3F), dzt.b, cuv.sb.o()),
                  new eak(new eam(cuv.rT, 0.3F), dzt.b, cuv.a.o()),
                  new eak(new eam(cuv.of, 0.05F), dzt.b, cuv.a.o())
               )
            ),
            new eal(arc.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eao(
               List.of(
                  new eak(new eam(cuv.L, 0.2F), dzt.b, cuv.j.o()),
                  new eak(new eam(cuv.L, 0.1F), dzt.b, cuv.k.o()),
                  new eak(new eam(cuv.eM, 0.1F), dzt.b, cuv.eL.o())
               )
            ),
            a(eej.aE, 6),
            a(eej.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eao(
               List.of(
                  new eak(new eam(cuv.L, 0.2F), dzt.b, cuv.j.o()),
                  new eak(new eam(cuv.L, 0.1F), dzt.b, cuv.k.o()),
                  new eak(new eam(cuv.eM, 0.1F), dzt.b, cuv.eL.o())
               )
            ),
            a(eej.aE, 2)
         )
      );
      a($$0, L, List.of(a(eej.aE, 2)));
   }

   private static eab a(agg $$0, int $$1) {
      return new eab(new eao(List.of(new eak(new eax(arc.cl), dzt.b, eah.b, cuv.M.o(), new eaz($$0)))), bhs.a($$1));
   }
}
