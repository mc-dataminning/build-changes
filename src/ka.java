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
   protected static final eff.a a = efm.a(bz.a.a().a(new bj(cni.v, cj.d.b(1))));
   protected static final eff.a b = a.invert();
   protected static final eff.a c = efm.a(bz.a.a().a(cja.rg));
   private static final eff.a h = c.or(a);
   private static final eff.a i = h.invert();
   protected final Set<cis> d;
   protected final cdu e;
   protected final Map<aer, eco.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ka(Set<cis> $$0, cdu $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected ka(Set<cis> $$0, cdu $$1, Map<aer, eco.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends edq<T>> T a(cpk $$0, edq<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edh.c()) : $$1.c();
   }

   protected <T extends eey<T>> T a(cpk $$0, eey<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efb.c()) : $$1.d();
   }

   public eco.a a(cpk $$0) {
      return eco.b().a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$0))));
   }

   private static eco.a a(csl $$0, eff.a $$1, ecz.a<?> $$2) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a(ecw.a($$0).a($$1).a($$2)));
   }

   protected static eco.a a(csl $$0, ecz.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eco.a b(csl $$0, ecz.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eco.a c(csl $$0, ecz.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eco.a a(csl $$0, cpk $$1) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a($$1)));
   }

   protected eco.a a(cpk $$0, ega $$1) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a((ecz.a<?>)this.a($$0, ecw.a($$0).a(eee.a($$1)))));
   }

   protected eco.a a(csl $$0, cpk $$1, ega $$2) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a($$1).a(eee.a($$2))));
   }

   private static eco.a c(cpk $$0) {
      return eco.b().a(ecn.a().a(a).a(efy.a(1.0F)).a(ecw.a($$0)));
   }

   private eco.a d(cpk $$0) {
      return eco.b().a(this.a(csm.fR, ecn.a().a(efy.a(1.0F)).a(ecw.a(csm.fR)))).a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$0))));
   }

   protected eco.a a(csl $$0) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a((ecz.a<?>)this.a((cpk)$$0, ecw.a($$0).a(eee.a(efy.a(2.0F)).a(efe.a($$0).a(cy.a.a().a(czo.a, dgh.c)))))));
   }

   protected <T extends Comparable<T> & ash> eco.a a(csl $$0, dgc<T> $$1, T $$2) {
      return eco.b().a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$0).a(efe.a($$0).a(cy.a.a().a($$1, $$2))))));
   }

   protected eco.a b(csl $$0) {
      return eco.b().a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$0).a(edj.a(edj.a.d)))));
   }

   protected eco.a c(csl $$0) {
      return eco.b()
         .a(
            this.a(
               $$0,
               ecn.a()
                  .a(efy.a(1.0F))
                  .a(
                     ecw.a($$0)
                        .a(edj.a(edj.a.d))
                        .a(
                           edk.a(efr.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eea.a(dcn.x).a(ect.a(czk.b)))
                  )
            )
         );
   }

   protected eco.a d(csl $$0) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a(cja.nR).a(eee.a(egd.a(2.0F, 5.0F))).a(edg.a(cni.x))));
   }

   protected eco.a e(csl $$0) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a(cja.nM).a(eee.a(egd.a(4.0F, 9.0F))).a(edg.a(cni.x))));
   }

   protected eco.a f(csl $$0) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a(cja.ll).a(eee.a(egd.a(4.0F, 5.0F))).a(edg.b(cni.x))));
   }

   protected eco.a g(csl $$0) {
      return eco.b().a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$0).a(edj.a(edj.a.d)).a(edk.a(efr.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static eco.a h(csl $$0) {
      return eco.b().a(ecn.a().a(a).a(efy.a(1.0F)).a(ecw.a($$0).a(edk.a(efr.a).a("Bees", "BlockEntityTag.Bees")).a(edi.a($$0).a(csf.b))));
   }

   protected static eco.a i(csl $$0) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a(ecw.a($$0).a(a).a(edk.a(efr.a).a("Bees", "BlockEntityTag.Bees")).a(edi.a($$0).a(csf.b)).a(ecw.a($$0))));
   }

   protected static eco.a j(csl $$0) {
      return eco.b().a(ecn.a().a(ecw.a(cja.vw)).a(efe.a($$0).a(cy.a.a().a(ctg.s_, true))));
   }

   protected eco.a a(csl $$0, cis $$1) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a($$1).a(edg.a(cni.x))));
   }

   protected eco.a b(csl $$0, cpk $$1) {
      return a($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a($$1).a(eee.a(egd.a(-6.0F, 2.0F))).a(edr.a(ecf.b(0)))));
   }

   protected eco.a k(csl $$0) {
      return b($$0, (ecz.a<?>)this.a((cpk)$$0, ecw.a(cja.oH).a(efk.a(0.125F)).a(edg.a(cni.x, 2))));
   }

   public eco.a b(csl $$0, cis $$1) {
      return eco.b()
         .a(
            this.a(
               $$0,
               ecn.a()
                  .a(efy.a(1.0F))
                  .a(ecw.a($$1).a(dah.b.a(), $$1x -> eee.a(efx.a(3, (float)($$1x + 1) / 15.0F)).a(efe.a($$0).a(cy.a.a().a(dah.b, $$1x.intValue())))))
            )
         );
   }

   public eco.a c(csl $$0, cis $$1) {
      return eco.b().a(this.a($$0, ecn.a().a(efy.a(1.0F)).a(ecw.a($$1).a(eee.a(efx.a(3, 0.53333336F))))));
   }

   protected static eco.a b(cpk $$0) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a(c).a(ecw.a($$0)));
   }

   protected eco.a a(csl $$0, eff.a $$1) {
      return eco.b()
         .a(
            ecn.a()
               .a(
                  (ecz.a<?>)this.a(
                     (cpk)$$0,
                     ecw.a($$0)
                        .a($$1)
                        .a(ha.values(), $$1x -> eee.a(efy.a(1.0F), true).a(efe.a($$0).a(cy.a.a().a(cxj.b($$1x), true))))
                        .a(eee.a(efy.a(-1.0F), true))
                  )
               )
         );
   }

   protected eco.a a(csl $$0, csl $$1, float... $$2) {
      return c($$0, ((edb.a)this.a((cpk)$$0, ecw.a($$1))).a(eev.a(cni.x, $$2)))
         .a(ecn.a().a(efy.a(1.0F)).a(i).a(((edb.a)this.a((cpk)$$0, ecw.a(cja.oB).a(eee.a(egd.a(1.0F, 2.0F))))).a(eev.a(cni.x, j))));
   }

   protected eco.a b(csl $$0, csl $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ecn.a().a(efy.a(1.0F)).a(i).a(((edb.a)this.a((cpk)$$0, ecw.a(cja.nF))).a(eev.a(cni.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eco.a l(csl $$0) {
      return c($$0, ((edb.a)this.a((cpk)csm.aL, ecw.a(cja.oB).a(eee.a(egd.a(1.0F, 2.0F))))).a(eev.a(cni.x, j)));
   }

   protected eco.a a(csl $$0, cis $$1, cis $$2, eff.a $$3) {
      return this.a((cpk)$$0, eco.b().a(ecn.a().a(ecw.a($$1).a($$3).a(ecw.a($$2)))).a(ecn.a().a($$3).a(ecw.a($$2).a(edg.a(cni.x, 0.5714286F, 3)))));
   }

   protected static eco.a m(csl $$0) {
      return eco.b().a(ecn.a().a(c).a(ecw.a($$0).a(eee.a(efy.a(2.0F)))));
   }

   protected eco.a a(csl $$0, csl $$1) {
      ecz.a<?> $$2 = ecw.a($$1).a(eee.a(efy.a(2.0F))).a(c).a(((edb.a)this.a((cpk)$$0, ecw.a(cja.oH))).a(efk.a(0.125F)));
      return eco.b()
         .a(ecn.a().a($$2).a(efe.a($$0).a(cy.a.a().a(cup.a, dfv.b))).a(efd.a(ch.a.a().a(at.a.a().a($$0).a(cy.a.a().a(cup.a, dfv.a))), new gu(0, 1, 0))))
         .a(ecn.a().a($$2).a(efe.a($$0).a(cy.a.a().a(cup.a, dfv.a))).a(efd.a(ch.a.a().a(at.a.a().a($$0).a(cy.a.a().a(cup.a, dfv.b))), new gu(0, -1, 0))));
   }

   protected eco.a n(csl $$0) {
      return eco.b()
         .a(
            ecn.a()
               .a(efy.a(1.0F))
               .a(
                  (ecz.a<?>)this.a(
                     $$0, ecw.a($$0).a(List.of(2, 3, 4), $$1 -> eee.a(efy.a((float)$$1.intValue())).a(efe.a($$0).a(cy.a.a().a(csz.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected eco.a o(csl $$0) {
      return eco.b()
         .a(
            ecn.a()
               .a(efy.a(1.0F))
               .a(
                  (ecz.a<?>)this.a(
                     $$0,
                     ecw.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eee.a(efy.a((float)$$1.intValue())).a(efe.a($$0).a(cy.a.a().a(cxw.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eco.a p(csl $$0) {
      return eco.b().a(ecn.a().a(efy.a(1.0F)).a(ecw.a($$0)));
   }

   public static eco.a a() {
      return eco.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aer, eco.a> $$0) {
      this.b();
      Set<aer> $$1 = new HashSet<>();

      for (csl $$2 : jb.f) {
         if ($$2.a(this.e)) {
            aer $$3 = $$2.r();
            if ($$3 != ece.a && $$1.add($$3)) {
               eco.a $$4 = this.f.remove($$3);
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

   protected void b(csl $$0, csl $$1) {
      eco.a $$2 = c($$0, ecw.a($$0).a(eev.a(cni.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eco.a q(csl $$0) {
      return this.a($$0, cun.e, dfv.b);
   }

   protected void r(csl $$0) {
      this.a($$0, $$0x -> this.d((cpk)((cvk)$$0x).a()));
   }

   protected void c(csl $$0, csl $$1) {
      this.a($$0, c((cpk)$$1));
   }

   protected void c(csl $$0, cpk $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csl $$0) {
      this.c($$0, $$0);
   }

   protected void t(csl $$0) {
      this.c($$0, (cpk)$$0);
   }

   protected void a(csl $$0, Function<csl, eco.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csl $$0, eco.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
