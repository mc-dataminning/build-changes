import java.util.function.Consumer;

public class kw implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cxa.i,
            vg.c("advancements.story.root.title"),
            vg.c("advancements.story.root.description"),
            new ahh("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", by.a.a(cxa.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnj.oM, vg.c("advancements.story.mine_stone.title"), vg.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", by.a.a(ca.a.a().a(asq.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cnj.oR, vg.c("advancements.story.upgrade_tools.title"), vg.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", by.a.a(cnj.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cnj.oD, vg.c("advancements.story.smelt_iron.title"), vg.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", by.a.a(cnj.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cnj.pb, vg.c("advancements.story.iron_tools.title"), vg.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", by.a.a(cnj.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cnj.ox, vg.c("advancements.story.mine_diamond.title"), vg.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", by.a.a(cnj.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cnj.qz, vg.c("advancements.story.lava_bucket.title"), vg.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", by.a.a(cnj.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cnj.pG, vg.c("advancements.story.obtain_armor.title"), vg.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", by.a.a(cnj.pF))
         .a("iron_chestplate", by.a.a(cnj.pG))
         .a("iron_leggings", by.a.a(cnj.pH))
         .a("iron_boots", by.a.a(cnj.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cnj.us, vg.c("advancements.story.enchant_item.title"), vg.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bj.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cxa.co, vg.c("advancements.story.form_obsidian.title"), vg.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", by.a.a(cxa.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cnj.vo, vg.c("advancements.story.deflect_arrow.title"), vg.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bo.a.a(be.a.a().a(bf.a.a().a(db.a(ask.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cnj.pK, vg.c("advancements.story.shiny_gear.title"), vg.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", by.a.a(cnj.pJ))
         .a("diamond_chestplate", by.a.a(cnj.pK))
         .a("diamond_leggings", by.a.a(cnj.pL))
         .a("diamond_boots", by.a.a(cnj.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cnj.or, vg.c("advancements.story.enter_the_nether.title"), vg.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ax.a.a(ctx.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cnj.pZ,
            vg.c("advancements.story.cure_zombie_villager.title"),
            vg.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bd.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cnj.sr, vg.c("advancements.story.follow_ender_eye.title"), vg.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cr.a.a(ci.a.c(dzi.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cxa.fz, vg.c("advancements.story.enter_the_end.title"), vg.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ax.a.a(ctx.j))
         .a($$1, "story/enter_the_end");
   }
}
