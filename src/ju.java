import java.util.function.Consumer;

public class ju implements jo {
   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csr.i,
            ti.c("advancements.story.root.title"),
            ti.c("advancements.story.root.description"),
            new aeu("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(csr.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cjd.nZ, ti.c("advancements.story.mine_stone.title"), ti.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(apw.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cjd.oe, ti.c("advancements.story.upgrade_tools.title"), ti.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(cjd.oe))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cjd.nQ, ti.c("advancements.story.smelt_iron.title"), ti.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(cjd.nQ))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cjd.oo, ti.c("advancements.story.iron_tools.title"), ti.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(cjd.oo))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cjd.nK, ti.c("advancements.story.mine_diamond.title"), ti.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(cjd.nK))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cjd.pM, ti.c("advancements.story.lava_bucket.title"), ti.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(cjd.pM))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cjd.oT, ti.c("advancements.story.obtain_armor.title"), ti.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(cjd.oS))
         .a("iron_chestplate", bz.a.a(cjd.oT))
         .a("iron_leggings", bz.a.a(cjd.oU))
         .a("iron_boots", bz.a.a(cjd.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cjd.tC, ti.c("advancements.story.enchant_item.title"), ti.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(csr.co, ti.c("advancements.story.form_obsidian.title"), ti.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(csr.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cjd.uy, ti.c("advancements.story.deflect_arrow.title"), ti.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(apq.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cjd.oX, ti.c("advancements.story.shiny_gear.title"), ti.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(cjd.oW))
         .a("diamond_chestplate", bz.a.a(cjd.oX))
         .a("diamond_leggings", bz.a.a(cjd.oY))
         .a("diamond_boots", bz.a.a(cjd.oZ))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cjd.nE, ti.c("advancements.story.enter_the_nether.title"), ti.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(cpq.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cjd.pm,
            ti.c("advancements.story.cure_zombie_villager.title"),
            ti.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cjd.rD, ti.c("advancements.story.follow_ender_eye.title"), ti.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dux.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(csr.fz, ti.c("advancements.story.enter_the_end.title"), ti.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(cpq.j))
         .a($$1, "story/enter_the_end");
   }
}
