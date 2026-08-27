import java.util.Optional;
import java.util.function.Consumer;

public class ma implements ls {
   private static final bd a = bd.a(
      eux.a(erp.b.a, bs.a.a().a(bp.a.a().a(ci.a.a().a(cuk.rh)))).invert().build(),
      eux.a(erp.b.a, bs.a.a().a(bp.a.a().b(ci.a.a().a(cuk.ri)))).invert().build(),
      eux.a(erp.b.a, bs.a.a().a(bp.a.a().c(ci.a.a().a(cuk.rj)))).invert().build(),
      eux.a(erp.b.a, bs.a.a().a(bp.a.a().d(ci.a.a().a(cuk.rk)))).invert().build()
   );

   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfe.lJ,
            xe.c("advancements.nether.root.title"),
            xe.c("advancements.nether.root.description"),
            new akt("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(dca.i))
         .a($$1, "nether/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cuk.vz, xe.c("advancements.nether.return_to_sender.title"), xe.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", cn.a.a(bs.a.a().a(bsb.V), bh.a.a().a(dq.a(awg.k)).a(bs.a.a().a(bsb.al))))
         .a($$1, "nether/return_to_sender");
      ag $$4 = af.a.a()
         .a($$2)
         .a(dfe.gf, xe.c("advancements.nether.find_fortress.title"), xe.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", db.a.a(cs.a.b($$0.b(li.aJ).b(ejn.p))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$2)
         .a(cuk.vU, xe.c("advancements.nether.fast_travel.title"), xe.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bk.a.a(bj.a(cu.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$3)
         .a(cuk.tE, xe.c("advancements.nether.uneasy_alliance.title"), xe.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", cn.a.a(bs.a.a().a(bsb.V).a(cs.a.a(dca.h))))
         .a($$1, "nether/uneasy_alliance");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dfe.hA, xe.c("advancements.nether.get_wither_skull.title"), xe.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", cc.a.a(dfe.hA))
         .a($$1, "nether/get_wither_skull");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cuk.wd, xe.c("advancements.nether.summon_wither.title"), xe.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", dp.a.a(bs.a.a().a(bsb.bt)))
         .a($$1, "nether/summon_wither");
      ag $$7 = af.a.a()
         .a($$4)
         .a(cuk.tD, xe.c("advancements.nether.obtain_blaze_rod.title"), xe.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", cc.a.a(cuk.tD))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$8 = af.a.a()
         .a($$6)
         .a(dfe.gH, xe.c("advancements.nether.create_beacon.title"), xe.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", bb.a.a(cu.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$8)
         .a(
            dfe.gH,
            xe.c("advancements.nether.create_full_beacon.title"),
            xe.c("advancements.nether.create_full_beacon.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("beacon", bb.a.a(cu.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      ag $$9 = af.a.a()
         .a($$7)
         .a(cuk.tH, xe.c("advancements.nether.brew_potion.title"), xe.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$10 = af.a.a()
         .a($$9)
         .a(cuk.sb, xe.c("advancements.nether.all_potions.title"), xe.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bl.a.a(cv.a.a().a(brj.a).a(brj.b).a(brj.e).a(brj.h).a(brj.j).a(brj.l).a(brj.m).a(brj.n).a(brj.p).a(brj.r).a(brj.s).a(brj.B).a(brj.k))
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$10)
         .a(cuk.rV, xe.c("advancements.nether.all_effects.title"), xe.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bl.a.a(
               cv.a.a()
                  .a(brj.a)
                  .a(brj.b)
                  .a(brj.e)
                  .a(brj.h)
                  .a(brj.j)
                  .a(brj.l)
                  .a(brj.m)
                  .a(brj.n)
                  .a(brj.p)
                  .a(brj.r)
                  .a(brj.s)
                  .a(brj.t)
                  .a(brj.c)
                  .a(brj.d)
                  .a(brj.y)
                  .a(brj.x)
                  .a(brj.v)
                  .a(brj.q)
                  .a(brj.i)
                  .a(brj.k)
                  .a(brj.B)
                  .a(brj.C)
                  .a(brj.D)
                  .a(brj.o)
                  .a(brj.E)
                  .a(brj.F)
                  .a(brj.G)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cuk.bs,
            xe.c("advancements.nether.obtain_ancient_debris.title"),
            xe.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cc.a.a(cuk.bs))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$11)
         .a(cuk.rm, xe.c("advancements.nether.netherite_armor.title"), xe.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", cc.a.a(cuk.rl, cuk.rm, cuk.rn, cuk.ro))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$11)
         .a(cuk.yo, xe.c("advancements.nether.use_lodestone.title"), xe.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cl.a.a(cs.a.a().a(aw.a.a().a(dfe.qB)), ci.a.a().a(cuk.sp)))
         .a($$1, "nether/use_lodestone");
      ag $$12 = af.a.a()
         .a($$2)
         .a(
            cuk.yp,
            xe.c("advancements.nether.obtain_crying_obsidian.title"),
            xe.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cc.a.a(cuk.yp))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$12)
         .a(
            cuk.yC,
            xe.c("advancements.nether.charge_respawn_anchor.title"),
            xe.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cl.a.a(cs.a.a().a(aw.a.a().a(dfe.qw).a(dn.a.a().a(dly.d, 4))), ci.a.a().a(dfe.eQ)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$13 = af.a.a()
         .a($$2)
         .a(cuk.pi, xe.c("advancements.nether.ride_strider.title"), xe.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cf.a.a(Optional.of(bs.a(bs.a.a().a(bs.a.a().a(bsb.bc)))), Optional.of(ci.a.a().a(cuk.pi).b()), cu.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$13)
         .a(
            cuk.pi,
            xe.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xe.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bk.a.a(bs.a.a().a(cs.a.a(dca.h)).a(bs.a.a().a(bsb.bc)), bj.a(cu.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      ly.a(af.a.a(), $$0, ddn.a.a.a().toList())
         .a($$13)
         .a(cuk.ro, xe.c("advancements.nether.explore_nether.title"), xe.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$14 = af.a.a()
         .a($$2)
         .a(cuk.yy, xe.c("advancements.nether.find_bastion.title"), xe.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", db.a.a(cs.a.b($$0.b(li.aJ).b(ejn.t))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$14)
         .a(dfe.dg, xe.c("advancements.nether.loot_bastion.title"), xe.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", ct.a.a(ern.O))
         .a("loot_bastion_treasure", ct.a.a(ern.N))
         .a("loot_bastion_hoglin_stable", ct.a.a(ern.Q))
         .a("loot_bastion_bridge", ct.a.a(ern.P))
         .a($$1, "nether/loot_bastion");
      af.a.a()
         .a($$2)
         .a(aj.a.b)
         .a(cuk.qb, xe.c("advancements.nether.distract_piglin.title"), xe.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", cx.a.a(a, Optional.of(ci.a.a().a(awm.U).b()), Optional.of(bs.a(bs.a.a().a(bsb.aB).a(bq.a.a().e(false))))))
         .a("distract_piglin_directly", cz.a.a(Optional.of(a), ci.a.a().a(ckp.c), Optional.of(bs.a(bs.a.a().a(bsb.aB).a(bq.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
