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
   protected static final List<bxc<?>> a = Arrays.asList(
      bxc.p,
      bxc.r,
      bxc.s,
      bxc.w,
      bxc.E,
      bxc.F,
      bxc.L,
      bxc.N,
      bxc.Q,
      bxc.O,
      bxc.P,
      bxc.T,
      bxc.ae,
      bxc.aj,
      bxc.ak,
      bxc.an,
      bxc.aA,
      bxc.aQ,
      bxc.aS,
      bxc.aT,
      bxc.aU,
      bxc.ba,
      bxc.bd,
      bxc.bf,
      bxc.bg,
      bxc.bi,
      bxc.bp,
      bxc.bt,
      bxc.bD,
      bxc.bF,
      bxc.bJ,
      bxc.bL,
      bxc.bK,
      bxc.bO,
      bxc.bR,
      bxc.bP,
      bxc.bS
   );

   private static ar<ct.a> a(cw.d $$0, Optional<by> $$1) {
      return ct.a.a(Optional.of(by.a.a().a(bp.c(cw.c.c(30.0))).a(cs.a($$0)).b()), $$1);
   }

   private static ar<dz.a> a(by.a $$0, cm.a $$1) {
      return dz.a.a(by.a.a().a(dd.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bxc<?>> $$2 = $$0.e(mh.B);
      jg<czu> $$3 = $$0.e(mh.K);
      jg<dnc> $$4 = $$0.e(mh.i);
      aj $$5 = ai.a.a()
         .a(
            dac.vt,
            xa.c("advancements.adventure.root.title"),
            xa.c("advancements.adventure.root.description"),
            ali.b("gui/advancements/backgrounds/adventure"),
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
         .a(dne.bu, xa.c("advancements.adventure.sleep_in_bed.title"), xa.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", de.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dlo.a.b);
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dac.po, xa.c("advancements.adventure.trade.title"), xa.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dw.a.b())
         .a($$1, "adventure/trade");
      ai.a.a()
         .a($$7)
         .a(
            dac.po,
            xa.c("advancements.adventure.trade_at_world_height.title"),
            xa.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(dac.pj, xa.c("advancements.adventure.shoot_arrow.title"), xa.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", db.a.a(bm.a.a().a(bn.a.a().a(dt.a(axf.j)).a(by.a.a().a($$2, axh.f)))))
         .a($$1, "adventure/shoot_arrow");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(dac.xd, xa.c("advancements.adventure.throw_trident.title"), xa.c("advancements.adventure.throw_trident.description"), null, ap.a, true, true, false)
         .a("shot_trident", db.a.a(bm.a.a().a(bn.a.a().a(dt.a(axf.j)).a(by.a.a().a($$2, bxc.bA)))))
         .a($$1, "adventure/throw_trident");
      ai.a.a()
         .a($$10)
         .a(
            dac.xd,
            xa.c("advancements.adventure.very_very_frightening.title"),
            xa.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", bd.a.a(by.a.a().a($$2, bxc.bE)))
         .a($$1, "adventure/very_very_frightening");
      ai.a.a()
         .a($$7)
         .a(
            dne.ev,
            xa.c("advancements.adventure.summon_iron_golem.title"),
            xa.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ds.a.a(by.a.a().a($$2, bxc.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ai.a.a()
         .a($$9)
         .a(dac.pk, xa.c("advancements.adventure.sniper_duel.title"), xa.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_skeleton", cp.a.a(by.a.a().a($$2, bxc.bg).a(bp.a(cw.c.b(50.0))), bn.a.a().a(dt.a(axf.j))))
         .a($$1, "adventure/sniper_duel");
      ai.a.a()
         .a($$8)
         .a(
            dac.wE,
            xa.c("advancements.adventure.totem_of_undying.title"),
            xa.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", dy.a.a($$3, dac.wE))
         .a($$1, "adventure/totem_of_undying");
      aj $$11 = ai.a.a()
         .a($$5)
         .a(dac.xg, xa.c("advancements.adventure.ol_betsy.title"), xa.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", dj.a.a($$3, dac.xg))
         .a($$1, "adventure/ol_betsy");
      ai.a.a()
         .a($$11)
         .a(
            dac.xg,
            xa.c("advancements.adventure.whos_the_pillager_now.title"),
            xa.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", co.a.a($$3, by.a.a().a($$2, bxc.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ai.a.a()
         .a($$11)
         .a(
            dac.xg,
            xa.c("advancements.adventure.two_birds_one_arrow.title"),
            xa.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(65))
         .a("two_birds", co.a.a($$3, by.a.a().a($$2, bxc.aQ), by.a.a().a($$2, bxc.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ai.a.a()
         .a($$11)
         .a(dac.xg, xa.c("advancements.adventure.arbalistic.title"), xa.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(an.a.a(85))
         .a("arbalistic", co.a.a($$3, cw.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jh.b<dxr> $$12 = $$0.e(mh.aF);
      aj $$13 = ai.a.a()
         .a($$5)
         .a(
            ctn.a($$12),
            xa.c("advancements.adventure.voluntary_exile.title"),
            xa.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cp.a.a(by.a.a().a($$2, axh.c).a(bv.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ai.a.a()
         .a($$13)
         .a(
            ctn.a($$12),
            xa.c("advancements.adventure.hero_of_the_village.title"),
            xa.c("advancements.adventure.hero_of_the_village.description"),
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
            dne.pO.h(),
            xa.c("advancements.adventure.honey_block_slide.title"),
            xa.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dm.a.a(dne.pO))
         .a($$1, "adventure/honey_block_slide");
      ai.a.a()
         .a($$9)
         .a(dne.pL.h(), xa.c("advancements.adventure.bullseye.title"), xa.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("bullseye", dv.a.a(cw.d.a(15), Optional.of(by.a(by.a.a().a(bp.a(cw.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ai.a.a()
         .a($$6)
         .a(
            dac.qp,
            xa.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xa.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", de.a.a($$4, $$3, dne.rx, dac.qp))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ai.a.a()
         .a($$5)
         .a(
            dac.mB,
            xa.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xa.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cw.d.a(0), Optional.of(by.a.a().a($$2, bxc.bE).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dac.sf,
            xa.c("advancements.adventure.spyglass_at_parrot.title"),
            xa.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(by.a.a().a($$2, bxc.aP), cm.a.a().a($$3, dac.sf)))
         .a($$1, "adventure/spyglass_at_parrot");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(
            dac.sf,
            xa.c("advancements.adventure.spyglass_at_ghast.title"),
            xa.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(by.a.a().a($$2, bxc.ae), cm.a.a().a($$3, dac.sf)))
         .a($$1, "adventure/spyglass_at_ghast");
      ai.a.a()
         .a($$6)
         .a(
            dac.ft,
            xa.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xa.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cn.a.a(cu.a.a().a(jj.a($$0.e(mh.aG).b(dlh.E))).a(az.a.a().a($$4, dne.ek)), cm.a.a().a(ku.n, ky.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ai.a.a()
         .a($$15)
         .a(
            dac.sf,
            xa.c("advancements.adventure.spyglass_at_dragon.title"),
            xa.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(by.a.a().a($$2, bxc.Q), cm.a.a().a($$3, dac.sf)))
         .a($$1, "adventure/spyglass_at_dragon");
      ai.a.a()
         .a($$5)
         .a(
            dac.rp,
            xa.c("advancements.adventure.fall_from_world_height.title"),
            xa.c("advancements.adventure.fall_from_world_height.description"),
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
            dne.rC,
            xa.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xa.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dne.ry,
            xa.c("advancements.adventure.avoid_vibration.title"),
            xa.c("advancements.adventure.avoid_vibration.description"),
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
         .a(dac.yG, xa.c("advancements.adventure.salvage_sherd.title"), xa.c("advancements.adventure.salvage_sherd.description"), null, ap.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ai.a.a()
         .a($$16)
         .a(
            dyu.a(new dzk(Optional.empty(), Optional.of(dac.zl), Optional.empty(), Optional.of(dac.zh))),
            xa.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xa.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dg.a.a(
               alh.a(mh.bv, ali.b("decorated_pot")),
               List.of(cm.a.a().a($$3, axm.bF), cm.a.a().a($$3, axm.bF), cm.a.a().a($$3, axm.bF), cm.a.a().a($$3, axm.bF))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      aj $$17 = b(ai.a.a())
         .a($$5)
         .a(
            new czy(dac.yJ),
            xa.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xa.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new czy(dac.yV),
            xa.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xa.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            dac.eU,
            xa.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xa.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("chiseled_bookshelf", a($$4, dne.cw))
         .a("comparator", b($$4, dne.cw))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ai.a.a()
         .a($$5)
         .a(
            dac.pe,
            xa.c("advancements.adventure.brush_armadillo.title"),
            xa.c("advancements.adventure.brush_armadillo.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dc.a.a(cm.a.a().a($$3, dac.yG), Optional.of(by.a(by.a.a().a($$2, bxc.f)))))
         .a($$1, "adventure/brush_armadillo");
      aj $$18 = ai.a.a()
         .a($$5)
         .a(
            dne.rp,
            xa.c("advancements.adventure.minecraft_trials_edition.title"),
            xa.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", de.a.a(cu.a.b($$0.e(mh.be).b(erv.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ai.a.a()
         .a($$18)
         .a(dac.zF, xa.c("advancements.adventure.lighten_up.title"), xa.c("advancements.adventure.lighten_up.description"), null, ap.a, true, true, false)
         .a("lighten_up", cn.a.a(cu.a.a().a(az.a.a().a($$4, dne.sV, dne.sU, dne.sT, dne.sZ, dne.sY, dne.sX).a(dr.a.a().a(dor.c, true))), cm.a.a().a($$3, mv.c)))
         .a($$1, "adventure/lighten_up");
      aj $$19 = ai.a.a()
         .a($$18)
         .a(
            dac.zO,
            xa.c("advancements.adventure.under_lock_and_key.title"),
            xa.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cn.a.a(cu.a.a().a(az.a.a().a($$4, dne.uc).a(dr.a.a().a(dwn.d, false))), cm.a.a().a($$3, dac.zO)))
         .a($$1, "adventure/under_lock_and_key");
      ai.a.a()
         .a($$19)
         .a(dac.zP, xa.c("advancements.adventure.revaulting.title"), xa.c("advancements.adventure.revaulting.description"), null, ap.c, true, true, false)
         .a("revaulting", cn.a.a(cu.a.a().a(az.a.a().a($$4, dne.uc).a(dr.a.a().a(dwn.d, true))), cm.a.a().a($$3, dac.zP)))
         .a($$1, "adventure/revaulting");
      ai.a.a()
         .a($$18)
         .a(dac.vh, xa.c("advancements.adventure.blowback.title"), xa.c("advancements.adventure.blowback.description"), null, ap.b, true, true, false)
         .a(an.a.a(40))
         .a("blowback", cp.a.a(by.a.a().a($$2, bxc.s), bn.a.a().a(dt.a(axf.j)).a(by.a.a().a($$2, bxc.t))))
         .a($$1, "adventure/blowback");
      ai.a.a()
         .a($$5)
         .a(
            dac.tb,
            xa.c("advancements.adventure.crafters_crafting_crafters.title"),
            xa.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dg.a.b(alh.a(mh.bv, ali.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ai.a.a()
         .a($$5)
         .a(dac.xQ, xa.c("advancements.adventure.use_lodestone.title"), xa.c("advancements.adventure.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", cn.a.a(cu.a.a().a(az.a.a().a($$4, dne.pY)), cm.a.a().a($$3, dac.rK)))
         .a($$1, "adventure/use_lodestone");
      ai.a.a()
         .a($$18)
         .a(
            dac.vh,
            xa.c("advancements.adventure.who_needs_rockets.title"),
            xa.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cc.a.a(bp.b(cw.c.b(7.0)), by.a.a().a($$2, bxc.bI)))
         .a($$1, "adventure/who_needs_rockets");
      ai.a.a()
         .a($$18)
         .a(dac.vl, xa.c("advancements.adventure.overoverkill.title"), xa.c("advancements.adventure.overoverkill.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("overoverkill", db.a.a(bm.a.a().a(cw.c.b(100.0)).a(bn.a.a().a(dt.a(axf.H)).a(by.a.a().a($$2, bxc.bT).a(bv.a.a().f(cm.a.a().a($$3, dac.vl)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jg<bxc<?>> $$2, List<bxc<?>> $$3) {
      aj $$4 = a(ai.a.a(), $$2, $$3)
         .a($$0)
         .a(dac.pP, xa.c("advancements.adventure.kill_a_mob.title"), xa.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ai.a.a(), $$2, $$3)
         .a($$4)
         .a(dac.pU, xa.c("advancements.adventure.kill_all_mobs.title"), xa.c("advancements.adventure.kill_all_mobs.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ar<cn.a> a(jg<dnc> $$0, dnc $$1) {
      fdq.a[] $$2 = don.e.a().stream().map($$1x -> {
         dr.a $$2x = dr.a.a().a(don.e, $$1x);
         az.a $$3 = az.a.a().a($$0, dne.hz).a($$2x);
         return fdo.a(cu.a.a().a($$3), new iv($$1x.g().q()));
      }).toArray(fdq.a[]::new);
      return cn.a.a(fdp.a($$1), fde.a($$2));
   }

   private static ar<cn.a> b(jg<dnc> $$0, dnc $$1) {
      fdq.a[] $$2 = don.e.a().stream().map($$2x -> {
         dr.a $$3 = dr.a.a().a(don.e, $$2x);
         fdp.a $$4 = new fdp.a(dne.hz).a($$3);
         fdq.a $$5 = fdo.a(cu.a.a().a(az.a.a().a($$0, $$1)), new iv($$2x.q()));
         return fdd.a($$4, $$5);
      }).toArray(fdq.a[]::new);
      return cn.a.a(fde.a($$2));
   }

   private static ai.a a(ai.a $$0) {
      $$0.a(am.a.a);
      Set<czu> $$1 = Set.of(dac.yS, dac.yQ, dac.yR, dac.yM, dac.yV, dac.yO, dac.yP, dac.yT);
      or.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), dg.a.a($$1x.c())));
      return $$0;
   }

   private static ai.a b(ai.a $$0) {
      $$0.a(am.a.b);
      or.b().map(or.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dg.a.a((alh<dep<?>>)$$1)));
      return $$0;
   }

   private static ai.a a(jg<czu> $$0, ai.a $$1) {
      List<Pair<String, ar<cv.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cv.a.a(fad.aY)),
         Pair.of("desert_well", cv.a.a(fad.aX)),
         Pair.of("ocean_ruin_cold", cv.a.a(fad.bc)),
         Pair.of("ocean_ruin_warm", cv.a.a(fad.bb)),
         Pair.of("trail_ruins_rare", cv.a.a(fad.ba)),
         Pair.of("trail_ruins_common", cv.a.a(fad.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ar<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ck.a.a(cm.a.a().a($$0, axm.bF)));
      $$1.a(new am(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jh.a $$0, Consumer<aj> $$1, aj $$2, dlo.a $$3) {
      a(ai.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            dac.qB,
            xa.c("advancements.adventure.adventuring_time.title"),
            xa.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ai.a a(ai.a $$0, jg<bxc<?>> $$1, List<bxc<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mg.f.b($$2x).toString(), cp.a.a(by.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ai.a a(ai.a $$0, jh.a $$1, List<alh<dla>> $$2) {
      jg<dla> $$3 = $$1.e(mh.aG);

      for (alh<dla> $$4 : $$2) {
         $$0.a($$4.a().toString(), de.a.a(cu.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
