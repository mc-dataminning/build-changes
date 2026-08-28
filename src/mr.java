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
   protected static final etn.a a = etu.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(czy.v, de.d.b(1))))));
   protected static final etn.a b = a.invert();
   protected static final etn.a c = etu.a(cp.a.a().a(cun.rV));
   private static final etn.a h = c.or(a);
   private static final etn.a i = h.invert();
   protected final Set<cuf> d;
   protected final cpg e;
   protected final Map<ala<eqi>, eqi.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cuf> $$0, cpg $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cuf> $$0, cpg $$1, Map<ala<eqi>, eqi.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends erm<T>> T a(dbs $$0, erm<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(erb.c()) : $$1.c();
   }

   protected <T extends etg<T>> T a(dbs $$0, etg<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(etj.c()) : $$1.d();
   }

   public eqi.a a(dbs $$0) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0))));
   }

   private static eqi.a a(deu $$0, etn.a $$1, eqt.a<?> $$2) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a($$1).a($$2)));
   }

   protected static eqi.a a(deu $$0, eqt.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eqi.a b(deu $$0, eqt.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eqi.a c(deu $$0, eqt.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eqi.a a(deu $$0, dbs $$1) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a($$1)));
   }

   protected eqi.a a(dbs $$0, eui $$1) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a((eqt.a<?>)this.a($$0, eqq.a($$0).a(esi.a($$1)))));
   }

   protected eqi.a a(deu $$0, dbs $$1, eui $$2) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a($$1).a(esi.a($$2))));
   }

   private static eqi.a c(dbs $$0) {
      return eqi.b().a(eqh.a().a(a).a(eug.a(1.0F)).a(eqq.a($$0)));
   }

   private eqi.a d(dbs $$0) {
      return eqi.b().a(this.a(dew.fR, eqh.a().a(eug.a(1.0F)).a(eqq.a(dew.fR)))).a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0))));
   }

   protected eqi.a a(deu $$0) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a((eqt.a<?>)this.a((dbs)$$0, eqq.a($$0).a(esi.a(eug.a(2.0F)).a(etm.a($$0).a(dx.a.a().a(dlx.b, dtf.c)))))));
   }

   protected <T extends Comparable<T> & azp> eqi.a a(deu $$0, dta<T> $$1, T $$2) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a(etm.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eqi.a b(deu $$0) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a(erd.a(erd.b.a).a(km.f)))));
   }

   protected eqi.a c(deu $$0) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a(erd.a(erd.b.a).a(km.f).a(km.Z).a(km.ac).a(km.ad)))));
   }

   protected eqi.a d(deu $$0) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a(cun.oF).a(esi.a(eum.a(2.0F, 5.0F))).a(era.a(czy.x))));
   }

   protected eqi.a e(deu $$0) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a(cun.oA).a(esi.a(eum.a(4.0F, 9.0F))).a(era.a(czy.x))));
   }

   protected eqi.a f(deu $$0) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a(cun.lH).a(esi.a(eum.a(4.0F, 5.0F))).a(era.b(czy.x))));
   }

   protected eqi.a g(deu $$0) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a(erd.a(erd.b.a).a(km.f).a(km.g).a(km.o).a(km.W)))));
   }

   protected static eqi.a h(deu $$0) {
      return eqi.b().a(eqh.a().a(a).a(eug.a(1.0F)).a(eqq.a($$0).a(erd.a(erd.b.a).a(km.ab)).a(erc.a($$0).a(deo.c))));
   }

   protected static eqi.a i(deu $$0) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a(eqq.a($$0).a(a).a(erd.a(erd.b.a).a(km.ab)).a(erc.a($$0).a(deo.c)).a(eqq.a($$0))));
   }

   protected static eqi.a j(deu $$0) {
      return eqi.b().a(eqh.a().a(eqq.a(cun.ws)).a(etm.a($$0).a(dx.a.a().a(dfq.r_, true))));
   }

   protected eqi.a a(deu $$0, cuf $$1) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a($$1).a(era.a(czy.x))));
   }

   protected eqi.a b(deu $$0, dbs $$1) {
      return a($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a($$1).a(esi.a(eum.a(-6.0F, 2.0F))).a(ern.a(eqc.b(0)))));
   }

   protected eqi.a k(deu $$0) {
      return b($$0, (eqt.a<?>)this.a((dbs)$$0, eqq.a(cun.pv).a(ets.a(0.125F)).a(era.a(czy.x, 2))));
   }

   public eqi.a b(deu $$0, cuf $$1) {
      return eqi.b()
         .a(
            this.a(
               $$0,
               eqh.a()
                  .a(eug.a(1.0F))
                  .a(eqq.a($$1).a(dmq.c.a(), $$1x -> esi.a(euf.a(3, (float)($$1x + 1) / 15.0F)).a(etm.a($$0).a(dx.a.a().a(dmq.c, $$1x.intValue())))))
            )
         );
   }

   public eqi.a c(deu $$0, cuf $$1) {
      return eqi.b().a(this.a($$0, eqh.a().a(eug.a(1.0F)).a(eqq.a($$1).a(esi.a(euf.a(3, 0.53333336F))))));
   }

   protected static eqi.a b(dbs $$0) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a(c).a(eqq.a($$0)));
   }

   protected eqi.a a(deu $$0, etn.a $$1) {
      return eqi.b()
         .a(
            eqh.a()
               .a(
                  (eqt.a<?>)this.a(
                     (dbs)$$0,
                     eqq.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> esi.a(eug.a(1.0F), true).a(etm.a($$0).a(dx.a.a().a(dju.b($$1x), true))))
                        .a(esi.a(eug.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqi.a a(deu $$0, deu $$1, float... $$2) {
      return c($$0, ((eqv.a)this.a((dbs)$$0, eqq.a($$1))).a(etd.a(czy.x, $$2)))
         .a(eqh.a().a(eug.a(1.0F)).a(i).a(((eqv.a)this.a((dbs)$$0, eqq.a(cun.pp).a(esi.a(eum.a(1.0F, 2.0F))))).a(etd.a(czy.x, j))));
   }

   protected eqi.a b(deu $$0, deu $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eqh.a().a(eug.a(1.0F)).a(i).a(((eqv.a)this.a((dbs)$$0, eqq.a(cun.ot))).a(etd.a(czy.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eqi.a l(deu $$0) {
      return c($$0, ((eqv.a)this.a((dbs)dew.aL, eqq.a(cun.pp).a(esi.a(eum.a(1.0F, 2.0F))))).a(etd.a(czy.x, j)));
   }

   protected eqi.a a(deu $$0, cuf $$1, cuf $$2, etn.a $$3) {
      return this.a((dbs)$$0, eqi.b().a(eqh.a().a(eqq.a($$1).a($$3).a(eqq.a($$2)))).a(eqh.a().a($$3).a(eqq.a($$2).a(era.a(czy.x, 0.5714286F, 3)))));
   }

   protected static eqi.a m(deu $$0) {
      return eqi.b().a(eqh.a().a(c).a(eqq.a($$0).a(esi.a(eug.a(2.0F)))));
   }

   protected eqi.a a(deu $$0, deu $$1) {
      eqt.a<?> $$2 = eqq.a($$1).a(esi.a(eug.a(2.0F))).a(c).a(((eqv.a)this.a((dbs)$$0, eqq.a(cun.pv))).a(ets.a(0.125F)));
      return eqi.b()
         .a(eqh.a().a($$2).a(etm.a($$0).a(dx.a.a().a(dhc.b, dst.b))).a(etl.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhc.b, dst.a))), new iz(0, 1, 0))))
         .a(eqh.a().a($$2).a(etm.a($$0).a(dx.a.a().a(dhc.b, dst.a))).a(etl.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhc.b, dst.b))), new iz(0, -1, 0))));
   }

   protected eqi.a n(deu $$0) {
      return eqi.b()
         .a(
            eqh.a()
               .a(eug.a(1.0F))
               .a(
                  (eqt.a<?>)this.a(
                     $$0, eqq.a($$0).a(List.of(2, 3, 4), $$1 -> esi.a(eug.a((float)$$1.intValue())).a(etm.a($$0).a(dx.a.a().a(dfj.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqi.a o(deu $$0) {
      return eqi.b()
         .a(
            eqh.a()
               .a(eug.a(1.0F))
               .a(
                  (eqt.a<?>)this.a(
                     $$0,
                     eqq.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esi.a(eug.a((float)$$1.intValue())).a(etm.a($$0).a(dx.a.a().a(dkh.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqi.a p(deu $$0) {
      return eqi.b().a(eqh.a().a(eug.a(1.0F)).a(eqq.a($$0)));
   }

   public static eqi.a a() {
      return eqi.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ala<eqi>, eqi.a> $$1) {
      this.b();
      Set<ala<eqi>> $$2 = new HashSet<>();

      for (deu $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ala<eqi> $$4 = $$3.v();
            if ($$4 != epz.a && $$2.add($$4)) {
               eqi.a $$5 = this.f.remove($$4);
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

   protected void b(deu $$0, deu $$1) {
      eqi.a $$2 = c($$0, eqq.a($$0).a(etd.a(czy.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eqi.a q(deu $$0) {
      return this.a($$0, dha.f, dst.b);
   }

   protected void r(deu $$0) {
      this.a($$0, $$0x -> this.d((dbs)((dhx)$$0x).b()));
   }

   protected void c(deu $$0, deu $$1) {
      this.a($$0, c((dbs)$$1));
   }

   protected void c(deu $$0, dbs $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(deu $$0) {
      this.c($$0, $$0);
   }

   protected void t(deu $$0) {
      this.c($$0, (dbs)$$0);
   }

   protected void a(deu $$0, Function<deu, eqi.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(deu $$0, eqi.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
