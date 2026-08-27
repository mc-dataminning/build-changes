import java.util.function.Consumer;

public class kp implements kj {
   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvc.i,
            ur.c("advancements.story.root.title"),
            ur.c("advancements.story.root.description"),
            new agi("textures/gui/advancements/backgrounds/stone.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("crafting_table", bz.a.a(cvc.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(clm.oK, ur.c("advancements.story.mine_stone.title"), ur.c("advancements.story.mine_stone.description"), null, ar.a, true, true, false)
         .a("get_stone", bz.a.a(cb.a.a().a(aro.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(clm.oP, ur.c("advancements.story.upgrade_tools.title"), ur.c("advancements.story.upgrade_tools.description"), null, ar.a, true, true, false)
         .a("stone_pickaxe", bz.a.a(clm.oP))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(clm.oB, ur.c("advancements.story.smelt_iron.title"), ur.c("advancements.story.smelt_iron.description"), null, ar.a, true, true, false)
         .a("iron", bz.a.a(clm.oB))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(clm.oZ, ur.c("advancements.story.iron_tools.title"), ur.c("advancements.story.iron_tools.description"), null, ar.a, true, true, false)
         .a("iron_pickaxe", bz.a.a(clm.oZ))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(clm.ov, ur.c("advancements.story.mine_diamond.title"), ur.c("advancements.story.mine_diamond.description"), null, ar.a, true, true, false)
         .a("diamond", bz.a.a(clm.ov))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(clm.qx, ur.c("advancements.story.lava_bucket.title"), ur.c("advancements.story.lava_bucket.description"), null, ar.a, true, true, false)
         .a("lava_bucket", bz.a.a(clm.qx))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(clm.pE, ur.c("advancements.story.obtain_armor.title"), ur.c("advancements.story.obtain_armor.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", bz.a.a(clm.pD))
         .a("iron_chestplate", bz.a.a(clm.pE))
         .a("iron_leggings", bz.a.a(clm.pF))
         .a("iron_boots", bz.a.a(clm.pG))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(clm.uo, ur.c("advancements.story.enchant_item.title"), ur.c("advancements.story.enchant_item.description"), null, ar.a, true, true, false)
         .a("enchanted_item", bk.a.c())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(cvc.co, ur.c("advancements.story.form_obsidian.title"), ur.c("advancements.story.form_obsidian.description"), null, ar.a, true, true, false)
         .a("obsidian", bz.a.a(cvc.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(clm.vk, ur.c("advancements.story.deflect_arrow.title"), ur.c("advancements.story.deflect_arrow.description"), null, ar.a, true, true, false)
         .a("deflected_projectile", bp.a.a(be.a.a().a(bf.a.a().a(dc.a(ari.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(clm.pI, ur.c("advancements.story.shiny_gear.title"), ur.c("advancements.story.shiny_gear.description"), null, ar.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", bz.a.a(clm.pH))
         .a("diamond_chestplate", bz.a.a(clm.pI))
         .a("diamond_leggings", bz.a.a(clm.pJ))
         .a("diamond_boots", bz.a.a(clm.pK))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(clm.op, ur.c("advancements.story.enter_the_nether.title"), ur.c("advancements.story.enter_the_nether.description"), null, ar.a, true, true, false)
         .a("entered_nether", ay.a.a(csa.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            clm.pX,
            ur.c("advancements.story.cure_zombie_villager.title"),
            ur.c("advancements.story.cure_zombie_villager.description"),
            null,
            ar.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bd.a.c())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(clm.sp, ur.c("advancements.story.follow_ender_eye.title"), ur.c("advancements.story.follow_ender_eye.description"), null, ar.a, true, true, false)
         .a("in_stronghold", cs.a.a(cj.a.c(dxb.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(cvc.fz, ur.c("advancements.story.enter_the_end.title"), ur.c("advancements.story.enter_the_end.description"), null, ar.a, true, true, false)
         .a("entered_end", ay.a.a(csa.j))
         .a($$1, "story/enter_the_end");
   }
}
