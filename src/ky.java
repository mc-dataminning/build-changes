import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ky implements kt {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bpd<?>> a = Arrays.asList(
      bpd.j,
      bpd.r,
      bpd.y,
      bpd.C,
      bpd.E,
      bpd.G,
      bpd.I,
      bpd.J,
      bpd.K,
      bpd.U,
      bpd.Z,
      bpd.aa,
      bpd.ad,
      bpd.ap,
      bpd.ay,
      bpd.aA,
      bpd.aB,
      bpd.aC,
      bpd.aH,
      bpd.aK,
      bpd.aM,
      bpd.aN,
      bpd.aP,
      bpd.aW,
      bpd.aY,
      bpd.bi,
      bpd.bk,
      bpd.bo,
      bpd.bq,
      bpd.bp,
      bpd.bt,
      bpd.bw,
      bpd.bu,
      bpd.bx
   );

   private static an<cj.a> a(cm.d $$0, Optional<br> $$1) {
      return cj.a.a(Optional.of(br.a.a().a(bi.c(cm.c.c(30.0))).a(ci.a($$0)).b()), $$1);
   }

   private static an<dj.a> a(bpd<?> $$0, cqh $$1) {
      return dj.a.a(br.a.a().a(cs.d.a().a(br.a.a().a($$0)).b()), cc.a.a().a($$1));
   }

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cqp.uh,
            vu.c("advancements.adventure.root.title"),
            vu.c("advancements.adventure.root.description"),
            new ajh("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dae.bn, vu.c("advancements.adventure.sleep_in_bed.title"), vu.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", ct.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$1, $$3, cyo.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(cqp.oy, vu.c("advancements.adventure.trade.title"), vu.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dg.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            cqp.oy,
            vu.c("advancements.adventure.trade_at_world_height.title"),
            vu.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(cqp.ot, vu.c("advancements.adventure.shoot_arrow.title"), vu.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aup.k)).a(br.a.a().a(auq.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(cqp.vN, vu.c("advancements.adventure.throw_trident.title"), vu.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aup.k)).a(br.a.a().a(bpd.bf)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            cqp.vN,
            vu.c("advancements.adventure.very_very_frightening.title"),
            vu.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bpd.bj)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dae.ee,
            vu.c("advancements.adventure.summon_iron_golem.title"),
            vu.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dc.a.a(br.a.a().a(bpd.ag)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(cqp.ou, vu.c("advancements.adventure.sniper_duel.title"), vu.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cf.a.a(br.a.a().a(bpd.aN).a(bi.a(cm.c.b(50.0))), bg.a.a().a(dd.a(aup.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            cqp.vr,
            vu.c("advancements.adventure.totem_of_undying.title"),
            vu.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", di.a.a(cqp.vr))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(cqp.vR, vu.c("advancements.adventure.ol_betsy.title"), vu.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cw.a.a(cqp.vR))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            cqp.vR,
            vu.c("advancements.adventure.whos_the_pillager_now.title"),
            vu.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ce.a.a(br.a.a().a(bpd.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            cqp.vR,
            vu.c("advancements.adventure.two_birds_one_arrow.title"),
            vu.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ce.a.a(br.a.a().a(bpd.ay), br.a.a().a(bpd.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(cqp.vR, vu.c("advancements.adventure.arbalistic.title"), vu.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ce.a.a(cm.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            ckf.s(),
            vu.c("advancements.adventure.voluntary_exile.title"),
            vu.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cf.a.a(br.a.a().a(auq.c).a(bo.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            ckf.s(),
            vu.c("advancements.adventure.hero_of_the_village.title"),
            vu.c("advancements.adventure.hero_of_the_village.description"),
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
            dae.pg.l(),
            vu.c("advancements.adventure.honey_block_slide.title"),
            vu.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cy.a.a(dae.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dae.pd.l(), vu.c("advancements.adventure.bullseye.title"), vu.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", df.a.a(cm.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cm.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            cqp.pA,
            vu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            vu.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ct.a.a(dae.qP, cqp.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            cqp.lW,
            vu.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            vu.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cm.d.a(0), Optional.of(br.a.a().a(bpd.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cqp.qW,
            vu.c("advancements.adventure.spyglass_at_parrot.title"),
            vu.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bpd.ax, cqp.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            cqp.qW,
            vu.c("advancements.adventure.spyglass_at_ghast.title"),
            vu.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bpd.U, cqp.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            cqp.eX,
            vu.c("advancements.adventure.play_jukebox_in_meadows.title"),
            vu.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cd.a.a(ck.a.a().d(cyh.D).a(av.a.a().a(dae.dT)), cc.a.a().a(auv.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            cqp.qW,
            vu.c("advancements.adventure.spyglass_at_dragon.title"),
            vu.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bpd.G, cqp.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            cqp.qy,
            vu.c("advancements.adventure.fall_from_world_height.title"),
            vu.c("advancements.adventure.fall_from_world_height.description"),
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
            dae.qU,
            vu.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            vu.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dae.qQ,
            vu.c("advancements.adventure.avoid_vibration.title"),
            vu.c("advancements.adventure.avoid_vibration.description"),
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
         .a(cqp.xn, vu.c("advancements.adventure.salvage_sherd.title"), vu.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dky.a(new dky.a(cqp.qK, cqp.xO, cqp.qK, cqp.xM)),
            vu.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            vu.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cu.a.a(new ajh("minecraft:decorated_pot"), List.of(cc.a.a().a(auv.aQ), cc.a.a().a(auv.aQ), cc.a.a().a(auv.aQ), cc.a.a().a(auv.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new cqm(cqp.xq),
            vu.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            vu.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cqm(cqp.xC),
            vu.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            vu.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            cqp.eA,
            vu.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            vu.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dae.cm))
         .a("comparator", b(dae.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bpd<?>> $$2) {
      af $$3 = b(ae.a.a(), $$2)
         .a($$0)
         .a(cqp.oZ, vu.c("advancements.adventure.kill_a_mob.title"), vu.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      b(ae.a.a(), $$2)
         .a($$3)
         .a(cqp.pe, vu.c("advancements.adventure.kill_all_mobs.title"), vu.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cd.a> a(dac $$0) {
      env.a[] $$1 = dbm.aE.a().stream().map($$0x -> {
         db.a $$1x = db.a.a().a(dbm.aE, $$0x);
         av.a $$2 = av.a.a().a(dae.gY).a($$1x);
         return ent.a(ck.a.a().a($$2), new ib($$0x.g().q()));
      }).toArray(env.a[]::new);
      return cd.a.a(enu.a($$0), enk.a($$1));
   }

   private static an<cd.a> b(dac $$0) {
      env.a[] $$1 = dbm.aE.a().stream().map($$1x -> {
         db.a $$2 = db.a.a().a(dbm.aE, $$1x);
         enu.a $$3 = new enu.a(dae.gY).a($$2);
         env.a $$4 = ent.a(ck.a.a().a(av.a.a().a($$0)), new ib($$1x.q()));
         return enj.a($$3, $$4);
      }).toArray(env.a[]::new);
      return cd.a.a(enk.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cqh> $$1 = Set.of(cqp.xz, cqp.xx, cqp.xy, cqp.xt, cqp.xC, cqp.xv, cqp.xw, cqp.xA);
      nq.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cu.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      nq.b().map(nq.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cu.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cl.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cl.a.a(eku.aQ)),
         Pair.of("desert_well", cl.a.a(eku.aP)),
         Pair.of("ocean_ruin_cold", cl.a.a(eku.aU)),
         Pair.of("ocean_ruin_warm", cl.a.a(eku.aT)),
         Pair.of("trail_ruins_rare", cl.a.a(eku.aS)),
         Pair.of("trail_ruins_common", cl.a.a(eku.aR))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cc.a.a().a(auv.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(Consumer<af> $$0, af $$1, cyo.a $$2) {
      a(ae.a.a(), $$2.a().toList())
         .a($$1)
         .a(
            cqp.pM,
            vu.c("advancements.adventure.adventuring_time.title"),
            vu.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$0, "adventure/adventuring_time");
   }

   private static ae.a b(ae.a $$0, List<bpd<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(ki.g.b($$1x).toString(), cf.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, List<ajg<cya>> $$1) {
      for (ajg<cya> $$2 : $$1) {
         $$0.a($$2.a().toString(), ct.a.a(ck.a.a($$2)));
      }

      return $$0;
   }
}
