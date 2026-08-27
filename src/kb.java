import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class kb implements ke {
   protected static final efh.a a = efo.a(bz.a.a().a(new bj(cnh.v, cj.d.b(1))));
   protected static final efh.a b = a.invert();
   protected static final efh.a c = efo.a(bz.a.a().a(ciz.rg));
   private static final efh.a h = c.or(a);
   private static final efh.a i = h.invert();
   protected final Set<cir> d;
   protected final cdt e;
   protected final Map<aep, ecp.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kb(Set<cir> $$0, cdt $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kb(Set<cir> $$0, cdt $$1, Map<aep, ecp.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends edt<T>> T a(cpj $$0, edt<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edk.c()) : $$1.c();
   }

   protected <T extends efa<T>> T a(cpj $$0, efa<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efd.c()) : $$1.d();
   }

   public ecp.a a(cpj $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$0))));
   }

   private static ecp.a a(csk $$0, efh.a $$1, edc.a<?> $$2) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a(ecz.a($$0).a($$1).a($$2)));
   }

   protected static ecp.a a(csk $$0, edc.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ecp.a b(csk $$0, edc.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ecp.a c(csk $$0, edc.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ecp.a a(csk $$0, cpj $$1) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a($$1)));
   }

   protected ecp.a a(cpj $$0, egc $$1) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a((edc.a<?>)this.a($$0, ecz.a($$0).a(eeg.a($$1)))));
   }

   protected ecp.a a(csk $$0, cpj $$1, egc $$2) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a($$1).a(eeg.a($$2))));
   }

   private static ecp.a c(cpj $$0) {
      return ecp.b().a(eco.a().a(a).a(ega.a(1.0F)).a(ecz.a($$0)));
   }

   private ecp.a d(cpj $$0) {
      return ecp.b().a(this.a(csl.fR, eco.a().a(ega.a(1.0F)).a(ecz.a(csl.fR)))).a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$0))));
   }

   protected ecp.a a(csk $$0) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a((edc.a<?>)this.a((cpj)$$0, ecz.a($$0).a(eeg.a(ega.a(2.0F)).a(efg.a($$0).a(cz.a.a().a(czn.a, dgg.c)))))));
   }

   protected <T extends Comparable<T> & asf> ecp.a a(csk $$0, dgb<T> $$1, T $$2) {
      return ecp.b().a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$0).a(efg.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected ecp.a b(csk $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$0).a(edm.a(edm.a.d)))));
   }

   protected ecp.a c(csk $$0) {
      return ecp.b()
         .a(
            this.a(
               $$0,
               eco.a()
                  .a(ega.a(1.0F))
                  .a(
                     ecz.a($$0)
                        .a(edm.a(edm.a.d))
                        .a(
                           edn.a(eft.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eec.a(dcm.x).a(ecw.a(czj.b)))
                  )
            )
         );
   }

   protected ecp.a d(csk $$0) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a(ciz.nR).a(eeg.a(egf.a(2.0F, 5.0F))).a(edj.a(cnh.x))));
   }

   protected ecp.a e(csk $$0) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a(ciz.nM).a(eeg.a(egf.a(4.0F, 9.0F))).a(edj.a(cnh.x))));
   }

   protected ecp.a f(csk $$0) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a(ciz.ll).a(eeg.a(egf.a(4.0F, 5.0F))).a(edj.b(cnh.x))));
   }

   protected ecp.a g(csk $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$0).a(edm.a(edm.a.d)).a(edn.a(eft.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ecp.a h(csk $$0) {
      return ecp.b().a(eco.a().a(a).a(ega.a(1.0F)).a(ecz.a($$0).a(edn.a(eft.a).a("Bees", "BlockEntityTag.Bees")).a(edl.a($$0).a(cse.b))));
   }

   protected static ecp.a i(csk $$0) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a(ecz.a($$0).a(a).a(edn.a(eft.a).a("Bees", "BlockEntityTag.Bees")).a(edl.a($$0).a(cse.b)).a(ecz.a($$0))));
   }

   protected static ecp.a j(csk $$0) {
      return ecp.b().a(eco.a().a(ecz.a(ciz.vw)).a(efg.a($$0).a(cz.a.a().a(ctf.s_, true))));
   }

   protected ecp.a a(csk $$0, cir $$1) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a($$1).a(edj.a(cnh.x))));
   }

   protected ecp.a b(csk $$0, cpj $$1) {
      return a($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a($$1).a(eeg.a(egf.a(-6.0F, 2.0F))).a(edu.a(ecg.b(0)))));
   }

   protected ecp.a k(csk $$0) {
      return b($$0, (edc.a<?>)this.a((cpj)$$0, ecz.a(ciz.oH).a(efm.a(0.125F)).a(edj.a(cnh.x, 2))));
   }

   public ecp.a b(csk $$0, cir $$1) {
      return ecp.b()
         .a(
            this.a(
               $$0,
               eco.a()
                  .a(ega.a(1.0F))
                  .a(ecz.a($$1).a(dag.b.a(), $$1x -> eeg.a(efz.a(3, (float)($$1x + 1) / 15.0F)).a(efg.a($$0).a(cz.a.a().a(dag.b, $$1x.intValue())))))
            )
         );
   }

   public ecp.a c(csk $$0, cir $$1) {
      return ecp.b().a(this.a($$0, eco.a().a(ega.a(1.0F)).a(ecz.a($$1).a(eeg.a(efz.a(3, 0.53333336F))))));
   }

   protected static ecp.a b(cpj $$0) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a(c).a(ecz.a($$0)));
   }

   protected ecp.a a(csk $$0, efh.a $$1) {
      return ecp.b()
         .a(
            eco.a()
               .a(
                  (edc.a<?>)this.a(
                     (cpj)$$0,
                     ecz.a($$0)
                        .a($$1)
                        .a(hb.values(), $$1x -> eeg.a(ega.a(1.0F), true).a(efg.a($$0).a(cz.a.a().a(cxi.b($$1x), true))))
                        .a(eeg.a(ega.a(-1.0F), true))
                  )
               )
         );
   }

   protected ecp.a a(csk $$0, csk $$1, float... $$2) {
      return c($$0, ((ede.a)this.a((cpj)$$0, ecz.a($$1))).a(eex.a(cnh.x, $$2)))
         .a(eco.a().a(ega.a(1.0F)).a(i).a(((ede.a)this.a((cpj)$$0, ecz.a(ciz.oB).a(eeg.a(egf.a(1.0F, 2.0F))))).a(eex.a(cnh.x, j))));
   }

   protected ecp.a b(csk $$0, csk $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eco.a().a(ega.a(1.0F)).a(i).a(((ede.a)this.a((cpj)$$0, ecz.a(ciz.nF))).a(eex.a(cnh.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ecp.a l(csk $$0) {
      return c($$0, ((ede.a)this.a((cpj)csl.aL, ecz.a(ciz.oB).a(eeg.a(egf.a(1.0F, 2.0F))))).a(eex.a(cnh.x, j)));
   }

   protected ecp.a a(csk $$0, cir $$1, cir $$2, efh.a $$3) {
      return this.a((cpj)$$0, ecp.b().a(eco.a().a(ecz.a($$1).a($$3).a(ecz.a($$2)))).a(eco.a().a($$3).a(ecz.a($$2).a(edj.a(cnh.x, 0.5714286F, 3)))));
   }

   protected static ecp.a m(csk $$0) {
      return ecp.b().a(eco.a().a(c).a(ecz.a($$0).a(eeg.a(ega.a(2.0F)))));
   }

   protected ecp.a a(csk $$0, csk $$1) {
      edc.a<?> $$2 = ecz.a($$1).a(eeg.a(ega.a(2.0F))).a(c).a(((ede.a)this.a((cpj)$$0, ecz.a(ciz.oH))).a(efm.a(0.125F)));
      return ecp.b()
         .a(eco.a().a($$2).a(efg.a($$0).a(cz.a.a().a(cuo.a, dfu.b))).a(eff.a(ch.a.a().a(at.a.a().a($$0).a(cz.a.a().a(cuo.a, dfu.a).b()).b()), new gv(0, 1, 0))))
         .a(
            eco.a()
               .a($$2)
               .a(efg.a($$0).a(cz.a.a().a(cuo.a, dfu.a)))
               .a(eff.a(ch.a.a().a(at.a.a().a($$0).a(cz.a.a().a(cuo.a, dfu.b).b()).b()), new gv(0, -1, 0)))
         );
   }

   protected ecp.a n(csk $$0) {
      return ecp.b()
         .a(
            eco.a()
               .a(ega.a(1.0F))
               .a(
                  (edc.a<?>)this.a(
                     $$0, ecz.a($$0).a(List.of(2, 3, 4), $$1 -> eeg.a(ega.a((float)$$1.intValue())).a(efg.a($$0).a(cz.a.a().a(csy.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected ecp.a o(csk $$0) {
      return ecp.b()
         .a(
            eco.a()
               .a(ega.a(1.0F))
               .a(
                  (edc.a<?>)this.a(
                     $$0,
                     ecz.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eeg.a(ega.a((float)$$1.intValue())).a(efg.a($$0).a(cz.a.a().a(cxv.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ecp.a p(csk $$0) {
      return ecp.b().a(eco.a().a(ega.a(1.0F)).a(ecz.a($$0)));
   }

   public static ecp.a a() {
      return ecp.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aep, ecp.a> $$0) {
      this.b();
      Set<aep> $$1 = new HashSet<>();

      for (csk $$2 : jc.f) {
         if ($$2.a(this.e)) {
            aep $$3 = $$2.r();
            if ($$3 != ecd.a && $$1.add($$3)) {
               ecp.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jc.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(csk $$0, csk $$1) {
      ecp.a $$2 = c($$0, ecz.a($$0).a(eex.a(cnh.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ecp.a q(csk $$0) {
      return this.a($$0, cum.e, dfu.b);
   }

   protected void r(csk $$0) {
      this.a($$0, $$0x -> this.d((cpj)((cvj)$$0x).a()));
   }

   protected void c(csk $$0, csk $$1) {
      this.a($$0, c((cpj)$$1));
   }

   protected void c(csk $$0, cpj $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csk $$0) {
      this.c($$0, $$0);
   }

   protected void t(csk $$0) {
      this.c($$0, (cpj)$$0);
   }

   protected void a(csk $$0, Function<csk, ecp.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csk $$0, ecp.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
