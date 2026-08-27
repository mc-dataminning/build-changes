import java.util.function.Consumer;

public class kt implements km {
   @Override
   public void a(ih.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwb.fz,
            vb.c("advancements.end.root.title"),
            vb.c("advancements.end.root.description"),
            new agt("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ax.a.a(csy.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cwb.gO, vb.c("advancements.end.kill_dragon.title"), vb.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cd.a.a(bp.a.a().a(blj.D)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cmk.sc, vb.c("advancements.end.enter_end_gateway.title"), vb.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bl.a.a(cwb.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cmk.uY, vb.c("advancements.end.respawn_dragon.title"), vb.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", da.a.a(bp.a.a().a(blj.D)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cwb.kw, vb.c("advancements.end.find_end_city.title"), vb.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", cr.a.a(ci.a.c(dyi.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cmk.vg, vb.c("advancements.end.dragon_breath.title"), vb.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", by.a.a(cmk.vg))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cmk.vn, vb.c("advancements.end.levitate.title"), vb.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", ce.a.a(bg.b(ck.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cmk.nS, vb.c("advancements.end.elytra.title"), vb.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", by.a.a(cmk.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cwb.fA, vb.c("advancements.end.dragon_egg.title"), vb.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", by.a.a(cwb.fA))
         .a($$1, "end/dragon_egg");
   }
}
