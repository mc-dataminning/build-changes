import com.google.common.collect.ImmutableList;
import java.util.List;

public class ow {
   private static final afv<dzr> M = a("empty");
   public static final afv<dzr> a = a("zombie_plains");
   public static final afv<dzr> b = a("zombie_savanna");
   public static final afv<dzr> c = a("zombie_snowy");
   public static final afv<dzr> d = a("zombie_taiga");
   public static final afv<dzr> e = a("zombie_desert");
   public static final afv<dzr> f = a("mossify_10_percent");
   public static final afv<dzr> g = a("mossify_20_percent");
   public static final afv<dzr> h = a("mossify_70_percent");
   public static final afv<dzr> i = a("street_plains");
   public static final afv<dzr> j = a("street_savanna");
   public static final afv<dzr> k = a("street_snowy_or_taiga");
   public static final afv<dzr> l = a("farm_plains");
   public static final afv<dzr> m = a("farm_savanna");
   public static final afv<dzr> n = a("farm_snowy");
   public static final afv<dzr> o = a("farm_taiga");
   public static final afv<dzr> p = a("farm_desert");
   public static final afv<dzr> q = a("outpost_rot");
   public static final afv<dzr> r = a("bottom_rampart");
   public static final afv<dzr> s = a("treasure_rooms");
   public static final afv<dzr> t = a("housing");
   public static final afv<dzr> u = a("side_wall_degradation");
   public static final afv<dzr> v = a("stable_degradation");
   public static final afv<dzr> w = a("bastion_generic_degradation");
   public static final afv<dzr> x = a("rampart_degradation");
   public static final afv<dzr> y = a("entrance_replacement");
   public static final afv<dzr> z = a("bridge");
   public static final afv<dzr> A = a("roof");
   public static final afv<dzr> B = a("high_wall");
   public static final afv<dzr> C = a("high_rampart");
   public static final afv<dzr> D = a("fossil_rot");
   public static final afv<dzr> E = a("fossil_coal");
   public static final afv<dzr> F = a("fossil_diamonds");
   public static final afv<dzr> G = a("ancient_city_start_degradation");
   public static final afv<dzr> H = a("ancient_city_generic_degradation");
   public static final afv<dzr> I = a("ancient_city_walls_degradation");
   public static final afv<dzr> J = a("trail_ruins_houses_archaeology");
   public static final afv<dzr> K = a("trail_ruins_roads_archaeology");
   public static final afv<dzr> L = a("trail_ruins_tower_top_archaeology");

   private static afv<dzr> a(String $$0) {
      return afv.a(jz.aB, new afw($$0));
   }

   private static void a(oo<dzr> $$0, afv<dzr> $$1, List<dzq> $$2) {
      $$0.a($$1, new dzr($$2));
   }

   public static void a(oo<dzr> $$0) {
      ic<cua> $$1 = $$0.a(jz.e);
      dzi $$2 = new dzi(new dzk(cuc.pr, 0.01F), dyr.b, cuc.pC.o());
      dzi $$3 = new dzi(new dzk(cuc.pC, 0.5F), dyr.b, cuc.pr.o());
      a($$0, M, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.m, 0.8F), dyr.b, cuc.cn.o()),
                  new dzi(new dzv(aqs.p), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cp), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cq), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.m, 0.07F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.cn, 0.07F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.hj, 0.07F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.U, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.n, 0.1F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.cu, 0.1F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.al, 0.02F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.eY, 0.5F), dyr.b, cuc.bs.o()),
                  new dzi[]{
                     new dzi(
                        new dyy(cuc.eY.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))),
                        dyr.b,
                        cuc.hL.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))
                     ),
                     new dzi(
                        new dyy(cuc.eY.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))),
                        dyr.b,
                        cuc.hL.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))
                     ),
                     new dzi(new dzk(cuc.cB, 0.3F), dyr.b, cuc.gt.o()),
                     new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.gu.o()),
                     new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.kD.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzv(aqs.p), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cp), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cq), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.r, 0.2F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.hP, 0.2F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.Y, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.as, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.hk, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.hn, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.hx, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.eY, 0.5F), dyr.b, cuc.bs.o()),
                  new dzi(
                     new dyy(cuc.eY.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))),
                     dyr.b,
                     cuc.hL.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))
                  ),
                  new dzi[]{
                     new dzi(
                        new dyy(cuc.eY.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))),
                        dyr.b,
                        cuc.hL.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))
                     ),
                     new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.fe.o())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzv(aqs.p), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cp), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cq), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.oe), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.o, 0.2F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.ju, 0.4F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.af, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.ax, 0.05F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.eY, 0.5F), dyr.b, cuc.bs.o()),
                  new dzi(
                     new dyy(cuc.eY.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))),
                     dyr.b,
                     cuc.hL.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))
                  ),
                  new dzi(
                     new dyy(cuc.eY.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))),
                     dyr.b,
                     cuc.hL.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))
                  ),
                  new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.gt.o()),
                  new dzi[]{new dzi(new dzk(cuc.cB, 0.8F), dyr.b, cuc.gu.o())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.m, 0.8F), dyr.b, cuc.cn.o()),
                  new dzi(new dzv(aqs.p), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cp), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cq), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.og), dyr.b, cuc.og.o().a(cuo.c, Boolean.valueOf(false))),
                  new dzi(new dzk(cuc.m, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.V, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.eY, 0.5F), dyr.b, cuc.bs.o()),
                  new dzi(
                     new dyy(cuc.eY.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))),
                     dyr.b,
                     cuc.hL.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true))
                  ),
                  new dzi(
                     new dyy(cuc.eY.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))),
                     dyr.b,
                     cuc.hL.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true))
                  ),
                  new dzi(new dzk(cuc.cB, 0.3F), dyr.b, cuc.fd.o()),
                  new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.gu.o()),
                  new dzi[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzv(aqs.p), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cp), dyr.b, cuc.a.o()),
                  new dzi(new dyw(cuc.cq), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.jS, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.aX, 0.1F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.iA, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.nl, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.ny, 0.08F), dyr.b, cuc.bs.o()),
                  new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.kD.o()),
                  new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.fe.o())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.m, 0.1F), dyr.b, cuc.cn.o())))));
      a($$0, g, ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.m, 0.2F), dyr.b, cuc.cn.o())))));
      a($$0, h, ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.m, 0.7F), dyr.b, cuc.cn.o())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dyw(cuc.kE), new dyw(cuc.G), cuc.n.o()),
                  new dzi(new dzk(cuc.kE, 0.1F), dyr.b, cuc.i.o()),
                  new dzi(new dyw(cuc.i), new dyw(cuc.G), cuc.G.o()),
                  new dzi(new dyw(cuc.j), new dyw(cuc.G), cuc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dyw(cuc.kE), new dyw(cuc.G), cuc.r.o()),
                  new dzi(new dzk(cuc.kE, 0.2F), dyr.b, cuc.i.o()),
                  new dzi(new dyw(cuc.i), new dyw(cuc.G), cuc.G.o()),
                  new dzi(new dyw(cuc.j), new dyw(cuc.G), cuc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dyw(cuc.kE), new dyw(cuc.G), cuc.o.o()),
                  new dzi(new dyw(cuc.kE), new dyw(cuc.dO), cuc.o.o()),
                  new dzi(new dzk(cuc.kE, 0.2F), dyr.b, cuc.i.o()),
                  new dzi(new dyw(cuc.i), new dyw(cuc.G), cuc.G.o()),
                  new dzi(new dyw(cuc.j), new dyw(cuc.G), cuc.G.o())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.cB, 0.3F), dyr.b, cuc.gt.o()),
                  new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.gu.o()),
                  new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.kD.o())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.fe.o())))));
      a(
         $$0,
         n,
         ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.gt.o()), new dzi(new dzk(cuc.cB, 0.8F), dyr.b, cuc.gu.o()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.cB, 0.3F), dyr.b, cuc.fd.o()), new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.gu.o()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.cB, 0.2F), dyr.b, cuc.kD.o()), new dzi(new dzk(cuc.cB, 0.1F), dyr.b, cuc.fe.o()))))
      );
      a($$0, q, ImmutableList.of(new dyx(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.kJ, 0.75F), dyr.b, cuc.px.o()), new dzi(new dzk(cuc.px, 0.15F), dyr.b, cuc.pw.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.pw, 0.35F), dyr.b, cuc.px.o()), new dzi(new dzk(cuc.py, 0.1F), dyr.b, cuc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.px.o()), new dzi(new dzk(cuc.pr, 1.0E-4F), dyr.b, cuc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.py, 0.5F), dyr.b, cuc.a.o()), new dzi(new dzk(cuc.ch, 0.1F), dyr.b, cuc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.pw, 0.1F), dyr.b, cuc.px.o()), new dzi(new dzk(cuc.pr, 1.0E-4F), dyr.b, cuc.a.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.px.o()),
                  new dzi(new dzk(cuc.pr, 1.0E-4F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.ch, 0.3F), dyr.b, cuc.px.o()),
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
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.pw, 0.4F), dyr.b, cuc.px.o()),
                  new dzi(new dzk(cuc.pr, 0.01F), dyr.b, cuc.px.o()),
                  new dzi(new dzk(cuc.pw, 1.0E-4F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.pr, 1.0E-4F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.ch, 0.3F), dyr.b, cuc.px.o()),
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
            new dzm(ImmutableList.of(new dzi(new dzk(cuc.py, 0.5F), dyr.b, cuc.a.o()), new dzi(new dzk(cuc.ch, 0.6F), dyr.b, cuc.px.o()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new dzm(ImmutableList.of(new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.px.o()), new dzi(new dzk(cuc.pr, 1.0E-4F), dyr.b, cuc.a.o()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.px.o()),
                  new dzi(new dzk(cuc.pw, 0.15F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.pr.o())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.pw, 0.01F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.pw, 0.5F), dyr.b, cuc.px.o()),
                  new dzi(new dzk(cuc.pw, 0.3F), dyr.b, cuc.pr.o()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(new dzi(new dzk(cuc.ch, 0.3F), dyr.b, cuc.px.o()), new dzi(dyr.b, dyr.b, new dys(0.0F, 0.05F, 0, 100, hx.a.b), cuc.a.o()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new dyx(0.9F), new dzj(aqs.bH)));
      a($$0, E, ImmutableList.of(new dyx(0.1F), new dzj(aqs.bH)));
      a($$0, F, ImmutableList.of(new dyx(0.1F), new dzm(ImmutableList.of(new dzi(new dyw(cuc.R), dyr.b, cuc.cy.o()))), new dzj(aqs.bH)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.rV, 0.3F), dyr.b, cuc.sa.o()),
                  new dzi(new dzk(cuc.rR, 0.3F), dyr.b, cuc.sb.o()),
                  new dzi(new dzk(cuc.of, 0.05F), dyr.b, cuc.a.o())
               )
            ),
            new dzj(aqs.bH)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new dyx($$1.b(aqs.bN), 0.95F),
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.rV, 0.3F), dyr.b, cuc.sa.o()),
                  new dzi(new dzk(cuc.rR, 0.3F), dyr.b, cuc.sb.o()),
                  new dzi(new dzk(cuc.of, 0.05F), dyr.b, cuc.a.o())
               )
            ),
            new dzj(aqs.bH)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new dyx($$1.b(aqs.bN), 0.95F),
            new dzm(
               ImmutableList.of(
                  new dzi(new dzk(cuc.rV, 0.3F), dyr.b, cuc.sa.o()),
                  new dzi(new dzk(cuc.rR, 0.3F), dyr.b, cuc.sb.o()),
                  new dzi(new dzk(cuc.rT, 0.3F), dyr.b, cuc.a.o()),
                  new dzi(new dzk(cuc.of, 0.05F), dyr.b, cuc.a.o())
               )
            ),
            new dzj(aqs.bH)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new dzm(
               List.of(
                  new dzi(new dzk(cuc.L, 0.2F), dyr.b, cuc.j.o()),
                  new dzi(new dzk(cuc.L, 0.1F), dyr.b, cuc.k.o()),
                  new dzi(new dzk(cuc.eM, 0.1F), dyr.b, cuc.eL.o())
               )
            ),
            a(edg.aE, 6),
            a(edg.aF, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new dzm(
               List.of(
                  new dzi(new dzk(cuc.L, 0.2F), dyr.b, cuc.j.o()),
                  new dzi(new dzk(cuc.L, 0.1F), dyr.b, cuc.k.o()),
                  new dzi(new dzk(cuc.eM, 0.1F), dyr.b, cuc.eL.o())
               )
            ),
            a(edg.aE, 2)
         )
      );
      a($$0, L, List.of(a(edg.aE, 2)));
   }

   private static dyz a(afw $$0, int $$1) {
      return new dyz(new dzm(List.of(new dzi(new dzv(aqs.cl), dyr.b, dzf.b, cuc.M.o(), new dzx($$0)))), bhd.a($$1));
   }
}
