import com.google.common.collect.ImmutableList;
import java.util.List;

public class pp {
   private static final aix<efc> M = a("empty");
   public static final aix<efc> a = a("zombie_plains");
   public static final aix<efc> b = a("zombie_savanna");
   public static final aix<efc> c = a("zombie_snowy");
   public static final aix<efc> d = a("zombie_taiga");
   public static final aix<efc> e = a("zombie_desert");
   public static final aix<efc> f = a("mossify_10_percent");
   public static final aix<efc> g = a("mossify_20_percent");
   public static final aix<efc> h = a("mossify_70_percent");
   public static final aix<efc> i = a("street_plains");
   public static final aix<efc> j = a("street_savanna");
   public static final aix<efc> k = a("street_snowy_or_taiga");
   public static final aix<efc> l = a("farm_plains");
   public static final aix<efc> m = a("farm_savanna");
   public static final aix<efc> n = a("farm_snowy");
   public static final aix<efc> o = a("farm_taiga");
   public static final aix<efc> p = a("farm_desert");
   public static final aix<efc> q = a("outpost_rot");
   public static final aix<efc> r = a("bottom_rampart");
   public static final aix<efc> s = a("treasure_rooms");
   public static final aix<efc> t = a("housing");
   public static final aix<efc> u = a("side_wall_degradation");
   public static final aix<efc> v = a("stable_degradation");
   public static final aix<efc> w = a("bastion_generic_degradation");
   public static final aix<efc> x = a("rampart_degradation");
   public static final aix<efc> y = a("entrance_replacement");
   public static final aix<efc> z = a("bridge");
   public static final aix<efc> A = a("roof");
   public static final aix<efc> B = a("high_wall");
   public static final aix<efc> C = a("high_rampart");
   public static final aix<efc> D = a("fossil_rot");
   public static final aix<efc> E = a("fossil_coal");
   public static final aix<efc> F = a("fossil_diamonds");
   public static final aix<efc> G = a("ancient_city_start_degradation");
   public static final aix<efc> H = a("ancient_city_generic_degradation");
   public static final aix<efc> I = a("ancient_city_walls_degradation");
   public static final aix<efc> J = a("trail_ruins_houses_archaeology");
   public static final aix<efc> K = a("trail_ruins_roads_archaeology");
   public static final aix<efc> L = a("trail_ruins_tower_top_archaeology");

   private static aix<efc> a(String $$0) {
      return aix.a(kg.aE, new aiy($$0));
   }

   private static void a(ph<efc> $$0, aix<efc> $$1, List<efb> $$2) {
      $$0.a($$1, new efc($$2));
   }

   public static void a(ph<efc> $$0) {
      ik<cyo> $$1 = $$0.a(kg.f);
      eet $$2 = new eet(new eev(cyq.pr, 0.01F), eec.b, cyq.pC.o());
      eet $$3 = new eet(new eev(cyq.pC, 0.5F), eec.b, cyq.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.m, 0.8F), eec.b, cyq.cn.o()),
                  new eet(new efg(atz.p), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cp), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cq), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.m, 0.07F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.cn, 0.07F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.hj, 0.07F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.U, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.n, 0.1F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.cu, 0.1F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.al, 0.02F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.eY, 0.5F), eec.b, cyq.bs.o()),
                  new eet[]{
                     new eet(
                        new eej(cyq.eY.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))),
                        eec.b,
                        cyq.hL.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))
                     ),
                     new eet(
                        new eej(cyq.eY.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))),
                        eec.b,
                        cyq.hL.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))
                     ),
                     new eet(new eev(cyq.cB, 0.3F), eec.b, cyq.gt.o()),
                     new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.gu.o()),
                     new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new efg(atz.p), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cp), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cq), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.r, 0.2F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.hP, 0.2F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.Y, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.as, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.hk, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.hn, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.hx, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.eY, 0.5F), eec.b, cyq.bs.o()),
                  new eet(
                     new eej(cyq.eY.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))),
                     eec.b,
                     cyq.hL.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))
                  ),
                  new eet[]{
                     new eet(
                        new eej(cyq.eY.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))),
                        eec.b,
                        cyq.hL.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))
                     ),
                     new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new efg(atz.p), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cp), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cq), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.oe), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.o, 0.2F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.ju, 0.4F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.af, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.ax, 0.05F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.eY, 0.5F), eec.b, cyq.bs.o()),
                  new eet(
                     new eej(cyq.eY.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))),
                     eec.b,
                     cyq.hL.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))
                  ),
                  new eet(
                     new eej(cyq.eY.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))),
                     eec.b,
                     cyq.hL.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))
                  ),
                  new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.gt.o()),
                  new eet[]{new eet(new eev(cyq.cB, 0.8F), eec.b, cyq.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.m, 0.8F), eec.b, cyq.cn.o()),
                  new eet(new efg(atz.p), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cp), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cq), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.og), eec.b, cyq.og.o().a(czc.c, Boolean.valueOf(false))),
                  new eet(new eev(cyq.m, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.V, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.eY, 0.5F), eec.b, cyq.bs.o()),
                  new eet(
                     new eej(cyq.eY.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))),
                     eec.b,
                     cyq.hL.o().a(dco.a, Boolean.valueOf(true)).a(dco.c, Boolean.valueOf(true))
                  ),
                  new eet(
                     new eej(cyq.eY.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))),
                     eec.b,
                     cyq.hL.o().a(dco.b, Boolean.valueOf(true)).a(dco.d, Boolean.valueOf(true))
                  ),
                  new eet(new eev(cyq.cB, 0.3F), eec.b, cyq.fd.o()),
                  new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.gu.o()),
                  new eet[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new efg(atz.p), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cp), eec.b, cyq.a.o()),
                  new eet(new eeh(cyq.cq), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.jS, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.aX, 0.1F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.iA, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.nl, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.ny, 0.08F), eec.b, cyq.bs.o()),
                  new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.kD.o()),
                  new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.m, 0.1F), eec.b, cyq.cn.o())))));
      a($$0, g, ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.m, 0.2F), eec.b, cyq.cn.o())))));
      a($$0, h, ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.m, 0.7F), eec.b, cyq.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eeh(cyq.kE), new eeh(cyq.G), cyq.n.o()),
                  new eet(new eev(cyq.kE, 0.1F), eec.b, cyq.i.o()),
                  new eet(new eeh(cyq.i), new eeh(cyq.G), cyq.G.o()),
                  new eet(new eeh(cyq.j), new eeh(cyq.G), cyq.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eeh(cyq.kE), new eeh(cyq.G), cyq.r.o()),
                  new eet(new eev(cyq.kE, 0.2F), eec.b, cyq.i.o()),
                  new eet(new eeh(cyq.i), new eeh(cyq.G), cyq.G.o()),
                  new eet(new eeh(cyq.j), new eeh(cyq.G), cyq.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eeh(cyq.kE), new eeh(cyq.G), cyq.o.o()),
                  new eet(new eeh(cyq.kE), new eeh(cyq.dO), cyq.o.o()),
                  new eet(new eev(cyq.kE, 0.2F), eec.b, cyq.i.o()),
                  new eet(new eeh(cyq.i), new eeh(cyq.G), cyq.G.o()),
                  new eet(new eeh(cyq.j), new eeh(cyq.G), cyq.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.cB, 0.3F), eec.b, cyq.gt.o()),
                  new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.gu.o()),
                  new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.gt.o()), new eet(new eev(cyq.cB, 0.8F), eec.b, cyq.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.cB, 0.3F), eec.b, cyq.fd.o()), new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.cB, 0.2F), eec.b, cyq.kD.o()), new eet(new eev(cyq.cB, 0.1F), eec.b, cyq.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eei(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eex(ImmutableList.of(new eet(new eev(cyq.kJ, 0.75F), eec.b, cyq.px.o()), new eet(new eev(cyq.px, 0.15F), eec.b, cyq.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eex(ImmutableList.of(new eet(new eev(cyq.pw, 0.35F), eec.b, cyq.px.o()), new eet(new eev(cyq.py, 0.1F), eec.b, cyq.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eex(ImmutableList.of(new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.px.o()), new eet(new eev(cyq.pr, 1.0E-4F), eec.b, cyq.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eex(ImmutableList.of(new eet(new eev(cyq.py, 0.5F), eec.b, cyq.a.o()), new eet(new eev(cyq.ch, 0.1F), eec.b, cyq.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eex(ImmutableList.of(new eet(new eev(cyq.pw, 0.1F), eec.b, cyq.px.o()), new eet(new eev(cyq.pr, 1.0E-4F), eec.b, cyq.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.px.o()),
                  new eet(new eev(cyq.pr, 1.0E-4F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.ch, 0.3F), eec.b, cyq.px.o()),
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
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.pw, 0.4F), eec.b, cyq.px.o()),
                  new eet(new eev(cyq.pr, 0.01F), eec.b, cyq.px.o()),
                  new eet(new eev(cyq.pw, 1.0E-4F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.pr, 1.0E-4F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.ch, 0.3F), eec.b, cyq.px.o()),
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
            new eex(ImmutableList.of(new eet(new eev(cyq.py, 0.5F), eec.b, cyq.a.o()), new eet(new eev(cyq.ch, 0.6F), eec.b, cyq.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eex(ImmutableList.of(new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.px.o()), new eet(new eev(cyq.pr, 1.0E-4F), eec.b, cyq.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.px.o()),
                  new eet(new eev(cyq.pw, 0.15F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.pw, 0.01F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.pw, 0.5F), eec.b, cyq.px.o()),
                  new eet(new eev(cyq.pw, 0.3F), eec.b, cyq.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eex(
               ImmutableList.of(new eet(new eev(cyq.ch, 0.3F), eec.b, cyq.px.o()), new eet(eec.b, eec.b, new eed(0.0F, 0.05F, 0, 100, ie.a.b), cyq.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eei(0.9F), new eeu(atz.bH)));
      a($$0, E, ImmutableList.of(new eei(0.1F), new eeu(atz.bH)));
      a($$0, F, ImmutableList.of(new eei(0.1F), new eex(ImmutableList.of(new eet(new eeh(cyq.R), eec.b, cyq.cy.o()))), new eeu(atz.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.sW, 0.3F), eec.b, cyq.tb.o()),
                  new eet(new eev(cyq.sS, 0.3F), eec.b, cyq.tc.o()),
                  new eet(new eev(cyq.of, 0.05F), eec.b, cyq.a.o())
               )
            ),
            new eeu(atz.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eei($$1.b(atz.bN), 0.95F),
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.sW, 0.3F), eec.b, cyq.tb.o()),
                  new eet(new eev(cyq.sS, 0.3F), eec.b, cyq.tc.o()),
                  new eet(new eev(cyq.of, 0.05F), eec.b, cyq.a.o())
               )
            ),
            new eeu(atz.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eei($$1.b(atz.bN), 0.95F),
            new eex(
               ImmutableList.of(
                  new eet(new eev(cyq.sW, 0.3F), eec.b, cyq.tb.o()),
                  new eet(new eev(cyq.sS, 0.3F), eec.b, cyq.tc.o()),
                  new eet(new eev(cyq.sU, 0.3F), eec.b, cyq.a.o()),
                  new eet(new eev(cyq.of, 0.05F), eec.b, cyq.a.o())
               )
            ),
            new eeu(atz.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eex(
               List.of(
                  new eet(new eev(cyq.L, 0.2F), eec.b, cyq.j.o()),
                  new eet(new eev(cyq.L, 0.1F), eec.b, cyq.k.o()),
                  new eet(new eev(cyq.eM, 0.1F), eec.b, cyq.eL.o())
               )
            ),
            a(eit.aQ, 6),
            a(eit.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eex(
               List.of(
                  new eet(new eev(cyq.L, 0.2F), eec.b, cyq.j.o()),
                  new eet(new eev(cyq.L, 0.1F), eec.b, cyq.k.o()),
                  new eet(new eev(cyq.eM, 0.1F), eec.b, cyq.eL.o())
               )
            ),
            a(eit.aQ, 2)
         )
      );
      a($$0, L, List.of(a(eit.aQ, 2)));
   }

   private static eek a(aiy $$0, int $$1) {
      return new eek(new eex(List.of(new eet(new efg(atz.cm), eec.b, eeq.b, cyq.M.o(), new efi($$0)))), bkw.a($$1));
   }
}
