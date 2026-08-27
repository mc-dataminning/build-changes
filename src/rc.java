import com.google.common.collect.ImmutableList;
import java.util.List;

public class rc {
   private static final aks<enr> T = a("empty");
   public static final aks<enr> a = a("zombie_plains");
   public static final aks<enr> b = a("zombie_potato");
   public static final aks<enr> c = a("zombie_savanna");
   public static final aks<enr> d = a("zombie_snowy");
   public static final aks<enr> e = a("zombie_taiga");
   public static final aks<enr> f = a("zombie_desert");
   public static final aks<enr> g = a("mossify_10_percent");
   public static final aks<enr> h = a("mossify_20_percent");
   public static final aks<enr> i = a("mossify_70_percent");
   public static final aks<enr> j = a("street_plains");
   public static final aks<enr> k = a("spoil_10_percent");
   public static final aks<enr> l = a("spoil_20_percent");
   public static final aks<enr> m = a("spoil_70_percent");
   public static final aks<enr> n = a("street_potato");
   public static final aks<enr> o = a("street_savanna");
   public static final aks<enr> p = a("street_snowy_or_taiga");
   public static final aks<enr> q = a("farm_plains");
   public static final aks<enr> r = a("farm_potato");
   public static final aks<enr> s = a("farm_savanna");
   public static final aks<enr> t = a("farm_snowy");
   public static final aks<enr> u = a("farm_taiga");
   public static final aks<enr> v = a("farm_desert");
   public static final aks<enr> w = a("outpost_rot");
   public static final aks<enr> x = a("bottom_rampart");
   public static final aks<enr> y = a("treasure_rooms");
   public static final aks<enr> z = a("housing");
   public static final aks<enr> A = a("side_wall_degradation");
   public static final aks<enr> B = a("stable_degradation");
   public static final aks<enr> C = a("bastion_generic_degradation");
   public static final aks<enr> D = a("rampart_degradation");
   public static final aks<enr> E = a("entrance_replacement");
   public static final aks<enr> F = a("bridge");
   public static final aks<enr> G = a("roof");
   public static final aks<enr> H = a("high_wall");
   public static final aks<enr> I = a("high_rampart");
   public static final aks<enr> J = a("fossil_rot");
   public static final aks<enr> K = a("fossil_coal");
   public static final aks<enr> L = a("colosseum_veins");
   public static final aks<enr> M = a("fossil_diamonds");
   public static final aks<enr> N = a("ancient_city_start_degradation");
   public static final aks<enr> O = a("ancient_city_generic_degradation");
   public static final aks<enr> P = a("ancient_city_walls_degradation");
   public static final aks<enr> Q = a("trail_ruins_houses_archaeology");
   public static final aks<enr> R = a("trail_ruins_roads_archaeology");
   public static final aks<enr> S = a("trail_ruins_tower_top_archaeology");

   private static aks<enr> a(String $$0) {
      return aks.a(li.aK, new akt($$0));
   }

   private static void a(qq<enr> $$0, aks<enr> $$1, List<enq> $$2) {
      $$0.a($$1, new enr($$2));
   }

   public static void a(qq<enr> $$0) {
      jb<dfc> $$1 = $$0.a(li.f);
      eni $$2 = new eni(new enk(dfe.qC, 0.01F), emr.b, dfe.qN.n());
      eni $$3 = new eni(new enk(dfe.qN, 0.5F), emr.b, dfe.qC.n());
      a($$0, T, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.q, 0.8F), emr.b, dfe.cY.n()),
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.q, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.cY, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.id, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aC, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.S, 0.1F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.df, 0.1F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aT, 0.02F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.fQ, 0.5F), emr.b, dfe.cc.n()),
                  new eni[]{
                     new eni(
                        new emy(dfe.fQ.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))),
                        emr.b,
                        dfe.iF.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))
                     ),
                     new eni(
                        new emy(dfe.fQ.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))),
                        emr.b,
                        dfe.iF.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))
                     ),
                     new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.hn.n()),
                     new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.ho.n()),
                     new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.lA.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.r, 0.8F), emr.b, dfe.t.n()),
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.r, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.t, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.id, 0.07F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.tG, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.pG, 0.1F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.pY, 0.1F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aT, 0.02F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.fQ, 0.5F), emr.b, dfe.cc.n()),
                  new eni[]{
                     new eni(
                        new emy(dfe.fQ.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))),
                        emr.b,
                        dfe.iF.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))
                     ),
                     new eni(
                        new emy(dfe.fQ.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))),
                        emr.b,
                        dfe.iF.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))
                     ),
                     new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.hn.n()),
                     new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.ho.n()),
                     new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.lA.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.W, 0.2F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.iJ, 0.2F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aG, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ba, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ie, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ih, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ir, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.fQ, 0.5F), emr.b, dfe.cc.n()),
                  new eni(
                     new emy(dfe.fQ.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))),
                     emr.b,
                     dfe.iF.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))
                  ),
                  new eni[]{
                     new eni(
                        new emy(dfe.fQ.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))),
                        emr.b,
                        dfe.iF.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))
                     ),
                     new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.fW.n())
                  }
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.pd), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.T, 0.2F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ko, 0.4F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aN, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.bf, 0.05F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.fQ, 0.5F), emr.b, dfe.cc.n()),
                  new eni(
                     new emy(dfe.fQ.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))),
                     emr.b,
                     dfe.iF.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))
                  ),
                  new eni(
                     new emy(dfe.fQ.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))),
                     emr.b,
                     dfe.iF.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))
                  ),
                  new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.hn.n()),
                  new eni[]{new eni(new enk(dfe.dm, 0.8F), emr.b, dfe.ho.n())}
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.q, 0.8F), emr.b, dfe.cY.n()),
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.pf), emr.b, dfe.pf.n().a(dfq.d, Boolean.valueOf(false))),
                  new eni(new enk(dfe.q, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.aD, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.fQ, 0.5F), emr.b, dfe.cc.n()),
                  new eni(
                     new emy(dfe.fQ.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))),
                     emr.b,
                     dfe.iF.n().a(djh.a, Boolean.valueOf(true)).a(djh.c, Boolean.valueOf(true))
                  ),
                  new eni(
                     new emy(dfe.fQ.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))),
                     emr.b,
                     dfe.iF.n().a(djh.b, Boolean.valueOf(true)).a(djh.d, Boolean.valueOf(true))
                  ),
                  new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.fV.n()),
                  new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.ho.n()),
                  new eni[0]
               )
            )
         )
      );
      a(
         $$0,
         f,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new env(awe.p), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.da), emr.b, dfe.a.n()),
                  new eni(new emw(dfe.db), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.kM, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.bH, 0.1F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ju, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.oj, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.ow, 0.08F), emr.b, dfe.cc.n()),
                  new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.lA.n()),
                  new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.fW.n())
               )
            )
         )
      );
      a($$0, g, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.q, 0.1F), emr.b, dfe.cY.n())))));
      a($$0, h, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.q, 0.2F), emr.b, dfe.cY.n())))));
      a($$0, i, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.q, 0.7F), emr.b, dfe.cY.n())))));
      a(
         $$0,
         j,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emw(dfe.lB), new emw(dfe.al), dfe.S.n()),
                  new eni(new enk(dfe.lB, 0.1F), emr.b, dfe.j.n()),
                  new eni(new emw(dfe.j), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.m), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.k), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.l), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.n), new emw(dfe.al), dfe.al.n())
               )
            )
         )
      );
      a($$0, k, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.r, 0.1F), emr.b, dfe.t.n())))));
      a($$0, l, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.r, 0.2F), emr.b, dfe.t.n())))));
      a($$0, m, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.r, 0.7F), emr.b, dfe.t.n())))));
      a(
         $$0,
         n,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emw(dfe.lC), new emw(dfe.al), dfe.pG.n()),
                  new eni(new enk(dfe.lC, 0.1F), emr.b, dfe.k.n()),
                  new eni(new emw(dfe.k), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.n), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.l), new emw(dfe.al), dfe.al.n())
               )
            )
         )
      );
      a(
         $$0,
         o,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emw(dfe.lB), new emw(dfe.al), dfe.W.n()),
                  new eni(new enk(dfe.lB, 0.2F), emr.b, dfe.j.n()),
                  new eni(new emw(dfe.j), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.m), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.k), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.l), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.n), new emw(dfe.al), dfe.al.n())
               )
            )
         )
      );
      a(
         $$0,
         p,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new emw(dfe.lB), new emw(dfe.al), dfe.T.n()),
                  new eni(new emw(dfe.lB), new emw(dfe.eC), dfe.T.n()),
                  new eni(new enk(dfe.lB, 0.2F), emr.b, dfe.j.n()),
                  new eni(new emw(dfe.j), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.m), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.k), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.l), new emw(dfe.al), dfe.al.n()),
                  new eni(new emw(dfe.n), new emw(dfe.al), dfe.al.n())
               )
            )
         )
      );
      a(
         $$0,
         q,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.hn.n()),
                  new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.ho.n()),
                  new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.lA.n())
               )
            )
         )
      );
      a(
         $$0,
         r,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.hn.n()),
                  new eni(new enk(dfe.dm, 0.8F), emr.b, dfe.ho.n()),
                  new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.lA.n())
               )
            )
         )
      );
      a($$0, s, ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.fW.n())))));
      a(
         $$0,
         t,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.hn.n()), new eni(new enk(dfe.dm, 0.8F), emr.b, dfe.ho.n()))))
      );
      a(
         $$0,
         u,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.dm, 0.3F), emr.b, dfe.fV.n()), new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.ho.n()))))
      );
      a(
         $$0,
         v,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.dm, 0.2F), emr.b, dfe.lA.n()), new eni(new enk(dfe.dm, 0.1F), emr.b, dfe.fW.n()))))
      );
      a($$0, w, ImmutableList.of(new emx(0.05F)));
      a(
         $$0,
         x,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.lH, 0.75F), emr.b, dfe.qI.n()), new eni(new enk(dfe.qI, 0.15F), emr.b, dfe.qH.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         y,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.qH, 0.35F), emr.b, dfe.qI.n()), new eni(new enk(dfe.qJ, 0.1F), emr.b, dfe.qI.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qI.n()), new eni(new enk(dfe.qC, 1.0E-4F), emr.b, dfe.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.qJ, 0.5F), emr.b, dfe.a.n()), new eni(new enk(dfe.cS, 0.1F), emr.b, dfe.qI.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.qH, 0.1F), emr.b, dfe.qI.n()), new eni(new enk(dfe.qC, 1.0E-4F), emr.b, dfe.a.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qI.n()),
                  new eni(new enk(dfe.qC, 1.0E-4F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.cS, 0.3F), emr.b, dfe.qI.n()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         D,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.qH, 0.4F), emr.b, dfe.qI.n()),
                  new eni(new enk(dfe.qC, 0.01F), emr.b, dfe.qI.n()),
                  new eni(new enk(dfe.qH, 1.0E-4F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.qC, 1.0E-4F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.cS, 0.3F), emr.b, dfe.qI.n()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         E,
         ImmutableList.of(
            new enm(ImmutableList.of(new eni(new enk(dfe.qJ, 0.5F), emr.b, dfe.a.n()), new eni(new enk(dfe.cS, 0.6F), emr.b, dfe.qI.n()), $$3, $$2))
         )
      );
      a(
         $$0,
         F,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qI.n()), new eni(new enk(dfe.qC, 1.0E-4F), emr.b, dfe.a.n()))))
      );
      a(
         $$0,
         G,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qI.n()),
                  new eni(new enk(dfe.qH, 0.15F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qC.n())
               )
            )
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.qH, 0.01F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.qH, 0.5F), emr.b, dfe.qI.n()),
                  new eni(new enk(dfe.qH, 0.3F), emr.b, dfe.qC.n()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new enm(
               ImmutableList.of(new eni(new enk(dfe.cS, 0.3F), emr.b, dfe.qI.n()), new eni(emr.b, emr.b, new ems(0.0F, 0.05F, 0, 100, iw.a.b), dfe.a.n()), $$3)
            )
         )
      );
      a($$0, J, ImmutableList.of(new emx(0.9F), new enj(awe.bR)));
      a($$0, K, ImmutableList.of(new emx(0.1F), new enj(awe.bR)));
      a(
         $$0,
         L,
         ImmutableList.of(new enm(ImmutableList.of(new eni(new enk(dfe.s, 0.2F), emr.b, dfe.t.n()), new eni(new enk(dfe.s, 1.0E-4F), emr.b, dfe.a.n()))))
      );
      a($$0, M, ImmutableList.of(new emx(0.1F), new enm(ImmutableList.of(new eni(new emw(dfe.az), emr.b, dfe.dj.n()))), new enj(awe.bR)));
      a(
         $$0,
         N,
         ImmutableList.of(
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.uu, 0.3F), emr.b, dfe.uz.n()),
                  new eni(new enk(dfe.uq, 0.3F), emr.b, dfe.uA.n()),
                  new eni(new enk(dfe.pe, 0.05F), emr.b, dfe.a.n())
               )
            ),
            new enj(awe.bR)
         )
      );
      a(
         $$0,
         O,
         ImmutableList.of(
            new emx($$1.b(awe.bX), 0.95F),
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.uu, 0.3F), emr.b, dfe.uz.n()),
                  new eni(new enk(dfe.uq, 0.3F), emr.b, dfe.uA.n()),
                  new eni(new enk(dfe.pe, 0.05F), emr.b, dfe.a.n())
               )
            ),
            new enj(awe.bR)
         )
      );
      a(
         $$0,
         P,
         ImmutableList.of(
            new emx($$1.b(awe.bX), 0.95F),
            new enm(
               ImmutableList.of(
                  new eni(new enk(dfe.uu, 0.3F), emr.b, dfe.uz.n()),
                  new eni(new enk(dfe.uq, 0.3F), emr.b, dfe.uA.n()),
                  new eni(new enk(dfe.us, 0.3F), emr.b, dfe.a.n()),
                  new eni(new enk(dfe.pe, 0.05F), emr.b, dfe.a.n())
               )
            ),
            new enj(awe.bR)
         )
      );
      a(
         $$0,
         Q,
         List.of(
            new enm(
               List.of(
                  new eni(new enk(dfe.ar, 0.2F), emr.b, dfe.m.n()),
                  new eni(new enk(dfe.ar, 0.1F), emr.b, dfe.o.n()),
                  new eni(new enk(dfe.fE, 0.1F), emr.b, dfe.fD.n())
               )
            ),
            a(ern.bo, 6),
            a(ern.bp, 3)
         )
      );
      a(
         $$0,
         R,
         List.of(
            new enm(
               List.of(
                  new eni(new enk(dfe.ar, 0.2F), emr.b, dfe.m.n()),
                  new eni(new enk(dfe.ar, 0.1F), emr.b, dfe.o.n()),
                  new eni(new enk(dfe.fE, 0.1F), emr.b, dfe.fD.n())
               )
            ),
            a(ern.bo, 2)
         )
      );
      a($$0, S, List.of(a(ern.bo, 2)));
   }

   private static emz a(aks<eru> $$0, int $$1) {
      return new emz(new enm(List.of(new eni(new env(awe.cw), emr.b, enf.b, dfe.as.n(), new enx($$0)))), bpc.a($$1));
   }
}
