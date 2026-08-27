import java.util.function.Consumer;

public class ll implements lc {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dca.fz,
            wg.c("advancements.end.root.title"),
            wg.c("advancements.end.root.description"),
            new ajt("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cyx.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dca.gO, wg.c("advancements.end.kill_dragon.title"), wg.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bqb.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(crm.se, wg.c("advancements.end.enter_end_gateway.title"), wg.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dca.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(crm.vd, wg.c("advancements.end.respawn_dragon.title"), wg.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dc.a.a(br.a.a().a(bqb.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dca.kw, wg.c("advancements.end.find_end_city.title"), wg.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.b($$0.b(ks.aF).b(efb.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(crm.vl, wg.c("advancements.end.dragon_breath.title"), wg.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(crm.vl))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(crm.vs, wg.c("advancements.end.levitate.title"), wg.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(crm.nS, wg.c("advancements.end.elytra.title"), wg.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(crm.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dca.fA, wg.c("advancements.end.dragon_egg.title"), wg.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(dca.fA))
         .a($$1, "end/dragon_egg");
   }
}
