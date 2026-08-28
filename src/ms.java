import java.util.function.Consumer;

public class ms implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<cwl> $$2 = $$0.d(mc.K);
      ai $$3 = ah.a.a()
         .a(
            djo.i,
            wo.c("advancements.story.root.title"),
            wo.c("advancements.story.root.description"),
            aku.b("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(djo.cI))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(cwt.pt, wo.c("advancements.story.mine_stone.title"), wo.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cv.a.a().a($$2, awy.bc)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cwt.py, wo.c("advancements.story.upgrade_tools.title"), wo.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(cwt.py))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cwt.pk, wo.c("advancements.story.smelt_iron.title"), wo.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(cwt.pk))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cwt.pI, wo.c("advancements.story.iron_tools.title"), wo.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(cwt.pI))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(cwt.pe, wo.c("advancements.story.mine_diamond.title"), wo.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(cwt.pe))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(cwt.rh, wo.c("advancements.story.lava_bucket.title"), wo.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(cwt.rh))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(cwt.qm, wo.c("advancements.story.obtain_armor.title"), wo.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(cwt.ql))
         .a("iron_chestplate", cj.a.a(cwt.qm))
         .a("iron_leggings", cj.a.a(cwt.qn))
         .a("iron_boots", cj.a.a(cwt.qo))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(cwt.vv, wo.c("advancements.story.enchant_item.title"), wo.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(djo.cv, wo.c("advancements.story.form_obsidian.title"), wo.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(djo.cv))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(cwt.ws, wo.c("advancements.story.deflect_arrow.title"), wo.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(cwt.qq, wo.c("advancements.story.shiny_gear.title"), wo.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(cwt.qp))
         .a("diamond_chestplate", cj.a.a(cwt.qq))
         .a("diamond_leggings", cj.a.a(cwt.qr))
         .a("diamond_boots", cj.a.a(cwt.qs))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(cwt.oX, wo.c("advancements.story.enter_the_nether.title"), wo.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dgi.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            cwt.qF,
            wo.c("advancements.story.cure_zombie_villager.title"),
            wo.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cwt.tp, wo.c("advancements.story.follow_ender_eye.title"), wo.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dt.a.a(di.a.b($$0.d(mc.aU).b(eng.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(djo.fU, wo.c("advancements.story.enter_the_end.title"), wo.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dgi.k))
         .a($$1, "story/enter_the_end");
   }
}
