import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class li implements ll {
   protected static final emx.a a = ene.a(cc.a.a().a(new bm(cuc.v, cm.d.b(1))));
   protected static final emx.a b = a.invert();
   protected static final emx.a c = ene.a(cc.a.a().a(cpt.rU));
   private static final emx.a h = c.or(a);
   private static final emx.a i = h.invert();
   protected final Set<cpl> d;
   protected final ckl e;
   protected final Map<ajc, ekg.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected li(Set<cpl> $$0, ckl $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected li(Set<cpl> $$0, ckl $$1, Map<ajc, ekg.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eli<T>> T a(cwd $$0, eli<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(ekz.c()) : $$1.c();
   }

   protected <T extends emq<T>> T a(cwd $$0, emq<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(emt.c()) : $$1.d();
   }

   public ekg.a a(cwd $$0) {
      return ekg.b().a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$0))));
   }

   private static ekg.a a(czf $$0, emx.a $$1, ekr.a<?> $$2) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a(eko.a($$0).a($$1).a($$2)));
   }

   protected static ekg.a a(czf $$0, ekr.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ekg.a b(czf $$0, ekr.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ekg.a c(czf $$0, ekr.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ekg.a a(czf $$0, cwd $$1) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a($$1)));
   }

   protected ekg.a a(cwd $$0, ens $$1) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a((ekr.a<?>)this.a($$0, eko.a($$0).a(elw.a($$1)))));
   }

   protected ekg.a a(czf $$0, cwd $$1, ens $$2) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a($$1).a(elw.a($$2))));
   }

   private static ekg.a c(cwd $$0) {
      return ekg.b().a(ekf.a().a(a).a(enq.a(1.0F)).a(eko.a($$0)));
   }

   private ekg.a d(cwd $$0) {
      return ekg.b().a(this.a(czh.fR, ekf.a().a(enq.a(1.0F)).a(eko.a(czh.fR)))).a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$0))));
   }

   protected ekg.a a(czf $$0) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a((ekr.a<?>)this.a((cwd)$$0, eko.a($$0).a(elw.a(enq.a(2.0F)).a(emw.a($$0).a(db.a.a().a(dgh.b, dnm.c)))))));
   }

   protected <T extends Comparable<T> & axg> ekg.a a(czf $$0, dnh<T> $$1, T $$2) {
      return ekg.b().a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$0).a(emw.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected ekg.a b(czf $$0) {
      return ekg.b().a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$0).a(elb.a(elb.a.d)))));
   }

   protected ekg.a c(czf $$0) {
      return ekg.b()
         .a(
            this.a(
               $$0,
               ekf.a()
                  .a(enq.a(1.0F))
                  .a(
                     eko.a($$0)
                        .a(elb.a(elb.a.d))
                        .a(
                           elc.a(enj.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(els.a(djn.x).a(ekl.a(dgd.c)))
                  )
            )
         );
   }

   protected ekg.a d(czf $$0) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a(cpt.oE).a(elw.a(env.a(2.0F, 5.0F))).a(eky.a(cuc.x))));
   }

   protected ekg.a e(czf $$0) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a(cpt.oz).a(elw.a(env.a(4.0F, 9.0F))).a(eky.a(cuc.x))));
   }

   protected ekg.a f(czf $$0) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a(cpt.lG).a(elw.a(env.a(4.0F, 5.0F))).a(eky.b(cuc.x))));
   }

   protected ekg.a g(czf $$0) {
      return ekg.b().a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$0).a(elb.a(elb.a.d)).a(elc.a(enj.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ekg.a h(czf $$0) {
      return ekg.b().a(ekf.a().a(a).a(enq.a(1.0F)).a(eko.a($$0).a(elc.a(enj.a).a("Bees", "BlockEntityTag.Bees")).a(ela.a($$0).a(cyz.c))));
   }

   protected static ekg.a i(czf $$0) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a(eko.a($$0).a(a).a(elc.a(enj.a).a("Bees", "BlockEntityTag.Bees")).a(ela.a($$0).a(cyz.c)).a(eko.a($$0))));
   }

   protected static ekg.a j(czf $$0) {
      return ekg.b().a(ekf.a().a(eko.a(cpt.wm)).a(emw.a($$0).a(db.a.a().a(dab.r_, true))));
   }

   protected ekg.a a(czf $$0, cpl $$1) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a($$1).a(eky.a(cuc.x))));
   }

   protected ekg.a b(czf $$0, cwd $$1) {
      return a($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a($$1).a(elw.a(env.a(-6.0F, 2.0F))).a(elj.a(ejx.b(0)))));
   }

   protected ekg.a k(czf $$0) {
      return b($$0, (ekr.a<?>)this.a((cwd)$$0, eko.a(cpt.pu).a(enc.a(0.125F)).a(eky.a(cuc.x, 2))));
   }

   public ekg.a b(czf $$0, cpl $$1) {
      return ekg.b()
         .a(
            this.a(
               $$0,
               ekf.a()
                  .a(enq.a(1.0F))
                  .a(eko.a($$1).a(dha.c.a(), $$1x -> elw.a(enp.a(3, (float)($$1x + 1) / 15.0F)).a(emw.a($$0).a(db.a.a().a(dha.c, $$1x.intValue())))))
            )
         );
   }

   public ekg.a c(czf $$0, cpl $$1) {
      return ekg.b().a(this.a($$0, ekf.a().a(enq.a(1.0F)).a(eko.a($$1).a(elw.a(enp.a(3, 0.53333336F))))));
   }

   protected static ekg.a b(cwd $$0) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a(c).a(eko.a($$0)));
   }

   protected ekg.a a(czf $$0, emx.a $$1) {
      return ekg.b()
         .a(
            ekf.a()
               .a(
                  (ekr.a<?>)this.a(
                     (cwd)$$0,
                     eko.a($$0)
                        .a($$1)
                        .a(ih.values(), $$1x -> elw.a(enq.a(1.0F), true).a(emw.a($$0).a(db.a.a().a(dee.b($$1x), true))))
                        .a(elw.a(enq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ekg.a a(czf $$0, czf $$1, float... $$2) {
      return c($$0, ((ekt.a)this.a((cwd)$$0, eko.a($$1))).a(emn.a(cuc.x, $$2)))
         .a(ekf.a().a(enq.a(1.0F)).a(i).a(((ekt.a)this.a((cwd)$$0, eko.a(cpt.po).a(elw.a(env.a(1.0F, 2.0F))))).a(emn.a(cuc.x, j))));
   }

   protected ekg.a b(czf $$0, czf $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(ekf.a().a(enq.a(1.0F)).a(i).a(((ekt.a)this.a((cwd)$$0, eko.a(cpt.os))).a(emn.a(cuc.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ekg.a l(czf $$0) {
      return c($$0, ((ekt.a)this.a((cwd)czh.aL, eko.a(cpt.po).a(elw.a(env.a(1.0F, 2.0F))))).a(emn.a(cuc.x, j)));
   }

   protected ekg.a a(czf $$0, cpl $$1, cpl $$2, emx.a $$3) {
      return this.a((cwd)$$0, ekg.b().a(ekf.a().a(eko.a($$1).a($$3).a(eko.a($$2)))).a(ekf.a().a($$3).a(eko.a($$2).a(eky.a(cuc.x, 0.5714286F, 3)))));
   }

   protected static ekg.a m(czf $$0) {
      return ekg.b().a(ekf.a().a(c).a(eko.a($$0).a(elw.a(enq.a(2.0F)))));
   }

   protected ekg.a a(czf $$0, czf $$1) {
      ekr.a<?> $$2 = eko.a($$1).a(elw.a(enq.a(2.0F))).a(c).a(((ekt.a)this.a((cwd)$$0, eko.a(cpt.pu))).a(enc.a(0.125F)));
      return ekg.b()
         .a(ekf.a().a($$2).a(emw.a($$0).a(db.a.a().a(dbn.b, dna.b))).a(emv.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dbn.b, dna.a))), new ib(0, 1, 0))))
         .a(ekf.a().a($$2).a(emw.a($$0).a(db.a.a().a(dbn.b, dna.a))).a(emv.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dbn.b, dna.b))), new ib(0, -1, 0))));
   }

   protected ekg.a n(czf $$0) {
      return ekg.b()
         .a(
            ekf.a()
               .a(enq.a(1.0F))
               .a(
                  (ekr.a<?>)this.a(
                     $$0, eko.a($$0).a(List.of(2, 3, 4), $$1 -> elw.a(enq.a((float)$$1.intValue())).a(emw.a($$0).a(db.a.a().a(czu.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ekg.a o(czf $$0) {
      return ekg.b()
         .a(
            ekf.a()
               .a(enq.a(1.0F))
               .a(
                  (ekr.a<?>)this.a(
                     $$0,
                     eko.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> elw.a(enq.a((float)$$1.intValue())).a(emw.a($$0).a(db.a.a().a(der.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ekg.a p(czf $$0) {
      return ekg.b().a(ekf.a().a(enq.a(1.0F)).a(eko.a($$0)));
   }

   public static ekg.a a() {
      return ekg.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ajc, ekg.a> $$0) {
      this.b();
      Set<ajc> $$1 = new HashSet<>();

      for (czf $$2 : kh.e) {
         if ($$2.a(this.e)) {
            ajc $$3 = $$2.v();
            if ($$3 != ejw.a && $$1.add($$3)) {
               ekg.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, kh.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(czf $$0, czf $$1) {
      ekg.a $$2 = c($$0, eko.a($$0).a(emn.a(cuc.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ekg.a q(czf $$0) {
      return this.a($$0, dbl.f, dna.b);
   }

   protected void r(czf $$0) {
      this.a($$0, $$0x -> this.d((cwd)((dci)$$0x).b()));
   }

   protected void c(czf $$0, czf $$1) {
      this.a($$0, c((cwd)$$1));
   }

   protected void c(czf $$0, cwd $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(czf $$0) {
      this.c($$0, $$0);
   }

   protected void t(czf $$0) {
      this.c($$0, (cwd)$$0);
   }

   protected void a(czf $$0, Function<czf, ekg.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(czf $$0, ekg.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
