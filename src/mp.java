import java.util.function.Consumer;

public class mp implements mi {
   @Override
   public void a(jr.a $$0, Consumer<ag> $$1) {
      jq<bug<?>> $$2 = $$0.d(ly.z);
      ag $$3 = af.a.a()
         .a(
            dia.fz,
            xh.c("advancements.end.root.title"),
            xh.c("advancements.end.root.description"),
            alh.b("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dev.k))
         .a($$1, "end/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(dia.gO, xh.c("advancements.end.kill_dragon.title"), xh.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", db.a.a(bv.a.a().a($$2, bug.F)))
         .a($$1, "end/kill_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cwb.sg, xh.c("advancements.end.enter_end_gateway.title"), xh.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", br.a.a(dia.kF))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$4)
         .a(cwb.vh, xh.c("advancements.end.respawn_dragon.title"), xh.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", ee.a.a(bv.a.a().a($$2, bug.F)))
         .a($$1, "end/respawn_dragon");
      ag $$6 = af.a.a()
         .a($$5)
         .a(dia.kw, xh.c("advancements.end.find_end_city.title"), xh.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", dr.a.a(dg.a.b($$0.d(ly.aS).b(ell.q))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$4)
         .a(cwb.vp, xh.c("advancements.end.dragon_breath.title"), xh.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", ch.a.a(cwb.vp))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$6)
         .a(cwb.vw, xh.c("advancements.end.levitate.title"), xh.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", dc.a.a(bm.b(di.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$6)
         .a(cwb.nU, xh.c("advancements.end.elytra.title"), xh.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", ch.a.a(cwb.nU))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$4)
         .a(dia.fA, xh.c("advancements.end.dragon_egg.title"), xh.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", ch.a.a(dia.fA))
         .a($$1, "end/dragon_egg");
   }
}
