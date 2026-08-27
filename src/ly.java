import java.util.function.Consumer;

public class ly implements lp {
   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = ae.a.a()
         .a(
            dea.fz,
            wx.c("advancements.end.root.title"),
            wx.c("advancements.end.root.description"),
            new akm("textures/gui/advancements/backgrounds/end.png"),
            al.a,
            false,
            false,
            false
         )
         .a("entered_end", ay.a.a(dax.j))
         .a($$1, "end/root");
      af $$3 = ae.a.a()
         .a($$2)
         .a(dea.gO, wx.c("advancements.end.kill_dragon.title"), wx.c("advancements.end.kill_dragon.description"), null, al.a, true, true, false)
         .a("killed_dragon", cm.a.a(br.a.a().a(bsa.F)))
         .a($$1, "end/kill_dragon");
      af $$4 = ae.a.a()
         .a($$3)
         .a(ctr.sf, wx.c("advancements.end.enter_end_gateway.title"), wx.c("advancements.end.enter_end_gateway.description"), null, al.a, true, true, false)
         .a("entered_end_gateway", bn.a.a(dea.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(ctr.vf, wx.c("advancements.end.respawn_dragon.title"), wx.c("advancements.end.respawn_dragon.description"), null, al.c, true, true, false)
         .a("summoned_dragon", dm.a.a(br.a.a().a(bsa.F)))
         .a($$1, "end/respawn_dragon");
      af $$5 = ae.a.a()
         .a($$4)
         .a(dea.kw, wx.c("advancements.end.find_end_city.title"), wx.c("advancements.end.find_end_city.description"), null, al.a, true, true, false)
         .a("in_city", da.a.a(cr.a.b($$0.b(lf.aJ).b(ehd.q))))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(ctr.vn, wx.c("advancements.end.dragon_breath.title"), wx.c("advancements.end.dragon_breath.description"), null, al.c, true, true, false)
         .a("dragon_breath", cb.a.a(ctr.vn))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(ctr.vu, wx.c("advancements.end.levitate.title"), wx.c("advancements.end.levitate.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("levitated", cn.a.a(bi.b(ct.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(ctr.nT, wx.c("advancements.end.elytra.title"), wx.c("advancements.end.elytra.description"), null, al.c, true, true, false)
         .a("elytra", cb.a.a(ctr.nT))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(dea.fA, wx.c("advancements.end.dragon_egg.title"), wx.c("advancements.end.dragon_egg.description"), null, al.c, true, true, false)
         .a("dragon_egg", cb.a.a(dea.fA))
         .a($$1, "end/dragon_egg");
   }
}
