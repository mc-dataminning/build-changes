import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mw implements ms {
   public static final List<bxe<?>> a = List.of(
      bxe.am,
      bxe.J,
      bxe.aG,
      bxe.bc,
      bxe.D,
      bxe.aF,
      bxe.aR,
      bxe.A,
      bxe.bN,
      bxe.aJ,
      bxe.aZ,
      bxe.ay,
      bxe.v,
      bxe.aO,
      bxe.ab,
      bxe.m,
      bxe.ak,
      bxe.bu,
      bxe.ai,
      bxe.i,
      bxe.u,
      bxe.f
   );
   public static final List<bxe<?>> b = List.of(bxe.bC, bxe.ac, bxe.bk);
   private static final czw[] d = new czw[]{dae.sh, dae.sj, dae.sk, dae.si};
   private static final czw[] e = new czw[]{dae.rx, dae.ry, dae.rv, dae.rw};
   private static final czw[] f = new czw[]{
      dae.pi,
      dae.qf,
      dae.ql,
      dae.qL,
      dae.qM,
      dae.qO,
      dae.qP,
      dae.sh,
      dae.si,
      dae.sj,
      dae.sk,
      dae.sl,
      dae.sm,
      dae.ta,
      dae.te,
      dae.ti,
      dae.tj,
      dae.tk,
      dae.tl,
      dae.tm,
      dae.tu,
      dae.vp,
      dae.vq,
      dae.vr,
      dae.vs,
      dae.vu,
      dae.vD,
      dae.vL,
      dae.vM,
      dae.vN,
      dae.vY,
      dae.vZ,
      dae.wr,
      dae.wv,
      dae.wx,
      dae.tf,
      dae.xh,
      dae.xG,
      dae.xO,
      dae.xH
   };
   public static final czw[] c = new czw[]{dae.pD, dae.pN, dae.pI, dae.pS, dae.pX, dae.qc};
   private static final Comparator<jg.c<?>> g = Comparator.comparing($$0 -> $$0.h().a());

   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxe<?>> $$2 = $$0.e(mi.B);
      jh<czw> $$3 = $$0.e(mi.K);
      jh<dne> $$4 = $$0.e(mi.i);
      ji<cll> $$5 = $$0.e(mi.aT);
      ji<cjq> $$6 = $$0.e(mi.aH);
      ji<cmr> $$7 = $$0.e(mi.bm);
      ji.b<dgn> $$8 = $$0.e(mi.aR);
      aj $$9 = ai.a.a()
         .a(
            dng.iL,
            xc.c("advancements.husbandry.root.title"),
            xc.c("advancements.husbandry.root.description"),
            alk.b("gui/advancements/backgrounds/husbandry"),
            ap.a,
            false,
            false,
            false
         )
         .a("consumed_item", bi.a.b())
         .a($$1, "husbandry/root");
      aj $$10 = ai.a.a()
         .a($$9)
         .a(dae.qk, xc.c("advancements.husbandry.plant_seed.title"), xc.c("advancements.husbandry.plant_seed.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("wheat", co.a.a(dng.cM))
         .a("pumpkin_stem", co.a.a(dng.fv))
         .a("melon_stem", co.a.a(dng.fw))
         .a("beetroots", co.a.a(dng.lj))
         .a("nether_wart", co.a.a(dng.fP))
         .a("torchflower", co.a.a(dng.lg))
         .a("pitcher_pod", co.a.a(dng.lh))
         .a($$1, "husbandry/plant_seed");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(
            dae.qk,
            xc.c("advancements.husbandry.breed_an_animal.title"),
            xc.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(dae.pi, xc.c("advancements.husbandry.balanced_diet.title"), xc.c("advancements.husbandry.balanced_diet.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ai.a.a()
         .a($$10)
         .a(dae.qd, xc.c("advancements.husbandry.netherite_hoe.title"), xc.c("advancements.husbandry.netherite_hoe.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_hoe", cl.a.a(dae.qd))
         .a($$1, "husbandry/obtain_netherite_hoe");
      aj $$12 = ai.a.a()
         .a($$9)
         .a(
            dae.vV,
            xc.c("advancements.husbandry.tame_an_animal.title"),
            xc.c("advancements.husbandry.tame_an_animal.description"),
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
            dae.sd,
            xc.c("advancements.husbandry.fishy_business.title"),
            xc.c("advancements.husbandry.fishy_business.description"),
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
            dae.rv,
            xc.c("advancements.husbandry.tactical_fishing.title"),
            xc.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(mh.g.b(dae.rz).a(), ce.a.a(cn.a.a().a($$3, dae.rz)))
         .a(
            dae.rz,
            xc.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xc.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ai.a.a()
         .a($$15)
         .a("kill_axolotl_target", bs.a.a(bz.a.a().a($$2, bxe.i)))
         .a(
            dae.ry,
            xc.c("advancements.husbandry.kill_axolotl_target.title"),
            xc.c("advancements.husbandry.kill_axolotl_target.description"),
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
            dae.sh,
            xc.c("advancements.husbandry.complete_catalogue.title"),
            xc.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(dae.sH, xc.c("advancements.husbandry.whole_pack.title"), xc.c("advancements.husbandry.whole_pack.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a($$1, "husbandry/whole_pack");
      aj $$16 = ai.a.a()
         .a($$9)
         .a("safely_harvest_honey", co.a.a(cv.a.a().a(az.a.a().a($$4, axg.aJ)).a(true), cn.a.a().a($$3, dae.ts)))
         .a(
            dae.xO,
            xc.c("advancements.husbandry.safely_harvest_honey.title"),
            xc.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      aj $$17 = ai.a.a()
         .a($$16)
         .a(dae.xL, xc.c("advancements.husbandry.wax_on.title"), xc.c("advancements.husbandry.wax_on.description"), null, ap.a, true, true, false)
         .a("wax_on", co.a.a(cv.a.a().a(az.a.a().a($$4, czr.a.get().keySet())), cn.a.a().a($$3, dae.xL)))
         .a($$1, "husbandry/wax_on");
      ai.a.a()
         .a($$17)
         .a(dae.pI, xc.c("advancements.husbandry.wax_off.title"), xc.c("advancements.husbandry.wax_off.description"), null, ap.a, true, true, false)
         .a("wax_off", co.a.a(cv.a.a().a(az.a.a().a($$4, czr.b.get().keySet())), cn.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      aj $$18 = ai.a.a()
         .a($$9)
         .a(mh.g.b(dae.rA).a(), ce.a.a(cn.a.a().a($$3, dae.rA)))
         .a(
            dae.rA,
            xc.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xc.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            dae.vV,
            xc.c("advancements.husbandry.leash_all_frog_variants.title"),
            xc.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ai.a.a()
         .a($$19)
         .a(dae.yC, xc.c("advancements.husbandry.froglights.title"), xc.c("advancements.husbandry.froglights.description"), null, ap.b, true, true, false)
         .a("froglights", cl.a.a(dae.yB, dae.yD, dae.yC))
         .a($$1, "husbandry/froglights");
      ai.a.a()
         .a($$9)
         .a("silk_touch_nest", ay.a.a(dng.pM, cn.a.a().a(bo.a.a().a(kv.b, kw.a(List.of(new bu($$8.b(dgs.v), cx.d.b(1))))).b()), cx.d.a(3)))
         .a(
            dng.pM,
            xc.c("advancements.husbandry.silk_touch_nest.title"),
            xc.c("advancements.husbandry.silk_touch_nest.description"),
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
            dae.oE,
            xc.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xc.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dr.a.a(bz.a.a().a(bz.a.a().a($$2, axj.I).b(bz.a.a().a($$2, bxe.ai)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ai.a.a()
         .a($$9)
         .a(
            dae.so,
            xc.c("advancements.husbandry.make_a_sign_glow.title"),
            xc.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", co.a.a(cv.a.a().a(az.a.a().a($$4, axg.aE)), cn.a.a().a($$3, dae.so)))
         .a($$1, "husbandry/make_a_sign_glow");
      aj $$20 = ai.a.a()
         .a($$9)
         .a(
            dae.ta,
            xc.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xc.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", db.a.a(Optional.empty(), Optional.empty(), Optional.of(bz.a(bz.a.a().a($$2, bxe.d)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ai.a.a()
         .a($$20)
         .a(
            dae.mJ,
            xc.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xc.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", co.a.b(cv.a.a().a(az.a.a().a($$4, dng.bf)), cn.a.a().a($$3, dae.sJ)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      aj $$21 = ai.a.a()
         .a($$9)
         .a(
            dae.kU,
            xc.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xc.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cl.a.a(dae.kU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      aj $$22 = ai.a.a()
         .a($$21)
         .a(dae.wt, xc.c("advancements.husbandry.feed_snifflet.title"), xc.c("advancements.husbandry.feed_snifflet.description"), null, ap.a, true, true, true)
         .a("feed_snifflet", dd.a.a(cn.a.a().a($$3, axo.ac), Optional.of(bz.a(bz.a.a().a($$2, bxe.bk).a(bx.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ai.a.a()
         .a($$22)
         .a(
            dae.wu,
            xc.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xc.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a(am.a.b)
         .a("torchflower", co.a.a(dng.lg))
         .a("pitcher_pod", co.a.a(dng.lh))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ai.a.a()
         .a($$12)
         .a(
            dae.td,
            xc.c("advancements.husbandry.remove_wolf_armor.title"),
            xc.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dd.a.a(cn.a.a().a($$3, dae.td), Optional.of(bz.a(bz.a.a().a($$2, bxe.bN)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ai.a.a()
         .a($$12)
         .a(
            dae.pf,
            xc.c("advancements.husbandry.repair_wolf_armor.title"),
            xc.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dd.a.a(cn.a.a().a($$3, dae.pe), Optional.of(bz.a(bz.a.a().a($$2, bxe.bN).a(bw.a.a().e(cn.a.a().a($$3, dae.pf).a(bo.a.a().a(kf.a(kl.e, 0)).b()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jh<bxe<?>> $$2, Stream<bxe<?>> $$3, Stream<bxe<?>> $$4) {
      return a(ai.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            dae.vu,
            xc.c("advancements.husbandry.breed_all_animals.title"),
            xc.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ai.a a(jh<bxe<?>> $$0, jh<czw> $$1, ji<cll> $$2, ai.a $$3) {
      a($$2)
         .forEach(
            $$3x -> $$3.a(
                  $$3x.h().a().toString(), dd.a.a(cn.a.a().a($$1, dae.vV), Optional.of(bz.a(bz.a.a().a($$0, bxe.ac).a(bo.a.a().a(kf.a(kl.aK, $$3x)).b()))))
               )
         );
      return $$3;
   }

   private static <T> Stream<jg.c<T>> a(ji<T> $$0) {
      return $$0.c().sorted(g);
   }

   private static ai.a a(ai.a $$0, jh<czw> $$1) {
      for (czw $$2 : f) {
         $$0.a(mh.g.b($$2).a(), bi.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, Stream<bxe<?>> $$1, jh<bxe<?>> $$2, Stream<bxe<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bxe.a($$2x).toString(), ba.a.a(bz.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bxe.a($$2x).toString(), ba.a.a(Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ai.a b(ai.a $$0, jh<czw> $$1) {
      for (czw $$2 : e) {
         $$0.a(mh.g.b($$2).a(), ce.a.a(cn.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ai.a c(ai.a $$0, jh<czw> $$1) {
      for (czw $$2 : d) {
         $$0.a(mh.g.b($$2).a(), cg.a.a(Optional.empty(), Optional.empty(), Optional.of(cn.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, ji<cjq> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kf.a(kl.aP, $$1x)).b()))));
      return $$0;
   }

   private static ai.a b(ai.a $$0, ji<cmr> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kf.a(kl.aw, $$1x)).b()))));
      return $$0;
   }
}
