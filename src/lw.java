import java.util.function.Consumer;

public class lw implements lo {
   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ddg.i,
            wu.c("advancements.story.root.title"),
            wu.c("advancements.story.root.description"),
            new akh("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", cb.a.a(ddg.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctc.oN, wu.c("advancements.story.mine_stone.title"), wu.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", cb.a.a(ch.a.a().a(avz.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ctc.oS, wu.c("advancements.story.upgrade_tools.title"), wu.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", cb.a.a(ctc.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(ctc.oE, wu.c("advancements.story.smelt_iron.title"), wu.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", cb.a.a(ctc.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctc.pc, wu.c("advancements.story.iron_tools.title"), wu.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", cb.a.a(ctc.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(ctc.oy, wu.c("advancements.story.mine_diamond.title"), wu.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", cb.a.a(ctc.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(ctc.qA, wu.c("advancements.story.lava_bucket.title"), wu.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", cb.a.a(ctc.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(ctc.pH, wu.c("advancements.story.obtain_armor.title"), wu.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", cb.a.a(ctc.pG))
         .a("iron_chestplate", cb.a.a(ctc.pH))
         .a("iron_leggings", cb.a.a(ctc.pI))
         .a("iron_boots", cb.a.a(ctc.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(ctc.uw, wu.c("advancements.story.enchant_item.title"), wu.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(ddg.co, wu.c("advancements.story.form_obsidian.title"), wu.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", cb.a.a(ddg.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(ctc.vs, wu.c("advancements.story.deflect_arrow.title"), wu.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dm.a(avt.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(ctc.pL, wu.c("advancements.story.shiny_gear.title"), wu.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", cb.a.a(ctc.pK))
         .a("diamond_chestplate", cb.a.a(ctc.pL))
         .a("diamond_leggings", cb.a.a(ctc.pM))
         .a("diamond_boots", cb.a.a(ctc.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(ctc.os, wu.c("advancements.story.enter_the_nether.title"), wu.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(dad.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            ctc.qa,
            wu.c("advancements.story.cure_zombie_villager.title"),
            wu.c("advancements.story.cure_zombie_villager.description"),
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
         .a(ctc.ss, wu.c("advancements.story.follow_ender_eye.title"), wu.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", da.a.a(cr.a.b($$0.b(le.aJ).b(egj.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(ddg.fz, wu.c("advancements.story.enter_the_end.title"), wu.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(dad.j))
         .a($$1, "story/enter_the_end");
   }
}
