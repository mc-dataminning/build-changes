import java.util.function.Consumer;

public class my implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bxc<?>> $$2 = $$0.e(mh.B);
      aj $$3 = ai.a.a()
         .a(
            dne.fY,
            xa.c("advancements.end.root.title"),
            xa.c("advancements.end.root.description"),
            ali.b("gui/advancements/backgrounds/end"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", bc.a.a(djx.k))
         .a($$1, "end/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dne.hp, xa.c("advancements.end.kill_dragon.title"), xa.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cp.a.a(by.a.a().a($$2, bxc.Q)))
         .a($$1, "end/kill_dragon");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dac.tn, xa.c("advancements.end.enter_end_gateway.title"), xa.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bu.a.a(dne.ll))
         .a($$1, "end/enter_end_gateway");
      ai.a.a()
         .a($$4)
         .a(dac.wq, xa.c("advancements.end.respawn_dragon.title"), xa.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", ds.a.a(by.a.a().a($$2, bxc.Q)))
         .a($$1, "end/respawn_dragon");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dne.lc, xa.c("advancements.end.find_end_city.title"), xa.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", de.a.a(cu.a.b($$0.e(mh.be).b(erv.q))))
         .a($$1, "end/find_end_city");
      ai.a.a()
         .a($$4)
         .a(dac.wy, xa.c("advancements.end.dragon_breath.title"), xa.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", ck.a.a(dac.wy))
         .a($$1, "end/dragon_breath");
      ai.a.a()
         .a($$6)
         .a(dac.wF, xa.c("advancements.end.levitate.title"), xa.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("levitated", cq.a.a(bp.b(cw.c.b(50.0))))
         .a($$1, "end/levitate");
      ai.a.a()
         .a($$6)
         .a(dac.oD, xa.c("advancements.end.elytra.title"), xa.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", ck.a.a(dac.oD))
         .a($$1, "end/elytra");
      ai.a.a()
         .a($$4)
         .a(dne.fZ, xa.c("advancements.end.dragon_egg.title"), xa.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", ck.a.a(dne.fZ))
         .a($$1, "end/dragon_egg");
   }
}
