import java.util.Optional;
import java.util.function.Consumer;

public class ml implements mg {
   @Override
   public void a(jq.a $$0, Consumer<ag> $$1) {
      jp<bty<?>> $$2 = $$0.d(lw.z);
      jp<cvn> $$3 = $$0.d(lw.K);
      jp<dhm> $$4 = $$0.d(lw.f);
      ag $$5 = af.a.a()
         .a(
            dho.kL,
            xe.c("advancements.nether.root.title"),
            xe.c("advancements.nether.root.description"),
            ale.b("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(dej.i))
         .a($$1, "nether/root");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cvw.tY, xe.c("advancements.nether.return_to_sender.title"), xe.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", da.a.a(bv.a.a().a($$2, bty.T), bk.a.a().a(ee.a(awx.j)).a(bv.a.a().a($$2, bty.ak))))
         .a($$1, "nether/return_to_sender");
      ag $$7 = af.a.a()
         .a($$5)
         .a(dho.fn, xe.c("advancements.nether.find_fortress.title"), xe.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", dq.a.a(df.a.b($$0.d(lw.aT).b(ela.o))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$5)
         .a(cvw.ul, xe.c("advancements.nether.fast_travel.title"), xe.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bn.a.a(bm.a(dh.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$6)
         .a(cvw.si, xe.c("advancements.nether.uneasy_alliance.title"), xe.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", da.a.a(bv.a.a().a($$2, bty.T).a(df.a.a(dej.h))))
         .a($$1, "nether/uneasy_alliance");
      ag $$8 = af.a.a()
         .a($$7)
         .a(dho.gG, xe.c("advancements.nether.get_wither_skull.title"), xe.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", cg.a.a(dho.gG))
         .a($$1, "nether/get_wither_skull");
      ag $$9 = af.a.a()
         .a($$8)
         .a(cvw.uu, xe.c("advancements.nether.summon_wither.title"), xe.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", ed.a.a(bv.a.a().a($$2, bty.bp)))
         .a($$1, "nether/summon_wither");
      ag $$10 = af.a.a()
         .a($$7)
         .a(cvw.sh, xe.c("advancements.nether.obtain_blaze_rod.title"), xe.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", cg.a.a(cvw.sh))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dho.fO, xe.c("advancements.nether.create_beacon.title"), xe.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", be.a.a(dh.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$11)
         .a(
            dho.fO,
            xe.c("advancements.nether.create_full_beacon.title"),
            xe.c("advancements.nether.create_full_beacon.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("beacon", be.a.a(dh.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ag $$12 = af.a.a()
         .a($$10)
         .a(cvw.sm, xe.c("advancements.nether.brew_potion.title"), xe.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$13 = af.a.a()
         .a($$12)
         .a(cvw.qF, xe.c("advancements.nether.all_potions.title"), xe.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bta.a)
                  .a(bta.b)
                  .a(bta.e)
                  .a(bta.h)
                  .a(bta.j)
                  .a(bta.l)
                  .a(bta.m)
                  .a(bta.n)
                  .a(bta.p)
                  .a(bta.r)
                  .a(bta.s)
                  .a(bta.B)
                  .a(bta.k)
                  .a(bta.L)
                  .a(bta.M)
                  .a(bta.J)
                  .a(bta.K)
            )
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$13)
         .a(cvw.qz, xe.c("advancements.nether.all_effects.title"), xe.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bta.a)
                  .a(bta.b)
                  .a(bta.e)
                  .a(bta.h)
                  .a(bta.j)
                  .a(bta.l)
                  .a(bta.m)
                  .a(bta.n)
                  .a(bta.p)
                  .a(bta.r)
                  .a(bta.s)
                  .a(bta.t)
                  .a(bta.c)
                  .a(bta.d)
                  .a(bta.y)
                  .a(bta.x)
                  .a(bta.v)
                  .a(bta.q)
                  .a(bta.i)
                  .a(bta.k)
                  .a(bta.B)
                  .a(bta.C)
                  .a(bta.D)
                  .a(bta.o)
                  .a(bta.E)
                  .a(bta.F)
                  .a(bta.G)
                  .a(bta.L)
                  .a(bta.M)
                  .a(bta.J)
                  .a(bta.K)
                  .a(bta.H)
                  .a(bta.I)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cvw.aC,
            xe.c("advancements.nether.obtain_ancient_debris.title"),
            xe.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cg.a.a(cvw.aC))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$14)
         .a(cvw.pU, xe.c("advancements.nether.netherite_armor.title"), xe.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", cg.a.a(cvw.pT, cvw.pU, cvw.pV, cvw.pW))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$14)
         .a(cvw.wH, xe.c("advancements.nether.use_lodestone.title"), xe.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cw.a.a(df.a.a().a(aw.a.a().a($$4, dho.pq)), cs.a.a().a($$3, cvw.qT)))
         .a($$1, "nether/use_lodestone");
      ag $$15 = af.a.a()
         .a($$5)
         .a(
            cvw.wI,
            xe.c("advancements.nether.obtain_crying_obsidian.title"),
            xe.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cg.a.a(cvw.wI))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$15)
         .a(
            cvw.wV,
            xe.c("advancements.nether.charge_respawn_anchor.title"),
            xe.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cw.a.a(df.a.a().a(aw.a.a().a($$4, dho.pl).a(ec.a.a().a(dnv.d, 4))), cs.a.a().a($$3, dho.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$16 = af.a.a()
         .a($$5)
         .a(cvw.nS, xe.c("advancements.nether.ride_strider.title"), xe.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bv.a(bv.a.a().a(bv.a.a().a($$2, bty.aZ)))), Optional.of(cs.a.a().a($$3, cvw.nS).b()), dh.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$16)
         .a(
            cvw.nS,
            xe.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xe.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bn.a.a(bv.a.a().a(df.a.a(dej.h)).a(bv.a.a().a($$2, bty.aZ)), bm.a(dh.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mj.a(af.a.a(), $$0, dfy.a.a.a().toList())
         .a($$16)
         .a(cvw.pW, xe.c("advancements.nether.explore_nether.title"), xe.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$17 = af.a.a()
         .a($$5)
         .a(cvw.wR, xe.c("advancements.nether.find_bastion.title"), xe.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", dq.a.a(df.a.b($$0.d(lw.aT).b(ela.s))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$17)
         .a(dho.cv, xe.c("advancements.nether.loot_bastion.title"), xe.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", dg.a.a(eth.L))
         .a("loot_bastion_treasure", dg.a.a(eth.K))
         .a("loot_bastion_hoglin_stable", dg.a.a(eth.N))
         .a("loot_bastion_bridge", dg.a.a(eth.M))
         .a($$1, "nether/loot_bastion");
      bg $$18 = bg.a(
         ewz.a(etl.b.a, bv.a.a().a(bs.a.a().a(cs.a.a().a($$3, cvw.pP)))).invert().build(),
         ewz.a(etl.b.a, bv.a.a().a(bs.a.a().b(cs.a.a().a($$3, cvw.pQ)))).invert().build(),
         ewz.a(etl.b.a, bv.a.a().a(bs.a.a().c(cs.a.a().a($$3, cvw.pR)))).invert().build(),
         ewz.a(etl.b.a, bv.a.a().a(bs.a.a().d(cs.a.a().a($$3, cvw.pS)))).invert().build()
      );
      af.a.a()
         .a($$5)
         .a(aj.a.b)
         .a(cvw.oK, xe.c("advancements.nether.distract_piglin.title"), xe.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", dl.a.a($$18, Optional.of(cs.a.a().a($$3, axe.U).b()), Optional.of(bv.a(bv.a.a().a($$2, bty.aA).a(bt.a.a().g(false))))))
         .a("distract_piglin_directly", dn.a.a(Optional.of($$18), cs.a.a().a($$3, cmo.c), Optional.of(bv.a(bv.a.a().a($$2, bty.aA).a(bt.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
