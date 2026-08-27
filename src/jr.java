import java.util.Optional;
import java.util.function.Consumer;

public class jr implements jm {
   private static final ba a = ba.a(
      efj.a(ech.b.a, bo.a.a().a(bl.a.a().a(bz.a.a().a(cjb.pa)))).invert().build(),
      efj.a(ech.b.a, bo.a.a().a(bl.a.a().b(bz.a.a().a(cjb.pb)))).invert().build(),
      efj.a(ech.b.a, bo.a.a().a(bl.a.a().c(bz.a.a().a(cjb.pc)))).invert().build(),
      efj.a(ech.b.a, bo.a.a().a(bl.a.a().d(bz.a.a().a(cjb.pd)))).invert().build()
   );

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csn.kL,
            tf.c("advancements.nether.root.title"),
            tf.c("advancements.nether.root.description"),
            new aer("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", aw.a.a(cpm.i))
         .a($$1, "nether/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cjb.tf, tf.c("advancements.nether.return_to_sender.title"), tf.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bim.Q), bd.a.a().a(da.a(apn.j)).a(bo.a.a().a(bim.ag))))
         .a($$1, "nether/return_to_sender");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(csn.fn, tf.c("advancements.nether.find_fortress.title"), tf.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", cq.a.a(ch.a.c(dut.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cjb.tp, tf.c("advancements.nether.fast_travel.title"), tf.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("travelled", bg.a.a(bf.a(cj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cjb.rs, tf.c("advancements.nether.uneasy_alliance.title"), tf.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bim.Q).a(ch.a.b(cpm.h))))
         .a($$1, "nether/uneasy_alliance");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(csn.gG, tf.c("advancements.nether.get_wither_skull.title"), tf.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", bx.a.a(csn.gG))
         .a($$1, "nether/get_wither_skull");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cjb.ty, tf.c("advancements.nether.summon_wither.title"), tf.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", cz.a.a(bo.a.a().a(bim.bk)))
         .a($$1, "nether/summon_wither");
      ae $$7 = ae.a.a()
         .a($$4)
         .a(cjb.rr, tf.c("advancements.nether.obtain_blaze_rod.title"), tf.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", bx.a.a(cjb.rr))
         .a($$1, "nether/obtain_blaze_rod");
      ae $$8 = ae.a.a()
         .a($$6)
         .a(csn.fO, tf.c("advancements.nether.create_beacon.title"), tf.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", ay.a.a(cj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            csn.fO,
            tf.c("advancements.nether.create_full_beacon.title"),
            tf.c("advancements.nether.create_full_beacon.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("beacon", ay.a.a(cj.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ae $$9 = ae.a.a()
         .a($$7)
         .a(cjb.rv, tf.c("advancements.nether.brew_potion.title"), tf.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", av.a.d())
         .a($$1, "nether/brew_potion");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(cjb.pQ, tf.c("advancements.nether.all_potions.title"), tf.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a(
            "all_effects",
            bh.a.a(ck.a.a().a(bhx.a).a(bhx.b).a(bhx.e).a(bhx.h).a(bhx.j).a(bhx.l).a(bhx.m).a(bhx.n).a(bhx.p).a(bhx.r).a(bhx.s).a(bhx.B).a(bhx.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cjb.pK, tf.c("advancements.nether.all_effects.title"), tf.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(ah.a.a(1000))
         .a(
            "all_effects",
            bh.a.a(
               ck.a.a()
                  .a(bhx.a)
                  .a(bhx.b)
                  .a(bhx.e)
                  .a(bhx.h)
                  .a(bhx.j)
                  .a(bhx.l)
                  .a(bhx.m)
                  .a(bhx.n)
                  .a(bhx.p)
                  .a(bhx.r)
                  .a(bhx.s)
                  .a(bhx.t)
                  .a(bhx.c)
                  .a(bhx.d)
                  .a(bhx.y)
                  .a(bhx.x)
                  .a(bhx.v)
                  .a(bhx.q)
                  .a(bhx.i)
                  .a(bhx.k)
                  .a(bhx.B)
                  .a(bhx.C)
                  .a(bhx.D)
                  .a(bhx.o)
                  .a(bhx.E)
                  .a(bhx.F)
                  .a(bhx.G)
            )
         )
         .a($$1, "nether/all_effects");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(
            cjb.ap,
            tf.c("advancements.nether.obtain_ancient_debris.title"),
            tf.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bx.a.a(cjb.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cjb.pf, tf.c("advancements.nether.netherite_armor.title"), tf.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_armor", bx.a.a(cjb.pe, cjb.pf, cjb.pg, cjb.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cjb.vF, tf.c("advancements.nether.use_lodestone.title"), tf.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", ca.a.a(ch.a.a().a(at.a.a().a(csn.pq)), bz.a.a().a(cjb.qe)))
         .a($$1, "nether/use_lodestone");
      ae $$12 = ae.a.a()
         .a($$2)
         .a(
            cjb.vG,
            tf.c("advancements.nether.obtain_crying_obsidian.title"),
            tf.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bx.a.a(cjb.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cjb.vT,
            tf.c("advancements.nether.charge_respawn_anchor.title"),
            tf.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ca.a.a(ch.a.a().a(at.a.a().a(csn.pl).a(cy.a.a().a(cyt.c, 4))), bz.a.a().a(csn.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(cjb.ng, tf.c("advancements.nether.ride_strider.title"), tf.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", by.a.a(bo.a(bo.a.a().a(bo.a.a().a(bim.aV))), bz.a.a().a(cjb.ng).b(), cj.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cjb.ng,
            tf.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            tf.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bg.a.a(bo.a.a().a(ch.a.b(cpm.h)).a(bo.a.a().a(bim.aV)), bf.a(cj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jp.a(ae.a.a(), cqy.a.a.a().toList())
         .a($$13)
         .a(cjb.ph, tf.c("advancements.nether.explore_nether.title"), tf.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(ah.a.a(500))
         .a($$1, "nether/explore_nether");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(cjb.vP, tf.c("advancements.nether.find_bastion.title"), tf.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", cq.a.a(ch.a.c(dut.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(csn.cv, tf.c("advancements.nether.loot_bastion.title"), tf.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("loot_bastion_other", ci.a.a(new aer("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ci.a.a(new aer("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ci.a.a(new aer("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ci.a.a(new aer("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ap.b)
         .a(cjb.nU, tf.c("advancements.nether.distract_piglin.title"), tf.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cm.a.a(a, bz.a.a().a(apt.U).b(), bo.a(bo.a.a().a(bim.aw).a(bm.a.a().e(false)))))
         .a("distract_piglin_directly", co.a.a(Optional.of(a), bz.a.a().a(cae.c), bo.a(bo.a.a().a(bim.aw).a(bm.a.a().e(false)))))
         .a($$1, "nether/distract_piglin");
   }
}
