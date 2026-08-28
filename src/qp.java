import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final ald<eui> N = a("empty");
   public static final ald<eui> a = a("zombie_plains");
   public static final ald<eui> b = a("zombie_savanna");
   public static final ald<eui> c = a("zombie_snowy");
   public static final ald<eui> d = a("zombie_taiga");
   public static final ald<eui> e = a("zombie_desert");
   public static final ald<eui> f = a("mossify_10_percent");
   public static final ald<eui> g = a("mossify_20_percent");
   public static final ald<eui> h = a("mossify_70_percent");
   public static final ald<eui> i = a("street_plains");
   public static final ald<eui> j = a("street_savanna");
   public static final ald<eui> k = a("street_snowy_or_taiga");
   public static final ald<eui> l = a("farm_plains");
   public static final ald<eui> m = a("farm_savanna");
   public static final ald<eui> n = a("farm_snowy");
   public static final ald<eui> o = a("farm_taiga");
   public static final ald<eui> p = a("farm_desert");
   public static final ald<eui> q = a("outpost_rot");
   public static final ald<eui> r = a("bottom_rampart");
   public static final ald<eui> s = a("treasure_rooms");
   public static final ald<eui> t = a("housing");
   public static final ald<eui> u = a("side_wall_degradation");
   public static final ald<eui> v = a("stable_degradation");
   public static final ald<eui> w = a("bastion_generic_degradation");
   public static final ald<eui> x = a("rampart_degradation");
   public static final ald<eui> y = a("entrance_replacement");
   public static final ald<eui> z = a("bridge");
   public static final ald<eui> A = a("roof");
   public static final ald<eui> B = a("high_wall");
   public static final ald<eui> C = a("high_rampart");
   public static final ald<eui> D = a("fossil_rot");
   public static final ald<eui> E = a("fossil_coal");
   public static final ald<eui> F = a("fossil_diamonds");
   public static final ald<eui> G = a("ancient_city_start_degradation");
   public static final ald<eui> H = a("ancient_city_generic_degradation");
   public static final ald<eui> I = a("ancient_city_walls_degradation");
   public static final ald<eui> J = a("trail_ruins_houses_archaeology");
   public static final ald<eui> K = a("trail_ruins_roads_archaeology");
   public static final ald<eui> L = a("trail_ruins_tower_top_archaeology");
   public static final ald<eui> M = a("trial_chambers_copper_bulb_degradation");

   private static ald<eui> a(String $$0) {
      return ald.a(mg.ba, ale.b($$0));
   }

   private static void a(qh<eui> $$0, ald<eui> $$1, List<euh> $$2) {
      $$0.a($$1, new eui($$2));
   }

   public static void a(qh<eui> $$0) {
      jf<dlu> $$1 = $$0.a(mg.i);
      etz $$2 = new etz(new eub(dlw.pV, 0.01F), eth.b, dlw.qg.m());
      etz $$3 = new etz(new eub(dlw.qg, 0.5F), eth.b, dlw.pV.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.m, 0.8F), eth.b, dlw.cu.m()),
                  new etz(new eum(axa.q), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cw), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cx), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.m, 0.07F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.cu, 0.07F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.hG, 0.07F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.X, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.n, 0.1F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.cC, 0.1F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.aq, 0.02F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.fm, 0.5F), eth.b, dlw.bz.m()),
                  new etz[]{
                     new etz(
                        new eto(dlw.fm.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))),
                        eth.b,
                        dlw.ii.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))
                     ),
                     new etz(
                        new eto(dlw.fm.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))),
                        eth.b,
                        dlw.ii.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))
                     ),
                     new etz(new eub(dlw.cJ, 0.3F), eth.b, dlw.gP.m()),
                     new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.gQ.m()),
                     new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eum(axa.q), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cw), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cx), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.r, 0.2F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.im, 0.2F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.ab, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.ax, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.hH, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.hK, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.hU, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.fm, 0.5F), eth.b, dlw.bz.m()),
                  new etz(
                     new eto(dlw.fm.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))),
                     eth.b,
                     dlw.ii.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))
                  ),
                  new etz[]{
                     new etz(
                        new eto(dlw.fm.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))),
                        eth.b,
                        dlw.ii.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))
                     ),
                     new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eum(axa.q), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cw), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cx), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.oG), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.o, 0.2F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.jS, 0.4F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.aj, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.aC, 0.05F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.fm, 0.5F), eth.b, dlw.bz.m()),
                  new etz(
                     new eto(dlw.fm.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))),
                     eth.b,
                     dlw.ii.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))
                  ),
                  new etz(
                     new eto(dlw.fm.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))),
                     eth.b,
                     dlw.ii.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))
                  ),
                  new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.gP.m()),
                  new etz[]{new etz(new eub(dlw.cJ, 0.8F), eth.b, dlw.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.m, 0.8F), eth.b, dlw.cu.m()),
                  new etz(new eum(axa.q), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cw), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cx), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.oI), eth.b, dlw.oI.m().b(dmj.b, Boolean.valueOf(false))),
                  new etz(new eub(dlw.m, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.Y, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.fm, 0.5F), eth.b, dlw.bz.m()),
                  new etz(
                     new eto(dlw.fm.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))),
                     eth.b,
                     dlw.ii.m().b(dpy.a, Boolean.valueOf(true)).b(dpy.c, Boolean.valueOf(true))
                  ),
                  new etz(
                     new eto(dlw.fm.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))),
                     eth.b,
                     dlw.ii.m().b(dpy.b, Boolean.valueOf(true)).b(dpy.d, Boolean.valueOf(true))
                  ),
                  new etz(new eub(dlw.cJ, 0.3F), eth.b, dlw.fr.m()),
                  new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.gQ.m()),
                  new etz[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eum(axa.q), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cw), eth.b, dlw.a.m()),
                  new etz(new etm(dlw.cx), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.kr, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.be, 0.1F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.iY, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.nN, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.oa, 0.08F), eth.b, dlw.bz.m()),
                  new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.lf.m()),
                  new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.m, 0.1F), eth.b, dlw.cu.m())))));
      a($$0, g, ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.m, 0.2F), eth.b, dlw.cu.m())))));
      a($$0, h, ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.m, 0.7F), eth.b, dlw.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new etm(dlw.lg), new etm(dlw.J), dlw.n.m()),
                  new etz(new eub(dlw.lg, 0.1F), eth.b, dlw.i.m()),
                  new etz(new etm(dlw.i), new etm(dlw.J), dlw.J.m()),
                  new etz(new etm(dlw.j), new etm(dlw.J), dlw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new etm(dlw.lg), new etm(dlw.J), dlw.r.m()),
                  new etz(new eub(dlw.lg, 0.2F), eth.b, dlw.i.m()),
                  new etz(new etm(dlw.i), new etm(dlw.J), dlw.J.m()),
                  new etz(new etm(dlw.j), new etm(dlw.J), dlw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new etm(dlw.lg), new etm(dlw.J), dlw.o.m()),
                  new etz(new etm(dlw.lg), new etm(dlw.eb), dlw.o.m()),
                  new etz(new eub(dlw.lg, 0.2F), eth.b, dlw.i.m()),
                  new etz(new etm(dlw.i), new etm(dlw.J), dlw.J.m()),
                  new etz(new etm(dlw.j), new etm(dlw.J), dlw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.cJ, 0.3F), eth.b, dlw.gP.m()),
                  new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.gQ.m()),
                  new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.gP.m()), new etz(new eub(dlw.cJ, 0.8F), eth.b, dlw.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.cJ, 0.3F), eth.b, dlw.fr.m()), new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.cJ, 0.2F), eth.b, dlw.lf.m()), new etz(new eub(dlw.cJ, 0.1F), eth.b, dlw.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new etn(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eud(ImmutableList.of(new etz(new eub(dlw.ll, 0.75F), eth.b, dlw.qb.m()), new etz(new eub(dlw.qb, 0.15F), eth.b, dlw.qa.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eud(ImmutableList.of(new etz(new eub(dlw.qa, 0.35F), eth.b, dlw.qb.m()), new etz(new eub(dlw.qc, 0.1F), eth.b, dlw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eud(ImmutableList.of(new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.qb.m()), new etz(new eub(dlw.pV, 1.0E-4F), eth.b, dlw.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eud(ImmutableList.of(new etz(new eub(dlw.qc, 0.5F), eth.b, dlw.a.m()), new etz(new eub(dlw.co, 0.1F), eth.b, dlw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eud(ImmutableList.of(new etz(new eub(dlw.qa, 0.1F), eth.b, dlw.qb.m()), new etz(new eub(dlw.pV, 1.0E-4F), eth.b, dlw.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.qb.m()),
                  new etz(new eub(dlw.pV, 1.0E-4F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.co, 0.3F), eth.b, dlw.qb.m()),
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
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.qa, 0.4F), eth.b, dlw.qb.m()),
                  new etz(new eub(dlw.pV, 0.01F), eth.b, dlw.qb.m()),
                  new etz(new eub(dlw.qa, 1.0E-4F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.pV, 1.0E-4F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.co, 0.3F), eth.b, dlw.qb.m()),
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
            new eud(ImmutableList.of(new etz(new eub(dlw.qc, 0.5F), eth.b, dlw.a.m()), new etz(new eub(dlw.co, 0.6F), eth.b, dlw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eud(ImmutableList.of(new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.qb.m()), new etz(new eub(dlw.pV, 1.0E-4F), eth.b, dlw.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.qb.m()),
                  new etz(new eub(dlw.qa, 0.15F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.pV.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.qa, 0.01F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.qa, 0.5F), eth.b, dlw.qb.m()),
                  new etz(new eub(dlw.qa, 0.3F), eth.b, dlw.pV.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eud(
               ImmutableList.of(new etz(new eub(dlw.co, 0.3F), eth.b, dlw.qb.m()), new etz(eth.b, eth.b, new eti(0.0F, 0.05F, 0, 100, ja.a.b), dlw.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new etn(0.9F), new eua(axa.bR)));
      a($$0, E, ImmutableList.of(new etn(0.1F), new eua(axa.bR)));
      a($$0, F, ImmutableList.of(new etn(0.1F), new eud(ImmutableList.of(new etz(new etm(dlw.U), eth.b, dlw.cG.m()))), new eua(axa.bR)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.tC, 0.3F), eth.b, dlw.tH.m()),
                  new etz(new eub(dlw.ty, 0.3F), eth.b, dlw.tI.m()),
                  new etz(new eub(dlw.oH, 0.05F), eth.b, dlw.a.m())
               )
            ),
            new eua(axa.bR)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new etn($$1.b(axa.bX), 0.95F),
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.tC, 0.3F), eth.b, dlw.tH.m()),
                  new etz(new eub(dlw.ty, 0.3F), eth.b, dlw.tI.m()),
                  new etz(new eub(dlw.oH, 0.05F), eth.b, dlw.a.m())
               )
            ),
            new eua(axa.bR)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new etn($$1.b(axa.bX), 0.95F),
            new eud(
               ImmutableList.of(
                  new etz(new eub(dlw.tC, 0.3F), eth.b, dlw.tH.m()),
                  new etz(new eub(dlw.ty, 0.3F), eth.b, dlw.tI.m()),
                  new etz(new eub(dlw.tA, 0.3F), eth.b, dlw.a.m()),
                  new etz(new eub(dlw.oH, 0.05F), eth.b, dlw.a.m())
               )
            ),
            new eua(axa.bR)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eud(
               List.of(
                  new etz(new eub(dlw.O, 0.2F), eth.b, dlw.j.m()),
                  new etz(new eub(dlw.O, 0.1F), eth.b, dlw.k.m()),
                  new etz(new eub(dlw.fa, 0.1F), eth.b, dlw.eZ.m())
               )
            ),
            a(eyj.aZ, 6),
            a(eyj.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eud(
               List.of(
                  new etz(new eub(dlw.O, 0.2F), eth.b, dlw.j.m()),
                  new etz(new eub(dlw.O, 0.1F), eth.b, dlw.k.m()),
                  new etz(new eub(dlw.fa, 0.1F), eth.b, dlw.eZ.m())
               )
            ),
            a(eyj.aZ, 2)
         )
      );
      a($$0, L, List.of(a(eyj.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new eud(
               List.of(
                  new etz(new eub(dlw.sS, 0.1F), eth.b, dlw.sV.m().b(dni.c, Boolean.valueOf(true))),
                  new etz(new eub(dlw.sS, 0.33333334F), eth.b, dlw.sU.m().b(dni.c, Boolean.valueOf(true))),
                  new etz(new eub(dlw.sS, 0.5F), eth.b, dlw.sT.m().b(dni.c, Boolean.valueOf(true)))
               )
            ),
            new eua(axa.bR)
         )
      );
   }

   private static etp a(ald<eys> $$0, int $$1) {
      return new etp(new eud(List.of(new etz(new eum(axa.cy), eth.b, etw.b, dlw.P.m(), new euo($$0)))), bta.a($$1));
   }
}
