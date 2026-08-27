import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fvg {
   private final Long2ObjectMap<fvg.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fvf a(csy $$0, hv $$1, hv $$2, int $$3) {
      int $$4 = ix.a($$1.u() - $$3);
      int $$5 = ix.a($$1.w() - $$3);
      int $$6 = ix.a($$2.u() + $$3);
      int $$7 = ix.a($$2.w() + $$3);
      fvg.a[][] $$8 = new fvg.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fvg.a)this.a.computeIfAbsent(csf.c($$9, $$10), $$1x -> new fvg.a($$0.d(csf.a($$1x), csf.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fve[][] $$11 = new fve[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fvf($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hv $$0, hv $$1, int $$2, int $$3, fvg.a[][] $$4) {
      int $$5 = ix.a($$0.u());
      int $$6 = ix.a($$0.w());
      int $$7 = ix.a($$1.u());
      int $$8 = ix.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dkw $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dkw a;
      @Nullable
      private fve b;

      a(dkw $$0) {
         this.a = $$0;
      }

      public dkw a() {
         return this.a;
      }

      public fve b() {
         if (this.b == null) {
            this.b = new fve(this.a);
         }

         return this.b;
      }
   }
}
