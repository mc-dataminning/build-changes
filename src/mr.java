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
   protected static final etr.a a = ety.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(dac.v, de.d.b(1))))));
   protected static final etr.a b = a.invert();
   protected static final etr.a c = ety.a(cp.a.a().a(cur.rV));
   private static final etr.a h = c.or(a);
   private static final etr.a i = h.invert();
   protected final Set<cuj> d;
   protected final cpk e;
   protected final Map<ald<eqm>, eqm.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cuj> $$0, cpk $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cuj> $$0, cpk $$1, Map<ald<eqm>, eqm.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends erq<T>> T a(dbw $$0, erq<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(erf.c()) : $$1.c();
   }

   protected <T extends etk<T>> T a(dbw $$0, etk<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(etn.c()) : $$1.d();
   }

   public eqm.a a(dbw $$0) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0))));
   }

   private static eqm.a a(dey $$0, etr.a $$1, eqx.a<?> $$2) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a(equ.a($$0).a($$1).a($$2)));
   }

   protected static eqm.a a(dey $$0, eqx.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eqm.a b(dey $$0, eqx.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eqm.a c(dey $$0, eqx.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eqm.a a(dey $$0, dbw $$1) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a($$1)));
   }

   protected eqm.a a(dbw $$0, eum $$1) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a((eqx.a<?>)this.a($$0, equ.a($$0).a(esm.a($$1)))));
   }

   protected eqm.a a(dey $$0, dbw $$1, eum $$2) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a($$1).a(esm.a($$2))));
   }

   private static eqm.a c(dbw $$0) {
      return eqm.b().a(eql.a().a(a).a(euk.a(1.0F)).a(equ.a($$0)));
   }

   private eqm.a d(dbw $$0) {
      return eqm.b().a(this.a(dfa.fR, eql.a().a(euk.a(1.0F)).a(equ.a(dfa.fR)))).a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0))));
   }

   protected eqm.a a(dey $$0) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a((eqx.a<?>)this.a((dbw)$$0, equ.a($$0).a(esm.a(euk.a(2.0F)).a(etq.a($$0).a(dx.a.a().a(dmb.b, dtj.c)))))));
   }

   protected <T extends Comparable<T> & azt> eqm.a a(dey $$0, dte<T> $$1, T $$2) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0).a(etq.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eqm.a b(dey $$0) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0).a(erh.a(erh.b.a).a(km.g)))));
   }

   protected eqm.a c(dey $$0) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0).a(erh.a(erh.b.a).a(km.g).a(km.aa).a(km.ad).a(km.ae)))));
   }

   protected eqm.a d(dey $$0) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a(cur.oF).a(esm.a(euq.a(2.0F, 5.0F))).a(ere.a(dac.x))));
   }

   protected eqm.a e(dey $$0) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a(cur.oA).a(esm.a(euq.a(4.0F, 9.0F))).a(ere.a(dac.x))));
   }

   protected eqm.a f(dey $$0) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a(cur.lH).a(esm.a(euq.a(4.0F, 5.0F))).a(ere.b(dac.x))));
   }

   protected eqm.a g(dey $$0) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$0).a(erh.a(erh.b.a).a(km.g).a(km.h).a(km.p).a(km.X)))));
   }

   protected static eqm.a h(dey $$0) {
      return eqm.b().a(eql.a().a(a).a(euk.a(1.0F)).a(equ.a($$0).a(erh.a(erh.b.a).a(km.ac)).a(erg.a($$0).a(des.c))));
   }

   protected static eqm.a i(dey $$0) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a(equ.a($$0).a(a).a(erh.a(erh.b.a).a(km.ac)).a(erg.a($$0).a(des.c)).a(equ.a($$0))));
   }

   protected static eqm.a j(dey $$0) {
      return eqm.b().a(eql.a().a(equ.a(cur.ws)).a(etq.a($$0).a(dx.a.a().a(dfu.r_, true))));
   }

   protected eqm.a a(dey $$0, cuj $$1) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a($$1).a(ere.a(dac.x))));
   }

   protected eqm.a b(dey $$0, dbw $$1) {
      return a($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a($$1).a(esm.a(euq.a(-6.0F, 2.0F))).a(err.a(eqg.b(0)))));
   }

   protected eqm.a k(dey $$0) {
      return b($$0, (eqx.a<?>)this.a((dbw)$$0, equ.a(cur.pv).a(etw.a(0.125F)).a(ere.a(dac.x, 2))));
   }

   public eqm.a b(dey $$0, cuj $$1) {
      return eqm.b()
         .a(
            this.a(
               $$0,
               eql.a()
                  .a(euk.a(1.0F))
                  .a(equ.a($$1).a(dmu.c.a(), $$1x -> esm.a(euj.a(3, (float)($$1x + 1) / 15.0F)).a(etq.a($$0).a(dx.a.a().a(dmu.c, $$1x.intValue())))))
            )
         );
   }

   public eqm.a c(dey $$0, cuj $$1) {
      return eqm.b().a(this.a($$0, eql.a().a(euk.a(1.0F)).a(equ.a($$1).a(esm.a(euj.a(3, 0.53333336F))))));
   }

   protected static eqm.a b(dbw $$0) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a(c).a(equ.a($$0)));
   }

   protected eqm.a a(dey $$0, etr.a $$1) {
      return eqm.b()
         .a(
            eql.a()
               .a(
                  (eqx.a<?>)this.a(
                     (dbw)$$0,
                     equ.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> esm.a(euk.a(1.0F), true).a(etq.a($$0).a(dx.a.a().a(djy.b($$1x), true))))
                        .a(esm.a(euk.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqm.a a(dey $$0, dey $$1, float... $$2) {
      return c($$0, ((eqz.a)this.a((dbw)$$0, equ.a($$1))).a(eth.a(dac.x, $$2)))
         .a(eql.a().a(euk.a(1.0F)).a(i).a(((eqz.a)this.a((dbw)$$0, equ.a(cur.pp).a(esm.a(euq.a(1.0F, 2.0F))))).a(eth.a(dac.x, j))));
   }

   protected eqm.a b(dey $$0, dey $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eql.a().a(euk.a(1.0F)).a(i).a(((eqz.a)this.a((dbw)$$0, equ.a(cur.ot))).a(eth.a(dac.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eqm.a l(dey $$0) {
      return c($$0, ((eqz.a)this.a((dbw)dfa.aL, equ.a(cur.pp).a(esm.a(euq.a(1.0F, 2.0F))))).a(eth.a(dac.x, j)));
   }

   protected eqm.a a(dey $$0, cuj $$1, cuj $$2, etr.a $$3) {
      return this.a((dbw)$$0, eqm.b().a(eql.a().a(equ.a($$1).a($$3).a(equ.a($$2)))).a(eql.a().a($$3).a(equ.a($$2).a(ere.a(dac.x, 0.5714286F, 3)))));
   }

   protected static eqm.a m(dey $$0) {
      return eqm.b().a(eql.a().a(c).a(equ.a($$0).a(esm.a(euk.a(2.0F)))));
   }

   protected eqm.a a(dey $$0, dey $$1) {
      eqx.a<?> $$2 = equ.a($$1).a(esm.a(euk.a(2.0F))).a(c).a(((eqz.a)this.a((dbw)$$0, equ.a(cur.pv))).a(etw.a(0.125F)));
      return eqm.b()
         .a(eql.a().a($$2).a(etq.a($$0).a(dx.a.a().a(dhg.b, dsx.b))).a(etp.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhg.b, dsx.a))), new iz(0, 1, 0))))
         .a(eql.a().a($$2).a(etq.a($$0).a(dx.a.a().a(dhg.b, dsx.a))).a(etp.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhg.b, dsx.b))), new iz(0, -1, 0))));
   }

   protected eqm.a n(dey $$0) {
      return eqm.b()
         .a(
            eql.a()
               .a(euk.a(1.0F))
               .a(
                  (eqx.a<?>)this.a(
                     $$0, equ.a($$0).a(List.of(2, 3, 4), $$1 -> esm.a(euk.a((float)$$1.intValue())).a(etq.a($$0).a(dx.a.a().a(dfn.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqm.a o(dey $$0) {
      return eqm.b()
         .a(
            eql.a()
               .a(euk.a(1.0F))
               .a(
                  (eqx.a<?>)this.a(
                     $$0,
                     equ.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esm.a(euk.a((float)$$1.intValue())).a(etq.a($$0).a(dx.a.a().a(dkl.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqm.a p(dey $$0) {
      return eqm.b().a(eql.a().a(euk.a(1.0F)).a(equ.a($$0)));
   }

   public static eqm.a a() {
      return eqm.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eqm>, eqm.a> $$1) {
      this.b();
      Set<ald<eqm>> $$2 = new HashSet<>();

      for (dey $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ald<eqm> $$4 = $$3.v();
            if ($$4 != eqd.a && $$2.add($$4)) {
               eqm.a $$5 = this.f.remove($$4);
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

   protected void b(dey $$0, dey $$1) {
      eqm.a $$2 = c($$0, equ.a($$0).a(eth.a(dac.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eqm.a q(dey $$0) {
      return this.a($$0, dhe.f, dsx.b);
   }

   protected void r(dey $$0) {
      this.a($$0, $$0x -> this.d((dbw)((dib)$$0x).b()));
   }

   protected void c(dey $$0, dey $$1) {
      this.a($$0, c((dbw)$$1));
   }

   protected void c(dey $$0, dbw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dey $$0) {
      this.c($$0, $$0);
   }

   protected void t(dey $$0) {
      this.c($$0, (dbw)$$0);
   }

   protected void a(dey $$0, Function<dey, eqm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dey $$0, eqm.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
