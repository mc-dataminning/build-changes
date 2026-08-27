import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class kc implements kf {
   protected static final efr.a a = efy.a(cb.a.a().a(new bl(cnu.v, cl.d.b(1))));
   protected static final efr.a b = a.invert();
   protected static final efr.a c = efy.a(cb.a.a().a(cjk.rg));
   private static final efr.a h = c.or(a);
   private static final efr.a i = h.invert();
   protected final Set<cjc> d;
   protected final cee e;
   protected final Map<aey, eda.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kc(Set<cjc> $$0, cee $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kc(Set<cjc> $$0, cee $$1, Map<aey, eda.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eec<T>> T a(cpw $$0, eec<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edt.c()) : $$1.c();
   }

   protected <T extends efk<T>> T a(cpw $$0, efk<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efn.c()) : $$1.d();
   }

   public eda.a a(cpw $$0) {
      return eda.b().a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$0))));
   }

   private static eda.a a(csx $$0, efr.a $$1, edl.a<?> $$2) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a(edi.a($$0).a($$1).a($$2)));
   }

   protected static eda.a a(csx $$0, edl.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eda.a b(csx $$0, edl.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eda.a c(csx $$0, edl.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eda.a a(csx $$0, cpw $$1) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a($$1)));
   }

   protected eda.a a(cpw $$0, egm $$1) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a((edl.a<?>)this.a($$0, edi.a($$0).a(eeq.a($$1)))));
   }

   protected eda.a a(csx $$0, cpw $$1, egm $$2) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a($$1).a(eeq.a($$2))));
   }

   private static eda.a c(cpw $$0) {
      return eda.b().a(ecz.a().a(a).a(egk.a(1.0F)).a(edi.a($$0)));
   }

   private eda.a d(cpw $$0) {
      return eda.b().a(this.a(csy.fR, ecz.a().a(egk.a(1.0F)).a(edi.a(csy.fR)))).a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$0))));
   }

   protected eda.a a(csx $$0) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a((edl.a<?>)this.a((cpw)$$0, edi.a($$0).a(eeq.a(egk.a(2.0F)).a(efq.a($$0).a(da.a.a().a(daa.a, dgt.c)))))));
   }

   protected <T extends Comparable<T> & asr> eda.a a(csx $$0, dgo<T> $$1, T $$2) {
      return eda.b().a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$0).a(efq.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected eda.a b(csx $$0) {
      return eda.b().a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$0).a(edv.a(edv.a.d)))));
   }

   protected eda.a c(csx $$0) {
      return eda.b()
         .a(
            this.a(
               $$0,
               ecz.a()
                  .a(egk.a(1.0F))
                  .a(
                     edi.a($$0)
                        .a(edv.a(edv.a.d))
                        .a(
                           edw.a(egd.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eem.a(dcz.x).a(edf.a(czw.b)))
                  )
            )
         );
   }

   protected eda.a d(csx $$0) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a(cjk.nR).a(eeq.a(egp.a(2.0F, 5.0F))).a(eds.a(cnu.x))));
   }

   protected eda.a e(csx $$0) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a(cjk.nM).a(eeq.a(egp.a(4.0F, 9.0F))).a(eds.a(cnu.x))));
   }

   protected eda.a f(csx $$0) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a(cjk.ll).a(eeq.a(egp.a(4.0F, 5.0F))).a(eds.b(cnu.x))));
   }

   protected eda.a g(csx $$0) {
      return eda.b().a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$0).a(edv.a(edv.a.d)).a(edw.a(egd.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static eda.a h(csx $$0) {
      return eda.b().a(ecz.a().a(a).a(egk.a(1.0F)).a(edi.a($$0).a(edw.a(egd.a).a("Bees", "BlockEntityTag.Bees")).a(edu.a($$0).a(csr.b))));
   }

   protected static eda.a i(csx $$0) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a(edi.a($$0).a(a).a(edw.a(egd.a).a("Bees", "BlockEntityTag.Bees")).a(edu.a($$0).a(csr.b)).a(edi.a($$0))));
   }

   protected static eda.a j(csx $$0) {
      return eda.b().a(ecz.a().a(edi.a(cjk.vw)).a(efq.a($$0).a(da.a.a().a(cts.s_, true))));
   }

   protected eda.a a(csx $$0, cjc $$1) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a($$1).a(eds.a(cnu.x))));
   }

   protected eda.a b(csx $$0, cpw $$1) {
      return a($$0, (edl.a<?>)this.a((cpw)$$0, edi.a($$1).a(eeq.a(egp.a(-6.0F, 2.0F))).a(eed.a(ecr.b(0)))));
   }

   protected eda.a k(csx $$0) {
      return b($$0, (edl.a<?>)this.a((cpw)$$0, edi.a(cjk.oH).a(efw.a(0.125F)).a(eds.a(cnu.x, 2))));
   }

   public eda.a b(csx $$0, cjc $$1) {
      return eda.b()
         .a(
            this.a(
               $$0,
               ecz.a()
                  .a(egk.a(1.0F))
                  .a(edi.a($$1).a(dat.b.a(), $$1x -> eeq.a(egj.a(3, (float)($$1x + 1) / 15.0F)).a(efq.a($$0).a(da.a.a().a(dat.b, $$1x.intValue())))))
            )
         );
   }

   public eda.a c(csx $$0, cjc $$1) {
      return eda.b().a(this.a($$0, ecz.a().a(egk.a(1.0F)).a(edi.a($$1).a(eeq.a(egj.a(3, 0.53333336F))))));
   }

   protected static eda.a b(cpw $$0) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a(c).a(edi.a($$0)));
   }

   protected eda.a a(csx $$0, efr.a $$1) {
      return eda.b()
         .a(
            ecz.a()
               .a(
                  (edl.a<?>)this.a(
                     (cpw)$$0,
                     edi.a($$0)
                        .a($$1)
                        .a(hc.values(), $$1x -> eeq.a(egk.a(1.0F), true).a(efq.a($$0).a(da.a.a().a(cxv.b($$1x), true))))
                        .a(eeq.a(egk.a(-1.0F), true))
                  )
               )
         );
   }

   protected eda.a a(csx $$0, csx $$1, float... $$2) {
      return c($$0, ((edn.a)this.a((cpw)$$0, edi.a($$1))).a(efh.a(cnu.x, $$2)))
         .a(ecz.a().a(egk.a(1.0F)).a(i).a(((edn.a)this.a((cpw)$$0, edi.a(cjk.oB).a(eeq.a(egp.a(1.0F, 2.0F))))).a(efh.a(cnu.x, j))));
   }

   protected eda.a b(csx $$0, csx $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ecz.a().a(egk.a(1.0F)).a(i).a(((edn.a)this.a((cpw)$$0, edi.a(cjk.nF))).a(efh.a(cnu.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eda.a l(csx $$0) {
      return c($$0, ((edn.a)this.a((cpw)csy.aL, edi.a(cjk.oB).a(eeq.a(egp.a(1.0F, 2.0F))))).a(efh.a(cnu.x, j)));
   }

   protected eda.a a(csx $$0, cjc $$1, cjc $$2, efr.a $$3) {
      return this.a((cpw)$$0, eda.b().a(ecz.a().a(edi.a($$1).a($$3).a(edi.a($$2)))).a(ecz.a().a($$3).a(edi.a($$2).a(eds.a(cnu.x, 0.5714286F, 3)))));
   }

   protected static eda.a m(csx $$0) {
      return eda.b().a(ecz.a().a(c).a(edi.a($$0).a(eeq.a(egk.a(2.0F)))));
   }

   protected eda.a a(csx $$0, csx $$1) {
      edl.a<?> $$2 = edi.a($$1).a(eeq.a(egk.a(2.0F))).a(c).a(((edn.a)this.a((cpw)$$0, edi.a(cjk.oH))).a(efw.a(0.125F)));
      return eda.b()
         .a(ecz.a().a($$2).a(efq.a($$0).a(da.a.a().a(cvb.a, dgh.b))).a(efp.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cvb.a, dgh.a))), new gw(0, 1, 0))))
         .a(ecz.a().a($$2).a(efq.a($$0).a(da.a.a().a(cvb.a, dgh.a))).a(efp.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cvb.a, dgh.b))), new gw(0, -1, 0))));
   }

   protected eda.a n(csx $$0) {
      return eda.b()
         .a(
            ecz.a()
               .a(egk.a(1.0F))
               .a(
                  (edl.a<?>)this.a(
                     $$0, edi.a($$0).a(List.of(2, 3, 4), $$1 -> eeq.a(egk.a((float)$$1.intValue())).a(efq.a($$0).a(da.a.a().a(ctl.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected eda.a o(csx $$0) {
      return eda.b()
         .a(
            ecz.a()
               .a(egk.a(1.0F))
               .a(
                  (edl.a<?>)this.a(
                     $$0,
                     edi.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eeq.a(egk.a((float)$$1.intValue())).a(efq.a($$0).a(da.a.a().a(cyi.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eda.a p(csx $$0) {
      return eda.b().a(ecz.a().a(egk.a(1.0F)).a(edi.a($$0)));
   }

   public static eda.a a() {
      return eda.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aey, eda.a> $$0) {
      this.b();
      Set<aey> $$1 = new HashSet<>();

      for (csx $$2 : jd.f) {
         if ($$2.a(this.e)) {
            aey $$3 = $$2.r();
            if ($$3 != ecq.a && $$1.add($$3)) {
               eda.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jd.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(csx $$0, csx $$1) {
      eda.a $$2 = c($$0, edi.a($$0).a(efh.a(cnu.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eda.a q(csx $$0) {
      return this.a($$0, cuz.e, dgh.b);
   }

   protected void r(csx $$0) {
      this.a($$0, $$0x -> this.d((cpw)((cvw)$$0x).a()));
   }

   protected void c(csx $$0, csx $$1) {
      this.a($$0, c((cpw)$$1));
   }

   protected void c(csx $$0, cpw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csx $$0) {
      this.c($$0, $$0);
   }

   protected void t(csx $$0) {
      this.c($$0, (cpw)$$0);
   }

   protected void a(csx $$0, Function<csx, eda.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csx $$0, eda.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
