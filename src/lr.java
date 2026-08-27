import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lr implements lo {
   @Override
   public void a(iy.a $$0, Consumer<af> $$1) {
      af $$2 = lo.a("adventure/root");
      lt.a($$2, $$1, Stream.concat(lt.a.stream(), Stream.of(brn.m, brn.l)).collect(Collectors.toList()));
      af $$3 = ae.a.a()
         .a($$2)
         .a(
            ddg.qH,
            wu.c("advancements.adventure.minecraft_trials_edition.title"),
            wu.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", da.a.a(cr.a.b($$0.b(le.aJ).b(egj.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$3)
         .a(ctc.yq, wu.c("advancements.adventure.lighten_up.title"), wu.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ck.a.a(cr.a.a().a(av.a.a().a(ddg.sn, ddg.sm, ddg.sl, ddg.sr, ddg.sq, ddg.sp).a(dk.a.a().a(des.c, true))), ch.a.a().a(lu.c)))
         .a($$1, "adventure/lighten_up");
      ae.a.a()
         .a($$3)
         .a(
            ctc.yz,
            wu.c("advancements.adventure.under_lock_and_key.title"),
            wu.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ck.a.a(cr.a.a().a(av.a.a().a(ddg.ts)), ch.a.a().a(ctc.yz)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$3)
         .a(ctc.tY, wu.c("advancements.adventure.blowback.title"), wu.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cm.a.a(br.a.a().a(brn.m), bg.a.a().a(dm.a(avt.k)).a(br.a.a().a(brn.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            ctc.rT,
            wu.c("advancements.adventure.crafters_crafting_crafters.title"),
            wu.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", db.a.b(new akh("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ae.a.a()
         .a($$3)
         .a(
            ctc.tY,
            wu.c("advancements.adventure.who_needs_rockets.title"),
            wu.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bv.a.a(bi.b(ct.c.b(7.0)), br.a.a().a(brn.bm)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$3)
         .a(ctc.ub, wu.c("advancements.adventure.overoverkill.title"), wu.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", cx.a.a(bf.a.a().a(ct.c.b(100.0)).a(bg.a.a().a(br.a.a().a(brn.bx).a(bo.a.a().e(ch.a.a().a(ctc.ub)))))))
         .a($$1, "adventure/overoverkill");
   }
}
