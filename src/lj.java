import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class lj implements le {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bqg<?>> a = Arrays.asList(
      bqg.i,
      bqg.q,
      bqg.x,
      bqg.B,
      bqg.D,
      bqg.F,
      bqg.H,
      bqg.I,
      bqg.J,
      bqg.T,
      bqg.Y,
      bqg.Z,
      bqg.ac,
      bqg.ao,
      bqg.ax,
      bqg.az,
      bqg.aA,
      bqg.aB,
      bqg.aG,
      bqg.aJ,
      bqg.aL,
      bqg.aM,
      bqg.aO,
      bqg.aV,
      bqg.aX,
      bqg.bh,
      bqg.bj,
      bqg.bn,
      bqg.bp,
      bqg.bo,
      bqg.bs,
      bqg.bv,
      bqg.bt,
      bqg.bw
   );

   private static an<cj.a> a(cm.d $$0, Optional<br> $$1) {
      return cj.a.a(Optional.of(br.a.a().a(bi.c(cm.c.c(30.0))).a(ci.a($$0)).b()), $$1);
   }

   private static an<dk.a> a(bqg<?> $$0, crn $$1) {
      return dk.a.a(br.a.a().a(cs.d.a().a(br.a.a().a($$0)).b()), cc.a.a().a($$1));
   }

   @Override
   public void a(ip.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            crv.uh,
            wi.c("advancements.adventure.root.title"),
            wi.c("advancements.adventure.root.description"),
            new ajv("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dcj.bn, wi.c("advancements.adventure.sleep_in_bed.title"), wi.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", ct.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dat.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(crv.oy, wi.c("advancements.adventure.trade.title"), wi.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dh.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            crv.oy,
            wi.c("advancements.adventure.trade_at_world_height.title"),
            wi.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dh.a.a(br.a.a().a(ck.a.a(cm.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(crv.ot, wi.c("advancements.adventure.shoot_arrow.title"), wi.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cq.a.a(bf.a.a().a(bg.a.a().a(de.a(avg.k)).a(br.a.a().a(avh.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(crv.vN, wi.c("advancements.adventure.throw_trident.title"), wi.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cq.a.a(bf.a.a().a(bg.a.a().a(de.a(avg.k)).a(br.a.a().a(bqg.be)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            crv.vN,
            wi.c("advancements.adventure.very_very_frightening.title"),
            wi.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bqg.bi)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dcj.ee,
            wi.c("advancements.adventure.summon_iron_golem.title"),
            wi.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dd.a.a(br.a.a().a(bqg.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(crv.ou, wi.c("advancements.adventure.sniper_duel.title"), wi.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cf.a.a(br.a.a().a(bqg.aM).a(bi.a(cm.c.b(50.0))), bg.a.a().a(de.a(avg.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            crv.vr,
            wi.c("advancements.adventure.totem_of_undying.title"),
            wi.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dj.a.a(crv.vr))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(crv.vR, wi.c("advancements.adventure.ol_betsy.title"), wi.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cw.a.a(crv.vR))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            crv.vR,
            wi.c("advancements.adventure.whos_the_pillager_now.title"),
            wi.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ce.a.a(br.a.a().a(bqg.aB)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            crv.vR,
            wi.c("advancements.adventure.two_birds_one_arrow.title"),
            wi.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ce.a.a(br.a.a().a(bqg.ax), br.a.a().a(bqg.ax)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(crv.vR, wi.c("advancements.adventure.arbalistic.title"), wi.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ce.a.a(cm.d.a(5)))
         .a($$1, "adventure/arbalistic");
      ip.b<dme> $$9 = $$0.b(ku.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cll.a($$9),
            wi.c("advancements.adventure.voluntary_exile.title"),
            wi.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cf.a.a(br.a.a().a(avh.c).a(bo.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cll.a($$9),
            wi.c("advancements.adventure.hero_of_the_village.title"),
            wi.c("advancements.adventure.hero_of_the_village.description"),
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
            dcj.pg.p(),
            wi.c("advancements.adventure.honey_block_slide.title"),
            wi.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cy.a.a(dcj.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dcj.pd.p(), wi.c("advancements.adventure.bullseye.title"), wi.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dg.a.a(cm.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cm.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            crv.pA,
            wi.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wi.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ct.a.a(dcj.qP, crv.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            crv.lW,
            wi.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wi.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cm.d.a(0), Optional.of(br.a.a().a(bqg.bi).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            crv.qW,
            wi.c("advancements.adventure.spyglass_at_parrot.title"),
            wi.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bqg.aw, crv.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            crv.qW,
            wi.c("advancements.adventure.spyglass_at_ghast.title"),
            wi.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bqg.T, crv.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            crv.eX,
            wi.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wi.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cd.a.a(ck.a.a().a(ir.a($$0.b(ku.aw).b(dam.D))).a(av.a.a().a(dcj.dT)), cc.a.a().a(avm.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            crv.qW,
            wi.c("advancements.adventure.spyglass_at_dragon.title"),
            wi.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bqg.F, crv.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            crv.qy,
            wi.c("advancements.adventure.fall_from_world_height.title"),
            wi.c("advancements.adventure.fall_from_world_height.description"),
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
            dcj.qU,
            wi.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wi.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dcj.qQ,
            wi.c("advancements.adventure.avoid_vibration.title"),
            wi.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", ct.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(crv.xn, wi.c("advancements.adventure.salvage_sherd.title"), wi.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dne.a(new dns(Optional.empty(), Optional.of(crv.xO), Optional.empty(), Optional.of(crv.xM))),
            wi.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wi.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cu.a.a(new ajv("minecraft:decorated_pot"), List.of(cc.a.a().a(avm.aQ), cc.a.a().a(avm.aQ), cc.a.a().a(avm.aQ), cc.a.a().a(avm.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new crs(crv.xq),
            wi.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wi.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ae.a.a())
         .a($$14)
         .a(
            new crs(crv.xC),
            wi.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wi.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            crv.eA,
            wi.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wi.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dcj.cm))
         .a("comparator", b(dcj.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bqg<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(crv.oZ, wi.c("advancements.adventure.kill_a_mob.title"), wi.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(crv.pe, wi.c("advancements.adventure.kill_all_mobs.title"), wi.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cd.a> a(dch $$0) {
      eql.a[] $$1 = ddr.aE.a().stream().map($$0x -> {
         dc.a $$1x = dc.a.a().a(ddr.aE, $$0x);
         av.a $$2 = av.a.a().a(dcj.gY).a($$1x);
         return eqj.a(ck.a.a().a($$2), new id($$0x.g().q()));
      }).toArray(eql.a[]::new);
      return cd.a.a(eqk.a($$0), eqa.a($$1));
   }

   private static an<cd.a> b(dch $$0) {
      eql.a[] $$1 = ddr.aE.a().stream().map($$1x -> {
         dc.a $$2 = dc.a.a().a(ddr.aE, $$1x);
         eqk.a $$3 = new eqk.a(dcj.gY).a($$2);
         eql.a $$4 = eqj.a(ck.a.a().a(av.a.a().a($$0)), new id($$1x.q()));
         return epz.a($$3, $$4);
      }).toArray(eql.a[]::new);
      return cd.a.a(eqa.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<crn> $$1 = Set.of(crv.xz, crv.xx, crv.xy, crv.xt, crv.xC, crv.xv, crv.xw, crv.xA);
      oe.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cu.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      oe.b().map(oe.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cu.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cl.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cl.a.a(eni.aR)),
         Pair.of("desert_well", cl.a.a(eni.aQ)),
         Pair.of("ocean_ruin_cold", cl.a.a(eni.aV)),
         Pair.of("ocean_ruin_warm", cl.a.a(eni.aU)),
         Pair.of("trail_ruins_rare", cl.a.a(eni.aT)),
         Pair.of("trail_ruins_common", cl.a.a(eni.aS))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cc.a.a().a(avm.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(ip.a $$0, Consumer<af> $$1, af $$2, dat.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            crv.pM,
            wi.c("advancements.adventure.adventuring_time.title"),
            wi.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bqg<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kt.g.b($$1x).toString(), cf.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, ip.a $$1, List<aju<daf>> $$2) {
      io<daf> $$3 = $$1.b(ku.aw);

      for (aju<daf> $$4 : $$2) {
         $$0.a($$4.a().toString(), ct.a.a(ck.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
