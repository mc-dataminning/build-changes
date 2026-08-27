import java.util.function.Consumer;

public class lc implements kt {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dae.fz,
            vu.c("advancements.end.root.title"),
            vu.c("advancements.end.root.description"),
            new ajh("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cxb.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dae.gO, vu.c("advancements.end.kill_dragon.title"), vu.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bpd.G)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cqp.se, vu.c("advancements.end.enter_end_gateway.title"), vu.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dae.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cqp.vd, vu.c("advancements.end.respawn_dragon.title"), vu.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dc.a.a(br.a.a().a(bpd.G)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dae.kw, vu.c("advancements.end.find_end_city.title"), vu.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.c(ecy.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cqp.vl, vu.c("advancements.end.dragon_breath.title"), vu.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(cqp.vl))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cqp.vs, vu.c("advancements.end.levitate.title"), vu.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cqp.nS, vu.c("advancements.end.elytra.title"), vu.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(cqp.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dae.fA, vu.c("advancements.end.dragon_egg.title"), vu.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(dae.fA))
         .a($$1, "end/dragon_egg");
   }
}
