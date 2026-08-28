import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mn implements mk {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bup<?>> a = Arrays.asList(
      bup.i,
      bup.l,
      bup.m,
      bup.q,
      bup.x,
      bup.B,
      bup.D,
      bup.F,
      bup.H,
      bup.I,
      bup.J,
      bup.T,
      bup.Y,
      bup.Z,
      bup.ac,
      bup.ap,
      bup.ay,
      bup.aA,
      bup.aB,
      bup.aC,
      bup.aH,
      bup.aK,
      bup.aM,
      bup.aN,
      bup.aP,
      bup.aW,
      bup.aY,
      bup.bi,
      bup.bk,
      bup.bo,
      bup.bq,
      bup.bp,
      bup.bt,
      bup.bw,
      bup.bu,
      bup.bx
   );

   private static ap<dg.a> a(dj.d $$0, Optional<bw> $$1) {
      return dg.a.a(Optional.of(bw.a.a().a(bn.c(dj.c.c(30.0))).a(df.a($$0)).b()), $$1);
   }

   private static ap<em.a> a(bw.a $$0, cu.a $$1) {
      return em.a.a(bw.a.a().a(dr.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bup<?>> $$2 = $$0.d(ma.z);
      jr<cwb> $$3 = $$0.d(ma.K);
      jr<dij> $$4 = $$0.d(ma.f);
      ah $$5 = ag.a.a()
         .a(
            cwj.uB,
            xl.c("advancements.adventure.root.title"),
            xl.c("advancements.adventure.root.description"),
            all.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dil.bn, xl.c("advancements.adventure.sleep_in_bed.title"), xl.c("advancements.adventure.sleep_in_bed.description"), null, an.a, true, true, false)
         .a("slept_in_bed", ds.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dgv.a.b);
      ah $$7 = ag.a.a()
         .a($$5)
         .a(cwj.oB, xl.c("advancements.adventure.trade.title"), xl.c("advancements.adventure.trade.description"), null, an.a, true, true, false)
         .a("traded", ej.a.b())
         .a($$1, "adventure/trade");
      ag.a.a()
         .a($$7)
         .a(
            cwj.oB,
            xl.c("advancements.adventure.trade_at_world_height.title"),
            xl.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cwj.ow, xl.c("advancements.adventure.shoot_arrow.title"), xl.c("advancements.adventure.shoot_arrow.description"), null, an.a, true, true, false)
         .a("shot_arrow", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axf.j)).a(bw.a.a().a($$2, axh.f)))))
         .a($$1, "adventure/shoot_arrow");
      ah $$10 = ag.a.a()
         .a($$8)
         .a(cwj.wk, xl.c("advancements.adventure.throw_trident.title"), xl.c("advancements.adventure.throw_trident.description"), null, an.a, true, true, false)
         .a("shot_trident", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axf.j)).a(bw.a.a().a($$2, bup.bf)))))
         .a($$1, "adventure/throw_trident");
      ag.a.a()
         .a($$10)
         .a(
            cwj.wk,
            xl.c("advancements.adventure.very_very_frightening.title"),
            xl.c("advancements.adventure.very_very_frightening.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("struck_villager", bb.a.a(bw.a.a().a($$2, bup.bj)))
         .a($$1, "adventure/very_very_frightening");
      ag.a.a()
         .a($$7)
         .a(
            dil.ee,
            xl.c("advancements.adventure.summon_iron_golem.title"),
            xl.c("advancements.adventure.summon_iron_golem.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ef.a.a(bw.a.a().a($$2, bup.af)))
         .a($$1, "adventure/summon_iron_golem");
      ag.a.a()
         .a($$9)
         .a(cwj.ox, xl.c("advancements.adventure.sniper_duel.title"), xl.c("advancements.adventure.sniper_duel.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_skeleton", dc.a.a(bw.a.a().a($$2, bup.aN).a(bn.a(dj.c.b(50.0))), bl.a.a().a(eg.a(axf.j))))
         .a($$1, "adventure/sniper_duel");
      ag.a.a()
         .a($$8)
         .a(
            cwj.vL,
            xl.c("advancements.adventure.totem_of_undying.title"),
            xl.c("advancements.adventure.totem_of_undying.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("used_totem", el.a.a($$3, cwj.vL))
         .a($$1, "adventure/totem_of_undying");
      ah $$11 = ag.a.a()
         .a($$5)
         .a(cwj.wn, xl.c("advancements.adventure.ol_betsy.title"), xl.c("advancements.adventure.ol_betsy.description"), null, an.a, true, true, false)
         .a("shot_crossbow", dx.a.a($$3, cwj.wn))
         .a($$1, "adventure/ol_betsy");
      ag.a.a()
         .a($$11)
         .a(
            cwj.wn,
            xl.c("advancements.adventure.whos_the_pillager_now.title"),
            xl.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("kill_pillager", db.a.a($$3, bw.a.a().a($$2, bup.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ag.a.a()
         .a($$11)
         .a(
            cwj.wn,
            xl.c("advancements.adventure.two_birds_one_arrow.title"),
            xl.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(65))
         .a("two_birds", db.a.a($$3, bw.a.a().a($$2, bup.ay), bw.a.a().a($$2, bup.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ag.a.a()
         .a($$11)
         .a(cwj.wn, xl.c("advancements.adventure.arbalistic.title"), xl.c("advancements.adventure.arbalistic.description"), null, an.b, true, true, true)
         .a(al.a.a(85))
         .a("arbalistic", db.a.a($$3, dj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      js.b<dsh> $$12 = $$0.d(ma.d);
      ah $$13 = ag.a.a()
         .a($$5)
         .a(
            cqe.a($$12),
            xl.c("advancements.adventure.voluntary_exile.title"),
            xl.c("advancements.adventure.voluntary_exile.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dc.a.a(bw.a.a().a($$2, axh.c).a(bt.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ag.a.a()
         .a($$13)
         .a(
            cqe.a($$12),
            xl.c("advancements.adventure.hero_of_the_village.title"),
            xl.c("advancements.adventure.hero_of_the_village.description"),
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
            dil.pg.j(),
            xl.c("advancements.adventure.honey_block_slide.title"),
            xl.c("advancements.adventure.honey_block_slide.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", ea.a.a(dil.pg))
         .a($$1, "adventure/honey_block_slide");
      ag.a.a()
         .a($$9)
         .a(dil.pd.j(), xl.c("advancements.adventure.bullseye.title"), xl.c("advancements.adventure.bullseye.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("bullseye", ei.a.a(dj.d.a(15), Optional.of(bw.a(bw.a.a().a(bn.a(dj.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ag.a.a()
         .a($$6)
         .a(
            cwj.pC,
            xl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ds.a.a($$4, $$3, dil.qP, cwj.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ag.a.a()
         .a($$5)
         .a(
            cwj.lX,
            xl.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xl.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dj.d.a(0), Optional.of(bw.a.a().a($$2, bup.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwj.ro,
            xl.c("advancements.adventure.spyglass_at_parrot.title"),
            xl.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bw.a.a().a($$2, bup.ax), cu.a.a().a($$3, cwj.ro)))
         .a($$1, "adventure/spyglass_at_parrot");
      ah $$15 = ag.a.a()
         .a($$14)
         .a(
            cwj.ro,
            xl.c("advancements.adventure.spyglass_at_ghast.title"),
            xl.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bw.a.a().a($$2, bup.T), cu.a.a().a($$3, cwj.ro)))
         .a($$1, "adventure/spyglass_at_ghast");
      ag.a.a()
         .a($$6)
         .a(
            cwj.eY,
            xl.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xl.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cy.a.a(dh.a.a().a(ju.a($$0.d(ma.aG).b(dgo.D))).a(ax.a.a().a($$4, dil.dT)), cu.a.a().a(cw.n, cs.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ag.a.a()
         .a($$15)
         .a(
            cwj.ro,
            xl.c("advancements.adventure.spyglass_at_dragon.title"),
            xl.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bw.a.a().a($$2, bup.F), cu.a.a().a($$3, cwj.ro)))
         .a($$1, "adventure/spyglass_at_dragon");
      ag.a.a()
         .a($$5)
         .a(
            cwj.qA,
            xl.c("advancements.adventure.fall_from_world_height.title"),
            xl.c("advancements.adventure.fall_from_world_height.description"),
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
            dil.qU,
            xl.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xl.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dil.qQ,
            xl.c("advancements.adventure.avoid_vibration.title"),
            xl.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cwj.xN, xl.c("advancements.adventure.salvage_sherd.title"), xl.c("advancements.adventure.salvage_sherd.description"), null, an.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ag.a.a()
         .a($$16)
         .a(
            dth.a(new dtx(Optional.empty(), Optional.of(cwj.ys), Optional.empty(), Optional.of(cwj.yo))),
            xl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            du.a.a(all.b("decorated_pot"), List.of(cu.a.a().a($$3, axm.bG), cu.a.a().a($$3, axm.bG), cu.a.a().a($$3, axm.bG), cu.a.a().a($$3, axm.bG)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ah $$17 = b(ag.a.a())
         .a($$5)
         .a(
            new cwf(cwj.xQ),
            xl.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xl.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cwf(cwj.yc),
            xl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cwj.eB,
            xl.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xl.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("chiseled_bookshelf", a($$4, dil.cm))
         .a("comparator", b($$4, dil.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ag.a.a()
         .a($$5)
         .a(
            cwj.or,
            xl.c("advancements.adventure.brush_armadillo.title"),
            xl.c("advancements.adventure.brush_armadillo.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dq.a.a(cu.a.a().a($$3, cwj.xN), Optional.of(bw.a(bw.a.a().a($$2, bup.c)))))
         .a($$1, "adventure/brush_armadillo");
      ah $$18 = ag.a.a()
         .a($$5)
         .a(
            dil.qH,
            xl.c("advancements.adventure.minecraft_trials_edition.title"),
            xl.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", ds.a.a(dh.a.b($$0.d(ma.aS).b(elv.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ag.a.a()
         .a($$18)
         .a(cwj.yM, xl.c("advancements.adventure.lighten_up.title"), xl.c("advancements.adventure.lighten_up.description"), null, an.a, true, true, false)
         .a("lighten_up", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dil.sn, dil.sm, dil.sl, dil.sr, dil.sq, dil.sp).a(ee.a.a().a(djx.c, true))), cu.a.a().a($$3, mo.c)))
         .a($$1, "adventure/lighten_up");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(
            cwj.yV,
            xl.c("advancements.adventure.under_lock_and_key.title"),
            xl.c("advancements.adventure.under_lock_and_key.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dil.ts).a(ee.a.a().a(dre.d, false))), cu.a.a().a($$3, cwj.yV)))
         .a($$1, "adventure/under_lock_and_key");
      ag.a.a()
         .a($$19)
         .a(cwj.yW, xl.c("advancements.adventure.revaulting.title"), xl.c("advancements.adventure.revaulting.description"), null, an.c, true, true, false)
         .a("revaulting", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dil.ts).a(ee.a.a().a(dre.d, true))), cu.a.a().a($$3, cwj.yW)))
         .a($$1, "adventure/revaulting");
      ag.a.a()
         .a($$18)
         .a(cwj.up, xl.c("advancements.adventure.blowback.title"), xl.c("advancements.adventure.blowback.description"), null, an.b, true, true, false)
         .a(al.a.a(40))
         .a("blowback", dc.a.a(bw.a.a().a($$2, bup.m), bl.a.a().a(eg.a(axf.j)).a(bw.a.a().a($$2, bup.n))))
         .a($$1, "adventure/blowback");
      ag.a.a()
         .a($$5)
         .a(
            cwj.sk,
            xl.c("advancements.adventure.crafters_crafting_crafters.title"),
            xl.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", du.a.b(all.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ag.a.a()
         .a($$18)
         .a(
            cwj.up,
            xl.c("advancements.adventure.who_needs_rockets.title"),
            xl.c("advancements.adventure.who_needs_rockets.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", ca.a.a(bn.b(dj.c.b(7.0)), bw.a.a().a($$2, bup.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ag.a.a()
         .a($$18)
         .a(cwj.ut, xl.c("advancements.adventure.overoverkill.title"), xl.c("advancements.adventure.overoverkill.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("overoverkill", dp.a.a(bk.a.a().a(dj.c.b(100.0)).a(bl.a.a().a(eg.a(axf.H)).a(bw.a.a().a($$2, bup.by).a(bt.a.a().f(cu.a.a().a($$3, cwj.ut)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bup<?>> $$2, List<bup<?>> $$3) {
      ah $$4 = a(ag.a.a(), $$2, $$3)
         .a($$0)
         .a(cwj.pc, xl.c("advancements.adventure.kill_a_mob.title"), xl.c("advancements.adventure.kill_a_mob.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ag.a.a(), $$2, $$3)
         .a($$4)
         .a(cwj.ph, xl.c("advancements.adventure.kill_all_mobs.title"), xl.c("advancements.adventure.kill_all_mobs.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ap<cy.a> a(jr<dij> $$0, dij $$1) {
      exr.a[] $$2 = djt.aF.a().stream().map($$1x -> {
         ee.a $$2x = ee.a.a().a(djt.aF, $$1x);
         ax.a $$3 = ax.a.a().a($$0, dil.gY).a($$2x);
         return exp.a(dh.a.a().a($$3), new jh($$1x.g().q()));
      }).toArray(exr.a[]::new);
      return cy.a.a(exq.a($$1), exf.a($$2));
   }

   private static ap<cy.a> b(jr<dij> $$0, dij $$1) {
      exr.a[] $$2 = djt.aF.a().stream().map($$2x -> {
         ee.a $$3 = ee.a.a().a(djt.aF, $$2x);
         exq.a $$4 = new exq.a(dil.gY).a($$3);
         exr.a $$5 = exp.a(dh.a.a().a(ax.a.a().a($$0, $$1)), new jh($$2x.q()));
         return exe.a($$4, $$5);
      }).toArray(exr.a[]::new);
      return cy.a.a(exf.a($$2));
   }

   private static ag.a a(ag.a $$0) {
      $$0.a(ak.a.a);
      Set<cwb> $$1 = Set.of(cwj.xZ, cwj.xX, cwj.xY, cwj.xT, cwj.yc, cwj.xV, cwj.xW, cwj.ya);
      pi.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), du.a.a($$1x.b())));
      return $$0;
   }

   private static ag.a b(ag.a $$0) {
      $$0.a(ak.a.b);
      pi.b().map(pi.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, du.a.a($$1)));
      return $$0;
   }

   private static ag.a a(jr<cwb> $$0, ag.a $$1) {
      List<Pair<String, ap<di.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", di.a.a(euc.aY)),
         Pair.of("desert_well", di.a.a(euc.aX)),
         Pair.of("ocean_ruin_cold", di.a.a(euc.bc)),
         Pair.of("ocean_ruin_warm", di.a.a(euc.bb)),
         Pair.of("trail_ruins_rare", di.a.a(euc.ba)),
         Pair.of("trail_ruins_common", di.a.a(euc.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ap<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ci.a.a(cu.a.a().a($$0, axm.bG)));
      $$1.a(new ak(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(js.a $$0, Consumer<ah> $$1, ah $$2, dgv.a $$3) {
      a(ag.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cwj.pO,
            xl.c("advancements.adventure.adventuring_time.title"),
            xl.c("advancements.adventure.adventuring_time.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ag.a a(ag.a $$0, jr<bup<?>> $$1, List<bup<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lz.f.b($$2x).toString(), dc.a.a(bw.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ag.a a(ag.a $$0, js.a $$1, List<alk<dgh>> $$2) {
      jr<dgh> $$3 = $$1.d(ma.aG);

      for (alk<dgh> $$4 : $$2) {
         $$0.a($$4.a().toString(), ds.a.a(dh.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
