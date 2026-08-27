import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lu implements lo {
   public static final List<brn<?>> a = List.of(
      brn.ab,
      brn.z,
      brn.as,
      brn.aI,
      brn.w,
      brn.ar,
      brn.ay,
      brn.t,
      brn.br,
      brn.at,
      brn.aF,
      brn.am,
      brn.p,
      brn.av,
      brn.Q,
      brn.h,
      brn.Z,
      brn.aY,
      brn.X,
      brn.f,
      brn.o,
      brn.c
   );
   public static final List<brn<?>> b = List.of(brn.bg, brn.R, brn.aQ);
   private static final csu[] d = new csu[]{ctc.qZ, ctc.rb, ctc.rc, ctc.ra};
   private static final csu[] e = new csu[]{ctc.qH, ctc.qI, ctc.qF, ctc.qG};
   private static final csu[] f = new csu[]{
      ctc.ot,
      ctc.pr,
      ctc.px,
      ctc.pX,
      ctc.pY,
      ctc.qa,
      ctc.qb,
      ctc.qZ,
      ctc.ra,
      ctc.rb,
      ctc.rc,
      ctc.rd,
      ctc.re,
      ctc.rS,
      ctc.rW,
      ctc.sa,
      ctc.sb,
      ctc.sc,
      ctc.sd,
      ctc.se,
      ctc.sm,
      ctc.uf,
      ctc.ug,
      ctc.uh,
      ctc.ui,
      ctc.uk,
      ctc.ut,
      ctc.uA,
      ctc.uB,
      ctc.uC,
      ctc.uN,
      ctc.uO,
      ctc.vg,
      ctc.vk,
      ctc.vm,
      ctc.rX,
      ctc.vU,
      ctc.wr,
      ctc.wz,
      ctc.ws
   };
   public static final csu[] c = new csu[]{ctc.oO, ctc.oY, ctc.oT, ctc.pd, ctc.pi, ctc.pn};

   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ddg.ij,
            wu.c("advancements.husbandry.root.title"),
            wu.c("advancements.husbandry.root.description"),
            new akh("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctc.pw, wu.c("advancements.husbandry.plant_seed.title"), wu.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ck.a.a(ddg.cB))
         .a("pumpkin_stem", ck.a.a(ddg.fd))
         .a("melon_stem", ck.a.a(ddg.fe))
         .a("beetroots", ck.a.a(ddg.kD))
         .a("nether_wart", ck.a.a(ddg.fq))
         .a("torchflower", ck.a.a(ddg.kA))
         .a("pitcher_pod", ck.a.a(ddg.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            ctc.pw,
            wu.c("advancements.husbandry.breed_an_animal.title"),
            wu.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", aw.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(ctc.ot, wu.c("advancements.husbandry.balanced_diet.title"), wu.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(ctc.po, wu.c("advancements.husbandry.netherite_hoe.title"), wu.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", cb.a.a(ctc.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            ctc.uK,
            wu.c("advancements.husbandry.tame_an_animal.title"),
            wu.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dn.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            ctc.qV,
            wu.c("advancements.husbandry.fishy_business.title"),
            wu.c("advancements.husbandry.fishy_business.description"),
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
            ctc.qF,
            wu.c("advancements.husbandry.tactical_fishing.title"),
            wu.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(ld.h.b(ctc.qJ).a(), bw.a.a(ch.a.a().a(ctc.qJ)))
         .a(
            ctc.qJ,
            wu.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wu.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(brn.f)))
         .a(
            ctc.qI,
            wu.c("advancements.husbandry.kill_axolotl_target.title"),
            wu.c("advancements.husbandry.kill_axolotl_target.description"),
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
            ctc.qZ,
            wu.c("advancements.husbandry.complete_catalogue.title"),
            wu.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", ck.a.a(cr.a.a().a(av.a.a().a(avr.aG)).a(true), ch.a.a().a(ctc.sl)))
         .a(
            ctc.wz,
            wu.c("advancements.husbandry.safely_harvest_honey.title"),
            wu.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(ctc.ww, wu.c("advancements.husbandry.wax_on.title"), wu.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ck.a.a(cr.a.a().a(av.a.a().a(csp.a.get().keySet())), ch.a.a().a(ctc.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(ctc.oT, wu.c("advancements.husbandry.wax_off.title"), wu.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ck.a.a(cr.a.a().a(av.a.a().a(csp.b.get().keySet())), ch.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(ld.h.b(ctc.qK).a(), bw.a.a(ch.a.a().a(ctc.qK)))
         .a(
            ctc.qK,
            wu.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wu.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            ctc.uK,
            wu.c("advancements.husbandry.leash_all_frog_variants.title"),
            wu.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(ctc.xn, wu.c("advancements.husbandry.froglights.title"), wu.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", cb.a.a(ctc.xm, ctc.xo, ctc.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(ddg.pe, ch.a.a().a(cj.b, cf.a(List.of(new bm(cyj.v, ct.d.b(1))))), ct.d.a(3)))
         .a(
            ddg.pe,
            wu.c("advancements.husbandry.silk_touch_nest.title"),
            wu.c("advancements.husbandry.silk_touch_nest.description"),
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
            ctc.nU,
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dj.a.a(br.a.a().a(br.a.a().a(brn.k).b(br.a.a().a(brn.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            ctc.rg,
            wu.c("advancements.husbandry.make_a_sign_glow.title"),
            wu.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ck.a.a(cr.a.a().a(av.a.a().a(avr.aB)), ch.a.a().a(ctc.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            ctc.rS,
            wu.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wu.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cw.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(brn.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            ctc.mf,
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ck.a.b(cr.a.a().a(av.a.a().a(ddg.aY)), ch.a.a().a(ctc.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            ctc.kq,
            wu.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wu.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cb.a.a(ctc.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(ctc.vi, wu.c("advancements.husbandry.feed_snifflet.title"), wu.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cy.a.a(ch.a.a().a(avz.X), Optional.of(br.a(br.a.a().a(brn.aQ).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            ctc.vj,
            wu.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wu.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ck.a.a(ddg.kA))
         .a("pitcher_pod", ck.a.a(ddg.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<brn<?>> $$2, Stream<brn<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            ctc.uk,
            wu.c("advancements.husbandry.breed_all_animals.title"),
            wu.c("advancements.husbandry.breed_all_animals.description"),
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
      ld.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cy.a.a(ch.a.a().a(ctc.uK), Optional.of(br.a(br.a.a().a(brn.R).a(bt.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (csu $$1 : f) {
         $$0.a(ld.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<brn<?>> $$1, Stream<brn<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(brn.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(brn.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (csu $$1 : e) {
         $$0.a(ld.h.b($$1).a(), bw.a.a(ch.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (csu $$1 : d) {
         $$0.a(ld.h.b($$1).a(), by.a.a(Optional.empty(), Optional.empty(), Optional.of(ch.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      ld.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), dn.a.a(br.a.a().a(bt.a($$1)))));
      return $$0;
   }
}
