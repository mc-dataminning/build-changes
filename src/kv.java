import java.util.function.Consumer;

public class kv implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cwl.fz,
            vd.c("advancements.end.root.title"),
            vd.c("advancements.end.root.description"),
            new ahd("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ax.a.a(cti.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cwl.gO, vd.c("advancements.end.kill_dragon.title"), vd.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cd.a.a(bp.a.a().a(blt.D)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cmu.sc, vd.c("advancements.end.enter_end_gateway.title"), vd.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bl.a.a(cwl.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cmu.uY, vd.c("advancements.end.respawn_dragon.title"), vd.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", da.a.a(bp.a.a().a(blt.D)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cwl.kw, vd.c("advancements.end.find_end_city.title"), vd.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", cr.a.a(ci.a.c(dyt.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cmu.vg, vd.c("advancements.end.dragon_breath.title"), vd.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", by.a.a(cmu.vg))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cmu.vn, vd.c("advancements.end.levitate.title"), vd.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", ce.a.a(bg.b(ck.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cmu.nS, vd.c("advancements.end.elytra.title"), vd.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", by.a.a(cmu.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cwl.fA, vd.c("advancements.end.dragon_egg.title"), vd.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", by.a.a(cwl.fA))
         .a($$1, "end/dragon_egg");
   }
}
