import com.google.common.collect.ImmutableList;
import java.util.List;

public class qy {
   private static final akq<enp> N = a("empty");
   public static final akq<enp> a = a("zombie_plains");
   public static final akq<enp> b = a("zombie_savanna");
   public static final akq<enp> c = a("zombie_snowy");
   public static final akq<enp> d = a("zombie_taiga");
   public static final akq<enp> e = a("zombie_desert");
   public static final akq<enp> f = a("mossify_10_percent");
   public static final akq<enp> g = a("mossify_20_percent");
   public static final akq<enp> h = a("mossify_70_percent");
   public static final akq<enp> i = a("street_plains");
   public static final akq<enp> j = a("street_savanna");
   public static final akq<enp> k = a("street_snowy_or_taiga");
   public static final akq<enp> l = a("farm_plains");
   public static final akq<enp> m = a("farm_savanna");
   public static final akq<enp> n = a("farm_snowy");
   public static final akq<enp> o = a("farm_taiga");
   public static final akq<enp> p = a("farm_desert");
   public static final akq<enp> q = a("outpost_rot");
   public static final akq<enp> r = a("bottom_rampart");
   public static final akq<enp> s = a("treasure_rooms");
   public static final akq<enp> t = a("housing");
   public static final akq<enp> u = a("side_wall_degradation");
   public static final akq<enp> v = a("stable_degradation");
   public static final akq<enp> w = a("bastion_generic_degradation");
   public static final akq<enp> x = a("rampart_degradation");
   public static final akq<enp> y = a("entrance_replacement");
   public static final akq<enp> z = a("bridge");
   public static final akq<enp> A = a("roof");
   public static final akq<enp> B = a("high_wall");
   public static final akq<enp> C = a("high_rampart");
   public static final akq<enp> D = a("fossil_rot");
   public static final akq<enp> E = a("fossil_coal");
   public static final akq<enp> F = a("fossil_diamonds");
   public static final akq<enp> G = a("ancient_city_start_degradation");
   public static final akq<enp> H = a("ancient_city_generic_degradation");
   public static final akq<enp> I = a("ancient_city_walls_degradation");
   public static final akq<enp> J = a("trail_ruins_houses_archaeology");
   public static final akq<enp> K = a("trail_ruins_roads_archaeology");
   public static final akq<enp> L = a("trail_ruins_tower_top_archaeology");
   public static final akq<enp> M = a("trial_chambers_copper_bulb_degradation");

   private static akq<enp> a(String $$0) {
      return akq.a(lu.aS, akr.b($$0));
   }

   private static void a(qq<enp> $$0, akq<enp> $$1, List<eno> $$2) {
      $$0.a($$1, new enp($$2));
   }

   public static void a(qq<enp> $$0) {
      jn<dfy> $$1 = $$0.a(lu.f);
      eng $$2 = new eng(new eni(dga.pr, 0.01F), emo.b, dga.pC.o());
      eng $$3 = new eng(new eni(dga.pC, 0.5F), emo.b, dga.pr.o());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.m, 0.8F), emo.b, dga.cn.o()),
                  new eng(new ent(awe.p), emo.b, dga.a.o()),
                  new eng(new emt(dga.cp), emo.b, dga.a.o()),
                  new eng(new emt(dga.cq), emo.b, dga.a.o()),
                  new eng(new eni(dga.m, 0.07F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.cn, 0.07F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.hj, 0.07F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.U, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.n, 0.1F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.cu, 0.1F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.al, 0.02F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.eY, 0.5F), emo.b, dga.bs.o()),
                  new eng[]{
                     new eng(
                        new emv(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                        emo.b,
                        dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                     ),
                     new eng(
                        new emv(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                        emo.b,
                        dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                     ),
                     new eng(new eni(dga.cB, 0.3F), emo.b, dga.gt.o()),
                     new eng(new eni(dga.cB, 0.2F), emo.b, dga.gu.o()),
                     new eng(new eni(dga.cB, 0.1F), emo.b, dga.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new ent(awe.p), emo.b, dga.a.o()),
                  new eng(new emt(dga.cp), emo.b, dga.a.o()),
                  new eng(new emt(dga.cq), emo.b, dga.a.o()),
                  new eng(new eni(dga.r, 0.2F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.hP, 0.2F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.Y, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.as, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.hk, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.hn, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.hx, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.eY, 0.5F), emo.b, dga.bs.o()),
                  new eng(
                     new emv(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emo.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eng[]{
                     new eng(
                        new emv(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                        emo.b,
                        dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                     ),
                     new eng(new eni(dga.cB, 0.1F), emo.b, dga.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new ent(awe.p), emo.b, dga.a.o()),
                  new eng(new emt(dga.cp), emo.b, dga.a.o()),
                  new eng(new emt(dga.cq), emo.b, dga.a.o()),
                  new eng(new emt(dga.oe), emo.b, dga.a.o()),
                  new eng(new eni(dga.o, 0.2F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.ju, 0.4F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.af, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.ax, 0.05F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.eY, 0.5F), emo.b, dga.bs.o()),
                  new eng(
                     new emv(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emo.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eng(
                     new emv(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                     emo.b,
                     dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                  ),
                  new eng(new eni(dga.cB, 0.1F), emo.b, dga.gt.o()),
                  new eng[]{new eng(new eni(dga.cB, 0.8F), emo.b, dga.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.m, 0.8F), emo.b, dga.cn.o()),
                  new eng(new ent(awe.p), emo.b, dga.a.o()),
                  new eng(new emt(dga.cp), emo.b, dga.a.o()),
                  new eng(new emt(dga.cq), emo.b, dga.a.o()),
                  new eng(new emt(dga.og), emo.b, dga.og.o().a(dgm.c, Boolean.valueOf(false))),
                  new eng(new eni(dga.m, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.V, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.eY, 0.5F), emo.b, dga.bs.o()),
                  new eng(
                     new emv(dga.eY.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))),
                     emo.b,
                     dga.hL.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true))
                  ),
                  new eng(
                     new emv(dga.eY.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))),
                     emo.b,
                     dga.hL.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true))
                  ),
                  new eng(new eni(dga.cB, 0.3F), emo.b, dga.fd.o()),
                  new eng(new eni(dga.cB, 0.2F), emo.b, dga.gu.o()),
                  new eng[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new ent(awe.p), emo.b, dga.a.o()),
                  new eng(new emt(dga.cp), emo.b, dga.a.o()),
                  new eng(new emt(dga.cq), emo.b, dga.a.o()),
                  new eng(new eni(dga.jS, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.aX, 0.1F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.iA, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.nl, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.ny, 0.08F), emo.b, dga.bs.o()),
                  new eng(new eni(dga.cB, 0.2F), emo.b, dga.kD.o()),
                  new eng(new eni(dga.cB, 0.1F), emo.b, dga.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.m, 0.1F), emo.b, dga.cn.o())))));
      a($$0, g, ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.m, 0.2F), emo.b, dga.cn.o())))));
      a($$0, h, ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.m, 0.7F), emo.b, dga.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new emt(dga.kE), new emt(dga.G), dga.n.o()),
                  new eng(new eni(dga.kE, 0.1F), emo.b, dga.i.o()),
                  new eng(new emt(dga.i), new emt(dga.G), dga.G.o()),
                  new eng(new emt(dga.j), new emt(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new emt(dga.kE), new emt(dga.G), dga.r.o()),
                  new eng(new eni(dga.kE, 0.2F), emo.b, dga.i.o()),
                  new eng(new emt(dga.i), new emt(dga.G), dga.G.o()),
                  new eng(new emt(dga.j), new emt(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new emt(dga.kE), new emt(dga.G), dga.o.o()),
                  new eng(new emt(dga.kE), new emt(dga.dO), dga.o.o()),
                  new eng(new eni(dga.kE, 0.2F), emo.b, dga.i.o()),
                  new eng(new emt(dga.i), new emt(dga.G), dga.G.o()),
                  new eng(new emt(dga.j), new emt(dga.G), dga.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.cB, 0.3F), emo.b, dga.gt.o()),
                  new eng(new eni(dga.cB, 0.2F), emo.b, dga.gu.o()),
                  new eng(new eni(dga.cB, 0.1F), emo.b, dga.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.cB, 0.1F), emo.b, dga.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.cB, 0.1F), emo.b, dga.gt.o()), new eng(new eni(dga.cB, 0.8F), emo.b, dga.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.cB, 0.3F), emo.b, dga.fd.o()), new eng(new eni(dga.cB, 0.2F), emo.b, dga.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.cB, 0.2F), emo.b, dga.kD.o()), new eng(new eni(dga.cB, 0.1F), emo.b, dga.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new emu(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new enk(ImmutableList.of(new eng(new eni(dga.kJ, 0.75F), emo.b, dga.px.o()), new eng(new eni(dga.px, 0.15F), emo.b, dga.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new enk(ImmutableList.of(new eng(new eni(dga.pw, 0.35F), emo.b, dga.px.o()), new eng(new eni(dga.py, 0.1F), emo.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new enk(ImmutableList.of(new eng(new eni(dga.pw, 0.3F), emo.b, dga.px.o()), new eng(new eni(dga.pr, 1.0E-4F), emo.b, dga.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new enk(ImmutableList.of(new eng(new eni(dga.py, 0.5F), emo.b, dga.a.o()), new eng(new eni(dga.ch, 0.1F), emo.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new enk(ImmutableList.of(new eng(new eni(dga.pw, 0.1F), emo.b, dga.px.o()), new eng(new eni(dga.pr, 1.0E-4F), emo.b, dga.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.pw, 0.3F), emo.b, dga.px.o()),
                  new eng(new eni(dga.pr, 1.0E-4F), emo.b, dga.a.o()),
                  new eng(new eni(dga.ch, 0.3F), emo.b, dga.px.o()),
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
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.pw, 0.4F), emo.b, dga.px.o()),
                  new eng(new eni(dga.pr, 0.01F), emo.b, dga.px.o()),
                  new eng(new eni(dga.pw, 1.0E-4F), emo.b, dga.a.o()),
                  new eng(new eni(dga.pr, 1.0E-4F), emo.b, dga.a.o()),
                  new eng(new eni(dga.ch, 0.3F), emo.b, dga.px.o()),
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
            new enk(ImmutableList.of(new eng(new eni(dga.py, 0.5F), emo.b, dga.a.o()), new eng(new eni(dga.ch, 0.6F), emo.b, dga.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new enk(ImmutableList.of(new eng(new eni(dga.pw, 0.3F), emo.b, dga.px.o()), new eng(new eni(dga.pr, 1.0E-4F), emo.b, dga.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.pw, 0.3F), emo.b, dga.px.o()),
                  new eng(new eni(dga.pw, 0.15F), emo.b, dga.a.o()),
                  new eng(new eni(dga.pw, 0.3F), emo.b, dga.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.pw, 0.01F), emo.b, dga.a.o()),
                  new eng(new eni(dga.pw, 0.5F), emo.b, dga.px.o()),
                  new eng(new eni(dga.pw, 0.3F), emo.b, dga.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new enk(
               ImmutableList.of(new eng(new eni(dga.ch, 0.3F), emo.b, dga.px.o()), new eng(emo.b, emo.b, new emp(0.0F, 0.05F, 0, 100, ji.a.b), dga.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new emu(0.9F), new enh(awe.bO)));
      a($$0, E, ImmutableList.of(new emu(0.1F), new enh(awe.bO)));
      a($$0, F, ImmutableList.of(new emu(0.1F), new enk(ImmutableList.of(new eng(new emt(dga.R), emo.b, dga.cy.o()))), new enh(awe.bO)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.sW, 0.3F), emo.b, dga.tb.o()),
                  new eng(new eni(dga.sS, 0.3F), emo.b, dga.tc.o()),
                  new eng(new eni(dga.of, 0.05F), emo.b, dga.a.o())
               )
            ),
            new enh(awe.bO)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new emu($$1.b(awe.bU), 0.95F),
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.sW, 0.3F), emo.b, dga.tb.o()),
                  new eng(new eni(dga.sS, 0.3F), emo.b, dga.tc.o()),
                  new eng(new eni(dga.of, 0.05F), emo.b, dga.a.o())
               )
            ),
            new enh(awe.bO)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new emu($$1.b(awe.bU), 0.95F),
            new enk(
               ImmutableList.of(
                  new eng(new eni(dga.sW, 0.3F), emo.b, dga.tb.o()),
                  new eng(new eni(dga.sS, 0.3F), emo.b, dga.tc.o()),
                  new eng(new eni(dga.sU, 0.3F), emo.b, dga.a.o()),
                  new eng(new eni(dga.of, 0.05F), emo.b, dga.a.o())
               )
            ),
            new enh(awe.bO)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new enk(
               List.of(
                  new eng(new eni(dga.L, 0.2F), emo.b, dga.j.o()),
                  new eng(new eni(dga.L, 0.1F), emo.b, dga.k.o()),
                  new eng(new eni(dga.eM, 0.1F), emo.b, dga.eL.o())
               )
            ),
            a(erl.bf, 6),
            a(erl.bg, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new enk(
               List.of(
                  new eng(new eni(dga.L, 0.2F), emo.b, dga.j.o()),
                  new eng(new eni(dga.L, 0.1F), emo.b, dga.k.o()),
                  new eng(new eni(dga.eM, 0.1F), emo.b, dga.eL.o())
               )
            ),
            a(erl.bf, 2)
         )
      );
      a($$0, L, List.of(a(erl.bf, 2)));
      a(
         $$0,
         M,
         List.of(
            new enk(
               List.of(
                  new eng(new eni(dga.so, 0.1F), emo.b, dga.sr.o().a(dhm.c, Boolean.valueOf(true))),
                  new eng(new eni(dga.so, 0.33333334F), emo.b, dga.sq.o().a(dhm.c, Boolean.valueOf(true))),
                  new eng(new eni(dga.so, 0.5F), emo.b, dga.sp.o().a(dhm.c, Boolean.valueOf(true)))
               )
            ),
            new enh(awe.bO)
         )
      );
   }

   private static emw a(akq<eru> $$0, int $$1) {
      return new emw(new enk(List.of(new eng(new ent(awe.ct), emo.b, end.b, dga.M.o(), new env($$0)))), bpt.a($$1));
   }
}
