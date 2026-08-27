import java.util.Optional;
import java.util.function.Consumer;

public class lu implements ln {
   private static final bc a = bc.a(
      erk.a(eoa.b.a, br.a.a().a(bo.a.a().a(cg.a.a().a(csg.pO)))).invert().build(),
      erk.a(eoa.b.a, br.a.a().a(bo.a.a().b(cg.a.a().a(csg.pP)))).invert().build(),
      erk.a(eoa.b.a, br.a.a().a(bo.a.a().c(cg.a.a().a(csg.pQ)))).invert().build(),
      erk.a(eoa.b.a, br.a.a().a(bo.a.a().d(cg.a.a().a(csg.pR)))).invert().build()
   );

   @Override
   public void a(ix.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcx.kL,
            ws.c("advancements.nether.root.title"),
            ws.c("advancements.nether.root.description"),
            new akf("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(czu.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(csg.tX, ws.c("advancements.nether.return_to_sender.title"), ws.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cl.a.a(br.a.a().a(bqr.T), bg.a.a().a(dl.a(avq.k)).a(br.a.a().a(bqr.aj))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dcx.fn, ws.c("advancements.nether.find_fortress.title"), ws.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", cz.a.a(cq.a.b($$0.b(ld.aI).b(ega.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(csg.uj, ws.c("advancements.nether.fast_travel.title"), ws.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(cs.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(csg.sh, ws.c("advancements.nether.uneasy_alliance.title"), ws.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cl.a.a(br.a.a().a(bqr.T).a(cq.a.a(czu.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dcx.gG, ws.c("advancements.nether.get_wither_skull.title"), ws.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ca.a.a(dcx.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(csg.us, ws.c("advancements.nether.summon_wither.title"), ws.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dk.a.a(br.a.a().a(bqr.bo)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(csg.sg, ws.c("advancements.nether.obtain_blaze_rod.title"), ws.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ca.a.a(csg.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dcx.fO, ws.c("advancements.nether.create_beacon.title"), ws.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(cs.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dcx.fO,
            ws.c("advancements.nether.create_full_beacon.title"),
            ws.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(cs.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(csg.sk, ws.c("advancements.nether.brew_potion.title"), ws.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(csg.qE, ws.c("advancements.nether.all_potions.title"), ws.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(ct.a.a().a(bpz.a).a(bpz.b).a(bpz.e).a(bpz.h).a(bpz.j).a(bpz.l).a(bpz.m).a(bpz.n).a(bpz.p).a(bpz.r).a(bpz.s).a(bpz.B).a(bpz.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(csg.qy, ws.c("advancements.nether.all_effects.title"), ws.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               ct.a.a()
                  .a(bpz.a)
                  .a(bpz.b)
                  .a(bpz.e)
                  .a(bpz.h)
                  .a(bpz.j)
                  .a(bpz.l)
                  .a(bpz.m)
                  .a(bpz.n)
                  .a(bpz.p)
                  .a(bpz.r)
                  .a(bpz.s)
                  .a(bpz.t)
                  .a(bpz.c)
                  .a(bpz.d)
                  .a(bpz.y)
                  .a(bpz.x)
                  .a(bpz.v)
                  .a(bpz.q)
                  .a(bpz.i)
                  .a(bpz.k)
                  .a(bpz.B)
                  .a(bpz.C)
                  .a(bpz.D)
                  .a(bpz.o)
                  .a(bpz.E)
                  .a(bpz.F)
                  .a(bpz.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            csg.aC,
            ws.c("advancements.nether.obtain_ancient_debris.title"),
            ws.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ca.a.a(csg.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(csg.pT, ws.c("advancements.nether.netherite_armor.title"), ws.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ca.a.a(csg.pS, csg.pT, csg.pU, csg.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(csg.wB, ws.c("advancements.nether.use_lodestone.title"), ws.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", cj.a.a(cq.a.a().a(av.a.a().a(dcx.pq)), cg.a.a().a(csg.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            csg.wC,
            ws.c("advancements.nether.obtain_crying_obsidian.title"),
            ws.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ca.a.a(csg.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            csg.wP,
            ws.c("advancements.nether.charge_respawn_anchor.title"),
            ws.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cj.a.a(cq.a.a().a(av.a.a().a(dcx.pl).a(dj.a.a().a(djd.d, 4))), cg.a.a().a(dcx.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(csg.nS, ws.c("advancements.nether.ride_strider.title"), ws.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cd.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bqr.aY)))), Optional.of(cg.a.a().a(csg.nS).b()), cs.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            csg.nS,
            ws.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            ws.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(cq.a.a(czu.h)).a(br.a.a().a(bqr.aY)), bi.a(cs.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      ls.a(ae.a.a(), $$0, dbh.a.a.a().toList())
         .a($$13)
         .a(csg.pV, ws.c("advancements.nether.explore_nether.title"), ws.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(csg.wL, ws.c("advancements.nether.find_bastion.title"), ws.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", cz.a.a(cq.a.b($$0.b(ld.aI).b(ega.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dcx.cv, ws.c("advancements.nether.loot_bastion.title"), ws.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cr.a.a(new akf("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", cr.a.a(new akf("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", cr.a.a(new akf("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", cr.a.a(new akf("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(csg.oI, ws.c("advancements.nether.distract_piglin.title"), ws.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cv.a.a(a, Optional.of(cg.a.a().a(avw.U).b()), Optional.of(br.a(br.a.a().a(bqr.az).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cx.a.a(Optional.of(a), cg.a.a().a(cjc.c), Optional.of(br.a(br.a.a().a(bqr.az).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
