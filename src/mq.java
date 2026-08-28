import java.util.function.Consumer;

public class mq implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<cwb> $$2 = $$0.d(ma.K);
      ah $$3 = ag.a.a()
         .a(
            dil.i,
            xl.c("advancements.story.root.title"),
            xl.c("advancements.story.root.description"),
            all.b("textures/gui/advancements/backgrounds/stone.png"),
            an.a,
            false,
            false,
            false
         )
         .a("crafting_table", ci.a.a(dil.cA))
         .a($$1, "story/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(cwj.oP, xl.c("advancements.story.mine_stone.title"), xl.c("advancements.story.mine_stone.description"), null, an.a, true, true, false)
         .a("get_stone", ci.a.a(cu.a.a().a($$2, axm.bd)))
         .a($$1, "story/mine_stone");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwj.oU, xl.c("advancements.story.upgrade_tools.title"), xl.c("advancements.story.upgrade_tools.description"), null, an.a, true, true, false)
         .a("stone_pickaxe", ci.a.a(cwj.oU))
         .a($$1, "story/upgrade_tools");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwj.oG, xl.c("advancements.story.smelt_iron.title"), xl.c("advancements.story.smelt_iron.description"), null, an.a, true, true, false)
         .a("iron", ci.a.a(cwj.oG))
         .a($$1, "story/smelt_iron");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwj.pe, xl.c("advancements.story.iron_tools.title"), xl.c("advancements.story.iron_tools.description"), null, an.a, true, true, false)
         .a("iron_pickaxe", ci.a.a(cwj.pe))
         .a($$1, "story/iron_tools");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(cwj.oA, xl.c("advancements.story.mine_diamond.title"), xl.c("advancements.story.mine_diamond.description"), null, an.a, true, true, false)
         .a("diamond", ci.a.a(cwj.oA))
         .a($$1, "story/mine_diamond");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(cwj.qB, xl.c("advancements.story.lava_bucket.title"), xl.c("advancements.story.lava_bucket.description"), null, an.a, true, true, false)
         .a("lava_bucket", ci.a.a(cwj.qB))
         .a($$1, "story/lava_bucket");
      ah $$10 = ag.a.a()
         .a($$6)
         .a(cwj.pI, xl.c("advancements.story.obtain_armor.title"), xl.c("advancements.story.obtain_armor.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("iron_helmet", ci.a.a(cwj.pH))
         .a("iron_chestplate", ci.a.a(cwj.pI))
         .a("iron_leggings", ci.a.a(cwj.pJ))
         .a("iron_boots", ci.a.a(cwj.pK))
         .a($$1, "story/obtain_armor");
      ag.a.a()
         .a($$8)
         .a(cwj.uO, xl.c("advancements.story.enchant_item.title"), xl.c("advancements.story.enchant_item.description"), null, an.a, true, true, false)
         .a("enchanted_item", bq.a.b())
         .a($$1, "story/enchant_item");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dil.co, xl.c("advancements.story.form_obsidian.title"), xl.c("advancements.story.form_obsidian.description"), null, an.a, true, true, false)
         .a("obsidian", ci.a.a(dil.co))
         .a($$1, "story/form_obsidian");
      ag.a.a()
         .a($$10)
         .a(cwj.vK, xl.c("advancements.story.deflect_arrow.title"), xl.c("advancements.story.deflect_arrow.description"), null, an.a, true, true, false)
         .a("deflected_projectile", bv.a.a(bk.a.a().a(bl.a.a().a(eg.a(axf.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ag.a.a()
         .a($$8)
         .a(cwj.pM, xl.c("advancements.story.shiny_gear.title"), xl.c("advancements.story.shiny_gear.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("diamond_helmet", ci.a.a(cwj.pL))
         .a("diamond_chestplate", ci.a.a(cwj.pM))
         .a("diamond_leggings", ci.a.a(cwj.pN))
         .a("diamond_boots", ci.a.a(cwj.pO))
         .a($$1, "story/shiny_gear");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(cwj.ot, xl.c("advancements.story.enter_the_nether.title"), xl.c("advancements.story.enter_the_nether.description"), null, an.a, true, true, false)
         .a("entered_nether", ba.a.a(dff.j))
         .a($$1, "story/enter_the_nether");
      ag.a.a()
         .a($$12)
         .a(
            cwj.qb,
            xl.c("advancements.story.cure_zombie_villager.title"),
            xl.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cwj.sJ, xl.c("advancements.story.follow_ender_eye.title"), xl.c("advancements.story.follow_ender_eye.description"), null, an.a, true, true, false)
         .a("in_stronghold", ds.a.a(dh.a.b($$0.d(ma.aS).b(elv.k))))
         .a($$1, "story/follow_ender_eye");
      ag.a.a()
         .a($$13)
         .a(dil.fz, xl.c("advancements.story.enter_the_end.title"), xl.c("advancements.story.enter_the_end.description"), null, an.a, true, true, false)
         .a("entered_end", ba.a.a(dff.k))
         .a($$1, "story/enter_the_end");
   }
}
