import com.google.common.collect.ImmutableList;
import java.util.List;

public class nx {
   private static final aet<dyu> M = a("empty");
   public static final aet<dyu> a = a("zombie_plains");
   public static final aet<dyu> b = a("zombie_savanna");
   public static final aet<dyu> c = a("zombie_snowy");
   public static final aet<dyu> d = a("zombie_taiga");
   public static final aet<dyu> e = a("zombie_desert");
   public static final aet<dyu> f = a("mossify_10_percent");
   public static final aet<dyu> g = a("mossify_20_percent");
   public static final aet<dyu> h = a("mossify_70_percent");
   public static final aet<dyu> i = a("street_plains");
   public static final aet<dyu> j = a("street_savanna");
   public static final aet<dyu> k = a("street_snowy_or_taiga");
   public static final aet<dyu> l = a("farm_plains");
   public static final aet<dyu> m = a("farm_savanna");
   public static final aet<dyu> n = a("farm_snowy");
   public static final aet<dyu> o = a("farm_taiga");
   public static final aet<dyu> p = a("farm_desert");
   public static final aet<dyu> q = a("outpost_rot");
   public static final aet<dyu> r = a("bottom_rampart");
   public static final aet<dyu> s = a("treasure_rooms");
   public static final aet<dyu> t = a("housing");
   public static final aet<dyu> u = a("side_wall_degradation");
   public static final aet<dyu> v = a("stable_degradation");
   public static final aet<dyu> w = a("bastion_generic_degradation");
   public static final aet<dyu> x = a("rampart_degradation");
   public static final aet<dyu> y = a("entrance_replacement");
   public static final aet<dyu> z = a("bridge");
   public static final aet<dyu> A = a("roof");
   public static final aet<dyu> B = a("high_wall");
   public static final aet<dyu> C = a("high_rampart");
   public static final aet<dyu> D = a("fossil_rot");
   public static final aet<dyu> E = a("fossil_coal");
   public static final aet<dyu> F = a("fossil_diamonds");
   public static final aet<dyu> G = a("ancient_city_start_degradation");
   public static final aet<dyu> H = a("ancient_city_generic_degradation");
   public static final aet<dyu> I = a("ancient_city_walls_degradation");
   public static final aet<dyu> J = a("trail_ruins_houses_archaeology");
   public static final aet<dyu> K = a("trail_ruins_roads_archaeology");
   public static final aet<dyu> L = a("trail_ruins_tower_top_archaeology");

   private static aet<dyu> a(String $$0) {
      return aet.a(je.aA, new aeu($$0));
   }

   private static void a(np<dyu> $$0, aet<dyu> $$1, List<dyt> $$2) {
      $$0.a($$1, new dyu($$2));
   }

   public static void a(np<dyu> $$0) {
      hh<csq> $$1 = $$0.a(je.e);
      dyl $$2 = new dyl(new dyn(csr.pr, 0.01F), dxu.b, csr.pC.n());
      dyl $$3 = new dyl(new dyn(csr.pC, 0.5F), dxu.b, csr.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.m, 0.8F), dxu.b, csr.cn.n()),
                  new dyl(new dyy(apo.p), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cp), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cq), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.m, 0.07F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.cn, 0.07F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.hj, 0.07F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.U, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.n, 0.1F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.cu, 0.1F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.al, 0.02F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.eZ, 0.5F), dxu.b, csr.bs.n()),
                  new dyl[]{
                     new dyl(
                        new dyb(csr.eZ.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))),
                        dxu.b,
                        csr.hL.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))
                     ),
                     new dyl(
                        new dyb(csr.eZ.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))),
                        dxu.b,
                        csr.hL.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))
                     ),
                     new dyl(new dyn(csr.cB, 0.3F), dxu.b, csr.gt.n()),
                     new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.gu.n()),
                     new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyy(apo.p), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cp), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cq), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.r, 0.2F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.hP, 0.2F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.Y, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.as, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.hk, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.hn, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.hx, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.eZ, 0.5F), dxu.b, csr.bs.n()),
                  new dyl(
                     new dyb(csr.eZ.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))),
                     dxu.b,
                     csr.hL.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))
                  ),
                  new dyl[]{
                     new dyl(
                        new dyb(csr.eZ.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))),
                        dxu.b,
                        csr.hL.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))
                     ),
                     new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyy(apo.p), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cp), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cq), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.oe), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.o, 0.2F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.ju, 0.4F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.af, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.ax, 0.05F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.eZ, 0.5F), dxu.b, csr.bs.n()),
                  new dyl(
                     new dyb(csr.eZ.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))),
                     dxu.b,
                     csr.hL.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))
                  ),
                  new dyl(
                     new dyb(csr.eZ.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))),
                     dxu.b,
                     csr.hL.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))
                  ),
                  new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.gt.n()),
                  new dyl[]{new dyl(new dyn(csr.cB, 0.8F), dxu.b, csr.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.m, 0.8F), dxu.b, csr.cn.n()),
                  new dyl(new dyy(apo.p), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cp), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cq), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.og), dxu.b, csr.og.n().a(ctd.b, Boolean.valueOf(false))),
                  new dyl(new dyn(csr.m, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.V, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.eZ, 0.5F), dxu.b, csr.bs.n()),
                  new dyl(
                     new dyb(csr.eZ.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))),
                     dxu.b,
                     csr.hL.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true))
                  ),
                  new dyl(
                     new dyb(csr.eZ.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))),
                     dxu.b,
                     csr.hL.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true))
                  ),
                  new dyl(new dyn(csr.cB, 0.3F), dxu.b, csr.fd.n()),
                  new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.gu.n()),
                  new dyl[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyy(apo.p), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cp), dxu.b, csr.a.n()),
                  new dyl(new dxz(csr.cq), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.jS, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.aX, 0.1F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.iA, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.nl, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.ny, 0.08F), dxu.b, csr.bs.n()),
                  new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.kD.n()),
                  new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.m, 0.1F), dxu.b, csr.cn.n())))));
      a($$0, g, ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.m, 0.2F), dxu.b, csr.cn.n())))));
      a($$0, h, ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.m, 0.7F), dxu.b, csr.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dxz(csr.kE), new dxz(csr.G), csr.n.n()),
                  new dyl(new dyn(csr.kE, 0.1F), dxu.b, csr.i.n()),
                  new dyl(new dxz(csr.i), new dxz(csr.G), csr.G.n()),
                  new dyl(new dxz(csr.j), new dxz(csr.G), csr.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dxz(csr.kE), new dxz(csr.G), csr.r.n()),
                  new dyl(new dyn(csr.kE, 0.2F), dxu.b, csr.i.n()),
                  new dyl(new dxz(csr.i), new dxz(csr.G), csr.G.n()),
                  new dyl(new dxz(csr.j), new dxz(csr.G), csr.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dxz(csr.kE), new dxz(csr.G), csr.o.n()),
                  new dyl(new dxz(csr.kE), new dxz(csr.dO), csr.o.n()),
                  new dyl(new dyn(csr.kE, 0.2F), dxu.b, csr.i.n()),
                  new dyl(new dxz(csr.i), new dxz(csr.G), csr.G.n()),
                  new dyl(new dxz(csr.j), new dxz(csr.G), csr.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.cB, 0.3F), dxu.b, csr.gt.n()),
                  new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.gu.n()),
                  new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.gt.n()), new dyl(new dyn(csr.cB, 0.8F), dxu.b, csr.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.cB, 0.3F), dxu.b, csr.fd.n()), new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.cB, 0.2F), dxu.b, csr.kD.n()), new dyl(new dyn(csr.cB, 0.1F), dxu.b, csr.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dya(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyp(ImmutableList.of(new dyl(new dyn(csr.kJ, 0.75F), dxu.b, csr.px.n()), new dyl(new dyn(csr.px, 0.15F), dxu.b, csr.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyp(ImmutableList.of(new dyl(new dyn(csr.pw, 0.35F), dxu.b, csr.px.n()), new dyl(new dyn(csr.py, 0.1F), dxu.b, csr.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyp(ImmutableList.of(new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.px.n()), new dyl(new dyn(csr.pr, 1.0E-4F), dxu.b, csr.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyp(ImmutableList.of(new dyl(new dyn(csr.py, 0.5F), dxu.b, csr.a.n()), new dyl(new dyn(csr.ch, 0.1F), dxu.b, csr.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyp(ImmutableList.of(new dyl(new dyn(csr.pw, 0.1F), dxu.b, csr.px.n()), new dyl(new dyn(csr.pr, 1.0E-4F), dxu.b, csr.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.px.n()),
                  new dyl(new dyn(csr.pr, 1.0E-4F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.ch, 0.3F), dxu.b, csr.px.n()),
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
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.pw, 0.4F), dxu.b, csr.px.n()),
                  new dyl(new dyn(csr.pr, 0.01F), dxu.b, csr.px.n()),
                  new dyl(new dyn(csr.pw, 1.0E-4F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.pr, 1.0E-4F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.ch, 0.3F), dxu.b, csr.px.n()),
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
            new dyp(ImmutableList.of(new dyl(new dyn(csr.py, 0.5F), dxu.b, csr.a.n()), new dyl(new dyn(csr.ch, 0.6F), dxu.b, csr.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyp(ImmutableList.of(new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.px.n()), new dyl(new dyn(csr.pr, 1.0E-4F), dxu.b, csr.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.px.n()),
                  new dyl(new dyn(csr.pw, 0.15F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.pw, 0.01F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.pw, 0.5F), dxu.b, csr.px.n()),
                  new dyl(new dyn(csr.pw, 0.3F), dxu.b, csr.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(new dyl(new dyn(csr.ch, 0.3F), dxu.b, csr.px.n()), new dyl(dxu.b, dxu.b, new dxv(0.0F, 0.05F, 0, 100, hc.a.b), csr.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dya(0.9F), new dym(apo.bH)));
      a($$0, E, ImmutableList.of(new dya(0.1F), new dym(apo.bH)));
      a($$0, F, ImmutableList.of(new dya(0.1F), new dyp(ImmutableList.of(new dyl(new dxz(csr.R), dxu.b, csr.cy.n()))), new dym(apo.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.rV, 0.3F), dxu.b, csr.sa.n()),
                  new dyl(new dyn(csr.rR, 0.3F), dxu.b, csr.sb.n()),
                  new dyl(new dyn(csr.of, 0.05F), dxu.b, csr.a.n())
               )
            ),
            new dym(apo.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dya($$1.b(apo.bN), 0.95F),
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.rV, 0.3F), dxu.b, csr.sa.n()),
                  new dyl(new dyn(csr.rR, 0.3F), dxu.b, csr.sb.n()),
                  new dyl(new dyn(csr.of, 0.05F), dxu.b, csr.a.n())
               )
            ),
            new dym(apo.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dya($$1.b(apo.bN), 0.95F),
            new dyp(
               ImmutableList.of(
                  new dyl(new dyn(csr.rV, 0.3F), dxu.b, csr.sa.n()),
                  new dyl(new dyn(csr.rR, 0.3F), dxu.b, csr.sb.n()),
                  new dyl(new dyn(csr.rT, 0.3F), dxu.b, csr.a.n()),
                  new dyl(new dyn(csr.of, 0.05F), dxu.b, csr.a.n())
               )
            ),
            new dym(apo.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyp(
               List.of(
                  new dyl(new dyn(csr.L, 0.2F), dxu.b, csr.j.n()),
                  new dyl(new dyn(csr.L, 0.1F), dxu.b, csr.k.n()),
                  new dyl(new dyn(csr.eN, 0.1F), dxu.b, csr.eM.n())
               )
            ),
            a(ecj.aE, 6),
            a(ecj.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyp(
               List.of(
                  new dyl(new dyn(csr.L, 0.2F), dxu.b, csr.j.n()),
                  new dyl(new dyn(csr.L, 0.1F), dxu.b, csr.k.n()),
                  new dyl(new dyn(csr.eN, 0.1F), dxu.b, csr.eM.n())
               )
            ),
            a(ecj.aE, 2)
         )
      );
      a($$0, L, List.of(a(ecj.aE, 2)));
   }

   private static dyc a(aeu $$0, int $$1) {
      return new dyc(new dyp(List.of(new dyl(new dyy(apo.cl), dxu.b, dyi.b, csr.M.n(), new dza($$0)))), bfv.a($$1));
   }
}
