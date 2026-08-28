import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mm implements mi {
   public static final List<bug<?>> a = List.of(
      bug.ab,
      bug.z,
      bug.at,
      bug.aJ,
      bug.w,
      bug.as,
      bug.az,
      bug.t,
      bug.bs,
      bug.au,
      bug.aG,
      bug.an,
      bug.p,
      bug.aw,
      bug.Q,
      bug.h,
      bug.Z,
      bug.aZ,
      bug.X,
      bug.f,
      bug.o,
      bug.c
   );
   public static final List<bug<?>> b = List.of(bug.bh, bug.R, bug.aR);
   private static final cvt[] d = new cvt[]{cwb.ra, cwb.rc, cwb.rd, cwb.rb};
   private static final cvt[] e = new cvt[]{cwb.qI, cwb.qJ, cwb.qG, cwb.qH};
   private static final cvt[] f = new cvt[]{
      cwb.ov,
      cwb.ps,
      cwb.py,
      cwb.pY,
      cwb.pZ,
      cwb.qb,
      cwb.qc,
      cwb.ra,
      cwb.rb,
      cwb.rc,
      cwb.rd,
      cwb.re,
      cwb.rf,
      cwb.rT,
      cwb.rX,
      cwb.sb,
      cwb.sc,
      cwb.sd,
      cwb.se,
      cwb.sf,
      cwb.sn,
      cwb.uh,
      cwb.ui,
      cwb.uj,
      cwb.uk,
      cwb.um,
      cwb.uv,
      cwb.uC,
      cwb.uD,
      cwb.uE,
      cwb.uP,
      cwb.uQ,
      cwb.vi,
      cwb.vm,
      cwb.vo,
      cwb.rY,
      cwb.vY,
      cwb.wx,
      cwb.wF,
      cwb.wy
   };
   public static final cvt[] c = new cvt[]{cwb.oQ, cwb.pa, cwb.oV, cwb.pf, cwb.pk, cwb.pp};

   @Override
   public void a(jr.a $$0, Consumer<ag> $$1) {
      jq<bug<?>> $$2 = $$0.d(ly.z);
      jq<cvt> $$3 = $$0.d(ly.K);
      jq<dhy> $$4 = $$0.d(ly.f);
      jr.b<dbm> $$5 = $$0.d(ly.aM);
      ag $$6 = af.a.a()
         .a(
            dia.ij,
            xh.c("advancements.husbandry.root.title"),
            xh.c("advancements.husbandry.root.description"),
            alh.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cwb.px, xh.c("advancements.husbandry.plant_seed.title"), xh.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cx.a.a(dia.cB))
         .a("pumpkin_stem", cx.a.a(dia.fd))
         .a("melon_stem", cx.a.a(dia.fe))
         .a("beetroots", cx.a.a(dia.kD))
         .a("nether_wart", cx.a.a(dia.fq))
         .a("torchflower", cx.a.a(dia.kA))
         .a("pitcher_pod", cx.a.a(dia.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$8 = af.a.a()
         .a($$6)
         .a(
            cwb.px,
            xh.c("advancements.husbandry.breed_an_animal.title"),
            xh.c("advancements.husbandry.breed_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("bred", ax.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$8, $$1, $$2, a.stream(), b.stream());
      a(af.a.a(), $$3)
         .a($$7)
         .a(cwb.ov, xh.c("advancements.husbandry.balanced_diet.title"), xh.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$7)
         .a(cwb.pq, xh.c("advancements.husbandry.netherite_hoe.title"), xh.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", ch.a.a(cwb.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$9 = af.a.a()
         .a($$6)
         .a(
            cwb.uM,
            xh.c("advancements.husbandry.tame_an_animal.title"),
            xh.c("advancements.husbandry.tame_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("tamed_animal", eg.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ag $$10 = c(af.a.a(), $$3)
         .a($$6)
         .a(aj.a.b)
         .a(
            cwb.qW,
            xh.c("advancements.husbandry.fishy_business.title"),
            xh.c("advancements.husbandry.fishy_business.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ag $$11 = b(af.a.a(), $$3)
         .a($$10)
         .a(aj.a.b)
         .a(
            cwb.qG,
            xh.c("advancements.husbandry.tactical_fishing.title"),
            xh.c("advancements.husbandry.tactical_fishing.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ag $$12 = af.a.a()
         .a($$11)
         .a(aj.a.b)
         .a(lx.g.b(cwb.qK).a(), ca.a.a(ct.a.a().a($$3, cwb.qK)))
         .a(
            cwb.qK,
            xh.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xh.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$12)
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a($$2, bug.f)))
         .a(
            cwb.qJ,
            xh.c("advancements.husbandry.kill_axolotl_target.title"),
            xh.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(af.a.a())
         .a($$9)
         .a(
            cwb.ra,
            xh.c("advancements.husbandry.complete_catalogue.title"),
            xh.c("advancements.husbandry.complete_catalogue.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(af.a.a(), $$0)
         .a($$9)
         .a(cwb.rA, xh.c("advancements.husbandry.whole_pack.title"), xh.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$13 = af.a.a()
         .a($$6)
         .a("safely_harvest_honey", cx.a.a(dg.a.a().a(aw.a.a().a($$4, awz.aH)).a(true), ct.a.a().a($$3, cwb.sl)))
         .a(
            cwb.wF,
            xh.c("advancements.husbandry.safely_harvest_honey.title"),
            xh.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$14 = af.a.a()
         .a($$13)
         .a(cwb.wC, xh.c("advancements.husbandry.wax_on.title"), xh.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cx.a.a(dg.a.a().a(aw.a.a().a($$4, cvo.a.get().keySet())), ct.a.a().a($$3, cwb.wC)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$14)
         .a(cwb.oV, xh.c("advancements.husbandry.wax_off.title"), xh.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cx.a.a(dg.a.a().a(aw.a.a().a($$4, cvo.b.get().keySet())), ct.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ag $$15 = af.a.a()
         .a($$6)
         .a(lx.g.b(cwb.qL).a(), ca.a.a(ct.a.a().a($$3, cwb.qL)))
         .a(
            cwb.qL,
            xh.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xh.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ag $$16 = a($$2, $$3, af.a.a())
         .a($$15)
         .a(
            cwb.uM,
            xh.c("advancements.husbandry.leash_all_frog_variants.title"),
            xh.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$16)
         .a(cwb.xt, xh.c("advancements.husbandry.froglights.title"), xh.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", ch.a.a(cwb.xs, cwb.xu, cwb.xt))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$6)
         .a("silk_touch_nest", av.a.a(dia.pe, ct.a.a().a(cv.b, co.a(List.of(new bq($$5.b(dbr.v), di.d.b(1))))), di.d.a(3)))
         .a(
            dia.pe,
            xh.c("advancements.husbandry.silk_touch_nest.title"),
            xh.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      af.a.a()
         .a($$6)
         .a(
            cwb.nV,
            xh.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xh.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ec.a.a(bv.a.a().a(bv.a.a().a($$2, bug.k).b(bv.a.a().a($$2, bug.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$6)
         .a(
            cwb.rh,
            xh.c("advancements.husbandry.make_a_sign_glow.title"),
            xh.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cx.a.a(dg.a.a().a(aw.a.a().a($$4, awz.aC)), ct.a.a().a($$3, cwb.rh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$17 = af.a.a()
         .a($$6)
         .a(
            cwb.rT,
            xh.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xh.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dm.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a($$2, bug.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$17)
         .a(
            cwb.mf,
            xh.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xh.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cx.a.b(dg.a.a().a(aw.a.a().a($$4, dia.aY)), ct.a.a().a($$3, cwb.rC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$18 = af.a.a()
         .a($$6)
         .a(
            cwb.kq,
            xh.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xh.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ch.a.a(cwb.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$19 = af.a.a()
         .a($$18)
         .a(cwb.vk, xh.c("advancements.husbandry.feed_snifflet.title"), xh.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dp.a.a(ct.a.a().a($$3, axi.Y), Optional.of(bv.a(bv.a.a().a($$2, bug.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$19)
         .a(
            cwb.vl,
            xh.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xh.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cx.a.a(dia.kA))
         .a("pitcher_pod", cx.a.a(dia.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$9)
         .a(
            cwb.rW,
            xh.c("advancements.husbandry.remove_wolf_armor.title"),
            xh.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dp.a.a(ct.a.a().a($$3, cwb.rW), Optional.of(bv.a(bv.a.a().a($$2, bug.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$9)
         .a(
            cwb.os,
            xh.c("advancements.husbandry.repair_wolf_armor.title"),
            xh.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dp.a.a(ct.a.a().a($$3, cwb.or), Optional.of(bv.a(bv.a.a().a($$2, bug.bs).a(bs.a.a().e(ct.a.a().a($$3, cwb.os).a(kr.a().a(kt.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jq<bug<?>> $$2, Stream<bug<?>> $$3, Stream<bug<?>> $$4) {
      return a(af.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cwb.um,
            xh.c("advancements.husbandry.breed_all_animals.title"),
            xh.c("advancements.husbandry.breed_all_animals.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static af.a a(jq<bug<?>> $$0, jq<cvt> $$1, af.a $$2) {
      lx.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dp.a.a(ct.a.a().a($$1, cwb.uM), Optional.of(bv.a(bv.a.a().a($$0, bug.R).a(bx.b($$3)))))));
      return $$2;
   }

   private static af.a a(af.a $$0, jq<cvt> $$1) {
      for (cvt $$2 : f) {
         $$0.a(lx.g.b($$2).a(), bf.a.a($$1, $$2));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<bug<?>> $$1, jq<bug<?>> $$2, Stream<bug<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bug.a($$2x).toString(), ax.a.a(bv.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bug.a($$2x).toString(), ax.a.a(Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static af.a b(af.a $$0, jq<cvt> $$1) {
      for (cvt $$2 : e) {
         $$0.a(lx.g.b($$2).a(), ca.a.a(ct.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static af.a c(af.a $$0, jq<cvt> $$1) {
      for (cvt $$2 : d) {
         $$0.a(lx.g.b($$2).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(ct.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static af.a a(af.a $$0) {
      lx.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eg.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jr.a $$1) {
      jr.b<chq> $$2 = $$1.d(ly.m);
      $$2.c_().sorted(Comparator.comparing(alg::a)).forEach($$2x -> {
         jp<chq> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eg.a.a(bv.a.a().a(bx.a(jt.a($$3)))));
      });
      return $$0;
   }
}
