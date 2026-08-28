import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final alf<evi> N = a("empty");
   public static final alf<evi> a = a("zombie_plains");
   public static final alf<evi> b = a("zombie_savanna");
   public static final alf<evi> c = a("zombie_snowy");
   public static final alf<evi> d = a("zombie_taiga");
   public static final alf<evi> e = a("zombie_desert");
   public static final alf<evi> f = a("mossify_10_percent");
   public static final alf<evi> g = a("mossify_20_percent");
   public static final alf<evi> h = a("mossify_70_percent");
   public static final alf<evi> i = a("street_plains");
   public static final alf<evi> j = a("street_savanna");
   public static final alf<evi> k = a("street_snowy_or_taiga");
   public static final alf<evi> l = a("farm_plains");
   public static final alf<evi> m = a("farm_savanna");
   public static final alf<evi> n = a("farm_snowy");
   public static final alf<evi> o = a("farm_taiga");
   public static final alf<evi> p = a("farm_desert");
   public static final alf<evi> q = a("outpost_rot");
   public static final alf<evi> r = a("bottom_rampart");
   public static final alf<evi> s = a("treasure_rooms");
   public static final alf<evi> t = a("housing");
   public static final alf<evi> u = a("side_wall_degradation");
   public static final alf<evi> v = a("stable_degradation");
   public static final alf<evi> w = a("bastion_generic_degradation");
   public static final alf<evi> x = a("rampart_degradation");
   public static final alf<evi> y = a("entrance_replacement");
   public static final alf<evi> z = a("bridge");
   public static final alf<evi> A = a("roof");
   public static final alf<evi> B = a("high_wall");
   public static final alf<evi> C = a("high_rampart");
   public static final alf<evi> D = a("fossil_rot");
   public static final alf<evi> E = a("fossil_coal");
   public static final alf<evi> F = a("fossil_diamonds");
   public static final alf<evi> G = a("ancient_city_start_degradation");
   public static final alf<evi> H = a("ancient_city_generic_degradation");
   public static final alf<evi> I = a("ancient_city_walls_degradation");
   public static final alf<evi> J = a("trail_ruins_houses_archaeology");
   public static final alf<evi> K = a("trail_ruins_roads_archaeology");
   public static final alf<evi> L = a("trail_ruins_tower_top_archaeology");
   public static final alf<evi> M = a("trial_chambers_copper_bulb_degradation");

   private static alf<evi> a(String $$0) {
      return alf.a(mh.bc, alg.b($$0));
   }

   private static void a(qh<evi> $$0, alf<evi> $$1, List<evh> $$2) {
      $$0.a($$1, new evi($$2));
   }

   public static void a(qh<evi> $$0) {
      jg<dmm> $$1 = $$0.a(mh.i);
      euz $$2 = new euz(new evb(dmo.pZ, 0.01F), euh.b, dmo.qk.m());
      euz $$3 = new euz(new evb(dmo.qk, 0.5F), euh.b, dmo.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.m, 0.8F), euh.b, dmo.cx.m()),
                  new euz(new evm(axc.q), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cz), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cA), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.m, 0.07F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.cx, 0.07F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.hK, 0.07F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.X, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.n, 0.1F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.cF, 0.1F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.aq, 0.02F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.fq, 0.5F), euh.b, dmo.bz.m()),
                  new euz[]{
                     new euz(
                        new euo(dmo.fq.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))),
                        euh.b,
                        dmo.im.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))
                     ),
                     new euz(
                        new euo(dmo.fq.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))),
                        euh.b,
                        dmo.im.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))
                     ),
                     new euz(new evb(dmo.cM, 0.3F), euh.b, dmo.gT.m()),
                     new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.gU.m()),
                     new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evm(axc.q), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cz), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cA), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.r, 0.2F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.iq, 0.2F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.ab, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.ax, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.hL, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.hO, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.hY, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.fq, 0.5F), euh.b, dmo.bz.m()),
                  new euz(
                     new euo(dmo.fq.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))),
                     euh.b,
                     dmo.im.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))
                  ),
                  new euz[]{
                     new euz(
                        new euo(dmo.fq.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))),
                        euh.b,
                        dmo.im.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))
                     ),
                     new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evm(axc.q), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cz), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cA), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.oK), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.o, 0.2F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.jW, 0.4F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.aj, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.aC, 0.05F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.fq, 0.5F), euh.b, dmo.bz.m()),
                  new euz(
                     new euo(dmo.fq.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))),
                     euh.b,
                     dmo.im.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))
                  ),
                  new euz(
                     new euo(dmo.fq.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))),
                     euh.b,
                     dmo.im.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))
                  ),
                  new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.gT.m()),
                  new euz[]{new euz(new evb(dmo.cM, 0.8F), euh.b, dmo.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.m, 0.8F), euh.b, dmo.cx.m()),
                  new euz(new evm(axc.q), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cz), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cA), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.oM), euh.b, dmo.oM.m().b(dnc.b, Boolean.valueOf(false))),
                  new euz(new evb(dmo.m, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.Y, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.fq, 0.5F), euh.b, dmo.bz.m()),
                  new euz(
                     new euo(dmo.fq.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))),
                     euh.b,
                     dmo.im.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true))
                  ),
                  new euz(
                     new euo(dmo.fq.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))),
                     euh.b,
                     dmo.im.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true))
                  ),
                  new euz(new evb(dmo.cM, 0.3F), euh.b, dmo.fv.m()),
                  new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.gU.m()),
                  new euz[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evm(axc.q), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cz), euh.b, dmo.a.m()),
                  new euz(new eum(dmo.cA), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.kv, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.be, 0.1F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.jc, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.nR, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.oe, 0.08F), euh.b, dmo.bz.m()),
                  new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.lj.m()),
                  new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.m, 0.1F), euh.b, dmo.cx.m())))));
      a($$0, g, ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.m, 0.2F), euh.b, dmo.cx.m())))));
      a($$0, h, ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.m, 0.7F), euh.b, dmo.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new eum(dmo.lk), new eum(dmo.J), dmo.n.m()),
                  new euz(new evb(dmo.lk, 0.1F), euh.b, dmo.i.m()),
                  new euz(new eum(dmo.i), new eum(dmo.J), dmo.J.m()),
                  new euz(new eum(dmo.j), new eum(dmo.J), dmo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new eum(dmo.lk), new eum(dmo.J), dmo.r.m()),
                  new euz(new evb(dmo.lk, 0.2F), euh.b, dmo.i.m()),
                  new euz(new eum(dmo.i), new eum(dmo.J), dmo.J.m()),
                  new euz(new eum(dmo.j), new eum(dmo.J), dmo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new eum(dmo.lk), new eum(dmo.J), dmo.o.m()),
                  new euz(new eum(dmo.lk), new eum(dmo.ee), dmo.o.m()),
                  new euz(new evb(dmo.lk, 0.2F), euh.b, dmo.i.m()),
                  new euz(new eum(dmo.i), new eum(dmo.J), dmo.J.m()),
                  new euz(new eum(dmo.j), new eum(dmo.J), dmo.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.cM, 0.3F), euh.b, dmo.gT.m()),
                  new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.gU.m()),
                  new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.gT.m()), new euz(new evb(dmo.cM, 0.8F), euh.b, dmo.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.cM, 0.3F), euh.b, dmo.fv.m()), new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.cM, 0.2F), euh.b, dmo.lj.m()), new euz(new evb(dmo.cM, 0.1F), euh.b, dmo.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new eun(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new evd(ImmutableList.of(new euz(new evb(dmo.lp, 0.75F), euh.b, dmo.qf.m()), new euz(new evb(dmo.qf, 0.15F), euh.b, dmo.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new evd(ImmutableList.of(new euz(new evb(dmo.qe, 0.35F), euh.b, dmo.qf.m()), new euz(new evb(dmo.qg, 0.1F), euh.b, dmo.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new evd(ImmutableList.of(new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.qf.m()), new euz(new evb(dmo.pZ, 1.0E-4F), euh.b, dmo.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new evd(ImmutableList.of(new euz(new evb(dmo.qg, 0.5F), euh.b, dmo.a.m()), new euz(new evb(dmo.cr, 0.1F), euh.b, dmo.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new evd(ImmutableList.of(new euz(new evb(dmo.qe, 0.1F), euh.b, dmo.qf.m()), new euz(new evb(dmo.pZ, 1.0E-4F), euh.b, dmo.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.qf.m()),
                  new euz(new evb(dmo.pZ, 1.0E-4F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.cr, 0.3F), euh.b, dmo.qf.m()),
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
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.qe, 0.4F), euh.b, dmo.qf.m()),
                  new euz(new evb(dmo.pZ, 0.01F), euh.b, dmo.qf.m()),
                  new euz(new evb(dmo.qe, 1.0E-4F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.pZ, 1.0E-4F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.cr, 0.3F), euh.b, dmo.qf.m()),
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
            new evd(ImmutableList.of(new euz(new evb(dmo.qg, 0.5F), euh.b, dmo.a.m()), new euz(new evb(dmo.cr, 0.6F), euh.b, dmo.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new evd(ImmutableList.of(new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.qf.m()), new euz(new evb(dmo.pZ, 1.0E-4F), euh.b, dmo.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.qf.m()),
                  new euz(new evb(dmo.qe, 0.15F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.qe, 0.01F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.qe, 0.5F), euh.b, dmo.qf.m()),
                  new euz(new evb(dmo.qe, 0.3F), euh.b, dmo.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new evd(
               ImmutableList.of(new euz(new evb(dmo.cr, 0.3F), euh.b, dmo.qf.m()), new euz(euh.b, euh.b, new eui(0.0F, 0.05F, 0, 100, jb.a.b), dmo.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eun(0.9F), new eva(axc.bS)));
      a($$0, E, ImmutableList.of(new eun(0.1F), new eva(axc.bS)));
      a($$0, F, ImmutableList.of(new eun(0.1F), new evd(ImmutableList.of(new euz(new eum(dmo.U), euh.b, dmo.cJ.m()))), new eva(axc.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.tG, 0.3F), euh.b, dmo.tL.m()),
                  new euz(new evb(dmo.tC, 0.3F), euh.b, dmo.tM.m()),
                  new euz(new evb(dmo.oL, 0.05F), euh.b, dmo.a.m())
               )
            ),
            new eva(axc.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eun($$1.b(axc.bY), 0.95F),
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.tG, 0.3F), euh.b, dmo.tL.m()),
                  new euz(new evb(dmo.tC, 0.3F), euh.b, dmo.tM.m()),
                  new euz(new evb(dmo.oL, 0.05F), euh.b, dmo.a.m())
               )
            ),
            new eva(axc.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eun($$1.b(axc.bY), 0.95F),
            new evd(
               ImmutableList.of(
                  new euz(new evb(dmo.tG, 0.3F), euh.b, dmo.tL.m()),
                  new euz(new evb(dmo.tC, 0.3F), euh.b, dmo.tM.m()),
                  new euz(new evb(dmo.tE, 0.3F), euh.b, dmo.a.m()),
                  new euz(new evb(dmo.oL, 0.05F), euh.b, dmo.a.m())
               )
            ),
            new eva(axc.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new evd(
               List.of(
                  new euz(new evb(dmo.O, 0.2F), euh.b, dmo.j.m()),
                  new euz(new evb(dmo.O, 0.1F), euh.b, dmo.k.m()),
                  new euz(new evb(dmo.fe, 0.1F), euh.b, dmo.fd.m())
               )
            ),
            a(ezk.aZ, 6),
            a(ezk.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new evd(
               List.of(
                  new euz(new evb(dmo.O, 0.2F), euh.b, dmo.j.m()),
                  new euz(new evb(dmo.O, 0.1F), euh.b, dmo.k.m()),
                  new euz(new evb(dmo.fe, 0.1F), euh.b, dmo.fd.m())
               )
            ),
            a(ezk.aZ, 2)
         )
      );
      a($$0, L, List.of(a(ezk.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new evd(
               List.of(
                  new euz(new evb(dmo.sW, 0.1F), euh.b, dmo.sZ.m().b(dob.c, Boolean.valueOf(true))),
                  new euz(new evb(dmo.sW, 0.33333334F), euh.b, dmo.sY.m().b(dob.c, Boolean.valueOf(true))),
                  new euz(new evb(dmo.sW, 0.5F), euh.b, dmo.sX.m().b(dob.c, Boolean.valueOf(true)))
               )
            ),
            new eva(axc.bS)
         )
      );
   }

   private static eup a(alf<ezt> $$0, int $$1) {
      return new eup(new evd(List.of(new euz(new evm(axc.cA), euh.b, euw.b, dmo.P.m(), new evo($$0)))), bti.a($$1));
   }
}
