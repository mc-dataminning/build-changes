import java.util.Optional;
import java.util.function.Consumer;

public class mp implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bup<?>> $$2 = $$0.d(ma.z);
      jr<cwb> $$3 = $$0.d(ma.K);
      jr<dij> $$4 = $$0.d(ma.f);
      ah $$5 = ag.a.a()
         .a(
            dil.kL,
            xl.c("advancements.nether.root.title"),
            xl.c("advancements.nether.root.description"),
            all.b("textures/gui/advancements/backgrounds/nether.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_nether", ba.a.a(dff.j))
         .a($$1, "nether/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwj.uo, xl.c("advancements.nether.return_to_sender.title"), xl.c("advancements.nether.return_to_sender.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bup.T), bl.a.a().a(eg.a(axf.j)).a(bw.a.a().a($$2, bup.ak))))
         .a($$1, "nether/return_to_sender");
      ah $$7 = ag.a.a()
         .a($$5)
         .a(dil.fn, xl.c("advancements.nether.find_fortress.title"), xl.c("advancements.nether.find_fortress.description"), null, an.a, true, true, false)
         .a("fortress", ds.a.a(dh.a.b($$0.d(ma.aS).b(elv.o))))
         .a($$1, "nether/find_fortress");
      ag.a.a()
         .a($$5)
         .a(cwj.uB, xl.c("advancements.nether.fast_travel.title"), xl.c("advancements.nether.fast_travel.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("travelled", bo.a.a(bn.a(dj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ag.a.a()
         .a($$6)
         .a(cwj.sy, xl.c("advancements.nether.uneasy_alliance.title"), xl.c("advancements.nether.uneasy_alliance.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bup.T).a(dh.a.a(dff.i))))
         .a($$1, "nether/uneasy_alliance");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(dil.gG, xl.c("advancements.nether.get_wither_skull.title"), xl.c("advancements.nether.get_wither_skull.description"), null, an.a, true, true, false)
         .a("wither_skull", ci.a.a(dil.gG))
         .a($$1, "nether/get_wither_skull");
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cwj.uK, xl.c("advancements.nether.summon_wither.title"), xl.c("advancements.nether.summon_wither.description"), null, an.a, true, true, false)
         .a("summoned", ef.a.a(bw.a.a().a($$2, bup.bp)))
         .a($$1, "nether/summon_wither");
      ah $$10 = ag.a.a()
         .a($$7)
         .a(cwj.sx, xl.c("advancements.nether.obtain_blaze_rod.title"), xl.c("advancements.nether.obtain_blaze_rod.description"), null, an.a, true, true, false)
         .a("blaze_rod", ci.a.a(cwj.sx))
         .a($$1, "nether/obtain_blaze_rod");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dil.fO, xl.c("advancements.nether.create_beacon.title"), xl.c("advancements.nether.create_beacon.description"), null, an.a, true, true, false)
         .a("beacon", bf.a.a(dj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ag.a.a()
         .a($$11)
         .a(
            dil.fO,
            xl.c("advancements.nether.create_full_beacon.title"),
            xl.c("advancements.nether.create_full_beacon.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("beacon", bf.a.a(dj.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ah $$12 = ag.a.a()
         .a($$10)
         .a(cwj.sC, xl.c("advancements.nether.brew_potion.title"), xl.c("advancements.nether.brew_potion.description"), null, an.a, true, true, false)
         .a("potion", az.a.b())
         .a($$1, "nether/brew_potion");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cwj.qF, xl.c("advancements.nether.all_potions.title"), xl.c("advancements.nether.all_potions.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(btp.a)
                  .a(btp.b)
                  .a(btp.e)
                  .a(btp.h)
                  .a(btp.j)
                  .a(btp.l)
                  .a(btp.m)
                  .a(btp.n)
                  .a(btp.p)
                  .a(btp.r)
                  .a(btp.s)
                  .a(btp.B)
                  .a(btp.k)
                  .a(btp.L)
                  .a(btp.M)
                  .a(btp.J)
                  .a(btp.K)
            )
         )
         .a($$1, "nether/all_potions");
      ag.a.a()
         .a($$13)
         .a(cwj.qz, xl.c("advancements.nether.all_effects.title"), xl.c("advancements.nether.all_effects.description"), null, an.b, true, true, true)
         .a(al.a.a(1000))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(btp.a)
                  .a(btp.b)
                  .a(btp.e)
                  .a(btp.h)
                  .a(btp.j)
                  .a(btp.l)
                  .a(btp.m)
                  .a(btp.n)
                  .a(btp.p)
                  .a(btp.r)
                  .a(btp.s)
                  .a(btp.t)
                  .a(btp.c)
                  .a(btp.d)
                  .a(btp.y)
                  .a(btp.x)
                  .a(btp.v)
                  .a(btp.q)
                  .a(btp.i)
                  .a(btp.k)
                  .a(btp.B)
                  .a(btp.C)
                  .a(btp.D)
                  .a(btp.o)
                  .a(btp.E)
                  .a(btp.F)
                  .a(btp.G)
                  .a(btp.L)
                  .a(btp.M)
                  .a(btp.J)
                  .a(btp.K)
                  .a(btp.H)
                  .a(btp.I)
            )
         )
         .a($$1, "nether/all_effects");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwj.aC,
            xl.c("advancements.nether.obtain_ancient_debris.title"),
            xl.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ci.a.a(cwj.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ag.a.a()
         .a($$14)
         .a(cwj.pU, xl.c("advancements.nether.netherite_armor.title"), xl.c("advancements.nether.netherite_armor.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_armor", ci.a.a(cwj.pT, cwj.pU, cwj.pV, cwj.pW))
         .a($$1, "nether/netherite_armor");
      ag.a.a()
         .a($$14)
         .a(cwj.wX, xl.c("advancements.nether.use_lodestone.title"), xl.c("advancements.nether.use_lodestone.description"), null, an.a, true, true, false)
         .a("use_lodestone", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dil.pq)), cu.a.a().a($$3, cwj.qT)))
         .a($$1, "nether/use_lodestone");
      ah $$15 = ag.a.a()
         .a($$5)
         .a(
            cwj.wY,
            xl.c("advancements.nether.obtain_crying_obsidian.title"),
            xl.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ci.a.a(cwj.wY))
         .a($$1, "nether/obtain_crying_obsidian");
      ag.a.a()
         .a($$15)
         .a(
            cwj.xl,
            xl.c("advancements.nether.charge_respawn_anchor.title"),
            xl.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dil.pl).a(ee.a.a().a(dor.d, 4))), cu.a.a().a($$3, dil.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ah $$16 = ag.a.a()
         .a($$5)
         .a(cwj.nS, xl.c("advancements.nether.ride_strider.title"), xl.c("advancements.nether.ride_strider.description"), null, an.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", co.a.a(Optional.of(bw.a(bw.a.a().a(bw.a.a().a($$2, bup.aZ)))), Optional.of(cu.a.a().a($$3, cwj.nS).b()), dj.d.c))
         .a($$1, "nether/ride_strider");
      ag.a.a()
         .a($$16)
         .a(
            cwj.nS,
            xl.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xl.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bo.a.a(bw.a.a().a(dh.a.a(dff.i)).a(bw.a.a().a($$2, bup.aZ)), bn.a(dj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mn.a(ag.a.a(), $$0, dgv.a.a.a().toList())
         .a($$16)
         .a(cwj.pW, xl.c("advancements.nether.explore_nether.title"), xl.c("advancements.nether.explore_nether.description"), null, an.b, true, true, false)
         .a(al.a.a(500))
         .a($$1, "nether/explore_nether");
      ah $$17 = ag.a.a()
         .a($$5)
         .a(cwj.xh, xl.c("advancements.nether.find_bastion.title"), xl.c("advancements.nether.find_bastion.description"), null, an.a, true, true, false)
         .a("bastion", ds.a.a(dh.a.b($$0.d(ma.aS).b(elv.s))))
         .a($$1, "nether/find_bastion");
      ag.a.a()
         .a($$17)
         .a(dil.cv, xl.c("advancements.nether.loot_bastion.title"), xl.c("advancements.nether.loot_bastion.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("loot_bastion_other", di.a.a(euc.L))
         .a("loot_bastion_treasure", di.a.a(euc.K))
         .a("loot_bastion_hoglin_stable", di.a.a(euc.N))
         .a("loot_bastion_bridge", di.a.a(euc.M))
         .a($$1, "nether/loot_bastion");
      bh $$18 = bh.a(
         exu.a(eug.b.a, bw.a.a().a(bt.a.a().a(cu.a.a().a($$3, axm.W)))).invert().build(),
         exu.a(eug.b.a, bw.a.a().a(bt.a.a().b(cu.a.a().a($$3, axm.W)))).invert().build(),
         exu.a(eug.b.a, bw.a.a().a(bt.a.a().c(cu.a.a().a($$3, axm.W)))).invert().build(),
         exu.a(eug.b.a, bw.a.a().a(bt.a.a().d(cu.a.a().a($$3, axm.W)))).invert().build()
      );
      ag.a.a()
         .a($$5)
         .a(ak.a.b)
         .a(cwj.oK, xl.c("advancements.nether.distract_piglin.title"), xl.c("advancements.nether.distract_piglin.description"), null, an.a, true, true, false)
         .a("distract_piglin", dn.a.a($$18, Optional.of(cu.a.a().a($$3, axm.U).b()), Optional.of(bw.a(bw.a.a().a($$2, bup.aA).a(bu.a.a().g(false))))))
         .a("distract_piglin_directly", dq.a.a(Optional.of($$18), cu.a.a().a($$3, cng.c), Optional.of(bw.a(bw.a.a().a($$2, bup.aA).a(bu.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
