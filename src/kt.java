import java.util.Optional;
import java.util.function.Consumer;

public class kt implements ko {
   private static final bb a = bb.a(
      ejr.a(egp.b.a, bp.a.a().a(bm.a.a().a(ca.a.a().a(cmu.pL)))).invert().build(),
      ejr.a(egp.b.a, bp.a.a().a(bm.a.a().b(ca.a.a().a(cmu.pM)))).invert().build(),
      ejr.a(egp.b.a, bp.a.a().a(bm.a.a().c(ca.a.a().a(cmu.pN)))).invert().build(),
      ejr.a(egp.b.a, bp.a.a().a(bm.a.a().d(ca.a.a().a(cmu.pO)))).invert().build()
   );

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwl.kL,
            vd.c("advancements.nether.root.title"),
            vd.c("advancements.nether.root.description"),
            new ahd("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ax.a.a(cti.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmu.tS, vd.c("advancements.nether.return_to_sender.title"), vd.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blt.R), bf.a.a().a(db.a(asd.k)).a(bp.a.a().a(blt.ah))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cwl.fn, vd.c("advancements.nether.find_fortress.title"), vd.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", cr.a.a(ci.a.c(dyt.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cmu.uc, vd.c("advancements.nether.fast_travel.title"), vd.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bh.a.a(bg.a(ck.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cmu.se, vd.c("advancements.nether.uneasy_alliance.title"), vd.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cd.a.a(bp.a.a().a(blt.R).a(ci.a.b(cti.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cwl.gG, vd.c("advancements.nether.get_wither_skull.title"), vd.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", by.a.a(cwl.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmu.ul, vd.c("advancements.nether.summon_wither.title"), vd.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", da.a.a(bp.a.a().a(blt.bm)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cmu.sd, vd.c("advancements.nether.obtain_blaze_rod.title"), vd.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", by.a.a(cmu.sd))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cwl.fO, vd.c("advancements.nether.create_beacon.title"), vd.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", az.a.a(ck.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cwl.fO,
            vd.c("advancements.nether.create_full_beacon.title"),
            vd.c("advancements.nether.create_full_beacon.description"),
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
         .a(cmu.sh, vd.c("advancements.nether.brew_potion.title"), vd.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", aw.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cmu.qB, vd.c("advancements.nether.all_potions.title"), vd.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bi.a.a(cl.a.a().a(ble.a).a(ble.b).a(ble.e).a(ble.h).a(ble.j).a(ble.l).a(ble.m).a(ble.n).a(ble.p).a(ble.r).a(ble.s).a(ble.B).a(ble.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cmu.qv, vd.c("advancements.nether.all_effects.title"), vd.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bi.a.a(
               cl.a.a()
                  .a(ble.a)
                  .a(ble.b)
                  .a(ble.e)
                  .a(ble.h)
                  .a(ble.j)
                  .a(ble.l)
                  .a(ble.m)
                  .a(ble.n)
                  .a(ble.p)
                  .a(ble.r)
                  .a(ble.s)
                  .a(ble.t)
                  .a(ble.c)
                  .a(ble.d)
                  .a(ble.y)
                  .a(ble.x)
                  .a(ble.v)
                  .a(ble.q)
                  .a(ble.i)
                  .a(ble.k)
                  .a(ble.B)
                  .a(ble.C)
                  .a(ble.D)
                  .a(ble.o)
                  .a(ble.E)
                  .a(ble.F)
                  .a(ble.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cmu.aC,
            vd.c("advancements.nether.obtain_ancient_debris.title"),
            vd.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", by.a.a(cmu.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cmu.pQ, vd.c("advancements.nether.netherite_armor.title"), vd.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", by.a.a(cmu.pP, cmu.pQ, cmu.pR, cmu.pS))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cmu.ws, vd.c("advancements.nether.use_lodestone.title"), vd.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cb.a.a(ci.a.a().a(au.a.a().a(cwl.pq)), ca.a.a().a(cmu.qP)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cmu.wt,
            vd.c("advancements.nether.obtain_crying_obsidian.title"),
            vd.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", by.a.a(cmu.wt))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cmu.wG,
            vd.c("advancements.nether.charge_respawn_anchor.title"),
            vd.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cb.a.a(ci.a.a().a(au.a.a().a(cwl.pl).a(cz.a.a().a(dcq.d, 4))), ca.a.a().a(cwl.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cmu.nR, vd.c("advancements.nether.ride_strider.title"), vd.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", bz.a.a(Optional.of(bp.a(bp.a.a().a(bp.a.a().a(blt.aW)))), Optional.of(ca.a.a().a(cmu.nR).b()), ck.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cmu.nR,
            vd.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            vd.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bh.a.a(bp.a.a().a(ci.a.b(cti.h)).a(bp.a.a().a(blt.aW)), bg.a(ck.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      kr.a(ae.a.a(), cuv.a.a.a().toList())
         .a($$13)
         .a(cmu.pS, vd.c("advancements.nether.explore_nether.title"), vd.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cmu.wC, vd.c("advancements.nether.find_bastion.title"), vd.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", cr.a.a(ci.a.c(dyt.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cwl.cv, vd.c("advancements.nether.loot_bastion.title"), vd.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cj.a.a(new ahd("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cj.a.a(new ahd("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cj.a.a(new ahd("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cj.a.a(new ahd("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cmu.oF, vd.c("advancements.nether.distract_piglin.title"), vd.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cn.a.a(a, Optional.of(ca.a.a().a(asj.U).b()), Optional.of(bp.a(bp.a.a().a(blt.ax).a(bn.a.a().e(false))))))
         .a("distract_piglin_directly", cp.a.a(Optional.of(a), ca.a.a().a(cds.c), Optional.of(bp.a(bp.a.a().a(blt.ax).a(bn.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
