import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gtj {
   private static final int a = 0;
   private final hbl b;
   private final Function<gtj.a, alj> c;
   private final Function<gtj.b, gze> d;

   public gtj(hbl $$0, gzd $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         alj $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(ddw.d $$0, alj $$1, gae $$2, cwm $$3, Function<alj, gjq> $$4, fer $$5, gjg $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null);
   }

   public void a(ddw.d $$0, alj $$1, gae $$2, cwm $$3, Function<alj, gjq> $$4, fer $$5, gjg $$6, int $$7, @Nullable alj $$8) {
      List<ddw.c> $$9 = this.b.a($$1).a($$0);
      if (!$$9.isEmpty()) {
         int $$10 = $$3.a(axl.bQ) ? cza.a($$3, 0) : 0;
         boolean $$11 = $$3.B();

         for (ddw.c $$12 : $$9) {
            int $$13 = a($$12, $$10);
            if ($$13 != 0) {
               alj $$14 = $$12.c() && $$8 != null ? $$8 : this.c.apply(new gtj.a($$0, $$12));
               fev $$15 = gqi.a($$6, $$4.apply($$14), $$11);
               $$2.a($$5, $$15, $$7, gyv.d, $$13);
               $$11 = false;
            }
         }

         dea $$16 = $$3.a(ku.U);
         if ($$16 != null) {
            gze $$17 = this.d.apply(new gtj.b($$16, $$0, $$1));
            fev $$18 = $$17.a($$6.getBuffer(gkb.a($$16.b().a().d())));
            $$2.a($$5, $$18, $$7, gyv.d);
         }
      }
   }

   private static int a(ddw.c $$0, int $$1) {
      Optional<ddw.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axx::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(ddw.d a, ddw.c b) {
   }

   static record b(dea a, ddw.d b, alj c) {
   }
}
