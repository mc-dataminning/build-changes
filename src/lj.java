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
   protected static final env.a a = eoc.a(cc.a.a().a(new bm(cuz.v, cm.d.b(1))));
   protected static final env.a b = a.invert();
   protected static final env.a c = eoc.a(cc.a.a().a(cqp.rU));
   private static final env.a h = c.or(a);
   private static final env.a i = h.invert();
   protected final Set<cqh> d;
   protected final clh e;
   protected final Map<ajh, ele.a> f;
   protected static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] j = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected lj(Set<cqh> $$0, clh $$1) {
      this($$0, $$1, new HashMap<>());
   }

   protected lj(Set<cqh> $$0, clh $$1, Map<ajh, ele.a> $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected <T extends emg<T>> T a(cxa $$0, emg<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(elx.c()) : $$1.c();
   }

   protected <T extends eno<T>> T a(cxa $$0, eno<T> $$1) {
      return !this.d.contains($$0.l()) ? $$1.b(enr.c()) : $$1.d();
   }

   public ele.a a(cxa $$0) {
      return ele.b().a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$0))));
   }

   private static ele.a a(dac $$0, env.a $$1, elp.a<?> $$2) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a(elm.a($$0).a($$1).a($$2)));
   }

   protected static ele.a a(dac $$0, elp.a<?> $$1) {
      return a($$0, a, $$1);
   }

   protected static ele.a b(dac $$0, elp.a<?> $$1) {
      return a($$0, c, $$1);
   }

   protected static ele.a c(dac $$0, elp.a<?> $$1) {
      return a($$0, h, $$1);
   }

   protected ele.a a(dac $$0, cxa $$1) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a($$1)));
   }

   protected ele.a a(cxa $$0, eoq $$1) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a((elp.a<?>)this.a($$0, elm.a($$0).a(emu.a($$1)))));
   }

   protected ele.a a(dac $$0, cxa $$1, eoq $$2) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a($$1).a(emu.a($$2))));
   }

   private static ele.a c(cxa $$0) {
      return ele.b().a(eld.a().a(a).a(eoo.a(1.0F)).a(elm.a($$0)));
   }

   private ele.a d(cxa $$0) {
      return ele.b().a(this.a(dae.fR, eld.a().a(eoo.a(1.0F)).a(elm.a(dae.fR)))).a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$0))));
   }

   protected ele.a a(dac $$0) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a((elp.a<?>)this.a((cxa)$$0, elm.a($$0).a(emu.a(eoo.a(2.0F)).a(enu.a($$0).a(db.a.a().a(dhe.b, doj.c)))))));
   }

   protected <T extends Comparable<T> & axq> ele.a a(dac $$0, doe<T> $$1, T $$2) {
      return ele.b().a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$0).a(enu.a($$0).a(db.a.a().a($$1, $$2))))));
   }

   protected ele.a b(dac $$0) {
      return ele.b().a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$0).a(elz.a(elz.a.d)))));
   }

   protected ele.a c(dac $$0) {
      return ele.b()
         .a(
            this.a(
               $$0,
               eld.a()
                  .a(eoo.a(1.0F))
                  .a(
                     elm.a($$0)
                        .a(elz.a(elz.a.d))
                        .a(
                           ema.a(eoh.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(emq.a(dkk.x).a(elj.a(dha.c)))
                  )
            )
         );
   }

   protected ele.a d(dac $$0) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a(cqp.oE).a(emu.a(eot.a(2.0F, 5.0F))).a(elw.a(cuz.x))));
   }

   protected ele.a e(dac $$0) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a(cqp.oz).a(emu.a(eot.a(4.0F, 9.0F))).a(elw.a(cuz.x))));
   }

   protected ele.a f(dac $$0) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a(cqp.lG).a(emu.a(eot.a(4.0F, 5.0F))).a(elw.b(cuz.x))));
   }

   protected ele.a g(dac $$0) {
      return ele.b().a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$0).a(elz.a(elz.a.d)).a(ema.a(eoh.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   protected static ele.a h(dac $$0) {
      return ele.b().a(eld.a().a(a).a(eoo.a(1.0F)).a(elm.a($$0).a(ema.a(eoh.a).a("Bees", "BlockEntityTag.Bees")).a(ely.a($$0).a(czw.c))));
   }

   protected static ele.a i(dac $$0) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a(elm.a($$0).a(a).a(ema.a(eoh.a).a("Bees", "BlockEntityTag.Bees")).a(ely.a($$0).a(czw.c)).a(elm.a($$0))));
   }

   protected static ele.a j(dac $$0) {
      return ele.b().a(eld.a().a(elm.a(cqp.wo)).a(enu.a($$0).a(db.a.a().a(day.r_, true))));
   }

   protected ele.a a(dac $$0, cqh $$1) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a($$1).a(elw.a(cuz.x))));
   }

   protected ele.a b(dac $$0, cxa $$1) {
      return a($$0, (elp.a<?>)this.a((cxa)$$0, elm.a($$1).a(emu.a(eot.a(-6.0F, 2.0F))).a(emh.a(ekv.b(0)))));
   }

   protected ele.a k(dac $$0) {
      return b($$0, (elp.a<?>)this.a((cxa)$$0, elm.a(cqp.pu).a(eoa.a(0.125F)).a(elw.a(cuz.x, 2))));
   }

   public ele.a b(dac $$0, cqh $$1) {
      return ele.b()
         .a(
            this.a(
               $$0,
               eld.a()
                  .a(eoo.a(1.0F))
                  .a(elm.a($$1).a(dhx.c.a(), $$1x -> emu.a(eon.a(3, (float)($$1x + 1) / 15.0F)).a(enu.a($$0).a(db.a.a().a(dhx.c, $$1x.intValue())))))
            )
         );
   }

   public ele.a c(dac $$0, cqh $$1) {
      return ele.b().a(this.a($$0, eld.a().a(eoo.a(1.0F)).a(elm.a($$1).a(emu.a(eon.a(3, 0.53333336F))))));
   }

   protected static ele.a b(cxa $$0) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a(c).a(elm.a($$0)));
   }

   protected ele.a a(dac $$0, env.a $$1) {
      return ele.b()
         .a(
            eld.a()
               .a(
                  (elp.a<?>)this.a(
                     (cxa)$$0,
                     elm.a($$0)
                        .a($$1)
                        .a(ih.values(), $$1x -> emu.a(eoo.a(1.0F), true).a(enu.a($$0).a(db.a.a().a(dfb.b($$1x), true))))
                        .a(emu.a(eoo.a(-1.0F), true))
                  )
               )
         );
   }

   protected ele.a a(dac $$0, dac $$1, float... $$2) {
      return c($$0, ((elr.a)this.a((cxa)$$0, elm.a($$1))).a(enl.a(cuz.x, $$2)))
         .a(eld.a().a(eoo.a(1.0F)).a(i).a(((elr.a)this.a((cxa)$$0, elm.a(cqp.po).a(emu.a(eot.a(1.0F, 2.0F))))).a(enl.a(cuz.x, j))));
   }

   protected ele.a b(dac $$0, dac $$1, float... $$2) {
      return this.a($$0, $$1, $$2)
         .a(eld.a().a(eoo.a(1.0F)).a(i).a(((elr.a)this.a((cxa)$$0, elm.a(cqp.os))).a(enl.a(cuz.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   protected ele.a l(dac $$0) {
      return c($$0, ((elr.a)this.a((cxa)dae.aL, elm.a(cqp.po).a(emu.a(eot.a(1.0F, 2.0F))))).a(enl.a(cuz.x, j)));
   }

   protected ele.a a(dac $$0, cqh $$1, cqh $$2, env.a $$3) {
      return this.a((cxa)$$0, ele.b().a(eld.a().a(elm.a($$1).a($$3).a(elm.a($$2)))).a(eld.a().a($$3).a(elm.a($$2).a(elw.a(cuz.x, 0.5714286F, 3)))));
   }

   protected static ele.a m(dac $$0) {
      return ele.b().a(eld.a().a(c).a(elm.a($$0).a(emu.a(eoo.a(2.0F)))));
   }

   protected ele.a a(dac $$0, dac $$1) {
      elp.a<?> $$2 = elm.a($$1).a(emu.a(eoo.a(2.0F))).a(c).a(((elr.a)this.a((cxa)$$0, elm.a(cqp.pu))).a(eoa.a(0.125F)));
      return ele.b()
         .a(eld.a().a($$2).a(enu.a($$0).a(db.a.a().a(dck.b, dnx.b))).a(ent.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dck.b, dnx.a))), new ib(0, 1, 0))))
         .a(eld.a().a($$2).a(enu.a($$0).a(db.a.a().a(dck.b, dnx.a))).a(ent.a(ck.a.a().a(av.a.a().a($$0).a(db.a.a().a(dck.b, dnx.b))), new ib(0, -1, 0))));
   }

   protected ele.a n(dac $$0) {
      return ele.b()
         .a(
            eld.a()
               .a(eoo.a(1.0F))
               .a(
                  (elp.a<?>)this.a(
                     $$0, elm.a($$0).a(List.of(2, 3, 4), $$1 -> emu.a(eoo.a((float)$$1.intValue())).a(enu.a($$0).a(db.a.a().a(dar.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected ele.a o(dac $$0) {
      return ele.b()
         .a(
            eld.a()
               .a(eoo.a(1.0F))
               .a(
                  (elp.a<?>)this.a(
                     $$0,
                     elm.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> emu.a(eoo.a((float)$$1.intValue())).a(enu.a($$0).a(db.a.a().a(dfo.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static ele.a p(dac $$0) {
      return ele.b().a(eld.a().a(eoo.a(1.0F)).a(elm.a($$0)));
   }

   public static ele.a a() {
      return ele.b();
   }

   protected abstract void b();

   @Override
   public void generate(BiConsumer<ajh, ele.a> $$0) {
      this.b();
      Set<ajh> $$1 = new HashSet<>();

      for (dac $$2 : ki.e) {
         if ($$2.a(this.e)) {
            ajh $$3 = $$2.v();
            if ($$3 != eku.a && $$1.add($$3)) {
               ele.a $$4 = this.f.remove($$3);
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

   protected void b(dac $$0, dac $$1) {
      ele.a $$2 = c($$0, elm.a($$0).a(enl.a(cuz.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   protected ele.a q(dac $$0) {
      return this.a($$0, dci.f, dnx.b);
   }

   protected void r(dac $$0) {
      this.a($$0, $$0x -> this.d((cxa)((ddf)$$0x).b()));
   }

   protected void c(dac $$0, dac $$1) {
      this.a($$0, c((cxa)$$1));
   }

   protected void c(dac $$0, cxa $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dac $$0) {
      this.c($$0, $$0);
   }

   protected void t(dac $$0) {
      this.c($$0, (cxa)$$0);
   }

   protected void a(dac $$0, Function<dac, ele.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dac $$0, ele.a $$1) {
      this.f.put($$0.v(), $$1);
   }
}
