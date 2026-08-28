import java.util.function.Consumer;

public class mi implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dew.i,
            xl.c("advancements.story.root.title"),
            xl.c("advancements.story.root.description"),
            new alb("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ce.a.a(dew.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cun.oN, xl.c("advancements.story.mine_stone.title"), xl.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ce.a.a(cp.a.a().a(awu.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cun.oS, xl.c("advancements.story.upgrade_tools.title"), xl.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ce.a.a(cun.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cun.oE, xl.c("advancements.story.smelt_iron.title"), xl.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ce.a.a(cun.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cun.pc, xl.c("advancements.story.iron_tools.title"), xl.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ce.a.a(cun.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cun.oy, xl.c("advancements.story.mine_diamond.title"), xl.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ce.a.a(cun.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cun.qA, xl.c("advancements.story.lava_bucket.title"), xl.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ce.a.a(cun.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cun.pH, xl.c("advancements.story.obtain_armor.title"), xl.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ce.a.a(cun.pG))
         .a("iron_chestplate", ce.a.a(cun.pH))
         .a("iron_leggings", ce.a.a(cun.pI))
         .a("iron_boots", ce.a.a(cun.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cun.uw, xl.c("advancements.story.enchant_item.title"), xl.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bo.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dew.co, xl.c("advancements.story.form_obsidian.title"), xl.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ce.a.a(dew.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cun.vs, xl.c("advancements.story.deflect_arrow.title"), xl.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bt.a.a(bi.a.a().a(bj.a.a().a(dz.a(awn.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cun.pL, xl.c("advancements.story.shiny_gear.title"), xl.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ce.a.a(cun.pK))
         .a("diamond_chestplate", ce.a.a(cun.pL))
         .a("diamond_leggings", ce.a.a(cun.pM))
         .a("diamond_boots", ce.a.a(cun.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cun.os, xl.c("advancements.story.enter_the_nether.title"), xl.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dbt.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cun.qa,
            xl.c("advancements.story.cure_zombie_villager.title"),
            xl.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cun.ss, xl.c("advancements.story.follow_ender_eye.title"), xl.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", dl.a.a(dc.a.b($$0.b(lq.aJ).b(ehz.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dew.fz, xl.c("advancements.story.enter_the_end.title"), xl.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dbt.j))
         .a($$1, "story/enter_the_end");
   }
}
