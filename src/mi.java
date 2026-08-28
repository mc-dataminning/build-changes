import java.util.function.Consumer;

public class mi implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfb.i,
            xp.c("advancements.story.root.title"),
            xp.c("advancements.story.root.description"),
            new alf("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ce.a.a(dfb.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cus.oN, xp.c("advancements.story.mine_stone.title"), xp.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ce.a.a(cp.a.a().a(awy.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cus.oS, xp.c("advancements.story.upgrade_tools.title"), xp.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ce.a.a(cus.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cus.oE, xp.c("advancements.story.smelt_iron.title"), xp.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ce.a.a(cus.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cus.pc, xp.c("advancements.story.iron_tools.title"), xp.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ce.a.a(cus.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cus.oy, xp.c("advancements.story.mine_diamond.title"), xp.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ce.a.a(cus.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cus.qA, xp.c("advancements.story.lava_bucket.title"), xp.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ce.a.a(cus.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cus.pH, xp.c("advancements.story.obtain_armor.title"), xp.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ce.a.a(cus.pG))
         .a("iron_chestplate", ce.a.a(cus.pH))
         .a("iron_leggings", ce.a.a(cus.pI))
         .a("iron_boots", ce.a.a(cus.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cus.uw, xp.c("advancements.story.enchant_item.title"), xp.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bo.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dfb.co, xp.c("advancements.story.form_obsidian.title"), xp.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ce.a.a(dfb.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cus.vs, xp.c("advancements.story.deflect_arrow.title"), xp.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bt.a.a(bi.a.a().a(bj.a.a().a(dz.a(awr.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cus.pL, xp.c("advancements.story.shiny_gear.title"), xp.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ce.a.a(cus.pK))
         .a("diamond_chestplate", ce.a.a(cus.pL))
         .a("diamond_leggings", ce.a.a(cus.pM))
         .a("diamond_boots", ce.a.a(cus.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cus.os, xp.c("advancements.story.enter_the_nether.title"), xp.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dby.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cus.qa,
            xp.c("advancements.story.cure_zombie_villager.title"),
            xp.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cus.ss, xp.c("advancements.story.follow_ender_eye.title"), xp.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eie.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dfb.fz, xp.c("advancements.story.enter_the_end.title"), xp.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dby.j))
         .a($$1, "story/enter_the_end");
   }
}
