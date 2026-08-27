import java.util.Optional;
import java.util.function.Consumer;

public class kr implements km {
   private static final bb a = bb.a(
      ejg.a(ege.b.a, bp.a.a().a(bm.a.a().a(ca.a.a().a(cmk.pL)))).invert().build(),
      ejg.a(ege.b.a, bp.a.a().a(bm.a.a().b(ca.a.a().a(cmk.pM)))).invert().build(),
      ejg.a(ege.b.a, bp.a.a().a(bm.a.a().c(ca.a.a().a(cmk.pN)))).invert().build(),
      ejg.a(ege.b.a, bp.a.a().a(bm.a.a().d(ca.a.a().a(cmk.pO)))).invert().build()
   );

   @Override
   public void a(ih.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwb.kL,
            vb.c("advancements.nether.root.title"),
            vb.c("advancements.nether.root.description"),
            new agt("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ax.a.a(csy.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmk.tS, vb.c("advancements.nether.return_to_sender.title"), vb.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blj.R), bf.a.a().a(db.a(art.k)).a(bp.a.a().a(blj.ah))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cwb.fn, vb.c("advancements.nether.find_fortress.title"), vb.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", cr.a.a(ci.a.c(dyi.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cmk.uc, vb.c("advancements.nether.fast_travel.title"), vb.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bh.a.a(bg.a(ck.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cmk.se, vb.c("advancements.nether.uneasy_alliance.title"), vb.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blj.R).a(ci.a.b(csy.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cwb.gG, vb.c("advancements.nether.get_wither_skull.title"), vb.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", by.a.a(cwb.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmk.ul, vb.c("advancements.nether.summon_wither.title"), vb.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", da.a.a(bp.a.a().a(blj.bm)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cmk.sd, vb.c("advancements.nether.obtain_blaze_rod.title"), vb.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", by.a.a(cmk.sd))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cwb.fO, vb.c("advancements.nether.create_beacon.title"), vb.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", az.a.a(ck.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cwb.fO,
            vb.c("advancements.nether.create_full_beacon.title"),
            vb.c("advancements.nether.create_full_beacon.description"),
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
         .a(cmk.sh, vb.c("advancements.nether.brew_potion.title"), vb.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", aw.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cmk.qB, vb.c("advancements.nether.all_potions.title"), vb.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bi.a.a(cl.a.a().a(bku.a).a(bku.b).a(bku.e).a(bku.h).a(bku.j).a(bku.l).a(bku.m).a(bku.n).a(bku.p).a(bku.r).a(bku.s).a(bku.B).a(bku.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cmk.qv, vb.c("advancements.nether.all_effects.title"), vb.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bi.a.a(
               cl.a.a()
                  .a(bku.a)
                  .a(bku.b)
                  .a(bku.e)
                  .a(bku.h)
                  .a(bku.j)
                  .a(bku.l)
                  .a(bku.m)
                  .a(bku.n)
                  .a(bku.p)
                  .a(bku.r)
                  .a(bku.s)
                  .a(bku.t)
                  .a(bku.c)
                  .a(bku.d)
                  .a(bku.y)
                  .a(bku.x)
                  .a(bku.v)
                  .a(bku.q)
                  .a(bku.i)
                  .a(bku.k)
                  .a(bku.B)
                  .a(bku.C)
                  .a(bku.D)
                  .a(bku.o)
                  .a(bku.E)
                  .a(bku.F)
                  .a(bku.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cmk.aC,
            vb.c("advancements.nether.obtain_ancient_debris.title"),
            vb.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", by.a.a(cmk.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cmk.pQ, vb.c("advancements.nether.netherite_armor.title"), vb.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", by.a.a(cmk.pP, cmk.pQ, cmk.pR, cmk.pS))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cmk.ws, vb.c("advancements.nether.use_lodestone.title"), vb.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cb.a.a(ci.a.a().a(au.a.a().a(cwb.pq)), ca.a.a().a(cmk.qP)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cmk.wt,
            vb.c("advancements.nether.obtain_crying_obsidian.title"),
            vb.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", by.a.a(cmk.wt))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cmk.wG,
            vb.c("advancements.nether.charge_respawn_anchor.title"),
            vb.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cb.a.a(ci.a.a().a(au.a.a().a(cwb.pl).a(cz.a.a().a(dcg.d, 4))), ca.a.a().a(cwb.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cmk.nR, vb.c("advancements.nether.ride_strider.title"), vb.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", bz.a.a(Optional.of(bp.a(bp.a.a().a(bp.a.a().a(blj.aW)))), Optional.of(ca.a.a().a(cmk.nR).b()), ck.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cmk.nR,
            vb.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vb.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bh.a.a(bp.a.a().a(ci.a.b(csy.h)).a(bp.a.a().a(blj.aW)), bg.a(ck.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kp.a(ae.a.a(), cul.a.a.a().toList())
         .a($$13)
         .a(cmk.pS, vb.c("advancements.nether.explore_nether.title"), vb.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cmk.wC, vb.c("advancements.nether.find_bastion.title"), vb.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", cr.a.a(ci.a.c(dyi.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cwb.cv, vb.c("advancements.nether.loot_bastion.title"), vb.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cj.a.a(new agt("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cj.a.a(new agt("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cj.a.a(new agt("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cj.a.a(new agt("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cmk.oF, vb.c("advancements.nether.distract_piglin.title"), vb.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cn.a.a(a, Optional.of(ca.a.a().a(arz.U).b()), Optional.of(bp.a(bp.a.a().a(blj.ax).a(bn.a.a().e(false))))))
         .a("distract_piglin_directly", cp.a.a(Optional.of(a), ca.a.a().a(cdi.c), Optional.of(bp.a(bp.a.a().a(blj.ax).a(bn.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
