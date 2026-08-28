import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class md implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ma.a("adventure/root");
      mf.a($$2, $$1, Stream.concat(mf.a.stream(), Stream.of(bta.m, bta.l)).collect(Collectors.toList()));
      af $$3 = ae.a.a()
         .a($$2)
         .a(
            dfb.qH,
            xp.c("advancements.adventure.minecraft_trials_edition.title"),
            xp.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eie.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$3)
         .a(cus.yq, xp.c("advancements.adventure.lighten_up.title"), xp.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ct.a.a(dc.a.a().a(av.a.a().a(dfb.sn, dfb.sm, dfb.sl, dfb.sr, dfb.sq, dfb.sp).a(dx.a.a().a(dgn.c, true))), cp.a.a().a(mg.c)))
         .a($$1, "adventure/lighten_up");
      af $$4 = ae.a.a()
         .a($$3)
         .a(
            cus.yz,
            xp.c("advancements.adventure.under_lock_and_key.title"),
            xp.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ct.a.a(dc.a.a().a(av.a.a().a(dfb.ts)), cp.a.a().a(cus.yz)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$4)
         .a(cus.yA, xp.c("advancements.adventure.revaulting.title"), xp.c("advancements.adventure.revaulting.description"), null, al.c, true, true, false)
         .a("revaulting", ct.a.a(dc.a.a().a(av.a.a().a(dfb.ts).a(dx.a.a().a(dnu.d, true))), cp.a.a().a(cus.yA)))
         .a($$1, "adventure/revaulting");
      ae.a.a()
         .a($$3)
         .a(cus.tY, xp.c("advancements.adventure.blowback.title"), xp.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cx.a.a(bu.a.a().a(bta.m), bj.a.a().a(dz.a(awr.k)).a(bu.a.a().a(bta.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            cus.rT,
            xp.c("advancements.adventure.crafters_crafting_crafters.title"),
            xp.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dn.a.b(new alf("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ae.a.a()
         .a($$3)
         .a(
            cus.tY,
            xp.c("advancements.adventure.who_needs_rockets.title"),
            xp.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", by.a.a(bl.b(de.c.b(7.0)), bu.a.a().a(bta.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$3)
         .a(cus.ub, xp.c("advancements.adventure.overoverkill.title"), xp.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", di.a.a(bi.a.a().a(de.c.b(100.0)).a(bj.a.a().a(dz.a(awr.E)).a(bu.a.a().a(bta.by).a(br.a.a().f(cp.a.a().a(cus.ub)))))))
         .a($$1, "adventure/overoverkill");
   }
}
