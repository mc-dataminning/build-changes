import java.util.function.Consumer;

public class ju implements jn {
   @Override
   public void a(hh.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csl.fz,
            te.c("advancements.end.root.title"),
            te.c("advancements.end.root.description"),
            new aep("textures/gui/advancements/backgrounds/end.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", aw.a.a(cpk.j))
         .a($$1, "end/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(csl.gO, te.c("advancements.end.kill_dragon.title"), te.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", cc.a.a(bo.a.a().a(bik.C)))
         .a($$1, "end/kill_dragon");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(ciz.rq, te.c("advancements.end.enter_end_gateway.title"), te.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bk.a.a(csl.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(ciz.ul, te.c("advancements.end.respawn_dragon.title"), te.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", da.a.a(bo.a.a().a(bik.C)))
         .a($$1, "end/respawn_dragon");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(csl.kw, te.c("advancements.end.find_end_city.title"), te.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", cq.a.a(ch.c(dur.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(ciz.ut, te.c("advancements.end.dragon_breath.title"), te.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", bx.a.a(ciz.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(ciz.uA, te.c("advancements.end.levitate.title"), te.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("levitated", cd.a.a(bf.b(cj.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(ciz.nh, te.c("advancements.end.elytra.title"), te.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", bx.a.a(ciz.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(csl.fA, te.c("advancements.end.dragon_egg.title"), te.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", bx.a.a(csl.fA))
         .a($$1, "end/dragon_egg");
   }
}
