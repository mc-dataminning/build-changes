import com.google.common.collect.ImmutableList;
import java.util.List;

public class rb {
   private static final ala<eoo> N = a("empty");
   public static final ala<eoo> a = a("zombie_plains");
   public static final ala<eoo> b = a("zombie_savanna");
   public static final ala<eoo> c = a("zombie_snowy");
   public static final ala<eoo> d = a("zombie_taiga");
   public static final ala<eoo> e = a("zombie_desert");
   public static final ala<eoo> f = a("mossify_10_percent");
   public static final ala<eoo> g = a("mossify_20_percent");
   public static final ala<eoo> h = a("mossify_70_percent");
   public static final ala<eoo> i = a("street_plains");
   public static final ala<eoo> j = a("street_savanna");
   public static final ala<eoo> k = a("street_snowy_or_taiga");
   public static final ala<eoo> l = a("farm_plains");
   public static final ala<eoo> m = a("farm_savanna");
   public static final ala<eoo> n = a("farm_snowy");
   public static final ala<eoo> o = a("farm_taiga");
   public static final ala<eoo> p = a("farm_desert");
   public static final ala<eoo> q = a("outpost_rot");
   public static final ala<eoo> r = a("bottom_rampart");
   public static final ala<eoo> s = a("treasure_rooms");
   public static final ala<eoo> t = a("housing");
   public static final ala<eoo> u = a("side_wall_degradation");
   public static final ala<eoo> v = a("stable_degradation");
   public static final ala<eoo> w = a("bastion_generic_degradation");
   public static final ala<eoo> x = a("rampart_degradation");
   public static final ala<eoo> y = a("entrance_replacement");
   public static final ala<eoo> z = a("bridge");
   public static final ala<eoo> A = a("roof");
   public static final ala<eoo> B = a("high_wall");
   public static final ala<eoo> C = a("high_rampart");
   public static final ala<eoo> D = a("fossil_rot");
   public static final ala<eoo> E = a("fossil_coal");
   public static final ala<eoo> F = a("fossil_diamonds");
   public static final ala<eoo> G = a("ancient_city_start_degradation");
   public static final ala<eoo> H = a("ancient_city_generic_degradation");
   public static final ala<eoo> I = a("ancient_city_walls_degradation");
   public static final ala<eoo> J = a("trail_ruins_houses_archaeology");
   public static final ala<eoo> K = a("trail_ruins_roads_archaeology");
   public static final ala<eoo> L = a("trail_ruins_tower_top_archaeology");
   public static final ala<eoo> M = a("trial_chambers_copper_bulb_degradation");

   private static ala<eoo> a(String $$0) {
      return ala.a(lv.aS, alb.b($$0));
   }

   private static void a(qt<eoo> $$0, ala<eoo> $$1, List<eon> $$2) {
      $$0.a($$1, new eoo($$2));
   }

   public static void a(qt<eoo> $$0) {
      jo<dgv> $$1 = $$0.a(lv.f);
      eof $$2 = new eof(new eoh(dgx.pr, 0.01F), enn.b, dgx.pC.o());
      eof $$3 = new eof(new eoh(dgx.pC, 0.5F), enn.b, dgx.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.m, 0.8F), enn.b, dgx.cn.o()),
                  new eof(new eos(aws.q), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cp), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cq), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.m, 0.07F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.cn, 0.07F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.hj, 0.07F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.U, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.n, 0.1F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.cu, 0.1F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.al, 0.02F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.eY, 0.5F), enn.b, dgx.bs.o()),
                  new eof[]{
                     new eof(
                        new enu(dgx.eY.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))),
                        enn.b,
                        dgx.hL.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))
                     ),
                     new eof(
                        new enu(dgx.eY.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))),
                        enn.b,
                        dgx.hL.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))
                     ),
                     new eof(new eoh(dgx.cB, 0.3F), enn.b, dgx.gt.o()),
                     new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.gu.o()),
                     new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eos(aws.q), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cp), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cq), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.r, 0.2F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.hP, 0.2F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.Y, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.as, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.hk, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.hn, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.hx, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.eY, 0.5F), enn.b, dgx.bs.o()),
                  new eof(
                     new enu(dgx.eY.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))),
                     enn.b,
                     dgx.hL.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))
                  ),
                  new eof[]{
                     new eof(
                        new enu(dgx.eY.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))),
                        enn.b,
                        dgx.hL.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))
                     ),
                     new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eos(aws.q), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cp), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cq), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.oe), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.o, 0.2F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.ju, 0.4F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.af, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.ax, 0.05F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.eY, 0.5F), enn.b, dgx.bs.o()),
                  new eof(
                     new enu(dgx.eY.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))),
                     enn.b,
                     dgx.hL.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))
                  ),
                  new eof(
                     new enu(dgx.eY.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))),
                     enn.b,
                     dgx.hL.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))
                  ),
                  new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.gt.o()),
                  new eof[]{new eof(new eoh(dgx.cB, 0.8F), enn.b, dgx.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.m, 0.8F), enn.b, dgx.cn.o()),
                  new eof(new eos(aws.q), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cp), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cq), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.og), enn.b, dgx.og.o().b(dhj.c, Boolean.valueOf(false))),
                  new eof(new eoh(dgx.m, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.V, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.eY, 0.5F), enn.b, dgx.bs.o()),
                  new eof(
                     new enu(dgx.eY.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))),
                     enn.b,
                     dgx.hL.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true))
                  ),
                  new eof(
                     new enu(dgx.eY.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))),
                     enn.b,
                     dgx.hL.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true))
                  ),
                  new eof(new eoh(dgx.cB, 0.3F), enn.b, dgx.fd.o()),
                  new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.gu.o()),
                  new eof[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eos(aws.q), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cp), enn.b, dgx.a.o()),
                  new eof(new ens(dgx.cq), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.jS, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.aX, 0.1F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.iA, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.nl, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.ny, 0.08F), enn.b, dgx.bs.o()),
                  new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.kD.o()),
                  new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.m, 0.1F), enn.b, dgx.cn.o())))));
      a($$0, g, ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.m, 0.2F), enn.b, dgx.cn.o())))));
      a($$0, h, ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.m, 0.7F), enn.b, dgx.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new ens(dgx.kE), new ens(dgx.G), dgx.n.o()),
                  new eof(new eoh(dgx.kE, 0.1F), enn.b, dgx.i.o()),
                  new eof(new ens(dgx.i), new ens(dgx.G), dgx.G.o()),
                  new eof(new ens(dgx.j), new ens(dgx.G), dgx.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new ens(dgx.kE), new ens(dgx.G), dgx.r.o()),
                  new eof(new eoh(dgx.kE, 0.2F), enn.b, dgx.i.o()),
                  new eof(new ens(dgx.i), new ens(dgx.G), dgx.G.o()),
                  new eof(new ens(dgx.j), new ens(dgx.G), dgx.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new ens(dgx.kE), new ens(dgx.G), dgx.o.o()),
                  new eof(new ens(dgx.kE), new ens(dgx.dO), dgx.o.o()),
                  new eof(new eoh(dgx.kE, 0.2F), enn.b, dgx.i.o()),
                  new eof(new ens(dgx.i), new ens(dgx.G), dgx.G.o()),
                  new eof(new ens(dgx.j), new ens(dgx.G), dgx.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.cB, 0.3F), enn.b, dgx.gt.o()),
                  new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.gu.o()),
                  new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.gt.o()), new eof(new eoh(dgx.cB, 0.8F), enn.b, dgx.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.cB, 0.3F), enn.b, dgx.fd.o()), new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.cB, 0.2F), enn.b, dgx.kD.o()), new eof(new eoh(dgx.cB, 0.1F), enn.b, dgx.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new ent(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eoj(ImmutableList.of(new eof(new eoh(dgx.kJ, 0.75F), enn.b, dgx.px.o()), new eof(new eoh(dgx.px, 0.15F), enn.b, dgx.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eoj(ImmutableList.of(new eof(new eoh(dgx.pw, 0.35F), enn.b, dgx.px.o()), new eof(new eoh(dgx.py, 0.1F), enn.b, dgx.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eoj(ImmutableList.of(new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.px.o()), new eof(new eoh(dgx.pr, 1.0E-4F), enn.b, dgx.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eoj(ImmutableList.of(new eof(new eoh(dgx.py, 0.5F), enn.b, dgx.a.o()), new eof(new eoh(dgx.ch, 0.1F), enn.b, dgx.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eoj(ImmutableList.of(new eof(new eoh(dgx.pw, 0.1F), enn.b, dgx.px.o()), new eof(new eoh(dgx.pr, 1.0E-4F), enn.b, dgx.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.px.o()),
                  new eof(new eoh(dgx.pr, 1.0E-4F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.ch, 0.3F), enn.b, dgx.px.o()),
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
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.pw, 0.4F), enn.b, dgx.px.o()),
                  new eof(new eoh(dgx.pr, 0.01F), enn.b, dgx.px.o()),
                  new eof(new eoh(dgx.pw, 1.0E-4F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.pr, 1.0E-4F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.ch, 0.3F), enn.b, dgx.px.o()),
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
            new eoj(ImmutableList.of(new eof(new eoh(dgx.py, 0.5F), enn.b, dgx.a.o()), new eof(new eoh(dgx.ch, 0.6F), enn.b, dgx.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eoj(ImmutableList.of(new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.px.o()), new eof(new eoh(dgx.pr, 1.0E-4F), enn.b, dgx.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.px.o()),
                  new eof(new eoh(dgx.pw, 0.15F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.pw, 0.01F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.pw, 0.5F), enn.b, dgx.px.o()),
                  new eof(new eoh(dgx.pw, 0.3F), enn.b, dgx.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(new eof(new eoh(dgx.ch, 0.3F), enn.b, dgx.px.o()), new eof(enn.b, enn.b, new eno(0.0F, 0.05F, 0, 100, jj.a.b), dgx.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ent(0.9F), new eog(aws.bP)));
      a($$0, E, ImmutableList.of(new ent(0.1F), new eog(aws.bP)));
      a($$0, F, ImmutableList.of(new ent(0.1F), new eoj(ImmutableList.of(new eof(new ens(dgx.R), enn.b, dgx.cy.o()))), new eog(aws.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.sW, 0.3F), enn.b, dgx.tb.o()),
                  new eof(new eoh(dgx.sS, 0.3F), enn.b, dgx.tc.o()),
                  new eof(new eoh(dgx.of, 0.05F), enn.b, dgx.a.o())
               )
            ),
            new eog(aws.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ent($$1.b(aws.bV), 0.95F),
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.sW, 0.3F), enn.b, dgx.tb.o()),
                  new eof(new eoh(dgx.sS, 0.3F), enn.b, dgx.tc.o()),
                  new eof(new eoh(dgx.of, 0.05F), enn.b, dgx.a.o())
               )
            ),
            new eog(aws.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ent($$1.b(aws.bV), 0.95F),
            new eoj(
               ImmutableList.of(
                  new eof(new eoh(dgx.sW, 0.3F), enn.b, dgx.tb.o()),
                  new eof(new eoh(dgx.sS, 0.3F), enn.b, dgx.tc.o()),
                  new eof(new eoh(dgx.sU, 0.3F), enn.b, dgx.a.o()),
                  new eof(new eoh(dgx.of, 0.05F), enn.b, dgx.a.o())
               )
            ),
            new eog(aws.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eoj(
               List.of(
                  new eof(new eoh(dgx.L, 0.2F), enn.b, dgx.j.o()),
                  new eof(new eoh(dgx.L, 0.1F), enn.b, dgx.k.o()),
                  new eof(new eoh(dgx.eM, 0.1F), enn.b, dgx.eL.o())
               )
            ),
            a(esp.aU, 6),
            a(esp.aV, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eoj(
               List.of(
                  new eof(new eoh(dgx.L, 0.2F), enn.b, dgx.j.o()),
                  new eof(new eoh(dgx.L, 0.1F), enn.b, dgx.k.o()),
                  new eof(new eoh(dgx.eM, 0.1F), enn.b, dgx.eL.o())
               )
            ),
            a(esp.aU, 2)
         )
      );
      a($$0, L, List.of(a(esp.aU, 2)));
      a(
         $$0,
         M,
         List.of(
            new eoj(
               List.of(
                  new eof(new eoh(dgx.so, 0.1F), enn.b, dgx.sr.o().b(dij.c, Boolean.valueOf(true))),
                  new eof(new eoh(dgx.so, 0.33333334F), enn.b, dgx.sq.o().b(dij.c, Boolean.valueOf(true))),
                  new eof(new eoh(dgx.so, 0.5F), enn.b, dgx.sp.o().b(dij.c, Boolean.valueOf(true)))
               )
            ),
            new eog(aws.bP)
         )
      );
   }

   private static env a(ala<esy> $$0, int $$1) {
      return new env(new eoj(List.of(new eof(new eos(aws.cu), enn.b, eoc.b, dgx.M.o(), new eou($$0)))), bqm.a($$1));
   }
}
