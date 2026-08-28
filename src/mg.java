import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mg implements ma {
   public static final List<bsv<?>> a = List.of(
      bsv.ab,
      bsv.z,
      bsv.at,
      bsv.aJ,
      bsv.w,
      bsv.as,
      bsv.az,
      bsv.t,
      bsv.bs,
      bsv.au,
      bsv.aG,
      bsv.an,
      bsv.p,
      bsv.aw,
      bsv.Q,
      bsv.h,
      bsv.Z,
      bsv.aZ,
      bsv.X,
      bsv.f,
      bsv.o,
      bsv.c
   );
   public static final List<bsv<?>> b = List.of(bsv.bh, bsv.R, bsv.aR);
   private static final cuf[] d = new cuf[]{cun.qZ, cun.rb, cun.rc, cun.ra};
   private static final cuf[] e = new cuf[]{cun.qH, cun.qI, cun.qF, cun.qG};
   private static final cuf[] f = new cuf[]{
      cun.ot,
      cun.pr,
      cun.px,
      cun.pX,
      cun.pY,
      cun.qa,
      cun.qb,
      cun.qZ,
      cun.ra,
      cun.rb,
      cun.rc,
      cun.rd,
      cun.re,
      cun.rS,
      cun.rW,
      cun.sa,
      cun.sb,
      cun.sc,
      cun.sd,
      cun.se,
      cun.sm,
      cun.uf,
      cun.ug,
      cun.uh,
      cun.ui,
      cun.uk,
      cun.ut,
      cun.uA,
      cun.uB,
      cun.uC,
      cun.uN,
      cun.uO,
      cun.vg,
      cun.vk,
      cun.vm,
      cun.rX,
      cun.vU,
      cun.wr,
      cun.wz,
      cun.ws
   };
   public static final cuf[] c = new cuf[]{cun.oO, cun.oY, cun.oT, cun.pd, cun.pi, cun.pn};

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dew.ij,
            xl.c("advancements.husbandry.root.title"),
            xl.c("advancements.husbandry.root.description"),
            new alb("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", be.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cun.pw, xl.c("advancements.husbandry.plant_seed.title"), xl.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dew.cB))
         .a("pumpkin_stem", ct.a.a(dew.fd))
         .a("melon_stem", ct.a.a(dew.fe))
         .a("beetroots", ct.a.a(dew.kD))
         .a("nether_wart", ct.a.a(dew.fq))
         .a("torchflower", ct.a.a(dew.kA))
         .a("pitcher_pod", ct.a.a(dew.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cun.pw,
            xl.c("advancements.husbandry.breed_an_animal.title"),
            xl.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", aw.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$4, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$3)
         .a(cun.ot, xl.c("advancements.husbandry.balanced_diet.title"), xl.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cun.po, xl.c("advancements.husbandry.netherite_hoe.title"), xl.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cun.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cun.uK,
            xl.c("advancements.husbandry.tame_an_animal.title"),
            xl.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", ea.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            cun.qV,
            xl.c("advancements.husbandry.fishy_business.title"),
            xl.c("advancements.husbandry.fishy_business.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      af $$7 = c(ae.a.a())
         .a($$6)
         .a(ai.a.b)
         .a(
            cun.qF,
            xl.c("advancements.husbandry.tactical_fishing.title"),
            xl.c("advancements.husbandry.tactical_fishing.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      af $$8 = ae.a.a()
         .a($$7)
         .a(ai.a.b)
         .a(lp.h.b(cun.qJ).a(), bz.a.a(cp.a.a().a(cun.qJ)))
         .a(
            cun.qJ,
            xl.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xl.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(bsv.f)))
         .a(
            cun.qI,
            xl.c("advancements.husbandry.kill_axolotl_target.title"),
            xl.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$5)
         .a(
            cun.qZ,
            xl.c("advancements.husbandry.complete_catalogue.title"),
            xl.c("advancements.husbandry.complete_catalogue.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ae.a.a(), $$0)
         .a($$5)
         .a(cun.rz, xl.c("advancements.husbandry.whole_pack.title"), xl.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(awl.aG)).a(true), cp.a.a().a(cun.sl)))
         .a(
            cun.wz,
            xl.c("advancements.husbandry.safely_harvest_honey.title"),
            xl.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cun.ww, xl.c("advancements.husbandry.wax_on.title"), xl.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(cua.a.get().keySet())), cp.a.a().a(cun.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cun.oT, xl.c("advancements.husbandry.wax_off.title"), xl.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(cua.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(lp.h.b(cun.qK).a(), bz.a.a(cp.a.a().a(cun.qK)))
         .a(
            cun.qK,
            xl.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xl.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      af $$12 = a(ae.a.a())
         .a($$11)
         .a(
            cun.uK,
            xl.c("advancements.husbandry.leash_all_frog_variants.title"),
            xl.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cun.xn, xl.c("advancements.husbandry.froglights.title"), xl.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cun.xm, cun.xo, cun.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dew.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp(czy.v, de.d.b(1))))), de.d.a(3)))
         .a(
            dew.pe,
            xl.c("advancements.husbandry.silk_touch_nest.title"),
            xl.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$2)
         .a(
            cun.nU,
            xl.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xl.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dw.a.a(bu.a.a().a(bu.a.a().a(bsv.k).b(bu.a.a().a(bsv.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cun.rg,
            xl.c("advancements.husbandry.make_a_sign_glow.title"),
            xl.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(awl.aB)), cp.a.a().a(cun.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cun.rS,
            xl.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xl.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dh.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(bsv.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cun.mf,
            xl.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xl.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dew.aY)), cp.a.a().a(cun.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cun.kq,
            xl.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xl.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cun.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cun.vi, xl.c("advancements.husbandry.feed_snifflet.title"), xl.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dj.a.a(cp.a.a().a(awu.X), Optional.of(bu.a(bu.a.a().a(bsv.aR).a(bs.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cun.vj,
            xl.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xl.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dew.kA))
         .a("pitcher_pod", ct.a.a(dew.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$5)
         .a(
            cun.rV,
            xl.c("advancements.husbandry.remove_wolf_armor.title"),
            xl.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dj.a.a(cp.a.a().a(cun.rV), Optional.of(bu.a(bu.a.a().a(bsv.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$5)
         .a(
            cun.or,
            xl.c("advancements.husbandry.repair_wolf_armor.title"),
            xl.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dj.a.a(cp.a.a().a(cun.oq), Optional.of(bu.a(bu.a.a().a(bsv.bs).a(br.a.a().e(cp.a.a().a(cun.or).a(kk.a().a(km.d, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsv<?>> $$2, Stream<bsv<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cun.uk,
            xl.c("advancements.husbandry.breed_all_animals.title"),
            xl.c("advancements.husbandry.breed_all_animals.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ae.a a(ae.a $$0) {
      lp.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), dj.a.a(cp.a.a().a(cun.uK), Optional.of(bu.a(bu.a.a().a(bsv.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cuf $$1 : f) {
         $$0.a(lp.h.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsv<?>> $$1, Stream<bsv<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsv.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsv.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cuf $$1 : e) {
         $$0.a(lp.h.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cuf $$1 : d) {
         $$0.a(lp.h.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lp.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ea.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jk.a $$1) {
      jk.b<cge> $$2 = $$1.b(lq.m);
      $$2.c().sorted(Comparator.comparing(ala::a)).forEach($$2x -> {
         ji<cge> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ea.a.a(bu.a.a().a(bw.a(jm.a($$3)))));
      });
      return $$0;
   }
}
