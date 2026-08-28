import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mp implements ml {
   public static final List<bvm<?>> a = List.of(
      bvm.am,
      bvm.J,
      bvm.aG,
      bvm.bb,
      bvm.C,
      bvm.aF,
      bvm.aR,
      bvm.z,
      bvm.bM,
      bvm.aJ,
      bvm.aY,
      bvm.ay,
      bvm.u,
      bvm.aO,
      bvm.ab,
      bvm.l,
      bvm.ak,
      bvm.bt,
      bvm.ai,
      bvm.h,
      bvm.t,
      bvm.e
   );
   public static final List<bvm<?>> b = List.of(bvm.bB, bvm.ac, bvm.bj);
   private static final cxg[] d = new cxg[]{cxo.rN, cxo.rP, cxo.rQ, cxo.rO};
   private static final cxg[] e = new cxg[]{cxo.rf, cxo.rg, cxo.rd, cxo.re};
   private static final cxg[] f = new cxg[]{
      cxo.oQ,
      cxo.pN,
      cxo.pT,
      cxo.qt,
      cxo.qu,
      cxo.qw,
      cxo.qx,
      cxo.rN,
      cxo.rO,
      cxo.rP,
      cxo.rQ,
      cxo.rR,
      cxo.rS,
      cxo.sG,
      cxo.sK,
      cxo.sO,
      cxo.sP,
      cxo.sQ,
      cxo.sR,
      cxo.sS,
      cxo.ta,
      cxo.uV,
      cxo.uW,
      cxo.uX,
      cxo.uY,
      cxo.va,
      cxo.vj,
      cxo.vq,
      cxo.vr,
      cxo.vs,
      cxo.vD,
      cxo.vE,
      cxo.vW,
      cxo.wa,
      cxo.wc,
      cxo.sL,
      cxo.wM,
      cxo.xl,
      cxo.xt,
      cxo.xm
   };
   public static final cxg[] c = new cxg[]{cxo.pl, cxo.pv, cxo.pq, cxo.pA, cxo.pF, cxo.pK};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvm<?>> $$2 = $$0.d(mb.z);
      jr<cxg> $$3 = $$0.d(mb.K);
      jr<dke> $$4 = $$0.d(mb.f);
      js.b<ddr> $$5 = $$0.d(mb.aN);
      ah $$6 = ag.a.a()
         .a(
            dkg.iA,
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
         .a(cxo.pS, xv.c("advancements.husbandry.plant_seed.title"), xv.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dkg.cJ))
         .a("pumpkin_stem", cy.a.a(dkg.fr))
         .a("melon_stem", cy.a.a(dkg.fs))
         .a("beetroots", cy.a.a(dkg.kY))
         .a("nether_wart", cy.a.a(dkg.fE))
         .a("torchflower", cy.a.a(dkg.kV))
         .a("pitcher_pod", cy.a.a(dkg.kW))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cxo.pS,
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
         .a(cxo.oQ, xv.c("advancements.husbandry.balanced_diet.title"), xv.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cxo.pL, xv.c("advancements.husbandry.netherite_hoe.title"), xv.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cxo.pL))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cxo.vA,
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
            cxo.rJ,
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
            cxo.rd,
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
         .a(ma.g.b(cxo.rh).a(), cb.a.a(cu.a.a().a($$3, cxo.rh)))
         .a(
            cxo.rh,
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
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bvm.h)))
         .a(
            cxo.rg,
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
            cxo.rN,
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
         .a(cxo.sn, xv.c("advancements.husbandry.whole_pack.title"), xv.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axu.aJ)).a(true), cu.a.a().a($$3, cxo.sY)))
         .a(
            cxo.xt,
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
         .a(cxo.xq, xv.c("advancements.husbandry.wax_on.title"), xv.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cxb.a.get().keySet())), cu.a.a().a($$3, cxo.xq)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cxo.pq, xv.c("advancements.husbandry.wax_off.title"), xv.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cxb.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(ma.g.b(cxo.ri).a(), cb.a.a(cu.a.a().a($$3, cxo.ri)))
         .a(
            cxo.ri,
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
            cxo.vA,
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
         .a(cxo.yh, xv.c("advancements.husbandry.froglights.title"), xv.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cxo.yg, cxo.yi, cxo.yh))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dkg.pz, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(ddw.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dkg.pz,
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
            cxo.oo,
            xv.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xv.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, axy.I).b(bw.a.a().a($$2, bvm.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cxo.rU,
            xv.c("advancements.husbandry.make_a_sign_glow.title"),
            xv.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axu.aE)), cu.a.a().a($$3, cxo.rU)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cxo.sG,
            xv.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xv.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bvm.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cxo.mt,
            xv.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xv.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dkg.bf)), cu.a.a().a($$3, cxo.sp)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cxo.kE,
            xv.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xv.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cxo.kE))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cxo.vY, xv.c("advancements.husbandry.feed_snifflet.title"), xv.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, ayd.ac), Optional.of(bw.a(bw.a.a().a($$2, bvm.bj).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cxo.vZ,
            xv.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xv.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dkg.kV))
         .a("pitcher_pod", cy.a.a(dkg.kW))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cxo.sJ,
            xv.c("advancements.husbandry.remove_wolf_armor.title"),
            xv.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cxo.sJ), Optional.of(bw.a(bw.a.a().a($$2, bvm.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cxo.oN,
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
            dq.a.a(cu.a.a().a($$3, cxo.oM), Optional.of(bw.a(bw.a.a().a($$2, bvm.bM).a(bt.a.a().e(cu.a.a().a($$3, cxo.oN).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bvm<?>> $$2, Stream<bvm<?>> $$3, Stream<bvm<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cxo.va,
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

   private static ag.a a(jr<bvm<?>> $$0, jr<cxg> $$1, ag.a $$2) {
      ma.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cxo.vA), Optional.of(bw.a(bw.a.a().a($$0, bvm.ac).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cxg> $$1) {
      for (cxg $$2 : f) {
         $$0.a(ma.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bvm<?>> $$1, jr<bvm<?>> $$2, Stream<bvm<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bvm.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bvm.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cxg> $$1) {
      for (cxg $$2 : e) {
         $$0.a(ma.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cxg> $$1) {
      for (cxg $$2 : d) {
         $$0.a(ma.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      ma.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<ciw> $$2 = $$1.d(mb.m);
      $$2.c_().sorted(Comparator.comparing(aly::a)).forEach($$2x -> {
         jq<ciw> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
