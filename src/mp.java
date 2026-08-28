import java.util.Optional;
import java.util.function.Consumer;

public class mp implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bus<?>> $$2 = $$0.d(ma.z);
      jr<cwi> $$3 = $$0.d(ma.K);
      jr<diq> $$4 = $$0.d(ma.f);
      ah $$5 = ag.a.a()
         .a(
            dis.kL,
            xj.c("advancements.nether.root.title"),
            xj.c("advancements.nether.root.description"),
            alj.b("textures/gui/advancements/backgrounds/nether.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_nether", ba.a.a(dfm.j))
         .a($$1, "nether/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwq.uo, xj.c("advancements.nether.return_to_sender.title"), xj.c("advancements.nether.return_to_sender.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bus.ac), bl.a.a().a(eg.a(axe.j)).a(bw.a.a().a($$2, bus.X))))
         .a($$1, "nether/return_to_sender");
      ah $$7 = ag.a.a()
         .a($$5)
         .a(dis.fn, xj.c("advancements.nether.find_fortress.title"), xj.c("advancements.nether.find_fortress.description"), null, an.a, true, true, false)
         .a("fortress", ds.a.a(dh.a.b($$0.d(ma.aS).b(emc.o))))
         .a($$1, "nether/find_fortress");
      ag.a.a()
         .a($$5)
         .a(cwq.uB, xj.c("advancements.nether.fast_travel.title"), xj.c("advancements.nether.fast_travel.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("travelled", bo.a.a(bn.a(dj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ag.a.a()
         .a($$6)
         .a(cwq.sy, xj.c("advancements.nether.uneasy_alliance.title"), xj.c("advancements.nether.uneasy_alliance.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bus.ac).a(dh.a.a(dfm.i))))
         .a($$1, "nether/uneasy_alliance");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(dis.gG, xj.c("advancements.nether.get_wither_skull.title"), xj.c("advancements.nether.get_wither_skull.description"), null, an.a, true, true, false)
         .a("wither_skull", ci.a.a(dis.gG))
         .a($$1, "nether/get_wither_skull");
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cwq.uK, xj.c("advancements.nether.summon_wither.title"), xj.c("advancements.nether.summon_wither.description"), null, an.a, true, true, false)
         .a("summoned", ef.a.a(bw.a.a().a($$2, bus.bF)))
         .a($$1, "nether/summon_wither");
      ah $$10 = ag.a.a()
         .a($$7)
         .a(cwq.sx, xj.c("advancements.nether.obtain_blaze_rod.title"), xj.c("advancements.nether.obtain_blaze_rod.description"), null, an.a, true, true, false)
         .a("blaze_rod", ci.a.a(cwq.sx))
         .a($$1, "nether/obtain_blaze_rod");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dis.fO, xj.c("advancements.nether.create_beacon.title"), xj.c("advancements.nether.create_beacon.description"), null, an.a, true, true, false)
         .a("beacon", bf.a.a(dj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ag.a.a()
         .a($$11)
         .a(
            dis.fO,
            xj.c("advancements.nether.create_full_beacon.title"),
            xj.c("advancements.nether.create_full_beacon.description"),
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
         .a(cwq.sC, xj.c("advancements.nether.brew_potion.title"), xj.c("advancements.nether.brew_potion.description"), null, an.a, true, true, false)
         .a("potion", az.a.b())
         .a($$1, "nether/brew_potion");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cwq.qF, xj.c("advancements.nether.all_potions.title"), xj.c("advancements.nether.all_potions.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(bts.a)
                  .a(bts.b)
                  .a(bts.e)
                  .a(bts.h)
                  .a(bts.j)
                  .a(bts.l)
                  .a(bts.m)
                  .a(bts.n)
                  .a(bts.p)
                  .a(bts.r)
                  .a(bts.s)
                  .a(bts.B)
                  .a(bts.k)
                  .a(bts.L)
                  .a(bts.M)
                  .a(bts.J)
                  .a(bts.K)
            )
         )
         .a($$1, "nether/all_potions");
      ag.a.a()
         .a($$13)
         .a(cwq.qz, xj.c("advancements.nether.all_effects.title"), xj.c("advancements.nether.all_effects.description"), null, an.b, true, true, true)
         .a(al.a.a(1000))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(bts.a)
                  .a(bts.b)
                  .a(bts.e)
                  .a(bts.h)
                  .a(bts.j)
                  .a(bts.l)
                  .a(bts.m)
                  .a(bts.n)
                  .a(bts.p)
                  .a(bts.r)
                  .a(bts.s)
                  .a(bts.t)
                  .a(bts.c)
                  .a(bts.d)
                  .a(bts.y)
                  .a(bts.x)
                  .a(bts.v)
                  .a(bts.q)
                  .a(bts.i)
                  .a(bts.k)
                  .a(bts.B)
                  .a(bts.C)
                  .a(bts.D)
                  .a(bts.o)
                  .a(bts.E)
                  .a(bts.F)
                  .a(bts.G)
                  .a(bts.L)
                  .a(bts.M)
                  .a(bts.J)
                  .a(bts.K)
                  .a(bts.H)
                  .a(bts.I)
            )
         )
         .a($$1, "nether/all_effects");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwq.aC,
            xj.c("advancements.nether.obtain_ancient_debris.title"),
            xj.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ci.a.a(cwq.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ag.a.a()
         .a($$14)
         .a(cwq.pU, xj.c("advancements.nether.netherite_armor.title"), xj.c("advancements.nether.netherite_armor.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_armor", ci.a.a(cwq.pT, cwq.pU, cwq.pV, cwq.pW))
         .a($$1, "nether/netherite_armor");
      ag.a.a()
         .a($$14)
         .a(cwq.wX, xj.c("advancements.nether.use_lodestone.title"), xj.c("advancements.nether.use_lodestone.description"), null, an.a, true, true, false)
         .a("use_lodestone", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dis.pq)), cu.a.a().a($$3, cwq.qT)))
         .a($$1, "nether/use_lodestone");
      ah $$15 = ag.a.a()
         .a($$5)
         .a(
            cwq.wY,
            xj.c("advancements.nether.obtain_crying_obsidian.title"),
            xj.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ci.a.a(cwq.wY))
         .a($$1, "nether/obtain_crying_obsidian");
      ag.a.a()
         .a($$15)
         .a(
            cwq.xl,
            xj.c("advancements.nether.charge_respawn_anchor.title"),
            xj.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dis.pl).a(ee.a.a().a(doy.d, 4))), cu.a.a().a($$3, dis.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ah $$16 = ag.a.a()
         .a($$5)
         .a(cwq.nS, xj.c("advancements.nether.ride_strider.title"), xj.c("advancements.nether.ride_strider.description"), null, an.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", co.a.a(Optional.of(bw.a(bw.a.a().a(bw.a.a().a($$2, bus.bp)))), Optional.of(cu.a.a().a($$3, cwq.nS).b()), dj.d.c))
         .a($$1, "nether/ride_strider");
      ag.a.a()
         .a($$16)
         .a(
            cwq.nS,
            xj.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xj.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bo.a.a(bw.a.a().a(dh.a.a(dfm.i)).a(bw.a.a().a($$2, bus.bp)), bn.a(dj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mn.a(ag.a.a(), $$0, dhc.a.a.a().toList())
         .a($$16)
         .a(cwq.pW, xj.c("advancements.nether.explore_nether.title"), xj.c("advancements.nether.explore_nether.description"), null, an.b, true, true, false)
         .a(al.a.a(500))
         .a($$1, "nether/explore_nether");
      ah $$17 = ag.a.a()
         .a($$5)
         .a(cwq.xh, xj.c("advancements.nether.find_bastion.title"), xj.c("advancements.nether.find_bastion.description"), null, an.a, true, true, false)
         .a("bastion", ds.a.a(dh.a.b($$0.d(ma.aS).b(emc.s))))
         .a($$1, "nether/find_bastion");
      ag.a.a()
         .a($$17)
         .a(dis.cv, xj.c("advancements.nether.loot_bastion.title"), xj.c("advancements.nether.loot_bastion.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("loot_bastion_other", di.a.a(euj.L))
         .a("loot_bastion_treasure", di.a.a(euj.K))
         .a("loot_bastion_hoglin_stable", di.a.a(euj.N))
         .a("loot_bastion_bridge", di.a.a(euj.M))
         .a($$1, "nether/loot_bastion");
      bh $$18 = bh.a(
         eyb.a(eun.b.a, bw.a.a().a(bt.a.a().a(cu.a.a().a($$3, axl.W)))).invert().build(),
         eyb.a(eun.b.a, bw.a.a().a(bt.a.a().b(cu.a.a().a($$3, axl.W)))).invert().build(),
         eyb.a(eun.b.a, bw.a.a().a(bt.a.a().c(cu.a.a().a($$3, axl.W)))).invert().build(),
         eyb.a(eun.b.a, bw.a.a().a(bt.a.a().d(cu.a.a().a($$3, axl.W)))).invert().build()
      );
      ag.a.a()
         .a($$5)
         .a(ak.a.b)
         .a(cwq.oK, xj.c("advancements.nether.distract_piglin.title"), xj.c("advancements.nether.distract_piglin.description"), null, an.a, true, true, false)
         .a("distract_piglin", dn.a.a($$18, Optional.of(cu.a.a().a($$3, axl.U).b()), Optional.of(bw.a(bw.a.a().a($$2, bus.aO).a(bu.a.a().g(false))))))
         .a("distract_piglin_directly", dq.a.a(Optional.of($$18), cu.a.a().a($$3, cnj.c), Optional.of(bw.a(bw.a.a().a($$2, bus.aO).a(bu.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
