import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lv implements lp {
   public static final List<bsc<?>> a = List.of(
      bsc.ab,
      bsc.z,
      bsc.at,
      bsc.aJ,
      bsc.w,
      bsc.as,
      bsc.az,
      bsc.t,
      bsc.bs,
      bsc.au,
      bsc.aG,
      bsc.an,
      bsc.p,
      bsc.aw,
      bsc.Q,
      bsc.h,
      bsc.Z,
      bsc.aZ,
      bsc.X,
      bsc.f,
      bsc.o,
      bsc.c
   );
   public static final List<bsc<?>> b = List.of(bsc.bh, bsc.R, bsc.aR);
   private static final ctl[] d = new ctl[]{ctt.qZ, ctt.rb, ctt.rc, ctt.ra};
   private static final ctl[] e = new ctl[]{ctt.qH, ctt.qI, ctt.qF, ctt.qG};
   private static final ctl[] f = new ctl[]{
      ctt.ot,
      ctt.pr,
      ctt.px,
      ctt.pX,
      ctt.pY,
      ctt.qa,
      ctt.qb,
      ctt.qZ,
      ctt.ra,
      ctt.rb,
      ctt.rc,
      ctt.rd,
      ctt.re,
      ctt.rS,
      ctt.rW,
      ctt.sa,
      ctt.sb,
      ctt.sc,
      ctt.sd,
      ctt.se,
      ctt.sm,
      ctt.uf,
      ctt.ug,
      ctt.uh,
      ctt.ui,
      ctt.uk,
      ctt.ut,
      ctt.uA,
      ctt.uB,
      ctt.uC,
      ctt.uN,
      ctt.uO,
      ctt.vg,
      ctt.vk,
      ctt.vm,
      ctt.rX,
      ctt.vU,
      ctt.wr,
      ctt.wz,
      ctt.ws
   };
   public static final ctl[] c = new ctl[]{ctt.oO, ctt.oY, ctt.oT, ctt.pd, ctt.pi, ctt.pn};

   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dec.ij,
            wx.c("advancements.husbandry.root.title"),
            wx.c("advancements.husbandry.root.description"),
            new akn("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctt.pw, wx.c("advancements.husbandry.plant_seed.title"), wx.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ck.a.a(dec.cB))
         .a("pumpkin_stem", ck.a.a(dec.fd))
         .a("melon_stem", ck.a.a(dec.fe))
         .a("beetroots", ck.a.a(dec.kD))
         .a("nether_wart", ck.a.a(dec.fq))
         .a("torchflower", ck.a.a(dec.kA))
         .a("pitcher_pod", ck.a.a(dec.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            ctt.pw,
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
         .a(ctt.ot, wx.c("advancements.husbandry.balanced_diet.title"), wx.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(ctt.po, wx.c("advancements.husbandry.netherite_hoe.title"), wx.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", cb.a.a(ctt.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            ctt.uK,
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
            ctt.qV,
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
            ctt.qF,
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
         .a(le.h.b(ctt.qJ).a(), bw.a.a(ch.a.a().a(ctt.qJ)))
         .a(
            ctt.qJ,
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
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bsc.f)))
         .a(
            ctt.qI,
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
            ctt.qZ,
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
         .a("safely_harvest_honey", ck.a.a(cr.a.a().a(av.a.a().a(avx.aG)).a(true), ch.a.a().a(ctt.sl)))
         .a(
            ctt.wz,
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
         .a(ctt.ww, wx.c("advancements.husbandry.wax_on.title"), wx.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ck.a.a(cr.a.a().a(av.a.a().a(ctg.a.get().keySet())), ch.a.a().a(ctt.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(ctt.oT, wx.c("advancements.husbandry.wax_off.title"), wx.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ck.a.a(cr.a.a().a(av.a.a().a(ctg.b.get().keySet())), ch.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(le.h.b(ctt.qK).a(), bw.a.a(ch.a.a().a(ctt.qK)))
         .a(
            ctt.qK,
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
            ctt.uK,
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
         .a(ctt.xn, wx.c("advancements.husbandry.froglights.title"), wx.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", cb.a.a(ctt.xm, ctt.xo, ctt.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dec.pe, ch.a.a().a(cj.b, cf.a(List.of(new bm(cze.v, ct.d.b(1))))), ct.d.a(3)))
         .a(
            dec.pe,
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
            ctt.nU,
            wx.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wx.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dk.a.a(br.a.a().a(br.a.a().a(bsc.k).b(br.a.a().a(bsc.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            ctt.rg,
            wx.c("advancements.husbandry.make_a_sign_glow.title"),
            wx.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ck.a.a(cr.a.a().a(av.a.a().a(avx.aB)), ch.a.a().a(ctt.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            ctt.rS,
            wx.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wx.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cw.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bsc.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            ctt.mf,
            wx.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wx.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ck.a.b(cr.a.a().a(av.a.a().a(dec.aY)), ch.a.a().a(ctt.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            ctt.kq,
            wx.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wx.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cb.a.a(ctt.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(ctt.vi, wx.c("advancements.husbandry.feed_snifflet.title"), wx.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cy.a.a(ch.a.a().a(awf.X), Optional.of(br.a(br.a.a().a(bsc.aR).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            ctt.vj,
            wx.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wx.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ck.a.a(dec.kA))
         .a("pitcher_pod", ck.a.a(dec.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsc<?>> $$2, Stream<bsc<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            ctt.uk,
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
      le.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cy.a.a(ch.a.a().a(ctt.uK), Optional.of(br.a(br.a.a().a(bsc.R).a(bt.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (ctl $$1 : f) {
         $$0.a(le.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsc<?>> $$1, Stream<bsc<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsc.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsc.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (ctl $$1 : e) {
         $$0.a(le.h.b($$1).a(), bw.a.a(ch.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (ctl $$1 : d) {
         $$0.a(le.h.b($$1).a(), by.a.a(Optional.empty(), Optional.empty(), Optional.of(ch.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      le.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), dp.a.a(br.a.a().a(bt.a($$1)))));
      return $$0;
   }
}
