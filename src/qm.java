import com.google.common.collect.ImmutableList;
import java.util.List;

public class qm {
   private static final akt<erm> N = a("empty");
   public static final akt<erm> a = a("zombie_plains");
   public static final akt<erm> b = a("zombie_savanna");
   public static final akt<erm> c = a("zombie_snowy");
   public static final akt<erm> d = a("zombie_taiga");
   public static final akt<erm> e = a("zombie_desert");
   public static final akt<erm> f = a("mossify_10_percent");
   public static final akt<erm> g = a("mossify_20_percent");
   public static final akt<erm> h = a("mossify_70_percent");
   public static final akt<erm> i = a("street_plains");
   public static final akt<erm> j = a("street_savanna");
   public static final akt<erm> k = a("street_snowy_or_taiga");
   public static final akt<erm> l = a("farm_plains");
   public static final akt<erm> m = a("farm_savanna");
   public static final akt<erm> n = a("farm_snowy");
   public static final akt<erm> o = a("farm_taiga");
   public static final akt<erm> p = a("farm_desert");
   public static final akt<erm> q = a("outpost_rot");
   public static final akt<erm> r = a("bottom_rampart");
   public static final akt<erm> s = a("treasure_rooms");
   public static final akt<erm> t = a("housing");
   public static final akt<erm> u = a("side_wall_degradation");
   public static final akt<erm> v = a("stable_degradation");
   public static final akt<erm> w = a("bastion_generic_degradation");
   public static final akt<erm> x = a("rampart_degradation");
   public static final akt<erm> y = a("entrance_replacement");
   public static final akt<erm> z = a("bridge");
   public static final akt<erm> A = a("roof");
   public static final akt<erm> B = a("high_wall");
   public static final akt<erm> C = a("high_rampart");
   public static final akt<erm> D = a("fossil_rot");
   public static final akt<erm> E = a("fossil_coal");
   public static final akt<erm> F = a("fossil_diamonds");
   public static final akt<erm> G = a("ancient_city_start_degradation");
   public static final akt<erm> H = a("ancient_city_generic_degradation");
   public static final akt<erm> I = a("ancient_city_walls_degradation");
   public static final akt<erm> J = a("trail_ruins_houses_archaeology");
   public static final akt<erm> K = a("trail_ruins_roads_archaeology");
   public static final akt<erm> L = a("trail_ruins_tower_top_archaeology");
   public static final akt<erm> M = a("trial_chambers_copper_bulb_degradation");

   private static akt<erm> a(String $$0) {
      return akt.a(mc.aV, aku.b($$0));
   }

   private static void a(qe<erm> $$0, akt<erm> $$1, List<erl> $$2) {
      $$0.a($$1, new erm($$2));
   }

   public static void a(qe<erm> $$0) {
      js<djm> $$1 = $$0.a(mc.f);
      erd $$2 = new erd(new erf(djo.pT, 0.01F), eql.b, djo.qe.m());
      erd $$3 = new erd(new erf(djo.qe, 0.5F), eql.b, djo.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.m, 0.8F), eql.b, djo.cu.m()),
                  new erd(new erq(awp.q), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cw), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cx), eql.b, djo.a.m()),
                  new erd(new erf(djo.m, 0.07F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.cu, 0.07F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.hG, 0.07F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.X, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.n, 0.1F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.cC, 0.1F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.aq, 0.02F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.fm, 0.5F), eql.b, djo.bz.m()),
                  new erd[]{
                     new erd(
                        new eqs(djo.fm.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))),
                        eql.b,
                        djo.ii.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))
                     ),
                     new erd(
                        new eqs(djo.fm.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))),
                        eql.b,
                        djo.ii.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))
                     ),
                     new erd(new erf(djo.cJ, 0.3F), eql.b, djo.gP.m()),
                     new erd(new erf(djo.cJ, 0.2F), eql.b, djo.gQ.m()),
                     new erd(new erf(djo.cJ, 0.1F), eql.b, djo.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erq(awp.q), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cw), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cx), eql.b, djo.a.m()),
                  new erd(new erf(djo.r, 0.2F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.im, 0.2F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.ab, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.ax, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.hH, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.hK, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.hU, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.fm, 0.5F), eql.b, djo.bz.m()),
                  new erd(
                     new eqs(djo.fm.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))),
                     eql.b,
                     djo.ii.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))
                  ),
                  new erd[]{
                     new erd(
                        new eqs(djo.fm.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))),
                        eql.b,
                        djo.ii.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))
                     ),
                     new erd(new erf(djo.cJ, 0.1F), eql.b, djo.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erq(awp.q), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cw), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cx), eql.b, djo.a.m()),
                  new erd(new eqq(djo.oG), eql.b, djo.a.m()),
                  new erd(new erf(djo.o, 0.2F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.jS, 0.4F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.aj, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.aC, 0.05F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.fm, 0.5F), eql.b, djo.bz.m()),
                  new erd(
                     new eqs(djo.fm.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))),
                     eql.b,
                     djo.ii.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))
                  ),
                  new erd(
                     new eqs(djo.fm.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))),
                     eql.b,
                     djo.ii.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))
                  ),
                  new erd(new erf(djo.cJ, 0.1F), eql.b, djo.gP.m()),
                  new erd[]{new erd(new erf(djo.cJ, 0.8F), eql.b, djo.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.m, 0.8F), eql.b, djo.cu.m()),
                  new erd(new erq(awp.q), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cw), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cx), eql.b, djo.a.m()),
                  new erd(new eqq(djo.oI), eql.b, djo.oI.m().b(dkb.c, Boolean.valueOf(false))),
                  new erd(new erf(djo.m, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.Y, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.fm, 0.5F), eql.b, djo.bz.m()),
                  new erd(
                     new eqs(djo.fm.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))),
                     eql.b,
                     djo.ii.m().b(dnp.a, Boolean.valueOf(true)).b(dnp.c, Boolean.valueOf(true))
                  ),
                  new erd(
                     new eqs(djo.fm.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))),
                     eql.b,
                     djo.ii.m().b(dnp.b, Boolean.valueOf(true)).b(dnp.d, Boolean.valueOf(true))
                  ),
                  new erd(new erf(djo.cJ, 0.3F), eql.b, djo.fr.m()),
                  new erd(new erf(djo.cJ, 0.2F), eql.b, djo.gQ.m()),
                  new erd[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erq(awp.q), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cw), eql.b, djo.a.m()),
                  new erd(new eqq(djo.cx), eql.b, djo.a.m()),
                  new erd(new erf(djo.kr, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.be, 0.1F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.iY, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.nN, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.oa, 0.08F), eql.b, djo.bz.m()),
                  new erd(new erf(djo.cJ, 0.2F), eql.b, djo.lf.m()),
                  new erd(new erf(djo.cJ, 0.1F), eql.b, djo.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.m, 0.1F), eql.b, djo.cu.m())))));
      a($$0, g, ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.m, 0.2F), eql.b, djo.cu.m())))));
      a($$0, h, ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.m, 0.7F), eql.b, djo.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new eqq(djo.lg), new eqq(djo.J), djo.n.m()),
                  new erd(new erf(djo.lg, 0.1F), eql.b, djo.i.m()),
                  new erd(new eqq(djo.i), new eqq(djo.J), djo.J.m()),
                  new erd(new eqq(djo.j), new eqq(djo.J), djo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new eqq(djo.lg), new eqq(djo.J), djo.r.m()),
                  new erd(new erf(djo.lg, 0.2F), eql.b, djo.i.m()),
                  new erd(new eqq(djo.i), new eqq(djo.J), djo.J.m()),
                  new erd(new eqq(djo.j), new eqq(djo.J), djo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new eqq(djo.lg), new eqq(djo.J), djo.o.m()),
                  new erd(new eqq(djo.lg), new eqq(djo.eb), djo.o.m()),
                  new erd(new erf(djo.lg, 0.2F), eql.b, djo.i.m()),
                  new erd(new eqq(djo.i), new eqq(djo.J), djo.J.m()),
                  new erd(new eqq(djo.j), new eqq(djo.J), djo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.cJ, 0.3F), eql.b, djo.gP.m()),
                  new erd(new erf(djo.cJ, 0.2F), eql.b, djo.gQ.m()),
                  new erd(new erf(djo.cJ, 0.1F), eql.b, djo.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.cJ, 0.1F), eql.b, djo.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.cJ, 0.1F), eql.b, djo.gP.m()), new erd(new erf(djo.cJ, 0.8F), eql.b, djo.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.cJ, 0.3F), eql.b, djo.fr.m()), new erd(new erf(djo.cJ, 0.2F), eql.b, djo.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.cJ, 0.2F), eql.b, djo.lf.m()), new erd(new erf(djo.cJ, 0.1F), eql.b, djo.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new eqr(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new erh(ImmutableList.of(new erd(new erf(djo.ll, 0.75F), eql.b, djo.pZ.m()), new erd(new erf(djo.pZ, 0.15F), eql.b, djo.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new erh(ImmutableList.of(new erd(new erf(djo.pY, 0.35F), eql.b, djo.pZ.m()), new erd(new erf(djo.qa, 0.1F), eql.b, djo.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new erh(ImmutableList.of(new erd(new erf(djo.pY, 0.3F), eql.b, djo.pZ.m()), new erd(new erf(djo.pT, 1.0E-4F), eql.b, djo.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new erh(ImmutableList.of(new erd(new erf(djo.qa, 0.5F), eql.b, djo.a.m()), new erd(new erf(djo.co, 0.1F), eql.b, djo.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new erh(ImmutableList.of(new erd(new erf(djo.pY, 0.1F), eql.b, djo.pZ.m()), new erd(new erf(djo.pT, 1.0E-4F), eql.b, djo.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.pY, 0.3F), eql.b, djo.pZ.m()),
                  new erd(new erf(djo.pT, 1.0E-4F), eql.b, djo.a.m()),
                  new erd(new erf(djo.co, 0.3F), eql.b, djo.pZ.m()),
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
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.pY, 0.4F), eql.b, djo.pZ.m()),
                  new erd(new erf(djo.pT, 0.01F), eql.b, djo.pZ.m()),
                  new erd(new erf(djo.pY, 1.0E-4F), eql.b, djo.a.m()),
                  new erd(new erf(djo.pT, 1.0E-4F), eql.b, djo.a.m()),
                  new erd(new erf(djo.co, 0.3F), eql.b, djo.pZ.m()),
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
            new erh(ImmutableList.of(new erd(new erf(djo.qa, 0.5F), eql.b, djo.a.m()), new erd(new erf(djo.co, 0.6F), eql.b, djo.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new erh(ImmutableList.of(new erd(new erf(djo.pY, 0.3F), eql.b, djo.pZ.m()), new erd(new erf(djo.pT, 1.0E-4F), eql.b, djo.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.pY, 0.3F), eql.b, djo.pZ.m()),
                  new erd(new erf(djo.pY, 0.15F), eql.b, djo.a.m()),
                  new erd(new erf(djo.pY, 0.3F), eql.b, djo.pT.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.pY, 0.01F), eql.b, djo.a.m()),
                  new erd(new erf(djo.pY, 0.5F), eql.b, djo.pZ.m()),
                  new erd(new erf(djo.pY, 0.3F), eql.b, djo.pT.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new erh(
               ImmutableList.of(new erd(new erf(djo.co, 0.3F), eql.b, djo.pZ.m()), new erd(eql.b, eql.b, new eqm(0.0F, 0.05F, 0, 100, jn.a.b), djo.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eqr(0.9F), new ere(awp.bQ)));
      a($$0, E, ImmutableList.of(new eqr(0.1F), new ere(awp.bQ)));
      a($$0, F, ImmutableList.of(new eqr(0.1F), new erh(ImmutableList.of(new erd(new eqq(djo.U), eql.b, djo.cG.m()))), new ere(awp.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.ty, 0.3F), eql.b, djo.tD.m()),
                  new erd(new erf(djo.tu, 0.3F), eql.b, djo.tE.m()),
                  new erd(new erf(djo.oH, 0.05F), eql.b, djo.a.m())
               )
            ),
            new ere(awp.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eqr($$1.b(awp.bW), 0.95F),
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.ty, 0.3F), eql.b, djo.tD.m()),
                  new erd(new erf(djo.tu, 0.3F), eql.b, djo.tE.m()),
                  new erd(new erf(djo.oH, 0.05F), eql.b, djo.a.m())
               )
            ),
            new ere(awp.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eqr($$1.b(awp.bW), 0.95F),
            new erh(
               ImmutableList.of(
                  new erd(new erf(djo.ty, 0.3F), eql.b, djo.tD.m()),
                  new erd(new erf(djo.tu, 0.3F), eql.b, djo.tE.m()),
                  new erd(new erf(djo.tw, 0.3F), eql.b, djo.a.m()),
                  new erd(new erf(djo.oH, 0.05F), eql.b, djo.a.m())
               )
            ),
            new ere(awp.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new erh(
               List.of(
                  new erd(new erf(djo.O, 0.2F), eql.b, djo.j.m()),
                  new erd(new erf(djo.O, 0.1F), eql.b, djo.k.m()),
                  new erd(new erf(djo.fa, 0.1F), eql.b, djo.eZ.m())
               )
            ),
            a(evn.aZ, 6),
            a(evn.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new erh(
               List.of(
                  new erd(new erf(djo.O, 0.2F), eql.b, djo.j.m()),
                  new erd(new erf(djo.O, 0.1F), eql.b, djo.k.m()),
                  new erd(new erf(djo.fa, 0.1F), eql.b, djo.eZ.m())
               )
            ),
            a(evn.aZ, 2)
         )
      );
      a($$0, L, List.of(a(evn.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new erh(
               List.of(
                  new erd(new erf(djo.sQ, 0.1F), eql.b, djo.sT.m().b(dla.c, Boolean.valueOf(true))),
                  new erd(new erf(djo.sQ, 0.33333334F), eql.b, djo.sS.m().b(dla.c, Boolean.valueOf(true))),
                  new erd(new erf(djo.sQ, 0.5F), eql.b, djo.sR.m().b(dla.c, Boolean.valueOf(true)))
               )
            ),
            new ere(awp.bQ)
         )
      );
   }

   private static eqt a(akt<evw> $$0, int $$1) {
      return new eqt(new erh(List.of(new erd(new erq(awp.cw), eql.b, era.b, djo.P.m(), new ers($$0)))), brl.a($$1));
   }
}
