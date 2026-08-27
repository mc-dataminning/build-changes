import java.util.Optional;
import java.util.function.Consumer;

public class lj implements lc {
   private static final bc a = bc.a(
      eqf.a(enb.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(crm.pN)))).invert().build(),
      eqf.a(enb.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(crm.pO)))).invert().build(),
      eqf.a(enb.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(crm.pP)))).invert().build(),
      eqf.a(enb.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(crm.pQ)))).invert().build()
   );

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dca.kL,
            wg.c("advancements.nether.root.title"),
            wg.c("advancements.nether.root.description"),
            new ajt("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cyx.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crm.tW, wg.c("advancements.nether.return_to_sender.title"), wg.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bqb.T), bg.a.a().a(dd.a(ave.k)).a(br.a.a().a(bqb.aj))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dca.fn, wg.c("advancements.nether.find_fortress.title"), wg.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.b($$0.b(ks.aF).b(efb.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(crm.uh, wg.c("advancements.nether.fast_travel.title"), wg.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(crm.sg, wg.c("advancements.nether.uneasy_alliance.title"), wg.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bqb.T).a(ck.a.a(cyx.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dca.gG, wg.c("advancements.nether.get_wither_skull.title"), wg.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(dca.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(crm.uq, wg.c("advancements.nether.summon_wither.title"), wg.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bqb.bo)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(crm.sf, wg.c("advancements.nether.obtain_blaze_rod.title"), wg.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(crm.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dca.fO, wg.c("advancements.nether.create_beacon.title"), wg.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dca.fO,
            wg.c("advancements.nether.create_full_beacon.title"),
            wg.c("advancements.nether.create_full_beacon.description"),
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
         .a(crm.sj, wg.c("advancements.nether.brew_potion.title"), wg.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(crm.qD, wg.c("advancements.nether.all_potions.title"), wg.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bpj.a).a(bpj.b).a(bpj.e).a(bpj.h).a(bpj.j).a(bpj.l).a(bpj.m).a(bpj.n).a(bpj.p).a(bpj.r).a(bpj.s).a(bpj.B).a(bpj.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(crm.qx, wg.c("advancements.nether.all_effects.title"), wg.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bpj.a)
                  .a(bpj.b)
                  .a(bpj.e)
                  .a(bpj.h)
                  .a(bpj.j)
                  .a(bpj.l)
                  .a(bpj.m)
                  .a(bpj.n)
                  .a(bpj.p)
                  .a(bpj.r)
                  .a(bpj.s)
                  .a(bpj.t)
                  .a(bpj.c)
                  .a(bpj.d)
                  .a(bpj.y)
                  .a(bpj.x)
                  .a(bpj.v)
                  .a(bpj.q)
                  .a(bpj.i)
                  .a(bpj.k)
                  .a(bpj.B)
                  .a(bpj.C)
                  .a(bpj.D)
                  .a(bpj.o)
                  .a(bpj.E)
                  .a(bpj.F)
                  .a(bpj.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            crm.aC,
            wg.c("advancements.nether.obtain_ancient_debris.title"),
            wg.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(crm.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(crm.pS, wg.c("advancements.nether.netherite_armor.title"), wg.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(crm.pR, crm.pS, crm.pT, crm.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(crm.wx, wg.c("advancements.nether.use_lodestone.title"), wg.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(dca.pq)), cc.a.a().a(crm.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            crm.wy,
            wg.c("advancements.nether.obtain_crying_obsidian.title"),
            wg.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(crm.wy))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            crm.wL,
            wg.c("advancements.nether.charge_respawn_anchor.title"),
            wg.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(dca.pl).a(db.a.a().a(dif.d, 4))), cc.a.a().a(dca.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(crm.nR, wg.c("advancements.nether.ride_strider.title"), wg.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bqb.aY)))), Optional.of(cc.a.a().a(crm.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            crm.nR,
            wg.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wg.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.a(cyx.h)).a(br.a.a().a(bqb.aY)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      lh.a(ae.a.a(), $$0, dak.a.a.a().toList())
         .a($$13)
         .a(crm.pU, wg.c("advancements.nether.explore_nether.title"), wg.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(crm.wH, wg.c("advancements.nether.find_bastion.title"), wg.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.b($$0.b(ks.aF).b(efb.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dca.cv, wg.c("advancements.nether.loot_bastion.title"), wg.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new ajt("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new ajt("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new ajt("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new ajt("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(crm.oH, wg.c("advancements.nether.distract_piglin.title"), wg.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(avk.U).b()), Optional.of(br.a(br.a.a().a(bqb.az).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(cik.c), Optional.of(br.a(br.a.a().a(bqb.az).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
