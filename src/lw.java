import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lw implements ls {
   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = ls.a("adventure/root");
      ly.a($$2, $$1, Stream.concat(ly.a.stream(), Stream.of(bsb.o, bsb.n)).collect(Collectors.toList()));
      ag $$3 = af.a.a()
         .a($$2)
         .a(
            dfe.rS,
            xe.c("advancements.adventure.minecraft_trials_edition.title"),
            xe.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", db.a.a(cs.a.b($$0.b(li.aJ).b(ejn.L))))
         .a($$1, "adventure/minecraft_trials_edition");
      af.a.a()
         .a($$3)
         .a(cuk.Ad, xe.c("advancements.adventure.lighten_up.title"), xe.c("advancements.adventure.lighten_up.description"), null, am.a, true, true, false)
         .a("lighten_up", cl.a.a(cs.a.a().a(aw.a.a().a(dfe.ty, dfe.tx, dfe.tw, dfe.tC, dfe.tB, dfe.tA).a(dn.a.a().a(dgq.c, true))), ci.a.a().a(lz.c)))
         .a($$1, "adventure/lighten_up");
      af.a.a()
         .a($$3)
         .a(
            cuk.Am,
            xe.c("advancements.adventure.under_lock_and_key.title"),
            xe.c("advancements.adventure.under_lock_and_key.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", cl.a.a(cs.a.a().a(aw.a.a().a(dfe.uQ)), ci.a.a().a(cuk.Am)))
         .a($$1, "adventure/under_lock_and_key");
      af.a.a()
         .a($$3)
         .a(cuk.vA, xe.c("advancements.adventure.blowback.title"), xe.c("advancements.adventure.blowback.description"), null, am.b, true, true, false)
         .a(ak.a.a(40))
         .a("blowback", cn.a.a(bs.a.a().a(bsb.o), bh.a.a().a(dq.a(awg.k)).a(bs.a.a().a(bsb.p))))
         .a($$1, "adventure/blowback");
      af.a.a()
         .a($$2)
         .a(
            cuk.tq,
            xe.c("advancements.adventure.crafters_crafting_crafters.title"),
            xe.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", de.a.b(new akt("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      af.a.a()
         .a($$3)
         .a(
            cuk.vA,
            xe.c("advancements.adventure.who_needs_rockets.title"),
            xe.c("advancements.adventure.who_needs_rockets.description"),
            null,
            am.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bw.a.a(bj.b(cu.c.b(7.0)), bs.a.a().a(bsb.br)))
         .a($$1, "adventure/who_needs_rockets");
      af.a.a()
         .a($$3)
         .a(cuk.vD, xe.c("advancements.adventure.overoverkill.title"), xe.c("advancements.adventure.overoverkill.description"), null, am.b, true, true, false)
         .a(ak.a.a(50))
         .a("overoverkill", cy.a.a(bg.a.a().a(cu.c.b(100.0)).a(bh.a.a().a(bs.a.a().a(bsb.bE).a(bp.a.a().e(ci.a.a().a(cuk.vD)))))))
         .a($$1, "adventure/overoverkill");
   }
}
