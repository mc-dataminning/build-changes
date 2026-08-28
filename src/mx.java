import java.util.Optional;
import java.util.function.Consumer;

public class mx implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxn<?>> $$2 = $$0.e(mi.B);
      jh<dag> $$3 = $$0.e(mi.K);
      jh<dno> $$4 = $$0.e(mi.i);
      aj $$5 = ai.a.a()
         .a(
            dnq.lr,
            xg.c("advancements.nether.root.title"),
            xg.c("advancements.nether.root.description"),
            alr.b("gui/advancements/backgrounds/nether"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", bc.a.a(dkj.j))
         .a($$1, "nether/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dao.vg, xg.c("advancements.nether.return_to_sender.title"), xg.c("advancements.nether.return_to_sender.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bxn.ae), bn.a.a().a(du.a(axo.j)).a(bz.a.a().a($$2, bxn.Z))))
         .a($$1, "nether/return_to_sender");
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dnq.fM, xg.c("advancements.nether.find_fortress.title"), xg.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", df.a.a(cv.a.b($$0.e(mi.be).b(esh.o))))
         .a($$1, "nether/find_fortress");
      ai.a.a()
         .a($$5)
         .a(dao.vt, xg.c("advancements.nether.fast_travel.title"), xg.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("travelled", br.a.a(bq.a(cx.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ai.a.a()
         .a($$6)
         .a(dao.tp, xg.c("advancements.nether.uneasy_alliance.title"), xg.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bxn.ae).a(cv.a.a(dkj.i))))
         .a($$1, "nether/uneasy_alliance");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dnq.hh, xg.c("advancements.nether.get_wither_skull.title"), xg.c("advancements.nether.get_wither_skull.description"), null, ap.a, true, true, false)
         .a("wither_skull", cl.a.a(dnq.hh))
         .a($$1, "nether/get_wither_skull");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dao.vC, xg.c("advancements.nether.summon_wither.title"), xg.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", dt.a.a(bz.a.a().a($$2, bxn.bK)))
         .a($$1, "nether/summon_wither");
      aj $$10 = ai.a.a()
         .a($$7)
         .a(dao.to, xg.c("advancements.nether.obtain_blaze_rod.title"), xg.c("advancements.nether.obtain_blaze_rod.description"), null, ap.a, true, true, false)
         .a("blaze_rod", cl.a.a(dao.to))
         .a($$1, "nether/obtain_blaze_rod");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dnq.gn, xg.c("advancements.nether.create_beacon.title"), xg.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", bh.a.a(cx.d.b(1)))
         .a($$1, "nether/create_beacon");
      ai.a.a()
         .a($$11)
         .a(
            dnq.gn,
            xg.c("advancements.nether.create_full_beacon.title"),
            xg.c("advancements.nether.create_full_beacon.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("beacon", bh.a.a(cx.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      aj $$12 = ai.a.a()
         .a($$10)
         .a(dao.tt, xg.c("advancements.nether.brew_potion.title"), xg.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", bb.a.b())
         .a($$1, "nether/brew_potion");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dao.ru, xg.c("advancements.nether.all_potions.title"), xg.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bwk.a)
                  .a(bwk.b)
                  .a(bwk.e)
                  .a(bwk.h)
                  .a(bwk.j)
                  .a(bwk.l)
                  .a(bwk.m)
                  .a(bwk.n)
                  .a(bwk.p)
                  .a(bwk.r)
                  .a(bwk.s)
                  .a(bwk.B)
                  .a(bwk.k)
                  .a(bwk.L)
                  .a(bwk.M)
                  .a(bwk.J)
                  .a(bwk.K)
            )
         )
         .a($$1, "nether/all_potions");
      ai.a.a()
         .a($$13)
         .a(dao.ro, xg.c("advancements.nether.all_effects.title"), xg.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(an.a.a(1000))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bwk.a)
                  .a(bwk.b)
                  .a(bwk.e)
                  .a(bwk.h)
                  .a(bwk.j)
                  .a(bwk.l)
                  .a(bwk.m)
                  .a(bwk.n)
                  .a(bwk.p)
                  .a(bwk.r)
                  .a(bwk.s)
                  .a(bwk.t)
                  .a(bwk.c)
                  .a(bwk.d)
                  .a(bwk.y)
                  .a(bwk.x)
                  .a(bwk.v)
                  .a(bwk.q)
                  .a(bwk.i)
                  .a(bwk.k)
                  .a(bwk.B)
                  .a(bwk.C)
                  .a(bwk.D)
                  .a(bwk.o)
                  .a(bwk.E)
                  .a(bwk.F)
                  .a(bwk.G)
                  .a(bwk.L)
                  .a(bwk.M)
                  .a(bwk.J)
                  .a(bwk.K)
                  .a(bwk.H)
                  .a(bwk.I)
            )
         )
         .a($$1, "nether/all_effects");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dao.aE,
            xg.c("advancements.nether.obtain_ancient_debris.title"),
            xg.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cl.a.a(dao.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ai.a.a()
         .a($$14)
         .a(dao.qH, xg.c("advancements.nether.netherite_armor.title"), xg.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_armor", cl.a.a(dao.qG, dao.qH, dao.qI, dao.qJ))
         .a($$1, "nether/netherite_armor");
      aj $$15 = ai.a.a()
         .a($$5)
         .a(
            dao.xR,
            xg.c("advancements.nether.obtain_crying_obsidian.title"),
            xg.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cl.a.a(dao.xR))
         .a($$1, "nether/obtain_crying_obsidian");
      ai.a.a()
         .a($$15)
         .a(
            dao.ye,
            xg.c("advancements.nether.charge_respawn_anchor.title"),
            xg.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", co.a.a(cv.a.a().a(az.a.a().a($$4, dnq.pT).a(ds.a.a().a(dud.d, 4))), cn.a.a().a($$3, dnq.et)))
         .a($$1, "nether/charge_respawn_anchor");
      aj $$16 = ai.a.a()
         .a($$5)
         .a(dao.oB, xg.c("advancements.nether.ride_strider.title"), xg.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bz.a(bz.a.a().a(bz.a.a().a($$2, bxn.bu)))), Optional.of(cn.a.a().a($$3, dao.oB).b()), cx.d.c))
         .a($$1, "nether/ride_strider");
      ai.a.a()
         .a($$16)
         .a(
            dao.oB,
            xg.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xg.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", br.a.a(bz.a.a().a(cv.a.a(dkj.i)).a(bz.a.a().a($$2, bxn.bu)), bq.a(cx.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mv.a(ai.a.a(), $$0, dma.a.a.a().toList())
         .a($$16)
         .a(dao.qJ, xg.c("advancements.nether.explore_nether.title"), xg.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(an.a.a(500))
         .a($$1, "nether/explore_nether");
      aj $$17 = ai.a.a()
         .a($$5)
         .a(dao.ya, xg.c("advancements.nether.find_bastion.title"), xg.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", df.a.a(cv.a.b($$0.e(mi.be).b(esh.s))))
         .a($$1, "nether/find_bastion");
      ai.a.a()
         .a($$17)
         .a(dnq.cG, xg.c("advancements.nether.loot_bastion.title"), xg.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("loot_bastion_other", cw.a.a(fap.L))
         .a("loot_bastion_treasure", cw.a.a(fap.K))
         .a("loot_bastion_hoglin_stable", cw.a.a(fap.N))
         .a("loot_bastion_bridge", cw.a.a(fap.M))
         .a($$1, "nether/loot_bastion");
      bj $$18 = bj.a(
         fef.a(fat.b.a, bz.a.a().a(bw.a.a().a(cn.a.a().a($$3, axv.W)))).invert().build(),
         fef.a(fat.b.a, bz.a.a().a(bw.a.a().b(cn.a.a().a($$3, axv.W)))).invert().build(),
         fef.a(fat.b.a, bz.a.a().a(bw.a.a().c(cn.a.a().a($$3, axv.W)))).invert().build(),
         fef.a(fat.b.a, bz.a.a().a(bw.a.a().d(cn.a.a().a($$3, axv.W)))).invert().build()
      );
      ai.a.a()
         .a($$5)
         .a(am.a.b)
         .a(dao.px, xg.c("advancements.nether.distract_piglin.title"), xg.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", db.a.a($$18, Optional.of(cn.a.a().a($$3, axv.U).b()), Optional.of(bz.a(bz.a.a().a($$2, bxn.aS).a(bx.a.a().g(false))))))
         .a("distract_piglin_directly", dd.a.a(Optional.of($$18), cn.a.a().a($$3, cqy.c), Optional.of(bz.a(bz.a.a().a($$2, bxn.aS).a(bx.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
