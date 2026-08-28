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
   protected final Set<cwk> b;
   protected final crs c;
   protected final Map<aku<evv>, evv.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected eyz.a a() {
      jt.b<dcy> $$0 = this.a.d(mc.aO);
      return ezg.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(ddd.v), dk.d.b(1))))));
   }

   protected eyz.a b() {
      return this.a().invert();
   }

   protected eyz.a c() {
      return ezg.a(cv.a.a().a(this.a.d(mc.K), cws.sS));
   }

   private eyz.a f() {
      return this.c().or(this.a());
   }

   private eyz.a g() {
      return this.f().invert();
   }

   protected nd(Set<cwk> $$0, crs $$1, jt.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nd(Set<cwk> $$0, crs $$1, Map<aku<evv>, evv.a> $$2, jt.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exa<T>> T a(dgg $$0, exa<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ewo.c()) : $$1.c();
   }

   protected <T extends eyr<T>> T a(dgg $$0, eyr<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eyv.c()) : $$1.d();
   }

   public evv.a a(dgg $$0) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0))));
   }

   private static evv.a a(djl $$0, eyz.a $$1, ewg.a<?> $$2) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a($$1).a($$2)));
   }

   protected evv.a a(djl $$0, ewg.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected evv.a b(djl $$0, ewg.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected evv.a c(djl $$0, ewg.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected evv.a a(djl $$0, dgg $$1) {
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a($$1)));
   }

   protected evv.a a(dgg $$0, ezv $$1) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a((ewg.a<?>)this.a($$0, ewd.a($$0).a(exv.a($$1)))));
   }

   protected evv.a a(djl $$0, dgg $$1, ezv $$2) {
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a($$1).a(exv.a($$2))));
   }

   private evv.a d(dgg $$0) {
      return evv.b().a(evu.a().a(this.a()).a(ezs.a(1.0F)).a(ewd.a($$0)));
   }

   private evv.a e(dgg $$0) {
      return evv.b().a(this.a(djn.gm, evu.a().a(ezs.a(1.0F)).a(ewd.a(djn.gm)))).a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0))));
   }

   protected evv.a a(djl $$0) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a((ewg.a<?>)this.a((dgg)$$0, ewd.a($$0).a(exv.a(ezs.a(2.0F)).a(eyy.a($$0).a(ef.a.a().a(dqt.b, dyd.c)))))));
   }

   protected <T extends Comparable<T> & azv> evv.a a(djl $$0, dxy<T> $$1, T $$2) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a(eyy.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected evv.a b(djl $$0) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a(ewq.a(ewq.b.a).a(kv.g)))));
   }

   protected evv.a c(djl $$0) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a(ewq.a(ewq.b.a).a(kv.g).a(kv.al).a(kv.ao).a(kv.ap)))));
   }

   protected evv.a d(djl $$0) {
      jt.b<dcy> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a(cws.pl).a(exv.a(ezz.a(2.0F, 5.0F))).a(ewn.a($$1.b(ddd.x)))));
   }

   protected evv.a e(djl $$0) {
      jt.b<dcy> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a(cws.pg).a(exv.a(ezz.a(4.0F, 9.0F))).a(ewn.a($$1.b(ddd.x)))));
   }

   protected evv.a f(djl $$0) {
      jt.b<dcy> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a(cws.me).a(exv.a(ezz.a(4.0F, 5.0F))).a(ewn.b($$1.b(ddd.x)))));
   }

   protected evv.a g(djl $$0) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a(ewq.a(ewq.b.a).a(kv.g).a(kv.h).a(kv.q).a(kv.ai).a(kv.k)))));
   }

   protected evv.a h(djl $$0) {
      return evv.b().a(evu.a().a(this.a()).a(ezs.a(1.0F)).a(ewd.a($$0).a(ewq.a(ewq.b.a).a(kv.an)).a(ewp.a($$0).a(djf.c))));
   }

   protected evv.a i(djl $$0) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a(ewd.a($$0).a(this.a()).a(ewq.a(ewq.b.a).a(kv.an)).a(ewp.a($$0).a(djf.c)).a(ewd.a($$0))));
   }

   protected evv.a j(djl $$0) {
      return evv.b().a(evu.a().a(ewd.a(cws.xw)).a(eyy.a($$0).a(ef.a.a().a(dki.t_, true))));
   }

   protected evv.a a(djl $$0, cwk $$1) {
      jt.b<dcy> $$2 = this.a.d(mc.aO);
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a($$1).a(ewn.a($$2.b(ddd.x)))));
   }

   protected evv.a b(djl $$0, dgg $$1) {
      return this.a($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a($$1).a(exv.a(ezz.a(-6.0F, 2.0F))).a(exb.a(evp.b(0)))));
   }

   protected evv.a k(djl $$0) {
      jt.b<dcy> $$1 = this.a.d(mc.aO);
      return this.b($$0, (ewg.a<?>)this.a((dgg)$$0, ewd.a(cws.qa).a(eze.a(0.125F)).a(ewn.a($$1.b(ddd.x), 2))));
   }

   public evv.a b(djl $$0, cwk $$1) {
      return evv.b()
         .a(
            this.a(
               $$0,
               evu.a()
                  .a(ezs.a(1.0F))
                  .a(ewd.a($$1).a(drm.c.a(), $$1x -> exv.a(ezr.a(3, (float)($$1x + 1) / 15.0F)).a(eyy.a($$0).a(ef.a.a().a(drm.c, $$1x.intValue())))))
            )
         );
   }

   public evv.a c(djl $$0, cwk $$1) {
      return evv.b().a(this.a($$0, evu.a().a(ezs.a(1.0F)).a(ewd.a($$1).a(exv.a(ezr.a(3, 0.53333336F))))));
   }

   protected evv.a b(dgg $$0) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a(this.c()).a(ewd.a($$0)));
   }

   protected evv.a c(dgg $$0) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a(this.f()).a(ewd.a($$0)));
   }

   protected evv.a a(djl $$0, eyz.a $$1) {
      return evv.b()
         .a(
            evu.a()
               .a(
                  (ewg.a<?>)this.a(
                     (dgg)$$0,
                     ewd.a($$0)
                        .a($$1)
                        .a(jn.values(), $$1x -> exv.a(ezs.a(1.0F), true).a(eyy.a($$0).a(ef.a.a().a(don.b($$1x), true))))
                        .a(exv.a(ezs.a(-1.0F), true))
                  )
               )
         );
   }

   protected evv.a l(djl $$0) {
      return evv.b()
         .a(
            evu.a()
               .a(
                  (ewg.a<?>)this.a(
                     (dgg)$$0,
                     ewd.a($$0).a(jn.values(), $$1 -> exv.a(ezs.a(1.0F), true).a(eyy.a($$0).a(ef.a.a().a(don.b($$1), true)))).a(exv.a(ezs.a(-1.0F), true))
                  )
               )
         );
   }

   protected evv.a m(djl $$0) {
      return evv.b().a(evu.a().a((ewg.a<?>)this.a($$0, ewd.a($$0).a(eyy.a($$0).a(ef.a.a().a(dol.b, true))))));
   }

   protected evv.a a(djl $$0, djl $$1, float... $$2) {
      jt.b<dcy> $$3 = this.a.d(mc.aO);
      return this.c($$0, ((ewi.a)this.a((dgg)$$0, ewd.a($$1))).a(eyo.a($$3.b(ddd.x), $$2)))
         .a(evu.a().a(ezs.a(1.0F)).a(this.g()).a(((ewi.a)this.a((dgg)$$0, ewd.a(cws.pV).a(exv.a(ezz.a(1.0F, 2.0F))))).a(eyo.a($$3.b(ddd.x), f))));
   }

   protected evv.a b(djl $$0, djl $$1, float... $$2) {
      jt.b<dcy> $$3 = this.a.d(mc.aO);
      return this.a($$0, $$1, $$2)
         .a(
            evu.a()
               .a(ezs.a(1.0F))
               .a(this.g())
               .a(((ewi.a)this.a((dgg)$$0, ewd.a(cws.oZ))).a(eyo.a($$3.b(ddd.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected evv.a n(djl $$0) {
      jt.b<dcy> $$1 = this.a.d(mc.aO);
      return this.c($$0, ((ewi.a)this.a((dgg)djn.aS, ewd.a(cws.pV).a(exv.a(ezz.a(1.0F, 2.0F))))).a(eyo.a($$1.b(ddd.x), f)));
   }

   protected evv.a a(djl $$0, cwk $$1, cwk $$2, eyz.a $$3) {
      jt.b<dcy> $$4 = this.a.d(mc.aO);
      return this.a((dgg)$$0, evv.b().a(evu.a().a(ewd.a($$1).a($$3).a(ewd.a($$2)))).a(evu.a().a($$3).a(ewd.a($$2).a(ewn.a($$4.b(ddd.x), 0.5714286F, 3)))));
   }

   protected evv.a o(djl $$0) {
      return evv.b().a(evu.a().a(this.c()).a(ewd.a($$0).a(exv.a(ezs.a(2.0F)))));
   }

   protected evv.a a(djl $$0, djl $$1) {
      jt.b<djl> $$2 = this.a.d(mc.f);
      ewg.a<?> $$3 = ewd.a($$1).a(exv.a(ezs.a(2.0F))).a(this.c()).a(((ewi.a)this.a((dgg)$$0, ewd.a(cws.qa))).a(eze.a(0.125F)));
      return evv.b()
         .a(evu.a().a($$3).a(eyy.a($$0).a(ef.a.a().a(dlu.b, dxr.b))).a(eyx.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlu.b, dxr.a))), new ji(0, 1, 0))))
         .a(evu.a().a($$3).a(eyy.a($$0).a(ef.a.a().a(dlu.b, dxr.a))).a(eyx.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlu.b, dxr.b))), new ji(0, -1, 0))));
   }

   protected evv.a p(djl $$0) {
      return evv.b()
         .a(
            evu.a()
               .a(ezs.a(1.0F))
               .a(
                  (ewg.a<?>)this.a(
                     $$0, ewd.a($$0).a(List.of(2, 3, 4), $$1 -> exv.a(ezs.a((float)$$1.intValue())).a(eyy.a($$0).a(ef.a.a().a(dkb.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected evv.a q(djl $$0) {
      return evv.b()
         .a(
            evu.a()
               .a(ezs.a(1.0F))
               .a(
                  (ewg.a<?>)this.a(
                     $$0,
                     ewd.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> exv.a(ezs.a((float)$$1.intValue())).a(eyy.a($$0).a(ef.a.a().a(dpc.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static evv.a r(djl $$0) {
      return evv.b().a(evu.a().a(ezs.a(1.0F)).a(ewd.a($$0)));
   }

   public static evv.a d() {
      return evv.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<aku<evv>, evv.a> $$0) {
      this.e();
      Set<aku<evv>> $$1 = new HashSet<>();

      for (djl $$2 : mb.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((aku<evv>)$$3)) {
                  evv.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mb.e.b($$2)));
                  }

                  $$0.accept((aku<evv>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(djl $$0, djl $$1) {
      jt.b<dcy> $$2 = this.a.d(mc.aO);
      evv.a $$3 = this.c($$0, ewd.a($$0).a(eyo.a($$2.b(ddd.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected evv.a s(djl $$0) {
      return this.a($$0, dls.f, dxr.b);
   }

   protected void t(djl $$0) {
      this.a($$0, $$0x -> this.e((dgg)((dmp)$$0x).b()));
   }

   protected void c(djl $$0, djl $$1) {
      this.a($$0, this.d((dgg)$$1));
   }

   protected void c(djl $$0, dgg $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(djl $$0) {
      this.c($$0, $$0);
   }

   protected void v(djl $$0) {
      this.c($$0, (dgg)$$0);
   }

   protected void a(djl $$0, Function<djl, evv.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(djl $$0, evv.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
