import java.util.Optional;
import java.util.function.Consumer;

public class jt implements jo {
   private static final bc a = bc.a(
      efu.a(ecs.b.a, bq.a.a().a(bn.a.a().a(cb.a.a().a(cjk.pa)))).invert().build(),
      efu.a(ecs.b.a, bq.a.a().a(bn.a.a().b(cb.a.a().a(cjk.pb)))).invert().build(),
      efu.a(ecs.b.a, bq.a.a().a(bn.a.a().c(cb.a.a().a(cjk.pc)))).invert().build(),
      efu.a(ecs.b.a, bq.a.a().a(bn.a.a().d(cb.a.a().a(cjk.pd)))).invert().build()
   );

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csy.kL,
            tn.c("advancements.nether.root.title"),
            tn.c("advancements.nether.root.description"),
            new aey("textures/gui/advancements/backgrounds/nether.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cpx.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjk.tf, tn.c("advancements.nether.return_to_sender.title"), tn.c("advancements.nether.return_to_sender.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", ce.a.a(bq.a.a().a(biw.Q), bf.a.a().a(dc.a(apw.j)).a(bq.a.a().a(biw.ag))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(csy.fn, tn.c("advancements.nether.find_fortress.title"), tn.c("advancements.nether.find_fortress.description"), null, ar.a, true, true, false)
         .a("fortress", cs.a.a(cj.a.c(dve.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cjk.tp, tn.c("advancements.nether.fast_travel.title"), tn.c("advancements.nether.fast_travel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bi.a.a(bh.a(cl.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cjk.rs, tn.c("advancements.nether.uneasy_alliance.title"), tn.c("advancements.nether.uneasy_alliance.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", ce.a.a(bq.a.a().a(biw.Q).a(cj.a.b(cpx.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csy.gG, tn.c("advancements.nether.get_wither_skull.title"), tn.c("advancements.nether.get_wither_skull.description"), null, ar.a, true, true, false)
         .a("wither_skull", bz.a.a(csy.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjk.ty, tn.c("advancements.nether.summon_wither.title"), tn.c("advancements.nether.summon_wither.description"), null, ar.a, true, true, false)
         .a("summoned", db.a.a(bq.a.a().a(biw.bk)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cjk.rr, tn.c("advancements.nether.obtain_blaze_rod.title"), tn.c("advancements.nether.obtain_blaze_rod.description"), null, ar.a, true, true, false)
         .a("blaze_rod", bz.a.a(cjk.rr))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(csy.fO, tn.c("advancements.nether.create_beacon.title"), tn.c("advancements.nether.create_beacon.description"), null, ar.a, true, true, false)
         .a("beacon", ba.a.a(cl.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            csy.fO,
            tn.c("advancements.nether.create_full_beacon.title"),
            tn.c("advancements.nether.create_full_beacon.description"),
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
         .a(cjk.rv, tn.c("advancements.nether.brew_potion.title"), tn.c("advancements.nether.brew_potion.description"), null, ar.a, true, true, false)
         .a("potion", ax.a.c())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjk.pQ, tn.c("advancements.nether.all_potions.title"), tn.c("advancements.nether.all_potions.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bj.a.a(cm.a.a().a(bih.a).a(bih.b).a(bih.e).a(bih.h).a(bih.j).a(bih.l).a(bih.m).a(bih.n).a(bih.p).a(bih.r).a(bih.s).a(bih.B).a(bih.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cjk.pK, tn.c("advancements.nether.all_effects.title"), tn.c("advancements.nether.all_effects.description"), null, ar.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bj.a.a(
               cm.a.a()
                  .a(bih.a)
                  .a(bih.b)
                  .a(bih.e)
                  .a(bih.h)
                  .a(bih.j)
                  .a(bih.l)
                  .a(bih.m)
                  .a(bih.n)
                  .a(bih.p)
                  .a(bih.r)
                  .a(bih.s)
                  .a(bih.t)
                  .a(bih.c)
                  .a(bih.d)
                  .a(bih.y)
                  .a(bih.x)
                  .a(bih.v)
                  .a(bih.q)
                  .a(bih.i)
                  .a(bih.k)
                  .a(bih.B)
                  .a(bih.C)
                  .a(bih.D)
                  .a(bih.o)
                  .a(bih.E)
                  .a(bih.F)
                  .a(bih.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cjk.ap,
            tn.c("advancements.nether.obtain_ancient_debris.title"),
            tn.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bz.a.a(cjk.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cjk.pf, tn.c("advancements.nether.netherite_armor.title"), tn.c("advancements.nether.netherite_armor.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", bz.a.a(cjk.pe, cjk.pf, cjk.pg, cjk.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cjk.vF, tn.c("advancements.nether.use_lodestone.title"), tn.c("advancements.nether.use_lodestone.description"), null, ar.a, true, true, false)
         .a("use_lodestone", cc.a.a(cj.a.a().a(av.a.a().a(csy.pq)), cb.a.a().a(cjk.qe)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cjk.vG,
            tn.c("advancements.nether.obtain_crying_obsidian.title"),
            tn.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bz.a.a(cjk.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cjk.vT,
            tn.c("advancements.nether.charge_respawn_anchor.title"),
            tn.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cc.a.a(cj.a.a().a(av.a.a().a(csy.pl).a(da.a.a().a(cze.c, 4))), cb.a.a().a(csy.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cjk.ng, tn.c("advancements.nether.ride_strider.title"), tn.c("advancements.nether.ride_strider.description"), null, ar.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ca.a.a(Optional.of(bq.a(bq.a.a().a(bq.a.a().a(biw.aV)))), Optional.of(cb.a.a().a(cjk.ng).b()), cl.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cjk.ng,
            tn.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            tn.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bi.a.a(bq.a.a().a(cj.a.b(cpx.h)).a(bq.a.a().a(biw.aV)), bh.a(cl.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jr.a(ae.a.a(), crj.a.a.a().toList())
         .a($$13)
         .a(cjk.ph, tn.c("advancements.nether.explore_nether.title"), tn.c("advancements.nether.explore_nether.description"), null, ar.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cjk.vP, tn.c("advancements.nether.find_bastion.title"), tn.c("advancements.nether.find_bastion.description"), null, ar.a, true, true, false)
         .a("bastion", cs.a.a(cj.a.c(dve.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(csy.cv, tn.c("advancements.nether.loot_bastion.title"), tn.c("advancements.nether.loot_bastion.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", ck.a.a(new aey("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ck.a.a(new aey("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ck.a.a(new aey("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ck.a.a(new aey("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cjk.nU, tn.c("advancements.nether.distract_piglin.title"), tn.c("advancements.nether.distract_piglin.description"), null, ar.a, true, true, false)
         .a("distract_piglin", co.a.a(a, Optional.of(cb.a.a().a(aqc.U).b()), Optional.of(bq.a(bq.a.a().a(biw.aw).a(bo.a.a().e(false))))))
         .a("distract_piglin_directly", cq.a.a(Optional.of(a), cb.a.a().a(can.c), Optional.of(bq.a(bq.a.a().a(biw.aw).a(bo.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
