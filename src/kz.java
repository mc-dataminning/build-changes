import java.util.Optional;
import java.util.function.Consumer;

public class kz implements ks {
   private static final bc a = bc.a(
      ena.a(ejy.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(cpt.pN)))).invert().build(),
      ena.a(ejy.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(cpt.pO)))).invert().build(),
      ena.a(ejy.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(cpt.pP)))).invert().build(),
      ena.a(ejy.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(cpt.pQ)))).invert().build()
   );

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            czh.kL,
            vs.c("advancements.nether.root.title"),
            vs.c("advancements.nether.root.description"),
            new ajc("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cwe.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpt.tV, vs.c("advancements.nether.return_to_sender.title"), vs.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bol.S), bg.a.a().a(dd.a(aug.k)).a(br.a.a().a(bol.ai))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(czh.fn, vs.c("advancements.nether.find_fortress.title"), vs.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.c(eca.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cpt.uf, vs.c("advancements.nether.fast_travel.title"), vs.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cpt.sg, vs.c("advancements.nether.uneasy_alliance.title"), vs.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bol.S).a(ck.a.b(cwe.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(czh.gG, vs.c("advancements.nether.get_wither_skull.title"), vs.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(czh.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpt.uo, vs.c("advancements.nether.summon_wither.title"), vs.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bol.bn)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cpt.sf, vs.c("advancements.nether.obtain_blaze_rod.title"), vs.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(cpt.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(czh.fO, vs.c("advancements.nether.create_beacon.title"), vs.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            czh.fO,
            vs.c("advancements.nether.create_full_beacon.title"),
            vs.c("advancements.nether.create_full_beacon.description"),
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
         .a(cpt.sj, vs.c("advancements.nether.brew_potion.title"), vs.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cpt.qD, vs.c("advancements.nether.all_potions.title"), vs.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bnu.a).a(bnu.b).a(bnu.e).a(bnu.h).a(bnu.j).a(bnu.l).a(bnu.m).a(bnu.n).a(bnu.p).a(bnu.r).a(bnu.s).a(bnu.B).a(bnu.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cpt.qx, vs.c("advancements.nether.all_effects.title"), vs.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bnu.a)
                  .a(bnu.b)
                  .a(bnu.e)
                  .a(bnu.h)
                  .a(bnu.j)
                  .a(bnu.l)
                  .a(bnu.m)
                  .a(bnu.n)
                  .a(bnu.p)
                  .a(bnu.r)
                  .a(bnu.s)
                  .a(bnu.t)
                  .a(bnu.c)
                  .a(bnu.d)
                  .a(bnu.y)
                  .a(bnu.x)
                  .a(bnu.v)
                  .a(bnu.q)
                  .a(bnu.i)
                  .a(bnu.k)
                  .a(bnu.B)
                  .a(bnu.C)
                  .a(bnu.D)
                  .a(bnu.o)
                  .a(bnu.E)
                  .a(bnu.F)
                  .a(bnu.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cpt.aC,
            vs.c("advancements.nether.obtain_ancient_debris.title"),
            vs.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(cpt.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cpt.pS, vs.c("advancements.nether.netherite_armor.title"), vs.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(cpt.pR, cpt.pS, cpt.pT, cpt.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cpt.wv, vs.c("advancements.nether.use_lodestone.title"), vs.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(czh.pq)), cc.a.a().a(cpt.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cpt.ww,
            vs.c("advancements.nether.obtain_crying_obsidian.title"),
            vs.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(cpt.ww))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cpt.wJ,
            vs.c("advancements.nether.charge_respawn_anchor.title"),
            vs.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(czh.pl).a(db.a.a().a(dfm.d, 4))), cc.a.a().a(czh.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cpt.nR, vs.c("advancements.nether.ride_strider.title"), vs.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bol.aX)))), Optional.of(cc.a.a().a(cpt.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cpt.nR,
            vs.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vs.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.b(cwe.h)).a(br.a.a().a(bol.aX)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kx.a(ae.a.a(), cxr.a.a.a().toList())
         .a($$13)
         .a(cpt.pU, vs.c("advancements.nether.explore_nether.title"), vs.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cpt.wF, vs.c("advancements.nether.find_bastion.title"), vs.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.c(eca.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(czh.cv, vs.c("advancements.nether.loot_bastion.title"), vs.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new ajc("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new ajc("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new ajc("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new ajc("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cpt.oH, vs.c("advancements.nether.distract_piglin.title"), vs.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(aum.U).b()), Optional.of(br.a(br.a.a().a(bol.ay).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(cgr.c), Optional.of(br.a(br.a.a().a(bol.ay).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
