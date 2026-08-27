import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lt implements lw {
   protected static final eqc.a a = eqj.a(cc.a.a().a(new bm(cwt.v, cm.d.b(1))));
   protected static final eqc.a b = a.invert();
   protected static final eqc.a c = eqj.a(cc.a.a().a(crm.rU));
   private static final eqc.a h = c.or(a);
   private static final eqc.a i = h.invert();
   protected final Set<cre> d;
   protected final cmg e;
   protected final Map<ajt, enj.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lt(Set<cre> $$0, cmg $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lt(Set<cre> $$0, cmg $$1, Map<ajt, enj.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eom<T>> T a(cyw $$0, eom<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(eoc.c()) : $$1.c();
   }

   protected <T extends epv<T>> T a(cyw $$0, epv<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(epy.c()) : $$1.d();
   }

   public enj.a a(cyw $$0) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0))));
   }

   private static enj.a a(dby $$0, eqc.a $$1, enu.a<?> $$2) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a($$1).a($$2)));
   }

   protected static enj.a a(dby $$0, enu.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static enj.a b(dby $$0, enu.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static enj.a c(dby $$0, enu.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected enj.a a(dby $$0, cyw $$1) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a($$1)));
   }

   protected enj.a a(cyw $$0, eqx $$1) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a((enu.a<?>)this.a($$0, enr.a($$0).a(epc.a($$1)))));
   }

   protected enj.a a(dby $$0, cyw $$1, eqx $$2) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a($$1).a(epc.a($$2))));
   }

   private static enj.a c(cyw $$0) {
      return enj.b().a(eni.a().a(a).a(eqv.a(1.0F)).a(enr.a($$0)));
   }

   private enj.a d(cyw $$0) {
      return enj.b().a(this.a(dca.fR, eni.a().a(eqv.a(1.0F)).a(enr.a(dca.fR)))).a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0))));
   }

   protected enj.a a(dby $$0) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a((enu.a<?>)this.a((cyw)$$0, enr.a($$0).a(epc.a(eqv.a(2.0F)).a(eqb.a($$0).a(db.a.a().a(dja.b, dqh.c)))))));
   }

   protected <T extends Comparable<T> & aye> enj.a a(dby $$0, dqc<T> $$1, T $$2) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a(eqb.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected enj.a b(dby $$0) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a(eoe.a(eoe.b.a).a(jp.d)))));
   }

   protected enj.a c(dby $$0) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a(eoe.a(eoe.b.a).a(jp.d).a(jp.Q).a(jp.T).a(jp.U)))));
   }

   protected enj.a d(dby $$0) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a(crm.oE).a(epc.a(era.a(2.0F, 5.0F))).a(eob.a(cwt.x))));
   }

   protected enj.a e(dby $$0) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a(crm.oz).a(epc.a(era.a(4.0F, 9.0F))).a(eob.a(cwt.x))));
   }

   protected enj.a f(dby $$0) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a(crm.lG).a(epc.a(era.a(4.0F, 5.0F))).a(eob.b(cwt.x))));
   }

   protected enj.a g(dby $$0) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a(eoe.a(eoe.b.a).a(jp.d).a(jp.N)))));
   }

   protected static enj.a h(dby $$0) {
      return enj.b().a(eni.a().a(a).a(eqv.a(1.0F)).a(enr.a($$0).a(eoe.a(eoe.b.a).a(jp.S)).a(eod.a($$0).a(dbs.c))));
   }

   protected static enj.a i(dby $$0) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a(enr.a($$0).a(a).a(eoe.a(eoe.b.a).a(jp.S)).a(eod.a($$0).a(dbs.c)).a(enr.a($$0))));
   }

   protected static enj.a j(dby $$0) {
      return enj.b().a(eni.a().a(enr.a(crm.wo)).a(eqb.a($$0).a(db.a.a().a(dcu.r_, true))));
   }

   protected enj.a a(dby $$0, cre $$1) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a($$1).a(eob.a(cwt.x))));
   }

   protected enj.a b(dby $$0, cyw $$1) {
      return a($$0, (enu.a<?>)this.a((cyw)$$0, enr.a($$1).a(epc.a(era.a(-6.0F, 2.0F))).a(eon.a(ena.b(0)))));
   }

   protected enj.a k(dby $$0) {
      return b($$0, (enu.a<?>)this.a((cyw)$$0, enr.a(crm.pu).a(eqh.a(0.125F)).a(eob.a(cwt.x, 2))));
   }

   public enj.a b(dby $$0, cre $$1) {
      return enj.b()
         .a(
            this.a(
               $$0,
               eni.a()
                  .a(eqv.a(1.0F))
                  .a(enr.a($$1).a(djt.c.a(), $$1x -> epc.a(equ.a(3, (float)($$1x + 1) / 15.0F)).a(eqb.a($$0).a(db.a.a().a(djt.c, $$1x.intValue())))))
            )
         );
   }

   public enj.a c(dby $$0, cre $$1) {
      return enj.b().a(this.a($$0, eni.a().a(eqv.a(1.0F)).a(enr.a($$1).a(epc.a(equ.a(3, 0.53333336F))))));
   }

   protected static enj.a b(cyw $$0) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a(c).a(enr.a($$0)));
   }

   protected enj.a a(dby $$0, eqc.a $$1) {
      return enj.b()
         .a(
            eni.a()
               .a(
                  (enu.a<?>)this.a(
                     (cyw)$$0,
                     enr.a($$0)
                        .a($$1)
                        .a(ih.values(), $$1x -> epc.a(eqv.a(1.0F), true).a(eqb.a($$0).a(db.a.a().a(dgx.b($$1x), true))))
                        .a(epc.a(eqv.a(-1.0F), true))
                  )
               )
         );
   }

   protected enj.a a(dby $$0, dby $$1, float... $$2) {
      return c($$0, ((enw.a)this.a((cyw)$$0, enr.a($$1))).a(eps.a(cwt.x, $$2)))
         .a(eni.a().a(eqv.a(1.0F)).a(i).a(((enw.a)this.a((cyw)$$0, enr.a(crm.po).a(epc.a(era.a(1.0F, 2.0F))))).a(eps.a(cwt.x, j))));
   }

   protected enj.a b(dby $$0, dby $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eni.a().a(eqv.a(1.0F)).a(i).a(((enw.a)this.a((cyw)$$0, enr.a(crm.os))).a(eps.a(cwt.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected enj.a l(dby $$0) {
      return c($$0, ((enw.a)this.a((cyw)dca.aL, enr.a(crm.po).a(epc.a(era.a(1.0F, 2.0F))))).a(eps.a(cwt.x, j)));
   }

   protected enj.a a(dby $$0, cre $$1, cre $$2, eqc.a $$3) {
      return this.a((cyw)$$0, enj.b().a(eni.a().a(enr.a($$1).a($$3).a(enr.a($$2)))).a(eni.a().a($$3).a(enr.a($$2).a(eob.a(cwt.x, 0.5714286F, 3)))));
   }

   protected static enj.a m(dby $$0) {
      return enj.b().a(eni.a().a(c).a(enr.a($$0).a(epc.a(eqv.a(2.0F)))));
   }

   protected enj.a a(dby $$0, dby $$1) {
      enu.a<?> $$2 = enr.a($$1).a(epc.a(eqv.a(2.0F))).a(c).a(((enw.a)this.a((cyw)$$0, enr.a(crm.pu))).a(eqh.a(0.125F)));
      return enj.b()
         .a(eni.a().a($$2).a(eqb.a($$0).a(db.a.a().a(deg.b, dpv.b))).a(eqa.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(deg.b, dpv.a))), new ib(0, 1, 0))))
         .a(eni.a().a($$2).a(eqb.a($$0).a(db.a.a().a(deg.b, dpv.a))).a(eqa.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(deg.b, dpv.b))), new ib(0, -1, 0))));
   }

   protected enj.a n(dby $$0) {
      return enj.b()
         .a(
            eni.a()
               .a(eqv.a(1.0F))
               .a(
                  (enu.a<?>)this.a(
                     $$0, enr.a($$0).a(List.of(2, 3, 4), $$1 -> epc.a(eqv.a((float)$$1.intValue())).a(eqb.a($$0).a(db.a.a().a(dcn.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected enj.a o(dby $$0) {
      return enj.b()
         .a(
            eni.a()
               .a(eqv.a(1.0F))
               .a(
                  (enu.a<?>)this.a(
                     $$0,
                     enr.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> epc.a(eqv.a((float)$$1.intValue())).a(eqb.a($$0).a(db.a.a().a(dhk.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static enj.a p(dby $$0) {
      return enj.b().a(eni.a().a(eqv.a(1.0F)).a(enr.a($$0)));
   }

   public static enj.a a() {
      return enj.b();
   }

   protected abstract void b();

   @Override
   public void generate(in.a $$0, BiConsumer<ajt, enj.a> $$1) {
      this.b();
      Set<ajt> $$2 = new HashSet<>();

      for (dby $$3 : kr.e) {
         if ($$3.a(this.e)) {
            ajt $$4 = $$3.v();
            if ($$4 != emz.a && $$2.add($$4)) {
               enj.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4, kr.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dby $$0, dby $$1) {
      enj.a $$2 = c($$0, enr.a($$0).a(eps.a(cwt.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected enj.a q(dby $$0) {
      return this.a($$0, dee.f, dpv.b);
   }

   protected void r(dby $$0) {
      this.a($$0, $$0x -> this.d((cyw)((dfb)$$0x).b()));
   }

   protected void c(dby $$0, dby $$1) {
      this.a($$0, c((cyw)$$1));
   }

   protected void c(dby $$0, cyw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dby $$0) {
      this.c($$0, $$0);
   }

   protected void t(dby $$0) {
      this.c($$0, (cyw)$$0);
   }

   protected void a(dby $$0, Function<dby, enj.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dby $$0, enj.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
