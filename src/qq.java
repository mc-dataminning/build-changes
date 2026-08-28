import com.google.common.collect.ImmutableList;
import java.util.List;

public class qq {
   private static final alj<ewd> N = a("empty");
   public static final alj<ewd> a = a("zombie_plains");
   public static final alj<ewd> b = a("zombie_savanna");
   public static final alj<ewd> c = a("zombie_snowy");
   public static final alj<ewd> d = a("zombie_taiga");
   public static final alj<ewd> e = a("zombie_desert");
   public static final alj<ewd> f = a("mossify_10_percent");
   public static final alj<ewd> g = a("mossify_20_percent");
   public static final alj<ewd> h = a("mossify_70_percent");
   public static final alj<ewd> i = a("street_plains");
   public static final alj<ewd> j = a("street_savanna");
   public static final alj<ewd> k = a("street_snowy_or_taiga");
   public static final alj<ewd> l = a("farm_plains");
   public static final alj<ewd> m = a("farm_savanna");
   public static final alj<ewd> n = a("farm_snowy");
   public static final alj<ewd> o = a("farm_taiga");
   public static final alj<ewd> p = a("farm_desert");
   public static final alj<ewd> q = a("outpost_rot");
   public static final alj<ewd> r = a("bottom_rampart");
   public static final alj<ewd> s = a("treasure_rooms");
   public static final alj<ewd> t = a("housing");
   public static final alj<ewd> u = a("side_wall_degradation");
   public static final alj<ewd> v = a("stable_degradation");
   public static final alj<ewd> w = a("bastion_generic_degradation");
   public static final alj<ewd> x = a("rampart_degradation");
   public static final alj<ewd> y = a("entrance_replacement");
   public static final alj<ewd> z = a("bridge");
   public static final alj<ewd> A = a("roof");
   public static final alj<ewd> B = a("high_wall");
   public static final alj<ewd> C = a("high_rampart");
   public static final alj<ewd> D = a("fossil_rot");
   public static final alj<ewd> E = a("fossil_coal");
   public static final alj<ewd> F = a("fossil_diamonds");
   public static final alj<ewd> G = a("ancient_city_start_degradation");
   public static final alj<ewd> H = a("ancient_city_generic_degradation");
   public static final alj<ewd> I = a("ancient_city_walls_degradation");
   public static final alj<ewd> J = a("trail_ruins_houses_archaeology");
   public static final alj<ewd> K = a("trail_ruins_roads_archaeology");
   public static final alj<ewd> L = a("trail_ruins_tower_top_archaeology");
   public static final alj<ewd> M = a("trial_chambers_copper_bulb_degradation");

   private static alj<ewd> a(String $$0) {
      return alj.a(mi.bc, alk.b($$0));
   }

   private static void a(qi<ewd> $$0, alj<ewd> $$1, List<ewc> $$2) {
      $$0.a($$1, new ewd($$2));
   }

   public static void a(qi<ewd> $$0) {
      jh<dne> $$1 = $$0.a(mi.i);
      evu $$2 = new evu(new evw(dng.pZ, 0.01F), evc.b, dng.qk.m());
      evu $$3 = new evu(new evw(dng.qk, 0.5F), evc.b, dng.pZ.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.m, 0.8F), evc.b, dng.cx.m()),
                  new evu(new ewh(axg.q), evc.b, dng.a.m()),
                  new evu(new evh(dng.cz), evc.b, dng.a.m()),
                  new evu(new evh(dng.cA), evc.b, dng.a.m()),
                  new evu(new evw(dng.m, 0.07F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.cx, 0.07F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.hK, 0.07F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.X, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.n, 0.1F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.cF, 0.1F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.aq, 0.02F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.fq, 0.5F), evc.b, dng.bz.m()),
                  new evu[]{
                     new evu(
                        new evj(dng.fq.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))),
                        evc.b,
                        dng.im.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))
                     ),
                     new evu(
                        new evj(dng.fq.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))),
                        evc.b,
                        dng.im.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))
                     ),
                     new evu(new evw(dng.cM, 0.3F), evc.b, dng.gT.m()),
                     new evu(new evw(dng.cM, 0.2F), evc.b, dng.gU.m()),
                     new evu(new evw(dng.cM, 0.1F), evc.b, dng.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new ewh(axg.q), evc.b, dng.a.m()),
                  new evu(new evh(dng.cz), evc.b, dng.a.m()),
                  new evu(new evh(dng.cA), evc.b, dng.a.m()),
                  new evu(new evw(dng.r, 0.2F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.iq, 0.2F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.ab, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.ax, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.hL, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.hO, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.hY, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.fq, 0.5F), evc.b, dng.bz.m()),
                  new evu(
                     new evj(dng.fq.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))),
                     evc.b,
                     dng.im.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))
                  ),
                  new evu[]{
                     new evu(
                        new evj(dng.fq.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))),
                        evc.b,
                        dng.im.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))
                     ),
                     new evu(new evw(dng.cM, 0.1F), evc.b, dng.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new ewh(axg.q), evc.b, dng.a.m()),
                  new evu(new evh(dng.cz), evc.b, dng.a.m()),
                  new evu(new evh(dng.cA), evc.b, dng.a.m()),
                  new evu(new evh(dng.oK), evc.b, dng.a.m()),
                  new evu(new evw(dng.o, 0.2F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.jW, 0.4F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.aj, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.aC, 0.05F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.fq, 0.5F), evc.b, dng.bz.m()),
                  new evu(
                     new evj(dng.fq.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))),
                     evc.b,
                     dng.im.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))
                  ),
                  new evu(
                     new evj(dng.fq.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))),
                     evc.b,
                     dng.im.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))
                  ),
                  new evu(new evw(dng.cM, 0.1F), evc.b, dng.gT.m()),
                  new evu[]{new evu(new evw(dng.cM, 0.8F), evc.b, dng.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.m, 0.8F), evc.b, dng.cx.m()),
                  new evu(new ewh(axg.q), evc.b, dng.a.m()),
                  new evu(new evh(dng.cz), evc.b, dng.a.m()),
                  new evu(new evh(dng.cA), evc.b, dng.a.m()),
                  new evu(new evh(dng.oM), evc.b, dng.oM.m().b(dnu.b, Boolean.valueOf(false))),
                  new evu(new evw(dng.m, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.Y, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.fq, 0.5F), evc.b, dng.bz.m()),
                  new evu(
                     new evj(dng.fq.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))),
                     evc.b,
                     dng.im.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true))
                  ),
                  new evu(
                     new evj(dng.fq.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))),
                     evc.b,
                     dng.im.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true))
                  ),
                  new evu(new evw(dng.cM, 0.3F), evc.b, dng.fv.m()),
                  new evu(new evw(dng.cM, 0.2F), evc.b, dng.gU.m()),
                  new evu[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new ewh(axg.q), evc.b, dng.a.m()),
                  new evu(new evh(dng.cz), evc.b, dng.a.m()),
                  new evu(new evh(dng.cA), evc.b, dng.a.m()),
                  new evu(new evw(dng.kv, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.be, 0.1F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.jc, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.nR, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.oe, 0.08F), evc.b, dng.bz.m()),
                  new evu(new evw(dng.cM, 0.2F), evc.b, dng.lj.m()),
                  new evu(new evw(dng.cM, 0.1F), evc.b, dng.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.m, 0.1F), evc.b, dng.cx.m())))));
      a($$0, g, ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.m, 0.2F), evc.b, dng.cx.m())))));
      a($$0, h, ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.m, 0.7F), evc.b, dng.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evh(dng.lk), new evh(dng.J), dng.n.m()),
                  new evu(new evw(dng.lk, 0.1F), evc.b, dng.i.m()),
                  new evu(new evh(dng.i), new evh(dng.J), dng.J.m()),
                  new evu(new evh(dng.j), new evh(dng.J), dng.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evh(dng.lk), new evh(dng.J), dng.r.m()),
                  new evu(new evw(dng.lk, 0.2F), evc.b, dng.i.m()),
                  new evu(new evh(dng.i), new evh(dng.J), dng.J.m()),
                  new evu(new evh(dng.j), new evh(dng.J), dng.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evh(dng.lk), new evh(dng.J), dng.o.m()),
                  new evu(new evh(dng.lk), new evh(dng.ee), dng.o.m()),
                  new evu(new evw(dng.lk, 0.2F), evc.b, dng.i.m()),
                  new evu(new evh(dng.i), new evh(dng.J), dng.J.m()),
                  new evu(new evh(dng.j), new evh(dng.J), dng.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.cM, 0.3F), evc.b, dng.gT.m()),
                  new evu(new evw(dng.cM, 0.2F), evc.b, dng.gU.m()),
                  new evu(new evw(dng.cM, 0.1F), evc.b, dng.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.cM, 0.1F), evc.b, dng.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.cM, 0.1F), evc.b, dng.gT.m()), new evu(new evw(dng.cM, 0.8F), evc.b, dng.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.cM, 0.3F), evc.b, dng.fv.m()), new evu(new evw(dng.cM, 0.2F), evc.b, dng.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.cM, 0.2F), evc.b, dng.lj.m()), new evu(new evw(dng.cM, 0.1F), evc.b, dng.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new evi(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new evy(ImmutableList.of(new evu(new evw(dng.lp, 0.75F), evc.b, dng.qf.m()), new evu(new evw(dng.qf, 0.15F), evc.b, dng.qe.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new evy(ImmutableList.of(new evu(new evw(dng.qe, 0.35F), evc.b, dng.qf.m()), new evu(new evw(dng.qg, 0.1F), evc.b, dng.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new evy(ImmutableList.of(new evu(new evw(dng.qe, 0.3F), evc.b, dng.qf.m()), new evu(new evw(dng.pZ, 1.0E-4F), evc.b, dng.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new evy(ImmutableList.of(new evu(new evw(dng.qg, 0.5F), evc.b, dng.a.m()), new evu(new evw(dng.cr, 0.1F), evc.b, dng.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new evy(ImmutableList.of(new evu(new evw(dng.qe, 0.1F), evc.b, dng.qf.m()), new evu(new evw(dng.pZ, 1.0E-4F), evc.b, dng.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.qe, 0.3F), evc.b, dng.qf.m()),
                  new evu(new evw(dng.pZ, 1.0E-4F), evc.b, dng.a.m()),
                  new evu(new evw(dng.cr, 0.3F), evc.b, dng.qf.m()),
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
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.qe, 0.4F), evc.b, dng.qf.m()),
                  new evu(new evw(dng.pZ, 0.01F), evc.b, dng.qf.m()),
                  new evu(new evw(dng.qe, 1.0E-4F), evc.b, dng.a.m()),
                  new evu(new evw(dng.pZ, 1.0E-4F), evc.b, dng.a.m()),
                  new evu(new evw(dng.cr, 0.3F), evc.b, dng.qf.m()),
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
            new evy(ImmutableList.of(new evu(new evw(dng.qg, 0.5F), evc.b, dng.a.m()), new evu(new evw(dng.cr, 0.6F), evc.b, dng.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new evy(ImmutableList.of(new evu(new evw(dng.qe, 0.3F), evc.b, dng.qf.m()), new evu(new evw(dng.pZ, 1.0E-4F), evc.b, dng.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.qe, 0.3F), evc.b, dng.qf.m()),
                  new evu(new evw(dng.qe, 0.15F), evc.b, dng.a.m()),
                  new evu(new evw(dng.qe, 0.3F), evc.b, dng.pZ.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.qe, 0.01F), evc.b, dng.a.m()),
                  new evu(new evw(dng.qe, 0.5F), evc.b, dng.qf.m()),
                  new evu(new evw(dng.qe, 0.3F), evc.b, dng.pZ.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new evy(
               ImmutableList.of(new evu(new evw(dng.cr, 0.3F), evc.b, dng.qf.m()), new evu(evc.b, evc.b, new evd(0.0F, 0.05F, 0, 100, jc.a.b), dng.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new evi(0.9F), new evv(axg.bS)));
      a($$0, E, ImmutableList.of(new evi(0.1F), new evv(axg.bS)));
      a($$0, F, ImmutableList.of(new evi(0.1F), new evy(ImmutableList.of(new evu(new evh(dng.U), evc.b, dng.cJ.m()))), new evv(axg.bS)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.tG, 0.3F), evc.b, dng.tL.m()),
                  new evu(new evw(dng.tC, 0.3F), evc.b, dng.tM.m()),
                  new evu(new evw(dng.oL, 0.05F), evc.b, dng.a.m())
               )
            ),
            new evv(axg.bS)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new evi($$1.b(axg.bY), 0.95F),
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.tG, 0.3F), evc.b, dng.tL.m()),
                  new evu(new evw(dng.tC, 0.3F), evc.b, dng.tM.m()),
                  new evu(new evw(dng.oL, 0.05F), evc.b, dng.a.m())
               )
            ),
            new evv(axg.bS)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new evi($$1.b(axg.bY), 0.95F),
            new evy(
               ImmutableList.of(
                  new evu(new evw(dng.tG, 0.3F), evc.b, dng.tL.m()),
                  new evu(new evw(dng.tC, 0.3F), evc.b, dng.tM.m()),
                  new evu(new evw(dng.tE, 0.3F), evc.b, dng.a.m()),
                  new evu(new evw(dng.oL, 0.05F), evc.b, dng.a.m())
               )
            ),
            new evv(axg.bS)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new evy(
               List.of(
                  new evu(new evw(dng.O, 0.2F), evc.b, dng.j.m()),
                  new evu(new evw(dng.O, 0.1F), evc.b, dng.k.m()),
                  new evu(new evw(dng.fe, 0.1F), evc.b, dng.fd.m())
               )
            ),
            a(faf.aZ, 6),
            a(faf.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new evy(
               List.of(
                  new evu(new evw(dng.O, 0.2F), evc.b, dng.j.m()),
                  new evu(new evw(dng.O, 0.1F), evc.b, dng.k.m()),
                  new evu(new evw(dng.fe, 0.1F), evc.b, dng.fd.m())
               )
            ),
            a(faf.aZ, 2)
         )
      );
      a($$0, L, List.of(a(faf.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new evy(
               List.of(
                  new evu(new evw(dng.sW, 0.1F), evc.b, dng.sZ.m().b(dot.c, Boolean.valueOf(true))),
                  new evu(new evw(dng.sW, 0.33333334F), evc.b, dng.sY.m().b(dot.c, Boolean.valueOf(true))),
                  new evu(new evw(dng.sW, 0.5F), evc.b, dng.sX.m().b(dot.c, Boolean.valueOf(true)))
               )
            ),
            new evv(axg.bS)
         )
      );
   }

   private static evk a(alj<fao> $$0, int $$1) {
      return new evk(new evy(List.of(new evu(new ewh(axg.cA), evc.b, evr.b, dng.P.m(), new ewj($$0)))), btv.a($$1));
   }
}
