import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kn implements kj {
   public static final List<bkm<?>> a = List.of(
      bkm.Y,
      bkm.w,
      bkm.ap,
      bkm.aF,
      bkm.t,
      bkm.ao,
      bkm.av,
      bkm.q,
      bkm.bn,
      bkm.aq,
      bkm.aC,
      bkm.aj,
      bkm.m,
      bkm.as,
      bkm.N,
      bkm.h,
      bkm.W,
      bkm.aV,
      bkm.U,
      bkm.f,
      bkm.l
   );
   public static final List<bkm<?>> b = List.of(bkm.bd, bkm.O, bkm.aN);
   private static final ckw[] c = new ckw[]{cle.ql, cle.qn, cle.qo, cle.qm};
   private static final ckw[] d = new ckw[]{cle.pT, cle.pU, cle.pR, cle.pS};
   private static final ckw[] e = new ckw[]{
      cle.nF,
      cle.oD,
      cle.oJ,
      cle.pj,
      cle.pk,
      cle.pm,
      cle.pn,
      cle.ql,
      cle.qm,
      cle.qn,
      cle.qo,
      cle.qp,
      cle.qq,
      cle.re,
      cle.ri,
      cle.rm,
      cle.rn,
      cle.ro,
      cle.rp,
      cle.rq,
      cle.ry,
      cle.tm,
      cle.tn,
      cle.to,
      cle.tp,
      cle.tr,
      cle.tA,
      cle.tH,
      cle.tI,
      cle.tJ,
      cle.tU,
      cle.tV,
      cle.un,
      cle.ur,
      cle.ut,
      cle.rj,
      cle.vb,
      cle.vw,
      cle.vE,
      cle.vx
   };
   private static final ckw[] f = new ckw[]{cle.oa, cle.ok, cle.of, cle.op, cle.ou, cle.oz};

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuv.ij,
            ur.c("advancements.husbandry.root.title"),
            ur.c("advancements.husbandry.root.description"),
            new agg("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cle.oI, ur.c("advancements.husbandry.plant_seed.title"), ur.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(cuv.cB))
         .a("pumpkin_stem", cc.a.a(cuv.fd))
         .a("melon_stem", cc.a.a(cuv.fe))
         .a("beetroots", cc.a.a(cuv.kD))
         .a("nether_wart", cc.a.a(cuv.fq))
         .a("torchflower", cc.a.a(cuv.kA))
         .a("pitcher_pod", cc.a.a(cuv.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cle.oI,
            ur.c("advancements.husbandry.breed_an_animal.title"),
            ur.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cle.nF, ur.c("advancements.husbandry.balanced_diet.title"), ur.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cle.oA, ur.c("advancements.husbandry.netherite_hoe.title"), ur.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(cle.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cle.tR,
            ur.c("advancements.husbandry.tame_an_animal.title"),
            ur.c("advancements.husbandry.tame_an_animal.description"),
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
            cle.qh,
            ur.c("advancements.husbandry.fishy_business.title"),
            ur.c("advancements.husbandry.fishy_business.description"),
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
            cle.pR,
            ur.c("advancements.husbandry.tactical_fishing.title"),
            ur.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jy.i.b(cle.pV).a(), bu.a.a(cb.a.a().a(cle.pV)))
         .a(
            cle.pV,
            ur.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            ur.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bkm.f)))
         .a(
            cle.pU,
            ur.c("advancements.husbandry.kill_axolotl_target.title"),
            ur.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cle.ql,
            ur.c("advancements.husbandry.complete_catalogue.title"),
            ur.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(arc.aF)).a(true), cb.a.a().a(cle.rx)))
         .a(
            cle.vE,
            ur.c("advancements.husbandry.safely_harvest_honey.title"),
            ur.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cle.vB, ur.c("advancements.husbandry.wax_on.title"), ur.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(ckq.a.get().keySet())), cb.a.a().a(cle.vB)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cle.of, ur.c("advancements.husbandry.wax_off.title"), ur.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(ckq.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jy.i.b(cle.pW).a(), bu.a.a(cb.a.a().a(cle.pW)))
         .a(
            cle.pW,
            ur.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            ur.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cle.tR,
            ur.c("advancements.husbandry.leash_all_frog_variants.title"),
            ur.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cle.ws, ur.c("advancements.husbandry.froglights.title"), ur.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(cle.wr, cle.wt, cle.ws))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cuv.pe, cb.a.a().a(new bl(cpq.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            cuv.pe,
            ur.c("advancements.husbandry.silk_touch_nest.title"),
            ur.c("advancements.husbandry.silk_touch_nest.description"),
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
            cle.ni,
            ur.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ur.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bkm.k).b(bq.a.a().a(bkm.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cle.qs,
            ur.c("advancements.husbandry.make_a_sign_glow.title"),
            ur.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(arc.aA)), cb.a.a().a(cle.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cle.re,
            ur.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ur.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bkm.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cle.lJ,
            ur.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ur.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(cuv.aY)), cb.a.a().a(cle.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cle.jU,
            ur.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ur.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(cle.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cle.up, ur.c("advancements.husbandry.feed_snifflet.title"), ur.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(ark.aK), Optional.of(bq.a(bq.a.a().a(bkm.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cle.uq,
            ur.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ur.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(cuv.kA))
         .a("pitcher_pod", cc.a.a(cuv.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bkm<?>> $$2, Stream<bkm<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cle.tr,
            ur.c("advancements.husbandry.breed_all_animals.title"),
            ur.c("advancements.husbandry.breed_all_animals.description"),
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
      jy.am.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(cle.tR), Optional.of(bq.a(bq.a.a().a(bkm.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (ckw $$1 : e) {
         $$0.a(jy.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bkm<?>> $$1, Stream<bkm<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bkm.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bkm.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (ckw $$1 : d) {
         $$0.a(jy.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (ckw $$1 : c) {
         $$0.a(jy.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jy.al
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(agf::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
