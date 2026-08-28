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
   protected final Set<cwl> b;
   protected final crt c;
   protected final Map<akt<evw>, evw.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected eza.a a() {
      jt.b<dcz> $$0 = this.a.d(mc.aO);
      return ezh.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(dde.v), dk.d.b(1))))));
   }

   protected eza.a b() {
      return this.a().invert();
   }

   protected eza.a c() {
      return ezh.a(cv.a.a().a(this.a.d(mc.K), cwt.sS));
   }

   private eza.a f() {
      return this.c().or(this.a());
   }

   private eza.a g() {
      return this.f().invert();
   }

   protected nd(Set<cwl> $$0, crt $$1, jt.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nd(Set<cwl> $$0, crt $$1, Map<akt<evw>, evw.a> $$2, jt.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exb<T>> T a(dgh $$0, exb<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ewp.c()) : $$1.c();
   }

   protected <T extends eys<T>> T a(dgh $$0, eys<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eyw.c()) : $$1.d();
   }

   public evw.a a(dgh $$0) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0))));
   }

   private static evw.a a(djm $$0, eza.a $$1, ewh.a<?> $$2) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a($$1).a($$2)));
   }

   protected evw.a a(djm $$0, ewh.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected evw.a b(djm $$0, ewh.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected evw.a c(djm $$0, ewh.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected evw.a a(djm $$0, dgh $$1) {
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a($$1)));
   }

   protected evw.a a(dgh $$0, ezw $$1) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a((ewh.a<?>)this.a($$0, ewe.a($$0).a(exw.a($$1)))));
   }

   protected evw.a a(djm $$0, dgh $$1, ezw $$2) {
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a($$1).a(exw.a($$2))));
   }

   private evw.a d(dgh $$0) {
      return evw.b().a(evv.a().a(this.a()).a(ezt.a(1.0F)).a(ewe.a($$0)));
   }

   private evw.a e(dgh $$0) {
      return evw.b().a(this.a(djo.gm, evv.a().a(ezt.a(1.0F)).a(ewe.a(djo.gm)))).a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0))));
   }

   protected evw.a a(djm $$0) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a((ewh.a<?>)this.a((dgh)$$0, ewe.a($$0).a(exw.a(ezt.a(2.0F)).a(eyz.a($$0).a(ef.a.a().a(dqu.b, dye.c)))))));
   }

   protected <T extends Comparable<T> & azv> evw.a a(djm $$0, dxz<T> $$1, T $$2) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a(eyz.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected evw.a b(djm $$0) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a(ewr.a(ewr.b.a).a(kv.g)))));
   }

   protected evw.a c(djm $$0) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a(ewr.a(ewr.b.a).a(kv.g).a(kv.al).a(kv.ao).a(kv.ap)))));
   }

   protected evw.a d(djm $$0) {
      jt.b<dcz> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a(cwt.pl).a(exw.a(faa.a(2.0F, 5.0F))).a(ewo.a($$1.b(dde.x)))));
   }

   protected evw.a e(djm $$0) {
      jt.b<dcz> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a(cwt.pg).a(exw.a(faa.a(4.0F, 9.0F))).a(ewo.a($$1.b(dde.x)))));
   }

   protected evw.a f(djm $$0) {
      jt.b<dcz> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a(cwt.me).a(exw.a(faa.a(4.0F, 5.0F))).a(ewo.b($$1.b(dde.x)))));
   }

   protected evw.a g(djm $$0) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a(ewr.a(ewr.b.a).a(kv.g).a(kv.h).a(kv.q).a(kv.ai).a(kv.k)))));
   }

   protected evw.a h(djm $$0) {
      return evw.b().a(evv.a().a(this.a()).a(ezt.a(1.0F)).a(ewe.a($$0).a(ewr.a(ewr.b.a).a(kv.an)).a(ewq.a($$0).a(djg.c))));
   }

   protected evw.a i(djm $$0) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a(ewe.a($$0).a(this.a()).a(ewr.a(ewr.b.a).a(kv.an)).a(ewq.a($$0).a(djg.c)).a(ewe.a($$0))));
   }

   protected evw.a j(djm $$0) {
      return evw.b().a(evv.a().a(ewe.a(cwt.xw)).a(eyz.a($$0).a(ef.a.a().a(dkj.t_, true))));
   }

   protected evw.a a(djm $$0, cwl $$1) {
      jt.b<dcz> $$2 = this.a.d(mc.aO);
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a($$1).a(ewo.a($$2.b(dde.x)))));
   }

   protected evw.a b(djm $$0, dgh $$1) {
      return this.a($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a($$1).a(exw.a(faa.a(-6.0F, 2.0F))).a(exc.a(evq.b(0)))));
   }

   protected evw.a k(djm $$0) {
      jt.b<dcz> $$1 = this.a.d(mc.aO);
      return this.b($$0, (ewh.a<?>)this.a((dgh)$$0, ewe.a(cwt.qa).a(ezf.a(0.125F)).a(ewo.a($$1.b(dde.x), 2))));
   }

   public evw.a b(djm $$0, cwl $$1) {
      return evw.b()
         .a(
            this.a(
               $$0,
               evv.a()
                  .a(ezt.a(1.0F))
                  .a(ewe.a($$1).a(drn.c.a(), $$1x -> exw.a(ezs.a(3, (float)($$1x + 1) / 15.0F)).a(eyz.a($$0).a(ef.a.a().a(drn.c, $$1x.intValue())))))
            )
         );
   }

   public evw.a c(djm $$0, cwl $$1) {
      return evw.b().a(this.a($$0, evv.a().a(ezt.a(1.0F)).a(ewe.a($$1).a(exw.a(ezs.a(3, 0.53333336F))))));
   }

   protected evw.a b(dgh $$0) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a(this.c()).a(ewe.a($$0)));
   }

   protected evw.a c(dgh $$0) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a(this.f()).a(ewe.a($$0)));
   }

   protected evw.a a(djm $$0, eza.a $$1) {
      return evw.b()
         .a(
            evv.a()
               .a(
                  (ewh.a<?>)this.a(
                     (dgh)$$0,
                     ewe.a($$0)
                        .a($$1)
                        .a(jn.values(), $$1x -> exw.a(ezt.a(1.0F), true).a(eyz.a($$0).a(ef.a.a().a(doo.b($$1x), true))))
                        .a(exw.a(ezt.a(-1.0F), true))
                  )
               )
         );
   }

   protected evw.a l(djm $$0) {
      return evw.b()
         .a(
            evv.a()
               .a(
                  (ewh.a<?>)this.a(
                     (dgh)$$0,
                     ewe.a($$0).a(jn.values(), $$1 -> exw.a(ezt.a(1.0F), true).a(eyz.a($$0).a(ef.a.a().a(doo.b($$1), true)))).a(exw.a(ezt.a(-1.0F), true))
                  )
               )
         );
   }

   protected evw.a m(djm $$0) {
      return evw.b().a(evv.a().a((ewh.a<?>)this.a($$0, ewe.a($$0).a(eyz.a($$0).a(ef.a.a().a(dom.b, true))))));
   }

   protected evw.a a(djm $$0, djm $$1, float... $$2) {
      jt.b<dcz> $$3 = this.a.d(mc.aO);
      return this.c($$0, ((ewj.a)this.a((dgh)$$0, ewe.a($$1))).a(eyp.a($$3.b(dde.x), $$2)))
         .a(evv.a().a(ezt.a(1.0F)).a(this.g()).a(((ewj.a)this.a((dgh)$$0, ewe.a(cwt.pV).a(exw.a(faa.a(1.0F, 2.0F))))).a(eyp.a($$3.b(dde.x), f))));
   }

   protected evw.a b(djm $$0, djm $$1, float... $$2) {
      jt.b<dcz> $$3 = this.a.d(mc.aO);
      return this.a($$0, $$1, $$2)
         .a(
            evv.a()
               .a(ezt.a(1.0F))
               .a(this.g())
               .a(((ewj.a)this.a((dgh)$$0, ewe.a(cwt.oZ))).a(eyp.a($$3.b(dde.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected evw.a n(djm $$0) {
      jt.b<dcz> $$1 = this.a.d(mc.aO);
      return this.c($$0, ((ewj.a)this.a((dgh)djo.aS, ewe.a(cwt.pV).a(exw.a(faa.a(1.0F, 2.0F))))).a(eyp.a($$1.b(dde.x), f)));
   }

   protected evw.a a(djm $$0, cwl $$1, cwl $$2, eza.a $$3) {
      jt.b<dcz> $$4 = this.a.d(mc.aO);
      return this.a((dgh)$$0, evw.b().a(evv.a().a(ewe.a($$1).a($$3).a(ewe.a($$2)))).a(evv.a().a($$3).a(ewe.a($$2).a(ewo.a($$4.b(dde.x), 0.5714286F, 3)))));
   }

   protected evw.a o(djm $$0) {
      return evw.b().a(evv.a().a(this.c()).a(ewe.a($$0).a(exw.a(ezt.a(2.0F)))));
   }

   protected evw.a a(djm $$0, djm $$1) {
      jt.b<djm> $$2 = this.a.d(mc.f);
      ewh.a<?> $$3 = ewe.a($$1).a(exw.a(ezt.a(2.0F))).a(this.c()).a(((ewj.a)this.a((dgh)$$0, ewe.a(cwt.qa))).a(ezf.a(0.125F)));
      return evw.b()
         .a(evv.a().a($$3).a(eyz.a($$0).a(ef.a.a().a(dlv.b, dxs.b))).a(eyy.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlv.b, dxs.a))), new ji(0, 1, 0))))
         .a(evv.a().a($$3).a(eyz.a($$0).a(ef.a.a().a(dlv.b, dxs.a))).a(eyy.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlv.b, dxs.b))), new ji(0, -1, 0))));
   }

   protected evw.a p(djm $$0) {
      return evw.b()
         .a(
            evv.a()
               .a(ezt.a(1.0F))
               .a(
                  (ewh.a<?>)this.a(
                     $$0, ewe.a($$0).a(List.of(2, 3, 4), $$1 -> exw.a(ezt.a((float)$$1.intValue())).a(eyz.a($$0).a(ef.a.a().a(dkc.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected evw.a q(djm $$0) {
      return evw.b()
         .a(
            evv.a()
               .a(ezt.a(1.0F))
               .a(
                  (ewh.a<?>)this.a(
                     $$0,
                     ewe.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> exw.a(ezt.a((float)$$1.intValue())).a(eyz.a($$0).a(ef.a.a().a(dpd.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static evw.a r(djm $$0) {
      return evw.b().a(evv.a().a(ezt.a(1.0F)).a(ewe.a($$0)));
   }

   public static evw.a d() {
      return evw.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<akt<evw>, evw.a> $$0) {
      this.e();
      Set<akt<evw>> $$1 = new HashSet<>();

      for (djm $$2 : mb.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((akt<evw>)$$3)) {
                  evw.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mb.e.b($$2)));
                  }

                  $$0.accept((akt<evw>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(djm $$0, djm $$1) {
      jt.b<dcz> $$2 = this.a.d(mc.aO);
      evw.a $$3 = this.c($$0, ewe.a($$0).a(eyp.a($$2.b(dde.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected evw.a s(djm $$0) {
      return this.a($$0, dlt.f, dxs.b);
   }

   protected void t(djm $$0) {
      this.a($$0, $$0x -> this.e((dgh)((dmq)$$0x).b()));
   }

   protected void c(djm $$0, djm $$1) {
      this.a($$0, this.d((dgh)$$1));
   }

   protected void c(djm $$0, dgh $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(djm $$0) {
      this.c($$0, $$0);
   }

   protected void v(djm $$0) {
      this.c($$0, (dgh)$$0);
   }

   protected void a(djm $$0, Function<djm, evw.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(djm $$0, evw.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
