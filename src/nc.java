import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nc implements nf {
   protected final js.a a;
   protected final Set<cxc> b;
   protected final csk c;
   protected final Map<alo<ewn>, ewn.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ezr.a a() {
      js.b<ddq> $$0 = this.a.d(mb.aO);
      return ezy.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(ddv.v), dj.d.b(1))))));
   }

   protected ezr.a b() {
      return this.a().invert();
   }

   protected ezr.a c() {
      return ezy.a(cu.a.a().a(this.a.d(mb.K), cxk.sS));
   }

   private ezr.a f() {
      return this.c().or(this.a());
   }

   private ezr.a g() {
      return this.f().invert();
   }

   protected nc(Set<cxc> $$0, csk $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nc(Set<cxc> $$0, csk $$1, Map<alo<ewn>, ewn.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends exs<T>> T a(dgy $$0, exs<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exg.c()) : $$1.c();
   }

   protected <T extends ezj<T>> T a(dgy $$0, ezj<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(ezn.c()) : $$1.d();
   }

   public ewn.a a(dgy $$0) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0))));
   }

   private static ewn.a a(dkd $$0, ezr.a $$1, ewy.a<?> $$2) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a($$1).a($$2)));
   }

   protected ewn.a a(dkd $$0, ewy.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ewn.a b(dkd $$0, ewy.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ewn.a c(dkd $$0, ewy.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ewn.a a(dkd $$0, dgy $$1) {
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a($$1)));
   }

   protected ewn.a a(dgy $$0, fan $$1) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a((ewy.a<?>)this.a($$0, ewv.a($$0).a(eyn.a($$1)))));
   }

   protected ewn.a a(dkd $$0, dgy $$1, fan $$2) {
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a($$1).a(eyn.a($$2))));
   }

   private ewn.a d(dgy $$0) {
      return ewn.b().a(ewm.a().a(this.a()).a(fak.a(1.0F)).a(ewv.a($$0)));
   }

   private ewn.a e(dgy $$0) {
      return ewn.b().a(this.a(dkf.gm, ewm.a().a(fak.a(1.0F)).a(ewv.a(dkf.gm)))).a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0))));
   }

   protected ewn.a a(dkd $$0) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a((ewy.a<?>)this.a((dgy)$$0, ewv.a($$0).a(eyn.a(fak.a(2.0F)).a(ezq.a($$0).a(ee.a.a().a(drl.b, dyv.c)))))));
   }

   protected <T extends Comparable<T> & baq> ewn.a a(dkd $$0, dyq<T> $$1, T $$2) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a(ezq.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected ewn.a b(dkd $$0) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a(exi.a(exi.b.a).a(ku.g)))));
   }

   protected ewn.a c(dkd $$0) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a(exi.a(exi.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected ewn.a d(dkd $$0) {
      js.b<ddq> $$1 = this.a.d(mb.aO);
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a(cxk.pl).a(eyn.a(far.a(2.0F, 5.0F))).a(exf.a($$1.b(ddv.x)))));
   }

   protected ewn.a e(dkd $$0) {
      js.b<ddq> $$1 = this.a.d(mb.aO);
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a(cxk.pg).a(eyn.a(far.a(4.0F, 9.0F))).a(exf.a($$1.b(ddv.x)))));
   }

   protected ewn.a f(dkd $$0) {
      js.b<ddq> $$1 = this.a.d(mb.aO);
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a(cxk.me).a(eyn.a(far.a(4.0F, 5.0F))).a(exf.b($$1.b(ddv.x)))));
   }

   protected ewn.a g(dkd $$0) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a(exi.a(exi.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected ewn.a h(dkd $$0) {
      return ewn.b().a(ewm.a().a(this.a()).a(fak.a(1.0F)).a(ewv.a($$0).a(exi.a(exi.b.a).a(ku.an)).a(exh.a($$0).a(djx.c))));
   }

   protected ewn.a i(dkd $$0) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a(ewv.a($$0).a(this.a()).a(exi.a(exi.b.a).a(ku.an)).a(exh.a($$0).a(djx.c)).a(ewv.a($$0))));
   }

   protected ewn.a j(dkd $$0) {
      return ewn.b().a(ewm.a().a(ewv.a(cxk.xw)).a(ezq.a($$0).a(ee.a.a().a(dla.t_, true))));
   }

   protected ewn.a a(dkd $$0, cxc $$1) {
      js.b<ddq> $$2 = this.a.d(mb.aO);
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a($$1).a(exf.a($$2.b(ddv.x)))));
   }

   protected ewn.a b(dkd $$0, dgy $$1) {
      return this.a($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a($$1).a(eyn.a(far.a(-6.0F, 2.0F))).a(ext.a(ewh.b(0)))));
   }

   protected ewn.a k(dkd $$0) {
      js.b<ddq> $$1 = this.a.d(mb.aO);
      return this.b($$0, (ewy.a<?>)this.a((dgy)$$0, ewv.a(cxk.qa).a(ezw.a(0.125F)).a(exf.a($$1.b(ddv.x), 2))));
   }

   public ewn.a b(dkd $$0, cxc $$1) {
      return ewn.b()
         .a(
            this.a(
               $$0,
               ewm.a()
                  .a(fak.a(1.0F))
                  .a(ewv.a($$1).a(dse.c.a(), $$1x -> eyn.a(faj.a(3, (float)($$1x + 1) / 15.0F)).a(ezq.a($$0).a(ee.a.a().a(dse.c, $$1x.intValue())))))
            )
         );
   }

   public ewn.a c(dkd $$0, cxc $$1) {
      return ewn.b().a(this.a($$0, ewm.a().a(fak.a(1.0F)).a(ewv.a($$1).a(eyn.a(faj.a(3, 0.53333336F))))));
   }

   protected ewn.a b(dgy $$0) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a(this.c()).a(ewv.a($$0)));
   }

   protected ewn.a c(dgy $$0) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a(this.f()).a(ewv.a($$0)));
   }

   protected ewn.a a(dkd $$0, ezr.a $$1) {
      return ewn.b()
         .a(
            ewm.a()
               .a(
                  (ewy.a<?>)this.a(
                     (dgy)$$0,
                     ewv.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> eyn.a(fak.a(1.0F), true).a(ezq.a($$0).a(ee.a.a().a(dpf.b($$1x), true))))
                        .a(eyn.a(fak.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewn.a l(dkd $$0) {
      return ewn.b()
         .a(
            ewm.a()
               .a(
                  (ewy.a<?>)this.a(
                     (dgy)$$0,
                     ewv.a($$0).a(jm.values(), $$1 -> eyn.a(fak.a(1.0F), true).a(ezq.a($$0).a(ee.a.a().a(dpf.b($$1), true)))).a(eyn.a(fak.a(-1.0F), true))
                  )
               )
         );
   }

   protected ewn.a m(dkd $$0) {
      return ewn.b().a(ewm.a().a((ewy.a<?>)this.a($$0, ewv.a($$0).a(ezq.a($$0).a(ee.a.a().a(dpd.b, true))))));
   }

   protected ewn.a a(dkd $$0, dkd $$1, float... $$2) {
      js.b<ddq> $$3 = this.a.d(mb.aO);
      return this.c($$0, ((exa.a)this.a((dgy)$$0, ewv.a($$1))).a(ezg.a($$3.b(ddv.x), $$2)))
         .a(ewm.a().a(fak.a(1.0F)).a(this.g()).a(((exa.a)this.a((dgy)$$0, ewv.a(cxk.pV).a(eyn.a(far.a(1.0F, 2.0F))))).a(ezg.a($$3.b(ddv.x), f))));
   }

   protected ewn.a b(dkd $$0, dkd $$1, float... $$2) {
      js.b<ddq> $$3 = this.a.d(mb.aO);
      return this.a($$0, $$1, $$2)
         .a(
            ewm.a()
               .a(fak.a(1.0F))
               .a(this.g())
               .a(((exa.a)this.a((dgy)$$0, ewv.a(cxk.oZ))).a(ezg.a($$3.b(ddv.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ewn.a n(dkd $$0) {
      js.b<ddq> $$1 = this.a.d(mb.aO);
      return this.c($$0, ((exa.a)this.a((dgy)dkf.aS, ewv.a(cxk.pV).a(eyn.a(far.a(1.0F, 2.0F))))).a(ezg.a($$1.b(ddv.x), f)));
   }

   protected ewn.a a(dkd $$0, cxc $$1, cxc $$2, ezr.a $$3) {
      js.b<ddq> $$4 = this.a.d(mb.aO);
      return this.a((dgy)$$0, ewn.b().a(ewm.a().a(ewv.a($$1).a($$3).a(ewv.a($$2)))).a(ewm.a().a($$3).a(ewv.a($$2).a(exf.a($$4.b(ddv.x), 0.5714286F, 3)))));
   }

   protected ewn.a o(dkd $$0) {
      return ewn.b().a(ewm.a().a(this.c()).a(ewv.a($$0).a(eyn.a(fak.a(2.0F)))));
   }

   protected ewn.a a(dkd $$0, dkd $$1) {
      js.b<dkd> $$2 = this.a.d(mb.f);
      ewy.a<?> $$3 = ewv.a($$1).a(eyn.a(fak.a(2.0F))).a(this.c()).a(((exa.a)this.a((dgy)$$0, ewv.a(cxk.qa))).a(ezw.a(0.125F)));
      return ewn.b()
         .a(ewm.a().a($$3).a(ezq.a($$0).a(ee.a.a().a(dmm.b, dyj.b))).a(ezp.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmm.b, dyj.a))), new jh(0, 1, 0))))
         .a(ewm.a().a($$3).a(ezq.a($$0).a(ee.a.a().a(dmm.b, dyj.a))).a(ezp.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dmm.b, dyj.b))), new jh(0, -1, 0))));
   }

   protected ewn.a p(dkd $$0) {
      return ewn.b()
         .a(
            ewm.a()
               .a(fak.a(1.0F))
               .a(
                  (ewy.a<?>)this.a(
                     $$0, ewv.a($$0).a(List.of(2, 3, 4), $$1 -> eyn.a(fak.a((float)$$1.intValue())).a(ezq.a($$0).a(ee.a.a().a(dkt.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ewn.a q(dkd $$0) {
      return ewn.b()
         .a(
            ewm.a()
               .a(fak.a(1.0F))
               .a(
                  (ewy.a<?>)this.a(
                     $$0,
                     ewv.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eyn.a(fak.a((float)$$1.intValue())).a(ezq.a($$0).a(ee.a.a().a(dpu.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ewn.a r(dkd $$0) {
      return ewn.b().a(ewm.a().a(fak.a(1.0F)).a(ewv.a($$0)));
   }

   public static ewn.a d() {
      return ewn.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alo<ewn>, ewn.a> $$0) {
      this.e();
      Set<alo<ewn>> $$1 = new HashSet<>();

      for (dkd $$2 : ma.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alo<ewn>)$$3)) {
                  ewn.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), ma.e.b($$2)));
                  }

                  $$0.accept((alo<ewn>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dkd $$0, dkd $$1) {
      js.b<ddq> $$2 = this.a.d(mb.aO);
      ewn.a $$3 = this.c($$0, ewv.a($$0).a(ezg.a($$2.b(ddv.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ewn.a s(dkd $$0) {
      return this.a($$0, dmk.f, dyj.b);
   }

   protected void t(dkd $$0) {
      this.a($$0, $$0x -> this.e((dgy)((dnh)$$0x).b()));
   }

   protected void c(dkd $$0, dkd $$1) {
      this.a($$0, this.d((dgy)$$1));
   }

   protected void c(dkd $$0, dgy $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dkd $$0) {
      this.c($$0, $$0);
   }

   protected void v(dkd $$0) {
      this.c($$0, (dgy)$$0);
   }

   protected void a(dkd $$0, Function<dkd, ewn.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dkd $$0, ewn.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
