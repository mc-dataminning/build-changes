import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mj implements mf {
   public static final List<btq<?>> a = List.of(
      btq.ab,
      btq.z,
      btq.at,
      btq.aJ,
      btq.w,
      btq.as,
      btq.az,
      btq.t,
      btq.bs,
      btq.au,
      btq.aG,
      btq.an,
      btq.p,
      btq.aw,
      btq.Q,
      btq.h,
      btq.Z,
      btq.aZ,
      btq.X,
      btq.f,
      btq.o,
      btq.c
   );
   public static final List<btq<?>> b = List.of(btq.bh, btq.R, btq.aR);
   private static final cvg[] d = new cvg[]{cvo.ra, cvo.rc, cvo.rd, cvo.rb};
   private static final cvg[] e = new cvg[]{cvo.qI, cvo.qJ, cvo.qG, cvo.qH};
   private static final cvg[] f = new cvg[]{
      cvo.ov,
      cvo.ps,
      cvo.py,
      cvo.pY,
      cvo.pZ,
      cvo.qb,
      cvo.qc,
      cvo.ra,
      cvo.rb,
      cvo.rc,
      cvo.rd,
      cvo.re,
      cvo.rf,
      cvo.rT,
      cvo.rX,
      cvo.sb,
      cvo.sc,
      cvo.sd,
      cvo.se,
      cvo.sf,
      cvo.sn,
      cvo.uh,
      cvo.ui,
      cvo.uj,
      cvo.uk,
      cvo.um,
      cvo.uv,
      cvo.uC,
      cvo.uD,
      cvo.uE,
      cvo.uP,
      cvo.uQ,
      cvo.vi,
      cvo.vm,
      cvo.vo,
      cvo.rY,
      cvo.vY,
      cvo.wx,
      cvo.wF,
      cvo.wy
   };
   public static final cvg[] c = new cvg[]{cvo.oQ, cvo.pa, cvo.oV, cvo.pf, cvo.pk, cvo.pp};

   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btq<?>> $$2 = $$0.b(lv.z);
      jo<cvg> $$3 = $$0.b(lv.K);
      jo<dgv> $$4 = $$0.b(lv.f);
      jp.b<daw> $$5 = $$0.b(lv.aL);
      ag $$6 = af.a.a()
         .a(
            dgx.ij,
            xd.c("advancements.husbandry.root.title"),
            xd.c("advancements.husbandry.root.description"),
            alb.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cvo.px, xd.c("advancements.husbandry.plant_seed.title"), xd.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cw.a.a(dgx.cB))
         .a("pumpkin_stem", cw.a.a(dgx.fd))
         .a("melon_stem", cw.a.a(dgx.fe))
         .a("beetroots", cw.a.a(dgx.kD))
         .a("nether_wart", cw.a.a(dgx.fq))
         .a("torchflower", cw.a.a(dgx.kA))
         .a("pitcher_pod", cw.a.a(dgx.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$8 = af.a.a()
         .a($$6)
         .a(
            cvo.px,
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
         .a(cvo.ov, xd.c("advancements.husbandry.balanced_diet.title"), xd.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$7)
         .a(cvo.pq, xd.c("advancements.husbandry.netherite_hoe.title"), xd.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cg.a.a(cvo.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$9 = af.a.a()
         .a($$6)
         .a(
            cvo.uM,
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
            cvo.qW,
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
            cvo.qG,
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
         .a(lu.g.b(cvo.qK).a(), ca.a.a(cs.a.a().a($$3, cvo.qK)))
         .a(
            cvo.qK,
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
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a($$2, btq.f)))
         .a(
            cvo.qJ,
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
            cvo.ra,
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
         .a(cvo.rA, xd.c("advancements.husbandry.whole_pack.title"), xd.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$13 = af.a.a()
         .a($$6)
         .a("safely_harvest_honey", cw.a.a(df.a.a().a(aw.a.a().a($$4, aws.aH)).a(true), cs.a.a().a($$3, cvo.sm)))
         .a(
            cvo.wF,
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
         .a(cvo.wC, xd.c("advancements.husbandry.wax_on.title"), xd.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvb.a.get().keySet())), cs.a.a().a($$3, cvo.wC)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$14)
         .a(cvo.oV, xd.c("advancements.husbandry.wax_off.title"), xd.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvb.b.get().keySet())), cs.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ag $$15 = af.a.a()
         .a($$6)
         .a(lu.g.b(cvo.qL).a(), ca.a.a(cs.a.a().a($$3, cvo.qL)))
         .a(
            cvo.qL,
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
            cvo.uM,
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
         .a(cvo.xt, xd.c("advancements.husbandry.froglights.title"), xd.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cg.a.a(cvo.xs, cvo.xu, cvo.xt))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$6)
         .a("silk_touch_nest", av.a.a(dgx.pe, cs.a.a().a(cu.b, cn.a(List.of(new bq($$5.b(dbb.v), dh.d.b(1))))), dh.d.a(3)))
         .a(
            dgx.pe,
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
            cvo.nV,
            xd.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xd.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ea.a.a(bv.a.a().a(bv.a.a().a($$2, btq.k).b(bv.a.a().a($$2, btq.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$6)
         .a(
            cvo.rh,
            xd.c("advancements.husbandry.make_a_sign_glow.title"),
            xd.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cw.a.a(df.a.a().a(aw.a.a().a($$4, aws.aC)), cs.a.a().a($$3, cvo.rh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$17 = af.a.a()
         .a($$6)
         .a(
            cvo.rT,
            xd.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xd.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dl.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a($$2, btq.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$17)
         .a(
            cvo.mf,
            xd.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xd.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cw.a.b(df.a.a().a(aw.a.a().a($$4, dgx.aY)), cs.a.a().a($$3, cvo.rC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$18 = af.a.a()
         .a($$6)
         .a(
            cvo.kq,
            xd.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xd.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cg.a.a(cvo.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$19 = af.a.a()
         .a($$18)
         .a(cvo.vk, xd.c("advancements.husbandry.feed_snifflet.title"), xd.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dn.a.a(cs.a.a().a($$3, axb.X), Optional.of(bv.a(bv.a.a().a($$2, btq.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$19)
         .a(
            cvo.vl,
            xd.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xd.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cw.a.a(dgx.kA))
         .a("pitcher_pod", cw.a.a(dgx.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$9)
         .a(
            cvo.rW,
            xd.c("advancements.husbandry.remove_wolf_armor.title"),
            xd.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dn.a.a(cs.a.a().a($$3, cvo.rW), Optional.of(bv.a(bv.a.a().a($$2, btq.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$9)
         .a(
            cvo.os,
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
            dn.a.a(cs.a.a().a($$3, cvo.or), Optional.of(bv.a(bv.a.a().a($$2, btq.bs).a(bs.a.a().e(cs.a.a().a($$3, cvo.os).a(kp.a().a(kr.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jo<btq<?>> $$2, Stream<btq<?>> $$3, Stream<btq<?>> $$4) {
      return a(af.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cvo.um,
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

   private static af.a a(jo<btq<?>> $$0, jo<cvg> $$1, af.a $$2) {
      lu.aj.i().forEach($$3 -> $$2.a($$3.h().a().toString(), dn.a.a(cs.a.a().a($$1, cvo.uM), Optional.of(bv.a(bv.a.a().a($$0, btq.R).a(bx.b($$3)))))));
      return $$2;
   }

   private static af.a a(af.a $$0, jo<cvg> $$1) {
      for (cvg $$2 : f) {
         $$0.a(lu.g.b($$2).a(), bf.a.a($$1, $$2));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<btq<?>> $$1, jo<btq<?>> $$2, Stream<btq<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(btq.a($$2x).toString(), ax.a.a(bv.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(btq.a($$2x).toString(), ax.a.a(Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static af.a b(af.a $$0, jo<cvg> $$1) {
      for (cvg $$2 : e) {
         $$0.a(lu.g.b($$2).a(), ca.a.a(cs.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static af.a c(af.a $$0, jo<cvg> $$1) {
      for (cvg $$2 : d) {
         $$0.a(lu.g.b($$2).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(cs.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static af.a a(af.a $$0) {
      lu.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ee.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jp.a $$1) {
      jp.b<cgz> $$2 = $$1.b(lv.m);
      $$2.c().sorted(Comparator.comparing(ala::a)).forEach($$2x -> {
         jn<cgz> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ee.a.a(bv.a.a().a(bx.a(jr.a($$3)))));
      });
      return $$0;
   }
}
