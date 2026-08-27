import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class kx implements la {
   protected static final egh.a a = ego.a(cb.a.a().a(new bl(cox.v, cl.d.b(1))));
   protected static final egh.a b = a.invert();
   protected static final egh.a c = ego.a(cb.a.a().a(ckm.rg));
   private static final egh.a h = c.or(a);
   private static final egh.a i = h.invert();
   protected final Set<cke> d;
   protected final cfg e;
   protected final Map<afw, edq.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kx(Set<cke> $$0, cfg $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kx(Set<cke> $$0, cfg $$1, Map<afw, edq.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ees<T>> T a(cqy $$0, ees<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(eej.c()) : $$1.c();
   }

   protected <T extends ega<T>> T a(cqy $$0, ega<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(egd.c()) : $$1.d();
   }

   public edq.a a(cqy $$0) {
      return edq.b().a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$0))));
   }

   private static edq.a a(cua $$0, egh.a $$1, eeb.a<?> $$2) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a(edy.a($$0).a($$1).a($$2)));
   }

   protected static edq.a a(cua $$0, eeb.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static edq.a b(cua $$0, eeb.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static edq.a c(cua $$0, eeb.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected edq.a a(cua $$0, cqy $$1) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a($$1)));
   }

   protected edq.a a(cqy $$0, ehc $$1) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a((eeb.a<?>)this.a($$0, edy.a($$0).a(efg.a($$1)))));
   }

   protected edq.a a(cua $$0, cqy $$1, ehc $$2) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a($$1).a(efg.a($$2))));
   }

   private static edq.a c(cqy $$0) {
      return edq.b().a(edp.a().a(a).a(eha.a(1.0F)).a(edy.a($$0)));
   }

   private edq.a d(cqy $$0) {
      return edq.b().a(this.a(cuc.fR, edp.a().a(eha.a(1.0F)).a(edy.a(cuc.fR)))).a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$0))));
   }

   protected edq.a a(cua $$0) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a((eeb.a<?>)this.a((cqy)$$0, edy.a($$0).a(efg.a(eha.a(2.0F)).a(egg.a($$0).a(da.a.a().a(dbb.b, dhj.c)))))));
   }

   protected <T extends Comparable<T> & atr> edq.a a(cua $$0, dhe<T> $$1, T $$2) {
      return edq.b().a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$0).a(egg.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected edq.a b(cua $$0) {
      return edq.b().a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$0).a(eel.a(eel.a.d)))));
   }

   protected edq.a c(cua $$0) {
      return edq.b()
         .a(
            this.a(
               $$0,
               edp.a()
                  .a(eha.a(1.0F))
                  .a(
                     edy.a($$0)
                        .a(eel.a(eel.a.d))
                        .a(
                           eem.a(egt.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(efc.a(ddz.x).a(edv.a(dax.c)))
                  )
            )
         );
   }

   protected edq.a d(cua $$0) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a(ckm.nR).a(efg.a(ehf.a(2.0F, 5.0F))).a(eei.a(cox.x))));
   }

   protected edq.a e(cua $$0) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a(ckm.nM).a(efg.a(ehf.a(4.0F, 9.0F))).a(eei.a(cox.x))));
   }

   protected edq.a f(cua $$0) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a(ckm.ll).a(efg.a(ehf.a(4.0F, 5.0F))).a(eei.b(cox.x))));
   }

   protected edq.a g(cua $$0) {
      return edq.b().a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$0).a(eel.a(eel.a.d)).a(eem.a(egt.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static edq.a h(cua $$0) {
      return edq.b().a(edp.a().a(a).a(eha.a(1.0F)).a(edy.a($$0).a(eem.a(egt.a).a("Bees", "BlockEntityTag.Bees")).a(eek.a($$0).a(ctu.c))));
   }

   protected static edq.a i(cua $$0) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a(edy.a($$0).a(a).a(eem.a(egt.a).a("Bees", "BlockEntityTag.Bees")).a(eek.a($$0).a(ctu.c)).a(edy.a($$0))));
   }

   protected static edq.a j(cua $$0) {
      return edq.b().a(edp.a().a(edy.a(ckm.vw)).a(egg.a($$0).a(da.a.a().a(cuw.s_, true))));
   }

   protected edq.a a(cua $$0, cke $$1) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a($$1).a(eei.a(cox.x))));
   }

   protected edq.a b(cua $$0, cqy $$1) {
      return a($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a($$1).a(efg.a(ehf.a(-6.0F, 2.0F))).a(eet.a(edh.b(0)))));
   }

   protected edq.a k(cua $$0) {
      return b($$0, (eeb.a<?>)this.a((cqy)$$0, edy.a(ckm.oH).a(egm.a(0.125F)).a(eei.a(cox.x, 2))));
   }

   public edq.a b(cua $$0, cke $$1) {
      return edq.b()
         .a(
            this.a(
               $$0,
               edp.a()
                  .a(eha.a(1.0F))
                  .a(edy.a($$1).a(dbu.c.a(), $$1x -> efg.a(egz.a(3, (float)($$1x + 1) / 15.0F)).a(egg.a($$0).a(da.a.a().a(dbu.c, $$1x.intValue())))))
            )
         );
   }

   public edq.a c(cua $$0, cke $$1) {
      return edq.b().a(this.a($$0, edp.a().a(eha.a(1.0F)).a(edy.a($$1).a(efg.a(egz.a(3, 0.53333336F))))));
   }

   protected static edq.a b(cqy $$0) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a(c).a(edy.a($$0)));
   }

   protected edq.a a(cua $$0, egh.a $$1) {
      return edq.b()
         .a(
            edp.a()
               .a(
                  (eeb.a<?>)this.a(
                     (cqy)$$0,
                     edy.a($$0)
                        .a($$1)
                        .a(hx.values(), $$1x -> efg.a(eha.a(1.0F), true).a(egg.a($$0).a(da.a.a().a(cyy.b($$1x), true))))
                        .a(efg.a(eha.a(-1.0F), true))
                  )
               )
         );
   }

   protected edq.a a(cua $$0, cua $$1, float... $$2) {
      return c($$0, ((eed.a)this.a((cqy)$$0, edy.a($$1))).a(efx.a(cox.x, $$2)))
         .a(edp.a().a(eha.a(1.0F)).a(i).a(((eed.a)this.a((cqy)$$0, edy.a(ckm.oB).a(efg.a(ehf.a(1.0F, 2.0F))))).a(efx.a(cox.x, j))));
   }

   protected edq.a b(cua $$0, cua $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(edp.a().a(eha.a(1.0F)).a(i).a(((eed.a)this.a((cqy)$$0, edy.a(ckm.nF))).a(efx.a(cox.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected edq.a l(cua $$0) {
      return c($$0, ((eed.a)this.a((cqy)cuc.aL, edy.a(ckm.oB).a(efg.a(ehf.a(1.0F, 2.0F))))).a(efx.a(cox.x, j)));
   }

   protected edq.a a(cua $$0, cke $$1, cke $$2, egh.a $$3) {
      return this.a((cqy)$$0, edq.b().a(edp.a().a(edy.a($$1).a($$3).a(edy.a($$2)))).a(edp.a().a($$3).a(edy.a($$2).a(eei.a(cox.x, 0.5714286F, 3)))));
   }

   protected static edq.a m(cua $$0) {
      return edq.b().a(edp.a().a(c).a(edy.a($$0).a(efg.a(eha.a(2.0F)))));
   }

   protected edq.a a(cua $$0, cua $$1) {
      eeb.a<?> $$2 = edy.a($$1).a(efg.a(eha.a(2.0F))).a(c).a(((eed.a)this.a((cqy)$$0, edy.a(ckm.oH))).a(egm.a(0.125F)));
      return edq.b()
         .a(edp.a().a($$2).a(egg.a($$0).a(da.a.a().a(cwg.b, dgx.b))).a(egf.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cwg.b, dgx.a))), new ht(0, 1, 0))))
         .a(edp.a().a($$2).a(egg.a($$0).a(da.a.a().a(cwg.b, dgx.a))).a(egf.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cwg.b, dgx.b))), new ht(0, -1, 0))));
   }

   protected edq.a n(cua $$0) {
      return edq.b()
         .a(
            edp.a()
               .a(eha.a(1.0F))
               .a(
                  (eeb.a<?>)this.a(
                     $$0, edy.a($$0).a(List.of(2, 3, 4), $$1 -> efg.a(eha.a((float)$$1.intValue())).a(egg.a($$0).a(da.a.a().a(cup.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected edq.a o(cua $$0) {
      return edq.b()
         .a(
            edp.a()
               .a(eha.a(1.0F))
               .a(
                  (eeb.a<?>)this.a(
                     $$0,
                     edy.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> efg.a(eha.a((float)$$1.intValue())).a(egg.a($$0).a(da.a.a().a(czl.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static edq.a p(cua $$0) {
      return edq.b().a(edp.a().a(eha.a(1.0F)).a(edy.a($$0)));
   }

   public static edq.a a() {
      return edq.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<afw, edq.a> $$0) {
      this.b();
      Set<afw> $$1 = new HashSet<>();

      for (cua $$2 : jy.f) {
         if ($$2.a(this.e)) {
            afw $$3 = $$2.u();
            if ($$3 != edg.a && $$1.add($$3)) {
               edq.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jy.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cua $$0, cua $$1) {
      edq.a $$2 = c($$0, edy.a($$0).a(efx.a(cox.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected edq.a q(cua $$0) {
      return this.a($$0, cwe.f, dgx.b);
   }

   protected void r(cua $$0) {
      this.a($$0, $$0x -> this.d((cqy)((cxb)$$0x).b()));
   }

   protected void c(cua $$0, cua $$1) {
      this.a($$0, c((cqy)$$1));
   }

   protected void c(cua $$0, cqy $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cua $$0) {
      this.c($$0, $$0);
   }

   protected void t(cua $$0) {
      this.c($$0, (cqy)$$0);
   }

   protected void a(cua $$0, Function<cua, edq.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cua $$0, edq.a $$1) {
      this.f.put($$0.u(), $$1);
   }
}
