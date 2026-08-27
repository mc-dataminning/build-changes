import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jq implements jm {
   public static final List<bfn<?>> a = List.of(
      bfn.Y,
      bfn.w,
      bfn.ap,
      bfn.aF,
      bfn.t,
      bfn.ao,
      bfn.av,
      bfn.q,
      bfn.bn,
      bfn.aq,
      bfn.aC,
      bfn.aj,
      bfn.m,
      bfn.as,
      bfn.N,
      bfn.h,
      bfn.W,
      bfn.aV,
      bfn.U,
      bfn.f,
      bfn.l
   );
   public static final List<bfn<?>> b = List.of(bfn.bd, bfn.O, bfn.aN);
   private static final cfu[] c = new cfu[]{cgc.ql, cgc.qn, cgc.qo, cgc.qm};
   private static final cfu[] d = new cfu[]{cgc.pT, cgc.pU, cgc.pR, cgc.pS};
   private static final cfu[] e = new cfu[]{
      cgc.nF,
      cgc.oD,
      cgc.oJ,
      cgc.pj,
      cgc.pk,
      cgc.pm,
      cgc.pn,
      cgc.ql,
      cgc.qm,
      cgc.qn,
      cgc.qo,
      cgc.qp,
      cgc.qq,
      cgc.re,
      cgc.rh,
      cgc.rl,
      cgc.rm,
      cgc.rn,
      cgc.ro,
      cgc.rp,
      cgc.rx,
      cgc.tl,
      cgc.tm,
      cgc.tn,
      cgc.to,
      cgc.tq,
      cgc.tz,
      cgc.tG,
      cgc.tH,
      cgc.tI,
      cgc.tT,
      cgc.tU,
      cgc.um,
      cgc.uq,
      cgc.us,
      cgc.ri,
      cgc.va,
      cgc.vv,
      cgc.vD,
      cgc.vw
   };
   private static final cfu[] f = new cfu[]{cgc.oa, cgc.ok, cgc.of, cgc.op, cgc.ou, cgc.oz};

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cpo.ij,
            sw.c("advancements.husbandry.root.title"),
            sw.c("advancements.husbandry.root.description"),
            new acq("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", az.a.c())
         .a($$1, "husbandry/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cgc.oI, sw.c("advancements.husbandry.plant_seed.title"), sw.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("wheat", ca.a.a(cpo.cB))
         .a("pumpkin_stem", ca.a.a(cpo.fd))
         .a("melon_stem", ca.a.a(cpo.fe))
         .a("beetroots", ca.a.a(cpo.kD))
         .a("nether_wart", ca.a.a(cpo.fq))
         .a("torchflower", ca.a.a(cpo.kA))
         .a("pitcher_pod", ca.a.a(cpo.kB))
         .a($$1, "husbandry/plant_seed");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(
            cgc.oI,
            sw.c("advancements.husbandry.breed_an_animal.title"),
            sw.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cgc.nF, sw.c("advancements.husbandry.balanced_diet.title"), sw.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cgc.oA, sw.c("advancements.husbandry.netherite_hoe.title"), sw.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_hoe", bx.a.a(cgc.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ae $$5 = ae.a.a()
         .a($$2)
         .a(
            cgc.tQ,
            sw.c("advancements.husbandry.tame_an_animal.title"),
            sw.c("advancements.husbandry.tame_an_animal.description"),
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
            cgc.qh,
            sw.c("advancements.husbandry.fishy_business.title"),
            sw.c("advancements.husbandry.fishy_business.description"),
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
            cgc.pR,
            sw.c("advancements.husbandry.tactical_fishing.title"),
            sw.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jb.i.b(cgc.pV).a(), bs.a.a(bz.a.a().a(cgc.pV).b()))
         .a(
            cgc.pV,
            sw.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            sw.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bh.a.a(bo.a.a().a(bfn.f).b()))
         .a(
            cgc.pU,
            sw.c("advancements.husbandry.kill_axolotl_target.title"),
            sw.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cgc.ql,
            sw.c("advancements.husbandry.complete_catalogue.title"),
            sw.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", ca.a.a(ch.a.a().a(at.a.a().a(amw.aE).b()).a(true), bz.a.a().a(cgc.rw)))
         .a(
            cgc.vD,
            sw.c("advancements.husbandry.safely_harvest_honey.title"),
            sw.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(cgc.vA, sw.c("advancements.husbandry.wax_on.title"), sw.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", ca.a.a(ch.a.a().a(at.a.a().a(cfo.a.get().keySet()).b()), bz.a.a().a(cgc.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cgc.of, sw.c("advancements.husbandry.wax_off.title"), sw.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", ca.a.a(ch.a.a().a(at.a.a().a(cfo.b.get().keySet()).b()), bz.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(jb.i.b(cgc.pW).a(), bs.a.a(bz.a.a().a(cgc.pW).b()))
         .a(
            cgc.pW,
            sw.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            sw.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cgc.tQ,
            sw.c("advancements.husbandry.leash_all_frog_variants.title"),
            sw.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cgc.wr, sw.c("advancements.husbandry.froglights.title"), sw.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", bx.a.a(cgc.wq, cgc.ws, cgc.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", as.a.a(cpo.pe, bz.a.a().a(new bj(ckk.v, cj.d.b(1))), cj.d.a(3)))
         .a(
            cpo.pe,
            sw.c("advancements.husbandry.silk_touch_nest.title"),
            sw.c("advancements.husbandry.silk_touch_nest.description"),
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
            cgc.ni,
            sw.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            sw.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bo.a.a().a(bo.a.a().a(bfn.k).b(bo.a.a().a(bfn.U).b()).b())))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cgc.qs,
            sw.c("advancements.husbandry.make_a_sign_glow.title"),
            sw.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ca.a.a(ch.a.a().a(at.a.a().a(amw.az).b()), bz.a.a().a(cgc.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(
            cgc.re,
            sw.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            sw.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cm.a.b(ba.a, bz.a, bo.a(bo.a.a().a(bfn.b).b())))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cgc.lJ,
            sw.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            sw.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ca.a.b(ch.a.a().a(at.a.a().a(cpo.aY).b()), bz.a.a().a(cgc.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(
            cgc.jU,
            sw.c("advancements.husbandry.obtain_sniffer_egg.title"),
            sw.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bx.a.a(cgc.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ae $$15 = ae.a.a()
         .a($$14)
         .a(cgc.uo, sw.c("advancements.husbandry.feed_snifflet.title"), sw.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", co.a.a(bz.a.a().a(ane.aK), bo.a(bo.a.a().a(bfn.aN).a(bm.a.a().e(true).b()).b())))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cgc.up,
            sw.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            sw.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(ap.b)
         .a("torchflower", ca.a.a(cpo.kA))
         .a("pitcher_pod", ca.a.a(cpo.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static ae a(ae $$0, Consumer<ae> $$1, Stream<bfn<?>> $$2, Stream<bfn<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cgc.tq,
            sw.c("advancements.husbandry.breed_all_animals.title"),
            sw.c("advancements.husbandry.breed_all_animals.description"),
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
      jb.ak.h().forEach($$1 -> $$0.a($$1.g().a().toString(), co.a.a(bz.a.a().a(cgc.tQ), bo.a(bo.a.a().a(bfn.O).a(bp.a($$1.a())).b()))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cfu $$1 : e) {
         $$0.a(jb.i.b($$1).a(), az.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bfn<?>> $$1, Stream<bfn<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bfn.a($$1x).toString(), au.a.a(bo.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bfn.a($$1x).toString(), au.a.a(bo.a.a().a($$1x).b(), bo.a.a().a($$1x).b(), bo.a)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cfu $$1 : d) {
         $$0.a(jb.i.b($$1).a(), bs.a.a(bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cfu $$1 : c) {
         $$0.a(jb.i.b($$1).a(), bu.a.a(bz.a, bo.a, bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jb.aj
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(acp::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bo.a.a().a(bp.a($$1.getValue())).b())));
      return $$0;
   }
}
