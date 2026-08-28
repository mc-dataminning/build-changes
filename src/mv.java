import java.util.Optional;
import java.util.function.Consumer;

public class mv implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwo<?>> $$2 = $$0.e(mg.B);
      jf<cyz> $$3 = $$0.e(mg.K);
      jf<dmf> $$4 = $$0.e(mg.i);
      ai $$5 = ah.a.a()
         .a(
            dmh.lr,
            wy.c("advancements.nether.root.title"),
            wy.c("advancements.nether.root.description"),
            alg.b("gui/advancements/backgrounds/nether"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", bb.a.a(dja.j))
         .a($$1, "nether/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(czh.vg, wy.c("advancements.nether.return_to_sender.title"), wy.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwo.ad), bm.a.a().a(ds.a(axd.j)).a(bx.a.a().a($$2, bwo.Y))))
         .a($$1, "nether/return_to_sender");
      ai $$7 = ah.a.a()
         .a($$5)
         .a(dmh.fM, wy.c("advancements.nether.find_fortress.title"), wy.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", dd.a.a(ct.a.b($$0.e(mg.be).b(eqv.o))))
         .a($$1, "nether/find_fortress");
      ah.a.a()
         .a($$5)
         .a(czh.vt, wy.c("advancements.nether.fast_travel.title"), wy.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("travelled", bp.a.a(bo.a(cv.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ah.a.a()
         .a($$6)
         .a(czh.tp, wy.c("advancements.nether.uneasy_alliance.title"), wy.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("killed_ghast", co.a.a(bx.a.a().a($$2, bwo.ad).a(ct.a.a(dja.i))))
         .a($$1, "nether/uneasy_alliance");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(dmh.hh, wy.c("advancements.nether.get_wither_skull.title"), wy.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", cj.a.a(dmh.hh))
         .a($$1, "nether/get_wither_skull");
      ai $$9 = ah.a.a()
         .a($$8)
         .a(czh.vC, wy.c("advancements.nether.summon_wither.title"), wy.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", dr.a.a(bx.a.a().a($$2, bwo.bJ)))
         .a($$1, "nether/summon_wither");
      ai $$10 = ah.a.a()
         .a($$7)
         .a(czh.to, wy.c("advancements.nether.obtain_blaze_rod.title"), wy.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", cj.a.a(czh.to))
         .a($$1, "nether/obtain_blaze_rod");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dmh.gn, wy.c("advancements.nether.create_beacon.title"), wy.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", bg.a.a(cv.d.b(1)))
         .a($$1, "nether/create_beacon");
      ah.a.a()
         .a($$11)
         .a(
            dmh.gn,
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
         .a(czh.tt, wy.c("advancements.nether.brew_potion.title"), wy.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", ba.a.b())
         .a($$1, "nether/brew_potion");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(czh.ru, wy.c("advancements.nether.all_potions.title"), wy.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvl.a)
                  .a(bvl.b)
                  .a(bvl.e)
                  .a(bvl.h)
                  .a(bvl.j)
                  .a(bvl.l)
                  .a(bvl.m)
                  .a(bvl.n)
                  .a(bvl.p)
                  .a(bvl.r)
                  .a(bvl.s)
                  .a(bvl.B)
                  .a(bvl.k)
                  .a(bvl.L)
                  .a(bvl.M)
                  .a(bvl.J)
                  .a(bvl.K)
            )
         )
         .a($$1, "nether/all_potions");
      ah.a.a()
         .a($$13)
         .a(czh.ro, wy.c("advancements.nether.all_effects.title"), wy.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(am.a.a(1000))
         .a(
            "all_effects",
            bq.a.a(
               cw.a.a()
                  .a(bvl.a)
                  .a(bvl.b)
                  .a(bvl.e)
                  .a(bvl.h)
                  .a(bvl.j)
                  .a(bvl.l)
                  .a(bvl.m)
                  .a(bvl.n)
                  .a(bvl.p)
                  .a(bvl.r)
                  .a(bvl.s)
                  .a(bvl.t)
                  .a(bvl.c)
                  .a(bvl.d)
                  .a(bvl.y)
                  .a(bvl.x)
                  .a(bvl.v)
                  .a(bvl.q)
                  .a(bvl.i)
                  .a(bvl.k)
                  .a(bvl.B)
                  .a(bvl.C)
                  .a(bvl.D)
                  .a(bvl.o)
                  .a(bvl.E)
                  .a(bvl.F)
                  .a(bvl.G)
                  .a(bvl.L)
                  .a(bvl.M)
                  .a(bvl.J)
                  .a(bvl.K)
                  .a(bvl.H)
                  .a(bvl.I)
            )
         )
         .a($$1, "nether/all_effects");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            czh.aE,
            wy.c("advancements.nether.obtain_ancient_debris.title"),
            wy.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cj.a.a(czh.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ah.a.a()
         .a($$14)
         .a(czh.qH, wy.c("advancements.nether.netherite_armor.title"), wy.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a("netherite_armor", cj.a.a(czh.qG, czh.qH, czh.qI, czh.qJ))
         .a($$1, "nether/netherite_armor");
      ai $$15 = ah.a.a()
         .a($$5)
         .a(
            czh.xR,
            wy.c("advancements.nether.obtain_crying_obsidian.title"),
            wy.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cj.a.a(czh.xR))
         .a($$1, "nether/obtain_crying_obsidian");
      ah.a.a()
         .a($$15)
         .a(
            czh.ye,
            wy.c("advancements.nether.charge_respawn_anchor.title"),
            wy.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmh.pT).a(dq.a.a().a(dsu.d, 4))), cl.a.a().a($$3, dmh.et)))
         .a($$1, "nether/charge_respawn_anchor");
      ai $$16 = ah.a.a()
         .a($$5)
         .a(czh.oB, wy.c("advancements.nether.ride_strider.title"), wy.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bx.a(bx.a.a().a(bx.a.a().a($$2, bwo.bt)))), Optional.of(cl.a.a().a($$3, czh.oB).b()), cv.d.c))
         .a($$1, "nether/ride_strider");
      ah.a.a()
         .a($$16)
         .a(
            czh.oB,
            wy.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wy.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bp.a.a(bx.a.a().a(ct.a.a(dja.i)).a(bx.a.a().a($$2, bwo.bt)), bo.a(cv.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mt.a(ah.a.a(), $$0, dkr.a.a.a().toList())
         .a($$16)
         .a(czh.qJ, wy.c("advancements.nether.explore_nether.title"), wy.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(am.a.a(500))
         .a($$1, "nether/explore_nether");
      ai $$17 = ah.a.a()
         .a($$5)
         .a(czh.ya, wy.c("advancements.nether.find_bastion.title"), wy.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", dd.a.a(ct.a.b($$0.e(mg.be).b(eqv.s))))
         .a($$1, "nether/find_bastion");
      ah.a.a()
         .a($$17)
         .a(dmh.cG, wy.c("advancements.nether.loot_bastion.title"), wy.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("loot_bastion_other", cu.a.a(ezd.L))
         .a("loot_bastion_treasure", cu.a.a(ezd.K))
         .a("loot_bastion_hoglin_stable", cu.a.a(ezd.N))
         .a("loot_bastion_bridge", cu.a.a(ezd.M))
         .a($$1, "nether/loot_bastion");
      bi $$18 = bi.a(
         fct.a(ezh.b.a, bx.a.a().a(bu.a.a().a(cl.a.a().a($$3, axk.V)))).invert().build(),
         fct.a(ezh.b.a, bx.a.a().a(bu.a.a().b(cl.a.a().a($$3, axk.V)))).invert().build(),
         fct.a(ezh.b.a, bx.a.a().a(bu.a.a().c(cl.a.a().a($$3, axk.V)))).invert().build(),
         fct.a(ezh.b.a, bx.a.a().a(bu.a.a().d(cl.a.a().a($$3, axk.V)))).invert().build()
      );
      ah.a.a()
         .a($$5)
         .a(al.a.b)
         .a(czh.px, wy.c("advancements.nether.distract_piglin.title"), wy.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cz.a.a($$18, Optional.of(cl.a.a().a($$3, axk.T).b()), Optional.of(bx.a(bx.a.a().a($$2, bwo.aR).a(bv.a.a().g(false))))))
         .a("distract_piglin_directly", db.a.a(Optional.of($$18), cl.a.a().a($$3, cps.c), Optional.of(bx.a(bx.a.a().a($$2, bwo.aR).a(bv.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
