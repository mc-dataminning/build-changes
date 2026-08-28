import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mo implements ml {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bvi<?>> a = Arrays.asList(
      bvi.o,
      bvi.q,
      bvi.r,
      bvi.v,
      bvi.E,
      bvi.F,
      bvi.L,
      bvi.N,
      bvi.Q,
      bvi.O,
      bvi.P,
      bvi.T,
      bvi.ae,
      bvi.aj,
      bvi.ak,
      bvi.an,
      bvi.aA,
      bvi.aQ,
      bvi.aS,
      bvi.aT,
      bvi.aU,
      bvi.aZ,
      bvi.bc,
      bvi.be,
      bvi.bf,
      bvi.bh,
      bvi.bo,
      bvi.bs,
      bvi.bC,
      bvi.bE,
      bvi.bI,
      bvi.bK,
      bvi.bJ,
      bvi.bN,
      bvi.bQ,
      bvi.bO,
      bvi.bR
   );

   private static ap<dg.a> a(dj.d $$0, Optional<bw> $$1) {
      return dg.a.a(Optional.of(bw.a.a().a(bn.c(dj.c.c(30.0))).a(df.a($$0)).b()), $$1);
   }

   private static ap<em.a> a(bw.a $$0, cu.a $$1) {
      return em.a.a(bw.a.a().a(dr.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvi<?>> $$2 = $$0.d(mb.z);
      jr<cxc> $$3 = $$0.d(mb.K);
      jr<dkd> $$4 = $$0.d(mb.f);
      ah $$5 = ag.a.a()
         .a(
            cxk.vi,
            xk.c("advancements.adventure.root.title"),
            xk.c("advancements.adventure.root.description"),
            alp.b("textures/gui/advancements/backgrounds/adventure.png"),
            an.a,
            false,
            false,
            false
         )
         .a(ak.a.b)
         .a("killed_something", dc.a.b())
         .a("killed_by_something", dc.a.d())
         .a($$1, "adventure/root");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dkf.bu, xk.c("advancements.adventure.sleep_in_bed.title"), xk.c("advancements.adventure.sleep_in_bed.description"), null, an.a, true, true, false)
         .a("slept_in_bed", ds.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dip.a.b);
      ah $$7 = ag.a.a()
         .a($$5)
         .a(cxk.pf, xk.c("advancements.adventure.trade.title"), xk.c("advancements.adventure.trade.description"), null, an.a, true, true, false)
         .a("traded", ej.a.b())
         .a($$1, "adventure/trade");
      ag.a.a()
         .a($$7)
         .a(
            cxk.pf,
            xk.c("advancements.adventure.trade_at_world_height.title"),
            xk.c("advancements.adventure.trade_at_world_height.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", ej.a.a(bw.a.a().a(dh.a.a(dj.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ah $$8 = a($$5, $$1, $$2, a);
      ah $$9 = ag.a.a()
         .a($$8)
         .a(cxk.pa, xk.c("advancements.adventure.shoot_arrow.title"), xk.c("advancements.adventure.shoot_arrow.description"), null, an.a, true, true, false)
         .a("shot_arrow", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axm.j)).a(bw.a.a().a($$2, axo.f)))))
         .a($$1, "adventure/shoot_arrow");
      ah $$10 = ag.a.a()
         .a($$8)
         .a(cxk.wS, xk.c("advancements.adventure.throw_trident.title"), xk.c("advancements.adventure.throw_trident.description"), null, an.a, true, true, false)
         .a("shot_trident", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axm.j)).a(bw.a.a().a($$2, bvi.bz)))))
         .a($$1, "adventure/throw_trident");
      ag.a.a()
         .a($$10)
         .a(
            cxk.wS,
            xk.c("advancements.adventure.very_very_frightening.title"),
            xk.c("advancements.adventure.very_very_frightening.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("struck_villager", bb.a.a(bw.a.a().a($$2, bvi.bD)))
         .a($$1, "adventure/very_very_frightening");
      ag.a.a()
         .a($$7)
         .a(
            dkf.er,
            xk.c("advancements.adventure.summon_iron_golem.title"),
            xk.c("advancements.adventure.summon_iron_golem.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ef.a.a(bw.a.a().a($$2, bvi.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ag.a.a()
         .a($$9)
         .a(cxk.pb, xk.c("advancements.adventure.sniper_duel.title"), xk.c("advancements.adventure.sniper_duel.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_skeleton", dc.a.a(bw.a.a().a($$2, bvi.bf).a(bn.a(dj.c.b(50.0))), bl.a.a().a(eg.a(axm.j))))
         .a($$1, "adventure/sniper_duel");
      ag.a.a()
         .a($$8)
         .a(
            cxk.wt,
            xk.c("advancements.adventure.totem_of_undying.title"),
            xk.c("advancements.adventure.totem_of_undying.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("used_totem", el.a.a($$3, cxk.wt))
         .a($$1, "adventure/totem_of_undying");
      ah $$11 = ag.a.a()
         .a($$5)
         .a(cxk.wV, xk.c("advancements.adventure.ol_betsy.title"), xk.c("advancements.adventure.ol_betsy.description"), null, an.a, true, true, false)
         .a("shot_crossbow", dx.a.a($$3, cxk.wV))
         .a($$1, "adventure/ol_betsy");
      ag.a.a()
         .a($$11)
         .a(
            cxk.wV,
            xk.c("advancements.adventure.whos_the_pillager_now.title"),
            xk.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("kill_pillager", db.a.a($$3, bw.a.a().a($$2, bvi.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ag.a.a()
         .a($$11)
         .a(
            cxk.wV,
            xk.c("advancements.adventure.two_birds_one_arrow.title"),
            xk.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(65))
         .a("two_birds", db.a.a($$3, bw.a.a().a($$2, bvi.aQ), bw.a.a().a($$2, bvi.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ag.a.a()
         .a($$11)
         .a(cxk.wV, xk.c("advancements.adventure.arbalistic.title"), xk.c("advancements.adventure.arbalistic.description"), null, an.b, true, true, true)
         .a(al.a.a(85))
         .a("arbalistic", db.a.a($$3, dj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      js.b<dug> $$12 = $$0.d(mb.d);
      ah $$13 = ag.a.a()
         .a($$5)
         .a(
            crb.a($$12),
            xk.c("advancements.adventure.voluntary_exile.title"),
            xk.c("advancements.adventure.voluntary_exile.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dc.a.a(bw.a.a().a($$2, axo.c).a(bt.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ag.a.a()
         .a($$13)
         .a(
            crb.a($$12),
            xk.c("advancements.adventure.hero_of_the_village.title"),
            xk.c("advancements.adventure.hero_of_the_village.description"),
            null,
            an.b,
            true,
            true,
            true
         )
         .a(al.a.a(100))
         .a("hero_of_the_village", ds.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ag.a.a()
         .a($$5)
         .a(
            dkf.pI.j(),
            xk.c("advancements.adventure.honey_block_slide.title"),
            xk.c("advancements.adventure.honey_block_slide.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", ea.a.a(dkf.pI))
         .a($$1, "adventure/honey_block_slide");
      ag.a.a()
         .a($$9)
         .a(dkf.pF.j(), xk.c("advancements.adventure.bullseye.title"), xk.c("advancements.adventure.bullseye.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("bullseye", ei.a.a(dj.d.a(15), Optional.of(bw.a(bw.a.a().a(bn.a(dj.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ag.a.a()
         .a($$6)
         .a(
            cxk.qg,
            xk.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xk.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ds.a.a($$4, $$3, dkf.rr, cxk.qg))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ag.a.a()
         .a($$5)
         .a(
            cxk.mu,
            xk.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xk.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dj.d.a(0), Optional.of(bw.a.a().a($$2, bvi.bD).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cxk.rU,
            xk.c("advancements.adventure.spyglass_at_parrot.title"),
            xk.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bw.a.a().a($$2, bvi.aP), cu.a.a().a($$3, cxk.rU)))
         .a($$1, "adventure/spyglass_at_parrot");
      ah $$15 = ag.a.a()
         .a($$14)
         .a(
            cxk.rU,
            xk.c("advancements.adventure.spyglass_at_ghast.title"),
            xk.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bw.a.a().a($$2, bvi.ae), cu.a.a().a($$3, cxk.rU)))
         .a($$1, "adventure/spyglass_at_ghast");
      ag.a.a()
         .a($$6)
         .a(
            cxk.fm,
            xk.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xk.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cy.a.a(dh.a.a().a(ju.a($$0.d(mb.aI).b(dii.E))).a(ax.a.a().a($$4, dkf.eg)), cu.a.a().a(cw.n, cs.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ag.a.a()
         .a($$15)
         .a(
            cxk.rU,
            xk.c("advancements.adventure.spyglass_at_dragon.title"),
            xk.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bw.a.a().a($$2, bvi.Q), cu.a.a().a($$3, cxk.rU)))
         .a($$1, "adventure/spyglass_at_dragon");
      ag.a.a()
         .a($$5)
         .a(
            cxk.rg,
            xk.c("advancements.adventure.fall_from_world_height.title"),
            xk.c("advancements.adventure.fall_from_world_height.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bo.a.a(bw.a.a().a(dh.a.a(dj.c.c(-59.0))), bn.b(dj.c.b(379.0)), dh.a.a(dj.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ag.a.a()
         .a($$8)
         .a(
            dkf.rw,
            xk.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xk.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", dc.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ag.a.a()
         .a($$5)
         .a(
            dkf.rs,
            xk.c("advancements.adventure.avoid_vibration.title"),
            xk.c("advancements.adventure.avoid_vibration.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", ds.a.d())
         .a($$1, "adventure/avoid_vibration");
      ah $$16 = a($$3, ag.a.a())
         .a($$5)
         .a(cxk.yv, xk.c("advancements.adventure.salvage_sherd.title"), xk.c("advancements.adventure.salvage_sherd.description"), null, an.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ag.a.a()
         .a($$16)
         .a(
            dvh.a(new dvx(Optional.empty(), Optional.of(cxk.za), Optional.empty(), Optional.of(cxk.yW))),
            xk.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xk.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            du.a.a(
               alo.a(mb.bk, alp.b("decorated_pot")),
               List.of(cu.a.a().a($$3, axt.bH), cu.a.a().a($$3, axt.bH), cu.a.a().a($$3, axt.bH), cu.a.a().a($$3, axt.bH))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ah $$17 = b(ag.a.a())
         .a($$5)
         .a(
            new cxg(cxk.yy),
            xk.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xk.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ag.a.a())
         .a($$17)
         .a(
            new cxg(cxk.yK),
            xk.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xk.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ag.a.a()
         .a($$5)
         .a(
            cxk.eO,
            xk.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xk.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("chiseled_bookshelf", a($$4, dkf.ct))
         .a("comparator", b($$4, dkf.ct))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ag.a.a()
         .a($$5)
         .a(
            cxk.oV,
            xk.c("advancements.adventure.brush_armadillo.title"),
            xk.c("advancements.adventure.brush_armadillo.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dq.a.a(cu.a.a().a($$3, cxk.yv), Optional.of(bw.a(bw.a.a().a($$2, bvi.e)))))
         .a($$1, "adventure/brush_armadillo");
      ah $$18 = ag.a.a()
         .a($$5)
         .a(
            dkf.rj,
            xk.c("advancements.adventure.minecraft_trials_edition.title"),
            xk.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", ds.a.a(dh.a.b($$0.d(mb.aU).b(enx.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ag.a.a()
         .a($$18)
         .a(cxk.zu, xk.c("advancements.adventure.lighten_up.title"), xk.c("advancements.adventure.lighten_up.description"), null, an.a, true, true, false)
         .a("lighten_up", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkf.sP, dkf.sO, dkf.sN, dkf.sT, dkf.sS, dkf.sR).a(ee.a.a().a(dlr.c, true))), cu.a.a().a($$3, mp.c)))
         .a($$1, "adventure/lighten_up");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(
            cxk.zD,
            xk.c("advancements.adventure.under_lock_and_key.title"),
            xk.c("advancements.adventure.under_lock_and_key.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkf.tU).a(ee.a.a().a(dtd.d, false))), cu.a.a().a($$3, cxk.zD)))
         .a($$1, "adventure/under_lock_and_key");
      ag.a.a()
         .a($$19)
         .a(cxk.zE, xk.c("advancements.adventure.revaulting.title"), xk.c("advancements.adventure.revaulting.description"), null, an.c, true, true, false)
         .a("revaulting", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkf.tU).a(ee.a.a().a(dtd.d, true))), cu.a.a().a($$3, cxk.zE)))
         .a($$1, "adventure/revaulting");
      ag.a.a()
         .a($$18)
         .a(cxk.uW, xk.c("advancements.adventure.blowback.title"), xk.c("advancements.adventure.blowback.description"), null, an.b, true, true, false)
         .a(al.a.a(40))
         .a("blowback", dc.a.a(bw.a.a().a($$2, bvi.r), bl.a.a().a(eg.a(axm.j)).a(bw.a.a().a($$2, bvi.s))))
         .a($$1, "adventure/blowback");
      ag.a.a()
         .a($$5)
         .a(
            cxk.sQ,
            xk.c("advancements.adventure.crafters_crafting_crafters.title"),
            xk.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", du.a.b(alo.a(mb.bk, alp.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ag.a.a()
         .a($$18)
         .a(
            cxk.uW,
            xk.c("advancements.adventure.who_needs_rockets.title"),
            xk.c("advancements.adventure.who_needs_rockets.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", ca.a.a(bn.b(dj.c.b(7.0)), bw.a.a().a($$2, bvi.bH)))
         .a($$1, "adventure/who_needs_rockets");
      ag.a.a()
         .a($$18)
         .a(cxk.va, xk.c("advancements.adventure.overoverkill.title"), xk.c("advancements.adventure.overoverkill.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("overoverkill", dp.a.a(bk.a.a().a(dj.c.b(100.0)).a(bl.a.a().a(eg.a(axm.H)).a(bw.a.a().a($$2, bvi.bS).a(bt.a.a().f(cu.a.a().a($$3, cxk.va)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bvi<?>> $$2, List<bvi<?>> $$3) {
      ah $$4 = a(ag.a.a(), $$2, $$3)
         .a($$0)
         .a(cxk.pG, xk.c("advancements.adventure.kill_a_mob.title"), xk.c("advancements.adventure.kill_a_mob.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ag.a.a(), $$2, $$3)
         .a($$4)
         .a(cxk.pL, xk.c("advancements.adventure.kill_all_mobs.title"), xk.c("advancements.adventure.kill_all_mobs.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ap<cy.a> a(jr<dkd> $$0, dkd $$1) {
      ezr.a[] $$2 = dln.aF.a().stream().map($$1x -> {
         ee.a $$2x = ee.a.a().a(dln.aF, $$1x);
         ax.a $$3 = ax.a.a().a($$0, dkf.hv).a($$2x);
         return ezp.a(dh.a.a().a($$3), new jh($$1x.g().q()));
      }).toArray(ezr.a[]::new);
      return cy.a.a(ezq.a($$1), ezf.a($$2));
   }

   private static ap<cy.a> b(jr<dkd> $$0, dkd $$1) {
      ezr.a[] $$2 = dln.aF.a().stream().map($$2x -> {
         ee.a $$3 = ee.a.a().a(dln.aF, $$2x);
         ezq.a $$4 = new ezq.a(dkf.hv).a($$3);
         ezr.a $$5 = ezp.a(dh.a.a().a(ax.a.a().a($$0, $$1)), new jh($$2x.q()));
         return eze.a($$4, $$5);
      }).toArray(ezr.a[]::new);
      return cy.a.a(ezf.a($$2));
   }

   private static ag.a a(ag.a $$0) {
      $$0.a(ak.a.a);
      Set<cxc> $$1 = Set.of(cxk.yH, cxk.yF, cxk.yG, cxk.yB, cxk.yK, cxk.yD, cxk.yE, cxk.yI);
      pi.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b().a(), du.a.a($$1x.b())));
      return $$0;
   }

   private static ag.a b(ag.a $$0) {
      $$0.a(ak.a.b);
      pi.b().map(pi.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), du.a.a((alo<dbv<?>>)$$1)));
      return $$0;
   }

   private static ag.a a(jr<cxc> $$0, ag.a $$1) {
      List<Pair<String, ap<di.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", di.a.a(ewe.aY)),
         Pair.of("desert_well", di.a.a(ewe.aX)),
         Pair.of("ocean_ruin_cold", di.a.a(ewe.bc)),
         Pair.of("ocean_ruin_warm", di.a.a(ewe.bb)),
         Pair.of("trail_ruins_rare", di.a.a(ewe.ba)),
         Pair.of("trail_ruins_common", di.a.a(ewe.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ap<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ci.a.a(cu.a.a().a($$0, axt.bH)));
      $$1.a(new ak(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(js.a $$0, Consumer<ah> $$1, ah $$2, dip.a $$3) {
      a(ag.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cxk.qs,
            xk.c("advancements.adventure.adventuring_time.title"),
            xk.c("advancements.adventure.adventuring_time.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ag.a a(ag.a $$0, jr<bvi<?>> $$1, List<bvi<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(ma.f.b($$2x).toString(), dc.a.a(bw.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ag.a a(ag.a $$0, js.a $$1, List<alo<dib>> $$2) {
      jr<dib> $$3 = $$1.d(mb.aI);

      for (alo<dib> $$4 : $$2) {
         $$0.a($$4.a().toString(), ds.a.a(dh.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
