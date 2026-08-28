import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mu implements mq {
   public static final List<bwm<?>> a = List.of(
      bwm.al,
      bwm.I,
      bwm.aF,
      bwm.bb,
      bwm.C,
      bwm.aE,
      bwm.aQ,
      bwm.z,
      bwm.bM,
      bwm.aI,
      bwm.aY,
      bwm.ax,
      bwm.u,
      bwm.aN,
      bwm.aa,
      bwm.l,
      bwm.aj,
      bwm.bt,
      bwm.ah,
      bwm.h,
      bwm.t,
      bwm.e
   );
   public static final List<bwm<?>> b = List.of(bwm.bB, bwm.ab, bwm.bj);
   private static final cyu[] d = new cyu[]{czc.sc, czc.se, czc.sf, czc.sd};
   private static final cyu[] e = new cyu[]{czc.ru, czc.rv, czc.rs, czc.rt};
   private static final cyu[] f = new cyu[]{
      czc.pf,
      czc.qc,
      czc.qi,
      czc.qI,
      czc.qJ,
      czc.qL,
      czc.qM,
      czc.sc,
      czc.sd,
      czc.se,
      czc.sf,
      czc.sg,
      czc.sh,
      czc.sV,
      czc.sZ,
      czc.td,
      czc.te,
      czc.tf,
      czc.tg,
      czc.th,
      czc.tp,
      czc.vk,
      czc.vl,
      czc.vm,
      czc.vn,
      czc.vp,
      czc.vy,
      czc.vG,
      czc.vH,
      czc.vI,
      czc.vT,
      czc.vU,
      czc.wm,
      czc.wq,
      czc.ws,
      czc.ta,
      czc.xc,
      czc.xB,
      czc.xJ,
      czc.xC
   };
   public static final cyu[] c = new cyu[]{czc.pA, czc.pK, czc.pF, czc.pP, czc.pU, czc.pZ};

   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwm<?>> $$2 = $$0.e(mg.B);
      jf<cyu> $$3 = $$0.e(mg.K);
      jf<dma> $$4 = $$0.e(mg.i);
      jg<ckt> $$5 = $$0.e(mg.aS);
      jg<ciw> $$6 = $$0.e(mg.aH);
      jg.b<dfl> $$7 = $$0.e(mg.aQ);
      ai $$8 = ah.a.a()
         .a(
            dmc.iI,
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
         .a(czc.qh, wy.c("advancements.husbandry.plant_seed.title"), wy.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cm.a.a(dmc.cK))
         .a("pumpkin_stem", cm.a.a(dmc.fs))
         .a("melon_stem", cm.a.a(dmc.ft))
         .a("beetroots", cm.a.a(dmc.lg))
         .a("nether_wart", cm.a.a(dmc.fM))
         .a("torchflower", cm.a.a(dmc.ld))
         .a("pitcher_pod", cm.a.a(dmc.le))
         .a($$1, "husbandry/plant_seed");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(
            czc.qh,
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
         .a(czc.pf, wy.c("advancements.husbandry.balanced_diet.title"), wy.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$9)
         .a(czc.qa, wy.c("advancements.husbandry.netherite_hoe.title"), wy.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(czc.qa))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$11 = ah.a.a()
         .a($$8)
         .a(
            czc.vQ,
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
            czc.rY,
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
            czc.rs,
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
         .a(mf.g.b(czc.rw).a(), cc.a.a(cl.a.a().a($$3, czc.rw)))
         .a(
            czc.rw,
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
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, bwm.h)))
         .a(
            czc.rv,
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
            czc.sc,
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
         .a(czc.sC, wy.c("advancements.husbandry.whole_pack.title"), wy.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$15 = ah.a.a()
         .a($$8)
         .a("safely_harvest_honey", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axc.aJ)).a(true), cl.a.a().a($$3, czc.tn)))
         .a(
            czc.xJ,
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
         .a(czc.xG, wy.c("advancements.husbandry.wax_on.title"), wy.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyp.a.get().keySet())), cl.a.a().a($$3, czc.xG)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$16)
         .a(czc.pF, wy.c("advancements.husbandry.wax_off.title"), wy.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyp.b.get().keySet())), cl.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$17 = ah.a.a()
         .a($$8)
         .a(mf.g.b(czc.rx).a(), cc.a.a(cl.a.a().a($$3, czc.rx)))
         .a(
            czc.rx,
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
            czc.vQ,
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
         .a(czc.yx, wy.c("advancements.husbandry.froglights.title"), wy.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(czc.yw, czc.yy, czc.yx))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$8)
         .a("silk_touch_nest", ax.a.a(dmc.pJ, cl.a.a().a(kt.b, ku.a(List.of(new bs($$7.b(dfq.v), cv.d.b(1))))), cv.d.a(3)))
         .a(
            dmc.pJ,
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
            czc.oB,
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dp.a.a(bx.a.a().a(bx.a.a().a($$2, axf.I).b(bx.a.a().a($$2, bwm.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$8)
         .a(
            czc.sj,
            wy.c("advancements.husbandry.make_a_sign_glow.title"),
            wy.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axc.aE)), cl.a.a().a($$3, czc.sj)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$19 = ah.a.a()
         .a($$8)
         .a(
            czc.sV,
            wy.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wy.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cz.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, bwm.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$19)
         .a(
            czc.mG,
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cm.a.b(ct.a.a().a(ay.a.a().a($$4, dmc.bf)), cl.a.a().a($$3, czc.sE)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$20 = ah.a.a()
         .a($$8)
         .a(
            czc.kR,
            wy.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wy.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(czc.kR))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$21 = ah.a.a()
         .a($$20)
         .a(czc.wo, wy.c("advancements.husbandry.feed_snifflet.title"), wy.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", db.a.a(cl.a.a().a($$3, axk.aa), Optional.of(bx.a(bx.a.a().a($$2, bwm.bj).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$21)
         .a(
            czc.wp,
            wy.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wy.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cm.a.a(dmc.ld))
         .a("pitcher_pod", cm.a.a(dmc.le))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$11)
         .a(
            czc.sY,
            wy.c("advancements.husbandry.remove_wolf_armor.title"),
            wy.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", db.a.a(cl.a.a().a($$3, czc.sY), Optional.of(bx.a(bx.a.a().a($$2, bwm.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$11)
         .a(
            czc.pc,
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
            db.a.a(cl.a.a().a($$3, czc.pb), Optional.of(bx.a(bx.a.a().a($$2, bwm.bM).a(bu.a.a().e(cl.a.a().a($$3, czc.pc).a(kd.a(kj.e, 0)))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jf<bwm<?>> $$2, Stream<bwm<?>> $$3, Stream<bwm<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            czc.vp,
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

   private static ah.a a(jf<bwm<?>> $$0, jf<cyu> $$1, jg<ckt> $$2, ah.a $$3) {
      $$2.c().forEach($$3x -> $$3.a($$3x.h().a().toString(), db.a.a(cl.a.a().a($$1, czc.vQ), Optional.of(bx.a(bx.a.a().a($$0, bwm.ab).a(kd.a(kj.aI, $$3x)))))));
      return $$3;
   }

   private static ah.a a(ah.a $$0, jf<cyu> $$1) {
      for (cyu $$2 : f) {
         $$0.a(mf.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<bwm<?>> $$1, jf<bwm<?>> $$2, Stream<bwm<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bwm.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bwm.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, jf<cyu> $$1) {
      for (cyu $$2 : e) {
         $$0.a(mf.g.b($$2).a(), cc.a.a(cl.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, jf<cyu> $$1) {
      for (cyu $$2 : d) {
         $$0.a(mf.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cl.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, jg<ciw> $$1) {
      $$1.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1x -> $$0.a($$1x.h().a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aN, $$1x)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jg.a $$1) {
      jg.b<ckb> $$2 = $$1.e(mg.bl);
      $$2.c_().sorted(Comparator.comparing(alf::a)).forEach($$2x -> {
         je<ckb> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aw, $$3))));
      });
      return $$0;
   }
}
