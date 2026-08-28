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
   protected final Set<cxg> b;
   protected final cso c;
   protected final Map<aly<ewm>, ewm.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezs.a a() {
      js.b<ddr> $$0 = this.a.d(mb.aN);
      return ezz.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(ddw.v), dj.d.b(1))))));
   }

   protected ezs.a b() {
      return this.a().invert();
   }

   protected ezs.a c() {
      return ezz.a(cu.a.a().a(this.a.d(mb.K), cxo.sJ));
   }

   private ezs.a f() {
      return this.c().or(this.a());
   }

   private ezs.a g() {
      return this.f().invert();
   }

   protected ne(Set<cxg> $$0, cso $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ne(Set<cxg> $$0, cso $$1, Map<aly<ewm>, ewm.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exr<T>> T a(dgz $$0, exr<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exf.c()) : $$1.c();
   }

   protected <T extends ezk<T>> T a(dgz $$0, ezk<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ezo.c()) : $$1.d();
   }

   public ewm.a a(dgz $$0) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0))));
   }

   private static ewm.a a(dke $$0, ezs.a $$1, ewx.a<?> $$2) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a($$1).a($$2)));
   }

   protected ewm.a a(dke $$0, ewx.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ewm.a b(dke $$0, ewx.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ewm.a c(dke $$0, ewx.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ewm.a a(dke $$0, dgz $$1) {
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a($$1)));
   }

   protected ewm.a a(dgz $$0, fao $$1) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a((ewx.a<?>)this.a($$0, ewu.a($$0).a(eym.a($$1)))));
   }

   protected ewm.a a(dke $$0, dgz $$1, fao $$2) {
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a($$1).a(eym.a($$2))));
   }

   private ewm.a c(dgz $$0) {
      return ewm.b().a(ewl.a().a(this.a()).a(fal.a(1.0F)).a(ewu.a($$0)));
   }

   private ewm.a d(dgz $$0) {
      return ewm.b().a(this.a(dkg.gf, ewl.a().a(fal.a(1.0F)).a(ewu.a(dkg.gf)))).a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0))));
   }

   protected ewm.a a(dke $$0) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a((ewx.a<?>)this.a((dgz)$$0, ewu.a($$0).a(eym.a(fal.a(2.0F)).a(ezr.a($$0).a(ee.a.a().a(drk.b, dyu.c)))))));
   }

   protected <T extends Comparable<T> & bba> ewm.a a(dke $$0, dyp<T> $$1, T $$2) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a(ezr.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected ewm.a b(dke $$0) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a(exh.a(exh.b.a).a(ku.g)))));
   }

   protected ewm.a c(dke $$0) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a(exh.a(exh.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected ewm.a d(dke $$0) {
      js.b<ddr> $$1 = this.a.d(mb.aN);
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a(cxo.pc).a(eym.a(fas.a(2.0F, 5.0F))).a(exe.a($$1.b(ddw.x)))));
   }

   protected ewm.a e(dke $$0) {
      js.b<ddr> $$1 = this.a.d(mb.aN);
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a(cxo.oX).a(eym.a(fas.a(4.0F, 9.0F))).a(exe.a($$1.b(ddw.x)))));
   }

   protected ewm.a f(dke $$0) {
      js.b<ddr> $$1 = this.a.d(mb.aN);
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a(cxo.lV).a(eym.a(fas.a(4.0F, 5.0F))).a(exe.b($$1.b(ddw.x)))));
   }

   protected ewm.a g(dke $$0) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a(exh.a(exh.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected ewm.a h(dke $$0) {
      return ewm.b().a(ewl.a().a(this.a()).a(fal.a(1.0F)).a(ewu.a($$0).a(exh.a(exh.b.a).a(ku.an)).a(exg.a($$0).a(djy.c))));
   }

   protected ewm.a i(dke $$0) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a(ewu.a($$0).a(this.a()).a(exh.a(exh.b.a).a(ku.an)).a(exg.a($$0).a(djy.c)).a(ewu.a($$0))));
   }

   protected ewm.a j(dke $$0) {
      return ewm.b().a(ewl.a().a(ewu.a(cxo.xm)).a(ezr.a($$0).a(ee.a.a().a(dlb.t_, true))));
   }

   protected ewm.a a(dke $$0, cxg $$1) {
      js.b<ddr> $$2 = this.a.d(mb.aN);
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a($$1).a(exe.a($$2.b(ddw.x)))));
   }

   protected ewm.a b(dke $$0, dgz $$1) {
      return this.a($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a($$1).a(eym.a(fas.a(-6.0F, 2.0F))).a(exs.a(ewg.b(0)))));
   }

   protected ewm.a k(dke $$0) {
      js.b<ddr> $$1 = this.a.d(mb.aN);
      return this.b($$0, (ewx.a<?>)this.a((dgz)$$0, ewu.a(cxo.pR).a(ezx.a(0.125F)).a(exe.a($$1.b(ddw.x), 2))));
   }

   public ewm.a b(dke $$0, cxg $$1) {
      return ewm.b()
         .a(
            this.a(
               $$0,
               ewl.a()
                  .a(fal.a(1.0F))
                  .a(ewu.a($$1).a(dsd.c.a(), $$1x -> eym.a(fak.a(3, (float)($$1x + 1) / 15.0F)).a(ezr.a($$0).a(ee.a.a().a(dsd.c, $$1x.intValue())))))
            )
         );
   }

   public ewm.a c(dke $$0, cxg $$1) {
      return ewm.b().a(this.a($$0, ewl.a().a(fal.a(1.0F)).a(ewu.a($$1).a(eym.a(fak.a(3, 0.53333336F))))));
   }

   protected ewm.a b(dgz $$0) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a(this.c()).a(ewu.a($$0)));
   }

   protected ewm.a a(dke $$0, ezs.a $$1) {
      return ewm.b()
         .a(
            ewl.a()
               .a(
                  (ewx.a<?>)this.a(
                     (dgz)$$0,
                     ewu.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> eym.a(fal.a(1.0F), true).a(ezr.a($$0).a(ee.a.a().a(dpg.b($$1x), true))))
                        .a(eym.a(fal.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewm.a l(dke $$0) {
      return ewm.b().a(ewl.a().a((ewx.a<?>)this.a($$0, ewu.a($$0).a(ezr.a($$0).a(ee.a.a().a(dpe.b, true))))));
   }

   protected ewm.a a(dke $$0, dke $$1, float... $$2) {
      js.b<ddr> $$3 = this.a.d(mb.aN);
      return this.c($$0, ((ewz.a)this.a((dgz)$$0, ewu.a($$1))).a(ezh.a($$3.b(ddw.x), $$2)))
         .a(ewl.a().a(fal.a(1.0F)).a(this.g()).a(((ewz.a)this.a((dgz)$$0, ewu.a(cxo.pM).a(eym.a(fas.a(1.0F, 2.0F))))).a(ezh.a($$3.b(ddw.x), f))));
   }

   protected ewm.a b(dke $$0, dke $$1, float... $$2) {
      js.b<ddr> $$3 = this.a.d(mb.aN);
      return this.a($$0, $$1, $$2)
         .a(
            ewl.a()
               .a(fal.a(1.0F))
               .a(this.g())
               .a(((ewz.a)this.a((dgz)$$0, ewu.a(cxo.oQ))).a(ezh.a($$3.b(ddw.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ewm.a m(dke $$0) {
      js.b<ddr> $$1 = this.a.d(mb.aN);
      return this.c($$0, ((ewz.a)this.a((dgz)dkg.aS, ewu.a(cxo.pM).a(eym.a(fas.a(1.0F, 2.0F))))).a(ezh.a($$1.b(ddw.x), f)));
   }

   protected ewm.a a(dke $$0, cxg $$1, cxg $$2, ezs.a $$3) {
      js.b<ddr> $$4 = this.a.d(mb.aN);
      return this.a((dgz)$$0, ewm.b().a(ewl.a().a(ewu.a($$1).a($$3).a(ewu.a($$2)))).a(ewl.a().a($$3).a(ewu.a($$2).a(exe.a($$4.b(ddw.x), 0.5714286F, 3)))));
   }

   protected ewm.a n(dke $$0) {
      return ewm.b().a(ewl.a().a(this.c()).a(ewu.a($$0).a(eym.a(fal.a(2.0F)))));
   }

   protected ewm.a a(dke $$0, dke $$1) {
      js.b<dke> $$2 = this.a.d(mb.f);
      ewx.a<?> $$3 = ewu.a($$1).a(eym.a(fal.a(2.0F))).a(this.c()).a(((ewz.a)this.a((dgz)$$0, ewu.a(cxo.pR))).a(ezx.a(0.125F)));
      return ewm.b()
         .a(ewl.a().a($$3).a(ezr.a($$0).a(ee.a.a().a(dmo.b, dyi.b))).a(ezq.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmo.b, dyi.a))), new jh(0, 1, 0))))
         .a(ewl.a().a($$3).a(ezr.a($$0).a(ee.a.a().a(dmo.b, dyi.a))).a(ezq.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmo.b, dyi.b))), new jh(0, -1, 0))));
   }

   protected ewm.a o(dke $$0) {
      return ewm.b()
         .a(
            ewl.a()
               .a(fal.a(1.0F))
               .a(
                  (ewx.a<?>)this.a(
                     $$0, ewu.a($$0).a(List.of(2, 3, 4), $$1 -> eym.a(fal.a((float)$$1.intValue())).a(ezr.a($$0).a(ee.a.a().a(dku.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ewm.a p(dke $$0) {
      return ewm.b()
         .a(
            ewl.a()
               .a(fal.a(1.0F))
               .a(
                  (ewx.a<?>)this.a(
                     $$0,
                     ewu.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eym.a(fal.a((float)$$1.intValue())).a(ezr.a($$0).a(ee.a.a().a(dpt.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ewm.a q(dke $$0) {
      return ewm.b().a(ewl.a().a(fal.a(1.0F)).a(ewu.a($$0)));
   }

   public static ewm.a d() {
      return ewm.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<aly<ewm>, ewm.a> $$0) {
      this.e();
      Set<aly<ewm>> $$1 = new HashSet<>();

      for (dke $$2 : ma.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((aly<ewm>)$$3)) {
                  ewm.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), ma.e.b($$2)));
                  }

                  $$0.accept((aly<ewm>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dke $$0, dke $$1) {
      js.b<ddr> $$2 = this.a.d(mb.aN);
      ewm.a $$3 = this.c($$0, ewu.a($$0).a(ezh.a($$2.b(ddw.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ewm.a r(dke $$0) {
      return this.a($$0, dmm.f, dyi.b);
   }

   protected void s(dke $$0) {
      this.a($$0, $$0x -> this.d((dgz)((dni)$$0x).b()));
   }

   protected void c(dke $$0, dke $$1) {
      this.a($$0, this.c((dgz)$$1));
   }

   protected void c(dke $$0, dgz $$1) {
      this.a($$0, this.a($$1));
   }

   protected void t(dke $$0) {
      this.c($$0, $$0);
   }

   protected void u(dke $$0) {
      this.c($$0, (dgz)$$0);
   }

   protected void a(dke $$0, Function<dke, ewm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dke $$0, ewm.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
