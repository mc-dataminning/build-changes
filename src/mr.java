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
   protected static final ets.a a = etz.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(dad.v, de.d.b(1))))));
   protected static final ets.a b = a.invert();
   protected static final ets.a c = etz.a(cp.a.a().a(cus.rV));
   private static final ets.a h = c.or(a);
   private static final ets.a i = h.invert();
   protected final Set<cuk> d;
   protected final cpl e;
   protected final Map<ale<eqn>, eqn.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cuk> $$0, cpl $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cuk> $$0, cpl $$1, Map<ale<eqn>, eqn.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends err<T>> T a(dbx $$0, err<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(erg.c()) : $$1.c();
   }

   protected <T extends etl<T>> T a(dbx $$0, etl<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(eto.c()) : $$1.d();
   }

   public eqn.a a(dbx $$0) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0))));
   }

   private static eqn.a a(dez $$0, ets.a $$1, eqy.a<?> $$2) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a($$1).a($$2)));
   }

   protected static eqn.a a(dez $$0, eqy.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eqn.a b(dez $$0, eqy.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eqn.a c(dez $$0, eqy.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eqn.a a(dez $$0, dbx $$1) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a($$1)));
   }

   protected eqn.a a(dbx $$0, eun $$1) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a((eqy.a<?>)this.a($$0, eqv.a($$0).a(esn.a($$1)))));
   }

   protected eqn.a a(dez $$0, dbx $$1, eun $$2) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a($$1).a(esn.a($$2))));
   }

   private static eqn.a c(dbx $$0) {
      return eqn.b().a(eqm.a().a(a).a(eul.a(1.0F)).a(eqv.a($$0)));
   }

   private eqn.a d(dbx $$0) {
      return eqn.b().a(this.a(dfb.fR, eqm.a().a(eul.a(1.0F)).a(eqv.a(dfb.fR)))).a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0))));
   }

   protected eqn.a a(dez $$0) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a((eqy.a<?>)this.a((dbx)$$0, eqv.a($$0).a(esn.a(eul.a(2.0F)).a(etr.a($$0).a(dx.a.a().a(dmc.b, dtk.c)))))));
   }

   protected <T extends Comparable<T> & azu> eqn.a a(dez $$0, dtf<T> $$1, T $$2) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a(etr.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eqn.a b(dez $$0) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a(eri.a(eri.b.a).a(km.g)))));
   }

   protected eqn.a c(dez $$0) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a(eri.a(eri.b.a).a(km.g).a(km.aa).a(km.ad).a(km.ae)))));
   }

   protected eqn.a d(dez $$0) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a(cus.oF).a(esn.a(eur.a(2.0F, 5.0F))).a(erf.a(dad.x))));
   }

   protected eqn.a e(dez $$0) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a(cus.oA).a(esn.a(eur.a(4.0F, 9.0F))).a(erf.a(dad.x))));
   }

   protected eqn.a f(dez $$0) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a(cus.lH).a(esn.a(eur.a(4.0F, 5.0F))).a(erf.b(dad.x))));
   }

   protected eqn.a g(dez $$0) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a(eri.a(eri.b.a).a(km.g).a(km.h).a(km.p).a(km.X)))));
   }

   protected static eqn.a h(dez $$0) {
      return eqn.b().a(eqm.a().a(a).a(eul.a(1.0F)).a(eqv.a($$0).a(eri.a(eri.b.a).a(km.ac)).a(erh.a($$0).a(det.c))));
   }

   protected static eqn.a i(dez $$0) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a(eqv.a($$0).a(a).a(eri.a(eri.b.a).a(km.ac)).a(erh.a($$0).a(det.c)).a(eqv.a($$0))));
   }

   protected static eqn.a j(dez $$0) {
      return eqn.b().a(eqm.a().a(eqv.a(cus.ws)).a(etr.a($$0).a(dx.a.a().a(dfv.r_, true))));
   }

   protected eqn.a a(dez $$0, cuk $$1) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a($$1).a(erf.a(dad.x))));
   }

   protected eqn.a b(dez $$0, dbx $$1) {
      return a($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a($$1).a(esn.a(eur.a(-6.0F, 2.0F))).a(ers.a(eqh.b(0)))));
   }

   protected eqn.a k(dez $$0) {
      return b($$0, (eqy.a<?>)this.a((dbx)$$0, eqv.a(cus.pv).a(etx.a(0.125F)).a(erf.a(dad.x, 2))));
   }

   public eqn.a b(dez $$0, cuk $$1) {
      return eqn.b()
         .a(
            this.a(
               $$0,
               eqm.a()
                  .a(eul.a(1.0F))
                  .a(eqv.a($$1).a(dmv.c.a(), $$1x -> esn.a(euk.a(3, (float)($$1x + 1) / 15.0F)).a(etr.a($$0).a(dx.a.a().a(dmv.c, $$1x.intValue())))))
            )
         );
   }

   public eqn.a c(dez $$0, cuk $$1) {
      return eqn.b().a(this.a($$0, eqm.a().a(eul.a(1.0F)).a(eqv.a($$1).a(esn.a(euk.a(3, 0.53333336F))))));
   }

   protected static eqn.a b(dbx $$0) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a(c).a(eqv.a($$0)));
   }

   protected eqn.a a(dez $$0, ets.a $$1) {
      return eqn.b()
         .a(
            eqm.a()
               .a(
                  (eqy.a<?>)this.a(
                     (dbx)$$0,
                     eqv.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> esn.a(eul.a(1.0F), true).a(etr.a($$0).a(dx.a.a().a(djz.b($$1x), true))))
                        .a(esn.a(eul.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqn.a a(dez $$0, dez $$1, float... $$2) {
      return c($$0, ((era.a)this.a((dbx)$$0, eqv.a($$1))).a(eti.a(dad.x, $$2)))
         .a(eqm.a().a(eul.a(1.0F)).a(i).a(((era.a)this.a((dbx)$$0, eqv.a(cus.pp).a(esn.a(eur.a(1.0F, 2.0F))))).a(eti.a(dad.x, j))));
   }

   protected eqn.a b(dez $$0, dez $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eqm.a().a(eul.a(1.0F)).a(i).a(((era.a)this.a((dbx)$$0, eqv.a(cus.ot))).a(eti.a(dad.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eqn.a l(dez $$0) {
      return c($$0, ((era.a)this.a((dbx)dfb.aL, eqv.a(cus.pp).a(esn.a(eur.a(1.0F, 2.0F))))).a(eti.a(dad.x, j)));
   }

   protected eqn.a a(dez $$0, cuk $$1, cuk $$2, ets.a $$3) {
      return this.a((dbx)$$0, eqn.b().a(eqm.a().a(eqv.a($$1).a($$3).a(eqv.a($$2)))).a(eqm.a().a($$3).a(eqv.a($$2).a(erf.a(dad.x, 0.5714286F, 3)))));
   }

   protected static eqn.a m(dez $$0) {
      return eqn.b().a(eqm.a().a(c).a(eqv.a($$0).a(esn.a(eul.a(2.0F)))));
   }

   protected eqn.a a(dez $$0, dez $$1) {
      eqy.a<?> $$2 = eqv.a($$1).a(esn.a(eul.a(2.0F))).a(c).a(((era.a)this.a((dbx)$$0, eqv.a(cus.pv))).a(etx.a(0.125F)));
      return eqn.b()
         .a(eqm.a().a($$2).a(etr.a($$0).a(dx.a.a().a(dhh.b, dsy.b))).a(etq.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhh.b, dsy.a))), new iz(0, 1, 0))))
         .a(eqm.a().a($$2).a(etr.a($$0).a(dx.a.a().a(dhh.b, dsy.a))).a(etq.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhh.b, dsy.b))), new iz(0, -1, 0))));
   }

   protected eqn.a n(dez $$0) {
      return eqn.b()
         .a(
            eqm.a()
               .a(eul.a(1.0F))
               .a(
                  (eqy.a<?>)this.a(
                     $$0, eqv.a($$0).a(List.of(2, 3, 4), $$1 -> esn.a(eul.a((float)$$1.intValue())).a(etr.a($$0).a(dx.a.a().a(dfo.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqn.a o(dez $$0) {
      return eqn.b()
         .a(
            eqm.a()
               .a(eul.a(1.0F))
               .a(
                  (eqy.a<?>)this.a(
                     $$0,
                     eqv.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esn.a(eul.a((float)$$1.intValue())).a(etr.a($$0).a(dx.a.a().a(dkm.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqn.a p(dez $$0) {
      return eqn.b().a(eqm.a().a(eul.a(1.0F)).a(eqv.a($$0)));
   }

   public static eqn.a a() {
      return eqn.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqn>, eqn.a> $$1) {
      this.b();
      Set<ale<eqn>> $$2 = new HashSet<>();

      for (dez $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ale<eqn> $$4 = $$3.v();
            if ($$4 != eqe.a && $$2.add($$4)) {
               eqn.a $$5 = this.f.remove($$4);
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

   protected void b(dez $$0, dez $$1) {
      eqn.a $$2 = c($$0, eqv.a($$0).a(eti.a(dad.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eqn.a q(dez $$0) {
      return this.a($$0, dhf.f, dsy.b);
   }

   protected void r(dez $$0) {
      this.a($$0, $$0x -> this.d((dbx)((dic)$$0x).b()));
   }

   protected void c(dez $$0, dez $$1) {
      this.a($$0, c((dbx)$$1));
   }

   protected void c(dez $$0, dbx $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dez $$0) {
      this.c($$0, $$0);
   }

   protected void t(dez $$0) {
      this.c($$0, (dbx)$$0);
   }

   protected void a(dez $$0, Function<dez, eqn.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dez $$0, eqn.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
