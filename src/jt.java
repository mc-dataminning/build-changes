import java.util.Optional;
import java.util.function.Consumer;

public class jt implements jo {
   private static final bc a = bc.a(
      efn.a(ecl.b.a, bq.a.a().a(bn.a.a().a(cb.a.a().a(cjd.pa)))).invert().build(),
      efn.a(ecl.b.a, bq.a.a().a(bn.a.a().b(cb.a.a().a(cjd.pb)))).invert().build(),
      efn.a(ecl.b.a, bq.a.a().a(bn.a.a().c(cb.a.a().a(cjd.pc)))).invert().build(),
      efn.a(ecl.b.a, bq.a.a().a(bn.a.a().d(cb.a.a().a(cjd.pd)))).invert().build()
   );

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csr.kL,
            ti.c("advancements.nether.root.title"),
            ti.c("advancements.nether.root.description"),
            new aeu("textures/gui/advancements/backgrounds/nether.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(cpq.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjd.tf, ti.c("advancements.nether.return_to_sender.title"), ti.c("advancements.nether.return_to_sender.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bip.Q), bf.a.a().a(dc.a(apq.j)).a(bq.a.a().a(bip.ag))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(csr.fn, ti.c("advancements.nether.find_fortress.title"), ti.c("advancements.nether.find_fortress.description"), null, ar.a, true, true, false)
         .a("fortress", cs.a.a(cj.a.c(dux.o)))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cjd.tp, ti.c("advancements.nether.fast_travel.title"), ti.c("advancements.nether.fast_travel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bi.a.a(bh.a(cl.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cjd.rs, ti.c("advancements.nether.uneasy_alliance.title"), ti.c("advancements.nether.uneasy_alliance.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", ce.a.a(bq.a.a().a(bip.Q).a(cj.a.b(cpq.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csr.gG, ti.c("advancements.nether.get_wither_skull.title"), ti.c("advancements.nether.get_wither_skull.description"), null, ar.a, true, true, false)
         .a("wither_skull", bz.a.a(csr.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjd.ty, ti.c("advancements.nether.summon_wither.title"), ti.c("advancements.nether.summon_wither.description"), null, ar.a, true, true, false)
         .a("summoned", db.a.a(bq.a.a().a(bip.bk)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cjd.rr, ti.c("advancements.nether.obtain_blaze_rod.title"), ti.c("advancements.nether.obtain_blaze_rod.description"), null, ar.a, true, true, false)
         .a("blaze_rod", bz.a.a(cjd.rr))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(csr.fO, ti.c("advancements.nether.create_beacon.title"), ti.c("advancements.nether.create_beacon.description"), null, ar.a, true, true, false)
         .a("beacon", ba.a.a(cl.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            csr.fO,
            ti.c("advancements.nether.create_full_beacon.title"),
            ti.c("advancements.nether.create_full_beacon.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(cl.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(cjd.rv, ti.c("advancements.nether.brew_potion.title"), ti.c("advancements.nether.brew_potion.description"), null, ar.a, true, true, false)
         .a("potion", ax.a.c())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cjd.pQ, ti.c("advancements.nether.all_potions.title"), ti.c("advancements.nether.all_potions.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bj.a.a(cm.a.a().a(bia.a).a(bia.b).a(bia.e).a(bia.h).a(bia.j).a(bia.l).a(bia.m).a(bia.n).a(bia.p).a(bia.r).a(bia.s).a(bia.B).a(bia.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cjd.pK, ti.c("advancements.nether.all_effects.title"), ti.c("advancements.nether.all_effects.description"), null, ar.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bj.a.a(
               cm.a.a()
                  .a(bia.a)
                  .a(bia.b)
                  .a(bia.e)
                  .a(bia.h)
                  .a(bia.j)
                  .a(bia.l)
                  .a(bia.m)
                  .a(bia.n)
                  .a(bia.p)
                  .a(bia.r)
                  .a(bia.s)
                  .a(bia.t)
                  .a(bia.c)
                  .a(bia.d)
                  .a(bia.y)
                  .a(bia.x)
                  .a(bia.v)
                  .a(bia.q)
                  .a(bia.i)
                  .a(bia.k)
                  .a(bia.B)
                  .a(bia.C)
                  .a(bia.D)
                  .a(bia.o)
                  .a(bia.E)
                  .a(bia.F)
                  .a(bia.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cjd.ap,
            ti.c("advancements.nether.obtain_ancient_debris.title"),
            ti.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bz.a.a(cjd.ap))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cjd.pf, ti.c("advancements.nether.netherite_armor.title"), ti.c("advancements.nether.netherite_armor.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", bz.a.a(cjd.pe, cjd.pf, cjd.pg, cjd.ph))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cjd.vF, ti.c("advancements.nether.use_lodestone.title"), ti.c("advancements.nether.use_lodestone.description"), null, ar.a, true, true, false)
         .a("use_lodestone", cc.a.a(cj.a.a().a(av.a.a().a(csr.pq)), cb.a.a().a(cjd.qe)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cjd.vG,
            ti.c("advancements.nether.obtain_crying_obsidian.title"),
            ti.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bz.a.a(cjd.vG))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cjd.vT,
            ti.c("advancements.nether.charge_respawn_anchor.title"),
            ti.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cc.a.a(cj.a.a().a(av.a.a().a(csr.pl).a(da.a.a().a(cyx.c, 4))), cb.a.a().a(csr.ed)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cjd.ng, ti.c("advancements.nether.ride_strider.title"), ti.c("advancements.nether.ride_strider.description"), null, ar.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ca.a.a(Optional.of(bq.a(bq.a.a().a(bq.a.a().a(bip.aV)))), Optional.of(cb.a.a().a(cjd.ng).b()), cl.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cjd.ng,
            ti.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            ti.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bi.a.a(bq.a.a().a(cj.a.b(cpq.h)).a(bq.a.a().a(bip.aV)), bh.a(cl.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      jr.a(ae.a.a(), crc.a.a.a().toList())
         .a($$13)
         .a(cjd.ph, ti.c("advancements.nether.explore_nether.title"), ti.c("advancements.nether.explore_nether.description"), null, ar.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cjd.vP, ti.c("advancements.nether.find_bastion.title"), ti.c("advancements.nether.find_bastion.description"), null, ar.a, true, true, false)
         .a("bastion", cs.a.a(cj.a.c(dux.s)))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(csr.cv, ti.c("advancements.nether.loot_bastion.title"), ti.c("advancements.nether.loot_bastion.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", ck.a.a(new aeu("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ck.a.a(new aeu("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ck.a.a(new aeu("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ck.a.a(new aeu("minecraft:chests/bastion_bridge")))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cjd.nU, ti.c("advancements.nether.distract_piglin.title"), ti.c("advancements.nether.distract_piglin.description"), null, ar.a, true, true, false)
         .a("distract_piglin", co.a.a(a, Optional.of(cb.a.a().a(apw.U).b()), Optional.of(bq.a(bq.a.a().a(bip.aw).a(bo.a.a().e(false))))))
         .a("distract_piglin_directly", cq.a.a(Optional.of(a), cb.a.a().a(cag.c), Optional.of(bq.a(bq.a.a().a(bip.aw).a(bo.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
