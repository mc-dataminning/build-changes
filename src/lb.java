import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lb implements le {
   protected static final eib.a a = eii.a(cb.a.a().a(new bl(cqd.v, cl.d.b(1))));
   protected static final eib.a b = a.invert();
   protected static final eib.a c = eii.a(cb.a.a().a(clr.rS));
   private static final eib.a h = c.or(a);
   private static final eib.a i = h.invert();
   protected final Set<clj> d;
   protected final cgi e;
   protected final Map<agm, efk.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lb(Set<clj> $$0, cgi $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lb(Set<clj> $$0, cgi $$1, Map<agm, efk.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends egm<T>> T a(cse $$0, egm<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(egd.c()) : $$1.c();
   }

   protected <T extends ehu<T>> T a(cse $$0, ehu<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehx.c()) : $$1.d();
   }

   public efk.a a(cse $$0) {
      return efk.b().a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$0))));
   }

   private static efk.a a(cvf $$0, eib.a $$1, efv.a<?> $$2) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a(efs.a($$0).a($$1).a($$2)));
   }

   protected static efk.a a(cvf $$0, efv.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static efk.a b(cvf $$0, efv.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static efk.a c(cvf $$0, efv.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected efk.a a(cvf $$0, cse $$1) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a($$1)));
   }

   protected efk.a a(cse $$0, eiw $$1) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a((efv.a<?>)this.a($$0, efs.a($$0).a(eha.a($$1)))));
   }

   protected efk.a a(cvf $$0, cse $$1, eiw $$2) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a($$1).a(eha.a($$2))));
   }

   private static efk.a c(cse $$0) {
      return efk.b().a(efj.a().a(a).a(eiu.a(1.0F)).a(efs.a($$0)));
   }

   private efk.a d(cse $$0) {
      return efk.b().a(this.a(cvh.fR, efj.a().a(eiu.a(1.0F)).a(efs.a(cvh.fR)))).a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$0))));
   }

   protected efk.a a(cvf $$0) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a((efv.a<?>)this.a((cse)$$0, efs.a($$0).a(eha.a(eiu.a(2.0F)).a(eia.a($$0).a(da.a.a().a(dch.b, div.c)))))));
   }

   protected <T extends Comparable<T> & auk> efk.a a(cvf $$0, diq<T> $$1, T $$2) {
      return efk.b().a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$0).a(eia.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected efk.a b(cvf $$0) {
      return efk.b().a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$0).a(egf.a(egf.a.d)))));
   }

   protected efk.a c(cvf $$0) {
      return efk.b()
         .a(
            this.a(
               $$0,
               efj.a()
                  .a(eiu.a(1.0F))
                  .a(
                     efs.a($$0)
                        .a(egf.a(egf.a.d))
                        .a(
                           egg.a(ein.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(egw.a(dfk.x).a(efp.a(dcd.c)))
                  )
            )
         );
   }

   protected efk.a d(cvf $$0) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a(clr.oC).a(eha.a(eiz.a(2.0F, 5.0F))).a(egc.a(cqd.x))));
   }

   protected efk.a e(cvf $$0) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a(clr.ox).a(eha.a(eiz.a(4.0F, 9.0F))).a(egc.a(cqd.x))));
   }

   protected efk.a f(cvf $$0) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a(clr.lG).a(eha.a(eiz.a(4.0F, 5.0F))).a(egc.b(cqd.x))));
   }

   protected efk.a g(cvf $$0) {
      return efk.b().a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$0).a(egf.a(egf.a.d)).a(egg.a(ein.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static efk.a h(cvf $$0) {
      return efk.b().a(efj.a().a(a).a(eiu.a(1.0F)).a(efs.a($$0).a(egg.a(ein.a).a("Bees", "BlockEntityTag.Bees")).a(ege.a($$0).a(cuz.c))));
   }

   protected static efk.a i(cvf $$0) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a(efs.a($$0).a(a).a(egg.a(ein.a).a("Bees", "BlockEntityTag.Bees")).a(ege.a($$0).a(cuz.c)).a(efs.a($$0))));
   }

   protected static efk.a j(cvf $$0) {
      return efk.b().a(efj.a().a(efs.a(clr.wi)).a(eia.a($$0).a(da.a.a().a(cwb.s_, true))));
   }

   protected efk.a a(cvf $$0, clj $$1) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a($$1).a(egc.a(cqd.x))));
   }

   protected efk.a b(cvf $$0, cse $$1) {
      return a($$0, (efv.a<?>)this.a((cse)$$0, efs.a($$1).a(eha.a(eiz.a(-6.0F, 2.0F))).a(egn.a(efb.b(0)))));
   }

   protected efk.a k(cvf $$0) {
      return b($$0, (efv.a<?>)this.a((cse)$$0, efs.a(clr.ps).a(eig.a(0.125F)).a(egc.a(cqd.x, 2))));
   }

   public efk.a b(cvf $$0, clj $$1) {
      return efk.b()
         .a(
            this.a(
               $$0,
               efj.a()
                  .a(eiu.a(1.0F))
                  .a(efs.a($$1).a(dda.c.a(), $$1x -> eha.a(eit.a(3, (float)($$1x + 1) / 15.0F)).a(eia.a($$0).a(da.a.a().a(dda.c, $$1x.intValue())))))
            )
         );
   }

   public efk.a c(cvf $$0, clj $$1) {
      return efk.b().a(this.a($$0, efj.a().a(eiu.a(1.0F)).a(efs.a($$1).a(eha.a(eit.a(3, 0.53333336F))))));
   }

   protected static efk.a b(cse $$0) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a(c).a(efs.a($$0)));
   }

   protected efk.a a(cvf $$0, eib.a $$1) {
      return efk.b()
         .a(
            efj.a()
               .a(
                  (efv.a<?>)this.a(
                     (cse)$$0,
                     efs.a($$0)
                        .a($$1)
                        .a(ib.values(), $$1x -> eha.a(eiu.a(1.0F), true).a(eia.a($$0).a(da.a.a().a(dae.b($$1x), true))))
                        .a(eha.a(eiu.a(-1.0F), true))
                  )
               )
         );
   }

   protected efk.a a(cvf $$0, cvf $$1, float... $$2) {
      return c($$0, ((efx.a)this.a((cse)$$0, efs.a($$1))).a(ehr.a(cqd.x, $$2)))
         .a(efj.a().a(eiu.a(1.0F)).a(i).a(((efx.a)this.a((cse)$$0, efs.a(clr.pm).a(eha.a(eiz.a(1.0F, 2.0F))))).a(ehr.a(cqd.x, j))));
   }

   protected efk.a b(cvf $$0, cvf $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(efj.a().a(eiu.a(1.0F)).a(i).a(((efx.a)this.a((cse)$$0, efs.a(clr.oq))).a(ehr.a(cqd.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected efk.a l(cvf $$0) {
      return c($$0, ((efx.a)this.a((cse)cvh.aL, efs.a(clr.pm).a(eha.a(eiz.a(1.0F, 2.0F))))).a(ehr.a(cqd.x, j)));
   }

   protected efk.a a(cvf $$0, clj $$1, clj $$2, eib.a $$3) {
      return this.a((cse)$$0, efk.b().a(efj.a().a(efs.a($$1).a($$3).a(efs.a($$2)))).a(efj.a().a($$3).a(efs.a($$2).a(egc.a(cqd.x, 0.5714286F, 3)))));
   }

   protected static efk.a m(cvf $$0) {
      return efk.b().a(efj.a().a(c).a(efs.a($$0).a(eha.a(eiu.a(2.0F)))));
   }

   protected efk.a a(cvf $$0, cvf $$1) {
      efv.a<?> $$2 = efs.a($$1).a(eha.a(eiu.a(2.0F))).a(c).a(((efx.a)this.a((cse)$$0, efs.a(clr.ps))).a(eig.a(0.125F)));
      return efk.b()
         .a(efj.a().a($$2).a(eia.a($$0).a(da.a.a().a(cxn.b, dij.b))).a(ehz.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxn.b, dij.a))), new hx(0, 1, 0))))
         .a(efj.a().a($$2).a(eia.a($$0).a(da.a.a().a(cxn.b, dij.a))).a(ehz.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxn.b, dij.b))), new hx(0, -1, 0))));
   }

   protected efk.a n(cvf $$0) {
      return efk.b()
         .a(
            efj.a()
               .a(eiu.a(1.0F))
               .a(
                  (efv.a<?>)this.a(
                     $$0, efs.a($$0).a(List.of(2, 3, 4), $$1 -> eha.a(eiu.a((float)$$1.intValue())).a(eia.a($$0).a(da.a.a().a(cvu.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected efk.a o(cvf $$0) {
      return efk.b()
         .a(
            efj.a()
               .a(eiu.a(1.0F))
               .a(
                  (efv.a<?>)this.a(
                     $$0,
                     efs.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eha.a(eiu.a((float)$$1.intValue())).a(eia.a($$0).a(da.a.a().a(dar.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static efk.a p(cvf $$0) {
      return efk.b().a(efj.a().a(eiu.a(1.0F)).a(efs.a($$0)));
   }

   public static efk.a a() {
      return efk.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<agm, efk.a> $$0) {
      this.b();
      Set<agm> $$1 = new HashSet<>();

      for (cvf $$2 : kc.f) {
         if ($$2.a(this.e)) {
            agm $$3 = $$2.v();
            if ($$3 != efa.a && $$1.add($$3)) {
               efk.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kc.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cvf $$0, cvf $$1) {
      efk.a $$2 = c($$0, efs.a($$0).a(ehr.a(cqd.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected efk.a q(cvf $$0) {
      return this.a($$0, cxl.f, dij.b);
   }

   protected void r(cvf $$0) {
      this.a($$0, $$0x -> this.d((cse)((cyi)$$0x).b()));
   }

   protected void c(cvf $$0, cvf $$1) {
      this.a($$0, c((cse)$$1));
   }

   protected void c(cvf $$0, cse $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cvf $$0) {
      this.c($$0, $$0);
   }

   protected void t(cvf $$0) {
      this.c($$0, (cse)$$0);
   }

   protected void a(cvf $$0, Function<cvf, efk.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cvf $$0, efk.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
