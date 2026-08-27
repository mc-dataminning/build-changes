import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kp implements km {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final blj<?>[] e = new blj[]{
      blj.i,
      blj.o,
      blj.v,
      blj.z,
      blj.B,
      blj.D,
      blj.F,
      blj.G,
      blj.H,
      blj.R,
      blj.W,
      blj.X,
      blj.aa,
      blj.am,
      blj.av,
      blj.ax,
      blj.ay,
      blj.az,
      blj.aE,
      blj.aH,
      blj.aJ,
      blj.aK,
      blj.aM,
      blj.aT,
      blj.aV,
      blj.bf,
      blj.bh,
      blj.bl,
      blj.bn,
      blj.bm,
      blj.bq,
      blj.bt,
      blj.br,
      blj.bu
   };

   private static an<ch.a> a(ck.d $$0, Optional<bp> $$1) {
      return ch.a.a(Optional.of(bp.a.a().a(bg.c(ck.c.c(30.0))).a(cg.a($$0)).b()), $$1);
   }

   private static an<dh.a> a(blj<?> $$0, cmc $$1) {
      return dh.a.a(bp.a.a().a(cq.d.a().a(bp.a.a().a($$0)).b()), ca.a.a().a($$1));
   }

   @Override
   public void a(ih.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cmk.uc,
            vb.c("advancements.adventure.root.title"),
            vb.c("advancements.adventure.root.description"),
            new agt("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cd.a.b())
         .a("killed_by_something", cd.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cwb.bn, vb.c("advancements.adventure.sleep_in_bed.title"), vb.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", cr.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cul.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cmk.ow, vb.c("advancements.adventure.trade.title"), vb.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", de.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cmk.ow,
            vb.c("advancements.adventure.trade_at_world_height.title"),
            vb.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", de.a.a(bp.a.a().a(ci.a.a(ck.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = d(ae.a.a())
         .a($$2)
         .a(cmk.oX, vb.c("advancements.adventure.kill_a_mob.title"), vb.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cmk.pc, vb.c("advancements.adventure.kill_all_mobs.title"), vb.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmk.or, vb.c("advancements.adventure.shoot_arrow.title"), vb.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", co.a.a(be.a.a().a(bf.a.a().a(db.a(art.k)).a(bp.a.a().a(aru.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cmk.vI, vb.c("advancements.adventure.throw_trident.title"), vb.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", co.a.a(be.a.a().a(bf.a.a().a(db.a(art.k)).a(bp.a.a().a(blj.bc)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cmk.vI,
            vb.c("advancements.adventure.very_very_frightening.title"),
            vb.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", ay.a.a(bp.a.a().a(blj.bg)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cwb.ee,
            vb.c("advancements.adventure.summon_iron_golem.title"),
            vb.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bp.a.a().a(blj.ad)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cmk.os, vb.c("advancements.adventure.sniper_duel.title"), vb.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cd.a.a(bp.a.a().a(blj.aK).a(bg.a(ck.c.b(50.0))), bf.a.a().a(db.a(art.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cmk.vm,
            vb.c("advancements.adventure.totem_of_undying.title"),
            vb.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(cmk.vm))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cmk.vM, vb.c("advancements.adventure.ol_betsy.title"), vb.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cu.a.a(cmk.vM))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cmk.vM,
            vb.c("advancements.adventure.whos_the_pillager_now.title"),
            vb.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cc.a.a(bp.a.a().a(blj.az)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cmk.vM,
            vb.c("advancements.adventure.two_birds_one_arrow.title"),
            vb.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cc.a.a(bp.a.a().a(blj.av), bp.a.a().a(blj.av)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cmk.vM, vb.c("advancements.adventure.arbalistic.title"), vb.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cc.a.a(ck.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cfz.s(),
            vb.c("advancements.adventure.voluntary_exile.title"),
            vb.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cd.a.a(bp.a.a().a(aru.c).a(bm.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cfz.s(),
            vb.c("advancements.adventure.hero_of_the_village.title"),
            vb.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", cr.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            cwb.pg.k(),
            vb.c("advancements.adventure.honey_block_slide.title"),
            vb.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cwb.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cwb.pd.k(), vb.c("advancements.adventure.bullseye.title"), vb.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dd.a.a(ck.d.a(15), Optional.of(bp.a(bp.a.a().a(bg.a(ck.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cmk.py,
            vb.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vb.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cr.a.a(cwb.qP, cmk.py))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cmk.lW,
            vb.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vb.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ck.d.a(0), Optional.of(bp.a.a().a(blj.bg).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cmk.qU,
            vb.c("advancements.adventure.spyglass_at_parrot.title"),
            vb.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(blj.au, cmk.qU))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cmk.qU,
            vb.c("advancements.adventure.spyglass_at_ghast.title"),
            vb.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(blj.R, cmk.qU))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cmk.eX,
            vb.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vb.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cb.a.a(ci.a.a().d(cue.D).a(au.a.a().a(cwb.dT)), ca.a.a().a(arz.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cmk.qU,
            vb.c("advancements.adventure.spyglass_at_dragon.title"),
            vb.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(blj.D, cmk.qU))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cmk.qw,
            vb.c("advancements.adventure.fall_from_world_height.title"),
            vb.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bh.a.a(bp.a.a().a(ci.a.a(ck.c.c(-59.0))), bg.b(ck.c.b(379.0)), ci.a.a(ck.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            cwb.qU,
            vb.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vb.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cd.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            cwb.qQ,
            vb.c("advancements.adventure.avoid_vibration.title"),
            vb.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cr.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$12 = c(ae.a.a())
         .a($$2)
         .a(cmk.xi, vb.c("advancements.adventure.salvage_sherd.title"), vb.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dgt.a(new dgt.a(cmk.qI, cmk.xJ, cmk.qI, cmk.xH)),
            vb.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vb.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cs.a.a(new agt("minecraft:decorated_pot"), List.of(ca.a.a().a(arz.aL), ca.a.a().a(arz.aL), ca.a.a().a(arz.aL), ca.a.a().a(arz.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cmh(cmk.xl),
            vb.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vb.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$13)
         .a(
            new cmh(cmk.xx),
            vb.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vb.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cmk.eA,
            vb.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vb.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cwb.cm))
         .a("comparator", b(cwb.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static an<cb.a> a(cvz $$0) {
      ejd.a[] $$1 = cxj.aE.a().stream().map($$0x -> {
         cz.a $$1x = cz.a.a().a(cxj.aE, $$0x);
         au.a $$2 = au.a.a().a(cwb.gY).a($$1x);
         return ejb.a(ci.a.a().a($$2), new hv($$0x.g().q()));
      }).toArray(ejd.a[]::new);
      return cb.a.a(ejc.a($$0), eis.a($$1));
   }

   private static an<cb.a> b(cvz $$0) {
      ejd.a[] $$1 = cxj.aE.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cxj.aE, $$1x);
         ejc.a $$3 = new ejc.a(cwb.gY).a($$2);
         ejd.a $$4 = ejb.a(ci.a.a().a(au.a.a().a($$0)), new hv($$1x.q()));
         return eir.a($$3, $$4);
      }).toArray(ejd.a[]::new);
      return cb.a.a(eis.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cmc> $$1 = Set.of(cmk.xu, cmk.xs, cmk.xt, cmk.xo, cmk.xx, cmk.xq, cmk.xr, cmk.xv);
      ng.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cs.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      ng.b().map(ng.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cs.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cj.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cj.a.a(egc.aP)),
         Pair.of("desert_well", cj.a.a(egc.aO)),
         Pair.of("ocean_ruin_cold", cj.a.a(egc.aT)),
         Pair.of("ocean_ruin_warm", cj.a.a(egc.aS)),
         Pair.of("trail_ruins_rare", cj.a.a(egc.aR)),
         Pair.of("trail_ruins_common", cj.a.a(egc.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", by.a.a(ca.a.a().a(arz.aL)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cul.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cmk.pK,
            vb.c("advancements.adventure.adventuring_time.title"),
            vb.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a d(ae.a $$0) {
      for (blj<?> $$1 : e) {
         $$0.a(kb.g.b($$1).toString(), cd.a.a(bp.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ags<ctx>> $$1) {
      for (ags<ctx> $$2 : $$1) {
         $$0.a($$2.a().toString(), cr.a.a(ci.a.a($$2)));
      }

      return $$0;
   }
}
