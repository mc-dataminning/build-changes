import com.google.common.collect.ImmutableList;
import java.util.List;

public class ri {
   private static final alo<esd> N = a("empty");
   public static final alo<esd> a = a("zombie_plains");
   public static final alo<esd> b = a("zombie_savanna");
   public static final alo<esd> c = a("zombie_snowy");
   public static final alo<esd> d = a("zombie_taiga");
   public static final alo<esd> e = a("zombie_desert");
   public static final alo<esd> f = a("mossify_10_percent");
   public static final alo<esd> g = a("mossify_20_percent");
   public static final alo<esd> h = a("mossify_70_percent");
   public static final alo<esd> i = a("street_plains");
   public static final alo<esd> j = a("street_savanna");
   public static final alo<esd> k = a("street_snowy_or_taiga");
   public static final alo<esd> l = a("farm_plains");
   public static final alo<esd> m = a("farm_savanna");
   public static final alo<esd> n = a("farm_snowy");
   public static final alo<esd> o = a("farm_taiga");
   public static final alo<esd> p = a("farm_desert");
   public static final alo<esd> q = a("outpost_rot");
   public static final alo<esd> r = a("bottom_rampart");
   public static final alo<esd> s = a("treasure_rooms");
   public static final alo<esd> t = a("housing");
   public static final alo<esd> u = a("side_wall_degradation");
   public static final alo<esd> v = a("stable_degradation");
   public static final alo<esd> w = a("bastion_generic_degradation");
   public static final alo<esd> x = a("rampart_degradation");
   public static final alo<esd> y = a("entrance_replacement");
   public static final alo<esd> z = a("bridge");
   public static final alo<esd> A = a("roof");
   public static final alo<esd> B = a("high_wall");
   public static final alo<esd> C = a("high_rampart");
   public static final alo<esd> D = a("fossil_rot");
   public static final alo<esd> E = a("fossil_coal");
   public static final alo<esd> F = a("fossil_diamonds");
   public static final alo<esd> G = a("ancient_city_start_degradation");
   public static final alo<esd> H = a("ancient_city_generic_degradation");
   public static final alo<esd> I = a("ancient_city_walls_degradation");
   public static final alo<esd> J = a("trail_ruins_houses_archaeology");
   public static final alo<esd> K = a("trail_ruins_roads_archaeology");
   public static final alo<esd> L = a("trail_ruins_tower_top_archaeology");
   public static final alo<esd> M = a("trial_chambers_copper_bulb_degradation");

   private static alo<esd> a(String $$0) {
      return alo.a(mb.aV, alp.b($$0));
   }

   private static void a(ra<esd> $$0, alo<esd> $$1, List<esc> $$2) {
      $$0.a($$1, new esd($$2));
   }

   public static void a(ra<esd> $$0) {
      jr<dkd> $$1 = $$0.a(mb.f);
      eru $$2 = new eru(new erw(dkf.pT, 0.01F), erc.b, dkf.qe.m());
      eru $$3 = new eru(new erw(dkf.qe, 0.5F), erc.b, dkf.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.m, 0.8F), erc.b, dkf.cu.m()),
                  new eru(new esh(axk.q), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cw), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cx), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.m, 0.07F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.cu, 0.07F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.hG, 0.07F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.X, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.n, 0.1F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.cC, 0.1F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.aq, 0.02F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.fm, 0.5F), erc.b, dkf.bz.m()),
                  new eru[]{
                     new eru(
                        new erj(dkf.fm.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))),
                        erc.b,
                        dkf.ii.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))
                     ),
                     new eru(
                        new erj(dkf.fm.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))),
                        erc.b,
                        dkf.ii.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))
                     ),
                     new eru(new erw(dkf.cJ, 0.3F), erc.b, dkf.gP.m()),
                     new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.gQ.m()),
                     new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new esh(axk.q), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cw), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cx), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.r, 0.2F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.im, 0.2F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.ab, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.ax, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.hH, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.hK, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.hU, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.fm, 0.5F), erc.b, dkf.bz.m()),
                  new eru(
                     new erj(dkf.fm.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))),
                     erc.b,
                     dkf.ii.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))
                  ),
                  new eru[]{
                     new eru(
                        new erj(dkf.fm.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))),
                        erc.b,
                        dkf.ii.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))
                     ),
                     new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new esh(axk.q), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cw), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cx), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.oG), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.o, 0.2F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.jS, 0.4F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.aj, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.aC, 0.05F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.fm, 0.5F), erc.b, dkf.bz.m()),
                  new eru(
                     new erj(dkf.fm.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))),
                     erc.b,
                     dkf.ii.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))
                  ),
                  new eru(
                     new erj(dkf.fm.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))),
                     erc.b,
                     dkf.ii.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))
                  ),
                  new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.gP.m()),
                  new eru[]{new eru(new erw(dkf.cJ, 0.8F), erc.b, dkf.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.m, 0.8F), erc.b, dkf.cu.m()),
                  new eru(new esh(axk.q), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cw), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cx), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.oI), erc.b, dkf.oI.m().b(dks.c, Boolean.valueOf(false))),
                  new eru(new erw(dkf.m, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.Y, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.fm, 0.5F), erc.b, dkf.bz.m()),
                  new eru(
                     new erj(dkf.fm.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))),
                     erc.b,
                     dkf.ii.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true))
                  ),
                  new eru(
                     new erj(dkf.fm.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))),
                     erc.b,
                     dkf.ii.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true))
                  ),
                  new eru(new erw(dkf.cJ, 0.3F), erc.b, dkf.fr.m()),
                  new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.gQ.m()),
                  new eru[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new esh(axk.q), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cw), erc.b, dkf.a.m()),
                  new eru(new erh(dkf.cx), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.kr, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.be, 0.1F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.iY, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.nN, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.oa, 0.08F), erc.b, dkf.bz.m()),
                  new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.lf.m()),
                  new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.m, 0.1F), erc.b, dkf.cu.m())))));
      a($$0, g, ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.m, 0.2F), erc.b, dkf.cu.m())))));
      a($$0, h, ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.m, 0.7F), erc.b, dkf.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erh(dkf.lg), new erh(dkf.J), dkf.n.m()),
                  new eru(new erw(dkf.lg, 0.1F), erc.b, dkf.i.m()),
                  new eru(new erh(dkf.i), new erh(dkf.J), dkf.J.m()),
                  new eru(new erh(dkf.j), new erh(dkf.J), dkf.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erh(dkf.lg), new erh(dkf.J), dkf.r.m()),
                  new eru(new erw(dkf.lg, 0.2F), erc.b, dkf.i.m()),
                  new eru(new erh(dkf.i), new erh(dkf.J), dkf.J.m()),
                  new eru(new erh(dkf.j), new erh(dkf.J), dkf.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erh(dkf.lg), new erh(dkf.J), dkf.o.m()),
                  new eru(new erh(dkf.lg), new erh(dkf.eb), dkf.o.m()),
                  new eru(new erw(dkf.lg, 0.2F), erc.b, dkf.i.m()),
                  new eru(new erh(dkf.i), new erh(dkf.J), dkf.J.m()),
                  new eru(new erh(dkf.j), new erh(dkf.J), dkf.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.cJ, 0.3F), erc.b, dkf.gP.m()),
                  new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.gQ.m()),
                  new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.gP.m()), new eru(new erw(dkf.cJ, 0.8F), erc.b, dkf.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.cJ, 0.3F), erc.b, dkf.fr.m()), new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.cJ, 0.2F), erc.b, dkf.lf.m()), new eru(new erw(dkf.cJ, 0.1F), erc.b, dkf.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new eri(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ery(ImmutableList.of(new eru(new erw(dkf.ll, 0.75F), erc.b, dkf.pZ.m()), new eru(new erw(dkf.pZ, 0.15F), erc.b, dkf.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ery(ImmutableList.of(new eru(new erw(dkf.pY, 0.35F), erc.b, dkf.pZ.m()), new eru(new erw(dkf.qa, 0.1F), erc.b, dkf.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ery(ImmutableList.of(new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pZ.m()), new eru(new erw(dkf.pT, 1.0E-4F), erc.b, dkf.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ery(ImmutableList.of(new eru(new erw(dkf.qa, 0.5F), erc.b, dkf.a.m()), new eru(new erw(dkf.co, 0.1F), erc.b, dkf.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ery(ImmutableList.of(new eru(new erw(dkf.pY, 0.1F), erc.b, dkf.pZ.m()), new eru(new erw(dkf.pT, 1.0E-4F), erc.b, dkf.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pZ.m()),
                  new eru(new erw(dkf.pT, 1.0E-4F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.co, 0.3F), erc.b, dkf.pZ.m()),
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
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.pY, 0.4F), erc.b, dkf.pZ.m()),
                  new eru(new erw(dkf.pT, 0.01F), erc.b, dkf.pZ.m()),
                  new eru(new erw(dkf.pY, 1.0E-4F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.pT, 1.0E-4F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.co, 0.3F), erc.b, dkf.pZ.m()),
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
            new ery(ImmutableList.of(new eru(new erw(dkf.qa, 0.5F), erc.b, dkf.a.m()), new eru(new erw(dkf.co, 0.6F), erc.b, dkf.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ery(ImmutableList.of(new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pZ.m()), new eru(new erw(dkf.pT, 1.0E-4F), erc.b, dkf.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pZ.m()),
                  new eru(new erw(dkf.pY, 0.15F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pT.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.pY, 0.01F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.pY, 0.5F), erc.b, dkf.pZ.m()),
                  new eru(new erw(dkf.pY, 0.3F), erc.b, dkf.pT.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ery(
               ImmutableList.of(new eru(new erw(dkf.co, 0.3F), erc.b, dkf.pZ.m()), new eru(erc.b, erc.b, new erd(0.0F, 0.05F, 0, 100, jm.a.b), dkf.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eri(0.9F), new erv(axk.bQ)));
      a($$0, E, ImmutableList.of(new eri(0.1F), new erv(axk.bQ)));
      a($$0, F, ImmutableList.of(new eri(0.1F), new ery(ImmutableList.of(new eru(new erh(dkf.U), erc.b, dkf.cG.m()))), new erv(axk.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.ty, 0.3F), erc.b, dkf.tD.m()),
                  new eru(new erw(dkf.tu, 0.3F), erc.b, dkf.tE.m()),
                  new eru(new erw(dkf.oH, 0.05F), erc.b, dkf.a.m())
               )
            ),
            new erv(axk.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eri($$1.b(axk.bW), 0.95F),
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.ty, 0.3F), erc.b, dkf.tD.m()),
                  new eru(new erw(dkf.tu, 0.3F), erc.b, dkf.tE.m()),
                  new eru(new erw(dkf.oH, 0.05F), erc.b, dkf.a.m())
               )
            ),
            new erv(axk.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eri($$1.b(axk.bW), 0.95F),
            new ery(
               ImmutableList.of(
                  new eru(new erw(dkf.ty, 0.3F), erc.b, dkf.tD.m()),
                  new eru(new erw(dkf.tu, 0.3F), erc.b, dkf.tE.m()),
                  new eru(new erw(dkf.tw, 0.3F), erc.b, dkf.a.m()),
                  new eru(new erw(dkf.oH, 0.05F), erc.b, dkf.a.m())
               )
            ),
            new erv(axk.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ery(
               List.of(
                  new eru(new erw(dkf.O, 0.2F), erc.b, dkf.j.m()),
                  new eru(new erw(dkf.O, 0.1F), erc.b, dkf.k.m()),
                  new eru(new erw(dkf.fa, 0.1F), erc.b, dkf.eZ.m())
               )
            ),
            a(ewe.aZ, 6),
            a(ewe.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ery(
               List.of(
                  new eru(new erw(dkf.O, 0.2F), erc.b, dkf.j.m()),
                  new eru(new erw(dkf.O, 0.1F), erc.b, dkf.k.m()),
                  new eru(new erw(dkf.fa, 0.1F), erc.b, dkf.eZ.m())
               )
            ),
            a(ewe.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ewe.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new ery(
               List.of(
                  new eru(new erw(dkf.sQ, 0.1F), erc.b, dkf.sT.m().b(dlr.c, Boolean.valueOf(true))),
                  new eru(new erw(dkf.sQ, 0.33333334F), erc.b, dkf.sS.m().b(dlr.c, Boolean.valueOf(true))),
                  new eru(new erw(dkf.sQ, 0.5F), erc.b, dkf.sR.m().b(dlr.c, Boolean.valueOf(true)))
               )
            ),
            new erv(axk.bQ)
         )
      );
   }

   private static erk a(alo<ewn> $$0, int $$1) {
      return new erk(new ery(List.of(new eru(new esh(axk.cw), erc.b, err.b, dkf.P.m(), new esj($$0)))), bsc.a($$1));
   }
}
