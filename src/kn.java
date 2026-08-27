import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kn implements kj {
   public static final List<bjx<?>> a = List.of(
      bjx.Y,
      bjx.w,
      bjx.ap,
      bjx.aF,
      bjx.t,
      bjx.ao,
      bjx.av,
      bjx.q,
      bjx.bn,
      bjx.aq,
      bjx.aC,
      bjx.aj,
      bjx.m,
      bjx.as,
      bjx.N,
      bjx.h,
      bjx.W,
      bjx.aV,
      bjx.U,
      bjx.f,
      bjx.l
   );
   public static final List<bjx<?>> b = List.of(bjx.bd, bjx.O, bjx.aN);
   private static final cke[] c = new cke[]{ckm.ql, ckm.qn, ckm.qo, ckm.qm};
   private static final cke[] d = new cke[]{ckm.pT, ckm.pU, ckm.pR, ckm.pS};
   private static final cke[] e = new cke[]{
      ckm.nF,
      ckm.oD,
      ckm.oJ,
      ckm.pj,
      ckm.pk,
      ckm.pm,
      ckm.pn,
      ckm.ql,
      ckm.qm,
      ckm.qn,
      ckm.qo,
      ckm.qp,
      ckm.qq,
      ckm.re,
      ckm.rh,
      ckm.rl,
      ckm.rm,
      ckm.rn,
      ckm.ro,
      ckm.rp,
      ckm.rx,
      ckm.tl,
      ckm.tm,
      ckm.tn,
      ckm.to,
      ckm.tq,
      ckm.tz,
      ckm.tG,
      ckm.tH,
      ckm.tI,
      ckm.tT,
      ckm.tU,
      ckm.um,
      ckm.uq,
      ckm.us,
      ckm.ri,
      ckm.va,
      ckm.vv,
      ckm.vD,
      ckm.vw
   };
   private static final cke[] f = new cke[]{ckm.oa, ckm.ok, ckm.of, ckm.op, ckm.ou, ckm.oz};

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuc.ij,
            ui.c("advancements.husbandry.root.title"),
            ui.c("advancements.husbandry.root.description"),
            new afw("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ckm.oI, ui.c("advancements.husbandry.plant_seed.title"), ui.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(cuc.cB))
         .a("pumpkin_stem", cc.a.a(cuc.fd))
         .a("melon_stem", cc.a.a(cuc.fe))
         .a("beetroots", cc.a.a(cuc.kD))
         .a("nether_wart", cc.a.a(cuc.fq))
         .a("torchflower", cc.a.a(cuc.kA))
         .a("pitcher_pod", cc.a.a(cuc.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            ckm.oI,
            ui.c("advancements.husbandry.breed_an_animal.title"),
            ui.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", aw.a.c())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(ckm.nF, ui.c("advancements.husbandry.balanced_diet.title"), ui.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(ckm.oA, ui.c("advancements.husbandry.netherite_hoe.title"), ui.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(ckm.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            ckm.tQ,
            ui.c("advancements.husbandry.tame_an_animal.title"),
            ui.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dd.a.c())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            ckm.qh,
            ui.c("advancements.husbandry.fishy_business.title"),
            ui.c("advancements.husbandry.fishy_business.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      af $$7 = c(ae.a.a())
         .a($$6)
         .a(ai.a.b)
         .a(
            ckm.pR,
            ui.c("advancements.husbandry.tactical_fishing.title"),
            ui.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      af $$8 = ae.a.a()
         .a($$7)
         .a(ai.a.b)
         .a(jy.i.b(ckm.pV).a(), bu.a.a(cb.a.a().a(ckm.pV)))
         .a(
            ckm.pV,
            ui.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            ui.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bjx.f)))
         .a(
            ckm.pU,
            ui.c("advancements.husbandry.kill_axolotl_target.title"),
            ui.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$5)
         .a(
            ckm.ql,
            ui.c("advancements.husbandry.complete_catalogue.title"),
            ui.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(aqs.aF)).a(true), cb.a.a().a(ckm.rw)))
         .a(
            ckm.vD,
            ui.c("advancements.husbandry.safely_harvest_honey.title"),
            ui.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(ckm.vA, ui.c("advancements.husbandry.wax_on.title"), ui.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(cjy.a.get().keySet())), cb.a.a().a(ckm.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(ckm.of, ui.c("advancements.husbandry.wax_off.title"), ui.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(cjy.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jy.i.b(ckm.pW).a(), bu.a.a(cb.a.a().a(ckm.pW)))
         .a(
            ckm.pW,
            ui.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            ui.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      af $$12 = a(ae.a.a())
         .a($$11)
         .a(
            ckm.tQ,
            ui.c("advancements.husbandry.leash_all_frog_variants.title"),
            ui.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(ckm.wr, ui.c("advancements.husbandry.froglights.title"), ui.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(ckm.wq, ckm.ws, ckm.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cuc.pe, cb.a.a().a(new bl(cox.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            cuc.pe,
            ui.c("advancements.husbandry.silk_touch_nest.title"),
            ui.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$2)
         .a(
            ckm.ni,
            ui.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ui.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bjx.k).b(bq.a.a().a(bjx.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            ckm.qs,
            ui.c("advancements.husbandry.make_a_sign_glow.title"),
            ui.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(aqs.aA)), cb.a.a().a(ckm.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            ckm.re,
            ui.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ui.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bjx.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            ckm.lJ,
            ui.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ui.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(cuc.aY)), cb.a.a().a(ckm.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            ckm.jU,
            ui.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ui.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(ckm.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(ckm.uo, ui.c("advancements.husbandry.feed_snifflet.title"), ui.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(ara.aK), Optional.of(bq.a(bq.a.a().a(bjx.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            ckm.up,
            ui.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ui.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(cuc.kA))
         .a("pitcher_pod", cc.a.a(cuc.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bjx<?>> $$2, Stream<bjx<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            ckm.tq,
            ui.c("advancements.husbandry.breed_all_animals.title"),
            ui.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ae.a a(ae.a $$0) {
      jy.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(ckm.tQ), Optional.of(bq.a(bq.a.a().a(bjx.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cke $$1 : e) {
         $$0.a(jy.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bjx<?>> $$1, Stream<bjx<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bjx.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bjx.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cke $$1 : d) {
         $$0.a(jy.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cke $$1 : c) {
         $$0.a(jy.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jy.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(afv::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
