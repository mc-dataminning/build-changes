import java.util.function.Consumer;

public class lb implements ks {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            czh.fz,
            vs.c("advancements.end.root.title"),
            vs.c("advancements.end.root.description"),
            new ajc("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cwe.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(czh.gO, vs.c("advancements.end.kill_dragon.title"), vs.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bol.E)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cpt.se, vs.c("advancements.end.enter_end_gateway.title"), vs.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(czh.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cpt.vb, vs.c("advancements.end.respawn_dragon.title"), vs.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dc.a.a(br.a.a().a(bol.E)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(czh.kw, vs.c("advancements.end.find_end_city.title"), vs.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.c(eca.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cpt.vj, vs.c("advancements.end.dragon_breath.title"), vs.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(cpt.vj))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cpt.vq, vs.c("advancements.end.levitate.title"), vs.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cpt.nS, vs.c("advancements.end.elytra.title"), vs.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(cpt.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(czh.fA, vs.c("advancements.end.dragon_egg.title"), vs.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(czh.fA))
         .a($$1, "end/dragon_egg");
   }
}
