import java.util.function.Consumer;

public class mr implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bus<?>> $$2 = $$0.d(ma.z);
      ah $$3 = ag.a.a()
         .a(
            dis.fz,
            xj.c("advancements.end.root.title"),
            xj.c("advancements.end.root.description"),
            alj.b("textures/gui/advancements/backgrounds/end.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_end", ba.a.a(dfm.k))
         .a($$1, "end/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(dis.gO, xj.c("advancements.end.kill_dragon.title"), xj.c("advancements.end.kill_dragon.description"), null, an.a, true, true, false)
         .a("killed_dragon", dc.a.a(bw.a.a().a($$2, bus.O)))
         .a($$1, "end/kill_dragon");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwq.sw, xj.c("advancements.end.enter_end_gateway.title"), xj.c("advancements.end.enter_end_gateway.description"), null, an.a, true, true, false)
         .a("entered_end_gateway", bs.a.a(dis.kF))
         .a($$1, "end/enter_end_gateway");
      ag.a.a()
         .a($$4)
         .a(cwq.vx, xj.c("advancements.end.respawn_dragon.title"), xj.c("advancements.end.respawn_dragon.description"), null, an.c, true, true, false)
         .a("summoned_dragon", ef.a.a(bw.a.a().a($$2, bus.O)))
         .a($$1, "end/respawn_dragon");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dis.kw, xj.c("advancements.end.find_end_city.title"), xj.c("advancements.end.find_end_city.description"), null, an.a, true, true, false)
         .a("in_city", ds.a.a(dh.a.b($$0.d(ma.aS).b(emc.q))))
         .a($$1, "end/find_end_city");
      ag.a.a()
         .a($$4)
         .a(cwq.vF, xj.c("advancements.end.dragon_breath.title"), xj.c("advancements.end.dragon_breath.description"), null, an.c, true, true, false)
         .a("dragon_breath", ci.a.a(cwq.vF))
         .a($$1, "end/dragon_breath");
      ag.a.a()
         .a($$6)
         .a(cwq.vM, xj.c("advancements.end.levitate.title"), xj.c("advancements.end.levitate.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("levitated", dd.a.a(bn.b(dj.c.b(50.0))))
         .a($$1, "end/levitate");
      ag.a.a()
         .a($$6)
         .a(cwq.nU, xj.c("advancements.end.elytra.title"), xj.c("advancements.end.elytra.description"), null, an.c, true, true, false)
         .a("elytra", ci.a.a(cwq.nU))
         .a($$1, "end/elytra");
      ag.a.a()
         .a($$4)
         .a(dis.fA, xj.c("advancements.end.dragon_egg.title"), xj.c("advancements.end.dragon_egg.description"), null, an.c, true, true, false)
         .a("dragon_egg", ci.a.a(dis.fA))
         .a($$1, "end/dragon_egg");
   }
}
