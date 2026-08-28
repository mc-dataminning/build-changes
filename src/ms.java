import java.util.function.Consumer;

public class ms implements ml {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bvi<?>> $$2 = $$0.d(mb.z);
      ah $$3 = ag.a.a()
         .a(
            dkf.fU,
            xk.c("advancements.end.root.title"),
            xk.c("advancements.end.root.description"),
            alp.b("textures/gui/advancements/backgrounds/end.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_end", ba.a.a(dgz.k))
         .a($$1, "end/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(dkf.hl, xk.c("advancements.end.kill_dragon.title"), xk.c("advancements.end.kill_dragon.description"), null, an.a, true, true, false)
         .a("killed_dragon", dc.a.a(bw.a.a().a($$2, bvi.Q)))
         .a($$1, "end/kill_dragon");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cxk.tc, xk.c("advancements.end.enter_end_gateway.title"), xk.c("advancements.end.enter_end_gateway.description"), null, an.a, true, true, false)
         .a("entered_end_gateway", bs.a.a(dkf.lh))
         .a($$1, "end/enter_end_gateway");
      ag.a.a()
         .a($$4)
         .a(cxk.wf, xk.c("advancements.end.respawn_dragon.title"), xk.c("advancements.end.respawn_dragon.description"), null, an.c, true, true, false)
         .a("summoned_dragon", ef.a.a(bw.a.a().a($$2, bvi.Q)))
         .a($$1, "end/respawn_dragon");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dkf.kY, xk.c("advancements.end.find_end_city.title"), xk.c("advancements.end.find_end_city.description"), null, an.a, true, true, false)
         .a("in_city", ds.a.a(dh.a.b($$0.d(mb.aU).b(enx.q))))
         .a($$1, "end/find_end_city");
      ag.a.a()
         .a($$4)
         .a(cxk.wn, xk.c("advancements.end.dragon_breath.title"), xk.c("advancements.end.dragon_breath.description"), null, an.c, true, true, false)
         .a("dragon_breath", ci.a.a(cxk.wn))
         .a($$1, "end/dragon_breath");
      ag.a.a()
         .a($$6)
         .a(cxk.wu, xk.c("advancements.end.levitate.title"), xk.c("advancements.end.levitate.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("levitated", dd.a.a(bn.b(dj.c.b(50.0))))
         .a($$1, "end/levitate");
      ag.a.a()
         .a($$6)
         .a(cxk.ow, xk.c("advancements.end.elytra.title"), xk.c("advancements.end.elytra.description"), null, an.c, true, true, false)
         .a("elytra", ci.a.a(cxk.ow))
         .a($$1, "end/elytra");
      ag.a.a()
         .a($$4)
         .a(dkf.fV, xk.c("advancements.end.dragon_egg.title"), xk.c("advancements.end.dragon_egg.description"), null, an.c, true, true, false)
         .a("dragon_egg", ci.a.a(dkf.fV))
         .a($$1, "end/dragon_egg");
   }
}
