import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class km implements kj {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bkm<?>[] e = new bkm[]{
      bkm.i,
      bkm.n,
      bkm.u,
      bkm.y,
      bkm.A,
      bkm.C,
      bkm.E,
      bkm.F,
      bkm.G,
      bkm.Q,
      bkm.V,
      bkm.W,
      bkm.Z,
      bkm.al,
      bkm.au,
      bkm.aw,
      bkm.ax,
      bkm.ay,
      bkm.aD,
      bkm.aG,
      bkm.aI,
      bkm.aJ,
      bkm.aL,
      bkm.aS,
      bkm.aU,
      bkm.be,
      bkm.bg,
      bkm.bj,
      bkm.bl,
      bkm.bk,
      bkm.bo,
      bkm.br,
      bkm.bp,
      bkm.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(bkm<?> $$0, ckw $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cle.tq,
            ur.c("advancements.adventure.root.title"),
            ur.c("advancements.adventure.root.description"),
            new agg("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cuv.bn, ur.c("advancements.adventure.sleep_in_bed.title"), ur.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cte.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cle.nL, ur.c("advancements.adventure.trade.title"), ur.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cle.nL,
            ur.c("advancements.adventure.trade_at_world_height.title"),
            ur.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cle.om, ur.c("advancements.adventure.kill_a_mob.title"), ur.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(cle.or, ur.c("advancements.adventure.kill_all_mobs.title"), ur.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cle.nG, ur.c("advancements.adventure.shoot_arrow.title"), ur.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(are.j)).a(bq.a.a().a(arf.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cle.uW, ur.c("advancements.adventure.throw_trident.title"), ur.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(are.j)).a(bq.a.a().a(bkm.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cle.uW,
            ur.c("advancements.adventure.very_very_frightening.title"),
            ur.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(bkm.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cuv.ee,
            ur.c("advancements.adventure.summon_iron_golem.title"),
            ur.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(bkm.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cle.nH, ur.c("advancements.adventure.sniper_duel.title"), ur.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(bkm.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(are.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cle.uA,
            ur.c("advancements.adventure.totem_of_undying.title"),
            ur.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(cle.uA))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cle.va, ur.c("advancements.adventure.ol_betsy.title"), ur.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(cle.va))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cle.va,
            ur.c("advancements.adventure.whos_the_pillager_now.title"),
            ur.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(bkm.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cle.va,
            ur.c("advancements.adventure.two_birds_one_arrow.title"),
            ur.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(bkm.au), bq.a.a().a(bkm.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cle.va, ur.c("advancements.adventure.arbalistic.title"), ur.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cet.s(),
            ur.c("advancements.adventure.voluntary_exile.title"),
            ur.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(arf.c).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cet.s(),
            ur.c("advancements.adventure.hero_of_the_village.title"),
            ur.c("advancements.adventure.hero_of_the_village.description"),
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
            cuv.pg.k(),
            ur.c("advancements.adventure.honey_block_slide.title"),
            ur.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(cuv.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cuv.pd.k(), ur.c("advancements.adventure.bullseye.title"), ur.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cle.oN,
            ur.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            ur.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(cuv.qC, cle.oN))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cle.lB,
            ur.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            ur.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(bkm.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cle.qj,
            ur.c("advancements.adventure.spyglass_at_parrot.title"),
            ur.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bkm.at, cle.qj))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cle.qj,
            ur.c("advancements.adventure.spyglass_at_ghast.title"),
            ur.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bkm.Q, cle.qj))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cle.eC,
            ur.c("advancements.adventure.play_jukebox_in_meadows.title"),
            ur.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(csx.D).a(av.a.a().a(cuv.dT)), cb.a.a().a(ark.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cle.qj,
            ur.c("advancements.adventure.spyglass_at_dragon.title"),
            ur.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bkm.C, cle.qj))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cle.pL,
            ur.c("advancements.adventure.fall_from_world_height.title"),
            ur.c("advancements.adventure.fall_from_world_height.description"),
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
            cuv.qH,
            ur.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            ur.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cuv.qD,
            ur.c("advancements.adventure.avoid_vibration.title"),
            ur.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cle.ww, ur.c("advancements.adventure.salvage_sherd.title"), ur.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dfh.a(new dfh.a(cle.pX, cle.wX, cle.pX, cle.wV)),
            ur.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            ur.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new agg("minecraft:decorated_pot"), List.of(cb.a.a().a(ark.aL), cb.a.a().a(ark.aL), cb.a.a().a(ark.aL), cb.a.a().a(ark.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new clb(cle.wz),
            ur.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            ur.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new clb(cle.wL),
            ur.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            ur.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cle.ef,
            ur.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            ur.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cuv.cm))
         .a("comparator", b(cuv.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(cut $$0) {
      ehk.a[] $$1 = cwd.aE.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cwd.aE, $$0x);
         av.a $$2 = av.a.a().a(cuv.gY).a($$1x);
         return ehi.a(cj.a.a().a($$2), new ht($$0x.g().q()));
      }).toArray(ehk.a[]::new);
      return cc.a.a(ehj.a($$0), egz.a($$1));
   }

   private static am<cc.a> b(cut $$0) {
      ehk.a[] $$1 = cwd.aE.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cwd.aE, $$1x);
         ehj.a $$3 = new ehj.a(cuv.gY).a($$2);
         ehk.a $$4 = ehi.a(cj.a.a().a(av.a.a().a($$0)), new ht($$1x.q()));
         return egy.a($$3, $$4);
      }).toArray(ehk.a[]::new);
      return cc.a.a(egz.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<ckw> $$1 = Set.of(cle.wI, cle.wG, cle.wH, cle.wC, cle.wL, cle.wE, cle.wF, cle.wJ);
      ne.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ct.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      ne.b().map(ne.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ct.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, am<ck.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", ck.a.a(eej.aD)),
         Pair.of("desert_well", ck.a.a(eej.aC)),
         Pair.of("ocean_ruin_cold", ck.a.a(eej.aH)),
         Pair.of("ocean_ruin_warm", ck.a.a(eej.aG)),
         Pair.of("trail_ruins_rare", ck.a.a(eej.aF)),
         Pair.of("trail_ruins_common", ck.a.a(eej.aE))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (am<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(ark.aL)));
      $$0.a(new ai(new String[][]{$$1.stream().map(Pair::getFirst).toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cte.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cle.oZ,
            ur.c("advancements.adventure.adventuring_time.title"),
            ur.c("advancements.adventure.adventuring_time.description"),
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
      for (bkm<?> $$1 : e) {
         $$0.a(jy.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<agf<csq>> $$1) {
      for (agf<csq> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
