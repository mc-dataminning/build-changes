import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kw implements kq {
   public static final List<bnu<?>> a = List.of(
      bnu.aa,
      bnu.y,
      bnu.ar,
      bnu.aH,
      bnu.v,
      bnu.aq,
      bnu.ax,
      bnu.s,
      bnu.bq,
      bnu.as,
      bnu.aE,
      bnu.al,
      bnu.o,
      bnu.au,
      bnu.P,
      bnu.i,
      bnu.Y,
      bnu.aX,
      bnu.W,
      bnu.g,
      bnu.n,
      bnu.d
   );
   public static final List<bnu<?>> b = List.of(bnu.bf, bnu.Q, bnu.aP);
   private static final cou[] c = new cou[]{cpc.qY, cpc.ra, cpc.rb, cpc.qZ};
   private static final cou[] d = new cou[]{cpc.qG, cpc.qH, cpc.qE, cpc.qF};
   private static final cou[] e = new cou[]{
      cpc.os,
      cpc.pq,
      cpc.pw,
      cpc.pW,
      cpc.pX,
      cpc.pZ,
      cpc.qa,
      cpc.qY,
      cpc.qZ,
      cpc.ra,
      cpc.rb,
      cpc.rc,
      cpc.rd,
      cpc.rR,
      cpc.rV,
      cpc.rZ,
      cpc.sa,
      cpc.sb,
      cpc.sc,
      cpc.sd,
      cpc.sl,
      cpc.ub,
      cpc.uc,
      cpc.ud,
      cpc.ue,
      cpc.ug,
      cpc.up,
      cpc.uw,
      cpc.ux,
      cpc.uy,
      cpc.uJ,
      cpc.uK,
      cpc.vc,
      cpc.vg,
      cpc.vi,
      cpc.rW,
      cpc.vQ,
      cpc.wl,
      cpc.wt,
      cpc.wm
   };
   private static final cou[] f = new cou[]{cpc.oN, cpc.oX, cpc.oS, cpc.pc, cpc.ph, cpc.pm};

   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyq.ij,
            vq.c("advancements.husbandry.root.title"),
            vq.c("advancements.husbandry.root.description"),
            new aiy("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpc.pv, vq.c("advancements.husbandry.plant_seed.title"), vq.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(cyq.cB))
         .a("pumpkin_stem", cd.a.a(cyq.fd))
         .a("melon_stem", cd.a.a(cyq.fe))
         .a("beetroots", cd.a.a(cyq.kD))
         .a("nether_wart", cd.a.a(cyq.fq))
         .a("torchflower", cd.a.a(cyq.kA))
         .a("pitcher_pod", cd.a.a(cyq.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cpc.pv,
            vq.c("advancements.husbandry.breed_an_animal.title"),
            vq.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cpc.os, vq.c("advancements.husbandry.balanced_diet.title"), vq.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cpc.pn, vq.c("advancements.husbandry.netherite_hoe.title"), vq.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(cpc.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cpc.uG,
            vq.c("advancements.husbandry.tame_an_animal.title"),
            vq.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", de.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            cpc.qU,
            vq.c("advancements.husbandry.fishy_business.title"),
            vq.c("advancements.husbandry.fishy_business.description"),
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
            cpc.qE,
            vq.c("advancements.husbandry.tactical_fishing.title"),
            vq.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(kf.h.b(cpc.qI).a(), bv.a.a(cc.a.a().a(cpc.qI)))
         .a(
            cpc.qI,
            vq.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vq.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bnu.g)))
         .a(
            cpc.qH,
            vq.c("advancements.husbandry.kill_axolotl_target.title"),
            vq.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cpc.qY,
            vq.c("advancements.husbandry.complete_catalogue.title"),
            vq.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(atz.aF)).a(true), cc.a.a().a(cpc.sk)))
         .a(
            cpc.wt,
            vq.c("advancements.husbandry.safely_harvest_honey.title"),
            vq.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cpc.wq, vq.c("advancements.husbandry.wax_on.title"), vq.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cop.a.get().keySet())), cc.a.a().a(cpc.wq)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cpc.oS, vq.c("advancements.husbandry.wax_off.title"), vq.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cop.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kf.h.b(cpc.qJ).a(), bv.a.a(cc.a.a().a(cpc.qJ)))
         .a(
            cpc.qJ,
            vq.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vq.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cpc.uG,
            vq.c("advancements.husbandry.leash_all_frog_variants.title"),
            vq.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cpc.xh, vq.c("advancements.husbandry.froglights.title"), vq.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(cpc.xg, cpc.xi, cpc.xh))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cyq.pe, cc.a.a().a(new bm(ctl.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            cyq.pe,
            vq.c("advancements.husbandry.silk_touch_nest.title"),
            vq.c("advancements.husbandry.silk_touch_nest.description"),
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
            cpc.nT,
            vq.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vq.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bnu.l).b(br.a.a().a(bnu.W)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cpc.rf,
            vq.c("advancements.husbandry.make_a_sign_glow.title"),
            vq.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(atz.aA)), cc.a.a().a(cpc.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cpc.rR,
            vq.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vq.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bnu.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cpc.me,
            vq.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vq.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(cyq.aY)), cc.a.a().a(cpc.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cpc.kp,
            vq.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vq.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(cpc.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cpc.ve, vq.c("advancements.husbandry.feed_snifflet.title"), vq.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(auh.aP), Optional.of(br.a(br.a.a().a(bnu.aP).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cpc.vf,
            vq.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vq.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(cyq.kA))
         .a("pitcher_pod", cd.a.a(cyq.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bnu<?>> $$2, Stream<bnu<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cpc.ug,
            vq.c("advancements.husbandry.breed_all_animals.title"),
            vq.c("advancements.husbandry.breed_all_animals.description"),
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
      kf.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(cpc.uG), Optional.of(br.a(br.a.a().a(bnu.Q).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cou $$1 : e) {
         $$0.a(kf.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bnu<?>> $$1, Stream<bnu<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bnu.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bnu.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cou $$1 : d) {
         $$0.a(kf.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cou $$1 : c) {
         $$0.a(kf.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cc.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      kf.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aix::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), de.a.a(br.a.a().a(bs.a($$1.getValue())))));
      return $$0;
   }
}
