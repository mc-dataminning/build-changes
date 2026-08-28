import com.google.common.collect.ImmutableList;
import java.util.List;

public class qx {
   private static final akp<enl> N = a("empty");
   public static final akp<enl> a = a("zombie_plains");
   public static final akp<enl> b = a("zombie_savanna");
   public static final akp<enl> c = a("zombie_snowy");
   public static final akp<enl> d = a("zombie_taiga");
   public static final akp<enl> e = a("zombie_desert");
   public static final akp<enl> f = a("mossify_10_percent");
   public static final akp<enl> g = a("mossify_20_percent");
   public static final akp<enl> h = a("mossify_70_percent");
   public static final akp<enl> i = a("street_plains");
   public static final akp<enl> j = a("street_savanna");
   public static final akp<enl> k = a("street_snowy_or_taiga");
   public static final akp<enl> l = a("farm_plains");
   public static final akp<enl> m = a("farm_savanna");
   public static final akp<enl> n = a("farm_snowy");
   public static final akp<enl> o = a("farm_taiga");
   public static final akp<enl> p = a("farm_desert");
   public static final akp<enl> q = a("outpost_rot");
   public static final akp<enl> r = a("bottom_rampart");
   public static final akp<enl> s = a("treasure_rooms");
   public static final akp<enl> t = a("housing");
   public static final akp<enl> u = a("side_wall_degradation");
   public static final akp<enl> v = a("stable_degradation");
   public static final akp<enl> w = a("bastion_generic_degradation");
   public static final akp<enl> x = a("rampart_degradation");
   public static final akp<enl> y = a("entrance_replacement");
   public static final akp<enl> z = a("bridge");
   public static final akp<enl> A = a("roof");
   public static final akp<enl> B = a("high_wall");
   public static final akp<enl> C = a("high_rampart");
   public static final akp<enl> D = a("fossil_rot");
   public static final akp<enl> E = a("fossil_coal");
   public static final akp<enl> F = a("fossil_diamonds");
   public static final akp<enl> G = a("ancient_city_start_degradation");
   public static final akp<enl> H = a("ancient_city_generic_degradation");
   public static final akp<enl> I = a("ancient_city_walls_degradation");
   public static final akp<enl> J = a("trail_ruins_houses_archaeology");
   public static final akp<enl> K = a("trail_ruins_roads_archaeology");
   public static final akp<enl> L = a("trail_ruins_tower_top_archaeology");
   public static final akp<enl> M = a("trial_chambers_copper_bulb_degradation");

   private static akp<enl> a(String $$0) {
      return akp.a(lu.aS, akq.b($$0));
   }

   private static void a(qp<enl> $$0, akp<enl> $$1, List<enk> $$2) {
      $$0.a($$1, new enl($$2));
   }

   public static void a(qp<enl> $$0) {
      jn<dfw> $$1 = $$0.a(lu.f);
      enc $$2 = new enc(new ene(dfy.pr, 0.01F), eml.b, dfy.pC.o());
      enc $$3 = new enc(new ene(dfy.pC, 0.5F), eml.b, dfy.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.m, 0.8F), eml.b, dfy.cn.o()),
                  new enc(new enp(awd.p), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cp), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cq), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.m, 0.07F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.cn, 0.07F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.hj, 0.07F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.U, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.n, 0.1F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.cu, 0.1F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.al, 0.02F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.eY, 0.5F), eml.b, dfy.bs.o()),
                  new enc[]{
                     new enc(
                        new ems(dfy.eY.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))),
                        eml.b,
                        dfy.hL.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))
                     ),
                     new enc(
                        new ems(dfy.eY.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))),
                        eml.b,
                        dfy.hL.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))
                     ),
                     new enc(new ene(dfy.cB, 0.3F), eml.b, dfy.gt.o()),
                     new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.gu.o()),
                     new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new enp(awd.p), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cp), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cq), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.r, 0.2F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.hP, 0.2F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.Y, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.as, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.hk, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.hn, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.hx, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.eY, 0.5F), eml.b, dfy.bs.o()),
                  new enc(
                     new ems(dfy.eY.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))),
                     eml.b,
                     dfy.hL.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))
                  ),
                  new enc[]{
                     new enc(
                        new ems(dfy.eY.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))),
                        eml.b,
                        dfy.hL.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))
                     ),
                     new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new enp(awd.p), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cp), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cq), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.oe), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.o, 0.2F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.ju, 0.4F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.af, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.ax, 0.05F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.eY, 0.5F), eml.b, dfy.bs.o()),
                  new enc(
                     new ems(dfy.eY.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))),
                     eml.b,
                     dfy.hL.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))
                  ),
                  new enc(
                     new ems(dfy.eY.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))),
                     eml.b,
                     dfy.hL.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))
                  ),
                  new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.gt.o()),
                  new enc[]{new enc(new ene(dfy.cB, 0.8F), eml.b, dfy.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.m, 0.8F), eml.b, dfy.cn.o()),
                  new enc(new enp(awd.p), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cp), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cq), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.og), eml.b, dfy.og.o().a(dgk.c, Boolean.valueOf(false))),
                  new enc(new ene(dfy.m, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.V, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.eY, 0.5F), eml.b, dfy.bs.o()),
                  new enc(
                     new ems(dfy.eY.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))),
                     eml.b,
                     dfy.hL.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true))
                  ),
                  new enc(
                     new ems(dfy.eY.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))),
                     eml.b,
                     dfy.hL.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true))
                  ),
                  new enc(new ene(dfy.cB, 0.3F), eml.b, dfy.fd.o()),
                  new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.gu.o()),
                  new enc[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new enp(awd.p), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cp), eml.b, dfy.a.o()),
                  new enc(new emq(dfy.cq), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.jS, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.aX, 0.1F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.iA, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.nl, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.ny, 0.08F), eml.b, dfy.bs.o()),
                  new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.kD.o()),
                  new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.m, 0.1F), eml.b, dfy.cn.o())))));
      a($$0, g, ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.m, 0.2F), eml.b, dfy.cn.o())))));
      a($$0, h, ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.m, 0.7F), eml.b, dfy.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new emq(dfy.kE), new emq(dfy.G), dfy.n.o()),
                  new enc(new ene(dfy.kE, 0.1F), eml.b, dfy.i.o()),
                  new enc(new emq(dfy.i), new emq(dfy.G), dfy.G.o()),
                  new enc(new emq(dfy.j), new emq(dfy.G), dfy.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new emq(dfy.kE), new emq(dfy.G), dfy.r.o()),
                  new enc(new ene(dfy.kE, 0.2F), eml.b, dfy.i.o()),
                  new enc(new emq(dfy.i), new emq(dfy.G), dfy.G.o()),
                  new enc(new emq(dfy.j), new emq(dfy.G), dfy.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new emq(dfy.kE), new emq(dfy.G), dfy.o.o()),
                  new enc(new emq(dfy.kE), new emq(dfy.dO), dfy.o.o()),
                  new enc(new ene(dfy.kE, 0.2F), eml.b, dfy.i.o()),
                  new enc(new emq(dfy.i), new emq(dfy.G), dfy.G.o()),
                  new enc(new emq(dfy.j), new emq(dfy.G), dfy.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.cB, 0.3F), eml.b, dfy.gt.o()),
                  new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.gu.o()),
                  new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.gt.o()), new enc(new ene(dfy.cB, 0.8F), eml.b, dfy.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.cB, 0.3F), eml.b, dfy.fd.o()), new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.cB, 0.2F), eml.b, dfy.kD.o()), new enc(new ene(dfy.cB, 0.1F), eml.b, dfy.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new emr(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eng(ImmutableList.of(new enc(new ene(dfy.kJ, 0.75F), eml.b, dfy.px.o()), new enc(new ene(dfy.px, 0.15F), eml.b, dfy.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eng(ImmutableList.of(new enc(new ene(dfy.pw, 0.35F), eml.b, dfy.px.o()), new enc(new ene(dfy.py, 0.1F), eml.b, dfy.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eng(ImmutableList.of(new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.px.o()), new enc(new ene(dfy.pr, 1.0E-4F), eml.b, dfy.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eng(ImmutableList.of(new enc(new ene(dfy.py, 0.5F), eml.b, dfy.a.o()), new enc(new ene(dfy.ch, 0.1F), eml.b, dfy.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eng(ImmutableList.of(new enc(new ene(dfy.pw, 0.1F), eml.b, dfy.px.o()), new enc(new ene(dfy.pr, 1.0E-4F), eml.b, dfy.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.px.o()),
                  new enc(new ene(dfy.pr, 1.0E-4F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.ch, 0.3F), eml.b, dfy.px.o()),
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
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.pw, 0.4F), eml.b, dfy.px.o()),
                  new enc(new ene(dfy.pr, 0.01F), eml.b, dfy.px.o()),
                  new enc(new ene(dfy.pw, 1.0E-4F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.pr, 1.0E-4F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.ch, 0.3F), eml.b, dfy.px.o()),
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
            new eng(ImmutableList.of(new enc(new ene(dfy.py, 0.5F), eml.b, dfy.a.o()), new enc(new ene(dfy.ch, 0.6F), eml.b, dfy.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eng(ImmutableList.of(new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.px.o()), new enc(new ene(dfy.pr, 1.0E-4F), eml.b, dfy.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.px.o()),
                  new enc(new ene(dfy.pw, 0.15F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.pw, 0.01F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.pw, 0.5F), eml.b, dfy.px.o()),
                  new enc(new ene(dfy.pw, 0.3F), eml.b, dfy.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eng(
               ImmutableList.of(new enc(new ene(dfy.ch, 0.3F), eml.b, dfy.px.o()), new enc(eml.b, eml.b, new emm(0.0F, 0.05F, 0, 100, ji.a.b), dfy.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new emr(0.9F), new end(awd.bO)));
      a($$0, E, ImmutableList.of(new emr(0.1F), new end(awd.bO)));
      a($$0, F, ImmutableList.of(new emr(0.1F), new eng(ImmutableList.of(new enc(new emq(dfy.R), eml.b, dfy.cy.o()))), new end(awd.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.sW, 0.3F), eml.b, dfy.tb.o()),
                  new enc(new ene(dfy.sS, 0.3F), eml.b, dfy.tc.o()),
                  new enc(new ene(dfy.of, 0.05F), eml.b, dfy.a.o())
               )
            ),
            new end(awd.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new emr($$1.b(awd.bU), 0.95F),
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.sW, 0.3F), eml.b, dfy.tb.o()),
                  new enc(new ene(dfy.sS, 0.3F), eml.b, dfy.tc.o()),
                  new enc(new ene(dfy.of, 0.05F), eml.b, dfy.a.o())
               )
            ),
            new end(awd.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new emr($$1.b(awd.bU), 0.95F),
            new eng(
               ImmutableList.of(
                  new enc(new ene(dfy.sW, 0.3F), eml.b, dfy.tb.o()),
                  new enc(new ene(dfy.sS, 0.3F), eml.b, dfy.tc.o()),
                  new enc(new ene(dfy.sU, 0.3F), eml.b, dfy.a.o()),
                  new enc(new ene(dfy.of, 0.05F), eml.b, dfy.a.o())
               )
            ),
            new end(awd.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eng(
               List.of(
                  new enc(new ene(dfy.L, 0.2F), eml.b, dfy.j.o()),
                  new enc(new ene(dfy.L, 0.1F), eml.b, dfy.k.o()),
                  new enc(new ene(dfy.eM, 0.1F), eml.b, dfy.eL.o())
               )
            ),
            a(erh.bf, 6),
            a(erh.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eng(
               List.of(
                  new enc(new ene(dfy.L, 0.2F), eml.b, dfy.j.o()),
                  new enc(new ene(dfy.L, 0.1F), eml.b, dfy.k.o()),
                  new enc(new ene(dfy.eM, 0.1F), eml.b, dfy.eL.o())
               )
            ),
            a(erh.bf, 2)
         )
      );
      a($$0, L, List.of(a(erh.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new eng(
               List.of(
                  new enc(new ene(dfy.so, 0.1F), eml.b, dfy.sr.o().a(dhk.c, Boolean.valueOf(true))),
                  new enc(new ene(dfy.so, 0.33333334F), eml.b, dfy.sq.o().a(dhk.c, Boolean.valueOf(true))),
                  new enc(new ene(dfy.so, 0.5F), eml.b, dfy.sp.o().a(dhk.c, Boolean.valueOf(true)))
               )
            ),
            new end(awd.bO)
         )
      );
   }

   private static emt a(akp<erq> $$0, int $$1) {
      return new emt(new eng(List.of(new enc(new enp(awd.ct), eml.b, emz.b, dfy.M.o(), new enr($$0)))), bps.a($$1));
   }
}
