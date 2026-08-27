import java.util.function.Consumer;

public class mc implements ls {
   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfe.gr,
            xe.c("advancements.end.root.title"),
            xe.c("advancements.end.root.description"),
            new akt("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dca.j))
         .a($$1, "end/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(dfe.hI, xe.c("advancements.end.kill_dragon.title"), xe.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", cn.a.a(bs.a.a().a(bsb.H)))
         .a($$1, "end/kill_dragon");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cuk.tC, xe.c("advancements.end.enter_end_gateway.title"), xe.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", bo.a.a(dfe.lD))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$3)
         .a(cuk.wQ, xe.c("advancements.end.respawn_dragon.title"), xe.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", dp.a.a(bs.a.a().a(bsb.H)))
         .a($$1, "end/respawn_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dfe.lt, xe.c("advancements.end.find_end_city.title"), xe.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", db.a.a(cs.a.b($$0.b(li.aJ).b(ejn.r))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$3)
         .a(cuk.wY, xe.c("advancements.end.dragon_breath.title"), xe.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", cc.a.a(cuk.wY))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$5)
         .a(cuk.xf, xe.c("advancements.end.levitate.title"), xe.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", co.a.a(bj.b(cu.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$5)
         .a(cuk.pj, xe.c("advancements.end.elytra.title"), xe.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", cc.a.a(cuk.pj))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$3)
         .a(dfe.gs, xe.c("advancements.end.dragon_egg.title"), xe.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", cc.a.a(dfe.gs))
         .a($$1, "end/dragon_egg");
   }
}
