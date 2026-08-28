import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mg implements ma {
   public static final List<bsz<?>> a = List.of(
      bsz.ab,
      bsz.z,
      bsz.at,
      bsz.aJ,
      bsz.w,
      bsz.as,
      bsz.az,
      bsz.t,
      bsz.bs,
      bsz.au,
      bsz.aG,
      bsz.an,
      bsz.p,
      bsz.aw,
      bsz.Q,
      bsz.h,
      bsz.Z,
      bsz.aZ,
      bsz.X,
      bsz.f,
      bsz.o,
      bsz.c
   );
   public static final List<bsz<?>> b = List.of(bsz.bh, bsz.R, bsz.aR);
   private static final cuj[] d = new cuj[]{cur.qZ, cur.rb, cur.rc, cur.ra};
   private static final cuj[] e = new cuj[]{cur.qH, cur.qI, cur.qF, cur.qG};
   private static final cuj[] f = new cuj[]{
      cur.ot,
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
      cur.vU,
      cur.wr,
      cur.wz,
      cur.ws
   };
   public static final cuj[] c = new cuj[]{cur.oO, cur.oY, cur.oT, cur.pd, cur.pi, cur.pn};

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfa.ij,
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
         .a(cur.pw, xo.c("advancements.husbandry.plant_seed.title"), xo.c("advancements.husbandry.plant_seed.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("wheat", ct.a.a(dfa.cB))
         .a("pumpkin_stem", ct.a.a(dfa.fd))
         .a("melon_stem", ct.a.a(dfa.fe))
         .a("beetroots", ct.a.a(dfa.kD))
         .a("nether_wart", ct.a.a(dfa.fq))
         .a("torchflower", ct.a.a(dfa.kA))
         .a("pitcher_pod", ct.a.a(dfa.kB))
         .a($$1, "husbandry/plant_seed");
      af $$4 = ae.a.a()
         .a($$2)
         .a(
            cur.pw,
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
         .a(cur.ot, xo.c("advancements.husbandry.balanced_diet.title"), xo.c("advancements.husbandry.balanced_diet.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ae.a.a()
         .a($$3)
         .a(cur.po, xo.c("advancements.husbandry.netherite_hoe.title"), xo.c("advancements.husbandry.netherite_hoe.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_hoe", ce.a.a(cur.po))
         .a($$1, "husbandry/obtain_netherite_hoe");
      af $$5 = ae.a.a()
         .a($$2)
         .a(
            cur.uK,
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
            cur.qV,
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
            cur.qF,
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
         .a(lp.h.b(cur.qJ).a(), bz.a.a(cp.a.a().a(cur.qJ)))
         .a(
            cur.qJ,
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
         .a("kill_axolotl_target", bn.a.a(bu.a.a().a(bsz.f)))
         .a(
            cur.qI,
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
            cur.qZ,
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
         .a(cur.rz, xo.c("advancements.husbandry.whole_pack.title"), xo.c("advancements.husbandry.whole_pack.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a($$1, "husbandry/whole_pack");
      af $$9 = ae.a.a()
         .a($$2)
         .a("safely_harvest_honey", ct.a.a(dc.a.a().a(av.a.a().a(awo.aG)).a(true), cp.a.a().a(cur.sl)))
         .a(
            cur.wz,
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
         .a(cur.ww, xo.c("advancements.husbandry.wax_on.title"), xo.c("advancements.husbandry.wax_on.description"), null, al.a, true, true, false)
         .a("wax_on", ct.a.a(dc.a.a().a(av.a.a().a(cue.a.get().keySet())), cp.a.a().a(cur.ww)))
         .a($$1, "husbandry/wax_on");
      ae.a.a()
         .a($$10)
         .a(cur.oT, xo.c("advancements.husbandry.wax_off.title"), xo.c("advancements.husbandry.wax_off.description"), null, al.a, true, true, false)
         .a("wax_off", ct.a.a(dc.a.a().a(av.a.a().a(cue.b.get().keySet())), cp.a.a().a(c)))
         .a($$1, "husbandry/wax_off");
      af $$11 = ae.a.a()
         .a($$2)
         .a(lp.h.b(cur.qK).a(), bz.a.a(cp.a.a().a(cur.qK)))
         .a(
            cur.qK,
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
            cur.uK,
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
         .a(cur.xn, xo.c("advancements.husbandry.froglights.title"), xo.c("advancements.husbandry.froglights.description"), null, al.b, true, true, false)
         .a("froglights", ce.a.a(cur.xm, cur.xo, cur.xn))
         .a($$1, "husbandry/froglights");
      ae.a.a()
         .a($$2)
         .a("silk_touch_nest", au.a.a(dfa.pe, cp.a.a().a(cr.b, cl.a(List.of(new bp(dac.v, de.d.b(1))))), de.d.a(3)))
         .a(
            dfa.pe,
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
            cur.nU,
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dw.a.a(bu.a.a().a(bu.a.a().a(bsz.k).b(bu.a.a().a(bsz.X)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ae.a.a()
         .a($$2)
         .a(
            cur.rg,
            xo.c("advancements.husbandry.make_a_sign_glow.title"),
            xo.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", ct.a.a(dc.a.a().a(av.a.a().a(awo.aB)), cp.a.a().a(cur.rg)))
         .a($$1, "husbandry/make_a_sign_glow");
      af $$13 = ae.a.a()
         .a($$2)
         .a(
            cur.rS,
            xo.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xo.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", dh.a.a(Optional.empty(), Optional.empty(), Optional.of(bu.a(bu.a.a().a(bsz.a)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ae.a.a()
         .a($$13)
         .a(
            cur.mf,
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", ct.a.b(dc.a.a().a(av.a.a().a(dfa.aY)), cp.a.a().a(cur.rB)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      af $$14 = ae.a.a()
         .a($$2)
         .a(
            cur.kq,
            xo.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xo.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", ce.a.a(cur.kq))
         .a($$1, "husbandry/obtain_sniffer_egg");
      af $$15 = ae.a.a()
         .a($$14)
         .a(cur.vi, xo.c("advancements.husbandry.feed_snifflet.title"), xo.c("advancements.husbandry.feed_snifflet.description"), null, al.a, true, true, true)
         .a("feed_snifflet", dj.a.a(cp.a.a().a(awx.X), Optional.of(bu.a(bu.a.a().a(bsz.aR).a(bs.a.a().e(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ae.a.a()
         .a($$15)
         .a(
            cur.vj,
            xo.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xo.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a(ai.a.b)
         .a("torchflower", ct.a.a(dfa.kA))
         .a("pitcher_pod", ct.a.a(dfa.kB))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ae.a.a()
         .a($$5)
         .a(
            cur.rV,
            xo.c("advancements.husbandry.remove_wolf_armor.title"),
            xo.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dj.a.a(cp.a.a().a(cur.rV), Optional.of(bu.a(bu.a.a().a(bsz.bs)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ae.a.a()
         .a($$5)
         .a(
            cur.or,
            xo.c("advancements.husbandry.repair_wolf_armor.title"),
            xo.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("repair_wolf_armor", dj.a.a(cp.a.a().a(cur.oq), Optional.of(bu.a(bu.a.a().a(bsz.bs).a(br.a.a().e(cp.a.a().a(cur.or).a(kk.a().a(km.e, 0).a())))))))
         .a($$1, "husbandry/repair_wolf_armor");
   }

   public static af a(af $$0, Consumer<af> $$1, Stream<bsz<?>> $$2, Stream<bsz<?>> $$3) {
      return a(ae.a.a(), $$2, $$3)
         .a($$0)
         .a(
            cur.uk,
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
      lp.al.h().forEach($$1 -> $$0.a($$1.h().a().toString(), dj.a.a(cp.a.a().a(cur.uK), Optional.of(bu.a(bu.a.a().a(bsz.R).a(bw.b($$1)))))));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      for (cuj $$1 : f) {
         $$0.a(lp.h.b($$1).a(), be.a.a($$1));
      }

      return $$0;
   }

   private static ae.a a(ae.a $$0, Stream<bsz<?>> $$1, Stream<bsz<?>> $$2) {
      $$1.forEach($$1x -> $$0.a(bsz.a($$1x).toString(), aw.a.a(bu.a.a().a($$1x))));
      $$2.forEach($$1x -> $$0.a(bsz.a($$1x).toString(), aw.a.a(Optional.of(bu.a.a().a($$1x).b()), Optional.of(bu.a.a().a($$1x).b()), Optional.empty())));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      for (cuj $$1 : e) {
         $$0.a(lp.h.b($$1).a(), bz.a.a(cp.a.a().a($$1)));
      }

      return $$0;
   }

   private static ae.a d(ae.a $$0) {
      for (cuj $$1 : d) {
         $$0.a(lp.h.b($$1).a(), cb.a.a(Optional.empty(), Optional.empty(), Optional.of(cp.a.a().a($$1).b())));
      }

      return $$0;
   }

   private static ae.a e(ae.a $$0) {
      lp.ak.h().sorted(Comparator.comparing($$0x -> $$0x.h().a())).forEach($$1 -> $$0.a($$1.h().a().toString(), ea.a.a(bu.a.a().a(bw.a($$1)))));
      return $$0;
   }

   private static ae.a a(ae.a $$0, jk.a $$1) {
      jk.b<cgi> $$2 = $$1.b(lq.m);
      $$2.c().sorted(Comparator.comparing(ald::a)).forEach($$2x -> {
         ji<cgi> $$3 = $$2.b($$2x);
         $$0.a($$2x.a().toString(), ea.a.a(bu.a.a().a(bw.a(jm.a($$3)))));
      });
      return $$0;
   }
}
