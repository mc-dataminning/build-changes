import java.util.function.Consumer;

public class mv implements mo {
   @Override
   public void a(ju.a $$0, Consumer<ai> $$1) {
      jt<bwb<?>> $$2 = $$0.e(me.z);
      ai $$3 = ah.a.a()
         .a(
            dkw.fU,
            wv.c("advancements.end.root.title"),
            wv.c("advancements.end.root.description"),
            ald.b("textures/gui/advancements/backgrounds/end.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", bb.a.a(dhp.k))
         .a($$1, "end/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(dkw.hl, wv.c("advancements.end.kill_dragon.title"), wv.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", dd.a.a(bx.a.a().a($$2, bwb.P)))
         .a($$1, "end/kill_dragon");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cyc.tg, wv.c("advancements.end.enter_end_gateway.title"), wv.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bt.a.a(dkw.lh))
         .a($$1, "end/enter_end_gateway");
      ah.a.a()
         .a($$4)
         .a(cyc.wj, wv.c("advancements.end.respawn_dragon.title"), wv.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", eg.a.a(bx.a.a().a($$2, bwb.P)))
         .a($$1, "end/respawn_dragon");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(dkw.kY, wv.c("advancements.end.find_end_city.title"), wv.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", dt.a.a(di.a.b($$0.e(me.aZ).b(epa.q))))
         .a($$1, "end/find_end_city");
      ah.a.a()
         .a($$4)
         .a(cyc.wr, wv.c("advancements.end.dragon_breath.title"), wv.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", cj.a.a(cyc.wr))
         .a($$1, "end/dragon_breath");
      ah.a.a()
         .a($$6)
         .a(cyc.wy, wv.c("advancements.end.levitate.title"), wv.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("levitated", de.a.a(bo.b(dk.c.b(50.0))))
         .a($$1, "end/levitate");
      ah.a.a()
         .a($$6)
         .a(cyc.oy, wv.c("advancements.end.elytra.title"), wv.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", cj.a.a(cyc.oy))
         .a($$1, "end/elytra");
      ah.a.a()
         .a($$4)
         .a(dkw.fV, wv.c("advancements.end.dragon_egg.title"), wv.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", cj.a.a(dkw.fV))
         .a($$1, "end/dragon_egg");
   }
}
