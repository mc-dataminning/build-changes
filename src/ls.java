import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ls implements ln {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bqr<?>> a = Arrays.asList(
      bqr.i,
      bqr.q,
      bqr.x,
      bqr.B,
      bqr.D,
      bqr.F,
      bqr.H,
      bqr.I,
      bqr.J,
      bqr.T,
      bqr.Y,
      bqr.Z,
      bqr.ac,
      bqr.ao,
      bqr.ax,
      bqr.az,
      bqr.aA,
      bqr.aB,
      bqr.aG,
      bqr.aJ,
      bqr.aL,
      bqr.aM,
      bqr.aO,
      bqr.aV,
      bqr.aX,
      bqr.bh,
      bqr.bj,
      bqr.bn,
      bqr.bp,
      bqr.bo,
      bqr.bs,
      bqr.bv,
      bqr.bt,
      bqr.bw
   );

   private static an<cp.a> a(cs.d $$0, Optional<br> $$1) {
      return cp.a.a(Optional.of(br.a.a().a(bi.c(cs.c.c(30.0))).a(co.a($$0)).b()), $$1);
   }

   private static an<ds.a> a(bqr<?> $$0, cry $$1) {
      return ds.a.a(br.a.a().a(cy.d.a().a(br.a.a().a($$0)).b()), cg.a.a().a($$1));
   }

   @Override
   public void a(ix.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csg.uj,
            ws.c("advancements.adventure.root.title"),
            ws.c("advancements.adventure.root.description"),
            new akf("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cl.a.b())
         .a("killed_by_something", cl.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dcx.bn, ws.c("advancements.adventure.sleep_in_bed.title"), ws.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", cz.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dbh.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(csg.oz, ws.c("advancements.adventure.trade.title"), ws.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dp.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            csg.oz,
            ws.c("advancements.adventure.trade_at_world_height.title"),
            ws.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dp.a.a(br.a.a().a(cq.a.a(cs.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(csg.ou, ws.c("advancements.adventure.shoot_arrow.title"), ws.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cw.a.a(bf.a.a().a(bg.a.a().a(dl.a(avq.k)).a(br.a.a().a(avr.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(csg.vP, ws.c("advancements.adventure.throw_trident.title"), ws.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cw.a.a(bf.a.a().a(bg.a.a().a(dl.a(avq.k)).a(br.a.a().a(bqr.be)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            csg.vP,
            ws.c("advancements.adventure.very_very_frightening.title"),
            ws.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bqr.bi)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dcx.ee,
            ws.c("advancements.adventure.summon_iron_golem.title"),
            ws.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dk.a.a(br.a.a().a(bqr.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(csg.ov, ws.c("advancements.adventure.sniper_duel.title"), ws.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cl.a.a(br.a.a().a(bqr.aM).a(bi.a(cs.c.b(50.0))), bg.a.a().a(dl.a(avq.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            csg.vt,
            ws.c("advancements.adventure.totem_of_undying.title"),
            ws.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dr.a.a(csg.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(csg.vT, ws.c("advancements.adventure.ol_betsy.title"), ws.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", dc.a.a(csg.vT))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            csg.vT,
            ws.c("advancements.adventure.whos_the_pillager_now.title"),
            ws.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ck.a.a(br.a.a().a(bqr.aB)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            csg.vT,
            ws.c("advancements.adventure.two_birds_one_arrow.title"),
            ws.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ck.a.a(br.a.a().a(bqr.ax), br.a.a().a(bqr.ax)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(csg.vT, ws.c("advancements.adventure.arbalistic.title"), ws.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ck.a.a(cs.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ix.b<dmt> $$9 = $$0.b(ld.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            clw.a($$9),
            ws.c("advancements.adventure.voluntary_exile.title"),
            ws.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cl.a.a(br.a.a().a(avr.c).a(bo.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            clw.a($$9),
            ws.c("advancements.adventure.hero_of_the_village.title"),
            ws.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", cz.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            dcx.pg.p(),
            ws.c("advancements.adventure.honey_block_slide.title"),
            ws.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", df.a.a(dcx.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dcx.pd.p(), ws.c("advancements.adventure.bullseye.title"), ws.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dn.a.a(cs.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cs.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            csg.pB,
            ws.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            ws.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cz.a.a(dcx.qP, csg.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            csg.lX,
            ws.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            ws.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cs.d.a(0), Optional.of(br.a.a().a(bqr.bi).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            csg.qX,
            ws.c("advancements.adventure.spyglass_at_parrot.title"),
            ws.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bqr.aw, csg.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            csg.qX,
            ws.c("advancements.adventure.spyglass_at_ghast.title"),
            ws.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bqr.T, csg.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            csg.eY,
            ws.c("advancements.adventure.play_jukebox_in_meadows.title"),
            ws.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cj.a.a(cq.a.a().a(iz.a($$0.b(ld.ay).b(dba.D))).a(av.a.a().a(dcx.dT)), cg.a.a().a(avw.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            csg.qX,
            ws.c("advancements.adventure.spyglass_at_dragon.title"),
            ws.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bqr.F, csg.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            csg.qz,
            ws.c("advancements.adventure.fall_from_world_height.title"),
            ws.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bj.a.a(br.a.a().a(cq.a.a(cs.c.c(-59.0))), bi.b(cs.c.b(379.0)), cq.a.a(cs.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            dcx.qU,
            ws.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            ws.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cl.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            dcx.qQ,
            ws.c("advancements.adventure.avoid_vibration.title"),
            ws.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cz.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(csg.xr, ws.c("advancements.adventure.salvage_sherd.title"), ws.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dnt.a(new doh(Optional.empty(), Optional.of(csg.xW), Optional.empty(), Optional.of(csg.xS))),
            ws.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            ws.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            da.a.a(new akf("minecraft:decorated_pot"), List.of(cg.a.a().a(avw.aQ), cg.a.a().a(avw.aQ), cg.a.a().a(avw.aQ), cg.a.a().a(avw.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new csd(csg.xu),
            ws.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            ws.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new csd(csg.xG),
            ws.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            ws.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            csg.eB,
            ws.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            ws.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dcx.cm))
         .a("comparator", b(dcx.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bqr<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(csg.pa, ws.c("advancements.adventure.kill_a_mob.title"), ws.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(csg.pf, ws.c("advancements.adventure.kill_all_mobs.title"), ws.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cj.a> a(dcv $$0) {
      erh.a[] $$1 = def.aE.a().stream().map($$0x -> {
         dj.a $$1x = dj.a.a().a(def.aE, $$0x);
         av.a $$2 = av.a.a().a(dcx.gY).a($$1x);
         return erf.a(cq.a.a().a($$2), new im($$0x.g().q()));
      }).toArray(erh.a[]::new);
      return cj.a.a(erg.a($$0), eqw.a($$1));
   }

   private static an<cj.a> b(dcv $$0) {
      erh.a[] $$1 = def.aE.a().stream().map($$1x -> {
         dj.a $$2 = dj.a.a().a(def.aE, $$1x);
         erg.a $$3 = new erg.a(dcx.gY).a($$2);
         erh.a $$4 = erf.a(cq.a.a().a(av.a.a().a($$0)), new im($$1x.q()));
         return eqv.a($$3, $$4);
      }).toArray(erh.a[]::new);
      return cj.a.a(eqw.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cry> $$1 = Set.of(csg.xD, csg.xB, csg.xC, csg.xx, csg.xG, csg.xz, csg.xA, csg.xE);
      on.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), da.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      on.b().map(on.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, da.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cr.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cr.a.a(eny.aU)),
         Pair.of("desert_well", cr.a.a(eny.aT)),
         Pair.of("ocean_ruin_cold", cr.a.a(eny.aY)),
         Pair.of("ocean_ruin_warm", cr.a.a(eny.aX)),
         Pair.of("trail_ruins_rare", cr.a.a(eny.aW)),
         Pair.of("trail_ruins_common", cr.a.a(eny.aV))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cg.a.a().a(avw.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(ix.a $$0, Consumer<af> $$1, af $$2, dbh.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            csg.pN,
            ws.c("advancements.adventure.adventuring_time.title"),
            ws.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bqr<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lc.g.b($$1x).toString(), cl.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, ix.a $$1, List<ake<dat>> $$2) {
      iw<dat> $$3 = $$1.b(ld.ay);

      for (ake<dat> $$4 : $$2) {
         $$0.a($$4.a().toString(), cz.a.a(cq.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
