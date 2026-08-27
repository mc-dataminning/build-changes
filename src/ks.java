import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ks implements ko {
   public static final List<blt<?>> a = List.of(
      blt.Z,
      blt.x,
      blt.aq,
      blt.aG,
      blt.u,
      blt.ap,
      blt.aw,
      blt.r,
      blt.bp,
      blt.ar,
      blt.aD,
      blt.ak,
      blt.n,
      blt.at,
      blt.O,
      blt.h,
      blt.X,
      blt.aW,
      blt.V,
      blt.f,
      blt.m
   );
   public static final List<blt<?>> b = List.of(blt.be, blt.P, blt.aO);
   private static final cmm[] c = new cmm[]{cmu.qW, cmu.qY, cmu.qZ, cmu.qX};
   private static final cmm[] d = new cmm[]{cmu.qE, cmu.qF, cmu.qC, cmu.qD};
   private static final cmm[] e = new cmm[]{
      cmu.oq,
      cmu.po,
      cmu.pu,
      cmu.pU,
      cmu.pV,
      cmu.pX,
      cmu.pY,
      cmu.qW,
      cmu.qX,
      cmu.qY,
      cmu.qZ,
      cmu.ra,
      cmu.rb,
      cmu.rP,
      cmu.rT,
      cmu.rX,
      cmu.rY,
      cmu.rZ,
      cmu.sa,
      cmu.sb,
      cmu.sj,
      cmu.tY,
      cmu.tZ,
      cmu.ua,
      cmu.ub,
      cmu.ud,
      cmu.um,
      cmu.ut,
      cmu.uu,
      cmu.uv,
      cmu.uG,
      cmu.uH,
      cmu.uZ,
      cmu.vd,
      cmu.vf,
      cmu.rU,
      cmu.vN,
      cmu.wi,
      cmu.wq,
      cmu.wj
   };
   private static final cmm[] f = new cmm[]{cmu.oL, cmu.oV, cmu.oQ, cmu.pa, cmu.pf, cmu.pk};

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwl.ij,
            vd.c("advancements.husbandry.root.title"),
            vd.c("advancements.husbandry.root.description"),
            new ahd("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", ba.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmu.pt, vd.c("advancements.husbandry.plant_seed.title"), vd.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cb.a.a(cwl.cB))
         .a("pumpkin_stem", cb.a.a(cwl.fd))
         .a("melon_stem", cb.a.a(cwl.fe))
         .a("beetroots", cb.a.a(cwl.kD))
         .a("nether_wart", cb.a.a(cwl.fq))
         .a("torchflower", cb.a.a(cwl.kA))
         .a("pitcher_pod", cb.a.a(cwl.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cmu.pt,
            vd.c("advancements.husbandry.breed_an_animal.title"),
            vd.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", av.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(cmu.oq, vd.c("advancements.husbandry.balanced_diet.title"), vd.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cmu.pl, vd.c("advancements.husbandry.netherite_hoe.title"), vd.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", by.a.a(cmu.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cmu.uD,
            vd.c("advancements.husbandry.tame_an_animal.title"),
            vd.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dc.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            cmu.qS,
            vd.c("advancements.husbandry.fishy_business.title"),
            vd.c("advancements.husbandry.fishy_business.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      af $$7 = c(ae.a.a())
         .a($$6)
         .a(ai.a.b)
         .a(
            cmu.qC,
            vd.c("advancements.husbandry.tactical_fishing.title"),
            vd.c("advancements.husbandry.tactical_fishing.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      af $$8 = ae.a.a()
         .a($$7)
         .a(ai.a.b)
         .a(kd.h.b(cmu.qG).a(), bt.a.a(ca.a.a().a(cmu.qG)))
         .a(
            cmu.qG,
            vd.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vd.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bi.a.a(bp.a.a().a(blt.f)))
         .a(
            cmu.qF,
            vd.c("advancements.husbandry.kill_axolotl_target.title"),
            vd.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$5)
         .a(
            cmu.qW,
            vd.c("advancements.husbandry.complete_catalogue.title"),
            vd.c("advancements.husbandry.complete_catalogue.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", cb.a.a(ci.a.a().a(au.a.a().a(asb.aF)).a(true), ca.a.a().a(cmu.si)))
         .a(
            cmu.wq,
            vd.c("advancements.husbandry.safely_harvest_honey.title"),
            vd.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cmu.wn, vd.c("advancements.husbandry.wax_on.title"), vd.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cb.a.a(ci.a.a().a(au.a.a().a(cmg.a.get().keySet())), ca.a.a().a(cmu.wn)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cmu.oQ, vd.c("advancements.husbandry.wax_off.title"), vd.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cb.a.a(ci.a.a().a(au.a.a().a(cmg.b.get().keySet())), ca.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kd.h.b(cmu.qH).a(), bt.a.a(ca.a.a().a(cmu.qH)))
         .a(
            cmu.qH,
            vd.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vd.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      af $$12 = a(ae.a.a())
         .a($$11)
         .a(
            cmu.uD,
            vd.c("advancements.husbandry.leash_all_frog_variants.title"),
            vd.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cmu.xe, vd.c("advancements.husbandry.froglights.title"), vd.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", by.a.a(cmu.xd, cmu.xf, cmu.xe))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", at.a.a(cwl.pe, ca.a.a().a(new bk(crg.v, ck.d.b(1))), ck.d.a(3)))
         .a(
            cwl.pe,
            vd.c("advancements.husbandry.silk_touch_nest.title"),
            vd.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$2)
         .a(
            cmu.nT,
            vd.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vd.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bp.a.a().a(bp.a.a().a(blt.k).b(bp.a.a().a(blt.V)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cmu.rd,
            vd.c("advancements.husbandry.make_a_sign_glow.title"),
            vd.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cb.a.a(ci.a.a().a(au.a.a().a(asb.aA)), ca.a.a().a(cmu.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cmu.rP,
            vd.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vd.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cn.a.a(Optional.empty(), Optional.empty(), Optional.of(bp.a(bp.a.a().a(blt.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cmu.me,
            vd.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vd.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cb.a.b(ci.a.a().a(au.a.a().a(cwl.aY)), ca.a.a().a(cmu.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cmu.kp,
            vd.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vd.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", by.a.a(cmu.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cmu.vb, vd.c("advancements.husbandry.feed_snifflet.title"), vd.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cp.a.a(ca.a.a().a(asj.aK), Optional.of(bp.a(bp.a.a().a(blt.aO).a(bn.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cmu.vc,
            vd.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vd.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cb.a.a(cwl.kA))
         .a("pitcher_pod", cb.a.a(cwl.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<blt<?>> $$2, Stream<blt<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cmu.ud,
            vd.c("advancements.husbandry.breed_all_animals.title"),
            vd.c("advancements.husbandry.breed_all_animals.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ae.a a(ae.a $$0) {
      kd.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cp.a.a(ca.a.a().a(cmu.uD), Optional.of(bp.a(bp.a.a().a(blt.P).a(bq.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cmm $$1 : e) {
         $$0.a(kd.h.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<blt<?>> $$1, Stream<blt<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(blt.a($$1x).toString(), av.a.a(bp.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(blt.a($$1x).toString(), av.a.a(Optional.of(bp.a.a().a($$1x).b()), Optional.of(bp.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cmm $$1 : d) {
         $$0.a(kd.h.b($$1).a(), bt.a.a(ca.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cmm $$1 : c) {
         $$0.a(kd.h.b($$1).a(), bv.a.a(Optional.empty(), Optional.empty(), Optional.of(ca.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kd.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ahc::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bp.a.a().a(bq.a($$1.getValue())))));
      return $$0;
   }
}
