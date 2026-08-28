import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mq implements mt {
   protected static final etz.a a = eug.a(cp.a.a().a(cud.rV));
   protected final jl.a b;
   protected final Set<ctv> c;
   protected final cov d;
   protected final Map<akj<eqt>, eqt.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected etz.a a() {
      jl.b<czj> $$0 = this.b.b(lr.aK);
      return eug.a(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(czo.v), de.d.b(1))))));
   }

   protected etz.a b() {
      return this.a().invert();
   }

   private etz.a e() {
      return a.or(this.a());
   }

   private etz.a f() {
      return this.e().invert();
   }

   protected mq(Set<ctv> $$0, cov $$1, jl.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mq(Set<ctv> $$0, cov $$1, Map<akj<eqt>, eqt.a> $$2, jl.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends ery<T>> T a(dcc $$0, ery<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(erm.c()) : $$1.c();
   }

   protected <T extends etr<T>> T a(dcc $$0, etr<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(etv.c()) : $$1.d();
   }

   public eqt.a a(dcc $$0) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0))));
   }

   private static eqt.a a(dff $$0, etz.a $$1, ere.a<?> $$2) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a($$1).a($$2)));
   }

   protected eqt.a a(dff $$0, ere.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eqt.a b(dff $$0, ere.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected eqt.a c(dff $$0, ere.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected eqt.a a(dff $$0, dcc $$1) {
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a($$1)));
   }

   protected eqt.a a(dcc $$0, euv $$1) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a((ere.a<?>)this.a($$0, erb.a($$0).a(est.a($$1)))));
   }

   protected eqt.a a(dff $$0, dcc $$1, euv $$2) {
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a($$1).a(est.a($$2))));
   }

   private eqt.a c(dcc $$0) {
      return eqt.b().a(eqs.a().a(this.a()).a(eus.a(1.0F)).a(erb.a($$0)));
   }

   private eqt.a d(dcc $$0) {
      return eqt.b().a(this.a(dfh.fR, eqs.a().a(eus.a(1.0F)).a(erb.a(dfh.fR)))).a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0))));
   }

   protected eqt.a a(dff $$0) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a((ere.a<?>)this.a((dcc)$$0, erb.a($$0).a(est.a(eus.a(2.0F)).a(ety.a($$0).a(dy.a.a().a(dmi.b, dtp.c)))))));
   }

   protected <T extends Comparable<T> & ayz> eqt.a a(dff $$0, dtk<T> $$1, T $$2) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a(ety.a($$0).a(dy.a.a().a($$1, $$2))))));
   }

   protected eqt.a b(dff $$0) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a(ero.a(ero.b.a).a(kn.g)))));
   }

   protected eqt.a c(dff $$0) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a(ero.a(ero.b.a).a(kn.g).a(kn.aa).a(kn.ad).a(kn.ae)))));
   }

   protected eqt.a d(dff $$0) {
      jl.b<czj> $$1 = this.b.b(lr.aK);
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a(cud.oF).a(est.a(euz.a(2.0F, 5.0F))).a(erl.a($$1.b(czo.x)))));
   }

   protected eqt.a e(dff $$0) {
      jl.b<czj> $$1 = this.b.b(lr.aK);
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a(cud.oA).a(est.a(euz.a(4.0F, 9.0F))).a(erl.a($$1.b(czo.x)))));
   }

   protected eqt.a f(dff $$0) {
      jl.b<czj> $$1 = this.b.b(lr.aK);
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a(cud.lH).a(est.a(euz.a(4.0F, 5.0F))).a(erl.b($$1.b(czo.x)))));
   }

   protected eqt.a g(dff $$0) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a(ero.a(ero.b.a).a(kn.g).a(kn.h).a(kn.p).a(kn.X)))));
   }

   protected eqt.a h(dff $$0) {
      return eqt.b().a(eqs.a().a(this.a()).a(eus.a(1.0F)).a(erb.a($$0).a(ero.a(ero.b.a).a(kn.ac)).a(ern.a($$0).a(dez.c))));
   }

   protected eqt.a i(dff $$0) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a(erb.a($$0).a(this.a()).a(ero.a(ero.b.a).a(kn.ac)).a(ern.a($$0).a(dez.c)).a(erb.a($$0))));
   }

   protected eqt.a j(dff $$0) {
      return eqt.b().a(eqs.a().a(erb.a(cud.wv)).a(ety.a($$0).a(dy.a.a().a(dgb.r_, true))));
   }

   protected eqt.a a(dff $$0, ctv $$1) {
      jl.b<czj> $$2 = this.b.b(lr.aK);
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a($$1).a(erl.a($$2.b(czo.x)))));
   }

   protected eqt.a b(dff $$0, dcc $$1) {
      return this.a($$0, (ere.a<?>)this.a((dcc)$$0, erb.a($$1).a(est.a(euz.a(-6.0F, 2.0F))).a(erz.a(eqn.b(0)))));
   }

   protected eqt.a k(dff $$0) {
      jl.b<czj> $$1 = this.b.b(lr.aK);
      return this.b($$0, (ere.a<?>)this.a((dcc)$$0, erb.a(cud.pv).a(eue.a(0.125F)).a(erl.a($$1.b(czo.x), 2))));
   }

   public eqt.a b(dff $$0, ctv $$1) {
      return eqt.b()
         .a(
            this.a(
               $$0,
               eqs.a()
                  .a(eus.a(1.0F))
                  .a(erb.a($$1).a(dnb.c.a(), $$1x -> est.a(eur.a(3, (float)($$1x + 1) / 15.0F)).a(ety.a($$0).a(dy.a.a().a(dnb.c, $$1x.intValue())))))
            )
         );
   }

   public eqt.a c(dff $$0, ctv $$1) {
      return eqt.b().a(this.a($$0, eqs.a().a(eus.a(1.0F)).a(erb.a($$1).a(est.a(eur.a(3, 0.53333336F))))));
   }

   protected static eqt.a b(dcc $$0) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a(a).a(erb.a($$0)));
   }

   protected eqt.a a(dff $$0, etz.a $$1) {
      return eqt.b()
         .a(
            eqs.a()
               .a(
                  (ere.a<?>)this.a(
                     (dcc)$$0,
                     erb.a($$0)
                        .a($$1)
                        .a(jf.values(), $$1x -> est.a(eus.a(1.0F), true).a(ety.a($$0).a(dy.a.a().a(dkf.b($$1x), true))))
                        .a(est.a(eus.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqt.a a(dff $$0, dff $$1, float... $$2) {
      jl.b<czj> $$3 = this.b.b(lr.aK);
      return this.c($$0, ((erg.a)this.a((dcc)$$0, erb.a($$1))).a(eto.a($$3.b(czo.x), $$2)))
         .a(eqs.a().a(eus.a(1.0F)).a(this.f()).a(((erg.a)this.a((dcc)$$0, erb.a(cud.pp).a(est.a(euz.a(1.0F, 2.0F))))).a(eto.a($$3.b(czo.x), g))));
   }

   protected eqt.a b(dff $$0, dff $$1, float... $$2) {
      jl.b<czj> $$3 = this.b.b(lr.aK);
      return this.a($$0, $$1, $$2)
         .a(
            eqs.a()
               .a(eus.a(1.0F))
               .a(this.f())
               .a(((erg.a)this.a((dcc)$$0, erb.a(cud.ot))).a(eto.a($$3.b(czo.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eqt.a l(dff $$0) {
      jl.b<czj> $$1 = this.b.b(lr.aK);
      return this.c($$0, ((erg.a)this.a((dcc)dfh.aL, erb.a(cud.pp).a(est.a(euz.a(1.0F, 2.0F))))).a(eto.a($$1.b(czo.x), g)));
   }

   protected eqt.a a(dff $$0, ctv $$1, ctv $$2, etz.a $$3) {
      jl.b<czj> $$4 = this.b.b(lr.aK);
      return this.a((dcc)$$0, eqt.b().a(eqs.a().a(erb.a($$1).a($$3).a(erb.a($$2)))).a(eqs.a().a($$3).a(erb.a($$2).a(erl.a($$4.b(czo.x), 0.5714286F, 3)))));
   }

   protected eqt.a m(dff $$0) {
      return eqt.b().a(eqs.a().a(a).a(erb.a($$0).a(est.a(eus.a(2.0F)))));
   }

   protected eqt.a a(dff $$0, dff $$1) {
      ere.a<?> $$2 = erb.a($$1).a(est.a(eus.a(2.0F))).a(a).a(((erg.a)this.a((dcc)$$0, erb.a(cud.pv))).a(eue.a(0.125F)));
      return eqt.b()
         .a(eqs.a().a($$2).a(ety.a($$0).a(dy.a.a().a(dhn.b, dtd.b))).a(etx.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhn.b, dtd.a))), new ja(0, 1, 0))))
         .a(eqs.a().a($$2).a(ety.a($$0).a(dy.a.a().a(dhn.b, dtd.a))).a(etx.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhn.b, dtd.b))), new ja(0, -1, 0))));
   }

   protected eqt.a n(dff $$0) {
      return eqt.b()
         .a(
            eqs.a()
               .a(eus.a(1.0F))
               .a(
                  (ere.a<?>)this.a(
                     $$0, erb.a($$0).a(List.of(2, 3, 4), $$1 -> est.a(eus.a((float)$$1.intValue())).a(ety.a($$0).a(dy.a.a().a(dfu.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqt.a o(dff $$0) {
      return eqt.b()
         .a(
            eqs.a()
               .a(eus.a(1.0F))
               .a(
                  (ere.a<?>)this.a(
                     $$0,
                     erb.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> est.a(eus.a((float)$$1.intValue())).a(ety.a($$0).a(dy.a.a().a(dks.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqt.a p(dff $$0) {
      return eqt.b().a(eqs.a().a(eus.a(1.0F)).a(erb.a($$0)));
   }

   public static eqt.a c() {
      return eqt.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akj<eqt>, eqt.a> $$0) {
      this.d();
      Set<akj<eqt>> $$1 = new HashSet<>();

      for (dff $$2 : lq.e) {
         if ($$2.a(this.d)) {
            akj<eqt> $$3 = $$2.v();
            if ($$3 != eqk.a && $$1.add($$3)) {
               eqt.a $$4 = this.e.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lq.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.e.keySet());
      }
   }

   protected void b(dff $$0, dff $$1) {
      jl.b<czj> $$2 = this.b.b(lr.aK);
      eqt.a $$3 = this.c($$0, erb.a($$0).a(eto.a($$2.b(czo.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eqt.a q(dff $$0) {
      return this.a($$0, dhl.f, dtd.b);
   }

   protected void r(dff $$0) {
      this.a($$0, $$0x -> this.d((dcc)((dii)$$0x).b()));
   }

   protected void c(dff $$0, dff $$1) {
      this.a($$0, this.c((dcc)$$1));
   }

   protected void c(dff $$0, dcc $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dff $$0) {
      this.c($$0, $$0);
   }

   protected void t(dff $$0) {
      this.c($$0, (dcc)$$0);
   }

   protected void a(dff $$0, Function<dff, eqt.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dff $$0, eqt.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
