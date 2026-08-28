import com.google.common.collect.ImmutableList;
import java.util.List;

public class qu {
   private static final akj<emu> N = a("empty");
   public static final akj<emu> a = a("zombie_plains");
   public static final akj<emu> b = a("zombie_savanna");
   public static final akj<emu> c = a("zombie_snowy");
   public static final akj<emu> d = a("zombie_taiga");
   public static final akj<emu> e = a("zombie_desert");
   public static final akj<emu> f = a("mossify_10_percent");
   public static final akj<emu> g = a("mossify_20_percent");
   public static final akj<emu> h = a("mossify_70_percent");
   public static final akj<emu> i = a("street_plains");
   public static final akj<emu> j = a("street_savanna");
   public static final akj<emu> k = a("street_snowy_or_taiga");
   public static final akj<emu> l = a("farm_plains");
   public static final akj<emu> m = a("farm_savanna");
   public static final akj<emu> n = a("farm_snowy");
   public static final akj<emu> o = a("farm_taiga");
   public static final akj<emu> p = a("farm_desert");
   public static final akj<emu> q = a("outpost_rot");
   public static final akj<emu> r = a("bottom_rampart");
   public static final akj<emu> s = a("treasure_rooms");
   public static final akj<emu> t = a("housing");
   public static final akj<emu> u = a("side_wall_degradation");
   public static final akj<emu> v = a("stable_degradation");
   public static final akj<emu> w = a("bastion_generic_degradation");
   public static final akj<emu> x = a("rampart_degradation");
   public static final akj<emu> y = a("entrance_replacement");
   public static final akj<emu> z = a("bridge");
   public static final akj<emu> A = a("roof");
   public static final akj<emu> B = a("high_wall");
   public static final akj<emu> C = a("high_rampart");
   public static final akj<emu> D = a("fossil_rot");
   public static final akj<emu> E = a("fossil_coal");
   public static final akj<emu> F = a("fossil_diamonds");
   public static final akj<emu> G = a("ancient_city_start_degradation");
   public static final akj<emu> H = a("ancient_city_generic_degradation");
   public static final akj<emu> I = a("ancient_city_walls_degradation");
   public static final akj<emu> J = a("trail_ruins_houses_archaeology");
   public static final akj<emu> K = a("trail_ruins_roads_archaeology");
   public static final akj<emu> L = a("trail_ruins_tower_top_archaeology");
   public static final akj<emu> M = a("trial_chambers_copper_bulb_degradation");

   private static akj<emu> a(String $$0) {
      return akj.a(lr.aR, new akk($$0));
   }

   private static void a(qm<emu> $$0, akj<emu> $$1, List<emt> $$2) {
      $$0.a($$1, new emu($$2));
   }

   public static void a(qm<emu> $$0) {
      jk<dfh> $$1 = $$0.a(lr.f);
      eml $$2 = new eml(new emn(dfj.pr, 0.01F), elu.b, dfj.pC.o());
      eml $$3 = new eml(new emn(dfj.pC, 0.5F), elu.b, dfj.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.m, 0.8F), elu.b, dfj.cn.o()),
                  new eml(new emy(avw.p), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cp), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cq), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.m, 0.07F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.cn, 0.07F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.hj, 0.07F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.U, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.n, 0.1F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.cu, 0.1F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.al, 0.02F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.eY, 0.5F), elu.b, dfj.bs.o()),
                  new eml[]{
                     new eml(
                        new emb(dfj.eY.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))),
                        elu.b,
                        dfj.hL.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))
                     ),
                     new eml(
                        new emb(dfj.eY.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))),
                        elu.b,
                        dfj.hL.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))
                     ),
                     new eml(new emn(dfj.cB, 0.3F), elu.b, dfj.gt.o()),
                     new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.gu.o()),
                     new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emy(avw.p), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cp), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cq), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.r, 0.2F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.hP, 0.2F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.Y, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.as, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.hk, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.hn, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.hx, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.eY, 0.5F), elu.b, dfj.bs.o()),
                  new eml(
                     new emb(dfj.eY.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))),
                     elu.b,
                     dfj.hL.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))
                  ),
                  new eml[]{
                     new eml(
                        new emb(dfj.eY.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))),
                        elu.b,
                        dfj.hL.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))
                     ),
                     new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emy(avw.p), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cp), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cq), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.oe), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.o, 0.2F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.ju, 0.4F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.af, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.ax, 0.05F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.eY, 0.5F), elu.b, dfj.bs.o()),
                  new eml(
                     new emb(dfj.eY.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))),
                     elu.b,
                     dfj.hL.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))
                  ),
                  new eml(
                     new emb(dfj.eY.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))),
                     elu.b,
                     dfj.hL.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))
                  ),
                  new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.gt.o()),
                  new eml[]{new eml(new emn(dfj.cB, 0.8F), elu.b, dfj.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.m, 0.8F), elu.b, dfj.cn.o()),
                  new eml(new emy(avw.p), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cp), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cq), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.og), elu.b, dfj.og.o().a(dfv.c, Boolean.valueOf(false))),
                  new eml(new emn(dfj.m, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.V, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.eY, 0.5F), elu.b, dfj.bs.o()),
                  new eml(
                     new emb(dfj.eY.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))),
                     elu.b,
                     dfj.hL.o().a(dji.a, Boolean.valueOf(true)).a(dji.c, Boolean.valueOf(true))
                  ),
                  new eml(
                     new emb(dfj.eY.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))),
                     elu.b,
                     dfj.hL.o().a(dji.b, Boolean.valueOf(true)).a(dji.d, Boolean.valueOf(true))
                  ),
                  new eml(new emn(dfj.cB, 0.3F), elu.b, dfj.fd.o()),
                  new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.gu.o()),
                  new eml[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emy(avw.p), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cp), elu.b, dfj.a.o()),
                  new eml(new elz(dfj.cq), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.jS, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.aX, 0.1F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.iA, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.nl, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.ny, 0.08F), elu.b, dfj.bs.o()),
                  new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.kD.o()),
                  new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.m, 0.1F), elu.b, dfj.cn.o())))));
      a($$0, g, ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.m, 0.2F), elu.b, dfj.cn.o())))));
      a($$0, h, ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.m, 0.7F), elu.b, dfj.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new elz(dfj.kE), new elz(dfj.G), dfj.n.o()),
                  new eml(new emn(dfj.kE, 0.1F), elu.b, dfj.i.o()),
                  new eml(new elz(dfj.i), new elz(dfj.G), dfj.G.o()),
                  new eml(new elz(dfj.j), new elz(dfj.G), dfj.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new elz(dfj.kE), new elz(dfj.G), dfj.r.o()),
                  new eml(new emn(dfj.kE, 0.2F), elu.b, dfj.i.o()),
                  new eml(new elz(dfj.i), new elz(dfj.G), dfj.G.o()),
                  new eml(new elz(dfj.j), new elz(dfj.G), dfj.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new elz(dfj.kE), new elz(dfj.G), dfj.o.o()),
                  new eml(new elz(dfj.kE), new elz(dfj.dO), dfj.o.o()),
                  new eml(new emn(dfj.kE, 0.2F), elu.b, dfj.i.o()),
                  new eml(new elz(dfj.i), new elz(dfj.G), dfj.G.o()),
                  new eml(new elz(dfj.j), new elz(dfj.G), dfj.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.cB, 0.3F), elu.b, dfj.gt.o()),
                  new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.gu.o()),
                  new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.gt.o()), new eml(new emn(dfj.cB, 0.8F), elu.b, dfj.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.cB, 0.3F), elu.b, dfj.fd.o()), new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.cB, 0.2F), elu.b, dfj.kD.o()), new eml(new emn(dfj.cB, 0.1F), elu.b, dfj.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ema(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emp(ImmutableList.of(new eml(new emn(dfj.kJ, 0.75F), elu.b, dfj.px.o()), new eml(new emn(dfj.px, 0.15F), elu.b, dfj.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emp(ImmutableList.of(new eml(new emn(dfj.pw, 0.35F), elu.b, dfj.px.o()), new eml(new emn(dfj.py, 0.1F), elu.b, dfj.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emp(ImmutableList.of(new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.px.o()), new eml(new emn(dfj.pr, 1.0E-4F), elu.b, dfj.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emp(ImmutableList.of(new eml(new emn(dfj.py, 0.5F), elu.b, dfj.a.o()), new eml(new emn(dfj.ch, 0.1F), elu.b, dfj.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emp(ImmutableList.of(new eml(new emn(dfj.pw, 0.1F), elu.b, dfj.px.o()), new eml(new emn(dfj.pr, 1.0E-4F), elu.b, dfj.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.px.o()),
                  new eml(new emn(dfj.pr, 1.0E-4F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.ch, 0.3F), elu.b, dfj.px.o()),
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
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.pw, 0.4F), elu.b, dfj.px.o()),
                  new eml(new emn(dfj.pr, 0.01F), elu.b, dfj.px.o()),
                  new eml(new emn(dfj.pw, 1.0E-4F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.pr, 1.0E-4F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.ch, 0.3F), elu.b, dfj.px.o()),
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
            new emp(ImmutableList.of(new eml(new emn(dfj.py, 0.5F), elu.b, dfj.a.o()), new eml(new emn(dfj.ch, 0.6F), elu.b, dfj.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emp(ImmutableList.of(new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.px.o()), new eml(new emn(dfj.pr, 1.0E-4F), elu.b, dfj.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.px.o()),
                  new eml(new emn(dfj.pw, 0.15F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.pw, 0.01F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.pw, 0.5F), elu.b, dfj.px.o()),
                  new eml(new emn(dfj.pw, 0.3F), elu.b, dfj.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emp(
               ImmutableList.of(new eml(new emn(dfj.ch, 0.3F), elu.b, dfj.px.o()), new eml(elu.b, elu.b, new elv(0.0F, 0.05F, 0, 100, jf.a.b), dfj.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ema(0.9F), new emm(avw.bO)));
      a($$0, E, ImmutableList.of(new ema(0.1F), new emm(avw.bO)));
      a($$0, F, ImmutableList.of(new ema(0.1F), new emp(ImmutableList.of(new eml(new elz(dfj.R), elu.b, dfj.cy.o()))), new emm(avw.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.sW, 0.3F), elu.b, dfj.tb.o()),
                  new eml(new emn(dfj.sS, 0.3F), elu.b, dfj.tc.o()),
                  new eml(new emn(dfj.of, 0.05F), elu.b, dfj.a.o())
               )
            ),
            new emm(avw.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ema($$1.b(avw.bU), 0.95F),
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.sW, 0.3F), elu.b, dfj.tb.o()),
                  new eml(new emn(dfj.sS, 0.3F), elu.b, dfj.tc.o()),
                  new eml(new emn(dfj.of, 0.05F), elu.b, dfj.a.o())
               )
            ),
            new emm(avw.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ema($$1.b(avw.bU), 0.95F),
            new emp(
               ImmutableList.of(
                  new eml(new emn(dfj.sW, 0.3F), elu.b, dfj.tb.o()),
                  new eml(new emn(dfj.sS, 0.3F), elu.b, dfj.tc.o()),
                  new eml(new emn(dfj.sU, 0.3F), elu.b, dfj.a.o()),
                  new eml(new emn(dfj.of, 0.05F), elu.b, dfj.a.o())
               )
            ),
            new emm(avw.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emp(
               List.of(
                  new eml(new emn(dfj.L, 0.2F), elu.b, dfj.j.o()),
                  new eml(new emn(dfj.L, 0.1F), elu.b, dfj.k.o()),
                  new eml(new emn(dfj.eM, 0.1F), elu.b, dfj.eL.o())
               )
            ),
            a(eqq.bf, 6),
            a(eqq.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emp(
               List.of(
                  new eml(new emn(dfj.L, 0.2F), elu.b, dfj.j.o()),
                  new eml(new emn(dfj.L, 0.1F), elu.b, dfj.k.o()),
                  new eml(new emn(dfj.eM, 0.1F), elu.b, dfj.eL.o())
               )
            ),
            a(eqq.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqq.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new emp(
               List.of(
                  new eml(new emn(dfj.so, 0.1F), elu.b, dfj.sr.o().a(dgv.c, Boolean.valueOf(true))),
                  new eml(new emn(dfj.so, 0.33333334F), elu.b, dfj.sq.o().a(dgv.c, Boolean.valueOf(true))),
                  new eml(new emn(dfj.so, 0.5F), elu.b, dfj.sp.o().a(dgv.c, Boolean.valueOf(true)))
               )
            ),
            new emm(avw.bO)
         )
      );
   }

   private static emc a(akj<eqz> $$0, int $$1) {
      return new emc(new emp(List.of(new eml(new emy(avw.ct), elu.b, emi.b, dfj.M.o(), new ena($$0)))), bpi.a($$1));
   }
}
