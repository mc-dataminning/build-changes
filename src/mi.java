import java.util.function.Consumer;

public class mi implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dez.i,
            xo.c("advancements.story.root.title"),
            xo.c("advancements.story.root.description"),
            new ale("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ce.a.a(dez.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuq.oN, xo.c("advancements.story.mine_stone.title"), xo.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ce.a.a(cp.a.a().a(awx.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cuq.oS, xo.c("advancements.story.upgrade_tools.title"), xo.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ce.a.a(cuq.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cuq.oE, xo.c("advancements.story.smelt_iron.title"), xo.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ce.a.a(cuq.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cuq.pc, xo.c("advancements.story.iron_tools.title"), xo.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ce.a.a(cuq.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cuq.oy, xo.c("advancements.story.mine_diamond.title"), xo.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ce.a.a(cuq.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cuq.qA, xo.c("advancements.story.lava_bucket.title"), xo.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ce.a.a(cuq.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cuq.pH, xo.c("advancements.story.obtain_armor.title"), xo.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ce.a.a(cuq.pG))
         .a("iron_chestplate", ce.a.a(cuq.pH))
         .a("iron_leggings", ce.a.a(cuq.pI))
         .a("iron_boots", ce.a.a(cuq.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cuq.uw, xo.c("advancements.story.enchant_item.title"), xo.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bo.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dez.co, xo.c("advancements.story.form_obsidian.title"), xo.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ce.a.a(dez.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cuq.vs, xo.c("advancements.story.deflect_arrow.title"), xo.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bt.a.a(bi.a.a().a(bj.a.a().a(dz.a(awq.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cuq.pL, xo.c("advancements.story.shiny_gear.title"), xo.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ce.a.a(cuq.pK))
         .a("diamond_chestplate", ce.a.a(cuq.pL))
         .a("diamond_leggings", ce.a.a(cuq.pM))
         .a("diamond_boots", ce.a.a(cuq.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cuq.os, xo.c("advancements.story.enter_the_nether.title"), xo.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dbw.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cuq.qa,
            xo.c("advancements.story.cure_zombie_villager.title"),
            xo.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cuq.ss, xo.c("advancements.story.follow_ender_eye.title"), xo.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eic.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dez.fz, xo.c("advancements.story.enter_the_end.title"), xo.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dbw.j))
         .a($$1, "story/enter_the_end");
   }
}
