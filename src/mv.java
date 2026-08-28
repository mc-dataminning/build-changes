import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mv implements mr {
   public static final List<bwr<?>> a = List.of(
      bwr.al,
      bwr.I,
      bwr.aF,
      bwr.bb,
      bwr.C,
      bwr.aE,
      bwr.aQ,
      bwr.z,
      bwr.bM,
      bwr.aI,
      bwr.aY,
      bwr.ax,
      bwr.u,
      bwr.aN,
      bwr.aa,
      bwr.l,
      bwr.aj,
      bwr.bt,
      bwr.ah,
      bwr.h,
      bwr.t,
      bwr.e
   );
   public static final List<bwr<?>> b = List.of(bwr.bB, bwr.ab, bwr.bj);
   private static final czj[] d = new czj[]{czr.sh, czr.sj, czr.sk, czr.si};
   private static final czj[] e = new czj[]{czr.rx, czr.ry, czr.rv, czr.rw};
   private static final czj[] f = new czj[]{
      czr.pi,
      czr.qf,
      czr.ql,
      czr.qL,
      czr.qM,
      czr.qO,
      czr.qP,
      czr.sh,
      czr.si,
      czr.sj,
      czr.sk,
      czr.sl,
      czr.sm,
      czr.ta,
      czr.te,
      czr.ti,
      czr.tj,
      czr.tk,
      czr.tl,
      czr.tm,
      czr.tu,
      czr.vp,
      czr.vq,
      czr.vr,
      czr.vs,
      czr.vu,
      czr.vD,
      czr.vL,
      czr.vM,
      czr.vN,
      czr.vY,
      czr.vZ,
      czr.wr,
      czr.wv,
      czr.wx,
      czr.tf,
      czr.xh,
      czr.xG,
      czr.xO,
      czr.xH
   };
   public static final czj[] c = new czj[]{czr.pD, czr.pN, czr.pI, czr.pS, czr.pX, czr.qc};

   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bwr<?>> $$2 = $$0.e(mh.B);
      jg<czj> $$3 = $$0.e(mh.K);
      jg<dmr> $$4 = $$0.e(mh.i);
      jh<cky> $$5 = $$0.e(mh.aT);
      jh<cjd> $$6 = $$0.e(mh.aH);
      jh.b<dga> $$7 = $$0.e(mh.aR);
      aj $$8 = ai.a.a()
         .a(
            dmt.iL,
            wy.c("advancements.husbandry.root.title"),
            wy.c("advancements.husbandry.root.description"),
            alg.b("gui/advancements/backgrounds/husbandry"),
            ap.a,
            false,
            false,
            false
         )
         .a("consumed_item", bi.a.b())
         .a($$1, "husbandry/root");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(czr.qk, wy.c("advancements.husbandry.plant_seed.title"), wy.c("advancements.husbandry.plant_seed.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("wheat", cn.a.a(dmt.cM))
         .a("pumpkin_stem", cn.a.a(dmt.fv))
         .a("melon_stem", cn.a.a(dmt.fw))
         .a("beetroots", cn.a.a(dmt.lj))
         .a("nether_wart", cn.a.a(dmt.fP))
         .a("torchflower", cn.a.a(dmt.lg))
         .a("pitcher_pod", cn.a.a(dmt.lh))
         .a($$1, "husbandry/plant_seed");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(
            czr.qk,
            wy.c("advancements.husbandry.breed_an_animal.title"),
            wy.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("bred", ba.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$10, $$1, $$2, a.stream(), b.stream());
      a(ai.a.a(), $$3)
         .a($$9)
         .a(czr.pi, wy.c("advancements.husbandry.balanced_diet.title"), wy.c("advancements.husbandry.balanced_diet.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ai.a.a()
         .a($$9)
         .a(czr.qd, wy.c("advancements.husbandry.netherite_hoe.title"), wy.c("advancements.husbandry.netherite_hoe.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_hoe", ck.a.a(czr.qd))
         .a($$1, "husbandry/obtain_netherite_hoe");
      aj $$11 = ai.a.a()
         .a($$8)
         .a(
            czr.vV,
            wy.c("advancements.husbandry.tame_an_animal.title"),
            wy.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("tamed_animal", du.a.b())
         .a($$1, "husbandry/tame_an_animal");
      aj $$12 = c(ai.a.a(), $$3)
         .a($$8)
         .a(am.a.b)
         .a(
            czr.sd,
            wy.c("advancements.husbandry.fishy_business.title"),
            wy.c("advancements.husbandry.fishy_business.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      aj $$13 = b(ai.a.a(), $$3)
         .a($$12)
         .a(am.a.b)
         .a(
            czr.rv,
            wy.c("advancements.husbandry.tactical_fishing.title"),
            wy.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      aj $$14 = ai.a.a()
         .a($$13)
         .a(am.a.b)
         .a(mg.g.b(czr.rz).a(), cd.a.a(cm.a.a().a($$3, czr.rz)))
         .a(
            czr.rz,
            wy.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wy.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ai.a.a()
         .a($$14)
         .a("kill_axolotl_target", br.a.a(by.a.a().a($$2, bwr.h)))
         .a(
            czr.ry,
            wy.c("advancements.husbandry.kill_axolotl_target.title"),
            wy.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ai.a.a(), $$6)
         .a($$11)
         .a(
            czr.sh,
            wy.c("advancements.husbandry.complete_catalogue.title"),
            wy.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ai.a.a(), $$0)
         .a($$11)
         .a(czr.sH, wy.c("advancements.husbandry.whole_pack.title"), wy.c("advancements.husbandry.whole_pack.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a($$1, "husbandry/whole_pack");
      aj $$15 = ai.a.a()
         .a($$8)
         .a("safely_harvest_honey", cn.a.a(cu.a.a().a(az.a.a().a($$4, axc.aJ)).a(true), cm.a.a().a($$3, czr.ts)))
         .a(
            czr.xO,
            wy.c("advancements.husbandry.safely_harvest_honey.title"),
            wy.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      aj $$16 = ai.a.a()
         .a($$15)
         .a(czr.xL, wy.c("advancements.husbandry.wax_on.title"), wy.c("advancements.husbandry.wax_on.description"), null, ap.a, true, true, false)
         .a("wax_on", cn.a.a(cu.a.a().a(az.a.a().a($$4, cze.a.get().keySet())), cm.a.a().a($$3, czr.xL)))
         .a($$1, "husbandry/wax_on");
      ai.a.a()
         .a($$16)
         .a(czr.pI, wy.c("advancements.husbandry.wax_off.title"), wy.c("advancements.husbandry.wax_off.description"), null, ap.a, true, true, false)
         .a("wax_off", cn.a.a(cu.a.a().a(az.a.a().a($$4, cze.b.get().keySet())), cm.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      aj $$17 = ai.a.a()
         .a($$8)
         .a(mg.g.b(czr.rA).a(), cd.a.a(cm.a.a().a($$3, czr.rA)))
         .a(
            czr.rA,
            wy.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wy.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      aj $$18 = a($$2, $$3, $$5, ai.a.a())
         .a($$17)
         .a(
            czr.vV,
            wy.c("advancements.husbandry.leash_all_frog_variants.title"),
            wy.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ai.a.a()
         .a($$18)
         .a(czr.yC, wy.c("advancements.husbandry.froglights.title"), wy.c("advancements.husbandry.froglights.description"), null, ap.b, true, true, false)
         .a("froglights", ck.a.a(czr.yB, czr.yD, czr.yC))
         .a($$1, "husbandry/froglights");
      ai.a.a()
         .a($$8)
         .a("silk_touch_nest", ay.a.a(dmt.pM, cm.a.a().a(ku.b, kv.a(List.of(new bt($$7.b(dgf.v), cw.d.b(1))))), cw.d.a(3)))
         .a(
            dmt.pM,
            wy.c("advancements.husbandry.silk_touch_nest.title"),
            wy.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ai.a.a()
         .a($$8)
         .a(
            czr.oE,
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dq.a.a(by.a.a().a(by.a.a().a($$2, axf.I).b(by.a.a().a($$2, bwr.ah)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ai.a.a()
         .a($$8)
         .a(
            czr.so,
            wy.c("advancements.husbandry.make_a_sign_glow.title"),
            wy.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cn.a.a(cu.a.a().a(az.a.a().a($$4, axc.aE)), cm.a.a().a($$3, czr.so)))
         .a($$1, "husbandry/make_a_sign_glow");
      aj $$19 = ai.a.a()
         .a($$8)
         .a(
            czr.ta,
            wy.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wy.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", da.a.a(Optional.empty(), Optional.empty(), Optional.of(by.a(by.a.a().a($$2, bwr.c)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ai.a.a()
         .a($$19)
         .a(
            czr.mJ,
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cn.a.b(cu.a.a().a(az.a.a().a($$4, dmt.bf)), cm.a.a().a($$3, czr.sJ)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      aj $$20 = ai.a.a()
         .a($$8)
         .a(
            czr.kU,
            wy.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wy.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ck.a.a(czr.kU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      aj $$21 = ai.a.a()
         .a($$20)
         .a(czr.wt, wy.c("advancements.husbandry.feed_snifflet.title"), wy.c("advancements.husbandry.feed_snifflet.description"), null, ap.a, true, true, true)
         .a("feed_snifflet", dc.a.a(cm.a.a().a($$3, axk.ab), Optional.of(by.a(by.a.a().a($$2, bwr.bj).a(bw.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ai.a.a()
         .a($$21)
         .a(
            czr.wu,
            wy.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wy.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a(am.a.b)
         .a("torchflower", cn.a.a(dmt.lg))
         .a("pitcher_pod", cn.a.a(dmt.lh))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ai.a.a()
         .a($$11)
         .a(
            czr.td,
            wy.c("advancements.husbandry.remove_wolf_armor.title"),
            wy.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dc.a.a(cm.a.a().a($$3, czr.td), Optional.of(by.a(by.a.a().a($$2, bwr.bM)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ai.a.a()
         .a($$11)
         .a(
            czr.pf,
            wy.c("advancements.husbandry.repair_wolf_armor.title"),
            wy.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dc.a.a(cm.a.a().a($$3, czr.pe), Optional.of(by.a(by.a.a().a($$2, bwr.bM).a(bv.a.a().e(cm.a.a().a($$3, czr.pf).a(ke.a(kk.e, 0)))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jg<bwr<?>> $$2, Stream<bwr<?>> $$3, Stream<bwr<?>> $$4) {
      return a(ai.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            czr.vu,
            wy.c("advancements.husbandry.breed_all_animals.title"),
            wy.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ai.a a(jg<bwr<?>> $$0, jg<czj> $$1, jh<cky> $$2, ai.a $$3) {
      $$2.c().forEach($$3x -> $$3.a($$3x.h().a().toString(), dc.a.a(cm.a.a().a($$1, czr.vV), Optional.of(by.a(by.a.a().a($$0, bwr.ab).a(ke.a(kk.aK, $$3x)))))));
      return $$3;
   }

   private static ai.a a(ai.a $$0, jg<czj> $$1) {
      for (czj $$2 : f) {
         $$0.a(mg.g.b($$2).a(), bi.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, Stream<bwr<?>> $$1, jg<bwr<?>> $$2, Stream<bwr<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bwr.a($$2x).toString(), ba.a.a(by.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bwr.a($$2x).toString(), ba.a.a(Optional.of(by.a.a().a($$2, $$2x).b()), Optional.of(by.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ai.a b(ai.a $$0, jg<czj> $$1) {
      for (czj $$2 : e) {
         $$0.a(mg.g.b($$2).a(), cd.a.a(cm.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ai.a c(ai.a $$0, jg<czj> $$1) {
      for (czj $$2 : d) {
         $$0.a(mg.g.b($$2).a(), cf.a.a(Optional.empty(), Optional.empty(), Optional.of(cm.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, jh<cjd> $$1) {
      $$1.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1x -> $$0.a($$1x.h().a().toString(), du.a.a(by.a.a().a(ke.a(kk.aP, $$1x)))));
      return $$0;
   }

   private static ai.a a(ai.a $$0, jh.a $$1) {
      jh.b<cme> $$2 = $$1.e(mh.bm);
      $$2.c_().sorted(Comparator.comparing(alf::a)).forEach($$2x -> {
         jf<cme> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), du.a.a(by.a.a().a(ke.a(kk.aw, $$3))));
      });
      return $$0;
   }
}
