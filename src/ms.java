import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ms implements mo {
   public static final List<bwb<?>> a = List.of(
      bwb.al,
      bwb.I,
      bwb.aF,
      bwb.ba,
      bwb.C,
      bwb.aE,
      bwb.aQ,
      bwb.z,
      bwb.bL,
      bwb.aI,
      bwb.aX,
      bwb.ax,
      bwb.u,
      bwb.aN,
      bwb.aa,
      bwb.l,
      bwb.aj,
      bwb.bs,
      bwb.ah,
      bwb.h,
      bwb.t,
      bwb.e
   );
   public static final List<bwb<?>> b = List.of(bwb.bA, bwb.ab, bwb.bi);
   private static final cxu[] d = new cxu[]{cyc.sa, cyc.sc, cyc.sd, cyc.sb};
   private static final cxu[] e = new cxu[]{cyc.rs, cyc.rt, cyc.rq, cyc.rr};
   private static final cxu[] f = new cxu[]{
      cyc.pd,
      cyc.qa,
      cyc.qg,
      cyc.qG,
      cyc.qH,
      cyc.qJ,
      cyc.qK,
      cyc.sa,
      cyc.sb,
      cyc.sc,
      cyc.sd,
      cyc.se,
      cyc.sf,
      cyc.sT,
      cyc.sX,
      cyc.tb,
      cyc.tc,
      cyc.td,
      cyc.te,
      cyc.tf,
      cyc.tn,
      cyc.vi,
      cyc.vj,
      cyc.vk,
      cyc.vl,
      cyc.vn,
      cyc.vw,
      cyc.vE,
      cyc.vF,
      cyc.vG,
      cyc.vR,
      cyc.vS,
      cyc.wk,
      cyc.wo,
      cyc.wq,
      cyc.sY,
      cyc.xa,
      cyc.xz,
      cyc.xH,
      cyc.xA
   };
   public static final cxu[] c = new cxu[]{cyc.py, cyc.pI, cyc.pD, cyc.pN, cyc.pS, cyc.pX};

   @Override
   public void a(ju.a $$0, Consumer<ai> $$1) {
      jt<bwb<?>> $$2 = $$0.e(me.z);
      jt<cxu> $$3 = $$0.e(me.K);
      jt<dku> $$4 = $$0.e(me.f);
      ju.b<deh> $$5 = $$0.e(me.aS);
      ai $$6 = ah.a.a()
         .a(
            dkw.iH,
            wv.c("advancements.husbandry.root.title"),
            wv.c("advancements.husbandry.root.description"),
            ald.b("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", bh.a.b())
         .a($$1, "husbandry/root");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cyc.qf, wv.c("advancements.husbandry.plant_seed.title"), wv.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cz.a.a(dkw.cJ))
         .a("pumpkin_stem", cz.a.a(dkw.fr))
         .a("melon_stem", cz.a.a(dkw.fs))
         .a("beetroots", cz.a.a(dkw.lf))
         .a("nether_wart", cz.a.a(dkw.fL))
         .a("torchflower", cz.a.a(dkw.lc))
         .a("pitcher_pod", cz.a.a(dkw.ld))
         .a($$1, "husbandry/plant_seed");
      ai $$8 = ah.a.a()
         .a($$6)
         .a(
            cyc.qf,
            wv.c("advancements.husbandry.breed_an_animal.title"),
            wv.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("bred", az.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$8, $$1, $$2, a.stream(), b.stream());
      a(ah.a.a(), $$3)
         .a($$7)
         .a(cyc.pd, wv.c("advancements.husbandry.balanced_diet.title"), wv.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$7)
         .a(cyc.pY, wv.c("advancements.husbandry.netherite_hoe.title"), wv.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(cyc.pY))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(
            cyc.vO,
            wv.c("advancements.husbandry.tame_an_animal.title"),
            wv.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("tamed_animal", ei.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ai $$10 = c(ah.a.a(), $$3)
         .a($$6)
         .a(al.a.b)
         .a(
            cyc.rW,
            wv.c("advancements.husbandry.fishy_business.title"),
            wv.c("advancements.husbandry.fishy_business.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ai $$11 = b(ah.a.a(), $$3)
         .a($$10)
         .a(al.a.b)
         .a(
            cyc.rq,
            wv.c("advancements.husbandry.tactical_fishing.title"),
            wv.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(al.a.b)
         .a(md.g.b(cyc.ru).a(), cc.a.a(cv.a.a().a($$3, cyc.ru)))
         .a(
            cyc.ru,
            wv.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wv.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ah.a.a()
         .a($$12)
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, bwb.h)))
         .a(
            cyc.rt,
            wv.c("advancements.husbandry.kill_axolotl_target.title"),
            wv.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ah.a.a())
         .a($$9)
         .a(
            cyc.sa,
            wv.c("advancements.husbandry.complete_catalogue.title"),
            wv.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ah.a.a(), $$0)
         .a($$9)
         .a(cyc.sA, wv.c("advancements.husbandry.whole_pack.title"), wv.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$13 = ah.a.a()
         .a($$6)
         .a("safely_harvest_honey", cz.a.a(di.a.a().a(ay.a.a().a($$4, awz.aJ)).a(true), cv.a.a().a($$3, cyc.tl)))
         .a(
            cyc.xH,
            wv.c("advancements.husbandry.safely_harvest_honey.title"),
            wv.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ai $$14 = ah.a.a()
         .a($$13)
         .a(cyc.xE, wv.c("advancements.husbandry.wax_on.title"), wv.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cz.a.a(di.a.a().a(ay.a.a().a($$4, cxp.a.get().keySet())), cv.a.a().a($$3, cyc.xE)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$14)
         .a(cyc.pD, wv.c("advancements.husbandry.wax_off.title"), wv.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cz.a.a(di.a.a().a(ay.a.a().a($$4, cxp.b.get().keySet())), cv.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$15 = ah.a.a()
         .a($$6)
         .a(md.g.b(cyc.rv).a(), cc.a.a(cv.a.a().a($$3, cyc.rv)))
         .a(
            cyc.rv,
            wv.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wv.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ai $$16 = a($$2, $$3, ah.a.a())
         .a($$15)
         .a(
            cyc.vO,
            wv.c("advancements.husbandry.leash_all_frog_variants.title"),
            wv.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ah.a.a()
         .a($$16)
         .a(cyc.yv, wv.c("advancements.husbandry.froglights.title"), wv.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(cyc.yu, cyc.yw, cyc.yv))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$6)
         .a("silk_touch_nest", ax.a.a(dkw.pI, cv.a.a().a(cx.b, cq.a(List.of(new bs($$5.b(dem.v), dk.d.b(1))))), dk.d.a(3)))
         .a(
            dkw.pI,
            wv.c("advancements.husbandry.silk_touch_nest.title"),
            wv.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ah.a.a()
         .a($$6)
         .a(
            cyc.oz,
            wv.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wv.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ee.a.a(bx.a.a().a(bx.a.a().a($$2, axd.I).b(bx.a.a().a($$2, bwb.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$6)
         .a(
            cyc.sh,
            wv.c("advancements.husbandry.make_a_sign_glow.title"),
            wv.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cz.a.a(di.a.a().a(ay.a.a().a($$4, awz.aE)), cv.a.a().a($$3, cyc.sh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$17 = ah.a.a()
         .a($$6)
         .a(
            cyc.sT,
            wv.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wv.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dp.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, bwb.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$17)
         .a(
            cyc.mE,
            wv.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wv.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cz.a.b(di.a.a().a(ay.a.a().a($$4, dkw.bf)), cv.a.a().a($$3, cyc.sC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$18 = ah.a.a()
         .a($$6)
         .a(
            cyc.kP,
            wv.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wv.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(cyc.kP))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(cyc.wm, wv.c("advancements.husbandry.feed_snifflet.title"), wv.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", dr.a.a(cv.a.a().a($$3, axi.aa), Optional.of(bx.a(bx.a.a().a($$2, bwb.bi).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$19)
         .a(
            cyc.wn,
            wv.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wv.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cz.a.a(dkw.lc))
         .a("pitcher_pod", cz.a.a(dkw.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$9)
         .a(
            cyc.sW,
            wv.c("advancements.husbandry.remove_wolf_armor.title"),
            wv.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dr.a.a(cv.a.a().a($$3, cyc.sW), Optional.of(bx.a(bx.a.a().a($$2, bwb.bL)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$9)
         .a(
            cyc.pa,
            wv.c("advancements.husbandry.repair_wolf_armor.title"),
            wv.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dr.a.a(cv.a.a().a($$3, cyc.oZ), Optional.of(bx.a(bx.a.a().a($$2, bwb.bL).a(bu.a.a().e(cv.a.a().a($$3, cyc.pa).a(kv.a(kx.e, 0)))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jt<bwb<?>> $$2, Stream<bwb<?>> $$3, Stream<bwb<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cyc.vn,
            wv.c("advancements.husbandry.breed_all_animals.title"),
            wv.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ah.a a(jt<bwb<?>> $$0, jt<cxu> $$1, ah.a $$2) {
      md.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dr.a.a(cv.a.a().a($$1, cyc.vO), Optional.of(bx.a(bx.a.a().a($$0, bwb.ab).a(kv.a(kx.aE, $$3)))))));
      return $$2;
   }

   private static ah.a a(ah.a $$0, jt<cxu> $$1) {
      for (cxu $$2 : f) {
         $$0.a(md.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<bwb<?>> $$1, jt<bwb<?>> $$2, Stream<bwb<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bwb.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bwb.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, jt<cxu> $$1) {
      for (cxu $$2 : e) {
         $$0.a(md.g.b($$2).a(), cc.a.a(cv.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, jt<cxu> $$1) {
      for (cxu $$2 : d) {
         $$0.a(md.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cv.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0) {
      md.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ei.a.a(bx.a.a().a(kv.a(kx.aJ, $$1)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, ju.a $$1) {
      ju.b<cjn> $$2 = $$1.e(me.m);
      $$2.c_().sorted(Comparator.comparing(alc::a)).forEach($$2x -> {
         js<cjn> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ei.a.a(bx.a.a().a(kv.a(kx.at, $$3))));
      });
      return $$0;
   }
}
