import java.util.function.Consumer;

public class lc implements kt {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dac.fz,
            vu.c("advancements.end.root.title"),
            vu.c("advancements.end.root.description"),
            new ajh("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cwz.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dac.gO, vu.c("advancements.end.kill_dragon.title"), vu.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bpc.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cqn.se, vu.c("advancements.end.enter_end_gateway.title"), vu.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dac.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cqn.vc, vu.c("advancements.end.respawn_dragon.title"), vu.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dc.a.a(br.a.a().a(bpc.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dac.kw, vu.c("advancements.end.find_end_city.title"), vu.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.c(ecw.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cqn.vk, vu.c("advancements.end.dragon_breath.title"), vu.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(cqn.vk))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cqn.vr, vu.c("advancements.end.levitate.title"), vu.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cqn.nS, vu.c("advancements.end.elytra.title"), vu.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(cqn.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dac.fA, vu.c("advancements.end.dragon_egg.title"), vu.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(dac.fA))
         .a($$1, "end/dragon_egg");
   }
}
