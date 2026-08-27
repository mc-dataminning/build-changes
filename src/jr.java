import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class jr implements jo {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final biw<?>[] e = new biw[]{
      biw.i,
      biw.n,
      biw.u,
      biw.y,
      biw.A,
      biw.C,
      biw.E,
      biw.F,
      biw.G,
      biw.Q,
      biw.V,
      biw.W,
      biw.Z,
      biw.al,
      biw.au,
      biw.aw,
      biw.ax,
      biw.ay,
      biw.aD,
      biw.aG,
      biw.aI,
      biw.aJ,
      biw.aL,
      biw.aS,
      biw.aU,
      biw.be,
      biw.bg,
      biw.bj,
      biw.bl,
      biw.bk,
      biw.bo,
      biw.br,
      biw.bp,
      biw.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(biw<?> $$0, cjc $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cjk.tp,
            tn.c("advancements.adventure.root.title"),
            tn.c("advancements.adventure.root.description"),
            new aey("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(csy.bn, tn.c("advancements.adventure.sleep_in_bed.title"), tn.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, crj.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cjk.nL, tn.c("advancements.adventure.trade.title"), tn.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cjk.nL,
            tn.c("advancements.adventure.trade_at_world_height.title"),
            tn.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cjk.om, tn.c("advancements.adventure.kill_a_mob.title"), tn.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cjk.or, tn.c("advancements.adventure.kill_all_mobs.title"), tn.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjk.nG, tn.c("advancements.adventure.shoot_arrow.title"), tn.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apw.j)).a(bq.a.a().a(apx.d)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cjk.uV, tn.c("advancements.adventure.throw_trident.title"), tn.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apw.j)).a(bq.a.a().a(biw.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cjk.uV,
            tn.c("advancements.adventure.very_very_frightening.title"),
            tn.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(biw.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            csy.ef,
            tn.c("advancements.adventure.summon_iron_golem.title"),
            tn.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(biw.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cjk.nH, tn.c("advancements.adventure.sniper_duel.title"), tn.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(biw.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(apw.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cjk.uz,
            tn.c("advancements.adventure.totem_of_undying.title"),
            tn.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(cjk.uz))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cjk.uZ, tn.c("advancements.adventure.ol_betsy.title"), tn.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(cjk.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cjk.uZ,
            tn.c("advancements.adventure.whos_the_pillager_now.title"),
            tn.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(biw.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cjk.uZ,
            tn.c("advancements.adventure.two_birds_one_arrow.title"),
            tn.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(biw.au), bq.a.a().a(biw.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cjk.uZ, tn.c("advancements.adventure.arbalistic.title"), tn.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cdd.s(),
            tn.c("advancements.adventure.voluntary_exile.title"),
            tn.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(apx.b).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cdd.s(),
            tn.c("advancements.adventure.hero_of_the_village.title"),
            tn.c("advancements.adventure.hero_of_the_village.description"),
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
            csy.pg.k(),
            tn.c("advancements.adventure.honey_block_slide.title"),
            tn.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(csy.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(csy.pd.k(), tn.c("advancements.adventure.bullseye.title"), tn.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cjk.oN,
            tn.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            tn.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(csy.qC, cjk.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cjk.lB,
            tn.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            tn.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(biw.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cjk.qj,
            tn.c("advancements.adventure.spyglass_at_parrot.title"),
            tn.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(biw.at, cjk.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cjk.qj,
            tn.c("advancements.adventure.spyglass_at_ghast.title"),
            tn.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(biw.Q, cjk.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cjk.eC,
            tn.c("advancements.adventure.play_jukebox_in_meadows.title"),
            tn.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(crc.D).a(av.a.a().a(csy.dT)), cb.a.a().a(aqc.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cjk.qj,
            tn.c("advancements.adventure.spyglass_at_dragon.title"),
            tn.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(biw.C, cjk.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cjk.pL,
            tn.c("advancements.adventure.fall_from_world_height.title"),
            tn.c("advancements.adventure.fall_from_world_height.description"),
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
            csy.qH,
            tn.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            tn.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            csy.qD,
            tn.c("advancements.adventure.avoid_vibration.title"),
            tn.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cjk.wv, tn.c("advancements.adventure.salvage_sherd.title"), tn.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            ddm.a(new ddm.a(cjk.pX, cjk.wW, cjk.pX, cjk.wU)),
            tn.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            tn.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new aey("minecraft:decorated_pot"), List.of(cb.a.a().a(aqc.aL), cb.a.a().a(aqc.aL), cb.a.a().a(aqc.aL), cb.a.a().a(aqc.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cjh(cjk.wy),
            tn.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            tn.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cjh(cjk.wK),
            tn.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            tn.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cjk.ef,
            tn.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            tn.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(csy.cm))
         .a("comparator", b(csy.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(csx $$0) {
      efr.a[] $$1 = cuf.aC.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cuf.aC, $$0x);
         av.a $$2 = av.a.a().a(csy.gY).a($$1x);
         return efp.a(cj.a.a().a($$2), new gw($$0x.g().q()));
      }).toArray(efr.a[]::new);
      return cc.a.a(efq.a($$0), efg.a($$1));
   }

   private static am<cc.a> b(csx $$0) {
      efr.a[] $$1 = cuf.aC.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cuf.aC, $$1x);
         efq.a $$3 = new efq.a(csy.gY).a($$2);
         efr.a $$4 = efp.a(cj.a.a().a(av.a.a().a($$0)), new gw($$1x.q()));
         return eff.a($$3, $$4);
      }).toArray(efr.a[]::new);
      return cc.a.a(efg.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Map<cjc, aey> $$1 = mg.b();
      Stream.of(cjk.wH, cjk.wF, cjk.wG, cjk.wB, cjk.wK, cjk.wD, cjk.wE, cjk.wI).forEach($$2 -> {
         aey $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, ct.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);

      for (aey $$1 : mg.b().values()) {
         $$0.a("armor_trimmed_" + $$1, ct.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      Map<String, am<ck.a>> $$1 = Map.of(
         "desert_pyramid",
         ck.a.a(ecq.aD),
         "desert_well",
         ck.a.a(ecq.aC),
         "ocean_ruin_cold",
         ck.a.a(ecq.aH),
         "ocean_ruin_warm",
         ck.a.a(ecq.aG),
         "trail_ruins_rare",
         ck.a.a(ecq.aF),
         "trail_ruins_common",
         ck.a.a(ecq.aE)
      );
      $$1.forEach($$0::a);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(aqc.aL)));
      $$0.a(new ai(new String[][]{$$1.keySet().toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, crj.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cjk.oZ,
            tn.c("advancements.adventure.adventuring_time.title"),
            tn.c("advancements.adventure.adventuring_time.description"),
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
      for (biw<?> $$1 : e) {
         $$0.a(jd.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aex<cqv>> $$1) {
      for (aex<cqv> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
