import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fyj {
   private final Long2ObjectMap<fyj.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fyi a(cvn $$0, hz $$1, hz $$2, int $$3) {
      int $$4 = jb.a($$1.u() - $$3);
      int $$5 = jb.a($$1.w() - $$3);
      int $$6 = jb.a($$2.u() + $$3);
      int $$7 = jb.a($$2.w() + $$3);
      fyj.a[][] $$8 = new fyj.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fyj.a)this.a.computeIfAbsent(cuu.c($$9, $$10), $$1x -> new fyj.a($$0.d(cuu.a($$1x), cuu.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fyh[][] $$11 = new fyh[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fyi($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hz $$0, hz $$1, int $$2, int $$3, fyj.a[][] $$4) {
      int $$5 = jb.a($$0.u());
      int $$6 = jb.a($$0.w());
      int $$7 = jb.a($$1.u());
      int $$8 = jb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dnm $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dnm a;
      @Nullable
      private fyh b;

      a(dnm $$0) {
         this.a = $$0;
      }

      public dnm a() {
         return this.a;
      }

      public fyh b() {
         if (this.b == null) {
            this.b = new fyh(this.a);
         }

         return this.b;
      }
   }
}
