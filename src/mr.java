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
   protected static final ett.a a = eua.a(cp.a.a().a(cr.b, cl.a(List.of(new bp(dae.v, de.d.b(1))))));
   protected static final ett.a b = a.invert();
   protected static final ett.a c = eua.a(cp.a.a().a(cut.rV));
   private static final ett.a h = c.or(a);
   private static final ett.a i = h.invert();
   protected final Set<cul> d;
   protected final cpm e;
   protected final Map<ale<eqo>, eqo.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mr(Set<cul> $$0, cpm $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mr(Set<cul> $$0, cpm $$1, Map<ale<eqo>, eqo.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ers<T>> T a(dby $$0, ers<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(erh.c()) : $$1.c();
   }

   protected <T extends etm<T>> T a(dby $$0, etm<T> $$1) {
      return !this.d.contains($$0.r()) ? $$1.b(etp.c()) : $$1.d();
   }

   public eqo.a a(dby $$0) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0))));
   }

   private static eqo.a a(dfa $$0, ett.a $$1, eqz.a<?> $$2) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a($$1).a($$2)));
   }

   protected static eqo.a a(dfa $$0, eqz.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eqo.a b(dfa $$0, eqz.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eqo.a c(dfa $$0, eqz.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eqo.a a(dfa $$0, dby $$1) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a($$1)));
   }

   protected eqo.a a(dby $$0, euo $$1) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a((eqz.a<?>)this.a($$0, eqw.a($$0).a(eso.a($$1)))));
   }

   protected eqo.a a(dfa $$0, dby $$1, euo $$2) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a($$1).a(eso.a($$2))));
   }

   private static eqo.a c(dby $$0) {
      return eqo.b().a(eqn.a().a(a).a(eum.a(1.0F)).a(eqw.a($$0)));
   }

   private eqo.a d(dby $$0) {
      return eqo.b().a(this.a(dfc.fR, eqn.a().a(eum.a(1.0F)).a(eqw.a(dfc.fR)))).a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0))));
   }

   protected eqo.a a(dfa $$0) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a((eqz.a<?>)this.a((dby)$$0, eqw.a($$0).a(eso.a(eum.a(2.0F)).a(ets.a($$0).a(dx.a.a().a(dmd.b, dtl.c)))))));
   }

   protected <T extends Comparable<T> & azu> eqo.a a(dfa $$0, dtg<T> $$1, T $$2) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a(ets.a($$0).a(dx.a.a().a($$1, $$2))))));
   }

   protected eqo.a b(dfa $$0) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a(erj.a(erj.b.a).a(km.g)))));
   }

   protected eqo.a c(dfa $$0) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a(erj.a(erj.b.a).a(km.g).a(km.aa).a(km.ad).a(km.ae)))));
   }

   protected eqo.a d(dfa $$0) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a(cut.oF).a(eso.a(eus.a(2.0F, 5.0F))).a(erg.a(dae.x))));
   }

   protected eqo.a e(dfa $$0) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a(cut.oA).a(eso.a(eus.a(4.0F, 9.0F))).a(erg.a(dae.x))));
   }

   protected eqo.a f(dfa $$0) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a(cut.lH).a(eso.a(eus.a(4.0F, 5.0F))).a(erg.b(dae.x))));
   }

   protected eqo.a g(dfa $$0) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a(erj.a(erj.b.a).a(km.g).a(km.h).a(km.p).a(km.X)))));
   }

   protected static eqo.a h(dfa $$0) {
      return eqo.b().a(eqn.a().a(a).a(eum.a(1.0F)).a(eqw.a($$0).a(erj.a(erj.b.a).a(km.ac)).a(eri.a($$0).a(deu.c))));
   }

   protected static eqo.a i(dfa $$0) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a(eqw.a($$0).a(a).a(erj.a(erj.b.a).a(km.ac)).a(eri.a($$0).a(deu.c)).a(eqw.a($$0))));
   }

   protected static eqo.a j(dfa $$0) {
      return eqo.b().a(eqn.a().a(eqw.a(cut.ws)).a(ets.a($$0).a(dx.a.a().a(dfw.r_, true))));
   }

   protected eqo.a a(dfa $$0, cul $$1) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a($$1).a(erg.a(dae.x))));
   }

   protected eqo.a b(dfa $$0, dby $$1) {
      return a($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a($$1).a(eso.a(eus.a(-6.0F, 2.0F))).a(ert.a(eqi.b(0)))));
   }

   protected eqo.a k(dfa $$0) {
      return b($$0, (eqz.a<?>)this.a((dby)$$0, eqw.a(cut.pv).a(ety.a(0.125F)).a(erg.a(dae.x, 2))));
   }

   public eqo.a b(dfa $$0, cul $$1) {
      return eqo.b()
         .a(
            this.a(
               $$0,
               eqn.a()
                  .a(eum.a(1.0F))
                  .a(eqw.a($$1).a(dmw.c.a(), $$1x -> eso.a(eul.a(3, (float)($$1x + 1) / 15.0F)).a(ets.a($$0).a(dx.a.a().a(dmw.c, $$1x.intValue())))))
            )
         );
   }

   public eqo.a c(dfa $$0, cul $$1) {
      return eqo.b().a(this.a($$0, eqn.a().a(eum.a(1.0F)).a(eqw.a($$1).a(eso.a(eul.a(3, 0.53333336F))))));
   }

   protected static eqo.a b(dby $$0) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a(c).a(eqw.a($$0)));
   }

   protected eqo.a a(dfa $$0, ett.a $$1) {
      return eqo.b()
         .a(
            eqn.a()
               .a(
                  (eqz.a<?>)this.a(
                     (dby)$$0,
                     eqw.a($$0)
                        .a($$1)
                        .a(je.values(), $$1x -> eso.a(eum.a(1.0F), true).a(ets.a($$0).a(dx.a.a().a(dka.b($$1x), true))))
                        .a(eso.a(eum.a(-1.0F), true))
                  )
               )
         );
   }

   protected eqo.a a(dfa $$0, dfa $$1, float... $$2) {
      return c($$0, ((erb.a)this.a((dby)$$0, eqw.a($$1))).a(etj.a(dae.x, $$2)))
         .a(eqn.a().a(eum.a(1.0F)).a(i).a(((erb.a)this.a((dby)$$0, eqw.a(cut.pp).a(eso.a(eus.a(1.0F, 2.0F))))).a(etj.a(dae.x, j))));
   }

   protected eqo.a b(dfa $$0, dfa $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eqn.a().a(eum.a(1.0F)).a(i).a(((erb.a)this.a((dby)$$0, eqw.a(cut.ot))).a(etj.a(dae.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eqo.a l(dfa $$0) {
      return c($$0, ((erb.a)this.a((dby)dfc.aL, eqw.a(cut.pp).a(eso.a(eus.a(1.0F, 2.0F))))).a(etj.a(dae.x, j)));
   }

   protected eqo.a a(dfa $$0, cul $$1, cul $$2, ett.a $$3) {
      return this.a((dby)$$0, eqo.b().a(eqn.a().a(eqw.a($$1).a($$3).a(eqw.a($$2)))).a(eqn.a().a($$3).a(eqw.a($$2).a(erg.a(dae.x, 0.5714286F, 3)))));
   }

   protected static eqo.a m(dfa $$0) {
      return eqo.b().a(eqn.a().a(c).a(eqw.a($$0).a(eso.a(eum.a(2.0F)))));
   }

   protected eqo.a a(dfa $$0, dfa $$1) {
      eqz.a<?> $$2 = eqw.a($$1).a(eso.a(eum.a(2.0F))).a(c).a(((erb.a)this.a((dby)$$0, eqw.a(cut.pv))).a(ety.a(0.125F)));
      return eqo.b()
         .a(eqn.a().a($$2).a(ets.a($$0).a(dx.a.a().a(dhi.b, dsz.b))).a(etr.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhi.b, dsz.a))), new iz(0, 1, 0))))
         .a(eqn.a().a($$2).a(ets.a($$0).a(dx.a.a().a(dhi.b, dsz.a))).a(etr.a(dc.a.a().a(av.a.a().a($$0).a(dx.a.a().a(dhi.b, dsz.b))), new iz(0, -1, 0))));
   }

   protected eqo.a n(dfa $$0) {
      return eqo.b()
         .a(
            eqn.a()
               .a(eum.a(1.0F))
               .a(
                  (eqz.a<?>)this.a(
                     $$0, eqw.a($$0).a(List.of(2, 3, 4), $$1 -> eso.a(eum.a((float)$$1.intValue())).a(ets.a($$0).a(dx.a.a().a(dfp.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eqo.a o(dfa $$0) {
      return eqo.b()
         .a(
            eqn.a()
               .a(eum.a(1.0F))
               .a(
                  (eqz.a<?>)this.a(
                     $$0,
                     eqw.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eso.a(eum.a((float)$$1.intValue())).a(ets.a($$0).a(dx.a.a().a(dkn.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eqo.a p(dfa $$0) {
      return eqo.b().a(eqn.a().a(eum.a(1.0F)).a(eqw.a($$0)));
   }

   public static eqo.a a() {
      return eqo.b();
   }

   protected abstract void b();

   @Override
   public void generate(jk.a $$0, BiConsumer<ale<eqo>, eqo.a> $$1) {
      this.b();
      Set<ale<eqo>> $$2 = new HashSet<>();

      for (dfa $$3 : lp.e) {
         if ($$3.a(this.e)) {
            ale<eqo> $$4 = $$3.v();
            if ($$4 != eqf.a && $$2.add($$4)) {
               eqo.a $$5 = this.f.remove($$4);
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

   protected void b(dfa $$0, dfa $$1) {
      eqo.a $$2 = c($$0, eqw.a($$0).a(etj.a(dae.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eqo.a q(dfa $$0) {
      return this.a($$0, dhg.f, dsz.b);
   }

   protected void r(dfa $$0) {
      this.a($$0, $$0x -> this.d((dby)((did)$$0x).b()));
   }

   protected void c(dfa $$0, dfa $$1) {
      this.a($$0, c((dby)$$1));
   }

   protected void c(dfa $$0, dby $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dfa $$0) {
      this.c($$0, $$0);
   }

   protected void t(dfa $$0) {
      this.c($$0, (dby)$$0);
   }

   protected void a(dfa $$0, Function<dfa, eqo.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dfa $$0, eqo.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
