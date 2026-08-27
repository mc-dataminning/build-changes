import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class ka implements kd {
   protected static final efj.a a = efq.a(cb.a.a().a(new bl(cny.v, cl.d.b(1))));
   protected static final efj.a b = a.invert();
   protected static final efj.a c = efq.a(cb.a.a().a(cjo.rg));
   private static final efj.a h = c.or(a);
   private static final efj.a i = h.invert();
   protected final Set<cjg> d;
   protected final cei e;
   protected final Map<aez, ecs.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ka(Set<cjg> $$0, cei $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected ka(Set<cjg> $$0, cei $$1, Map<aez, ecs.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends edu<T>> T a(cqa $$0, edu<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edl.c()) : $$1.c();
   }

   protected <T extends efc<T>> T a(cqa $$0, efc<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(eff.c()) : $$1.d();
   }

   public ecs.a a(cqa $$0) {
      return ecs.b().a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$0))));
   }

   private static ecs.a a(ctc $$0, efj.a $$1, edd.a<?> $$2) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a(eda.a($$0).a($$1).a($$2)));
   }

   protected static ecs.a a(ctc $$0, edd.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ecs.a b(ctc $$0, edd.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ecs.a c(ctc $$0, edd.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ecs.a a(ctc $$0, cqa $$1) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a($$1)));
   }

   protected ecs.a a(cqa $$0, ege $$1) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a((edd.a<?>)this.a($$0, eda.a($$0).a(eei.a($$1)))));
   }

   protected ecs.a a(ctc $$0, cqa $$1, ege $$2) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a($$1).a(eei.a($$2))));
   }

   private static ecs.a c(cqa $$0) {
      return ecs.b().a(ecr.a().a(a).a(egc.a(1.0F)).a(eda.a($$0)));
   }

   private ecs.a d(cqa $$0) {
      return ecs.b().a(this.a(cte.fR, ecr.a().a(egc.a(1.0F)).a(eda.a(cte.fR)))).a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$0))));
   }

   protected ecs.a a(ctc $$0) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a((edd.a<?>)this.a((cqa)$$0, eda.a($$0).a(eei.a(egc.a(2.0F)).a(efi.a($$0).a(da.a.a().a(dad.b, dgl.c)))))));
   }

   protected <T extends Comparable<T> & asu> ecs.a a(ctc $$0, dgg<T> $$1, T $$2) {
      return ecs.b().a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$0).a(efi.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected ecs.a b(ctc $$0) {
      return ecs.b().a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$0).a(edn.a(edn.a.d)))));
   }

   protected ecs.a c(ctc $$0) {
      return ecs.b()
         .a(
            this.a(
               $$0,
               ecr.a()
                  .a(egc.a(1.0F))
                  .a(
                     eda.a($$0)
                        .a(edn.a(edn.a.d))
                        .a(
                           edo.a(efv.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eee.a(ddb.x).a(ecx.a(czz.c)))
                  )
            )
         );
   }

   protected ecs.a d(ctc $$0) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a(cjo.nR).a(eei.a(egh.a(2.0F, 5.0F))).a(edk.a(cny.x))));
   }

   protected ecs.a e(ctc $$0) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a(cjo.nM).a(eei.a(egh.a(4.0F, 9.0F))).a(edk.a(cny.x))));
   }

   protected ecs.a f(ctc $$0) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a(cjo.ll).a(eei.a(egh.a(4.0F, 5.0F))).a(edk.b(cny.x))));
   }

   protected ecs.a g(ctc $$0) {
      return ecs.b().a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$0).a(edn.a(edn.a.d)).a(edo.a(efv.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ecs.a h(ctc $$0) {
      return ecs.b().a(ecr.a().a(a).a(egc.a(1.0F)).a(eda.a($$0).a(edo.a(efv.a).a("Bees", "BlockEntityTag.Bees")).a(edm.a($$0).a(csw.c))));
   }

   protected static ecs.a i(ctc $$0) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a(eda.a($$0).a(a).a(edo.a(efv.a).a("Bees", "BlockEntityTag.Bees")).a(edm.a($$0).a(csw.c)).a(eda.a($$0))));
   }

   protected static ecs.a j(ctc $$0) {
      return ecs.b().a(ecr.a().a(eda.a(cjo.vw)).a(efi.a($$0).a(da.a.a().a(cty.s_, true))));
   }

   protected ecs.a a(ctc $$0, cjg $$1) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a($$1).a(edk.a(cny.x))));
   }

   protected ecs.a b(ctc $$0, cqa $$1) {
      return a($$0, (edd.a<?>)this.a((cqa)$$0, eda.a($$1).a(eei.a(egh.a(-6.0F, 2.0F))).a(edv.a(ecj.b(0)))));
   }

   protected ecs.a k(ctc $$0) {
      return b($$0, (edd.a<?>)this.a((cqa)$$0, eda.a(cjo.oH).a(efo.a(0.125F)).a(edk.a(cny.x, 2))));
   }

   public ecs.a b(ctc $$0, cjg $$1) {
      return ecs.b()
         .a(
            this.a(
               $$0,
               ecr.a()
                  .a(egc.a(1.0F))
                  .a(eda.a($$1).a(daw.c.a(), $$1x -> eei.a(egb.a(3, (float)($$1x + 1) / 15.0F)).a(efi.a($$0).a(da.a.a().a(daw.c, $$1x.intValue())))))
            )
         );
   }

   public ecs.a c(ctc $$0, cjg $$1) {
      return ecs.b().a(this.a($$0, ecr.a().a(egc.a(1.0F)).a(eda.a($$1).a(eei.a(egb.a(3, 0.53333336F))))));
   }

   protected static ecs.a b(cqa $$0) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a(c).a(eda.a($$0)));
   }

   protected ecs.a a(ctc $$0, efj.a $$1) {
      return ecs.b()
         .a(
            ecr.a()
               .a(
                  (edd.a<?>)this.a(
                     (cqa)$$0,
                     eda.a($$0)
                        .a($$1)
                        .a(ha.values(), $$1x -> eei.a(egc.a(1.0F), true).a(efi.a($$0).a(da.a.a().a(cya.b($$1x), true))))
                        .a(eei.a(egc.a(-1.0F), true))
                  )
               )
         );
   }

   protected ecs.a a(ctc $$0, ctc $$1, float... $$2) {
      return c($$0, ((edf.a)this.a((cqa)$$0, eda.a($$1))).a(eez.a(cny.x, $$2)))
         .a(ecr.a().a(egc.a(1.0F)).a(i).a(((edf.a)this.a((cqa)$$0, eda.a(cjo.oB).a(eei.a(egh.a(1.0F, 2.0F))))).a(eez.a(cny.x, j))));
   }

   protected ecs.a b(ctc $$0, ctc $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ecr.a().a(egc.a(1.0F)).a(i).a(((edf.a)this.a((cqa)$$0, eda.a(cjo.nF))).a(eez.a(cny.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ecs.a l(ctc $$0) {
      return c($$0, ((edf.a)this.a((cqa)cte.aL, eda.a(cjo.oB).a(eei.a(egh.a(1.0F, 2.0F))))).a(eez.a(cny.x, j)));
   }

   protected ecs.a a(ctc $$0, cjg $$1, cjg $$2, efj.a $$3) {
      return this.a((cqa)$$0, ecs.b().a(ecr.a().a(eda.a($$1).a($$3).a(eda.a($$2)))).a(ecr.a().a($$3).a(eda.a($$2).a(edk.a(cny.x, 0.5714286F, 3)))));
   }

   protected static ecs.a m(ctc $$0) {
      return ecs.b().a(ecr.a().a(c).a(eda.a($$0).a(eei.a(egc.a(2.0F)))));
   }

   protected ecs.a a(ctc $$0, ctc $$1) {
      edd.a<?> $$2 = eda.a($$1).a(eei.a(egc.a(2.0F))).a(c).a(((edf.a)this.a((cqa)$$0, eda.a(cjo.oH))).a(efo.a(0.125F)));
      return ecs.b()
         .a(ecr.a().a($$2).a(efi.a($$0).a(da.a.a().a(cvi.b, dfz.b))).a(efh.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cvi.b, dfz.a))), new gw(0, 1, 0))))
         .a(ecr.a().a($$2).a(efi.a($$0).a(da.a.a().a(cvi.b, dfz.a))).a(efh.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cvi.b, dfz.b))), new gw(0, -1, 0))));
   }

   protected ecs.a n(ctc $$0) {
      return ecs.b()
         .a(
            ecr.a()
               .a(egc.a(1.0F))
               .a(
                  (edd.a<?>)this.a(
                     $$0, eda.a($$0).a(List.of(2, 3, 4), $$1 -> eei.a(egc.a((float)$$1.intValue())).a(efi.a($$0).a(da.a.a().a(ctr.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ecs.a o(ctc $$0) {
      return ecs.b()
         .a(
            ecr.a()
               .a(egc.a(1.0F))
               .a(
                  (edd.a<?>)this.a(
                     $$0,
                     eda.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eei.a(egc.a((float)$$1.intValue())).a(efi.a($$0).a(da.a.a().a(cyn.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ecs.a p(ctc $$0) {
      return ecs.b().a(ecr.a().a(egc.a(1.0F)).a(eda.a($$0)));
   }

   public static ecs.a a() {
      return ecs.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aez, ecs.a> $$0) {
      this.b();
      Set<aez> $$1 = new HashSet<>();

      for (ctc $$2 : jb.f) {
         if ($$2.a(this.e)) {
            aez $$3 = $$2.u();
            if ($$3 != eci.a && $$1.add($$3)) {
               ecs.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jb.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(ctc $$0, ctc $$1) {
      ecs.a $$2 = c($$0, eda.a($$0).a(eez.a(cny.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ecs.a q(ctc $$0) {
      return this.a($$0, cvg.f, dfz.b);
   }

   protected void r(ctc $$0) {
      this.a($$0, $$0x -> this.d((cqa)((cwd)$$0x).b()));
   }

   protected void c(ctc $$0, ctc $$1) {
      this.a($$0, c((cqa)$$1));
   }

   protected void c(ctc $$0, cqa $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(ctc $$0) {
      this.c($$0, $$0);
   }

   protected void t(ctc $$0) {
      this.c($$0, (cqa)$$0);
   }

   protected void a(ctc $$0, Function<ctc, ecs.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(ctc $$0, ecs.a $$1) {
      this.f.put($$0.u(), $$1);
   }
}
