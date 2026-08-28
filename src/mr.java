import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mr implements mu {
   protected static final etq.a a = etx.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(dab.v, de.d.b(1))))));
   protected static final etq.a b = a.invert();
   protected static final etq.a c = etx.a(cp.a.a().a(cuq.rV));
   private static final etq.a h = c.or(a);
   private static final etq.a i = h.invert();
   protected final Set<cui> d;
   protected final cpj e;
   protected final Map<ald<eql>, eql.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cui> $$0, cpj $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cui> $$0, cpj $$1, Map<ald<eql>, eql.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends erp<T>> T a(dbv $$0, erp<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(ere.c()) : $$1.c();
   }

   protected <T extends etj<T>> T a(dbv $$0, etj<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(etm.c()) : $$1.d();
   }

   public eql.a a(dbv $$0) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0))));
   }

   private static eql.a a(dex $$0, etq.a $$1, eqw.a<?> $$2) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a($$1).a($$2)));
   }

   protected static eql.a a(dex $$0, eqw.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eql.a b(dex $$0, eqw.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eql.a c(dex $$0, eqw.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eql.a a(dex $$0, dbv $$1) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a($$1)));
   }

   protected eql.a a(dbv $$0, eul $$1) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a((eqw.a<?>)this.a($$0, eqt.a($$0).a(esl.a($$1)))));
   }

   protected eql.a a(dex $$0, dbv $$1, eul $$2) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a($$1).a(esl.a($$2))));
   }

   private static eql.a c(dbv $$0) {
      return eql.b().a(eqk.a().a(a).a(euj.a(1.0F)).a(eqt.a($$0)));
   }

   private eql.a d(dbv $$0) {
      return eql.b().a(this.a(dez.fR, eqk.a().a(euj.a(1.0F)).a(eqt.a(dez.fR)))).a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0))));
   }

   protected eql.a a(dex $$0) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a((eqw.a<?>)this.a((dbv)$$0, eqt.a($$0).a(esl.a(euj.a(2.0F)).a(etp.a($$0).a(dx.a.a().a(dma.b, dti.c)))))));
   }

   protected <T extends Comparable<T> & azs> eql.a a(dex $$0, dtd<T> $$1, T $$2) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a(etp.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eql.a b(dex $$0) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a(erg.a(erg.b.a).a(km.f)))));
   }

   protected eql.a c(dex $$0) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a(erg.a(erg.b.a).a(km.f).a(km.Z).a(km.ac).a(km.ad)))));
   }

   protected eql.a d(dex $$0) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a(cuq.oF).a(esl.a(eup.a(2.0F, 5.0F))).a(erd.a(dab.x))));
   }

   protected eql.a e(dex $$0) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a(cuq.oA).a(esl.a(eup.a(4.0F, 9.0F))).a(erd.a(dab.x))));
   }

   protected eql.a f(dex $$0) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a(cuq.lH).a(esl.a(eup.a(4.0F, 5.0F))).a(erd.b(dab.x))));
   }

   protected eql.a g(dex $$0) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a(erg.a(erg.b.a).a(km.f).a(km.g).a(km.o).a(km.W)))));
   }

   protected static eql.a h(dex $$0) {
      return eql.b().a(eqk.a().a(a).a(euj.a(1.0F)).a(eqt.a($$0).a(erg.a(erg.b.a).a(km.ab)).a(erf.a($$0).a(der.c))));
   }

   protected static eql.a i(dex $$0) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a(eqt.a($$0).a(a).a(erg.a(erg.b.a).a(km.ab)).a(erf.a($$0).a(der.c)).a(eqt.a($$0))));
   }

   protected static eql.a j(dex $$0) {
      return eql.b().a(eqk.a().a(eqt.a(cuq.ws)).a(etp.a($$0).a(dx.a.a().a(dft.r_, true))));
   }

   protected eql.a a(dex $$0, cui $$1) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a($$1).a(erd.a(dab.x))));
   }

   protected eql.a b(dex $$0, dbv $$1) {
      return a($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a($$1).a(esl.a(eup.a(-6.0F, 2.0F))).a(erq.a(eqf.b(0)))));
   }

   protected eql.a k(dex $$0) {
      return b($$0, (eqw.a<?>)this.a((dbv)$$0, eqt.a(cuq.pv).a(etv.a(0.125F)).a(erd.a(dab.x, 2))));
   }

   public eql.a b(dex $$0, cui $$1) {
      return eql.b()
         .a(
            this.a(
               $$0,
               eqk.a()
                  .a(euj.a(1.0F))
                  .a(eqt.a($$1).a(dmt.c.a(), $$1x -> esl.a(eui.a(3, (float)($$1x + 1) / 15.0F)).a(etp.a($$0).a(dx.a.a().a(dmt.c, $$1x.intValue())))))
            )
         );
   }

   public eql.a c(dex $$0, cui $$1) {
      return eql.b().a(this.a($$0, eqk.a().a(euj.a(1.0F)).a(eqt.a($$1).a(esl.a(eui.a(3, 0.53333336F))))));
   }

   protected static eql.a b(dbv $$0) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a(c).a(eqt.a($$0)));
   }

   protected eql.a a(dex $$0, etq.a $$1) {
      return eql.b()
         .a(
            eqk.a()
               .a(
                  (eqw.a<?>)this.a(
                     (dbv)$$0,
                     eqt.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> esl.a(euj.a(1.0F), true).a(etp.a($$0).a(dx.a.a().a(djx.b($$1x), true))))
                        .a(esl.a(euj.a(-1.0F), true))
                  )
               )
         );
   }

   protected eql.a a(dex $$0, dex $$1, float... $$2) {
      return c($$0, ((eqy.a)this.a((dbv)$$0, eqt.a($$1))).a(etg.a(dab.x, $$2)))
         .a(eqk.a().a(euj.a(1.0F)).a(i).a(((eqy.a)this.a((dbv)$$0, eqt.a(cuq.pp).a(esl.a(eup.a(1.0F, 2.0F))))).a(etg.a(dab.x, j))));
   }

   protected eql.a b(dex $$0, dex $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eqk.a().a(euj.a(1.0F)).a(i).a(((eqy.a)this.a((dbv)$$0, eqt.a(cuq.ot))).a(etg.a(dab.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eql.a l(dex $$0) {
      return c($$0, ((eqy.a)this.a((dbv)dez.aL, eqt.a(cuq.pp).a(esl.a(eup.a(1.0F, 2.0F))))).a(etg.a(dab.x, j)));
   }

   protected eql.a a(dex $$0, cui $$1, cui $$2, etq.a $$3) {
      return this.a((dbv)$$0, eql.b().a(eqk.a().a(eqt.a($$1).a($$3).a(eqt.a($$2)))).a(eqk.a().a($$3).a(eqt.a($$2).a(erd.a(dab.x, 0.5714286F, 3)))));
   }

   protected static eql.a m(dex $$0) {
      return eql.b().a(eqk.a().a(c).a(eqt.a($$0).a(esl.a(euj.a(2.0F)))));
   }

   protected eql.a a(dex $$0, dex $$1) {
      eqw.a<?> $$2 = eqt.a($$1).a(esl.a(euj.a(2.0F))).a(c).a(((eqy.a)this.a((dbv)$$0, eqt.a(cuq.pv))).a(etv.a(0.125F)));
      return eql.b()
         .a(eqk.a().a($$2).a(etp.a($$0).a(dx.a.a().a(dhf.b, dsw.b))).a(eto.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhf.b, dsw.a))), new iz(0, 1, 0))))
         .a(eqk.a().a($$2).a(etp.a($$0).a(dx.a.a().a(dhf.b, dsw.a))).a(eto.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhf.b, dsw.b))), new iz(0, -1, 0))));
   }

   protected eql.a n(dex $$0) {
      return eql.b()
         .a(
            eqk.a()
               .a(euj.a(1.0F))
               .a(
                  (eqw.a<?>)this.a(
                     $$0, eqt.a($$0).a(List.of(2, 3, 4), $$1 -> esl.a(euj.a((float)$$1.intValue())).a(etp.a($$0).a(dx.a.a().a(dfm.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eql.a o(dex $$0) {
      return eql.b()
         .a(
            eqk.a()
               .a(euj.a(1.0F))
               .a(
                  (eqw.a<?>)this.a(
                     $$0,
                     eqt.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esl.a(euj.a((float)$$1.intValue())).a(etp.a($$0).a(dx.a.a().a(dkk.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eql.a p(dex $$0) {
      return eql.b().a(eqk.a().a(euj.a(1.0F)).a(eqt.a($$0)));
   }

   public static eql.a a() {
      return eql.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eql>, eql.a> $$1) {
      this.b();
      Set<ald<eql>> $$2 = new HashSet<>();

      for (dex $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ald<eql> $$4 = $$3.v();
            if ($$4 != eqc.a && $$2.add($$4)) {
               eql.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.a(), lp.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dex $$0, dex $$1) {
      eql.a $$2 = c($$0, eqt.a($$0).a(etg.a(dab.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eql.a q(dex $$0) {
      return this.a($$0, dhd.f, dsw.b);
   }

   protected void r(dex $$0) {
      this.a($$0, $$0x -> this.d((dbv)((dia)$$0x).b()));
   }

   protected void c(dex $$0, dex $$1) {
      this.a($$0, c((dbv)$$1));
   }

   protected void c(dex $$0, dbv $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dex $$0) {
      this.c($$0, $$0);
   }

   protected void t(dex $$0) {
      this.c($$0, (dbv)$$0);
   }

   protected void a(dex $$0, Function<dex, eql.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dex $$0, eql.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
