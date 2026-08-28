import com.google.common.collect.ImmutableList;
import java.util.List;

public class qm {
   private static final akt<esj> N = a("empty");
   public static final akt<esj> a = a("zombie_plains");
   public static final akt<esj> b = a("zombie_savanna");
   public static final akt<esj> c = a("zombie_snowy");
   public static final akt<esj> d = a("zombie_taiga");
   public static final akt<esj> e = a("zombie_desert");
   public static final akt<esj> f = a("mossify_10_percent");
   public static final akt<esj> g = a("mossify_20_percent");
   public static final akt<esj> h = a("mossify_70_percent");
   public static final akt<esj> i = a("street_plains");
   public static final akt<esj> j = a("street_savanna");
   public static final akt<esj> k = a("street_snowy_or_taiga");
   public static final akt<esj> l = a("farm_plains");
   public static final akt<esj> m = a("farm_savanna");
   public static final akt<esj> n = a("farm_snowy");
   public static final akt<esj> o = a("farm_taiga");
   public static final akt<esj> p = a("farm_desert");
   public static final akt<esj> q = a("outpost_rot");
   public static final akt<esj> r = a("bottom_rampart");
   public static final akt<esj> s = a("treasure_rooms");
   public static final akt<esj> t = a("housing");
   public static final akt<esj> u = a("side_wall_degradation");
   public static final akt<esj> v = a("stable_degradation");
   public static final akt<esj> w = a("bastion_generic_degradation");
   public static final akt<esj> x = a("rampart_degradation");
   public static final akt<esj> y = a("entrance_replacement");
   public static final akt<esj> z = a("bridge");
   public static final akt<esj> A = a("roof");
   public static final akt<esj> B = a("high_wall");
   public static final akt<esj> C = a("high_rampart");
   public static final akt<esj> D = a("fossil_rot");
   public static final akt<esj> E = a("fossil_coal");
   public static final akt<esj> F = a("fossil_diamonds");
   public static final akt<esj> G = a("ancient_city_start_degradation");
   public static final akt<esj> H = a("ancient_city_generic_degradation");
   public static final akt<esj> I = a("ancient_city_walls_degradation");
   public static final akt<esj> J = a("trail_ruins_houses_archaeology");
   public static final akt<esj> K = a("trail_ruins_roads_archaeology");
   public static final akt<esj> L = a("trail_ruins_tower_top_archaeology");
   public static final akt<esj> M = a("trial_chambers_copper_bulb_degradation");

   private static akt<esj> a(String $$0) {
      return akt.a(mc.aX, aku.b($$0));
   }

   private static void a(qe<esj> $$0, akt<esj> $$1, List<esi> $$2) {
      $$0.a($$1, new esj($$2));
   }

   public static void a(qe<esj> $$0) {
      js<dke> $$1 = $$0.a(mc.f);
      esa $$2 = new esa(new esc(dkg.pT, 0.01F), eri.b, dkg.qe.m());
      esa $$3 = new esa(new esc(dkg.qe, 0.5F), eri.b, dkg.pT.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.m, 0.8F), eri.b, dkg.cu.m()),
                  new esa(new esn(awp.q), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cw), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cx), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.m, 0.07F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.cu, 0.07F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.hG, 0.07F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.X, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.n, 0.1F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.cC, 0.1F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.aq, 0.02F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.fm, 0.5F), eri.b, dkg.bz.m()),
                  new esa[]{
                     new esa(
                        new erp(dkg.fm.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))),
                        eri.b,
                        dkg.ii.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))
                     ),
                     new esa(
                        new erp(dkg.fm.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))),
                        eri.b,
                        dkg.ii.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))
                     ),
                     new esa(new esc(dkg.cJ, 0.3F), eri.b, dkg.gP.m()),
                     new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.gQ.m()),
                     new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.lf.m())
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
                  new esa(new esn(awp.q), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cw), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cx), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.r, 0.2F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.im, 0.2F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.ab, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.ax, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.hH, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.hK, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.hU, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.fm, 0.5F), eri.b, dkg.bz.m()),
                  new esa(
                     new erp(dkg.fm.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))),
                     eri.b,
                     dkg.ii.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))
                  ),
                  new esa[]{
                     new esa(
                        new erp(dkg.fm.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))),
                        eri.b,
                        dkg.ii.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))
                     ),
                     new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.fs.m())
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
                  new esa(new esn(awp.q), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cw), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cx), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.oG), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.o, 0.2F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.jS, 0.4F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.aj, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.aC, 0.05F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.fm, 0.5F), eri.b, dkg.bz.m()),
                  new esa(
                     new erp(dkg.fm.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))),
                     eri.b,
                     dkg.ii.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))
                  ),
                  new esa(
                     new erp(dkg.fm.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))),
                     eri.b,
                     dkg.ii.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))
                  ),
                  new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.gP.m()),
                  new esa[]{new esa(new esc(dkg.cJ, 0.8F), eri.b, dkg.gQ.m())}
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
                  new esa(new esc(dkg.m, 0.8F), eri.b, dkg.cu.m()),
                  new esa(new esn(awp.q), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cw), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cx), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.oI), eri.b, dkg.oI.m().b(dkt.b, Boolean.valueOf(false))),
                  new esa(new esc(dkg.m, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.Y, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.fm, 0.5F), eri.b, dkg.bz.m()),
                  new esa(
                     new erp(dkg.fm.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))),
                     eri.b,
                     dkg.ii.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true))
                  ),
                  new esa(
                     new erp(dkg.fm.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))),
                     eri.b,
                     dkg.ii.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true))
                  ),
                  new esa(new esc(dkg.cJ, 0.3F), eri.b, dkg.fr.m()),
                  new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.gQ.m()),
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
                  new esa(new esn(awp.q), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cw), eri.b, dkg.a.m()),
                  new esa(new ern(dkg.cx), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.kr, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.be, 0.1F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.iY, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.nN, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.oa, 0.08F), eri.b, dkg.bz.m()),
                  new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.lf.m()),
                  new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.fs.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.m, 0.1F), eri.b, dkg.cu.m())))));
      a($$0, g, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.m, 0.2F), eri.b, dkg.cu.m())))));
      a($$0, h, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.m, 0.7F), eri.b, dkg.cu.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new ern(dkg.lg), new ern(dkg.J), dkg.n.m()),
                  new esa(new esc(dkg.lg, 0.1F), eri.b, dkg.i.m()),
                  new esa(new ern(dkg.i), new ern(dkg.J), dkg.J.m()),
                  new esa(new ern(dkg.j), new ern(dkg.J), dkg.J.m())
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
                  new esa(new ern(dkg.lg), new ern(dkg.J), dkg.r.m()),
                  new esa(new esc(dkg.lg, 0.2F), eri.b, dkg.i.m()),
                  new esa(new ern(dkg.i), new ern(dkg.J), dkg.J.m()),
                  new esa(new ern(dkg.j), new ern(dkg.J), dkg.J.m())
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
                  new esa(new ern(dkg.lg), new ern(dkg.J), dkg.o.m()),
                  new esa(new ern(dkg.lg), new ern(dkg.eb), dkg.o.m()),
                  new esa(new esc(dkg.lg, 0.2F), eri.b, dkg.i.m()),
                  new esa(new ern(dkg.i), new ern(dkg.J), dkg.J.m()),
                  new esa(new ern(dkg.j), new ern(dkg.J), dkg.J.m())
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
                  new esa(new esc(dkg.cJ, 0.3F), eri.b, dkg.gP.m()),
                  new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.gQ.m()),
                  new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.lf.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.fs.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.gP.m()), new esa(new esc(dkg.cJ, 0.8F), eri.b, dkg.gQ.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.cJ, 0.3F), eri.b, dkg.fr.m()), new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.gQ.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.cJ, 0.2F), eri.b, dkg.lf.m()), new esa(new esc(dkg.cJ, 0.1F), eri.b, dkg.fs.m()))))
      );
      a($$0, q, ImmutableList.of(new ero(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkg.ll, 0.75F), eri.b, dkg.pZ.m()), new esa(new esc(dkg.pZ, 0.15F), eri.b, dkg.pY.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkg.pY, 0.35F), eri.b, dkg.pZ.m()), new esa(new esc(dkg.qa, 0.1F), eri.b, dkg.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pZ.m()), new esa(new esc(dkg.pT, 1.0E-4F), eri.b, dkg.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkg.qa, 0.5F), eri.b, dkg.a.m()), new esa(new esc(dkg.co, 0.1F), eri.b, dkg.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ese(ImmutableList.of(new esa(new esc(dkg.pY, 0.1F), eri.b, dkg.pZ.m()), new esa(new esc(dkg.pT, 1.0E-4F), eri.b, dkg.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pZ.m()),
                  new esa(new esc(dkg.pT, 1.0E-4F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.co, 0.3F), eri.b, dkg.pZ.m()),
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
                  new esa(new esc(dkg.pY, 0.4F), eri.b, dkg.pZ.m()),
                  new esa(new esc(dkg.pT, 0.01F), eri.b, dkg.pZ.m()),
                  new esa(new esc(dkg.pY, 1.0E-4F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.pT, 1.0E-4F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.co, 0.3F), eri.b, dkg.pZ.m()),
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
            new ese(ImmutableList.of(new esa(new esc(dkg.qa, 0.5F), eri.b, dkg.a.m()), new esa(new esc(dkg.co, 0.6F), eri.b, dkg.pZ.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ese(ImmutableList.of(new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pZ.m()), new esa(new esc(dkg.pT, 1.0E-4F), eri.b, dkg.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pZ.m()),
                  new esa(new esc(dkg.pY, 0.15F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pT.m())
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
                  new esa(new esc(dkg.pY, 0.01F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.pY, 0.5F), eri.b, dkg.pZ.m()),
                  new esa(new esc(dkg.pY, 0.3F), eri.b, dkg.pT.m()),
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
               ImmutableList.of(new esa(new esc(dkg.co, 0.3F), eri.b, dkg.pZ.m()), new esa(eri.b, eri.b, new erj(0.0F, 0.05F, 0, 100, jn.a.b), dkg.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new ero(0.9F), new esb(awp.bR)));
      a($$0, E, ImmutableList.of(new ero(0.1F), new esb(awp.bR)));
      a($$0, F, ImmutableList.of(new ero(0.1F), new ese(ImmutableList.of(new esa(new ern(dkg.U), eri.b, dkg.cG.m()))), new esb(awp.bR)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.tA, 0.3F), eri.b, dkg.tF.m()),
                  new esa(new esc(dkg.tw, 0.3F), eri.b, dkg.tG.m()),
                  new esa(new esc(dkg.oH, 0.05F), eri.b, dkg.a.m())
               )
            ),
            new esb(awp.bR)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new ero($$1.b(awp.bX), 0.95F),
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.tA, 0.3F), eri.b, dkg.tF.m()),
                  new esa(new esc(dkg.tw, 0.3F), eri.b, dkg.tG.m()),
                  new esa(new esc(dkg.oH, 0.05F), eri.b, dkg.a.m())
               )
            ),
            new esb(awp.bR)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new ero($$1.b(awp.bX), 0.95F),
            new ese(
               ImmutableList.of(
                  new esa(new esc(dkg.tA, 0.3F), eri.b, dkg.tF.m()),
                  new esa(new esc(dkg.tw, 0.3F), eri.b, dkg.tG.m()),
                  new esa(new esc(dkg.ty, 0.3F), eri.b, dkg.a.m()),
                  new esa(new esc(dkg.oH, 0.05F), eri.b, dkg.a.m())
               )
            ),
            new esb(awp.bR)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ese(
               List.of(
                  new esa(new esc(dkg.O, 0.2F), eri.b, dkg.j.m()),
                  new esa(new esc(dkg.O, 0.1F), eri.b, dkg.k.m()),
                  new esa(new esc(dkg.fa, 0.1F), eri.b, dkg.eZ.m())
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
                  new esa(new esc(dkg.O, 0.2F), eri.b, dkg.j.m()),
                  new esa(new esc(dkg.O, 0.1F), eri.b, dkg.k.m()),
                  new esa(new esc(dkg.fa, 0.1F), eri.b, dkg.eZ.m())
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
                  new esa(new esc(dkg.sQ, 0.1F), eri.b, dkg.sT.m().b(dls.c, Boolean.valueOf(true))),
                  new esa(new esc(dkg.sQ, 0.33333334F), eri.b, dkg.sS.m().b(dls.c, Boolean.valueOf(true))),
                  new esa(new esc(dkg.sQ, 0.5F), eri.b, dkg.sR.m().b(dls.c, Boolean.valueOf(true)))
               )
            ),
            new esb(awp.bR)
         )
      );
   }

   private static erq a(akt<ewt> $$0, int $$1) {
      return new erq(new ese(List.of(new esa(new esn(awp.cy), eri.b, erx.b, dkg.P.m(), new esp($$0)))), bsa.a($$1));
   }
}
