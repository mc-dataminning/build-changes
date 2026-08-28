import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mj implements mf {
   public static final List<btv<?>> a = List.of(
      btv.ab,
      btv.z,
      btv.at,
      btv.aJ,
      btv.w,
      btv.as,
      btv.az,
      btv.t,
      btv.bs,
      btv.au,
      btv.aG,
      btv.an,
      btv.p,
      btv.aw,
      btv.Q,
      btv.h,
      btv.Z,
      btv.aZ,
      btv.X,
      btv.f,
      btv.o,
      btv.c
   );
   public static final List<btv<?>> b = List.of(btv.bh, btv.R, btv.aR);
   private static final cvk[] d = new cvk[]{cvt.ra, cvt.rc, cvt.rd, cvt.rb};
   private static final cvk[] e = new cvk[]{cvt.qI, cvt.qJ, cvt.qG, cvt.qH};
   private static final cvk[] f = new cvk[]{
      cvt.ov,
      cvt.ps,
      cvt.py,
      cvt.pY,
      cvt.pZ,
      cvt.qb,
      cvt.qc,
      cvt.ra,
      cvt.rb,
      cvt.rc,
      cvt.rd,
      cvt.re,
      cvt.rf,
      cvt.rT,
      cvt.rX,
      cvt.sb,
      cvt.sc,
      cvt.sd,
      cvt.se,
      cvt.sf,
      cvt.sn,
      cvt.uh,
      cvt.ui,
      cvt.uj,
      cvt.uk,
      cvt.um,
      cvt.uv,
      cvt.uC,
      cvt.uD,
      cvt.uE,
      cvt.uP,
      cvt.uQ,
      cvt.vi,
      cvt.vm,
      cvt.vo,
      cvt.rY,
      cvt.vY,
      cvt.wx,
      cvt.wF,
      cvt.wy
   };
   public static final cvk[] c = new cvk[]{cvt.oQ, cvt.pa, cvt.oV, cvt.pf, cvt.pk, cvt.pp};

   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btv<?>> $$2 = $$0.b(lv.z);
      jo<cvk> $$3 = $$0.b(lv.K);
      jo<dhj> $$4 = $$0.b(lv.f);
      jp.b<dbk> $$5 = $$0.b(lv.aM);
      ag $$6 = af.a.a()
         .a(
            dhl.ij,
            xd.c("advancements.husbandry.root.title"),
            xd.c("advancements.husbandry.root.description"),
            alc.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cvt.px, xd.c("advancements.husbandry.plant_seed.title"), xd.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cw.a.a(dhl.cB))
         .a("pumpkin_stem", cw.a.a(dhl.fd))
         .a("melon_stem", cw.a.a(dhl.fe))
         .a("beetroots", cw.a.a(dhl.kD))
         .a("nether_wart", cw.a.a(dhl.fq))
         .a("torchflower", cw.a.a(dhl.kA))
         .a("pitcher_pod", cw.a.a(dhl.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$8 = af.a.a()
         .a($$6)
         .a(
            cvt.px,
            xd.c("advancements.husbandry.breed_an_animal.title"),
            xd.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cvt.ov, xd.c("advancements.husbandry.balanced_diet.title"), xd.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$7)
         .a(cvt.pq, xd.c("advancements.husbandry.netherite_hoe.title"), xd.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cg.a.a(cvt.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$9 = af.a.a()
         .a($$6)
         .a(
            cvt.uM,
            xd.c("advancements.husbandry.tame_an_animal.title"),
            xd.c("advancements.husbandry.tame_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("tamed_animal", ee.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ag $$10 = c(af.a.a(), $$3)
         .a($$6)
         .a(aj.a.b)
         .a(
            cvt.qW,
            xd.c("advancements.husbandry.fishy_business.title"),
            xd.c("advancements.husbandry.fishy_business.description"),
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
            cvt.qG,
            xd.c("advancements.husbandry.tactical_fishing.title"),
            xd.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lu.g.b(cvt.qK).a(), ca.a.a(cs.a.a().a($$3, cvt.qK)))
         .a(
            cvt.qK,
            xd.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xd.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$12)
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a($$2, btv.f)))
         .a(
            cvt.qJ,
            xd.c("advancements.husbandry.kill_axolotl_target.title"),
            xd.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cvt.ra,
            xd.c("advancements.husbandry.complete_catalogue.title"),
            xd.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cvt.rA, xd.c("advancements.husbandry.whole_pack.title"), xd.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$13 = af.a.a()
         .a($$6)
         .a("safely_harvest_honey", cw.a.a(df.a.a().a(aw.a.a().a($$4, awt.aH)).a(true), cs.a.a().a($$3, cvt.sl)))
         .a(
            cvt.wF,
            xd.c("advancements.husbandry.safely_harvest_honey.title"),
            xd.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$14 = af.a.a()
         .a($$13)
         .a(cvt.wC, xd.c("advancements.husbandry.wax_on.title"), xd.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvf.a.get().keySet())), cs.a.a().a($$3, cvt.wC)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$14)
         .a(cvt.oV, xd.c("advancements.husbandry.wax_off.title"), xd.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvf.b.get().keySet())), cs.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ag $$15 = af.a.a()
         .a($$6)
         .a(lu.g.b(cvt.qL).a(), ca.a.a(cs.a.a().a($$3, cvt.qL)))
         .a(
            cvt.qL,
            xd.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xd.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cvt.uM,
            xd.c("advancements.husbandry.leash_all_frog_variants.title"),
            xd.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$16)
         .a(cvt.xt, xd.c("advancements.husbandry.froglights.title"), xd.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cg.a.a(cvt.xs, cvt.xu, cvt.xt))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$6)
         .a("silk_touch_nest", av.a.a(dhl.pe, cs.a.a().a(cu.b, cn.a(List.of(new bq($$5.b(dbp.v), dh.d.b(1))))), dh.d.a(3)))
         .a(
            dhl.pe,
            xd.c("advancements.husbandry.silk_touch_nest.title"),
            xd.c("advancements.husbandry.silk_touch_nest.description"),
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
            cvt.nV,
            xd.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xd.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ea.a.a(bv.a.a().a(bv.a.a().a($$2, btv.k).b(bv.a.a().a($$2, btv.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$6)
         .a(
            cvt.rh,
            xd.c("advancements.husbandry.make_a_sign_glow.title"),
            xd.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cw.a.a(df.a.a().a(aw.a.a().a($$4, awt.aC)), cs.a.a().a($$3, cvt.rh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$17 = af.a.a()
         .a($$6)
         .a(
            cvt.rT,
            xd.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xd.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dl.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a($$2, btv.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$17)
         .a(
            cvt.mf,
            xd.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xd.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cw.a.b(df.a.a().a(aw.a.a().a($$4, dhl.aY)), cs.a.a().a($$3, cvt.rC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$18 = af.a.a()
         .a($$6)
         .a(
            cvt.kq,
            xd.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xd.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cg.a.a(cvt.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$19 = af.a.a()
         .a($$18)
         .a(cvt.vk, xd.c("advancements.husbandry.feed_snifflet.title"), xd.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dn.a.a(cs.a.a().a($$3, axc.X), Optional.of(bv.a(bv.a.a().a($$2, btv.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$19)
         .a(
            cvt.vl,
            xd.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xd.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cw.a.a(dhl.kA))
         .a("pitcher_pod", cw.a.a(dhl.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$9)
         .a(
            cvt.rW,
            xd.c("advancements.husbandry.remove_wolf_armor.title"),
            xd.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dn.a.a(cs.a.a().a($$3, cvt.rW), Optional.of(bv.a(bv.a.a().a($$2, btv.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$9)
         .a(
            cvt.os,
            xd.c("advancements.husbandry.repair_wolf_armor.title"),
            xd.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dn.a.a(cs.a.a().a($$3, cvt.or), Optional.of(bv.a(bv.a.a().a($$2, btv.bs).a(bs.a.a().e(cs.a.a().a($$3, cvt.os).a(kp.a().a(kr.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jo<btv<?>> $$2, Stream<btv<?>> $$3, Stream<btv<?>> $$4) {
      return a(af.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cvt.um,
            xd.c("advancements.husbandry.breed_all_animals.title"),
            xd.c("advancements.husbandry.breed_all_animals.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static af.a a(jo<btv<?>> $$0, jo<cvk> $$1, af.a $$2) {
      lu.aj.i().forEach($$3 -> $$2.a($$3.h().a().toString(), dn.a.a(cs.a.a().a($$1, cvt.uM), Optional.of(bv.a(bv.a.a().a($$0, btv.R).a(bx.b($$3)))))));
      return $$2;
   }

   private static af.a a(af.a $$0, jo<cvk> $$1) {
      for (cvk $$2 : f) {
         $$0.a(lu.g.b($$2).a(), bf.a.a($$1, $$2));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<btv<?>> $$1, jo<btv<?>> $$2, Stream<btv<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(btv.a($$2x).toString(), ax.a.a(bv.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(btv.a($$2x).toString(), ax.a.a(Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static af.a b(af.a $$0, jo<cvk> $$1) {
      for (cvk $$2 : e) {
         $$0.a(lu.g.b($$2).a(), ca.a.a(cs.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static af.a c(af.a $$0, jo<cvk> $$1) {
      for (cvk $$2 : d) {
         $$0.a(lu.g.b($$2).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(cs.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static af.a a(af.a $$0) {
      lu.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ee.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jp.a $$1) {
      jp.b<che> $$2 = $$1.b(lv.m);
      $$2.c().sorted(Comparator.comparing(alb::a)).forEach($$2x -> {
         jn<che> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ee.a.a(bv.a.a().a(bx.a(jr.a($$3)))));
      });
      return $$0;
   }
}
