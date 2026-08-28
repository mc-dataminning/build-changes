import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mw implements ms {
   public static final List<bxn<?>> a = List.of(
      bxn.am,
      bxn.J,
      bxn.aG,
      bxn.bc,
      bxn.D,
      bxn.aF,
      bxn.aR,
      bxn.A,
      bxn.bN,
      bxn.aJ,
      bxn.aZ,
      bxn.ay,
      bxn.v,
      bxn.aO,
      bxn.ab,
      bxn.m,
      bxn.ak,
      bxn.bu,
      bxn.ai,
      bxn.i,
      bxn.u,
      bxn.f
   );
   public static final List<bxn<?>> b = List.of(bxn.bC, bxn.ac, bxn.bk);
   private static final dag[] d = new dag[]{dao.sh, dao.sj, dao.sk, dao.si};
   private static final dag[] e = new dag[]{dao.rx, dao.ry, dao.rv, dao.rw};
   private static final dag[] f = new dag[]{
      dao.pi,
      dao.qf,
      dao.ql,
      dao.qL,
      dao.qM,
      dao.qO,
      dao.qP,
      dao.sh,
      dao.si,
      dao.sj,
      dao.sk,
      dao.sl,
      dao.sm,
      dao.ta,
      dao.te,
      dao.ti,
      dao.tj,
      dao.tk,
      dao.tl,
      dao.tm,
      dao.tu,
      dao.vp,
      dao.vq,
      dao.vr,
      dao.vs,
      dao.vu,
      dao.vD,
      dao.vL,
      dao.vM,
      dao.vN,
      dao.vY,
      dao.vZ,
      dao.wr,
      dao.wv,
      dao.wx,
      dao.tf,
      dao.xh,
      dao.xG,
      dao.xO,
      dao.xH
   };
   public static final dag[] c = new dag[]{dao.pD, dao.pN, dao.pI, dao.pS, dao.pX, dao.qc};
   private static final Comparator<jg.c<?>> g = Comparator.comparing($$0 -> $$0.h().a());

   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxn<?>> $$2 = $$0.e(mi.B);
      jh<dag> $$3 = $$0.e(mi.K);
      jh<dno> $$4 = $$0.e(mi.i);
      ji<clu> $$5 = $$0.e(mi.aT);
      ji<cjz> $$6 = $$0.e(mi.aH);
      ji<cna> $$7 = $$0.e(mi.bm);
      ji.b<dgx> $$8 = $$0.e(mi.aR);
      aj $$9 = ai.a.a()
         .a(
            dnq.iL,
            xg.c("advancements.husbandry.root.title"),
            xg.c("advancements.husbandry.root.description"),
            alr.b("gui/advancements/backgrounds/husbandry"),
            ap.a,
            false,
            false,
            false
         )
         .a("consumed_item", bi.a.b())
         .a($$1, "husbandry/root");
      aj $$10 = ai.a.a()
         .a($$9)
         .a(dao.qk, xg.c("advancements.husbandry.plant_seed.title"), xg.c("advancements.husbandry.plant_seed.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("wheat", co.a.a(dnq.cM))
         .a("pumpkin_stem", co.a.a(dnq.fv))
         .a("melon_stem", co.a.a(dnq.fw))
         .a("beetroots", co.a.a(dnq.lj))
         .a("nether_wart", co.a.a(dnq.fP))
         .a("torchflower", co.a.a(dnq.lg))
         .a("pitcher_pod", co.a.a(dnq.lh))
         .a($$1, "husbandry/plant_seed");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(
            dao.qk,
            xg.c("advancements.husbandry.breed_an_animal.title"),
            xg.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("bred", ba.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$11, $$1, $$2, a.stream(), b.stream());
      a(ai.a.a(), $$3)
         .a($$10)
         .a(dao.pi, xg.c("advancements.husbandry.balanced_diet.title"), xg.c("advancements.husbandry.balanced_diet.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ai.a.a()
         .a($$10)
         .a(dao.qd, xg.c("advancements.husbandry.netherite_hoe.title"), xg.c("advancements.husbandry.netherite_hoe.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_hoe", cl.a.a(dao.qd))
         .a($$1, "husbandry/obtain_netherite_hoe");
      aj $$12 = ai.a.a()
         .a($$9)
         .a(
            dao.vV,
            xg.c("advancements.husbandry.tame_an_animal.title"),
            xg.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dv.a.b())
         .a($$1, "husbandry/tame_an_animal");
      aj $$13 = c(ai.a.a(), $$3)
         .a($$9)
         .a(am.a.b)
         .a(
            dao.sd,
            xg.c("advancements.husbandry.fishy_business.title"),
            xg.c("advancements.husbandry.fishy_business.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      aj $$14 = b(ai.a.a(), $$3)
         .a($$13)
         .a(am.a.b)
         .a(
            dao.rv,
            xg.c("advancements.husbandry.tactical_fishing.title"),
            xg.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(am.a.b)
         .a(mh.g.b(dao.rz).a(), ce.a.a(cn.a.a().a($$3, dao.rz)))
         .a(
            dao.rz,
            xg.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xg.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ai.a.a()
         .a($$15)
         .a("kill_axolotl_target", bs.a.a(bz.a.a().a($$2, bxn.i)))
         .a(
            dao.ry,
            xg.c("advancements.husbandry.kill_axolotl_target.title"),
            xg.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ai.a.a(), $$6)
         .a($$12)
         .a(
            dao.sh,
            xg.c("advancements.husbandry.complete_catalogue.title"),
            xg.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      b(ai.a.a(), $$7)
         .a($$12)
         .a(dao.sH, xg.c("advancements.husbandry.whole_pack.title"), xg.c("advancements.husbandry.whole_pack.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a($$1, "husbandry/whole_pack");
      aj $$16 = ai.a.a()
         .a($$9)
         .a("safely_harvest_honey", co.a.a(cv.a.a().a(az.a.a().a($$4, axn.aJ)).a(true), cn.a.a().a($$3, dao.ts)))
         .a(
            dao.xO,
            xg.c("advancements.husbandry.safely_harvest_honey.title"),
            xg.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      aj $$17 = ai.a.a()
         .a($$16)
         .a(dao.xL, xg.c("advancements.husbandry.wax_on.title"), xg.c("advancements.husbandry.wax_on.description"), null, ap.a, true, true, false)
         .a("wax_on", co.a.a(cv.a.a().a(az.a.a().a($$4, dab.a.get().keySet())), cn.a.a().a($$3, dao.xL)))
         .a($$1, "husbandry/wax_on");
      ai.a.a()
         .a($$17)
         .a(dao.pI, xg.c("advancements.husbandry.wax_off.title"), xg.c("advancements.husbandry.wax_off.description"), null, ap.a, true, true, false)
         .a("wax_off", co.a.a(cv.a.a().a(az.a.a().a($$4, dab.b.get().keySet())), cn.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      aj $$18 = ai.a.a()
         .a($$9)
         .a(mh.g.b(dao.rA).a(), ce.a.a(cn.a.a().a($$3, dao.rA)))
         .a(
            dao.rA,
            xg.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xg.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      aj $$19 = a($$2, $$3, $$5, ai.a.a())
         .a($$18)
         .a(
            dao.vV,
            xg.c("advancements.husbandry.leash_all_frog_variants.title"),
            xg.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ai.a.a()
         .a($$19)
         .a(dao.yC, xg.c("advancements.husbandry.froglights.title"), xg.c("advancements.husbandry.froglights.description"), null, ap.b, true, true, false)
         .a("froglights", cl.a.a(dao.yB, dao.yD, dao.yC))
         .a($$1, "husbandry/froglights");
      ai.a.a()
         .a($$9)
         .a("silk_touch_nest", ay.a.a(dnq.pM, cn.a.a().a(bo.a.a().a(kv.b, kw.a(List.of(new bu($$8.b(dhc.v), cx.d.b(1))))).b()), cx.d.a(3)))
         .a(
            dnq.pM,
            xg.c("advancements.husbandry.silk_touch_nest.title"),
            xg.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ai.a.a()
         .a($$9)
         .a(
            dao.oE,
            xg.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xg.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dr.a.a(bz.a.a().a(bz.a.a().a($$2, axq.I).b(bz.a.a().a($$2, bxn.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ai.a.a()
         .a($$9)
         .a(
            dao.so,
            xg.c("advancements.husbandry.make_a_sign_glow.title"),
            xg.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", co.a.a(cv.a.a().a(az.a.a().a($$4, axn.aE)), cn.a.a().a($$3, dao.so)))
         .a($$1, "husbandry/make_a_sign_glow");
      aj $$20 = ai.a.a()
         .a($$9)
         .a(
            dao.ta,
            xg.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xg.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", db.a.a(Optional.empty(), Optional.empty(), Optional.of(bz.a(bz.a.a().a($$2, bxn.d)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ai.a.a()
         .a($$20)
         .a(
            dao.mJ,
            xg.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xg.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", co.a.b(cv.a.a().a(az.a.a().a($$4, dnq.bf)), cn.a.a().a($$3, dao.sJ)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      aj $$21 = ai.a.a()
         .a($$9)
         .a(
            dao.kU,
            xg.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xg.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cl.a.a(dao.kU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      aj $$22 = ai.a.a()
         .a($$21)
         .a(dao.wt, xg.c("advancements.husbandry.feed_snifflet.title"), xg.c("advancements.husbandry.feed_snifflet.description"), null, ap.a, true, true, true)
         .a("feed_snifflet", dd.a.a(cn.a.a().a($$3, axv.ac), Optional.of(bz.a(bz.a.a().a($$2, bxn.bk).a(bx.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ai.a.a()
         .a($$22)
         .a(
            dao.wu,
            xg.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xg.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a(am.a.b)
         .a("torchflower", co.a.a(dnq.lg))
         .a("pitcher_pod", co.a.a(dnq.lh))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ai.a.a()
         .a($$12)
         .a(
            dao.td,
            xg.c("advancements.husbandry.remove_wolf_armor.title"),
            xg.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dd.a.a(cn.a.a().a($$3, dao.td), Optional.of(bz.a(bz.a.a().a($$2, bxn.bN)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ai.a.a()
         .a($$12)
         .a(
            dao.pf,
            xg.c("advancements.husbandry.repair_wolf_armor.title"),
            xg.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dd.a.a(cn.a.a().a($$3, dao.pe), Optional.of(bz.a(bz.a.a().a($$2, bxn.bN).a(bw.a.a().e(cn.a.a().a($$3, dao.pf).a(bo.a.a().a(kf.a(kl.e, 0)).b()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jh<bxn<?>> $$2, Stream<bxn<?>> $$3, Stream<bxn<?>> $$4) {
      return a(ai.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            dao.vu,
            xg.c("advancements.husbandry.breed_all_animals.title"),
            xg.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ai.a a(jh<bxn<?>> $$0, jh<dag> $$1, ji<clu> $$2, ai.a $$3) {
      a($$2)
         .forEach(
            $$3x -> $$3.a(
                  $$3x.h().a().toString(), dd.a.a(cn.a.a().a($$1, dao.vV), Optional.of(bz.a(bz.a.a().a($$0, bxn.ac).a(bo.a.a().a(kf.a(kl.aK, $$3x)).b()))))
               )
         );
      return $$3;
   }

   private static <T> Stream<jg.c<T>> a(ji<T> $$0) {
      return $$0.c().sorted(g);
   }

   private static ai.a a(ai.a $$0, jh<dag> $$1) {
      for (dag $$2 : f) {
         $$0.a(mh.g.b($$2).a(), bi.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, Stream<bxn<?>> $$1, jh<bxn<?>> $$2, Stream<bxn<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bxn.a($$2x).toString(), ba.a.a(bz.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bxn.a($$2x).toString(), ba.a.a(Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ai.a b(ai.a $$0, jh<dag> $$1) {
      for (dag $$2 : e) {
         $$0.a(mh.g.b($$2).a(), ce.a.a(cn.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ai.a c(ai.a $$0, jh<dag> $$1) {
      for (dag $$2 : d) {
         $$0.a(mh.g.b($$2).a(), cg.a.a(Optional.empty(), Optional.empty(), Optional.of(cn.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, ji<cjz> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kf.a(kl.aP, $$1x)).b()))));
      return $$0;
   }

   private static ai.a b(ai.a $$0, ji<cna> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kf.a(kl.aw, $$1x)).b()))));
      return $$0;
   }
}
