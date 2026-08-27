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
   protected static final efg.a a = efn.a(bz.a.a().a(new bj(cnj.v, cj.d.b(1))));
   protected static final efg.a b = a.invert();
   protected static final efg.a c = efn.a(bz.a.a().a(cjb.rg));
   private static final efg.a h = c.or(a);
   private static final efg.a i = h.invert();
   protected final Set<cit> d;
   protected final cdv e;
   protected final Map<aer, ecp.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ka(Set<cit> $$0, cdv $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected ka(Set<cit> $$0, cdv $$1, Map<aer, ecp.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends edr<T>> T a(cpl $$0, edr<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edi.c()) : $$1.c();
   }

   protected <T extends eez<T>> T a(cpl $$0, eez<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efc.c()) : $$1.d();
   }

   public ecp.a a(cpl $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$0))));
   }

   private static ecp.a a(csm $$0, efg.a $$1, eda.a<?> $$2) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a(ecx.a($$0).a($$1).a($$2)));
   }

   protected static ecp.a a(csm $$0, eda.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ecp.a b(csm $$0, eda.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ecp.a c(csm $$0, eda.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ecp.a a(csm $$0, cpl $$1) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a($$1)));
   }

   protected ecp.a a(cpl $$0, egb $$1) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a((eda.a<?>)this.a($$0, ecx.a($$0).a(eef.a($$1)))));
   }

   protected ecp.a a(csm $$0, cpl $$1, egb $$2) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a($$1).a(eef.a($$2))));
   }

   private static ecp.a c(cpl $$0) {
      return ecp.b().a(eco.a().a(a).a(efz.a(1.0F)).a(ecx.a($$0)));
   }

   private ecp.a d(cpl $$0) {
      return ecp.b().a(this.a(csn.fR, eco.a().a(efz.a(1.0F)).a(ecx.a(csn.fR)))).a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$0))));
   }

   protected ecp.a a(csm $$0) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a((eda.a<?>)this.a((cpl)$$0, ecx.a($$0).a(eef.a(efz.a(2.0F)).a(eff.a($$0).a(cy.a.a().a(czp.a, dgi.c)))))));
   }

   protected <T extends Comparable<T> & ash> ecp.a a(csm $$0, dgd<T> $$1, T $$2) {
      return ecp.b().a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$0).a(eff.a($$0).a(cy.a.a().a($$1, $$2))))));
   }

   protected ecp.a b(csm $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$0).a(edk.a(edk.a.d)))));
   }

   protected ecp.a c(csm $$0) {
      return ecp.b()
         .a(
            this.a(
               $$0,
               eco.a()
                  .a(efz.a(1.0F))
                  .a(
                     ecx.a($$0)
                        .a(edk.a(edk.a.d))
                        .a(
                           edl.a(efs.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eeb.a(dco.x).a(ecu.a(czl.b)))
                  )
            )
         );
   }

   protected ecp.a d(csm $$0) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a(cjb.nR).a(eef.a(ege.a(2.0F, 5.0F))).a(edh.a(cnj.x))));
   }

   protected ecp.a e(csm $$0) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a(cjb.nM).a(eef.a(ege.a(4.0F, 9.0F))).a(edh.a(cnj.x))));
   }

   protected ecp.a f(csm $$0) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a(cjb.ll).a(eef.a(ege.a(4.0F, 5.0F))).a(edh.b(cnj.x))));
   }

   protected ecp.a g(csm $$0) {
      return ecp.b().a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$0).a(edk.a(edk.a.d)).a(edl.a(efs.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ecp.a h(csm $$0) {
      return ecp.b().a(eco.a().a(a).a(efz.a(1.0F)).a(ecx.a($$0).a(edl.a(efs.a).a("Bees", "BlockEntityTag.Bees")).a(edj.a($$0).a(csg.b))));
   }

   protected static ecp.a i(csm $$0) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a(ecx.a($$0).a(a).a(edl.a(efs.a).a("Bees", "BlockEntityTag.Bees")).a(edj.a($$0).a(csg.b)).a(ecx.a($$0))));
   }

   protected static ecp.a j(csm $$0) {
      return ecp.b().a(eco.a().a(ecx.a(cjb.vw)).a(eff.a($$0).a(cy.a.a().a(cth.s_, true))));
   }

   protected ecp.a a(csm $$0, cit $$1) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a($$1).a(edh.a(cnj.x))));
   }

   protected ecp.a b(csm $$0, cpl $$1) {
      return a($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a($$1).a(eef.a(ege.a(-6.0F, 2.0F))).a(eds.a(ecg.b(0)))));
   }

   protected ecp.a k(csm $$0) {
      return b($$0, (eda.a<?>)this.a((cpl)$$0, ecx.a(cjb.oH).a(efl.a(0.125F)).a(edh.a(cnj.x, 2))));
   }

   public ecp.a b(csm $$0, cit $$1) {
      return ecp.b()
         .a(
            this.a(
               $$0,
               eco.a()
                  .a(efz.a(1.0F))
                  .a(ecx.a($$1).a(dai.b.a(), $$1x -> eef.a(efy.a(3, (float)($$1x + 1) / 15.0F)).a(eff.a($$0).a(cy.a.a().a(dai.b, $$1x.intValue())))))
            )
         );
   }

   public ecp.a c(csm $$0, cit $$1) {
      return ecp.b().a(this.a($$0, eco.a().a(efz.a(1.0F)).a(ecx.a($$1).a(eef.a(efy.a(3, 0.53333336F))))));
   }

   protected static ecp.a b(cpl $$0) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a(c).a(ecx.a($$0)));
   }

   protected ecp.a a(csm $$0, efg.a $$1) {
      return ecp.b()
         .a(
            eco.a()
               .a(
                  (eda.a<?>)this.a(
                     (cpl)$$0,
                     ecx.a($$0)
                        .a($$1)
                        .a(ha.values(), $$1x -> eef.a(efz.a(1.0F), true).a(eff.a($$0).a(cy.a.a().a(cxk.b($$1x), true))))
                        .a(eef.a(efz.a(-1.0F), true))
                  )
               )
         );
   }

   protected ecp.a a(csm $$0, csm $$1, float... $$2) {
      return c($$0, ((edc.a)this.a((cpl)$$0, ecx.a($$1))).a(eew.a(cnj.x, $$2)))
         .a(eco.a().a(efz.a(1.0F)).a(i).a(((edc.a)this.a((cpl)$$0, ecx.a(cjb.oB).a(eef.a(ege.a(1.0F, 2.0F))))).a(eew.a(cnj.x, j))));
   }

   protected ecp.a b(csm $$0, csm $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eco.a().a(efz.a(1.0F)).a(i).a(((edc.a)this.a((cpl)$$0, ecx.a(cjb.nF))).a(eew.a(cnj.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ecp.a l(csm $$0) {
      return c($$0, ((edc.a)this.a((cpl)csn.aL, ecx.a(cjb.oB).a(eef.a(ege.a(1.0F, 2.0F))))).a(eew.a(cnj.x, j)));
   }

   protected ecp.a a(csm $$0, cit $$1, cit $$2, efg.a $$3) {
      return this.a((cpl)$$0, ecp.b().a(eco.a().a(ecx.a($$1).a($$3).a(ecx.a($$2)))).a(eco.a().a($$3).a(ecx.a($$2).a(edh.a(cnj.x, 0.5714286F, 3)))));
   }

   protected static ecp.a m(csm $$0) {
      return ecp.b().a(eco.a().a(c).a(ecx.a($$0).a(eef.a(efz.a(2.0F)))));
   }

   protected ecp.a a(csm $$0, csm $$1) {
      eda.a<?> $$2 = ecx.a($$1).a(eef.a(efz.a(2.0F))).a(c).a(((edc.a)this.a((cpl)$$0, ecx.a(cjb.oH))).a(efl.a(0.125F)));
      return ecp.b()
         .a(eco.a().a($$2).a(eff.a($$0).a(cy.a.a().a(cuq.a, dfw.b))).a(efe.a(ch.a.a().a(at.a.a().a($$0).a(cy.a.a().a(cuq.a, dfw.a))), new gu(0, 1, 0))))
         .a(eco.a().a($$2).a(eff.a($$0).a(cy.a.a().a(cuq.a, dfw.a))).a(efe.a(ch.a.a().a(at.a.a().a($$0).a(cy.a.a().a(cuq.a, dfw.b))), new gu(0, -1, 0))));
   }

   protected ecp.a n(csm $$0) {
      return ecp.b()
         .a(
            eco.a()
               .a(efz.a(1.0F))
               .a(
                  (eda.a<?>)this.a(
                     $$0, ecx.a($$0).a(List.of(2, 3, 4), $$1 -> eef.a(efz.a((float)$$1.intValue())).a(eff.a($$0).a(cy.a.a().a(cta.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected ecp.a o(csm $$0) {
      return ecp.b()
         .a(
            eco.a()
               .a(efz.a(1.0F))
               .a(
                  (eda.a<?>)this.a(
                     $$0,
                     ecx.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eef.a(efz.a((float)$$1.intValue())).a(eff.a($$0).a(cy.a.a().a(cxx.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ecp.a p(csm $$0) {
      return ecp.b().a(eco.a().a(efz.a(1.0F)).a(ecx.a($$0)));
   }

   public static ecp.a a() {
      return ecp.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aer, ecp.a> $$0) {
      this.b();
      Set<aer> $$1 = new HashSet<>();

      for (csm $$2 : jb.f) {
         if ($$2.a(this.e)) {
            aer $$3 = $$2.r();
            if ($$3 != ecf.a && $$1.add($$3)) {
               ecp.a $$4 = this.f.remove($$3);
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

   protected void b(csm $$0, csm $$1) {
      ecp.a $$2 = c($$0, ecx.a($$0).a(eew.a(cnj.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ecp.a q(csm $$0) {
      return this.a($$0, cuo.e, dfw.b);
   }

   protected void r(csm $$0) {
      this.a($$0, $$0x -> this.d((cpl)((cvl)$$0x).a()));
   }

   protected void c(csm $$0, csm $$1) {
      this.a($$0, c((cpl)$$1));
   }

   protected void c(csm $$0, cpl $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csm $$0) {
      this.c($$0, $$0);
   }

   protected void t(csm $$0) {
      this.c($$0, (cpl)$$0);
   }

   protected void a(csm $$0, Function<csm, ecp.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csm $$0, ecp.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
