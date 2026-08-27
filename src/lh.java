import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class lh implements lc {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bqb<?>> a = Arrays.asList(
      bqb.i,
      bqb.q,
      bqb.x,
      bqb.B,
      bqb.D,
      bqb.F,
      bqb.H,
      bqb.I,
      bqb.J,
      bqb.T,
      bqb.Y,
      bqb.Z,
      bqb.ac,
      bqb.ao,
      bqb.ax,
      bqb.az,
      bqb.aA,
      bqb.aB,
      bqb.aG,
      bqb.aJ,
      bqb.aL,
      bqb.aM,
      bqb.aO,
      bqb.aV,
      bqb.aX,
      bqb.bh,
      bqb.bj,
      bqb.bn,
      bqb.bp,
      bqb.bo,
      bqb.bs,
      bqb.bv,
      bqb.bt,
      bqb.bw
   );

   private static an<cj.a> a(cm.d $$0, Optional<br> $$1) {
      return cj.a.a(Optional.of(br.a.a().a(bi.c(cm.c.c(30.0))).a(ci.a($$0)).b()), $$1);
   }

   private static an<dj.a> a(bqb<?> $$0, cre $$1) {
      return dj.a.a(br.a.a().a(cs.d.a().a(br.a.a().a($$0)).b()), cc.a.a().a($$1));
   }

   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            crm.uh,
            wg.c("advancements.adventure.root.title"),
            wg.c("advancements.adventure.root.description"),
            new ajt("textures/gui/advancements/backgrounds/adventure.png"),
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
         .a(dca.bn, wg.c("advancements.adventure.sleep_in_bed.title"), wg.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", ct.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dak.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(crm.oy, wg.c("advancements.adventure.trade.title"), wg.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dg.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            crm.oy,
            wg.c("advancements.adventure.trade_at_world_height.title"),
            wg.c("advancements.adventure.trade_at_world_height.description"),
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
         .a(crm.ot, wg.c("advancements.adventure.shoot_arrow.title"), wg.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(ave.k)).a(br.a.a().a(avf.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(crm.vN, wg.c("advancements.adventure.throw_trident.title"), wg.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cq.a.a(bf.a.a().a(bg.a.a().a(dd.a(ave.k)).a(br.a.a().a(bqb.be)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            crm.vN,
            wg.c("advancements.adventure.very_very_frightening.title"),
            wg.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bqb.bi)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dca.ee,
            wg.c("advancements.adventure.summon_iron_golem.title"),
            wg.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dc.a.a(br.a.a().a(bqb.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(crm.ou, wg.c("advancements.adventure.sniper_duel.title"), wg.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cf.a.a(br.a.a().a(bqb.aM).a(bi.a(cm.c.b(50.0))), bg.a.a().a(dd.a(ave.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            crm.vr,
            wg.c("advancements.adventure.totem_of_undying.title"),
            wg.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", di.a.a(crm.vr))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(crm.vR, wg.c("advancements.adventure.ol_betsy.title"), wg.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", cw.a.a(crm.vR))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            crm.vR,
            wg.c("advancements.adventure.whos_the_pillager_now.title"),
            wg.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", ce.a.a(br.a.a().a(bqb.aB)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            crm.vR,
            wg.c("advancements.adventure.two_birds_one_arrow.title"),
            wg.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", ce.a.a(br.a.a().a(bqb.ax), br.a.a().a(bqb.ax)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(crm.vR, wg.c("advancements.adventure.arbalistic.title"), wg.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", ce.a.a(cm.d.a(5)))
         .a($$1, "adventure/arbalistic");
      af $$9 = ae.a.a()
         .a($$2)
         .a(
            cle.s(),
            wg.c("advancements.adventure.voluntary_exile.title"),
            wg.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cf.a.a(br.a.a().a(avf.c).a(bo.b)))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$9)
         .a(
            cle.s(),
            wg.c("advancements.adventure.hero_of_the_village.title"),
            wg.c("advancements.adventure.hero_of_the_village.description"),
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
            dca.pg.p(),
            wg.c("advancements.adventure.honey_block_slide.title"),
            wg.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cy.a.a(dca.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dca.pd.p(), wg.c("advancements.adventure.bullseye.title"), wg.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", df.a.a(cm.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(cm.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            crm.pA,
            wg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wg.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", ct.a.a(dca.qP, crm.pA))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            crm.lW,
            wg.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wg.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cm.d.a(0), Optional.of(br.a.a().a(bqb.bi).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            crm.qW,
            wg.c("advancements.adventure.spyglass_at_parrot.title"),
            wg.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bqb.aw, crm.qW))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$11 = ae.a.a()
         .a($$10)
         .a(
            crm.qW,
            wg.c("advancements.adventure.spyglass_at_ghast.title"),
            wg.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bqb.T, crm.qW))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            crm.eX,
            wg.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wg.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", cd.a.a(ck.a.a().a(ip.a($$0.b(ks.av).b(dad.D))).a(av.a.a().a(dca.dT)), cc.a.a().a(avk.aq)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$11)
         .a(
            crm.qW,
            wg.c("advancements.adventure.spyglass_at_dragon.title"),
            wg.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bqb.F, crm.qW))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            crm.qy,
            wg.c("advancements.adventure.fall_from_world_height.title"),
            wg.c("advancements.adventure.fall_from_world_height.description"),
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
            dca.qU,
            wg.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wg.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
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
            dca.qQ,
            wg.c("advancements.adventure.avoid_vibration.title"),
            wg.c("advancements.adventure.avoid_vibration.description"),
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
         .a(crm.xn, wg.c("advancements.adventure.salvage_sherd.title"), wg.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$12)
         .a(
            dmv.a(new dnj(Optional.empty(), Optional.of(crm.xO), Optional.empty(), Optional.of(crm.xM))),
            wg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wg.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            cu.a.a(new ajt("minecraft:decorated_pot"), List.of(cc.a.a().a(avk.aQ), cc.a.a().a(avk.aQ), cc.a.a().a(avk.aQ), cc.a.a().a(avk.aQ)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$13 = b(ae.a.a())
         .a($$2)
         .a(
            new crj(crm.xq),
            wg.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wg.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new crj(crm.xC),
            wg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wg.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            crm.eA,
            wg.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wg.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dca.cm))
         .a("comparator", b(dca.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bqb<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(crm.oZ, wg.c("advancements.adventure.kill_a_mob.title"), wg.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(crm.pe, wg.c("advancements.adventure.kill_all_mobs.title"), wg.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<cd.a> a(dby $$0) {
      eqc.a[] $$1 = ddi.aE.a().stream().map($$0x -> {
         db.a $$1x = db.a.a().a(ddi.aE, $$0x);
         av.a $$2 = av.a.a().a(dca.gY).a($$1x);
         return eqa.a(ck.a.a().a($$2), new ib($$0x.g().q()));
      }).toArray(eqc.a[]::new);
      return cd.a.a(eqb.a($$0), epr.a($$1));
   }

   private static an<cd.a> b(dby $$0) {
      eqc.a[] $$1 = ddi.aE.a().stream().map($$1x -> {
         db.a $$2 = db.a.a().a(ddi.aE, $$1x);
         eqb.a $$3 = new eqb.a(dca.gY).a($$2);
         eqc.a $$4 = eqa.a(ck.a.a().a(av.a.a().a($$0)), new ib($$1x.q()));
         return epq.a($$3, $$4);
      }).toArray(eqc.a[]::new);
      return cd.a.a(epr.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<cre> $$1 = Set.of(crm.xz, crm.xx, crm.xy, crm.xt, crm.xC, crm.xv, crm.xw, crm.xA);
      oc.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), cu.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      oc.b().map(oc.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, cu.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cl.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cl.a.a(emz.aR)),
         Pair.of("desert_well", cl.a.a(emz.aQ)),
         Pair.of("ocean_ruin_cold", cl.a.a(emz.aV)),
         Pair.of("ocean_ruin_warm", cl.a.a(emz.aU)),
         Pair.of("trail_ruins_rare", cl.a.a(emz.aT)),
         Pair.of("trail_ruins_common", cl.a.a(emz.aS))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", ca.a.a(cc.a.a().a(avk.aQ)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(in.a $$0, Consumer<af> $$1, af $$2, dak.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            crm.pM,
            wg.c("advancements.adventure.adventuring_time.title"),
            wg.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bqb<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(kr.g.b($$1x).toString(), cf.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, in.a $$1, List<ajs<czw>> $$2) {
      im<czw> $$3 = $$1.b(ks.av);

      for (ajs<czw> $$4 : $$2) {
         $$0.a($$4.a().toString(), ct.a.a(ck.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
