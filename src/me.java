import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class me implements mb {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bsm<?>> a = Arrays.asList(
      bsm.i,
      bsm.l,
      bsm.m,
      bsm.q,
      bsm.x,
      bsm.B,
      bsm.D,
      bsm.F,
      bsm.H,
      bsm.I,
      bsm.J,
      bsm.T,
      bsm.Y,
      bsm.Z,
      bsm.ac,
      bsm.ap,
      bsm.ay,
      bsm.aA,
      bsm.aB,
      bsm.aC,
      bsm.aH,
      bsm.aK,
      bsm.aM,
      bsm.aN,
      bsm.aP,
      bsm.aW,
      bsm.aY,
      bsm.bi,
      bsm.bk,
      bsm.bo,
      bsm.bq,
      bsm.bp,
      bsm.bt,
      bsm.bw,
      bsm.bu,
      bsm.bx
   );

   private static an<db.a> a(de.d $$0, Optional<bu> $$1) {
      return db.a.a(Optional.of(bu.a.a().a(bl.c(de.c.c(30.0))).a(da.a($$0)).b()), $$1);
   }

   private static an<eg.a> a(bsm<?> $$0, ctx $$1) {
      return eg.a.a(bu.a.a().a(dl.d.a().a(bu.a.a().a($$0)).b()), cp.a.a().a($$1));
   }

   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuf.uj,
            wu.c("advancements.adventure.root.title"),
            wu.c("advancements.adventure.root.description"),
            new akk("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cx.a.b())
         .a("killed_by_something", cx.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dfj.bn, wu.c("advancements.adventure.sleep_in_bed.title"), wu.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", dm.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, ddt.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cuf.oA, wu.c("advancements.adventure.trade.title"), wu.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", ed.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cuf.oA,
            wu.c("advancements.adventure.trade_at_world_height.title"),
            wu.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", ed.a.a(bu.a.a().a(dc.a.a(de.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(cuf.ov, wu.c("advancements.adventure.shoot_arrow.title"), wu.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", dj.a.a(bi.a.a().a(bj.a.a().a(ea.a(avy.k)).a(bu.a.a().a(awa.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cuf.vS, wu.c("advancements.adventure.throw_trident.title"), wu.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", dj.a.a(bi.a.a().a(bj.a.a().a(ea.a(avy.k)).a(bu.a.a().a(bsm.bf)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cuf.vS,
            wu.c("advancements.adventure.very_very_frightening.title"),
            wu.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bu.a.a().a(bsm.bj)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dfj.ee,
            wu.c("advancements.adventure.summon_iron_golem.title"),
            wu.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dz.a.a(bu.a.a().a(bsm.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cuf.ow, wu.c("advancements.adventure.sniper_duel.title"), wu.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cx.a.a(bu.a.a().a(bsm.aN).a(bl.a(de.c.b(50.0))), bj.a.a().a(ea.a(avy.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cuf.vt,
            wu.c("advancements.adventure.totem_of_undying.title"),
            wu.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", ef.a.a(cuf.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cuf.vW, wu.c("advancements.adventure.ol_betsy.title"), wu.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", dr.a.a(cuf.vW))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cuf.vW,
            wu.c("advancements.adventure.whos_the_pillager_now.title"),
            wu.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cw.a.a(bu.a.a().a(bsm.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cuf.vW,
            wu.c("advancements.adventure.two_birds_one_arrow.title"),
            wu.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cw.a.a(bu.a.a().a(bsm.ay), bu.a.a().a(bsm.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cuf.vW, wu.c("advancements.adventure.arbalistic.title"), wu.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cw.a.a(de.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jl.b<dpf> $$9 = $$0.b(lr.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cnv.a($$9),
            wu.c("advancements.adventure.voluntary_exile.title"),
            wu.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cx.a.a(bu.a.a().a(awa.c).a(br.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cnv.a($$9),
            wu.c("advancements.adventure.hero_of_the_village.title"),
            wu.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", dm.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            dfj.pg.r(),
            wu.c("advancements.adventure.honey_block_slide.title"),
            wu.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", du.a.a(dfj.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dfj.pd.r(), wu.c("advancements.adventure.bullseye.title"), wu.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", ec.a.a(de.d.a(15), Optional.of(bu.a(bu.a.a().a(bl.a(de.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cuf.pB,
            wu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dm.a.a(dfj.qP, cuf.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cuf.lX,
            wu.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wu.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(de.d.a(0), Optional.of(bu.a.a().a(bsm.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cuf.qX,
            wu.c("advancements.adventure.spyglass_at_parrot.title"),
            wu.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsm.ax, cuf.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            cuf.qX,
            wu.c("advancements.adventure.spyglass_at_ghast.title"),
            wu.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsm.T, cuf.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cuf.eY,
            wu.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wu.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ct.a.a(dc.a.a().a(jn.a($$0.b(lr.aE).b(ddm.D))).a(av.a.a().a(dfj.dT)), cp.a.a().a(awf.aR)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            cuf.qX,
            wu.c("advancements.adventure.spyglass_at_dragon.title"),
            wu.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsm.F, cuf.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cuf.qz,
            wu.c("advancements.adventure.fall_from_world_height.title"),
            wu.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bm.a.a(bu.a.a().a(dc.a.a(de.c.c(-59.0))), bl.b(de.c.b(379.0)), dc.a.a(de.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            dfj.qU,
            wu.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wu.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cx.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            dfj.qQ,
            wu.c("advancements.adventure.avoid_vibration.title"),
            wu.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dm.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(cuf.xu, wu.c("advancements.adventure.salvage_sherd.title"), wu.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dqf.a(new dqu(Optional.empty(), Optional.of(cuf.xZ), Optional.empty(), Optional.of(cuf.xV))),
            wu.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wu.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dp.a.a(new akk("minecraft:decorated_pot"), List.of(cp.a.a().a(awf.bp), cp.a.a().a(awf.bp), cp.a.a().a(awf.bp), cp.a.a().a(awf.bp)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new cuc(cuf.xx),
            wu.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wu.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$14)
         .a(
            new cuc(cuf.xJ),
            wu.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wu.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ae.a.a()
         .a($$2)
         .a(
            cuf.eB,
            wu.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wu.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dfj.cm))
         .a("comparator", b(dfj.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ae.a.a()
         .a($$2)
         .a(
            cuf.oq,
            wu.c("advancements.adventure.brush_armadillo.title"),
            wu.c("advancements.adventure.brush_armadillo.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dk.a.a(cp.a.a().a(cuf.xu), Optional.of(bu.a(bu.a.a().a(bsm.c)))))
         .a($$1, "adventure/brush_armadillo");
      af $$15 = ae.a.a()
         .a($$2)
         .a(
            dfj.qH,
            wu.c("advancements.adventure.minecraft_trials_edition.title"),
            wu.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eiq.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$15)
         .a(cuf.yt, wu.c("advancements.adventure.lighten_up.title"), wu.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ct.a.a(dc.a.a().a(av.a.a().a(dfj.sn, dfj.sm, dfj.sl, dfj.sr, dfj.sq, dfj.sp).a(dy.a.a().a(dgv.c, true))), cp.a.a().a(mf.c)))
         .a($$1, "adventure/lighten_up");
      af $$16 = ae.a.a()
         .a($$15)
         .a(
            cuf.yC,
            wu.c("advancements.adventure.under_lock_and_key.title"),
            wu.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ct.a.a(dc.a.a().a(av.a.a().a(dfj.ts).a(dy.a.a().a(doc.d, false))), cp.a.a().a(cuf.yC)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$16)
         .a(cuf.yD, wu.c("advancements.adventure.revaulting.title"), wu.c("advancements.adventure.revaulting.description"), null, al.c, true, true, false)
         .a("revaulting", ct.a.a(dc.a.a().a(av.a.a().a(dfj.ts).a(dy.a.a().a(doc.d, true))), cp.a.a().a(cuf.yD)))
         .a($$1, "adventure/revaulting");
      ae.a.a()
         .a($$15)
         .a(cuf.tY, wu.c("advancements.adventure.blowback.title"), wu.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cx.a.a(bu.a.a().a(bsm.m), bj.a.a().a(ea.a(avy.k)).a(bu.a.a().a(bsm.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            cuf.rT,
            wu.c("advancements.adventure.crafters_crafting_crafters.title"),
            wu.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dp.a.b(new akk("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ae.a.a()
         .a($$15)
         .a(
            cuf.tY,
            wu.c("advancements.adventure.who_needs_rockets.title"),
            wu.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", by.a.a(bl.b(de.c.b(7.0)), bu.a.a().a(bsm.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$15)
         .a(cuf.ub, wu.c("advancements.adventure.overoverkill.title"), wu.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", dj.a.a(bi.a.a().a(de.c.b(100.0)).a(bj.a.a().a(ea.a(avy.E)).a(bu.a.a().a(bsm.by).a(br.a.a().f(cp.a.a().a(cuf.ub)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bsm<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(cuf.pb, wu.c("advancements.adventure.kill_a_mob.title"), wu.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(cuf.pg, wu.c("advancements.adventure.kill_all_mobs.title"), wu.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<ct.a> a(dfh $$0) {
      euf.a[] $$1 = dgr.aE.a().stream().map($$0x -> {
         dy.a $$1x = dy.a.a().a(dgr.aE, $$0x);
         av.a $$2 = av.a.a().a(dfj.gY).a($$1x);
         return eud.a(dc.a.a().a($$2), new ja($$0x.g().q()));
      }).toArray(euf.a[]::new);
      return ct.a.a(eue.a($$0), ett.a($$1));
   }

   private static an<ct.a> b(dfh $$0) {
      euf.a[] $$1 = dgr.aE.a().stream().map($$1x -> {
         dy.a $$2 = dy.a.a().a(dgr.aE, $$1x);
         eue.a $$3 = new eue.a(dfj.gY).a($$2);
         euf.a $$4 = eud.a(dc.a.a().a(av.a.a().a($$0)), new ja($$1x.q()));
         return ets.a($$3, $$4);
      }).toArray(euf.a[]::new);
      return ct.a.a(ett.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<ctx> $$1 = Set.of(cuf.xG, cuf.xE, cuf.xF, cuf.xA, cuf.xJ, cuf.xC, cuf.xD, cuf.xH);
      ou.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), dp.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      ou.b().map(ou.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, dp.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<dd.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", dd.a.a(eqq.be)),
         Pair.of("desert_well", dd.a.a(eqq.bd)),
         Pair.of("ocean_ruin_cold", dd.a.a(eqq.bi)),
         Pair.of("ocean_ruin_warm", dd.a.a(eqq.bh)),
         Pair.of("trail_ruins_rare", dd.a.a(eqq.bg)),
         Pair.of("trail_ruins_common", dd.a.a(eqq.bf))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ce.a.a(cp.a.a().a(awf.bp)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jl.a $$0, Consumer<af> $$1, af $$2, ddt.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cuf.pN,
            wu.c("advancements.adventure.adventuring_time.title"),
            wu.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bsm<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lq.f.b($$1x).toString(), cx.a.a(bu.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, jl.a $$1, List<akj<ddf>> $$2) {
      jk<ddf> $$3 = $$1.b(lr.aE);

      for (akj<ddf> $$4 : $$2) {
         $$0.a($$4.a().toString(), dm.a.a(dc.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
