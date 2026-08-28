import java.util.function.Consumer;

public class my implements mr {
   @Override
   public void a(jh.a $$0, Consumer<aj> $$1) {
      jg<bwr<?>> $$2 = $$0.e(mh.B);
      aj $$3 = ai.a.a()
         .a(
            dmo.fY,
            wy.c("advancements.end.root.title"),
            wy.c("advancements.end.root.description"),
            alg.b("gui/advancements/backgrounds/end"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", bc.a.a(djh.k))
         .a($$1, "end/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dmo.hp, wy.c("advancements.end.kill_dragon.title"), wy.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cp.a.a(by.a.a().a($$2, bwr.P)))
         .a($$1, "end/kill_dragon");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(czo.tn, wy.c("advancements.end.enter_end_gateway.title"), wy.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bu.a.a(dmo.ll))
         .a($$1, "end/enter_end_gateway");
      ai.a.a()
         .a($$4)
         .a(czo.wq, wy.c("advancements.end.respawn_dragon.title"), wy.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", ds.a.a(by.a.a().a($$2, bwr.P)))
         .a($$1, "end/respawn_dragon");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dmo.lc, wy.c("advancements.end.find_end_city.title"), wy.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", de.a.a(cu.a.b($$0.e(mh.be).b(erc.q))))
         .a($$1, "end/find_end_city");
      ai.a.a()
         .a($$4)
         .a(czo.wy, wy.c("advancements.end.dragon_breath.title"), wy.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", ck.a.a(czo.wy))
         .a($$1, "end/dragon_breath");
      ai.a.a()
         .a($$6)
         .a(czo.wF, wy.c("advancements.end.levitate.title"), wy.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("levitated", cq.a.a(bp.b(cw.c.b(50.0))))
         .a($$1, "end/levitate");
      ai.a.a()
         .a($$6)
         .a(czo.oD, wy.c("advancements.end.elytra.title"), wy.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", ck.a.a(czo.oD))
         .a($$1, "end/elytra");
      ai.a.a()
         .a($$4)
         .a(dmo.fZ, wy.c("advancements.end.dragon_egg.title"), wy.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", ck.a.a(dmo.fZ))
         .a($$1, "end/dragon_egg");
   }
}
