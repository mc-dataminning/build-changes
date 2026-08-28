import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class ne implements nh {
   protected final js.a a;
   protected final Set<cxk> b;
   protected final css c;
   protected final Map<aly<ewt>, ewt.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezx.a a() {
      js.b<ddy> $$0 = this.a.d(mb.aO);
      return fae.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(ded.v), dj.d.b(1))))));
   }

   protected ezx.a b() {
      return this.a().invert();
   }

   protected ezx.a c() {
      return fae.a(cu.a.a().a(this.a.d(mb.K), cxs.sJ));
   }

   private ezx.a f() {
      return this.c().or(this.a());
   }

   private ezx.a g() {
      return this.f().invert();
   }

   protected ne(Set<cxk> $$0, css $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ne(Set<cxk> $$0, css $$1, Map<aly<ewt>, ewt.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exy<T>> T a(dhg $$0, exy<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exm.c()) : $$1.c();
   }

   protected <T extends ezp<T>> T a(dhg $$0, ezp<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ezt.c()) : $$1.d();
   }

   public ewt.a a(dhg $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0))));
   }

   private static ewt.a a(dkl $$0, ezx.a $$1, exe.a<?> $$2) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0).a($$1).a($$2)));
   }

   protected ewt.a a(dkl $$0, exe.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ewt.a b(dkl $$0, exe.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ewt.a c(dkl $$0, exe.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ewt.a a(dkl $$0, dhg $$1) {
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a($$1)));
   }

   protected ewt.a a(dhg $$0, fat $$1) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a((exe.a<?>)this.a($$0, exb.a($$0).a(eyt.a($$1)))));
   }

   protected ewt.a a(dkl $$0, dhg $$1, fat $$2) {
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a($$1).a(eyt.a($$2))));
   }

   private ewt.a d(dhg $$0) {
      return ewt.b().a(ews.a().a(this.a()).a(faq.a(1.0F)).a(exb.a($$0)));
   }

   private ewt.a e(dhg $$0) {
      return ewt.b().a(this.a(dkn.gf, ews.a().a(faq.a(1.0F)).a(exb.a(dkn.gf)))).a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0))));
   }

   protected ewt.a a(dkl $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a((exe.a<?>)this.a((dhg)$$0, exb.a($$0).a(eyt.a(faq.a(2.0F)).a(ezw.a($$0).a(ee.a.a().a(drr.b, dzb.c)))))));
   }

   protected <T extends Comparable<T> & bba> ewt.a a(dkl $$0, dyw<T> $$1, T $$2) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(ezw.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected ewt.a b(dkl $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(ku.g)))));
   }

   protected ewt.a c(dkl $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected ewt.a d(dkl $$0) {
      js.b<ddy> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a(cxs.pc).a(eyt.a(fax.a(2.0F, 5.0F))).a(exl.a($$1.b(ded.x)))));
   }

   protected ewt.a e(dkl $$0) {
      js.b<ddy> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a(cxs.oX).a(eyt.a(fax.a(4.0F, 9.0F))).a(exl.a($$1.b(ded.x)))));
   }

   protected ewt.a f(dkl $$0) {
      js.b<ddy> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a(cxs.lV).a(eyt.a(fax.a(4.0F, 5.0F))).a(exl.b($$1.b(ded.x)))));
   }

   protected ewt.a g(dkl $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected ewt.a h(dkl $$0) {
      return ewt.b().a(ews.a().a(this.a()).a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(ku.an)).a(exn.a($$0).a(dkf.c))));
   }

   protected ewt.a i(dkl $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(this.a()).a(exo.a(exo.b.a).a(ku.an)).a(exn.a($$0).a(dkf.c)).a(exb.a($$0))));
   }

   protected ewt.a j(dkl $$0) {
      return ewt.b().a(ews.a().a(exb.a(cxs.xm)).a(ezw.a($$0).a(ee.a.a().a(dli.t_, true))));
   }

   protected ewt.a a(dkl $$0, cxk $$1) {
      js.b<ddy> $$2 = this.a.d(mb.aO);
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a($$1).a(exl.a($$2.b(ded.x)))));
   }

   protected ewt.a b(dkl $$0, dhg $$1) {
      return this.a($$0, (exe.a<?>)this.a((dhg)$$0, exb.a($$1).a(eyt.a(fax.a(-6.0F, 2.0F))).a(exz.a(ewn.b(0)))));
   }

   protected ewt.a k(dkl $$0) {
      js.b<ddy> $$1 = this.a.d(mb.aO);
      return this.b($$0, (exe.a<?>)this.a((dhg)$$0, exb.a(cxs.pR).a(fac.a(0.125F)).a(exl.a($$1.b(ded.x), 2))));
   }

   public ewt.a b(dkl $$0, cxk $$1) {
      return ewt.b()
         .a(
            this.a(
               $$0,
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a($$1).a(dsk.c.a(), $$1x -> eyt.a(fap.a(3, (float)($$1x + 1) / 15.0F)).a(ezw.a($$0).a(ee.a.a().a(dsk.c, $$1x.intValue())))))
            )
         );
   }

   public ewt.a c(dkl $$0, cxk $$1) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$1).a(eyt.a(fap.a(3, 0.53333336F))))));
   }

   protected ewt.a b(dhg $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(this.c()).a(exb.a($$0)));
   }

   protected ewt.a c(dhg $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(this.f()).a(exb.a($$0)));
   }

   protected ewt.a a(dkl $$0, ezx.a $$1) {
      return ewt.b()
         .a(
            ews.a()
               .a(
                  (exe.a<?>)this.a(
                     (dhg)$$0,
                     exb.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> eyt.a(faq.a(1.0F), true).a(ezw.a($$0).a(ee.a.a().a(dpn.b($$1x), true))))
                        .a(eyt.a(faq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewt.a l(dkl $$0) {
      return ewt.b().a(ews.a().a((exe.a<?>)this.a($$0, exb.a($$0).a(ezw.a($$0).a(ee.a.a().a(dpl.b, true))))));
   }

   protected ewt.a a(dkl $$0, dkl $$1, float... $$2) {
      js.b<ddy> $$3 = this.a.d(mb.aO);
      return this.c($$0, ((exg.a)this.a((dhg)$$0, exb.a($$1))).a(ezm.a($$3.b(ded.x), $$2)))
         .a(ews.a().a(faq.a(1.0F)).a(this.g()).a(((exg.a)this.a((dhg)$$0, exb.a(cxs.pM).a(eyt.a(fax.a(1.0F, 2.0F))))).a(ezm.a($$3.b(ded.x), f))));
   }

   protected ewt.a b(dkl $$0, dkl $$1, float... $$2) {
      js.b<ddy> $$3 = this.a.d(mb.aO);
      return this.a($$0, $$1, $$2)
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(this.g())
               .a(((exg.a)this.a((dhg)$$0, exb.a(cxs.oQ))).a(ezm.a($$3.b(ded.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ewt.a m(dkl $$0) {
      js.b<ddy> $$1 = this.a.d(mb.aO);
      return this.c($$0, ((exg.a)this.a((dhg)dkn.aS, exb.a(cxs.pM).a(eyt.a(fax.a(1.0F, 2.0F))))).a(ezm.a($$1.b(ded.x), f)));
   }

   protected ewt.a a(dkl $$0, cxk $$1, cxk $$2, ezx.a $$3) {
      js.b<ddy> $$4 = this.a.d(mb.aO);
      return this.a((dhg)$$0, ewt.b().a(ews.a().a(exb.a($$1).a($$3).a(exb.a($$2)))).a(ews.a().a($$3).a(exb.a($$2).a(exl.a($$4.b(ded.x), 0.5714286F, 3)))));
   }

   protected ewt.a n(dkl $$0) {
      return ewt.b().a(ews.a().a(this.c()).a(exb.a($$0).a(eyt.a(faq.a(2.0F)))));
   }

   protected ewt.a a(dkl $$0, dkl $$1) {
      js.b<dkl> $$2 = this.a.d(mb.f);
      exe.a<?> $$3 = exb.a($$1).a(eyt.a(faq.a(2.0F))).a(this.c()).a(((exg.a)this.a((dhg)$$0, exb.a(cxs.pR))).a(fac.a(0.125F)));
      return ewt.b()
         .a(ews.a().a($$3).a(ezw.a($$0).a(ee.a.a().a(dmv.b, dyp.b))).a(ezv.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmv.b, dyp.a))), new jh(0, 1, 0))))
         .a(ews.a().a($$3).a(ezw.a($$0).a(ee.a.a().a(dmv.b, dyp.a))).a(ezv.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmv.b, dyp.b))), new jh(0, -1, 0))));
   }

   protected ewt.a o(dkl $$0) {
      return ewt.b()
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(
                  (exe.a<?>)this.a(
                     $$0, exb.a($$0).a(List.of(2, 3, 4), $$1 -> eyt.a(faq.a((float)$$1.intValue())).a(ezw.a($$0).a(ee.a.a().a(dlb.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ewt.a p(dkl $$0) {
      return ewt.b()
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(
                  (exe.a<?>)this.a(
                     $$0,
                     exb.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eyt.a(faq.a((float)$$1.intValue())).a(ezw.a($$0).a(ee.a.a().a(dqa.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ewt.a q(dkl $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0)));
   }

   public static ewt.a d() {
      return ewt.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<aly<ewt>, ewt.a> $$0) {
      this.e();
      Set<aly<ewt>> $$1 = new HashSet<>();

      for (dkl $$2 : ma.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((aly<ewt>)$$3)) {
                  ewt.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), ma.e.b($$2)));
                  }

                  $$0.accept((aly<ewt>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dkl $$0, dkl $$1) {
      js.b<ddy> $$2 = this.a.d(mb.aO);
      ewt.a $$3 = this.c($$0, exb.a($$0).a(ezm.a($$2.b(ded.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ewt.a r(dkl $$0) {
      return this.a($$0, dmt.f, dyp.b);
   }

   protected void s(dkl $$0) {
      this.a($$0, $$0x -> this.e((dhg)((dnp)$$0x).b()));
   }

   protected void c(dkl $$0, dkl $$1) {
      this.a($$0, this.d((dhg)$$1));
   }

   protected void c(dkl $$0, dhg $$1) {
      this.a($$0, this.a($$1));
   }

   protected void t(dkl $$0) {
      this.c($$0, $$0);
   }

   protected void u(dkl $$0) {
      this.c($$0, (dhg)$$0);
   }

   protected void a(dkl $$0, Function<dkl, ewt.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dkl $$0, ewt.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
