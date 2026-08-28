import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mf implements mb {
   public static final List<bsm<?>> a = List.of(
      bsm.ab,
      bsm.z,
      bsm.at,
      bsm.aJ,
      bsm.w,
      bsm.as,
      bsm.az,
      bsm.t,
      bsm.bs,
      bsm.au,
      bsm.aG,
      bsm.an,
      bsm.p,
      bsm.aw,
      bsm.Q,
      bsm.h,
      bsm.Z,
      bsm.aZ,
      bsm.X,
      bsm.f,
      bsm.o,
      bsm.c
   );
   public static final List<bsm<?>> b = List.of(bsm.bh, bsm.R, bsm.aR);
   private static final ctx[] d = new ctx[]{cuf.qZ, cuf.rb, cuf.rc, cuf.ra};
   private static final ctx[] e = new ctx[]{cuf.qH, cuf.qI, cuf.qF, cuf.qG};
   private static final ctx[] f = new ctx[]{
      cuf.ou,
      cuf.pr,
      cuf.px,
      cuf.pX,
      cuf.pY,
      cuf.qa,
      cuf.qb,
      cuf.qZ,
      cuf.ra,
      cuf.rb,
      cuf.rc,
      cuf.rd,
      cuf.re,
      cuf.rS,
      cuf.rW,
      cuf.sa,
      cuf.sb,
      cuf.sc,
      cuf.sd,
      cuf.se,
      cuf.sm,
      cuf.uf,
      cuf.ug,
      cuf.uh,
      cuf.ui,
      cuf.uk,
      cuf.ut,
      cuf.uA,
      cuf.uB,
      cuf.uC,
      cuf.uN,
      cuf.uO,
      cuf.vg,
      cuf.vk,
      cuf.vm,
      cuf.rX,
      cuf.vX,
      cuf.wu,
      cuf.wC,
      cuf.wv
   };
   public static final ctx[] c = new ctx[]{cuf.oP, cuf.oZ, cuf.oU, cuf.pe, cuf.pj, cuf.po};

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      jl.b<czl> $$2 = $$0.b(lr.aK);
      af $$3 = ae.a.a()
         .a(
            dfj.ij,
            wu.c("advancements.husbandry.root.title"),
            wu.c("advancements.husbandry.root.description"),
            new akk("textures/gui/advancements/backgrounds/husbandry.png"),
            al.a,
            false,
            false,
            false
         )
         .a("consumed_item", be.a.b())
         .a($$1, "husbandry/root");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cuf.pw, wu.c("advancements.husbandry.plant_seed.title"), wu.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dfj.cB))
         .a("pumpkin_stem", ct.a.a(dfj.fd))
         .a("melon_stem", ct.a.a(dfj.fe))
         .a("beetroots", ct.a.a(dfj.kD))
         .a("nether_wart", ct.a.a(dfj.fq))
         .a("torchflower", ct.a.a(dfj.kA))
         .a("pitcher_pod", ct.a.a(dfj.kB))
         .a($$1, "husbandry/plant_seed");
      af $$5 = ae.a.a()
         .a($$3)
         .a(
            cuf.pw,
            wu.c("advancements.husbandry.breed_an_animal.title"),
            wu.c("advancements.husbandry.breed_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("bred", aw.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$5, $$1, a.stream(), b.stream());
      b(ae.a.a())
         .a($$4)
         .a(cuf.ou, wu.c("advancements.husbandry.balanced_diet.title"), wu.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$4)
         .a(cuf.pp, wu.c("advancements.husbandry.netherite_hoe.title"), wu.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cuf.pp))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$6 = ae.a.a()
         .a($$3)
         .a(
            cuf.uK,
            wu.c("advancements.husbandry.tame_an_animal.title"),
            wu.c("advancements.husbandry.tame_an_animal.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("tamed_animal", eb.a.b())
         .a($$1, "husbandry/tame_an_animal");
      af $$7 = d(ae.a.a())
         .a($$3)
         .a(ai.a.b)
         .a(
            cuf.qV,
            wu.c("advancements.husbandry.fishy_business.title"),
            wu.c("advancements.husbandry.fishy_business.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      af $$8 = c(ae.a.a())
         .a($$7)
         .a(ai.a.b)
         .a(
            cuf.qF,
            wu.c("advancements.husbandry.tactical_fishing.title"),
            wu.c("advancements.husbandry.tactical_fishing.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      af $$9 = ae.a.a()
         .a($$8)
         .a(ai.a.b)
         .a(lq.g.b(cuf.qJ).a(), bz.a.a(cp.a.a().a(cuf.qJ)))
         .a(
            cuf.qJ,
            wu.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wu.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ae.a.a()
         .a($$9)
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(bsm.f)))
         .a(
            cuf.qI,
            wu.c("advancements.husbandry.kill_axolotl_target.title"),
            wu.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(ae.a.a())
         .a($$6)
         .a(
            cuf.qZ,
            wu.c("advancements.husbandry.complete_catalogue.title"),
            wu.c("advancements.husbandry.complete_catalogue.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(ae.a.a(), $$0)
         .a($$6)
         .a(cuf.rz, wu.c("advancements.husbandry.whole_pack.title"), wu.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$10 = ae.a.a()
         .a($$3)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(avw.aG)).a(true), cp.a.a().a(cuf.sl)))
         .a(
            cuf.wC,
            wu.c("advancements.husbandry.safely_harvest_honey.title"),
            wu.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cuf.wz, wu.c("advancements.husbandry.wax_on.title"), wu.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(cts.a.get().keySet())), cp.a.a().a(cuf.wz)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$11)
         .a(cuf.oU, wu.c("advancements.husbandry.wax_off.title"), wu.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(cts.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$12 = ae.a.a()
         .a($$3)
         .a(lq.g.b(cuf.qK).a(), bz.a.a(cp.a.a().a(cuf.qK)))
         .a(
            cuf.qK,
            wu.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wu.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      af $$13 = a(ae.a.a())
         .a($$12)
         .a(
            cuf.uK,
            wu.c("advancements.husbandry.leash_all_frog_variants.title"),
            wu.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ae.a.a()
         .a($$13)
         .a(cuf.xq, wu.c("advancements.husbandry.froglights.title"), wu.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cuf.xp, cuf.xr, cuf.xq))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$3)
         .a("silk_touch_nest", au.a.a(dfj.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp($$2.b(czq.v), de.d.b(1))))), de.d.a(3)))
         .a(
            dfj.pe,
            wu.c("advancements.husbandry.silk_touch_nest.title"),
            wu.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ae.a.a()
         .a($$3)
         .a(
            cuf.nU,
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dx.a.a(bu.a.a().a(bu.a.a().a(bsm.k).b(bu.a.a().a(bsm.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$3)
         .a(
            cuf.rg,
            wu.c("advancements.husbandry.make_a_sign_glow.title"),
            wu.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(avw.aB)), cp.a.a().a(cuf.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$14 = ae.a.a()
         .a($$3)
         .a(
            cuf.rS,
            wu.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wu.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", di.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(bsm.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$14)
         .a(
            cuf.mf,
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dfj.aY)), cp.a.a().a(cuf.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$15 = ae.a.a()
         .a($$3)
         .a(
            cuf.kq,
            wu.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wu.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cuf.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$16 = ae.a.a()
         .a($$15)
         .a(cuf.vi, wu.c("advancements.husbandry.feed_snifflet.title"), wu.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dk.a.a(cp.a.a().a(awf.X), Optional.of(bu.a(bu.a.a().a(bsm.aR).a(bs.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$16)
         .a(
            cuf.vj,
            wu.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wu.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dfj.kA))
         .a("pitcher_pod", ct.a.a(dfj.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$6)
         .a(
            cuf.rV,
            wu.c("advancements.husbandry.remove_wolf_armor.title"),
            wu.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dk.a.a(cp.a.a().a(cuf.rV), Optional.of(bu.a(bu.a.a().a(bsm.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$6)
         .a(
            cuf.or,
            wu.c("advancements.husbandry.repair_wolf_armor.title"),
            wu.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dk.a.a(cp.a.a().a(cuf.oq), Optional.of(bu.a(bu.a.a().a(bsm.bs).a(br.a.a().e(cp.a.a().a(cuf.or).a(kl.a().a(kn.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsm<?>> $$2, Stream<bsm<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cuf.uk,
            wu.c("advancements.husbandry.breed_all_animals.title"),
            wu.c("advancements.husbandry.breed_all_animals.description"),
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
      lq.aj.i().forEach($$1 -> $$0.a($$1.h().a().toString(), dk.a.a(cp.a.a().a(cuf.uK), Optional.of(bu.a(bu.a.a().a(bsm.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (ctx $$1 : f) {
         $$0.a(lq.g.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsm<?>> $$1, Stream<bsm<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsm.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsm.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (ctx $$1 : e) {
         $$0.a(lq.g.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (ctx $$1 : d) {
         $$0.a(lq.g.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lq.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eb.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jl.a $$1) {
      jl.b<cfv> $$2 = $$1.b(lr.m);
      $$2.c().sorted(Comparator.comparing(akj::a)).forEach($$2x -> {
         jj<cfv> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eb.a.a(bu.a.a().a(bw.a(jn.a($$3)))));
      });
      return $$0;
   }
}
