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
   protected static final emb.a a = emi.a(cc.a.a().a(new bm(ctp.v, cm.d.b(1))));
   protected static final emb.a b = a.invert();
   protected static final emb.a c = emi.a(cc.a.a().a(cpg.rU));
   private static final emb.a h = c.or(a);
   private static final emb.a i = h.invert();
   protected final Set<coy> d;
   protected final cjw e;
   protected final Map<aiy, ejk.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lg(Set<coy> $$0, cjw $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lg(Set<coy> $$0, cjw $$1, Map<aiy, ejk.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends ekm<T>> T a(cvq $$0, ekm<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(ekd.c()) : $$1.c();
   }

   protected <T extends elu<T>> T a(cvq $$0, elu<T> $$1) {
      return !this.d.contains($$0.j()) ? $$1.b(elx.c()) : $$1.d();
   }

   public ejk.a a(cvq $$0) {
      return ejk.b().a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$0))));
   }

   private static ejk.a a(cys $$0, emb.a $$1, ejv.a<?> $$2) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a(ejs.a($$0).a($$1).a($$2)));
   }

   protected static ejk.a a(cys $$0, ejv.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ejk.a b(cys $$0, ejv.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ejk.a c(cys $$0, ejv.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ejk.a a(cys $$0, cvq $$1) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a($$1)));
   }

   protected ejk.a a(cvq $$0, emw $$1) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a((ejv.a<?>)this.a($$0, ejs.a($$0).a(ela.a($$1)))));
   }

   protected ejk.a a(cys $$0, cvq $$1, emw $$2) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a($$1).a(ela.a($$2))));
   }

   private static ejk.a c(cvq $$0) {
      return ejk.b().a(ejj.a().a(a).a(emu.a(1.0F)).a(ejs.a($$0)));
   }

   private ejk.a d(cvq $$0) {
      return ejk.b().a(this.a(cyu.fR, ejj.a().a(emu.a(1.0F)).a(ejs.a(cyu.fR)))).a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$0))));
   }

   protected ejk.a a(cys $$0) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a((ejv.a<?>)this.a((cvq)$$0, ejs.a($$0).a(ela.a(emu.a(2.0F)).a(ema.a($$0).a(db.a.a().a(dfu.b, dmr.c)))))));
   }

   protected <T extends Comparable<T> & axc> ejk.a a(cys $$0, dmm<T> $$1, T $$2) {
      return ejk.b().a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$0).a(ema.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected ejk.a b(cys $$0) {
      return ejk.b().a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$0).a(ekf.a(ekf.a.d)))));
   }

   protected ejk.a c(cys $$0) {
      return ejk.b()
         .a(
            this.a(
               $$0,
               ejj.a()
                  .a(emu.a(1.0F))
                  .a(
                     ejs.a($$0)
                        .a(ekf.a(ekf.a.d))
                        .a(
                           ekg.a(emn.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(ekw.a(diz.x).a(ejp.a(dfq.c)))
                  )
            )
         );
   }

   protected ejk.a d(cys $$0) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a(cpg.oE).a(ela.a(emz.a(2.0F, 5.0F))).a(ekc.a(ctp.x))));
   }

   protected ejk.a e(cys $$0) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a(cpg.oz).a(ela.a(emz.a(4.0F, 9.0F))).a(ekc.a(ctp.x))));
   }

   protected ejk.a f(cys $$0) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a(cpg.lG).a(ela.a(emz.a(4.0F, 5.0F))).a(ekc.b(ctp.x))));
   }

   protected ejk.a g(cys $$0) {
      return ejk.b().a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$0).a(ekf.a(ekf.a.d)).a(ekg.a(emn.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ejk.a h(cys $$0) {
      return ejk.b().a(ejj.a().a(a).a(emu.a(1.0F)).a(ejs.a($$0).a(ekg.a(emn.a).a("Bees", "BlockEntityTag.Bees")).a(eke.a($$0).a(cym.c))));
   }

   protected static ejk.a i(cys $$0) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a(ejs.a($$0).a(a).a(ekg.a(emn.a).a("Bees", "BlockEntityTag.Bees")).a(eke.a($$0).a(cym.c)).a(ejs.a($$0))));
   }

   protected static ejk.a j(cys $$0) {
      return ejk.b().a(ejj.a().a(ejs.a(cpg.wm)).a(ema.a($$0).a(db.a.a().a(czo.u_, true))));
   }

   protected ejk.a a(cys $$0, coy $$1) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a($$1).a(ekc.a(ctp.x))));
   }

   protected ejk.a b(cys $$0, cvq $$1) {
      return a($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a($$1).a(ela.a(emz.a(-6.0F, 2.0F))).a(ekn.a(ejb.b(0)))));
   }

   protected ejk.a k(cys $$0) {
      return b($$0, (ejv.a<?>)this.a((cvq)$$0, ejs.a(cpg.pu).a(emg.a(0.125F)).a(ekc.a(ctp.x, 2))));
   }

   public ejk.a b(cys $$0, coy $$1) {
      return ejk.b()
         .a(
            this.a(
               $$0,
               ejj.a()
                  .a(emu.a(1.0F))
                  .a(ejs.a($$1).a(dgn.c.a(), $$1x -> ela.a(emt.a(3, (float)($$1x + 1) / 15.0F)).a(ema.a($$0).a(db.a.a().a(dgn.c, $$1x.intValue())))))
            )
         );
   }

   public ejk.a c(cys $$0, coy $$1) {
      return ejk.b().a(this.a($$0, ejj.a().a(emu.a(1.0F)).a(ejs.a($$1).a(ela.a(emt.a(3, 0.53333336F))))));
   }

   protected static ejk.a b(cvq $$0) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a(c).a(ejs.a($$0)));
   }

   protected ejk.a a(cys $$0, emb.a $$1) {
      return ejk.b()
         .a(
            ejj.a()
               .a(
                  (ejv.a<?>)this.a(
                     (cvq)$$0,
                     ejs.a($$0)
                        .a($$1)
                        .a(ie.values(), $$1x -> ela.a(emu.a(1.0F), true).a(ema.a($$0).a(db.a.a().a(ddr.b($$1x), true))))
                        .a(ela.a(emu.a(-1.0F), true))
                  )
               )
         );
   }

   protected ejk.a a(cys $$0, cys $$1, float... $$2) {
      return c($$0, ((ejx.a)this.a((cvq)$$0, ejs.a($$1))).a(elr.a(ctp.x, $$2)))
         .a(ejj.a().a(emu.a(1.0F)).a(i).a(((ejx.a)this.a((cvq)$$0, ejs.a(cpg.po).a(ela.a(emz.a(1.0F, 2.0F))))).a(elr.a(ctp.x, j))));
   }

   protected ejk.a b(cys $$0, cys $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ejj.a().a(emu.a(1.0F)).a(i).a(((ejx.a)this.a((cvq)$$0, ejs.a(cpg.os))).a(elr.a(ctp.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ejk.a l(cys $$0) {
      return c($$0, ((ejx.a)this.a((cvq)cyu.aL, ejs.a(cpg.po).a(ela.a(emz.a(1.0F, 2.0F))))).a(elr.a(ctp.x, j)));
   }

   protected ejk.a a(cys $$0, coy $$1, coy $$2, emb.a $$3) {
      return this.a((cvq)$$0, ejk.b().a(ejj.a().a(ejs.a($$1).a($$3).a(ejs.a($$2)))).a(ejj.a().a($$3).a(ejs.a($$2).a(ekc.a(ctp.x, 0.5714286F, 3)))));
   }

   protected static ejk.a m(cys $$0) {
      return ejk.b().a(ejj.a().a(c).a(ejs.a($$0).a(ela.a(emu.a(2.0F)))));
   }

   protected ejk.a a(cys $$0, cys $$1) {
      ejv.a<?> $$2 = ejs.a($$1).a(ela.a(emu.a(2.0F))).a(c).a(((ejx.a)this.a((cvq)$$0, ejs.a(cpg.pu))).a(emg.a(0.125F)));
      return ejk.b()
         .a(ejj.a().a($$2).a(ema.a($$0).a(db.a.a().a(dba.b, dmf.b))).a(elz.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dba.b, dmf.a))), new hz(0, 1, 0))))
         .a(ejj.a().a($$2).a(ema.a($$0).a(db.a.a().a(dba.b, dmf.a))).a(elz.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dba.b, dmf.b))), new hz(0, -1, 0))));
   }

   protected ejk.a n(cys $$0) {
      return ejk.b()
         .a(
            ejj.a()
               .a(emu.a(1.0F))
               .a(
                  (ejv.a<?>)this.a(
                     $$0, ejs.a($$0).a(List.of(2, 3, 4), $$1 -> ela.a(emu.a((float)$$1.intValue())).a(ema.a($$0).a(db.a.a().a(czh.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ejk.a o(cys $$0) {
      return ejk.b()
         .a(
            ejj.a()
               .a(emu.a(1.0F))
               .a(
                  (ejv.a<?>)this.a(
                     $$0,
                     ejs.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ela.a(emu.a((float)$$1.intValue())).a(ema.a($$0).a(db.a.a().a(dee.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ejk.a p(cys $$0) {
      return ejk.b().a(ejj.a().a(emu.a(1.0F)).a(ejs.a($$0)));
   }

   public static ejk.a a() {
      return ejk.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<aiy, ejk.a> $$0) {
      this.b();
      Set<aiy> $$1 = new HashSet<>();

      for (cys $$2 : kf.e) {
         if ($$2.a(this.e)) {
            aiy $$3 = $$2.v();
            if ($$3 != eja.a && $$1.add($$3)) {
               ejk.a $$4 = this.f.remove($$3);
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

   protected void b(cys $$0, cys $$1) {
      ejk.a $$2 = c($$0, ejs.a($$0).a(elr.a(ctp.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ejk.a q(cys $$0) {
      return this.a($$0, day.f, dmf.b);
   }

   protected void r(cys $$0) {
      this.a($$0, $$0x -> this.d((cvq)((dbv)$$0x).b()));
   }

   protected void c(cys $$0, cys $$1) {
      this.a($$0, c((cvq)$$1));
   }

   protected void c(cys $$0, cvq $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(cys $$0) {
      this.c($$0, $$0);
   }

   protected void t(cys $$0) {
      this.c($$0, (cvq)$$0);
   }

   protected void a(cys $$0, Function<cys, ejk.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(cys $$0, ejk.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
