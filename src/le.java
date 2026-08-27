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
   protected static final eke.a a = ekl.a(ca.a.a().a(new bk(crv.v, ck.d.b(1))));
   protected static final eke.a b = a.invert();
   protected static final eke.a c = ekl.a(ca.a.a().a(cnj.rU));
   private static final eke.a h = c.or(a);
   private static final eke.a i = h.invert();
   protected final Set<cnb> d;
   protected final cia e;
   protected final Map<ahh, ehn.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected le(Set<cnb> $$0, cia $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected le(Set<cnb> $$0, cia $$1, Map<ahh, ehn.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eip<T>> T a(ctw $$0, eip<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(eig.c()) : $$1.c();
   }

   protected <T extends ejx<T>> T a(ctw $$0, ejx<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(eka.c()) : $$1.d();
   }

   public ehn.a a(ctw $$0) {
      return ehn.b().a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0))));
   }

   private static ehn.a a(cwy $$0, eke.a $$1, ehy.a<?> $$2) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0).a($$1).a($$2)));
   }

   protected static ehn.a a(cwy $$0, ehy.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ehn.a b(cwy $$0, ehy.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ehn.a c(cwy $$0, ehy.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ehn.a a(cwy $$0, ctw $$1) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a($$1)));
   }

   protected ehn.a a(ctw $$0, ekz $$1) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a((ehy.a<?>)this.a($$0, ehv.a($$0).a(ejd.a($$1)))));
   }

   protected ehn.a a(cwy $$0, ctw $$1, ekz $$2) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a($$1).a(ejd.a($$2))));
   }

   private static ehn.a c(ctw $$0) {
      return ehn.b().a(ehm.a().a(a).a(ekx.a(1.0F)).a(ehv.a($$0)));
   }

   private ehn.a d(ctw $$0) {
      return ehn.b().a(this.a(cxa.fR, ehm.a().a(ekx.a(1.0F)).a(ehv.a(cxa.fR)))).a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0))));
   }

   protected ehn.a a(cwy $$0) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a((ehy.a<?>)this.a((ctw)$$0, ehv.a($$0).a(ejd.a(ekx.a(2.0F)).a(ekd.a($$0).a(cz.a.a().a(dea.b, dkx.c)))))));
   }

   protected <T extends Comparable<T> & avl> ehn.a a(cwy $$0, dks<T> $$1, T $$2) {
      return ehn.b().a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0).a(ekd.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected ehn.a b(cwy $$0) {
      return ehn.b().a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0).a(eii.a(eii.a.d)))));
   }

   protected ehn.a c(cwy $$0) {
      return ehn.b()
         .a(
            this.a(
               $$0,
               ehm.a()
                  .a(ekx.a(1.0F))
                  .a(
                     ehv.a($$0)
                        .a(eii.a(eii.a.d))
                        .a(
                           eij.a(ekq.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eiz.a(dhf.x).a(ehs.a(ddw.c)))
                  )
            )
         );
   }

   protected ehn.a d(cwy $$0) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a(cnj.oE).a(ejd.a(elc.a(2.0F, 5.0F))).a(eif.a(crv.x))));
   }

   protected ehn.a e(cwy $$0) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a(cnj.oz).a(ejd.a(elc.a(4.0F, 9.0F))).a(eif.a(crv.x))));
   }

   protected ehn.a f(cwy $$0) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a(cnj.lG).a(ejd.a(elc.a(4.0F, 5.0F))).a(eif.b(crv.x))));
   }

   protected ehn.a g(cwy $$0) {
      return ehn.b().a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0).a(eii.a(eii.a.d)).a(eij.a(ekq.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ehn.a h(cwy $$0) {
      return ehn.b().a(ehm.a().a(a).a(ekx.a(1.0F)).a(ehv.a($$0).a(eij.a(ekq.a).a("Bees", "BlockEntityTag.Bees")).a(eih.a($$0).a(cws.c))));
   }

   protected static ehn.a i(cwy $$0) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0).a(a).a(eij.a(ekq.a).a("Bees", "BlockEntityTag.Bees")).a(eih.a($$0).a(cws.c)).a(ehv.a($$0))));
   }

   protected static ehn.a j(cwy $$0) {
      return ehn.b().a(ehm.a().a(ehv.a(cnj.wm)).a(ekd.a($$0).a(cz.a.a().a(cxu.u_, true))));
   }

   protected ehn.a a(cwy $$0, cnb $$1) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a($$1).a(eif.a(crv.x))));
   }

   protected ehn.a b(cwy $$0, ctw $$1) {
      return a($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a($$1).a(ejd.a(elc.a(-6.0F, 2.0F))).a(eiq.a(ehe.b(0)))));
   }

   protected ehn.a k(cwy $$0) {
      return b($$0, (ehy.a<?>)this.a((ctw)$$0, ehv.a(cnj.pu).a(ekj.a(0.125F)).a(eif.a(crv.x, 2))));
   }

   public ehn.a b(cwy $$0, cnb $$1) {
      return ehn.b()
         .a(
            this.a(
               $$0,
               ehm.a()
                  .a(ekx.a(1.0F))
                  .a(ehv.a($$1).a(det.c.a(), $$1x -> ejd.a(ekw.a(3, (float)($$1x + 1) / 15.0F)).a(ekd.a($$0).a(cz.a.a().a(det.c, $$1x.intValue())))))
            )
         );
   }

   public ehn.a c(cwy $$0, cnb $$1) {
      return ehn.b().a(this.a($$0, ehm.a().a(ekx.a(1.0F)).a(ehv.a($$1).a(ejd.a(ekw.a(3, 0.53333336F))))));
   }

   protected static ehn.a b(ctw $$0) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a(c).a(ehv.a($$0)));
   }

   protected ehn.a a(cwy $$0, eke.a $$1) {
      return ehn.b()
         .a(
            ehm.a()
               .a(
                  (ehy.a<?>)this.a(
                     (ctw)$$0,
                     ehv.a($$0)
                        .a($$1)
                        .a(ic.values(), $$1x -> ejd.a(ekx.a(1.0F), true).a(ekd.a($$0).a(cz.a.a().a(dbx.b($$1x), true))))
                        .a(ejd.a(ekx.a(-1.0F), true))
                  )
               )
         );
   }

   protected ehn.a a(cwy $$0, cwy $$1, float... $$2) {
      return c($$0, ((eia.a)this.a((ctw)$$0, ehv.a($$1))).a(eju.a(crv.x, $$2)))
         .a(ehm.a().a(ekx.a(1.0F)).a(i).a(((eia.a)this.a((ctw)$$0, ehv.a(cnj.po).a(ejd.a(elc.a(1.0F, 2.0F))))).a(eju.a(crv.x, j))));
   }

   protected ehn.a b(cwy $$0, cwy $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ehm.a().a(ekx.a(1.0F)).a(i).a(((eia.a)this.a((ctw)$$0, ehv.a(cnj.os))).a(eju.a(crv.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ehn.a l(cwy $$0) {
      return c($$0, ((eia.a)this.a((ctw)cxa.aL, ehv.a(cnj.po).a(ejd.a(elc.a(1.0F, 2.0F))))).a(eju.a(crv.x, j)));
   }

   protected ehn.a a(cwy $$0, cnb $$1, cnb $$2, eke.a $$3) {
      return this.a((ctw)$$0, ehn.b().a(ehm.a().a(ehv.a($$1).a($$3).a(ehv.a($$2)))).a(ehm.a().a($$3).a(ehv.a($$2).a(eif.a(crv.x, 0.5714286F, 3)))));
   }

   protected static ehn.a m(cwy $$0) {
      return ehn.b().a(ehm.a().a(c).a(ehv.a($$0).a(ejd.a(ekx.a(2.0F)))));
   }

   protected ehn.a a(cwy $$0, cwy $$1) {
      ehy.a<?> $$2 = ehv.a($$1).a(ejd.a(ekx.a(2.0F))).a(c).a(((eia.a)this.a((ctw)$$0, ehv.a(cnj.pu))).a(ekj.a(0.125F)));
      return ehn.b()
         .a(ehm.a().a($$2).a(ekd.a($$0).a(cz.a.a().a(czg.b, dkl.b))).a(ekc.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(czg.b, dkl.a))), new hx(0, 1, 0))))
         .a(ehm.a().a($$2).a(ekd.a($$0).a(cz.a.a().a(czg.b, dkl.a))).a(ekc.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(czg.b, dkl.b))), new hx(0, -1, 0))));
   }

   protected ehn.a n(cwy $$0) {
      return ehn.b()
         .a(
            ehm.a()
               .a(ekx.a(1.0F))
               .a(
                  (ehy.a<?>)this.a(
                     $$0, ehv.a($$0).a(List.of(2, 3, 4), $$1 -> ejd.a(ekx.a((float)$$1.intValue())).a(ekd.a($$0).a(cz.a.a().a(cxn.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ehn.a o(cwy $$0) {
      return ehn.b()
         .a(
            ehm.a()
               .a(ekx.a(1.0F))
               .a(
                  (ehy.a<?>)this.a(
                     $$0,
                     ehv.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ejd.a(ekx.a((float)$$1.intValue())).a(ekd.a($$0).a(cz.a.a().a(dck.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ehn.a p(cwy $$0) {
      return ehn.b().a(ehm.a().a(ekx.a(1.0F)).a(ehv.a($$0)));
   }

   public static ehn.a a() {
      return ehn.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ahh, ehn.a> $$0) {
      this.b();
      Set<ahh> $$1 = new HashSet<>();

      for (cwy $$2 : kd.e) {
         if ($$2.a(this.e)) {
            ahh $$3 = $$2.v();
            if ($$3 != ehd.a && $$1.add($$3)) {
               ehn.a $$4 = this.f.remove($$3);
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

   protected void b(cwy $$0, cwy $$1) {
      ehn.a $$2 = c($$0, ehv.a($$0).a(eju.a(crv.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ehn.a q(cwy $$0) {
      return this.a($$0, cze.f, dkl.b);
   }

   protected void r(cwy $$0) {
      this.a($$0, $$0x -> this.d((ctw)((dab)$$0x).b()));
   }

   protected void c(cwy $$0, cwy $$1) {
      this.a($$0, c((ctw)$$1));
   }

   protected void c(cwy $$0, ctw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cwy $$0) {
      this.c($$0, $$0);
   }

   protected void t(cwy $$0) {
      this.c($$0, (ctw)$$0);
   }

   protected void a(cwy $$0, Function<cwy, ehn.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cwy $$0, ehn.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
