import java.util.function.Consumer;

public class jt implements jm {
   @Override
   public void a(hg.b $$0, Consumer<ae> $$1) {
      ae $$2 = ae.a.a()
         .a(
            csm.fz,
            tf.c("advancements.end.root.title"),
            tf.c("advancements.end.root.description"),
            new aer("textures/gui/advancements/backgrounds/end.png"),
            ao.a,
            false,
            false,
            false
         )
         .a("entered_end", aw.a.a(cpl.j))
         .a($$1, "end/root");
      ae $$3 = ae.a.a()
         .a($$2)
         .a(csm.gO, tf.c("advancements.end.kill_dragon.title"), tf.c("advancements.end.kill_dragon.description"), null, ao.a, true, true, false)
         .a("killed_dragon", cc.a.a(bo.a.a().a(bim.C)))
         .a($$1, "end/kill_dragon");
      ae $$4 = ae.a.a()
         .a($$3)
         .a(cja.rq, tf.c("advancements.end.enter_end_gateway.title"), tf.c("advancements.end.enter_end_gateway.description"), null, ao.a, true, true, false)
         .a("entered_end_gateway", bk.a.a(csm.kF))
         .a($$1, "end/enter_end_gateway");
      ae.a.a()
         .a($$3)
         .a(cja.ul, tf.c("advancements.end.respawn_dragon.title"), tf.c("advancements.end.respawn_dragon.description"), null, ao.c, true, true, false)
         .a("summoned_dragon", cz.a.a(bo.a.a().a(bim.C)))
         .a($$1, "end/respawn_dragon");
      ae $$5 = ae.a.a()
         .a($$4)
         .a(csm.kw, tf.c("advancements.end.find_end_city.title"), tf.c("advancements.end.find_end_city.description"), null, ao.a, true, true, false)
         .a("in_city", cq.a.a(ch.a.c(dus.q)))
         .a($$1, "end/find_end_city");
      ae.a.a()
         .a($$3)
         .a(cja.ut, tf.c("advancements.end.dragon_breath.title"), tf.c("advancements.end.dragon_breath.description"), null, ao.c, true, true, false)
         .a("dragon_breath", bx.a.a(cja.ut))
         .a($$1, "end/dragon_breath");
      ae.a.a()
         .a($$5)
         .a(cja.uA, tf.c("advancements.end.levitate.title"), tf.c("advancements.end.levitate.description"), null, ao.b, true, true, false)
         .a(ah.a.a(50))
         .a("levitated", cd.a.a(bf.b(cj.c.b(50.0))))
         .a($$1, "end/levitate");
      ae.a.a()
         .a($$5)
         .a(cja.nh, tf.c("advancements.end.elytra.title"), tf.c("advancements.end.elytra.description"), null, ao.c, true, true, false)
         .a("elytra", bx.a.a(cja.nh))
         .a($$1, "end/elytra");
      ae.a.a()
         .a($$3)
         .a(csm.fA, tf.c("advancements.end.dragon_egg.title"), tf.c("advancements.end.dragon_egg.description"), null, ao.c, true, true, false)
         .a("dragon_egg", bx.a.a(csm.fA))
         .a($$1, "end/dragon_egg");
   }
}
