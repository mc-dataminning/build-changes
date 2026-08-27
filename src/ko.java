import java.util.Optional;
import java.util.function.Consumer;

public class ko implements kj {
   private static final bc a = bc.a(
      ehz.a(eex.b.a, bq.a.a().a(bn.a.a().a(cb.a.a().a(clm.pL)))).invert().build(),
      ehz.a(eex.b.a, bq.a.a().a(bn.a.a().b(cb.a.a().a(clm.pM)))).invert().build(),
      ehz.a(eex.b.a, bq.a.a().a(bn.a.a().c(cb.a.a().a(clm.pN)))).invert().build(),
      ehz.a(eex.b.a, bq.a.a().a(bn.a.a().d(cb.a.a().a(clm.pO)))).invert().build()
   );

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvc.kL,
            ur.c("advancements.nether.root.title"),
            ur.c("advancements.nether.root.description"),
            new agi("textures/gui/advancements/backgrounds/nether.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(csa.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(clm.tR, ur.c("advancements.nether.return_to_sender.title"), ur.c("advancements.nether.return_to_sender.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bku.Q), bf.a.a().a(dc.a(ari.j)).a(bq.a.a().a(bku.ag))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(cvc.fn, ur.c("advancements.nether.find_fortress.title"), ur.c("advancements.nether.find_fortress.description"), null, ar.a, true, true, false)
         .a("fortress", cs.a.a(cj.a.c(dxb.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(clm.ub, ur.c("advancements.nether.fast_travel.title"), ur.c("advancements.nether.fast_travel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bi.a.a(bh.a(cl.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(clm.se, ur.c("advancements.nether.uneasy_alliance.title"), ur.c("advancements.nether.uneasy_alliance.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bku.Q).a(cj.a.b(csa.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cvc.gG, ur.c("advancements.nether.get_wither_skull.title"), ur.c("advancements.nether.get_wither_skull.description"), null, ar.a, true, true, false)
         .a("wither_skull", bz.a.a(cvc.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(clm.uk, ur.c("advancements.nether.summon_wither.title"), ur.c("advancements.nether.summon_wither.description"), null, ar.a, true, true, false)
         .a("summoned", db.a.a(bq.a.a().a(bku.bk)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(clm.sd, ur.c("advancements.nether.obtain_blaze_rod.title"), ur.c("advancements.nether.obtain_blaze_rod.description"), null, ar.a, true, true, false)
         .a("blaze_rod", bz.a.a(clm.sd))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(cvc.fO, ur.c("advancements.nether.create_beacon.title"), ur.c("advancements.nether.create_beacon.description"), null, ar.a, true, true, false)
         .a("beacon", ba.a.a(cl.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cvc.fO,
            ur.c("advancements.nether.create_full_beacon.title"),
            ur.c("advancements.nether.create_full_beacon.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(cl.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(clm.sh, ur.c("advancements.nether.brew_potion.title"), ur.c("advancements.nether.brew_potion.description"), null, ar.a, true, true, false)
         .a("potion", ax.a.c())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(clm.qB, ur.c("advancements.nether.all_potions.title"), ur.c("advancements.nether.all_potions.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bj.a.a(cm.a.a().a(bkf.a).a(bkf.b).a(bkf.e).a(bkf.h).a(bkf.j).a(bkf.l).a(bkf.m).a(bkf.n).a(bkf.p).a(bkf.r).a(bkf.s).a(bkf.B).a(bkf.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(clm.qv, ur.c("advancements.nether.all_effects.title"), ur.c("advancements.nether.all_effects.description"), null, ar.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bj.a.a(
               cm.a.a()
                  .a(bkf.a)
                  .a(bkf.b)
                  .a(bkf.e)
                  .a(bkf.h)
                  .a(bkf.j)
                  .a(bkf.l)
                  .a(bkf.m)
                  .a(bkf.n)
                  .a(bkf.p)
                  .a(bkf.r)
                  .a(bkf.s)
                  .a(bkf.t)
                  .a(bkf.c)
                  .a(bkf.d)
                  .a(bkf.y)
                  .a(bkf.x)
                  .a(bkf.v)
                  .a(bkf.q)
                  .a(bkf.i)
                  .a(bkf.k)
                  .a(bkf.B)
                  .a(bkf.C)
                  .a(bkf.D)
                  .a(bkf.o)
                  .a(bkf.E)
                  .a(bkf.F)
                  .a(bkf.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            clm.aC,
            ur.c("advancements.nether.obtain_ancient_debris.title"),
            ur.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bz.a.a(clm.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(clm.pQ, ur.c("advancements.nether.netherite_armor.title"), ur.c("advancements.nether.netherite_armor.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", bz.a.a(clm.pP, clm.pQ, clm.pR, clm.pS))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(clm.wr, ur.c("advancements.nether.use_lodestone.title"), ur.c("advancements.nether.use_lodestone.description"), null, ar.a, true, true, false)
         .a("use_lodestone", cc.a.a(cj.a.a().a(av.a.a().a(cvc.pq)), cb.a.a().a(clm.qP)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            clm.ws,
            ur.c("advancements.nether.obtain_crying_obsidian.title"),
            ur.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bz.a.a(clm.ws))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            clm.wF,
            ur.c("advancements.nether.charge_respawn_anchor.title"),
            ur.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cc.a.a(cj.a.a().a(av.a.a().a(cvc.pl).a(da.a.a().a(dbh.d, 4))), cb.a.a().a(cvc.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(clm.nR, ur.c("advancements.nether.ride_strider.title"), ur.c("advancements.nether.ride_strider.description"), null, ar.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ca.a.a(Optional.of(bq.a(bq.a.a().a(bq.a.a().a(bku.aV)))), Optional.of(cb.a.a().a(clm.nR).b()), cl.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            clm.nR,
            ur.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            ur.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bi.a.a(bq.a.a().a(cj.a.b(csa.h)).a(bq.a.a().a(bku.aV)), bh.a(cl.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      km.a(ae.a.a(), ctm.a.a.a().toList())
         .a($$13)
         .a(clm.pS, ur.c("advancements.nether.explore_nether.title"), ur.c("advancements.nether.explore_nether.description"), null, ar.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(clm.wB, ur.c("advancements.nether.find_bastion.title"), ur.c("advancements.nether.find_bastion.description"), null, ar.a, true, true, false)
         .a("bastion", cs.a.a(cj.a.c(dxb.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cvc.cv, ur.c("advancements.nether.loot_bastion.title"), ur.c("advancements.nether.loot_bastion.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", ck.a.a(new agi("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ck.a.a(new agi("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ck.a.a(new agi("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ck.a.a(new agi("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(clm.oF, ur.c("advancements.nether.distract_piglin.title"), ur.c("advancements.nether.distract_piglin.description"), null, ar.a, true, true, false)
         .a("distract_piglin", co.a.a(a, Optional.of(cb.a.a().a(aro.U).b()), Optional.of(bq.a(bq.a.a().a(bku.aw).a(bo.a.a().e(false))))))
         .a("distract_piglin_directly", cq.a.a(Optional.of(a), cb.a.a().a(ccl.c), Optional.of(bq.a(bq.a.a().a(bku.aw).a(bo.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
