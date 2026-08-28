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
      bur.D,
      bur.E,
      bur.K,
      bur.M,
      bur.P,
      bur.N,
      bur.O,
      bur.S,
      bur.ad,
      bur.ai,
      bur.aj,
      bur.am,
      bur.az,
      bur.aP,
      bur.aR,
      bur.aS,
      bur.aT,
      bur.aY,
      bur.bb,
      bur.bd,
      bur.be,
      bur.bg,
      bur.bn,
      bur.br,
      bur.bB,
      bur.bD,
      bur.bH,
      bur.bJ,
      bur.bI,
      bur.bM,
      bur.bP,
      bur.bN,
      bur.bQ
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
      js<cwk> $$3 = $$0.d(mc.K);
      js<djl> $$4 = $$0.d(mc.f);
      ai $$5 = ah.a.a()
         .a(
            cws.vi,
            wp.c("advancements.adventure.root.title"),
            wp.c("advancements.adventure.root.description"),
            akv.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(djn.bu, wp.c("advancements.adventure.sleep_in_bed.title"), wp.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", dt.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dhx.a.b);
      ai $$7 = ah.a.a()
         .a($$5)
         .a(cws.pf, wp.c("advancements.adventure.trade.title"), wp.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", ek.a.b())
         .a($$1, "adventure/trade");
      ah.a.a()
         .a($$7)
         .a(
            cws.pf,
            wp.c("advancements.adventure.trade_at_world_height.title"),
            wp.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cws.pa, wp.c("advancements.adventure.shoot_arrow.title"), wp.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, awt.f)))))
         .a($$1, "adventure/shoot_arrow");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(cws.wS, wp.c("advancements.adventure.throw_trident.title"), wp.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bur.by)))))
         .a($$1, "adventure/throw_trident");
      ah.a.a()
         .a($$10)
         .a(
            cws.wS,
            wp.c("advancements.adventure.very_very_frightening.title"),
            wp.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", bc.a.a(bx.a.a().a($$2, bur.bC)))
         .a($$1, "adventure/very_very_frightening");
      ah.a.a()
         .a($$7)
         .a(
            djn.er,
            wp.c("advancements.adventure.summon_iron_golem.title"),
            wp.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", eg.a.a(bx.a.a().a($$2, bur.ap)))
         .a($$1, "adventure/summon_iron_golem");
      ah.a.a()
         .a($$9)
         .a(cws.pb, wp.c("advancements.adventure.sniper_duel.title"), wp.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_skeleton", dd.a.a(bx.a.a().a($$2, bur.be).a(bo.a(dk.c.b(50.0))), bm.a.a().a(eh.a(awr.j))))
         .a($$1, "adventure/sniper_duel");
      ah.a.a()
         .a($$8)
         .a(
            cws.wt,
            wp.c("advancements.adventure.totem_of_undying.title"),
            wp.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", em.a.a($$3, cws.wt))
         .a($$1, "adventure/totem_of_undying");
      ai $$11 = ah.a.a()
         .a($$5)
         .a(cws.wV, wp.c("advancements.adventure.ol_betsy.title"), wp.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", dy.a.a($$3, cws.wV))
         .a($$1, "adventure/ol_betsy");
      ah.a.a()
         .a($$11)
         .a(
            cws.wV,
            wp.c("advancements.adventure.whos_the_pillager_now.title"),
            wp.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", dc.a.a($$3, bx.a.a().a($$2, bur.aT)))
         .a($$1, "adventure/whos_the_pillager_now");
      ah.a.a()
         .a($$11)
         .a(
            cws.wV,
            wp.c("advancements.adventure.two_birds_one_arrow.title"),
            wp.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(65))
         .a("two_birds", dc.a.a($$3, bx.a.a().a($$2, bur.aP), bx.a.a().a($$2, bur.aP)))
         .a($$1, "adventure/two_birds_one_arrow");
      ah.a.a()
         .a($$11)
         .a(cws.wV, wp.c("advancements.adventure.arbalistic.title"), wp.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(am.a.a(85))
         .a("arbalistic", dc.a.a($$3, dk.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jt.b<dto> $$12 = $$0.d(mc.d);
      ai $$13 = ah.a.a()
         .a($$5)
         .a(
            cqj.a($$12),
            wp.c("advancements.adventure.voluntary_exile.title"),
            wp.c("advancements.adventure.voluntary_exile.description"),
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
            cqj.a($$12),
            wp.c("advancements.adventure.hero_of_the_village.title"),
            wp.c("advancements.adventure.hero_of_the_village.description"),
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
            djn.pI.j(),
            wp.c("advancements.adventure.honey_block_slide.title"),
            wp.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", eb.a.a(djn.pI))
         .a($$1, "adventure/honey_block_slide");
      ah.a.a()
         .a($$9)
         .a(djn.pF.j(), wp.c("advancements.adventure.bullseye.title"), wp.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("bullseye", ej.a.a(dk.d.a(15), Optional.of(bx.a(bx.a.a().a(bo.a(dk.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ah.a.a()
         .a($$6)
         .a(
            cws.qg,
            wp.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wp.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dt.a.a($$4, $$3, djn.rr, cws.qg))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ah.a.a()
         .a($$5)
         .a(
            cws.mu,
            wp.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wp.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dk.d.a(0), Optional.of(bx.a.a().a($$2, bur.bC).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cws.rU,
            wp.c("advancements.adventure.spyglass_at_parrot.title"),
            wp.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bx.a.a().a($$2, bur.aO), cv.a.a().a($$3, cws.rU)))
         .a($$1, "adventure/spyglass_at_parrot");
      ai $$15 = ah.a.a()
         .a($$14)
         .a(
            cws.rU,
            wp.c("advancements.adventure.spyglass_at_ghast.title"),
            wp.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bx.a.a().a($$2, bur.ad), cv.a.a().a($$3, cws.rU)))
         .a($$1, "adventure/spyglass_at_ghast");
      ah.a.a()
         .a($$6)
         .a(
            cws.fm,
            wp.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wp.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cz.a.a(di.a.a().a(jv.a($$0.d(mc.aI).b(dhq.E))).a(ay.a.a().a($$4, djn.eg)), cv.a.a().a(cx.n, ct.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ah.a.a()
         .a($$15)
         .a(
            cws.rU,
            wp.c("advancements.adventure.spyglass_at_dragon.title"),
            wp.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bx.a.a().a($$2, bur.P), cv.a.a().a($$3, cws.rU)))
         .a($$1, "adventure/spyglass_at_dragon");
      ah.a.a()
         .a($$5)
         .a(
            cws.rg,
            wp.c("advancements.adventure.fall_from_world_height.title"),
            wp.c("advancements.adventure.fall_from_world_height.description"),
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
            djn.rw,
            wp.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wp.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            djn.rs,
            wp.c("advancements.adventure.avoid_vibration.title"),
            wp.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cws.yv, wp.c("advancements.adventure.salvage_sherd.title"), wp.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ah.a.a()
         .a($$16)
         .a(
            dup.a(new dvf(Optional.empty(), Optional.of(cws.za), Optional.empty(), Optional.of(cws.yW))),
            wp.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wp.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dv.a.a(
               aku.a(mc.bk, akv.b("decorated_pot")),
               List.of(cv.a.a().a($$3, awy.bE), cv.a.a().a($$3, awy.bE), cv.a.a().a($$3, awy.bE), cv.a.a().a($$3, awy.bE))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ai $$17 = b(ah.a.a())
         .a($$5)
         .a(
            new cwo(cws.yy),
            wp.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wp.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cwo(cws.yK),
            wp.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wp.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cws.eO,
            wp.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wp.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("chiseled_bookshelf", a($$4, djn.ct))
         .a("comparator", b($$4, djn.ct))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ah.a.a()
         .a($$5)
         .a(
            cws.oV,
            wp.c("advancements.adventure.brush_armadillo.title"),
            wp.c("advancements.adventure.brush_armadillo.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dr.a.a(cv.a.a().a($$3, cws.yv), Optional.of(bx.a(bx.a.a().a($$2, bur.e)))))
         .a($$1, "adventure/brush_armadillo");
      ai $$18 = ah.a.a()
         .a($$5)
         .a(
            djn.rj,
            wp.c("advancements.adventure.minecraft_trials_edition.title"),
            wp.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dt.a.a(di.a.b($$0.d(mc.aU).b(enf.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ah.a.a()
         .a($$18)
         .a(cws.zu, wp.c("advancements.adventure.lighten_up.title"), wp.c("advancements.adventure.lighten_up.description"), null, ao.a, true, true, false)
         .a("lighten_up", cz.a.a(di.a.a().a(ay.a.a().a($$4, djn.sP, djn.sO, djn.sN, djn.sT, djn.sS, djn.sR).a(ef.a.a().a(dkz.c, true))), cv.a.a().a($$3, mq.c)))
         .a($$1, "adventure/lighten_up");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(
            cws.zD,
            wp.c("advancements.adventure.under_lock_and_key.title"),
            wp.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cz.a.a(di.a.a().a(ay.a.a().a($$4, djn.tU).a(ef.a.a().a(dsl.d, false))), cv.a.a().a($$3, cws.zD)))
         .a($$1, "adventure/under_lock_and_key");
      ah.a.a()
         .a($$19)
         .a(cws.zE, wp.c("advancements.adventure.revaulting.title"), wp.c("advancements.adventure.revaulting.description"), null, ao.c, true, true, false)
         .a("revaulting", cz.a.a(di.a.a().a(ay.a.a().a($$4, djn.tU).a(ef.a.a().a(dsl.d, true))), cv.a.a().a($$3, cws.zE)))
         .a($$1, "adventure/revaulting");
      ah.a.a()
         .a($$18)
         .a(cws.uW, wp.c("advancements.adventure.blowback.title"), wp.c("advancements.adventure.blowback.description"), null, ao.b, true, true, false)
         .a(am.a.a(40))
         .a("blowback", dd.a.a(bx.a.a().a($$2, bur.r), bm.a.a().a(eh.a(awr.j)).a(bx.a.a().a($$2, bur.s))))
         .a($$1, "adventure/blowback");
      ah.a.a()
         .a($$5)
         .a(
            cws.sQ,
            wp.c("advancements.adventure.crafters_crafting_crafters.title"),
            wp.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dv.a.b(aku.a(mc.bk, akv.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ah.a.a()
         .a($$18)
         .a(
            cws.uW,
            wp.c("advancements.adventure.who_needs_rockets.title"),
            wp.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cb.a.a(bo.b(dk.c.b(7.0)), bx.a.a().a($$2, bur.bG)))
         .a($$1, "adventure/who_needs_rockets");
      ah.a.a()
         .a($$18)
         .a(cws.va, wp.c("advancements.adventure.overoverkill.title"), wp.c("advancements.adventure.overoverkill.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("overoverkill", dq.a.a(bl.a.a().a(dk.c.b(100.0)).a(bm.a.a().a(eh.a(awr.H)).a(bx.a.a().a($$2, bur.bR).a(bu.a.a().f(cv.a.a().a($$3, cws.va)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, js<bur<?>> $$2, List<bur<?>> $$3) {
      ai $$4 = a(ah.a.a(), $$2, $$3)
         .a($$0)
         .a(cws.pG, wp.c("advancements.adventure.kill_a_mob.title"), wp.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ah.a.a(), $$2, $$3)
         .a($$4)
         .a(cws.pL, wp.c("advancements.adventure.kill_all_mobs.title"), wp.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static aq<cz.a> a(js<djl> $$0, djl $$1) {
      eyz.a[] $$2 = dkv.aF.a().stream().map($$1x -> {
         ef.a $$2x = ef.a.a().a(dkv.aF, $$1x);
         ay.a $$3 = ay.a.a().a($$0, djn.hv).a($$2x);
         return eyx.a(di.a.a().a($$3), new ji($$1x.g().q()));
      }).toArray(eyz.a[]::new);
      return cz.a.a(eyy.a($$1), eyn.a($$2));
   }

   private static aq<cz.a> b(js<djl> $$0, djl $$1) {
      eyz.a[] $$2 = dkv.aF.a().stream().map($$2x -> {
         ef.a $$3 = ef.a.a().a(dkv.aF, $$2x);
         eyy.a $$4 = new eyy.a(djn.hv).a($$3);
         eyz.a $$5 = eyx.a(di.a.a().a(ay.a.a().a($$0, $$1)), new ji($$2x.q()));
         return eym.a($$4, $$5);
      }).toArray(eyz.a[]::new);
      return cz.a.a(eyn.a($$2));
   }

   private static ah.a a(ah.a $$0) {
      $$0.a(al.a.a);
      Set<cwk> $$1 = Set.of(cws.yH, cws.yF, cws.yG, cws.yB, cws.yK, cws.yD, cws.yE, cws.yI);
      om.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b().a(), dv.a.a($$1x.b())));
      return $$0;
   }

   private static ah.a b(ah.a $$0) {
      $$0.a(al.a.b);
      om.b().map(om.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dv.a.a((aku<dbd<?>>)$$1)));
      return $$0;
   }

   private static ah.a a(js<cwk> $$0, ah.a $$1) {
      List<Pair<String, aq<dj.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dj.a.a(evm.aY)),
         Pair.of("desert_well", dj.a.a(evm.aX)),
         Pair.of("ocean_ruin_cold", dj.a.a(evm.bc)),
         Pair.of("ocean_ruin_warm", dj.a.a(evm.bb)),
         Pair.of("trail_ruins_rare", dj.a.a(evm.ba)),
         Pair.of("trail_ruins_common", dj.a.a(evm.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (aq<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cj.a.a(cv.a.a().a($$0, awy.bE)));
      $$1.a(new al(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jt.a $$0, Consumer<ai> $$1, ai $$2, dhx.a $$3) {
      a(ah.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cws.qs,
            wp.c("advancements.adventure.adventuring_time.title"),
            wp.c("advancements.adventure.adventuring_time.description"),
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

   protected static ah.a a(ah.a $$0, jt.a $$1, List<aku<dhj>> $$2) {
      js<dhj> $$3 = $$1.d(mc.aI);

      for (aku<dhj> $$4 : $$2) {
         $$0.a($$4.a().toString(), dt.a.a(di.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
