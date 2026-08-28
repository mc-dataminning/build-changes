import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mf implements mb {
   public static final List<bsn<?>> a = List.of(
      bsn.ab,
      bsn.z,
      bsn.at,
      bsn.aJ,
      bsn.w,
      bsn.as,
      bsn.az,
      bsn.t,
      bsn.bs,
      bsn.au,
      bsn.aG,
      bsn.an,
      bsn.p,
      bsn.aw,
      bsn.Q,
      bsn.h,
      bsn.Z,
      bsn.aZ,
      bsn.X,
      bsn.f,
      bsn.o,
      bsn.c
   );
   public static final List<bsn<?>> b = List.of(bsn.bh, bsn.R, bsn.aR);
   private static final cty[] d = new cty[]{cug.qZ, cug.rb, cug.rc, cug.ra};
   private static final cty[] e = new cty[]{cug.qH, cug.qI, cug.qF, cug.qG};
   private static final cty[] f = new cty[]{
      cug.ou,
      cug.pr,
      cug.px,
      cug.pX,
      cug.pY,
      cug.qa,
      cug.qb,
      cug.qZ,
      cug.ra,
      cug.rb,
      cug.rc,
      cug.rd,
      cug.re,
      cug.rS,
      cug.rW,
      cug.sa,
      cug.sb,
      cug.sc,
      cug.sd,
      cug.se,
      cug.sm,
      cug.uf,
      cug.ug,
      cug.uh,
      cug.ui,
      cug.uk,
      cug.ut,
      cug.uA,
      cug.uB,
      cug.uC,
      cug.uN,
      cug.uO,
      cug.vg,
      cug.vk,
      cug.vm,
      cug.rX,
      cug.vX,
      cug.wu,
      cug.wC,
      cug.wv
   };
   public static final cty[] c = new cty[]{cug.oP, cug.oZ, cug.oU, cug.pe, cug.pj, cug.po};

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      jl.b<czm> $$2 = $$0.b(lr.aK);
      af $$3 = ae.a.a()
         .a(
            dfk.ij,
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
         .a(cug.pw, wu.c("advancements.husbandry.plant_seed.title"), wu.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dfk.cB))
         .a("pumpkin_stem", ct.a.a(dfk.fd))
         .a("melon_stem", ct.a.a(dfk.fe))
         .a("beetroots", ct.a.a(dfk.kD))
         .a("nether_wart", ct.a.a(dfk.fq))
         .a("torchflower", ct.a.a(dfk.kA))
         .a("pitcher_pod", ct.a.a(dfk.kB))
         .a($$1, "husbandry/plant_seed");
      af $$5 = ae.a.a()
         .a($$3)
         .a(
            cug.pw,
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
         .a(cug.ou, wu.c("advancements.husbandry.balanced_diet.title"), wu.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$4)
         .a(cug.pp, wu.c("advancements.husbandry.netherite_hoe.title"), wu.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cug.pp))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$6 = ae.a.a()
         .a($$3)
         .a(
            cug.uK,
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
            cug.qV,
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
            cug.qF,
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
         .a(lq.g.b(cug.qJ).a(), bz.a.a(cp.a.a().a(cug.qJ)))
         .a(
            cug.qJ,
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
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(bsn.f)))
         .a(
            cug.qI,
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
            cug.qZ,
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
         .a(cug.rz, wu.c("advancements.husbandry.whole_pack.title"), wu.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$10 = ae.a.a()
         .a($$3)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(avw.aG)).a(true), cp.a.a().a(cug.sl)))
         .a(
            cug.wC,
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
         .a(cug.wz, wu.c("advancements.husbandry.wax_on.title"), wu.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(ctt.a.get().keySet())), cp.a.a().a(cug.wz)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$11)
         .a(cug.oU, wu.c("advancements.husbandry.wax_off.title"), wu.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(ctt.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$12 = ae.a.a()
         .a($$3)
         .a(lq.g.b(cug.qK).a(), bz.a.a(cp.a.a().a(cug.qK)))
         .a(
            cug.qK,
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
            cug.uK,
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
         .a(cug.xq, wu.c("advancements.husbandry.froglights.title"), wu.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cug.xp, cug.xr, cug.xq))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$3)
         .a("silk_touch_nest", au.a.a(dfk.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp($$2.b(czr.v), de.d.b(1))))), de.d.a(3)))
         .a(
            dfk.pe,
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
            cug.nU,
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wu.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dx.a.a(bu.a.a().a(bu.a.a().a(bsn.k).b(bu.a.a().a(bsn.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$3)
         .a(
            cug.rg,
            wu.c("advancements.husbandry.make_a_sign_glow.title"),
            wu.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(avw.aB)), cp.a.a().a(cug.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$14 = ae.a.a()
         .a($$3)
         .a(
            cug.rS,
            wu.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wu.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", di.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(bsn.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$14)
         .a(
            cug.mf,
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wu.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dfk.aY)), cp.a.a().a(cug.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$15 = ae.a.a()
         .a($$3)
         .a(
            cug.kq,
            wu.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wu.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cug.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$16 = ae.a.a()
         .a($$15)
         .a(cug.vi, wu.c("advancements.husbandry.feed_snifflet.title"), wu.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dk.a.a(cp.a.a().a(awf.X), Optional.of(bu.a(bu.a.a().a(bsn.aR).a(bs.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$16)
         .a(
            cug.vj,
            wu.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wu.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dfk.kA))
         .a("pitcher_pod", ct.a.a(dfk.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$6)
         .a(
            cug.rV,
            wu.c("advancements.husbandry.remove_wolf_armor.title"),
            wu.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dk.a.a(cp.a.a().a(cug.rV), Optional.of(bu.a(bu.a.a().a(bsn.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$6)
         .a(
            cug.or,
            wu.c("advancements.husbandry.repair_wolf_armor.title"),
            wu.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dk.a.a(cp.a.a().a(cug.oq), Optional.of(bu.a(bu.a.a().a(bsn.bs).a(br.a.a().e(cp.a.a().a(cug.or).a(kl.a().a(kn.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsn<?>> $$2, Stream<bsn<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cug.uk,
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
      lq.aj.i().forEach($$1 -> $$0.a($$1.h().a().toString(), dk.a.a(cp.a.a().a(cug.uK), Optional.of(bu.a(bu.a.a().a(bsn.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cty $$1 : f) {
         $$0.a(lq.g.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsn<?>> $$1, Stream<bsn<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsn.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsn.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cty $$1 : e) {
         $$0.a(lq.g.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cty $$1 : d) {
         $$0.a(lq.g.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lq.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), eb.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jl.a $$1) {
      jl.b<cfw> $$2 = $$1.b(lr.m);
      $$2.c().sorted(Comparator.comparing(akj::a)).forEach($$2x -> {
         jj<cfw> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), eb.a.a(bu.a.a().a(bw.a(jn.a($$3)))));
      });
      return $$0;
   }
}
