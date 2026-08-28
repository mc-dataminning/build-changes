import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mu implements mr {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bwr<?>> a = Arrays.asList(
      bwr.o,
      bwr.q,
      bwr.r,
      bwr.v,
      bwr.D,
      bwr.E,
      bwr.K,
      bwr.M,
      bwr.P,
      bwr.N,
      bwr.O,
      bwr.S,
      bwr.ad,
      bwr.ai,
      bwr.aj,
      bwr.am,
      bwr.az,
      bwr.aP,
      bwr.aR,
      bwr.aS,
      bwr.aT,
      bwr.aZ,
      bwr.bc,
      bwr.be,
      bwr.bf,
      bwr.bh,
      bwr.bo,
      bwr.bs,
      bwr.bC,
      bwr.bE,
      bwr.bI,
      bwr.bK,
      bwr.bJ,
      bwr.bN,
      bwr.bQ,
      bwr.bO,
      bwr.bR
   );

   private static ar<ct.a> a(cw.d $$0, Optional<by> $$1) {
      return ct.a.a(Optional.of(by.a.a().a(bp.c(cw.c.c(30.0))).a(cs.a($$0)).b()), $$1);
   }

   private static ar<dz.a> a(by.a $$0, cm.a $$1) {
      return dz.a.a(by.a.a().a(dd.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bwr<?>> $$2 = $$0.e(mh.B);
      jg<czg> $$3 = $$0.e(mh.K);
      jg<dmm> $$4 = $$0.e(mh.i);
      aj $$5 = ai.a.a()
         .a(
            czo.vt,
            wy.c("advancements.adventure.root.title"),
            wy.c("advancements.adventure.root.description"),
            alg.b("gui/advancements/backgrounds/adventure"),
            ap.a,
            false,
            false,
            false
         )
         .a(am.a.b)
         .a("killed_something", cp.a.b())
         .a("killed_by_something", cp.a.d())
         .a($$1, "adventure/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dmo.bu, wy.c("advancements.adventure.sleep_in_bed.title"), wy.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", de.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dky.a.b);
      aj $$7 = ai.a.a()
         .a($$5)
         .a(czo.po, wy.c("advancements.adventure.trade.title"), wy.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dw.a.b())
         .a($$1, "adventure/trade");
      ai.a.a()
         .a($$7)
         .a(
            czo.po,
            wy.c("advancements.adventure.trade_at_world_height.title"),
            wy.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dw.a.a(by.a.a().a(cu.a.a(cw.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      aj $$8 = a($$5, $$1, $$2, a);
      aj $$9 = ai.a.a()
         .a($$8)
         .a(czo.pj, wy.c("advancements.adventure.shoot_arrow.title"), wy.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", db.a.a(bm.a.a().a(bn.a.a().a(dt.a(axd.j)).a(by.a.a().a($$2, axf.f)))))
         .a($$1, "adventure/shoot_arrow");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(czo.xd, wy.c("advancements.adventure.throw_trident.title"), wy.c("advancements.adventure.throw_trident.description"), null, ap.a, true, true, false)
         .a("shot_trident", db.a.a(bm.a.a().a(bn.a.a().a(dt.a(axd.j)).a(by.a.a().a($$2, bwr.bz)))))
         .a($$1, "adventure/throw_trident");
      ai.a.a()
         .a($$10)
         .a(
            czo.xd,
            wy.c("advancements.adventure.very_very_frightening.title"),
            wy.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", bd.a.a(by.a.a().a($$2, bwr.bD)))
         .a($$1, "adventure/very_very_frightening");
      ai.a.a()
         .a($$7)
         .a(
            dmo.ev,
            wy.c("advancements.adventure.summon_iron_golem.title"),
            wy.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ds.a.a(by.a.a().a($$2, bwr.ap)))
         .a($$1, "adventure/summon_iron_golem");
      ai.a.a()
         .a($$9)
         .a(czo.pk, wy.c("advancements.adventure.sniper_duel.title"), wy.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_skeleton", cp.a.a(by.a.a().a($$2, bwr.bf).a(bp.a(cw.c.b(50.0))), bn.a.a().a(dt.a(axd.j))))
         .a($$1, "adventure/sniper_duel");
      ai.a.a()
         .a($$8)
         .a(
            czo.wE,
            wy.c("advancements.adventure.totem_of_undying.title"),
            wy.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", dy.a.a($$3, czo.wE))
         .a($$1, "adventure/totem_of_undying");
      aj $$11 = ai.a.a()
         .a($$5)
         .a(czo.xg, wy.c("advancements.adventure.ol_betsy.title"), wy.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", dj.a.a($$3, czo.xg))
         .a($$1, "adventure/ol_betsy");
      ai.a.a()
         .a($$11)
         .a(
            czo.xg,
            wy.c("advancements.adventure.whos_the_pillager_now.title"),
            wy.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", co.a.a($$3, by.a.a().a($$2, bwr.aT)))
         .a($$1, "adventure/whos_the_pillager_now");
      ai.a.a()
         .a($$11)
         .a(
            czo.xg,
            wy.c("advancements.adventure.two_birds_one_arrow.title"),
            wy.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(65))
         .a("two_birds", co.a.a($$3, by.a.a().a($$2, bwr.aP), by.a.a().a($$2, bwr.aP)))
         .a($$1, "adventure/two_birds_one_arrow");
      ai.a.a()
         .a($$11)
         .a(czo.xg, wy.c("advancements.adventure.arbalistic.title"), wy.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(an.a.a(85))
         .a("arbalistic", co.a.a($$3, cw.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jh.b<dxb> $$12 = $$0.e(mh.aF);
      aj $$13 = ai.a.a()
         .a($$5)
         .a(
            csz.a($$12),
            wy.c("advancements.adventure.voluntary_exile.title"),
            wy.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cp.a.a(by.a.a().a($$2, axf.c).a(bv.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ai.a.a()
         .a($$13)
         .a(
            csz.a($$12),
            wy.c("advancements.adventure.hero_of_the_village.title"),
            wy.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ap.b,
            true,
            true,
            true
         )
         .a(an.a.a(100))
         .a("hero_of_the_village", de.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ai.a.a()
         .a($$5)
         .a(
            dmo.pO.h(),
            wy.c("advancements.adventure.honey_block_slide.title"),
            wy.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dm.a.a(dmo.pO))
         .a($$1, "adventure/honey_block_slide");
      ai.a.a()
         .a($$9)
         .a(dmo.pL.h(), wy.c("advancements.adventure.bullseye.title"), wy.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("bullseye", dv.a.a(cw.d.a(15), Optional.of(by.a(by.a.a().a(bp.a(cw.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ai.a.a()
         .a($$6)
         .a(
            czo.qp,
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", de.a.a($$4, $$3, dmo.rx, czo.qp))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ai.a.a()
         .a($$5)
         .a(
            czo.mB,
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cw.d.a(0), Optional.of(by.a.a().a($$2, bwr.bD).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            czo.sf,
            wy.c("advancements.adventure.spyglass_at_parrot.title"),
            wy.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(by.a.a().a($$2, bwr.aO), cm.a.a().a($$3, czo.sf)))
         .a($$1, "adventure/spyglass_at_parrot");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(
            czo.sf,
            wy.c("advancements.adventure.spyglass_at_ghast.title"),
            wy.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(by.a.a().a($$2, bwr.ad), cm.a.a().a($$3, czo.sf)))
         .a($$1, "adventure/spyglass_at_ghast");
      ai.a.a()
         .a($$6)
         .a(
            czo.ft,
            wy.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wy.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cn.a.a(cu.a.a().a(jj.a($$0.e(mh.aG).b(dkr.E))).a(az.a.a().a($$4, dmo.ek)), cm.a.a().a(ku.n, ky.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ai.a.a()
         .a($$15)
         .a(
            czo.sf,
            wy.c("advancements.adventure.spyglass_at_dragon.title"),
            wy.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(by.a.a().a($$2, bwr.P), cm.a.a().a($$3, czo.sf)))
         .a($$1, "adventure/spyglass_at_dragon");
      ai.a.a()
         .a($$5)
         .a(
            czo.rp,
            wy.c("advancements.adventure.fall_from_world_height.title"),
            wy.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bq.a.a(by.a.a().a(cu.a.a(cw.c.c(-59.0))), bp.b(cw.c.b(379.0)), cu.a.a(cw.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ai.a.a()
         .a($$8)
         .a(
            dmo.rC,
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cp.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ai.a.a()
         .a($$5)
         .a(
            dmo.ry,
            wy.c("advancements.adventure.avoid_vibration.title"),
            wy.c("advancements.adventure.avoid_vibration.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", de.a.d())
         .a($$1, "adventure/avoid_vibration");
      aj $$16 = a($$3, ai.a.a())
         .a($$5)
         .a(czo.yG, wy.c("advancements.adventure.salvage_sherd.title"), wy.c("advancements.adventure.salvage_sherd.description"), null, ap.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ai.a.a()
         .a($$16)
         .a(
            dye.a(new dyu(Optional.empty(), Optional.of(czo.zl), Optional.empty(), Optional.of(czo.zh))),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dg.a.a(
               alf.a(mh.bu, alg.b("decorated_pot")),
               List.of(cm.a.a().a($$3, axk.bF), cm.a.a().a($$3, axk.bF), cm.a.a().a($$3, axk.bF), cm.a.a().a($$3, axk.bF))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      aj $$17 = b(ai.a.a())
         .a($$5)
         .a(
            new czk(czo.yJ),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ai.a.a())
         .a($$17)
         .a(
            new czk(czo.yV),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ai.a.a()
         .a($$5)
         .a(
            czo.eU,
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("chiseled_bookshelf", a($$4, dmo.cw))
         .a("comparator", b($$4, dmo.cw))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ai.a.a()
         .a($$5)
         .a(
            czo.pe,
            wy.c("advancements.adventure.brush_armadillo.title"),
            wy.c("advancements.adventure.brush_armadillo.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dc.a.a(cm.a.a().a($$3, czo.yG), Optional.of(by.a(by.a.a().a($$2, bwr.e)))))
         .a($$1, "adventure/brush_armadillo");
      aj $$18 = ai.a.a()
         .a($$5)
         .a(
            dmo.rp,
            wy.c("advancements.adventure.minecraft_trials_edition.title"),
            wy.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", de.a.a(cu.a.b($$0.e(mh.be).b(erc.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ai.a.a()
         .a($$18)
         .a(czo.zF, wy.c("advancements.adventure.lighten_up.title"), wy.c("advancements.adventure.lighten_up.description"), null, ap.a, true, true, false)
         .a("lighten_up", cn.a.a(cu.a.a().a(az.a.a().a($$4, dmo.sV, dmo.sU, dmo.sT, dmo.sZ, dmo.sY, dmo.sX).a(dr.a.a().a(dob.c, true))), cm.a.a().a($$3, mv.c)))
         .a($$1, "adventure/lighten_up");
      aj $$19 = ai.a.a()
         .a($$18)
         .a(
            czo.zO,
            wy.c("advancements.adventure.under_lock_and_key.title"),
            wy.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cn.a.a(cu.a.a().a(az.a.a().a($$4, dmo.uc).a(dr.a.a().a(dvx.d, false))), cm.a.a().a($$3, czo.zO)))
         .a($$1, "adventure/under_lock_and_key");
      ai.a.a()
         .a($$19)
         .a(czo.zP, wy.c("advancements.adventure.revaulting.title"), wy.c("advancements.adventure.revaulting.description"), null, ap.c, true, true, false)
         .a("revaulting", cn.a.a(cu.a.a().a(az.a.a().a($$4, dmo.uc).a(dr.a.a().a(dvx.d, true))), cm.a.a().a($$3, czo.zP)))
         .a($$1, "adventure/revaulting");
      ai.a.a()
         .a($$18)
         .a(czo.vh, wy.c("advancements.adventure.blowback.title"), wy.c("advancements.adventure.blowback.description"), null, ap.b, true, true, false)
         .a(an.a.a(40))
         .a("blowback", cp.a.a(by.a.a().a($$2, bwr.r), bn.a.a().a(dt.a(axd.j)).a(by.a.a().a($$2, bwr.s))))
         .a($$1, "adventure/blowback");
      ai.a.a()
         .a($$5)
         .a(
            czo.tb,
            wy.c("advancements.adventure.crafters_crafting_crafters.title"),
            wy.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dg.a.b(alf.a(mh.bu, alg.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ai.a.a()
         .a($$5)
         .a(czo.xQ, wy.c("advancements.adventure.use_lodestone.title"), wy.c("advancements.adventure.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", cn.a.a(cu.a.a().a(az.a.a().a($$4, dmo.pY)), cm.a.a().a($$3, czo.rK)))
         .a($$1, "adventure/use_lodestone");
      ai.a.a()
         .a($$18)
         .a(
            czo.vh,
            wy.c("advancements.adventure.who_needs_rockets.title"),
            wy.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cc.a.a(bp.b(cw.c.b(7.0)), by.a.a().a($$2, bwr.bH)))
         .a($$1, "adventure/who_needs_rockets");
      ai.a.a()
         .a($$18)
         .a(czo.vl, wy.c("advancements.adventure.overoverkill.title"), wy.c("advancements.adventure.overoverkill.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("overoverkill", db.a.a(bm.a.a().a(cw.c.b(100.0)).a(bn.a.a().a(dt.a(axd.H)).a(by.a.a().a($$2, bwr.bS).a(bv.a.a().f(cm.a.a().a($$3, czo.vl)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jg<bwr<?>> $$2, List<bwr<?>> $$3) {
      aj $$4 = a(ai.a.a(), $$2, $$3)
         .a($$0)
         .a(czo.pP, wy.c("advancements.adventure.kill_a_mob.title"), wy.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ai.a.a(), $$2, $$3)
         .a($$4)
         .a(czo.pU, wy.c("advancements.adventure.kill_all_mobs.title"), wy.c("advancements.adventure.kill_all_mobs.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ar<cn.a> a(jg<dmm> $$0, dmm $$1) {
      fcx.a[] $$2 = dnx.e.a().stream().map($$1x -> {
         dr.a $$2x = dr.a.a().a(dnx.e, $$1x);
         az.a $$3 = az.a.a().a($$0, dmo.hz).a($$2x);
         return fcv.a(cu.a.a().a($$3), new iv($$1x.g().q()));
      }).toArray(fcx.a[]::new);
      return cn.a.a(fcw.a($$1), fcl.a($$2));
   }

   private static ar<cn.a> b(jg<dmm> $$0, dmm $$1) {
      fcx.a[] $$2 = dnx.e.a().stream().map($$2x -> {
         dr.a $$3 = dr.a.a().a(dnx.e, $$2x);
         fcw.a $$4 = new fcw.a(dmo.hz).a($$3);
         fcx.a $$5 = fcv.a(cu.a.a().a(az.a.a().a($$0, $$1)), new iv($$2x.q()));
         return fck.a($$4, $$5);
      }).toArray(fcx.a[]::new);
      return cn.a.a(fcl.a($$2));
   }

   private static ai.a a(ai.a $$0) {
      $$0.a(am.a.a);
      Set<czg> $$1 = Set.of(czo.yS, czo.yQ, czo.yR, czo.yM, czo.yV, czo.yO, czo.yP, czo.yT);
      or.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), dg.a.a($$1x.c())));
      return $$0;
   }

   private static ai.a b(ai.a $$0) {
      $$0.a(am.a.b);
      or.b().map(or.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dg.a.a((alf<deb<?>>)$$1)));
      return $$0;
   }

   private static ai.a a(jg<czg> $$0, ai.a $$1) {
      List<Pair<String, ar<cv.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cv.a.a(ezk.aY)),
         Pair.of("desert_well", cv.a.a(ezk.aX)),
         Pair.of("ocean_ruin_cold", cv.a.a(ezk.bc)),
         Pair.of("ocean_ruin_warm", cv.a.a(ezk.bb)),
         Pair.of("trail_ruins_rare", cv.a.a(ezk.ba)),
         Pair.of("trail_ruins_common", cv.a.a(ezk.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ar<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ck.a.a(cm.a.a().a($$0, axk.bF)));
      $$1.a(new am(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jh.a $$0, Consumer<aj> $$1, aj $$2, dky.a $$3) {
      a(ai.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            czo.qB,
            wy.c("advancements.adventure.adventuring_time.title"),
            wy.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ai.a a(ai.a $$0, jg<bwr<?>> $$1, List<bwr<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mg.f.b($$2x).toString(), cp.a.a(by.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ai.a a(ai.a $$0, jh.a $$1, List<alf<dkk>> $$2) {
      jg<dkk> $$3 = $$1.e(mh.aG);

      for (alf<dkk> $$4 : $$2) {
         $$0.a($$4.a().toString(), de.a.a(cu.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
