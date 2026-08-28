import java.util.Optional;
import java.util.function.Consumer;

public class mt implements mo {
   @Override
   public void a(ju.a $$0, Consumer<ai> $$1) {
      jt<bwb<?>> $$2 = $$0.e(me.z);
      jt<cxu> $$3 = $$0.e(me.K);
      jt<dku> $$4 = $$0.e(me.f);
      ai $$5 = ah.a.a()
         .a(
            dkw.ln,
            wv.c("advancements.nether.root.title"),
            wv.c("advancements.nether.root.description"),
            ald.b("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dhp.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cyc.uZ, wv.c("advancements.nether.return_to_sender.title"), wv.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bwb.ad), bm.a.a().a(eh.a(axb.j)).a(bx.a.a().a($$2, bwb.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(dkw.fI, wv.c("advancements.nether.find_fortress.title"), wv.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dt.a.a(di.a.b($$0.e(me.aZ).b(epa.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(cyc.vm, wv.c("advancements.nether.fast_travel.title"), wv.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(dk.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(cyc.ti, wv.c("advancements.nether.uneasy_alliance.title"), wv.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bwb.ad).a(di.a.a(dhp.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(dkw.hd, wv.c("advancements.nether.get_wither_skull.title"), wv.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(dkw.hd))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cyc.vv, wv.c("advancements.nether.summon_wither.title"), wv.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", eg.a.a(bx.a.a().a($$2, bwb.bI)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(cyc.th, wv.c("advancements.nether.obtain_blaze_rod.title"), wv.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(cyc.th))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dkw.gj, wv.c("advancements.nether.create_beacon.title"), wv.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(dk.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            dkw.gj,
            wv.c("advancements.nether.create_full_beacon.title"),
            wv.c("advancements.nether.create_full_beacon.description"),
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
         .a(cyc.tm, wv.c("advancements.nether.brew_potion.title"), wv.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cyc.rp, wv.c("advancements.nether.all_potions.title"), wv.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(buy.a)
                  .a(buy.b)
                  .a(buy.e)
                  .a(buy.h)
                  .a(buy.j)
                  .a(buy.l)
                  .a(buy.m)
                  .a(buy.n)
                  .a(buy.p)
                  .a(buy.r)
                  .a(buy.s)
                  .a(buy.B)
                  .a(buy.k)
                  .a(buy.L)
                  .a(buy.M)
                  .a(buy.J)
                  .a(buy.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(cyc.rj, wv.c("advancements.nether.all_effects.title"), wv.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(buy.a)
                  .a(buy.b)
                  .a(buy.e)
                  .a(buy.h)
                  .a(buy.j)
                  .a(buy.l)
                  .a(buy.m)
                  .a(buy.n)
                  .a(buy.p)
                  .a(buy.r)
                  .a(buy.s)
                  .a(buy.t)
                  .a(buy.c)
                  .a(buy.d)
                  .a(buy.y)
                  .a(buy.x)
                  .a(buy.v)
                  .a(buy.q)
                  .a(buy.i)
                  .a(buy.k)
                  .a(buy.B)
                  .a(buy.C)
                  .a(buy.D)
                  .a(buy.o)
                  .a(buy.E)
                  .a(buy.F)
                  .a(buy.G)
                  .a(buy.L)
                  .a(buy.M)
                  .a(buy.J)
                  .a(buy.K)
                  .a(buy.H)
                  .a(buy.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cyc.aE,
            wv.c("advancements.nether.obtain_ancient_debris.title"),
            wv.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(cyc.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(cyc.qC, wv.c("advancements.nether.netherite_armor.title"), wv.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(cyc.qB, cyc.qC, cyc.qD, cyc.qE))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(cyc.xJ, wv.c("advancements.nether.use_lodestone.title"), wv.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkw.pU)), cv.a.a().a($$3, cyc.rD)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            cyc.xK,
            wv.c("advancements.nether.obtain_crying_obsidian.title"),
            wv.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(cyc.xK))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            cyc.xX,
            wv.c("advancements.nether.charge_respawn_anchor.title"),
            wv.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkw.pP).a(ef.a.a().a(drh.d, 4))), cv.a.a().a($$3, dkw.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(cyc.ow, wv.c("advancements.nether.ride_strider.title"), wv.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cp.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bwb.bs)))), Optional.of(cv.a.a().a($$3, cyc.ow).b()), dk.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            cyc.ow,
            wv.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wv.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(di.a.a(dhp.i)).a(bx.a.a().a($$2, bwb.bs)), bo.a(dk.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mr.a(ah.a.a(), $$0, djg.a.a.a().toList())
         .a($$16)
         .a(cyc.qE, wv.c("advancements.nether.explore_nether.title"), wv.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(cyc.xT, wv.c("advancements.nether.find_bastion.title"), wv.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dt.a.a(di.a.b($$0.e(me.aZ).b(epa.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(dkw.cD, wv.c("advancements.nether.loot_bastion.title"), wv.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", dj.a.a(exh.L))
         .a("loot_bastion_treasure", dj.a.a(exh.K))
         .a("loot_bastion_hoglin_stable", dj.a.a(exh.N))
         .a("loot_bastion_bridge", dj.a.a(exh.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         fax.a(exl.b.a, bx.a.a().a(bu.a.a().a(cv.a.a().a($$3, axi.V)))).invert().build(),
         fax.a(exl.b.a, bx.a.a().a(bu.a.a().b(cv.a.a().a($$3, axi.V)))).invert().build(),
         fax.a(exl.b.a, bx.a.a().a(bu.a.a().c(cv.a.a().a($$3, axi.V)))).invert().build(),
         fax.a(exl.b.a, bx.a.a().a(bu.a.a().d(cv.a.a().a($$3, axi.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(cyc.ps, wv.c("advancements.nether.distract_piglin.title"), wv.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", dp.a.a($$18, Optional.of(cv.a.a().a($$3, axi.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bwb.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", dr.a.a(Optional.of($$18), cv.a.a().a($$3, coy.c), Optional.of(bx.a(bx.a.a().a($$2, bwb.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
