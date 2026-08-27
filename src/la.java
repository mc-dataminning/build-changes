import java.util.Optional;
import java.util.function.Consumer;

public class la implements kt {
   private static final bc a = bc.a(
      eny.a(ekw.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(cqp.pN)))).invert().build(),
      eny.a(ekw.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(cqp.pO)))).invert().build(),
      eny.a(ekw.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(cqp.pP)))).invert().build(),
      eny.a(ekw.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(cqp.pQ)))).invert().build()
   );

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dae.kL,
            vu.c("advancements.nether.root.title"),
            vu.c("advancements.nether.root.description"),
            new ajh("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cxb.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cqp.tW, vu.c("advancements.nether.return_to_sender.title"), vu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bpd.U), bg.a.a().a(dd.a(aup.k)).a(br.a.a().a(bpd.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dae.fn, vu.c("advancements.nether.find_fortress.title"), vu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.c(ecy.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cqp.uh, vu.c("advancements.nether.fast_travel.title"), vu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cqp.sg, vu.c("advancements.nether.uneasy_alliance.title"), vu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bpd.U).a(ck.a.b(cxb.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dae.gG, vu.c("advancements.nether.get_wither_skull.title"), vu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(dae.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cqp.uq, vu.c("advancements.nether.summon_wither.title"), vu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bpd.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cqp.sf, vu.c("advancements.nether.obtain_blaze_rod.title"), vu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(cqp.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dae.fO, vu.c("advancements.nether.create_beacon.title"), vu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dae.fO,
            vu.c("advancements.nether.create_full_beacon.title"),
            vu.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(cm.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cqp.sj, vu.c("advancements.nether.brew_potion.title"), vu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cqp.qD, vu.c("advancements.nether.all_potions.title"), vu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bom.a).a(bom.b).a(bom.e).a(bom.h).a(bom.j).a(bom.l).a(bom.m).a(bom.n).a(bom.p).a(bom.r).a(bom.s).a(bom.B).a(bom.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cqp.qx, vu.c("advancements.nether.all_effects.title"), vu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bom.a)
                  .a(bom.b)
                  .a(bom.e)
                  .a(bom.h)
                  .a(bom.j)
                  .a(bom.l)
                  .a(bom.m)
                  .a(bom.n)
                  .a(bom.p)
                  .a(bom.r)
                  .a(bom.s)
                  .a(bom.t)
                  .a(bom.c)
                  .a(bom.d)
                  .a(bom.y)
                  .a(bom.x)
                  .a(bom.v)
                  .a(bom.q)
                  .a(bom.i)
                  .a(bom.k)
                  .a(bom.B)
                  .a(bom.C)
                  .a(bom.D)
                  .a(bom.o)
                  .a(bom.E)
                  .a(bom.F)
                  .a(bom.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cqp.aC,
            vu.c("advancements.nether.obtain_ancient_debris.title"),
            vu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(cqp.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cqp.pS, vu.c("advancements.nether.netherite_armor.title"), vu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(cqp.pR, cqp.pS, cqp.pT, cqp.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cqp.wx, vu.c("advancements.nether.use_lodestone.title"), vu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(dae.pq)), cc.a.a().a(cqp.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cqp.wy,
            vu.c("advancements.nether.obtain_crying_obsidian.title"),
            vu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(cqp.wy))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cqp.wL,
            vu.c("advancements.nether.charge_respawn_anchor.title"),
            vu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(dae.pl).a(db.a.a().a(dgj.d, 4))), cc.a.a().a(dae.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cqp.nR, vu.c("advancements.nether.ride_strider.title"), vu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bpd.aZ)))), Optional.of(cc.a.a().a(cqp.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cqp.nR,
            vu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.b(cxb.h)).a(br.a.a().a(bpd.aZ)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      ky.a(ae.a.a(), cyo.a.a.a().toList())
         .a($$13)
         .a(cqp.pU, vu.c("advancements.nether.explore_nether.title"), vu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cqp.wH, vu.c("advancements.nether.find_bastion.title"), vu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.c(ecy.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dae.cv, vu.c("advancements.nether.loot_bastion.title"), vu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new ajh("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new ajh("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new ajh("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new ajh("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cqp.oH, vu.c("advancements.nether.distract_piglin.title"), vu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(auv.U).b()), Optional.of(br.a(br.a.a().a(bpd.aA).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(chl.c), Optional.of(br.a(br.a.a().a(bpd.aA).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
