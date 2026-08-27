import java.util.function.Consumer;

public class mb implements ls {
   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfe.j,
            xe.c("advancements.story.root.title"),
            xe.c("advancements.story.root.description"),
            new akt("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", cc.a.a(dfe.dl))
         .a($$1, "story/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cuk.qg, xe.c("advancements.story.mine_stone.title"), xe.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", cc.a.a(ci.a.a().a(awm.aZ)))
         .a($$1, "story/mine_stone");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cuk.ql, xe.c("advancements.story.upgrade_tools.title"), xe.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", cc.a.a(cuk.ql))
         .a($$1, "story/upgrade_tools");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cuk.pX, xe.c("advancements.story.smelt_iron.title"), xe.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", cc.a.a(cuk.pX))
         .a($$1, "story/smelt_iron");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cuk.qv, xe.c("advancements.story.iron_tools.title"), xe.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", cc.a.a(cuk.qv))
         .a($$1, "story/iron_tools");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cuk.pO, xe.c("advancements.story.mine_diamond.title"), xe.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", cc.a.a(cuk.pO))
         .a($$1, "story/mine_diamond");
      ag $$8 = af.a.a()
         .a($$5)
         .a(cuk.rX, xe.c("advancements.story.lava_bucket.title"), xe.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", cc.a.a(cuk.rX))
         .a($$1, "story/lava_bucket");
      ag $$9 = af.a.a()
         .a($$5)
         .a(cuk.ra, xe.c("advancements.story.obtain_armor.title"), xe.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", cc.a.a(cuk.qZ))
         .a("iron_chestplate", cc.a.a(cuk.ra))
         .a("iron_leggings", cc.a.a(cuk.rb))
         .a("iron_boots", cc.a.a(cuk.rc))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$7)
         .a(cuk.wh, xe.c("advancements.story.enchant_item.title"), xe.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bm.a.b())
         .a($$1, "story/enchant_item");
      ag $$10 = af.a.a()
         .a($$8)
         .a(dfe.cZ, xe.c("advancements.story.form_obsidian.title"), xe.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", cc.a.a(dfe.cZ))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$9)
         .a(cuk.xd, xe.c("advancements.story.deflect_arrow.title"), xe.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", br.a.a(bg.a.a().a(bh.a.a().a(dq.a(awg.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$7)
         .a(cuk.re, xe.c("advancements.story.shiny_gear.title"), xe.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", cc.a.a(cuk.rd))
         .a("diamond_chestplate", cc.a.a(cuk.re))
         .a("diamond_leggings", cc.a.a(cuk.rf))
         .a("diamond_boots", cc.a.a(cuk.rg))
         .a($$1, "story/shiny_gear");
      ag $$11 = af.a.a()
         .a($$10)
         .a(cuk.pI, xe.c("advancements.story.enter_the_nether.title"), xe.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dca.i))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$11)
         .a(
            cuk.rv,
            xe.c("advancements.story.cure_zombie_villager.title"),
            xe.c("advancements.story.cure_zombie_villager.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bf.a.b())
         .a($$1, "story/cure_zombie_villager");
      ag $$12 = af.a.a()
         .a($$11)
         .a(cuk.tP, xe.c("advancements.story.follow_ender_eye.title"), xe.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", db.a.a(cs.a.b($$0.b(li.aJ).b(ejn.l))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$12)
         .a(dfe.gr, xe.c("advancements.story.enter_the_end.title"), xe.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dca.j))
         .a($$1, "story/enter_the_end");
   }
}
