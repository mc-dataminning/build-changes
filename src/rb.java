import com.google.common.collect.ImmutableList;
import java.util.List;

public class rb {
   private static final alb<epc> N = a("empty");
   public static final alb<epc> a = a("zombie_plains");
   public static final alb<epc> b = a("zombie_savanna");
   public static final alb<epc> c = a("zombie_snowy");
   public static final alb<epc> d = a("zombie_taiga");
   public static final alb<epc> e = a("zombie_desert");
   public static final alb<epc> f = a("mossify_10_percent");
   public static final alb<epc> g = a("mossify_20_percent");
   public static final alb<epc> h = a("mossify_70_percent");
   public static final alb<epc> i = a("street_plains");
   public static final alb<epc> j = a("street_savanna");
   public static final alb<epc> k = a("street_snowy_or_taiga");
   public static final alb<epc> l = a("farm_plains");
   public static final alb<epc> m = a("farm_savanna");
   public static final alb<epc> n = a("farm_snowy");
   public static final alb<epc> o = a("farm_taiga");
   public static final alb<epc> p = a("farm_desert");
   public static final alb<epc> q = a("outpost_rot");
   public static final alb<epc> r = a("bottom_rampart");
   public static final alb<epc> s = a("treasure_rooms");
   public static final alb<epc> t = a("housing");
   public static final alb<epc> u = a("side_wall_degradation");
   public static final alb<epc> v = a("stable_degradation");
   public static final alb<epc> w = a("bastion_generic_degradation");
   public static final alb<epc> x = a("rampart_degradation");
   public static final alb<epc> y = a("entrance_replacement");
   public static final alb<epc> z = a("bridge");
   public static final alb<epc> A = a("roof");
   public static final alb<epc> B = a("high_wall");
   public static final alb<epc> C = a("high_rampart");
   public static final alb<epc> D = a("fossil_rot");
   public static final alb<epc> E = a("fossil_coal");
   public static final alb<epc> F = a("fossil_diamonds");
   public static final alb<epc> G = a("ancient_city_start_degradation");
   public static final alb<epc> H = a("ancient_city_generic_degradation");
   public static final alb<epc> I = a("ancient_city_walls_degradation");
   public static final alb<epc> J = a("trail_ruins_houses_archaeology");
   public static final alb<epc> K = a("trail_ruins_roads_archaeology");
   public static final alb<epc> L = a("trail_ruins_tower_top_archaeology");
   public static final alb<epc> M = a("trial_chambers_copper_bulb_degradation");

   private static alb<epc> a(String $$0) {
      return alb.a(lv.aT, alc.b($$0));
   }

   private static void a(qt<epc> $$0, alb<epc> $$1, List<epb> $$2) {
      $$0.a($$1, new epc($$2));
   }

   public static void a(qt<epc> $$0) {
      jo<dhj> $$1 = $$0.a(lv.f);
      eot $$2 = new eot(new eov(dhl.pr, 0.01F), eob.b, dhl.pC.o());
      eot $$3 = new eot(new eov(dhl.pC, 0.5F), eob.b, dhl.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.m, 0.8F), eob.b, dhl.cn.o()),
                  new eot(new epg(awt.q), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cp), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cq), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.m, 0.07F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.cn, 0.07F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.hj, 0.07F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.U, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.n, 0.1F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.cu, 0.1F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.al, 0.02F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.eY, 0.5F), eob.b, dhl.bs.o()),
                  new eot[]{
                     new eot(
                        new eoi(dhl.eY.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))),
                        eob.b,
                        dhl.hL.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))
                     ),
                     new eot(
                        new eoi(dhl.eY.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))),
                        eob.b,
                        dhl.hL.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))
                     ),
                     new eot(new eov(dhl.cB, 0.3F), eob.b, dhl.gt.o()),
                     new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.gu.o()),
                     new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new epg(awt.q), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cp), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cq), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.r, 0.2F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.hP, 0.2F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.Y, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.as, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.hk, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.hn, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.hx, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.eY, 0.5F), eob.b, dhl.bs.o()),
                  new eot(
                     new eoi(dhl.eY.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))),
                     eob.b,
                     dhl.hL.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))
                  ),
                  new eot[]{
                     new eot(
                        new eoi(dhl.eY.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))),
                        eob.b,
                        dhl.hL.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))
                     ),
                     new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new epg(awt.q), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cp), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cq), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.oe), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.o, 0.2F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.ju, 0.4F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.af, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.ax, 0.05F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.eY, 0.5F), eob.b, dhl.bs.o()),
                  new eot(
                     new eoi(dhl.eY.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))),
                     eob.b,
                     dhl.hL.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))
                  ),
                  new eot(
                     new eoi(dhl.eY.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))),
                     eob.b,
                     dhl.hL.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))
                  ),
                  new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.gt.o()),
                  new eot[]{new eot(new eov(dhl.cB, 0.8F), eob.b, dhl.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.m, 0.8F), eob.b, dhl.cn.o()),
                  new eot(new epg(awt.q), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cp), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cq), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.og), eob.b, dhl.og.o().b(dhx.c, Boolean.valueOf(false))),
                  new eot(new eov(dhl.m, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.V, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.eY, 0.5F), eob.b, dhl.bs.o()),
                  new eot(
                     new eoi(dhl.eY.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))),
                     eob.b,
                     dhl.hL.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true))
                  ),
                  new eot(
                     new eoi(dhl.eY.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))),
                     eob.b,
                     dhl.hL.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true))
                  ),
                  new eot(new eov(dhl.cB, 0.3F), eob.b, dhl.fd.o()),
                  new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.gu.o()),
                  new eot[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new epg(awt.q), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cp), eob.b, dhl.a.o()),
                  new eot(new eog(dhl.cq), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.jS, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.aX, 0.1F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.iA, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.nl, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.ny, 0.08F), eob.b, dhl.bs.o()),
                  new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.kD.o()),
                  new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.m, 0.1F), eob.b, dhl.cn.o())))));
      a($$0, g, ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.m, 0.2F), eob.b, dhl.cn.o())))));
      a($$0, h, ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.m, 0.7F), eob.b, dhl.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eog(dhl.kE), new eog(dhl.G), dhl.n.o()),
                  new eot(new eov(dhl.kE, 0.1F), eob.b, dhl.i.o()),
                  new eot(new eog(dhl.i), new eog(dhl.G), dhl.G.o()),
                  new eot(new eog(dhl.j), new eog(dhl.G), dhl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eog(dhl.kE), new eog(dhl.G), dhl.r.o()),
                  new eot(new eov(dhl.kE, 0.2F), eob.b, dhl.i.o()),
                  new eot(new eog(dhl.i), new eog(dhl.G), dhl.G.o()),
                  new eot(new eog(dhl.j), new eog(dhl.G), dhl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eog(dhl.kE), new eog(dhl.G), dhl.o.o()),
                  new eot(new eog(dhl.kE), new eog(dhl.dO), dhl.o.o()),
                  new eot(new eov(dhl.kE, 0.2F), eob.b, dhl.i.o()),
                  new eot(new eog(dhl.i), new eog(dhl.G), dhl.G.o()),
                  new eot(new eog(dhl.j), new eog(dhl.G), dhl.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.cB, 0.3F), eob.b, dhl.gt.o()),
                  new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.gu.o()),
                  new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.gt.o()), new eot(new eov(dhl.cB, 0.8F), eob.b, dhl.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.cB, 0.3F), eob.b, dhl.fd.o()), new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.cB, 0.2F), eob.b, dhl.kD.o()), new eot(new eov(dhl.cB, 0.1F), eob.b, dhl.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new eoh(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eox(ImmutableList.of(new eot(new eov(dhl.kJ, 0.75F), eob.b, dhl.px.o()), new eot(new eov(dhl.px, 0.15F), eob.b, dhl.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eox(ImmutableList.of(new eot(new eov(dhl.pw, 0.35F), eob.b, dhl.px.o()), new eot(new eov(dhl.py, 0.1F), eob.b, dhl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eox(ImmutableList.of(new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.px.o()), new eot(new eov(dhl.pr, 1.0E-4F), eob.b, dhl.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eox(ImmutableList.of(new eot(new eov(dhl.py, 0.5F), eob.b, dhl.a.o()), new eot(new eov(dhl.ch, 0.1F), eob.b, dhl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eox(ImmutableList.of(new eot(new eov(dhl.pw, 0.1F), eob.b, dhl.px.o()), new eot(new eov(dhl.pr, 1.0E-4F), eob.b, dhl.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.px.o()),
                  new eot(new eov(dhl.pr, 1.0E-4F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.ch, 0.3F), eob.b, dhl.px.o()),
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
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.pw, 0.4F), eob.b, dhl.px.o()),
                  new eot(new eov(dhl.pr, 0.01F), eob.b, dhl.px.o()),
                  new eot(new eov(dhl.pw, 1.0E-4F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.pr, 1.0E-4F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.ch, 0.3F), eob.b, dhl.px.o()),
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
            new eox(ImmutableList.of(new eot(new eov(dhl.py, 0.5F), eob.b, dhl.a.o()), new eot(new eov(dhl.ch, 0.6F), eob.b, dhl.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eox(ImmutableList.of(new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.px.o()), new eot(new eov(dhl.pr, 1.0E-4F), eob.b, dhl.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.px.o()),
                  new eot(new eov(dhl.pw, 0.15F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.pw, 0.01F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.pw, 0.5F), eob.b, dhl.px.o()),
                  new eot(new eov(dhl.pw, 0.3F), eob.b, dhl.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eox(
               ImmutableList.of(new eot(new eov(dhl.ch, 0.3F), eob.b, dhl.px.o()), new eot(eob.b, eob.b, new eoc(0.0F, 0.05F, 0, 100, jj.a.b), dhl.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eoh(0.9F), new eou(awt.bP)));
      a($$0, E, ImmutableList.of(new eoh(0.1F), new eou(awt.bP)));
      a($$0, F, ImmutableList.of(new eoh(0.1F), new eox(ImmutableList.of(new eot(new eog(dhl.R), eob.b, dhl.cy.o()))), new eou(awt.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.sW, 0.3F), eob.b, dhl.tb.o()),
                  new eot(new eov(dhl.sS, 0.3F), eob.b, dhl.tc.o()),
                  new eot(new eov(dhl.of, 0.05F), eob.b, dhl.a.o())
               )
            ),
            new eou(awt.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eoh($$1.b(awt.bV), 0.95F),
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.sW, 0.3F), eob.b, dhl.tb.o()),
                  new eot(new eov(dhl.sS, 0.3F), eob.b, dhl.tc.o()),
                  new eot(new eov(dhl.of, 0.05F), eob.b, dhl.a.o())
               )
            ),
            new eou(awt.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eoh($$1.b(awt.bV), 0.95F),
            new eox(
               ImmutableList.of(
                  new eot(new eov(dhl.sW, 0.3F), eob.b, dhl.tb.o()),
                  new eot(new eov(dhl.sS, 0.3F), eob.b, dhl.tc.o()),
                  new eot(new eov(dhl.sU, 0.3F), eob.b, dhl.a.o()),
                  new eot(new eov(dhl.of, 0.05F), eob.b, dhl.a.o())
               )
            ),
            new eou(awt.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eox(
               List.of(
                  new eot(new eov(dhl.L, 0.2F), eob.b, dhl.j.o()),
                  new eot(new eov(dhl.L, 0.1F), eob.b, dhl.k.o()),
                  new eot(new eov(dhl.eM, 0.1F), eob.b, dhl.eL.o())
               )
            ),
            a(etd.aU, 6),
            a(etd.aV, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eox(
               List.of(
                  new eot(new eov(dhl.L, 0.2F), eob.b, dhl.j.o()),
                  new eot(new eov(dhl.L, 0.1F), eob.b, dhl.k.o()),
                  new eot(new eov(dhl.eM, 0.1F), eob.b, dhl.eL.o())
               )
            ),
            a(etd.aU, 2)
         )
      );
      a($$0, L, List.of(a(etd.aU, 2)));
      a(
         $$0,
         M,
         List.of(
            new eox(
               List.of(
                  new eot(new eov(dhl.so, 0.1F), eob.b, dhl.sr.o().b(dix.c, Boolean.valueOf(true))),
                  new eot(new eov(dhl.so, 0.33333334F), eob.b, dhl.sq.o().b(dix.c, Boolean.valueOf(true))),
                  new eot(new eov(dhl.so, 0.5F), eob.b, dhl.sp.o().b(dix.c, Boolean.valueOf(true)))
               )
            ),
            new eou(awt.bP)
         )
      );
   }

   private static eoj a(alb<etm> $$0, int $$1) {
      return new eoj(new eox(List.of(new eot(new epg(awt.cu), eob.b, eoq.b, dhl.M.o(), new epi($$0)))), bqr.a($$1));
   }
}
