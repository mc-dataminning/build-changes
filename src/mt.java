import java.util.function.Consumer;

public class mt implements mm {
   @Override
   public void a(jt.a $$0, Consumer<ai> $$1) {
      js<buq<?>> $$2 = $$0.d(mc.z);
      ai $$3 = ah.a.a()
         .a(
            djm.fU,
            wo.c("advancements.end.root.title"),
            wo.c("advancements.end.root.description"),
            aku.b("textures/gui/advancements/backgrounds/end.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", bb.a.a(dgg.k))
         .a($$1, "end/root");
      ai $$4 = ah.a.a()
         .a($$3)
         .a(djm.hl, wo.c("advancements.end.kill_dragon.title"), wo.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", dd.a.a(bx.a.a().a($$2, buq.P)))
         .a($$1, "end/kill_dragon");
      ai $$5 = ah.a.a()
         .a($$4)
         .a(cwr.tc, wo.c("advancements.end.enter_end_gateway.title"), wo.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bt.a.a(djm.lh))
         .a($$1, "end/enter_end_gateway");
      ah.a.a()
         .a($$4)
         .a(cwr.wf, wo.c("advancements.end.respawn_dragon.title"), wo.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", eg.a.a(bx.a.a().a($$2, buq.P)))
         .a($$1, "end/respawn_dragon");
      ai $$6 = ah.a.a()
         .a($$5)
         .a(djm.kY, wo.c("advancements.end.find_end_city.title"), wo.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", dt.a.a(di.a.b($$0.d(mc.aU).b(ene.q))))
         .a($$1, "end/find_end_city");
      ah.a.a()
         .a($$4)
         .a(cwr.wn, wo.c("advancements.end.dragon_breath.title"), wo.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", cj.a.a(cwr.wn))
         .a($$1, "end/dragon_breath");
      ah.a.a()
         .a($$6)
         .a(cwr.wu, wo.c("advancements.end.levitate.title"), wo.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(am.a.a(50))
         .a("levitated", de.a.a(bo.b(dk.c.b(50.0))))
         .a($$1, "end/levitate");
      ah.a.a()
         .a($$6)
         .a(cwr.ow, wo.c("advancements.end.elytra.title"), wo.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", cj.a.a(cwr.ow))
         .a($$1, "end/elytra");
      ah.a.a()
         .a($$4)
         .a(djm.fV, wo.c("advancements.end.dragon_egg.title"), wo.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", cj.a.a(djm.fV))
         .a($$1, "end/dragon_egg");
   }
}
