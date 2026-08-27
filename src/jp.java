import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jp implements jm {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bfn<?>[] e = new bfn[]{
      bfn.i,
      bfn.n,
      bfn.u,
      bfn.y,
      bfn.A,
      bfn.C,
      bfn.E,
      bfn.F,
      bfn.G,
      bfn.Q,
      bfn.V,
      bfn.W,
      bfn.Z,
      bfn.al,
      bfn.au,
      bfn.aw,
      bfn.ax,
      bfn.ay,
      bfn.aD,
      bfn.aG,
      bfn.aI,
      bfn.aJ,
      bfn.aL,
      bfn.aS,
      bfn.aU,
      bfn.be,
      bfn.bg,
      bfn.bj,
      bfn.bl,
      bfn.bk,
      bfn.bo,
      bfn.br,
      bfn.bp,
      bfn.bs
   };

   private static cg.a a(cj.d $$0, bo $$1) {
      return cg.a.a(bo.a.a().a(bf.c(cj.c.c(30.0))).a(cf.a($$0)).b(), $$1);
   }

   private static dh.a a(bfn<?> $$0, cfu $$1) {
      return dh.a.a(bo.a.a().a(cp.d.a().a(bo.a.a().a($$0).b()).b()), bz.a.a().a($$1));
   }

   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cgc.tp,
            sw.c("advancements.adventure.root.title"),
            sw.c("advancements.adventure.root.description"),
            new acq("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cpo.bn, sw.c("advancements.adventure.sleep_in_bed.title"), sw.c("advancements.adventure.sleep_in_bed.description"), null, ao.a, true, true, false)
         .a("slept_in_bed", cq.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cny.a.b);
      ae $$4 = ae.a.a()
         .a($$2)
         .a(cgc.nL, sw.c("advancements.adventure.trade.title"), sw.c("advancements.adventure.trade.description"), null, ao.a, true, true, false)
         .a("traded", de.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cgc.nL,
            sw.c("advancements.adventure.trade_at_world_height.title"),
            sw.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cgc.om, sw.c("advancements.adventure.kill_a_mob.title"), sw.c("advancements.adventure.kill_a_mob.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cgc.or, sw.c("advancements.adventure.kill_all_mobs.title"), sw.c("advancements.adventure.kill_all_mobs.description"), null, ao.b, true, true, false)
         .a(ah.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cgc.nG, sw.c("advancements.adventure.shoot_arrow.title"), sw.c("advancements.adventure.shoot_arrow.description"), null, ao.a, true, true, false)
         .a("shot_arrow", cn.a.a(bc.a.a().a(bd.a.a().a(db.a(amy.j)).a(bo.a.a().a(amz.d)))))
         .a($$1, "adventure/shoot_arrow");
      ae $$7 = ae.a.a()
         .a($$5)
         .a(cgc.uV, sw.c("advancements.adventure.throw_trident.title"), sw.c("advancements.adventure.throw_trident.description"), null, ao.a, true, true, false)
         .a("shot_trident", cn.a.a(bc.a.a().a(bd.a.a().a(db.a(amy.j)).a(bo.a.a().a(bfn.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cgc.uV,
            sw.c("advancements.adventure.very_very_frightening.title"),
            sw.c("advancements.adventure.very_very_frightening.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("struck_villager", ax.a.a(bo.a.a().a(bfn.bf).b()))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cpo.ef,
            sw.c("advancements.adventure.summon_iron_golem.title"),
            sw.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bo.a.a().a(bfn.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cgc.nH, sw.c("advancements.adventure.sniper_duel.title"), sw.c("advancements.adventure.sniper_duel.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("killed_skeleton", cc.a.a(bo.a.a().a(bfn.aJ).a(bf.a(cj.c.b(50.0))), bd.a.a().a(db.a(amy.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cgc.uz,
            sw.c("advancements.adventure.totem_of_undying.title"),
            sw.c("advancements.adventure.totem_of_undying.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(cgc.uz))
         .a($$1, "adventure/totem_of_undying");
      ae $$8 = ae.a.a()
         .a($$2)
         .a(cgc.uZ, sw.c("advancements.adventure.ol_betsy.title"), sw.c("advancements.adventure.ol_betsy.description"), null, ao.a, true, true, false)
         .a("shot_crossbow", cu.a.a(cgc.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cgc.uZ,
            sw.c("advancements.adventure.whos_the_pillager_now.title"),
            sw.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cb.a.a(bo.a.a().a(bfn.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cgc.uZ,
            sw.c("advancements.adventure.two_birds_one_arrow.title"),
            sw.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a(ah.a.a(65))
         .a("two_birds", cb.a.a(bo.a.a().a(bfn.au), bo.a.a().a(bfn.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cgc.uZ, sw.c("advancements.adventure.arbalistic.title"), sw.c("advancements.adventure.arbalistic.description"), null, ao.b, true, true, true)
         .a(ah.a.a(85))
         .a("arbalistic", cb.a.a(cj.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ae $$9 = ae.a.a()
         .a($$2)
         .a(
            bzv.s(),
            sw.c("advancements.adventure.voluntary_exile.title"),
            sw.c("advancements.adventure.voluntary_exile.description"),
            null,
            ao.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cc.a.a(bo.a.a().a(amz.b).a(bl.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            bzv.s(),
            sw.c("advancements.adventure.hero_of_the_village.title"),
            sw.c("advancements.adventure.hero_of_the_village.description"),
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
            cpo.pg.k(),
            sw.c("advancements.adventure.honey_block_slide.title"),
            sw.c("advancements.adventure.honey_block_slide.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cpo.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cpo.pd.k(), sw.c("advancements.adventure.bullseye.title"), sw.c("advancements.adventure.bullseye.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("bullseye", dd.a.a(cj.d.a(15), bo.a(bo.a.a().a(bf.a(cj.c.b(30.0))).b())))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cgc.oN,
            sw.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            sw.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cq.a.a(cpo.qC, cgc.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cgc.lB,
            sw.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            sw.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cj.d.a(0), bo.a.a().a(bfn.bf).b()))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ae $$10 = ae.a.a()
         .a($$2)
         .a(
            cgc.qj,
            sw.c("advancements.adventure.spyglass_at_parrot.title"),
            sw.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bfn.at, cgc.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(
            cgc.qj,
            sw.c("advancements.adventure.spyglass_at_ghast.title"),
            sw.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bfn.Q, cgc.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cgc.eC,
            sw.c("advancements.adventure.play_jukebox_in_meadows.title"),
            sw.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ca.a.a(ch.a.a().a(cnr.D).a(at.a.a().a(cpo.dT).b()), bz.a.a().a(ane.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cgc.qj,
            sw.c("advancements.adventure.spyglass_at_dragon.title"),
            sw.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bfn.C, cgc.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cgc.pL,
            sw.c("advancements.adventure.fall_from_world_height.title"),
            sw.c("advancements.adventure.fall_from_world_height.description"),
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
            cpo.qH,
            sw.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            sw.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cpo.qD,
            sw.c("advancements.adventure.avoid_vibration.title"),
            sw.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cgc.wv, sw.c("advancements.adventure.salvage_sherd.title"), sw.c("advancements.adventure.salvage_sherd.description"), null, ao.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            civ.a(new dac.a(cgc.pX, cgc.wW, cgc.pX, cgc.wU)),
            sw.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            sw.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cr.a.a(new acq("minecraft:decorated_pot"), List.of(bz.a.a().a(ane.aL).b(), bz.a.a().a(ane.aL).b(), bz.a.a().a(ane.aL).b(), bz.a.a().a(ane.aL).b()))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ae $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cfz(cgc.wy),
            sw.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            sw.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cfz(cgc.wK),
            sw.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            sw.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ao.b,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ae.a.a()
         .a($$2)
         .a(
            cgc.ef,
            sw.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            sw.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ao.a,
            true,
            true,
            false
         )
         .a(ap.b)
         .a("chiseled_bookshelf", a(cpo.cm))
         .a("comparator", b(cpo.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am a(cpn $$0) {
      eck.a[] $$1 = cqv.aC.a().stream().map($$0x -> {
         cz $$1x = cz.a.a().a(cqv.aC, $$0x).b();
         at $$2 = at.a.a().a(cpo.gY).a($$1x).b();
         return eci.a(ch.a.a().a($$2), new gu($$0x.g().q()));
      }).toArray(eck.a[]::new);
      return ca.a.a(ecj.a($$0), ebz.a($$1));
   }

   private static am b(cpn $$0) {
      eck.a[] $$1 = cqv.aC.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cqv.aC, $$1x);
         ecj.a $$3 = new ecj.a(cpo.gY).a($$2);
         eck.a $$4 = eci.a(ch.a.a().a(at.a.a().a($$0).b()), new gu($$1x.q()));
         return eby.a($$3, $$4);
      }).toArray(eck.a[]::new);
      return ca.a.a(ebz.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ap.a);
      Map<cfu, acq> $$1 = mb.b();
      Stream.of(cgc.wH, cgc.wF, cgc.wG, cgc.wB, cgc.wK, cgc.wD, cgc.wE, cgc.wI).forEach($$2 -> {
         acq $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, cr.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ap.b);

      for (acq $$1 : mb.b().values()) {
         $$0.a("armor_trimmed_" + $$1, cr.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      $$0.a("desert_pyramid", ci.a.a(dzg.aD));
      $$0.a("desert_well", ci.a.a(dzg.aC));
      $$0.a("ocean_ruin_cold", ci.a.a(dzg.aH));
      $$0.a("ocean_ruin_warm", ci.a.a(dzg.aG));
      $$0.a("trail_ruins_rare", ci.a.a(dzg.aF));
      $$0.a("trail_ruins_common", ci.a.a(dzg.aE));
      String[] $$1 = $$0.d().keySet().toArray(String[]::new);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bx.a.a(bz.a.a().a(ane.aL).b()));
      $$0.a(new String[][]{$$1, {"has_sherd"}});
      return $$0;
   }

   protected static void a(Consumer<ae> $$0, ae $$1, cny.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cgc.oZ,
            sw.c("advancements.adventure.adventuring_time.title"),
            sw.c("advancements.adventure.adventuring_time.description"),
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
      for (bfn<?> $$1 : e) {
         $$0.a(jb.h.b($$1).toString(), cc.a.a(bo.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<acp<cnk>> $$1) {
      for (acp<cnk> $$2 : $$1) {
         $$0.a($$2.a().toString(), cq.a.a(ch.a($$2)));
      }

      return $$0;
   }
}
