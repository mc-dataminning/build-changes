import java.util.function.Consumer;

public class ms implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<cxd> $$2 = $$0.d(mc.K);
      ai $$3 = ah.a.a()
         .a(
            dkg.i,
            wp.c("advancements.story.root.title"),
            wp.c("advancements.story.root.description"),
            aku.b("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(dkg.cI))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(cxl.pv, wp.c("advancements.story.mine_stone.title"), wp.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cv.a.a().a($$2, awy.bc)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cxl.pA, wp.c("advancements.story.upgrade_tools.title"), wp.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(cxl.pA))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(cxl.pm, wp.c("advancements.story.smelt_iron.title"), wp.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(cxl.pm))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(cxl.pK, wp.c("advancements.story.iron_tools.title"), wp.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(cxl.pK))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(cxl.pg, wp.c("advancements.story.mine_diamond.title"), wp.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(cxl.pg))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(cxl.rj, wp.c("advancements.story.lava_bucket.title"), wp.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(cxl.rj))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(cxl.qo, wp.c("advancements.story.obtain_armor.title"), wp.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(cxl.qn))
         .a("iron_chestplate", cj.a.a(cxl.qo))
         .a("iron_leggings", cj.a.a(cxl.qp))
         .a("iron_boots", cj.a.a(cxl.qq))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(cxl.vx, wp.c("advancements.story.enchant_item.title"), wp.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dkg.cv, wp.c("advancements.story.form_obsidian.title"), wp.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(dkg.cv))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(cxl.wu, wp.c("advancements.story.deflect_arrow.title"), wp.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(eh.a(awr.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(cxl.qs, wp.c("advancements.story.shiny_gear.title"), wp.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(cxl.qr))
         .a("diamond_chestplate", cj.a.a(cxl.qs))
         .a("diamond_leggings", cj.a.a(cxl.qt))
         .a("diamond_boots", cj.a.a(cxl.qu))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(cxl.oZ, wp.c("advancements.story.enter_the_nether.title"), wp.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dgz.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            cxl.qH,
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
         .a(cxl.tr, wp.c("advancements.story.follow_ender_eye.title"), wp.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dt.a.a(di.a.b($$0.d(mc.aW).b(eod.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(dkg.fU, wp.c("advancements.story.enter_the_end.title"), wp.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dgz.k))
         .a($$1, "story/enter_the_end");
   }
}
