import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ku implements ko {
   public static final List<blz<?>> a = List.of(
      blz.Z,
      blz.x,
      blz.aq,
      blz.aG,
      blz.u,
      blz.ap,
      blz.aw,
      blz.r,
      blz.bp,
      blz.ar,
      blz.aD,
      blz.ak,
      blz.n,
      blz.at,
      blz.O,
      blz.h,
      blz.X,
      blz.aW,
      blz.V,
      blz.f,
      blz.m
   );
   public static final List<blz<?>> b = List.of(blz.be, blz.P, blz.aO);
   private static final cmt[] c = new cmt[]{cnb.qW, cnb.qY, cnb.qZ, cnb.qX};
   private static final cmt[] d = new cmt[]{cnb.qE, cnb.qF, cnb.qC, cnb.qD};
   private static final cmt[] e = new cmt[]{
      cnb.oq,
      cnb.po,
      cnb.pu,
      cnb.pU,
      cnb.pV,
      cnb.pX,
      cnb.pY,
      cnb.qW,
      cnb.qX,
      cnb.qY,
      cnb.qZ,
      cnb.ra,
      cnb.rb,
      cnb.rP,
      cnb.rT,
      cnb.rX,
      cnb.rY,
      cnb.rZ,
      cnb.sa,
      cnb.sb,
      cnb.sj,
      cnb.tY,
      cnb.tZ,
      cnb.ua,
      cnb.ub,
      cnb.ud,
      cnb.um,
      cnb.ut,
      cnb.uu,
      cnb.uv,
      cnb.uG,
      cnb.uH,
      cnb.uZ,
      cnb.vd,
      cnb.vf,
      cnb.rU,
      cnb.vN,
      cnb.wi,
      cnb.wq,
      cnb.wj
   };
   private static final cmt[] f = new cmt[]{cnb.oL, cnb.oV, cnb.oQ, cnb.pa, cnb.pf, cnb.pk};

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cws.ij,
            vf.c("advancements.husbandry.root.title"),
            vf.c("advancements.husbandry.root.description"),
            new ahg("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", ba.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnb.pt, vf.c("advancements.husbandry.plant_seed.title"), vf.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cb.a.a(cws.cB))
         .a("pumpkin_stem", cb.a.a(cws.fd))
         .a("melon_stem", cb.a.a(cws.fe))
         .a("beetroots", cb.a.a(cws.kD))
         .a("nether_wart", cb.a.a(cws.fq))
         .a("torchflower", cb.a.a(cws.kA))
         .a("pitcher_pod", cb.a.a(cws.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cnb.pt,
            vf.c("advancements.husbandry.breed_an_animal.title"),
            vf.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cnb.oq, vf.c("advancements.husbandry.balanced_diet.title"), vf.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cnb.pl, vf.c("advancements.husbandry.netherite_hoe.title"), vf.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", by.a.a(cnb.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cnb.uD,
            vf.c("advancements.husbandry.tame_an_animal.title"),
            vf.c("advancements.husbandry.tame_an_animal.description"),
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
            cnb.qS,
            vf.c("advancements.husbandry.fishy_business.title"),
            vf.c("advancements.husbandry.fishy_business.description"),
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
            cnb.qC,
            vf.c("advancements.husbandry.tactical_fishing.title"),
            vf.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kd.h.b(cnb.qG).a(), bt.a.a(ca.a.a().a(cnb.qG)))
         .a(
            cnb.qG,
            vf.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vf.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bi.a.a(bp.a.a().a(blz.f)))
         .a(
            cnb.qF,
            vf.c("advancements.husbandry.kill_axolotl_target.title"),
            vf.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cnb.qW,
            vf.c("advancements.husbandry.complete_catalogue.title"),
            vf.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cb.a.a(ci.a.a().a(au.a.a().a(ash.aF)).a(true), ca.a.a().a(cnb.si)))
         .a(
            cnb.wq,
            vf.c("advancements.husbandry.safely_harvest_honey.title"),
            vf.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cnb.wn, vf.c("advancements.husbandry.wax_on.title"), vf.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cb.a.a(ci.a.a().a(au.a.a().a(cmn.a.get().keySet())), ca.a.a().a(cnb.wn)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cnb.oQ, vf.c("advancements.husbandry.wax_off.title"), vf.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cb.a.a(ci.a.a().a(au.a.a().a(cmn.b.get().keySet())), ca.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kd.h.b(cnb.qH).a(), bt.a.a(ca.a.a().a(cnb.qH)))
         .a(
            cnb.qH,
            vf.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vf.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cnb.uD,
            vf.c("advancements.husbandry.leash_all_frog_variants.title"),
            vf.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cnb.xe, vf.c("advancements.husbandry.froglights.title"), vf.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", by.a.a(cnb.xd, cnb.xf, cnb.xe))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", at.a.a(cws.pe, ca.a.a().a(new bk(crn.v, ck.d.b(1))), ck.d.a(3)))
         .a(
            cws.pe,
            vf.c("advancements.husbandry.silk_touch_nest.title"),
            vf.c("advancements.husbandry.silk_touch_nest.description"),
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
            cnb.nT,
            vf.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vf.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bp.a.a().a(bp.a.a().a(blz.k).b(bp.a.a().a(blz.V)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cnb.rd,
            vf.c("advancements.husbandry.make_a_sign_glow.title"),
            vf.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cb.a.a(ci.a.a().a(au.a.a().a(ash.aA)), ca.a.a().a(cnb.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cnb.rP,
            vf.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vf.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cn.a.a(Optional.empty(), Optional.empty(), Optional.of(bp.a(bp.a.a().a(blz.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cnb.me,
            vf.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vf.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cb.a.b(ci.a.a().a(au.a.a().a(cws.aY)), ca.a.a().a(cnb.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cnb.kp,
            vf.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vf.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", by.a.a(cnb.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cnb.vb, vf.c("advancements.husbandry.feed_snifflet.title"), vf.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cp.a.a(ca.a.a().a(asp.aK), Optional.of(bp.a(bp.a.a().a(blz.aO).a(bn.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cnb.vc,
            vf.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vf.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cb.a.a(cws.kA))
         .a("pitcher_pod", cb.a.a(cws.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<blz<?>> $$2, Stream<blz<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cnb.ud,
            vf.c("advancements.husbandry.breed_all_animals.title"),
            vf.c("advancements.husbandry.breed_all_animals.description"),
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
      kd.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cp.a.a(ca.a.a().a(cnb.uD), Optional.of(bp.a(bp.a.a().a(blz.P).a(bq.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cmt $$1 : e) {
         $$0.a(kd.h.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<blz<?>> $$1, Stream<blz<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(blz.a($$1x).toString(), av.a.a(bp.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(blz.a($$1x).toString(), av.a.a(Optional.of(bp.a.a().a($$1x).b()), Optional.of(bp.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cmt $$1 : d) {
         $$0.a(kd.h.b($$1).a(), bt.a.a(ca.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cmt $$1 : c) {
         $$0.a(kd.h.b($$1).a(), bv.a.a(Optional.empty(), Optional.empty(), Optional.of(ca.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kd.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ahf::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bp.a.a().a(bq.a($$1.getValue())))));
      return $$0;
   }
}
