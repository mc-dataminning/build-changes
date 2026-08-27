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
   private static final bip<?>[] e = new bip[]{
      bip.i,
      bip.n,
      bip.u,
      bip.y,
      bip.A,
      bip.C,
      bip.E,
      bip.F,
      bip.G,
      bip.Q,
      bip.V,
      bip.W,
      bip.Z,
      bip.al,
      bip.au,
      bip.aw,
      bip.ax,
      bip.ay,
      bip.aD,
      bip.aG,
      bip.aI,
      bip.aJ,
      bip.aL,
      bip.aS,
      bip.aU,
      bip.be,
      bip.bg,
      bip.bj,
      bip.bl,
      bip.bk,
      bip.bo,
      bip.br,
      bip.bp,
      bip.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(bip<?> $$0, civ $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cjd.tp,
            ti.c("advancements.adventure.root.title"),
            ti.c("advancements.adventure.root.description"),
            new aeu("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(csr.bn, ti.c("advancements.adventure.sleep_in_bed.title"), ti.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, crc.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cjd.nL, ti.c("advancements.adventure.trade.title"), ti.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cjd.nL,
            ti.c("advancements.adventure.trade_at_world_height.title"),
            ti.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cjd.om, ti.c("advancements.adventure.kill_a_mob.title"), ti.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cjd.or, ti.c("advancements.adventure.kill_all_mobs.title"), ti.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjd.nG, ti.c("advancements.adventure.shoot_arrow.title"), ti.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apq.j)).a(bq.a.a().a(apr.d)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cjd.uV, ti.c("advancements.adventure.throw_trident.title"), ti.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(apq.j)).a(bq.a.a().a(bip.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cjd.uV,
            ti.c("advancements.adventure.very_very_frightening.title"),
            ti.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(bip.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            csr.ef,
            ti.c("advancements.adventure.summon_iron_golem.title"),
            ti.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(bip.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cjd.nH, ti.c("advancements.adventure.sniper_duel.title"), ti.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(bip.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(apq.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cjd.uz,
            ti.c("advancements.adventure.totem_of_undying.title"),
            ti.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(cjd.uz))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cjd.uZ, ti.c("advancements.adventure.ol_betsy.title"), ti.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(cjd.uZ))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cjd.uZ,
            ti.c("advancements.adventure.whos_the_pillager_now.title"),
            ti.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(bip.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cjd.uZ,
            ti.c("advancements.adventure.two_birds_one_arrow.title"),
            ti.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(bip.au), bq.a.a().a(bip.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cjd.uZ, ti.c("advancements.adventure.arbalistic.title"), ti.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            ccw.s(),
            ti.c("advancements.adventure.voluntary_exile.title"),
            ti.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(apr.b).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            ccw.s(),
            ti.c("advancements.adventure.hero_of_the_village.title"),
            ti.c("advancements.adventure.hero_of_the_village.description"),
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
            csr.pg.k(),
            ti.c("advancements.adventure.honey_block_slide.title"),
            ti.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(csr.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(csr.pd.k(), ti.c("advancements.adventure.bullseye.title"), ti.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cjd.oN,
            ti.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            ti.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(csr.qC, cjd.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cjd.lB,
            ti.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            ti.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(bip.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cjd.qj,
            ti.c("advancements.adventure.spyglass_at_parrot.title"),
            ti.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bip.at, cjd.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cjd.qj,
            ti.c("advancements.adventure.spyglass_at_ghast.title"),
            ti.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bip.Q, cjd.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cjd.eC,
            ti.c("advancements.adventure.play_jukebox_in_meadows.title"),
            ti.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(cqv.D).a(av.a.a().a(csr.dT)), cb.a.a().a(apw.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cjd.qj,
            ti.c("advancements.adventure.spyglass_at_dragon.title"),
            ti.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bip.C, cjd.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cjd.pL,
            ti.c("advancements.adventure.fall_from_world_height.title"),
            ti.c("advancements.adventure.fall_from_world_height.description"),
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
            csr.qH,
            ti.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            ti.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            csr.qD,
            ti.c("advancements.adventure.avoid_vibration.title"),
            ti.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cjd.wv, ti.c("advancements.adventure.salvage_sherd.title"), ti.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            ddf.a(new ddf.a(cjd.pX, cjd.wW, cjd.pX, cjd.wU)),
            ti.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            ti.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new aeu("minecraft:decorated_pot"), List.of(cb.a.a().a(apw.aL), cb.a.a().a(apw.aL), cb.a.a().a(apw.aL), cb.a.a().a(apw.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cja(cjd.wy),
            ti.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            ti.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cja(cjd.wK),
            ti.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            ti.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cjd.ef,
            ti.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            ti.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(csr.cm))
         .a("comparator", b(csr.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(csq $$0) {
      efk.a[] $$1 = cty.aC.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cty.aC, $$0x);
         av.a $$2 = av.a.a().a(csr.gY).a($$1x);
         return efi.a(cj.a.a().a($$2), new gw($$0x.g().q()));
      }).toArray(efk.a[]::new);
      return cc.a.a(efj.a($$0), eez.a($$1));
   }

   private static am<cc.a> b(csq $$0) {
      efk.a[] $$1 = cty.aC.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cty.aC, $$1x);
         efj.a $$3 = new efj.a(csr.gY).a($$2);
         efk.a $$4 = efi.a(cj.a.a().a(av.a.a().a($$0)), new gw($$1x.q()));
         return eey.a($$3, $$4);
      }).toArray(efk.a[]::new);
      return cc.a.a(eez.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Map<civ, aeu> $$1 = me.b();
      Stream.of(cjd.wH, cjd.wF, cjd.wG, cjd.wB, cjd.wK, cjd.wD, cjd.wE, cjd.wI).forEach($$2 -> {
         aeu $$3 = $$1.get($$2);
         $$0.a("armor_trimmed_" + $$3, ct.a.a($$3));
      });
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);

      for (aeu $$1 : me.b().values()) {
         $$0.a("armor_trimmed_" + $$1, ct.a.a($$1));
      }

      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      Map<String, am<ck.a>> $$1 = Map.of(
         "desert_pyramid",
         ck.a.a(ecj.aD),
         "desert_well",
         ck.a.a(ecj.aC),
         "ocean_ruin_cold",
         ck.a.a(ecj.aH),
         "ocean_ruin_warm",
         ck.a.a(ecj.aG),
         "trail_ruins_rare",
         ck.a.a(ecj.aF),
         "trail_ruins_common",
         ck.a.a(ecj.aE)
      );
      $$1.forEach($$0::a);
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(apw.aL)));
      $$0.a(new ai(new String[][]{$$1.keySet().toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, crc.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cjd.oZ,
            ti.c("advancements.adventure.adventuring_time.title"),
            ti.c("advancements.adventure.adventuring_time.description"),
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
      for (bip<?> $$1 : e) {
         $$0.a(jd.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aet<cqo>> $$1) {
      for (aet<cqo> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
