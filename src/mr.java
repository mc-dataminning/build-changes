import java.util.function.Consumer;

public class mr implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<cxl> $$2 = $$0.d(mb.K);
      ah $$3 = ag.a.a()
         .a(
            dko.i,
            xv.c("advancements.story.root.title"),
            xv.c("advancements.story.root.description"),
            alz.b("textures/gui/advancements/backgrounds/stone.png"),
            an.a,
            false,
            false,
            false
         )
         .a("crafting_table", ci.a.a(dko.cI))
         .a($$1, "story/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(cxt.pk, xv.c("advancements.story.mine_stone.title"), xv.c("advancements.story.mine_stone.description"), null, an.a, true, true, false)
         .a("get_stone", ci.a.a(cu.a.a().a($$2, ayd.be)))
         .a($$1, "story/mine_stone");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cxt.pp, xv.c("advancements.story.upgrade_tools.title"), xv.c("advancements.story.upgrade_tools.description"), null, an.a, true, true, false)
         .a("stone_pickaxe", ci.a.a(cxt.pp))
         .a($$1, "story/upgrade_tools");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cxt.pb, xv.c("advancements.story.smelt_iron.title"), xv.c("advancements.story.smelt_iron.description"), null, an.a, true, true, false)
         .a("iron", ci.a.a(cxt.pb))
         .a($$1, "story/smelt_iron");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cxt.pz, xv.c("advancements.story.iron_tools.title"), xv.c("advancements.story.iron_tools.description"), null, an.a, true, true, false)
         .a("iron_pickaxe", ci.a.a(cxt.pz))
         .a($$1, "story/iron_tools");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(cxt.oV, xv.c("advancements.story.mine_diamond.title"), xv.c("advancements.story.mine_diamond.description"), null, an.a, true, true, false)
         .a("diamond", ci.a.a(cxt.oV))
         .a($$1, "story/mine_diamond");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(cxt.qY, xv.c("advancements.story.lava_bucket.title"), xv.c("advancements.story.lava_bucket.description"), null, an.a, true, true, false)
         .a("lava_bucket", ci.a.a(cxt.qY))
         .a($$1, "story/lava_bucket");
      ah $$10 = ag.a.a()
         .a($$6)
         .a(cxt.qd, xv.c("advancements.story.obtain_armor.title"), xv.c("advancements.story.obtain_armor.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("iron_helmet", ci.a.a(cxt.qc))
         .a("iron_chestplate", ci.a.a(cxt.qd))
         .a("iron_leggings", ci.a.a(cxt.qe))
         .a("iron_boots", ci.a.a(cxt.qf))
         .a($$1, "story/obtain_armor");
      ag.a.a()
         .a($$8)
         .a(cxt.vm, xv.c("advancements.story.enchant_item.title"), xv.c("advancements.story.enchant_item.description"), null, an.a, true, true, false)
         .a("enchanted_item", bq.a.b())
         .a($$1, "story/enchant_item");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dko.cv, xv.c("advancements.story.form_obsidian.title"), xv.c("advancements.story.form_obsidian.description"), null, an.a, true, true, false)
         .a("obsidian", ci.a.a(dko.cv))
         .a($$1, "story/form_obsidian");
      ag.a.a()
         .a($$10)
         .a(cxt.wi, xv.c("advancements.story.deflect_arrow.title"), xv.c("advancements.story.deflect_arrow.description"), null, an.a, true, true, false)
         .a("deflected_projectile", bv.a.a(bk.a.a().a(bl.a.a().a(eg.a(axw.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ag.a.a()
         .a($$8)
         .a(cxt.qh, xv.c("advancements.story.shiny_gear.title"), xv.c("advancements.story.shiny_gear.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("diamond_helmet", ci.a.a(cxt.qg))
         .a("diamond_chestplate", ci.a.a(cxt.qh))
         .a("diamond_leggings", ci.a.a(cxt.qi))
         .a("diamond_boots", ci.a.a(cxt.qj))
         .a($$1, "story/shiny_gear");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(cxt.oO, xv.c("advancements.story.enter_the_nether.title"), xv.c("advancements.story.enter_the_nether.description"), null, an.a, true, true, false)
         .a("entered_nether", ba.a.a(dhi.j))
         .a($$1, "story/enter_the_nether");
      ag.a.a()
         .a($$12)
         .a(
            cxt.qw,
            xv.c("advancements.story.cure_zombie_villager.title"),
            xv.c("advancements.story.cure_zombie_villager.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bj.a.b())
         .a($$1, "story/cure_zombie_villager");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cxt.tg, xv.c("advancements.story.follow_ender_eye.title"), xv.c("advancements.story.follow_ender_eye.description"), null, an.a, true, true, false)
         .a("in_stronghold", ds.a.a(dh.a.b($$0.d(mb.aU).b(eoe.k))))
         .a($$1, "story/follow_ender_eye");
      ag.a.a()
         .a($$13)
         .a(dko.fN, xv.c("advancements.story.enter_the_end.title"), xv.c("advancements.story.enter_the_end.description"), null, an.a, true, true, false)
         .a("entered_end", ba.a.a(dhi.k))
         .a($$1, "story/enter_the_end");
   }
}
