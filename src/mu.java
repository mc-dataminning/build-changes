import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mu implements mq {
   public static final List<bwj<?>> a = List.of(
      bwj.al,
      bwj.I,
      bwj.aF,
      bwj.bb,
      bwj.C,
      bwj.aE,
      bwj.aQ,
      bwj.z,
      bwj.bM,
      bwj.aI,
      bwj.aY,
      bwj.ax,
      bwj.u,
      bwj.aN,
      bwj.aa,
      bwj.l,
      bwj.aj,
      bwj.bt,
      bwj.ah,
      bwj.h,
      bwj.t,
      bwj.e
   );
   public static final List<bwj<?>> b = List.of(bwj.bB, bwj.ab, bwj.bj);
   private static final cyo[] d = new cyo[]{cyw.sa, cyw.sc, cyw.sd, cyw.sb};
   private static final cyo[] e = new cyo[]{cyw.rs, cyw.rt, cyw.rq, cyw.rr};
   private static final cyo[] f = new cyo[]{
      cyw.pd,
      cyw.qa,
      cyw.qg,
      cyw.qG,
      cyw.qH,
      cyw.qJ,
      cyw.qK,
      cyw.sa,
      cyw.sb,
      cyw.sc,
      cyw.sd,
      cyw.se,
      cyw.sf,
      cyw.sT,
      cyw.sX,
      cyw.tb,
      cyw.tc,
      cyw.td,
      cyw.te,
      cyw.tf,
      cyw.tn,
      cyw.vi,
      cyw.vj,
      cyw.vk,
      cyw.vl,
      cyw.vn,
      cyw.vw,
      cyw.vE,
      cyw.vF,
      cyw.vG,
      cyw.vR,
      cyw.vS,
      cyw.wk,
      cyw.wo,
      cyw.wq,
      cyw.sY,
      cyw.xa,
      cyw.xz,
      cyw.xH,
      cyw.xA
   };
   public static final cyo[] c = new cyo[]{cyw.py, cyw.pI, cyw.pD, cyw.pN, cyw.pS, cyw.pX};

   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwj<?>> $$2 = $$0.e(mg.B);
      jf<cyo> $$3 = $$0.e(mg.K);
      jf<dlu> $$4 = $$0.e(mg.i);
      jg<ckn> $$5 = $$0.e(mg.aR);
      jg<cis> $$6 = $$0.e(mg.aH);
      jg.b<dff> $$7 = $$0.e(mg.aP);
      ai $$8 = ah.a.a()
         .a(
            dlw.iH,
            ww.c("advancements.husbandry.root.title"),
            ww.c("advancements.husbandry.root.description"),
            ale.b("gui/advancements/backgrounds/husbandry"),
            ao.a,
            false,
            false,
            false
         )
         .a("consumed_item", bh.a.b())
         .a($$1, "husbandry/root");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cyw.qf, ww.c("advancements.husbandry.plant_seed.title"), ww.c("advancements.husbandry.plant_seed.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("wheat", cm.a.a(dlw.cJ))
         .a("pumpkin_stem", cm.a.a(dlw.fr))
         .a("melon_stem", cm.a.a(dlw.fs))
         .a("beetroots", cm.a.a(dlw.lf))
         .a("nether_wart", cm.a.a(dlw.fL))
         .a("torchflower", cm.a.a(dlw.lc))
         .a("pitcher_pod", cm.a.a(dlw.ld))
         .a($$1, "husbandry/plant_seed");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(
            cyw.qf,
            ww.c("advancements.husbandry.breed_an_animal.title"),
            ww.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("bred", az.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$10, $$1, $$2, a.stream(), b.stream());
      a(ah.a.a(), $$3)
         .a($$9)
         .a(cyw.pd, ww.c("advancements.husbandry.balanced_diet.title"), ww.c("advancements.husbandry.balanced_diet.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ah.a.a()
         .a($$9)
         .a(cyw.pY, ww.c("advancements.husbandry.netherite_hoe.title"), ww.c("advancements.husbandry.netherite_hoe.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_hoe", cj.a.a(cyw.pY))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ai $$11 = ah.a.a()
         .a($$8)
         .a(
            cyw.vO,
            ww.c("advancements.husbandry.tame_an_animal.title"),
            ww.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dt.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ai $$12 = c(ah.a.a(), $$3)
         .a($$8)
         .a(al.a.b)
         .a(
            cyw.rW,
            ww.c("advancements.husbandry.fishy_business.title"),
            ww.c("advancements.husbandry.fishy_business.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ai $$13 = b(ah.a.a(), $$3)
         .a($$12)
         .a(al.a.b)
         .a(
            cyw.rq,
            ww.c("advancements.husbandry.tactical_fishing.title"),
            ww.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ai $$14 = ah.a.a()
         .a($$13)
         .a(al.a.b)
         .a(mf.g.b(cyw.ru).a(), cc.a.a(cl.a.a().a($$3, cyw.ru)))
         .a(
            cyw.ru,
            ww.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            ww.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ah.a.a()
         .a($$14)
         .a("kill_axolotl_target", bq.a.a(bx.a.a().a($$2, bwj.h)))
         .a(
            cyw.rt,
            ww.c("advancements.husbandry.kill_axolotl_target.title"),
            ww.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ah.a.a(), $$6)
         .a($$11)
         .a(
            cyw.sa,
            ww.c("advancements.husbandry.complete_catalogue.title"),
            ww.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ah.a.a(), $$0)
         .a($$11)
         .a(cyw.sA, ww.c("advancements.husbandry.whole_pack.title"), ww.c("advancements.husbandry.whole_pack.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ai $$15 = ah.a.a()
         .a($$8)
         .a("safely_harvest_honey", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axa.aJ)).a(true), cl.a.a().a($$3, cyw.tl)))
         .a(
            cyw.xH,
            ww.c("advancements.husbandry.safely_harvest_honey.title"),
            ww.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ai $$16 = ah.a.a()
         .a($$15)
         .a(cyw.xE, ww.c("advancements.husbandry.wax_on.title"), ww.c("advancements.husbandry.wax_on.description"), null, ao.a, true, true, false)
         .a("wax_on", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyj.a.get().keySet())), cl.a.a().a($$3, cyw.xE)))
         .a($$1, "husbandry/wax_on");
      ah.a.a()
         .a($$16)
         .a(cyw.pD, ww.c("advancements.husbandry.wax_off.title"), ww.c("advancements.husbandry.wax_off.description"), null, ao.a, true, true, false)
         .a("wax_off", cm.a.a(ct.a.a().a(ay.a.a().a($$4, cyj.b.get().keySet())), cl.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ai $$17 = ah.a.a()
         .a($$8)
         .a(mf.g.b(cyw.rv).a(), cc.a.a(cl.a.a().a($$3, cyw.rv)))
         .a(
            cyw.rv,
            ww.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            ww.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ai $$18 = a($$2, $$3, $$5, ah.a.a())
         .a($$17)
         .a(
            cyw.vO,
            ww.c("advancements.husbandry.leash_all_frog_variants.title"),
            ww.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ah.a.a()
         .a($$18)
         .a(cyw.yv, ww.c("advancements.husbandry.froglights.title"), ww.c("advancements.husbandry.froglights.description"), null, ao.b, true, true, false)
         .a("froglights", cj.a.a(cyw.yu, cyw.yw, cyw.yv))
         .a($$1, "husbandry/froglights");
      ah.a.a()
         .a($$8)
         .a("silk_touch_nest", ax.a.a(dlw.pI, cl.a.a().a(kt.b, ku.a(List.of(new bs($$7.b(dfk.v), cv.d.b(1))))), cv.d.a(3)))
         .a(
            dlw.pI,
            ww.c("advancements.husbandry.silk_touch_nest.title"),
            ww.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ah.a.a()
         .a($$8)
         .a(
            cyw.oz,
            ww.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ww.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dp.a.a(bx.a.a().a(bx.a.a().a($$2, axd.I).b(bx.a.a().a($$2, bwj.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ah.a.a()
         .a($$8)
         .a(
            cyw.sh,
            ww.c("advancements.husbandry.make_a_sign_glow.title"),
            ww.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cm.a.a(ct.a.a().a(ay.a.a().a($$4, axa.aE)), cl.a.a().a($$3, cyw.sh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ai $$19 = ah.a.a()
         .a($$8)
         .a(
            cyw.sT,
            ww.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ww.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cz.a.a(Optional.empty(), Optional.empty(), Optional.of(bx.a(bx.a.a().a($$2, bwj.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ah.a.a()
         .a($$19)
         .a(
            cyw.mE,
            ww.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ww.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cm.a.b(ct.a.a().a(ay.a.a().a($$4, dlw.bf)), cl.a.a().a($$3, cyw.sC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ai $$20 = ah.a.a()
         .a($$8)
         .a(
            cyw.kP,
            ww.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ww.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cj.a.a(cyw.kP))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ai $$21 = ah.a.a()
         .a($$20)
         .a(cyw.wm, ww.c("advancements.husbandry.feed_snifflet.title"), ww.c("advancements.husbandry.feed_snifflet.description"), null, ao.a, true, true, true)
         .a("feed_snifflet", db.a.a(cl.a.a().a($$3, axi.aa), Optional.of(bx.a(bx.a.a().a($$2, bwj.bj).a(bv.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ah.a.a()
         .a($$21)
         .a(
            cyw.wn,
            ww.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ww.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a(al.a.b)
         .a("torchflower", cm.a.a(dlw.lc))
         .a("pitcher_pod", cm.a.a(dlw.ld))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ah.a.a()
         .a($$11)
         .a(
            cyw.sW,
            ww.c("advancements.husbandry.remove_wolf_armor.title"),
            ww.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", db.a.a(cl.a.a().a($$3, cyw.sW), Optional.of(bx.a(bx.a.a().a($$2, bwj.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ah.a.a()
         .a($$11)
         .a(
            cyw.pa,
            ww.c("advancements.husbandry.repair_wolf_armor.title"),
            ww.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            db.a.a(cl.a.a().a($$3, cyw.oZ), Optional.of(bx.a(bx.a.a().a($$2, bwj.bM).a(bu.a.a().e(cl.a.a().a($$3, cyw.pa).a(kd.a(kj.e, 0)))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jf<bwj<?>> $$2, Stream<bwj<?>> $$3, Stream<bwj<?>> $$4) {
      return a(ah.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cyw.vn,
            ww.c("advancements.husbandry.breed_all_animals.title"),
            ww.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ah.a a(jf<bwj<?>> $$0, jf<cyo> $$1, jg<ckn> $$2, ah.a $$3) {
      $$2.c().forEach($$3x -> $$3.a($$3x.h().a().toString(), db.a.a(cl.a.a().a($$1, cyw.vO), Optional.of(bx.a(bx.a.a().a($$0, bwj.ab).a(kd.a(kj.aH, $$3x)))))));
      return $$3;
   }

   private static ah.a a(ah.a $$0, jf<cyo> $$1) {
      for (cyo $$2 : f) {
         $$0.a(mf.g.b($$2).a(), bh.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, Stream<bwj<?>> $$1, jf<bwj<?>> $$2, Stream<bwj<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bwj.a($$2x).toString(), az.a.a(bx.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bwj.a($$2x).toString(), az.a.a(Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.of(bx.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ah.a b(ah.a $$0, jf<cyo> $$1) {
      for (cyo $$2 : e) {
         $$0.a(mf.g.b($$2).a(), cc.a.a(cl.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ah.a c(ah.a $$0, jf<cyo> $$1) {
      for (cyo $$2 : d) {
         $$0.a(mf.g.b($$2).a(), ce.a.a(Optional.empty(), Optional.empty(), Optional.of(cl.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ah.a a(ah.a $$0, jg<cis> $$1) {
      $$1.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1x -> $$0.a($$1x.h().a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aM, $$1x)))));
      return $$0;
   }

   private static ah.a a(ah.a $$0, jg.a $$1) {
      jg.b<cjv> $$2 = $$1.e(mg.bk);
      $$2.c_().sorted(Comparator.comparing(ald::a)).forEach($$2x -> {
         je<cjv> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), dt.a.a(bx.a.a().a(kd.a(kj.aw, $$3))));
      });
      return $$0;
   }
}
