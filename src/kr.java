import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kr implements kn {
   public static final List<bkz<?>> a = List.of(
      bkz.Y,
      bkz.w,
      bkz.ap,
      bkz.aF,
      bkz.t,
      bkz.ao,
      bkz.av,
      bkz.q,
      bkz.bn,
      bkz.aq,
      bkz.aC,
      bkz.aj,
      bkz.m,
      bkz.as,
      bkz.N,
      bkz.h,
      bkz.W,
      bkz.aV,
      bkz.U,
      bkz.f,
      bkz.l
   );
   public static final List<bkz<?>> b = List.of(bkz.bd, bkz.O, bkz.aN);
   private static final clj[] c = new clj[]{clr.qW, clr.qY, clr.qZ, clr.qX};
   private static final clj[] d = new clj[]{clr.qE, clr.qF, clr.qC, clr.qD};
   private static final clj[] e = new clj[]{
      clr.oq,
      clr.po,
      clr.pu,
      clr.pU,
      clr.pV,
      clr.pX,
      clr.pY,
      clr.qW,
      clr.qX,
      clr.qY,
      clr.qZ,
      clr.ra,
      clr.rb,
      clr.rP,
      clr.rT,
      clr.rX,
      clr.rY,
      clr.rZ,
      clr.sa,
      clr.sb,
      clr.sj,
      clr.tX,
      clr.tY,
      clr.tZ,
      clr.ua,
      clr.uc,
      clr.ul,
      clr.us,
      clr.ut,
      clr.uu,
      clr.uF,
      clr.uG,
      clr.uY,
      clr.vc,
      clr.ve,
      clr.rU,
      clr.vM,
      clr.wh,
      clr.wp,
      clr.wi
   };
   private static final clj[] f = new clj[]{clr.oL, clr.oV, clr.oQ, clr.pa, clr.pf, clr.pk};

   @Override
   public void a(ii.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvh.ij,
            uv.c("advancements.husbandry.root.title"),
            uv.c("advancements.husbandry.root.description"),
            new agm("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(clr.pt, uv.c("advancements.husbandry.plant_seed.title"), uv.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(cvh.cB))
         .a("pumpkin_stem", cc.a.a(cvh.fd))
         .a("melon_stem", cc.a.a(cvh.fe))
         .a("beetroots", cc.a.a(cvh.kD))
         .a("nether_wart", cc.a.a(cvh.fq))
         .a("torchflower", cc.a.a(cvh.kA))
         .a("pitcher_pod", cc.a.a(cvh.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            clr.pt,
            uv.c("advancements.husbandry.breed_an_animal.title"),
            uv.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(clr.oq, uv.c("advancements.husbandry.balanced_diet.title"), uv.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(clr.pl, uv.c("advancements.husbandry.netherite_hoe.title"), uv.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(clr.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            clr.uC,
            uv.c("advancements.husbandry.tame_an_animal.title"),
            uv.c("advancements.husbandry.tame_an_animal.description"),
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
            clr.qS,
            uv.c("advancements.husbandry.fishy_business.title"),
            uv.c("advancements.husbandry.fishy_business.description"),
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
            clr.qC,
            uv.c("advancements.husbandry.tactical_fishing.title"),
            uv.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kc.i.b(clr.qG).a(), bu.a.a(cb.a.a().a(clr.qG)))
         .a(
            clr.qG,
            uv.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            uv.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bkz.f)))
         .a(
            clr.qF,
            uv.c("advancements.husbandry.kill_axolotl_target.title"),
            uv.c("advancements.husbandry.kill_axolotl_target.description"),
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
            clr.qW,
            uv.c("advancements.husbandry.complete_catalogue.title"),
            uv.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(ark.aF)).a(true), cb.a.a().a(clr.si)))
         .a(
            clr.wp,
            uv.c("advancements.husbandry.safely_harvest_honey.title"),
            uv.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(clr.wm, uv.c("advancements.husbandry.wax_on.title"), uv.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(cld.a.get().keySet())), cb.a.a().a(clr.wm)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(clr.oQ, uv.c("advancements.husbandry.wax_off.title"), uv.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(cld.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kc.i.b(clr.qH).a(), bu.a.a(cb.a.a().a(clr.qH)))
         .a(
            clr.qH,
            uv.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            uv.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            clr.uC,
            uv.c("advancements.husbandry.leash_all_frog_variants.title"),
            uv.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(clr.xd, uv.c("advancements.husbandry.froglights.title"), uv.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(clr.xc, clr.xe, clr.xd))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cvh.pe, cb.a.a().a(new bl(cqd.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            cvh.pe,
            uv.c("advancements.husbandry.silk_touch_nest.title"),
            uv.c("advancements.husbandry.silk_touch_nest.description"),
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
            clr.nT,
            uv.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            uv.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bkz.k).b(bq.a.a().a(bkz.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            clr.rd,
            uv.c("advancements.husbandry.make_a_sign_glow.title"),
            uv.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(ark.aA)), cb.a.a().a(clr.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            clr.rP,
            uv.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            uv.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bkz.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            clr.me,
            uv.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            uv.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(cvh.aY)), cb.a.a().a(clr.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            clr.kp,
            uv.c("advancements.husbandry.obtain_sniffer_egg.title"),
            uv.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(clr.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(clr.va, uv.c("advancements.husbandry.feed_snifflet.title"), uv.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(ars.aK), Optional.of(bq.a(bq.a.a().a(bkz.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            clr.vb,
            uv.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            uv.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(cvh.kA))
         .a("pitcher_pod", cc.a.a(cvh.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bkz<?>> $$2, Stream<bkz<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            clr.uc,
            uv.c("advancements.husbandry.breed_all_animals.title"),
            uv.c("advancements.husbandry.breed_all_animals.description"),
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
      kc.am.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(clr.uC), Optional.of(bq.a(bq.a.a().a(bkz.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (clj $$1 : e) {
         $$0.a(kc.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bkz<?>> $$1, Stream<bkz<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bkz.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bkz.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (clj $$1 : d) {
         $$0.a(kc.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (clj $$1 : c) {
         $$0.a(kc.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kc.al
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(agl::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
