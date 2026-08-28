import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final alf<evb> N = a("empty");
   public static final alf<evb> a = a("zombie_plains");
   public static final alf<evb> b = a("zombie_savanna");
   public static final alf<evb> c = a("zombie_snowy");
   public static final alf<evb> d = a("zombie_taiga");
   public static final alf<evb> e = a("zombie_desert");
   public static final alf<evb> f = a("mossify_10_percent");
   public static final alf<evb> g = a("mossify_20_percent");
   public static final alf<evb> h = a("mossify_70_percent");
   public static final alf<evb> i = a("street_plains");
   public static final alf<evb> j = a("street_savanna");
   public static final alf<evb> k = a("street_snowy_or_taiga");
   public static final alf<evb> l = a("farm_plains");
   public static final alf<evb> m = a("farm_savanna");
   public static final alf<evb> n = a("farm_snowy");
   public static final alf<evb> o = a("farm_taiga");
   public static final alf<evb> p = a("farm_desert");
   public static final alf<evb> q = a("outpost_rot");
   public static final alf<evb> r = a("bottom_rampart");
   public static final alf<evb> s = a("treasure_rooms");
   public static final alf<evb> t = a("housing");
   public static final alf<evb> u = a("side_wall_degradation");
   public static final alf<evb> v = a("stable_degradation");
   public static final alf<evb> w = a("bastion_generic_degradation");
   public static final alf<evb> x = a("rampart_degradation");
   public static final alf<evb> y = a("entrance_replacement");
   public static final alf<evb> z = a("bridge");
   public static final alf<evb> A = a("roof");
   public static final alf<evb> B = a("high_wall");
   public static final alf<evb> C = a("high_rampart");
   public static final alf<evb> D = a("fossil_rot");
   public static final alf<evb> E = a("fossil_coal");
   public static final alf<evb> F = a("fossil_diamonds");
   public static final alf<evb> G = a("ancient_city_start_degradation");
   public static final alf<evb> H = a("ancient_city_generic_degradation");
   public static final alf<evb> I = a("ancient_city_walls_degradation");
   public static final alf<evb> J = a("trail_ruins_houses_archaeology");
   public static final alf<evb> K = a("trail_ruins_roads_archaeology");
   public static final alf<evb> L = a("trail_ruins_tower_top_archaeology");
   public static final alf<evb> M = a("trial_chambers_copper_bulb_degradation");

   private static alf<evb> a(String $$0) {
      return alf.a(mg.bc, alg.b($$0));
   }

   private static void a(qh<evb> $$0, alf<evb> $$1, List<eva> $$2) {
      $$0.a($$1, new evb($$2));
   }

   public static void a(qh<evb> $$0) {
      jf<dmf> $$1 = $$0.a(mg.i);
      eus $$2 = new eus(new euu(dmh.pZ, 0.01F), eua.b, dmh.qk.m());
      eus $$3 = new eus(new euu(dmh.qk, 0.5F), eua.b, dmh.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.m, 0.8F), eua.b, dmh.cx.m()),
                  new eus(new evf(axc.q), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cz), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cA), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.m, 0.07F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.cx, 0.07F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.hK, 0.07F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.X, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.n, 0.1F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.cF, 0.1F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.aq, 0.02F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.fq, 0.5F), eua.b, dmh.bz.m()),
                  new eus[]{
                     new eus(
                        new euh(dmh.fq.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))),
                        eua.b,
                        dmh.im.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))
                     ),
                     new eus(
                        new euh(dmh.fq.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))),
                        eua.b,
                        dmh.im.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))
                     ),
                     new eus(new euu(dmh.cM, 0.3F), eua.b, dmh.gT.m()),
                     new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.gU.m()),
                     new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new evf(axc.q), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cz), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cA), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.r, 0.2F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.iq, 0.2F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.ab, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.ax, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.hL, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.hO, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.hY, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.fq, 0.5F), eua.b, dmh.bz.m()),
                  new eus(
                     new euh(dmh.fq.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))),
                     eua.b,
                     dmh.im.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))
                  ),
                  new eus[]{
                     new eus(
                        new euh(dmh.fq.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))),
                        eua.b,
                        dmh.im.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))
                     ),
                     new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new evf(axc.q), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cz), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cA), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.oK), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.o, 0.2F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.jW, 0.4F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.aj, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.aC, 0.05F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.fq, 0.5F), eua.b, dmh.bz.m()),
                  new eus(
                     new euh(dmh.fq.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))),
                     eua.b,
                     dmh.im.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))
                  ),
                  new eus(
                     new euh(dmh.fq.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))),
                     eua.b,
                     dmh.im.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))
                  ),
                  new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.gT.m()),
                  new eus[]{new eus(new euu(dmh.cM, 0.8F), eua.b, dmh.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.m, 0.8F), eua.b, dmh.cx.m()),
                  new eus(new evf(axc.q), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cz), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cA), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.oM), eua.b, dmh.oM.m().b(dmv.b, Boolean.valueOf(false))),
                  new eus(new euu(dmh.m, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.Y, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.fq, 0.5F), eua.b, dmh.bz.m()),
                  new eus(
                     new euh(dmh.fq.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))),
                     eua.b,
                     dmh.im.m().b(dql.a, Boolean.valueOf(true)).b(dql.c, Boolean.valueOf(true))
                  ),
                  new eus(
                     new euh(dmh.fq.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))),
                     eua.b,
                     dmh.im.m().b(dql.b, Boolean.valueOf(true)).b(dql.d, Boolean.valueOf(true))
                  ),
                  new eus(new euu(dmh.cM, 0.3F), eua.b, dmh.fv.m()),
                  new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.gU.m()),
                  new eus[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new evf(axc.q), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cz), eua.b, dmh.a.m()),
                  new eus(new euf(dmh.cA), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.kv, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.be, 0.1F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.jc, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.nR, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.oe, 0.08F), eua.b, dmh.bz.m()),
                  new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.lj.m()),
                  new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.m, 0.1F), eua.b, dmh.cx.m())))));
      a($$0, g, ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.m, 0.2F), eua.b, dmh.cx.m())))));
      a($$0, h, ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.m, 0.7F), eua.b, dmh.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euf(dmh.lk), new euf(dmh.J), dmh.n.m()),
                  new eus(new euu(dmh.lk, 0.1F), eua.b, dmh.i.m()),
                  new eus(new euf(dmh.i), new euf(dmh.J), dmh.J.m()),
                  new eus(new euf(dmh.j), new euf(dmh.J), dmh.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euf(dmh.lk), new euf(dmh.J), dmh.r.m()),
                  new eus(new euu(dmh.lk, 0.2F), eua.b, dmh.i.m()),
                  new eus(new euf(dmh.i), new euf(dmh.J), dmh.J.m()),
                  new eus(new euf(dmh.j), new euf(dmh.J), dmh.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euf(dmh.lk), new euf(dmh.J), dmh.o.m()),
                  new eus(new euf(dmh.lk), new euf(dmh.ee), dmh.o.m()),
                  new eus(new euu(dmh.lk, 0.2F), eua.b, dmh.i.m()),
                  new eus(new euf(dmh.i), new euf(dmh.J), dmh.J.m()),
                  new eus(new euf(dmh.j), new euf(dmh.J), dmh.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.cM, 0.3F), eua.b, dmh.gT.m()),
                  new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.gU.m()),
                  new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.gT.m()), new eus(new euu(dmh.cM, 0.8F), eua.b, dmh.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.cM, 0.3F), eua.b, dmh.fv.m()), new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.cM, 0.2F), eua.b, dmh.lj.m()), new eus(new euu(dmh.cM, 0.1F), eua.b, dmh.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new eug(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new euw(ImmutableList.of(new eus(new euu(dmh.lp, 0.75F), eua.b, dmh.qf.m()), new eus(new euu(dmh.qf, 0.15F), eua.b, dmh.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new euw(ImmutableList.of(new eus(new euu(dmh.qe, 0.35F), eua.b, dmh.qf.m()), new eus(new euu(dmh.qg, 0.1F), eua.b, dmh.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new euw(ImmutableList.of(new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.qf.m()), new eus(new euu(dmh.pZ, 1.0E-4F), eua.b, dmh.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new euw(ImmutableList.of(new eus(new euu(dmh.qg, 0.5F), eua.b, dmh.a.m()), new eus(new euu(dmh.cr, 0.1F), eua.b, dmh.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new euw(ImmutableList.of(new eus(new euu(dmh.qe, 0.1F), eua.b, dmh.qf.m()), new eus(new euu(dmh.pZ, 1.0E-4F), eua.b, dmh.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.qf.m()),
                  new eus(new euu(dmh.pZ, 1.0E-4F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.cr, 0.3F), eua.b, dmh.qf.m()),
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
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.qe, 0.4F), eua.b, dmh.qf.m()),
                  new eus(new euu(dmh.pZ, 0.01F), eua.b, dmh.qf.m()),
                  new eus(new euu(dmh.qe, 1.0E-4F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.pZ, 1.0E-4F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.cr, 0.3F), eua.b, dmh.qf.m()),
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
            new euw(ImmutableList.of(new eus(new euu(dmh.qg, 0.5F), eua.b, dmh.a.m()), new eus(new euu(dmh.cr, 0.6F), eua.b, dmh.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new euw(ImmutableList.of(new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.qf.m()), new eus(new euu(dmh.pZ, 1.0E-4F), eua.b, dmh.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.qf.m()),
                  new eus(new euu(dmh.qe, 0.15F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.qe, 0.01F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.qe, 0.5F), eua.b, dmh.qf.m()),
                  new eus(new euu(dmh.qe, 0.3F), eua.b, dmh.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new euw(
               ImmutableList.of(new eus(new euu(dmh.cr, 0.3F), eua.b, dmh.qf.m()), new eus(eua.b, eua.b, new eub(0.0F, 0.05F, 0, 100, ja.a.b), dmh.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eug(0.9F), new eut(axc.bS)));
      a($$0, E, ImmutableList.of(new eug(0.1F), new eut(axc.bS)));
      a($$0, F, ImmutableList.of(new eug(0.1F), new euw(ImmutableList.of(new eus(new euf(dmh.U), eua.b, dmh.cJ.m()))), new eut(axc.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.tG, 0.3F), eua.b, dmh.tL.m()),
                  new eus(new euu(dmh.tC, 0.3F), eua.b, dmh.tM.m()),
                  new eus(new euu(dmh.oL, 0.05F), eua.b, dmh.a.m())
               )
            ),
            new eut(axc.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eug($$1.b(axc.bY), 0.95F),
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.tG, 0.3F), eua.b, dmh.tL.m()),
                  new eus(new euu(dmh.tC, 0.3F), eua.b, dmh.tM.m()),
                  new eus(new euu(dmh.oL, 0.05F), eua.b, dmh.a.m())
               )
            ),
            new eut(axc.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eug($$1.b(axc.bY), 0.95F),
            new euw(
               ImmutableList.of(
                  new eus(new euu(dmh.tG, 0.3F), eua.b, dmh.tL.m()),
                  new eus(new euu(dmh.tC, 0.3F), eua.b, dmh.tM.m()),
                  new eus(new euu(dmh.tE, 0.3F), eua.b, dmh.a.m()),
                  new eus(new euu(dmh.oL, 0.05F), eua.b, dmh.a.m())
               )
            ),
            new eut(axc.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new euw(
               List.of(
                  new eus(new euu(dmh.O, 0.2F), eua.b, dmh.j.m()),
                  new eus(new euu(dmh.O, 0.1F), eua.b, dmh.k.m()),
                  new eus(new euu(dmh.fe, 0.1F), eua.b, dmh.fd.m())
               )
            ),
            a(ezd.aZ, 6),
            a(ezd.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new euw(
               List.of(
                  new eus(new euu(dmh.O, 0.2F), eua.b, dmh.j.m()),
                  new eus(new euu(dmh.O, 0.1F), eua.b, dmh.k.m()),
                  new eus(new euu(dmh.fe, 0.1F), eua.b, dmh.fd.m())
               )
            ),
            a(ezd.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ezd.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new euw(
               List.of(
                  new eus(new euu(dmh.sW, 0.1F), eua.b, dmh.sZ.m().b(dnu.c, Boolean.valueOf(true))),
                  new eus(new euu(dmh.sW, 0.33333334F), eua.b, dmh.sY.m().b(dnu.c, Boolean.valueOf(true))),
                  new eus(new euu(dmh.sW, 0.5F), eua.b, dmh.sX.m().b(dnu.c, Boolean.valueOf(true)))
               )
            ),
            new eut(axc.bS)
         )
      );
   }

   private static eui a(alf<ezm> $$0, int $$1) {
      return new eui(new euw(List.of(new eus(new evf(axc.cz), eua.b, eup.b, dmh.P.m(), new evh($$0)))), btf.a($$1));
   }
}
