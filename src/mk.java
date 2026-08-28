import java.util.Optional;
import java.util.function.Consumer;

public class mk implements mf {
   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btv<?>> $$2 = $$0.b(lv.z);
      jo<cvk> $$3 = $$0.b(lv.K);
      jo<dhj> $$4 = $$0.b(lv.f);
      ag $$5 = af.a.a()
         .a(
            dhl.kL,
            xd.c("advancements.nether.root.title"),
            xd.c("advancements.nether.root.description"),
            alc.b("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(deg.i))
         .a($$1, "nether/root");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cvt.tY, xd.c("advancements.nether.return_to_sender.title"), xd.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", da.a.a(bv.a.a().a($$2, btv.T), bk.a.a().a(ed.a(awv.j)).a(bv.a.a().a($$2, btv.ak))))
         .a($$1, "nether/return_to_sender");
      ag $$7 = af.a.a()
         .a($$5)
         .a(dhl.fn, xd.c("advancements.nether.find_fortress.title"), xd.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", dq.a.a(df.a.b($$0.b(lv.aS).b(ekw.o))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$5)
         .a(cvt.ul, xd.c("advancements.nether.fast_travel.title"), xd.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bn.a.a(bm.a(dh.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$6)
         .a(cvt.si, xd.c("advancements.nether.uneasy_alliance.title"), xd.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", da.a.a(bv.a.a().a($$2, btv.T).a(df.a.a(deg.h))))
         .a($$1, "nether/uneasy_alliance");
      ag $$8 = af.a.a()
         .a($$7)
         .a(dhl.gG, xd.c("advancements.nether.get_wither_skull.title"), xd.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", cg.a.a(dhl.gG))
         .a($$1, "nether/get_wither_skull");
      ag $$9 = af.a.a()
         .a($$8)
         .a(cvt.uu, xd.c("advancements.nether.summon_wither.title"), xd.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", ec.a.a(bv.a.a().a($$2, btv.bp)))
         .a($$1, "nether/summon_wither");
      ag $$10 = af.a.a()
         .a($$7)
         .a(cvt.sh, xd.c("advancements.nether.obtain_blaze_rod.title"), xd.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", cg.a.a(cvt.sh))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dhl.fO, xd.c("advancements.nether.create_beacon.title"), xd.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", be.a.a(dh.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$11)
         .a(
            dhl.fO,
            xd.c("advancements.nether.create_full_beacon.title"),
            xd.c("advancements.nether.create_full_beacon.description"),
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
         .a(cvt.sm, xd.c("advancements.nether.brew_potion.title"), xd.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$13 = af.a.a()
         .a($$12)
         .a(cvt.qF, xd.c("advancements.nether.all_potions.title"), xd.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsx.a)
                  .a(bsx.b)
                  .a(bsx.e)
                  .a(bsx.h)
                  .a(bsx.j)
                  .a(bsx.l)
                  .a(bsx.m)
                  .a(bsx.n)
                  .a(bsx.p)
                  .a(bsx.r)
                  .a(bsx.s)
                  .a(bsx.B)
                  .a(bsx.k)
                  .a(bsx.L)
                  .a(bsx.M)
                  .a(bsx.J)
                  .a(bsx.K)
            )
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$13)
         .a(cvt.qz, xd.c("advancements.nether.all_effects.title"), xd.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsx.a)
                  .a(bsx.b)
                  .a(bsx.e)
                  .a(bsx.h)
                  .a(bsx.j)
                  .a(bsx.l)
                  .a(bsx.m)
                  .a(bsx.n)
                  .a(bsx.p)
                  .a(bsx.r)
                  .a(bsx.s)
                  .a(bsx.t)
                  .a(bsx.c)
                  .a(bsx.d)
                  .a(bsx.y)
                  .a(bsx.x)
                  .a(bsx.v)
                  .a(bsx.q)
                  .a(bsx.i)
                  .a(bsx.k)
                  .a(bsx.B)
                  .a(bsx.C)
                  .a(bsx.D)
                  .a(bsx.o)
                  .a(bsx.E)
                  .a(bsx.F)
                  .a(bsx.G)
                  .a(bsx.L)
                  .a(bsx.M)
                  .a(bsx.J)
                  .a(bsx.K)
                  .a(bsx.H)
                  .a(bsx.I)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cvt.aC,
            xd.c("advancements.nether.obtain_ancient_debris.title"),
            xd.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cg.a.a(cvt.aC))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$14)
         .a(cvt.pU, xd.c("advancements.nether.netherite_armor.title"), xd.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", cg.a.a(cvt.pT, cvt.pU, cvt.pV, cvt.pW))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$14)
         .a(cvt.wH, xd.c("advancements.nether.use_lodestone.title"), xd.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cw.a.a(df.a.a().a(aw.a.a().a($$4, dhl.pq)), cs.a.a().a($$3, cvt.qT)))
         .a($$1, "nether/use_lodestone");
      ag $$15 = af.a.a()
         .a($$5)
         .a(
            cvt.wI,
            xd.c("advancements.nether.obtain_crying_obsidian.title"),
            xd.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cg.a.a(cvt.wI))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$15)
         .a(
            cvt.wV,
            xd.c("advancements.nether.charge_respawn_anchor.title"),
            xd.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cw.a.a(df.a.a().a(aw.a.a().a($$4, dhl.pl).a(eb.a.a().a(dns.d, 4))), cs.a.a().a($$3, dhl.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$16 = af.a.a()
         .a($$5)
         .a(cvt.nS, xd.c("advancements.nether.ride_strider.title"), xd.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bv.a(bv.a.a().a(bv.a.a().a($$2, btv.aZ)))), Optional.of(cs.a.a().a($$3, cvt.nS).b()), dh.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$16)
         .a(
            cvt.nS,
            xd.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xd.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bn.a.a(bv.a.a().a(df.a.a(deg.h)).a(bv.a.a().a($$2, btv.aZ)), bm.a(dh.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mi.a(af.a.a(), $$0, dfv.a.a.a().toList())
         .a($$16)
         .a(cvt.pW, xd.c("advancements.nether.explore_nether.title"), xd.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$17 = af.a.a()
         .a($$5)
         .a(cvt.wR, xd.c("advancements.nether.find_bastion.title"), xd.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", dq.a.a(df.a.b($$0.b(lv.aS).b(ekw.s))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$17)
         .a(dhl.cv, xd.c("advancements.nether.loot_bastion.title"), xd.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", dg.a.a(etd.M))
         .a("loot_bastion_treasure", dg.a.a(etd.L))
         .a("loot_bastion_hoglin_stable", dg.a.a(etd.O))
         .a("loot_bastion_bridge", dg.a.a(etd.N))
         .a($$1, "nether/loot_bastion");
      bg $$18 = bg.a(
         ewv.a(eth.b.a, bv.a.a().a(bs.a.a().a(cs.a.a().a($$3, cvt.pP)))).invert().build(),
         ewv.a(eth.b.a, bv.a.a().a(bs.a.a().b(cs.a.a().a($$3, cvt.pQ)))).invert().build(),
         ewv.a(eth.b.a, bv.a.a().a(bs.a.a().c(cs.a.a().a($$3, cvt.pR)))).invert().build(),
         ewv.a(eth.b.a, bv.a.a().a(bs.a.a().d(cs.a.a().a($$3, cvt.pS)))).invert().build()
      );
      af.a.a()
         .a($$5)
         .a(aj.a.b)
         .a(cvt.oK, xd.c("advancements.nether.distract_piglin.title"), xd.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", dl.a.a($$18, Optional.of(cs.a.a().a($$3, axc.U).b()), Optional.of(bv.a(bv.a.a().a($$2, btv.aA).a(bt.a.a().g(false))))))
         .a("distract_piglin_directly", dn.a.a(Optional.of($$18), cs.a.a().a($$3, cml.c), Optional.of(bv.a(bv.a.a().a($$2, btv.aA).a(bt.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
