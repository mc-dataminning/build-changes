import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ald<emh> M = a("empty");
   public static final ald<emh> a = a("zombie_plains");
   public static final ald<emh> b = a("zombie_savanna");
   public static final ald<emh> c = a("zombie_snowy");
   public static final ald<emh> d = a("zombie_taiga");
   public static final ald<emh> e = a("zombie_desert");
   public static final ald<emh> f = a("mossify_10_percent");
   public static final ald<emh> g = a("mossify_20_percent");
   public static final ald<emh> h = a("mossify_70_percent");
   public static final ald<emh> i = a("street_plains");
   public static final ald<emh> j = a("street_savanna");
   public static final ald<emh> k = a("street_snowy_or_taiga");
   public static final ald<emh> l = a("farm_plains");
   public static final ald<emh> m = a("farm_savanna");
   public static final ald<emh> n = a("farm_snowy");
   public static final ald<emh> o = a("farm_taiga");
   public static final ald<emh> p = a("farm_desert");
   public static final ald<emh> q = a("outpost_rot");
   public static final ald<emh> r = a("bottom_rampart");
   public static final ald<emh> s = a("treasure_rooms");
   public static final ald<emh> t = a("housing");
   public static final ald<emh> u = a("side_wall_degradation");
   public static final ald<emh> v = a("stable_degradation");
   public static final ald<emh> w = a("bastion_generic_degradation");
   public static final ald<emh> x = a("rampart_degradation");
   public static final ald<emh> y = a("entrance_replacement");
   public static final ald<emh> z = a("bridge");
   public static final ald<emh> A = a("roof");
   public static final ald<emh> B = a("high_wall");
   public static final ald<emh> C = a("high_rampart");
   public static final ald<emh> D = a("fossil_rot");
   public static final ald<emh> E = a("fossil_coal");
   public static final ald<emh> F = a("fossil_diamonds");
   public static final ald<emh> G = a("ancient_city_start_degradation");
   public static final ald<emh> H = a("ancient_city_generic_degradation");
   public static final ald<emh> I = a("ancient_city_walls_degradation");
   public static final ald<emh> J = a("trail_ruins_houses_archaeology");
   public static final ald<emh> K = a("trail_ruins_roads_archaeology");
   public static final ald<emh> L = a("trail_ruins_tower_top_archaeology");

   private static ald<emh> a(String $$0) {
      return ald.a(lq.aK, new ale($$0));
   }

   private static void a(rc<emh> $$0, ald<emh> $$1, List<emg> $$2) {
      $$0.a($$1, new emh($$2));
   }

   public static void a(rc<emh> $$0) {
      jj<dey> $$1 = $$0.a(lq.f);
      ely $$2 = new ely(new ema(dfa.pr, 0.01F), elh.b, dfa.pC.o());
      ely $$3 = new ely(new ema(dfa.pC, 0.5F), elh.b, dfa.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.m, 0.8F), elh.b, dfa.cn.o()),
                  new ely(new eml(awo.p), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cp), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cq), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.m, 0.07F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.cn, 0.07F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.hj, 0.07F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.U, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.n, 0.1F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.cu, 0.1F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.al, 0.02F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.eY, 0.5F), elh.b, dfa.bs.o()),
                  new ely[]{
                     new ely(
                        new elo(dfa.eY.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))),
                        elh.b,
                        dfa.hL.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))
                     ),
                     new ely(
                        new elo(dfa.eY.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))),
                        elh.b,
                        dfa.hL.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))
                     ),
                     new ely(new ema(dfa.cB, 0.3F), elh.b, dfa.gt.o()),
                     new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.gu.o()),
                     new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new eml(awo.p), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cp), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cq), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.r, 0.2F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.hP, 0.2F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.Y, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.as, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.hk, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.hn, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.hx, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.eY, 0.5F), elh.b, dfa.bs.o()),
                  new ely(
                     new elo(dfa.eY.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))),
                     elh.b,
                     dfa.hL.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))
                  ),
                  new ely[]{
                     new ely(
                        new elo(dfa.eY.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))),
                        elh.b,
                        dfa.hL.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))
                     ),
                     new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new eml(awo.p), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cp), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cq), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.oe), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.o, 0.2F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.ju, 0.4F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.af, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.ax, 0.05F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.eY, 0.5F), elh.b, dfa.bs.o()),
                  new ely(
                     new elo(dfa.eY.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))),
                     elh.b,
                     dfa.hL.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))
                  ),
                  new ely(
                     new elo(dfa.eY.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))),
                     elh.b,
                     dfa.hL.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))
                  ),
                  new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.gt.o()),
                  new ely[]{new ely(new ema(dfa.cB, 0.8F), elh.b, dfa.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.m, 0.8F), elh.b, dfa.cn.o()),
                  new ely(new eml(awo.p), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cp), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cq), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.og), elh.b, dfa.og.o().a(dfm.c, Boolean.valueOf(false))),
                  new ely(new ema(dfa.m, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.V, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.eY, 0.5F), elh.b, dfa.bs.o()),
                  new ely(
                     new elo(dfa.eY.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))),
                     elh.b,
                     dfa.hL.o().a(diz.a, Boolean.valueOf(true)).a(diz.c, Boolean.valueOf(true))
                  ),
                  new ely(
                     new elo(dfa.eY.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))),
                     elh.b,
                     dfa.hL.o().a(diz.b, Boolean.valueOf(true)).a(diz.d, Boolean.valueOf(true))
                  ),
                  new ely(new ema(dfa.cB, 0.3F), elh.b, dfa.fd.o()),
                  new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.gu.o()),
                  new ely[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new eml(awo.p), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cp), elh.b, dfa.a.o()),
                  new ely(new elm(dfa.cq), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.jS, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.aX, 0.1F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.iA, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.nl, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.ny, 0.08F), elh.b, dfa.bs.o()),
                  new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.kD.o()),
                  new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.m, 0.1F), elh.b, dfa.cn.o())))));
      a($$0, g, ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.m, 0.2F), elh.b, dfa.cn.o())))));
      a($$0, h, ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.m, 0.7F), elh.b, dfa.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new elm(dfa.kE), new elm(dfa.G), dfa.n.o()),
                  new ely(new ema(dfa.kE, 0.1F), elh.b, dfa.i.o()),
                  new ely(new elm(dfa.i), new elm(dfa.G), dfa.G.o()),
                  new ely(new elm(dfa.j), new elm(dfa.G), dfa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new elm(dfa.kE), new elm(dfa.G), dfa.r.o()),
                  new ely(new ema(dfa.kE, 0.2F), elh.b, dfa.i.o()),
                  new ely(new elm(dfa.i), new elm(dfa.G), dfa.G.o()),
                  new ely(new elm(dfa.j), new elm(dfa.G), dfa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new elm(dfa.kE), new elm(dfa.G), dfa.o.o()),
                  new ely(new elm(dfa.kE), new elm(dfa.dO), dfa.o.o()),
                  new ely(new ema(dfa.kE, 0.2F), elh.b, dfa.i.o()),
                  new ely(new elm(dfa.i), new elm(dfa.G), dfa.G.o()),
                  new ely(new elm(dfa.j), new elm(dfa.G), dfa.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.cB, 0.3F), elh.b, dfa.gt.o()),
                  new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.gu.o()),
                  new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.gt.o()), new ely(new ema(dfa.cB, 0.8F), elh.b, dfa.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.cB, 0.3F), elh.b, dfa.fd.o()), new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.cB, 0.2F), elh.b, dfa.kD.o()), new ely(new ema(dfa.cB, 0.1F), elh.b, dfa.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eln(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emc(ImmutableList.of(new ely(new ema(dfa.kJ, 0.75F), elh.b, dfa.px.o()), new ely(new ema(dfa.px, 0.15F), elh.b, dfa.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emc(ImmutableList.of(new ely(new ema(dfa.pw, 0.35F), elh.b, dfa.px.o()), new ely(new ema(dfa.py, 0.1F), elh.b, dfa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emc(ImmutableList.of(new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.px.o()), new ely(new ema(dfa.pr, 1.0E-4F), elh.b, dfa.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emc(ImmutableList.of(new ely(new ema(dfa.py, 0.5F), elh.b, dfa.a.o()), new ely(new ema(dfa.ch, 0.1F), elh.b, dfa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emc(ImmutableList.of(new ely(new ema(dfa.pw, 0.1F), elh.b, dfa.px.o()), new ely(new ema(dfa.pr, 1.0E-4F), elh.b, dfa.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.px.o()),
                  new ely(new ema(dfa.pr, 1.0E-4F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.ch, 0.3F), elh.b, dfa.px.o()),
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
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.pw, 0.4F), elh.b, dfa.px.o()),
                  new ely(new ema(dfa.pr, 0.01F), elh.b, dfa.px.o()),
                  new ely(new ema(dfa.pw, 1.0E-4F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.pr, 1.0E-4F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.ch, 0.3F), elh.b, dfa.px.o()),
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
            new emc(ImmutableList.of(new ely(new ema(dfa.py, 0.5F), elh.b, dfa.a.o()), new ely(new ema(dfa.ch, 0.6F), elh.b, dfa.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emc(ImmutableList.of(new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.px.o()), new ely(new ema(dfa.pr, 1.0E-4F), elh.b, dfa.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.px.o()),
                  new ely(new ema(dfa.pw, 0.15F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.pw, 0.01F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.pw, 0.5F), elh.b, dfa.px.o()),
                  new ely(new ema(dfa.pw, 0.3F), elh.b, dfa.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emc(
               ImmutableList.of(new ely(new ema(dfa.ch, 0.3F), elh.b, dfa.px.o()), new ely(elh.b, elh.b, new eli(0.0F, 0.05F, 0, 100, je.a.b), dfa.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eln(0.9F), new elz(awo.bO)));
      a($$0, E, ImmutableList.of(new eln(0.1F), new elz(awo.bO)));
      a($$0, F, ImmutableList.of(new eln(0.1F), new emc(ImmutableList.of(new ely(new elm(dfa.R), elh.b, dfa.cy.o()))), new elz(awo.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.sW, 0.3F), elh.b, dfa.tb.o()),
                  new ely(new ema(dfa.sS, 0.3F), elh.b, dfa.tc.o()),
                  new ely(new ema(dfa.of, 0.05F), elh.b, dfa.a.o())
               )
            ),
            new elz(awo.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eln($$1.b(awo.bU), 0.95F),
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.sW, 0.3F), elh.b, dfa.tb.o()),
                  new ely(new ema(dfa.sS, 0.3F), elh.b, dfa.tc.o()),
                  new ely(new ema(dfa.of, 0.05F), elh.b, dfa.a.o())
               )
            ),
            new elz(awo.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eln($$1.b(awo.bU), 0.95F),
            new emc(
               ImmutableList.of(
                  new ely(new ema(dfa.sW, 0.3F), elh.b, dfa.tb.o()),
                  new ely(new ema(dfa.sS, 0.3F), elh.b, dfa.tc.o()),
                  new ely(new ema(dfa.sU, 0.3F), elh.b, dfa.a.o()),
                  new ely(new ema(dfa.of, 0.05F), elh.b, dfa.a.o())
               )
            ),
            new elz(awo.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emc(
               List.of(
                  new ely(new ema(dfa.L, 0.2F), elh.b, dfa.j.o()),
                  new ely(new ema(dfa.L, 0.1F), elh.b, dfa.k.o()),
                  new ely(new ema(dfa.eM, 0.1F), elh.b, dfa.eL.o())
               )
            ),
            a(eqd.bf, 6),
            a(eqd.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emc(
               List.of(
                  new ely(new ema(dfa.L, 0.2F), elh.b, dfa.j.o()),
                  new ely(new ema(dfa.L, 0.1F), elh.b, dfa.k.o()),
                  new ely(new ema(dfa.eM, 0.1F), elh.b, dfa.eL.o())
               )
            ),
            a(eqd.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqd.bf, 2)));
   }

   private static elp a(ald<eqm> $$0, int $$1) {
      return new elp(new emc(List.of(new ely(new eml(awo.ct), elh.b, elv.b, dfa.M.o(), new emn($$0)))), bpv.a($$1));
   }
}
