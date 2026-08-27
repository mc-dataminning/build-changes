import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jq implements jm {
   public static final List<bim<?>> a = List.of(
      bim.Y,
      bim.w,
      bim.ap,
      bim.aF,
      bim.t,
      bim.ao,
      bim.av,
      bim.q,
      bim.bn,
      bim.aq,
      bim.aC,
      bim.aj,
      bim.m,
      bim.as,
      bim.N,
      bim.h,
      bim.W,
      bim.aV,
      bim.U,
      bim.f,
      bim.l
   );
   public static final List<bim<?>> b = List.of(bim.bd, bim.O, bim.aN);
   private static final cis[] c = new cis[]{cja.ql, cja.qn, cja.qo, cja.qm};
   private static final cis[] d = new cis[]{cja.pT, cja.pU, cja.pR, cja.pS};
   private static final cis[] e = new cis[]{
      cja.nF,
      cja.oD,
      cja.oJ,
      cja.pj,
      cja.pk,
      cja.pm,
      cja.pn,
      cja.ql,
      cja.qm,
      cja.qn,
      cja.qo,
      cja.qp,
      cja.qq,
      cja.re,
      cja.rh,
      cja.rl,
      cja.rm,
      cja.rn,
      cja.ro,
      cja.rp,
      cja.rx,
      cja.tl,
      cja.tm,
      cja.tn,
      cja.to,
      cja.tq,
      cja.tz,
      cja.tG,
      cja.tH,
      cja.tI,
      cja.tT,
      cja.tU,
      cja.um,
      cja.uq,
      cja.us,
      cja.ri,
      cja.va,
      cja.vv,
      cja.vD,
      cja.vw
   };
   private static final cis[] f = new cis[]{cja.oa, cja.ok, cja.of, cja.op, cja.ou, cja.oz};

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csm.ij,
            tf.c("advancements.husbandry.root.title"),
            tf.c("advancements.husbandry.root.description"),
            new aer("textures/gui/advancements/backgrounds/husbandry.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", az.a.d())
         .a($$1, "husbandry/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cja.oI, tf.c("advancements.husbandry.plant_seed.title"), tf.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("wheat", ca.a.a(csm.cB))
         .a("pumpkin_stem", ca.a.a(csm.fd))
         .a("melon_stem", ca.a.a(csm.fe))
         .a("beetroots", ca.a.a(csm.kD))
         .a("nether_wart", ca.a.a(csm.fq))
         .a("torchflower", ca.a.a(csm.kA))
         .a("pitcher_pod", ca.a.a(csm.kB))
         .a($$1, "husbandry/plant_seed");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(
            cja.oI,
            tf.c("advancements.husbandry.breed_an_animal.title"),
            tf.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(ap.b)
         .a("bred", au.a.d())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(cja.nF, tf.c("advancements.husbandry.balanced_diet.title"), tf.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cja.oA, tf.c("advancements.husbandry.netherite_hoe.title"), tf.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_hoe", bx.a.a(cja.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ae $$5 = ae.a.a()
         .a($$2)
         .a(
            cja.tQ,
            tf.c("advancements.husbandry.tame_an_animal.title"),
            tf.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("tamed_animal", db.a.d())
         .a($$1, "husbandry/tame_an_animal");
      ae $$6 = d(ae.a.a())
         .a($$2)
         .a(ap.b)
         .a(
            cja.qh,
            tf.c("advancements.husbandry.fishy_business.title"),
            tf.c("advancements.husbandry.fishy_business.description"),
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
            cja.pR,
            tf.c("advancements.husbandry.tactical_fishing.title"),
            tf.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jb.i.b(cja.pV).a(), bs.a.a(bz.a.a().a(cja.pV).b()))
         .a(
            cja.pV,
            tf.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            tf.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bh.a.a(bo.a.a().a(bim.f).b()))
         .a(
            cja.pU,
            tf.c("advancements.husbandry.kill_axolotl_target.title"),
            tf.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cja.ql,
            tf.c("advancements.husbandry.complete_catalogue.title"),
            tf.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", ca.a.a(ch.a.a().a(at.a.a().a(apl.aF)).a(true), bz.a.a().a(cja.rw)))
         .a(
            cja.vD,
            tf.c("advancements.husbandry.safely_harvest_honey.title"),
            tf.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(cja.vA, tf.c("advancements.husbandry.wax_on.title"), tf.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", ca.a.a(ch.a.a().a(at.a.a().a(cim.a.get().keySet())), bz.a.a().a(cja.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cja.of, tf.c("advancements.husbandry.wax_off.title"), tf.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", ca.a.a(ch.a.a().a(at.a.a().a(cim.b.get().keySet())), bz.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(jb.i.b(cja.pW).a(), bs.a.a(bz.a.a().a(cja.pW).b()))
         .a(
            cja.pW,
            tf.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            tf.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cja.tQ,
            tf.c("advancements.husbandry.leash_all_frog_variants.title"),
            tf.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cja.wr, tf.c("advancements.husbandry.froglights.title"), tf.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", bx.a.a(cja.wq, cja.ws, cja.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", as.a.a(csm.pe, bz.a.a().a(new bj(cni.v, cj.d.b(1))), cj.d.a(3)))
         .a(
            csm.pe,
            tf.c("advancements.husbandry.silk_touch_nest.title"),
            tf.c("advancements.husbandry.silk_touch_nest.description"),
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
            cja.ni,
            tf.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            tf.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cx.a.a(bo.a.a().a(bo.a.a().a(bim.k).b(bo.a.a().a(bim.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cja.qs,
            tf.c("advancements.husbandry.make_a_sign_glow.title"),
            tf.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ca.a.a(ch.a.a().a(at.a.a().a(apl.aA)), bz.a.a().a(cja.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(
            cja.re,
            tf.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            tf.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cm.a.a(Optional.empty(), Optional.empty(), bo.a(bo.a.a().a(bim.b))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cja.lJ,
            tf.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            tf.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ca.a.b(ch.a.a().a(at.a.a().a(csm.aY)), bz.a.a().a(cja.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(
            cja.jU,
            tf.c("advancements.husbandry.obtain_sniffer_egg.title"),
            tf.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bx.a.a(cja.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ae $$15 = ae.a.a()
         .a($$14)
         .a(cja.uo, tf.c("advancements.husbandry.feed_snifflet.title"), tf.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", co.a.a(bz.a.a().a(apt.aK), bo.a(bo.a.a().a(bim.aN).a(bm.a.a().e(true)))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cja.up,
            tf.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            tf.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(ap.b)
         .a("torchflower", ca.a.a(csm.kA))
         .a("pitcher_pod", ca.a.a(csm.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static ae a(ae $$0, Consumer<ae> $$1, Stream<bim<?>> $$2, Stream<bim<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cja.tq,
            tf.c("advancements.husbandry.breed_all_animals.title"),
            tf.c("advancements.husbandry.breed_all_animals.description"),
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
      jb.ak.h().forEach($$1 -> $$0.a($$1.g().a().toString(), co.a.a(bz.a.a().a(cja.tQ), bo.a(bo.a.a().a(bim.O).a(bp.a($$1.a()))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cis $$1 : e) {
         $$0.a(jb.i.b($$1).a(), az.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bim<?>> $$1, Stream<bim<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bim.a($$1x).toString(), au.a.a(bo.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bim.a($$1x).toString(), au.a.a(bo.a.a().a($$1x).b(), bo.a.a().a($$1x).b(), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cis $$1 : d) {
         $$0.a(jb.i.b($$1).a(), bs.a.a(bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cis $$1 : c) {
         $$0.a(jb.i.b($$1).a(), bu.a.a(Optional.empty(), Optional.empty(), bz.a.a().a($$1).b()));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jb.aj
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aeq::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), db.a.a(bo.a.a().a(bp.a($$1.getValue())).b())));
      return $$0;
   }
}
