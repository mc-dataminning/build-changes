import java.util.Optional;
import java.util.function.Consumer;

public class kv implements ko {
   private static final bb a = bb.a(
      ejy.a(egw.b.a, bp.a.a().a(bm.a.a().a(ca.a.a().a(cnb.pL)))).invert().build(),
      ejy.a(egw.b.a, bp.a.a().a(bm.a.a().b(ca.a.a().a(cnb.pM)))).invert().build(),
      ejy.a(egw.b.a, bp.a.a().a(bm.a.a().c(ca.a.a().a(cnb.pN)))).invert().build(),
      ejy.a(egw.b.a, bp.a.a().a(bm.a.a().d(ca.a.a().a(cnb.pO)))).invert().build()
   );

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cws.kL,
            vf.c("advancements.nether.root.title"),
            vf.c("advancements.nether.root.description"),
            new ahg("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ax.a.a(ctp.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnb.tS, vf.c("advancements.nether.return_to_sender.title"), vf.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blz.R), bf.a.a().a(db.a(asj.k)).a(bp.a.a().a(blz.ah))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cws.fn, vf.c("advancements.nether.find_fortress.title"), vf.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", cr.a.a(ci.a.c(dza.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cnb.uc, vf.c("advancements.nether.fast_travel.title"), vf.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bh.a.a(bg.a(ck.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cnb.se, vf.c("advancements.nether.uneasy_alliance.title"), vf.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blz.R).a(ci.a.b(ctp.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cws.gG, vf.c("advancements.nether.get_wither_skull.title"), vf.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", by.a.a(cws.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cnb.ul, vf.c("advancements.nether.summon_wither.title"), vf.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", da.a.a(bp.a.a().a(blz.bm)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cnb.sd, vf.c("advancements.nether.obtain_blaze_rod.title"), vf.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", by.a.a(cnb.sd))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cws.fO, vf.c("advancements.nether.create_beacon.title"), vf.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", az.a.a(ck.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cws.fO,
            vf.c("advancements.nether.create_full_beacon.title"),
            vf.c("advancements.nether.create_full_beacon.description"),
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
         .a(cnb.sh, vf.c("advancements.nether.brew_potion.title"), vf.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", aw.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cnb.qB, vf.c("advancements.nether.all_potions.title"), vf.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bi.a.a(cl.a.a().a(blk.a).a(blk.b).a(blk.e).a(blk.h).a(blk.j).a(blk.l).a(blk.m).a(blk.n).a(blk.p).a(blk.r).a(blk.s).a(blk.B).a(blk.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cnb.qv, vf.c("advancements.nether.all_effects.title"), vf.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bi.a.a(
               cl.a.a()
                  .a(blk.a)
                  .a(blk.b)
                  .a(blk.e)
                  .a(blk.h)
                  .a(blk.j)
                  .a(blk.l)
                  .a(blk.m)
                  .a(blk.n)
                  .a(blk.p)
                  .a(blk.r)
                  .a(blk.s)
                  .a(blk.t)
                  .a(blk.c)
                  .a(blk.d)
                  .a(blk.y)
                  .a(blk.x)
                  .a(blk.v)
                  .a(blk.q)
                  .a(blk.i)
                  .a(blk.k)
                  .a(blk.B)
                  .a(blk.C)
                  .a(blk.D)
                  .a(blk.o)
                  .a(blk.E)
                  .a(blk.F)
                  .a(blk.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cnb.aC,
            vf.c("advancements.nether.obtain_ancient_debris.title"),
            vf.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", by.a.a(cnb.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cnb.pQ, vf.c("advancements.nether.netherite_armor.title"), vf.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", by.a.a(cnb.pP, cnb.pQ, cnb.pR, cnb.pS))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cnb.ws, vf.c("advancements.nether.use_lodestone.title"), vf.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cb.a.a(ci.a.a().a(au.a.a().a(cws.pq)), ca.a.a().a(cnb.qP)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cnb.wt,
            vf.c("advancements.nether.obtain_crying_obsidian.title"),
            vf.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", by.a.a(cnb.wt))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cnb.wG,
            vf.c("advancements.nether.charge_respawn_anchor.title"),
            vf.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cb.a.a(ci.a.a().a(au.a.a().a(cws.pl).a(cz.a.a().a(dcx.d, 4))), ca.a.a().a(cws.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cnb.nR, vf.c("advancements.nether.ride_strider.title"), vf.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", bz.a.a(Optional.of(bp.a(bp.a.a().a(bp.a.a().a(blz.aW)))), Optional.of(ca.a.a().a(cnb.nR).b()), ck.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cnb.nR,
            vf.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vf.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bh.a.a(bp.a.a().a(ci.a.b(ctp.h)).a(bp.a.a().a(blz.aW)), bg.a(ck.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kt.a(ae.a.a(), cvc.a.a.a().toList())
         .a($$13)
         .a(cnb.pS, vf.c("advancements.nether.explore_nether.title"), vf.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cnb.wC, vf.c("advancements.nether.find_bastion.title"), vf.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", cr.a.a(ci.a.c(dza.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cws.cv, vf.c("advancements.nether.loot_bastion.title"), vf.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cj.a.a(new ahg("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cj.a.a(new ahg("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cj.a.a(new ahg("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cj.a.a(new ahg("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cnb.oF, vf.c("advancements.nether.distract_piglin.title"), vf.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cn.a.a(a, Optional.of(ca.a.a().a(asp.U).b()), Optional.of(bp.a(bp.a.a().a(blz.ax).a(bn.a.a().e(false))))))
         .a("distract_piglin_directly", cp.a.a(Optional.of(a), ca.a.a().a(cdz.c), Optional.of(bp.a(bp.a.a().a(blz.ax).a(bn.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
