import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kq implements kn {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bkz<?>[] e = new bkz[]{
      bkz.i,
      bkz.n,
      bkz.u,
      bkz.y,
      bkz.A,
      bkz.C,
      bkz.E,
      bkz.F,
      bkz.G,
      bkz.Q,
      bkz.V,
      bkz.W,
      bkz.Z,
      bkz.al,
      bkz.au,
      bkz.aw,
      bkz.ax,
      bkz.ay,
      bkz.aD,
      bkz.aG,
      bkz.aI,
      bkz.aJ,
      bkz.aL,
      bkz.aS,
      bkz.aU,
      bkz.be,
      bkz.bg,
      bkz.bj,
      bkz.bl,
      bkz.bk,
      bkz.bo,
      bkz.br,
      bkz.bp,
      bkz.bs
   };

   private static am<ci.a> a(cl.d $$0, Optional<bq> $$1) {
      return ci.a.a(Optional.of(bq.a.a().a(bh.c(cl.c.c(30.0))).a(ch.a($$0)).b()), $$1);
   }

   private static am<di.a> a(bkz<?> $$0, clj $$1) {
      return di.a.a(bq.a.a().a(cr.d.a().a(bq.a.a().a($$0)).b()), cb.a.a().a($$1));
   }

   @Override
   public void a(ii.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            clr.ub,
            uv.c("advancements.adventure.root.title"),
            uv.c("advancements.adventure.root.description"),
            new agm("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cvh.bn, uv.c("advancements.adventure.sleep_in_bed.title"), uv.c("advancements.adventure.sleep_in_bed.description"), null, ar.a, true, true, false)
         .a("slept_in_bed", cs.a.c())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, ctr.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(clr.ow, uv.c("advancements.adventure.trade.title"), uv.c("advancements.adventure.trade.description"), null, ar.a, true, true, false)
         .a("traded", df.a.c())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            clr.ow,
            uv.c("advancements.adventure.trade_at_world_height.title"),
            uv.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(clr.oX, uv.c("advancements.adventure.kill_a_mob.title"), uv.c("advancements.adventure.kill_a_mob.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      d(ae.a.a())
         .a($$5)
         .a(clr.pc, uv.c("advancements.adventure.kill_all_mobs.title"), uv.c("advancements.adventure.kill_all_mobs.description"), null, ar.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      af $$6 = ae.a.a()
         .a($$5)
         .a(clr.or, uv.c("advancements.adventure.shoot_arrow.title"), uv.c("advancements.adventure.shoot_arrow.description"), null, ar.a, true, true, false)
         .a("shot_arrow", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(arm.j)).a(bq.a.a().a(arn.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(clr.vH, uv.c("advancements.adventure.throw_trident.title"), uv.c("advancements.adventure.throw_trident.description"), null, ar.a, true, true, false)
         .a("shot_trident", cp.a.a(be.a.a().a(bf.a.a().a(dc.a(arm.j)).a(bq.a.a().a(bkz.bb)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            clr.vH,
            uv.c("advancements.adventure.very_very_frightening.title"),
            uv.c("advancements.adventure.very_very_frightening.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(bq.a.a().a(bkz.bf)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cvh.ee,
            uv.c("advancements.adventure.summon_iron_golem.title"),
            uv.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("summoned_golem", db.a.a(bq.a.a().a(bkz.ac)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(clr.os, uv.c("advancements.adventure.sniper_duel.title"), uv.c("advancements.adventure.sniper_duel.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", ce.a.a(bq.a.a().a(bkz.aJ).a(bh.a(cl.c.b(50.0))), bf.a.a().a(dc.a(arm.j))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            clr.vl,
            uv.c("advancements.adventure.totem_of_undying.title"),
            uv.c("advancements.adventure.totem_of_undying.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("used_totem", dh.a.a(clr.vl))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(clr.vL, uv.c("advancements.adventure.ol_betsy.title"), uv.c("advancements.adventure.ol_betsy.description"), null, ar.a, true, true, false)
         .a("shot_crossbow", cv.a.a(clr.vL))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            clr.vL,
            uv.c("advancements.adventure.whos_the_pillager_now.title"),
            uv.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cd.a.a(bq.a.a().a(bkz.ay)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            clr.vL,
            uv.c("advancements.adventure.two_birds_one_arrow.title"),
            uv.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ar.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cd.a.a(bq.a.a().a(bkz.au), bq.a.a().a(bkz.au)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(clr.vL, uv.c("advancements.adventure.arbalistic.title"), uv.c("advancements.adventure.arbalistic.description"), null, ar.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cd.a.a(cl.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cfg.s(),
            uv.c("advancements.adventure.voluntary_exile.title"),
            uv.c("advancements.adventure.voluntary_exile.description"),
            null,
            ar.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", ce.a.a(bq.a.a().a(arn.c).a(bn.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cfg.s(),
            uv.c("advancements.adventure.hero_of_the_village.title"),
            uv.c("advancements.adventure.hero_of_the_village.description"),
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
            cvh.pg.k(),
            uv.c("advancements.adventure.honey_block_slide.title"),
            uv.c("advancements.adventure.honey_block_slide.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cx.a.a(cvh.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cvh.pd.k(), uv.c("advancements.adventure.bullseye.title"), uv.c("advancements.adventure.bullseye.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", de.a.a(cl.d.a(15), Optional.of(bq.a(bq.a.a().a(bh.a(cl.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            clr.py,
            uv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            uv.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cs.a.a(cvh.qP, clr.py))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            clr.lW,
            uv.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            uv.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cl.d.a(0), Optional.of(bq.a.a().a(bkz.bf).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            clr.qU,
            uv.c("advancements.adventure.spyglass_at_parrot.title"),
            uv.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bkz.at, clr.qU))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            clr.qU,
            uv.c("advancements.adventure.spyglass_at_ghast.title"),
            uv.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bkz.Q, clr.qU))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            clr.eX,
            uv.c("advancements.adventure.play_jukebox_in_meadows.title"),
            uv.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cc.a.a(cj.a.a().d(ctk.D).a(av.a.a().a(cvh.dT)), cb.a.a().a(ars.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            clr.qU,
            uv.c("advancements.adventure.spyglass_at_dragon.title"),
            uv.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bkz.C, clr.qU))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            clr.qw,
            uv.c("advancements.adventure.fall_from_world_height.title"),
            uv.c("advancements.adventure.fall_from_world_height.description"),
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
            cvh.qU,
            uv.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            uv.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cvh.qQ,
            uv.c("advancements.adventure.avoid_vibration.title"),
            uv.c("advancements.adventure.avoid_vibration.description"),
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
         .a(clr.xh, uv.c("advancements.adventure.salvage_sherd.title"), uv.c("advancements.adventure.salvage_sherd.description"), null, ar.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dfy.a(new dfy.a(clr.qI, clr.xI, clr.qI, clr.xG)),
            uv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            uv.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            ct.a.a(new agm("minecraft:decorated_pot"), List.of(cb.a.a().a(ars.aL), cb.a.a().a(ars.aL), cb.a.a().a(ars.aL), cb.a.a().a(ars.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new clo(clr.xk),
            uv.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            uv.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new clo(clr.xw),
            uv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            uv.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            clr.eA,
            uv.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            uv.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ar.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cvh.cm))
         .a("comparator", b(cvh.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   private static am<cc.a> a(cvf $$0) {
      eib.a[] $$1 = cwp.aE.a().stream().map($$0x -> {
         da.a $$1x = da.a.a().a(cwp.aE, $$0x);
         av.a $$2 = av.a.a().a(cvh.gY).a($$1x);
         return ehz.a(cj.a.a().a($$2), new hx($$0x.g().q()));
      }).toArray(eib.a[]::new);
      return cc.a.a(eia.a($$0), ehq.a($$1));
   }

   private static am<cc.a> b(cvf $$0) {
      eib.a[] $$1 = cwp.aE.a().stream().map($$1x -> {
         da.a $$2 = da.a.a().a(cwp.aE, $$1x);
         eia.a $$3 = new eia.a(cvh.gY).a($$2);
         eib.a $$4 = ehz.a(cj.a.a().a(av.a.a().a($$0)), new hx($$1x.q()));
         return ehp.a($$3, $$4);
      }).toArray(eib.a[]::new);
      return cc.a.a(ehq.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<clj> $$1 = Set.of(clr.xt, clr.xr, clr.xs, clr.xn, clr.xw, clr.xp, clr.xq, clr.xu);
      ni.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), ct.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      ni.b().map(ni.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, ct.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, am<ck.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", ck.a.a(efa.aD)),
         Pair.of("desert_well", ck.a.a(efa.aC)),
         Pair.of("ocean_ruin_cold", ck.a.a(efa.aH)),
         Pair.of("ocean_ruin_warm", ck.a.a(efa.aG)),
         Pair.of("trail_ruins_rare", ck.a.a(efa.aF)),
         Pair.of("trail_ruins_common", ck.a.a(efa.aE))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (am<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", bz.a.a(cb.a.a().a(ars.aL)));
      $$0.a(new ai(new String[][]{$$1.stream().map(Pair::getFirst).toArray(String[]::new), {"has_sherd"}}));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, ctr.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            clr.pK,
            uv.c("advancements.adventure.adventuring_time.title"),
            uv.c("advancements.adventure.adventuring_time.description"),
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
      for (bkz<?> $$1 : e) {
         $$0.a(kc.h.b($$1).toString(), ce.a.a(bq.a.a().a($$1)));
      }

      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<agl<ctd>> $$1) {
      for (agl<ctd> $$2 : $$1) {
         $$0.a($$2.a().toString(), cs.a.a(cj.a.a($$2)));
      }

      return $$0;
   }
}
