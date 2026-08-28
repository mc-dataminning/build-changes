import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mj implements mg {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bty<?>> a = Arrays.asList(
      bty.i,
      bty.l,
      bty.m,
      bty.q,
      bty.x,
      bty.B,
      bty.D,
      bty.F,
      bty.H,
      bty.I,
      bty.J,
      bty.T,
      bty.Y,
      bty.Z,
      bty.ac,
      bty.ap,
      bty.ay,
      bty.aA,
      bty.aB,
      bty.aC,
      bty.aH,
      bty.aK,
      bty.aM,
      bty.aN,
      bty.aP,
      bty.aW,
      bty.aY,
      bty.bi,
      bty.bk,
      bty.bo,
      bty.bq,
      bty.bp,
      bty.bt,
      bty.bw,
      bty.bu,
      bty.bx
   );

   private static ao<de.a> a(dh.d $$0, Optional<bv> $$1) {
      return de.a.a(Optional.of(bv.a.a().a(bm.c(dh.c.c(30.0))).a(dd.a($$0)).b()), $$1);
   }

   private static ao<ek.a> a(bv.a $$0, cs.a $$1) {
      return ek.a.a(bv.a.a().a(dp.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jq.a $$0, Consumer<ag> $$1) {
      jp<bty<?>> $$2 = $$0.d(lw.z);
      jp<cvn> $$3 = $$0.d(lw.K);
      jp<dhm> $$4 = $$0.d(lw.f);
      ag $$5 = af.a.a()
         .a(
            cvw.ul,
            xe.c("advancements.adventure.root.title"),
            xe.c("advancements.adventure.root.description"),
            ale.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dho.bn, xe.c("advancements.adventure.sleep_in_bed.title"), xe.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dq.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dfy.a.b);
      ag $$7 = af.a.a()
         .a($$5)
         .a(cvw.oB, xe.c("advancements.adventure.trade.title"), xe.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", eh.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$7)
         .a(
            cvw.oB,
            xe.c("advancements.adventure.trade_at_world_height.title"),
            xe.c("advancements.adventure.trade_at_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", eh.a.a(bv.a.a().a(df.a.a(dh.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ag $$8 = a($$5, $$1, $$2, a);
      ag $$9 = af.a.a()
         .a($$8)
         .a(cvw.ow, xe.c("advancements.adventure.shoot_arrow.title"), xe.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dm.a.a(bj.a.a().a(bk.a.a().a(ee.a(awx.j)).a(bv.a.a().a($$2, awz.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$10 = af.a.a()
         .a($$8)
         .a(cvw.vU, xe.c("advancements.adventure.throw_trident.title"), xe.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dm.a.a(bj.a.a().a(bk.a.a().a(ee.a(awx.j)).a(bv.a.a().a($$2, bty.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$10)
         .a(
            cvw.vU,
            xe.c("advancements.adventure.very_very_frightening.title"),
            xe.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a($$2, bty.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$7)
         .a(
            dho.ee,
            xe.c("advancements.adventure.summon_iron_golem.title"),
            xe.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ed.a.a(bv.a.a().a($$2, bty.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$9)
         .a(cvw.ox, xe.c("advancements.adventure.sniper_duel.title"), xe.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", da.a.a(bv.a.a().a($$2, bty.aN).a(bm.a(dh.c.b(50.0))), bk.a.a().a(ee.a(awx.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$8)
         .a(
            cvw.vv,
            xe.c("advancements.adventure.totem_of_undying.title"),
            xe.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ej.a.a($$3, cvw.vv))
         .a($$1, "adventure/totem_of_undying");
      ag $$11 = af.a.a()
         .a($$5)
         .a(cvw.vX, xe.c("advancements.adventure.ol_betsy.title"), xe.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", dv.a.a($$3, cvw.vX))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$11)
         .a(
            cvw.vX,
            xe.c("advancements.adventure.whos_the_pillager_now.title"),
            xe.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cz.a.a(bv.a.a().a($$2, bty.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$11)
         .a(
            cvw.vX,
            xe.c("advancements.adventure.two_birds_one_arrow.title"),
            xe.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cz.a.a(bv.a.a().a($$2, bty.ay), bv.a.a().a($$2, bty.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$11)
         .a(cvw.vX, xe.c("advancements.adventure.arbalistic.title"), xe.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cz.a.a(dh.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jq.b<drl> $$12 = $$0.d(lw.d);
      ag $$13 = af.a.a()
         .a($$5)
         .a(
            cpl.a($$12),
            xe.c("advancements.adventure.voluntary_exile.title"),
            xe.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", da.a.a(bv.a.a().a($$2, awz.c).a(bs.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$13)
         .a(
            cpl.a($$12),
            xe.c("advancements.adventure.hero_of_the_village.title"),
            xe.c("advancements.adventure.hero_of_the_village.description"),
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
            dho.pg.q(),
            xe.c("advancements.adventure.honey_block_slide.title"),
            xe.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dy.a.a(dho.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$9)
         .a(dho.pd.q(), xe.c("advancements.adventure.bullseye.title"), xe.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", eg.a.a(dh.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(dh.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$6)
         .a(
            cvw.pC,
            xe.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xe.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dq.a.a($$4, $$3, dho.qP, cvw.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$5)
         .a(
            cvw.lX,
            xe.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xe.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dh.d.a(0), Optional.of(bv.a.a().a($$2, bty.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cvw.qY,
            xe.c("advancements.adventure.spyglass_at_parrot.title"),
            xe.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bv.a.a().a($$2, bty.ax), cs.a.a().a($$3, cvw.qY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$15 = af.a.a()
         .a($$14)
         .a(
            cvw.qY,
            xe.c("advancements.adventure.spyglass_at_ghast.title"),
            xe.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bv.a.a().a($$2, bty.T), cs.a.a().a($$3, cvw.qY)))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$6)
         .a(
            cvw.eY,
            xe.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xe.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cw.a.a(df.a.a().a(js.a($$0.d(lw.aH).b(dfr.D))).a(aw.a.a().a($$4, dho.dT)), cs.a.a().a(cu.n, cq.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$15)
         .a(
            cvw.qY,
            xe.c("advancements.adventure.spyglass_at_dragon.title"),
            xe.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bv.a.a().a($$2, bty.F), cs.a.a().a($$3, cvw.qY)))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$5)
         .a(
            cvw.qA,
            xe.c("advancements.adventure.fall_from_world_height.title"),
            xe.c("advancements.adventure.fall_from_world_height.description"),
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
            dho.qU,
            xe.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xe.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dho.qQ,
            xe.c("advancements.adventure.avoid_vibration.title"),
            xe.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cvw.xx, xe.c("advancements.adventure.salvage_sherd.title"), xe.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$16)
         .a(
            dsl.a(new dtb(Optional.empty(), Optional.of(cvw.yc), Optional.empty(), Optional.of(cvw.xY))),
            xe.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xe.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ds.a.a(ale.b("decorated_pot"), List.of(cs.a.a().a($$3, axe.bt), cs.a.a().a($$3, axe.bt), cs.a.a().a($$3, axe.bt), cs.a.a().a($$3, axe.bt)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$17 = b(af.a.a())
         .a($$5)
         .a(
            new cvs(cvw.xA),
            xe.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xe.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cvs(cvw.xM),
            xe.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xe.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cvw.eB,
            xe.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xe.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a($$4, dho.cm))
         .a("comparator", b($$4, dho.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$5)
         .a(
            cvw.or,
            xe.c("advancements.adventure.brush_armadillo.title"),
            xe.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dn.a.a(cs.a.a().a($$3, cvw.xx), Optional.of(bv.a(bv.a.a().a($$2, bty.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$18 = af.a.a()
         .a($$5)
         .a(
            dho.qH,
            xe.c("advancements.adventure.minecraft_trials_edition.title"),
            xe.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dq.a.a(df.a.b($$0.d(lw.aT).b(ela.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$18)
         .a(cvw.yw, xe.c("advancements.adventure.lighten_up.title"), xe.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cw.a.a(df.a.a().a(aw.a.a().a($$4, dho.sn, dho.sm, dho.sl, dho.sr, dho.sq, dho.sp).a(ec.a.a().a(dja.c, true))), cs.a.a().a($$3, mk.c)))
         .a($$1, "adventure/lighten_up");
      ag $$19 = af.a.a()
         .a($$18)
         .a(
            cvw.yF,
            xe.c("advancements.adventure.under_lock_and_key.title"),
            xe.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cw.a.a(df.a.a().a(aw.a.a().a($$4, dho.ts).a(ec.a.a().a(dqi.d, false))), cs.a.a().a($$3, cvw.yF)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$19)
         .a(cvw.yG, xe.c("advancements.adventure.revaulting.title"), xe.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cw.a.a(df.a.a().a(aw.a.a().a($$4, dho.ts).a(ec.a.a().a(dqi.d, true))), cs.a.a().a($$3, cvw.yG)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$18)
         .a(cvw.tZ, xe.c("advancements.adventure.blowback.title"), xe.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", da.a.a(bv.a.a().a($$2, bty.m), bk.a.a().a(ee.a(awx.j)).a(bv.a.a().a($$2, bty.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$5)
         .a(
            cvw.rU,
            xe.c("advancements.adventure.crafters_crafting_crafters.title"),
            xe.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", ds.a.b(ale.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$18)
         .a(
            cvw.tZ,
            xe.c("advancements.adventure.who_needs_rockets.title"),
            xe.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(dh.c.b(7.0)), bv.a.a().a($$2, bty.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$18)
         .a(cvw.ud, xe.c("advancements.adventure.overoverkill.title"), xe.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dm.a.a(bj.a.a().a(dh.c.b(100.0)).a(bk.a.a().a(ee.a(awx.H)).a(bv.a.a().a($$2, bty.by).a(bs.a.a().f(cs.a.a().a($$3, cvw.ud)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jp<bty<?>> $$2, List<bty<?>> $$3) {
      ag $$4 = a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(cvw.pc, xe.c("advancements.adventure.kill_a_mob.title"), xe.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2, $$3)
         .a($$4)
         .a(cvw.ph, xe.c("advancements.adventure.kill_all_mobs.title"), xe.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ao<cw.a> a(jp<dhm> $$0, dhm $$1) {
      eww.a[] $$2 = diw.aF.a().stream().map($$1x -> {
         ec.a $$2x = ec.a.a().a(diw.aF, $$1x);
         aw.a $$3 = aw.a.a().a($$0, dho.gY).a($$2x);
         return ewu.a(df.a.a().a($$3), new jf($$1x.g().q()));
      }).toArray(eww.a[]::new);
      return cw.a.a(ewv.a($$1), ewk.a($$2));
   }

   private static ao<cw.a> b(jp<dhm> $$0, dhm $$1) {
      eww.a[] $$2 = diw.aF.a().stream().map($$2x -> {
         ec.a $$3 = ec.a.a().a(diw.aF, $$2x);
         ewv.a $$4 = new ewv.a(dho.gY).a($$3);
         eww.a $$5 = ewu.a(df.a.a().a(aw.a.a().a($$0, $$1)), new jf($$2x.q()));
         return ewj.a($$4, $$5);
      }).toArray(eww.a[]::new);
      return cw.a.a(ewk.a($$2));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cvn> $$1 = Set.of(cvw.xJ, cvw.xH, cvw.xI, cvw.xD, cvw.xM, cvw.xF, cvw.xG, cvw.xK);
      pc.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ds.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      pc.b().map(pc.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ds.a.a($$1)));
      return $$0;
   }

   private static af.a a(jp<cvn> $$0, af.a $$1) {
      List<Pair<String, ao<dg.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dg.a.a(eth.aU)),
         Pair.of("desert_well", dg.a.a(eth.aT)),
         Pair.of("ocean_ruin_cold", dg.a.a(eth.aY)),
         Pair.of("ocean_ruin_warm", dg.a.a(eth.aX)),
         Pair.of("trail_ruins_rare", dg.a.a(eth.aW)),
         Pair.of("trail_ruins_common", dg.a.a(eth.aV))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cg.a.a(cs.a.a().a($$0, axe.bt)));
      $$1.a(new aj(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jq.a $$0, Consumer<ag> $$1, ag $$2, dfy.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cvw.pO,
            xe.c("advancements.adventure.adventuring_time.title"),
            xe.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, jp<bty<?>> $$1, List<bty<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lv.f.b($$2x).toString(), da.a.a(bv.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jq.a $$1, List<ald<dfk>> $$2) {
      jp<dfk> $$3 = $$1.d(lw.aH);

      for (ald<dfk> $$4 : $$2) {
         $$0.a($$4.a().toString(), dq.a.a(df.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
