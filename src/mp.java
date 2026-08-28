import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mp implements ml {
   public static final List<bvi<?>> a = List.of(
      bvi.am,
      bvi.J,
      bvi.aG,
      bvi.bb,
      bvi.C,
      bvi.aF,
      bvi.aR,
      bvi.z,
      bvi.bM,
      bvi.aJ,
      bvi.aY,
      bvi.ay,
      bvi.u,
      bvi.aO,
      bvi.ab,
      bvi.l,
      bvi.ak,
      bvi.bt,
      bvi.ai,
      bvi.h,
      bvi.t,
      bvi.e
   );
   public static final List<bvi<?>> b = List.of(bvi.bB, bvi.ac, bvi.bj);
   private static final cxc[] d = new cxc[]{cxk.rW, cxk.rY, cxk.rZ, cxk.rX};
   private static final cxc[] e = new cxc[]{cxk.ro, cxk.rp, cxk.rm, cxk.rn};
   private static final cxc[] f = new cxc[]{
      cxk.oZ,
      cxk.pW,
      cxk.qc,
      cxk.qC,
      cxk.qD,
      cxk.qF,
      cxk.qG,
      cxk.rW,
      cxk.rX,
      cxk.rY,
      cxk.rZ,
      cxk.sa,
      cxk.sb,
      cxk.sP,
      cxk.sT,
      cxk.sX,
      cxk.sY,
      cxk.sZ,
      cxk.ta,
      cxk.tb,
      cxk.tj,
      cxk.ve,
      cxk.vf,
      cxk.vg,
      cxk.vh,
      cxk.vj,
      cxk.vs,
      cxk.vA,
      cxk.vB,
      cxk.vC,
      cxk.vN,
      cxk.vO,
      cxk.wg,
      cxk.wk,
      cxk.wm,
      cxk.sU,
      cxk.wW,
      cxk.xv,
      cxk.xD,
      cxk.xw
   };
   public static final cxc[] c = new cxc[]{cxk.pu, cxk.pE, cxk.pz, cxk.pJ, cxk.pO, cxk.pT};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvi<?>> $$2 = $$0.d(mb.z);
      jr<cxc> $$3 = $$0.d(mb.K);
      jr<dkd> $$4 = $$0.d(mb.f);
      js.b<ddq> $$5 = $$0.d(mb.aO);
      ah $$6 = ag.a.a()
         .a(
            dkf.iH,
            xk.c("advancements.husbandry.root.title"),
            xk.c("advancements.husbandry.root.description"),
            alp.b("textures/gui/advancements/backgrounds/husbandry.png"),
            an.a,
            false,
            false,
            false
         )
         .a("consumed_item", bg.a.b())
         .a($$1, "husbandry/root");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cxk.qb, xk.c("advancements.husbandry.plant_seed.title"), xk.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dkf.cJ))
         .a("pumpkin_stem", cy.a.a(dkf.fr))
         .a("melon_stem", cy.a.a(dkf.fs))
         .a("beetroots", cy.a.a(dkf.lf))
         .a("nether_wart", cy.a.a(dkf.fL))
         .a("torchflower", cy.a.a(dkf.lc))
         .a("pitcher_pod", cy.a.a(dkf.ld))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cxk.qb,
            xk.c("advancements.husbandry.breed_an_animal.title"),
            xk.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cxk.oZ, xk.c("advancements.husbandry.balanced_diet.title"), xk.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cxk.pU, xk.c("advancements.husbandry.netherite_hoe.title"), xk.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cxk.pU))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cxk.vK,
            xk.c("advancements.husbandry.tame_an_animal.title"),
            xk.c("advancements.husbandry.tame_an_animal.description"),
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
            cxk.rS,
            xk.c("advancements.husbandry.fishy_business.title"),
            xk.c("advancements.husbandry.fishy_business.description"),
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
            cxk.rm,
            xk.c("advancements.husbandry.tactical_fishing.title"),
            xk.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(ma.g.b(cxk.rq).a(), cb.a.a(cu.a.a().a($$3, cxk.rq)))
         .a(
            cxk.rq,
            xk.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xk.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ag.a.a()
         .a($$12)
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bvi.h)))
         .a(
            cxk.rp,
            xk.c("advancements.husbandry.kill_axolotl_target.title"),
            xk.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cxk.rW,
            xk.c("advancements.husbandry.complete_catalogue.title"),
            xk.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cxk.sw, xk.c("advancements.husbandry.whole_pack.title"), xk.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axk.aJ)).a(true), cu.a.a().a($$3, cxk.th)))
         .a(
            cxk.xD,
            xk.c("advancements.husbandry.safely_harvest_honey.title"),
            xk.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ah $$14 = ag.a.a()
         .a($$13)
         .a(cxk.xA, xk.c("advancements.husbandry.wax_on.title"), xk.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cwx.a.get().keySet())), cu.a.a().a($$3, cxk.xA)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cxk.pz, xk.c("advancements.husbandry.wax_off.title"), xk.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cwx.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(ma.g.b(cxk.rr).a(), cb.a.a(cu.a.a().a($$3, cxk.rr)))
         .a(
            cxk.rr,
            xk.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xk.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cxk.vK,
            xk.c("advancements.husbandry.leash_all_frog_variants.title"),
            xk.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ag.a.a()
         .a($$16)
         .a(cxk.yr, xk.c("advancements.husbandry.froglights.title"), xk.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cxk.yq, cxk.ys, cxk.yr))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dkf.pG, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(ddv.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dkf.pG,
            xk.c("advancements.husbandry.silk_touch_nest.title"),
            xk.c("advancements.husbandry.silk_touch_nest.description"),
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
            cxk.ox,
            xk.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xk.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, axo.I).b(bw.a.a().a($$2, bvi.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cxk.sd,
            xk.c("advancements.husbandry.make_a_sign_glow.title"),
            xk.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axk.aE)), cu.a.a().a($$3, cxk.sd)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cxk.sP,
            xk.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xk.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bvi.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cxk.mC,
            xk.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xk.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dkf.bf)), cu.a.a().a($$3, cxk.sy)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cxk.kN,
            xk.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xk.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cxk.kN))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cxk.wi, xk.c("advancements.husbandry.feed_snifflet.title"), xk.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, axt.ac), Optional.of(bw.a(bw.a.a().a($$2, bvi.bj).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cxk.wj,
            xk.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xk.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dkf.lc))
         .a("pitcher_pod", cy.a.a(dkf.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cxk.sS,
            xk.c("advancements.husbandry.remove_wolf_armor.title"),
            xk.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cxk.sS), Optional.of(bw.a(bw.a.a().a($$2, bvi.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cxk.oW,
            xk.c("advancements.husbandry.repair_wolf_armor.title"),
            xk.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dq.a.a(cu.a.a().a($$3, cxk.oV), Optional.of(bw.a(bw.a.a().a($$2, bvi.bM).a(bt.a.a().e(cu.a.a().a($$3, cxk.oW).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bvi<?>> $$2, Stream<bvi<?>> $$3, Stream<bvi<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cxk.vj,
            xk.c("advancements.husbandry.breed_all_animals.title"),
            xk.c("advancements.husbandry.breed_all_animals.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ag.a a(jr<bvi<?>> $$0, jr<cxc> $$1, ag.a $$2) {
      ma.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cxk.vK), Optional.of(bw.a(bw.a.a().a($$0, bvi.ac).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cxc> $$1) {
      for (cxc $$2 : f) {
         $$0.a(ma.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bvi<?>> $$1, jr<bvi<?>> $$2, Stream<bvi<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bvi.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bvi.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cxc> $$1) {
      for (cxc $$2 : e) {
         $$0.a(ma.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cxc> $$1) {
      for (cxc $$2 : d) {
         $$0.a(ma.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      ma.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<cis> $$2 = $$1.d(mb.m);
      $$2.c_().sorted(Comparator.comparing(alo::a)).forEach($$2x -> {
         jq<cis> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
