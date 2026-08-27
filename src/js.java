import java.util.function.Consumer;

public class js implements jm {
   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csm.i,
            tf.c("advancements.story.root.title"),
            tf.c("advancements.story.root.description"),
            new aer("textures/gui/advancements/backgrounds/stone.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("crafting_table", bx.a.a(csm.cA))
         .a($$1, "story/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cja.nZ, tf.c("advancements.story.mine_stone.title"), tf.c("advancements.story.mine_stone.description"), null, ao.a, true, true, false)
         .a("get_stone", bx.a.a(bz.a.a().a(apt.ax)))
         .a($$1, "story/mine_stone");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(cja.oe, tf.c("advancements.story.upgrade_tools.title"), tf.c("advancements.story.upgrade_tools.description"), null, ao.a, true, true, false)
         .a("stone_pickaxe", bx.a.a(cja.oe))
         .a($$1, "story/upgrade_tools");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(cja.nQ, tf.c("advancements.story.smelt_iron.title"), tf.c("advancements.story.smelt_iron.description"), null, ao.a, true, true, false)
         .a("iron", bx.a.a(cja.nQ))
         .a($$1, "story/smelt_iron");
      ae $$6 = ae.a.a()
         .a($$5)
         .a(cja.oo, tf.c("advancements.story.iron_tools.title"), tf.c("advancements.story.iron_tools.description"), null, ao.a, true, true, false)
         .a("iron_pickaxe", bx.a.a(cja.oo))
         .a($$1, "story/iron_tools");
      ae $$7 = ae.a.a()
         .a($$6)
         .a(cja.nK, tf.c("advancements.story.mine_diamond.title"), tf.c("advancements.story.mine_diamond.description"), null, ao.a, true, true, false)
         .a("diamond", bx.a.a(cja.nK))
         .a($$1, "story/mine_diamond");
      ae $$8 = ae.a.a()
         .a($$5)
         .a(cja.pM, tf.c("advancements.story.lava_bucket.title"), tf.c("advancements.story.lava_bucket.description"), null, ao.a, true, true, false)
         .a("lava_bucket", bx.a.a(cja.pM))
         .a($$1, "story/lava_bucket");
      ae $$9 = ae.a.a()
         .a($$5)
         .a(cja.oT, tf.c("advancements.story.obtain_armor.title"), tf.c("advancements.story.obtain_armor.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("iron_helmet", bx.a.a(cja.oS))
         .a("iron_chestplate", bx.a.a(cja.oT))
         .a("iron_leggings", bx.a.a(cja.oU))
         .a("iron_boots", bx.a.a(cja.oV))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cja.tC, tf.c("advancements.story.enchant_item.title"), tf.c("advancements.story.enchant_item.description"), null, ao.a, true, true, false)
         .a("enchanted_item", bi.a.d())
         .a($$1, "story/enchant_item");
      ae $$10 = ae.a.a()
         .a($$8)
         .a(csm.co, tf.c("advancements.story.form_obsidian.title"), tf.c("advancements.story.form_obsidian.description"), null, ao.a, true, true, false)
         .a("obsidian", bx.a.a(csm.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cja.uy, tf.c("advancements.story.deflect_arrow.title"), tf.c("advancements.story.deflect_arrow.description"), null, ao.a, true, true, false)
         .a("deflected_projectile", bn.a.a(bc.a.a().a(bd.a.a().a(da.a(apn.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cja.oX, tf.c("advancements.story.shiny_gear.title"), tf.c("advancements.story.shiny_gear.description"), null, ao.a, true, true, false)
         .a(ap.b)
         .a("diamond_helmet", bx.a.a(cja.oW))
         .a("diamond_chestplate", bx.a.a(cja.oX))
         .a("diamond_leggings", bx.a.a(cja.oY))
         .a("diamond_boots", bx.a.a(cja.oZ))
         .a($$1, "story/shiny_gear");
      ae $$11 = ae.a.a()
         .a($$10)
         .a(cja.nE, tf.c("advancements.story.enter_the_nether.title"), tf.c("advancements.story.enter_the_nether.description"), null, ao.a, true, true, false)
         .a("entered_nether", aw.a.a(cpl.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cja.pm,
            tf.c("advancements.story.cure_zombie_villager.title"),
            tf.c("advancements.story.cure_zombie_villager.description"),
            null,
            ao.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bb.a.d())
         .a($$1, "story/cure_zombie_villager");
      ae $$12 = ae.a.a()
         .a($$11)
         .a(cja.rD, tf.c("advancements.story.follow_ender_eye.title"), tf.c("advancements.story.follow_ender_eye.description"), null, ao.a, true, true, false)
         .a("in_stronghold", cq.a.a(ch.a.c(dus.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(csm.fz, tf.c("advancements.story.enter_the_end.title"), tf.c("advancements.story.enter_the_end.description"), null, ao.a, true, true, false)
         .a("entered_end", aw.a.a(cpl.j))
         .a($$1, "story/enter_the_end");
   }
}
