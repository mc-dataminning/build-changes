import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class kc implements kf {
   protected static final efp.a a = efw.a(cb.a.a().a(new bl(cns.v, cl.d.b(1))));
   protected static final efp.a b = a.invert();
   protected static final efp.a c = efw.a(cb.a.a().a(cji.rg));
   private static final efp.a h = c.or(a);
   private static final efp.a i = h.invert();
   protected final Set<cja> d;
   protected final cec e;
   protected final Map<aex, ecy.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected kc(Set<cja> $$0, cec $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected kc(Set<cja> $$0, cec $$1, Map<aex, ecy.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eea<T>> T a(cpu $$0, eea<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(edr.c()) : $$1.c();
   }

   protected <T extends efi<T>> T a(cpu $$0, efi<T> $$1) {
      return !this.d.contains($$0.k()) ? $$1.b(efl.c()) : $$1.d();
   }

   public ecy.a a(cpu $$0) {
      return ecy.b().a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$0))));
   }

   private static ecy.a a(csv $$0, efp.a $$1, edj.a<?> $$2) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a(edg.a($$0).a($$1).a($$2)));
   }

   protected static ecy.a a(csv $$0, edj.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ecy.a b(csv $$0, edj.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ecy.a c(csv $$0, edj.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ecy.a a(csv $$0, cpu $$1) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a($$1)));
   }

   protected ecy.a a(cpu $$0, egk $$1) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a((edj.a<?>)this.a($$0, edg.a($$0).a(eeo.a($$1)))));
   }

   protected ecy.a a(csv $$0, cpu $$1, egk $$2) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a($$1).a(eeo.a($$2))));
   }

   private static ecy.a c(cpu $$0) {
      return ecy.b().a(ecx.a().a(a).a(egi.a(1.0F)).a(edg.a($$0)));
   }

   private ecy.a d(cpu $$0) {
      return ecy.b().a(this.a(csw.fR, ecx.a().a(egi.a(1.0F)).a(edg.a(csw.fR)))).a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$0))));
   }

   protected ecy.a a(csv $$0) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a((edj.a<?>)this.a((cpu)$$0, edg.a($$0).a(eeo.a(egi.a(2.0F)).a(efo.a($$0).a(da.a.a().a(czy.a, dgr.c)))))));
   }

   protected <T extends Comparable<T> & asp> ecy.a a(csv $$0, dgm<T> $$1, T $$2) {
      return ecy.b().a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$0).a(efo.a($$0).a(da.a.a().a($$1, $$2))))));
   }

   protected ecy.a b(csv $$0) {
      return ecy.b().a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$0).a(edt.a(edt.a.d)))));
   }

   protected ecy.a c(csv $$0) {
      return ecy.b()
         .a(
            this.a(
               $$0,
               ecx.a()
                  .a(egi.a(1.0F))
                  .a(
                     edg.a($$0)
                        .a(edt.a(edt.a.d))
                        .a(
                           edu.a(egb.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(eek.a(dcx.x).a(edd.a(czu.b)))
                  )
            )
         );
   }

   protected ecy.a d(csv $$0) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a(cji.nR).a(eeo.a(egn.a(2.0F, 5.0F))).a(edq.a(cns.x))));
   }

   protected ecy.a e(csv $$0) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a(cji.nM).a(eeo.a(egn.a(4.0F, 9.0F))).a(edq.a(cns.x))));
   }

   protected ecy.a f(csv $$0) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a(cji.ll).a(eeo.a(egn.a(4.0F, 5.0F))).a(edq.b(cns.x))));
   }

   protected ecy.a g(csv $$0) {
      return ecy.b().a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$0).a(edt.a(edt.a.d)).a(edu.a(egb.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ecy.a h(csv $$0) {
      return ecy.b().a(ecx.a().a(a).a(egi.a(1.0F)).a(edg.a($$0).a(edu.a(egb.a).a("Bees", "BlockEntityTag.Bees")).a(eds.a($$0).a(csp.b))));
   }

   protected static ecy.a i(csv $$0) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a(edg.a($$0).a(a).a(edu.a(egb.a).a("Bees", "BlockEntityTag.Bees")).a(eds.a($$0).a(csp.b)).a(edg.a($$0))));
   }

   protected static ecy.a j(csv $$0) {
      return ecy.b().a(ecx.a().a(edg.a(cji.vw)).a(efo.a($$0).a(da.a.a().a(ctq.s_, true))));
   }

   protected ecy.a a(csv $$0, cja $$1) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a($$1).a(edq.a(cns.x))));
   }

   protected ecy.a b(csv $$0, cpu $$1) {
      return a($$0, (edj.a<?>)this.a((cpu)$$0, edg.a($$1).a(eeo.a(egn.a(-6.0F, 2.0F))).a(eeb.a(ecp.b(0)))));
   }

   protected ecy.a k(csv $$0) {
      return b($$0, (edj.a<?>)this.a((cpu)$$0, edg.a(cji.oH).a(efu.a(0.125F)).a(edq.a(cns.x, 2))));
   }

   public ecy.a b(csv $$0, cja $$1) {
      return ecy.b()
         .a(
            this.a(
               $$0,
               ecx.a()
                  .a(egi.a(1.0F))
                  .a(edg.a($$1).a(dar.b.a(), $$1x -> eeo.a(egh.a(3, (float)($$1x + 1) / 15.0F)).a(efo.a($$0).a(da.a.a().a(dar.b, $$1x.intValue())))))
            )
         );
   }

   public ecy.a c(csv $$0, cja $$1) {
      return ecy.b().a(this.a($$0, ecx.a().a(egi.a(1.0F)).a(edg.a($$1).a(eeo.a(egh.a(3, 0.53333336F))))));
   }

   protected static ecy.a b(cpu $$0) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a(c).a(edg.a($$0)));
   }

   protected ecy.a a(csv $$0, efp.a $$1) {
      return ecy.b()
         .a(
            ecx.a()
               .a(
                  (edj.a<?>)this.a(
                     (cpu)$$0,
                     edg.a($$0)
                        .a($$1)
                        .a(hc.values(), $$1x -> eeo.a(egi.a(1.0F), true).a(efo.a($$0).a(da.a.a().a(cxt.b($$1x), true))))
                        .a(eeo.a(egi.a(-1.0F), true))
                  )
               )
         );
   }

   protected ecy.a a(csv $$0, csv $$1, float... $$2) {
      return c($$0, ((edl.a)this.a((cpu)$$0, edg.a($$1))).a(eff.a(cns.x, $$2)))
         .a(ecx.a().a(egi.a(1.0F)).a(i).a(((edl.a)this.a((cpu)$$0, edg.a(cji.oB).a(eeo.a(egn.a(1.0F, 2.0F))))).a(eff.a(cns.x, j))));
   }

   protected ecy.a b(csv $$0, csv $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ecx.a().a(egi.a(1.0F)).a(i).a(((edl.a)this.a((cpu)$$0, edg.a(cji.nF))).a(eff.a(cns.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ecy.a l(csv $$0) {
      return c($$0, ((edl.a)this.a((cpu)csw.aL, edg.a(cji.oB).a(eeo.a(egn.a(1.0F, 2.0F))))).a(eff.a(cns.x, j)));
   }

   protected ecy.a a(csv $$0, cja $$1, cja $$2, efp.a $$3) {
      return this.a((cpu)$$0, ecy.b().a(ecx.a().a(edg.a($$1).a($$3).a(edg.a($$2)))).a(ecx.a().a($$3).a(edg.a($$2).a(edq.a(cns.x, 0.5714286F, 3)))));
   }

   protected static ecy.a m(csv $$0) {
      return ecy.b().a(ecx.a().a(c).a(edg.a($$0).a(eeo.a(egi.a(2.0F)))));
   }

   protected ecy.a a(csv $$0, csv $$1) {
      edj.a<?> $$2 = edg.a($$1).a(eeo.a(egi.a(2.0F))).a(c).a(((edl.a)this.a((cpu)$$0, edg.a(cji.oH))).a(efu.a(0.125F)));
      return ecy.b()
         .a(ecx.a().a($$2).a(efo.a($$0).a(da.a.a().a(cuz.a, dgf.b))).a(efn.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cuz.a, dgf.a))), new gw(0, 1, 0))))
         .a(ecx.a().a($$2).a(efo.a($$0).a(da.a.a().a(cuz.a, dgf.a))).a(efn.a(cj.a.a().a(av.a.a().a($$0).a(da.a.a().a(cuz.a, dgf.b))), new gw(0, -1, 0))));
   }

   protected ecy.a n(csv $$0) {
      return ecy.b()
         .a(
            ecx.a()
               .a(egi.a(1.0F))
               .a(
                  (edj.a<?>)this.a(
                     $$0, edg.a($$0).a(List.of(2, 3, 4), $$1 -> eeo.a(egi.a((float)$$1.intValue())).a(efo.a($$0).a(da.a.a().a(ctj.e, $$1.intValue()))))
                  )
               )
         );
   }

   protected ecy.a o(csv $$0) {
      return ecy.b()
         .a(
            ecx.a()
               .a(egi.a(1.0F))
               .a(
                  (edj.a<?>)this.a(
                     $$0,
                     edg.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> eeo.a(egi.a((float)$$1.intValue())).a(efo.a($$0).a(da.a.a().a(cyg.d, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ecy.a p(csv $$0) {
      return ecy.b().a(ecx.a().a(egi.a(1.0F)).a(edg.a($$0)));
   }

   public static ecy.a a() {
      return ecy.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aex, ecy.a> $$0) {
      this.b();
      Set<aex> $$1 = new HashSet<>();

      for (csv $$2 : jd.f) {
         if ($$2.a(this.e)) {
            aex $$3 = $$2.r();
            if ($$3 != eco.a && $$1.add($$3)) {
               ecy.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jd.f.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(csv $$0, csv $$1) {
      ecy.a $$2 = c($$0, edg.a($$0).a(eff.a(cns.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ecy.a q(csv $$0) {
      return this.a($$0, cux.e, dgf.b);
   }

   protected void r(csv $$0) {
      this.a($$0, $$0x -> this.d((cpu)((cvu)$$0x).a()));
   }

   protected void c(csv $$0, csv $$1) {
      this.a($$0, c((cpu)$$1));
   }

   protected void c(csv $$0, cpu $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(csv $$0) {
      this.c($$0, $$0);
   }

   protected void t(csv $$0) {
      this.c($$0, (cpu)$$0);
   }

   protected void a(csv $$0, Function<csv, ecy.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(csv $$0, ecy.a $$1) {
      this.f.put($$0.r(), $$1);
   }
}
