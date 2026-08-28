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
   protected static final euf.a a = eum.a(cp.a.a().a(cuf.rV));
   protected final jl.a b;
   protected final Set<ctx> c;
   protected final coy d;
   protected final Map<akj<eqz>, eqz.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected euf.a a() {
      jl.b<czl> $$0 = this.b.b(lr.aK);
      return eum.a(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(czq.v), de.d.b(1))))));
   }

   protected euf.a b() {
      return this.a().invert();
   }

   private euf.a e() {
      return a.or(this.a());
   }

   private euf.a f() {
      return this.e().invert();
   }

   protected mq(Set<ctx> $$0, coy $$1, jl.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mq(Set<ctx> $$0, coy $$1, Map<akj<eqz>, eqz.a> $$2, jl.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends ese<T>> T a(dce $$0, ese<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(ers.c()) : $$1.c();
   }

   protected <T extends etx<T>> T a(dce $$0, etx<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(eub.c()) : $$1.d();
   }

   public eqz.a a(dce $$0) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0))));
   }

   private static eqz.a a(dfh $$0, euf.a $$1, erk.a<?> $$2) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a($$1).a($$2)));
   }

   protected eqz.a a(dfh $$0, erk.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eqz.a b(dfh $$0, erk.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected eqz.a c(dfh $$0, erk.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected eqz.a a(dfh $$0, dce $$1) {
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a($$1)));
   }

   protected eqz.a a(dce $$0, evb $$1) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a((erk.a<?>)this.a($$0, erh.a($$0).a(esz.a($$1)))));
   }

   protected eqz.a a(dfh $$0, dce $$1, evb $$2) {
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a($$1).a(esz.a($$2))));
   }

   private eqz.a c(dce $$0) {
      return eqz.b().a(eqy.a().a(this.a()).a(euy.a(1.0F)).a(erh.a($$0)));
   }

   private eqz.a d(dce $$0) {
      return eqz.b().a(this.a(dfj.fR, eqy.a().a(euy.a(1.0F)).a(erh.a(dfj.fR)))).a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0))));
   }

   protected eqz.a a(dfh $$0) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a((erk.a<?>)this.a((dce)$$0, erh.a($$0).a(esz.a(euy.a(2.0F)).a(eue.a($$0).a(dy.a.a().a(dmk.b, dts.c)))))));
   }

   protected <T extends Comparable<T> & azc> eqz.a a(dfh $$0, dtn<T> $$1, T $$2) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a(eue.a($$0).a(dy.a.a().a($$1, $$2))))));
   }

   protected eqz.a b(dfh $$0) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a(eru.a(eru.b.a).a(kn.g)))));
   }

   protected eqz.a c(dfh $$0) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a(eru.a(eru.b.a).a(kn.g).a(kn.aa).a(kn.ad).a(kn.ae)))));
   }

   protected eqz.a d(dfh $$0) {
      jl.b<czl> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a(cuf.oG).a(esz.a(evf.a(2.0F, 5.0F))).a(err.a($$1.b(czq.x)))));
   }

   protected eqz.a e(dfh $$0) {
      jl.b<czl> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a(cuf.oB).a(esz.a(evf.a(4.0F, 9.0F))).a(err.a($$1.b(czq.x)))));
   }

   protected eqz.a f(dfh $$0) {
      jl.b<czl> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a(cuf.lH).a(esz.a(evf.a(4.0F, 5.0F))).a(err.b($$1.b(czq.x)))));
   }

   protected eqz.a g(dfh $$0) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a(eru.a(eru.b.a).a(kn.g).a(kn.h).a(kn.p).a(kn.X)))));
   }

   protected eqz.a h(dfh $$0) {
      return eqz.b().a(eqy.a().a(this.a()).a(euy.a(1.0F)).a(erh.a($$0).a(eru.a(eru.b.a).a(kn.ac)).a(ert.a($$0).a(dfb.c))));
   }

   protected eqz.a i(dfh $$0) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a(erh.a($$0).a(this.a()).a(eru.a(eru.b.a).a(kn.ac)).a(ert.a($$0).a(dfb.c)).a(erh.a($$0))));
   }

   protected eqz.a j(dfh $$0) {
      return eqz.b().a(eqy.a().a(erh.a(cuf.wv)).a(eue.a($$0).a(dy.a.a().a(dgd.r_, true))));
   }

   protected eqz.a a(dfh $$0, ctx $$1) {
      jl.b<czl> $$2 = this.b.b(lr.aK);
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a($$1).a(err.a($$2.b(czq.x)))));
   }

   protected eqz.a b(dfh $$0, dce $$1) {
      return this.a($$0, (erk.a<?>)this.a((dce)$$0, erh.a($$1).a(esz.a(evf.a(-6.0F, 2.0F))).a(esf.a(eqt.b(0)))));
   }

   protected eqz.a k(dfh $$0) {
      jl.b<czl> $$1 = this.b.b(lr.aK);
      return this.b($$0, (erk.a<?>)this.a((dce)$$0, erh.a(cuf.pv).a(euk.a(0.125F)).a(err.a($$1.b(czq.x), 2))));
   }

   public eqz.a b(dfh $$0, ctx $$1) {
      return eqz.b()
         .a(
            this.a(
               $$0,
               eqy.a()
                  .a(euy.a(1.0F))
                  .a(erh.a($$1).a(dnd.c.a(), $$1x -> esz.a(eux.a(3, (float)($$1x + 1) / 15.0F)).a(eue.a($$0).a(dy.a.a().a(dnd.c, $$1x.intValue())))))
            )
         );
   }

   public eqz.a c(dfh $$0, ctx $$1) {
      return eqz.b().a(this.a($$0, eqy.a().a(euy.a(1.0F)).a(erh.a($$1).a(esz.a(eux.a(3, 0.53333336F))))));
   }

   protected static eqz.a b(dce $$0) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a(a).a(erh.a($$0)));
   }

   protected eqz.a a(dfh $$0, euf.a $$1) {
      return eqz.b()
         .a(
            eqy.a()
               .a(
                  (erk.a<?>)this.a(
                     (dce)$$0,
                     erh.a($$0)
                        .a($$1)
                        .a(jf.values(), $$1x -> esz.a(euy.a(1.0F), true).a(eue.a($$0).a(dy.a.a().a(dkh.b($$1x), true))))
                        .a(esz.a(euy.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqz.a a(dfh $$0, dfh $$1, float... $$2) {
      jl.b<czl> $$3 = this.b.b(lr.aK);
      return this.c($$0, ((erm.a)this.a((dce)$$0, erh.a($$1))).a(etu.a($$3.b(czq.x), $$2)))
         .a(eqy.a().a(euy.a(1.0F)).a(this.f()).a(((erm.a)this.a((dce)$$0, erh.a(cuf.pq).a(esz.a(evf.a(1.0F, 2.0F))))).a(etu.a($$3.b(czq.x), g))));
   }

   protected eqz.a b(dfh $$0, dfh $$1, float... $$2) {
      jl.b<czl> $$3 = this.b.b(lr.aK);
      return this.a($$0, $$1, $$2)
         .a(
            eqy.a()
               .a(euy.a(1.0F))
               .a(this.f())
               .a(((erm.a)this.a((dce)$$0, erh.a(cuf.ou))).a(etu.a($$3.b(czq.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eqz.a l(dfh $$0) {
      jl.b<czl> $$1 = this.b.b(lr.aK);
      return this.c($$0, ((erm.a)this.a((dce)dfj.aL, erh.a(cuf.pq).a(esz.a(evf.a(1.0F, 2.0F))))).a(etu.a($$1.b(czq.x), g)));
   }

   protected eqz.a a(dfh $$0, ctx $$1, ctx $$2, euf.a $$3) {
      jl.b<czl> $$4 = this.b.b(lr.aK);
      return this.a((dce)$$0, eqz.b().a(eqy.a().a(erh.a($$1).a($$3).a(erh.a($$2)))).a(eqy.a().a($$3).a(erh.a($$2).a(err.a($$4.b(czq.x), 0.5714286F, 3)))));
   }

   protected eqz.a m(dfh $$0) {
      return eqz.b().a(eqy.a().a(a).a(erh.a($$0).a(esz.a(euy.a(2.0F)))));
   }

   protected eqz.a a(dfh $$0, dfh $$1) {
      erk.a<?> $$2 = erh.a($$1).a(esz.a(euy.a(2.0F))).a(a).a(((erm.a)this.a((dce)$$0, erh.a(cuf.pv))).a(euk.a(0.125F)));
      return eqz.b()
         .a(eqy.a().a($$2).a(eue.a($$0).a(dy.a.a().a(dhp.b, dtg.b))).a(eud.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhp.b, dtg.a))), new ja(0, 1, 0))))
         .a(eqy.a().a($$2).a(eue.a($$0).a(dy.a.a().a(dhp.b, dtg.a))).a(eud.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhp.b, dtg.b))), new ja(0, -1, 0))));
   }

   protected eqz.a n(dfh $$0) {
      return eqz.b()
         .a(
            eqy.a()
               .a(euy.a(1.0F))
               .a(
                  (erk.a<?>)this.a(
                     $$0, erh.a($$0).a(List.of(2, 3, 4), $$1 -> esz.a(euy.a((float)$$1.intValue())).a(eue.a($$0).a(dy.a.a().a(dfw.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqz.a o(dfh $$0) {
      return eqz.b()
         .a(
            eqy.a()
               .a(euy.a(1.0F))
               .a(
                  (erk.a<?>)this.a(
                     $$0,
                     erh.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> esz.a(euy.a((float)$$1.intValue())).a(eue.a($$0).a(dy.a.a().a(dku.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqz.a p(dfh $$0) {
      return eqz.b().a(eqy.a().a(euy.a(1.0F)).a(erh.a($$0)));
   }

   public static eqz.a c() {
      return eqz.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akj<eqz>, eqz.a> $$0) {
      this.d();
      Set<akj<eqz>> $$1 = new HashSet<>();

      for (dfh $$2 : lq.e) {
         if ($$2.a(this.d)) {
            akj<eqz> $$3 = $$2.v();
            if ($$3 != eqq.a && $$1.add($$3)) {
               eqz.a $$4 = this.e.remove($$3);
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

   protected void b(dfh $$0, dfh $$1) {
      jl.b<czl> $$2 = this.b.b(lr.aK);
      eqz.a $$3 = this.c($$0, erh.a($$0).a(etu.a($$2.b(czq.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eqz.a q(dfh $$0) {
      return this.a($$0, dhn.f, dtg.b);
   }

   protected void r(dfh $$0) {
      this.a($$0, $$0x -> this.d((dce)((dik)$$0x).b()));
   }

   protected void c(dfh $$0, dfh $$1) {
      this.a($$0, this.c((dce)$$1));
   }

   protected void c(dfh $$0, dce $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfh $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfh $$0) {
      this.c($$0, (dce)$$0);
   }

   protected void a(dfh $$0, Function<dfh, eqz.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfh $$0, eqz.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
