import java.util.Optional;
import java.util.function.Consumer;

public class mr implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<bur<?>> $$2 = $$0.d(mc.z);
      js<cwl> $$3 = $$0.d(mc.K);
      js<djm> $$4 = $$0.d(mc.f);
      ai $$5 = ah.a.a()
         .a(
            djo.ln,
            wo.c("advancements.nether.root.title"),
            wo.c("advancements.nether.root.description"),
            aku.b("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dgi.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cwt.uV, wo.c("advancements.nether.return_to_sender.title"), wo.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bur.ae), bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bur.Z))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(djo.fI, wo.c("advancements.nether.find_fortress.title"), wo.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dt.a.a(di.a.b($$0.d(mc.aU).b(eng.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(cwt.vi, wo.c("advancements.nether.fast_travel.title"), wo.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(dk.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(cwt.te, wo.c("advancements.nether.uneasy_alliance.title"), wo.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", dd.a.a(bx.a.a().a($$2, bur.ae).a(di.a.a(dgi.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(djo.hd, wo.c("advancements.nether.get_wither_skull.title"), wo.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(djo.hd))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cwt.vr, wo.c("advancements.nether.summon_wither.title"), wo.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", eg.a.a(bx.a.a().a($$2, bur.bJ)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(cwt.td, wo.c("advancements.nether.obtain_blaze_rod.title"), wo.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(cwt.td))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(djo.gj, wo.c("advancements.nether.create_beacon.title"), wo.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(dk.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            djo.gj,
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
         .a(cwt.ti, wo.c("advancements.nether.brew_potion.title"), wo.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cwt.rl, wo.c("advancements.nether.all_potions.title"), wo.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(btr.a)
                  .a(btr.b)
                  .a(btr.e)
                  .a(btr.h)
                  .a(btr.j)
                  .a(btr.l)
                  .a(btr.m)
                  .a(btr.n)
                  .a(btr.p)
                  .a(btr.r)
                  .a(btr.s)
                  .a(btr.B)
                  .a(btr.k)
                  .a(btr.L)
                  .a(btr.M)
                  .a(btr.J)
                  .a(btr.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(cwt.rf, wo.c("advancements.nether.all_effects.title"), wo.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               dl.a.a()
                  .a(btr.a)
                  .a(btr.b)
                  .a(btr.e)
                  .a(btr.h)
                  .a(btr.j)
                  .a(btr.l)
                  .a(btr.m)
                  .a(btr.n)
                  .a(btr.p)
                  .a(btr.r)
                  .a(btr.s)
                  .a(btr.t)
                  .a(btr.c)
                  .a(btr.d)
                  .a(btr.y)
                  .a(btr.x)
                  .a(btr.v)
                  .a(btr.q)
                  .a(btr.i)
                  .a(btr.k)
                  .a(btr.B)
                  .a(btr.C)
                  .a(btr.D)
                  .a(btr.o)
                  .a(btr.E)
                  .a(btr.F)
                  .a(btr.G)
                  .a(btr.L)
                  .a(btr.M)
                  .a(btr.J)
                  .a(btr.K)
                  .a(btr.H)
                  .a(btr.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cwt.aE,
            wo.c("advancements.nether.obtain_ancient_debris.title"),
            wo.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(cwt.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(cwt.qy, wo.c("advancements.nether.netherite_armor.title"), wo.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(cwt.qx, cwt.qy, cwt.qz, cwt.qA))
         .a($$1, "nether/netherite_armor");
      ah.a.a()
         .a($$14)
         .a(cwt.xF, wo.c("advancements.nether.use_lodestone.title"), wo.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", cz.a.a(di.a.a().a(ay.a.a().a($$4, djo.pS)), cv.a.a().a($$3, cwt.rz)))
         .a($$1, "nether/use_lodestone");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            cwt.xG,
            wo.c("advancements.nether.obtain_crying_obsidian.title"),
            wo.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(cwt.xG))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            cwt.xT,
            wo.c("advancements.nether.charge_respawn_anchor.title"),
            wo.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cz.a.a(di.a.a().a(ay.a.a().a($$4, djo.pN).a(ef.a.a().a(dpz.d, 4))), cv.a.a().a($$3, djo.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(cwt.ou, wo.c("advancements.nether.ride_strider.title"), wo.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cp.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bur.bt)))), Optional.of(cv.a.a().a($$3, cwt.ou).b()), dk.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            cwt.ou,
            wo.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wo.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(di.a.a(dgi.i)).a(bx.a.a().a($$2, bur.bt)), bo.a(dk.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mp.a(ah.a.a(), $$0, dhy.a.a.a().toList())
         .a($$16)
         .a(cwt.qA, wo.c("advancements.nether.explore_nether.title"), wo.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(cwt.xP, wo.c("advancements.nether.find_bastion.title"), wo.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dt.a.a(di.a.b($$0.d(mc.aU).b(eng.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(djo.cD, wo.c("advancements.nether.loot_bastion.title"), wo.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", dj.a.a(evn.L))
         .a("loot_bastion_treasure", dj.a.a(evn.K))
         .a("loot_bastion_hoglin_stable", dj.a.a(evn.N))
         .a("loot_bastion_bridge", dj.a.a(evn.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         ezd.a(evr.b.a, bx.a.a().a(bu.a.a().a(cv.a.a().a($$3, awy.V)))).invert().build(),
         ezd.a(evr.b.a, bx.a.a().a(bu.a.a().b(cv.a.a().a($$3, awy.V)))).invert().build(),
         ezd.a(evr.b.a, bx.a.a().a(bu.a.a().c(cv.a.a().a($$3, awy.V)))).invert().build(),
         ezd.a(evr.b.a, bx.a.a().a(bu.a.a().d(cv.a.a().a($$3, awy.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(cwt.po, wo.c("advancements.nether.distract_piglin.title"), wo.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", dp.a.a($$18, Optional.of(cv.a.a().a($$3, awy.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bur.aS).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", dr.a.a(Optional.of($$18), cv.a.a().a($$3, cnm.c), Optional.of(bx.a(bx.a.a().a($$2, bur.aS).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
