import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mg implements ma {
   public static final List<bsy<?>> a = List.of(
      bsy.ab,
      bsy.z,
      bsy.at,
      bsy.aJ,
      bsy.w,
      bsy.as,
      bsy.az,
      bsy.t,
      bsy.bs,
      bsy.au,
      bsy.aG,
      bsy.an,
      bsy.p,
      bsy.aw,
      bsy.Q,
      bsy.h,
      bsy.Z,
      bsy.aZ,
      bsy.X,
      bsy.f,
      bsy.o,
      bsy.c
   );
   public static final List<bsy<?>> b = List.of(bsy.bh, bsy.R, bsy.aR);
   private static final cui[] d = new cui[]{cuq.qZ, cuq.rb, cuq.rc, cuq.ra};
   private static final cui[] e = new cui[]{cuq.qH, cuq.qI, cuq.qF, cuq.qG};
   private static final cui[] f = new cui[]{
      cuq.ot,
      cuq.pr,
      cuq.px,
      cuq.pX,
      cuq.pY,
      cuq.qa,
      cuq.qb,
      cuq.qZ,
      cuq.ra,
      cuq.rb,
      cuq.rc,
      cuq.rd,
      cuq.re,
      cuq.rS,
      cuq.rW,
      cuq.sa,
      cuq.sb,
      cuq.sc,
      cuq.sd,
      cuq.se,
      cuq.sm,
      cuq.uf,
      cuq.ug,
      cuq.uh,
      cuq.ui,
      cuq.uk,
      cuq.ut,
      cuq.uA,
      cuq.uB,
      cuq.uC,
      cuq.uN,
      cuq.uO,
      cuq.vg,
      cuq.vk,
      cuq.vm,
      cuq.rX,
      cuq.vU,
      cuq.wr,
      cuq.wz,
      cuq.ws
   };
   public static final cui[] c = new cui[]{cuq.oO, cuq.oY, cuq.oT, cuq.pd, cuq.pi, cuq.pn};

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dez.ij,
            xo.c("advancements.husbandry.root.title"),
            xo.c("advancements.husbandry.root.description"),
            new ale("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", be.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuq.pw, xo.c("advancements.husbandry.plant_seed.title"), xo.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dez.cB))
         .a("pumpkin_stem", ct.a.a(dez.fd))
         .a("melon_stem", ct.a.a(dez.fe))
         .a("beetroots", ct.a.a(dez.kD))
         .a("nether_wart", ct.a.a(dez.fq))
         .a("torchflower", ct.a.a(dez.kA))
         .a("pitcher_pod", ct.a.a(dez.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cuq.pw,
            xo.c("advancements.husbandry.breed_an_animal.title"),
            xo.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cuq.ot, xo.c("advancements.husbandry.balanced_diet.title"), xo.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cuq.po, xo.c("advancements.husbandry.netherite_hoe.title"), xo.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cuq.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cuq.uK,
            xo.c("advancements.husbandry.tame_an_animal.title"),
            xo.c("advancements.husbandry.tame_an_animal.description"),
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
            cuq.qV,
            xo.c("advancements.husbandry.fishy_business.title"),
            xo.c("advancements.husbandry.fishy_business.description"),
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
            cuq.qF,
            xo.c("advancements.husbandry.tactical_fishing.title"),
            xo.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lp.h.b(cuq.qJ).a(), bz.a.a(cp.a.a().a(cuq.qJ)))
         .a(
            cuq.qJ,
            xo.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xo.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(bsy.f)))
         .a(
            cuq.qI,
            xo.c("advancements.husbandry.kill_axolotl_target.title"),
            xo.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cuq.qZ,
            xo.c("advancements.husbandry.complete_catalogue.title"),
            xo.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cuq.rz, xo.c("advancements.husbandry.whole_pack.title"), xo.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(awo.aG)).a(true), cp.a.a().a(cuq.sl)))
         .a(
            cuq.wz,
            xo.c("advancements.husbandry.safely_harvest_honey.title"),
            xo.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cuq.ww, xo.c("advancements.husbandry.wax_on.title"), xo.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(cud.a.get().keySet())), cp.a.a().a(cuq.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cuq.oT, xo.c("advancements.husbandry.wax_off.title"), xo.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(cud.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(lp.h.b(cuq.qK).a(), bz.a.a(cp.a.a().a(cuq.qK)))
         .a(
            cuq.qK,
            xo.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xo.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cuq.uK,
            xo.c("advancements.husbandry.leash_all_frog_variants.title"),
            xo.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(cuq.xn, xo.c("advancements.husbandry.froglights.title"), xo.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cuq.xm, cuq.xo, cuq.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dez.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp(dab.v, de.d.b(1))))), de.d.a(3)))
         .a(
            dez.pe,
            xo.c("advancements.husbandry.silk_touch_nest.title"),
            xo.c("advancements.husbandry.silk_touch_nest.description"),
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
            cuq.nU,
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dw.a.a(bu.a.a().a(bu.a.a().a(bsy.k).b(bu.a.a().a(bsy.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cuq.rg,
            xo.c("advancements.husbandry.make_a_sign_glow.title"),
            xo.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(awo.aB)), cp.a.a().a(cuq.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cuq.rS,
            xo.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xo.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dh.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(bsy.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cuq.mf,
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dez.aY)), cp.a.a().a(cuq.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cuq.kq,
            xo.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xo.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cuq.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cuq.vi, xo.c("advancements.husbandry.feed_snifflet.title"), xo.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dj.a.a(cp.a.a().a(awx.X), Optional.of(bu.a(bu.a.a().a(bsy.aR).a(bs.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cuq.vj,
            xo.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xo.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dez.kA))
         .a("pitcher_pod", ct.a.a(dez.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$5)
         .a(
            cuq.rV,
            xo.c("advancements.husbandry.remove_wolf_armor.title"),
            xo.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dj.a.a(cp.a.a().a(cuq.rV), Optional.of(bu.a(bu.a.a().a(bsy.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$5)
         .a(
            cuq.or,
            xo.c("advancements.husbandry.repair_wolf_armor.title"),
            xo.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dj.a.a(cp.a.a().a(cuq.oq), Optional.of(bu.a(bu.a.a().a(bsy.bs).a(br.a.a().e(cp.a.a().a(cuq.or).a(kk.a().a(km.d, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsy<?>> $$2, Stream<bsy<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cuq.uk,
            xo.c("advancements.husbandry.breed_all_animals.title"),
            xo.c("advancements.husbandry.breed_all_animals.description"),
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
      lp.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), dj.a.a(cp.a.a().a(cuq.uK), Optional.of(bu.a(bu.a.a().a(bsy.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cui $$1 : f) {
         $$0.a(lp.h.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsy<?>> $$1, Stream<bsy<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsy.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsy.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cui $$1 : e) {
         $$0.a(lp.h.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cui $$1 : d) {
         $$0.a(lp.h.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lp.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ea.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jk.a $$1) {
      jk.b<cgh> $$2 = $$1.b(lq.m);
      $$2.c().sorted(Comparator.comparing(ald::a)).forEach($$2x -> {
         ji<cgh> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ea.a.a(bu.a.a().a(bw.a(jm.a($$3)))));
      });
      return $$0;
   }
}
