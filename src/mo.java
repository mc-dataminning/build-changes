import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mo implements mk {
   public static final List<bus<?>> a = List.of(
      bus.ak,
      bus.H,
      bus.aE,
      bus.aX,
      bus.C,
      bus.aD,
      bus.aN,
      bus.z,
      bus.bI,
      bus.aH,
      bus.aU,
      bus.aw,
      bus.u,
      bus.aK,
      bus.Z,
      bus.l,
      bus.ai,
      bus.bp,
      bus.ag,
      bus.h,
      bus.t,
      bus.e
   );
   public static final List<bus<?>> b = List.of(bus.bx, bus.aa, bus.bf);
   private static final cwi[] d = new cwi[]{cwq.rq, cwq.rs, cwq.rt, cwq.rr};
   private static final cwi[] e = new cwi[]{cwq.qI, cwq.qJ, cwq.qG, cwq.qH};
   private static final cwi[] f = new cwi[]{
      cwq.ov,
      cwq.ps,
      cwq.py,
      cwq.pY,
      cwq.pZ,
      cwq.qb,
      cwq.qc,
      cwq.rq,
      cwq.rr,
      cwq.rs,
      cwq.rt,
      cwq.ru,
      cwq.rv,
      cwq.sj,
      cwq.sn,
      cwq.sr,
      cwq.ss,
      cwq.st,
      cwq.su,
      cwq.sv,
      cwq.sD,
      cwq.ux,
      cwq.uy,
      cwq.uz,
      cwq.uA,
      cwq.uC,
      cwq.uL,
      cwq.uS,
      cwq.uT,
      cwq.uU,
      cwq.vf,
      cwq.vg,
      cwq.vy,
      cwq.vC,
      cwq.vE,
      cwq.so,
      cwq.wo,
      cwq.wN,
      cwq.wV,
      cwq.wO
   };
   public static final cwi[] c = new cwi[]{cwq.oQ, cwq.pa, cwq.oV, cwq.pf, cwq.pk, cwq.pp};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bus<?>> $$2 = $$0.d(ma.z);
      jr<cwi> $$3 = $$0.d(ma.K);
      jr<diq> $$4 = $$0.d(ma.f);
      js.b<dcd> $$5 = $$0.d(ma.aM);
      ah $$6 = ag.a.a()
         .a(
            dis.ij,
            xj.c("advancements.husbandry.root.title"),
            xj.c("advancements.husbandry.root.description"),
            alj.b("textures/gui/advancements/backgrounds/husbandry.png"),
            an.a,
            false,
            false,
            false
         )
         .a("consumed_item", bg.a.b())
         .a($$1, "husbandry/root");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwq.px, xj.c("advancements.husbandry.plant_seed.title"), xj.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dis.cB))
         .a("pumpkin_stem", cy.a.a(dis.fd))
         .a("melon_stem", cy.a.a(dis.fe))
         .a("beetroots", cy.a.a(dis.kD))
         .a("nether_wart", cy.a.a(dis.fq))
         .a("torchflower", cy.a.a(dis.kA))
         .a("pitcher_pod", cy.a.a(dis.kB))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cwq.px,
            xj.c("advancements.husbandry.breed_an_animal.title"),
            xj.c("advancements.husbandry.breed_an_animal.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("bred", ay.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$8, $$1, $$2, a.stream(), b.stream());
      a(ag.a.a(), $$3)
         .a($$7)
         .a(cwq.ov, xj.c("advancements.husbandry.balanced_diet.title"), xj.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cwq.pq, xj.c("advancements.husbandry.netherite_hoe.title"), xj.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cwq.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cwq.vc,
            xj.c("advancements.husbandry.tame_an_animal.title"),
            xj.c("advancements.husbandry.tame_an_animal.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("tamed_animal", eh.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ah $$10 = c(ag.a.a(), $$3)
         .a($$6)
         .a(ak.a.b)
         .a(
            cwq.rm,
            xj.c("advancements.husbandry.fishy_business.title"),
            xj.c("advancements.husbandry.fishy_business.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ah $$11 = b(ag.a.a(), $$3)
         .a($$10)
         .a(ak.a.b)
         .a(
            cwq.qG,
            xj.c("advancements.husbandry.tactical_fishing.title"),
            xj.c("advancements.husbandry.tactical_fishing.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(ak.a.b)
         .a(lz.g.b(cwq.qK).a(), cb.a.a(cu.a.a().a($$3, cwq.qK)))
         .a(
            cwq.qK,
            xj.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xj.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ag.a.a()
         .a($$12)
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bus.h)))
         .a(
            cwq.qJ,
            xj.c("advancements.husbandry.kill_axolotl_target.title"),
            xj.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ag.a.a())
         .a($$9)
         .a(
            cwq.rq,
            xj.c("advancements.husbandry.complete_catalogue.title"),
            xj.c("advancements.husbandry.complete_catalogue.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ag.a.a(), $$0)
         .a($$9)
         .a(cwq.rQ, xj.c("advancements.husbandry.whole_pack.title"), xj.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axc.aI)).a(true), cu.a.a().a($$3, cwq.sB)))
         .a(
            cwq.wV,
            xj.c("advancements.husbandry.safely_harvest_honey.title"),
            xj.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ah $$14 = ag.a.a()
         .a($$13)
         .a(cwq.wS, xj.c("advancements.husbandry.wax_on.title"), xj.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cwd.a.get().keySet())), cu.a.a().a($$3, cwq.wS)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cwq.oV, xj.c("advancements.husbandry.wax_off.title"), xj.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cwd.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(lz.g.b(cwq.qL).a(), cb.a.a(cu.a.a().a($$3, cwq.qL)))
         .a(
            cwq.qL,
            xj.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xj.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ah $$16 = a($$2, $$3, ag.a.a())
         .a($$15)
         .a(
            cwq.vc,
            xj.c("advancements.husbandry.leash_all_frog_variants.title"),
            xj.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ag.a.a()
         .a($$16)
         .a(cwq.xJ, xj.c("advancements.husbandry.froglights.title"), xj.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cwq.xI, cwq.xK, cwq.xJ))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dis.pe, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(dci.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dis.pe,
            xj.c("advancements.husbandry.silk_touch_nest.title"),
            xj.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ag.a.a()
         .a($$6)
         .a(
            cwq.nV,
            xj.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xj.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, axg.I).b(bw.a.a().a($$2, bus.ag)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cwq.rx,
            xj.c("advancements.husbandry.make_a_sign_glow.title"),
            xj.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axc.aD)), cu.a.a().a($$3, cwq.rx)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cwq.sj,
            xj.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xj.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bus.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cwq.mf,
            xj.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xj.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dis.aY)), cu.a.a().a($$3, cwq.rS)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cwq.kq,
            xj.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xj.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cwq.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cwq.vA, xj.c("advancements.husbandry.feed_snifflet.title"), xj.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, axl.ab), Optional.of(bw.a(bw.a.a().a($$2, bus.bf).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cwq.vB,
            xj.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xj.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dis.kA))
         .a("pitcher_pod", cy.a.a(dis.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cwq.sm,
            xj.c("advancements.husbandry.remove_wolf_armor.title"),
            xj.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cwq.sm), Optional.of(bw.a(bw.a.a().a($$2, bus.bI)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cwq.os,
            xj.c("advancements.husbandry.repair_wolf_armor.title"),
            xj.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dq.a.a(cu.a.a().a($$3, cwq.or), Optional.of(bw.a(bw.a.a().a($$2, bus.bI).a(bt.a.a().e(cu.a.a().a($$3, cwq.os).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bus<?>> $$2, Stream<bus<?>> $$3, Stream<bus<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwq.uC,
            xj.c("advancements.husbandry.breed_all_animals.title"),
            xj.c("advancements.husbandry.breed_all_animals.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ag.a a(jr<bus<?>> $$0, jr<cwi> $$1, ag.a $$2) {
      lz.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cwq.vc), Optional.of(bw.a(bw.a.a().a($$0, bus.aa).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cwi> $$1) {
      for (cwi $$2 : f) {
         $$0.a(lz.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bus<?>> $$1, jr<bus<?>> $$2, Stream<bus<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bus.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bus.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cwi> $$1) {
      for (cwi $$2 : e) {
         $$0.a(lz.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cwi> $$1) {
      for (cwi $$2 : d) {
         $$0.a(lz.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      lz.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<cic> $$2 = $$1.d(ma.m);
      $$2.c_().sorted(Comparator.comparing(ali::a)).forEach($$2x -> {
         jq<cic> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
