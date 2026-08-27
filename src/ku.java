import java.util.function.Consumer;

public class ku implements kn {
   @Override
   public void a(ii.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvh.fz,
            uv.c("advancements.end.root.title"),
            uv.c("advancements.end.root.description"),
            new agm("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(csf.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cvh.gO, uv.c("advancements.end.kill_dragon.title"), uv.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(bkz.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(clr.sc, uv.c("advancements.end.enter_end_gateway.title"), uv.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(cvh.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(clr.uX, uv.c("advancements.end.respawn_dragon.title"), uv.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(bkz.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cvh.kw, uv.c("advancements.end.find_end_city.title"), uv.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(dxg.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(clr.vf, uv.c("advancements.end.dragon_breath.title"), uv.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(clr.vf))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(clr.vm, uv.c("advancements.end.levitate.title"), uv.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(clr.nS, uv.c("advancements.end.elytra.title"), uv.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(clr.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cvh.fA, uv.c("advancements.end.dragon_egg.title"), uv.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(cvh.fA))
         .a($$1, "end/dragon_egg");
   }
}
