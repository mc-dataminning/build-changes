import java.util.Optional;
import java.util.function.Consumer;

public class lv implements lo {
   private static final bc a = bc.a(
      ert.a(eol.b.a, br.a.a().a(bo.a.a().a(ch.a.a().a(ctc.pO)))).invert().build(),
      ert.a(eol.b.a, br.a.a().a(bo.a.a().b(ch.a.a().a(ctc.pP)))).invert().build(),
      ert.a(eol.b.a, br.a.a().a(bo.a.a().c(ch.a.a().a(ctc.pQ)))).invert().build(),
      ert.a(eol.b.a, br.a.a().a(bo.a.a().d(ch.a.a().a(ctc.pR)))).invert().build()
   );

   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ddg.kL,
            wu.c("advancements.nether.root.title"),
            wu.c("advancements.nether.root.description"),
            new akh("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dad.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctc.tX, wu.c("advancements.nether.return_to_sender.title"), wu.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cm.a.a(br.a.a().a(brn.T), bg.a.a().a(dm.a(avt.k)).a(br.a.a().a(brn.aj))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(ddg.fn, wu.c("advancements.nether.find_fortress.title"), wu.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", da.a.a(cr.a.b($$0.b(le.aJ).b(egj.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(ctc.uj, wu.c("advancements.nether.fast_travel.title"), wu.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(ct.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(ctc.sh, wu.c("advancements.nether.uneasy_alliance.title"), wu.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cm.a.a(br.a.a().a(brn.T).a(cr.a.a(dad.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(ddg.gG, wu.c("advancements.nether.get_wither_skull.title"), wu.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", cb.a.a(ddg.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctc.us, wu.c("advancements.nether.summon_wither.title"), wu.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dl.a.a(br.a.a().a(brn.bo)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(ctc.sg, wu.c("advancements.nether.obtain_blaze_rod.title"), wu.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", cb.a.a(ctc.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(ddg.fO, wu.c("advancements.nether.create_beacon.title"), wu.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(ct.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            ddg.fO,
            wu.c("advancements.nether.create_full_beacon.title"),
            wu.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(ct.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(ctc.sk, wu.c("advancements.nether.brew_potion.title"), wu.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(ctc.qE, wu.c("advancements.nether.all_potions.title"), wu.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cu.a.a().a(bqv.a).a(bqv.b).a(bqv.e).a(bqv.h).a(bqv.j).a(bqv.l).a(bqv.m).a(bqv.n).a(bqv.p).a(bqv.r).a(bqv.s).a(bqv.B).a(bqv.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(ctc.qy, wu.c("advancements.nether.all_effects.title"), wu.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cu.a.a()
                  .a(bqv.a)
                  .a(bqv.b)
                  .a(bqv.e)
                  .a(bqv.h)
                  .a(bqv.j)
                  .a(bqv.l)
                  .a(bqv.m)
                  .a(bqv.n)
                  .a(bqv.p)
                  .a(bqv.r)
                  .a(bqv.s)
                  .a(bqv.t)
                  .a(bqv.c)
                  .a(bqv.d)
                  .a(bqv.y)
                  .a(bqv.x)
                  .a(bqv.v)
                  .a(bqv.q)
                  .a(bqv.i)
                  .a(bqv.k)
                  .a(bqv.B)
                  .a(bqv.C)
                  .a(bqv.D)
                  .a(bqv.o)
                  .a(bqv.E)
                  .a(bqv.F)
                  .a(bqv.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            ctc.aC,
            wu.c("advancements.nether.obtain_ancient_debris.title"),
            wu.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cb.a.a(ctc.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(ctc.pT, wu.c("advancements.nether.netherite_armor.title"), wu.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", cb.a.a(ctc.pS, ctc.pT, ctc.pU, ctc.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(ctc.wB, wu.c("advancements.nether.use_lodestone.title"), wu.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ck.a.a(cr.a.a().a(av.a.a().a(ddg.pq)), ch.a.a().a(ctc.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            ctc.wC,
            wu.c("advancements.nether.obtain_crying_obsidian.title"),
            wu.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cb.a.a(ctc.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            ctc.wP,
            wu.c("advancements.nether.charge_respawn_anchor.title"),
            wu.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ck.a.a(cr.a.a().a(av.a.a().a(ddg.pl).a(dk.a.a().a(djm.d, 4))), ch.a.a().a(ddg.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(ctc.nS, wu.c("advancements.nether.ride_strider.title"), wu.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ce.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(brn.aY)))), Optional.of(ch.a.a().a(ctc.nS).b()), ct.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            ctc.nS,
            wu.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wu.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(cr.a.a(dad.h)).a(br.a.a().a(brn.aY)), bi.a(ct.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      lt.a(ae.a.a(), $$0, dbq.a.a.a().toList())
         .a($$13)
         .a(ctc.pV, wu.c("advancements.nether.explore_nether.title"), wu.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(ctc.wL, wu.c("advancements.nether.find_bastion.title"), wu.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", da.a.a(cr.a.b($$0.b(le.aJ).b(egj.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(ddg.cv, wu.c("advancements.nether.loot_bastion.title"), wu.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cs.a.a(eoj.M))
         .a("loot_bastion_treasure", cs.a.a(eoj.L))
         .a("loot_bastion_hoglin_stable", cs.a.a(eoj.O))
         .a("loot_bastion_bridge", cs.a.a(eoj.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(ctc.oI, wu.c("advancements.nether.distract_piglin.title"), wu.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cw.a.a(a, Optional.of(ch.a.a().a(avz.U).b()), Optional.of(br.a(br.a.a().a(brn.az).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cy.a.a(Optional.of(a), ch.a.a().a(cjy.c), Optional.of(br.a(br.a.a().a(brn.az).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
