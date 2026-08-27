import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class js implements jo {
   public static final List<bip<?>> a = List.of(
      bip.Y,
      bip.w,
      bip.ap,
      bip.aF,
      bip.t,
      bip.ao,
      bip.av,
      bip.q,
      bip.bn,
      bip.aq,
      bip.aC,
      bip.aj,
      bip.m,
      bip.as,
      bip.N,
      bip.h,
      bip.W,
      bip.aV,
      bip.U,
      bip.f,
      bip.l
   );
   public static final List<bip<?>> b = List.of(bip.bd, bip.O, bip.aN);
   private static final civ[] c = new civ[]{cjd.ql, cjd.qn, cjd.qo, cjd.qm};
   private static final civ[] d = new civ[]{cjd.pT, cjd.pU, cjd.pR, cjd.pS};
   private static final civ[] e = new civ[]{
      cjd.nF,
      cjd.oD,
      cjd.oJ,
      cjd.pj,
      cjd.pk,
      cjd.pm,
      cjd.pn,
      cjd.ql,
      cjd.qm,
      cjd.qn,
      cjd.qo,
      cjd.qp,
      cjd.qq,
      cjd.re,
      cjd.rh,
      cjd.rl,
      cjd.rm,
      cjd.rn,
      cjd.ro,
      cjd.rp,
      cjd.rx,
      cjd.tl,
      cjd.tm,
      cjd.tn,
      cjd.to,
      cjd.tq,
      cjd.tz,
      cjd.tG,
      cjd.tH,
      cjd.tI,
      cjd.tT,
      cjd.tU,
      cjd.um,
      cjd.uq,
      cjd.us,
      cjd.ri,
      cjd.va,
      cjd.vv,
      cjd.vD,
      cjd.vw
   };
   private static final civ[] f = new civ[]{cjd.oa, cjd.ok, cjd.of, cjd.op, cjd.ou, cjd.oz};

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csr.ij,
            ti.c("advancements.husbandry.root.title"),
            ti.c("advancements.husbandry.root.description"),
            new aeu("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjd.oI, ti.c("advancements.husbandry.plant_seed.title"), ti.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(csr.cB))
         .a("pumpkin_stem", cc.a.a(csr.fd))
         .a("melon_stem", cc.a.a(csr.fe))
         .a("beetroots", cc.a.a(csr.kD))
         .a("nether_wart", cc.a.a(csr.fq))
         .a("torchflower", cc.a.a(csr.kA))
         .a("pitcher_pod", cc.a.a(csr.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cjd.oI,
            ti.c("advancements.husbandry.breed_an_animal.title"),
            ti.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cjd.nF, ti.c("advancements.husbandry.balanced_diet.title"), ti.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cjd.oA, ti.c("advancements.husbandry.netherite_hoe.title"), ti.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(cjd.oA))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cjd.tQ,
            ti.c("advancements.husbandry.tame_an_animal.title"),
            ti.c("advancements.husbandry.tame_an_animal.description"),
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
            cjd.qh,
            ti.c("advancements.husbandry.fishy_business.title"),
            ti.c("advancements.husbandry.fishy_business.description"),
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
            cjd.pR,
            ti.c("advancements.husbandry.tactical_fishing.title"),
            ti.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(jd.i.b(cjd.pV).a(), bu.a.a(cb.a.a().a(cjd.pV)))
         .a(
            cjd.pV,
            ti.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            ti.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bip.f)))
         .a(
            cjd.pU,
            ti.c("advancements.husbandry.kill_axolotl_target.title"),
            ti.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cjd.ql,
            ti.c("advancements.husbandry.complete_catalogue.title"),
            ti.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(apo.aF)).a(true), cb.a.a().a(cjd.rw)))
         .a(
            cjd.vD,
            ti.c("advancements.husbandry.safely_harvest_honey.title"),
            ti.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjd.vA, ti.c("advancements.husbandry.wax_on.title"), ti.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(cip.a.get().keySet())), cb.a.a().a(cjd.vA)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cjd.of, ti.c("advancements.husbandry.wax_off.title"), ti.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(cip.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jd.i.b(cjd.pW).a(), bu.a.a(cb.a.a().a(cjd.pW)))
         .a(
            cjd.pW,
            ti.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            ti.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cjd.tQ,
            ti.c("advancements.husbandry.leash_all_frog_variants.title"),
            ti.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cjd.wr, ti.c("advancements.husbandry.froglights.title"), ti.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(cjd.wq, cjd.ws, cjd.wr))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(csr.pe, cb.a.a().a(new bl(cnn.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            csr.pe,
            ti.c("advancements.husbandry.silk_touch_nest.title"),
            ti.c("advancements.husbandry.silk_touch_nest.description"),
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
            cjd.ni,
            ti.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ti.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bip.k).b(bq.a.a().a(bip.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cjd.qs,
            ti.c("advancements.husbandry.make_a_sign_glow.title"),
            ti.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(apo.aA)), cb.a.a().a(cjd.qs)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cjd.re,
            ti.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ti.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bip.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cjd.lJ,
            ti.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ti.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(csr.aY)), cb.a.a().a(cjd.qN)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cjd.jU,
            ti.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ti.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(cjd.jU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cjd.uo, ti.c("advancements.husbandry.feed_snifflet.title"), ti.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(apw.aK), Optional.of(bq.a(bq.a.a().a(bip.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cjd.up,
            ti.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ti.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(csr.kA))
         .a("pitcher_pod", cc.a.a(csr.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bip<?>> $$2, Stream<bip<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cjd.tq,
            ti.c("advancements.husbandry.breed_all_animals.title"),
            ti.c("advancements.husbandry.breed_all_animals.description"),
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
      jd.ak.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(cjd.tQ), Optional.of(bq.a(bq.a.a().a(bip.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (civ $$1 : e) {
         $$0.a(jd.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bip<?>> $$1, Stream<bip<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bip.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bip.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (civ $$1 : d) {
         $$0.a(jd.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (civ $$1 : c) {
         $$0.a(jd.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jd.aj
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aet::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
