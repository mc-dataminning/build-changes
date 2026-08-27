import com.google.common.collect.ImmutableList;
import java.util.List;

public class pt {
   private static final ajg<ehc> M = a("empty");
   public static final ajg<ehc> a = a("zombie_plains");
   public static final ajg<ehc> b = a("zombie_savanna");
   public static final ajg<ehc> c = a("zombie_snowy");
   public static final ajg<ehc> d = a("zombie_taiga");
   public static final ajg<ehc> e = a("zombie_desert");
   public static final ajg<ehc> f = a("mossify_10_percent");
   public static final ajg<ehc> g = a("mossify_20_percent");
   public static final ajg<ehc> h = a("mossify_70_percent");
   public static final ajg<ehc> i = a("street_plains");
   public static final ajg<ehc> j = a("street_savanna");
   public static final ajg<ehc> k = a("street_snowy_or_taiga");
   public static final ajg<ehc> l = a("farm_plains");
   public static final ajg<ehc> m = a("farm_savanna");
   public static final ajg<ehc> n = a("farm_snowy");
   public static final ajg<ehc> o = a("farm_taiga");
   public static final ajg<ehc> p = a("farm_desert");
   public static final ajg<ehc> q = a("outpost_rot");
   public static final ajg<ehc> r = a("bottom_rampart");
   public static final ajg<ehc> s = a("treasure_rooms");
   public static final ajg<ehc> t = a("housing");
   public static final ajg<ehc> u = a("side_wall_degradation");
   public static final ajg<ehc> v = a("stable_degradation");
   public static final ajg<ehc> w = a("bastion_generic_degradation");
   public static final ajg<ehc> x = a("rampart_degradation");
   public static final ajg<ehc> y = a("entrance_replacement");
   public static final ajg<ehc> z = a("bridge");
   public static final ajg<ehc> A = a("roof");
   public static final ajg<ehc> B = a("high_wall");
   public static final ajg<ehc> C = a("high_rampart");
   public static final ajg<ehc> D = a("fossil_rot");
   public static final ajg<ehc> E = a("fossil_coal");
   public static final ajg<ehc> F = a("fossil_diamonds");
   public static final ajg<ehc> G = a("ancient_city_start_degradation");
   public static final ajg<ehc> H = a("ancient_city_generic_degradation");
   public static final ajg<ehc> I = a("ancient_city_walls_degradation");
   public static final ajg<ehc> J = a("trail_ruins_houses_archaeology");
   public static final ajg<ehc> K = a("trail_ruins_roads_archaeology");
   public static final ajg<ehc> L = a("trail_ruins_tower_top_archaeology");

   private static ajg<ehc> a(String $$0) {
      return ajg.a(kj.aF, new ajh($$0));
   }

   private static void a(pl<ehc> $$0, ajg<ehc> $$1, List<ehb> $$2) {
      $$0.a($$1, new ehc($$2));
   }

   public static void a(pl<ehc> $$0) {
      im<dac> $$1 = $$0.a(kj.f);
      egt $$2 = new egt(new egv(dae.pr, 0.01F), egc.b, dae.pC.o());
      egt $$3 = new egt(new egv(dae.pC, 0.5F), egc.b, dae.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.m, 0.8F), egc.b, dae.cn.o()),
                  new egt(new ehg(aun.p), egc.b, dae.a.o()),
                  new egt(new egh(dae.cp), egc.b, dae.a.o()),
                  new egt(new egh(dae.cq), egc.b, dae.a.o()),
                  new egt(new egv(dae.m, 0.07F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.cn, 0.07F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.hj, 0.07F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.U, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.n, 0.1F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.cu, 0.1F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.al, 0.02F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.eY, 0.5F), egc.b, dae.bs.o()),
                  new egt[]{
                     new egt(
                        new egj(dae.eY.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))),
                        egc.b,
                        dae.hL.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))
                     ),
                     new egt(
                        new egj(dae.eY.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))),
                        egc.b,
                        dae.hL.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))
                     ),
                     new egt(new egv(dae.cB, 0.3F), egc.b, dae.gt.o()),
                     new egt(new egv(dae.cB, 0.2F), egc.b, dae.gu.o()),
                     new egt(new egv(dae.cB, 0.1F), egc.b, dae.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new ehg(aun.p), egc.b, dae.a.o()),
                  new egt(new egh(dae.cp), egc.b, dae.a.o()),
                  new egt(new egh(dae.cq), egc.b, dae.a.o()),
                  new egt(new egv(dae.r, 0.2F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.hP, 0.2F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.Y, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.as, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.hk, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.hn, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.hx, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.eY, 0.5F), egc.b, dae.bs.o()),
                  new egt(
                     new egj(dae.eY.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))),
                     egc.b,
                     dae.hL.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))
                  ),
                  new egt[]{
                     new egt(
                        new egj(dae.eY.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))),
                        egc.b,
                        dae.hL.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))
                     ),
                     new egt(new egv(dae.cB, 0.1F), egc.b, dae.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new ehg(aun.p), egc.b, dae.a.o()),
                  new egt(new egh(dae.cp), egc.b, dae.a.o()),
                  new egt(new egh(dae.cq), egc.b, dae.a.o()),
                  new egt(new egh(dae.oe), egc.b, dae.a.o()),
                  new egt(new egv(dae.o, 0.2F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.ju, 0.4F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.af, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.ax, 0.05F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.eY, 0.5F), egc.b, dae.bs.o()),
                  new egt(
                     new egj(dae.eY.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))),
                     egc.b,
                     dae.hL.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))
                  ),
                  new egt(
                     new egj(dae.eY.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))),
                     egc.b,
                     dae.hL.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))
                  ),
                  new egt(new egv(dae.cB, 0.1F), egc.b, dae.gt.o()),
                  new egt[]{new egt(new egv(dae.cB, 0.8F), egc.b, dae.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.m, 0.8F), egc.b, dae.cn.o()),
                  new egt(new ehg(aun.p), egc.b, dae.a.o()),
                  new egt(new egh(dae.cp), egc.b, dae.a.o()),
                  new egt(new egh(dae.cq), egc.b, dae.a.o()),
                  new egt(new egh(dae.og), egc.b, dae.og.o().a(daq.c, Boolean.valueOf(false))),
                  new egt(new egv(dae.m, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.V, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.eY, 0.5F), egc.b, dae.bs.o()),
                  new egt(
                     new egj(dae.eY.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))),
                     egc.b,
                     dae.hL.o().a(dec.a, Boolean.valueOf(true)).a(dec.c, Boolean.valueOf(true))
                  ),
                  new egt(
                     new egj(dae.eY.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))),
                     egc.b,
                     dae.hL.o().a(dec.b, Boolean.valueOf(true)).a(dec.d, Boolean.valueOf(true))
                  ),
                  new egt(new egv(dae.cB, 0.3F), egc.b, dae.fd.o()),
                  new egt(new egv(dae.cB, 0.2F), egc.b, dae.gu.o()),
                  new egt[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new ehg(aun.p), egc.b, dae.a.o()),
                  new egt(new egh(dae.cp), egc.b, dae.a.o()),
                  new egt(new egh(dae.cq), egc.b, dae.a.o()),
                  new egt(new egv(dae.jS, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.aX, 0.1F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.iA, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.nl, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.ny, 0.08F), egc.b, dae.bs.o()),
                  new egt(new egv(dae.cB, 0.2F), egc.b, dae.kD.o()),
                  new egt(new egv(dae.cB, 0.1F), egc.b, dae.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.m, 0.1F), egc.b, dae.cn.o())))));
      a($$0, g, ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.m, 0.2F), egc.b, dae.cn.o())))));
      a($$0, h, ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.m, 0.7F), egc.b, dae.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egh(dae.kE), new egh(dae.G), dae.n.o()),
                  new egt(new egv(dae.kE, 0.1F), egc.b, dae.i.o()),
                  new egt(new egh(dae.i), new egh(dae.G), dae.G.o()),
                  new egt(new egh(dae.j), new egh(dae.G), dae.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egh(dae.kE), new egh(dae.G), dae.r.o()),
                  new egt(new egv(dae.kE, 0.2F), egc.b, dae.i.o()),
                  new egt(new egh(dae.i), new egh(dae.G), dae.G.o()),
                  new egt(new egh(dae.j), new egh(dae.G), dae.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egh(dae.kE), new egh(dae.G), dae.o.o()),
                  new egt(new egh(dae.kE), new egh(dae.dO), dae.o.o()),
                  new egt(new egv(dae.kE, 0.2F), egc.b, dae.i.o()),
                  new egt(new egh(dae.i), new egh(dae.G), dae.G.o()),
                  new egt(new egh(dae.j), new egh(dae.G), dae.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.cB, 0.3F), egc.b, dae.gt.o()),
                  new egt(new egv(dae.cB, 0.2F), egc.b, dae.gu.o()),
                  new egt(new egv(dae.cB, 0.1F), egc.b, dae.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.cB, 0.1F), egc.b, dae.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.cB, 0.1F), egc.b, dae.gt.o()), new egt(new egv(dae.cB, 0.8F), egc.b, dae.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.cB, 0.3F), egc.b, dae.fd.o()), new egt(new egv(dae.cB, 0.2F), egc.b, dae.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.cB, 0.2F), egc.b, dae.kD.o()), new egt(new egv(dae.cB, 0.1F), egc.b, dae.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new egi(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new egx(ImmutableList.of(new egt(new egv(dae.kJ, 0.75F), egc.b, dae.px.o()), new egt(new egv(dae.px, 0.15F), egc.b, dae.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new egx(ImmutableList.of(new egt(new egv(dae.pw, 0.35F), egc.b, dae.px.o()), new egt(new egv(dae.py, 0.1F), egc.b, dae.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new egx(ImmutableList.of(new egt(new egv(dae.pw, 0.3F), egc.b, dae.px.o()), new egt(new egv(dae.pr, 1.0E-4F), egc.b, dae.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new egx(ImmutableList.of(new egt(new egv(dae.py, 0.5F), egc.b, dae.a.o()), new egt(new egv(dae.ch, 0.1F), egc.b, dae.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new egx(ImmutableList.of(new egt(new egv(dae.pw, 0.1F), egc.b, dae.px.o()), new egt(new egv(dae.pr, 1.0E-4F), egc.b, dae.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.pw, 0.3F), egc.b, dae.px.o()),
                  new egt(new egv(dae.pr, 1.0E-4F), egc.b, dae.a.o()),
                  new egt(new egv(dae.ch, 0.3F), egc.b, dae.px.o()),
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
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.pw, 0.4F), egc.b, dae.px.o()),
                  new egt(new egv(dae.pr, 0.01F), egc.b, dae.px.o()),
                  new egt(new egv(dae.pw, 1.0E-4F), egc.b, dae.a.o()),
                  new egt(new egv(dae.pr, 1.0E-4F), egc.b, dae.a.o()),
                  new egt(new egv(dae.ch, 0.3F), egc.b, dae.px.o()),
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
            new egx(ImmutableList.of(new egt(new egv(dae.py, 0.5F), egc.b, dae.a.o()), new egt(new egv(dae.ch, 0.6F), egc.b, dae.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new egx(ImmutableList.of(new egt(new egv(dae.pw, 0.3F), egc.b, dae.px.o()), new egt(new egv(dae.pr, 1.0E-4F), egc.b, dae.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.pw, 0.3F), egc.b, dae.px.o()),
                  new egt(new egv(dae.pw, 0.15F), egc.b, dae.a.o()),
                  new egt(new egv(dae.pw, 0.3F), egc.b, dae.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.pw, 0.01F), egc.b, dae.a.o()),
                  new egt(new egv(dae.pw, 0.5F), egc.b, dae.px.o()),
                  new egt(new egv(dae.pw, 0.3F), egc.b, dae.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new egx(
               ImmutableList.of(new egt(new egv(dae.ch, 0.3F), egc.b, dae.px.o()), new egt(egc.b, egc.b, new egd(0.0F, 0.05F, 0, 100, ih.a.b), dae.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new egi(0.9F), new egu(aun.bI)));
      a($$0, E, ImmutableList.of(new egi(0.1F), new egu(aun.bI)));
      a($$0, F, ImmutableList.of(new egi(0.1F), new egx(ImmutableList.of(new egt(new egh(dae.R), egc.b, dae.cy.o()))), new egu(aun.bI)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.sW, 0.3F), egc.b, dae.tb.o()),
                  new egt(new egv(dae.sS, 0.3F), egc.b, dae.tc.o()),
                  new egt(new egv(dae.of, 0.05F), egc.b, dae.a.o())
               )
            ),
            new egu(aun.bI)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new egi($$1.b(aun.bO), 0.95F),
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.sW, 0.3F), egc.b, dae.tb.o()),
                  new egt(new egv(dae.sS, 0.3F), egc.b, dae.tc.o()),
                  new egt(new egv(dae.of, 0.05F), egc.b, dae.a.o())
               )
            ),
            new egu(aun.bI)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new egi($$1.b(aun.bO), 0.95F),
            new egx(
               ImmutableList.of(
                  new egt(new egv(dae.sW, 0.3F), egc.b, dae.tb.o()),
                  new egt(new egv(dae.sS, 0.3F), egc.b, dae.tc.o()),
                  new egt(new egv(dae.sU, 0.3F), egc.b, dae.a.o()),
                  new egt(new egv(dae.of, 0.05F), egc.b, dae.a.o())
               )
            ),
            new egu(aun.bI)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new egx(
               List.of(
                  new egt(new egv(dae.L, 0.2F), egc.b, dae.j.o()),
                  new egt(new egv(dae.L, 0.1F), egc.b, dae.k.o()),
                  new egt(new egv(dae.eM, 0.1F), egc.b, dae.eL.o())
               )
            ),
            a(eku.aR, 6),
            a(eku.aS, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new egx(
               List.of(
                  new egt(new egv(dae.L, 0.2F), egc.b, dae.j.o()),
                  new egt(new egv(dae.L, 0.1F), egc.b, dae.k.o()),
                  new egt(new egv(dae.eM, 0.1F), egc.b, dae.eL.o())
               )
            ),
            a(eku.aR, 2)
         )
      );
      a($$0, L, List.of(a(eku.aR, 2)));
   }

   private static egk a(ajh $$0, int $$1) {
      return new egk(new egx(List.of(new egt(new ehg(aun.cn), egc.b, egq.b, dae.M.o(), new ehi($$0)))), bmf.a($$1));
   }
}
