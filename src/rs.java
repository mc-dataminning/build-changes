import com.google.common.collect.ImmutableList;
import java.util.List;

public class rs {
   private static final aly<esc> N = a("empty");
   public static final aly<esc> a = a("zombie_plains");
   public static final aly<esc> b = a("zombie_savanna");
   public static final aly<esc> c = a("zombie_snowy");
   public static final aly<esc> d = a("zombie_taiga");
   public static final aly<esc> e = a("zombie_desert");
   public static final aly<esc> f = a("mossify_10_percent");
   public static final aly<esc> g = a("mossify_20_percent");
   public static final aly<esc> h = a("mossify_70_percent");
   public static final aly<esc> i = a("street_plains");
   public static final aly<esc> j = a("street_savanna");
   public static final aly<esc> k = a("street_snowy_or_taiga");
   public static final aly<esc> l = a("farm_plains");
   public static final aly<esc> m = a("farm_savanna");
   public static final aly<esc> n = a("farm_snowy");
   public static final aly<esc> o = a("farm_taiga");
   public static final aly<esc> p = a("farm_desert");
   public static final aly<esc> q = a("outpost_rot");
   public static final aly<esc> r = a("bottom_rampart");
   public static final aly<esc> s = a("treasure_rooms");
   public static final aly<esc> t = a("housing");
   public static final aly<esc> u = a("side_wall_degradation");
   public static final aly<esc> v = a("stable_degradation");
   public static final aly<esc> w = a("bastion_generic_degradation");
   public static final aly<esc> x = a("rampart_degradation");
   public static final aly<esc> y = a("entrance_replacement");
   public static final aly<esc> z = a("bridge");
   public static final aly<esc> A = a("roof");
   public static final aly<esc> B = a("high_wall");
   public static final aly<esc> C = a("high_rampart");
   public static final aly<esc> D = a("fossil_rot");
   public static final aly<esc> E = a("fossil_coal");
   public static final aly<esc> F = a("fossil_diamonds");
   public static final aly<esc> G = a("ancient_city_start_degradation");
   public static final aly<esc> H = a("ancient_city_generic_degradation");
   public static final aly<esc> I = a("ancient_city_walls_degradation");
   public static final aly<esc> J = a("trail_ruins_houses_archaeology");
   public static final aly<esc> K = a("trail_ruins_roads_archaeology");
   public static final aly<esc> L = a("trail_ruins_tower_top_archaeology");
   public static final aly<esc> M = a("trial_chambers_copper_bulb_degradation");

   private static aly<esc> a(String $$0) {
      return aly.a(mb.aU, alz.b($$0));
   }

   private static void a(rk<esc> $$0, aly<esc> $$1, List<esb> $$2) {
      $$0.a($$1, new esc($$2));
   }

   public static void a(rk<esc> $$0) {
      jr<dke> $$1 = $$0.a(mb.f);
      ert $$2 = new ert(new erv(dkg.pM, 0.01F), erb.b, dkg.pX.m());
      ert $$3 = new ert(new erv(dkg.pX, 0.5F), erb.b, dkg.pM.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.m, 0.8F), erb.b, dkg.cu.m()),
                  new ert(new esg(axu.q), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cw), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cx), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.m, 0.07F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.cu, 0.07F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.hz, 0.07F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.X, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.n, 0.1F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.cC, 0.1F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.aq, 0.02F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.fm, 0.5F), erb.b, dkg.bz.m()),
                  new ert[]{
                     new ert(
                        new eri(dkg.fm.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))),
                        erb.b,
                        dkg.ib.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))
                     ),
                     new ert(
                        new eri(dkg.fm.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))),
                        erb.b,
                        dkg.ib.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))
                     ),
                     new ert(new erv(dkg.cJ, 0.3F), erb.b, dkg.gI.m()),
                     new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.gJ.m()),
                     new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.kY.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new esg(axu.q), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cw), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cx), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.r, 0.2F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.if, 0.2F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.ab, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.ax, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.hA, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.hD, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.hN, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.fm, 0.5F), erb.b, dkg.bz.m()),
                  new ert(
                     new eri(dkg.fm.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))),
                     erb.b,
                     dkg.ib.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))
                  ),
                  new ert[]{
                     new ert(
                        new eri(dkg.fm.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))),
                        erb.b,
                        dkg.ib.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))
                     ),
                     new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new esg(axu.q), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cw), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cx), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.oz), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.o, 0.2F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.jL, 0.4F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.aj, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.aC, 0.05F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.fm, 0.5F), erb.b, dkg.bz.m()),
                  new ert(
                     new eri(dkg.fm.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))),
                     erb.b,
                     dkg.ib.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))
                  ),
                  new ert(
                     new eri(dkg.fm.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))),
                     erb.b,
                     dkg.ib.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))
                  ),
                  new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.gI.m()),
                  new ert[]{new ert(new erv(dkg.cJ, 0.8F), erb.b, dkg.gJ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.m, 0.8F), erb.b, dkg.cu.m()),
                  new ert(new esg(axu.q), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cw), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cx), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.oB), erb.b, dkg.oB.m().b(dkt.c, Boolean.valueOf(false))),
                  new ert(new erv(dkg.m, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.Y, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.fm, 0.5F), erb.b, dkg.bz.m()),
                  new ert(
                     new eri(dkg.fm.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))),
                     erb.b,
                     dkg.ib.m().b(doh.a, Boolean.valueOf(true)).b(doh.c, Boolean.valueOf(true))
                  ),
                  new ert(
                     new eri(dkg.fm.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))),
                     erb.b,
                     dkg.ib.m().b(doh.b, Boolean.valueOf(true)).b(doh.d, Boolean.valueOf(true))
                  ),
                  new ert(new erv(dkg.cJ, 0.3F), erb.b, dkg.fr.m()),
                  new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.gJ.m()),
                  new ert[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new esg(axu.q), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cw), erb.b, dkg.a.m()),
                  new ert(new erg(dkg.cx), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.kk, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.be, 0.1F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.iR, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.nG, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.nT, 0.08F), erb.b, dkg.bz.m()),
                  new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.kY.m()),
                  new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.m, 0.1F), erb.b, dkg.cu.m())))));
      a($$0, g, ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.m, 0.2F), erb.b, dkg.cu.m())))));
      a($$0, h, ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.m, 0.7F), erb.b, dkg.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erg(dkg.kZ), new erg(dkg.J), dkg.n.m()),
                  new ert(new erv(dkg.kZ, 0.1F), erb.b, dkg.i.m()),
                  new ert(new erg(dkg.i), new erg(dkg.J), dkg.J.m()),
                  new ert(new erg(dkg.j), new erg(dkg.J), dkg.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erg(dkg.kZ), new erg(dkg.J), dkg.r.m()),
                  new ert(new erv(dkg.kZ, 0.2F), erb.b, dkg.i.m()),
                  new ert(new erg(dkg.i), new erg(dkg.J), dkg.J.m()),
                  new ert(new erg(dkg.j), new erg(dkg.J), dkg.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erg(dkg.kZ), new erg(dkg.J), dkg.o.m()),
                  new ert(new erg(dkg.kZ), new erg(dkg.eb), dkg.o.m()),
                  new ert(new erv(dkg.kZ, 0.2F), erb.b, dkg.i.m()),
                  new ert(new erg(dkg.i), new erg(dkg.J), dkg.J.m()),
                  new ert(new erg(dkg.j), new erg(dkg.J), dkg.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.cJ, 0.3F), erb.b, dkg.gI.m()),
                  new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.gJ.m()),
                  new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.kY.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.gI.m()), new ert(new erv(dkg.cJ, 0.8F), erb.b, dkg.gJ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.cJ, 0.3F), erb.b, dkg.fr.m()), new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.gJ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.cJ, 0.2F), erb.b, dkg.kY.m()), new ert(new erv(dkg.cJ, 0.1F), erb.b, dkg.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new erh(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new erx(ImmutableList.of(new ert(new erv(dkg.le, 0.75F), erb.b, dkg.pS.m()), new ert(new erv(dkg.pS, 0.15F), erb.b, dkg.pR.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new erx(ImmutableList.of(new ert(new erv(dkg.pR, 0.35F), erb.b, dkg.pS.m()), new ert(new erv(dkg.pT, 0.1F), erb.b, dkg.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new erx(ImmutableList.of(new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pS.m()), new ert(new erv(dkg.pM, 1.0E-4F), erb.b, dkg.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new erx(ImmutableList.of(new ert(new erv(dkg.pT, 0.5F), erb.b, dkg.a.m()), new ert(new erv(dkg.co, 0.1F), erb.b, dkg.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new erx(ImmutableList.of(new ert(new erv(dkg.pR, 0.1F), erb.b, dkg.pS.m()), new ert(new erv(dkg.pM, 1.0E-4F), erb.b, dkg.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pS.m()),
                  new ert(new erv(dkg.pM, 1.0E-4F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.co, 0.3F), erb.b, dkg.pS.m()),
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
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.pR, 0.4F), erb.b, dkg.pS.m()),
                  new ert(new erv(dkg.pM, 0.01F), erb.b, dkg.pS.m()),
                  new ert(new erv(dkg.pR, 1.0E-4F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.pM, 1.0E-4F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.co, 0.3F), erb.b, dkg.pS.m()),
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
            new erx(ImmutableList.of(new ert(new erv(dkg.pT, 0.5F), erb.b, dkg.a.m()), new ert(new erv(dkg.co, 0.6F), erb.b, dkg.pS.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new erx(ImmutableList.of(new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pS.m()), new ert(new erv(dkg.pM, 1.0E-4F), erb.b, dkg.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pS.m()),
                  new ert(new erv(dkg.pR, 0.15F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pM.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.pR, 0.01F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.pR, 0.5F), erb.b, dkg.pS.m()),
                  new ert(new erv(dkg.pR, 0.3F), erb.b, dkg.pM.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new erx(
               ImmutableList.of(new ert(new erv(dkg.co, 0.3F), erb.b, dkg.pS.m()), new ert(erb.b, erb.b, new erc(0.0F, 0.05F, 0, 100, jm.a.b), dkg.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new erh(0.9F), new eru(axu.bQ)));
      a($$0, E, ImmutableList.of(new erh(0.1F), new eru(axu.bQ)));
      a($$0, F, ImmutableList.of(new erh(0.1F), new erx(ImmutableList.of(new ert(new erg(dkg.U), erb.b, dkg.cG.m()))), new eru(axu.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.tr, 0.3F), erb.b, dkg.tw.m()),
                  new ert(new erv(dkg.tn, 0.3F), erb.b, dkg.tx.m()),
                  new ert(new erv(dkg.oA, 0.05F), erb.b, dkg.a.m())
               )
            ),
            new eru(axu.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new erh($$1.b(axu.bW), 0.95F),
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.tr, 0.3F), erb.b, dkg.tw.m()),
                  new ert(new erv(dkg.tn, 0.3F), erb.b, dkg.tx.m()),
                  new ert(new erv(dkg.oA, 0.05F), erb.b, dkg.a.m())
               )
            ),
            new eru(axu.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new erh($$1.b(axu.bW), 0.95F),
            new erx(
               ImmutableList.of(
                  new ert(new erv(dkg.tr, 0.3F), erb.b, dkg.tw.m()),
                  new ert(new erv(dkg.tn, 0.3F), erb.b, dkg.tx.m()),
                  new ert(new erv(dkg.tp, 0.3F), erb.b, dkg.a.m()),
                  new ert(new erv(dkg.oA, 0.05F), erb.b, dkg.a.m())
               )
            ),
            new eru(axu.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new erx(
               List.of(
                  new ert(new erv(dkg.O, 0.2F), erb.b, dkg.j.m()),
                  new ert(new erv(dkg.O, 0.1F), erb.b, dkg.k.m()),
                  new ert(new erv(dkg.fa, 0.1F), erb.b, dkg.eZ.m())
               )
            ),
            a(ewd.aZ, 6),
            a(ewd.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new erx(
               List.of(
                  new ert(new erv(dkg.O, 0.2F), erb.b, dkg.j.m()),
                  new ert(new erv(dkg.O, 0.1F), erb.b, dkg.k.m()),
                  new ert(new erv(dkg.fa, 0.1F), erb.b, dkg.eZ.m())
               )
            ),
            a(ewd.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ewd.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new erx(
               List.of(
                  new ert(new erv(dkg.sJ, 0.1F), erb.b, dkg.sM.m().b(dlt.c, Boolean.valueOf(true))),
                  new ert(new erv(dkg.sJ, 0.33333334F), erb.b, dkg.sL.m().b(dlt.c, Boolean.valueOf(true))),
                  new ert(new erv(dkg.sJ, 0.5F), erb.b, dkg.sK.m().b(dlt.c, Boolean.valueOf(true)))
               )
            ),
            new eru(axu.bQ)
         )
      );
   }

   private static erj a(aly<ewm> $$0, int $$1) {
      return new erj(new erx(List.of(new ert(new esg(axu.cw), erb.b, erq.b, dkg.P.m(), new esi($$0)))), bsg.a($$1));
   }
}
