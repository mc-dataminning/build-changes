import java.util.Optional;
import java.util.function.Consumer;

public class kv implements ko {
   private static final bb a = bb.a(
      ekh.a(ehf.b.a, bp.a.a().a(bm.a.a().a(ca.a.a().a(cnj.pN)))).invert().build(),
      ekh.a(ehf.b.a, bp.a.a().a(bm.a.a().b(ca.a.a().a(cnj.pO)))).invert().build(),
      ekh.a(ehf.b.a, bp.a.a().a(bm.a.a().c(ca.a.a().a(cnj.pP)))).invert().build(),
      ekh.a(ehf.b.a, bp.a.a().a(bm.a.a().d(ca.a.a().a(cnj.pQ)))).invert().build()
   );

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cxa.kL,
            vg.c("advancements.nether.root.title"),
            vg.c("advancements.nether.root.description"),
            new ahh("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ax.a.a(ctx.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnj.tV, vg.c("advancements.nether.return_to_sender.title"), vg.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cd.a.a(bp.a.a().a(bmc.S), bf.a.a().a(db.a(ask.k)).a(bp.a.a().a(bmc.ai))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cxa.fn, vg.c("advancements.nether.find_fortress.title"), vg.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", cr.a.a(ci.a.c(dzi.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cnj.uf, vg.c("advancements.nether.fast_travel.title"), vg.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bh.a.a(bg.a(ck.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cnj.sg, vg.c("advancements.nether.uneasy_alliance.title"), vg.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cd.a.a(bp.a.a().a(bmc.S).a(ci.a.b(ctx.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cxa.gG, vg.c("advancements.nether.get_wither_skull.title"), vg.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", by.a.a(cxa.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cnj.uo, vg.c("advancements.nether.summon_wither.title"), vg.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", da.a.a(bp.a.a().a(bmc.bn)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cnj.sf, vg.c("advancements.nether.obtain_blaze_rod.title"), vg.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", by.a.a(cnj.sf))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cxa.fO, vg.c("advancements.nether.create_beacon.title"), vg.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", az.a.a(ck.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cxa.fO,
            vg.c("advancements.nether.create_full_beacon.title"),
            vg.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", az.a.a(ck.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cnj.sj, vg.c("advancements.nether.brew_potion.title"), vg.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", aw.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cnj.qD, vg.c("advancements.nether.all_potions.title"), vg.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bi.a.a(cl.a.a().a(bll.a).a(bll.b).a(bll.e).a(bll.h).a(bll.j).a(bll.l).a(bll.m).a(bll.n).a(bll.p).a(bll.r).a(bll.s).a(bll.B).a(bll.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cnj.qx, vg.c("advancements.nether.all_effects.title"), vg.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bi.a.a(
               cl.a.a()
                  .a(bll.a)
                  .a(bll.b)
                  .a(bll.e)
                  .a(bll.h)
                  .a(bll.j)
                  .a(bll.l)
                  .a(bll.m)
                  .a(bll.n)
                  .a(bll.p)
                  .a(bll.r)
                  .a(bll.s)
                  .a(bll.t)
                  .a(bll.c)
                  .a(bll.d)
                  .a(bll.y)
                  .a(bll.x)
                  .a(bll.v)
                  .a(bll.q)
                  .a(bll.i)
                  .a(bll.k)
                  .a(bll.B)
                  .a(bll.C)
                  .a(bll.D)
                  .a(bll.o)
                  .a(bll.E)
                  .a(bll.F)
                  .a(bll.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cnj.aC,
            vg.c("advancements.nether.obtain_ancient_debris.title"),
            vg.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", by.a.a(cnj.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cnj.pS, vg.c("advancements.nether.netherite_armor.title"), vg.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", by.a.a(cnj.pR, cnj.pS, cnj.pT, cnj.pU))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cnj.wv, vg.c("advancements.nether.use_lodestone.title"), vg.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cb.a.a(ci.a.a().a(au.a.a().a(cxa.pq)), ca.a.a().a(cnj.qR)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cnj.ww,
            vg.c("advancements.nether.obtain_crying_obsidian.title"),
            vg.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", by.a.a(cnj.ww))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cnj.wJ,
            vg.c("advancements.nether.charge_respawn_anchor.title"),
            vg.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cb.a.a(ci.a.a().a(au.a.a().a(cxa.pl).a(cz.a.a().a(ddf.d, 4))), ca.a.a().a(cxa.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cnj.nR, vg.c("advancements.nether.ride_strider.title"), vg.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", bz.a.a(Optional.of(bp.a(bp.a.a().a(bp.a.a().a(bmc.aX)))), Optional.of(ca.a.a().a(cnj.nR).b()), ck.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cnj.nR,
            vg.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vg.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bh.a.a(bp.a.a().a(ci.a.b(ctx.h)).a(bp.a.a().a(bmc.aX)), bg.a(ck.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kt.a(ae.a.a(), cvk.a.a.a().toList())
         .a($$13)
         .a(cnj.pU, vg.c("advancements.nether.explore_nether.title"), vg.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cnj.wF, vg.c("advancements.nether.find_bastion.title"), vg.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", cr.a.a(ci.a.c(dzi.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cxa.cv, vg.c("advancements.nether.loot_bastion.title"), vg.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cj.a.a(new ahh("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cj.a.a(new ahh("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cj.a.a(new ahh("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cj.a.a(new ahh("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cnj.oH, vg.c("advancements.nether.distract_piglin.title"), vg.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cn.a.a(a, Optional.of(ca.a.a().a(asq.U).b()), Optional.of(bp.a(bp.a.a().a(bmc.ay).a(bn.a.a().e(false))))))
         .a("distract_piglin_directly", cp.a.a(Optional.of(a), ca.a.a().a(ceh.c), Optional.of(bp.a(bp.a.a().a(bmc.ay).a(bn.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
