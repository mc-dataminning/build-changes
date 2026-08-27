import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kr implements ko {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final blt<?>[] e = new blt[]{
      blt.i,
      blt.l,
      blt.o,
      blt.v,
      blt.z,
      blt.B,
      blt.D,
      blt.F,
      blt.G,
      blt.H,
      blt.R,
      blt.W,
      blt.X,
      blt.aa,
      blt.am,
      blt.av,
      blt.ax,
      blt.ay,
      blt.az,
      blt.aE,
      blt.aH,
      blt.aJ,
      blt.aK,
      blt.aM,
      blt.aT,
      blt.aV,
      blt.bf,
      blt.bh,
      blt.bl,
      blt.bn,
      blt.bm,
      blt.bq,
      blt.bt,
      blt.br,
      blt.bu
   };

   private static an<ch.a> a(ck.d $$0, Optional<bp> $$1) {
      return ch.a.a(Optional.of(bp.a.a().a(bg.c(ck.c.c(30.0))).a(cg.a($$0)).b()), $$1);
   }

   private static an<dh.a> a(blt<?> $$0, cmm $$1) {
      return dh.a.a(bp.a.a().a(cq.d.a().a(bp.a.a().a($$0)).b()), ca.a.a().a($$1));
   }

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cmu.uc,
            vd.c("advancements.adventure.root.title"),
            vd.c("advancements.adventure.root.description"),
            new ahd("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cwl.bn, vd.c("advancements.adventure.sleep_in_bed.title"), vd.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", cr.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cuv.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cmu.ow, vd.c("advancements.adventure.trade.title"), vd.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", de.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cmu.ow,
            vd.c("advancements.adventure.trade_at_world_height.title"),
            vd.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cmu.oX, vd.c("advancements.adventure.kill_a_mob.title"), vd.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cmu.pc, vd.c("advancements.adventure.kill_all_mobs.title"), vd.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmu.or, vd.c("advancements.adventure.shoot_arrow.title"), vd.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", co.a.a(be.a.a().a(bf.a.a().a(db.a(asd.k)).a(bp.a.a().a(ase.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cmu.vI, vd.c("advancements.adventure.throw_trident.title"), vd.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", co.a.a(be.a.a().a(bf.a.a().a(db.a(asd.k)).a(bp.a.a().a(blt.bc)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cmu.vI,
            vd.c("advancements.adventure.very_very_frightening.title"),
            vd.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", ay.a.a(bp.a.a().a(blt.bg)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cwl.ee,
            vd.c("advancements.adventure.summon_iron_golem.title"),
            vd.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bp.a.a().a(blt.ad)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cmu.os, vd.c("advancements.adventure.sniper_duel.title"), vd.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cd.a.a(bp.a.a().a(blt.aK).a(bg.a(ck.c.b(50.0))), bf.a.a().a(db.a(asd.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cmu.vm,
            vd.c("advancements.adventure.totem_of_undying.title"),
            vd.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(cmu.vm))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cmu.vM, vd.c("advancements.adventure.ol_betsy.title"), vd.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cu.a.a(cmu.vM))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cmu.vM,
            vd.c("advancements.adventure.whos_the_pillager_now.title"),
            vd.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cc.a.a(bp.a.a().a(blt.az)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cmu.vM,
            vd.c("advancements.adventure.two_birds_one_arrow.title"),
            vd.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cc.a.a(bp.a.a().a(blt.av), bp.a.a().a(blt.av)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cmu.vM, vd.c("advancements.adventure.arbalistic.title"), vd.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cc.a.a(ck.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cgj.s(),
            vd.c("advancements.adventure.voluntary_exile.title"),
            vd.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cd.a.a(bp.a.a().a(ase.c).a(bm.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cgj.s(),
            vd.c("advancements.adventure.hero_of_the_village.title"),
            vd.c("advancements.adventure.hero_of_the_village.description"),
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
            cwl.pg.k(),
            vd.c("advancements.adventure.honey_block_slide.title"),
            vd.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cwl.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cwl.pd.k(), vd.c("advancements.adventure.bullseye.title"), vd.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dd.a.a(ck.d.a(15), Optional.of(bp.a(bp.a.a().a(bg.a(ck.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cmu.py,
            vd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vd.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cr.a.a(cwl.qP, cmu.py))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cmu.lW,
            vd.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vd.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ck.d.a(0), Optional.of(bp.a.a().a(blt.bg).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cmu.qU,
            vd.c("advancements.adventure.spyglass_at_parrot.title"),
            vd.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(blt.au, cmu.qU))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cmu.qU,
            vd.c("advancements.adventure.spyglass_at_ghast.title"),
            vd.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(blt.R, cmu.qU))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cmu.eX,
            vd.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vd.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cb.a.a(ci.a.a().d(cuo.D).a(au.a.a().a(cwl.dT)), ca.a.a().a(asj.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cmu.qU,
            vd.c("advancements.adventure.spyglass_at_dragon.title"),
            vd.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(blt.D, cmu.qU))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cmu.qw,
            vd.c("advancements.adventure.fall_from_world_height.title"),
            vd.c("advancements.adventure.fall_from_world_height.description"),
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
            cwl.qU,
            vd.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vd.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cwl.qQ,
            vd.c("advancements.adventure.avoid_vibration.title"),
            vd.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cmu.xi, vd.c("advancements.adventure.salvage_sherd.title"), vd.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dhe.a(new dhe.a(cmu.qI, cmu.xJ, cmu.qI, cmu.xH)),
            vd.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vd.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cs.a.a(new ahd("minecraft:decorated_pot"), List.of(ca.a.a().a(asj.aL), ca.a.a().a(asj.aL), ca.a.a().a(asj.aL), ca.a.a().a(asj.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cmr(cmu.xl),
            vd.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vd.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cmr(cmu.xx),
            vd.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vd.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cmu.eA,
            vd.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vd.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cwl.cm))
         .a("comparator", b(cwl.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static an<cb.a> a(cwj $$0) {
      ejo.a[] $$1 = cxt.aE.a().stream().map($$0x -> {
         cz.a $$1x = cz.a.a().a(cxt.aE, $$0x);
         au.a $$2 = au.a.a().a(cwl.gY).a($$1x);
         return ejm.a(ci.a.a().a($$2), new hx($$0x.g().q()));
      }).toArray(ejo.a[]::new);
      return cb.a.a(ejn.a($$0), ejd.a($$1));
   }

   private static an<cb.a> b(cwj $$0) {
      ejo.a[] $$1 = cxt.aE.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cxt.aE, $$1x);
         ejn.a $$3 = new ejn.a(cwl.gY).a($$2);
         ejo.a $$4 = ejm.a(ci.a.a().a(au.a.a().a($$0)), new hx($$1x.q()));
         return ejc.a($$3, $$4);
      }).toArray(ejo.a[]::new);
      return cb.a.a(ejd.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cmm> $$1 = Set.of(cmu.xu, cmu.xs, cmu.xt, cmu.xo, cmu.xx, cmu.xq, cmu.xr, cmu.xv);
      ni.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cs.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      ni.b().map(ni.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cs.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cj.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cj.a.a(egn.aP)),
         Pair.of("desert_well", cj.a.a(egn.aO)),
         Pair.of("ocean_ruin_cold", cj.a.a(egn.aT)),
         Pair.of("ocean_ruin_warm", cj.a.a(egn.aS)),
         Pair.of("trail_ruins_rare", cj.a.a(egn.aR)),
         Pair.of("trail_ruins_common", cj.a.a(egn.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", by.a.a(ca.a.a().a(asj.aL)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cuv.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cmu.pK,
            vd.c("advancements.adventure.adventuring_time.title"),
            vd.c("advancements.adventure.adventuring_time.description"),
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
      for (blt<?> $$1 : e) {
         $$0.a(kd.g.b($$1).toString(), cd.a.a(bp.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ahc<cuh>> $$1) {
      for (ahc<cuh> $$2 : $$1) {
         $$0.a($$2.a().toString(), cr.a.a(ci.a.a($$2)));
      }

      return $$0;
   }
}
