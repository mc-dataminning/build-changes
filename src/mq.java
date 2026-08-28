import java.util.Optional;
import java.util.function.Consumer;

public class mq implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvi<?>> $$2 = $$0.d(mb.z);
      jr<cxc> $$3 = $$0.d(mb.K);
      jr<dkd> $$4 = $$0.d(mb.f);
      ah $$5 = ag.a.a()
         .a(
            dkf.ln,
            xk.c("advancements.nether.root.title"),
            xk.c("advancements.nether.root.description"),
            alp.b("textures/gui/advancements/backgrounds/nether.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_nether", ba.a.a(dgz.j))
         .a($$1, "nether/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cxk.uV, xk.c("advancements.nether.return_to_sender.title"), xk.c("advancements.nether.return_to_sender.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bvi.ae), bl.a.a().a(eg.a(axm.j)).a(bw.a.a().a($$2, bvi.Z))))
         .a($$1, "nether/return_to_sender");
      ah $$7 = ag.a.a()
         .a($$5)
         .a(dkf.fI, xk.c("advancements.nether.find_fortress.title"), xk.c("advancements.nether.find_fortress.description"), null, an.a, true, true, false)
         .a("fortress", ds.a.a(dh.a.b($$0.d(mb.aU).b(enx.o))))
         .a($$1, "nether/find_fortress");
      ag.a.a()
         .a($$5)
         .a(cxk.vi, xk.c("advancements.nether.fast_travel.title"), xk.c("advancements.nether.fast_travel.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("travelled", bo.a.a(bn.a(dj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ag.a.a()
         .a($$6)
         .a(cxk.te, xk.c("advancements.nether.uneasy_alliance.title"), xk.c("advancements.nether.uneasy_alliance.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("killed_ghast", dc.a.a(bw.a.a().a($$2, bvi.ae).a(dh.a.a(dgz.i))))
         .a($$1, "nether/uneasy_alliance");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(dkf.hd, xk.c("advancements.nether.get_wither_skull.title"), xk.c("advancements.nether.get_wither_skull.description"), null, an.a, true, true, false)
         .a("wither_skull", ci.a.a(dkf.hd))
         .a($$1, "nether/get_wither_skull");
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cxk.vr, xk.c("advancements.nether.summon_wither.title"), xk.c("advancements.nether.summon_wither.description"), null, an.a, true, true, false)
         .a("summoned", ef.a.a(bw.a.a().a($$2, bvi.bJ)))
         .a($$1, "nether/summon_wither");
      ah $$10 = ag.a.a()
         .a($$7)
         .a(cxk.td, xk.c("advancements.nether.obtain_blaze_rod.title"), xk.c("advancements.nether.obtain_blaze_rod.description"), null, an.a, true, true, false)
         .a("blaze_rod", ci.a.a(cxk.td))
         .a($$1, "nether/obtain_blaze_rod");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dkf.gj, xk.c("advancements.nether.create_beacon.title"), xk.c("advancements.nether.create_beacon.description"), null, an.a, true, true, false)
         .a("beacon", bf.a.a(dj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ag.a.a()
         .a($$11)
         .a(
            dkf.gj,
            xk.c("advancements.nether.create_full_beacon.title"),
            xk.c("advancements.nether.create_full_beacon.description"),
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
         .a(cxk.ti, xk.c("advancements.nether.brew_potion.title"), xk.c("advancements.nether.brew_potion.description"), null, an.a, true, true, false)
         .a("potion", az.a.b())
         .a($$1, "nether/brew_potion");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cxk.rl, xk.c("advancements.nether.all_potions.title"), xk.c("advancements.nether.all_potions.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(bui.a)
                  .a(bui.b)
                  .a(bui.e)
                  .a(bui.h)
                  .a(bui.j)
                  .a(bui.l)
                  .a(bui.m)
                  .a(bui.n)
                  .a(bui.p)
                  .a(bui.r)
                  .a(bui.s)
                  .a(bui.B)
                  .a(bui.k)
                  .a(bui.L)
                  .a(bui.M)
                  .a(bui.J)
                  .a(bui.K)
            )
         )
         .a($$1, "nether/all_potions");
      ag.a.a()
         .a($$13)
         .a(cxk.rf, xk.c("advancements.nether.all_effects.title"), xk.c("advancements.nether.all_effects.description"), null, an.b, true, true, true)
         .a(al.a.a(1000))
         .a(
            "all_effects",
            bp.a.a(
               dk.a.a()
                  .a(bui.a)
                  .a(bui.b)
                  .a(bui.e)
                  .a(bui.h)
                  .a(bui.j)
                  .a(bui.l)
                  .a(bui.m)
                  .a(bui.n)
                  .a(bui.p)
                  .a(bui.r)
                  .a(bui.s)
                  .a(bui.t)
                  .a(bui.c)
                  .a(bui.d)
                  .a(bui.y)
                  .a(bui.x)
                  .a(bui.v)
                  .a(bui.q)
                  .a(bui.i)
                  .a(bui.k)
                  .a(bui.B)
                  .a(bui.C)
                  .a(bui.D)
                  .a(bui.o)
                  .a(bui.E)
                  .a(bui.F)
                  .a(bui.G)
                  .a(bui.L)
                  .a(bui.M)
                  .a(bui.J)
                  .a(bui.K)
                  .a(bui.H)
                  .a(bui.I)
            )
         )
         .a($$1, "nether/all_effects");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cxk.aE,
            xk.c("advancements.nether.obtain_ancient_debris.title"),
            xk.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ci.a.a(cxk.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ag.a.a()
         .a($$14)
         .a(cxk.qy, xk.c("advancements.nether.netherite_armor.title"), xk.c("advancements.nether.netherite_armor.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a("netherite_armor", ci.a.a(cxk.qx, cxk.qy, cxk.qz, cxk.qA))
         .a($$1, "nether/netherite_armor");
      ag.a.a()
         .a($$14)
         .a(cxk.xF, xk.c("advancements.nether.use_lodestone.title"), xk.c("advancements.nether.use_lodestone.description"), null, an.a, true, true, false)
         .a("use_lodestone", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkf.pS)), cu.a.a().a($$3, cxk.rz)))
         .a($$1, "nether/use_lodestone");
      ah $$15 = ag.a.a()
         .a($$5)
         .a(
            cxk.xG,
            xk.c("advancements.nether.obtain_crying_obsidian.title"),
            xk.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ci.a.a(cxk.xG))
         .a($$1, "nether/obtain_crying_obsidian");
      ag.a.a()
         .a($$15)
         .a(
            cxk.xT,
            xk.c("advancements.nether.charge_respawn_anchor.title"),
            xk.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkf.pN).a(ee.a.a().a(dqq.d, 4))), cu.a.a().a($$3, dkf.ep)))
         .a($$1, "nether/charge_respawn_anchor");
      ah $$16 = ag.a.a()
         .a($$5)
         .a(cxk.ou, xk.c("advancements.nether.ride_strider.title"), xk.c("advancements.nether.ride_strider.description"), null, an.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", co.a.a(Optional.of(bw.a(bw.a.a().a(bw.a.a().a($$2, bvi.bt)))), Optional.of(cu.a.a().a($$3, cxk.ou).b()), dj.d.c))
         .a($$1, "nether/ride_strider");
      ag.a.a()
         .a($$16)
         .a(
            cxk.ou,
            xk.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xk.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bo.a.a(bw.a.a().a(dh.a.a(dgz.i)).a(bw.a.a().a($$2, bvi.bt)), bn.a(dj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mo.a(ag.a.a(), $$0, dip.a.a.a().toList())
         .a($$16)
         .a(cxk.qA, xk.c("advancements.nether.explore_nether.title"), xk.c("advancements.nether.explore_nether.description"), null, an.b, true, true, false)
         .a(al.a.a(500))
         .a($$1, "nether/explore_nether");
      ah $$17 = ag.a.a()
         .a($$5)
         .a(cxk.xP, xk.c("advancements.nether.find_bastion.title"), xk.c("advancements.nether.find_bastion.description"), null, an.a, true, true, false)
         .a("bastion", ds.a.a(dh.a.b($$0.d(mb.aU).b(enx.s))))
         .a($$1, "nether/find_bastion");
      ag.a.a()
         .a($$17)
         .a(dkf.cD, xk.c("advancements.nether.loot_bastion.title"), xk.c("advancements.nether.loot_bastion.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("loot_bastion_other", di.a.a(ewe.L))
         .a("loot_bastion_treasure", di.a.a(ewe.K))
         .a("loot_bastion_hoglin_stable", di.a.a(ewe.N))
         .a("loot_bastion_bridge", di.a.a(ewe.M))
         .a($$1, "nether/loot_bastion");
      bh $$18 = bh.a(
         ezu.a(ewi.b.a, bw.a.a().a(bt.a.a().a(cu.a.a().a($$3, axt.X)))).invert().build(),
         ezu.a(ewi.b.a, bw.a.a().a(bt.a.a().b(cu.a.a().a($$3, axt.X)))).invert().build(),
         ezu.a(ewi.b.a, bw.a.a().a(bt.a.a().c(cu.a.a().a($$3, axt.X)))).invert().build(),
         ezu.a(ewi.b.a, bw.a.a().a(bt.a.a().d(cu.a.a().a($$3, axt.X)))).invert().build()
      );
      ag.a.a()
         .a($$5)
         .a(ak.a.b)
         .a(cxk.po, xk.c("advancements.nether.distract_piglin.title"), xk.c("advancements.nether.distract_piglin.description"), null, an.a, true, true, false)
         .a("distract_piglin", dn.a.a($$18, Optional.of(cu.a.a().a($$3, axt.V).b()), Optional.of(bw.a(bw.a.a().a($$2, bvi.aS).a(bu.a.a().g(false))))))
         .a("distract_piglin_directly", dq.a.a(Optional.of($$18), cu.a.a().a($$3, cod.c), Optional.of(bw.a(bw.a.a().a($$2, bvi.aS).a(bu.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
