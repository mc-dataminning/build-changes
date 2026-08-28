import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class md implements ma {
   @Override
   public void a(jk.a $$0, Consumer<af> $$1) {
      af $$2 = ma.a("adventure/root");
      mf.a($$2, $$1, Stream.concat(mf.a.stream(), Stream.of(btc.m, btc.l)).collect(Collectors.toList()));
      af $$3 = ae.a.a()
         .a($$2)
         .a(
            dfd.qH,
            xp.c("advancements.adventure.minecraft_trials_edition.title"),
            xp.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", dl.a.a(dc.a.b($$0.b(lq.aJ).b(eig.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$3)
         .a(cuu.yq, xp.c("advancements.adventure.lighten_up.title"), xp.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ct.a.a(dc.a.a().a(av.a.a().a(dfd.sn, dfd.sm, dfd.sl, dfd.sr, dfd.sq, dfd.sp).a(dx.a.a().a(dgp.c, true))), cp.a.a().a(mg.c)))
         .a($$1, "adventure/lighten_up");
      af $$4 = ae.a.a()
         .a($$3)
         .a(
            cuu.yz,
            xp.c("advancements.adventure.under_lock_and_key.title"),
            xp.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ct.a.a(dc.a.a().a(av.a.a().a(dfd.ts)), cp.a.a().a(cuu.yz)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$4)
         .a(cuu.yA, xp.c("advancements.adventure.revaulting.title"), xp.c("advancements.adventure.revaulting.description"), null, al.c, true, true, false)
         .a("revaulting", ct.a.a(dc.a.a().a(av.a.a().a(dfd.ts).a(dx.a.a().a(dnw.d, true))), cp.a.a().a(cuu.yA)))
         .a($$1, "adventure/revaulting");
      ae.a.a()
         .a($$3)
         .a(cuu.tY, xp.c("advancements.adventure.blowback.title"), xp.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cx.a.a(bu.a.a().a(btc.m), bj.a.a().a(dz.a(awr.k)).a(bu.a.a().a(btc.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            cuu.rT,
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
            cuu.tY,
            xp.c("advancements.adventure.who_needs_rockets.title"),
            xp.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", by.a.a(bl.b(de.c.b(7.0)), bu.a.a().a(btc.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$3)
         .a(cuu.ub, xp.c("advancements.adventure.overoverkill.title"), xp.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", di.a.a(bi.a.a().a(de.c.b(100.0)).a(bj.a.a().a(dz.a(awr.E)).a(bu.a.a().a(btc.by).a(br.a.a().f(cp.a.a().a(cuu.ub)))))))
         .a($$1, "adventure/overoverkill");
   }
}
