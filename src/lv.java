import java.util.function.Consumer;

public class lv implements ln {
   @Override
   public void a(ix.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcx.i,
            ws.c("advancements.story.root.title"),
            ws.c("advancements.story.root.description"),
            new akf("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(dcx.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(csg.oN, ws.c("advancements.story.mine_stone.title"), ws.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cg.a.a().a(avw.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(csg.oS, ws.c("advancements.story.upgrade_tools.title"), ws.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(csg.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csg.oE, ws.c("advancements.story.smelt_iron.title"), ws.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(csg.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(csg.pc, ws.c("advancements.story.iron_tools.title"), ws.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(csg.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(csg.oy, ws.c("advancements.story.mine_diamond.title"), ws.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(csg.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(csg.qA, ws.c("advancements.story.lava_bucket.title"), ws.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(csg.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(csg.pH, ws.c("advancements.story.obtain_armor.title"), ws.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(csg.pG))
         .a("iron_chestplate", ca.a.a(csg.pH))
         .a("iron_leggings", ca.a.a(csg.pI))
         .a("iron_boots", ca.a.a(csg.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(csg.uw, ws.c("advancements.story.enchant_item.title"), ws.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dcx.co, ws.c("advancements.story.form_obsidian.title"), ws.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(dcx.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(csg.vs, ws.c("advancements.story.deflect_arrow.title"), ws.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dl.a(avq.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(csg.pL, ws.c("advancements.story.shiny_gear.title"), ws.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(csg.pK))
         .a("diamond_chestplate", ca.a.a(csg.pL))
         .a("diamond_leggings", ca.a.a(csg.pM))
         .a("diamond_boots", ca.a.a(csg.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(csg.os, ws.c("advancements.story.enter_the_nether.title"), ws.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(czu.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            csg.qa,
            ws.c("advancements.story.cure_zombie_villager.title"),
            ws.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", be.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(csg.ss, ws.c("advancements.story.follow_ender_eye.title"), ws.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cz.a.a(cq.a.b($$0.b(ld.aI).b(ega.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dcx.fz, ws.c("advancements.story.enter_the_end.title"), ws.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(czu.j))
         .a($$1, "story/enter_the_end");
   }
}
