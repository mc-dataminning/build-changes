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
   protected static final List<bxn<?>> a = Arrays.asList(
      bxn.p,
      bxn.r,
      bxn.s,
      bxn.w,
      bxn.E,
      bxn.F,
      bxn.L,
      bxn.N,
      bxn.Q,
      bxn.O,
      bxn.P,
      bxn.T,
      bxn.ae,
      bxn.aj,
      bxn.ak,
      bxn.an,
      bxn.aA,
      bxn.aQ,
      bxn.aS,
      bxn.aT,
      bxn.aU,
      bxn.ba,
      bxn.bd,
      bxn.bf,
      bxn.bg,
      bxn.bi,
      bxn.bp,
      bxn.bt,
      bxn.bD,
      bxn.bF,
      bxn.bJ,
      bxn.bL,
      bxn.bK,
      bxn.bO,
      bxn.bR,
      bxn.bP,
      bxn.bS
   );

   private static ar<cu.a> a(cx.d $$0, Optional<bz> $$1) {
      return cu.a.a(Optional.of(bz.a.a().a(bq.c(cx.c.c(30.0))).a(ct.a($$0)).b()), $$1);
   }

   private static ar<ea.a> a(bz.a $$0, cn.a $$1) {
      return ea.a.a(bz.a.a().a(de.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxn<?>> $$2 = $$0.e(mi.B);
      jh<dag> $$3 = $$0.e(mi.K);
      jh<dno> $$4 = $$0.e(mi.i);
      aj $$5 = ai.a.a()
         .a(
            dao.vt,
            xg.c("advancements.adventure.root.title"),
            xg.c("advancements.adventure.root.description"),
            alr.b("gui/advancements/backgrounds/adventure"),
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
         .a(dnq.bu, xg.c("advancements.adventure.sleep_in_bed.title"), xg.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", df.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dma.a.b);
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dao.po, xg.c("advancements.adventure.trade.title"), xg.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dx.a.b())
         .a($$1, "adventure/trade");
      ai.a.a()
         .a($$7)
         .a(
            dao.po,
            xg.c("advancements.adventure.trade_at_world_height.title"),
            xg.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(dao.pj, xg.c("advancements.adventure.shoot_arrow.title"), xg.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(axo.j)).a(bz.a.a().a($$2, axq.f)))))
         .a($$1, "adventure/shoot_arrow");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(dao.xd, xg.c("advancements.adventure.throw_trident.title"), xg.c("advancements.adventure.throw_trident.description"), null, ap.a, true, true, false)
         .a("shot_trident", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(axo.j)).a(bz.a.a().a($$2, bxn.bA)))))
         .a($$1, "adventure/throw_trident");
      ai.a.a()
         .a($$10)
         .a(
            dao.xd,
            xg.c("advancements.adventure.very_very_frightening.title"),
            xg.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", bd.a.a(bz.a.a().a($$2, bxn.bE)))
         .a($$1, "adventure/very_very_frightening");
      ai.a.a()
         .a($$7)
         .a(
            dnq.ev,
            xg.c("advancements.adventure.summon_iron_golem.title"),
            xg.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dt.a.a(bz.a.a().a($$2, bxn.aq)))
         .a($$1, "adventure/summon_iron_golem");
      ai.a.a()
         .a($$9)
         .a(dao.pk, xg.c("advancements.adventure.sniper_duel.title"), xg.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_skeleton", cq.a.a(bz.a.a().a($$2, bxn.bg).a(bq.a(cx.c.b(50.0))), bn.a.a().a(du.a(axo.j))))
         .a($$1, "adventure/sniper_duel");
      ai.a.a()
         .a($$8)
         .a(
            dao.wE,
            xg.c("advancements.adventure.totem_of_undying.title"),
            xg.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", dz.a.a($$3, dao.wE))
         .a($$1, "adventure/totem_of_undying");
      aj $$11 = ai.a.a()
         .a($$5)
         .a(dao.xg, xg.c("advancements.adventure.ol_betsy.title"), xg.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", dk.a.a($$3, dao.xg))
         .a($$1, "adventure/ol_betsy");
      ai.a.a()
         .a($$11)
         .a(
            dao.xg,
            xg.c("advancements.adventure.whos_the_pillager_now.title"),
            xg.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cp.a.a($$3, bz.a.a().a($$2, bxn.aU)))
         .a($$1, "adventure/whos_the_pillager_now");
      ai.a.a()
         .a($$11)
         .a(
            dao.xg,
            xg.c("advancements.adventure.two_birds_one_arrow.title"),
            xg.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(65))
         .a("two_birds", cp.a.a($$3, bz.a.a().a($$2, bxn.aQ), bz.a.a().a($$2, bxn.aQ)))
         .a($$1, "adventure/two_birds_one_arrow");
      ai.a.a()
         .a($$11)
         .a(dao.xg, xg.c("advancements.adventure.arbalistic.title"), xg.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(an.a.a(85))
         .a("arbalistic", cp.a.a($$3, cx.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ji.b<dyd> $$12 = $$0.e(mi.aF);
      aj $$13 = ai.a.a()
         .a($$5)
         .a(
            cty.a($$12),
            xg.c("advancements.adventure.voluntary_exile.title"),
            xg.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cq.a.a(bz.a.a().a($$2, axq.c).a(bw.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ai.a.a()
         .a($$13)
         .a(
            cty.a($$12),
            xg.c("advancements.adventure.hero_of_the_village.title"),
            xg.c("advancements.adventure.hero_of_the_village.description"),
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
            dnq.pO.h(),
            xg.c("advancements.adventure.honey_block_slide.title"),
            xg.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dn.a.a(dnq.pO))
         .a($$1, "adventure/honey_block_slide");
      ai.a.a()
         .a($$9)
         .a(dnq.pL.h(), xg.c("advancements.adventure.bullseye.title"), xg.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("bullseye", dw.a.a(cx.d.a(15), Optional.of(bz.a(bz.a.a().a(bq.a(cx.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ai.a.a()
         .a($$6)
         .a(
            dao.qp,
            xg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", df.a.a($$4, $$3, dnq.rx, dao.qp))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ai.a.a()
         .a($$5)
         .a(
            dao.mB,
            xg.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xg.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cx.d.a(0), Optional.of(bz.a.a().a($$2, bxn.bE).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dao.sf,
            xg.c("advancements.adventure.spyglass_at_parrot.title"),
            xg.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bz.a.a().a($$2, bxn.aP), cn.a.a().a($$3, dao.sf)))
         .a($$1, "adventure/spyglass_at_parrot");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(
            dao.sf,
            xg.c("advancements.adventure.spyglass_at_ghast.title"),
            xg.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bz.a.a().a($$2, bxn.ae), cn.a.a().a($$3, dao.sf)))
         .a($$1, "adventure/spyglass_at_ghast");
      ai.a.a()
         .a($$6)
         .a(
            dao.ft,
            xg.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xg.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", co.a.a(cv.a.a().a(jk.a($$0.e(mi.aG).b(dlt.E))).a(az.a.a().a($$4, dnq.ek)), cn.a.a().a(bo.a.a().a(kv.n, kz.b()).b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ai.a.a()
         .a($$15)
         .a(
            dao.sf,
            xg.c("advancements.adventure.spyglass_at_dragon.title"),
            xg.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bz.a.a().a($$2, bxn.Q), cn.a.a().a($$3, dao.sf)))
         .a($$1, "adventure/spyglass_at_dragon");
      ai.a.a()
         .a($$5)
         .a(
            dao.rp,
            xg.c("advancements.adventure.fall_from_world_height.title"),
            xg.c("advancements.adventure.fall_from_world_height.description"),
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
            dnq.rC,
            xg.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xg.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dnq.ry,
            xg.c("advancements.adventure.avoid_vibration.title"),
            xg.c("advancements.adventure.avoid_vibration.description"),
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
         .a(dao.yG, xg.c("advancements.adventure.salvage_sherd.title"), xg.c("advancements.adventure.salvage_sherd.description"), null, ap.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ai.a.a()
         .a($$16)
         .a(
            dzg.a(new dzw(Optional.empty(), Optional.of(dao.zl), Optional.empty(), Optional.of(dao.zh))),
            xg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dh.a.a(
               alq.a(mi.bv, alr.b("decorated_pot")),
               List.of(cn.a.a().a($$3, axv.bG), cn.a.a().a($$3, axv.bG), cn.a.a().a($$3, axv.bG), cn.a.a().a($$3, axv.bG))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      aj $$17 = b(ai.a.a())
         .a($$5)
         .a(
            new dak(dao.yJ),
            xg.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xg.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new dak(dao.yV),
            xg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            dao.eU,
            xg.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xg.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("chiseled_bookshelf", a($$4, dnq.cw))
         .a("comparator", b($$4, dnq.cw))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ai.a.a()
         .a($$5)
         .a(
            dao.pe,
            xg.c("advancements.adventure.brush_armadillo.title"),
            xg.c("advancements.adventure.brush_armadillo.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dd.a.a(cn.a.a().a($$3, dao.yG), Optional.of(bz.a(bz.a.a().a($$2, bxn.f)))))
         .a($$1, "adventure/brush_armadillo");
      aj $$18 = ai.a.a()
         .a($$5)
         .a(
            dnq.rp,
            xg.c("advancements.adventure.minecraft_trials_edition.title"),
            xg.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", df.a.a(cv.a.b($$0.e(mi.be).b(esh.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ai.a.a()
         .a($$18)
         .a(dao.zF, xg.c("advancements.adventure.lighten_up.title"), xg.c("advancements.adventure.lighten_up.description"), null, ap.a, true, true, false)
         .a("lighten_up", co.a.a(cv.a.a().a(az.a.a().a($$4, dnq.sV, dnq.sU, dnq.sT, dnq.sZ, dnq.sY, dnq.sX).a(ds.a.a().a(dpd.c, true))), cn.a.a().a($$3, mw.c)))
         .a($$1, "adventure/lighten_up");
      aj $$19 = ai.a.a()
         .a($$18)
         .a(
            dao.zO,
            xg.c("advancements.adventure.under_lock_and_key.title"),
            xg.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", co.a.a(cv.a.a().a(az.a.a().a($$4, dnq.uc).a(ds.a.a().a(dwz.d, false))), cn.a.a().a($$3, dao.zO)))
         .a($$1, "adventure/under_lock_and_key");
      ai.a.a()
         .a($$19)
         .a(dao.zP, xg.c("advancements.adventure.revaulting.title"), xg.c("advancements.adventure.revaulting.description"), null, ap.c, true, true, false)
         .a("revaulting", co.a.a(cv.a.a().a(az.a.a().a($$4, dnq.uc).a(ds.a.a().a(dwz.d, true))), cn.a.a().a($$3, dao.zP)))
         .a($$1, "adventure/revaulting");
      ai.a.a()
         .a($$18)
         .a(dao.vh, xg.c("advancements.adventure.blowback.title"), xg.c("advancements.adventure.blowback.description"), null, ap.b, true, true, false)
         .a(an.a.a(40))
         .a("blowback", cq.a.a(bz.a.a().a($$2, bxn.s), bn.a.a().a(du.a(axo.j)).a(bz.a.a().a($$2, bxn.t))))
         .a($$1, "adventure/blowback");
      ai.a.a()
         .a($$5)
         .a(
            dao.tb,
            xg.c("advancements.adventure.crafters_crafting_crafters.title"),
            xg.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dh.a.b(alq.a(mi.bv, alr.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ai.a.a()
         .a($$5)
         .a(dao.xQ, xg.c("advancements.adventure.use_lodestone.title"), xg.c("advancements.adventure.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", co.a.a(cv.a.a().a(az.a.a().a($$4, dnq.pY)), cn.a.a().a($$3, dao.rK)))
         .a($$1, "adventure/use_lodestone");
      ai.a.a()
         .a($$18)
         .a(
            dao.vh,
            xg.c("advancements.adventure.who_needs_rockets.title"),
            xg.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cd.a.a(bq.b(cx.c.b(7.0)), bz.a.a().a($$2, bxn.bI)))
         .a($$1, "adventure/who_needs_rockets");
      ai.a.a()
         .a($$18)
         .a(dao.vl, xg.c("advancements.adventure.overoverkill.title"), xg.c("advancements.adventure.overoverkill.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("overoverkill", dc.a.a(bm.a.a().a(cx.c.b(100.0)).a(bn.a.a().a(du.a(axo.H)).a(bz.a.a().a($$2, bxn.bT).a(bw.a.a().f(cn.a.a().a($$3, dao.vl)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jh<bxn<?>> $$2, List<bxn<?>> $$3) {
      aj $$4 = a(ai.a.a(), $$2, $$3)
         .a($$0)
         .a(dao.pP, xg.c("advancements.adventure.kill_a_mob.title"), xg.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ai.a.a(), $$2, $$3)
         .a($$4)
         .a(dao.pU, xg.c("advancements.adventure.kill_all_mobs.title"), xg.c("advancements.adventure.kill_all_mobs.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ar<co.a> a(jh<dno> $$0, dno $$1) {
      fec.a[] $$2 = doz.e.a().stream().map($$1x -> {
         ds.a $$2x = ds.a.a().a(doz.e, $$1x);
         az.a $$3 = az.a.a().a($$0, dnq.hz).a($$2x);
         return fea.a(cv.a.a().a($$3), new iw($$1x.g().q()));
      }).toArray(fec.a[]::new);
      return co.a.a(feb.a($$1), fdq.a($$2));
   }

   private static ar<co.a> b(jh<dno> $$0, dno $$1) {
      fec.a[] $$2 = doz.e.a().stream().map($$2x -> {
         ds.a $$3 = ds.a.a().a(doz.e, $$2x);
         feb.a $$4 = new feb.a(dnq.hz).a($$3);
         fec.a $$5 = fea.a(cv.a.a().a(az.a.a().a($$0, $$1)), new iw($$2x.q()));
         return fdp.a($$4, $$5);
      }).toArray(fec.a[]::new);
      return co.a.a(fdq.a($$2));
   }

   private static ai.a a(ai.a $$0) {
      $$0.a(am.a.a);
      Set<dag> $$1 = Set.of(dao.yS, dao.yQ, dao.yR, dao.yM, dao.yV, dao.yO, dao.yP, dao.yT);
      os.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), dh.a.a($$1x.c())));
      return $$0;
   }

   private static ai.a b(ai.a $$0) {
      $$0.a(am.a.b);
      os.b().map(os.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dh.a.a((alq<dfb<?>>)$$1)));
      return $$0;
   }

   private static ai.a a(jh<dag> $$0, ai.a $$1) {
      List<Pair<String, ar<cw.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cw.a.a(fap.aY)),
         Pair.of("desert_well", cw.a.a(fap.aX)),
         Pair.of("ocean_ruin_cold", cw.a.a(fap.bc)),
         Pair.of("ocean_ruin_warm", cw.a.a(fap.bb)),
         Pair.of("trail_ruins_rare", cw.a.a(fap.ba)),
         Pair.of("trail_ruins_common", cw.a.a(fap.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ar<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cl.a.a(cn.a.a().a($$0, axv.bG)));
      $$1.a(new am(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(ji.a $$0, Consumer<aj> $$1, aj $$2, dma.a $$3) {
      a(ai.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            dao.qB,
            xg.c("advancements.adventure.adventuring_time.title"),
            xg.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ai.a a(ai.a $$0, jh<bxn<?>> $$1, List<bxn<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mh.f.b($$2x).toString(), cq.a.a(bz.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ai.a a(ai.a $$0, ji.a $$1, List<alq<dlm>> $$2) {
      jh<dlm> $$3 = $$1.e(mi.aG);

      for (alq<dlm> $$4 : $$2) {
         $$0.a($$4.a().toString(), df.a.a(cv.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
