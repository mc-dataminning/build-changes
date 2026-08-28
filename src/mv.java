import java.util.Optional;
import java.util.function.Consumer;

public class mv implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwm<?>> $$2 = $$0.e(mg.B);
      jf<cyu> $$3 = $$0.e(mg.K);
      jf<dma> $$4 = $$0.e(mg.i);
      ai $$5 = ah.a.a()
         .a(
            dmc.lo,
            wy.c("advancements.nether.root.title"),
            wy.c("advancements.nether.root.description"),
            alg.b("gui/advancements/backgrounds/nether"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(div.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(czc.vb, wy.c("advancements.nether.return_to_sender.title"), wy.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwm.ad), bm.a.a().a(ds.a(axd.j)).a(bx.a.a().a($$2, bwm.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(dmc.fJ, wy.c("advancements.nether.find_fortress.title"), wy.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dd.a.a(ct.a.b($$0.e(mg.bd).b(eqn.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(czc.vo, wy.c("advancements.nether.fast_travel.title"), wy.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(cv.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(czc.tk, wy.c("advancements.nether.uneasy_alliance.title"), wy.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwm.ad).a(ct.a.a(div.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(dmc.he, wy.c("advancements.nether.get_wither_skull.title"), wy.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(dmc.he))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(czc.vx, wy.c("advancements.nether.summon_wither.title"), wy.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", dr.a.a(bx.a.a().a($$2, bwm.bJ)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(czc.tj, wy.c("advancements.nether.obtain_blaze_rod.title"), wy.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(czc.tj))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dmc.gk, wy.c("advancements.nether.create_beacon.title"), wy.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(cv.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            dmc.gk,
            wy.c("advancements.nether.create_full_beacon.title"),
            wy.c("advancements.nether.create_full_beacon.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("beacon", bg.a.a(cv.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ai $$12 = ah.a.a()
         .a($$10)
         .a(czc.to, wy.c("advancements.nether.brew_potion.title"), wy.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(czc.rr, wy.c("advancements.nether.all_potions.title"), wy.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvj.a)
                  .a(bvj.b)
                  .a(bvj.e)
                  .a(bvj.h)
                  .a(bvj.j)
                  .a(bvj.l)
                  .a(bvj.m)
                  .a(bvj.n)
                  .a(bvj.p)
                  .a(bvj.r)
                  .a(bvj.s)
                  .a(bvj.B)
                  .a(bvj.k)
                  .a(bvj.L)
                  .a(bvj.M)
                  .a(bvj.J)
                  .a(bvj.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(czc.rl, wy.c("advancements.nether.all_effects.title"), wy.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvj.a)
                  .a(bvj.b)
                  .a(bvj.e)
                  .a(bvj.h)
                  .a(bvj.j)
                  .a(bvj.l)
                  .a(bvj.m)
                  .a(bvj.n)
                  .a(bvj.p)
                  .a(bvj.r)
                  .a(bvj.s)
                  .a(bvj.t)
                  .a(bvj.c)
                  .a(bvj.d)
                  .a(bvj.y)
                  .a(bvj.x)
                  .a(bvj.v)
                  .a(bvj.q)
                  .a(bvj.i)
                  .a(bvj.k)
                  .a(bvj.B)
                  .a(bvj.C)
                  .a(bvj.D)
                  .a(bvj.o)
                  .a(bvj.E)
                  .a(bvj.F)
                  .a(bvj.G)
                  .a(bvj.L)
                  .a(bvj.M)
                  .a(bvj.J)
                  .a(bvj.K)
                  .a(bvj.H)
                  .a(bvj.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            czc.aE,
            wy.c("advancements.nether.obtain_ancient_debris.title"),
            wy.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(czc.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(czc.qE, wy.c("advancements.nether.netherite_armor.title"), wy.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(czc.qD, czc.qE, czc.qF, czc.qG))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(czc.xL, wy.c("advancements.nether.use_lodestone.title"), wy.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmc.pV)), cl.a.a().a($$3, czc.rF)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            czc.xM,
            wy.c("advancements.nether.obtain_crying_obsidian.title"),
            wy.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(czc.xM))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            czc.xZ,
            wy.c("advancements.nether.charge_respawn_anchor.title"),
            wy.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmc.pQ).a(dq.a.a().a(dso.d, 4))), cl.a.a().a($$3, dmc.eq)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(czc.oy, wy.c("advancements.nether.ride_strider.title"), wy.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bwm.bt)))), Optional.of(cl.a.a().a($$3, czc.oy).b()), cv.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            czc.oy,
            wy.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wy.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(ct.a.a(div.i)).a(bx.a.a().a($$2, bwm.bt)), bo.a(cv.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mt.a(ah.a.a(), $$0, dkm.a.a.a().toList())
         .a($$16)
         .a(czc.qG, wy.c("advancements.nether.explore_nether.title"), wy.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(czc.xV, wy.c("advancements.nether.find_bastion.title"), wy.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dd.a.a(ct.a.b($$0.e(mg.bd).b(eqn.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(dmc.cE, wy.c("advancements.nether.loot_bastion.title"), wy.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", cu.a.a(eyv.L))
         .a("loot_bastion_treasure", cu.a.a(eyv.K))
         .a("loot_bastion_hoglin_stable", cu.a.a(eyv.N))
         .a("loot_bastion_bridge", cu.a.a(eyv.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         fcl.a(eyz.b.a, bx.a.a().a(bu.a.a().a(cl.a.a().a($$3, axk.V)))).invert().build(),
         fcl.a(eyz.b.a, bx.a.a().a(bu.a.a().b(cl.a.a().a($$3, axk.V)))).invert().build(),
         fcl.a(eyz.b.a, bx.a.a().a(bu.a.a().c(cl.a.a().a($$3, axk.V)))).invert().build(),
         fcl.a(eyz.b.a, bx.a.a().a(bu.a.a().d(cl.a.a().a($$3, axk.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(czc.pu, wy.c("advancements.nether.distract_piglin.title"), wy.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cz.a.a($$18, Optional.of(cl.a.a().a($$3, axk.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bwm.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", db.a.a(Optional.of($$18), cl.a.a().a($$3, cpo.c), Optional.of(bx.a(bx.a.a().a($$2, bwm.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
