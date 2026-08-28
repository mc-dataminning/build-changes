import com.google.common.collect.ImmutableList;
import java.util.List;

public class qm {
   private static final aku<erl> N = a("empty");
   public static final aku<erl> a = a("zombie_plains");
   public static final aku<erl> b = a("zombie_savanna");
   public static final aku<erl> c = a("zombie_snowy");
   public static final aku<erl> d = a("zombie_taiga");
   public static final aku<erl> e = a("zombie_desert");
   public static final aku<erl> f = a("mossify_10_percent");
   public static final aku<erl> g = a("mossify_20_percent");
   public static final aku<erl> h = a("mossify_70_percent");
   public static final aku<erl> i = a("street_plains");
   public static final aku<erl> j = a("street_savanna");
   public static final aku<erl> k = a("street_snowy_or_taiga");
   public static final aku<erl> l = a("farm_plains");
   public static final aku<erl> m = a("farm_savanna");
   public static final aku<erl> n = a("farm_snowy");
   public static final aku<erl> o = a("farm_taiga");
   public static final aku<erl> p = a("farm_desert");
   public static final aku<erl> q = a("outpost_rot");
   public static final aku<erl> r = a("bottom_rampart");
   public static final aku<erl> s = a("treasure_rooms");
   public static final aku<erl> t = a("housing");
   public static final aku<erl> u = a("side_wall_degradation");
   public static final aku<erl> v = a("stable_degradation");
   public static final aku<erl> w = a("bastion_generic_degradation");
   public static final aku<erl> x = a("rampart_degradation");
   public static final aku<erl> y = a("entrance_replacement");
   public static final aku<erl> z = a("bridge");
   public static final aku<erl> A = a("roof");
   public static final aku<erl> B = a("high_wall");
   public static final aku<erl> C = a("high_rampart");
   public static final aku<erl> D = a("fossil_rot");
   public static final aku<erl> E = a("fossil_coal");
   public static final aku<erl> F = a("fossil_diamonds");
   public static final aku<erl> G = a("ancient_city_start_degradation");
   public static final aku<erl> H = a("ancient_city_generic_degradation");
   public static final aku<erl> I = a("ancient_city_walls_degradation");
   public static final aku<erl> J = a("trail_ruins_houses_archaeology");
   public static final aku<erl> K = a("trail_ruins_roads_archaeology");
   public static final aku<erl> L = a("trail_ruins_tower_top_archaeology");
   public static final aku<erl> M = a("trial_chambers_copper_bulb_degradation");

   private static aku<erl> a(String $$0) {
      return aku.a(mc.aV, akv.b($$0));
   }

   private static void a(qe<erl> $$0, aku<erl> $$1, List<erk> $$2) {
      $$0.a($$1, new erl($$2));
   }

   public static void a(qe<erl> $$0) {
      js<djl> $$1 = $$0.a(mc.f);
      erc $$2 = new erc(new ere(djn.pT, 0.01F), eqk.b, djn.qe.m());
      erc $$3 = new erc(new ere(djn.qe, 0.5F), eqk.b, djn.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.m, 0.8F), eqk.b, djn.cu.m()),
                  new erc(new erp(awp.q), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cw), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cx), eqk.b, djn.a.m()),
                  new erc(new ere(djn.m, 0.07F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.cu, 0.07F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.hG, 0.07F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.X, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.n, 0.1F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.cC, 0.1F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.aq, 0.02F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.fm, 0.5F), eqk.b, djn.bz.m()),
                  new erc[]{
                     new erc(
                        new eqr(djn.fm.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))),
                        eqk.b,
                        djn.ii.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))
                     ),
                     new erc(
                        new eqr(djn.fm.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))),
                        eqk.b,
                        djn.ii.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))
                     ),
                     new erc(new ere(djn.cJ, 0.3F), eqk.b, djn.gP.m()),
                     new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.gQ.m()),
                     new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.lf.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new erp(awp.q), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cw), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cx), eqk.b, djn.a.m()),
                  new erc(new ere(djn.r, 0.2F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.im, 0.2F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.ab, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.ax, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.hH, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.hK, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.hU, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.fm, 0.5F), eqk.b, djn.bz.m()),
                  new erc(
                     new eqr(djn.fm.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))),
                     eqk.b,
                     djn.ii.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))
                  ),
                  new erc[]{
                     new erc(
                        new eqr(djn.fm.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))),
                        eqk.b,
                        djn.ii.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))
                     ),
                     new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.fs.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new erp(awp.q), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cw), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cx), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.oG), eqk.b, djn.a.m()),
                  new erc(new ere(djn.o, 0.2F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.jS, 0.4F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.aj, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.aC, 0.05F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.fm, 0.5F), eqk.b, djn.bz.m()),
                  new erc(
                     new eqr(djn.fm.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))),
                     eqk.b,
                     djn.ii.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))
                  ),
                  new erc(
                     new eqr(djn.fm.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))),
                     eqk.b,
                     djn.ii.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))
                  ),
                  new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.gP.m()),
                  new erc[]{new erc(new ere(djn.cJ, 0.8F), eqk.b, djn.gQ.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.m, 0.8F), eqk.b, djn.cu.m()),
                  new erc(new erp(awp.q), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cw), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cx), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.oI), eqk.b, djn.oI.m().b(dka.c, Boolean.valueOf(false))),
                  new erc(new ere(djn.m, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.Y, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.fm, 0.5F), eqk.b, djn.bz.m()),
                  new erc(
                     new eqr(djn.fm.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))),
                     eqk.b,
                     djn.ii.m().b(dno.a, Boolean.valueOf(true)).b(dno.c, Boolean.valueOf(true))
                  ),
                  new erc(
                     new eqr(djn.fm.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))),
                     eqk.b,
                     djn.ii.m().b(dno.b, Boolean.valueOf(true)).b(dno.d, Boolean.valueOf(true))
                  ),
                  new erc(new ere(djn.cJ, 0.3F), eqk.b, djn.fr.m()),
                  new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.gQ.m()),
                  new erc[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new erp(awp.q), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cw), eqk.b, djn.a.m()),
                  new erc(new eqp(djn.cx), eqk.b, djn.a.m()),
                  new erc(new ere(djn.kr, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.be, 0.1F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.iY, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.nN, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.oa, 0.08F), eqk.b, djn.bz.m()),
                  new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.lf.m()),
                  new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.m, 0.1F), eqk.b, djn.cu.m())))));
      a($$0, g, ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.m, 0.2F), eqk.b, djn.cu.m())))));
      a($$0, h, ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.m, 0.7F), eqk.b, djn.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new eqp(djn.lg), new eqp(djn.J), djn.n.m()),
                  new erc(new ere(djn.lg, 0.1F), eqk.b, djn.i.m()),
                  new erc(new eqp(djn.i), new eqp(djn.J), djn.J.m()),
                  new erc(new eqp(djn.j), new eqp(djn.J), djn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new eqp(djn.lg), new eqp(djn.J), djn.r.m()),
                  new erc(new ere(djn.lg, 0.2F), eqk.b, djn.i.m()),
                  new erc(new eqp(djn.i), new eqp(djn.J), djn.J.m()),
                  new erc(new eqp(djn.j), new eqp(djn.J), djn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new eqp(djn.lg), new eqp(djn.J), djn.o.m()),
                  new erc(new eqp(djn.lg), new eqp(djn.eb), djn.o.m()),
                  new erc(new ere(djn.lg, 0.2F), eqk.b, djn.i.m()),
                  new erc(new eqp(djn.i), new eqp(djn.J), djn.J.m()),
                  new erc(new eqp(djn.j), new eqp(djn.J), djn.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.cJ, 0.3F), eqk.b, djn.gP.m()),
                  new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.gQ.m()),
                  new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.gP.m()), new erc(new ere(djn.cJ, 0.8F), eqk.b, djn.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.cJ, 0.3F), eqk.b, djn.fr.m()), new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.cJ, 0.2F), eqk.b, djn.lf.m()), new erc(new ere(djn.cJ, 0.1F), eqk.b, djn.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new eqq(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new erg(ImmutableList.of(new erc(new ere(djn.ll, 0.75F), eqk.b, djn.pZ.m()), new erc(new ere(djn.pZ, 0.15F), eqk.b, djn.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new erg(ImmutableList.of(new erc(new ere(djn.pY, 0.35F), eqk.b, djn.pZ.m()), new erc(new ere(djn.qa, 0.1F), eqk.b, djn.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new erg(ImmutableList.of(new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pZ.m()), new erc(new ere(djn.pT, 1.0E-4F), eqk.b, djn.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new erg(ImmutableList.of(new erc(new ere(djn.qa, 0.5F), eqk.b, djn.a.m()), new erc(new ere(djn.co, 0.1F), eqk.b, djn.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new erg(ImmutableList.of(new erc(new ere(djn.pY, 0.1F), eqk.b, djn.pZ.m()), new erc(new ere(djn.pT, 1.0E-4F), eqk.b, djn.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pZ.m()),
                  new erc(new ere(djn.pT, 1.0E-4F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.co, 0.3F), eqk.b, djn.pZ.m()),
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
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.pY, 0.4F), eqk.b, djn.pZ.m()),
                  new erc(new ere(djn.pT, 0.01F), eqk.b, djn.pZ.m()),
                  new erc(new ere(djn.pY, 1.0E-4F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.pT, 1.0E-4F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.co, 0.3F), eqk.b, djn.pZ.m()),
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
            new erg(ImmutableList.of(new erc(new ere(djn.qa, 0.5F), eqk.b, djn.a.m()), new erc(new ere(djn.co, 0.6F), eqk.b, djn.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new erg(ImmutableList.of(new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pZ.m()), new erc(new ere(djn.pT, 1.0E-4F), eqk.b, djn.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pZ.m()),
                  new erc(new ere(djn.pY, 0.15F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pT.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.pY, 0.01F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.pY, 0.5F), eqk.b, djn.pZ.m()),
                  new erc(new ere(djn.pY, 0.3F), eqk.b, djn.pT.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new erg(
               ImmutableList.of(new erc(new ere(djn.co, 0.3F), eqk.b, djn.pZ.m()), new erc(eqk.b, eqk.b, new eql(0.0F, 0.05F, 0, 100, jn.a.b), djn.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eqq(0.9F), new erd(awp.bQ)));
      a($$0, E, ImmutableList.of(new eqq(0.1F), new erd(awp.bQ)));
      a($$0, F, ImmutableList.of(new eqq(0.1F), new erg(ImmutableList.of(new erc(new eqp(djn.U), eqk.b, djn.cG.m()))), new erd(awp.bQ)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.ty, 0.3F), eqk.b, djn.tD.m()),
                  new erc(new ere(djn.tu, 0.3F), eqk.b, djn.tE.m()),
                  new erc(new ere(djn.oH, 0.05F), eqk.b, djn.a.m())
               )
            ),
            new erd(awp.bQ)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eqq($$1.b(awp.bW), 0.95F),
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.ty, 0.3F), eqk.b, djn.tD.m()),
                  new erc(new ere(djn.tu, 0.3F), eqk.b, djn.tE.m()),
                  new erc(new ere(djn.oH, 0.05F), eqk.b, djn.a.m())
               )
            ),
            new erd(awp.bQ)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eqq($$1.b(awp.bW), 0.95F),
            new erg(
               ImmutableList.of(
                  new erc(new ere(djn.ty, 0.3F), eqk.b, djn.tD.m()),
                  new erc(new ere(djn.tu, 0.3F), eqk.b, djn.tE.m()),
                  new erc(new ere(djn.tw, 0.3F), eqk.b, djn.a.m()),
                  new erc(new ere(djn.oH, 0.05F), eqk.b, djn.a.m())
               )
            ),
            new erd(awp.bQ)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new erg(
               List.of(
                  new erc(new ere(djn.O, 0.2F), eqk.b, djn.j.m()),
                  new erc(new ere(djn.O, 0.1F), eqk.b, djn.k.m()),
                  new erc(new ere(djn.fa, 0.1F), eqk.b, djn.eZ.m())
               )
            ),
            a(evm.aZ, 6),
            a(evm.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new erg(
               List.of(
                  new erc(new ere(djn.O, 0.2F), eqk.b, djn.j.m()),
                  new erc(new ere(djn.O, 0.1F), eqk.b, djn.k.m()),
                  new erc(new ere(djn.fa, 0.1F), eqk.b, djn.eZ.m())
               )
            ),
            a(evm.aZ, 2)
         )
      );
      a($$0, L, List.of(a(evm.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new erg(
               List.of(
                  new erc(new ere(djn.sQ, 0.1F), eqk.b, djn.sT.m().b(dkz.c, Boolean.valueOf(true))),
                  new erc(new ere(djn.sQ, 0.33333334F), eqk.b, djn.sS.m().b(dkz.c, Boolean.valueOf(true))),
                  new erc(new ere(djn.sQ, 0.5F), eqk.b, djn.sR.m().b(dkz.c, Boolean.valueOf(true)))
               )
            ),
            new erd(awp.bQ)
         )
      );
   }

   private static eqs a(aku<evv> $$0, int $$1) {
      return new eqs(new erg(List.of(new erc(new erp(awp.cw), eqk.b, eqz.b, djn.P.m(), new err($$0)))), brl.a($$1));
   }
}
