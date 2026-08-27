import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lt implements ln {
   public static final List<bqr<?>> a = List.of(
      bqr.ab,
      bqr.z,
      bqr.as,
      bqr.aI,
      bqr.w,
      bqr.ar,
      bqr.ay,
      bqr.t,
      bqr.br,
      bqr.at,
      bqr.aF,
      bqr.am,
      bqr.p,
      bqr.av,
      bqr.Q,
      bqr.h,
      bqr.Z,
      bqr.aY,
      bqr.X,
      bqr.f,
      bqr.o,
      bqr.c
   );
   public static final List<bqr<?>> b = List.of(bqr.bg, bqr.R, bqr.aQ);
   private static final cry[] c = new cry[]{csg.qZ, csg.rb, csg.rc, csg.ra};
   private static final cry[] d = new cry[]{csg.qH, csg.qI, csg.qF, csg.qG};
   private static final cry[] e = new cry[]{
      csg.ot,
      csg.pr,
      csg.px,
      csg.pX,
      csg.pY,
      csg.qa,
      csg.qb,
      csg.qZ,
      csg.ra,
      csg.rb,
      csg.rc,
      csg.rd,
      csg.re,
      csg.rS,
      csg.rW,
      csg.sa,
      csg.sb,
      csg.sc,
      csg.sd,
      csg.se,
      csg.sm,
      csg.uf,
      csg.ug,
      csg.uh,
      csg.ui,
      csg.uk,
      csg.ut,
      csg.uA,
      csg.uB,
      csg.uC,
      csg.uN,
      csg.uO,
      csg.vg,
      csg.vk,
      csg.vm,
      csg.rX,
      csg.vU,
      csg.wr,
      csg.wz,
      csg.ws
   };
   private static final cry[] f = new cry[]{csg.oO, csg.oY, csg.oT, csg.pd, csg.pi, csg.pn};

   @Override
   public void a(ix.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcx.ij,
            ws.c("advancements.husbandry.root.title"),
            ws.c("advancements.husbandry.root.description"),
            new akf("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", bb.a.b())
         .a($$1, "husbandry/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(csg.pw, ws.c("advancements.husbandry.plant_seed.title"), ws.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", cj.a.a(dcx.cB))
         .a("pumpkin_stem", cj.a.a(dcx.fd))
         .a("melon_stem", cj.a.a(dcx.fe))
         .a("beetroots", cj.a.a(dcx.kD))
         .a("nether_wart", cj.a.a(dcx.fq))
         .a("torchflower", cj.a.a(dcx.kA))
         .a("pitcher_pod", cj.a.a(dcx.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            csg.pw,
            ws.c("advancements.husbandry.breed_an_animal.title"),
            ws.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(csg.ot, ws.c("advancements.husbandry.balanced_diet.title"), ws.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(csg.po, ws.c("advancements.husbandry.netherite_hoe.title"), ws.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ca.a.a(csg.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            csg.uK,
            ws.c("advancements.husbandry.tame_an_animal.title"),
            ws.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dm.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$6 = d(ae.a.a())
         .a($$2)
         .a(ai.a.b)
         .a(
            csg.qV,
            ws.c("advancements.husbandry.fishy_business.title"),
            ws.c("advancements.husbandry.fishy_business.description"),
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
            csg.qF,
            ws.c("advancements.husbandry.tactical_fishing.title"),
            ws.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lc.h.b(csg.qJ).a(), bv.a.a(cg.a.a().a(csg.qJ)))
         .a(
            csg.qJ,
            ws.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            ws.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$8)
         .a("kill_axolotl_target", bk.a.a(br.a.a().a(bqr.f)))
         .a(
            csg.qI,
            ws.c("advancements.husbandry.kill_axolotl_target.title"),
            ws.c("advancements.husbandry.kill_axolotl_target.description"),
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
            csg.qZ,
            ws.c("advancements.husbandry.complete_catalogue.title"),
            ws.c("advancements.husbandry.complete_catalogue.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", cj.a.a(cq.a.a().a(av.a.a().a(avo.aG)).a(true), cg.a.a().a(csg.sl)))
         .a(
            csg.wz,
            ws.c("advancements.husbandry.safely_harvest_honey.title"),
            ws.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$10 = ae.a.a()
         .a($$9)
         .a(csg.ww, ws.c("advancements.husbandry.wax_on.title"), ws.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", cj.a.a(cq.a.a().a(av.a.a().a(crt.a.get().keySet())), cg.a.a().a(csg.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(csg.oT, ws.c("advancements.husbandry.wax_off.title"), ws.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", cj.a.a(cq.a.a().a(av.a.a().a(crt.b.get().keySet())), cg.a.a().a(f)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(lc.h.b(csg.qK).a(), bv.a.a(cg.a.a().a(csg.qK)))
         .a(
            csg.qK,
            ws.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            ws.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            csg.uK,
            ws.c("advancements.husbandry.leash_all_frog_variants.title"),
            ws.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$12)
         .a(csg.xn, ws.c("advancements.husbandry.froglights.title"), ws.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ca.a.a(csg.xm, csg.xo, csg.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dcx.pe, cg.a.a().a(ci.b, ce.a(List.of(new bm(cxq.v, cs.d.b(1))))), cs.d.a(3)))
         .a(
            dcx.pe,
            ws.c("advancements.husbandry.silk_touch_nest.title"),
            ws.c("advancements.husbandry.silk_touch_nest.description"),
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
            csg.nU,
            ws.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            ws.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", di.a.a(br.a.a().a(br.a.a().a(bqr.k).b(br.a.a().a(bqr.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            csg.rg,
            ws.c("advancements.husbandry.make_a_sign_glow.title"),
            ws.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cj.a.a(cq.a.a().a(av.a.a().a(avo.aB)), cg.a.a().a(csg.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            csg.rS,
            ws.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            ws.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cv.a.a(Optional.empty(), Optional.empty(), Optional.of(br.a(br.a.a().a(bqr.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            csg.mf,
            ws.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            ws.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cj.a.b(cq.a.a().a(av.a.a().a(dcx.aY)), cg.a.a().a(csg.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            csg.kq,
            ws.c("advancements.husbandry.obtain_sniffer_egg.title"),
            ws.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ca.a.a(csg.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(csg.vi, ws.c("advancements.husbandry.feed_snifflet.title"), ws.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", cx.a.a(cg.a.a().a(avw.aP), Optional.of(br.a(br.a.a().a(bqr.aQ).a(bp.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            csg.vj,
            ws.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            ws.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", cj.a.a(dcx.kA))
         .a("pitcher_pod", cj.a.a(dcx.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bqr<?>> $$2, Stream<bqr<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            csg.uk,
            ws.c("advancements.husbandry.breed_all_animals.title"),
            ws.c("advancements.husbandry.breed_all_animals.description"),
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
      lc.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cx.a.a(cg.a.a().a(csg.uK), Optional.of(br.a(br.a.a().a(bqr.R).a(bt.a($$1.a())))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cry $$1 : e) {
         $$0.a(lc.h.b($$1).a(), bb.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bqr<?>> $$1, Stream<bqr<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bqr.a($$1x).toString(), aw.a.a(br.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bqr.a($$1x).toString(), aw.a.a(Optional.of(br.a.a().a($$1x).b()), Optional.of(br.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cry $$1 : d) {
         $$0.a(lc.h.b($$1).a(), bv.a.a(cg.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cry $$1 : c) {
         $$0.a(lc.h.b($$1).a(), bx.a.a(Optional.empty(), Optional.empty(), Optional.of(cg.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lc.ak
         .g()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(ake::a)))
         .forEach($$1 -> $$0.a($$1.getKey().a().toString(), dm.a.a(br.a.a().a(bt.a($$1.getValue())))));
      return $$0;
   }
}
