import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mg implements mj {
   protected static final esn.a a = esu.a(ch.a.a().a(cj.b, cf.a(List.of(new bm(cze.v, ct.d.b(1))))));
   protected static final esn.a b = a.invert();
   protected static final esn.a c = esu.a(ch.a.a().a(ctt.rV));
   private static final esn.a h = c.or(a);
   private static final esn.a i = h.invert();
   protected final Set<ctl> d;
   protected final col e;
   protected final Map<akm<epm>, epm.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mg(Set<ctl> $$0, col $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mg(Set<ctl> $$0, col $$1, Map<akm<epm>, epm.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eqp<T>> T a(day $$0, eqp<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(eqf.c()) : $$1.c();
   }

   protected <T extends esg<T>> T a(day $$0, esg<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(esj.c()) : $$1.d();
   }

   public epm.a a(day $$0) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0))));
   }

   private static epm.a a(dea $$0, esn.a $$1, epx.a<?> $$2) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a(epu.a($$0).a($$1).a($$2)));
   }

   protected static epm.a a(dea $$0, epx.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static epm.a b(dea $$0, epx.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static epm.a c(dea $$0, epx.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected epm.a a(dea $$0, day $$1) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a($$1)));
   }

   protected epm.a a(day $$0, eti $$1) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a((epx.a<?>)this.a($$0, epu.a($$0).a(erj.a($$1)))));
   }

   protected epm.a a(dea $$0, day $$1, eti $$2) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a($$1).a(erj.a($$2))));
   }

   private static epm.a c(day $$0) {
      return epm.b().a(epl.a().a(a).a(etg.a(1.0F)).a(epu.a($$0)));
   }

   private epm.a d(day $$0) {
      return epm.b().a(this.a(dec.fR, epl.a().a(etg.a(1.0F)).a(epu.a(dec.fR)))).a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0))));
   }

   protected epm.a a(dea $$0) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a((epx.a<?>)this.a((day)$$0, epu.a($$0).a(erj.a(etg.a(2.0F)).a(esm.a($$0).a(dl.a.a().a(dld.b, dsl.c)))))));
   }

   protected <T extends Comparable<T> & ayz> epm.a a(dea $$0, dsg<T> $$1, T $$2) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0).a(esm.a($$0).a(dl.a.a().a($$1, $$2))))));
   }

   protected epm.a b(dea $$0) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0).a(eqh.a(eqh.b.a).a(kb.f)))));
   }

   protected epm.a c(dea $$0) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0).a(eqh.a(eqh.b.a).a(kb.f).a(kb.Z).a(kb.ac).a(kb.ad)))));
   }

   protected epm.a d(dea $$0) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a(ctt.oF).a(erj.a(etm.a(2.0F, 5.0F))).a(eqe.a(cze.x))));
   }

   protected epm.a e(dea $$0) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a(ctt.oA).a(erj.a(etm.a(4.0F, 9.0F))).a(eqe.a(cze.x))));
   }

   protected epm.a f(dea $$0) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a(ctt.lH).a(erj.a(etm.a(4.0F, 5.0F))).a(eqe.b(cze.x))));
   }

   protected epm.a g(dea $$0) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$0).a(eqh.a(eqh.b.a).a(kb.f).a(kb.g).a(kb.o).a(kb.W)))));
   }

   protected static epm.a h(dea $$0) {
      return epm.b().a(epl.a().a(a).a(etg.a(1.0F)).a(epu.a($$0).a(eqh.a(eqh.b.a).a(kb.ab)).a(eqg.a($$0).a(ddu.c))));
   }

   protected static epm.a i(dea $$0) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a(epu.a($$0).a(a).a(eqh.a(eqh.b.a).a(kb.ab)).a(eqg.a($$0).a(ddu.c)).a(epu.a($$0))));
   }

   protected static epm.a j(dea $$0) {
      return epm.b().a(epl.a().a(epu.a(ctt.ws)).a(esm.a($$0).a(dl.a.a().a(dew.r_, true))));
   }

   protected epm.a a(dea $$0, ctl $$1) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a($$1).a(eqe.a(cze.x))));
   }

   protected epm.a b(dea $$0, day $$1) {
      return a($$0, (epx.a<?>)this.a((day)$$0, epu.a($$1).a(erj.a(etm.a(-6.0F, 2.0F))).a(eqq.a(epg.b(0)))));
   }

   protected epm.a k(dea $$0) {
      return b($$0, (epx.a<?>)this.a((day)$$0, epu.a(ctt.pv).a(ess.a(0.125F)).a(eqe.a(cze.x, 2))));
   }

   public epm.a b(dea $$0, ctl $$1) {
      return epm.b()
         .a(
            this.a(
               $$0,
               epl.a()
                  .a(etg.a(1.0F))
                  .a(epu.a($$1).a(dlw.c.a(), $$1x -> erj.a(etf.a(3, (float)($$1x + 1) / 15.0F)).a(esm.a($$0).a(dl.a.a().a(dlw.c, $$1x.intValue())))))
            )
         );
   }

   public epm.a c(dea $$0, ctl $$1) {
      return epm.b().a(this.a($$0, epl.a().a(etg.a(1.0F)).a(epu.a($$1).a(erj.a(etf.a(3, 0.53333336F))))));
   }

   protected static epm.a b(day $$0) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a(c).a(epu.a($$0)));
   }

   protected epm.a a(dea $$0, esn.a $$1) {
      return epm.b()
         .a(
            epl.a()
               .a(
                  (epx.a<?>)this.a(
                     (day)$$0,
                     epu.a($$0)
                        .a($$1)
                        .a(it.values(), $$1x -> erj.a(etg.a(1.0F), true).a(esm.a($$0).a(dl.a.a().a(dja.b($$1x), true))))
                        .a(erj.a(etg.a(-1.0F), true))
                  )
               )
         );
   }

   protected epm.a a(dea $$0, dea $$1, float... $$2) {
      return c($$0, ((epz.a)this.a((day)$$0, epu.a($$1))).a(esd.a(cze.x, $$2)))
         .a(epl.a().a(etg.a(1.0F)).a(i).a(((epz.a)this.a((day)$$0, epu.a(ctt.pp).a(erj.a(etm.a(1.0F, 2.0F))))).a(esd.a(cze.x, j))));
   }

   protected epm.a b(dea $$0, dea $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(epl.a().a(etg.a(1.0F)).a(i).a(((epz.a)this.a((day)$$0, epu.a(ctt.ot))).a(esd.a(cze.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected epm.a l(dea $$0) {
      return c($$0, ((epz.a)this.a((day)dec.aL, epu.a(ctt.pp).a(erj.a(etm.a(1.0F, 2.0F))))).a(esd.a(cze.x, j)));
   }

   protected epm.a a(dea $$0, ctl $$1, ctl $$2, esn.a $$3) {
      return this.a((day)$$0, epm.b().a(epl.a().a(epu.a($$1).a($$3).a(epu.a($$2)))).a(epl.a().a($$3).a(epu.a($$2).a(eqe.a(cze.x, 0.5714286F, 3)))));
   }

   protected static epm.a m(dea $$0) {
      return epm.b().a(epl.a().a(c).a(epu.a($$0).a(erj.a(etg.a(2.0F)))));
   }

   protected epm.a a(dea $$0, dea $$1) {
      epx.a<?> $$2 = epu.a($$1).a(erj.a(etg.a(2.0F))).a(c).a(((epz.a)this.a((day)$$0, epu.a(ctt.pv))).a(ess.a(0.125F)));
      return epm.b()
         .a(epl.a().a($$2).a(esm.a($$0).a(dl.a.a().a(dgi.b, drz.b))).a(esl.a(cr.a.a().a(av.a.a().a($$0).a(dl.a.a().a(dgi.b, drz.a))), new io(0, 1, 0))))
         .a(epl.a().a($$2).a(esm.a($$0).a(dl.a.a().a(dgi.b, drz.a))).a(esl.a(cr.a.a().a(av.a.a().a($$0).a(dl.a.a().a(dgi.b, drz.b))), new io(0, -1, 0))));
   }

   protected epm.a n(dea $$0) {
      return epm.b()
         .a(
            epl.a()
               .a(etg.a(1.0F))
               .a(
                  (epx.a<?>)this.a(
                     $$0, epu.a($$0).a(List.of(2, 3, 4), $$1 -> erj.a(etg.a((float)$$1.intValue())).a(esm.a($$0).a(dl.a.a().a(dep.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected epm.a o(dea $$0) {
      return epm.b()
         .a(
            epl.a()
               .a(etg.a(1.0F))
               .a(
                  (epx.a<?>)this.a(
                     $$0,
                     epu.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> erj.a(etg.a((float)$$1.intValue())).a(esm.a($$0).a(dl.a.a().a(djn.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static epm.a p(dea $$0) {
      return epm.b().a(epl.a().a(etg.a(1.0F)).a(epu.a($$0)));
   }

   public static epm.a a() {
      return epm.b();
   }

   protected abstract void b();

   @Override
   public void generate(iz.a $$0, BiConsumer<akm<epm>, epm.a> $$1) {
      this.b();
      Set<akm<epm>> $$2 = new HashSet<>();

      for (dea $$3 : le.e) {
         if ($$3.a(this.e)) {
            akm<epm> $$4 = $$3.v();
            if ($$4 != epf.a && $$2.add($$4)) {
               epm.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.a(), le.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dea $$0, dea $$1) {
      epm.a $$2 = c($$0, epu.a($$0).a(esd.a(cze.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected epm.a q(dea $$0) {
      return this.a($$0, dgg.f, drz.b);
   }

   protected void r(dea $$0) {
      this.a($$0, $$0x -> this.d((day)((dhd)$$0x).b()));
   }

   protected void c(dea $$0, dea $$1) {
      this.a($$0, c((day)$$1));
   }

   protected void c(dea $$0, day $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dea $$0) {
      this.c($$0, $$0);
   }

   protected void t(dea $$0) {
      this.c($$0, (day)$$0);
   }

   protected void a(dea $$0, Function<dea, epm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dea $$0, epm.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
