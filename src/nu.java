import com.google.common.collect.ImmutableList;
import java.util.List;

public class nu {
   private static final aeq<dyq> M = a("empty");
   public static final aeq<dyq> a = a("zombie_plains");
   public static final aeq<dyq> b = a("zombie_savanna");
   public static final aeq<dyq> c = a("zombie_snowy");
   public static final aeq<dyq> d = a("zombie_taiga");
   public static final aeq<dyq> e = a("zombie_desert");
   public static final aeq<dyq> f = a("mossify_10_percent");
   public static final aeq<dyq> g = a("mossify_20_percent");
   public static final aeq<dyq> h = a("mossify_70_percent");
   public static final aeq<dyq> i = a("street_plains");
   public static final aeq<dyq> j = a("street_savanna");
   public static final aeq<dyq> k = a("street_snowy_or_taiga");
   public static final aeq<dyq> l = a("farm_plains");
   public static final aeq<dyq> m = a("farm_savanna");
   public static final aeq<dyq> n = a("farm_snowy");
   public static final aeq<dyq> o = a("farm_taiga");
   public static final aeq<dyq> p = a("farm_desert");
   public static final aeq<dyq> q = a("outpost_rot");
   public static final aeq<dyq> r = a("bottom_rampart");
   public static final aeq<dyq> s = a("treasure_rooms");
   public static final aeq<dyq> t = a("housing");
   public static final aeq<dyq> u = a("side_wall_degradation");
   public static final aeq<dyq> v = a("stable_degradation");
   public static final aeq<dyq> w = a("bastion_generic_degradation");
   public static final aeq<dyq> x = a("rampart_degradation");
   public static final aeq<dyq> y = a("entrance_replacement");
   public static final aeq<dyq> z = a("bridge");
   public static final aeq<dyq> A = a("roof");
   public static final aeq<dyq> B = a("high_wall");
   public static final aeq<dyq> C = a("high_rampart");
   public static final aeq<dyq> D = a("fossil_rot");
   public static final aeq<dyq> E = a("fossil_coal");
   public static final aeq<dyq> F = a("fossil_diamonds");
   public static final aeq<dyq> G = a("ancient_city_start_degradation");
   public static final aeq<dyq> H = a("ancient_city_generic_degradation");
   public static final aeq<dyq> I = a("ancient_city_walls_degradation");
   public static final aeq<dyq> J = a("trail_ruins_houses_archaeology");
   public static final aeq<dyq> K = a("trail_ruins_roads_archaeology");
   public static final aeq<dyq> L = a("trail_ruins_tower_top_archaeology");

   private static aeq<dyq> a(String $$0) {
      return aeq.a(jc.aA, new aer($$0));
   }

   private static void a(nm<dyq> $$0, aeq<dyq> $$1, List<dyp> $$2) {
      $$0.a($$1, new dyq($$2));
   }

   public static void a(nm<dyq> $$0) {
      hf<csm> $$1 = $$0.a(jc.e);
      dyh $$2 = new dyh(new dyj(csn.pr, 0.01F), dxq.b, csn.pC.n());
      dyh $$3 = new dyh(new dyj(csn.pC, 0.5F), dxq.b, csn.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.m, 0.8F), dxq.b, csn.cn.n()),
                  new dyh(new dyu(apl.p), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cp), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cq), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.m, 0.07F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.cn, 0.07F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.hj, 0.07F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.U, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.n, 0.1F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.cu, 0.1F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.al, 0.02F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.eZ, 0.5F), dxq.b, csn.bs.n()),
                  new dyh[]{
                     new dyh(
                        new dxx(csn.eZ.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))),
                        dxq.b,
                        csn.hL.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))
                     ),
                     new dyh(
                        new dxx(csn.eZ.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))),
                        dxq.b,
                        csn.hL.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))
                     ),
                     new dyh(new dyj(csn.cB, 0.3F), dxq.b, csn.gt.n()),
                     new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.gu.n()),
                     new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyu(apl.p), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cp), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cq), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.r, 0.2F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.hP, 0.2F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.Y, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.as, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.hk, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.hn, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.hx, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.eZ, 0.5F), dxq.b, csn.bs.n()),
                  new dyh(
                     new dxx(csn.eZ.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))),
                     dxq.b,
                     csn.hL.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))
                  ),
                  new dyh[]{
                     new dyh(
                        new dxx(csn.eZ.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))),
                        dxq.b,
                        csn.hL.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))
                     ),
                     new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyu(apl.p), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cp), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cq), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.oe), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.o, 0.2F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.ju, 0.4F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.af, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.ax, 0.05F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.eZ, 0.5F), dxq.b, csn.bs.n()),
                  new dyh(
                     new dxx(csn.eZ.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))),
                     dxq.b,
                     csn.hL.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))
                  ),
                  new dyh(
                     new dxx(csn.eZ.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))),
                     dxq.b,
                     csn.hL.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))
                  ),
                  new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.gt.n()),
                  new dyh[]{new dyh(new dyj(csn.cB, 0.8F), dxq.b, csn.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.m, 0.8F), dxq.b, csn.cn.n()),
                  new dyh(new dyu(apl.p), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cp), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cq), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.og), dxq.b, csn.og.n().a(csz.b, Boolean.valueOf(false))),
                  new dyh(new dyj(csn.m, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.V, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.eZ, 0.5F), dxq.b, csn.bs.n()),
                  new dyh(
                     new dxx(csn.eZ.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))),
                     dxq.b,
                     csn.hL.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true))
                  ),
                  new dyh(
                     new dxx(csn.eZ.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))),
                     dxq.b,
                     csn.hL.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true))
                  ),
                  new dyh(new dyj(csn.cB, 0.3F), dxq.b, csn.fd.n()),
                  new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.gu.n()),
                  new dyh[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyu(apl.p), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cp), dxq.b, csn.a.n()),
                  new dyh(new dxv(csn.cq), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.jS, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.aX, 0.1F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.iA, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.nl, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.ny, 0.08F), dxq.b, csn.bs.n()),
                  new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.kD.n()),
                  new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.m, 0.1F), dxq.b, csn.cn.n())))));
      a($$0, g, ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.m, 0.2F), dxq.b, csn.cn.n())))));
      a($$0, h, ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.m, 0.7F), dxq.b, csn.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dxv(csn.kE), new dxv(csn.G), csn.n.n()),
                  new dyh(new dyj(csn.kE, 0.1F), dxq.b, csn.i.n()),
                  new dyh(new dxv(csn.i), new dxv(csn.G), csn.G.n()),
                  new dyh(new dxv(csn.j), new dxv(csn.G), csn.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dxv(csn.kE), new dxv(csn.G), csn.r.n()),
                  new dyh(new dyj(csn.kE, 0.2F), dxq.b, csn.i.n()),
                  new dyh(new dxv(csn.i), new dxv(csn.G), csn.G.n()),
                  new dyh(new dxv(csn.j), new dxv(csn.G), csn.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dxv(csn.kE), new dxv(csn.G), csn.o.n()),
                  new dyh(new dxv(csn.kE), new dxv(csn.dO), csn.o.n()),
                  new dyh(new dyj(csn.kE, 0.2F), dxq.b, csn.i.n()),
                  new dyh(new dxv(csn.i), new dxv(csn.G), csn.G.n()),
                  new dyh(new dxv(csn.j), new dxv(csn.G), csn.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.cB, 0.3F), dxq.b, csn.gt.n()),
                  new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.gu.n()),
                  new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.gt.n()), new dyh(new dyj(csn.cB, 0.8F), dxq.b, csn.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.cB, 0.3F), dxq.b, csn.fd.n()), new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.cB, 0.2F), dxq.b, csn.kD.n()), new dyh(new dyj(csn.cB, 0.1F), dxq.b, csn.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dxw(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyl(ImmutableList.of(new dyh(new dyj(csn.kJ, 0.75F), dxq.b, csn.px.n()), new dyh(new dyj(csn.px, 0.15F), dxq.b, csn.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyl(ImmutableList.of(new dyh(new dyj(csn.pw, 0.35F), dxq.b, csn.px.n()), new dyh(new dyj(csn.py, 0.1F), dxq.b, csn.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyl(ImmutableList.of(new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.px.n()), new dyh(new dyj(csn.pr, 1.0E-4F), dxq.b, csn.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyl(ImmutableList.of(new dyh(new dyj(csn.py, 0.5F), dxq.b, csn.a.n()), new dyh(new dyj(csn.ch, 0.1F), dxq.b, csn.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyl(ImmutableList.of(new dyh(new dyj(csn.pw, 0.1F), dxq.b, csn.px.n()), new dyh(new dyj(csn.pr, 1.0E-4F), dxq.b, csn.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.px.n()),
                  new dyh(new dyj(csn.pr, 1.0E-4F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.ch, 0.3F), dxq.b, csn.px.n()),
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
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.pw, 0.4F), dxq.b, csn.px.n()),
                  new dyh(new dyj(csn.pr, 0.01F), dxq.b, csn.px.n()),
                  new dyh(new dyj(csn.pw, 1.0E-4F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.pr, 1.0E-4F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.ch, 0.3F), dxq.b, csn.px.n()),
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
            new dyl(ImmutableList.of(new dyh(new dyj(csn.py, 0.5F), dxq.b, csn.a.n()), new dyh(new dyj(csn.ch, 0.6F), dxq.b, csn.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyl(ImmutableList.of(new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.px.n()), new dyh(new dyj(csn.pr, 1.0E-4F), dxq.b, csn.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.px.n()),
                  new dyh(new dyj(csn.pw, 0.15F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.pw, 0.01F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.pw, 0.5F), dxq.b, csn.px.n()),
                  new dyh(new dyj(csn.pw, 0.3F), dxq.b, csn.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(new dyh(new dyj(csn.ch, 0.3F), dxq.b, csn.px.n()), new dyh(dxq.b, dxq.b, new dxr(0.0F, 0.05F, 0, 100, ha.a.b), csn.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dxw(0.9F), new dyi(apl.bH)));
      a($$0, E, ImmutableList.of(new dxw(0.1F), new dyi(apl.bH)));
      a($$0, F, ImmutableList.of(new dxw(0.1F), new dyl(ImmutableList.of(new dyh(new dxv(csn.R), dxq.b, csn.cy.n()))), new dyi(apl.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.rV, 0.3F), dxq.b, csn.sa.n()),
                  new dyh(new dyj(csn.rR, 0.3F), dxq.b, csn.sb.n()),
                  new dyh(new dyj(csn.of, 0.05F), dxq.b, csn.a.n())
               )
            ),
            new dyi(apl.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dxw($$1.b(apl.bN), 0.95F),
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.rV, 0.3F), dxq.b, csn.sa.n()),
                  new dyh(new dyj(csn.rR, 0.3F), dxq.b, csn.sb.n()),
                  new dyh(new dyj(csn.of, 0.05F), dxq.b, csn.a.n())
               )
            ),
            new dyi(apl.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dxw($$1.b(apl.bN), 0.95F),
            new dyl(
               ImmutableList.of(
                  new dyh(new dyj(csn.rV, 0.3F), dxq.b, csn.sa.n()),
                  new dyh(new dyj(csn.rR, 0.3F), dxq.b, csn.sb.n()),
                  new dyh(new dyj(csn.rT, 0.3F), dxq.b, csn.a.n()),
                  new dyh(new dyj(csn.of, 0.05F), dxq.b, csn.a.n())
               )
            ),
            new dyi(apl.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyl(
               List.of(
                  new dyh(new dyj(csn.L, 0.2F), dxq.b, csn.j.n()),
                  new dyh(new dyj(csn.L, 0.1F), dxq.b, csn.k.n()),
                  new dyh(new dyj(csn.eN, 0.1F), dxq.b, csn.eM.n())
               )
            ),
            a(ecf.aE, 6),
            a(ecf.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyl(
               List.of(
                  new dyh(new dyj(csn.L, 0.2F), dxq.b, csn.j.n()),
                  new dyh(new dyj(csn.L, 0.1F), dxq.b, csn.k.n()),
                  new dyh(new dyj(csn.eN, 0.1F), dxq.b, csn.eM.n())
               )
            ),
            a(ecf.aE, 2)
         )
      );
      a($$0, L, List.of(a(ecf.aE, 2)));
   }

   private static dxy a(aer $$0, int $$1) {
      return new dxy(new dyl(List.of(new dyh(new dyu(apl.cl), dxq.b, dye.b, csn.M.n(), new dyw($$0)))), bfs.a($$1));
   }
}
