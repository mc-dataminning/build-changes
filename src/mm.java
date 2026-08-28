import java.util.function.Consumer;

public class mm implements mf {
   @Override
   public void a(jp.a $$0, Consumer<ag> $$1) {
      jo<btq<?>> $$2 = $$0.b(lv.z);
      ag $$3 = af.a.a()
         .a(
            dgx.fz,
            xd.c("advancements.end.root.title"),
            xd.c("advancements.end.root.description"),
            alb.b("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dds.j))
         .a($$1, "end/root");
      ag $$4 = af.a.a()
         .a($$3)
         .a(dgx.gO, xd.c("advancements.end.kill_dragon.title"), xd.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", da.a.a(bv.a.a().a($$2, btq.F)))
         .a($$1, "end/kill_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(cvo.sg, xd.c("advancements.end.enter_end_gateway.title"), xd.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", br.a.a(dgx.kF))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$4)
         .a(cvo.vh, xd.c("advancements.end.respawn_dragon.title"), xd.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", ec.a.a(bv.a.a().a($$2, btq.F)))
         .a($$1, "end/respawn_dragon");
      ag $$6 = af.a.a()
         .a($$5)
         .a(dgx.kw, xd.c("advancements.end.find_end_city.title"), xd.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", dq.a.a(df.a.b($$0.b(lv.aR).b(eki.q))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$4)
         .a(cvo.vp, xd.c("advancements.end.dragon_breath.title"), xd.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", cg.a.a(cvo.vp))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$6)
         .a(cvo.vw, xd.c("advancements.end.levitate.title"), xd.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", db.a.a(bm.b(dh.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$6)
         .a(cvo.nU, xd.c("advancements.end.elytra.title"), xd.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", cg.a.a(cvo.nU))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$4)
         .a(dgx.fA, xd.c("advancements.end.dragon_egg.title"), xd.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", cg.a.a(dgx.fA))
         .a($$1, "end/dragon_egg");
   }
}
