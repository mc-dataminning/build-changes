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
   protected static final euh.a a = euo.a(cp.a.a().a(cug.rV));
   protected final jl.a b;
   protected final Set<cty> c;
   protected final coz d;
   protected final Map<akj<erb>, erb.a> e;
   protected static final float[] f = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] g = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected euh.a a() {
      jl.b<czm> $$0 = this.b.b(lr.aK);
      return euo.a(cp.a.a().a(cr.b, cl.a(List.of(new bp($$0.b(czr.v), de.d.b(1))))));
   }

   protected euh.a b() {
      return this.a().invert();
   }

   private euh.a e() {
      return a.or(this.a());
   }

   private euh.a f() {
      return this.e().invert();
   }

   protected mq(Set<cty> $$0, coz $$1, jl.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mq(Set<cty> $$0, coz $$1, Map<akj<erb>, erb.a> $$2, jl.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.b = $$3;
   }

   protected <T extends esg<T>> T a(dcf $$0, esg<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(eru.c()) : $$1.c();
   }

   protected <T extends etz<T>> T a(dcf $$0, etz<T> $$1) {
      return !this.c.contains($$0.r()) ? $$1.b(eud.c()) : $$1.d();
   }

   public erb.a a(dcf $$0) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0))));
   }

   private static erb.a a(dfi $$0, euh.a $$1, erm.a<?> $$2) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a(erj.a($$0).a($$1).a($$2)));
   }

   protected erb.a a(dfi $$0, erm.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected erb.a b(dfi $$0, erm.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected erb.a c(dfi $$0, erm.a<?> $$1) {
      return a($$0, this.e(), $$1);
   }

   protected erb.a a(dfi $$0, dcf $$1) {
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a($$1)));
   }

   protected erb.a a(dcf $$0, evd $$1) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a((erm.a<?>)this.a($$0, erj.a($$0).a(etb.a($$1)))));
   }

   protected erb.a a(dfi $$0, dcf $$1, evd $$2) {
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a($$1).a(etb.a($$2))));
   }

   private erb.a c(dcf $$0) {
      return erb.b().a(era.a().a(this.a()).a(eva.a(1.0F)).a(erj.a($$0)));
   }

   private erb.a d(dcf $$0) {
      return erb.b().a(this.a(dfk.fR, era.a().a(eva.a(1.0F)).a(erj.a(dfk.fR)))).a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0))));
   }

   protected erb.a a(dfi $$0) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a((erm.a<?>)this.a((dcf)$$0, erj.a($$0).a(etb.a(eva.a(2.0F)).a(eug.a($$0).a(dy.a.a().a(dml.b, dtt.c)))))));
   }

   protected <T extends Comparable<T> & azc> erb.a a(dfi $$0, dto<T> $$1, T $$2) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0).a(eug.a($$0).a(dy.a.a().a($$1, $$2))))));
   }

   protected erb.a b(dfi $$0) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0).a(erw.a(erw.b.a).a(kn.g)))));
   }

   protected erb.a c(dfi $$0) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0).a(erw.a(erw.b.a).a(kn.g).a(kn.aa).a(kn.ad).a(kn.ae)))));
   }

   protected erb.a d(dfi $$0) {
      jl.b<czm> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a(cug.oG).a(etb.a(evh.a(2.0F, 5.0F))).a(ert.a($$1.b(czr.x)))));
   }

   protected erb.a e(dfi $$0) {
      jl.b<czm> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a(cug.oB).a(etb.a(evh.a(4.0F, 9.0F))).a(ert.a($$1.b(czr.x)))));
   }

   protected erb.a f(dfi $$0) {
      jl.b<czm> $$1 = this.b.b(lr.aK);
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a(cug.lH).a(etb.a(evh.a(4.0F, 5.0F))).a(ert.b($$1.b(czr.x)))));
   }

   protected erb.a g(dfi $$0) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$0).a(erw.a(erw.b.a).a(kn.g).a(kn.h).a(kn.p).a(kn.X)))));
   }

   protected erb.a h(dfi $$0) {
      return erb.b().a(era.a().a(this.a()).a(eva.a(1.0F)).a(erj.a($$0).a(erw.a(erw.b.a).a(kn.ac)).a(erv.a($$0).a(dfc.c))));
   }

   protected erb.a i(dfi $$0) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a(erj.a($$0).a(this.a()).a(erw.a(erw.b.a).a(kn.ac)).a(erv.a($$0).a(dfc.c)).a(erj.a($$0))));
   }

   protected erb.a j(dfi $$0) {
      return erb.b().a(era.a().a(erj.a(cug.wv)).a(eug.a($$0).a(dy.a.a().a(dge.r_, true))));
   }

   protected erb.a a(dfi $$0, cty $$1) {
      jl.b<czm> $$2 = this.b.b(lr.aK);
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a($$1).a(ert.a($$2.b(czr.x)))));
   }

   protected erb.a b(dfi $$0, dcf $$1) {
      return this.a($$0, (erm.a<?>)this.a((dcf)$$0, erj.a($$1).a(etb.a(evh.a(-6.0F, 2.0F))).a(esh.a(eqv.b(0)))));
   }

   protected erb.a k(dfi $$0) {
      jl.b<czm> $$1 = this.b.b(lr.aK);
      return this.b($$0, (erm.a<?>)this.a((dcf)$$0, erj.a(cug.pv).a(eum.a(0.125F)).a(ert.a($$1.b(czr.x), 2))));
   }

   public erb.a b(dfi $$0, cty $$1) {
      return erb.b()
         .a(
            this.a(
               $$0,
               era.a()
                  .a(eva.a(1.0F))
                  .a(erj.a($$1).a(dne.c.a(), $$1x -> etb.a(euz.a(3, (float)($$1x + 1) / 15.0F)).a(eug.a($$0).a(dy.a.a().a(dne.c, $$1x.intValue())))))
            )
         );
   }

   public erb.a c(dfi $$0, cty $$1) {
      return erb.b().a(this.a($$0, era.a().a(eva.a(1.0F)).a(erj.a($$1).a(etb.a(euz.a(3, 0.53333336F))))));
   }

   protected static erb.a b(dcf $$0) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a(a).a(erj.a($$0)));
   }

   protected erb.a a(dfi $$0, euh.a $$1) {
      return erb.b()
         .a(
            era.a()
               .a(
                  (erm.a<?>)this.a(
                     (dcf)$$0,
                     erj.a($$0)
                        .a($$1)
                        .a(jf.values(), $$1x -> etb.a(eva.a(1.0F), true).a(eug.a($$0).a(dy.a.a().a(dki.b($$1x), true))))
                        .a(etb.a(eva.a(-1.0F), true))
                  )
               )
         );
   }

   protected erb.a a(dfi $$0, dfi $$1, float... $$2) {
      jl.b<czm> $$3 = this.b.b(lr.aK);
      return this.c($$0, ((ero.a)this.a((dcf)$$0, erj.a($$1))).a(etw.a($$3.b(czr.x), $$2)))
         .a(era.a().a(eva.a(1.0F)).a(this.f()).a(((ero.a)this.a((dcf)$$0, erj.a(cug.pq).a(etb.a(evh.a(1.0F, 2.0F))))).a(etw.a($$3.b(czr.x), g))));
   }

   protected erb.a b(dfi $$0, dfi $$1, float... $$2) {
      jl.b<czm> $$3 = this.b.b(lr.aK);
      return this.a($$0, $$1, $$2)
         .a(
            era.a()
               .a(eva.a(1.0F))
               .a(this.f())
               .a(((ero.a)this.a((dcf)$$0, erj.a(cug.ou))).a(etw.a($$3.b(czr.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected erb.a l(dfi $$0) {
      jl.b<czm> $$1 = this.b.b(lr.aK);
      return this.c($$0, ((ero.a)this.a((dcf)dfk.aL, erj.a(cug.pq).a(etb.a(evh.a(1.0F, 2.0F))))).a(etw.a($$1.b(czr.x), g)));
   }

   protected erb.a a(dfi $$0, cty $$1, cty $$2, euh.a $$3) {
      jl.b<czm> $$4 = this.b.b(lr.aK);
      return this.a((dcf)$$0, erb.b().a(era.a().a(erj.a($$1).a($$3).a(erj.a($$2)))).a(era.a().a($$3).a(erj.a($$2).a(ert.a($$4.b(czr.x), 0.5714286F, 3)))));
   }

   protected erb.a m(dfi $$0) {
      return erb.b().a(era.a().a(a).a(erj.a($$0).a(etb.a(eva.a(2.0F)))));
   }

   protected erb.a a(dfi $$0, dfi $$1) {
      erm.a<?> $$2 = erj.a($$1).a(etb.a(eva.a(2.0F))).a(a).a(((ero.a)this.a((dcf)$$0, erj.a(cug.pv))).a(eum.a(0.125F)));
      return erb.b()
         .a(era.a().a($$2).a(eug.a($$0).a(dy.a.a().a(dhq.b, dth.b))).a(euf.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhq.b, dth.a))), new ja(0, 1, 0))))
         .a(era.a().a($$2).a(eug.a($$0).a(dy.a.a().a(dhq.b, dth.a))).a(euf.a(dc.a.a().a(av.a.a().a($$0).a(dy.a.a().a(dhq.b, dth.b))), new ja(0, -1, 0))));
   }

   protected erb.a n(dfi $$0) {
      return erb.b()
         .a(
            era.a()
               .a(eva.a(1.0F))
               .a(
                  (erm.a<?>)this.a(
                     $$0, erj.a($$0).a(List.of(2, 3, 4), $$1 -> etb.a(eva.a((float)$$1.intValue())).a(eug.a($$0).a(dy.a.a().a(dfx.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected erb.a o(dfi $$0) {
      return erb.b()
         .a(
            era.a()
               .a(eva.a(1.0F))
               .a(
                  (erm.a<?>)this.a(
                     $$0,
                     erj.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> etb.a(eva.a((float)$$1.intValue())).a(eug.a($$0).a(dy.a.a().a(dkv.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static erb.a p(dfi $$0) {
      return erb.b().a(era.a().a(eva.a(1.0F)).a(erj.a($$0)));
   }

   public static erb.a c() {
      return erb.b();
   }

   protected abstract void d();

   @Override
   public void generate(BiConsumer<akj<erb>, erb.a> $$0) {
      this.d();
      Set<akj<erb>> $$1 = new HashSet<>();

      for (dfi $$2 : lq.e) {
         if ($$2.a(this.d)) {
            akj<erb> $$3 = $$2.v();
            if ($$3 != eqs.a && $$1.add($$3)) {
               erb.a $$4 = this.e.remove($$3);
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

   protected void b(dfi $$0, dfi $$1) {
      jl.b<czm> $$2 = this.b.b(lr.aK);
      erb.a $$3 = this.c($$0, erj.a($$0).a(etw.a($$2.b(czr.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected erb.a q(dfi $$0) {
      return this.a($$0, dho.f, dth.b);
   }

   protected void r(dfi $$0) {
      this.a($$0, $$0x -> this.d((dcf)((dil)$$0x).b()));
   }

   protected void c(dfi $$0, dfi $$1) {
      this.a($$0, this.c((dcf)$$1));
   }

   protected void c(dfi $$0, dcf $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfi $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfi $$0) {
      this.c($$0, (dcf)$$0);
   }

   protected void a(dfi $$0, Function<dfi, erb.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfi $$0, erb.a $$1) {
      this.e.put($$0.v(), $$1);
   }
}
