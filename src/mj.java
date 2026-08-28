import java.util.Optional;
import java.util.function.Consumer;

public class mj implements me {
   private static final bg a = bg.a(
      evd.a(erp.b.a, bv.a.a().a(bs.a.a().a(cs.a.a().a(cut.pO)))).invert().build(),
      evd.a(erp.b.a, bv.a.a().a(bs.a.a().b(cs.a.a().a(cut.pP)))).invert().build(),
      evd.a(erp.b.a, bv.a.a().a(bs.a.a().c(cs.a.a().a(cut.pQ)))).invert().build(),
      evd.a(erp.b.a, bv.a.a().a(bs.a.a().d(cs.a.a().a(cut.pR)))).invert().build()
   );

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dga.kL,
            wz.c("advancements.nether.root.title"),
            wz.c("advancements.nether.root.description"),
            akr.b("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(dcw.i))
         .a($$1, "nether/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cut.tX, wz.c("advancements.nether.return_to_sender.title"), wz.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", da.a.a(bv.a.a().a(bsx.T), bk.a.a().a(ed.a(awg.j)).a(bv.a.a().a(bsx.ak))))
         .a($$1, "nether/return_to_sender");
      ag $$4 = af.a.a()
         .a($$2)
         .a(dga.fn, wz.c("advancements.nether.find_fortress.title"), wz.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", dq.a.a(df.a.b($$0.b(lu.aR).b(ejj.o))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$2)
         .a(cut.uj, wz.c("advancements.nether.fast_travel.title"), wz.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bn.a.a(bm.a(dh.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$3)
         .a(cut.sh, wz.c("advancements.nether.uneasy_alliance.title"), wz.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", da.a.a(bv.a.a().a(bsx.T).a(df.a.a(dcw.h))))
         .a($$1, "nether/uneasy_alliance");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dga.gG, wz.c("advancements.nether.get_wither_skull.title"), wz.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", cg.a.a(dga.gG))
         .a($$1, "nether/get_wither_skull");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cut.us, wz.c("advancements.nether.summon_wither.title"), wz.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", ec.a.a(bv.a.a().a(bsx.bp)))
         .a($$1, "nether/summon_wither");
      ag $$7 = af.a.a()
         .a($$4)
         .a(cut.sg, wz.c("advancements.nether.obtain_blaze_rod.title"), wz.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", cg.a.a(cut.sg))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$8 = af.a.a()
         .a($$6)
         .a(dga.fO, wz.c("advancements.nether.create_beacon.title"), wz.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", be.a.a(dh.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$8)
         .a(
            dga.fO,
            wz.c("advancements.nether.create_full_beacon.title"),
            wz.c("advancements.nether.create_full_beacon.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("beacon", be.a.a(dh.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ag $$9 = af.a.a()
         .a($$7)
         .a(cut.sk, wz.c("advancements.nether.brew_potion.title"), wz.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$10 = af.a.a()
         .a($$9)
         .a(cut.qE, wz.c("advancements.nether.all_potions.title"), wz.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsb.a)
                  .a(bsb.b)
                  .a(bsb.e)
                  .a(bsb.h)
                  .a(bsb.j)
                  .a(bsb.l)
                  .a(bsb.m)
                  .a(bsb.n)
                  .a(bsb.p)
                  .a(bsb.r)
                  .a(bsb.s)
                  .a(bsb.B)
                  .a(bsb.k)
                  .a(bsb.L)
                  .a(bsb.M)
                  .a(bsb.J)
                  .a(bsb.K)
            )
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$10)
         .a(cut.qy, wz.c("advancements.nether.all_effects.title"), wz.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsb.a)
                  .a(bsb.b)
                  .a(bsb.e)
                  .a(bsb.h)
                  .a(bsb.j)
                  .a(bsb.l)
                  .a(bsb.m)
                  .a(bsb.n)
                  .a(bsb.p)
                  .a(bsb.r)
                  .a(bsb.s)
                  .a(bsb.t)
                  .a(bsb.c)
                  .a(bsb.d)
                  .a(bsb.y)
                  .a(bsb.x)
                  .a(bsb.v)
                  .a(bsb.q)
                  .a(bsb.i)
                  .a(bsb.k)
                  .a(bsb.B)
                  .a(bsb.C)
                  .a(bsb.D)
                  .a(bsb.o)
                  .a(bsb.E)
                  .a(bsb.F)
                  .a(bsb.G)
                  .a(bsb.L)
                  .a(bsb.M)
                  .a(bsb.J)
                  .a(bsb.K)
                  .a(bsb.H)
                  .a(bsb.I)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cut.aC,
            wz.c("advancements.nether.obtain_ancient_debris.title"),
            wz.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cg.a.a(cut.aC))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$11)
         .a(cut.pT, wz.c("advancements.nether.netherite_armor.title"), wz.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", cg.a.a(cut.pS, cut.pT, cut.pU, cut.pV))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$11)
         .a(cut.wE, wz.c("advancements.nether.use_lodestone.title"), wz.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cw.a.a(df.a.a().a(aw.a.a().a(dga.pq)), cs.a.a().a(cut.qS)))
         .a($$1, "nether/use_lodestone");
      ag $$12 = af.a.a()
         .a($$2)
         .a(
            cut.wF,
            wz.c("advancements.nether.obtain_crying_obsidian.title"),
            wz.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cg.a.a(cut.wF))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$12)
         .a(
            cut.wS,
            wz.c("advancements.nether.charge_respawn_anchor.title"),
            wz.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cw.a.a(df.a.a().a(aw.a.a().a(dga.pl).a(eb.a.a().a(dmh.d, 4))), cs.a.a().a(dga.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$13 = af.a.a()
         .a($$2)
         .a(cut.nS, wz.c("advancements.nether.ride_strider.title"), wz.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bv.a(bv.a.a().a(bv.a.a().a(bsx.aZ)))), Optional.of(cs.a.a().a(cut.nS).b()), dh.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$13)
         .a(
            cut.nS,
            wz.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wz.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bn.a.a(bv.a.a().a(df.a.a(dcw.h)).a(bv.a.a().a(bsx.aZ)), bm.a(dh.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mh.a(af.a.a(), $$0, dek.a.a.a().toList())
         .a($$13)
         .a(cut.pV, wz.c("advancements.nether.explore_nether.title"), wz.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$14 = af.a.a()
         .a($$2)
         .a(cut.wO, wz.c("advancements.nether.find_bastion.title"), wz.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", dq.a.a(df.a.b($$0.b(lu.aR).b(ejj.s))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$14)
         .a(dga.cv, wz.c("advancements.nether.loot_bastion.title"), wz.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", dg.a.a(erl.M))
         .a("loot_bastion_treasure", dg.a.a(erl.L))
         .a("loot_bastion_hoglin_stable", dg.a.a(erl.O))
         .a("loot_bastion_bridge", dg.a.a(erl.N))
         .a($$1, "nether/loot_bastion");
      af.a.a()
         .a($$2)
         .a(aj.a.b)
         .a(cut.oJ, wz.c("advancements.nether.distract_piglin.title"), wz.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", dl.a.a(a, Optional.of(cs.a.a().a(awn.U).b()), Optional.of(bv.a(bv.a.a().a(bsx.aA).a(bt.a.a().g(false))))))
         .a("distract_piglin_directly", dn.a.a(Optional.of(a), cs.a.a().a(clo.c), Optional.of(bv.a(bv.a.a().a(bsx.aA).a(bt.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
