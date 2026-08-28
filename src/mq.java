import java.util.function.Consumer;

public class mq implements mj {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bul<?>> $$2 = $$0.d(lz.z);
      ah $$3 = ag.a.a()
         .a(
            dig.fz,
            xi.c("advancements.end.root.title"),
            xi.c("advancements.end.root.description"),
            ali.b("textures/gui/advancements/backgrounds/end.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_end", ba.a.a(dfb.k))
         .a($$1, "end/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(dig.gO, xi.c("advancements.end.kill_dragon.title"), xi.c("advancements.end.kill_dragon.description"), null, an.a, true, true, false)
         .a("killed_dragon", dc.a.a(bw.a.a().a($$2, bul.F)))
         .a($$1, "end/kill_dragon");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwf.sg, xi.c("advancements.end.enter_end_gateway.title"), xi.c("advancements.end.enter_end_gateway.description"), null, an.a, true, true, false)
         .a("entered_end_gateway", bs.a.a(dig.kF))
         .a($$1, "end/enter_end_gateway");
      ag.a.a()
         .a($$4)
         .a(cwf.vh, xi.c("advancements.end.respawn_dragon.title"), xi.c("advancements.end.respawn_dragon.description"), null, an.c, true, true, false)
         .a("summoned_dragon", ef.a.a(bw.a.a().a($$2, bul.F)))
         .a($$1, "end/respawn_dragon");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dig.kw, xi.c("advancements.end.find_end_city.title"), xi.c("advancements.end.find_end_city.description"), null, an.a, true, true, false)
         .a("in_city", ds.a.a(dh.a.b($$0.d(lz.aS).b(elr.q))))
         .a($$1, "end/find_end_city");
      ag.a.a()
         .a($$4)
         .a(cwf.vp, xi.c("advancements.end.dragon_breath.title"), xi.c("advancements.end.dragon_breath.description"), null, an.c, true, true, false)
         .a("dragon_breath", ci.a.a(cwf.vp))
         .a($$1, "end/dragon_breath");
      ag.a.a()
         .a($$6)
         .a(cwf.vw, xi.c("advancements.end.levitate.title"), xi.c("advancements.end.levitate.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("levitated", dd.a.a(bn.b(dj.c.b(50.0))))
         .a($$1, "end/levitate");
      ag.a.a()
         .a($$6)
         .a(cwf.nU, xi.c("advancements.end.elytra.title"), xi.c("advancements.end.elytra.description"), null, an.c, true, true, false)
         .a("elytra", ci.a.a(cwf.nU))
         .a($$1, "end/elytra");
      ag.a.a()
         .a($$4)
         .a(dig.fA, xi.c("advancements.end.dragon_egg.title"), xi.c("advancements.end.dragon_egg.description"), null, an.c, true, true, false)
         .a("dragon_egg", ci.a.a(dig.fA))
         .a($$1, "end/dragon_egg");
   }
}
