import java.util.function.Consumer;

public class jv implements jo {
   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csw.fz,
            tl.c("advancements.end.root.title"),
            tl.c("advancements.end.root.description"),
            new aex("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cpv.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(csw.gO, tl.c("advancements.end.kill_dragon.title"), tl.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(biu.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cji.rq, tl.c("advancements.end.enter_end_gateway.title"), tl.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(csw.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cji.ul, tl.c("advancements.end.respawn_dragon.title"), tl.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(biu.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csw.kw, tl.c("advancements.end.find_end_city.title"), tl.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(dvc.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cji.ut, tl.c("advancements.end.dragon_breath.title"), tl.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(cji.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cji.uA, tl.c("advancements.end.levitate.title"), tl.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cji.nh, tl.c("advancements.end.elytra.title"), tl.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(cji.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(csw.fA, tl.c("advancements.end.dragon_egg.title"), tl.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(csw.fA))
         .a($$1, "end/dragon_egg");
   }
}
