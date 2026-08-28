import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mk implements mg {
   public static final List<bty<?>> a = List.of(
      bty.ab,
      bty.z,
      bty.at,
      bty.aJ,
      bty.w,
      bty.as,
      bty.az,
      bty.t,
      bty.bs,
      bty.au,
      bty.aG,
      bty.an,
      bty.p,
      bty.aw,
      bty.Q,
      bty.h,
      bty.Z,
      bty.aZ,
      bty.X,
      bty.f,
      bty.o,
      bty.c
   );
   public static final List<bty<?>> b = List.of(bty.bh, bty.R, bty.aR);
   private static final cvn[] d = new cvn[]{cvw.ra, cvw.rc, cvw.rd, cvw.rb};
   private static final cvn[] e = new cvn[]{cvw.qI, cvw.qJ, cvw.qG, cvw.qH};
   private static final cvn[] f = new cvn[]{
      cvw.ov,
      cvw.ps,
      cvw.py,
      cvw.pY,
      cvw.pZ,
      cvw.qb,
      cvw.qc,
      cvw.ra,
      cvw.rb,
      cvw.rc,
      cvw.rd,
      cvw.re,
      cvw.rf,
      cvw.rT,
      cvw.rX,
      cvw.sb,
      cvw.sc,
      cvw.sd,
      cvw.se,
      cvw.sf,
      cvw.sn,
      cvw.uh,
      cvw.ui,
      cvw.uj,
      cvw.uk,
      cvw.um,
      cvw.uv,
      cvw.uC,
      cvw.uD,
      cvw.uE,
      cvw.uP,
      cvw.uQ,
      cvw.vi,
      cvw.vm,
      cvw.vo,
      cvw.rY,
      cvw.vY,
      cvw.wx,
      cvw.wF,
      cvw.wy
   };
   public static final cvn[] c = new cvn[]{cvw.oQ, cvw.pa, cvw.oV, cvw.pf, cvw.pk, cvw.pp};

   @Override
   public void a(jq.a $$0, Consumer<ag> $$1) {
      jp<bty<?>> $$2 = $$0.d(lw.z);
      jp<cvn> $$3 = $$0.d(lw.K);
      jp<dhm> $$4 = $$0.d(lw.f);
      jq.b<dbn> $$5 = $$0.d(lw.aN);
      ag $$6 = af.a.a()
         .a(
            dho.ij,
            xe.c("advancements.husbandry.root.title"),
            xe.c("advancements.husbandry.root.description"),
            ale.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cvw.px, xe.c("advancements.husbandry.plant_seed.title"), xe.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cw.a.a(dho.cB))
         .a("pumpkin_stem", cw.a.a(dho.fd))
         .a("melon_stem", cw.a.a(dho.fe))
         .a("beetroots", cw.a.a(dho.kD))
         .a("nether_wart", cw.a.a(dho.fq))
         .a("torchflower", cw.a.a(dho.kA))
         .a("pitcher_pod", cw.a.a(dho.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$8 = af.a.a()
         .a($$6)
         .a(
            cvw.px,
            xe.c("advancements.husbandry.breed_an_animal.title"),
            xe.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cvw.ov, xe.c("advancements.husbandry.balanced_diet.title"), xe.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$7)
         .a(cvw.pq, xe.c("advancements.husbandry.netherite_hoe.title"), xe.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cg.a.a(cvw.pq))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$9 = af.a.a()
         .a($$6)
         .a(
            cvw.uM,
            xe.c("advancements.husbandry.tame_an_animal.title"),
            xe.c("advancements.husbandry.tame_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("tamed_animal", ef.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ag $$10 = c(af.a.a(), $$3)
         .a($$6)
         .a(aj.a.b)
         .a(
            cvw.qW,
            xe.c("advancements.husbandry.fishy_business.title"),
            xe.c("advancements.husbandry.fishy_business.description"),
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
            cvw.qG,
            xe.c("advancements.husbandry.tactical_fishing.title"),
            xe.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lv.g.b(cvw.qK).a(), ca.a.a(cs.a.a().a($$3, cvw.qK)))
         .a(
            cvw.qK,
            xe.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xe.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$12)
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a($$2, bty.f)))
         .a(
            cvw.qJ,
            xe.c("advancements.husbandry.kill_axolotl_target.title"),
            xe.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cvw.ra,
            xe.c("advancements.husbandry.complete_catalogue.title"),
            xe.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cvw.rA, xe.c("advancements.husbandry.whole_pack.title"), xe.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$13 = af.a.a()
         .a($$6)
         .a("safely_harvest_honey", cw.a.a(df.a.a().a(aw.a.a().a($$4, awv.aH)).a(true), cs.a.a().a($$3, cvw.sl)))
         .a(
            cvw.wF,
            xe.c("advancements.husbandry.safely_harvest_honey.title"),
            xe.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$14 = af.a.a()
         .a($$13)
         .a(cvw.wC, xe.c("advancements.husbandry.wax_on.title"), xe.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvi.a.get().keySet())), cs.a.a().a($$3, cvw.wC)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$14)
         .a(cvw.oV, xe.c("advancements.husbandry.wax_off.title"), xe.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cw.a.a(df.a.a().a(aw.a.a().a($$4, cvi.b.get().keySet())), cs.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      ag $$15 = af.a.a()
         .a($$6)
         .a(lv.g.b(cvw.qL).a(), ca.a.a(cs.a.a().a($$3, cvw.qL)))
         .a(
            cvw.qL,
            xe.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xe.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cvw.uM,
            xe.c("advancements.husbandry.leash_all_frog_variants.title"),
            xe.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$16)
         .a(cvw.xt, xe.c("advancements.husbandry.froglights.title"), xe.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cg.a.a(cvw.xs, cvw.xu, cvw.xt))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$6)
         .a("silk_touch_nest", av.a.a(dho.pe, cs.a.a().a(cu.b, cn.a(List.of(new bq($$5.b(dbs.v), dh.d.b(1))))), dh.d.a(3)))
         .a(
            dho.pe,
            xe.c("advancements.husbandry.silk_touch_nest.title"),
            xe.c("advancements.husbandry.silk_touch_nest.description"),
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
            cvw.nV,
            xe.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xe.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", eb.a.a(bv.a.a().a(bv.a.a().a($$2, bty.k).b(bv.a.a().a($$2, bty.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$6)
         .a(
            cvw.rh,
            xe.c("advancements.husbandry.make_a_sign_glow.title"),
            xe.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cw.a.a(df.a.a().a(aw.a.a().a($$4, awv.aC)), cs.a.a().a($$3, cvw.rh)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$17 = af.a.a()
         .a($$6)
         .a(
            cvw.rT,
            xe.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xe.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dl.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a($$2, bty.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$17)
         .a(
            cvw.mf,
            xe.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xe.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cw.a.b(df.a.a().a(aw.a.a().a($$4, dho.aY)), cs.a.a().a($$3, cvw.rC)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$18 = af.a.a()
         .a($$6)
         .a(
            cvw.kq,
            xe.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xe.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cg.a.a(cvw.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$19 = af.a.a()
         .a($$18)
         .a(cvw.vk, xe.c("advancements.husbandry.feed_snifflet.title"), xe.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dn.a.a(cs.a.a().a($$3, axe.X), Optional.of(bv.a(bv.a.a().a($$2, bty.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$19)
         .a(
            cvw.vl,
            xe.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xe.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cw.a.a(dho.kA))
         .a("pitcher_pod", cw.a.a(dho.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$9)
         .a(
            cvw.rW,
            xe.c("advancements.husbandry.remove_wolf_armor.title"),
            xe.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dn.a.a(cs.a.a().a($$3, cvw.rW), Optional.of(bv.a(bv.a.a().a($$2, bty.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$9)
         .a(
            cvw.os,
            xe.c("advancements.husbandry.repair_wolf_armor.title"),
            xe.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dn.a.a(cs.a.a().a($$3, cvw.or), Optional.of(bv.a(bv.a.a().a($$2, bty.bs).a(bs.a.a().e(cs.a.a().a($$3, cvw.os).a(kq.a().a(ks.e, 0).a()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jp<bty<?>> $$2, Stream<bty<?>> $$3, Stream<bty<?>> $$4) {
      return a(af.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            cvw.um,
            xe.c("advancements.husbandry.breed_all_animals.title"),
            xe.c("advancements.husbandry.breed_all_animals.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static af.a a(jp<bty<?>> $$0, jp<cvn> $$1, af.a $$2) {
      lv.aj.c().forEach($$3 -> $$2.a($$3.h().a().toString(), dn.a.a(cs.a.a().a($$1, cvw.uM), Optional.of(bv.a(bv.a.a().a($$0, bty.R).a(bx.b($$3)))))));
      return $$2;
   }

   private static af.a a(af.a $$0, jp<cvn> $$1) {
      for (cvn $$2 : f) {
         $$0.a(lv.g.b($$2).a(), bf.a.a($$1, $$2));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<bty<?>> $$1, jp<bty<?>> $$2, Stream<bty<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bty.a($$2x).toString(), ax.a.a(bv.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bty.a($$2x).toString(), ax.a.a(Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.of(bv.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static af.a b(af.a $$0, jp<cvn> $$1) {
      for (cvn $$2 : e) {
         $$0.a(lv.g.b($$2).a(), ca.a.a(cs.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static af.a c(af.a $$0, jp<cvn> $$1) {
      for (cvn $$2 : d) {
         $$0.a(lv.g.b($$2).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(cs.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static af.a a(af.a $$0) {
      lv.ai.c().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ef.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jq.a $$1) {
      jq.b<chh> $$2 = $$1.d(lw.m);
      $$2.c_().sorted(Comparator.comparing(ald::a)).forEach($$2x -> {
         jo<chh> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ef.a.a(bv.a.a().a(bx.a(js.a($$3)))));
      });
      return $$0;
   }
}
