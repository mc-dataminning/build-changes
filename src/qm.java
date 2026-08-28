import com.google.common.collect.ImmutableList;
import java.util.List;

public class qm {
   private static final aku<ern> N = a("empty");
   public static final aku<ern> a = a("zombie_plains");
   public static final aku<ern> b = a("zombie_savanna");
   public static final aku<ern> c = a("zombie_snowy");
   public static final aku<ern> d = a("zombie_taiga");
   public static final aku<ern> e = a("zombie_desert");
   public static final aku<ern> f = a("mossify_10_percent");
   public static final aku<ern> g = a("mossify_20_percent");
   public static final aku<ern> h = a("mossify_70_percent");
   public static final aku<ern> i = a("street_plains");
   public static final aku<ern> j = a("street_savanna");
   public static final aku<ern> k = a("street_snowy_or_taiga");
   public static final aku<ern> l = a("farm_plains");
   public static final aku<ern> m = a("farm_savanna");
   public static final aku<ern> n = a("farm_snowy");
   public static final aku<ern> o = a("farm_taiga");
   public static final aku<ern> p = a("farm_desert");
   public static final aku<ern> q = a("outpost_rot");
   public static final aku<ern> r = a("bottom_rampart");
   public static final aku<ern> s = a("treasure_rooms");
   public static final aku<ern> t = a("housing");
   public static final aku<ern> u = a("side_wall_degradation");
   public static final aku<ern> v = a("stable_degradation");
   public static final aku<ern> w = a("bastion_generic_degradation");
   public static final aku<ern> x = a("rampart_degradation");
   public static final aku<ern> y = a("entrance_replacement");
   public static final aku<ern> z = a("bridge");
   public static final aku<ern> A = a("roof");
   public static final aku<ern> B = a("high_wall");
   public static final aku<ern> C = a("high_rampart");
   public static final aku<ern> D = a("fossil_rot");
   public static final aku<ern> E = a("fossil_coal");
   public static final aku<ern> F = a("fossil_diamonds");
   public static final aku<ern> G = a("ancient_city_start_degradation");
   public static final aku<ern> H = a("ancient_city_generic_degradation");
   public static final aku<ern> I = a("ancient_city_walls_degradation");
   public static final aku<ern> J = a("trail_ruins_houses_archaeology");
   public static final aku<ern> K = a("trail_ruins_roads_archaeology");
   public static final aku<ern> L = a("trail_ruins_tower_top_archaeology");
   public static final aku<ern> M = a("trial_chambers_copper_bulb_degradation");

   private static aku<ern> a(String $$0) {
      return aku.a(mc.aV, akv.b($$0));
   }

   private static void a(qe<ern> $$0, aku<ern> $$1, List<erm> $$2) {
      $$0.a($$1, new ern($$2));
   }

   public static void a(qe<ern> $$0) {
      js<djn> $$1 = $$0.a(mc.f);
      ere $$2 = new ere(new erg(djp.pT, 0.01F), eqm.b, djp.qe.m());
      ere $$3 = new ere(new erg(djp.qe, 0.5F), eqm.b, djp.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.m, 0.8F), eqm.b, djp.cu.m()),
                  new ere(new err(awp.q), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cw), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cx), eqm.b, djp.a.m()),
                  new ere(new erg(djp.m, 0.07F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.cu, 0.07F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.hG, 0.07F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.X, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.n, 0.1F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.cC, 0.1F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.aq, 0.02F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.fm, 0.5F), eqm.b, djp.bz.m()),
                  new ere[]{
                     new ere(
                        new eqt(djp.fm.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))),
                        eqm.b,
                        djp.ii.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))
                     ),
                     new ere(
                        new eqt(djp.fm.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))),
                        eqm.b,
                        djp.ii.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))
                     ),
                     new ere(new erg(djp.cJ, 0.3F), eqm.b, djp.gP.m()),
                     new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.gQ.m()),
                     new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new err(awp.q), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cw), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cx), eqm.b, djp.a.m()),
                  new ere(new erg(djp.r, 0.2F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.im, 0.2F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.ab, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.ax, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.hH, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.hK, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.hU, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.fm, 0.5F), eqm.b, djp.bz.m()),
                  new ere(
                     new eqt(djp.fm.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))),
                     eqm.b,
                     djp.ii.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))
                  ),
                  new ere[]{
                     new ere(
                        new eqt(djp.fm.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))),
                        eqm.b,
                        djp.ii.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))
                     ),
                     new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new err(awp.q), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cw), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cx), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.oG), eqm.b, djp.a.m()),
                  new ere(new erg(djp.o, 0.2F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.jS, 0.4F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.aj, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.aC, 0.05F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.fm, 0.5F), eqm.b, djp.bz.m()),
                  new ere(
                     new eqt(djp.fm.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))),
                     eqm.b,
                     djp.ii.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))
                  ),
                  new ere(
                     new eqt(djp.fm.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))),
                     eqm.b,
                     djp.ii.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))
                  ),
                  new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.gP.m()),
                  new ere[]{new ere(new erg(djp.cJ, 0.8F), eqm.b, djp.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.m, 0.8F), eqm.b, djp.cu.m()),
                  new ere(new err(awp.q), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cw), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cx), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.oI), eqm.b, djp.oI.m().b(dkc.c, Boolean.valueOf(false))),
                  new ere(new erg(djp.m, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.Y, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.fm, 0.5F), eqm.b, djp.bz.m()),
                  new ere(
                     new eqt(djp.fm.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))),
                     eqm.b,
                     djp.ii.m().b(dnq.a, Boolean.valueOf(true)).b(dnq.c, Boolean.valueOf(true))
                  ),
                  new ere(
                     new eqt(djp.fm.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))),
                     eqm.b,
                     djp.ii.m().b(dnq.b, Boolean.valueOf(true)).b(dnq.d, Boolean.valueOf(true))
                  ),
                  new ere(new erg(djp.cJ, 0.3F), eqm.b, djp.fr.m()),
                  new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.gQ.m()),
                  new ere[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new err(awp.q), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cw), eqm.b, djp.a.m()),
                  new ere(new eqr(djp.cx), eqm.b, djp.a.m()),
                  new ere(new erg(djp.kr, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.be, 0.1F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.iY, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.nN, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.oa, 0.08F), eqm.b, djp.bz.m()),
                  new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.lf.m()),
                  new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.m, 0.1F), eqm.b, djp.cu.m())))));
      a($$0, g, ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.m, 0.2F), eqm.b, djp.cu.m())))));
      a($$0, h, ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.m, 0.7F), eqm.b, djp.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new eqr(djp.lg), new eqr(djp.J), djp.n.m()),
                  new ere(new erg(djp.lg, 0.1F), eqm.b, djp.i.m()),
                  new ere(new eqr(djp.i), new eqr(djp.J), djp.J.m()),
                  new ere(new eqr(djp.j), new eqr(djp.J), djp.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new eqr(djp.lg), new eqr(djp.J), djp.r.m()),
                  new ere(new erg(djp.lg, 0.2F), eqm.b, djp.i.m()),
                  new ere(new eqr(djp.i), new eqr(djp.J), djp.J.m()),
                  new ere(new eqr(djp.j), new eqr(djp.J), djp.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new eqr(djp.lg), new eqr(djp.J), djp.o.m()),
                  new ere(new eqr(djp.lg), new eqr(djp.eb), djp.o.m()),
                  new ere(new erg(djp.lg, 0.2F), eqm.b, djp.i.m()),
                  new ere(new eqr(djp.i), new eqr(djp.J), djp.J.m()),
                  new ere(new eqr(djp.j), new eqr(djp.J), djp.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.cJ, 0.3F), eqm.b, djp.gP.m()),
                  new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.gQ.m()),
                  new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.gP.m()), new ere(new erg(djp.cJ, 0.8F), eqm.b, djp.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.cJ, 0.3F), eqm.b, djp.fr.m()), new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.cJ, 0.2F), eqm.b, djp.lf.m()), new ere(new erg(djp.cJ, 0.1F), eqm.b, djp.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new eqs(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eri(ImmutableList.of(new ere(new erg(djp.ll, 0.75F), eqm.b, djp.pZ.m()), new ere(new erg(djp.pZ, 0.15F), eqm.b, djp.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eri(ImmutableList.of(new ere(new erg(djp.pY, 0.35F), eqm.b, djp.pZ.m()), new ere(new erg(djp.qa, 0.1F), eqm.b, djp.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eri(ImmutableList.of(new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pZ.m()), new ere(new erg(djp.pT, 1.0E-4F), eqm.b, djp.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eri(ImmutableList.of(new ere(new erg(djp.qa, 0.5F), eqm.b, djp.a.m()), new ere(new erg(djp.co, 0.1F), eqm.b, djp.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eri(ImmutableList.of(new ere(new erg(djp.pY, 0.1F), eqm.b, djp.pZ.m()), new ere(new erg(djp.pT, 1.0E-4F), eqm.b, djp.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pZ.m()),
                  new ere(new erg(djp.pT, 1.0E-4F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.co, 0.3F), eqm.b, djp.pZ.m()),
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
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.pY, 0.4F), eqm.b, djp.pZ.m()),
                  new ere(new erg(djp.pT, 0.01F), eqm.b, djp.pZ.m()),
                  new ere(new erg(djp.pY, 1.0E-4F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.pT, 1.0E-4F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.co, 0.3F), eqm.b, djp.pZ.m()),
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
            new eri(ImmutableList.of(new ere(new erg(djp.qa, 0.5F), eqm.b, djp.a.m()), new ere(new erg(djp.co, 0.6F), eqm.b, djp.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eri(ImmutableList.of(new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pZ.m()), new ere(new erg(djp.pT, 1.0E-4F), eqm.b, djp.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pZ.m()),
                  new ere(new erg(djp.pY, 0.15F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pT.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.pY, 0.01F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.pY, 0.5F), eqm.b, djp.pZ.m()),
                  new ere(new erg(djp.pY, 0.3F), eqm.b, djp.pT.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eri(
               ImmutableList.of(new ere(new erg(djp.co, 0.3F), eqm.b, djp.pZ.m()), new ere(eqm.b, eqm.b, new eqn(0.0F, 0.05F, 0, 100, jn.a.b), djp.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eqs(0.9F), new erf(awp.bQ)));
      a($$0, E, ImmutableList.of(new eqs(0.1F), new erf(awp.bQ)));
      a($$0, F, ImmutableList.of(new eqs(0.1F), new eri(ImmutableList.of(new ere(new eqr(djp.U), eqm.b, djp.cG.m()))), new erf(awp.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.ty, 0.3F), eqm.b, djp.tD.m()),
                  new ere(new erg(djp.tu, 0.3F), eqm.b, djp.tE.m()),
                  new ere(new erg(djp.oH, 0.05F), eqm.b, djp.a.m())
               )
            ),
            new erf(awp.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eqs($$1.b(awp.bW), 0.95F),
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.ty, 0.3F), eqm.b, djp.tD.m()),
                  new ere(new erg(djp.tu, 0.3F), eqm.b, djp.tE.m()),
                  new ere(new erg(djp.oH, 0.05F), eqm.b, djp.a.m())
               )
            ),
            new erf(awp.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eqs($$1.b(awp.bW), 0.95F),
            new eri(
               ImmutableList.of(
                  new ere(new erg(djp.ty, 0.3F), eqm.b, djp.tD.m()),
                  new ere(new erg(djp.tu, 0.3F), eqm.b, djp.tE.m()),
                  new ere(new erg(djp.tw, 0.3F), eqm.b, djp.a.m()),
                  new ere(new erg(djp.oH, 0.05F), eqm.b, djp.a.m())
               )
            ),
            new erf(awp.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eri(
               List.of(
                  new ere(new erg(djp.O, 0.2F), eqm.b, djp.j.m()),
                  new ere(new erg(djp.O, 0.1F), eqm.b, djp.k.m()),
                  new ere(new erg(djp.fa, 0.1F), eqm.b, djp.eZ.m())
               )
            ),
            a(evo.aZ, 6),
            a(evo.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eri(
               List.of(
                  new ere(new erg(djp.O, 0.2F), eqm.b, djp.j.m()),
                  new ere(new erg(djp.O, 0.1F), eqm.b, djp.k.m()),
                  new ere(new erg(djp.fa, 0.1F), eqm.b, djp.eZ.m())
               )
            ),
            a(evo.aZ, 2)
         )
      );
      a($$0, L, List.of(a(evo.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new eri(
               List.of(
                  new ere(new erg(djp.sQ, 0.1F), eqm.b, djp.sT.m().b(dlb.c, Boolean.valueOf(true))),
                  new ere(new erg(djp.sQ, 0.33333334F), eqm.b, djp.sS.m().b(dlb.c, Boolean.valueOf(true))),
                  new ere(new erg(djp.sQ, 0.5F), eqm.b, djp.sR.m().b(dlb.c, Boolean.valueOf(true)))
               )
            ),
            new erf(awp.bQ)
         )
      );
   }

   private static equ a(aku<evx> $$0, int $$1) {
      return new equ(new eri(List.of(new ere(new err(awp.cw), eqm.b, erb.b, djp.P.m(), new ert($$0)))), brn.a($$1));
   }
}
