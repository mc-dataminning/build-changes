import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nh implements nk {
   protected final jg.a a;
   protected final Set<cyu> b;
   protected final cuh c;
   protected final Map<alf<eze>, eze.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fci.a a() {
      jg.b<dfl> $$0 = this.a.e(mg.aQ);
      return fcp.a(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(dfq.v), cv.d.b(1))))));
   }

   protected fci.a b() {
      return this.a().invert();
   }

   protected fci.a c() {
      return fcp.a(cl.a.a().a(this.a.e(mg.K), czc.sY));
   }

   private fci.a f() {
      return this.c().or(this.a());
   }

   private fci.a g() {
      return this.f().invert();
   }

   protected nh(Set<cyu> $$0, cuh $$1, jg.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nh(Set<cyu> $$0, cuh $$1, Map<alf<eze>, eze.a> $$2, jg.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends faj<T>> T a(diu $$0, faj<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(ezx.c()) : $$1.c();
   }

   protected <T extends fca<T>> T a(diu $$0, fca<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fce.c()) : $$1.d();
   }

   public eze.a a(diu $$0) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0))));
   }

   private static eze.a a(dma $$0, fci.a $$1, ezp.a<?> $$2) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a($$1).a($$2)));
   }

   protected eze.a a(dma $$0, ezp.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eze.a b(dma $$0, ezp.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected eze.a c(dma $$0, ezp.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected eze.a a(dma $$0, diu $$1) {
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a($$1)));
   }

   protected eze.a a(diu $$0, fde $$1) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a((ezp.a<?>)this.a($$0, ezm.a($$0).a(fbe.a($$1)))));
   }

   protected eze.a a(dma $$0, diu $$1, fde $$2) {
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a($$1).a(fbe.a($$2))));
   }

   private eze.a d(diu $$0) {
      return eze.b().a(ezd.a().a(this.a()).a(fdb.a(1.0F)).a(ezm.a($$0)));
   }

   private eze.a e(diu $$0) {
      return eze.b().a(this.a(dmc.gn, ezd.a().a(fdb.a(1.0F)).a(ezm.a(dmc.gn)))).a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0))));
   }

   protected eze.a a(dma $$0) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a((ezp.a<?>)this.a((diu)$$0, ezm.a($$0).a(fbe.a(fdb.a(2.0F)).a(fch.a($$0).a(dq.a.a().a(dtl.b, ebh.c)))))));
   }

   protected <T extends Comparable<T> & bak> eze.a a(dma $$0, ebc<T> $$1, T $$2) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a(fch.a($$0).a(dq.a.a().a($$1, $$2))))));
   }

   protected eze.a b(dma $$0) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a(ezz.a(ezz.b.a).a(kj.g)))));
   }

   protected eze.a c(dma $$0) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a(ezz.a(ezz.b.a).a(kj.g).a(kj.ap).a(kj.as).a(kj.at)))));
   }

   protected eze.a d(dma $$0) {
      jg.b<dfl> $$1 = this.a.e(mg.aQ);
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a(czc.pr).a(fbe.a(fdi.a(2.0F, 5.0F))).a(ezw.a($$1.b(dfq.x)))));
   }

   protected eze.a e(dma $$0) {
      jg.b<dfl> $$1 = this.a.e(mg.aQ);
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a(czc.pm).a(fbe.a(fdi.a(4.0F, 9.0F))).a(ezw.a($$1.b(dfq.x)))));
   }

   protected eze.a f(dma $$0) {
      jg.b<dfl> $$1 = this.a.e(mg.aQ);
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a(czc.mi).a(fbe.a(fdi.a(4.0F, 5.0F))).a(ezw.b($$1.b(dfq.x)))));
   }

   protected eze.a g(dma $$0) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a(ezz.a(ezz.b.a).a(kj.g).a(kj.h).a(kj.q).a(kj.am).a(kj.k)))));
   }

   protected eze.a h(dma $$0) {
      return eze.b().a(ezd.a().a(this.a()).a(fdb.a(1.0F)).a(ezm.a($$0).a(ezz.a(ezz.b.a).a(kj.ar)).a(ezy.a($$0).a(dlu.c))));
   }

   protected eze.a i(dma $$0) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0).a(this.a()).a(ezz.a(ezz.b.a).a(kj.ar)).a(ezy.a($$0).a(dlu.c)).a(ezm.a($$0))));
   }

   protected eze.a j(dma $$0) {
      return eze.b().a(ezd.a().a(ezm.a(czc.xC)).a(fch.a($$0).a(dq.a.a().a(dmx.t_, true))));
   }

   protected eze.a a(dma $$0, cyu $$1) {
      jg.b<dfl> $$2 = this.a.e(mg.aQ);
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a($$1).a(ezw.a($$2.b(dfq.x)))));
   }

   protected eze.a b(dma $$0, diu $$1) {
      return this.a($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a($$1).a(fbe.a(fdi.a(-6.0F, 2.0F))).a(fak.a(eyy.b(0)))));
   }

   protected eze.a k(dma $$0) {
      jg.b<dfl> $$1 = this.a.e(mg.aQ);
      return this.b($$0, (ezp.a<?>)this.a((diu)$$0, ezm.a(czc.qg).a(fcn.a(0.125F)).a(ezw.a($$1.b(dfq.x), 2))));
   }

   public eze.a b(dma $$0, cyu $$1) {
      return eze.b()
         .a(
            this.a(
               $$0,
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(ezm.a($$1).a(due.c.a(), $$1x -> fbe.a(fda.a(3, (float)($$1x + 1) / 15.0F)).a(fch.a($$0).a(dq.a.a().a(due.c, $$1x.intValue())))))
            )
         );
   }

   public eze.a c(dma $$0, cyu $$1) {
      return eze.b().a(this.a($$0, ezd.a().a(fdb.a(1.0F)).a(ezm.a($$1).a(fbe.a(fda.a(3, 0.53333336F))))));
   }

   protected eze.a b(diu $$0) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a(this.c()).a(ezm.a($$0)));
   }

   protected eze.a c(diu $$0) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a(this.f()).a(ezm.a($$0)));
   }

   protected eze.a a(dma $$0, fci.a $$1) {
      return eze.b()
         .a(
            ezd.a()
               .a(
                  (ezp.a<?>)this.a(
                     (diu)$$0,
                     ezm.a($$0)
                        .a($$1)
                        .a(ja.values(), $$1x -> fbe.a(fdb.a(1.0F), true).a(fch.a($$0).a(dq.a.a().a(drf.b($$1x), true))))
                        .a(fbe.a(fdb.a(-1.0F), true))
                  )
               )
         );
   }

   protected eze.a l(dma $$0) {
      return eze.b()
         .a(
            ezd.a()
               .a(
                  (ezp.a<?>)this.a(
                     (diu)$$0,
                     ezm.a($$0).a(ja.values(), $$1 -> fbe.a(fdb.a(1.0F), true).a(fch.a($$0).a(dq.a.a().a(drf.b($$1), true)))).a(fbe.a(fdb.a(-1.0F), true))
                  )
               )
         );
   }

   protected eze.a m(dma $$0) {
      return eze.b().a(ezd.a().a((ezp.a<?>)this.a($$0, ezm.a($$0).a(fch.a($$0).a(dq.a.a().a(drd.b, true))))));
   }

   protected eze.a a(dma $$0, dma $$1, float... $$2) {
      jg.b<dfl> $$3 = this.a.e(mg.aQ);
      return this.c($$0, ((ezr.a)this.a((diu)$$0, ezm.a($$1))).a(fbx.a($$3.b(dfq.x), $$2)))
         .a(ezd.a().a(fdb.a(1.0F)).a(this.g()).a(((ezr.a)this.a((diu)$$0, ezm.a(czc.qb).a(fbe.a(fdi.a(1.0F, 2.0F))))).a(fbx.a($$3.b(dfq.x), f))));
   }

   protected eze.a b(dma $$0, dma $$1, float... $$2) {
      jg.b<dfl> $$3 = this.a.e(mg.aQ);
      return this.a($$0, $$1, $$2)
         .a(
            ezd.a()
               .a(fdb.a(1.0F))
               .a(this.g())
               .a(((ezr.a)this.a((diu)$$0, ezm.a(czc.pf))).a(fbx.a($$3.b(dfq.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eze.a n(dma $$0) {
      jg.b<dfl> $$1 = this.a.e(mg.aQ);
      return this.c($$0, ((ezr.a)this.a((diu)dmc.aS, ezm.a(czc.qb).a(fbe.a(fdi.a(1.0F, 2.0F))))).a(fbx.a($$1.b(dfq.x), f)));
   }

   protected eze.a a(dma $$0, cyu $$1, cyu $$2, fci.a $$3) {
      jg.b<dfl> $$4 = this.a.e(mg.aQ);
      return this.a((diu)$$0, eze.b().a(ezd.a().a(ezm.a($$1).a($$3).a(ezm.a($$2)))).a(ezd.a().a($$3).a(ezm.a($$2).a(ezw.a($$4.b(dfq.x), 0.5714286F, 3)))));
   }

   protected eze.a o(dma $$0) {
      return eze.b().a(ezd.a().a(this.c()).a(ezm.a($$0).a(fbe.a(fdb.a(2.0F)))));
   }

   protected eze.a a(dma $$0, dma $$1) {
      jg.b<dma> $$2 = this.a.e(mg.i);
      ezp.a<?> $$3 = ezm.a($$1).a(fbe.a(fdb.a(2.0F))).a(this.c()).a(((ezr.a)this.a((diu)$$0, ezm.a(czc.qg))).a(fcn.a(0.125F)));
      return eze.b()
         .a(ezd.a().a($$3).a(fch.a($$0).a(dq.a.a().a(doj.b, eav.b))).a(fcg.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(doj.b, eav.a))), new iu(0, 1, 0))))
         .a(ezd.a().a($$3).a(fch.a($$0).a(dq.a.a().a(doj.b, eav.a))).a(fcg.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(doj.b, eav.b))), new iu(0, -1, 0))));
   }

   protected eze.a p(dma $$0) {
      return eze.b()
         .a(
            ezd.a()
               .a(fdb.a(1.0F))
               .a(
                  (ezp.a<?>)this.a(
                     $$0, ezm.a($$0).a(List.of(2, 3, 4), $$1 -> fbe.a(fdb.a((float)$$1.intValue())).a(fch.a($$0).a(dq.a.a().a(dmq.f, $$1.intValue()))))
                  )
               )
         );
   }

   public eze.a q(dma $$0) {
      return $$0 instanceof dtg $$1
         ? eze.b()
            .a(
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(
                     (ezp.a<?>)this.a(
                        $$0,
                        ezm.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fbe.a(fdb.a((float)$$2.intValue())).a(fch.a($$0).a(dq.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static eze.a r(dma $$0) {
      return eze.b().a(ezd.a().a(fdb.a(1.0F)).a(ezm.a($$0)));
   }

   public static eze.a d() {
      return eze.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alf<eze>, eze.a> $$0) {
      this.e();
      Set<alf<eze>> $$1 = new HashSet<>();

      for (dma $$2 : mf.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alf<eze>)$$3)) {
                  eze.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mf.e.b($$2)));
                  }

                  $$0.accept((alf<eze>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dma $$0, dma $$1) {
      jg.b<dfl> $$2 = this.a.e(mg.aQ);
      eze.a $$3 = this.c($$0, ezm.a($$0).a(fbx.a($$2.b(dfq.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eze.a s(dma $$0) {
      return this.a($$0, doh.c, eav.b);
   }

   protected void t(dma $$0) {
      this.a($$0, $$0x -> this.e((diu)((dpg)$$0x).b()));
   }

   protected void c(dma $$0, dma $$1) {
      this.a($$0, this.d((diu)$$1));
   }

   protected void c(dma $$0, diu $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dma $$0) {
      this.c($$0, $$0);
   }

   protected void v(dma $$0) {
      this.c($$0, (diu)$$0);
   }

   protected void a(dma $$0, Function<dma, eze.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dma $$0, eze.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
