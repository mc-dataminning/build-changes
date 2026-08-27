import java.util.function.Consumer;

public class lk implements lc {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dca.i,
            wg.c("advancements.story.root.title"),
            wg.c("advancements.story.root.description"),
            new ajt("textures/gui/advancements/backgrounds/stone.png"),
            al.a,
            false,
            false,
            false
         )
         .a("crafting_table", ca.a.a(dca.cA))
         .a($$1, "story/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(crm.oM, wg.c("advancements.story.mine_stone.title"), wg.c("advancements.story.mine_stone.description"), null, al.a, true, true, false)
         .a("get_stone", ca.a.a(cc.a.a().a(avk.ax)))
         .a($$1, "story/mine_stone");
      af $$4 = ae.a.a()
         .a($$3)
         .a(crm.oR, wg.c("advancements.story.upgrade_tools.title"), wg.c("advancements.story.upgrade_tools.description"), null, al.a, true, true, false)
         .a("stone_pickaxe", ca.a.a(crm.oR))
         .a($$1, "story/upgrade_tools");
      af $$5 = ae.a.a()
         .a($$4)
         .a(crm.oD, wg.c("advancements.story.smelt_iron.title"), wg.c("advancements.story.smelt_iron.description"), null, al.a, true, true, false)
         .a("iron", ca.a.a(crm.oD))
         .a($$1, "story/smelt_iron");
      af $$6 = ae.a.a()
         .a($$5)
         .a(crm.pb, wg.c("advancements.story.iron_tools.title"), wg.c("advancements.story.iron_tools.description"), null, al.a, true, true, false)
         .a("iron_pickaxe", ca.a.a(crm.pb))
         .a($$1, "story/iron_tools");
      af $$7 = ae.a.a()
         .a($$6)
         .a(crm.ox, wg.c("advancements.story.mine_diamond.title"), wg.c("advancements.story.mine_diamond.description"), null, al.a, true, true, false)
         .a("diamond", ca.a.a(crm.ox))
         .a($$1, "story/mine_diamond");
      af $$8 = ae.a.a()
         .a($$5)
         .a(crm.qz, wg.c("advancements.story.lava_bucket.title"), wg.c("advancements.story.lava_bucket.description"), null, al.a, true, true, false)
         .a("lava_bucket", ca.a.a(crm.qz))
         .a($$1, "story/lava_bucket");
      af $$9 = ae.a.a()
         .a($$5)
         .a(crm.pG, wg.c("advancements.story.obtain_armor.title"), wg.c("advancements.story.obtain_armor.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("iron_helmet", ca.a.a(crm.pF))
         .a("iron_chestplate", ca.a.a(crm.pG))
         .a("iron_leggings", ca.a.a(crm.pH))
         .a("iron_boots", ca.a.a(crm.pI))
         .a($$1, "story/obtain_armor");
      ae.a.a()
         .a($$7)
         .a(crm.uu, wg.c("advancements.story.enchant_item.title"), wg.c("advancements.story.enchant_item.description"), null, al.a, true, true, false)
         .a("enchanted_item", bl.a.b())
         .a($$1, "story/enchant_item");
      af $$10 = ae.a.a()
         .a($$8)
         .a(dca.co, wg.c("advancements.story.form_obsidian.title"), wg.c("advancements.story.form_obsidian.description"), null, al.a, true, true, false)
         .a("obsidian", ca.a.a(dca.co))
         .a($$1, "story/form_obsidian");
      ae.a.a()
         .a($$9)
         .a(crm.vq, wg.c("advancements.story.deflect_arrow.title"), wg.c("advancements.story.deflect_arrow.description"), null, al.a, true, true, false)
         .a("deflected_projectile", bq.a.a(bf.a.a().a(bg.a.a().a(dd.a(ave.k))).a(true)))
         .a($$1, "story/deflect_arrow");
      ae.a.a()
         .a($$7)
         .a(crm.pK, wg.c("advancements.story.shiny_gear.title"), wg.c("advancements.story.shiny_gear.description"), null, al.a, true, true, false)
         .a(ai.a.b)
         .a("diamond_helmet", ca.a.a(crm.pJ))
         .a("diamond_chestplate", ca.a.a(crm.pK))
         .a("diamond_leggings", ca.a.a(crm.pL))
         .a("diamond_boots", ca.a.a(crm.pM))
         .a($$1, "story/shiny_gear");
      af $$11 = ae.a.a()
         .a($$10)
         .a(crm.or, wg.c("advancements.story.enter_the_nether.title"), wg.c("advancements.story.enter_the_nether.description"), null, al.a, true, true, false)
         .a("entered_nether", ay.a.a(cyx.i))
         .a($$1, "story/enter_the_nether");
      ae.a.a()
         .a($$11)
         .a(
            crm.pZ,
            wg.c("advancements.story.cure_zombie_villager.title"),
            wg.c("advancements.story.cure_zombie_villager.description"),
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
         .a(crm.sr, wg.c("advancements.story.follow_ender_eye.title"), wg.c("advancements.story.follow_ender_eye.description"), null, al.a, true, true, false)
         .a("in_stronghold", ct.a.a(ck.a.b($$0.b(ks.aF).b(efb.k))))
         .a($$1, "story/follow_ender_eye");
      ae.a.a()
         .a($$12)
         .a(dca.fz, wg.c("advancements.story.enter_the_end.title"), wg.c("advancements.story.enter_the_end.description"), null, al.a, true, true, false)
         .a("entered_end", ay.a.a(cyx.j))
         .a($$1, "story/enter_the_end");
   }
}
