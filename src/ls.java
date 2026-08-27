import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ls implements lp {
   @Override
   public void a(iz.a $$0, Consumer<af> $$1) {
      af $$2 = lp.a("adventure/root");
      lu.a($$2, $$1, Stream.concat(lu.a.stream(), Stream.of(bsc.m, bsc.l)).collect(Collectors.toList()));
      af $$3 = ae.a.a()
         .a($$2)
         .a(
            dec.qH,
            wx.c("advancements.adventure.minecraft_trials_edition.title"),
            wx.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", da.a.a(cr.a.b($$0.b(lf.aJ).b(ehf.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ae.a.a()
         .a($$3)
         .a(ctt.yq, wx.c("advancements.adventure.lighten_up.title"), wx.c("advancements.adventure.lighten_up.description"), null, al.a, true, true, false)
         .a("lighten_up", ck.a.a(cr.a.a().a(av.a.a().a(dec.sn, dec.sm, dec.sl, dec.sr, dec.sq, dec.sp).a(dl.a.a().a(dfo.c, true))), ch.a.a().a(lv.c)))
         .a($$1, "adventure/lighten_up");
      ae.a.a()
         .a($$3)
         .a(
            ctt.yz,
            wx.c("advancements.adventure.under_lock_and_key.title"),
            wx.c("advancements.adventure.under_lock_and_key.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", ck.a.a(cr.a.a().a(av.a.a().a(dec.ts)), ch.a.a().a(ctt.yz)))
         .a($$1, "adventure/under_lock_and_key");
      ae.a.a()
         .a($$3)
         .a(ctt.tY, wx.c("advancements.adventure.blowback.title"), wx.c("advancements.adventure.blowback.description"), null, al.b, true, true, false)
         .a(aj.a.a(40))
         .a("blowback", cm.a.a(br.a.a().a(bsc.m), bg.a.a().a(dn.a(avz.k)).a(br.a.a().a(bsc.n))))
         .a($$1, "adventure/blowback");
      ae.a.a()
         .a($$2)
         .a(
            ctt.rT,
            wx.c("advancements.adventure.crafters_crafting_crafters.title"),
            wx.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dc.a.b(new akn("minecraft:crafter")))
         .a($$1, "adventure/crafters_crafting_crafters");
      ae.a.a()
         .a($$3)
         .a(
            ctt.tY,
            wx.c("advancements.adventure.who_needs_rockets.title"),
            wx.c("advancements.adventure.who_needs_rockets.description"),
            null,
            al.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", bv.a.a(bi.b(ct.c.b(7.0)), br.a.a().a(bsc.bn)))
         .a($$1, "adventure/who_needs_rockets");
      ae.a.a()
         .a($$3)
         .a(ctt.ub, wx.c("advancements.adventure.overoverkill.title"), wx.c("advancements.adventure.overoverkill.description"), null, al.b, true, true, false)
         .a(aj.a.a(50))
         .a("overoverkill", cx.a.a(bf.a.a().a(ct.c.b(100.0)).a(bg.a.a().a(dn.a(avz.E)).a(br.a.a().a(bsc.by).a(bo.a.a().e(ch.a.a().a(ctt.ub)))))))
         .a($$1, "adventure/overoverkill");
   }
}
