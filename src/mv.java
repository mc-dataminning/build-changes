import java.util.Optional;
import java.util.function.Consumer;

public class mv implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwj<?>> $$2 = $$0.e(mg.B);
      jf<cyo> $$3 = $$0.e(mg.K);
      jf<dlu> $$4 = $$0.e(mg.i);
      ai $$5 = ah.a.a()
         .a(
            dlw.ln,
            ww.c("advancements.nether.root.title"),
            ww.c("advancements.nether.root.description"),
            ale.b("gui/advancements/backgrounds/nether"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dip.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cyw.uZ, ww.c("advancements.nether.return_to_sender.title"), ww.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwj.ad), bm.a.a().a(ds.a(axb.j)).a(bx.a.a().a($$2, bwj.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(dlw.fI, ww.c("advancements.nether.find_fortress.title"), ww.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dd.a.a(ct.a.b($$0.e(mg.bc).b(eqc.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(cyw.vm, ww.c("advancements.nether.fast_travel.title"), ww.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(cv.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(cyw.ti, ww.c("advancements.nether.uneasy_alliance.title"), ww.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwj.ad).a(ct.a.a(dip.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(dlw.hd, ww.c("advancements.nether.get_wither_skull.title"), ww.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(dlw.hd))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cyw.vv, ww.c("advancements.nether.summon_wither.title"), ww.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", dr.a.a(bx.a.a().a($$2, bwj.bJ)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(cyw.th, ww.c("advancements.nether.obtain_blaze_rod.title"), ww.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(cyw.th))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dlw.gj, ww.c("advancements.nether.create_beacon.title"), ww.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(cv.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            dlw.gj,
            ww.c("advancements.nether.create_full_beacon.title"),
            ww.c("advancements.nether.create_full_beacon.description"),
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
         .a(cyw.tm, ww.c("advancements.nether.brew_potion.title"), ww.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cyw.rp, ww.c("advancements.nether.all_potions.title"), ww.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvg.a)
                  .a(bvg.b)
                  .a(bvg.e)
                  .a(bvg.h)
                  .a(bvg.j)
                  .a(bvg.l)
                  .a(bvg.m)
                  .a(bvg.n)
                  .a(bvg.p)
                  .a(bvg.r)
                  .a(bvg.s)
                  .a(bvg.B)
                  .a(bvg.k)
                  .a(bvg.L)
                  .a(bvg.M)
                  .a(bvg.J)
                  .a(bvg.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(cyw.rj, ww.c("advancements.nether.all_effects.title"), ww.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvg.a)
                  .a(bvg.b)
                  .a(bvg.e)
                  .a(bvg.h)
                  .a(bvg.j)
                  .a(bvg.l)
                  .a(bvg.m)
                  .a(bvg.n)
                  .a(bvg.p)
                  .a(bvg.r)
                  .a(bvg.s)
                  .a(bvg.t)
                  .a(bvg.c)
                  .a(bvg.d)
                  .a(bvg.y)
                  .a(bvg.x)
                  .a(bvg.v)
                  .a(bvg.q)
                  .a(bvg.i)
                  .a(bvg.k)
                  .a(bvg.B)
                  .a(bvg.C)
                  .a(bvg.D)
                  .a(bvg.o)
                  .a(bvg.E)
                  .a(bvg.F)
                  .a(bvg.G)
                  .a(bvg.L)
                  .a(bvg.M)
                  .a(bvg.J)
                  .a(bvg.K)
                  .a(bvg.H)
                  .a(bvg.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cyw.aE,
            ww.c("advancements.nether.obtain_ancient_debris.title"),
            ww.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(cyw.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(cyw.qC, ww.c("advancements.nether.netherite_armor.title"), ww.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(cyw.qB, cyw.qC, cyw.qD, cyw.qE))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(cyw.xJ, ww.c("advancements.nether.use_lodestone.title"), ww.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dlw.pU)), cl.a.a().a($$3, cyw.rD)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            cyw.xK,
            ww.c("advancements.nether.obtain_crying_obsidian.title"),
            ww.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(cyw.xK))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            cyw.xX,
            ww.c("advancements.nether.charge_respawn_anchor.title"),
            ww.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dlw.pP).a(dq.a.a().a(dsh.d, 4))), cl.a.a().a($$3, dlw.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(cyw.ow, ww.c("advancements.nether.ride_strider.title"), ww.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bwj.bt)))), Optional.of(cl.a.a().a($$3, cyw.ow).b()), cv.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            cyw.ow,
            ww.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            ww.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(ct.a.a(dip.i)).a(bx.a.a().a($$2, bwj.bt)), bo.a(cv.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mt.a(ah.a.a(), $$0, dkg.a.a.a().toList())
         .a($$16)
         .a(cyw.qE, ww.c("advancements.nether.explore_nether.title"), ww.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(cyw.xT, ww.c("advancements.nether.find_bastion.title"), ww.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dd.a.a(ct.a.b($$0.e(mg.bc).b(eqc.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(dlw.cD, ww.c("advancements.nether.loot_bastion.title"), ww.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", cu.a.a(eyj.L))
         .a("loot_bastion_treasure", cu.a.a(eyj.K))
         .a("loot_bastion_hoglin_stable", cu.a.a(eyj.N))
         .a("loot_bastion_bridge", cu.a.a(eyj.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         fbz.a(eyn.b.a, bx.a.a().a(bu.a.a().a(cl.a.a().a($$3, axi.V)))).invert().build(),
         fbz.a(eyn.b.a, bx.a.a().a(bu.a.a().b(cl.a.a().a($$3, axi.V)))).invert().build(),
         fbz.a(eyn.b.a, bx.a.a().a(bu.a.a().c(cl.a.a().a($$3, axi.V)))).invert().build(),
         fbz.a(eyn.b.a, bx.a.a().a(bu.a.a().d(cl.a.a().a($$3, axi.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(cyw.ps, ww.c("advancements.nether.distract_piglin.title"), ww.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cz.a.a($$18, Optional.of(cl.a.a().a($$3, axi.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bwj.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", db.a.a(Optional.of($$18), cl.a.a().a($$3, cpi.c), Optional.of(bx.a(bx.a.a().a($$2, bwj.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
