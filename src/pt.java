import com.google.common.collect.ImmutableList;
import java.util.List;

public class pt {
   private static final ajg<eha> M = a("empty");
   public static final ajg<eha> a = a("zombie_plains");
   public static final ajg<eha> b = a("zombie_savanna");
   public static final ajg<eha> c = a("zombie_snowy");
   public static final ajg<eha> d = a("zombie_taiga");
   public static final ajg<eha> e = a("zombie_desert");
   public static final ajg<eha> f = a("mossify_10_percent");
   public static final ajg<eha> g = a("mossify_20_percent");
   public static final ajg<eha> h = a("mossify_70_percent");
   public static final ajg<eha> i = a("street_plains");
   public static final ajg<eha> j = a("street_savanna");
   public static final ajg<eha> k = a("street_snowy_or_taiga");
   public static final ajg<eha> l = a("farm_plains");
   public static final ajg<eha> m = a("farm_savanna");
   public static final ajg<eha> n = a("farm_snowy");
   public static final ajg<eha> o = a("farm_taiga");
   public static final ajg<eha> p = a("farm_desert");
   public static final ajg<eha> q = a("outpost_rot");
   public static final ajg<eha> r = a("bottom_rampart");
   public static final ajg<eha> s = a("treasure_rooms");
   public static final ajg<eha> t = a("housing");
   public static final ajg<eha> u = a("side_wall_degradation");
   public static final ajg<eha> v = a("stable_degradation");
   public static final ajg<eha> w = a("bastion_generic_degradation");
   public static final ajg<eha> x = a("rampart_degradation");
   public static final ajg<eha> y = a("entrance_replacement");
   public static final ajg<eha> z = a("bridge");
   public static final ajg<eha> A = a("roof");
   public static final ajg<eha> B = a("high_wall");
   public static final ajg<eha> C = a("high_rampart");
   public static final ajg<eha> D = a("fossil_rot");
   public static final ajg<eha> E = a("fossil_coal");
   public static final ajg<eha> F = a("fossil_diamonds");
   public static final ajg<eha> G = a("ancient_city_start_degradation");
   public static final ajg<eha> H = a("ancient_city_generic_degradation");
   public static final ajg<eha> I = a("ancient_city_walls_degradation");
   public static final ajg<eha> J = a("trail_ruins_houses_archaeology");
   public static final ajg<eha> K = a("trail_ruins_roads_archaeology");
   public static final ajg<eha> L = a("trail_ruins_tower_top_archaeology");

   private static ajg<eha> a(String $$0) {
      return ajg.a(kj.aF, new ajh($$0));
   }

   private static void a(pl<eha> $$0, ajg<eha> $$1, List<egz> $$2) {
      $$0.a($$1, new eha($$2));
   }

   public static void a(pl<eha> $$0) {
      im<daa> $$1 = $$0.a(kj.f);
      egr $$2 = new egr(new egt(dac.pr, 0.01F), ega.b, dac.pC.o());
      egr $$3 = new egr(new egt(dac.pC, 0.5F), ega.b, dac.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.m, 0.8F), ega.b, dac.cn.o()),
                  new egr(new ehe(aun.p), ega.b, dac.a.o()),
                  new egr(new egf(dac.cp), ega.b, dac.a.o()),
                  new egr(new egf(dac.cq), ega.b, dac.a.o()),
                  new egr(new egt(dac.m, 0.07F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.cn, 0.07F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.hj, 0.07F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.U, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.n, 0.1F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.cu, 0.1F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.al, 0.02F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.eY, 0.5F), ega.b, dac.bs.o()),
                  new egr[]{
                     new egr(
                        new egh(dac.eY.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))),
                        ega.b,
                        dac.hL.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))
                     ),
                     new egr(
                        new egh(dac.eY.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))),
                        ega.b,
                        dac.hL.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))
                     ),
                     new egr(new egt(dac.cB, 0.3F), ega.b, dac.gt.o()),
                     new egr(new egt(dac.cB, 0.2F), ega.b, dac.gu.o()),
                     new egr(new egt(dac.cB, 0.1F), ega.b, dac.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new ehe(aun.p), ega.b, dac.a.o()),
                  new egr(new egf(dac.cp), ega.b, dac.a.o()),
                  new egr(new egf(dac.cq), ega.b, dac.a.o()),
                  new egr(new egt(dac.r, 0.2F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.hP, 0.2F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.Y, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.as, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.hk, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.hn, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.hx, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.eY, 0.5F), ega.b, dac.bs.o()),
                  new egr(
                     new egh(dac.eY.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))),
                     ega.b,
                     dac.hL.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))
                  ),
                  new egr[]{
                     new egr(
                        new egh(dac.eY.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))),
                        ega.b,
                        dac.hL.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))
                     ),
                     new egr(new egt(dac.cB, 0.1F), ega.b, dac.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new ehe(aun.p), ega.b, dac.a.o()),
                  new egr(new egf(dac.cp), ega.b, dac.a.o()),
                  new egr(new egf(dac.cq), ega.b, dac.a.o()),
                  new egr(new egf(dac.oe), ega.b, dac.a.o()),
                  new egr(new egt(dac.o, 0.2F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.ju, 0.4F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.af, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.ax, 0.05F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.eY, 0.5F), ega.b, dac.bs.o()),
                  new egr(
                     new egh(dac.eY.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))),
                     ega.b,
                     dac.hL.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))
                  ),
                  new egr(
                     new egh(dac.eY.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))),
                     ega.b,
                     dac.hL.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))
                  ),
                  new egr(new egt(dac.cB, 0.1F), ega.b, dac.gt.o()),
                  new egr[]{new egr(new egt(dac.cB, 0.8F), ega.b, dac.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.m, 0.8F), ega.b, dac.cn.o()),
                  new egr(new ehe(aun.p), ega.b, dac.a.o()),
                  new egr(new egf(dac.cp), ega.b, dac.a.o()),
                  new egr(new egf(dac.cq), ega.b, dac.a.o()),
                  new egr(new egf(dac.og), ega.b, dac.og.o().a(dao.c, Boolean.valueOf(false))),
                  new egr(new egt(dac.m, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.V, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.eY, 0.5F), ega.b, dac.bs.o()),
                  new egr(
                     new egh(dac.eY.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))),
                     ega.b,
                     dac.hL.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true))
                  ),
                  new egr(
                     new egh(dac.eY.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))),
                     ega.b,
                     dac.hL.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true))
                  ),
                  new egr(new egt(dac.cB, 0.3F), ega.b, dac.fd.o()),
                  new egr(new egt(dac.cB, 0.2F), ega.b, dac.gu.o()),
                  new egr[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new ehe(aun.p), ega.b, dac.a.o()),
                  new egr(new egf(dac.cp), ega.b, dac.a.o()),
                  new egr(new egf(dac.cq), ega.b, dac.a.o()),
                  new egr(new egt(dac.jS, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.aX, 0.1F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.iA, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.nl, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.ny, 0.08F), ega.b, dac.bs.o()),
                  new egr(new egt(dac.cB, 0.2F), ega.b, dac.kD.o()),
                  new egr(new egt(dac.cB, 0.1F), ega.b, dac.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.m, 0.1F), ega.b, dac.cn.o())))));
      a($$0, g, ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.m, 0.2F), ega.b, dac.cn.o())))));
      a($$0, h, ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.m, 0.7F), ega.b, dac.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egf(dac.kE), new egf(dac.G), dac.n.o()),
                  new egr(new egt(dac.kE, 0.1F), ega.b, dac.i.o()),
                  new egr(new egf(dac.i), new egf(dac.G), dac.G.o()),
                  new egr(new egf(dac.j), new egf(dac.G), dac.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egf(dac.kE), new egf(dac.G), dac.r.o()),
                  new egr(new egt(dac.kE, 0.2F), ega.b, dac.i.o()),
                  new egr(new egf(dac.i), new egf(dac.G), dac.G.o()),
                  new egr(new egf(dac.j), new egf(dac.G), dac.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egf(dac.kE), new egf(dac.G), dac.o.o()),
                  new egr(new egf(dac.kE), new egf(dac.dO), dac.o.o()),
                  new egr(new egt(dac.kE, 0.2F), ega.b, dac.i.o()),
                  new egr(new egf(dac.i), new egf(dac.G), dac.G.o()),
                  new egr(new egf(dac.j), new egf(dac.G), dac.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.cB, 0.3F), ega.b, dac.gt.o()),
                  new egr(new egt(dac.cB, 0.2F), ega.b, dac.gu.o()),
                  new egr(new egt(dac.cB, 0.1F), ega.b, dac.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.cB, 0.1F), ega.b, dac.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.cB, 0.1F), ega.b, dac.gt.o()), new egr(new egt(dac.cB, 0.8F), ega.b, dac.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.cB, 0.3F), ega.b, dac.fd.o()), new egr(new egt(dac.cB, 0.2F), ega.b, dac.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.cB, 0.2F), ega.b, dac.kD.o()), new egr(new egt(dac.cB, 0.1F), ega.b, dac.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new egg(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new egv(ImmutableList.of(new egr(new egt(dac.kJ, 0.75F), ega.b, dac.px.o()), new egr(new egt(dac.px, 0.15F), ega.b, dac.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new egv(ImmutableList.of(new egr(new egt(dac.pw, 0.35F), ega.b, dac.px.o()), new egr(new egt(dac.py, 0.1F), ega.b, dac.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new egv(ImmutableList.of(new egr(new egt(dac.pw, 0.3F), ega.b, dac.px.o()), new egr(new egt(dac.pr, 1.0E-4F), ega.b, dac.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new egv(ImmutableList.of(new egr(new egt(dac.py, 0.5F), ega.b, dac.a.o()), new egr(new egt(dac.ch, 0.1F), ega.b, dac.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new egv(ImmutableList.of(new egr(new egt(dac.pw, 0.1F), ega.b, dac.px.o()), new egr(new egt(dac.pr, 1.0E-4F), ega.b, dac.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.pw, 0.3F), ega.b, dac.px.o()),
                  new egr(new egt(dac.pr, 1.0E-4F), ega.b, dac.a.o()),
                  new egr(new egt(dac.ch, 0.3F), ega.b, dac.px.o()),
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
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.pw, 0.4F), ega.b, dac.px.o()),
                  new egr(new egt(dac.pr, 0.01F), ega.b, dac.px.o()),
                  new egr(new egt(dac.pw, 1.0E-4F), ega.b, dac.a.o()),
                  new egr(new egt(dac.pr, 1.0E-4F), ega.b, dac.a.o()),
                  new egr(new egt(dac.ch, 0.3F), ega.b, dac.px.o()),
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
            new egv(ImmutableList.of(new egr(new egt(dac.py, 0.5F), ega.b, dac.a.o()), new egr(new egt(dac.ch, 0.6F), ega.b, dac.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new egv(ImmutableList.of(new egr(new egt(dac.pw, 0.3F), ega.b, dac.px.o()), new egr(new egt(dac.pr, 1.0E-4F), ega.b, dac.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.pw, 0.3F), ega.b, dac.px.o()),
                  new egr(new egt(dac.pw, 0.15F), ega.b, dac.a.o()),
                  new egr(new egt(dac.pw, 0.3F), ega.b, dac.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.pw, 0.01F), ega.b, dac.a.o()),
                  new egr(new egt(dac.pw, 0.5F), ega.b, dac.px.o()),
                  new egr(new egt(dac.pw, 0.3F), ega.b, dac.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new egv(
               ImmutableList.of(new egr(new egt(dac.ch, 0.3F), ega.b, dac.px.o()), new egr(ega.b, ega.b, new egb(0.0F, 0.05F, 0, 100, ih.a.b), dac.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new egg(0.9F), new egs(aun.bI)));
      a($$0, E, ImmutableList.of(new egg(0.1F), new egs(aun.bI)));
      a($$0, F, ImmutableList.of(new egg(0.1F), new egv(ImmutableList.of(new egr(new egf(dac.R), ega.b, dac.cy.o()))), new egs(aun.bI)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.sW, 0.3F), ega.b, dac.tb.o()),
                  new egr(new egt(dac.sS, 0.3F), ega.b, dac.tc.o()),
                  new egr(new egt(dac.of, 0.05F), ega.b, dac.a.o())
               )
            ),
            new egs(aun.bI)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new egg($$1.b(aun.bO), 0.95F),
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.sW, 0.3F), ega.b, dac.tb.o()),
                  new egr(new egt(dac.sS, 0.3F), ega.b, dac.tc.o()),
                  new egr(new egt(dac.of, 0.05F), ega.b, dac.a.o())
               )
            ),
            new egs(aun.bI)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new egg($$1.b(aun.bO), 0.95F),
            new egv(
               ImmutableList.of(
                  new egr(new egt(dac.sW, 0.3F), ega.b, dac.tb.o()),
                  new egr(new egt(dac.sS, 0.3F), ega.b, dac.tc.o()),
                  new egr(new egt(dac.sU, 0.3F), ega.b, dac.a.o()),
                  new egr(new egt(dac.of, 0.05F), ega.b, dac.a.o())
               )
            ),
            new egs(aun.bI)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new egv(
               List.of(
                  new egr(new egt(dac.L, 0.2F), ega.b, dac.j.o()),
                  new egr(new egt(dac.L, 0.1F), ega.b, dac.k.o()),
                  new egr(new egt(dac.eM, 0.1F), ega.b, dac.eL.o())
               )
            ),
            a(eks.aQ, 6),
            a(eks.aR, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new egv(
               List.of(
                  new egr(new egt(dac.L, 0.2F), ega.b, dac.j.o()),
                  new egr(new egt(dac.L, 0.1F), ega.b, dac.k.o()),
                  new egr(new egt(dac.eM, 0.1F), ega.b, dac.eL.o())
               )
            ),
            a(eks.aQ, 2)
         )
      );
      a($$0, L, List.of(a(eks.aQ, 2)));
   }

   private static egi a(ajh $$0, int $$1) {
      return new egi(new egv(List.of(new egr(new ehe(aun.cn), ega.b, ego.b, dac.M.o(), new ehg($$0)))), bme.a($$1));
   }
}
