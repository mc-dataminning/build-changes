import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mi implements me {
   public static final List<bsx<?>> a = List.of(
      bsx.ab,
      bsx.z,
      bsx.at,
      bsx.aJ,
      bsx.w,
      bsx.as,
      bsx.az,
      bsx.t,
      bsx.bs,
      bsx.au,
      bsx.aG,
      bsx.an,
      bsx.p,
      bsx.aw,
      bsx.Q,
      bsx.h,
      bsx.Z,
      bsx.aZ,
      bsx.X,
      bsx.f,
      bsx.o,
      bsx.c
   );
   public static final List<bsx<?>> b = List.of(bsx.bh, bsx.R, bsx.aR);
   private static final cul[] d = new cul[]{cut.qZ, cut.rb, cut.rc, cut.ra};
   private static final cul[] e = new cul[]{cut.qH, cut.qI, cut.qF, cut.qG};
   private static final cul[] f = new cul[]{
      cut.ou,
      cut.pr,
      cut.px,
      cut.pX,
      cut.pY,
      cut.qa,
      cut.qb,
      cut.qZ,
      cut.ra,
      cut.rb,
      cut.rc,
      cut.rd,
      cut.re,
      cut.rS,
      cut.rW,
      cut.sa,
      cut.sb,
      cut.sc,
      cut.sd,
      cut.se,
      cut.sm,
      cut.uf,
      cut.ug,
      cut.uh,
      cut.ui,
      cut.uk,
      cut.ut,
      cut.uA,
      cut.uB,
      cut.uC,
      cut.uN,
      cut.uO,
      cut.vg,
      cut.vk,
      cut.vm,
      cut.rX,
      cut.vX,
      cut.wu,
      cut.wC,
      cut.wv
   };
   public static final cul[] c = new cul[]{cut.oP, cut.oZ, cut.oU, cut.pe, cut.pj, cut.po};

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      jo.b<dac> $$2 = $$0.b(lu.aL);
      ag $$3 = af.a.a()
         .a(
            dga.ij,
            wz.c("advancements.husbandry.root.title"),
            wz.c("advancements.husbandry.root.description"),
            akr.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cut.pw, wz.c("advancements.husbandry.plant_seed.title"), wz.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cw.a.a(dga.cB))
         .a("pumpkin_stem", cw.a.a(dga.fd))
         .a("melon_stem", cw.a.a(dga.fe))
         .a("beetroots", cw.a.a(dga.kD))
         .a("nether_wart", cw.a.a(dga.fq))
         .a("torchflower", cw.a.a(dga.kA))
         .a("pitcher_pod", cw.a.a(dga.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$5 = af.a.a()
         .a($$3)
         .a(
            cut.pw,
            wz.c("advancements.husbandry.breed_an_animal.title"),
            wz.c("advancements.husbandry.breed_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("bred", ax.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$5, $$1, a.stream(), b.stream());
      b(af.a.a())
         .a($$4)
         .a(cut.ou, wz.c("advancements.husbandry.balanced_diet.title"), wz.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$4)
         .a(cut.pp, wz.c("advancements.husbandry.netherite_hoe.title"), wz.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cg.a.a(cut.pp))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$6 = af.a.a()
         .a($$3)
         .a(
            cut.uK,
            wz.c("advancements.husbandry.tame_an_animal.title"),
            wz.c("advancements.husbandry.tame_an_animal.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("tamed_animal", ee.a.b())
         .a($$1, "husbandry/tame_an_animal");
      ag $$7 = d(af.a.a())
         .a($$3)
         .a(aj.a.b)
         .a(
            cut.qV,
            wz.c("advancements.husbandry.fishy_business.title"),
            wz.c("advancements.husbandry.fishy_business.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      ag $$8 = c(af.a.a())
         .a($$7)
         .a(aj.a.b)
         .a(
            cut.qF,
            wz.c("advancements.husbandry.tactical_fishing.title"),
            wz.c("advancements.husbandry.tactical_fishing.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      ag $$9 = af.a.a()
         .a($$8)
         .a(aj.a.b)
         .a(lt.g.b(cut.qJ).a(), ca.a.a(cs.a.a().a(cut.qJ)))
         .a(
            cut.qJ,
            wz.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wz.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$9)
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a(bsx.f)))
         .a(
            cut.qI,
            wz.c("advancements.husbandry.kill_axolotl_target.title"),
            wz.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      e(af.a.a())
         .a($$6)
         .a(
            cut.qZ,
            wz.c("advancements.husbandry.complete_catalogue.title"),
            wz.c("advancements.husbandry.complete_catalogue.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      a(af.a.a(), $$0)
         .a($$6)
         .a(cut.rz, wz.c("advancements.husbandry.whole_pack.title"), wz.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$10 = af.a.a()
         .a($$3)
         .a("safely_harvest_honey", cw.a.a(df.a.a().a(aw.a.a().a(awe.aG)).a(true), cs.a.a().a(cut.sl)))
         .a(
            cut.wC,
            wz.c("advancements.husbandry.safely_harvest_honey.title"),
            wz.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$11 = af.a.a()
         .a($$10)
         .a(cut.wz, wz.c("advancements.husbandry.wax_on.title"), wz.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cw.a.a(df.a.a().a(aw.a.a().a(cug.a.get().keySet())), cs.a.a().a(cut.wz)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$11)
         .a(cut.oU, wz.c("advancements.husbandry.wax_off.title"), wz.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cw.a.a(df.a.a().a(aw.a.a().a(cug.b.get().keySet())), cs.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      ag $$12 = af.a.a()
         .a($$3)
         .a(lt.g.b(cut.qK).a(), ca.a.a(cs.a.a().a(cut.qK)))
         .a(
            cut.qK,
            wz.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wz.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      ag $$13 = a(af.a.a())
         .a($$12)
         .a(
            cut.uK,
            wz.c("advancements.husbandry.leash_all_frog_variants.title"),
            wz.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$13)
         .a(cut.xq, wz.c("advancements.husbandry.froglights.title"), wz.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cg.a.a(cut.xp, cut.xr, cut.xq))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$3)
         .a("silk_touch_nest", av.a.a(dga.pe, cs.a.a().a(cu.b, cn.a(List.of(new bq($$2.b(dah.v), dh.d.b(1))))), dh.d.a(3)))
         .a(
            dga.pe,
            wz.c("advancements.husbandry.silk_touch_nest.title"),
            wz.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      af.a.a()
         .a($$3)
         .a(
            cut.nU,
            wz.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wz.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ea.a.a(bv.a.a().a(bv.a.a().a(bsx.k).b(bv.a.a().a(bsx.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$3)
         .a(
            cut.rg,
            wz.c("advancements.husbandry.make_a_sign_glow.title"),
            wz.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cw.a.a(df.a.a().a(aw.a.a().a(awe.aB)), cs.a.a().a(cut.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$14 = af.a.a()
         .a($$3)
         .a(
            cut.rS,
            wz.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wz.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dl.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a(bsx.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$14)
         .a(
            cut.mf,
            wz.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wz.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cw.a.b(df.a.a().a(aw.a.a().a(dga.aY)), cs.a.a().a(cut.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$15 = af.a.a()
         .a($$3)
         .a(
            cut.kq,
            wz.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wz.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cg.a.a(cut.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$16 = af.a.a()
         .a($$15)
         .a(cut.vi, wz.c("advancements.husbandry.feed_snifflet.title"), wz.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dn.a.a(cs.a.a().a(awn.X), Optional.of(bv.a(bv.a.a().a(bsx.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$16)
         .a(
            cut.vj,
            wz.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wz.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cw.a.a(dga.kA))
         .a("pitcher_pod", cw.a.a(dga.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$6)
         .a(
            cut.rV,
            wz.c("advancements.husbandry.remove_wolf_armor.title"),
            wz.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dn.a.a(cs.a.a().a(cut.rV), Optional.of(bv.a(bv.a.a().a(bsx.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$6)
         .a(
            cut.or,
            wz.c("advancements.husbandry.repair_wolf_armor.title"),
            wz.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dn.a.a(cs.a.a().a(cut.oq), Optional.of(bv.a(bv.a.a().a(bsx.bs).a(bs.a.a().e(cs.a.a().a(cut.or).a(ko.a().a(kq.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, Stream<bsx<?>> $$2, Stream<bsx<?>> $$3) {
      return a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cut.uk,
            wz.c("advancements.husbandry.breed_all_animals.title"),
            wz.c("advancements.husbandry.breed_all_animals.description"),
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
      lt.aj.i().forEach($$1 -> $$0.a($$1.h().a().toString(), dn.a.a(cs.a.a().a(cut.uK), Optional.of(bv.a(bv.a.a().a(bsx.R).a(bx.b($$1)))))));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      for (cul $$1 : f) {
         $$0.a(lt.g.b($$1).a(), bf.a.a($$1));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<bsx<?>> $$1, Stream<bsx<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsx.a($$1x).toString(), ax.a.a(bv.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsx.a($$1x).toString(), ax.a.a(Optional.of(bv.a.a().a($$1x).b()), Optional.of(bv.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      for (cul $$1 : e) {
         $$0.a(lt.g.b($$1).a(), ca.a.a(cs.a.a().a($$1)));
      }

      return $$0;
   }

   private static af.a d(af.a $$0) {
      for (cul $$1 : d) {
         $$0.a(lt.g.b($$1).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(cs.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static af.a e(af.a $$0) {
      lt.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ee.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jo.a $$1) {
      jo.b<cgi> $$2 = $$1.b(lu.m);
      $$2.c().sorted(Comparator.comparing(akq::a)).forEach($$2x -> {
         jm<cgi> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ee.a.a(bv.a.a().a(bx.a(jq.a($$3)))));
      });
      return $$0;
   }
}
