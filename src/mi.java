import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mi implements mf {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<btq<?>> a = Arrays.asList(
      btq.i,
      btq.l,
      btq.m,
      btq.q,
      btq.x,
      btq.B,
      btq.D,
      btq.F,
      btq.H,
      btq.I,
      btq.J,
      btq.T,
      btq.Y,
      btq.Z,
      btq.ac,
      btq.ap,
      btq.ay,
      btq.aA,
      btq.aB,
      btq.aC,
      btq.aH,
      btq.aK,
      btq.aM,
      btq.aN,
      btq.aP,
      btq.aW,
      btq.aY,
      btq.bi,
      btq.bk,
      btq.bo,
      btq.bq,
      btq.bp,
      btq.bt,
      btq.bw,
      btq.bu,
      btq.bx
   );

   private static ao<de.a> a(dh.d $$0, Optional<bv> $$1) {
      return de.a.a(Optional.of(bv.a.a().a(bm.c(dh.c.c(30.0))).a(dd.a($$0)).b()), $$1);
   }

   private static ao<ej.a> a(bv.a $$0, cs.a $$1) {
      return ej.a.a(bv.a.a().a(dp.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btq<?>> $$2 = $$0.b(lv.z);
      jo<cvg> $$3 = $$0.b(lv.K);
      jo<dgv> $$4 = $$0.b(lv.f);
      ag $$5 = af.a.a()
         .a(
            cvo.ul,
            xd.c("advancements.adventure.root.title"),
            xd.c("advancements.adventure.root.description"),
            alb.b("textures/gui/advancements/backgrounds/adventure.png"),
            am.a,
            false,
            false,
            false
         )
         .a(aj.a.b)
         .a("killed_something", da.a.b())
         .a("killed_by_something", da.a.d())
         .a($$1, "adventure/root");
      ag $$6 = af.a.a()
         .a($$5)
         .a(dgx.bn, xd.c("advancements.adventure.sleep_in_bed.title"), xd.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dq.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dfh.a.b);
      ag $$7 = af.a.a()
         .a($$5)
         .a(cvo.oB, xd.c("advancements.adventure.trade.title"), xd.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", eg.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$7)
         .a(
            cvo.oB,
            xd.c("advancements.adventure.trade_at_world_height.title"),
            xd.c("advancements.adventure.trade_at_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", eg.a.a(bv.a.a().a(df.a.a(dh.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ag $$8 = a($$5, $$1, $$2, a);
      ag $$9 = af.a.a()
         .a($$8)
         .a(cvo.ow, xd.c("advancements.adventure.shoot_arrow.title"), xd.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awu.j)).a(bv.a.a().a($$2, aww.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$10 = af.a.a()
         .a($$8)
         .a(cvo.vU, xd.c("advancements.adventure.throw_trident.title"), xd.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awu.j)).a(bv.a.a().a($$2, btq.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$10)
         .a(
            cvo.vU,
            xd.c("advancements.adventure.very_very_frightening.title"),
            xd.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a($$2, btq.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$7)
         .a(
            dgx.ee,
            xd.c("advancements.adventure.summon_iron_golem.title"),
            xd.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ec.a.a(bv.a.a().a($$2, btq.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$9)
         .a(cvo.ox, xd.c("advancements.adventure.sniper_duel.title"), xd.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", da.a.a(bv.a.a().a($$2, btq.aN).a(bm.a(dh.c.b(50.0))), bk.a.a().a(ed.a(awu.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$8)
         .a(
            cvo.vv,
            xd.c("advancements.adventure.totem_of_undying.title"),
            xd.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ei.a.a($$3, cvo.vv))
         .a($$1, "adventure/totem_of_undying");
      ag $$11 = af.a.a()
         .a($$5)
         .a(cvo.vX, xd.c("advancements.adventure.ol_betsy.title"), xd.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", du.a.a($$3, cvo.vX))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$11)
         .a(
            cvo.vX,
            xd.c("advancements.adventure.whos_the_pillager_now.title"),
            xd.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cz.a.a(bv.a.a().a($$2, btq.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$11)
         .a(
            cvo.vX,
            xd.c("advancements.adventure.two_birds_one_arrow.title"),
            xd.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cz.a.a(bv.a.a().a($$2, btq.ay), bv.a.a().a($$2, btq.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$11)
         .a(cvo.vX, xd.c("advancements.adventure.arbalistic.title"), xd.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cz.a.a(dh.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jp.b<dqu> $$12 = $$0.b(lv.d);
      ag $$13 = af.a.a()
         .a($$5)
         .a(
            cpc.a($$12),
            xd.c("advancements.adventure.voluntary_exile.title"),
            xd.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", da.a.a(bv.a.a().a($$2, aww.c).a(bs.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$13)
         .a(
            cpc.a($$12),
            xd.c("advancements.adventure.hero_of_the_village.title"),
            xd.c("advancements.adventure.hero_of_the_village.description"),
            null,
            am.b,
            true,
            true,
            true
         )
         .a(ak.a.a(100))
         .a("hero_of_the_village", dq.a.c())
         .a($$1, "adventure/hero_of_the_village");
      af.a.a()
         .a($$5)
         .a(
            dgx.pg.r(),
            xd.c("advancements.adventure.honey_block_slide.title"),
            xd.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dx.a.a(dgx.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$9)
         .a(dgx.pd.r(), xd.c("advancements.adventure.bullseye.title"), xd.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", ef.a.a(dh.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(dh.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$6)
         .a(
            cvo.pC,
            xd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dq.a.a($$4, $$3, dgx.qP, cvo.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$5)
         .a(
            cvo.lX,
            xd.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xd.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dh.d.a(0), Optional.of(bv.a.a().a($$2, btq.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cvo.qY,
            xd.c("advancements.adventure.spyglass_at_parrot.title"),
            xd.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bv.a.a().a($$2, btq.ax), cs.a.a().a($$3, cvo.qY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$15 = af.a.a()
         .a($$14)
         .a(
            cvo.qY,
            xd.c("advancements.adventure.spyglass_at_ghast.title"),
            xd.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bv.a.a().a($$2, btq.T), cs.a.a().a($$3, cvo.qY)))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$6)
         .a(
            cvo.eY,
            xd.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xd.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cw.a.a(df.a.a().a(jr.a($$0.b(lv.aF).b(dfa.D))).a(aw.a.a().a($$4, dgx.dT)), cs.a.a().a(cu.n, cq.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$15)
         .a(
            cvo.qY,
            xd.c("advancements.adventure.spyglass_at_dragon.title"),
            xd.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bv.a.a().a($$2, btq.F), cs.a.a().a($$3, cvo.qY)))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$5)
         .a(
            cvo.qA,
            xd.c("advancements.adventure.fall_from_world_height.title"),
            xd.c("advancements.adventure.fall_from_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bn.a.a(bv.a.a().a(df.a.a(dh.c.c(-59.0))), bm.b(dh.c.b(379.0)), df.a.a(dh.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      af.a.a()
         .a($$8)
         .a(
            dgx.qU,
            xd.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xd.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", da.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      af.a.a()
         .a($$5)
         .a(
            dgx.qQ,
            xd.c("advancements.adventure.avoid_vibration.title"),
            xd.c("advancements.adventure.avoid_vibration.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dq.a.d())
         .a($$1, "adventure/avoid_vibration");
      ag $$16 = a($$3, af.a.a())
         .a($$5)
         .a(cvo.xx, xd.c("advancements.adventure.salvage_sherd.title"), xd.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$16)
         .a(
            dru.a(new dsk(Optional.empty(), Optional.of(cvo.yc), Optional.empty(), Optional.of(cvo.xY))),
            xd.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xd.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ds.a.a(alb.b("decorated_pot"), List.of(cs.a.a().a($$3, axb.bt), cs.a.a().a($$3, axb.bt), cs.a.a().a($$3, axb.bt), cs.a.a().a($$3, axb.bt)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$17 = b(af.a.a())
         .a($$5)
         .a(
            new cvl(cvo.xA),
            xd.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xd.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(af.a.a())
         .a($$17)
         .a(
            new cvl(cvo.xM),
            xd.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xd.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      af.a.a()
         .a($$5)
         .a(
            cvo.eB,
            xd.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xd.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a($$4, dgx.cm))
         .a("comparator", b($$4, dgx.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$5)
         .a(
            cvo.or,
            xd.c("advancements.adventure.brush_armadillo.title"),
            xd.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dn.a.a(cs.a.a().a($$3, cvo.xx), Optional.of(bv.a(bv.a.a().a($$2, btq.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$18 = af.a.a()
         .a($$5)
         .a(
            dgx.qH,
            xd.c("advancements.adventure.minecraft_trials_edition.title"),
            xd.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dq.a.a(df.a.b($$0.b(lv.aR).b(eki.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$18)
         .a(cvo.yw, xd.c("advancements.adventure.lighten_up.title"), xd.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cw.a.a(df.a.a().a(aw.a.a().a($$4, dgx.sn, dgx.sm, dgx.sl, dgx.sr, dgx.sq, dgx.sp).a(eb.a.a().a(dij.c, true))), cs.a.a().a($$3, mj.c)))
         .a($$1, "adventure/lighten_up");
      ag $$19 = af.a.a()
         .a($$18)
         .a(
            cvo.yF,
            xd.c("advancements.adventure.under_lock_and_key.title"),
            xd.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cw.a.a(df.a.a().a(aw.a.a().a($$4, dgx.ts).a(eb.a.a().a(dpr.d, false))), cs.a.a().a($$3, cvo.yF)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$19)
         .a(cvo.yG, xd.c("advancements.adventure.revaulting.title"), xd.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cw.a.a(df.a.a().a(aw.a.a().a($$4, dgx.ts).a(eb.a.a().a(dpr.d, true))), cs.a.a().a($$3, cvo.yG)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$18)
         .a(cvo.tZ, xd.c("advancements.adventure.blowback.title"), xd.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", da.a.a(bv.a.a().a($$2, btq.m), bk.a.a().a(ed.a(awu.j)).a(bv.a.a().a($$2, btq.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$5)
         .a(
            cvo.rU,
            xd.c("advancements.adventure.crafters_crafting_crafters.title"),
            xd.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", ds.a.b(alb.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$18)
         .a(
            cvo.tZ,
            xd.c("advancements.adventure.who_needs_rockets.title"),
            xd.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(dh.c.b(7.0)), bv.a.a().a($$2, btq.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$18)
         .a(cvo.ud, xd.c("advancements.adventure.overoverkill.title"), xd.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dm.a.a(bj.a.a().a(dh.c.b(100.0)).a(bk.a.a().a(ed.a(awu.H)).a(bv.a.a().a($$2, btq.by).a(bs.a.a().f(cs.a.a().a($$3, cvo.ud)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jo<btq<?>> $$2, List<btq<?>> $$3) {
      ag $$4 = a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(cvo.pc, xd.c("advancements.adventure.kill_a_mob.title"), xd.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2, $$3)
         .a($$4)
         .a(cvo.ph, xd.c("advancements.adventure.kill_all_mobs.title"), xd.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ao<cw.a> a(jo<dgv> $$0, dgv $$1) {
      ewe.a[] $$2 = dif.aE.a().stream().map($$1x -> {
         eb.a $$2x = eb.a.a().a(dif.aE, $$1x);
         aw.a $$3 = aw.a.a().a($$0, dgx.gY).a($$2x);
         return ewc.a(df.a.a().a($$3), new je($$1x.g().q()));
      }).toArray(ewe.a[]::new);
      return cw.a.a(ewd.a($$1), evs.a($$2));
   }

   private static ao<cw.a> b(jo<dgv> $$0, dgv $$1) {
      ewe.a[] $$2 = dif.aE.a().stream().map($$2x -> {
         eb.a $$3 = eb.a.a().a(dif.aE, $$2x);
         ewd.a $$4 = new ewd.a(dgx.gY).a($$3);
         ewe.a $$5 = ewc.a(df.a.a().a(aw.a.a().a($$0, $$1)), new je($$2x.q()));
         return evr.a($$4, $$5);
      }).toArray(ewe.a[]::new);
      return cw.a.a(evs.a($$2));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cvg> $$1 = Set.of(cvo.xJ, cvo.xH, cvo.xI, cvo.xD, cvo.xM, cvo.xF, cvo.xG, cvo.xK);
      pb.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ds.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      pb.b().map(pb.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ds.a.a($$1)));
      return $$0;
   }

   private static af.a a(jo<cvg> $$0, af.a $$1) {
      List<Pair<String, ao<dg.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dg.a.a(esp.aT)),
         Pair.of("desert_well", dg.a.a(esp.aS)),
         Pair.of("ocean_ruin_cold", dg.a.a(esp.aX)),
         Pair.of("ocean_ruin_warm", dg.a.a(esp.aW)),
         Pair.of("trail_ruins_rare", dg.a.a(esp.aV)),
         Pair.of("trail_ruins_common", dg.a.a(esp.aU))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cg.a.a(cs.a.a().a($$0, axb.bt)));
      $$1.a(new aj(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jp.a $$0, Consumer<ag> $$1, ag $$2, dfh.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cvo.pO,
            xd.c("advancements.adventure.adventuring_time.title"),
            xd.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, jo<btq<?>> $$1, List<btq<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lu.f.b($$2x).toString(), da.a.a(bv.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jp.a $$1, List<ala<det>> $$2) {
      jo<det> $$3 = $$1.b(lv.aF);

      for (ala<det> $$4 : $$2) {
         $$0.a($$4.a().toString(), dq.a.a(df.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
