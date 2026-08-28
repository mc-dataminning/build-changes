import java.util.Optional;
import java.util.function.Consumer;

public class mg implements mb {
   private static final bf a = bf.a(
      euk.a(eqw.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cug.pO)))).invert().build(),
      euk.a(eqw.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cug.pP)))).invert().build(),
      euk.a(eqw.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cug.pQ)))).invert().build(),
      euk.a(eqw.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cug.pR)))).invert().build()
   );

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfk.kL,
            wu.c("advancements.nether.root.title"),
            wu.c("advancements.nether.root.description"),
            new akk("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dcg.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cug.tX, wu.c("advancements.nether.return_to_sender.title"), wu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsn.T), bj.a.a().a(ea.a(avy.k)).a(bu.a.a().a(bsn.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dfk.fn, wu.c("advancements.nether.find_fortress.title"), wu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eir.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cug.uj, wu.c("advancements.nether.fast_travel.title"), wu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cug.sh, wu.c("advancements.nether.uneasy_alliance.title"), wu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsn.T).a(dc.a.a(dcg.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfk.gG, wu.c("advancements.nether.get_wither_skull.title"), wu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dfk.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cug.us, wu.c("advancements.nether.summon_wither.title"), wu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dz.a.a(bu.a.a().a(bsn.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cug.sg, wu.c("advancements.nether.obtain_blaze_rod.title"), wu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cug.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dfk.fO, wu.c("advancements.nether.create_beacon.title"), wu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dfk.fO,
            wu.c("advancements.nether.create_full_beacon.title"),
            wu.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", bd.a.a(de.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cug.sk, wu.c("advancements.nether.brew_potion.title"), wu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cug.qE, wu.c("advancements.nether.all_potions.title"), wu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brr.a)
                  .a(brr.b)
                  .a(brr.e)
                  .a(brr.h)
                  .a(brr.j)
                  .a(brr.l)
                  .a(brr.m)
                  .a(brr.n)
                  .a(brr.p)
                  .a(brr.r)
                  .a(brr.s)
                  .a(brr.B)
                  .a(brr.k)
                  .a(brr.L)
                  .a(brr.M)
                  .a(brr.J)
                  .a(brr.K)
            )
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cug.qy, wu.c("advancements.nether.all_effects.title"), wu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brr.a)
                  .a(brr.b)
                  .a(brr.e)
                  .a(brr.h)
                  .a(brr.j)
                  .a(brr.l)
                  .a(brr.m)
                  .a(brr.n)
                  .a(brr.p)
                  .a(brr.r)
                  .a(brr.s)
                  .a(brr.t)
                  .a(brr.c)
                  .a(brr.d)
                  .a(brr.y)
                  .a(brr.x)
                  .a(brr.v)
                  .a(brr.q)
                  .a(brr.i)
                  .a(brr.k)
                  .a(brr.B)
                  .a(brr.C)
                  .a(brr.D)
                  .a(brr.o)
                  .a(brr.E)
                  .a(brr.F)
                  .a(brr.G)
                  .a(brr.L)
                  .a(brr.M)
                  .a(brr.J)
                  .a(brr.K)
                  .a(brr.H)
                  .a(brr.I)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cug.aC,
            wu.c("advancements.nether.obtain_ancient_debris.title"),
            wu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cug.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cug.pT, wu.c("advancements.nether.netherite_armor.title"), wu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cug.pS, cug.pT, cug.pU, cug.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cug.wE, wu.c("advancements.nether.use_lodestone.title"), wu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dfk.pq)), cp.a.a().a(cug.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cug.wF,
            wu.c("advancements.nether.obtain_crying_obsidian.title"),
            wu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cug.wF))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cug.wS,
            wu.c("advancements.nether.charge_respawn_anchor.title"),
            wu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dfk.pl).a(dy.a.a().a(dlq.d, 4))), cp.a.a().a(dfk.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cug.nS, wu.c("advancements.nether.ride_strider.title"), wu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsn.aZ)))), Optional.of(cp.a.a().a(cug.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cug.nS,
            wu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dcg.h)).a(bu.a.a().a(bsn.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      me.a(ae.a.a(), $$0, ddu.a.a.a().toList())
         .a($$13)
         .a(cug.pV, wu.c("advancements.nether.explore_nether.title"), wu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cug.wO, wu.c("advancements.nether.find_bastion.title"), wu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eir.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dfk.cv, wu.c("advancements.nether.loot_bastion.title"), wu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqs.M))
         .a("loot_bastion_treasure", dd.a.a(eqs.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqs.O))
         .a("loot_bastion_bridge", dd.a.a(eqs.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cug.oJ, wu.c("advancements.nether.distract_piglin.title"), wu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", di.a.a(a, Optional.of(cp.a.a().a(awf.U).b()), Optional.of(bu.a(bu.a.a().a(bsn.aA).a(bs.a.a().g(false))))))
         .a("distract_piglin_directly", dk.a.a(Optional.of(a), cp.a.a().a(clc.c), Optional.of(bu.a(bu.a.a().a(bsn.aA).a(bs.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
