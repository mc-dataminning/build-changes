import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mo implements mk {
   public static final List<bup<?>> a = List.of(
      bup.ab,
      bup.z,
      bup.at,
      bup.aJ,
      bup.w,
      bup.as,
      bup.az,
      bup.t,
      bup.bs,
      bup.au,
      bup.aG,
      bup.an,
      bup.p,
      bup.aw,
      bup.Q,
      bup.h,
      bup.Z,
      bup.aZ,
      bup.X,
      bup.f,
      bup.o,
      bup.c
   );
   public static final List<bup<?>> b = List.of(bup.bh, bup.R, bup.aR);
   private static final cwb[] d = new cwb[]{cwj.rq, cwj.rs, cwj.rt, cwj.rr};
   private static final cwb[] e = new cwb[]{cwj.qI, cwj.qJ, cwj.qG, cwj.qH};
   private static final cwb[] f = new cwb[]{
      cwj.ov,
      cwj.ps,
      cwj.py,
      cwj.pY,
      cwj.pZ,
      cwj.qb,
      cwj.qc,
      cwj.rq,
      cwj.rr,
      cwj.rs,
      cwj.rt,
      cwj.ru,
      cwj.rv,
      cwj.sj,
      cwj.sn,
      cwj.sr,
      cwj.ss,
      cwj.st,
      cwj.su,
      cwj.sv,
      cwj.sD,
      cwj.ux,
      cwj.uy,
      cwj.uz,
      cwj.uA,
      cwj.uC,
      cwj.uL,
      cwj.uS,
      cwj.uT,
      cwj.uU,
      cwj.vf,
      cwj.vg,
      cwj.vy,
      cwj.vC,
      cwj.vE,
      cwj.so,
      cwj.wo,
      cwj.wN,
      cwj.wV,
      cwj.wO
   };
   public static final cwb[] c = new cwb[]{cwj.oQ, cwj.pa, cwj.oV, cwj.pf, cwj.pk, cwj.pp};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bup<?>> $$2 = $$0.d(ma.z);
      jr<cwb> $$3 = $$0.d(ma.K);
      jr<dij> $$4 = $$0.d(ma.f);
      js.b<dbw> $$5 = $$0.d(ma.aM);
      ah $$6 = ag.a.a()
         .a(
            dil.ij,
            xl.c("advancements.husbandry.root.title"),
            xl.c("advancements.husbandry.root.description"),
            all.b("textures/gui/advancements/backgrounds/husbandry.png"),
            an.a,
            false,
            false,
            false
         )
         .a("consumed_item", bg.a.b())
         .a($$1, "husbandry/root");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwj.px, xl.c("advancements.husbandry.plant_seed.title"), xl.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dil.cB))
         .a("pumpkin_stem", cy.a.a(dil.fd))
         .a("melon_stem", cy.a.a(dil.fe))
         .a("beetroots", cy.a.a(dil.kD))
         .a("nether_wart", cy.a.a(dil.fq))
         .a("torchflower", cy.a.a(dil.kA))
         .a("pitcher_pod", cy.a.a(dil.kB))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cwj.px,
            xl.c("advancements.husbandry.breed_an_animal.title"),
            xl.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cwj.ov, xl.c("advancements.husbandry.balanced_diet.title"), xl.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cwj.pq, xl.c("advancements.husbandry.netherite_hoe.title"), xl.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cwj.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cwj.vc,
            xl.c("advancements.husbandry.tame_an_animal.title"),
            xl.c("advancements.husbandry.tame_an_animal.description"),
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
            cwj.rm,
            xl.c("advancements.husbandry.fishy_business.title"),
            xl.c("advancements.husbandry.fishy_business.description"),
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
            cwj.qG,
            xl.c("advancements.husbandry.tactical_fishing.title"),
            xl.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lz.g.b(cwj.qK).a(), cb.a.a(cu.a.a().a($$3, cwj.qK)))
         .a(
            cwj.qK,
            xl.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xl.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ag.a.a()
         .a($$12)
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bup.f)))
         .a(
            cwj.qJ,
            xl.c("advancements.husbandry.kill_axolotl_target.title"),
            xl.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cwj.rq,
            xl.c("advancements.husbandry.complete_catalogue.title"),
            xl.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cwj.rQ, xl.c("advancements.husbandry.whole_pack.title"), xl.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axd.aI)).a(true), cu.a.a().a($$3, cwj.sB)))
         .a(
            cwj.wV,
            xl.c("advancements.husbandry.safely_harvest_honey.title"),
            xl.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ah $$14 = ag.a.a()
         .a($$13)
         .a(cwj.wS, xl.c("advancements.husbandry.wax_on.title"), xl.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cvw.a.get().keySet())), cu.a.a().a($$3, cwj.wS)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cwj.oV, xl.c("advancements.husbandry.wax_off.title"), xl.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cvw.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(lz.g.b(cwj.qL).a(), cb.a.a(cu.a.a().a($$3, cwj.qL)))
         .a(
            cwj.qL,
            xl.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xl.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cwj.vc,
            xl.c("advancements.husbandry.leash_all_frog_variants.title"),
            xl.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ag.a.a()
         .a($$16)
         .a(cwj.xJ, xl.c("advancements.husbandry.froglights.title"), xl.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cwj.xI, cwj.xK, cwj.xJ))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dil.pe, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(dcb.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dil.pe,
            xl.c("advancements.husbandry.silk_touch_nest.title"),
            xl.c("advancements.husbandry.silk_touch_nest.description"),
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
            cwj.nV,
            xl.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xl.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, bup.k).b(bw.a.a().a($$2, bup.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cwj.rx,
            xl.c("advancements.husbandry.make_a_sign_glow.title"),
            xl.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axd.aD)), cu.a.a().a($$3, cwj.rx)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cwj.sj,
            xl.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xl.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bup.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cwj.mf,
            xl.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xl.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dil.aY)), cu.a.a().a($$3, cwj.rS)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cwj.kq,
            xl.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xl.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cwj.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cwj.vA, xl.c("advancements.husbandry.feed_snifflet.title"), xl.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, axm.ab), Optional.of(bw.a(bw.a.a().a($$2, bup.aR).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cwj.vB,
            xl.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xl.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dil.kA))
         .a("pitcher_pod", cy.a.a(dil.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cwj.sm,
            xl.c("advancements.husbandry.remove_wolf_armor.title"),
            xl.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cwj.sm), Optional.of(bw.a(bw.a.a().a($$2, bup.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cwj.os,
            xl.c("advancements.husbandry.repair_wolf_armor.title"),
            xl.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dq.a.a(cu.a.a().a($$3, cwj.or), Optional.of(bw.a(bw.a.a().a($$2, bup.bs).a(bt.a.a().e(cu.a.a().a($$3, cwj.os).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bup<?>> $$2, Stream<bup<?>> $$3, Stream<bup<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwj.uC,
            xl.c("advancements.husbandry.breed_all_animals.title"),
            xl.c("advancements.husbandry.breed_all_animals.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ag.a a(jr<bup<?>> $$0, jr<cwb> $$1, ag.a $$2) {
      lz.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cwj.vc), Optional.of(bw.a(bw.a.a().a($$0, bup.R).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cwb> $$1) {
      for (cwb $$2 : f) {
         $$0.a(lz.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bup<?>> $$1, jr<bup<?>> $$2, Stream<bup<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bup.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bup.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cwb> $$1) {
      for (cwb $$2 : e) {
         $$0.a(lz.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cwb> $$1) {
      for (cwb $$2 : d) {
         $$0.a(lz.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      lz.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<chz> $$2 = $$1.d(ma.m);
      $$2.c_().sorted(Comparator.comparing(alk::a)).forEach($$2x -> {
         jq<chz> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
