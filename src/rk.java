import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ale<emj> M = a("empty");
   public static final ale<emj> a = a("zombie_plains");
   public static final ale<emj> b = a("zombie_savanna");
   public static final ale<emj> c = a("zombie_snowy");
   public static final ale<emj> d = a("zombie_taiga");
   public static final ale<emj> e = a("zombie_desert");
   public static final ale<emj> f = a("mossify_10_percent");
   public static final ale<emj> g = a("mossify_20_percent");
   public static final ale<emj> h = a("mossify_70_percent");
   public static final ale<emj> i = a("street_plains");
   public static final ale<emj> j = a("street_savanna");
   public static final ale<emj> k = a("street_snowy_or_taiga");
   public static final ale<emj> l = a("farm_plains");
   public static final ale<emj> m = a("farm_savanna");
   public static final ale<emj> n = a("farm_snowy");
   public static final ale<emj> o = a("farm_taiga");
   public static final ale<emj> p = a("farm_desert");
   public static final ale<emj> q = a("outpost_rot");
   public static final ale<emj> r = a("bottom_rampart");
   public static final ale<emj> s = a("treasure_rooms");
   public static final ale<emj> t = a("housing");
   public static final ale<emj> u = a("side_wall_degradation");
   public static final ale<emj> v = a("stable_degradation");
   public static final ale<emj> w = a("bastion_generic_degradation");
   public static final ale<emj> x = a("rampart_degradation");
   public static final ale<emj> y = a("entrance_replacement");
   public static final ale<emj> z = a("bridge");
   public static final ale<emj> A = a("roof");
   public static final ale<emj> B = a("high_wall");
   public static final ale<emj> C = a("high_rampart");
   public static final ale<emj> D = a("fossil_rot");
   public static final ale<emj> E = a("fossil_coal");
   public static final ale<emj> F = a("fossil_diamonds");
   public static final ale<emj> G = a("ancient_city_start_degradation");
   public static final ale<emj> H = a("ancient_city_generic_degradation");
   public static final ale<emj> I = a("ancient_city_walls_degradation");
   public static final ale<emj> J = a("trail_ruins_houses_archaeology");
   public static final ale<emj> K = a("trail_ruins_roads_archaeology");
   public static final ale<emj> L = a("trail_ruins_tower_top_archaeology");

   private static ale<emj> a(String $$0) {
      return ale.a(lq.aK, new alf($$0));
   }

   private static void a(rc<emj> $$0, ale<emj> $$1, List<emi> $$2) {
      $$0.a($$1, new emj($$2));
   }

   public static void a(rc<emj> $$0) {
      jj<dfa> $$1 = $$0.a(lq.f);
      ema $$2 = new ema(new emc(dfc.pr, 0.01F), elj.b, dfc.pC.o());
      ema $$3 = new ema(new emc(dfc.pC, 0.5F), elj.b, dfc.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.m, 0.8F), elj.b, dfc.cn.o()),
                  new ema(new emn(awp.p), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cp), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cq), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.m, 0.07F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.cn, 0.07F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.hj, 0.07F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.U, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.n, 0.1F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.cu, 0.1F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.al, 0.02F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.eY, 0.5F), elj.b, dfc.bs.o()),
                  new ema[]{
                     new ema(
                        new elq(dfc.eY.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))),
                        elj.b,
                        dfc.hL.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))
                     ),
                     new ema(
                        new elq(dfc.eY.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))),
                        elj.b,
                        dfc.hL.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))
                     ),
                     new ema(new emc(dfc.cB, 0.3F), elj.b, dfc.gt.o()),
                     new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.gu.o()),
                     new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emn(awp.p), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cp), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cq), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.r, 0.2F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.hP, 0.2F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.Y, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.as, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.hk, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.hn, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.hx, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.eY, 0.5F), elj.b, dfc.bs.o()),
                  new ema(
                     new elq(dfc.eY.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))),
                     elj.b,
                     dfc.hL.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))
                  ),
                  new ema[]{
                     new ema(
                        new elq(dfc.eY.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))),
                        elj.b,
                        dfc.hL.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))
                     ),
                     new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emn(awp.p), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cp), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cq), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.oe), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.o, 0.2F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.ju, 0.4F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.af, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.ax, 0.05F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.eY, 0.5F), elj.b, dfc.bs.o()),
                  new ema(
                     new elq(dfc.eY.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))),
                     elj.b,
                     dfc.hL.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))
                  ),
                  new ema(
                     new elq(dfc.eY.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))),
                     elj.b,
                     dfc.hL.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))
                  ),
                  new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.gt.o()),
                  new ema[]{new ema(new emc(dfc.cB, 0.8F), elj.b, dfc.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.m, 0.8F), elj.b, dfc.cn.o()),
                  new ema(new emn(awp.p), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cp), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cq), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.og), elj.b, dfc.og.o().a(dfo.c, Boolean.valueOf(false))),
                  new ema(new emc(dfc.m, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.V, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.eY, 0.5F), elj.b, dfc.bs.o()),
                  new ema(
                     new elq(dfc.eY.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))),
                     elj.b,
                     dfc.hL.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true))
                  ),
                  new ema(
                     new elq(dfc.eY.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))),
                     elj.b,
                     dfc.hL.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true))
                  ),
                  new ema(new emc(dfc.cB, 0.3F), elj.b, dfc.fd.o()),
                  new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.gu.o()),
                  new ema[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emn(awp.p), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cp), elj.b, dfc.a.o()),
                  new ema(new elo(dfc.cq), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.jS, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.aX, 0.1F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.iA, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.nl, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.ny, 0.08F), elj.b, dfc.bs.o()),
                  new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.kD.o()),
                  new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.m, 0.1F), elj.b, dfc.cn.o())))));
      a($$0, g, ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.m, 0.2F), elj.b, dfc.cn.o())))));
      a($$0, h, ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.m, 0.7F), elj.b, dfc.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new elo(dfc.kE), new elo(dfc.G), dfc.n.o()),
                  new ema(new emc(dfc.kE, 0.1F), elj.b, dfc.i.o()),
                  new ema(new elo(dfc.i), new elo(dfc.G), dfc.G.o()),
                  new ema(new elo(dfc.j), new elo(dfc.G), dfc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new elo(dfc.kE), new elo(dfc.G), dfc.r.o()),
                  new ema(new emc(dfc.kE, 0.2F), elj.b, dfc.i.o()),
                  new ema(new elo(dfc.i), new elo(dfc.G), dfc.G.o()),
                  new ema(new elo(dfc.j), new elo(dfc.G), dfc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new elo(dfc.kE), new elo(dfc.G), dfc.o.o()),
                  new ema(new elo(dfc.kE), new elo(dfc.dO), dfc.o.o()),
                  new ema(new emc(dfc.kE, 0.2F), elj.b, dfc.i.o()),
                  new ema(new elo(dfc.i), new elo(dfc.G), dfc.G.o()),
                  new ema(new elo(dfc.j), new elo(dfc.G), dfc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.cB, 0.3F), elj.b, dfc.gt.o()),
                  new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.gu.o()),
                  new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.gt.o()), new ema(new emc(dfc.cB, 0.8F), elj.b, dfc.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.cB, 0.3F), elj.b, dfc.fd.o()), new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.cB, 0.2F), elj.b, dfc.kD.o()), new ema(new emc(dfc.cB, 0.1F), elj.b, dfc.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new elp(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eme(ImmutableList.of(new ema(new emc(dfc.kJ, 0.75F), elj.b, dfc.px.o()), new ema(new emc(dfc.px, 0.15F), elj.b, dfc.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eme(ImmutableList.of(new ema(new emc(dfc.pw, 0.35F), elj.b, dfc.px.o()), new ema(new emc(dfc.py, 0.1F), elj.b, dfc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eme(ImmutableList.of(new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.px.o()), new ema(new emc(dfc.pr, 1.0E-4F), elj.b, dfc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eme(ImmutableList.of(new ema(new emc(dfc.py, 0.5F), elj.b, dfc.a.o()), new ema(new emc(dfc.ch, 0.1F), elj.b, dfc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eme(ImmutableList.of(new ema(new emc(dfc.pw, 0.1F), elj.b, dfc.px.o()), new ema(new emc(dfc.pr, 1.0E-4F), elj.b, dfc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.px.o()),
                  new ema(new emc(dfc.pr, 1.0E-4F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.ch, 0.3F), elj.b, dfc.px.o()),
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
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.pw, 0.4F), elj.b, dfc.px.o()),
                  new ema(new emc(dfc.pr, 0.01F), elj.b, dfc.px.o()),
                  new ema(new emc(dfc.pw, 1.0E-4F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.pr, 1.0E-4F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.ch, 0.3F), elj.b, dfc.px.o()),
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
            new eme(ImmutableList.of(new ema(new emc(dfc.py, 0.5F), elj.b, dfc.a.o()), new ema(new emc(dfc.ch, 0.6F), elj.b, dfc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eme(ImmutableList.of(new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.px.o()), new ema(new emc(dfc.pr, 1.0E-4F), elj.b, dfc.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.px.o()),
                  new ema(new emc(dfc.pw, 0.15F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.pw, 0.01F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.pw, 0.5F), elj.b, dfc.px.o()),
                  new ema(new emc(dfc.pw, 0.3F), elj.b, dfc.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eme(
               ImmutableList.of(new ema(new emc(dfc.ch, 0.3F), elj.b, dfc.px.o()), new ema(elj.b, elj.b, new elk(0.0F, 0.05F, 0, 100, je.a.b), dfc.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elp(0.9F), new emb(awp.bO)));
      a($$0, E, ImmutableList.of(new elp(0.1F), new emb(awp.bO)));
      a($$0, F, ImmutableList.of(new elp(0.1F), new eme(ImmutableList.of(new ema(new elo(dfc.R), elj.b, dfc.cy.o()))), new emb(awp.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.sW, 0.3F), elj.b, dfc.tb.o()),
                  new ema(new emc(dfc.sS, 0.3F), elj.b, dfc.tc.o()),
                  new ema(new emc(dfc.of, 0.05F), elj.b, dfc.a.o())
               )
            ),
            new emb(awp.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elp($$1.b(awp.bU), 0.95F),
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.sW, 0.3F), elj.b, dfc.tb.o()),
                  new ema(new emc(dfc.sS, 0.3F), elj.b, dfc.tc.o()),
                  new ema(new emc(dfc.of, 0.05F), elj.b, dfc.a.o())
               )
            ),
            new emb(awp.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elp($$1.b(awp.bU), 0.95F),
            new eme(
               ImmutableList.of(
                  new ema(new emc(dfc.sW, 0.3F), elj.b, dfc.tb.o()),
                  new ema(new emc(dfc.sS, 0.3F), elj.b, dfc.tc.o()),
                  new ema(new emc(dfc.sU, 0.3F), elj.b, dfc.a.o()),
                  new ema(new emc(dfc.of, 0.05F), elj.b, dfc.a.o())
               )
            ),
            new emb(awp.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eme(
               List.of(
                  new ema(new emc(dfc.L, 0.2F), elj.b, dfc.j.o()),
                  new ema(new emc(dfc.L, 0.1F), elj.b, dfc.k.o()),
                  new ema(new emc(dfc.eM, 0.1F), elj.b, dfc.eL.o())
               )
            ),
            a(eqf.bf, 6),
            a(eqf.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eme(
               List.of(
                  new ema(new emc(dfc.L, 0.2F), elj.b, dfc.j.o()),
                  new ema(new emc(dfc.L, 0.1F), elj.b, dfc.k.o()),
                  new ema(new emc(dfc.eM, 0.1F), elj.b, dfc.eL.o())
               )
            ),
            a(eqf.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqf.bf, 2)));
   }

   private static elr a(ale<eqo> $$0, int $$1) {
      return new elr(new eme(List.of(new ema(new emn(awp.ct), elj.b, elx.b, dfc.M.o(), new emp($$0)))), bpx.a($$1));
   }
}
