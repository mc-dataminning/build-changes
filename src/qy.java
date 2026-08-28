import com.google.common.collect.ImmutableList;
import java.util.List;

public class qy {
   private static final akq<enr> N = a("empty");
   public static final akq<enr> a = a("zombie_plains");
   public static final akq<enr> b = a("zombie_savanna");
   public static final akq<enr> c = a("zombie_snowy");
   public static final akq<enr> d = a("zombie_taiga");
   public static final akq<enr> e = a("zombie_desert");
   public static final akq<enr> f = a("mossify_10_percent");
   public static final akq<enr> g = a("mossify_20_percent");
   public static final akq<enr> h = a("mossify_70_percent");
   public static final akq<enr> i = a("street_plains");
   public static final akq<enr> j = a("street_savanna");
   public static final akq<enr> k = a("street_snowy_or_taiga");
   public static final akq<enr> l = a("farm_plains");
   public static final akq<enr> m = a("farm_savanna");
   public static final akq<enr> n = a("farm_snowy");
   public static final akq<enr> o = a("farm_taiga");
   public static final akq<enr> p = a("farm_desert");
   public static final akq<enr> q = a("outpost_rot");
   public static final akq<enr> r = a("bottom_rampart");
   public static final akq<enr> s = a("treasure_rooms");
   public static final akq<enr> t = a("housing");
   public static final akq<enr> u = a("side_wall_degradation");
   public static final akq<enr> v = a("stable_degradation");
   public static final akq<enr> w = a("bastion_generic_degradation");
   public static final akq<enr> x = a("rampart_degradation");
   public static final akq<enr> y = a("entrance_replacement");
   public static final akq<enr> z = a("bridge");
   public static final akq<enr> A = a("roof");
   public static final akq<enr> B = a("high_wall");
   public static final akq<enr> C = a("high_rampart");
   public static final akq<enr> D = a("fossil_rot");
   public static final akq<enr> E = a("fossil_coal");
   public static final akq<enr> F = a("fossil_diamonds");
   public static final akq<enr> G = a("ancient_city_start_degradation");
   public static final akq<enr> H = a("ancient_city_generic_degradation");
   public static final akq<enr> I = a("ancient_city_walls_degradation");
   public static final akq<enr> J = a("trail_ruins_houses_archaeology");
   public static final akq<enr> K = a("trail_ruins_roads_archaeology");
   public static final akq<enr> L = a("trail_ruins_tower_top_archaeology");
   public static final akq<enr> M = a("trial_chambers_copper_bulb_degradation");

   private static akq<enr> a(String $$0) {
      return akq.a(lu.aS, akr.b($$0));
   }

   private static void a(qq<enr> $$0, akq<enr> $$1, List<enq> $$2) {
      $$0.a($$1, new enr($$2));
   }

   public static void a(qq<enr> $$0) {
      jn<dfy> $$1 = $$0.a(lu.f);
      eni $$2 = new eni(new enk(dga.pr, 0.01F), emq.b, dga.pC.o());
      eni $$3 = new eni(new enk(dga.pC, 0.5F), emq.b, dga.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.m, 0.8F), emq.b, dga.cn.o()),
                  new eni(new env(awe.q), emq.b, dga.a.o()),
                  new eni(new emv(dga.cp), emq.b, dga.a.o()),
                  new eni(new emv(dga.cq), emq.b, dga.a.o()),
                  new eni(new enk(dga.m, 0.07F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.cn, 0.07F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.hj, 0.07F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.U, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.n, 0.1F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.cu, 0.1F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.al, 0.02F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.eY, 0.5F), emq.b, dga.bs.o()),
                  new eni[]{
                     new eni(
                        new emx(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                        emq.b,
                        dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                     ),
                     new eni(
                        new emx(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                        emq.b,
                        dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                     ),
                     new eni(new enk(dga.cB, 0.3F), emq.b, dga.gt.o()),
                     new eni(new enk(dga.cB, 0.2F), emq.b, dga.gu.o()),
                     new eni(new enk(dga.cB, 0.1F), emq.b, dga.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.q), emq.b, dga.a.o()),
                  new eni(new emv(dga.cp), emq.b, dga.a.o()),
                  new eni(new emv(dga.cq), emq.b, dga.a.o()),
                  new eni(new enk(dga.r, 0.2F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.hP, 0.2F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.Y, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.as, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.hk, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.hn, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.hx, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.eY, 0.5F), emq.b, dga.bs.o()),
                  new eni(
                     new emx(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emq.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eni[]{
                     new eni(
                        new emx(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                        emq.b,
                        dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                     ),
                     new eni(new enk(dga.cB, 0.1F), emq.b, dga.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.q), emq.b, dga.a.o()),
                  new eni(new emv(dga.cp), emq.b, dga.a.o()),
                  new eni(new emv(dga.cq), emq.b, dga.a.o()),
                  new eni(new emv(dga.oe), emq.b, dga.a.o()),
                  new eni(new enk(dga.o, 0.2F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.ju, 0.4F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.af, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.ax, 0.05F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.eY, 0.5F), emq.b, dga.bs.o()),
                  new eni(
                     new emx(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emq.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eni(
                     new emx(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                     emq.b,
                     dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                  ),
                  new eni(new enk(dga.cB, 0.1F), emq.b, dga.gt.o()),
                  new eni[]{new eni(new enk(dga.cB, 0.8F), emq.b, dga.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.m, 0.8F), emq.b, dga.cn.o()),
                  new eni(new env(awe.q), emq.b, dga.a.o()),
                  new eni(new emv(dga.cp), emq.b, dga.a.o()),
                  new eni(new emv(dga.cq), emq.b, dga.a.o()),
                  new eni(new emv(dga.og), emq.b, dga.og.o().a(dgm.c, Boolean.valueOf(false))),
                  new eni(new enk(dga.m, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.V, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.eY, 0.5F), emq.b, dga.bs.o()),
                  new eni(
                     new emx(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emq.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eni(
                     new emx(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                     emq.b,
                     dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                  ),
                  new eni(new enk(dga.cB, 0.3F), emq.b, dga.fd.o()),
                  new eni(new enk(dga.cB, 0.2F), emq.b, dga.gu.o()),
                  new eni[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.q), emq.b, dga.a.o()),
                  new eni(new emv(dga.cp), emq.b, dga.a.o()),
                  new eni(new emv(dga.cq), emq.b, dga.a.o()),
                  new eni(new enk(dga.jS, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.aX, 0.1F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.iA, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.nl, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.ny, 0.08F), emq.b, dga.bs.o()),
                  new eni(new enk(dga.cB, 0.2F), emq.b, dga.kD.o()),
                  new eni(new enk(dga.cB, 0.1F), emq.b, dga.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.m, 0.1F), emq.b, dga.cn.o())))));
      a($$0, g, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.m, 0.2F), emq.b, dga.cn.o())))));
      a($$0, h, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.m, 0.7F), emq.b, dga.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emv(dga.kE), new emv(dga.G), dga.n.o()),
                  new eni(new enk(dga.kE, 0.1F), emq.b, dga.i.o()),
                  new eni(new emv(dga.i), new emv(dga.G), dga.G.o()),
                  new eni(new emv(dga.j), new emv(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emv(dga.kE), new emv(dga.G), dga.r.o()),
                  new eni(new enk(dga.kE, 0.2F), emq.b, dga.i.o()),
                  new eni(new emv(dga.i), new emv(dga.G), dga.G.o()),
                  new eni(new emv(dga.j), new emv(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emv(dga.kE), new emv(dga.G), dga.o.o()),
                  new eni(new emv(dga.kE), new emv(dga.dO), dga.o.o()),
                  new eni(new enk(dga.kE, 0.2F), emq.b, dga.i.o()),
                  new eni(new emv(dga.i), new emv(dga.G), dga.G.o()),
                  new eni(new emv(dga.j), new emv(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.cB, 0.3F), emq.b, dga.gt.o()),
                  new eni(new enk(dga.cB, 0.2F), emq.b, dga.gu.o()),
                  new eni(new enk(dga.cB, 0.1F), emq.b, dga.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.cB, 0.1F), emq.b, dga.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.cB, 0.1F), emq.b, dga.gt.o()), new eni(new enk(dga.cB, 0.8F), emq.b, dga.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.cB, 0.3F), emq.b, dga.fd.o()), new eni(new enk(dga.cB, 0.2F), emq.b, dga.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.cB, 0.2F), emq.b, dga.kD.o()), new eni(new enk(dga.cB, 0.1F), emq.b, dga.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new emw(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dga.kJ, 0.75F), emq.b, dga.px.o()), new eni(new enk(dga.px, 0.15F), emq.b, dga.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dga.pw, 0.35F), emq.b, dga.px.o()), new eni(new enk(dga.py, 0.1F), emq.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dga.pw, 0.3F), emq.b, dga.px.o()), new eni(new enk(dga.pr, 1.0E-4F), emq.b, dga.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dga.py, 0.5F), emq.b, dga.a.o()), new eni(new enk(dga.ch, 0.1F), emq.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dga.pw, 0.1F), emq.b, dga.px.o()), new eni(new enk(dga.pr, 1.0E-4F), emq.b, dga.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.pw, 0.3F), emq.b, dga.px.o()),
                  new eni(new enk(dga.pr, 1.0E-4F), emq.b, dga.a.o()),
                  new eni(new enk(dga.ch, 0.3F), emq.b, dga.px.o()),
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
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.pw, 0.4F), emq.b, dga.px.o()),
                  new eni(new enk(dga.pr, 0.01F), emq.b, dga.px.o()),
                  new eni(new enk(dga.pw, 1.0E-4F), emq.b, dga.a.o()),
                  new eni(new enk(dga.pr, 1.0E-4F), emq.b, dga.a.o()),
                  new eni(new enk(dga.ch, 0.3F), emq.b, dga.px.o()),
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
            new enm(ImmutableList.of(new eni(new enk(dga.py, 0.5F), emq.b, dga.a.o()), new eni(new enk(dga.ch, 0.6F), emq.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dga.pw, 0.3F), emq.b, dga.px.o()), new eni(new enk(dga.pr, 1.0E-4F), emq.b, dga.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.pw, 0.3F), emq.b, dga.px.o()),
                  new eni(new enk(dga.pw, 0.15F), emq.b, dga.a.o()),
                  new eni(new enk(dga.pw, 0.3F), emq.b, dga.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.pw, 0.01F), emq.b, dga.a.o()),
                  new eni(new enk(dga.pw, 0.5F), emq.b, dga.px.o()),
                  new eni(new enk(dga.pw, 0.3F), emq.b, dga.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new enm(
               ImmutableList.of(new eni(new enk(dga.ch, 0.3F), emq.b, dga.px.o()), new eni(emq.b, emq.b, new emr(0.0F, 0.05F, 0, 100, ji.a.b), dga.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new emw(0.9F), new enj(awe.bP)));
      a($$0, E, ImmutableList.of(new emw(0.1F), new enj(awe.bP)));
      a($$0, F, ImmutableList.of(new emw(0.1F), new enm(ImmutableList.of(new eni(new emv(dga.R), emq.b, dga.cy.o()))), new enj(awe.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.sW, 0.3F), emq.b, dga.tb.o()),
                  new eni(new enk(dga.sS, 0.3F), emq.b, dga.tc.o()),
                  new eni(new enk(dga.of, 0.05F), emq.b, dga.a.o())
               )
            ),
            new enj(awe.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new emw($$1.b(awe.bV), 0.95F),
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.sW, 0.3F), emq.b, dga.tb.o()),
                  new eni(new enk(dga.sS, 0.3F), emq.b, dga.tc.o()),
                  new eni(new enk(dga.of, 0.05F), emq.b, dga.a.o())
               )
            ),
            new enj(awe.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new emw($$1.b(awe.bV), 0.95F),
            new enm(
               ImmutableList.of(
                  new eni(new enk(dga.sW, 0.3F), emq.b, dga.tb.o()),
                  new eni(new enk(dga.sS, 0.3F), emq.b, dga.tc.o()),
                  new eni(new enk(dga.sU, 0.3F), emq.b, dga.a.o()),
                  new eni(new enk(dga.of, 0.05F), emq.b, dga.a.o())
               )
            ),
            new enj(awe.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new enm(
               List.of(
                  new eni(new enk(dga.L, 0.2F), emq.b, dga.j.o()),
                  new eni(new enk(dga.L, 0.1F), emq.b, dga.k.o()),
                  new eni(new enk(dga.eM, 0.1F), emq.b, dga.eL.o())
               )
            ),
            a(ern.bf, 6),
            a(ern.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new enm(
               List.of(
                  new eni(new enk(dga.L, 0.2F), emq.b, dga.j.o()),
                  new eni(new enk(dga.L, 0.1F), emq.b, dga.k.o()),
                  new eni(new enk(dga.eM, 0.1F), emq.b, dga.eL.o())
               )
            ),
            a(ern.bf, 2)
         )
      );
      a($$0, L, List.of(a(ern.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new enm(
               List.of(
                  new eni(new enk(dga.so, 0.1F), emq.b, dga.sr.o().a(dhm.c, Boolean.valueOf(true))),
                  new eni(new enk(dga.so, 0.33333334F), emq.b, dga.sq.o().a(dhm.c, Boolean.valueOf(true))),
                  new eni(new enk(dga.so, 0.5F), emq.b, dga.sp.o().a(dhm.c, Boolean.valueOf(true)))
               )
            ),
            new enj(awe.bP)
         )
      );
   }

   private static emy a(akq<erw> $$0, int $$1) {
      return new emy(new enm(List.of(new eni(new env(awe.cu), emq.b, enf.b, dga.M.o(), new enx($$0)))), bpt.a($$1));
   }
}
