import java.util.function.Consumer;

public class my implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<czw> $$2 = $$0.e(mi.K);
      aj $$3 = ai.a.a()
         .a(
            dng.i,
            xc.c("advancements.story.root.title"),
            xc.c("advancements.story.root.description"),
            alk.b("gui/advancements/backgrounds/stone"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", cl.a.a(dng.cL))
         .a($$1, "story/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dae.pC, xc.c("advancements.story.mine_stone.title"), xc.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", cl.a.a(cn.a.a().a($$2, axo.be)))
         .a($$1, "story/mine_stone");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dae.pH, xc.c("advancements.story.upgrade_tools.title"), xc.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", cl.a.a(dae.pH))
         .a($$1, "story/upgrade_tools");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dae.pt, xc.c("advancements.story.smelt_iron.title"), xc.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", cl.a.a(dae.pt))
         .a($$1, "story/smelt_iron");
      aj $$7 = ai.a.a()
         .a($$6)
         .a(dae.pR, xc.c("advancements.story.iron_tools.title"), xc.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", cl.a.a(dae.pR))
         .a($$1, "story/iron_tools");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dae.pn, xc.c("advancements.story.mine_diamond.title"), xc.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", cl.a.a(dae.pn))
         .a($$1, "story/mine_diamond");
      aj $$9 = ai.a.a()
         .a($$6)
         .a(dae.rq, xc.c("advancements.story.lava_bucket.title"), xc.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", cl.a.a(dae.rq))
         .a($$1, "story/lava_bucket");
      aj $$10 = ai.a.a()
         .a($$6)
         .a(dae.qv, xc.c("advancements.story.obtain_armor.title"), xc.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("iron_helmet", cl.a.a(dae.qu))
         .a("iron_chestplate", cl.a.a(dae.qv))
         .a("iron_leggings", cl.a.a(dae.qw))
         .a("iron_boots", cl.a.a(dae.qx))
         .a($$1, "story/obtain_armor");
      ai.a.a()
         .a($$8)
         .a(dae.vG, xc.c("advancements.story.enchant_item.title"), xc.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bt.a.b())
         .a($$1, "story/enchant_item");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dng.cy, xc.c("advancements.story.form_obsidian.title"), xc.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", cl.a.a(dng.cy))
         .a($$1, "story/form_obsidian");
      ai.a.a()
         .a($$10)
         .a(dae.wD, xc.c("advancements.story.deflect_arrow.title"), xc.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", by.a.a(bm.a.a().a(bn.a.a().a(du.a(axh.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ai.a.a()
         .a($$8)
         .a(dae.qz, xc.c("advancements.story.shiny_gear.title"), xc.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("diamond_helmet", cl.a.a(dae.qy))
         .a("diamond_chestplate", cl.a.a(dae.qz))
         .a("diamond_leggings", cl.a.a(dae.qA))
         .a("diamond_boots", cl.a.a(dae.qB))
         .a($$1, "story/shiny_gear");
      aj $$12 = ai.a.a()
         .a($$11)
         .a(dae.pg, xc.c("advancements.story.enter_the_nether.title"), xc.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", bc.a.a(djz.j))
         .a($$1, "story/enter_the_nether");
      ai.a.a()
         .a($$12)
         .a(
            dae.qO,
            xc.c("advancements.story.cure_zombie_villager.title"),
            xc.c("advancements.story.cure_zombie_villager.description"),
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
         .a(dae.tA, xc.c("advancements.story.follow_ender_eye.title"), xc.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", df.a.a(cv.a.b($$0.e(mi.be).b(erx.k))))
         .a($$1, "story/follow_ender_eye");
      ai.a.a()
         .a($$13)
         .a(dng.fY, xc.c("advancements.story.enter_the_end.title"), xc.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", bc.a.a(djz.k))
         .a($$1, "story/enter_the_end");
   }
}
