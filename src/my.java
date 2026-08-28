import java.util.function.Consumer;

public class my implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<dag> $$2 = $$0.e(mi.K);
      aj $$3 = ai.a.a()
         .a(
            dnq.i,
            xg.c("advancements.story.root.title"),
            xg.c("advancements.story.root.description"),
            alr.b("gui/advancements/backgrounds/stone"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", cl.a.a(dnq.cL))
         .a($$1, "story/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dao.pC, xg.c("advancements.story.mine_stone.title"), xg.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", cl.a.a(cn.a.a().a($$2, axv.be)))
         .a($$1, "story/mine_stone");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dao.pH, xg.c("advancements.story.upgrade_tools.title"), xg.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", cl.a.a(dao.pH))
         .a($$1, "story/upgrade_tools");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dao.pt, xg.c("advancements.story.smelt_iron.title"), xg.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", cl.a.a(dao.pt))
         .a($$1, "story/smelt_iron");
      aj $$7 = ai.a.a()
         .a($$6)
         .a(dao.pR, xg.c("advancements.story.iron_tools.title"), xg.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", cl.a.a(dao.pR))
         .a($$1, "story/iron_tools");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dao.pn, xg.c("advancements.story.mine_diamond.title"), xg.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", cl.a.a(dao.pn))
         .a($$1, "story/mine_diamond");
      aj $$9 = ai.a.a()
         .a($$6)
         .a(dao.rq, xg.c("advancements.story.lava_bucket.title"), xg.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", cl.a.a(dao.rq))
         .a($$1, "story/lava_bucket");
      aj $$10 = ai.a.a()
         .a($$6)
         .a(dao.qv, xg.c("advancements.story.obtain_armor.title"), xg.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("iron_helmet", cl.a.a(dao.qu))
         .a("iron_chestplate", cl.a.a(dao.qv))
         .a("iron_leggings", cl.a.a(dao.qw))
         .a("iron_boots", cl.a.a(dao.qx))
         .a($$1, "story/obtain_armor");
      ai.a.a()
         .a($$8)
         .a(dao.vG, xg.c("advancements.story.enchant_item.title"), xg.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bt.a.b())
         .a($$1, "story/enchant_item");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dnq.cy, xg.c("advancements.story.form_obsidian.title"), xg.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", cl.a.a(dnq.cy))
         .a($$1, "story/form_obsidian");
      ai.a.a()
         .a($$10)
         .a(dao.wD, xg.c("advancements.story.deflect_arrow.title"), xg.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", by.a.a(bm.a.a().a(bn.a.a().a(du.a(axo.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ai.a.a()
         .a($$8)
         .a(dao.qz, xg.c("advancements.story.shiny_gear.title"), xg.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("diamond_helmet", cl.a.a(dao.qy))
         .a("diamond_chestplate", cl.a.a(dao.qz))
         .a("diamond_leggings", cl.a.a(dao.qA))
         .a("diamond_boots", cl.a.a(dao.qB))
         .a($$1, "story/shiny_gear");
      aj $$12 = ai.a.a()
         .a($$11)
         .a(dao.pg, xg.c("advancements.story.enter_the_nether.title"), xg.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", bc.a.a(dkj.j))
         .a($$1, "story/enter_the_nether");
      ai.a.a()
         .a($$12)
         .a(
            dao.qO,
            xg.c("advancements.story.cure_zombie_villager.title"),
            xg.c("advancements.story.cure_zombie_villager.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bl.a.b())
         .a($$1, "story/cure_zombie_villager");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dao.tA, xg.c("advancements.story.follow_ender_eye.title"), xg.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", df.a.a(cv.a.b($$0.e(mi.be).b(esh.k))))
         .a($$1, "story/follow_ender_eye");
      ai.a.a()
         .a($$13)
         .a(dnq.fY, xg.c("advancements.story.enter_the_end.title"), xg.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", bc.a.a(dkj.k))
         .a($$1, "story/enter_the_end");
   }
}
