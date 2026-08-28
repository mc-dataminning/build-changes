import java.util.Optional;
import java.util.function.Consumer;

public class mw implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bxc<?>> $$2 = $$0.e(mh.B);
      jg<czu> $$3 = $$0.e(mh.K);
      jg<dnc> $$4 = $$0.e(mh.i);
      aj $$5 = ai.a.a()
         .a(
            dne.lr,
            xa.c("advancements.nether.root.title"),
            xa.c("advancements.nether.root.description"),
            ali.b("gui/advancements/backgrounds/nether"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", bc.a.a(djx.j))
         .a($$1, "nether/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dac.vg, xa.c("advancements.nether.return_to_sender.title"), xa.c("advancements.nether.return_to_sender.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_ghast", cp.a.a(by.a.a().a($$2, bxc.ae), bn.a.a().a(dt.a(axf.j)).a(by.a.a().a($$2, bxc.Z))))
         .a($$1, "nether/return_to_sender");
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dne.fM, xa.c("advancements.nether.find_fortress.title"), xa.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", de.a.a(cu.a.b($$0.e(mh.be).b(erv.o))))
         .a($$1, "nether/find_fortress");
      ai.a.a()
         .a($$5)
         .a(dac.vt, xa.c("advancements.nether.fast_travel.title"), xa.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("travelled", bq.a.a(bp.a(cw.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ai.a.a()
         .a($$6)
         .a(dac.tp, xa.c("advancements.nether.uneasy_alliance.title"), xa.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("killed_ghast", cp.a.a(by.a.a().a($$2, bxc.ae).a(cu.a.a(djx.i))))
         .a($$1, "nether/uneasy_alliance");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dne.hh, xa.c("advancements.nether.get_wither_skull.title"), xa.c("advancements.nether.get_wither_skull.description"), null, ap.a, true, true, false)
         .a("wither_skull", ck.a.a(dne.hh))
         .a($$1, "nether/get_wither_skull");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dac.vC, xa.c("advancements.nether.summon_wither.title"), xa.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", ds.a.a(by.a.a().a($$2, bxc.bK)))
         .a($$1, "nether/summon_wither");
      aj $$10 = ai.a.a()
         .a($$7)
         .a(dac.to, xa.c("advancements.nether.obtain_blaze_rod.title"), xa.c("advancements.nether.obtain_blaze_rod.description"), null, ap.a, true, true, false)
         .a("blaze_rod", ck.a.a(dac.to))
         .a($$1, "nether/obtain_blaze_rod");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dne.gn, xa.c("advancements.nether.create_beacon.title"), xa.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", bh.a.a(cw.d.b(1)))
         .a($$1, "nether/create_beacon");
      ai.a.a()
         .a($$11)
         .a(
            dne.gn,
            xa.c("advancements.nether.create_full_beacon.title"),
            xa.c("advancements.nether.create_full_beacon.description"),
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
         .a(dac.tt, xa.c("advancements.nether.brew_potion.title"), xa.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", bb.a.b())
         .a($$1, "nether/brew_potion");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dac.ru, xa.c("advancements.nether.all_potions.title"), xa.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a(
            "all_effects",
            br.a.a(
               cx.a.a()
                  .a(bvz.a)
                  .a(bvz.b)
                  .a(bvz.e)
                  .a(bvz.h)
                  .a(bvz.j)
                  .a(bvz.l)
                  .a(bvz.m)
                  .a(bvz.n)
                  .a(bvz.p)
                  .a(bvz.r)
                  .a(bvz.s)
                  .a(bvz.B)
                  .a(bvz.k)
                  .a(bvz.L)
                  .a(bvz.M)
                  .a(bvz.J)
                  .a(bvz.K)
            )
         )
         .a($$1, "nether/all_potions");
      ai.a.a()
         .a($$13)
         .a(dac.ro, xa.c("advancements.nether.all_effects.title"), xa.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(an.a.a(1000))
         .a(
            "all_effects",
            br.a.a(
               cx.a.a()
                  .a(bvz.a)
                  .a(bvz.b)
                  .a(bvz.e)
                  .a(bvz.h)
                  .a(bvz.j)
                  .a(bvz.l)
                  .a(bvz.m)
                  .a(bvz.n)
                  .a(bvz.p)
                  .a(bvz.r)
                  .a(bvz.s)
                  .a(bvz.t)
                  .a(bvz.c)
                  .a(bvz.d)
                  .a(bvz.y)
                  .a(bvz.x)
                  .a(bvz.v)
                  .a(bvz.q)
                  .a(bvz.i)
                  .a(bvz.k)
                  .a(bvz.B)
                  .a(bvz.C)
                  .a(bvz.D)
                  .a(bvz.o)
                  .a(bvz.E)
                  .a(bvz.F)
                  .a(bvz.G)
                  .a(bvz.L)
                  .a(bvz.M)
                  .a(bvz.J)
                  .a(bvz.K)
                  .a(bvz.H)
                  .a(bvz.I)
            )
         )
         .a($$1, "nether/all_effects");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dac.aE,
            xa.c("advancements.nether.obtain_ancient_debris.title"),
            xa.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ck.a.a(dac.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ai.a.a()
         .a($$14)
         .a(dac.qH, xa.c("advancements.nether.netherite_armor.title"), xa.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_armor", ck.a.a(dac.qG, dac.qH, dac.qI, dac.qJ))
         .a($$1, "nether/netherite_armor");
      aj $$15 = ai.a.a()
         .a($$5)
         .a(
            dac.xR,
            xa.c("advancements.nether.obtain_crying_obsidian.title"),
            xa.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ck.a.a(dac.xR))
         .a($$1, "nether/obtain_crying_obsidian");
      ai.a.a()
         .a($$15)
         .a(
            dac.ye,
            xa.c("advancements.nether.charge_respawn_anchor.title"),
            xa.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cn.a.a(cu.a.a().a(az.a.a().a($$4, dne.pT).a(dr.a.a().a(dtr.d, 4))), cm.a.a().a($$3, dne.et)))
         .a($$1, "nether/charge_respawn_anchor");
      aj $$16 = ai.a.a()
         .a($$5)
         .a(dac.oB, xa.c("advancements.nether.ride_strider.title"), xa.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cl.a.a(Optional.of(by.a(by.a.a().a(by.a.a().a($$2, bxc.bu)))), Optional.of(cm.a.a().a($$3, dac.oB).b()), cw.d.c))
         .a($$1, "nether/ride_strider");
      ai.a.a()
         .a($$16)
         .a(
            dac.oB,
            xa.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xa.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bq.a.a(by.a.a().a(cu.a.a(djx.i)).a(by.a.a().a($$2, bxc.bu)), bp.a(cw.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mu.a(ai.a.a(), $$0, dlo.a.a.a().toList())
         .a($$16)
         .a(dac.qJ, xa.c("advancements.nether.explore_nether.title"), xa.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(an.a.a(500))
         .a($$1, "nether/explore_nether");
      aj $$17 = ai.a.a()
         .a($$5)
         .a(dac.ya, xa.c("advancements.nether.find_bastion.title"), xa.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", de.a.a(cu.a.b($$0.e(mh.be).b(erv.s))))
         .a($$1, "nether/find_bastion");
      ai.a.a()
         .a($$17)
         .a(dne.cG, xa.c("advancements.nether.loot_bastion.title"), xa.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("loot_bastion_other", cv.a.a(fad.L))
         .a("loot_bastion_treasure", cv.a.a(fad.K))
         .a("loot_bastion_hoglin_stable", cv.a.a(fad.N))
         .a("loot_bastion_bridge", cv.a.a(fad.M))
         .a($$1, "nether/loot_bastion");
      bj $$18 = bj.a(
         fdt.a(fah.b.a, by.a.a().a(bv.a.a().a(cm.a.a().a($$3, axm.V)))).invert().build(),
         fdt.a(fah.b.a, by.a.a().a(bv.a.a().b(cm.a.a().a($$3, axm.V)))).invert().build(),
         fdt.a(fah.b.a, by.a.a().a(bv.a.a().c(cm.a.a().a($$3, axm.V)))).invert().build(),
         fdt.a(fah.b.a, by.a.a().a(bv.a.a().d(cm.a.a().a($$3, axm.V)))).invert().build()
      );
      ai.a.a()
         .a($$5)
         .a(am.a.b)
         .a(dac.px, xa.c("advancements.nether.distract_piglin.title"), xa.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", da.a.a($$18, Optional.of(cm.a.a().a($$3, axm.T).b()), Optional.of(by.a(by.a.a().a($$2, bxc.aS).a(bw.a.a().g(false))))))
         .a("distract_piglin_directly", dc.a.a(Optional.of($$18), cm.a.a().a($$3, cqn.c), Optional.of(by.a(by.a.a().a($$2, bxc.aS).a(bw.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
