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
   protected static final ehw.a a = eid.a(cb.a.a().a(new bl(cpy.v, cl.d.b(1))));
   protected static final ehw.a b = a.invert();
   protected static final ehw.a c = eid.a(cb.a.a().a(clm.rS));
   private static final ehw.a h = c.or(a);
   private static final ehw.a i = h.invert();
   protected final Set<cle> d;
   protected final cgd e;
   protected final Map<agi, eff.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kx(Set<cle> $$0, cgd $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kx(Set<cle> $$0, cgd $$1, Map<agi, eff.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends egh<T>> T a(crz $$0, egh<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efy.c()) : $$1.c();
   }

   protected <T extends ehp<T>> T a(crz $$0, ehp<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehs.c()) : $$1.d();
   }

   public eff.a a(crz $$0) {
      return eff.b().a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$0))));
   }

   private static eff.a a(cva $$0, ehw.a $$1, efq.a<?> $$2) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a(efn.a($$0).a($$1).a($$2)));
   }

   protected static eff.a a(cva $$0, efq.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eff.a b(cva $$0, efq.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eff.a c(cva $$0, efq.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eff.a a(cva $$0, crz $$1) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a($$1)));
   }

   protected eff.a a(crz $$0, eir $$1) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a((efq.a<?>)this.a($$0, efn.a($$0).a(egv.a($$1)))));
   }

   protected eff.a a(cva $$0, crz $$1, eir $$2) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a($$1).a(egv.a($$2))));
   }

   private static eff.a c(crz $$0) {
      return eff.b().a(efe.a().a(a).a(eip.a(1.0F)).a(efn.a($$0)));
   }

   private eff.a d(crz $$0) {
      return eff.b().a(this.a(cvc.fR, efe.a().a(eip.a(1.0F)).a(efn.a(cvc.fR)))).a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$0))));
   }

   protected eff.a a(cva $$0) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a((efq.a<?>)this.a((crz)$$0, efn.a($$0).a(egv.a(eip.a(2.0F)).a(ehv.a($$0).a(da.a.a().a(dcc.b, diq.c)))))));
   }

   protected <T extends Comparable<T> & aug> eff.a a(cva $$0, dil<T> $$1, T $$2) {
      return eff.b().a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$0).a(ehv.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected eff.a b(cva $$0) {
      return eff.b().a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$0).a(ega.a(ega.a.d)))));
   }

   protected eff.a c(cva $$0) {
      return eff.b()
         .a(
            this.a(
               $$0,
               efe.a()
                  .a(eip.a(1.0F))
                  .a(
                     efn.a($$0)
                        .a(ega.a(ega.a.d))
                        .a(
                           egb.a(eii.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(egr.a(dff.x).a(efk.a(dby.c)))
                  )
            )
         );
   }

   protected eff.a d(cva $$0) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a(clm.oC).a(egv.a(eiu.a(2.0F, 5.0F))).a(efx.a(cpy.x))));
   }

   protected eff.a e(cva $$0) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a(clm.ox).a(egv.a(eiu.a(4.0F, 9.0F))).a(efx.a(cpy.x))));
   }

   protected eff.a f(cva $$0) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a(clm.lG).a(egv.a(eiu.a(4.0F, 5.0F))).a(efx.b(cpy.x))));
   }

   protected eff.a g(cva $$0) {
      return eff.b().a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$0).a(ega.a(ega.a.d)).a(egb.a(eii.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static eff.a h(cva $$0) {
      return eff.b().a(efe.a().a(a).a(eip.a(1.0F)).a(efn.a($$0).a(egb.a(eii.a).a("Bees", "BlockEntityTag.Bees")).a(efz.a($$0).a(cuu.c))));
   }

   protected static eff.a i(cva $$0) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a(efn.a($$0).a(a).a(egb.a(eii.a).a("Bees", "BlockEntityTag.Bees")).a(efz.a($$0).a(cuu.c)).a(efn.a($$0))));
   }

   protected static eff.a j(cva $$0) {
      return eff.b().a(efe.a().a(efn.a(clm.wi)).a(ehv.a($$0).a(da.a.a().a(cvw.s_, true))));
   }

   protected eff.a a(cva $$0, cle $$1) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a($$1).a(efx.a(cpy.x))));
   }

   protected eff.a b(cva $$0, crz $$1) {
      return a($$0, (efq.a<?>)this.a((crz)$$0, efn.a($$1).a(egv.a(eiu.a(-6.0F, 2.0F))).a(egi.a(eew.b(0)))));
   }

   protected eff.a k(cva $$0) {
      return b($$0, (efq.a<?>)this.a((crz)$$0, efn.a(clm.ps).a(eib.a(0.125F)).a(efx.a(cpy.x, 2))));
   }

   public eff.a b(cva $$0, cle $$1) {
      return eff.b()
         .a(
            this.a(
               $$0,
               efe.a()
                  .a(eip.a(1.0F))
                  .a(efn.a($$1).a(dcv.c.a(), $$1x -> egv.a(eio.a(3, (float)($$1x + 1) / 15.0F)).a(ehv.a($$0).a(da.a.a().a(dcv.c, $$1x.intValue())))))
            )
         );
   }

   public eff.a c(cva $$0, cle $$1) {
      return eff.b().a(this.a($$0, efe.a().a(eip.a(1.0F)).a(efn.a($$1).a(egv.a(eio.a(3, 0.53333336F))))));
   }

   protected static eff.a b(crz $$0) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a(c).a(efn.a($$0)));
   }

   protected eff.a a(cva $$0, ehw.a $$1) {
      return eff.b()
         .a(
            efe.a()
               .a(
                  (efq.a<?>)this.a(
                     (crz)$$0,
                     efn.a($$0)
                        .a($$1)
                        .a(hx.values(), $$1x -> egv.a(eip.a(1.0F), true).a(ehv.a($$0).a(da.a.a().a(czz.b($$1x), true))))
                        .a(egv.a(eip.a(-1.0F), true))
                  )
               )
         );
   }

   protected eff.a a(cva $$0, cva $$1, float... $$2) {
      return c($$0, ((efs.a)this.a((crz)$$0, efn.a($$1))).a(ehm.a(cpy.x, $$2)))
         .a(efe.a().a(eip.a(1.0F)).a(i).a(((efs.a)this.a((crz)$$0, efn.a(clm.pm).a(egv.a(eiu.a(1.0F, 2.0F))))).a(ehm.a(cpy.x, j))));
   }

   protected eff.a b(cva $$0, cva $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(efe.a().a(eip.a(1.0F)).a(i).a(((efs.a)this.a((crz)$$0, efn.a(clm.oq))).a(ehm.a(cpy.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eff.a l(cva $$0) {
      return c($$0, ((efs.a)this.a((crz)cvc.aL, efn.a(clm.pm).a(egv.a(eiu.a(1.0F, 2.0F))))).a(ehm.a(cpy.x, j)));
   }

   protected eff.a a(cva $$0, cle $$1, cle $$2, ehw.a $$3) {
      return this.a((crz)$$0, eff.b().a(efe.a().a(efn.a($$1).a($$3).a(efn.a($$2)))).a(efe.a().a($$3).a(efn.a($$2).a(efx.a(cpy.x, 0.5714286F, 3)))));
   }

   protected static eff.a m(cva $$0) {
      return eff.b().a(efe.a().a(c).a(efn.a($$0).a(egv.a(eip.a(2.0F)))));
   }

   protected eff.a a(cva $$0, cva $$1) {
      efq.a<?> $$2 = efn.a($$1).a(egv.a(eip.a(2.0F))).a(c).a(((efs.a)this.a((crz)$$0, efn.a(clm.ps))).a(eib.a(0.125F)));
      return eff.b()
         .a(efe.a().a($$2).a(ehv.a($$0).a(da.a.a().a(cxi.b, die.b))).a(ehu.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxi.b, die.a))), new ht(0, 1, 0))))
         .a(efe.a().a($$2).a(ehv.a($$0).a(da.a.a().a(cxi.b, die.a))).a(ehu.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxi.b, die.b))), new ht(0, -1, 0))));
   }

   protected eff.a n(cva $$0) {
      return eff.b()
         .a(
            efe.a()
               .a(eip.a(1.0F))
               .a(
                  (efq.a<?>)this.a(
                     $$0, efn.a($$0).a(List.of(2, 3, 4), $$1 -> egv.a(eip.a((float)$$1.intValue())).a(ehv.a($$0).a(da.a.a().a(cvp.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eff.a o(cva $$0) {
      return eff.b()
         .a(
            efe.a()
               .a(eip.a(1.0F))
               .a(
                  (efq.a<?>)this.a(
                     $$0,
                     efn.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> egv.a(eip.a((float)$$1.intValue())).a(ehv.a($$0).a(da.a.a().a(dam.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eff.a p(cva $$0) {
      return eff.b().a(efe.a().a(eip.a(1.0F)).a(efn.a($$0)));
   }

   public static eff.a a() {
      return eff.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<agi, eff.a> $$0) {
      this.b();
      Set<agi> $$1 = new HashSet<>();

      for (cva $$2 : jy.f) {
         if ($$2.a(this.e)) {
            agi $$3 = $$2.v();
            if ($$3 != eev.a && $$1.add($$3)) {
               eff.a $$4 = this.f.remove($$3);
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

   protected void b(cva $$0, cva $$1) {
      eff.a $$2 = c($$0, efn.a($$0).a(ehm.a(cpy.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eff.a q(cva $$0) {
      return this.a($$0, cxg.f, die.b);
   }

   protected void r(cva $$0) {
      this.a($$0, $$0x -> this.d((crz)((cyd)$$0x).b()));
   }

   protected void c(cva $$0, cva $$1) {
      this.a($$0, c((crz)$$1));
   }

   protected void c(cva $$0, crz $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cva $$0) {
      this.c($$0, $$0);
   }

   protected void t(cva $$0) {
      this.c($$0, (crz)$$0);
   }

   protected void a(cva $$0, Function<cva, eff.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cva $$0, eff.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
