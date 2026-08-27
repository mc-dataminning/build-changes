import java.util.function.Consumer;

public class jt implements jm {
   @Override
   public void a(hg.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            cte.fz,
            tl.c("advancements.end.root.title"),
            tl.c("advancements.end.root.description"),
            new aez("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cqb.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(cte.gO, tl.c("advancements.end.kill_dragon.title"), tl.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(bja.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cjo.rq, tl.c("advancements.end.enter_end_gateway.title"), tl.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(cte.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cjo.ul, tl.c("advancements.end.respawn_dragon.title"), tl.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(bja.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(cte.kw, tl.c("advancements.end.find_end_city.title"), tl.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(duw.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cjo.ut, tl.c("advancements.end.dragon_breath.title"), tl.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(cjo.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cjo.uA, tl.c("advancements.end.levitate.title"), tl.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cjo.nh, tl.c("advancements.end.elytra.title"), tl.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(cjo.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cte.fA, tl.c("advancements.end.dragon_egg.title"), tl.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(cte.fA))
         .a($$1, "end/dragon_egg");
   }
}
