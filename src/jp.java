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
   private static final bja<?>[] e = new bja[]{
      bja.i,
      bja.n,
      bja.u,
      bja.y,
      bja.A,
      bja.C,
      bja.E,
      bja.F,
      bja.G,
      bja.Q,
      bja.V,
      bja.W,
      bja.Z,
      bja.al,
      bja.au,
      bja.aw,
      bja.ax,
      bja.ay,
      bja.aD,
      bja.aG,
      bja.aI,
      bja.aJ,
      bja.aL,
      bja.aS,
      bja.aU,
      bja.be,
      bja.bg,
      bja.bj,
      bja.bl,
      bja.bk,
      bja.bo,
      bja.br,
      bja.bp,
      bja.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(bja<?> $$0, cjg $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(hg.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cjo.tp,
            tl.c("advancements.adventure.root.title"),
            tl.c("advancements.adventure.root.description"),
            new aez("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cte.bn, tl.c("advancements.adventure.sleep_in_bed.title"), tl.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, crn.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cjo.nL, tl.c("advancements.adventure.trade.title"), tl.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cjo.nL,
            tl.c("advancements.adventure.trade_at_world_height.title"),
            tl.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cjo.om, tl.c("advancements.adventure.kill_a_mob.title"), tl.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cjo.or, tl.c("advancements.adventure.kill_all_mobs.title"), tl.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjo.nG, tl.c("advancements.adventure.shoot_arrow.title"), tl.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apx.j)).a(bq.a.a().a(apy.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cjo.uV, tl.c("advancements.adventure.throw_trident.title"), tl.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apx.j)).a(bq.a.a().a(bja.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cjo.uV,
            tl.c("advancements.adventure.very_very_frightening.title"),
            tl.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(bja.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cte.ee,
            tl.c("advancements.adventure.summon_iron_golem.title"),
            tl.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(bja.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cjo.nH, tl.c("advancements.adventure.sniper_duel.title"), tl.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(bja.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(apx.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cjo.uz,
            tl.c("advancements.adventure.totem_of_undying.title"),
            tl.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(cjo.uz))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cjo.uZ, tl.c("advancements.adventure.ol_betsy.title"), tl.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(cjo.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cjo.uZ,
            tl.c("advancements.adventure.whos_the_pillager_now.title"),
            tl.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(bja.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cjo.uZ,
            tl.c("advancements.adventure.two_birds_one_arrow.title"),
            tl.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(bja.au), bq.a.a().a(bja.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cjo.uZ, tl.c("advancements.adventure.arbalistic.title"), tl.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cdh.s(),
            tl.c("advancements.adventure.voluntary_exile.title"),
            tl.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(apy.c).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cdh.s(),
            tl.c("advancements.adventure.hero_of_the_village.title"),
            tl.c("advancements.adventure.hero_of_the_village.description"),
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
            cte.pg.k(),
            tl.c("advancements.adventure.honey_block_slide.title"),
            tl.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(cte.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cte.pd.k(), tl.c("advancements.adventure.bullseye.title"), tl.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cjo.oN,
            tl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            tl.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(cte.qC, cjo.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cjo.lB,
            tl.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            tl.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(bja.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cjo.qj,
            tl.c("advancements.adventure.spyglass_at_parrot.title"),
            tl.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bja.at, cjo.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cjo.qj,
            tl.c("advancements.adventure.spyglass_at_ghast.title"),
            tl.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bja.Q, cjo.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cjo.eC,
            tl.c("advancements.adventure.play_jukebox_in_meadows.title"),
            tl.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(crg.D).a(av.a.a().a(cte.dT)), cb.a.a().a(aqd.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cjo.qj,
            tl.c("advancements.adventure.spyglass_at_dragon.title"),
            tl.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bja.C, cjo.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cjo.pL,
            tl.c("advancements.adventure.fall_from_world_height.title"),
            tl.c("advancements.adventure.fall_from_world_height.description"),
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
            cte.qH,
            tl.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            tl.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cte.qD,
            tl.c("advancements.adventure.avoid_vibration.title"),
            tl.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cjo.wv, tl.c("advancements.adventure.salvage_sherd.title"), tl.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            ddo.a(new ddo.a(cjo.pX, cjo.wW, cjo.pX, cjo.wU)),
            tl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            tl.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new aez("minecraft:decorated_pot"), List.of(cb.a.a().a(aqd.aL), cb.a.a().a(aqd.aL), cb.a.a().a(aqd.aL), cb.a.a().a(aqd.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cjl(cjo.wy),
            tl.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            tl.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cjl(cjo.wK),
            tl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            tl.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cjo.ef,
            tl.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            tl.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cte.cm))
         .a("comparator", b(cte.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(ctc $$0) {
      efj.a[] $$1 = cum.aE.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cum.aE, $$0x);
         av.a $$2 = av.a.a().a(cte.gY).a($$1x);
         return efh.a(cj.a.a().a($$2), new gw($$0x.g().q()));
      }).toArray(efj.a[]::new);
      return cc.a.a(efi.a($$0), eey.a($$1));
   }

   private static am<cc.a> b(ctc $$0) {
      efj.a[] $$1 = cum.aE.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cum.aE, $$1x);
         efi.a $$3 = new efi.a(cte.gY).a($$2);
         efj.a $$4 = efh.a(cj.a.a().a(av.a.a().a($$0)), new gw($$1x.q()));
         return eex.a($$3, $$4);
      }).toArray(efj.a[]::new);
      return cc.a.a(eey.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Map<cjg, aez> $$1 = me.b();
      Stream.of(cjo.wH, cjo.wF, cjo.wG, cjo.wB, cjo.wK, cjo.wD, cjo.wE, cjo.wI).forEach($$2 -> {
         aez $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, ct.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);

      for (aez $$1 : me.b().values()) {
         $$0.a("armor_trimmed_" + $$1, ct.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      Map<String, am<ck.a>> $$1 = Map.of(
         "desert_pyramid",
         ck.a.a(eci.aD),
         "desert_well",
         ck.a.a(eci.aC),
         "ocean_ruin_cold",
         ck.a.a(eci.aH),
         "ocean_ruin_warm",
         ck.a.a(eci.aG),
         "trail_ruins_rare",
         ck.a.a(eci.aF),
         "trail_ruins_common",
         ck.a.a(eci.aE)
      );
      $$1.forEach($$0::a);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(aqd.aL)));
      $$0.a(new ai(new String[][]{$$1.keySet().toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, crn.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cjo.oZ,
            tl.c("advancements.adventure.adventuring_time.title"),
            tl.c("advancements.adventure.adventuring_time.description"),
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
      for (bja<?> $$1 : e) {
         $$0.a(jb.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aey<cqz>> $$1) {
      for (aey<cqz> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
