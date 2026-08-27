import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lc implements lf {
   protected static final ejo.a a = ejv.a(ca.a.a().a(new bk(crg.v, ck.d.b(1))));
   protected static final ejo.a b = a.invert();
   protected static final ejo.a c = ejv.a(ca.a.a().a(cmu.rS));
   private static final ejo.a h = c.or(a);
   private static final ejo.a i = h.invert();
   protected final Set<cmm> d;
   protected final chl e;
   protected final Map<ahd, egx.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lc(Set<cmm> $$0, chl $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lc(Set<cmm> $$0, chl $$1, Map<ahd, egx.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ehz<T>> T a(cth $$0, ehz<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehq.c()) : $$1.c();
   }

   protected <T extends ejh<T>> T a(cth $$0, ejh<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ejk.c()) : $$1.d();
   }

   public egx.a a(cth $$0) {
      return egx.b().a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$0))));
   }

   private static egx.a a(cwj $$0, ejo.a $$1, ehi.a<?> $$2) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a(ehf.a($$0).a($$1).a($$2)));
   }

   protected static egx.a a(cwj $$0, ehi.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static egx.a b(cwj $$0, ehi.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static egx.a c(cwj $$0, ehi.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected egx.a a(cwj $$0, cth $$1) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a($$1)));
   }

   protected egx.a a(cth $$0, ekj $$1) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a((ehi.a<?>)this.a($$0, ehf.a($$0).a(ein.a($$1)))));
   }

   protected egx.a a(cwj $$0, cth $$1, ekj $$2) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a($$1).a(ein.a($$2))));
   }

   private static egx.a c(cth $$0) {
      return egx.b().a(egw.a().a(a).a(ekh.a(1.0F)).a(ehf.a($$0)));
   }

   private egx.a d(cth $$0) {
      return egx.b().a(this.a(cwl.fR, egw.a().a(ekh.a(1.0F)).a(ehf.a(cwl.fR)))).a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$0))));
   }

   protected egx.a a(cwj $$0) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a((ehi.a<?>)this.a((cth)$$0, ehf.a($$0).a(ein.a(ekh.a(2.0F)).a(ejn.a($$0).a(cz.a.a().a(ddl.b, dki.c)))))));
   }

   protected <T extends Comparable<T> & ave> egx.a a(cwj $$0, dkd<T> $$1, T $$2) {
      return egx.b().a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$0).a(ejn.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected egx.a b(cwj $$0) {
      return egx.b().a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$0).a(ehs.a(ehs.a.d)))));
   }

   protected egx.a c(cwj $$0) {
      return egx.b()
         .a(
            this.a(
               $$0,
               egw.a()
                  .a(ekh.a(1.0F))
                  .a(
                     ehf.a($$0)
                        .a(ehs.a(ehs.a.d))
                        .a(
                           eht.a(eka.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eij.a(dgq.x).a(ehc.a(ddh.c)))
                  )
            )
         );
   }

   protected egx.a d(cwj $$0) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a(cmu.oC).a(ein.a(ekm.a(2.0F, 5.0F))).a(ehp.a(crg.x))));
   }

   protected egx.a e(cwj $$0) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a(cmu.ox).a(ein.a(ekm.a(4.0F, 9.0F))).a(ehp.a(crg.x))));
   }

   protected egx.a f(cwj $$0) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a(cmu.lG).a(ein.a(ekm.a(4.0F, 5.0F))).a(ehp.b(crg.x))));
   }

   protected egx.a g(cwj $$0) {
      return egx.b().a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$0).a(ehs.a(ehs.a.d)).a(eht.a(eka.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static egx.a h(cwj $$0) {
      return egx.b().a(egw.a().a(a).a(ekh.a(1.0F)).a(ehf.a($$0).a(eht.a(eka.a).a("Bees", "BlockEntityTag.Bees")).a(ehr.a($$0).a(cwd.c))));
   }

   protected static egx.a i(cwj $$0) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a(ehf.a($$0).a(a).a(eht.a(eka.a).a("Bees", "BlockEntityTag.Bees")).a(ehr.a($$0).a(cwd.c)).a(ehf.a($$0))));
   }

   protected static egx.a j(cwj $$0) {
      return egx.b().a(egw.a().a(ehf.a(cmu.wj)).a(ejn.a($$0).a(cz.a.a().a(cxf.t_, true))));
   }

   protected egx.a a(cwj $$0, cmm $$1) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a($$1).a(ehp.a(crg.x))));
   }

   protected egx.a b(cwj $$0, cth $$1) {
      return a($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a($$1).a(ein.a(ekm.a(-6.0F, 2.0F))).a(eia.a(ego.b(0)))));
   }

   protected egx.a k(cwj $$0) {
      return b($$0, (ehi.a<?>)this.a((cth)$$0, ehf.a(cmu.ps).a(ejt.a(0.125F)).a(ehp.a(crg.x, 2))));
   }

   public egx.a b(cwj $$0, cmm $$1) {
      return egx.b()
         .a(
            this.a(
               $$0,
               egw.a()
                  .a(ekh.a(1.0F))
                  .a(ehf.a($$1).a(dee.c.a(), $$1x -> ein.a(ekg.a(3, (float)($$1x + 1) / 15.0F)).a(ejn.a($$0).a(cz.a.a().a(dee.c, $$1x.intValue())))))
            )
         );
   }

   public egx.a c(cwj $$0, cmm $$1) {
      return egx.b().a(this.a($$0, egw.a().a(ekh.a(1.0F)).a(ehf.a($$1).a(ein.a(ekg.a(3, 0.53333336F))))));
   }

   protected static egx.a b(cth $$0) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a(c).a(ehf.a($$0)));
   }

   protected egx.a a(cwj $$0, ejo.a $$1) {
      return egx.b()
         .a(
            egw.a()
               .a(
                  (ehi.a<?>)this.a(
                     (cth)$$0,
                     ehf.a($$0)
                        .a($$1)
                        .a(ic.values(), $$1x -> ein.a(ekh.a(1.0F), true).a(ejn.a($$0).a(cz.a.a().a(dbi.b($$1x), true))))
                        .a(ein.a(ekh.a(-1.0F), true))
                  )
               )
         );
   }

   protected egx.a a(cwj $$0, cwj $$1, float... $$2) {
      return c($$0, ((ehk.a)this.a((cth)$$0, ehf.a($$1))).a(eje.a(crg.x, $$2)))
         .a(egw.a().a(ekh.a(1.0F)).a(i).a(((ehk.a)this.a((cth)$$0, ehf.a(cmu.pm).a(ein.a(ekm.a(1.0F, 2.0F))))).a(eje.a(crg.x, j))));
   }

   protected egx.a b(cwj $$0, cwj $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(egw.a().a(ekh.a(1.0F)).a(i).a(((ehk.a)this.a((cth)$$0, ehf.a(cmu.oq))).a(eje.a(crg.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected egx.a l(cwj $$0) {
      return c($$0, ((ehk.a)this.a((cth)cwl.aL, ehf.a(cmu.pm).a(ein.a(ekm.a(1.0F, 2.0F))))).a(eje.a(crg.x, j)));
   }

   protected egx.a a(cwj $$0, cmm $$1, cmm $$2, ejo.a $$3) {
      return this.a((cth)$$0, egx.b().a(egw.a().a(ehf.a($$1).a($$3).a(ehf.a($$2)))).a(egw.a().a($$3).a(ehf.a($$2).a(ehp.a(crg.x, 0.5714286F, 3)))));
   }

   protected static egx.a m(cwj $$0) {
      return egx.b().a(egw.a().a(c).a(ehf.a($$0).a(ein.a(ekh.a(2.0F)))));
   }

   protected egx.a a(cwj $$0, cwj $$1) {
      ehi.a<?> $$2 = ehf.a($$1).a(ein.a(ekh.a(2.0F))).a(c).a(((ehk.a)this.a((cth)$$0, ehf.a(cmu.ps))).a(ejt.a(0.125F)));
      return egx.b()
         .a(egw.a().a($$2).a(ejn.a($$0).a(cz.a.a().a(cyr.b, djw.b))).a(ejm.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyr.b, djw.a))), new hx(0, 1, 0))))
         .a(egw.a().a($$2).a(ejn.a($$0).a(cz.a.a().a(cyr.b, djw.a))).a(ejm.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyr.b, djw.b))), new hx(0, -1, 0))));
   }

   protected egx.a n(cwj $$0) {
      return egx.b()
         .a(
            egw.a()
               .a(ekh.a(1.0F))
               .a(
                  (ehi.a<?>)this.a(
                     $$0, ehf.a($$0).a(List.of(2, 3, 4), $$1 -> ein.a(ekh.a((float)$$1.intValue())).a(ejn.a($$0).a(cz.a.a().a(cwy.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected egx.a o(cwj $$0) {
      return egx.b()
         .a(
            egw.a()
               .a(ekh.a(1.0F))
               .a(
                  (ehi.a<?>)this.a(
                     $$0,
                     ehf.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ein.a(ekh.a((float)$$1.intValue())).a(ejn.a($$0).a(cz.a.a().a(dbv.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static egx.a p(cwj $$0) {
      return egx.b().a(egw.a().a(ekh.a(1.0F)).a(ehf.a($$0)));
   }

   public static egx.a a() {
      return egx.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ahd, egx.a> $$0) {
      this.b();
      Set<ahd> $$1 = new HashSet<>();

      for (cwj $$2 : kd.e) {
         if ($$2.a(this.e)) {
            ahd $$3 = $$2.v();
            if ($$3 != egn.a && $$1.add($$3)) {
               egx.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kd.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cwj $$0, cwj $$1) {
      egx.a $$2 = c($$0, ehf.a($$0).a(eje.a(crg.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected egx.a q(cwj $$0) {
      return this.a($$0, cyp.f, djw.b);
   }

   protected void r(cwj $$0) {
      this.a($$0, $$0x -> this.d((cth)((czm)$$0x).b()));
   }

   protected void c(cwj $$0, cwj $$1) {
      this.a($$0, c((cth)$$1));
   }

   protected void c(cwj $$0, cth $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cwj $$0) {
      this.c($$0, $$0);
   }

   protected void t(cwj $$0) {
      this.c($$0, (cth)$$0);
   }

   protected void a(cwj $$0, Function<cwj, egx.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cwj $$0, egx.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
