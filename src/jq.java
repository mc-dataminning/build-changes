import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jq implements jn {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bik<?>[] e = new bik[]{
      bik.i,
      bik.n,
      bik.u,
      bik.y,
      bik.A,
      bik.C,
      bik.E,
      bik.F,
      bik.G,
      bik.Q,
      bik.V,
      bik.W,
      bik.Z,
      bik.al,
      bik.au,
      bik.aw,
      bik.ax,
      bik.ay,
      bik.aD,
      bik.aG,
      bik.aI,
      bik.aJ,
      bik.aL,
      bik.aS,
      bik.aU,
      bik.be,
      bik.bg,
      bik.bj,
      bik.bl,
      bik.bk,
      bik.bo,
      bik.br,
      bik.bp,
      bik.bs
   };

   private static cg.a a(cj.d $$0, bo $$1) {
      return cg.a.a(bo.a.a().a(bf.c(cj.c.c(30.0))).a(cf.a($$0)).b(), $$1);
   }

   private static dh.a a(bik<?> $$0, cir $$1) {
      return dh.a.a(bo.a.a().a(cp.d.a().a(bo.a.a().a($$0).b()).b()), bz.a.a().a($$1));
   }

   @Override
   public void a(hh.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            ciz.tp,
            te.c("advancements.adventure.root.title"),
            te.c("advancements.adventure.root.description"),
            new aep("textures/gui/advancements/backgrounds/adventure.png"),
            ao.a,
            false,
            false,
            false
         )
         .a(ap.b)
         .a("killed_something", cc.a.c())
         .a("killed_by_something", cc.a.e())
         .a($$1, "adventure/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(csl.bn, te.c("advancements.adventure.sleep_in_bed.title"), te.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", cq.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cqw.a.b);
      ae $$4 = ae.a.a()
         .a($$2)
         .a(ciz.nL, te.c("advancements.adventure.trade.title"), te.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", de.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            ciz.nL,
            te.c("advancements.adventure.trade_at_world_height.title"),
            te.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", de.a.a(bo.a.a().a(ch.a(cj.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ae $$5 = d(ae.a.a())
         .a($$2)
         .a(ciz.om, te.c("advancements.adventure.kill_a_mob.title"), te.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(ciz.or, te.c("advancements.adventure.kill_all_mobs.title"), te.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(ciz.nG, te.c("advancements.adventure.shoot_arrow.title"), te.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", cn.a.a(bc.a.a().a(bd.a.a().a(db.a(apl.j)).a(bo.a.a().a(apm.d)))))
         .a($$1, "adventure/shoot_arrow");
      ae $$7 = ae.a.a()
         .a($$5)
         .a(ciz.uV, te.c("advancements.adventure.throw_trident.title"), te.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", cn.a.a(bc.a.a().a(bd.a.a().a(db.a(apl.j)).a(bo.a.a().a(bik.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            ciz.uV,
            te.c("advancements.adventure.very_very_frightening.title"),
            te.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", ax.a.a(bo.a.a().a(bik.bf).b()))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            csl.ef,
            te.c("advancements.adventure.summon_iron_golem.title"),
            te.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bo.a.a().a(bik.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(ciz.nH, te.c("advancements.adventure.sniper_duel.title"), te.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_skeleton", cc.a.a(bo.a.a().a(bik.aJ).a(bf.a(cj.c.b(50.0))), bd.a.a().a(db.a(apl.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            ciz.uz,
            te.c("advancements.adventure.totem_of_undying.title"),
            te.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(ciz.uz))
         .a($$1, "adventure/totem_of_undying");
      ae $$8 = ae.a.a()
         .a($$2)
         .a(ciz.uZ, te.c("advancements.adventure.ol_betsy.title"), te.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", cu.a.a(ciz.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            ciz.uZ,
            te.c("advancements.adventure.whos_the_pillager_now.title"),
            te.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cb.a.a(bo.a.a().a(bik.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            ciz.uZ,
            te.c("advancements.adventure.two_birds_one_arrow.title"),
            te.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(65))
         .a("two_birds", cb.a.a(bo.a.a().a(bik.au), bo.a.a().a(bik.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(ciz.uZ, te.c("advancements.adventure.arbalistic.title"), te.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(ah.a.a(85))
         .a("arbalistic", cb.a.a(cj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ae $$9 = ae.a.a()
         .a($$2)
         .a(
            ccs.s(),
            te.c("advancements.adventure.voluntary_exile.title"),
            te.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cc.a.a(bo.a.a().a(apm.b).a(bl.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            ccs.s(),
            te.c("advancements.adventure.hero_of_the_village.title"),
            te.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ao.b,
            true,
            true,
            true
         )
         .a(ah.a.a(100))
         .a("hero_of_the_village", cq.a.d())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            csl.pg.k(),
            te.c("advancements.adventure.honey_block_slide.title"),
            te.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(csl.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(csl.pd.k(), te.c("advancements.adventure.bullseye.title"), te.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("bullseye", dd.a.a(cj.d.a(15), bo.a(bo.a.a().a(bf.a(cj.c.b(30.0))).b())))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            ciz.oN,
            te.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            te.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cq.a.a(csl.qC, ciz.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            ciz.lB,
            te.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            te.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cj.d.a(0), bo.a.a().a(bik.bf).b()))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ae $$10 = ae.a.a()
         .a($$2)
         .a(
            ciz.qj,
            te.c("advancements.adventure.spyglass_at_parrot.title"),
            te.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bik.at, ciz.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(
            ciz.qj,
            te.c("advancements.adventure.spyglass_at_ghast.title"),
            te.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bik.Q, ciz.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            ciz.eC,
            te.c("advancements.adventure.play_jukebox_in_meadows.title"),
            te.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ca.a.a(ch.a.a().a(cqp.D).a(at.a.a().a(csl.dT).b()), bz.a.a().a(apr.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            ciz.qj,
            te.c("advancements.adventure.spyglass_at_dragon.title"),
            te.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bik.C, ciz.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            ciz.pL,
            te.c("advancements.adventure.fall_from_world_height.title"),
            te.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bg.a.a(bo.a.a().a(ch.a(cj.c.c(-59.0))), bf.b(cj.c.b(379.0)), ch.a(cj.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            csl.qH,
            te.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            te.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cc.a.d())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            csl.qD,
            te.c("advancements.adventure.avoid_vibration.title"),
            te.c("advancements.adventure.avoid_vibration.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cq.a.e())
         .a($$1, "adventure/avoid_vibration");
      ae $$12 = c(ae.a.a())
         .a($$2)
         .a(ciz.wv, te.c("advancements.adventure.salvage_sherd.title"), te.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dcz.a(new dcz.a(ciz.pX, ciz.wW, ciz.pX, ciz.wU)),
            te.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            te.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cr.a.a(new aep("minecraft:decorated_pot"), List.of(bz.a.a().a(apr.aL).b(), bz.a.a().a(apr.aL).b(), bz.a.a().a(apr.aL).b(), bz.a.a().a(apr.aL).b()))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ae $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new ciw(ciz.wy),
            te.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            te.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$13)
         .a(
            new ciw(ciz.wK),
            te.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            te.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ae.a.a()
         .a($$2)
         .a(
            ciz.ef,
            te.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            te.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(ap.b)
         .a("chiseled_bookshelf", a(csl.cm))
         .a("comparator", b(csl.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am a(csk $$0) {
      efh.a[] $$1 = cts.aC.a().stream().map($$0x -> {
         cz $$1x = cz.a.a().a(cts.aC, $$0x).b();
         at $$2 = at.a.a().a(csl.gY).a($$1x).b();
         return eff.a(ch.a.a().a($$2), new gv($$0x.g().q()));
      }).toArray(efh.a[]::new);
      return ca.a.a(efg.a($$0), eew.a($$1));
   }

   private static am b(csk $$0) {
      efh.a[] $$1 = cts.aC.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cts.aC, $$1x);
         efg.a $$3 = new efg.a(csl.gY).a($$2);
         efh.a $$4 = eff.a(ch.a.a().a(at.a.a().a($$0).b()), new gv($$1x.q()));
         return eev.a($$3, $$4);
      }).toArray(efh.a[]::new);
      return ca.a.a(eew.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ap.a);
      Map<cir, aep> $$1 = mc.b();
      Stream.of(ciz.wH, ciz.wF, ciz.wG, ciz.wB, ciz.wK, ciz.wD, ciz.wE, ciz.wI).forEach($$2 -> {
         aep $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, cr.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ap.b);

      for (aep $$1 : mc.b().values()) {
         $$0.a("armor_trimmed_" + $$1, cr.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      $$0.a("desert_pyramid", ci.a.a(ecd.aD));
      $$0.a("desert_well", ci.a.a(ecd.aC));
      $$0.a("ocean_ruin_cold", ci.a.a(ecd.aH));
      $$0.a("ocean_ruin_warm", ci.a.a(ecd.aG));
      $$0.a("trail_ruins_rare", ci.a.a(ecd.aF));
      $$0.a("trail_ruins_common", ci.a.a(ecd.aE));
      String[] $$1 = $$0.d().keySet().toArray(String[]::new);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bx.a.a(bz.a.a().a(apr.aL).b()));
      $$0.a(new String[][]{$$1, {"has_sherd"}});
      return $$0;
   }

   protected static void a(Consumer<ae> $$0, ae $$1, cqw.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            ciz.oZ,
            te.c("advancements.adventure.adventuring_time.title"),
            te.c("advancements.adventure.adventuring_time.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a d(ae.a $$0) {
      for (bik<?> $$1 : e) {
         $$0.a(jc.h.b($$1).toString(), cc.a.a(bo.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aeo<cqi>> $$1) {
      for (aeo<cqi> $$2 : $$1) {
         $$0.a($$2.a().toString(), cq.a.a(ch.a($$2)));
      }

      return $$0;
   }
}
