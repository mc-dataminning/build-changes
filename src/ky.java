import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ky implements ks {
   public static final List<bol<?>> a = List.of(
      bol.aa,
      bol.y,
      bol.ar,
      bol.aH,
      bol.v,
      bol.aq,
      bol.ax,
      bol.s,
      bol.bq,
      bol.as,
      bol.aE,
      bol.al,
      bol.o,
      bol.au,
      bol.P,
      bol.i,
      bol.Y,
      bol.aX,
      bol.W,
      bol.g,
      bol.n,
      bol.d
   );
   public static final List<bol<?>> b = List.of(bol.bf, bol.Q, bol.aP);
   private static final cpl[] c = new cpl[]{cpt.qY, cpt.ra, cpt.rb, cpt.qZ};
   private static final cpl[] d = new cpl[]{cpt.qG, cpt.qH, cpt.qE, cpt.qF};
   private static final cpl[] e = new cpl[]{
      cpt.os,
      cpt.pq,
      cpt.pw,
      cpt.pW,
      cpt.pX,
      cpt.pZ,
      cpt.qa,
      cpt.qY,
      cpt.qZ,
      cpt.ra,
      cpt.rb,
      cpt.rc,
      cpt.rd,
      cpt.rR,
      cpt.rV,
      cpt.rZ,
      cpt.sa,
      cpt.sb,
      cpt.sc,
      cpt.sd,
      cpt.sl,
      cpt.ub,
      cpt.uc,
      cpt.ud,
      cpt.ue,
      cpt.ug,
      cpt.up,
      cpt.uw,
      cpt.ux,
      cpt.uy,
      cpt.uJ,
      cpt.uK,
      cpt.vc,
      cpt.vg,
      cpt.vi,
      cpt.rW,
      cpt.vQ,
      cpt.wl,
      cpt.wt,
      cpt.wm
   };
   private static final cpl[] f = new cpl[]{cpt.oN, cpt.oX, cpt.oS, cpt.pc, cpt.ph, cpt.pm};

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            czh.ij,
            vs.c("advancements.husbandry.root.title"),
            vs.c("advancements.husbandry.root.description"),
            new ajc("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpt.pv, vs.c("advancements.husbandry.plant_seed.title"), vs.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(czh.cB))
         .a("pumpkin_stem", cd.a.a(czh.fd))
         .a("melon_stem", cd.a.a(czh.fe))
         .a("beetroots", cd.a.a(czh.kD))
         .a("nether_wart", cd.a.a(czh.fq))
         .a("torchflower", cd.a.a(czh.kA))
         .a("pitcher_pod", cd.a.a(czh.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cpt.pv,
            vs.c("advancements.husbandry.breed_an_animal.title"),
            vs.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", aw.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(cpt.os, vs.c("advancements.husbandry.balanced_diet.title"), vs.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cpt.pn, vs.c("advancements.husbandry.netherite_hoe.title"), vs.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(cpt.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cpt.uG,
            vs.c("advancements.husbandry.tame_an_animal.title"),
            vs.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", de.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            cpt.qU,
            vs.c("advancements.husbandry.fishy_business.title"),
            vs.c("advancements.husbandry.fishy_business.description"),
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
            cpt.qE,
            vs.c("advancements.husbandry.tactical_fishing.title"),
            vs.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kh.h.b(cpt.qI).a(), bv.a.a(cc.a.a().a(cpt.qI)))
         .a(
            cpt.qI,
            vs.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vs.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bol.g)))
         .a(
            cpt.qH,
            vs.c("advancements.husbandry.kill_axolotl_target.title"),
            vs.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cpt.qY,
            vs.c("advancements.husbandry.complete_catalogue.title"),
            vs.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(aue.aF)).a(true), cc.a.a().a(cpt.sk)))
         .a(
            cpt.wt,
            vs.c("advancements.husbandry.safely_harvest_honey.title"),
            vs.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cpt.wq, vs.c("advancements.husbandry.wax_on.title"), vs.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cpg.a.get().keySet())), cc.a.a().a(cpt.wq)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cpt.oS, vs.c("advancements.husbandry.wax_off.title"), vs.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cpg.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kh.h.b(cpt.qJ).a(), bv.a.a(cc.a.a().a(cpt.qJ)))
         .a(
            cpt.qJ,
            vs.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vs.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cpt.uG,
            vs.c("advancements.husbandry.leash_all_frog_variants.title"),
            vs.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cpt.xh, vs.c("advancements.husbandry.froglights.title"), vs.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(cpt.xg, cpt.xi, cpt.xh))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(czh.pe, cc.a.a().a(new bm(cuc.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            czh.pe,
            vs.c("advancements.husbandry.silk_touch_nest.title"),
            vs.c("advancements.husbandry.silk_touch_nest.description"),
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
            cpt.nT,
            vs.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vs.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bol.l).b(br.a.a().a(bol.W)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cpt.rf,
            vs.c("advancements.husbandry.make_a_sign_glow.title"),
            vs.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(aue.aA)), cc.a.a().a(cpt.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cpt.rR,
            vs.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vs.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bol.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cpt.me,
            vs.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vs.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(czh.aY)), cc.a.a().a(cpt.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cpt.kp,
            vs.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vs.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(cpt.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cpt.ve, vs.c("advancements.husbandry.feed_snifflet.title"), vs.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(aum.aP), Optional.of(br.a(br.a.a().a(bol.aP).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cpt.vf,
            vs.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vs.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(czh.kA))
         .a("pitcher_pod", cd.a.a(czh.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bol<?>> $$2, Stream<bol<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cpt.ug,
            vs.c("advancements.husbandry.breed_all_animals.title"),
            vs.c("advancements.husbandry.breed_all_animals.description"),
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
      kh.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(cpt.uG), Optional.of(br.a(br.a.a().a(bol.Q).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cpl $$1 : e) {
         $$0.a(kh.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bol<?>> $$1, Stream<bol<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bol.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bol.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cpl $$1 : d) {
         $$0.a(kh.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cpl $$1 : c) {
         $$0.a(kh.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cc.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kh.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ajb::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), de.a.a(br.a.a().a(bs.a($$1.getValue())))));
      return $$0;
   }
}
