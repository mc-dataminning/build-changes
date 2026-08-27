import com.google.common.collect.ImmutableList;
import java.util.List;

public class qt {
   private static final akg<ekn> M = a("empty");
   public static final akg<ekn> a = a("zombie_plains");
   public static final akg<ekn> b = a("zombie_savanna");
   public static final akg<ekn> c = a("zombie_snowy");
   public static final akg<ekn> d = a("zombie_taiga");
   public static final akg<ekn> e = a("zombie_desert");
   public static final akg<ekn> f = a("mossify_10_percent");
   public static final akg<ekn> g = a("mossify_20_percent");
   public static final akg<ekn> h = a("mossify_70_percent");
   public static final akg<ekn> i = a("street_plains");
   public static final akg<ekn> j = a("street_savanna");
   public static final akg<ekn> k = a("street_snowy_or_taiga");
   public static final akg<ekn> l = a("farm_plains");
   public static final akg<ekn> m = a("farm_savanna");
   public static final akg<ekn> n = a("farm_snowy");
   public static final akg<ekn> o = a("farm_taiga");
   public static final akg<ekn> p = a("farm_desert");
   public static final akg<ekn> q = a("outpost_rot");
   public static final akg<ekn> r = a("bottom_rampart");
   public static final akg<ekn> s = a("treasure_rooms");
   public static final akg<ekn> t = a("housing");
   public static final akg<ekn> u = a("side_wall_degradation");
   public static final akg<ekn> v = a("stable_degradation");
   public static final akg<ekn> w = a("bastion_generic_degradation");
   public static final akg<ekn> x = a("rampart_degradation");
   public static final akg<ekn> y = a("entrance_replacement");
   public static final akg<ekn> z = a("bridge");
   public static final akg<ekn> A = a("roof");
   public static final akg<ekn> B = a("high_wall");
   public static final akg<ekn> C = a("high_rampart");
   public static final akg<ekn> D = a("fossil_rot");
   public static final akg<ekn> E = a("fossil_coal");
   public static final akg<ekn> F = a("fossil_diamonds");
   public static final akg<ekn> G = a("ancient_city_start_degradation");
   public static final akg<ekn> H = a("ancient_city_generic_degradation");
   public static final akg<ekn> I = a("ancient_city_walls_degradation");
   public static final akg<ekn> J = a("trail_ruins_houses_archaeology");
   public static final akg<ekn> K = a("trail_ruins_roads_archaeology");
   public static final akg<ekn> L = a("trail_ruins_tower_top_archaeology");

   private static akg<ekn> a(String $$0) {
      return akg.a(le.aK, new akh($$0));
   }

   private static void a(ql<ekn> $$0, akg<ekn> $$1, List<ekm> $$2) {
      $$0.a($$1, new ekn($$2));
   }

   public static void a(ql<ekn> $$0) {
      ix<dde> $$1 = $$0.a(le.f);
      eke $$2 = new eke(new ekg(ddg.pr, 0.01F), ejn.b, ddg.pC.n());
      eke $$3 = new eke(new ekg(ddg.pC, 0.5F), ejn.b, ddg.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.m, 0.8F), ejn.b, ddg.cn.n()),
                  new eke(new ekr(avr.p), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cp), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cq), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.m, 0.07F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.cn, 0.07F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.hj, 0.07F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.U, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.n, 0.1F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.cu, 0.1F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.al, 0.02F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.eY, 0.5F), ejn.b, ddg.bs.n()),
                  new eke[]{
                     new eke(
                        new eju(ddg.eY.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))),
                        ejn.b,
                        ddg.hL.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))
                     ),
                     new eke(
                        new eju(ddg.eY.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))),
                        ejn.b,
                        ddg.hL.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))
                     ),
                     new eke(new ekg(ddg.cB, 0.3F), ejn.b, ddg.gt.n()),
                     new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.gu.n()),
                     new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekr(avr.p), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cp), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cq), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.r, 0.2F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.hP, 0.2F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.Y, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.as, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.hk, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.hn, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.hx, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.eY, 0.5F), ejn.b, ddg.bs.n()),
                  new eke(
                     new eju(ddg.eY.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))),
                     ejn.b,
                     ddg.hL.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))
                  ),
                  new eke[]{
                     new eke(
                        new eju(ddg.eY.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))),
                        ejn.b,
                        ddg.hL.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))
                     ),
                     new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekr(avr.p), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cp), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cq), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.oe), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.o, 0.2F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.ju, 0.4F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.af, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.ax, 0.05F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.eY, 0.5F), ejn.b, ddg.bs.n()),
                  new eke(
                     new eju(ddg.eY.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))),
                     ejn.b,
                     ddg.hL.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))
                  ),
                  new eke(
                     new eju(ddg.eY.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))),
                     ejn.b,
                     ddg.hL.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))
                  ),
                  new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.gt.n()),
                  new eke[]{new eke(new ekg(ddg.cB, 0.8F), ejn.b, ddg.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.m, 0.8F), ejn.b, ddg.cn.n()),
                  new eke(new ekr(avr.p), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cp), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cq), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.og), ejn.b, ddg.og.n().a(dds.c, Boolean.valueOf(false))),
                  new eke(new ekg(ddg.m, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.V, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.eY, 0.5F), ejn.b, ddg.bs.n()),
                  new eke(
                     new eju(ddg.eY.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))),
                     ejn.b,
                     ddg.hL.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true))
                  ),
                  new eke(
                     new eju(ddg.eY.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))),
                     ejn.b,
                     ddg.hL.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true))
                  ),
                  new eke(new ekg(ddg.cB, 0.3F), ejn.b, ddg.fd.n()),
                  new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.gu.n()),
                  new eke[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekr(avr.p), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cp), ejn.b, ddg.a.n()),
                  new eke(new ejs(ddg.cq), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.jS, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.aX, 0.1F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.iA, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.nl, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.ny, 0.08F), ejn.b, ddg.bs.n()),
                  new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.kD.n()),
                  new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.m, 0.1F), ejn.b, ddg.cn.n())))));
      a($$0, g, ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.m, 0.2F), ejn.b, ddg.cn.n())))));
      a($$0, h, ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.m, 0.7F), ejn.b, ddg.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ejs(ddg.kE), new ejs(ddg.G), ddg.n.n()),
                  new eke(new ekg(ddg.kE, 0.1F), ejn.b, ddg.i.n()),
                  new eke(new ejs(ddg.i), new ejs(ddg.G), ddg.G.n()),
                  new eke(new ejs(ddg.j), new ejs(ddg.G), ddg.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ejs(ddg.kE), new ejs(ddg.G), ddg.r.n()),
                  new eke(new ekg(ddg.kE, 0.2F), ejn.b, ddg.i.n()),
                  new eke(new ejs(ddg.i), new ejs(ddg.G), ddg.G.n()),
                  new eke(new ejs(ddg.j), new ejs(ddg.G), ddg.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ejs(ddg.kE), new ejs(ddg.G), ddg.o.n()),
                  new eke(new ejs(ddg.kE), new ejs(ddg.dO), ddg.o.n()),
                  new eke(new ekg(ddg.kE, 0.2F), ejn.b, ddg.i.n()),
                  new eke(new ejs(ddg.i), new ejs(ddg.G), ddg.G.n()),
                  new eke(new ejs(ddg.j), new ejs(ddg.G), ddg.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.cB, 0.3F), ejn.b, ddg.gt.n()),
                  new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.gu.n()),
                  new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.gt.n()), new eke(new ekg(ddg.cB, 0.8F), ejn.b, ddg.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.cB, 0.3F), ejn.b, ddg.fd.n()), new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.cB, 0.2F), ejn.b, ddg.kD.n()), new eke(new ekg(ddg.cB, 0.1F), ejn.b, ddg.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new ejt(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eki(ImmutableList.of(new eke(new ekg(ddg.kJ, 0.75F), ejn.b, ddg.px.n()), new eke(new ekg(ddg.px, 0.15F), ejn.b, ddg.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eki(ImmutableList.of(new eke(new ekg(ddg.pw, 0.35F), ejn.b, ddg.px.n()), new eke(new ekg(ddg.py, 0.1F), ejn.b, ddg.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eki(ImmutableList.of(new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.px.n()), new eke(new ekg(ddg.pr, 1.0E-4F), ejn.b, ddg.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eki(ImmutableList.of(new eke(new ekg(ddg.py, 0.5F), ejn.b, ddg.a.n()), new eke(new ekg(ddg.ch, 0.1F), ejn.b, ddg.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eki(ImmutableList.of(new eke(new ekg(ddg.pw, 0.1F), ejn.b, ddg.px.n()), new eke(new ekg(ddg.pr, 1.0E-4F), ejn.b, ddg.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.px.n()),
                  new eke(new ekg(ddg.pr, 1.0E-4F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.ch, 0.3F), ejn.b, ddg.px.n()),
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
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.pw, 0.4F), ejn.b, ddg.px.n()),
                  new eke(new ekg(ddg.pr, 0.01F), ejn.b, ddg.px.n()),
                  new eke(new ekg(ddg.pw, 1.0E-4F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.pr, 1.0E-4F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.ch, 0.3F), ejn.b, ddg.px.n()),
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
            new eki(ImmutableList.of(new eke(new ekg(ddg.py, 0.5F), ejn.b, ddg.a.n()), new eke(new ekg(ddg.ch, 0.6F), ejn.b, ddg.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eki(ImmutableList.of(new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.px.n()), new eke(new ekg(ddg.pr, 1.0E-4F), ejn.b, ddg.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.px.n()),
                  new eke(new ekg(ddg.pw, 0.15F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.pw, 0.01F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.pw, 0.5F), ejn.b, ddg.px.n()),
                  new eke(new ekg(ddg.pw, 0.3F), ejn.b, ddg.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eki(
               ImmutableList.of(new eke(new ekg(ddg.ch, 0.3F), ejn.b, ddg.px.n()), new eke(ejn.b, ejn.b, new ejo(0.0F, 0.05F, 0, 100, is.a.b), ddg.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ejt(0.9F), new ekf(avr.bO)));
      a($$0, E, ImmutableList.of(new ejt(0.1F), new ekf(avr.bO)));
      a($$0, F, ImmutableList.of(new ejt(0.1F), new eki(ImmutableList.of(new eke(new ejs(ddg.R), ejn.b, ddg.cy.n()))), new ekf(avr.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.sW, 0.3F), ejn.b, ddg.tb.n()),
                  new eke(new ekg(ddg.sS, 0.3F), ejn.b, ddg.tc.n()),
                  new eke(new ekg(ddg.of, 0.05F), ejn.b, ddg.a.n())
               )
            ),
            new ekf(avr.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ejt($$1.b(avr.bU), 0.95F),
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.sW, 0.3F), ejn.b, ddg.tb.n()),
                  new eke(new ekg(ddg.sS, 0.3F), ejn.b, ddg.tc.n()),
                  new eke(new ekg(ddg.of, 0.05F), ejn.b, ddg.a.n())
               )
            ),
            new ekf(avr.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ejt($$1.b(avr.bU), 0.95F),
            new eki(
               ImmutableList.of(
                  new eke(new ekg(ddg.sW, 0.3F), ejn.b, ddg.tb.n()),
                  new eke(new ekg(ddg.sS, 0.3F), ejn.b, ddg.tc.n()),
                  new eke(new ekg(ddg.sU, 0.3F), ejn.b, ddg.a.n()),
                  new eke(new ekg(ddg.of, 0.05F), ejn.b, ddg.a.n())
               )
            ),
            new ekf(avr.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eki(
               List.of(
                  new eke(new ekg(ddg.L, 0.2F), ejn.b, ddg.j.n()),
                  new eke(new ekg(ddg.L, 0.1F), ejn.b, ddg.k.n()),
                  new eke(new ekg(ddg.eM, 0.1F), ejn.b, ddg.eL.n())
               )
            ),
            a(eoj.aV, 6),
            a(eoj.aW, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eki(
               List.of(
                  new eke(new ekg(ddg.L, 0.2F), ejn.b, ddg.j.n()),
                  new eke(new ekg(ddg.L, 0.1F), ejn.b, ddg.k.n()),
                  new eke(new ekg(ddg.eM, 0.1F), ejn.b, ddg.eL.n())
               )
            ),
            a(eoj.aV, 2)
         )
      );
      a($$0, L, List.of(a(eoj.aV, 2)));
   }

   private static ejv a(akg<eoq> $$0, int $$1) {
      return new ejv(new eki(List.of(new eke(new ekr(avr.ct), ejn.b, ekb.b, ddg.M.n(), new ekt($$0)))), boo.a($$1));
   }
}
