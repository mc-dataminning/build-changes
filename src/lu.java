import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class lu implements lp {
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   protected static final List<bsa<?>> a = Arrays.asList(
      bsa.i,
      bsa.q,
      bsa.x,
      bsa.B,
      bsa.D,
      bsa.F,
      bsa.H,
      bsa.I,
      bsa.J,
      bsa.T,
      bsa.Y,
      bsa.Z,
      bsa.ac,
      bsa.ap,
      bsa.ay,
      bsa.aA,
      bsa.aB,
      bsa.aC,
      bsa.aH,
      bsa.aK,
      bsa.aM,
      bsa.aN,
      bsa.aP,
      bsa.aW,
      bsa.aY,
      bsa.bi,
      bsa.bk,
      bsa.bo,
      bsa.bq,
      bsa.bp,
      bsa.bt,
      bsa.bw,
      bsa.bu,
      bsa.bx
   );

   private static an<cq.a> a(ct.d $$0, Optional<br> $$1) {
      return cq.a.a(Optional.of(br.a.a().a(bi.c(ct.c.c(30.0))).a(cp.a($$0)).b()), $$1);
   }

   private static an<du.a> a(bsa<?> $$0, ctj $$1) {
      return du.a.a(br.a.a().a(cz.d.a().a(br.a.a().a($$0)).b()), ch.a.a().a($$1));
   }

   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ctr.uj,
            wx.c("advancements.adventure.root.title"),
            wx.c("advancements.adventure.root.description"),
            new akm("textures/gui/advancements/backgrounds/adventure.png"),
            al.a,
            false,
            false,
            false
         )
         .a(ai.a.b)
         .a("killed_something", cm.a.b())
         .a("killed_by_something", cm.a.d())
         .a($$1, "adventure/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dea.bn, wx.c("advancements.adventure.sleep_in_bed.title"), wx.c("advancements.adventure.sleep_in_bed.description"), null, al.a, true, true, false)
         .a("slept_in_bed", da.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$3, dck.a.b);
      af $$4 = ae.a.a()
         .a($$2)
         .a(ctr.oz, wx.c("advancements.adventure.trade.title"), wx.c("advancements.adventure.trade.description"), null, al.a, true, true, false)
         .a("traded", dr.a.b())
         .a($$1, "adventure/trade");
      ae.a.a()
         .a($$4)
         .a(
            ctr.oz,
            wx.c("advancements.adventure.trade_at_world_height.title"),
            wx.c("advancements.adventure.trade_at_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dr.a.a(br.a.a().a(cr.a.a(ct.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      af $$5 = a($$2, $$1, a);
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctr.ou, wx.c("advancements.adventure.shoot_arrow.title"), wx.c("advancements.adventure.shoot_arrow.description"), null, al.a, true, true, false)
         .a("shot_arrow", cx.a.a(bf.a.a().a(bg.a.a().a(dn.a(avy.k)).a(br.a.a().a(avz.f)))))
         .a($$1, "adventure/shoot_arrow");
      af $$7 = ae.a.a()
         .a($$5)
         .a(ctr.vP, wx.c("advancements.adventure.throw_trident.title"), wx.c("advancements.adventure.throw_trident.description"), null, al.a, true, true, false)
         .a("shot_trident", cx.a.a(bf.a.a().a(bg.a.a().a(dn.a(avy.k)).a(br.a.a().a(bsa.bf)))))
         .a($$1, "adventure/throw_trident");
      ae.a.a()
         .a($$7)
         .a(
            ctr.vP,
            wx.c("advancements.adventure.very_very_frightening.title"),
            wx.c("advancements.adventure.very_very_frightening.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("struck_villager", az.a.a(br.a.a().a(bsa.bj)))
         .a($$1, "adventure/very_very_frightening");
      ae.a.a()
         .a($$4)
         .a(
            dea.ee,
            wx.c("advancements.adventure.summon_iron_golem.title"),
            wx.c("advancements.adventure.summon_iron_golem.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dm.a.a(br.a.a().a(bsa.af)))
         .a($$1, "adventure/summon_iron_golem");
      ae.a.a()
         .a($$6)
         .a(ctr.ov, wx.c("advancements.adventure.sniper_duel.title"), wx.c("advancements.adventure.sniper_duel.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("killed_skeleton", cm.a.a(br.a.a().a(bsa.aN).a(bi.a(ct.c.b(50.0))), bg.a.a().a(dn.a(avy.k))))
         .a($$1, "adventure/sniper_duel");
      ae.a.a()
         .a($$5)
         .a(
            ctr.vt,
            wx.c("advancements.adventure.totem_of_undying.title"),
            wx.c("advancements.adventure.totem_of_undying.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("used_totem", dt.a.a(ctr.vt))
         .a($$1, "adventure/totem_of_undying");
      af $$8 = ae.a.a()
         .a($$2)
         .a(ctr.vT, wx.c("advancements.adventure.ol_betsy.title"), wx.c("advancements.adventure.ol_betsy.description"), null, al.a, true, true, false)
         .a("shot_crossbow", de.a.a(ctr.vT))
         .a($$1, "adventure/ol_betsy");
      ae.a.a()
         .a($$8)
         .a(
            ctr.vT,
            wx.c("advancements.adventure.whos_the_pillager_now.title"),
            wx.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cl.a.a(br.a.a().a(bsa.aC)))
         .a($$1, "adventure/whos_the_pillager_now");
      ae.a.a()
         .a($$8)
         .a(
            ctr.vT,
            wx.c("advancements.adventure.two_birds_one_arrow.title"),
            wx.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(65))
         .a("two_birds", cl.a.a(br.a.a().a(bsa.ay), br.a.a().a(bsa.ay)))
         .a($$1, "adventure/two_birds_one_arrow");
      ae.a.a()
         .a($$8)
         .a(ctr.vT, wx.c("advancements.adventure.arbalistic.title"), wx.c("advancements.adventure.arbalistic.description"), null, al.b, true, true, true)
         .a(aj.a.a(85))
         .a("arbalistic", cl.a.a(ct.d.a(5)))
         .a($$1, "adventure/arbalistic");
      iz.b<dnw> $$9 = $$0.b(lf.d);
      af $$10 = ae.a.a()
         .a($$2)
         .a(
            cnh.a($$9),
            wx.c("advancements.adventure.voluntary_exile.title"),
            wx.c("advancements.adventure.voluntary_exile.description"),
            null,
            al.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cm.a.a(br.a.a().a(avz.c).a(bo.a($$9))))
         .a($$1, "adventure/voluntary_exile");
      ae.a.a()
         .a($$10)
         .a(
            cnh.a($$9),
            wx.c("advancements.adventure.hero_of_the_village.title"),
            wx.c("advancements.adventure.hero_of_the_village.description"),
            null,
            al.b,
            true,
            true,
            true
         )
         .a(aj.a.a(100))
         .a("hero_of_the_village", da.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ae.a.a()
         .a($$2)
         .a(
            dea.pg.q(),
            wx.c("advancements.adventure.honey_block_slide.title"),
            wx.c("advancements.adventure.honey_block_slide.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dh.a.a(dea.pg))
         .a($$1, "adventure/honey_block_slide");
      ae.a.a()
         .a($$6)
         .a(dea.pd.q(), wx.c("advancements.adventure.bullseye.title"), wx.c("advancements.adventure.bullseye.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("bullseye", dq.a.a(ct.d.a(15), Optional.of(br.a(br.a.a().a(bi.a(ct.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ae.a.a()
         .a($$3)
         .a(
            ctr.pB,
            wx.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            wx.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", da.a.a(dea.qP, ctr.pB))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ae.a.a()
         .a($$2)
         .a(
            ctr.lX,
            wx.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            wx.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(ct.d.a(0), Optional.of(br.a.a().a(bsa.bj).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      af $$11 = ae.a.a()
         .a($$2)
         .a(
            ctr.qX,
            wx.c("advancements.adventure.spyglass_at_parrot.title"),
            wx.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bsa.ax, ctr.qX))
         .a($$1, "adventure/spyglass_at_parrot");
      af $$12 = ae.a.a()
         .a($$11)
         .a(
            ctr.qX,
            wx.c("advancements.adventure.spyglass_at_ghast.title"),
            wx.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bsa.T, ctr.qX))
         .a($$1, "adventure/spyglass_at_ghast");
      ae.a.a()
         .a($$3)
         .a(
            ctr.eY,
            wx.c("advancements.adventure.play_jukebox_in_meadows.title"),
            wx.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", ck.a.a(cr.a.a().a(jb.a($$0.b(lf.az).b(dcd.D))).a(av.a.a().a(dea.dT)), ch.a.a().a(awe.aR)))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ae.a.a()
         .a($$12)
         .a(
            ctr.qX,
            wx.c("advancements.adventure.spyglass_at_dragon.title"),
            wx.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bsa.F, ctr.qX))
         .a($$1, "adventure/spyglass_at_dragon");
      ae.a.a()
         .a($$2)
         .a(
            ctr.qz,
            wx.c("advancements.adventure.fall_from_world_height.title"),
            wx.c("advancements.adventure.fall_from_world_height.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bj.a.a(br.a.a().a(cr.a.a(ct.c.c(-59.0))), bi.b(ct.c.b(379.0)), cr.a.a(ct.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ae.a.a()
         .a($$5)
         .a(
            dea.qU,
            wx.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            wx.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cm.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ae.a.a()
         .a($$2)
         .a(
            dea.qQ,
            wx.c("advancements.adventure.avoid_vibration.title"),
            wx.c("advancements.adventure.avoid_vibration.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", da.a.d())
         .a($$1, "adventure/avoid_vibration");
      af $$13 = c(ae.a.a())
         .a($$2)
         .a(ctr.xr, wx.c("advancements.adventure.salvage_sherd.title"), wx.c("advancements.adventure.salvage_sherd.description"), null, al.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ae.a.a()
         .a($$13)
         .a(
            dow.a(new dpk(Optional.empty(), Optional.of(ctr.xW), Optional.empty(), Optional.of(ctr.xS))),
            wx.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            wx.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dc.a.a(new akm("minecraft:decorated_pot"), List.of(ch.a.a().a(awe.bp), ch.a.a().a(awe.bp), ch.a.a().a(awe.bp), ch.a.a().a(awe.bp)))
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      af $$14 = b(ae.a.a())
         .a($$2)
         .a(
            new cto(ctr.xu),
            wx.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            wx.c("advancements.adventure.trim_with_any_armor_pattern.description"),
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
            new cto(ctr.xG),
            wx.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            wx.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
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
            ctr.eB,
            wx.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            wx.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a(ai.a.b)
         .a("chiseled_bookshelf", a(dea.cm))
         .a("comparator", b(dea.cm))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
   }

   public static af a(af $$0, Consumer<af> $$1, List<bsa<?>> $$2) {
      af $$3 = a(ae.a.a(), $$2)
         .a($$0)
         .a(ctr.pa, wx.c("advancements.adventure.kill_a_mob.title"), wx.c("advancements.adventure.kill_a_mob.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ae.a.a(), $$2)
         .a($$3)
         .a(ctr.pf, wx.c("advancements.adventure.kill_all_mobs.title"), wx.c("advancements.adventure.kill_all_mobs.description"), null, al.b, true, true, false)
         .a(aj.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$3;
   }

   private static an<ck.a> a(ddy $$0) {
      esl.a[] $$1 = dfi.aE.a().stream().map($$0x -> {
         dl.a $$1x = dl.a.a().a(dfi.aE, $$0x);
         av.a $$2 = av.a.a().a(dea.gY).a($$1x);
         return esj.a(cr.a.a().a($$2), new io($$0x.g().q()));
      }).toArray(esl.a[]::new);
      return ck.a.a(esk.a($$0), esa.a($$1));
   }

   private static an<ck.a> b(ddy $$0) {
      esl.a[] $$1 = dfi.aE.a().stream().map($$1x -> {
         dl.a $$2 = dl.a.a().a(dfi.aE, $$1x);
         esk.a $$3 = new esk.a(dea.gY).a($$2);
         esl.a $$4 = esj.a(cr.a.a().a(av.a.a().a($$0)), new io($$1x.q()));
         return erz.a($$3, $$4);
      }).toArray(esl.a[]::new);
      return ck.a.a(esa.a($$1));
   }

   private static ae.a a(ae.a $$0) {
      $$0.a(ai.a.a);
      Set<ctj> $$1 = Set.of(ctr.xD, ctr.xB, ctr.xC, ctr.xx, ctr.xG, ctr.xz, ctr.xA, ctr.xE);
      or.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.b(), dc.a.a($$1x.b())));
      return $$0;
   }

   private static ae.a b(ae.a $$0) {
      $$0.a(ai.a.b);
      or.b().map(or.a::b).forEach($$1 -> $$0.a("armor_trimmed_" + $$1, dc.a.a($$1)));
      return $$0;
   }

   private static ae.a c(ae.a $$0) {
      List<Pair<String, an<cs.a>>> $$1 = List.of(
         Pair.of("desert_pyramid", cs.a.a(epd.bc)),
         Pair.of("desert_well", cs.a.a(epd.bb)),
         Pair.of("ocean_ruin_cold", cs.a.a(epd.bg)),
         Pair.of("ocean_ruin_warm", cs.a.a(epd.bf)),
         Pair.of("trail_ruins_rare", cs.a.a(epd.be)),
         Pair.of("trail_ruins_common", cs.a.a(epd.bd))
      );
      $$1.forEach($$1x -> $$0.a((String)$$1x.getFirst(), (an<?>)$$1x.getSecond()));
      String $$2 = "has_sherd";
      $$0.a("has_sherd", cb.a.a(ch.a.a().a(awe.bp)));
      $$0.a(new ai(List.of($$1.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$0;
   }

   protected static void a(iz.a $$0, Consumer<af> $$1, af $$2, dck.a $$3) {
      a(ae.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            ctr.pN,
            wx.c("advancements.adventure.adventuring_time.title"),
            wx.c("advancements.adventure.adventuring_time.description"),
            null,
            al.b,
            true,
            true,
            false
         )
         .a(aj.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ae.a a(ae.a $$0, List<bsa<?>> $$1) {
      $$1.forEach($$1x -> $$0.a(le.g.b($$1x).toString(), cm.a.a(br.a.a().a($$1x))));
      return $$0;
   }

   protected static ae.a a(ae.a $$0, iz.a $$1, List<akl<dbw>> $$2) {
      iy<dbw> $$3 = $$1.b(lf.az);

      for (akl<dbw> $$4 : $$2) {
         $$0.a($$4.a().toString(), da.a.a(cr.a.a($$3.b($$4))));
      }

      return $$0;
   }
}
