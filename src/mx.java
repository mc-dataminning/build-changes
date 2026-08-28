import java.util.function.Consumer;

public class mx implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<czu> $$2 = $$0.e(mh.K);
      aj $$3 = ai.a.a()
         .a(
            dne.i,
            xa.c("advancements.story.root.title"),
            xa.c("advancements.story.root.description"),
            ali.b("gui/advancements/backgrounds/stone"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", ck.a.a(dne.cL))
         .a($$1, "story/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dac.pC, xa.c("advancements.story.mine_stone.title"), xa.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", ck.a.a(cm.a.a().a($$2, axm.bd)))
         .a($$1, "story/mine_stone");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dac.pH, xa.c("advancements.story.upgrade_tools.title"), xa.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", ck.a.a(dac.pH))
         .a($$1, "story/upgrade_tools");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dac.pt, xa.c("advancements.story.smelt_iron.title"), xa.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", ck.a.a(dac.pt))
         .a($$1, "story/smelt_iron");
      aj $$7 = ai.a.a()
         .a($$6)
         .a(dac.pR, xa.c("advancements.story.iron_tools.title"), xa.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", ck.a.a(dac.pR))
         .a($$1, "story/iron_tools");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dac.pn, xa.c("advancements.story.mine_diamond.title"), xa.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", ck.a.a(dac.pn))
         .a($$1, "story/mine_diamond");
      aj $$9 = ai.a.a()
         .a($$6)
         .a(dac.rq, xa.c("advancements.story.lava_bucket.title"), xa.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", ck.a.a(dac.rq))
         .a($$1, "story/lava_bucket");
      aj $$10 = ai.a.a()
         .a($$6)
         .a(dac.qv, xa.c("advancements.story.obtain_armor.title"), xa.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("iron_helmet", ck.a.a(dac.qu))
         .a("iron_chestplate", ck.a.a(dac.qv))
         .a("iron_leggings", ck.a.a(dac.qw))
         .a("iron_boots", ck.a.a(dac.qx))
         .a($$1, "story/obtain_armor");
      ai.a.a()
         .a($$8)
         .a(dac.vG, xa.c("advancements.story.enchant_item.title"), xa.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bs.a.b())
         .a($$1, "story/enchant_item");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dne.cy, xa.c("advancements.story.form_obsidian.title"), xa.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", ck.a.a(dne.cy))
         .a($$1, "story/form_obsidian");
      ai.a.a()
         .a($$10)
         .a(dac.wD, xa.c("advancements.story.deflect_arrow.title"), xa.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", bx.a.a(bm.a.a().a(bn.a.a().a(dt.a(axf.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ai.a.a()
         .a($$8)
         .a(dac.qz, xa.c("advancements.story.shiny_gear.title"), xa.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("diamond_helmet", ck.a.a(dac.qy))
         .a("diamond_chestplate", ck.a.a(dac.qz))
         .a("diamond_leggings", ck.a.a(dac.qA))
         .a("diamond_boots", ck.a.a(dac.qB))
         .a($$1, "story/shiny_gear");
      aj $$12 = ai.a.a()
         .a($$11)
         .a(dac.pg, xa.c("advancements.story.enter_the_nether.title"), xa.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", bc.a.a(djx.j))
         .a($$1, "story/enter_the_nether");
      ai.a.a()
         .a($$12)
         .a(
            dac.qO,
            xa.c("advancements.story.cure_zombie_villager.title"),
            xa.c("advancements.story.cure_zombie_villager.description"),
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
         .a(dac.tA, xa.c("advancements.story.follow_ender_eye.title"), xa.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", de.a.a(cu.a.b($$0.e(mh.be).b(erv.k))))
         .a($$1, "story/follow_ender_eye");
      ai.a.a()
         .a($$13)
         .a(dne.fY, xa.c("advancements.story.enter_the_end.title"), xa.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", bc.a.a(djx.k))
         .a($$1, "story/enter_the_end");
   }
}
