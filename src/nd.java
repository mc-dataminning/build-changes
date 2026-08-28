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
   protected final Set<cwj> b;
   protected final crr c;
   protected final Map<akt<evu>, evu.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected eyy.a a() {
      jt.b<dcx> $$0 = this.a.d(mc.aO);
      return ezf.a(cv.a.a().a(cx.b, cq.a(List.of(new bs($$0.b(ddc.v), dk.d.b(1))))));
   }

   protected eyy.a b() {
      return this.a().invert();
   }

   protected eyy.a c() {
      return ezf.a(cv.a.a().a(this.a.d(mc.K), cwr.sS));
   }

   private eyy.a f() {
      return this.c().or(this.a());
   }

   private eyy.a g() {
      return this.f().invert();
   }

   protected nd(Set<cwj> $$0, crr $$1, jt.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nd(Set<cwj> $$0, crr $$1, Map<akt<evu>, evu.a> $$2, jt.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends ewz<T>> T a(dgf $$0, ewz<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ewn.c()) : $$1.c();
   }

   protected <T extends eyq<T>> T a(dgf $$0, eyq<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eyu.c()) : $$1.d();
   }

   public evu.a a(dgf $$0) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0))));
   }

   private static evu.a a(djk $$0, eyy.a $$1, ewf.a<?> $$2) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a($$1).a($$2)));
   }

   protected evu.a a(djk $$0, ewf.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected evu.a b(djk $$0, ewf.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected evu.a c(djk $$0, ewf.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected evu.a a(djk $$0, dgf $$1) {
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a($$1)));
   }

   protected evu.a a(dgf $$0, ezu $$1) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a((ewf.a<?>)this.a($$0, ewc.a($$0).a(exu.a($$1)))));
   }

   protected evu.a a(djk $$0, dgf $$1, ezu $$2) {
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a($$1).a(exu.a($$2))));
   }

   private evu.a d(dgf $$0) {
      return evu.b().a(evt.a().a(this.a()).a(ezr.a(1.0F)).a(ewc.a($$0)));
   }

   private evu.a e(dgf $$0) {
      return evu.b().a(this.a(djm.gm, evt.a().a(ezr.a(1.0F)).a(ewc.a(djm.gm)))).a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0))));
   }

   protected evu.a a(djk $$0) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a((ewf.a<?>)this.a((dgf)$$0, ewc.a($$0).a(exu.a(ezr.a(2.0F)).a(eyx.a($$0).a(ef.a.a().a(dqs.b, dyc.c)))))));
   }

   protected <T extends Comparable<T> & azu> evu.a a(djk $$0, dxx<T> $$1, T $$2) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a(eyx.a($$0).a(ef.a.a().a($$1, $$2))))));
   }

   protected evu.a b(djk $$0) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a(ewp.a(ewp.b.a).a(kv.g)))));
   }

   protected evu.a c(djk $$0) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a(ewp.a(ewp.b.a).a(kv.g).a(kv.al).a(kv.ao).a(kv.ap)))));
   }

   protected evu.a d(djk $$0) {
      jt.b<dcx> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a(cwr.pl).a(exu.a(ezy.a(2.0F, 5.0F))).a(ewm.a($$1.b(ddc.x)))));
   }

   protected evu.a e(djk $$0) {
      jt.b<dcx> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a(cwr.pg).a(exu.a(ezy.a(4.0F, 9.0F))).a(ewm.a($$1.b(ddc.x)))));
   }

   protected evu.a f(djk $$0) {
      jt.b<dcx> $$1 = this.a.d(mc.aO);
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a(cwr.me).a(exu.a(ezy.a(4.0F, 5.0F))).a(ewm.b($$1.b(ddc.x)))));
   }

   protected evu.a g(djk $$0) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a(ewp.a(ewp.b.a).a(kv.g).a(kv.h).a(kv.q).a(kv.ai).a(kv.k)))));
   }

   protected evu.a h(djk $$0) {
      return evu.b().a(evt.a().a(this.a()).a(ezr.a(1.0F)).a(ewc.a($$0).a(ewp.a(ewp.b.a).a(kv.an)).a(ewo.a($$0).a(dje.c))));
   }

   protected evu.a i(djk $$0) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a(ewc.a($$0).a(this.a()).a(ewp.a(ewp.b.a).a(kv.an)).a(ewo.a($$0).a(dje.c)).a(ewc.a($$0))));
   }

   protected evu.a j(djk $$0) {
      return evu.b().a(evt.a().a(ewc.a(cwr.xw)).a(eyx.a($$0).a(ef.a.a().a(dkh.t_, true))));
   }

   protected evu.a a(djk $$0, cwj $$1) {
      jt.b<dcx> $$2 = this.a.d(mc.aO);
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a($$1).a(ewm.a($$2.b(ddc.x)))));
   }

   protected evu.a b(djk $$0, dgf $$1) {
      return this.a($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a($$1).a(exu.a(ezy.a(-6.0F, 2.0F))).a(exa.a(evo.b(0)))));
   }

   protected evu.a k(djk $$0) {
      jt.b<dcx> $$1 = this.a.d(mc.aO);
      return this.b($$0, (ewf.a<?>)this.a((dgf)$$0, ewc.a(cwr.qa).a(ezd.a(0.125F)).a(ewm.a($$1.b(ddc.x), 2))));
   }

   public evu.a b(djk $$0, cwj $$1) {
      return evu.b()
         .a(
            this.a(
               $$0,
               evt.a()
                  .a(ezr.a(1.0F))
                  .a(ewc.a($$1).a(drl.c.a(), $$1x -> exu.a(ezq.a(3, (float)($$1x + 1) / 15.0F)).a(eyx.a($$0).a(ef.a.a().a(drl.c, $$1x.intValue())))))
            )
         );
   }

   public evu.a c(djk $$0, cwj $$1) {
      return evu.b().a(this.a($$0, evt.a().a(ezr.a(1.0F)).a(ewc.a($$1).a(exu.a(ezq.a(3, 0.53333336F))))));
   }

   protected evu.a b(dgf $$0) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a(this.c()).a(ewc.a($$0)));
   }

   protected evu.a c(dgf $$0) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a(this.f()).a(ewc.a($$0)));
   }

   protected evu.a a(djk $$0, eyy.a $$1) {
      return evu.b()
         .a(
            evt.a()
               .a(
                  (ewf.a<?>)this.a(
                     (dgf)$$0,
                     ewc.a($$0)
                        .a($$1)
                        .a(jn.values(), $$1x -> exu.a(ezr.a(1.0F), true).a(eyx.a($$0).a(ef.a.a().a(dom.b($$1x), true))))
                        .a(exu.a(ezr.a(-1.0F), true))
                  )
               )
         );
   }

   protected evu.a l(djk $$0) {
      return evu.b()
         .a(
            evt.a()
               .a(
                  (ewf.a<?>)this.a(
                     (dgf)$$0,
                     ewc.a($$0).a(jn.values(), $$1 -> exu.a(ezr.a(1.0F), true).a(eyx.a($$0).a(ef.a.a().a(dom.b($$1), true)))).a(exu.a(ezr.a(-1.0F), true))
                  )
               )
         );
   }

   protected evu.a m(djk $$0) {
      return evu.b().a(evt.a().a((ewf.a<?>)this.a($$0, ewc.a($$0).a(eyx.a($$0).a(ef.a.a().a(dok.b, true))))));
   }

   protected evu.a a(djk $$0, djk $$1, float... $$2) {
      jt.b<dcx> $$3 = this.a.d(mc.aO);
      return this.c($$0, ((ewh.a)this.a((dgf)$$0, ewc.a($$1))).a(eyn.a($$3.b(ddc.x), $$2)))
         .a(evt.a().a(ezr.a(1.0F)).a(this.g()).a(((ewh.a)this.a((dgf)$$0, ewc.a(cwr.pV).a(exu.a(ezy.a(1.0F, 2.0F))))).a(eyn.a($$3.b(ddc.x), f))));
   }

   protected evu.a b(djk $$0, djk $$1, float... $$2) {
      jt.b<dcx> $$3 = this.a.d(mc.aO);
      return this.a($$0, $$1, $$2)
         .a(
            evt.a()
               .a(ezr.a(1.0F))
               .a(this.g())
               .a(((ewh.a)this.a((dgf)$$0, ewc.a(cwr.oZ))).a(eyn.a($$3.b(ddc.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected evu.a n(djk $$0) {
      jt.b<dcx> $$1 = this.a.d(mc.aO);
      return this.c($$0, ((ewh.a)this.a((dgf)djm.aS, ewc.a(cwr.pV).a(exu.a(ezy.a(1.0F, 2.0F))))).a(eyn.a($$1.b(ddc.x), f)));
   }

   protected evu.a a(djk $$0, cwj $$1, cwj $$2, eyy.a $$3) {
      jt.b<dcx> $$4 = this.a.d(mc.aO);
      return this.a((dgf)$$0, evu.b().a(evt.a().a(ewc.a($$1).a($$3).a(ewc.a($$2)))).a(evt.a().a($$3).a(ewc.a($$2).a(ewm.a($$4.b(ddc.x), 0.5714286F, 3)))));
   }

   protected evu.a o(djk $$0) {
      return evu.b().a(evt.a().a(this.c()).a(ewc.a($$0).a(exu.a(ezr.a(2.0F)))));
   }

   protected evu.a a(djk $$0, djk $$1) {
      jt.b<djk> $$2 = this.a.d(mc.f);
      ewf.a<?> $$3 = ewc.a($$1).a(exu.a(ezr.a(2.0F))).a(this.c()).a(((ewh.a)this.a((dgf)$$0, ewc.a(cwr.qa))).a(ezd.a(0.125F)));
      return evu.b()
         .a(evt.a().a($$3).a(eyx.a($$0).a(ef.a.a().a(dlt.b, dxq.b))).a(eyw.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlt.b, dxq.a))), new ji(0, 1, 0))))
         .a(evt.a().a($$3).a(eyx.a($$0).a(ef.a.a().a(dlt.b, dxq.a))).a(eyw.a(di.a.a().a(ay.a.a().a($$2, $$0).a(ef.a.a().a(dlt.b, dxq.b))), new ji(0, -1, 0))));
   }

   protected evu.a p(djk $$0) {
      return evu.b()
         .a(
            evt.a()
               .a(ezr.a(1.0F))
               .a(
                  (ewf.a<?>)this.a(
                     $$0, ewc.a($$0).a(List.of(2, 3, 4), $$1 -> exu.a(ezr.a((float)$$1.intValue())).a(eyx.a($$0).a(ef.a.a().a(dka.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected evu.a q(djk $$0) {
      return evu.b()
         .a(
            evt.a()
               .a(ezr.a(1.0F))
               .a(
                  (ewf.a<?>)this.a(
                     $$0,
                     ewc.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> exu.a(ezr.a((float)$$1.intValue())).a(eyx.a($$0).a(ef.a.a().a(dpb.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static evu.a r(djk $$0) {
      return evu.b().a(evt.a().a(ezr.a(1.0F)).a(ewc.a($$0)));
   }

   public static evu.a d() {
      return evu.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<akt<evu>, evu.a> $$0) {
      this.e();
      Set<akt<evu>> $$1 = new HashSet<>();

      for (djk $$2 : mb.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((akt<evu>)$$3)) {
                  evu.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mb.e.b($$2)));
                  }

                  $$0.accept((akt<evu>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(djk $$0, djk $$1) {
      jt.b<dcx> $$2 = this.a.d(mc.aO);
      evu.a $$3 = this.c($$0, ewc.a($$0).a(eyn.a($$2.b(ddc.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected evu.a s(djk $$0) {
      return this.a($$0, dlr.f, dxq.b);
   }

   protected void t(djk $$0) {
      this.a($$0, $$0x -> this.e((dgf)((dmo)$$0x).b()));
   }

   protected void c(djk $$0, djk $$1) {
      this.a($$0, this.d((dgf)$$1));
   }

   protected void c(djk $$0, dgf $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(djk $$0) {
      this.c($$0, $$0);
   }

   protected void v(djk $$0) {
      this.c($$0, (dgf)$$0);
   }

   protected void a(djk $$0, Function<djk, evu.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(djk $$0, evu.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
