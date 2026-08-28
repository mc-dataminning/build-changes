import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mp implements mm {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bur<?>> a = Arrays.asList(
      bur.o,
      bur.q,
      bur.r,
      bur.v,
      bur.E,
      bur.F,
      bur.L,
      bur.N,
      bur.Q,
      bur.O,
      bur.P,
      bur.T,
      bur.ae,
      bur.aj,
      bur.ak,
      bur.an,
      bur.aA,
      bur.aQ,
      bur.aS,
      bur.aT,
      bur.aU,
      bur.aZ,
      bur.bc,
      bur.be,
      bur.bf,
      bur.bh,
      bur.bo,
      bur.bs,
      bur.bC,
      bur.bE,
      bur.bI,
      bur.bK,
      bur.bJ,
      bur.bN,
      bur.bQ,
      bur.bO,
      bur.bR
   );

   private static aq<dh.a> a(dk.d $$0, Optional<bx> $$1) {
      return dh.a.a(Optional.of(bx.a.a().a(bo.c(dk.c.c(30.0))).a(dg.a($$0)).b()), $$1);
   }

   private static aq<en.a> a(bx.a $$0, cv.a $$1) {
      return en.a.a(bx.a.a().a(ds.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<bur<?>> $$2 = $$0.d(mc.z);
      js<cwl> $$3 = $$0.d(mc.K);
      js<djm> $$4 = $$0.d(mc.f);
      ai $$5 = ah.a.a()
         .a(
            cwt.vi,
            wo.c("advancements.adventure.root.title"),
            wo.c("advancements.adventure.root.description"),
            aku.b("textures/gui/advancements/backgrounds/adventure.png"),
            ao.a,
            false,
            false,
            false
         )
         .a(al.a.b)
         .a("killed_something", dd.a.b())
         .a("killed_by_something", dd.a.d())
         .a($$1, "adventure/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(djo.bu, wo.c("advancements.adventure.sleep_in_bed.title"), wo.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", dt.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dhy.a.b);
      ai $$7 = ah.a.a()
         .a($$5)
         .a(cwt.pf, wo.c("advancements.adventure.trade.title"), wo.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", ek.a.b())
         .a($$1, "adventure/trade");
      ah.a.a()
         .a($$7)
         .a(
            cwt.pf,
            wo.c("advancements.adventure.trade_at_world_height.title"),
            wo.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", ek.a.a(bx.a.a().a(di.a.a(dk.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ai $$8 = a($$5, $$1, $$2, a);
      ai $$9 = ah.a.a()
         .a($$8)
         .a(cwt.pa, wo.c("advancements.adventure.shoot_arrow.title"), wo.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, awt.f)))))
         .a($$1, "adventure/shoot_arrow");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(cwt.wS, wo.c("advancements.adventure.throw_trident.title"), wo.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bur.bz)))))
         .a($$1, "adventure/throw_trident");
      ah.a.a()
         .a($$10)
         .a(
            cwt.wS,
            wo.c("advancements.adventure.very_very_frightening.title"),
            wo.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", bc.a.a(bx.a.a().a($$2, bur.bD)))
         .a($$1, "adventure/very_very_frightening");
      ah.a.a()
         .a($$7)
         .a(
            djo.er,
            wo.c("advancements.adventure.summon_iron_golem.title"),
            wo.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", eg.a.a(bx.a.a().a($$2, bur.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ah.a.a()
         .a($$9)
         .a(cwt.pb, wo.c("advancements.adventure.sniper_duel.title"), wo.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_skeleton", dd.a.a(bx.a.a().a($$2, bur.bf).a(bo.a(dk.c.b(50.0))), bm.a.a().a(eh.a(awr.j))))
         .a($$1, "adventure/sniper_duel");
      ah.a.a()
         .a($$8)
         .a(
            cwt.wt,
            wo.c("advancements.adventure.totem_of_undying.title"),
            wo.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", em.a.a($$3, cwt.wt))
         .a($$1, "adventure/totem_of_undying");
      ai $$11 = ah.a.a()
         .a($$5)
         .a(cwt.wV, wo.c("advancements.adventure.ol_betsy.title"), wo.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", dy.a.a($$3, cwt.wV))
         .a($$1, "adventure/ol_betsy");
      ah.a.a()
         .a($$11)
         .a(
            cwt.wV,
            wo.c("advancements.adventure.whos_the_pillager_now.title"),
            wo.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", dc.a.a($$3, bx.a.a().a($$2, bur.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ah.a.a()
         .a($$11)
         .a(
            cwt.wV,
            wo.c("advancements.adventure.two_birds_one_arrow.title"),
            wo.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(65))
         .a("two_birds", dc.a.a($$3, bx.a.a().a($$2, bur.aQ), bx.a.a().a($$2, bur.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ah.a.a()
         .a($$11)
         .a(cwt.wV, wo.c("advancements.adventure.arbalistic.title"), wo.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(am.a.a(85))
         .a("arbalistic", dc.a.a($$3, dk.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jt.b<dtp> $$12 = $$0.d(mc.d);
      ai $$13 = ah.a.a()
         .a($$5)
         .a(
            cqk.a($$12),
            wo.c("advancements.adventure.voluntary_exile.title"),
            wo.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dd.a.a(bx.a.a().a($$2, awt.c).a(bu.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ah.a.a()
         .a($$13)
         .a(
            cqk.a($$12),
            wo.c("advancements.adventure.hero_of_the_village.title"),
            wo.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ao.b,
            true,
            true,
            true
         )
         .a(am.a.a(100))
         .a("hero_of_the_village", dt.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ah.a.a()
         .a($$5)
         .a(
            djo.pI.j(),
            wo.c("advancements.adventure.honey_block_slide.title"),
            wo.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", eb.a.a(djo.pI))
         .a($$1, "adventure/honey_block_slide");
      ah.a.a()
         .a($$9)
         .a(djo.pF.j(), wo.c("advancements.adventure.bullseye.title"), wo.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("bullseye", ej.a.a(dk.d.a(15), Optional.of(bx.a(bx.a.a().a(bo.a(dk.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ah.a.a()
         .a($$6)
         .a(
            cwt.qg,
            wo.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wo.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dt.a.a($$4, $$3, djo.rr, cwt.qg))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ah.a.a()
         .a($$5)
         .a(
            cwt.mu,
            wo.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wo.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dk.d.a(0), Optional.of(bx.a.a().a($$2, bur.bD).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cwt.rU,
            wo.c("advancements.adventure.spyglass_at_parrot.title"),
            wo.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bx.a.a().a($$2, bur.aP), cv.a.a().a($$3, cwt.rU)))
         .a($$1, "adventure/spyglass_at_parrot");
      ai $$15 = ah.a.a()
         .a($$14)
         .a(
            cwt.rU,
            wo.c("advancements.adventure.spyglass_at_ghast.title"),
            wo.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bx.a.a().a($$2, bur.ae), cv.a.a().a($$3, cwt.rU)))
         .a($$1, "adventure/spyglass_at_ghast");
      ah.a.a()
         .a($$6)
         .a(
            cwt.fm,
            wo.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wo.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cz.a.a(di.a.a().a(jv.a($$0.d(mc.aI).b(dhr.E))).a(ay.a.a().a($$4, djo.eg)), cv.a.a().a(cx.n, ct.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ah.a.a()
         .a($$15)
         .a(
            cwt.rU,
            wo.c("advancements.adventure.spyglass_at_dragon.title"),
            wo.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bx.a.a().a($$2, bur.Q), cv.a.a().a($$3, cwt.rU)))
         .a($$1, "adventure/spyglass_at_dragon");
      ah.a.a()
         .a($$5)
         .a(
            cwt.rg,
            wo.c("advancements.adventure.fall_from_world_height.title"),
            wo.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bp.a.a(bx.a.a().a(di.a.a(dk.c.c(-59.0))), bo.b(dk.c.b(379.0)), di.a.a(dk.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ah.a.a()
         .a($$8)
         .a(
            djo.rw,
            wo.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wo.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", dd.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ah.a.a()
         .a($$5)
         .a(
            djo.rs,
            wo.c("advancements.adventure.avoid_vibration.title"),
            wo.c("advancements.adventure.avoid_vibration.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dt.a.d())
         .a($$1, "adventure/avoid_vibration");
      ai $$16 = a($$3, ah.a.a())
         .a($$5)
         .a(cwt.yv, wo.c("advancements.adventure.salvage_sherd.title"), wo.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ah.a.a()
         .a($$16)
         .a(
            duq.a(new dvg(Optional.empty(), Optional.of(cwt.za), Optional.empty(), Optional.of(cwt.yW))),
            wo.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wo.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dv.a.a(
               akt.a(mc.bk, aku.b("decorated_pot")),
               List.of(cv.a.a().a($$3, awy.bF), cv.a.a().a($$3, awy.bF), cv.a.a().a($$3, awy.bF), cv.a.a().a($$3, awy.bF))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ai $$17 = b(ah.a.a())
         .a($$5)
         .a(
            new cwp(cwt.yy),
            wo.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wo.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ah.a.a())
         .a($$17)
         .a(
            new cwp(cwt.yK),
            wo.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wo.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ah.a.a()
         .a($$5)
         .a(
            cwt.eO,
            wo.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wo.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("chiseled_bookshelf", a($$4, djo.ct))
         .a("comparator", b($$4, djo.ct))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ah.a.a()
         .a($$5)
         .a(
            cwt.oV,
            wo.c("advancements.adventure.brush_armadillo.title"),
            wo.c("advancements.adventure.brush_armadillo.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dr.a.a(cv.a.a().a($$3, cwt.yv), Optional.of(bx.a(bx.a.a().a($$2, bur.e)))))
         .a($$1, "adventure/brush_armadillo");
      ai $$18 = ah.a.a()
         .a($$5)
         .a(
            djo.rj,
            wo.c("advancements.adventure.minecraft_trials_edition.title"),
            wo.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dt.a.a(di.a.b($$0.d(mc.aU).b(eng.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ah.a.a()
         .a($$18)
         .a(cwt.zu, wo.c("advancements.adventure.lighten_up.title"), wo.c("advancements.adventure.lighten_up.description"), null, ao.a, true, true, false)
         .a("lighten_up", cz.a.a(di.a.a().a(ay.a.a().a($$4, djo.sP, djo.sO, djo.sN, djo.sT, djo.sS, djo.sR).a(ef.a.a().a(dla.c, true))), cv.a.a().a($$3, mq.c)))
         .a($$1, "adventure/lighten_up");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(
            cwt.zD,
            wo.c("advancements.adventure.under_lock_and_key.title"),
            wo.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cz.a.a(di.a.a().a(ay.a.a().a($$4, djo.tU).a(ef.a.a().a(dsm.d, false))), cv.a.a().a($$3, cwt.zD)))
         .a($$1, "adventure/under_lock_and_key");
      ah.a.a()
         .a($$19)
         .a(cwt.zE, wo.c("advancements.adventure.revaulting.title"), wo.c("advancements.adventure.revaulting.description"), null, ao.c, true, true, false)
         .a("revaulting", cz.a.a(di.a.a().a(ay.a.a().a($$4, djo.tU).a(ef.a.a().a(dsm.d, true))), cv.a.a().a($$3, cwt.zE)))
         .a($$1, "adventure/revaulting");
      ah.a.a()
         .a($$18)
         .a(cwt.uW, wo.c("advancements.adventure.blowback.title"), wo.c("advancements.adventure.blowback.description"), null, ao.b, true, true, false)
         .a(am.a.a(40))
         .a("blowback", dd.a.a(bx.a.a().a($$2, bur.r), bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bur.s))))
         .a($$1, "adventure/blowback");
      ah.a.a()
         .a($$5)
         .a(
            cwt.sQ,
            wo.c("advancements.adventure.crafters_crafting_crafters.title"),
            wo.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dv.a.b(akt.a(mc.bk, aku.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ah.a.a()
         .a($$18)
         .a(
            cwt.uW,
            wo.c("advancements.adventure.who_needs_rockets.title"),
            wo.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cb.a.a(bo.b(dk.c.b(7.0)), bx.a.a().a($$2, bur.bH)))
         .a($$1, "adventure/who_needs_rockets");
      ah.a.a()
         .a($$18)
         .a(cwt.va, wo.c("advancements.adventure.overoverkill.title"), wo.c("advancements.adventure.overoverkill.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("overoverkill", dq.a.a(bl.a.a().a(dk.c.b(100.0)).a(bm.a.a().a(eh.a(awr.H)).a(bx.a.a().a($$2, bur.bS).a(bu.a.a().f(cv.a.a().a($$3, cwt.va)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, js<bur<?>> $$2, List<bur<?>> $$3) {
      ai $$4 = a(ah.a.a(), $$2, $$3)
         .a($$0)
         .a(cwt.pG, wo.c("advancements.adventure.kill_a_mob.title"), wo.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ah.a.a(), $$2, $$3)
         .a($$4)
         .a(cwt.pL, wo.c("advancements.adventure.kill_all_mobs.title"), wo.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static aq<cz.a> a(js<djm> $$0, djm $$1) {
      eza.a[] $$2 = dkw.aF.a().stream().map($$1x -> {
         ef.a $$2x = ef.a.a().a(dkw.aF, $$1x);
         ay.a $$3 = ay.a.a().a($$0, djo.hv).a($$2x);
         return eyy.a(di.a.a().a($$3), new ji($$1x.g().q()));
      }).toArray(eza.a[]::new);
      return cz.a.a(eyz.a($$1), eyo.a($$2));
   }

   private static aq<cz.a> b(js<djm> $$0, djm $$1) {
      eza.a[] $$2 = dkw.aF.a().stream().map($$2x -> {
         ef.a $$3 = ef.a.a().a(dkw.aF, $$2x);
         eyz.a $$4 = new eyz.a(djo.hv).a($$3);
         eza.a $$5 = eyy.a(di.a.a().a(ay.a.a().a($$0, $$1)), new ji($$2x.q()));
         return eyn.a($$4, $$5);
      }).toArray(eza.a[]::new);
      return cz.a.a(eyo.a($$2));
   }

   private static ah.a a(ah.a $$0) {
      $$0.a(al.a.a);
      Set<cwl> $$1 = Set.of(cwt.yH, cwt.yF, cwt.yG, cwt.yB, cwt.yK, cwt.yD, cwt.yE, cwt.yI);
      om.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b().a(), dv.a.a($$1x.b())));
      return $$0;
   }

   private static ah.a b(ah.a $$0) {
      $$0.a(al.a.b);
      om.b().map(om.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dv.a.a((akt<dbe<?>>)$$1)));
      return $$0;
   }

   private static ah.a a(js<cwl> $$0, ah.a $$1) {
      List<Pair<String, aq<dj.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dj.a.a(evn.aY)),
         Pair.of("desert_well", dj.a.a(evn.aX)),
         Pair.of("ocean_ruin_cold", dj.a.a(evn.bc)),
         Pair.of("ocean_ruin_warm", dj.a.a(evn.bb)),
         Pair.of("trail_ruins_rare", dj.a.a(evn.ba)),
         Pair.of("trail_ruins_common", dj.a.a(evn.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (aq<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cj.a.a(cv.a.a().a($$0, awy.bF)));
      $$1.a(new al(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jt.a $$0, Consumer<ai> $$1, ai $$2, dhy.a $$3) {
      a(ah.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cwt.qs,
            wo.c("advancements.adventure.adventuring_time.title"),
            wo.c("advancements.adventure.adventuring_time.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ah.a a(ah.a $$0, js<bur<?>> $$1, List<bur<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mb.f.b($$2x).toString(), dd.a.a(bx.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ah.a a(ah.a $$0, jt.a $$1, List<akt<dhk>> $$2) {
      js<dhk> $$3 = $$1.d(mc.aI);

      for (akt<dhk> $$4 : $$2) {
         $$0.a($$4.a().toString(), dt.a.a(di.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
