import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mt implements mq {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bwm<?>> a = Arrays.asList(
      bwm.o,
      bwm.q,
      bwm.r,
      bwm.v,
      bwm.D,
      bwm.E,
      bwm.K,
      bwm.M,
      bwm.P,
      bwm.N,
      bwm.O,
      bwm.S,
      bwm.ad,
      bwm.ai,
      bwm.aj,
      bwm.am,
      bwm.az,
      bwm.aP,
      bwm.aR,
      bwm.aS,
      bwm.aT,
      bwm.aZ,
      bwm.bc,
      bwm.be,
      bwm.bf,
      bwm.bh,
      bwm.bo,
      bwm.bs,
      bwm.bC,
      bwm.bE,
      bwm.bI,
      bwm.bK,
      bwm.bJ,
      bwm.bN,
      bwm.bQ,
      bwm.bO,
      bwm.bR
   );

   private static aq<cs.a> a(cv.d $$0, Optional<bx> $$1) {
      return cs.a.a(Optional.of(bx.a.a().a(bo.c(cv.c.c(30.0))).a(cr.a($$0)).b()), $$1);
   }

   private static aq<dy.a> a(bx.a $$0, cl.a $$1) {
      return dy.a.a(bx.a.a().a(dc.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwm<?>> $$2 = $$0.e(mg.B);
      jf<cyu> $$3 = $$0.e(mg.K);
      jf<dma> $$4 = $$0.e(mg.i);
      ai $$5 = ah.a.a()
         .a(
            czc.vo,
            wy.c("advancements.adventure.root.title"),
            wy.c("advancements.adventure.root.description"),
            alg.b("gui/advancements/backgrounds/adventure"),
            ao.a,
            false,
            false,
            false
         )
         .a(al.a.b)
         .a("killed_something", co.a.b())
         .a("killed_by_something", co.a.d())
         .a($$1, "adventure/root");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(dmc.bu, wy.c("advancements.adventure.sleep_in_bed.title"), wy.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", dd.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dkm.a.b);
      ai $$7 = ah.a.a()
         .a($$5)
         .a(czc.pl, wy.c("advancements.adventure.trade.title"), wy.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", dv.a.b())
         .a($$1, "adventure/trade");
      ah.a.a()
         .a($$7)
         .a(
            czc.pl,
            wy.c("advancements.adventure.trade_at_world_height.title"),
            wy.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dv.a.a(bx.a.a().a(ct.a.a(cv.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ai $$8 = a($$5, $$1, $$2, a);
      ai $$9 = ah.a.a()
         .a($$8)
         .a(czc.pg, wy.c("advancements.adventure.shoot_arrow.title"), wy.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", da.a.a(bl.a.a().a(bm.a.a().a(ds.a(axd.j)).a(bx.a.a().a($$2, axf.f)))))
         .a($$1, "adventure/shoot_arrow");
      ai $$10 = ah.a.a()
         .a($$8)
         .a(czc.wY, wy.c("advancements.adventure.throw_trident.title"), wy.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", da.a.a(bl.a.a().a(bm.a.a().a(ds.a(axd.j)).a(bx.a.a().a($$2, bwm.bz)))))
         .a($$1, "adventure/throw_trident");
      ah.a.a()
         .a($$10)
         .a(
            czc.wY,
            wy.c("advancements.adventure.very_very_frightening.title"),
            wy.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", bc.a.a(bx.a.a().a($$2, bwm.bD)))
         .a($$1, "adventure/very_very_frightening");
      ah.a.a()
         .a($$7)
         .a(
            dmc.es,
            wy.c("advancements.adventure.summon_iron_golem.title"),
            wy.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dr.a.a(bx.a.a().a($$2, bwm.ap)))
         .a($$1, "adventure/summon_iron_golem");
      ah.a.a()
         .a($$9)
         .a(czc.ph, wy.c("advancements.adventure.sniper_duel.title"), wy.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("killed_skeleton", co.a.a(bx.a.a().a($$2, bwm.bf).a(bo.a(cv.c.b(50.0))), bm.a.a().a(ds.a(axd.j))))
         .a($$1, "adventure/sniper_duel");
      ah.a.a()
         .a($$8)
         .a(
            czc.wz,
            wy.c("advancements.adventure.totem_of_undying.title"),
            wy.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", dx.a.a($$3, czc.wz))
         .a($$1, "adventure/totem_of_undying");
      ai $$11 = ah.a.a()
         .a($$5)
         .a(czc.xb, wy.c("advancements.adventure.ol_betsy.title"), wy.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", di.a.a($$3, czc.xb))
         .a($$1, "adventure/ol_betsy");
      ah.a.a()
         .a($$11)
         .a(
            czc.xb,
            wy.c("advancements.adventure.whos_the_pillager_now.title"),
            wy.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cn.a.a($$3, bx.a.a().a($$2, bwm.aT)))
         .a($$1, "adventure/whos_the_pillager_now");
      ah.a.a()
         .a($$11)
         .a(
            czc.xb,
            wy.c("advancements.adventure.two_birds_one_arrow.title"),
            wy.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(65))
         .a("two_birds", cn.a.a($$3, bx.a.a().a($$2, bwm.aP), bx.a.a().a($$2, bwm.aP)))
         .a($$1, "adventure/two_birds_one_arrow");
      ah.a.a()
         .a($$11)
         .a(czc.xb, wy.c("advancements.adventure.arbalistic.title"), wy.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(am.a.a(85))
         .a("arbalistic", cn.a.a($$3, cv.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jg.b<dwm> $$12 = $$0.e(mg.aF);
      ai $$13 = ah.a.a()
         .a($$5)
         .a(
            csn.a($$12),
            wy.c("advancements.adventure.voluntary_exile.title"),
            wy.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", co.a.a(bx.a.a().a($$2, axf.c).a(bu.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ah.a.a()
         .a($$13)
         .a(
            csn.a($$12),
            wy.c("advancements.adventure.hero_of_the_village.title"),
            wy.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ao.b,
            true,
            true,
            true
         )
         .a(am.a.a(100))
         .a("hero_of_the_village", dd.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ah.a.a()
         .a($$5)
         .a(
            dmc.pL.h(),
            wy.c("advancements.adventure.honey_block_slide.title"),
            wy.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dl.a.a(dmc.pL))
         .a($$1, "adventure/honey_block_slide");
      ah.a.a()
         .a($$9)
         .a(dmc.pI.h(), wy.c("advancements.adventure.bullseye.title"), wy.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("bullseye", du.a.a(cv.d.a(15), Optional.of(bx.a(bx.a.a().a(bo.a(cv.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ah.a.a()
         .a($$6)
         .a(
            czc.qm,
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wy.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dd.a.a($$4, $$3, dmc.ru, czc.qm))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ah.a.a()
         .a($$5)
         .a(
            czc.my,
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wy.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cv.d.a(0), Optional.of(bx.a.a().a($$2, bwm.bD).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ai $$14 = ah.a.a()
         .a($$5)
         .a(
            czc.sa,
            wy.c("advancements.adventure.spyglass_at_parrot.title"),
            wy.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bx.a.a().a($$2, bwm.aO), cl.a.a().a($$3, czc.sa)))
         .a($$1, "adventure/spyglass_at_parrot");
      ai $$15 = ah.a.a()
         .a($$14)
         .a(
            czc.sa,
            wy.c("advancements.adventure.spyglass_at_ghast.title"),
            wy.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bx.a.a().a($$2, bwm.ad), cl.a.a().a($$3, czc.sa)))
         .a($$1, "adventure/spyglass_at_ghast");
      ah.a.a()
         .a($$6)
         .a(
            czc.fq,
            wy.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wy.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cm.a.a(ct.a.a().a(ji.a($$0.e(mg.aG).b(dkf.E))).a(ay.a.a().a($$4, dmc.eh)), cl.a.a().a(kt.n, kx.b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ah.a.a()
         .a($$15)
         .a(
            czc.sa,
            wy.c("advancements.adventure.spyglass_at_dragon.title"),
            wy.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bx.a.a().a($$2, bwm.P), cl.a.a().a($$3, czc.sa)))
         .a($$1, "adventure/spyglass_at_dragon");
      ah.a.a()
         .a($$5)
         .a(
            czc.rm,
            wy.c("advancements.adventure.fall_from_world_height.title"),
            wy.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bp.a.a(bx.a.a().a(ct.a.a(cv.c.c(-59.0))), bo.b(cv.c.b(379.0)), ct.a.a(cv.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ah.a.a()
         .a($$8)
         .a(
            dmc.rz,
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wy.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", co.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ah.a.a()
         .a($$5)
         .a(
            dmc.rv,
            wy.c("advancements.adventure.avoid_vibration.title"),
            wy.c("advancements.adventure.avoid_vibration.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dd.a.d())
         .a($$1, "adventure/avoid_vibration");
      ai $$16 = a($$3, ah.a.a())
         .a($$5)
         .a(czc.yB, wy.c("advancements.adventure.salvage_sherd.title"), wy.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ah.a.a()
         .a($$16)
         .a(
            dxp.a(new dyf(Optional.empty(), Optional.of(czc.zg), Optional.empty(), Optional.of(czc.zc))),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wy.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            df.a.a(
               alf.a(mg.bt, alg.b("decorated_pot")),
               List.of(cl.a.a().a($$3, axk.bE), cl.a.a().a($$3, axk.bE), cl.a.a().a($$3, axk.bE), cl.a.a().a($$3, axk.bE))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ai $$17 = b(ah.a.a())
         .a($$5)
         .a(
            new cyy(czc.yE),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wy.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ah.a.a())
         .a($$17)
         .a(
            new cyy(czc.yQ),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wy.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ah.a.a()
         .a($$5)
         .a(
            czc.eS,
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wy.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(al.a.b)
         .a("chiseled_bookshelf", a($$4, dmc.cu))
         .a("comparator", b($$4, dmc.cu))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ah.a.a()
         .a($$5)
         .a(
            czc.pb,
            wy.c("advancements.adventure.brush_armadillo.title"),
            wy.c("advancements.adventure.brush_armadillo.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", db.a.a(cl.a.a().a($$3, czc.yB), Optional.of(bx.a(bx.a.a().a($$2, bwm.e)))))
         .a($$1, "adventure/brush_armadillo");
      ai $$18 = ah.a.a()
         .a($$5)
         .a(
            dmc.rm,
            wy.c("advancements.adventure.minecraft_trials_edition.title"),
            wy.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dd.a.a(ct.a.b($$0.e(mg.bd).b(eqn.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ah.a.a()
         .a($$18)
         .a(czc.zA, wy.c("advancements.adventure.lighten_up.title"), wy.c("advancements.adventure.lighten_up.description"), null, ao.a, true, true, false)
         .a("lighten_up", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmc.sS, dmc.sR, dmc.sQ, dmc.sW, dmc.sV, dmc.sU).a(dq.a.a().a(dno.c, true))), cl.a.a().a($$3, mu.c)))
         .a($$1, "adventure/lighten_up");
      ai $$19 = ah.a.a()
         .a($$18)
         .a(
            czc.zJ,
            wy.c("advancements.adventure.under_lock_and_key.title"),
            wy.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmc.tZ).a(dq.a.a().a(dvi.d, false))), cl.a.a().a($$3, czc.zJ)))
         .a($$1, "adventure/under_lock_and_key");
      ah.a.a()
         .a($$19)
         .a(czc.zK, wy.c("advancements.adventure.revaulting.title"), wy.c("advancements.adventure.revaulting.description"), null, ao.c, true, true, false)
         .a("revaulting", cm.a.a(ct.a.a().a(ay.a.a().a($$4, dmc.tZ).a(dq.a.a().a(dvi.d, true))), cl.a.a().a($$3, czc.zK)))
         .a($$1, "adventure/revaulting");
      ah.a.a()
         .a($$18)
         .a(czc.vc, wy.c("advancements.adventure.blowback.title"), wy.c("advancements.adventure.blowback.description"), null, ao.b, true, true, false)
         .a(am.a.a(40))
         .a("blowback", co.a.a(bx.a.a().a($$2, bwm.r), bm.a.a().a(ds.a(axd.j)).a(bx.a.a().a($$2, bwm.s))))
         .a($$1, "adventure/blowback");
      ah.a.a()
         .a($$5)
         .a(
            czc.sW,
            wy.c("advancements.adventure.crafters_crafting_crafters.title"),
            wy.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", df.a.b(alf.a(mg.bt, alg.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ah.a.a()
         .a($$18)
         .a(
            czc.vc,
            wy.c("advancements.adventure.who_needs_rockets.title"),
            wy.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cb.a.a(bo.b(cv.c.b(7.0)), bx.a.a().a($$2, bwm.bH)))
         .a($$1, "adventure/who_needs_rockets");
      ah.a.a()
         .a($$18)
         .a(czc.vg, wy.c("advancements.adventure.overoverkill.title"), wy.c("advancements.adventure.overoverkill.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("overoverkill", da.a.a(bl.a.a().a(cv.c.b(100.0)).a(bm.a.a().a(ds.a(axd.H)).a(bx.a.a().a($$2, bwm.bS).a(bu.a.a().f(cl.a.a().a($$3, czc.vg)))))))
         .a($$1, "adventure/overoverkill");
   }

   public static ai a(ai $$0, Consumer<ai> $$1, jf<bwm<?>> $$2, List<bwm<?>> $$3) {
      ai $$4 = a(ah.a.a(), $$2, $$3)
         .a($$0)
         .a(czc.pM, wy.c("advancements.adventure.kill_a_mob.title"), wy.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ah.a.a(), $$2, $$3)
         .a($$4)
         .a(czc.pR, wy.c("advancements.adventure.kill_all_mobs.title"), wy.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(am.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static aq<cm.a> a(jf<dma> $$0, dma $$1) {
      fci.a[] $$2 = dnk.e.a().stream().map($$1x -> {
         dq.a $$2x = dq.a.a().a(dnk.e, $$1x);
         ay.a $$3 = ay.a.a().a($$0, dmc.hw).a($$2x);
         return fcg.a(ct.a.a().a($$3), new iu($$1x.g().q()));
      }).toArray(fci.a[]::new);
      return cm.a.a(fch.a($$1), fbw.a($$2));
   }

   private static aq<cm.a> b(jf<dma> $$0, dma $$1) {
      fci.a[] $$2 = dnk.e.a().stream().map($$2x -> {
         dq.a $$3 = dq.a.a().a(dnk.e, $$2x);
         fch.a $$4 = new fch.a(dmc.hw).a($$3);
         fci.a $$5 = fcg.a(ct.a.a().a(ay.a.a().a($$0, $$1)), new iu($$2x.q()));
         return fbv.a($$4, $$5);
      }).toArray(fci.a[]::new);
      return cm.a.a(fbw.a($$2));
   }

   private static ah.a a(ah.a $$0) {
      $$0.a(al.a.a);
      Set<cyu> $$1 = Set.of(czc.yN, czc.yL, czc.yM, czc.yH, czc.yQ, czc.yJ, czc.yK, czc.yO);
      oq.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), df.a.a($$1x.c())));
      return $$0;
   }

   private static ah.a b(ah.a $$0) {
      $$0.a(al.a.b);
      oq.b().map(oq.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), df.a.a((alf<ddp<?>>)$$1)));
      return $$0;
   }

   private static ah.a a(jf<cyu> $$0, ah.a $$1) {
      List<Pair<String, aq<cu.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cu.a.a(eyv.aY)),
         Pair.of("desert_well", cu.a.a(eyv.aX)),
         Pair.of("ocean_ruin_cold", cu.a.a(eyv.bc)),
         Pair.of("ocean_ruin_warm", cu.a.a(eyv.bb)),
         Pair.of("trail_ruins_rare", cu.a.a(eyv.ba)),
         Pair.of("trail_ruins_common", cu.a.a(eyv.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (aq<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cj.a.a(cl.a.a().a($$0, axk.bE)));
      $$1.a(new al(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jg.a $$0, Consumer<ai> $$1, ai $$2, dkm.a $$3) {
      a(ah.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            czc.qy,
            wy.c("advancements.adventure.adventuring_time.title"),
            wy.c("advancements.adventure.adventuring_time.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(am.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ah.a a(ah.a $$0, jf<bwm<?>> $$1, List<bwm<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mf.f.b($$2x).toString(), co.a.a(bx.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ah.a a(ah.a $$0, jg.a $$1, List<alf<djy>> $$2) {
      jf<djy> $$3 = $$1.e(mg.aG);

      for (alf<djy> $$4 : $$2) {
         $$0.a($$4.a().toString(), dd.a.a(ct.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
