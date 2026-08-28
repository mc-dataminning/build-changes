import java.util.function.Consumer;

public class ms implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<cwk> $$2 = $$0.d(mc.K);
      ai $$3 = ah.a.a()
         .a(
            djn.i,
            wp.c("advancements.story.root.title"),
            wp.c("advancements.story.root.description"),
            akv.b("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(djn.cI))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(cws.pt, wp.c("advancements.story.mine_stone.title"), wp.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cv.a.a().a($$2, awy.bc)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cws.py, wp.c("advancements.story.upgrade_tools.title"), wp.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(cws.py))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cws.pk, wp.c("advancements.story.smelt_iron.title"), wp.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(cws.pk))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cws.pI, wp.c("advancements.story.iron_tools.title"), wp.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(cws.pI))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(cws.pe, wp.c("advancements.story.mine_diamond.title"), wp.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(cws.pe))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(cws.rh, wp.c("advancements.story.lava_bucket.title"), wp.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(cws.rh))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(cws.qm, wp.c("advancements.story.obtain_armor.title"), wp.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(cws.ql))
         .a("iron_chestplate", cj.a.a(cws.qm))
         .a("iron_leggings", cj.a.a(cws.qn))
         .a("iron_boots", cj.a.a(cws.qo))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(cws.vv, wp.c("advancements.story.enchant_item.title"), wp.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(djn.cv, wp.c("advancements.story.form_obsidian.title"), wp.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(djn.cv))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(cws.ws, wp.c("advancements.story.deflect_arrow.title"), wp.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(cws.qq, wp.c("advancements.story.shiny_gear.title"), wp.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(cws.qp))
         .a("diamond_chestplate", cj.a.a(cws.qq))
         .a("diamond_leggings", cj.a.a(cws.qr))
         .a("diamond_boots", cj.a.a(cws.qs))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(cws.oX, wp.c("advancements.story.enter_the_nether.title"), wp.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dgh.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            cws.qF,
            wp.c("advancements.story.cure_zombie_villager.title"),
            wp.c("advancements.story.cure_zombie_villager.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bk.a.b())
         .a($$1, "story/cure_zombie_villager");
      ai $$13 = ah.a.a()
         .a($$12)
         .a(cws.tp, wp.c("advancements.story.follow_ender_eye.title"), wp.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dt.a.a(di.a.b($$0.d(mc.aU).b(enf.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(djn.fU, wp.c("advancements.story.enter_the_end.title"), wp.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dgh.k))
         .a($$1, "story/enter_the_end");
   }
}
