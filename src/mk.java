import java.util.function.Consumer;

public class mk implements me {
   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dga.i,
            wz.c("advancements.story.root.title"),
            wz.c("advancements.story.root.description"),
            akr.b("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", cg.a.a(dga.cA))
         .a($$1, "story/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cut.oO, wz.c("advancements.story.mine_stone.title"), wz.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", cg.a.a(cs.a.a().a(awn.aX)))
         .a($$1, "story/mine_stone");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cut.oT, wz.c("advancements.story.upgrade_tools.title"), wz.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", cg.a.a(cut.oT))
         .a($$1, "story/upgrade_tools");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cut.oF, wz.c("advancements.story.smelt_iron.title"), wz.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", cg.a.a(cut.oF))
         .a($$1, "story/smelt_iron");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cut.pd, wz.c("advancements.story.iron_tools.title"), wz.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", cg.a.a(cut.pd))
         .a($$1, "story/iron_tools");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cut.oz, wz.c("advancements.story.mine_diamond.title"), wz.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", cg.a.a(cut.oz))
         .a($$1, "story/mine_diamond");
      ag $$8 = af.a.a()
         .a($$5)
         .a(cut.qA, wz.c("advancements.story.lava_bucket.title"), wz.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", cg.a.a(cut.qA))
         .a($$1, "story/lava_bucket");
      ag $$9 = af.a.a()
         .a($$5)
         .a(cut.pH, wz.c("advancements.story.obtain_armor.title"), wz.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", cg.a.a(cut.pG))
         .a("iron_chestplate", cg.a.a(cut.pH))
         .a("iron_leggings", cg.a.a(cut.pI))
         .a("iron_boots", cg.a.a(cut.pJ))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$7)
         .a(cut.uw, wz.c("advancements.story.enchant_item.title"), wz.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bp.a.b())
         .a($$1, "story/enchant_item");
      ag $$10 = af.a.a()
         .a($$8)
         .a(dga.co, wz.c("advancements.story.form_obsidian.title"), wz.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", cg.a.a(dga.co))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$9)
         .a(cut.vs, wz.c("advancements.story.deflect_arrow.title"), wz.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", bu.a.a(bj.a.a().a(bk.a.a().a(ed.a(awg.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$7)
         .a(cut.pL, wz.c("advancements.story.shiny_gear.title"), wz.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", cg.a.a(cut.pK))
         .a("diamond_chestplate", cg.a.a(cut.pL))
         .a("diamond_leggings", cg.a.a(cut.pM))
         .a("diamond_boots", cg.a.a(cut.pN))
         .a($$1, "story/shiny_gear");
      ag $$11 = af.a.a()
         .a($$10)
         .a(cut.os, wz.c("advancements.story.enter_the_nether.title"), wz.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dcw.i))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$11)
         .a(
            cut.qa,
            wz.c("advancements.story.cure_zombie_villager.title"),
            wz.c("advancements.story.cure_zombie_villager.description"),
            null,
            am.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bi.a.b())
         .a($$1, "story/cure_zombie_villager");
      ag $$12 = af.a.a()
         .a($$11)
         .a(cut.ss, wz.c("advancements.story.follow_ender_eye.title"), wz.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", dq.a.a(df.a.b($$0.b(lu.aR).b(ejj.k))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$12)
         .a(dga.fz, wz.c("advancements.story.enter_the_end.title"), wz.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dcw.j))
         .a($$1, "story/enter_the_end");
   }
}
