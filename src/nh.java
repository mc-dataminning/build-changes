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
   protected final Set<cyz> b;
   protected final cum c;
   protected final Map<alf<ezm>, ezm.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fcq.a a() {
      jg.b<dfq> $$0 = this.a.e(mg.aR);
      return fcx.a(cl.a.a().a(kt.b, ku.a(List.of(new bs($$0.b(dfv.v), cv.d.b(1))))));
   }

   protected fcq.a b() {
      return this.a().invert();
   }

   protected fcq.a c() {
      return fcx.a(cl.a.a().a(this.a.e(mg.K), czh.td));
   }

   private fcq.a f() {
      return this.c().or(this.a());
   }

   private fcq.a g() {
      return this.f().invert();
   }

   protected nh(Set<cyz> $$0, cum $$1, jg.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nh(Set<cyz> $$0, cum $$1, Map<alf<ezm>, ezm.a> $$2, jg.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends far<T>> T a(diz $$0, far<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(faf.c()) : $$1.c();
   }

   protected <T extends fci<T>> T a(diz $$0, fci<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fcm.c()) : $$1.d();
   }

   public ezm.a a(diz $$0) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0))));
   }

   private static ezm.a a(dmf $$0, fcq.a $$1, ezx.a<?> $$2) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a($$1).a($$2)));
   }

   protected ezm.a a(dmf $$0, ezx.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ezm.a b(dmf $$0, ezx.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ezm.a c(dmf $$0, ezx.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ezm.a a(dmf $$0, diz $$1) {
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a($$1)));
   }

   protected ezm.a a(diz $$0, fdm $$1) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a((ezx.a<?>)this.a($$0, ezu.a($$0).a(fbm.a($$1)))));
   }

   protected ezm.a a(dmf $$0, diz $$1, fdm $$2) {
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a($$1).a(fbm.a($$2))));
   }

   private ezm.a d(diz $$0) {
      return ezm.b().a(ezl.a().a(this.a()).a(fdj.a(1.0F)).a(ezu.a($$0)));
   }

   private ezm.a e(diz $$0) {
      return ezm.b().a(this.a(dmh.gq, ezl.a().a(fdj.a(1.0F)).a(ezu.a(dmh.gq)))).a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0))));
   }

   protected ezm.a a(dmf $$0) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a((ezx.a<?>)this.a((diz)$$0, ezu.a($$0).a(fbm.a(fdj.a(2.0F)).a(fcp.a($$0).a(dq.a.a().a(dts.b, ebp.c)))))));
   }

   protected <T extends Comparable<T> & bak> ezm.a a(dmf $$0, ebk<T> $$1, T $$2) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a(fcp.a($$0).a(dq.a.a().a($$1, $$2))))));
   }

   protected ezm.a b(dmf $$0) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a(fah.a(fah.b.a).a(kj.g)))));
   }

   protected ezm.a c(dmf $$0) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a(fah.a(fah.b.a).a(kj.g).a(kj.ap).a(kj.as).a(kj.at)))));
   }

   protected ezm.a d(dmf $$0) {
      jg.b<dfq> $$1 = this.a.e(mg.aR);
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a(czh.pu).a(fbm.a(fdq.a(2.0F, 5.0F))).a(fae.a($$1.b(dfv.x)))));
   }

   protected ezm.a e(dmf $$0) {
      jg.b<dfq> $$1 = this.a.e(mg.aR);
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a(czh.pp).a(fbm.a(fdq.a(4.0F, 9.0F))).a(fae.a($$1.b(dfv.x)))));
   }

   protected ezm.a f(dmf $$0) {
      jg.b<dfq> $$1 = this.a.e(mg.aR);
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a(czh.ml).a(fbm.a(fdq.a(4.0F, 5.0F))).a(fae.b($$1.b(dfv.x)))));
   }

   protected ezm.a g(dmf $$0) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a(fah.a(fah.b.a).a(kj.g).a(kj.h).a(kj.q).a(kj.am).a(kj.k)))));
   }

   protected ezm.a h(dmf $$0) {
      return ezm.b().a(ezl.a().a(this.a()).a(fdj.a(1.0F)).a(ezu.a($$0).a(fah.a(fah.b.a).a(kj.ar)).a(fag.a($$0).a(dlz.c))));
   }

   protected ezm.a i(dmf $$0) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0).a(this.a()).a(fah.a(fah.b.a).a(kj.ar)).a(fag.a($$0).a(dlz.c)).a(ezu.a($$0))));
   }

   protected ezm.a j(dmf $$0) {
      return ezm.b().a(ezl.a().a(ezu.a(czh.xH)).a(fcp.a($$0).a(dq.a.a().a(dnd.t_, true))));
   }

   protected ezm.a a(dmf $$0, cyz $$1) {
      jg.b<dfq> $$2 = this.a.e(mg.aR);
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a($$1).a(fae.a($$2.b(dfv.x)))));
   }

   protected ezm.a b(dmf $$0, diz $$1) {
      return this.a($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a($$1).a(fbm.a(fdq.a(-6.0F, 2.0F))).a(fas.a(ezg.b(0)))));
   }

   protected ezm.a k(dmf $$0) {
      jg.b<dfq> $$1 = this.a.e(mg.aR);
      return this.b($$0, (ezx.a<?>)this.a((diz)$$0, ezu.a(czh.qj).a(fcv.a(0.125F)).a(fae.a($$1.b(dfv.x), 2))));
   }

   public ezm.a b(dmf $$0, cyz $$1) {
      return ezm.b()
         .a(
            this.a(
               $$0,
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(ezu.a($$1).a(dul.c.a(), $$1x -> fbm.a(fdi.a(3, (float)($$1x + 1) / 15.0F)).a(fcp.a($$0).a(dq.a.a().a(dul.c, $$1x.intValue())))))
            )
         );
   }

   public ezm.a c(dmf $$0, cyz $$1) {
      return ezm.b().a(this.a($$0, ezl.a().a(fdj.a(1.0F)).a(ezu.a($$1).a(fbm.a(fdi.a(3, 0.53333336F))))));
   }

   protected ezm.a b(diz $$0) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a(this.c()).a(ezu.a($$0)));
   }

   protected ezm.a c(diz $$0) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a(this.f()).a(ezu.a($$0)));
   }

   protected ezm.a a(dmf $$0, fcq.a $$1) {
      return ezm.b()
         .a(
            ezl.a()
               .a(
                  (ezx.a<?>)this.a(
                     (diz)$$0,
                     ezu.a($$0)
                        .a($$1)
                        .a(ja.values(), $$1x -> fbm.a(fdj.a(1.0F), true).a(fcp.a($$0).a(dq.a.a().a(drl.b($$1x), true))))
                        .a(fbm.a(fdj.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezm.a l(dmf $$0) {
      return ezm.b()
         .a(
            ezl.a()
               .a(
                  (ezx.a<?>)this.a(
                     (diz)$$0,
                     ezu.a($$0).a(ja.values(), $$1 -> fbm.a(fdj.a(1.0F), true).a(fcp.a($$0).a(dq.a.a().a(drl.b($$1), true)))).a(fbm.a(fdj.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezm.a m(dmf $$0) {
      return ezm.b().a(ezl.a().a((ezx.a<?>)this.a($$0, ezu.a($$0).a(fcp.a($$0).a(dq.a.a().a(drj.b, true))))));
   }

   protected ezm.a a(dmf $$0, dmf $$1, float... $$2) {
      jg.b<dfq> $$3 = this.a.e(mg.aR);
      return this.c($$0, ((ezz.a)this.a((diz)$$0, ezu.a($$1))).a(fcf.a($$3.b(dfv.x), $$2)))
         .a(ezl.a().a(fdj.a(1.0F)).a(this.g()).a(((ezz.a)this.a((diz)$$0, ezu.a(czh.qe).a(fbm.a(fdq.a(1.0F, 2.0F))))).a(fcf.a($$3.b(dfv.x), f))));
   }

   protected ezm.a b(dmf $$0, dmf $$1, float... $$2) {
      jg.b<dfq> $$3 = this.a.e(mg.aR);
      return this.a($$0, $$1, $$2)
         .a(
            ezl.a()
               .a(fdj.a(1.0F))
               .a(this.g())
               .a(((ezz.a)this.a((diz)$$0, ezu.a(czh.pi))).a(fcf.a($$3.b(dfv.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ezm.a n(dmf $$0) {
      jg.b<dfq> $$1 = this.a.e(mg.aR);
      return this.c($$0, ((ezz.a)this.a((diz)dmh.aS, ezu.a(czh.qe).a(fbm.a(fdq.a(1.0F, 2.0F))))).a(fcf.a($$1.b(dfv.x), f)));
   }

   protected ezm.a a(dmf $$0, cyz $$1, cyz $$2, fcq.a $$3) {
      jg.b<dfq> $$4 = this.a.e(mg.aR);
      return this.a((diz)$$0, ezm.b().a(ezl.a().a(ezu.a($$1).a($$3).a(ezu.a($$2)))).a(ezl.a().a($$3).a(ezu.a($$2).a(fae.a($$4.b(dfv.x), 0.5714286F, 3)))));
   }

   protected ezm.a o(dmf $$0) {
      return ezm.b().a(ezl.a().a(this.c()).a(ezu.a($$0).a(fbm.a(fdj.a(2.0F)))));
   }

   protected ezm.a a(dmf $$0, dmf $$1) {
      jg.b<dmf> $$2 = this.a.e(mg.i);
      ezx.a<?> $$3 = ezu.a($$1).a(fbm.a(fdj.a(2.0F))).a(this.c()).a(((ezz.a)this.a((diz)$$0, ezu.a(czh.qj))).a(fcv.a(0.125F)));
      return ezm.b()
         .a(ezl.a().a($$3).a(fcp.a($$0).a(dq.a.a().a(doo.b, ebd.b))).a(fco.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(doo.b, ebd.a))), new iu(0, 1, 0))))
         .a(ezl.a().a($$3).a(fcp.a($$0).a(dq.a.a().a(doo.b, ebd.a))).a(fco.a(ct.a.a().a(ay.a.a().a($$2, $$0).a(dq.a.a().a(doo.b, ebd.b))), new iu(0, -1, 0))));
   }

   protected ezm.a p(dmf $$0) {
      return ezm.b()
         .a(
            ezl.a()
               .a(fdj.a(1.0F))
               .a(
                  (ezx.a<?>)this.a(
                     $$0, ezu.a($$0).a(List.of(2, 3, 4), $$1 -> fbm.a(fdj.a((float)$$1.intValue())).a(fcp.a($$0).a(dq.a.a().a(dmw.f, $$1.intValue()))))
                  )
               )
         );
   }

   public ezm.a q(dmf $$0) {
      return $$0 instanceof dtm $$1
         ? ezm.b()
            .a(
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(
                     (ezx.a<?>)this.a(
                        $$0,
                        ezu.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fbm.a(fdj.a((float)$$2.intValue())).a(fcp.a($$0).a(dq.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static ezm.a r(dmf $$0) {
      return ezm.b().a(ezl.a().a(fdj.a(1.0F)).a(ezu.a($$0)));
   }

   public static ezm.a d() {
      return ezm.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alf<ezm>, ezm.a> $$0) {
      this.e();
      Set<alf<ezm>> $$1 = new HashSet<>();

      for (dmf $$2 : mf.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alf<ezm>)$$3)) {
                  ezm.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mf.e.b($$2)));
                  }

                  $$0.accept((alf<ezm>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dmf $$0, dmf $$1) {
      jg.b<dfq> $$2 = this.a.e(mg.aR);
      ezm.a $$3 = this.c($$0, ezu.a($$0).a(fcf.a($$2.b(dfv.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ezm.a s(dmf $$0) {
      return this.a($$0, dom.c, ebd.b);
   }

   protected void t(dmf $$0) {
      this.a($$0, $$0x -> this.e((diz)((dpm)$$0x).b()));
   }

   protected void c(dmf $$0, dmf $$1) {
      this.a($$0, this.d((diz)$$1));
   }

   protected void c(dmf $$0, diz $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dmf $$0) {
      this.c($$0, $$0);
   }

   protected void v(dmf $$0) {
      this.c($$0, (diz)$$0);
   }

   protected void a(dmf $$0, Function<dmf, ezm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dmf $$0, ezm.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
