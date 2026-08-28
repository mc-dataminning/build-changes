import java.util.Optional;
import java.util.function.Consumer;

public class mw implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bwr<?>> $$2 = $$0.e(mh.B);
      jg<czg> $$3 = $$0.e(mh.K);
      jg<dmm> $$4 = $$0.e(mh.i);
      aj $$5 = ai.a.a()
         .a(
            dmo.lr,
            wy.c("advancements.nether.root.title"),
            wy.c("advancements.nether.root.description"),
            alg.b("gui/advancements/backgrounds/nether"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", bc.a.a(djh.j))
         .a($$1, "nether/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(czo.vg, wy.c("advancements.nether.return_to_sender.title"), wy.c("advancements.nether.return_to_sender.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_ghast", cp.a.a(by.a.a().a($$2, bwr.ad), bn.a.a().a(dt.a(axd.j)).a(by.a.a().a($$2, bwr.Y))))
         .a($$1, "nether/return_to_sender");
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dmo.fM, wy.c("advancements.nether.find_fortress.title"), wy.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", de.a.a(cu.a.b($$0.e(mh.be).b(erc.o))))
         .a($$1, "nether/find_fortress");
      ai.a.a()
         .a($$5)
         .a(czo.vt, wy.c("advancements.nether.fast_travel.title"), wy.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("travelled", bq.a.a(bp.a(cw.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ai.a.a()
         .a($$6)
         .a(czo.tp, wy.c("advancements.nether.uneasy_alliance.title"), wy.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("killed_ghast", cp.a.a(by.a.a().a($$2, bwr.ad).a(cu.a.a(djh.i))))
         .a($$1, "nether/uneasy_alliance");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dmo.hh, wy.c("advancements.nether.get_wither_skull.title"), wy.c("advancements.nether.get_wither_skull.description"), null, ap.a, true, true, false)
         .a("wither_skull", ck.a.a(dmo.hh))
         .a($$1, "nether/get_wither_skull");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(czo.vC, wy.c("advancements.nether.summon_wither.title"), wy.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", ds.a.a(by.a.a().a($$2, bwr.bJ)))
         .a($$1, "nether/summon_wither");
      aj $$10 = ai.a.a()
         .a($$7)
         .a(czo.to, wy.c("advancements.nether.obtain_blaze_rod.title"), wy.c("advancements.nether.obtain_blaze_rod.description"), null, ap.a, true, true, false)
         .a("blaze_rod", ck.a.a(czo.to))
         .a($$1, "nether/obtain_blaze_rod");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dmo.gn, wy.c("advancements.nether.create_beacon.title"), wy.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", bh.a.a(cw.d.b(1)))
         .a($$1, "nether/create_beacon");
      ai.a.a()
         .a($$11)
         .a(
            dmo.gn,
            wy.c("advancements.nether.create_full_beacon.title"),
            wy.c("advancements.nether.create_full_beacon.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("beacon", bh.a.a(cw.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      aj $$12 = ai.a.a()
         .a($$10)
         .a(czo.tt, wy.c("advancements.nether.brew_potion.title"), wy.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", bb.a.b())
         .a($$1, "nether/brew_potion");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(czo.ru, wy.c("advancements.nether.all_potions.title"), wy.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a(
            "all_effects",
            br.a.a(
               cx.a.a()
                  .a(bvo.a)
                  .a(bvo.b)
                  .a(bvo.e)
                  .a(bvo.h)
                  .a(bvo.j)
                  .a(bvo.l)
                  .a(bvo.m)
                  .a(bvo.n)
                  .a(bvo.p)
                  .a(bvo.r)
                  .a(bvo.s)
                  .a(bvo.B)
                  .a(bvo.k)
                  .a(bvo.L)
                  .a(bvo.M)
                  .a(bvo.J)
                  .a(bvo.K)
            )
         )
         .a($$1, "nether/all_potions");
      ai.a.a()
         .a($$13)
         .a(czo.ro, wy.c("advancements.nether.all_effects.title"), wy.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(an.a.a(1000))
         .a(
            "all_effects",
            br.a.a(
               cx.a.a()
                  .a(bvo.a)
                  .a(bvo.b)
                  .a(bvo.e)
                  .a(bvo.h)
                  .a(bvo.j)
                  .a(bvo.l)
                  .a(bvo.m)
                  .a(bvo.n)
                  .a(bvo.p)
                  .a(bvo.r)
                  .a(bvo.s)
                  .a(bvo.t)
                  .a(bvo.c)
                  .a(bvo.d)
                  .a(bvo.y)
                  .a(bvo.x)
                  .a(bvo.v)
                  .a(bvo.q)
                  .a(bvo.i)
                  .a(bvo.k)
                  .a(bvo.B)
                  .a(bvo.C)
                  .a(bvo.D)
                  .a(bvo.o)
                  .a(bvo.E)
                  .a(bvo.F)
                  .a(bvo.G)
                  .a(bvo.L)
                  .a(bvo.M)
                  .a(bvo.J)
                  .a(bvo.K)
                  .a(bvo.H)
                  .a(bvo.I)
            )
         )
         .a($$1, "nether/all_effects");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            czo.aE,
            wy.c("advancements.nether.obtain_ancient_debris.title"),
            wy.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ck.a.a(czo.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ai.a.a()
         .a($$14)
         .a(czo.qH, wy.c("advancements.nether.netherite_armor.title"), wy.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_armor", ck.a.a(czo.qG, czo.qH, czo.qI, czo.qJ))
         .a($$1, "nether/netherite_armor");
      aj $$15 = ai.a.a()
         .a($$5)
         .a(
            czo.xR,
            wy.c("advancements.nether.obtain_crying_obsidian.title"),
            wy.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ck.a.a(czo.xR))
         .a($$1, "nether/obtain_crying_obsidian");
      ai.a.a()
         .a($$15)
         .a(
            czo.ye,
            wy.c("advancements.nether.charge_respawn_anchor.title"),
            wy.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cn.a.a(cu.a.a().a(az.a.a().a($$4, dmo.pT).a(dr.a.a().a(dtb.d, 4))), cm.a.a().a($$3, dmo.et)))
         .a($$1, "nether/charge_respawn_anchor");
      aj $$16 = ai.a.a()
         .a($$5)
         .a(czo.oB, wy.c("advancements.nether.ride_strider.title"), wy.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cl.a.a(Optional.of(by.a(by.a.a().a(by.a.a().a($$2, bwr.bt)))), Optional.of(cm.a.a().a($$3, czo.oB).b()), cw.d.c))
         .a($$1, "nether/ride_strider");
      ai.a.a()
         .a($$16)
         .a(
            czo.oB,
            wy.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wy.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bq.a.a(by.a.a().a(cu.a.a(djh.i)).a(by.a.a().a($$2, bwr.bt)), bp.a(cw.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mu.a(ai.a.a(), $$0, dky.a.a.a().toList())
         .a($$16)
         .a(czo.qJ, wy.c("advancements.nether.explore_nether.title"), wy.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(an.a.a(500))
         .a($$1, "nether/explore_nether");
      aj $$17 = ai.a.a()
         .a($$5)
         .a(czo.ya, wy.c("advancements.nether.find_bastion.title"), wy.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", de.a.a(cu.a.b($$0.e(mh.be).b(erc.s))))
         .a($$1, "nether/find_bastion");
      ai.a.a()
         .a($$17)
         .a(dmo.cG, wy.c("advancements.nether.loot_bastion.title"), wy.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("loot_bastion_other", cv.a.a(ezk.L))
         .a("loot_bastion_treasure", cv.a.a(ezk.K))
         .a("loot_bastion_hoglin_stable", cv.a.a(ezk.N))
         .a("loot_bastion_bridge", cv.a.a(ezk.M))
         .a($$1, "nether/loot_bastion");
      bj $$18 = bj.a(
         fda.a(ezo.b.a, by.a.a().a(bv.a.a().a(cm.a.a().a($$3, axk.V)))).invert().build(),
         fda.a(ezo.b.a, by.a.a().a(bv.a.a().b(cm.a.a().a($$3, axk.V)))).invert().build(),
         fda.a(ezo.b.a, by.a.a().a(bv.a.a().c(cm.a.a().a($$3, axk.V)))).invert().build(),
         fda.a(ezo.b.a, by.a.a().a(bv.a.a().d(cm.a.a().a($$3, axk.V)))).invert().build()
      );
      ai.a.a()
         .a($$5)
         .a(am.a.b)
         .a(czo.px, wy.c("advancements.nether.distract_piglin.title"), wy.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", da.a.a($$18, Optional.of(cm.a.a().a($$3, axk.T).b()), Optional.of(by.a(by.a.a().a($$2, bwr.aR).a(bw.a.a().g(false))))))
         .a("distract_piglin_directly", dc.a.a(Optional.of($$18), cm.a.a().a($$3, cpz.c), Optional.of(by.a(by.a.a().a($$2, bwr.aR).a(bw.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
