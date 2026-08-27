import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class km implements kj {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bjx<?>[] e = new bjx[]{
      bjx.i,
      bjx.n,
      bjx.u,
      bjx.y,
      bjx.A,
      bjx.C,
      bjx.E,
      bjx.F,
      bjx.G,
      bjx.Q,
      bjx.V,
      bjx.W,
      bjx.Z,
      bjx.al,
      bjx.au,
      bjx.aw,
      bjx.ax,
      bjx.ay,
      bjx.aD,
      bjx.aG,
      bjx.aI,
      bjx.aJ,
      bjx.aL,
      bjx.aS,
      bjx.aU,
      bjx.be,
      bjx.bg,
      bjx.bj,
      bjx.bl,
      bjx.bk,
      bjx.bo,
      bjx.br,
      bjx.bp,
      bjx.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(bjx<?> $$0, cke $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ckm.tp,
            ui.c("advancements.adventure.root.title"),
            ui.c("advancements.adventure.root.description"),
            new afw("textures/gui/advancements/backgrounds/adventure.png"),
            ar.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", ce.a.c())
         .a("killed_by_something", ce.a.e())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuc.bn, ui.c("advancements.adventure.sleep_in_bed.title"), ui.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, csl.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(ckm.nL, ui.c("advancements.adventure.trade.title"), ui.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            ckm.nL,
            ui.c("advancements.adventure.trade_at_world_height.title"),
            ui.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", df.a.a(bq.a.a().a(cj.a.a(cl.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = d(ae.a.a())
         .a($$2)
         .a(ckm.om, ui.c("advancements.adventure.kill_a_mob.title"), ui.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(ckm.or, ui.c("advancements.adventure.kill_all_mobs.title"), ui.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ckm.nG, ui.c("advancements.adventure.shoot_arrow.title"), ui.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(aqu.j)).a(bq.a.a().a(aqv.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(ckm.uV, ui.c("advancements.adventure.throw_trident.title"), ui.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(aqu.j)).a(bq.a.a().a(bjx.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            ckm.uV,
            ui.c("advancements.adventure.very_very_frightening.title"),
            ui.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(bjx.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cuc.ee,
            ui.c("advancements.adventure.summon_iron_golem.title"),
            ui.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(bjx.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(ckm.nH, ui.c("advancements.adventure.sniper_duel.title"), ui.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(bjx.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(aqu.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            ckm.uz,
            ui.c("advancements.adventure.totem_of_undying.title"),
            ui.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(ckm.uz))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(ckm.uZ, ui.c("advancements.adventure.ol_betsy.title"), ui.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(ckm.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            ckm.uZ,
            ui.c("advancements.adventure.whos_the_pillager_now.title"),
            ui.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(bjx.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            ckm.uZ,
            ui.c("advancements.adventure.two_birds_one_arrow.title"),
            ui.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(bjx.au), bq.a.a().a(bjx.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(ckm.uZ, ui.c("advancements.adventure.arbalistic.title"), ui.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cee.s(),
            ui.c("advancements.adventure.voluntary_exile.title"),
            ui.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(aqv.c).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cee.s(),
            ui.c("advancements.adventure.hero_of_the_village.title"),
            ui.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ar.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", cs.a.d())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            cuc.pg.k(),
            ui.c("advancements.adventure.honey_block_slide.title"),
            ui.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(cuc.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cuc.pd.k(), ui.c("advancements.adventure.bullseye.title"), ui.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            ckm.oN,
            ui.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            ui.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(cuc.qC, ckm.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            ckm.lB,
            ui.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            ui.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(bjx.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            ckm.qj,
            ui.c("advancements.adventure.spyglass_at_parrot.title"),
            ui.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bjx.at, ckm.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            ckm.qj,
            ui.c("advancements.adventure.spyglass_at_ghast.title"),
            ui.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bjx.Q, ckm.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            ckm.eC,
            ui.c("advancements.adventure.play_jukebox_in_meadows.title"),
            ui.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(cse.D).a(av.a.a().a(cuc.dT)), cb.a.a().a(ara.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            ckm.qj,
            ui.c("advancements.adventure.spyglass_at_dragon.title"),
            ui.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bjx.C, ckm.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            ckm.pL,
            ui.c("advancements.adventure.fall_from_world_height.title"),
            ui.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bi.a.a(bq.a.a().a(cj.a.a(cl.c.c(-59.0))), bh.b(cl.c.b(379.0)), cj.a.a(cl.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            cuc.qH,
            ui.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            ui.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", ce.a.d())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            cuc.qD,
            ui.c("advancements.adventure.avoid_vibration.title"),
            ui.c("advancements.adventure.avoid_vibration.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cs.a.e())
         .a($$1, "adventure/avoid_vibration");
      af $$12 = c(ae.a.a())
         .a($$2)
         .a(ckm.wv, ui.c("advancements.adventure.salvage_sherd.title"), ui.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dem.a(new dem.a(ckm.pX, ckm.wW, ckm.pX, ckm.wU)),
            ui.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            ui.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new afw("minecraft:decorated_pot"), List.of(cb.a.a().a(ara.aL), cb.a.a().a(ara.aL), cb.a.a().a(ara.aL), cb.a.a().a(ara.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new ckj(ckm.wy),
            ui.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            ui.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$13)
         .a(
            new ckj(ckm.wK),
            ui.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            ui.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ae.a.a()
         .a($$2)
         .a(
            ckm.ef,
            ui.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            ui.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cuc.cm))
         .a("comparator", b(cuc.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(cua $$0) {
      egh.a[] $$1 = cvk.aE.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cvk.aE, $$0x);
         av.a $$2 = av.a.a().a(cuc.gY).a($$1x);
         return egf.a(cj.a.a().a($$2), new ht($$0x.g().q()));
      }).toArray(egh.a[]::new);
      return cc.a.a(egg.a($$0), efw.a($$1));
   }

   private static am<cc.a> b(cua $$0) {
      egh.a[] $$1 = cvk.aE.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cvk.aE, $$1x);
         egg.a $$3 = new egg.a(cuc.gY).a($$2);
         egh.a $$4 = egf.a(cj.a.a().a(av.a.a().a($$0)), new ht($$1x.q()));
         return efv.a($$3, $$4);
      }).toArray(egh.a[]::new);
      return cc.a.a(efw.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Map<cke, afw> $$1 = nb.b();
      Stream.of(ckm.wH, ckm.wF, ckm.wG, ckm.wB, ckm.wK, ckm.wD, ckm.wE, ckm.wI).forEach($$2 -> {
         afw $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, ct.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);

      for (afw $$1 : nb.b().values()) {
         $$0.a("armor_trimmed_" + $$1, ct.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      Map<String, am<ck.a>> $$1 = Map.of(
         "desert_pyramid",
         ck.a.a(edg.aD),
         "desert_well",
         ck.a.a(edg.aC),
         "ocean_ruin_cold",
         ck.a.a(edg.aH),
         "ocean_ruin_warm",
         ck.a.a(edg.aG),
         "trail_ruins_rare",
         ck.a.a(edg.aF),
         "trail_ruins_common",
         ck.a.a(edg.aE)
      );
      $$1.forEach($$0::a);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(ara.aL)));
      $$0.a(new ai(new String[][]{$$1.keySet().toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, csl.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            ckm.oZ,
            ui.c("advancements.adventure.adventuring_time.title"),
            ui.c("advancements.adventure.adventuring_time.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a d(ae.a $$0) {
      for (bjx<?> $$1 : e) {
         $$0.a(jy.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<afv<crx>> $$1) {
      for (afv<crx> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
