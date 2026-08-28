import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mw implements mz {
   protected final jp.a a;
   protected final Set<cvk> b;
   protected final cqn c;
   protected final Map<alb<etm>, etm.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ews.a a() {
      jp.b<dbk> $$0 = this.a.b(lv.aM);
      return ewz.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(dbp.v), dh.d.b(1))))));
   }

   protected ews.a b() {
      return this.a().invert();
   }

   protected ews.a c() {
      return ewz.a(cs.a.a().a(this.a.b(lv.K), cvt.rW));
   }

   private ews.a f() {
      return this.c().or(this.a());
   }

   private ews.a g() {
      return this.f().invert();
   }

   protected mw(Set<cvk> $$0, cqn $$1, jp.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mw(Set<cvk> $$0, cqn $$1, Map<alb<etm>, etm.a> $$2, jp.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends eur<T>> T a(def $$0, eur<T> $$1) {
      return !this.b.contains($$0.q()) ? $$1.b(euf.c()) : $$1.c();
   }

   protected <T extends ewk<T>> T a(def $$0, ewk<T> $$1) {
      return !this.b.contains($$0.q()) ? $$1.b(ewo.c()) : $$1.d();
   }

   public etm.a a(def $$0) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0))));
   }

   private static etm.a a(dhj $$0, ews.a $$1, etx.a<?> $$2) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a(etu.a($$0).a($$1).a($$2)));
   }

   protected etm.a a(dhj $$0, etx.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected etm.a b(dhj $$0, etx.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected etm.a c(dhj $$0, etx.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected etm.a a(dhj $$0, def $$1) {
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a($$1)));
   }

   protected etm.a a(def $$0, exo $$1) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a((etx.a<?>)this.a($$0, etu.a($$0).a(evm.a($$1)))));
   }

   protected etm.a a(dhj $$0, def $$1, exo $$2) {
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a($$1).a(evm.a($$2))));
   }

   private etm.a c(def $$0) {
      return etm.b().a(etl.a().a(this.a()).a(exl.a(1.0F)).a(etu.a($$0)));
   }

   private etm.a d(def $$0) {
      return etm.b().a(this.a(dhl.fR, etl.a().a(exl.a(1.0F)).a(etu.a(dhl.fR)))).a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0))));
   }

   protected etm.a a(dhj $$0) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a((etx.a<?>)this.a((def)$$0, etu.a($$0).a(evm.a(exl.a(2.0F)).a(ewr.a($$0).a(eb.a.a().a(don.b, dvw.c)))))));
   }

   protected <T extends Comparable<T> & azz> etm.a a(dhj $$0, dvr<T> $$1, T $$2) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0).a(ewr.a($$0).a(eb.a.a().a($$1, $$2))))));
   }

   protected etm.a b(dhj $$0) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0).a(euh.a(euh.b.a).a(kr.g)))));
   }

   protected etm.a c(dhj $$0) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0).a(euh.a(euh.b.a).a(kr.g).a(kr.ag).a(kr.aj).a(kr.ak)))));
   }

   protected etm.a d(dhj $$0) {
      jp.b<dbk> $$1 = this.a.b(lv.aM);
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a(cvt.oH).a(evm.a(exs.a(2.0F, 5.0F))).a(eue.a($$1.b(dbp.x)))));
   }

   protected etm.a e(dhj $$0) {
      jp.b<dbk> $$1 = this.a.b(lv.aM);
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a(cvt.oC).a(evm.a(exs.a(4.0F, 9.0F))).a(eue.a($$1.b(dbp.x)))));
   }

   protected etm.a f(dhj $$0) {
      jp.b<dbk> $$1 = this.a.b(lv.aM);
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a(cvt.lH).a(evm.a(exs.a(4.0F, 5.0F))).a(eue.b($$1.b(dbp.x)))));
   }

   protected etm.a g(dhj $$0) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$0).a(euh.a(euh.b.a).a(kr.g).a(kr.h).a(kr.p).a(kr.ad).a(kr.j)))));
   }

   protected etm.a h(dhj $$0) {
      return etm.b().a(etl.a().a(this.a()).a(exl.a(1.0F)).a(etu.a($$0).a(euh.a(euh.b.a).a(kr.ai)).a(eug.a($$0).a(dhd.c))));
   }

   protected etm.a i(dhj $$0) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a(etu.a($$0).a(this.a()).a(euh.a(euh.b.a).a(kr.ai)).a(eug.a($$0).a(dhd.c)).a(etu.a($$0))));
   }

   protected etm.a j(dhj $$0) {
      return etm.b().a(etl.a().a(etu.a(cvt.wy)).a(ewr.a($$0).a(eb.a.a().a(dif.v_, true))));
   }

   protected etm.a a(dhj $$0, cvk $$1) {
      jp.b<dbk> $$2 = this.a.b(lv.aM);
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a($$1).a(eue.a($$2.b(dbp.x)))));
   }

   protected etm.a b(dhj $$0, def $$1) {
      return this.a($$0, (etx.a<?>)this.a((def)$$0, etu.a($$1).a(evm.a(exs.a(-6.0F, 2.0F))).a(eus.a(etg.b(0)))));
   }

   protected etm.a k(dhj $$0) {
      jp.b<dbk> $$1 = this.a.b(lv.aM);
      return this.b($$0, (etx.a<?>)this.a((def)$$0, etu.a(cvt.pw).a(ewx.a(0.125F)).a(eue.a($$1.b(dbp.x), 2))));
   }

   public etm.a b(dhj $$0, cvk $$1) {
      return etm.b()
         .a(
            this.a(
               $$0,
               etl.a()
                  .a(exl.a(1.0F))
                  .a(etu.a($$1).a(dpg.c.a(), $$1x -> evm.a(exk.a(3, (float)($$1x + 1) / 15.0F)).a(ewr.a($$0).a(eb.a.a().a(dpg.c, $$1x.intValue())))))
            )
         );
   }

   public etm.a c(dhj $$0, cvk $$1) {
      return etm.b().a(this.a($$0, etl.a().a(exl.a(1.0F)).a(etu.a($$1).a(evm.a(exk.a(3, 0.53333336F))))));
   }

   protected etm.a b(def $$0) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a(this.c()).a(etu.a($$0)));
   }

   protected etm.a a(dhj $$0, ews.a $$1) {
      return etm.b()
         .a(
            etl.a()
               .a(
                  (etx.a<?>)this.a(
                     (def)$$0,
                     etu.a($$0)
                        .a($$1)
                        .a(jj.values(), $$1x -> evm.a(exl.a(1.0F), true).a(ewr.a($$0).a(eb.a.a().a(dmj.b($$1x), true))))
                        .a(evm.a(exl.a(-1.0F), true))
                  )
               )
         );
   }

   protected etm.a a(dhj $$0, dhj $$1, float... $$2) {
      jp.b<dbk> $$3 = this.a.b(lv.aM);
      return this.c($$0, ((etz.a)this.a((def)$$0, etu.a($$1))).a(ewh.a($$3.b(dbp.x), $$2)))
         .a(etl.a().a(exl.a(1.0F)).a(this.g()).a(((etz.a)this.a((def)$$0, etu.a(cvt.pr).a(evm.a(exs.a(1.0F, 2.0F))))).a(ewh.a($$3.b(dbp.x), f))));
   }

   protected etm.a b(dhj $$0, dhj $$1, float... $$2) {
      jp.b<dbk> $$3 = this.a.b(lv.aM);
      return this.a($$0, $$1, $$2)
         .a(
            etl.a()
               .a(exl.a(1.0F))
               .a(this.g())
               .a(((etz.a)this.a((def)$$0, etu.a(cvt.ov))).a(ewh.a($$3.b(dbp.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected etm.a l(dhj $$0) {
      jp.b<dbk> $$1 = this.a.b(lv.aM);
      return this.c($$0, ((etz.a)this.a((def)dhl.aL, etu.a(cvt.pr).a(evm.a(exs.a(1.0F, 2.0F))))).a(ewh.a($$1.b(dbp.x), f)));
   }

   protected etm.a a(dhj $$0, cvk $$1, cvk $$2, ews.a $$3) {
      jp.b<dbk> $$4 = this.a.b(lv.aM);
      return this.a((def)$$0, etm.b().a(etl.a().a(etu.a($$1).a($$3).a(etu.a($$2)))).a(etl.a().a($$3).a(etu.a($$2).a(eue.a($$4.b(dbp.x), 0.5714286F, 3)))));
   }

   protected etm.a m(dhj $$0) {
      return etm.b().a(etl.a().a(this.c()).a(etu.a($$0).a(evm.a(exl.a(2.0F)))));
   }

   protected etm.a a(dhj $$0, dhj $$1) {
      jp.b<dhj> $$2 = this.a.b(lv.f);
      etx.a<?> $$3 = etu.a($$1).a(evm.a(exl.a(2.0F))).a(this.c()).a(((etz.a)this.a((def)$$0, etu.a(cvt.pw))).a(ewx.a(0.125F)));
      return etm.b()
         .a(etl.a().a($$3).a(ewr.a($$0).a(eb.a.a().a(djr.b, dvk.b))).a(ewq.a(df.a.a().a(aw.a.a().a($$2, $$0).a(eb.a.a().a(djr.b, dvk.a))), new je(0, 1, 0))))
         .a(etl.a().a($$3).a(ewr.a($$0).a(eb.a.a().a(djr.b, dvk.a))).a(ewq.a(df.a.a().a(aw.a.a().a($$2, $$0).a(eb.a.a().a(djr.b, dvk.b))), new je(0, -1, 0))));
   }

   protected etm.a n(dhj $$0) {
      return etm.b()
         .a(
            etl.a()
               .a(exl.a(1.0F))
               .a(
                  (etx.a<?>)this.a(
                     $$0, etu.a($$0).a(List.of(2, 3, 4), $$1 -> evm.a(exl.a((float)$$1.intValue())).a(ewr.a($$0).a(eb.a.a().a(dhy.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected etm.a o(dhj $$0) {
      return etm.b()
         .a(
            etl.a()
               .a(exl.a(1.0F))
               .a(
                  (etx.a<?>)this.a(
                     $$0,
                     etu.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> evm.a(exl.a((float)$$1.intValue())).a(ewr.a($$0).a(eb.a.a().a(dmw.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static etm.a p(dhj $$0) {
      return etm.b().a(etl.a().a(exl.a(1.0F)).a(etu.a($$0)));
   }

   public static etm.a d() {
      return etm.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alb<etm>, etm.a> $$0) {
      this.e();
      Set<alb<etm>> $$1 = new HashSet<>();

      for (dhj $$2 : lu.e) {
         if ($$2.a(this.c)) {
            alb<etm> $$3 = $$2.v();
            if ($$3 != etd.a && $$1.add($$3)) {
               etm.a $$4 = this.d.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lu.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dhj $$0, dhj $$1) {
      jp.b<dbk> $$2 = this.a.b(lv.aM);
      etm.a $$3 = this.c($$0, etu.a($$0).a(ewh.a($$2.b(dbp.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected etm.a q(dhj $$0) {
      return this.a($$0, djp.f, dvk.b);
   }

   protected void r(dhj $$0) {
      this.a($$0, $$0x -> this.d((def)((dkm)$$0x).b()));
   }

   protected void c(dhj $$0, dhj $$1) {
      this.a($$0, this.c((def)$$1));
   }

   protected void c(dhj $$0, def $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dhj $$0) {
      this.c($$0, $$0);
   }

   protected void t(dhj $$0) {
      this.c($$0, (def)$$0);
   }

   protected void a(dhj $$0, Function<dhj, etm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dhj $$0, etm.a $$1) {
      this.d.put($$0.v(), $$1);
   }
}
