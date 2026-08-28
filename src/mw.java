import java.util.function.Consumer;

public class mw implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<cyz> $$2 = $$0.e(mg.K);
      ai $$3 = ah.a.a()
         .a(
            dmh.i,
            wy.c("advancements.story.root.title"),
            wy.c("advancements.story.root.description"),
            alg.b("gui/advancements/backgrounds/stone"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", cj.a.a(dmh.cL))
         .a($$1, "story/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(czh.pC, wy.c("advancements.story.mine_stone.title"), wy.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", cj.a.a(cl.a.a().a($$2, axk.bd)))
         .a($$1, "story/mine_stone");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(czh.pH, wy.c("advancements.story.upgrade_tools.title"), wy.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", cj.a.a(czh.pH))
         .a($$1, "story/upgrade_tools");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(czh.pt, wy.c("advancements.story.smelt_iron.title"), wy.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", cj.a.a(czh.pt))
         .a($$1, "story/smelt_iron");
      ai $$7 = ah.a.a()
         .a($$6)
         .a(czh.pR, wy.c("advancements.story.iron_tools.title"), wy.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", cj.a.a(czh.pR))
         .a($$1, "story/iron_tools");
      ai $$8 = ah.a.a()
         .a($$7)
         .a(czh.pn, wy.c("advancements.story.mine_diamond.title"), wy.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", cj.a.a(czh.pn))
         .a($$1, "story/mine_diamond");
      ai $$9 = ah.a.a()
         .a($$6)
         .a(czh.rq, wy.c("advancements.story.lava_bucket.title"), wy.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", cj.a.a(czh.rq))
         .a($$1, "story/lava_bucket");
      ai $$10 = ah.a.a()
         .a($$6)
         .a(czh.qv, wy.c("advancements.story.obtain_armor.title"), wy.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("iron_helmet", cj.a.a(czh.qu))
         .a("iron_chestplate", cj.a.a(czh.qv))
         .a("iron_leggings", cj.a.a(czh.qw))
         .a("iron_boots", cj.a.a(czh.qx))
         .a($$1, "story/obtain_armor");
      ah.a.a()
         .a($$8)
         .a(czh.vG, wy.c("advancements.story.enchant_item.title"), wy.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", br.a.b())
         .a($$1, "story/enchant_item");
      ai $$11 = ah.a.a()
         .a($$9)
         .a(dmh.cy, wy.c("advancements.story.form_obsidian.title"), wy.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", cj.a.a(dmh.cy))
         .a($$1, "story/form_obsidian");
      ah.a.a()
         .a($$10)
         .a(czh.wD, wy.c("advancements.story.deflect_arrow.title"), wy.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bw.a.a(bl.a.a().a(bm.a.a().a(ds.a(axd.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ah.a.a()
         .a($$8)
         .a(czh.qz, wy.c("advancements.story.shiny_gear.title"), wy.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(al.a.b)
         .a("diamond_helmet", cj.a.a(czh.qy))
         .a("diamond_chestplate", cj.a.a(czh.qz))
         .a("diamond_leggings", cj.a.a(czh.qA))
         .a("diamond_boots", cj.a.a(czh.qB))
         .a($$1, "story/shiny_gear");
      ai $$12 = ah.a.a()
         .a($$11)
         .a(czh.pg, wy.c("advancements.story.enter_the_nether.title"), wy.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", bb.a.a(dja.j))
         .a($$1, "story/enter_the_nether");
      ah.a.a()
         .a($$12)
         .a(
            czh.qO,
            wy.c("advancements.story.cure_zombie_villager.title"),
            wy.c("advancements.story.cure_zombie_villager.description"),
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
         .a(czh.tA, wy.c("advancements.story.follow_ender_eye.title"), wy.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", dd.a.a(ct.a.b($$0.e(mg.be).b(eqv.k))))
         .a($$1, "story/follow_ender_eye");
      ah.a.a()
         .a($$13)
         .a(dmh.fY, wy.c("advancements.story.enter_the_end.title"), wy.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", bb.a.a(dja.k))
         .a($$1, "story/enter_the_end");
   }
}
