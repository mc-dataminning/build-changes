import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ly implements ls {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bsb<?>> a = Arrays.asList(
      bsb.k,
      bsb.s,
      bsb.z,
      bsb.D,
      bsb.F,
      bsb.H,
      bsb.J,
      bsb.K,
      bsb.L,
      bsb.V,
      bsb.aa,
      bsb.ab,
      bsb.ae,
      bsb.aq,
      bsb.az,
      bsb.aB,
      bsb.aC,
      bsb.aD,
      bsb.aE,
      bsb.aJ,
      bsb.aM,
      bsb.aO,
      bsb.aP,
      bsb.aR,
      bsb.aZ,
      bsb.bb,
      bsb.bh,
      bsb.bm,
      bsb.bo,
      bsb.bs,
      bsb.bu,
      bsb.bt,
      bsb.bx,
      bsb.bB,
      bsb.by,
      bsb.bC,
      bsb.bz
   );

   private static ao<cr.a> a(cu.d $$0, Optional<bs> $$1) {
      return cr.a.a(Optional.of(bs.a.a().a(bj.c(cu.c.c(30.0))).a(cq.a($$0)).b()), $$1);
   }

   private static ao<dx.a> a(bsb<?> $$0, cuc $$1) {
      return dx.a.a(bs.a.a().a(da.d.a().a(bs.a.a().a($$0)).b()), ci.a.a().a($$1));
   }

   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            cuk.vU,
            xe.c("advancements.adventure.root.title"),
            xe.c("advancements.adventure.root.description"),
            new akt("textures/gui/advancements/backgrounds/adventure.png"),
            am.a,
            false,
            false,
            false
         )
         .a(aj.a.b)
         .a("killed_something", cn.a.b())
         .a("killed_by_something", cn.a.d())
         .a($$1, "adventure/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(dfe.bX, xe.c("advancements.adventure.sleep_in_bed.title"), xe.c("advancements.adventure.sleep_in_bed.description"), null, am.a, true, true, false)
         .a("slept_in_bed", db.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, ddn.a.c);
      ag $$4 = af.a.a()
         .a($$2)
         .a(cuk.pP, xe.c("advancements.adventure.trade.title"), xe.c("advancements.adventure.trade.description"), null, am.a, true, true, false)
         .a("traded", du.a.b())
         .a($$1, "adventure/trade");
      af.a.a()
         .a($$4)
         .a(
            cuk.pP,
            xe.c("advancements.adventure.trade_at_world_height.title"),
            xe.c("advancements.adventure.trade_at_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", du.a.a(bs.a.a().a(cs.a.a(cu.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      ag $$5 = a($$2, $$1, a);
      ag $$6 = af.a.a()
         .a($$5)
         .a(cuk.pK, xe.c("advancements.adventure.shoot_arrow.title"), xe.c("advancements.adventure.shoot_arrow.description"), null, am.a, true, true, false)
         .a("shot_arrow", cy.a.a(bg.a.a().a(bh.a.a().a(dq.a(awg.k)).a(bs.a.a().a(awh.f)))))
         .a($$1, "adventure/shoot_arrow");
      ag $$7 = af.a.a()
         .a($$5)
         .a(cuk.xA, xe.c("advancements.adventure.throw_trident.title"), xe.c("advancements.adventure.throw_trident.description"), null, am.a, true, true, false)
         .a("shot_trident", cy.a.a(bg.a.a().a(bh.a.a().a(dq.a(awg.k)).a(bs.a.a().a(bsb.bj)))))
         .a($$1, "adventure/throw_trident");
      af.a.a()
         .a($$7)
         .a(
            cuk.xA,
            xe.c("advancements.adventure.very_very_frightening.title"),
            xe.c("advancements.adventure.very_very_frightening.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("struck_villager", ba.a.a(bs.a.a().a(bsb.bn)))
         .a($$1, "adventure/very_very_frightening");
      af.a.a()
         .a($$4)
         .a(
            dfe.eU,
            xe.c("advancements.adventure.summon_iron_golem.title"),
            xe.c("advancements.adventure.summon_iron_golem.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dp.a.a(bs.a.a().a(bsb.ah)))
         .a($$1, "adventure/summon_iron_golem");
      af.a.a()
         .a($$6)
         .a(cuk.pL, xe.c("advancements.adventure.sniper_duel.title"), xe.c("advancements.adventure.sniper_duel.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("killed_skeleton", cn.a.a(bs.a.a().a(bsb.aP).a(bj.a(cu.c.b(50.0))), bh.a.a().a(dq.a(awg.k))))
         .a($$1, "adventure/sniper_duel");
      af.a.a()
         .a($$5)
         .a(
            cuk.xe,
            xe.c("advancements.adventure.totem_of_undying.title"),
            xe.c("advancements.adventure.totem_of_undying.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("used_totem", dw.a.a(cuk.xe))
         .a($$1, "adventure/totem_of_undying");
      ag $$8 = af.a.a()
         .a($$2)
         .a(cuk.xE, xe.c("advancements.adventure.ol_betsy.title"), xe.c("advancements.adventure.ol_betsy.description"), null, am.a, true, true, false)
         .a("shot_crossbow", dg.a.a(cuk.xE))
         .a($$1, "adventure/ol_betsy");
      af.a.a()
         .a($$8)
         .a(
            cuk.xE,
            xe.c("advancements.adventure.whos_the_pillager_now.title"),
            xe.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cm.a.a(bs.a.a().a(bsb.aD)))
         .a($$1, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$8)
         .a(
            cuk.xE,
            xe.c("advancements.adventure.two_birds_one_arrow.title"),
            xe.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(65))
         .a("two_birds", cm.a.a(bs.a.a().a(bsb.az), bs.a.a().a(bsb.az)))
         .a($$1, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$8)
         .a(cuk.xE, xe.c("advancements.adventure.arbalistic.title"), xe.c("advancements.adventure.arbalistic.description"), null, am.b, true, true, true)
         .a(ak.a.a(85))
         .a("arbalistic", cm.a.a(cu.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jc.b<dpr> $$9 = $$0.b(li.d);
      ag $$10 = af.a.a()
         .a($$2)
         .a(
            cnm.a($$9),
            xe.c("advancements.adventure.voluntary_exile.title"),
            xe.c("advancements.adventure.voluntary_exile.description"),
            null,
            am.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cn.a.a(bs.a.a().a(awh.c).a(bp.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      af.a.a()
         .a($$10)
         .a(
            cnm.a($$9),
            xe.c("advancements.adventure.hero_of_the_village.title"),
            xe.c("advancements.adventure.hero_of_the_village.description"),
            null,
            am.b,
            true,
            true,
            true
         )
         .a(ak.a.a(100))
         .a("hero_of_the_village", db.a.e())
         .a($$1, "adventure/hero_of_the_village");
      af.a.a()
         .a($$2)
         .a(
            dfe.qr.q(),
            xe.c("advancements.adventure.honey_block_slide.title"),
            xe.c("advancements.adventure.honey_block_slide.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dj.a.a(dfe.qr))
         .a($$1, "adventure/honey_block_slide");
      af.a.a()
         .a($$6)
         .a(dfe.qo.q(), xe.c("advancements.adventure.bullseye.title"), xe.c("advancements.adventure.bullseye.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("bullseye", ds.a.a(cu.d.a(15), Optional.of(bs.a(bs.a.a().a(bj.a(cu.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      af.a.a()
         .a($$3)
         .a(
            cuk.qU,
            xe.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xe.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", db.a.a(dfe.sa, cuk.qU))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$2)
         .a(
            cuk.nn,
            xe.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xe.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cu.d.a(0), Optional.of(bs.a.a().a(bsb.bn).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      ag $$11 = af.a.a()
         .a($$2)
         .a(
            cuk.su,
            xe.c("advancements.adventure.spyglass_at_parrot.title"),
            xe.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsb.ay, cuk.su))
         .a($$1, "adventure/spyglass_at_parrot");
      ag $$12 = af.a.a()
         .a($$11)
         .a(
            cuk.su,
            xe.c("advancements.adventure.spyglass_at_ghast.title"),
            xe.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsb.V, cuk.su))
         .a($$1, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$3)
         .a(
            cuk.gj,
            xe.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xe.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cl.a.a(cs.a.a().a(je.a($$0.b(li.az).b(ddg.I))).a(aw.a.a().a(dfe.eH)), ci.a.a().a(awm.aS)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$12)
         .a(
            cuk.su,
            xe.c("advancements.adventure.spyglass_at_dragon.title"),
            xe.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsb.H, cuk.su))
         .a($$1, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$2)
         .a(
            cuk.rW,
            xe.c("advancements.adventure.fall_from_world_height.title"),
            xe.c("advancements.adventure.fall_from_world_height.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bk.a.a(bs.a.a().a(cs.a.a(cu.c.c(-59.0))), bj.b(cu.c.b(379.0)), cs.a.a(cu.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      af.a.a()
         .a($$5)
         .a(
            dfe.sf,
            xe.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xe.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cn.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      af.a.a()
         .a($$2)
         .a(
            dfe.sb,
            xe.c("advancements.adventure.avoid_vibration.title"),
            xe.c("advancements.adventure.avoid_vibration.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", db.a.f())
         .a($$1, "adventure/avoid_vibration");
      ag $$13 = c(af.a.a())
         .a($$2)
         .a(cuk.ze, xe.c("advancements.adventure.salvage_sherd.title"), xe.c("advancements.adventure.salvage_sherd.description"), null, am.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      af.a.a()
         .a($$13)
         .a(
            dqs.a(new drj(Optional.empty(), Optional.of(cuk.zJ), Optional.empty(), Optional.of(cuk.zF))),
            xe.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xe.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            de.a.a(new akt("minecraft:decorated_pot"), List.of(ci.a.a().a(awm.bq), ci.a.a().a(awm.bq), ci.a.a().a(awm.bq), ci.a.a().a(awm.bq)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      ag $$14 = b(af.a.a())
         .a($$2)
         .a(
            new cuh(cuk.zh),
            xe.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xe.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(af.a.a())
         .a($$14)
         .a(
            new cuh(cuk.zt),
            xe.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xe.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      af.a.a()
         .a($$2)
         .a(
            cuk.fJ,
            xe.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xe.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a(aj.a.b)
         .a("chiseled_bookshelf", a(dfe.cX))
         .a("comparator", b(dfe.cX))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static ag a(ag $$0, Consumer<ag> $$1, List<bsb<?>> $$2) {
      ag $$3 = a(af.a.a(), $$2)
         .a($$0)
         .a(cuk.qt, xe.c("advancements.adventure.kill_a_mob.title"), xe.c("advancements.adventure.kill_a_mob.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(af.a.a(), $$2)
         .a($$3)
         .a(cuk.qy, xe.c("advancements.adventure.kill_all_mobs.title"), xe.c("advancements.adventure.kill_all_mobs.description"), null, am.b, true, true, false)
         .a(ak.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static ao<cl.a> a(dfc $$0) {
      euu.a[] $$1 = dgm.aE.a().stream().map($$0x -> {
         dn.a $$1x = dn.a.a().a(dgm.aE, $$0x);
         aw.a $$2 = aw.a.a().a(dfe.hS).a($$1x);
         return eus.a(cs.a.a().a($$2), new ir($$0x.g().q()));
      }).toArray(euu.a[]::new);
      return cl.a.a(eut.a($$0), euj.a($$1));
   }

   private static ao<cl.a> b(dfc $$0) {
      euu.a[] $$1 = dgm.aE.a().stream().map($$1x -> {
         dn.a $$2 = dn.a.a().a(dgm.aE, $$1x);
         eut.a $$3 = new eut.a(dfe.hS).a($$2);
         euu.a $$4 = eus.a(cs.a.a().a(aw.a.a().a($$0)), new ir($$1x.q()));
         return eui.a($$3, $$4);
      }).toArray(euu.a[]::new);
      return cl.a.a(euj.a($$1));
   }

   private static af.a a(af.a $$0) {
      $$0.a(aj.a.a);
      Set<cuc> $$1 = Set.of(cuk.zq, cuk.zo, cuk.zp, cuk.zk, cuk.zt, cuk.zm, cuk.zn, cuk.zr);
      ot.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), de.a.a($$1x.b())));
      return $$0;
   }

   private static af.a b(af.a $$0) {
      $$0.a(aj.a.b);
      ot.b().map(ot.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, de.a.a($$1)));
      return $$0;
   }

   private static af.a c(af.a $$0) {
      List<Pair<String, ao<ct.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", ct.a.a(ern.bn)),
         Pair.of("desert_well", ct.a.a(ern.bm)),
         Pair.of("ocean_ruin_cold", ct.a.a(ern.br)),
         Pair.of("ocean_ruin_warm", ct.a.a(ern.bq)),
         Pair.of("trail_ruins_rare", ct.a.a(ern.bp)),
         Pair.of("trail_ruins_common", ct.a.a(ern.bo))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (ao<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", cc.a.a(ci.a.a().a(awm.bq)));
      $$0.a(new aj(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(jc.a $$0, Consumer<ag> $$1, ag $$2, ddn.a $$3) {
      a(af.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            cuk.rg,
            xe.c("advancements.adventure.adventuring_time.title"),
            xe.c("advancements.adventure.adventuring_time.description"),
            null,
            am.b,
            true,
            true,
            false
         )
         .a(ak.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static af.a a(af.a $$0, List<bsb<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(lh.g.b($$1x).toString(), cn.a.a(bs.a.a().a($$1x))));
      return $$0;
   }

   protected static <T extends af.a> T a(T $$0, jc.a $$1, List<aks<dcz>> $$2) {
      jb<dcz> $$3 = $$1.b(li.az);

      for (aks<dcz> $$4 : $$2) {
         $$0.a($$4.a().toString(), db.a.a(cs.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
