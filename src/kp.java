import java.util.function.Consumer;

public class kp implements kj {
   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuc.i,
            ui.c("advancements.story.root.title"),
            ui.c("advancements.story.root.description"),
            new afw("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(cuc.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ckm.nZ, ui.c("advancements.story.mine_stone.title"), ui.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(ara.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ckm.oe, ui.c("advancements.story.upgrade_tools.title"), ui.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(ckm.oe))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(ckm.nQ, ui.c("advancements.story.smelt_iron.title"), ui.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(ckm.nQ))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ckm.oo, ui.c("advancements.story.iron_tools.title"), ui.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(ckm.oo))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(ckm.nK, ui.c("advancements.story.mine_diamond.title"), ui.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(ckm.nK))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(ckm.pM, ui.c("advancements.story.lava_bucket.title"), ui.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(ckm.pM))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(ckm.oT, ui.c("advancements.story.obtain_armor.title"), ui.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(ckm.oS))
         .a("iron_chestplate", bz.a.a(ckm.oT))
         .a("iron_leggings", bz.a.a(ckm.oU))
         .a("iron_boots", bz.a.a(ckm.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(ckm.tC, ui.c("advancements.story.enchant_item.title"), ui.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cuc.co, ui.c("advancements.story.form_obsidian.title"), ui.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(cuc.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(ckm.uy, ui.c("advancements.story.deflect_arrow.title"), ui.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(aqu.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(ckm.oX, ui.c("advancements.story.shiny_gear.title"), ui.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(ckm.oW))
         .a("diamond_chestplate", bz.a.a(ckm.oX))
         .a("diamond_leggings", bz.a.a(ckm.oY))
         .a("diamond_boots", bz.a.a(ckm.oZ))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(ckm.nE, ui.c("advancements.story.enter_the_nether.title"), ui.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(cqz.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            ckm.pm,
            ui.c("advancements.story.cure_zombie_villager.title"),
            ui.c("advancements.story.cure_zombie_villager.description"),
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
         .a(ckm.rD, ui.c("advancements.story.follow_ender_eye.title"), ui.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dvu.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cuc.fz, ui.c("advancements.story.enter_the_end.title"), ui.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(cqz.j))
         .a($$1, "story/enter_the_end");
   }
}
