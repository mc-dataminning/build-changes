import java.util.function.Consumer;

public class kx implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cws.fz,
            vf.c("advancements.end.root.title"),
            vf.c("advancements.end.root.description"),
            new ahg("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ax.a.a(ctp.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cws.gO, vf.c("advancements.end.kill_dragon.title"), vf.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cd.a.a(bp.a.a().a(blz.D)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cnb.sc, vf.c("advancements.end.enter_end_gateway.title"), vf.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bl.a.a(cws.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cnb.uY, vf.c("advancements.end.respawn_dragon.title"), vf.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", da.a.a(bp.a.a().a(blz.D)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cws.kw, vf.c("advancements.end.find_end_city.title"), vf.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", cr.a.a(ci.a.c(dza.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cnb.vg, vf.c("advancements.end.dragon_breath.title"), vf.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", by.a.a(cnb.vg))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cnb.vn, vf.c("advancements.end.levitate.title"), vf.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", ce.a.a(bg.b(ck.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cnb.nS, vf.c("advancements.end.elytra.title"), vf.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", by.a.a(cnb.nS))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cws.fA, vf.c("advancements.end.dragon_egg.title"), vf.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", by.a.a(cws.fA))
         .a($$1, "end/dragon_egg");
   }
}
