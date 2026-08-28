import com.google.common.collect.ImmutableList;
import java.util.List;

public class qp {
   private static final alh<ewb> N = a("empty");
   public static final alh<ewb> a = a("zombie_plains");
   public static final alh<ewb> b = a("zombie_savanna");
   public static final alh<ewb> c = a("zombie_snowy");
   public static final alh<ewb> d = a("zombie_taiga");
   public static final alh<ewb> e = a("zombie_desert");
   public static final alh<ewb> f = a("mossify_10_percent");
   public static final alh<ewb> g = a("mossify_20_percent");
   public static final alh<ewb> h = a("mossify_70_percent");
   public static final alh<ewb> i = a("street_plains");
   public static final alh<ewb> j = a("street_savanna");
   public static final alh<ewb> k = a("street_snowy_or_taiga");
   public static final alh<ewb> l = a("farm_plains");
   public static final alh<ewb> m = a("farm_savanna");
   public static final alh<ewb> n = a("farm_snowy");
   public static final alh<ewb> o = a("farm_taiga");
   public static final alh<ewb> p = a("farm_desert");
   public static final alh<ewb> q = a("outpost_rot");
   public static final alh<ewb> r = a("bottom_rampart");
   public static final alh<ewb> s = a("treasure_rooms");
   public static final alh<ewb> t = a("housing");
   public static final alh<ewb> u = a("side_wall_degradation");
   public static final alh<ewb> v = a("stable_degradation");
   public static final alh<ewb> w = a("bastion_generic_degradation");
   public static final alh<ewb> x = a("rampart_degradation");
   public static final alh<ewb> y = a("entrance_replacement");
   public static final alh<ewb> z = a("bridge");
   public static final alh<ewb> A = a("roof");
   public static final alh<ewb> B = a("high_wall");
   public static final alh<ewb> C = a("high_rampart");
   public static final alh<ewb> D = a("fossil_rot");
   public static final alh<ewb> E = a("fossil_coal");
   public static final alh<ewb> F = a("fossil_diamonds");
   public static final alh<ewb> G = a("ancient_city_start_degradation");
   public static final alh<ewb> H = a("ancient_city_generic_degradation");
   public static final alh<ewb> I = a("ancient_city_walls_degradation");
   public static final alh<ewb> J = a("trail_ruins_houses_archaeology");
   public static final alh<ewb> K = a("trail_ruins_roads_archaeology");
   public static final alh<ewb> L = a("trail_ruins_tower_top_archaeology");
   public static final alh<ewb> M = a("trial_chambers_copper_bulb_degradation");

   private static alh<ewb> a(String $$0) {
      return alh.a(mh.bc, ali.b($$0));
   }

   private static void a(qh<ewb> $$0, alh<ewb> $$1, List<ewa> $$2) {
      $$0.a($$1, new ewb($$2));
   }

   public static void a(qh<ewb> $$0) {
      jg<dnc> $$1 = $$0.a(mh.i);
      evs $$2 = new evs(new evu(dne.pZ, 0.01F), eva.b, dne.qk.m());
      evs $$3 = new evs(new evu(dne.qk, 0.5F), eva.b, dne.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.m, 0.8F), eva.b, dne.cx.m()),
                  new evs(new ewf(axe.q), eva.b, dne.a.m()),
                  new evs(new evf(dne.cz), eva.b, dne.a.m()),
                  new evs(new evf(dne.cA), eva.b, dne.a.m()),
                  new evs(new evu(dne.m, 0.07F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.cx, 0.07F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.hK, 0.07F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.X, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.n, 0.1F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.cF, 0.1F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.aq, 0.02F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.fq, 0.5F), eva.b, dne.bz.m()),
                  new evs[]{
                     new evs(
                        new evh(dne.fq.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))),
                        eva.b,
                        dne.im.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))
                     ),
                     new evs(
                        new evh(dne.fq.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))),
                        eva.b,
                        dne.im.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))
                     ),
                     new evs(new evu(dne.cM, 0.3F), eva.b, dne.gT.m()),
                     new evs(new evu(dne.cM, 0.2F), eva.b, dne.gU.m()),
                     new evs(new evu(dne.cM, 0.1F), eva.b, dne.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new ewf(axe.q), eva.b, dne.a.m()),
                  new evs(new evf(dne.cz), eva.b, dne.a.m()),
                  new evs(new evf(dne.cA), eva.b, dne.a.m()),
                  new evs(new evu(dne.r, 0.2F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.iq, 0.2F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.ab, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.ax, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.hL, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.hO, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.hY, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.fq, 0.5F), eva.b, dne.bz.m()),
                  new evs(
                     new evh(dne.fq.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))),
                     eva.b,
                     dne.im.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))
                  ),
                  new evs[]{
                     new evs(
                        new evh(dne.fq.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))),
                        eva.b,
                        dne.im.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))
                     ),
                     new evs(new evu(dne.cM, 0.1F), eva.b, dne.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new ewf(axe.q), eva.b, dne.a.m()),
                  new evs(new evf(dne.cz), eva.b, dne.a.m()),
                  new evs(new evf(dne.cA), eva.b, dne.a.m()),
                  new evs(new evf(dne.oK), eva.b, dne.a.m()),
                  new evs(new evu(dne.o, 0.2F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.jW, 0.4F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.aj, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.aC, 0.05F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.fq, 0.5F), eva.b, dne.bz.m()),
                  new evs(
                     new evh(dne.fq.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))),
                     eva.b,
                     dne.im.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))
                  ),
                  new evs(
                     new evh(dne.fq.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))),
                     eva.b,
                     dne.im.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))
                  ),
                  new evs(new evu(dne.cM, 0.1F), eva.b, dne.gT.m()),
                  new evs[]{new evs(new evu(dne.cM, 0.8F), eva.b, dne.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.m, 0.8F), eva.b, dne.cx.m()),
                  new evs(new ewf(axe.q), eva.b, dne.a.m()),
                  new evs(new evf(dne.cz), eva.b, dne.a.m()),
                  new evs(new evf(dne.cA), eva.b, dne.a.m()),
                  new evs(new evf(dne.oM), eva.b, dne.oM.m().b(dns.b, Boolean.valueOf(false))),
                  new evs(new evu(dne.m, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.Y, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.fq, 0.5F), eva.b, dne.bz.m()),
                  new evs(
                     new evh(dne.fq.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))),
                     eva.b,
                     dne.im.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true))
                  ),
                  new evs(
                     new evh(dne.fq.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))),
                     eva.b,
                     dne.im.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true))
                  ),
                  new evs(new evu(dne.cM, 0.3F), eva.b, dne.fv.m()),
                  new evs(new evu(dne.cM, 0.2F), eva.b, dne.gU.m()),
                  new evs[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new ewf(axe.q), eva.b, dne.a.m()),
                  new evs(new evf(dne.cz), eva.b, dne.a.m()),
                  new evs(new evf(dne.cA), eva.b, dne.a.m()),
                  new evs(new evu(dne.kv, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.be, 0.1F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.jc, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.nR, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.oe, 0.08F), eva.b, dne.bz.m()),
                  new evs(new evu(dne.cM, 0.2F), eva.b, dne.lj.m()),
                  new evs(new evu(dne.cM, 0.1F), eva.b, dne.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.m, 0.1F), eva.b, dne.cx.m())))));
      a($$0, g, ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.m, 0.2F), eva.b, dne.cx.m())))));
      a($$0, h, ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.m, 0.7F), eva.b, dne.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evf(dne.lk), new evf(dne.J), dne.n.m()),
                  new evs(new evu(dne.lk, 0.1F), eva.b, dne.i.m()),
                  new evs(new evf(dne.i), new evf(dne.J), dne.J.m()),
                  new evs(new evf(dne.j), new evf(dne.J), dne.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evf(dne.lk), new evf(dne.J), dne.r.m()),
                  new evs(new evu(dne.lk, 0.2F), eva.b, dne.i.m()),
                  new evs(new evf(dne.i), new evf(dne.J), dne.J.m()),
                  new evs(new evf(dne.j), new evf(dne.J), dne.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evf(dne.lk), new evf(dne.J), dne.o.m()),
                  new evs(new evf(dne.lk), new evf(dne.ee), dne.o.m()),
                  new evs(new evu(dne.lk, 0.2F), eva.b, dne.i.m()),
                  new evs(new evf(dne.i), new evf(dne.J), dne.J.m()),
                  new evs(new evf(dne.j), new evf(dne.J), dne.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.cM, 0.3F), eva.b, dne.gT.m()),
                  new evs(new evu(dne.cM, 0.2F), eva.b, dne.gU.m()),
                  new evs(new evu(dne.cM, 0.1F), eva.b, dne.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.cM, 0.1F), eva.b, dne.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.cM, 0.1F), eva.b, dne.gT.m()), new evs(new evu(dne.cM, 0.8F), eva.b, dne.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.cM, 0.3F), eva.b, dne.fv.m()), new evs(new evu(dne.cM, 0.2F), eva.b, dne.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.cM, 0.2F), eva.b, dne.lj.m()), new evs(new evu(dne.cM, 0.1F), eva.b, dne.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new evg(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new evw(ImmutableList.of(new evs(new evu(dne.lp, 0.75F), eva.b, dne.qf.m()), new evs(new evu(dne.qf, 0.15F), eva.b, dne.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new evw(ImmutableList.of(new evs(new evu(dne.qe, 0.35F), eva.b, dne.qf.m()), new evs(new evu(dne.qg, 0.1F), eva.b, dne.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new evw(ImmutableList.of(new evs(new evu(dne.qe, 0.3F), eva.b, dne.qf.m()), new evs(new evu(dne.pZ, 1.0E-4F), eva.b, dne.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new evw(ImmutableList.of(new evs(new evu(dne.qg, 0.5F), eva.b, dne.a.m()), new evs(new evu(dne.cr, 0.1F), eva.b, dne.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new evw(ImmutableList.of(new evs(new evu(dne.qe, 0.1F), eva.b, dne.qf.m()), new evs(new evu(dne.pZ, 1.0E-4F), eva.b, dne.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.qe, 0.3F), eva.b, dne.qf.m()),
                  new evs(new evu(dne.pZ, 1.0E-4F), eva.b, dne.a.m()),
                  new evs(new evu(dne.cr, 0.3F), eva.b, dne.qf.m()),
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
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.qe, 0.4F), eva.b, dne.qf.m()),
                  new evs(new evu(dne.pZ, 0.01F), eva.b, dne.qf.m()),
                  new evs(new evu(dne.qe, 1.0E-4F), eva.b, dne.a.m()),
                  new evs(new evu(dne.pZ, 1.0E-4F), eva.b, dne.a.m()),
                  new evs(new evu(dne.cr, 0.3F), eva.b, dne.qf.m()),
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
            new evw(ImmutableList.of(new evs(new evu(dne.qg, 0.5F), eva.b, dne.a.m()), new evs(new evu(dne.cr, 0.6F), eva.b, dne.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new evw(ImmutableList.of(new evs(new evu(dne.qe, 0.3F), eva.b, dne.qf.m()), new evs(new evu(dne.pZ, 1.0E-4F), eva.b, dne.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.qe, 0.3F), eva.b, dne.qf.m()),
                  new evs(new evu(dne.qe, 0.15F), eva.b, dne.a.m()),
                  new evs(new evu(dne.qe, 0.3F), eva.b, dne.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.qe, 0.01F), eva.b, dne.a.m()),
                  new evs(new evu(dne.qe, 0.5F), eva.b, dne.qf.m()),
                  new evs(new evu(dne.qe, 0.3F), eva.b, dne.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new evw(
               ImmutableList.of(new evs(new evu(dne.cr, 0.3F), eva.b, dne.qf.m()), new evs(eva.b, eva.b, new evb(0.0F, 0.05F, 0, 100, jb.a.b), dne.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new evg(0.9F), new evt(axe.bS)));
      a($$0, E, ImmutableList.of(new evg(0.1F), new evt(axe.bS)));
      a($$0, F, ImmutableList.of(new evg(0.1F), new evw(ImmutableList.of(new evs(new evf(dne.U), eva.b, dne.cJ.m()))), new evt(axe.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.tG, 0.3F), eva.b, dne.tL.m()),
                  new evs(new evu(dne.tC, 0.3F), eva.b, dne.tM.m()),
                  new evs(new evu(dne.oL, 0.05F), eva.b, dne.a.m())
               )
            ),
            new evt(axe.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new evg($$1.b(axe.bY), 0.95F),
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.tG, 0.3F), eva.b, dne.tL.m()),
                  new evs(new evu(dne.tC, 0.3F), eva.b, dne.tM.m()),
                  new evs(new evu(dne.oL, 0.05F), eva.b, dne.a.m())
               )
            ),
            new evt(axe.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new evg($$1.b(axe.bY), 0.95F),
            new evw(
               ImmutableList.of(
                  new evs(new evu(dne.tG, 0.3F), eva.b, dne.tL.m()),
                  new evs(new evu(dne.tC, 0.3F), eva.b, dne.tM.m()),
                  new evs(new evu(dne.tE, 0.3F), eva.b, dne.a.m()),
                  new evs(new evu(dne.oL, 0.05F), eva.b, dne.a.m())
               )
            ),
            new evt(axe.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new evw(
               List.of(
                  new evs(new evu(dne.O, 0.2F), eva.b, dne.j.m()),
                  new evs(new evu(dne.O, 0.1F), eva.b, dne.k.m()),
                  new evs(new evu(dne.fe, 0.1F), eva.b, dne.fd.m())
               )
            ),
            a(fad.aZ, 6),
            a(fad.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new evw(
               List.of(
                  new evs(new evu(dne.O, 0.2F), eva.b, dne.j.m()),
                  new evs(new evu(dne.O, 0.1F), eva.b, dne.k.m()),
                  new evs(new evu(dne.fe, 0.1F), eva.b, dne.fd.m())
               )
            ),
            a(fad.aZ, 2)
         )
      );
      a($$0, L, List.of(a(fad.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new evw(
               List.of(
                  new evs(new evu(dne.sW, 0.1F), eva.b, dne.sZ.m().b(dor.c, Boolean.valueOf(true))),
                  new evs(new evu(dne.sW, 0.33333334F), eva.b, dne.sY.m().b(dor.c, Boolean.valueOf(true))),
                  new evs(new evu(dne.sW, 0.5F), eva.b, dne.sX.m().b(dor.c, Boolean.valueOf(true)))
               )
            ),
            new evt(axe.bS)
         )
      );
   }

   private static evi a(alh<fam> $$0, int $$1) {
      return new evi(new evw(List.of(new evs(new ewf(axe.cA), eva.b, evp.b, dne.P.m(), new ewh($$0)))), btt.a($$1));
   }
}
