import java.util.function.Consumer;

public class lx implements lp {
   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dec.i,
            wx.c("advancements.story.root.title"),
            wx.c("advancements.story.root.description"),
            new akn("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", cb.a.a(dec.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ctt.oN, wx.c("advancements.story.mine_stone.title"), wx.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", cb.a.a(ch.a.a().a(awf.aY)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ctt.oS, wx.c("advancements.story.upgrade_tools.title"), wx.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", cb.a.a(ctt.oS))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(ctt.oE, wx.c("advancements.story.smelt_iron.title"), wx.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", cb.a.a(ctt.oE))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(ctt.pc, wx.c("advancements.story.iron_tools.title"), wx.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", cb.a.a(ctt.pc))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(ctt.oy, wx.c("advancements.story.mine_diamond.title"), wx.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", cb.a.a(ctt.oy))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(ctt.qA, wx.c("advancements.story.lava_bucket.title"), wx.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", cb.a.a(ctt.qA))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(ctt.pH, wx.c("advancements.story.obtain_armor.title"), wx.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", cb.a.a(ctt.pG))
         .a("iron_chestplate", cb.a.a(ctt.pH))
         .a("iron_leggings", cb.a.a(ctt.pI))
         .a("iron_boots", cb.a.a(ctt.pJ))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(ctt.uw, wx.c("advancements.story.enchant_item.title"), wx.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dec.co, wx.c("advancements.story.form_obsidian.title"), wx.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", cb.a.a(dec.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(ctt.vs, wx.c("advancements.story.deflect_arrow.title"), wx.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dn.a(avz.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(ctt.pL, wx.c("advancements.story.shiny_gear.title"), wx.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", cb.a.a(ctt.pK))
         .a("diamond_chestplate", cb.a.a(ctt.pL))
         .a("diamond_leggings", cb.a.a(ctt.pM))
         .a("diamond_boots", cb.a.a(ctt.pN))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(ctt.os, wx.c("advancements.story.enter_the_nether.title"), wx.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(daz.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            ctt.qa,
            wx.c("advancements.story.cure_zombie_villager.title"),
            wx.c("advancements.story.cure_zombie_villager.description"),
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
         .a(ctt.ss, wx.c("advancements.story.follow_ender_eye.title"), wx.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", da.a.a(cr.a.b($$0.b(lf.aJ).b(ehf.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dec.fz, wx.c("advancements.story.enter_the_end.title"), wx.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(daz.j))
         .a($$1, "story/enter_the_end");
   }
}
