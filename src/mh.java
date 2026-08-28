import java.util.Optional;
import java.util.function.Consumer;

public class mh implements ma {
   private static final bf a = bf.a(
      etw.a(eqj.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cut.pO)))).invert().build(),
      etw.a(eqj.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cut.pP)))).invert().build(),
      etw.a(eqj.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cut.pQ)))).invert().build(),
      etw.a(eqj.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cut.pR)))).invert().build()
   );

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfc.kL,
            xp.c("advancements.nether.root.title"),
            xp.c("advancements.nether.root.description"),
            new alf("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dbz.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cut.tX, xp.c("advancements.nether.return_to_sender.title"), xp.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(btb.T), bj.a.a().a(dz.a(awr.k)).a(bu.a.a().a(btb.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dfc.fn, xp.c("advancements.nether.find_fortress.title"), xp.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eif.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cut.uj, xp.c("advancements.nether.fast_travel.title"), xp.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cut.sh, xp.c("advancements.nether.uneasy_alliance.title"), xp.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(btb.T).a(dc.a.a(dbz.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfc.gG, xp.c("advancements.nether.get_wither_skull.title"), xp.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dfc.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cut.us, xp.c("advancements.nether.summon_wither.title"), xp.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dy.a.a(bu.a.a().a(btb.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cut.sg, xp.c("advancements.nether.obtain_blaze_rod.title"), xp.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cut.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dfc.fO, xp.c("advancements.nether.create_beacon.title"), xp.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dfc.fO,
            xp.c("advancements.nether.create_full_beacon.title"),
            xp.c("advancements.nether.create_full_beacon.description"),
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
         .a(cut.sk, xp.c("advancements.nether.brew_potion.title"), xp.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cut.qE, xp.c("advancements.nether.all_potions.title"), xp.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(df.a.a().a(bsf.a).a(bsf.b).a(bsf.e).a(bsf.h).a(bsf.j).a(bsf.l).a(bsf.m).a(bsf.n).a(bsf.p).a(bsf.r).a(bsf.s).a(bsf.B).a(bsf.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cut.qy, xp.c("advancements.nether.all_effects.title"), xp.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(bsf.a)
                  .a(bsf.b)
                  .a(bsf.e)
                  .a(bsf.h)
                  .a(bsf.j)
                  .a(bsf.l)
                  .a(bsf.m)
                  .a(bsf.n)
                  .a(bsf.p)
                  .a(bsf.r)
                  .a(bsf.s)
                  .a(bsf.t)
                  .a(bsf.c)
                  .a(bsf.d)
                  .a(bsf.y)
                  .a(bsf.x)
                  .a(bsf.v)
                  .a(bsf.q)
                  .a(bsf.i)
                  .a(bsf.k)
                  .a(bsf.B)
                  .a(bsf.C)
                  .a(bsf.D)
                  .a(bsf.o)
                  .a(bsf.E)
                  .a(bsf.F)
                  .a(bsf.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cut.aC,
            xp.c("advancements.nether.obtain_ancient_debris.title"),
            xp.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cut.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cut.pT, xp.c("advancements.nether.netherite_armor.title"), xp.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cut.pS, cut.pT, cut.pU, cut.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cut.wB, xp.c("advancements.nether.use_lodestone.title"), xp.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dfc.pq)), cp.a.a().a(cut.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cut.wC,
            xp.c("advancements.nether.obtain_crying_obsidian.title"),
            xp.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cut.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cut.wP,
            xp.c("advancements.nether.charge_respawn_anchor.title"),
            xp.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dfc.pl).a(dx.a.a().a(dli.d, 4))), cp.a.a().a(dfc.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cut.nS, xp.c("advancements.nether.ride_strider.title"), xp.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(btb.aZ)))), Optional.of(cp.a.a().a(cut.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cut.nS,
            xp.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xp.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dbz.h)).a(bu.a.a().a(btb.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mf.a(ae.a.a(), $$0, ddm.a.a.a().toList())
         .a($$13)
         .a(cut.pV, xp.c("advancements.nether.explore_nether.title"), xp.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cut.wL, xp.c("advancements.nether.find_bastion.title"), xp.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eif.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dfc.cv, xp.c("advancements.nether.loot_bastion.title"), xp.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqf.M))
         .a("loot_bastion_treasure", dd.a.a(eqf.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqf.O))
         .a("loot_bastion_bridge", dd.a.a(eqf.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cut.oI, xp.c("advancements.nether.distract_piglin.title"), xp.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", dh.a.a(a, Optional.of(cp.a.a().a(awy.U).b()), Optional.of(bu.a(bu.a.a().a(btb.aA).a(bs.a.a().e(false))))))
         .a("distract_piglin_directly", dj.a.a(Optional.of(a), cp.a.a().a(clp.c), Optional.of(bu.a(bu.a.a().a(btb.aA).a(bs.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
