import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nb implements ne {
   protected final js.a a;
   protected final Set<cwi> b;
   protected final crq c;
   protected final Map<ali<eus>, eus.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected exy.a a() {
      js.b<dcd> $$0 = this.a.d(ma.aM);
      return eyf.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(dci.v), dj.d.b(1))))));
   }

   protected exy.a b() {
      return this.a().invert();
   }

   protected exy.a c() {
      return eyf.a(cu.a.a().a(this.a.d(ma.K), cwq.sm));
   }

   private exy.a f() {
      return this.c().or(this.a());
   }

   private exy.a g() {
      return this.f().invert();
   }

   protected nb(Set<cwi> $$0, crq $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nb(Set<cwi> $$0, crq $$1, Map<ali<eus>, eus.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends evx<T>> T a(dfl $$0, evx<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(evl.c()) : $$1.c();
   }

   protected <T extends exq<T>> T a(dfl $$0, exq<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exu.c()) : $$1.d();
   }

   public eus.a a(dfl $$0) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0))));
   }

   private static eus.a a(diq $$0, exy.a $$1, evd.a<?> $$2) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a($$1).a($$2)));
   }

   protected eus.a a(diq $$0, evd.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eus.a b(diq $$0, evd.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected eus.a c(diq $$0, evd.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected eus.a a(diq $$0, dfl $$1) {
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a($$1)));
   }

   protected eus.a a(dfl $$0, eyu $$1) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a((evd.a<?>)this.a($$0, eva.a($$0).a(ews.a($$1)))));
   }

   protected eus.a a(diq $$0, dfl $$1, eyu $$2) {
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a($$1).a(ews.a($$2))));
   }

   private eus.a c(dfl $$0) {
      return eus.b().a(eur.a().a(this.a()).a(eyr.a(1.0F)).a(eva.a($$0)));
   }

   private eus.a d(dfl $$0) {
      return eus.b().a(this.a(dis.fR, eur.a().a(eyr.a(1.0F)).a(eva.a(dis.fR)))).a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0))));
   }

   protected eus.a a(diq $$0) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a((evd.a<?>)this.a((dfl)$$0, eva.a($$0).a(ews.a(eyr.a(2.0F)).a(exx.a($$0).a(ee.a.a().a(dpt.b, dxc.c)))))));
   }

   protected <T extends Comparable<T> & bai> eus.a a(diq $$0, dwx<T> $$1, T $$2) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a(exx.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected eus.a b(diq $$0) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a(evn.a(evn.b.a).a(ku.g)))));
   }

   protected eus.a c(diq $$0) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a(evn.a(evn.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected eus.a d(diq $$0) {
      js.b<dcd> $$1 = this.a.d(ma.aM);
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a(cwq.oH).a(ews.a(eyy.a(2.0F, 5.0F))).a(evk.a($$1.b(dci.x)))));
   }

   protected eus.a e(diq $$0) {
      js.b<dcd> $$1 = this.a.d(ma.aM);
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a(cwq.oC).a(ews.a(eyy.a(4.0F, 9.0F))).a(evk.a($$1.b(dci.x)))));
   }

   protected eus.a f(diq $$0) {
      js.b<dcd> $$1 = this.a.d(ma.aM);
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a(cwq.lH).a(ews.a(eyy.a(4.0F, 5.0F))).a(evk.b($$1.b(dci.x)))));
   }

   protected eus.a g(diq $$0) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a(evn.a(evn.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected eus.a h(diq $$0) {
      return eus.b().a(eur.a().a(this.a()).a(eyr.a(1.0F)).a(eva.a($$0).a(evn.a(evn.b.a).a(ku.an)).a(evm.a($$0).a(dik.c))));
   }

   protected eus.a i(diq $$0) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a(eva.a($$0).a(this.a()).a(evn.a(evn.b.a).a(ku.an)).a(evm.a($$0).a(dik.c)).a(eva.a($$0))));
   }

   protected eus.a j(diq $$0) {
      return eus.b().a(eur.a().a(eva.a(cwq.wO)).a(exx.a($$0).a(ee.a.a().a(djm.t_, true))));
   }

   protected eus.a a(diq $$0, cwi $$1) {
      js.b<dcd> $$2 = this.a.d(ma.aM);
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a($$1).a(evk.a($$2.b(dci.x)))));
   }

   protected eus.a b(diq $$0, dfl $$1) {
      return this.a($$0, (evd.a<?>)this.a((dfl)$$0, eva.a($$1).a(ews.a(eyy.a(-6.0F, 2.0F))).a(evy.a(eum.b(0)))));
   }

   protected eus.a k(diq $$0) {
      js.b<dcd> $$1 = this.a.d(ma.aM);
      return this.b($$0, (evd.a<?>)this.a((dfl)$$0, eva.a(cwq.pw).a(eyd.a(0.125F)).a(evk.a($$1.b(dci.x), 2))));
   }

   public eus.a b(diq $$0, cwi $$1) {
      return eus.b()
         .a(
            this.a(
               $$0,
               eur.a()
                  .a(eyr.a(1.0F))
                  .a(eva.a($$1).a(dqm.c.a(), $$1x -> ews.a(eyq.a(3, (float)($$1x + 1) / 15.0F)).a(exx.a($$0).a(ee.a.a().a(dqm.c, $$1x.intValue())))))
            )
         );
   }

   public eus.a c(diq $$0, cwi $$1) {
      return eus.b().a(this.a($$0, eur.a().a(eyr.a(1.0F)).a(eva.a($$1).a(ews.a(eyq.a(3, 0.53333336F))))));
   }

   protected eus.a b(dfl $$0) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a(this.c()).a(eva.a($$0)));
   }

   protected eus.a a(diq $$0, exy.a $$1) {
      return eus.b()
         .a(
            eur.a()
               .a(
                  (evd.a<?>)this.a(
                     (dfl)$$0,
                     eva.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> ews.a(eyr.a(1.0F), true).a(exx.a($$0).a(ee.a.a().a(dnp.b($$1x), true))))
                        .a(ews.a(eyr.a(-1.0F), true))
                  )
               )
         );
   }

   protected eus.a a(diq $$0, diq $$1, float... $$2) {
      js.b<dcd> $$3 = this.a.d(ma.aM);
      return this.c($$0, ((evf.a)this.a((dfl)$$0, eva.a($$1))).a(exn.a($$3.b(dci.x), $$2)))
         .a(eur.a().a(eyr.a(1.0F)).a(this.g()).a(((evf.a)this.a((dfl)$$0, eva.a(cwq.pr).a(ews.a(eyy.a(1.0F, 2.0F))))).a(exn.a($$3.b(dci.x), f))));
   }

   protected eus.a b(diq $$0, diq $$1, float... $$2) {
      js.b<dcd> $$3 = this.a.d(ma.aM);
      return this.a($$0, $$1, $$2)
         .a(
            eur.a()
               .a(eyr.a(1.0F))
               .a(this.g())
               .a(((evf.a)this.a((dfl)$$0, eva.a(cwq.ov))).a(exn.a($$3.b(dci.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eus.a l(diq $$0) {
      js.b<dcd> $$1 = this.a.d(ma.aM);
      return this.c($$0, ((evf.a)this.a((dfl)dis.aL, eva.a(cwq.pr).a(ews.a(eyy.a(1.0F, 2.0F))))).a(exn.a($$1.b(dci.x), f)));
   }

   protected eus.a a(diq $$0, cwi $$1, cwi $$2, exy.a $$3) {
      js.b<dcd> $$4 = this.a.d(ma.aM);
      return this.a((dfl)$$0, eus.b().a(eur.a().a(eva.a($$1).a($$3).a(eva.a($$2)))).a(eur.a().a($$3).a(eva.a($$2).a(evk.a($$4.b(dci.x), 0.5714286F, 3)))));
   }

   protected eus.a m(diq $$0) {
      return eus.b().a(eur.a().a(this.c()).a(eva.a($$0).a(ews.a(eyr.a(2.0F)))));
   }

   protected eus.a a(diq $$0, diq $$1) {
      js.b<diq> $$2 = this.a.d(ma.f);
      evd.a<?> $$3 = eva.a($$1).a(ews.a(eyr.a(2.0F))).a(this.c()).a(((evf.a)this.a((dfl)$$0, eva.a(cwq.pw))).a(eyd.a(0.125F)));
      return eus.b()
         .a(eur.a().a($$3).a(exx.a($$0).a(ee.a.a().a(dky.b, dwq.b))).a(exw.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dky.b, dwq.a))), new jh(0, 1, 0))))
         .a(eur.a().a($$3).a(exx.a($$0).a(ee.a.a().a(dky.b, dwq.a))).a(exw.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dky.b, dwq.b))), new jh(0, -1, 0))));
   }

   protected eus.a n(diq $$0) {
      return eus.b()
         .a(
            eur.a()
               .a(eyr.a(1.0F))
               .a(
                  (evd.a<?>)this.a(
                     $$0, eva.a($$0).a(List.of(2, 3, 4), $$1 -> ews.a(eyr.a((float)$$1.intValue())).a(exx.a($$0).a(ee.a.a().a(djf.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eus.a o(diq $$0) {
      return eus.b()
         .a(
            eur.a()
               .a(eyr.a(1.0F))
               .a(
                  (evd.a<?>)this.a(
                     $$0,
                     eva.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ews.a(eyr.a((float)$$1.intValue())).a(exx.a($$0).a(ee.a.a().a(doc.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eus.a p(diq $$0) {
      return eus.b().a(eur.a().a(eyr.a(1.0F)).a(eva.a($$0)));
   }

   public static eus.a d() {
      return eus.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<ali<eus>, eus.a> $$0) {
      this.e();
      Set<ali<eus>> $$1 = new HashSet<>();

      for (diq $$2 : lz.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((ali<eus>)$$3)) {
                  eus.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lz.e.b($$2)));
                  }

                  $$0.accept((ali<eus>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(diq $$0, diq $$1) {
      js.b<dcd> $$2 = this.a.d(ma.aM);
      eus.a $$3 = this.c($$0, eva.a($$0).a(exn.a($$2.b(dci.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eus.a q(diq $$0) {
      return this.a($$0, dkw.f, dwq.b);
   }

   protected void r(diq $$0) {
      this.a($$0, $$0x -> this.d((dfl)((dls)$$0x).b()));
   }

   protected void c(diq $$0, diq $$1) {
      this.a($$0, this.c((dfl)$$1));
   }

   protected void c(diq $$0, dfl $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(diq $$0) {
      this.c($$0, $$0);
   }

   protected void t(diq $$0) {
      this.c($$0, (dfl)$$0);
   }

   protected void a(diq $$0, Function<diq, eus.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(diq $$0, eus.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
