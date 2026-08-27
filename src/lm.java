import java.util.function.Consumer;

public class lm implements le {
   @Override
   public void a(ip.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcj.i,
            wi.c("advancements.story.root.title"),
            wi.c("advancements.story.root.description"),
            new ajv("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(dcj.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crv.oM, wi.c("advancements.story.mine_stone.title"), wi.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cc.a.a().a(avm.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(crv.oR, wi.c("advancements.story.upgrade_tools.title"), wi.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(crv.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(crv.oD, wi.c("advancements.story.smelt_iron.title"), wi.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(crv.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(crv.pb, wi.c("advancements.story.iron_tools.title"), wi.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(crv.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(crv.ox, wi.c("advancements.story.mine_diamond.title"), wi.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(crv.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(crv.qz, wi.c("advancements.story.lava_bucket.title"), wi.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(crv.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(crv.pG, wi.c("advancements.story.obtain_armor.title"), wi.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(crv.pF))
         .a("iron_chestplate", ca.a.a(crv.pG))
         .a("iron_leggings", ca.a.a(crv.pH))
         .a("iron_boots", ca.a.a(crv.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(crv.uu, wi.c("advancements.story.enchant_item.title"), wi.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dcj.co, wi.c("advancements.story.form_obsidian.title"), wi.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(dcj.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(crv.vq, wi.c("advancements.story.deflect_arrow.title"), wi.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(de.a(avg.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(crv.pK, wi.c("advancements.story.shiny_gear.title"), wi.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(crv.pJ))
         .a("diamond_chestplate", ca.a.a(crv.pK))
         .a("diamond_leggings", ca.a.a(crv.pL))
         .a("diamond_boots", ca.a.a(crv.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(crv.or, wi.c("advancements.story.enter_the_nether.title"), wi.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(czg.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            crv.pZ,
            wi.c("advancements.story.cure_zombie_villager.title"),
            wi.c("advancements.story.cure_zombie_villager.description"),
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
         .a(crv.sr, wi.c("advancements.story.follow_ender_eye.title"), wi.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", ct.a.a(ck.a.b($$0.b(ku.aG).b(efk.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dcj.fz, wi.c("advancements.story.enter_the_end.title"), wi.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(czg.j))
         .a($$1, "story/enter_the_end");
   }
}
