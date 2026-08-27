import java.util.function.Consumer;

public class js implements jm {
   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cpo.i,
            sw.c("advancements.story.root.title"),
            sw.c("advancements.story.root.description"),
            new acq("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", bx.a.a(cpo.cA))
         .a($$1, "story/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cgc.nZ, sw.c("advancements.story.mine_stone.title"), sw.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", bx.a.a(bz.a.a().a(ane.ax).b()))
         .a($$1, "story/mine_stone");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(cgc.oe, sw.c("advancements.story.upgrade_tools.title"), sw.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", bx.a.a(cgc.oe))
         .a($$1, "story/upgrade_tools");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(cgc.nQ, sw.c("advancements.story.smelt_iron.title"), sw.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", bx.a.a(cgc.nQ))
         .a($$1, "story/smelt_iron");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cgc.oo, sw.c("advancements.story.iron_tools.title"), sw.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", bx.a.a(cgc.oo))
         .a($$1, "story/iron_tools");
      ae $$7 = ae.a.a()
         .a($$6)
         .a(cgc.nK, sw.c("advancements.story.mine_diamond.title"), sw.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", bx.a.a(cgc.nK))
         .a($$1, "story/mine_diamond");
      ae $$8 = ae.a.a()
         .a($$5)
         .a(cgc.pM, sw.c("advancements.story.lava_bucket.title"), sw.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", bx.a.a(cgc.pM))
         .a($$1, "story/lava_bucket");
      ae $$9 = ae.a.a()
         .a($$5)
         .a(cgc.oT, sw.c("advancements.story.obtain_armor.title"), sw.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("iron_helmet", bx.a.a(cgc.oS))
         .a("iron_chestplate", bx.a.a(cgc.oT))
         .a("iron_leggings", bx.a.a(cgc.oU))
         .a("iron_boots", bx.a.a(cgc.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cgc.tC, sw.c("advancements.story.enchant_item.title"), sw.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", bi.a.c())
         .a($$1, "story/enchant_item");
      ae $$10 = ae.a.a()
         .a($$8)
         .a(cpo.co, sw.c("advancements.story.form_obsidian.title"), sw.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", bx.a.a(cpo.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cgc.uy, sw.c("advancements.story.deflect_arrow.title"), sw.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bn.a.a(bc.a.a().a(bd.a.a().a(db.a(amy.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cgc.oX, sw.c("advancements.story.shiny_gear.title"), sw.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("diamond_helmet", bx.a.a(cgc.oW))
         .a("diamond_chestplate", bx.a.a(cgc.oX))
         .a("diamond_leggings", bx.a.a(cgc.oY))
         .a("diamond_boots", bx.a.a(cgc.oZ))
         .a($$1, "story/shiny_gear");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(cgc.nE, sw.c("advancements.story.enter_the_nether.title"), sw.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", aw.a.a(cmm.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cgc.pm,
            sw.c("advancements.story.cure_zombie_villager.title"),
            sw.c("advancements.story.cure_zombie_villager.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bb.a.c())
         .a($$1, "story/cure_zombie_villager");
      ae $$12 = ae.a.a()
         .a($$11)
         .a(cgc.rD, sw.c("advancements.story.follow_ender_eye.title"), sw.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", cq.a.a(ch.c(dru.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cpo.fz, sw.c("advancements.story.enter_the_end.title"), sw.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", aw.a.a(cmm.j))
         .a($$1, "story/enter_the_end");
   }
}
