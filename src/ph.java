import com.google.common.collect.ImmutableList;
import java.util.List;

public class ph {
   private static final agl<ebk> M = a("empty");
   public static final agl<ebk> a = a("zombie_plains");
   public static final agl<ebk> b = a("zombie_savanna");
   public static final agl<ebk> c = a("zombie_snowy");
   public static final agl<ebk> d = a("zombie_taiga");
   public static final agl<ebk> e = a("zombie_desert");
   public static final agl<ebk> f = a("mossify_10_percent");
   public static final agl<ebk> g = a("mossify_20_percent");
   public static final agl<ebk> h = a("mossify_70_percent");
   public static final agl<ebk> i = a("street_plains");
   public static final agl<ebk> j = a("street_savanna");
   public static final agl<ebk> k = a("street_snowy_or_taiga");
   public static final agl<ebk> l = a("farm_plains");
   public static final agl<ebk> m = a("farm_savanna");
   public static final agl<ebk> n = a("farm_snowy");
   public static final agl<ebk> o = a("farm_taiga");
   public static final agl<ebk> p = a("farm_desert");
   public static final agl<ebk> q = a("outpost_rot");
   public static final agl<ebk> r = a("bottom_rampart");
   public static final agl<ebk> s = a("treasure_rooms");
   public static final agl<ebk> t = a("housing");
   public static final agl<ebk> u = a("side_wall_degradation");
   public static final agl<ebk> v = a("stable_degradation");
   public static final agl<ebk> w = a("bastion_generic_degradation");
   public static final agl<ebk> x = a("rampart_degradation");
   public static final agl<ebk> y = a("entrance_replacement");
   public static final agl<ebk> z = a("bridge");
   public static final agl<ebk> A = a("roof");
   public static final agl<ebk> B = a("high_wall");
   public static final agl<ebk> C = a("high_rampart");
   public static final agl<ebk> D = a("fossil_rot");
   public static final agl<ebk> E = a("fossil_coal");
   public static final agl<ebk> F = a("fossil_diamonds");
   public static final agl<ebk> G = a("ancient_city_start_degradation");
   public static final agl<ebk> H = a("ancient_city_generic_degradation");
   public static final agl<ebk> I = a("ancient_city_walls_degradation");
   public static final agl<ebk> J = a("trail_ruins_houses_archaeology");
   public static final agl<ebk> K = a("trail_ruins_roads_archaeology");
   public static final agl<ebk> L = a("trail_ruins_tower_top_archaeology");

   private static agl<ebk> a(String $$0) {
      return agl.a(kd.aC, new agm($$0));
   }

   private static void a(oz<ebk> $$0, agl<ebk> $$1, List<ebj> $$2) {
      $$0.a($$1, new ebk($$2));
   }

   public static void a(oz<ebk> $$0) {
      ih<cvf> $$1 = $$0.a(kd.e);
      ebb $$2 = new ebb(new ebd(cvh.pr, 0.01F), eak.b, cvh.pC.o());
      ebb $$3 = new ebb(new ebd(cvh.pC, 0.5F), eak.b, cvh.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.m, 0.8F), eak.b, cvh.cn.o()),
                  new ebb(new ebo(ark.p), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cp), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cq), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.m, 0.07F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.cn, 0.07F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.hj, 0.07F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.U, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.n, 0.1F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.cu, 0.1F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.al, 0.02F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.eY, 0.5F), eak.b, cvh.bs.o()),
                  new ebb[]{
                     new ebb(
                        new ear(cvh.eY.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))),
                        eak.b,
                        cvh.hL.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))
                     ),
                     new ebb(
                        new ear(cvh.eY.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))),
                        eak.b,
                        cvh.hL.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))
                     ),
                     new ebb(new ebd(cvh.cB, 0.3F), eak.b, cvh.gt.o()),
                     new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.gu.o()),
                     new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebo(ark.p), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cp), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cq), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.r, 0.2F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.hP, 0.2F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.Y, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.as, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.hk, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.hn, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.hx, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.eY, 0.5F), eak.b, cvh.bs.o()),
                  new ebb(
                     new ear(cvh.eY.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))),
                     eak.b,
                     cvh.hL.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))
                  ),
                  new ebb[]{
                     new ebb(
                        new ear(cvh.eY.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))),
                        eak.b,
                        cvh.hL.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))
                     ),
                     new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebo(ark.p), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cp), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cq), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.oe), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.o, 0.2F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.ju, 0.4F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.af, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.ax, 0.05F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.eY, 0.5F), eak.b, cvh.bs.o()),
                  new ebb(
                     new ear(cvh.eY.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))),
                     eak.b,
                     cvh.hL.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))
                  ),
                  new ebb(
                     new ear(cvh.eY.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))),
                     eak.b,
                     cvh.hL.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))
                  ),
                  new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.gt.o()),
                  new ebb[]{new ebb(new ebd(cvh.cB, 0.8F), eak.b, cvh.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.m, 0.8F), eak.b, cvh.cn.o()),
                  new ebb(new ebo(ark.p), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cp), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cq), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.og), eak.b, cvh.og.o().a(cvt.c, Boolean.valueOf(false))),
                  new ebb(new ebd(cvh.m, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.V, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.eY, 0.5F), eak.b, cvh.bs.o()),
                  new ebb(
                     new ear(cvh.eY.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))),
                     eak.b,
                     cvh.hL.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true))
                  ),
                  new ebb(
                     new ear(cvh.eY.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))),
                     eak.b,
                     cvh.hL.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true))
                  ),
                  new ebb(new ebd(cvh.cB, 0.3F), eak.b, cvh.fd.o()),
                  new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.gu.o()),
                  new ebb[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebo(ark.p), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cp), eak.b, cvh.a.o()),
                  new ebb(new eap(cvh.cq), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.jS, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.aX, 0.1F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.iA, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.nl, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.ny, 0.08F), eak.b, cvh.bs.o()),
                  new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.kD.o()),
                  new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.m, 0.1F), eak.b, cvh.cn.o())))));
      a($$0, g, ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.m, 0.2F), eak.b, cvh.cn.o())))));
      a($$0, h, ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.m, 0.7F), eak.b, cvh.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new eap(cvh.kE), new eap(cvh.G), cvh.n.o()),
                  new ebb(new ebd(cvh.kE, 0.1F), eak.b, cvh.i.o()),
                  new ebb(new eap(cvh.i), new eap(cvh.G), cvh.G.o()),
                  new ebb(new eap(cvh.j), new eap(cvh.G), cvh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new eap(cvh.kE), new eap(cvh.G), cvh.r.o()),
                  new ebb(new ebd(cvh.kE, 0.2F), eak.b, cvh.i.o()),
                  new ebb(new eap(cvh.i), new eap(cvh.G), cvh.G.o()),
                  new ebb(new eap(cvh.j), new eap(cvh.G), cvh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new eap(cvh.kE), new eap(cvh.G), cvh.o.o()),
                  new ebb(new eap(cvh.kE), new eap(cvh.dO), cvh.o.o()),
                  new ebb(new ebd(cvh.kE, 0.2F), eak.b, cvh.i.o()),
                  new ebb(new eap(cvh.i), new eap(cvh.G), cvh.G.o()),
                  new ebb(new eap(cvh.j), new eap(cvh.G), cvh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.cB, 0.3F), eak.b, cvh.gt.o()),
                  new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.gu.o()),
                  new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.gt.o()), new ebb(new ebd(cvh.cB, 0.8F), eak.b, cvh.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.cB, 0.3F), eak.b, cvh.fd.o()), new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.cB, 0.2F), eak.b, cvh.kD.o()), new ebb(new ebd(cvh.cB, 0.1F), eak.b, cvh.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eaq(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.kJ, 0.75F), eak.b, cvh.px.o()), new ebb(new ebd(cvh.px, 0.15F), eak.b, cvh.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.pw, 0.35F), eak.b, cvh.px.o()), new ebb(new ebd(cvh.py, 0.1F), eak.b, cvh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.px.o()), new ebb(new ebd(cvh.pr, 1.0E-4F), eak.b, cvh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.py, 0.5F), eak.b, cvh.a.o()), new ebb(new ebd(cvh.ch, 0.1F), eak.b, cvh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.pw, 0.1F), eak.b, cvh.px.o()), new ebb(new ebd(cvh.pr, 1.0E-4F), eak.b, cvh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.px.o()),
                  new ebb(new ebd(cvh.pr, 1.0E-4F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.ch, 0.3F), eak.b, cvh.px.o()),
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
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.pw, 0.4F), eak.b, cvh.px.o()),
                  new ebb(new ebd(cvh.pr, 0.01F), eak.b, cvh.px.o()),
                  new ebb(new ebd(cvh.pw, 1.0E-4F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.pr, 1.0E-4F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.ch, 0.3F), eak.b, cvh.px.o()),
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
            new ebf(ImmutableList.of(new ebb(new ebd(cvh.py, 0.5F), eak.b, cvh.a.o()), new ebb(new ebd(cvh.ch, 0.6F), eak.b, cvh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ebf(ImmutableList.of(new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.px.o()), new ebb(new ebd(cvh.pr, 1.0E-4F), eak.b, cvh.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.px.o()),
                  new ebb(new ebd(cvh.pw, 0.15F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.pw, 0.01F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.pw, 0.5F), eak.b, cvh.px.o()),
                  new ebb(new ebd(cvh.pw, 0.3F), eak.b, cvh.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(new ebb(new ebd(cvh.ch, 0.3F), eak.b, cvh.px.o()), new ebb(eak.b, eak.b, new eal(0.0F, 0.05F, 0, 100, ib.a.b), cvh.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eaq(0.9F), new ebc(ark.bH)));
      a($$0, E, ImmutableList.of(new eaq(0.1F), new ebc(ark.bH)));
      a($$0, F, ImmutableList.of(new eaq(0.1F), new ebf(ImmutableList.of(new ebb(new eap(cvh.R), eak.b, cvh.cy.o()))), new ebc(ark.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.sW, 0.3F), eak.b, cvh.tb.o()),
                  new ebb(new ebd(cvh.sS, 0.3F), eak.b, cvh.tc.o()),
                  new ebb(new ebd(cvh.of, 0.05F), eak.b, cvh.a.o())
               )
            ),
            new ebc(ark.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eaq($$1.b(ark.bN), 0.95F),
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.sW, 0.3F), eak.b, cvh.tb.o()),
                  new ebb(new ebd(cvh.sS, 0.3F), eak.b, cvh.tc.o()),
                  new ebb(new ebd(cvh.of, 0.05F), eak.b, cvh.a.o())
               )
            ),
            new ebc(ark.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eaq($$1.b(ark.bN), 0.95F),
            new ebf(
               ImmutableList.of(
                  new ebb(new ebd(cvh.sW, 0.3F), eak.b, cvh.tb.o()),
                  new ebb(new ebd(cvh.sS, 0.3F), eak.b, cvh.tc.o()),
                  new ebb(new ebd(cvh.sU, 0.3F), eak.b, cvh.a.o()),
                  new ebb(new ebd(cvh.of, 0.05F), eak.b, cvh.a.o())
               )
            ),
            new ebc(ark.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ebf(
               List.of(
                  new ebb(new ebd(cvh.L, 0.2F), eak.b, cvh.j.o()),
                  new ebb(new ebd(cvh.L, 0.1F), eak.b, cvh.k.o()),
                  new ebb(new ebd(cvh.eM, 0.1F), eak.b, cvh.eL.o())
               )
            ),
            a(efa.aE, 6),
            a(efa.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ebf(
               List.of(
                  new ebb(new ebd(cvh.L, 0.2F), eak.b, cvh.j.o()),
                  new ebb(new ebd(cvh.L, 0.1F), eak.b, cvh.k.o()),
                  new ebb(new ebd(cvh.eM, 0.1F), eak.b, cvh.eL.o())
               )
            ),
            a(efa.aE, 2)
         )
      );
      a($$0, L, List.of(a(efa.aE, 2)));
   }

   private static eas a(agm $$0, int $$1) {
      return new eas(new ebf(List.of(new ebb(new ebo(ark.cl), eak.b, eay.b, cvh.M.o(), new ebq($$0)))), bid.a($$1));
   }
}
