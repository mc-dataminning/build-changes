import java.util.function.Consumer;

public class kq implements kj {
   @Override
   public void a(id.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cvc.fz,
            ur.c("advancements.end.root.title"),
            ur.c("advancements.end.root.description"),
            new agi("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(csa.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cvc.gO, ur.c("advancements.end.kill_dragon.title"), ur.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(bku.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(clm.sc, ur.c("advancements.end.enter_end_gateway.title"), ur.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(cvc.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(clm.uX, ur.c("advancements.end.respawn_dragon.title"), ur.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(bku.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cvc.kw, ur.c("advancements.end.find_end_city.title"), ur.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(dxb.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(clm.vf, ur.c("advancements.end.dragon_breath.title"), ur.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(clm.vf))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(clm.vm, ur.c("advancements.end.levitate.title"), ur.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(clm.nS, ur.c("advancements.end.elytra.title"), ur.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(clm.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cvc.fA, ur.c("advancements.end.dragon_egg.title"), ur.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(cvc.fA))
         .a($$1, "end/dragon_egg");
   }
}
