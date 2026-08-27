import java.util.function.Consumer;

public class ju implements jo {
   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csw.i,
            tl.c("advancements.story.root.title"),
            tl.c("advancements.story.root.description"),
            new aex("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(csw.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cji.nZ, tl.c("advancements.story.mine_stone.title"), tl.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(aqb.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cji.oe, tl.c("advancements.story.upgrade_tools.title"), tl.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(cji.oe))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cji.nQ, tl.c("advancements.story.smelt_iron.title"), tl.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(cji.nQ))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cji.oo, tl.c("advancements.story.iron_tools.title"), tl.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(cji.oo))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cji.nK, tl.c("advancements.story.mine_diamond.title"), tl.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(cji.nK))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cji.pM, tl.c("advancements.story.lava_bucket.title"), tl.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(cji.pM))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cji.oT, tl.c("advancements.story.obtain_armor.title"), tl.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(cji.oS))
         .a("iron_chestplate", bz.a.a(cji.oT))
         .a("iron_leggings", bz.a.a(cji.oU))
         .a("iron_boots", bz.a.a(cji.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cji.tC, tl.c("advancements.story.enchant_item.title"), tl.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(csw.co, tl.c("advancements.story.form_obsidian.title"), tl.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(csw.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cji.uy, tl.c("advancements.story.deflect_arrow.title"), tl.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(apv.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cji.oX, tl.c("advancements.story.shiny_gear.title"), tl.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(cji.oW))
         .a("diamond_chestplate", bz.a.a(cji.oX))
         .a("diamond_leggings", bz.a.a(cji.oY))
         .a("diamond_boots", bz.a.a(cji.oZ))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cji.nE, tl.c("advancements.story.enter_the_nether.title"), tl.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(cpv.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cji.pm,
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
         .a(cji.rD, tl.c("advancements.story.follow_ender_eye.title"), tl.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dvc.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(csw.fz, tl.c("advancements.story.enter_the_end.title"), tl.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(cpv.j))
         .a($$1, "story/enter_the_end");
   }
}
