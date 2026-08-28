import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class mf implements ma {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bsv<?>> a = Arrays.asList(
      bsv.i,
      bsv.q,
      bsv.x,
      bsv.B,
      bsv.D,
      bsv.F,
      bsv.H,
      bsv.I,
      bsv.J,
      bsv.T,
      bsv.Y,
      bsv.Z,
      bsv.ac,
      bsv.ap,
      bsv.ay,
      bsv.aA,
      bsv.aB,
      bsv.aC,
      bsv.aH,
      bsv.aK,
      bsv.aM,
      bsv.aN,
      bsv.aP,
      bsv.aW,
      bsv.aY,
      bsv.bi,
      bsv.bk,
      bsv.bo,
      bsv.bq,
      bsv.bp,
      bsv.bt,
      bsv.bw,
      bsv.bu,
      bsv.bx
   );

   private static an<db.a> a(de.d $$0, Optional<bu> $$1) {
      return db.a.a(Optional.of(bu.a.a().a(bl.c(de.c.c(30.0))).a(da.a($$0)).b()), $$1);
   }

   private static an<ef.a> a(bsv<?> $$0, cuf $$1) {
      return ef.a.a(bu.a.a().a(dk.d.a().a(bu.a.a().a($$0)).b()), cp.a.a().a($$1));
   }

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cun.uj,
            xl.c("advancements.adventure.root.title"),
            xl.c("advancements.adventure.root.description"),
            new alb("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dew.bn, xl.c("advancements.adventure.sleep_in_bed.title"), xl.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", dl.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, ddg.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cun.oz, xl.c("advancements.adventure.trade.title"), xl.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", ec.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cun.oz,
            xl.c("advancements.adventure.trade_at_world_height.title"),
            xl.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", ec.a.a(bu.a.a().a(dc.a.a(de.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(cun.ou, xl.c("advancements.adventure.shoot_arrow.title"), xl.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", di.a.a(bi.a.a().a(bj.a.a().a(dz.a(awn.k)).a(bu.a.a().a(awp.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cun.vP, xl.c("advancements.adventure.throw_trident.title"), xl.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", di.a.a(bi.a.a().a(bj.a.a().a(dz.a(awn.k)).a(bu.a.a().a(bsv.bf)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cun.vP,
            xl.c("advancements.adventure.very_very_frightening.title"),
            xl.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bu.a.a().a(bsv.bj)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dew.ee,
            xl.c("advancements.adventure.summon_iron_golem.title"),
            xl.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dy.a.a(bu.a.a().a(bsv.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cun.ov, xl.c("advancements.adventure.sniper_duel.title"), xl.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cx.a.a(bu.a.a().a(bsv.aN).a(bl.a(de.c.b(50.0))), bj.a.a().a(dz.a(awn.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cun.vt,
            xl.c("advancements.adventure.totem_of_undying.title"),
            xl.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", ee.a.a(cun.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cun.vT, xl.c("advancements.adventure.ol_betsy.title"), xl.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", dq.a.a(cun.vT))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cun.vT,
            xl.c("advancements.adventure.whos_the_pillager_now.title"),
            xl.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cw.a.a(bu.a.a().a(bsv.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cun.vT,
            xl.c("advancements.adventure.two_birds_one_arrow.title"),
            xl.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cw.a.a(bu.a.a().a(bsv.ay), bu.a.a().a(bsv.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cun.vT, xl.c("advancements.adventure.arbalistic.title"), xl.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cw.a.a(de.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jk.b<dos> $$9 = $$0.b(lq.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cod.a($$9),
            xl.c("advancements.adventure.voluntary_exile.title"),
            xl.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cx.a.a(bu.a.a().a(awp.c).a(br.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cod.a($$9),
            xl.c("advancements.adventure.hero_of_the_village.title"),
            xl.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", dl.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            dew.pg.r(),
            xl.c("advancements.adventure.honey_block_slide.title"),
            xl.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dt.a.a(dew.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dew.pd.r(), xl.c("advancements.adventure.bullseye.title"), xl.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", eb.a.a(de.d.a(15), Optional.of(bu.a(bu.a.a().a(bl.a(de.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cun.pB,
            xl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dl.a.a(dew.qP, cun.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cun.lX,
            xl.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xl.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(de.d.a(0), Optional.of(bu.a.a().a(bsv.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cun.qX,
            xl.c("advancements.adventure.spyglass_at_parrot.title"),
            xl.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsv.ax, cun.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            cun.qX,
            xl.c("advancements.adventure.spyglass_at_ghast.title"),
            xl.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsv.T, cun.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cun.eY,
            xl.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xl.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ct.a.a(dc.a.a().a(jm.a($$0.b(lq.az).b(dcz.D))).a(av.a.a().a(dew.dT)), cp.a.a().a(awu.aR)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            cun.qX,
            xl.c("advancements.adventure.spyglass_at_dragon.title"),
            xl.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsv.F, cun.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cun.qz,
            xl.c("advancements.adventure.fall_from_world_height.title"),
            xl.c("advancements.adventure.fall_from_world_height.description"),
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
            dew.qU,
            xl.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xl.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dew.qQ,
            xl.c("advancements.adventure.avoid_vibration.title"),
            xl.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", dl.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(cun.xr, xl.c("advancements.adventure.salvage_sherd.title"), xl.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dps.a(new dqg(Optional.empty(), Optional.of(cun.xW), Optional.empty(), Optional.of(cun.xS))),
            xl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dn.a.a(new alb("minecraft:decorated_pot"), List.of(cp.a.a().a(awu.bp), cp.a.a().a(awu.bp), cp.a.a().a(awu.bp), cp.a.a().a(awu.bp)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new cuk(cun.xu),
            xl.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xl.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cuk(cun.xG),
            xl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cun.eB,
            xl.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xl.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dew.cm))
         .a("comparator", b(dew.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ae.a.a()
         .a($$2)
         .a(
            cun.oq,
            xl.c("advancements.adventure.brush_armadillo.title"),
            xl.c("advancements.adventure.brush_armadillo.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dj.a.a(cp.a.a().a(cun.xr), Optional.of(bu.a(bu.a.a().a(bsv.c)))))
         .a($$1, "adventure/brush_armadillo");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bsv<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(cun.pa, xl.c("advancements.adventure.kill_a_mob.title"), xl.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(cun.pf, xl.c("advancements.adventure.kill_all_mobs.title"), xl.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<ct.a> a(deu $$0) {
      etn.a[] $$1 = dge.aE.a().stream().map($$0x -> {
         dx.a $$1x = dx.a.a().a(dge.aE, $$0x);
         av.a $$2 = av.a.a().a(dew.gY).a($$1x);
         return etl.a(dc.a.a().a($$2), new iz($$0x.g().q()));
      }).toArray(etn.a[]::new);
      return ct.a.a(etm.a($$0), etc.a($$1));
   }

   private static an<ct.a> b(deu $$0) {
      etn.a[] $$1 = dge.aE.a().stream().map($$1x -> {
         dx.a $$2 = dx.a.a().a(dge.aE, $$1x);
         etm.a $$3 = new etm.a(dew.gY).a($$2);
         etn.a $$4 = etl.a(dc.a.a().a(av.a.a().a($$0)), new iz($$1x.q()));
         return etb.a($$3, $$4);
      }).toArray(etn.a[]::new);
      return ct.a.a(etc.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cuf> $$1 = Set.of(cun.xD, cun.xB, cun.xC, cun.xx, cun.xG, cun.xz, cun.xA, cun.xE);
      pc.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), dn.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      pc.b().map(pc.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, dn.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<dd.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", dd.a.a(epz.be)),
         Pair.of("desert_well", dd.a.a(epz.bd)),
         Pair.of("ocean_ruin_cold", dd.a.a(epz.bi)),
         Pair.of("ocean_ruin_warm", dd.a.a(epz.bh)),
         Pair.of("trail_ruins_rare", dd.a.a(epz.bg)),
         Pair.of("trail_ruins_common", dd.a.a(epz.bf))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ce.a.a(cp.a.a().a(awu.bp)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jk.a $$0, Consumer<af> $$1, af $$2, ddg.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cun.pN,
            xl.c("advancements.adventure.adventuring_time.title"),
            xl.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bsv<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lp.g.b($$1x).toString(), cx.a.a(bu.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, jk.a $$1, List<ala<dcs>> $$2) {
      jj<dcs> $$3 = $$1.b(lq.az);

      for (ala<dcs> $$4 : $$2) {
         $$0.a($$4.a().toString(), dl.a.a(dc.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
