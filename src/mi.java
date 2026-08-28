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
   protected static final List<btv<?>> a = Arrays.asList(
      btv.i,
      btv.l,
      btv.m,
      btv.q,
      btv.x,
      btv.B,
      btv.D,
      btv.F,
      btv.H,
      btv.I,
      btv.J,
      btv.T,
      btv.Y,
      btv.Z,
      btv.ac,
      btv.ap,
      btv.ay,
      btv.aA,
      btv.aB,
      btv.aC,
      btv.aH,
      btv.aK,
      btv.aM,
      btv.aN,
      btv.aP,
      btv.aW,
      btv.aY,
      btv.bi,
      btv.bk,
      btv.bo,
      btv.bq,
      btv.bp,
      btv.bt,
      btv.bw,
      btv.bu,
      btv.bx
   );

   private static ao<de.a> a(dh.d $$0, Optional<bv> $$1) {
      return de.a.a(Optional.of(bv.a.a().a(bm.c(dh.c.c(30.0))).a(dd.a($$0)).b()), $$1);
   }

   private static ao<ej.a> a(bv.a $$0, cs.a $$1) {
      return ej.a.a(bv.a.a().a(dp.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btv<?>> $$2 = $$0.b(lv.z);
      jo<cvk> $$3 = $$0.b(lv.K);
      jo<dhj> $$4 = $$0.b(lv.f);
      ag $$5 = af.a.a()
         .a(
            cvt.ul,
            xd.c("advancements.adventure.root.title"),
            xd.c("advancements.adventure.root.description"),
            alc.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dhl.bn, xd.c("advancements.adventure.sleep_in_bed.title"), xd.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dq.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dfv.a.b);
      ag $$7 = af.a.a()
         .a($$5)
         .a(cvt.oB, xd.c("advancements.adventure.trade.title"), xd.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", eg.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$7)
         .a(
            cvt.oB,
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
         .a(cvt.ow, xd.c("advancements.adventure.shoot_arrow.title"), xd.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awv.j)).a(bv.a.a().a($$2, awx.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$10 = af.a.a()
         .a($$8)
         .a(cvt.vU, xd.c("advancements.adventure.throw_trident.title"), xd.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awv.j)).a(bv.a.a().a($$2, btv.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$10)
         .a(
            cvt.vU,
            xd.c("advancements.adventure.very_very_frightening.title"),
            xd.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a($$2, btv.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$7)
         .a(
            dhl.ee,
            xd.c("advancements.adventure.summon_iron_golem.title"),
            xd.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ec.a.a(bv.a.a().a($$2, btv.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$9)
         .a(cvt.ox, xd.c("advancements.adventure.sniper_duel.title"), xd.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", da.a.a(bv.a.a().a($$2, btv.aN).a(bm.a(dh.c.b(50.0))), bk.a.a().a(ed.a(awv.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$8)
         .a(
            cvt.vv,
            xd.c("advancements.adventure.totem_of_undying.title"),
            xd.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ei.a.a($$3, cvt.vv))
         .a($$1, "adventure/totem_of_undying");
      ag $$11 = af.a.a()
         .a($$5)
         .a(cvt.vX, xd.c("advancements.adventure.ol_betsy.title"), xd.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", du.a.a($$3, cvt.vX))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$11)
         .a(
            cvt.vX,
            xd.c("advancements.adventure.whos_the_pillager_now.title"),
            xd.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cz.a.a(bv.a.a().a($$2, btv.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$11)
         .a(
            cvt.vX,
            xd.c("advancements.adventure.two_birds_one_arrow.title"),
            xd.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cz.a.a(bv.a.a().a($$2, btv.ay), bv.a.a().a($$2, btv.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$11)
         .a(cvt.vX, xd.c("advancements.adventure.arbalistic.title"), xd.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cz.a.a(dh.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jp.b<dri> $$12 = $$0.b(lv.d);
      ag $$13 = af.a.a()
         .a($$5)
         .a(
            cpi.a($$12),
            xd.c("advancements.adventure.voluntary_exile.title"),
            xd.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", da.a.a(bv.a.a().a($$2, awx.c).a(bs.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$13)
         .a(
            cpi.a($$12),
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
            dhl.pg.q(),
            xd.c("advancements.adventure.honey_block_slide.title"),
            xd.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dx.a.a(dhl.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$9)
         .a(dhl.pd.q(), xd.c("advancements.adventure.bullseye.title"), xd.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", ef.a.a(dh.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(dh.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$6)
         .a(
            cvt.pC,
            xd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dq.a.a($$4, $$3, dhl.qP, cvt.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$5)
         .a(
            cvt.lX,
            xd.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xd.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dh.d.a(0), Optional.of(bv.a.a().a($$2, btv.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cvt.qY,
            xd.c("advancements.adventure.spyglass_at_parrot.title"),
            xd.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bv.a.a().a($$2, btv.ax), cs.a.a().a($$3, cvt.qY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$15 = af.a.a()
         .a($$14)
         .a(
            cvt.qY,
            xd.c("advancements.adventure.spyglass_at_ghast.title"),
            xd.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bv.a.a().a($$2, btv.T), cs.a.a().a($$3, cvt.qY)))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$6)
         .a(
            cvt.eY,
            xd.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xd.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cw.a.a(df.a.a().a(jr.a($$0.b(lv.aG).b(dfo.D))).a(aw.a.a().a($$4, dhl.dT)), cs.a.a().a(cu.n, cq.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$15)
         .a(
            cvt.qY,
            xd.c("advancements.adventure.spyglass_at_dragon.title"),
            xd.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bv.a.a().a($$2, btv.F), cs.a.a().a($$3, cvt.qY)))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$5)
         .a(
            cvt.qA,
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
            dhl.qU,
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
            dhl.qQ,
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
         .a(cvt.xx, xd.c("advancements.adventure.salvage_sherd.title"), xd.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$16)
         .a(
            dsi.a(new dsy(Optional.empty(), Optional.of(cvt.yc), Optional.empty(), Optional.of(cvt.xY))),
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
            ds.a.a(alc.b("decorated_pot"), List.of(cs.a.a().a($$3, axc.bt), cs.a.a().a($$3, axc.bt), cs.a.a().a($$3, axc.bt), cs.a.a().a($$3, axc.bt)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$17 = b(af.a.a())
         .a($$5)
         .a(
            new cvp(cvt.xA),
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
            new cvp(cvt.xM),
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
            cvt.eB,
            xd.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xd.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a($$4, dhl.cm))
         .a("comparator", b($$4, dhl.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$5)
         .a(
            cvt.or,
            xd.c("advancements.adventure.brush_armadillo.title"),
            xd.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dn.a.a(cs.a.a().a($$3, cvt.xx), Optional.of(bv.a(bv.a.a().a($$2, btv.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$18 = af.a.a()
         .a($$5)
         .a(
            dhl.qH,
            xd.c("advancements.adventure.minecraft_trials_edition.title"),
            xd.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dq.a.a(df.a.b($$0.b(lv.aS).b(ekw.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$18)
         .a(cvt.yw, xd.c("advancements.adventure.lighten_up.title"), xd.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cw.a.a(df.a.a().a(aw.a.a().a($$4, dhl.sn, dhl.sm, dhl.sl, dhl.sr, dhl.sq, dhl.sp).a(eb.a.a().a(dix.c, true))), cs.a.a().a($$3, mj.c)))
         .a($$1, "adventure/lighten_up");
      ag $$19 = af.a.a()
         .a($$18)
         .a(
            cvt.yF,
            xd.c("advancements.adventure.under_lock_and_key.title"),
            xd.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cw.a.a(df.a.a().a(aw.a.a().a($$4, dhl.ts).a(eb.a.a().a(dqf.d, false))), cs.a.a().a($$3, cvt.yF)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$19)
         .a(cvt.yG, xd.c("advancements.adventure.revaulting.title"), xd.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cw.a.a(df.a.a().a(aw.a.a().a($$4, dhl.ts).a(eb.a.a().a(dqf.d, true))), cs.a.a().a($$3, cvt.yG)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$18)
         .a(cvt.tZ, xd.c("advancements.adventure.blowback.title"), xd.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", da.a.a(bv.a.a().a($$2, btv.m), bk.a.a().a(ed.a(awv.j)).a(bv.a.a().a($$2, btv.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$5)
         .a(
            cvt.rU,
            xd.c("advancements.adventure.crafters_crafting_crafters.title"),
            xd.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", ds.a.b(alc.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$18)
         .a(
            cvt.tZ,
            xd.c("advancements.adventure.who_needs_rockets.title"),
            xd.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(dh.c.b(7.0)), bv.a.a().a($$2, btv.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$18)
         .a(cvt.ud, xd.c("advancements.adventure.overoverkill.title"), xd.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dm.a.a(bj.a.a().a(dh.c.b(100.0)).a(bk.a.a().a(ed.a(awv.H)).a(bv.a.a().a($$2, btv.by).a(bs.a.a().f(cs.a.a().a($$3, cvt.ud)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jo<btv<?>> $$2, List<btv<?>> $$3) {
      ag $$4 = a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(cvt.pc, xd.c("advancements.adventure.kill_a_mob.title"), xd.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2, $$3)
         .a($$4)
         .a(cvt.ph, xd.c("advancements.adventure.kill_all_mobs.title"), xd.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ao<cw.a> a(jo<dhj> $$0, dhj $$1) {
      ews.a[] $$2 = dit.aF.a().stream().map($$1x -> {
         eb.a $$2x = eb.a.a().a(dit.aF, $$1x);
         aw.a $$3 = aw.a.a().a($$0, dhl.gY).a($$2x);
         return ewq.a(df.a.a().a($$3), new je($$1x.g().q()));
      }).toArray(ews.a[]::new);
      return cw.a.a(ewr.a($$1), ewg.a($$2));
   }

   private static ao<cw.a> b(jo<dhj> $$0, dhj $$1) {
      ews.a[] $$2 = dit.aF.a().stream().map($$2x -> {
         eb.a $$3 = eb.a.a().a(dit.aF, $$2x);
         ewr.a $$4 = new ewr.a(dhl.gY).a($$3);
         ews.a $$5 = ewq.a(df.a.a().a(aw.a.a().a($$0, $$1)), new je($$2x.q()));
         return ewf.a($$4, $$5);
      }).toArray(ews.a[]::new);
      return cw.a.a(ewg.a($$2));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cvk> $$1 = Set.of(cvt.xJ, cvt.xH, cvt.xI, cvt.xD, cvt.xM, cvt.xF, cvt.xG, cvt.xK);
      pb.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ds.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      pb.b().map(pb.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ds.a.a($$1)));
      return $$0;
   }

   private static af.a a(jo<cvk> $$0, af.a $$1) {
      List<Pair<String, ao<dg.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dg.a.a(etd.aT)),
         Pair.of("desert_well", dg.a.a(etd.aS)),
         Pair.of("ocean_ruin_cold", dg.a.a(etd.aX)),
         Pair.of("ocean_ruin_warm", dg.a.a(etd.aW)),
         Pair.of("trail_ruins_rare", dg.a.a(etd.aV)),
         Pair.of("trail_ruins_common", dg.a.a(etd.aU))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cg.a.a(cs.a.a().a($$0, axc.bt)));
      $$1.a(new aj(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jp.a $$0, Consumer<ag> $$1, ag $$2, dfv.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cvt.pO,
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

   private static af.a a(af.a $$0, jo<btv<?>> $$1, List<btv<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lu.f.b($$2x).toString(), da.a.a(bv.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jp.a $$1, List<alb<dfh>> $$2) {
      jo<dfh> $$3 = $$1.b(lv.aG);

      for (alb<dfh> $$4 : $$2) {
         $$0.a($$4.a().toString(), dq.a.a(df.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
