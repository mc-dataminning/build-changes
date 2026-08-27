import java.util.Optional;
import java.util.function.Consumer;

public class kx implements kq {
   private static final bc a = bc.a(
      eme.a(ejc.b.a, br.a.a().a(bo.a.a().a(cc.a.a().a(cpg.pN)))).invert().build(),
      eme.a(ejc.b.a, br.a.a().a(bo.a.a().b(cc.a.a().a(cpg.pO)))).invert().build(),
      eme.a(ejc.b.a, br.a.a().a(bo.a.a().c(cc.a.a().a(cpg.pP)))).invert().build(),
      eme.a(ejc.b.a, br.a.a().a(bo.a.a().d(cc.a.a().a(cpg.pQ)))).invert().build()
   );

   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyu.kL,
            vq.c("advancements.nether.root.title"),
            vq.c("advancements.nether.root.description"),
            new aiy("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cvr.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpg.tV, vq.c("advancements.nether.return_to_sender.title"), vq.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cf.a.a(br.a.a().a(bnw.S), bg.a.a().a(dd.a(auc.k)).a(br.a.a().a(bnw.ai))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cyu.fn, vq.c("advancements.nether.find_fortress.title"), vq.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", ct.a.a(ck.a.c(ebf.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cpg.uf, vq.c("advancements.nether.fast_travel.title"), vq.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cm.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cpg.sg, vq.c("advancements.nether.uneasy_alliance.title"), vq.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cf.a.a(br.a.a().a(bnw.S).a(ck.a.b(cvr.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cyu.gG, vq.c("advancements.nether.get_wither_skull.title"), vq.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(cyu.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpg.uo, vq.c("advancements.nether.summon_wither.title"), vq.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dc.a.a(br.a.a().a(bnw.bn)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cpg.sf, vq.c("advancements.nether.obtain_blaze_rod.title"), vq.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(cpg.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cyu.fO, vq.c("advancements.nether.create_beacon.title"), vq.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cm.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cyu.fO,
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
         .a(cpg.sj, vq.c("advancements.nether.brew_potion.title"), vq.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cpg.qD, vq.c("advancements.nether.all_potions.title"), vq.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cn.a.a().a(bnf.a).a(bnf.b).a(bnf.e).a(bnf.h).a(bnf.j).a(bnf.l).a(bnf.m).a(bnf.n).a(bnf.p).a(bnf.r).a(bnf.s).a(bnf.B).a(bnf.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cpg.qx, vq.c("advancements.nether.all_effects.title"), vq.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cn.a.a()
                  .a(bnf.a)
                  .a(bnf.b)
                  .a(bnf.e)
                  .a(bnf.h)
                  .a(bnf.j)
                  .a(bnf.l)
                  .a(bnf.m)
                  .a(bnf.n)
                  .a(bnf.p)
                  .a(bnf.r)
                  .a(bnf.s)
                  .a(bnf.t)
                  .a(bnf.c)
                  .a(bnf.d)
                  .a(bnf.y)
                  .a(bnf.x)
                  .a(bnf.v)
                  .a(bnf.q)
                  .a(bnf.i)
                  .a(bnf.k)
                  .a(bnf.B)
                  .a(bnf.C)
                  .a(bnf.D)
                  .a(bnf.o)
                  .a(bnf.E)
                  .a(bnf.F)
                  .a(bnf.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cpg.aC,
            vq.c("advancements.nether.obtain_ancient_debris.title"),
            vq.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(cpg.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cpg.pS, vq.c("advancements.nether.netherite_armor.title"), vq.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(cpg.pR, cpg.pS, cpg.pT, cpg.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cpg.wv, vq.c("advancements.nether.use_lodestone.title"), vq.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cd.a.a(ck.a.a().a(av.a.a().a(cyu.pq)), cc.a.a().a(cpg.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cpg.ww,
            vq.c("advancements.nether.obtain_crying_obsidian.title"),
            vq.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(cpg.ww))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cpg.wJ,
            vq.c("advancements.nether.charge_respawn_anchor.title"),
            vq.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cd.a.a(ck.a.a().a(av.a.a().a(cyu.pl).a(db.a.a().a(dez.d, 4))), cc.a.a().a(cyu.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cpg.nR, vq.c("advancements.nether.ride_strider.title"), vq.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cb.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bnw.aX)))), Optional.of(cc.a.a().a(cpg.nR).b()), cm.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cpg.nR,
            vq.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vq.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(ck.a.b(cvr.h)).a(br.a.a().a(bnw.aX)), bi.a(cm.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kv.a(ae.a.a(), cxe.a.a.a().toList())
         .a($$13)
         .a(cpg.pU, vq.c("advancements.nether.explore_nether.title"), vq.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cpg.wF, vq.c("advancements.nether.find_bastion.title"), vq.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", ct.a.a(ck.a.c(ebf.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cyu.cv, vq.c("advancements.nether.loot_bastion.title"), vq.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cl.a.a(new aiy("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cl.a.a(new aiy("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cl.a.a(new aiy("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cl.a.a(new aiy("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cpg.oH, vq.c("advancements.nether.distract_piglin.title"), vq.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cp.a.a(a, Optional.of(cc.a.a().a(aui.U).b()), Optional.of(br.a(br.a.a().a(bnw.ay).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cr.a.a(Optional.of(a), cc.a.a().a(cgc.c), Optional.of(br.a(br.a.a().a(bnw.ay).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
