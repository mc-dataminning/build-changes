import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fyr {
   private final Long2ObjectMap<fyr.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fyq a(cvr $$0, hz $$1, hz $$2, int $$3) {
      int $$4 = jb.a($$1.u() - $$3);
      int $$5 = jb.a($$1.w() - $$3);
      int $$6 = jb.a($$2.u() + $$3);
      int $$7 = jb.a($$2.w() + $$3);
      fyr.a[][] $$8 = new fyr.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fyr.a)this.a.computeIfAbsent(cuy.c($$9, $$10), $$1x -> new fyr.a($$0.d(cuy.a($$1x), cuy.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fyp[][] $$11 = new fyp[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fyq($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hz $$0, hz $$1, int $$2, int $$3, fyr.a[][] $$4) {
      int $$5 = jb.a($$0.u());
      int $$6 = jb.a($$0.w());
      int $$7 = jb.a($$1.u());
      int $$8 = jb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dnq $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dnq a;
      @Nullable
      private fyp b;

      a(dnq $$0) {
         this.a = $$0;
      }

      public dnq a() {
         return this.a;
      }

      public fyp b() {
         if (this.b == null) {
            this.b = new fyp(this.a);
         }

         return this.b;
      }
   }
}
