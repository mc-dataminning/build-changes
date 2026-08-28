import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ala<emd> M = a("empty");
   public static final ala<emd> a = a("zombie_plains");
   public static final ala<emd> b = a("zombie_savanna");
   public static final ala<emd> c = a("zombie_snowy");
   public static final ala<emd> d = a("zombie_taiga");
   public static final ala<emd> e = a("zombie_desert");
   public static final ala<emd> f = a("mossify_10_percent");
   public static final ala<emd> g = a("mossify_20_percent");
   public static final ala<emd> h = a("mossify_70_percent");
   public static final ala<emd> i = a("street_plains");
   public static final ala<emd> j = a("street_savanna");
   public static final ala<emd> k = a("street_snowy_or_taiga");
   public static final ala<emd> l = a("farm_plains");
   public static final ala<emd> m = a("farm_savanna");
   public static final ala<emd> n = a("farm_snowy");
   public static final ala<emd> o = a("farm_taiga");
   public static final ala<emd> p = a("farm_desert");
   public static final ala<emd> q = a("outpost_rot");
   public static final ala<emd> r = a("bottom_rampart");
   public static final ala<emd> s = a("treasure_rooms");
   public static final ala<emd> t = a("housing");
   public static final ala<emd> u = a("side_wall_degradation");
   public static final ala<emd> v = a("stable_degradation");
   public static final ala<emd> w = a("bastion_generic_degradation");
   public static final ala<emd> x = a("rampart_degradation");
   public static final ala<emd> y = a("entrance_replacement");
   public static final ala<emd> z = a("bridge");
   public static final ala<emd> A = a("roof");
   public static final ala<emd> B = a("high_wall");
   public static final ala<emd> C = a("high_rampart");
   public static final ala<emd> D = a("fossil_rot");
   public static final ala<emd> E = a("fossil_coal");
   public static final ala<emd> F = a("fossil_diamonds");
   public static final ala<emd> G = a("ancient_city_start_degradation");
   public static final ala<emd> H = a("ancient_city_generic_degradation");
   public static final ala<emd> I = a("ancient_city_walls_degradation");
   public static final ala<emd> J = a("trail_ruins_houses_archaeology");
   public static final ala<emd> K = a("trail_ruins_roads_archaeology");
   public static final ala<emd> L = a("trail_ruins_tower_top_archaeology");

   private static ala<emd> a(String $$0) {
      return ala.a(lq.aK, new alb($$0));
   }

   private static void a(rc<emd> $$0, ala<emd> $$1, List<emc> $$2) {
      $$0.a($$1, new emd($$2));
   }

   public static void a(rc<emd> $$0) {
      jj<deu> $$1 = $$0.a(lq.f);
      elu $$2 = new elu(new elw(dew.pr, 0.01F), eld.b, dew.pC.n());
      elu $$3 = new elu(new elw(dew.pC, 0.5F), eld.b, dew.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.m, 0.8F), eld.b, dew.cn.n()),
                  new elu(new emh(awl.p), eld.b, dew.a.n()),
                  new elu(new eli(dew.cp), eld.b, dew.a.n()),
                  new elu(new eli(dew.cq), eld.b, dew.a.n()),
                  new elu(new elw(dew.m, 0.07F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.cn, 0.07F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.hj, 0.07F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.U, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.n, 0.1F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.cu, 0.1F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.al, 0.02F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.eY, 0.5F), eld.b, dew.bs.n()),
                  new elu[]{
                     new elu(
                        new elk(dew.eY.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))),
                        eld.b,
                        dew.hL.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))
                     ),
                     new elu(
                        new elk(dew.eY.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))),
                        eld.b,
                        dew.hL.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))
                     ),
                     new elu(new elw(dew.cB, 0.3F), eld.b, dew.gt.n()),
                     new elu(new elw(dew.cB, 0.2F), eld.b, dew.gu.n()),
                     new elu(new elw(dew.cB, 0.1F), eld.b, dew.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new emh(awl.p), eld.b, dew.a.n()),
                  new elu(new eli(dew.cp), eld.b, dew.a.n()),
                  new elu(new eli(dew.cq), eld.b, dew.a.n()),
                  new elu(new elw(dew.r, 0.2F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.hP, 0.2F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.Y, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.as, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.hk, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.hn, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.hx, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.eY, 0.5F), eld.b, dew.bs.n()),
                  new elu(
                     new elk(dew.eY.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))),
                     eld.b,
                     dew.hL.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))
                  ),
                  new elu[]{
                     new elu(
                        new elk(dew.eY.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))),
                        eld.b,
                        dew.hL.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))
                     ),
                     new elu(new elw(dew.cB, 0.1F), eld.b, dew.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new emh(awl.p), eld.b, dew.a.n()),
                  new elu(new eli(dew.cp), eld.b, dew.a.n()),
                  new elu(new eli(dew.cq), eld.b, dew.a.n()),
                  new elu(new eli(dew.oe), eld.b, dew.a.n()),
                  new elu(new elw(dew.o, 0.2F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.ju, 0.4F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.af, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.ax, 0.05F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.eY, 0.5F), eld.b, dew.bs.n()),
                  new elu(
                     new elk(dew.eY.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))),
                     eld.b,
                     dew.hL.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))
                  ),
                  new elu(
                     new elk(dew.eY.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))),
                     eld.b,
                     dew.hL.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))
                  ),
                  new elu(new elw(dew.cB, 0.1F), eld.b, dew.gt.n()),
                  new elu[]{new elu(new elw(dew.cB, 0.8F), eld.b, dew.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.m, 0.8F), eld.b, dew.cn.n()),
                  new elu(new emh(awl.p), eld.b, dew.a.n()),
                  new elu(new eli(dew.cp), eld.b, dew.a.n()),
                  new elu(new eli(dew.cq), eld.b, dew.a.n()),
                  new elu(new eli(dew.og), eld.b, dew.og.n().a(dfi.c, Boolean.valueOf(false))),
                  new elu(new elw(dew.m, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.V, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.eY, 0.5F), eld.b, dew.bs.n()),
                  new elu(
                     new elk(dew.eY.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))),
                     eld.b,
                     dew.hL.n().a(div.a, Boolean.valueOf(true)).a(div.c, Boolean.valueOf(true))
                  ),
                  new elu(
                     new elk(dew.eY.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))),
                     eld.b,
                     dew.hL.n().a(div.b, Boolean.valueOf(true)).a(div.d, Boolean.valueOf(true))
                  ),
                  new elu(new elw(dew.cB, 0.3F), eld.b, dew.fd.n()),
                  new elu(new elw(dew.cB, 0.2F), eld.b, dew.gu.n()),
                  new elu[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new emh(awl.p), eld.b, dew.a.n()),
                  new elu(new eli(dew.cp), eld.b, dew.a.n()),
                  new elu(new eli(dew.cq), eld.b, dew.a.n()),
                  new elu(new elw(dew.jS, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.aX, 0.1F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.iA, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.nl, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.ny, 0.08F), eld.b, dew.bs.n()),
                  new elu(new elw(dew.cB, 0.2F), eld.b, dew.kD.n()),
                  new elu(new elw(dew.cB, 0.1F), eld.b, dew.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.m, 0.1F), eld.b, dew.cn.n())))));
      a($$0, g, ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.m, 0.2F), eld.b, dew.cn.n())))));
      a($$0, h, ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.m, 0.7F), eld.b, dew.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new eli(dew.kE), new eli(dew.G), dew.n.n()),
                  new elu(new elw(dew.kE, 0.1F), eld.b, dew.i.n()),
                  new elu(new eli(dew.i), new eli(dew.G), dew.G.n()),
                  new elu(new eli(dew.j), new eli(dew.G), dew.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new eli(dew.kE), new eli(dew.G), dew.r.n()),
                  new elu(new elw(dew.kE, 0.2F), eld.b, dew.i.n()),
                  new elu(new eli(dew.i), new eli(dew.G), dew.G.n()),
                  new elu(new eli(dew.j), new eli(dew.G), dew.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new eli(dew.kE), new eli(dew.G), dew.o.n()),
                  new elu(new eli(dew.kE), new eli(dew.dO), dew.o.n()),
                  new elu(new elw(dew.kE, 0.2F), eld.b, dew.i.n()),
                  new elu(new eli(dew.i), new eli(dew.G), dew.G.n()),
                  new elu(new eli(dew.j), new eli(dew.G), dew.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.cB, 0.3F), eld.b, dew.gt.n()),
                  new elu(new elw(dew.cB, 0.2F), eld.b, dew.gu.n()),
                  new elu(new elw(dew.cB, 0.1F), eld.b, dew.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.cB, 0.1F), eld.b, dew.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.cB, 0.1F), eld.b, dew.gt.n()), new elu(new elw(dew.cB, 0.8F), eld.b, dew.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.cB, 0.3F), eld.b, dew.fd.n()), new elu(new elw(dew.cB, 0.2F), eld.b, dew.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.cB, 0.2F), eld.b, dew.kD.n()), new elu(new elw(dew.cB, 0.1F), eld.b, dew.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new elj(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ely(ImmutableList.of(new elu(new elw(dew.kJ, 0.75F), eld.b, dew.px.n()), new elu(new elw(dew.px, 0.15F), eld.b, dew.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ely(ImmutableList.of(new elu(new elw(dew.pw, 0.35F), eld.b, dew.px.n()), new elu(new elw(dew.py, 0.1F), eld.b, dew.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ely(ImmutableList.of(new elu(new elw(dew.pw, 0.3F), eld.b, dew.px.n()), new elu(new elw(dew.pr, 1.0E-4F), eld.b, dew.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ely(ImmutableList.of(new elu(new elw(dew.py, 0.5F), eld.b, dew.a.n()), new elu(new elw(dew.ch, 0.1F), eld.b, dew.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ely(ImmutableList.of(new elu(new elw(dew.pw, 0.1F), eld.b, dew.px.n()), new elu(new elw(dew.pr, 1.0E-4F), eld.b, dew.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.pw, 0.3F), eld.b, dew.px.n()),
                  new elu(new elw(dew.pr, 1.0E-4F), eld.b, dew.a.n()),
                  new elu(new elw(dew.ch, 0.3F), eld.b, dew.px.n()),
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
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.pw, 0.4F), eld.b, dew.px.n()),
                  new elu(new elw(dew.pr, 0.01F), eld.b, dew.px.n()),
                  new elu(new elw(dew.pw, 1.0E-4F), eld.b, dew.a.n()),
                  new elu(new elw(dew.pr, 1.0E-4F), eld.b, dew.a.n()),
                  new elu(new elw(dew.ch, 0.3F), eld.b, dew.px.n()),
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
            new ely(ImmutableList.of(new elu(new elw(dew.py, 0.5F), eld.b, dew.a.n()), new elu(new elw(dew.ch, 0.6F), eld.b, dew.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ely(ImmutableList.of(new elu(new elw(dew.pw, 0.3F), eld.b, dew.px.n()), new elu(new elw(dew.pr, 1.0E-4F), eld.b, dew.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.pw, 0.3F), eld.b, dew.px.n()),
                  new elu(new elw(dew.pw, 0.15F), eld.b, dew.a.n()),
                  new elu(new elw(dew.pw, 0.3F), eld.b, dew.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.pw, 0.01F), eld.b, dew.a.n()),
                  new elu(new elw(dew.pw, 0.5F), eld.b, dew.px.n()),
                  new elu(new elw(dew.pw, 0.3F), eld.b, dew.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ely(
               ImmutableList.of(new elu(new elw(dew.ch, 0.3F), eld.b, dew.px.n()), new elu(eld.b, eld.b, new ele(0.0F, 0.05F, 0, 100, je.a.b), dew.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elj(0.9F), new elv(awl.bO)));
      a($$0, E, ImmutableList.of(new elj(0.1F), new elv(awl.bO)));
      a($$0, F, ImmutableList.of(new elj(0.1F), new ely(ImmutableList.of(new elu(new eli(dew.R), eld.b, dew.cy.n()))), new elv(awl.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.sW, 0.3F), eld.b, dew.tb.n()),
                  new elu(new elw(dew.sS, 0.3F), eld.b, dew.tc.n()),
                  new elu(new elw(dew.of, 0.05F), eld.b, dew.a.n())
               )
            ),
            new elv(awl.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elj($$1.b(awl.bU), 0.95F),
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.sW, 0.3F), eld.b, dew.tb.n()),
                  new elu(new elw(dew.sS, 0.3F), eld.b, dew.tc.n()),
                  new elu(new elw(dew.of, 0.05F), eld.b, dew.a.n())
               )
            ),
            new elv(awl.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elj($$1.b(awl.bU), 0.95F),
            new ely(
               ImmutableList.of(
                  new elu(new elw(dew.sW, 0.3F), eld.b, dew.tb.n()),
                  new elu(new elw(dew.sS, 0.3F), eld.b, dew.tc.n()),
                  new elu(new elw(dew.sU, 0.3F), eld.b, dew.a.n()),
                  new elu(new elw(dew.of, 0.05F), eld.b, dew.a.n())
               )
            ),
            new elv(awl.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ely(
               List.of(
                  new elu(new elw(dew.L, 0.2F), eld.b, dew.j.n()),
                  new elu(new elw(dew.L, 0.1F), eld.b, dew.k.n()),
                  new elu(new elw(dew.eM, 0.1F), eld.b, dew.eL.n())
               )
            ),
            a(epz.bf, 6),
            a(epz.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ely(
               List.of(
                  new elu(new elw(dew.L, 0.2F), eld.b, dew.j.n()),
                  new elu(new elw(dew.L, 0.1F), eld.b, dew.k.n()),
                  new elu(new elw(dew.eM, 0.1F), eld.b, dew.eL.n())
               )
            ),
            a(epz.bf, 2)
         )
      );
      a($$0, L, List.of(a(epz.bf, 2)));
   }

   private static ell a(ala<eqi> $$0, int $$1) {
      return new ell(new ely(List.of(new elu(new emh(awl.ct), eld.b, elr.b, dew.M.n(), new emj($$0)))), bpr.a($$1));
   }
}
