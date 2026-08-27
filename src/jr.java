import java.util.Optional;
import java.util.function.Consumer;

public class jr implements jm {
   private static final bc a = bc.a(
      efm.a(eck.b.a, bq.a.a().a(bn.a.a().a(cb.a.a().a(cjo.pa)))).invert().build(),
      efm.a(eck.b.a, bq.a.a().a(bn.a.a().b(cb.a.a().a(cjo.pb)))).invert().build(),
      efm.a(eck.b.a, bq.a.a().a(bn.a.a().c(cb.a.a().a(cjo.pc)))).invert().build(),
      efm.a(eck.b.a, bq.a.a().a(bn.a.a().d(cb.a.a().a(cjo.pd)))).invert().build()
   );

   @Override
   public void a(hg.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cte.kL,
            tl.c("advancements.nether.root.title"),
            tl.c("advancements.nether.root.description"),
            new aez("textures/gui/advancements/backgrounds/nether.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cqb.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjo.tf, tl.c("advancements.nether.return_to_sender.title"), tl.c("advancements.nether.return_to_sender.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bja.Q), bf.a.a().a(dc.a(apx.j)).a(bq.a.a().a(bja.ag))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cte.fn, tl.c("advancements.nether.find_fortress.title"), tl.c("advancements.nether.find_fortress.description"), null, ar.a, true, true, false)
         .a("fortress", cs.a.a(cj.a.c(duw.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cjo.tp, tl.c("advancements.nether.fast_travel.title"), tl.c("advancements.nether.fast_travel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bi.a.a(bh.a(cl.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cjo.rs, tl.c("advancements.nether.uneasy_alliance.title"), tl.c("advancements.nether.uneasy_alliance.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bja.Q).a(cj.a.b(cqb.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cte.gG, tl.c("advancements.nether.get_wither_skull.title"), tl.c("advancements.nether.get_wither_skull.description"), null, ar.a, true, true, false)
         .a("wither_skull", bz.a.a(cte.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjo.ty, tl.c("advancements.nether.summon_wither.title"), tl.c("advancements.nether.summon_wither.description"), null, ar.a, true, true, false)
         .a("summoned", db.a.a(bq.a.a().a(bja.bk)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cjo.rr, tl.c("advancements.nether.obtain_blaze_rod.title"), tl.c("advancements.nether.obtain_blaze_rod.description"), null, ar.a, true, true, false)
         .a("blaze_rod", bz.a.a(cjo.rr))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cte.fO, tl.c("advancements.nether.create_beacon.title"), tl.c("advancements.nether.create_beacon.description"), null, ar.a, true, true, false)
         .a("beacon", ba.a.a(cl.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cte.fO,
            tl.c("advancements.nether.create_full_beacon.title"),
            tl.c("advancements.nether.create_full_beacon.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(cl.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cjo.rv, tl.c("advancements.nether.brew_potion.title"), tl.c("advancements.nether.brew_potion.description"), null, ar.a, true, true, false)
         .a("potion", ax.a.c())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjo.pQ, tl.c("advancements.nether.all_potions.title"), tl.c("advancements.nether.all_potions.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bj.a.a(cm.a.a().a(bil.a).a(bil.b).a(bil.e).a(bil.h).a(bil.j).a(bil.l).a(bil.m).a(bil.n).a(bil.p).a(bil.r).a(bil.s).a(bil.B).a(bil.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cjo.pK, tl.c("advancements.nether.all_effects.title"), tl.c("advancements.nether.all_effects.description"), null, ar.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bj.a.a(
               cm.a.a()
                  .a(bil.a)
                  .a(bil.b)
                  .a(bil.e)
                  .a(bil.h)
                  .a(bil.j)
                  .a(bil.l)
                  .a(bil.m)
                  .a(bil.n)
                  .a(bil.p)
                  .a(bil.r)
                  .a(bil.s)
                  .a(bil.t)
                  .a(bil.c)
                  .a(bil.d)
                  .a(bil.y)
                  .a(bil.x)
                  .a(bil.v)
                  .a(bil.q)
                  .a(bil.i)
                  .a(bil.k)
                  .a(bil.B)
                  .a(bil.C)
                  .a(bil.D)
                  .a(bil.o)
                  .a(bil.E)
                  .a(bil.F)
                  .a(bil.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cjo.ap,
            tl.c("advancements.nether.obtain_ancient_debris.title"),
            tl.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bz.a.a(cjo.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cjo.pf, tl.c("advancements.nether.netherite_armor.title"), tl.c("advancements.nether.netherite_armor.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", bz.a.a(cjo.pe, cjo.pf, cjo.pg, cjo.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cjo.vF, tl.c("advancements.nether.use_lodestone.title"), tl.c("advancements.nether.use_lodestone.description"), null, ar.a, true, true, false)
         .a("use_lodestone", cc.a.a(cj.a.a().a(av.a.a().a(cte.pq)), cb.a.a().a(cjo.qe)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cjo.vG,
            tl.c("advancements.nether.obtain_crying_obsidian.title"),
            tl.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bz.a.a(cjo.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cjo.vT,
            tl.c("advancements.nether.charge_respawn_anchor.title"),
            tl.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cc.a.a(cj.a.a().a(av.a.a().a(cte.pl).a(da.a.a().a(czi.d, 4))), cb.a.a().a(cte.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cjo.ng, tl.c("advancements.nether.ride_strider.title"), tl.c("advancements.nether.ride_strider.description"), null, ar.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ca.a.a(Optional.of(bq.a(bq.a.a().a(bq.a.a().a(bja.aV)))), Optional.of(cb.a.a().a(cjo.ng).b()), cl.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cjo.ng,
            tl.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            tl.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bi.a.a(bq.a.a().a(cj.a.b(cqb.h)).a(bq.a.a().a(bja.aV)), bh.a(cl.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jp.a(ae.a.a(), crn.a.a.a().toList())
         .a($$13)
         .a(cjo.ph, tl.c("advancements.nether.explore_nether.title"), tl.c("advancements.nether.explore_nether.description"), null, ar.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cjo.vP, tl.c("advancements.nether.find_bastion.title"), tl.c("advancements.nether.find_bastion.description"), null, ar.a, true, true, false)
         .a("bastion", cs.a.a(cj.a.c(duw.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cte.cv, tl.c("advancements.nether.loot_bastion.title"), tl.c("advancements.nether.loot_bastion.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", ck.a.a(new aez("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ck.a.a(new aez("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ck.a.a(new aez("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ck.a.a(new aez("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cjo.nU, tl.c("advancements.nether.distract_piglin.title"), tl.c("advancements.nether.distract_piglin.description"), null, ar.a, true, true, false)
         .a("distract_piglin", co.a.a(a, Optional.of(cb.a.a().a(aqd.U).b()), Optional.of(bq.a(bq.a.a().a(bja.aw).a(bo.a.a().e(false))))))
         .a("distract_piglin_directly", cq.a.a(Optional.of(a), cb.a.a().a(car.c), Optional.of(bq.a(bq.a.a().a(bja.aw).a(bo.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
