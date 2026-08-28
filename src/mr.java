import java.util.function.Consumer;

public class mr implements mk {
   @Override
   public void a(js.a $$0, Consumer<ah> $$1) {
      jr<bup<?>> $$2 = $$0.d(ma.z);
      ah $$3 = ag.a.a()
         .a(
            dil.fz,
            xl.c("advancements.end.root.title"),
            xl.c("advancements.end.root.description"),
            all.b("textures/gui/advancements/backgrounds/end.png"),
            an.a,
            false,
            false,
            false
         )
         .a("entered_end", ba.a.a(dff.k))
         .a($$1, "end/root");
      ah $$4 = ag.a.a()
         .a($$3)
         .a(dil.gO, xl.c("advancements.end.kill_dragon.title"), xl.c("advancements.end.kill_dragon.description"), null, an.a, true, true, false)
         .a("killed_dragon", dc.a.a(bw.a.a().a($$2, bup.F)))
         .a($$1, "end/kill_dragon");
      ah $$5 = ag.a.a()
         .a($$4)
         .a(cwj.sw, xl.c("advancements.end.enter_end_gateway.title"), xl.c("advancements.end.enter_end_gateway.description"), null, an.a, true, true, false)
         .a("entered_end_gateway", bs.a.a(dil.kF))
         .a($$1, "end/enter_end_gateway");
      ag.a.a()
         .a($$4)
         .a(cwj.vx, xl.c("advancements.end.respawn_dragon.title"), xl.c("advancements.end.respawn_dragon.description"), null, an.c, true, true, false)
         .a("summoned_dragon", ef.a.a(bw.a.a().a($$2, bup.F)))
         .a($$1, "end/respawn_dragon");
      ah $$6 = ag.a.a()
         .a($$5)
         .a(dil.kw, xl.c("advancements.end.find_end_city.title"), xl.c("advancements.end.find_end_city.description"), null, an.a, true, true, false)
         .a("in_city", ds.a.a(dh.a.b($$0.d(ma.aS).b(elv.q))))
         .a($$1, "end/find_end_city");
      ag.a.a()
         .a($$4)
         .a(cwj.vF, xl.c("advancements.end.dragon_breath.title"), xl.c("advancements.end.dragon_breath.description"), null, an.c, true, true, false)
         .a("dragon_breath", ci.a.a(cwj.vF))
         .a($$1, "end/dragon_breath");
      ag.a.a()
         .a($$6)
         .a(cwj.vM, xl.c("advancements.end.levitate.title"), xl.c("advancements.end.levitate.description"), null, an.b, true, true, false)
         .a(al.a.a(50))
         .a("levitated", dd.a.a(bn.b(dj.c.b(50.0))))
         .a($$1, "end/levitate");
      ag.a.a()
         .a($$6)
         .a(cwj.nU, xl.c("advancements.end.elytra.title"), xl.c("advancements.end.elytra.description"), null, an.c, true, true, false)
         .a("elytra", ci.a.a(cwj.nU))
         .a($$1, "end/elytra");
      ag.a.a()
         .a($$4)
         .a(dil.fA, xl.c("advancements.end.dragon_egg.title"), xl.c("advancements.end.dragon_egg.description"), null, an.c, true, true, false)
         .a("dragon_egg", ci.a.a(dil.fA))
         .a($$1, "end/dragon_egg");
   }
}
