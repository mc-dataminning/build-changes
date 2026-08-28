import java.util.Optional;
import java.util.function.Consumer;

public class mh implements ma {
   private static final bf a = bf.a(
      etu.a(eqh.b.a, bu.a.a().a(br.a.a().a(cp.a.a().a(cur.pO)))).invert().build(),
      etu.a(eqh.b.a, bu.a.a().a(br.a.a().b(cp.a.a().a(cur.pP)))).invert().build(),
      etu.a(eqh.b.a, bu.a.a().a(br.a.a().c(cp.a.a().a(cur.pQ)))).invert().build(),
      etu.a(eqh.b.a, bu.a.a().a(br.a.a().d(cp.a.a().a(cur.pR)))).invert().build()
   );

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfa.kL,
            xo.c("advancements.nether.root.title"),
            xo.c("advancements.nether.root.description"),
            new ale("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(dbx.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cur.tX, xo.c("advancements.nether.return_to_sender.title"), xo.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsz.T), bj.a.a().a(dz.a(awq.k)).a(bu.a.a().a(bsz.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dfa.fn, xo.c("advancements.nether.find_fortress.title"), xo.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eid.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(cur.uj, xo.c("advancements.nether.fast_travel.title"), xo.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bm.a.a(bl.a(de.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(cur.sh, xo.c("advancements.nether.uneasy_alliance.title"), xo.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cx.a.a(bu.a.a().a(bsz.T).a(dc.a.a(dbx.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfa.gG, xo.c("advancements.nether.get_wither_skull.title"), xo.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", ce.a.a(dfa.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cur.us, xo.c("advancements.nether.summon_wither.title"), xo.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dy.a.a(bu.a.a().a(bsz.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(cur.sg, xo.c("advancements.nether.obtain_blaze_rod.title"), xo.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", ce.a.a(cur.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dfa.fO, xo.c("advancements.nether.create_beacon.title"), xo.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", bd.a.a(de.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dfa.fO,
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
         .a(cur.sk, xo.c("advancements.nether.brew_potion.title"), xo.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(cur.qE, xo.c("advancements.nether.all_potions.title"), xo.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bn.a.a(df.a.a().a(bsd.a).a(bsd.b).a(bsd.e).a(bsd.h).a(bsd.j).a(bsd.l).a(bsd.m).a(bsd.n).a(bsd.p).a(bsd.r).a(bsd.s).a(bsd.B).a(bsd.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(cur.qy, xo.c("advancements.nether.all_effects.title"), xo.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bn.a.a(
               df.a.a()
                  .a(bsd.a)
                  .a(bsd.b)
                  .a(bsd.e)
                  .a(bsd.h)
                  .a(bsd.j)
                  .a(bsd.l)
                  .a(bsd.m)
                  .a(bsd.n)
                  .a(bsd.p)
                  .a(bsd.r)
                  .a(bsd.s)
                  .a(bsd.t)
                  .a(bsd.c)
                  .a(bsd.d)
                  .a(bsd.y)
                  .a(bsd.x)
                  .a(bsd.v)
                  .a(bsd.q)
                  .a(bsd.i)
                  .a(bsd.k)
                  .a(bsd.B)
                  .a(bsd.C)
                  .a(bsd.D)
                  .a(bsd.o)
                  .a(bsd.E)
                  .a(bsd.F)
                  .a(bsd.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cur.aC,
            xo.c("advancements.nether.obtain_ancient_debris.title"),
            xo.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", ce.a.a(cur.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(cur.pT, xo.c("advancements.nether.netherite_armor.title"), xo.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", ce.a.a(cur.pS, cur.pT, cur.pU, cur.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(cur.wB, xo.c("advancements.nether.use_lodestone.title"), xo.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ct.a.a(dc.a.a().a(av.a.a().a(dfa.pq)), cp.a.a().a(cur.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            cur.wC,
            xo.c("advancements.nether.obtain_crying_obsidian.title"),
            xo.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", ce.a.a(cur.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            cur.wP,
            xo.c("advancements.nether.charge_respawn_anchor.title"),
            xo.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ct.a.a(dc.a.a().a(av.a.a().a(dfa.pl).a(dx.a.a().a(dlg.d, 4))), cp.a.a().a(dfa.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(cur.nS, xo.c("advancements.nether.ride_strider.title"), xo.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ck.a.a(Optional.of(bu.a(bu.a.a().a(bu.a.a().a(bsz.aZ)))), Optional.of(cp.a.a().a(cur.nS).b()), de.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            cur.nS,
            xo.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xo.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bm.a.a(bu.a.a().a(dc.a.a(dbx.h)).a(bu.a.a().a(bsz.aZ)), bl.a(de.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      mf.a(ae.a.a(), $$0, ddk.a.a.a().toList())
         .a($$13)
         .a(cur.pV, xo.c("advancements.nether.explore_nether.title"), xo.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(cur.wL, xo.c("advancements.nether.find_bastion.title"), xo.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eid.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dfa.cv, xo.c("advancements.nether.loot_bastion.title"), xo.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", dd.a.a(eqd.M))
         .a("loot_bastion_treasure", dd.a.a(eqd.L))
         .a("loot_bastion_hoglin_stable", dd.a.a(eqd.O))
         .a("loot_bastion_bridge", dd.a.a(eqd.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(cur.oI, xo.c("advancements.nether.distract_piglin.title"), xo.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", dh.a.a(a, Optional.of(cp.a.a().a(awx.U).b()), Optional.of(bu.a(bu.a.a().a(bsz.aA).a(bs.a.a().e(false))))))
         .a("distract_piglin_directly", dj.a.a(Optional.of(a), cp.a.a().a(cln.c), Optional.of(bu.a(bu.a.a().a(bsz.aA).a(bs.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
