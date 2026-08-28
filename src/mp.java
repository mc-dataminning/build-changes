import java.util.function.Consumer;

public class mp implements mj {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<cvx> $$2 = $$0.d(lz.K);
      ah $$3 = ag.a.a()
         .a(
            dig.i,
            xi.c("advancements.story.root.title"),
            xi.c("advancements.story.root.description"),
            ali.b("textures/gui/advancements/backgrounds/stone.png"),
            an.a,
            false,
            false,
            false
         )
         .a("crafting_table", ci.a.a(dig.cA))
         .a($$1, "story/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(cwf.oP, xi.c("advancements.story.mine_stone.title"), xi.c("advancements.story.mine_stone.description"), null, an.a, true, true, false)
         .a("get_stone", ci.a.a(cu.a.a().a($$2, axj.bc)))
         .a($$1, "story/mine_stone");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwf.oU, xi.c("advancements.story.upgrade_tools.title"), xi.c("advancements.story.upgrade_tools.description"), null, an.a, true, true, false)
         .a("stone_pickaxe", ci.a.a(cwf.oU))
         .a($$1, "story/upgrade_tools");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cwf.oG, xi.c("advancements.story.smelt_iron.title"), xi.c("advancements.story.smelt_iron.description"), null, an.a, true, true, false)
         .a("iron", ci.a.a(cwf.oG))
         .a($$1, "story/smelt_iron");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cwf.pe, xi.c("advancements.story.iron_tools.title"), xi.c("advancements.story.iron_tools.description"), null, an.a, true, true, false)
         .a("iron_pickaxe", ci.a.a(cwf.pe))
         .a($$1, "story/iron_tools");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(cwf.oA, xi.c("advancements.story.mine_diamond.title"), xi.c("advancements.story.mine_diamond.description"), null, an.a, true, true, false)
         .a("diamond", ci.a.a(cwf.oA))
         .a($$1, "story/mine_diamond");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(cwf.qB, xi.c("advancements.story.lava_bucket.title"), xi.c("advancements.story.lava_bucket.description"), null, an.a, true, true, false)
         .a("lava_bucket", ci.a.a(cwf.qB))
         .a($$1, "story/lava_bucket");
      ah $$10 = ag.a.a()
         .a($$6)
         .a(cwf.pI, xi.c("advancements.story.obtain_armor.title"), xi.c("advancements.story.obtain_armor.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("iron_helmet", ci.a.a(cwf.pH))
         .a("iron_chestplate", ci.a.a(cwf.pI))
         .a("iron_leggings", ci.a.a(cwf.pJ))
         .a("iron_boots", ci.a.a(cwf.pK))
         .a($$1, "story/obtain_armor");
      ag.a.a()
         .a($$8)
         .a(cwf.uy, xi.c("advancements.story.enchant_item.title"), xi.c("advancements.story.enchant_item.description"), null, an.a, true, true, false)
         .a("enchanted_item", bq.a.b())
         .a($$1, "story/enchant_item");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dig.co, xi.c("advancements.story.form_obsidian.title"), xi.c("advancements.story.form_obsidian.description"), null, an.a, true, true, false)
         .a("obsidian", ci.a.a(dig.co))
         .a($$1, "story/form_obsidian");
      ag.a.a()
         .a($$10)
         .a(cwf.vu, xi.c("advancements.story.deflect_arrow.title"), xi.c("advancements.story.deflect_arrow.description"), null, an.a, true, true, false)
         .a("deflected_projectile", bv.a.a(bk.a.a().a(bl.a.a().a(eg.a(axc.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ag.a.a()
         .a($$8)
         .a(cwf.pM, xi.c("advancements.story.shiny_gear.title"), xi.c("advancements.story.shiny_gear.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("diamond_helmet", ci.a.a(cwf.pL))
         .a("diamond_chestplate", ci.a.a(cwf.pM))
         .a("diamond_leggings", ci.a.a(cwf.pN))
         .a("diamond_boots", ci.a.a(cwf.pO))
         .a($$1, "story/shiny_gear");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(cwf.ot, xi.c("advancements.story.enter_the_nether.title"), xi.c("advancements.story.enter_the_nether.description"), null, an.a, true, true, false)
         .a("entered_nether", ba.a.a(dfb.j))
         .a($$1, "story/enter_the_nether");
      ag.a.a()
         .a($$12)
         .a(
            cwf.qb,
            xi.c("advancements.story.cure_zombie_villager.title"),
            xi.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cwf.st, xi.c("advancements.story.follow_ender_eye.title"), xi.c("advancements.story.follow_ender_eye.description"), null, an.a, true, true, false)
         .a("in_stronghold", ds.a.a(dh.a.b($$0.d(lz.aS).b(elr.k))))
         .a($$1, "story/follow_ender_eye");
      ag.a.a()
         .a($$13)
         .a(dig.fz, xi.c("advancements.story.enter_the_end.title"), xi.c("advancements.story.enter_the_end.description"), null, an.a, true, true, false)
         .a("entered_end", ba.a.a(dfb.k))
         .a($$1, "story/enter_the_end");
   }
}
