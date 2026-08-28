import java.util.function.Consumer;

public class mz implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxn<?>> $$2 = $$0.e(mi.B);
      aj $$3 = ai.a.a()
         .a(
            dnq.fY,
            xg.c("advancements.end.root.title"),
            xg.c("advancements.end.root.description"),
            alr.b("gui/advancements/backgrounds/end"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", bc.a.a(dkj.k))
         .a($$1, "end/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dnq.hp, xg.c("advancements.end.kill_dragon.title"), xg.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cq.a.a(bz.a.a().a($$2, bxn.Q)))
         .a($$1, "end/kill_dragon");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dao.tn, xg.c("advancements.end.enter_end_gateway.title"), xg.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bv.a.a(dnq.ll))
         .a($$1, "end/enter_end_gateway");
      ai.a.a()
         .a($$4)
         .a(dao.wq, xg.c("advancements.end.respawn_dragon.title"), xg.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", dt.a.a(bz.a.a().a($$2, bxn.Q)))
         .a($$1, "end/respawn_dragon");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dnq.lc, xg.c("advancements.end.find_end_city.title"), xg.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", df.a.a(cv.a.b($$0.e(mi.be).b(esh.q))))
         .a($$1, "end/find_end_city");
      ai.a.a()
         .a($$4)
         .a(dao.wy, xg.c("advancements.end.dragon_breath.title"), xg.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", cl.a.a(dao.wy))
         .a($$1, "end/dragon_breath");
      ai.a.a()
         .a($$6)
         .a(dao.wF, xg.c("advancements.end.levitate.title"), xg.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("levitated", cr.a.a(bq.b(cx.c.b(50.0))))
         .a($$1, "end/levitate");
      ai.a.a()
         .a($$6)
         .a(dao.oD, xg.c("advancements.end.elytra.title"), xg.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", cl.a.a(dao.oD))
         .a($$1, "end/elytra");
      ai.a.a()
         .a($$4)
         .a(dnq.fZ, xg.c("advancements.end.dragon_egg.title"), xg.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", cl.a.a(dnq.fZ))
         .a($$1, "end/dragon_egg");
   }
}
