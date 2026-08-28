import java.util.Optional;
import java.util.function.Consumer;

public class mn implements mi {
   @Override
   public void a(jr.a $$0, Consumer<ag> $$1) {
      jq<bug<?>> $$2 = $$0.d(ly.z);
      jq<cvt> $$3 = $$0.d(ly.K);
      jq<dhy> $$4 = $$0.d(ly.f);
      ag $$5 = af.a.a()
         .a(
            dia.kL,
            xh.c("advancements.nether.root.title"),
            xh.c("advancements.nether.root.description"),
            alh.b("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(dev.j))
         .a($$1, "nether/root");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cwb.tY, xh.c("advancements.nether.return_to_sender.title"), xh.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", db.a.a(bv.a.a().a($$2, bug.T), bk.a.a().a(ef.a(axb.j)).a(bv.a.a().a($$2, bug.ak))))
         .a($$1, "nether/return_to_sender");
      ag $$7 = af.a.a()
         .a($$5)
         .a(dia.fn, xh.c("advancements.nether.find_fortress.title"), xh.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", dr.a.a(dg.a.b($$0.d(ly.aS).b(ell.o))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$5)
         .a(cwb.ul, xh.c("advancements.nether.fast_travel.title"), xh.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bn.a.a(bm.a(di.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$6)
         .a(cwb.si, xh.c("advancements.nether.uneasy_alliance.title"), xh.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", db.a.a(bv.a.a().a($$2, bug.T).a(dg.a.a(dev.i))))
         .a($$1, "nether/uneasy_alliance");
      ag $$8 = af.a.a()
         .a($$7)
         .a(dia.gG, xh.c("advancements.nether.get_wither_skull.title"), xh.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", ch.a.a(dia.gG))
         .a($$1, "nether/get_wither_skull");
      ag $$9 = af.a.a()
         .a($$8)
         .a(cwb.uu, xh.c("advancements.nether.summon_wither.title"), xh.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", ee.a.a(bv.a.a().a($$2, bug.bp)))
         .a($$1, "nether/summon_wither");
      ag $$10 = af.a.a()
         .a($$7)
         .a(cwb.sh, xh.c("advancements.nether.obtain_blaze_rod.title"), xh.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", ch.a.a(cwb.sh))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dia.fO, xh.c("advancements.nether.create_beacon.title"), xh.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", be.a.a(di.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$11)
         .a(
            dia.fO,
            xh.c("advancements.nether.create_full_beacon.title"),
            xh.c("advancements.nether.create_full_beacon.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("beacon", be.a.a(di.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ag $$12 = af.a.a()
         .a($$10)
         .a(cwb.sm, xh.c("advancements.nether.brew_potion.title"), xh.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$13 = af.a.a()
         .a($$12)
         .a(cwb.qF, xh.c("advancements.nether.all_potions.title"), xh.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bo.a.a(
               dj.a.a()
                  .a(btg.a)
                  .a(btg.b)
                  .a(btg.e)
                  .a(btg.h)
                  .a(btg.j)
                  .a(btg.l)
                  .a(btg.m)
                  .a(btg.n)
                  .a(btg.p)
                  .a(btg.r)
                  .a(btg.s)
                  .a(btg.B)
                  .a(btg.k)
                  .a(btg.L)
                  .a(btg.M)
                  .a(btg.J)
                  .a(btg.K)
            )
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$13)
         .a(cwb.qz, xh.c("advancements.nether.all_effects.title"), xh.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bo.a.a(
               dj.a.a()
                  .a(btg.a)
                  .a(btg.b)
                  .a(btg.e)
                  .a(btg.h)
                  .a(btg.j)
                  .a(btg.l)
                  .a(btg.m)
                  .a(btg.n)
                  .a(btg.p)
                  .a(btg.r)
                  .a(btg.s)
                  .a(btg.t)
                  .a(btg.c)
                  .a(btg.d)
                  .a(btg.y)
                  .a(btg.x)
                  .a(btg.v)
                  .a(btg.q)
                  .a(btg.i)
                  .a(btg.k)
                  .a(btg.B)
                  .a(btg.C)
                  .a(btg.D)
                  .a(btg.o)
                  .a(btg.E)
                  .a(btg.F)
                  .a(btg.G)
                  .a(btg.L)
                  .a(btg.M)
                  .a(btg.J)
                  .a(btg.K)
                  .a(btg.H)
                  .a(btg.I)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cwb.aC,
            xh.c("advancements.nether.obtain_ancient_debris.title"),
            xh.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ch.a.a(cwb.aC))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$14)
         .a(cwb.pU, xh.c("advancements.nether.netherite_armor.title"), xh.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", ch.a.a(cwb.pT, cwb.pU, cwb.pV, cwb.pW))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$14)
         .a(cwb.wH, xh.c("advancements.nether.use_lodestone.title"), xh.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cx.a.a(dg.a.a().a(aw.a.a().a($$4, dia.pq)), ct.a.a().a($$3, cwb.qT)))
         .a($$1, "nether/use_lodestone");
      ag $$15 = af.a.a()
         .a($$5)
         .a(
            cwb.wI,
            xh.c("advancements.nether.obtain_crying_obsidian.title"),
            xh.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ch.a.a(cwb.wI))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$15)
         .a(
            cwb.wV,
            xh.c("advancements.nether.charge_respawn_anchor.title"),
            xh.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cx.a.a(dg.a.a().a(aw.a.a().a($$4, dia.pl).a(ed.a.a().a(dog.d, 4))), ct.a.a().a($$3, dia.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$16 = af.a.a()
         .a($$5)
         .a(cwb.nS, xh.c("advancements.nether.ride_strider.title"), xh.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cn.a.a(Optional.of(bv.a(bv.a.a().a(bv.a.a().a($$2, bug.aZ)))), Optional.of(ct.a.a().a($$3, cwb.nS).b()), di.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$16)
         .a(
            cwb.nS,
            xh.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xh.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bn.a.a(bv.a.a().a(dg.a.a(dev.i)).a(bv.a.a().a($$2, bug.aZ)), bm.a(di.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      ml.a(af.a.a(), $$0, dgk.a.a.a().toList())
         .a($$16)
         .a(cwb.pW, xh.c("advancements.nether.explore_nether.title"), xh.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$17 = af.a.a()
         .a($$5)
         .a(cwb.wR, xh.c("advancements.nether.find_bastion.title"), xh.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", dr.a.a(dg.a.b($$0.d(ly.aS).b(ell.s))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$17)
         .a(dia.cv, xh.c("advancements.nether.loot_bastion.title"), xh.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", dh.a.a(ets.L))
         .a("loot_bastion_treasure", dh.a.a(ets.K))
         .a("loot_bastion_hoglin_stable", dh.a.a(ets.N))
         .a("loot_bastion_bridge", dh.a.a(ets.M))
         .a($$1, "nether/loot_bastion");
      bg $$18 = bg.a(
         exk.a(etw.b.a, bv.a.a().a(bs.a.a().a(ct.a.a().a($$3, axi.W)))).invert().build(),
         exk.a(etw.b.a, bv.a.a().a(bs.a.a().b(ct.a.a().a($$3, axi.W)))).invert().build(),
         exk.a(etw.b.a, bv.a.a().a(bs.a.a().c(ct.a.a().a($$3, axi.W)))).invert().build(),
         exk.a(etw.b.a, bv.a.a().a(bs.a.a().d(ct.a.a().a($$3, axi.W)))).invert().build()
      );
      af.a.a()
         .a($$5)
         .a(aj.a.b)
         .a(cwb.oK, xh.c("advancements.nether.distract_piglin.title"), xh.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", dm.a.a($$18, Optional.of(ct.a.a().a($$3, axi.U).b()), Optional.of(bv.a(bv.a.a().a($$2, bug.aA).a(bt.a.a().g(false))))))
         .a("distract_piglin_directly", dp.a.a(Optional.of($$18), ct.a.a().a($$3, cmx.c), Optional.of(bv.a(bv.a.a().a($$2, bug.aA).a(bt.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
