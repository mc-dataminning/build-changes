import java.util.function.Consumer;

public class mq implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<cwi> $$2 = $$0.d(ma.K);
      ah $$3 = ag.a.a()
         .a(
            dis.i,
            xj.c("advancements.story.root.title"),
            xj.c("advancements.story.root.description"),
            alj.b("textures/gui/advancements/backgrounds/stone.png"),
            an.a,
            false,
            false,
            false
         )
         .a("crafting_table", ci.a.a(dis.cA))
         .a($$1, "story/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(cwq.oP, xj.c("advancements.story.mine_stone.title"), xj.c("advancements.story.mine_stone.description"), null, an.a, true, true, false)
         .a("get_stone", ci.a.a(cu.a.a().a($$2, axl.bd)))
         .a($$1, "story/mine_stone");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwq.oU, xj.c("advancements.story.upgrade_tools.title"), xj.c("advancements.story.upgrade_tools.description"), null, an.a, true, true, false)
         .a("stone_pickaxe", ci.a.a(cwq.oU))
         .a($$1, "story/upgrade_tools");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwq.oG, xj.c("advancements.story.smelt_iron.title"), xj.c("advancements.story.smelt_iron.description"), null, an.a, true, true, false)
         .a("iron", ci.a.a(cwq.oG))
         .a($$1, "story/smelt_iron");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwq.pe, xj.c("advancements.story.iron_tools.title"), xj.c("advancements.story.iron_tools.description"), null, an.a, true, true, false)
         .a("iron_pickaxe", ci.a.a(cwq.pe))
         .a($$1, "story/iron_tools");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(cwq.oA, xj.c("advancements.story.mine_diamond.title"), xj.c("advancements.story.mine_diamond.description"), null, an.a, true, true, false)
         .a("diamond", ci.a.a(cwq.oA))
         .a($$1, "story/mine_diamond");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(cwq.qB, xj.c("advancements.story.lava_bucket.title"), xj.c("advancements.story.lava_bucket.description"), null, an.a, true, true, false)
         .a("lava_bucket", ci.a.a(cwq.qB))
         .a($$1, "story/lava_bucket");
      ah $$10 = ag.a.a()
         .a($$6)
         .a(cwq.pI, xj.c("advancements.story.obtain_armor.title"), xj.c("advancements.story.obtain_armor.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("iron_helmet", ci.a.a(cwq.pH))
         .a("iron_chestplate", ci.a.a(cwq.pI))
         .a("iron_leggings", ci.a.a(cwq.pJ))
         .a("iron_boots", ci.a.a(cwq.pK))
         .a($$1, "story/obtain_armor");
      ag.a.a()
         .a($$8)
         .a(cwq.uO, xj.c("advancements.story.enchant_item.title"), xj.c("advancements.story.enchant_item.description"), null, an.a, true, true, false)
         .a("enchanted_item", bq.a.b())
         .a($$1, "story/enchant_item");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dis.co, xj.c("advancements.story.form_obsidian.title"), xj.c("advancements.story.form_obsidian.description"), null, an.a, true, true, false)
         .a("obsidian", ci.a.a(dis.co))
         .a($$1, "story/form_obsidian");
      ag.a.a()
         .a($$10)
         .a(cwq.vK, xj.c("advancements.story.deflect_arrow.title"), xj.c("advancements.story.deflect_arrow.description"), null, an.a, true, true, false)
         .a("deflected_projectile", bv.a.a(bk.a.a().a(bl.a.a().a(eg.a(axe.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ag.a.a()
         .a($$8)
         .a(cwq.pM, xj.c("advancements.story.shiny_gear.title"), xj.c("advancements.story.shiny_gear.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("diamond_helmet", ci.a.a(cwq.pL))
         .a("diamond_chestplate", ci.a.a(cwq.pM))
         .a("diamond_leggings", ci.a.a(cwq.pN))
         .a("diamond_boots", ci.a.a(cwq.pO))
         .a($$1, "story/shiny_gear");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(cwq.ot, xj.c("advancements.story.enter_the_nether.title"), xj.c("advancements.story.enter_the_nether.description"), null, an.a, true, true, false)
         .a("entered_nether", ba.a.a(dfm.j))
         .a($$1, "story/enter_the_nether");
      ag.a.a()
         .a($$12)
         .a(
            cwq.qb,
            xj.c("advancements.story.cure_zombie_villager.title"),
            xj.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cwq.sJ, xj.c("advancements.story.follow_ender_eye.title"), xj.c("advancements.story.follow_ender_eye.description"), null, an.a, true, true, false)
         .a("in_stronghold", ds.a.a(dh.a.b($$0.d(ma.aS).b(emc.k))))
         .a($$1, "story/follow_ender_eye");
      ag.a.a()
         .a($$13)
         .a(dis.fz, xj.c("advancements.story.enter_the_end.title"), xj.c("advancements.story.enter_the_end.description"), null, an.a, true, true, false)
         .a("entered_end", ba.a.a(dfm.k))
         .a($$1, "story/enter_the_end");
   }
}
