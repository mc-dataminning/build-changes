import java.util.function.Consumer;

public class ku implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwl.i,
            vd.c("advancements.story.root.title"),
            vd.c("advancements.story.root.description"),
            new ahd("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", by.a.a(cwl.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cmu.oK, vd.c("advancements.story.mine_stone.title"), vd.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", by.a.a(ca.a.a().a(asj.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cmu.oP, vd.c("advancements.story.upgrade_tools.title"), vd.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", by.a.a(cmu.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cmu.oB, vd.c("advancements.story.smelt_iron.title"), vd.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", by.a.a(cmu.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cmu.oZ, vd.c("advancements.story.iron_tools.title"), vd.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", by.a.a(cmu.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cmu.ov, vd.c("advancements.story.mine_diamond.title"), vd.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", by.a.a(cmu.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cmu.qx, vd.c("advancements.story.lava_bucket.title"), vd.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", by.a.a(cmu.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cmu.pE, vd.c("advancements.story.obtain_armor.title"), vd.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", by.a.a(cmu.pD))
         .a("iron_chestplate", by.a.a(cmu.pE))
         .a("iron_leggings", by.a.a(cmu.pF))
         .a("iron_boots", by.a.a(cmu.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cmu.up, vd.c("advancements.story.enchant_item.title"), vd.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bj.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cwl.co, vd.c("advancements.story.form_obsidian.title"), vd.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", by.a.a(cwl.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cmu.vl, vd.c("advancements.story.deflect_arrow.title"), vd.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bo.a.a(be.a.a().a(bf.a.a().a(db.a(asd.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cmu.pI, vd.c("advancements.story.shiny_gear.title"), vd.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", by.a.a(cmu.pH))
         .a("diamond_chestplate", by.a.a(cmu.pI))
         .a("diamond_leggings", by.a.a(cmu.pJ))
         .a("diamond_boots", by.a.a(cmu.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cmu.op, vd.c("advancements.story.enter_the_nether.title"), vd.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ax.a.a(cti.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cmu.pX,
            vd.c("advancements.story.cure_zombie_villager.title"),
            vd.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bd.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cmu.sp, vd.c("advancements.story.follow_ender_eye.title"), vd.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cr.a.a(ci.a.c(dyt.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cwl.fz, vd.c("advancements.story.enter_the_end.title"), vd.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ax.a.a(cti.j))
         .a($$1, "story/enter_the_end");
   }
}
