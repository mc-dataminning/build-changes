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
   protected static final esl.a a = ess.a(ch.a.a().a(cj.b, cf.a(List.of(new bm(czc.v, ct.d.b(1))))));
   protected static final esl.a b = a.invert();
   protected static final esl.a c = ess.a(ch.a.a().a(ctr.rV));
   private static final esl.a h = c.or(a);
   private static final esl.a i = h.invert();
   protected final Set<ctj> d;
   protected final coj e;
   protected final Map<akl<epk>, epk.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected mg(Set<ctj> $$0, coj $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected mg(Set<ctj> $$0, coj $$1, Map<akl<epk>, epk.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eqn<T>> T a(daw $$0, eqn<T> $$1) {
      return !this.d.contains($$0.q()) ? $$1.b(eqd.c()) : $$1.c();
   }

   protected <T extends ese<T>> T a(daw $$0, ese<T> $$1) {
      return !this.d.contains($$0.q()) ? $$1.b(esh.c()) : $$1.d();
   }

   public epk.a a(daw $$0) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0))));
   }

   private static epk.a a(ddy $$0, esl.a $$1, epv.a<?> $$2) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a(eps.a($$0).a($$1).a($$2)));
   }

   protected static epk.a a(ddy $$0, epv.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static epk.a b(ddy $$0, epv.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static epk.a c(ddy $$0, epv.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected epk.a a(ddy $$0, daw $$1) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a($$1)));
   }

   protected epk.a a(daw $$0, etg $$1) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a((epv.a<?>)this.a($$0, eps.a($$0).a(erh.a($$1)))));
   }

   protected epk.a a(ddy $$0, daw $$1, etg $$2) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a($$1).a(erh.a($$2))));
   }

   private static epk.a c(daw $$0) {
      return epk.b().a(epj.a().a(a).a(ete.a(1.0F)).a(eps.a($$0)));
   }

   private epk.a d(daw $$0) {
      return epk.b().a(this.a(dea.fR, epj.a().a(ete.a(1.0F)).a(eps.a(dea.fR)))).a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0))));
   }

   protected epk.a a(ddy $$0) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a((epv.a<?>)this.a((daw)$$0, eps.a($$0).a(erh.a(ete.a(2.0F)).a(esk.a($$0).a(dl.a.a().a(dlb.b, dsj.c)))))));
   }

   protected <T extends Comparable<T> & ayx> epk.a a(ddy $$0, dse<T> $$1, T $$2) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0).a(esk.a($$0).a(dl.a.a().a($$1, $$2))))));
   }

   protected epk.a b(ddy $$0) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0).a(eqf.a(eqf.b.a).a(kb.f)))));
   }

   protected epk.a c(ddy $$0) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0).a(eqf.a(eqf.b.a).a(kb.f).a(kb.Z).a(kb.ac).a(kb.ad)))));
   }

   protected epk.a d(ddy $$0) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a(ctr.oF).a(erh.a(etk.a(2.0F, 5.0F))).a(eqc.a(czc.x))));
   }

   protected epk.a e(ddy $$0) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a(ctr.oA).a(erh.a(etk.a(4.0F, 9.0F))).a(eqc.a(czc.x))));
   }

   protected epk.a f(ddy $$0) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a(ctr.lH).a(erh.a(etk.a(4.0F, 5.0F))).a(eqc.b(czc.x))));
   }

   protected epk.a g(ddy $$0) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$0).a(eqf.a(eqf.b.a).a(kb.f).a(kb.g).a(kb.o).a(kb.W)))));
   }

   protected static epk.a h(ddy $$0) {
      return epk.b().a(epj.a().a(a).a(ete.a(1.0F)).a(eps.a($$0).a(eqf.a(eqf.b.a).a(kb.ab)).a(eqe.a($$0).a(dds.c))));
   }

   protected static epk.a i(ddy $$0) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a(eps.a($$0).a(a).a(eqf.a(eqf.b.a).a(kb.ab)).a(eqe.a($$0).a(dds.c)).a(eps.a($$0))));
   }

   protected static epk.a j(ddy $$0) {
      return epk.b().a(epj.a().a(eps.a(ctr.ws)).a(esk.a($$0).a(dl.a.a().a(deu.r_, true))));
   }

   protected epk.a a(ddy $$0, ctj $$1) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a($$1).a(eqc.a(czc.x))));
   }

   protected epk.a b(ddy $$0, daw $$1) {
      return a($$0, (epv.a<?>)this.a((daw)$$0, eps.a($$1).a(erh.a(etk.a(-6.0F, 2.0F))).a(eqo.a(epe.b(0)))));
   }

   protected epk.a k(ddy $$0) {
      return b($$0, (epv.a<?>)this.a((daw)$$0, eps.a(ctr.pv).a(esq.a(0.125F)).a(eqc.a(czc.x, 2))));
   }

   public epk.a b(ddy $$0, ctj $$1) {
      return epk.b()
         .a(
            this.a(
               $$0,
               epj.a()
                  .a(ete.a(1.0F))
                  .a(eps.a($$1).a(dlu.c.a(), $$1x -> erh.a(etd.a(3, (float)($$1x + 1) / 15.0F)).a(esk.a($$0).a(dl.a.a().a(dlu.c, $$1x.intValue())))))
            )
         );
   }

   public epk.a c(ddy $$0, ctj $$1) {
      return epk.b().a(this.a($$0, epj.a().a(ete.a(1.0F)).a(eps.a($$1).a(erh.a(etd.a(3, 0.53333336F))))));
   }

   protected static epk.a b(daw $$0) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a(c).a(eps.a($$0)));
   }

   protected epk.a a(ddy $$0, esl.a $$1) {
      return epk.b()
         .a(
            epj.a()
               .a(
                  (epv.a<?>)this.a(
                     (daw)$$0,
                     eps.a($$0)
                        .a($$1)
                        .a(it.values(), $$1x -> erh.a(ete.a(1.0F), true).a(esk.a($$0).a(dl.a.a().a(diy.b($$1x), true))))
                        .a(erh.a(ete.a(-1.0F), true))
                  )
               )
         );
   }

   protected epk.a a(ddy $$0, ddy $$1, float... $$2) {
      return c($$0, ((epx.a)this.a((daw)$$0, eps.a($$1))).a(esb.a(czc.x, $$2)))
         .a(epj.a().a(ete.a(1.0F)).a(i).a(((epx.a)this.a((daw)$$0, eps.a(ctr.pp).a(erh.a(etk.a(1.0F, 2.0F))))).a(esb.a(czc.x, j))));
   }

   protected epk.a b(ddy $$0, ddy $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(epj.a().a(ete.a(1.0F)).a(i).a(((epx.a)this.a((daw)$$0, eps.a(ctr.ot))).a(esb.a(czc.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected epk.a l(ddy $$0) {
      return c($$0, ((epx.a)this.a((daw)dea.aL, eps.a(ctr.pp).a(erh.a(etk.a(1.0F, 2.0F))))).a(esb.a(czc.x, j)));
   }

   protected epk.a a(ddy $$0, ctj $$1, ctj $$2, esl.a $$3) {
      return this.a((daw)$$0, epk.b().a(epj.a().a(eps.a($$1).a($$3).a(eps.a($$2)))).a(epj.a().a($$3).a(eps.a($$2).a(eqc.a(czc.x, 0.5714286F, 3)))));
   }

   protected static epk.a m(ddy $$0) {
      return epk.b().a(epj.a().a(c).a(eps.a($$0).a(erh.a(ete.a(2.0F)))));
   }

   protected epk.a a(ddy $$0, ddy $$1) {
      epv.a<?> $$2 = eps.a($$1).a(erh.a(ete.a(2.0F))).a(c).a(((epx.a)this.a((daw)$$0, eps.a(ctr.pv))).a(esq.a(0.125F)));
      return epk.b()
         .a(epj.a().a($$2).a(esk.a($$0).a(dl.a.a().a(dgg.b, drx.b))).a(esj.a(cr.a.a().a(av.a.a().a($$0).a(dl.a.a().a(dgg.b, drx.a))), new io(0, 1, 0))))
         .a(epj.a().a($$2).a(esk.a($$0).a(dl.a.a().a(dgg.b, drx.a))).a(esj.a(cr.a.a().a(av.a.a().a($$0).a(dl.a.a().a(dgg.b, drx.b))), new io(0, -1, 0))));
   }

   protected epk.a n(ddy $$0) {
      return epk.b()
         .a(
            epj.a()
               .a(ete.a(1.0F))
               .a(
                  (epv.a<?>)this.a(
                     $$0, eps.a($$0).a(List.of(2, 3, 4), $$1 -> erh.a(ete.a((float)$$1.intValue())).a(esk.a($$0).a(dl.a.a().a(den.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected epk.a o(ddy $$0) {
      return epk.b()
         .a(
            epj.a()
               .a(ete.a(1.0F))
               .a(
                  (epv.a<?>)this.a(
                     $$0,
                     eps.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> erh.a(ete.a((float)$$1.intValue())).a(esk.a($$0).a(dl.a.a().a(djl.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static epk.a p(ddy $$0) {
      return epk.b().a(epj.a().a(ete.a(1.0F)).a(eps.a($$0)));
   }

   public static epk.a a() {
      return epk.b();
   }

   protected abstract void b();

   @Override
   public void generate(iz.a $$0, BiConsumer<akl<epk>, epk.a> $$1) {
      this.b();
      Set<akl<epk>> $$2 = new HashSet<>();

      for (ddy $$3 : le.e) {
         if ($$3.a(this.e)) {
            akl<epk> $$4 = $$3.v();
            if ($$4 != epd.a && $$2.add($$4)) {
               epk.a $$5 = this.f.remove($$4);
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

   protected void b(ddy $$0, ddy $$1) {
      epk.a $$2 = c($$0, eps.a($$0).a(esb.a(czc.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected epk.a q(ddy $$0) {
      return this.a($$0, dge.f, drx.b);
   }

   protected void r(ddy $$0) {
      this.a($$0, $$0x -> this.d((daw)((dhb)$$0x).b()));
   }

   protected void c(ddy $$0, ddy $$1) {
      this.a($$0, c((daw)$$1));
   }

   protected void c(ddy $$0, daw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(ddy $$0) {
      this.c($$0, $$0);
   }

   protected void t(ddy $$0) {
      this.c($$0, (daw)$$0);
   }

   protected void a(ddy $$0, Function<ddy, epk.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(ddy $$0, epk.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
