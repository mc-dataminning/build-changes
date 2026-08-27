import java.util.function.Consumer;

public class kw implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cws.i,
            vf.c("advancements.story.root.title"),
            vf.c("advancements.story.root.description"),
            new ahg("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", by.a.a(cws.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cnb.oK, vf.c("advancements.story.mine_stone.title"), vf.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", by.a.a(ca.a.a().a(asp.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cnb.oP, vf.c("advancements.story.upgrade_tools.title"), vf.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", by.a.a(cnb.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cnb.oB, vf.c("advancements.story.smelt_iron.title"), vf.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", by.a.a(cnb.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cnb.oZ, vf.c("advancements.story.iron_tools.title"), vf.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", by.a.a(cnb.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cnb.ov, vf.c("advancements.story.mine_diamond.title"), vf.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", by.a.a(cnb.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cnb.qx, vf.c("advancements.story.lava_bucket.title"), vf.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", by.a.a(cnb.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cnb.pE, vf.c("advancements.story.obtain_armor.title"), vf.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", by.a.a(cnb.pD))
         .a("iron_chestplate", by.a.a(cnb.pE))
         .a("iron_leggings", by.a.a(cnb.pF))
         .a("iron_boots", by.a.a(cnb.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cnb.up, vf.c("advancements.story.enchant_item.title"), vf.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bj.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cws.co, vf.c("advancements.story.form_obsidian.title"), vf.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", by.a.a(cws.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cnb.vl, vf.c("advancements.story.deflect_arrow.title"), vf.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bo.a.a(be.a.a().a(bf.a.a().a(db.a(asj.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cnb.pI, vf.c("advancements.story.shiny_gear.title"), vf.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", by.a.a(cnb.pH))
         .a("diamond_chestplate", by.a.a(cnb.pI))
         .a("diamond_leggings", by.a.a(cnb.pJ))
         .a("diamond_boots", by.a.a(cnb.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cnb.op, vf.c("advancements.story.enter_the_nether.title"), vf.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ax.a.a(ctp.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cnb.pX,
            vf.c("advancements.story.cure_zombie_villager.title"),
            vf.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cnb.sp, vf.c("advancements.story.follow_ender_eye.title"), vf.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cr.a.a(ci.a.c(dza.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cws.fz, vf.c("advancements.story.enter_the_end.title"), vf.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ax.a.a(ctp.j))
         .a($$1, "story/enter_the_end");
   }
}
