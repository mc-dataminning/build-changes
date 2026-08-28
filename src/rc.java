import com.google.common.collect.ImmutableList;
import java.util.List;

public class rc {
   private static final ald<epg> N = a("empty");
   public static final ald<epg> a = a("zombie_plains");
   public static final ald<epg> b = a("zombie_savanna");
   public static final ald<epg> c = a("zombie_snowy");
   public static final ald<epg> d = a("zombie_taiga");
   public static final ald<epg> e = a("zombie_desert");
   public static final ald<epg> f = a("mossify_10_percent");
   public static final ald<epg> g = a("mossify_20_percent");
   public static final ald<epg> h = a("mossify_70_percent");
   public static final ald<epg> i = a("street_plains");
   public static final ald<epg> j = a("street_savanna");
   public static final ald<epg> k = a("street_snowy_or_taiga");
   public static final ald<epg> l = a("farm_plains");
   public static final ald<epg> m = a("farm_savanna");
   public static final ald<epg> n = a("farm_snowy");
   public static final ald<epg> o = a("farm_taiga");
   public static final ald<epg> p = a("farm_desert");
   public static final ald<epg> q = a("outpost_rot");
   public static final ald<epg> r = a("bottom_rampart");
   public static final ald<epg> s = a("treasure_rooms");
   public static final ald<epg> t = a("housing");
   public static final ald<epg> u = a("side_wall_degradation");
   public static final ald<epg> v = a("stable_degradation");
   public static final ald<epg> w = a("bastion_generic_degradation");
   public static final ald<epg> x = a("rampart_degradation");
   public static final ald<epg> y = a("entrance_replacement");
   public static final ald<epg> z = a("bridge");
   public static final ald<epg> A = a("roof");
   public static final ald<epg> B = a("high_wall");
   public static final ald<epg> C = a("high_rampart");
   public static final ald<epg> D = a("fossil_rot");
   public static final ald<epg> E = a("fossil_coal");
   public static final ald<epg> F = a("fossil_diamonds");
   public static final ald<epg> G = a("ancient_city_start_degradation");
   public static final ald<epg> H = a("ancient_city_generic_degradation");
   public static final ald<epg> I = a("ancient_city_walls_degradation");
   public static final ald<epg> J = a("trail_ruins_houses_archaeology");
   public static final ald<epg> K = a("trail_ruins_roads_archaeology");
   public static final ald<epg> L = a("trail_ruins_tower_top_archaeology");
   public static final ald<epg> M = a("trial_chambers_copper_bulb_degradation");

   private static ald<epg> a(String $$0) {
      return ald.a(lw.aU, ale.b($$0));
   }

   private static void a(qu<epg> $$0, ald<epg> $$1, List<epf> $$2) {
      $$0.a($$1, new epg($$2));
   }

   public static void a(qu<epg> $$0) {
      jp<dhm> $$1 = $$0.a(lw.f);
      eox $$2 = new eox(new eoz(dho.pr, 0.01F), eof.b, dho.pC.n());
      eox $$3 = new eox(new eoz(dho.pC, 0.5F), eof.b, dho.pr.n());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.m, 0.8F), eof.b, dho.cn.n()),
                  new eox(new epk(awv.q), eof.b, dho.a.n()),
                  new eox(new eok(dho.cp), eof.b, dho.a.n()),
                  new eox(new eok(dho.cq), eof.b, dho.a.n()),
                  new eox(new eoz(dho.m, 0.07F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.cn, 0.07F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.hj, 0.07F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.U, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.n, 0.1F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.cu, 0.1F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.al, 0.02F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.eY, 0.5F), eof.b, dho.bs.n()),
                  new eox[]{
                     new eox(
                        new eom(dho.eY.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))),
                        eof.b,
                        dho.hL.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))
                     ),
                     new eox(
                        new eom(dho.eY.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))),
                        eof.b,
                        dho.hL.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))
                     ),
                     new eox(new eoz(dho.cB, 0.3F), eof.b, dho.gt.n()),
                     new eox(new eoz(dho.cB, 0.2F), eof.b, dho.gu.n()),
                     new eox(new eoz(dho.cB, 0.1F), eof.b, dho.kD.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new epk(awv.q), eof.b, dho.a.n()),
                  new eox(new eok(dho.cp), eof.b, dho.a.n()),
                  new eox(new eok(dho.cq), eof.b, dho.a.n()),
                  new eox(new eoz(dho.r, 0.2F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.hP, 0.2F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.Y, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.as, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.hk, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.hn, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.hx, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.eY, 0.5F), eof.b, dho.bs.n()),
                  new eox(
                     new eom(dho.eY.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))),
                     eof.b,
                     dho.hL.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))
                  ),
                  new eox[]{
                     new eox(
                        new eom(dho.eY.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))),
                        eof.b,
                        dho.hL.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))
                     ),
                     new eox(new eoz(dho.cB, 0.1F), eof.b, dho.fe.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new epk(awv.q), eof.b, dho.a.n()),
                  new eox(new eok(dho.cp), eof.b, dho.a.n()),
                  new eox(new eok(dho.cq), eof.b, dho.a.n()),
                  new eox(new eok(dho.oe), eof.b, dho.a.n()),
                  new eox(new eoz(dho.o, 0.2F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.ju, 0.4F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.af, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.ax, 0.05F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.eY, 0.5F), eof.b, dho.bs.n()),
                  new eox(
                     new eom(dho.eY.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))),
                     eof.b,
                     dho.hL.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))
                  ),
                  new eox(
                     new eom(dho.eY.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))),
                     eof.b,
                     dho.hL.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))
                  ),
                  new eox(new eoz(dho.cB, 0.1F), eof.b, dho.gt.n()),
                  new eox[]{new eox(new eoz(dho.cB, 0.8F), eof.b, dho.gu.n())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.m, 0.8F), eof.b, dho.cn.n()),
                  new eox(new epk(awv.q), eof.b, dho.a.n()),
                  new eox(new eok(dho.cp), eof.b, dho.a.n()),
                  new eox(new eok(dho.cq), eof.b, dho.a.n()),
                  new eox(new eok(dho.og), eof.b, dho.og.n().b(dia.c, Boolean.valueOf(false))),
                  new eox(new eoz(dho.m, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.V, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.eY, 0.5F), eof.b, dho.bs.n()),
                  new eox(
                     new eom(dho.eY.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))),
                     eof.b,
                     dho.hL.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true))
                  ),
                  new eox(
                     new eom(dho.eY.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))),
                     eof.b,
                     dho.hL.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true))
                  ),
                  new eox(new eoz(dho.cB, 0.3F), eof.b, dho.fd.n()),
                  new eox(new eoz(dho.cB, 0.2F), eof.b, dho.gu.n()),
                  new eox[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new epk(awv.q), eof.b, dho.a.n()),
                  new eox(new eok(dho.cp), eof.b, dho.a.n()),
                  new eox(new eok(dho.cq), eof.b, dho.a.n()),
                  new eox(new eoz(dho.jS, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.aX, 0.1F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.iA, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.nl, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.ny, 0.08F), eof.b, dho.bs.n()),
                  new eox(new eoz(dho.cB, 0.2F), eof.b, dho.kD.n()),
                  new eox(new eoz(dho.cB, 0.1F), eof.b, dho.fe.n())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.m, 0.1F), eof.b, dho.cn.n())))));
      a($$0, g, ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.m, 0.2F), eof.b, dho.cn.n())))));
      a($$0, h, ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.m, 0.7F), eof.b, dho.cn.n())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eok(dho.kE), new eok(dho.G), dho.n.n()),
                  new eox(new eoz(dho.kE, 0.1F), eof.b, dho.i.n()),
                  new eox(new eok(dho.i), new eok(dho.G), dho.G.n()),
                  new eox(new eok(dho.j), new eok(dho.G), dho.G.n())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eok(dho.kE), new eok(dho.G), dho.r.n()),
                  new eox(new eoz(dho.kE, 0.2F), eof.b, dho.i.n()),
                  new eox(new eok(dho.i), new eok(dho.G), dho.G.n()),
                  new eox(new eok(dho.j), new eok(dho.G), dho.G.n())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eok(dho.kE), new eok(dho.G), dho.o.n()),
                  new eox(new eok(dho.kE), new eok(dho.dO), dho.o.n()),
                  new eox(new eoz(dho.kE, 0.2F), eof.b, dho.i.n()),
                  new eox(new eok(dho.i), new eok(dho.G), dho.G.n()),
                  new eox(new eok(dho.j), new eok(dho.G), dho.G.n())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.cB, 0.3F), eof.b, dho.gt.n()),
                  new eox(new eoz(dho.cB, 0.2F), eof.b, dho.gu.n()),
                  new eox(new eoz(dho.cB, 0.1F), eof.b, dho.kD.n())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.cB, 0.1F), eof.b, dho.fe.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.cB, 0.1F), eof.b, dho.gt.n()), new eox(new eoz(dho.cB, 0.8F), eof.b, dho.gu.n()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.cB, 0.3F), eof.b, dho.fd.n()), new eox(new eoz(dho.cB, 0.2F), eof.b, dho.gu.n()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.cB, 0.2F), eof.b, dho.kD.n()), new eox(new eoz(dho.cB, 0.1F), eof.b, dho.fe.n()))))
      );
      a($$0, q, ImmutableList.of(new eol(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new epb(ImmutableList.of(new eox(new eoz(dho.kJ, 0.75F), eof.b, dho.px.n()), new eox(new eoz(dho.px, 0.15F), eof.b, dho.pw.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new epb(ImmutableList.of(new eox(new eoz(dho.pw, 0.35F), eof.b, dho.px.n()), new eox(new eoz(dho.py, 0.1F), eof.b, dho.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new epb(ImmutableList.of(new eox(new eoz(dho.pw, 0.3F), eof.b, dho.px.n()), new eox(new eoz(dho.pr, 1.0E-4F), eof.b, dho.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new epb(ImmutableList.of(new eox(new eoz(dho.py, 0.5F), eof.b, dho.a.n()), new eox(new eoz(dho.ch, 0.1F), eof.b, dho.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new epb(ImmutableList.of(new eox(new eoz(dho.pw, 0.1F), eof.b, dho.px.n()), new eox(new eoz(dho.pr, 1.0E-4F), eof.b, dho.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.pw, 0.3F), eof.b, dho.px.n()),
                  new eox(new eoz(dho.pr, 1.0E-4F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.ch, 0.3F), eof.b, dho.px.n()),
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
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.pw, 0.4F), eof.b, dho.px.n()),
                  new eox(new eoz(dho.pr, 0.01F), eof.b, dho.px.n()),
                  new eox(new eoz(dho.pw, 1.0E-4F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.pr, 1.0E-4F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.ch, 0.3F), eof.b, dho.px.n()),
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
            new epb(ImmutableList.of(new eox(new eoz(dho.py, 0.5F), eof.b, dho.a.n()), new eox(new eoz(dho.ch, 0.6F), eof.b, dho.px.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new epb(ImmutableList.of(new eox(new eoz(dho.pw, 0.3F), eof.b, dho.px.n()), new eox(new eoz(dho.pr, 1.0E-4F), eof.b, dho.a.n()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.pw, 0.3F), eof.b, dho.px.n()),
                  new eox(new eoz(dho.pw, 0.15F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.pw, 0.3F), eof.b, dho.pr.n())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.pw, 0.01F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.pw, 0.5F), eof.b, dho.px.n()),
                  new eox(new eoz(dho.pw, 0.3F), eof.b, dho.pr.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new epb(
               ImmutableList.of(new eox(new eoz(dho.ch, 0.3F), eof.b, dho.px.n()), new eox(eof.b, eof.b, new eog(0.0F, 0.05F, 0, 100, jk.a.b), dho.a.n()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eol(0.9F), new eoy(awv.bP)));
      a($$0, E, ImmutableList.of(new eol(0.1F), new eoy(awv.bP)));
      a($$0, F, ImmutableList.of(new eol(0.1F), new epb(ImmutableList.of(new eox(new eok(dho.R), eof.b, dho.cy.n()))), new eoy(awv.bP)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.sW, 0.3F), eof.b, dho.tb.n()),
                  new eox(new eoz(dho.sS, 0.3F), eof.b, dho.tc.n()),
                  new eox(new eoz(dho.of, 0.05F), eof.b, dho.a.n())
               )
            ),
            new eoy(awv.bP)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eol($$1.b(awv.bV), 0.95F),
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.sW, 0.3F), eof.b, dho.tb.n()),
                  new eox(new eoz(dho.sS, 0.3F), eof.b, dho.tc.n()),
                  new eox(new eoz(dho.of, 0.05F), eof.b, dho.a.n())
               )
            ),
            new eoy(awv.bP)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eol($$1.b(awv.bV), 0.95F),
            new epb(
               ImmutableList.of(
                  new eox(new eoz(dho.sW, 0.3F), eof.b, dho.tb.n()),
                  new eox(new eoz(dho.sS, 0.3F), eof.b, dho.tc.n()),
                  new eox(new eoz(dho.sU, 0.3F), eof.b, dho.a.n()),
                  new eox(new eoz(dho.of, 0.05F), eof.b, dho.a.n())
               )
            ),
            new eoy(awv.bP)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new epb(
               List.of(
                  new eox(new eoz(dho.L, 0.2F), eof.b, dho.j.n()),
                  new eox(new eoz(dho.L, 0.1F), eof.b, dho.k.n()),
                  new eox(new eoz(dho.eM, 0.1F), eof.b, dho.eL.n())
               )
            ),
            a(eth.aV, 6),
            a(eth.aW, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new epb(
               List.of(
                  new eox(new eoz(dho.L, 0.2F), eof.b, dho.j.n()),
                  new eox(new eoz(dho.L, 0.1F), eof.b, dho.k.n()),
                  new eox(new eoz(dho.eM, 0.1F), eof.b, dho.eL.n())
               )
            ),
            a(eth.aV, 2)
         )
      );
      a($$0, L, List.of(a(eth.aV, 2)));
      a(
         $$0,
         M,
         List.of(
            new epb(
               List.of(
                  new eox(new eoz(dho.so, 0.1F), eof.b, dho.sr.n().b(dja.c, Boolean.valueOf(true))),
                  new eox(new eoz(dho.so, 0.33333334F), eof.b, dho.sq.n().b(dja.c, Boolean.valueOf(true))),
                  new eox(new eoz(dho.so, 0.5F), eof.b, dho.sp.n().b(dja.c, Boolean.valueOf(true)))
               )
            ),
            new eoy(awv.bP)
         )
      );
   }

   private static eon a(ald<etq> $$0, int $$1) {
      return new eon(new epb(List.of(new eox(new epk(awv.cu), eof.b, eou.b, dho.M.n(), new epm($$0)))), bqu.a($$1));
   }
}
