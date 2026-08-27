import java.util.List;

public class rr {
   public static final akm<dzm<?, ?>> a = rt.a("monster_room");
   public static final akm<dzm<?, ?>> b = rt.a("fossil_coal");
   public static final akm<dzm<?, ?>> c = rt.a("fossil_diamonds");
   public static final akm<dzm<?, ?>> d = rt.a("dripstone_cluster");
   public static final akm<dzm<?, ?>> e = rt.a("large_dripstone");
   public static final akm<dzm<?, ?>> f = rt.a("pointed_dripstone");
   public static final akm<dzm<?, ?>> g = rt.a("underwater_magma");
   public static final akm<dzm<?, ?>> h = rt.a("glow_lichen");
   public static final akm<dzm<?, ?>> i = rt.a("rooted_azalea_tree");
   public static final akm<dzm<?, ?>> j = rt.a("cave_vine");
   public static final akm<dzm<?, ?>> k = rt.a("cave_vine_in_moss");
   public static final akm<dzm<?, ?>> l = rt.a("moss_vegetation");
   public static final akm<dzm<?, ?>> m = rt.a("moss_patch");
   public static final akm<dzm<?, ?>> n = rt.a("moss_patch_bonemeal");
   public static final akm<dzm<?, ?>> o = rt.a("dripleaf");
   public static final akm<dzm<?, ?>> p = rt.a("clay_with_dripleaves");
   public static final akm<dzm<?, ?>> q = rt.a("clay_pool_with_dripleaves");
   public static final akm<dzm<?, ?>> r = rt.a("lush_caves_clay");
   public static final akm<dzm<?, ?>> s = rt.a("moss_patch_ceiling");
   public static final akm<dzm<?, ?>> t = rt.a("spore_blossom");
   public static final akm<dzm<?, ?>> u = rt.a("amethyst_geode");
   public static final akm<dzm<?, ?>> v = rt.a("sculk_patch_deep_dark");
   public static final akm<dzm<?, ?>> w = rt.a("sculk_patch_ancient_city");
   public static final akm<dzm<?, ?>> x = rt.a("sculk_vein");

   private static ix<egp> a(it $$0) {
      return si.a(
         dzz.w,
         new ebu(
            List.of(
               ebu.a(new bpi(bog.<bpb>a().a(bph.a(0, 4), 2).a(boy.a(0), 1).a()), eee.a(dec.sE.n().a(drt.R, $$0))),
               ebu.a(boy.a(1), eee.a(dec.sD.n().a(drt.R, $$0)))
            ),
            it.b,
            dyc.d,
            true
         )
      );
   }

   private static ix<egp> a() {
      return si.a(
         dzz.S,
         new ecv(
            new eeo(
               bog.<drd>a().a(dec.sF.n().a(dlf.d, it.f), 1).a(dec.sF.n().a(dlf.d, it.e), 1).a(dec.sF.n().a(dlf.d, it.c), 1).a(dec.sF.n().a(dlf.d, it.d), 1)
            )
         )
      );
   }

   public static void a(qo<dzm<?, ?>> $$0) {
      iy<dzm<?, ?>> $$1 = $$0.a(lf.aC);
      iy<elj> $$2 = $$0.a(lf.aK);
      rt.a($$0, a, dzz.C);
      List<akn> $$3 = List.of(
         new akn("fossil/spine_1"),
         new akn("fossil/spine_2"),
         new akn("fossil/spine_3"),
         new akn("fossil/spine_4"),
         new akn("fossil/skull_1"),
         new akn("fossil/skull_2"),
         new akn("fossil/skull_3"),
         new akn("fossil/skull_4")
      );
      List<akn> $$4 = List.of(
         new akn("fossil/spine_1_coal"),
         new akn("fossil/spine_2_coal"),
         new akn("fossil/spine_3_coal"),
         new akn("fossil/spine_4_coal"),
         new akn("fossil/skull_1_coal"),
         new akn("fossil/skull_2_coal"),
         new akn("fossil/skull_3_coal"),
         new akn("fossil/skull_4_coal")
      );
      ix<elj> $$5 = $$2.b(qw.D);
      rt.a($$0, b, dzz.p, new eae($$3, $$4, $$5, $$2.b(qw.E), 4));
      rt.a($$0, c, dzz.p, new eae($$3, $$4, $$5, $$2.b(qw.F), 4));
      rt.a($$0, d, dzz.aj, new ecb(12, bph.a(3, 6), bph.a(2, 8), 1, 3, bph.a(2, 4), bpg.b(0.3F, 0.7F), bov.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rt.a($$0, e, dzz.ak, new ecg(30, bph.a(3, 19), bpg.b(0.4F, 2.0F), 0.33F, bpg.b(0.3F, 0.9F), bpg.b(0.4F, 1.0F), bpg.b(0.0F, 0.3F), 4, 0.6F));
      rt.a(
         $$0,
         f,
         dzz.ag,
         new ecw(
            jb.a(
               si.a(dzz.al, new ecm(0.2F, 0.7F, 0.5F, 0.5F), egj.a(it.a, dyc.c(), dyc.d, 12), egu.a(boy.a(1))),
               si.a(dzz.al, new ecm(0.2F, 0.7F, 0.5F, 0.5F), egj.a(it.b, dyc.c(), dyc.d, 12), egu.a(boy.a(-1)))
            )
         )
      );
      rt.a($$0, g, dzz.B, new edb(5, 1, 0.5F));
      dja $$6 = (dja)dec.fg;
      rt.a($$0, h, dzz.A, new eci($$6, 20, false, true, true, 0.5F, jb.a(dea::q, dec.b, dec.g, dec.e, dec.c, dec.su, dec.qN, dec.qz, dec.sJ)));
      rt.a(
         $$0,
         i,
         dzz.z,
         new ect(
            si.a($$1.b(ry.w)),
            3,
            3,
            avx.bw,
            eee.a(dec.sH),
            20,
            100,
            3,
            2,
            eee.a(dec.sG),
            20,
            2,
            dyc.a(dyc.b(dyc.c(List.of(dec.a, dec.nc, dec.nb)), dyc.a(avx.cn)), dyc.a(it.a.q(), avx.ch))
         )
      );
      eeo $$7 = new eeo(bog.<drd>a().a(dec.sw.n(), 4).a(dec.sw.n().a(dew.r_, Boolean.valueOf(true)), 1));
      eek $$8 = new eek(new eeo(bog.<drd>a().a(dec.sv.n(), 4).a(dec.sv.n().a(dew.r_, Boolean.valueOf(true)), 1)), dex.e, bph.a(23, 25));
      rt.a(
         $$0,
         j,
         dzz.w,
         new ebu(
            List.of(ebu.a(new bpi(bog.<bpb>a().a(bph.a(0, 19), 2).a(bph.a(0, 2), 3).a(bph.a(0, 6), 10).a()), $$7), ebu.a(boy.a(1), $$8)), it.a, dyc.c, true
         )
      );
      rt.a($$0, k, dzz.w, new ebu(List.of(ebu.a(new bpi(bog.<bpb>a().a(bph.a(0, 3), 5).a(bph.a(1, 7), 1).a()), $$7), ebu.a(boy.a(1), $$8)), it.a, dyc.c, true));
      rt.a($$0, l, dzz.S, new ecv(new eeo(bog.<drd>a().a(dec.sz.n(), 4).a(dec.sy.n(), 7).a(dec.sA.n(), 25).a(dec.bt.n(), 50).a(dec.iH.n(), 10))));
      rt.a($$0, m, dzz.x, new edc(avx.bu, eee.a(dec.sC), si.a($$1.b(l)), egg.b, boy.a(1), 0.0F, 5, 0.8F, bph.a(4, 7), 0.3F));
      rt.a($$0, n, dzz.x, new edc(avx.bu, eee.a(dec.sC), si.a($$1.b(l)), egg.b, boy.a(1), 0.0F, 5, 0.6F, bph.a(1, 2), 0.75F));
      rt.a($$0, o, dzz.ag, new ecw(jb.a(a(), a(it.f), a(it.e), a(it.d), a(it.c))));
      rt.a($$0, p, dzz.x, new edc(avx.bv, eee.a(dec.dR), si.a($$1.b(o)), egg.b, boy.a(3), 0.8F, 2, 0.05F, bph.a(4, 7), 0.7F));
      rt.a($$0, q, dzz.y, new edc(avx.bv, eee.a(dec.dR), si.a($$1.b(o)), egg.b, boy.a(3), 0.8F, 5, 0.1F, bph.a(4, 7), 0.7F));
      rt.a($$0, r, dzz.ah, new eco(si.a($$1.b(p)), si.a($$1.b(q))));
      rt.a($$0, s, dzz.x, new edc(avx.bu, eee.a(dec.sC), si.a($$1.b(k)), egg.a, bph.a(1, 2), 0.0F, 5, 0.08F, bph.a(4, 7), 0.3F));
      rt.a($$0, t, dzz.S, new ecv(eee.a(dec.sx)));
      rt.a(
         $$0,
         u,
         dzz.ai,
         new ece(
            new dws(
               eee.a(dec.a),
               eee.a(dec.qt),
               eee.a(dec.qu),
               eee.a(dec.qN),
               eee.a(dec.te),
               List.of(dec.qy.n(), dec.qx.n(), dec.qw.n(), dec.qv.n()),
               avx.bO,
               avx.bQ
            ),
            new dwu(1.7, 2.2, 3.2, 4.2),
            new dwt(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bph.a(4, 6),
            bph.a(3, 4),
            bph.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rt.a($$0, v, dzz.am, new ecu(10, 32, 64, 0, 1, boy.a(0), 0.5F));
      rt.a($$0, w, dzz.am, new ecu(10, 32, 64, 0, 1, bph.a(1, 3), 0.5F));
      dja $$9 = (dja)dec.qT;
      rt.a($$0, x, dzz.A, new eci($$9, 20, true, true, true, 1.0F, jb.a(dea::q, dec.b, dec.g, dec.e, dec.c, dec.su, dec.qN, dec.qz, dec.sJ)));
   }
}
