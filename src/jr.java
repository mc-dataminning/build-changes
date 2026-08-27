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
   private static final biu<?>[] e = new biu[]{
      biu.i,
      biu.n,
      biu.u,
      biu.y,
      biu.A,
      biu.C,
      biu.E,
      biu.F,
      biu.G,
      biu.Q,
      biu.V,
      biu.W,
      biu.Z,
      biu.al,
      biu.au,
      biu.aw,
      biu.ax,
      biu.ay,
      biu.aD,
      biu.aG,
      biu.aI,
      biu.aJ,
      biu.aL,
      biu.aS,
      biu.aU,
      biu.be,
      biu.bg,
      biu.bj,
      biu.bl,
      biu.bk,
      biu.bo,
      biu.br,
      biu.bp,
      biu.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(biu<?> $$0, cja $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cji.tp,
            tm.c("advancements.adventure.root.title"),
            tm.c("advancements.adventure.root.description"),
            new aex("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(csw.bn, tm.c("advancements.adventure.sleep_in_bed.title"), tm.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, crh.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cji.nL, tm.c("advancements.adventure.trade.title"), tm.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cji.nL,
            tm.c("advancements.adventure.trade_at_world_height.title"),
            tm.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cji.om, tm.c("advancements.adventure.kill_a_mob.title"), tm.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cji.or, tm.c("advancements.adventure.kill_all_mobs.title"), tm.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cji.nG, tm.c("advancements.adventure.shoot_arrow.title"), tm.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apv.j)).a(bq.a.a().a(apw.d)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cji.uV, tm.c("advancements.adventure.throw_trident.title"), tm.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apv.j)).a(bq.a.a().a(biu.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cji.uV,
            tm.c("advancements.adventure.very_very_frightening.title"),
            tm.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(biu.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            csw.ef,
            tm.c("advancements.adventure.summon_iron_golem.title"),
            tm.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(biu.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cji.nH, tm.c("advancements.adventure.sniper_duel.title"), tm.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(biu.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(apv.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cji.uz,
            tm.c("advancements.adventure.totem_of_undying.title"),
            tm.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(cji.uz))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cji.uZ, tm.c("advancements.adventure.ol_betsy.title"), tm.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(cji.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cji.uZ,
            tm.c("advancements.adventure.whos_the_pillager_now.title"),
            tm.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(biu.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cji.uZ,
            tm.c("advancements.adventure.two_birds_one_arrow.title"),
            tm.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(biu.au), bq.a.a().a(biu.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cji.uZ, tm.c("advancements.adventure.arbalistic.title"), tm.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cdb.s(),
            tm.c("advancements.adventure.voluntary_exile.title"),
            tm.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(apw.b).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cdb.s(),
            tm.c("advancements.adventure.hero_of_the_village.title"),
            tm.c("advancements.adventure.hero_of_the_village.description"),
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
            csw.pg.k(),
            tm.c("advancements.adventure.honey_block_slide.title"),
            tm.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(csw.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(csw.pd.k(), tm.c("advancements.adventure.bullseye.title"), tm.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cji.oN,
            tm.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            tm.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(csw.qC, cji.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cji.lB,
            tm.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            tm.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(biu.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cji.qj,
            tm.c("advancements.adventure.spyglass_at_parrot.title"),
            tm.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(biu.at, cji.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cji.qj,
            tm.c("advancements.adventure.spyglass_at_ghast.title"),
            tm.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(biu.Q, cji.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cji.eC,
            tm.c("advancements.adventure.play_jukebox_in_meadows.title"),
            tm.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(cra.D).a(av.a.a().a(csw.dT)), cb.a.a().a(aqb.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cji.qj,
            tm.c("advancements.adventure.spyglass_at_dragon.title"),
            tm.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(biu.C, cji.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cji.pL,
            tm.c("advancements.adventure.fall_from_world_height.title"),
            tm.c("advancements.adventure.fall_from_world_height.description"),
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
            csw.qH,
            tm.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            tm.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            csw.qD,
            tm.c("advancements.adventure.avoid_vibration.title"),
            tm.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cji.wv, tm.c("advancements.adventure.salvage_sherd.title"), tm.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            ddk.a(new ddk.a(cji.pX, cji.wW, cji.pX, cji.wU)),
            tm.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            tm.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new aex("minecraft:decorated_pot"), List.of(cb.a.a().a(aqb.aL), cb.a.a().a(aqb.aL), cb.a.a().a(aqb.aL), cb.a.a().a(aqb.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cjf(cji.wy),
            tm.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            tm.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cjf(cji.wK),
            tm.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            tm.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cji.ef,
            tm.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            tm.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(csw.cm))
         .a("comparator", b(csw.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(csv $$0) {
      efp.a[] $$1 = cud.aC.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cud.aC, $$0x);
         av.a $$2 = av.a.a().a(csw.gY).a($$1x);
         return efn.a(cj.a.a().a($$2), new gw($$0x.g().q()));
      }).toArray(efp.a[]::new);
      return cc.a.a(efo.a($$0), efe.a($$1));
   }

   private static am<cc.a> b(csv $$0) {
      efp.a[] $$1 = cud.aC.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cud.aC, $$1x);
         efo.a $$3 = new efo.a(csw.gY).a($$2);
         efp.a $$4 = efn.a(cj.a.a().a(av.a.a().a($$0)), new gw($$1x.q()));
         return efd.a($$3, $$4);
      }).toArray(efp.a[]::new);
      return cc.a.a(efe.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Map<cja, aex> $$1 = mg.b();
      Stream.of(cji.wH, cji.wF, cji.wG, cji.wB, cji.wK, cji.wD, cji.wE, cji.wI).forEach($$2 -> {
         aex $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, ct.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);

      for (aex $$1 : mg.b().values()) {
         $$0.a("armor_trimmed_" + $$1, ct.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      Map<String, am<ck.a>> $$1 = Map.of(
         "desert_pyramid",
         ck.a.a(eco.aD),
         "desert_well",
         ck.a.a(eco.aC),
         "ocean_ruin_cold",
         ck.a.a(eco.aH),
         "ocean_ruin_warm",
         ck.a.a(eco.aG),
         "trail_ruins_rare",
         ck.a.a(eco.aF),
         "trail_ruins_common",
         ck.a.a(eco.aE)
      );
      $$1.forEach($$0::a);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(aqb.aL)));
      $$0.a(new ai(new String[][]{$$1.keySet().toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, crh.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cji.oZ,
            tm.c("advancements.adventure.adventuring_time.title"),
            tm.c("advancements.adventure.adventuring_time.description"),
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
      for (biu<?> $$1 : e) {
         $$0.a(jd.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aew<cqt>> $$1) {
      for (aew<cqt> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
