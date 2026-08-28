import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ml implements mi {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bug<?>> a = Arrays.asList(
      bug.i,
      bug.l,
      bug.m,
      bug.q,
      bug.x,
      bug.B,
      bug.D,
      bug.F,
      bug.H,
      bug.I,
      bug.J,
      bug.T,
      bug.Y,
      bug.Z,
      bug.ac,
      bug.ap,
      bug.ay,
      bug.aA,
      bug.aB,
      bug.aC,
      bug.aH,
      bug.aK,
      bug.aM,
      bug.aN,
      bug.aP,
      bug.aW,
      bug.aY,
      bug.bi,
      bug.bk,
      bug.bo,
      bug.bq,
      bug.bp,
      bug.bt,
      bug.bw,
      bug.bu,
      bug.bx
   );

   private static ao<df.a> a(di.d $$0, Optional<bv> $$1) {
      return df.a.a(Optional.of(bv.a.a().a(bm.c(di.c.c(30.0))).a(de.a($$0)).b()), $$1);
   }

   private static ao<el.a> a(bv.a $$0, ct.a $$1) {
      return el.a.a(bv.a.a().a(dq.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jr.a $$0, Consumer<ag> $$1) {
      jq<bug<?>> $$2 = $$0.d(ly.z);
      jq<cvt> $$3 = $$0.d(ly.K);
      jq<dhy> $$4 = $$0.d(ly.f);
      ag $$5 = af.a.a()
         .a(
            cwb.ul,
            xh.c("advancements.adventure.root.title"),
            xh.c("advancements.adventure.root.description"),
            alh.b("textures/gui/advancements/backgrounds/adventure.png"),
            am.a,
            false,
            false,
            false
         )
         .a(aj.a.b)
         .a("killed_something", db.a.b())
         .a("killed_by_something", db.a.d())
         .a($$1, "adventure/root");
      ag $$6 = af.a.a()
         .a($$5)
         .a(dia.bn, xh.c("advancements.adventure.sleep_in_bed.title"), xh.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dr.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dgk.a.b);
      ag $$7 = af.a.a()
         .a($$5)
         .a(cwb.oB, xh.c("advancements.adventure.trade.title"), xh.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", ei.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$7)
         .a(
            cwb.oB,
            xh.c("advancements.adventure.trade_at_world_height.title"),
            xh.c("advancements.adventure.trade_at_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", ei.a.a(bv.a.a().a(dg.a.a(di.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ag $$8 = a($$5, $$1, $$2, a);
      ag $$9 = af.a.a()
         .a($$8)
         .a(cwb.ow, xh.c("advancements.adventure.shoot_arrow.title"), xh.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dn.a.a(bj.a.a().a(bk.a.a().a(ef.a(axb.j)).a(bv.a.a().a($$2, axd.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$10 = af.a.a()
         .a($$8)
         .a(cwb.vU, xh.c("advancements.adventure.throw_trident.title"), xh.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dn.a.a(bj.a.a().a(bk.a.a().a(ef.a(axb.j)).a(bv.a.a().a($$2, bug.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$10)
         .a(
            cwb.vU,
            xh.c("advancements.adventure.very_very_frightening.title"),
            xh.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a($$2, bug.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$7)
         .a(
            dia.ee,
            xh.c("advancements.adventure.summon_iron_golem.title"),
            xh.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ee.a.a(bv.a.a().a($$2, bug.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$9)
         .a(cwb.ox, xh.c("advancements.adventure.sniper_duel.title"), xh.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", db.a.a(bv.a.a().a($$2, bug.aN).a(bm.a(di.c.b(50.0))), bk.a.a().a(ef.a(axb.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$8)
         .a(
            cwb.vv,
            xh.c("advancements.adventure.totem_of_undying.title"),
            xh.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ek.a.a($$3, cwb.vv))
         .a($$1, "adventure/totem_of_undying");
      ag $$11 = af.a.a()
         .a($$5)
         .a(cwb.vX, xh.c("advancements.adventure.ol_betsy.title"), xh.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", dw.a.a($$3, cwb.vX))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$11)
         .a(
            cwb.vX,
            xh.c("advancements.adventure.whos_the_pillager_now.title"),
            xh.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", da.a.a(bv.a.a().a($$2, bug.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$11)
         .a(
            cwb.vX,
            xh.c("advancements.adventure.two_birds_one_arrow.title"),
            xh.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", da.a.a(bv.a.a().a($$2, bug.ay), bv.a.a().a($$2, bug.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$11)
         .a(cwb.vX, xh.c("advancements.adventure.arbalistic.title"), xh.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", da.a.a(di.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jr.b<drw> $$12 = $$0.d(ly.d);
      ag $$13 = af.a.a()
         .a($$5)
         .a(
            cpv.a($$12),
            xh.c("advancements.adventure.voluntary_exile.title"),
            xh.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", db.a.a(bv.a.a().a($$2, axd.c).a(bs.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$13)
         .a(
            cpv.a($$12),
            xh.c("advancements.adventure.hero_of_the_village.title"),
            xh.c("advancements.adventure.hero_of_the_village.description"),
            null,
            am.b,
            true,
            true,
            true
         )
         .a(ak.a.a(100))
         .a("hero_of_the_village", dr.a.c())
         .a($$1, "adventure/hero_of_the_village");
      af.a.a()
         .a($$5)
         .a(
            dia.pg.j(),
            xh.c("advancements.adventure.honey_block_slide.title"),
            xh.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dz.a.a(dia.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$9)
         .a(dia.pd.j(), xh.c("advancements.adventure.bullseye.title"), xh.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", eh.a.a(di.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(di.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$6)
         .a(
            cwb.pC,
            xh.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xh.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dr.a.a($$4, $$3, dia.qP, cwb.pC))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$5)
         .a(
            cwb.lX,
            xh.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xh.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(di.d.a(0), Optional.of(bv.a.a().a($$2, bug.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$14 = af.a.a()
         .a($$5)
         .a(
            cwb.qY,
            xh.c("advancements.adventure.spyglass_at_parrot.title"),
            xh.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bv.a.a().a($$2, bug.ax), ct.a.a().a($$3, cwb.qY)))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$15 = af.a.a()
         .a($$14)
         .a(
            cwb.qY,
            xh.c("advancements.adventure.spyglass_at_ghast.title"),
            xh.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bv.a.a().a($$2, bug.T), ct.a.a().a($$3, cwb.qY)))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$6)
         .a(
            cwb.eY,
            xh.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xh.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cx.a.a(dg.a.a().a(jt.a($$0.d(ly.aG).b(dgd.D))).a(aw.a.a().a($$4, dia.dT)), ct.a.a().a(cv.n, cr.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$15)
         .a(
            cwb.qY,
            xh.c("advancements.adventure.spyglass_at_dragon.title"),
            xh.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bv.a.a().a($$2, bug.F), ct.a.a().a($$3, cwb.qY)))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$5)
         .a(
            cwb.qA,
            xh.c("advancements.adventure.fall_from_world_height.title"),
            xh.c("advancements.adventure.fall_from_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bn.a.a(bv.a.a().a(dg.a.a(di.c.c(-59.0))), bm.b(di.c.b(379.0)), dg.a.a(di.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      af.a.a()
         .a($$8)
         .a(
            dia.qU,
            xh.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xh.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", db.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      af.a.a()
         .a($$5)
         .a(
            dia.qQ,
            xh.c("advancements.adventure.avoid_vibration.title"),
            xh.c("advancements.adventure.avoid_vibration.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dr.a.d())
         .a($$1, "adventure/avoid_vibration");
      ag $$16 = a($$3, af.a.a())
         .a($$5)
         .a(cwb.xx, xh.c("advancements.adventure.salvage_sherd.title"), xh.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$16)
         .a(
            dsw.a(new dtm(Optional.empty(), Optional.of(cwb.yc), Optional.empty(), Optional.of(cwb.xY))),
            xh.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xh.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dt.a.a(alh.b("decorated_pot"), List.of(ct.a.a().a($$3, axi.bC), ct.a.a().a($$3, axi.bC), ct.a.a().a($$3, axi.bC), ct.a.a().a($$3, axi.bC)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$17 = b(af.a.a())
         .a($$5)
         .a(
            new cvx(cwb.xA),
            xh.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xh.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cvx(cwb.xM),
            xh.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xh.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cwb.eB,
            xh.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xh.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a($$4, dia.cm))
         .a("comparator", b($$4, dia.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$5)
         .a(
            cwb.or,
            xh.c("advancements.adventure.brush_armadillo.title"),
            xh.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dp.a.a(ct.a.a().a($$3, cwb.xx), Optional.of(bv.a(bv.a.a().a($$2, bug.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$18 = af.a.a()
         .a($$5)
         .a(
            dia.qH,
            xh.c("advancements.adventure.minecraft_trials_edition.title"),
            xh.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dr.a.a(dg.a.b($$0.d(ly.aS).b(ell.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$18)
         .a(cwb.yw, xh.c("advancements.adventure.lighten_up.title"), xh.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cx.a.a(dg.a.a().a(aw.a.a().a($$4, dia.sn, dia.sm, dia.sl, dia.sr, dia.sq, dia.sp).a(ed.a.a().a(djm.c, true))), ct.a.a().a($$3, mm.c)))
         .a($$1, "adventure/lighten_up");
      ag $$19 = af.a.a()
         .a($$18)
         .a(
            cwb.yF,
            xh.c("advancements.adventure.under_lock_and_key.title"),
            xh.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cx.a.a(dg.a.a().a(aw.a.a().a($$4, dia.ts).a(ed.a.a().a(dqt.d, false))), ct.a.a().a($$3, cwb.yF)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$19)
         .a(cwb.yG, xh.c("advancements.adventure.revaulting.title"), xh.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cx.a.a(dg.a.a().a(aw.a.a().a($$4, dia.ts).a(ed.a.a().a(dqt.d, true))), ct.a.a().a($$3, cwb.yG)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$18)
         .a(cwb.tZ, xh.c("advancements.adventure.blowback.title"), xh.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", db.a.a(bv.a.a().a($$2, bug.m), bk.a.a().a(ef.a(axb.j)).a(bv.a.a().a($$2, bug.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$5)
         .a(
            cwb.rU,
            xh.c("advancements.adventure.crafters_crafting_crafters.title"),
            xh.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dt.a.b(alh.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$18)
         .a(
            cwb.tZ,
            xh.c("advancements.adventure.who_needs_rockets.title"),
            xh.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(di.c.b(7.0)), bv.a.a().a($$2, bug.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$18)
         .a(cwb.ud, xh.c("advancements.adventure.overoverkill.title"), xh.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dn.a.a(bj.a.a().a(di.c.b(100.0)).a(bk.a.a().a(ef.a(axb.H)).a(bv.a.a().a($$2, bug.by).a(bs.a.a().f(ct.a.a().a($$3, cwb.ud)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, jq<bug<?>> $$2, List<bug<?>> $$3) {
      ag $$4 = a(af.a.a(), $$2, $$3)
         .a($$0)
         .a(cwb.pc, xh.c("advancements.adventure.kill_a_mob.title"), xh.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2, $$3)
         .a($$4)
         .a(cwb.ph, xh.c("advancements.adventure.kill_all_mobs.title"), xh.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ao<cx.a> a(jq<dhy> $$0, dhy $$1) {
      exh.a[] $$2 = dji.aF.a().stream().map($$1x -> {
         ed.a $$2x = ed.a.a().a(dji.aF, $$1x);
         aw.a $$3 = aw.a.a().a($$0, dia.gY).a($$2x);
         return exf.a(dg.a.a().a($$3), new jg($$1x.g().q()));
      }).toArray(exh.a[]::new);
      return cx.a.a(exg.a($$1), ewv.a($$2));
   }

   private static ao<cx.a> b(jq<dhy> $$0, dhy $$1) {
      exh.a[] $$2 = dji.aF.a().stream().map($$2x -> {
         ed.a $$3 = ed.a.a().a(dji.aF, $$2x);
         exg.a $$4 = new exg.a(dia.gY).a($$3);
         exh.a $$5 = exf.a(dg.a.a().a(aw.a.a().a($$0, $$1)), new jg($$2x.q()));
         return ewu.a($$4, $$5);
      }).toArray(exh.a[]::new);
      return cx.a.a(ewv.a($$2));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cvt> $$1 = Set.of(cwb.xJ, cwb.xH, cwb.xI, cwb.xD, cwb.xM, cwb.xF, cwb.xG, cwb.xK);
      pf.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), dt.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      pf.b().map(pf.b::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, dt.a.a($$1)));
      return $$0;
   }

   private static af.a a(jq<cvt> $$0, af.a $$1) {
      List<Pair<String, ao<dh.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", dh.a.a(ets.aU)),
         Pair.of("desert_well", dh.a.a(ets.aT)),
         Pair.of("ocean_ruin_cold", dh.a.a(ets.aY)),
         Pair.of("ocean_ruin_warm", dh.a.a(ets.aX)),
         Pair.of("trail_ruins_rare", dh.a.a(ets.aW)),
         Pair.of("trail_ruins_common", dh.a.a(ets.aV))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", ch.a.a(ct.a.a().a($$0, axi.bC)));
      $$1.a(new aj(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jr.a $$0, Consumer<ag> $$1, ag $$2, dgk.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cwb.pO,
            xh.c("advancements.adventure.adventuring_time.title"),
            xh.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, jq<bug<?>> $$1, List<bug<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(lx.f.b($$2x).toString(), db.a.a(bv.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jr.a $$1, List<alg<dfw>> $$2) {
      jq<dfw> $$3 = $$1.d(ly.aG);

      for (alg<dfw> $$4 : $$2) {
         $$0.a($$4.a().toString(), dr.a.a(dg.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
