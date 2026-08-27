import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lg implements lj {
   protected static final elu.a a = emb.a(cc.a.a().a(new bm(ctl.v, cm.d.b(1))));
   protected static final elu.a b = a.invert();
   protected static final elu.a c = emb.a(cc.a.a().a(cpc.rU));
   private static final elu.a h = c.or(a);
   private static final elu.a i = h.invert();
   protected final Set<cou> d;
   protected final cjs e;
   protected final Map<aiy, ejd.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lg(Set<cou> $$0, cjs $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lg(Set<cou> $$0, cjs $$1, Map<aiy, ejd.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ekf<T>> T a(cvm $$0, ekf<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(ejw.c()) : $$1.c();
   }

   protected <T extends eln<T>> T a(cvm $$0, eln<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(elq.c()) : $$1.d();
   }

   public ejd.a a(cvm $$0) {
      return ejd.b().a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$0))));
   }

   private static ejd.a a(cyo $$0, elu.a $$1, ejo.a<?> $$2) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a(ejl.a($$0).a($$1).a($$2)));
   }

   protected static ejd.a a(cyo $$0, ejo.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ejd.a b(cyo $$0, ejo.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ejd.a c(cyo $$0, ejo.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ejd.a a(cyo $$0, cvm $$1) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a($$1)));
   }

   protected ejd.a a(cvm $$0, emp $$1) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a((ejo.a<?>)this.a($$0, ejl.a($$0).a(ekt.a($$1)))));
   }

   protected ejd.a a(cyo $$0, cvm $$1, emp $$2) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a($$1).a(ekt.a($$2))));
   }

   private static ejd.a c(cvm $$0) {
      return ejd.b().a(ejc.a().a(a).a(emn.a(1.0F)).a(ejl.a($$0)));
   }

   private ejd.a d(cvm $$0) {
      return ejd.b().a(this.a(cyq.fR, ejc.a().a(emn.a(1.0F)).a(ejl.a(cyq.fR)))).a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$0))));
   }

   protected ejd.a a(cyo $$0) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a((ejo.a<?>)this.a((cvm)$$0, ejl.a($$0).a(ekt.a(emn.a(2.0F)).a(elt.a($$0).a(db.a.a().a(dfq.b, dmn.c)))))));
   }

   protected <T extends Comparable<T> & axc> ejd.a a(cyo $$0, dmi<T> $$1, T $$2) {
      return ejd.b().a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$0).a(elt.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected ejd.a b(cyo $$0) {
      return ejd.b().a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$0).a(ejy.a(ejy.a.d)))));
   }

   protected ejd.a c(cyo $$0) {
      return ejd.b()
         .a(
            this.a(
               $$0,
               ejc.a()
                  .a(emn.a(1.0F))
                  .a(
                     ejl.a($$0)
                        .a(ejy.a(ejy.a.d))
                        .a(
                           ejz.a(emg.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(ekp.a(div.x).a(eji.a(dfm.c)))
                  )
            )
         );
   }

   protected ejd.a d(cyo $$0) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a(cpc.oE).a(ekt.a(ems.a(2.0F, 5.0F))).a(ejv.a(ctl.x))));
   }

   protected ejd.a e(cyo $$0) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a(cpc.oz).a(ekt.a(ems.a(4.0F, 9.0F))).a(ejv.a(ctl.x))));
   }

   protected ejd.a f(cyo $$0) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a(cpc.lG).a(ekt.a(ems.a(4.0F, 5.0F))).a(ejv.b(ctl.x))));
   }

   protected ejd.a g(cyo $$0) {
      return ejd.b().a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$0).a(ejy.a(ejy.a.d)).a(ejz.a(emg.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ejd.a h(cyo $$0) {
      return ejd.b().a(ejc.a().a(a).a(emn.a(1.0F)).a(ejl.a($$0).a(ejz.a(emg.a).a("Bees", "BlockEntityTag.Bees")).a(ejx.a($$0).a(cyi.c))));
   }

   protected static ejd.a i(cyo $$0) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a(ejl.a($$0).a(a).a(ejz.a(emg.a).a("Bees", "BlockEntityTag.Bees")).a(ejx.a($$0).a(cyi.c)).a(ejl.a($$0))));
   }

   protected static ejd.a j(cyo $$0) {
      return ejd.b().a(ejc.a().a(ejl.a(cpc.wm)).a(elt.a($$0).a(db.a.a().a(czk.u_, true))));
   }

   protected ejd.a a(cyo $$0, cou $$1) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a($$1).a(ejv.a(ctl.x))));
   }

   protected ejd.a b(cyo $$0, cvm $$1) {
      return a($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a($$1).a(ekt.a(ems.a(-6.0F, 2.0F))).a(ekg.a(eiu.b(0)))));
   }

   protected ejd.a k(cyo $$0) {
      return b($$0, (ejo.a<?>)this.a((cvm)$$0, ejl.a(cpc.pu).a(elz.a(0.125F)).a(ejv.a(ctl.x, 2))));
   }

   public ejd.a b(cyo $$0, cou $$1) {
      return ejd.b()
         .a(
            this.a(
               $$0,
               ejc.a()
                  .a(emn.a(1.0F))
                  .a(ejl.a($$1).a(dgj.c.a(), $$1x -> ekt.a(emm.a(3, (float)($$1x + 1) / 15.0F)).a(elt.a($$0).a(db.a.a().a(dgj.c, $$1x.intValue())))))
            )
         );
   }

   public ejd.a c(cyo $$0, cou $$1) {
      return ejd.b().a(this.a($$0, ejc.a().a(emn.a(1.0F)).a(ejl.a($$1).a(ekt.a(emm.a(3, 0.53333336F))))));
   }

   protected static ejd.a b(cvm $$0) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a(c).a(ejl.a($$0)));
   }

   protected ejd.a a(cyo $$0, elu.a $$1) {
      return ejd.b()
         .a(
            ejc.a()
               .a(
                  (ejo.a<?>)this.a(
                     (cvm)$$0,
                     ejl.a($$0)
                        .a($$1)
                        .a(ie.values(), $$1x -> ekt.a(emn.a(1.0F), true).a(elt.a($$0).a(db.a.a().a(ddn.b($$1x), true))))
                        .a(ekt.a(emn.a(-1.0F), true))
                  )
               )
         );
   }

   protected ejd.a a(cyo $$0, cyo $$1, float... $$2) {
      return c($$0, ((ejq.a)this.a((cvm)$$0, ejl.a($$1))).a(elk.a(ctl.x, $$2)))
         .a(ejc.a().a(emn.a(1.0F)).a(i).a(((ejq.a)this.a((cvm)$$0, ejl.a(cpc.po).a(ekt.a(ems.a(1.0F, 2.0F))))).a(elk.a(ctl.x, j))));
   }

   protected ejd.a b(cyo $$0, cyo $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ejc.a().a(emn.a(1.0F)).a(i).a(((ejq.a)this.a((cvm)$$0, ejl.a(cpc.os))).a(elk.a(ctl.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ejd.a l(cyo $$0) {
      return c($$0, ((ejq.a)this.a((cvm)cyq.aL, ejl.a(cpc.po).a(ekt.a(ems.a(1.0F, 2.0F))))).a(elk.a(ctl.x, j)));
   }

   protected ejd.a a(cyo $$0, cou $$1, cou $$2, elu.a $$3) {
      return this.a((cvm)$$0, ejd.b().a(ejc.a().a(ejl.a($$1).a($$3).a(ejl.a($$2)))).a(ejc.a().a($$3).a(ejl.a($$2).a(ejv.a(ctl.x, 0.5714286F, 3)))));
   }

   protected static ejd.a m(cyo $$0) {
      return ejd.b().a(ejc.a().a(c).a(ejl.a($$0).a(ekt.a(emn.a(2.0F)))));
   }

   protected ejd.a a(cyo $$0, cyo $$1) {
      ejo.a<?> $$2 = ejl.a($$1).a(ekt.a(emn.a(2.0F))).a(c).a(((ejq.a)this.a((cvm)$$0, ejl.a(cpc.pu))).a(elz.a(0.125F)));
      return ejd.b()
         .a(ejc.a().a($$2).a(elt.a($$0).a(db.a.a().a(daw.b, dmb.b))).a(els.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(daw.b, dmb.a))), new hz(0, 1, 0))))
         .a(ejc.a().a($$2).a(elt.a($$0).a(db.a.a().a(daw.b, dmb.a))).a(els.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(daw.b, dmb.b))), new hz(0, -1, 0))));
   }

   protected ejd.a n(cyo $$0) {
      return ejd.b()
         .a(
            ejc.a()
               .a(emn.a(1.0F))
               .a(
                  (ejo.a<?>)this.a(
                     $$0, ejl.a($$0).a(List.of(2, 3, 4), $$1 -> ekt.a(emn.a((float)$$1.intValue())).a(elt.a($$0).a(db.a.a().a(czd.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ejd.a o(cyo $$0) {
      return ejd.b()
         .a(
            ejc.a()
               .a(emn.a(1.0F))
               .a(
                  (ejo.a<?>)this.a(
                     $$0,
                     ejl.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ekt.a(emn.a((float)$$1.intValue())).a(elt.a($$0).a(db.a.a().a(dea.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ejd.a p(cyo $$0) {
      return ejd.b().a(ejc.a().a(emn.a(1.0F)).a(ejl.a($$0)));
   }

   public static ejd.a a() {
      return ejd.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aiy, ejd.a> $$0) {
      this.b();
      Set<aiy> $$1 = new HashSet<>();

      for (cyo $$2 : kf.e) {
         if ($$2.a(this.e)) {
            aiy $$3 = $$2.v();
            if ($$3 != eit.a && $$1.add($$3)) {
               ejd.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kf.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(cyo $$0, cyo $$1) {
      ejd.a $$2 = c($$0, ejl.a($$0).a(elk.a(ctl.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ejd.a q(cyo $$0) {
      return this.a($$0, dau.f, dmb.b);
   }

   protected void r(cyo $$0) {
      this.a($$0, $$0x -> this.d((cvm)((dbr)$$0x).b()));
   }

   protected void c(cyo $$0, cyo $$1) {
      this.a($$0, c((cvm)$$1));
   }

   protected void c(cyo $$0, cvm $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cyo $$0) {
      this.c($$0, $$0);
   }

   protected void t(cyo $$0) {
      this.c($$0, (cvm)$$0);
   }

   protected void a(cyo $$0, Function<cyo, ejd.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cyo $$0, ejd.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
