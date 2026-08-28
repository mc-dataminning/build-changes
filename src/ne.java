import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class ne implements nh {
   protected final js.a a;
   protected final Set<cxl> b;
   protected final cst c;
   protected final Map<aly<ewu>, ewu.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezy.a a() {
      js.b<ddz> $$0 = this.a.d(mb.aO);
      return faf.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(dee.v), dj.d.b(1))))));
   }

   protected ezy.a b() {
      return this.a().invert();
   }

   protected ezy.a c() {
      return faf.a(cu.a.a().a(this.a.d(mb.K), cxt.sJ));
   }

   private ezy.a f() {
      return this.c().or(this.a());
   }

   private ezy.a g() {
      return this.f().invert();
   }

   protected ne(Set<cxl> $$0, cst $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ne(Set<cxl> $$0, cst $$1, Map<aly<ewu>, ewu.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exz<T>> T a(dhh $$0, exz<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exn.c()) : $$1.c();
   }

   protected <T extends ezq<T>> T a(dhh $$0, ezq<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ezu.c()) : $$1.d();
   }

   public ewu.a a(dhh $$0) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0))));
   }

   private static ewu.a a(dkm $$0, ezy.a $$1, exf.a<?> $$2) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a(exc.a($$0).a($$1).a($$2)));
   }

   protected ewu.a a(dkm $$0, exf.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ewu.a b(dkm $$0, exf.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ewu.a c(dkm $$0, exf.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ewu.a a(dkm $$0, dhh $$1) {
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a($$1)));
   }

   protected ewu.a a(dhh $$0, fau $$1) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a((exf.a<?>)this.a($$0, exc.a($$0).a(eyu.a($$1)))));
   }

   protected ewu.a a(dkm $$0, dhh $$1, fau $$2) {
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a($$1).a(eyu.a($$2))));
   }

   private ewu.a d(dhh $$0) {
      return ewu.b().a(ewt.a().a(this.a()).a(far.a(1.0F)).a(exc.a($$0)));
   }

   private ewu.a e(dhh $$0) {
      return ewu.b().a(this.a(dko.gf, ewt.a().a(far.a(1.0F)).a(exc.a(dko.gf)))).a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0))));
   }

   protected ewu.a a(dkm $$0) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a((exf.a<?>)this.a((dhh)$$0, exc.a($$0).a(eyu.a(far.a(2.0F)).a(ezx.a($$0).a(ee.a.a().a(drs.b, dzc.c)))))));
   }

   protected <T extends Comparable<T> & bba> ewu.a a(dkm $$0, dyx<T> $$1, T $$2) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0).a(ezx.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected ewu.a b(dkm $$0) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0).a(exp.a(exp.b.a).a(ku.g)))));
   }

   protected ewu.a c(dkm $$0) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0).a(exp.a(exp.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected ewu.a d(dkm $$0) {
      js.b<ddz> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a(cxt.pc).a(eyu.a(fay.a(2.0F, 5.0F))).a(exm.a($$1.b(dee.x)))));
   }

   protected ewu.a e(dkm $$0) {
      js.b<ddz> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a(cxt.oX).a(eyu.a(fay.a(4.0F, 9.0F))).a(exm.a($$1.b(dee.x)))));
   }

   protected ewu.a f(dkm $$0) {
      js.b<ddz> $$1 = this.a.d(mb.aO);
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a(cxt.lV).a(eyu.a(fay.a(4.0F, 5.0F))).a(exm.b($$1.b(dee.x)))));
   }

   protected ewu.a g(dkm $$0) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$0).a(exp.a(exp.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected ewu.a h(dkm $$0) {
      return ewu.b().a(ewt.a().a(this.a()).a(far.a(1.0F)).a(exc.a($$0).a(exp.a(exp.b.a).a(ku.an)).a(exo.a($$0).a(dkg.c))));
   }

   protected ewu.a i(dkm $$0) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a(exc.a($$0).a(this.a()).a(exp.a(exp.b.a).a(ku.an)).a(exo.a($$0).a(dkg.c)).a(exc.a($$0))));
   }

   protected ewu.a j(dkm $$0) {
      return ewu.b().a(ewt.a().a(exc.a(cxt.xm)).a(ezx.a($$0).a(ee.a.a().a(dlj.t_, true))));
   }

   protected ewu.a a(dkm $$0, cxl $$1) {
      js.b<ddz> $$2 = this.a.d(mb.aO);
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a($$1).a(exm.a($$2.b(dee.x)))));
   }

   protected ewu.a b(dkm $$0, dhh $$1) {
      return this.a($$0, (exf.a<?>)this.a((dhh)$$0, exc.a($$1).a(eyu.a(fay.a(-6.0F, 2.0F))).a(eya.a(ewo.b(0)))));
   }

   protected ewu.a k(dkm $$0) {
      js.b<ddz> $$1 = this.a.d(mb.aO);
      return this.b($$0, (exf.a<?>)this.a((dhh)$$0, exc.a(cxt.pR).a(fad.a(0.125F)).a(exm.a($$1.b(dee.x), 2))));
   }

   public ewu.a b(dkm $$0, cxl $$1) {
      return ewu.b()
         .a(
            this.a(
               $$0,
               ewt.a()
                  .a(far.a(1.0F))
                  .a(exc.a($$1).a(dsl.c.a(), $$1x -> eyu.a(faq.a(3, (float)($$1x + 1) / 15.0F)).a(ezx.a($$0).a(ee.a.a().a(dsl.c, $$1x.intValue())))))
            )
         );
   }

   public ewu.a c(dkm $$0, cxl $$1) {
      return ewu.b().a(this.a($$0, ewt.a().a(far.a(1.0F)).a(exc.a($$1).a(eyu.a(faq.a(3, 0.53333336F))))));
   }

   protected ewu.a b(dhh $$0) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a(this.c()).a(exc.a($$0)));
   }

   protected ewu.a c(dhh $$0) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a(this.f()).a(exc.a($$0)));
   }

   protected ewu.a a(dkm $$0, ezy.a $$1) {
      return ewu.b()
         .a(
            ewt.a()
               .a(
                  (exf.a<?>)this.a(
                     (dhh)$$0,
                     exc.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> eyu.a(far.a(1.0F), true).a(ezx.a($$0).a(ee.a.a().a(dpo.b($$1x), true))))
                        .a(eyu.a(far.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewu.a l(dkm $$0) {
      return ewu.b().a(ewt.a().a((exf.a<?>)this.a($$0, exc.a($$0).a(ezx.a($$0).a(ee.a.a().a(dpm.b, true))))));
   }

   protected ewu.a a(dkm $$0, dkm $$1, float... $$2) {
      js.b<ddz> $$3 = this.a.d(mb.aO);
      return this.c($$0, ((exh.a)this.a((dhh)$$0, exc.a($$1))).a(ezn.a($$3.b(dee.x), $$2)))
         .a(ewt.a().a(far.a(1.0F)).a(this.g()).a(((exh.a)this.a((dhh)$$0, exc.a(cxt.pM).a(eyu.a(fay.a(1.0F, 2.0F))))).a(ezn.a($$3.b(dee.x), f))));
   }

   protected ewu.a b(dkm $$0, dkm $$1, float... $$2) {
      js.b<ddz> $$3 = this.a.d(mb.aO);
      return this.a($$0, $$1, $$2)
         .a(
            ewt.a()
               .a(far.a(1.0F))
               .a(this.g())
               .a(((exh.a)this.a((dhh)$$0, exc.a(cxt.oQ))).a(ezn.a($$3.b(dee.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ewu.a m(dkm $$0) {
      js.b<ddz> $$1 = this.a.d(mb.aO);
      return this.c($$0, ((exh.a)this.a((dhh)dko.aS, exc.a(cxt.pM).a(eyu.a(fay.a(1.0F, 2.0F))))).a(ezn.a($$1.b(dee.x), f)));
   }

   protected ewu.a a(dkm $$0, cxl $$1, cxl $$2, ezy.a $$3) {
      js.b<ddz> $$4 = this.a.d(mb.aO);
      return this.a((dhh)$$0, ewu.b().a(ewt.a().a(exc.a($$1).a($$3).a(exc.a($$2)))).a(ewt.a().a($$3).a(exc.a($$2).a(exm.a($$4.b(dee.x), 0.5714286F, 3)))));
   }

   protected ewu.a n(dkm $$0) {
      return ewu.b().a(ewt.a().a(this.c()).a(exc.a($$0).a(eyu.a(far.a(2.0F)))));
   }

   protected ewu.a a(dkm $$0, dkm $$1) {
      js.b<dkm> $$2 = this.a.d(mb.f);
      exf.a<?> $$3 = exc.a($$1).a(eyu.a(far.a(2.0F))).a(this.c()).a(((exh.a)this.a((dhh)$$0, exc.a(cxt.pR))).a(fad.a(0.125F)));
      return ewu.b()
         .a(ewt.a().a($$3).a(ezx.a($$0).a(ee.a.a().a(dmw.b, dyq.b))).a(ezw.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmw.b, dyq.a))), new jh(0, 1, 0))))
         .a(ewt.a().a($$3).a(ezx.a($$0).a(ee.a.a().a(dmw.b, dyq.a))).a(ezw.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmw.b, dyq.b))), new jh(0, -1, 0))));
   }

   protected ewu.a o(dkm $$0) {
      return ewu.b()
         .a(
            ewt.a()
               .a(far.a(1.0F))
               .a(
                  (exf.a<?>)this.a(
                     $$0, exc.a($$0).a(List.of(2, 3, 4), $$1 -> eyu.a(far.a((float)$$1.intValue())).a(ezx.a($$0).a(ee.a.a().a(dlc.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ewu.a p(dkm $$0) {
      return ewu.b()
         .a(
            ewt.a()
               .a(far.a(1.0F))
               .a(
                  (exf.a<?>)this.a(
                     $$0,
                     exc.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eyu.a(far.a((float)$$1.intValue())).a(ezx.a($$0).a(ee.a.a().a(dqb.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ewu.a q(dkm $$0) {
      return ewu.b().a(ewt.a().a(far.a(1.0F)).a(exc.a($$0)));
   }

   public static ewu.a d() {
      return ewu.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<aly<ewu>, ewu.a> $$0) {
      this.e();
      Set<aly<ewu>> $$1 = new HashSet<>();

      for (dkm $$2 : ma.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((aly<ewu>)$$3)) {
                  ewu.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), ma.e.b($$2)));
                  }

                  $$0.accept((aly<ewu>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dkm $$0, dkm $$1) {
      js.b<ddz> $$2 = this.a.d(mb.aO);
      ewu.a $$3 = this.c($$0, exc.a($$0).a(ezn.a($$2.b(dee.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ewu.a r(dkm $$0) {
      return this.a($$0, dmu.f, dyq.b);
   }

   protected void s(dkm $$0) {
      this.a($$0, $$0x -> this.e((dhh)((dnq)$$0x).b()));
   }

   protected void c(dkm $$0, dkm $$1) {
      this.a($$0, this.d((dhh)$$1));
   }

   protected void c(dkm $$0, dhh $$1) {
      this.a($$0, this.a($$1));
   }

   protected void t(dkm $$0) {
      this.c($$0, $$0);
   }

   protected void u(dkm $$0) {
      this.c($$0, (dhh)$$0);
   }

   protected void a(dkm $$0, Function<dkm, ewu.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dkm $$0, ewu.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
