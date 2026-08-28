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
   protected final Set<cyo> b;
   protected final cub c;
   protected final Map<ald<eys>, eys.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fbw.a a() {
      jg.b<dff> $$0 = this.a.e(mg.aP);
      return fcd.a(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(dfk.v), cv.d.b(1))))));
   }

   protected fbw.a b() {
      return this.a().invert();
   }

   protected fbw.a c() {
      return fcd.a(cl.a.a().a(this.a.e(mg.K), cyw.sW));
   }

   private fbw.a f() {
      return this.c().or(this.a());
   }

   private fbw.a g() {
      return this.f().invert();
   }

   protected nh(Set<cyo> $$0, cub $$1, jg.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nh(Set<cyo> $$0, cub $$1, Map<ald<eys>, eys.a> $$2, jg.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends ezx<T>> T a(dio $$0, ezx<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(ezl.c()) : $$1.c();
   }

   protected <T extends fbo<T>> T a(dio $$0, fbo<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fbs.c()) : $$1.d();
   }

   public eys.a a(dio $$0) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0))));
   }

   private static eys.a a(dlu $$0, fbw.a $$1, ezd.a<?> $$2) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a($$1).a($$2)));
   }

   protected eys.a a(dlu $$0, ezd.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eys.a b(dlu $$0, ezd.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected eys.a c(dlu $$0, ezd.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected eys.a a(dlu $$0, dio $$1) {
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a($$1)));
   }

   protected eys.a a(dio $$0, fcs $$1) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a((ezd.a<?>)this.a($$0, eza.a($$0).a(fas.a($$1)))));
   }

   protected eys.a a(dlu $$0, dio $$1, fcs $$2) {
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a($$1).a(fas.a($$2))));
   }

   private eys.a d(dio $$0) {
      return eys.b().a(eyr.a().a(this.a()).a(fcp.a(1.0F)).a(eza.a($$0)));
   }

   private eys.a e(dio $$0) {
      return eys.b().a(this.a(dlw.gm, eyr.a().a(fcp.a(1.0F)).a(eza.a(dlw.gm)))).a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0))));
   }

   protected eys.a a(dlu $$0) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a((ezd.a<?>)this.a((dio)$$0, eza.a($$0).a(fas.a(fcp.a(2.0F)).a(fbv.a($$0).a(dq.a.a().a(dtd.b, eaw.c)))))));
   }

   protected <T extends Comparable<T> & bai> eys.a a(dlu $$0, ear<T> $$1, T $$2) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a(fbv.a($$0).a(dq.a.a().a($$1, $$2))))));
   }

   protected eys.a b(dlu $$0) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a(ezn.a(ezn.b.a).a(kj.g)))));
   }

   protected eys.a c(dlu $$0) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a(ezn.a(ezn.b.a).a(kj.g).a(kj.ap).a(kj.as).a(kj.at)))));
   }

   protected eys.a d(dlu $$0) {
      jg.b<dff> $$1 = this.a.e(mg.aP);
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a(cyw.pp).a(fas.a(fcw.a(2.0F, 5.0F))).a(ezk.a($$1.b(dfk.x)))));
   }

   protected eys.a e(dlu $$0) {
      jg.b<dff> $$1 = this.a.e(mg.aP);
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a(cyw.pk).a(fas.a(fcw.a(4.0F, 9.0F))).a(ezk.a($$1.b(dfk.x)))));
   }

   protected eys.a f(dlu $$0) {
      jg.b<dff> $$1 = this.a.e(mg.aP);
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a(cyw.mg).a(fas.a(fcw.a(4.0F, 5.0F))).a(ezk.b($$1.b(dfk.x)))));
   }

   protected eys.a g(dlu $$0) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a(ezn.a(ezn.b.a).a(kj.g).a(kj.h).a(kj.q).a(kj.am).a(kj.k)))));
   }

   protected eys.a h(dlu $$0) {
      return eys.b().a(eyr.a().a(this.a()).a(fcp.a(1.0F)).a(eza.a($$0).a(ezn.a(ezn.b.a).a(kj.ar)).a(ezm.a($$0).a(dlo.c))));
   }

   protected eys.a i(dlu $$0) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a(eza.a($$0).a(this.a()).a(ezn.a(ezn.b.a).a(kj.ar)).a(ezm.a($$0).a(dlo.c)).a(eza.a($$0))));
   }

   protected eys.a j(dlu $$0) {
      return eys.b().a(eyr.a().a(eza.a(cyw.xA)).a(fbv.a($$0).a(dq.a.a().a(dmr.t_, true))));
   }

   protected eys.a a(dlu $$0, cyo $$1) {
      jg.b<dff> $$2 = this.a.e(mg.aP);
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a($$1).a(ezk.a($$2.b(dfk.x)))));
   }

   protected eys.a b(dlu $$0, dio $$1) {
      return this.a($$0, (ezd.a<?>)this.a((dio)$$0, eza.a($$1).a(fas.a(fcw.a(-6.0F, 2.0F))).a(ezy.a(eym.b(0)))));
   }

   protected eys.a k(dlu $$0) {
      jg.b<dff> $$1 = this.a.e(mg.aP);
      return this.b($$0, (ezd.a<?>)this.a((dio)$$0, eza.a(cyw.qe).a(fcb.a(0.125F)).a(ezk.a($$1.b(dfk.x), 2))));
   }

   public eys.a b(dlu $$0, cyo $$1) {
      return eys.b()
         .a(
            this.a(
               $$0,
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(eza.a($$1).a(dtw.c.a(), $$1x -> fas.a(fco.a(3, (float)($$1x + 1) / 15.0F)).a(fbv.a($$0).a(dq.a.a().a(dtw.c, $$1x.intValue())))))
            )
         );
   }

   public eys.a c(dlu $$0, cyo $$1) {
      return eys.b().a(this.a($$0, eyr.a().a(fcp.a(1.0F)).a(eza.a($$1).a(fas.a(fco.a(3, 0.53333336F))))));
   }

   protected eys.a b(dio $$0) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a(this.c()).a(eza.a($$0)));
   }

   protected eys.a c(dio $$0) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a(this.f()).a(eza.a($$0)));
   }

   protected eys.a a(dlu $$0, fbw.a $$1) {
      return eys.b()
         .a(
            eyr.a()
               .a(
                  (ezd.a<?>)this.a(
                     (dio)$$0,
                     eza.a($$0)
                        .a($$1)
                        .a(ja.values(), $$1x -> fas.a(fcp.a(1.0F), true).a(fbv.a($$0).a(dq.a.a().a(dqy.b($$1x), true))))
                        .a(fas.a(fcp.a(-1.0F), true))
                  )
               )
         );
   }

   protected eys.a l(dlu $$0) {
      return eys.b()
         .a(
            eyr.a()
               .a(
                  (ezd.a<?>)this.a(
                     (dio)$$0,
                     eza.a($$0).a(ja.values(), $$1 -> fas.a(fcp.a(1.0F), true).a(fbv.a($$0).a(dq.a.a().a(dqy.b($$1), true)))).a(fas.a(fcp.a(-1.0F), true))
                  )
               )
         );
   }

   protected eys.a m(dlu $$0) {
      return eys.b().a(eyr.a().a((ezd.a<?>)this.a($$0, eza.a($$0).a(fbv.a($$0).a(dq.a.a().a(dqw.b, true))))));
   }

   protected eys.a a(dlu $$0, dlu $$1, float... $$2) {
      jg.b<dff> $$3 = this.a.e(mg.aP);
      return this.c($$0, ((ezf.a)this.a((dio)$$0, eza.a($$1))).a(fbl.a($$3.b(dfk.x), $$2)))
         .a(eyr.a().a(fcp.a(1.0F)).a(this.g()).a(((ezf.a)this.a((dio)$$0, eza.a(cyw.pZ).a(fas.a(fcw.a(1.0F, 2.0F))))).a(fbl.a($$3.b(dfk.x), f))));
   }

   protected eys.a b(dlu $$0, dlu $$1, float... $$2) {
      jg.b<dff> $$3 = this.a.e(mg.aP);
      return this.a($$0, $$1, $$2)
         .a(
            eyr.a()
               .a(fcp.a(1.0F))
               .a(this.g())
               .a(((ezf.a)this.a((dio)$$0, eza.a(cyw.pd))).a(fbl.a($$3.b(dfk.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eys.a n(dlu $$0) {
      jg.b<dff> $$1 = this.a.e(mg.aP);
      return this.c($$0, ((ezf.a)this.a((dio)dlw.aS, eza.a(cyw.pZ).a(fas.a(fcw.a(1.0F, 2.0F))))).a(fbl.a($$1.b(dfk.x), f)));
   }

   protected eys.a a(dlu $$0, cyo $$1, cyo $$2, fbw.a $$3) {
      jg.b<dff> $$4 = this.a.e(mg.aP);
      return this.a((dio)$$0, eys.b().a(eyr.a().a(eza.a($$1).a($$3).a(eza.a($$2)))).a(eyr.a().a($$3).a(eza.a($$2).a(ezk.a($$4.b(dfk.x), 0.5714286F, 3)))));
   }

   protected eys.a o(dlu $$0) {
      return eys.b().a(eyr.a().a(this.c()).a(eza.a($$0).a(fas.a(fcp.a(2.0F)))));
   }

   protected eys.a a(dlu $$0, dlu $$1) {
      jg.b<dlu> $$2 = this.a.e(mg.i);
      ezd.a<?> $$3 = eza.a($$1).a(fas.a(fcp.a(2.0F))).a(this.c()).a(((ezf.a)this.a((dio)$$0, eza.a(cyw.qe))).a(fcb.a(0.125F)));
      return eys.b()
         .a(eyr.a().a($$3).a(fbv.a($$0).a(dq.a.a().a(dod.b, eak.b))).a(fbu.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(dod.b, eak.a))), new iu(0, 1, 0))))
         .a(eyr.a().a($$3).a(fbv.a($$0).a(dq.a.a().a(dod.b, eak.a))).a(fbu.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(dod.b, eak.b))), new iu(0, -1, 0))));
   }

   protected eys.a p(dlu $$0) {
      return eys.b()
         .a(
            eyr.a()
               .a(fcp.a(1.0F))
               .a(
                  (ezd.a<?>)this.a(
                     $$0, eza.a($$0).a(List.of(2, 3, 4), $$1 -> fas.a(fcp.a((float)$$1.intValue())).a(fbv.a($$0).a(dq.a.a().a(dmk.f, $$1.intValue()))))
                  )
               )
         );
   }

   public eys.a q(dlu $$0) {
      return $$0 instanceof dsy $$1
         ? eys.b()
            .a(
               eyr.a()
                  .a(fcp.a(1.0F))
                  .a(
                     (ezd.a<?>)this.a(
                        $$0,
                        eza.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fas.a(fcp.a((float)$$2.intValue())).a(fbv.a($$0).a(dq.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static eys.a r(dlu $$0) {
      return eys.b().a(eyr.a().a(fcp.a(1.0F)).a(eza.a($$0)));
   }

   public static eys.a d() {
      return eys.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<ald<eys>, eys.a> $$0) {
      this.e();
      Set<ald<eys>> $$1 = new HashSet<>();

      for (dlu $$2 : mf.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((ald<eys>)$$3)) {
                  eys.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mf.e.b($$2)));
                  }

                  $$0.accept((ald<eys>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dlu $$0, dlu $$1) {
      jg.b<dff> $$2 = this.a.e(mg.aP);
      eys.a $$3 = this.c($$0, eza.a($$0).a(fbl.a($$2.b(dfk.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eys.a s(dlu $$0) {
      return this.a($$0, dob.c, eak.b);
   }

   protected void t(dlu $$0) {
      this.a($$0, $$0x -> this.e((dio)((doz)$$0x).b()));
   }

   protected void c(dlu $$0, dlu $$1) {
      this.a($$0, this.d((dio)$$1));
   }

   protected void c(dlu $$0, dio $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dlu $$0) {
      this.c($$0, $$0);
   }

   protected void v(dlu $$0) {
      this.c($$0, (dio)$$0);
   }

   protected void a(dlu $$0, Function<dlu, eys.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dlu $$0, eys.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
