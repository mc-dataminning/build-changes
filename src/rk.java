import com.google.common.collect.ImmutableList;
import java.util.List;

public class rk {
   private static final ale<emi> M = a("empty");
   public static final ale<emi> a = a("zombie_plains");
   public static final ale<emi> b = a("zombie_savanna");
   public static final ale<emi> c = a("zombie_snowy");
   public static final ale<emi> d = a("zombie_taiga");
   public static final ale<emi> e = a("zombie_desert");
   public static final ale<emi> f = a("mossify_10_percent");
   public static final ale<emi> g = a("mossify_20_percent");
   public static final ale<emi> h = a("mossify_70_percent");
   public static final ale<emi> i = a("street_plains");
   public static final ale<emi> j = a("street_savanna");
   public static final ale<emi> k = a("street_snowy_or_taiga");
   public static final ale<emi> l = a("farm_plains");
   public static final ale<emi> m = a("farm_savanna");
   public static final ale<emi> n = a("farm_snowy");
   public static final ale<emi> o = a("farm_taiga");
   public static final ale<emi> p = a("farm_desert");
   public static final ale<emi> q = a("outpost_rot");
   public static final ale<emi> r = a("bottom_rampart");
   public static final ale<emi> s = a("treasure_rooms");
   public static final ale<emi> t = a("housing");
   public static final ale<emi> u = a("side_wall_degradation");
   public static final ale<emi> v = a("stable_degradation");
   public static final ale<emi> w = a("bastion_generic_degradation");
   public static final ale<emi> x = a("rampart_degradation");
   public static final ale<emi> y = a("entrance_replacement");
   public static final ale<emi> z = a("bridge");
   public static final ale<emi> A = a("roof");
   public static final ale<emi> B = a("high_wall");
   public static final ale<emi> C = a("high_rampart");
   public static final ale<emi> D = a("fossil_rot");
   public static final ale<emi> E = a("fossil_coal");
   public static final ale<emi> F = a("fossil_diamonds");
   public static final ale<emi> G = a("ancient_city_start_degradation");
   public static final ale<emi> H = a("ancient_city_generic_degradation");
   public static final ale<emi> I = a("ancient_city_walls_degradation");
   public static final ale<emi> J = a("trail_ruins_houses_archaeology");
   public static final ale<emi> K = a("trail_ruins_roads_archaeology");
   public static final ale<emi> L = a("trail_ruins_tower_top_archaeology");

   private static ale<emi> a(String $$0) {
      return ale.a(lq.aK, new alf($$0));
   }

   private static void a(rc<emi> $$0, ale<emi> $$1, List<emh> $$2) {
      $$0.a($$1, new emi($$2));
   }

   public static void a(rc<emi> $$0) {
      jj<dez> $$1 = $$0.a(lq.f);
      elz $$2 = new elz(new emb(dfb.pr, 0.01F), eli.b, dfb.pC.o());
      elz $$3 = new elz(new emb(dfb.pC, 0.5F), eli.b, dfb.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.m, 0.8F), eli.b, dfb.cn.o()),
                  new elz(new emm(awp.p), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cp), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cq), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.m, 0.07F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.cn, 0.07F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.hj, 0.07F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.U, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.n, 0.1F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.cu, 0.1F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.al, 0.02F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.eY, 0.5F), eli.b, dfb.bs.o()),
                  new elz[]{
                     new elz(
                        new elp(dfb.eY.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))),
                        eli.b,
                        dfb.hL.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))
                     ),
                     new elz(
                        new elp(dfb.eY.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))),
                        eli.b,
                        dfb.hL.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))
                     ),
                     new elz(new emb(dfb.cB, 0.3F), eli.b, dfb.gt.o()),
                     new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.gu.o()),
                     new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emm(awp.p), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cp), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cq), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.r, 0.2F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.hP, 0.2F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.Y, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.as, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.hk, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.hn, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.hx, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.eY, 0.5F), eli.b, dfb.bs.o()),
                  new elz(
                     new elp(dfb.eY.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))),
                     eli.b,
                     dfb.hL.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))
                  ),
                  new elz[]{
                     new elz(
                        new elp(dfb.eY.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))),
                        eli.b,
                        dfb.hL.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))
                     ),
                     new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emm(awp.p), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cp), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cq), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.oe), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.o, 0.2F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.ju, 0.4F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.af, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.ax, 0.05F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.eY, 0.5F), eli.b, dfb.bs.o()),
                  new elz(
                     new elp(dfb.eY.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))),
                     eli.b,
                     dfb.hL.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))
                  ),
                  new elz(
                     new elp(dfb.eY.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))),
                     eli.b,
                     dfb.hL.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))
                  ),
                  new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.gt.o()),
                  new elz[]{new elz(new emb(dfb.cB, 0.8F), eli.b, dfb.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.m, 0.8F), eli.b, dfb.cn.o()),
                  new elz(new emm(awp.p), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cp), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cq), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.og), eli.b, dfb.og.o().a(dfn.c, Boolean.valueOf(false))),
                  new elz(new emb(dfb.m, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.V, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.eY, 0.5F), eli.b, dfb.bs.o()),
                  new elz(
                     new elp(dfb.eY.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))),
                     eli.b,
                     dfb.hL.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true))
                  ),
                  new elz(
                     new elp(dfb.eY.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))),
                     eli.b,
                     dfb.hL.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true))
                  ),
                  new elz(new emb(dfb.cB, 0.3F), eli.b, dfb.fd.o()),
                  new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.gu.o()),
                  new elz[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emm(awp.p), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cp), eli.b, dfb.a.o()),
                  new elz(new eln(dfb.cq), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.jS, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.aX, 0.1F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.iA, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.nl, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.ny, 0.08F), eli.b, dfb.bs.o()),
                  new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.kD.o()),
                  new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.m, 0.1F), eli.b, dfb.cn.o())))));
      a($$0, g, ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.m, 0.2F), eli.b, dfb.cn.o())))));
      a($$0, h, ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.m, 0.7F), eli.b, dfb.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new eln(dfb.kE), new eln(dfb.G), dfb.n.o()),
                  new elz(new emb(dfb.kE, 0.1F), eli.b, dfb.i.o()),
                  new elz(new eln(dfb.i), new eln(dfb.G), dfb.G.o()),
                  new elz(new eln(dfb.j), new eln(dfb.G), dfb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new eln(dfb.kE), new eln(dfb.G), dfb.r.o()),
                  new elz(new emb(dfb.kE, 0.2F), eli.b, dfb.i.o()),
                  new elz(new eln(dfb.i), new eln(dfb.G), dfb.G.o()),
                  new elz(new eln(dfb.j), new eln(dfb.G), dfb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new eln(dfb.kE), new eln(dfb.G), dfb.o.o()),
                  new elz(new eln(dfb.kE), new eln(dfb.dO), dfb.o.o()),
                  new elz(new emb(dfb.kE, 0.2F), eli.b, dfb.i.o()),
                  new elz(new eln(dfb.i), new eln(dfb.G), dfb.G.o()),
                  new elz(new eln(dfb.j), new eln(dfb.G), dfb.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.cB, 0.3F), eli.b, dfb.gt.o()),
                  new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.gu.o()),
                  new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.gt.o()), new elz(new emb(dfb.cB, 0.8F), eli.b, dfb.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.cB, 0.3F), eli.b, dfb.fd.o()), new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.cB, 0.2F), eli.b, dfb.kD.o()), new elz(new emb(dfb.cB, 0.1F), eli.b, dfb.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new elo(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emd(ImmutableList.of(new elz(new emb(dfb.kJ, 0.75F), eli.b, dfb.px.o()), new elz(new emb(dfb.px, 0.15F), eli.b, dfb.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emd(ImmutableList.of(new elz(new emb(dfb.pw, 0.35F), eli.b, dfb.px.o()), new elz(new emb(dfb.py, 0.1F), eli.b, dfb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emd(ImmutableList.of(new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.px.o()), new elz(new emb(dfb.pr, 1.0E-4F), eli.b, dfb.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emd(ImmutableList.of(new elz(new emb(dfb.py, 0.5F), eli.b, dfb.a.o()), new elz(new emb(dfb.ch, 0.1F), eli.b, dfb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emd(ImmutableList.of(new elz(new emb(dfb.pw, 0.1F), eli.b, dfb.px.o()), new elz(new emb(dfb.pr, 1.0E-4F), eli.b, dfb.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.px.o()),
                  new elz(new emb(dfb.pr, 1.0E-4F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.ch, 0.3F), eli.b, dfb.px.o()),
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
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.pw, 0.4F), eli.b, dfb.px.o()),
                  new elz(new emb(dfb.pr, 0.01F), eli.b, dfb.px.o()),
                  new elz(new emb(dfb.pw, 1.0E-4F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.pr, 1.0E-4F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.ch, 0.3F), eli.b, dfb.px.o()),
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
            new emd(ImmutableList.of(new elz(new emb(dfb.py, 0.5F), eli.b, dfb.a.o()), new elz(new emb(dfb.ch, 0.6F), eli.b, dfb.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emd(ImmutableList.of(new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.px.o()), new elz(new emb(dfb.pr, 1.0E-4F), eli.b, dfb.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.px.o()),
                  new elz(new emb(dfb.pw, 0.15F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.pw, 0.01F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.pw, 0.5F), eli.b, dfb.px.o()),
                  new elz(new emb(dfb.pw, 0.3F), eli.b, dfb.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emd(
               ImmutableList.of(new elz(new emb(dfb.ch, 0.3F), eli.b, dfb.px.o()), new elz(eli.b, eli.b, new elj(0.0F, 0.05F, 0, 100, je.a.b), dfb.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new elo(0.9F), new ema(awp.bO)));
      a($$0, E, ImmutableList.of(new elo(0.1F), new ema(awp.bO)));
      a($$0, F, ImmutableList.of(new elo(0.1F), new emd(ImmutableList.of(new elz(new eln(dfb.R), eli.b, dfb.cy.o()))), new ema(awp.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.sW, 0.3F), eli.b, dfb.tb.o()),
                  new elz(new emb(dfb.sS, 0.3F), eli.b, dfb.tc.o()),
                  new elz(new emb(dfb.of, 0.05F), eli.b, dfb.a.o())
               )
            ),
            new ema(awp.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new elo($$1.b(awp.bU), 0.95F),
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.sW, 0.3F), eli.b, dfb.tb.o()),
                  new elz(new emb(dfb.sS, 0.3F), eli.b, dfb.tc.o()),
                  new elz(new emb(dfb.of, 0.05F), eli.b, dfb.a.o())
               )
            ),
            new ema(awp.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new elo($$1.b(awp.bU), 0.95F),
            new emd(
               ImmutableList.of(
                  new elz(new emb(dfb.sW, 0.3F), eli.b, dfb.tb.o()),
                  new elz(new emb(dfb.sS, 0.3F), eli.b, dfb.tc.o()),
                  new elz(new emb(dfb.sU, 0.3F), eli.b, dfb.a.o()),
                  new elz(new emb(dfb.of, 0.05F), eli.b, dfb.a.o())
               )
            ),
            new ema(awp.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emd(
               List.of(
                  new elz(new emb(dfb.L, 0.2F), eli.b, dfb.j.o()),
                  new elz(new emb(dfb.L, 0.1F), eli.b, dfb.k.o()),
                  new elz(new emb(dfb.eM, 0.1F), eli.b, dfb.eL.o())
               )
            ),
            a(eqe.bf, 6),
            a(eqe.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emd(
               List.of(
                  new elz(new emb(dfb.L, 0.2F), eli.b, dfb.j.o()),
                  new elz(new emb(dfb.L, 0.1F), eli.b, dfb.k.o()),
                  new elz(new emb(dfb.eM, 0.1F), eli.b, dfb.eL.o())
               )
            ),
            a(eqe.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqe.bf, 2)));
   }

   private static elq a(ale<eqn> $$0, int $$1) {
      return new elq(new emd(List.of(new elz(new emm(awp.ct), eli.b, elw.b, dfb.M.o(), new emo($$0)))), bpw.a($$1));
   }
}
