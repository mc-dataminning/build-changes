import com.google.common.collect.ImmutableList;
import java.util.List;

public class rf {
   private static final alg<epr> N = a("empty");
   public static final alg<epr> a = a("zombie_plains");
   public static final alg<epr> b = a("zombie_savanna");
   public static final alg<epr> c = a("zombie_snowy");
   public static final alg<epr> d = a("zombie_taiga");
   public static final alg<epr> e = a("zombie_desert");
   public static final alg<epr> f = a("mossify_10_percent");
   public static final alg<epr> g = a("mossify_20_percent");
   public static final alg<epr> h = a("mossify_70_percent");
   public static final alg<epr> i = a("street_plains");
   public static final alg<epr> j = a("street_savanna");
   public static final alg<epr> k = a("street_snowy_or_taiga");
   public static final alg<epr> l = a("farm_plains");
   public static final alg<epr> m = a("farm_savanna");
   public static final alg<epr> n = a("farm_snowy");
   public static final alg<epr> o = a("farm_taiga");
   public static final alg<epr> p = a("farm_desert");
   public static final alg<epr> q = a("outpost_rot");
   public static final alg<epr> r = a("bottom_rampart");
   public static final alg<epr> s = a("treasure_rooms");
   public static final alg<epr> t = a("housing");
   public static final alg<epr> u = a("side_wall_degradation");
   public static final alg<epr> v = a("stable_degradation");
   public static final alg<epr> w = a("bastion_generic_degradation");
   public static final alg<epr> x = a("rampart_degradation");
   public static final alg<epr> y = a("entrance_replacement");
   public static final alg<epr> z = a("bridge");
   public static final alg<epr> A = a("roof");
   public static final alg<epr> B = a("high_wall");
   public static final alg<epr> C = a("high_rampart");
   public static final alg<epr> D = a("fossil_rot");
   public static final alg<epr> E = a("fossil_coal");
   public static final alg<epr> F = a("fossil_diamonds");
   public static final alg<epr> G = a("ancient_city_start_degradation");
   public static final alg<epr> H = a("ancient_city_generic_degradation");
   public static final alg<epr> I = a("ancient_city_walls_degradation");
   public static final alg<epr> J = a("trail_ruins_houses_archaeology");
   public static final alg<epr> K = a("trail_ruins_roads_archaeology");
   public static final alg<epr> L = a("trail_ruins_tower_top_archaeology");
   public static final alg<epr> M = a("trial_chambers_copper_bulb_degradation");

   private static alg<epr> a(String $$0) {
      return alg.a(ly.aT, alh.b($$0));
   }

   private static void a(qx<epr> $$0, alg<epr> $$1, List<epq> $$2) {
      $$0.a($$1, new epr($$2));
   }

   public static void a(qx<epr> $$0) {
      jq<dhy> $$1 = $$0.a(ly.f);
      epi $$2 = new epi(new epk(dia.pr, 0.01F), eoq.b, dia.pC.m());
      epi $$3 = new epi(new epk(dia.pC, 0.5F), eoq.b, dia.pr.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.m, 0.8F), eoq.b, dia.cn.m()),
                  new epi(new epv(awz.q), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cp), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cq), eoq.b, dia.a.m()),
                  new epi(new epk(dia.m, 0.07F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.cn, 0.07F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.hj, 0.07F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.U, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.n, 0.1F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.cu, 0.1F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.al, 0.02F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.eY, 0.5F), eoq.b, dia.bs.m()),
                  new epi[]{
                     new epi(
                        new eox(dia.eY.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))),
                        eoq.b,
                        dia.hL.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))
                     ),
                     new epi(
                        new eox(dia.eY.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))),
                        eoq.b,
                        dia.hL.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))
                     ),
                     new epi(new epk(dia.cB, 0.3F), eoq.b, dia.gt.m()),
                     new epi(new epk(dia.cB, 0.2F), eoq.b, dia.gu.m()),
                     new epi(new epk(dia.cB, 0.1F), eoq.b, dia.kD.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epv(awz.q), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cp), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cq), eoq.b, dia.a.m()),
                  new epi(new epk(dia.r, 0.2F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.hP, 0.2F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.Y, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.as, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.hk, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.hn, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.hx, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.eY, 0.5F), eoq.b, dia.bs.m()),
                  new epi(
                     new eox(dia.eY.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))),
                     eoq.b,
                     dia.hL.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))
                  ),
                  new epi[]{
                     new epi(
                        new eox(dia.eY.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))),
                        eoq.b,
                        dia.hL.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))
                     ),
                     new epi(new epk(dia.cB, 0.1F), eoq.b, dia.fe.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epv(awz.q), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cp), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cq), eoq.b, dia.a.m()),
                  new epi(new eov(dia.oe), eoq.b, dia.a.m()),
                  new epi(new epk(dia.o, 0.2F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.ju, 0.4F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.af, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.ax, 0.05F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.eY, 0.5F), eoq.b, dia.bs.m()),
                  new epi(
                     new eox(dia.eY.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))),
                     eoq.b,
                     dia.hL.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))
                  ),
                  new epi(
                     new eox(dia.eY.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))),
                     eoq.b,
                     dia.hL.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))
                  ),
                  new epi(new epk(dia.cB, 0.1F), eoq.b, dia.gt.m()),
                  new epi[]{new epi(new epk(dia.cB, 0.8F), eoq.b, dia.gu.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.m, 0.8F), eoq.b, dia.cn.m()),
                  new epi(new epv(awz.q), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cp), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cq), eoq.b, dia.a.m()),
                  new epi(new eov(dia.og), eoq.b, dia.og.m().b(dim.c, Boolean.valueOf(false))),
                  new epi(new epk(dia.m, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.V, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.eY, 0.5F), eoq.b, dia.bs.m()),
                  new epi(
                     new eox(dia.eY.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))),
                     eoq.b,
                     dia.hL.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true))
                  ),
                  new epi(
                     new eox(dia.eY.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))),
                     eoq.b,
                     dia.hL.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true))
                  ),
                  new epi(new epk(dia.cB, 0.3F), eoq.b, dia.fd.m()),
                  new epi(new epk(dia.cB, 0.2F), eoq.b, dia.gu.m()),
                  new epi[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epv(awz.q), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cp), eoq.b, dia.a.m()),
                  new epi(new eov(dia.cq), eoq.b, dia.a.m()),
                  new epi(new epk(dia.jS, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.aX, 0.1F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.iA, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.nl, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.ny, 0.08F), eoq.b, dia.bs.m()),
                  new epi(new epk(dia.cB, 0.2F), eoq.b, dia.kD.m()),
                  new epi(new epk(dia.cB, 0.1F), eoq.b, dia.fe.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.m, 0.1F), eoq.b, dia.cn.m())))));
      a($$0, g, ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.m, 0.2F), eoq.b, dia.cn.m())))));
      a($$0, h, ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.m, 0.7F), eoq.b, dia.cn.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new eov(dia.kE), new eov(dia.G), dia.n.m()),
                  new epi(new epk(dia.kE, 0.1F), eoq.b, dia.i.m()),
                  new epi(new eov(dia.i), new eov(dia.G), dia.G.m()),
                  new epi(new eov(dia.j), new eov(dia.G), dia.G.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new eov(dia.kE), new eov(dia.G), dia.r.m()),
                  new epi(new epk(dia.kE, 0.2F), eoq.b, dia.i.m()),
                  new epi(new eov(dia.i), new eov(dia.G), dia.G.m()),
                  new epi(new eov(dia.j), new eov(dia.G), dia.G.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new eov(dia.kE), new eov(dia.G), dia.o.m()),
                  new epi(new eov(dia.kE), new eov(dia.dO), dia.o.m()),
                  new epi(new epk(dia.kE, 0.2F), eoq.b, dia.i.m()),
                  new epi(new eov(dia.i), new eov(dia.G), dia.G.m()),
                  new epi(new eov(dia.j), new eov(dia.G), dia.G.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.cB, 0.3F), eoq.b, dia.gt.m()),
                  new epi(new epk(dia.cB, 0.2F), eoq.b, dia.gu.m()),
                  new epi(new epk(dia.cB, 0.1F), eoq.b, dia.kD.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.cB, 0.1F), eoq.b, dia.fe.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.cB, 0.1F), eoq.b, dia.gt.m()), new epi(new epk(dia.cB, 0.8F), eoq.b, dia.gu.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.cB, 0.3F), eoq.b, dia.fd.m()), new epi(new epk(dia.cB, 0.2F), eoq.b, dia.gu.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.cB, 0.2F), eoq.b, dia.kD.m()), new epi(new epk(dia.cB, 0.1F), eoq.b, dia.fe.m()))))
      );
      a($$0, q, ImmutableList.of(new eow(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new epm(ImmutableList.of(new epi(new epk(dia.kJ, 0.75F), eoq.b, dia.px.m()), new epi(new epk(dia.px, 0.15F), eoq.b, dia.pw.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new epm(ImmutableList.of(new epi(new epk(dia.pw, 0.35F), eoq.b, dia.px.m()), new epi(new epk(dia.py, 0.1F), eoq.b, dia.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new epm(ImmutableList.of(new epi(new epk(dia.pw, 0.3F), eoq.b, dia.px.m()), new epi(new epk(dia.pr, 1.0E-4F), eoq.b, dia.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new epm(ImmutableList.of(new epi(new epk(dia.py, 0.5F), eoq.b, dia.a.m()), new epi(new epk(dia.ch, 0.1F), eoq.b, dia.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new epm(ImmutableList.of(new epi(new epk(dia.pw, 0.1F), eoq.b, dia.px.m()), new epi(new epk(dia.pr, 1.0E-4F), eoq.b, dia.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.pw, 0.3F), eoq.b, dia.px.m()),
                  new epi(new epk(dia.pr, 1.0E-4F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.ch, 0.3F), eoq.b, dia.px.m()),
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
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.pw, 0.4F), eoq.b, dia.px.m()),
                  new epi(new epk(dia.pr, 0.01F), eoq.b, dia.px.m()),
                  new epi(new epk(dia.pw, 1.0E-4F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.pr, 1.0E-4F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.ch, 0.3F), eoq.b, dia.px.m()),
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
            new epm(ImmutableList.of(new epi(new epk(dia.py, 0.5F), eoq.b, dia.a.m()), new epi(new epk(dia.ch, 0.6F), eoq.b, dia.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new epm(ImmutableList.of(new epi(new epk(dia.pw, 0.3F), eoq.b, dia.px.m()), new epi(new epk(dia.pr, 1.0E-4F), eoq.b, dia.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.pw, 0.3F), eoq.b, dia.px.m()),
                  new epi(new epk(dia.pw, 0.15F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.pw, 0.3F), eoq.b, dia.pr.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.pw, 0.01F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.pw, 0.5F), eoq.b, dia.px.m()),
                  new epi(new epk(dia.pw, 0.3F), eoq.b, dia.pr.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new epm(
               ImmutableList.of(new epi(new epk(dia.ch, 0.3F), eoq.b, dia.px.m()), new epi(eoq.b, eoq.b, new eor(0.0F, 0.05F, 0, 100, jl.a.b), dia.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eow(0.9F), new epj(awz.bP)));
      a($$0, E, ImmutableList.of(new eow(0.1F), new epj(awz.bP)));
      a($$0, F, ImmutableList.of(new eow(0.1F), new epm(ImmutableList.of(new epi(new eov(dia.R), eoq.b, dia.cy.m()))), new epj(awz.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.sW, 0.3F), eoq.b, dia.tb.m()),
                  new epi(new epk(dia.sS, 0.3F), eoq.b, dia.tc.m()),
                  new epi(new epk(dia.of, 0.05F), eoq.b, dia.a.m())
               )
            ),
            new epj(awz.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eow($$1.b(awz.bV), 0.95F),
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.sW, 0.3F), eoq.b, dia.tb.m()),
                  new epi(new epk(dia.sS, 0.3F), eoq.b, dia.tc.m()),
                  new epi(new epk(dia.of, 0.05F), eoq.b, dia.a.m())
               )
            ),
            new epj(awz.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eow($$1.b(awz.bV), 0.95F),
            new epm(
               ImmutableList.of(
                  new epi(new epk(dia.sW, 0.3F), eoq.b, dia.tb.m()),
                  new epi(new epk(dia.sS, 0.3F), eoq.b, dia.tc.m()),
                  new epi(new epk(dia.sU, 0.3F), eoq.b, dia.a.m()),
                  new epi(new epk(dia.of, 0.05F), eoq.b, dia.a.m())
               )
            ),
            new epj(awz.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new epm(
               List.of(
                  new epi(new epk(dia.L, 0.2F), eoq.b, dia.j.m()),
                  new epi(new epk(dia.L, 0.1F), eoq.b, dia.k.m()),
                  new epi(new epk(dia.eM, 0.1F), eoq.b, dia.eL.m())
               )
            ),
            a(ets.aV, 6),
            a(ets.aW, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new epm(
               List.of(
                  new epi(new epk(dia.L, 0.2F), eoq.b, dia.j.m()),
                  new epi(new epk(dia.L, 0.1F), eoq.b, dia.k.m()),
                  new epi(new epk(dia.eM, 0.1F), eoq.b, dia.eL.m())
               )
            ),
            a(ets.aV, 2)
         )
      );
      a($$0, L, List.of(a(ets.aV, 2)));
      a(
         $$0,
         M,
         List.of(
            new epm(
               List.of(
                  new epi(new epk(dia.so, 0.1F), eoq.b, dia.sr.m().b(djm.c, Boolean.valueOf(true))),
                  new epi(new epk(dia.so, 0.33333334F), eoq.b, dia.sq.m().b(djm.c, Boolean.valueOf(true))),
                  new epi(new epk(dia.so, 0.5F), eoq.b, dia.sp.m().b(djm.c, Boolean.valueOf(true)))
               )
            ),
            new epj(awz.bP)
         )
      );
   }

   private static eoy a(alg<eub> $$0, int $$1) {
      return new eoy(new epm(List.of(new epi(new epv(awz.cv), eoq.b, epf.b, dia.M.m(), new epx($$0)))), bra.a($$1));
   }
}
