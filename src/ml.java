import java.util.function.Consumer;

public class ml implements me {
   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dfy.fz,
            wy.c("advancements.end.root.title"),
            wy.c("advancements.end.root.description"),
            akq.b("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dcu.j))
         .a($$1, "end/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(dfy.gO, wy.c("advancements.end.kill_dragon.title"), wy.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", da.a.a(bv.a.a().a(bsw.F)))
         .a($$1, "end/kill_dragon");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cur.sf, wy.c("advancements.end.enter_end_gateway.title"), wy.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", br.a.a(dfy.kF))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$3)
         .a(cur.vf, wy.c("advancements.end.respawn_dragon.title"), wy.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", ec.a.a(bv.a.a().a(bsw.F)))
         .a($$1, "end/respawn_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dfy.kw, wy.c("advancements.end.find_end_city.title"), wy.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", dq.a.a(df.a.b($$0.b(lu.aR).b(ejg.q))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$3)
         .a(cur.vn, wy.c("advancements.end.dragon_breath.title"), wy.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", cg.a.a(cur.vn))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$5)
         .a(cur.vu, wy.c("advancements.end.levitate.title"), wy.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", db.a.a(bm.b(dh.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$5)
         .a(cur.nT, wy.c("advancements.end.elytra.title"), wy.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", cg.a.a(cur.nT))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$3)
         .a(dfy.fA, wy.c("advancements.end.dragon_egg.title"), wy.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", cg.a.a(dfy.fA))
         .a($$1, "end/dragon_egg");
   }
}
