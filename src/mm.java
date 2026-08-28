import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mm implements mj {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bul<?>> a = Arrays.asList(
      bul.i,
      bul.l,
      bul.m,
      bul.q,
      bul.x,
      bul.B,
      bul.D,
      bul.F,
      bul.H,
      bul.I,
      bul.J,
      bul.T,
      bul.Y,
      bul.Z,
      bul.ac,
      bul.ap,
      bul.ay,
      bul.aA,
      bul.aB,
      bul.aC,
      bul.aH,
      bul.aK,
      bul.aM,
      bul.aN,
      bul.aP,
      bul.aW,
      bul.aY,
      bul.bi,
      bul.bk,
      bul.bo,
      bul.bq,
      bul.bp,
      bul.bt,
      bul.bw,
      bul.bu,
      bul.bx
   );

   private static ap<dg.a> a(dj.d $$0, Optional<bw> $$1) {
      return dg.a.a(Optional.of(bw.a.a().a(bn.c(dj.c.c(30.0))).a(df.a($$0)).b()), $$1);
   }

   private static ap<em.a> a(bw.a $$0, cu.a $$1) {
      return em.a.a(bw.a.a().a(dr.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bul<?>> $$2 = $$0.d(lz.z);
      jr<cvx> $$3 = $$0.d(lz.K);
      jr<die> $$4 = $$0.d(lz.f);
      ah $$5 = ag.a.a()
         .a(
            cwf.ul,
            xi.c("advancements.adventure.root.title"),
            xi.c("advancements.adventure.root.description"),
            ali.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dig.bn, xi.c("advancements.adventure.sleep_in_bed.title"), xi.c("advancements.adventure.sleep_in_bed.description"), null, an.a, true, true, false)
         .a("slept_in_bed", ds.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dgq.a.b);
      ah $$7 = ag.a.a()
         .a($$5)
         .a(cwf.oB, xi.c("advancements.adventure.trade.title"), xi.c("advancements.adventure.trade.description"), null, an.a, true, true, false)
         .a("traded", ej.a.b())
         .a($$1, "adventure/trade");
      ag.a.a()
         .a($$7)
         .a(
            cwf.oB,
            xi.c("advancements.adventure.trade_at_world_height.title"),
            xi.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cwf.ow, xi.c("advancements.adventure.shoot_arrow.title"), xi.c("advancements.adventure.shoot_arrow.description"), null, an.a, true, true, false)
         .a("shot_arrow", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axc.j)).a(bw.a.a().a($$2, axe.f)))))
         .a($$1, "adventure/shoot_arrow");
      ah $$10 = ag.a.a()
         .a($$8)
         .a(cwf.vU, xi.c("advancements.adventure.throw_trident.title"), xi.c("advancements.adventure.throw_trident.description"), null, an.a, true, true, false)
         .a("shot_trident", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axc.j)).a(bw.a.a().a($$2, bul.bf)))))
         .a($$1, "adventure/throw_trident");
      ag.a.a()
         .a($$10)
         .a(
            cwf.vU,
            xi.c("advancements.adventure.very_very_frightening.title"),
            xi.c("advancements.adventure.very_very_frightening.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("struck_villager", bb.a.a(bw.a.a().a($$2, bul.bj)))
         .a($$1, "adventure/very_very_frightening");
      ag.a.a()
         .a($$7)
         .a(
            dig.ee,
            xi.c("advancements.adventure.summon_iron_golem.title"),
            xi.c("advancements.adventure.summon_iron_golem.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ef.a.a(bw.a.a().a($$2, bul.af)))
         .a($$1, "adventure/summon_iron_golem");
      ag.a.a()
         .a($$9)
         .a(cwf.ox, xi.c("advancements.adventure.sniper_duel.title"), xi.c("advancements.adventure.sniper_duel.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_skeleton", dc.a.a(bw.a.a().a($$2, bul.aN).a(bn.a(dj.c.b(50.0))), bl.a.a().a(eg.a(axc.j))))
         .a($$1, "adventure/sniper_duel");
      ag.a.a()
         .a($$8)
         .a(
            cwf.vv,
            xi.c("advancements.adventure.totem_of_undying.title"),
            xi.c("advancements.adventure.totem_of_undying.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("used_totem", el.a.a($$3, cwf.vv))
         .a($$1, "adventure/totem_of_undying");
      ah $$11 = ag.a.a()
         .a($$5)
         .a(cwf.vX, xi.c("advancements.adventure.ol_betsy.title"), xi.c("advancements.adventure.ol_betsy.description"), null, an.a, true, true, false)
         .a("shot_crossbow", dx.a.a($$3, cwf.vX))
         .a($$1, "adventure/ol_betsy");
      ag.a.a()
         .a($$11)
         .a(
            cwf.vX,
            xi.c("advancements.adventure.whos_the_pillager_now.title"),
            xi.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("kill_pillager", db.a.a($$3, bw.a.a().a($$2, bul.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ag.a.a()
         .a($$11)
         .a(
            cwf.vX,
            xi.c("advancements.adventure.two_birds_one_arrow.title"),
            xi.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(65))
         .a("two_birds", db.a.a($$3, bw.a.a().a($$2, bul.ay), bw.a.a().a($$2, bul.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ag.a.a()
         .a($$11)
         .a(cwf.vX, xi.c("advancements.adventure.arbalistic.title"), xi.c("advancements.adventure.arbalistic.description"), null, an.b, true, true, true)
         .a(al.a.a(85))
         .a("arbalistic", db.a.a($$3, dj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      js.b<dsc> $$12 = $$0.d(lz.d);
      ah $$13 = ag.a.a()
         .a($$5)
         .a(
            cqa.a($$12),
            xi.c("advancements.adventure.voluntary_exile.title"),
            xi.c("advancements.adventure.voluntary_exile.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dc.a.a(bw.a.a().a($$2, axe.c).a(bt.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ag.a.a()
         .a($$13)
         .a(
            cqa.a($$12),
            xi.c("advancements.adventure.hero_of_the_village.title"),
            xi.c("advancements.adventure.hero_of_the_village.description"),
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
            dig.pg.j(),
            xi.c("advancements.adventure.honey_block_slide.title"),
            xi.c("advancements.adventure.honey_block_slide.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", ea.a.a(dig.pg))
         .a($$1, "adventure/honey_block_slide");
      ag.a.a()
         .a($$9)
         .a(dig.pd.j(), xi.c("advancements.adventure.bullseye.title"), xi.c("advancements.adventure.bullseye.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("bullseye", ei.a.a(dj.d.a(15), Optional.of(bw.a(bw.a.a().a(bn.a(dj.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ag.a.a()
         .a($$6)
         .a(
            cwf.pC,
            xi.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xi.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ds.a.a($$4, $$3, dig.qP, cwf.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ag.a.a()
         .a($$5)
         .a(
            cwf.lX,
            xi.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xi.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dj.d.a(0), Optional.of(bw.a.a().a($$2, bul.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwf.qY,
            xi.c("advancements.adventure.spyglass_at_parrot.title"),
            xi.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bw.a.a().a($$2, bul.ax), cu.a.a().a($$3, cwf.qY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ah $$15 = ag.a.a()
         .a($$14)
         .a(
            cwf.qY,
            xi.c("advancements.adventure.spyglass_at_ghast.title"),
            xi.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bw.a.a().a($$2, bul.T), cu.a.a().a($$3, cwf.qY)))
         .a($$1, "adventure/spyglass_at_ghast");
      ag.a.a()
         .a($$6)
         .a(
            cwf.eY,
            xi.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xi.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cy.a.a(dh.a.a().a(ju.a($$0.d(lz.aG).b(dgj.D))).a(ax.a.a().a($$4, dig.dT)), cu.a.a().a(cw.n, cs.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ag.a.a()
         .a($$15)
         .a(
            cwf.qY,
            xi.c("advancements.adventure.spyglass_at_dragon.title"),
            xi.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bw.a.a().a($$2, bul.F), cu.a.a().a($$3, cwf.qY)))
         .a($$1, "adventure/spyglass_at_dragon");
      ag.a.a()
         .a($$5)
         .a(
            cwf.qA,
            xi.c("advancements.adventure.fall_from_world_height.title"),
            xi.c("advancements.adventure.fall_from_world_height.description"),
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
            dig.qU,
            xi.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xi.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dig.qQ,
            xi.c("advancements.adventure.avoid_vibration.title"),
            xi.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cwf.xx, xi.c("advancements.adventure.salvage_sherd.title"), xi.c("advancements.adventure.salvage_sherd.description"), null, an.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ag.a.a()
         .a($$16)
         .a(
            dtc.a(new dts(Optional.empty(), Optional.of(cwf.yc), Optional.empty(), Optional.of(cwf.xY))),
            xi.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xi.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            du.a.a(ali.b("decorated_pot"), List.of(cu.a.a().a($$3, axj.bF), cu.a.a().a($$3, axj.bF), cu.a.a().a($$3, axj.bF), cu.a.a().a($$3, axj.bF)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ah $$17 = b(ag.a.a())
         .a($$5)
         .a(
            new cwb(cwf.xA),
            xi.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xi.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cwb(cwf.xM),
            xi.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xi.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cwf.eB,
            xi.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xi.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("chiseled_bookshelf", a($$4, dig.cm))
         .a("comparator", b($$4, dig.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ag.a.a()
         .a($$5)
         .a(
            cwf.or,
            xi.c("advancements.adventure.brush_armadillo.title"),
            xi.c("advancements.adventure.brush_armadillo.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dq.a.a(cu.a.a().a($$3, cwf.xx), Optional.of(bw.a(bw.a.a().a($$2, bul.c)))))
         .a($$1, "adventure/brush_armadillo");
      ah $$18 = ag.a.a()
         .a($$5)
         .a(
            dig.qH,
            xi.c("advancements.adventure.minecraft_trials_edition.title"),
            xi.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", ds.a.a(dh.a.b($$0.d(lz.aS).b(elr.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ag.a.a()
         .a($$18)
         .a(cwf.yw, xi.c("advancements.adventure.lighten_up.title"), xi.c("advancements.adventure.lighten_up.description"), null, an.a, true, true, false)
         .a("lighten_up", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dig.sn, dig.sm, dig.sl, dig.sr, dig.sq, dig.sp).a(ee.a.a().a(djs.c, true))), cu.a.a().a($$3, mn.c)))
         .a($$1, "adventure/lighten_up");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(
            cwf.yF,
            xi.c("advancements.adventure.under_lock_and_key.title"),
            xi.c("advancements.adventure.under_lock_and_key.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dig.ts).a(ee.a.a().a(dqz.d, false))), cu.a.a().a($$3, cwf.yF)))
         .a($$1, "adventure/under_lock_and_key");
      ag.a.a()
         .a($$19)
         .a(cwf.yG, xi.c("advancements.adventure.revaulting.title"), xi.c("advancements.adventure.revaulting.description"), null, an.c, true, true, false)
         .a("revaulting", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dig.ts).a(ee.a.a().a(dqz.d, true))), cu.a.a().a($$3, cwf.yG)))
         .a($$1, "adventure/revaulting");
      ag.a.a()
         .a($$18)
         .a(cwf.tZ, xi.c("advancements.adventure.blowback.title"), xi.c("advancements.adventure.blowback.description"), null, an.b, true, true, false)
         .a(al.a.a(40))
         .a("blowback", dc.a.a(bw.a.a().a($$2, bul.m), bl.a.a().a(eg.a(axc.j)).a(bw.a.a().a($$2, bul.n))))
         .a($$1, "adventure/blowback");
      ag.a.a()
         .a($$5)
         .a(
            cwf.rU,
            xi.c("advancements.adventure.crafters_crafting_crafters.title"),
            xi.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", du.a.b(ali.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ag.a.a()
         .a($$18)
         .a(
            cwf.tZ,
            xi.c("advancements.adventure.who_needs_rockets.title"),
            xi.c("advancements.adventure.who_needs_rockets.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", ca.a.a(bn.b(dj.c.b(7.0)), bw.a.a().a($$2, bul.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ag.a.a()
         .a($$18)
         .a(cwf.ud, xi.c("advancements.adventure.overoverkill.title"), xi.c("advancements.adventure.overoverkill.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("overoverkill", dp.a.a(bk.a.a().a(dj.c.b(100.0)).a(bl.a.a().a(eg.a(axc.H)).a(bw.a.a().a($$2, bul.by).a(bt.a.a().f(cu.a.a().a($$3, cwf.ud)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bul<?>> $$2, List<bul<?>> $$3) {
      ah $$4 = a(ag.a.a(), $$2, $$3)
         .a($$0)
         .a(cwf.pc, xi.c("advancements.adventure.kill_a_mob.title"), xi.c("advancements.adventure.kill_a_mob.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ag.a.a(), $$2, $$3)
         .a($$4)
         .a(cwf.ph, xi.c("advancements.adventure.kill_all_mobs.title"), xi.c("advancements.adventure.kill_all_mobs.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ap<cy.a> a(jr<die> $$0, die $$1) {
      exn.a[] $$2 = djo.aF.a().stream().map($$1x -> {
         ee.a $$2x = ee.a.a().a(djo.aF, $$1x);
         ax.a $$3 = ax.a.a().a($$0, dig.gY).a($$2x);
         return exl.a(dh.a.a().a($$3), new jh($$1x.g().q()));
      }).toArray(exn.a[]::new);
      return cy.a.a(exm.a($$1), exb.a($$2));
   }

   private static ap<cy.a> b(jr<die> $$0, die $$1) {
      exn.a[] $$2 = djo.aF.a().stream().map($$2x -> {
         ee.a $$3 = ee.a.a().a(djo.aF, $$2x);
         exm.a $$4 = new exm.a(dig.gY).a($$3);
         exn.a $$5 = exl.a(dh.a.a().a(ax.a.a().a($$0, $$1)), new jh($$2x.q()));
         return exa.a($$4, $$5);
      }).toArray(exn.a[]::new);
      return cy.a.a(exb.a($$2));
   }

   private static ag.a a(ag.a $$0) {
      $$0.a(ak.a.a);
      Set<cvx> $$1 = Set.of(cwf.xJ, cwf.xH, cwf.xI, cwf.xD, cwf.xM, cwf.xF, cwf.xG, cwf.xK);
      pg.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), du.a.a($$1x.b())));
      return $$0;
   }

   private static ag.a b(ag.a $$0) {
      $$0.a(ak.a.b);
      pg.b().map(pg.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, du.a.a($$1)));
      return $$0;
   }

   private static ag.a a(jr<cvx> $$0, ag.a $$1) {
      List<Pair<String, ap<di.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", di.a.a(ety.aY)),
         Pair.of("desert_well", di.a.a(ety.aX)),
         Pair.of("ocean_ruin_cold", di.a.a(ety.bc)),
         Pair.of("ocean_ruin_warm", di.a.a(ety.bb)),
         Pair.of("trail_ruins_rare", di.a.a(ety.ba)),
         Pair.of("trail_ruins_common", di.a.a(ety.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ap<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ci.a.a(cu.a.a().a($$0, axj.bF)));
      $$1.a(new ak(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(js.a $$0, Consumer<ah> $$1, ah $$2, dgq.a $$3) {
      a(ag.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cwf.pO,
            xi.c("advancements.adventure.adventuring_time.title"),
            xi.c("advancements.adventure.adventuring_time.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ag.a a(ag.a $$0, jr<bul<?>> $$1, List<bul<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(ly.f.b($$2x).toString(), dc.a.a(bw.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ag.a a(ag.a $$0, js.a $$1, List<alh<dgc>> $$2) {
      jr<dgc> $$3 = $$1.d(lz.aG);

      for (alh<dgc> $$4 : $$2) {
         $$0.a($$4.a().toString(), ds.a.a(dh.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
