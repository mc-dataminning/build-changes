import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mi implements me {
   public static final List<bsw<?>> a = List.of(
      bsw.ab,
      bsw.z,
      bsw.at,
      bsw.aJ,
      bsw.w,
      bsw.as,
      bsw.az,
      bsw.t,
      bsw.bs,
      bsw.au,
      bsw.aG,
      bsw.an,
      bsw.p,
      bsw.aw,
      bsw.Q,
      bsw.h,
      bsw.Z,
      bsw.aZ,
      bsw.X,
      bsw.f,
      bsw.o,
      bsw.c
   );
   public static final List<bsw<?>> b = List.of(bsw.bh, bsw.R, bsw.aR);
   private static final cuj[] d = new cuj[]{cur.qZ, cur.rb, cur.rc, cur.ra};
   private static final cuj[] e = new cuj[]{cur.qH, cur.qI, cur.qF, cur.qG};
   private static final cuj[] f = new cuj[]{
      cur.ou,
      cur.pr,
      cur.px,
      cur.pX,
      cur.pY,
      cur.qa,
      cur.qb,
      cur.qZ,
      cur.ra,
      cur.rb,
      cur.rc,
      cur.rd,
      cur.re,
      cur.rS,
      cur.rW,
      cur.sa,
      cur.sb,
      cur.sc,
      cur.sd,
      cur.se,
      cur.sm,
      cur.uf,
      cur.ug,
      cur.uh,
      cur.ui,
      cur.uk,
      cur.ut,
      cur.uA,
      cur.uB,
      cur.uC,
      cur.uN,
      cur.uO,
      cur.vg,
      cur.vk,
      cur.vm,
      cur.rX,
      cur.vX,
      cur.wu,
      cur.wC,
      cur.wv
   };
   public static final cuj[] c = new cuj[]{cur.oP, cur.oZ, cur.oU, cur.pe, cur.pj, cur.po};

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      jo.b<daa> $$2 = $$0.b(lu.aL);
      ag $$3 = af.a.a()
         .a(
            dfy.ij,
            wy.c("advancements.husbandry.root.title"),
            wy.c("advancements.husbandry.root.description"),
            akq.b("textures/gui/advancements/backgrounds/husbandry.png"),
            am.a,
            false,
            false,
            false
         )
         .a("consumed_item", bf.a.b())
         .a($$1, "husbandry/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cur.pw, wy.c("advancements.husbandry.plant_seed.title"), wy.c("advancements.husbandry.plant_seed.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("wheat", cw.a.a(dfy.cB))
         .a("pumpkin_stem", cw.a.a(dfy.fd))
         .a("melon_stem", cw.a.a(dfy.fe))
         .a("beetroots", cw.a.a(dfy.kD))
         .a("nether_wart", cw.a.a(dfy.fq))
         .a("torchflower", cw.a.a(dfy.kA))
         .a("pitcher_pod", cw.a.a(dfy.kB))
         .a($$1, "husbandry/plant_seed");
      ag $$5 = af.a.a()
         .a($$3)
         .a(
            cur.pw,
            wy.c("advancements.husbandry.breed_an_animal.title"),
            wy.c("advancements.husbandry.breed_an_animal.description"),
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
         .a(cur.ou, wy.c("advancements.husbandry.balanced_diet.title"), wy.c("advancements.husbandry.balanced_diet.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      af.a.a()
         .a($$4)
         .a(cur.pp, wy.c("advancements.husbandry.netherite_hoe.title"), wy.c("advancements.husbandry.netherite_hoe.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_hoe", cg.a.a(cur.pp))
         .a($$1, "husbandry/obtain_netherite_hoe");
      ag $$6 = af.a.a()
         .a($$3)
         .a(
            cur.uK,
            wy.c("advancements.husbandry.tame_an_animal.title"),
            wy.c("advancements.husbandry.tame_an_animal.description"),
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
            cur.qV,
            wy.c("advancements.husbandry.fishy_business.title"),
            wy.c("advancements.husbandry.fishy_business.description"),
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
            cur.qF,
            wy.c("advancements.husbandry.tactical_fishing.title"),
            wy.c("advancements.husbandry.tactical_fishing.description"),
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
         .a(lt.g.b(cur.qJ).a(), ca.a.a(cs.a.a().a(cur.qJ)))
         .a(
            cur.qJ,
            wy.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            wy.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$9)
         .a("kill_axolotl_target", bo.a.a(bv.a.a().a(bsw.f)))
         .a(
            cur.qI,
            wy.c("advancements.husbandry.kill_axolotl_target.title"),
            wy.c("advancements.husbandry.kill_axolotl_target.description"),
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
            cur.qZ,
            wy.c("advancements.husbandry.complete_catalogue.title"),
            wy.c("advancements.husbandry.complete_catalogue.description"),
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
         .a(cur.rz, wy.c("advancements.husbandry.whole_pack.title"), wy.c("advancements.husbandry.whole_pack.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a($$1, "husbandry/whole_pack");
      ag $$10 = af.a.a()
         .a($$3)
         .a("safely_harvest_honey", cw.a.a(df.a.a().a(aw.a.a().a(awd.aG)).a(true), cs.a.a().a(cur.sl)))
         .a(
            cur.wC,
            wy.c("advancements.husbandry.safely_harvest_honey.title"),
            wy.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      ag $$11 = af.a.a()
         .a($$10)
         .a(cur.wz, wy.c("advancements.husbandry.wax_on.title"), wy.c("advancements.husbandry.wax_on.description"), null, am.a, true, true, false)
         .a("wax_on", cw.a.a(df.a.a().a(aw.a.a().a(cue.a.get().keySet())), cs.a.a().a(cur.wz)))
         .a($$1, "husbandry/wax_on");
      af.a.a()
         .a($$11)
         .a(cur.oU, wy.c("advancements.husbandry.wax_off.title"), wy.c("advancements.husbandry.wax_off.description"), null, am.a, true, true, false)
         .a("wax_off", cw.a.a(df.a.a().a(aw.a.a().a(cue.b.get().keySet())), cs.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      ag $$12 = af.a.a()
         .a($$3)
         .a(lt.g.b(cur.qK).a(), ca.a.a(cs.a.a().a(cur.qK)))
         .a(
            cur.qK,
            wy.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            wy.c("advancements.husbandry.tadpole_in_a_bucket.description"),
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
            cur.uK,
            wy.c("advancements.husbandry.leash_all_frog_variants.title"),
            wy.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$13)
         .a(cur.xq, wy.c("advancements.husbandry.froglights.title"), wy.c("advancements.husbandry.froglights.description"), null, am.b, true, true, false)
         .a("froglights", cg.a.a(cur.xp, cur.xr, cur.xq))
         .a($$1, "husbandry/froglights");
      af.a.a()
         .a($$3)
         .a("silk_touch_nest", av.a.a(dfy.pe, cs.a.a().a(cu.b, cn.a(List.of(new bq($$2.b(daf.v), dh.d.b(1))))), dh.d.a(3)))
         .a(
            dfy.pe,
            wy.c("advancements.husbandry.silk_touch_nest.title"),
            wy.c("advancements.husbandry.silk_touch_nest.description"),
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
            cur.nU,
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            wy.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", ea.a.a(bv.a.a().a(bv.a.a().a(bsw.k).b(bv.a.a().a(bsw.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$3)
         .a(
            cur.rg,
            wy.c("advancements.husbandry.make_a_sign_glow.title"),
            wy.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", cw.a.a(df.a.a().a(aw.a.a().a(awd.aB)), cs.a.a().a(cur.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      ag $$14 = af.a.a()
         .a($$3)
         .a(
            cur.rS,
            wy.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            wy.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dl.a.a(Optional.empty(), Optional.empty(), Optional.of(bv.a(bv.a.a().a(bsw.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$14)
         .a(
            cur.mf,
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            wy.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", cw.a.b(df.a.a().a(aw.a.a().a(dfy.aY)), cs.a.a().a(cur.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      ag $$15 = af.a.a()
         .a($$3)
         .a(
            cur.kq,
            wy.c("advancements.husbandry.obtain_sniffer_egg.title"),
            wy.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cg.a.a(cur.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      ag $$16 = af.a.a()
         .a($$15)
         .a(cur.vi, wy.c("advancements.husbandry.feed_snifflet.title"), wy.c("advancements.husbandry.feed_snifflet.description"), null, am.a, true, true, true)
         .a("feed_snifflet", dn.a.a(cs.a.a().a(awm.X), Optional.of(bv.a(bv.a.a().a(bsw.aR).a(bt.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      af.a.a()
         .a($$16)
         .a(
            cur.vj,
            wy.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            wy.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a(aj.a.b)
         .a("torchflower", cw.a.a(dfy.kA))
         .a("pitcher_pod", cw.a.a(dfy.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      af.a.a()
         .a($$6)
         .a(
            cur.rV,
            wy.c("advancements.husbandry.remove_wolf_armor.title"),
            wy.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dn.a.a(cs.a.a().a(cur.rV), Optional.of(bv.a(bv.a.a().a(bsw.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      af.a.a()
         .a($$6)
         .a(
            cur.or,
            wy.c("advancements.husbandry.repair_wolf_armor.title"),
            wy.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dn.a.a(cs.a.a().a(cur.oq), Optional.of(bv.a(bv.a.a().a(bsw.bs).a(bs.a.a().e(cs.a.a().a(cur.or).a(ko.a().a(kq.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, Stream<bsw<?>> $$2, Stream<bsw<?>> $$3) {
      return a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cur.uk,
            wy.c("advancements.husbandry.breed_all_animals.title"),
            wy.c("advancements.husbandry.breed_all_animals.description"),
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
      lt.aj.i().forEach($$1 -> $$0.a($$1.h().a().toString(), dn.a.a(cs.a.a().a(cur.uK), Optional.of(bv.a(bv.a.a().a(bsw.R).a(bx.b($$1)))))));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      for (cuj $$1 : f) {
         $$0.a(lt.g.b($$1).a(), bf.a.a($$1));
      }

      return $$0;
   }

   private static af.a a(af.a $$0, Stream<bsw<?>> $$1, Stream<bsw<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsw.a($$1x).toString(), ax.a.a(bv.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsw.a($$1x).toString(), ax.a.a(Optional.of(bv.a.a().a($$1x).b()), Optional.of(bv.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      for (cuj $$1 : e) {
         $$0.a(lt.g.b($$1).a(), ca.a.a(cs.a.a().a($$1)));
      }

      return $$0;
   }

   private static af.a d(af.a $$0) {
      for (cuj $$1 : d) {
         $$0.a(lt.g.b($$1).a(), cc.a.a(Optional.empty(), Optional.empty(), Optional.of(cs.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static af.a e(af.a $$0) {
      lt.ai.i().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ee.a.a(bv.a.a().a(bx.a($$1)))));
      return $$0;
   }

   private static af.a a(af.a $$0, jo.a $$1) {
      jo.b<cgg> $$2 = $$1.b(lu.m);
      $$2.c().sorted(Comparator.comparing(akp::a)).forEach($$2x -> {
         jm<cgg> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ee.a.a(bv.a.a().a(bx.a(jq.a($$3)))));
      });
      return $$0;
   }
}
