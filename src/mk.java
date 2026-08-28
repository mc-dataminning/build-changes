import java.util.function.Consumer;

public class mk implements me {
   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfy.i,
            wy.c("advancements.story.root.title"),
            wy.c("advancements.story.root.description"),
            akq.b("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", cg.a.a(dfy.cA))
         .a($$1, "story/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(cur.oO, wy.c("advancements.story.mine_stone.title"), wy.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", cg.a.a(cs.a.a().a(awm.aX)))
         .a($$1, "story/mine_stone");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cur.oT, wy.c("advancements.story.upgrade_tools.title"), wy.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", cg.a.a(cur.oT))
         .a($$1, "story/upgrade_tools");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cur.oF, wy.c("advancements.story.smelt_iron.title"), wy.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", cg.a.a(cur.oF))
         .a($$1, "story/smelt_iron");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cur.pd, wy.c("advancements.story.iron_tools.title"), wy.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", cg.a.a(cur.pd))
         .a($$1, "story/iron_tools");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cur.oz, wy.c("advancements.story.mine_diamond.title"), wy.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", cg.a.a(cur.oz))
         .a($$1, "story/mine_diamond");
      ag $$8 = af.a.a()
         .a($$5)
         .a(cur.qA, wy.c("advancements.story.lava_bucket.title"), wy.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", cg.a.a(cur.qA))
         .a($$1, "story/lava_bucket");
      ag $$9 = af.a.a()
         .a($$5)
         .a(cur.pH, wy.c("advancements.story.obtain_armor.title"), wy.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", cg.a.a(cur.pG))
         .a("iron_chestplate", cg.a.a(cur.pH))
         .a("iron_leggings", cg.a.a(cur.pI))
         .a("iron_boots", cg.a.a(cur.pJ))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$7)
         .a(cur.uw, wy.c("advancements.story.enchant_item.title"), wy.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bp.a.b())
         .a($$1, "story/enchant_item");
      ag $$10 = af.a.a()
         .a($$8)
         .a(dfy.co, wy.c("advancements.story.form_obsidian.title"), wy.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", cg.a.a(dfy.co))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$9)
         .a(cur.vs, wy.c("advancements.story.deflect_arrow.title"), wy.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", bu.a.a(bj.a.a().a(bk.a.a().a(ed.a(awf.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$7)
         .a(cur.pL, wy.c("advancements.story.shiny_gear.title"), wy.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", cg.a.a(cur.pK))
         .a("diamond_chestplate", cg.a.a(cur.pL))
         .a("diamond_leggings", cg.a.a(cur.pM))
         .a("diamond_boots", cg.a.a(cur.pN))
         .a($$1, "story/shiny_gear");
      ag $$11 = af.a.a()
         .a($$10)
         .a(cur.os, wy.c("advancements.story.enter_the_nether.title"), wy.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dcu.i))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$11)
         .a(
            cur.qa,
            wy.c("advancements.story.cure_zombie_villager.title"),
            wy.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cur.ss, wy.c("advancements.story.follow_ender_eye.title"), wy.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", dq.a.a(df.a.b($$0.b(lu.aR).b(ejg.k))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$12)
         .a(dfy.fz, wy.c("advancements.story.enter_the_end.title"), wy.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dcu.j))
         .a($$1, "story/enter_the_end");
   }
}
