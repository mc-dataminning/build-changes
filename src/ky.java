import java.util.function.Consumer;

public class ky implements kq {
   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyu.i,
            vq.c("advancements.story.root.title"),
            vq.c("advancements.story.root.description"),
            new aiy("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(cyu.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpg.oM, vq.c("advancements.story.mine_stone.title"), vq.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cc.a.a().a(aui.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cpg.oR, vq.c("advancements.story.upgrade_tools.title"), vq.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(cpg.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cpg.oD, vq.c("advancements.story.smelt_iron.title"), vq.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(cpg.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpg.pb, vq.c("advancements.story.iron_tools.title"), vq.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(cpg.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cpg.ox, vq.c("advancements.story.mine_diamond.title"), vq.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(cpg.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cpg.qz, vq.c("advancements.story.lava_bucket.title"), vq.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(cpg.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cpg.pG, vq.c("advancements.story.obtain_armor.title"), vq.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(cpg.pF))
         .a("iron_chestplate", ca.a.a(cpg.pG))
         .a("iron_leggings", ca.a.a(cpg.pH))
         .a("iron_boots", ca.a.a(cpg.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cpg.us, vq.c("advancements.story.enchant_item.title"), vq.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cyu.co, vq.c("advancements.story.form_obsidian.title"), vq.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(cyu.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cpg.vo, vq.c("advancements.story.deflect_arrow.title"), vq.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dd.a(auc.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cpg.pK, vq.c("advancements.story.shiny_gear.title"), vq.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(cpg.pJ))
         .a("diamond_chestplate", ca.a.a(cpg.pK))
         .a("diamond_leggings", ca.a.a(cpg.pL))
         .a("diamond_boots", ca.a.a(cpg.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cpg.or, vq.c("advancements.story.enter_the_nether.title"), vq.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(cvr.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cpg.pZ,
            vq.c("advancements.story.cure_zombie_villager.title"),
            vq.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", be.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cpg.sr, vq.c("advancements.story.follow_ender_eye.title"), vq.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", ct.a.a(ck.a.c(ebf.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cyu.fz, vq.c("advancements.story.enter_the_end.title"), vq.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(cvr.j))
         .a($$1, "story/enter_the_end");
   }
}
