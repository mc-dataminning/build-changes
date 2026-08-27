import java.util.function.Consumer;

public class kt implements kn {
   @Override
   public void a(ii.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvh.i,
            uv.c("advancements.story.root.title"),
            uv.c("advancements.story.root.description"),
            new agm("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(cvh.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(clr.oK, uv.c("advancements.story.mine_stone.title"), uv.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(ars.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(clr.oP, uv.c("advancements.story.upgrade_tools.title"), uv.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(clr.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(clr.oB, uv.c("advancements.story.smelt_iron.title"), uv.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(clr.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(clr.oZ, uv.c("advancements.story.iron_tools.title"), uv.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(clr.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(clr.ov, uv.c("advancements.story.mine_diamond.title"), uv.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(clr.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(clr.qx, uv.c("advancements.story.lava_bucket.title"), uv.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(clr.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(clr.pE, uv.c("advancements.story.obtain_armor.title"), uv.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(clr.pD))
         .a("iron_chestplate", bz.a.a(clr.pE))
         .a("iron_leggings", bz.a.a(clr.pF))
         .a("iron_boots", bz.a.a(clr.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(clr.uo, uv.c("advancements.story.enchant_item.title"), uv.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cvh.co, uv.c("advancements.story.form_obsidian.title"), uv.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(cvh.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(clr.vk, uv.c("advancements.story.deflect_arrow.title"), uv.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(arm.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(clr.pI, uv.c("advancements.story.shiny_gear.title"), uv.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(clr.pH))
         .a("diamond_chestplate", bz.a.a(clr.pI))
         .a("diamond_leggings", bz.a.a(clr.pJ))
         .a("diamond_boots", bz.a.a(clr.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(clr.op, uv.c("advancements.story.enter_the_nether.title"), uv.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(csf.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            clr.pX,
            uv.c("advancements.story.cure_zombie_villager.title"),
            uv.c("advancements.story.cure_zombie_villager.description"),
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
         .a(clr.sp, uv.c("advancements.story.follow_ender_eye.title"), uv.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dxg.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cvh.fz, uv.c("advancements.story.enter_the_end.title"), uv.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(csf.j))
         .a($$1, "story/enter_the_end");
   }
}
