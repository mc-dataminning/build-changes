import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mp implements ml {
   public static final List<bvr<?>> a = List.of(
      bvr.am,
      bvr.J,
      bvr.aG,
      bvr.bb,
      bvr.C,
      bvr.aF,
      bvr.aR,
      bvr.z,
      bvr.bM,
      bvr.aJ,
      bvr.aY,
      bvr.ay,
      bvr.u,
      bvr.aO,
      bvr.ab,
      bvr.l,
      bvr.ak,
      bvr.bt,
      bvr.ai,
      bvr.h,
      bvr.t,
      bvr.e
   );
   public static final List<bvr<?>> b = List.of(bvr.bB, bvr.ac, bvr.bj);
   private static final cxl[] d = new cxl[]{cxt.rN, cxt.rP, cxt.rQ, cxt.rO};
   private static final cxl[] e = new cxl[]{cxt.rf, cxt.rg, cxt.rd, cxt.re};
   private static final cxl[] f = new cxl[]{
      cxt.oQ,
      cxt.pN,
      cxt.pT,
      cxt.qt,
      cxt.qu,
      cxt.qw,
      cxt.qx,
      cxt.rN,
      cxt.rO,
      cxt.rP,
      cxt.rQ,
      cxt.rR,
      cxt.rS,
      cxt.sG,
      cxt.sK,
      cxt.sO,
      cxt.sP,
      cxt.sQ,
      cxt.sR,
      cxt.sS,
      cxt.ta,
      cxt.uV,
      cxt.uW,
      cxt.uX,
      cxt.uY,
      cxt.va,
      cxt.vj,
      cxt.vq,
      cxt.vr,
      cxt.vs,
      cxt.vD,
      cxt.vE,
      cxt.vW,
      cxt.wa,
      cxt.wc,
      cxt.sL,
      cxt.wM,
      cxt.xl,
      cxt.xt,
      cxt.xm
   };
   public static final cxl[] c = new cxl[]{cxt.pl, cxt.pv, cxt.pq, cxt.pA, cxt.pF, cxt.pK};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvr<?>> $$2 = $$0.d(mb.z);
      jr<cxl> $$3 = $$0.d(mb.K);
      jr<dkm> $$4 = $$0.d(mb.f);
      js.b<ddz> $$5 = $$0.d(mb.aO);
      ah $$6 = ag.a.a()
         .a(
            dko.iA,
            xv.c("advancements.husbandry.root.title"),
            xv.c("advancements.husbandry.root.description"),
            alz.b("textures/gui/advancements/backgrounds/husbandry.png"),
            an.a,
            false,
            false,
            false
         )
         .a("consumed_item", bg.a.b())
         .a($$1, "husbandry/root");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cxt.pS, xv.c("advancements.husbandry.plant_seed.title"), xv.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dko.cJ))
         .a("pumpkin_stem", cy.a.a(dko.fr))
         .a("melon_stem", cy.a.a(dko.fs))
         .a("beetroots", cy.a.a(dko.kY))
         .a("nether_wart", cy.a.a(dko.fE))
         .a("torchflower", cy.a.a(dko.kV))
         .a("pitcher_pod", cy.a.a(dko.kW))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cxt.pS,
            xv.c("advancements.husbandry.breed_an_animal.title"),
            xv.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cxt.oQ, xv.c("advancements.husbandry.balanced_diet.title"), xv.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cxt.pL, xv.c("advancements.husbandry.netherite_hoe.title"), xv.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cxt.pL))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cxt.vA,
            xv.c("advancements.husbandry.tame_an_animal.title"),
            xv.c("advancements.husbandry.tame_an_animal.description"),
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
            cxt.rJ,
            xv.c("advancements.husbandry.fishy_business.title"),
            xv.c("advancements.husbandry.fishy_business.description"),
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
            cxt.rd,
            xv.c("advancements.husbandry.tactical_fishing.title"),
            xv.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(ma.g.b(cxt.rh).a(), cb.a.a(cu.a.a().a($$3, cxt.rh)))
         .a(
            cxt.rh,
            xv.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xv.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ag.a.a()
         .a($$12)
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bvr.h)))
         .a(
            cxt.rg,
            xv.c("advancements.husbandry.kill_axolotl_target.title"),
            xv.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cxt.rN,
            xv.c("advancements.husbandry.complete_catalogue.title"),
            xv.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cxt.sn, xv.c("advancements.husbandry.whole_pack.title"), xv.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axu.aJ)).a(true), cu.a.a().a($$3, cxt.sY)))
         .a(
            cxt.xt,
            xv.c("advancements.husbandry.safely_harvest_honey.title"),
            xv.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ah $$14 = ag.a.a()
         .a($$13)
         .a(cxt.xq, xv.c("advancements.husbandry.wax_on.title"), xv.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cxg.a.get().keySet())), cu.a.a().a($$3, cxt.xq)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cxt.pq, xv.c("advancements.husbandry.wax_off.title"), xv.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cxg.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(ma.g.b(cxt.ri).a(), cb.a.a(cu.a.a().a($$3, cxt.ri)))
         .a(
            cxt.ri,
            xv.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xv.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cxt.vA,
            xv.c("advancements.husbandry.leash_all_frog_variants.title"),
            xv.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ag.a.a()
         .a($$16)
         .a(cxt.yh, xv.c("advancements.husbandry.froglights.title"), xv.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cxt.yg, cxt.yi, cxt.yh))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dko.pz, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(dee.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dko.pz,
            xv.c("advancements.husbandry.silk_touch_nest.title"),
            xv.c("advancements.husbandry.silk_touch_nest.description"),
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
            cxt.oo,
            xv.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xv.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, axy.I).b(bw.a.a().a($$2, bvr.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cxt.rU,
            xv.c("advancements.husbandry.make_a_sign_glow.title"),
            xv.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axu.aE)), cu.a.a().a($$3, cxt.rU)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cxt.sG,
            xv.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xv.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bvr.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cxt.mt,
            xv.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xv.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dko.bf)), cu.a.a().a($$3, cxt.sp)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cxt.kE,
            xv.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xv.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cxt.kE))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cxt.vY, xv.c("advancements.husbandry.feed_snifflet.title"), xv.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, ayd.ac), Optional.of(bw.a(bw.a.a().a($$2, bvr.bj).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cxt.vZ,
            xv.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xv.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dko.kV))
         .a("pitcher_pod", cy.a.a(dko.kW))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cxt.sJ,
            xv.c("advancements.husbandry.remove_wolf_armor.title"),
            xv.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cxt.sJ), Optional.of(bw.a(bw.a.a().a($$2, bvr.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cxt.oN,
            xv.c("advancements.husbandry.repair_wolf_armor.title"),
            xv.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dq.a.a(cu.a.a().a($$3, cxt.oM), Optional.of(bw.a(bw.a.a().a($$2, bvr.bM).a(bt.a.a().e(cu.a.a().a($$3, cxt.oN).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bvr<?>> $$2, Stream<bvr<?>> $$3, Stream<bvr<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cxt.va,
            xv.c("advancements.husbandry.breed_all_animals.title"),
            xv.c("advancements.husbandry.breed_all_animals.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ag.a a(jr<bvr<?>> $$0, jr<cxl> $$1, ag.a $$2) {
      ma.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cxt.vA), Optional.of(bw.a(bw.a.a().a($$0, bvr.ac).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cxl> $$1) {
      for (cxl $$2 : f) {
         $$0.a(ma.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bvr<?>> $$1, jr<bvr<?>> $$2, Stream<bvr<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bvr.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bvr.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cxl> $$1) {
      for (cxl $$2 : e) {
         $$0.a(ma.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cxl> $$1) {
      for (cxl $$2 : d) {
         $$0.a(ma.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      ma.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<cjb> $$2 = $$1.d(mb.m);
      $$2.c_().sorted(Comparator.comparing(aly::a)).forEach($$2x -> {
         jq<cjb> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
