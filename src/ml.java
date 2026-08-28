import java.util.function.Consumer;

public class ml implements mf {
   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<cvg> $$2 = $$0.b(lv.K);
      ag $$3 = af.a.a()
         .a(
            dgx.i,
            xd.c("advancements.story.root.title"),
            xd.c("advancements.story.root.description"),
            alb.b("textures/gui/advancements/backgrounds/stone.png"),
            am.a,
            false,
            false,
            false
         )
         .a("crafting_table", cg.a.a(dgx.cA))
         .a($$1, "story/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cvo.oP, xd.c("advancements.story.mine_stone.title"), xd.c("advancements.story.mine_stone.description"), null, am.a, true, true, false)
         .a("get_stone", cg.a.a(cs.a.a().a($$2, axb.aY)))
         .a($$1, "story/mine_stone");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cvo.oU, xd.c("advancements.story.upgrade_tools.title"), xd.c("advancements.story.upgrade_tools.description"), null, am.a, true, true, false)
         .a("stone_pickaxe", cg.a.a(cvo.oU))
         .a($$1, "story/upgrade_tools");
      ag $$6 = af.a.a()
         .a($$5)
         .a(cvo.oG, xd.c("advancements.story.smelt_iron.title"), xd.c("advancements.story.smelt_iron.description"), null, am.a, true, true, false)
         .a("iron", cg.a.a(cvo.oG))
         .a($$1, "story/smelt_iron");
      ag $$7 = af.a.a()
         .a($$6)
         .a(cvo.pe, xd.c("advancements.story.iron_tools.title"), xd.c("advancements.story.iron_tools.description"), null, am.a, true, true, false)
         .a("iron_pickaxe", cg.a.a(cvo.pe))
         .a($$1, "story/iron_tools");
      ag $$8 = af.a.a()
         .a($$7)
         .a(cvo.oA, xd.c("advancements.story.mine_diamond.title"), xd.c("advancements.story.mine_diamond.description"), null, am.a, true, true, false)
         .a("diamond", cg.a.a(cvo.oA))
         .a($$1, "story/mine_diamond");
      ag $$9 = af.a.a()
         .a($$6)
         .a(cvo.qB, xd.c("advancements.story.lava_bucket.title"), xd.c("advancements.story.lava_bucket.description"), null, am.a, true, true, false)
         .a("lava_bucket", cg.a.a(cvo.qB))
         .a($$1, "story/lava_bucket");
      ag $$10 = af.a.a()
         .a($$6)
         .a(cvo.pI, xd.c("advancements.story.obtain_armor.title"), xd.c("advancements.story.obtain_armor.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("iron_helmet", cg.a.a(cvo.pH))
         .a("iron_chestplate", cg.a.a(cvo.pI))
         .a("iron_leggings", cg.a.a(cvo.pJ))
         .a("iron_boots", cg.a.a(cvo.pK))
         .a($$1, "story/obtain_armor");
      af.a.a()
         .a($$8)
         .a(cvo.uy, xd.c("advancements.story.enchant_item.title"), xd.c("advancements.story.enchant_item.description"), null, am.a, true, true, false)
         .a("enchanted_item", bp.a.b())
         .a($$1, "story/enchant_item");
      ag $$11 = af.a.a()
         .a($$9)
         .a(dgx.co, xd.c("advancements.story.form_obsidian.title"), xd.c("advancements.story.form_obsidian.description"), null, am.a, true, true, false)
         .a("obsidian", cg.a.a(dgx.co))
         .a($$1, "story/form_obsidian");
      af.a.a()
         .a($$10)
         .a(cvo.vu, xd.c("advancements.story.deflect_arrow.title"), xd.c("advancements.story.deflect_arrow.description"), null, am.a, true, true, false)
         .a("deflected_projectile", bu.a.a(bj.a.a().a(bk.a.a().a(ed.a(awu.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      af.a.a()
         .a($$8)
         .a(cvo.pM, xd.c("advancements.story.shiny_gear.title"), xd.c("advancements.story.shiny_gear.description"), null, am.a, true, true, false)
         .a(aj.a.b)
         .a("diamond_helmet", cg.a.a(cvo.pL))
         .a("diamond_chestplate", cg.a.a(cvo.pM))
         .a("diamond_leggings", cg.a.a(cvo.pN))
         .a("diamond_boots", cg.a.a(cvo.pO))
         .a($$1, "story/shiny_gear");
      ag $$12 = af.a.a()
         .a($$11)
         .a(cvo.ot, xd.c("advancements.story.enter_the_nether.title"), xd.c("advancements.story.enter_the_nether.description"), null, am.a, true, true, false)
         .a("entered_nether", az.a.a(dds.i))
         .a($$1, "story/enter_the_nether");
      af.a.a()
         .a($$12)
         .a(
            cvo.qb,
            xd.c("advancements.story.cure_zombie_villager.title"),
            xd.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cvo.st, xd.c("advancements.story.follow_ender_eye.title"), xd.c("advancements.story.follow_ender_eye.description"), null, am.a, true, true, false)
         .a("in_stronghold", dq.a.a(df.a.b($$0.b(lv.aR).b(eki.k))))
         .a($$1, "story/follow_ender_eye");
      af.a.a()
         .a($$13)
         .a(dgx.fz, xd.c("advancements.story.enter_the_end.title"), xd.c("advancements.story.enter_the_end.description"), null, am.a, true, true, false)
         .a("entered_end", az.a.a(dds.j))
         .a($$1, "story/enter_the_end");
   }
}
