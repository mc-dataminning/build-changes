import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mt implements mw {
   protected static final euw.a a = evd.a(cs.a.a().a(cur.rV));
   protected final jo.a b;
   protected final Set<cuj> c;
   protected final cpj d;
   protected final Map<akp<erq>, erq.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected euw.a a() {
      jo.b<daa> $$0 = this.b.b(lu.aL);
      return evd.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(daf.v), dh.d.b(1))))));
   }

   protected euw.a b() {
      return this.a().invert();
   }

   private euw.a e() {
      return a.or(this.a());
   }

   private euw.a f() {
      return this.e().invert();
   }

   protected mt(Set<cuj> $$0, cpj $$1, jo.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mt(Set<cuj> $$0, cpj $$1, Map<akp<erq>, erq.a> $$2, jo.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends esv<T>> T a(dct $$0, esv<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(esj.c()) : $$1.c();
   }

   protected <T extends euo<T>> T a(dct $$0, euo<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(eus.c()) : $$1.d();
   }

   public erq.a a(dct $$0) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0))));
   }

   private static erq.a a(dfw $$0, euw.a $$1, esb.a<?> $$2) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a(ery.a($$0).a($$1).a($$2)));
   }

   protected erq.a a(dfw $$0, esb.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected erq.a b(dfw $$0, esb.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected erq.a c(dfw $$0, esb.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected erq.a a(dfw $$0, dct $$1) {
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a($$1)));
   }

   protected erq.a a(dct $$0, evs $$1) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a((esb.a<?>)this.a($$0, ery.a($$0).a(etq.a($$1)))));
   }

   protected erq.a a(dfw $$0, dct $$1, evs $$2) {
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a($$1).a(etq.a($$2))));
   }

   private erq.a c(dct $$0) {
      return erq.b().a(erp.a().a(this.a()).a(evp.a(1.0F)).a(ery.a($$0)));
   }

   private erq.a d(dct $$0) {
      return erq.b().a(this.a(dfy.fR, erp.a().a(evp.a(1.0F)).a(ery.a(dfy.fR)))).a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0))));
   }

   protected erq.a a(dfw $$0) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a((esb.a<?>)this.a((dct)$$0, ery.a($$0).a(etq.a(evp.a(2.0F)).a(euv.a($$0).a(eb.a.a().a(dna.b, dui.c)))))));
   }

   protected <T extends Comparable<T> & azj> erq.a a(dfw $$0, dud<T> $$1, T $$2) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0).a(euv.a($$0).a(eb.a.a().a($$1, $$2))))));
   }

   protected erq.a b(dfw $$0) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0).a(esl.a(esl.b.a).a(kq.g)))));
   }

   protected erq.a c(dfw $$0) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0).a(esl.a(esl.b.a).a(kq.g).a(kq.ab).a(kq.ae).a(kq.af)))));
   }

   protected erq.a d(dfw $$0) {
      jo.b<daa> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a(cur.oG).a(etq.a(evw.a(2.0F, 5.0F))).a(esi.a($$1.b(daf.x)))));
   }

   protected erq.a e(dfw $$0) {
      jo.b<daa> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a(cur.oB).a(etq.a(evw.a(4.0F, 9.0F))).a(esi.a($$1.b(daf.x)))));
   }

   protected erq.a f(dfw $$0) {
      jo.b<daa> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a(cur.lH).a(etq.a(evw.a(4.0F, 5.0F))).a(esi.b($$1.b(daf.x)))));
   }

   protected erq.a g(dfw $$0) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$0).a(esl.a(esl.b.a).a(kq.g).a(kq.h).a(kq.p).a(kq.Y)))));
   }

   protected erq.a h(dfw $$0) {
      return erq.b().a(erp.a().a(this.a()).a(evp.a(1.0F)).a(ery.a($$0).a(esl.a(esl.b.a).a(kq.ad)).a(esk.a($$0).a(dfq.c))));
   }

   protected erq.a i(dfw $$0) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a(ery.a($$0).a(this.a()).a(esl.a(esl.b.a).a(kq.ad)).a(esk.a($$0).a(dfq.c)).a(ery.a($$0))));
   }

   protected erq.a j(dfw $$0) {
      return erq.b().a(erp.a().a(ery.a(cur.wv)).a(euv.a($$0).a(eb.a.a().a(dgs.r_, true))));
   }

   protected erq.a a(dfw $$0, cuj $$1) {
      jo.b<daa> $$2 = this.b.b(lu.aL);
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a($$1).a(esi.a($$2.b(daf.x)))));
   }

   protected erq.a b(dfw $$0, dct $$1) {
      return this.a($$0, (esb.a<?>)this.a((dct)$$0, ery.a($$1).a(etq.a(evw.a(-6.0F, 2.0F))).a(esw.a(erk.b(0)))));
   }

   protected erq.a k(dfw $$0) {
      jo.b<daa> $$1 = this.b.b(lu.aL);
      return this.b($$0, (esb.a<?>)this.a((dct)$$0, ery.a(cur.pv).a(evb.a(0.125F)).a(esi.a($$1.b(daf.x), 2))));
   }

   public erq.a b(dfw $$0, cuj $$1) {
      return erq.b()
         .a(
            this.a(
               $$0,
               erp.a()
                  .a(evp.a(1.0F))
                  .a(ery.a($$1).a(dnt.c.a(), $$1x -> etq.a(evo.a(3, (float)($$1x + 1) / 15.0F)).a(euv.a($$0).a(eb.a.a().a(dnt.c, $$1x.intValue())))))
            )
         );
   }

   public erq.a c(dfw $$0, cuj $$1) {
      return erq.b().a(this.a($$0, erp.a().a(evp.a(1.0F)).a(ery.a($$1).a(etq.a(evo.a(3, 0.53333336F))))));
   }

   protected static erq.a b(dct $$0) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a(a).a(ery.a($$0)));
   }

   protected erq.a a(dfw $$0, euw.a $$1) {
      return erq.b()
         .a(
            erp.a()
               .a(
                  (esb.a<?>)this.a(
                     (dct)$$0,
                     ery.a($$0)
                        .a($$1)
                        .a(ji.values(), $$1x -> etq.a(evp.a(1.0F), true).a(euv.a($$0).a(eb.a.a().a(dkw.b($$1x), true))))
                        .a(etq.a(evp.a(-1.0F), true))
                  )
               )
         );
   }

   protected erq.a a(dfw $$0, dfw $$1, float... $$2) {
      jo.b<daa> $$3 = this.b.b(lu.aL);
      return this.c($$0, ((esd.a)this.a((dct)$$0, ery.a($$1))).a(eul.a($$3.b(daf.x), $$2)))
         .a(erp.a().a(evp.a(1.0F)).a(this.f()).a(((esd.a)this.a((dct)$$0, ery.a(cur.pq).a(etq.a(evw.a(1.0F, 2.0F))))).a(eul.a($$3.b(daf.x), g))));
   }

   protected erq.a b(dfw $$0, dfw $$1, float... $$2) {
      jo.b<daa> $$3 = this.b.b(lu.aL);
      return this.a($$0, $$1, $$2)
         .a(
            erp.a()
               .a(evp.a(1.0F))
               .a(this.f())
               .a(((esd.a)this.a((dct)$$0, ery.a(cur.ou))).a(eul.a($$3.b(daf.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected erq.a l(dfw $$0) {
      jo.b<daa> $$1 = this.b.b(lu.aL);
      return this.c($$0, ((esd.a)this.a((dct)dfy.aL, ery.a(cur.pq).a(etq.a(evw.a(1.0F, 2.0F))))).a(eul.a($$1.b(daf.x), g)));
   }

   protected erq.a a(dfw $$0, cuj $$1, cuj $$2, euw.a $$3) {
      jo.b<daa> $$4 = this.b.b(lu.aL);
      return this.a((dct)$$0, erq.b().a(erp.a().a(ery.a($$1).a($$3).a(ery.a($$2)))).a(erp.a().a($$3).a(ery.a($$2).a(esi.a($$4.b(daf.x), 0.5714286F, 3)))));
   }

   protected erq.a m(dfw $$0) {
      return erq.b().a(erp.a().a(a).a(ery.a($$0).a(etq.a(evp.a(2.0F)))));
   }

   protected erq.a a(dfw $$0, dfw $$1) {
      esb.a<?> $$2 = ery.a($$1).a(etq.a(evp.a(2.0F))).a(a).a(((esd.a)this.a((dct)$$0, ery.a(cur.pv))).a(evb.a(0.125F)));
      return erq.b()
         .a(erp.a().a($$2).a(euv.a($$0).a(eb.a.a().a(die.b, dtw.b))).a(euu.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(die.b, dtw.a))), new jd(0, 1, 0))))
         .a(erp.a().a($$2).a(euv.a($$0).a(eb.a.a().a(die.b, dtw.a))).a(euu.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(die.b, dtw.b))), new jd(0, -1, 0))));
   }

   protected erq.a n(dfw $$0) {
      return erq.b()
         .a(
            erp.a()
               .a(evp.a(1.0F))
               .a(
                  (esb.a<?>)this.a(
                     $$0, ery.a($$0).a(List.of(2, 3, 4), $$1 -> etq.a(evp.a((float)$$1.intValue())).a(euv.a($$0).a(eb.a.a().a(dgl.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected erq.a o(dfw $$0) {
      return erq.b()
         .a(
            erp.a()
               .a(evp.a(1.0F))
               .a(
                  (esb.a<?>)this.a(
                     $$0,
                     ery.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> etq.a(evp.a((float)$$1.intValue())).a(euv.a($$0).a(eb.a.a().a(dlj.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static erq.a p(dfw $$0) {
      return erq.b().a(erp.a().a(evp.a(1.0F)).a(ery.a($$0)));
   }

   public static erq.a c() {
      return erq.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akp<erq>, erq.a> $$0) {
      this.d();
      Set<akp<erq>> $$1 = new HashSet<>();

      for (dfw $$2 : lt.e) {
         if ($$2.a(this.d)) {
            akp<erq> $$3 = $$2.v();
            if ($$3 != erh.a && $$1.add($$3)) {
               erq.a $$4 = this.e.remove($$3);
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

   protected void b(dfw $$0, dfw $$1) {
      jo.b<daa> $$2 = this.b.b(lu.aL);
      erq.a $$3 = this.c($$0, ery.a($$0).a(eul.a($$2.b(daf.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected erq.a q(dfw $$0) {
      return this.a($$0, dic.f, dtw.b);
   }

   protected void r(dfw $$0) {
      this.a($$0, $$0x -> this.d((dct)((diz)$$0x).b()));
   }

   protected void c(dfw $$0, dfw $$1) {
      this.a($$0, this.c((dct)$$1));
   }

   protected void c(dfw $$0, dct $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfw $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfw $$0) {
      this.c($$0, (dct)$$0);
   }

   protected void a(dfw $$0, Function<dfw, erq.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfw $$0, erq.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
