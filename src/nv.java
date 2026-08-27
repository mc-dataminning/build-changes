import com.google.common.collect.ImmutableList;
import java.util.List;

public class nv {
   private static final aeo<dyo> M = a("empty");
   public static final aeo<dyo> a = a("zombie_plains");
   public static final aeo<dyo> b = a("zombie_savanna");
   public static final aeo<dyo> c = a("zombie_snowy");
   public static final aeo<dyo> d = a("zombie_taiga");
   public static final aeo<dyo> e = a("zombie_desert");
   public static final aeo<dyo> f = a("mossify_10_percent");
   public static final aeo<dyo> g = a("mossify_20_percent");
   public static final aeo<dyo> h = a("mossify_70_percent");
   public static final aeo<dyo> i = a("street_plains");
   public static final aeo<dyo> j = a("street_savanna");
   public static final aeo<dyo> k = a("street_snowy_or_taiga");
   public static final aeo<dyo> l = a("farm_plains");
   public static final aeo<dyo> m = a("farm_savanna");
   public static final aeo<dyo> n = a("farm_snowy");
   public static final aeo<dyo> o = a("farm_taiga");
   public static final aeo<dyo> p = a("farm_desert");
   public static final aeo<dyo> q = a("outpost_rot");
   public static final aeo<dyo> r = a("bottom_rampart");
   public static final aeo<dyo> s = a("treasure_rooms");
   public static final aeo<dyo> t = a("housing");
   public static final aeo<dyo> u = a("side_wall_degradation");
   public static final aeo<dyo> v = a("stable_degradation");
   public static final aeo<dyo> w = a("bastion_generic_degradation");
   public static final aeo<dyo> x = a("rampart_degradation");
   public static final aeo<dyo> y = a("entrance_replacement");
   public static final aeo<dyo> z = a("bridge");
   public static final aeo<dyo> A = a("roof");
   public static final aeo<dyo> B = a("high_wall");
   public static final aeo<dyo> C = a("high_rampart");
   public static final aeo<dyo> D = a("fossil_rot");
   public static final aeo<dyo> E = a("fossil_coal");
   public static final aeo<dyo> F = a("fossil_diamonds");
   public static final aeo<dyo> G = a("ancient_city_start_degradation");
   public static final aeo<dyo> H = a("ancient_city_generic_degradation");
   public static final aeo<dyo> I = a("ancient_city_walls_degradation");
   public static final aeo<dyo> J = a("trail_ruins_houses_archaeology");
   public static final aeo<dyo> K = a("trail_ruins_roads_archaeology");
   public static final aeo<dyo> L = a("trail_ruins_tower_top_archaeology");

   private static aeo<dyo> a(String $$0) {
      return aeo.a(jd.aA, new aep($$0));
   }

   private static void a(nn<dyo> $$0, aeo<dyo> $$1, List<dyn> $$2) {
      $$0.a($$1, new dyo($$2));
   }

   public static void a(nn<dyo> $$0) {
      hg<csk> $$1 = $$0.a(jd.e);
      dyf $$2 = new dyf(new dyh(csl.pr, 0.01F), dxo.b, csl.pC.n());
      dyf $$3 = new dyf(new dyh(csl.pC, 0.5F), dxo.b, csl.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.m, 0.8F), dxo.b, csl.cn.n()),
                  new dyf(new dys(apj.p), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cp), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cq), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.m, 0.07F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.cn, 0.07F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.hj, 0.07F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.U, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.n, 0.1F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.cu, 0.1F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.al, 0.02F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.eZ, 0.5F), dxo.b, csl.bs.n()),
                  new dyf[]{
                     new dyf(
                        new dxv(csl.eZ.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))),
                        dxo.b,
                        csl.hL.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))
                     ),
                     new dyf(
                        new dxv(csl.eZ.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))),
                        dxo.b,
                        csl.hL.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))
                     ),
                     new dyf(new dyh(csl.cB, 0.3F), dxo.b, csl.gt.n()),
                     new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.gu.n()),
                     new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dys(apj.p), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cp), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cq), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.r, 0.2F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.hP, 0.2F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.Y, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.as, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.hk, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.hn, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.hx, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.eZ, 0.5F), dxo.b, csl.bs.n()),
                  new dyf(
                     new dxv(csl.eZ.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))),
                     dxo.b,
                     csl.hL.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))
                  ),
                  new dyf[]{
                     new dyf(
                        new dxv(csl.eZ.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))),
                        dxo.b,
                        csl.hL.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))
                     ),
                     new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dys(apj.p), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cp), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cq), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.oe), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.o, 0.2F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.ju, 0.4F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.af, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.ax, 0.05F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.eZ, 0.5F), dxo.b, csl.bs.n()),
                  new dyf(
                     new dxv(csl.eZ.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))),
                     dxo.b,
                     csl.hL.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))
                  ),
                  new dyf(
                     new dxv(csl.eZ.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))),
                     dxo.b,
                     csl.hL.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))
                  ),
                  new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.gt.n()),
                  new dyf[]{new dyf(new dyh(csl.cB, 0.8F), dxo.b, csl.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.m, 0.8F), dxo.b, csl.cn.n()),
                  new dyf(new dys(apj.p), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cp), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cq), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.og), dxo.b, csl.og.n().a(csx.b, Boolean.valueOf(false))),
                  new dyf(new dyh(csl.m, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.V, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.eZ, 0.5F), dxo.b, csl.bs.n()),
                  new dyf(
                     new dxv(csl.eZ.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))),
                     dxo.b,
                     csl.hL.n().a(cwi.a, Boolean.valueOf(true)).a(cwi.c, Boolean.valueOf(true))
                  ),
                  new dyf(
                     new dxv(csl.eZ.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))),
                     dxo.b,
                     csl.hL.n().a(cwi.b, Boolean.valueOf(true)).a(cwi.d, Boolean.valueOf(true))
                  ),
                  new dyf(new dyh(csl.cB, 0.3F), dxo.b, csl.fd.n()),
                  new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.gu.n()),
                  new dyf[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dys(apj.p), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cp), dxo.b, csl.a.n()),
                  new dyf(new dxt(csl.cq), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.jS, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.aX, 0.1F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.iA, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.nl, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.ny, 0.08F), dxo.b, csl.bs.n()),
                  new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.kD.n()),
                  new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.m, 0.1F), dxo.b, csl.cn.n())))));
      a($$0, g, ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.m, 0.2F), dxo.b, csl.cn.n())))));
      a($$0, h, ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.m, 0.7F), dxo.b, csl.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dxt(csl.kE), new dxt(csl.G), csl.n.n()),
                  new dyf(new dyh(csl.kE, 0.1F), dxo.b, csl.i.n()),
                  new dyf(new dxt(csl.i), new dxt(csl.G), csl.G.n()),
                  new dyf(new dxt(csl.j), new dxt(csl.G), csl.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dxt(csl.kE), new dxt(csl.G), csl.r.n()),
                  new dyf(new dyh(csl.kE, 0.2F), dxo.b, csl.i.n()),
                  new dyf(new dxt(csl.i), new dxt(csl.G), csl.G.n()),
                  new dyf(new dxt(csl.j), new dxt(csl.G), csl.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dxt(csl.kE), new dxt(csl.G), csl.o.n()),
                  new dyf(new dxt(csl.kE), new dxt(csl.dO), csl.o.n()),
                  new dyf(new dyh(csl.kE, 0.2F), dxo.b, csl.i.n()),
                  new dyf(new dxt(csl.i), new dxt(csl.G), csl.G.n()),
                  new dyf(new dxt(csl.j), new dxt(csl.G), csl.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.cB, 0.3F), dxo.b, csl.gt.n()),
                  new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.gu.n()),
                  new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.gt.n()), new dyf(new dyh(csl.cB, 0.8F), dxo.b, csl.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.cB, 0.3F), dxo.b, csl.fd.n()), new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.cB, 0.2F), dxo.b, csl.kD.n()), new dyf(new dyh(csl.cB, 0.1F), dxo.b, csl.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dxu(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dyj(ImmutableList.of(new dyf(new dyh(csl.kJ, 0.75F), dxo.b, csl.px.n()), new dyf(new dyh(csl.px, 0.15F), dxo.b, csl.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dyj(ImmutableList.of(new dyf(new dyh(csl.pw, 0.35F), dxo.b, csl.px.n()), new dyf(new dyh(csl.py, 0.1F), dxo.b, csl.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dyj(ImmutableList.of(new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.px.n()), new dyf(new dyh(csl.pr, 1.0E-4F), dxo.b, csl.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dyj(ImmutableList.of(new dyf(new dyh(csl.py, 0.5F), dxo.b, csl.a.n()), new dyf(new dyh(csl.ch, 0.1F), dxo.b, csl.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dyj(ImmutableList.of(new dyf(new dyh(csl.pw, 0.1F), dxo.b, csl.px.n()), new dyf(new dyh(csl.pr, 1.0E-4F), dxo.b, csl.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.px.n()),
                  new dyf(new dyh(csl.pr, 1.0E-4F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.ch, 0.3F), dxo.b, csl.px.n()),
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
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.pw, 0.4F), dxo.b, csl.px.n()),
                  new dyf(new dyh(csl.pr, 0.01F), dxo.b, csl.px.n()),
                  new dyf(new dyh(csl.pw, 1.0E-4F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.pr, 1.0E-4F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.ch, 0.3F), dxo.b, csl.px.n()),
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
            new dyj(ImmutableList.of(new dyf(new dyh(csl.py, 0.5F), dxo.b, csl.a.n()), new dyf(new dyh(csl.ch, 0.6F), dxo.b, csl.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dyj(ImmutableList.of(new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.px.n()), new dyf(new dyh(csl.pr, 1.0E-4F), dxo.b, csl.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.px.n()),
                  new dyf(new dyh(csl.pw, 0.15F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.pw, 0.01F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.pw, 0.5F), dxo.b, csl.px.n()),
                  new dyf(new dyh(csl.pw, 0.3F), dxo.b, csl.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(new dyf(new dyh(csl.ch, 0.3F), dxo.b, csl.px.n()), new dyf(dxo.b, dxo.b, new dxp(0.0F, 0.05F, 0, 100, hb.a.b), csl.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dxu(0.9F), new dyg(apj.bH)));
      a($$0, E, ImmutableList.of(new dxu(0.1F), new dyg(apj.bH)));
      a($$0, F, ImmutableList.of(new dxu(0.1F), new dyj(ImmutableList.of(new dyf(new dxt(csl.R), dxo.b, csl.cy.n()))), new dyg(apj.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.rV, 0.3F), dxo.b, csl.sa.n()),
                  new dyf(new dyh(csl.rR, 0.3F), dxo.b, csl.sb.n()),
                  new dyf(new dyh(csl.of, 0.05F), dxo.b, csl.a.n())
               )
            ),
            new dyg(apj.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dxu($$1.b(apj.bN), 0.95F),
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.rV, 0.3F), dxo.b, csl.sa.n()),
                  new dyf(new dyh(csl.rR, 0.3F), dxo.b, csl.sb.n()),
                  new dyf(new dyh(csl.of, 0.05F), dxo.b, csl.a.n())
               )
            ),
            new dyg(apj.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dxu($$1.b(apj.bN), 0.95F),
            new dyj(
               ImmutableList.of(
                  new dyf(new dyh(csl.rV, 0.3F), dxo.b, csl.sa.n()),
                  new dyf(new dyh(csl.rR, 0.3F), dxo.b, csl.sb.n()),
                  new dyf(new dyh(csl.rT, 0.3F), dxo.b, csl.a.n()),
                  new dyf(new dyh(csl.of, 0.05F), dxo.b, csl.a.n())
               )
            ),
            new dyg(apj.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dyj(
               List.of(
                  new dyf(new dyh(csl.L, 0.2F), dxo.b, csl.j.n()),
                  new dyf(new dyh(csl.L, 0.1F), dxo.b, csl.k.n()),
                  new dyf(new dyh(csl.eN, 0.1F), dxo.b, csl.eM.n())
               )
            ),
            a(ecd.aE, 6),
            a(ecd.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dyj(
               List.of(
                  new dyf(new dyh(csl.L, 0.2F), dxo.b, csl.j.n()),
                  new dyf(new dyh(csl.L, 0.1F), dxo.b, csl.k.n()),
                  new dyf(new dyh(csl.eN, 0.1F), dxo.b, csl.eM.n())
               )
            ),
            a(ecd.aE, 2)
         )
      );
      a($$0, L, List.of(a(ecd.aE, 2)));
   }

   private static dxw a(aep $$0, int $$1) {
      return new dxw(new dyj(List.of(new dyf(new dys(apj.cl), dxo.b, dyc.b, csl.M.n(), new dyu($$0)))), bfq.a($$1));
   }
}
