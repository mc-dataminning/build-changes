import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mu implements mq {
   public static final List<bwo<?>> a = List.of(
      bwo.al,
      bwo.I,
      bwo.aF,
      bwo.bb,
      bwo.C,
      bwo.aE,
      bwo.aQ,
      bwo.z,
      bwo.bM,
      bwo.aI,
      bwo.aY,
      bwo.ax,
      bwo.u,
      bwo.aN,
      bwo.aa,
      bwo.l,
      bwo.aj,
      bwo.bt,
      bwo.ah,
      bwo.h,
      bwo.t,
      bwo.e
   );
   public static final List<bwo<?>> b = List.of(bwo.bB, bwo.ab, bwo.bj);
   private static final cyz[] d = new cyz[]{czh.sh, czh.sj, czh.sk, czh.si};
   private static final cyz[] e = new cyz[]{czh.rx, czh.ry, czh.rv, czh.rw};
   private static final cyz[] f = new cyz[]{
      czh.pi,
      czh.qf,
      czh.ql,
      czh.qL,
      czh.qM,
      czh.qO,
      czh.qP,
      czh.sh,
      czh.si,
      czh.sj,
      czh.sk,
      czh.sl,
      czh.sm,
      czh.ta,
      czh.te,
      czh.ti,
      czh.tj,
      czh.tk,
      czh.tl,
      czh.tm,
      czh.tu,
      czh.vp,
      czh.vq,
      czh.vr,
      czh.vs,
      czh.vu,
      czh.vD,
      czh.vL,
      czh.vM,
      czh.vN,
      czh.vY,
      czh.vZ,
      czh.wr,
      czh.wv,
      czh.wx,
      czh.tf,
      czh.xh,
      czh.xG,
      czh.xO,
      czh.xH
   };
   public static final cyz[] c = new cyz[]{czh.pD, czh.pN, czh.pI, czh.pS, czh.pX, czh.qc};

   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwo<?>> $$2 = $$0.e(mg.B);
      jf<cyz> $$3 = $$0.e(mg.K);
      jf<dmf> $$4 = $$0.e(mg.i);
      jg<ckx> $$5 = $$0.e(mg.aT);
      jg<ciy> $$6 = $$0.e(mg.aH);
      jg.b<dfq> $$7 = $$0.e(mg.aR);
      ai $$8 = ah.a.a()
         .a(
            dmh.iL,
            wy.c("advancements.husbandry.root.title"),
            wy.c("advancements.husbandry.root.description"),
            alg.b("gui/advancements/backgrounds/husbandry"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", bh.a.b())
         .a($$1, "husbandry/root");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(czh.qk, wy.c("advancements.husbandry.plant_seed.title"), wy.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cm.a.a(dmh.cM))
         .a("pumpkin_stem", cm.a.a(dmh.fv))
         .a("melon_stem", cm.a.a(dmh.fw))
         .a("beetroots", cm.a.a(dmh.lj))
         .a("nether_wart", cm.a.a(dmh.fP))
         .a("torchflower", cm.a.a(dmh.lg))
         .a("pitcher_pod", cm.a.a(dmh.lh))
         .a($$1, "husbandry/plant_seed");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(
            czh.qk,
            wy.c("advancements.husbandry.breed_an_animal.title"),
            wy.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("bred", az.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$10, $$1, $$2, a.stream(), b.stream());
      a(ah.a.a(), $$3)
         .a($$9)
         .a(czh.pi, wy.c("advancements.husbandry.balanced_diet.title"), wy.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$9)
         .a(czh.qd, wy.c("advancements.husbandry.netherite_hoe.title"), wy.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(czh.qd))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$11 = ah.a.a()
         .a($$8)
         .a(
            czh.vV,
            wy.c("advancements.husbandry.tame_an_animal.title"),
            wy.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dt.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ai $$12 = c(ah.a.a(), $$3)
         .a($$8)
         .a(al.a.b)
         .a(
            czh.sd,
            wy.c("advancements.husbandry.fishy_business.title"),
            wy.c("advancements.husbandry.fishy_business.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ai $$13 = b(ah.a.a(), $$3)
         .a($$12)
         .a(al.a.b)
         .a(
            czh.rv,
            wy.c("advancements.husbandry.tactical_fishing.title"),
            wy.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ai $$14 = ah.a.a()
         .a($$13)
         .a(al.a.b)
         .a(mf.g.b(czh.rz).a(), cc.a.a(cl.a.a().a($$3, czh.rz)))
         .a(
            czh.rz,
            wy.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wy.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ah.a.a()
         .a($$14)
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, bwo.h)))
         .a(
            czh.ry,
            wy.c("advancements.husbandry.kill_axolotl_target.title"),
            wy.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ah.a.a(), $$6)
         .a($$11)
         .a(
            czh.sh,
            wy.c("advancements.husbandry.complete_catalogue.title"),
            wy.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ah.a.a(), $$0)
         .a($$11)
         .a(czh.sH, wy.c("advancements.husbandry.whole_pack.title"), wy.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$15 = ah.a.a()
         .a($$8)
         .a("safely_harvest_honey", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axc.aJ)).a(true), cl.a.a().a($$3, czh.ts)))
         .a(
            czh.xO,
            wy.c("advancements.husbandry.safely_harvest_honey.title"),
            wy.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ai $$16 = ah.a.a()
         .a($$15)
         .a(czh.xL, wy.c("advancements.husbandry.wax_on.title"), wy.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyu.a.get().keySet())), cl.a.a().a($$3, czh.xL)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$16)
         .a(czh.pI, wy.c("advancements.husbandry.wax_off.title"), wy.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyu.b.get().keySet())), cl.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$17 = ah.a.a()
         .a($$8)
         .a(mf.g.b(czh.rA).a(), cc.a.a(cl.a.a().a($$3, czh.rA)))
         .a(
            czh.rA,
            wy.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wy.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ai $$18 = a($$2, $$3, $$5, ah.a.a())
         .a($$17)
         .a(
            czh.vV,
            wy.c("advancements.husbandry.leash_all_frog_variants.title"),
            wy.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ah.a.a()
         .a($$18)
         .a(czh.yC, wy.c("advancements.husbandry.froglights.title"), wy.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(czh.yB, czh.yD, czh.yC))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$8)
         .a("silk_touch_nest", ax.a.a(dmh.pM, cl.a.a().a(kt.b, ku.a(List.of(new bs($$7.b(dfv.v), cv.d.b(1))))), cv.d.a(3)))
         .a(
            dmh.pM,
            wy.c("advancements.husbandry.silk_touch_nest.title"),
            wy.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ah.a.a()
         .a($$8)
         .a(
            czh.oE,
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dp.a.a(bx.a.a().a(bx.a.a().a($$2, axf.I).b(bx.a.a().a($$2, bwo.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$8)
         .a(
            czh.so,
            wy.c("advancements.husbandry.make_a_sign_glow.title"),
            wy.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axc.aE)), cl.a.a().a($$3, czh.so)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$19 = ah.a.a()
         .a($$8)
         .a(
            czh.ta,
            wy.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wy.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cz.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, bwo.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$19)
         .a(
            czh.mJ,
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cm.a.b(ct.a.a().a(ay.a.a().a($$4, dmh.bf)), cl.a.a().a($$3, czh.sJ)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$20 = ah.a.a()
         .a($$8)
         .a(
            czh.kU,
            wy.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wy.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(czh.kU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$21 = ah.a.a()
         .a($$20)
         .a(czh.wt, wy.c("advancements.husbandry.feed_snifflet.title"), wy.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", db.a.a(cl.a.a().a($$3, axk.ab), Optional.of(bx.a(bx.a.a().a($$2, bwo.bj).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$21)
         .a(
            czh.wu,
            wy.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wy.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cm.a.a(dmh.lg))
         .a("pitcher_pod", cm.a.a(dmh.lh))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$11)
         .a(
            czh.td,
            wy.c("advancements.husbandry.remove_wolf_armor.title"),
            wy.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", db.a.a(cl.a.a().a($$3, czh.td), Optional.of(bx.a(bx.a.a().a($$2, bwo.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$11)
         .a(
            czh.pf,
            wy.c("advancements.husbandry.repair_wolf_armor.title"),
            wy.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            db.a.a(cl.a.a().a($$3, czh.pe), Optional.of(bx.a(bx.a.a().a($$2, bwo.bM).a(bu.a.a().e(cl.a.a().a($$3, czh.pf).a(kd.a(kj.e, 0)))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jf<bwo<?>> $$2, Stream<bwo<?>> $$3, Stream<bwo<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            czh.vu,
            wy.c("advancements.husbandry.breed_all_animals.title"),
            wy.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ah.a a(jf<bwo<?>> $$0, jf<cyz> $$1, jg<ckx> $$2, ah.a $$3) {
      $$2.c().forEach($$3x -> $$3.a($$3x.h().a().toString(), db.a.a(cl.a.a().a($$1, czh.vV), Optional.of(bx.a(bx.a.a().a($$0, bwo.ab).a(kd.a(kj.aJ, $$3x)))))));
      return $$3;
   }

   private static ah.a a(ah.a $$0, jf<cyz> $$1) {
      for (cyz $$2 : f) {
         $$0.a(mf.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<bwo<?>> $$1, jf<bwo<?>> $$2, Stream<bwo<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bwo.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bwo.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, jf<cyz> $$1) {
      for (cyz $$2 : e) {
         $$0.a(mf.g.b($$2).a(), cc.a.a(cl.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, jf<cyz> $$1) {
      for (cyz $$2 : d) {
         $$0.a(mf.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cl.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, jg<ciy> $$1) {
      $$1.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1x -> $$0.a($$1x.h().a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aO, $$1x)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jg.a $$1) {
      jg.b<ckf> $$2 = $$1.e(mg.bm);
      $$2.c_().sorted(Comparator.comparing(alf::a)).forEach($$2x -> {
         je<ckf> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aw, $$3))));
      });
      return $$0;
   }
}
