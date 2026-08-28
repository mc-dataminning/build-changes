import com.google.common.collect.ImmutableList;
import java.util.List;

public class rs {
   private static final aly<esj> N = a("empty");
   public static final aly<esj> a = a("zombie_plains");
   public static final aly<esj> b = a("zombie_savanna");
   public static final aly<esj> c = a("zombie_snowy");
   public static final aly<esj> d = a("zombie_taiga");
   public static final aly<esj> e = a("zombie_desert");
   public static final aly<esj> f = a("mossify_10_percent");
   public static final aly<esj> g = a("mossify_20_percent");
   public static final aly<esj> h = a("mossify_70_percent");
   public static final aly<esj> i = a("street_plains");
   public static final aly<esj> j = a("street_savanna");
   public static final aly<esj> k = a("street_snowy_or_taiga");
   public static final aly<esj> l = a("farm_plains");
   public static final aly<esj> m = a("farm_savanna");
   public static final aly<esj> n = a("farm_snowy");
   public static final aly<esj> o = a("farm_taiga");
   public static final aly<esj> p = a("farm_desert");
   public static final aly<esj> q = a("outpost_rot");
   public static final aly<esj> r = a("bottom_rampart");
   public static final aly<esj> s = a("treasure_rooms");
   public static final aly<esj> t = a("housing");
   public static final aly<esj> u = a("side_wall_degradation");
   public static final aly<esj> v = a("stable_degradation");
   public static final aly<esj> w = a("bastion_generic_degradation");
   public static final aly<esj> x = a("rampart_degradation");
   public static final aly<esj> y = a("entrance_replacement");
   public static final aly<esj> z = a("bridge");
   public static final aly<esj> A = a("roof");
   public static final aly<esj> B = a("high_wall");
   public static final aly<esj> C = a("high_rampart");
   public static final aly<esj> D = a("fossil_rot");
   public static final aly<esj> E = a("fossil_coal");
   public static final aly<esj> F = a("fossil_diamonds");
   public static final aly<esj> G = a("ancient_city_start_degradation");
   public static final aly<esj> H = a("ancient_city_generic_degradation");
   public static final aly<esj> I = a("ancient_city_walls_degradation");
   public static final aly<esj> J = a("trail_ruins_houses_archaeology");
   public static final aly<esj> K = a("trail_ruins_roads_archaeology");
   public static final aly<esj> L = a("trail_ruins_tower_top_archaeology");
   public static final aly<esj> M = a("trial_chambers_copper_bulb_degradation");

   private static aly<esj> a(String $$0) {
      return aly.a(mb.aV, alz.b($$0));
   }

   private static void a(rk<esj> $$0, aly<esj> $$1, List<esi> $$2) {
      $$0.a($$1, new esj($$2));
   }

   public static void a(rk<esj> $$0) {
      jr<dkl> $$1 = $$0.a(mb.f);
      esa $$2 = new esa(new esc(dkn.pM, 0.01F), eri.b, dkn.pX.m());
      esa $$3 = new esa(new esc(dkn.pX, 0.5F), eri.b, dkn.pM.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.m, 0.8F), eri.b, dkn.cu.m()),
                  new esa(new esn(axu.q), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cw), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cx), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.m, 0.07F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.cu, 0.07F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.hz, 0.07F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.X, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.n, 0.1F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.cC, 0.1F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.aq, 0.02F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.fm, 0.5F), eri.b, dkn.bz.m()),
                  new esa[]{
                     new esa(
                        new erp(dkn.fm.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))),
                        eri.b,
                        dkn.ib.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))
                     ),
                     new esa(
                        new erp(dkn.fm.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))),
                        eri.b,
                        dkn.ib.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))
                     ),
                     new esa(new esc(dkn.cJ, 0.3F), eri.b, dkn.gI.m()),
                     new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.gJ.m()),
                     new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.kY.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esn(axu.q), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cw), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cx), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.r, 0.2F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.if, 0.2F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.ab, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.ax, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.hA, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.hD, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.hN, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.fm, 0.5F), eri.b, dkn.bz.m()),
                  new esa(
                     new erp(dkn.fm.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))),
                     eri.b,
                     dkn.ib.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))
                  ),
                  new esa[]{
                     new esa(
                        new erp(dkn.fm.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))),
                        eri.b,
                        dkn.ib.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))
                     ),
                     new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esn(axu.q), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cw), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cx), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.oz), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.o, 0.2F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.jL, 0.4F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.aj, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.aC, 0.05F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.fm, 0.5F), eri.b, dkn.bz.m()),
                  new esa(
                     new erp(dkn.fm.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))),
                     eri.b,
                     dkn.ib.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))
                  ),
                  new esa(
                     new erp(dkn.fm.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))),
                     eri.b,
                     dkn.ib.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))
                  ),
                  new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.gI.m()),
                  new esa[]{new esa(new esc(dkn.cJ, 0.8F), eri.b, dkn.gJ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.m, 0.8F), eri.b, dkn.cu.m()),
                  new esa(new esn(axu.q), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cw), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cx), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.oB), eri.b, dkn.oB.m().b(dla.c, Boolean.valueOf(false))),
                  new esa(new esc(dkn.m, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.Y, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.fm, 0.5F), eri.b, dkn.bz.m()),
                  new esa(
                     new erp(dkn.fm.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))),
                     eri.b,
                     dkn.ib.m().b(doo.a, Boolean.valueOf(true)).b(doo.c, Boolean.valueOf(true))
                  ),
                  new esa(
                     new erp(dkn.fm.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))),
                     eri.b,
                     dkn.ib.m().b(doo.b, Boolean.valueOf(true)).b(doo.d, Boolean.valueOf(true))
                  ),
                  new esa(new esc(dkn.cJ, 0.3F), eri.b, dkn.fr.m()),
                  new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.gJ.m()),
                  new esa[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esn(axu.q), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cw), eri.b, dkn.a.m()),
                  new esa(new ern(dkn.cx), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.kk, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.be, 0.1F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.iR, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.nG, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.nT, 0.08F), eri.b, dkn.bz.m()),
                  new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.kY.m()),
                  new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.m, 0.1F), eri.b, dkn.cu.m())))));
      a($$0, g, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.m, 0.2F), eri.b, dkn.cu.m())))));
      a($$0, h, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.m, 0.7F), eri.b, dkn.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new ern(dkn.kZ), new ern(dkn.J), dkn.n.m()),
                  new esa(new esc(dkn.kZ, 0.1F), eri.b, dkn.i.m()),
                  new esa(new ern(dkn.i), new ern(dkn.J), dkn.J.m()),
                  new esa(new ern(dkn.j), new ern(dkn.J), dkn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new ern(dkn.kZ), new ern(dkn.J), dkn.r.m()),
                  new esa(new esc(dkn.kZ, 0.2F), eri.b, dkn.i.m()),
                  new esa(new ern(dkn.i), new ern(dkn.J), dkn.J.m()),
                  new esa(new ern(dkn.j), new ern(dkn.J), dkn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new ern(dkn.kZ), new ern(dkn.J), dkn.o.m()),
                  new esa(new ern(dkn.kZ), new ern(dkn.eb), dkn.o.m()),
                  new esa(new esc(dkn.kZ, 0.2F), eri.b, dkn.i.m()),
                  new esa(new ern(dkn.i), new ern(dkn.J), dkn.J.m()),
                  new esa(new ern(dkn.j), new ern(dkn.J), dkn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.cJ, 0.3F), eri.b, dkn.gI.m()),
                  new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.gJ.m()),
                  new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.kY.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.gI.m()), new esa(new esc(dkn.cJ, 0.8F), eri.b, dkn.gJ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.cJ, 0.3F), eri.b, dkn.fr.m()), new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.gJ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.cJ, 0.2F), eri.b, dkn.kY.m()), new esa(new esc(dkn.cJ, 0.1F), eri.b, dkn.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new ero(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkn.le, 0.75F), eri.b, dkn.pS.m()), new esa(new esc(dkn.pS, 0.15F), eri.b, dkn.pR.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkn.pR, 0.35F), eri.b, dkn.pS.m()), new esa(new esc(dkn.pT, 0.1F), eri.b, dkn.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pS.m()), new esa(new esc(dkn.pM, 1.0E-4F), eri.b, dkn.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkn.pT, 0.5F), eri.b, dkn.a.m()), new esa(new esc(dkn.co, 0.1F), eri.b, dkn.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkn.pR, 0.1F), eri.b, dkn.pS.m()), new esa(new esc(dkn.pM, 1.0E-4F), eri.b, dkn.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pS.m()),
                  new esa(new esc(dkn.pM, 1.0E-4F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.co, 0.3F), eri.b, dkn.pS.m()),
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
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.pR, 0.4F), eri.b, dkn.pS.m()),
                  new esa(new esc(dkn.pM, 0.01F), eri.b, dkn.pS.m()),
                  new esa(new esc(dkn.pR, 1.0E-4F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.pM, 1.0E-4F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.co, 0.3F), eri.b, dkn.pS.m()),
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
            new ese(ImmutableList.of(new esa(new esc(dkn.pT, 0.5F), eri.b, dkn.a.m()), new esa(new esc(dkn.co, 0.6F), eri.b, dkn.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pS.m()), new esa(new esc(dkn.pM, 1.0E-4F), eri.b, dkn.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pS.m()),
                  new esa(new esc(dkn.pR, 0.15F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pM.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.pR, 0.01F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.pR, 0.5F), eri.b, dkn.pS.m()),
                  new esa(new esc(dkn.pR, 0.3F), eri.b, dkn.pM.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ese(
               ImmutableList.of(new esa(new esc(dkn.co, 0.3F), eri.b, dkn.pS.m()), new esa(eri.b, eri.b, new erj(0.0F, 0.05F, 0, 100, jm.a.b), dkn.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ero(0.9F), new esb(axu.bQ)));
      a($$0, E, ImmutableList.of(new ero(0.1F), new esb(axu.bQ)));
      a($$0, F, ImmutableList.of(new ero(0.1F), new ese(ImmutableList.of(new esa(new ern(dkn.U), eri.b, dkn.cG.m()))), new esb(axu.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.tr, 0.3F), eri.b, dkn.tw.m()),
                  new esa(new esc(dkn.tn, 0.3F), eri.b, dkn.tx.m()),
                  new esa(new esc(dkn.oA, 0.05F), eri.b, dkn.a.m())
               )
            ),
            new esb(axu.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ero($$1.b(axu.bW), 0.95F),
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.tr, 0.3F), eri.b, dkn.tw.m()),
                  new esa(new esc(dkn.tn, 0.3F), eri.b, dkn.tx.m()),
                  new esa(new esc(dkn.oA, 0.05F), eri.b, dkn.a.m())
               )
            ),
            new esb(axu.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ero($$1.b(axu.bW), 0.95F),
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkn.tr, 0.3F), eri.b, dkn.tw.m()),
                  new esa(new esc(dkn.tn, 0.3F), eri.b, dkn.tx.m()),
                  new esa(new esc(dkn.tp, 0.3F), eri.b, dkn.a.m()),
                  new esa(new esc(dkn.oA, 0.05F), eri.b, dkn.a.m())
               )
            ),
            new esb(axu.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ese(
               List.of(
                  new esa(new esc(dkn.O, 0.2F), eri.b, dkn.j.m()),
                  new esa(new esc(dkn.O, 0.1F), eri.b, dkn.k.m()),
                  new esa(new esc(dkn.fa, 0.1F), eri.b, dkn.eZ.m())
               )
            ),
            a(ewk.aZ, 6),
            a(ewk.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ese(
               List.of(
                  new esa(new esc(dkn.O, 0.2F), eri.b, dkn.j.m()),
                  new esa(new esc(dkn.O, 0.1F), eri.b, dkn.k.m()),
                  new esa(new esc(dkn.fa, 0.1F), eri.b, dkn.eZ.m())
               )
            ),
            a(ewk.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ewk.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new ese(
               List.of(
                  new esa(new esc(dkn.sJ, 0.1F), eri.b, dkn.sM.m().b(dma.c, Boolean.valueOf(true))),
                  new esa(new esc(dkn.sJ, 0.33333334F), eri.b, dkn.sL.m().b(dma.c, Boolean.valueOf(true))),
                  new esa(new esc(dkn.sJ, 0.5F), eri.b, dkn.sK.m().b(dma.c, Boolean.valueOf(true)))
               )
            ),
            new esb(axu.bQ)
         )
      );
   }

   private static erq a(aly<ewt> $$0, int $$1) {
      return new erq(new ese(List.of(new esa(new esn(axu.cw), eri.b, erx.b, dkn.P.m(), new esp($$0)))), bsk.a($$1));
   }
}
