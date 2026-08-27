import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class js implements jo {
   public static final List<biw<?>> a = List.of(
      biw.Y,
      biw.w,
      biw.ap,
      biw.aF,
      biw.t,
      biw.ao,
      biw.av,
      biw.q,
      biw.bn,
      biw.aq,
      biw.aC,
      biw.aj,
      biw.m,
      biw.as,
      biw.N,
      biw.h,
      biw.W,
      biw.aV,
      biw.U,
      biw.f,
      biw.l
   );
   public static final List<biw<?>> b = List.of(biw.bd, biw.O, biw.aN);
   private static final cjc[] c = new cjc[]{cjk.ql, cjk.qn, cjk.qo, cjk.qm};
   private static final cjc[] d = new cjc[]{cjk.pT, cjk.pU, cjk.pR, cjk.pS};
   private static final cjc[] e = new cjc[]{
      cjk.nF,
      cjk.oD,
      cjk.oJ,
      cjk.pj,
      cjk.pk,
      cjk.pm,
      cjk.pn,
      cjk.ql,
      cjk.qm,
      cjk.qn,
      cjk.qo,
      cjk.qp,
      cjk.qq,
      cjk.re,
      cjk.rh,
      cjk.rl,
      cjk.rm,
      cjk.rn,
      cjk.ro,
      cjk.rp,
      cjk.rx,
      cjk.tl,
      cjk.tm,
      cjk.tn,
      cjk.to,
      cjk.tq,
      cjk.tz,
      cjk.tG,
      cjk.tH,
      cjk.tI,
      cjk.tT,
      cjk.tU,
      cjk.um,
      cjk.uq,
      cjk.us,
      cjk.ri,
      cjk.va,
      cjk.vv,
      cjk.vD,
      cjk.vw
   };
   private static final cjc[] f = new cjc[]{cjk.oa, cjk.ok, cjk.of, cjk.op, cjk.ou, cjk.oz};

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csy.ij,
            tn.c("advancements.husbandry.root.title"),
            tn.c("advancements.husbandry.root.description"),
            new aey("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjk.oI, tn.c("advancements.husbandry.plant_seed.title"), tn.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(csy.cB))
         .a("pumpkin_stem", cc.a.a(csy.fd))
         .a("melon_stem", cc.a.a(csy.fe))
         .a("beetroots", cc.a.a(csy.kD))
         .a("nether_wart", cc.a.a(csy.fq))
         .a("torchflower", cc.a.a(csy.kA))
         .a("pitcher_pod", cc.a.a(csy.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cjk.oI,
            tn.c("advancements.husbandry.breed_an_animal.title"),
            tn.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cjk.nF, tn.c("advancements.husbandry.balanced_diet.title"), tn.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cjk.oA, tn.c("advancements.husbandry.netherite_hoe.title"), tn.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(cjk.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cjk.tQ,
            tn.c("advancements.husbandry.tame_an_animal.title"),
            tn.c("advancements.husbandry.tame_an_animal.description"),
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
            cjk.qh,
            tn.c("advancements.husbandry.fishy_business.title"),
            tn.c("advancements.husbandry.fishy_business.description"),
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
            cjk.pR,
            tn.c("advancements.husbandry.tactical_fishing.title"),
            tn.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jd.i.b(cjk.pV).a(), bu.a.a(cb.a.a().a(cjk.pV)))
         .a(
            cjk.pV,
            tn.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            tn.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(biw.f)))
         .a(
            cjk.pU,
            tn.c("advancements.husbandry.kill_axolotl_target.title"),
            tn.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cjk.ql,
            tn.c("advancements.husbandry.complete_catalogue.title"),
            tn.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(apu.aF)).a(true), cb.a.a().a(cjk.rw)))
         .a(
            cjk.vD,
            tn.c("advancements.husbandry.safely_harvest_honey.title"),
            tn.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjk.vA, tn.c("advancements.husbandry.wax_on.title"), tn.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(ciw.a.get().keySet())), cb.a.a().a(cjk.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cjk.of, tn.c("advancements.husbandry.wax_off.title"), tn.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(ciw.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jd.i.b(cjk.pW).a(), bu.a.a(cb.a.a().a(cjk.pW)))
         .a(
            cjk.pW,
            tn.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            tn.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cjk.tQ,
            tn.c("advancements.husbandry.leash_all_frog_variants.title"),
            tn.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cjk.wr, tn.c("advancements.husbandry.froglights.title"), tn.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(cjk.wq, cjk.ws, cjk.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(csy.pe, cb.a.a().a(new bl(cnu.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            csy.pe,
            tn.c("advancements.husbandry.silk_touch_nest.title"),
            tn.c("advancements.husbandry.silk_touch_nest.description"),
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
            cjk.ni,
            tn.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            tn.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(biw.k).b(bq.a.a().a(biw.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cjk.qs,
            tn.c("advancements.husbandry.make_a_sign_glow.title"),
            tn.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(apu.aA)), cb.a.a().a(cjk.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cjk.re,
            tn.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            tn.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(biw.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cjk.lJ,
            tn.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            tn.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(csy.aY)), cb.a.a().a(cjk.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cjk.jU,
            tn.c("advancements.husbandry.obtain_sniffer_egg.title"),
            tn.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(cjk.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cjk.uo, tn.c("advancements.husbandry.feed_snifflet.title"), tn.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(aqc.aK), Optional.of(bq.a(bq.a.a().a(biw.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cjk.up,
            tn.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            tn.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(csy.kA))
         .a("pitcher_pod", cc.a.a(csy.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<biw<?>> $$2, Stream<biw<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cjk.tq,
            tn.c("advancements.husbandry.breed_all_animals.title"),
            tn.c("advancements.husbandry.breed_all_animals.description"),
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
      jd.ak.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(cjk.tQ), Optional.of(bq.a(bq.a.a().a(biw.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cjc $$1 : e) {
         $$0.a(jd.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<biw<?>> $$1, Stream<biw<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(biw.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(biw.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cjc $$1 : d) {
         $$0.a(jd.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cjc $$1 : c) {
         $$0.a(jd.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jd.aj
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aex::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
