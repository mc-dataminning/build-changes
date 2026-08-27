import java.util.function.Consumer;

public class ln implements le {
   @Override
   public void a(ip.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcj.fz,
            wi.c("advancements.end.root.title"),
            wi.c("advancements.end.root.description"),
            new ajv("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(czg.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dcj.gO, wi.c("advancements.end.kill_dragon.title"), wi.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bqg.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(crv.se, wi.c("advancements.end.enter_end_gateway.title"), wi.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dcj.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(crv.vd, wi.c("advancements.end.respawn_dragon.title"), wi.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dd.a.a(br.a.a().a(bqg.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dcj.kw, wi.c("advancements.end.find_end_city.title"), wi.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.b($$0.b(ku.aG).b(efk.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(crv.vl, wi.c("advancements.end.dragon_breath.title"), wi.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(crv.vl))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(crv.vs, wi.c("advancements.end.levitate.title"), wi.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(crv.nS, wi.c("advancements.end.elytra.title"), wi.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(crv.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dcj.fA, wi.c("advancements.end.dragon_egg.title"), wi.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(dcj.fA))
         .a($$1, "end/dragon_egg");
   }
}
