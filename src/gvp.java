import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvp {
   private static final int a = 0;
   private final hds b;
   private final Function<gvp.a, alz> c;
   private final Function<gvp.b, hbl> d;

   public gvp(hds $$0, hbk $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         alz $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(dfs.d $$0, alz $$1, gch $$2, cxp $$3, fgs $$4, gll $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(dfs.d $$0, alz $$1, gch $$2, cxp $$3, fgs $$4, gll $$5, int $$6, @Nullable alz $$7) {
      List<dfs.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(ayd.bR) ? dad.a($$3, 0) : 0;
         boolean $$10 = $$3.B();

         for (dfs.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alz $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gvp.a($$0, $$11));
               fgw $$14 = gso.a($$5, glv.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hbc.d, $$12);
               $$10 = false;
            }
         }

         dfw $$15 = $$3.a(ku.U);
         if ($$15 != null) {
            hbl $$16 = this.d.apply(new gvp.b($$15, $$0, $$1));
            fgw $$17 = $$16.a($$5.getBuffer(gmg.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hbc.d);
         }
      }
   }

   private static int a(dfs.c $$0, int $$1) {
      Optional<dfs.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(ayp::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(dfs.d a, dfs.c b) {
   }

   static record b(dfw a, dfs.d b, alz c) {
   }
}
