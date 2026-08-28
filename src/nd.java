import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nd implements ng {
   protected final jt.a a;
   protected final Set<cxd> b;
   protected final csn c;
   protected final Map<akt<ewt>, ewt.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezx.a a() {
      jt.b<ddr> $$0 = this.a.d(mc.aP);
      return fae.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(ddw.v), dk.d.b(1))))));
   }

   protected ezx.a b() {
      return this.a().invert();
   }

   protected ezx.a c() {
      return fae.a(cv.a.a().a(this.a.d(mc.K), cxl.sU));
   }

   private ezx.a f() {
      return this.c().or(this.a());
   }

   private ezx.a g() {
      return this.f().invert();
   }

   protected nd(Set<cxd> $$0, csn $$1, jt.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nd(Set<cxd> $$0, csn $$1, Map<akt<ewt>, ewt.a> $$2, jt.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exy<T>> T a(dgy $$0, exy<T> $$1) {
      return !this.b.contains($$0.i()) ? $$1.b(exm.c()) : $$1.c();
   }

   protected <T extends ezp<T>> T a(dgy $$0, ezp<T> $$1) {
      return !this.b.contains($$0.i()) ? $$1.b(ezt.c()) : $$1.d();
   }

   public ewt.a a(dgy $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0))));
   }

   private static ewt.a a(dke $$0, ezx.a $$1, exe.a<?> $$2) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0).a($$1).a($$2)));
   }

   protected ewt.a a(dke $$0, exe.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ewt.a b(dke $$0, exe.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ewt.a c(dke $$0, exe.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ewt.a a(dke $$0, dgy $$1) {
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a($$1)));
   }

   protected ewt.a a(dgy $$0, fat $$1) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a((exe.a<?>)this.a($$0, exb.a($$0).a(eyt.a($$1)))));
   }

   protected ewt.a a(dke $$0, dgy $$1, fat $$2) {
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a($$1).a(eyt.a($$2))));
   }

   private ewt.a d(dgy $$0) {
      return ewt.b().a(ews.a().a(this.a()).a(faq.a(1.0F)).a(exb.a($$0)));
   }

   private ewt.a e(dgy $$0) {
      return ewt.b().a(this.a(dkg.gm, ews.a().a(faq.a(1.0F)).a(exb.a(dkg.gm)))).a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0))));
   }

   protected ewt.a a(dke $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a((exe.a<?>)this.a((dgy)$$0, exb.a($$0).a(eyt.a(faq.a(2.0F)).a(ezw.a($$0).a(ef.a.a().a(drn.b, dyy.c)))))));
   }

   protected <T extends Comparable<T> & azv> ewt.a a(dke $$0, dyt<T> $$1, T $$2) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(ezw.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected ewt.a b(dke $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(kv.g)))));
   }

   protected ewt.a c(dke $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(kv.g).a(kv.an).a(kv.aq).a(kv.ar)))));
   }

   protected ewt.a d(dke $$0) {
      jt.b<ddr> $$1 = this.a.d(mc.aP);
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a(cxl.pn).a(eyt.a(fax.a(2.0F, 5.0F))).a(exl.a($$1.b(ddw.x)))));
   }

   protected ewt.a e(dke $$0) {
      jt.b<ddr> $$1 = this.a.d(mc.aP);
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a(cxl.pi).a(eyt.a(fax.a(4.0F, 9.0F))).a(exl.a($$1.b(ddw.x)))));
   }

   protected ewt.a f(dke $$0) {
      jt.b<ddr> $$1 = this.a.d(mc.aP);
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a(cxl.mg).a(eyt.a(fax.a(4.0F, 5.0F))).a(exl.b($$1.b(ddw.x)))));
   }

   protected ewt.a g(dke $$0) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(kv.g).a(kv.h).a(kv.q).a(kv.ak).a(kv.k)))));
   }

   protected ewt.a h(dke $$0) {
      return ewt.b().a(ews.a().a(this.a()).a(faq.a(1.0F)).a(exb.a($$0).a(exo.a(exo.b.a).a(kv.ap)).a(exn.a($$0).a(djy.c))));
   }

   protected ewt.a i(dke $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0).a(this.a()).a(exo.a(exo.b.a).a(kv.ap)).a(exn.a($$0).a(djy.c)).a(exb.a($$0))));
   }

   protected ewt.a j(dke $$0) {
      return ewt.b().a(ews.a().a(exb.a(cxl.xy)).a(ezw.a($$0).a(ef.a.a().a(dlb.t_, true))));
   }

   protected ewt.a a(dke $$0, cxd $$1) {
      jt.b<ddr> $$2 = this.a.d(mc.aP);
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a($$1).a(exl.a($$2.b(ddw.x)))));
   }

   protected ewt.a b(dke $$0, dgy $$1) {
      return this.a($$0, (exe.a<?>)this.a((dgy)$$0, exb.a($$1).a(eyt.a(fax.a(-6.0F, 2.0F))).a(exz.a(ewn.b(0)))));
   }

   protected ewt.a k(dke $$0) {
      jt.b<ddr> $$1 = this.a.d(mc.aP);
      return this.b($$0, (exe.a<?>)this.a((dgy)$$0, exb.a(cxl.qc).a(fac.a(0.125F)).a(exl.a($$1.b(ddw.x), 2))));
   }

   public ewt.a b(dke $$0, cxd $$1) {
      return ewt.b()
         .a(
            this.a(
               $$0,
               ews.a()
                  .a(faq.a(1.0F))
                  .a(exb.a($$1).a(dsg.c.a(), $$1x -> eyt.a(fap.a(3, (float)($$1x + 1) / 15.0F)).a(ezw.a($$0).a(ef.a.a().a(dsg.c, $$1x.intValue())))))
            )
         );
   }

   public ewt.a c(dke $$0, cxd $$1) {
      return ewt.b().a(this.a($$0, ews.a().a(faq.a(1.0F)).a(exb.a($$1).a(eyt.a(fap.a(3, 0.53333336F))))));
   }

   protected ewt.a b(dgy $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(this.c()).a(exb.a($$0)));
   }

   protected ewt.a c(dgy $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(this.f()).a(exb.a($$0)));
   }

   protected ewt.a a(dke $$0, ezx.a $$1) {
      return ewt.b()
         .a(
            ews.a()
               .a(
                  (exe.a<?>)this.a(
                     (dgy)$$0,
                     exb.a($$0)
                        .a($$1)
                        .a(jn.values(), $$1x -> eyt.a(faq.a(1.0F), true).a(ezw.a($$0).a(ef.a.a().a(dpi.b($$1x), true))))
                        .a(eyt.a(faq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewt.a l(dke $$0) {
      return ewt.b()
         .a(
            ews.a()
               .a(
                  (exe.a<?>)this.a(
                     (dgy)$$0,
                     exb.a($$0).a(jn.values(), $$1 -> eyt.a(faq.a(1.0F), true).a(ezw.a($$0).a(ef.a.a().a(dpi.b($$1), true)))).a(eyt.a(faq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewt.a m(dke $$0) {
      return ewt.b().a(ews.a().a((exe.a<?>)this.a($$0, exb.a($$0).a(ezw.a($$0).a(ef.a.a().a(dpg.b, true))))));
   }

   protected ewt.a a(dke $$0, dke $$1, float... $$2) {
      jt.b<ddr> $$3 = this.a.d(mc.aP);
      return this.c($$0, ((exg.a)this.a((dgy)$$0, exb.a($$1))).a(ezm.a($$3.b(ddw.x), $$2)))
         .a(ews.a().a(faq.a(1.0F)).a(this.g()).a(((exg.a)this.a((dgy)$$0, exb.a(cxl.pX).a(eyt.a(fax.a(1.0F, 2.0F))))).a(ezm.a($$3.b(ddw.x), f))));
   }

   protected ewt.a b(dke $$0, dke $$1, float... $$2) {
      jt.b<ddr> $$3 = this.a.d(mc.aP);
      return this.a($$0, $$1, $$2)
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(this.g())
               .a(((exg.a)this.a((dgy)$$0, exb.a(cxl.pb))).a(ezm.a($$3.b(ddw.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ewt.a n(dke $$0) {
      jt.b<ddr> $$1 = this.a.d(mc.aP);
      return this.c($$0, ((exg.a)this.a((dgy)dkg.aS, exb.a(cxl.pX).a(eyt.a(fax.a(1.0F, 2.0F))))).a(ezm.a($$1.b(ddw.x), f)));
   }

   protected ewt.a a(dke $$0, cxd $$1, cxd $$2, ezx.a $$3) {
      jt.b<ddr> $$4 = this.a.d(mc.aP);
      return this.a((dgy)$$0, ewt.b().a(ews.a().a(exb.a($$1).a($$3).a(exb.a($$2)))).a(ews.a().a($$3).a(exb.a($$2).a(exl.a($$4.b(ddw.x), 0.5714286F, 3)))));
   }

   protected ewt.a o(dke $$0) {
      return ewt.b().a(ews.a().a(this.c()).a(exb.a($$0).a(eyt.a(faq.a(2.0F)))));
   }

   protected ewt.a a(dke $$0, dke $$1) {
      jt.b<dke> $$2 = this.a.d(mc.f);
      exe.a<?> $$3 = exb.a($$1).a(eyt.a(faq.a(2.0F))).a(this.c()).a(((exg.a)this.a((dgy)$$0, exb.a(cxl.qc))).a(fac.a(0.125F)));
      return ewt.b()
         .a(ews.a().a($$3).a(ezw.a($$0).a(ef.a.a().a(dmn.b, dym.b))).a(ezv.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dmn.b, dym.a))), new ji(0, 1, 0))))
         .a(ews.a().a($$3).a(ezw.a($$0).a(ef.a.a().a(dmn.b, dym.a))).a(ezv.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dmn.b, dym.b))), new ji(0, -1, 0))));
   }

   protected ewt.a p(dke $$0) {
      return ewt.b()
         .a(
            ews.a()
               .a(faq.a(1.0F))
               .a(
                  (exe.a<?>)this.a(
                     $$0, exb.a($$0).a(List.of(2, 3, 4), $$1 -> eyt.a(faq.a((float)$$1.intValue())).a(ezw.a($$0).a(ef.a.a().a(dku.f, $$1.intValue()))))
                  )
               )
         );
   }

   public ewt.a q(dke $$0) {
      return $$0 instanceof dri $$1
         ? ewt.b()
            .a(
               ews.a()
                  .a(faq.a(1.0F))
                  .a(
                     (exe.a<?>)this.a(
                        $$0,
                        exb.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> eyt.a(faq.a((float)$$2.intValue())).a(ezw.a($$0).a(ef.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static ewt.a r(dke $$0) {
      return ewt.b().a(ews.a().a(faq.a(1.0F)).a(exb.a($$0)));
   }

   public static ewt.a d() {
      return ewt.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<akt<ewt>, ewt.a> $$0) {
      this.e();
      Set<akt<ewt>> $$1 = new HashSet<>();

      for (dke $$2 : mb.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((akt<ewt>)$$3)) {
                  ewt.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mb.e.b($$2)));
                  }

                  $$0.accept((akt<ewt>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dke $$0, dke $$1) {
      jt.b<ddr> $$2 = this.a.d(mc.aP);
      ewt.a $$3 = this.c($$0, exb.a($$0).a(ezm.a($$2.b(ddw.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ewt.a s(dke $$0) {
      return this.a($$0, dml.c, dym.b);
   }

   protected void t(dke $$0) {
      this.a($$0, $$0x -> this.e((dgy)((dnj)$$0x).b()));
   }

   protected void c(dke $$0, dke $$1) {
      this.a($$0, this.d((dgy)$$1));
   }

   protected void c(dke $$0, dgy $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dke $$0) {
      this.c($$0, $$0);
   }

   protected void v(dke $$0) {
      this.c($$0, (dgy)$$0);
   }

   protected void a(dke $$0, Function<dke, ewt.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dke $$0, ewt.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
