import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mn implements mj {
   public static final List<bul<?>> a = List.of(
      bul.ab,
      bul.z,
      bul.at,
      bul.aJ,
      bul.w,
      bul.as,
      bul.az,
      bul.t,
      bul.bs,
      bul.au,
      bul.aG,
      bul.an,
      bul.p,
      bul.aw,
      bul.Q,
      bul.h,
      bul.Z,
      bul.aZ,
      bul.X,
      bul.f,
      bul.o,
      bul.c
   );
   public static final List<bul<?>> b = List.of(bul.bh, bul.R, bul.aR);
   private static final cvx[] d = new cvx[]{cwf.ra, cwf.rc, cwf.rd, cwf.rb};
   private static final cvx[] e = new cvx[]{cwf.qI, cwf.qJ, cwf.qG, cwf.qH};
   private static final cvx[] f = new cvx[]{
      cwf.ov,
      cwf.ps,
      cwf.py,
      cwf.pY,
      cwf.pZ,
      cwf.qb,
      cwf.qc,
      cwf.ra,
      cwf.rb,
      cwf.rc,
      cwf.rd,
      cwf.re,
      cwf.rf,
      cwf.rT,
      cwf.rX,
      cwf.sb,
      cwf.sc,
      cwf.sd,
      cwf.se,
      cwf.sf,
      cwf.sn,
      cwf.uh,
      cwf.ui,
      cwf.uj,
      cwf.uk,
      cwf.um,
      cwf.uv,
      cwf.uC,
      cwf.uD,
      cwf.uE,
      cwf.uP,
      cwf.uQ,
      cwf.vi,
      cwf.vm,
      cwf.vo,
      cwf.rY,
      cwf.vY,
      cwf.wx,
      cwf.wF,
      cwf.wy
   };
   public static final cvx[] c = new cvx[]{cwf.oQ, cwf.pa, cwf.oV, cwf.pf, cwf.pk, cwf.pp};

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bul<?>> $$2 = $$0.d(lz.z);
      jr<cvx> $$3 = $$0.d(lz.K);
      jr<die> $$4 = $$0.d(lz.f);
      js.b<dbs> $$5 = $$0.d(lz.aM);
      ah $$6 = ag.a.a()
         .a(
            dig.ij,
            xi.c("advancements.husbandry.root.title"),
            xi.c("advancements.husbandry.root.description"),
            ali.b("textures/gui/advancements/backgrounds/husbandry.png"),
            an.a,
            false,
            false,
            false
         )
         .a("consumed_item", bg.a.b())
         .a($$1, "husbandry/root");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwf.px, xi.c("advancements.husbandry.plant_seed.title"), xi.c("advancements.husbandry.plant_seed.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("wheat", cy.a.a(dig.cB))
         .a("pumpkin_stem", cy.a.a(dig.fd))
         .a("melon_stem", cy.a.a(dig.fe))
         .a("beetroots", cy.a.a(dig.kD))
         .a("nether_wart", cy.a.a(dig.fq))
         .a("torchflower", cy.a.a(dig.kA))
         .a("pitcher_pod", cy.a.a(dig.kB))
         .a($$1, "husbandry/plant_seed");
      ah $$8 = ag.a.a()
         .a($$6)
         .a(
            cwf.px,
            xi.c("advancements.husbandry.breed_an_animal.title"),
            xi.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cwf.ov, xi.c("advancements.husbandry.balanced_diet.title"), xi.c("advancements.husbandry.balanced_diet.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ag.a.a()
         .a($$7)
         .a(cwf.pq, xi.c("advancements.husbandry.netherite_hoe.title"), xi.c("advancements.husbandry.netherite_hoe.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_hoe", ci.a.a(cwf.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(
            cwf.uM,
            xi.c("advancements.husbandry.tame_an_animal.title"),
            xi.c("advancements.husbandry.tame_an_animal.description"),
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
            cwf.qW,
            xi.c("advancements.husbandry.fishy_business.title"),
            xi.c("advancements.husbandry.fishy_business.description"),
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
            cwf.qG,
            xi.c("advancements.husbandry.tactical_fishing.title"),
            xi.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(ly.g.b(cwf.qK).a(), cb.a.a(cu.a.a().a($$3, cwf.qK)))
         .a(
            cwf.qK,
            xi.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xi.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ag.a.a()
         .a($$12)
         .a("kill_axolotl_target", bp.a.a(bw.a.a().a($$2, bul.f)))
         .a(
            cwf.qJ,
            xi.c("advancements.husbandry.kill_axolotl_target.title"),
            xi.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cwf.ra,
            xi.c("advancements.husbandry.complete_catalogue.title"),
            xi.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cwf.rA, xi.c("advancements.husbandry.whole_pack.title"), xi.c("advancements.husbandry.whole_pack.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ah $$13 = ag.a.a()
         .a($$6)
         .a("safely_harvest_honey", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axa.aH)).a(true), cu.a.a().a($$3, cwf.sl)))
         .a(
            cwf.wF,
            xi.c("advancements.husbandry.safely_harvest_honey.title"),
            xi.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ah $$14 = ag.a.a()
         .a($$13)
         .a(cwf.wC, xi.c("advancements.husbandry.wax_on.title"), xi.c("advancements.husbandry.wax_on.description"), null, an.a, true, true, false)
         .a("wax_on", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cvs.a.get().keySet())), cu.a.a().a($$3, cwf.wC)))
         .a($$1, "husbandry/wax_on");
      ag.a.a()
         .a($$14)
         .a(cwf.oV, xi.c("advancements.husbandry.wax_off.title"), xi.c("advancements.husbandry.wax_off.description"), null, an.a, true, true, false)
         .a("wax_off", cy.a.a(dh.a.a().a(ax.a.a().a($$4, cvs.b.get().keySet())), cu.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ah $$15 = ag.a.a()
         .a($$6)
         .a(ly.g.b(cwf.qL).a(), cb.a.a(cu.a.a().a($$3, cwf.qL)))
         .a(
            cwf.qL,
            xi.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xi.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cwf.uM,
            xi.c("advancements.husbandry.leash_all_frog_variants.title"),
            xi.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ag.a.a()
         .a($$16)
         .a(cwf.xt, xi.c("advancements.husbandry.froglights.title"), xi.c("advancements.husbandry.froglights.description"), null, an.b, true, true, false)
         .a("froglights", ci.a.a(cwf.xs, cwf.xu, cwf.xt))
         .a($$1, "husbandry/froglights");
      ag.a.a()
         .a($$6)
         .a("silk_touch_nest", aw.a.a(dig.pe, cu.a.a().a(cw.b, cp.a(List.of(new br($$5.b(dbx.v), dj.d.b(1))))), dj.d.a(3)))
         .a(
            dig.pe,
            xi.c("advancements.husbandry.silk_touch_nest.title"),
            xi.c("advancements.husbandry.silk_touch_nest.description"),
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
            cwf.nV,
            xi.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xi.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ed.a.a(bw.a.a().a(bw.a.a().a($$2, bul.k).b(bw.a.a().a($$2, bul.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ag.a.a()
         .a($$6)
         .a(
            cwf.rh,
            xi.c("advancements.husbandry.make_a_sign_glow.title"),
            xi.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cy.a.a(dh.a.a().a(ax.a.a().a($$4, axa.aC)), cu.a.a().a($$3, cwf.rh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ah $$17 = ag.a.a()
         .a($$6)
         .a(
            cwf.rT,
            xi.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xi.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dn.a.a(Optional.empty(), Optional.empty(), Optional.of(bw.a(bw.a.a().a($$2, bul.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ag.a.a()
         .a($$17)
         .a(
            cwf.mf,
            xi.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xi.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cy.a.b(dh.a.a().a(ax.a.a().a($$4, dig.aY)), cu.a.a().a($$3, cwf.rC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ah $$18 = ag.a.a()
         .a($$6)
         .a(
            cwf.kq,
            xi.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xi.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ci.a.a(cwf.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(cwf.vk, xi.c("advancements.husbandry.feed_snifflet.title"), xi.c("advancements.husbandry.feed_snifflet.description"), null, an.a, true, true, true)
         .a("feed_snifflet", dq.a.a(cu.a.a().a($$3, axj.aa), Optional.of(bw.a(bw.a.a().a($$2, bul.aR).a(bu.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ag.a.a()
         .a($$19)
         .a(
            cwf.vl,
            xi.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xi.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a(ak.a.b)
         .a("torchflower", cy.a.a(dig.kA))
         .a("pitcher_pod", cy.a.a(dig.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ag.a.a()
         .a($$9)
         .a(
            cwf.rW,
            xi.c("advancements.husbandry.remove_wolf_armor.title"),
            xi.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dq.a.a(cu.a.a().a($$3, cwf.rW), Optional.of(bw.a(bw.a.a().a($$2, bul.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ag.a.a()
         .a($$9)
         .a(
            cwf.os,
            xi.c("advancements.husbandry.repair_wolf_armor.title"),
            xi.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dq.a.a(cu.a.a().a($$3, cwf.or), Optional.of(bw.a(bw.a.a().a($$2, bul.bs).a(bt.a.a().e(cu.a.a().a($$3, cwf.os).a(ks.a().a(ku.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bul<?>> $$2, Stream<bul<?>> $$3, Stream<bul<?>> $$4) {
      return a(ag.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwf.um,
            xi.c("advancements.husbandry.breed_all_animals.title"),
            xi.c("advancements.husbandry.breed_all_animals.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ag.a a(jr<bul<?>> $$0, jr<cvx> $$1, ag.a $$2) {
      ly.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dq.a.a(cu.a.a().a($$1, cwf.uM), Optional.of(bw.a(bw.a.a().a($$0, bul.R).a(by.b($$3)))))));
      return $$2;
   }

   private static ag.a a(ag.a $$0, jr<cvx> $$1) {
      for (cvx $$2 : f) {
         $$0.a(ly.g.b($$2).a(), bg.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0, Stream<bul<?>> $$1, jr<bul<?>> $$2, Stream<bul<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bul.a($$2x).toString(), ay.a.a(bw.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bul.a($$2x).toString(), ay.a.a(Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.of(bw.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ag.a b(ag.a $$0, jr<cvx> $$1) {
      for (cvx $$2 : e) {
         $$0.a(ly.g.b($$2).a(), cb.a.a(cu.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ag.a c(ag.a $$0, jr<cvx> $$1) {
      for (cvx $$2 : d) {
         $$0.a(ly.g.b($$2).a(), cd.a.a(Optional.empty(), Optional.empty(), Optional.of(cu.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ag.a a(ag.a $$0) {
      ly.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eh.a.a(bw.a.a().a(by.a($$1)))));
      return $$0;
   }

   private static ag.a a(ag.a $$0, js.a $$1) {
      js.b<chv> $$2 = $$1.d(lz.m);
      $$2.c_().sorted(Comparator.comparing(alh::a)).forEach($$2x -> {
         jq<chv> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eh.a.a(bw.a.a().a(by.a(ju.a($$3)))));
      });
      return $$0;
   }
}
