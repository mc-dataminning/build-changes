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
   protected static final List<bvm<?>> a = Arrays.asList(
      bvm.o,
      bvm.q,
      bvm.r,
      bvm.v,
      bvm.F,
      bvm.L,
      bvm.N,
      bvm.Q,
      bvm.O,
      bvm.P,
      bvm.T,
      bvm.ae,
      bvm.aj,
      bvm.ak,
      bvm.an,
      bvm.aA,
      bvm.aQ,
      bvm.aS,
      bvm.aT,
      bvm.aU,
      bvm.aZ,
      bvm.bc,
      bvm.be,
      bvm.bf,
      bvm.bh,
      bvm.bo,
      bvm.bs,
      bvm.bC,
      bvm.bE,
      bvm.bI,
      bvm.bK,
      bvm.bJ,
      bvm.bN,
      bvm.bQ,
      bvm.bO,
      bvm.bR
   );

   private static ap<dg.a> a(dj.d $$0, Optional<bw> $$1) {
      return dg.a.a(Optional.of(bw.a.a().a(bn.c(dj.c.c(30.0))).a(df.a($$0)).b()), $$1);
   }

   private static ap<em.a> a(bw.a $$0, cu.a $$1) {
      return em.a.a(bw.a.a().a(dr.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvm<?>> $$2 = $$0.d(mb.z);
      jr<cxg> $$3 = $$0.d(mb.K);
      jr<dke> $$4 = $$0.d(mb.f);
      ah $$5 = ag.a.a()
         .a(
            cxo.uZ,
            xv.c("advancements.adventure.root.title"),
            xv.c("advancements.adventure.root.description"),
            alz.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dkg.bu, xv.c("advancements.adventure.sleep_in_bed.title"), xv.c("advancements.adventure.sleep_in_bed.description"), null, an.a, true, true, false)
         .a("slept_in_bed", ds.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, diq.a.b);
      ah $$7 = ag.a.a()
         .a($$5)
         .a(cxo.oW, xv.c("advancements.adventure.trade.title"), xv.c("advancements.adventure.trade.description"), null, an.a, true, true, false)
         .a("traded", ej.a.b())
         .a($$1, "adventure/trade");
      ag.a.a()
         .a($$7)
         .a(
            cxo.oW,
            xv.c("advancements.adventure.trade_at_world_height.title"),
            xv.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cxo.oR, xv.c("advancements.adventure.shoot_arrow.title"), xv.c("advancements.adventure.shoot_arrow.description"), null, an.a, true, true, false)
         .a("shot_arrow", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axw.j)).a(bw.a.a().a($$2, axy.f)))))
         .a($$1, "adventure/shoot_arrow");
      ah $$10 = ag.a.a()
         .a($$8)
         .a(cxo.wI, xv.c("advancements.adventure.throw_trident.title"), xv.c("advancements.adventure.throw_trident.description"), null, an.a, true, true, false)
         .a("shot_trident", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axw.j)).a(bw.a.a().a($$2, bvm.bz)))))
         .a($$1, "adventure/throw_trident");
      ag.a.a()
         .a($$10)
         .a(
            cxo.wI,
            xv.c("advancements.adventure.very_very_frightening.title"),
            xv.c("advancements.adventure.very_very_frightening.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("struck_villager", bb.a.a(bw.a.a().a($$2, bvm.bD)))
         .a($$1, "adventure/very_very_frightening");
      ag.a.a()
         .a($$7)
         .a(
            dkg.er,
            xv.c("advancements.adventure.summon_iron_golem.title"),
            xv.c("advancements.adventure.summon_iron_golem.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ef.a.a(bw.a.a().a($$2, bvm.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ag.a.a()
         .a($$9)
         .a(cxo.oS, xv.c("advancements.adventure.sniper_duel.title"), xv.c("advancements.adventure.sniper_duel.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_skeleton", dc.a.a(bw.a.a().a($$2, bvm.bf).a(bn.a(dj.c.b(50.0))), bl.a.a().a(eg.a(axw.j))))
         .a($$1, "adventure/sniper_duel");
      ag.a.a()
         .a($$8)
         .a(
            cxo.wj,
            xv.c("advancements.adventure.totem_of_undying.title"),
            xv.c("advancements.adventure.totem_of_undying.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("used_totem", el.a.a($$3, cxo.wj))
         .a($$1, "adventure/totem_of_undying");
      ah $$11 = ag.a.a()
         .a($$5)
         .a(cxo.wL, xv.c("advancements.adventure.ol_betsy.title"), xv.c("advancements.adventure.ol_betsy.description"), null, an.a, true, true, false)
         .a("shot_crossbow", dx.a.a($$3, cxo.wL))
         .a($$1, "adventure/ol_betsy");
      ag.a.a()
         .a($$11)
         .a(
            cxo.wL,
            xv.c("advancements.adventure.whos_the_pillager_now.title"),
            xv.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("kill_pillager", db.a.a($$3, bw.a.a().a($$2, bvm.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ag.a.a()
         .a($$11)
         .a(
            cxo.wL,
            xv.c("advancements.adventure.two_birds_one_arrow.title"),
            xv.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(65))
         .a("two_birds", db.a.a($$3, bw.a.a().a($$2, bvm.aQ), bw.a.a().a($$2, bvm.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ag.a.a()
         .a($$11)
         .a(cxo.wL, xv.c("advancements.adventure.arbalistic.title"), xv.c("advancements.adventure.arbalistic.description"), null, an.b, true, true, true)
         .a(al.a.a(85))
         .a("arbalistic", db.a.a($$3, dj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      js.b<duf> $$12 = $$0.d(mb.d);
      ah $$13 = ag.a.a()
         .a($$5)
         .a(
            crf.a($$12),
            xv.c("advancements.adventure.voluntary_exile.title"),
            xv.c("advancements.adventure.voluntary_exile.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dc.a.a(bw.a.a().a($$2, axy.c).a(bt.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ag.a.a()
         .a($$13)
         .a(
            crf.a($$12),
            xv.c("advancements.adventure.hero_of_the_village.title"),
            xv.c("advancements.adventure.hero_of_the_village.description"),
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
            dkg.pB.j(),
            xv.c("advancements.adventure.honey_block_slide.title"),
            xv.c("advancements.adventure.honey_block_slide.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", ea.a.a(dkg.pB))
         .a($$1, "adventure/honey_block_slide");
      ag.a.a()
         .a($$9)
         .a(dkg.py.j(), xv.c("advancements.adventure.bullseye.title"), xv.c("advancements.adventure.bullseye.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("bullseye", ei.a.a(dj.d.a(15), Optional.of(bw.a(bw.a.a().a(bn.a(dj.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ag.a.a()
         .a($$6)
         .a(
            cxo.pX,
            xv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ds.a.a($$4, $$3, dkg.rk, cxo.pX))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ag.a.a()
         .a($$5)
         .a(
            cxo.ml,
            xv.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xv.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dj.d.a(0), Optional.of(bw.a.a().a($$2, bvm.bD).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cxo.rL,
            xv.c("advancements.adventure.spyglass_at_parrot.title"),
            xv.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bw.a.a().a($$2, bvm.aP), cu.a.a().a($$3, cxo.rL)))
         .a($$1, "adventure/spyglass_at_parrot");
      ah $$15 = ag.a.a()
         .a($$14)
         .a(
            cxo.rL,
            xv.c("advancements.adventure.spyglass_at_ghast.title"),
            xv.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bw.a.a().a($$2, bvm.ae), cu.a.a().a($$3, cxo.rL)))
         .a($$1, "adventure/spyglass_at_ghast");
      ag.a.a()
         .a($$6)
         .a(
            cxo.fk,
            xv.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xv.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cy.a.a(dh.a.a().a(ju.a($$0.d(mb.aH).b(dij.D))).a(ax.a.a().a($$4, dkg.eg)), cu.a.a().a(cw.n, cs.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ag.a.a()
         .a($$15)
         .a(
            cxo.rL,
            xv.c("advancements.adventure.spyglass_at_dragon.title"),
            xv.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bw.a.a().a($$2, bvm.Q), cu.a.a().a($$3, cxo.rL)))
         .a($$1, "adventure/spyglass_at_dragon");
      ag.a.a()
         .a($$5)
         .a(
            cxo.qX,
            xv.c("advancements.adventure.fall_from_world_height.title"),
            xv.c("advancements.adventure.fall_from_world_height.description"),
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
            dkg.rp,
            xv.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xv.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dkg.rl,
            xv.c("advancements.adventure.avoid_vibration.title"),
            xv.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cxo.yl, xv.c("advancements.adventure.salvage_sherd.title"), xv.c("advancements.adventure.salvage_sherd.description"), null, an.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ag.a.a()
         .a($$16)
         .a(
            dvg.a(new dvw(Optional.empty(), Optional.of(cxo.yQ), Optional.empty(), Optional.of(cxo.yM))),
            xv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            du.a.a(
               aly.a(mb.bj, alz.b("decorated_pot")),
               List.of(cu.a.a().a($$3, ayd.bH), cu.a.a().a($$3, ayd.bH), cu.a.a().a($$3, ayd.bH), cu.a.a().a($$3, ayd.bH))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ah $$17 = b(ag.a.a())
         .a($$5)
         .a(
            new cxk(cxo.yo),
            xv.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xv.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cxk(cxo.yA),
            xv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cxo.eM,
            xv.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xv.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("chiseled_bookshelf", a($$4, dkg.ct))
         .a("comparator", b($$4, dkg.ct))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ag.a.a()
         .a($$5)
         .a(
            cxo.oM,
            xv.c("advancements.adventure.brush_armadillo.title"),
            xv.c("advancements.adventure.brush_armadillo.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dq.a.a(cu.a.a().a($$3, cxo.yl), Optional.of(bw.a(bw.a.a().a($$2, bvm.e)))))
         .a($$1, "adventure/brush_armadillo");
      ah $$18 = ag.a.a()
         .a($$5)
         .a(
            dkg.rc,
            xv.c("advancements.adventure.minecraft_trials_edition.title"),
            xv.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", ds.a.a(dh.a.b($$0.d(mb.aT).b(enw.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ag.a.a()
         .a($$18)
         .a(cxo.zk, xv.c("advancements.adventure.lighten_up.title"), xv.c("advancements.adventure.lighten_up.description"), null, an.a, true, true, false)
         .a("lighten_up", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkg.sI, dkg.sH, dkg.sG, dkg.sM, dkg.sL, dkg.sK).a(ee.a.a().a(dlt.c, true))), cu.a.a().a($$3, mp.c)))
         .a($$1, "adventure/lighten_up");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(
            cxo.zt,
            xv.c("advancements.adventure.under_lock_and_key.title"),
            xv.c("advancements.adventure.under_lock_and_key.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkg.tN).a(ee.a.a().a(dtc.d, false))), cu.a.a().a($$3, cxo.zt)))
         .a($$1, "adventure/under_lock_and_key");
      ag.a.a()
         .a($$19)
         .a(cxo.zu, xv.c("advancements.adventure.revaulting.title"), xv.c("advancements.adventure.revaulting.description"), null, an.c, true, true, false)
         .a("revaulting", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dkg.tN).a(ee.a.a().a(dtc.d, true))), cu.a.a().a($$3, cxo.zu)))
         .a($$1, "adventure/revaulting");
      ag.a.a()
         .a($$18)
         .a(cxo.uN, xv.c("advancements.adventure.blowback.title"), xv.c("advancements.adventure.blowback.description"), null, an.b, true, true, false)
         .a(al.a.a(40))
         .a("blowback", dc.a.a(bw.a.a().a($$2, bvm.r), bl.a.a().a(eg.a(axw.j)).a(bw.a.a().a($$2, bvm.s))))
         .a($$1, "adventure/blowback");
      ag.a.a()
         .a($$5)
         .a(
            cxo.sH,
            xv.c("advancements.adventure.crafters_crafting_crafters.title"),
            xv.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", du.a.b(aly.a(mb.bj, alz.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ag.a.a()
         .a($$18)
         .a(
            cxo.uN,
            xv.c("advancements.adventure.who_needs_rockets.title"),
            xv.c("advancements.adventure.who_needs_rockets.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", ca.a.a(bn.b(dj.c.b(7.0)), bw.a.a().a($$2, bvm.bH)))
         .a($$1, "adventure/who_needs_rockets");
      ag.a.a()
         .a($$18)
         .a(cxo.uR, xv.c("advancements.adventure.overoverkill.title"), xv.c("advancements.adventure.overoverkill.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("overoverkill", dp.a.a(bk.a.a().a(dj.c.b(100.0)).a(bl.a.a().a(eg.a(axw.H)).a(bw.a.a().a($$2, bvm.bS).a(bt.a.a().f(cu.a.a().a($$3, cxo.uR)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bvm<?>> $$2, List<bvm<?>> $$3) {
      ah $$4 = a(ag.a.a(), $$2, $$3)
         .a($$0)
         .a(cxo.px, xv.c("advancements.adventure.kill_a_mob.title"), xv.c("advancements.adventure.kill_a_mob.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ag.a.a(), $$2, $$3)
         .a($$4)
         .a(cxo.pC, xv.c("advancements.adventure.kill_all_mobs.title"), xv.c("advancements.adventure.kill_all_mobs.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ap<cy.a> a(jr<dke> $$0, dke $$1) {
      ezs.a[] $$2 = dlp.aF.a().stream().map($$1x -> {
         ee.a $$2x = ee.a.a().a(dlp.aF, $$1x);
         ax.a $$3 = ax.a.a().a($$0, dkg.ho).a($$2x);
         return ezq.a(dh.a.a().a($$3), new jh($$1x.g().q()));
      }).toArray(ezs.a[]::new);
      return cy.a.a(ezr.a($$1), ezg.a($$2));
   }

   private static ap<cy.a> b(jr<dke> $$0, dke $$1) {
      ezs.a[] $$2 = dlp.aF.a().stream().map($$2x -> {
         ee.a $$3 = ee.a.a().a(dlp.aF, $$2x);
         ezr.a $$4 = new ezr.a(dkg.ho).a($$3);
         ezs.a $$5 = ezq.a(dh.a.a().a(ax.a.a().a($$0, $$1)), new jh($$2x.q()));
         return ezf.a($$4, $$5);
      }).toArray(ezs.a[]::new);
      return cy.a.a(ezg.a($$2));
   }

   private static ag.a a(ag.a $$0) {
      $$0.a(ak.a.a);
      Set<cxg> $$1 = Set.of(cxo.yx, cxo.yv, cxo.yw, cxo.yr, cxo.yA, cxo.yt, cxo.yu, cxo.yy);
      pm.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), du.a.a($$1x.b())));
      return $$0;
   }

   private static ag.a b(ag.a $$0) {
      $$0.a(ak.a.b);
      pm.b().map(pm.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, du.a.a((aly<dbz<?>>)$$1)));
      return $$0;
   }

   private static ag.a a(jr<cxg> $$0, ag.a $$1) {
      List<Pair<String, ap<di.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", di.a.a(ewd.aY)),
         Pair.of("desert_well", di.a.a(ewd.aX)),
         Pair.of("ocean_ruin_cold", di.a.a(ewd.bc)),
         Pair.of("ocean_ruin_warm", di.a.a(ewd.bb)),
         Pair.of("trail_ruins_rare", di.a.a(ewd.ba)),
         Pair.of("trail_ruins_common", di.a.a(ewd.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ap<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ci.a.a(cu.a.a().a($$0, ayd.bH)));
      $$1.a(new ak(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(js.a $$0, Consumer<ah> $$1, ah $$2, diq.a $$3) {
      a(ag.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cxo.qj,
            xv.c("advancements.adventure.adventuring_time.title"),
            xv.c("advancements.adventure.adventuring_time.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ag.a a(ag.a $$0, jr<bvm<?>> $$1, List<bvm<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(ma.f.b($$2x).toString(), dc.a.a(bw.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ag.a a(ag.a $$0, js.a $$1, List<aly<dic>> $$2) {
      jr<dic> $$3 = $$1.d(mb.aH);

      for (aly<dic> $$4 : $$2) {
         $$0.a($$4.a().toString(), ds.a.a(dh.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
