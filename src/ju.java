import java.util.function.Consumer;

public class ju implements jo {
   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csy.i,
            tn.c("advancements.story.root.title"),
            tn.c("advancements.story.root.description"),
            new aey("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(csy.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjk.nZ, tn.c("advancements.story.mine_stone.title"), tn.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(aqc.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cjk.oe, tn.c("advancements.story.upgrade_tools.title"), tn.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(cjk.oe))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cjk.nQ, tn.c("advancements.story.smelt_iron.title"), tn.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(cjk.nQ))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjk.oo, tn.c("advancements.story.iron_tools.title"), tn.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(cjk.oo))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cjk.nK, tn.c("advancements.story.mine_diamond.title"), tn.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(cjk.nK))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cjk.pM, tn.c("advancements.story.lava_bucket.title"), tn.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(cjk.pM))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cjk.oT, tn.c("advancements.story.obtain_armor.title"), tn.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(cjk.oS))
         .a("iron_chestplate", bz.a.a(cjk.oT))
         .a("iron_leggings", bz.a.a(cjk.oU))
         .a("iron_boots", bz.a.a(cjk.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cjk.tC, tn.c("advancements.story.enchant_item.title"), tn.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(csy.co, tn.c("advancements.story.form_obsidian.title"), tn.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(csy.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cjk.uy, tn.c("advancements.story.deflect_arrow.title"), tn.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(apw.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cjk.oX, tn.c("advancements.story.shiny_gear.title"), tn.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(cjk.oW))
         .a("diamond_chestplate", bz.a.a(cjk.oX))
         .a("diamond_leggings", bz.a.a(cjk.oY))
         .a("diamond_boots", bz.a.a(cjk.oZ))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cjk.nE, tn.c("advancements.story.enter_the_nether.title"), tn.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(cpx.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cjk.pm,
            tn.c("advancements.story.cure_zombie_villager.title"),
            tn.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cjk.rD, tn.c("advancements.story.follow_ender_eye.title"), tn.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dve.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(csy.fz, tn.c("advancements.story.enter_the_end.title"), tn.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(cpx.j))
         .a($$1, "story/enter_the_end");
   }
}
