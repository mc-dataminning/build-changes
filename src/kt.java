import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kt implements ko {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bmc<?>> a = Arrays.asList(
      bmc.j,
      bmc.p,
      bmc.w,
      bmc.A,
      bmc.C,
      bmc.E,
      bmc.G,
      bmc.H,
      bmc.I,
      bmc.S,
      bmc.X,
      bmc.Y,
      bmc.ab,
      bmc.an,
      bmc.aw,
      bmc.ay,
      bmc.az,
      bmc.aA,
      bmc.aF,
      bmc.aI,
      bmc.aK,
      bmc.aL,
      bmc.aN,
      bmc.aU,
      bmc.aW,
      bmc.bg,
      bmc.bi,
      bmc.bm,
      bmc.bo,
      bmc.bn,
      bmc.br,
      bmc.bu,
      bmc.bs,
      bmc.bv
   );

   private static an<ch.a> a(ck.d $$0, Optional<bp> $$1) {
      return ch.a.a(Optional.of(bp.a.a().a(bg.c(ck.c.c(30.0))).a(cg.a($$0)).b()), $$1);
   }

   private static an<dh.a> a(bmc<?> $$0, cnb $$1) {
      return dh.a.a(bp.a.a().a(cq.d.a().a(bp.a.a().a($$0)).b()), ca.a.a().a($$1));
   }

   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cnj.uf,
            vg.c("advancements.adventure.root.title"),
            vg.c("advancements.adventure.root.description"),
            new ahh("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cd.a.b())
         .a("killed_by_something", cd.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cxa.bn, vg.c("advancements.adventure.sleep_in_bed.title"), vg.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", cr.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cvk.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cnj.oy, vg.c("advancements.adventure.trade.title"), vg.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", de.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cnj.oy,
            vg.c("advancements.adventure.trade_at_world_height.title"),
            vg.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", de.a.a(bp.a.a().a(ci.a.a(ck.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(cnj.ot, vg.c("advancements.adventure.shoot_arrow.title"), vg.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", co.a.a(be.a.a().a(bf.a.a().a(db.a(ask.k)).a(bp.a.a().a(asl.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cnj.vL, vg.c("advancements.adventure.throw_trident.title"), vg.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", co.a.a(be.a.a().a(bf.a.a().a(db.a(ask.k)).a(bp.a.a().a(bmc.bd)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cnj.vL,
            vg.c("advancements.adventure.very_very_frightening.title"),
            vg.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", ay.a.a(bp.a.a().a(bmc.bh)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cxa.ee,
            vg.c("advancements.adventure.summon_iron_golem.title"),
            vg.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bp.a.a().a(bmc.ae)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cnj.ou, vg.c("advancements.adventure.sniper_duel.title"), vg.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cd.a.a(bp.a.a().a(bmc.aL).a(bg.a(ck.c.b(50.0))), bf.a.a().a(db.a(ask.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cnj.vp,
            vg.c("advancements.adventure.totem_of_undying.title"),
            vg.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dg.a.a(cnj.vp))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cnj.vP, vg.c("advancements.adventure.ol_betsy.title"), vg.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cu.a.a(cnj.vP))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cnj.vP,
            vg.c("advancements.adventure.whos_the_pillager_now.title"),
            vg.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cc.a.a(bp.a.a().a(bmc.aA)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cnj.vP,
            vg.c("advancements.adventure.two_birds_one_arrow.title"),
            vg.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cc.a.a(bp.a.a().a(bmc.aw), bp.a.a().a(bmc.aw)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cnj.vP, vg.c("advancements.adventure.arbalistic.title"), vg.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cc.a.a(ck.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cgy.s(),
            vg.c("advancements.adventure.voluntary_exile.title"),
            vg.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cd.a.a(bp.a.a().a(asl.c).a(bm.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cgy.s(),
            vg.c("advancements.adventure.hero_of_the_village.title"),
            vg.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", cr.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            cxa.pg.j(),
            vg.c("advancements.adventure.honey_block_slide.title"),
            vg.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cxa.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cxa.pd.j(), vg.c("advancements.adventure.bullseye.title"), vg.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dd.a.a(ck.d.a(15), Optional.of(bp.a(bp.a.a().a(bg.a(ck.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cnj.pA,
            vg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cr.a.a(cxa.qP, cnj.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cnj.lW,
            vg.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vg.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ck.d.a(0), Optional.of(bp.a.a().a(bmc.bh).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cnj.qW,
            vg.c("advancements.adventure.spyglass_at_parrot.title"),
            vg.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bmc.av, cnj.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cnj.qW,
            vg.c("advancements.adventure.spyglass_at_ghast.title"),
            vg.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bmc.S, cnj.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cnj.eX,
            vg.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vg.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cb.a.a(ci.a.a().d(cvd.D).a(au.a.a().a(cxa.dT)), ca.a.a().a(asq.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cnj.qW,
            vg.c("advancements.adventure.spyglass_at_dragon.title"),
            vg.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bmc.E, cnj.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cnj.qy,
            vg.c("advancements.adventure.fall_from_world_height.title"),
            vg.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bh.a.a(bp.a.a().a(ci.a.a(ck.c.c(-59.0))), bg.b(ck.c.b(379.0)), ci.a.a(ck.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            cxa.qU,
            vg.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vg.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cd.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            cxa.qQ,
            vg.c("advancements.adventure.avoid_vibration.title"),
            vg.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cr.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$12 = c(ae.a.a())
         .a($$2)
         .a(cnj.xl, vg.c("advancements.adventure.salvage_sherd.title"), vg.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dht.a(new dht.a(cnj.qK, cnj.xM, cnj.qK, cnj.xK)),
            vg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cs.a.a(new ahh("minecraft:decorated_pot"), List.of(ca.a.a().a(asq.aL), ca.a.a().a(asq.aL), ca.a.a().a(asq.aL), ca.a.a().a(asq.aL)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cng(cnj.xo),
            vg.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vg.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$13)
         .a(
            new cng(cnj.xA),
            vg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ae.a.a()
         .a($$2)
         .a(
            cnj.eA,
            vg.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vg.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cxa.cm))
         .a("comparator", b(cxa.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bmc<?>> $$2) {
      af $$3 = b(ae.a.a(), $$2)
         .a($$0)
         .a(cnj.oZ, vg.c("advancements.adventure.kill_a_mob.title"), vg.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      b(ae.a.a(), $$2)
         .a($$3)
         .a(cnj.pe, vg.c("advancements.adventure.kill_all_mobs.title"), vg.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cb.a> a(cwy $$0) {
      eke.a[] $$1 = cyi.aE.a().stream().map($$0x -> {
         cz.a $$1x = cz.a.a().a(cyi.aE, $$0x);
         au.a $$2 = au.a.a().a(cxa.gY).a($$1x);
         return ekc.a(ci.a.a().a($$2), new hx($$0x.g().q()));
      }).toArray(eke.a[]::new);
      return cb.a.a(ekd.a($$0), ejt.a($$1));
   }

   private static an<cb.a> b(cwy $$0) {
      eke.a[] $$1 = cyi.aE.a().stream().map($$1x -> {
         cz.a $$2 = cz.a.a().a(cyi.aE, $$1x);
         ekd.a $$3 = new ekd.a(cxa.gY).a($$2);
         eke.a $$4 = ekc.a(ci.a.a().a(au.a.a().a($$0)), new hx($$1x.q()));
         return ejs.a($$3, $$4);
      }).toArray(eke.a[]::new);
      return cb.a.a(ejt.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cnb> $$1 = Set.of(cnj.xx, cnj.xv, cnj.xw, cnj.xr, cnj.xA, cnj.xt, cnj.xu, cnj.xy);
      nk.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cs.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      nk.b().map(nk.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cs.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cj.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cj.a.a(ehd.aP)),
         Pair.of("desert_well", cj.a.a(ehd.aO)),
         Pair.of("ocean_ruin_cold", cj.a.a(ehd.aT)),
         Pair.of("ocean_ruin_warm", cj.a.a(ehd.aS)),
         Pair.of("trail_ruins_rare", cj.a.a(ehd.aR)),
         Pair.of("trail_ruins_common", cj.a.a(ehd.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", by.a.a(ca.a.a().a(asq.aL)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cvk.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cnj.pM,
            vg.c("advancements.adventure.adventuring_time.title"),
            vg.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a b(ae.a $$0, List<bmc<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kd.g.b($$1x).toString(), cd.a.a(bp.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ahg<cuw>> $$1) {
      for (ahg<cuw> $$2 : $$1) {
         $$0.a($$2.a().toString(), cr.a.a(ci.a.a($$2)));
      }

      return $$0;
   }
}
