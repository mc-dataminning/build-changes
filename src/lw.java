import java.util.Optional;
import java.util.function.Consumer;

public class lw implements lp {
   private static final bc a = bc.a(
      esq.a(eph.b.a, br.a.a().a(bo.a.a().a(ch.a.a().a(ctt.pO)))).invert().build(),
      esq.a(eph.b.a, br.a.a().a(bo.a.a().b(ch.a.a().a(ctt.pP)))).invert().build(),
      esq.a(eph.b.a, br.a.a().a(bo.a.a().c(ch.a.a().a(ctt.pQ)))).invert().build(),
      esq.a(eph.b.a, br.a.a().a(bo.a.a().d(ch.a.a().a(ctt.pR)))).invert().build()
   );

   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dec.kL,
            wx.c("advancements.nether.root.title"),
            wx.c("advancements.nether.root.description"),
            new akn("textures/gui/advancements/backgrounds/nether.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_nether", ay.a.a(daz.i))
         .a($$1, "nether/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctt.tX, wx.c("advancements.nether.return_to_sender.title"), wx.c("advancements.nether.return_to_sender.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_ghast", cm.a.a(br.a.a().a(bsc.T), bg.a.a().a(dn.a(avz.k)).a(br.a.a().a(bsc.ak))))
         .a($$1, "nether/return_to_sender");
      af $$4 = ae.a.a()
         .a($$2)
         .a(dec.fn, wx.c("advancements.nether.find_fortress.title"), wx.c("advancements.nether.find_fortress.description"), null, al.a, true, true, false)
         .a("fortress", da.a.a(cr.a.b($$0.b(lf.aJ).b(ehf.o))))
         .a($$1, "nether/find_fortress");
      ae.a.a()
         .a($$2)
         .a(ctt.uj, wx.c("advancements.nether.fast_travel.title"), wx.c("advancements.nether.fast_travel.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("travelled", bj.a.a(bi.a(ct.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ae.a.a()
         .a($$3)
         .a(ctt.sh, wx.c("advancements.nether.uneasy_alliance.title"), wx.c("advancements.nether.uneasy_alliance.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("killed_ghast", cm.a.a(br.a.a().a(bsc.T).a(cr.a.a(daz.h))))
         .a($$1, "nether/uneasy_alliance");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dec.gG, wx.c("advancements.nether.get_wither_skull.title"), wx.c("advancements.nether.get_wither_skull.description"), null, al.a, true, true, false)
         .a("wither_skull", cb.a.a(dec.gG))
         .a($$1, "nether/get_wither_skull");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctt.us, wx.c("advancements.nether.summon_wither.title"), wx.c("advancements.nether.summon_wither.description"), null, al.a, true, true, false)
         .a("summoned", dm.a.a(br.a.a().a(bsc.bp)))
         .a($$1, "nether/summon_wither");
      af $$7 = ae.a.a()
         .a($$4)
         .a(ctt.sg, wx.c("advancements.nether.obtain_blaze_rod.title"), wx.c("advancements.nether.obtain_blaze_rod.description"), null, al.a, true, true, false)
         .a("blaze_rod", cb.a.a(ctt.sg))
         .a($$1, "nether/obtain_blaze_rod");
      af $$8 = ae.a.a()
         .a($$6)
         .a(dec.fO, wx.c("advancements.nether.create_beacon.title"), wx.c("advancements.nether.create_beacon.description"), null, al.a, true, true, false)
         .a("beacon", ba.a.a(ct.d.b(1)))
         .a($$1, "nether/create_beacon");
      ae.a.a()
         .a($$8)
         .a(
            dec.fO,
            wx.c("advancements.nether.create_full_beacon.title"),
            wx.c("advancements.nether.create_full_beacon.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("beacon", ba.a.a(ct.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      af $$9 = ae.a.a()
         .a($$7)
         .a(ctt.sk, wx.c("advancements.nether.brew_potion.title"), wx.c("advancements.nether.brew_potion.description"), null, al.a, true, true, false)
         .a("potion", ax.a.b())
         .a($$1, "nether/brew_potion");
      af $$10 = ae.a.a()
         .a($$9)
         .a(ctt.qE, wx.c("advancements.nether.all_potions.title"), wx.c("advancements.nether.all_potions.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a(
            "all_effects",
            bk.a.a(cu.a.a().a(brg.a).a(brg.b).a(brg.e).a(brg.h).a(brg.j).a(brg.l).a(brg.m).a(brg.n).a(brg.p).a(brg.r).a(brg.s).a(brg.B).a(brg.k))
         )
         .a($$1, "nether/all_potions");
      ae.a.a()
         .a($$10)
         .a(ctt.qy, wx.c("advancements.nether.all_effects.title"), wx.c("advancements.nether.all_effects.description"), null, al.b, true, true, true)
         .a(aj.a.a(1000))
         .a(
            "all_effects",
            bk.a.a(
               cu.a.a()
                  .a(brg.a)
                  .a(brg.b)
                  .a(brg.e)
                  .a(brg.h)
                  .a(brg.j)
                  .a(brg.l)
                  .a(brg.m)
                  .a(brg.n)
                  .a(brg.p)
                  .a(brg.r)
                  .a(brg.s)
                  .a(brg.t)
                  .a(brg.c)
                  .a(brg.d)
                  .a(brg.y)
                  .a(brg.x)
                  .a(brg.v)
                  .a(brg.q)
                  .a(brg.i)
                  .a(brg.k)
                  .a(brg.B)
                  .a(brg.C)
                  .a(brg.D)
                  .a(brg.o)
                  .a(brg.E)
                  .a(brg.F)
                  .a(brg.G)
            )
         )
         .a($$1, "nether/all_effects");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            ctt.aC,
            wx.c("advancements.nether.obtain_ancient_debris.title"),
            wx.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cb.a.a(ctt.aC))
         .a($$1, "nether/obtain_ancient_debris");
      ae.a.a()
         .a($$11)
         .a(ctt.pT, wx.c("advancements.nether.netherite_armor.title"), wx.c("advancements.nether.netherite_armor.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a("netherite_armor", cb.a.a(ctt.pS, ctt.pT, ctt.pU, ctt.pV))
         .a($$1, "nether/netherite_armor");
      ae.a.a()
         .a($$11)
         .a(ctt.wB, wx.c("advancements.nether.use_lodestone.title"), wx.c("advancements.nether.use_lodestone.description"), null, al.a, true, true, false)
         .a("use_lodestone", ck.a.a(cr.a.a().a(av.a.a().a(dec.pq)), ch.a.a().a(ctt.qS)))
         .a($$1, "nether/use_lodestone");
      af $$12 = ae.a.a()
         .a($$2)
         .a(
            ctt.wC,
            wx.c("advancements.nether.obtain_crying_obsidian.title"),
            wx.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cb.a.a(ctt.wC))
         .a($$1, "nether/obtain_crying_obsidian");
      ae.a.a()
         .a($$12)
         .a(
            ctt.wP,
            wx.c("advancements.nether.charge_respawn_anchor.title"),
            wx.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", ck.a.a(cr.a.a().a(av.a.a().a(dec.pl).a(dl.a.a().a(dki.d, 4))), ch.a.a().a(dec.ec)))
         .a($$1, "nether/charge_respawn_anchor");
      af $$13 = ae.a.a()
         .a($$2)
         .a(ctt.nS, wx.c("advancements.nether.ride_strider.title"), wx.c("advancements.nether.ride_strider.description"), null, al.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", ce.a.a(Optional.of(br.a(br.a.a().a(br.a.a().a(bsc.aZ)))), Optional.of(ch.a.a().a(ctt.nS).b()), ct.d.c))
         .a($$1, "nether/ride_strider");
      ae.a.a()
         .a($$13)
         .a(
            ctt.nS,
            wx.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            wx.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bj.a.a(br.a.a().a(cr.a.a(daz.h)).a(br.a.a().a(bsc.aZ)), bi.a(ct.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      lu.a(ae.a.a(), $$0, dcm.a.a.a().toList())
         .a($$13)
         .a(ctt.pV, wx.c("advancements.nether.explore_nether.title"), wx.c("advancements.nether.explore_nether.description"), null, al.b, true, true, false)
         .a(aj.a.a(500))
         .a($$1, "nether/explore_nether");
      af $$14 = ae.a.a()
         .a($$2)
         .a(ctt.wL, wx.c("advancements.nether.find_bastion.title"), wx.c("advancements.nether.find_bastion.description"), null, al.a, true, true, false)
         .a("bastion", da.a.a(cr.a.b($$0.b(lf.aJ).b(ehf.s))))
         .a($$1, "nether/find_bastion");
      ae.a.a()
         .a($$14)
         .a(dec.cv, wx.c("advancements.nether.loot_bastion.title"), wx.c("advancements.nether.loot_bastion.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("loot_bastion_other", cs.a.a(epf.M))
         .a("loot_bastion_treasure", cs.a.a(epf.L))
         .a("loot_bastion_hoglin_stable", cs.a.a(epf.O))
         .a("loot_bastion_bridge", cs.a.a(epf.N))
         .a($$1, "nether/loot_bastion");
      ae.a.a()
         .a($$2)
         .a(ai.a.b)
         .a(ctt.oI, wx.c("advancements.nether.distract_piglin.title"), wx.c("advancements.nether.distract_piglin.description"), null, al.a, true, true, false)
         .a("distract_piglin", cw.a.a(a, Optional.of(ch.a.a().a(awf.U).b()), Optional.of(br.a(br.a.a().a(bsc.aA).a(bp.a.a().e(false))))))
         .a("distract_piglin_directly", cy.a.a(Optional.of(a), ch.a.a().a(ckp.c), Optional.of(br.a(br.a.a().a(bsc.aA).a(bp.a.a().e(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
