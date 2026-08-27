import java.util.function.Consumer;

public class jv implements jo {
   @Override
   public void a(hi.b $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            csr.fz,
            ti.c("advancements.end.root.title"),
            ti.c("advancements.end.root.description"),
            new aeu("textures/gui/advancements/backgrounds/end.png"),
            ar.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(cpq.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(csr.gO, ti.c("advancements.end.kill_dragon.title"), ti.c("advancements.end.kill_dragon.description"), null, ar.a, true, true, false)
         .a("killed_dragon", ce.a.a(bq.a.a().a(bip.C)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(cjd.rq, ti.c("advancements.end.enter_end_gateway.title"), ti.c("advancements.end.enter_end_gateway.description"), null, ar.a, true, true, false)
         .a("entered_end_gateway", bm.a.a(csr.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cjd.ul, ti.c("advancements.end.respawn_dragon.title"), ti.c("advancements.end.respawn_dragon.description"), null, ar.c, true, true, false)
         .a("summoned_dragon", db.a.a(bq.a.a().a(bip.C)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(csr.kw, ti.c("advancements.end.find_end_city.title"), ti.c("advancements.end.find_end_city.description"), null, ar.a, true, true, false)
         .a("in_city", cs.a.a(cj.a.c(dux.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cjd.ut, ti.c("advancements.end.dragon_breath.title"), ti.c("advancements.end.dragon_breath.description"), null, ar.c, true, true, false)
         .a("dragon_breath", bz.a.a(cjd.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cjd.uA, ti.c("advancements.end.levitate.title"), ti.c("advancements.end.levitate.description"), null, ar.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cf.a.a(bh.b(cl.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cjd.nh, ti.c("advancements.end.elytra.title"), ti.c("advancements.end.elytra.description"), null, ar.c, true, true, false)
         .a("elytra", bz.a.a(cjd.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(csr.fA, ti.c("advancements.end.dragon_egg.title"), ti.c("advancements.end.dragon_egg.description"), null, ar.c, true, true, false)
         .a("dragon_egg", bz.a.a(csr.fA))
         .a($$1, "end/dragon_egg");
   }
}
