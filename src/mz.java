import java.util.function.Consumer;

public class mz implements ms {
   @Override
   public void a(ji.a $$0, Consumer<aj> $$1) {
      jh<bxe<?>> $$2 = $$0.e(mi.B);
      aj $$3 = ai.a.a()
         .a(
            dng.fY,
            xc.c("advancements.end.root.title"),
            xc.c("advancements.end.root.description"),
            alk.b("gui/advancements/backgrounds/end"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", bc.a.a(djz.k))
         .a($$1, "end/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dng.hp, xc.c("advancements.end.kill_dragon.title"), xc.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cq.a.a(bz.a.a().a($$2, bxe.Q)))
         .a($$1, "end/kill_dragon");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dae.tn, xc.c("advancements.end.enter_end_gateway.title"), xc.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bv.a.a(dng.ll))
         .a($$1, "end/enter_end_gateway");
      ai.a.a()
         .a($$4)
         .a(dae.wq, xc.c("advancements.end.respawn_dragon.title"), xc.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", dt.a.a(bz.a.a().a($$2, bxe.Q)))
         .a($$1, "end/respawn_dragon");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dng.lc, xc.c("advancements.end.find_end_city.title"), xc.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", df.a.a(cv.a.b($$0.e(mi.be).b(erx.q))))
         .a($$1, "end/find_end_city");
      ai.a.a()
         .a($$4)
         .a(dae.wy, xc.c("advancements.end.dragon_breath.title"), xc.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", cl.a.a(dae.wy))
         .a($$1, "end/dragon_breath");
      ai.a.a()
         .a($$6)
         .a(dae.wF, xc.c("advancements.end.levitate.title"), xc.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("levitated", cr.a.a(bq.b(cx.c.b(50.0))))
         .a($$1, "end/levitate");
      ai.a.a()
         .a($$6)
         .a(dae.oD, xc.c("advancements.end.elytra.title"), xc.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", cl.a.a(dae.oD))
         .a($$1, "end/elytra");
      ai.a.a()
         .a($$4)
         .a(dng.fZ, xc.c("advancements.end.dragon_egg.title"), xc.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", cl.a.a(dng.fZ))
         .a($$1, "end/dragon_egg");
   }
}
