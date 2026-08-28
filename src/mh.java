import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mh implements me {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bsx<?>> a = Arrays.asList(
      bsx.i,
      bsx.l,
      bsx.m,
      bsx.q,
      bsx.x,
      bsx.B,
      bsx.D,
      bsx.F,
      bsx.H,
      bsx.I,
      bsx.J,
      bsx.T,
      bsx.Y,
      bsx.Z,
      bsx.ac,
      bsx.ap,
      bsx.ay,
      bsx.aA,
      bsx.aB,
      bsx.aC,
      bsx.aH,
      bsx.aK,
      bsx.aM,
      bsx.aN,
      bsx.aP,
      bsx.aW,
      bsx.aY,
      bsx.bi,
      bsx.bk,
      bsx.bo,
      bsx.bq,
      bsx.bp,
      bsx.bt,
      bsx.bw,
      bsx.bu,
      bsx.bx
   );

   private static ao<de.a> a(dh.d $$0, Optional<bv> $$1) {
      return de.a.a(Optional.of(bv.a.a().a(bm.c(dh.c.c(30.0))).a(dd.a($$0)).b()), $$1);
   }

   private static ao<ej.a> a(bsx<?> $$0, cul $$1) {
      return ej.a.a(bv.a.a().a(dp.d.a().a(bv.a.a().a($$0)).b()), cs.a.a().a($$1));
   }

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            cut.uj,
            wz.c("advancements.adventure.root.title"),
            wz.c("advancements.adventure.root.description"),
            akr.b("textures/gui/advancements/backgrounds/adventure.png"),
            am.a,
            false,
            false,
            false
         )
         .a(aj.a.b)
         .a("killed_something", da.a.b())
         .a("killed_by_something", da.a.d())
         .a($$1, "adventure/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(dga.bn, wz.c("advancements.adventure.sleep_in_bed.title"), wz.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dq.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dek.a.b);
      ag $$4 = af.a.a()
         .a($$2)
         .a(cut.oA, wz.c("advancements.adventure.trade.title"), wz.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", eg.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$4)
         .a(
            cut.oA,
            wz.c("advancements.adventure.trade_at_world_height.title"),
            wz.c("advancements.adventure.trade_at_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", eg.a.a(bv.a.a().a(df.a.a(dh.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ag $$5 = a($$2, $$1, a);
      ag $$6 = af.a.a()
         .a($$5)
         .a(cut.ov, wz.c("advancements.adventure.shoot_arrow.title"), wz.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awg.j)).a(bv.a.a().a(awi.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$7 = af.a.a()
         .a($$5)
         .a(cut.vS, wz.c("advancements.adventure.throw_trident.title"), wz.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awg.j)).a(bv.a.a().a(bsx.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$7)
         .a(
            cut.vS,
            wz.c("advancements.adventure.very_very_frightening.title"),
            wz.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a(bsx.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$4)
         .a(
            dga.ee,
            wz.c("advancements.adventure.summon_iron_golem.title"),
            wz.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ec.a.a(bv.a.a().a(bsx.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$6)
         .a(cut.ow, wz.c("advancements.adventure.sniper_duel.title"), wz.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", da.a.a(bv.a.a().a(bsx.aN).a(bm.a(dh.c.b(50.0))), bk.a.a().a(ed.a(awg.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$5)
         .a(
            cut.vt,
            wz.c("advancements.adventure.totem_of_undying.title"),
            wz.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ei.a.a(cut.vt))
         .a($$1, "adventure/totem_of_undying");
      ag $$8 = af.a.a()
         .a($$2)
         .a(cut.vW, wz.c("advancements.adventure.ol_betsy.title"), wz.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", du.a.a(cut.vW))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$8)
         .a(
            cut.vW,
            wz.c("advancements.adventure.whos_the_pillager_now.title"),
            wz.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cz.a.a(bv.a.a().a(bsx.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$8)
         .a(
            cut.vW,
            wz.c("advancements.adventure.two_birds_one_arrow.title"),
            wz.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cz.a.a(bv.a.a().a(bsx.ay), bv.a.a().a(bsx.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$8)
         .a(cut.vW, wz.c("advancements.adventure.arbalistic.title"), wz.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cz.a.a(dh.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jo.b<dpx> $$9 = $$0.b(lu.d);
      ag $$10 = af.a.a()
         .a($$2)
         .a(
            coi.a($$9),
            wz.c("advancements.adventure.voluntary_exile.title"),
            wz.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", da.a.a(bv.a.a().a(awi.c).a(bs.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$10)
         .a(
            coi.a($$9),
            wz.c("advancements.adventure.hero_of_the_village.title"),
            wz.c("advancements.adventure.hero_of_the_village.description"),
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
         .a($$2)
         .a(
            dga.pg.r(),
            wz.c("advancements.adventure.honey_block_slide.title"),
            wz.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dx.a.a(dga.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$6)
         .a(dga.pd.r(), wz.c("advancements.adventure.bullseye.title"), wz.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", ef.a.a(dh.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(dh.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$3)
         .a(
            cut.pB,
            wz.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wz.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dq.a.a(dga.qP, cut.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$2)
         .a(
            cut.lX,
            wz.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wz.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dh.d.a(0), Optional.of(bv.a.a().a(bsx.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cut.qX,
            wz.c("advancements.adventure.spyglass_at_parrot.title"),
            wz.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsx.ax, cut.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$12 = af.a.a()
         .a($$11)
         .a(
            cut.qX,
            wz.c("advancements.adventure.spyglass_at_ghast.title"),
            wz.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsx.T, cut.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$3)
         .a(
            cut.eY,
            wz.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wz.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cw.a.a(df.a.a().a(jq.a($$0.b(lu.aF).b(ded.D))).a(aw.a.a().a(dga.dT)), cs.a.a().a(cu.n, cq.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$12)
         .a(
            cut.qX,
            wz.c("advancements.adventure.spyglass_at_dragon.title"),
            wz.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsx.F, cut.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$2)
         .a(
            cut.qz,
            wz.c("advancements.adventure.fall_from_world_height.title"),
            wz.c("advancements.adventure.fall_from_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bn.a.a(bv.a.a().a(df.a.a(dh.c.c(-59.0))), bm.b(dh.c.b(379.0)), df.a.a(dh.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      af.a.a()
         .a($$5)
         .a(
            dga.qU,
            wz.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wz.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", da.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      af.a.a()
         .a($$2)
         .a(
            dga.qQ,
            wz.c("advancements.adventure.avoid_vibration.title"),
            wz.c("advancements.adventure.avoid_vibration.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dq.a.d())
         .a($$1, "adventure/avoid_vibration");
      ag $$13 = c(af.a.a())
         .a($$2)
         .a(cut.xu, wz.c("advancements.adventure.salvage_sherd.title"), wz.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$13)
         .a(
            dqx.a(new drm(Optional.empty(), Optional.of(cut.xZ), Optional.empty(), Optional.of(cut.xV))),
            wz.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wz.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ds.a.a(akr.b("decorated_pot"), List.of(cs.a.a().a(awn.bo), cs.a.a().a(awn.bo), cs.a.a().a(awn.bo), cs.a.a().a(awn.bo)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$14 = b(af.a.a())
         .a($$2)
         .a(
            new cuq(cut.xx),
            wz.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wz.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(af.a.a())
         .a($$14)
         .a(
            new cuq(cut.xJ),
            wz.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wz.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      af.a.a()
         .a($$2)
         .a(
            cut.eB,
            wz.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wz.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a(dga.cm))
         .a("comparator", b(dga.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$2)
         .a(
            cut.oq,
            wz.c("advancements.adventure.brush_armadillo.title"),
            wz.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dn.a.a(cs.a.a().a(cut.xu), Optional.of(bv.a(bv.a.a().a(bsx.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$15 = af.a.a()
         .a($$2)
         .a(
            dga.qH,
            wz.c("advancements.adventure.minecraft_trials_edition.title"),
            wz.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dq.a.a(df.a.b($$0.b(lu.aR).b(ejj.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$15)
         .a(cut.yt, wz.c("advancements.adventure.lighten_up.title"), wz.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cw.a.a(df.a.a().a(aw.a.a().a(dga.sn, dga.sm, dga.sl, dga.sr, dga.sq, dga.sp).a(eb.a.a().a(dhm.c, true))), cs.a.a().a(mi.c)))
         .a($$1, "adventure/lighten_up");
      ag $$16 = af.a.a()
         .a($$15)
         .a(
            cut.yC,
            wz.c("advancements.adventure.under_lock_and_key.title"),
            wz.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cw.a.a(df.a.a().a(aw.a.a().a(dga.ts).a(eb.a.a().a(dou.d, false))), cs.a.a().a(cut.yC)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$16)
         .a(cut.yD, wz.c("advancements.adventure.revaulting.title"), wz.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cw.a.a(df.a.a().a(aw.a.a().a(dga.ts).a(eb.a.a().a(dou.d, true))), cs.a.a().a(cut.yD)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$15)
         .a(cut.tY, wz.c("advancements.adventure.blowback.title"), wz.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", da.a.a(bv.a.a().a(bsx.m), bk.a.a().a(ed.a(awg.j)).a(bv.a.a().a(bsx.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$2)
         .a(
            cut.rT,
            wz.c("advancements.adventure.crafters_crafting_crafters.title"),
            wz.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", ds.a.b(akr.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$15)
         .a(
            cut.tY,
            wz.c("advancements.adventure.who_needs_rockets.title"),
            wz.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(dh.c.b(7.0)), bv.a.a().a(bsx.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$15)
         .a(cut.ub, wz.c("advancements.adventure.overoverkill.title"), wz.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dm.a.a(bj.a.a().a(dh.c.b(100.0)).a(bk.a.a().a(ed.a(awg.D)).a(bv.a.a().a(bsx.by).a(bs.a.a().f(cs.a.a().a(cut.ub)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, List<bsx<?>> $$2) {
      ag $$3 = a(af.a.a(), $$2)
         .a($$0)
         .a(cut.pb, wz.c("advancements.adventure.kill_a_mob.title"), wz.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2)
         .a($$3)
         .a(cut.pg, wz.c("advancements.adventure.kill_all_mobs.title"), wz.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static ao<cw.a> a(dfy $$0) {
      eva.a[] $$1 = dhi.aE.a().stream().map($$0x -> {
         eb.a $$1x = eb.a.a().a(dhi.aE, $$0x);
         aw.a $$2 = aw.a.a().a(dga.gY).a($$1x);
         return euy.a(df.a.a().a($$2), new jd($$0x.g().q()));
      }).toArray(eva.a[]::new);
      return cw.a.a(euz.a($$0), euo.a($$1));
   }

   private static ao<cw.a> b(dfy $$0) {
      eva.a[] $$1 = dhi.aE.a().stream().map($$1x -> {
         eb.a $$2 = eb.a.a().a(dhi.aE, $$1x);
         euz.a $$3 = new euz.a(dga.gY).a($$2);
         eva.a $$4 = euy.a(df.a.a().a(aw.a.a().a($$0)), new jd($$1x.q()));
         return eun.a($$3, $$4);
      }).toArray(eva.a[]::new);
      return cw.a.a(euo.a($$1));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cul> $$1 = Set.of(cut.xG, cut.xE, cut.xF, cut.xA, cut.xJ, cut.xC, cut.xD, cut.xH);
      oy.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ds.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      oy.b().map(oy.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ds.a.a($$1)));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      List<Pair<String, ao<dg.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", dg.a.a(erl.be)),
         Pair.of("desert_well", dg.a.a(erl.bd)),
         Pair.of("ocean_ruin_cold", dg.a.a(erl.bi)),
         Pair.of("ocean_ruin_warm", dg.a.a(erl.bh)),
         Pair.of("trail_ruins_rare", dg.a.a(erl.bg)),
         Pair.of("trail_ruins_common", dg.a.a(erl.bf))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", cg.a.a(cs.a.a().a(awn.bo)));
      $$0.a(new aj(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jo.a $$0, Consumer<ag> $$1, ag $$2, dek.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cut.pN,
            wz.c("advancements.adventure.adventuring_time.title"),
            wz.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, List<bsx<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lt.f.b($$1x).toString(), da.a.a(bv.a.a().a($$1x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jo.a $$1, List<akq<ddw>> $$2) {
      jn<ddw> $$3 = $$1.b(lu.aF);

      for (akq<ddw> $$4 : $$2) {
         $$0.a($$4.a().toString(), dq.a.a(df.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
