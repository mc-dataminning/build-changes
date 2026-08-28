import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final alf<evn> N = a("empty");
   public static final alf<evn> a = a("zombie_plains");
   public static final alf<evn> b = a("zombie_savanna");
   public static final alf<evn> c = a("zombie_snowy");
   public static final alf<evn> d = a("zombie_taiga");
   public static final alf<evn> e = a("zombie_desert");
   public static final alf<evn> f = a("mossify_10_percent");
   public static final alf<evn> g = a("mossify_20_percent");
   public static final alf<evn> h = a("mossify_70_percent");
   public static final alf<evn> i = a("street_plains");
   public static final alf<evn> j = a("street_savanna");
   public static final alf<evn> k = a("street_snowy_or_taiga");
   public static final alf<evn> l = a("farm_plains");
   public static final alf<evn> m = a("farm_savanna");
   public static final alf<evn> n = a("farm_snowy");
   public static final alf<evn> o = a("farm_taiga");
   public static final alf<evn> p = a("farm_desert");
   public static final alf<evn> q = a("outpost_rot");
   public static final alf<evn> r = a("bottom_rampart");
   public static final alf<evn> s = a("treasure_rooms");
   public static final alf<evn> t = a("housing");
   public static final alf<evn> u = a("side_wall_degradation");
   public static final alf<evn> v = a("stable_degradation");
   public static final alf<evn> w = a("bastion_generic_degradation");
   public static final alf<evn> x = a("rampart_degradation");
   public static final alf<evn> y = a("entrance_replacement");
   public static final alf<evn> z = a("bridge");
   public static final alf<evn> A = a("roof");
   public static final alf<evn> B = a("high_wall");
   public static final alf<evn> C = a("high_rampart");
   public static final alf<evn> D = a("fossil_rot");
   public static final alf<evn> E = a("fossil_coal");
   public static final alf<evn> F = a("fossil_diamonds");
   public static final alf<evn> G = a("ancient_city_start_degradation");
   public static final alf<evn> H = a("ancient_city_generic_degradation");
   public static final alf<evn> I = a("ancient_city_walls_degradation");
   public static final alf<evn> J = a("trail_ruins_houses_archaeology");
   public static final alf<evn> K = a("trail_ruins_roads_archaeology");
   public static final alf<evn> L = a("trail_ruins_tower_top_archaeology");
   public static final alf<evn> M = a("trial_chambers_copper_bulb_degradation");

   private static alf<evn> a(String $$0) {
      return alf.a(mh.bc, alg.b($$0));
   }

   private static void a(qh<evn> $$0, alf<evn> $$1, List<evm> $$2) {
      $$0.a($$1, new evn($$2));
   }

   public static void a(qh<evn> $$0) {
      jg<dmr> $$1 = $$0.a(mh.i);
      eve $$2 = new eve(new evg(dmt.pZ, 0.01F), eum.b, dmt.qk.m());
      eve $$3 = new eve(new evg(dmt.qk, 0.5F), eum.b, dmt.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.m, 0.8F), eum.b, dmt.cx.m()),
                  new eve(new evr(axc.q), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cz), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cA), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.m, 0.07F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.cx, 0.07F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.hK, 0.07F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.X, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.n, 0.1F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.cF, 0.1F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.aq, 0.02F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.fq, 0.5F), eum.b, dmt.bz.m()),
                  new eve[]{
                     new eve(
                        new eut(dmt.fq.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))),
                        eum.b,
                        dmt.im.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))
                     ),
                     new eve(
                        new eut(dmt.fq.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))),
                        eum.b,
                        dmt.im.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))
                     ),
                     new eve(new evg(dmt.cM, 0.3F), eum.b, dmt.gT.m()),
                     new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.gU.m()),
                     new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evr(axc.q), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cz), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cA), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.r, 0.2F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.iq, 0.2F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.ab, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.ax, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.hL, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.hO, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.hY, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.fq, 0.5F), eum.b, dmt.bz.m()),
                  new eve(
                     new eut(dmt.fq.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))),
                     eum.b,
                     dmt.im.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))
                  ),
                  new eve[]{
                     new eve(
                        new eut(dmt.fq.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))),
                        eum.b,
                        dmt.im.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))
                     ),
                     new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evr(axc.q), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cz), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cA), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.oK), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.o, 0.2F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.jW, 0.4F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.aj, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.aC, 0.05F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.fq, 0.5F), eum.b, dmt.bz.m()),
                  new eve(
                     new eut(dmt.fq.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))),
                     eum.b,
                     dmt.im.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))
                  ),
                  new eve(
                     new eut(dmt.fq.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))),
                     eum.b,
                     dmt.im.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))
                  ),
                  new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.gT.m()),
                  new eve[]{new eve(new evg(dmt.cM, 0.8F), eum.b, dmt.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.m, 0.8F), eum.b, dmt.cx.m()),
                  new eve(new evr(axc.q), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cz), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cA), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.oM), eum.b, dmt.oM.m().b(dnh.b, Boolean.valueOf(false))),
                  new eve(new evg(dmt.m, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.Y, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.fq, 0.5F), eum.b, dmt.bz.m()),
                  new eve(
                     new eut(dmt.fq.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))),
                     eum.b,
                     dmt.im.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true))
                  ),
                  new eve(
                     new eut(dmt.fq.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))),
                     eum.b,
                     dmt.im.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true))
                  ),
                  new eve(new evg(dmt.cM, 0.3F), eum.b, dmt.fv.m()),
                  new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.gU.m()),
                  new eve[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evr(axc.q), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cz), eum.b, dmt.a.m()),
                  new eve(new eur(dmt.cA), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.kv, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.be, 0.1F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.jc, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.nR, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.oe, 0.08F), eum.b, dmt.bz.m()),
                  new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.lj.m()),
                  new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.m, 0.1F), eum.b, dmt.cx.m())))));
      a($$0, g, ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.m, 0.2F), eum.b, dmt.cx.m())))));
      a($$0, h, ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.m, 0.7F), eum.b, dmt.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new eur(dmt.lk), new eur(dmt.J), dmt.n.m()),
                  new eve(new evg(dmt.lk, 0.1F), eum.b, dmt.i.m()),
                  new eve(new eur(dmt.i), new eur(dmt.J), dmt.J.m()),
                  new eve(new eur(dmt.j), new eur(dmt.J), dmt.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new eur(dmt.lk), new eur(dmt.J), dmt.r.m()),
                  new eve(new evg(dmt.lk, 0.2F), eum.b, dmt.i.m()),
                  new eve(new eur(dmt.i), new eur(dmt.J), dmt.J.m()),
                  new eve(new eur(dmt.j), new eur(dmt.J), dmt.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new eur(dmt.lk), new eur(dmt.J), dmt.o.m()),
                  new eve(new eur(dmt.lk), new eur(dmt.ee), dmt.o.m()),
                  new eve(new evg(dmt.lk, 0.2F), eum.b, dmt.i.m()),
                  new eve(new eur(dmt.i), new eur(dmt.J), dmt.J.m()),
                  new eve(new eur(dmt.j), new eur(dmt.J), dmt.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.cM, 0.3F), eum.b, dmt.gT.m()),
                  new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.gU.m()),
                  new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.gT.m()), new eve(new evg(dmt.cM, 0.8F), eum.b, dmt.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.cM, 0.3F), eum.b, dmt.fv.m()), new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.cM, 0.2F), eum.b, dmt.lj.m()), new eve(new evg(dmt.cM, 0.1F), eum.b, dmt.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new eus(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new evi(ImmutableList.of(new eve(new evg(dmt.lp, 0.75F), eum.b, dmt.qf.m()), new eve(new evg(dmt.qf, 0.15F), eum.b, dmt.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new evi(ImmutableList.of(new eve(new evg(dmt.qe, 0.35F), eum.b, dmt.qf.m()), new eve(new evg(dmt.qg, 0.1F), eum.b, dmt.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new evi(ImmutableList.of(new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.qf.m()), new eve(new evg(dmt.pZ, 1.0E-4F), eum.b, dmt.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new evi(ImmutableList.of(new eve(new evg(dmt.qg, 0.5F), eum.b, dmt.a.m()), new eve(new evg(dmt.cr, 0.1F), eum.b, dmt.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new evi(ImmutableList.of(new eve(new evg(dmt.qe, 0.1F), eum.b, dmt.qf.m()), new eve(new evg(dmt.pZ, 1.0E-4F), eum.b, dmt.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.qf.m()),
                  new eve(new evg(dmt.pZ, 1.0E-4F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.cr, 0.3F), eum.b, dmt.qf.m()),
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
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.qe, 0.4F), eum.b, dmt.qf.m()),
                  new eve(new evg(dmt.pZ, 0.01F), eum.b, dmt.qf.m()),
                  new eve(new evg(dmt.qe, 1.0E-4F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.pZ, 1.0E-4F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.cr, 0.3F), eum.b, dmt.qf.m()),
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
            new evi(ImmutableList.of(new eve(new evg(dmt.qg, 0.5F), eum.b, dmt.a.m()), new eve(new evg(dmt.cr, 0.6F), eum.b, dmt.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new evi(ImmutableList.of(new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.qf.m()), new eve(new evg(dmt.pZ, 1.0E-4F), eum.b, dmt.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.qf.m()),
                  new eve(new evg(dmt.qe, 0.15F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.qe, 0.01F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.qe, 0.5F), eum.b, dmt.qf.m()),
                  new eve(new evg(dmt.qe, 0.3F), eum.b, dmt.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new evi(
               ImmutableList.of(new eve(new evg(dmt.cr, 0.3F), eum.b, dmt.qf.m()), new eve(eum.b, eum.b, new eun(0.0F, 0.05F, 0, 100, jb.a.b), dmt.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eus(0.9F), new evf(axc.bS)));
      a($$0, E, ImmutableList.of(new eus(0.1F), new evf(axc.bS)));
      a($$0, F, ImmutableList.of(new eus(0.1F), new evi(ImmutableList.of(new eve(new eur(dmt.U), eum.b, dmt.cJ.m()))), new evf(axc.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.tG, 0.3F), eum.b, dmt.tL.m()),
                  new eve(new evg(dmt.tC, 0.3F), eum.b, dmt.tM.m()),
                  new eve(new evg(dmt.oL, 0.05F), eum.b, dmt.a.m())
               )
            ),
            new evf(axc.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eus($$1.b(axc.bY), 0.95F),
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.tG, 0.3F), eum.b, dmt.tL.m()),
                  new eve(new evg(dmt.tC, 0.3F), eum.b, dmt.tM.m()),
                  new eve(new evg(dmt.oL, 0.05F), eum.b, dmt.a.m())
               )
            ),
            new evf(axc.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eus($$1.b(axc.bY), 0.95F),
            new evi(
               ImmutableList.of(
                  new eve(new evg(dmt.tG, 0.3F), eum.b, dmt.tL.m()),
                  new eve(new evg(dmt.tC, 0.3F), eum.b, dmt.tM.m()),
                  new eve(new evg(dmt.tE, 0.3F), eum.b, dmt.a.m()),
                  new eve(new evg(dmt.oL, 0.05F), eum.b, dmt.a.m())
               )
            ),
            new evf(axc.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new evi(
               List.of(
                  new eve(new evg(dmt.O, 0.2F), eum.b, dmt.j.m()),
                  new eve(new evg(dmt.O, 0.1F), eum.b, dmt.k.m()),
                  new eve(new evg(dmt.fe, 0.1F), eum.b, dmt.fd.m())
               )
            ),
            a(ezp.aZ, 6),
            a(ezp.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new evi(
               List.of(
                  new eve(new evg(dmt.O, 0.2F), eum.b, dmt.j.m()),
                  new eve(new evg(dmt.O, 0.1F), eum.b, dmt.k.m()),
                  new eve(new evg(dmt.fe, 0.1F), eum.b, dmt.fd.m())
               )
            ),
            a(ezp.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ezp.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new evi(
               List.of(
                  new eve(new evg(dmt.sW, 0.1F), eum.b, dmt.sZ.m().b(dog.c, Boolean.valueOf(true))),
                  new eve(new evg(dmt.sW, 0.33333334F), eum.b, dmt.sY.m().b(dog.c, Boolean.valueOf(true))),
                  new eve(new evg(dmt.sW, 0.5F), eum.b, dmt.sX.m().b(dog.c, Boolean.valueOf(true)))
               )
            ),
            new evf(axc.bS)
         )
      );
   }

   private static euu a(alf<ezy> $$0, int $$1) {
      return new euu(new evi(List.of(new eve(new evr(axc.cA), eum.b, evb.b, dmt.P.m(), new evt($$0)))), bti.a($$1));
   }
}
