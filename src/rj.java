import com.google.common.collect.ImmutableList;
import java.util.List;

public class rj {
   private static final alk<eqb> N = a("empty");
   public static final alk<eqb> a = a("zombie_plains");
   public static final alk<eqb> b = a("zombie_savanna");
   public static final alk<eqb> c = a("zombie_snowy");
   public static final alk<eqb> d = a("zombie_taiga");
   public static final alk<eqb> e = a("zombie_desert");
   public static final alk<eqb> f = a("mossify_10_percent");
   public static final alk<eqb> g = a("mossify_20_percent");
   public static final alk<eqb> h = a("mossify_70_percent");
   public static final alk<eqb> i = a("street_plains");
   public static final alk<eqb> j = a("street_savanna");
   public static final alk<eqb> k = a("street_snowy_or_taiga");
   public static final alk<eqb> l = a("farm_plains");
   public static final alk<eqb> m = a("farm_savanna");
   public static final alk<eqb> n = a("farm_snowy");
   public static final alk<eqb> o = a("farm_taiga");
   public static final alk<eqb> p = a("farm_desert");
   public static final alk<eqb> q = a("outpost_rot");
   public static final alk<eqb> r = a("bottom_rampart");
   public static final alk<eqb> s = a("treasure_rooms");
   public static final alk<eqb> t = a("housing");
   public static final alk<eqb> u = a("side_wall_degradation");
   public static final alk<eqb> v = a("stable_degradation");
   public static final alk<eqb> w = a("bastion_generic_degradation");
   public static final alk<eqb> x = a("rampart_degradation");
   public static final alk<eqb> y = a("entrance_replacement");
   public static final alk<eqb> z = a("bridge");
   public static final alk<eqb> A = a("roof");
   public static final alk<eqb> B = a("high_wall");
   public static final alk<eqb> C = a("high_rampart");
   public static final alk<eqb> D = a("fossil_rot");
   public static final alk<eqb> E = a("fossil_coal");
   public static final alk<eqb> F = a("fossil_diamonds");
   public static final alk<eqb> G = a("ancient_city_start_degradation");
   public static final alk<eqb> H = a("ancient_city_generic_degradation");
   public static final alk<eqb> I = a("ancient_city_walls_degradation");
   public static final alk<eqb> J = a("trail_ruins_houses_archaeology");
   public static final alk<eqb> K = a("trail_ruins_roads_archaeology");
   public static final alk<eqb> L = a("trail_ruins_tower_top_archaeology");
   public static final alk<eqb> M = a("trial_chambers_copper_bulb_degradation");

   private static alk<eqb> a(String $$0) {
      return alk.a(ma.aT, all.b($$0));
   }

   private static void a(rb<eqb> $$0, alk<eqb> $$1, List<eqa> $$2) {
      $$0.a($$1, new eqb($$2));
   }

   public static void a(rb<eqb> $$0) {
      jr<dij> $$1 = $$0.a(ma.f);
      eps $$2 = new eps(new epu(dil.pr, 0.01F), epa.b, dil.pC.m());
      eps $$3 = new eps(new epu(dil.pC, 0.5F), epa.b, dil.pr.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.m, 0.8F), epa.b, dil.cn.m()),
                  new eps(new eqf(axd.q), epa.b, dil.a.m()),
                  new eps(new epf(dil.cp), epa.b, dil.a.m()),
                  new eps(new epf(dil.cq), epa.b, dil.a.m()),
                  new eps(new epu(dil.m, 0.07F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.cn, 0.07F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.hj, 0.07F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.U, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.n, 0.1F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.cu, 0.1F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.al, 0.02F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.eY, 0.5F), epa.b, dil.bs.m()),
                  new eps[]{
                     new eps(
                        new eph(dil.eY.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))),
                        epa.b,
                        dil.hL.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))
                     ),
                     new eps(
                        new eph(dil.eY.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))),
                        epa.b,
                        dil.hL.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))
                     ),
                     new eps(new epu(dil.cB, 0.3F), epa.b, dil.gt.m()),
                     new eps(new epu(dil.cB, 0.2F), epa.b, dil.gu.m()),
                     new eps(new epu(dil.cB, 0.1F), epa.b, dil.kD.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new eqf(axd.q), epa.b, dil.a.m()),
                  new eps(new epf(dil.cp), epa.b, dil.a.m()),
                  new eps(new epf(dil.cq), epa.b, dil.a.m()),
                  new eps(new epu(dil.r, 0.2F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.hP, 0.2F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.Y, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.as, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.hk, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.hn, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.hx, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.eY, 0.5F), epa.b, dil.bs.m()),
                  new eps(
                     new eph(dil.eY.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))),
                     epa.b,
                     dil.hL.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))
                  ),
                  new eps[]{
                     new eps(
                        new eph(dil.eY.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))),
                        epa.b,
                        dil.hL.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))
                     ),
                     new eps(new epu(dil.cB, 0.1F), epa.b, dil.fe.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new eqf(axd.q), epa.b, dil.a.m()),
                  new eps(new epf(dil.cp), epa.b, dil.a.m()),
                  new eps(new epf(dil.cq), epa.b, dil.a.m()),
                  new eps(new epf(dil.oe), epa.b, dil.a.m()),
                  new eps(new epu(dil.o, 0.2F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.ju, 0.4F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.af, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.ax, 0.05F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.eY, 0.5F), epa.b, dil.bs.m()),
                  new eps(
                     new eph(dil.eY.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))),
                     epa.b,
                     dil.hL.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))
                  ),
                  new eps(
                     new eph(dil.eY.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))),
                     epa.b,
                     dil.hL.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))
                  ),
                  new eps(new epu(dil.cB, 0.1F), epa.b, dil.gt.m()),
                  new eps[]{new eps(new epu(dil.cB, 0.8F), epa.b, dil.gu.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.m, 0.8F), epa.b, dil.cn.m()),
                  new eps(new eqf(axd.q), epa.b, dil.a.m()),
                  new eps(new epf(dil.cp), epa.b, dil.a.m()),
                  new eps(new epf(dil.cq), epa.b, dil.a.m()),
                  new eps(new epf(dil.og), epa.b, dil.og.m().b(dix.c, Boolean.valueOf(false))),
                  new eps(new epu(dil.m, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.V, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.eY, 0.5F), epa.b, dil.bs.m()),
                  new eps(
                     new eph(dil.eY.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))),
                     epa.b,
                     dil.hL.m().b(dmj.a, Boolean.valueOf(true)).b(dmj.c, Boolean.valueOf(true))
                  ),
                  new eps(
                     new eph(dil.eY.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))),
                     epa.b,
                     dil.hL.m().b(dmj.b, Boolean.valueOf(true)).b(dmj.d, Boolean.valueOf(true))
                  ),
                  new eps(new epu(dil.cB, 0.3F), epa.b, dil.fd.m()),
                  new eps(new epu(dil.cB, 0.2F), epa.b, dil.gu.m()),
                  new eps[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new eqf(axd.q), epa.b, dil.a.m()),
                  new eps(new epf(dil.cp), epa.b, dil.a.m()),
                  new eps(new epf(dil.cq), epa.b, dil.a.m()),
                  new eps(new epu(dil.jS, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.aX, 0.1F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.iA, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.nl, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.ny, 0.08F), epa.b, dil.bs.m()),
                  new eps(new epu(dil.cB, 0.2F), epa.b, dil.kD.m()),
                  new eps(new epu(dil.cB, 0.1F), epa.b, dil.fe.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.m, 0.1F), epa.b, dil.cn.m())))));
      a($$0, g, ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.m, 0.2F), epa.b, dil.cn.m())))));
      a($$0, h, ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.m, 0.7F), epa.b, dil.cn.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epf(dil.kE), new epf(dil.G), dil.n.m()),
                  new eps(new epu(dil.kE, 0.1F), epa.b, dil.i.m()),
                  new eps(new epf(dil.i), new epf(dil.G), dil.G.m()),
                  new eps(new epf(dil.j), new epf(dil.G), dil.G.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epf(dil.kE), new epf(dil.G), dil.r.m()),
                  new eps(new epu(dil.kE, 0.2F), epa.b, dil.i.m()),
                  new eps(new epf(dil.i), new epf(dil.G), dil.G.m()),
                  new eps(new epf(dil.j), new epf(dil.G), dil.G.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epf(dil.kE), new epf(dil.G), dil.o.m()),
                  new eps(new epf(dil.kE), new epf(dil.dO), dil.o.m()),
                  new eps(new epu(dil.kE, 0.2F), epa.b, dil.i.m()),
                  new eps(new epf(dil.i), new epf(dil.G), dil.G.m()),
                  new eps(new epf(dil.j), new epf(dil.G), dil.G.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.cB, 0.3F), epa.b, dil.gt.m()),
                  new eps(new epu(dil.cB, 0.2F), epa.b, dil.gu.m()),
                  new eps(new epu(dil.cB, 0.1F), epa.b, dil.kD.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.cB, 0.1F), epa.b, dil.fe.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.cB, 0.1F), epa.b, dil.gt.m()), new eps(new epu(dil.cB, 0.8F), epa.b, dil.gu.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.cB, 0.3F), epa.b, dil.fd.m()), new eps(new epu(dil.cB, 0.2F), epa.b, dil.gu.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.cB, 0.2F), epa.b, dil.kD.m()), new eps(new epu(dil.cB, 0.1F), epa.b, dil.fe.m()))))
      );
      a($$0, q, ImmutableList.of(new epg(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new epw(ImmutableList.of(new eps(new epu(dil.kJ, 0.75F), epa.b, dil.px.m()), new eps(new epu(dil.px, 0.15F), epa.b, dil.pw.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new epw(ImmutableList.of(new eps(new epu(dil.pw, 0.35F), epa.b, dil.px.m()), new eps(new epu(dil.py, 0.1F), epa.b, dil.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new epw(ImmutableList.of(new eps(new epu(dil.pw, 0.3F), epa.b, dil.px.m()), new eps(new epu(dil.pr, 1.0E-4F), epa.b, dil.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new epw(ImmutableList.of(new eps(new epu(dil.py, 0.5F), epa.b, dil.a.m()), new eps(new epu(dil.ch, 0.1F), epa.b, dil.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new epw(ImmutableList.of(new eps(new epu(dil.pw, 0.1F), epa.b, dil.px.m()), new eps(new epu(dil.pr, 1.0E-4F), epa.b, dil.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.pw, 0.3F), epa.b, dil.px.m()),
                  new eps(new epu(dil.pr, 1.0E-4F), epa.b, dil.a.m()),
                  new eps(new epu(dil.ch, 0.3F), epa.b, dil.px.m()),
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
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.pw, 0.4F), epa.b, dil.px.m()),
                  new eps(new epu(dil.pr, 0.01F), epa.b, dil.px.m()),
                  new eps(new epu(dil.pw, 1.0E-4F), epa.b, dil.a.m()),
                  new eps(new epu(dil.pr, 1.0E-4F), epa.b, dil.a.m()),
                  new eps(new epu(dil.ch, 0.3F), epa.b, dil.px.m()),
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
            new epw(ImmutableList.of(new eps(new epu(dil.py, 0.5F), epa.b, dil.a.m()), new eps(new epu(dil.ch, 0.6F), epa.b, dil.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new epw(ImmutableList.of(new eps(new epu(dil.pw, 0.3F), epa.b, dil.px.m()), new eps(new epu(dil.pr, 1.0E-4F), epa.b, dil.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.pw, 0.3F), epa.b, dil.px.m()),
                  new eps(new epu(dil.pw, 0.15F), epa.b, dil.a.m()),
                  new eps(new epu(dil.pw, 0.3F), epa.b, dil.pr.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.pw, 0.01F), epa.b, dil.a.m()),
                  new eps(new epu(dil.pw, 0.5F), epa.b, dil.px.m()),
                  new eps(new epu(dil.pw, 0.3F), epa.b, dil.pr.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new epw(
               ImmutableList.of(new eps(new epu(dil.ch, 0.3F), epa.b, dil.px.m()), new eps(epa.b, epa.b, new epb(0.0F, 0.05F, 0, 100, jm.a.b), dil.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new epg(0.9F), new ept(axd.bP)));
      a($$0, E, ImmutableList.of(new epg(0.1F), new ept(axd.bP)));
      a($$0, F, ImmutableList.of(new epg(0.1F), new epw(ImmutableList.of(new eps(new epf(dil.R), epa.b, dil.cy.m()))), new ept(axd.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.sW, 0.3F), epa.b, dil.tb.m()),
                  new eps(new epu(dil.sS, 0.3F), epa.b, dil.tc.m()),
                  new eps(new epu(dil.of, 0.05F), epa.b, dil.a.m())
               )
            ),
            new ept(axd.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new epg($$1.b(axd.bV), 0.95F),
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.sW, 0.3F), epa.b, dil.tb.m()),
                  new eps(new epu(dil.sS, 0.3F), epa.b, dil.tc.m()),
                  new eps(new epu(dil.of, 0.05F), epa.b, dil.a.m())
               )
            ),
            new ept(axd.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new epg($$1.b(axd.bV), 0.95F),
            new epw(
               ImmutableList.of(
                  new eps(new epu(dil.sW, 0.3F), epa.b, dil.tb.m()),
                  new eps(new epu(dil.sS, 0.3F), epa.b, dil.tc.m()),
                  new eps(new epu(dil.sU, 0.3F), epa.b, dil.a.m()),
                  new eps(new epu(dil.of, 0.05F), epa.b, dil.a.m())
               )
            ),
            new ept(axd.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new epw(
               List.of(
                  new eps(new epu(dil.L, 0.2F), epa.b, dil.j.m()),
                  new eps(new epu(dil.L, 0.1F), epa.b, dil.k.m()),
                  new eps(new epu(dil.eM, 0.1F), epa.b, dil.eL.m())
               )
            ),
            a(euc.aZ, 6),
            a(euc.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new epw(
               List.of(
                  new eps(new epu(dil.L, 0.2F), epa.b, dil.j.m()),
                  new eps(new epu(dil.L, 0.1F), epa.b, dil.k.m()),
                  new eps(new epu(dil.eM, 0.1F), epa.b, dil.eL.m())
               )
            ),
            a(euc.aZ, 2)
         )
      );
      a($$0, L, List.of(a(euc.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new epw(
               List.of(
                  new eps(new epu(dil.so, 0.1F), epa.b, dil.sr.m().b(djx.c, Boolean.valueOf(true))),
                  new eps(new epu(dil.so, 0.33333334F), epa.b, dil.sq.m().b(djx.c, Boolean.valueOf(true))),
                  new eps(new epu(dil.so, 0.5F), epa.b, dil.sp.m().b(djx.c, Boolean.valueOf(true)))
               )
            ),
            new ept(axd.bP)
         )
      );
   }

   private static epi a(alk<eul> $$0, int $$1) {
      return new epi(new epw(List.of(new eps(new eqf(axd.cv), epa.b, epp.b, dil.M.m(), new eqh($$0)))), brj.a($$1));
   }
}
