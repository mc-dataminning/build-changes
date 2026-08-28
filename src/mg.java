import java.util.Optional;
import java.util.function.Consumer;

public class mg implements mb {
   private static final bf a = bf.a(
      eui.a(equ.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cuf.pO)))).invert().build(),
      eui.a(equ.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cuf.pP)))).invert().build(),
      eui.a(equ.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cuf.pQ)))).invert().build(),
      eui.a(equ.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cuf.pR)))).invert().build()
   );

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfj.kL,
            wu.c("advancements.nether.root.title"),
            wu.c("advancements.nether.root.description"),
            new akk("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dcf.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuf.tX, wu.c("advancements.nether.return_to_sender.title"), wu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsm.T), bj.a.a().a(ea.a(avy.k)).a(bu.a.a().a(bsm.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dfj.fn, wu.c("advancements.nether.find_fortress.title"), wu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eiq.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cuf.uj, wu.c("advancements.nether.fast_travel.title"), wu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cuf.sh, wu.c("advancements.nether.uneasy_alliance.title"), wu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsm.T).a(dc.a.a(dcf.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfj.gG, wu.c("advancements.nether.get_wither_skull.title"), wu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dfj.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cuf.us, wu.c("advancements.nether.summon_wither.title"), wu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dz.a.a(bu.a.a().a(bsm.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cuf.sg, wu.c("advancements.nether.obtain_blaze_rod.title"), wu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cuf.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dfj.fO, wu.c("advancements.nether.create_beacon.title"), wu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dfj.fO,
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
         .a(cuf.sk, wu.c("advancements.nether.brew_potion.title"), wu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cuf.qE, wu.c("advancements.nether.all_potions.title"), wu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brq.a)
                  .a(brq.b)
                  .a(brq.e)
                  .a(brq.h)
                  .a(brq.j)
                  .a(brq.l)
                  .a(brq.m)
                  .a(brq.n)
                  .a(brq.p)
                  .a(brq.r)
                  .a(brq.s)
                  .a(brq.B)
                  .a(brq.k)
                  .a(brq.L)
                  .a(brq.M)
                  .a(brq.J)
                  .a(brq.K)
            )
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cuf.qy, wu.c("advancements.nether.all_effects.title"), wu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brq.a)
                  .a(brq.b)
                  .a(brq.e)
                  .a(brq.h)
                  .a(brq.j)
                  .a(brq.l)
                  .a(brq.m)
                  .a(brq.n)
                  .a(brq.p)
                  .a(brq.r)
                  .a(brq.s)
                  .a(brq.t)
                  .a(brq.c)
                  .a(brq.d)
                  .a(brq.y)
                  .a(brq.x)
                  .a(brq.v)
                  .a(brq.q)
                  .a(brq.i)
                  .a(brq.k)
                  .a(brq.B)
                  .a(brq.C)
                  .a(brq.D)
                  .a(brq.o)
                  .a(brq.E)
                  .a(brq.F)
                  .a(brq.G)
                  .a(brq.L)
                  .a(brq.M)
                  .a(brq.J)
                  .a(brq.K)
                  .a(brq.H)
                  .a(brq.I)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cuf.aC,
            wu.c("advancements.nether.obtain_ancient_debris.title"),
            wu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cuf.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cuf.pT, wu.c("advancements.nether.netherite_armor.title"), wu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cuf.pS, cuf.pT, cuf.pU, cuf.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cuf.wE, wu.c("advancements.nether.use_lodestone.title"), wu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dfj.pq)), cp.a.a().a(cuf.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cuf.wF,
            wu.c("advancements.nether.obtain_crying_obsidian.title"),
            wu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cuf.wF))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cuf.wS,
            wu.c("advancements.nether.charge_respawn_anchor.title"),
            wu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dfj.pl).a(dy.a.a().a(dlp.d, 4))), cp.a.a().a(dfj.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cuf.nS, wu.c("advancements.nether.ride_strider.title"), wu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsm.aZ)))), Optional.of(cp.a.a().a(cuf.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cuf.nS,
            wu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dcf.h)).a(bu.a.a().a(bsm.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      me.a(ae.a.a(), $$0, ddt.a.a.a().toList())
         .a($$13)
         .a(cuf.pV, wu.c("advancements.nether.explore_nether.title"), wu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cuf.wO, wu.c("advancements.nether.find_bastion.title"), wu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eiq.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dfj.cv, wu.c("advancements.nether.loot_bastion.title"), wu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqq.M))
         .a("loot_bastion_treasure", dd.a.a(eqq.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqq.O))
         .a("loot_bastion_bridge", dd.a.a(eqq.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cuf.oJ, wu.c("advancements.nether.distract_piglin.title"), wu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", di.a.a(a, Optional.of(cp.a.a().a(awf.U).b()), Optional.of(bu.a(bu.a.a().a(bsm.aA).a(bs.a.a().g(false))))))
         .a("distract_piglin_directly", dk.a.a(Optional.of(a), cp.a.a().a(clb.c), Optional.of(bu.a(bu.a.a().a(bsm.aA).a(bs.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
