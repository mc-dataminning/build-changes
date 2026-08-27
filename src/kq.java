import java.util.function.Consumer;

public class kq implements kj {
   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cuc.fz,
            ui.c("advancements.end.root.title"),
            ui.c("advancements.end.root.description"),
            new afw("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cqz.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cuc.gO, ui.c("advancements.end.kill_dragon.title"), ui.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(bjx.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ckm.rq, ui.c("advancements.end.enter_end_gateway.title"), ui.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(cuc.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(ckm.ul, ui.c("advancements.end.respawn_dragon.title"), ui.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(bjx.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cuc.kw, ui.c("advancements.end.find_end_city.title"), ui.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(dvu.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(ckm.ut, ui.c("advancements.end.dragon_breath.title"), ui.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(ckm.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(ckm.uA, ui.c("advancements.end.levitate.title"), ui.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(ckm.nh, ui.c("advancements.end.elytra.title"), ui.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(ckm.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cuc.fA, ui.c("advancements.end.dragon_egg.title"), ui.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(cuc.fA))
         .a($$1, "end/dragon_egg");
   }
}
