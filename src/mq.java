import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mq implements mm {
   public static final List<buq<?>> a = List.of(
      buq.al,
      buq.I,
      buq.aF,
      buq.ba,
      buq.C,
      buq.aE,
      buq.aQ,
      buq.z,
      buq.bL,
      buq.aI,
      buq.aX,
      buq.ax,
      buq.u,
      buq.aN,
      buq.aa,
      buq.l,
      buq.aj,
      buq.bs,
      buq.ah,
      buq.h,
      buq.t,
      buq.e
   );
   public static final List<buq<?>> b = List.of(buq.bA, buq.ab, buq.bi);
   private static final cwj[] d = new cwj[]{cwr.rW, cwr.rY, cwr.rZ, cwr.rX};
   private static final cwj[] e = new cwj[]{cwr.ro, cwr.rp, cwr.rm, cwr.rn};
   private static final cwj[] f = new cwj[]{
      cwr.oZ,
      cwr.pW,
      cwr.qc,
      cwr.qC,
      cwr.qD,
      cwr.qF,
      cwr.qG,
      cwr.rW,
      cwr.rX,
      cwr.rY,
      cwr.rZ,
      cwr.sa,
      cwr.sb,
      cwr.sP,
      cwr.sT,
      cwr.sX,
      cwr.sY,
      cwr.sZ,
      cwr.ta,
      cwr.tb,
      cwr.tj,
      cwr.ve,
      cwr.vf,
      cwr.vg,
      cwr.vh,
      cwr.vj,
      cwr.vs,
      cwr.vA,
      cwr.vB,
      cwr.vC,
      cwr.vN,
      cwr.vO,
      cwr.wg,
      cwr.wk,
      cwr.wm,
      cwr.sU,
      cwr.wW,
      cwr.xv,
      cwr.xD,
      cwr.xw
   };
   public static final cwj[] c = new cwj[]{cwr.pu, cwr.pE, cwr.pz, cwr.pJ, cwr.pO, cwr.pT};

   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<buq<?>> $$2 = $$0.d(mc.z);
      js<cwj> $$3 = $$0.d(mc.K);
      js<djk> $$4 = $$0.d(mc.f);
      jt.b<dcx> $$5 = $$0.d(mc.aO);
      ai $$6 = ah.a.a()
         .a(
            djm.iH,
            wo.c("advancements.husbandry.root.title"),
            wo.c("advancements.husbandry.root.description"),
            aku.b("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", bh.a.b())
         .a($$1, "husbandry/root");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cwr.qb, wo.c("advancements.husbandry.plant_seed.title"), wo.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cz.a.a(djm.cJ))
         .a("pumpkin_stem", cz.a.a(djm.fr))
         .a("melon_stem", cz.a.a(djm.fs))
         .a("beetroots", cz.a.a(djm.lf))
         .a("nether_wart", cz.a.a(djm.fL))
         .a("torchflower", cz.a.a(djm.lc))
         .a("pitcher_pod", cz.a.a(djm.ld))
         .a($$1, "husbandry/plant_seed");
      ai $$8 = ah.a.a()
         .a($$6)
         .a(
            cwr.qb,
            wo.c("advancements.husbandry.breed_an_animal.title"),
            wo.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cwr.oZ, wo.c("advancements.husbandry.balanced_diet.title"), wo.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$7)
         .a(cwr.pU, wo.c("advancements.husbandry.netherite_hoe.title"), wo.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(cwr.pU))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(
            cwr.vK,
            wo.c("advancements.husbandry.tame_an_animal.title"),
            wo.c("advancements.husbandry.tame_an_animal.description"),
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
            cwr.rS,
            wo.c("advancements.husbandry.fishy_business.title"),
            wo.c("advancements.husbandry.fishy_business.description"),
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
            cwr.rm,
            wo.c("advancements.husbandry.tactical_fishing.title"),
            wo.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(mb.g.b(cwr.rq).a(), cc.a.a(cv.a.a().a($$3, cwr.rq)))
         .a(
            cwr.rq,
            wo.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wo.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ah.a.a()
         .a($$12)
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, buq.h)))
         .a(
            cwr.rp,
            wo.c("advancements.husbandry.kill_axolotl_target.title"),
            wo.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cwr.rW,
            wo.c("advancements.husbandry.complete_catalogue.title"),
            wo.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cwr.sw, wo.c("advancements.husbandry.whole_pack.title"), wo.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$13 = ah.a.a()
         .a($$6)
         .a("safely_harvest_honey", cz.a.a(di.a.a().a(ay.a.a().a($$4, awo.aJ)).a(true), cv.a.a().a($$3, cwr.th)))
         .a(
            cwr.xD,
            wo.c("advancements.husbandry.safely_harvest_honey.title"),
            wo.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ai $$14 = ah.a.a()
         .a($$13)
         .a(cwr.xA, wo.c("advancements.husbandry.wax_on.title"), wo.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwe.a.get().keySet())), cv.a.a().a($$3, cwr.xA)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$14)
         .a(cwr.pz, wo.c("advancements.husbandry.wax_off.title"), wo.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwe.b.get().keySet())), cv.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$15 = ah.a.a()
         .a($$6)
         .a(mb.g.b(cwr.rr).a(), cc.a.a(cv.a.a().a($$3, cwr.rr)))
         .a(
            cwr.rr,
            wo.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wo.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cwr.vK,
            wo.c("advancements.husbandry.leash_all_frog_variants.title"),
            wo.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ah.a.a()
         .a($$16)
         .a(cwr.yr, wo.c("advancements.husbandry.froglights.title"), wo.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(cwr.yq, cwr.ys, cwr.yr))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$6)
         .a("silk_touch_nest", ax.a.a(djm.pG, cv.a.a().a(cx.b, cq.a(List.of(new bs($$5.b(ddc.v), dk.d.b(1))))), dk.d.a(3)))
         .a(
            djm.pG,
            wo.c("advancements.husbandry.silk_touch_nest.title"),
            wo.c("advancements.husbandry.silk_touch_nest.description"),
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
            cwr.ox,
            wo.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wo.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ee.a.a(bx.a.a().a(bx.a.a().a($$2, aws.I).b(bx.a.a().a($$2, buq.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$6)
         .a(
            cwr.sd,
            wo.c("advancements.husbandry.make_a_sign_glow.title"),
            wo.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cz.a.a(di.a.a().a(ay.a.a().a($$4, awo.aE)), cv.a.a().a($$3, cwr.sd)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$17 = ah.a.a()
         .a($$6)
         .a(
            cwr.sP,
            wo.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wo.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dp.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, buq.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$17)
         .a(
            cwr.mC,
            wo.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wo.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cz.a.b(di.a.a().a(ay.a.a().a($$4, djm.bf)), cv.a.a().a($$3, cwr.sy)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$18 = ah.a.a()
         .a($$6)
         .a(
            cwr.kN,
            wo.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wo.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(cwr.kN))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(cwr.wi, wo.c("advancements.husbandry.feed_snifflet.title"), wo.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", dr.a.a(cv.a.a().a($$3, awx.aa), Optional.of(bx.a(bx.a.a().a($$2, buq.bi).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$19)
         .a(
            cwr.wj,
            wo.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wo.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cz.a.a(djm.lc))
         .a("pitcher_pod", cz.a.a(djm.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$9)
         .a(
            cwr.sS,
            wo.c("advancements.husbandry.remove_wolf_armor.title"),
            wo.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dr.a.a(cv.a.a().a($$3, cwr.sS), Optional.of(bx.a(bx.a.a().a($$2, buq.bL)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$9)
         .a(
            cwr.oW,
            wo.c("advancements.husbandry.repair_wolf_armor.title"),
            wo.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dr.a.a(cv.a.a().a($$3, cwr.oV), Optional.of(bx.a(bx.a.a().a($$2, buq.bL).a(bu.a.a().e(cv.a.a().a($$3, cwr.oW).a(kt.a().a(kv.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, js<buq<?>> $$2, Stream<buq<?>> $$3, Stream<buq<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwr.vj,
            wo.c("advancements.husbandry.breed_all_animals.title"),
            wo.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ah.a a(js<buq<?>> $$0, js<cwj> $$1, ah.a $$2) {
      mb.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dr.a.a(cv.a.a().a($$1, cwr.vK), Optional.of(bx.a(bx.a.a().a($$0, buq.ab).a(bz.b($$3)))))));
      return $$2;
   }

   private static ah.a a(ah.a $$0, js<cwj> $$1) {
      for (cwj $$2 : f) {
         $$0.a(mb.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<buq<?>> $$1, js<buq<?>> $$2, Stream<buq<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(buq.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(buq.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, js<cwj> $$1) {
      for (cwj $$2 : e) {
         $$0.a(mb.g.b($$2).a(), cc.a.a(cv.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, js<cwj> $$1) {
      for (cwj $$2 : d) {
         $$0.a(mb.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cv.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0) {
      mb.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ei.a.a(bx.a.a().a(bz.a($$1)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jt.a $$1) {
      jt.b<cia> $$2 = $$1.d(mc.m);
      $$2.c_().sorted(Comparator.comparing(akt::a)).forEach($$2x -> {
         jr<cia> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ei.a.a(bx.a.a().a(bz.a(jv.a($$3)))));
      });
      return $$0;
   }
}
