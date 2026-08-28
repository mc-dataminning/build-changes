import java.util.function.Consumer;

public class mw implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<cyo> $$2 = $$0.e(mg.K);
      ai $$3 = ah.a.a()
         .a(
            dlw.i,
            ww.c("advancements.story.root.title"),
            ww.c("advancements.story.root.description"),
            ale.b("gui/advancements/backgrounds/stone"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(dlw.cI))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(cyw.px, ww.c("advancements.story.mine_stone.title"), ww.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cl.a.a().a($$2, axi.bc)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cyw.pC, ww.c("advancements.story.upgrade_tools.title"), ww.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(cyw.pC))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cyw.po, ww.c("advancements.story.smelt_iron.title"), ww.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(cyw.po))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cyw.pM, ww.c("advancements.story.iron_tools.title"), ww.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(cyw.pM))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(cyw.pi, ww.c("advancements.story.mine_diamond.title"), ww.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(cyw.pi))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(cyw.rl, ww.c("advancements.story.lava_bucket.title"), ww.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(cyw.rl))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(cyw.qq, ww.c("advancements.story.obtain_armor.title"), ww.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(cyw.qp))
         .a("iron_chestplate", cj.a.a(cyw.qq))
         .a("iron_leggings", cj.a.a(cyw.qr))
         .a("iron_boots", cj.a.a(cyw.qs))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(cyw.vz, ww.c("advancements.story.enchant_item.title"), ww.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dlw.cv, ww.c("advancements.story.form_obsidian.title"), ww.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(dlw.cv))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(cyw.ww, ww.c("advancements.story.deflect_arrow.title"), ww.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(ds.a(axb.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(cyw.qu, ww.c("advancements.story.shiny_gear.title"), ww.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(cyw.qt))
         .a("diamond_chestplate", cj.a.a(cyw.qu))
         .a("diamond_leggings", cj.a.a(cyw.qv))
         .a("diamond_boots", cj.a.a(cyw.qw))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(cyw.pb, ww.c("advancements.story.enter_the_nether.title"), ww.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dip.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            cyw.qJ,
            ww.c("advancements.story.cure_zombie_villager.title"),
            ww.c("advancements.story.cure_zombie_villager.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bk.a.b())
         .a($$1, "story/cure_zombie_villager");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cyw.tt, ww.c("advancements.story.follow_ender_eye.title"), ww.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dd.a.a(ct.a.b($$0.e(mg.bc).b(eqc.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(dlw.fU, ww.c("advancements.story.enter_the_end.title"), ww.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dip.k))
         .a($$1, "story/enter_the_end");
   }
}
