import java.util.Optional;
import java.util.function.Consumer;

public class mr implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<buq<?>> $$2 = $$0.d(mc.z);
      js<cwj> $$3 = $$0.d(mc.K);
      js<djk> $$4 = $$0.d(mc.f);
      ai $$5 = ah.a.a()
         .a(
            djm.ln,
            wo.c("advancements.nether.root.title"),
            wo.c("advancements.nether.root.description"),
            aku.b("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dgg.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cwr.uV, wo.c("advancements.nether.return_to_sender.title"), wo.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, buq.ad), bm.a.a().a(eh.a(awq.j)).a(bx.a.a().a($$2, buq.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(djm.fI, wo.c("advancements.nether.find_fortress.title"), wo.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dt.a.a(di.a.b($$0.d(mc.aU).b(ene.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(cwr.vi, wo.c("advancements.nether.fast_travel.title"), wo.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(dk.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(cwr.te, wo.c("advancements.nether.uneasy_alliance.title"), wo.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, buq.ad).a(di.a.a(dgg.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(djm.hd, wo.c("advancements.nether.get_wither_skull.title"), wo.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(djm.hd))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cwr.vr, wo.c("advancements.nether.summon_wither.title"), wo.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", eg.a.a(bx.a.a().a($$2, buq.bI)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(cwr.td, wo.c("advancements.nether.obtain_blaze_rod.title"), wo.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(cwr.td))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(djm.gj, wo.c("advancements.nether.create_beacon.title"), wo.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(dk.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            djm.gj,
            wo.c("advancements.nether.create_full_beacon.title"),
            wo.c("advancements.nether.create_full_beacon.description"),
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
         .a(cwr.ti, wo.c("advancements.nether.brew_potion.title"), wo.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cwr.rl, wo.c("advancements.nether.all_potions.title"), wo.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(btq.a)
                  .a(btq.b)
                  .a(btq.e)
                  .a(btq.h)
                  .a(btq.j)
                  .a(btq.l)
                  .a(btq.m)
                  .a(btq.n)
                  .a(btq.p)
                  .a(btq.r)
                  .a(btq.s)
                  .a(btq.B)
                  .a(btq.k)
                  .a(btq.L)
                  .a(btq.M)
                  .a(btq.J)
                  .a(btq.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(cwr.rf, wo.c("advancements.nether.all_effects.title"), wo.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(btq.a)
                  .a(btq.b)
                  .a(btq.e)
                  .a(btq.h)
                  .a(btq.j)
                  .a(btq.l)
                  .a(btq.m)
                  .a(btq.n)
                  .a(btq.p)
                  .a(btq.r)
                  .a(btq.s)
                  .a(btq.t)
                  .a(btq.c)
                  .a(btq.d)
                  .a(btq.y)
                  .a(btq.x)
                  .a(btq.v)
                  .a(btq.q)
                  .a(btq.i)
                  .a(btq.k)
                  .a(btq.B)
                  .a(btq.C)
                  .a(btq.D)
                  .a(btq.o)
                  .a(btq.E)
                  .a(btq.F)
                  .a(btq.G)
                  .a(btq.L)
                  .a(btq.M)
                  .a(btq.J)
                  .a(btq.K)
                  .a(btq.H)
                  .a(btq.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cwr.aE,
            wo.c("advancements.nether.obtain_ancient_debris.title"),
            wo.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(cwr.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(cwr.qy, wo.c("advancements.nether.netherite_armor.title"), wo.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(cwr.qx, cwr.qy, cwr.qz, cwr.qA))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(cwr.xF, wo.c("advancements.nether.use_lodestone.title"), wo.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cz.a.a(di.a.a().a(ay.a.a().a($$4, djm.pS)), cv.a.a().a($$3, cwr.rz)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            cwr.xG,
            wo.c("advancements.nether.obtain_crying_obsidian.title"),
            wo.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(cwr.xG))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            cwr.xT,
            wo.c("advancements.nether.charge_respawn_anchor.title"),
            wo.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cz.a.a(di.a.a().a(ay.a.a().a($$4, djm.pN).a(ef.a.a().a(dpx.d, 4))), cv.a.a().a($$3, djm.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(cwr.ou, wo.c("advancements.nether.ride_strider.title"), wo.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cp.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, buq.bs)))), Optional.of(cv.a.a().a($$3, cwr.ou).b()), dk.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            cwr.ou,
            wo.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wo.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(di.a.a(dgg.i)).a(bx.a.a().a($$2, buq.bs)), bo.a(dk.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mp.a(ah.a.a(), $$0, dhw.a.a.a().toList())
         .a($$16)
         .a(cwr.qA, wo.c("advancements.nether.explore_nether.title"), wo.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(cwr.xP, wo.c("advancements.nether.find_bastion.title"), wo.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dt.a.a(di.a.b($$0.d(mc.aU).b(ene.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(djm.cD, wo.c("advancements.nether.loot_bastion.title"), wo.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", dj.a.a(evl.L))
         .a("loot_bastion_treasure", dj.a.a(evl.K))
         .a("loot_bastion_hoglin_stable", dj.a.a(evl.N))
         .a("loot_bastion_bridge", dj.a.a(evl.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         ezb.a(evp.b.a, bx.a.a().a(bu.a.a().a(cv.a.a().a($$3, awx.V)))).invert().build(),
         ezb.a(evp.b.a, bx.a.a().a(bu.a.a().b(cv.a.a().a($$3, awx.V)))).invert().build(),
         ezb.a(evp.b.a, bx.a.a().a(bu.a.a().c(cv.a.a().a($$3, awx.V)))).invert().build(),
         ezb.a(evp.b.a, bx.a.a().a(bu.a.a().d(cv.a.a().a($$3, awx.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(cwr.po, wo.c("advancements.nether.distract_piglin.title"), wo.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", dp.a.a($$18, Optional.of(cv.a.a().a($$3, awx.T).b()), Optional.of(bx.a(bx.a.a().a($$2, buq.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", dr.a.a(Optional.of($$18), cv.a.a().a($$3, cnk.c), Optional.of(bx.a(bx.a.a().a($$2, buq.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
