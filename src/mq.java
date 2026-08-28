import java.util.Optional;
import java.util.function.Consumer;

public class mq implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvq<?>> $$2 = $$0.d(mb.z);
      jr<cxk> $$3 = $$0.d(mb.K);
      jr<dkl> $$4 = $$0.d(mb.f);
      ah $$5 = ag.a.a()
         .a(
            dkn.lg,
            xv.c("advancements.nether.root.title"),
            xv.c("advancements.nether.root.description"),
            alz.b("textures/gui/advancements/backgrounds/nether.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_nether", ba.a.a(dhh.j))
         .a($$1, "nether/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cxs.uM, xv.c("advancements.nether.return_to_sender.title"), xv.c("advancements.nether.return_to_sender.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bvq.ae), bl.a.a().a(eg.a(axw.j)).a(bw.a.a().a($$2, bvq.Z))))
         .a($$1, "nether/return_to_sender");
      ah $$7 = ag.a.a()
         .a($$5)
         .a(dkn.fB, xv.c("advancements.nether.find_fortress.title"), xv.c("advancements.nether.find_fortress.description"), null, an.a, true, true, false)
         .a("fortress", ds.a.a(dh.a.b($$0.d(mb.aU).b(eod.o))))
         .a($$1, "nether/find_fortress");
      ag.a.a()
         .a($$5)
         .a(cxs.uZ, xv.c("advancements.nether.fast_travel.title"), xv.c("advancements.nether.fast_travel.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("travelled", bo.a.a(bn.a(dj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ag.a.a()
         .a($$6)
         .a(cxs.sV, xv.c("advancements.nether.uneasy_alliance.title"), xv.c("advancements.nether.uneasy_alliance.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bvq.ae).a(dh.a.a(dhh.i))))
         .a($$1, "nether/uneasy_alliance");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(dkn.gW, xv.c("advancements.nether.get_wither_skull.title"), xv.c("advancements.nether.get_wither_skull.description"), null, an.a, true, true, false)
         .a("wither_skull", ci.a.a(dkn.gW))
         .a($$1, "nether/get_wither_skull");
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cxs.vi, xv.c("advancements.nether.summon_wither.title"), xv.c("advancements.nether.summon_wither.description"), null, an.a, true, true, false)
         .a("summoned", ef.a.a(bw.a.a().a($$2, bvq.bJ)))
         .a($$1, "nether/summon_wither");
      ah $$10 = ag.a.a()
         .a($$7)
         .a(cxs.sU, xv.c("advancements.nether.obtain_blaze_rod.title"), xv.c("advancements.nether.obtain_blaze_rod.description"), null, an.a, true, true, false)
         .a("blaze_rod", ci.a.a(cxs.sU))
         .a($$1, "nether/obtain_blaze_rod");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dkn.gc, xv.c("advancements.nether.create_beacon.title"), xv.c("advancements.nether.create_beacon.description"), null, an.a, true, true, false)
         .a("beacon", bf.a.a(dj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ag.a.a()
         .a($$11)
         .a(
            dkn.gc,
            xv.c("advancements.nether.create_full_beacon.title"),
            xv.c("advancements.nether.create_full_beacon.description"),
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
         .a(cxs.sZ, xv.c("advancements.nether.brew_potion.title"), xv.c("advancements.nether.brew_potion.description"), null, an.a, true, true, false)
         .a("potion", az.a.b())
         .a($$1, "nether/brew_potion");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cxs.rc, xv.c("advancements.nether.all_potions.title"), xv.c("advancements.nether.all_potions.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(buq.a)
                  .a(buq.b)
                  .a(buq.e)
                  .a(buq.h)
                  .a(buq.j)
                  .a(buq.l)
                  .a(buq.m)
                  .a(buq.n)
                  .a(buq.p)
                  .a(buq.r)
                  .a(buq.s)
                  .a(buq.B)
                  .a(buq.k)
                  .a(buq.L)
                  .a(buq.M)
                  .a(buq.J)
                  .a(buq.K)
            )
         )
         .a($$1, "nether/all_potions");
      ag.a.a()
         .a($$13)
         .a(cxs.qW, xv.c("advancements.nether.all_effects.title"), xv.c("advancements.nether.all_effects.description"), null, an.b, true, true, true)
         .a(al.a.a(1000))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(buq.a)
                  .a(buq.b)
                  .a(buq.e)
                  .a(buq.h)
                  .a(buq.j)
                  .a(buq.l)
                  .a(buq.m)
                  .a(buq.n)
                  .a(buq.p)
                  .a(buq.r)
                  .a(buq.s)
                  .a(buq.t)
                  .a(buq.c)
                  .a(buq.d)
                  .a(buq.y)
                  .a(buq.x)
                  .a(buq.v)
                  .a(buq.q)
                  .a(buq.i)
                  .a(buq.k)
                  .a(buq.B)
                  .a(buq.C)
                  .a(buq.D)
                  .a(buq.o)
                  .a(buq.E)
                  .a(buq.F)
                  .a(buq.G)
                  .a(buq.L)
                  .a(buq.M)
                  .a(buq.J)
                  .a(buq.K)
                  .a(buq.H)
                  .a(buq.I)
            )
         )
         .a($$1, "nether/all_effects");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cxs.aE,
            xv.c("advancements.nether.obtain_ancient_debris.title"),
            xv.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ci.a.a(cxs.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ag.a.a()
         .a($$14)
         .a(cxs.qp, xv.c("advancements.nether.netherite_armor.title"), xv.c("advancements.nether.netherite_armor.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_armor", ci.a.a(cxs.qo, cxs.qp, cxs.qq, cxs.qr))
         .a($$1, "nether/netherite_armor");
      ag.a.a()
         .a($$14)
         .a(cxs.xv, xv.c("advancements.nether.use_lodestone.title"), xv.c("advancements.nether.use_lodestone.description"), null, an.a, true, true, false)
         .a("use_lodestone", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkn.pL)), cu.a.a().a($$3, cxs.rq)))
         .a($$1, "nether/use_lodestone");
      ah $$15 = ag.a.a()
         .a($$5)
         .a(
            cxs.xw,
            xv.c("advancements.nether.obtain_crying_obsidian.title"),
            xv.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ci.a.a(cxs.xw))
         .a($$1, "nether/obtain_crying_obsidian");
      ag.a.a()
         .a($$15)
         .a(
            cxs.xJ,
            xv.c("advancements.nether.charge_respawn_anchor.title"),
            xv.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkn.pG).a(ee.a.a().a(dqw.d, 4))), cu.a.a().a($$3, dkn.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ah $$16 = ag.a.a()
         .a($$5)
         .a(cxs.ol, xv.c("advancements.nether.ride_strider.title"), xv.c("advancements.nether.ride_strider.description"), null, an.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", co.a.a(Optional.of(bw.a(bw.a.a().a(bw.a.a().a($$2, bvq.bt)))), Optional.of(cu.a.a().a($$3, cxs.ol).b()), dj.d.c))
         .a($$1, "nether/ride_strider");
      ag.a.a()
         .a($$16)
         .a(
            cxs.ol,
            xv.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xv.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bo.a.a(bw.a.a().a(dh.a.a(dhh.i)).a(bw.a.a().a($$2, bvq.bt)), bn.a(dj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mo.a(ag.a.a(), $$0, dix.a.a.a().toList())
         .a($$16)
         .a(cxs.qr, xv.c("advancements.nether.explore_nether.title"), xv.c("advancements.nether.explore_nether.description"), null, an.b, true, true, false)
         .a(al.a.a(500))
         .a($$1, "nether/explore_nether");
      ah $$17 = ag.a.a()
         .a($$5)
         .a(cxs.xF, xv.c("advancements.nether.find_bastion.title"), xv.c("advancements.nether.find_bastion.description"), null, an.a, true, true, false)
         .a("bastion", ds.a.a(dh.a.b($$0.d(mb.aU).b(eod.s))))
         .a($$1, "nether/find_bastion");
      ag.a.a()
         .a($$17)
         .a(dkn.cD, xv.c("advancements.nether.loot_bastion.title"), xv.c("advancements.nether.loot_bastion.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("loot_bastion_other", di.a.a(ewk.L))
         .a("loot_bastion_treasure", di.a.a(ewk.K))
         .a("loot_bastion_hoglin_stable", di.a.a(ewk.N))
         .a("loot_bastion_bridge", di.a.a(ewk.M))
         .a($$1, "nether/loot_bastion");
      bh $$18 = bh.a(
         faa.a(ewo.b.a, bw.a.a().a(bt.a.a().a(cu.a.a().a($$3, ayd.X)))).invert().build(),
         faa.a(ewo.b.a, bw.a.a().a(bt.a.a().b(cu.a.a().a($$3, ayd.X)))).invert().build(),
         faa.a(ewo.b.a, bw.a.a().a(bt.a.a().c(cu.a.a().a($$3, ayd.X)))).invert().build(),
         faa.a(ewo.b.a, bw.a.a().a(bt.a.a().d(cu.a.a().a($$3, ayd.X)))).invert().build()
      );
      ag.a.a()
         .a($$5)
         .a(ak.a.b)
         .a(cxs.pf, xv.c("advancements.nether.distract_piglin.title"), xv.c("advancements.nether.distract_piglin.description"), null, an.a, true, true, false)
         .a("distract_piglin", dn.a.a($$18, Optional.of(cu.a.a().a($$3, ayd.V).b()), Optional.of(bw.a(bw.a.a().a($$2, bvq.aS).a(bu.a.a().g(false))))))
         .a("distract_piglin_directly", dq.a.a(Optional.of($$18), cu.a.a().a($$3, col.c), Optional.of(bw.a(bw.a.a().a($$2, bvq.aS).a(bu.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
