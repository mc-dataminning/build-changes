import java.util.function.Consumer;

public class mr implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<cxc> $$2 = $$0.d(mb.K);
      ah $$3 = ag.a.a()
         .a(
            dkf.i,
            xk.c("advancements.story.root.title"),
            xk.c("advancements.story.root.description"),
            alp.b("textures/gui/advancements/backgrounds/stone.png"),
            an.a,
            false,
            false,
            false
         )
         .a("crafting_table", ci.a.a(dkf.cI))
         .a($$1, "story/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(cxk.pt, xk.c("advancements.story.mine_stone.title"), xk.c("advancements.story.mine_stone.description"), null, an.a, true, true, false)
         .a("get_stone", ci.a.a(cu.a.a().a($$2, axt.be)))
         .a($$1, "story/mine_stone");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cxk.py, xk.c("advancements.story.upgrade_tools.title"), xk.c("advancements.story.upgrade_tools.description"), null, an.a, true, true, false)
         .a("stone_pickaxe", ci.a.a(cxk.py))
         .a($$1, "story/upgrade_tools");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(cxk.pk, xk.c("advancements.story.smelt_iron.title"), xk.c("advancements.story.smelt_iron.description"), null, an.a, true, true, false)
         .a("iron", ci.a.a(cxk.pk))
         .a($$1, "story/smelt_iron");
      ah $$7 = ag.a.a()
         .a($$6)
         .a(cxk.pI, xk.c("advancements.story.iron_tools.title"), xk.c("advancements.story.iron_tools.description"), null, an.a, true, true, false)
         .a("iron_pickaxe", ci.a.a(cxk.pI))
         .a($$1, "story/iron_tools");
      ah $$8 = ag.a.a()
         .a($$7)
         .a(cxk.pe, xk.c("advancements.story.mine_diamond.title"), xk.c("advancements.story.mine_diamond.description"), null, an.a, true, true, false)
         .a("diamond", ci.a.a(cxk.pe))
         .a($$1, "story/mine_diamond");
      ah $$9 = ag.a.a()
         .a($$6)
         .a(cxk.rh, xk.c("advancements.story.lava_bucket.title"), xk.c("advancements.story.lava_bucket.description"), null, an.a, true, true, false)
         .a("lava_bucket", ci.a.a(cxk.rh))
         .a($$1, "story/lava_bucket");
      ah $$10 = ag.a.a()
         .a($$6)
         .a(cxk.qm, xk.c("advancements.story.obtain_armor.title"), xk.c("advancements.story.obtain_armor.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("iron_helmet", ci.a.a(cxk.ql))
         .a("iron_chestplate", ci.a.a(cxk.qm))
         .a("iron_leggings", ci.a.a(cxk.qn))
         .a("iron_boots", ci.a.a(cxk.qo))
         .a($$1, "story/obtain_armor");
      ag.a.a()
         .a($$8)
         .a(cxk.vv, xk.c("advancements.story.enchant_item.title"), xk.c("advancements.story.enchant_item.description"), null, an.a, true, true, false)
         .a("enchanted_item", bq.a.b())
         .a($$1, "story/enchant_item");
      ah $$11 = ag.a.a()
         .a($$9)
         .a(dkf.cv, xk.c("advancements.story.form_obsidian.title"), xk.c("advancements.story.form_obsidian.description"), null, an.a, true, true, false)
         .a("obsidian", ci.a.a(dkf.cv))
         .a($$1, "story/form_obsidian");
      ag.a.a()
         .a($$10)
         .a(cxk.ws, xk.c("advancements.story.deflect_arrow.title"), xk.c("advancements.story.deflect_arrow.description"), null, an.a, true, true, false)
         .a("deflected_projectile", bv.a.a(bk.a.a().a(bl.a.a().a(eg.a(axm.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ag.a.a()
         .a($$8)
         .a(cxk.qq, xk.c("advancements.story.shiny_gear.title"), xk.c("advancements.story.shiny_gear.description"), null, an.a, true, true, false)
         .a(ak.a.b)
         .a("diamond_helmet", ci.a.a(cxk.qp))
         .a("diamond_chestplate", ci.a.a(cxk.qq))
         .a("diamond_leggings", ci.a.a(cxk.qr))
         .a("diamond_boots", ci.a.a(cxk.qs))
         .a($$1, "story/shiny_gear");
      ah $$12 = ag.a.a()
         .a($$11)
         .a(cxk.oX, xk.c("advancements.story.enter_the_nether.title"), xk.c("advancements.story.enter_the_nether.description"), null, an.a, true, true, false)
         .a("entered_nether", ba.a.a(dgz.j))
         .a($$1, "story/enter_the_nether");
      ag.a.a()
         .a($$12)
         .a(
            cxk.qF,
            xk.c("advancements.story.cure_zombie_villager.title"),
            xk.c("advancements.story.cure_zombie_villager.description"),
            null,
            an.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bj.a.b())
         .a($$1, "story/cure_zombie_villager");
      ah $$13 = ag.a.a()
         .a($$12)
         .a(cxk.tp, xk.c("advancements.story.follow_ender_eye.title"), xk.c("advancements.story.follow_ender_eye.description"), null, an.a, true, true, false)
         .a("in_stronghold", ds.a.a(dh.a.b($$0.d(mb.aU).b(enx.k))))
         .a($$1, "story/follow_ender_eye");
      ag.a.a()
         .a($$13)
         .a(dkf.fU, xk.c("advancements.story.enter_the_end.title"), xk.c("advancements.story.enter_the_end.description"), null, an.a, true, true, false)
         .a("entered_end", ba.a.a(dgz.k))
         .a($$1, "story/enter_the_end");
   }
}
