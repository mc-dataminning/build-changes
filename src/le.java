import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class le implements lh {
   protected static final ejv.a a = ekc.a(ca.a.a().a(new bk(crn.v, ck.d.b(1))));
   protected static final ejv.a b = a.invert();
   protected static final ejv.a c = ekc.a(ca.a.a().a(cnb.rS));
   private static final ejv.a h = c.or(a);
   private static final ejv.a i = h.invert();
   protected final Set<cmt> d;
   protected final chs e;
   protected final Map<ahg, ehe.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected le(Set<cmt> $$0, chs $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected le(Set<cmt> $$0, chs $$1, Map<ahg, ehe.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eig<T>> T a(cto $$0, eig<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ehx.c()) : $$1.c();
   }

   protected <T extends ejo<T>> T a(cto $$0, ejo<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(ejr.c()) : $$1.d();
   }

   public ehe.a a(cto $$0) {
      return ehe.b().a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$0))));
   }

   private static ehe.a a(cwq $$0, ejv.a $$1, ehp.a<?> $$2) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a(ehm.a($$0).a($$1).a($$2)));
   }

   protected static ehe.a a(cwq $$0, ehp.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ehe.a b(cwq $$0, ehp.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ehe.a c(cwq $$0, ehp.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ehe.a a(cwq $$0, cto $$1) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a($$1)));
   }

   protected ehe.a a(cto $$0, ekq $$1) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a((ehp.a<?>)this.a($$0, ehm.a($$0).a(eiu.a($$1)))));
   }

   protected ehe.a a(cwq $$0, cto $$1, ekq $$2) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a($$1).a(eiu.a($$2))));
   }

   private static ehe.a c(cto $$0) {
      return ehe.b().a(ehd.a().a(a).a(eko.a(1.0F)).a(ehm.a($$0)));
   }

   private ehe.a d(cto $$0) {
      return ehe.b().a(this.a(cws.fR, ehd.a().a(eko.a(1.0F)).a(ehm.a(cws.fR)))).a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$0))));
   }

   protected ehe.a a(cwq $$0) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a((ehp.a<?>)this.a((cto)$$0, ehm.a($$0).a(eiu.a(eko.a(2.0F)).a(eju.a($$0).a(cz.a.a().a(dds.b, dkp.c)))))));
   }

   protected <T extends Comparable<T> & avk> ehe.a a(cwq $$0, dkk<T> $$1, T $$2) {
      return ehe.b().a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$0).a(eju.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   protected ehe.a b(cwq $$0) {
      return ehe.b().a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$0).a(ehz.a(ehz.a.d)))));
   }

   protected ehe.a c(cwq $$0) {
      return ehe.b()
         .a(
            this.a(
               $$0,
               ehd.a()
                  .a(eko.a(1.0F))
                  .a(
                     ehm.a($$0)
                        .a(ehz.a(ehz.a.d))
                        .a(
                           eia.a(ekh.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eiq.a(dgx.x).a(ehj.a(ddo.c)))
                  )
            )
         );
   }

   protected ehe.a d(cwq $$0) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a(cnb.oC).a(eiu.a(ekt.a(2.0F, 5.0F))).a(ehw.a(crn.x))));
   }

   protected ehe.a e(cwq $$0) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a(cnb.ox).a(eiu.a(ekt.a(4.0F, 9.0F))).a(ehw.a(crn.x))));
   }

   protected ehe.a f(cwq $$0) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a(cnb.lG).a(eiu.a(ekt.a(4.0F, 5.0F))).a(ehw.b(crn.x))));
   }

   protected ehe.a g(cwq $$0) {
      return ehe.b().a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$0).a(ehz.a(ehz.a.d)).a(eia.a(ekh.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ehe.a h(cwq $$0) {
      return ehe.b().a(ehd.a().a(a).a(eko.a(1.0F)).a(ehm.a($$0).a(eia.a(ekh.a).a("Bees", "BlockEntityTag.Bees")).a(ehy.a($$0).a(cwk.c))));
   }

   protected static ehe.a i(cwq $$0) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a(ehm.a($$0).a(a).a(eia.a(ekh.a).a("Bees", "BlockEntityTag.Bees")).a(ehy.a($$0).a(cwk.c)).a(ehm.a($$0))));
   }

   protected static ehe.a j(cwq $$0) {
      return ehe.b().a(ehd.a().a(ehm.a(cnb.wj)).a(eju.a($$0).a(cz.a.a().a(cxm.t_, true))));
   }

   protected ehe.a a(cwq $$0, cmt $$1) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a($$1).a(ehw.a(crn.x))));
   }

   protected ehe.a b(cwq $$0, cto $$1) {
      return a($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a($$1).a(eiu.a(ekt.a(-6.0F, 2.0F))).a(eih.a(egv.b(0)))));
   }

   protected ehe.a k(cwq $$0) {
      return b($$0, (ehp.a<?>)this.a((cto)$$0, ehm.a(cnb.ps).a(eka.a(0.125F)).a(ehw.a(crn.x, 2))));
   }

   public ehe.a b(cwq $$0, cmt $$1) {
      return ehe.b()
         .a(
            this.a(
               $$0,
               ehd.a()
                  .a(eko.a(1.0F))
                  .a(ehm.a($$1).a(del.c.a(), $$1x -> eiu.a(ekn.a(3, (float)($$1x + 1) / 15.0F)).a(eju.a($$0).a(cz.a.a().a(del.c, $$1x.intValue())))))
            )
         );
   }

   public ehe.a c(cwq $$0, cmt $$1) {
      return ehe.b().a(this.a($$0, ehd.a().a(eko.a(1.0F)).a(ehm.a($$1).a(eiu.a(ekn.a(3, 0.53333336F))))));
   }

   protected static ehe.a b(cto $$0) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a(c).a(ehm.a($$0)));
   }

   protected ehe.a a(cwq $$0, ejv.a $$1) {
      return ehe.b()
         .a(
            ehd.a()
               .a(
                  (ehp.a<?>)this.a(
                     (cto)$$0,
                     ehm.a($$0)
                        .a($$1)
                        .a(ic.values(), $$1x -> eiu.a(eko.a(1.0F), true).a(eju.a($$0).a(cz.a.a().a(dbp.b($$1x), true))))
                        .a(eiu.a(eko.a(-1.0F), true))
                  )
               )
         );
   }

   protected ehe.a a(cwq $$0, cwq $$1, float... $$2) {
      return c($$0, ((ehr.a)this.a((cto)$$0, ehm.a($$1))).a(ejl.a(crn.x, $$2)))
         .a(ehd.a().a(eko.a(1.0F)).a(i).a(((ehr.a)this.a((cto)$$0, ehm.a(cnb.pm).a(eiu.a(ekt.a(1.0F, 2.0F))))).a(ejl.a(crn.x, j))));
   }

   protected ehe.a b(cwq $$0, cwq $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ehd.a().a(eko.a(1.0F)).a(i).a(((ehr.a)this.a((cto)$$0, ehm.a(cnb.oq))).a(ejl.a(crn.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ehe.a l(cwq $$0) {
      return c($$0, ((ehr.a)this.a((cto)cws.aL, ehm.a(cnb.pm).a(eiu.a(ekt.a(1.0F, 2.0F))))).a(ejl.a(crn.x, j)));
   }

   protected ehe.a a(cwq $$0, cmt $$1, cmt $$2, ejv.a $$3) {
      return this.a((cto)$$0, ehe.b().a(ehd.a().a(ehm.a($$1).a($$3).a(ehm.a($$2)))).a(ehd.a().a($$3).a(ehm.a($$2).a(ehw.a(crn.x, 0.5714286F, 3)))));
   }

   protected static ehe.a m(cwq $$0) {
      return ehe.b().a(ehd.a().a(c).a(ehm.a($$0).a(eiu.a(eko.a(2.0F)))));
   }

   protected ehe.a a(cwq $$0, cwq $$1) {
      ehp.a<?> $$2 = ehm.a($$1).a(eiu.a(eko.a(2.0F))).a(c).a(((ehr.a)this.a((cto)$$0, ehm.a(cnb.ps))).a(eka.a(0.125F)));
      return ehe.b()
         .a(ehd.a().a($$2).a(eju.a($$0).a(cz.a.a().a(cyy.b, dkd.b))).a(ejt.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyy.b, dkd.a))), new hx(0, 1, 0))))
         .a(ehd.a().a($$2).a(eju.a($$0).a(cz.a.a().a(cyy.b, dkd.a))).a(ejt.a(ci.a.a().a(au.a.a().a($$0).a(cz.a.a().a(cyy.b, dkd.b))), new hx(0, -1, 0))));
   }

   protected ehe.a n(cwq $$0) {
      return ehe.b()
         .a(
            ehd.a()
               .a(eko.a(1.0F))
               .a(
                  (ehp.a<?>)this.a(
                     $$0, ehm.a($$0).a(List.of(2, 3, 4), $$1 -> eiu.a(eko.a((float)$$1.intValue())).a(eju.a($$0).a(cz.a.a().a(cxf.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ehe.a o(cwq $$0) {
      return ehe.b()
         .a(
            ehd.a()
               .a(eko.a(1.0F))
               .a(
                  (ehp.a<?>)this.a(
                     $$0,
                     ehm.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eiu.a(eko.a((float)$$1.intValue())).a(eju.a($$0).a(cz.a.a().a(dcc.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ehe.a p(cwq $$0) {
      return ehe.b().a(ehd.a().a(eko.a(1.0F)).a(ehm.a($$0)));
   }

   public static ehe.a a() {
      return ehe.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ahg, ehe.a> $$0) {
      this.b();
      Set<ahg> $$1 = new HashSet<>();

      for (cwq $$2 : kd.e) {
         if ($$2.a(this.e)) {
            ahg $$3 = $$2.v();
            if ($$3 != egu.a && $$1.add($$3)) {
               ehe.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kd.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cwq $$0, cwq $$1) {
      ehe.a $$2 = c($$0, ehm.a($$0).a(ejl.a(crn.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ehe.a q(cwq $$0) {
      return this.a($$0, cyw.f, dkd.b);
   }

   protected void r(cwq $$0) {
      this.a($$0, $$0x -> this.d((cto)((czt)$$0x).b()));
   }

   protected void c(cwq $$0, cwq $$1) {
      this.a($$0, c((cto)$$1));
   }

   protected void c(cwq $$0, cto $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cwq $$0) {
      this.c($$0, $$0);
   }

   protected void t(cwq $$0) {
      this.c($$0, (cto)$$0);
   }

   protected void a(cwq $$0, Function<cwq, ehe.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cwq $$0, ehe.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
