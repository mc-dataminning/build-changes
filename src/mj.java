import java.util.function.Consumer;

public class mj implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dez.fz,
            xo.c("advancements.end.root.title"),
            xo.c("advancements.end.root.description"),
            new ale("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(dbw.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dez.gO, xo.c("advancements.end.kill_dragon.title"), xo.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cx.a.a(bu.a.a().a(bsy.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cuq.sf, xo.c("advancements.end.enter_end_gateway.title"), xo.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bq.a.a(dez.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cuq.vf, xo.c("advancements.end.respawn_dragon.title"), xo.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dy.a.a(bu.a.a().a(bsy.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dez.kw, xo.c("advancements.end.find_end_city.title"), xo.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eic.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cuq.vn, xo.c("advancements.end.dragon_breath.title"), xo.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ce.a.a(cuq.vn))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cuq.vu, xo.c("advancements.end.levitate.title"), xo.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cy.a.a(bl.b(de.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cuq.nT, xo.c("advancements.end.elytra.title"), xo.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ce.a.a(cuq.nT))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dez.fA, xo.c("advancements.end.dragon_egg.title"), xo.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ce.a.a(dez.fA))
         .a($$1, "end/dragon_egg");
   }
}
