import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kx implements ks {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bol<?>> a = Arrays.asList(
      bol.j,
      bol.p,
      bol.w,
      bol.A,
      bol.C,
      bol.E,
      bol.G,
      bol.H,
      bol.I,
      bol.S,
      bol.X,
      bol.Y,
      bol.ab,
      bol.an,
      bol.aw,
      bol.ay,
      bol.az,
      bol.aA,
      bol.aF,
      bol.aI,
      bol.aK,
      bol.aL,
      bol.aN,
      bol.aU,
      bol.aW,
      bol.bg,
      bol.bi,
      bol.bm,
      bol.bo,
      bol.bn,
      bol.br,
      bol.bu,
      bol.bs,
      bol.bv
   );

   private static an<cj.a> a(cm.d $$0, Optional<br> $$1) {
      return cj.a.a(Optional.of(br.a.a().a(bi.c(cm.c.c(30.0))).a(ci.a($$0)).b()), $$1);
   }

   private static an<dj.a> a(bol<?> $$0, cpl $$1) {
      return dj.a.a(br.a.a().a(cs.d.a().a(br.a.a().a($$0)).b()), cc.a.a().a($$1));
   }

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cpt.uf,
            vs.c("advancements.adventure.root.title"),
            vs.c("advancements.adventure.root.description"),
            new ajc("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cf.a.b())
         .a("killed_by_something", cf.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(czh.bn, vs.c("advancements.adventure.sleep_in_bed.title"), vs.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", ct.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cxr.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cpt.oy, vs.c("advancements.adventure.trade.title"), vs.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dg.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cpt.oy,
            vs.c("advancements.adventure.trade_at_world_height.title"),
            vs.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dg.a.a(br.a.a().a(ck.a.a(cm.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpt.ot, vs.c("advancements.adventure.shoot_arrow.title"), vs.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aug.k)).a(br.a.a().a(auh.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cpt.vL, vs.c("advancements.adventure.throw_trident.title"), vs.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aug.k)).a(br.a.a().a(bol.bd)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cpt.vL,
            vs.c("advancements.adventure.very_very_frightening.title"),
            vs.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bol.bh)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            czh.ee,
            vs.c("advancements.adventure.summon_iron_golem.title"),
            vs.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dc.a.a(br.a.a().a(bol.ae)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cpt.ou, vs.c("advancements.adventure.sniper_duel.title"), vs.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cf.a.a(br.a.a().a(bol.aL).a(bi.a(cm.c.b(50.0))), bg.a.a().a(dd.a(aug.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cpt.vp,
            vs.c("advancements.adventure.totem_of_undying.title"),
            vs.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", di.a.a(cpt.vp))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cpt.vP, vs.c("advancements.adventure.ol_betsy.title"), vs.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cw.a.a(cpt.vP))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cpt.vP,
            vs.c("advancements.adventure.whos_the_pillager_now.title"),
            vs.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ce.a.a(br.a.a().a(bol.aA)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cpt.vP,
            vs.c("advancements.adventure.two_birds_one_arrow.title"),
            vs.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ce.a.a(br.a.a().a(bol.aw), br.a.a().a(bol.aw)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cpt.vP, vs.c("advancements.adventure.arbalistic.title"), vs.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ce.a.a(cm.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cjj.s(),
            vs.c("advancements.adventure.voluntary_exile.title"),
            vs.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cf.a.a(br.a.a().a(auh.c).a(bo.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cjj.s(),
            vs.c("advancements.adventure.hero_of_the_village.title"),
            vs.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", ct.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            czh.pg.l(),
            vs.c("advancements.adventure.honey_block_slide.title"),
            vs.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cy.a.a(czh.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(czh.pd.l(), vs.c("advancements.adventure.bullseye.title"), vs.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", df.a.a(cm.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cm.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cpt.pA,
            vs.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vs.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ct.a.a(czh.qP, cpt.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cpt.lW,
            vs.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vs.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cm.d.a(0), Optional.of(br.a.a().a(bol.bh).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cpt.qW,
            vs.c("advancements.adventure.spyglass_at_parrot.title"),
            vs.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bol.av, cpt.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cpt.qW,
            vs.c("advancements.adventure.spyglass_at_ghast.title"),
            vs.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bol.S, cpt.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cpt.eX,
            vs.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vs.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cd.a.a(ck.a.a().d(cxk.D).a(av.a.a().a(czh.dT)), cc.a.a().a(aum.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cpt.qW,
            vs.c("advancements.adventure.spyglass_at_dragon.title"),
            vs.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bol.E, cpt.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cpt.qy,
            vs.c("advancements.adventure.fall_from_world_height.title"),
            vs.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bj.a.a(br.a.a().a(ck.a.a(cm.c.c(-59.0))), bi.b(cm.c.b(379.0)), ck.a.a(cm.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            czh.qU,
            vs.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vs.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cf.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            czh.qQ,
            vs.c("advancements.adventure.avoid_vibration.title"),
            vs.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", ct.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$12 = c(ae.a.a())
         .a($$2)
         .a(cpt.xl, vs.c("advancements.adventure.salvage_sherd.title"), vs.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dkb.a(new dkb.a(cpt.qK, cpt.xM, cpt.qK, cpt.xK)),
            vs.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vs.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cu.a.a(new ajc("minecraft:decorated_pot"), List.of(cc.a.a().a(aum.aQ), cc.a.a().a(aum.aQ), cc.a.a().a(aum.aQ), cc.a.a().a(aum.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cpq(cpt.xo),
            vs.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vs.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cpq(cpt.xA),
            vs.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vs.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cpt.eA,
            vs.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vs.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(czh.cm))
         .a("comparator", b(czh.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bol<?>> $$2) {
      af $$3 = b(ae.a.a(), $$2)
         .a($$0)
         .a(cpt.oZ, vs.c("advancements.adventure.kill_a_mob.title"), vs.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      b(ae.a.a(), $$2)
         .a($$3)
         .a(cpt.pe, vs.c("advancements.adventure.kill_all_mobs.title"), vs.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cd.a> a(czf $$0) {
      emx.a[] $$1 = dap.aE.a().stream().map($$0x -> {
         db.a $$1x = db.a.a().a(dap.aE, $$0x);
         av.a $$2 = av.a.a().a(czh.gY).a($$1x);
         return emv.a(ck.a.a().a($$2), new ib($$0x.g().q()));
      }).toArray(emx.a[]::new);
      return cd.a.a(emw.a($$0), emm.a($$1));
   }

   private static an<cd.a> b(czf $$0) {
      emx.a[] $$1 = dap.aE.a().stream().map($$1x -> {
         db.a $$2 = db.a.a().a(dap.aE, $$1x);
         emw.a $$3 = new emw.a(czh.gY).a($$2);
         emx.a $$4 = emv.a(ck.a.a().a(av.a.a().a($$0)), new ib($$1x.q()));
         return eml.a($$3, $$4);
      }).toArray(emx.a[]::new);
      return cd.a.a(emm.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cpl> $$1 = Set.of(cpt.xx, cpt.xv, cpt.xw, cpt.xr, cpt.xA, cpt.xt, cpt.xu, cpt.xy);
      no.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cu.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      no.b().map(no.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cu.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cl.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cl.a.a(ejw.aP)),
         Pair.of("desert_well", cl.a.a(ejw.aO)),
         Pair.of("ocean_ruin_cold", cl.a.a(ejw.aT)),
         Pair.of("ocean_ruin_warm", cl.a.a(ejw.aS)),
         Pair.of("trail_ruins_rare", cl.a.a(ejw.aR)),
         Pair.of("trail_ruins_common", cl.a.a(ejw.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cc.a.a().a(aum.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cxr.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cpt.pM,
            vs.c("advancements.adventure.adventuring_time.title"),
            vs.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a b(ae.a $$0, List<bol<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kh.g.b($$1x).toString(), cf.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ajb<cxd>> $$1) {
      for (ajb<cxd> $$2 : $$1) {
         $$0.a($$2.a().toString(), ct.a.a(ck.a.a($$2)));
      }

      return $$0;
   }
}
