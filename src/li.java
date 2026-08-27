import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class li implements lc {
   public static final List<bqb<?>> a = List.of(
      bqb.ab,
      bqb.z,
      bqb.as,
      bqb.aI,
      bqb.w,
      bqb.ar,
      bqb.ay,
      bqb.t,
      bqb.br,
      bqb.at,
      bqb.aF,
      bqb.am,
      bqb.p,
      bqb.av,
      bqb.Q,
      bqb.h,
      bqb.Z,
      bqb.aY,
      bqb.X,
      bqb.f,
      bqb.o,
      bqb.c
   );
   public static final List<bqb<?>> b = List.of(bqb.bg, bqb.R, bqb.aQ);
   private static final cre[] c = new cre[]{crm.qY, crm.ra, crm.rb, crm.qZ};
   private static final cre[] d = new cre[]{crm.qG, crm.qH, crm.qE, crm.qF};
   private static final cre[] e = new cre[]{
      crm.os,
      crm.pq,
      crm.pw,
      crm.pW,
      crm.pX,
      crm.pZ,
      crm.qa,
      crm.qY,
      crm.qZ,
      crm.ra,
      crm.rb,
      crm.rc,
      crm.rd,
      crm.rR,
      crm.rV,
      crm.rZ,
      crm.sa,
      crm.sb,
      crm.sc,
      crm.sd,
      crm.sl,
      crm.ud,
      crm.ue,
      crm.uf,
      crm.ug,
      crm.ui,
      crm.ur,
      crm.uy,
      crm.uz,
      crm.uA,
      crm.uL,
      crm.uM,
      crm.ve,
      crm.vi,
      crm.vk,
      crm.rW,
      crm.vS,
      crm.wn,
      crm.wv,
      crm.wo
   };
   private static final cre[] f = new cre[]{crm.oN, crm.oX, crm.oS, crm.pc, crm.ph, crm.pm};

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dca.ij,
            wg.c("advancements.husbandry.root.title"),
            wg.c("advancements.husbandry.root.description"),
            new ajt("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crm.pv, wg.c("advancements.husbandry.plant_seed.title"), wg.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(dca.cB))
         .a("pumpkin_stem", cd.a.a(dca.fd))
         .a("melon_stem", cd.a.a(dca.fe))
         .a("beetroots", cd.a.a(dca.kD))
         .a("nether_wart", cd.a.a(dca.fq))
         .a("torchflower", cd.a.a(dca.kA))
         .a("pitcher_pod", cd.a.a(dca.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            crm.pv,
            wg.c("advancements.husbandry.breed_an_animal.title"),
            wg.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(crm.os, wg.c("advancements.husbandry.balanced_diet.title"), wg.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(crm.pn, wg.c("advancements.husbandry.netherite_hoe.title"), wg.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(crm.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            crm.uI,
            wg.c("advancements.husbandry.tame_an_animal.title"),
            wg.c("advancements.husbandry.tame_an_animal.description"),
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
            crm.qU,
            wg.c("advancements.husbandry.fishy_business.title"),
            wg.c("advancements.husbandry.fishy_business.description"),
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
            crm.qE,
            wg.c("advancements.husbandry.tactical_fishing.title"),
            wg.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kr.h.b(crm.qI).a(), bv.a.a(cc.a.a().a(crm.qI)))
         .a(
            crm.qI,
            wg.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wg.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bqb.f)))
         .a(
            crm.qH,
            wg.c("advancements.husbandry.kill_axolotl_target.title"),
            wg.c("advancements.husbandry.kill_axolotl_target.description"),
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
            crm.qY,
            wg.c("advancements.husbandry.complete_catalogue.title"),
            wg.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(avc.aG)).a(true), cc.a.a().a(crm.sk)))
         .a(
            crm.wv,
            wg.c("advancements.husbandry.safely_harvest_honey.title"),
            wg.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(crm.ws, wg.c("advancements.husbandry.wax_on.title"), wg.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cqz.a.get().keySet())), cc.a.a().a(crm.ws)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(crm.oS, wg.c("advancements.husbandry.wax_off.title"), wg.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cqz.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kr.h.b(crm.qJ).a(), bv.a.a(cc.a.a().a(crm.qJ)))
         .a(
            crm.qJ,
            wg.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wg.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            crm.uI,
            wg.c("advancements.husbandry.leash_all_frog_variants.title"),
            wg.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(crm.xj, wg.c("advancements.husbandry.froglights.title"), wg.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(crm.xi, crm.xk, crm.xj))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dca.pe, cc.a.a().a(new bm(cwt.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            dca.pe,
            wg.c("advancements.husbandry.silk_touch_nest.title"),
            wg.c("advancements.husbandry.silk_touch_nest.description"),
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
            crm.nT,
            wg.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wg.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bqb.k).b(br.a.a().a(bqb.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            crm.rf,
            wg.c("advancements.husbandry.make_a_sign_glow.title"),
            wg.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(avc.aB)), cc.a.a().a(crm.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            crm.rR,
            wg.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wg.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bqb.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            crm.me,
            wg.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wg.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(dca.aY)), cc.a.a().a(crm.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            crm.kp,
            wg.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wg.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(crm.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(crm.vg, wg.c("advancements.husbandry.feed_snifflet.title"), wg.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(avk.aP), Optional.of(br.a(br.a.a().a(bqb.aQ).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            crm.vh,
            wg.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wg.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(dca.kA))
         .a("pitcher_pod", cd.a.a(dca.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bqb<?>> $$2, Stream<bqb<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            crm.ui,
            wg.c("advancements.husbandry.breed_all_animals.title"),
            wg.c("advancements.husbandry.breed_all_animals.description"),
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
      kr.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(crm.uI), Optional.of(br.a(br.a.a().a(bqb.R).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cre $$1 : e) {
         $$0.a(kr.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bqb<?>> $$1, Stream<bqb<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bqb.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bqb.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cre $$1 : d) {
         $$0.a(kr.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cre $$1 : c) {
         $$0.a(kr.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cc.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kr.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ajs::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), de.a.a(br.a.a().a(bs.a($$1.getValue())))));
      return $$0;
   }
}
