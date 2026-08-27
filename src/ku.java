import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ku implements ko {
   public static final List<bmc<?>> a = List.of(
      bmc.aa,
      bmc.y,
      bmc.ar,
      bmc.aH,
      bmc.v,
      bmc.aq,
      bmc.ax,
      bmc.s,
      bmc.bq,
      bmc.as,
      bmc.aE,
      bmc.al,
      bmc.o,
      bmc.au,
      bmc.P,
      bmc.i,
      bmc.Y,
      bmc.aX,
      bmc.W,
      bmc.g,
      bmc.n,
      bmc.d
   );
   public static final List<bmc<?>> b = List.of(bmc.bf, bmc.Q, bmc.aP);
   private static final cnb[] c = new cnb[]{cnj.qY, cnj.ra, cnj.rb, cnj.qZ};
   private static final cnb[] d = new cnb[]{cnj.qG, cnj.qH, cnj.qE, cnj.qF};
   private static final cnb[] e = new cnb[]{
      cnj.os,
      cnj.pq,
      cnj.pw,
      cnj.pW,
      cnj.pX,
      cnj.pZ,
      cnj.qa,
      cnj.qY,
      cnj.qZ,
      cnj.ra,
      cnj.rb,
      cnj.rc,
      cnj.rd,
      cnj.rR,
      cnj.rV,
      cnj.rZ,
      cnj.sa,
      cnj.sb,
      cnj.sc,
      cnj.sd,
      cnj.sl,
      cnj.ub,
      cnj.uc,
      cnj.ud,
      cnj.ue,
      cnj.ug,
      cnj.up,
      cnj.uw,
      cnj.ux,
      cnj.uy,
      cnj.uJ,
      cnj.uK,
      cnj.vc,
      cnj.vg,
      cnj.vi,
      cnj.rW,
      cnj.vQ,
      cnj.wl,
      cnj.wt,
      cnj.wm
   };
   private static final cnb[] f = new cnb[]{cnj.oN, cnj.oX, cnj.oS, cnj.pc, cnj.ph, cnj.pm};

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cxa.ij,
            vg.c("advancements.husbandry.root.title"),
            vg.c("advancements.husbandry.root.description"),
            new ahh("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", ba.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnj.pv, vg.c("advancements.husbandry.plant_seed.title"), vg.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cb.a.a(cxa.cB))
         .a("pumpkin_stem", cb.a.a(cxa.fd))
         .a("melon_stem", cb.a.a(cxa.fe))
         .a("beetroots", cb.a.a(cxa.kD))
         .a("nether_wart", cb.a.a(cxa.fq))
         .a("torchflower", cb.a.a(cxa.kA))
         .a("pitcher_pod", cb.a.a(cxa.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cnj.pv,
            vg.c("advancements.husbandry.breed_an_animal.title"),
            vg.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", av.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(cnj.os, vg.c("advancements.husbandry.balanced_diet.title"), vg.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cnj.pn, vg.c("advancements.husbandry.netherite_hoe.title"), vg.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", by.a.a(cnj.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cnj.uG,
            vg.c("advancements.husbandry.tame_an_animal.title"),
            vg.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dc.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            cnj.qU,
            vg.c("advancements.husbandry.fishy_business.title"),
            vg.c("advancements.husbandry.fishy_business.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      af $$7 = c(ae.a.a())
         .a($$6)
         .a(ai.a.b)
         .a(
            cnj.qE,
            vg.c("advancements.husbandry.tactical_fishing.title"),
            vg.c("advancements.husbandry.tactical_fishing.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      af $$8 = ae.a.a()
         .a($$7)
         .a(ai.a.b)
         .a(kd.h.b(cnj.qI).a(), bt.a.a(ca.a.a().a(cnj.qI)))
         .a(
            cnj.qI,
            vg.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vg.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bi.a.a(bp.a.a().a(bmc.g)))
         .a(
            cnj.qH,
            vg.c("advancements.husbandry.kill_axolotl_target.title"),
            vg.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$5)
         .a(
            cnj.qY,
            vg.c("advancements.husbandry.complete_catalogue.title"),
            vg.c("advancements.husbandry.complete_catalogue.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", cb.a.a(ci.a.a().a(au.a.a().a(asi.aF)).a(true), ca.a.a().a(cnj.sk)))
         .a(
            cnj.wt,
            vg.c("advancements.husbandry.safely_harvest_honey.title"),
            vg.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cnj.wq, vg.c("advancements.husbandry.wax_on.title"), vg.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cb.a.a(ci.a.a().a(au.a.a().a(cmw.a.get().keySet())), ca.a.a().a(cnj.wq)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cnj.oS, vg.c("advancements.husbandry.wax_off.title"), vg.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cb.a.a(ci.a.a().a(au.a.a().a(cmw.b.get().keySet())), ca.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kd.h.b(cnj.qJ).a(), bt.a.a(ca.a.a().a(cnj.qJ)))
         .a(
            cnj.qJ,
            vg.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vg.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      af $$12 = a(ae.a.a())
         .a($$11)
         .a(
            cnj.uG,
            vg.c("advancements.husbandry.leash_all_frog_variants.title"),
            vg.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cnj.xh, vg.c("advancements.husbandry.froglights.title"), vg.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", by.a.a(cnj.xg, cnj.xi, cnj.xh))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", at.a.a(cxa.pe, ca.a.a().a(new bk(crv.v, ck.d.b(1))), ck.d.a(3)))
         .a(
            cxa.pe,
            vg.c("advancements.husbandry.silk_touch_nest.title"),
            vg.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$2)
         .a(
            cnj.nT,
            vg.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vg.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bp.a.a().a(bp.a.a().a(bmc.l).b(bp.a.a().a(bmc.W)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cnj.rf,
            vg.c("advancements.husbandry.make_a_sign_glow.title"),
            vg.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cb.a.a(ci.a.a().a(au.a.a().a(asi.aA)), ca.a.a().a(cnj.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cnj.rR,
            vg.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vg.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cn.a.a(Optional.empty(), Optional.empty(), Optional.of(bp.a(bp.a.a().a(bmc.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cnj.me,
            vg.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vg.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cb.a.b(ci.a.a().a(au.a.a().a(cxa.aY)), ca.a.a().a(cnj.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cnj.kp,
            vg.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vg.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", by.a.a(cnj.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cnj.ve, vg.c("advancements.husbandry.feed_snifflet.title"), vg.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cp.a.a(ca.a.a().a(asq.aK), Optional.of(bp.a(bp.a.a().a(bmc.aP).a(bn.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cnj.vf,
            vg.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vg.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cb.a.a(cxa.kA))
         .a("pitcher_pod", cb.a.a(cxa.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bmc<?>> $$2, Stream<bmc<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cnj.ug,
            vg.c("advancements.husbandry.breed_all_animals.title"),
            vg.c("advancements.husbandry.breed_all_animals.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ae.a a(ae.a $$0) {
      kd.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cp.a.a(ca.a.a().a(cnj.uG), Optional.of(bp.a(bp.a.a().a(bmc.Q).a(bq.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cnb $$1 : e) {
         $$0.a(kd.h.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bmc<?>> $$1, Stream<bmc<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bmc.a($$1x).toString(), av.a.a(bp.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bmc.a($$1x).toString(), av.a.a(Optional.of(bp.a.a().a($$1x).b()), Optional.of(bp.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cnb $$1 : d) {
         $$0.a(kd.h.b($$1).a(), bt.a.a(ca.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cnb $$1 : c) {
         $$0.a(kd.h.b($$1).a(), bv.a.a(Optional.empty(), Optional.empty(), Optional.of(ca.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kd.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ahg::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bp.a.a().a(bq.a($$1.getValue())))));
      return $$0;
   }
}
