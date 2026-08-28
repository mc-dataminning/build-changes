import java.util.function.Consumer;

public class mm implements mg {
   @Override
   public void a(jq.a $$0, Consumer<ag> $$1) {
      jp<cvn> $$2 = $$0.d(lw.K);
      ag $$3 = af.a.a()
         .a(
            dho.i,
            xe.c("advancements.story.root.title"),
            xe.c("advancements.story.root.description"),
            ale.b("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", cg.a.a(dho.cA))
         .a($$1, "story/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cvw.oP, xe.c("advancements.story.mine_stone.title"), xe.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", cg.a.a(cs.a.a().a($$2, axe.aY)))
         .a($$1, "story/mine_stone");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cvw.oU, xe.c("advancements.story.upgrade_tools.title"), xe.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", cg.a.a(cvw.oU))
         .a($$1, "story/upgrade_tools");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cvw.oG, xe.c("advancements.story.smelt_iron.title"), xe.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", cg.a.a(cvw.oG))
         .a($$1, "story/smelt_iron");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cvw.pe, xe.c("advancements.story.iron_tools.title"), xe.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", cg.a.a(cvw.pe))
         .a($$1, "story/iron_tools");
      ag $$8 = af.a.a()
         .a($$7)
         .a(cvw.oA, xe.c("advancements.story.mine_diamond.title"), xe.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", cg.a.a(cvw.oA))
         .a($$1, "story/mine_diamond");
      ag $$9 = af.a.a()
         .a($$6)
         .a(cvw.qB, xe.c("advancements.story.lava_bucket.title"), xe.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", cg.a.a(cvw.qB))
         .a($$1, "story/lava_bucket");
      ag $$10 = af.a.a()
         .a($$6)
         .a(cvw.pI, xe.c("advancements.story.obtain_armor.title"), xe.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", cg.a.a(cvw.pH))
         .a("iron_chestplate", cg.a.a(cvw.pI))
         .a("iron_leggings", cg.a.a(cvw.pJ))
         .a("iron_boots", cg.a.a(cvw.pK))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$8)
         .a(cvw.uy, xe.c("advancements.story.enchant_item.title"), xe.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bp.a.b())
         .a($$1, "story/enchant_item");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dho.co, xe.c("advancements.story.form_obsidian.title"), xe.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", cg.a.a(dho.co))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$10)
         .a(cvw.vu, xe.c("advancements.story.deflect_arrow.title"), xe.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", bu.a.a(bj.a.a().a(bk.a.a().a(ee.a(awx.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$8)
         .a(cvw.pM, xe.c("advancements.story.shiny_gear.title"), xe.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", cg.a.a(cvw.pL))
         .a("diamond_chestplate", cg.a.a(cvw.pM))
         .a("diamond_leggings", cg.a.a(cvw.pN))
         .a("diamond_boots", cg.a.a(cvw.pO))
         .a($$1, "story/shiny_gear");
      ag $$12 = af.a.a()
         .a($$11)
         .a(cvw.ot, xe.c("advancements.story.enter_the_nether.title"), xe.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dej.i))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$12)
         .a(
            cvw.qb,
            xe.c("advancements.story.cure_zombie_villager.title"),
            xe.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cvw.st, xe.c("advancements.story.follow_ender_eye.title"), xe.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", dq.a.a(df.a.b($$0.d(lw.aT).b(ela.k))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$13)
         .a(dho.fz, xe.c("advancements.story.enter_the_end.title"), xe.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dej.j))
         .a($$1, "story/enter_the_end");
   }
}
