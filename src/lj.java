import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class lj implements lm {
   protected static final ent.a a = eoa.a(cc.a.a().a(new bm(cux.v, cm.d.b(1))));
   protected static final ent.a b = a.invert();
   protected static final ent.a c = eoa.a(cc.a.a().a(cqn.rU));
   private static final ent.a h = c.or(a);
   private static final ent.a i = h.invert();
   protected final Set<cqf> d;
   protected final clf e;
   protected final Map<ajh, elc.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lj(Set<cqf> $$0, clf $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lj(Set<cqf> $$0, clf $$1, Map<ajh, elc.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends eme<T>> T a(cwy $$0, eme<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(elv.c()) : $$1.c();
   }

   protected <T extends enm<T>> T a(cwy $$0, enm<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(enp.c()) : $$1.d();
   }

   public elc.a a(cwy $$0) {
      return elc.b().a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$0))));
   }

   private static elc.a a(daa $$0, ent.a $$1, eln.a<?> $$2) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a(elk.a($$0).a($$1).a($$2)));
   }

   protected static elc.a a(daa $$0, eln.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static elc.a b(daa $$0, eln.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static elc.a c(daa $$0, eln.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected elc.a a(daa $$0, cwy $$1) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a($$1)));
   }

   protected elc.a a(cwy $$0, eoo $$1) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a((eln.a<?>)this.a($$0, elk.a($$0).a(ems.a($$1)))));
   }

   protected elc.a a(daa $$0, cwy $$1, eoo $$2) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a($$1).a(ems.a($$2))));
   }

   private static elc.a c(cwy $$0) {
      return elc.b().a(elb.a().a(a).a(eom.a(1.0F)).a(elk.a($$0)));
   }

   private elc.a d(cwy $$0) {
      return elc.b().a(this.a(dac.fR, elb.a().a(eom.a(1.0F)).a(elk.a(dac.fR)))).a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$0))));
   }

   protected elc.a a(daa $$0) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a((eln.a<?>)this.a((cwy)$$0, elk.a($$0).a(ems.a(eom.a(2.0F)).a(ens.a($$0).a(db.a.a().a(dhc.b, doh.c)))))));
   }

   protected <T extends Comparable<T> & axq> elc.a a(daa $$0, doc<T> $$1, T $$2) {
      return elc.b().a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$0).a(ens.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected elc.a b(daa $$0) {
      return elc.b().a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$0).a(elx.a(elx.a.d)))));
   }

   protected elc.a c(daa $$0) {
      return elc.b()
         .a(
            this.a(
               $$0,
               elb.a()
                  .a(eom.a(1.0F))
                  .a(
                     elk.a($$0)
                        .a(elx.a(elx.a.d))
                        .a(
                           ely.a(eof.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(emo.a(dki.x).a(elh.a(dgy.c)))
                  )
            )
         );
   }

   protected elc.a d(daa $$0) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a(cqn.oE).a(ems.a(eor.a(2.0F, 5.0F))).a(elu.a(cux.x))));
   }

   protected elc.a e(daa $$0) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a(cqn.oz).a(ems.a(eor.a(4.0F, 9.0F))).a(elu.a(cux.x))));
   }

   protected elc.a f(daa $$0) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a(cqn.lG).a(ems.a(eor.a(4.0F, 5.0F))).a(elu.b(cux.x))));
   }

   protected elc.a g(daa $$0) {
      return elc.b().a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$0).a(elx.a(elx.a.d)).a(ely.a(eof.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static elc.a h(daa $$0) {
      return elc.b().a(elb.a().a(a).a(eom.a(1.0F)).a(elk.a($$0).a(ely.a(eof.a).a("Bees", "BlockEntityTag.Bees")).a(elw.a($$0).a(czu.c))));
   }

   protected static elc.a i(daa $$0) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a(elk.a($$0).a(a).a(ely.a(eof.a).a("Bees", "BlockEntityTag.Bees")).a(elw.a($$0).a(czu.c)).a(elk.a($$0))));
   }

   protected static elc.a j(daa $$0) {
      return elc.b().a(elb.a().a(elk.a(cqn.wn)).a(ens.a($$0).a(db.a.a().a(daw.r_, true))));
   }

   protected elc.a a(daa $$0, cqf $$1) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a($$1).a(elu.a(cux.x))));
   }

   protected elc.a b(daa $$0, cwy $$1) {
      return a($$0, (eln.a<?>)this.a((cwy)$$0, elk.a($$1).a(ems.a(eor.a(-6.0F, 2.0F))).a(emf.a(ekt.b(0)))));
   }

   protected elc.a k(daa $$0) {
      return b($$0, (eln.a<?>)this.a((cwy)$$0, elk.a(cqn.pu).a(eny.a(0.125F)).a(elu.a(cux.x, 2))));
   }

   public elc.a b(daa $$0, cqf $$1) {
      return elc.b()
         .a(
            this.a(
               $$0,
               elb.a()
                  .a(eom.a(1.0F))
                  .a(elk.a($$1).a(dhv.c.a(), $$1x -> ems.a(eol.a(3, (float)($$1x + 1) / 15.0F)).a(ens.a($$0).a(db.a.a().a(dhv.c, $$1x.intValue())))))
            )
         );
   }

   public elc.a c(daa $$0, cqf $$1) {
      return elc.b().a(this.a($$0, elb.a().a(eom.a(1.0F)).a(elk.a($$1).a(ems.a(eol.a(3, 0.53333336F))))));
   }

   protected static elc.a b(cwy $$0) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a(c).a(elk.a($$0)));
   }

   protected elc.a a(daa $$0, ent.a $$1) {
      return elc.b()
         .a(
            elb.a()
               .a(
                  (eln.a<?>)this.a(
                     (cwy)$$0,
                     elk.a($$0)
                        .a($$1)
                        .a(ih.values(), $$1x -> ems.a(eom.a(1.0F), true).a(ens.a($$0).a(db.a.a().a(dez.b($$1x), true))))
                        .a(ems.a(eom.a(-1.0F), true))
                  )
               )
         );
   }

   protected elc.a a(daa $$0, daa $$1, float... $$2) {
      return c($$0, ((elp.a)this.a((cwy)$$0, elk.a($$1))).a(enj.a(cux.x, $$2)))
         .a(elb.a().a(eom.a(1.0F)).a(i).a(((elp.a)this.a((cwy)$$0, elk.a(cqn.po).a(ems.a(eor.a(1.0F, 2.0F))))).a(enj.a(cux.x, j))));
   }

   protected elc.a b(daa $$0, daa $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(elb.a().a(eom.a(1.0F)).a(i).a(((elp.a)this.a((cwy)$$0, elk.a(cqn.os))).a(enj.a(cux.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected elc.a l(daa $$0) {
      return c($$0, ((elp.a)this.a((cwy)dac.aL, elk.a(cqn.po).a(ems.a(eor.a(1.0F, 2.0F))))).a(enj.a(cux.x, j)));
   }

   protected elc.a a(daa $$0, cqf $$1, cqf $$2, ent.a $$3) {
      return this.a((cwy)$$0, elc.b().a(elb.a().a(elk.a($$1).a($$3).a(elk.a($$2)))).a(elb.a().a($$3).a(elk.a($$2).a(elu.a(cux.x, 0.5714286F, 3)))));
   }

   protected static elc.a m(daa $$0) {
      return elc.b().a(elb.a().a(c).a(elk.a($$0).a(ems.a(eom.a(2.0F)))));
   }

   protected elc.a a(daa $$0, daa $$1) {
      eln.a<?> $$2 = elk.a($$1).a(ems.a(eom.a(2.0F))).a(c).a(((elp.a)this.a((cwy)$$0, elk.a(cqn.pu))).a(eny.a(0.125F)));
      return elc.b()
         .a(elb.a().a($$2).a(ens.a($$0).a(db.a.a().a(dci.b, dnv.b))).a(enr.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dci.b, dnv.a))), new ib(0, 1, 0))))
         .a(elb.a().a($$2).a(ens.a($$0).a(db.a.a().a(dci.b, dnv.a))).a(enr.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dci.b, dnv.b))), new ib(0, -1, 0))));
   }

   protected elc.a n(daa $$0) {
      return elc.b()
         .a(
            elb.a()
               .a(eom.a(1.0F))
               .a(
                  (eln.a<?>)this.a(
                     $$0, elk.a($$0).a(List.of(2, 3, 4), $$1 -> ems.a(eom.a((float)$$1.intValue())).a(ens.a($$0).a(db.a.a().a(dap.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected elc.a o(daa $$0) {
      return elc.b()
         .a(
            elb.a()
               .a(eom.a(1.0F))
               .a(
                  (eln.a<?>)this.a(
                     $$0,
                     elk.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ems.a(eom.a((float)$$1.intValue())).a(ens.a($$0).a(db.a.a().a(dfm.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static elc.a p(daa $$0) {
      return elc.b().a(elb.a().a(eom.a(1.0F)).a(elk.a($$0)));
   }

   public static elc.a a() {
      return elc.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ajh, elc.a> $$0) {
      this.b();
      Set<ajh> $$1 = new HashSet<>();

      for (daa $$2 : ki.e) {
         if ($$2.a(this.e)) {
            ajh $$3 = $$2.v();
            if ($$3 != eks.a && $$1.add($$3)) {
               elc.a $$4 = this.f.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, ki.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.f.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
      }
   }

   protected void b(daa $$0, daa $$1) {
      elc.a $$2 = c($$0, elk.a($$0).a(enj.a(cux.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected elc.a q(daa $$0) {
      return this.a($$0, dcg.f, dnv.b);
   }

   protected void r(daa $$0) {
      this.a($$0, $$0x -> this.d((cwy)((ddd)$$0x).b()));
   }

   protected void c(daa $$0, daa $$1) {
      this.a($$0, c((cwy)$$1));
   }

   protected void c(daa $$0, cwy $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(daa $$0) {
      this.c($$0, $$0);
   }

   protected void t(daa $$0) {
      this.c($$0, (cwy)$$0);
   }

   protected void a(daa $$0, Function<daa, elc.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(daa $$0, elc.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
