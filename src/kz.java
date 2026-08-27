import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class kz implements kt {
   public static final List<bpd<?>> a = List.of(
      bpd.ac,
      bpd.A,
      bpd.at,
      bpd.aJ,
      bpd.x,
      bpd.as,
      bpd.az,
      bpd.u,
      bpd.bs,
      bpd.au,
      bpd.aG,
      bpd.an,
      bpd.q,
      bpd.aw,
      bpd.R,
      bpd.i,
      bpd.aa,
      bpd.aZ,
      bpd.Y,
      bpd.g,
      bpd.p,
      bpd.d
   );
   public static final List<bpd<?>> b = List.of(bpd.bh, bpd.S, bpd.aR);
   private static final cqh[] c = new cqh[]{cqp.qY, cqp.ra, cqp.rb, cqp.qZ};
   private static final cqh[] d = new cqh[]{cqp.qG, cqp.qH, cqp.qE, cqp.qF};
   private static final cqh[] e = new cqh[]{
      cqp.os,
      cqp.pq,
      cqp.pw,
      cqp.pW,
      cqp.pX,
      cqp.pZ,
      cqp.qa,
      cqp.qY,
      cqp.qZ,
      cqp.ra,
      cqp.rb,
      cqp.rc,
      cqp.rd,
      cqp.rR,
      cqp.rV,
      cqp.rZ,
      cqp.sa,
      cqp.sb,
      cqp.sc,
      cqp.sd,
      cqp.sl,
      cqp.ud,
      cqp.ue,
      cqp.uf,
      cqp.ug,
      cqp.ui,
      cqp.ur,
      cqp.uy,
      cqp.uz,
      cqp.uA,
      cqp.uL,
      cqp.uM,
      cqp.ve,
      cqp.vi,
      cqp.vk,
      cqp.rW,
      cqp.vS,
      cqp.wn,
      cqp.wv,
      cqp.wo
   };
   private static final cqh[] f = new cqh[]{cqp.oN, cqp.oX, cqp.oS, cqp.pc, cqp.ph, cqp.pm};

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dae.ij,
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
         .a(cqp.pv, vu.c("advancements.husbandry.plant_seed.title"), vu.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cd.a.a(dae.cB))
         .a("pumpkin_stem", cd.a.a(dae.fd))
         .a("melon_stem", cd.a.a(dae.fe))
         .a("beetroots", cd.a.a(dae.kD))
         .a("nether_wart", cd.a.a(dae.fq))
         .a("torchflower", cd.a.a(dae.kA))
         .a("pitcher_pod", cd.a.a(dae.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cqp.pv,
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
         .a(cqp.os, vu.c("advancements.husbandry.balanced_diet.title"), vu.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cqp.pn, vu.c("advancements.husbandry.netherite_hoe.title"), vu.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(cqp.pn))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cqp.uI,
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
            cqp.qU,
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
            cqp.qE,
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
         .a(ki.h.b(cqp.qI).a(), bv.a.a(cc.a.a().a(cqp.qI)))
         .a(
            cqp.qI,
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
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bpd.g)))
         .a(
            cqp.qH,
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
            cqp.qY,
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
         .a("safely_harvest_honey", cd.a.a(ck.a.a().a(av.a.a().a(aun.aG)).a(true), cc.a.a().a(cqp.sk)))
         .a(
            cqp.wv,
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
         .a(cqp.ws, vu.c("advancements.husbandry.wax_on.title"), vu.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cd.a.a(ck.a.a().a(av.a.a().a(cqc.a.get().keySet())), cc.a.a().a(cqp.ws)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cqp.oS, vu.c("advancements.husbandry.wax_off.title"), vu.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cd.a.a(ck.a.a().a(av.a.a().a(cqc.b.get().keySet())), cc.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(ki.h.b(cqp.qJ).a(), bv.a.a(cc.a.a().a(cqp.qJ)))
         .a(
            cqp.qJ,
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
            cqp.uI,
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
         .a(cqp.xj, vu.c("advancements.husbandry.froglights.title"), vu.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(cqp.xi, cqp.xk, cqp.xj))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dae.pe, cc.a.a().a(new bm(cuz.v, cm.d.b(1))), cm.d.a(3)))
         .a(
            dae.pe,
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
            cqp.nT,
            vu.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            vu.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", da.a.a(br.a.a().a(br.a.a().a(bpd.l).b(br.a.a().a(bpd.Y)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cqp.rf,
            vu.c("advancements.husbandry.make_a_sign_glow.title"),
            vu.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cd.a.a(ck.a.a().a(av.a.a().a(aun.aB)), cc.a.a().a(cqp.rf)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cqp.rR,
            vu.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            vu.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cp.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bpd.b)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cqp.me,
            vu.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            vu.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cd.a.b(ck.a.a().a(av.a.a().a(dae.aY)), cc.a.a().a(cqp.rA)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cqp.kp,
            vu.c("advancements.husbandry.obtain_sniffer_egg.title"),
            vu.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(cqp.kp))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cqp.vg, vu.c("advancements.husbandry.feed_snifflet.title"), vu.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cr.a.a(cc.a.a().a(auv.aP), Optional.of(br.a(br.a.a().a(bpd.aR).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cqp.vh,
            vu.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            vu.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cd.a.a(dae.kA))
         .a("pitcher_pod", cd.a.a(dae.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bpd<?>> $$2, Stream<bpd<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cqp.ui,
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
      ki.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cr.a.a(cc.a.a().a(cqp.uI), Optional.of(br.a(br.a.a().a(bpd.S).a(bs.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cqh $$1 : e) {
         $$0.a(ki.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bpd<?>> $$1, Stream<bpd<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bpd.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bpd.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cqh $$1 : d) {
         $$0.a(ki.h.b($$1).a(), bv.a.a(cc.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cqh $$1 : c) {
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
