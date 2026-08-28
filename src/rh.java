import com.google.common.collect.ImmutableList;
import java.util.List;

public class rh {
   private static final ali<eqi> N = a("empty");
   public static final ali<eqi> a = a("zombie_plains");
   public static final ali<eqi> b = a("zombie_savanna");
   public static final ali<eqi> c = a("zombie_snowy");
   public static final ali<eqi> d = a("zombie_taiga");
   public static final ali<eqi> e = a("zombie_desert");
   public static final ali<eqi> f = a("mossify_10_percent");
   public static final ali<eqi> g = a("mossify_20_percent");
   public static final ali<eqi> h = a("mossify_70_percent");
   public static final ali<eqi> i = a("street_plains");
   public static final ali<eqi> j = a("street_savanna");
   public static final ali<eqi> k = a("street_snowy_or_taiga");
   public static final ali<eqi> l = a("farm_plains");
   public static final ali<eqi> m = a("farm_savanna");
   public static final ali<eqi> n = a("farm_snowy");
   public static final ali<eqi> o = a("farm_taiga");
   public static final ali<eqi> p = a("farm_desert");
   public static final ali<eqi> q = a("outpost_rot");
   public static final ali<eqi> r = a("bottom_rampart");
   public static final ali<eqi> s = a("treasure_rooms");
   public static final ali<eqi> t = a("housing");
   public static final ali<eqi> u = a("side_wall_degradation");
   public static final ali<eqi> v = a("stable_degradation");
   public static final ali<eqi> w = a("bastion_generic_degradation");
   public static final ali<eqi> x = a("rampart_degradation");
   public static final ali<eqi> y = a("entrance_replacement");
   public static final ali<eqi> z = a("bridge");
   public static final ali<eqi> A = a("roof");
   public static final ali<eqi> B = a("high_wall");
   public static final ali<eqi> C = a("high_rampart");
   public static final ali<eqi> D = a("fossil_rot");
   public static final ali<eqi> E = a("fossil_coal");
   public static final ali<eqi> F = a("fossil_diamonds");
   public static final ali<eqi> G = a("ancient_city_start_degradation");
   public static final ali<eqi> H = a("ancient_city_generic_degradation");
   public static final ali<eqi> I = a("ancient_city_walls_degradation");
   public static final ali<eqi> J = a("trail_ruins_houses_archaeology");
   public static final ali<eqi> K = a("trail_ruins_roads_archaeology");
   public static final ali<eqi> L = a("trail_ruins_tower_top_archaeology");
   public static final ali<eqi> M = a("trial_chambers_copper_bulb_degradation");

   private static ali<eqi> a(String $$0) {
      return ali.a(ma.aT, alj.b($$0));
   }

   private static void a(qz<eqi> $$0, ali<eqi> $$1, List<eqh> $$2) {
      $$0.a($$1, new eqi($$2));
   }

   public static void a(qz<eqi> $$0) {
      jr<diq> $$1 = $$0.a(ma.f);
      epz $$2 = new epz(new eqb(dis.pr, 0.01F), eph.b, dis.pC.m());
      epz $$3 = new epz(new eqb(dis.pC, 0.5F), eph.b, dis.pr.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.m, 0.8F), eph.b, dis.cn.m()),
                  new epz(new eqm(axc.q), eph.b, dis.a.m()),
                  new epz(new epm(dis.cp), eph.b, dis.a.m()),
                  new epz(new epm(dis.cq), eph.b, dis.a.m()),
                  new epz(new eqb(dis.m, 0.07F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.cn, 0.07F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.hj, 0.07F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.U, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.n, 0.1F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.cu, 0.1F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.al, 0.02F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.eY, 0.5F), eph.b, dis.bs.m()),
                  new epz[]{
                     new epz(
                        new epo(dis.eY.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))),
                        eph.b,
                        dis.hL.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))
                     ),
                     new epz(
                        new epo(dis.eY.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))),
                        eph.b,
                        dis.hL.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))
                     ),
                     new epz(new eqb(dis.cB, 0.3F), eph.b, dis.gt.m()),
                     new epz(new eqb(dis.cB, 0.2F), eph.b, dis.gu.m()),
                     new epz(new eqb(dis.cB, 0.1F), eph.b, dis.kD.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqm(axc.q), eph.b, dis.a.m()),
                  new epz(new epm(dis.cp), eph.b, dis.a.m()),
                  new epz(new epm(dis.cq), eph.b, dis.a.m()),
                  new epz(new eqb(dis.r, 0.2F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.hP, 0.2F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.Y, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.as, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.hk, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.hn, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.hx, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.eY, 0.5F), eph.b, dis.bs.m()),
                  new epz(
                     new epo(dis.eY.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))),
                     eph.b,
                     dis.hL.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))
                  ),
                  new epz[]{
                     new epz(
                        new epo(dis.eY.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))),
                        eph.b,
                        dis.hL.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))
                     ),
                     new epz(new eqb(dis.cB, 0.1F), eph.b, dis.fe.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqm(axc.q), eph.b, dis.a.m()),
                  new epz(new epm(dis.cp), eph.b, dis.a.m()),
                  new epz(new epm(dis.cq), eph.b, dis.a.m()),
                  new epz(new epm(dis.oe), eph.b, dis.a.m()),
                  new epz(new eqb(dis.o, 0.2F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.ju, 0.4F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.af, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.ax, 0.05F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.eY, 0.5F), eph.b, dis.bs.m()),
                  new epz(
                     new epo(dis.eY.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))),
                     eph.b,
                     dis.hL.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))
                  ),
                  new epz(
                     new epo(dis.eY.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))),
                     eph.b,
                     dis.hL.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))
                  ),
                  new epz(new eqb(dis.cB, 0.1F), eph.b, dis.gt.m()),
                  new epz[]{new epz(new eqb(dis.cB, 0.8F), eph.b, dis.gu.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.m, 0.8F), eph.b, dis.cn.m()),
                  new epz(new eqm(axc.q), eph.b, dis.a.m()),
                  new epz(new epm(dis.cp), eph.b, dis.a.m()),
                  new epz(new epm(dis.cq), eph.b, dis.a.m()),
                  new epz(new epm(dis.og), eph.b, dis.og.m().b(dje.c, Boolean.valueOf(false))),
                  new epz(new eqb(dis.m, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.V, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.eY, 0.5F), eph.b, dis.bs.m()),
                  new epz(
                     new epo(dis.eY.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))),
                     eph.b,
                     dis.hL.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true))
                  ),
                  new epz(
                     new epo(dis.eY.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))),
                     eph.b,
                     dis.hL.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true))
                  ),
                  new epz(new eqb(dis.cB, 0.3F), eph.b, dis.fd.m()),
                  new epz(new eqb(dis.cB, 0.2F), eph.b, dis.gu.m()),
                  new epz[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqm(axc.q), eph.b, dis.a.m()),
                  new epz(new epm(dis.cp), eph.b, dis.a.m()),
                  new epz(new epm(dis.cq), eph.b, dis.a.m()),
                  new epz(new eqb(dis.jS, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.aX, 0.1F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.iA, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.nl, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.ny, 0.08F), eph.b, dis.bs.m()),
                  new epz(new eqb(dis.cB, 0.2F), eph.b, dis.kD.m()),
                  new epz(new eqb(dis.cB, 0.1F), eph.b, dis.fe.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.m, 0.1F), eph.b, dis.cn.m())))));
      a($$0, g, ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.m, 0.2F), eph.b, dis.cn.m())))));
      a($$0, h, ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.m, 0.7F), eph.b, dis.cn.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new epm(dis.kE), new epm(dis.G), dis.n.m()),
                  new epz(new eqb(dis.kE, 0.1F), eph.b, dis.i.m()),
                  new epz(new epm(dis.i), new epm(dis.G), dis.G.m()),
                  new epz(new epm(dis.j), new epm(dis.G), dis.G.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new epm(dis.kE), new epm(dis.G), dis.r.m()),
                  new epz(new eqb(dis.kE, 0.2F), eph.b, dis.i.m()),
                  new epz(new epm(dis.i), new epm(dis.G), dis.G.m()),
                  new epz(new epm(dis.j), new epm(dis.G), dis.G.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new epm(dis.kE), new epm(dis.G), dis.o.m()),
                  new epz(new epm(dis.kE), new epm(dis.dO), dis.o.m()),
                  new epz(new eqb(dis.kE, 0.2F), eph.b, dis.i.m()),
                  new epz(new epm(dis.i), new epm(dis.G), dis.G.m()),
                  new epz(new epm(dis.j), new epm(dis.G), dis.G.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.cB, 0.3F), eph.b, dis.gt.m()),
                  new epz(new eqb(dis.cB, 0.2F), eph.b, dis.gu.m()),
                  new epz(new eqb(dis.cB, 0.1F), eph.b, dis.kD.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.cB, 0.1F), eph.b, dis.fe.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.cB, 0.1F), eph.b, dis.gt.m()), new epz(new eqb(dis.cB, 0.8F), eph.b, dis.gu.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.cB, 0.3F), eph.b, dis.fd.m()), new epz(new eqb(dis.cB, 0.2F), eph.b, dis.gu.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.cB, 0.2F), eph.b, dis.kD.m()), new epz(new eqb(dis.cB, 0.1F), eph.b, dis.fe.m()))))
      );
      a($$0, q, ImmutableList.of(new epn(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eqd(ImmutableList.of(new epz(new eqb(dis.kJ, 0.75F), eph.b, dis.px.m()), new epz(new eqb(dis.px, 0.15F), eph.b, dis.pw.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eqd(ImmutableList.of(new epz(new eqb(dis.pw, 0.35F), eph.b, dis.px.m()), new epz(new eqb(dis.py, 0.1F), eph.b, dis.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eqd(ImmutableList.of(new epz(new eqb(dis.pw, 0.3F), eph.b, dis.px.m()), new epz(new eqb(dis.pr, 1.0E-4F), eph.b, dis.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eqd(ImmutableList.of(new epz(new eqb(dis.py, 0.5F), eph.b, dis.a.m()), new epz(new eqb(dis.ch, 0.1F), eph.b, dis.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eqd(ImmutableList.of(new epz(new eqb(dis.pw, 0.1F), eph.b, dis.px.m()), new epz(new eqb(dis.pr, 1.0E-4F), eph.b, dis.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.pw, 0.3F), eph.b, dis.px.m()),
                  new epz(new eqb(dis.pr, 1.0E-4F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.ch, 0.3F), eph.b, dis.px.m()),
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
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.pw, 0.4F), eph.b, dis.px.m()),
                  new epz(new eqb(dis.pr, 0.01F), eph.b, dis.px.m()),
                  new epz(new eqb(dis.pw, 1.0E-4F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.pr, 1.0E-4F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.ch, 0.3F), eph.b, dis.px.m()),
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
            new eqd(ImmutableList.of(new epz(new eqb(dis.py, 0.5F), eph.b, dis.a.m()), new epz(new eqb(dis.ch, 0.6F), eph.b, dis.px.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eqd(ImmutableList.of(new epz(new eqb(dis.pw, 0.3F), eph.b, dis.px.m()), new epz(new eqb(dis.pr, 1.0E-4F), eph.b, dis.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.pw, 0.3F), eph.b, dis.px.m()),
                  new epz(new eqb(dis.pw, 0.15F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.pw, 0.3F), eph.b, dis.pr.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.pw, 0.01F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.pw, 0.5F), eph.b, dis.px.m()),
                  new epz(new eqb(dis.pw, 0.3F), eph.b, dis.pr.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(new epz(new eqb(dis.ch, 0.3F), eph.b, dis.px.m()), new epz(eph.b, eph.b, new epi(0.0F, 0.05F, 0, 100, jm.a.b), dis.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new epn(0.9F), new eqa(axc.bP)));
      a($$0, E, ImmutableList.of(new epn(0.1F), new eqa(axc.bP)));
      a($$0, F, ImmutableList.of(new epn(0.1F), new eqd(ImmutableList.of(new epz(new epm(dis.R), eph.b, dis.cy.m()))), new eqa(axc.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.sW, 0.3F), eph.b, dis.tb.m()),
                  new epz(new eqb(dis.sS, 0.3F), eph.b, dis.tc.m()),
                  new epz(new eqb(dis.of, 0.05F), eph.b, dis.a.m())
               )
            ),
            new eqa(axc.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new epn($$1.b(axc.bV), 0.95F),
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.sW, 0.3F), eph.b, dis.tb.m()),
                  new epz(new eqb(dis.sS, 0.3F), eph.b, dis.tc.m()),
                  new epz(new eqb(dis.of, 0.05F), eph.b, dis.a.m())
               )
            ),
            new eqa(axc.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new epn($$1.b(axc.bV), 0.95F),
            new eqd(
               ImmutableList.of(
                  new epz(new eqb(dis.sW, 0.3F), eph.b, dis.tb.m()),
                  new epz(new eqb(dis.sS, 0.3F), eph.b, dis.tc.m()),
                  new epz(new eqb(dis.sU, 0.3F), eph.b, dis.a.m()),
                  new epz(new eqb(dis.of, 0.05F), eph.b, dis.a.m())
               )
            ),
            new eqa(axc.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eqd(
               List.of(
                  new epz(new eqb(dis.L, 0.2F), eph.b, dis.j.m()),
                  new epz(new eqb(dis.L, 0.1F), eph.b, dis.k.m()),
                  new epz(new eqb(dis.eM, 0.1F), eph.b, dis.eL.m())
               )
            ),
            a(euj.aZ, 6),
            a(euj.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eqd(
               List.of(
                  new epz(new eqb(dis.L, 0.2F), eph.b, dis.j.m()),
                  new epz(new eqb(dis.L, 0.1F), eph.b, dis.k.m()),
                  new epz(new eqb(dis.eM, 0.1F), eph.b, dis.eL.m())
               )
            ),
            a(euj.aZ, 2)
         )
      );
      a($$0, L, List.of(a(euj.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new eqd(
               List.of(
                  new epz(new eqb(dis.so, 0.1F), eph.b, dis.sr.m().b(dke.c, Boolean.valueOf(true))),
                  new epz(new eqb(dis.so, 0.33333334F), eph.b, dis.sq.m().b(dke.c, Boolean.valueOf(true))),
                  new epz(new eqb(dis.so, 0.5F), eph.b, dis.sp.m().b(dke.c, Boolean.valueOf(true)))
               )
            ),
            new eqa(axc.bP)
         )
      );
   }

   private static epp a(ali<eus> $$0, int $$1) {
      return new epp(new eqd(List.of(new epz(new eqm(axc.cv), eph.b, epw.b, dis.M.m(), new eqo($$0)))), brm.a($$1));
   }
}
