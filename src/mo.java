import java.util.Optional;
import java.util.function.Consumer;

public class mo implements mj {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bul<?>> $$2 = $$0.d(lz.z);
      jr<cvx> $$3 = $$0.d(lz.K);
      jr<die> $$4 = $$0.d(lz.f);
      ah $$5 = ag.a.a()
         .a(
            dig.kL,
            xi.c("advancements.nether.root.title"),
            xi.c("advancements.nether.root.description"),
            ali.b("textures/gui/advancements/backgrounds/nether.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_nether", ba.a.a(dfb.j))
         .a($$1, "nether/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwf.tY, xi.c("advancements.nether.return_to_sender.title"), xi.c("advancements.nether.return_to_sender.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bul.T), bl.a.a().a(eg.a(axc.j)).a(bw.a.a().a($$2, bul.ak))))
         .a($$1, "nether/return_to_sender");
      ah $$7 = ag.a.a()
         .a($$5)
         .a(dig.fn, xi.c("advancements.nether.find_fortress.title"), xi.c("advancements.nether.find_fortress.description"), null, an.a, true, true, false)
         .a("fortress", ds.a.a(dh.a.b($$0.d(lz.aS).b(elr.o))))
         .a($$1, "nether/find_fortress");
      ag.a.a()
         .a($$5)
         .a(cwf.ul, xi.c("advancements.nether.fast_travel.title"), xi.c("advancements.nether.fast_travel.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("travelled", bo.a.a(bn.a(dj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ag.a.a()
         .a($$6)
         .a(cwf.si, xi.c("advancements.nether.uneasy_alliance.title"), xi.c("advancements.nether.uneasy_alliance.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bul.T).a(dh.a.a(dfb.i))))
         .a($$1, "nether/uneasy_alliance");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(dig.gG, xi.c("advancements.nether.get_wither_skull.title"), xi.c("advancements.nether.get_wither_skull.description"), null, an.a, true, true, false)
         .a("wither_skull", ci.a.a(dig.gG))
         .a($$1, "nether/get_wither_skull");
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cwf.uu, xi.c("advancements.nether.summon_wither.title"), xi.c("advancements.nether.summon_wither.description"), null, an.a, true, true, false)
         .a("summoned", ef.a.a(bw.a.a().a($$2, bul.bp)))
         .a($$1, "nether/summon_wither");
      ah $$10 = ag.a.a()
         .a($$7)
         .a(cwf.sh, xi.c("advancements.nether.obtain_blaze_rod.title"), xi.c("advancements.nether.obtain_blaze_rod.description"), null, an.a, true, true, false)
         .a("blaze_rod", ci.a.a(cwf.sh))
         .a($$1, "nether/obtain_blaze_rod");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dig.fO, xi.c("advancements.nether.create_beacon.title"), xi.c("advancements.nether.create_beacon.description"), null, an.a, true, true, false)
         .a("beacon", bf.a.a(dj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ag.a.a()
         .a($$11)
         .a(
            dig.fO,
            xi.c("advancements.nether.create_full_beacon.title"),
            xi.c("advancements.nether.create_full_beacon.description"),
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
         .a(cwf.sm, xi.c("advancements.nether.brew_potion.title"), xi.c("advancements.nether.brew_potion.description"), null, an.a, true, true, false)
         .a("potion", az.a.b())
         .a($$1, "nether/brew_potion");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cwf.qF, xi.c("advancements.nether.all_potions.title"), xi.c("advancements.nether.all_potions.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(btl.a)
                  .a(btl.b)
                  .a(btl.e)
                  .a(btl.h)
                  .a(btl.j)
                  .a(btl.l)
                  .a(btl.m)
                  .a(btl.n)
                  .a(btl.p)
                  .a(btl.r)
                  .a(btl.s)
                  .a(btl.B)
                  .a(btl.k)
                  .a(btl.L)
                  .a(btl.M)
                  .a(btl.J)
                  .a(btl.K)
            )
         )
         .a($$1, "nether/all_potions");
      ag.a.a()
         .a($$13)
         .a(cwf.qz, xi.c("advancements.nether.all_effects.title"), xi.c("advancements.nether.all_effects.description"), null, an.b, true, true, true)
         .a(al.a.a(1000))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(btl.a)
                  .a(btl.b)
                  .a(btl.e)
                  .a(btl.h)
                  .a(btl.j)
                  .a(btl.l)
                  .a(btl.m)
                  .a(btl.n)
                  .a(btl.p)
                  .a(btl.r)
                  .a(btl.s)
                  .a(btl.t)
                  .a(btl.c)
                  .a(btl.d)
                  .a(btl.y)
                  .a(btl.x)
                  .a(btl.v)
                  .a(btl.q)
                  .a(btl.i)
                  .a(btl.k)
                  .a(btl.B)
                  .a(btl.C)
                  .a(btl.D)
                  .a(btl.o)
                  .a(btl.E)
                  .a(btl.F)
                  .a(btl.G)
                  .a(btl.L)
                  .a(btl.M)
                  .a(btl.J)
                  .a(btl.K)
                  .a(btl.H)
                  .a(btl.I)
            )
         )
         .a($$1, "nether/all_effects");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwf.aC,
            xi.c("advancements.nether.obtain_ancient_debris.title"),
            xi.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ci.a.a(cwf.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ag.a.a()
         .a($$14)
         .a(cwf.pU, xi.c("advancements.nether.netherite_armor.title"), xi.c("advancements.nether.netherite_armor.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_armor", ci.a.a(cwf.pT, cwf.pU, cwf.pV, cwf.pW))
         .a($$1, "nether/netherite_armor");
      ag.a.a()
         .a($$14)
         .a(cwf.wH, xi.c("advancements.nether.use_lodestone.title"), xi.c("advancements.nether.use_lodestone.description"), null, an.a, true, true, false)
         .a("use_lodestone", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dig.pq)), cu.a.a().a($$3, cwf.qT)))
         .a($$1, "nether/use_lodestone");
      ah $$15 = ag.a.a()
         .a($$5)
         .a(
            cwf.wI,
            xi.c("advancements.nether.obtain_crying_obsidian.title"),
            xi.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ci.a.a(cwf.wI))
         .a($$1, "nether/obtain_crying_obsidian");
      ag.a.a()
         .a($$15)
         .a(
            cwf.wV,
            xi.c("advancements.nether.charge_respawn_anchor.title"),
            xi.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dig.pl).a(ee.a.a().a(dom.d, 4))), cu.a.a().a($$3, dig.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ah $$16 = ag.a.a()
         .a($$5)
         .a(cwf.nS, xi.c("advancements.nether.ride_strider.title"), xi.c("advancements.nether.ride_strider.description"), null, an.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", co.a.a(Optional.of(bw.a(bw.a.a().a(bw.a.a().a($$2, bul.aZ)))), Optional.of(cu.a.a().a($$3, cwf.nS).b()), dj.d.c))
         .a($$1, "nether/ride_strider");
      ag.a.a()
         .a($$16)
         .a(
            cwf.nS,
            xi.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xi.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bo.a.a(bw.a.a().a(dh.a.a(dfb.i)).a(bw.a.a().a($$2, bul.aZ)), bn.a(dj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mm.a(ag.a.a(), $$0, dgq.a.a.a().toList())
         .a($$16)
         .a(cwf.pW, xi.c("advancements.nether.explore_nether.title"), xi.c("advancements.nether.explore_nether.description"), null, an.b, true, true, false)
         .a(al.a.a(500))
         .a($$1, "nether/explore_nether");
      ah $$17 = ag.a.a()
         .a($$5)
         .a(cwf.wR, xi.c("advancements.nether.find_bastion.title"), xi.c("advancements.nether.find_bastion.description"), null, an.a, true, true, false)
         .a("bastion", ds.a.a(dh.a.b($$0.d(lz.aS).b(elr.s))))
         .a($$1, "nether/find_bastion");
      ag.a.a()
         .a($$17)
         .a(dig.cv, xi.c("advancements.nether.loot_bastion.title"), xi.c("advancements.nether.loot_bastion.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("loot_bastion_other", di.a.a(ety.L))
         .a("loot_bastion_treasure", di.a.a(ety.K))
         .a("loot_bastion_hoglin_stable", di.a.a(ety.N))
         .a("loot_bastion_bridge", di.a.a(ety.M))
         .a($$1, "nether/loot_bastion");
      bh $$18 = bh.a(
         exq.a(euc.b.a, bw.a.a().a(bt.a.a().a(cu.a.a().a($$3, axj.W)))).invert().build(),
         exq.a(euc.b.a, bw.a.a().a(bt.a.a().b(cu.a.a().a($$3, axj.W)))).invert().build(),
         exq.a(euc.b.a, bw.a.a().a(bt.a.a().c(cu.a.a().a($$3, axj.W)))).invert().build(),
         exq.a(euc.b.a, bw.a.a().a(bt.a.a().d(cu.a.a().a($$3, axj.W)))).invert().build()
      );
      ag.a.a()
         .a($$5)
         .a(ak.a.b)
         .a(cwf.oK, xi.c("advancements.nether.distract_piglin.title"), xi.c("advancements.nether.distract_piglin.description"), null, an.a, true, true, false)
         .a("distract_piglin", dn.a.a($$18, Optional.of(cu.a.a().a($$3, axj.U).b()), Optional.of(bw.a(bw.a.a().a($$2, bul.aA).a(bu.a.a().g(false))))))
         .a("distract_piglin_directly", dq.a.a(Optional.of($$18), cu.a.a().a($$3, cnc.c), Optional.of(bw.a(bw.a.a().a($$2, bul.aA).a(bu.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
