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
   protected final Set<cwm> b;
   protected final cru c;
   protected final Map<aku<evx>, evx.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezb.a a() {
      jt.b<dda> $$0 = this.a.d(mc.aO);
      return ezi.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(ddf.v), dk.d.b(1))))));
   }

   protected ezb.a b() {
      return this.a().invert();
   }

   protected ezb.a c() {
      return ezi.a(cv.a.a().a(this.a.d(mc.K), cwu.sS));
   }

   private ezb.a f() {
      return this.c().or(this.a());
   }

   private ezb.a g() {
      return this.f().invert();
   }

   protected nd(Set<cwm> $$0, cru $$1, jt.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nd(Set<cwm> $$0, cru $$1, Map<aku<evx>, evx.a> $$2, jt.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exc<T>> T a(dgi $$0, exc<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ewq.c()) : $$1.c();
   }

   protected <T extends eyt<T>> T a(dgi $$0, eyt<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eyx.c()) : $$1.d();
   }

   public evx.a a(dgi $$0) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0))));
   }

   private static evx.a a(djn $$0, ezb.a $$1, ewi.a<?> $$2) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a($$1).a($$2)));
   }

   protected evx.a a(djn $$0, ewi.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected evx.a b(djn $$0, ewi.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected evx.a c(djn $$0, ewi.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected evx.a a(djn $$0, dgi $$1) {
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a($$1)));
   }

   protected evx.a a(dgi $$0, ezx $$1) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a((ewi.a<?>)this.a($$0, ewf.a($$0).a(exx.a($$1)))));
   }

   protected evx.a a(djn $$0, dgi $$1, ezx $$2) {
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a($$1).a(exx.a($$2))));
   }

   private evx.a d(dgi $$0) {
      return evx.b().a(evw.a().a(this.a()).a(ezu.a(1.0F)).a(ewf.a($$0)));
   }

   private evx.a e(dgi $$0) {
      return evx.b().a(this.a(djp.gm, evw.a().a(ezu.a(1.0F)).a(ewf.a(djp.gm)))).a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0))));
   }

   protected evx.a a(djn $$0) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a((ewi.a<?>)this.a((dgi)$$0, ewf.a($$0).a(exx.a(ezu.a(2.0F)).a(eza.a($$0).a(ef.a.a().a(dqv.b, dyf.c)))))));
   }

   protected <T extends Comparable<T> & azv> evx.a a(djn $$0, dya<T> $$1, T $$2) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a(eza.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected evx.a b(djn $$0) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a(ews.a(ews.b.a).a(kv.g)))));
   }

   protected evx.a c(djn $$0) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a(ews.a(ews.b.a).a(kv.g).a(kv.al).a(kv.ao).a(kv.ap)))));
   }

   protected evx.a d(djn $$0) {
      jt.b<dda> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a(cwu.pl).a(exx.a(fab.a(2.0F, 5.0F))).a(ewp.a($$1.b(ddf.x)))));
   }

   protected evx.a e(djn $$0) {
      jt.b<dda> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a(cwu.pg).a(exx.a(fab.a(4.0F, 9.0F))).a(ewp.a($$1.b(ddf.x)))));
   }

   protected evx.a f(djn $$0) {
      jt.b<dda> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a(cwu.me).a(exx.a(fab.a(4.0F, 5.0F))).a(ewp.b($$1.b(ddf.x)))));
   }

   protected evx.a g(djn $$0) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a(ews.a(ews.b.a).a(kv.g).a(kv.h).a(kv.q).a(kv.ai).a(kv.k)))));
   }

   protected evx.a h(djn $$0) {
      return evx.b().a(evw.a().a(this.a()).a(ezu.a(1.0F)).a(ewf.a($$0).a(ews.a(ews.b.a).a(kv.an)).a(ewr.a($$0).a(djh.c))));
   }

   protected evx.a i(djn $$0) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a(ewf.a($$0).a(this.a()).a(ews.a(ews.b.a).a(kv.an)).a(ewr.a($$0).a(djh.c)).a(ewf.a($$0))));
   }

   protected evx.a j(djn $$0) {
      return evx.b().a(evw.a().a(ewf.a(cwu.xw)).a(eza.a($$0).a(ef.a.a().a(dkk.t_, true))));
   }

   protected evx.a a(djn $$0, cwm $$1) {
      jt.b<dda> $$2 = this.a.d(mc.aO);
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a($$1).a(ewp.a($$2.b(ddf.x)))));
   }

   protected evx.a b(djn $$0, dgi $$1) {
      return this.a($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a($$1).a(exx.a(fab.a(-6.0F, 2.0F))).a(exd.a(evr.b(0)))));
   }

   protected evx.a k(djn $$0) {
      jt.b<dda> $$1 = this.a.d(mc.aO);
      return this.b($$0, (ewi.a<?>)this.a((dgi)$$0, ewf.a(cwu.qa).a(ezg.a(0.125F)).a(ewp.a($$1.b(ddf.x), 2))));
   }

   public evx.a b(djn $$0, cwm $$1) {
      return evx.b()
         .a(
            this.a(
               $$0,
               evw.a()
                  .a(ezu.a(1.0F))
                  .a(ewf.a($$1).a(dro.c.a(), $$1x -> exx.a(ezt.a(3, (float)($$1x + 1) / 15.0F)).a(eza.a($$0).a(ef.a.a().a(dro.c, $$1x.intValue())))))
            )
         );
   }

   public evx.a c(djn $$0, cwm $$1) {
      return evx.b().a(this.a($$0, evw.a().a(ezu.a(1.0F)).a(ewf.a($$1).a(exx.a(ezt.a(3, 0.53333336F))))));
   }

   protected evx.a b(dgi $$0) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a(this.c()).a(ewf.a($$0)));
   }

   protected evx.a c(dgi $$0) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a(this.f()).a(ewf.a($$0)));
   }

   protected evx.a a(djn $$0, ezb.a $$1) {
      return evx.b()
         .a(
            evw.a()
               .a(
                  (ewi.a<?>)this.a(
                     (dgi)$$0,
                     ewf.a($$0)
                        .a($$1)
                        .a(jn.values(), $$1x -> exx.a(ezu.a(1.0F), true).a(eza.a($$0).a(ef.a.a().a(dop.b($$1x), true))))
                        .a(exx.a(ezu.a(-1.0F), true))
                  )
               )
         );
   }

   protected evx.a l(djn $$0) {
      return evx.b()
         .a(
            evw.a()
               .a(
                  (ewi.a<?>)this.a(
                     (dgi)$$0,
                     ewf.a($$0).a(jn.values(), $$1 -> exx.a(ezu.a(1.0F), true).a(eza.a($$0).a(ef.a.a().a(dop.b($$1), true)))).a(exx.a(ezu.a(-1.0F), true))
                  )
               )
         );
   }

   protected evx.a m(djn $$0) {
      return evx.b().a(evw.a().a((ewi.a<?>)this.a($$0, ewf.a($$0).a(eza.a($$0).a(ef.a.a().a(don.b, true))))));
   }

   protected evx.a a(djn $$0, djn $$1, float... $$2) {
      jt.b<dda> $$3 = this.a.d(mc.aO);
      return this.c($$0, ((ewk.a)this.a((dgi)$$0, ewf.a($$1))).a(eyq.a($$3.b(ddf.x), $$2)))
         .a(evw.a().a(ezu.a(1.0F)).a(this.g()).a(((ewk.a)this.a((dgi)$$0, ewf.a(cwu.pV).a(exx.a(fab.a(1.0F, 2.0F))))).a(eyq.a($$3.b(ddf.x), f))));
   }

   protected evx.a b(djn $$0, djn $$1, float... $$2) {
      jt.b<dda> $$3 = this.a.d(mc.aO);
      return this.a($$0, $$1, $$2)
         .a(
            evw.a()
               .a(ezu.a(1.0F))
               .a(this.g())
               .a(((ewk.a)this.a((dgi)$$0, ewf.a(cwu.oZ))).a(eyq.a($$3.b(ddf.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected evx.a n(djn $$0) {
      jt.b<dda> $$1 = this.a.d(mc.aO);
      return this.c($$0, ((ewk.a)this.a((dgi)djp.aS, ewf.a(cwu.pV).a(exx.a(fab.a(1.0F, 2.0F))))).a(eyq.a($$1.b(ddf.x), f)));
   }

   protected evx.a a(djn $$0, cwm $$1, cwm $$2, ezb.a $$3) {
      jt.b<dda> $$4 = this.a.d(mc.aO);
      return this.a((dgi)$$0, evx.b().a(evw.a().a(ewf.a($$1).a($$3).a(ewf.a($$2)))).a(evw.a().a($$3).a(ewf.a($$2).a(ewp.a($$4.b(ddf.x), 0.5714286F, 3)))));
   }

   protected evx.a o(djn $$0) {
      return evx.b().a(evw.a().a(this.c()).a(ewf.a($$0).a(exx.a(ezu.a(2.0F)))));
   }

   protected evx.a a(djn $$0, djn $$1) {
      jt.b<djn> $$2 = this.a.d(mc.f);
      ewi.a<?> $$3 = ewf.a($$1).a(exx.a(ezu.a(2.0F))).a(this.c()).a(((ewk.a)this.a((dgi)$$0, ewf.a(cwu.qa))).a(ezg.a(0.125F)));
      return evx.b()
         .a(evw.a().a($$3).a(eza.a($$0).a(ef.a.a().a(dlw.b, dxt.b))).a(eyz.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlw.b, dxt.a))), new ji(0, 1, 0))))
         .a(evw.a().a($$3).a(eza.a($$0).a(ef.a.a().a(dlw.b, dxt.a))).a(eyz.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlw.b, dxt.b))), new ji(0, -1, 0))));
   }

   protected evx.a p(djn $$0) {
      return evx.b()
         .a(
            evw.a()
               .a(ezu.a(1.0F))
               .a(
                  (ewi.a<?>)this.a(
                     $$0, ewf.a($$0).a(List.of(2, 3, 4), $$1 -> exx.a(ezu.a((float)$$1.intValue())).a(eza.a($$0).a(ef.a.a().a(dkd.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected evx.a q(djn $$0) {
      return evx.b()
         .a(
            evw.a()
               .a(ezu.a(1.0F))
               .a(
                  (ewi.a<?>)this.a(
                     $$0,
                     ewf.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> exx.a(ezu.a((float)$$1.intValue())).a(eza.a($$0).a(ef.a.a().a(dpe.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static evx.a r(djn $$0) {
      return evx.b().a(evw.a().a(ezu.a(1.0F)).a(ewf.a($$0)));
   }

   public static evx.a d() {
      return evx.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<aku<evx>, evx.a> $$0) {
      this.e();
      Set<aku<evx>> $$1 = new HashSet<>();

      for (djn $$2 : mb.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((aku<evx>)$$3)) {
                  evx.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mb.e.b($$2)));
                  }

                  $$0.accept((aku<evx>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(djn $$0, djn $$1) {
      jt.b<dda> $$2 = this.a.d(mc.aO);
      evx.a $$3 = this.c($$0, ewf.a($$0).a(eyq.a($$2.b(ddf.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected evx.a s(djn $$0) {
      return this.a($$0, dlu.f, dxt.b);
   }

   protected void t(djn $$0) {
      this.a($$0, $$0x -> this.e((dgi)((dmr)$$0x).b()));
   }

   protected void c(djn $$0, djn $$1) {
      this.a($$0, this.d((dgi)$$1));
   }

   protected void c(djn $$0, dgi $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(djn $$0) {
      this.c($$0, $$0);
   }

   protected void v(djn $$0) {
      this.c($$0, (dgi)$$0);
   }

   protected void a(djn $$0, Function<djn, evx.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(djn $$0, evx.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
