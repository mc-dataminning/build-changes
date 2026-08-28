import java.util.List;

public class sf {
   public static final ald<eak<?, ?>> a = sh.a("monster_room");
   public static final ald<eak<?, ?>> b = sh.a("fossil_coal");
   public static final ald<eak<?, ?>> c = sh.a("fossil_diamonds");
   public static final ald<eak<?, ?>> d = sh.a("dripstone_cluster");
   public static final ald<eak<?, ?>> e = sh.a("large_dripstone");
   public static final ald<eak<?, ?>> f = sh.a("pointed_dripstone");
   public static final ald<eak<?, ?>> g = sh.a("underwater_magma");
   public static final ald<eak<?, ?>> h = sh.a("glow_lichen");
   public static final ald<eak<?, ?>> i = sh.a("rooted_azalea_tree");
   public static final ald<eak<?, ?>> j = sh.a("cave_vine");
   public static final ald<eak<?, ?>> k = sh.a("cave_vine_in_moss");
   public static final ald<eak<?, ?>> l = sh.a("moss_vegetation");
   public static final ald<eak<?, ?>> m = sh.a("moss_patch");
   public static final ald<eak<?, ?>> n = sh.a("moss_patch_bonemeal");
   public static final ald<eak<?, ?>> o = sh.a("dripleaf");
   public static final ald<eak<?, ?>> p = sh.a("clay_with_dripleaves");
   public static final ald<eak<?, ?>> q = sh.a("clay_pool_with_dripleaves");
   public static final ald<eak<?, ?>> r = sh.a("lush_caves_clay");
   public static final ald<eak<?, ?>> s = sh.a("moss_patch_ceiling");
   public static final ald<eak<?, ?>> t = sh.a("spore_blossom");
   public static final ald<eak<?, ?>> u = sh.a("amethyst_geode");
   public static final ald<eak<?, ?>> v = sh.a("sculk_patch_deep_dark");
   public static final ald<eak<?, ?>> w = sh.a("sculk_patch_ancient_city");
   public static final ald<eak<?, ?>> x = sh.a("sculk_vein");

   private static ji<ehn> a(je $$0) {
      return sw.a(
         eax.w,
         new ecs(
            List.of(
               ecs.a(new bqf(bpd.<bpy>a().a(bqe.a(0, 4), 2).a(bpv.a(0), 1).a()), efc.a(dfa.sE.o().a(dsr.R, $$0))),
               ecs.a(bpv.a(1), efc.a(dfa.sD.o().a(dsr.R, $$0)))
            ),
            je.b,
            dza.d,
            true
         )
      );
   }

   private static ji<ehn> a() {
      return sw.a(
         eax.S,
         new edt(
            new efm(
               bpd.<dsb>a().a(dfa.sF.o().a(dmd.d, je.f), 1).a(dfa.sF.o().a(dmd.d, je.e), 1).a(dfa.sF.o().a(dmd.d, je.c), 1).a(dfa.sF.o().a(dmd.d, je.d), 1)
            )
         )
      );
   }

   public static void a(rc<eak<?, ?>> $$0) {
      jj<eak<?, ?>> $$1 = $$0.a(lq.aC);
      jj<emh> $$2 = $$0.a(lq.aK);
      sh.a($$0, a, eax.C);
      List<ale> $$3 = List.of(
         new ale("fossil/spine_1"),
         new ale("fossil/spine_2"),
         new ale("fossil/spine_3"),
         new ale("fossil/spine_4"),
         new ale("fossil/skull_1"),
         new ale("fossil/skull_2"),
         new ale("fossil/skull_3"),
         new ale("fossil/skull_4")
      );
      List<ale> $$4 = List.of(
         new ale("fossil/spine_1_coal"),
         new ale("fossil/spine_2_coal"),
         new ale("fossil/spine_3_coal"),
         new ale("fossil/spine_4_coal"),
         new ale("fossil/skull_1_coal"),
         new ale("fossil/skull_2_coal"),
         new ale("fossil/skull_3_coal"),
         new ale("fossil/skull_4_coal")
      );
      ji<emh> $$5 = $$2.b(rk.D);
      sh.a($$0, b, eax.p, new ebc($$3, $$4, $$5, $$2.b(rk.E), 4));
      sh.a($$0, c, eax.p, new ebc($$3, $$4, $$5, $$2.b(rk.F), 4));
      sh.a($$0, d, eax.aj, new ecz(12, bqe.a(3, 6), bqe.a(2, 8), 1, 3, bqe.a(2, 4), bqd.b(0.3F, 0.7F), bps.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      sh.a($$0, e, eax.ak, new ede(30, bqe.a(3, 19), bqd.b(0.4F, 2.0F), 0.33F, bqd.b(0.3F, 0.9F), bqd.b(0.4F, 1.0F), bqd.b(0.0F, 0.3F), 4, 0.6F));
      sh.a(
         $$0,
         f,
         eax.ag,
         new edu(
            jm.a(
               sw.a(eax.al, new edk(0.2F, 0.7F, 0.5F, 0.5F), ehh.a(je.a, dza.c(), dza.d, 12), ehs.a(bpv.a(1))),
               sw.a(eax.al, new edk(0.2F, 0.7F, 0.5F, 0.5F), ehh.a(je.b, dza.c(), dza.d, 12), ehs.a(bpv.a(-1)))
            )
         )
      );
      sh.a($$0, g, eax.B, new edz(5, 1, 0.5F));
      djy $$6 = (djy)dfa.fg;
      sh.a($$0, h, eax.A, new edg($$6, 20, false, true, true, 0.5F, jm.a(dey::s, dfa.b, dfa.g, dfa.e, dfa.c, dfa.su, dfa.qN, dfa.qz, dfa.sJ)));
      sh.a(
         $$0,
         i,
         eax.z,
         new edr(
            sw.a($$1.b(sm.w)),
            3,
            3,
            awo.bw,
            efc.a(dfa.sH),
            20,
            100,
            3,
            2,
            efc.a(dfa.sG),
            20,
            2,
            dza.a(dza.b(dza.c(List.of(dfa.a, dfa.nc, dfa.nb)), dza.a(awo.cn)), dza.a(je.a.q(), awo.ch))
         )
      );
      efm $$7 = new efm(bpd.<dsb>a().a(dfa.sw.o(), 4).a(dfa.sw.o().a(dfu.r_, Boolean.valueOf(true)), 1));
      efi $$8 = new efi(new efm(bpd.<dsb>a().a(dfa.sv.o(), 4).a(dfa.sv.o().a(dfu.r_, Boolean.valueOf(true)), 1)), dfv.e, bqe.a(23, 25));
      sh.a(
         $$0,
         j,
         eax.w,
         new ecs(
            List.of(ecs.a(new bqf(bpd.<bpy>a().a(bqe.a(0, 19), 2).a(bqe.a(0, 2), 3).a(bqe.a(0, 6), 10).a()), $$7), ecs.a(bpv.a(1), $$8)), je.a, dza.c, true
         )
      );
      sh.a($$0, k, eax.w, new ecs(List.of(ecs.a(new bqf(bpd.<bpy>a().a(bqe.a(0, 3), 5).a(bqe.a(1, 7), 1).a()), $$7), ecs.a(bpv.a(1), $$8)), je.a, dza.c, true));
      sh.a($$0, l, eax.S, new edt(new efm(bpd.<dsb>a().a(dfa.sz.o(), 4).a(dfa.sy.o(), 7).a(dfa.sA.o(), 25).a(dfa.bt.o(), 50).a(dfa.iH.o(), 10))));
      sh.a($$0, m, eax.x, new eea(awo.bu, efc.a(dfa.sC), sw.a($$1.b(l)), ehe.b, bpv.a(1), 0.0F, 5, 0.8F, bqe.a(4, 7), 0.3F));
      sh.a($$0, n, eax.x, new eea(awo.bu, efc.a(dfa.sC), sw.a($$1.b(l)), ehe.b, bpv.a(1), 0.0F, 5, 0.6F, bqe.a(1, 2), 0.75F));
      sh.a($$0, o, eax.ag, new edu(jm.a(a(), a(je.f), a(je.e), a(je.d), a(je.c))));
      sh.a($$0, p, eax.x, new eea(awo.bv, efc.a(dfa.dR), sw.a($$1.b(o)), ehe.b, bpv.a(3), 0.8F, 2, 0.05F, bqe.a(4, 7), 0.7F));
      sh.a($$0, q, eax.y, new eea(awo.bv, efc.a(dfa.dR), sw.a($$1.b(o)), ehe.b, bpv.a(3), 0.8F, 5, 0.1F, bqe.a(4, 7), 0.7F));
      sh.a($$0, r, eax.ah, new edm(sw.a($$1.b(p)), sw.a($$1.b(q))));
      sh.a($$0, s, eax.x, new eea(awo.bu, efc.a(dfa.sC), sw.a($$1.b(k)), ehe.a, bqe.a(1, 2), 0.0F, 5, 0.08F, bqe.a(4, 7), 0.3F));
      sh.a($$0, t, eax.S, new edt(efc.a(dfa.sx)));
      sh.a(
         $$0,
         u,
         eax.ai,
         new edc(
            new dxq(
               efc.a(dfa.a),
               efc.a(dfa.qt),
               efc.a(dfa.qu),
               efc.a(dfa.qN),
               efc.a(dfa.te),
               List.of(dfa.qy.o(), dfa.qx.o(), dfa.qw.o(), dfa.qv.o()),
               awo.bO,
               awo.bQ
            ),
            new dxs(1.7, 2.2, 3.2, 4.2),
            new dxr(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bqe.a(4, 6),
            bqe.a(3, 4),
            bqe.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      sh.a($$0, v, eax.am, new eds(10, 32, 64, 0, 1, bpv.a(0), 0.5F));
      sh.a($$0, w, eax.am, new eds(10, 32, 64, 0, 1, bqe.a(1, 3), 0.5F));
      djy $$9 = (djy)dfa.qT;
      sh.a($$0, x, eax.A, new edg($$9, 20, true, true, true, 1.0F, jm.a(dey::s, dfa.b, dfa.g, dfa.e, dfa.c, dfa.su, dfa.qN, dfa.qz, dfa.sJ)));
   }
}
