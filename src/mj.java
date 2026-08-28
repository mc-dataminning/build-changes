import java.util.Optional;
import java.util.function.Consumer;

public class mj implements me {
   private static final bg a = bg.a(
      euz.a(erl.b.a, bv.a.a().a(bs.a.a().a(cs.a.a().a(cur.pO)))).invert().build(),
      euz.a(erl.b.a, bv.a.a().a(bs.a.a().b(cs.a.a().a(cur.pP)))).invert().build(),
      euz.a(erl.b.a, bv.a.a().a(bs.a.a().c(cs.a.a().a(cur.pQ)))).invert().build(),
      euz.a(erl.b.a, bv.a.a().a(bs.a.a().d(cs.a.a().a(cur.pR)))).invert().build()
   );

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfy.kL,
            wy.c("advancements.nether.root.title"),
            wy.c("advancements.nether.root.description"),
            akq.b("textures/gui/advancements/backgrounds/nether.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_nether", az.a.a(dcu.i))
         .a($$1, "nether/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cur.tX, wy.c("advancements.nether.return_to_sender.title"), wy.c("advancements.nether.return_to_sender.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_ghast", da.a.a(bv.a.a().a(bsw.T), bk.a.a().a(ed.a(awf.j)).a(bv.a.a().a(bsw.ak))))
         .a($$1, "nether/return_to_sender");
      ag $$4 = af.a.a()
         .a($$2)
         .a(dfy.fn, wy.c("advancements.nether.find_fortress.title"), wy.c("advancements.nether.find_fortress.description"), null, am.a, true, true, false)
         .a("fortress", dq.a.a(df.a.b($$0.b(lu.aR).b(ejg.o))))
         .a($$1, "nether/find_fortress");
      af.a.a()
         .a($$2)
         .a(cur.uj, wy.c("advancements.nether.fast_travel.title"), wy.c("advancements.nether.fast_travel.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("travelled", bn.a.a(bm.a(dh.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      af.a.a()
         .a($$3)
         .a(cur.sh, wy.c("advancements.nether.uneasy_alliance.title"), wy.c("advancements.nether.uneasy_alliance.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("killed_ghast", da.a.a(bv.a.a().a(bsw.T).a(df.a.a(dcu.h))))
         .a($$1, "nether/uneasy_alliance");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dfy.gG, wy.c("advancements.nether.get_wither_skull.title"), wy.c("advancements.nether.get_wither_skull.description"), null, am.a, true, true, false)
         .a("wither_skull", cg.a.a(dfy.gG))
         .a($$1, "nether/get_wither_skull");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cur.us, wy.c("advancements.nether.summon_wither.title"), wy.c("advancements.nether.summon_wither.description"), null, am.a, true, true, false)
         .a("summoned", ec.a.a(bv.a.a().a(bsw.bp)))
         .a($$1, "nether/summon_wither");
      ag $$7 = af.a.a()
         .a($$4)
         .a(cur.sg, wy.c("advancements.nether.obtain_blaze_rod.title"), wy.c("advancements.nether.obtain_blaze_rod.description"), null, am.a, true, true, false)
         .a("blaze_rod", cg.a.a(cur.sg))
         .a($$1, "nether/obtain_blaze_rod");
      ag $$8 = af.a.a()
         .a($$6)
         .a(dfy.fO, wy.c("advancements.nether.create_beacon.title"), wy.c("advancements.nether.create_beacon.description"), null, am.a, true, true, false)
         .a("beacon", be.a.a(dh.d.b(1)))
         .a($$1, "nether/create_beacon");
      af.a.a()
         .a($$8)
         .a(
            dfy.fO,
            wy.c("advancements.nether.create_full_beacon.title"),
            wy.c("advancements.nether.create_full_beacon.description"),
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
         .a(cur.sk, wy.c("advancements.nether.brew_potion.title"), wy.c("advancements.nether.brew_potion.description"), null, am.a, true, true, false)
         .a("potion", ay.a.b())
         .a($$1, "nether/brew_potion");
      ag $$10 = af.a.a()
         .a($$9)
         .a(cur.qE, wy.c("advancements.nether.all_potions.title"), wy.c("advancements.nether.all_potions.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsa.a)
                  .a(bsa.b)
                  .a(bsa.e)
                  .a(bsa.h)
                  .a(bsa.j)
                  .a(bsa.l)
                  .a(bsa.m)
                  .a(bsa.n)
                  .a(bsa.p)
                  .a(bsa.r)
                  .a(bsa.s)
                  .a(bsa.B)
                  .a(bsa.k)
                  .a(bsa.L)
                  .a(bsa.M)
                  .a(bsa.J)
                  .a(bsa.K)
            )
         )
         .a($$1, "nether/all_potions");
      af.a.a()
         .a($$10)
         .a(cur.qy, wy.c("advancements.nether.all_effects.title"), wy.c("advancements.nether.all_effects.description"), null, am.b, true, true, true)
         .a(ak.a.a(1000))
         .a(
            "all_effects",
            bo.a.a(
               di.a.a()
                  .a(bsa.a)
                  .a(bsa.b)
                  .a(bsa.e)
                  .a(bsa.h)
                  .a(bsa.j)
                  .a(bsa.l)
                  .a(bsa.m)
                  .a(bsa.n)
                  .a(bsa.p)
                  .a(bsa.r)
                  .a(bsa.s)
                  .a(bsa.t)
                  .a(bsa.c)
                  .a(bsa.d)
                  .a(bsa.y)
                  .a(bsa.x)
                  .a(bsa.v)
                  .a(bsa.q)
                  .a(bsa.i)
                  .a(bsa.k)
                  .a(bsa.B)
                  .a(bsa.C)
                  .a(bsa.D)
                  .a(bsa.o)
                  .a(bsa.E)
                  .a(bsa.F)
                  .a(bsa.G)
                  .a(bsa.L)
                  .a(bsa.M)
                  .a(bsa.J)
                  .a(bsa.K)
                  .a(bsa.H)
                  .a(bsa.I)
            )
         )
         .a($$1, "nether/all_effects");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cur.aC,
            wy.c("advancements.nether.obtain_ancient_debris.title"),
            wy.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cg.a.a(cur.aC))
         .a($$1, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$11)
         .a(cur.pT, wy.c("advancements.nether.netherite_armor.title"), wy.c("advancements.nether.netherite_armor.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a("netherite_armor", cg.a.a(cur.pS, cur.pT, cur.pU, cur.pV))
         .a($$1, "nether/netherite_armor");
      af.a.a()
         .a($$11)
         .a(cur.wE, wy.c("advancements.nether.use_lodestone.title"), wy.c("advancements.nether.use_lodestone.description"), null, am.a, true, true, false)
         .a("use_lodestone", cw.a.a(df.a.a().a(aw.a.a().a(dfy.pq)), cs.a.a().a(cur.qS)))
         .a($$1, "nether/use_lodestone");
      ag $$12 = af.a.a()
         .a($$2)
         .a(
            cur.wF,
            wy.c("advancements.nether.obtain_crying_obsidian.title"),
            wy.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cg.a.a(cur.wF))
         .a($$1, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$12)
         .a(
            cur.wS,
            wy.c("advancements.nether.charge_respawn_anchor.title"),
            wy.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", cw.a.a(df.a.a().a(aw.a.a().a(dfy.pl).a(eb.a.a().a(dmf.d, 4))), cs.a.a().a(dfy.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      ag $$13 = af.a.a()
         .a($$2)
         .a(cur.nS, wy.c("advancements.nether.ride_strider.title"), wy.c("advancements.nether.ride_strider.description"), null, am.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bv.a(bv.a.a().a(bv.a.a().a(bsw.aZ)))), Optional.of(cs.a.a().a(cur.nS).b()), dh.d.c))
         .a($$1, "nether/ride_strider");
      af.a.a()
         .a($$13)
         .a(
            cur.nS,
            wy.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wy.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bn.a.a(bv.a.a().a(df.a.a(dcu.h)).a(bv.a.a().a(bsw.aZ)), bm.a(dh.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mh.a(af.a.a(), $$0, dei.a.a.a().toList())
         .a($$13)
         .a(cur.pV, wy.c("advancements.nether.explore_nether.title"), wy.c("advancements.nether.explore_nether.description"), null, am.b, true, true, false)
         .a(ak.a.a(500))
         .a($$1, "nether/explore_nether");
      ag $$14 = af.a.a()
         .a($$2)
         .a(cur.wO, wy.c("advancements.nether.find_bastion.title"), wy.c("advancements.nether.find_bastion.description"), null, am.a, true, true, false)
         .a("bastion", dq.a.a(df.a.b($$0.b(lu.aR).b(ejg.s))))
         .a($$1, "nether/find_bastion");
      af.a.a()
         .a($$14)
         .a(dfy.cv, wy.c("advancements.nether.loot_bastion.title"), wy.c("advancements.nether.loot_bastion.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("loot_bastion_other", dg.a.a(erh.M))
         .a("loot_bastion_treasure", dg.a.a(erh.L))
         .a("loot_bastion_hoglin_stable", dg.a.a(erh.O))
         .a("loot_bastion_bridge", dg.a.a(erh.N))
         .a($$1, "nether/loot_bastion");
      af.a.a()
         .a($$2)
         .a(aj.a.b)
         .a(cur.oJ, wy.c("advancements.nether.distract_piglin.title"), wy.c("advancements.nether.distract_piglin.description"), null, am.a, true, true, false)
         .a("distract_piglin", dl.a.a(a, Optional.of(cs.a.a().a(awm.U).b()), Optional.of(bv.a(bv.a.a().a(bsw.aA).a(bt.a.a().g(false))))))
         .a("distract_piglin_directly", dn.a.a(Optional.of(a), cs.a.a().a(clm.c), Optional.of(bv.a(bv.a.a().a(bsw.aA).a(bt.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
