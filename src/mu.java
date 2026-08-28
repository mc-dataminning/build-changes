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
   protected static final eva.a a = evh.a(cs.a.a().a(cut.rV));
   protected final jo.a b;
   protected final Set<cul> c;
   protected final cpl d;
   protected final Map<akq<eru>, eru.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected eva.a a() {
      jo.b<dac> $$0 = this.b.b(lu.aL);
      return evh.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(dah.v), dh.d.b(1))))));
   }

   protected eva.a b() {
      return this.a().invert();
   }

   private eva.a e() {
      return a.or(this.a());
   }

   private eva.a f() {
      return this.e().invert();
   }

   protected mu(Set<cul> $$0, cpl $$1, jo.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mu(Set<cul> $$0, cpl $$1, Map<akq<eru>, eru.a> $$2, jo.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends esz<T>> T a(dcv $$0, esz<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(esn.c()) : $$1.c();
   }

   protected <T extends eus<T>> T a(dcv $$0, eus<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(euw.c()) : $$1.d();
   }

   public eru.a a(dcv $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0))));
   }

   private static eru.a a(dfy $$0, eva.a $$1, esf.a<?> $$2) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a(esc.a($$0).a($$1).a($$2)));
   }

   protected eru.a a(dfy $$0, esf.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eru.a b(dfy $$0, esf.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected eru.a c(dfy $$0, esf.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected eru.a a(dfy $$0, dcv $$1) {
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a($$1)));
   }

   protected eru.a a(dcv $$0, evw $$1) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a((esf.a<?>)this.a($$0, esc.a($$0).a(etu.a($$1)))));
   }

   protected eru.a a(dfy $$0, dcv $$1, evw $$2) {
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a($$1).a(etu.a($$2))));
   }

   private eru.a c(dcv $$0) {
      return eru.b().a(ert.a().a(this.a()).a(evt.a(1.0F)).a(esc.a($$0)));
   }

   private eru.a d(dcv $$0) {
      return eru.b().a(this.a(dga.fR, ert.a().a(evt.a(1.0F)).a(esc.a(dga.fR)))).a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0))));
   }

   protected eru.a a(dfy $$0) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a((esf.a<?>)this.a((dcv)$$0, esc.a($$0).a(etu.a(evt.a(2.0F)).a(euz.a($$0).a(eb.a.a().a(dnc.b, duk.c)))))));
   }

   protected <T extends Comparable<T> & azk> eru.a a(dfy $$0, duf<T> $$1, T $$2) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0).a(euz.a($$0).a(eb.a.a().a($$1, $$2))))));
   }

   protected eru.a b(dfy $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(kq.g)))));
   }

   protected eru.a c(dfy $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(kq.g).a(kq.ab).a(kq.ae).a(kq.af)))));
   }

   protected eru.a d(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a(cut.oG).a(etu.a(ewa.a(2.0F, 5.0F))).a(esm.a($$1.b(dah.x)))));
   }

   protected eru.a e(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a(cut.oB).a(etu.a(ewa.a(4.0F, 9.0F))).a(esm.a($$1.b(dah.x)))));
   }

   protected eru.a f(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a(cut.lH).a(etu.a(ewa.a(4.0F, 5.0F))).a(esm.b($$1.b(dah.x)))));
   }

   protected eru.a g(dfy $$0) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(kq.g).a(kq.h).a(kq.p).a(kq.Y)))));
   }

   protected eru.a h(dfy $$0) {
      return eru.b().a(ert.a().a(this.a()).a(evt.a(1.0F)).a(esc.a($$0).a(esp.a(esp.b.a).a(kq.ad)).a(eso.a($$0).a(dfs.c))));
   }

   protected eru.a i(dfy $$0) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a(esc.a($$0).a(this.a()).a(esp.a(esp.b.a).a(kq.ad)).a(eso.a($$0).a(dfs.c)).a(esc.a($$0))));
   }

   protected eru.a j(dfy $$0) {
      return eru.b().a(ert.a().a(esc.a(cut.wv)).a(euz.a($$0).a(eb.a.a().a(dgu.s_, true))));
   }

   protected eru.a a(dfy $$0, cul $$1) {
      jo.b<dac> $$2 = this.b.b(lu.aL);
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a($$1).a(esm.a($$2.b(dah.x)))));
   }

   protected eru.a b(dfy $$0, dcv $$1) {
      return this.a($$0, (esf.a<?>)this.a((dcv)$$0, esc.a($$1).a(etu.a(ewa.a(-6.0F, 2.0F))).a(eta.a(ero.b(0)))));
   }

   protected eru.a k(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.b($$0, (esf.a<?>)this.a((dcv)$$0, esc.a(cut.pv).a(evf.a(0.125F)).a(esm.a($$1.b(dah.x), 2))));
   }

   public eru.a b(dfy $$0, cul $$1) {
      return eru.b()
         .a(
            this.a(
               $$0,
               ert.a()
                  .a(evt.a(1.0F))
                  .a(esc.a($$1).a(dnv.c.a(), $$1x -> etu.a(evs.a(3, (float)($$1x + 1) / 15.0F)).a(euz.a($$0).a(eb.a.a().a(dnv.c, $$1x.intValue())))))
            )
         );
   }

   public eru.a c(dfy $$0, cul $$1) {
      return eru.b().a(this.a($$0, ert.a().a(evt.a(1.0F)).a(esc.a($$1).a(etu.a(evs.a(3, 0.53333336F))))));
   }

   protected static eru.a b(dcv $$0) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a(a).a(esc.a($$0)));
   }

   protected eru.a a(dfy $$0, eva.a $$1) {
      return eru.b()
         .a(
            ert.a()
               .a(
                  (esf.a<?>)this.a(
                     (dcv)$$0,
                     esc.a($$0)
                        .a($$1)
                        .a(ji.values(), $$1x -> etu.a(evt.a(1.0F), true).a(euz.a($$0).a(eb.a.a().a(dky.b($$1x), true))))
                        .a(etu.a(evt.a(-1.0F), true))
                  )
               )
         );
   }

   protected eru.a a(dfy $$0, dfy $$1, float... $$2) {
      jo.b<dac> $$3 = this.b.b(lu.aL);
      return this.c($$0, ((esh.a)this.a((dcv)$$0, esc.a($$1))).a(eup.a($$3.b(dah.x), $$2)))
         .a(ert.a().a(evt.a(1.0F)).a(this.f()).a(((esh.a)this.a((dcv)$$0, esc.a(cut.pq).a(etu.a(ewa.a(1.0F, 2.0F))))).a(eup.a($$3.b(dah.x), g))));
   }

   protected eru.a b(dfy $$0, dfy $$1, float... $$2) {
      jo.b<dac> $$3 = this.b.b(lu.aL);
      return this.a($$0, $$1, $$2)
         .a(
            ert.a()
               .a(evt.a(1.0F))
               .a(this.f())
               .a(((esh.a)this.a((dcv)$$0, esc.a(cut.ou))).a(eup.a($$3.b(dah.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eru.a l(dfy $$0) {
      jo.b<dac> $$1 = this.b.b(lu.aL);
      return this.c($$0, ((esh.a)this.a((dcv)dga.aL, esc.a(cut.pq).a(etu.a(ewa.a(1.0F, 2.0F))))).a(eup.a($$1.b(dah.x), g)));
   }

   protected eru.a a(dfy $$0, cul $$1, cul $$2, eva.a $$3) {
      jo.b<dac> $$4 = this.b.b(lu.aL);
      return this.a((dcv)$$0, eru.b().a(ert.a().a(esc.a($$1).a($$3).a(esc.a($$2)))).a(ert.a().a($$3).a(esc.a($$2).a(esm.a($$4.b(dah.x), 0.5714286F, 3)))));
   }

   protected eru.a m(dfy $$0) {
      return eru.b().a(ert.a().a(a).a(esc.a($$0).a(etu.a(evt.a(2.0F)))));
   }

   protected eru.a a(dfy $$0, dfy $$1) {
      esf.a<?> $$2 = esc.a($$1).a(etu.a(evt.a(2.0F))).a(a).a(((esh.a)this.a((dcv)$$0, esc.a(cut.pv))).a(evf.a(0.125F)));
      return eru.b()
         .a(ert.a().a($$2).a(euz.a($$0).a(eb.a.a().a(dig.b, dty.b))).a(euy.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(dig.b, dty.a))), new jd(0, 1, 0))))
         .a(ert.a().a($$2).a(euz.a($$0).a(eb.a.a().a(dig.b, dty.a))).a(euy.a(df.a.a().a(aw.a.a().a($$0).a(eb.a.a().a(dig.b, dty.b))), new jd(0, -1, 0))));
   }

   protected eru.a n(dfy $$0) {
      return eru.b()
         .a(
            ert.a()
               .a(evt.a(1.0F))
               .a(
                  (esf.a<?>)this.a(
                     $$0, esc.a($$0).a(List.of(2, 3, 4), $$1 -> etu.a(evt.a((float)$$1.intValue())).a(euz.a($$0).a(eb.a.a().a(dgn.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eru.a o(dfy $$0) {
      return eru.b()
         .a(
            ert.a()
               .a(evt.a(1.0F))
               .a(
                  (esf.a<?>)this.a(
                     $$0,
                     esc.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> etu.a(evt.a((float)$$1.intValue())).a(euz.a($$0).a(eb.a.a().a(dll.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eru.a p(dfy $$0) {
      return eru.b().a(ert.a().a(evt.a(1.0F)).a(esc.a($$0)));
   }

   public static eru.a c() {
      return eru.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akq<eru>, eru.a> $$0) {
      this.d();
      Set<akq<eru>> $$1 = new HashSet<>();

      for (dfy $$2 : lt.e) {
         if ($$2.a(this.d)) {
            akq<eru> $$3 = $$2.v();
            if ($$3 != erl.a && $$1.add($$3)) {
               eru.a $$4 = this.e.remove($$3);
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
      eru.a $$3 = this.c($$0, esc.a($$0).a(eup.a($$2.b(dah.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eru.a q(dfy $$0) {
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

   protected void a(dfy $$0, Function<dfy, eru.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfy $$0, eru.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
