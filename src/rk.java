import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ale<emk> M = a("empty");
   public static final ale<emk> a = a("zombie_plains");
   public static final ale<emk> b = a("zombie_savanna");
   public static final ale<emk> c = a("zombie_snowy");
   public static final ale<emk> d = a("zombie_taiga");
   public static final ale<emk> e = a("zombie_desert");
   public static final ale<emk> f = a("mossify_10_percent");
   public static final ale<emk> g = a("mossify_20_percent");
   public static final ale<emk> h = a("mossify_70_percent");
   public static final ale<emk> i = a("street_plains");
   public static final ale<emk> j = a("street_savanna");
   public static final ale<emk> k = a("street_snowy_or_taiga");
   public static final ale<emk> l = a("farm_plains");
   public static final ale<emk> m = a("farm_savanna");
   public static final ale<emk> n = a("farm_snowy");
   public static final ale<emk> o = a("farm_taiga");
   public static final ale<emk> p = a("farm_desert");
   public static final ale<emk> q = a("outpost_rot");
   public static final ale<emk> r = a("bottom_rampart");
   public static final ale<emk> s = a("treasure_rooms");
   public static final ale<emk> t = a("housing");
   public static final ale<emk> u = a("side_wall_degradation");
   public static final ale<emk> v = a("stable_degradation");
   public static final ale<emk> w = a("bastion_generic_degradation");
   public static final ale<emk> x = a("rampart_degradation");
   public static final ale<emk> y = a("entrance_replacement");
   public static final ale<emk> z = a("bridge");
   public static final ale<emk> A = a("roof");
   public static final ale<emk> B = a("high_wall");
   public static final ale<emk> C = a("high_rampart");
   public static final ale<emk> D = a("fossil_rot");
   public static final ale<emk> E = a("fossil_coal");
   public static final ale<emk> F = a("fossil_diamonds");
   public static final ale<emk> G = a("ancient_city_start_degradation");
   public static final ale<emk> H = a("ancient_city_generic_degradation");
   public static final ale<emk> I = a("ancient_city_walls_degradation");
   public static final ale<emk> J = a("trail_ruins_houses_archaeology");
   public static final ale<emk> K = a("trail_ruins_roads_archaeology");
   public static final ale<emk> L = a("trail_ruins_tower_top_archaeology");

   private static ale<emk> a(String $$0) {
      return ale.a(lq.aK, new alf($$0));
   }

   private static void a(rc<emk> $$0, ale<emk> $$1, List<emj> $$2) {
      $$0.a($$1, new emk($$2));
   }

   public static void a(rc<emk> $$0) {
      jj<dfb> $$1 = $$0.a(lq.f);
      emb $$2 = new emb(new emd(dfd.pr, 0.01F), elk.b, dfd.pC.o());
      emb $$3 = new emb(new emd(dfd.pC, 0.5F), elk.b, dfd.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.m, 0.8F), elk.b, dfd.cn.o()),
                  new emb(new emo(awp.p), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cp), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cq), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.m, 0.07F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.cn, 0.07F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.hj, 0.07F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.U, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.n, 0.1F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.cu, 0.1F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.al, 0.02F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.eY, 0.5F), elk.b, dfd.bs.o()),
                  new emb[]{
                     new emb(
                        new elr(dfd.eY.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))),
                        elk.b,
                        dfd.hL.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))
                     ),
                     new emb(
                        new elr(dfd.eY.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))),
                        elk.b,
                        dfd.hL.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))
                     ),
                     new emb(new emd(dfd.cB, 0.3F), elk.b, dfd.gt.o()),
                     new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.gu.o()),
                     new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emo(awp.p), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cp), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cq), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.r, 0.2F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.hP, 0.2F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.Y, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.as, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.hk, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.hn, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.hx, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.eY, 0.5F), elk.b, dfd.bs.o()),
                  new emb(
                     new elr(dfd.eY.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))),
                     elk.b,
                     dfd.hL.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))
                  ),
                  new emb[]{
                     new emb(
                        new elr(dfd.eY.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))),
                        elk.b,
                        dfd.hL.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))
                     ),
                     new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emo(awp.p), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cp), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cq), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.oe), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.o, 0.2F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.ju, 0.4F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.af, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.ax, 0.05F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.eY, 0.5F), elk.b, dfd.bs.o()),
                  new emb(
                     new elr(dfd.eY.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))),
                     elk.b,
                     dfd.hL.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))
                  ),
                  new emb(
                     new elr(dfd.eY.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))),
                     elk.b,
                     dfd.hL.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))
                  ),
                  new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.gt.o()),
                  new emb[]{new emb(new emd(dfd.cB, 0.8F), elk.b, dfd.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.m, 0.8F), elk.b, dfd.cn.o()),
                  new emb(new emo(awp.p), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cp), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cq), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.og), elk.b, dfd.og.o().a(dfp.c, Boolean.valueOf(false))),
                  new emb(new emd(dfd.m, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.V, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.eY, 0.5F), elk.b, dfd.bs.o()),
                  new emb(
                     new elr(dfd.eY.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))),
                     elk.b,
                     dfd.hL.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true))
                  ),
                  new emb(
                     new elr(dfd.eY.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))),
                     elk.b,
                     dfd.hL.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true))
                  ),
                  new emb(new emd(dfd.cB, 0.3F), elk.b, dfd.fd.o()),
                  new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.gu.o()),
                  new emb[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emo(awp.p), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cp), elk.b, dfd.a.o()),
                  new emb(new elp(dfd.cq), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.jS, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.aX, 0.1F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.iA, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.nl, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.ny, 0.08F), elk.b, dfd.bs.o()),
                  new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.kD.o()),
                  new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.m, 0.1F), elk.b, dfd.cn.o())))));
      a($$0, g, ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.m, 0.2F), elk.b, dfd.cn.o())))));
      a($$0, h, ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.m, 0.7F), elk.b, dfd.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new elp(dfd.kE), new elp(dfd.G), dfd.n.o()),
                  new emb(new emd(dfd.kE, 0.1F), elk.b, dfd.i.o()),
                  new emb(new elp(dfd.i), new elp(dfd.G), dfd.G.o()),
                  new emb(new elp(dfd.j), new elp(dfd.G), dfd.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new elp(dfd.kE), new elp(dfd.G), dfd.r.o()),
                  new emb(new emd(dfd.kE, 0.2F), elk.b, dfd.i.o()),
                  new emb(new elp(dfd.i), new elp(dfd.G), dfd.G.o()),
                  new emb(new elp(dfd.j), new elp(dfd.G), dfd.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new elp(dfd.kE), new elp(dfd.G), dfd.o.o()),
                  new emb(new elp(dfd.kE), new elp(dfd.dO), dfd.o.o()),
                  new emb(new emd(dfd.kE, 0.2F), elk.b, dfd.i.o()),
                  new emb(new elp(dfd.i), new elp(dfd.G), dfd.G.o()),
                  new emb(new elp(dfd.j), new elp(dfd.G), dfd.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.cB, 0.3F), elk.b, dfd.gt.o()),
                  new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.gu.o()),
                  new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.gt.o()), new emb(new emd(dfd.cB, 0.8F), elk.b, dfd.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.cB, 0.3F), elk.b, dfd.fd.o()), new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.cB, 0.2F), elk.b, dfd.kD.o()), new emb(new emd(dfd.cB, 0.1F), elk.b, dfd.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new elq(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emf(ImmutableList.of(new emb(new emd(dfd.kJ, 0.75F), elk.b, dfd.px.o()), new emb(new emd(dfd.px, 0.15F), elk.b, dfd.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emf(ImmutableList.of(new emb(new emd(dfd.pw, 0.35F), elk.b, dfd.px.o()), new emb(new emd(dfd.py, 0.1F), elk.b, dfd.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emf(ImmutableList.of(new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.px.o()), new emb(new emd(dfd.pr, 1.0E-4F), elk.b, dfd.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emf(ImmutableList.of(new emb(new emd(dfd.py, 0.5F), elk.b, dfd.a.o()), new emb(new emd(dfd.ch, 0.1F), elk.b, dfd.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emf(ImmutableList.of(new emb(new emd(dfd.pw, 0.1F), elk.b, dfd.px.o()), new emb(new emd(dfd.pr, 1.0E-4F), elk.b, dfd.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.px.o()),
                  new emb(new emd(dfd.pr, 1.0E-4F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.ch, 0.3F), elk.b, dfd.px.o()),
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
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.pw, 0.4F), elk.b, dfd.px.o()),
                  new emb(new emd(dfd.pr, 0.01F), elk.b, dfd.px.o()),
                  new emb(new emd(dfd.pw, 1.0E-4F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.pr, 1.0E-4F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.ch, 0.3F), elk.b, dfd.px.o()),
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
            new emf(ImmutableList.of(new emb(new emd(dfd.py, 0.5F), elk.b, dfd.a.o()), new emb(new emd(dfd.ch, 0.6F), elk.b, dfd.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emf(ImmutableList.of(new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.px.o()), new emb(new emd(dfd.pr, 1.0E-4F), elk.b, dfd.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.px.o()),
                  new emb(new emd(dfd.pw, 0.15F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.pw, 0.01F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.pw, 0.5F), elk.b, dfd.px.o()),
                  new emb(new emd(dfd.pw, 0.3F), elk.b, dfd.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emf(
               ImmutableList.of(new emb(new emd(dfd.ch, 0.3F), elk.b, dfd.px.o()), new emb(elk.b, elk.b, new ell(0.0F, 0.05F, 0, 100, je.a.b), dfd.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elq(0.9F), new emc(awp.bO)));
      a($$0, E, ImmutableList.of(new elq(0.1F), new emc(awp.bO)));
      a($$0, F, ImmutableList.of(new elq(0.1F), new emf(ImmutableList.of(new emb(new elp(dfd.R), elk.b, dfd.cy.o()))), new emc(awp.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.sW, 0.3F), elk.b, dfd.tb.o()),
                  new emb(new emd(dfd.sS, 0.3F), elk.b, dfd.tc.o()),
                  new emb(new emd(dfd.of, 0.05F), elk.b, dfd.a.o())
               )
            ),
            new emc(awp.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elq($$1.b(awp.bU), 0.95F),
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.sW, 0.3F), elk.b, dfd.tb.o()),
                  new emb(new emd(dfd.sS, 0.3F), elk.b, dfd.tc.o()),
                  new emb(new emd(dfd.of, 0.05F), elk.b, dfd.a.o())
               )
            ),
            new emc(awp.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elq($$1.b(awp.bU), 0.95F),
            new emf(
               ImmutableList.of(
                  new emb(new emd(dfd.sW, 0.3F), elk.b, dfd.tb.o()),
                  new emb(new emd(dfd.sS, 0.3F), elk.b, dfd.tc.o()),
                  new emb(new emd(dfd.sU, 0.3F), elk.b, dfd.a.o()),
                  new emb(new emd(dfd.of, 0.05F), elk.b, dfd.a.o())
               )
            ),
            new emc(awp.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emf(
               List.of(
                  new emb(new emd(dfd.L, 0.2F), elk.b, dfd.j.o()),
                  new emb(new emd(dfd.L, 0.1F), elk.b, dfd.k.o()),
                  new emb(new emd(dfd.eM, 0.1F), elk.b, dfd.eL.o())
               )
            ),
            a(eqg.bf, 6),
            a(eqg.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emf(
               List.of(
                  new emb(new emd(dfd.L, 0.2F), elk.b, dfd.j.o()),
                  new emb(new emd(dfd.L, 0.1F), elk.b, dfd.k.o()),
                  new emb(new emd(dfd.eM, 0.1F), elk.b, dfd.eL.o())
               )
            ),
            a(eqg.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqg.bf, 2)));
   }

   private static els a(ale<eqp> $$0, int $$1) {
      return new els(new emf(List.of(new emb(new emo(awp.ct), elk.b, ely.b, dfd.M.o(), new emq($$0)))), bpy.a($$1));
   }
}
