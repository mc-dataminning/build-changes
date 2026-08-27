import com.google.common.collect.ImmutableList;
import java.util.List;

public class nu {
   private static final acp<dvr> M = a("empty");
   public static final acp<dvr> a = a("zombie_plains");
   public static final acp<dvr> b = a("zombie_savanna");
   public static final acp<dvr> c = a("zombie_snowy");
   public static final acp<dvr> d = a("zombie_taiga");
   public static final acp<dvr> e = a("zombie_desert");
   public static final acp<dvr> f = a("mossify_10_percent");
   public static final acp<dvr> g = a("mossify_20_percent");
   public static final acp<dvr> h = a("mossify_70_percent");
   public static final acp<dvr> i = a("street_plains");
   public static final acp<dvr> j = a("street_savanna");
   public static final acp<dvr> k = a("street_snowy_or_taiga");
   public static final acp<dvr> l = a("farm_plains");
   public static final acp<dvr> m = a("farm_savanna");
   public static final acp<dvr> n = a("farm_snowy");
   public static final acp<dvr> o = a("farm_taiga");
   public static final acp<dvr> p = a("farm_desert");
   public static final acp<dvr> q = a("outpost_rot");
   public static final acp<dvr> r = a("bottom_rampart");
   public static final acp<dvr> s = a("treasure_rooms");
   public static final acp<dvr> t = a("housing");
   public static final acp<dvr> u = a("side_wall_degradation");
   public static final acp<dvr> v = a("stable_degradation");
   public static final acp<dvr> w = a("bastion_generic_degradation");
   public static final acp<dvr> x = a("rampart_degradation");
   public static final acp<dvr> y = a("entrance_replacement");
   public static final acp<dvr> z = a("bridge");
   public static final acp<dvr> A = a("roof");
   public static final acp<dvr> B = a("high_wall");
   public static final acp<dvr> C = a("high_rampart");
   public static final acp<dvr> D = a("fossil_rot");
   public static final acp<dvr> E = a("fossil_coal");
   public static final acp<dvr> F = a("fossil_diamonds");
   public static final acp<dvr> G = a("ancient_city_start_degradation");
   public static final acp<dvr> H = a("ancient_city_generic_degradation");
   public static final acp<dvr> I = a("ancient_city_walls_degradation");
   public static final acp<dvr> J = a("trail_ruins_houses_archaeology");
   public static final acp<dvr> K = a("trail_ruins_roads_archaeology");
   public static final acp<dvr> L = a("trail_ruins_tower_top_archaeology");

   private static acp<dvr> a(String $$0) {
      return acp.a(jc.aA, new acq($$0));
   }

   private static void a(nm<dvr> $$0, acp<dvr> $$1, List<dvq> $$2) {
      $$0.a($$1, new dvr($$2));
   }

   public static void a(nm<dvr> $$0) {
      hf<cpn> $$1 = $$0.a(jc.e);
      dvi $$2 = new dvi(new dvk(cpo.pr, 0.01F), dur.b, cpo.pC.n());
      dvi $$3 = new dvi(new dvk(cpo.pC, 0.5F), dur.b, cpo.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.m, 0.8F), dur.b, cpo.cn.n()),
                  new dvi(new dvv(amw.p), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cp), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cq), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.m, 0.07F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.cn, 0.07F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.hj, 0.07F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.U, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.n, 0.1F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.cu, 0.1F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.al, 0.02F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.eZ, 0.5F), dur.b, cpo.bs.n()),
                  new dvi[]{
                     new dvi(
                        new duy(cpo.eZ.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))),
                        dur.b,
                        cpo.hL.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))
                     ),
                     new dvi(
                        new duy(cpo.eZ.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))),
                        dur.b,
                        cpo.hL.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))
                     ),
                     new dvi(new dvk(cpo.cB, 0.3F), dur.b, cpo.gt.n()),
                     new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.gu.n()),
                     new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvv(amw.p), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cp), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cq), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.r, 0.2F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.hP, 0.2F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.Y, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.as, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.hk, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.hn, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.hx, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.eZ, 0.5F), dur.b, cpo.bs.n()),
                  new dvi(
                     new duy(cpo.eZ.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))),
                     dur.b,
                     cpo.hL.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))
                  ),
                  new dvi[]{
                     new dvi(
                        new duy(cpo.eZ.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))),
                        dur.b,
                        cpo.hL.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))
                     ),
                     new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvv(amw.p), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cp), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cq), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.oe), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.o, 0.2F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.ju, 0.4F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.af, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.ax, 0.05F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.eZ, 0.5F), dur.b, cpo.bs.n()),
                  new dvi(
                     new duy(cpo.eZ.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))),
                     dur.b,
                     cpo.hL.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))
                  ),
                  new dvi(
                     new duy(cpo.eZ.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))),
                     dur.b,
                     cpo.hL.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))
                  ),
                  new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.gt.n()),
                  new dvi[]{new dvi(new dvk(cpo.cB, 0.8F), dur.b, cpo.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.m, 0.8F), dur.b, cpo.cn.n()),
                  new dvi(new dvv(amw.p), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cp), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cq), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.og), dur.b, cpo.og.n().a(cqa.b, Boolean.valueOf(false))),
                  new dvi(new dvk(cpo.m, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.V, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.eZ, 0.5F), dur.b, cpo.bs.n()),
                  new dvi(
                     new duy(cpo.eZ.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))),
                     dur.b,
                     cpo.hL.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true))
                  ),
                  new dvi(
                     new duy(cpo.eZ.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))),
                     dur.b,
                     cpo.hL.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true))
                  ),
                  new dvi(new dvk(cpo.cB, 0.3F), dur.b, cpo.fd.n()),
                  new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.gu.n()),
                  new dvi[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvv(amw.p), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cp), dur.b, cpo.a.n()),
                  new dvi(new duw(cpo.cq), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.jS, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.aX, 0.1F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.iA, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.nl, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.ny, 0.08F), dur.b, cpo.bs.n()),
                  new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.kD.n()),
                  new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.m, 0.1F), dur.b, cpo.cn.n())))));
      a($$0, g, ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.m, 0.2F), dur.b, cpo.cn.n())))));
      a($$0, h, ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.m, 0.7F), dur.b, cpo.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.n.n()),
                  new dvi(new dvk(cpo.kE, 0.1F), dur.b, cpo.i.n()),
                  new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()),
                  new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.r.n()),
                  new dvi(new dvk(cpo.kE, 0.2F), dur.b, cpo.i.n()),
                  new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()),
                  new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.o.n()),
                  new dvi(new duw(cpo.kE), new duw(cpo.dO), cpo.o.n()),
                  new dvi(new dvk(cpo.kE, 0.2F), dur.b, cpo.i.n()),
                  new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()),
                  new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.cB, 0.3F), dur.b, cpo.gt.n()),
                  new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.gu.n()),
                  new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.gt.n()), new dvi(new dvk(cpo.cB, 0.8F), dur.b, cpo.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.cB, 0.3F), dur.b, cpo.fd.n()), new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.cB, 0.2F), dur.b, cpo.kD.n()), new dvi(new dvk(cpo.cB, 0.1F), dur.b, cpo.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new dux(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.kJ, 0.75F), dur.b, cpo.px.n()), new dvi(new dvk(cpo.px, 0.15F), dur.b, cpo.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.pw, 0.35F), dur.b, cpo.px.n()), new dvi(new dvk(cpo.py, 0.1F), dur.b, cpo.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.px.n()), new dvi(new dvk(cpo.pr, 1.0E-4F), dur.b, cpo.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.py, 0.5F), dur.b, cpo.a.n()), new dvi(new dvk(cpo.ch, 0.1F), dur.b, cpo.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.pw, 0.1F), dur.b, cpo.px.n()), new dvi(new dvk(cpo.pr, 1.0E-4F), dur.b, cpo.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.px.n()),
                  new dvi(new dvk(cpo.pr, 1.0E-4F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.ch, 0.3F), dur.b, cpo.px.n()),
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
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.pw, 0.4F), dur.b, cpo.px.n()),
                  new dvi(new dvk(cpo.pr, 0.01F), dur.b, cpo.px.n()),
                  new dvi(new dvk(cpo.pw, 1.0E-4F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.pr, 1.0E-4F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.ch, 0.3F), dur.b, cpo.px.n()),
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
            new dvm(ImmutableList.of(new dvi(new dvk(cpo.py, 0.5F), dur.b, cpo.a.n()), new dvi(new dvk(cpo.ch, 0.6F), dur.b, cpo.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dvm(ImmutableList.of(new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.px.n()), new dvi(new dvk(cpo.pr, 1.0E-4F), dur.b, cpo.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.px.n()),
                  new dvi(new dvk(cpo.pw, 0.15F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.pw, 0.01F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.pw, 0.5F), dur.b, cpo.px.n()),
                  new dvi(new dvk(cpo.pw, 0.3F), dur.b, cpo.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(new dvi(new dvk(cpo.ch, 0.3F), dur.b, cpo.px.n()), new dvi(dur.b, dur.b, new dus(0.0F, 0.05F, 0, 100, ha.a.b), cpo.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dux(0.9F), new dvj(amw.bF)));
      a($$0, E, ImmutableList.of(new dux(0.1F), new dvj(amw.bF)));
      a($$0, F, ImmutableList.of(new dux(0.1F), new dvm(ImmutableList.of(new dvi(new duw(cpo.R), dur.b, cpo.cy.n()))), new dvj(amw.bF)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.rV, 0.3F), dur.b, cpo.sa.n()),
                  new dvi(new dvk(cpo.rR, 0.3F), dur.b, cpo.sb.n()),
                  new dvi(new dvk(cpo.of, 0.05F), dur.b, cpo.a.n())
               )
            ),
            new dvj(amw.bF)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dux($$1.b(amw.bL), 0.95F),
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.rV, 0.3F), dur.b, cpo.sa.n()),
                  new dvi(new dvk(cpo.rR, 0.3F), dur.b, cpo.sb.n()),
                  new dvi(new dvk(cpo.of, 0.05F), dur.b, cpo.a.n())
               )
            ),
            new dvj(amw.bF)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dux($$1.b(amw.bL), 0.95F),
            new dvm(
               ImmutableList.of(
                  new dvi(new dvk(cpo.rV, 0.3F), dur.b, cpo.sa.n()),
                  new dvi(new dvk(cpo.rR, 0.3F), dur.b, cpo.sb.n()),
                  new dvi(new dvk(cpo.rT, 0.3F), dur.b, cpo.a.n()),
                  new dvi(new dvk(cpo.of, 0.05F), dur.b, cpo.a.n())
               )
            ),
            new dvj(amw.bF)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dvm(
               List.of(
                  new dvi(new dvk(cpo.L, 0.2F), dur.b, cpo.j.n()),
                  new dvi(new dvk(cpo.L, 0.1F), dur.b, cpo.k.n()),
                  new dvi(new dvk(cpo.eN, 0.1F), dur.b, cpo.eM.n())
               )
            ),
            a(dzg.aE, 6),
            a(dzg.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dvm(
               List.of(
                  new dvi(new dvk(cpo.L, 0.2F), dur.b, cpo.j.n()),
                  new dvi(new dvk(cpo.L, 0.1F), dur.b, cpo.k.n()),
                  new dvi(new dvk(cpo.eN, 0.1F), dur.b, cpo.eM.n())
               )
            ),
            a(dzg.aE, 2)
         )
      );
      a($$0, L, List.of(a(dzg.aE, 2)));
   }

   private static duz a(acq $$0, int $$1) {
      return new duz(new dvm(List.of(new dvi(new dvv(amw.cj), dur.b, dvf.b, cpo.M.n(), new dvx($$0)))), bcz.a($$1));
   }
}
