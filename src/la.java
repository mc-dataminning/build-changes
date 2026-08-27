import java.util.function.Consumer;

public class la implements ks {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            czh.i,
            vs.c("advancements.story.root.title"),
            vs.c("advancements.story.root.description"),
            new ajc("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(czh.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cpt.oM, vs.c("advancements.story.mine_stone.title"), vs.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cc.a.a().a(aum.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cpt.oR, vs.c("advancements.story.upgrade_tools.title"), vs.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(cpt.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cpt.oD, vs.c("advancements.story.smelt_iron.title"), vs.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(cpt.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(cpt.pb, vs.c("advancements.story.iron_tools.title"), vs.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(cpt.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(cpt.ox, vs.c("advancements.story.mine_diamond.title"), vs.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(cpt.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(cpt.qz, vs.c("advancements.story.lava_bucket.title"), vs.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(cpt.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(cpt.pG, vs.c("advancements.story.obtain_armor.title"), vs.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(cpt.pF))
         .a("iron_chestplate", ca.a.a(cpt.pG))
         .a("iron_leggings", ca.a.a(cpt.pH))
         .a("iron_boots", ca.a.a(cpt.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(cpt.us, vs.c("advancements.story.enchant_item.title"), vs.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(czh.co, vs.c("advancements.story.form_obsidian.title"), vs.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(czh.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(cpt.vo, vs.c("advancements.story.deflect_arrow.title"), vs.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dd.a(aug.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(cpt.pK, vs.c("advancements.story.shiny_gear.title"), vs.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(cpt.pJ))
         .a("diamond_chestplate", ca.a.a(cpt.pK))
         .a("diamond_leggings", ca.a.a(cpt.pL))
         .a("diamond_boots", ca.a.a(cpt.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(cpt.or, vs.c("advancements.story.enter_the_nether.title"), vs.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(cwe.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            cpt.pZ,
            vs.c("advancements.story.cure_zombie_villager.title"),
            vs.c("advancements.story.cure_zombie_villager.description"),
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
         .a(cpt.sr, vs.c("advancements.story.follow_ender_eye.title"), vs.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", ct.a.a(ck.a.c(eca.k)))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(czh.fz, vs.c("advancements.story.enter_the_end.title"), vs.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(cwe.j))
         .a($$1, "story/enter_the_end");
   }
}
