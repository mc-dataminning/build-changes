import java.util.function.Consumer;

public class mn implements mg {
   @Override
   public void a(jq.a $$0, Consumer<ag> $$1) {
      jp<bty<?>> $$2 = $$0.d(lw.z);
      ag $$3 = af.a.a()
         .a(
            dho.fz,
            xe.c("advancements.end.root.title"),
            xe.c("advancements.end.root.description"),
            ale.b("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dej.j))
         .a($$1, "end/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(dho.gO, xe.c("advancements.end.kill_dragon.title"), xe.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", da.a.a(bv.a.a().a($$2, bty.F)))
         .a($$1, "end/kill_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cvw.sg, xe.c("advancements.end.enter_end_gateway.title"), xe.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", br.a.a(dho.kF))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$4)
         .a(cvw.vh, xe.c("advancements.end.respawn_dragon.title"), xe.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", ed.a.a(bv.a.a().a($$2, bty.F)))
         .a($$1, "end/respawn_dragon");
      ag $$6 = af.a.a()
         .a($$5)
         .a(dho.kw, xe.c("advancements.end.find_end_city.title"), xe.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", dq.a.a(df.a.b($$0.d(lw.aT).b(ela.q))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$4)
         .a(cvw.vp, xe.c("advancements.end.dragon_breath.title"), xe.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", cg.a.a(cvw.vp))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$6)
         .a(cvw.vw, xe.c("advancements.end.levitate.title"), xe.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", db.a.a(bm.b(dh.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$6)
         .a(cvw.nU, xe.c("advancements.end.elytra.title"), xe.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", cg.a.a(cvw.nU))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$4)
         .a(dho.fA, xe.c("advancements.end.dragon_egg.title"), xe.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", cg.a.a(dho.fA))
         .a($$1, "end/dragon_egg");
   }
}
