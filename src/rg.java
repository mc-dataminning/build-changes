import com.google.common.collect.ImmutableList;
import java.util.List;

public class rg {
   private static final alh<epx> N = a("empty");
   public static final alh<epx> a = a("zombie_plains");
   public static final alh<epx> b = a("zombie_savanna");
   public static final alh<epx> c = a("zombie_snowy");
   public static final alh<epx> d = a("zombie_taiga");
   public static final alh<epx> e = a("zombie_desert");
   public static final alh<epx> f = a("mossify_10_percent");
   public static final alh<epx> g = a("mossify_20_percent");
   public static final alh<epx> h = a("mossify_70_percent");
   public static final alh<epx> i = a("street_plains");
   public static final alh<epx> j = a("street_savanna");
   public static final alh<epx> k = a("street_snowy_or_taiga");
   public static final alh<epx> l = a("farm_plains");
   public static final alh<epx> m = a("farm_savanna");
   public static final alh<epx> n = a("farm_snowy");
   public static final alh<epx> o = a("farm_taiga");
   public static final alh<epx> p = a("farm_desert");
   public static final alh<epx> q = a("outpost_rot");
   public static final alh<epx> r = a("bottom_rampart");
   public static final alh<epx> s = a("treasure_rooms");
   public static final alh<epx> t = a("housing");
   public static final alh<epx> u = a("side_wall_degradation");
   public static final alh<epx> v = a("stable_degradation");
   public static final alh<epx> w = a("bastion_generic_degradation");
   public static final alh<epx> x = a("rampart_degradation");
   public static final alh<epx> y = a("entrance_replacement");
   public static final alh<epx> z = a("bridge");
   public static final alh<epx> A = a("roof");
   public static final alh<epx> B = a("high_wall");
   public static final alh<epx> C = a("high_rampart");
   public static final alh<epx> D = a("fossil_rot");
   public static final alh<epx> E = a("fossil_coal");
   public static final alh<epx> F = a("fossil_diamonds");
   public static final alh<epx> G = a("ancient_city_start_degradation");
   public static final alh<epx> H = a("ancient_city_generic_degradation");
   public static final alh<epx> I = a("ancient_city_walls_degradation");
   public static final alh<epx> J = a("trail_ruins_houses_archaeology");
   public static final alh<epx> K = a("trail_ruins_roads_archaeology");
   public static final alh<epx> L = a("trail_ruins_tower_top_archaeology");
   public static final alh<epx> M = a("trial_chambers_copper_bulb_degradation");

   private static alh<epx> a(String $$0) {
      return alh.a(lz.aT, ali.b($$0));
   }

   private static void a(qy<epx> $$0, alh<epx> $$1, List<epw> $$2) {
      $$0.a($$1, new epx($$2));
   }

   public static void a(qy<epx> $$0) {
      jr<die> $$1 = $$0.a(lz.f);
      epo $$2 = new epo(new epq(dig.pr, 0.01F), eow.b, dig.pC.m());
      epo $$3 = new epo(new epq(dig.pC, 0.5F), eow.b, dig.pr.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.m, 0.8F), eow.b, dig.cn.m()),
                  new epo(new eqb(axa.q), eow.b, dig.a.m()),
                  new epo(new epb(dig.cp), eow.b, dig.a.m()),
                  new epo(new epb(dig.cq), eow.b, dig.a.m()),
                  new epo(new epq(dig.m, 0.07F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.cn, 0.07F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.hj, 0.07F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.U, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.n, 0.1F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.cu, 0.1F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.al, 0.02F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.eY, 0.5F), eow.b, dig.bs.m()),
                  new epo[]{
                     new epo(
                        new epd(dig.eY.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))),
                        eow.b,
                        dig.hL.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))
                     ),
                     new epo(
                        new epd(dig.eY.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))),
                        eow.b,
                        dig.hL.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))
                     ),
                     new epo(new epq(dig.cB, 0.3F), eow.b, dig.gt.m()),
                     new epo(new epq(dig.cB, 0.2F), eow.b, dig.gu.m()),
                     new epo(new epq(dig.cB, 0.1F), eow.b, dig.kD.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new eqb(axa.q), eow.b, dig.a.m()),
                  new epo(new epb(dig.cp), eow.b, dig.a.m()),
                  new epo(new epb(dig.cq), eow.b, dig.a.m()),
                  new epo(new epq(dig.r, 0.2F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.hP, 0.2F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.Y, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.as, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.hk, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.hn, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.hx, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.eY, 0.5F), eow.b, dig.bs.m()),
                  new epo(
                     new epd(dig.eY.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))),
                     eow.b,
                     dig.hL.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))
                  ),
                  new epo[]{
                     new epo(
                        new epd(dig.eY.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))),
                        eow.b,
                        dig.hL.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))
                     ),
                     new epo(new epq(dig.cB, 0.1F), eow.b, dig.fe.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new eqb(axa.q), eow.b, dig.a.m()),
                  new epo(new epb(dig.cp), eow.b, dig.a.m()),
                  new epo(new epb(dig.cq), eow.b, dig.a.m()),
                  new epo(new epb(dig.oe), eow.b, dig.a.m()),
                  new epo(new epq(dig.o, 0.2F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.ju, 0.4F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.af, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.ax, 0.05F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.eY, 0.5F), eow.b, dig.bs.m()),
                  new epo(
                     new epd(dig.eY.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))),
                     eow.b,
                     dig.hL.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))
                  ),
                  new epo(
                     new epd(dig.eY.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))),
                     eow.b,
                     dig.hL.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))
                  ),
                  new epo(new epq(dig.cB, 0.1F), eow.b, dig.gt.m()),
                  new epo[]{new epo(new epq(dig.cB, 0.8F), eow.b, dig.gu.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.m, 0.8F), eow.b, dig.cn.m()),
                  new epo(new eqb(axa.q), eow.b, dig.a.m()),
                  new epo(new epb(dig.cp), eow.b, dig.a.m()),
                  new epo(new epb(dig.cq), eow.b, dig.a.m()),
                  new epo(new epb(dig.og), eow.b, dig.og.m().b(dis.c, Boolean.valueOf(false))),
                  new epo(new epq(dig.m, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.V, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.eY, 0.5F), eow.b, dig.bs.m()),
                  new epo(
                     new epd(dig.eY.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))),
                     eow.b,
                     dig.hL.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true))
                  ),
                  new epo(
                     new epd(dig.eY.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))),
                     eow.b,
                     dig.hL.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true))
                  ),
                  new epo(new epq(dig.cB, 0.3F), eow.b, dig.fd.m()),
                  new epo(new epq(dig.cB, 0.2F), eow.b, dig.gu.m()),
                  new epo[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new eqb(axa.q), eow.b, dig.a.m()),
                  new epo(new epb(dig.cp), eow.b, dig.a.m()),
                  new epo(new epb(dig.cq), eow.b, dig.a.m()),
                  new epo(new epq(dig.jS, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.aX, 0.1F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.iA, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.nl, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.ny, 0.08F), eow.b, dig.bs.m()),
                  new epo(new epq(dig.cB, 0.2F), eow.b, dig.kD.m()),
                  new epo(new epq(dig.cB, 0.1F), eow.b, dig.fe.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.m, 0.1F), eow.b, dig.cn.m())))));
      a($$0, g, ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.m, 0.2F), eow.b, dig.cn.m())))));
      a($$0, h, ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.m, 0.7F), eow.b, dig.cn.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epb(dig.kE), new epb(dig.G), dig.n.m()),
                  new epo(new epq(dig.kE, 0.1F), eow.b, dig.i.m()),
                  new epo(new epb(dig.i), new epb(dig.G), dig.G.m()),
                  new epo(new epb(dig.j), new epb(dig.G), dig.G.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epb(dig.kE), new epb(dig.G), dig.r.m()),
                  new epo(new epq(dig.kE, 0.2F), eow.b, dig.i.m()),
                  new epo(new epb(dig.i), new epb(dig.G), dig.G.m()),
                  new epo(new epb(dig.j), new epb(dig.G), dig.G.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epb(dig.kE), new epb(dig.G), dig.o.m()),
                  new epo(new epb(dig.kE), new epb(dig.dO), dig.o.m()),
                  new epo(new epq(dig.kE, 0.2F), eow.b, dig.i.m()),
                  new epo(new epb(dig.i), new epb(dig.G), dig.G.m()),
                  new epo(new epb(dig.j), new epb(dig.G), dig.G.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.cB, 0.3F), eow.b, dig.gt.m()),
                  new epo(new epq(dig.cB, 0.2F), eow.b, dig.gu.m()),
                  new epo(new epq(dig.cB, 0.1F), eow.b, dig.kD.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.cB, 0.1F), eow.b, dig.fe.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.cB, 0.1F), eow.b, dig.gt.m()), new epo(new epq(dig.cB, 0.8F), eow.b, dig.gu.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.cB, 0.3F), eow.b, dig.fd.m()), new epo(new epq(dig.cB, 0.2F), eow.b, dig.gu.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.cB, 0.2F), eow.b, dig.kD.m()), new epo(new epq(dig.cB, 0.1F), eow.b, dig.fe.m()))))
      );
      a($$0, q, ImmutableList.of(new epc(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eps(ImmutableList.of(new epo(new epq(dig.kJ, 0.75F), eow.b, dig.px.m()), new epo(new epq(dig.px, 0.15F), eow.b, dig.pw.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eps(ImmutableList.of(new epo(new epq(dig.pw, 0.35F), eow.b, dig.px.m()), new epo(new epq(dig.py, 0.1F), eow.b, dig.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eps(ImmutableList.of(new epo(new epq(dig.pw, 0.3F), eow.b, dig.px.m()), new epo(new epq(dig.pr, 1.0E-4F), eow.b, dig.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eps(ImmutableList.of(new epo(new epq(dig.py, 0.5F), eow.b, dig.a.m()), new epo(new epq(dig.ch, 0.1F), eow.b, dig.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eps(ImmutableList.of(new epo(new epq(dig.pw, 0.1F), eow.b, dig.px.m()), new epo(new epq(dig.pr, 1.0E-4F), eow.b, dig.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.pw, 0.3F), eow.b, dig.px.m()),
                  new epo(new epq(dig.pr, 1.0E-4F), eow.b, dig.a.m()),
                  new epo(new epq(dig.ch, 0.3F), eow.b, dig.px.m()),
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
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.pw, 0.4F), eow.b, dig.px.m()),
                  new epo(new epq(dig.pr, 0.01F), eow.b, dig.px.m()),
                  new epo(new epq(dig.pw, 1.0E-4F), eow.b, dig.a.m()),
                  new epo(new epq(dig.pr, 1.0E-4F), eow.b, dig.a.m()),
                  new epo(new epq(dig.ch, 0.3F), eow.b, dig.px.m()),
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
            new eps(ImmutableList.of(new epo(new epq(dig.py, 0.5F), eow.b, dig.a.m()), new epo(new epq(dig.ch, 0.6F), eow.b, dig.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eps(ImmutableList.of(new epo(new epq(dig.pw, 0.3F), eow.b, dig.px.m()), new epo(new epq(dig.pr, 1.0E-4F), eow.b, dig.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.pw, 0.3F), eow.b, dig.px.m()),
                  new epo(new epq(dig.pw, 0.15F), eow.b, dig.a.m()),
                  new epo(new epq(dig.pw, 0.3F), eow.b, dig.pr.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.pw, 0.01F), eow.b, dig.a.m()),
                  new epo(new epq(dig.pw, 0.5F), eow.b, dig.px.m()),
                  new epo(new epq(dig.pw, 0.3F), eow.b, dig.pr.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eps(
               ImmutableList.of(new epo(new epq(dig.ch, 0.3F), eow.b, dig.px.m()), new epo(eow.b, eow.b, new eox(0.0F, 0.05F, 0, 100, jm.a.b), dig.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new epc(0.9F), new epp(axa.bP)));
      a($$0, E, ImmutableList.of(new epc(0.1F), new epp(axa.bP)));
      a($$0, F, ImmutableList.of(new epc(0.1F), new eps(ImmutableList.of(new epo(new epb(dig.R), eow.b, dig.cy.m()))), new epp(axa.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.sW, 0.3F), eow.b, dig.tb.m()),
                  new epo(new epq(dig.sS, 0.3F), eow.b, dig.tc.m()),
                  new epo(new epq(dig.of, 0.05F), eow.b, dig.a.m())
               )
            ),
            new epp(axa.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new epc($$1.b(axa.bV), 0.95F),
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.sW, 0.3F), eow.b, dig.tb.m()),
                  new epo(new epq(dig.sS, 0.3F), eow.b, dig.tc.m()),
                  new epo(new epq(dig.of, 0.05F), eow.b, dig.a.m())
               )
            ),
            new epp(axa.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new epc($$1.b(axa.bV), 0.95F),
            new eps(
               ImmutableList.of(
                  new epo(new epq(dig.sW, 0.3F), eow.b, dig.tb.m()),
                  new epo(new epq(dig.sS, 0.3F), eow.b, dig.tc.m()),
                  new epo(new epq(dig.sU, 0.3F), eow.b, dig.a.m()),
                  new epo(new epq(dig.of, 0.05F), eow.b, dig.a.m())
               )
            ),
            new epp(axa.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eps(
               List.of(
                  new epo(new epq(dig.L, 0.2F), eow.b, dig.j.m()),
                  new epo(new epq(dig.L, 0.1F), eow.b, dig.k.m()),
                  new epo(new epq(dig.eM, 0.1F), eow.b, dig.eL.m())
               )
            ),
            a(ety.aZ, 6),
            a(ety.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eps(
               List.of(
                  new epo(new epq(dig.L, 0.2F), eow.b, dig.j.m()),
                  new epo(new epq(dig.L, 0.1F), eow.b, dig.k.m()),
                  new epo(new epq(dig.eM, 0.1F), eow.b, dig.eL.m())
               )
            ),
            a(ety.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ety.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new eps(
               List.of(
                  new epo(new epq(dig.so, 0.1F), eow.b, dig.sr.m().b(djs.c, Boolean.valueOf(true))),
                  new epo(new epq(dig.so, 0.33333334F), eow.b, dig.sq.m().b(djs.c, Boolean.valueOf(true))),
                  new epo(new epq(dig.so, 0.5F), eow.b, dig.sp.m().b(djs.c, Boolean.valueOf(true)))
               )
            ),
            new epp(axa.bP)
         )
      );
   }

   private static epe a(alh<euh> $$0, int $$1) {
      return new epe(new eps(List.of(new epo(new eqb(axa.cv), eow.b, epl.b, dig.M.m(), new eqd($$0)))), brf.a($$1));
   }
}
