import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class lt implements lo {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<brn<?>> a = Arrays.asList(
      brn.i,
      brn.q,
      brn.x,
      brn.B,
      brn.D,
      brn.F,
      brn.H,
      brn.I,
      brn.J,
      brn.T,
      brn.Y,
      brn.Z,
      brn.ac,
      brn.ao,
      brn.ax,
      brn.az,
      brn.aA,
      brn.aB,
      brn.aG,
      brn.aJ,
      brn.aL,
      brn.aM,
      brn.aO,
      brn.aV,
      brn.aX,
      brn.bh,
      brn.bj,
      brn.bn,
      brn.bp,
      brn.bo,
      brn.bs,
      brn.bv,
      brn.bt,
      brn.bw
   );

   private static an<cq.a> a(ct.d $$0, Optional<br> $$1) {
      return cq.a.a(Optional.of(br.a.a().a(bi.c(ct.c.c(30.0))).a(cp.a($$0)).b()), $$1);
   }

   private static an<dt.a> a(brn<?> $$0, csu $$1) {
      return dt.a.a(br.a.a().a(cz.d.a().a(br.a.a().a($$0)).b()), ch.a.a().a($$1));
   }

   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ctc.uj,
            wu.c("advancements.adventure.root.title"),
            wu.c("advancements.adventure.root.description"),
            new akh("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cm.a.b())
         .a("killed_by_something", cm.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ddg.bn, wu.c("advancements.adventure.sleep_in_bed.title"), wu.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", da.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dbq.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(ctc.oz, wu.c("advancements.adventure.trade.title"), wu.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dq.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            ctc.oz,
            wu.c("advancements.adventure.trade_at_world_height.title"),
            wu.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dq.a.a(br.a.a().a(cr.a.a(ct.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctc.ou, wu.c("advancements.adventure.shoot_arrow.title"), wu.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cx.a.a(bf.a.a().a(bg.a.a().a(dm.a(avt.k)).a(br.a.a().a(avu.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(ctc.vP, wu.c("advancements.adventure.throw_trident.title"), wu.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cx.a.a(bf.a.a().a(bg.a.a().a(dm.a(avt.k)).a(br.a.a().a(brn.be)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            ctc.vP,
            wu.c("advancements.adventure.very_very_frightening.title"),
            wu.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(brn.bi)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            ddg.ee,
            wu.c("advancements.adventure.summon_iron_golem.title"),
            wu.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dl.a.a(br.a.a().a(brn.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(ctc.ov, wu.c("advancements.adventure.sniper_duel.title"), wu.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cm.a.a(br.a.a().a(brn.aM).a(bi.a(ct.c.b(50.0))), bg.a.a().a(dm.a(avt.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            ctc.vt,
            wu.c("advancements.adventure.totem_of_undying.title"),
            wu.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", ds.a.a(ctc.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(ctc.vT, wu.c("advancements.adventure.ol_betsy.title"), wu.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", dd.a.a(ctc.vT))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            ctc.vT,
            wu.c("advancements.adventure.whos_the_pillager_now.title"),
            wu.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cl.a.a(br.a.a().a(brn.aB)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            ctc.vT,
            wu.c("advancements.adventure.two_birds_one_arrow.title"),
            wu.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cl.a.a(br.a.a().a(brn.ax), br.a.a().a(brn.ax)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(ctc.vT, wu.c("advancements.adventure.arbalistic.title"), wu.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cl.a.a(ct.d.a(5)))
         .a($$1, "adventure/arbalistic");
      iy.b<dnc> $$9 = $$0.b(le.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cms.a($$9),
            wu.c("advancements.adventure.voluntary_exile.title"),
            wu.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cm.a.a(br.a.a().a(avu.c).a(bo.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cms.a($$9),
            wu.c("advancements.adventure.hero_of_the_village.title"),
            wu.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", da.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            ddg.pg.q(),
            wu.c("advancements.adventure.honey_block_slide.title"),
            wu.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dg.a.a(ddg.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(ddg.pd.q(), wu.c("advancements.adventure.bullseye.title"), wu.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dp.a.a(ct.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(ct.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            ctc.pB,
            wu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", da.a.a(ddg.qP, ctc.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            ctc.lX,
            wu.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wu.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ct.d.a(0), Optional.of(br.a.a().a(brn.bi).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            ctc.qX,
            wu.c("advancements.adventure.spyglass_at_parrot.title"),
            wu.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(brn.aw, ctc.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            ctc.qX,
            wu.c("advancements.adventure.spyglass_at_ghast.title"),
            wu.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(brn.T, ctc.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            ctc.eY,
            wu.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wu.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ck.a.a(cr.a.a().a(ja.a($$0.b(le.az).b(dbj.D))).a(av.a.a().a(ddg.dT)), ch.a.a().a(avz.aR)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            ctc.qX,
            wu.c("advancements.adventure.spyglass_at_dragon.title"),
            wu.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(brn.F, ctc.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            ctc.qz,
            wu.c("advancements.adventure.fall_from_world_height.title"),
            wu.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bj.a.a(br.a.a().a(cr.a.a(ct.c.c(-59.0))), bi.b(ct.c.b(379.0)), cr.a.a(ct.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            ddg.qU,
            wu.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wu.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cm.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            ddg.qQ,
            wu.c("advancements.adventure.avoid_vibration.title"),
            wu.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", da.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(ctc.xr, wu.c("advancements.adventure.salvage_sherd.title"), wu.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            doc.a(new doq(Optional.empty(), Optional.of(ctc.xW), Optional.empty(), Optional.of(ctc.xS))),
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
            db.a.a(new akh("minecraft:decorated_pot"), List.of(ch.a.a().a(avz.bp), ch.a.a().a(avz.bp), ch.a.a().a(avz.bp), ch.a.a().a(avz.bp)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new csz(ctc.xu),
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
            new csz(ctc.xG),
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
            ctc.eB,
            wu.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wu.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(ddg.cm))
         .a("comparator", b(ddg.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<brn<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(ctc.pa, wu.c("advancements.adventure.kill_a_mob.title"), wu.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(ctc.pf, wu.c("advancements.adventure.kill_all_mobs.title"), wu.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<ck.a> a(dde $$0) {
      erq.a[] $$1 = deo.aE.a().stream().map($$0x -> {
         dk.a $$1x = dk.a.a().a(deo.aE, $$0x);
         av.a $$2 = av.a.a().a(ddg.gY).a($$1x);
         return ero.a(cr.a.a().a($$2), new in($$0x.g().q()));
      }).toArray(erq.a[]::new);
      return ck.a.a(erp.a($$0), erf.a($$1));
   }

   private static an<ck.a> b(dde $$0) {
      erq.a[] $$1 = deo.aE.a().stream().map($$1x -> {
         dk.a $$2 = dk.a.a().a(deo.aE, $$1x);
         erp.a $$3 = new erp.a(ddg.gY).a($$2);
         erq.a $$4 = ero.a(cr.a.a().a(av.a.a().a($$0)), new in($$1x.q()));
         return ere.a($$3, $$4);
      }).toArray(erq.a[]::new);
      return ck.a.a(erf.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<csu> $$1 = Set.of(ctc.xD, ctc.xB, ctc.xC, ctc.xx, ctc.xG, ctc.xz, ctc.xA, ctc.xE);
      oo.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), db.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      oo.b().map(oo.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, db.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cs.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cs.a.a(eoj.aU)),
         Pair.of("desert_well", cs.a.a(eoj.aT)),
         Pair.of("ocean_ruin_cold", cs.a.a(eoj.aY)),
         Pair.of("ocean_ruin_warm", cs.a.a(eoj.aX)),
         Pair.of("trail_ruins_rare", cs.a.a(eoj.aW)),
         Pair.of("trail_ruins_common", cs.a.a(eoj.aV))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", cb.a.a(ch.a.a().a(avz.bp)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(iy.a $$0, Consumer<af> $$1, af $$2, dbq.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            ctc.pN,
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

   private static ae.a a(ae.a $$0, List<brn<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(ld.g.b($$1x).toString(), cm.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, iy.a $$1, List<akg<dbc>> $$2) {
      ix<dbc> $$3 = $$1.b(le.az);

      for (akg<dbc> $$4 : $$2) {
         $$0.a($$4.a().toString(), da.a.a(cr.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
