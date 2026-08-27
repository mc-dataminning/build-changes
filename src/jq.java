import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jq implements jm {
   public static final List<bja<?>> a = List.of(
      bja.Y,
      bja.w,
      bja.ap,
      bja.aF,
      bja.t,
      bja.ao,
      bja.av,
      bja.q,
      bja.bn,
      bja.aq,
      bja.aC,
      bja.aj,
      bja.m,
      bja.as,
      bja.N,
      bja.h,
      bja.W,
      bja.aV,
      bja.U,
      bja.f,
      bja.l
   );
   public static final List<bja<?>> b = List.of(bja.bd, bja.O, bja.aN);
   private static final cjg[] c = new cjg[]{cjo.ql, cjo.qn, cjo.qo, cjo.qm};
   private static final cjg[] d = new cjg[]{cjo.pT, cjo.pU, cjo.pR, cjo.pS};
   private static final cjg[] e = new cjg[]{
      cjo.nF,
      cjo.oD,
      cjo.oJ,
      cjo.pj,
      cjo.pk,
      cjo.pm,
      cjo.pn,
      cjo.ql,
      cjo.qm,
      cjo.qn,
      cjo.qo,
      cjo.qp,
      cjo.qq,
      cjo.re,
      cjo.rh,
      cjo.rl,
      cjo.rm,
      cjo.rn,
      cjo.ro,
      cjo.rp,
      cjo.rx,
      cjo.tl,
      cjo.tm,
      cjo.tn,
      cjo.to,
      cjo.tq,
      cjo.tz,
      cjo.tG,
      cjo.tH,
      cjo.tI,
      cjo.tT,
      cjo.tU,
      cjo.um,
      cjo.uq,
      cjo.us,
      cjo.ri,
      cjo.va,
      cjo.vv,
      cjo.vD,
      cjo.vw
   };
   private static final cjg[] f = new cjg[]{cjo.oa, cjo.ok, cjo.of, cjo.op, cjo.ou, cjo.oz};

   @Override
   public void a(hg.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cte.ij,
            tl.c("advancements.husbandry.root.title"),
            tl.c("advancements.husbandry.root.description"),
            new aez("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjo.oI, tl.c("advancements.husbandry.plant_seed.title"), tl.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(cte.cB))
         .a("pumpkin_stem", cc.a.a(cte.fd))
         .a("melon_stem", cc.a.a(cte.fe))
         .a("beetroots", cc.a.a(cte.kD))
         .a("nether_wart", cc.a.a(cte.fq))
         .a("torchflower", cc.a.a(cte.kA))
         .a("pitcher_pod", cc.a.a(cte.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cjo.oI,
            tl.c("advancements.husbandry.breed_an_animal.title"),
            tl.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cjo.nF, tl.c("advancements.husbandry.balanced_diet.title"), tl.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cjo.oA, tl.c("advancements.husbandry.netherite_hoe.title"), tl.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(cjo.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cjo.tQ,
            tl.c("advancements.husbandry.tame_an_animal.title"),
            tl.c("advancements.husbandry.tame_an_animal.description"),
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
            cjo.qh,
            tl.c("advancements.husbandry.fishy_business.title"),
            tl.c("advancements.husbandry.fishy_business.description"),
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
            cjo.pR,
            tl.c("advancements.husbandry.tactical_fishing.title"),
            tl.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jb.i.b(cjo.pV).a(), bu.a.a(cb.a.a().a(cjo.pV)))
         .a(
            cjo.pV,
            tl.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            tl.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bja.f)))
         .a(
            cjo.pU,
            tl.c("advancements.husbandry.kill_axolotl_target.title"),
            tl.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cjo.ql,
            tl.c("advancements.husbandry.complete_catalogue.title"),
            tl.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(apv.aF)).a(true), cb.a.a().a(cjo.rw)))
         .a(
            cjo.vD,
            tl.c("advancements.husbandry.safely_harvest_honey.title"),
            tl.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjo.vA, tl.c("advancements.husbandry.wax_on.title"), tl.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(cja.a.get().keySet())), cb.a.a().a(cjo.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cjo.of, tl.c("advancements.husbandry.wax_off.title"), tl.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(cja.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jb.i.b(cjo.pW).a(), bu.a.a(cb.a.a().a(cjo.pW)))
         .a(
            cjo.pW,
            tl.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            tl.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cjo.tQ,
            tl.c("advancements.husbandry.leash_all_frog_variants.title"),
            tl.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cjo.wr, tl.c("advancements.husbandry.froglights.title"), tl.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(cjo.wq, cjo.ws, cjo.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cte.pe, cb.a.a().a(new bl(cny.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            cte.pe,
            tl.c("advancements.husbandry.silk_touch_nest.title"),
            tl.c("advancements.husbandry.silk_touch_nest.description"),
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
            cjo.ni,
            tl.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            tl.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bja.k).b(bq.a.a().a(bja.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cjo.qs,
            tl.c("advancements.husbandry.make_a_sign_glow.title"),
            tl.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(apv.aA)), cb.a.a().a(cjo.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cjo.re,
            tl.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            tl.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bja.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cjo.lJ,
            tl.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            tl.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(cte.aY)), cb.a.a().a(cjo.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cjo.jU,
            tl.c("advancements.husbandry.obtain_sniffer_egg.title"),
            tl.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(cjo.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cjo.uo, tl.c("advancements.husbandry.feed_snifflet.title"), tl.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(aqd.aK), Optional.of(bq.a(bq.a.a().a(bja.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cjo.up,
            tl.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            tl.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(cte.kA))
         .a("pitcher_pod", cc.a.a(cte.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bja<?>> $$2, Stream<bja<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cjo.tq,
            tl.c("advancements.husbandry.breed_all_animals.title"),
            tl.c("advancements.husbandry.breed_all_animals.description"),
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
      jb.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(cjo.tQ), Optional.of(bq.a(bq.a.a().a(bja.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cjg $$1 : e) {
         $$0.a(jb.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bja<?>> $$1, Stream<bja<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bja.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bja.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cjg $$1 : d) {
         $$0.a(jb.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cjg $$1 : c) {
         $$0.a(jb.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jb.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aey::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
