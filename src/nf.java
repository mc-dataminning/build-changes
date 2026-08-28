import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nf implements ni {
   protected final ju.a a;
   protected final Set<cxu> b;
   protected final cte c;
   protected final Map<alc<exq>, exq.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fau.a a() {
      ju.b<deh> $$0 = this.a.e(me.aS);
      return fbb.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(dem.v), dk.d.b(1))))));
   }

   protected fau.a b() {
      return this.a().invert();
   }

   protected fau.a c() {
      return fbb.a(cv.a.a().a(this.a.e(me.K), cyc.sW));
   }

   private fau.a f() {
      return this.c().or(this.a());
   }

   private fau.a g() {
      return this.f().invert();
   }

   protected nf(Set<cxu> $$0, cte $$1, ju.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nf(Set<cxu> $$0, cte $$1, Map<alc<exq>, exq.a> $$2, ju.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends eyv<T>> T a(dho $$0, eyv<T> $$1) {
      return !this.b.contains($$0.i()) ? $$1.b(eyj.c()) : $$1.c();
   }

   protected <T extends fam<T>> T a(dho $$0, fam<T> $$1) {
      return !this.b.contains($$0.i()) ? $$1.b(faq.c()) : $$1.d();
   }

   public exq.a a(dho $$0) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0))));
   }

   private static exq.a a(dku $$0, fau.a $$1, eyb.a<?> $$2) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a($$1).a($$2)));
   }

   protected exq.a a(dku $$0, eyb.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected exq.a b(dku $$0, eyb.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected exq.a c(dku $$0, eyb.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected exq.a a(dku $$0, dho $$1) {
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a($$1)));
   }

   protected exq.a a(dho $$0, fbq $$1) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a((eyb.a<?>)this.a($$0, exy.a($$0).a(ezq.a($$1)))));
   }

   protected exq.a a(dku $$0, dho $$1, fbq $$2) {
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a($$1).a(ezq.a($$2))));
   }

   private exq.a d(dho $$0) {
      return exq.b().a(exp.a().a(this.a()).a(fbn.a(1.0F)).a(exy.a($$0)));
   }

   private exq.a e(dho $$0) {
      return exq.b().a(this.a(dkw.gm, exp.a().a(fbn.a(1.0F)).a(exy.a(dkw.gm)))).a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0))));
   }

   protected exq.a a(dku $$0) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a((eyb.a<?>)this.a((dho)$$0, exy.a($$0).a(ezq.a(fbn.a(2.0F)).a(fat.a($$0).a(ef.a.a().a(dsd.b, dzu.c)))))));
   }

   protected <T extends Comparable<T> & bag> exq.a a(dku $$0, dzp<T> $$1, T $$2) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a(fat.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected exq.a b(dku $$0) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a(eyl.a(eyl.b.a).a(kx.g)))));
   }

   protected exq.a c(dku $$0) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a(eyl.a(eyl.b.a).a(kx.g).a(kx.an).a(kx.aq).a(kx.ar)))));
   }

   protected exq.a d(dku $$0) {
      ju.b<deh> $$1 = this.a.e(me.aS);
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a(cyc.pp).a(ezq.a(fbu.a(2.0F, 5.0F))).a(eyi.a($$1.b(dem.x)))));
   }

   protected exq.a e(dku $$0) {
      ju.b<deh> $$1 = this.a.e(me.aS);
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a(cyc.pk).a(ezq.a(fbu.a(4.0F, 9.0F))).a(eyi.a($$1.b(dem.x)))));
   }

   protected exq.a f(dku $$0) {
      ju.b<deh> $$1 = this.a.e(me.aS);
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a(cyc.mg).a(ezq.a(fbu.a(4.0F, 5.0F))).a(eyi.b($$1.b(dem.x)))));
   }

   protected exq.a g(dku $$0) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a(eyl.a(eyl.b.a).a(kx.g).a(kx.h).a(kx.q).a(kx.ak).a(kx.k)))));
   }

   protected exq.a h(dku $$0) {
      return exq.b().a(exp.a().a(this.a()).a(fbn.a(1.0F)).a(exy.a($$0).a(eyl.a(eyl.b.a).a(kx.ap)).a(eyk.a($$0).a(dko.c))));
   }

   protected exq.a i(dku $$0) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a(exy.a($$0).a(this.a()).a(eyl.a(eyl.b.a).a(kx.ap)).a(eyk.a($$0).a(dko.c)).a(exy.a($$0))));
   }

   protected exq.a j(dku $$0) {
      return exq.b().a(exp.a().a(exy.a(cyc.xA)).a(fat.a($$0).a(ef.a.a().a(dlr.t_, true))));
   }

   protected exq.a a(dku $$0, cxu $$1) {
      ju.b<deh> $$2 = this.a.e(me.aS);
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a($$1).a(eyi.a($$2.b(dem.x)))));
   }

   protected exq.a b(dku $$0, dho $$1) {
      return this.a($$0, (eyb.a<?>)this.a((dho)$$0, exy.a($$1).a(ezq.a(fbu.a(-6.0F, 2.0F))).a(eyw.a(exk.b(0)))));
   }

   protected exq.a k(dku $$0) {
      ju.b<deh> $$1 = this.a.e(me.aS);
      return this.b($$0, (eyb.a<?>)this.a((dho)$$0, exy.a(cyc.qe).a(faz.a(0.125F)).a(eyi.a($$1.b(dem.x), 2))));
   }

   public exq.a b(dku $$0, cxu $$1) {
      return exq.b()
         .a(
            this.a(
               $$0,
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(exy.a($$1).a(dsw.c.a(), $$1x -> ezq.a(fbm.a(3, (float)($$1x + 1) / 15.0F)).a(fat.a($$0).a(ef.a.a().a(dsw.c, $$1x.intValue())))))
            )
         );
   }

   public exq.a c(dku $$0, cxu $$1) {
      return exq.b().a(this.a($$0, exp.a().a(fbn.a(1.0F)).a(exy.a($$1).a(ezq.a(fbm.a(3, 0.53333336F))))));
   }

   protected exq.a b(dho $$0) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a(this.c()).a(exy.a($$0)));
   }

   protected exq.a c(dho $$0) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a(this.f()).a(exy.a($$0)));
   }

   protected exq.a a(dku $$0, fau.a $$1) {
      return exq.b()
         .a(
            exp.a()
               .a(
                  (eyb.a<?>)this.a(
                     (dho)$$0,
                     exy.a($$0)
                        .a($$1)
                        .a(jo.values(), $$1x -> ezq.a(fbn.a(1.0F), true).a(fat.a($$0).a(ef.a.a().a(dpy.b($$1x), true))))
                        .a(ezq.a(fbn.a(-1.0F), true))
                  )
               )
         );
   }

   protected exq.a l(dku $$0) {
      return exq.b()
         .a(
            exp.a()
               .a(
                  (eyb.a<?>)this.a(
                     (dho)$$0,
                     exy.a($$0).a(jo.values(), $$1 -> ezq.a(fbn.a(1.0F), true).a(fat.a($$0).a(ef.a.a().a(dpy.b($$1), true)))).a(ezq.a(fbn.a(-1.0F), true))
                  )
               )
         );
   }

   protected exq.a m(dku $$0) {
      return exq.b().a(exp.a().a((eyb.a<?>)this.a($$0, exy.a($$0).a(fat.a($$0).a(ef.a.a().a(dpw.b, true))))));
   }

   protected exq.a a(dku $$0, dku $$1, float... $$2) {
      ju.b<deh> $$3 = this.a.e(me.aS);
      return this.c($$0, ((eyd.a)this.a((dho)$$0, exy.a($$1))).a(faj.a($$3.b(dem.x), $$2)))
         .a(exp.a().a(fbn.a(1.0F)).a(this.g()).a(((eyd.a)this.a((dho)$$0, exy.a(cyc.pZ).a(ezq.a(fbu.a(1.0F, 2.0F))))).a(faj.a($$3.b(dem.x), f))));
   }

   protected exq.a b(dku $$0, dku $$1, float... $$2) {
      ju.b<deh> $$3 = this.a.e(me.aS);
      return this.a($$0, $$1, $$2)
         .a(
            exp.a()
               .a(fbn.a(1.0F))
               .a(this.g())
               .a(((eyd.a)this.a((dho)$$0, exy.a(cyc.pd))).a(faj.a($$3.b(dem.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected exq.a n(dku $$0) {
      ju.b<deh> $$1 = this.a.e(me.aS);
      return this.c($$0, ((eyd.a)this.a((dho)dkw.aS, exy.a(cyc.pZ).a(ezq.a(fbu.a(1.0F, 2.0F))))).a(faj.a($$1.b(dem.x), f)));
   }

   protected exq.a a(dku $$0, cxu $$1, cxu $$2, fau.a $$3) {
      ju.b<deh> $$4 = this.a.e(me.aS);
      return this.a((dho)$$0, exq.b().a(exp.a().a(exy.a($$1).a($$3).a(exy.a($$2)))).a(exp.a().a($$3).a(exy.a($$2).a(eyi.a($$4.b(dem.x), 0.5714286F, 3)))));
   }

   protected exq.a o(dku $$0) {
      return exq.b().a(exp.a().a(this.c()).a(exy.a($$0).a(ezq.a(fbn.a(2.0F)))));
   }

   protected exq.a a(dku $$0, dku $$1) {
      ju.b<dku> $$2 = this.a.e(me.f);
      eyb.a<?> $$3 = exy.a($$1).a(ezq.a(fbn.a(2.0F))).a(this.c()).a(((eyd.a)this.a((dho)$$0, exy.a(cyc.qe))).a(faz.a(0.125F)));
      return exq.b()
         .a(exp.a().a($$3).a(fat.a($$0).a(ef.a.a().a(dnd.b, dzi.b))).a(fas.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dnd.b, dzi.a))), new jj(0, 1, 0))))
         .a(exp.a().a($$3).a(fat.a($$0).a(ef.a.a().a(dnd.b, dzi.a))).a(fas.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dnd.b, dzi.b))), new jj(0, -1, 0))));
   }

   protected exq.a p(dku $$0) {
      return exq.b()
         .a(
            exp.a()
               .a(fbn.a(1.0F))
               .a(
                  (eyb.a<?>)this.a(
                     $$0, exy.a($$0).a(List.of(2, 3, 4), $$1 -> ezq.a(fbn.a((float)$$1.intValue())).a(fat.a($$0).a(ef.a.a().a(dlk.f, $$1.intValue()))))
                  )
               )
         );
   }

   public exq.a q(dku $$0) {
      return $$0 instanceof dry $$1
         ? exq.b()
            .a(
               exp.a()
                  .a(fbn.a(1.0F))
                  .a(
                     (eyb.a<?>)this.a(
                        $$0,
                        exy.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> ezq.a(fbn.a((float)$$2.intValue())).a(fat.a($$0).a(ef.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static exq.a r(dku $$0) {
      return exq.b().a(exp.a().a(fbn.a(1.0F)).a(exy.a($$0)));
   }

   public static exq.a d() {
      return exq.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alc<exq>, exq.a> $$0) {
      this.e();
      Set<alc<exq>> $$1 = new HashSet<>();

      for (dku $$2 : md.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alc<exq>)$$3)) {
                  exq.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), md.e.b($$2)));
                  }

                  $$0.accept((alc<exq>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dku $$0, dku $$1) {
      ju.b<deh> $$2 = this.a.e(me.aS);
      exq.a $$3 = this.c($$0, exy.a($$0).a(faj.a($$2.b(dem.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected exq.a s(dku $$0) {
      return this.a($$0, dnb.c, dzi.b);
   }

   protected void t(dku $$0) {
      this.a($$0, $$0x -> this.e((dho)((dnz)$$0x).b()));
   }

   protected void c(dku $$0, dku $$1) {
      this.a($$0, this.d((dho)$$1));
   }

   protected void c(dku $$0, dho $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dku $$0) {
      this.c($$0, $$0);
   }

   protected void v(dku $$0) {
      this.c($$0, (dho)$$0);
   }

   protected void a(dku $$0, Function<dku, exq.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dku $$0, exq.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
