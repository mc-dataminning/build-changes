import com.google.common.collect.ImmutableList;
import java.util.List;

public class qo {
   private static final alc<etg> N = a("empty");
   public static final alc<etg> a = a("zombie_plains");
   public static final alc<etg> b = a("zombie_savanna");
   public static final alc<etg> c = a("zombie_snowy");
   public static final alc<etg> d = a("zombie_taiga");
   public static final alc<etg> e = a("zombie_desert");
   public static final alc<etg> f = a("mossify_10_percent");
   public static final alc<etg> g = a("mossify_20_percent");
   public static final alc<etg> h = a("mossify_70_percent");
   public static final alc<etg> i = a("street_plains");
   public static final alc<etg> j = a("street_savanna");
   public static final alc<etg> k = a("street_snowy_or_taiga");
   public static final alc<etg> l = a("farm_plains");
   public static final alc<etg> m = a("farm_savanna");
   public static final alc<etg> n = a("farm_snowy");
   public static final alc<etg> o = a("farm_taiga");
   public static final alc<etg> p = a("farm_desert");
   public static final alc<etg> q = a("outpost_rot");
   public static final alc<etg> r = a("bottom_rampart");
   public static final alc<etg> s = a("treasure_rooms");
   public static final alc<etg> t = a("housing");
   public static final alc<etg> u = a("side_wall_degradation");
   public static final alc<etg> v = a("stable_degradation");
   public static final alc<etg> w = a("bastion_generic_degradation");
   public static final alc<etg> x = a("rampart_degradation");
   public static final alc<etg> y = a("entrance_replacement");
   public static final alc<etg> z = a("bridge");
   public static final alc<etg> A = a("roof");
   public static final alc<etg> B = a("high_wall");
   public static final alc<etg> C = a("high_rampart");
   public static final alc<etg> D = a("fossil_rot");
   public static final alc<etg> E = a("fossil_coal");
   public static final alc<etg> F = a("fossil_diamonds");
   public static final alc<etg> G = a("ancient_city_start_degradation");
   public static final alc<etg> H = a("ancient_city_generic_degradation");
   public static final alc<etg> I = a("ancient_city_walls_degradation");
   public static final alc<etg> J = a("trail_ruins_houses_archaeology");
   public static final alc<etg> K = a("trail_ruins_roads_archaeology");
   public static final alc<etg> L = a("trail_ruins_tower_top_archaeology");
   public static final alc<etg> M = a("trial_chambers_copper_bulb_degradation");

   private static alc<etg> a(String $$0) {
      return alc.a(me.ba, ald.b($$0));
   }

   private static void a(qg<etg> $$0, alc<etg> $$1, List<etf> $$2) {
      $$0.a($$1, new etg($$2));
   }

   public static void a(qg<etg> $$0) {
      jt<dku> $$1 = $$0.a(me.f);
      esx $$2 = new esx(new esz(dkw.pV, 0.01F), esf.b, dkw.qg.m());
      esx $$3 = new esx(new esz(dkw.qg, 0.5F), esf.b, dkw.pV.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.m, 0.8F), esf.b, dkw.cu.m()),
                  new esx(new etk(awz.q), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cw), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cx), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.m, 0.07F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.cu, 0.07F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.hG, 0.07F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.X, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.n, 0.1F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.cC, 0.1F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.aq, 0.02F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.fm, 0.5F), esf.b, dkw.bz.m()),
                  new esx[]{
                     new esx(
                        new esm(dkw.fm.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))),
                        esf.b,
                        dkw.ii.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))
                     ),
                     new esx(
                        new esm(dkw.fm.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))),
                        esf.b,
                        dkw.ii.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))
                     ),
                     new esx(new esz(dkw.cJ, 0.3F), esf.b, dkw.gP.m()),
                     new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.gQ.m()),
                     new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new etk(awz.q), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cw), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cx), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.r, 0.2F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.im, 0.2F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.ab, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.ax, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.hH, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.hK, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.hU, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.fm, 0.5F), esf.b, dkw.bz.m()),
                  new esx(
                     new esm(dkw.fm.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))),
                     esf.b,
                     dkw.ii.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))
                  ),
                  new esx[]{
                     new esx(
                        new esm(dkw.fm.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))),
                        esf.b,
                        dkw.ii.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))
                     ),
                     new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new etk(awz.q), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cw), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cx), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.oG), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.o, 0.2F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.jS, 0.4F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.aj, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.aC, 0.05F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.fm, 0.5F), esf.b, dkw.bz.m()),
                  new esx(
                     new esm(dkw.fm.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))),
                     esf.b,
                     dkw.ii.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))
                  ),
                  new esx(
                     new esm(dkw.fm.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))),
                     esf.b,
                     dkw.ii.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))
                  ),
                  new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.gP.m()),
                  new esx[]{new esx(new esz(dkw.cJ, 0.8F), esf.b, dkw.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.m, 0.8F), esf.b, dkw.cu.m()),
                  new esx(new etk(awz.q), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cw), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cx), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.oI), esf.b, dkw.oI.m().b(dlj.b, Boolean.valueOf(false))),
                  new esx(new esz(dkw.m, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.Y, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.fm, 0.5F), esf.b, dkw.bz.m()),
                  new esx(
                     new esm(dkw.fm.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))),
                     esf.b,
                     dkw.ii.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true))
                  ),
                  new esx(
                     new esm(dkw.fm.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))),
                     esf.b,
                     dkw.ii.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true))
                  ),
                  new esx(new esz(dkw.cJ, 0.3F), esf.b, dkw.fr.m()),
                  new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.gQ.m()),
                  new esx[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new etk(awz.q), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cw), esf.b, dkw.a.m()),
                  new esx(new esk(dkw.cx), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.kr, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.be, 0.1F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.iY, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.nN, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.oa, 0.08F), esf.b, dkw.bz.m()),
                  new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.lf.m()),
                  new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.m, 0.1F), esf.b, dkw.cu.m())))));
      a($$0, g, ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.m, 0.2F), esf.b, dkw.cu.m())))));
      a($$0, h, ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.m, 0.7F), esf.b, dkw.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esk(dkw.lg), new esk(dkw.J), dkw.n.m()),
                  new esx(new esz(dkw.lg, 0.1F), esf.b, dkw.i.m()),
                  new esx(new esk(dkw.i), new esk(dkw.J), dkw.J.m()),
                  new esx(new esk(dkw.j), new esk(dkw.J), dkw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esk(dkw.lg), new esk(dkw.J), dkw.r.m()),
                  new esx(new esz(dkw.lg, 0.2F), esf.b, dkw.i.m()),
                  new esx(new esk(dkw.i), new esk(dkw.J), dkw.J.m()),
                  new esx(new esk(dkw.j), new esk(dkw.J), dkw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esk(dkw.lg), new esk(dkw.J), dkw.o.m()),
                  new esx(new esk(dkw.lg), new esk(dkw.eb), dkw.o.m()),
                  new esx(new esz(dkw.lg, 0.2F), esf.b, dkw.i.m()),
                  new esx(new esk(dkw.i), new esk(dkw.J), dkw.J.m()),
                  new esx(new esk(dkw.j), new esk(dkw.J), dkw.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.cJ, 0.3F), esf.b, dkw.gP.m()),
                  new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.gQ.m()),
                  new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.gP.m()), new esx(new esz(dkw.cJ, 0.8F), esf.b, dkw.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.cJ, 0.3F), esf.b, dkw.fr.m()), new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.cJ, 0.2F), esf.b, dkw.lf.m()), new esx(new esz(dkw.cJ, 0.1F), esf.b, dkw.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new esl(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new etb(ImmutableList.of(new esx(new esz(dkw.ll, 0.75F), esf.b, dkw.qb.m()), new esx(new esz(dkw.qb, 0.15F), esf.b, dkw.qa.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new etb(ImmutableList.of(new esx(new esz(dkw.qa, 0.35F), esf.b, dkw.qb.m()), new esx(new esz(dkw.qc, 0.1F), esf.b, dkw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new etb(ImmutableList.of(new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.qb.m()), new esx(new esz(dkw.pV, 1.0E-4F), esf.b, dkw.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new etb(ImmutableList.of(new esx(new esz(dkw.qc, 0.5F), esf.b, dkw.a.m()), new esx(new esz(dkw.co, 0.1F), esf.b, dkw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new etb(ImmutableList.of(new esx(new esz(dkw.qa, 0.1F), esf.b, dkw.qb.m()), new esx(new esz(dkw.pV, 1.0E-4F), esf.b, dkw.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.qb.m()),
                  new esx(new esz(dkw.pV, 1.0E-4F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.co, 0.3F), esf.b, dkw.qb.m()),
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
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.qa, 0.4F), esf.b, dkw.qb.m()),
                  new esx(new esz(dkw.pV, 0.01F), esf.b, dkw.qb.m()),
                  new esx(new esz(dkw.qa, 1.0E-4F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.pV, 1.0E-4F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.co, 0.3F), esf.b, dkw.qb.m()),
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
            new etb(ImmutableList.of(new esx(new esz(dkw.qc, 0.5F), esf.b, dkw.a.m()), new esx(new esz(dkw.co, 0.6F), esf.b, dkw.qb.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new etb(ImmutableList.of(new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.qb.m()), new esx(new esz(dkw.pV, 1.0E-4F), esf.b, dkw.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.qb.m()),
                  new esx(new esz(dkw.qa, 0.15F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.pV.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.qa, 0.01F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.qa, 0.5F), esf.b, dkw.qb.m()),
                  new esx(new esz(dkw.qa, 0.3F), esf.b, dkw.pV.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new etb(
               ImmutableList.of(new esx(new esz(dkw.co, 0.3F), esf.b, dkw.qb.m()), new esx(esf.b, esf.b, new esg(0.0F, 0.05F, 0, 100, jo.a.b), dkw.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new esl(0.9F), new esy(awz.bR)));
      a($$0, E, ImmutableList.of(new esl(0.1F), new esy(awz.bR)));
      a($$0, F, ImmutableList.of(new esl(0.1F), new etb(ImmutableList.of(new esx(new esk(dkw.U), esf.b, dkw.cG.m()))), new esy(awz.bR)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.tC, 0.3F), esf.b, dkw.tH.m()),
                  new esx(new esz(dkw.ty, 0.3F), esf.b, dkw.tI.m()),
                  new esx(new esz(dkw.oH, 0.05F), esf.b, dkw.a.m())
               )
            ),
            new esy(awz.bR)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new esl($$1.b(awz.bX), 0.95F),
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.tC, 0.3F), esf.b, dkw.tH.m()),
                  new esx(new esz(dkw.ty, 0.3F), esf.b, dkw.tI.m()),
                  new esx(new esz(dkw.oH, 0.05F), esf.b, dkw.a.m())
               )
            ),
            new esy(awz.bR)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new esl($$1.b(awz.bX), 0.95F),
            new etb(
               ImmutableList.of(
                  new esx(new esz(dkw.tC, 0.3F), esf.b, dkw.tH.m()),
                  new esx(new esz(dkw.ty, 0.3F), esf.b, dkw.tI.m()),
                  new esx(new esz(dkw.tA, 0.3F), esf.b, dkw.a.m()),
                  new esx(new esz(dkw.oH, 0.05F), esf.b, dkw.a.m())
               )
            ),
            new esy(awz.bR)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new etb(
               List.of(
                  new esx(new esz(dkw.O, 0.2F), esf.b, dkw.j.m()),
                  new esx(new esz(dkw.O, 0.1F), esf.b, dkw.k.m()),
                  new esx(new esz(dkw.fa, 0.1F), esf.b, dkw.eZ.m())
               )
            ),
            a(exh.aZ, 6),
            a(exh.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new etb(
               List.of(
                  new esx(new esz(dkw.O, 0.2F), esf.b, dkw.j.m()),
                  new esx(new esz(dkw.O, 0.1F), esf.b, dkw.k.m()),
                  new esx(new esz(dkw.fa, 0.1F), esf.b, dkw.eZ.m())
               )
            ),
            a(exh.aZ, 2)
         )
      );
      a($$0, L, List.of(a(exh.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new etb(
               List.of(
                  new esx(new esz(dkw.sS, 0.1F), esf.b, dkw.sV.m().b(dmi.c, Boolean.valueOf(true))),
                  new esx(new esz(dkw.sS, 0.33333334F), esf.b, dkw.sU.m().b(dmi.c, Boolean.valueOf(true))),
                  new esx(new esz(dkw.sS, 0.5F), esf.b, dkw.sT.m().b(dmi.c, Boolean.valueOf(true)))
               )
            ),
            new esy(awz.bR)
         )
      );
   }

   private static esn a(alc<exq> $$0, int $$1) {
      return new esn(new etb(List.of(new esx(new etk(awz.cy), esf.b, esu.b, dkw.P.m(), new etm($$0)))), bss.a($$1));
   }
}
