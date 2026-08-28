import java.util.Optional;
import java.util.function.Consumer;

public class mr implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<bvi<?>> $$2 = $$0.d(mc.z);
      js<cxd> $$3 = $$0.d(mc.K);
      js<dke> $$4 = $$0.d(mc.f);
      ai $$5 = ah.a.a()
         .a(
            dkg.ln,
            wp.c("advancements.nether.root.title"),
            wp.c("advancements.nether.root.description"),
            aku.b("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dgz.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cxl.uX, wp.c("advancements.nether.return_to_sender.title"), wp.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bvi.ad), bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bvi.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(dkg.fI, wp.c("advancements.nether.find_fortress.title"), wp.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dt.a.a(di.a.b($$0.d(mc.aW).b(eod.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(cxl.vk, wp.c("advancements.nether.fast_travel.title"), wp.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(dk.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(cxl.tg, wp.c("advancements.nether.uneasy_alliance.title"), wp.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bvi.ad).a(di.a.a(dgz.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(dkg.hd, wp.c("advancements.nether.get_wither_skull.title"), wp.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(dkg.hd))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cxl.vt, wp.c("advancements.nether.summon_wither.title"), wp.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", eg.a.a(bx.a.a().a($$2, bvi.bI)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(cxl.tf, wp.c("advancements.nether.obtain_blaze_rod.title"), wp.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(cxl.tf))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dkg.gj, wp.c("advancements.nether.create_beacon.title"), wp.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(dk.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            dkg.gj,
            wp.c("advancements.nether.create_full_beacon.title"),
            wp.c("advancements.nether.create_full_beacon.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("beacon", bg.a.a(dk.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ai $$12 = ah.a.a()
         .a($$10)
         .a(cxl.tk, wp.c("advancements.nether.brew_potion.title"), wp.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cxl.rn, wp.c("advancements.nether.all_potions.title"), wp.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(bug.a)
                  .a(bug.b)
                  .a(bug.e)
                  .a(bug.h)
                  .a(bug.j)
                  .a(bug.l)
                  .a(bug.m)
                  .a(bug.n)
                  .a(bug.p)
                  .a(bug.r)
                  .a(bug.s)
                  .a(bug.B)
                  .a(bug.k)
                  .a(bug.L)
                  .a(bug.M)
                  .a(bug.J)
                  .a(bug.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(cxl.rh, wp.c("advancements.nether.all_effects.title"), wp.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(bug.a)
                  .a(bug.b)
                  .a(bug.e)
                  .a(bug.h)
                  .a(bug.j)
                  .a(bug.l)
                  .a(bug.m)
                  .a(bug.n)
                  .a(bug.p)
                  .a(bug.r)
                  .a(bug.s)
                  .a(bug.t)
                  .a(bug.c)
                  .a(bug.d)
                  .a(bug.y)
                  .a(bug.x)
                  .a(bug.v)
                  .a(bug.q)
                  .a(bug.i)
                  .a(bug.k)
                  .a(bug.B)
                  .a(bug.C)
                  .a(bug.D)
                  .a(bug.o)
                  .a(bug.E)
                  .a(bug.F)
                  .a(bug.G)
                  .a(bug.L)
                  .a(bug.M)
                  .a(bug.J)
                  .a(bug.K)
                  .a(bug.H)
                  .a(bug.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cxl.aE,
            wp.c("advancements.nether.obtain_ancient_debris.title"),
            wp.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(cxl.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(cxl.qA, wp.c("advancements.nether.netherite_armor.title"), wp.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(cxl.qz, cxl.qA, cxl.qB, cxl.qC))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(cxl.xH, wp.c("advancements.nether.use_lodestone.title"), wp.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkg.pS)), cv.a.a().a($$3, cxl.rB)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            cxl.xI,
            wp.c("advancements.nether.obtain_crying_obsidian.title"),
            wp.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(cxl.xI))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            cxl.xV,
            wp.c("advancements.nether.charge_respawn_anchor.title"),
            wp.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkg.pN).a(ef.a.a().a(dqr.d, 4))), cv.a.a().a($$3, dkg.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(cxl.ow, wp.c("advancements.nether.ride_strider.title"), wp.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cp.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bvi.bs)))), Optional.of(cv.a.a().a($$3, cxl.ow).b()), dk.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            cxl.ow,
            wp.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wp.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(di.a.a(dgz.i)).a(bx.a.a().a($$2, bvi.bs)), bo.a(dk.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mp.a(ah.a.a(), $$0, diq.a.a.a().toList())
         .a($$16)
         .a(cxl.qC, wp.c("advancements.nether.explore_nether.title"), wp.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(cxl.xR, wp.c("advancements.nether.find_bastion.title"), wp.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dt.a.a(di.a.b($$0.d(mc.aW).b(eod.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(dkg.cD, wp.c("advancements.nether.loot_bastion.title"), wp.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", dj.a.a(ewk.L))
         .a("loot_bastion_treasure", dj.a.a(ewk.K))
         .a("loot_bastion_hoglin_stable", dj.a.a(ewk.N))
         .a("loot_bastion_bridge", dj.a.a(ewk.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         faa.a(ewo.b.a, bx.a.a().a(bu.a.a().a(cv.a.a().a($$3, awy.V)))).invert().build(),
         faa.a(ewo.b.a, bx.a.a().a(bu.a.a().b(cv.a.a().a($$3, awy.V)))).invert().build(),
         faa.a(ewo.b.a, bx.a.a().a(bu.a.a().c(cv.a.a().a($$3, awy.V)))).invert().build(),
         faa.a(ewo.b.a, bx.a.a().a(bu.a.a().d(cv.a.a().a($$3, awy.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(cxl.pq, wp.c("advancements.nether.distract_piglin.title"), wp.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", dp.a.a($$18, Optional.of(cv.a.a().a($$3, awy.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bvi.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", dr.a.a(Optional.of($$18), cv.a.a().a($$3, cog.c), Optional.of(bx.a(bx.a.a().a($$2, bvi.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
