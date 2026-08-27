import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kt implements ko {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bly<?>> a = Arrays.asList(
      bly.i,
      bly.o,
      bly.v,
      bly.z,
      bly.B,
      bly.D,
      bly.F,
      bly.G,
      bly.H,
      bly.R,
      bly.W,
      bly.X,
      bly.aa,
      bly.am,
      bly.av,
      bly.ax,
      bly.ay,
      bly.az,
      bly.aE,
      bly.aH,
      bly.aJ,
      bly.aK,
      bly.aM,
      bly.aT,
      bly.aV,
      bly.bf,
      bly.bh,
      bly.bl,
      bly.bn,
      bly.bm,
      bly.bq,
      bly.bt,
      bly.br,
      bly.bu
   );

   private static an<ch.a> a(ck.d $$0, Optional<bp> $$1) {
      return ch.a.a(Optional.of(bp.a.a().a(bg.c(ck.c.c(30.0))).a(cg.a($$0)).b()), $$1);
   }

   private static an<dh.a> a(bly<?> $$0, cms $$1) {
      return dh.a.a(bp.a.a().a(cq.d.a().a(bp.a.a().a($$0)).b()), ca.a.a().a($$1));
   }

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cna.uc,
            vf.c("advancements.adventure.root.title"),
            vf.c("advancements.adventure.root.description"),
            new ahg("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cwr.bn, vf.c("advancements.adventure.sleep_in_bed.title"), vf.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", cr.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cvb.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cna.ow, vf.c("advancements.adventure.trade.title"), vf.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", de.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cna.ow,
            vf.c("advancements.adventure.trade_at_world_height.title"),
            vf.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", de.a.a(bp.a.a().a(ci.a.a(ck.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(cna.or, vf.c("advancements.adventure.shoot_arrow.title"), vf.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", co.a.a(be.a.a().a(bf.a.a().a(db.a(asi.k)).a(bp.a.a().a(asj.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cna.vI, vf.c("advancements.adventure.throw_trident.title"), vf.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", co.a.a(be.a.a().a(bf.a.a().a(db.a(asi.k)).a(bp.a.a().a(bly.bc)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cna.vI,
            vf.c("advancements.adventure.very_very_frightening.title"),
            vf.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", ay.a.a(bp.a.a().a(bly.bg)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cwr.ee,
            vf.c("advancements.adventure.summon_iron_golem.title"),
            vf.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bp.a.a().a(bly.ad)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cna.os, vf.c("advancements.adventure.sniper_duel.title"), vf.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cd.a.a(bp.a.a().a(bly.aK).a(bg.a(ck.c.b(50.0))), bf.a.a().a(db.a(asi.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cna.vm,
            vf.c("advancements.adventure.totem_of_undying.title"),
            vf.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(cna.vm))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cna.vM, vf.c("advancements.adventure.ol_betsy.title"), vf.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cu.a.a(cna.vM))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cna.vM,
            vf.c("advancements.adventure.whos_the_pillager_now.title"),
            vf.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cc.a.a(bp.a.a().a(bly.az)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cna.vM,
            vf.c("advancements.adventure.two_birds_one_arrow.title"),
            vf.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cc.a.a(bp.a.a().a(bly.av), bp.a.a().a(bly.av)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cna.vM, vf.c("advancements.adventure.arbalistic.title"), vf.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cc.a.a(ck.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cgp.s(),
            vf.c("advancements.adventure.voluntary_exile.title"),
            vf.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cd.a.a(bp.a.a().a(asj.c).a(bm.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cgp.s(),
            vf.c("advancements.adventure.hero_of_the_village.title"),
            vf.c("advancements.adventure.hero_of_the_village.description"),
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
            cwr.pg.k(),
            vf.c("advancements.adventure.honey_block_slide.title"),
            vf.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cwr.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cwr.pd.k(), vf.c("advancements.adventure.bullseye.title"), vf.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dd.a.a(ck.d.a(15), Optional.of(bp.a(bp.a.a().a(bg.a(ck.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cna.py,
            vf.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vf.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cr.a.a(cwr.qP, cna.py))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cna.lW,
            vf.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vf.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ck.d.a(0), Optional.of(bp.a.a().a(bly.bg).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cna.qU,
            vf.c("advancements.adventure.spyglass_at_parrot.title"),
            vf.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bly.au, cna.qU))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cna.qU,
            vf.c("advancements.adventure.spyglass_at_ghast.title"),
            vf.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bly.R, cna.qU))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cna.eX,
            vf.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vf.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cb.a.a(ci.a.a().d(cuu.D).a(au.a.a().a(cwr.dT)), ca.a.a().a(aso.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cna.qU,
            vf.c("advancements.adventure.spyglass_at_dragon.title"),
            vf.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bly.D, cna.qU))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cna.qw,
            vf.c("advancements.adventure.fall_from_world_height.title"),
            vf.c("advancements.adventure.fall_from_world_height.description"),
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
            cwr.qU,
            vf.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vf.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cwr.qQ,
            vf.c("advancements.adventure.avoid_vibration.title"),
            vf.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cna.xi, vf.c("advancements.adventure.salvage_sherd.title"), vf.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dhk.a(new dhk.a(cna.qI, cna.xJ, cna.qI, cna.xH)),
            vf.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vf.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cs.a.a(new ahg("minecraft:decorated_pot"), List.of(ca.a.a().a(aso.aL), ca.a.a().a(aso.aL), ca.a.a().a(aso.aL), ca.a.a().a(aso.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cmx(cna.xl),
            vf.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vf.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cmx(cna.xx),
            vf.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vf.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cna.eA,
            vf.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vf.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cwr.cm))
         .a("comparator", b(cwr.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bly<?>> $$2) {
      af $$3 = b(ae.a.a(), $$2)
         .a($$0)
         .a(cna.oX, vf.c("advancements.adventure.kill_a_mob.title"), vf.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      b(ae.a.a(), $$2)
         .a($$3)
         .a(cna.pc, vf.c("advancements.adventure.kill_all_mobs.title"), vf.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cb.a> a(cwp $$0) {
      eju.a[] $$1 = cxz.aE.a().stream().map($$0x -> {
         cz.a $$1x = cz.a.a().a(cxz.aE, $$0x);
         au.a $$2 = au.a.a().a(cwr.gY).a($$1x);
         return ejs.a(ci.a.a().a($$2), new hx($$0x.g().q()));
      }).toArray(eju.a[]::new);
      return cb.a.a(ejt.a($$0), ejj.a($$1));
   }

   private static an<cb.a> b(cwp $$0) {
      eju.a[] $$1 = cxz.aE.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cxz.aE, $$1x);
         ejt.a $$3 = new ejt.a(cwr.gY).a($$2);
         eju.a $$4 = ejs.a(ci.a.a().a(au.a.a().a($$0)), new hx($$1x.q()));
         return eji.a($$3, $$4);
      }).toArray(eju.a[]::new);
      return cb.a.a(ejj.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cms> $$1 = Set.of(cna.xu, cna.xs, cna.xt, cna.xo, cna.xx, cna.xq, cna.xr, cna.xv);
      nk.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cs.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      nk.b().map(nk.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cs.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cj.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cj.a.a(egt.aP)),
         Pair.of("desert_well", cj.a.a(egt.aO)),
         Pair.of("ocean_ruin_cold", cj.a.a(egt.aT)),
         Pair.of("ocean_ruin_warm", cj.a.a(egt.aS)),
         Pair.of("trail_ruins_rare", cj.a.a(egt.aR)),
         Pair.of("trail_ruins_common", cj.a.a(egt.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", by.a.a(ca.a.a().a(aso.aL)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cvb.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cna.pK,
            vf.c("advancements.adventure.adventuring_time.title"),
            vf.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a b(ae.a $$0, List<bly<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kd.g.b($$1x).toString(), cd.a.a(bp.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ahf<cun>> $$1) {
      for (ahf<cun> $$2 : $$1) {
         $$0.a($$2.a().toString(), cr.a.a(ci.a.a($$2)));
      }

      return $$0;
   }
}
