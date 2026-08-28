import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mq implements mm {
   public static final List<bur<?>> a = List.of(
      bur.am,
      bur.J,
      bur.aG,
      bur.bb,
      bur.C,
      bur.aF,
      bur.aR,
      bur.z,
      bur.bM,
      bur.aJ,
      bur.aY,
      bur.ay,
      bur.u,
      bur.aO,
      bur.ab,
      bur.l,
      bur.ak,
      bur.bt,
      bur.ai,
      bur.h,
      bur.t,
      bur.e
   );
   public static final List<bur<?>> b = List.of(bur.bB, bur.ac, bur.bj);
   private static final cwl[] d = new cwl[]{cwt.rW, cwt.rY, cwt.rZ, cwt.rX};
   private static final cwl[] e = new cwl[]{cwt.ro, cwt.rp, cwt.rm, cwt.rn};
   private static final cwl[] f = new cwl[]{
      cwt.oZ,
      cwt.pW,
      cwt.qc,
      cwt.qC,
      cwt.qD,
      cwt.qF,
      cwt.qG,
      cwt.rW,
      cwt.rX,
      cwt.rY,
      cwt.rZ,
      cwt.sa,
      cwt.sb,
      cwt.sP,
      cwt.sT,
      cwt.sX,
      cwt.sY,
      cwt.sZ,
      cwt.ta,
      cwt.tb,
      cwt.tj,
      cwt.ve,
      cwt.vf,
      cwt.vg,
      cwt.vh,
      cwt.vj,
      cwt.vs,
      cwt.vA,
      cwt.vB,
      cwt.vC,
      cwt.vN,
      cwt.vO,
      cwt.wg,
      cwt.wk,
      cwt.wm,
      cwt.sU,
      cwt.wW,
      cwt.xv,
      cwt.xD,
      cwt.xw
   };
   public static final cwl[] c = new cwl[]{cwt.pu, cwt.pE, cwt.pz, cwt.pJ, cwt.pO, cwt.pT};

   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<bur<?>> $$2 = $$0.d(mc.z);
      js<cwl> $$3 = $$0.d(mc.K);
      js<djm> $$4 = $$0.d(mc.f);
      jt.b<dcz> $$5 = $$0.d(mc.aO);
      ai $$6 = ah.a.a()
         .a(
            djo.iH,
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
         .a(cwt.qb, wo.c("advancements.husbandry.plant_seed.title"), wo.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cz.a.a(djo.cJ))
         .a("pumpkin_stem", cz.a.a(djo.fr))
         .a("melon_stem", cz.a.a(djo.fs))
         .a("beetroots", cz.a.a(djo.lf))
         .a("nether_wart", cz.a.a(djo.fL))
         .a("torchflower", cz.a.a(djo.lc))
         .a("pitcher_pod", cz.a.a(djo.ld))
         .a($$1, "husbandry/plant_seed");
      ai $$8 = ah.a.a()
         .a($$6)
         .a(
            cwt.qb,
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
         .a(cwt.oZ, wo.c("advancements.husbandry.balanced_diet.title"), wo.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$7)
         .a(cwt.pU, wo.c("advancements.husbandry.netherite_hoe.title"), wo.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(cwt.pU))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(
            cwt.vK,
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
            cwt.rS,
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
            cwt.rm,
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
         .a(mb.g.b(cwt.rq).a(), cc.a.a(cv.a.a().a($$3, cwt.rq)))
         .a(
            cwt.rq,
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
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, bur.h)))
         .a(
            cwt.rp,
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
            cwt.rW,
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
         .a(cwt.sw, wo.c("advancements.husbandry.whole_pack.title"), wo.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$13 = ah.a.a()
         .a($$6)
         .a("safely_harvest_honey", cz.a.a(di.a.a().a(ay.a.a().a($$4, awp.aJ)).a(true), cv.a.a().a($$3, cwt.th)))
         .a(
            cwt.xD,
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
         .a(cwt.xA, wo.c("advancements.husbandry.wax_on.title"), wo.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwg.a.get().keySet())), cv.a.a().a($$3, cwt.xA)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$14)
         .a(cwt.pz, wo.c("advancements.husbandry.wax_off.title"), wo.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cz.a.a(di.a.a().a(ay.a.a().a($$4, cwg.b.get().keySet())), cv.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$15 = ah.a.a()
         .a($$6)
         .a(mb.g.b(cwt.rr).a(), cc.a.a(cv.a.a().a($$3, cwt.rr)))
         .a(
            cwt.rr,
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
            cwt.vK,
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
         .a(cwt.yr, wo.c("advancements.husbandry.froglights.title"), wo.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(cwt.yq, cwt.ys, cwt.yr))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$6)
         .a("silk_touch_nest", ax.a.a(djo.pG, cv.a.a().a(cx.b, cq.a(List.of(new bs($$5.b(dde.v), dk.d.b(1))))), dk.d.a(3)))
         .a(
            djo.pG,
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
            cwt.ox,
            wo.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wo.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ee.a.a(bx.a.a().a(bx.a.a().a($$2, awt.I).b(bx.a.a().a($$2, bur.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$6)
         .a(
            cwt.sd,
            wo.c("advancements.husbandry.make_a_sign_glow.title"),
            wo.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cz.a.a(di.a.a().a(ay.a.a().a($$4, awp.aE)), cv.a.a().a($$3, cwt.sd)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$17 = ah.a.a()
         .a($$6)
         .a(
            cwt.sP,
            wo.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wo.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dp.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, bur.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$17)
         .a(
            cwt.mC,
            wo.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wo.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cz.a.b(di.a.a().a(ay.a.a().a($$4, djo.bf)), cv.a.a().a($$3, cwt.sy)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$18 = ah.a.a()
         .a($$6)
         .a(
            cwt.kN,
            wo.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wo.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(cwt.kN))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(cwt.wi, wo.c("advancements.husbandry.feed_snifflet.title"), wo.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", dr.a.a(cv.a.a().a($$3, awy.aa), Optional.of(bx.a(bx.a.a().a($$2, bur.bj).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$19)
         .a(
            cwt.wj,
            wo.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wo.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cz.a.a(djo.lc))
         .a("pitcher_pod", cz.a.a(djo.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$9)
         .a(
            cwt.sS,
            wo.c("advancements.husbandry.remove_wolf_armor.title"),
            wo.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dr.a.a(cv.a.a().a($$3, cwt.sS), Optional.of(bx.a(bx.a.a().a($$2, bur.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$9)
         .a(
            cwt.oW,
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
            dr.a.a(cv.a.a().a($$3, cwt.oV), Optional.of(bx.a(bx.a.a().a($$2, bur.bM).a(bu.a.a().e(cv.a.a().a($$3, cwt.oW).a(kt.a().a(kv.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, js<bur<?>> $$2, Stream<bur<?>> $$3, Stream<bur<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwt.vj,
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

   private static ah.a a(js<bur<?>> $$0, js<cwl> $$1, ah.a $$2) {
      mb.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dr.a.a(cv.a.a().a($$1, cwt.vK), Optional.of(bx.a(bx.a.a().a($$0, bur.ac).a(bz.b($$3)))))));
      return $$2;
   }

   private static ah.a a(ah.a $$0, js<cwl> $$1) {
      for (cwl $$2 : f) {
         $$0.a(mb.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<bur<?>> $$1, js<bur<?>> $$2, Stream<bur<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bur.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bur.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, js<cwl> $$1) {
      for (cwl $$2 : e) {
         $$0.a(mb.g.b($$2).a(), cc.a.a(cv.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, js<cwl> $$1) {
      for (cwl $$2 : d) {
         $$0.a(mb.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cv.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0) {
      mb.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ei.a.a(bx.a.a().a(bz.a($$1)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jt.a $$1) {
      jt.b<cib> $$2 = $$1.d(mc.m);
      $$2.c_().sorted(Comparator.comparing(akt::a)).forEach($$2x -> {
         jr<cib> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ei.a.a(bx.a.a().a(bz.a(jv.a($$3)))));
      });
      return $$0;
   }
}
