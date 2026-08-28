import java.util.Optional;
import java.util.function.Consumer;

public class mh implements ma {
   private static final bf a = bf.a(
      ett.a(eqg.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cuq.pO)))).invert().build(),
      ett.a(eqg.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cuq.pP)))).invert().build(),
      ett.a(eqg.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cuq.pQ)))).invert().build(),
      ett.a(eqg.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cuq.pR)))).invert().build()
   );

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dez.kL,
            xo.c("advancements.nether.root.title"),
            xo.c("advancements.nether.root.description"),
            new ale("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dbw.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuq.tX, xo.c("advancements.nether.return_to_sender.title"), xo.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsy.T), bj.a.a().a(dz.a(awq.k)).a(bu.a.a().a(bsy.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dez.fn, xo.c("advancements.nether.find_fortress.title"), xo.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eic.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cuq.uj, xo.c("advancements.nether.fast_travel.title"), xo.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cuq.sh, xo.c("advancements.nether.uneasy_alliance.title"), xo.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsy.T).a(dc.a.a(dbw.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dez.gG, xo.c("advancements.nether.get_wither_skull.title"), xo.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dez.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cuq.us, xo.c("advancements.nether.summon_wither.title"), xo.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dy.a.a(bu.a.a().a(bsy.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cuq.sg, xo.c("advancements.nether.obtain_blaze_rod.title"), xo.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cuq.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dez.fO, xo.c("advancements.nether.create_beacon.title"), xo.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dez.fO,
            xo.c("advancements.nether.create_full_beacon.title"),
            xo.c("advancements.nether.create_full_beacon.description"),
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
         .a(cuq.sk, xo.c("advancements.nether.brew_potion.title"), xo.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cuq.qE, xo.c("advancements.nether.all_potions.title"), xo.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(df.a.a().a(bsc.a).a(bsc.b).a(bsc.e).a(bsc.h).a(bsc.j).a(bsc.l).a(bsc.m).a(bsc.n).a(bsc.p).a(bsc.r).a(bsc.s).a(bsc.B).a(bsc.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cuq.qy, xo.c("advancements.nether.all_effects.title"), xo.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(bsc.a)
                  .a(bsc.b)
                  .a(bsc.e)
                  .a(bsc.h)
                  .a(bsc.j)
                  .a(bsc.l)
                  .a(bsc.m)
                  .a(bsc.n)
                  .a(bsc.p)
                  .a(bsc.r)
                  .a(bsc.s)
                  .a(bsc.t)
                  .a(bsc.c)
                  .a(bsc.d)
                  .a(bsc.y)
                  .a(bsc.x)
                  .a(bsc.v)
                  .a(bsc.q)
                  .a(bsc.i)
                  .a(bsc.k)
                  .a(bsc.B)
                  .a(bsc.C)
                  .a(bsc.D)
                  .a(bsc.o)
                  .a(bsc.E)
                  .a(bsc.F)
                  .a(bsc.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cuq.aC,
            xo.c("advancements.nether.obtain_ancient_debris.title"),
            xo.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cuq.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cuq.pT, xo.c("advancements.nether.netherite_armor.title"), xo.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cuq.pS, cuq.pT, cuq.pU, cuq.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cuq.wB, xo.c("advancements.nether.use_lodestone.title"), xo.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dez.pq)), cp.a.a().a(cuq.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cuq.wC,
            xo.c("advancements.nether.obtain_crying_obsidian.title"),
            xo.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cuq.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cuq.wP,
            xo.c("advancements.nether.charge_respawn_anchor.title"),
            xo.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dez.pl).a(dx.a.a().a(dlf.d, 4))), cp.a.a().a(dez.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cuq.nS, xo.c("advancements.nether.ride_strider.title"), xo.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsy.aZ)))), Optional.of(cp.a.a().a(cuq.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cuq.nS,
            xo.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xo.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dbw.h)).a(bu.a.a().a(bsy.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mf.a(ae.a.a(), $$0, ddj.a.a.a().toList())
         .a($$13)
         .a(cuq.pV, xo.c("advancements.nether.explore_nether.title"), xo.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cuq.wL, xo.c("advancements.nether.find_bastion.title"), xo.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eic.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dez.cv, xo.c("advancements.nether.loot_bastion.title"), xo.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqc.M))
         .a("loot_bastion_treasure", dd.a.a(eqc.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqc.O))
         .a("loot_bastion_bridge", dd.a.a(eqc.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cuq.oI, xo.c("advancements.nether.distract_piglin.title"), xo.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", dh.a.a(a, Optional.of(cp.a.a().a(awx.U).b()), Optional.of(bu.a(bu.a.a().a(bsy.aA).a(bs.a.a().e(false))))))
         .a("distract_piglin_directly", dj.a.a(Optional.of(a), cp.a.a().a(clm.c), Optional.of(bu.a(bu.a.a().a(bsy.aA).a(bs.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
