import java.util.function.Consumer;

public class ml implements me {
   @Override
   public void a(jo.a $$0, Consumer<ag> $$1) {
      ag $$2 = af.a.a()
         .a(
            dga.fz,
            wz.c("advancements.end.root.title"),
            wz.c("advancements.end.root.description"),
            akr.b("textures/gui/advancements/backgrounds/end.png"),
            am.a,
            false,
            false,
            false
         )
         .a("entered_end", az.a.a(dcw.j))
         .a($$1, "end/root");
      ag $$3 = af.a.a()
         .a($$2)
         .a(dga.gO, wz.c("advancements.end.kill_dragon.title"), wz.c("advancements.end.kill_dragon.description"), null, am.a, true, true, false)
         .a("killed_dragon", da.a.a(bv.a.a().a(bsx.F)))
         .a($$1, "end/kill_dragon");
      ag $$4 = af.a.a()
         .a($$3)
         .a(cut.sf, wz.c("advancements.end.enter_end_gateway.title"), wz.c("advancements.end.enter_end_gateway.description"), null, am.a, true, true, false)
         .a("entered_end_gateway", br.a.a(dga.kF))
         .a($$1, "end/enter_end_gateway");
      af.a.a()
         .a($$3)
         .a(cut.vf, wz.c("advancements.end.respawn_dragon.title"), wz.c("advancements.end.respawn_dragon.description"), null, am.c, true, true, false)
         .a("summoned_dragon", ec.a.a(bv.a.a().a(bsx.F)))
         .a($$1, "end/respawn_dragon");
      ag $$5 = af.a.a()
         .a($$4)
         .a(dga.kw, wz.c("advancements.end.find_end_city.title"), wz.c("advancements.end.find_end_city.description"), null, am.a, true, true, false)
         .a("in_city", dq.a.a(df.a.b($$0.b(lu.aR).b(ejl.q))))
         .a($$1, "end/find_end_city");
      af.a.a()
         .a($$3)
         .a(cut.vn, wz.c("advancements.end.dragon_breath.title"), wz.c("advancements.end.dragon_breath.description"), null, am.c, true, true, false)
         .a("dragon_breath", cg.a.a(cut.vn))
         .a($$1, "end/dragon_breath");
      af.a.a()
         .a($$5)
         .a(cut.vu, wz.c("advancements.end.levitate.title"), wz.c("advancements.end.levitate.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("levitated", db.a.a(bm.b(dh.c.b(50.0))))
         .a($$1, "end/levitate");
      af.a.a()
         .a($$5)
         .a(cut.nT, wz.c("advancements.end.elytra.title"), wz.c("advancements.end.elytra.description"), null, am.c, true, true, false)
         .a("elytra", cg.a.a(cut.nT))
         .a($$1, "end/elytra");
      af.a.a()
         .a($$3)
         .a(dga.fA, wz.c("advancements.end.dragon_egg.title"), wz.c("advancements.end.dragon_egg.description"), null, am.c, true, true, false)
         .a("dragon_egg", cg.a.a(dga.fA))
         .a($$1, "end/dragon_egg");
   }
}
