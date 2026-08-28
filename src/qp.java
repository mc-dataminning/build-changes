import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final alf<eut> N = a("empty");
   public static final alf<eut> a = a("zombie_plains");
   public static final alf<eut> b = a("zombie_savanna");
   public static final alf<eut> c = a("zombie_snowy");
   public static final alf<eut> d = a("zombie_taiga");
   public static final alf<eut> e = a("zombie_desert");
   public static final alf<eut> f = a("mossify_10_percent");
   public static final alf<eut> g = a("mossify_20_percent");
   public static final alf<eut> h = a("mossify_70_percent");
   public static final alf<eut> i = a("street_plains");
   public static final alf<eut> j = a("street_savanna");
   public static final alf<eut> k = a("street_snowy_or_taiga");
   public static final alf<eut> l = a("farm_plains");
   public static final alf<eut> m = a("farm_savanna");
   public static final alf<eut> n = a("farm_snowy");
   public static final alf<eut> o = a("farm_taiga");
   public static final alf<eut> p = a("farm_desert");
   public static final alf<eut> q = a("outpost_rot");
   public static final alf<eut> r = a("bottom_rampart");
   public static final alf<eut> s = a("treasure_rooms");
   public static final alf<eut> t = a("housing");
   public static final alf<eut> u = a("side_wall_degradation");
   public static final alf<eut> v = a("stable_degradation");
   public static final alf<eut> w = a("bastion_generic_degradation");
   public static final alf<eut> x = a("rampart_degradation");
   public static final alf<eut> y = a("entrance_replacement");
   public static final alf<eut> z = a("bridge");
   public static final alf<eut> A = a("roof");
   public static final alf<eut> B = a("high_wall");
   public static final alf<eut> C = a("high_rampart");
   public static final alf<eut> D = a("fossil_rot");
   public static final alf<eut> E = a("fossil_coal");
   public static final alf<eut> F = a("fossil_diamonds");
   public static final alf<eut> G = a("ancient_city_start_degradation");
   public static final alf<eut> H = a("ancient_city_generic_degradation");
   public static final alf<eut> I = a("ancient_city_walls_degradation");
   public static final alf<eut> J = a("trail_ruins_houses_archaeology");
   public static final alf<eut> K = a("trail_ruins_roads_archaeology");
   public static final alf<eut> L = a("trail_ruins_tower_top_archaeology");
   public static final alf<eut> M = a("trial_chambers_copper_bulb_degradation");

   private static alf<eut> a(String $$0) {
      return alf.a(mg.bb, alg.b($$0));
   }

   private static void a(qh<eut> $$0, alf<eut> $$1, List<eus> $$2) {
      $$0.a($$1, new eut($$2));
   }

   public static void a(qh<eut> $$0) {
      jf<dma> $$1 = $$0.a(mg.i);
      euk $$2 = new euk(new eum(dmc.pW, 0.01F), ets.b, dmc.qh.m());
      euk $$3 = new euk(new eum(dmc.qh, 0.5F), ets.b, dmc.pW.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.m, 0.8F), ets.b, dmc.cv.m()),
                  new euk(new eux(axc.q), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cx), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cy), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.m, 0.07F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.cv, 0.07F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.hH, 0.07F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.X, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.n, 0.1F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.cD, 0.1F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.aq, 0.02F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.fn, 0.5F), ets.b, dmc.bz.m()),
                  new euk[]{
                     new euk(
                        new etz(dmc.fn.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))),
                        ets.b,
                        dmc.ij.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))
                     ),
                     new euk(
                        new etz(dmc.fn.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))),
                        ets.b,
                        dmc.ij.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))
                     ),
                     new euk(new eum(dmc.cK, 0.3F), ets.b, dmc.gQ.m()),
                     new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.gR.m()),
                     new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.lg.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eux(axc.q), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cx), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cy), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.r, 0.2F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.in, 0.2F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.ab, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.ax, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.hI, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.hL, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.hV, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.fn, 0.5F), ets.b, dmc.bz.m()),
                  new euk(
                     new etz(dmc.fn.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))),
                     ets.b,
                     dmc.ij.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))
                  ),
                  new euk[]{
                     new euk(
                        new etz(dmc.fn.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))),
                        ets.b,
                        dmc.ij.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))
                     ),
                     new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.ft.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eux(axc.q), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cx), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cy), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.oH), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.o, 0.2F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.jT, 0.4F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.aj, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.aC, 0.05F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.fn, 0.5F), ets.b, dmc.bz.m()),
                  new euk(
                     new etz(dmc.fn.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))),
                     ets.b,
                     dmc.ij.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))
                  ),
                  new euk(
                     new etz(dmc.fn.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))),
                     ets.b,
                     dmc.ij.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))
                  ),
                  new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.gQ.m()),
                  new euk[]{new euk(new eum(dmc.cK, 0.8F), ets.b, dmc.gR.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.m, 0.8F), ets.b, dmc.cv.m()),
                  new euk(new eux(axc.q), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cx), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cy), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.oJ), ets.b, dmc.oJ.m().b(dmp.b, Boolean.valueOf(false))),
                  new euk(new eum(dmc.m, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.Y, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.fn, 0.5F), ets.b, dmc.bz.m()),
                  new euk(
                     new etz(dmc.fn.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))),
                     ets.b,
                     dmc.ij.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true))
                  ),
                  new euk(
                     new etz(dmc.fn.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))),
                     ets.b,
                     dmc.ij.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true))
                  ),
                  new euk(new eum(dmc.cK, 0.3F), ets.b, dmc.fs.m()),
                  new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.gR.m()),
                  new euk[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eux(axc.q), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cx), ets.b, dmc.a.m()),
                  new euk(new etx(dmc.cy), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.ks, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.be, 0.1F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.iZ, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.nO, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.ob, 0.08F), ets.b, dmc.bz.m()),
                  new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.lg.m()),
                  new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.ft.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.m, 0.1F), ets.b, dmc.cv.m())))));
      a($$0, g, ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.m, 0.2F), ets.b, dmc.cv.m())))));
      a($$0, h, ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.m, 0.7F), ets.b, dmc.cv.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new etx(dmc.lh), new etx(dmc.J), dmc.n.m()),
                  new euk(new eum(dmc.lh, 0.1F), ets.b, dmc.i.m()),
                  new euk(new etx(dmc.i), new etx(dmc.J), dmc.J.m()),
                  new euk(new etx(dmc.j), new etx(dmc.J), dmc.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new etx(dmc.lh), new etx(dmc.J), dmc.r.m()),
                  new euk(new eum(dmc.lh, 0.2F), ets.b, dmc.i.m()),
                  new euk(new etx(dmc.i), new etx(dmc.J), dmc.J.m()),
                  new euk(new etx(dmc.j), new etx(dmc.J), dmc.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new etx(dmc.lh), new etx(dmc.J), dmc.o.m()),
                  new euk(new etx(dmc.lh), new etx(dmc.ec), dmc.o.m()),
                  new euk(new eum(dmc.lh, 0.2F), ets.b, dmc.i.m()),
                  new euk(new etx(dmc.i), new etx(dmc.J), dmc.J.m()),
                  new euk(new etx(dmc.j), new etx(dmc.J), dmc.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.cK, 0.3F), ets.b, dmc.gQ.m()),
                  new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.gR.m()),
                  new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.lg.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.ft.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.gQ.m()), new euk(new eum(dmc.cK, 0.8F), ets.b, dmc.gR.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.cK, 0.3F), ets.b, dmc.fs.m()), new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.gR.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.cK, 0.2F), ets.b, dmc.lg.m()), new euk(new eum(dmc.cK, 0.1F), ets.b, dmc.ft.m()))))
      );
      a($$0, q, ImmutableList.of(new ety(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new euo(ImmutableList.of(new euk(new eum(dmc.lm, 0.75F), ets.b, dmc.qc.m()), new euk(new eum(dmc.qc, 0.15F), ets.b, dmc.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new euo(ImmutableList.of(new euk(new eum(dmc.qb, 0.35F), ets.b, dmc.qc.m()), new euk(new eum(dmc.qd, 0.1F), ets.b, dmc.qc.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new euo(ImmutableList.of(new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.qc.m()), new euk(new eum(dmc.pW, 1.0E-4F), ets.b, dmc.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new euo(ImmutableList.of(new euk(new eum(dmc.qd, 0.5F), ets.b, dmc.a.m()), new euk(new eum(dmc.cp, 0.1F), ets.b, dmc.qc.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new euo(ImmutableList.of(new euk(new eum(dmc.qb, 0.1F), ets.b, dmc.qc.m()), new euk(new eum(dmc.pW, 1.0E-4F), ets.b, dmc.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.qc.m()),
                  new euk(new eum(dmc.pW, 1.0E-4F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.cp, 0.3F), ets.b, dmc.qc.m()),
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
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.qb, 0.4F), ets.b, dmc.qc.m()),
                  new euk(new eum(dmc.pW, 0.01F), ets.b, dmc.qc.m()),
                  new euk(new eum(dmc.qb, 1.0E-4F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.pW, 1.0E-4F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.cp, 0.3F), ets.b, dmc.qc.m()),
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
            new euo(ImmutableList.of(new euk(new eum(dmc.qd, 0.5F), ets.b, dmc.a.m()), new euk(new eum(dmc.cp, 0.6F), ets.b, dmc.qc.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new euo(ImmutableList.of(new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.qc.m()), new euk(new eum(dmc.pW, 1.0E-4F), ets.b, dmc.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.qc.m()),
                  new euk(new eum(dmc.qb, 0.15F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.pW.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.qb, 0.01F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.qb, 0.5F), ets.b, dmc.qc.m()),
                  new euk(new eum(dmc.qb, 0.3F), ets.b, dmc.pW.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new euo(
               ImmutableList.of(new euk(new eum(dmc.cp, 0.3F), ets.b, dmc.qc.m()), new euk(ets.b, ets.b, new ett(0.0F, 0.05F, 0, 100, ja.a.b), dmc.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ety(0.9F), new eul(axc.bR)));
      a($$0, E, ImmutableList.of(new ety(0.1F), new eul(axc.bR)));
      a($$0, F, ImmutableList.of(new ety(0.1F), new euo(ImmutableList.of(new euk(new etx(dmc.U), ets.b, dmc.cH.m()))), new eul(axc.bR)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.tD, 0.3F), ets.b, dmc.tI.m()),
                  new euk(new eum(dmc.tz, 0.3F), ets.b, dmc.tJ.m()),
                  new euk(new eum(dmc.oI, 0.05F), ets.b, dmc.a.m())
               )
            ),
            new eul(axc.bR)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ety($$1.b(axc.bX), 0.95F),
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.tD, 0.3F), ets.b, dmc.tI.m()),
                  new euk(new eum(dmc.tz, 0.3F), ets.b, dmc.tJ.m()),
                  new euk(new eum(dmc.oI, 0.05F), ets.b, dmc.a.m())
               )
            ),
            new eul(axc.bR)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ety($$1.b(axc.bX), 0.95F),
            new euo(
               ImmutableList.of(
                  new euk(new eum(dmc.tD, 0.3F), ets.b, dmc.tI.m()),
                  new euk(new eum(dmc.tz, 0.3F), ets.b, dmc.tJ.m()),
                  new euk(new eum(dmc.tB, 0.3F), ets.b, dmc.a.m()),
                  new euk(new eum(dmc.oI, 0.05F), ets.b, dmc.a.m())
               )
            ),
            new eul(axc.bR)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new euo(
               List.of(
                  new euk(new eum(dmc.O, 0.2F), ets.b, dmc.j.m()),
                  new euk(new eum(dmc.O, 0.1F), ets.b, dmc.k.m()),
                  new euk(new eum(dmc.fb, 0.1F), ets.b, dmc.fa.m())
               )
            ),
            a(eyv.aZ, 6),
            a(eyv.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new euo(
               List.of(
                  new euk(new eum(dmc.O, 0.2F), ets.b, dmc.j.m()),
                  new euk(new eum(dmc.O, 0.1F), ets.b, dmc.k.m()),
                  new euk(new eum(dmc.fb, 0.1F), ets.b, dmc.fa.m())
               )
            ),
            a(eyv.aZ, 2)
         )
      );
      a($$0, L, List.of(a(eyv.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new euo(
               List.of(
                  new euk(new eum(dmc.sT, 0.1F), ets.b, dmc.sW.m().b(dno.c, Boolean.valueOf(true))),
                  new euk(new eum(dmc.sT, 0.33333334F), ets.b, dmc.sV.m().b(dno.c, Boolean.valueOf(true))),
                  new euk(new eum(dmc.sT, 0.5F), ets.b, dmc.sU.m().b(dno.c, Boolean.valueOf(true)))
               )
            ),
            new eul(axc.bR)
         )
      );
   }

   private static eua a(alf<eze> $$0, int $$1) {
      return new eua(new euo(List.of(new euk(new eux(axc.cy), ets.b, euh.b, dmc.P.m(), new euz($$0)))), btd.a($$1));
   }
}
