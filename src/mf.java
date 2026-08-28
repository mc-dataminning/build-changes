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
   protected static final List<btc<?>> a = Arrays.asList(
      btc.i,
      btc.q,
      btc.x,
      btc.B,
      btc.D,
      btc.F,
      btc.H,
      btc.I,
      btc.J,
      btc.T,
      btc.Y,
      btc.Z,
      btc.ac,
      btc.ap,
      btc.ay,
      btc.aA,
      btc.aB,
      btc.aC,
      btc.aH,
      btc.aK,
      btc.aM,
      btc.aN,
      btc.aP,
      btc.aW,
      btc.aY,
      btc.bi,
      btc.bk,
      btc.bo,
      btc.bq,
      btc.bp,
      btc.bt,
      btc.bw,
      btc.bu,
      btc.bx
   );

   private static an<db.a> a(de.d $$0, Optional<bu> $$1) {
      return db.a.a(Optional.of(bu.a.a().a(bl.c(de.c.c(30.0))).a(da.a($$0)).b()), $$1);
   }

   private static an<ef.a> a(btc<?> $$0, cum $$1) {
      return ef.a.a(bu.a.a().a(dk.d.a().a(bu.a.a().a($$0)).b()), cp.a.a().a($$1));
   }

   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuu.uj,
            xp.c("advancements.adventure.root.title"),
            xp.c("advancements.adventure.root.description"),
            new alf("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dfd.bn, xp.c("advancements.adventure.sleep_in_bed.title"), xp.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", dl.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, ddn.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cuu.oz, xp.c("advancements.adventure.trade.title"), xp.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", ec.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cuu.oz,
            xp.c("advancements.adventure.trade_at_world_height.title"),
            xp.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cuu.ou, xp.c("advancements.adventure.shoot_arrow.title"), xp.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", di.a.a(bi.a.a().a(bj.a.a().a(dz.a(awr.k)).a(bu.a.a().a(awt.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cuu.vP, xp.c("advancements.adventure.throw_trident.title"), xp.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", di.a.a(bi.a.a().a(bj.a.a().a(dz.a(awr.k)).a(bu.a.a().a(btc.bf)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cuu.vP,
            xp.c("advancements.adventure.very_very_frightening.title"),
            xp.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bu.a.a().a(btc.bj)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dfd.ee,
            xp.c("advancements.adventure.summon_iron_golem.title"),
            xp.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dy.a.a(bu.a.a().a(btc.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cuu.ov, xp.c("advancements.adventure.sniper_duel.title"), xp.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cx.a.a(bu.a.a().a(btc.aN).a(bl.a(de.c.b(50.0))), bj.a.a().a(dz.a(awr.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cuu.vt,
            xp.c("advancements.adventure.totem_of_undying.title"),
            xp.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", ee.a.a(cuu.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cuu.vT, xp.c("advancements.adventure.ol_betsy.title"), xp.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", dq.a.a(cuu.vT))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cuu.vT,
            xp.c("advancements.adventure.whos_the_pillager_now.title"),
            xp.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cw.a.a(bu.a.a().a(btc.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cuu.vT,
            xp.c("advancements.adventure.two_birds_one_arrow.title"),
            xp.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cw.a.a(bu.a.a().a(btc.ay), bu.a.a().a(btc.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cuu.vT, xp.c("advancements.adventure.arbalistic.title"), xp.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cw.a.a(de.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jk.b<doz> $$9 = $$0.b(lq.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cok.a($$9),
            xp.c("advancements.adventure.voluntary_exile.title"),
            xp.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cx.a.a(bu.a.a().a(awt.c).a(br.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cok.a($$9),
            xp.c("advancements.adventure.hero_of_the_village.title"),
            xp.c("advancements.adventure.hero_of_the_village.description"),
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
            dfd.pg.r(),
            xp.c("advancements.adventure.honey_block_slide.title"),
            xp.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dt.a.a(dfd.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dfd.pd.r(), xp.c("advancements.adventure.bullseye.title"), xp.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", eb.a.a(de.d.a(15), Optional.of(bu.a(bu.a.a().a(bl.a(de.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cuu.pB,
            xp.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xp.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", dl.a.a(dfd.qP, cuu.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cuu.lX,
            xp.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xp.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(de.d.a(0), Optional.of(bu.a.a().a(btc.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            cuu.qX,
            xp.c("advancements.adventure.spyglass_at_parrot.title"),
            xp.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(btc.ax, cuu.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            cuu.qX,
            xp.c("advancements.adventure.spyglass_at_ghast.title"),
            xp.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(btc.T, cuu.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cuu.eY,
            xp.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xp.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ct.a.a(dc.a.a().a(jm.a($$0.b(lq.az).b(ddg.D))).a(av.a.a().a(dfd.dT)), cp.a.a().a(awy.aR)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            cuu.qX,
            xp.c("advancements.adventure.spyglass_at_dragon.title"),
            xp.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(btc.F, cuu.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cuu.qz,
            xp.c("advancements.adventure.fall_from_world_height.title"),
            xp.c("advancements.adventure.fall_from_world_height.description"),
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
            dfd.qU,
            xp.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xp.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dfd.qQ,
            xp.c("advancements.adventure.avoid_vibration.title"),
            xp.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cuu.xr, xp.c("advancements.adventure.salvage_sherd.title"), xp.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dpz.a(new dqn(Optional.empty(), Optional.of(cuu.xW), Optional.empty(), Optional.of(cuu.xS))),
            xp.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xp.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dn.a.a(new alf("minecraft:decorated_pot"), List.of(cp.a.a().a(awy.bp), cp.a.a().a(awy.bp), cp.a.a().a(awy.bp), cp.a.a().a(awy.bp)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new cur(cuu.xu),
            xp.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xp.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cur(cuu.xG),
            xp.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xp.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cuu.eB,
            xp.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xp.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dfd.cm))
         .a("comparator", b(dfd.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ae.a.a()
         .a($$2)
         .a(
            cuu.oq,
            xp.c("advancements.adventure.brush_armadillo.title"),
            xp.c("advancements.adventure.brush_armadillo.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dj.a.a(cp.a.a().a(cuu.xr), Optional.of(bu.a(bu.a.a().a(btc.c)))))
         .a($$1, "adventure/brush_armadillo");
   }

   public static af a(af $$0, Consumer<af> $$1, List<btc<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(cuu.pa, xp.c("advancements.adventure.kill_a_mob.title"), xp.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(cuu.pf, xp.c("advancements.adventure.kill_all_mobs.title"), xp.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<ct.a> a(dfb $$0) {
      etu.a[] $$1 = dgl.aE.a().stream().map($$0x -> {
         dx.a $$1x = dx.a.a().a(dgl.aE, $$0x);
         av.a $$2 = av.a.a().a(dfd.gY).a($$1x);
         return ets.a(dc.a.a().a($$2), new iz($$0x.g().q()));
      }).toArray(etu.a[]::new);
      return ct.a.a(ett.a($$0), etj.a($$1));
   }

   private static an<ct.a> b(dfb $$0) {
      etu.a[] $$1 = dgl.aE.a().stream().map($$1x -> {
         dx.a $$2 = dx.a.a().a(dgl.aE, $$1x);
         ett.a $$3 = new ett.a(dfd.gY).a($$2);
         etu.a $$4 = ets.a(dc.a.a().a(av.a.a().a($$0)), new iz($$1x.q()));
         return eti.a($$3, $$4);
      }).toArray(etu.a[]::new);
      return ct.a.a(etj.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cum> $$1 = Set.of(cuu.xD, cuu.xB, cuu.xC, cuu.xx, cuu.xG, cuu.xz, cuu.xA, cuu.xE);
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
         Pair.of("desert_pyramid", dd.a.a(eqg.be)),
         Pair.of("desert_well", dd.a.a(eqg.bd)),
         Pair.of("ocean_ruin_cold", dd.a.a(eqg.bi)),
         Pair.of("ocean_ruin_warm", dd.a.a(eqg.bh)),
         Pair.of("trail_ruins_rare", dd.a.a(eqg.bg)),
         Pair.of("trail_ruins_common", dd.a.a(eqg.bf))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ce.a.a(cp.a.a().a(awy.bp)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jk.a $$0, Consumer<af> $$1, af $$2, ddn.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cuu.pN,
            xp.c("advancements.adventure.adventuring_time.title"),
            xp.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<btc<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lp.g.b($$1x).toString(), cx.a.a(bu.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, jk.a $$1, List<ale<dcz>> $$2) {
      jj<dcz> $$3 = $$1.b(lq.az);

      for (ale<dcz> $$4 : $$2) {
         $$0.a($$4.a().toString(), dl.a.a(dc.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
