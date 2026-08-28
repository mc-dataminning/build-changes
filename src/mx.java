import java.util.Optional;
import java.util.function.Consumer;

public class mx implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxe<?>> $$2 = $$0.e(mi.B);
      jh<czw> $$3 = $$0.e(mi.K);
      jh<dne> $$4 = $$0.e(mi.i);
      aj $$5 = ai.a.a()
         .a(
            dng.lr,
            xc.c("advancements.nether.root.title"),
            xc.c("advancements.nether.root.description"),
            alk.b("gui/advancements/backgrounds/nether"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", bc.a.a(djz.j))
         .a($$1, "nether/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dae.vg, xc.c("advancements.nether.return_to_sender.title"), xc.c("advancements.nether.return_to_sender.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bxe.ae), bn.a.a().a(du.a(axh.j)).a(bz.a.a().a($$2, bxe.Z))))
         .a($$1, "nether/return_to_sender");
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dng.fM, xc.c("advancements.nether.find_fortress.title"), xc.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", df.a.a(cv.a.b($$0.e(mi.be).b(erx.o))))
         .a($$1, "nether/find_fortress");
      ai.a.a()
         .a($$5)
         .a(dae.vt, xc.c("advancements.nether.fast_travel.title"), xc.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("travelled", br.a.a(bq.a(cx.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ai.a.a()
         .a($$6)
         .a(dae.tp, xc.c("advancements.nether.uneasy_alliance.title"), xc.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bxe.ae).a(cv.a.a(djz.i))))
         .a($$1, "nether/uneasy_alliance");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dng.hh, xc.c("advancements.nether.get_wither_skull.title"), xc.c("advancements.nether.get_wither_skull.description"), null, ap.a, true, true, false)
         .a("wither_skull", cl.a.a(dng.hh))
         .a($$1, "nether/get_wither_skull");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dae.vC, xc.c("advancements.nether.summon_wither.title"), xc.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", dt.a.a(bz.a.a().a($$2, bxe.bK)))
         .a($$1, "nether/summon_wither");
      aj $$10 = ai.a.a()
         .a($$7)
         .a(dae.to, xc.c("advancements.nether.obtain_blaze_rod.title"), xc.c("advancements.nether.obtain_blaze_rod.description"), null, ap.a, true, true, false)
         .a("blaze_rod", cl.a.a(dae.to))
         .a($$1, "nether/obtain_blaze_rod");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dng.gn, xc.c("advancements.nether.create_beacon.title"), xc.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", bh.a.a(cx.d.b(1)))
         .a($$1, "nether/create_beacon");
      ai.a.a()
         .a($$11)
         .a(
            dng.gn,
            xc.c("advancements.nether.create_full_beacon.title"),
            xc.c("advancements.nether.create_full_beacon.description"),
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
         .a(dae.tt, xc.c("advancements.nether.brew_potion.title"), xc.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", bb.a.b())
         .a($$1, "nether/brew_potion");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dae.ru, xc.c("advancements.nether.all_potions.title"), xc.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bwb.a)
                  .a(bwb.b)
                  .a(bwb.e)
                  .a(bwb.h)
                  .a(bwb.j)
                  .a(bwb.l)
                  .a(bwb.m)
                  .a(bwb.n)
                  .a(bwb.p)
                  .a(bwb.r)
                  .a(bwb.s)
                  .a(bwb.B)
                  .a(bwb.k)
                  .a(bwb.L)
                  .a(bwb.M)
                  .a(bwb.J)
                  .a(bwb.K)
            )
         )
         .a($$1, "nether/all_potions");
      ai.a.a()
         .a($$13)
         .a(dae.ro, xc.c("advancements.nether.all_effects.title"), xc.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(an.a.a(1000))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bwb.a)
                  .a(bwb.b)
                  .a(bwb.e)
                  .a(bwb.h)
                  .a(bwb.j)
                  .a(bwb.l)
                  .a(bwb.m)
                  .a(bwb.n)
                  .a(bwb.p)
                  .a(bwb.r)
                  .a(bwb.s)
                  .a(bwb.t)
                  .a(bwb.c)
                  .a(bwb.d)
                  .a(bwb.y)
                  .a(bwb.x)
                  .a(bwb.v)
                  .a(bwb.q)
                  .a(bwb.i)
                  .a(bwb.k)
                  .a(bwb.B)
                  .a(bwb.C)
                  .a(bwb.D)
                  .a(bwb.o)
                  .a(bwb.E)
                  .a(bwb.F)
                  .a(bwb.G)
                  .a(bwb.L)
                  .a(bwb.M)
                  .a(bwb.J)
                  .a(bwb.K)
                  .a(bwb.H)
                  .a(bwb.I)
            )
         )
         .a($$1, "nether/all_effects");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dae.aE,
            xc.c("advancements.nether.obtain_ancient_debris.title"),
            xc.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cl.a.a(dae.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ai.a.a()
         .a($$14)
         .a(dae.qH, xc.c("advancements.nether.netherite_armor.title"), xc.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_armor", cl.a.a(dae.qG, dae.qH, dae.qI, dae.qJ))
         .a($$1, "nether/netherite_armor");
      aj $$15 = ai.a.a()
         .a($$5)
         .a(
            dae.xR,
            xc.c("advancements.nether.obtain_crying_obsidian.title"),
            xc.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cl.a.a(dae.xR))
         .a($$1, "nether/obtain_crying_obsidian");
      ai.a.a()
         .a($$15)
         .a(
            dae.ye,
            xc.c("advancements.nether.charge_respawn_anchor.title"),
            xc.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", co.a.a(cv.a.a().a(az.a.a().a($$4, dng.pT).a(ds.a.a().a(dtt.d, 4))), cn.a.a().a($$3, dng.et)))
         .a($$1, "nether/charge_respawn_anchor");
      aj $$16 = ai.a.a()
         .a($$5)
         .a(dae.oB, xc.c("advancements.nether.ride_strider.title"), xc.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bz.a(bz.a.a().a(bz.a.a().a($$2, bxe.bu)))), Optional.of(cn.a.a().a($$3, dae.oB).b()), cx.d.c))
         .a($$1, "nether/ride_strider");
      ai.a.a()
         .a($$16)
         .a(
            dae.oB,
            xc.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xc.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", br.a.a(bz.a.a().a(cv.a.a(djz.i)).a(bz.a.a().a($$2, bxe.bu)), bq.a(cx.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mv.a(ai.a.a(), $$0, dlq.a.a.a().toList())
         .a($$16)
         .a(dae.qJ, xc.c("advancements.nether.explore_nether.title"), xc.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(an.a.a(500))
         .a($$1, "nether/explore_nether");
      aj $$17 = ai.a.a()
         .a($$5)
         .a(dae.ya, xc.c("advancements.nether.find_bastion.title"), xc.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", df.a.a(cv.a.b($$0.e(mi.be).b(erx.s))))
         .a($$1, "nether/find_bastion");
      ai.a.a()
         .a($$17)
         .a(dng.cG, xc.c("advancements.nether.loot_bastion.title"), xc.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("loot_bastion_other", cw.a.a(faf.L))
         .a("loot_bastion_treasure", cw.a.a(faf.K))
         .a("loot_bastion_hoglin_stable", cw.a.a(faf.N))
         .a("loot_bastion_bridge", cw.a.a(faf.M))
         .a($$1, "nether/loot_bastion");
      bj $$18 = bj.a(
         fdv.a(faj.b.a, bz.a.a().a(bw.a.a().a(cn.a.a().a($$3, axo.W)))).invert().build(),
         fdv.a(faj.b.a, bz.a.a().a(bw.a.a().b(cn.a.a().a($$3, axo.W)))).invert().build(),
         fdv.a(faj.b.a, bz.a.a().a(bw.a.a().c(cn.a.a().a($$3, axo.W)))).invert().build(),
         fdv.a(faj.b.a, bz.a.a().a(bw.a.a().d(cn.a.a().a($$3, axo.W)))).invert().build()
      );
      ai.a.a()
         .a($$5)
         .a(am.a.b)
         .a(dae.px, xc.c("advancements.nether.distract_piglin.title"), xc.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", db.a.a($$18, Optional.of(cn.a.a().a($$3, axo.U).b()), Optional.of(bz.a(bz.a.a().a($$2, bxe.aS).a(bx.a.a().g(false))))))
         .a("distract_piglin_directly", dd.a.a(Optional.of($$18), cn.a.a().a($$3, cqp.c), Optional.of(bz.a(bz.a.a().a($$2, bxe.aS).a(bx.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
