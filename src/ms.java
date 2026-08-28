import java.util.function.Consumer;

public class ms implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvq<?>> $$2 = $$0.d(mb.z);
      ah $$3 = ag.a.a()
         .a(
            dkn.fN,
            xv.c("advancements.end.root.title"),
            xv.c("advancements.end.root.description"),
            alz.b("textures/gui/advancements/backgrounds/end.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_end", ba.a.a(dhh.k))
         .a($$1, "end/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(dkn.he, xv.c("advancements.end.kill_dragon.title"), xv.c("advancements.end.kill_dragon.description"), null, an.a, true, true, false)
         .a("killed_dragon", dc.a.a(bw.a.a().a($$2, bvq.Q)))
         .a($$1, "end/kill_dragon");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cxs.sT, xv.c("advancements.end.enter_end_gateway.title"), xv.c("advancements.end.enter_end_gateway.description"), null, an.a, true, true, false)
         .a("entered_end_gateway", bs.a.a(dkn.la))
         .a($$1, "end/enter_end_gateway");
      ag.a.a()
         .a($$4)
         .a(cxs.vV, xv.c("advancements.end.respawn_dragon.title"), xv.c("advancements.end.respawn_dragon.description"), null, an.c, true, true, false)
         .a("summoned_dragon", ef.a.a(bw.a.a().a($$2, bvq.Q)))
         .a($$1, "end/respawn_dragon");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dkn.kR, xv.c("advancements.end.find_end_city.title"), xv.c("advancements.end.find_end_city.description"), null, an.a, true, true, false)
         .a("in_city", ds.a.a(dh.a.b($$0.d(mb.aU).b(eod.q))))
         .a($$1, "end/find_end_city");
      ag.a.a()
         .a($$4)
         .a(cxs.wd, xv.c("advancements.end.dragon_breath.title"), xv.c("advancements.end.dragon_breath.description"), null, an.c, true, true, false)
         .a("dragon_breath", ci.a.a(cxs.wd))
         .a($$1, "end/dragon_breath");
      ag.a.a()
         .a($$6)
         .a(cxs.wk, xv.c("advancements.end.levitate.title"), xv.c("advancements.end.levitate.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("levitated", dd.a.a(bn.b(dj.c.b(50.0))))
         .a($$1, "end/levitate");
      ag.a.a()
         .a($$6)
         .a(cxs.on, xv.c("advancements.end.elytra.title"), xv.c("advancements.end.elytra.description"), null, an.c, true, true, false)
         .a("elytra", ci.a.a(cxs.on))
         .a($$1, "end/elytra");
      ag.a.a()
         .a($$4)
         .a(dkn.fO, xv.c("advancements.end.dragon_egg.title"), xv.c("advancements.end.dragon_egg.description"), null, an.c, true, true, false)
         .a("dragon_egg", ci.a.a(dkn.fO))
         .a($$1, "end/dragon_egg");
   }
}
