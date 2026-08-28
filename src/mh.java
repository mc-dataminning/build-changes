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
   protected static final List<bsw<?>> a = Arrays.asList(
      bsw.i,
      bsw.l,
      bsw.m,
      bsw.q,
      bsw.x,
      bsw.B,
      bsw.D,
      bsw.F,
      bsw.H,
      bsw.I,
      bsw.J,
      bsw.T,
      bsw.Y,
      bsw.Z,
      bsw.ac,
      bsw.ap,
      bsw.ay,
      bsw.aA,
      bsw.aB,
      bsw.aC,
      bsw.aH,
      bsw.aK,
      bsw.aM,
      bsw.aN,
      bsw.aP,
      bsw.aW,
      bsw.aY,
      bsw.bi,
      bsw.bk,
      bsw.bo,
      bsw.bq,
      bsw.bp,
      bsw.bt,
      bsw.bw,
      bsw.bu,
      bsw.bx
   );

   private static ao<de.a> a(dh.d $$0, Optional<bv> $$1) {
      return de.a.a(Optional.of(bv.a.a().a(bm.c(dh.c.c(30.0))).a(dd.a($$0)).b()), $$1);
   }

   private static ao<ej.a> a(bsw<?> $$0, cuj $$1) {
      return ej.a.a(bv.a.a().a(dp.d.a().a(bv.a.a().a($$0)).b()), cs.a.a().a($$1));
   }

   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            cur.uj,
            wy.c("advancements.adventure.root.title"),
            wy.c("advancements.adventure.root.description"),
            akq.b("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dfy.bn, wy.c("advancements.adventure.sleep_in_bed.title"), wy.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", dq.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dei.a.b);
      ag $$4 = af.a.a()
         .a($$2)
         .a(cur.oA, wy.c("advancements.adventure.trade.title"), wy.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", eg.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$4)
         .a(
            cur.oA,
            wy.c("advancements.adventure.trade_at_world_height.title"),
            wy.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cur.ov, wy.c("advancements.adventure.shoot_arrow.title"), wy.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awf.j)).a(bv.a.a().a(awh.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$7 = af.a.a()
         .a($$5)
         .a(cur.vS, wy.c("advancements.adventure.throw_trident.title"), wy.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", dm.a.a(bj.a.a().a(bk.a.a().a(ed.a(awf.j)).a(bv.a.a().a(bsw.bf)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$7)
         .a(
            cur.vS,
            wy.c("advancements.adventure.very_very_frightening.title"),
            wy.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bv.a.a().a(bsw.bj)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$4)
         .a(
            dfy.ee,
            wy.c("advancements.adventure.summon_iron_golem.title"),
            wy.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", ec.a.a(bv.a.a().a(bsw.af)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$6)
         .a(cur.ow, wy.c("advancements.adventure.sniper_duel.title"), wy.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", da.a.a(bv.a.a().a(bsw.aN).a(bm.a(dh.c.b(50.0))), bk.a.a().a(ed.a(awf.j))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$5)
         .a(
            cur.vt,
            wy.c("advancements.adventure.totem_of_undying.title"),
            wy.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", ei.a.a(cur.vt))
         .a($$1, "adventure/totem_of_undying");
      ag $$8 = af.a.a()
         .a($$2)
         .a(cur.vW, wy.c("advancements.adventure.ol_betsy.title"), wy.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", du.a.a(cur.vW))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$8)
         .a(
            cur.vW,
            wy.c("advancements.adventure.whos_the_pillager_now.title"),
            wy.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cz.a.a(bv.a.a().a(bsw.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$8)
         .a(
            cur.vW,
            wy.c("advancements.adventure.two_birds_one_arrow.title"),
            wy.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cz.a.a(bv.a.a().a(bsw.ay), bv.a.a().a(bsw.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$8)
         .a(cur.vW, wy.c("advancements.adventure.arbalistic.title"), wy.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cz.a.a(dh.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jo.b<dpv> $$9 = $$0.b(lu.d);
      ag $$10 = af.a.a()
         .a($$2)
         .a(
            cog.a($$9),
            wy.c("advancements.adventure.voluntary_exile.title"),
            wy.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", da.a.a(bv.a.a().a(awh.c).a(bs.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$10)
         .a(
            cog.a($$9),
            wy.c("advancements.adventure.hero_of_the_village.title"),
            wy.c("advancements.adventure.hero_of_the_village.description"),
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
            dfy.pg.r(),
            wy.c("advancements.adventure.honey_block_slide.title"),
            wy.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dx.a.a(dfy.pg))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$6)
         .a(dfy.pd.r(), wy.c("advancements.adventure.bullseye.title"), wy.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", ef.a.a(dh.d.a(15), Optional.of(bv.a(bv.a.a().a(bm.a(dh.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$3)
         .a(
            cur.pB,
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dq.a.a(dfy.qP, cur.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$2)
         .a(
            cur.lX,
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(dh.d.a(0), Optional.of(bv.a.a().a(bsw.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cur.qX,
            wy.c("advancements.adventure.spyglass_at_parrot.title"),
            wy.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsw.ax, cur.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$12 = af.a.a()
         .a($$11)
         .a(
            cur.qX,
            wy.c("advancements.adventure.spyglass_at_ghast.title"),
            wy.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsw.T, cur.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$3)
         .a(
            cur.eY,
            wy.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wy.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cw.a.a(df.a.a().a(jq.a($$0.b(lu.aF).b(deb.D))).a(aw.a.a().a(dfy.dT)), cs.a.a().a(cu.n, cq.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$12)
         .a(
            cur.qX,
            wy.c("advancements.adventure.spyglass_at_dragon.title"),
            wy.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsw.F, cur.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$2)
         .a(
            cur.qz,
            wy.c("advancements.adventure.fall_from_world_height.title"),
            wy.c("advancements.adventure.fall_from_world_height.description"),
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
            dfy.qU,
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dfy.qQ,
            wy.c("advancements.adventure.avoid_vibration.title"),
            wy.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cur.xu, wy.c("advancements.adventure.salvage_sherd.title"), wy.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$13)
         .a(
            dqv.a(new drk(Optional.empty(), Optional.of(cur.xZ), Optional.empty(), Optional.of(cur.xV))),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ds.a.a(akq.b("decorated_pot"), List.of(cs.a.a().a(awm.bo), cs.a.a().a(awm.bo), cs.a.a().a(awm.bo), cs.a.a().a(awm.bo)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$14 = b(af.a.a())
         .a($$2)
         .a(
            new cuo(cur.xx),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cuo(cur.xJ),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cur.eB,
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a(dfy.cm))
         .a("comparator", b(dfy.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      af.a.a()
         .a($$2)
         .a(
            cur.oq,
            wy.c("advancements.adventure.brush_armadillo.title"),
            wy.c("advancements.adventure.brush_armadillo.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dn.a.a(cs.a.a().a(cur.xu), Optional.of(bv.a(bv.a.a().a(bsw.c)))))
         .a($$1, "adventure/brush_armadillo");
      ag $$15 = af.a.a()
         .a($$2)
         .a(
            dfy.qH,
            wy.c("advancements.adventure.minecraft_trials_edition.title"),
            wy.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dq.a.a(df.a.b($$0.b(lu.aR).b(ejg.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$15)
         .a(cur.yt, wy.c("advancements.adventure.lighten_up.title"), wy.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cw.a.a(df.a.a().a(aw.a.a().a(dfy.sn, dfy.sm, dfy.sl, dfy.sr, dfy.sq, dfy.sp).a(eb.a.a().a(dhk.c, true))), cs.a.a().a(mi.c)))
         .a($$1, "adventure/lighten_up");
      ag $$16 = af.a.a()
         .a($$15)
         .a(
            cur.yC,
            wy.c("advancements.adventure.under_lock_and_key.title"),
            wy.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cw.a.a(df.a.a().a(aw.a.a().a(dfy.ts).a(eb.a.a().a(dos.d, false))), cs.a.a().a(cur.yC)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$16)
         .a(cur.yD, wy.c("advancements.adventure.revaulting.title"), wy.c("advancements.adventure.revaulting.description"), null, am.c, true, true, false)
         .a("revaulting", cw.a.a(df.a.a().a(aw.a.a().a(dfy.ts).a(eb.a.a().a(dos.d, true))), cs.a.a().a(cur.yD)))
         .a($$1, "adventure/revaulting");
      af.a.a()
         .a($$15)
         .a(cur.tY, wy.c("advancements.adventure.blowback.title"), wy.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", da.a.a(bv.a.a().a(bsw.m), bk.a.a().a(ed.a(awf.j)).a(bv.a.a().a(bsw.n))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$2)
         .a(
            cur.rT,
            wy.c("advancements.adventure.crafters_crafting_crafters.title"),
            wy.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", ds.a.b(akq.b("crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$15)
         .a(
            cur.tY,
            wy.c("advancements.adventure.who_needs_rockets.title"),
            wy.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bz.a.a(bm.b(dh.c.b(7.0)), bv.a.a().a(bsw.bn)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$15)
         .a(cur.ub, wy.c("advancements.adventure.overoverkill.title"), wy.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", dm.a.a(bj.a.a().a(dh.c.b(100.0)).a(bk.a.a().a(ed.a(awf.D)).a(bv.a.a().a(bsw.by).a(bs.a.a().f(cs.a.a().a(cur.ub)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, List<bsw<?>> $$2) {
      ag $$3 = a(af.a.a(), $$2)
         .a($$0)
         .a(cur.pb, wy.c("advancements.adventure.kill_a_mob.title"), wy.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2)
         .a($$3)
         .a(cur.pg, wy.c("advancements.adventure.kill_all_mobs.title"), wy.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static ao<cw.a> a(dfw $$0) {
      euw.a[] $$1 = dhg.aE.a().stream().map($$0x -> {
         eb.a $$1x = eb.a.a().a(dhg.aE, $$0x);
         aw.a $$2 = aw.a.a().a(dfy.gY).a($$1x);
         return euu.a(df.a.a().a($$2), new jd($$0x.g().q()));
      }).toArray(euw.a[]::new);
      return cw.a.a(euv.a($$0), euk.a($$1));
   }

   private static ao<cw.a> b(dfw $$0) {
      euw.a[] $$1 = dhg.aE.a().stream().map($$1x -> {
         eb.a $$2 = eb.a.a().a(dhg.aE, $$1x);
         euv.a $$3 = new euv.a(dfy.gY).a($$2);
         euw.a $$4 = euu.a(df.a.a().a(aw.a.a().a($$0)), new jd($$1x.q()));
         return euj.a($$3, $$4);
      }).toArray(euw.a[]::new);
      return cw.a.a(euk.a($$1));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cuj> $$1 = Set.of(cur.xG, cur.xE, cur.xF, cur.xA, cur.xJ, cur.xC, cur.xD, cur.xH);
      ox.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ds.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      ox.b().map(ox.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ds.a.a($$1)));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      List<Pair<String, ao<dg.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", dg.a.a(erh.be)),
         Pair.of("desert_well", dg.a.a(erh.bd)),
         Pair.of("ocean_ruin_cold", dg.a.a(erh.bi)),
         Pair.of("ocean_ruin_warm", dg.a.a(erh.bh)),
         Pair.of("trail_ruins_rare", dg.a.a(erh.bg)),
         Pair.of("trail_ruins_common", dg.a.a(erh.bf))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", cg.a.a(cs.a.a().a(awm.bo)));
      $$0.a(new aj(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jo.a $$0, Consumer<ag> $$1, ag $$2, dei.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cur.pN,
            wy.c("advancements.adventure.adventuring_time.title"),
            wy.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, List<bsw<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lt.f.b($$1x).toString(), da.a.a(bv.a.a().a($$1x))));
      return $$0;
   }

   protected static af.a a(af.a $$0, jo.a $$1, List<akp<ddu>> $$2) {
      jn<ddu> $$3 = $$1.b(lu.aF);

      for (akp<ddu> $$4 : $$2) {
         $$0.a($$4.a().toString(), dq.a.a(df.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
