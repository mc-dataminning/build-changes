import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mk implements mn {
   protected static final euu.a a = evc.a(ci.a.a().a(ck.b, cg.a(List.of(new bn(dag.v, cu.d.b(1))))));
   protected static final euu.a b = a.invert();
   protected static final euu.a c = evc.a(ci.a.a().a(cuk.ts));
   private static final euu.a i = c.or(a);
   protected static final euu.a d = evc.a(ci.a.a().a(cuk.AA));
   private static final euu.a j = i.invert();
   protected final Set<cuc> e;
   protected final cop f;
   protected final Map<aks<eru>, eru.a> g;
   protected static final float[] h = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] k = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mk(Set<cuc> $$0, cop $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mk(Set<cuc> $$0, cop $$1, Map<aks<eru>, eru.a> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected <T extends esx<T>> T a(dbz $$0, esx<T> $$1) {
      return !this.e.contains($$0.q()) ? $$1.b(esn.c()) : $$1.c();
   }

   protected <T extends eun<T>> T a(dbz $$0, eun<T> $$1) {
      return !this.e.contains($$0.q()) ? $$1.b(euq.c()) : $$1.d();
   }

   public eru.a a(dbz $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0))));
   }

   private static eru.a a(dfc $$0, euu.a $$1, esf.a<?> $$2) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a(esc.a($$0).a($$1).a($$2)));
   }

   protected static eru.a a(dfc $$0, esf.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eru.a b(dfc $$0, esf.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eru.a c(dfc $$0, esf.a<?> $$1) {
      return a($$0, i, $$1);
   }

   protected eru.a a(dfc $$0, dbz $$1) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a($$1)));
   }

   protected eru.a a(dbz $$0, evq $$1) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a((esf.a<?>)this.a($$0, esc.a($$0).a(etr.a($$1)))));
   }

   protected eru.a a(dfc $$0, dbz $$1, evq $$2) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a($$1).a(etr.a($$2))));
   }

   private static eru.a c(dbz $$0) {
      return eru.b().a(ert.a().a(a).a(evo.a(1.0F)).a(esc.a($$0)));
   }

   private eru.a d(dbz $$0) {
      return eru.b().a(this.a(dfe.gK, ert.a().a(evo.a(1.0F)).a(esc.a(dfe.gK)))).a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0))));
   }

   protected eru.a a(dfc $$0) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a((esf.a<?>)this.a((dbz)$$0, esc.a($$0).a(etr.a(evo.a(2.0F)).a(eut.a($$0).a(dn.a.a().a(dmt.b, duk.c)))))));
   }

   protected <T extends Comparable<T> & azg> eru.a a(dfc $$0, duf<T> $$1, T $$2) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(eut.a($$0).a(dn.a.a().a($$1, $$2))))));
   }

   protected eru.a b(dfc $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(ke.f)))));
   }

   protected eru.a c(dfc $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(ke.L)))));
   }

   protected eru.a d(dfc $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(ke.f).a(ke.Z).a(ke.ac).a(ke.ad)))));
   }

   protected eru.a e(dfc $$0) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a(cuk.pY).a(etr.a(evu.a(2.0F, 5.0F))).a(esm.a(dag.x))));
   }

   protected eru.a f(dfc $$0) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a(cuk.pQ).a(etr.a(evu.a(4.0F, 9.0F))).a(esm.a(dag.x))));
   }

   protected eru.a g(dfc $$0) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a(cuk.mW).a(etr.a(evu.a(4.0F, 5.0F))).a(esm.b(dag.x))));
   }

   protected eru.a h(dfc $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(ke.f).a(ke.W)))));
   }

   protected static eru.a i(dfc $$0) {
      return eru.b().a(ert.a().a(a).a(evo.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(ke.ab)).a(eso.a($$0).a(dev.c))));
   }

   protected static eru.a j(dfc $$0) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a(esc.a($$0).a(a).a(esp.a(esp.b.a).a(ke.ab)).a(eso.a($$0).a(dev.c)).a(esc.a($$0))));
   }

   protected static eru.a k(dfc $$0) {
      return eru.b().a(ert.a().a(esc.a(cuk.ye)).a(eut.a($$0).a(dn.a.a().a(dfy.r_, true))));
   }

   protected eru.a a(dfc $$0, cuc $$1) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a($$1).a(esm.a(dag.x))));
   }

   protected eru.a b(dfc $$0, dbz $$1) {
      return a($$0, (esf.a<?>)this.a((dbz)$$0, esc.a($$1).a(etr.a(evu.a(-6.0F, 2.0F))).a(esy.a(ero.b(0)))));
   }

   protected eru.a l(dfc $$0) {
      return b($$0, (esf.a<?>)this.a((dbz)$$0, esc.a(cuk.qO).a(eva.a(0.125F)).a(esm.a(dag.x, 2))));
   }

   public eru.a b(dfc $$0, cuc $$1) {
      return eru.b()
         .a(
            this.a(
               $$0,
               ert.a()
                  .a(evo.a(1.0F))
                  .a(esc.a($$1).a(dnm.c.a(), $$1x -> etr.a(evn.a(3, (float)($$1x + 1) / 15.0F)).a(eut.a($$0).a(dn.a.a().a(dnm.c, $$1x.intValue())))))
            )
         );
   }

   public eru.a c(dfc $$0, cuc $$1) {
      return eru.b().a(this.a($$0, ert.a().a(evo.a(1.0F)).a(esc.a($$1).a(etr.a(evn.a(3, 0.53333336F))))));
   }

   protected static eru.a b(dbz $$0) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a(c).a(esc.a($$0)));
   }

   protected eru.a a(dfc $$0, euu.a $$1) {
      return eru.b()
         .a(
            ert.a()
               .a(
                  (esf.a<?>)this.a(
                     (dbz)$$0,
                     esc.a($$0)
                        .a($$1)
                        .a(iw.values(), $$1x -> etr.a(evo.a(1.0F), true).a(eut.a($$0).a(dn.a.a().a(dkh.b($$1x), true))))
                        .a(etr.a(evo.a(-1.0F), true))
                  )
               )
         );
   }

   protected eru.a a(dfc $$0, dfc $$1, float... $$2) {
      return c($$0, ((esh.a)this.a((dbz)$$0, esc.a($$1))).a(euk.a(dag.x, $$2)))
         .a(ert.a().a(evo.a(1.0F)).a(j).a(((esh.a)this.a((dbz)$$0, esc.a(cuk.qI).a(etr.a(evu.a(1.0F, 2.0F))))).a(euk.a(dag.x, k))));
   }

   protected eru.a b(dfc $$0, dfc $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ert.a().a(evo.a(1.0F)).a(j).a(((esh.a)this.a((dbz)$$0, esc.a(cuk.pJ))).a(euk.a(dag.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eru.a m(dfc $$0) {
      return c($$0, ((esh.a)this.a((dbz)dfe.bt, esc.a(cuk.qI).a(etr.a(evu.a(1.0F, 2.0F))))).a(euk.a(dag.x, k)));
   }

   protected eru.a a(dfc $$0, cuc $$1, cuc $$2, euu.a $$3) {
      return this.a((dbz)$$0, eru.b().a(ert.a().a(esc.a($$1).a($$3).a(esc.a($$2)))).a(ert.a().a($$3).a(esc.a($$2).a(esm.a(dag.x, 0.5714286F, 3)))));
   }

   protected static eru.a n(dfc $$0) {
      return eru.b().a(ert.a().a(c).a(esc.a($$0).a(etr.a(evo.a(2.0F)))));
   }

   protected eru.a a(dfc $$0, dfc $$1) {
      esf.a<?> $$2 = esc.a($$1).a(etr.a(evo.a(2.0F))).a(c).a(((esh.a)this.a((dbz)$$0, esc.a(cuk.qO))).a(eva.a(0.125F)));
      return eru.b()
         .a(ert.a().a($$2).a(eut.a($$0).a(dn.a.a().a(dhl.b, dty.b))).a(eus.a(cs.a.a().a(aw.a.a().a($$0).a(dn.a.a().a(dhl.b, dty.a))), new ir(0, 1, 0))))
         .a(ert.a().a($$2).a(eut.a($$0).a(dn.a.a().a(dhl.b, dty.a))).a(eus.a(cs.a.a().a(aw.a.a().a($$0).a(dn.a.a().a(dhl.b, dty.b))), new ir(0, -1, 0))));
   }

   protected eru.a o(dfc $$0) {
      return eru.b()
         .a(
            ert.a()
               .a(evo.a(1.0F))
               .a(
                  (esf.a<?>)this.a(
                     $$0, esc.a($$0).a(List.of(2, 3, 4), $$1 -> etr.a(evo.a((float)$$1.intValue())).a(eut.a($$0).a(dn.a.a().a(dfr.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eru.a p(dfc $$0) {
      return eru.b()
         .a(
            ert.a()
               .a(evo.a(1.0F))
               .a(
                  (esf.a<?>)this.a(
                     $$0,
                     esc.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> etr.a(evo.a((float)$$1.intValue())).a(eut.a($$0).a(dn.a.a().a(dkv.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eru.a q(dfc $$0) {
      return eru.b().a(ert.a().a(evo.a(1.0F)).a(esc.a($$0)));
   }

   public static eru.a a() {
      return eru.b();
   }

   protected abstract void b();

   @Override
   public void generate(jc.a $$0, BiConsumer<aks<eru>, eru.a> $$1) {
      this.b();
      Set<aks<eru>> $$2 = new HashSet<>();

      for (dfc $$3 : lh.e) {
         if ($$3.a(this.f)) {
            aks<eru> $$4 = $$3.v();
            if ($$4 != ern.a && $$2.add($$4)) {
               eru.a $$5 = this.g.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.a(), lh.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.g.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.g.keySet());
      }
   }

   protected void b(dfc $$0, dfc $$1) {
      eru.a $$2 = c($$0, esc.a($$0).a(euk.a(dag.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eru.a r(dfc $$0) {
      return this.a($$0, dhj.f, dty.b);
   }

   protected void s(dfc $$0) {
      this.a($$0, $$0x -> this.d((dbz)((dij)$$0x).b()));
   }

   protected void c(dfc $$0, dfc $$1) {
      this.a($$0, c((dbz)$$1));
   }

   protected void c(dfc $$0, dbz $$1) {
      this.a($$0, this.a($$1));
   }

   protected void t(dfc $$0) {
      this.c($$0, $$0);
   }

   protected void u(dfc $$0) {
      this.c($$0, (dbz)$$0);
   }

   protected void a(dfc $$0, Function<dfc, eru.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfc $$0, eru.a $$1) {
      this.g.put($$0.v(), $$1);
   }
}
