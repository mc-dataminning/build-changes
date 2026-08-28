import com.google.common.collect.ImmutableList;
import java.util.List;

public class qq {
   private static final alq<ewn> N = a("empty");
   public static final alq<ewn> a = a("zombie_plains");
   public static final alq<ewn> b = a("zombie_savanna");
   public static final alq<ewn> c = a("zombie_snowy");
   public static final alq<ewn> d = a("zombie_taiga");
   public static final alq<ewn> e = a("zombie_desert");
   public static final alq<ewn> f = a("mossify_10_percent");
   public static final alq<ewn> g = a("mossify_20_percent");
   public static final alq<ewn> h = a("mossify_70_percent");
   public static final alq<ewn> i = a("street_plains");
   public static final alq<ewn> j = a("street_savanna");
   public static final alq<ewn> k = a("street_snowy_or_taiga");
   public static final alq<ewn> l = a("farm_plains");
   public static final alq<ewn> m = a("farm_savanna");
   public static final alq<ewn> n = a("farm_snowy");
   public static final alq<ewn> o = a("farm_taiga");
   public static final alq<ewn> p = a("farm_desert");
   public static final alq<ewn> q = a("outpost_rot");
   public static final alq<ewn> r = a("bottom_rampart");
   public static final alq<ewn> s = a("treasure_rooms");
   public static final alq<ewn> t = a("housing");
   public static final alq<ewn> u = a("side_wall_degradation");
   public static final alq<ewn> v = a("stable_degradation");
   public static final alq<ewn> w = a("bastion_generic_degradation");
   public static final alq<ewn> x = a("rampart_degradation");
   public static final alq<ewn> y = a("entrance_replacement");
   public static final alq<ewn> z = a("bridge");
   public static final alq<ewn> A = a("roof");
   public static final alq<ewn> B = a("high_wall");
   public static final alq<ewn> C = a("high_rampart");
   public static final alq<ewn> D = a("fossil_rot");
   public static final alq<ewn> E = a("fossil_coal");
   public static final alq<ewn> F = a("fossil_diamonds");
   public static final alq<ewn> G = a("ancient_city_start_degradation");
   public static final alq<ewn> H = a("ancient_city_generic_degradation");
   public static final alq<ewn> I = a("ancient_city_walls_degradation");
   public static final alq<ewn> J = a("trail_ruins_houses_archaeology");
   public static final alq<ewn> K = a("trail_ruins_roads_archaeology");
   public static final alq<ewn> L = a("trail_ruins_tower_top_archaeology");
   public static final alq<ewn> M = a("trial_chambers_copper_bulb_degradation");

   private static alq<ewn> a(String $$0) {
      return alq.a(mi.bc, alr.b($$0));
   }

   private static void a(qi<ewn> $$0, alq<ewn> $$1, List<ewm> $$2) {
      $$0.a($$1, new ewn($$2));
   }

   public static void a(qi<ewn> $$0) {
      jh<dno> $$1 = $$0.a(mi.i);
      ewe $$2 = new ewe(new ewg(dnq.pZ, 0.01F), evm.b, dnq.qk.m());
      ewe $$3 = new ewe(new ewg(dnq.qk, 0.5F), evm.b, dnq.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.m, 0.8F), evm.b, dnq.cx.m()),
                  new ewe(new ewr(axn.q), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cz), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cA), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.m, 0.07F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.cx, 0.07F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.hK, 0.07F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.X, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.n, 0.1F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.cF, 0.1F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.aq, 0.02F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.fq, 0.5F), evm.b, dnq.bz.m()),
                  new ewe[]{
                     new ewe(
                        new evt(dnq.fq.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))),
                        evm.b,
                        dnq.im.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))
                     ),
                     new ewe(
                        new evt(dnq.fq.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))),
                        evm.b,
                        dnq.im.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))
                     ),
                     new ewe(new ewg(dnq.cM, 0.3F), evm.b, dnq.gT.m()),
                     new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.gU.m()),
                     new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewr(axn.q), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cz), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cA), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.r, 0.2F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.iq, 0.2F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.ab, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.ax, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.hL, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.hO, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.hY, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.fq, 0.5F), evm.b, dnq.bz.m()),
                  new ewe(
                     new evt(dnq.fq.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))),
                     evm.b,
                     dnq.im.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))
                  ),
                  new ewe[]{
                     new ewe(
                        new evt(dnq.fq.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))),
                        evm.b,
                        dnq.im.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))
                     ),
                     new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewr(axn.q), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cz), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cA), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.oK), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.o, 0.2F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.jW, 0.4F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.aj, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.aC, 0.05F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.fq, 0.5F), evm.b, dnq.bz.m()),
                  new ewe(
                     new evt(dnq.fq.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))),
                     evm.b,
                     dnq.im.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))
                  ),
                  new ewe(
                     new evt(dnq.fq.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))),
                     evm.b,
                     dnq.im.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))
                  ),
                  new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.gT.m()),
                  new ewe[]{new ewe(new ewg(dnq.cM, 0.8F), evm.b, dnq.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.m, 0.8F), evm.b, dnq.cx.m()),
                  new ewe(new ewr(axn.q), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cz), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cA), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.oM), evm.b, dnq.oM.m().b(doe.b, Boolean.valueOf(false))),
                  new ewe(new ewg(dnq.m, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.Y, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.fq, 0.5F), evm.b, dnq.bz.m()),
                  new ewe(
                     new evt(dnq.fq.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))),
                     evm.b,
                     dnq.im.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true))
                  ),
                  new ewe(
                     new evt(dnq.fq.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))),
                     evm.b,
                     dnq.im.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true))
                  ),
                  new ewe(new ewg(dnq.cM, 0.3F), evm.b, dnq.fv.m()),
                  new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.gU.m()),
                  new ewe[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewr(axn.q), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cz), evm.b, dnq.a.m()),
                  new ewe(new evr(dnq.cA), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.kv, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.be, 0.1F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.jc, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.nR, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.oe, 0.08F), evm.b, dnq.bz.m()),
                  new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.lj.m()),
                  new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.m, 0.1F), evm.b, dnq.cx.m())))));
      a($$0, g, ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.m, 0.2F), evm.b, dnq.cx.m())))));
      a($$0, h, ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.m, 0.7F), evm.b, dnq.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new evr(dnq.lk), new evr(dnq.J), dnq.n.m()),
                  new ewe(new ewg(dnq.lk, 0.1F), evm.b, dnq.i.m()),
                  new ewe(new evr(dnq.i), new evr(dnq.J), dnq.J.m()),
                  new ewe(new evr(dnq.j), new evr(dnq.J), dnq.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new evr(dnq.lk), new evr(dnq.J), dnq.r.m()),
                  new ewe(new ewg(dnq.lk, 0.2F), evm.b, dnq.i.m()),
                  new ewe(new evr(dnq.i), new evr(dnq.J), dnq.J.m()),
                  new ewe(new evr(dnq.j), new evr(dnq.J), dnq.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new evr(dnq.lk), new evr(dnq.J), dnq.o.m()),
                  new ewe(new evr(dnq.lk), new evr(dnq.ee), dnq.o.m()),
                  new ewe(new ewg(dnq.lk, 0.2F), evm.b, dnq.i.m()),
                  new ewe(new evr(dnq.i), new evr(dnq.J), dnq.J.m()),
                  new ewe(new evr(dnq.j), new evr(dnq.J), dnq.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.cM, 0.3F), evm.b, dnq.gT.m()),
                  new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.gU.m()),
                  new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.gT.m()), new ewe(new ewg(dnq.cM, 0.8F), evm.b, dnq.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.cM, 0.3F), evm.b, dnq.fv.m()), new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.cM, 0.2F), evm.b, dnq.lj.m()), new ewe(new ewg(dnq.cM, 0.1F), evm.b, dnq.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new evs(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.lp, 0.75F), evm.b, dnq.qf.m()), new ewe(new ewg(dnq.qf, 0.15F), evm.b, dnq.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.qe, 0.35F), evm.b, dnq.qf.m()), new ewe(new ewg(dnq.qg, 0.1F), evm.b, dnq.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.qf.m()), new ewe(new ewg(dnq.pZ, 1.0E-4F), evm.b, dnq.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.qg, 0.5F), evm.b, dnq.a.m()), new ewe(new ewg(dnq.cr, 0.1F), evm.b, dnq.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.qe, 0.1F), evm.b, dnq.qf.m()), new ewe(new ewg(dnq.pZ, 1.0E-4F), evm.b, dnq.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.qf.m()),
                  new ewe(new ewg(dnq.pZ, 1.0E-4F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.cr, 0.3F), evm.b, dnq.qf.m()),
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
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.qe, 0.4F), evm.b, dnq.qf.m()),
                  new ewe(new ewg(dnq.pZ, 0.01F), evm.b, dnq.qf.m()),
                  new ewe(new ewg(dnq.qe, 1.0E-4F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.pZ, 1.0E-4F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.cr, 0.3F), evm.b, dnq.qf.m()),
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
            new ewi(ImmutableList.of(new ewe(new ewg(dnq.qg, 0.5F), evm.b, dnq.a.m()), new ewe(new ewg(dnq.cr, 0.6F), evm.b, dnq.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new ewi(ImmutableList.of(new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.qf.m()), new ewe(new ewg(dnq.pZ, 1.0E-4F), evm.b, dnq.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.qf.m()),
                  new ewe(new ewg(dnq.qe, 0.15F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.qe, 0.01F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.qe, 0.5F), evm.b, dnq.qf.m()),
                  new ewe(new ewg(dnq.qe, 0.3F), evm.b, dnq.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(new ewe(new ewg(dnq.cr, 0.3F), evm.b, dnq.qf.m()), new ewe(evm.b, evm.b, new evn(0.0F, 0.05F, 0, 100, jc.a.b), dnq.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new evs(0.9F), new ewf(axn.bS)));
      a($$0, E, ImmutableList.of(new evs(0.1F), new ewf(axn.bS)));
      a($$0, F, ImmutableList.of(new evs(0.1F), new ewi(ImmutableList.of(new ewe(new evr(dnq.U), evm.b, dnq.cJ.m()))), new ewf(axn.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.tG, 0.3F), evm.b, dnq.tL.m()),
                  new ewe(new ewg(dnq.tC, 0.3F), evm.b, dnq.tM.m()),
                  new ewe(new ewg(dnq.oL, 0.05F), evm.b, dnq.a.m())
               )
            ),
            new ewf(axn.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new evs($$1.b(axn.bY), 0.95F),
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.tG, 0.3F), evm.b, dnq.tL.m()),
                  new ewe(new ewg(dnq.tC, 0.3F), evm.b, dnq.tM.m()),
                  new ewe(new ewg(dnq.oL, 0.05F), evm.b, dnq.a.m())
               )
            ),
            new ewf(axn.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new evs($$1.b(axn.bY), 0.95F),
            new ewi(
               ImmutableList.of(
                  new ewe(new ewg(dnq.tG, 0.3F), evm.b, dnq.tL.m()),
                  new ewe(new ewg(dnq.tC, 0.3F), evm.b, dnq.tM.m()),
                  new ewe(new ewg(dnq.tE, 0.3F), evm.b, dnq.a.m()),
                  new ewe(new ewg(dnq.oL, 0.05F), evm.b, dnq.a.m())
               )
            ),
            new ewf(axn.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new ewi(
               List.of(
                  new ewe(new ewg(dnq.O, 0.2F), evm.b, dnq.j.m()),
                  new ewe(new ewg(dnq.O, 0.1F), evm.b, dnq.k.m()),
                  new ewe(new ewg(dnq.fe, 0.1F), evm.b, dnq.fd.m())
               )
            ),
            a(fap.aZ, 6),
            a(fap.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new ewi(
               List.of(
                  new ewe(new ewg(dnq.O, 0.2F), evm.b, dnq.j.m()),
                  new ewe(new ewg(dnq.O, 0.1F), evm.b, dnq.k.m()),
                  new ewe(new ewg(dnq.fe, 0.1F), evm.b, dnq.fd.m())
               )
            ),
            a(fap.aZ, 2)
         )
      );
      a($$0, L, List.of(a(fap.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new ewi(
               List.of(
                  new ewe(new ewg(dnq.sW, 0.1F), evm.b, dnq.sZ.m().b(dpd.c, Boolean.valueOf(true))),
                  new ewe(new ewg(dnq.sW, 0.33333334F), evm.b, dnq.sY.m().b(dpd.c, Boolean.valueOf(true))),
                  new ewe(new ewg(dnq.sW, 0.5F), evm.b, dnq.sX.m().b(dpd.c, Boolean.valueOf(true)))
               )
            ),
            new ewf(axn.bS)
         )
      );
   }

   private static evu a(alq<fay> $$0, int $$1) {
      return new evu(new ewi(List.of(new ewe(new ewr(axn.cA), evm.b, ewb.b, dnq.P.m(), new ewt($$0)))), bue.a($$1));
   }
}
