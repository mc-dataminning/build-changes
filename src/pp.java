import com.google.common.collect.ImmutableList;
import java.util.List;

public class pp {
   private static final aix<efj> M = a("empty");
   public static final aix<efj> a = a("zombie_plains");
   public static final aix<efj> b = a("zombie_savanna");
   public static final aix<efj> c = a("zombie_snowy");
   public static final aix<efj> d = a("zombie_taiga");
   public static final aix<efj> e = a("zombie_desert");
   public static final aix<efj> f = a("mossify_10_percent");
   public static final aix<efj> g = a("mossify_20_percent");
   public static final aix<efj> h = a("mossify_70_percent");
   public static final aix<efj> i = a("street_plains");
   public static final aix<efj> j = a("street_savanna");
   public static final aix<efj> k = a("street_snowy_or_taiga");
   public static final aix<efj> l = a("farm_plains");
   public static final aix<efj> m = a("farm_savanna");
   public static final aix<efj> n = a("farm_snowy");
   public static final aix<efj> o = a("farm_taiga");
   public static final aix<efj> p = a("farm_desert");
   public static final aix<efj> q = a("outpost_rot");
   public static final aix<efj> r = a("bottom_rampart");
   public static final aix<efj> s = a("treasure_rooms");
   public static final aix<efj> t = a("housing");
   public static final aix<efj> u = a("side_wall_degradation");
   public static final aix<efj> v = a("stable_degradation");
   public static final aix<efj> w = a("bastion_generic_degradation");
   public static final aix<efj> x = a("rampart_degradation");
   public static final aix<efj> y = a("entrance_replacement");
   public static final aix<efj> z = a("bridge");
   public static final aix<efj> A = a("roof");
   public static final aix<efj> B = a("high_wall");
   public static final aix<efj> C = a("high_rampart");
   public static final aix<efj> D = a("fossil_rot");
   public static final aix<efj> E = a("fossil_coal");
   public static final aix<efj> F = a("fossil_diamonds");
   public static final aix<efj> G = a("ancient_city_start_degradation");
   public static final aix<efj> H = a("ancient_city_generic_degradation");
   public static final aix<efj> I = a("ancient_city_walls_degradation");
   public static final aix<efj> J = a("trail_ruins_houses_archaeology");
   public static final aix<efj> K = a("trail_ruins_roads_archaeology");
   public static final aix<efj> L = a("trail_ruins_tower_top_archaeology");

   private static aix<efj> a(String $$0) {
      return aix.a(kg.aE, new aiy($$0));
   }

   private static void a(ph<efj> $$0, aix<efj> $$1, List<efi> $$2) {
      $$0.a($$1, new efj($$2));
   }

   public static void a(ph<efj> $$0) {
      ik<cys> $$1 = $$0.a(kg.f);
      efa $$2 = new efa(new efc(cyu.pr, 0.01F), eej.b, cyu.pC.o());
      efa $$3 = new efa(new efc(cyu.pC, 0.5F), eej.b, cyu.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.m, 0.8F), eej.b, cyu.cn.o()),
                  new efa(new efn(aua.p), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cp), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cq), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.m, 0.07F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.cn, 0.07F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.hj, 0.07F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.U, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.n, 0.1F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.cu, 0.1F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.al, 0.02F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.eY, 0.5F), eej.b, cyu.bs.o()),
                  new efa[]{
                     new efa(
                        new eeq(cyu.eY.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))),
                        eej.b,
                        cyu.hL.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))
                     ),
                     new efa(
                        new eeq(cyu.eY.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))),
                        eej.b,
                        cyu.hL.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))
                     ),
                     new efa(new efc(cyu.cB, 0.3F), eej.b, cyu.gt.o()),
                     new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.gu.o()),
                     new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efn(aua.p), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cp), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cq), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.r, 0.2F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.hP, 0.2F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.Y, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.as, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.hk, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.hn, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.hx, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.eY, 0.5F), eej.b, cyu.bs.o()),
                  new efa(
                     new eeq(cyu.eY.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))),
                     eej.b,
                     cyu.hL.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))
                  ),
                  new efa[]{
                     new efa(
                        new eeq(cyu.eY.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))),
                        eej.b,
                        cyu.hL.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))
                     ),
                     new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efn(aua.p), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cp), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cq), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.oe), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.o, 0.2F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.ju, 0.4F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.af, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.ax, 0.05F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.eY, 0.5F), eej.b, cyu.bs.o()),
                  new efa(
                     new eeq(cyu.eY.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))),
                     eej.b,
                     cyu.hL.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))
                  ),
                  new efa(
                     new eeq(cyu.eY.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))),
                     eej.b,
                     cyu.hL.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))
                  ),
                  new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.gt.o()),
                  new efa[]{new efa(new efc(cyu.cB, 0.8F), eej.b, cyu.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.m, 0.8F), eej.b, cyu.cn.o()),
                  new efa(new efn(aua.p), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cp), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cq), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.og), eej.b, cyu.og.o().a(czg.c, Boolean.valueOf(false))),
                  new efa(new efc(cyu.m, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.V, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.eY, 0.5F), eej.b, cyu.bs.o()),
                  new efa(
                     new eeq(cyu.eY.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))),
                     eej.b,
                     cyu.hL.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true))
                  ),
                  new efa(
                     new eeq(cyu.eY.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))),
                     eej.b,
                     cyu.hL.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true))
                  ),
                  new efa(new efc(cyu.cB, 0.3F), eej.b, cyu.fd.o()),
                  new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.gu.o()),
                  new efa[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efn(aua.p), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cp), eej.b, cyu.a.o()),
                  new efa(new eeo(cyu.cq), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.jS, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.aX, 0.1F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.iA, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.nl, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.ny, 0.08F), eej.b, cyu.bs.o()),
                  new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.kD.o()),
                  new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.m, 0.1F), eej.b, cyu.cn.o())))));
      a($$0, g, ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.m, 0.2F), eej.b, cyu.cn.o())))));
      a($$0, h, ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.m, 0.7F), eej.b, cyu.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new eeo(cyu.kE), new eeo(cyu.G), cyu.n.o()),
                  new efa(new efc(cyu.kE, 0.1F), eej.b, cyu.i.o()),
                  new efa(new eeo(cyu.i), new eeo(cyu.G), cyu.G.o()),
                  new efa(new eeo(cyu.j), new eeo(cyu.G), cyu.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new eeo(cyu.kE), new eeo(cyu.G), cyu.r.o()),
                  new efa(new efc(cyu.kE, 0.2F), eej.b, cyu.i.o()),
                  new efa(new eeo(cyu.i), new eeo(cyu.G), cyu.G.o()),
                  new efa(new eeo(cyu.j), new eeo(cyu.G), cyu.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new eeo(cyu.kE), new eeo(cyu.G), cyu.o.o()),
                  new efa(new eeo(cyu.kE), new eeo(cyu.dO), cyu.o.o()),
                  new efa(new efc(cyu.kE, 0.2F), eej.b, cyu.i.o()),
                  new efa(new eeo(cyu.i), new eeo(cyu.G), cyu.G.o()),
                  new efa(new eeo(cyu.j), new eeo(cyu.G), cyu.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.cB, 0.3F), eej.b, cyu.gt.o()),
                  new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.gu.o()),
                  new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.gt.o()), new efa(new efc(cyu.cB, 0.8F), eej.b, cyu.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.cB, 0.3F), eej.b, cyu.fd.o()), new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.cB, 0.2F), eej.b, cyu.kD.o()), new efa(new efc(cyu.cB, 0.1F), eej.b, cyu.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eep(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new efe(ImmutableList.of(new efa(new efc(cyu.kJ, 0.75F), eej.b, cyu.px.o()), new efa(new efc(cyu.px, 0.15F), eej.b, cyu.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new efe(ImmutableList.of(new efa(new efc(cyu.pw, 0.35F), eej.b, cyu.px.o()), new efa(new efc(cyu.py, 0.1F), eej.b, cyu.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new efe(ImmutableList.of(new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.px.o()), new efa(new efc(cyu.pr, 1.0E-4F), eej.b, cyu.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new efe(ImmutableList.of(new efa(new efc(cyu.py, 0.5F), eej.b, cyu.a.o()), new efa(new efc(cyu.ch, 0.1F), eej.b, cyu.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new efe(ImmutableList.of(new efa(new efc(cyu.pw, 0.1F), eej.b, cyu.px.o()), new efa(new efc(cyu.pr, 1.0E-4F), eej.b, cyu.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.px.o()),
                  new efa(new efc(cyu.pr, 1.0E-4F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.ch, 0.3F), eej.b, cyu.px.o()),
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
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.pw, 0.4F), eej.b, cyu.px.o()),
                  new efa(new efc(cyu.pr, 0.01F), eej.b, cyu.px.o()),
                  new efa(new efc(cyu.pw, 1.0E-4F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.pr, 1.0E-4F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.ch, 0.3F), eej.b, cyu.px.o()),
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
            new efe(ImmutableList.of(new efa(new efc(cyu.py, 0.5F), eej.b, cyu.a.o()), new efa(new efc(cyu.ch, 0.6F), eej.b, cyu.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new efe(ImmutableList.of(new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.px.o()), new efa(new efc(cyu.pr, 1.0E-4F), eej.b, cyu.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.px.o()),
                  new efa(new efc(cyu.pw, 0.15F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.pw, 0.01F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.pw, 0.5F), eej.b, cyu.px.o()),
                  new efa(new efc(cyu.pw, 0.3F), eej.b, cyu.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new efe(
               ImmutableList.of(new efa(new efc(cyu.ch, 0.3F), eej.b, cyu.px.o()), new efa(eej.b, eej.b, new eek(0.0F, 0.05F, 0, 100, ie.a.b), cyu.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eep(0.9F), new efb(aua.bH)));
      a($$0, E, ImmutableList.of(new eep(0.1F), new efb(aua.bH)));
      a($$0, F, ImmutableList.of(new eep(0.1F), new efe(ImmutableList.of(new efa(new eeo(cyu.R), eej.b, cyu.cy.o()))), new efb(aua.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.sW, 0.3F), eej.b, cyu.tb.o()),
                  new efa(new efc(cyu.sS, 0.3F), eej.b, cyu.tc.o()),
                  new efa(new efc(cyu.of, 0.05F), eej.b, cyu.a.o())
               )
            ),
            new efb(aua.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eep($$1.b(aua.bN), 0.95F),
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.sW, 0.3F), eej.b, cyu.tb.o()),
                  new efa(new efc(cyu.sS, 0.3F), eej.b, cyu.tc.o()),
                  new efa(new efc(cyu.of, 0.05F), eej.b, cyu.a.o())
               )
            ),
            new efb(aua.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eep($$1.b(aua.bN), 0.95F),
            new efe(
               ImmutableList.of(
                  new efa(new efc(cyu.sW, 0.3F), eej.b, cyu.tb.o()),
                  new efa(new efc(cyu.sS, 0.3F), eej.b, cyu.tc.o()),
                  new efa(new efc(cyu.sU, 0.3F), eej.b, cyu.a.o()),
                  new efa(new efc(cyu.of, 0.05F), eej.b, cyu.a.o())
               )
            ),
            new efb(aua.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new efe(
               List.of(
                  new efa(new efc(cyu.L, 0.2F), eej.b, cyu.j.o()),
                  new efa(new efc(cyu.L, 0.1F), eej.b, cyu.k.o()),
                  new efa(new efc(cyu.eM, 0.1F), eej.b, cyu.eL.o())
               )
            ),
            a(eja.aQ, 6),
            a(eja.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new efe(
               List.of(
                  new efa(new efc(cyu.L, 0.2F), eej.b, cyu.j.o()),
                  new efa(new efc(cyu.L, 0.1F), eej.b, cyu.k.o()),
                  new efa(new efc(cyu.eM, 0.1F), eej.b, cyu.eL.o())
               )
            ),
            a(eja.aQ, 2)
         )
      );
      a($$0, L, List.of(a(eja.aQ, 2)));
   }

   private static eer a(aiy $$0, int $$1) {
      return new eer(new efe(List.of(new efa(new efn(aua.cm), eej.b, eex.b, cyu.M.o(), new efp($$0)))), bky.a($$1));
   }
}
