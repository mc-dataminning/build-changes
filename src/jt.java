import java.util.Optional;
import java.util.function.Consumer;

public class jt implements jo {
   private static final bc a = bc.a(
      efs.a(ecq.b.a, bq.a.a().a(bn.a.a().a(cb.a.a().a(cji.pa)))).invert().build(),
      efs.a(ecq.b.a, bq.a.a().a(bn.a.a().b(cb.a.a().a(cji.pb)))).invert().build(),
      efs.a(ecq.b.a, bq.a.a().a(bn.a.a().c(cb.a.a().a(cji.pc)))).invert().build(),
      efs.a(ecq.b.a, bq.a.a().a(bn.a.a().d(cb.a.a().a(cji.pd)))).invert().build()
   );

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csw.kL,
            tm.c("advancements.nether.root.title"),
            tm.c("advancements.nether.root.description"),
            new aex("textures/gui/advancements/backgrounds/nether.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cpv.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cji.tf, tm.c("advancements.nether.return_to_sender.title"), tm.c("advancements.nether.return_to_sender.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", ce.a.a(bq.a.a().a(biu.Q), bf.a.a().a(dc.a(apv.j)).a(bq.a.a().a(biu.ag))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(csw.fn, tm.c("advancements.nether.find_fortress.title"), tm.c("advancements.nether.find_fortress.description"), null, ar.a, true, true, false)
         .a("fortress", cs.a.a(cj.a.c(dvc.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cji.tp, tm.c("advancements.nether.fast_travel.title"), tm.c("advancements.nether.fast_travel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bi.a.a(bh.a(cl.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cji.rs, tm.c("advancements.nether.uneasy_alliance.title"), tm.c("advancements.nether.uneasy_alliance.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", ce.a.a(bq.a.a().a(biu.Q).a(cj.a.b(cpv.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csw.gG, tm.c("advancements.nether.get_wither_skull.title"), tm.c("advancements.nether.get_wither_skull.description"), null, ar.a, true, true, false)
         .a("wither_skull", bz.a.a(csw.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cji.ty, tm.c("advancements.nether.summon_wither.title"), tm.c("advancements.nether.summon_wither.description"), null, ar.a, true, true, false)
         .a("summoned", db.a.a(bq.a.a().a(biu.bk)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cji.rr, tm.c("advancements.nether.obtain_blaze_rod.title"), tm.c("advancements.nether.obtain_blaze_rod.description"), null, ar.a, true, true, false)
         .a("blaze_rod", bz.a.a(cji.rr))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(csw.fO, tm.c("advancements.nether.create_beacon.title"), tm.c("advancements.nether.create_beacon.description"), null, ar.a, true, true, false)
         .a("beacon", ba.a.a(cl.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            csw.fO,
            tm.c("advancements.nether.create_full_beacon.title"),
            tm.c("advancements.nether.create_full_beacon.description"),
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
         .a(cji.rv, tm.c("advancements.nether.brew_potion.title"), tm.c("advancements.nether.brew_potion.description"), null, ar.a, true, true, false)
         .a("potion", ax.a.c())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cji.pQ, tm.c("advancements.nether.all_potions.title"), tm.c("advancements.nether.all_potions.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bj.a.a(cm.a.a().a(bif.a).a(bif.b).a(bif.e).a(bif.h).a(bif.j).a(bif.l).a(bif.m).a(bif.n).a(bif.p).a(bif.r).a(bif.s).a(bif.B).a(bif.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cji.pK, tm.c("advancements.nether.all_effects.title"), tm.c("advancements.nether.all_effects.description"), null, ar.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bj.a.a(
               cm.a.a()
                  .a(bif.a)
                  .a(bif.b)
                  .a(bif.e)
                  .a(bif.h)
                  .a(bif.j)
                  .a(bif.l)
                  .a(bif.m)
                  .a(bif.n)
                  .a(bif.p)
                  .a(bif.r)
                  .a(bif.s)
                  .a(bif.t)
                  .a(bif.c)
                  .a(bif.d)
                  .a(bif.y)
                  .a(bif.x)
                  .a(bif.v)
                  .a(bif.q)
                  .a(bif.i)
                  .a(bif.k)
                  .a(bif.B)
                  .a(bif.C)
                  .a(bif.D)
                  .a(bif.o)
                  .a(bif.E)
                  .a(bif.F)
                  .a(bif.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cji.ap,
            tm.c("advancements.nether.obtain_ancient_debris.title"),
            tm.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bz.a.a(cji.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cji.pf, tm.c("advancements.nether.netherite_armor.title"), tm.c("advancements.nether.netherite_armor.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", bz.a.a(cji.pe, cji.pf, cji.pg, cji.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cji.vF, tm.c("advancements.nether.use_lodestone.title"), tm.c("advancements.nether.use_lodestone.description"), null, ar.a, true, true, false)
         .a("use_lodestone", cc.a.a(cj.a.a().a(av.a.a().a(csw.pq)), cb.a.a().a(cji.qe)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cji.vG,
            tm.c("advancements.nether.obtain_crying_obsidian.title"),
            tm.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bz.a.a(cji.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cji.vT,
            tm.c("advancements.nether.charge_respawn_anchor.title"),
            tm.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cc.a.a(cj.a.a().a(av.a.a().a(csw.pl).a(da.a.a().a(czc.c, 4))), cb.a.a().a(csw.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cji.ng, tm.c("advancements.nether.ride_strider.title"), tm.c("advancements.nether.ride_strider.description"), null, ar.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ca.a.a(Optional.of(bq.a(bq.a.a().a(bq.a.a().a(biu.aV)))), Optional.of(cb.a.a().a(cji.ng).b()), cl.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cji.ng,
            tm.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            tm.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bi.a.a(bq.a.a().a(cj.a.b(cpv.h)).a(bq.a.a().a(biu.aV)), bh.a(cl.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jr.a(ae.a.a(), crh.a.a.a().toList())
         .a($$13)
         .a(cji.ph, tm.c("advancements.nether.explore_nether.title"), tm.c("advancements.nether.explore_nether.description"), null, ar.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cji.vP, tm.c("advancements.nether.find_bastion.title"), tm.c("advancements.nether.find_bastion.description"), null, ar.a, true, true, false)
         .a("bastion", cs.a.a(cj.a.c(dvc.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(csw.cv, tm.c("advancements.nether.loot_bastion.title"), tm.c("advancements.nether.loot_bastion.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", ck.a.a(new aex("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ck.a.a(new aex("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ck.a.a(new aex("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ck.a.a(new aex("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cji.nU, tm.c("advancements.nether.distract_piglin.title"), tm.c("advancements.nether.distract_piglin.description"), null, ar.a, true, true, false)
         .a("distract_piglin", co.a.a(a, Optional.of(cb.a.a().a(aqb.U).b()), Optional.of(bq.a(bq.a.a().a(biu.aw).a(bo.a.a().e(false))))))
         .a("distract_piglin_directly", cq.a.a(Optional.of(a), cb.a.a().a(cal.c), Optional.of(bq.a(bq.a.a().a(biu.aw).a(bo.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
