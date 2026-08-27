import java.util.Optional;
import java.util.function.Consumer;

public class ll implements le {
   private static final bc a = bc.a(
      eqo.a(enk.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(crv.pN)))).invert().build(),
      eqo.a(enk.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(crv.pO)))).invert().build(),
      eqo.a(enk.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(crv.pP)))).invert().build(),
      eqo.a(enk.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(crv.pQ)))).invert().build()
   );

   @Override
   public void a(ip.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcj.kL,
            wi.c("advancements.nether.root.title"),
            wi.c("advancements.nether.root.description"),
            new ajv("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(czg.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crv.tW, wi.c("advancements.nether.return_to_sender.title"), wi.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bqg.T), bg.a.a().a(de.a(avg.k)).a(br.a.a().a(bqg.aj))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dcj.fn, wi.c("advancements.nether.find_fortress.title"), wi.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.b($$0.b(ku.aG).b(efk.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(crv.uh, wi.c("advancements.nether.fast_travel.title"), wi.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(crv.sg, wi.c("advancements.nether.uneasy_alliance.title"), wi.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bqg.T).a(ck.a.a(czg.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dcj.gG, wi.c("advancements.nether.get_wither_skull.title"), wi.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(dcj.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(crv.uq, wi.c("advancements.nether.summon_wither.title"), wi.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dd.a.a(br.a.a().a(bqg.bo)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(crv.sf, wi.c("advancements.nether.obtain_blaze_rod.title"), wi.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(crv.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dcj.fO, wi.c("advancements.nether.create_beacon.title"), wi.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dcj.fO,
            wi.c("advancements.nether.create_full_beacon.title"),
            wi.c("advancements.nether.create_full_beacon.description"),
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
         .a(crv.sj, wi.c("advancements.nether.brew_potion.title"), wi.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(crv.qD, wi.c("advancements.nether.all_potions.title"), wi.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bpo.a).a(bpo.b).a(bpo.e).a(bpo.h).a(bpo.j).a(bpo.l).a(bpo.m).a(bpo.n).a(bpo.p).a(bpo.r).a(bpo.s).a(bpo.B).a(bpo.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(crv.qx, wi.c("advancements.nether.all_effects.title"), wi.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bpo.a)
                  .a(bpo.b)
                  .a(bpo.e)
                  .a(bpo.h)
                  .a(bpo.j)
                  .a(bpo.l)
                  .a(bpo.m)
                  .a(bpo.n)
                  .a(bpo.p)
                  .a(bpo.r)
                  .a(bpo.s)
                  .a(bpo.t)
                  .a(bpo.c)
                  .a(bpo.d)
                  .a(bpo.y)
                  .a(bpo.x)
                  .a(bpo.v)
                  .a(bpo.q)
                  .a(bpo.i)
                  .a(bpo.k)
                  .a(bpo.B)
                  .a(bpo.C)
                  .a(bpo.D)
                  .a(bpo.o)
                  .a(bpo.E)
                  .a(bpo.F)
                  .a(bpo.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            crv.aC,
            wi.c("advancements.nether.obtain_ancient_debris.title"),
            wi.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(crv.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(crv.pS, wi.c("advancements.nether.netherite_armor.title"), wi.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(crv.pR, crv.pS, crv.pT, crv.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(crv.wx, wi.c("advancements.nether.use_lodestone.title"), wi.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(dcj.pq)), cc.a.a().a(crv.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            crv.wy,
            wi.c("advancements.nether.obtain_crying_obsidian.title"),
            wi.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(crv.wy))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            crv.wL,
            wi.c("advancements.nether.charge_respawn_anchor.title"),
            wi.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(dcj.pl).a(dc.a.a().a(dio.d, 4))), cc.a.a().a(dcj.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(crv.nR, wi.c("advancements.nether.ride_strider.title"), wi.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bqg.aY)))), Optional.of(cc.a.a().a(crv.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            crv.nR,
            wi.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wi.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.a(czg.h)).a(br.a.a().a(bqg.aY)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      lj.a(ae.a.a(), $$0, dat.a.a.a().toList())
         .a($$13)
         .a(crv.pU, wi.c("advancements.nether.explore_nether.title"), wi.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(crv.wH, wi.c("advancements.nether.find_bastion.title"), wi.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.b($$0.b(ku.aG).b(efk.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dcj.cv, wi.c("advancements.nether.loot_bastion.title"), wi.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new ajv("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new ajv("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new ajv("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new ajv("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(crv.oH, wi.c("advancements.nether.distract_piglin.title"), wi.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(avm.U).b()), Optional.of(br.a(br.a.a().a(bqg.az).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(cir.c), Optional.of(br.a(br.a.a().a(bqg.az).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
