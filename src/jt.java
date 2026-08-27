import java.util.function.Consumer;

public class jt implements jm {
   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            cpo.fz,
            sw.c("advancements.end.root.title"),
            sw.c("advancements.end.root.description"),
            new acq("textures/gui/advancements/backgrounds/end.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", aw.a.a(cmm.j))
         .a($$1, "end/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(cpo.gO, sw.c("advancements.end.kill_dragon.title"), sw.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", cc.a.a(bo.a.a().a(bfn.C)))
         .a($$1, "end/kill_dragon");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(cgc.rq, sw.c("advancements.end.enter_end_gateway.title"), sw.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bk.a.a(cpo.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cgc.ul, sw.c("advancements.end.respawn_dragon.title"), sw.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", da.a.a(bo.a.a().a(bfn.C)))
         .a($$1, "end/respawn_dragon");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(cpo.kw, sw.c("advancements.end.find_end_city.title"), sw.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", cq.a.a(ch.c(dru.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cgc.ut, sw.c("advancements.end.dragon_breath.title"), sw.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", bx.a.a(cgc.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cgc.uA, sw.c("advancements.end.levitate.title"), sw.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("levitated", cd.a.a(bf.b(cj.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cgc.nh, sw.c("advancements.end.elytra.title"), sw.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", bx.a.a(cgc.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(cpo.fA, sw.c("advancements.end.dragon_egg.title"), sw.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", bx.a.a(cpo.fA))
         .a($$1, "end/dragon_egg");
   }
}
