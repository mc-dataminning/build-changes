import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mg implements ma {
   public static final List<btc<?>> a = List.of(
      btc.ab,
      btc.z,
      btc.at,
      btc.aJ,
      btc.w,
      btc.as,
      btc.az,
      btc.t,
      btc.bs,
      btc.au,
      btc.aG,
      btc.an,
      btc.p,
      btc.aw,
      btc.Q,
      btc.h,
      btc.Z,
      btc.aZ,
      btc.X,
      btc.f,
      btc.o,
      btc.c
   );
   public static final List<btc<?>> b = List.of(btc.bh, btc.R, btc.aR);
   private static final cum[] d = new cum[]{cuu.qZ, cuu.rb, cuu.rc, cuu.ra};
   private static final cum[] e = new cum[]{cuu.qH, cuu.qI, cuu.qF, cuu.qG};
   private static final cum[] f = new cum[]{
      cuu.ot,
      cuu.pr,
      cuu.px,
      cuu.pX,
      cuu.pY,
      cuu.qa,
      cuu.qb,
      cuu.qZ,
      cuu.ra,
      cuu.rb,
      cuu.rc,
      cuu.rd,
      cuu.re,
      cuu.rS,
      cuu.rW,
      cuu.sa,
      cuu.sb,
      cuu.sc,
      cuu.sd,
      cuu.se,
      cuu.sm,
      cuu.uf,
      cuu.ug,
      cuu.uh,
      cuu.ui,
      cuu.uk,
      cuu.ut,
      cuu.uA,
      cuu.uB,
      cuu.uC,
      cuu.uN,
      cuu.uO,
      cuu.vg,
      cuu.vk,
      cuu.vm,
      cuu.rX,
      cuu.vU,
      cuu.wr,
      cuu.wz,
      cuu.ws
   };
   public static final cum[] c = new cum[]{cuu.oO, cuu.oY, cuu.oT, cuu.pd, cuu.pi, cuu.pn};

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfd.ij,
            xp.c("advancements.husbandry.root.title"),
            xp.c("advancements.husbandry.root.description"),
            new alf("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", be.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuu.pw, xp.c("advancements.husbandry.plant_seed.title"), xp.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dfd.cB))
         .a("pumpkin_stem", ct.a.a(dfd.fd))
         .a("melon_stem", ct.a.a(dfd.fe))
         .a("beetroots", ct.a.a(dfd.kD))
         .a("nether_wart", ct.a.a(dfd.fq))
         .a("torchflower", ct.a.a(dfd.kA))
         .a("pitcher_pod", ct.a.a(dfd.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cuu.pw,
            xp.c("advancements.husbandry.breed_an_animal.title"),
            xp.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cuu.ot, xp.c("advancements.husbandry.balanced_diet.title"), xp.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cuu.po, xp.c("advancements.husbandry.netherite_hoe.title"), xp.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cuu.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cuu.uK,
            xp.c("advancements.husbandry.tame_an_animal.title"),
            xp.c("advancements.husbandry.tame_an_animal.description"),
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
            cuu.qV,
            xp.c("advancements.husbandry.fishy_business.title"),
            xp.c("advancements.husbandry.fishy_business.description"),
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
            cuu.qF,
            xp.c("advancements.husbandry.tactical_fishing.title"),
            xp.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lp.h.b(cuu.qJ).a(), bz.a.a(cp.a.a().a(cuu.qJ)))
         .a(
            cuu.qJ,
            xp.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xp.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(btc.f)))
         .a(
            cuu.qI,
            xp.c("advancements.husbandry.kill_axolotl_target.title"),
            xp.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cuu.qZ,
            xp.c("advancements.husbandry.complete_catalogue.title"),
            xp.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cuu.rz, xp.c("advancements.husbandry.whole_pack.title"), xp.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(awp.aG)).a(true), cp.a.a().a(cuu.sl)))
         .a(
            cuu.wz,
            xp.c("advancements.husbandry.safely_harvest_honey.title"),
            xp.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cuu.ww, xp.c("advancements.husbandry.wax_on.title"), xp.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(cuh.a.get().keySet())), cp.a.a().a(cuu.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cuu.oT, xp.c("advancements.husbandry.wax_off.title"), xp.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(cuh.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(lp.h.b(cuu.qK).a(), bz.a.a(cp.a.a().a(cuu.qK)))
         .a(
            cuu.qK,
            xp.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xp.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cuu.uK,
            xp.c("advancements.husbandry.leash_all_frog_variants.title"),
            xp.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cuu.xn, xp.c("advancements.husbandry.froglights.title"), xp.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cuu.xm, cuu.xo, cuu.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dfd.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp(daf.v, de.d.b(1))))), de.d.a(3)))
         .a(
            dfd.pe,
            xp.c("advancements.husbandry.silk_touch_nest.title"),
            xp.c("advancements.husbandry.silk_touch_nest.description"),
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
            cuu.nU,
            xp.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xp.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dw.a.a(bu.a.a().a(bu.a.a().a(btc.k).b(bu.a.a().a(btc.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cuu.rg,
            xp.c("advancements.husbandry.make_a_sign_glow.title"),
            xp.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(awp.aB)), cp.a.a().a(cuu.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cuu.rS,
            xp.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xp.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dh.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(btc.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cuu.mf,
            xp.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xp.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dfd.aY)), cp.a.a().a(cuu.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cuu.kq,
            xp.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xp.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cuu.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cuu.vi, xp.c("advancements.husbandry.feed_snifflet.title"), xp.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dj.a.a(cp.a.a().a(awy.X), Optional.of(bu.a(bu.a.a().a(btc.aR).a(bs.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cuu.vj,
            xp.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xp.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dfd.kA))
         .a("pitcher_pod", ct.a.a(dfd.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$5)
         .a(
            cuu.rV,
            xp.c("advancements.husbandry.remove_wolf_armor.title"),
            xp.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dj.a.a(cp.a.a().a(cuu.rV), Optional.of(bu.a(bu.a.a().a(btc.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$5)
         .a(
            cuu.or,
            xp.c("advancements.husbandry.repair_wolf_armor.title"),
            xp.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dj.a.a(cp.a.a().a(cuu.oq), Optional.of(bu.a(bu.a.a().a(btc.bs).a(br.a.a().e(cp.a.a().a(cuu.or).a(kk.a().a(km.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<btc<?>> $$2, Stream<btc<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cuu.uk,
            xp.c("advancements.husbandry.breed_all_animals.title"),
            xp.c("advancements.husbandry.breed_all_animals.description"),
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
      lp.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), dj.a.a(cp.a.a().a(cuu.uK), Optional.of(bu.a(bu.a.a().a(btc.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cum $$1 : f) {
         $$0.a(lp.h.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<btc<?>> $$1, Stream<btc<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(btc.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(btc.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cum $$1 : e) {
         $$0.a(lp.h.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cum $$1 : d) {
         $$0.a(lp.h.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lp.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ea.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jk.a $$1) {
      jk.b<cgl> $$2 = $$1.b(lq.m);
      $$2.c().sorted(Comparator.comparing(ale::a)).forEach($$2x -> {
         ji<cgl> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ea.a.a(bu.a.a().a(bw.a(jm.a($$3)))));
      });
      return $$0;
   }
}
