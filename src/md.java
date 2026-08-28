import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class md implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ma.a("adventure/root");
      mf.a($$2, $$1, Stream.concat(mf.a.stream(), Stream.of(bsv.m, bsv.l)).collect(Collectors.toList()));
      af $$3 = ae.a.a()
         .a($$2)
         .a(
            dew.qH,
            xl.c("advancements.adventure.minecraft_trials_edition.title"),
            xl.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dl.a.a(dc.a.b($$0.b(lq.aJ).b(ehz.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$3)
         .a(cun.yq, xl.c("advancements.adventure.lighten_up.title"), xl.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ct.a.a(dc.a.a().a(av.a.a().a(dew.sn, dew.sm, dew.sl, dew.sr, dew.sq, dew.sp).a(dx.a.a().a(dgi.c, true))), cp.a.a().a(mg.c)))
         .a($$1, "adventure/lighten_up");
      af $$4 = ae.a.a()
         .a($$3)
         .a(
            cun.yz,
            xl.c("advancements.adventure.under_lock_and_key.title"),
            xl.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ct.a.a(dc.a.a().a(av.a.a().a(dew.ts)), cp.a.a().a(cun.yz)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$4)
         .a(cun.yA, xl.c("advancements.adventure.revaulting.title"), xl.c("advancements.adventure.revaulting.description"), null, al.c, true, true, false)
         .a("revaulting", ct.a.a(dc.a.a().a(av.a.a().a(dew.ts).a(dx.a.a().a(dnp.d, true))), cp.a.a().a(cun.yA)))
         .a($$1, "adventure/revaulting");
      ae.a.a()
         .a($$3)
         .a(cun.tY, xl.c("advancements.adventure.blowback.title"), xl.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cx.a.a(bu.a.a().a(bsv.m), bj.a.a().a(dz.a(awn.k)).a(bu.a.a().a(bsv.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            cun.rT,
            xl.c("advancements.adventure.crafters_crafting_crafters.title"),
            xl.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dn.a.b(new alb("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ae.a.a()
         .a($$3)
         .a(
            cun.tY,
            xl.c("advancements.adventure.who_needs_rockets.title"),
            xl.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", by.a.a(bl.b(de.c.b(7.0)), bu.a.a().a(bsv.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$3)
         .a(cun.ub, xl.c("advancements.adventure.overoverkill.title"), xl.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", di.a.a(bi.a.a().a(de.c.b(100.0)).a(bj.a.a().a(dz.a(awn.E)).a(bu.a.a().a(bsv.by).a(br.a.a().f(cp.a.a().a(cun.ub)))))))
         .a($$1, "adventure/overoverkill");
   }
}
