import java.util.function.Consumer;

public class mx implements mq {
   @Override
   public void a(jg.a $$0, Consumer<ai> $$1) {
      jf<bwm<?>> $$2 = $$0.e(mg.B);
      ai $$3 = ah.a.a()
         .a(
            dmc.fV,
            wy.c("advancements.end.root.title"),
            wy.c("advancements.end.root.description"),
            alg.b("gui/advancements/backgrounds/end"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", bb.a.a(div.k))
         .a($$1, "end/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(dmc.hm, wy.c("advancements.end.kill_dragon.title"), wy.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", co.a.a(bx.a.a().a($$2, bwm.P)))
         .a($$1, "end/kill_dragon");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(czc.ti, wy.c("advancements.end.enter_end_gateway.title"), wy.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bt.a.a(dmc.li))
         .a($$1, "end/enter_end_gateway");
      ah.a.a()
         .a($$4)
         .a(czc.wl, wy.c("advancements.end.respawn_dragon.title"), wy.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", dr.a.a(bx.a.a().a($$2, bwm.P)))
         .a($$1, "end/respawn_dragon");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(dmc.kZ, wy.c("advancements.end.find_end_city.title"), wy.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", dd.a.a(ct.a.b($$0.e(mg.bd).b(eqn.q))))
         .a($$1, "end/find_end_city");
      ah.a.a()
         .a($$4)
         .a(czc.wt, wy.c("advancements.end.dragon_breath.title"), wy.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", cj.a.a(czc.wt))
         .a($$1, "end/dragon_breath");
      ah.a.a()
         .a($$6)
         .a(czc.wA, wy.c("advancements.end.levitate.title"), wy.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("levitated", cp.a.a(bo.b(cv.c.b(50.0))))
         .a($$1, "end/levitate");
      ah.a.a()
         .a($$6)
         .a(czc.oA, wy.c("advancements.end.elytra.title"), wy.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", cj.a.a(czc.oA))
         .a($$1, "end/elytra");
      ah.a.a()
         .a($$4)
         .a(dmc.fW, wy.c("advancements.end.dragon_egg.title"), wy.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", cj.a.a(dmc.fW))
         .a($$1, "end/dragon_egg");
   }
}
