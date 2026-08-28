import java.util.function.Consumer;

public class mx implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<czg> $$2 = $$0.e(mh.K);
      aj $$3 = ai.a.a()
         .a(
            dmo.i,
            wy.c("advancements.story.root.title"),
            wy.c("advancements.story.root.description"),
            alg.b("gui/advancements/backgrounds/stone"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", ck.a.a(dmo.cL))
         .a($$1, "story/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(czo.pC, wy.c("advancements.story.mine_stone.title"), wy.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", ck.a.a(cm.a.a().a($$2, axk.bd)))
         .a($$1, "story/mine_stone");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(czo.pH, wy.c("advancements.story.upgrade_tools.title"), wy.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", ck.a.a(czo.pH))
         .a($$1, "story/upgrade_tools");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(czo.pt, wy.c("advancements.story.smelt_iron.title"), wy.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", ck.a.a(czo.pt))
         .a($$1, "story/smelt_iron");
      aj $$7 = ai.a.a()
         .a($$6)
         .a(czo.pR, wy.c("advancements.story.iron_tools.title"), wy.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", ck.a.a(czo.pR))
         .a($$1, "story/iron_tools");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(czo.pn, wy.c("advancements.story.mine_diamond.title"), wy.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", ck.a.a(czo.pn))
         .a($$1, "story/mine_diamond");
      aj $$9 = ai.a.a()
         .a($$6)
         .a(czo.rq, wy.c("advancements.story.lava_bucket.title"), wy.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", ck.a.a(czo.rq))
         .a($$1, "story/lava_bucket");
      aj $$10 = ai.a.a()
         .a($$6)
         .a(czo.qv, wy.c("advancements.story.obtain_armor.title"), wy.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("iron_helmet", ck.a.a(czo.qu))
         .a("iron_chestplate", ck.a.a(czo.qv))
         .a("iron_leggings", ck.a.a(czo.qw))
         .a("iron_boots", ck.a.a(czo.qx))
         .a($$1, "story/obtain_armor");
      ai.a.a()
         .a($$8)
         .a(czo.vG, wy.c("advancements.story.enchant_item.title"), wy.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bs.a.b())
         .a($$1, "story/enchant_item");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dmo.cy, wy.c("advancements.story.form_obsidian.title"), wy.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", ck.a.a(dmo.cy))
         .a($$1, "story/form_obsidian");
      ai.a.a()
         .a($$10)
         .a(czo.wD, wy.c("advancements.story.deflect_arrow.title"), wy.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", bx.a.a(bm.a.a().a(bn.a.a().a(dt.a(axd.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ai.a.a()
         .a($$8)
         .a(czo.qz, wy.c("advancements.story.shiny_gear.title"), wy.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("diamond_helmet", ck.a.a(czo.qy))
         .a("diamond_chestplate", ck.a.a(czo.qz))
         .a("diamond_leggings", ck.a.a(czo.qA))
         .a("diamond_boots", ck.a.a(czo.qB))
         .a($$1, "story/shiny_gear");
      aj $$12 = ai.a.a()
         .a($$11)
         .a(czo.pg, wy.c("advancements.story.enter_the_nether.title"), wy.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", bc.a.a(djh.j))
         .a($$1, "story/enter_the_nether");
      ai.a.a()
         .a($$12)
         .a(
            czo.qO,
            wy.c("advancements.story.cure_zombie_villager.title"),
            wy.c("advancements.story.cure_zombie_villager.description"),
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
         .a(czo.tA, wy.c("advancements.story.follow_ender_eye.title"), wy.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", de.a.a(cu.a.b($$0.e(mh.be).b(erc.k))))
         .a($$1, "story/follow_ender_eye");
      ai.a.a()
         .a($$13)
         .a(dmo.fY, wy.c("advancements.story.enter_the_end.title"), wy.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", bc.a.a(djh.k))
         .a($$1, "story/enter_the_end");
   }
}
