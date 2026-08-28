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
   protected static final etu.a a = eub.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(daf.v, de.d.b(1))))));
   protected static final etu.a b = a.invert();
   protected static final etu.a c = eub.a(cp.a.a().a(cuu.rV));
   private static final etu.a h = c.or(a);
   private static final etu.a i = h.invert();
   protected final Set<cum> d;
   protected final cpn e;
   protected final Map<ale<eqp>, eqp.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cum> $$0, cpn $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cum> $$0, cpn $$1, Map<ale<eqp>, eqp.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ert<T>> T a(dbz $$0, ert<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(eri.c()) : $$1.c();
   }

   protected <T extends etn<T>> T a(dbz $$0, etn<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(etq.c()) : $$1.d();
   }

   public eqp.a a(dbz $$0) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0))));
   }

   private static eqp.a a(dfb $$0, etu.a $$1, era.a<?> $$2) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a($$1).a($$2)));
   }

   protected static eqp.a a(dfb $$0, era.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eqp.a b(dfb $$0, era.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eqp.a c(dfb $$0, era.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eqp.a a(dfb $$0, dbz $$1) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a($$1)));
   }

   protected eqp.a a(dbz $$0, eup $$1) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a((era.a<?>)this.a($$0, eqx.a($$0).a(esp.a($$1)))));
   }

   protected eqp.a a(dfb $$0, dbz $$1, eup $$2) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a($$1).a(esp.a($$2))));
   }

   private static eqp.a c(dbz $$0) {
      return eqp.b().a(eqo.a().a(a).a(eun.a(1.0F)).a(eqx.a($$0)));
   }

   private eqp.a d(dbz $$0) {
      return eqp.b().a(this.a(dfd.fR, eqo.a().a(eun.a(1.0F)).a(eqx.a(dfd.fR)))).a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0))));
   }

   protected eqp.a a(dfb $$0) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a((era.a<?>)this.a((dbz)$$0, eqx.a($$0).a(esp.a(eun.a(2.0F)).a(ett.a($$0).a(dx.a.a().a(dme.b, dtm.c)))))));
   }

   protected <T extends Comparable<T> & azu> eqp.a a(dfb $$0, dth<T> $$1, T $$2) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a(ett.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eqp.a b(dfb $$0) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a(erk.a(erk.b.a).a(km.g)))));
   }

   protected eqp.a c(dfb $$0) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a(erk.a(erk.b.a).a(km.g).a(km.aa).a(km.ad).a(km.ae)))));
   }

   protected eqp.a d(dfb $$0) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a(cuu.oF).a(esp.a(eut.a(2.0F, 5.0F))).a(erh.a(daf.x))));
   }

   protected eqp.a e(dfb $$0) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a(cuu.oA).a(esp.a(eut.a(4.0F, 9.0F))).a(erh.a(daf.x))));
   }

   protected eqp.a f(dfb $$0) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a(cuu.lH).a(esp.a(eut.a(4.0F, 5.0F))).a(erh.b(daf.x))));
   }

   protected eqp.a g(dfb $$0) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a(erk.a(erk.b.a).a(km.g).a(km.h).a(km.p).a(km.X)))));
   }

   protected static eqp.a h(dfb $$0) {
      return eqp.b().a(eqo.a().a(a).a(eun.a(1.0F)).a(eqx.a($$0).a(erk.a(erk.b.a).a(km.ac)).a(erj.a($$0).a(dev.c))));
   }

   protected static eqp.a i(dfb $$0) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a(eqx.a($$0).a(a).a(erk.a(erk.b.a).a(km.ac)).a(erj.a($$0).a(dev.c)).a(eqx.a($$0))));
   }

   protected static eqp.a j(dfb $$0) {
      return eqp.b().a(eqo.a().a(eqx.a(cuu.ws)).a(ett.a($$0).a(dx.a.a().a(dfx.r_, true))));
   }

   protected eqp.a a(dfb $$0, cum $$1) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a($$1).a(erh.a(daf.x))));
   }

   protected eqp.a b(dfb $$0, dbz $$1) {
      return a($$0, (era.a<?>)this.a((dbz)$$0, eqx.a($$1).a(esp.a(eut.a(-6.0F, 2.0F))).a(eru.a(eqj.b(0)))));
   }

   protected eqp.a k(dfb $$0) {
      return b($$0, (era.a<?>)this.a((dbz)$$0, eqx.a(cuu.pv).a(etz.a(0.125F)).a(erh.a(daf.x, 2))));
   }

   public eqp.a b(dfb $$0, cum $$1) {
      return eqp.b()
         .a(
            this.a(
               $$0,
               eqo.a()
                  .a(eun.a(1.0F))
                  .a(eqx.a($$1).a(dmx.c.a(), $$1x -> esp.a(eum.a(3, (float)($$1x + 1) / 15.0F)).a(ett.a($$0).a(dx.a.a().a(dmx.c, $$1x.intValue())))))
            )
         );
   }

   public eqp.a c(dfb $$0, cum $$1) {
      return eqp.b().a(this.a($$0, eqo.a().a(eun.a(1.0F)).a(eqx.a($$1).a(esp.a(eum.a(3, 0.53333336F))))));
   }

   protected static eqp.a b(dbz $$0) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a(c).a(eqx.a($$0)));
   }

   protected eqp.a a(dfb $$0, etu.a $$1) {
      return eqp.b()
         .a(
            eqo.a()
               .a(
                  (era.a<?>)this.a(
                     (dbz)$$0,
                     eqx.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> esp.a(eun.a(1.0F), true).a(ett.a($$0).a(dx.a.a().a(dkb.b($$1x), true))))
                        .a(esp.a(eun.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqp.a a(dfb $$0, dfb $$1, float... $$2) {
      return c($$0, ((erc.a)this.a((dbz)$$0, eqx.a($$1))).a(etk.a(daf.x, $$2)))
         .a(eqo.a().a(eun.a(1.0F)).a(i).a(((erc.a)this.a((dbz)$$0, eqx.a(cuu.pp).a(esp.a(eut.a(1.0F, 2.0F))))).a(etk.a(daf.x, j))));
   }

   protected eqp.a b(dfb $$0, dfb $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eqo.a().a(eun.a(1.0F)).a(i).a(((erc.a)this.a((dbz)$$0, eqx.a(cuu.ot))).a(etk.a(daf.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eqp.a l(dfb $$0) {
      return c($$0, ((erc.a)this.a((dbz)dfd.aL, eqx.a(cuu.pp).a(esp.a(eut.a(1.0F, 2.0F))))).a(etk.a(daf.x, j)));
   }

   protected eqp.a a(dfb $$0, cum $$1, cum $$2, etu.a $$3) {
      return this.a((dbz)$$0, eqp.b().a(eqo.a().a(eqx.a($$1).a($$3).a(eqx.a($$2)))).a(eqo.a().a($$3).a(eqx.a($$2).a(erh.a(daf.x, 0.5714286F, 3)))));
   }

   protected static eqp.a m(dfb $$0) {
      return eqp.b().a(eqo.a().a(c).a(eqx.a($$0).a(esp.a(eun.a(2.0F)))));
   }

   protected eqp.a a(dfb $$0, dfb $$1) {
      era.a<?> $$2 = eqx.a($$1).a(esp.a(eun.a(2.0F))).a(c).a(((erc.a)this.a((dbz)$$0, eqx.a(cuu.pv))).a(etz.a(0.125F)));
      return eqp.b()
         .a(eqo.a().a($$2).a(ett.a($$0).a(dx.a.a().a(dhj.b, dta.b))).a(ets.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhj.b, dta.a))), new iz(0, 1, 0))))
         .a(eqo.a().a($$2).a(ett.a($$0).a(dx.a.a().a(dhj.b, dta.a))).a(ets.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhj.b, dta.b))), new iz(0, -1, 0))));
   }

   protected eqp.a n(dfb $$0) {
      return eqp.b()
         .a(
            eqo.a()
               .a(eun.a(1.0F))
               .a(
                  (era.a<?>)this.a(
                     $$0, eqx.a($$0).a(List.of(2, 3, 4), $$1 -> esp.a(eun.a((float)$$1.intValue())).a(ett.a($$0).a(dx.a.a().a(dfq.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqp.a o(dfb $$0) {
      return eqp.b()
         .a(
            eqo.a()
               .a(eun.a(1.0F))
               .a(
                  (era.a<?>)this.a(
                     $$0,
                     eqx.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esp.a(eun.a((float)$$1.intValue())).a(ett.a($$0).a(dx.a.a().a(dko.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqp.a p(dfb $$0) {
      return eqp.b().a(eqo.a().a(eun.a(1.0F)).a(eqx.a($$0)));
   }

   public static eqp.a a() {
      return eqp.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqp>, eqp.a> $$1) {
      this.b();
      Set<ale<eqp>> $$2 = new HashSet<>();

      for (dfb $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ale<eqp> $$4 = $$3.v();
            if ($$4 != eqg.a && $$2.add($$4)) {
               eqp.a $$5 = this.f.remove($$4);
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

   protected void b(dfb $$0, dfb $$1) {
      eqp.a $$2 = c($$0, eqx.a($$0).a(etk.a(daf.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eqp.a q(dfb $$0) {
      return this.a($$0, dhh.f, dta.b);
   }

   protected void r(dfb $$0) {
      this.a($$0, $$0x -> this.d((dbz)((die)$$0x).b()));
   }

   protected void c(dfb $$0, dfb $$1) {
      this.a($$0, c((dbz)$$1));
   }

   protected void c(dfb $$0, dbz $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfb $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfb $$0) {
      this.c($$0, (dbz)$$0);
   }

   protected void a(dfb $$0, Function<dfb, eqp.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfb $$0, eqp.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
