import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lk implements le {
   public static final List<bqg<?>> a = List.of(
      bqg.ab,
      bqg.z,
      bqg.as,
      bqg.aI,
      bqg.w,
      bqg.ar,
      bqg.ay,
      bqg.t,
      bqg.br,
      bqg.at,
      bqg.aF,
      bqg.am,
      bqg.p,
      bqg.av,
      bqg.Q,
      bqg.h,
      bqg.Z,
      bqg.aY,
      bqg.X,
      bqg.f,
      bqg.o,
      bqg.c
   );
   public static final List<bqg<?>> b = List.of(bqg.bg, bqg.R, bqg.aQ);
   private static final crn[] c = new crn[]{crv.qY, crv.ra, crv.rb, crv.qZ};
   private static final crn[] d = new crn[]{crv.qG, crv.qH, crv.qE, crv.qF};
   private static final crn[] e = new crn[]{
      crv.os,
      crv.pq,
      crv.pw,
      crv.pW,
      crv.pX,
      crv.pZ,
      crv.qa,
      crv.qY,
      crv.qZ,
      crv.ra,
      crv.rb,
      crv.rc,
      crv.rd,
      crv.rR,
      crv.rV,
      crv.rZ,
      crv.sa,
      crv.sb,
      crv.sc,
      crv.sd,
      crv.sl,
      crv.ud,
      crv.ue,
      crv.uf,
      crv.ug,
      crv.ui,
      crv.ur,
      crv.uy,
      crv.uz,
      crv.uA,
      crv.uL,
      crv.uM,
      crv.ve,
      crv.vi,
      crv.vk,
      crv.rW,
      crv.vS,
      crv.wn,
      crv.wv,
      crv.wo
   };
   private static final crn[] f = new crn[]{crv.oN, crv.oX, crv.oS, crv.pc, crv.ph, crv.pm};

   @Override
   public void a(ip.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcj.ij,
            wi.c("advancements.husbandry.root.title"),
            wi.c("advancements.husbandry.root.description"),
            new ajv("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crv.pv, wi.c("advancements.husbandry.plant_seed.title"), wi.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(dcj.cB))
         .a("pumpkin_stem", cd.a.a(dcj.fd))
         .a("melon_stem", cd.a.a(dcj.fe))
         .a("beetroots", cd.a.a(dcj.kD))
         .a("nether_wart", cd.a.a(dcj.fq))
         .a("torchflower", cd.a.a(dcj.kA))
         .a("pitcher_pod", cd.a.a(dcj.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            crv.pv,
            wi.c("advancements.husbandry.breed_an_animal.title"),
            wi.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(crv.os, wi.c("advancements.husbandry.balanced_diet.title"), wi.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(crv.pn, wi.c("advancements.husbandry.netherite_hoe.title"), wi.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(crv.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            crv.uI,
            wi.c("advancements.husbandry.tame_an_animal.title"),
            wi.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", df.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            crv.qU,
            wi.c("advancements.husbandry.fishy_business.title"),
            wi.c("advancements.husbandry.fishy_business.description"),
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
            crv.qE,
            wi.c("advancements.husbandry.tactical_fishing.title"),
            wi.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kt.h.b(crv.qI).a(), bv.a.a(cc.a.a().a(crv.qI)))
         .a(
            crv.qI,
            wi.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wi.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bqg.f)))
         .a(
            crv.qH,
            wi.c("advancements.husbandry.kill_axolotl_target.title"),
            wi.c("advancements.husbandry.kill_axolotl_target.description"),
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
            crv.qY,
            wi.c("advancements.husbandry.complete_catalogue.title"),
            wi.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(ave.aG)).a(true), cc.a.a().a(crv.sk)))
         .a(
            crv.wv,
            wi.c("advancements.husbandry.safely_harvest_honey.title"),
            wi.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(crv.ws, wi.c("advancements.husbandry.wax_on.title"), wi.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cri.a.get().keySet())), cc.a.a().a(crv.ws)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(crv.oS, wi.c("advancements.husbandry.wax_off.title"), wi.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cri.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kt.h.b(crv.qJ).a(), bv.a.a(cc.a.a().a(crv.qJ)))
         .a(
            crv.qJ,
            wi.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wi.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            crv.uI,
            wi.c("advancements.husbandry.leash_all_frog_variants.title"),
            wi.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(crv.xj, wi.c("advancements.husbandry.froglights.title"), wi.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(crv.xi, crv.xk, crv.xj))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dcj.pe, cc.a.a().a(new bm(cxc.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            dcj.pe,
            wi.c("advancements.husbandry.silk_touch_nest.title"),
            wi.c("advancements.husbandry.silk_touch_nest.description"),
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
            crv.nT,
            wi.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wi.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", db.a.a(br.a.a().a(br.a.a().a(bqg.k).b(br.a.a().a(bqg.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            crv.rf,
            wi.c("advancements.husbandry.make_a_sign_glow.title"),
            wi.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(ave.aB)), cc.a.a().a(crv.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            crv.rR,
            wi.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wi.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bqg.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            crv.me,
            wi.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wi.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(dcj.aY)), cc.a.a().a(crv.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            crv.kp,
            wi.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wi.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(crv.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(crv.vg, wi.c("advancements.husbandry.feed_snifflet.title"), wi.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(avm.aP), Optional.of(br.a(br.a.a().a(bqg.aQ).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            crv.vh,
            wi.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wi.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(dcj.kA))
         .a("pitcher_pod", cd.a.a(dcj.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bqg<?>> $$2, Stream<bqg<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            crv.ui,
            wi.c("advancements.husbandry.breed_all_animals.title"),
            wi.c("advancements.husbandry.breed_all_animals.description"),
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
      kt.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(crv.uI), Optional.of(br.a(br.a.a().a(bqg.R).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (crn $$1 : e) {
         $$0.a(kt.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bqg<?>> $$1, Stream<bqg<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bqg.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bqg.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (crn $$1 : d) {
         $$0.a(kt.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (crn $$1 : c) {
         $$0.a(kt.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cc.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kt.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aju::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), df.a.a(br.a.a().a(bs.a($$1.getValue())))));
      return $$0;
   }
}
