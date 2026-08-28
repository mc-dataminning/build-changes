import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mq implements mm {
   public static final List<but<?>> a = List.of(
      but.al,
      but.I,
      but.aF,
      but.ba,
      but.C,
      but.aE,
      but.aQ,
      but.z,
      but.bL,
      but.aI,
      but.aX,
      but.ax,
      but.u,
      but.aN,
      but.aa,
      but.l,
      but.aj,
      but.bs,
      but.ah,
      but.h,
      but.t,
      but.e
   );
   public static final List<but<?>> b = List.of(but.bA, but.ab, but.bi);
   private static final cwm[] d = new cwm[]{cwu.rW, cwu.rY, cwu.rZ, cwu.rX};
   private static final cwm[] e = new cwm[]{cwu.ro, cwu.rp, cwu.rm, cwu.rn};
   private static final cwm[] f = new cwm[]{
      cwu.oZ,
      cwu.pW,
      cwu.qc,
      cwu.qC,
      cwu.qD,
      cwu.qF,
      cwu.qG,
      cwu.rW,
      cwu.rX,
      cwu.rY,
      cwu.rZ,
      cwu.sa,
      cwu.sb,
      cwu.sP,
      cwu.sT,
      cwu.sX,
      cwu.sY,
      cwu.sZ,
      cwu.ta,
      cwu.tb,
      cwu.tj,
      cwu.ve,
      cwu.vf,
      cwu.vg,
      cwu.vh,
      cwu.vj,
      cwu.vs,
      cwu.vA,
      cwu.vB,
      cwu.vC,
      cwu.vN,
      cwu.vO,
      cwu.wg,
      cwu.wk,
      cwu.wm,
      cwu.sU,
      cwu.wW,
      cwu.xv,
      cwu.xD,
      cwu.xw
   };
   public static final cwm[] c = new cwm[]{cwu.pu, cwu.pE, cwu.pz, cwu.pJ, cwu.pO, cwu.pT};

   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<but<?>> $$2 = $$0.d(mc.z);
      js<cwm> $$3 = $$0.d(mc.K);
      js<djn> $$4 = $$0.d(mc.f);
      jt.b<dda> $$5 = $$0.d(mc.aO);
      ai $$6 = ah.a.a()
         .a(
            djp.iH,
            wp.c("advancements.husbandry.root.title"),
            wp.c("advancements.husbandry.root.description"),
            akv.b("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", bh.a.b())
         .a($$1, "husbandry/root");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cwu.qb, wp.c("advancements.husbandry.plant_seed.title"), wp.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cz.a.a(djp.cJ))
         .a("pumpkin_stem", cz.a.a(djp.fr))
         .a("melon_stem", cz.a.a(djp.fs))
         .a("beetroots", cz.a.a(djp.lf))
         .a("nether_wart", cz.a.a(djp.fL))
         .a("torchflower", cz.a.a(djp.lc))
         .a("pitcher_pod", cz.a.a(djp.ld))
         .a($$1, "husbandry/plant_seed");
      ai $$8 = ah.a.a()
         .a($$6)
         .a(
            cwu.qb,
            wp.c("advancements.husbandry.breed_an_animal.title"),
            wp.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cwu.oZ, wp.c("advancements.husbandry.balanced_diet.title"), wp.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$7)
         .a(cwu.pU, wp.c("advancements.husbandry.netherite_hoe.title"), wp.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(cwu.pU))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(
            cwu.vK,
            wp.c("advancements.husbandry.tame_an_animal.title"),
            wp.c("advancements.husbandry.tame_an_animal.description"),
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
            cwu.rS,
            wp.c("advancements.husbandry.fishy_business.title"),
            wp.c("advancements.husbandry.fishy_business.description"),
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
            cwu.rm,
            wp.c("advancements.husbandry.tactical_fishing.title"),
            wp.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(mb.g.b(cwu.rq).a(), cc.a.a(cv.a.a().a($$3, cwu.rq)))
         .a(
            cwu.rq,
            wp.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wp.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ah.a.a()
         .a($$12)
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, but.h)))
         .a(
            cwu.rp,
            wp.c("advancements.husbandry.kill_axolotl_target.title"),
            wp.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cwu.rW,
            wp.c("advancements.husbandry.complete_catalogue.title"),
            wp.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cwu.sw, wp.c("advancements.husbandry.whole_pack.title"), wp.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$13 = ah.a.a()
         .a($$6)
         .a("safely_harvest_honey", cz.a.a(di.a.a().a(ay.a.a().a($$4, awp.aJ)).a(true), cv.a.a().a($$3, cwu.th)))
         .a(
            cwu.xD,
            wp.c("advancements.husbandry.safely_harvest_honey.title"),
            wp.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ai $$14 = ah.a.a()
         .a($$13)
         .a(cwu.xA, wp.c("advancements.husbandry.wax_on.title"), wp.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwh.a.get().keySet())), cv.a.a().a($$3, cwu.xA)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$14)
         .a(cwu.pz, wp.c("advancements.husbandry.wax_off.title"), wp.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwh.b.get().keySet())), cv.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$15 = ah.a.a()
         .a($$6)
         .a(mb.g.b(cwu.rr).a(), cc.a.a(cv.a.a().a($$3, cwu.rr)))
         .a(
            cwu.rr,
            wp.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wp.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cwu.vK,
            wp.c("advancements.husbandry.leash_all_frog_variants.title"),
            wp.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ah.a.a()
         .a($$16)
         .a(cwu.yr, wp.c("advancements.husbandry.froglights.title"), wp.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(cwu.yq, cwu.ys, cwu.yr))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$6)
         .a("silk_touch_nest", ax.a.a(djp.pG, cv.a.a().a(cx.b, cq.a(List.of(new bs($$5.b(ddf.v), dk.d.b(1))))), dk.d.a(3)))
         .a(
            djp.pG,
            wp.c("advancements.husbandry.silk_touch_nest.title"),
            wp.c("advancements.husbandry.silk_touch_nest.description"),
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
            cwu.ox,
            wp.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wp.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ee.a.a(bx.a.a().a(bx.a.a().a($$2, awt.I).b(bx.a.a().a($$2, but.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$6)
         .a(
            cwu.sd,
            wp.c("advancements.husbandry.make_a_sign_glow.title"),
            wp.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cz.a.a(di.a.a().a(ay.a.a().a($$4, awp.aE)), cv.a.a().a($$3, cwu.sd)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$17 = ah.a.a()
         .a($$6)
         .a(
            cwu.sP,
            wp.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wp.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dp.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, but.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$17)
         .a(
            cwu.mC,
            wp.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wp.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cz.a.b(di.a.a().a(ay.a.a().a($$4, djp.bf)), cv.a.a().a($$3, cwu.sy)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$18 = ah.a.a()
         .a($$6)
         .a(
            cwu.kN,
            wp.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wp.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(cwu.kN))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(cwu.wi, wp.c("advancements.husbandry.feed_snifflet.title"), wp.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", dr.a.a(cv.a.a().a($$3, awy.aa), Optional.of(bx.a(bx.a.a().a($$2, but.bi).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$19)
         .a(
            cwu.wj,
            wp.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wp.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cz.a.a(djp.lc))
         .a("pitcher_pod", cz.a.a(djp.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$9)
         .a(
            cwu.sS,
            wp.c("advancements.husbandry.remove_wolf_armor.title"),
            wp.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dr.a.a(cv.a.a().a($$3, cwu.sS), Optional.of(bx.a(bx.a.a().a($$2, but.bL)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$9)
         .a(
            cwu.oW,
            wp.c("advancements.husbandry.repair_wolf_armor.title"),
            wp.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dr.a.a(cv.a.a().a($$3, cwu.oV), Optional.of(bx.a(bx.a.a().a($$2, but.bL).a(bu.a.a().e(cv.a.a().a($$3, cwu.oW).a(kt.a().a(kv.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, js<but<?>> $$2, Stream<but<?>> $$3, Stream<but<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwu.vj,
            wp.c("advancements.husbandry.breed_all_animals.title"),
            wp.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ah.a a(js<but<?>> $$0, js<cwm> $$1, ah.a $$2) {
      mb.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dr.a.a(cv.a.a().a($$1, cwu.vK), Optional.of(bx.a(bx.a.a().a($$0, but.ab).a(bz.b($$3)))))));
      return $$2;
   }

   private static ah.a a(ah.a $$0, js<cwm> $$1) {
      for (cwm $$2 : f) {
         $$0.a(mb.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<but<?>> $$1, js<but<?>> $$2, Stream<but<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(but.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(but.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, js<cwm> $$1) {
      for (cwm $$2 : e) {
         $$0.a(mb.g.b($$2).a(), cc.a.a(cv.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, js<cwm> $$1) {
      for (cwm $$2 : d) {
         $$0.a(mb.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cv.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0) {
      mb.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ei.a.a(bx.a.a().a(bz.a($$1)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jt.a $$1) {
      jt.b<cid> $$2 = $$1.d(mc.m);
      $$2.c_().sorted(Comparator.comparing(aku::a)).forEach($$2x -> {
         jr<cid> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ei.a.a(bx.a.a().a(bz.a(jv.a($$3)))));
      });
      return $$0;
   }
}
