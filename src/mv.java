import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mv implements ms {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bxe<?>> a = Arrays.asList(
      bxe.p,
      bxe.r,
      bxe.s,
      bxe.w,
      bxe.E,
      bxe.F,
      bxe.L,
      bxe.N,
      bxe.Q,
      bxe.O,
      bxe.P,
      bxe.T,
      bxe.ae,
      bxe.aj,
      bxe.ak,
      bxe.an,
      bxe.aA,
      bxe.aQ,
      bxe.aS,
      bxe.aT,
      bxe.aU,
      bxe.ba,
      bxe.bd,
      bxe.bf,
      bxe.bg,
      bxe.bi,
      bxe.bp,
      bxe.bt,
      bxe.bD,
      bxe.bF,
      bxe.bJ,
      bxe.bL,
      bxe.bK,
      bxe.bO,
      bxe.bR,
      bxe.bP,
      bxe.bS
   );

   private static ar<cu.a> a(cx.d $$0, Optional<bz> $$1) {
      return cu.a.a(Optional.of(bz.a.a().a(bq.c(cx.c.c(30.0))).a(ct.a($$0)).b()), $$1);
   }

   private static ar<ea.a> a(bz.a $$0, cn.a $$1) {
      return ea.a.a(bz.a.a().a(de.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxe<?>> $$2 = $$0.e(mi.B);
      jh<czw> $$3 = $$0.e(mi.K);
      jh<dne> $$4 = $$0.e(mi.i);
      aj $$5 = ai.a.a()
         .a(
            dae.vt,
            xc.c("advancements.adventure.root.title"),
            xc.c("advancements.adventure.root.description"),
            alk.b("gui/advancements/backgrounds/adventure"),
            ap.a,
            false,
            false,
            false
         )
         .a(am.a.b)
         .a("killed_something", cq.a.b())
         .a("killed_by_something", cq.a.d())
         .a($$1, "adventure/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dng.bu, xc.c("advancements.adventure.sleep_in_bed.title"), xc.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", df.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dlq.a.b);
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dae.po, xc.c("advancements.adventure.trade.title"), xc.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dx.a.b())
         .a($$1, "adventure/trade");
      ai.a.a()
         .a($$7)
         .a(
            dae.po,
            xc.c("advancements.adventure.trade_at_world_height.title"),
            xc.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dx.a.a(bz.a.a().a(cv.a.a(cx.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      aj $$8 = a($$5, $$1, $$2, a);
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dae.pj, xc.c("advancements.adventure.shoot_arrow.title"), xc.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(axh.j)).a(bz.a.a().a($$2, axj.f)))))
         .a($$1, "adventure/shoot_arrow");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(dae.xd, xc.c("advancements.adventure.throw_trident.title"), xc.c("advancements.adventure.throw_trident.description"), null, ap.a, true, true, false)
         .a("shot_trident", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(axh.j)).a(bz.a.a().a($$2, bxe.bA)))))
         .a($$1, "adventure/throw_trident");
      ai.a.a()
         .a($$10)
         .a(
            dae.xd,
            xc.c("advancements.adventure.very_very_frightening.title"),
            xc.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", bd.a.a(bz.a.a().a($$2, bxe.bE)))
         .a($$1, "adventure/very_very_frightening");
      ai.a.a()
         .a($$7)
         .a(
            dng.ev,
            xc.c("advancements.adventure.summon_iron_golem.title"),
            xc.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dt.a.a(bz.a.a().a($$2, bxe.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ai.a.a()
         .a($$9)
         .a(dae.pk, xc.c("advancements.adventure.sniper_duel.title"), xc.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_skeleton", cq.a.a(bz.a.a().a($$2, bxe.bg).a(bq.a(cx.c.b(50.0))), bn.a.a().a(du.a(axh.j))))
         .a($$1, "adventure/sniper_duel");
      ai.a.a()
         .a($$8)
         .a(
            dae.wE,
            xc.c("advancements.adventure.totem_of_undying.title"),
            xc.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", dz.a.a($$3, dae.wE))
         .a($$1, "adventure/totem_of_undying");
      aj $$11 = ai.a.a()
         .a($$5)
         .a(dae.xg, xc.c("advancements.adventure.ol_betsy.title"), xc.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", dk.a.a($$3, dae.xg))
         .a($$1, "adventure/ol_betsy");
      ai.a.a()
         .a($$11)
         .a(
            dae.xg,
            xc.c("advancements.adventure.whos_the_pillager_now.title"),
            xc.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cp.a.a($$3, bz.a.a().a($$2, bxe.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ai.a.a()
         .a($$11)
         .a(
            dae.xg,
            xc.c("advancements.adventure.two_birds_one_arrow.title"),
            xc.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(65))
         .a("two_birds", cp.a.a($$3, bz.a.a().a($$2, bxe.aQ), bz.a.a().a($$2, bxe.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ai.a.a()
         .a($$11)
         .a(dae.xg, xc.c("advancements.adventure.arbalistic.title"), xc.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(an.a.a(85))
         .a("arbalistic", cp.a.a($$3, cx.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ji.b<dxt> $$12 = $$0.e(mi.aF);
      aj $$13 = ai.a.a()
         .a($$5)
         .a(
            ctp.a($$12),
            xc.c("advancements.adventure.voluntary_exile.title"),
            xc.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cq.a.a(bz.a.a().a($$2, axj.c).a(bw.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ai.a.a()
         .a($$13)
         .a(
            ctp.a($$12),
            xc.c("advancements.adventure.hero_of_the_village.title"),
            xc.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ap.b,
            true,
            true,
            true
         )
         .a(an.a.a(100))
         .a("hero_of_the_village", df.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ai.a.a()
         .a($$5)
         .a(
            dng.pO.h(),
            xc.c("advancements.adventure.honey_block_slide.title"),
            xc.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dn.a.a(dng.pO))
         .a($$1, "adventure/honey_block_slide");
      ai.a.a()
         .a($$9)
         .a(dng.pL.h(), xc.c("advancements.adventure.bullseye.title"), xc.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("bullseye", dw.a.a(cx.d.a(15), Optional.of(bz.a(bz.a.a().a(bq.a(cx.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ai.a.a()
         .a($$6)
         .a(
            dae.qp,
            xc.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xc.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", df.a.a($$4, $$3, dng.rx, dae.qp))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ai.a.a()
         .a($$5)
         .a(
            dae.mB,
            xc.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xc.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cx.d.a(0), Optional.of(bz.a.a().a($$2, bxe.bE).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dae.sf,
            xc.c("advancements.adventure.spyglass_at_parrot.title"),
            xc.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bz.a.a().a($$2, bxe.aP), cn.a.a().a($$3, dae.sf)))
         .a($$1, "adventure/spyglass_at_parrot");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(
            dae.sf,
            xc.c("advancements.adventure.spyglass_at_ghast.title"),
            xc.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bz.a.a().a($$2, bxe.ae), cn.a.a().a($$3, dae.sf)))
         .a($$1, "adventure/spyglass_at_ghast");
      ai.a.a()
         .a($$6)
         .a(
            dae.ft,
            xc.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xc.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", co.a.a(cv.a.a().a(jk.a($$0.e(mi.aG).b(dlj.E))).a(az.a.a().a($$4, dng.ek)), cn.a.a().a(bo.a.a().a(kv.n, kz.b()).b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ai.a.a()
         .a($$15)
         .a(
            dae.sf,
            xc.c("advancements.adventure.spyglass_at_dragon.title"),
            xc.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bz.a.a().a($$2, bxe.Q), cn.a.a().a($$3, dae.sf)))
         .a($$1, "adventure/spyglass_at_dragon");
      ai.a.a()
         .a($$5)
         .a(
            dae.rp,
            xc.c("advancements.adventure.fall_from_world_height.title"),
            xc.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", br.a.a(bz.a.a().a(cv.a.a(cx.c.c(-59.0))), bq.b(cx.c.b(379.0)), cv.a.a(cx.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ai.a.a()
         .a($$8)
         .a(
            dng.rC,
            xc.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xc.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cq.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ai.a.a()
         .a($$5)
         .a(
            dng.ry,
            xc.c("advancements.adventure.avoid_vibration.title"),
            xc.c("advancements.adventure.avoid_vibration.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", df.a.d())
         .a($$1, "adventure/avoid_vibration");
      aj $$16 = a($$3, ai.a.a())
         .a($$5)
         .a(dae.yG, xc.c("advancements.adventure.salvage_sherd.title"), xc.c("advancements.adventure.salvage_sherd.description"), null, ap.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ai.a.a()
         .a($$16)
         .a(
            dyw.a(new dzm(Optional.empty(), Optional.of(dae.zl), Optional.empty(), Optional.of(dae.zh))),
            xc.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xc.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dh.a.a(
               alj.a(mi.bv, alk.b("decorated_pot")),
               List.of(cn.a.a().a($$3, axo.bG), cn.a.a().a($$3, axo.bG), cn.a.a().a($$3, axo.bG), cn.a.a().a($$3, axo.bG))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      aj $$17 = b(ai.a.a())
         .a($$5)
         .a(
            new daa(dae.yJ),
            xc.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xc.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new daa(dae.yV),
            xc.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xc.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            dae.eU,
            xc.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xc.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("chiseled_bookshelf", a($$4, dng.cw))
         .a("comparator", b($$4, dng.cw))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ai.a.a()
         .a($$5)
         .a(
            dae.pe,
            xc.c("advancements.adventure.brush_armadillo.title"),
            xc.c("advancements.adventure.brush_armadillo.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dd.a.a(cn.a.a().a($$3, dae.yG), Optional.of(bz.a(bz.a.a().a($$2, bxe.f)))))
         .a($$1, "adventure/brush_armadillo");
      aj $$18 = ai.a.a()
         .a($$5)
         .a(
            dng.rp,
            xc.c("advancements.adventure.minecraft_trials_edition.title"),
            xc.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", df.a.a(cv.a.b($$0.e(mi.be).b(erx.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ai.a.a()
         .a($$18)
         .a(dae.zF, xc.c("advancements.adventure.lighten_up.title"), xc.c("advancements.adventure.lighten_up.description"), null, ap.a, true, true, false)
         .a("lighten_up", co.a.a(cv.a.a().a(az.a.a().a($$4, dng.sV, dng.sU, dng.sT, dng.sZ, dng.sY, dng.sX).a(ds.a.a().a(dot.c, true))), cn.a.a().a($$3, mw.c)))
         .a($$1, "adventure/lighten_up");
      aj $$19 = ai.a.a()
         .a($$18)
         .a(
            dae.zO,
            xc.c("advancements.adventure.under_lock_and_key.title"),
            xc.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", co.a.a(cv.a.a().a(az.a.a().a($$4, dng.uc).a(ds.a.a().a(dwp.d, false))), cn.a.a().a($$3, dae.zO)))
         .a($$1, "adventure/under_lock_and_key");
      ai.a.a()
         .a($$19)
         .a(dae.zP, xc.c("advancements.adventure.revaulting.title"), xc.c("advancements.adventure.revaulting.description"), null, ap.c, true, true, false)
         .a("revaulting", co.a.a(cv.a.a().a(az.a.a().a($$4, dng.uc).a(ds.a.a().a(dwp.d, true))), cn.a.a().a($$3, dae.zP)))
         .a($$1, "adventure/revaulting");
      ai.a.a()
         .a($$18)
         .a(dae.vh, xc.c("advancements.adventure.blowback.title"), xc.c("advancements.adventure.blowback.description"), null, ap.b, true, true, false)
         .a(an.a.a(40))
         .a("blowback", cq.a.a(bz.a.a().a($$2, bxe.s), bn.a.a().a(du.a(axh.j)).a(bz.a.a().a($$2, bxe.t))))
         .a($$1, "adventure/blowback");
      ai.a.a()
         .a($$5)
         .a(
            dae.tb,
            xc.c("advancements.adventure.crafters_crafting_crafters.title"),
            xc.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dh.a.b(alj.a(mi.bv, alk.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ai.a.a()
         .a($$5)
         .a(dae.xQ, xc.c("advancements.adventure.use_lodestone.title"), xc.c("advancements.adventure.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", co.a.a(cv.a.a().a(az.a.a().a($$4, dng.pY)), cn.a.a().a($$3, dae.rK)))
         .a($$1, "adventure/use_lodestone");
      ai.a.a()
         .a($$18)
         .a(
            dae.vh,
            xc.c("advancements.adventure.who_needs_rockets.title"),
            xc.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cd.a.a(bq.b(cx.c.b(7.0)), bz.a.a().a($$2, bxe.bI)))
         .a($$1, "adventure/who_needs_rockets");
      ai.a.a()
         .a($$18)
         .a(dae.vl, xc.c("advancements.adventure.overoverkill.title"), xc.c("advancements.adventure.overoverkill.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("overoverkill", dc.a.a(bm.a.a().a(cx.c.b(100.0)).a(bn.a.a().a(du.a(axh.H)).a(bz.a.a().a($$2, bxe.bT).a(bw.a.a().f(cn.a.a().a($$3, dae.vl)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jh<bxe<?>> $$2, List<bxe<?>> $$3) {
      aj $$4 = a(ai.a.a(), $$2, $$3)
         .a($$0)
         .a(dae.pP, xc.c("advancements.adventure.kill_a_mob.title"), xc.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ai.a.a(), $$2, $$3)
         .a($$4)
         .a(dae.pU, xc.c("advancements.adventure.kill_all_mobs.title"), xc.c("advancements.adventure.kill_all_mobs.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ar<co.a> a(jh<dne> $$0, dne $$1) {
      fds.a[] $$2 = dop.e.a().stream().map($$1x -> {
         ds.a $$2x = ds.a.a().a(dop.e, $$1x);
         az.a $$3 = az.a.a().a($$0, dng.hz).a($$2x);
         return fdq.a(cv.a.a().a($$3), new iw($$1x.g().q()));
      }).toArray(fds.a[]::new);
      return co.a.a(fdr.a($$1), fdg.a($$2));
   }

   private static ar<co.a> b(jh<dne> $$0, dne $$1) {
      fds.a[] $$2 = dop.e.a().stream().map($$2x -> {
         ds.a $$3 = ds.a.a().a(dop.e, $$2x);
         fdr.a $$4 = new fdr.a(dng.hz).a($$3);
         fds.a $$5 = fdq.a(cv.a.a().a(az.a.a().a($$0, $$1)), new iw($$2x.q()));
         return fdf.a($$4, $$5);
      }).toArray(fds.a[]::new);
      return co.a.a(fdg.a($$2));
   }

   private static ai.a a(ai.a $$0) {
      $$0.a(am.a.a);
      Set<czw> $$1 = Set.of(dae.yS, dae.yQ, dae.yR, dae.yM, dae.yV, dae.yO, dae.yP, dae.yT);
      os.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), dh.a.a($$1x.c())));
      return $$0;
   }

   private static ai.a b(ai.a $$0) {
      $$0.a(am.a.b);
      os.b().map(os.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dh.a.a((alj<der<?>>)$$1)));
      return $$0;
   }

   private static ai.a a(jh<czw> $$0, ai.a $$1) {
      List<Pair<String, ar<cw.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cw.a.a(faf.aY)),
         Pair.of("desert_well", cw.a.a(faf.aX)),
         Pair.of("ocean_ruin_cold", cw.a.a(faf.bc)),
         Pair.of("ocean_ruin_warm", cw.a.a(faf.bb)),
         Pair.of("trail_ruins_rare", cw.a.a(faf.ba)),
         Pair.of("trail_ruins_common", cw.a.a(faf.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ar<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cl.a.a(cn.a.a().a($$0, axo.bG)));
      $$1.a(new am(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(ji.a $$0, Consumer<aj> $$1, aj $$2, dlq.a $$3) {
      a(ai.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            dae.qB,
            xc.c("advancements.adventure.adventuring_time.title"),
            xc.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ai.a a(ai.a $$0, jh<bxe<?>> $$1, List<bxe<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mh.f.b($$2x).toString(), cq.a.a(bz.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ai.a a(ai.a $$0, ji.a $$1, List<alj<dlc>> $$2) {
      jh<dlc> $$3 = $$1.e(mi.aG);

      for (alj<dlc> $$4 : $$2) {
         $$0.a($$4.a().toString(), df.a.a(cv.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
