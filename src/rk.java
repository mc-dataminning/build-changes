import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ald<emg> M = a("empty");
   public static final ald<emg> a = a("zombie_plains");
   public static final ald<emg> b = a("zombie_savanna");
   public static final ald<emg> c = a("zombie_snowy");
   public static final ald<emg> d = a("zombie_taiga");
   public static final ald<emg> e = a("zombie_desert");
   public static final ald<emg> f = a("mossify_10_percent");
   public static final ald<emg> g = a("mossify_20_percent");
   public static final ald<emg> h = a("mossify_70_percent");
   public static final ald<emg> i = a("street_plains");
   public static final ald<emg> j = a("street_savanna");
   public static final ald<emg> k = a("street_snowy_or_taiga");
   public static final ald<emg> l = a("farm_plains");
   public static final ald<emg> m = a("farm_savanna");
   public static final ald<emg> n = a("farm_snowy");
   public static final ald<emg> o = a("farm_taiga");
   public static final ald<emg> p = a("farm_desert");
   public static final ald<emg> q = a("outpost_rot");
   public static final ald<emg> r = a("bottom_rampart");
   public static final ald<emg> s = a("treasure_rooms");
   public static final ald<emg> t = a("housing");
   public static final ald<emg> u = a("side_wall_degradation");
   public static final ald<emg> v = a("stable_degradation");
   public static final ald<emg> w = a("bastion_generic_degradation");
   public static final ald<emg> x = a("rampart_degradation");
   public static final ald<emg> y = a("entrance_replacement");
   public static final ald<emg> z = a("bridge");
   public static final ald<emg> A = a("roof");
   public static final ald<emg> B = a("high_wall");
   public static final ald<emg> C = a("high_rampart");
   public static final ald<emg> D = a("fossil_rot");
   public static final ald<emg> E = a("fossil_coal");
   public static final ald<emg> F = a("fossil_diamonds");
   public static final ald<emg> G = a("ancient_city_start_degradation");
   public static final ald<emg> H = a("ancient_city_generic_degradation");
   public static final ald<emg> I = a("ancient_city_walls_degradation");
   public static final ald<emg> J = a("trail_ruins_houses_archaeology");
   public static final ald<emg> K = a("trail_ruins_roads_archaeology");
   public static final ald<emg> L = a("trail_ruins_tower_top_archaeology");

   private static ald<emg> a(String $$0) {
      return ald.a(lq.aK, new ale($$0));
   }

   private static void a(rc<emg> $$0, ald<emg> $$1, List<emf> $$2) {
      $$0.a($$1, new emg($$2));
   }

   public static void a(rc<emg> $$0) {
      jj<dex> $$1 = $$0.a(lq.f);
      elx $$2 = new elx(new elz(dez.pr, 0.01F), elg.b, dez.pC.o());
      elx $$3 = new elx(new elz(dez.pC, 0.5F), elg.b, dez.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.m, 0.8F), elg.b, dez.cn.o()),
                  new elx(new emk(awo.p), elg.b, dez.a.o()),
                  new elx(new ell(dez.cp), elg.b, dez.a.o()),
                  new elx(new ell(dez.cq), elg.b, dez.a.o()),
                  new elx(new elz(dez.m, 0.07F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.cn, 0.07F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.hj, 0.07F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.U, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.n, 0.1F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.cu, 0.1F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.al, 0.02F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.eY, 0.5F), elg.b, dez.bs.o()),
                  new elx[]{
                     new elx(
                        new eln(dez.eY.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))),
                        elg.b,
                        dez.hL.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))
                     ),
                     new elx(
                        new eln(dez.eY.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))),
                        elg.b,
                        dez.hL.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))
                     ),
                     new elx(new elz(dez.cB, 0.3F), elg.b, dez.gt.o()),
                     new elx(new elz(dez.cB, 0.2F), elg.b, dez.gu.o()),
                     new elx(new elz(dez.cB, 0.1F), elg.b, dez.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new emk(awo.p), elg.b, dez.a.o()),
                  new elx(new ell(dez.cp), elg.b, dez.a.o()),
                  new elx(new ell(dez.cq), elg.b, dez.a.o()),
                  new elx(new elz(dez.r, 0.2F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.hP, 0.2F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.Y, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.as, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.hk, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.hn, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.hx, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.eY, 0.5F), elg.b, dez.bs.o()),
                  new elx(
                     new eln(dez.eY.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))),
                     elg.b,
                     dez.hL.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))
                  ),
                  new elx[]{
                     new elx(
                        new eln(dez.eY.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))),
                        elg.b,
                        dez.hL.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))
                     ),
                     new elx(new elz(dez.cB, 0.1F), elg.b, dez.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new emk(awo.p), elg.b, dez.a.o()),
                  new elx(new ell(dez.cp), elg.b, dez.a.o()),
                  new elx(new ell(dez.cq), elg.b, dez.a.o()),
                  new elx(new ell(dez.oe), elg.b, dez.a.o()),
                  new elx(new elz(dez.o, 0.2F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.ju, 0.4F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.af, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.ax, 0.05F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.eY, 0.5F), elg.b, dez.bs.o()),
                  new elx(
                     new eln(dez.eY.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))),
                     elg.b,
                     dez.hL.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))
                  ),
                  new elx(
                     new eln(dez.eY.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))),
                     elg.b,
                     dez.hL.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))
                  ),
                  new elx(new elz(dez.cB, 0.1F), elg.b, dez.gt.o()),
                  new elx[]{new elx(new elz(dez.cB, 0.8F), elg.b, dez.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.m, 0.8F), elg.b, dez.cn.o()),
                  new elx(new emk(awo.p), elg.b, dez.a.o()),
                  new elx(new ell(dez.cp), elg.b, dez.a.o()),
                  new elx(new ell(dez.cq), elg.b, dez.a.o()),
                  new elx(new ell(dez.og), elg.b, dez.og.o().a(dfl.c, Boolean.valueOf(false))),
                  new elx(new elz(dez.m, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.V, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.eY, 0.5F), elg.b, dez.bs.o()),
                  new elx(
                     new eln(dez.eY.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))),
                     elg.b,
                     dez.hL.o().a(diy.a, Boolean.valueOf(true)).a(diy.c, Boolean.valueOf(true))
                  ),
                  new elx(
                     new eln(dez.eY.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))),
                     elg.b,
                     dez.hL.o().a(diy.b, Boolean.valueOf(true)).a(diy.d, Boolean.valueOf(true))
                  ),
                  new elx(new elz(dez.cB, 0.3F), elg.b, dez.fd.o()),
                  new elx(new elz(dez.cB, 0.2F), elg.b, dez.gu.o()),
                  new elx[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new emk(awo.p), elg.b, dez.a.o()),
                  new elx(new ell(dez.cp), elg.b, dez.a.o()),
                  new elx(new ell(dez.cq), elg.b, dez.a.o()),
                  new elx(new elz(dez.jS, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.aX, 0.1F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.iA, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.nl, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.ny, 0.08F), elg.b, dez.bs.o()),
                  new elx(new elz(dez.cB, 0.2F), elg.b, dez.kD.o()),
                  new elx(new elz(dez.cB, 0.1F), elg.b, dez.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.m, 0.1F), elg.b, dez.cn.o())))));
      a($$0, g, ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.m, 0.2F), elg.b, dez.cn.o())))));
      a($$0, h, ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.m, 0.7F), elg.b, dez.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new ell(dez.kE), new ell(dez.G), dez.n.o()),
                  new elx(new elz(dez.kE, 0.1F), elg.b, dez.i.o()),
                  new elx(new ell(dez.i), new ell(dez.G), dez.G.o()),
                  new elx(new ell(dez.j), new ell(dez.G), dez.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new ell(dez.kE), new ell(dez.G), dez.r.o()),
                  new elx(new elz(dez.kE, 0.2F), elg.b, dez.i.o()),
                  new elx(new ell(dez.i), new ell(dez.G), dez.G.o()),
                  new elx(new ell(dez.j), new ell(dez.G), dez.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new ell(dez.kE), new ell(dez.G), dez.o.o()),
                  new elx(new ell(dez.kE), new ell(dez.dO), dez.o.o()),
                  new elx(new elz(dez.kE, 0.2F), elg.b, dez.i.o()),
                  new elx(new ell(dez.i), new ell(dez.G), dez.G.o()),
                  new elx(new ell(dez.j), new ell(dez.G), dez.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.cB, 0.3F), elg.b, dez.gt.o()),
                  new elx(new elz(dez.cB, 0.2F), elg.b, dez.gu.o()),
                  new elx(new elz(dez.cB, 0.1F), elg.b, dez.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.cB, 0.1F), elg.b, dez.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.cB, 0.1F), elg.b, dez.gt.o()), new elx(new elz(dez.cB, 0.8F), elg.b, dez.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.cB, 0.3F), elg.b, dez.fd.o()), new elx(new elz(dez.cB, 0.2F), elg.b, dez.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.cB, 0.2F), elg.b, dez.kD.o()), new elx(new elz(dez.cB, 0.1F), elg.b, dez.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new elm(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emb(ImmutableList.of(new elx(new elz(dez.kJ, 0.75F), elg.b, dez.px.o()), new elx(new elz(dez.px, 0.15F), elg.b, dez.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emb(ImmutableList.of(new elx(new elz(dez.pw, 0.35F), elg.b, dez.px.o()), new elx(new elz(dez.py, 0.1F), elg.b, dez.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emb(ImmutableList.of(new elx(new elz(dez.pw, 0.3F), elg.b, dez.px.o()), new elx(new elz(dez.pr, 1.0E-4F), elg.b, dez.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emb(ImmutableList.of(new elx(new elz(dez.py, 0.5F), elg.b, dez.a.o()), new elx(new elz(dez.ch, 0.1F), elg.b, dez.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emb(ImmutableList.of(new elx(new elz(dez.pw, 0.1F), elg.b, dez.px.o()), new elx(new elz(dez.pr, 1.0E-4F), elg.b, dez.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.pw, 0.3F), elg.b, dez.px.o()),
                  new elx(new elz(dez.pr, 1.0E-4F), elg.b, dez.a.o()),
                  new elx(new elz(dez.ch, 0.3F), elg.b, dez.px.o()),
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
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.pw, 0.4F), elg.b, dez.px.o()),
                  new elx(new elz(dez.pr, 0.01F), elg.b, dez.px.o()),
                  new elx(new elz(dez.pw, 1.0E-4F), elg.b, dez.a.o()),
                  new elx(new elz(dez.pr, 1.0E-4F), elg.b, dez.a.o()),
                  new elx(new elz(dez.ch, 0.3F), elg.b, dez.px.o()),
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
            new emb(ImmutableList.of(new elx(new elz(dez.py, 0.5F), elg.b, dez.a.o()), new elx(new elz(dez.ch, 0.6F), elg.b, dez.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emb(ImmutableList.of(new elx(new elz(dez.pw, 0.3F), elg.b, dez.px.o()), new elx(new elz(dez.pr, 1.0E-4F), elg.b, dez.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.pw, 0.3F), elg.b, dez.px.o()),
                  new elx(new elz(dez.pw, 0.15F), elg.b, dez.a.o()),
                  new elx(new elz(dez.pw, 0.3F), elg.b, dez.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.pw, 0.01F), elg.b, dez.a.o()),
                  new elx(new elz(dez.pw, 0.5F), elg.b, dez.px.o()),
                  new elx(new elz(dez.pw, 0.3F), elg.b, dez.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emb(
               ImmutableList.of(new elx(new elz(dez.ch, 0.3F), elg.b, dez.px.o()), new elx(elg.b, elg.b, new elh(0.0F, 0.05F, 0, 100, je.a.b), dez.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elm(0.9F), new ely(awo.bO)));
      a($$0, E, ImmutableList.of(new elm(0.1F), new ely(awo.bO)));
      a($$0, F, ImmutableList.of(new elm(0.1F), new emb(ImmutableList.of(new elx(new ell(dez.R), elg.b, dez.cy.o()))), new ely(awo.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.sW, 0.3F), elg.b, dez.tb.o()),
                  new elx(new elz(dez.sS, 0.3F), elg.b, dez.tc.o()),
                  new elx(new elz(dez.of, 0.05F), elg.b, dez.a.o())
               )
            ),
            new ely(awo.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elm($$1.b(awo.bU), 0.95F),
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.sW, 0.3F), elg.b, dez.tb.o()),
                  new elx(new elz(dez.sS, 0.3F), elg.b, dez.tc.o()),
                  new elx(new elz(dez.of, 0.05F), elg.b, dez.a.o())
               )
            ),
            new ely(awo.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elm($$1.b(awo.bU), 0.95F),
            new emb(
               ImmutableList.of(
                  new elx(new elz(dez.sW, 0.3F), elg.b, dez.tb.o()),
                  new elx(new elz(dez.sS, 0.3F), elg.b, dez.tc.o()),
                  new elx(new elz(dez.sU, 0.3F), elg.b, dez.a.o()),
                  new elx(new elz(dez.of, 0.05F), elg.b, dez.a.o())
               )
            ),
            new ely(awo.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emb(
               List.of(
                  new elx(new elz(dez.L, 0.2F), elg.b, dez.j.o()),
                  new elx(new elz(dez.L, 0.1F), elg.b, dez.k.o()),
                  new elx(new elz(dez.eM, 0.1F), elg.b, dez.eL.o())
               )
            ),
            a(eqc.bf, 6),
            a(eqc.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emb(
               List.of(
                  new elx(new elz(dez.L, 0.2F), elg.b, dez.j.o()),
                  new elx(new elz(dez.L, 0.1F), elg.b, dez.k.o()),
                  new elx(new elz(dez.eM, 0.1F), elg.b, dez.eL.o())
               )
            ),
            a(eqc.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqc.bf, 2)));
   }

   private static elo a(ald<eql> $$0, int $$1) {
      return new elo(new emb(List.of(new elx(new emk(awo.ct), elg.b, elu.b, dez.M.o(), new emm($$0)))), bpu.a($$1));
   }
}
