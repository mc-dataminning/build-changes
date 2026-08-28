import java.util.function.Consumer;

public class mu implements mo {
   @Override
   public void a(ju.a $$0, Consumer<ai> $$1) {
      jt<cxu> $$2 = $$0.e(me.K);
      ai $$3 = ah.a.a()
         .a(
            dkw.i,
            wv.c("advancements.story.root.title"),
            wv.c("advancements.story.root.description"),
            ald.b("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(dkw.cI))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(cyc.px, wv.c("advancements.story.mine_stone.title"), wv.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cv.a.a().a($$2, axi.bc)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cyc.pC, wv.c("advancements.story.upgrade_tools.title"), wv.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(cyc.pC))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cyc.po, wv.c("advancements.story.smelt_iron.title"), wv.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(cyc.po))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cyc.pM, wv.c("advancements.story.iron_tools.title"), wv.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(cyc.pM))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(cyc.pi, wv.c("advancements.story.mine_diamond.title"), wv.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(cyc.pi))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(cyc.rl, wv.c("advancements.story.lava_bucket.title"), wv.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(cyc.rl))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(cyc.qq, wv.c("advancements.story.obtain_armor.title"), wv.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(cyc.qp))
         .a("iron_chestplate", cj.a.a(cyc.qq))
         .a("iron_leggings", cj.a.a(cyc.qr))
         .a("iron_boots", cj.a.a(cyc.qs))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(cyc.vz, wv.c("advancements.story.enchant_item.title"), wv.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dkw.cv, wv.c("advancements.story.form_obsidian.title"), wv.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(dkw.cv))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(cyc.ww, wv.c("advancements.story.deflect_arrow.title"), wv.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(eh.a(axb.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(cyc.qu, wv.c("advancements.story.shiny_gear.title"), wv.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(cyc.qt))
         .a("diamond_chestplate", cj.a.a(cyc.qu))
         .a("diamond_leggings", cj.a.a(cyc.qv))
         .a("diamond_boots", cj.a.a(cyc.qw))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(cyc.pb, wv.c("advancements.story.enter_the_nether.title"), wv.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dhp.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            cyc.qJ,
            wv.c("advancements.story.cure_zombie_villager.title"),
            wv.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cyc.tt, wv.c("advancements.story.follow_ender_eye.title"), wv.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dt.a.a(di.a.b($$0.e(me.aZ).b(epa.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(dkw.fU, wv.c("advancements.story.enter_the_end.title"), wv.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dhp.k))
         .a($$1, "story/enter_the_end");
   }
}
