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
   protected static final List<bus<?>> a = Arrays.asList(
      bus.o,
      bus.q,
      bus.r,
      bus.v,
      bus.D,
      bus.J,
      bus.L,
      bus.O,
      bus.M,
      bus.N,
      bus.R,
      bus.ac,
      bus.ah,
      bus.ai,
      bus.al,
      bus.ay,
      bus.aM,
      bus.aO,
      bus.aP,
      bus.aQ,
      bus.aV,
      bus.aY,
      bus.ba,
      bus.bb,
      bus.bd,
      bus.bk,
      bus.bo,
      bus.by,
      bus.bA,
      bus.bE,
      bus.bG,
      bus.bF,
      bus.bJ,
      bus.bM,
      bus.bK,
      bus.bN
   );

   private static ap<dg.a> a(dj.d $$0, Optional<bw> $$1) {
      return dg.a.a(Optional.of(bw.a.a().a(bn.c(dj.c.c(30.0))).a(df.a($$0)).b()), $$1);
   }

   private static ap<em.a> a(bw.a $$0, cu.a $$1) {
      return em.a.a(bw.a.a().a(dr.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bus<?>> $$2 = $$0.d(ma.z);
      jr<cwi> $$3 = $$0.d(ma.K);
      jr<diq> $$4 = $$0.d(ma.f);
      ah $$5 = ag.a.a()
         .a(
            cwq.uB,
            xj.c("advancements.adventure.root.title"),
            xj.c("advancements.adventure.root.description"),
            alj.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dis.bn, xj.c("advancements.adventure.sleep_in_bed.title"), xj.c("advancements.adventure.sleep_in_bed.description"), null, an.a, true, true, false)
         .a("slept_in_bed", ds.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dhc.a.b);
      ah $$7 = ag.a.a()
         .a($$5)
         .a(cwq.oB, xj.c("advancements.adventure.trade.title"), xj.c("advancements.adventure.trade.description"), null, an.a, true, true, false)
         .a("traded", ej.a.b())
         .a($$1, "adventure/trade");
      ag.a.a()
         .a($$7)
         .a(
            cwq.oB,
            xj.c("advancements.adventure.trade_at_world_height.title"),
            xj.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cwq.ow, xj.c("advancements.adventure.shoot_arrow.title"), xj.c("advancements.adventure.shoot_arrow.description"), null, an.a, true, true, false)
         .a("shot_arrow", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axe.j)).a(bw.a.a().a($$2, axg.f)))))
         .a($$1, "adventure/shoot_arrow");
      ah $$10 = ag.a.a()
         .a($$8)
         .a(cwq.wk, xj.c("advancements.adventure.throw_trident.title"), xj.c("advancements.adventure.throw_trident.description"), null, an.a, true, true, false)
         .a("shot_trident", dp.a.a(bk.a.a().a(bl.a.a().a(eg.a(axe.j)).a(bw.a.a().a($$2, bus.bv)))))
         .a($$1, "adventure/throw_trident");
      ag.a.a()
         .a($$10)
         .a(
            cwq.wk,
            xj.c("advancements.adventure.very_very_frightening.title"),
            xj.c("advancements.adventure.very_very_frightening.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("struck_villager", bb.a.a(bw.a.a().a($$2, bus.bz)))
         .a($$1, "adventure/very_very_frightening");
      ag.a.a()
         .a($$7)
         .a(
            dis.ee,
            xj.c("advancements.adventure.summon_iron_golem.title"),
            xj.c("advancements.adventure.summon_iron_golem.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ef.a.a(bw.a.a().a($$2, bus.ao)))
         .a($$1, "adventure/summon_iron_golem");
      ag.a.a()
         .a($$9)
         .a(cwq.ox, xj.c("advancements.adventure.sniper_duel.title"), xj.c("advancements.adventure.sniper_duel.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("killed_skeleton", dc.a.a(bw.a.a().a($$2, bus.bb).a(bn.a(dj.c.b(50.0))), bl.a.a().a(eg.a(axe.j))))
         .a($$1, "adventure/sniper_duel");
      ag.a.a()
         .a($$8)
         .a(
            cwq.vL,
            xj.c("advancements.adventure.totem_of_undying.title"),
            xj.c("advancements.adventure.totem_of_undying.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("used_totem", el.a.a($$3, cwq.vL))
         .a($$1, "adventure/totem_of_undying");
      ah $$11 = ag.a.a()
         .a($$5)
         .a(cwq.wn, xj.c("advancements.adventure.ol_betsy.title"), xj.c("advancements.adventure.ol_betsy.description"), null, an.a, true, true, false)
         .a("shot_crossbow", dx.a.a($$3, cwq.wn))
         .a($$1, "adventure/ol_betsy");
      ag.a.a()
         .a($$11)
         .a(
            cwq.wn,
            xj.c("advancements.adventure.whos_the_pillager_now.title"),
            xj.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("kill_pillager", db.a.a($$3, bw.a.a().a($$2, bus.aQ)))
         .a($$1, "adventure/whos_the_pillager_now");
      ag.a.a()
         .a($$11)
         .a(
            cwq.wn,
            xj.c("advancements.adventure.two_birds_one_arrow.title"),
            xj.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(65))
         .a("two_birds", db.a.a($$3, bw.a.a().a($$2, bus.aM), bw.a.a().a($$2, bus.aM)))
         .a($$1, "adventure/two_birds_one_arrow");
      ag.a.a()
         .a($$11)
         .a(cwq.wn, xj.c("advancements.adventure.arbalistic.title"), xj.c("advancements.adventure.arbalistic.description"), null, an.b, true, true, true)
         .a(al.a.a(85))
         .a("arbalistic", db.a.a($$3, dj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      js.b<dso> $$12 = $$0.d(ma.d);
      ah $$13 = ag.a.a()
         .a($$5)
         .a(
            cqh.a($$12),
            xj.c("advancements.adventure.voluntary_exile.title"),
            xj.c("advancements.adventure.voluntary_exile.description"),
            null,
            an.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dc.a.a(bw.a.a().a($$2, axg.c).a(bt.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ag.a.a()
         .a($$13)
         .a(
            cqh.a($$12),
            xj.c("advancements.adventure.hero_of_the_village.title"),
            xj.c("advancements.adventure.hero_of_the_village.description"),
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
            dis.pg.j(),
            xj.c("advancements.adventure.honey_block_slide.title"),
            xj.c("advancements.adventure.honey_block_slide.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", ea.a.a(dis.pg))
         .a($$1, "adventure/honey_block_slide");
      ag.a.a()
         .a($$9)
         .a(dis.pd.j(), xj.c("advancements.adventure.bullseye.title"), xj.c("advancements.adventure.bullseye.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("bullseye", ei.a.a(dj.d.a(15), Optional.of(bw.a(bw.a.a().a(bn.a(dj.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ag.a.a()
         .a($$6)
         .a(
            cwq.pC,
            xj.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xj.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ds.a.a($$4, $$3, dis.qP, cwq.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ag.a.a()
         .a($$5)
         .a(
            cwq.lX,
            xj.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xj.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dj.d.a(0), Optional.of(bw.a.a().a($$2, bus.bz).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ah $$14 = ag.a.a()
         .a($$5)
         .a(
            cwq.ro,
            xj.c("advancements.adventure.spyglass_at_parrot.title"),
            xj.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bw.a.a().a($$2, bus.aL), cu.a.a().a($$3, cwq.ro)))
         .a($$1, "adventure/spyglass_at_parrot");
      ah $$15 = ag.a.a()
         .a($$14)
         .a(
            cwq.ro,
            xj.c("advancements.adventure.spyglass_at_ghast.title"),
            xj.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bw.a.a().a($$2, bus.ac), cu.a.a().a($$3, cwq.ro)))
         .a($$1, "adventure/spyglass_at_ghast");
      ag.a.a()
         .a($$6)
         .a(
            cwq.eY,
            xj.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xj.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cy.a.a(dh.a.a().a(ju.a($$0.d(ma.aG).b(dgv.D))).a(ax.a.a().a($$4, dis.dT)), cu.a.a().a(cw.n, cs.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ag.a.a()
         .a($$15)
         .a(
            cwq.ro,
            xj.c("advancements.adventure.spyglass_at_dragon.title"),
            xj.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bw.a.a().a($$2, bus.O), cu.a.a().a($$3, cwq.ro)))
         .a($$1, "adventure/spyglass_at_dragon");
      ag.a.a()
         .a($$5)
         .a(
            cwq.qA,
            xj.c("advancements.adventure.fall_from_world_height.title"),
            xj.c("advancements.adventure.fall_from_world_height.description"),
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
            dis.qU,
            xj.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xj.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dis.qQ,
            xj.c("advancements.adventure.avoid_vibration.title"),
            xj.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cwq.xN, xj.c("advancements.adventure.salvage_sherd.title"), xj.c("advancements.adventure.salvage_sherd.description"), null, an.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ag.a.a()
         .a($$16)
         .a(
            dto.a(new due(Optional.empty(), Optional.of(cwq.ys), Optional.empty(), Optional.of(cwq.yo))),
            xj.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xj.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            du.a.a(alj.b("decorated_pot"), List.of(cu.a.a().a($$3, axl.bG), cu.a.a().a($$3, axl.bG), cu.a.a().a($$3, axl.bG), cu.a.a().a($$3, axl.bG)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ah $$17 = b(ag.a.a())
         .a($$5)
         .a(
            new cwm(cwq.xQ),
            xj.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xj.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cwm(cwq.yc),
            xj.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xj.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cwq.eB,
            xj.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xj.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a(ak.a.b)
         .a("chiseled_bookshelf", a($$4, dis.cm))
         .a("comparator", b($$4, dis.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ag.a.a()
         .a($$5)
         .a(
            cwq.or,
            xj.c("advancements.adventure.brush_armadillo.title"),
            xj.c("advancements.adventure.brush_armadillo.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dq.a.a(cu.a.a().a($$3, cwq.xN), Optional.of(bw.a(bw.a.a().a($$2, bus.e)))))
         .a($$1, "adventure/brush_armadillo");
      ah $$18 = ag.a.a()
         .a($$5)
         .a(
            dis.qH,
            xj.c("advancements.adventure.minecraft_trials_edition.title"),
            xj.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", ds.a.a(dh.a.b($$0.d(ma.aS).b(emc.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ag.a.a()
         .a($$18)
         .a(cwq.yM, xj.c("advancements.adventure.lighten_up.title"), xj.c("advancements.adventure.lighten_up.description"), null, an.a, true, true, false)
         .a("lighten_up", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dis.sn, dis.sm, dis.sl, dis.sr, dis.sq, dis.sp).a(ee.a.a().a(dke.c, true))), cu.a.a().a($$3, mo.c)))
         .a($$1, "adventure/lighten_up");
      ah $$19 = ag.a.a()
         .a($$18)
         .a(
            cwq.yV,
            xj.c("advancements.adventure.under_lock_and_key.title"),
            xj.c("advancements.adventure.under_lock_and_key.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dis.ts).a(ee.a.a().a(drl.d, false))), cu.a.a().a($$3, cwq.yV)))
         .a($$1, "adventure/under_lock_and_key");
      ag.a.a()
         .a($$19)
         .a(cwq.yW, xj.c("advancements.adventure.revaulting.title"), xj.c("advancements.adventure.revaulting.description"), null, an.c, true, true, false)
         .a("revaulting", cy.a.a(dh.a.a().a(ax.a.a().a($$4, dis.ts).a(ee.a.a().a(drl.d, true))), cu.a.a().a($$3, cwq.yW)))
         .a($$1, "adventure/revaulting");
      ag.a.a()
         .a($$18)
         .a(cwq.up, xj.c("advancements.adventure.blowback.title"), xj.c("advancements.adventure.blowback.description"), null, an.b, true, true, false)
         .a(al.a.a(40))
         .a("blowback", dc.a.a(bw.a.a().a($$2, bus.r), bl.a.a().a(eg.a(axe.j)).a(bw.a.a().a($$2, bus.s))))
         .a($$1, "adventure/blowback");
      ag.a.a()
         .a($$5)
         .a(
            cwq.sk,
            xj.c("advancements.adventure.crafters_crafting_crafters.title"),
            xj.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", du.a.b(alj.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ag.a.a()
         .a($$18)
         .a(
            cwq.up,
            xj.c("advancements.adventure.who_needs_rockets.title"),
            xj.c("advancements.adventure.who_needs_rockets.description"),
            null,
            an.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", ca.a.a(bn.b(dj.c.b(7.0)), bw.a.a().a($$2, bus.bD)))
         .a($$1, "adventure/who_needs_rockets");
      ag.a.a()
         .a($$18)
         .a(cwq.ut, xj.c("advancements.adventure.overoverkill.title"), xj.c("advancements.adventure.overoverkill.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("overoverkill", dp.a.a(bk.a.a().a(dj.c.b(100.0)).a(bl.a.a().a(eg.a(axe.H)).a(bw.a.a().a($$2, bus.bO).a(bt.a.a().f(cu.a.a().a($$3, cwq.ut)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ah a(ah $$0, Consumer<ah> $$1, jr<bus<?>> $$2, List<bus<?>> $$3) {
      ah $$4 = a(ag.a.a(), $$2, $$3)
         .a($$0)
         .a(cwq.pc, xj.c("advancements.adventure.kill_a_mob.title"), xj.c("advancements.adventure.kill_a_mob.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ag.a.a(), $$2, $$3)
         .a($$4)
         .a(cwq.ph, xj.c("advancements.adventure.kill_all_mobs.title"), xj.c("advancements.adventure.kill_all_mobs.description"), null, an.b, true, true, false)
         .a(al.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ap<cy.a> a(jr<diq> $$0, diq $$1) {
      exy.a[] $$2 = dka.aF.a().stream().map($$1x -> {
         ee.a $$2x = ee.a.a().a(dka.aF, $$1x);
         ax.a $$3 = ax.a.a().a($$0, dis.gY).a($$2x);
         return exw.a(dh.a.a().a($$3), new jh($$1x.g().q()));
      }).toArray(exy.a[]::new);
      return cy.a.a(exx.a($$1), exm.a($$2));
   }

   private static ap<cy.a> b(jr<diq> $$0, diq $$1) {
      exy.a[] $$2 = dka.aF.a().stream().map($$2x -> {
         ee.a $$3 = ee.a.a().a(dka.aF, $$2x);
         exx.a $$4 = new exx.a(dis.gY).a($$3);
         exy.a $$5 = exw.a(dh.a.a().a(ax.a.a().a($$0, $$1)), new jh($$2x.q()));
         return exl.a($$4, $$5);
      }).toArray(exy.a[]::new);
      return cy.a.a(exm.a($$2));
   }

   private static ag.a a(ag.a $$0) {
      $$0.a(ak.a.a);
      Set<cwi> $$1 = Set.of(cwq.xZ, cwq.xX, cwq.xY, cwq.xT, cwq.yc, cwq.xV, cwq.xW, cwq.ya);
      ph.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), du.a.a($$1x.b())));
      return $$0;
   }

   private static ag.a b(ag.a $$0) {
      $$0.a(ak.a.b);
      ph.b().map(ph.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, du.a.a($$1)));
      return $$0;
   }

   private static ag.a a(jr<cwi> $$0, ag.a $$1) {
      List<Pair<String, ap<di.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", di.a.a(euj.aY)),
         Pair.of("desert_well", di.a.a(euj.aX)),
         Pair.of("ocean_ruin_cold", di.a.a(euj.bc)),
         Pair.of("ocean_ruin_warm", di.a.a(euj.bb)),
         Pair.of("trail_ruins_rare", di.a.a(euj.ba)),
         Pair.of("trail_ruins_common", di.a.a(euj.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ap<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ci.a.a(cu.a.a().a($$0, axl.bG)));
      $$1.a(new ak(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(js.a $$0, Consumer<ah> $$1, ah $$2, dhc.a $$3) {
      a(ag.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cwq.pO,
            xj.c("advancements.adventure.adventuring_time.title"),
            xj.c("advancements.adventure.adventuring_time.description"),
            null,
            an.b,
            true,
            true,
            false
         )
         .a(al.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ag.a a(ag.a $$0, jr<bus<?>> $$1, List<bus<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lz.f.b($$2x).toString(), dc.a.a(bw.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ag.a a(ag.a $$0, js.a $$1, List<ali<dgo>> $$2) {
      jr<dgo> $$3 = $$1.d(ma.aG);

      for (ali<dgo> $$4 : $$2) {
         $$0.a($$4.a().toString(), ds.a.a(dh.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
