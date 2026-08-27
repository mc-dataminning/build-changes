import com.google.common.collect.ImmutableList;
import java.util.List;

public class qf {
   private static final ajs<ejf> M = a("empty");
   public static final ajs<ejf> a = a("zombie_plains");
   public static final ajs<ejf> b = a("zombie_savanna");
   public static final ajs<ejf> c = a("zombie_snowy");
   public static final ajs<ejf> d = a("zombie_taiga");
   public static final ajs<ejf> e = a("zombie_desert");
   public static final ajs<ejf> f = a("mossify_10_percent");
   public static final ajs<ejf> g = a("mossify_20_percent");
   public static final ajs<ejf> h = a("mossify_70_percent");
   public static final ajs<ejf> i = a("street_plains");
   public static final ajs<ejf> j = a("street_savanna");
   public static final ajs<ejf> k = a("street_snowy_or_taiga");
   public static final ajs<ejf> l = a("farm_plains");
   public static final ajs<ejf> m = a("farm_savanna");
   public static final ajs<ejf> n = a("farm_snowy");
   public static final ajs<ejf> o = a("farm_taiga");
   public static final ajs<ejf> p = a("farm_desert");
   public static final ajs<ejf> q = a("outpost_rot");
   public static final ajs<ejf> r = a("bottom_rampart");
   public static final ajs<ejf> s = a("treasure_rooms");
   public static final ajs<ejf> t = a("housing");
   public static final ajs<ejf> u = a("side_wall_degradation");
   public static final ajs<ejf> v = a("stable_degradation");
   public static final ajs<ejf> w = a("bastion_generic_degradation");
   public static final ajs<ejf> x = a("rampart_degradation");
   public static final ajs<ejf> y = a("entrance_replacement");
   public static final ajs<ejf> z = a("bridge");
   public static final ajs<ejf> A = a("roof");
   public static final ajs<ejf> B = a("high_wall");
   public static final ajs<ejf> C = a("high_rampart");
   public static final ajs<ejf> D = a("fossil_rot");
   public static final ajs<ejf> E = a("fossil_coal");
   public static final ajs<ejf> F = a("fossil_diamonds");
   public static final ajs<ejf> G = a("ancient_city_start_degradation");
   public static final ajs<ejf> H = a("ancient_city_generic_degradation");
   public static final ajs<ejf> I = a("ancient_city_walls_degradation");
   public static final ajs<ejf> J = a("trail_ruins_houses_archaeology");
   public static final ajs<ejf> K = a("trail_ruins_roads_archaeology");
   public static final ajs<ejf> L = a("trail_ruins_tower_top_archaeology");

   private static ajs<ejf> a(String $$0) {
      return ajs.a(ks.aG, new ajt($$0));
   }

   private static void a(px<ejf> $$0, ajs<ejf> $$1, List<eje> $$2) {
      $$0.a($$1, new ejf($$2));
   }

   public static void a(px<ejf> $$0) {
      im<dby> $$1 = $$0.a(ks.f);
      eiw $$2 = new eiw(new eiy(dca.pr, 0.01F), eif.b, dca.pC.n());
      eiw $$3 = new eiw(new eiy(dca.pC, 0.5F), eif.b, dca.pr.n());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.m, 0.8F), eif.b, dca.cn.n()),
                  new eiw(new ejj(avc.p), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cp), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cq), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.m, 0.07F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.cn, 0.07F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.hj, 0.07F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.U, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.n, 0.1F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.cu, 0.1F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.al, 0.02F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.eY, 0.5F), eif.b, dca.bs.n()),
                  new eiw[]{
                     new eiw(
                        new eim(dca.eY.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))),
                        eif.b,
                        dca.hL.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))
                     ),
                     new eiw(
                        new eim(dca.eY.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))),
                        eif.b,
                        dca.hL.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))
                     ),
                     new eiw(new eiy(dca.cB, 0.3F), eif.b, dca.gt.n()),
                     new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.gu.n()),
                     new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new ejj(avc.p), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cp), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cq), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.r, 0.2F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.hP, 0.2F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.Y, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.as, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.hk, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.hn, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.hx, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.eY, 0.5F), eif.b, dca.bs.n()),
                  new eiw(
                     new eim(dca.eY.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))),
                     eif.b,
                     dca.hL.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))
                  ),
                  new eiw[]{
                     new eiw(
                        new eim(dca.eY.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))),
                        eif.b,
                        dca.hL.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))
                     ),
                     new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new ejj(avc.p), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cp), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cq), eif.b, dca.a.n()),
                  new eiw(new eik(dca.oe), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.o, 0.2F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.ju, 0.4F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.af, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.ax, 0.05F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.eY, 0.5F), eif.b, dca.bs.n()),
                  new eiw(
                     new eim(dca.eY.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))),
                     eif.b,
                     dca.hL.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))
                  ),
                  new eiw(
                     new eim(dca.eY.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))),
                     eif.b,
                     dca.hL.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))
                  ),
                  new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.gt.n()),
                  new eiw[]{new eiw(new eiy(dca.cB, 0.8F), eif.b, dca.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.m, 0.8F), eif.b, dca.cn.n()),
                  new eiw(new ejj(avc.p), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cp), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cq), eif.b, dca.a.n()),
                  new eiw(new eik(dca.og), eif.b, dca.og.n().a(dcm.c, Boolean.valueOf(false))),
                  new eiw(new eiy(dca.m, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.V, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.eY, 0.5F), eif.b, dca.bs.n()),
                  new eiw(
                     new eim(dca.eY.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))),
                     eif.b,
                     dca.hL.n().a(dfy.a, Boolean.valueOf(true)).a(dfy.c, Boolean.valueOf(true))
                  ),
                  new eiw(
                     new eim(dca.eY.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))),
                     eif.b,
                     dca.hL.n().a(dfy.b, Boolean.valueOf(true)).a(dfy.d, Boolean.valueOf(true))
                  ),
                  new eiw(new eiy(dca.cB, 0.3F), eif.b, dca.fd.n()),
                  new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.gu.n()),
                  new eiw[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new ejj(avc.p), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cp), eif.b, dca.a.n()),
                  new eiw(new eik(dca.cq), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.jS, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.aX, 0.1F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.iA, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.nl, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.ny, 0.08F), eif.b, dca.bs.n()),
                  new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.kD.n()),
                  new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.m, 0.1F), eif.b, dca.cn.n())))));
      a($$0, g, ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.m, 0.2F), eif.b, dca.cn.n())))));
      a($$0, h, ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.m, 0.7F), eif.b, dca.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eik(dca.kE), new eik(dca.G), dca.n.n()),
                  new eiw(new eiy(dca.kE, 0.1F), eif.b, dca.i.n()),
                  new eiw(new eik(dca.i), new eik(dca.G), dca.G.n()),
                  new eiw(new eik(dca.j), new eik(dca.G), dca.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eik(dca.kE), new eik(dca.G), dca.r.n()),
                  new eiw(new eiy(dca.kE, 0.2F), eif.b, dca.i.n()),
                  new eiw(new eik(dca.i), new eik(dca.G), dca.G.n()),
                  new eiw(new eik(dca.j), new eik(dca.G), dca.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eik(dca.kE), new eik(dca.G), dca.o.n()),
                  new eiw(new eik(dca.kE), new eik(dca.dO), dca.o.n()),
                  new eiw(new eiy(dca.kE, 0.2F), eif.b, dca.i.n()),
                  new eiw(new eik(dca.i), new eik(dca.G), dca.G.n()),
                  new eiw(new eik(dca.j), new eik(dca.G), dca.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.cB, 0.3F), eif.b, dca.gt.n()),
                  new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.gu.n()),
                  new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.gt.n()), new eiw(new eiy(dca.cB, 0.8F), eif.b, dca.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.cB, 0.3F), eif.b, dca.fd.n()), new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.cB, 0.2F), eif.b, dca.kD.n()), new eiw(new eiy(dca.cB, 0.1F), eif.b, dca.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new eil(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eja(ImmutableList.of(new eiw(new eiy(dca.kJ, 0.75F), eif.b, dca.px.n()), new eiw(new eiy(dca.px, 0.15F), eif.b, dca.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eja(ImmutableList.of(new eiw(new eiy(dca.pw, 0.35F), eif.b, dca.px.n()), new eiw(new eiy(dca.py, 0.1F), eif.b, dca.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eja(ImmutableList.of(new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.px.n()), new eiw(new eiy(dca.pr, 1.0E-4F), eif.b, dca.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eja(ImmutableList.of(new eiw(new eiy(dca.py, 0.5F), eif.b, dca.a.n()), new eiw(new eiy(dca.ch, 0.1F), eif.b, dca.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eja(ImmutableList.of(new eiw(new eiy(dca.pw, 0.1F), eif.b, dca.px.n()), new eiw(new eiy(dca.pr, 1.0E-4F), eif.b, dca.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.px.n()),
                  new eiw(new eiy(dca.pr, 1.0E-4F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.ch, 0.3F), eif.b, dca.px.n()),
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
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.pw, 0.4F), eif.b, dca.px.n()),
                  new eiw(new eiy(dca.pr, 0.01F), eif.b, dca.px.n()),
                  new eiw(new eiy(dca.pw, 1.0E-4F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.pr, 1.0E-4F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.ch, 0.3F), eif.b, dca.px.n()),
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
            new eja(ImmutableList.of(new eiw(new eiy(dca.py, 0.5F), eif.b, dca.a.n()), new eiw(new eiy(dca.ch, 0.6F), eif.b, dca.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eja(ImmutableList.of(new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.px.n()), new eiw(new eiy(dca.pr, 1.0E-4F), eif.b, dca.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.px.n()),
                  new eiw(new eiy(dca.pw, 0.15F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.pw, 0.01F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.pw, 0.5F), eif.b, dca.px.n()),
                  new eiw(new eiy(dca.pw, 0.3F), eif.b, dca.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eja(
               ImmutableList.of(new eiw(new eiy(dca.ch, 0.3F), eif.b, dca.px.n()), new eiw(eif.b, eif.b, new eig(0.0F, 0.05F, 0, 100, ih.a.b), dca.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eil(0.9F), new eix(avc.bI)));
      a($$0, E, ImmutableList.of(new eil(0.1F), new eix(avc.bI)));
      a($$0, F, ImmutableList.of(new eil(0.1F), new eja(ImmutableList.of(new eiw(new eik(dca.R), eif.b, dca.cy.n()))), new eix(avc.bI)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.sW, 0.3F), eif.b, dca.tb.n()),
                  new eiw(new eiy(dca.sS, 0.3F), eif.b, dca.tc.n()),
                  new eiw(new eiy(dca.of, 0.05F), eif.b, dca.a.n())
               )
            ),
            new eix(avc.bI)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eil($$1.b(avc.bO), 0.95F),
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.sW, 0.3F), eif.b, dca.tb.n()),
                  new eiw(new eiy(dca.sS, 0.3F), eif.b, dca.tc.n()),
                  new eiw(new eiy(dca.of, 0.05F), eif.b, dca.a.n())
               )
            ),
            new eix(avc.bI)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eil($$1.b(avc.bO), 0.95F),
            new eja(
               ImmutableList.of(
                  new eiw(new eiy(dca.sW, 0.3F), eif.b, dca.tb.n()),
                  new eiw(new eiy(dca.sS, 0.3F), eif.b, dca.tc.n()),
                  new eiw(new eiy(dca.sU, 0.3F), eif.b, dca.a.n()),
                  new eiw(new eiy(dca.of, 0.05F), eif.b, dca.a.n())
               )
            ),
            new eix(avc.bI)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eja(
               List.of(
                  new eiw(new eiy(dca.L, 0.2F), eif.b, dca.j.n()),
                  new eiw(new eiy(dca.L, 0.1F), eif.b, dca.k.n()),
                  new eiw(new eiy(dca.eM, 0.1F), eif.b, dca.eL.n())
               )
            ),
            a(emz.aS, 6),
            a(emz.aT, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eja(
               List.of(
                  new eiw(new eiy(dca.L, 0.2F), eif.b, dca.j.n()),
                  new eiw(new eiy(dca.L, 0.1F), eif.b, dca.k.n()),
                  new eiw(new eiy(dca.eM, 0.1F), eif.b, dca.eL.n())
               )
            ),
            a(emz.aS, 2)
         )
      );
      a($$0, L, List.of(a(emz.aS, 2)));
   }

   private static ein a(ajt $$0, int $$1) {
      return new ein(new eja(List.of(new eiw(new ejj(avc.cn), eif.b, eit.b, dca.M.n(), new ejl($$0)))), bnc.a($$1));
   }
}
