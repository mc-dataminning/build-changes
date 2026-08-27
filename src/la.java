import java.util.Optional;
import java.util.function.Consumer;

public class la implements kt {
   private static final bc a = bc.a(
      enw.a(eku.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(cqn.pN)))).invert().build(),
      enw.a(eku.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(cqn.pO)))).invert().build(),
      enw.a(eku.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(cqn.pP)))).invert().build(),
      enw.a(eku.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(cqn.pQ)))).invert().build()
   );

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dac.kL,
            vu.c("advancements.nether.root.title"),
            vu.c("advancements.nether.root.description"),
            new ajh("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cwz.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cqn.tV, vu.c("advancements.nether.return_to_sender.title"), vu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bpc.T), bg.a.a().a(dd.a(aup.k)).a(br.a.a().a(bpc.aj))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dac.fn, vu.c("advancements.nether.find_fortress.title"), vu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.c(ecw.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cqn.ug, vu.c("advancements.nether.fast_travel.title"), vu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cqn.sg, vu.c("advancements.nether.uneasy_alliance.title"), vu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bpc.T).a(ck.a.b(cwz.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dac.gG, vu.c("advancements.nether.get_wither_skull.title"), vu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(dac.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cqn.up, vu.c("advancements.nether.summon_wither.title"), vu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bpc.bo)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cqn.sf, vu.c("advancements.nether.obtain_blaze_rod.title"), vu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(cqn.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dac.fO, vu.c("advancements.nether.create_beacon.title"), vu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dac.fO,
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
         .a(cqn.sj, vu.c("advancements.nether.brew_potion.title"), vu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cqn.qD, vu.c("advancements.nether.all_potions.title"), vu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bol.a).a(bol.b).a(bol.e).a(bol.h).a(bol.j).a(bol.l).a(bol.m).a(bol.n).a(bol.p).a(bol.r).a(bol.s).a(bol.B).a(bol.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cqn.qx, vu.c("advancements.nether.all_effects.title"), vu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bol.a)
                  .a(bol.b)
                  .a(bol.e)
                  .a(bol.h)
                  .a(bol.j)
                  .a(bol.l)
                  .a(bol.m)
                  .a(bol.n)
                  .a(bol.p)
                  .a(bol.r)
                  .a(bol.s)
                  .a(bol.t)
                  .a(bol.c)
                  .a(bol.d)
                  .a(bol.y)
                  .a(bol.x)
                  .a(bol.v)
                  .a(bol.q)
                  .a(bol.i)
                  .a(bol.k)
                  .a(bol.B)
                  .a(bol.C)
                  .a(bol.D)
                  .a(bol.o)
                  .a(bol.E)
                  .a(bol.F)
                  .a(bol.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cqn.aC,
            vu.c("advancements.nether.obtain_ancient_debris.title"),
            vu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(cqn.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cqn.pS, vu.c("advancements.nether.netherite_armor.title"), vu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(cqn.pR, cqn.pS, cqn.pT, cqn.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cqn.ww, vu.c("advancements.nether.use_lodestone.title"), vu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(dac.pq)), cc.a.a().a(cqn.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cqn.wx,
            vu.c("advancements.nether.obtain_crying_obsidian.title"),
            vu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(cqn.wx))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cqn.wK,
            vu.c("advancements.nether.charge_respawn_anchor.title"),
            vu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(dac.pl).a(db.a.a().a(dgh.d, 4))), cc.a.a().a(dac.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cqn.nR, vu.c("advancements.nether.ride_strider.title"), vu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bpc.aY)))), Optional.of(cc.a.a().a(cqn.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cqn.nR,
            vu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.b(cwz.h)).a(br.a.a().a(bpc.aY)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      ky.a(ae.a.a(), cym.a.a.a().toList())
         .a($$13)
         .a(cqn.pU, vu.c("advancements.nether.explore_nether.title"), vu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cqn.wG, vu.c("advancements.nether.find_bastion.title"), vu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.c(ecw.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dac.cv, vu.c("advancements.nether.loot_bastion.title"), vu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new ajh("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new ajh("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new ajh("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new ajh("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cqn.oH, vu.c("advancements.nether.distract_piglin.title"), vu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(auv.U).b()), Optional.of(br.a(br.a.a().a(bpc.az).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(chj.c), Optional.of(br.a(br.a.a().a(bpc.az).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
