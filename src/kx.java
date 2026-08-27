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
   protected static final ehk.a a = ehr.a(cb.a.a().a(new bl(cpq.v, cl.d.b(1))));
   protected static final ehk.a b = a.invert();
   protected static final ehk.a c = ehr.a(cb.a.a().a(cle.rh));
   private static final ehk.a h = c.or(a);
   private static final ehk.a i = h.invert();
   protected final Set<ckw> d;
   protected final cfv e;
   protected final Map<agg, eet.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kx(Set<ckw> $$0, cfv $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kx(Set<ckw> $$0, cfv $$1, Map<agg, eet.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends efv<T>> T a(crr $$0, efv<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efm.c()) : $$1.c();
   }

   protected <T extends ehd<T>> T a(crr $$0, ehd<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehg.c()) : $$1.d();
   }

   public eet.a a(crr $$0) {
      return eet.b().a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$0))));
   }

   private static eet.a a(cut $$0, ehk.a $$1, efe.a<?> $$2) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a(efb.a($$0).a($$1).a($$2)));
   }

   protected static eet.a a(cut $$0, efe.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eet.a b(cut $$0, efe.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eet.a c(cut $$0, efe.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eet.a a(cut $$0, crr $$1) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a($$1)));
   }

   protected eet.a a(crr $$0, eif $$1) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a((efe.a<?>)this.a($$0, efb.a($$0).a(egj.a($$1)))));
   }

   protected eet.a a(cut $$0, crr $$1, eif $$2) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a($$1).a(egj.a($$2))));
   }

   private static eet.a c(crr $$0) {
      return eet.b().a(ees.a().a(a).a(eid.a(1.0F)).a(efb.a($$0)));
   }

   private eet.a d(crr $$0) {
      return eet.b().a(this.a(cuv.fR, ees.a().a(eid.a(1.0F)).a(efb.a(cuv.fR)))).a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$0))));
   }

   protected eet.a a(cut $$0) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a((efe.a<?>)this.a((crr)$$0, efb.a($$0).a(egj.a(eid.a(2.0F)).a(ehj.a($$0).a(da.a.a().a(dbv.b, die.c)))))));
   }

   protected <T extends Comparable<T> & aub> eet.a a(cut $$0, dhz<T> $$1, T $$2) {
      return eet.b().a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$0).a(ehj.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected eet.a b(cut $$0) {
      return eet.b().a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$0).a(efo.a(efo.a.d)))));
   }

   protected eet.a c(cut $$0) {
      return eet.b()
         .a(
            this.a(
               $$0,
               ees.a()
                  .a(eid.a(1.0F))
                  .a(
                     efb.a($$0)
                        .a(efo.a(efo.a.d))
                        .a(
                           efp.a(ehw.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(egf.a(det.x).a(eey.a(dbr.c)))
                  )
            )
         );
   }

   protected eet.a d(cut $$0) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a(cle.nR).a(egj.a(eii.a(2.0F, 5.0F))).a(efl.a(cpq.x))));
   }

   protected eet.a e(cut $$0) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a(cle.nM).a(egj.a(eii.a(4.0F, 9.0F))).a(efl.a(cpq.x))));
   }

   protected eet.a f(cut $$0) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a(cle.ll).a(egj.a(eii.a(4.0F, 5.0F))).a(efl.b(cpq.x))));
   }

   protected eet.a g(cut $$0) {
      return eet.b().a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$0).a(efo.a(efo.a.d)).a(efp.a(ehw.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static eet.a h(cut $$0) {
      return eet.b().a(ees.a().a(a).a(eid.a(1.0F)).a(efb.a($$0).a(efp.a(ehw.a).a("Bees", "BlockEntityTag.Bees")).a(efn.a($$0).a(cun.c))));
   }

   protected static eet.a i(cut $$0) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a(efb.a($$0).a(a).a(efp.a(ehw.a).a("Bees", "BlockEntityTag.Bees")).a(efn.a($$0).a(cun.c)).a(efb.a($$0))));
   }

   protected static eet.a j(cut $$0) {
      return eet.b().a(ees.a().a(efb.a(cle.vx)).a(ehj.a($$0).a(da.a.a().a(cvp.s_, true))));
   }

   protected eet.a a(cut $$0, ckw $$1) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a($$1).a(efl.a(cpq.x))));
   }

   protected eet.a b(cut $$0, crr $$1) {
      return a($$0, (efe.a<?>)this.a((crr)$$0, efb.a($$1).a(egj.a(eii.a(-6.0F, 2.0F))).a(efw.a(eek.b(0)))));
   }

   protected eet.a k(cut $$0) {
      return b($$0, (efe.a<?>)this.a((crr)$$0, efb.a(cle.oH).a(ehp.a(0.125F)).a(efl.a(cpq.x, 2))));
   }

   public eet.a b(cut $$0, ckw $$1) {
      return eet.b()
         .a(
            this.a(
               $$0,
               ees.a()
                  .a(eid.a(1.0F))
                  .a(efb.a($$1).a(dco.c.a(), $$1x -> egj.a(eic.a(3, (float)($$1x + 1) / 15.0F)).a(ehj.a($$0).a(da.a.a().a(dco.c, $$1x.intValue())))))
            )
         );
   }

   public eet.a c(cut $$0, ckw $$1) {
      return eet.b().a(this.a($$0, ees.a().a(eid.a(1.0F)).a(efb.a($$1).a(egj.a(eic.a(3, 0.53333336F))))));
   }

   protected static eet.a b(crr $$0) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a(c).a(efb.a($$0)));
   }

   protected eet.a a(cut $$0, ehk.a $$1) {
      return eet.b()
         .a(
            ees.a()
               .a(
                  (efe.a<?>)this.a(
                     (crr)$$0,
                     efb.a($$0)
                        .a($$1)
                        .a(hx.values(), $$1x -> egj.a(eid.a(1.0F), true).a(ehj.a($$0).a(da.a.a().a(czs.b($$1x), true))))
                        .a(egj.a(eid.a(-1.0F), true))
                  )
               )
         );
   }

   protected eet.a a(cut $$0, cut $$1, float... $$2) {
      return c($$0, ((efg.a)this.a((crr)$$0, efb.a($$1))).a(eha.a(cpq.x, $$2)))
         .a(ees.a().a(eid.a(1.0F)).a(i).a(((efg.a)this.a((crr)$$0, efb.a(cle.oB).a(egj.a(eii.a(1.0F, 2.0F))))).a(eha.a(cpq.x, j))));
   }

   protected eet.a b(cut $$0, cut $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ees.a().a(eid.a(1.0F)).a(i).a(((efg.a)this.a((crr)$$0, efb.a(cle.nF))).a(eha.a(cpq.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eet.a l(cut $$0) {
      return c($$0, ((efg.a)this.a((crr)cuv.aL, efb.a(cle.oB).a(egj.a(eii.a(1.0F, 2.0F))))).a(eha.a(cpq.x, j)));
   }

   protected eet.a a(cut $$0, ckw $$1, ckw $$2, ehk.a $$3) {
      return this.a((crr)$$0, eet.b().a(ees.a().a(efb.a($$1).a($$3).a(efb.a($$2)))).a(ees.a().a($$3).a(efb.a($$2).a(efl.a(cpq.x, 0.5714286F, 3)))));
   }

   protected static eet.a m(cut $$0) {
      return eet.b().a(ees.a().a(c).a(efb.a($$0).a(egj.a(eid.a(2.0F)))));
   }

   protected eet.a a(cut $$0, cut $$1) {
      efe.a<?> $$2 = efb.a($$1).a(egj.a(eid.a(2.0F))).a(c).a(((efg.a)this.a((crr)$$0, efb.a(cle.oH))).a(ehp.a(0.125F)));
      return eet.b()
         .a(ees.a().a($$2).a(ehj.a($$0).a(da.a.a().a(cxa.b, dhs.b))).a(ehi.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxa.b, dhs.a))), new ht(0, 1, 0))))
         .a(ees.a().a($$2).a(ehj.a($$0).a(da.a.a().a(cxa.b, dhs.a))).a(ehi.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cxa.b, dhs.b))), new ht(0, -1, 0))));
   }

   protected eet.a n(cut $$0) {
      return eet.b()
         .a(
            ees.a()
               .a(eid.a(1.0F))
               .a(
                  (efe.a<?>)this.a(
                     $$0, efb.a($$0).a(List.of(2, 3, 4), $$1 -> egj.a(eid.a((float)$$1.intValue())).a(ehj.a($$0).a(da.a.a().a(cvi.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eet.a o(cut $$0) {
      return eet.b()
         .a(
            ees.a()
               .a(eid.a(1.0F))
               .a(
                  (efe.a<?>)this.a(
                     $$0,
                     efb.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> egj.a(eid.a((float)$$1.intValue())).a(ehj.a($$0).a(da.a.a().a(daf.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eet.a p(cut $$0) {
      return eet.b().a(ees.a().a(eid.a(1.0F)).a(efb.a($$0)));
   }

   public static eet.a a() {
      return eet.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<agg, eet.a> $$0) {
      this.b();
      Set<agg> $$1 = new HashSet<>();

      for (cut $$2 : jy.f) {
         if ($$2.a(this.e)) {
            agg $$3 = $$2.u();
            if ($$3 != eej.a && $$1.add($$3)) {
               eet.a $$4 = this.f.remove($$3);
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

   protected void b(cut $$0, cut $$1) {
      eet.a $$2 = c($$0, efb.a($$0).a(eha.a(cpq.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eet.a q(cut $$0) {
      return this.a($$0, cwy.f, dhs.b);
   }

   protected void r(cut $$0) {
      this.a($$0, $$0x -> this.d((crr)((cxv)$$0x).b()));
   }

   protected void c(cut $$0, cut $$1) {
      this.a($$0, c((crr)$$1));
   }

   protected void c(cut $$0, crr $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cut $$0) {
      this.c($$0, $$0);
   }

   protected void t(cut $$0) {
      this.c($$0, (crr)$$0);
   }

   protected void a(cut $$0, Function<cut, eet.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cut $$0, eet.a $$1) {
      this.f.put($$0.u(), $$1);
   }
}
