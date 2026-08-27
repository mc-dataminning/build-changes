import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lv implements lp {
   public static final List<bsa<?>> a = List.of(
      bsa.ab,
      bsa.z,
      bsa.at,
      bsa.aJ,
      bsa.w,
      bsa.as,
      bsa.az,
      bsa.t,
      bsa.bs,
      bsa.au,
      bsa.aG,
      bsa.an,
      bsa.p,
      bsa.aw,
      bsa.Q,
      bsa.h,
      bsa.Z,
      bsa.aZ,
      bsa.X,
      bsa.f,
      bsa.o,
      bsa.c
   );
   public static final List<bsa<?>> b = List.of(bsa.bh, bsa.R, bsa.aR);
   private static final ctj[] d = new ctj[]{ctr.qZ, ctr.rb, ctr.rc, ctr.ra};
   private static final ctj[] e = new ctj[]{ctr.qH, ctr.qI, ctr.qF, ctr.qG};
   private static final ctj[] f = new ctj[]{
      ctr.ot,
      ctr.pr,
      ctr.px,
      ctr.pX,
      ctr.pY,
      ctr.qa,
      ctr.qb,
      ctr.qZ,
      ctr.ra,
      ctr.rb,
      ctr.rc,
      ctr.rd,
      ctr.re,
      ctr.rS,
      ctr.rW,
      ctr.sa,
      ctr.sb,
      ctr.sc,
      ctr.sd,
      ctr.se,
      ctr.sm,
      ctr.uf,
      ctr.ug,
      ctr.uh,
      ctr.ui,
      ctr.uk,
      ctr.ut,
      ctr.uA,
      ctr.uB,
      ctr.uC,
      ctr.uN,
      ctr.uO,
      ctr.vg,
      ctr.vk,
      ctr.vm,
      ctr.rX,
      ctr.vU,
      ctr.wr,
      ctr.wz,
      ctr.ws
   };
   public static final ctj[] c = new ctj[]{ctr.oO, ctr.oY, ctr.oT, ctr.pd, ctr.pi, ctr.pn};

   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dea.ij,
            wx.c("advancements.husbandry.root.title"),
            wx.c("advancements.husbandry.root.description"),
            new akm("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctr.pw, wx.c("advancements.husbandry.plant_seed.title"), wx.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ck.a.a(dea.cB))
         .a("pumpkin_stem", ck.a.a(dea.fd))
         .a("melon_stem", ck.a.a(dea.fe))
         .a("beetroots", ck.a.a(dea.kD))
         .a("nether_wart", ck.a.a(dea.fq))
         .a("torchflower", ck.a.a(dea.kA))
         .a("pitcher_pod", ck.a.a(dea.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            ctr.pw,
            wx.c("advancements.husbandry.breed_an_animal.title"),
            wx.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(ctr.ot, wx.c("advancements.husbandry.balanced_diet.title"), wx.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(ctr.po, wx.c("advancements.husbandry.netherite_hoe.title"), wx.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", cb.a.a(ctr.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            ctr.uK,
            wx.c("advancements.husbandry.tame_an_animal.title"),
            wx.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dp.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            ctr.qV,
            wx.c("advancements.husbandry.fishy_business.title"),
            wx.c("advancements.husbandry.fishy_business.description"),
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
            ctr.qF,
            wx.c("advancements.husbandry.tactical_fishing.title"),
            wx.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(le.h.b(ctr.qJ).a(), bw.a.a(ch.a.a().a(ctr.qJ)))
         .a(
            ctr.qJ,
            wx.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wx.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bsa.f)))
         .a(
            ctr.qI,
            wx.c("advancements.husbandry.kill_axolotl_target.title"),
            wx.c("advancements.husbandry.kill_axolotl_target.description"),
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
            ctr.qZ,
            wx.c("advancements.husbandry.complete_catalogue.title"),
            wx.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", ck.a.a(cr.a.a().a(av.a.a().a(avw.aG)).a(true), ch.a.a().a(ctr.sl)))
         .a(
            ctr.wz,
            wx.c("advancements.husbandry.safely_harvest_honey.title"),
            wx.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(ctr.ww, wx.c("advancements.husbandry.wax_on.title"), wx.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ck.a.a(cr.a.a().a(av.a.a().a(cte.a.get().keySet())), ch.a.a().a(ctr.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(ctr.oT, wx.c("advancements.husbandry.wax_off.title"), wx.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ck.a.a(cr.a.a().a(av.a.a().a(cte.b.get().keySet())), ch.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(le.h.b(ctr.qK).a(), bw.a.a(ch.a.a().a(ctr.qK)))
         .a(
            ctr.qK,
            wx.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wx.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            ctr.uK,
            wx.c("advancements.husbandry.leash_all_frog_variants.title"),
            wx.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(ctr.xn, wx.c("advancements.husbandry.froglights.title"), wx.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", cb.a.a(ctr.xm, ctr.xo, ctr.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dea.pe, ch.a.a().a(cj.b, cf.a(List.of(new bm(czc.v, ct.d.b(1))))), ct.d.a(3)))
         .a(
            dea.pe,
            wx.c("advancements.husbandry.silk_touch_nest.title"),
            wx.c("advancements.husbandry.silk_touch_nest.description"),
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
            ctr.nU,
            wx.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wx.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dk.a.a(br.a.a().a(br.a.a().a(bsa.k).b(br.a.a().a(bsa.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            ctr.rg,
            wx.c("advancements.husbandry.make_a_sign_glow.title"),
            wx.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ck.a.a(cr.a.a().a(av.a.a().a(avw.aB)), ch.a.a().a(ctr.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            ctr.rS,
            wx.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wx.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cw.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bsa.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            ctr.mf,
            wx.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wx.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ck.a.b(cr.a.a().a(av.a.a().a(dea.aY)), ch.a.a().a(ctr.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            ctr.kq,
            wx.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wx.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cb.a.a(ctr.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(ctr.vi, wx.c("advancements.husbandry.feed_snifflet.title"), wx.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cy.a.a(ch.a.a().a(awe.X), Optional.of(br.a(br.a.a().a(bsa.aR).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            ctr.vj,
            wx.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wx.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ck.a.a(dea.kA))
         .a("pitcher_pod", ck.a.a(dea.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsa<?>> $$2, Stream<bsa<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            ctr.uk,
            wx.c("advancements.husbandry.breed_all_animals.title"),
            wx.c("advancements.husbandry.breed_all_animals.description"),
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
      le.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cy.a.a(ch.a.a().a(ctr.uK), Optional.of(br.a(br.a.a().a(bsa.R).a(bt.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (ctj $$1 : f) {
         $$0.a(le.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsa<?>> $$1, Stream<bsa<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsa.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsa.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (ctj $$1 : e) {
         $$0.a(le.h.b($$1).a(), bw.a.a(ch.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (ctj $$1 : d) {
         $$0.a(le.h.b($$1).a(), by.a.a(Optional.empty(), Optional.empty(), Optional.of(ch.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      le.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), dp.a.a(br.a.a().a(bt.a($$1)))));
      return $$0;
   }
}
