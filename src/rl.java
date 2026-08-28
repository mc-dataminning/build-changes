import java.util.List;

public class rl {
   public static final akj<ear<?, ?>> a = rn.a("monster_room");
   public static final akj<ear<?, ?>> b = rn.a("fossil_coal");
   public static final akj<ear<?, ?>> c = rn.a("fossil_diamonds");
   public static final akj<ear<?, ?>> d = rn.a("dripstone_cluster");
   public static final akj<ear<?, ?>> e = rn.a("large_dripstone");
   public static final akj<ear<?, ?>> f = rn.a("pointed_dripstone");
   public static final akj<ear<?, ?>> g = rn.a("underwater_magma");
   public static final akj<ear<?, ?>> h = rn.a("glow_lichen");
   public static final akj<ear<?, ?>> i = rn.a("rooted_azalea_tree");
   public static final akj<ear<?, ?>> j = rn.a("cave_vine");
   public static final akj<ear<?, ?>> k = rn.a("cave_vine_in_moss");
   public static final akj<ear<?, ?>> l = rn.a("moss_vegetation");
   public static final akj<ear<?, ?>> m = rn.a("moss_patch");
   public static final akj<ear<?, ?>> n = rn.a("moss_patch_bonemeal");
   public static final akj<ear<?, ?>> o = rn.a("dripleaf");
   public static final akj<ear<?, ?>> p = rn.a("clay_with_dripleaves");
   public static final akj<ear<?, ?>> q = rn.a("clay_pool_with_dripleaves");
   public static final akj<ear<?, ?>> r = rn.a("lush_caves_clay");
   public static final akj<ear<?, ?>> s = rn.a("moss_patch_ceiling");
   public static final akj<ear<?, ?>> t = rn.a("spore_blossom");
   public static final akj<ear<?, ?>> u = rn.a("amethyst_geode");
   public static final akj<ear<?, ?>> v = rn.a("sculk_patch_deep_dark");
   public static final akj<ear<?, ?>> w = rn.a("sculk_patch_ancient_city");
   public static final akj<ear<?, ?>> x = rn.a("sculk_vein");

   private static jj<ehu> a(jf $$0) {
      return sc.a(
         ebe.w,
         new ecz(
            List.of(
               ecz.a(new bpp(bon.<bpi>a().a(bpo.a(0, 4), 2).a(bpf.a(0), 1).a()), efj.a(dfh.sE.o().a(dsx.R, $$0))),
               ecz.a(bpf.a(1), efj.a(dfh.sD.o().a(dsx.R, $$0)))
            ),
            jf.b,
            dzg.d,
            true
         )
      );
   }

   private static jj<ehu> a() {
      return sc.a(
         ebe.S,
         new eea(
            new eft(
               bon.<dsh>a().a(dfh.sF.o().a(dmk.d, jf.f), 1).a(dfh.sF.o().a(dmk.d, jf.e), 1).a(dfh.sF.o().a(dmk.d, jf.c), 1).a(dfh.sF.o().a(dmk.d, jf.d), 1)
            )
         )
      );
   }

   public static void a(qm<ear<?, ?>> $$0) {
      jk<ear<?, ?>> $$1 = $$0.a(lr.aH);
      jk<emo> $$2 = $$0.a(lr.aR);
      rn.a($$0, a, ebe.C);
      List<akk> $$3 = List.of(
         new akk("fossil/spine_1"),
         new akk("fossil/spine_2"),
         new akk("fossil/spine_3"),
         new akk("fossil/spine_4"),
         new akk("fossil/skull_1"),
         new akk("fossil/skull_2"),
         new akk("fossil/skull_3"),
         new akk("fossil/skull_4")
      );
      List<akk> $$4 = List.of(
         new akk("fossil/spine_1_coal"),
         new akk("fossil/spine_2_coal"),
         new akk("fossil/spine_3_coal"),
         new akk("fossil/spine_4_coal"),
         new akk("fossil/skull_1_coal"),
         new akk("fossil/skull_2_coal"),
         new akk("fossil/skull_3_coal"),
         new akk("fossil/skull_4_coal")
      );
      jj<emo> $$5 = $$2.b(qu.D);
      rn.a($$0, b, ebe.p, new ebj($$3, $$4, $$5, $$2.b(qu.E), 4));
      rn.a($$0, c, ebe.p, new ebj($$3, $$4, $$5, $$2.b(qu.F), 4));
      rn.a($$0, d, ebe.aj, new edg(12, bpo.a(3, 6), bpo.a(2, 8), 1, 3, bpo.a(2, 4), bpn.b(0.3F, 0.7F), bpc.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rn.a($$0, e, ebe.ak, new edl(30, bpo.a(3, 19), bpn.b(0.4F, 2.0F), 0.33F, bpn.b(0.3F, 0.9F), bpn.b(0.4F, 1.0F), bpn.b(0.0F, 0.3F), 4, 0.6F));
      rn.a(
         $$0,
         f,
         ebe.ag,
         new eeb(
            jn.a(
               sc.a(ebe.al, new edr(0.2F, 0.7F, 0.5F, 0.5F), eho.a(jf.a, dzg.c(), dzg.d, 12), ehz.a(bpf.a(1))),
               sc.a(ebe.al, new edr(0.2F, 0.7F, 0.5F, 0.5F), eho.a(jf.b, dzg.c(), dzg.d, 12), ehz.a(bpf.a(-1)))
            )
         )
      );
      rn.a($$0, g, ebe.B, new eeg(5, 1, 0.5F));
      dkf $$6 = (dkf)dfh.fg;
      rn.a($$0, h, ebe.A, new edn($$6, 20, false, true, true, 0.5F, jn.a(dff::s, dfh.b, dfh.g, dfh.e, dfh.c, dfh.su, dfh.qN, dfh.qz, dfh.sJ)));
      rn.a(
         $$0,
         i,
         ebe.z,
         new edy(
            sc.a($$1.b(rs.w)),
            3,
            3,
            avu.bw,
            efj.a(dfh.sH),
            20,
            100,
            3,
            2,
            efj.a(dfh.sG),
            20,
            2,
            dzg.a(dzg.b(dzg.c(List.of(dfh.a, dfh.nc, dfh.nb)), dzg.a(avu.cn)), dzg.a(jf.a.q(), avu.ch))
         )
      );
      eft $$7 = new eft(bon.<dsh>a().a(dfh.sw.o(), 4).a(dfh.sw.o().a(dgb.r_, Boolean.valueOf(true)), 1));
      efp $$8 = new efp(new eft(bon.<dsh>a().a(dfh.sv.o(), 4).a(dfh.sv.o().a(dgb.r_, Boolean.valueOf(true)), 1)), dgc.e, bpo.a(23, 25));
      rn.a(
         $$0,
         j,
         ebe.w,
         new ecz(
            List.of(ecz.a(new bpp(bon.<bpi>a().a(bpo.a(0, 19), 2).a(bpo.a(0, 2), 3).a(bpo.a(0, 6), 10).a()), $$7), ecz.a(bpf.a(1), $$8)), jf.a, dzg.c, true
         )
      );
      rn.a($$0, k, ebe.w, new ecz(List.of(ecz.a(new bpp(bon.<bpi>a().a(bpo.a(0, 3), 5).a(bpo.a(1, 7), 1).a()), $$7), ecz.a(bpf.a(1), $$8)), jf.a, dzg.c, true));
      rn.a($$0, l, ebe.S, new eea(new eft(bon.<dsh>a().a(dfh.sz.o(), 4).a(dfh.sy.o(), 7).a(dfh.sA.o(), 25).a(dfh.bt.o(), 50).a(dfh.iH.o(), 10))));
      rn.a($$0, m, ebe.x, new eeh(avu.bu, efj.a(dfh.sC), sc.a($$1.b(l)), ehl.b, bpf.a(1), 0.0F, 5, 0.8F, bpo.a(4, 7), 0.3F));
      rn.a($$0, n, ebe.x, new eeh(avu.bu, efj.a(dfh.sC), sc.a($$1.b(l)), ehl.b, bpf.a(1), 0.0F, 5, 0.6F, bpo.a(1, 2), 0.75F));
      rn.a($$0, o, ebe.ag, new eeb(jn.a(a(), a(jf.f), a(jf.e), a(jf.d), a(jf.c))));
      rn.a($$0, p, ebe.x, new eeh(avu.bv, efj.a(dfh.dR), sc.a($$1.b(o)), ehl.b, bpf.a(3), 0.8F, 2, 0.05F, bpo.a(4, 7), 0.7F));
      rn.a($$0, q, ebe.y, new eeh(avu.bv, efj.a(dfh.dR), sc.a($$1.b(o)), ehl.b, bpf.a(3), 0.8F, 5, 0.1F, bpo.a(4, 7), 0.7F));
      rn.a($$0, r, ebe.ah, new edt(sc.a($$1.b(p)), sc.a($$1.b(q))));
      rn.a($$0, s, ebe.x, new eeh(avu.bu, efj.a(dfh.sC), sc.a($$1.b(k)), ehl.a, bpo.a(1, 2), 0.0F, 5, 0.08F, bpo.a(4, 7), 0.3F));
      rn.a($$0, t, ebe.S, new eea(efj.a(dfh.sx)));
      rn.a(
         $$0,
         u,
         ebe.ai,
         new edj(
            new dxw(
               efj.a(dfh.a),
               efj.a(dfh.qt),
               efj.a(dfh.qu),
               efj.a(dfh.qN),
               efj.a(dfh.te),
               List.of(dfh.qy.o(), dfh.qx.o(), dfh.qw.o(), dfh.qv.o()),
               avu.bO,
               avu.bQ
            ),
            new dxy(1.7, 2.2, 3.2, 4.2),
            new dxx(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bpo.a(4, 6),
            bpo.a(3, 4),
            bpo.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rn.a($$0, v, ebe.am, new edz(10, 32, 64, 0, 1, bpf.a(0), 0.5F));
      rn.a($$0, w, ebe.am, new edz(10, 32, 64, 0, 1, bpo.a(1, 3), 0.5F));
      dkf $$9 = (dkf)dfh.qT;
      rn.a($$0, x, ebe.A, new edn($$9, 20, true, true, true, 1.0F, jn.a(dff::s, dfh.b, dfh.g, dfh.e, dfh.c, dfh.su, dfh.qN, dfh.qz, dfh.sJ)));
   }
}
