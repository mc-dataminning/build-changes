import com.google.common.collect.ImmutableList;
import java.util.List;

public class qu {
   private static final akj<emo> N = a("empty");
   public static final akj<emo> a = a("zombie_plains");
   public static final akj<emo> b = a("zombie_savanna");
   public static final akj<emo> c = a("zombie_snowy");
   public static final akj<emo> d = a("zombie_taiga");
   public static final akj<emo> e = a("zombie_desert");
   public static final akj<emo> f = a("mossify_10_percent");
   public static final akj<emo> g = a("mossify_20_percent");
   public static final akj<emo> h = a("mossify_70_percent");
   public static final akj<emo> i = a("street_plains");
   public static final akj<emo> j = a("street_savanna");
   public static final akj<emo> k = a("street_snowy_or_taiga");
   public static final akj<emo> l = a("farm_plains");
   public static final akj<emo> m = a("farm_savanna");
   public static final akj<emo> n = a("farm_snowy");
   public static final akj<emo> o = a("farm_taiga");
   public static final akj<emo> p = a("farm_desert");
   public static final akj<emo> q = a("outpost_rot");
   public static final akj<emo> r = a("bottom_rampart");
   public static final akj<emo> s = a("treasure_rooms");
   public static final akj<emo> t = a("housing");
   public static final akj<emo> u = a("side_wall_degradation");
   public static final akj<emo> v = a("stable_degradation");
   public static final akj<emo> w = a("bastion_generic_degradation");
   public static final akj<emo> x = a("rampart_degradation");
   public static final akj<emo> y = a("entrance_replacement");
   public static final akj<emo> z = a("bridge");
   public static final akj<emo> A = a("roof");
   public static final akj<emo> B = a("high_wall");
   public static final akj<emo> C = a("high_rampart");
   public static final akj<emo> D = a("fossil_rot");
   public static final akj<emo> E = a("fossil_coal");
   public static final akj<emo> F = a("fossil_diamonds");
   public static final akj<emo> G = a("ancient_city_start_degradation");
   public static final akj<emo> H = a("ancient_city_generic_degradation");
   public static final akj<emo> I = a("ancient_city_walls_degradation");
   public static final akj<emo> J = a("trail_ruins_houses_archaeology");
   public static final akj<emo> K = a("trail_ruins_roads_archaeology");
   public static final akj<emo> L = a("trail_ruins_tower_top_archaeology");
   public static final akj<emo> M = a("trial_chambers_copper_bulb_degradation");

   private static akj<emo> a(String $$0) {
      return akj.a(lr.aR, new akk($$0));
   }

   private static void a(qm<emo> $$0, akj<emo> $$1, List<emn> $$2) {
      $$0.a($$1, new emo($$2));
   }

   public static void a(qm<emo> $$0) {
      jk<dff> $$1 = $$0.a(lr.f);
      emf $$2 = new emf(new emh(dfh.pr, 0.01F), elo.b, dfh.pC.o());
      emf $$3 = new emf(new emh(dfh.pC, 0.5F), elo.b, dfh.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.m, 0.8F), elo.b, dfh.cn.o()),
                  new emf(new ems(avu.p), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cp), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cq), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.m, 0.07F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.cn, 0.07F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.hj, 0.07F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.U, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.n, 0.1F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.cu, 0.1F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.al, 0.02F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.eY, 0.5F), elo.b, dfh.bs.o()),
                  new emf[]{
                     new emf(
                        new elv(dfh.eY.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))),
                        elo.b,
                        dfh.hL.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))
                     ),
                     new emf(
                        new elv(dfh.eY.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))),
                        elo.b,
                        dfh.hL.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))
                     ),
                     new emf(new emh(dfh.cB, 0.3F), elo.b, dfh.gt.o()),
                     new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.gu.o()),
                     new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new ems(avu.p), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cp), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cq), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.r, 0.2F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.hP, 0.2F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.Y, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.as, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.hk, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.hn, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.hx, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.eY, 0.5F), elo.b, dfh.bs.o()),
                  new emf(
                     new elv(dfh.eY.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))),
                     elo.b,
                     dfh.hL.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))
                  ),
                  new emf[]{
                     new emf(
                        new elv(dfh.eY.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))),
                        elo.b,
                        dfh.hL.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))
                     ),
                     new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new ems(avu.p), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cp), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cq), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.oe), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.o, 0.2F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.ju, 0.4F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.af, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.ax, 0.05F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.eY, 0.5F), elo.b, dfh.bs.o()),
                  new emf(
                     new elv(dfh.eY.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))),
                     elo.b,
                     dfh.hL.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))
                  ),
                  new emf(
                     new elv(dfh.eY.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))),
                     elo.b,
                     dfh.hL.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))
                  ),
                  new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.gt.o()),
                  new emf[]{new emf(new emh(dfh.cB, 0.8F), elo.b, dfh.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.m, 0.8F), elo.b, dfh.cn.o()),
                  new emf(new ems(avu.p), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cp), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cq), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.og), elo.b, dfh.og.o().a(dft.c, Boolean.valueOf(false))),
                  new emf(new emh(dfh.m, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.V, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.eY, 0.5F), elo.b, dfh.bs.o()),
                  new emf(
                     new elv(dfh.eY.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))),
                     elo.b,
                     dfh.hL.o().a(djg.a, Boolean.valueOf(true)).a(djg.c, Boolean.valueOf(true))
                  ),
                  new emf(
                     new elv(dfh.eY.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))),
                     elo.b,
                     dfh.hL.o().a(djg.b, Boolean.valueOf(true)).a(djg.d, Boolean.valueOf(true))
                  ),
                  new emf(new emh(dfh.cB, 0.3F), elo.b, dfh.fd.o()),
                  new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.gu.o()),
                  new emf[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new ems(avu.p), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cp), elo.b, dfh.a.o()),
                  new emf(new elt(dfh.cq), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.jS, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.aX, 0.1F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.iA, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.nl, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.ny, 0.08F), elo.b, dfh.bs.o()),
                  new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.kD.o()),
                  new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.m, 0.1F), elo.b, dfh.cn.o())))));
      a($$0, g, ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.m, 0.2F), elo.b, dfh.cn.o())))));
      a($$0, h, ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.m, 0.7F), elo.b, dfh.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new elt(dfh.kE), new elt(dfh.G), dfh.n.o()),
                  new emf(new emh(dfh.kE, 0.1F), elo.b, dfh.i.o()),
                  new emf(new elt(dfh.i), new elt(dfh.G), dfh.G.o()),
                  new emf(new elt(dfh.j), new elt(dfh.G), dfh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new elt(dfh.kE), new elt(dfh.G), dfh.r.o()),
                  new emf(new emh(dfh.kE, 0.2F), elo.b, dfh.i.o()),
                  new emf(new elt(dfh.i), new elt(dfh.G), dfh.G.o()),
                  new emf(new elt(dfh.j), new elt(dfh.G), dfh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new elt(dfh.kE), new elt(dfh.G), dfh.o.o()),
                  new emf(new elt(dfh.kE), new elt(dfh.dO), dfh.o.o()),
                  new emf(new emh(dfh.kE, 0.2F), elo.b, dfh.i.o()),
                  new emf(new elt(dfh.i), new elt(dfh.G), dfh.G.o()),
                  new emf(new elt(dfh.j), new elt(dfh.G), dfh.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.cB, 0.3F), elo.b, dfh.gt.o()),
                  new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.gu.o()),
                  new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.gt.o()), new emf(new emh(dfh.cB, 0.8F), elo.b, dfh.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.cB, 0.3F), elo.b, dfh.fd.o()), new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.cB, 0.2F), elo.b, dfh.kD.o()), new emf(new emh(dfh.cB, 0.1F), elo.b, dfh.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new elu(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emj(ImmutableList.of(new emf(new emh(dfh.kJ, 0.75F), elo.b, dfh.px.o()), new emf(new emh(dfh.px, 0.15F), elo.b, dfh.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emj(ImmutableList.of(new emf(new emh(dfh.pw, 0.35F), elo.b, dfh.px.o()), new emf(new emh(dfh.py, 0.1F), elo.b, dfh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emj(ImmutableList.of(new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.px.o()), new emf(new emh(dfh.pr, 1.0E-4F), elo.b, dfh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emj(ImmutableList.of(new emf(new emh(dfh.py, 0.5F), elo.b, dfh.a.o()), new emf(new emh(dfh.ch, 0.1F), elo.b, dfh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emj(ImmutableList.of(new emf(new emh(dfh.pw, 0.1F), elo.b, dfh.px.o()), new emf(new emh(dfh.pr, 1.0E-4F), elo.b, dfh.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.px.o()),
                  new emf(new emh(dfh.pr, 1.0E-4F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.ch, 0.3F), elo.b, dfh.px.o()),
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
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.pw, 0.4F), elo.b, dfh.px.o()),
                  new emf(new emh(dfh.pr, 0.01F), elo.b, dfh.px.o()),
                  new emf(new emh(dfh.pw, 1.0E-4F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.pr, 1.0E-4F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.ch, 0.3F), elo.b, dfh.px.o()),
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
            new emj(ImmutableList.of(new emf(new emh(dfh.py, 0.5F), elo.b, dfh.a.o()), new emf(new emh(dfh.ch, 0.6F), elo.b, dfh.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emj(ImmutableList.of(new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.px.o()), new emf(new emh(dfh.pr, 1.0E-4F), elo.b, dfh.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.px.o()),
                  new emf(new emh(dfh.pw, 0.15F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.pw, 0.01F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.pw, 0.5F), elo.b, dfh.px.o()),
                  new emf(new emh(dfh.pw, 0.3F), elo.b, dfh.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emj(
               ImmutableList.of(new emf(new emh(dfh.ch, 0.3F), elo.b, dfh.px.o()), new emf(elo.b, elo.b, new elp(0.0F, 0.05F, 0, 100, jf.a.b), dfh.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elu(0.9F), new emg(avu.bO)));
      a($$0, E, ImmutableList.of(new elu(0.1F), new emg(avu.bO)));
      a($$0, F, ImmutableList.of(new elu(0.1F), new emj(ImmutableList.of(new emf(new elt(dfh.R), elo.b, dfh.cy.o()))), new emg(avu.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.sW, 0.3F), elo.b, dfh.tb.o()),
                  new emf(new emh(dfh.sS, 0.3F), elo.b, dfh.tc.o()),
                  new emf(new emh(dfh.of, 0.05F), elo.b, dfh.a.o())
               )
            ),
            new emg(avu.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elu($$1.b(avu.bU), 0.95F),
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.sW, 0.3F), elo.b, dfh.tb.o()),
                  new emf(new emh(dfh.sS, 0.3F), elo.b, dfh.tc.o()),
                  new emf(new emh(dfh.of, 0.05F), elo.b, dfh.a.o())
               )
            ),
            new emg(avu.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elu($$1.b(avu.bU), 0.95F),
            new emj(
               ImmutableList.of(
                  new emf(new emh(dfh.sW, 0.3F), elo.b, dfh.tb.o()),
                  new emf(new emh(dfh.sS, 0.3F), elo.b, dfh.tc.o()),
                  new emf(new emh(dfh.sU, 0.3F), elo.b, dfh.a.o()),
                  new emf(new emh(dfh.of, 0.05F), elo.b, dfh.a.o())
               )
            ),
            new emg(avu.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emj(
               List.of(
                  new emf(new emh(dfh.L, 0.2F), elo.b, dfh.j.o()),
                  new emf(new emh(dfh.L, 0.1F), elo.b, dfh.k.o()),
                  new emf(new emh(dfh.eM, 0.1F), elo.b, dfh.eL.o())
               )
            ),
            a(eqk.bf, 6),
            a(eqk.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emj(
               List.of(
                  new emf(new emh(dfh.L, 0.2F), elo.b, dfh.j.o()),
                  new emf(new emh(dfh.L, 0.1F), elo.b, dfh.k.o()),
                  new emf(new emh(dfh.eM, 0.1F), elo.b, dfh.eL.o())
               )
            ),
            a(eqk.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqk.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new emj(
               List.of(
                  new emf(new emh(dfh.so, 0.1F), elo.b, dfh.sr.o().a(dgt.c, Boolean.valueOf(true))),
                  new emf(new emh(dfh.so, 0.33333334F), elo.b, dfh.sq.o().a(dgt.c, Boolean.valueOf(true))),
                  new emf(new emh(dfh.so, 0.5F), elo.b, dfh.sp.o().a(dgt.c, Boolean.valueOf(true)))
               )
            ),
            new emg(avu.bO)
         )
      );
   }

   private static elw a(akj<eqt> $$0, int $$1) {
      return new elw(new emj(List.of(new emf(new ems(avu.ct), elo.b, emc.b, dfh.M.o(), new emu($$0)))), bpf.a($$1));
   }
}
