import java.util.function.Consumer;

public class kz implements kq {
   @Override
   public void a(il.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cyu.fz,
            vq.c("advancements.end.root.title"),
            vq.c("advancements.end.root.description"),
            new aiy("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cvr.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cyu.gO, vq.c("advancements.end.kill_dragon.title"), vq.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cf.a.a(br.a.a().a(bnw.E)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cpg.se, vq.c("advancements.end.enter_end_gateway.title"), vq.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(cyu.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cpg.vb, vq.c("advancements.end.respawn_dragon.title"), vq.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dc.a.a(br.a.a().a(bnw.E)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cyu.kw, vq.c("advancements.end.find_end_city.title"), vq.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", ct.a.a(ck.a.c(ebf.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cpg.vj, vq.c("advancements.end.dragon_breath.title"), vq.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", ca.a.a(cpg.vj))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cpg.vq, vq.c("advancements.end.levitate.title"), vq.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cg.a.a(bi.b(cm.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cpg.nS, vq.c("advancements.end.elytra.title"), vq.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", ca.a.a(cpg.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cyu.fA, vq.c("advancements.end.dragon_egg.title"), vq.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", ca.a.a(cyu.fA))
         .a($$1, "end/dragon_egg");
   }
}
