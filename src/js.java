import java.util.function.Consumer;

public class js implements jn {
   private static final ba a = ba.a(
      efk.a(ech.b.a, bo.a.a().a(bl.a.a().a(bz.a.a().a(ciz.pa).b()).b())).invert().build(),
      efk.a(ech.b.a, bo.a.a().a(bl.a.a().b(bz.a.a().a(ciz.pb).b()).b())).invert().build(),
      efk.a(ech.b.a, bo.a.a().a(bl.a.a().c(bz.a.a().a(ciz.pc).b()).b())).invert().build(),
      efk.a(ech.b.a, bo.a.a().a(bl.a.a().d(bz.a.a().a(ciz.pd).b()).b())).invert().build()
   );

   @Override
   public void a(hh.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csl.kL,
            te.c("advancements.nether.root.title"),
            te.c("advancements.nether.root.description"),
            new aep("textures/gui/advancements/backgrounds/nether.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_nether", aw.a.a(cpk.i))
         .a($$1, "nether/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(ciz.tf, te.c("advancements.nether.return_to_sender.title"), te.c("advancements.nether.return_to_sender.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bik.Q), bd.a.a().a(db.a(apl.j)).a(bo.a.a().a(bik.ag))))
         .a($$1, "nether/return_to_sender");
      ae $$4 = ae.a.a()
         .a($$2)
         .a(csl.fn, te.c("advancements.nether.find_fortress.title"), te.c("advancements.nether.find_fortress.description"), null, ao.a, true, true, false)
         .a("fortress", cq.a.a(ch.c(dur.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(ciz.tp, te.c("advancements.nether.fast_travel.title"), te.c("advancements.nether.fast_travel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("travelled", bg.a.a(bf.a(cj.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(ciz.rs, te.c("advancements.nether.uneasy_alliance.title"), te.c("advancements.nether.uneasy_alliance.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bik.Q).a(ch.b(cpk.h))))
         .a($$1, "nether/uneasy_alliance");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(csl.gG, te.c("advancements.nether.get_wither_skull.title"), te.c("advancements.nether.get_wither_skull.description"), null, ao.a, true, true, false)
         .a("wither_skull", bx.a.a(csl.gG))
         .a($$1, "nether/get_wither_skull");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(ciz.ty, te.c("advancements.nether.summon_wither.title"), te.c("advancements.nether.summon_wither.description"), null, ao.a, true, true, false)
         .a("summoned", da.a.a(bo.a.a().a(bik.bk)))
         .a($$1, "nether/summon_wither");
      ae $$7 = ae.a.a()
         .a($$4)
         .a(ciz.rr, te.c("advancements.nether.obtain_blaze_rod.title"), te.c("advancements.nether.obtain_blaze_rod.description"), null, ao.a, true, true, false)
         .a("blaze_rod", bx.a.a(ciz.rr))
         .a($$1, "nether/obtain_blaze_rod");
      ae $$8 = ae.a.a()
         .a($$6)
         .a(csl.fO, te.c("advancements.nether.create_beacon.title"), te.c("advancements.nether.create_beacon.description"), null, ao.a, true, true, false)
         .a("beacon", ay.a.a(cj.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            csl.fO,
            te.c("advancements.nether.create_full_beacon.title"),
            te.c("advancements.nether.create_full_beacon.description"),
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
         .a(ciz.rv, te.c("advancements.nether.brew_potion.title"), te.c("advancements.nether.brew_potion.description"), null, ao.a, true, true, false)
         .a("potion", av.a.c())
         .a($$1, "nether/brew_potion");
      ae $$10 = ae.a.a()
         .a($$9)
         .a(ciz.pQ, te.c("advancements.nether.all_potions.title"), te.c("advancements.nether.all_potions.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("all_effects", bh.a.a(ck.a().a(bhv.a).a(bhv.b).a(bhv.e).a(bhv.h).a(bhv.j).a(bhv.l).a(bhv.m).a(bhv.n).a(bhv.p).a(bhv.r).a(bhv.s).a(bhv.B).a(bhv.k)))
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(ciz.pK, te.c("advancements.nether.all_effects.title"), te.c("advancements.nether.all_effects.description"), null, ao.b, true, true, true)
         .a(ah.a.a(1000))
         .a(
            "all_effects",
            bh.a.a(
               ck.a()
                  .a(bhv.a)
                  .a(bhv.b)
                  .a(bhv.e)
                  .a(bhv.h)
                  .a(bhv.j)
                  .a(bhv.l)
                  .a(bhv.m)
                  .a(bhv.n)
                  .a(bhv.p)
                  .a(bhv.r)
                  .a(bhv.s)
                  .a(bhv.t)
                  .a(bhv.c)
                  .a(bhv.d)
                  .a(bhv.y)
                  .a(bhv.x)
                  .a(bhv.v)
                  .a(bhv.q)
                  .a(bhv.i)
                  .a(bhv.k)
                  .a(bhv.B)
                  .a(bhv.C)
                  .a(bhv.D)
                  .a(bhv.o)
                  .a(bhv.E)
                  .a(bhv.F)
                  .a(bhv.G)
            )
         )
         .a($$1, "nether/all_effects");
      ae $$11 = ae.a.a()
         .a($$2)
         .a(
            ciz.ap,
            te.c("advancements.nether.obtain_ancient_debris.title"),
            te.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bx.a.a(ciz.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(ciz.pf, te.c("advancements.nether.netherite_armor.title"), te.c("advancements.nether.netherite_armor.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a("netherite_armor", bx.a.a(ciz.pe, ciz.pf, ciz.pg, ciz.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(ciz.vF, te.c("advancements.nether.use_lodestone.title"), te.c("advancements.nether.use_lodestone.description"), null, ao.a, true, true, false)
         .a("use_lodestone", ca.a.a(ch.a.a().a(at.a.a().a(csl.pq).b()), bz.a.a().a(ciz.qe)))
         .a($$1, "nether/use_lodestone");
      ae $$12 = ae.a.a()
         .a($$2)
         .a(
            ciz.vG,
            te.c("advancements.nether.obtain_crying_obsidian.title"),
            te.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bx.a.a(ciz.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            ciz.vT,
            te.c("advancements.nether.charge_respawn_anchor.title"),
            te.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ca.a.a(ch.a.a().a(at.a.a().a(csl.pl).a(cz.a.a().a(cyr.c, 4).b()).b()), bz.a.a().a(csl.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      ae $$13 = ae.a.a()
         .a($$2)
         .a(ciz.ng, te.c("advancements.nether.ride_strider.title"), te.c("advancements.nether.ride_strider.description"), null, ao.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", by.a.a(bo.a(bo.a.a().a(bo.a.a().a(bik.aV).b()).b()), bz.a.a().a(ciz.ng).b(), cj.d.e))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            ciz.ng,
            te.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            te.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bg.a.a(bo.a.a().a(ch.b(cpk.h)).a(bo.a.a().a(bik.aV).b()), bf.a(cj.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jq.a(ae.a.a(), cqw.a.a.a().toList())
         .a($$13)
         .a(ciz.ph, te.c("advancements.nether.explore_nether.title"), te.c("advancements.nether.explore_nether.description"), null, ao.b, true, true, false)
         .a(ah.a.a(500))
         .a($$1, "nether/explore_nether");
      ae $$14 = ae.a.a()
         .a($$2)
         .a(ciz.vP, te.c("advancements.nether.find_bastion.title"), te.c("advancements.nether.find_bastion.description"), null, ao.a, true, true, false)
         .a("bastion", cq.a.a(ch.c(dur.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(csl.cv, te.c("advancements.nether.loot_bastion.title"), te.c("advancements.nether.loot_bastion.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("loot_bastion_other", ci.a.a(new aep("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ci.a.a(new aep("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ci.a.a(new aep("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ci.a.a(new aep("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ap.b)
         .a(ciz.nU, te.c("advancements.nether.distract_piglin.title"), te.c("advancements.nether.distract_piglin.description"), null, ao.a, true, true, false)
         .a("distract_piglin", cm.a.a(a, bz.a.a().a(apr.U).b(), bo.a(bo.a.a().a(bik.aw).a(bm.a.a().e(false).b()).b())))
         .a("distract_piglin_directly", co.a.a(a, bz.a.a().a(cac.c), bo.a(bo.a.a().a(bik.aw).a(bm.a.a().e(false).b()).b())))
         .a($$1, "nether/distract_piglin");
   }
}
