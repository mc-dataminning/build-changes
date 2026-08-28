import java.util.function.Consumer;

public class mh implements mb {
   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfh.i,
            wu.c("advancements.story.root.title"),
            wu.c("advancements.story.root.description"),
            new akk("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ce.a.a(dfh.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cud.oN, wu.c("advancements.story.mine_stone.title"), wu.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ce.a.a(cp.a.a().a(awd.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cud.oS, wu.c("advancements.story.upgrade_tools.title"), wu.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ce.a.a(cud.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cud.oE, wu.c("advancements.story.smelt_iron.title"), wu.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ce.a.a(cud.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cud.pc, wu.c("advancements.story.iron_tools.title"), wu.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ce.a.a(cud.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cud.oy, wu.c("advancements.story.mine_diamond.title"), wu.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ce.a.a(cud.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cud.qA, wu.c("advancements.story.lava_bucket.title"), wu.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ce.a.a(cud.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cud.pH, wu.c("advancements.story.obtain_armor.title"), wu.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ce.a.a(cud.pG))
         .a("iron_chestplate", ce.a.a(cud.pH))
         .a("iron_leggings", ce.a.a(cud.pI))
         .a("iron_boots", ce.a.a(cud.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cud.uw, wu.c("advancements.story.enchant_item.title"), wu.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bo.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dfh.co, wu.c("advancements.story.form_obsidian.title"), wu.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ce.a.a(dfh.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cud.vs, wu.c("advancements.story.deflect_arrow.title"), wu.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bt.a.a(bi.a.a().a(bj.a.a().a(ea.a(avw.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cud.pL, wu.c("advancements.story.shiny_gear.title"), wu.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ce.a.a(cud.pK))
         .a("diamond_chestplate", ce.a.a(cud.pL))
         .a("diamond_leggings", ce.a.a(cud.pM))
         .a("diamond_boots", ce.a.a(cud.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cud.os, wu.c("advancements.story.enter_the_nether.title"), wu.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dcd.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cud.qa,
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
         .a(cud.ss, wu.c("advancements.story.follow_ender_eye.title"), wu.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eik.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dfh.fz, wu.c("advancements.story.enter_the_end.title"), wu.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dcd.j))
         .a($$1, "story/enter_the_end");
   }
}
