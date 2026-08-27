import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ku implements ko {
   public static final List<bly<?>> a = List.of(
      bly.Z,
      bly.x,
      bly.aq,
      bly.aG,
      bly.u,
      bly.ap,
      bly.aw,
      bly.r,
      bly.bp,
      bly.ar,
      bly.aD,
      bly.ak,
      bly.n,
      bly.at,
      bly.O,
      bly.h,
      bly.X,
      bly.aW,
      bly.V,
      bly.f,
      bly.m
   );
   public static final List<bly<?>> b = List.of(bly.be, bly.P, bly.aO);
   private static final cms[] c = new cms[]{cna.qW, cna.qY, cna.qZ, cna.qX};
   private static final cms[] d = new cms[]{cna.qE, cna.qF, cna.qC, cna.qD};
   private static final cms[] e = new cms[]{
      cna.oq,
      cna.po,
      cna.pu,
      cna.pU,
      cna.pV,
      cna.pX,
      cna.pY,
      cna.qW,
      cna.qX,
      cna.qY,
      cna.qZ,
      cna.ra,
      cna.rb,
      cna.rP,
      cna.rT,
      cna.rX,
      cna.rY,
      cna.rZ,
      cna.sa,
      cna.sb,
      cna.sj,
      cna.tY,
      cna.tZ,
      cna.ua,
      cna.ub,
      cna.ud,
      cna.um,
      cna.ut,
      cna.uu,
      cna.uv,
      cna.uG,
      cna.uH,
      cna.uZ,
      cna.vd,
      cna.vf,
      cna.rU,
      cna.vN,
      cna.wi,
      cna.wq,
      cna.wj
   };
   private static final cms[] f = new cms[]{cna.oL, cna.oV, cna.oQ, cna.pa, cna.pf, cna.pk};

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwr.ij,
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
         .a(cna.pt, vf.c("advancements.husbandry.plant_seed.title"), vf.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cb.a.a(cwr.cB))
         .a("pumpkin_stem", cb.a.a(cwr.fd))
         .a("melon_stem", cb.a.a(cwr.fe))
         .a("beetroots", cb.a.a(cwr.kD))
         .a("nether_wart", cb.a.a(cwr.fq))
         .a("torchflower", cb.a.a(cwr.kA))
         .a("pitcher_pod", cb.a.a(cwr.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cna.pt,
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
         .a(cna.oq, vf.c("advancements.husbandry.balanced_diet.title"), vf.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cna.pl, vf.c("advancements.husbandry.netherite_hoe.title"), vf.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", by.a.a(cna.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cna.uD,
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
            cna.qS,
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
            cna.qC,
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
         .a(kd.h.b(cna.qG).a(), bt.a.a(ca.a.a().a(cna.qG)))
         .a(
            cna.qG,
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
         .a("kill_axolotl_target", bi.a.a(bp.a.a().a(bly.f)))
         .a(
            cna.qF,
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
            cna.qW,
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
         .a("safely_harvest_honey", cb.a.a(ci.a.a().a(au.a.a().a(asg.aF)).a(true), ca.a.a().a(cna.si)))
         .a(
            cna.wq,
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
         .a(cna.wn, vf.c("advancements.husbandry.wax_on.title"), vf.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cb.a.a(ci.a.a().a(au.a.a().a(cmm.a.get().keySet())), ca.a.a().a(cna.wn)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cna.oQ, vf.c("advancements.husbandry.wax_off.title"), vf.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cb.a.a(ci.a.a().a(au.a.a().a(cmm.b.get().keySet())), ca.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kd.h.b(cna.qH).a(), bt.a.a(ca.a.a().a(cna.qH)))
         .a(
            cna.qH,
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
            cna.uD,
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
         .a(cna.xe, vf.c("advancements.husbandry.froglights.title"), vf.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", by.a.a(cna.xd, cna.xf, cna.xe))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", at.a.a(cwr.pe, ca.a.a().a(new bk(crm.v, ck.d.b(1))), ck.d.a(3)))
         .a(
            cwr.pe,
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
            cna.nT,
            vf.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vf.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bp.a.a().a(bp.a.a().a(bly.k).b(bp.a.a().a(bly.V)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cna.rd,
            vf.c("advancements.husbandry.make_a_sign_glow.title"),
            vf.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cb.a.a(ci.a.a().a(au.a.a().a(asg.aA)), ca.a.a().a(cna.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cna.rP,
            vf.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vf.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cn.a.a(Optional.empty(), Optional.empty(), Optional.of(bp.a(bp.a.a().a(bly.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cna.me,
            vf.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vf.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cb.a.b(ci.a.a().a(au.a.a().a(cwr.aY)), ca.a.a().a(cna.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cna.kp,
            vf.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vf.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", by.a.a(cna.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cna.vb, vf.c("advancements.husbandry.feed_snifflet.title"), vf.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cp.a.a(ca.a.a().a(aso.aK), Optional.of(bp.a(bp.a.a().a(bly.aO).a(bn.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cna.vc,
            vf.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vf.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cb.a.a(cwr.kA))
         .a("pitcher_pod", cb.a.a(cwr.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bly<?>> $$2, Stream<bly<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cna.ud,
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
      kd.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cp.a.a(ca.a.a().a(cna.uD), Optional.of(bp.a(bp.a.a().a(bly.P).a(bq.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cms $$1 : e) {
         $$0.a(kd.h.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bly<?>> $$1, Stream<bly<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bly.a($$1x).toString(), av.a.a(bp.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bly.a($$1x).toString(), av.a.a(Optional.of(bp.a.a().a($$1x).b()), Optional.of(bp.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cms $$1 : d) {
         $$0.a(kd.h.b($$1).a(), bt.a.a(ca.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cms $$1 : c) {
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
