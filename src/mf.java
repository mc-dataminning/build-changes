import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mf implements mi {
   protected static final erq.a a = erx.a(ch.a.a().a(cj.b, cf.a(List.of(new bm(cyj.v, ct.d.b(1))))));
   protected static final erq.a b = a.invert();
   protected static final erq.a c = erx.a(ch.a.a().a(ctc.rV));
   private static final erq.a h = c.or(a);
   private static final erq.a i = h.invert();
   protected final Set<csu> d;
   protected final cnu e;
   protected final Map<akg<eoq>, eoq.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mf(Set<csu> $$0, cnu $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mf(Set<csu> $$0, cnu $$1, Map<akg<eoq>, eoq.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ept<T>> T a(dac $$0, ept<T> $$1) {
      return !this.d.contains($$0.q()) ? $$1.b(epj.c()) : $$1.c();
   }

   protected <T extends erj<T>> T a(dac $$0, erj<T> $$1) {
      return !this.d.contains($$0.q()) ? $$1.b(erm.c()) : $$1.d();
   }

   public eoq.a a(dac $$0) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0))));
   }

   private static eoq.a a(dde $$0, erq.a $$1, epb.a<?> $$2) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a($$1).a($$2)));
   }

   protected static eoq.a a(dde $$0, epb.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eoq.a b(dde $$0, epb.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eoq.a c(dde $$0, epb.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eoq.a a(dde $$0, dac $$1) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a($$1)));
   }

   protected eoq.a a(dac $$0, esl $$1) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a((epb.a<?>)this.a($$0, eoy.a($$0).a(eqn.a($$1)))));
   }

   protected eoq.a a(dde $$0, dac $$1, esl $$2) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a($$1).a(eqn.a($$2))));
   }

   private static eoq.a c(dac $$0) {
      return eoq.b().a(eop.a().a(a).a(esj.a(1.0F)).a(eoy.a($$0)));
   }

   private eoq.a d(dac $$0) {
      return eoq.b().a(this.a(ddg.fR, eop.a().a(esj.a(1.0F)).a(eoy.a(ddg.fR)))).a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0))));
   }

   protected eoq.a a(dde $$0) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a((epb.a<?>)this.a((dac)$$0, eoy.a($$0).a(eqn.a(esj.a(2.0F)).a(erp.a($$0).a(dk.a.a().a(dkh.b, drp.c)))))));
   }

   protected <T extends Comparable<T> & ayt> eoq.a a(dde $$0, drk<T> $$1, T $$2) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a(erp.a($$0).a(dk.a.a().a($$1, $$2))))));
   }

   protected eoq.a b(dde $$0) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a(epl.a(epl.b.a).a(ka.f)))));
   }

   protected eoq.a c(dde $$0) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a(epl.a(epl.b.a).a(ka.f).a(ka.X).a(ka.aa).a(ka.ab)))));
   }

   protected eoq.a d(dde $$0) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a(ctc.oF).a(eqn.a(esp.a(2.0F, 5.0F))).a(epi.a(cyj.x))));
   }

   protected eoq.a e(dde $$0) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a(ctc.oA).a(eqn.a(esp.a(4.0F, 9.0F))).a(epi.a(cyj.x))));
   }

   protected eoq.a f(dde $$0) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a(ctc.lH).a(eqn.a(esp.a(4.0F, 5.0F))).a(epi.b(cyj.x))));
   }

   protected eoq.a g(dde $$0) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a(epl.a(epl.b.a).a(ka.f).a(ka.U)))));
   }

   protected static eoq.a h(dde $$0) {
      return eoq.b().a(eop.a().a(a).a(esj.a(1.0F)).a(eoy.a($$0).a(epl.a(epl.b.a).a(ka.Z)).a(epk.a($$0).a(dcy.c))));
   }

   protected static eoq.a i(dde $$0) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a(eoy.a($$0).a(a).a(epl.a(epl.b.a).a(ka.Z)).a(epk.a($$0).a(dcy.c)).a(eoy.a($$0))));
   }

   protected static eoq.a j(dde $$0) {
      return eoq.b().a(eop.a().a(eoy.a(ctc.ws)).a(erp.a($$0).a(dk.a.a().a(dea.r_, true))));
   }

   protected eoq.a a(dde $$0, csu $$1) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a($$1).a(epi.a(cyj.x))));
   }

   protected eoq.a b(dde $$0, dac $$1) {
      return a($$0, (epb.a<?>)this.a((dac)$$0, eoy.a($$1).a(eqn.a(esp.a(-6.0F, 2.0F))).a(epu.a(eok.b(0)))));
   }

   protected eoq.a k(dde $$0) {
      return b($$0, (epb.a<?>)this.a((dac)$$0, eoy.a(ctc.pv).a(erv.a(0.125F)).a(epi.a(cyj.x, 2))));
   }

   public eoq.a b(dde $$0, csu $$1) {
      return eoq.b()
         .a(
            this.a(
               $$0,
               eop.a()
                  .a(esj.a(1.0F))
                  .a(eoy.a($$1).a(dla.c.a(), $$1x -> eqn.a(esi.a(3, (float)($$1x + 1) / 15.0F)).a(erp.a($$0).a(dk.a.a().a(dla.c, $$1x.intValue())))))
            )
         );
   }

   public eoq.a c(dde $$0, csu $$1) {
      return eoq.b().a(this.a($$0, eop.a().a(esj.a(1.0F)).a(eoy.a($$1).a(eqn.a(esi.a(3, 0.53333336F))))));
   }

   protected static eoq.a b(dac $$0) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a(c).a(eoy.a($$0)));
   }

   protected eoq.a a(dde $$0, erq.a $$1) {
      return eoq.b()
         .a(
            eop.a()
               .a(
                  (epb.a<?>)this.a(
                     (dac)$$0,
                     eoy.a($$0)
                        .a($$1)
                        .a(is.values(), $$1x -> eqn.a(esj.a(1.0F), true).a(erp.a($$0).a(dk.a.a().a(die.b($$1x), true))))
                        .a(eqn.a(esj.a(-1.0F), true))
                  )
               )
         );
   }

   protected eoq.a a(dde $$0, dde $$1, float... $$2) {
      return c($$0, ((epd.a)this.a((dac)$$0, eoy.a($$1))).a(erg.a(cyj.x, $$2)))
         .a(eop.a().a(esj.a(1.0F)).a(i).a(((epd.a)this.a((dac)$$0, eoy.a(ctc.pp).a(eqn.a(esp.a(1.0F, 2.0F))))).a(erg.a(cyj.x, j))));
   }

   protected eoq.a b(dde $$0, dde $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eop.a().a(esj.a(1.0F)).a(i).a(((epd.a)this.a((dac)$$0, eoy.a(ctc.ot))).a(erg.a(cyj.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eoq.a l(dde $$0) {
      return c($$0, ((epd.a)this.a((dac)ddg.aL, eoy.a(ctc.pp).a(eqn.a(esp.a(1.0F, 2.0F))))).a(erg.a(cyj.x, j)));
   }

   protected eoq.a a(dde $$0, csu $$1, csu $$2, erq.a $$3) {
      return this.a((dac)$$0, eoq.b().a(eop.a().a(eoy.a($$1).a($$3).a(eoy.a($$2)))).a(eop.a().a($$3).a(eoy.a($$2).a(epi.a(cyj.x, 0.5714286F, 3)))));
   }

   protected static eoq.a m(dde $$0) {
      return eoq.b().a(eop.a().a(c).a(eoy.a($$0).a(eqn.a(esj.a(2.0F)))));
   }

   protected eoq.a a(dde $$0, dde $$1) {
      epb.a<?> $$2 = eoy.a($$1).a(eqn.a(esj.a(2.0F))).a(c).a(((epd.a)this.a((dac)$$0, eoy.a(ctc.pv))).a(erv.a(0.125F)));
      return eoq.b()
         .a(eop.a().a($$2).a(erp.a($$0).a(dk.a.a().a(dfm.b, drd.b))).a(ero.a(cr.a.a().a(av.a.a().a($$0).a(dk.a.a().a(dfm.b, drd.a))), new in(0, 1, 0))))
         .a(eop.a().a($$2).a(erp.a($$0).a(dk.a.a().a(dfm.b, drd.a))).a(ero.a(cr.a.a().a(av.a.a().a($$0).a(dk.a.a().a(dfm.b, drd.b))), new in(0, -1, 0))));
   }

   protected eoq.a n(dde $$0) {
      return eoq.b()
         .a(
            eop.a()
               .a(esj.a(1.0F))
               .a(
                  (epb.a<?>)this.a(
                     $$0, eoy.a($$0).a(List.of(2, 3, 4), $$1 -> eqn.a(esj.a((float)$$1.intValue())).a(erp.a($$0).a(dk.a.a().a(ddt.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eoq.a o(dde $$0) {
      return eoq.b()
         .a(
            eop.a()
               .a(esj.a(1.0F))
               .a(
                  (epb.a<?>)this.a(
                     $$0,
                     eoy.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eqn.a(esj.a((float)$$1.intValue())).a(erp.a($$0).a(dk.a.a().a(dir.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eoq.a p(dde $$0) {
      return eoq.b().a(eop.a().a(esj.a(1.0F)).a(eoy.a($$0)));
   }

   public static eoq.a a() {
      return eoq.b();
   }

   protected abstract void b();

   @Override
   public void generate(iy.a $$0, BiConsumer<akg<eoq>, eoq.a> $$1) {
      this.b();
      Set<akg<eoq>> $$2 = new HashSet<>();

      for (dde $$3 : ld.e) {
         if ($$3.a(this.e)) {
            akg<eoq> $$4 = $$3.v();
            if ($$4 != eoj.a && $$2.add($$4)) {
               eoq.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.a(), ld.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dde $$0, dde $$1) {
      eoq.a $$2 = c($$0, eoy.a($$0).a(erg.a(cyj.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eoq.a q(dde $$0) {
      return this.a($$0, dfk.f, drd.b);
   }

   protected void r(dde $$0) {
      this.a($$0, $$0x -> this.d((dac)((dgh)$$0x).b()));
   }

   protected void c(dde $$0, dde $$1) {
      this.a($$0, c((dac)$$1));
   }

   protected void c(dde $$0, dac $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dde $$0) {
      this.c($$0, $$0);
   }

   protected void t(dde $$0) {
      this.c($$0, (dac)$$0);
   }

   protected void a(dde $$0, Function<dde, eoq.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dde $$0, eoq.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
