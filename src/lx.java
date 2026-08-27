import java.util.function.Consumer;

public class lx implements lo {
   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            ddg.fz,
            wu.c("advancements.end.root.title"),
            wu.c("advancements.end.root.description"),
            new akh("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(dad.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(ddg.gO, wu.c("advancements.end.kill_dragon.title"), wu.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cm.a.a(br.a.a().a(brn.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ctc.sf, wu.c("advancements.end.enter_end_gateway.title"), wu.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(ddg.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(ctc.vf, wu.c("advancements.end.respawn_dragon.title"), wu.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dl.a.a(br.a.a().a(brn.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(ddg.kw, wu.c("advancements.end.find_end_city.title"), wu.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", da.a.a(cr.a.b($$0.b(le.aJ).b(egj.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(ctc.vn, wu.c("advancements.end.dragon_breath.title"), wu.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", cb.a.a(ctc.vn))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(ctc.vu, wu.c("advancements.end.levitate.title"), wu.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cn.a.a(bi.b(ct.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(ctc.nT, wu.c("advancements.end.elytra.title"), wu.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", cb.a.a(ctc.nT))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(ddg.fA, wu.c("advancements.end.dragon_egg.title"), wu.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", cb.a.a(ddg.fA))
         .a($$1, "end/dragon_egg");
   }
}
