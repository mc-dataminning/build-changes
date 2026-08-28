import com.google.common.collect.ImmutableList;
import java.util.List;

public class qu {
   private static final akj<emw> N = a("empty");
   public static final akj<emw> a = a("zombie_plains");
   public static final akj<emw> b = a("zombie_savanna");
   public static final akj<emw> c = a("zombie_snowy");
   public static final akj<emw> d = a("zombie_taiga");
   public static final akj<emw> e = a("zombie_desert");
   public static final akj<emw> f = a("mossify_10_percent");
   public static final akj<emw> g = a("mossify_20_percent");
   public static final akj<emw> h = a("mossify_70_percent");
   public static final akj<emw> i = a("street_plains");
   public static final akj<emw> j = a("street_savanna");
   public static final akj<emw> k = a("street_snowy_or_taiga");
   public static final akj<emw> l = a("farm_plains");
   public static final akj<emw> m = a("farm_savanna");
   public static final akj<emw> n = a("farm_snowy");
   public static final akj<emw> o = a("farm_taiga");
   public static final akj<emw> p = a("farm_desert");
   public static final akj<emw> q = a("outpost_rot");
   public static final akj<emw> r = a("bottom_rampart");
   public static final akj<emw> s = a("treasure_rooms");
   public static final akj<emw> t = a("housing");
   public static final akj<emw> u = a("side_wall_degradation");
   public static final akj<emw> v = a("stable_degradation");
   public static final akj<emw> w = a("bastion_generic_degradation");
   public static final akj<emw> x = a("rampart_degradation");
   public static final akj<emw> y = a("entrance_replacement");
   public static final akj<emw> z = a("bridge");
   public static final akj<emw> A = a("roof");
   public static final akj<emw> B = a("high_wall");
   public static final akj<emw> C = a("high_rampart");
   public static final akj<emw> D = a("fossil_rot");
   public static final akj<emw> E = a("fossil_coal");
   public static final akj<emw> F = a("fossil_diamonds");
   public static final akj<emw> G = a("ancient_city_start_degradation");
   public static final akj<emw> H = a("ancient_city_generic_degradation");
   public static final akj<emw> I = a("ancient_city_walls_degradation");
   public static final akj<emw> J = a("trail_ruins_houses_archaeology");
   public static final akj<emw> K = a("trail_ruins_roads_archaeology");
   public static final akj<emw> L = a("trail_ruins_tower_top_archaeology");
   public static final akj<emw> M = a("trial_chambers_copper_bulb_degradation");

   private static akj<emw> a(String $$0) {
      return akj.a(lr.aR, new akk($$0));
   }

   private static void a(qm<emw> $$0, akj<emw> $$1, List<emv> $$2) {
      $$0.a($$1, new emw($$2));
   }

   public static void a(qm<emw> $$0) {
      jk<dfi> $$1 = $$0.a(lr.f);
      emn $$2 = new emn(new emp(dfk.pr, 0.01F), elw.b, dfk.pC.o());
      emn $$3 = new emn(new emp(dfk.pC, 0.5F), elw.b, dfk.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.m, 0.8F), elw.b, dfk.cn.o()),
                  new emn(new ena(avw.p), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cp), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cq), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.m, 0.07F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.cn, 0.07F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.hj, 0.07F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.U, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.n, 0.1F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.cu, 0.1F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.al, 0.02F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.eY, 0.5F), elw.b, dfk.bs.o()),
                  new emn[]{
                     new emn(
                        new emd(dfk.eY.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))),
                        elw.b,
                        dfk.hL.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))
                     ),
                     new emn(
                        new emd(dfk.eY.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))),
                        elw.b,
                        dfk.hL.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))
                     ),
                     new emn(new emp(dfk.cB, 0.3F), elw.b, dfk.gt.o()),
                     new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.gu.o()),
                     new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new ena(avw.p), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cp), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cq), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.r, 0.2F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.hP, 0.2F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.Y, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.as, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.hk, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.hn, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.hx, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.eY, 0.5F), elw.b, dfk.bs.o()),
                  new emn(
                     new emd(dfk.eY.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))),
                     elw.b,
                     dfk.hL.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))
                  ),
                  new emn[]{
                     new emn(
                        new emd(dfk.eY.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))),
                        elw.b,
                        dfk.hL.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))
                     ),
                     new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new ena(avw.p), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cp), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cq), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.oe), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.o, 0.2F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.ju, 0.4F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.af, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.ax, 0.05F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.eY, 0.5F), elw.b, dfk.bs.o()),
                  new emn(
                     new emd(dfk.eY.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))),
                     elw.b,
                     dfk.hL.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))
                  ),
                  new emn(
                     new emd(dfk.eY.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))),
                     elw.b,
                     dfk.hL.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))
                  ),
                  new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.gt.o()),
                  new emn[]{new emn(new emp(dfk.cB, 0.8F), elw.b, dfk.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.m, 0.8F), elw.b, dfk.cn.o()),
                  new emn(new ena(avw.p), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cp), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cq), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.og), elw.b, dfk.og.o().a(dfw.c, Boolean.valueOf(false))),
                  new emn(new emp(dfk.m, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.V, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.eY, 0.5F), elw.b, dfk.bs.o()),
                  new emn(
                     new emd(dfk.eY.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))),
                     elw.b,
                     dfk.hL.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true))
                  ),
                  new emn(
                     new emd(dfk.eY.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))),
                     elw.b,
                     dfk.hL.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true))
                  ),
                  new emn(new emp(dfk.cB, 0.3F), elw.b, dfk.fd.o()),
                  new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.gu.o()),
                  new emn[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new ena(avw.p), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cp), elw.b, dfk.a.o()),
                  new emn(new emb(dfk.cq), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.jS, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.aX, 0.1F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.iA, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.nl, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.ny, 0.08F), elw.b, dfk.bs.o()),
                  new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.kD.o()),
                  new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.m, 0.1F), elw.b, dfk.cn.o())))));
      a($$0, g, ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.m, 0.2F), elw.b, dfk.cn.o())))));
      a($$0, h, ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.m, 0.7F), elw.b, dfk.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emb(dfk.kE), new emb(dfk.G), dfk.n.o()),
                  new emn(new emp(dfk.kE, 0.1F), elw.b, dfk.i.o()),
                  new emn(new emb(dfk.i), new emb(dfk.G), dfk.G.o()),
                  new emn(new emb(dfk.j), new emb(dfk.G), dfk.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emb(dfk.kE), new emb(dfk.G), dfk.r.o()),
                  new emn(new emp(dfk.kE, 0.2F), elw.b, dfk.i.o()),
                  new emn(new emb(dfk.i), new emb(dfk.G), dfk.G.o()),
                  new emn(new emb(dfk.j), new emb(dfk.G), dfk.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emb(dfk.kE), new emb(dfk.G), dfk.o.o()),
                  new emn(new emb(dfk.kE), new emb(dfk.dO), dfk.o.o()),
                  new emn(new emp(dfk.kE, 0.2F), elw.b, dfk.i.o()),
                  new emn(new emb(dfk.i), new emb(dfk.G), dfk.G.o()),
                  new emn(new emb(dfk.j), new emb(dfk.G), dfk.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.cB, 0.3F), elw.b, dfk.gt.o()),
                  new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.gu.o()),
                  new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.gt.o()), new emn(new emp(dfk.cB, 0.8F), elw.b, dfk.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.cB, 0.3F), elw.b, dfk.fd.o()), new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.cB, 0.2F), elw.b, dfk.kD.o()), new emn(new emp(dfk.cB, 0.1F), elw.b, dfk.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new emc(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new emr(ImmutableList.of(new emn(new emp(dfk.kJ, 0.75F), elw.b, dfk.px.o()), new emn(new emp(dfk.px, 0.15F), elw.b, dfk.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new emr(ImmutableList.of(new emn(new emp(dfk.pw, 0.35F), elw.b, dfk.px.o()), new emn(new emp(dfk.py, 0.1F), elw.b, dfk.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new emr(ImmutableList.of(new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.px.o()), new emn(new emp(dfk.pr, 1.0E-4F), elw.b, dfk.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new emr(ImmutableList.of(new emn(new emp(dfk.py, 0.5F), elw.b, dfk.a.o()), new emn(new emp(dfk.ch, 0.1F), elw.b, dfk.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new emr(ImmutableList.of(new emn(new emp(dfk.pw, 0.1F), elw.b, dfk.px.o()), new emn(new emp(dfk.pr, 1.0E-4F), elw.b, dfk.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.px.o()),
                  new emn(new emp(dfk.pr, 1.0E-4F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.ch, 0.3F), elw.b, dfk.px.o()),
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
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.pw, 0.4F), elw.b, dfk.px.o()),
                  new emn(new emp(dfk.pr, 0.01F), elw.b, dfk.px.o()),
                  new emn(new emp(dfk.pw, 1.0E-4F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.pr, 1.0E-4F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.ch, 0.3F), elw.b, dfk.px.o()),
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
            new emr(ImmutableList.of(new emn(new emp(dfk.py, 0.5F), elw.b, dfk.a.o()), new emn(new emp(dfk.ch, 0.6F), elw.b, dfk.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new emr(ImmutableList.of(new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.px.o()), new emn(new emp(dfk.pr, 1.0E-4F), elw.b, dfk.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.px.o()),
                  new emn(new emp(dfk.pw, 0.15F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.pw, 0.01F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.pw, 0.5F), elw.b, dfk.px.o()),
                  new emn(new emp(dfk.pw, 0.3F), elw.b, dfk.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new emr(
               ImmutableList.of(new emn(new emp(dfk.ch, 0.3F), elw.b, dfk.px.o()), new emn(elw.b, elw.b, new elx(0.0F, 0.05F, 0, 100, jf.a.b), dfk.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new emc(0.9F), new emo(avw.bO)));
      a($$0, E, ImmutableList.of(new emc(0.1F), new emo(avw.bO)));
      a($$0, F, ImmutableList.of(new emc(0.1F), new emr(ImmutableList.of(new emn(new emb(dfk.R), elw.b, dfk.cy.o()))), new emo(avw.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.sW, 0.3F), elw.b, dfk.tb.o()),
                  new emn(new emp(dfk.sS, 0.3F), elw.b, dfk.tc.o()),
                  new emn(new emp(dfk.of, 0.05F), elw.b, dfk.a.o())
               )
            ),
            new emo(avw.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new emc($$1.b(avw.bU), 0.95F),
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.sW, 0.3F), elw.b, dfk.tb.o()),
                  new emn(new emp(dfk.sS, 0.3F), elw.b, dfk.tc.o()),
                  new emn(new emp(dfk.of, 0.05F), elw.b, dfk.a.o())
               )
            ),
            new emo(avw.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new emc($$1.b(avw.bU), 0.95F),
            new emr(
               ImmutableList.of(
                  new emn(new emp(dfk.sW, 0.3F), elw.b, dfk.tb.o()),
                  new emn(new emp(dfk.sS, 0.3F), elw.b, dfk.tc.o()),
                  new emn(new emp(dfk.sU, 0.3F), elw.b, dfk.a.o()),
                  new emn(new emp(dfk.of, 0.05F), elw.b, dfk.a.o())
               )
            ),
            new emo(avw.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new emr(
               List.of(
                  new emn(new emp(dfk.L, 0.2F), elw.b, dfk.j.o()),
                  new emn(new emp(dfk.L, 0.1F), elw.b, dfk.k.o()),
                  new emn(new emp(dfk.eM, 0.1F), elw.b, dfk.eL.o())
               )
            ),
            a(eqs.bf, 6),
            a(eqs.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new emr(
               List.of(
                  new emn(new emp(dfk.L, 0.2F), elw.b, dfk.j.o()),
                  new emn(new emp(dfk.L, 0.1F), elw.b, dfk.k.o()),
                  new emn(new emp(dfk.eM, 0.1F), elw.b, dfk.eL.o())
               )
            ),
            a(eqs.bf, 2)
         )
      );
      a($$0, L, List.of(a(eqs.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new emr(
               List.of(
                  new emn(new emp(dfk.so, 0.1F), elw.b, dfk.sr.o().a(dgw.c, Boolean.valueOf(true))),
                  new emn(new emp(dfk.so, 0.33333334F), elw.b, dfk.sq.o().a(dgw.c, Boolean.valueOf(true))),
                  new emn(new emp(dfk.so, 0.5F), elw.b, dfk.sp.o().a(dgw.c, Boolean.valueOf(true)))
               )
            ),
            new emo(avw.bO)
         )
      );
   }

   private static eme a(akj<erb> $$0, int $$1) {
      return new eme(new emr(List.of(new emn(new ena(avw.ct), elw.b, emk.b, dfk.M.o(), new enc($$0)))), bpj.a($$1));
   }
}
