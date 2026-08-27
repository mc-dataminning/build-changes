import java.util.function.Consumer;

public class kx implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cxa.fz,
            vg.c("advancements.end.root.title"),
            vg.c("advancements.end.root.description"),
            new ahh("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ax.a.a(ctx.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cxa.gO, vg.c("advancements.end.kill_dragon.title"), vg.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cd.a.a(bp.a.a().a(bmc.E)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cnj.se, vg.c("advancements.end.enter_end_gateway.title"), vg.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bl.a.a(cxa.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cnj.vb, vg.c("advancements.end.respawn_dragon.title"), vg.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", da.a.a(bp.a.a().a(bmc.E)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cxa.kw, vg.c("advancements.end.find_end_city.title"), vg.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", cr.a.a(ci.a.c(dzi.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cnj.vj, vg.c("advancements.end.dragon_breath.title"), vg.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", by.a.a(cnj.vj))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cnj.vq, vg.c("advancements.end.levitate.title"), vg.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", ce.a.a(bg.b(ck.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cnj.nS, vg.c("advancements.end.elytra.title"), vg.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", by.a.a(cnj.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cxa.fA, vg.c("advancements.end.dragon_egg.title"), vg.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", by.a.a(cxa.fA))
         .a($$1, "end/dragon_egg");
   }
}
