import com.google.common.collect.ImmutableList;
import java.util.List;

public class rs {
   private static final aly<esk> N = a("empty");
   public static final aly<esk> a = a("zombie_plains");
   public static final aly<esk> b = a("zombie_savanna");
   public static final aly<esk> c = a("zombie_snowy");
   public static final aly<esk> d = a("zombie_taiga");
   public static final aly<esk> e = a("zombie_desert");
   public static final aly<esk> f = a("mossify_10_percent");
   public static final aly<esk> g = a("mossify_20_percent");
   public static final aly<esk> h = a("mossify_70_percent");
   public static final aly<esk> i = a("street_plains");
   public static final aly<esk> j = a("street_savanna");
   public static final aly<esk> k = a("street_snowy_or_taiga");
   public static final aly<esk> l = a("farm_plains");
   public static final aly<esk> m = a("farm_savanna");
   public static final aly<esk> n = a("farm_snowy");
   public static final aly<esk> o = a("farm_taiga");
   public static final aly<esk> p = a("farm_desert");
   public static final aly<esk> q = a("outpost_rot");
   public static final aly<esk> r = a("bottom_rampart");
   public static final aly<esk> s = a("treasure_rooms");
   public static final aly<esk> t = a("housing");
   public static final aly<esk> u = a("side_wall_degradation");
   public static final aly<esk> v = a("stable_degradation");
   public static final aly<esk> w = a("bastion_generic_degradation");
   public static final aly<esk> x = a("rampart_degradation");
   public static final aly<esk> y = a("entrance_replacement");
   public static final aly<esk> z = a("bridge");
   public static final aly<esk> A = a("roof");
   public static final aly<esk> B = a("high_wall");
   public static final aly<esk> C = a("high_rampart");
   public static final aly<esk> D = a("fossil_rot");
   public static final aly<esk> E = a("fossil_coal");
   public static final aly<esk> F = a("fossil_diamonds");
   public static final aly<esk> G = a("ancient_city_start_degradation");
   public static final aly<esk> H = a("ancient_city_generic_degradation");
   public static final aly<esk> I = a("ancient_city_walls_degradation");
   public static final aly<esk> J = a("trail_ruins_houses_archaeology");
   public static final aly<esk> K = a("trail_ruins_roads_archaeology");
   public static final aly<esk> L = a("trail_ruins_tower_top_archaeology");
   public static final aly<esk> M = a("trial_chambers_copper_bulb_degradation");

   private static aly<esk> a(String $$0) {
      return aly.a(mb.aV, alz.b($$0));
   }

   private static void a(rk<esk> $$0, aly<esk> $$1, List<esj> $$2) {
      $$0.a($$1, new esk($$2));
   }

   public static void a(rk<esk> $$0) {
      jr<dkm> $$1 = $$0.a(mb.f);
      esb $$2 = new esb(new esd(dko.pM, 0.01F), erj.b, dko.pX.m());
      esb $$3 = new esb(new esd(dko.pX, 0.5F), erj.b, dko.pM.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.m, 0.8F), erj.b, dko.cu.m()),
                  new esb(new eso(axu.q), erj.b, dko.a.m()),
                  new esb(new ero(dko.cw), erj.b, dko.a.m()),
                  new esb(new ero(dko.cx), erj.b, dko.a.m()),
                  new esb(new esd(dko.m, 0.07F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.cu, 0.07F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.hz, 0.07F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.X, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.n, 0.1F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.cC, 0.1F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.aq, 0.02F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.fm, 0.5F), erj.b, dko.bz.m()),
                  new esb[]{
                     new esb(
                        new erq(dko.fm.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))),
                        erj.b,
                        dko.ib.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))
                     ),
                     new esb(
                        new erq(dko.fm.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))),
                        erj.b,
                        dko.ib.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))
                     ),
                     new esb(new esd(dko.cJ, 0.3F), erj.b, dko.gI.m()),
                     new esb(new esd(dko.cJ, 0.2F), erj.b, dko.gJ.m()),
                     new esb(new esd(dko.cJ, 0.1F), erj.b, dko.kY.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new eso(axu.q), erj.b, dko.a.m()),
                  new esb(new ero(dko.cw), erj.b, dko.a.m()),
                  new esb(new ero(dko.cx), erj.b, dko.a.m()),
                  new esb(new esd(dko.r, 0.2F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.if, 0.2F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.ab, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.ax, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.hA, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.hD, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.hN, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.fm, 0.5F), erj.b, dko.bz.m()),
                  new esb(
                     new erq(dko.fm.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))),
                     erj.b,
                     dko.ib.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))
                  ),
                  new esb[]{
                     new esb(
                        new erq(dko.fm.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))),
                        erj.b,
                        dko.ib.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))
                     ),
                     new esb(new esd(dko.cJ, 0.1F), erj.b, dko.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new eso(axu.q), erj.b, dko.a.m()),
                  new esb(new ero(dko.cw), erj.b, dko.a.m()),
                  new esb(new ero(dko.cx), erj.b, dko.a.m()),
                  new esb(new ero(dko.oz), erj.b, dko.a.m()),
                  new esb(new esd(dko.o, 0.2F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.jL, 0.4F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.aj, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.aC, 0.05F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.fm, 0.5F), erj.b, dko.bz.m()),
                  new esb(
                     new erq(dko.fm.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))),
                     erj.b,
                     dko.ib.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))
                  ),
                  new esb(
                     new erq(dko.fm.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))),
                     erj.b,
                     dko.ib.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))
                  ),
                  new esb(new esd(dko.cJ, 0.1F), erj.b, dko.gI.m()),
                  new esb[]{new esb(new esd(dko.cJ, 0.8F), erj.b, dko.gJ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.m, 0.8F), erj.b, dko.cu.m()),
                  new esb(new eso(axu.q), erj.b, dko.a.m()),
                  new esb(new ero(dko.cw), erj.b, dko.a.m()),
                  new esb(new ero(dko.cx), erj.b, dko.a.m()),
                  new esb(new ero(dko.oB), erj.b, dko.oB.m().b(dlb.c, Boolean.valueOf(false))),
                  new esb(new esd(dko.m, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.Y, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.fm, 0.5F), erj.b, dko.bz.m()),
                  new esb(
                     new erq(dko.fm.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))),
                     erj.b,
                     dko.ib.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true))
                  ),
                  new esb(
                     new erq(dko.fm.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))),
                     erj.b,
                     dko.ib.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true))
                  ),
                  new esb(new esd(dko.cJ, 0.3F), erj.b, dko.fr.m()),
                  new esb(new esd(dko.cJ, 0.2F), erj.b, dko.gJ.m()),
                  new esb[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new eso(axu.q), erj.b, dko.a.m()),
                  new esb(new ero(dko.cw), erj.b, dko.a.m()),
                  new esb(new ero(dko.cx), erj.b, dko.a.m()),
                  new esb(new esd(dko.kk, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.be, 0.1F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.iR, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.nG, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.nT, 0.08F), erj.b, dko.bz.m()),
                  new esb(new esd(dko.cJ, 0.2F), erj.b, dko.kY.m()),
                  new esb(new esd(dko.cJ, 0.1F), erj.b, dko.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.m, 0.1F), erj.b, dko.cu.m())))));
      a($$0, g, ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.m, 0.2F), erj.b, dko.cu.m())))));
      a($$0, h, ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.m, 0.7F), erj.b, dko.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new ero(dko.kZ), new ero(dko.J), dko.n.m()),
                  new esb(new esd(dko.kZ, 0.1F), erj.b, dko.i.m()),
                  new esb(new ero(dko.i), new ero(dko.J), dko.J.m()),
                  new esb(new ero(dko.j), new ero(dko.J), dko.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new ero(dko.kZ), new ero(dko.J), dko.r.m()),
                  new esb(new esd(dko.kZ, 0.2F), erj.b, dko.i.m()),
                  new esb(new ero(dko.i), new ero(dko.J), dko.J.m()),
                  new esb(new ero(dko.j), new ero(dko.J), dko.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new ero(dko.kZ), new ero(dko.J), dko.o.m()),
                  new esb(new ero(dko.kZ), new ero(dko.eb), dko.o.m()),
                  new esb(new esd(dko.kZ, 0.2F), erj.b, dko.i.m()),
                  new esb(new ero(dko.i), new ero(dko.J), dko.J.m()),
                  new esb(new ero(dko.j), new ero(dko.J), dko.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.cJ, 0.3F), erj.b, dko.gI.m()),
                  new esb(new esd(dko.cJ, 0.2F), erj.b, dko.gJ.m()),
                  new esb(new esd(dko.cJ, 0.1F), erj.b, dko.kY.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.cJ, 0.1F), erj.b, dko.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.cJ, 0.1F), erj.b, dko.gI.m()), new esb(new esd(dko.cJ, 0.8F), erj.b, dko.gJ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.cJ, 0.3F), erj.b, dko.fr.m()), new esb(new esd(dko.cJ, 0.2F), erj.b, dko.gJ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.cJ, 0.2F), erj.b, dko.kY.m()), new esb(new esd(dko.cJ, 0.1F), erj.b, dko.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new erp(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new esf(ImmutableList.of(new esb(new esd(dko.le, 0.75F), erj.b, dko.pS.m()), new esb(new esd(dko.pS, 0.15F), erj.b, dko.pR.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new esf(ImmutableList.of(new esb(new esd(dko.pR, 0.35F), erj.b, dko.pS.m()), new esb(new esd(dko.pT, 0.1F), erj.b, dko.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new esf(ImmutableList.of(new esb(new esd(dko.pR, 0.3F), erj.b, dko.pS.m()), new esb(new esd(dko.pM, 1.0E-4F), erj.b, dko.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new esf(ImmutableList.of(new esb(new esd(dko.pT, 0.5F), erj.b, dko.a.m()), new esb(new esd(dko.co, 0.1F), erj.b, dko.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new esf(ImmutableList.of(new esb(new esd(dko.pR, 0.1F), erj.b, dko.pS.m()), new esb(new esd(dko.pM, 1.0E-4F), erj.b, dko.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.pR, 0.3F), erj.b, dko.pS.m()),
                  new esb(new esd(dko.pM, 1.0E-4F), erj.b, dko.a.m()),
                  new esb(new esd(dko.co, 0.3F), erj.b, dko.pS.m()),
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
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.pR, 0.4F), erj.b, dko.pS.m()),
                  new esb(new esd(dko.pM, 0.01F), erj.b, dko.pS.m()),
                  new esb(new esd(dko.pR, 1.0E-4F), erj.b, dko.a.m()),
                  new esb(new esd(dko.pM, 1.0E-4F), erj.b, dko.a.m()),
                  new esb(new esd(dko.co, 0.3F), erj.b, dko.pS.m()),
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
            new esf(ImmutableList.of(new esb(new esd(dko.pT, 0.5F), erj.b, dko.a.m()), new esb(new esd(dko.co, 0.6F), erj.b, dko.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new esf(ImmutableList.of(new esb(new esd(dko.pR, 0.3F), erj.b, dko.pS.m()), new esb(new esd(dko.pM, 1.0E-4F), erj.b, dko.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.pR, 0.3F), erj.b, dko.pS.m()),
                  new esb(new esd(dko.pR, 0.15F), erj.b, dko.a.m()),
                  new esb(new esd(dko.pR, 0.3F), erj.b, dko.pM.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.pR, 0.01F), erj.b, dko.a.m()),
                  new esb(new esd(dko.pR, 0.5F), erj.b, dko.pS.m()),
                  new esb(new esd(dko.pR, 0.3F), erj.b, dko.pM.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new esf(
               ImmutableList.of(new esb(new esd(dko.co, 0.3F), erj.b, dko.pS.m()), new esb(erj.b, erj.b, new erk(0.0F, 0.05F, 0, 100, jm.a.b), dko.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new erp(0.9F), new esc(axu.bQ)));
      a($$0, E, ImmutableList.of(new erp(0.1F), new esc(axu.bQ)));
      a($$0, F, ImmutableList.of(new erp(0.1F), new esf(ImmutableList.of(new esb(new ero(dko.U), erj.b, dko.cG.m()))), new esc(axu.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.tr, 0.3F), erj.b, dko.tw.m()),
                  new esb(new esd(dko.tn, 0.3F), erj.b, dko.tx.m()),
                  new esb(new esd(dko.oA, 0.05F), erj.b, dko.a.m())
               )
            ),
            new esc(axu.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new erp($$1.b(axu.bW), 0.95F),
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.tr, 0.3F), erj.b, dko.tw.m()),
                  new esb(new esd(dko.tn, 0.3F), erj.b, dko.tx.m()),
                  new esb(new esd(dko.oA, 0.05F), erj.b, dko.a.m())
               )
            ),
            new esc(axu.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new erp($$1.b(axu.bW), 0.95F),
            new esf(
               ImmutableList.of(
                  new esb(new esd(dko.tr, 0.3F), erj.b, dko.tw.m()),
                  new esb(new esd(dko.tn, 0.3F), erj.b, dko.tx.m()),
                  new esb(new esd(dko.tp, 0.3F), erj.b, dko.a.m()),
                  new esb(new esd(dko.oA, 0.05F), erj.b, dko.a.m())
               )
            ),
            new esc(axu.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new esf(
               List.of(
                  new esb(new esd(dko.O, 0.2F), erj.b, dko.j.m()),
                  new esb(new esd(dko.O, 0.1F), erj.b, dko.k.m()),
                  new esb(new esd(dko.fa, 0.1F), erj.b, dko.eZ.m())
               )
            ),
            a(ewl.aZ, 6),
            a(ewl.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new esf(
               List.of(
                  new esb(new esd(dko.O, 0.2F), erj.b, dko.j.m()),
                  new esb(new esd(dko.O, 0.1F), erj.b, dko.k.m()),
                  new esb(new esd(dko.fa, 0.1F), erj.b, dko.eZ.m())
               )
            ),
            a(ewl.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ewl.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new esf(
               List.of(
                  new esb(new esd(dko.sJ, 0.1F), erj.b, dko.sM.m().b(dmb.c, Boolean.valueOf(true))),
                  new esb(new esd(dko.sJ, 0.33333334F), erj.b, dko.sL.m().b(dmb.c, Boolean.valueOf(true))),
                  new esb(new esd(dko.sJ, 0.5F), erj.b, dko.sK.m().b(dmb.c, Boolean.valueOf(true)))
               )
            ),
            new esc(axu.bQ)
         )
      );
   }

   private static err a(aly<ewu> $$0, int $$1) {
      return new err(new esf(List.of(new esb(new eso(axu.cw), erj.b, ery.b, dko.P.m(), new esq($$0)))), bsl.a($$1));
   }
}
