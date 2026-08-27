import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jr implements jn {
   public static final List<bik<?>> a = List.of(
      bik.Y,
      bik.w,
      bik.ap,
      bik.aF,
      bik.t,
      bik.ao,
      bik.av,
      bik.q,
      bik.bn,
      bik.aq,
      bik.aC,
      bik.aj,
      bik.m,
      bik.as,
      bik.N,
      bik.h,
      bik.W,
      bik.aV,
      bik.U,
      bik.f,
      bik.l
   );
   public static final List<bik<?>> b = List.of(bik.bd, bik.O, bik.aN);
   private static final cir[] c = new cir[]{ciz.ql, ciz.qn, ciz.qo, ciz.qm};
   private static final cir[] d = new cir[]{ciz.pT, ciz.pU, ciz.pR, ciz.pS};
   private static final cir[] e = new cir[]{
      ciz.nF,
      ciz.oD,
      ciz.oJ,
      ciz.pj,
      ciz.pk,
      ciz.pm,
      ciz.pn,
      ciz.ql,
      ciz.qm,
      ciz.qn,
      ciz.qo,
      ciz.qp,
      ciz.qq,
      ciz.re,
      ciz.rh,
      ciz.rl,
      ciz.rm,
      ciz.rn,
      ciz.ro,
      ciz.rp,
      ciz.rx,
      ciz.tl,
      ciz.tm,
      ciz.tn,
      ciz.to,
      ciz.tq,
      ciz.tz,
      ciz.tG,
      ciz.tH,
      ciz.tI,
      ciz.tT,
      ciz.tU,
      ciz.um,
      ciz.uq,
      ciz.us,
      ciz.ri,
      ciz.va,
      ciz.vv,
      ciz.vD,
      ciz.vw
   };
   private static final cir[] f = new cir[]{ciz.oa, ciz.ok, ciz.of, ciz.op, ciz.ou, ciz.oz};

   @Override
   public void a(hh.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csl.ij,
            te.c("advancements.husbandry.root.title"),
            te.c("advancements.husbandry.root.description"),
            new aep("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", az.a.c())
         .a($$1, "husbandry/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(ciz.oI, te.c("advancements.husbandry.plant_seed.title"), te.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("wheat", ca.a.a(csl.cB))
         .a("pumpkin_stem", ca.a.a(csl.fd))
         .a("melon_stem", ca.a.a(csl.fe))
         .a("beetroots", ca.a.a(csl.kD))
         .a("nether_wart", ca.a.a(csl.fq))
         .a("torchflower", ca.a.a(csl.kA))
         .a("pitcher_pod", ca.a.a(csl.kB))
         .a($$1, "husbandry/plant_seed");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(
            ciz.oI,
            te.c("advancements.husbandry.breed_an_animal.title"),
            te.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(ap.b)
         .a("bred", au.a.c())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(ciz.nF, te.c("advancements.husbandry.balanced_diet.title"), te.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(ciz.oA, te.c("advancements.husbandry.netherite_hoe.title"), te.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_hoe", bx.a.a(ciz.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ae $$5 = ae.a.a()
         .a($$2)
         .a(
            ciz.tQ,
            te.c("advancements.husbandry.tame_an_animal.title"),
            te.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dc.a.c())
         .a($$1, "husbandry/tame_an_animal");
      ae $$6 = d(ae.a.a())
         .a($$2)
         .a(ap.b)
         .a(
            ciz.qh,
            te.c("advancements.husbandry.fishy_business.title"),
            te.c("advancements.husbandry.fishy_business.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ae $$7 = c(ae.a.a())
         .a($$6)
         .a(ap.b)
         .a(
            ciz.pR,
            te.c("advancements.husbandry.tactical_fishing.title"),
            te.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ae $$8 = ae.a.a()
         .a($$7)
         .a(ap.b)
         .a(jc.i.b(ciz.pV).a(), bs.a.a(bz.a.a().a(ciz.pV).b()))
         .a(
            ciz.pV,
            te.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            te.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bh.a.a(bo.a.a().a(bik.f).b()))
         .a(
            ciz.pU,
            te.c("advancements.husbandry.kill_axolotl_target.title"),
            te.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$5)
         .a(
            ciz.ql,
            te.c("advancements.husbandry.complete_catalogue.title"),
            te.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      ae $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", ca.a.a(ch.a.a().a(at.a.a().a(apj.aF).b()).a(true), bz.a.a().a(ciz.rw)))
         .a(
            ciz.vD,
            te.c("advancements.husbandry.safely_harvest_honey.title"),
            te.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(ciz.vA, te.c("advancements.husbandry.wax_on.title"), te.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", ca.a.a(ch.a.a().a(at.a.a().a(cil.a.get().keySet()).b()), bz.a.a().a(ciz.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(ciz.of, te.c("advancements.husbandry.wax_off.title"), te.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", ca.a.a(ch.a.a().a(at.a.a().a(cil.b.get().keySet()).b()), bz.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(jc.i.b(ciz.pW).a(), bs.a.a(bz.a.a().a(ciz.pW).b()))
         .a(
            ciz.pW,
            te.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            te.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ae $$12 = a(ae.a.a())
         .a($$11)
         .a(
            ciz.tQ,
            te.c("advancements.husbandry.leash_all_frog_variants.title"),
            te.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(ciz.wr, te.c("advancements.husbandry.froglights.title"), te.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", bx.a.a(ciz.wq, ciz.ws, ciz.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", as.a.a(csl.pe, bz.a.a().a(new bj(cnh.v, cj.d.b(1))), cj.d.a(3)))
         .a(
            csl.pe,
            te.c("advancements.husbandry.silk_touch_nest.title"),
            te.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$2)
         .a(
            ciz.ni,
            te.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            te.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bo.a.a().a(bo.a.a().a(bik.k).b(bo.a.a().a(bik.U).b()).b())))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            ciz.qs,
            te.c("advancements.husbandry.make_a_sign_glow.title"),
            te.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ca.a.a(ch.a.a().a(at.a.a().a(apj.aA).b()), bz.a.a().a(ciz.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(
            ciz.re,
            te.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            te.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cm.a.b(ba.a, bz.a, bo.a(bo.a.a().a(bik.b).b())))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            ciz.lJ,
            te.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            te.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ca.a.b(ch.a.a().a(at.a.a().a(csl.aY).b()), bz.a.a().a(ciz.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(
            ciz.jU,
            te.c("advancements.husbandry.obtain_sniffer_egg.title"),
            te.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bx.a.a(ciz.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ae $$15 = ae.a.a()
         .a($$14)
         .a(ciz.uo, te.c("advancements.husbandry.feed_snifflet.title"), te.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", co.a.a(bz.a.a().a(apr.aK), bo.a(bo.a.a().a(bik.aN).a(bm.a.a().e(true).b()).b())))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            ciz.up,
            te.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            te.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(ap.b)
         .a("torchflower", ca.a.a(csl.kA))
         .a("pitcher_pod", ca.a.a(csl.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static ae a(ae $$0, Consumer<ae> $$1, Stream<bik<?>> $$2, Stream<bik<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            ciz.tq,
            te.c("advancements.husbandry.breed_all_animals.title"),
            te.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ae.a a(ae.a $$0) {
      jc.ak.h().forEach($$1 -> $$0.a($$1.g().a().toString(), co.a.a(bz.a.a().a(ciz.tQ), bo.a(bo.a.a().a(bik.O).a(bp.a($$1.a())).b()))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cir $$1 : e) {
         $$0.a(jc.i.b($$1).a(), az.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bik<?>> $$1, Stream<bik<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bik.a($$1x).toString(), au.a.a(bo.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bik.a($$1x).toString(), au.a.a(bo.a.a().a($$1x).b(), bo.a.a().a($$1x).b(), bo.a)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cir $$1 : d) {
         $$0.a(jc.i.b($$1).a(), bs.a.a(bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cir $$1 : c) {
         $$0.a(jc.i.b($$1).a(), bu.a.a(bz.a, bo.a, bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jc.aj
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aeo::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bo.a.a().a(bp.a($$1.getValue())).b())));
      return $$0;
   }
}
