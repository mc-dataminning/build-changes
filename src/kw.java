import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kw implements kq {
   public static final List<bnw<?>> a = List.of(
      bnw.aa,
      bnw.y,
      bnw.ar,
      bnw.aH,
      bnw.v,
      bnw.aq,
      bnw.ax,
      bnw.s,
      bnw.bq,
      bnw.as,
      bnw.aE,
      bnw.al,
      bnw.o,
      bnw.au,
      bnw.P,
      bnw.i,
      bnw.Y,
      bnw.aX,
      bnw.W,
      bnw.g,
      bnw.n,
      bnw.d
   );
   public static final List<bnw<?>> b = List.of(bnw.bf, bnw.Q, bnw.aP);
   private static final coy[] c = new coy[]{cpg.qY, cpg.ra, cpg.rb, cpg.qZ};
   private static final coy[] d = new coy[]{cpg.qG, cpg.qH, cpg.qE, cpg.qF};
   private static final coy[] e = new coy[]{
      cpg.os,
      cpg.pq,
      cpg.pw,
      cpg.pW,
      cpg.pX,
      cpg.pZ,
      cpg.qa,
      cpg.qY,
      cpg.qZ,
      cpg.ra,
      cpg.rb,
      cpg.rc,
      cpg.rd,
      cpg.rR,
      cpg.rV,
      cpg.rZ,
      cpg.sa,
      cpg.sb,
      cpg.sc,
      cpg.sd,
      cpg.sl,
      cpg.ub,
      cpg.uc,
      cpg.ud,
      cpg.ue,
      cpg.ug,
      cpg.up,
      cpg.uw,
      cpg.ux,
      cpg.uy,
      cpg.uJ,
      cpg.uK,
      cpg.vc,
      cpg.vg,
      cpg.vi,
      cpg.rW,
      cpg.vQ,
      cpg.wl,
      cpg.wt,
      cpg.wm
   };
   private static final coy[] f = new coy[]{cpg.oN, cpg.oX, cpg.oS, cpg.pc, cpg.ph, cpg.pm};

   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyu.ij,
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
         .a(cpg.pv, vq.c("advancements.husbandry.plant_seed.title"), vq.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(cyu.cB))
         .a("pumpkin_stem", cd.a.a(cyu.fd))
         .a("melon_stem", cd.a.a(cyu.fe))
         .a("beetroots", cd.a.a(cyu.kD))
         .a("nether_wart", cd.a.a(cyu.fq))
         .a("torchflower", cd.a.a(cyu.kA))
         .a("pitcher_pod", cd.a.a(cyu.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cpg.pv,
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
         .a(cpg.os, vq.c("advancements.husbandry.balanced_diet.title"), vq.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cpg.pn, vq.c("advancements.husbandry.netherite_hoe.title"), vq.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(cpg.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cpg.uG,
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
            cpg.qU,
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
            cpg.qE,
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
         .a(kf.h.b(cpg.qI).a(), bv.a.a(cc.a.a().a(cpg.qI)))
         .a(
            cpg.qI,
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
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bnw.g)))
         .a(
            cpg.qH,
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
            cpg.qY,
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(aua.aF)).a(true), cc.a.a().a(cpg.sk)))
         .a(
            cpg.wt,
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
         .a(cpg.wq, vq.c("advancements.husbandry.wax_on.title"), vq.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cot.a.get().keySet())), cc.a.a().a(cpg.wq)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cpg.oS, vq.c("advancements.husbandry.wax_off.title"), vq.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cot.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(kf.h.b(cpg.qJ).a(), bv.a.a(cc.a.a().a(cpg.qJ)))
         .a(
            cpg.qJ,
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
            cpg.uG,
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
         .a(cpg.xh, vq.c("advancements.husbandry.froglights.title"), vq.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(cpg.xg, cpg.xi, cpg.xh))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(cyu.pe, cc.a.a().a(new bm(ctp.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            cyu.pe,
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
            cpg.nT,
            vq.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vq.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bnw.l).b(br.a.a().a(bnw.W)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cpg.rf,
            vq.c("advancements.husbandry.make_a_sign_glow.title"),
            vq.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(aua.aA)), cc.a.a().a(cpg.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cpg.rR,
            vq.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vq.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bnw.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cpg.me,
            vq.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vq.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(cyu.aY)), cc.a.a().a(cpg.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cpg.kp,
            vq.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vq.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(cpg.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cpg.ve, vq.c("advancements.husbandry.feed_snifflet.title"), vq.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(aui.aP), Optional.of(br.a(br.a.a().a(bnw.aP).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cpg.vf,
            vq.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vq.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(cyu.kA))
         .a("pitcher_pod", cd.a.a(cyu.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bnw<?>> $$2, Stream<bnw<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cpg.ug,
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
      kf.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(cpg.uG), Optional.of(br.a(br.a.a().a(bnw.Q).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (coy $$1 : e) {
         $$0.a(kf.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bnw<?>> $$1, Stream<bnw<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bnw.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bnw.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (coy $$1 : d) {
         $$0.a(kf.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (coy $$1 : c) {
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
