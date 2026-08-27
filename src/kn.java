import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kn implements kj {
   public static final List<bku<?>> a = List.of(
      bku.Y,
      bku.w,
      bku.ap,
      bku.aF,
      bku.t,
      bku.ao,
      bku.av,
      bku.q,
      bku.bn,
      bku.aq,
      bku.aC,
      bku.aj,
      bku.m,
      bku.as,
      bku.N,
      bku.h,
      bku.W,
      bku.aV,
      bku.U,
      bku.f,
      bku.l
   );
   public static final List<bku<?>> b = List.of(bku.bd, bku.O, bku.aN);
   private static final cle[] c = new cle[]{clm.qW, clm.qY, clm.qZ, clm.qX};
   private static final cle[] d = new cle[]{clm.qE, clm.qF, clm.qC, clm.qD};
   private static final cle[] e = new cle[]{
      clm.oq,
      clm.po,
      clm.pu,
      clm.pU,
      clm.pV,
      clm.pX,
      clm.pY,
      clm.qW,
      clm.qX,
      clm.qY,
      clm.qZ,
      clm.ra,
      clm.rb,
      clm.rP,
      clm.rT,
      clm.rX,
      clm.rY,
      clm.rZ,
      clm.sa,
      clm.sb,
      clm.sj,
      clm.tX,
      clm.tY,
      clm.tZ,
      clm.ua,
      clm.uc,
      clm.ul,
      clm.us,
      clm.ut,
      clm.uu,
      clm.uF,
      clm.uG,
      clm.uY,
      clm.vc,
      clm.ve,
      clm.rU,
      clm.vM,
      clm.wh,
      clm.wp,
      clm.wi
   };
   private static final cle[] f = new cle[]{clm.oL, clm.oV, clm.oQ, clm.pa, clm.pf, clm.pk};

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvc.ij,
            ur.c("advancements.husbandry.root.title"),
            ur.c("advancements.husbandry.root.description"),
            new agi("textures/gui/advancements/backgrounds/husbandry.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.c())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(clm.pt, ur.c("advancements.husbandry.plant_seed.title"), ur.c("advancements.husbandry.plant_seed.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cc.a.a(cvc.cB))
         .a("pumpkin_stem", cc.a.a(cvc.fd))
         .a("melon_stem", cc.a.a(cvc.fe))
         .a("beetroots", cc.a.a(cvc.kD))
         .a("nether_wart", cc.a.a(cvc.fq))
         .a("torchflower", cc.a.a(cvc.kA))
         .a("pitcher_pod", cc.a.a(cvc.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            clm.pt,
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
         .a(clm.oq, ur.c("advancements.husbandry.balanced_diet.title"), ur.c("advancements.husbandry.balanced_diet.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(clm.pl, ur.c("advancements.husbandry.netherite_hoe.title"), ur.c("advancements.husbandry.netherite_hoe.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", bz.a.a(clm.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            clm.uC,
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
            clm.qS,
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
            clm.qC,
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
         .a(jy.i.b(clm.qG).a(), bu.a.a(cb.a.a().a(clm.qG)))
         .a(
            clm.qG,
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
         .a("kill_axolotl_target", bj.a.a(bq.a.a().a(bku.f)))
         .a(
            clm.qF,
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
            clm.qW,
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
         .a("safely_harvest_honey", cc.a.a(cj.a.a().a(av.a.a().a(arg.aF)).a(true), cb.a.a().a(clm.si)))
         .a(
            clm.wp,
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
         .a(clm.wm, ur.c("advancements.husbandry.wax_on.title"), ur.c("advancements.husbandry.wax_on.description"), null, ar.a, true, true, false)
         .a("wax_on", cc.a.a(cj.a.a().a(av.a.a().a(cky.a.get().keySet())), cb.a.a().a(clm.wm)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(clm.oQ, ur.c("advancements.husbandry.wax_off.title"), ur.c("advancements.husbandry.wax_off.description"), null, ar.a, true, true, false)
         .a("wax_off", cc.a.a(cj.a.a().a(av.a.a().a(cky.b.get().keySet())), cb.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(jy.i.b(clm.qH).a(), bu.a.a(cb.a.a().a(clm.qH)))
         .a(
            clm.qH,
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
            clm.uC,
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
         .a(clm.xd, ur.c("advancements.husbandry.froglights.title"), ur.c("advancements.husbandry.froglights.description"), null, ar.b, true, true, false)
         .a("froglights", bz.a.a(clm.xc, clm.xe, clm.xd))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cvc.pe, cb.a.a().a(new bl(cpy.v, cl.d.b(1))), cl.d.a(3)))
         .a(
            cvc.pe,
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
            clm.nT,
            ur.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ur.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cz.a.a(bq.a.a().a(bq.a.a().a(bku.k).b(bq.a.a().a(bku.U)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            clm.rd,
            ur.c("advancements.husbandry.make_a_sign_glow.title"),
            ur.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cc.a.a(cj.a.a().a(av.a.a().a(arg.aA)), cb.a.a().a(clm.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            clm.rP,
            ur.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ur.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", co.a.a(Optional.empty(), Optional.empty(), Optional.of(bq.a(bq.a.a().a(bku.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            clm.me,
            ur.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ur.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cc.a.b(cj.a.a().a(av.a.a().a(cvc.aY)), cb.a.a().a(clm.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            clm.kp,
            ur.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ur.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", bz.a.a(clm.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(clm.va, ur.c("advancements.husbandry.feed_snifflet.title"), ur.c("advancements.husbandry.feed_snifflet.description"), null, ar.a, true, true, true)
         .a("feed_snifflet", cq.a.a(cb.a.a().a(aro.aK), Optional.of(bq.a(bq.a.a().a(bku.aN).a(bo.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            clm.vb,
            ur.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ur.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cc.a.a(cvc.kA))
         .a("pitcher_pod", cc.a.a(cvc.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bku<?>> $$2, Stream<bku<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            clm.uc,
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
      jy.am.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cq.a.a(cb.a.a().a(clm.uC), Optional.of(bq.a(bq.a.a().a(bku.O).a(br.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cle $$1 : e) {
         $$0.a(jy.i.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bku<?>> $$1, Stream<bku<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bku.a($$1x).toString(), aw.a.a(bq.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bku.a($$1x).toString(), aw.a.a(Optional.of(bq.a.a().a($$1x).b()), Optional.of(bq.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cle $$1 : d) {
         $$0.a(jy.i.b($$1).a(), bu.a.a(cb.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cle $$1 : c) {
         $$0.a(jy.i.b($$1).a(), bw.a.a(Optional.empty(), Optional.empty(), Optional.of(cb.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      jy.al
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(agh::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dd.a.a(bq.a.a().a(br.a($$1.getValue())))));
      return $$0;
   }
}
