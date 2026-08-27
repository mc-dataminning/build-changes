import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class la implements ld {
   protected static final ejd.a a = ejk.a(ca.a.a().a(new bk(cqw.v, ck.d.b(1))));
   protected static final ejd.a b = a.invert();
   protected static final ejd.a c = ejk.a(ca.a.a().a(cmk.rS));
   private static final ejd.a h = c.or(a);
   private static final ejd.a i = h.invert();
   protected final Set<cmc> d;
   protected final chb e;
   protected final Map<agt, egm.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected la(Set<cmc> $$0, chb $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected la(Set<cmc> $$0, chb $$1, Map<agt, egm.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eho<T>> T a(csx $$0, eho<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehf.c()) : $$1.c();
   }

   protected <T extends eiw<T>> T a(csx $$0, eiw<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(eiz.c()) : $$1.d();
   }

   public egm.a a(csx $$0) {
      return egm.b().a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$0))));
   }

   private static egm.a a(cvz $$0, ejd.a $$1, egx.a<?> $$2) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a(egu.a($$0).a($$1).a($$2)));
   }

   protected static egm.a a(cvz $$0, egx.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static egm.a b(cvz $$0, egx.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static egm.a c(cvz $$0, egx.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected egm.a a(cvz $$0, csx $$1) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a($$1)));
   }

   protected egm.a a(csx $$0, ejy $$1) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a((egx.a<?>)this.a($$0, egu.a($$0).a(eic.a($$1)))));
   }

   protected egm.a a(cvz $$0, csx $$1, ejy $$2) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a($$1).a(eic.a($$2))));
   }

   private static egm.a c(csx $$0) {
      return egm.b().a(egl.a().a(a).a(ejw.a(1.0F)).a(egu.a($$0)));
   }

   private egm.a d(csx $$0) {
      return egm.b().a(this.a(cwb.fR, egl.a().a(ejw.a(1.0F)).a(egu.a(cwb.fR)))).a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$0))));
   }

   protected egm.a a(cvz $$0) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a((egx.a<?>)this.a((csx)$$0, egu.a($$0).a(eic.a(ejw.a(2.0F)).a(ejc.a($$0).a(cz.a.a().a(ddb.b, djx.c)))))));
   }

   protected <T extends Comparable<T> & aut> egm.a a(cvz $$0, djs<T> $$1, T $$2) {
      return egm.b().a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$0).a(ejc.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected egm.a b(cvz $$0) {
      return egm.b().a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$0).a(ehh.a(ehh.a.d)))));
   }

   protected egm.a c(cvz $$0) {
      return egm.b()
         .a(
            this.a(
               $$0,
               egl.a()
                  .a(ejw.a(1.0F))
                  .a(
                     egu.a($$0)
                        .a(ehh.a(ehh.a.d))
                        .a(
                           ehi.a(ejp.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(ehy.a(dgf.x).a(egr.a(dcx.c)))
                  )
            )
         );
   }

   protected egm.a d(cvz $$0) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a(cmk.oC).a(eic.a(ekb.a(2.0F, 5.0F))).a(ehe.a(cqw.x))));
   }

   protected egm.a e(cvz $$0) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a(cmk.ox).a(eic.a(ekb.a(4.0F, 9.0F))).a(ehe.a(cqw.x))));
   }

   protected egm.a f(cvz $$0) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a(cmk.lG).a(eic.a(ekb.a(4.0F, 5.0F))).a(ehe.b(cqw.x))));
   }

   protected egm.a g(cvz $$0) {
      return egm.b().a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$0).a(ehh.a(ehh.a.d)).a(ehi.a(ejp.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static egm.a h(cvz $$0) {
      return egm.b().a(egl.a().a(a).a(ejw.a(1.0F)).a(egu.a($$0).a(ehi.a(ejp.a).a("Bees", "BlockEntityTag.Bees")).a(ehg.a($$0).a(cvt.c))));
   }

   protected static egm.a i(cvz $$0) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a(egu.a($$0).a(a).a(ehi.a(ejp.a).a("Bees", "BlockEntityTag.Bees")).a(ehg.a($$0).a(cvt.c)).a(egu.a($$0))));
   }

   protected static egm.a j(cvz $$0) {
      return egm.b().a(egl.a().a(egu.a(cmk.wj)).a(ejc.a($$0).a(cz.a.a().a(cwv.s_, true))));
   }

   protected egm.a a(cvz $$0, cmc $$1) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a($$1).a(ehe.a(cqw.x))));
   }

   protected egm.a b(cvz $$0, csx $$1) {
      return a($$0, (egx.a<?>)this.a((csx)$$0, egu.a($$1).a(eic.a(ekb.a(-6.0F, 2.0F))).a(ehp.a(egd.b(0)))));
   }

   protected egm.a k(cvz $$0) {
      return b($$0, (egx.a<?>)this.a((csx)$$0, egu.a(cmk.ps).a(eji.a(0.125F)).a(ehe.a(cqw.x, 2))));
   }

   public egm.a b(cvz $$0, cmc $$1) {
      return egm.b()
         .a(
            this.a(
               $$0,
               egl.a()
                  .a(ejw.a(1.0F))
                  .a(egu.a($$1).a(ddu.c.a(), $$1x -> eic.a(ejv.a(3, (float)($$1x + 1) / 15.0F)).a(ejc.a($$0).a(cz.a.a().a(ddu.c, $$1x.intValue())))))
            )
         );
   }

   public egm.a c(cvz $$0, cmc $$1) {
      return egm.b().a(this.a($$0, egl.a().a(ejw.a(1.0F)).a(egu.a($$1).a(eic.a(ejv.a(3, 0.53333336F))))));
   }

   protected static egm.a b(csx $$0) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a(c).a(egu.a($$0)));
   }

   protected egm.a a(cvz $$0, ejd.a $$1) {
      return egm.b()
         .a(
            egl.a()
               .a(
                  (egx.a<?>)this.a(
                     (csx)$$0,
                     egu.a($$0)
                        .a($$1)
                        .a(ia.values(), $$1x -> eic.a(ejw.a(1.0F), true).a(ejc.a($$0).a(cz.a.a().a(day.b($$1x), true))))
                        .a(eic.a(ejw.a(-1.0F), true))
                  )
               )
         );
   }

   protected egm.a a(cvz $$0, cvz $$1, float... $$2) {
      return c($$0, ((egz.a)this.a((csx)$$0, egu.a($$1))).a(eit.a(cqw.x, $$2)))
         .a(egl.a().a(ejw.a(1.0F)).a(i).a(((egz.a)this.a((csx)$$0, egu.a(cmk.pm).a(eic.a(ekb.a(1.0F, 2.0F))))).a(eit.a(cqw.x, j))));
   }

   protected egm.a b(cvz $$0, cvz $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(egl.a().a(ejw.a(1.0F)).a(i).a(((egz.a)this.a((csx)$$0, egu.a(cmk.oq))).a(eit.a(cqw.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected egm.a l(cvz $$0) {
      return c($$0, ((egz.a)this.a((csx)cwb.aL, egu.a(cmk.pm).a(eic.a(ekb.a(1.0F, 2.0F))))).a(eit.a(cqw.x, j)));
   }

   protected egm.a a(cvz $$0, cmc $$1, cmc $$2, ejd.a $$3) {
      return this.a((csx)$$0, egm.b().a(egl.a().a(egu.a($$1).a($$3).a(egu.a($$2)))).a(egl.a().a($$3).a(egu.a($$2).a(ehe.a(cqw.x, 0.5714286F, 3)))));
   }

   protected static egm.a m(cvz $$0) {
      return egm.b().a(egl.a().a(c).a(egu.a($$0).a(eic.a(ejw.a(2.0F)))));
   }

   protected egm.a a(cvz $$0, cvz $$1) {
      egx.a<?> $$2 = egu.a($$1).a(eic.a(ejw.a(2.0F))).a(c).a(((egz.a)this.a((csx)$$0, egu.a(cmk.ps))).a(eji.a(0.125F)));
      return egm.b()
         .a(egl.a().a($$2).a(ejc.a($$0).a(cz.a.a().a(cyh.b, djl.b))).a(ejb.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyh.b, djl.a))), new hv(0, 1, 0))))
         .a(egl.a().a($$2).a(ejc.a($$0).a(cz.a.a().a(cyh.b, djl.a))).a(ejb.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyh.b, djl.b))), new hv(0, -1, 0))));
   }

   protected egm.a n(cvz $$0) {
      return egm.b()
         .a(
            egl.a()
               .a(ejw.a(1.0F))
               .a(
                  (egx.a<?>)this.a(
                     $$0, egu.a($$0).a(List.of(2, 3, 4), $$1 -> eic.a(ejw.a((float)$$1.intValue())).a(ejc.a($$0).a(cz.a.a().a(cwo.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected egm.a o(cvz $$0) {
      return egm.b()
         .a(
            egl.a()
               .a(ejw.a(1.0F))
               .a(
                  (egx.a<?>)this.a(
                     $$0,
                     egu.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eic.a(ejw.a((float)$$1.intValue())).a(ejc.a($$0).a(cz.a.a().a(dbl.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static egm.a p(cvz $$0) {
      return egm.b().a(egl.a().a(ejw.a(1.0F)).a(egu.a($$0)));
   }

   public static egm.a a() {
      return egm.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<agt, egm.a> $$0) {
      this.b();
      Set<agt> $$1 = new HashSet<>();

      for (cvz $$2 : kb.e) {
         if ($$2.a(this.e)) {
            agt $$3 = $$2.v();
            if ($$3 != egc.a && $$1.add($$3)) {
               egm.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kb.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cvz $$0, cvz $$1) {
      egm.a $$2 = c($$0, egu.a($$0).a(eit.a(cqw.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected egm.a q(cvz $$0) {
      return this.a($$0, cyf.f, djl.b);
   }

   protected void r(cvz $$0) {
      this.a($$0, $$0x -> this.d((csx)((czc)$$0x).b()));
   }

   protected void c(cvz $$0, cvz $$1) {
      this.a($$0, c((csx)$$1));
   }

   protected void c(cvz $$0, csx $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cvz $$0) {
      this.c($$0, $$0);
   }

   protected void t(cvz $$0) {
      this.c($$0, (csx)$$0);
   }

   protected void a(cvz $$0, Function<cvz, egm.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cvz $$0, egm.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
