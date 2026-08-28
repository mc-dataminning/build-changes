import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvn {
   private static final int a = 0;
   private final hdq b;
   private final Function<gvn.a, alz> c;
   private final Function<gvn.b, hbj> d;

   public gvn(hdq $$0, hbi $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         alz $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(dfr.d $$0, alz $$1, gcf $$2, cxo $$3, fgq $$4, glj $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(dfr.d $$0, alz $$1, gcf $$2, cxo $$3, fgq $$4, glj $$5, int $$6, @Nullable alz $$7) {
      List<dfr.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(ayd.bR) ? dac.a($$3, 0) : 0;
         boolean $$10 = $$3.B();

         for (dfr.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alz $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gvn.a($$0, $$11));
               fgu $$14 = gsm.a($$5, glt.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hba.d, $$12);
               $$10 = false;
            }
         }

         dfv $$15 = $$3.a(ku.U);
         if ($$15 != null) {
            hbj $$16 = this.d.apply(new gvn.b($$15, $$0, $$1));
            fgu $$17 = $$16.a($$5.getBuffer(gme.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hba.d);
         }
      }
   }

   private static int a(dfr.c $$0, int $$1) {
      Optional<dfr.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(ayp::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(dfr.d a, dfr.c b) {
   }

   static record b(dfv a, dfr.d b, alz c) {
   }
}
