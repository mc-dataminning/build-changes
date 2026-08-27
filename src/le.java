import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class le implements lh {
   protected static final eju.a a = ekb.a(ca.a.a().a(new bk(crm.v, ck.d.b(1))));
   protected static final eju.a b = a.invert();
   protected static final eju.a c = ekb.a(ca.a.a().a(cna.rS));
   private static final eju.a h = c.or(a);
   private static final eju.a i = h.invert();
   protected final Set<cms> d;
   protected final chr e;
   protected final Map<ahg, ehd.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected le(Set<cms> $$0, chr $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected le(Set<cms> $$0, chr $$1, Map<ahg, ehd.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eif<T>> T a(ctn $$0, eif<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehw.c()) : $$1.c();
   }

   protected <T extends ejn<T>> T a(ctn $$0, ejn<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ejq.c()) : $$1.d();
   }

   public ehd.a a(ctn $$0) {
      return ehd.b().a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0))));
   }

   private static ehd.a a(cwp $$0, eju.a $$1, eho.a<?> $$2) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0).a($$1).a($$2)));
   }

   protected static ehd.a a(cwp $$0, eho.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ehd.a b(cwp $$0, eho.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ehd.a c(cwp $$0, eho.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ehd.a a(cwp $$0, ctn $$1) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a($$1)));
   }

   protected ehd.a a(ctn $$0, ekp $$1) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a((eho.a<?>)this.a($$0, ehl.a($$0).a(eit.a($$1)))));
   }

   protected ehd.a a(cwp $$0, ctn $$1, ekp $$2) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a($$1).a(eit.a($$2))));
   }

   private static ehd.a c(ctn $$0) {
      return ehd.b().a(ehc.a().a(a).a(ekn.a(1.0F)).a(ehl.a($$0)));
   }

   private ehd.a d(ctn $$0) {
      return ehd.b().a(this.a(cwr.fR, ehc.a().a(ekn.a(1.0F)).a(ehl.a(cwr.fR)))).a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0))));
   }

   protected ehd.a a(cwp $$0) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a((eho.a<?>)this.a((ctn)$$0, ehl.a($$0).a(eit.a(ekn.a(2.0F)).a(ejt.a($$0).a(cz.a.a().a(ddr.b, dko.c)))))));
   }

   protected <T extends Comparable<T> & avj> ehd.a a(cwp $$0, dkj<T> $$1, T $$2) {
      return ehd.b().a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0).a(ejt.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected ehd.a b(cwp $$0) {
      return ehd.b().a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0).a(ehy.a(ehy.a.d)))));
   }

   protected ehd.a c(cwp $$0) {
      return ehd.b()
         .a(
            this.a(
               $$0,
               ehc.a()
                  .a(ekn.a(1.0F))
                  .a(
                     ehl.a($$0)
                        .a(ehy.a(ehy.a.d))
                        .a(
                           ehz.a(ekg.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eip.a(dgw.x).a(ehi.a(ddn.c)))
                  )
            )
         );
   }

   protected ehd.a d(cwp $$0) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a(cna.oC).a(eit.a(eks.a(2.0F, 5.0F))).a(ehv.a(crm.x))));
   }

   protected ehd.a e(cwp $$0) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a(cna.ox).a(eit.a(eks.a(4.0F, 9.0F))).a(ehv.a(crm.x))));
   }

   protected ehd.a f(cwp $$0) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a(cna.lG).a(eit.a(eks.a(4.0F, 5.0F))).a(ehv.b(crm.x))));
   }

   protected ehd.a g(cwp $$0) {
      return ehd.b().a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0).a(ehy.a(ehy.a.d)).a(ehz.a(ekg.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ehd.a h(cwp $$0) {
      return ehd.b().a(ehc.a().a(a).a(ekn.a(1.0F)).a(ehl.a($$0).a(ehz.a(ekg.a).a("Bees", "BlockEntityTag.Bees")).a(ehx.a($$0).a(cwj.c))));
   }

   protected static ehd.a i(cwp $$0) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0).a(a).a(ehz.a(ekg.a).a("Bees", "BlockEntityTag.Bees")).a(ehx.a($$0).a(cwj.c)).a(ehl.a($$0))));
   }

   protected static ehd.a j(cwp $$0) {
      return ehd.b().a(ehc.a().a(ehl.a(cna.wj)).a(ejt.a($$0).a(cz.a.a().a(cxl.t_, true))));
   }

   protected ehd.a a(cwp $$0, cms $$1) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a($$1).a(ehv.a(crm.x))));
   }

   protected ehd.a b(cwp $$0, ctn $$1) {
      return a($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a($$1).a(eit.a(eks.a(-6.0F, 2.0F))).a(eig.a(egu.b(0)))));
   }

   protected ehd.a k(cwp $$0) {
      return b($$0, (eho.a<?>)this.a((ctn)$$0, ehl.a(cna.ps).a(ejz.a(0.125F)).a(ehv.a(crm.x, 2))));
   }

   public ehd.a b(cwp $$0, cms $$1) {
      return ehd.b()
         .a(
            this.a(
               $$0,
               ehc.a()
                  .a(ekn.a(1.0F))
                  .a(ehl.a($$1).a(dek.c.a(), $$1x -> eit.a(ekm.a(3, (float)($$1x + 1) / 15.0F)).a(ejt.a($$0).a(cz.a.a().a(dek.c, $$1x.intValue())))))
            )
         );
   }

   public ehd.a c(cwp $$0, cms $$1) {
      return ehd.b().a(this.a($$0, ehc.a().a(ekn.a(1.0F)).a(ehl.a($$1).a(eit.a(ekm.a(3, 0.53333336F))))));
   }

   protected static ehd.a b(ctn $$0) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a(c).a(ehl.a($$0)));
   }

   protected ehd.a a(cwp $$0, eju.a $$1) {
      return ehd.b()
         .a(
            ehc.a()
               .a(
                  (eho.a<?>)this.a(
                     (ctn)$$0,
                     ehl.a($$0)
                        .a($$1)
                        .a(ic.values(), $$1x -> eit.a(ekn.a(1.0F), true).a(ejt.a($$0).a(cz.a.a().a(dbo.b($$1x), true))))
                        .a(eit.a(ekn.a(-1.0F), true))
                  )
               )
         );
   }

   protected ehd.a a(cwp $$0, cwp $$1, float... $$2) {
      return c($$0, ((ehq.a)this.a((ctn)$$0, ehl.a($$1))).a(ejk.a(crm.x, $$2)))
         .a(ehc.a().a(ekn.a(1.0F)).a(i).a(((ehq.a)this.a((ctn)$$0, ehl.a(cna.pm).a(eit.a(eks.a(1.0F, 2.0F))))).a(ejk.a(crm.x, j))));
   }

   protected ehd.a b(cwp $$0, cwp $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ehc.a().a(ekn.a(1.0F)).a(i).a(((ehq.a)this.a((ctn)$$0, ehl.a(cna.oq))).a(ejk.a(crm.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ehd.a l(cwp $$0) {
      return c($$0, ((ehq.a)this.a((ctn)cwr.aL, ehl.a(cna.pm).a(eit.a(eks.a(1.0F, 2.0F))))).a(ejk.a(crm.x, j)));
   }

   protected ehd.a a(cwp $$0, cms $$1, cms $$2, eju.a $$3) {
      return this.a((ctn)$$0, ehd.b().a(ehc.a().a(ehl.a($$1).a($$3).a(ehl.a($$2)))).a(ehc.a().a($$3).a(ehl.a($$2).a(ehv.a(crm.x, 0.5714286F, 3)))));
   }

   protected static ehd.a m(cwp $$0) {
      return ehd.b().a(ehc.a().a(c).a(ehl.a($$0).a(eit.a(ekn.a(2.0F)))));
   }

   protected ehd.a a(cwp $$0, cwp $$1) {
      eho.a<?> $$2 = ehl.a($$1).a(eit.a(ekn.a(2.0F))).a(c).a(((ehq.a)this.a((ctn)$$0, ehl.a(cna.ps))).a(ejz.a(0.125F)));
      return ehd.b()
         .a(ehc.a().a($$2).a(ejt.a($$0).a(cz.a.a().a(cyx.b, dkc.b))).a(ejs.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyx.b, dkc.a))), new hx(0, 1, 0))))
         .a(ehc.a().a($$2).a(ejt.a($$0).a(cz.a.a().a(cyx.b, dkc.a))).a(ejs.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyx.b, dkc.b))), new hx(0, -1, 0))));
   }

   protected ehd.a n(cwp $$0) {
      return ehd.b()
         .a(
            ehc.a()
               .a(ekn.a(1.0F))
               .a(
                  (eho.a<?>)this.a(
                     $$0, ehl.a($$0).a(List.of(2, 3, 4), $$1 -> eit.a(ekn.a((float)$$1.intValue())).a(ejt.a($$0).a(cz.a.a().a(cxe.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ehd.a o(cwp $$0) {
      return ehd.b()
         .a(
            ehc.a()
               .a(ekn.a(1.0F))
               .a(
                  (eho.a<?>)this.a(
                     $$0,
                     ehl.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eit.a(ekn.a((float)$$1.intValue())).a(ejt.a($$0).a(cz.a.a().a(dcb.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ehd.a p(cwp $$0) {
      return ehd.b().a(ehc.a().a(ekn.a(1.0F)).a(ehl.a($$0)));
   }

   public static ehd.a a() {
      return ehd.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ahg, ehd.a> $$0) {
      this.b();
      Set<ahg> $$1 = new HashSet<>();

      for (cwp $$2 : kd.e) {
         if ($$2.a(this.e)) {
            ahg $$3 = $$2.v();
            if ($$3 != egt.a && $$1.add($$3)) {
               ehd.a $$4 = this.f.remove($$3);
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

   protected void b(cwp $$0, cwp $$1) {
      ehd.a $$2 = c($$0, ehl.a($$0).a(ejk.a(crm.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ehd.a q(cwp $$0) {
      return this.a($$0, cyv.f, dkc.b);
   }

   protected void r(cwp $$0) {
      this.a($$0, $$0x -> this.d((ctn)((czs)$$0x).b()));
   }

   protected void c(cwp $$0, cwp $$1) {
      this.a($$0, c((ctn)$$1));
   }

   protected void c(cwp $$0, ctn $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cwp $$0) {
      this.c($$0, $$0);
   }

   protected void t(cwp $$0) {
      this.c($$0, (ctn)$$0);
   }

   protected void a(cwp $$0, Function<cwp, ehd.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cwp $$0, ehd.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
