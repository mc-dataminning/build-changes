import java.util.function.Consumer;

public class mx implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwj<?>> $$2 = $$0.e(mg.B);
      ai $$3 = ah.a.a()
         .a(
            dlw.fU,
            ww.c("advancements.end.root.title"),
            ww.c("advancements.end.root.description"),
            ale.b("gui/advancements/backgrounds/end"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", bb.a.a(dip.k))
         .a($$1, "end/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(dlw.hl, ww.c("advancements.end.kill_dragon.title"), ww.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", co.a.a(bx.a.a().a($$2, bwj.P)))
         .a($$1, "end/kill_dragon");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cyw.tg, ww.c("advancements.end.enter_end_gateway.title"), ww.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bt.a.a(dlw.lh))
         .a($$1, "end/enter_end_gateway");
      ah.a.a()
         .a($$4)
         .a(cyw.wj, ww.c("advancements.end.respawn_dragon.title"), ww.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", dr.a.a(bx.a.a().a($$2, bwj.P)))
         .a($$1, "end/respawn_dragon");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(dlw.kY, ww.c("advancements.end.find_end_city.title"), ww.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", dd.a.a(ct.a.b($$0.e(mg.bc).b(eqc.q))))
         .a($$1, "end/find_end_city");
      ah.a.a()
         .a($$4)
         .a(cyw.wr, ww.c("advancements.end.dragon_breath.title"), ww.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", cj.a.a(cyw.wr))
         .a($$1, "end/dragon_breath");
      ah.a.a()
         .a($$6)
         .a(cyw.wy, ww.c("advancements.end.levitate.title"), ww.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("levitated", cp.a.a(bo.b(cv.c.b(50.0))))
         .a($$1, "end/levitate");
      ah.a.a()
         .a($$6)
         .a(cyw.oy, ww.c("advancements.end.elytra.title"), ww.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", cj.a.a(cyw.oy))
         .a($$1, "end/elytra");
      ah.a.a()
         .a($$4)
         .a(dlw.fV, ww.c("advancements.end.dragon_egg.title"), ww.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", cj.a.a(dlw.fV))
         .a($$1, "end/dragon_egg");
   }
}
