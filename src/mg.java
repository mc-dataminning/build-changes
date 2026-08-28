import java.util.Optional;
import java.util.function.Consumer;

public class mg implements mb {
   private static final bf a = bf.a(
      euc.a(eqo.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cud.pO)))).invert().build(),
      euc.a(eqo.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cud.pP)))).invert().build(),
      euc.a(eqo.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cud.pQ)))).invert().build(),
      euc.a(eqo.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cud.pR)))).invert().build()
   );

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfh.kL,
            wu.c("advancements.nether.root.title"),
            wu.c("advancements.nether.root.description"),
            new akk("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dcd.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cud.tX, wu.c("advancements.nether.return_to_sender.title"), wu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsj.T), bj.a.a().a(ea.a(avw.k)).a(bu.a.a().a(bsj.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dfh.fn, wu.c("advancements.nether.find_fortress.title"), wu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eik.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cud.uj, wu.c("advancements.nether.fast_travel.title"), wu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cud.sh, wu.c("advancements.nether.uneasy_alliance.title"), wu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsj.T).a(dc.a.a(dcd.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfh.gG, wu.c("advancements.nether.get_wither_skull.title"), wu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dfh.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cud.us, wu.c("advancements.nether.summon_wither.title"), wu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dz.a.a(bu.a.a().a(bsj.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cud.sg, wu.c("advancements.nether.obtain_blaze_rod.title"), wu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cud.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dfh.fO, wu.c("advancements.nether.create_beacon.title"), wu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dfh.fO,
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
         .a(cud.sk, wu.c("advancements.nether.brew_potion.title"), wu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cud.qE, wu.c("advancements.nether.all_potions.title"), wu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brn.a)
                  .a(brn.b)
                  .a(brn.e)
                  .a(brn.h)
                  .a(brn.j)
                  .a(brn.l)
                  .a(brn.m)
                  .a(brn.n)
                  .a(brn.p)
                  .a(brn.r)
                  .a(brn.s)
                  .a(brn.B)
                  .a(brn.k)
                  .a(brn.L)
                  .a(brn.M)
                  .a(brn.J)
                  .a(brn.K)
            )
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cud.qy, wu.c("advancements.nether.all_effects.title"), wu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brn.a)
                  .a(brn.b)
                  .a(brn.e)
                  .a(brn.h)
                  .a(brn.j)
                  .a(brn.l)
                  .a(brn.m)
                  .a(brn.n)
                  .a(brn.p)
                  .a(brn.r)
                  .a(brn.s)
                  .a(brn.t)
                  .a(brn.c)
                  .a(brn.d)
                  .a(brn.y)
                  .a(brn.x)
                  .a(brn.v)
                  .a(brn.q)
                  .a(brn.i)
                  .a(brn.k)
                  .a(brn.B)
                  .a(brn.C)
                  .a(brn.D)
                  .a(brn.o)
                  .a(brn.E)
                  .a(brn.F)
                  .a(brn.G)
                  .a(brn.L)
                  .a(brn.M)
                  .a(brn.J)
                  .a(brn.K)
                  .a(brn.H)
                  .a(brn.I)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cud.aC,
            wu.c("advancements.nether.obtain_ancient_debris.title"),
            wu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cud.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cud.pT, wu.c("advancements.nether.netherite_armor.title"), wu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cud.pS, cud.pT, cud.pU, cud.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cud.wE, wu.c("advancements.nether.use_lodestone.title"), wu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dfh.pq)), cp.a.a().a(cud.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cud.wF,
            wu.c("advancements.nether.obtain_crying_obsidian.title"),
            wu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cud.wF))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cud.wS,
            wu.c("advancements.nether.charge_respawn_anchor.title"),
            wu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dfh.pl).a(dy.a.a().a(dln.d, 4))), cp.a.a().a(dfh.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cud.nS, wu.c("advancements.nether.ride_strider.title"), wu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsj.aZ)))), Optional.of(cp.a.a().a(cud.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cud.nS,
            wu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dcd.h)).a(bu.a.a().a(bsj.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      me.a(ae.a.a(), $$0, ddr.a.a.a().toList())
         .a($$13)
         .a(cud.pV, wu.c("advancements.nether.explore_nether.title"), wu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cud.wO, wu.c("advancements.nether.find_bastion.title"), wu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eik.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dfh.cv, wu.c("advancements.nether.loot_bastion.title"), wu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqk.M))
         .a("loot_bastion_treasure", dd.a.a(eqk.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqk.O))
         .a("loot_bastion_bridge", dd.a.a(eqk.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cud.oI, wu.c("advancements.nether.distract_piglin.title"), wu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", di.a.a(a, Optional.of(cp.a.a().a(awd.U).b()), Optional.of(bu.a(bu.a.a().a(bsj.aA).a(bs.a.a().g(false))))))
         .a("distract_piglin_directly", dk.a.a(Optional.of(a), cp.a.a().a(cky.c), Optional.of(bu.a(bu.a.a().a(bsj.aA).a(bs.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
