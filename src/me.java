import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class me implements mh {
   protected static final erh.a a = ero.a(cg.a.a().a(ci.b, ce.a(List.of(new bm(cxq.v, cs.d.b(1))))));
   protected static final erh.a b = a.invert();
   protected static final erh.a c = ero.a(cg.a.a().a(csg.rV));
   private static final erh.a h = c.or(a);
   private static final erh.a i = h.invert();
   protected final Set<cry> d;
   protected final cmy e;
   protected final Map<akf, eoi.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected me(Set<cry> $$0, cmy $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected me(Set<cry> $$0, cmy $$1, Map<akf, eoi.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends epl<T>> T a(czt $$0, epl<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(epb.c()) : $$1.c();
   }

   protected <T extends era<T>> T a(czt $$0, era<T> $$1) {
      return !this.d.contains($$0.p()) ? $$1.b(erd.c()) : $$1.d();
   }

   public eoi.a a(czt $$0) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0))));
   }

   private static eoi.a a(dcv $$0, erh.a $$1, eot.a<?> $$2) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a($$1).a($$2)));
   }

   protected static eoi.a a(dcv $$0, eot.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static eoi.a b(dcv $$0, eot.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static eoi.a c(dcv $$0, eot.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected eoi.a a(dcv $$0, czt $$1) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a($$1)));
   }

   protected eoi.a a(czt $$0, esc $$1) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a((eot.a<?>)this.a($$0, eoq.a($$0).a(eqf.a($$1)))));
   }

   protected eoi.a a(dcv $$0, czt $$1, esc $$2) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a($$1).a(eqf.a($$2))));
   }

   private static eoi.a c(czt $$0) {
      return eoi.b().a(eoh.a().a(a).a(esa.a(1.0F)).a(eoq.a($$0)));
   }

   private eoi.a d(czt $$0) {
      return eoi.b().a(this.a(dcx.fR, eoh.a().a(esa.a(1.0F)).a(eoq.a(dcx.fR)))).a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0))));
   }

   protected eoi.a a(dcv $$0) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a((eot.a<?>)this.a((czt)$$0, eoq.a($$0).a(eqf.a(esa.a(2.0F)).a(erg.a($$0).a(dj.a.a().a(djy.b, drg.c)))))));
   }

   protected <T extends Comparable<T> & ayq> eoi.a a(dcv $$0, drb<T> $$1, T $$2) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a(erg.a($$0).a(dj.a.a().a($$1, $$2))))));
   }

   protected eoi.a b(dcv $$0) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a(epd.a(epd.b.a).a(jz.d)))));
   }

   protected eoi.a c(dcv $$0) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a(epd.a(epd.b.a).a(jz.d).a(jz.Q).a(jz.T).a(jz.U)))));
   }

   protected eoi.a d(dcv $$0) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a(csg.oF).a(eqf.a(esf.a(2.0F, 5.0F))).a(epa.a(cxq.x))));
   }

   protected eoi.a e(dcv $$0) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a(csg.oA).a(eqf.a(esf.a(4.0F, 9.0F))).a(epa.a(cxq.x))));
   }

   protected eoi.a f(dcv $$0) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a(csg.lH).a(eqf.a(esf.a(4.0F, 5.0F))).a(epa.b(cxq.x))));
   }

   protected eoi.a g(dcv $$0) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a(epd.a(epd.b.a).a(jz.d).a(jz.N)))));
   }

   protected static eoi.a h(dcv $$0) {
      return eoi.b().a(eoh.a().a(a).a(esa.a(1.0F)).a(eoq.a($$0).a(epd.a(epd.b.a).a(jz.S)).a(epc.a($$0).a(dcp.c))));
   }

   protected static eoi.a i(dcv $$0) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a(eoq.a($$0).a(a).a(epd.a(epd.b.a).a(jz.S)).a(epc.a($$0).a(dcp.c)).a(eoq.a($$0))));
   }

   protected static eoi.a j(dcv $$0) {
      return eoi.b().a(eoh.a().a(eoq.a(csg.ws)).a(erg.a($$0).a(dj.a.a().a(ddr.r_, true))));
   }

   protected eoi.a a(dcv $$0, cry $$1) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a($$1).a(epa.a(cxq.x))));
   }

   protected eoi.a b(dcv $$0, czt $$1) {
      return a($$0, (eot.a<?>)this.a((czt)$$0, eoq.a($$1).a(eqf.a(esf.a(-6.0F, 2.0F))).a(epm.a(enz.b(0)))));
   }

   protected eoi.a k(dcv $$0) {
      return b($$0, (eot.a<?>)this.a((czt)$$0, eoq.a(csg.pv).a(erm.a(0.125F)).a(epa.a(cxq.x, 2))));
   }

   public eoi.a b(dcv $$0, cry $$1) {
      return eoi.b()
         .a(
            this.a(
               $$0,
               eoh.a()
                  .a(esa.a(1.0F))
                  .a(eoq.a($$1).a(dkr.c.a(), $$1x -> eqf.a(erz.a(3, (float)($$1x + 1) / 15.0F)).a(erg.a($$0).a(dj.a.a().a(dkr.c, $$1x.intValue())))))
            )
         );
   }

   public eoi.a c(dcv $$0, cry $$1) {
      return eoi.b().a(this.a($$0, eoh.a().a(esa.a(1.0F)).a(eoq.a($$1).a(eqf.a(erz.a(3, 0.53333336F))))));
   }

   protected static eoi.a b(czt $$0) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a(c).a(eoq.a($$0)));
   }

   protected eoi.a a(dcv $$0, erh.a $$1) {
      return eoi.b()
         .a(
            eoh.a()
               .a(
                  (eot.a<?>)this.a(
                     (czt)$$0,
                     eoq.a($$0)
                        .a($$1)
                        .a(ir.values(), $$1x -> eqf.a(esa.a(1.0F), true).a(erg.a($$0).a(dj.a.a().a(dhv.b($$1x), true))))
                        .a(eqf.a(esa.a(-1.0F), true))
                  )
               )
         );
   }

   protected eoi.a a(dcv $$0, dcv $$1, float... $$2) {
      return c($$0, ((eov.a)this.a((czt)$$0, eoq.a($$1))).a(eqx.a(cxq.x, $$2)))
         .a(eoh.a().a(esa.a(1.0F)).a(i).a(((eov.a)this.a((czt)$$0, eoq.a(csg.pp).a(eqf.a(esf.a(1.0F, 2.0F))))).a(eqx.a(cxq.x, j))));
   }

   protected eoi.a b(dcv $$0, dcv $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eoh.a().a(esa.a(1.0F)).a(i).a(((eov.a)this.a((czt)$$0, eoq.a(csg.ot))).a(eqx.a(cxq.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected eoi.a l(dcv $$0) {
      return c($$0, ((eov.a)this.a((czt)dcx.aL, eoq.a(csg.pp).a(eqf.a(esf.a(1.0F, 2.0F))))).a(eqx.a(cxq.x, j)));
   }

   protected eoi.a a(dcv $$0, cry $$1, cry $$2, erh.a $$3) {
      return this.a((czt)$$0, eoi.b().a(eoh.a().a(eoq.a($$1).a($$3).a(eoq.a($$2)))).a(eoh.a().a($$3).a(eoq.a($$2).a(epa.a(cxq.x, 0.5714286F, 3)))));
   }

   protected static eoi.a m(dcv $$0) {
      return eoi.b().a(eoh.a().a(c).a(eoq.a($$0).a(eqf.a(esa.a(2.0F)))));
   }

   protected eoi.a a(dcv $$0, dcv $$1) {
      eot.a<?> $$2 = eoq.a($$1).a(eqf.a(esa.a(2.0F))).a(c).a(((eov.a)this.a((czt)$$0, eoq.a(csg.pv))).a(erm.a(0.125F)));
      return eoi.b()
         .a(eoh.a().a($$2).a(erg.a($$0).a(dj.a.a().a(dfd.b, dqu.b))).a(erf.a(cq.a.a().a(av.a.a().a($$0).a(dj.a.a().a(dfd.b, dqu.a))), new im(0, 1, 0))))
         .a(eoh.a().a($$2).a(erg.a($$0).a(dj.a.a().a(dfd.b, dqu.a))).a(erf.a(cq.a.a().a(av.a.a().a($$0).a(dj.a.a().a(dfd.b, dqu.b))), new im(0, -1, 0))));
   }

   protected eoi.a n(dcv $$0) {
      return eoi.b()
         .a(
            eoh.a()
               .a(esa.a(1.0F))
               .a(
                  (eot.a<?>)this.a(
                     $$0, eoq.a($$0).a(List.of(2, 3, 4), $$1 -> eqf.a(esa.a((float)$$1.intValue())).a(erg.a($$0).a(dj.a.a().a(ddk.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eoi.a o(dcv $$0) {
      return eoi.b()
         .a(
            eoh.a()
               .a(esa.a(1.0F))
               .a(
                  (eot.a<?>)this.a(
                     $$0,
                     eoq.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eqf.a(esa.a((float)$$1.intValue())).a(erg.a($$0).a(dj.a.a().a(dii.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eoi.a p(dcv $$0) {
      return eoi.b().a(eoh.a().a(esa.a(1.0F)).a(eoq.a($$0)));
   }

   public static eoi.a a() {
      return eoi.b();
   }

   protected abstract void b();

   @Override
   public void generate(ix.a $$0, BiConsumer<akf, eoi.a> $$1) {
      this.b();
      Set<akf> $$2 = new HashSet<>();

      for (dcv $$3 : lc.e) {
         if ($$3.a(this.e)) {
            akf $$4 = $$3.v();
            if ($$4 != eny.a && $$2.add($$4)) {
               eoi.a $$5 = this.f.remove($$4);
               if ($$5 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4, lc.e.b($$3)));
               }

               $$1.accept($$4, $$5);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(dcv $$0, dcv $$1) {
      eoi.a $$2 = c($$0, eoq.a($$0).a(eqx.a(cxq.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected eoi.a q(dcv $$0) {
      return this.a($$0, dfb.f, dqu.b);
   }

   protected void r(dcv $$0) {
      this.a($$0, $$0x -> this.d((czt)((dfy)$$0x).b()));
   }

   protected void c(dcv $$0, dcv $$1) {
      this.a($$0, c((czt)$$1));
   }

   protected void c(dcv $$0, czt $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dcv $$0) {
      this.c($$0, $$0);
   }

   protected void t(dcv $$0) {
      this.c($$0, (czt)$$0);
   }

   protected void a(dcv $$0, Function<dcv, eoi.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dcv $$0, eoi.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
