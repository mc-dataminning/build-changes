import java.util.function.Consumer;

public class mi implements mb {
   @Override
   public void a(jl.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dfh.fz,
            wu.c("advancements.end.root.title"),
            wu.c("advancements.end.root.description"),
            new akk("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(dcd.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dfh.gO, wu.c("advancements.end.kill_dragon.title"), wu.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cx.a.a(bu.a.a().a(bsj.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cud.sf, wu.c("advancements.end.enter_end_gateway.title"), wu.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bq.a.a(dfh.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cud.vf, wu.c("advancements.end.respawn_dragon.title"), wu.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dz.a.a(bu.a.a().a(bsj.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dfh.kw, wu.c("advancements.end.find_end_city.title"), wu.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", dm.a.a(dc.a.b($$0.b(lr.aQ).b(eik.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cud.vn, wu.c("advancements.end.dragon_breath.title"), wu.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ce.a.a(cud.vn))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cud.vu, wu.c("advancements.end.levitate.title"), wu.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cy.a.a(bl.b(de.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cud.nT, wu.c("advancements.end.elytra.title"), wu.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ce.a.a(cud.nT))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dfh.fA, wu.c("advancements.end.dragon_egg.title"), wu.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ce.a.a(dfh.fA))
         .a($$1, "end/dragon_egg");
   }
}
