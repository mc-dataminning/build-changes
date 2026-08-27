import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class kv implements kq {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bnw<?>> a = Arrays.asList(
      bnw.j,
      bnw.p,
      bnw.w,
      bnw.A,
      bnw.C,
      bnw.E,
      bnw.G,
      bnw.H,
      bnw.I,
      bnw.S,
      bnw.X,
      bnw.Y,
      bnw.ab,
      bnw.an,
      bnw.aw,
      bnw.ay,
      bnw.az,
      bnw.aA,
      bnw.aF,
      bnw.aI,
      bnw.aK,
      bnw.aL,
      bnw.aN,
      bnw.aU,
      bnw.aW,
      bnw.bg,
      bnw.bi,
      bnw.bm,
      bnw.bo,
      bnw.bn,
      bnw.br,
      bnw.bu,
      bnw.bs,
      bnw.bv
   );

   private static an<cj.a> a(cm.d $$0, Optional<br> $$1) {
      return cj.a.a(Optional.of(br.a.a().a(bi.c(cm.c.c(30.0))).a(ci.a($$0)).b()), $$1);
   }

   private static an<dj.a> a(bnw<?> $$0, coy $$1) {
      return dj.a.a(br.a.a().a(cs.d.a().a(br.a.a().a($$0)).b()), cc.a.a().a($$1));
   }

   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cpg.uf,
            vq.c("advancements.adventure.root.title"),
            vq.c("advancements.adventure.root.description"),
            new aiy("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(cyu.bn, vq.c("advancements.adventure.sleep_in_bed.title"), vq.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", ct.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cxe.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cpg.oy, vq.c("advancements.adventure.trade.title"), vq.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dg.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cpg.oy,
            vq.c("advancements.adventure.trade_at_world_height.title"),
            vq.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cpg.ot, vq.c("advancements.adventure.shoot_arrow.title"), vq.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(auc.k)).a(br.a.a().a(aud.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cpg.vL, vq.c("advancements.adventure.throw_trident.title"), vq.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(auc.k)).a(br.a.a().a(bnw.bd)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cpg.vL,
            vq.c("advancements.adventure.very_very_frightening.title"),
            vq.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bnw.bh)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            cyu.ee,
            vq.c("advancements.adventure.summon_iron_golem.title"),
            vq.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dc.a.a(br.a.a().a(bnw.ae)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cpg.ou, vq.c("advancements.adventure.sniper_duel.title"), vq.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cf.a.a(br.a.a().a(bnw.aL).a(bi.a(cm.c.b(50.0))), bg.a.a().a(dd.a(auc.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cpg.vp,
            vq.c("advancements.adventure.totem_of_undying.title"),
            vq.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", di.a.a(cpg.vp))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cpg.vP, vq.c("advancements.adventure.ol_betsy.title"), vq.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cw.a.a(cpg.vP))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cpg.vP,
            vq.c("advancements.adventure.whos_the_pillager_now.title"),
            vq.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ce.a.a(br.a.a().a(bnw.aA)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cpg.vP,
            vq.c("advancements.adventure.two_birds_one_arrow.title"),
            vq.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ce.a.a(br.a.a().a(bnw.aw), br.a.a().a(bnw.aw)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cpg.vP, vq.c("advancements.adventure.arbalistic.title"), vq.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ce.a.a(cm.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            ciu.s(),
            vq.c("advancements.adventure.voluntary_exile.title"),
            vq.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cf.a.a(br.a.a().a(aud.c).a(bo.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            ciu.s(),
            vq.c("advancements.adventure.hero_of_the_village.title"),
            vq.c("advancements.adventure.hero_of_the_village.description"),
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
            cyu.pg.j(),
            vq.c("advancements.adventure.honey_block_slide.title"),
            vq.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cy.a.a(cyu.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(cyu.pd.j(), vq.c("advancements.adventure.bullseye.title"), vq.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", df.a.a(cm.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cm.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cpg.pA,
            vq.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vq.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ct.a.a(cyu.qP, cpg.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cpg.lW,
            vq.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vq.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cm.d.a(0), Optional.of(br.a.a().a(bnw.bh).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cpg.qW,
            vq.c("advancements.adventure.spyglass_at_parrot.title"),
            vq.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bnw.av, cpg.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cpg.qW,
            vq.c("advancements.adventure.spyglass_at_ghast.title"),
            vq.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bnw.S, cpg.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cpg.eX,
            vq.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vq.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cd.a.a(ck.a.a().d(cwx.D).a(av.a.a().a(cyu.dT)), cc.a.a().a(aui.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cpg.qW,
            vq.c("advancements.adventure.spyglass_at_dragon.title"),
            vq.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bnw.E, cpg.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cpg.qy,
            vq.c("advancements.adventure.fall_from_world_height.title"),
            vq.c("advancements.adventure.fall_from_world_height.description"),
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
            cyu.qU,
            vq.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vq.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            cyu.qQ,
            vq.c("advancements.adventure.avoid_vibration.title"),
            vq.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cpg.xl, vq.c("advancements.adventure.salvage_sherd.title"), vq.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            djn.a(new djn.a(cpg.qK, cpg.xM, cpg.qK, cpg.xK)),
            vq.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vq.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cu.a.a(new aiy("minecraft:decorated_pot"), List.of(cc.a.a().a(aui.aQ), cc.a.a().a(aui.aQ), cc.a.a().a(aui.aQ), cc.a.a().a(aui.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cpd(cpg.xo),
            vq.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vq.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cpd(cpg.xA),
            vq.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vq.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cpg.eA,
            vq.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vq.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(cyu.cm))
         .a("comparator", b(cyu.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bnw<?>> $$2) {
      af $$3 = b(ae.a.a(), $$2)
         .a($$0)
         .a(cpg.oZ, vq.c("advancements.adventure.kill_a_mob.title"), vq.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      b(ae.a.a(), $$2)
         .a($$3)
         .a(cpg.pe, vq.c("advancements.adventure.kill_all_mobs.title"), vq.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cd.a> a(cys $$0) {
      emb.a[] $$1 = dac.aE.a().stream().map($$0x -> {
         db.a $$1x = db.a.a().a(dac.aE, $$0x);
         av.a $$2 = av.a.a().a(cyu.gY).a($$1x);
         return elz.a(ck.a.a().a($$2), new hz($$0x.g().q()));
      }).toArray(emb.a[]::new);
      return cd.a.a(ema.a($$0), elq.a($$1));
   }

   private static an<cd.a> b(cys $$0) {
      emb.a[] $$1 = dac.aE.a().stream().map($$1x -> {
         db.a $$2 = db.a.a().a(dac.aE, $$1x);
         ema.a $$3 = new ema.a(cyu.gY).a($$2);
         emb.a $$4 = elz.a(ck.a.a().a(av.a.a().a($$0)), new hz($$1x.q()));
         return elp.a($$3, $$4);
      }).toArray(emb.a[]::new);
      return cd.a.a(elq.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<coy> $$1 = Set.of(cpg.xx, cpg.xv, cpg.xw, cpg.xr, cpg.xA, cpg.xt, cpg.xu, cpg.xy);
      nm.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cu.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      nm.b().map(nm.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cu.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cl.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cl.a.a(eja.aP)),
         Pair.of("desert_well", cl.a.a(eja.aO)),
         Pair.of("ocean_ruin_cold", cl.a.a(eja.aT)),
         Pair.of("ocean_ruin_warm", cl.a.a(eja.aS)),
         Pair.of("trail_ruins_rare", cl.a.a(eja.aR)),
         Pair.of("trail_ruins_common", cl.a.a(eja.aQ))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cc.a.a().a(aui.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cxe.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cpg.pM,
            vq.c("advancements.adventure.adventuring_time.title"),
            vq.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a b(ae.a $$0, List<bnw<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kf.g.b($$1x).toString(), cf.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<aix<cwq>> $$1) {
      for (aix<cwq> $$2 : $$1) {
         $$0.a($$2.a().toString(), ct.a.a(ck.a.a($$2)));
      }

      return $$0;
   }
}
