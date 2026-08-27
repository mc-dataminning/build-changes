import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kq implements km {
   public static final List<blj<?>> a = List.of(
      blj.Z,
      blj.x,
      blj.aq,
      blj.aG,
      blj.u,
      blj.ap,
      blj.aw,
      blj.r,
      blj.bp,
      blj.ar,
      blj.aD,
      blj.ak,
      blj.n,
      blj.at,
      blj.O,
      blj.h,
      blj.X,
      blj.aW,
      blj.V,
      blj.f,
      blj.m
   );
   public static final List<blj<?>> b = List.of(blj.be, blj.P, blj.aO);
   private static final cmc[] c = new cmc[]{cmk.qW, cmk.qY, cmk.qZ, cmk.qX};
   private static final cmc[] d = new cmc[]{cmk.qE, cmk.qF, cmk.qC, cmk.qD};
   private static final cmc[] e = new cmc[]{
      cmk.oq,
      cmk.po,
      cmk.pu,
      cmk.pU,
      cmk.pV,
      cmk.pX,
      cmk.pY,
      cmk.qW,
      cmk.qX,
      cmk.qY,
      cmk.qZ,
      cmk.ra,
      cmk.rb,
      cmk.rP,
      cmk.rT,
      cmk.rX,
      cmk.rY,
      cmk.rZ,
      cmk.sa,
      cmk.sb,
      cmk.sj,
      cmk.tY,
      cmk.tZ,
      cmk.ua,
      cmk.ub,
      cmk.ud,
      cmk.um,
      cmk.ut,
      cmk.uu,
      cmk.uv,
      cmk.uG,
      cmk.uH,
      cmk.uZ,
      cmk.vd,
      cmk.vf,
      cmk.rU,
      cmk.vN,
      cmk.wi,
      cmk.wq,
      cmk.wj
   };
   private static final cmc[] f = new cmc[]{cmk.oL, cmk.oV, cmk.oQ, cmk.pa, cmk.pf, cmk.pk};

   @Override
   public void a(ih.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwb.ij,
            vb.c("advancements.husbandry.root.title"),
            vb.c("advancements.husbandry.root.description"),
            new agt("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", ba.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmk.pt, vb.c("advancements.husbandry.plant_seed.title"), vb.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cb.a.a(cwb.cB))
         .a("pumpkin_stem", cb.a.a(cwb.fd))
         .a("melon_stem", cb.a.a(cwb.fe))
         .a("beetroots", cb.a.a(cwb.kD))
         .a("nether_wart", cb.a.a(cwb.fq))
         .a("torchflower", cb.a.a(cwb.kA))
         .a("pitcher_pod", cb.a.a(cwb.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cmk.pt,
            vb.c("advancements.husbandry.breed_an_animal.title"),
            vb.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cmk.oq, vb.c("advancements.husbandry.balanced_diet.title"), vb.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cmk.pl, vb.c("advancements.husbandry.netherite_hoe.title"), vb.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", by.a.a(cmk.pl))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cmk.uD,
            vb.c("advancements.husbandry.tame_an_animal.title"),
            vb.c("advancements.husbandry.tame_an_animal.description"),
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
            cmk.qS,
            vb.c("advancements.husbandry.fishy_business.title"),
            vb.c("advancements.husbandry.fishy_business.description"),
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
            cmk.qC,
            vb.c("advancements.husbandry.tactical_fishing.title"),
            vb.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kb.h.b(cmk.qG).a(), bt.a.a(ca.a.a().a(cmk.qG)))
         .a(
            cmk.qG,
            vb.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vb.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bi.a.a(bp.a.a().a(blj.f)))
         .a(
            cmk.qF,
            vb.c("advancements.husbandry.kill_axolotl_target.title"),
            vb.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cmk.qW,
            vb.c("advancements.husbandry.complete_catalogue.title"),
            vb.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cb.a.a(ci.a.a().a(au.a.a().a(arr.aF)).a(true), ca.a.a().a(cmk.si)))
         .a(
            cmk.wq,
            vb.c("advancements.husbandry.safely_harvest_honey.title"),
            vb.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cmk.wn, vb.c("advancements.husbandry.wax_on.title"), vb.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cb.a.a(ci.a.a().a(au.a.a().a(clw.a.get().keySet())), ca.a.a().a(cmk.wn)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cmk.oQ, vb.c("advancements.husbandry.wax_off.title"), vb.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cb.a.a(ci.a.a().a(au.a.a().a(clw.b.get().keySet())), ca.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kb.h.b(cmk.qH).a(), bt.a.a(ca.a.a().a(cmk.qH)))
         .a(
            cmk.qH,
            vb.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vb.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cmk.uD,
            vb.c("advancements.husbandry.leash_all_frog_variants.title"),
            vb.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cmk.xe, vb.c("advancements.husbandry.froglights.title"), vb.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", by.a.a(cmk.xd, cmk.xf, cmk.xe))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", at.a.a(cwb.pe, ca.a.a().a(new bk(cqw.v, ck.d.b(1))), ck.d.a(3)))
         .a(
            cwb.pe,
            vb.c("advancements.husbandry.silk_touch_nest.title"),
            vb.c("advancements.husbandry.silk_touch_nest.description"),
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
            cmk.nT,
            vb.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vb.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bp.a.a().a(bp.a.a().a(blj.k).b(bp.a.a().a(blj.V)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cmk.rd,
            vb.c("advancements.husbandry.make_a_sign_glow.title"),
            vb.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cb.a.a(ci.a.a().a(au.a.a().a(arr.aA)), ca.a.a().a(cmk.rd)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cmk.rP,
            vb.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vb.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cn.a.a(Optional.empty(), Optional.empty(), Optional.of(bp.a(bp.a.a().a(blj.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cmk.me,
            vb.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vb.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cb.a.b(ci.a.a().a(au.a.a().a(cwb.aY)), ca.a.a().a(cmk.ry)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cmk.kp,
            vb.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vb.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", by.a.a(cmk.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cmk.vb, vb.c("advancements.husbandry.feed_snifflet.title"), vb.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cp.a.a(ca.a.a().a(arz.aK), Optional.of(bp.a(bp.a.a().a(blj.aO).a(bn.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cmk.vc,
            vb.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vb.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cb.a.a(cwb.kA))
         .a("pitcher_pod", cb.a.a(cwb.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<blj<?>> $$2, Stream<blj<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cmk.ud,
            vb.c("advancements.husbandry.breed_all_animals.title"),
            vb.c("advancements.husbandry.breed_all_animals.description"),
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
      kb.al.h().forEach($$1 -> $$0.a($$1.g().a().toString(), cp.a.a(ca.a.a().a(cmk.uD), Optional.of(bp.a(bp.a.a().a(blj.P).a(bq.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cmc $$1 : e) {
         $$0.a(kb.h.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<blj<?>> $$1, Stream<blj<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(blj.a($$1x).toString(), av.a.a(bp.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(blj.a($$1x).toString(), av.a.a(Optional.of(bp.a.a().a($$1x).b()), Optional.of(bp.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cmc $$1 : d) {
         $$0.a(kb.h.b($$1).a(), bt.a.a(ca.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cmc $$1 : c) {
         $$0.a(kb.h.b($$1).a(), bv.a.a(Optional.empty(), Optional.empty(), Optional.of(ca.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kb.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ags::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dc.a.a(bp.a.a().a(bq.a($$1.getValue())))));
      return $$0;
   }
}
