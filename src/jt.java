import java.util.function.Consumer;

public class jt implements jn {
   @Override
   public void a(hh.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csl.i,
            te.c("advancements.story.root.title"),
            te.c("advancements.story.root.description"),
            new aep("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", bx.a.a(csl.cA))
         .a($$1, "story/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(ciz.nZ, te.c("advancements.story.mine_stone.title"), te.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", bx.a.a(bz.a.a().a(apr.ax).b()))
         .a($$1, "story/mine_stone");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(ciz.oe, te.c("advancements.story.upgrade_tools.title"), te.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", bx.a.a(ciz.oe))
         .a($$1, "story/upgrade_tools");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(ciz.nQ, te.c("advancements.story.smelt_iron.title"), te.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", bx.a.a(ciz.nQ))
         .a($$1, "story/smelt_iron");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(ciz.oo, te.c("advancements.story.iron_tools.title"), te.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", bx.a.a(ciz.oo))
         .a($$1, "story/iron_tools");
      ae $$7 = ae.a.a()
         .a($$6)
         .a(ciz.nK, te.c("advancements.story.mine_diamond.title"), te.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", bx.a.a(ciz.nK))
         .a($$1, "story/mine_diamond");
      ae $$8 = ae.a.a()
         .a($$5)
         .a(ciz.pM, te.c("advancements.story.lava_bucket.title"), te.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", bx.a.a(ciz.pM))
         .a($$1, "story/lava_bucket");
      ae $$9 = ae.a.a()
         .a($$5)
         .a(ciz.oT, te.c("advancements.story.obtain_armor.title"), te.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("iron_helmet", bx.a.a(ciz.oS))
         .a("iron_chestplate", bx.a.a(ciz.oT))
         .a("iron_leggings", bx.a.a(ciz.oU))
         .a("iron_boots", bx.a.a(ciz.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(ciz.tC, te.c("advancements.story.enchant_item.title"), te.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", bi.a.c())
         .a($$1, "story/enchant_item");
      ae $$10 = ae.a.a()
         .a($$8)
         .a(csl.co, te.c("advancements.story.form_obsidian.title"), te.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", bx.a.a(csl.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(ciz.uy, te.c("advancements.story.deflect_arrow.title"), te.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bn.a.a(bc.a.a().a(bd.a.a().a(db.a(apl.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(ciz.oX, te.c("advancements.story.shiny_gear.title"), te.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("diamond_helmet", bx.a.a(ciz.oW))
         .a("diamond_chestplate", bx.a.a(ciz.oX))
         .a("diamond_leggings", bx.a.a(ciz.oY))
         .a("diamond_boots", bx.a.a(ciz.oZ))
         .a($$1, "story/shiny_gear");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(ciz.nE, te.c("advancements.story.enter_the_nether.title"), te.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", aw.a.a(cpk.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            ciz.pm,
            te.c("advancements.story.cure_zombie_villager.title"),
            te.c("advancements.story.cure_zombie_villager.description"),
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
         .a(ciz.rD, te.c("advancements.story.follow_ender_eye.title"), te.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", cq.a.a(ch.c(dur.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(csl.fz, te.c("advancements.story.enter_the_end.title"), te.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", aw.a.a(cpk.j))
         .a($$1, "story/enter_the_end");
   }
}
