import java.util.function.Consumer;

public class lw implements ln {
   @Override
   public void a(ix.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dcx.fz,
            ws.c("advancements.end.root.title"),
            ws.c("advancements.end.root.description"),
            new akf("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(czu.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dcx.gO, ws.c("advancements.end.kill_dragon.title"), ws.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cl.a.a(br.a.a().a(bqr.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(csg.sf, ws.c("advancements.end.enter_end_gateway.title"), ws.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dcx.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(csg.vf, ws.c("advancements.end.respawn_dragon.title"), ws.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dk.a.a(br.a.a().a(bqr.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dcx.kw, ws.c("advancements.end.find_end_city.title"), ws.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", cz.a.a(cq.a.b($$0.b(ld.aI).b(ega.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(csg.vn, ws.c("advancements.end.dragon_breath.title"), ws.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(csg.vn))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(csg.vu, ws.c("advancements.end.levitate.title"), ws.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cm.a.a(bi.b(cs.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(csg.nT, ws.c("advancements.end.elytra.title"), ws.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(csg.nT))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dcx.fA, ws.c("advancements.end.dragon_egg.title"), ws.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(dcx.fA))
         .a($$1, "end/dragon_egg");
   }
}
