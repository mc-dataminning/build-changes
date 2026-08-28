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
   protected final Set<cwb> b;
   protected final crj c;
   protected final Map<alk<eul>, eul.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected exr.a a() {
      js.b<dbw> $$0 = this.a.d(ma.aM);
      return exy.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(dcb.v), dj.d.b(1))))));
   }

   protected exr.a b() {
      return this.a().invert();
   }

   protected exr.a c() {
      return exy.a(cu.a.a().a(this.a.d(ma.K), cwj.sm));
   }

   private exr.a f() {
      return this.c().or(this.a());
   }

   private exr.a g() {
      return this.f().invert();
   }

   protected nb(Set<cwb> $$0, crj $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nb(Set<cwb> $$0, crj $$1, Map<alk<eul>, eul.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends evq<T>> T a(dfe $$0, evq<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eve.c()) : $$1.c();
   }

   protected <T extends exj<T>> T a(dfe $$0, exj<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exn.c()) : $$1.d();
   }

   public eul.a a(dfe $$0) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0))));
   }

   private static eul.a a(dij $$0, exr.a $$1, euw.a<?> $$2) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a($$1).a($$2)));
   }

   protected eul.a a(dij $$0, euw.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eul.a b(dij $$0, euw.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected eul.a c(dij $$0, euw.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected eul.a a(dij $$0, dfe $$1) {
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a($$1)));
   }

   protected eul.a a(dfe $$0, eyn $$1) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a((euw.a<?>)this.a($$0, eut.a($$0).a(ewl.a($$1)))));
   }

   protected eul.a a(dij $$0, dfe $$1, eyn $$2) {
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a($$1).a(ewl.a($$2))));
   }

   private eul.a c(dfe $$0) {
      return eul.b().a(euk.a().a(this.a()).a(eyk.a(1.0F)).a(eut.a($$0)));
   }

   private eul.a d(dfe $$0) {
      return eul.b().a(this.a(dil.fR, euk.a().a(eyk.a(1.0F)).a(eut.a(dil.fR)))).a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0))));
   }

   protected eul.a a(dij $$0) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a((euw.a<?>)this.a((dfe)$$0, eut.a($$0).a(ewl.a(eyk.a(2.0F)).a(exq.a($$0).a(ee.a.a().a(dpm.b, dwv.c)))))));
   }

   protected <T extends Comparable<T> & baj> eul.a a(dij $$0, dwq<T> $$1, T $$2) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a(exq.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected eul.a b(dij $$0) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a(evg.a(evg.b.a).a(ku.g)))));
   }

   protected eul.a c(dij $$0) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a(evg.a(evg.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected eul.a d(dij $$0) {
      js.b<dbw> $$1 = this.a.d(ma.aM);
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a(cwj.oH).a(ewl.a(eyr.a(2.0F, 5.0F))).a(evd.a($$1.b(dcb.x)))));
   }

   protected eul.a e(dij $$0) {
      js.b<dbw> $$1 = this.a.d(ma.aM);
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a(cwj.oC).a(ewl.a(eyr.a(4.0F, 9.0F))).a(evd.a($$1.b(dcb.x)))));
   }

   protected eul.a f(dij $$0) {
      js.b<dbw> $$1 = this.a.d(ma.aM);
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a(cwj.lH).a(ewl.a(eyr.a(4.0F, 5.0F))).a(evd.b($$1.b(dcb.x)))));
   }

   protected eul.a g(dij $$0) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a(evg.a(evg.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected eul.a h(dij $$0) {
      return eul.b().a(euk.a().a(this.a()).a(eyk.a(1.0F)).a(eut.a($$0).a(evg.a(evg.b.a).a(ku.an)).a(evf.a($$0).a(did.c))));
   }

   protected eul.a i(dij $$0) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a(eut.a($$0).a(this.a()).a(evg.a(evg.b.a).a(ku.an)).a(evf.a($$0).a(did.c)).a(eut.a($$0))));
   }

   protected eul.a j(dij $$0) {
      return eul.b().a(euk.a().a(eut.a(cwj.wO)).a(exq.a($$0).a(ee.a.a().a(djf.v_, true))));
   }

   protected eul.a a(dij $$0, cwb $$1) {
      js.b<dbw> $$2 = this.a.d(ma.aM);
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a($$1).a(evd.a($$2.b(dcb.x)))));
   }

   protected eul.a b(dij $$0, dfe $$1) {
      return this.a($$0, (euw.a<?>)this.a((dfe)$$0, eut.a($$1).a(ewl.a(eyr.a(-6.0F, 2.0F))).a(evr.a(euf.b(0)))));
   }

   protected eul.a k(dij $$0) {
      js.b<dbw> $$1 = this.a.d(ma.aM);
      return this.b($$0, (euw.a<?>)this.a((dfe)$$0, eut.a(cwj.pw).a(exw.a(0.125F)).a(evd.a($$1.b(dcb.x), 2))));
   }

   public eul.a b(dij $$0, cwb $$1) {
      return eul.b()
         .a(
            this.a(
               $$0,
               euk.a()
                  .a(eyk.a(1.0F))
                  .a(eut.a($$1).a(dqf.c.a(), $$1x -> ewl.a(eyj.a(3, (float)($$1x + 1) / 15.0F)).a(exq.a($$0).a(ee.a.a().a(dqf.c, $$1x.intValue())))))
            )
         );
   }

   public eul.a c(dij $$0, cwb $$1) {
      return eul.b().a(this.a($$0, euk.a().a(eyk.a(1.0F)).a(eut.a($$1).a(ewl.a(eyj.a(3, 0.53333336F))))));
   }

   protected eul.a b(dfe $$0) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a(this.c()).a(eut.a($$0)));
   }

   protected eul.a a(dij $$0, exr.a $$1) {
      return eul.b()
         .a(
            euk.a()
               .a(
                  (euw.a<?>)this.a(
                     (dfe)$$0,
                     eut.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> ewl.a(eyk.a(1.0F), true).a(exq.a($$0).a(ee.a.a().a(dni.b($$1x), true))))
                        .a(ewl.a(eyk.a(-1.0F), true))
                  )
               )
         );
   }

   protected eul.a a(dij $$0, dij $$1, float... $$2) {
      js.b<dbw> $$3 = this.a.d(ma.aM);
      return this.c($$0, ((euy.a)this.a((dfe)$$0, eut.a($$1))).a(exg.a($$3.b(dcb.x), $$2)))
         .a(euk.a().a(eyk.a(1.0F)).a(this.g()).a(((euy.a)this.a((dfe)$$0, eut.a(cwj.pr).a(ewl.a(eyr.a(1.0F, 2.0F))))).a(exg.a($$3.b(dcb.x), f))));
   }

   protected eul.a b(dij $$0, dij $$1, float... $$2) {
      js.b<dbw> $$3 = this.a.d(ma.aM);
      return this.a($$0, $$1, $$2)
         .a(
            euk.a()
               .a(eyk.a(1.0F))
               .a(this.g())
               .a(((euy.a)this.a((dfe)$$0, eut.a(cwj.ov))).a(exg.a($$3.b(dcb.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eul.a l(dij $$0) {
      js.b<dbw> $$1 = this.a.d(ma.aM);
      return this.c($$0, ((euy.a)this.a((dfe)dil.aL, eut.a(cwj.pr).a(ewl.a(eyr.a(1.0F, 2.0F))))).a(exg.a($$1.b(dcb.x), f)));
   }

   protected eul.a a(dij $$0, cwb $$1, cwb $$2, exr.a $$3) {
      js.b<dbw> $$4 = this.a.d(ma.aM);
      return this.a((dfe)$$0, eul.b().a(euk.a().a(eut.a($$1).a($$3).a(eut.a($$2)))).a(euk.a().a($$3).a(eut.a($$2).a(evd.a($$4.b(dcb.x), 0.5714286F, 3)))));
   }

   protected eul.a m(dij $$0) {
      return eul.b().a(euk.a().a(this.c()).a(eut.a($$0).a(ewl.a(eyk.a(2.0F)))));
   }

   protected eul.a a(dij $$0, dij $$1) {
      js.b<dij> $$2 = this.a.d(ma.f);
      euw.a<?> $$3 = eut.a($$1).a(ewl.a(eyk.a(2.0F))).a(this.c()).a(((euy.a)this.a((dfe)$$0, eut.a(cwj.pw))).a(exw.a(0.125F)));
      return eul.b()
         .a(euk.a().a($$3).a(exq.a($$0).a(ee.a.a().a(dkr.b, dwj.b))).a(exp.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dkr.b, dwj.a))), new jh(0, 1, 0))))
         .a(euk.a().a($$3).a(exq.a($$0).a(ee.a.a().a(dkr.b, dwj.a))).a(exp.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dkr.b, dwj.b))), new jh(0, -1, 0))));
   }

   protected eul.a n(dij $$0) {
      return eul.b()
         .a(
            euk.a()
               .a(eyk.a(1.0F))
               .a(
                  (euw.a<?>)this.a(
                     $$0, eut.a($$0).a(List.of(2, 3, 4), $$1 -> ewl.a(eyk.a((float)$$1.intValue())).a(exq.a($$0).a(ee.a.a().a(diy.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eul.a o(dij $$0) {
      return eul.b()
         .a(
            euk.a()
               .a(eyk.a(1.0F))
               .a(
                  (euw.a<?>)this.a(
                     $$0,
                     eut.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ewl.a(eyk.a((float)$$1.intValue())).a(exq.a($$0).a(ee.a.a().a(dnv.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eul.a p(dij $$0) {
      return eul.b().a(euk.a().a(eyk.a(1.0F)).a(eut.a($$0)));
   }

   public static eul.a d() {
      return eul.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alk<eul>, eul.a> $$0) {
      this.e();
      Set<alk<eul>> $$1 = new HashSet<>();

      for (dij $$2 : lz.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alk<eul>)$$3)) {
                  eul.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lz.e.b($$2)));
                  }

                  $$0.accept((alk<eul>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dij $$0, dij $$1) {
      js.b<dbw> $$2 = this.a.d(ma.aM);
      eul.a $$3 = this.c($$0, eut.a($$0).a(exg.a($$2.b(dcb.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eul.a q(dij $$0) {
      return this.a($$0, dkp.f, dwj.b);
   }

   protected void r(dij $$0) {
      this.a($$0, $$0x -> this.d((dfe)((dll)$$0x).b()));
   }

   protected void c(dij $$0, dij $$1) {
      this.a($$0, this.c((dfe)$$1));
   }

   protected void c(dij $$0, dfe $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dij $$0) {
      this.c($$0, $$0);
   }

   protected void t(dij $$0) {
      this.c($$0, (dfe)$$0);
   }

   protected void a(dij $$0, Function<dij, eul.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dij $$0, eul.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
