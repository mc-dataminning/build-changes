import java.util.function.Consumer;

public class jr implements jm {
   private static final ba a = ba.a(
      ecn.a(dzk.b.a, bo.a.a().a(bl.a.a().a(bz.a.a().a(cgc.pa).b()).b())).invert().build(),
      ecn.a(dzk.b.a, bo.a.a().a(bl.a.a().b(bz.a.a().a(cgc.pb).b()).b())).invert().build(),
      ecn.a(dzk.b.a, bo.a.a().a(bl.a.a().c(bz.a.a().a(cgc.pc).b()).b())).invert().build(),
      ecn.a(dzk.b.a, bo.a.a().a(bl.a.a().d(bz.a.a().a(cgc.pd).b()).b())).invert().build()
   );

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cpo.kL,
            sw.c("advancements.nether.root.title"),
            sw.c("advancements.nether.root.description"),
            new acq("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", aw.a.a(cmm.i))
         .a($$1, "nether/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cgc.tf, sw.c("advancements.nether.return_to_sender.title"), sw.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bfn.Q), bd.a.a().a(db.a(amy.j)).a(bo.a.a().a(bfn.ag))))
         .a($$1, "nether/return_to_sender");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(cpo.fn, sw.c("advancements.nether.find_fortress.title"), sw.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", cq.a.a(ch.c(dru.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cgc.tp, sw.c("advancements.nether.fast_travel.title"), sw.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("travelled", bg.a.a(bf.a(cj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cgc.rs, sw.c("advancements.nether.uneasy_alliance.title"), sw.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bfn.Q).a(ch.b(cmm.h))))
         .a($$1, "nether/uneasy_alliance");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(cpo.gG, sw.c("advancements.nether.get_wither_skull.title"), sw.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", bx.a.a(cpo.gG))
         .a($$1, "nether/get_wither_skull");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cgc.ty, sw.c("advancements.nether.summon_wither.title"), sw.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", da.a.a(bo.a.a().a(bfn.bk)))
         .a($$1, "nether/summon_wither");
      ae $$7 = ae.a.a()
         .a($$4)
         .a(cgc.rr, sw.c("advancements.nether.obtain_blaze_rod.title"), sw.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", bx.a.a(cgc.rr))
         .a($$1, "nether/obtain_blaze_rod");
      ae $$8 = ae.a.a()
         .a($$6)
         .a(cpo.fO, sw.c("advancements.nether.create_beacon.title"), sw.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", ay.a.a(cj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            cpo.fO,
            sw.c("advancements.nether.create_full_beacon.title"),
            sw.c("advancements.nether.create_full_beacon.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("beacon", ay.a.a(cj.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ae $$9 = ae.a.a()
         .a($$7)
         .a(cgc.rv, sw.c("advancements.nether.brew_potion.title"), sw.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", av.a.c())
         .a($$1, "nether/brew_potion");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(cgc.pQ, sw.c("advancements.nether.all_potions.title"), sw.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("all_effects", bh.a.a(ck.a().a(bfc.a).a(bfc.b).a(bfc.e).a(bfc.h).a(bfc.j).a(bfc.l).a(bfc.m).a(bfc.n).a(bfc.p).a(bfc.r).a(bfc.s).a(bfc.B).a(bfc.k)))
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cgc.pK, sw.c("advancements.nether.all_effects.title"), sw.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(ah.a.a(1000))
         .a(
            "all_effects",
            bh.a.a(
               ck.a()
                  .a(bfc.a)
                  .a(bfc.b)
                  .a(bfc.e)
                  .a(bfc.h)
                  .a(bfc.j)
                  .a(bfc.l)
                  .a(bfc.m)
                  .a(bfc.n)
                  .a(bfc.p)
                  .a(bfc.r)
                  .a(bfc.s)
                  .a(bfc.t)
                  .a(bfc.c)
                  .a(bfc.d)
                  .a(bfc.y)
                  .a(bfc.x)
                  .a(bfc.v)
                  .a(bfc.q)
                  .a(bfc.i)
                  .a(bfc.k)
                  .a(bfc.B)
                  .a(bfc.C)
                  .a(bfc.D)
                  .a(bfc.o)
                  .a(bfc.E)
                  .a(bfc.F)
                  .a(bfc.G)
            )
         )
         .a($$1, "nether/all_effects");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(
            cgc.ap,
            sw.c("advancements.nether.obtain_ancient_debris.title"),
            sw.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bx.a.a(cgc.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cgc.pf, sw.c("advancements.nether.netherite_armor.title"), sw.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_armor", bx.a.a(cgc.pe, cgc.pf, cgc.pg, cgc.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cgc.vF, sw.c("advancements.nether.use_lodestone.title"), sw.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", ca.a.a(ch.a.a().a(at.a.a().a(cpo.pq).b()), bz.a.a().a(cgc.qe)))
         .a($$1, "nether/use_lodestone");
      ae $$12 = ae.a.a()
         .a($$2)
         .a(
            cgc.vG,
            sw.c("advancements.nether.obtain_crying_obsidian.title"),
            sw.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bx.a.a(cgc.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cgc.vT,
            sw.c("advancements.nether.charge_respawn_anchor.title"),
            sw.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ca.a.a(ch.a.a().a(at.a.a().a(cpo.pl).a(cz.a.a().a(cvu.c, 4).b()).b()), bz.a.a().a(cpo.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(cgc.ng, sw.c("advancements.nether.ride_strider.title"), sw.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", by.a.a(bo.a(bo.a.a().a(bo.a.a().a(bfn.aV).b()).b()), bz.a.a().a(cgc.ng).b(), cj.d.e))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cgc.ng,
            sw.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            sw.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bg.a.a(bo.a.a().a(ch.b(cmm.h)).a(bo.a.a().a(bfn.aV).b()), bf.a(cj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jp.a(ae.a.a(), cny.a.a.a().toList())
         .a($$13)
         .a(cgc.ph, sw.c("advancements.nether.explore_nether.title"), sw.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(ah.a.a(500))
         .a($$1, "nether/explore_nether");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(cgc.vP, sw.c("advancements.nether.find_bastion.title"), sw.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", cq.a.a(ch.c(dru.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(cpo.cv, sw.c("advancements.nether.loot_bastion.title"), sw.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("loot_bastion_other", ci.a.a(new acq("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ci.a.a(new acq("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ci.a.a(new acq("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ci.a.a(new acq("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ap.b)
         .a(cgc.nU, sw.c("advancements.nether.distract_piglin.title"), sw.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cm.a.a(a, bz.a.a().a(ane.U).b(), bo.a(bo.a.a().a(bfn.aw).a(bm.a.a().e(false).b()).b())))
         .a("distract_piglin_directly", co.a.a(a, bz.a.a().a(bxf.c), bo.a(bo.a.a().a(bfn.aw).a(bm.a.a().e(false).b()).b())))
         .a($$1, "nether/distract_piglin");
   }
}
