import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kz implements kt {
   public static final List<bpc<?>> a = List.of(
      bpc.ab,
      bpc.z,
      bpc.as,
      bpc.aI,
      bpc.w,
      bpc.ar,
      bpc.ay,
      bpc.t,
      bpc.br,
      bpc.at,
      bpc.aF,
      bpc.am,
      bpc.p,
      bpc.av,
      bpc.Q,
      bpc.i,
      bpc.Z,
      bpc.aY,
      bpc.X,
      bpc.g,
      bpc.o,
      bpc.d
   );
   public static final List<bpc<?>> b = List.of(bpc.bg, bpc.R, bpc.aQ);
   private static final cqf[] c = new cqf[]{cqn.qY, cqn.ra, cqn.rb, cqn.qZ};
   private static final cqf[] d = new cqf[]{cqn.qG, cqn.qH, cqn.qE, cqn.qF};
   private static final cqf[] e = new cqf[]{
      cqn.os,
      cqn.pq,
      cqn.pw,
      cqn.pW,
      cqn.pX,
      cqn.pZ,
      cqn.qa,
      cqn.qY,
      cqn.qZ,
      cqn.ra,
      cqn.rb,
      cqn.rc,
      cqn.rd,
      cqn.rR,
      cqn.rV,
      cqn.rZ,
      cqn.sa,
      cqn.sb,
      cqn.sc,
      cqn.sd,
      cqn.sl,
      cqn.uc,
      cqn.ud,
      cqn.ue,
      cqn.uf,
      cqn.uh,
      cqn.uq,
      cqn.ux,
      cqn.uy,
      cqn.uz,
      cqn.uK,
      cqn.uL,
      cqn.vd,
      cqn.vh,
      cqn.vj,
      cqn.rW,
      cqn.vR,
      cqn.wm,
      cqn.wu,
      cqn.wn
   };
   private static final cqf[] f = new cqf[]{cqn.oN, cqn.oX, cqn.oS, cqn.pc, cqn.ph, cqn.pm};

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dac.ij,
            vu.c("advancements.husbandry.root.title"),
            vu.c("advancements.husbandry.root.description"),
            new ajh("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cqn.pv, vu.c("advancements.husbandry.plant_seed.title"), vu.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(dac.cB))
         .a("pumpkin_stem", cd.a.a(dac.fd))
         .a("melon_stem", cd.a.a(dac.fe))
         .a("beetroots", cd.a.a(dac.kD))
         .a("nether_wart", cd.a.a(dac.fq))
         .a("torchflower", cd.a.a(dac.kA))
         .a("pitcher_pod", cd.a.a(dac.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cqn.pv,
            vu.c("advancements.husbandry.breed_an_animal.title"),
            vu.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cqn.os, vu.c("advancements.husbandry.balanced_diet.title"), vu.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cqn.pn, vu.c("advancements.husbandry.netherite_hoe.title"), vu.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(cqn.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cqn.uH,
            vu.c("advancements.husbandry.tame_an_animal.title"),
            vu.c("advancements.husbandry.tame_an_animal.description"),
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
            cqn.qU,
            vu.c("advancements.husbandry.fishy_business.title"),
            vu.c("advancements.husbandry.fishy_business.description"),
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
            cqn.qE,
            vu.c("advancements.husbandry.tactical_fishing.title"),
            vu.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(ki.h.b(cqn.qI).a(), bv.a.a(cc.a.a().a(cqn.qI)))
         .a(
            cqn.qI,
            vu.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            vu.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bpc.g)))
         .a(
            cqn.qH,
            vu.c("advancements.husbandry.kill_axolotl_target.title"),
            vu.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cqn.qY,
            vu.c("advancements.husbandry.complete_catalogue.title"),
            vu.c("advancements.husbandry.complete_catalogue.description"),
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(aun.aG)).a(true), cc.a.a().a(cqn.sk)))
         .a(
            cqn.wu,
            vu.c("advancements.husbandry.safely_harvest_honey.title"),
            vu.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cqn.wr, vu.c("advancements.husbandry.wax_on.title"), vu.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cqa.a.get().keySet())), cc.a.a().a(cqn.wr)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cqn.oS, vu.c("advancements.husbandry.wax_off.title"), vu.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cqa.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(ki.h.b(cqn.qJ).a(), bv.a.a(cc.a.a().a(cqn.qJ)))
         .a(
            cqn.qJ,
            vu.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            vu.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cqn.uH,
            vu.c("advancements.husbandry.leash_all_frog_variants.title"),
            vu.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cqn.xi, vu.c("advancements.husbandry.froglights.title"), vu.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(cqn.xh, cqn.xj, cqn.xi))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dac.pe, cc.a.a().a(new bm(cux.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            dac.pe,
            vu.c("advancements.husbandry.silk_touch_nest.title"),
            vu.c("advancements.husbandry.silk_touch_nest.description"),
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
            cqn.nT,
            vu.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vu.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bpc.l).b(br.a.a().a(bpc.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cqn.rf,
            vu.c("advancements.husbandry.make_a_sign_glow.title"),
            vu.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(aun.aB)), cc.a.a().a(cqn.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cqn.rR,
            vu.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vu.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bpc.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cqn.me,
            vu.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vu.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(dac.aY)), cc.a.a().a(cqn.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cqn.kp,
            vu.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vu.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(cqn.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cqn.vf, vu.c("advancements.husbandry.feed_snifflet.title"), vu.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(auv.aP), Optional.of(br.a(br.a.a().a(bpc.aQ).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cqn.vg,
            vu.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vu.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(dac.kA))
         .a("pitcher_pod", cd.a.a(dac.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bpc<?>> $$2, Stream<bpc<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cqn.uh,
            vu.c("advancements.husbandry.breed_all_animals.title"),
            vu.c("advancements.husbandry.breed_all_animals.description"),
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
      ki.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(cqn.uH), Optional.of(br.a(br.a.a().a(bpc.R).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cqf $$1 : e) {
         $$0.a(ki.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bpc<?>> $$1, Stream<bpc<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bpc.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bpc.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cqf $$1 : d) {
         $$0.a(ki.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cqf $$1 : c) {
         $$0.a(ki.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cc.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      ki.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ajg::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), de.a.a(br.a.a().a(bs.a($$1.getValue())))));
      return $$0;
   }
}
