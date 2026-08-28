import java.util.function.Consumer;

public class mh implements mb {
   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfk.i,
            wu.c("advancements.story.root.title"),
            wu.c("advancements.story.root.description"),
            new akk("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ce.a.a(dfk.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cug.oO, wu.c("advancements.story.mine_stone.title"), wu.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ce.a.a(cp.a.a().a(awf.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cug.oT, wu.c("advancements.story.upgrade_tools.title"), wu.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ce.a.a(cug.oT))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cug.oF, wu.c("advancements.story.smelt_iron.title"), wu.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ce.a.a(cug.oF))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cug.pd, wu.c("advancements.story.iron_tools.title"), wu.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ce.a.a(cug.pd))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cug.oz, wu.c("advancements.story.mine_diamond.title"), wu.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ce.a.a(cug.oz))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cug.qA, wu.c("advancements.story.lava_bucket.title"), wu.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ce.a.a(cug.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cug.pH, wu.c("advancements.story.obtain_armor.title"), wu.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ce.a.a(cug.pG))
         .a("iron_chestplate", ce.a.a(cug.pH))
         .a("iron_leggings", ce.a.a(cug.pI))
         .a("iron_boots", ce.a.a(cug.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cug.uw, wu.c("advancements.story.enchant_item.title"), wu.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bo.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dfk.co, wu.c("advancements.story.form_obsidian.title"), wu.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ce.a.a(dfk.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cug.vs, wu.c("advancements.story.deflect_arrow.title"), wu.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bt.a.a(bi.a.a().a(bj.a.a().a(ea.a(avy.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cug.pL, wu.c("advancements.story.shiny_gear.title"), wu.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ce.a.a(cug.pK))
         .a("diamond_chestplate", ce.a.a(cug.pL))
         .a("diamond_leggings", ce.a.a(cug.pM))
         .a("diamond_boots", ce.a.a(cug.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cug.os, wu.c("advancements.story.enter_the_nether.title"), wu.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dcg.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cug.qa,
            wu.c("advancements.story.cure_zombie_villager.title"),
            wu.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bh.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cug.ss, wu.c("advancements.story.follow_ender_eye.title"), wu.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eir.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dfk.fz, wu.c("advancements.story.enter_the_end.title"), wu.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dcg.j))
         .a($$1, "story/enter_the_end");
   }
}
