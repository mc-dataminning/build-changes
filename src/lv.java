import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lv implements ly {
   protected static final eql.a a = eqs.a(cc.a.a().a(new bm(cxc.v, cm.d.b(1))));
   protected static final eql.a b = a.invert();
   protected static final eql.a c = eqs.a(cc.a.a().a(crv.rU));
   private static final eql.a h = c.or(a);
   private static final eql.a i = h.invert();
   protected final Set<crn> d;
   protected final cmn e;
   protected final Map<ajv, ens.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lv(Set<crn> $$0, cmn $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lv(Set<crn> $$0, cmn $$1, Map<ajv, ens.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eov<T>> T a(czf $$0, eov<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(eol.c()) : $$1.c();
   }

   protected <T extends eqe<T>> T a(czf $$0, eqe<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(eqh.c()) : $$1.d();
   }

   public ens.a a(czf $$0) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0))));
   }

   private static ens.a a(dch $$0, eql.a $$1, eod.a<?> $$2) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a($$1).a($$2)));
   }

   protected static ens.a a(dch $$0, eod.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ens.a b(dch $$0, eod.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ens.a c(dch $$0, eod.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ens.a a(dch $$0, czf $$1) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a($$1)));
   }

   protected ens.a a(czf $$0, erg $$1) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a((eod.a<?>)this.a($$0, eoa.a($$0).a(epl.a($$1)))));
   }

   protected ens.a a(dch $$0, czf $$1, erg $$2) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a($$1).a(epl.a($$2))));
   }

   private static ens.a c(czf $$0) {
      return ens.b().a(enr.a().a(a).a(ere.a(1.0F)).a(eoa.a($$0)));
   }

   private ens.a d(czf $$0) {
      return ens.b().a(this.a(dcj.fR, enr.a().a(ere.a(1.0F)).a(eoa.a(dcj.fR)))).a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0))));
   }

   protected ens.a a(dch $$0) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a((eod.a<?>)this.a((czf)$$0, eoa.a($$0).a(epl.a(ere.a(2.0F)).a(eqk.a($$0).a(dc.a.a().a(djj.b, dqq.c)))))));
   }

   protected <T extends Comparable<T> & ayg> ens.a a(dch $$0, dql<T> $$1, T $$2) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a(eqk.a($$0).a(dc.a.a().a($$1, $$2))))));
   }

   protected ens.a b(dch $$0) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a(eon.a(eon.b.a).a(jr.d)))));
   }

   protected ens.a c(dch $$0) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a(eon.a(eon.b.a).a(jr.d).a(jr.Q).a(jr.T).a(jr.U)))));
   }

   protected ens.a d(dch $$0) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a(crv.oE).a(epl.a(erj.a(2.0F, 5.0F))).a(eok.a(cxc.x))));
   }

   protected ens.a e(dch $$0) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a(crv.oz).a(epl.a(erj.a(4.0F, 9.0F))).a(eok.a(cxc.x))));
   }

   protected ens.a f(dch $$0) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a(crv.lG).a(epl.a(erj.a(4.0F, 5.0F))).a(eok.b(cxc.x))));
   }

   protected ens.a g(dch $$0) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a(eon.a(eon.b.a).a(jr.d).a(jr.N)))));
   }

   protected static ens.a h(dch $$0) {
      return ens.b().a(enr.a().a(a).a(ere.a(1.0F)).a(eoa.a($$0).a(eon.a(eon.b.a).a(jr.S)).a(eom.a($$0).a(dcb.c))));
   }

   protected static ens.a i(dch $$0) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a(eoa.a($$0).a(a).a(eon.a(eon.b.a).a(jr.S)).a(eom.a($$0).a(dcb.c)).a(eoa.a($$0))));
   }

   protected static ens.a j(dch $$0) {
      return ens.b().a(enr.a().a(eoa.a(crv.wo)).a(eqk.a($$0).a(dc.a.a().a(ddd.r_, true))));
   }

   protected ens.a a(dch $$0, crn $$1) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a($$1).a(eok.a(cxc.x))));
   }

   protected ens.a b(dch $$0, czf $$1) {
      return a($$0, (eod.a<?>)this.a((czf)$$0, eoa.a($$1).a(epl.a(erj.a(-6.0F, 2.0F))).a(eow.a(enj.b(0)))));
   }

   protected ens.a k(dch $$0) {
      return b($$0, (eod.a<?>)this.a((czf)$$0, eoa.a(crv.pu).a(eqq.a(0.125F)).a(eok.a(cxc.x, 2))));
   }

   public ens.a b(dch $$0, crn $$1) {
      return ens.b()
         .a(
            this.a(
               $$0,
               enr.a()
                  .a(ere.a(1.0F))
                  .a(eoa.a($$1).a(dkc.c.a(), $$1x -> epl.a(erd.a(3, (float)($$1x + 1) / 15.0F)).a(eqk.a($$0).a(dc.a.a().a(dkc.c, $$1x.intValue())))))
            )
         );
   }

   public ens.a c(dch $$0, crn $$1) {
      return ens.b().a(this.a($$0, enr.a().a(ere.a(1.0F)).a(eoa.a($$1).a(epl.a(erd.a(3, 0.53333336F))))));
   }

   protected static ens.a b(czf $$0) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a(c).a(eoa.a($$0)));
   }

   protected ens.a a(dch $$0, eql.a $$1) {
      return ens.b()
         .a(
            enr.a()
               .a(
                  (eod.a<?>)this.a(
                     (czf)$$0,
                     eoa.a($$0)
                        .a($$1)
                        .a(ij.values(), $$1x -> epl.a(ere.a(1.0F), true).a(eqk.a($$0).a(dc.a.a().a(dhg.b($$1x), true))))
                        .a(epl.a(ere.a(-1.0F), true))
                  )
               )
         );
   }

   protected ens.a a(dch $$0, dch $$1, float... $$2) {
      return c($$0, ((eof.a)this.a((czf)$$0, eoa.a($$1))).a(eqb.a(cxc.x, $$2)))
         .a(enr.a().a(ere.a(1.0F)).a(i).a(((eof.a)this.a((czf)$$0, eoa.a(crv.po).a(epl.a(erj.a(1.0F, 2.0F))))).a(eqb.a(cxc.x, j))));
   }

   protected ens.a b(dch $$0, dch $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(enr.a().a(ere.a(1.0F)).a(i).a(((eof.a)this.a((czf)$$0, eoa.a(crv.os))).a(eqb.a(cxc.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ens.a l(dch $$0) {
      return c($$0, ((eof.a)this.a((czf)dcj.aL, eoa.a(crv.po).a(epl.a(erj.a(1.0F, 2.0F))))).a(eqb.a(cxc.x, j)));
   }

   protected ens.a a(dch $$0, crn $$1, crn $$2, eql.a $$3) {
      return this.a((czf)$$0, ens.b().a(enr.a().a(eoa.a($$1).a($$3).a(eoa.a($$2)))).a(enr.a().a($$3).a(eoa.a($$2).a(eok.a(cxc.x, 0.5714286F, 3)))));
   }

   protected static ens.a m(dch $$0) {
      return ens.b().a(enr.a().a(c).a(eoa.a($$0).a(epl.a(ere.a(2.0F)))));
   }

   protected ens.a a(dch $$0, dch $$1) {
      eod.a<?> $$2 = eoa.a($$1).a(epl.a(ere.a(2.0F))).a(c).a(((eof.a)this.a((czf)$$0, eoa.a(crv.pu))).a(eqq.a(0.125F)));
      return ens.b()
         .a(enr.a().a($$2).a(eqk.a($$0).a(dc.a.a().a(dep.b, dqe.b))).a(eqj.a(ck.a.a().a(av.a.a().a($$0).a(dc.a.a().a(dep.b, dqe.a))), new id(0, 1, 0))))
         .a(enr.a().a($$2).a(eqk.a($$0).a(dc.a.a().a(dep.b, dqe.a))).a(eqj.a(ck.a.a().a(av.a.a().a($$0).a(dc.a.a().a(dep.b, dqe.b))), new id(0, -1, 0))));
   }

   protected ens.a n(dch $$0) {
      return ens.b()
         .a(
            enr.a()
               .a(ere.a(1.0F))
               .a(
                  (eod.a<?>)this.a(
                     $$0, eoa.a($$0).a(List.of(2, 3, 4), $$1 -> epl.a(ere.a((float)$$1.intValue())).a(eqk.a($$0).a(dc.a.a().a(dcw.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ens.a o(dch $$0) {
      return ens.b()
         .a(
            enr.a()
               .a(ere.a(1.0F))
               .a(
                  (eod.a<?>)this.a(
                     $$0,
                     eoa.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> epl.a(ere.a((float)$$1.intValue())).a(eqk.a($$0).a(dc.a.a().a(dht.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ens.a p(dch $$0) {
      return ens.b().a(enr.a().a(ere.a(1.0F)).a(eoa.a($$0)));
   }

   public static ens.a a() {
      return ens.b();
   }

   protected abstract void b();

   @Override
   public void generate(ip.a $$0, BiConsumer<ajv, ens.a> $$1) {
      this.b();
      Set<ajv> $$2 = new HashSet<>();

      for (dch $$3 : kt.e) {
         if ($$3.a(this.e)) {
            ajv $$4 = $$3.v();
            if ($$4 != eni.a && $$2.add($$4)) {
               ens.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4, kt.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dch $$0, dch $$1) {
      ens.a $$2 = c($$0, eoa.a($$0).a(eqb.a(cxc.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ens.a q(dch $$0) {
      return this.a($$0, den.f, dqe.b);
   }

   protected void r(dch $$0) {
      this.a($$0, $$0x -> this.d((czf)((dfk)$$0x).b()));
   }

   protected void c(dch $$0, dch $$1) {
      this.a($$0, c((czf)$$1));
   }

   protected void c(dch $$0, czf $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dch $$0) {
      this.c($$0, $$0);
   }

   protected void t(dch $$0) {
      this.c($$0, (czf)$$0);
   }

   protected void a(dch $$0, Function<dch, ens.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dch $$0, ens.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
