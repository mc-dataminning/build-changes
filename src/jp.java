import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jp implements jm {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bim<?>[] e = new bim[]{
      bim.i,
      bim.n,
      bim.u,
      bim.y,
      bim.A,
      bim.C,
      bim.E,
      bim.F,
      bim.G,
      bim.Q,
      bim.V,
      bim.W,
      bim.Z,
      bim.al,
      bim.au,
      bim.aw,
      bim.ax,
      bim.ay,
      bim.aD,
      bim.aG,
      bim.aI,
      bim.aJ,
      bim.aL,
      bim.aS,
      bim.aU,
      bim.be,
      bim.bg,
      bim.bj,
      bim.bl,
      bim.bk,
      bim.bo,
      bim.br,
      bim.bp,
      bim.bs
   };

   private static cg.a a(cj.d $$0, Optional<bo> $$1) {
      return cg.a.a(bo.a.a().a(bf.c(cj.c.c(30.0))).a(cf.a($$0)).b(), $$1);
   }

   private static dg.a a(bim<?> $$0, cit $$1) {
      return dg.a.a(bo.a.a().a(cp.d.a().a(bo.a.a().a($$0).b()).b()), bz.a.a().a($$1));
   }

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cjb.tp,
            tf.c("advancements.adventure.root.title"),
            tf.c("advancements.adventure.root.description"),
            new aer("textures/gui/advancements/backgrounds/adventure.png"),
            ao.a,
            false,
            false,
            false
         )
         .a(ap.b)
         .a("killed_something", cc.a.d())
         .a("killed_by_something", cc.a.f())
         .a($$1, "adventure/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(csn.bn, tf.c("advancements.adventure.sleep_in_bed.title"), tf.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", cq.a.d())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cqy.a.b);
      ae $$4 = ae.a.a()
         .a($$2)
         .a(cjb.nL, tf.c("advancements.adventure.trade.title"), tf.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", dd.a.d())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cjb.nL,
            tf.c("advancements.adventure.trade_at_world_height.title"),
            tf.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dd.a.a(bo.a.a().a(ch.a.a(cj.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ae $$5 = d(ae.a.a())
         .a($$2)
         .a(cjb.om, tf.c("advancements.adventure.kill_a_mob.title"), tf.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cjb.or, tf.c("advancements.adventure.kill_all_mobs.title"), tf.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cjb.nG, tf.c("advancements.adventure.shoot_arrow.title"), tf.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", cn.a.a(bc.a.a().a(bd.a.a().a(da.a(apn.j)).a(bo.a.a().a(apo.d)))))
         .a($$1, "adventure/shoot_arrow");
      ae $$7 = ae.a.a()
         .a($$5)
         .a(cjb.uV, tf.c("advancements.adventure.throw_trident.title"), tf.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", cn.a.a(bc.a.a().a(bd.a.a().a(da.a(apn.j)).a(bo.a.a().a(bim.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cjb.uV,
            tf.c("advancements.adventure.very_very_frightening.title"),
            tf.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", ax.a.a(bo.a.a().a(bim.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            csn.ef,
            tf.c("advancements.adventure.summon_iron_golem.title"),
            tf.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", cz.a.a(bo.a.a().a(bim.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cjb.nH, tf.c("advancements.adventure.sniper_duel.title"), tf.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_skeleton", cc.a.a(bo.a.a().a(bim.aJ).a(bf.a(cj.c.b(50.0))), bd.a.a().a(da.a(apn.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cjb.uz,
            tf.c("advancements.adventure.totem_of_undying.title"),
            tf.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", df.a.a(cjb.uz))
         .a($$1, "adventure/totem_of_undying");
      ae $$8 = ae.a.a()
         .a($$2)
         .a(cjb.uZ, tf.c("advancements.adventure.ol_betsy.title"), tf.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", ct.a.a(cjb.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cjb.uZ,
            tf.c("advancements.adventure.whos_the_pillager_now.title"),
            tf.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cb.a.a(bo.a.a().a(bim.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cjb.uZ,
            tf.c("advancements.adventure.two_birds_one_arrow.title"),
            tf.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(65))
         .a("two_birds", cb.a.a(bo.a.a().a(bim.au), bo.a.a().a(bim.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cjb.uZ, tf.c("advancements.adventure.arbalistic.title"), tf.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(ah.a.a(85))
         .a("arbalistic", cb.a.a(cj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ae $$9 = ae.a.a()
         .a($$2)
         .a(
            ccu.s(),
            tf.c("advancements.adventure.voluntary_exile.title"),
            tf.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cc.a.a(bo.a.a().a(apo.b).a(bl.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            ccu.s(),
            tf.c("advancements.adventure.hero_of_the_village.title"),
            tf.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ao.b,
            true,
            true,
            true
         )
         .a(ah.a.a(100))
         .a("hero_of_the_village", cq.a.e())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            csn.pg.k(),
            tf.c("advancements.adventure.honey_block_slide.title"),
            tf.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cv.a.a(csn.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(csn.pd.k(), tf.c("advancements.adventure.bullseye.title"), tf.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("bullseye", dc.a.a(cj.d.a(15), bo.a(bo.a.a().a(bf.a(cj.c.b(30.0))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cjb.oN,
            tf.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            tf.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cq.a.a(csn.qC, cjb.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cjb.lB,
            tf.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            tf.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cj.d.a(0), bo.a.a().a(bim.bf).b()))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ae $$10 = ae.a.a()
         .a($$2)
         .a(
            cjb.qj,
            tf.c("advancements.adventure.spyglass_at_parrot.title"),
            tf.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bim.at, cjb.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(
            cjb.qj,
            tf.c("advancements.adventure.spyglass_at_ghast.title"),
            tf.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bim.Q, cjb.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cjb.eC,
            tf.c("advancements.adventure.play_jukebox_in_meadows.title"),
            tf.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ca.a.a(ch.a.a().d(cqr.D).a(at.a.a().a(csn.dT)), bz.a.a().a(apt.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cjb.qj,
            tf.c("advancements.adventure.spyglass_at_dragon.title"),
            tf.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bim.C, cjb.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cjb.pL,
            tf.c("advancements.adventure.fall_from_world_height.title"),
            tf.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bg.a.a(bo.a.a().a(ch.a.a(cj.c.c(-59.0))), bf.b(cj.c.b(379.0)), ch.a.a(cj.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            csn.qH,
            tf.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            tf.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cc.a.e())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            csn.qD,
            tf.c("advancements.adventure.avoid_vibration.title"),
            tf.c("advancements.adventure.avoid_vibration.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cq.a.f())
         .a($$1, "adventure/avoid_vibration");
      ae $$12 = c(ae.a.a())
         .a($$2)
         .a(cjb.wv, tf.c("advancements.adventure.salvage_sherd.title"), tf.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            ddb.a(new ddb.a(cjb.pX, cjb.wW, cjb.pX, cjb.wU)),
            tf.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            tf.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cr.a.a(new aer("minecraft:decorated_pot"), List.of(bz.a.a().a(apt.aL), bz.a.a().a(apt.aL), bz.a.a().a(apt.aL), bz.a.a().a(apt.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ae $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new ciy(cjb.wy),
            tf.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            tf.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new ciy(cjb.wK),
            tf.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            tf.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cjb.ef,
            tf.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            tf.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(ap.b)
         .a("chiseled_bookshelf", a(csn.cm))
         .a("comparator", b(csn.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am a(csm $$0) {
      efg.a[] $$1 = ctu.aC.a().stream().map($$0x -> {
         cy.a $$1x = cy.a.a().a(ctu.aC, $$0x);
         at.a $$2 = at.a.a().a(csn.gY).a($$1x);
         return efe.a(ch.a.a().a($$2), new gu($$0x.g().q()));
      }).toArray(efg.a[]::new);
      return ca.a.a(eff.a($$0), eev.a($$1));
   }

   private static am b(csm $$0) {
      efg.a[] $$1 = ctu.aC.a().stream().map($$1x -> {
         cy.a $$2 = cy.a.a().a(ctu.aC, $$1x);
         eff.a $$3 = new eff.a(csn.gY).a($$2);
         efg.a $$4 = efe.a(ch.a.a().a(at.a.a().a($$0)), new gu($$1x.q()));
         return eeu.a($$3, $$4);
      }).toArray(efg.a[]::new);
      return ca.a.a(eev.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ap.a);
      Map<cit, aer> $$1 = mb.b();
      Stream.of(cjb.wH, cjb.wF, cjb.wG, cjb.wB, cjb.wK, cjb.wD, cjb.wE, cjb.wI).forEach($$2 -> {
         aer $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, cr.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ap.b);

      for (aer $$1 : mb.b().values()) {
         $$0.a("armor_trimmed_" + $$1, cr.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      $$0.a("desert_pyramid", ci.a.a(ecf.aD));
      $$0.a("desert_well", ci.a.a(ecf.aC));
      $$0.a("ocean_ruin_cold", ci.a.a(ecf.aH));
      $$0.a("ocean_ruin_warm", ci.a.a(ecf.aG));
      $$0.a("trail_ruins_rare", ci.a.a(ecf.aF));
      $$0.a("trail_ruins_common", ci.a.a(ecf.aE));
      String[] $$1 = $$0.d().keySet().toArray(String[]::new);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bx.a.a(bz.a.a().a(apt.aL)));
      $$0.a(new String[][]{$$1, {"has_sherd"}});
      return $$0;
   }

   protected static void a(Consumer<ae> $$0, ae $$1, cqy.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cjb.oZ,
            tf.c("advancements.adventure.adventuring_time.title"),
            tf.c("advancements.adventure.adventuring_time.description"),
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
      for (bim<?> $$1 : e) {
         $$0.a(jb.h.b($$1).toString(), cc.a.a(bo.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aeq<cqk>> $$1) {
      for (aeq<cqk> $$2 : $$1) {
         $$0.a($$2.a().toString(), cq.a.a(ch.a.a($$2)));
      }

      return $$0;
   }
}
