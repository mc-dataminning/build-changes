import java.util.Optional;
import java.util.function.Consumer;

public class mh implements ma {
   private static final bf a = bf.a(
      etq.a(eqd.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cun.pO)))).invert().build(),
      etq.a(eqd.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cun.pP)))).invert().build(),
      etq.a(eqd.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cun.pQ)))).invert().build(),
      etq.a(eqd.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cun.pR)))).invert().build()
   );

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dew.kL,
            xl.c("advancements.nether.root.title"),
            xl.c("advancements.nether.root.description"),
            new alb("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dbt.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cun.tX, xl.c("advancements.nether.return_to_sender.title"), xl.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsv.T), bj.a.a().a(dz.a(awn.k)).a(bu.a.a().a(bsv.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dew.fn, xl.c("advancements.nether.find_fortress.title"), xl.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dl.a.a(dc.a.b($$0.b(lq.aJ).b(ehz.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cun.uj, xl.c("advancements.nether.fast_travel.title"), xl.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cun.sh, xl.c("advancements.nether.uneasy_alliance.title"), xl.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsv.T).a(dc.a.a(dbt.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dew.gG, xl.c("advancements.nether.get_wither_skull.title"), xl.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dew.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cun.us, xl.c("advancements.nether.summon_wither.title"), xl.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dy.a.a(bu.a.a().a(bsv.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cun.sg, xl.c("advancements.nether.obtain_blaze_rod.title"), xl.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cun.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dew.fO, xl.c("advancements.nether.create_beacon.title"), xl.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dew.fO,
            xl.c("advancements.nether.create_full_beacon.title"),
            xl.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", bd.a.a(de.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cun.sk, xl.c("advancements.nether.brew_potion.title"), xl.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cun.qE, xl.c("advancements.nether.all_potions.title"), xl.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(df.a.a().a(brz.a).a(brz.b).a(brz.e).a(brz.h).a(brz.j).a(brz.l).a(brz.m).a(brz.n).a(brz.p).a(brz.r).a(brz.s).a(brz.B).a(brz.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cun.qy, xl.c("advancements.nether.all_effects.title"), xl.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(brz.a)
                  .a(brz.b)
                  .a(brz.e)
                  .a(brz.h)
                  .a(brz.j)
                  .a(brz.l)
                  .a(brz.m)
                  .a(brz.n)
                  .a(brz.p)
                  .a(brz.r)
                  .a(brz.s)
                  .a(brz.t)
                  .a(brz.c)
                  .a(brz.d)
                  .a(brz.y)
                  .a(brz.x)
                  .a(brz.v)
                  .a(brz.q)
                  .a(brz.i)
                  .a(brz.k)
                  .a(brz.B)
                  .a(brz.C)
                  .a(brz.D)
                  .a(brz.o)
                  .a(brz.E)
                  .a(brz.F)
                  .a(brz.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cun.aC,
            xl.c("advancements.nether.obtain_ancient_debris.title"),
            xl.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cun.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cun.pT, xl.c("advancements.nether.netherite_armor.title"), xl.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cun.pS, cun.pT, cun.pU, cun.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cun.wB, xl.c("advancements.nether.use_lodestone.title"), xl.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dew.pq)), cp.a.a().a(cun.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cun.wC,
            xl.c("advancements.nether.obtain_crying_obsidian.title"),
            xl.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cun.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cun.wP,
            xl.c("advancements.nether.charge_respawn_anchor.title"),
            xl.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dew.pl).a(dx.a.a().a(dlc.d, 4))), cp.a.a().a(dew.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cun.nS, xl.c("advancements.nether.ride_strider.title"), xl.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsv.aZ)))), Optional.of(cp.a.a().a(cun.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cun.nS,
            xl.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xl.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dbt.h)).a(bu.a.a().a(bsv.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mf.a(ae.a.a(), $$0, ddg.a.a.a().toList())
         .a($$13)
         .a(cun.pV, xl.c("advancements.nether.explore_nether.title"), xl.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cun.wL, xl.c("advancements.nether.find_bastion.title"), xl.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dl.a.a(dc.a.b($$0.b(lq.aJ).b(ehz.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dew.cv, xl.c("advancements.nether.loot_bastion.title"), xl.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(epz.M))
         .a("loot_bastion_treasure", dd.a.a(epz.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(epz.O))
         .a("loot_bastion_bridge", dd.a.a(epz.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cun.oI, xl.c("advancements.nether.distract_piglin.title"), xl.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", dh.a.a(a, Optional.of(cp.a.a().a(awu.U).b()), Optional.of(bu.a(bu.a.a().a(bsv.aA).a(bs.a.a().e(false))))))
         .a("distract_piglin_directly", dj.a.a(Optional.of(a), cp.a.a().a(clj.c), Optional.of(bu.a(bu.a.a().a(bsv.aA).a(bs.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
