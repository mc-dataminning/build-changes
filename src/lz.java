import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class lz implements ls {
   public static final List<bsb<?>> a = List.of(
      bsb.ad,
      bsb.B,
      bsb.au,
      bsb.aL,
      bsb.y,
      bsb.at,
      bsb.aA,
      bsb.v,
      bsb.bw,
      bsb.av,
      bsb.aI,
      bsb.ao,
      bsb.r,
      bsb.ax,
      bsb.S,
      bsb.j,
      bsb.ab,
      bsb.bc,
      bsb.Z,
      bsb.g,
      bsb.q,
      bsb.c
   );
   public static final List<bsb<?>> b = List.of(bsb.bl, bsb.T, bsb.aU);
   private static final cuc[] d = new cuc[]{cuk.sw, cuk.sy, cuk.sz, cuk.sx};
   private static final cuc[] e = new cuc[]{cuk.se, cuk.sf, cuk.sc, cuk.sd};
   private static final cuc[] f = new cuc[]{
      cuk.pJ,
      cuk.qK,
      cuk.qQ,
      cuk.rs,
      cuk.rt,
      cuk.rv,
      cuk.rw,
      cuk.sw,
      cuk.sx,
      cuk.sy,
      cuk.sz,
      cuk.sA,
      cuk.sB,
      cuk.tp,
      cuk.tt,
      cuk.tx,
      cuk.ty,
      cuk.tz,
      cuk.tA,
      cuk.tB,
      cuk.tJ,
      cuk.vH,
      cuk.vI,
      cuk.vJ,
      cuk.vT,
      cuk.vM,
      cuk.vN,
      cuk.vL,
      cuk.vO,
      cuk.vV,
      cuk.we,
      cuk.wl,
      cuk.wm,
      cuk.wn,
      cuk.wy,
      cuk.wz,
      cuk.wR,
      cuk.wV,
      cuk.wX,
      cuk.tu,
      cuk.xF,
      cuk.yd,
      cuk.ym,
      cuk.ye
   };
   public static final cuc[] c = new cuc[]{cuk.qh, cuk.qr, cuk.qm, cuk.qw, cuk.qB, cuk.qG};

   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfe.jd,
            xe.c("advancements.husbandry.root.title"),
            xe.c("advancements.husbandry.root.description"),
            new akt("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bc.a.b())
         .a($$1, "husbandry/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cuk.qP, xe.c("advancements.husbandry.plant_seed.title"), xe.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cl.a.a(dfe.dm))
         .a("pumpkin_stem", cl.a.a(dfe.fV))
         .a("melon_stem", cl.a.a(dfe.fW))
         .a("beetroots", cl.a.a(dfe.lA))
         .a("nether_wart", cl.a.a(dfe.gi))
         .a("torchflower", cl.a.a(dfe.lx))
         .a("pitcher_pod", cl.a.a(dfe.ly))
         .a($$1, "husbandry/plant_seed");
      ag $$4 = af.a.a()
         .a($$2)
         .a(
            cuk.qP,
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
      a($$4, $$1, a.stream(), b.stream());
      b(af.a.a())
         .a($$3)
         .a(cuk.pJ, xe.c("advancements.husbandry.balanced_diet.title"), xe.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$3)
         .a(cuk.qH, xe.c("advancements.husbandry.netherite_hoe.title"), xe.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cc.a.a(cuk.qH))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$5 = af.a.a()
         .a($$2)
         .a(
            cuk.wv,
            xe.c("advancements.husbandry.tame_an_animal.title"),
            xe.c("advancements.husbandry.tame_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dr.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ag $$6 = d(af.a.a())
         .a($$2)
         .a(aj.a.b)
         .a(
            cuk.ss,
            xe.c("advancements.husbandry.fishy_business.title"),
            xe.c("advancements.husbandry.fishy_business.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ag $$7 = c(af.a.a())
         .a($$6)
         .a(aj.a.b)
         .a(
            cuk.sc,
            xe.c("advancements.husbandry.tactical_fishing.title"),
            xe.c("advancements.husbandry.tactical_fishing.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ag $$8 = af.a.a()
         .a($$7)
         .a(aj.a.b)
         .a(lh.h.b(cuk.sg).a(), bx.a.a(ci.a.a().a(cuk.sg)))
         .a(
            cuk.sg,
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
         .a($$8)
         .a("kill_axolotl_target", bl.a.a(bs.a.a().a(bsb.g)))
         .a(
            cuk.sf,
            xe.c("advancements.husbandry.kill_axolotl_target.title"),
            xe.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(af.a.a())
         .a($$5)
         .a(
            cuk.sw,
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
      ag $$9 = af.a.a()
         .a($$2)
         .a("safely_harvest_honey", cl.a.a(cs.a.a().a(aw.a.a().a(awe.aH)).a(true), ci.a.a().a(cuk.tI)))
         .a(
            cuk.ym,
            xe.c("advancements.husbandry.safely_harvest_honey.title"),
            xe.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$10 = af.a.a()
         .a($$9)
         .a(cuk.yj, xe.c("advancements.husbandry.wax_on.title"), xe.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cl.a.a(cs.a.a().a(aw.a.a().a(ctw.a.get().keySet())), ci.a.a().a(cuk.yj)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$10)
         .a(cuk.qm, xe.c("advancements.husbandry.wax_off.title"), xe.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cl.a.a(cs.a.a().a(aw.a.a().a(ctw.b.get().keySet())), ci.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      ag $$11 = af.a.a()
         .a($$2)
         .a(lh.h.b(cuk.sh).a(), bx.a.a(ci.a.a().a(cuk.sh)))
         .a(
            cuk.sh,
            xe.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xe.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ag $$12 = a(af.a.a())
         .a($$11)
         .a(
            cuk.wv,
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
         .a($$12)
         .a(cuk.za, xe.c("advancements.husbandry.froglights.title"), xe.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cc.a.a(cuk.yZ, cuk.zb, cuk.za))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$2)
         .a("silk_touch_nest", av.a.a(dfe.qp, ci.a.a().a(ck.b, cg.a(List.of(new bn(dag.v, cu.d.b(1))))), cu.d.a(3)))
         .a(
            dfe.qp,
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
         .a($$2)
         .a(
            cuk.pk,
            xe.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xe.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dm.a.a(bs.a.a().a(bs.a.a().a(bsb.m).b(bs.a.a().a(bsb.Z)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$2)
         .a(
            cuk.sD,
            xe.c("advancements.husbandry.make_a_sign_glow.title"),
            xe.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cl.a.a(cs.a.a().a(aw.a.a().a(awe.aC)), ci.a.a().a(cuk.sD)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$13 = af.a.a()
         .a($$2)
         .a(
            cuk.tp,
            xe.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xe.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cx.a.a(Optional.empty(), Optional.empty(), Optional.of(bs.a(bs.a.a().a(bsb.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$13)
         .a(
            cuk.nv,
            xe.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xe.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cl.a.b(cs.a.a().a(aw.a.a().a(dfe.bI)), ci.a.a().a(cuk.sY)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$14 = af.a.a()
         .a($$2)
         .a(
            cuk.lF,
            xe.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xe.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cc.a.a(cuk.lF))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$15 = af.a.a()
         .a($$14)
         .a(cuk.wT, xe.c("advancements.husbandry.feed_snifflet.title"), xe.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", cz.a.a(ci.a.a().a(awm.X), Optional.of(bs.a(bs.a.a().a(bsb.aU).a(bq.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$15)
         .a(
            cuk.wU,
            xe.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xe.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cl.a.a(dfe.lx))
         .a("pitcher_pod", cl.a.a(dfe.ly))
         .a($$1, "husbandry/plant_any_sniffer_seed");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, Stream<bsb<?>> $$2, Stream<bsb<?>> $$3) {
      return a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cuk.vV,
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

   private static af.a a(af.a $$0) {
      lh.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), cz.a.a(ci.a.a().a(cuk.wv), Optional.of(bs.a(bs.a.a().a(bsb.T).a(bu.b($$1)))))));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      for (cuc $$1 : f) {
         $$0.a(lh.h.b($$1).a(), bc.a.a($$1));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<bsb<?>> $$1, Stream<bsb<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsb.a($$1x).toString(), ax.a.a(bs.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsb.a($$1x).toString(), ax.a.a(Optional.of(bs.a.a().a($$1x).b()), Optional.of(bs.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      for (cuc $$1 : e) {
         $$0.a(lh.h.b($$1).a(), bx.a.a(ci.a.a().a($$1)));
      }

      return $$0;
   }

   private static af.a d(af.a $$0) {
      for (cuc $$1 : d) {
         $$0.a(lh.h.b($$1).a(), bz.a.a(Optional.empty(), Optional.empty(), Optional.of(ci.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static af.a e(af.a $$0) {
      lh.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), dr.a.a(bs.a.a().a(bu.a($$1)))));
      return $$0;
   }
}
