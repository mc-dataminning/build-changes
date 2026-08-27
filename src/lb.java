import java.util.function.Consumer;

public class lb implements kt {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dac.i,
            vu.c("advancements.story.root.title"),
            vu.c("advancements.story.root.description"),
            new ajh("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(dac.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cqn.oM, vu.c("advancements.story.mine_stone.title"), vu.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cc.a.a().a(auv.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cqn.oR, vu.c("advancements.story.upgrade_tools.title"), vu.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(cqn.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cqn.oD, vu.c("advancements.story.smelt_iron.title"), vu.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(cqn.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cqn.pb, vu.c("advancements.story.iron_tools.title"), vu.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(cqn.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cqn.ox, vu.c("advancements.story.mine_diamond.title"), vu.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(cqn.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cqn.qz, vu.c("advancements.story.lava_bucket.title"), vu.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(cqn.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cqn.pG, vu.c("advancements.story.obtain_armor.title"), vu.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(cqn.pF))
         .a("iron_chestplate", ca.a.a(cqn.pG))
         .a("iron_leggings", ca.a.a(cqn.pH))
         .a("iron_boots", ca.a.a(cqn.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cqn.ut, vu.c("advancements.story.enchant_item.title"), vu.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dac.co, vu.c("advancements.story.form_obsidian.title"), vu.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(dac.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cqn.vp, vu.c("advancements.story.deflect_arrow.title"), vu.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aup.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cqn.pK, vu.c("advancements.story.shiny_gear.title"), vu.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(cqn.pJ))
         .a("diamond_chestplate", ca.a.a(cqn.pK))
         .a("diamond_leggings", ca.a.a(cqn.pL))
         .a("diamond_boots", ca.a.a(cqn.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cqn.or, vu.c("advancements.story.enter_the_nether.title"), vu.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(cwz.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cqn.pZ,
            vu.c("advancements.story.cure_zombie_villager.title"),
            vu.c("advancements.story.cure_zombie_villager.description"),
            null,
            al.c,
            true,
            true,
            false
         )
         .a("cured_zombie", be.a.b())
         .a($$1, "story/cure_zombie_villager");
      af $$12 = ae.a.a()
         .a($$11)
         .a(cqn.sr, vu.c("advancements.story.follow_ender_eye.title"), vu.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", ct.a.a(ck.a.c(ecw.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dac.fz, vu.c("advancements.story.enter_the_end.title"), vu.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(cwz.j))
         .a($$1, "story/enter_the_end");
   }
}
