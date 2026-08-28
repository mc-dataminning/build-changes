import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mr implements mo {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bwb<?>> a = Arrays.asList(
      bwb.o,
      bwb.q,
      bwb.r,
      bwb.v,
      bwb.D,
      bwb.E,
      bwb.K,
      bwb.M,
      bwb.P,
      bwb.N,
      bwb.O,
      bwb.S,
      bwb.ad,
      bwb.ai,
      bwb.aj,
      bwb.am,
      bwb.az,
      bwb.aP,
      bwb.aR,
      bwb.aS,
      bwb.aT,
      bwb.aY,
      bwb.bb,
      bwb.bd,
      bwb.be,
      bwb.bg,
      bwb.bn,
      bwb.br,
      bwb.bB,
      bwb.bD,
      bwb.bH,
      bwb.bJ,
      bwb.bI,
      bwb.bM,
      bwb.bP,
      bwb.bN,
      bwb.bQ
   );

   private static aq<dh.a> a(dk.d $$0, Optional<bx> $$1) {
      return dh.a.a(Optional.of(bx.a.a().a(bo.c(dk.c.c(30.0))).a(dg.a($$0)).b()), $$1);
   }

   private static aq<en.a> a(bx.a $$0, cv.a $$1) {
      return en.a.a(bx.a.a().a(ds.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(ju.a $$0, Consumer<ai> $$1) {
      jt<bwb<?>> $$2 = $$0.e(me.z);
      jt<cxu> $$3 = $$0.e(me.K);
      jt<dku> $$4 = $$0.e(me.f);
      ai $$5 = ah.a.a()
         .a(
            cyc.vm,
            wv.c("advancements.adventure.root.title"),
            wv.c("advancements.adventure.root.description"),
            ald.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dkw.bu, wv.c("advancements.adventure.sleep_in_bed.title"), wv.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", dt.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, djg.a.b);
      ai $$7 = ah.a.a()
         .a($$5)
         .a(cyc.pj, wv.c("advancements.adventure.trade.title"), wv.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", ek.a.b())
         .a($$1, "adventure/trade");
      ah.a.a()
         .a($$7)
         .a(
            cyc.pj,
            wv.c("advancements.adventure.trade_at_world_height.title"),
            wv.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cyc.pe, wv.c("advancements.adventure.shoot_arrow.title"), wv.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(axb.j)).a(bx.a.a().a($$2, axd.f)))))
         .a($$1, "adventure/shoot_arrow");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(cyc.wW, wv.c("advancements.adventure.throw_trident.title"), wv.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", dq.a.a(bl.a.a().a(bm.a.a().a(eh.a(axb.j)).a(bx.a.a().a($$2, bwb.by)))))
         .a($$1, "adventure/throw_trident");
      ah.a.a()
         .a($$10)
         .a(
            cyc.wW,
            wv.c("advancements.adventure.very_very_frightening.title"),
            wv.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", bc.a.a(bx.a.a().a($$2, bwb.bC)))
         .a($$1, "adventure/very_very_frightening");
      ah.a.a()
         .a($$7)
         .a(
            dkw.er,
            wv.c("advancements.adventure.summon_iron_golem.title"),
            wv.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", eg.a.a(bx.a.a().a($$2, bwb.ap)))
         .a($$1, "adventure/summon_iron_golem");
      ah.a.a()
         .a($$9)
         .a(cyc.pf, wv.c("advancements.adventure.sniper_duel.title"), wv.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_skeleton", dd.a.a(bx.a.a().a($$2, bwb.be).a(bo.a(dk.c.b(50.0))), bm.a.a().a(eh.a(axb.j))))
         .a($$1, "adventure/sniper_duel");
      ah.a.a()
         .a($$8)
         .a(
            cyc.wx,
            wv.c("advancements.adventure.totem_of_undying.title"),
            wv.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", em.a.a($$3, cyc.wx))
         .a($$1, "adventure/totem_of_undying");
      ai $$11 = ah.a.a()
         .a($$5)
         .a(cyc.wZ, wv.c("advancements.adventure.ol_betsy.title"), wv.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", dy.a.a($$3, cyc.wZ))
         .a($$1, "adventure/ol_betsy");
      ah.a.a()
         .a($$11)
         .a(
            cyc.wZ,
            wv.c("advancements.adventure.whos_the_pillager_now.title"),
            wv.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", dc.a.a($$3, bx.a.a().a($$2, bwb.aT)))
         .a($$1, "adventure/whos_the_pillager_now");
      ah.a.a()
         .a($$11)
         .a(
            cyc.wZ,
            wv.c("advancements.adventure.two_birds_one_arrow.title"),
            wv.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(65))
         .a("two_birds", dc.a.a($$3, bx.a.a().a($$2, bwb.aP), bx.a.a().a($$2, bwb.aP)))
         .a($$1, "adventure/two_birds_one_arrow");
      ah.a.a()
         .a($$11)
         .a(cyc.wZ, wv.c("advancements.adventure.arbalistic.title"), wv.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(am.a.a(85))
         .a("arbalistic", dc.a.a($$3, dk.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ju.b<dva> $$12 = $$0.e(me.d);
      ai $$13 = ah.a.a()
         .a($$5)
         .a(
            crv.a($$12),
            wv.c("advancements.adventure.voluntary_exile.title"),
            wv.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", dd.a.a(bx.a.a().a($$2, axd.c).a(bu.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ah.a.a()
         .a($$13)
         .a(
            crv.a($$12),
            wv.c("advancements.adventure.hero_of_the_village.title"),
            wv.c("advancements.adventure.hero_of_the_village.description"),
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
            dkw.pK.i(),
            wv.c("advancements.adventure.honey_block_slide.title"),
            wv.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", eb.a.a(dkw.pK))
         .a($$1, "adventure/honey_block_slide");
      ah.a.a()
         .a($$9)
         .a(dkw.pH.i(), wv.c("advancements.adventure.bullseye.title"), wv.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("bullseye", ej.a.a(dk.d.a(15), Optional.of(bx.a(bx.a.a().a(bo.a(dk.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ah.a.a()
         .a($$6)
         .a(
            cyc.qk,
            wv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dt.a.a($$4, $$3, dkw.rt, cyc.qk))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ah.a.a()
         .a($$5)
         .a(
            cyc.mw,
            wv.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wv.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dk.d.a(0), Optional.of(bx.a.a().a($$2, bwb.bC).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            cyc.rY,
            wv.c("advancements.adventure.spyglass_at_parrot.title"),
            wv.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bx.a.a().a($$2, bwb.aO), cv.a.a().a($$3, cyc.rY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ai $$15 = ah.a.a()
         .a($$14)
         .a(
            cyc.rY,
            wv.c("advancements.adventure.spyglass_at_ghast.title"),
            wv.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bx.a.a().a($$2, bwb.ad), cv.a.a().a($$3, cyc.rY)))
         .a($$1, "adventure/spyglass_at_ghast");
      ah.a.a()
         .a($$6)
         .a(
            cyc.fo,
            wv.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wv.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cz.a.a(di.a.a().a(jw.a($$0.e(me.aM).b(diz.E))).a(ay.a.a().a($$4, dkw.eg)), cv.a.a().a(cx.n, ct.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ah.a.a()
         .a($$15)
         .a(
            cyc.rY,
            wv.c("advancements.adventure.spyglass_at_dragon.title"),
            wv.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bx.a.a().a($$2, bwb.P), cv.a.a().a($$3, cyc.rY)))
         .a($$1, "adventure/spyglass_at_dragon");
      ah.a.a()
         .a($$5)
         .a(
            cyc.rk,
            wv.c("advancements.adventure.fall_from_world_height.title"),
            wv.c("advancements.adventure.fall_from_world_height.description"),
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
            dkw.ry,
            wv.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wv.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dkw.ru,
            wv.c("advancements.adventure.avoid_vibration.title"),
            wv.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cyc.yz, wv.c("advancements.adventure.salvage_sherd.title"), wv.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ah.a.a()
         .a($$16)
         .a(
            dwd.a(new dwt(Optional.empty(), Optional.of(cyc.ze), Optional.empty(), Optional.of(cyc.za))),
            wv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dv.a.a(
               alc.a(me.br, ald.b("decorated_pot")),
               List.of(cv.a.a().a($$3, axi.bE), cv.a.a().a($$3, axi.bE), cv.a.a().a($$3, axi.bE), cv.a.a().a($$3, axi.bE))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ai $$17 = b(ah.a.a())
         .a($$5)
         .a(
            new cxy(cyc.yC),
            wv.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wv.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cxy(cyc.yO),
            wv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cyc.eQ,
            wv.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wv.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("chiseled_bookshelf", a($$4, dkw.ct))
         .a("comparator", b($$4, dkw.ct))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ah.a.a()
         .a($$5)
         .a(
            cyc.oZ,
            wv.c("advancements.adventure.brush_armadillo.title"),
            wv.c("advancements.adventure.brush_armadillo.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dr.a.a(cv.a.a().a($$3, cyc.yz), Optional.of(bx.a(bx.a.a().a($$2, bwb.e)))))
         .a($$1, "adventure/brush_armadillo");
      ai $$18 = ah.a.a()
         .a($$5)
         .a(
            dkw.rl,
            wv.c("advancements.adventure.minecraft_trials_edition.title"),
            wv.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dt.a.a(di.a.b($$0.e(me.aZ).b(epa.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ah.a.a()
         .a($$18)
         .a(cyc.zy, wv.c("advancements.adventure.lighten_up.title"), wv.c("advancements.adventure.lighten_up.description"), null, ao.a, true, true, false)
         .a("lighten_up", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkw.sR, dkw.sQ, dkw.sP, dkw.sV, dkw.sU, dkw.sT).a(ef.a.a().a(dmi.c, true))), cv.a.a().a($$3, ms.c)))
         .a($$1, "adventure/lighten_up");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(
            cyc.zH,
            wv.c("advancements.adventure.under_lock_and_key.title"),
            wv.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkw.tY).a(ef.a.a().a(dtx.d, false))), cv.a.a().a($$3, cyc.zH)))
         .a($$1, "adventure/under_lock_and_key");
      ah.a.a()
         .a($$19)
         .a(cyc.zI, wv.c("advancements.adventure.revaulting.title"), wv.c("advancements.adventure.revaulting.description"), null, ao.c, true, true, false)
         .a("revaulting", cz.a.a(di.a.a().a(ay.a.a().a($$4, dkw.tY).a(ef.a.a().a(dtx.d, true))), cv.a.a().a($$3, cyc.zI)))
         .a($$1, "adventure/revaulting");
      ah.a.a()
         .a($$18)
         .a(cyc.va, wv.c("advancements.adventure.blowback.title"), wv.c("advancements.adventure.blowback.description"), null, ao.b, true, true, false)
         .a(am.a.a(40))
         .a("blowback", dd.a.a(bx.a.a().a($$2, bwb.r), bm.a.a().a(eh.a(axb.j)).a(bx.a.a().a($$2, bwb.s))))
         .a($$1, "adventure/blowback");
      ah.a.a()
         .a($$5)
         .a(
            cyc.sU,
            wv.c("advancements.adventure.crafters_crafting_crafters.title"),
            wv.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dv.a.b(alc.a(me.br, ald.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ah.a.a()
         .a($$18)
         .a(
            cyc.va,
            wv.c("advancements.adventure.who_needs_rockets.title"),
            wv.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cb.a.a(bo.b(dk.c.b(7.0)), bx.a.a().a($$2, bwb.bG)))
         .a($$1, "adventure/who_needs_rockets");
      ah.a.a()
         .a($$18)
         .a(cyc.ve, wv.c("advancements.adventure.overoverkill.title"), wv.c("advancements.adventure.overoverkill.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("overoverkill", dq.a.a(bl.a.a().a(dk.c.b(100.0)).a(bm.a.a().a(eh.a(axb.H)).a(bx.a.a().a($$2, bwb.bR).a(bu.a.a().f(cv.a.a().a($$3, cyc.ve)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jt<bwb<?>> $$2, List<bwb<?>> $$3) {
      ai $$4 = a(ah.a.a(), $$2, $$3)
         .a($$0)
         .a(cyc.pK, wv.c("advancements.adventure.kill_a_mob.title"), wv.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ah.a.a(), $$2, $$3)
         .a($$4)
         .a(cyc.pP, wv.c("advancements.adventure.kill_all_mobs.title"), wv.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static aq<cz.a> a(jt<dku> $$0, dku $$1) {
      fau.a[] $$2 = dme.e.a().stream().map($$1x -> {
         ef.a $$2x = ef.a.a().a(dme.e, $$1x);
         ay.a $$3 = ay.a.a().a($$0, dkw.hv).a($$2x);
         return fas.a(di.a.a().a($$3), new jj($$1x.g().q()));
      }).toArray(fau.a[]::new);
      return cz.a.a(fat.a($$1), fai.a($$2));
   }

   private static aq<cz.a> b(jt<dku> $$0, dku $$1) {
      fau.a[] $$2 = dme.e.a().stream().map($$2x -> {
         ef.a $$3 = ef.a.a().a(dme.e, $$2x);
         fat.a $$4 = new fat.a(dkw.hv).a($$3);
         fau.a $$5 = fas.a(di.a.a().a(ay.a.a().a($$0, $$1)), new jj($$2x.q()));
         return fah.a($$4, $$5);
      }).toArray(fau.a[]::new);
      return cz.a.a(fai.a($$2));
   }

   private static ah.a a(ah.a $$0) {
      $$0.a(al.a.a);
      Set<cxu> $$1 = Set.of(cyc.yL, cyc.yJ, cyc.yK, cyc.yF, cyc.yO, cyc.yH, cyc.yI, cyc.yM);
      oo.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b().a(), dv.a.a($$1x.b())));
      return $$0;
   }

   private static ah.a b(ah.a $$0) {
      $$0.a(al.a.b);
      oo.b().map(oo.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dv.a.a((alc<dcl<?>>)$$1)));
      return $$0;
   }

   private static ah.a a(jt<cxu> $$0, ah.a $$1) {
      List<Pair<String, aq<dj.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dj.a.a(exh.aY)),
         Pair.of("desert_well", dj.a.a(exh.aX)),
         Pair.of("ocean_ruin_cold", dj.a.a(exh.bc)),
         Pair.of("ocean_ruin_warm", dj.a.a(exh.bb)),
         Pair.of("trail_ruins_rare", dj.a.a(exh.ba)),
         Pair.of("trail_ruins_common", dj.a.a(exh.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (aq<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cj.a.a(cv.a.a().a($$0, axi.bE)));
      $$1.a(new al(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(ju.a $$0, Consumer<ai> $$1, ai $$2, djg.a $$3) {
      a(ah.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cyc.qw,
            wv.c("advancements.adventure.adventuring_time.title"),
            wv.c("advancements.adventure.adventuring_time.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ah.a a(ah.a $$0, jt<bwb<?>> $$1, List<bwb<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(md.f.b($$2x).toString(), dd.a.a(bx.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ah.a a(ah.a $$0, ju.a $$1, List<alc<dis>> $$2) {
      jt<dis> $$3 = $$1.e(me.aM);

      for (alc<dis> $$4 : $$2) {
         $$0.a($$4.a().toString(), dt.a.a(di.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
