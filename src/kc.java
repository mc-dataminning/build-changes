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
   protected static final efk.a a = efr.a(cb.a.a().a(new bl(cnn.v, cl.d.b(1))));
   protected static final efk.a b = a.invert();
   protected static final efk.a c = efr.a(cb.a.a().a(cjd.rg));
   private static final efk.a h = c.or(a);
   private static final efk.a i = h.invert();
   protected final Set<civ> d;
   protected final cdx e;
   protected final Map<aeu, ect.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kc(Set<civ> $$0, cdx $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kc(Set<civ> $$0, cdx $$1, Map<aeu, ect.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends edv<T>> T a(cpp $$0, edv<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edm.c()) : $$1.c();
   }

   protected <T extends efd<T>> T a(cpp $$0, efd<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efg.c()) : $$1.d();
   }

   public ect.a a(cpp $$0) {
      return ect.b().a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$0))));
   }

   private static ect.a a(csq $$0, efk.a $$1, ede.a<?> $$2) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a(edb.a($$0).a($$1).a($$2)));
   }

   protected static ect.a a(csq $$0, ede.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ect.a b(csq $$0, ede.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ect.a c(csq $$0, ede.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ect.a a(csq $$0, cpp $$1) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a($$1)));
   }

   protected ect.a a(cpp $$0, egf $$1) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a((ede.a<?>)this.a($$0, edb.a($$0).a(eej.a($$1)))));
   }

   protected ect.a a(csq $$0, cpp $$1, egf $$2) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a($$1).a(eej.a($$2))));
   }

   private static ect.a c(cpp $$0) {
      return ect.b().a(ecs.a().a(a).a(egd.a(1.0F)).a(edb.a($$0)));
   }

   private ect.a d(cpp $$0) {
      return ect.b().a(this.a(csr.fR, ecs.a().a(egd.a(1.0F)).a(edb.a(csr.fR)))).a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$0))));
   }

   protected ect.a a(csq $$0) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a((ede.a<?>)this.a((cpp)$$0, edb.a($$0).a(eej.a(egd.a(2.0F)).a(efj.a($$0).a(da.a.a().a(czt.a, dgm.c)))))));
   }

   protected <T extends Comparable<T> & ask> ect.a a(csq $$0, dgh<T> $$1, T $$2) {
      return ect.b().a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$0).a(efj.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected ect.a b(csq $$0) {
      return ect.b().a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$0).a(edo.a(edo.a.d)))));
   }

   protected ect.a c(csq $$0) {
      return ect.b()
         .a(
            this.a(
               $$0,
               ecs.a()
                  .a(egd.a(1.0F))
                  .a(
                     edb.a($$0)
                        .a(edo.a(edo.a.d))
                        .a(
                           edp.a(efw.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eef.a(dcs.x).a(ecy.a(czp.b)))
                  )
            )
         );
   }

   protected ect.a d(csq $$0) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a(cjd.nR).a(eej.a(egi.a(2.0F, 5.0F))).a(edl.a(cnn.x))));
   }

   protected ect.a e(csq $$0) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a(cjd.nM).a(eej.a(egi.a(4.0F, 9.0F))).a(edl.a(cnn.x))));
   }

   protected ect.a f(csq $$0) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a(cjd.ll).a(eej.a(egi.a(4.0F, 5.0F))).a(edl.b(cnn.x))));
   }

   protected ect.a g(csq $$0) {
      return ect.b().a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$0).a(edo.a(edo.a.d)).a(edp.a(efw.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ect.a h(csq $$0) {
      return ect.b().a(ecs.a().a(a).a(egd.a(1.0F)).a(edb.a($$0).a(edp.a(efw.a).a("Bees", "BlockEntityTag.Bees")).a(edn.a($$0).a(csk.b))));
   }

   protected static ect.a i(csq $$0) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a(edb.a($$0).a(a).a(edp.a(efw.a).a("Bees", "BlockEntityTag.Bees")).a(edn.a($$0).a(csk.b)).a(edb.a($$0))));
   }

   protected static ect.a j(csq $$0) {
      return ect.b().a(ecs.a().a(edb.a(cjd.vw)).a(efj.a($$0).a(da.a.a().a(ctl.s_, true))));
   }

   protected ect.a a(csq $$0, civ $$1) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a($$1).a(edl.a(cnn.x))));
   }

   protected ect.a b(csq $$0, cpp $$1) {
      return a($$0, (ede.a<?>)this.a((cpp)$$0, edb.a($$1).a(eej.a(egi.a(-6.0F, 2.0F))).a(edw.a(eck.b(0)))));
   }

   protected ect.a k(csq $$0) {
      return b($$0, (ede.a<?>)this.a((cpp)$$0, edb.a(cjd.oH).a(efp.a(0.125F)).a(edl.a(cnn.x, 2))));
   }

   public ect.a b(csq $$0, civ $$1) {
      return ect.b()
         .a(
            this.a(
               $$0,
               ecs.a()
                  .a(egd.a(1.0F))
                  .a(edb.a($$1).a(dam.b.a(), $$1x -> eej.a(egc.a(3, (float)($$1x + 1) / 15.0F)).a(efj.a($$0).a(da.a.a().a(dam.b, $$1x.intValue())))))
            )
         );
   }

   public ect.a c(csq $$0, civ $$1) {
      return ect.b().a(this.a($$0, ecs.a().a(egd.a(1.0F)).a(edb.a($$1).a(eej.a(egc.a(3, 0.53333336F))))));
   }

   protected static ect.a b(cpp $$0) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a(c).a(edb.a($$0)));
   }

   protected ect.a a(csq $$0, efk.a $$1) {
      return ect.b()
         .a(
            ecs.a()
               .a(
                  (ede.a<?>)this.a(
                     (cpp)$$0,
                     edb.a($$0)
                        .a($$1)
                        .a(hc.values(), $$1x -> eej.a(egd.a(1.0F), true).a(efj.a($$0).a(da.a.a().a(cxo.b($$1x), true))))
                        .a(eej.a(egd.a(-1.0F), true))
                  )
               )
         );
   }

   protected ect.a a(csq $$0, csq $$1, float... $$2) {
      return c($$0, ((edg.a)this.a((cpp)$$0, edb.a($$1))).a(efa.a(cnn.x, $$2)))
         .a(ecs.a().a(egd.a(1.0F)).a(i).a(((edg.a)this.a((cpp)$$0, edb.a(cjd.oB).a(eej.a(egi.a(1.0F, 2.0F))))).a(efa.a(cnn.x, j))));
   }

   protected ect.a b(csq $$0, csq $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ecs.a().a(egd.a(1.0F)).a(i).a(((edg.a)this.a((cpp)$$0, edb.a(cjd.nF))).a(efa.a(cnn.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ect.a l(csq $$0) {
      return c($$0, ((edg.a)this.a((cpp)csr.aL, edb.a(cjd.oB).a(eej.a(egi.a(1.0F, 2.0F))))).a(efa.a(cnn.x, j)));
   }

   protected ect.a a(csq $$0, civ $$1, civ $$2, efk.a $$3) {
      return this.a((cpp)$$0, ect.b().a(ecs.a().a(edb.a($$1).a($$3).a(edb.a($$2)))).a(ecs.a().a($$3).a(edb.a($$2).a(edl.a(cnn.x, 0.5714286F, 3)))));
   }

   protected static ect.a m(csq $$0) {
      return ect.b().a(ecs.a().a(c).a(edb.a($$0).a(eej.a(egd.a(2.0F)))));
   }

   protected ect.a a(csq $$0, csq $$1) {
      ede.a<?> $$2 = edb.a($$1).a(eej.a(egd.a(2.0F))).a(c).a(((edg.a)this.a((cpp)$$0, edb.a(cjd.oH))).a(efp.a(0.125F)));
      return ect.b()
         .a(ecs.a().a($$2).a(efj.a($$0).a(da.a.a().a(cuu.a, dga.b))).a(efi.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cuu.a, dga.a))), new gw(0, 1, 0))))
         .a(ecs.a().a($$2).a(efj.a($$0).a(da.a.a().a(cuu.a, dga.a))).a(efi.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cuu.a, dga.b))), new gw(0, -1, 0))));
   }

   protected ect.a n(csq $$0) {
      return ect.b()
         .a(
            ecs.a()
               .a(egd.a(1.0F))
               .a(
                  (ede.a<?>)this.a(
                     $$0, edb.a($$0).a(List.of(2, 3, 4), $$1 -> eej.a(egd.a((float)$$1.intValue())).a(efj.a($$0).a(da.a.a().a(cte.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected ect.a o(csq $$0) {
      return ect.b()
         .a(
            ecs.a()
               .a(egd.a(1.0F))
               .a(
                  (ede.a<?>)this.a(
                     $$0,
                     edb.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eej.a(egd.a((float)$$1.intValue())).a(efj.a($$0).a(da.a.a().a(cyb.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ect.a p(csq $$0) {
      return ect.b().a(ecs.a().a(egd.a(1.0F)).a(edb.a($$0)));
   }

   public static ect.a a() {
      return ect.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aeu, ect.a> $$0) {
      this.b();
      Set<aeu> $$1 = new HashSet<>();

      for (csq $$2 : jd.f) {
         if ($$2.a(this.e)) {
            aeu $$3 = $$2.r();
            if ($$3 != ecj.a && $$1.add($$3)) {
               ect.a $$4 = this.f.remove($$3);
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

   protected void b(csq $$0, csq $$1) {
      ect.a $$2 = c($$0, edb.a($$0).a(efa.a(cnn.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ect.a q(csq $$0) {
      return this.a($$0, cus.e, dga.b);
   }

   protected void r(csq $$0) {
      this.a($$0, $$0x -> this.d((cpp)((cvp)$$0x).a()));
   }

   protected void c(csq $$0, csq $$1) {
      this.a($$0, c((cpp)$$1));
   }

   protected void c(csq $$0, cpp $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csq $$0) {
      this.c($$0, $$0);
   }

   protected void t(csq $$0) {
      this.c($$0, (cpp)$$0);
   }

   protected void a(csq $$0, Function<csq, ect.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csq $$0, ect.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
