import java.util.function.Consumer;

public class ks implements km {
   @Override
   public void a(ih.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwb.i,
            vb.c("advancements.story.root.title"),
            vb.c("advancements.story.root.description"),
            new agt("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", by.a.a(cwb.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmk.oK, vb.c("advancements.story.mine_stone.title"), vb.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", by.a.a(ca.a.a().a(arz.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cmk.oP, vb.c("advancements.story.upgrade_tools.title"), vb.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", by.a.a(cmk.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cmk.oB, vb.c("advancements.story.smelt_iron.title"), vb.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", by.a.a(cmk.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmk.oZ, vb.c("advancements.story.iron_tools.title"), vb.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", by.a.a(cmk.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cmk.ov, vb.c("advancements.story.mine_diamond.title"), vb.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", by.a.a(cmk.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cmk.qx, vb.c("advancements.story.lava_bucket.title"), vb.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", by.a.a(cmk.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cmk.pE, vb.c("advancements.story.obtain_armor.title"), vb.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", by.a.a(cmk.pD))
         .a("iron_chestplate", by.a.a(cmk.pE))
         .a("iron_leggings", by.a.a(cmk.pF))
         .a("iron_boots", by.a.a(cmk.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cmk.up, vb.c("advancements.story.enchant_item.title"), vb.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bj.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cwb.co, vb.c("advancements.story.form_obsidian.title"), vb.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", by.a.a(cwb.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cmk.vl, vb.c("advancements.story.deflect_arrow.title"), vb.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bo.a.a(be.a.a().a(bf.a.a().a(db.a(art.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cmk.pI, vb.c("advancements.story.shiny_gear.title"), vb.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", by.a.a(cmk.pH))
         .a("diamond_chestplate", by.a.a(cmk.pI))
         .a("diamond_leggings", by.a.a(cmk.pJ))
         .a("diamond_boots", by.a.a(cmk.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cmk.op, vb.c("advancements.story.enter_the_nether.title"), vb.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ax.a.a(csy.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cmk.pX,
            vb.c("advancements.story.cure_zombie_villager.title"),
            vb.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cmk.sp, vb.c("advancements.story.follow_ender_eye.title"), vb.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cr.a.a(ci.a.c(dyi.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cwb.fz, vb.c("advancements.story.enter_the_end.title"), vb.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ax.a.a(csy.j))
         .a($$1, "story/enter_the_end");
   }
}
