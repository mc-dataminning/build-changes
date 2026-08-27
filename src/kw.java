import java.util.function.Consumer;

public class kw implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwr.i,
            vf.c("advancements.story.root.title"),
            vf.c("advancements.story.root.description"),
            new ahg("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", by.a.a(cwr.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cna.oK, vf.c("advancements.story.mine_stone.title"), vf.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", by.a.a(ca.a.a().a(aso.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cna.oP, vf.c("advancements.story.upgrade_tools.title"), vf.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", by.a.a(cna.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cna.oB, vf.c("advancements.story.smelt_iron.title"), vf.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", by.a.a(cna.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cna.oZ, vf.c("advancements.story.iron_tools.title"), vf.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", by.a.a(cna.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cna.ov, vf.c("advancements.story.mine_diamond.title"), vf.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", by.a.a(cna.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cna.qx, vf.c("advancements.story.lava_bucket.title"), vf.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", by.a.a(cna.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cna.pE, vf.c("advancements.story.obtain_armor.title"), vf.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", by.a.a(cna.pD))
         .a("iron_chestplate", by.a.a(cna.pE))
         .a("iron_leggings", by.a.a(cna.pF))
         .a("iron_boots", by.a.a(cna.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cna.up, vf.c("advancements.story.enchant_item.title"), vf.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bj.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cwr.co, vf.c("advancements.story.form_obsidian.title"), vf.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", by.a.a(cwr.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cna.vl, vf.c("advancements.story.deflect_arrow.title"), vf.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bo.a.a(be.a.a().a(bf.a.a().a(db.a(asi.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cna.pI, vf.c("advancements.story.shiny_gear.title"), vf.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", by.a.a(cna.pH))
         .a("diamond_chestplate", by.a.a(cna.pI))
         .a("diamond_leggings", by.a.a(cna.pJ))
         .a("diamond_boots", by.a.a(cna.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cna.op, vf.c("advancements.story.enter_the_nether.title"), vf.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ax.a.a(cto.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cna.pX,
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
         .a(cna.sp, vf.c("advancements.story.follow_ender_eye.title"), vf.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", cr.a.a(ci.a.c(dyz.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cwr.fz, vf.c("advancements.story.enter_the_end.title"), vf.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ax.a.a(cto.j))
         .a($$1, "story/enter_the_end");
   }
}
