import java.util.function.Consumer;

public class mo implements mi {
   @Override
   public void a(jr.a $$0, Consumer<ag> $$1) {
      jq<cvt> $$2 = $$0.d(ly.K);
      ag $$3 = af.a.a()
         .a(
            dia.i,
            xh.c("advancements.story.root.title"),
            xh.c("advancements.story.root.description"),
            alh.b("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", ch.a.a(dia.cA))
         .a($$1, "story/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cwb.oP, xh.c("advancements.story.mine_stone.title"), xh.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", ch.a.a(ct.a.a().a($$2, axi.aZ)))
         .a($$1, "story/mine_stone");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cwb.oU, xh.c("advancements.story.upgrade_tools.title"), xh.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", ch.a.a(cwb.oU))
         .a($$1, "story/upgrade_tools");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cwb.oG, xh.c("advancements.story.smelt_iron.title"), xh.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", ch.a.a(cwb.oG))
         .a($$1, "story/smelt_iron");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cwb.pe, xh.c("advancements.story.iron_tools.title"), xh.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", ch.a.a(cwb.pe))
         .a($$1, "story/iron_tools");
      ag $$8 = af.a.a()
         .a($$7)
         .a(cwb.oA, xh.c("advancements.story.mine_diamond.title"), xh.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", ch.a.a(cwb.oA))
         .a($$1, "story/mine_diamond");
      ag $$9 = af.a.a()
         .a($$6)
         .a(cwb.qB, xh.c("advancements.story.lava_bucket.title"), xh.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", ch.a.a(cwb.qB))
         .a($$1, "story/lava_bucket");
      ag $$10 = af.a.a()
         .a($$6)
         .a(cwb.pI, xh.c("advancements.story.obtain_armor.title"), xh.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", ch.a.a(cwb.pH))
         .a("iron_chestplate", ch.a.a(cwb.pI))
         .a("iron_leggings", ch.a.a(cwb.pJ))
         .a("iron_boots", ch.a.a(cwb.pK))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$8)
         .a(cwb.uy, xh.c("advancements.story.enchant_item.title"), xh.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bp.a.b())
         .a($$1, "story/enchant_item");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dia.co, xh.c("advancements.story.form_obsidian.title"), xh.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", ch.a.a(dia.co))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$10)
         .a(cwb.vu, xh.c("advancements.story.deflect_arrow.title"), xh.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", bu.a.a(bj.a.a().a(bk.a.a().a(ef.a(axb.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$8)
         .a(cwb.pM, xh.c("advancements.story.shiny_gear.title"), xh.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", ch.a.a(cwb.pL))
         .a("diamond_chestplate", ch.a.a(cwb.pM))
         .a("diamond_leggings", ch.a.a(cwb.pN))
         .a("diamond_boots", ch.a.a(cwb.pO))
         .a($$1, "story/shiny_gear");
      ag $$12 = af.a.a()
         .a($$11)
         .a(cwb.ot, xh.c("advancements.story.enter_the_nether.title"), xh.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dev.j))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$12)
         .a(
            cwb.qb,
            xh.c("advancements.story.cure_zombie_villager.title"),
            xh.c("advancements.story.cure_zombie_villager.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bi.a.b())
         .a($$1, "story/cure_zombie_villager");
      ag $$13 = af.a.a()
         .a($$12)
         .a(cwb.st, xh.c("advancements.story.follow_ender_eye.title"), xh.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", dr.a.a(dg.a.b($$0.d(ly.aS).b(ell.k))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$13)
         .a(dia.fz, xh.c("advancements.story.enter_the_end.title"), xh.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dev.k))
         .a($$1, "story/enter_the_end");
   }
}
