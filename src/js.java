import java.util.function.Consumer;

public class js implements jm {
   @Override
   public void a(hg.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cte.i,
            tl.c("advancements.story.root.title"),
            tl.c("advancements.story.root.description"),
            new aez("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(cte.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjo.nZ, tl.c("advancements.story.mine_stone.title"), tl.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(aqd.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cjo.oe, tl.c("advancements.story.upgrade_tools.title"), tl.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(cjo.oe))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cjo.nQ, tl.c("advancements.story.smelt_iron.title"), tl.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(cjo.nQ))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjo.oo, tl.c("advancements.story.iron_tools.title"), tl.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(cjo.oo))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cjo.nK, tl.c("advancements.story.mine_diamond.title"), tl.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(cjo.nK))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cjo.pM, tl.c("advancements.story.lava_bucket.title"), tl.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(cjo.pM))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cjo.oT, tl.c("advancements.story.obtain_armor.title"), tl.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(cjo.oS))
         .a("iron_chestplate", bz.a.a(cjo.oT))
         .a("iron_leggings", bz.a.a(cjo.oU))
         .a("iron_boots", bz.a.a(cjo.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cjo.tC, tl.c("advancements.story.enchant_item.title"), tl.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cte.co, tl.c("advancements.story.form_obsidian.title"), tl.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(cte.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cjo.uy, tl.c("advancements.story.deflect_arrow.title"), tl.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(apx.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cjo.oX, tl.c("advancements.story.shiny_gear.title"), tl.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(cjo.oW))
         .a("diamond_chestplate", bz.a.a(cjo.oX))
         .a("diamond_leggings", bz.a.a(cjo.oY))
         .a("diamond_boots", bz.a.a(cjo.oZ))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cjo.nE, tl.c("advancements.story.enter_the_nether.title"), tl.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(cqb.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cjo.pm,
            tl.c("advancements.story.cure_zombie_villager.title"),
            tl.c("advancements.story.cure_zombie_villager.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bd.a.c())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cjo.rD, tl.c("advancements.story.follow_ender_eye.title"), tl.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(duw.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cte.fz, tl.c("advancements.story.enter_the_end.title"), tl.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(cqb.j))
         .a($$1, "story/enter_the_end");
   }
}
