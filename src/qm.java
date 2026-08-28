import com.google.common.collect.ImmutableList;
import java.util.List;

public class qm {
   private static final akt<erk> N = a("empty");
   public static final akt<erk> a = a("zombie_plains");
   public static final akt<erk> b = a("zombie_savanna");
   public static final akt<erk> c = a("zombie_snowy");
   public static final akt<erk> d = a("zombie_taiga");
   public static final akt<erk> e = a("zombie_desert");
   public static final akt<erk> f = a("mossify_10_percent");
   public static final akt<erk> g = a("mossify_20_percent");
   public static final akt<erk> h = a("mossify_70_percent");
   public static final akt<erk> i = a("street_plains");
   public static final akt<erk> j = a("street_savanna");
   public static final akt<erk> k = a("street_snowy_or_taiga");
   public static final akt<erk> l = a("farm_plains");
   public static final akt<erk> m = a("farm_savanna");
   public static final akt<erk> n = a("farm_snowy");
   public static final akt<erk> o = a("farm_taiga");
   public static final akt<erk> p = a("farm_desert");
   public static final akt<erk> q = a("outpost_rot");
   public static final akt<erk> r = a("bottom_rampart");
   public static final akt<erk> s = a("treasure_rooms");
   public static final akt<erk> t = a("housing");
   public static final akt<erk> u = a("side_wall_degradation");
   public static final akt<erk> v = a("stable_degradation");
   public static final akt<erk> w = a("bastion_generic_degradation");
   public static final akt<erk> x = a("rampart_degradation");
   public static final akt<erk> y = a("entrance_replacement");
   public static final akt<erk> z = a("bridge");
   public static final akt<erk> A = a("roof");
   public static final akt<erk> B = a("high_wall");
   public static final akt<erk> C = a("high_rampart");
   public static final akt<erk> D = a("fossil_rot");
   public static final akt<erk> E = a("fossil_coal");
   public static final akt<erk> F = a("fossil_diamonds");
   public static final akt<erk> G = a("ancient_city_start_degradation");
   public static final akt<erk> H = a("ancient_city_generic_degradation");
   public static final akt<erk> I = a("ancient_city_walls_degradation");
   public static final akt<erk> J = a("trail_ruins_houses_archaeology");
   public static final akt<erk> K = a("trail_ruins_roads_archaeology");
   public static final akt<erk> L = a("trail_ruins_tower_top_archaeology");
   public static final akt<erk> M = a("trial_chambers_copper_bulb_degradation");

   private static akt<erk> a(String $$0) {
      return akt.a(mc.aV, aku.b($$0));
   }

   private static void a(qe<erk> $$0, akt<erk> $$1, List<erj> $$2) {
      $$0.a($$1, new erk($$2));
   }

   public static void a(qe<erk> $$0) {
      js<djk> $$1 = $$0.a(mc.f);
      erb $$2 = new erb(new erd(djm.pT, 0.01F), eqj.b, djm.qe.m());
      erb $$3 = new erb(new erd(djm.qe, 0.5F), eqj.b, djm.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.m, 0.8F), eqj.b, djm.cu.m()),
                  new erb(new ero(awo.q), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cw), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cx), eqj.b, djm.a.m()),
                  new erb(new erd(djm.m, 0.07F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.cu, 0.07F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.hG, 0.07F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.X, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.n, 0.1F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.cC, 0.1F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.aq, 0.02F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.fm, 0.5F), eqj.b, djm.bz.m()),
                  new erb[]{
                     new erb(
                        new eqq(djm.fm.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))),
                        eqj.b,
                        djm.ii.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))
                     ),
                     new erb(
                        new eqq(djm.fm.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))),
                        eqj.b,
                        djm.ii.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))
                     ),
                     new erb(new erd(djm.cJ, 0.3F), eqj.b, djm.gP.m()),
                     new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.gQ.m()),
                     new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new ero(awo.q), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cw), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cx), eqj.b, djm.a.m()),
                  new erb(new erd(djm.r, 0.2F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.im, 0.2F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.ab, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.ax, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.hH, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.hK, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.hU, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.fm, 0.5F), eqj.b, djm.bz.m()),
                  new erb(
                     new eqq(djm.fm.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))),
                     eqj.b,
                     djm.ii.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))
                  ),
                  new erb[]{
                     new erb(
                        new eqq(djm.fm.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))),
                        eqj.b,
                        djm.ii.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))
                     ),
                     new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new ero(awo.q), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cw), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cx), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.oG), eqj.b, djm.a.m()),
                  new erb(new erd(djm.o, 0.2F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.jS, 0.4F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.aj, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.aC, 0.05F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.fm, 0.5F), eqj.b, djm.bz.m()),
                  new erb(
                     new eqq(djm.fm.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))),
                     eqj.b,
                     djm.ii.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))
                  ),
                  new erb(
                     new eqq(djm.fm.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))),
                     eqj.b,
                     djm.ii.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))
                  ),
                  new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.gP.m()),
                  new erb[]{new erb(new erd(djm.cJ, 0.8F), eqj.b, djm.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.m, 0.8F), eqj.b, djm.cu.m()),
                  new erb(new ero(awo.q), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cw), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cx), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.oI), eqj.b, djm.oI.m().b(djz.c, Boolean.valueOf(false))),
                  new erb(new erd(djm.m, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.Y, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.fm, 0.5F), eqj.b, djm.bz.m()),
                  new erb(
                     new eqq(djm.fm.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))),
                     eqj.b,
                     djm.ii.m().b(dnn.a, Boolean.valueOf(true)).b(dnn.c, Boolean.valueOf(true))
                  ),
                  new erb(
                     new eqq(djm.fm.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))),
                     eqj.b,
                     djm.ii.m().b(dnn.b, Boolean.valueOf(true)).b(dnn.d, Boolean.valueOf(true))
                  ),
                  new erb(new erd(djm.cJ, 0.3F), eqj.b, djm.fr.m()),
                  new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.gQ.m()),
                  new erb[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new ero(awo.q), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cw), eqj.b, djm.a.m()),
                  new erb(new eqo(djm.cx), eqj.b, djm.a.m()),
                  new erb(new erd(djm.kr, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.be, 0.1F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.iY, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.nN, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.oa, 0.08F), eqj.b, djm.bz.m()),
                  new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.lf.m()),
                  new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.m, 0.1F), eqj.b, djm.cu.m())))));
      a($$0, g, ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.m, 0.2F), eqj.b, djm.cu.m())))));
      a($$0, h, ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.m, 0.7F), eqj.b, djm.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new eqo(djm.lg), new eqo(djm.J), djm.n.m()),
                  new erb(new erd(djm.lg, 0.1F), eqj.b, djm.i.m()),
                  new erb(new eqo(djm.i), new eqo(djm.J), djm.J.m()),
                  new erb(new eqo(djm.j), new eqo(djm.J), djm.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new eqo(djm.lg), new eqo(djm.J), djm.r.m()),
                  new erb(new erd(djm.lg, 0.2F), eqj.b, djm.i.m()),
                  new erb(new eqo(djm.i), new eqo(djm.J), djm.J.m()),
                  new erb(new eqo(djm.j), new eqo(djm.J), djm.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new eqo(djm.lg), new eqo(djm.J), djm.o.m()),
                  new erb(new eqo(djm.lg), new eqo(djm.eb), djm.o.m()),
                  new erb(new erd(djm.lg, 0.2F), eqj.b, djm.i.m()),
                  new erb(new eqo(djm.i), new eqo(djm.J), djm.J.m()),
                  new erb(new eqo(djm.j), new eqo(djm.J), djm.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.cJ, 0.3F), eqj.b, djm.gP.m()),
                  new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.gQ.m()),
                  new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.gP.m()), new erb(new erd(djm.cJ, 0.8F), eqj.b, djm.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.cJ, 0.3F), eqj.b, djm.fr.m()), new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.cJ, 0.2F), eqj.b, djm.lf.m()), new erb(new erd(djm.cJ, 0.1F), eqj.b, djm.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new eqp(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new erf(ImmutableList.of(new erb(new erd(djm.ll, 0.75F), eqj.b, djm.pZ.m()), new erb(new erd(djm.pZ, 0.15F), eqj.b, djm.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new erf(ImmutableList.of(new erb(new erd(djm.pY, 0.35F), eqj.b, djm.pZ.m()), new erb(new erd(djm.qa, 0.1F), eqj.b, djm.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new erf(ImmutableList.of(new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pZ.m()), new erb(new erd(djm.pT, 1.0E-4F), eqj.b, djm.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new erf(ImmutableList.of(new erb(new erd(djm.qa, 0.5F), eqj.b, djm.a.m()), new erb(new erd(djm.co, 0.1F), eqj.b, djm.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new erf(ImmutableList.of(new erb(new erd(djm.pY, 0.1F), eqj.b, djm.pZ.m()), new erb(new erd(djm.pT, 1.0E-4F), eqj.b, djm.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pZ.m()),
                  new erb(new erd(djm.pT, 1.0E-4F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.co, 0.3F), eqj.b, djm.pZ.m()),
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
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.pY, 0.4F), eqj.b, djm.pZ.m()),
                  new erb(new erd(djm.pT, 0.01F), eqj.b, djm.pZ.m()),
                  new erb(new erd(djm.pY, 1.0E-4F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.pT, 1.0E-4F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.co, 0.3F), eqj.b, djm.pZ.m()),
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
            new erf(ImmutableList.of(new erb(new erd(djm.qa, 0.5F), eqj.b, djm.a.m()), new erb(new erd(djm.co, 0.6F), eqj.b, djm.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new erf(ImmutableList.of(new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pZ.m()), new erb(new erd(djm.pT, 1.0E-4F), eqj.b, djm.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pZ.m()),
                  new erb(new erd(djm.pY, 0.15F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pT.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.pY, 0.01F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.pY, 0.5F), eqj.b, djm.pZ.m()),
                  new erb(new erd(djm.pY, 0.3F), eqj.b, djm.pT.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new erf(
               ImmutableList.of(new erb(new erd(djm.co, 0.3F), eqj.b, djm.pZ.m()), new erb(eqj.b, eqj.b, new eqk(0.0F, 0.05F, 0, 100, jn.a.b), djm.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eqp(0.9F), new erc(awo.bQ)));
      a($$0, E, ImmutableList.of(new eqp(0.1F), new erc(awo.bQ)));
      a($$0, F, ImmutableList.of(new eqp(0.1F), new erf(ImmutableList.of(new erb(new eqo(djm.U), eqj.b, djm.cG.m()))), new erc(awo.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.ty, 0.3F), eqj.b, djm.tD.m()),
                  new erb(new erd(djm.tu, 0.3F), eqj.b, djm.tE.m()),
                  new erb(new erd(djm.oH, 0.05F), eqj.b, djm.a.m())
               )
            ),
            new erc(awo.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eqp($$1.b(awo.bW), 0.95F),
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.ty, 0.3F), eqj.b, djm.tD.m()),
                  new erb(new erd(djm.tu, 0.3F), eqj.b, djm.tE.m()),
                  new erb(new erd(djm.oH, 0.05F), eqj.b, djm.a.m())
               )
            ),
            new erc(awo.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eqp($$1.b(awo.bW), 0.95F),
            new erf(
               ImmutableList.of(
                  new erb(new erd(djm.ty, 0.3F), eqj.b, djm.tD.m()),
                  new erb(new erd(djm.tu, 0.3F), eqj.b, djm.tE.m()),
                  new erb(new erd(djm.tw, 0.3F), eqj.b, djm.a.m()),
                  new erb(new erd(djm.oH, 0.05F), eqj.b, djm.a.m())
               )
            ),
            new erc(awo.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new erf(
               List.of(
                  new erb(new erd(djm.O, 0.2F), eqj.b, djm.j.m()),
                  new erb(new erd(djm.O, 0.1F), eqj.b, djm.k.m()),
                  new erb(new erd(djm.fa, 0.1F), eqj.b, djm.eZ.m())
               )
            ),
            a(evl.aZ, 6),
            a(evl.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new erf(
               List.of(
                  new erb(new erd(djm.O, 0.2F), eqj.b, djm.j.m()),
                  new erb(new erd(djm.O, 0.1F), eqj.b, djm.k.m()),
                  new erb(new erd(djm.fa, 0.1F), eqj.b, djm.eZ.m())
               )
            ),
            a(evl.aZ, 2)
         )
      );
      a($$0, L, List.of(a(evl.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new erf(
               List.of(
                  new erb(new erd(djm.sQ, 0.1F), eqj.b, djm.sT.m().b(dky.c, Boolean.valueOf(true))),
                  new erb(new erd(djm.sQ, 0.33333334F), eqj.b, djm.sS.m().b(dky.c, Boolean.valueOf(true))),
                  new erb(new erd(djm.sQ, 0.5F), eqj.b, djm.sR.m().b(dky.c, Boolean.valueOf(true)))
               )
            ),
            new erc(awo.bQ)
         )
      );
   }

   private static eqr a(akt<evu> $$0, int $$1) {
      return new eqr(new erf(List.of(new erb(new ero(awo.cw), eqj.b, eqy.b, djm.P.m(), new erq($$0)))), brk.a($$1));
   }
}
