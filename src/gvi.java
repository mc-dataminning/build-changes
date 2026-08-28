import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvi {
   private static final int a = 0;
   private final hdl b;
   private final Function<gvi.a, alz> c;
   private final Function<gvi.b, hbe> d;

   public gvi(hdl $$0, hbd $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         alz $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(dfk.d $$0, alz $$1, gca $$2, cxk $$3, Function<alz, glo> $$4, fgl $$5, gle $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null);
   }

   public void a(dfk.d $$0, alz $$1, gca $$2, cxk $$3, Function<alz, glo> $$4, fgl $$5, gle $$6, int $$7, @Nullable alz $$8) {
      List<dfk.c> $$9 = this.b.a($$1).a($$0);
      if (!$$9.isEmpty()) {
         int $$10 = $$3.a(ayd.bR) ? czy.a($$3, 0) : 0;
         boolean $$11 = $$3.B();

         for (dfk.c $$12 : $$9) {
            int $$13 = a($$12, $$10);
            if ($$13 != 0) {
               alz $$14 = $$12.c() && $$8 != null ? $$8 : this.c.apply(new gvi.a($$0, $$12));
               fgp $$15 = gsh.a($$6, $$4.apply($$14), $$11);
               $$2.a($$5, $$15, $$7, hav.d, $$13);
               $$11 = false;
            }
         }

         dfo $$16 = $$3.a(ku.U);
         if ($$16 != null) {
            hbe $$17 = this.d.apply(new gvi.b($$16, $$0, $$1));
            fgp $$18 = $$17.a($$6.getBuffer(glz.a($$16.b().a().d())));
            $$2.a($$5, $$18, $$7, hav.d);
         }
      }
   }

   private static int a(dfk.c $$0, int $$1) {
      Optional<dfk.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(ayp::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(dfk.d a, dfk.c b) {
   }

   static record b(dfo a, dfk.d b, alz c) {
   }
}
