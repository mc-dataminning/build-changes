import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mu implements mx {
   protected static final evc.a a = evj.a(cs.a.a().a(cut.rV));
   protected final jo.a b;
   protected final Set<cul> c;
   protected final cpl d;
   protected final Map<akq<erw>, erw.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected evc.a a() {
      jo.b<dac> $$0 = this.b.b(lu.aL);
      return evj.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(dah.v), dh.d.b(1))))));
   }

   protected evc.a b() {
      return this.a().invert();
   }

   private evc.a e() {
      return a.or(this.a());
   }

   private evc.a f() {
      return this.e().invert();
   }

   protected mu(Set<cul> $$0, cpl $$1, jo.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mu(Set<cul> $$0, cpl $$1, Map<akq<erw>, erw.a> $$2, jo.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends etb<T>> T a(dcv $$0, etb<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(esp.c()) : $$1.c();
   }

   protected <T extends euu<T>> T a(dcv $$0, euu<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(euy.c()) : $$1.d();
   }

   public erw.a a(dcv $$0) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0))));
   }

   private static erw.a a(dfy $$0, evc.a $$1, esh.a<?> $$2) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a(ese.a($$0).a($$1).a($$2)));
   }

   protected erw.a a(dfy $$0, esh.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected erw.a b(dfy $$0, esh.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected erw.a c(dfy $$0, esh.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected erw.a a(dfy $$0, dcv $$1) {
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a($$1)));
   }

   protected erw.a a(dcv $$0, evy $$1) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a((esh.a<?>)this.a($$0, ese.a($$0).a(etw.a($$1)))));
   }

   protected erw.a a(dfy $$0, dcv $$1, evy $$2) {
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a($$1).a(etw.a($$2))));
   }

   private erw.a c(dcv $$0) {
      return erw.b().a(erv.a().a(this.a()).a(evv.a(1.0F)).a(ese.a($$0)));
   }

   private erw.a d(dcv $$0) {
      return erw.b().a(this.a(dga.fR, erv.a().a(evv.a(1.0F)).a(ese.a(dga.fR)))).a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0))));
   }

   protected erw.a a(dfy $$0) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a((esh.a<?>)this.a((dcv)$$0, ese.a($$0).a(etw.a(evv.a(2.0F)).a(evb.a($$0).a(eb.a.a().a(dnc.b, duk.c)))))));
   }

   protected <T extends Comparable<T> & azk> erw.a a(dfy $$0, duf<T> $$1, T $$2) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0).a(evb.a($$0).a(eb.a.a().a($$1, $$2))))));
   }

   protected erw.a b(dfy $$0) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0).a(esr.a(esr.b.a).a(kq.g)))));
   }

   protected erw.a c(dfy $$0) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0).a(esr.a(esr.b.a).a(kq.g).a(kq.ab).a(kq.ae).a(kq.af)))));
   }

   protected erw.a d(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a(cut.oG).a(etw.a(ewc.a(2.0F, 5.0F))).a(eso.a($$1.b(dah.x)))));
   }

   protected erw.a e(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a(cut.oB).a(etw.a(ewc.a(4.0F, 9.0F))).a(eso.a($$1.b(dah.x)))));
   }

   protected erw.a f(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a(cut.lH).a(etw.a(ewc.a(4.0F, 5.0F))).a(eso.b($$1.b(dah.x)))));
   }

   protected erw.a g(dfy $$0) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$0).a(esr.a(esr.b.a).a(kq.g).a(kq.h).a(kq.p).a(kq.Y)))));
   }

   protected erw.a h(dfy $$0) {
      return erw.b().a(erv.a().a(this.a()).a(evv.a(1.0F)).a(ese.a($$0).a(esr.a(esr.b.a).a(kq.ad)).a(esq.a($$0).a(dfs.c))));
   }

   protected erw.a i(dfy $$0) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a(ese.a($$0).a(this.a()).a(esr.a(esr.b.a).a(kq.ad)).a(esq.a($$0).a(dfs.c)).a(ese.a($$0))));
   }

   protected erw.a j(dfy $$0) {
      return erw.b().a(erv.a().a(ese.a(cut.wv)).a(evb.a($$0).a(eb.a.a().a(dgu.s_, true))));
   }

   protected erw.a a(dfy $$0, cul $$1) {
      jo.b<dac> $$2 = this.b.b(lu.aL);
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a($$1).a(eso.a($$2.b(dah.x)))));
   }

   protected erw.a b(dfy $$0, dcv $$1) {
      return this.a($$0, (esh.a<?>)this.a((dcv)$$0, ese.a($$1).a(etw.a(ewc.a(-6.0F, 2.0F))).a(etc.a(erq.b(0)))));
   }

   protected erw.a k(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.b($$0, (esh.a<?>)this.a((dcv)$$0, ese.a(cut.pv).a(evh.a(0.125F)).a(eso.a($$1.b(dah.x), 2))));
   }

   public erw.a b(dfy $$0, cul $$1) {
      return erw.b()
         .a(
            this.a(
               $$0,
               erv.a()
                  .a(evv.a(1.0F))
                  .a(ese.a($$1).a(dnv.c.a(), $$1x -> etw.a(evu.a(3, (float)($$1x + 1) / 15.0F)).a(evb.a($$0).a(eb.a.a().a(dnv.c, $$1x.intValue())))))
            )
         );
   }

   public erw.a c(dfy $$0, cul $$1) {
      return erw.b().a(this.a($$0, erv.a().a(evv.a(1.0F)).a(ese.a($$1).a(etw.a(evu.a(3, 0.53333336F))))));
   }

   protected static erw.a b(dcv $$0) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a(a).a(ese.a($$0)));
   }

   protected erw.a a(dfy $$0, evc.a $$1) {
      return erw.b()
         .a(
            erv.a()
               .a(
                  (esh.a<?>)this.a(
                     (dcv)$$0,
                     ese.a($$0)
                        .a($$1)
                        .a(ji.values(), $$1x -> etw.a(evv.a(1.0F), true).a(evb.a($$0).a(eb.a.a().a(dky.b($$1x), true))))
                        .a(etw.a(evv.a(-1.0F), true))
                  )
               )
         );
   }

   protected erw.a a(dfy $$0, dfy $$1, float... $$2) {
      jo.b<dac> $$3 = this.b.b(lu.aL);
      return this.c($$0, ((esj.a)this.a((dcv)$$0, ese.a($$1))).a(eur.a($$3.b(dah.x), $$2)))
         .a(erv.a().a(evv.a(1.0F)).a(this.f()).a(((esj.a)this.a((dcv)$$0, ese.a(cut.pq).a(etw.a(ewc.a(1.0F, 2.0F))))).a(eur.a($$3.b(dah.x), g))));
   }

   protected erw.a b(dfy $$0, dfy $$1, float... $$2) {
      jo.b<dac> $$3 = this.b.b(lu.aL);
      return this.a($$0, $$1, $$2)
         .a(
            erv.a()
               .a(evv.a(1.0F))
               .a(this.f())
               .a(((esj.a)this.a((dcv)$$0, ese.a(cut.ou))).a(eur.a($$3.b(dah.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected erw.a l(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.c($$0, ((esj.a)this.a((dcv)dga.aL, ese.a(cut.pq).a(etw.a(ewc.a(1.0F, 2.0F))))).a(eur.a($$1.b(dah.x), g)));
   }

   protected erw.a a(dfy $$0, cul $$1, cul $$2, evc.a $$3) {
      jo.b<dac> $$4 = this.b.b(lu.aL);
      return this.a((dcv)$$0, erw.b().a(erv.a().a(ese.a($$1).a($$3).a(ese.a($$2)))).a(erv.a().a($$3).a(ese.a($$2).a(eso.a($$4.b(dah.x), 0.5714286F, 3)))));
   }

   protected erw.a m(dfy $$0) {
      return erw.b().a(erv.a().a(a).a(ese.a($$0).a(etw.a(evv.a(2.0F)))));
   }

   protected erw.a a(dfy $$0, dfy $$1) {
      esh.a<?> $$2 = ese.a($$1).a(etw.a(evv.a(2.0F))).a(a).a(((esj.a)this.a((dcv)$$0, ese.a(cut.pv))).a(evh.a(0.125F)));
      return erw.b()
         .a(erv.a().a($$2).a(evb.a($$0).a(eb.a.a().a(dig.b, dty.b))).a(eva.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(dig.b, dty.a))), new jd(0, 1, 0))))
         .a(erv.a().a($$2).a(evb.a($$0).a(eb.a.a().a(dig.b, dty.a))).a(eva.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(dig.b, dty.b))), new jd(0, -1, 0))));
   }

   protected erw.a n(dfy $$0) {
      return erw.b()
         .a(
            erv.a()
               .a(evv.a(1.0F))
               .a(
                  (esh.a<?>)this.a(
                     $$0, ese.a($$0).a(List.of(2, 3, 4), $$1 -> etw.a(evv.a((float)$$1.intValue())).a(evb.a($$0).a(eb.a.a().a(dgn.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected erw.a o(dfy $$0) {
      return erw.b()
         .a(
            erv.a()
               .a(evv.a(1.0F))
               .a(
                  (esh.a<?>)this.a(
                     $$0,
                     ese.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> etw.a(evv.a((float)$$1.intValue())).a(evb.a($$0).a(eb.a.a().a(dll.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static erw.a p(dfy $$0) {
      return erw.b().a(erv.a().a(evv.a(1.0F)).a(ese.a($$0)));
   }

   public static erw.a c() {
      return erw.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akq<erw>, erw.a> $$0) {
      this.d();
      Set<akq<erw>> $$1 = new HashSet<>();

      for (dfy $$2 : lt.e) {
         if ($$2.a(this.d)) {
            akq<erw> $$3 = $$2.v();
            if ($$3 != ern.a && $$1.add($$3)) {
               erw.a $$4 = this.e.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lt.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.e.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.e.keySet());
      }
   }

   protected void b(dfy $$0, dfy $$1) {
      jo.b<dac> $$2 = this.b.b(lu.aL);
      erw.a $$3 = this.c($$0, ese.a($$0).a(eur.a($$2.b(dah.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected erw.a q(dfy $$0) {
      return this.a($$0, die.f, dty.b);
   }

   protected void r(dfy $$0) {
      this.a($$0, $$0x -> this.d((dcv)((djb)$$0x).b()));
   }

   protected void c(dfy $$0, dfy $$1) {
      this.a($$0, this.c((dcv)$$1));
   }

   protected void c(dfy $$0, dcv $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfy $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfy $$0) {
      this.c($$0, (dcv)$$0);
   }

   protected void a(dfy $$0, Function<dfy, erw.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfy $$0, erw.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
