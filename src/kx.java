import java.util.Optional;
import java.util.function.Consumer;

public class kx implements kq {
   private static final bc a = bc.a(
      elx.a(eiv.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(cpc.pN)))).invert().build(),
      elx.a(eiv.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(cpc.pO)))).invert().build(),
      elx.a(eiv.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(cpc.pP)))).invert().build(),
      elx.a(eiv.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(cpc.pQ)))).invert().build()
   );

   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyq.kL,
            vq.c("advancements.nether.root.title"),
            vq.c("advancements.nether.root.description"),
            new aiy("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cvn.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpc.tV, vq.c("advancements.nether.return_to_sender.title"), vq.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bnu.S), bg.a.a().a(dd.a(aub.k)).a(br.a.a().a(bnu.ai))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cyq.fn, vq.c("advancements.nether.find_fortress.title"), vq.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.c(eay.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cpc.uf, vq.c("advancements.nether.fast_travel.title"), vq.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cpc.sg, vq.c("advancements.nether.uneasy_alliance.title"), vq.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bnu.S).a(ck.a.b(cvn.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cyq.gG, vq.c("advancements.nether.get_wither_skull.title"), vq.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(cyq.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpc.uo, vq.c("advancements.nether.summon_wither.title"), vq.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bnu.bn)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cpc.sf, vq.c("advancements.nether.obtain_blaze_rod.title"), vq.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(cpc.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cyq.fO, vq.c("advancements.nether.create_beacon.title"), vq.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cyq.fO,
            vq.c("advancements.nether.create_full_beacon.title"),
            vq.c("advancements.nether.create_full_beacon.description"),
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
         .a(cpc.sj, vq.c("advancements.nether.brew_potion.title"), vq.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cpc.qD, vq.c("advancements.nether.all_potions.title"), vq.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bnd.a).a(bnd.b).a(bnd.e).a(bnd.h).a(bnd.j).a(bnd.l).a(bnd.m).a(bnd.n).a(bnd.p).a(bnd.r).a(bnd.s).a(bnd.B).a(bnd.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cpc.qx, vq.c("advancements.nether.all_effects.title"), vq.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bnd.a)
                  .a(bnd.b)
                  .a(bnd.e)
                  .a(bnd.h)
                  .a(bnd.j)
                  .a(bnd.l)
                  .a(bnd.m)
                  .a(bnd.n)
                  .a(bnd.p)
                  .a(bnd.r)
                  .a(bnd.s)
                  .a(bnd.t)
                  .a(bnd.c)
                  .a(bnd.d)
                  .a(bnd.y)
                  .a(bnd.x)
                  .a(bnd.v)
                  .a(bnd.q)
                  .a(bnd.i)
                  .a(bnd.k)
                  .a(bnd.B)
                  .a(bnd.C)
                  .a(bnd.D)
                  .a(bnd.o)
                  .a(bnd.E)
                  .a(bnd.F)
                  .a(bnd.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cpc.aC,
            vq.c("advancements.nether.obtain_ancient_debris.title"),
            vq.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(cpc.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cpc.pS, vq.c("advancements.nether.netherite_armor.title"), vq.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(cpc.pR, cpc.pS, cpc.pT, cpc.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cpc.wv, vq.c("advancements.nether.use_lodestone.title"), vq.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(cyq.pq)), cc.a.a().a(cpc.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cpc.ww,
            vq.c("advancements.nether.obtain_crying_obsidian.title"),
            vq.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(cpc.ww))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cpc.wJ,
            vq.c("advancements.nether.charge_respawn_anchor.title"),
            vq.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(cyq.pl).a(db.a.a().a(dev.d, 4))), cc.a.a().a(cyq.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cpc.nR, vq.c("advancements.nether.ride_strider.title"), vq.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bnu.aX)))), Optional.of(cc.a.a().a(cpc.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cpc.nR,
            vq.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vq.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.b(cvn.h)).a(br.a.a().a(bnu.aX)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kv.a(ae.a.a(), cxa.a.a.a().toList())
         .a($$13)
         .a(cpc.pU, vq.c("advancements.nether.explore_nether.title"), vq.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cpc.wF, vq.c("advancements.nether.find_bastion.title"), vq.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.c(eay.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cyq.cv, vq.c("advancements.nether.loot_bastion.title"), vq.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new aiy("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new aiy("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new aiy("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new aiy("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cpc.oH, vq.c("advancements.nether.distract_piglin.title"), vq.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(auh.U).b()), Optional.of(br.a(br.a.a().a(bnu.ay).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(cfy.c), Optional.of(br.a(br.a.a().a(bnu.ay).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
